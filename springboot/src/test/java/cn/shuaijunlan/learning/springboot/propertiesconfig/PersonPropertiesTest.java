package cn.shuaijunlan.learning.springboot.propertiesconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:58 2017/12/10.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PersonPropertiesTest {
    /**
     * Configuration properties method one: by using @Value annotation
     */
    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private Integer age;

    @Value("${person.height}")
    private Float height;


    @Test
    public void test1(){
        System.out.println(name + ":" + age + ":" + height);
    }


    /**
     * Configuration properties method two: by using @ConfigurationProperties annotation,
     * looking up PersonProperties class for further detail.
     */
    @Autowired
    private PersonProperties personProperties;
    @Test
    public void test2(){
        System.out.println(personProperties.toString());
    }

}