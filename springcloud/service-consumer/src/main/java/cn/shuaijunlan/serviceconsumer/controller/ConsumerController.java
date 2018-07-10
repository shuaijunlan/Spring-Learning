package cn.shuaijunlan.serviceconsumer.controller;

import com.netflix.discovery.converters.Auto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:51 2018/3/14.
 */
@RestController
public class ConsumerController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer")
    public String consumer() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
        logger.info(url);
        return restTemplate.getForObject(url, String.class);
    }
}
