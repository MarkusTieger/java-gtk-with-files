/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Provides an interface for handling proxy connection and payload.
 * <p><a href="https://docs.gtk.org/gio/struct.ProxyInterface.html">https://docs.gtk.org/gio/struct.ProxyInterface.html</a></p>
*/
public class ProxyInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ProxyInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnConnect {
        /**
         * 
         * @param proxy a &#35;GProxy
         * @param connection a &#35;GIOStream
         * @param proxy_address a &#35;GProxyAddress
         * @param cancellable a &#35;GCancellable
         * @return a &#35;GIOStream that will replace &#64;connection. This might               be the same as &#64;connection, in which case a reference               will be added.
        */
        IOStream onConnect(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Proxy proxy, @Nonnull IOStream connection, @Nonnull ProxyAddress proxy_address, @Nullable Cancellable cancellable);
    }
    
    private static JnaProxyInterface.OnConnect toOnConnect(ch.bailu.gtk.type.Pointer instance, String methodName, OnConnect in) {
        JnaProxyInterface.OnConnect out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_proxy, _connection, _proxy_address, _cancellable, _error) -> in.onConnect(__callback, new Proxy(new PointerContainer(_proxy)), new IOStream(new PointerContainer(_connection)), new ProxyAddress(new PointerContainer(_proxy_address)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnConnectFinish {
        /**
         * 
         * @param proxy a &#35;GProxy
         * @param result a &#35;GAsyncResult
         * @return a &#35;GIOStream.
        */
        IOStream onConnectFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Proxy proxy, @Nonnull AsyncResult result);
    }
    
    private static JnaProxyInterface.OnConnectFinish toOnConnectFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnConnectFinish in) {
        JnaProxyInterface.OnConnectFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_proxy, _result, _error) -> in.onConnectFinish(__callback, new Proxy(new PointerContainer(_proxy)), new AsyncResult(new PointerContainer(_result))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSupportsHostname {
        /**
         * 
         * @param proxy a &#35;GProxy
         * @return %TRUE if hostname resolution is supported.
        */
        boolean onSupportsHostname(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Proxy proxy);
    }
    
    private static JnaProxyInterface.OnSupportsHostname toOnSupportsHostname(ch.bailu.gtk.type.Pointer instance, String methodName, OnSupportsHostname in) {
        JnaProxyInterface.OnSupportsHostname out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_proxy) -> in.onSupportsHostname(__callback, new Proxy(new PointerContainer(_proxy)));
            __callback.register(out);
        }
        return out;
    }

    public ProxyInterface(PointerContainer pointer) {
        super(pointer);
    }

    public ProxyInterface() {
        super(cast(JnaProxyInterface.allocateStructure()));
    }

    private JnaProxyInterface.Fields _fields;
    
    JnaProxyInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaProxyInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnConnect#onConnect}
    */
    public static final String CONNECT = "connect";

    /**
     * 
     * <br>See {@link OnConnect#onConnect}
    */
    public void setFieldConnect(OnConnect connect) {
        toFields().connect = toOnConnect(this, CONNECT, connect);
        toFields().writeField(CONNECT);
    }

    /**
     * 
     * <br>See {@link OnConnect#onConnect}
    */
    public JnaProxyInterface.OnConnect getFieldConnect() {
       toFields().readField(CONNECT);
       return toFields().connect;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String CONNECT_ASYNC = "connect_async";

    /**
     * 
     * <br>See {@link OnConnectFinish#onConnectFinish}
    */
    public static final String CONNECT_FINISH = "connect_finish";

    /**
     * 
     * <br>See {@link OnConnectFinish#onConnectFinish}
    */
    public void setFieldConnectFinish(OnConnectFinish connect_finish) {
        toFields().connect_finish = toOnConnectFinish(this, CONNECT_FINISH, connect_finish);
        toFields().writeField(CONNECT_FINISH);
    }

    /**
     * 
     * <br>See {@link OnConnectFinish#onConnectFinish}
    */
    public JnaProxyInterface.OnConnectFinish getFieldConnectFinish() {
       toFields().readField(CONNECT_FINISH);
       return toFields().connect_finish;
    } 

    /**
     * 
     * <br>See {@link OnSupportsHostname#onSupportsHostname}
    */
    public static final String SUPPORTS_HOSTNAME = "supports_hostname";

    /**
     * 
     * <br>See {@link OnSupportsHostname#onSupportsHostname}
    */
    public void setFieldSupportsHostname(OnSupportsHostname supports_hostname) {
        toFields().supports_hostname = toOnSupportsHostname(this, SUPPORTS_HOSTNAME, supports_hostname);
        toFields().writeField(SUPPORTS_HOSTNAME);
    }

    /**
     * 
     * <br>See {@link OnSupportsHostname#onSupportsHostname}
    */
    public JnaProxyInterface.OnSupportsHostname getFieldSupportsHostname() {
       toFields().readField(SUPPORTS_HOSTNAME);
       return toFields().supports_hostname;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Proxy.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Proxy.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
