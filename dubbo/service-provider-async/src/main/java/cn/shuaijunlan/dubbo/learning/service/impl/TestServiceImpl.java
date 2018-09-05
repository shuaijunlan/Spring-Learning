package cn.shuaijunlan.dubbo.learning.service.impl;

import cn.shuaijunlan.dubbo.learning.service.ITestService;
import org.apache.dubbo.rpc.AsyncContext;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:10 PM 2018/07/29.
 */
public class TestServiceImpl implements ITestService {
    @Override
    public String sayHello(String s) {
        System.out.println("Main sayHello() method start.");
        final AsyncContext asyncContext = RpcContext.startAsync();
        new Thread(() -> {
            asyncContext.signalContextSwitch();
            System.out.println("Attachment from consumer: " + RpcContext.getContext().getAttachment("consumer-key1"));
            System.out.println("    -- Async start.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            asyncContext.write("Hello " + s + ", response from provider.");
            System.out.println("    -- Async end.");
        }).start();
        System.out.println("Main sayHello() method end.");
        return "hello, " + s;
    }
}
