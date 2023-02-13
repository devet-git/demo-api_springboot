<details>
<summary style="font-size: 27px">Basic knowledge about create API using Spring Boot</summary>
</details>

<details>
<summary style="font-size: 27px">Setup Java Spring Boot for Windows</summary>

### Require: 
1. JDK
2. A code editor

## Connect Java SpringBoot app to mysql server

- Download [MySql Connector Java](https://dev.mysql.com/downloads/connector/j/)
- In pom.xml file(if we use Maven) add following dependencies
```xml
<dependencies>
    ......
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
</dependencies>
```
</details>
