package cn.shuaijunlan.spring.circular.dependency.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:38 AM 3/14/19.
 */
public class Main {
    public static void main(String[] args) {
        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:constructor-singleton.xml");//Requested bean is currently in creation: Is there an unresolvable circular reference?
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:constructor-prototype.xml");
        System.out.println(applicationContext.getBean("beanA"));//Requested bean is currently in creation: Is there an unresolvable circular reference?

    }
}
