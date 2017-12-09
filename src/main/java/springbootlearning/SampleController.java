package springbootlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:57 2017/12/8.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "hello world";
    }

    public static void main(String[] args){
        SpringApplication.run(SampleController.class);
    }
}
