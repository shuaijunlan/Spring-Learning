package cn.shuaijunlan.learning.springboot.simplecontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:11 2017/12/10.
 */
@RestController
public class SimpleController {
    @RequestMapping(value = "/simple1", method = RequestMethod.GET)
    public String getString(){
        return "hello SimpleController1!";
    }

}
