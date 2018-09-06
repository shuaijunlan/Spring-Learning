package cn.shuaijunlan.spring.learning.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:01 AM 2018/09/06.
 */
public class InitialIOC {
    public static void main(String[] args) {
        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("beans.xml");
    }
}
