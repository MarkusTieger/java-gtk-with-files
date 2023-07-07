/* this file is machine generated */
package ch.bailu.gtk.geoclue;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Abstract interface type for the D-Bus interface &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Manager.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Manager&lt;/link&gt;.
 * <p><a href="https://www.freedesktop.org/software/geoclue/docs/libgeoclue/">https://www.freedesktop.org/software/geoclue/docs/libgeoclue/</a></p>
*/
public class Manager extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Manager.class.getCanonicalName());
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
        void onAsyncReadyCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.gobject.Object source_object, @Nonnull ch.bailu.gtk.gio.AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaManager.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaManager.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new ch.bailu.gtk.gio.AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHandleAddAgent {
        /**
         * Signal emitted when a remote caller is invoking the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.AddAgent&quot;&gt;AddAgent()&lt;/link&gt; D-Bus method.
         * <br>
         * <br>If a signal handler returns %TRUE, it means the signal handler will handle the invocation (e.g. take a reference to &#64;invocation and eventually call gclue_manager_complete_add_agent() or e.g. g_dbus_method_invocation_return_error() on it) and no other signal handlers will run. If no signal handler handles the invocation, the %G_DBUS_ERROR_UNKNOWN_METHOD error is returned.
         * @param invocation A &#35;GDBusMethodInvocation.
         * @param arg_id Argument passed by remote caller.
         * @return %G_DBUS_METHOD_INVOCATION_HANDLED or %TRUE if the invocation was handled, %G_DBUS_METHOD_INVOCATION_UNHANDLED or %FALSE to let other signal handlers run.
        */
        boolean onHandleAddAgent(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation, @Nonnull ch.bailu.gtk.type.Str arg_id);
    }
    
    private static com.sun.jna.Callback toOnHandleAddAgent(OnHandleAddAgent in) {
        return (in == null) ? null: (JnaManager.OnHandleAddAgent) (__self, _invocation, _arg_id, __data) -> in.onHandleAddAgent(new ch.bailu.gtk.gio.DBusMethodInvocation(new PointerContainer(_invocation)), new ch.bailu.gtk.type.Str(new PointerContainer(_arg_id)));
    }

    @FunctionalInterface
    public interface OnHandleCreateClient {
        /**
         * Signal emitted when a remote caller is invoking the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.CreateClient&quot;&gt;CreateClient()&lt;/link&gt; D-Bus method.
         * <br>
         * <br>If a signal handler returns %TRUE, it means the signal handler will handle the invocation (e.g. take a reference to &#64;invocation and eventually call gclue_manager_complete_create_client() or e.g. g_dbus_method_invocation_return_error() on it) and no other signal handlers will run. If no signal handler handles the invocation, the %G_DBUS_ERROR_UNKNOWN_METHOD error is returned.
         * @param invocation A &#35;GDBusMethodInvocation.
         * @return %G_DBUS_METHOD_INVOCATION_HANDLED or %TRUE if the invocation was handled, %G_DBUS_METHOD_INVOCATION_UNHANDLED or %FALSE to let other signal handlers run.
        */
        boolean onHandleCreateClient(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation);
    }
    
    private static com.sun.jna.Callback toOnHandleCreateClient(OnHandleCreateClient in) {
        return (in == null) ? null: (JnaManager.OnHandleCreateClient) (__self, _invocation, __data) -> in.onHandleCreateClient(new ch.bailu.gtk.gio.DBusMethodInvocation(new PointerContainer(_invocation)));
    }

    @FunctionalInterface
    public interface OnHandleDeleteClient {
        /**
         * Signal emitted when a remote caller is invoking the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.DeleteClient&quot;&gt;DeleteClient()&lt;/link&gt; D-Bus method.
         * <br>
         * <br>If a signal handler returns %TRUE, it means the signal handler will handle the invocation (e.g. take a reference to &#64;invocation and eventually call gclue_manager_complete_delete_client() or e.g. g_dbus_method_invocation_return_error() on it) and no other signal handlers will run. If no signal handler handles the invocation, the %G_DBUS_ERROR_UNKNOWN_METHOD error is returned.
         * @param invocation A &#35;GDBusMethodInvocation.
         * @param arg_client Argument passed by remote caller.
         * @return %G_DBUS_METHOD_INVOCATION_HANDLED or %TRUE if the invocation was handled, %G_DBUS_METHOD_INVOCATION_UNHANDLED or %FALSE to let other signal handlers run.
        */
        boolean onHandleDeleteClient(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation, @Nonnull ch.bailu.gtk.type.Str arg_client);
    }
    
    private static com.sun.jna.Callback toOnHandleDeleteClient(OnHandleDeleteClient in) {
        return (in == null) ? null: (JnaManager.OnHandleDeleteClient) (__self, _invocation, _arg_client, __data) -> in.onHandleDeleteClient(new ch.bailu.gtk.gio.DBusMethodInvocation(new PointerContainer(_invocation)), new ch.bailu.gtk.type.Str(new PointerContainer(_arg_client)));
    }

    @FunctionalInterface
    public interface OnHandleGetClient {
        /**
         * Signal emitted when a remote caller is invoking the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.GetClient&quot;&gt;GetClient()&lt;/link&gt; D-Bus method.
         * <br>
         * <br>If a signal handler returns %TRUE, it means the signal handler will handle the invocation (e.g. take a reference to &#64;invocation and eventually call gclue_manager_complete_get_client() or e.g. g_dbus_method_invocation_return_error() on it) and no other signal handlers will run. If no signal handler handles the invocation, the %G_DBUS_ERROR_UNKNOWN_METHOD error is returned.
         * @param invocation A &#35;GDBusMethodInvocation.
         * @return %G_DBUS_METHOD_INVOCATION_HANDLED or %TRUE if the invocation was handled, %G_DBUS_METHOD_INVOCATION_UNHANDLED or %FALSE to let other signal handlers run.
        */
        boolean onHandleGetClient(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation);
    }
    
    private static com.sun.jna.Callback toOnHandleGetClient(OnHandleGetClient in) {
        return (in == null) ? null: (JnaManager.OnHandleGetClient) (__self, _invocation, __data) -> in.onHandleGetClient(new ch.bailu.gtk.gio.DBusMethodInvocation(new PointerContainer(_invocation)));
    }

    public Manager(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Asynchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.AddAgent&quot;&gt;AddAgent()&lt;/link&gt; D-Bus method on &#64;proxy.
     * <br>When the operation is finished, &#64;callback will be invoked in the thread-default main loop of the thread you are calling this method from (see g_main_context_push_thread_default()).
     * <br>You can then call gclue_manager_call_add_agent_finish() to get the result of the operation.
     * <br>
     * <br>See gclue_manager_call_add_agent_sync() for the synchronous, blocking version of this method.
     * @param arg_id Argument to pass with the method invocation.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied or %NULL.
     * @param user_data User data to pass to &#64;callback.
    */
    public void callAddAgent(@Nonnull ch.bailu.gtk.type.Str arg_id, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaManager.INST().gclue_manager_call_add_agent(asCPointer(), asCPointerNotNull(arg_id), asCPointer(cancellable), toOnAsyncReadyCallback(this, "callAddAgent", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.AddAgent&quot;&gt;AddAgent()&lt;/link&gt; D-Bus method on &#64;proxy.
     * <br>When the operation is finished, &#64;callback will be invoked in the thread-default main loop of the thread you are calling this method from (see g_main_context_push_thread_default()).
     * <br>You can then call gclue_manager_call_add_agent_finish() to get the result of the operation.
     * <br>
     * <br>See gclue_manager_call_add_agent_sync() for the synchronous, blocking version of this method.
     * @param arg_id Argument to pass with the method invocation.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied or %NULL.
     * @param user_data User data to pass to &#64;callback.
    */
    public void callAddAgent(String arg_id, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaManager.INST().gclue_manager_call_add_agent(asCPointer(), arg_id, asCPointer(cancellable), toOnAsyncReadyCallback(this, "callAddAgent", callback), asCPointer(user_data));
    }

    /**
     * Finishes an operation started with gclue_manager_call_add_agent().
     * @param res The &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to gclue_manager_call_add_agent().
     * @return %TRUE if the call succeeded, %FALSE if &#64;error is set.
    */
    public boolean callAddAgentFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaManager.INST().gclue_manager_call_add_agent_finish(asCPointer(), asCPointerNotNull(res), 0L);
    }

    /**
     * Synchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.AddAgent&quot;&gt;AddAgent()&lt;/link&gt; D-Bus method on &#64;proxy. The calling thread is blocked until a reply is received.
     * <br>
     * <br>See gclue_manager_call_add_agent() for the asynchronous version of this method.
     * @param arg_id Argument to pass with the method invocation.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return %TRUE if the call succeeded, %FALSE if &#64;error is set.
    */
    public boolean callAddAgentSync(@Nonnull ch.bailu.gtk.type.Str arg_id, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaManager.INST().gclue_manager_call_add_agent_sync(asCPointer(), asCPointerNotNull(arg_id), asCPointer(cancellable), 0L);
    }

    /**
     * Synchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.AddAgent&quot;&gt;AddAgent()&lt;/link&gt; D-Bus method on &#64;proxy. The calling thread is blocked until a reply is received.
     * <br>
     * <br>See gclue_manager_call_add_agent() for the asynchronous version of this method.
     * @param arg_id Argument to pass with the method invocation.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return %TRUE if the call succeeded, %FALSE if &#64;error is set.
    */
    public boolean callAddAgentSync(String arg_id, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaManager.INST().gclue_manager_call_add_agent_sync(asCPointer(), arg_id, asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.CreateClient&quot;&gt;CreateClient()&lt;/link&gt; D-Bus method on &#64;proxy.
     * <br>When the operation is finished, &#64;callback will be invoked in the thread-default main loop of the thread you are calling this method from (see g_main_context_push_thread_default()).
     * <br>You can then call gclue_manager_call_create_client_finish() to get the result of the operation.
     * <br>
     * <br>See gclue_manager_call_create_client_sync() for the synchronous, blocking version of this method.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied or %NULL.
     * @param user_data User data to pass to &#64;callback.
    */
    public void callCreateClient(@Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaManager.INST().gclue_manager_call_create_client(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "callCreateClient", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.DeleteClient&quot;&gt;DeleteClient()&lt;/link&gt; D-Bus method on &#64;proxy.
     * <br>When the operation is finished, &#64;callback will be invoked in the thread-default main loop of the thread you are calling this method from (see g_main_context_push_thread_default()).
     * <br>You can then call gclue_manager_call_delete_client_finish() to get the result of the operation.
     * <br>
     * <br>See gclue_manager_call_delete_client_sync() for the synchronous, blocking version of this method.
     * @param arg_client Argument to pass with the method invocation.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied or %NULL.
     * @param user_data User data to pass to &#64;callback.
    */
    public void callDeleteClient(@Nonnull ch.bailu.gtk.type.Str arg_client, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaManager.INST().gclue_manager_call_delete_client(asCPointer(), asCPointerNotNull(arg_client), asCPointer(cancellable), toOnAsyncReadyCallback(this, "callDeleteClient", callback), asCPointer(user_data));
    }

    /**
     * Asynchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.DeleteClient&quot;&gt;DeleteClient()&lt;/link&gt; D-Bus method on &#64;proxy.
     * <br>When the operation is finished, &#64;callback will be invoked in the thread-default main loop of the thread you are calling this method from (see g_main_context_push_thread_default()).
     * <br>You can then call gclue_manager_call_delete_client_finish() to get the result of the operation.
     * <br>
     * <br>See gclue_manager_call_delete_client_sync() for the synchronous, blocking version of this method.
     * @param arg_client Argument to pass with the method invocation.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied or %NULL.
     * @param user_data User data to pass to &#64;callback.
    */
    public void callDeleteClient(String arg_client, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaManager.INST().gclue_manager_call_delete_client(asCPointer(), arg_client, asCPointer(cancellable), toOnAsyncReadyCallback(this, "callDeleteClient", callback), asCPointer(user_data));
    }

    /**
     * Finishes an operation started with gclue_manager_call_delete_client().
     * @param res The &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to gclue_manager_call_delete_client().
     * @return %TRUE if the call succeeded, %FALSE if &#64;error is set.
    */
    public boolean callDeleteClientFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaManager.INST().gclue_manager_call_delete_client_finish(asCPointer(), asCPointerNotNull(res), 0L);
    }

    /**
     * Synchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.DeleteClient&quot;&gt;DeleteClient()&lt;/link&gt; D-Bus method on &#64;proxy. The calling thread is blocked until a reply is received.
     * <br>
     * <br>See gclue_manager_call_delete_client() for the asynchronous version of this method.
     * @param arg_client Argument to pass with the method invocation.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return %TRUE if the call succeeded, %FALSE if &#64;error is set.
    */
    public boolean callDeleteClientSync(@Nonnull ch.bailu.gtk.type.Str arg_client, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaManager.INST().gclue_manager_call_delete_client_sync(asCPointer(), asCPointerNotNull(arg_client), asCPointer(cancellable), 0L);
    }

    /**
     * Synchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.DeleteClient&quot;&gt;DeleteClient()&lt;/link&gt; D-Bus method on &#64;proxy. The calling thread is blocked until a reply is received.
     * <br>
     * <br>See gclue_manager_call_delete_client() for the asynchronous version of this method.
     * @param arg_client Argument to pass with the method invocation.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return %TRUE if the call succeeded, %FALSE if &#64;error is set.
    */
    public boolean callDeleteClientSync(String arg_client, @Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaManager.INST().gclue_manager_call_delete_client_sync(asCPointer(), arg_client, asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.GetClient&quot;&gt;GetClient()&lt;/link&gt; D-Bus method on &#64;proxy.
     * <br>When the operation is finished, &#64;callback will be invoked in the thread-default main loop of the thread you are calling this method from (see g_main_context_push_thread_default()).
     * <br>You can then call gclue_manager_call_get_client_finish() to get the result of the operation.
     * <br>
     * <br>See gclue_manager_call_get_client_sync() for the synchronous, blocking version of this method.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied or %NULL.
     * @param user_data User data to pass to &#64;callback.
    */
    public void callGetClient(@Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaManager.INST().gclue_manager_call_get_client(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "callGetClient", callback), asCPointer(user_data));
    }

    /**
     * Helper function used in service implementations to finish handling invocations of the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.AddAgent&quot;&gt;AddAgent()&lt;/link&gt; D-Bus method. If you instead want to finish handling an invocation by returning an error, use g_dbus_method_invocation_return_error() or similar.
     * <br>
     * <br>This method will free &#64;invocation, you cannot use it afterwards.
     * @param invocation A &#35;GDBusMethodInvocation.
    */
    public void completeAddAgent(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation)  {
        JnaManager.INST().gclue_manager_complete_add_agent(asCPointer(), asCPointerNotNull(invocation));
    }

    /**
     * Helper function used in service implementations to finish handling invocations of the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.CreateClient&quot;&gt;CreateClient()&lt;/link&gt; D-Bus method. If you instead want to finish handling an invocation by returning an error, use g_dbus_method_invocation_return_error() or similar.
     * <br>
     * <br>This method will free &#64;invocation, you cannot use it afterwards.
     * @param invocation A &#35;GDBusMethodInvocation.
     * @param client Parameter to return.
    */
    public void completeCreateClient(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation, @Nonnull ch.bailu.gtk.type.Str client)  {
        JnaManager.INST().gclue_manager_complete_create_client(asCPointer(), asCPointerNotNull(invocation), asCPointerNotNull(client));
    }

    /**
     * Helper function used in service implementations to finish handling invocations of the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.CreateClient&quot;&gt;CreateClient()&lt;/link&gt; D-Bus method. If you instead want to finish handling an invocation by returning an error, use g_dbus_method_invocation_return_error() or similar.
     * <br>
     * <br>This method will free &#64;invocation, you cannot use it afterwards.
     * @param invocation A &#35;GDBusMethodInvocation.
     * @param client Parameter to return.
    */
    public void completeCreateClient(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation, String client)  {
        JnaManager.INST().gclue_manager_complete_create_client(asCPointer(), asCPointerNotNull(invocation), client);
    }

    /**
     * Helper function used in service implementations to finish handling invocations of the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.DeleteClient&quot;&gt;DeleteClient()&lt;/link&gt; D-Bus method. If you instead want to finish handling an invocation by returning an error, use g_dbus_method_invocation_return_error() or similar.
     * <br>
     * <br>This method will free &#64;invocation, you cannot use it afterwards.
     * @param invocation A &#35;GDBusMethodInvocation.
    */
    public void completeDeleteClient(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation)  {
        JnaManager.INST().gclue_manager_complete_delete_client(asCPointer(), asCPointerNotNull(invocation));
    }

    /**
     * Helper function used in service implementations to finish handling invocations of the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.GetClient&quot;&gt;GetClient()&lt;/link&gt; D-Bus method. If you instead want to finish handling an invocation by returning an error, use g_dbus_method_invocation_return_error() or similar.
     * <br>
     * <br>This method will free &#64;invocation, you cannot use it afterwards.
     * @param invocation A &#35;GDBusMethodInvocation.
     * @param client Parameter to return.
    */
    public void completeGetClient(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation, @Nonnull ch.bailu.gtk.type.Str client)  {
        JnaManager.INST().gclue_manager_complete_get_client(asCPointer(), asCPointerNotNull(invocation), asCPointerNotNull(client));
    }

    /**
     * Helper function used in service implementations to finish handling invocations of the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Manager.GetClient&quot;&gt;GetClient()&lt;/link&gt; D-Bus method. If you instead want to finish handling an invocation by returning an error, use g_dbus_method_invocation_return_error() or similar.
     * <br>
     * <br>This method will free &#64;invocation, you cannot use it afterwards.
     * @param invocation A &#35;GDBusMethodInvocation.
     * @param client Parameter to return.
    */
    public void completeGetClient(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation, String client)  {
        JnaManager.INST().gclue_manager_complete_get_client(asCPointer(), asCPointerNotNull(invocation), client);
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Manager.AvailableAccuracyLevel&quot;&gt;&quot;AvailableAccuracyLevel&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value.
    */
    public int getAvailableAccuracyLevel()  {
        return JnaManager.INST().gclue_manager_get_available_accuracy_level(asCPointer());
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Manager.InUse&quot;&gt;&quot;InUse&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value.
    */
    public boolean getInUse()  {
        return JnaManager.INST().gclue_manager_get_in_use(asCPointer());
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Manager.AvailableAccuracyLevel&quot;&gt;&quot;AvailableAccuracyLevel&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setAvailableAccuracyLevel(int value)  {
        JnaManager.INST().gclue_manager_set_available_accuracy_level(asCPointer(), value);
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Manager.InUse&quot;&gt;&quot;InUse&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setInUse(boolean value)  {
        JnaManager.INST().gclue_manager_set_in_use(asCPointer(), value);
    }

    public final static String SIGNAL_ON_HANDLE_ADD_AGENT = "handle-add-agent";
    
    /**
     * Connect to signal "handle-add-agent".
     * <br>See {@link OnHandleAddAgent#onHandleAddAgent} for signal description.
     * <br>Field {@link #SIGNAL_ON_HANDLE_ADD_AGENT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onHandleAddAgent(OnHandleAddAgent signal) {
        return connectSignal(SIGNAL_ON_HANDLE_ADD_AGENT, toOnHandleAddAgent(signal));
    }

    public final static String SIGNAL_ON_HANDLE_CREATE_CLIENT = "handle-create-client";
    
    /**
     * Connect to signal "handle-create-client".
     * <br>See {@link OnHandleCreateClient#onHandleCreateClient} for signal description.
     * <br>Field {@link #SIGNAL_ON_HANDLE_CREATE_CLIENT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onHandleCreateClient(OnHandleCreateClient signal) {
        return connectSignal(SIGNAL_ON_HANDLE_CREATE_CLIENT, toOnHandleCreateClient(signal));
    }

    public final static String SIGNAL_ON_HANDLE_DELETE_CLIENT = "handle-delete-client";
    
    /**
     * Connect to signal "handle-delete-client".
     * <br>See {@link OnHandleDeleteClient#onHandleDeleteClient} for signal description.
     * <br>Field {@link #SIGNAL_ON_HANDLE_DELETE_CLIENT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onHandleDeleteClient(OnHandleDeleteClient signal) {
        return connectSignal(SIGNAL_ON_HANDLE_DELETE_CLIENT, toOnHandleDeleteClient(signal));
    }

    public final static String SIGNAL_ON_HANDLE_GET_CLIENT = "handle-get-client";
    
    /**
     * Connect to signal "handle-get-client".
     * <br>See {@link OnHandleGetClient#onHandleGetClient} for signal description.
     * <br>Field {@link #SIGNAL_ON_HANDLE_GET_CLIENT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onHandleGetClient(OnHandleGetClient signal) {
        return connectSignal(SIGNAL_ON_HANDLE_GET_CLIENT, toOnHandleGetClient(signal));
    }

    /**
     * Gets a machine-readable description of the &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Manager.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Manager&lt;/link&gt; D-Bus interface.
     * @return A &#35;GDBusInterfaceInfo. Do not free.
    */
    public static ch.bailu.gtk.gio.DBusInterfaceInfo interfaceInfo()  {
        return new ch.bailu.gtk.gio.DBusInterfaceInfo(new PointerContainer(JnaManager.INST().gclue_manager_interface_info()));
    }

    /**
     * Overrides all &#35;GObject properties in the &#35;GClueManager interface for a concrete class.
     * <br>The properties are overridden in the order they are defined.
     * @param klass The class structure for a &#35;GObject derived class.
     * @param property_id_begin The property id to assign to the first overridden property.
     * @return The last property id.
    */
    public static int overrideProperties(@Nonnull ch.bailu.gtk.gobject.ObjectClass klass, int property_id_begin)  {
        return JnaManager.INST().gclue_manager_override_properties(asCPointerNotNull(klass), property_id_begin);
    }

    public static long getTypeID() { 
        return JnaManager.INST().gclue_manager_get_type(); 
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

[MethodModel:java-type-not-supported:callCreateClientFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[MethodModel:java-type-not-supported:callCreateClientSync:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:java-type-not-supported:callGetClientFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[MethodModel:java-type-not-supported:callGetClientSync:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
*/
