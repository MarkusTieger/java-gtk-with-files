/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GProxy handles connecting to a remote host via a given type of
 * <br>proxy server. It is implemented by the 'gio-proxy' extension point.
 * <br>The extensions are named after their proxy protocol name. As an
 * <br>example, a SOCKS5 proxy implementation can be retrieved with the
 * <br>name 'socks5' using the function
 * <br>g_io_extension_point_get_extension_by_name().
 * <p><a href="https://docs.gtk.org/gio/iface.Proxy.html">https://docs.gtk.org/gio/iface.Proxy.html</a></p>
*/
public class Proxy extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Proxy.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAsyncReadyCallback {
        /**
         * Type definition for a function that will be called back when an asynchronous
         * <br>operation within GIO has been completed. &#35;GAsyncReadyCallback
         * <br>callbacks from &#35;GTask are guaranteed to be invoked in a later
         * <br>iteration of the
         * <br>[thread-default main context][g-main-context-push-thread-default]
         * <br>where the &#35;GTask was created. All other users of
         * <br>&#35;GAsyncReadyCallback must likewise call it asynchronously in a
         * <br>later iteration of the main context.
         * <br>
         * <br>The asynchronous operation is guaranteed to have held a reference to
         * <br>&#64;source_object from the time when the `*_async()` function was called, until
         * <br>after this callback returns.
         * @param source_object the object the asynchronous operation was started with.
         * @param res a &#35;GAsyncResult.
         * @param user_data user data passed to the callback.
        */
        void onAsyncReadyCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.gobject.Object source_object, @Nonnull AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaProxy.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaProxy.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public Proxy(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Given &#64;connection to communicate with a proxy (eg, a
     * <br>&#35;GSocketConnection that is connected to the proxy server), this
     * <br>does the necessary handshake to connect to &#64;proxy_address, and if
     * <br>required, wraps the &#35;GIOStream to handle proxy payload.
     * @param connection a &#35;GIOStream
     * @param proxy_address a &#35;GProxyAddress
     * @param cancellable a &#35;GCancellable
     * @return a &#35;GIOStream that will replace &#64;connection. This might               be the same as &#64;connection, in which case a reference               will be added.
    */
    public IOStream connect(@Nonnull IOStream connection, @Nonnull ProxyAddress proxy_address, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new IOStream(new PointerContainer(JnaProxy.INST().g_proxy_connect(asCPointer(), asCPointerNotNull(connection), asCPointerNotNull(proxy_address), asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronous version of g_proxy_connect().
     * @param connection a &#35;GIOStream
     * @param proxy_address a &#35;GProxyAddress
     * @param cancellable a &#35;GCancellable
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data callback data
    */
    public void connectAsync(@Nonnull IOStream connection, @Nonnull ProxyAddress proxy_address, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaProxy.INST().g_proxy_connect_async(asCPointer(), asCPointerNotNull(connection), asCPointerNotNull(proxy_address), asCPointer(cancellable), toOnAsyncReadyCallback(this, "connectAsync", callback), asCPointer(user_data));
    }

    /**
     * See g_proxy_connect().
     * @param result a &#35;GAsyncResult
     * @return a &#35;GIOStream.
    */
    public IOStream connectFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new IOStream(new PointerContainer(JnaProxy.INST().g_proxy_connect_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Some proxy protocols expect to be passed a hostname, which they
     * <br>will resolve to an IP address themselves. Others, like SOCKS4, do
     * <br>not allow this. This function will return %FALSE if &#64;proxy is
     * <br>implementing such a protocol. When %FALSE is returned, the caller
     * <br>should resolve the destination hostname first, and then pass a
     * <br>&#35;GProxyAddress containing the stringified IP address to
     * <br>g_proxy_connect() or g_proxy_connect_async().
     * @return %TRUE if hostname resolution is supported.
    */
    public boolean supportsHostname()  {
        return JnaProxy.INST().g_proxy_supports_hostname(asCPointer());
    }

    /**
     * Find the `gio-proxy` extension point for a proxy implementation that supports
     * <br>the specified protocol.
     * @param protocol the proxy protocol name (e.g. http, socks, etc)
     * @return return a &#35;GProxy or NULL if protocol               is not supported.
    */
    public static Proxy getDefaultForProtocol(@Nonnull ch.bailu.gtk.type.Str protocol)  {
        return new Proxy(new PointerContainer(JnaProxy.INST().g_proxy_get_default_for_protocol(asCPointerNotNull(protocol))));
    }

    public static long getTypeID() { 
        return JnaProxy.INST().g_proxy_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
interface-type
*/
