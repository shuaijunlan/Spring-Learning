package cn.shuaijunlan.servicetrace2;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junlan
 */
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceTrace2Application {
    private final Logger logger = Logger.getLogger(getClass());


    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String trace(){
        logger.info("===call trace-2===");
        return "Trace2";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceTrace2Application.class, args);
    }
}
