package cn.shuaijunlan.dubbo.learning.service.impl;

import cn.shuaijunlan.dubbo.learning.service.ITestService;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:10 PM 2018/07/29.
 */
public class TestServiceImpl implements ITestService {
    @Override
    public String sayHello(String s) {
        return "service-provider-a: " + s;
    }
}
