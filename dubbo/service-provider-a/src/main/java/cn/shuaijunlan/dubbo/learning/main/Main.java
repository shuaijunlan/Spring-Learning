package cn.shuaijunlan.dubbo.learning.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Creat             ed on 9:13 PM 2018/07/29.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/dubbo/dubbo-server.xml");
        ctx.start();
        System.in.read();
    }
}
