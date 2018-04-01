package cn.shuaijunlan.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.AbstractApplicationContext;


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
        transactionalTest.testOne();
//        transactionalTest.testTwo();
    }
}
