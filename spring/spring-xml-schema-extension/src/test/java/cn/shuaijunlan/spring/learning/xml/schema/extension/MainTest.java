package cn.shuaijunlan.spring.learning.xml.schema.extension;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:28 PM 2018/09/05.
 */
public class MainTest {

    @Test
    public void main() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo.xml");
        ServiceBean serviceBean = applicationContext.getBean(ServiceBean.class);
        ApplicationConfig applicationConfig = applicationContext.getBean(ApplicationConfig.class);

        Assert.assertEquals("service", serviceBean.getName());
        Assert.assertEquals("application", applicationConfig.getName());
    }
}