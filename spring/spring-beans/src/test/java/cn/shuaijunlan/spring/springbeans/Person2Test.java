package cn.shuaijunlan.spring.springbeans;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 13:45 2018/4/5.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class Person2Test {
    @Autowired
    private Person2 person2;
    @Test
    public void getAge() throws Exception {
        Assert.assertEquals(0, person2.getAge());
    }

}