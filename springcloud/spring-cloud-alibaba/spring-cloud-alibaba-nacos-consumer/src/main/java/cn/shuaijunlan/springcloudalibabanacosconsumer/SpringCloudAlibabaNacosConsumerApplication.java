package cn.shuaijunlan.springcloudalibabanacosconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.xml.ws.Service;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudAlibabaNacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaNacosConsumerApplication.class, args);
    }
    @Slf4j
    @RestController
    static class TestController{
        @Autowired
        private WebClient.Builder webClientBuilder;

        @GetMapping("test1")
        public Mono<String> test(){
            Mono<String> result = webClientBuilder.build()
                    .get()
                    .uri("http://alibaba-nacos-discovery-server/hello?name=didi")
                    .retrieve()
                    .bodyToMono(String.class);
            return result;
        }

        @Autowired
        private LoadBalancerClient loadBalancerClient;
        @GetMapping("test2")
        public String test2(){
            ServiceInstance serviceInstance = loadBalancerClient.choose("alibaba-nacos-discovery-server");
            String url = serviceInstance.getUri() + "/hello?name=" + "shuai";
            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(url, String.class);
            return "Invoke : " + url +", return: " + result;
        }

        @Autowired
        RestTemplate restTemplate;

        @GetMapping("/test3")
        public String test3() {
            String result = restTemplate.getForObject("http://alibaba-nacos-discovery-server/hello?name=shuai", String.class);
            return "Return : " + result;
        }


    }

    @Bean
    @LoadBalanced
    public WebClient.Builder loadBalanceWebClientBuilder(){
        return WebClient.builder();
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

