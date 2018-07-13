package cn.shuaijunlan.learning.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:17 2017/12/21.
 */
@RestController
public class RestControllerExample {

    @RequestMapping(value = {"/restController", "restController1"}, method = RequestMethod.GET)
    public String getString() {
        return "hello RestController!";
    }

}
