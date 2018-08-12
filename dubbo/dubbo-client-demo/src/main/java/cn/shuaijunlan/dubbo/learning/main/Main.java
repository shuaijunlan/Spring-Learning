package cn.shuaijunlan.dubbo.learning.main;

import cn.shuaijunlan.dubbo.learning.service.ITestService;
import org.apache.dubbo.rpc.service.EchoService;
import org.springframework.cglib.core.DebuggingClassWriter;
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
        // 通过类型强制转换为EchoService，可以测试
        // EchoService echoService = (EchoService) service;
        // System.out.println(echoService.$echo("hello"));

        for (int i = 0; i < 1; i++) {
            System.out.println(service.sayHello("Shuai Junlan" + i));
        }

    }
}
