package cn.shuaijunlan.learning.springboot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:56 2017/12/10.
 */
public class SimpleControllerTest {
    private SimpleController simpleController = new SimpleController();
    @Test
    public void home() throws Exception {
        assertEquals("Hello World!",simpleController.home());
    }

    @Test
    public void main() throws Exception {
    }

}