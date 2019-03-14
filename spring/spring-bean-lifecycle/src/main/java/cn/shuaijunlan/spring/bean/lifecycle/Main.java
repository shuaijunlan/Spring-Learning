package cn.shuaijunlan.spring.bean.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:04 AM 3/13/19.
 *
 * TODO: [Spring Bean的生命周期（非常详细）](https://www.cnblogs.com/zrtqsk/p/3735273.html)
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:bean.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());
        applicationContext.registerShutdownHook();
    }
}
