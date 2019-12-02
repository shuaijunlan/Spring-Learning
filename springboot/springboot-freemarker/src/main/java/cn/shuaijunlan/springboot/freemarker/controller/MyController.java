package cn.shuaijunlan.springboot.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:36 PM 12/2/19.
 */
@Controller
public class MyController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("name", "Junlan");
        return "hello";
    }
}
