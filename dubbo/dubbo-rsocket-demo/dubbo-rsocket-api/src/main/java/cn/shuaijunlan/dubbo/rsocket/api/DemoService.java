package cn.shuaijunlan.dubbo.rsocket.api;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:18 AM 4/10/19.
 */
public interface DemoService {
    Mono<String> requestMonoWithMonoArg(Mono<String> m1, Mono<String> m2);
    Flux<String> requestFluxWithFluxArg(Flux<String> f1, Flux<String> f2);
}
