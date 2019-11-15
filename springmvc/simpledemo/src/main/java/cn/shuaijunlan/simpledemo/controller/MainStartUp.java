package cn.shuaijunlan.simpledemo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:15 AM 3/13/19.
 */
public class MainStartUp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:bean.xml");
        TestBean testBean = (TestBean) applicationContext.getBean("bean");
        System.out.println(testBean.getName());
    }
}
