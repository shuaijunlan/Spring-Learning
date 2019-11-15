package cn.shuaijunlan.springboot.webflux;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:52 AM 5/29/19.
 */
@RestController
@Slf4j
public class ReactiveController {

    @GetMapping(value = "/reactiveService")
    public Mono<String> reactiveService(@RequestParam String username){
        log.info("Hello {}.", username);
        log.debug("reactiveService Request processing started");
        return Mono.just("reactiveService");
    }
}
