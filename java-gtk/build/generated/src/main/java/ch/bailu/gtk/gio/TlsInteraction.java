/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GTlsInteraction provides a mechanism for the TLS connection and database
 * <br>code to interact with the user. It can be used to ask the user for passwords.
 * <br>
 * <br>To use a &#35;GTlsInteraction with a TLS connection use
 * <br>g_tls_connection_set_interaction().
 * <br>
 * <br>Callers should instantiate a derived class that implements the various
 * <br>interaction methods to show the required dialogs.
 * <br>
 * <br>Callers should use the 'invoke' functions like
 * <br>g_tls_interaction_invoke_ask_password() to run interaction methods. These
 * <br>functions make sure that the interaction is invoked in the main loop
 * <br>and not in the current thread, if the current thread is not running the
 * <br>main loop.
 * <br>
 * <br>Derived classes can choose to implement whichever interactions methods they'd
 * <br>like to support by overriding those virtual methods in their class
 * <br>initialization function. Any interactions not implemented will return
 * <br>%G_TLS_INTERACTION_UNHANDLED. If a derived class implements an async method,
 * <br>it must also implement the corresponding finish method.
 * <p><a href="https://docs.gtk.org/gio/class.TlsInteraction.html">https://docs.gtk.org/gio/class.TlsInteraction.html</a></p>
*/
public class TlsInteraction extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsInteraction.class.getCanonicalName());
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
    
    private static JnaTlsInteraction.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaTlsInteraction.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public TlsInteraction(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Run synchronous interaction to ask the user for a password. In general,
     * <br>g_tls_interaction_invoke_ask_password() should be used instead of this
     * <br>function.
     * <br>
     * <br>Derived subclasses usually implement a password prompt, although they may
     * <br>also choose to provide a password from elsewhere. The &#64;password value will
     * <br>be filled in and then &#64;callback will be called. Alternatively the user may
     * <br>abort this password request, which will usually abort the TLS connection.
     * <br>
     * <br>If the interaction is cancelled by the cancellation object, or by the
     * <br>user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * <br>contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
     * <br>not support immediate cancellation.
     * @param password a &#35;GTlsPassword object
     * @param cancellable an optional &#35;GCancellable cancellation object
     * @return The status of the ask password interaction.
    */
    public int askPassword(@Nonnull TlsPassword password, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTlsInteraction.INST().g_tls_interaction_ask_password(asCPointer(), asCPointerNotNull(password), asCPointer(cancellable), 0L);
    }

    /**
     * Run asynchronous interaction to ask the user for a password. In general,
     * <br>g_tls_interaction_invoke_ask_password() should be used instead of this
     * <br>function.
     * <br>
     * <br>Derived subclasses usually implement a password prompt, although they may
     * <br>also choose to provide a password from elsewhere. The &#64;password value will
     * <br>be filled in and then &#64;callback will be called. Alternatively the user may
     * <br>abort this password request, which will usually abort the TLS connection.
     * <br>
     * <br>If the interaction is cancelled by the cancellation object, or by the
     * <br>user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * <br>contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
     * <br>not support immediate cancellation.
     * <br>
     * <br>Certain implementations may not support immediate cancellation.
     * @param password a &#35;GTlsPassword object
     * @param cancellable an optional &#35;GCancellable cancellation object
     * @param callback will be called when the interaction completes
     * @param user_data data to pass to the &#64;callback
    */
    public void askPasswordAsync(@Nonnull TlsPassword password, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaTlsInteraction.INST().g_tls_interaction_ask_password_async(asCPointer(), asCPointerNotNull(password), asCPointer(cancellable), toOnAsyncReadyCallback(this, "askPasswordAsync", callback), asCPointer(user_data));
    }

    /**
     * Complete an ask password user interaction request. This should be once
     * <br>the g_tls_interaction_ask_password_async() completion callback is called.
     * <br>
     * <br>If %G_TLS_INTERACTION_HANDLED is returned, then the &#35;GTlsPassword passed
     * <br>to g_tls_interaction_ask_password() will have its password filled in.
     * <br>
     * <br>If the interaction is cancelled by the cancellation object, or by the
     * <br>user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * <br>contains a %G_IO_ERROR_CANCELLED error code.
     * @param result the result passed to the callback
     * @return The status of the ask password interaction.
    */
    public int askPasswordFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTlsInteraction.INST().g_tls_interaction_ask_password_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Invoke the interaction to ask the user for a password. It invokes this
     * <br>interaction in the main loop, specifically the &#35;GMainContext returned by
     * <br>g_main_context_get_thread_default() when the interaction is created. This
     * <br>is called by called by &#35;GTlsConnection or &#35;GTlsDatabase to ask the user
     * <br>for a password.
     * <br>
     * <br>Derived subclasses usually implement a password prompt, although they may
     * <br>also choose to provide a password from elsewhere. The &#64;password value will
     * <br>be filled in and then &#64;callback will be called. Alternatively the user may
     * <br>abort this password request, which will usually abort the TLS connection.
     * <br>
     * <br>The implementation can either be a synchronous (eg: modal dialog) or an
     * <br>asynchronous one (eg: modeless dialog). This function will take care of
     * <br>calling which ever one correctly.
     * <br>
     * <br>If the interaction is cancelled by the cancellation object, or by the
     * <br>user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * <br>contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
     * <br>not support immediate cancellation.
     * @param password a &#35;GTlsPassword object
     * @param cancellable an optional &#35;GCancellable cancellation object
     * @return The status of the ask password interaction.
    */
    public int invokeAskPassword(@Nonnull TlsPassword password, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTlsInteraction.INST().g_tls_interaction_invoke_ask_password(asCPointer(), asCPointerNotNull(password), asCPointer(cancellable), 0L);
    }

    /**
     * Invoke the interaction to ask the user to choose a certificate to
     * <br>use with the connection. It invokes this interaction in the main
     * <br>loop, specifically the &#35;GMainContext returned by
     * <br>g_main_context_get_thread_default() when the interaction is
     * <br>created. This is called by called by &#35;GTlsConnection when the peer
     * <br>requests a certificate during the handshake.
     * <br>
     * <br>Derived subclasses usually implement a certificate selector,
     * <br>although they may also choose to provide a certificate from
     * <br>elsewhere. Alternatively the user may abort this certificate
     * <br>request, which may or may not abort the TLS connection.
     * <br>
     * <br>The implementation can either be a synchronous (eg: modal dialog) or an
     * <br>asynchronous one (eg: modeless dialog). This function will take care of
     * <br>calling which ever one correctly.
     * <br>
     * <br>If the interaction is cancelled by the cancellation object, or by the
     * <br>user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * <br>contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
     * <br>not support immediate cancellation.
     * @param connection a &#35;GTlsConnection object
     * @param flags flags providing more information about the request
     * @param cancellable an optional &#35;GCancellable cancellation object
     * @return The status of the certificate request interaction.
    */
    public int invokeRequestCertificate(@Nonnull TlsConnection connection, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTlsInteraction.INST().g_tls_interaction_invoke_request_certificate(asCPointer(), asCPointerNotNull(connection), flags, asCPointer(cancellable), 0L);
    }

    /**
     * Run synchronous interaction to ask the user to choose a certificate to use
     * <br>with the connection. In general, g_tls_interaction_invoke_request_certificate()
     * <br>should be used instead of this function.
     * <br>
     * <br>Derived subclasses usually implement a certificate selector, although they may
     * <br>also choose to provide a certificate from elsewhere. Alternatively the user may
     * <br>abort this certificate request, which will usually abort the TLS connection.
     * <br>
     * <br>If %G_TLS_INTERACTION_HANDLED is returned, then the &#35;GTlsConnection
     * <br>passed to g_tls_interaction_request_certificate() will have had its
     * <br>&#35;GTlsConnection:certificate filled in.
     * <br>
     * <br>If the interaction is cancelled by the cancellation object, or by the
     * <br>user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * <br>contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
     * <br>not support immediate cancellation.
     * @param connection a &#35;GTlsConnection object
     * @param flags flags providing more information about the request
     * @param cancellable an optional &#35;GCancellable cancellation object
     * @return The status of the request certificate interaction.
    */
    public int requestCertificate(@Nonnull TlsConnection connection, int flags, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTlsInteraction.INST().g_tls_interaction_request_certificate(asCPointer(), asCPointerNotNull(connection), flags, asCPointer(cancellable), 0L);
    }

    /**
     * Run asynchronous interaction to ask the user for a certificate to use with
     * <br>the connection. In general, g_tls_interaction_invoke_request_certificate() should
     * <br>be used instead of this function.
     * <br>
     * <br>Derived subclasses usually implement a certificate selector, although they may
     * <br>also choose to provide a certificate from elsewhere. &#64;callback will be called
     * <br>when the operation completes. Alternatively the user may abort this certificate
     * <br>request, which will usually abort the TLS connection.
     * @param connection a &#35;GTlsConnection object
     * @param flags flags providing more information about the request
     * @param cancellable an optional &#35;GCancellable cancellation object
     * @param callback will be called when the interaction completes
     * @param user_data data to pass to the &#64;callback
    */
    public void requestCertificateAsync(@Nonnull TlsConnection connection, int flags, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaTlsInteraction.INST().g_tls_interaction_request_certificate_async(asCPointer(), asCPointerNotNull(connection), flags, asCPointer(cancellable), toOnAsyncReadyCallback(this, "requestCertificateAsync", callback), asCPointer(user_data));
    }

    /**
     * Complete a request certificate user interaction request. This should be once
     * <br>the g_tls_interaction_request_certificate_async() completion callback is called.
     * <br>
     * <br>If %G_TLS_INTERACTION_HANDLED is returned, then the &#35;GTlsConnection
     * <br>passed to g_tls_interaction_request_certificate_async() will have had its
     * <br>&#35;GTlsConnection:certificate filled in.
     * <br>
     * <br>If the interaction is cancelled by the cancellation object, or by the
     * <br>user then %G_TLS_INTERACTION_FAILED will be returned with an error that
     * <br>contains a %G_IO_ERROR_CANCELLED error code.
     * @param result the result passed to the callback
     * @return The status of the request certificate interaction.
    */
    public int requestCertificateFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTlsInteraction.INST().g_tls_interaction_request_certificate_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    public static long getTypeID() { 
        return JnaTlsInteraction.INST().g_tls_interaction_get_type(); 
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
