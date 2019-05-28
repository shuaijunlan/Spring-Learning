package cn.shuaijunlan.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:54 PM 5/28/19.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");

        LoginService service = applicationContext.getBean(LoginService.class);

        System.out.println(service.login("admin", "123456"));
    }
}
