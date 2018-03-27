package cn.shuaijunlan.learning.springboot.service;

import cn.shuaijunlan.learning.springboot.domain.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


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

    @Test
    public void getPersonByAge() throws Exception {
        personService.getPersonById(38);
//        Assert.assertEquals();
    }

}