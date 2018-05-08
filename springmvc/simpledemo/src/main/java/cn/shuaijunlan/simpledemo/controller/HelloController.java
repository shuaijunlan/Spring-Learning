package cn.shuaijunlan.simpledemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:15 2018/3/22.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHelloPage(){
        return "hello";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    @ResponseBody
    public String getHelloString(){
        return "hello";
    }

    @RequestMapping(value = "/stringList", method = RequestMethod.GET)
    @ResponseBody
    public List<String> getStringList(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("shuai");
        linkedList.add("jun");
        linkedList.add("lan");
        return linkedList;
    }
}
