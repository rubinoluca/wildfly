# wildfly-examples
Wildfly application server feature examples

**/helloword**

Basic servlet and a simple CDI service. 

**/helloworld-ws**

Basic SOAP web service. To launch arquillian test: 

    "<MAVEN_DIR>/bin/mvn.cmd" verify -Parq-managed -f "<PROJECT_DIR>/helloworld-ws\pom.xml"

**/helloworld-singleton**

Basic singleton EJB demonstration. After start application:

http://localhost:8080/helloworld-singleton/

