package cn.shuaijunlan.dubbo.learning.main;

import cn.shuaijunlan.dubbo.learning.service.ITestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 11:30 AM 2018/07/19.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("META-INF/dubbo/dubbo-client.xml");
        ITestService service = (ITestService)classPathXmlApplicationContext.getBean("testService");
        System.out.println(service.sayHello("Shuai Junlan"));
    }
}
