package cn.shuaijunlan.spring.springbeans;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.junit.Assert.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 13:50 2018/4/5.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class Person3Test {
    @Autowired
    private Person3 person3;
    @Test
    public void getAge() throws Exception {
        Assert.assertEquals(22, person3.getAge());
    }

}