package cn.shuaijunlan.dubbo.learning.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 11:09 AM 2018/07/19.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("META-INF/dubbo/dubbo-server.xml");
        classPathXmlApplicationContext.start();
        System.in.read();


    }
}
