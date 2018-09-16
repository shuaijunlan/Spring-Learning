package cn.shuaijunlan.dubbo.learning.main;

import org.apache.dubbo.common.compiler.Compiler;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.registry.Registry;
import org.apache.dubbo.registry.RegistryFactory;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.ProxyFactory;
import org.apache.dubbo.rpc.cluster.Cluster;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 3:48 PM 2018/08/10.
 */
public class DubboSPITest {
    public static void main(String[] args) {
        // ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("MEAT-INF.dubbo");
        // ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
        // ExtensionLoader.getExtensionLoader(Compiler.class).getAdaptiveExtension().compile("eee", Thread.currentThread().getContextClassLoader());
        // ExtensionLoader.getExtensionLoader(ProxyFactory.class).getAdaptiveExtension();
        // ExtensionLoader.getExtensionLoader(Cluster.class).getAdaptiveExtension();
        // ExtensionLoader.getExtensionLoader(RegistryFactory.class).getAdaptiveExtension();
        ExtensionLoader.getExtensionLoader(RegistryFactory.class).getAdaptiveExtension();
    }
}
