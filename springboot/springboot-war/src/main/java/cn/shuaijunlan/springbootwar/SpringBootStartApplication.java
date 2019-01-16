package cn.shuaijunlan.springbootwar;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:44 PM 1/16/19.
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootWarApplication.class);
    }
}
