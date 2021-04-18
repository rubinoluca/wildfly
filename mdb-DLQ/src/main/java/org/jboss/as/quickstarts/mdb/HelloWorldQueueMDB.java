package org.jboss.as.quickstarts.mdb;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.annotation.Resource;
import javax.ejb.MessageDrivenContext;

/**
 * <p>
 * A simple Message Driven Bean that asynchronously receives and processes the
 * messages that are sent to the queue.
 * </p>
 *
 * @author Serge Pagop (spagop@redhat.com)
 */
@MessageDriven(name = "HelloWorldQueueMDB", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/HELLOWORLDMDBQueue"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class HelloWorldQueueMDB implements MessageListener {

    private static final Logger LOGGER = Logger.getLogger(HelloWorldQueueMDB.class.toString());

    @Resource
    MessageDrivenContext ctx;

    /**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message rcvMessage) {
        TextMessage msg = null;
        if (rcvMessage instanceof TextMessage) {
            msg = (TextMessage) rcvMessage;
            // mesterségesen szimuláljuk, hogy a kézbesítés nem történt meg
            ctx.setRollbackOnly();
        } else {
            LOGGER.warning("Message of wrong type: " + rcvMessage.getClass().getName());
        }
    }
}
