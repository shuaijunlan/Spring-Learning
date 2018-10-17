package org.apache.dubbo.rpc.cluster;

/**
 * @author Junlan Shuaijunlan[shuaijunlan@gmail.com].
 * @since Created in 11:26 AM 10/17/18.
 */

import org.apache.dubbo.common.extension.ExtensionLoader;

public class RouterFactory$Adaptive implements org.apache.dubbo.rpc.cluster.RouterFactory {
    private static final org.apache.dubbo.common.logger.Logger logger = org.apache.dubbo.common.logger.LoggerFactory.getLogger(ExtensionLoader.class);
    private java.util.concurrent.atomic.AtomicInteger count = new java.util.concurrent.atomic.AtomicInteger(0);

    public org.apache.dubbo.rpc.cluster.Router getRouter(org.apache.dubbo.common.URL arg0) {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        org.apache.dubbo.common.URL url = arg0;
        String extName = url.getProtocol();
        if (extName == null)
            throw new IllegalStateException("Fail to get extension(org.apache.dubbo.rpc.cluster.RouterFactory) name from url(" + url.toString() + ") use keys([protocol])");
        org.apache.dubbo.rpc.cluster.RouterFactory extension = null;
        try {
            extension = (org.apache.dubbo.rpc.cluster.RouterFactory) ExtensionLoader.getExtensionLoader(org.apache.dubbo.rpc.cluster.RouterFactory.class).getExtension(extName);
        } catch (Exception e) {
            if (count.incrementAndGet() == 1) {
                logger.warn("Failed to find extension named " + extName + " for type org.apache.dubbo.rpc.cluster.RouterFactory, will use default extension null instead.", e);
            }
            extension = (org.apache.dubbo.rpc.cluster.RouterFactory) ExtensionLoader.getExtensionLoader(org.apache.dubbo.rpc.cluster.RouterFactory.class).getExtension("null");
        }
        return extension.getRouter(arg0);
    }
}