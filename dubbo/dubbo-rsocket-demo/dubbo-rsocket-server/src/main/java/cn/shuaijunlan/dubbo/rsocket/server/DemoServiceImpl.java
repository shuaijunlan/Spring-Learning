package cn.shuaijunlan.dubbo.rsocket.server;

import cn.shuaijunlan.dubbo.rsocket.api.DemoService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.BiFunction;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:24 AM 4/10/19.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public Mono<String> requestMonoWithMonoArg(Mono<String> m1, Mono<String> m2) {
        return m1.zipWith(m2, new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                return s + " " + s2;
            }
        });
    }

    @Override
    public Flux<String> requestFluxWithFluxArg(Flux<String> f1, Flux<String> f2) {
        return f1.zipWith(f2, new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                return s + " " + s2;
            }
        });
    }
}
