package cn.shuaijunlan.learning.springboot.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:31 2017/12/22.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PersonServiceTest {
    @Autowired
    private PersonService personService;
    @Test
    public void insertTwoPersons() throws Exception {
        personService.insertTwoPersons();
    }

}