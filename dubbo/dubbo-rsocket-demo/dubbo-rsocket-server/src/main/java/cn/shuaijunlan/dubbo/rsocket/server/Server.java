package cn.shuaijunlan.dubbo.rsocket.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:27 AM 4/10/19.
 */
public class Server {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"rsocket-provider.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}
