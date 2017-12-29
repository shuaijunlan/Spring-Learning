package cn.shuaijunlan.learning.springboot.controller;

import cn.shuaijunlan.learning.springboot.domain.Person;
import cn.shuaijunlan.learning.springboot.domain.ResponseResult;
import cn.shuaijunlan.learning.springboot.repository.PersonRepository;
import cn.shuaijunlan.learning.springboot.service.PersonService;
import cn.shuaijunlan.learning.springboot.utils.ResponseResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    private PersonService personService;

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
    public ResponseResult<Person> addPerson(@Valid Person person, BindingResult bindingResult){
        ResponseResult<Person> responseResult = new ResponseResult<>();

        //  没有验证通过
        if (bindingResult.hasErrors()){
            return ResponseResultUtil.fail(1, bindingResult.getFieldError().getDefaultMessage(), null);
        }else {
            return ResponseResultUtil.success(personRepository.save(person));
        }
    }
    @GetMapping(value = "person/getAge/{id}")
    public void getAgeById(@PathVariable("id") Integer id) throws Exception {
        personService.getPersonByAge(id);
    }
}
