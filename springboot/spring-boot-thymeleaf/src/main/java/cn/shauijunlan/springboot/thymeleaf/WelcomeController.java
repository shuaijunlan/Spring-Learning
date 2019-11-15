package cn.shauijunlan.springboot.thymeleaf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 2:25 PM 11/15/19.
 */
@Controller
public class WelcomeController {
    @Value("${welcome.message}")
    private String message;

    private List<String> tasks = Arrays.asList("a", "b", "c", "d");

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);
        return "welcome";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", required = false, defaultValue = " ") String name, Model model){
        model.addAttribute("message", name);
        return "welcome";
    }
}
