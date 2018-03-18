package cn.shuaijunlan.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:38 2018/3/18.
 */
@RefreshScope
@RestController
public class TestController {

//    @Value("${from}")
//    private String from;

    @GetMapping(value = "/from")
    public String from(){
        return "from";
    }
}
