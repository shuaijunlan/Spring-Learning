package cn.shuaijunlan.microservicesdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:07 2018/3/9.
 */
@Controller
@ResponseBody
public class Tets {
    @GetMapping(value = "name")
    public String getName(){
        return "ShuaiJunlan";
    }
}
