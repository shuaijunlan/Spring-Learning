package cn.shuaijunlan.serviceclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
        //触发服务降级逻辑
        Thread.sleep(500L);
        logger.info("Sleeping {}ms!", 5000);
        String services = "Services: " + discoveryClient.getServices();
        logger.info(services);
        return "hello";
    }


}
