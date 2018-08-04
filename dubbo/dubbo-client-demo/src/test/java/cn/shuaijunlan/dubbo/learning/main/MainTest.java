package cn.shuaijunlan.dubbo.learning.main;

import static org.junit.Assert.*;

import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.registry.integration.RegistryDirectory;
import org.apache.dubbo.registry.integration.RegistryProtocol;
import org.apache.dubbo.remoting.Transporters;
import org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeClient;
import org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeHandler;
import org.apache.dubbo.remoting.transport.netty.NettyHandler;
import org.apache.dubbo.remoting.transport.netty4.NettyClient;
import org.apache.dubbo.remoting.transport.netty4.NettyClientHandler;
import org.apache.dubbo.remoting.transport.netty4.NettyServer;
import org.apache.dubbo.remoting.transport.netty4.NettyServerHandler;
import org.apache.dubbo.rpc.ProxyFactory;
import org.apache.dubbo.rpc.cluster.support.FailoverClusterInvoker;
import org.apache.dubbo.rpc.cluster.support.wrapper.MockClusterInvoker;
import org.apache.dubbo.rpc.filter.ConsumerContextFilter;
import org.apache.dubbo.rpc.protocol.ProtocolFilterWrapper;
import org.apache.dubbo.rpc.protocol.dubbo.DubboInvoker;
import org.apache.dubbo.rpc.protocol.dubbo.DubboProtocol;
import org.apache.dubbo.rpc.protocol.dubbo.filter.FutureFilter;
import org.apache.dubbo.rpc.proxy.InvokerInvocationHandler;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 5:18 PM 2018/08/01.
 */
public class MainTest {

    @org.junit.Test
    public void main() {
        // NettyServer
        // HeaderExchangeHandler
        // Transporters
        // RegistryProtocol
        // ProxyFactory
        // DubboProtocol
        // InvokerInvocationHandler
        // MockClusterInvoker
        // FailoverClusterInvoker
        // RegistryProtocol.InvokerDelegete
        // RegistryDirectory
        // ProtocolFilterWrapper
        // ConsumerContextFilter
        // FutureFilter
        // DubboInvoker
        // HeaderExchangeHandler
        // HeaderExchangeClient
        // NettyClient
        // NettyClientHandler
        // NettyChannelHa
        // NettyClientHandler
        // ReferenceConfig
        // NettyClientHandler
        // NettyHandler
    }
}