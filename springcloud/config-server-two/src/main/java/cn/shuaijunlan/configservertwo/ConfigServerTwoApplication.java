package cn.shuaijunlan.configservertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author junlan
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerTwoApplication.class, args);
    }
}
