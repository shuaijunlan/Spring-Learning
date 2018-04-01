## 基于Spring实现事务

> 在写事务Demo的时候，遇到了问题，我一开始使用第一种方式去实现事务，但是一直不能成功，后来查阅了资料使用第二种方式实现事务，可以成功实现事务。

#### 第一种实现方式

> 到目前为止还不知道为什么不能成功，欢迎各位读者指导

**spring.xml**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:tx="http://www.springframework.org/schema/tx"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
         http://www.springframework.org/schema/beans/spring-beans.xsd
         http://www.springframework.org/schema/context
         http://www.springframework.org/schema/context/spring-context.xsd
         http://www.springframework.org/schema/tx
         http://www.springframework.org/schema/tx/spring-tx.xsd">
    <!-- config data source -->
    <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
        <property name="driverClassName" value="com.mysql.jdbc.Driver" />
        <property name="url" value="jdbc:mysql://139.199.210.120:3306/spring_learning" />
        <property name="username" value="spring" />
        <property name="password" value="123456" />
    </bean>

    <bean id="appTransactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <property name="dataSource" ref="dataSource" />
    </bean>
    <context:component-scan base-package="cn.shuaijunlan.spring"/>
    <tx:annotation-driven proxy-target-class="true" transaction-manager="appTransactionManager" />
</beans>
```

**TransactionalTest.java**

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 18:28 2018/3/31.
 */
@Component

public class TransactionalTest {

    @Autowired
    private DataSource dataSource;

    @Transactional(rollbackFor=Exception.class,propagation = Propagation.REQUIRED)
    public void testOne(){
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("UPDATE spring_test set value = 33 WHERE id = 2");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new NullPointerException();
    }
}

```



#### 第二种实现方式

> 使用了JdbcTemplate，可以成功实现事务

**spring.xml**

```xml
<!-- config data source -->
<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
    <property name="driverClassName" value="com.mysql.jdbc.Driver" />
    <property name="url" value="jdbc:mysql://139.199.210.120:3306/spring_learning" />
    <property name="username" value="spring" />
    <property name="password" value="123456" />
</bean>

<bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">
    <property name="dataSource" ref="dataSource"/>
</bean>

<bean id="appTransactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
    <property name="dataSource" ref="dataSource" />
</bean>
<context:component-scan base-package="cn.shuaijunlan.spring"/>
<tx:annotation-driven proxy-target-class="true" transaction-manager="appTransactionManager" />
```

**TransactionalTest.java**

```java
/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 18:28 2018/3/31.
 */
@Component

public class TransactionalTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(rollbackFor=Exception.class,propagation = Propagation.REQUIRED)
    public void testTwo(){
        String sql = "update spring_test set value = 13131 where id = 2";
        jdbcTemplate.update(sql);
        throw new NullPointerException();
    }
}
```



**Mian函数**

```java
/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:39 2018/3/31.
 */
@Configuration
@ImportResource("classpath:spring.xml")
public class TestMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(TestMain.class);
        TransactionalTest transactionalTest = context.getBean(TransactionalTest.class);
        // select testOne or testTwo, and must comment the other one
        // transactionalTest.testOne();
        transactionalTest.testTwo();
    }
}
```

**依赖包**

```xml
<properties>
    <spring.verion>5.0.4.RELEASE</spring.verion>
</properties>

<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>${spring.verion}</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-aop</artifactId>
        <version>${spring.verion}</version>
    </dependency>

    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>${spring.verion}</version>
    </dependency>

    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.45</version>
    </dependency>
</dependencies>
```



