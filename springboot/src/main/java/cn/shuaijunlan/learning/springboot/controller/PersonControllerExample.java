package cn.shuaijunlan.learning.springboot.controller;

import cn.shuaijunlan.learning.springboot.entity.Person;
import cn.shuaijunlan.learning.springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:54 2017/12/22.
 */
@RestController
public class PersonControllerExample {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping(value = "/personList")
    public List<Person> getPersonList(){
        return personRepository.findAll();
    }

    @PostMapping(value = "/addPerson")
    public Person addPerson(Person person){
        return personRepository.save(person);
    }
}
