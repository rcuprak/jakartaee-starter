# jakartaee-starter
This is a JakartaEE 10 "starter project" to help you start developing your own Jakarta EE 10 application.

This starter application has the following features:
 * Payara 6
 * Maven based
 * Java 21
 * Sample JSF page
 * Sample CDI bean and test
 * Arquillian integration tests
 * JUnit 5
 
 Since this is a Maven based project, you can easily open it using IntelliJ or NetBeans.
 
 ## Setup
 
This project uses [Maven toolchain](https://maven.apache.org/guides/mini/guide-using-toolchains.html "Maven Toolchain"). 

In ~/.m2/toolchain.xml make sure you have a Java 21 JVM defined that matches the configuration in the pom.xml.

```
  <toolchain>
    <type>jdk</type>
    <provides>
      <version>21</version>
      <vendor>zulu</vendor>
    </provides>
    <configuration>
      <jdkHome>path to java 21</jdkHome>
    </configuration>
  </toolchain>
```

## Building & Running

To build this project:
* For Java 21: \
````
  export JAVA_TOOL_OPTIONS="-Djdk.util.zip.disableZip64ExtraFieldValidation=true \
  -Djdk.attach.allowAttachSelf=true \
  --add-opens=java.base/java.io=ALL-UNNAMED \
  --add-opens=java.base/sun.net.www.protocol.jar=ALL-UNNAMED \
  --add-opens=java.base/java.net=ALL-UNNAMED \
  --add-opens=java.naming/javax.naming.spi=ALL-UNNAMED \
  --add-opens=java.base/java.lang=ALL-UNNAMED"
 ````
* mvn package 
* cd target/
* If you are using Payara 6:
  * asadmin start-domain domain1 (default server non-production server configuration)
  * asadmin deploy starter-1.1.war (then goto https://localhost:8080/)
  * In your web browser: https://localhost:8080/starter



 
