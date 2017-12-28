package cn.shuaijunlan.learning.springboot.controller;

import cn.shuaijunlan.learning.springboot.domain.Person;
import cn.shuaijunlan.learning.springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
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

    /**
     * add a person
     * @param person
     * @return
     */
    @PostMapping(value = "/addPerson")
    public Person addPerson(@Valid Person person, BindingResult bindingResult){
        //  没有验证通过
        if (bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        return personRepository.save(person);
    }
}
