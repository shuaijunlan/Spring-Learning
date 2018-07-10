package cn.shuaijunlan.spring.springbeans;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 13:38 2018/4/5.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class Person1Test {
    @Autowired
    private Person1 person1;

    @Test
    public void getAge() throws Exception {
        Assert.assertEquals(22, person1.getAge());
    }

}