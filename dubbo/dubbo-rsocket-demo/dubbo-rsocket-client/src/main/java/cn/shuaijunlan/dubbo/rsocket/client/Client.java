package cn.shuaijunlan.dubbo.rsocket.client;

import cn.shuaijunlan.dubbo.rsocket.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Consumer;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:30 AM 4/10/19.
 */
public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"rsocket-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy

        while (true) {
            try {
                Mono<String> monoResult = demoService.requestMonoWithMonoArg(Mono.just("A"), Mono.just("B"));
                monoResult.doOnNext(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                }).block();

                Flux<String> fluxResult = demoService.requestFluxWithFluxArg(Flux.just("A", "B", "C"), Flux.just("1", "2", "3"));
                fluxResult.doOnNext(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                }).blockLast();

            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
}
