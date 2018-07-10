package cn.shuaijunlan.serviceclient.controller;

import com.netflix.discovery.converters.Auto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 17:42 2018/3/10.
 */
@RestController
@RefreshScope
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/dc")
    public String getHello() throws InterruptedException {
        Thread.sleep(5000L);
        String services = "Services: " + discoveryClient.getServices();
        logger.info(services);
        return "hello";
    }


}
