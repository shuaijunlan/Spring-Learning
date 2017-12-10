package cn.shuaijunlan.springbootlearning;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 13:26 2017/12/10.
 */
public class HelloWorldTest {

    private HelloWorld subject;

    @Before
    public void setup() {
        subject = new HelloWorld();
    }
    @Test
    public void getMessage() throws Exception {
        assertEquals("Hello World!", subject.getMessage(false));
    }

}