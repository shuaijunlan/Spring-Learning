package cn.shuaijunlan.spring.springbeans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:16 PM 3/13/19.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-scope.xml");

        for (int i = 0; i < 10; i++){
            applicationContext.getBean("beanC");
            applicationContext.getBean("beanB");
        }
    }
}
