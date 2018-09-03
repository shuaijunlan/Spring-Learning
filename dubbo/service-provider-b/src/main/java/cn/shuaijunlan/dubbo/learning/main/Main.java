package cn.shuaijunlan.dubbo.learning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 6:19 PM 2018/09/03.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/dubbo/dubbo-server.xml");
        ((ClassPathXmlApplicationContext) ctx).start();
        System.in.read();
    }
}
