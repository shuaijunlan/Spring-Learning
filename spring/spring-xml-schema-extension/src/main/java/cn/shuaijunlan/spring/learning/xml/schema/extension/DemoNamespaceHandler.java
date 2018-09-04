package cn.shuaijunlan.spring.learning.xml.schema.extension;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 3:21 PM 2018/09/04.
 */
public class DemoNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        super.registerBeanDefinitionParser("application", new DemoBeanDefinationParser(ApplicationConfig.class));
        super.registerBeanDefinitionParser("service", new DemoBeanDefinationParser(ServiceBean.class));
    }
}
