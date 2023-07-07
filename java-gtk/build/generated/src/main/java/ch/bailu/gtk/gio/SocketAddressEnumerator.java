/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GSocketAddressEnumerator is an enumerator type for &#35;GSocketAddress
 * <br>instances. It is returned by enumeration functions such as
 * <br>g_socket_connectable_enumerate(), which returns a &#35;GSocketAddressEnumerator
 * <br>to list each &#35;GSocketAddress which could be used to connect to that
 * <br>&#35;GSocketConnectable.
 * <br>
 * <br>Enumeration is typically a blocking operation, so the asynchronous methods
 * <br>g_socket_address_enumerator_next_async() and
 * <br>g_socket_address_enumerator_next_finish() should be used where possible.
 * <br>
 * <br>Each &#35;GSocketAddressEnumerator can only be enumerated once. Once
 * <br>g_socket_address_enumerator_next() has returned %NULL, further
 * <br>enumeration with that &#35;GSocketAddressEnumerator is not possible, and it can
 * <br>be unreffed.
 * <p><a href="https://docs.gtk.org/gio/class.SocketAddressEnumerator.html">https://docs.gtk.org/gio/class.SocketAddressEnumerator.html</a></p>
*/
public class SocketAddressEnumerator extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SocketAddressEnumerator.class.getCanonicalName());
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
    
    private static JnaSocketAddressEnumerator.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaSocketAddressEnumerator.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public SocketAddressEnumerator(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the next &#35;GSocketAddress from &#64;enumerator. Note that this
     * <br>may block for some amount of time. (Eg, a &#35;GNetworkAddress may need
     * <br>to do a DNS lookup before it can return an address.) Use
     * <br>g_socket_address_enumerator_next_async() if you need to avoid
     * <br>blocking.
     * <br>
     * <br>If &#64;enumerator is expected to yield addresses, but for some reason
     * <br>is unable to (eg, because of a DNS error), then the first call to
     * <br>g_socket_address_enumerator_next() will return an appropriate error
     * <br>in *&#64;error. However, if the first call to
     * <br>g_socket_address_enumerator_next() succeeds, then any further
     * <br>internal errors (other than &#64;cancellable being triggered) will be
     * <br>ignored.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a &#35;GSocketAddress (owned by the caller), or %NULL on     error (in which case *&#64;error will be set) or if there are no     more addresses.
    */
    public SocketAddress next(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketAddress(new PointerContainer(JnaSocketAddressEnumerator.INST().g_socket_address_enumerator_next(asCPointer(), asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously retrieves the next &#35;GSocketAddress from &#64;enumerator
     * <br>and then calls &#64;callback, which must call
     * <br>g_socket_address_enumerator_next_finish() to get the result.
     * <br>
     * <br>It is an error to call this multiple times before the previous callback has finished.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback to call when the request     is satisfied
     * @param user_data the data to pass to callback function
    */
    public void nextAsync(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSocketAddressEnumerator.INST().g_socket_address_enumerator_next_async(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "nextAsync", callback), asCPointer(user_data));
    }

    /**
     * Retrieves the result of a completed call to
     * <br>g_socket_address_enumerator_next_async(). See
     * <br>g_socket_address_enumerator_next() for more information about
     * <br>error handling.
     * @param result a &#35;GAsyncResult
     * @return a &#35;GSocketAddress (owned by the caller), or %NULL on     error (in which case *&#64;error will be set) or if there are no     more addresses.
    */
    public SocketAddress nextFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketAddress(new PointerContainer(JnaSocketAddressEnumerator.INST().g_socket_address_enumerator_next_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    public static long getTypeID() { 
        return JnaSocketAddressEnumerator.INST().g_socket_address_enumerator_get_type(); 
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
class-type
*/
