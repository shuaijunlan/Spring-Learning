package cn.shuaijunlan.learning.springboot.simplecontroller;

import cn.shuaijunlan.learning.springboot.controller.SimpleControllerExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:23 2017/12/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleControllerExampleTest {
    @Autowired
    private SimpleControllerExample simpleControllerExample1;

    @Test
    public void getString() throws Exception {
        assertEquals("hello SimpleController1!", simpleControllerExample1.getString());
    }

}