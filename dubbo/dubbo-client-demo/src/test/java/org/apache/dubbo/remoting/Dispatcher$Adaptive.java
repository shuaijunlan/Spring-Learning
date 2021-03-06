package org.apache.dubbo.remoting;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 6:48 PM 2018/09/24.
 */

import org.apache.dubbo.common.extension.ExtensionLoader;

public class Dispatcher$Adaptive implements org.apache.dubbo.remoting.Dispatcher {
    private static final org.apache.dubbo.common.logger.Logger logger = org.apache.dubbo.common.logger.LoggerFactory.getLogger(ExtensionLoader.class);
    private java.util.concurrent.atomic.AtomicInteger count = new java.util.concurrent.atomic.AtomicInteger(0);

    public org.apache.dubbo.remoting.ChannelHandler dispatch(org.apache.dubbo.remoting.ChannelHandler arg0, org.apache.dubbo.common.URL arg1) {
        if (arg1 == null) throw new IllegalArgumentException("url == null");
        org.apache.dubbo.common.URL url = arg1;
        String extName = url.getParameter("dispatcher", url.getParameter("dispather", url.getParameter("channel.handler", "all")));
        if (extName == null)
            throw new IllegalStateException("Fail to get extension(org.apache.dubbo.remoting.Dispatcher) name from url(" + url.toString() + ") use keys([dispatcher, dispather, channel.handler])");
        org.apache.dubbo.remoting.Dispatcher extension = null;
        try {
            extension = (org.apache.dubbo.remoting.Dispatcher) ExtensionLoader.getExtensionLoader(org.apache.dubbo.remoting.Dispatcher.class).getExtension(extName);
        } catch (Exception e) {
            if (count.incrementAndGet() == 1) {
                logger.warn("Failed to find extension named " + extName + " for type org.apache.dubbo.remoting.Dispatcher, will use default extension all instead.", e);
            }
            extension = (org.apache.dubbo.remoting.Dispatcher) ExtensionLoader.getExtensionLoader(org.apache.dubbo.remoting.Dispatcher.class).getExtension("all");
        }
        return extension.dispatch(arg0, arg1);
    }
}
