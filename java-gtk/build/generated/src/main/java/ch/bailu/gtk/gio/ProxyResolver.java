/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GProxyResolver provides synchronous and asynchronous network proxy
 * <br>resolution. &#35;GProxyResolver is used within &#35;GSocketClient through
 * <br>the method g_socket_connectable_proxy_enumerate().
 * <br>
 * <br>Implementations of &#35;GProxyResolver based on libproxy and GNOME settings can
 * <br>be found in glib-networking. GIO comes with an implementation for use inside
 * <br>Flatpak portals.
 * <p><a href="https://docs.gtk.org/gio/iface.ProxyResolver.html">https://docs.gtk.org/gio/iface.ProxyResolver.html</a></p>
*/
public class ProxyResolver extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ProxyResolver.class.getCanonicalName());
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
    
    private static JnaProxyResolver.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaProxyResolver.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public ProxyResolver(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Checks if &#64;resolver can be used on this system. (This is used
     * <br>internally; g_proxy_resolver_get_default() will only return a proxy
     * <br>resolver that returns %TRUE for this method.)
     * @return %TRUE if &#64;resolver is supported.
    */
    public boolean isSupported()  {
        return JnaProxyResolver.INST().g_proxy_resolver_is_supported(asCPointer());
    }

    /**
     * Asynchronous lookup of proxy. See g_proxy_resolver_lookup() for more
     * <br>details.
     * @param uri a URI representing the destination to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call after resolution completes
     * @param user_data data for &#64;callback
    */
    public void lookupAsync(@Nonnull ch.bailu.gtk.type.Str uri, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaProxyResolver.INST().g_proxy_resolver_lookup_async(asCPointer(), asCPointerNotNull(uri), asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupAsync", callback), asCPointer(user_data));
    }

    /**
     * Asynchronous lookup of proxy. See g_proxy_resolver_lookup() for more
     * <br>details.
     * @param uri a URI representing the destination to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback callback to call after resolution completes
     * @param user_data data for &#64;callback
    */
    public void lookupAsync(String uri, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaProxyResolver.INST().g_proxy_resolver_lookup_async(asCPointer(), uri, asCPointer(cancellable), toOnAsyncReadyCallback(this, "lookupAsync", callback), asCPointer(user_data));
    }

    /**
     * Gets the default &#35;GProxyResolver for the system.
     * @return the default &#35;GProxyResolver, which     will be a dummy object if no proxy resolver is available
    */
    public static ProxyResolver getDefault()  {
        return new ProxyResolver(new PointerContainer(JnaProxyResolver.INST().g_proxy_resolver_get_default()));
    }

    public static long getTypeID() { 
        return JnaProxyResolver.INST().g_proxy_resolver_get_type(); 
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

[MethodModel:cb-return-value-not-supported:lookup:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:lookupFinish:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
*/
