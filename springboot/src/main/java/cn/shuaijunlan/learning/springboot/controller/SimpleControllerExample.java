package cn.shuaijunlan.learning.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:00 2017/12/10.
 */
@Controller
//@ResponseBody// why I don't use this annotation, it get 404 error
public class SimpleControllerExample {

    @RequestMapping(value = "/simpleController")
    public String getString() {
        return "SimpleController";
    }
}
