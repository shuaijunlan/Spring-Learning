package cn.shuaijunlan.dubbo.learning.service.impl;

import cn.shuaijunlan.dubbo.learning.service.ITestService;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:56 AM 2018/07/19.
 */
public class TestService2Impl implements ITestService {
    @Override
    public String sayHello(String s) {
        return "Hi, Consumer " + s + ", through Hessian protocol!";
    }
}
