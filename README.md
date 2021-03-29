# wildfly-examples
Wildfly Application Server: selected feature examples from https://github.com/wildfly/quickstart

**/helloword**

Basic servlet and a simple CDI service. 

**/helloworld-singleton**

Basic singleton EJB demonstration. After start application:

http://localhost:8080/helloworld-singleton/

**/helloworld-ws**

Basic SOAP web service. To launch arquillian test: 

    "<MAVEN_DIR>/bin/mvn.cmd" verify -Parq-managed -f "<PROJECT_DIR>/helloworld-ws\pom.xml"

**/helloworld-rs**

Basic JAX-RS example. After deployment, launch:

    http://localhost:8080/helloworld-rs/

**/helloworld-mdb**

Basic message driven bean example. Wildfly restart required, because wildfly uses full configuration with HornetMQ service.

   http://localhost:8080/helloworld-mdb/