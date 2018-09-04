package cn.shuaijunlan.spring.learning.xml.schema.extension;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 3:47 PM 2018/09/04.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo.xml");
        ServiceBean serviceBean = applicationContext.getBean(ServiceBean.class);
        ApplicationConfig applicationConfig = applicationContext.getBean(ApplicationConfig.class);

        System.out.println(serviceBean.getName());
        System.out.println(applicationConfig.getName());
    }
}
