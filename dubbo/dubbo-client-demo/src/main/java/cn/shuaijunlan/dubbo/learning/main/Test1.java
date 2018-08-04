package cn.shuaijunlan.dubbo.learning.main;

import cn.shuaijunlan.dubbo.learning.service.IAddName;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:13 AM 2018/08/02.
 */
public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/dubbo/dubbo-client.xml");
        IAddName addName = (IAddName)ctx.getBean("addName");
        addName.addName("Shuai Junlan");
    }
}
