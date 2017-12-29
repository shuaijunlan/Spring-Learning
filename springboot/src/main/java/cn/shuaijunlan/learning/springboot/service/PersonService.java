package cn.shuaijunlan.learning.springboot.service;

import cn.shuaijunlan.learning.springboot.domain.Person;
import cn.shuaijunlan.learning.springboot.enums.ResponseResultEnum;
import cn.shuaijunlan.learning.springboot.exception.PersonException;
import cn.shuaijunlan.learning.springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;

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
        personA.setAge(25);
        personA.setHeight(1.22F);
        personA.setName("lc");

        Person personB = new  Person();
        personB.setAge(26);
        personB.setHeight(1.56F);
        personB.setName("lc1");
        personRepository.save(personA);
        personRepository.save(personB);
    }

    public void getPersonByAge(Integer id) throws Exception {
        Person person = personRepository.findOne(id);
        if (person == null){
            return ;
        }
        Integer age = person.getAge();
        if (age < 20){
            throw new PersonException(ResponseResultEnum.FORBIDDEN);
        }

    }
}
