package cn.shuaijunlan.spring.transaction;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:09 2018/4/5.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TransactionalDemoTest {
    @Autowired
    private TransactionalDemo transactionalDemo;

    @Test
    public void testOne() throws Exception{
        try {
            transactionalDemo.testOne();
        }catch (NullPointerException e){
            Assert.assertTrue(true);
        }

    }

    @Test
    public void testTwo() throws Exception {
        try {
            transactionalDemo.testTwo();
        }catch (NullPointerException e){
            Assert.assertTrue(true);
        }
    }

}