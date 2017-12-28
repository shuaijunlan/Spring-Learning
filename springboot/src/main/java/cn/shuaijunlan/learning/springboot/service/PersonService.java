package cn.shuaijunlan.learning.springboot.service;

import cn.shuaijunlan.learning.springboot.domain.Person;
import cn.shuaijunlan.learning.springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:27 2017/12/22.
 */
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public  void insertTwoPersons() {

        Person personA = new  Person();
        personA.setAge(15);
        personA.setHeight(1.22F);
        personA.setName("lc");

        Person personB = new  Person();
        personB.setAge(17);
        personB.setHeight(1.56F);
        personB.setName("lc1");
        personRepository.save(personA);
        personRepository.save(personB);
    }
}
