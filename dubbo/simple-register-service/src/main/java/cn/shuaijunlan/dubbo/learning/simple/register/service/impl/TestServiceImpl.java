package cn.shuaijunlan.dubbo.learning.simple.register.service.impl;

import cn.shuaijunlan.dubbo.learning.service.ITestService;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:51 PM 2018/07/23.
 */
public class TestServiceImpl implements ITestService {
    @Override
    public String sayHello(String s) {
        return "Hello " + s + ", by simple register";
    }
}
