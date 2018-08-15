package cn.shuaijunlan.dubbo.learning.main;

import org.apache.dubbo.common.compiler.Compiler;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.ProxyFactory;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 3:48 PM 2018/08/10.
 */
public class DubboSPITest {
    public static void main(String[] args) {
        // ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("dubbo");
        // ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
        // ExtensionLoader.getExtensionLoader(Compiler.class).getAdaptiveExtension().compile("eee", Thread.currentThread().getContextClassLoader());
        ExtensionLoader.getExtensionLoader(ProxyFactory.class).getAdaptiveExtension();
    }
}
