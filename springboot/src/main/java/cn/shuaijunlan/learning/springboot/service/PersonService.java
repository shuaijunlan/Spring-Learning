package cn.shuaijunlan.learning.springboot.service;

import cn.shuaijunlan.learning.springboot.domain.Person;
import cn.shuaijunlan.learning.springboot.domain.ResponseResult;
import cn.shuaijunlan.learning.springboot.enums.ResponseResultEnum;
import cn.shuaijunlan.learning.springboot.exception.PersonException;
import cn.shuaijunlan.learning.springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:27 2017/12/22.
 */
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Transactional(rollbackFor = Exception.class)
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

    public Person getPersonById(Integer id) throws Exception {

        Optional<Person> person = personRepository.findById(id);


        if (!person.isPresent()){
            return null;
        }
        Integer age = person.get().getAge();
        Integer limitAge = 20;
        if (age < limitAge){
            throw new PersonException(ResponseResultEnum.FORBIDDEN);
        }
        // If I don't add this statement, it will throw NullPointer Exception, why?
        // throw new PersonException(ResponseResultEnum.UNKNOWN_ERROR);
        return person.get();
    }
}
