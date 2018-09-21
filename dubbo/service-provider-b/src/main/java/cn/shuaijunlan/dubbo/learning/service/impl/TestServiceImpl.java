package cn.shuaijunlan.dubbo.learning.service.impl;

import cn.shuaijunlan.dubbo.learning.service.ITestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 6:10 PM 2018/09/03.
 */
@Service(protocol = "dubbo", loadbalance = "roundrobin")
public class TestServiceImpl implements ITestService {
    @Override
    public String sayHello(String msg) {
        return "Provider Service B : " + msg;
    }
}
