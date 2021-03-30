# Wildfly examples
Wildfly Application Server: selected feature examples from https://github.com/wildfly/quickstart repository

## 1. **/helloword**

Basic servlet and a simple CDI service. 

    http://localhost:8080/helloworld-singleton/

## 2. **/helloworld-singleton**

Basic singleton EJB demonstration. After start application:

    http://localhost:8080/helloworld-singleton/

## 3. **/helloworld-ws**

Basic SOAP web service, with arquillian tests. 

To launch arquillian test: 

    "<MAVEN_DIR>/bin/mvn.cmd" verify -Parq-managed -f "<PROJECT_DIR>/helloworld-ws\pom.xml"

Remarks:

* In the case of any errors run **clean:clean** to empty **/target** folder
* After cleaning, run **wildfly:start** first

## 4. **/helloworld-rs**

Basic JAX-RS example. After deployment, launch:

    http://localhost:8080/helloworld-rs/

## 5. **/helloworld-mdb**

Basic message driven bean example. Wildfly restart required, because wildfly uses full configuration with HornetMQ service.

    http://localhost:8080/helloworld-mdb/

