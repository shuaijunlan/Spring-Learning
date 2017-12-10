package cn.shuaijunlan.learning.springboot.simplecontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:00 2017/12/10.
 */
@RestController
public class SimpleController {

    @RequestMapping("/simple")
    String getString() {
        return "hello SimpleController1!";
    }

}
