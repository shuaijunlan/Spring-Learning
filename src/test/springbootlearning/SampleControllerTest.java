package springbootlearning;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 13:04 2017/12/10.
 */
public class SampleControllerTest {
    @Test
    public void testGetMessage() {
        assertEquals("Hello World!", "Hello World!");
    }

}