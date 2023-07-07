/* this file is machine generated */
package ch.bailu.gtk.geoclue;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Abstract interface type for the D-Bus interface &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Client.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Client&lt;/link&gt;.
 * <p><a href="https://www.freedesktop.org/software/geoclue/docs/libgeoclue/">https://www.freedesktop.org/software/geoclue/docs/libgeoclue/</a></p>
*/
public class Client extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Client.class.getCanonicalName());
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
    
    private static JnaClient.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaClient.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new ch.bailu.gtk.gio.AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHandleStart {
        /**
         * Signal emitted when a remote caller is invoking the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Client.Start&quot;&gt;Start()&lt;/link&gt; D-Bus method.
         * <br>
         * <br>If a signal handler returns %TRUE, it means the signal handler will handle the invocation (e.g. take a reference to &#64;invocation and eventually call gclue_client_complete_start() or e.g. g_dbus_method_invocation_return_error() on it) and no other signal handlers will run. If no signal handler handles the invocation, the %G_DBUS_ERROR_UNKNOWN_METHOD error is returned.
         * @param invocation A &#35;GDBusMethodInvocation.
         * @return %G_DBUS_METHOD_INVOCATION_HANDLED or %TRUE if the invocation was handled, %G_DBUS_METHOD_INVOCATION_UNHANDLED or %FALSE to let other signal handlers run.
        */
        boolean onHandleStart(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation);
    }
    
    private static com.sun.jna.Callback toOnHandleStart(OnHandleStart in) {
        return (in == null) ? null: (JnaClient.OnHandleStart) (__self, _invocation, __data) -> in.onHandleStart(new ch.bailu.gtk.gio.DBusMethodInvocation(new PointerContainer(_invocation)));
    }

    @FunctionalInterface
    public interface OnHandleStop {
        /**
         * Signal emitted when a remote caller is invoking the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Client.Stop&quot;&gt;Stop()&lt;/link&gt; D-Bus method.
         * <br>
         * <br>If a signal handler returns %TRUE, it means the signal handler will handle the invocation (e.g. take a reference to &#64;invocation and eventually call gclue_client_complete_stop() or e.g. g_dbus_method_invocation_return_error() on it) and no other signal handlers will run. If no signal handler handles the invocation, the %G_DBUS_ERROR_UNKNOWN_METHOD error is returned.
         * @param invocation A &#35;GDBusMethodInvocation.
         * @return %G_DBUS_METHOD_INVOCATION_HANDLED or %TRUE if the invocation was handled, %G_DBUS_METHOD_INVOCATION_UNHANDLED or %FALSE to let other signal handlers run.
        */
        boolean onHandleStop(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation);
    }
    
    private static com.sun.jna.Callback toOnHandleStop(OnHandleStop in) {
        return (in == null) ? null: (JnaClient.OnHandleStop) (__self, _invocation, __data) -> in.onHandleStop(new ch.bailu.gtk.gio.DBusMethodInvocation(new PointerContainer(_invocation)));
    }

    @FunctionalInterface
    public interface OnLocationUpdated {
        /**
         * On the client-side, this signal is emitted whenever the D-Bus signal &lt;link linkend=&quot;gdbus-signal-org-freedesktop-GeoClue2-Client.LocationUpdated&quot;&gt;&quot;LocationUpdated&quot;&lt;/link&gt; is received.
         * <br>
         * <br>On the service-side, this signal can be used with e.g. g_signal_emit_by_name() to make the object emit the D-Bus signal.
         * @param arg_old Argument.
         * @param arg_new Argument.
        */
        void onLocationUpdated(@Nonnull ch.bailu.gtk.type.Str arg_old, @Nonnull ch.bailu.gtk.type.Str arg_new);
    }
    
    private static com.sun.jna.Callback toOnLocationUpdated(OnLocationUpdated in) {
        return (in == null) ? null: (JnaClient.OnLocationUpdated) (__self, _arg_old, _arg_new, __data) -> in.onLocationUpdated(new ch.bailu.gtk.type.Str(new PointerContainer(_arg_old)), new ch.bailu.gtk.type.Str(new PointerContainer(_arg_new)));
    }

    public Client(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Asynchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Client.Start&quot;&gt;Start()&lt;/link&gt; D-Bus method on &#64;proxy.
     * <br>When the operation is finished, &#64;callback will be invoked in the thread-default main loop of the thread you are calling this method from (see g_main_context_push_thread_default()).
     * <br>You can then call gclue_client_call_start_finish() to get the result of the operation.
     * <br>
     * <br>See gclue_client_call_start_sync() for the synchronous, blocking version of this method.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied or %NULL.
     * @param user_data User data to pass to &#64;callback.
    */
    public void callStart(@Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaClient.INST().gclue_client_call_start(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "callStart", callback), asCPointer(user_data));
    }

    /**
     * Finishes an operation started with gclue_client_call_start().
     * @param res The &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to gclue_client_call_start().
     * @return %TRUE if the call succeeded, %FALSE if &#64;error is set.
    */
    public boolean callStartFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaClient.INST().gclue_client_call_start_finish(asCPointer(), asCPointerNotNull(res), 0L);
    }

    /**
     * Synchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Client.Start&quot;&gt;Start()&lt;/link&gt; D-Bus method on &#64;proxy. The calling thread is blocked until a reply is received.
     * <br>
     * <br>See gclue_client_call_start() for the asynchronous version of this method.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return %TRUE if the call succeeded, %FALSE if &#64;error is set.
    */
    public boolean callStartSync(@Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaClient.INST().gclue_client_call_start_sync(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Client.Stop&quot;&gt;Stop()&lt;/link&gt; D-Bus method on &#64;proxy.
     * <br>When the operation is finished, &#64;callback will be invoked in the thread-default main loop of the thread you are calling this method from (see g_main_context_push_thread_default()).
     * <br>You can then call gclue_client_call_stop_finish() to get the result of the operation.
     * <br>
     * <br>See gclue_client_call_stop_sync() for the synchronous, blocking version of this method.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @param callback A &#35;GAsyncReadyCallback to call when the request is satisfied or %NULL.
     * @param user_data User data to pass to &#64;callback.
    */
    public void callStop(@Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaClient.INST().gclue_client_call_stop(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "callStop", callback), asCPointer(user_data));
    }

    /**
     * Finishes an operation started with gclue_client_call_stop().
     * @param res The &#35;GAsyncResult obtained from the &#35;GAsyncReadyCallback passed to gclue_client_call_stop().
     * @return %TRUE if the call succeeded, %FALSE if &#64;error is set.
    */
    public boolean callStopFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaClient.INST().gclue_client_call_stop_finish(asCPointer(), asCPointerNotNull(res), 0L);
    }

    /**
     * Synchronously invokes the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Client.Stop&quot;&gt;Stop()&lt;/link&gt; D-Bus method on &#64;proxy. The calling thread is blocked until a reply is received.
     * <br>
     * <br>See gclue_client_call_stop() for the asynchronous version of this method.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return %TRUE if the call succeeded, %FALSE if &#64;error is set.
    */
    public boolean callStopSync(@Nullable ch.bailu.gtk.gio.Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaClient.INST().gclue_client_call_stop_sync(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Helper function used in service implementations to finish handling invocations of the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Client.Start&quot;&gt;Start()&lt;/link&gt; D-Bus method. If you instead want to finish handling an invocation by returning an error, use g_dbus_method_invocation_return_error() or similar.
     * <br>
     * <br>This method will free &#64;invocation, you cannot use it afterwards.
     * @param invocation A &#35;GDBusMethodInvocation.
    */
    public void completeStart(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation)  {
        JnaClient.INST().gclue_client_complete_start(asCPointer(), asCPointerNotNull(invocation));
    }

    /**
     * Helper function used in service implementations to finish handling invocations of the &lt;link linkend=&quot;gdbus-method-org-freedesktop-GeoClue2-Client.Stop&quot;&gt;Stop()&lt;/link&gt; D-Bus method. If you instead want to finish handling an invocation by returning an error, use g_dbus_method_invocation_return_error() or similar.
     * <br>
     * <br>This method will free &#64;invocation, you cannot use it afterwards.
     * @param invocation A &#35;GDBusMethodInvocation.
    */
    public void completeStop(@Nonnull ch.bailu.gtk.gio.DBusMethodInvocation invocation)  {
        JnaClient.INST().gclue_client_complete_stop(asCPointer(), asCPointerNotNull(invocation));
    }

    /**
     * Gets a copy of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.DesktopId&quot;&gt;&quot;DesktopId&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is both readable and writable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value or %NULL if the property is not set. The returned value should be freed with g_free().
    */
    public ch.bailu.gtk.type.Str dupDesktopId()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaClient.INST().gclue_client_dup_desktop_id(asCPointer())));
    }

    /**
     * Gets a copy of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.Location&quot;&gt;&quot;Location&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value or %NULL if the property is not set. The returned value should be freed with g_free().
    */
    public ch.bailu.gtk.type.Str dupLocation()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaClient.INST().gclue_client_dup_location(asCPointer())));
    }

    /**
     * Emits the &lt;link linkend=&quot;gdbus-signal-org-freedesktop-GeoClue2-Client.LocationUpdated&quot;&gt;&quot;LocationUpdated&quot;&lt;/link&gt; D-Bus signal.
     * @param arg_old Argument to pass with the signal.
     * @param arg_new Argument to pass with the signal.
    */
    public void emitLocationUpdated(@Nonnull ch.bailu.gtk.type.Str arg_old, @Nonnull ch.bailu.gtk.type.Str arg_new)  {
        JnaClient.INST().gclue_client_emit_location_updated(asCPointer(), asCPointerNotNull(arg_old), asCPointerNotNull(arg_new));
    }

    /**
     * Emits the &lt;link linkend=&quot;gdbus-signal-org-freedesktop-GeoClue2-Client.LocationUpdated&quot;&gt;&quot;LocationUpdated&quot;&lt;/link&gt; D-Bus signal.
     * @param arg_old Argument to pass with the signal.
     * @param arg_new Argument to pass with the signal.
    */
    public void emitLocationUpdated(String arg_old, String arg_new)  {
        JnaClient.INST().gclue_client_emit_location_updated(asCPointer(), arg_old, arg_new);
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.Active&quot;&gt;&quot;Active&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value.
    */
    public boolean getActive()  {
        return JnaClient.INST().gclue_client_get_active(asCPointer());
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.DesktopId&quot;&gt;&quot;DesktopId&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is both readable and writable, it is meaningful to use this function on both the client- and service-side.
     * <br>
     * <br>The returned value is only valid until the property changes so on the client-side it is only safe to use this function on the thread where &#64;object was constructed. Use gclue_client_dup_desktop_id() if on another thread.
     * @return The property value or %NULL if the property is not set. Do not free the returned value, it belongs to &#64;object.
    */
    public ch.bailu.gtk.type.Str getDesktopId()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaClient.INST().gclue_client_get_desktop_id(asCPointer())));
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.DistanceThreshold&quot;&gt;&quot;DistanceThreshold&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is both readable and writable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value.
    */
    public int getDistanceThreshold()  {
        return JnaClient.INST().gclue_client_get_distance_threshold(asCPointer());
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.Location&quot;&gt;&quot;Location&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * <br>
     * <br>The returned value is only valid until the property changes so on the client-side it is only safe to use this function on the thread where &#64;object was constructed. Use gclue_client_dup_location() if on another thread.
     * @return The property value or %NULL if the property is not set. Do not free the returned value, it belongs to &#64;object.
    */
    public ch.bailu.gtk.type.Str getLocation()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaClient.INST().gclue_client_get_location(asCPointer())));
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.RequestedAccuracyLevel&quot;&gt;&quot;RequestedAccuracyLevel&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is both readable and writable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value.
    */
    public int getRequestedAccuracyLevel()  {
        return JnaClient.INST().gclue_client_get_requested_accuracy_level(asCPointer());
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.TimeThreshold&quot;&gt;&quot;TimeThreshold&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is both readable and writable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value.
    */
    public int getTimeThreshold()  {
        return JnaClient.INST().gclue_client_get_time_threshold(asCPointer());
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.Active&quot;&gt;&quot;Active&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setActive(boolean value)  {
        JnaClient.INST().gclue_client_set_active(asCPointer(), value);
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.DesktopId&quot;&gt;&quot;DesktopId&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is both readable and writable, it is meaningful to use this function on both the client- and service-side.
     * @param value The value to set.
    */
    public void setDesktopId(@Nonnull ch.bailu.gtk.type.Str value)  {
        JnaClient.INST().gclue_client_set_desktop_id(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.DesktopId&quot;&gt;&quot;DesktopId&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is both readable and writable, it is meaningful to use this function on both the client- and service-side.
     * @param value The value to set.
    */
    public void setDesktopId(String value)  {
        JnaClient.INST().gclue_client_set_desktop_id(asCPointer(), value);
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.DistanceThreshold&quot;&gt;&quot;DistanceThreshold&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is both readable and writable, it is meaningful to use this function on both the client- and service-side.
     * @param value The value to set.
    */
    public void setDistanceThreshold(int value)  {
        JnaClient.INST().gclue_client_set_distance_threshold(asCPointer(), value);
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.Location&quot;&gt;&quot;Location&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setLocation(@Nonnull ch.bailu.gtk.type.Str value)  {
        JnaClient.INST().gclue_client_set_location(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.Location&quot;&gt;&quot;Location&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setLocation(String value)  {
        JnaClient.INST().gclue_client_set_location(asCPointer(), value);
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.RequestedAccuracyLevel&quot;&gt;&quot;RequestedAccuracyLevel&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is both readable and writable, it is meaningful to use this function on both the client- and service-side.
     * @param value The value to set.
    */
    public void setRequestedAccuracyLevel(int value)  {
        JnaClient.INST().gclue_client_set_requested_accuracy_level(asCPointer(), value);
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Client.TimeThreshold&quot;&gt;&quot;TimeThreshold&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is both readable and writable, it is meaningful to use this function on both the client- and service-side.
     * @param value The value to set.
    */
    public void setTimeThreshold(int value)  {
        JnaClient.INST().gclue_client_set_time_threshold(asCPointer(), value);
    }

    public final static String SIGNAL_ON_HANDLE_START = "handle-start";
    
    /**
     * Connect to signal "handle-start".
     * <br>See {@link OnHandleStart#onHandleStart} for signal description.
     * <br>Field {@link #SIGNAL_ON_HANDLE_START} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onHandleStart(OnHandleStart signal) {
        return connectSignal(SIGNAL_ON_HANDLE_START, toOnHandleStart(signal));
    }

    public final static String SIGNAL_ON_HANDLE_STOP = "handle-stop";
    
    /**
     * Connect to signal "handle-stop".
     * <br>See {@link OnHandleStop#onHandleStop} for signal description.
     * <br>Field {@link #SIGNAL_ON_HANDLE_STOP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onHandleStop(OnHandleStop signal) {
        return connectSignal(SIGNAL_ON_HANDLE_STOP, toOnHandleStop(signal));
    }

    public final static String SIGNAL_ON_LOCATION_UPDATED = "location-updated";
    
    /**
     * Connect to signal "location-updated".
     * <br>See {@link OnLocationUpdated#onLocationUpdated} for signal description.
     * <br>Field {@link #SIGNAL_ON_LOCATION_UPDATED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLocationUpdated(OnLocationUpdated signal) {
        return connectSignal(SIGNAL_ON_LOCATION_UPDATED, toOnLocationUpdated(signal));
    }

    /**
     * Gets a machine-readable description of the &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Client.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Client&lt;/link&gt; D-Bus interface.
     * @return A &#35;GDBusInterfaceInfo. Do not free.
    */
    public static ch.bailu.gtk.gio.DBusInterfaceInfo interfaceInfo()  {
        return new ch.bailu.gtk.gio.DBusInterfaceInfo(new PointerContainer(JnaClient.INST().gclue_client_interface_info()));
    }

    /**
     * Overrides all &#35;GObject properties in the &#35;GClueClient interface for a concrete class.
     * <br>The properties are overridden in the order they are defined.
     * @param klass The class structure for a &#35;GObject derived class.
     * @param property_id_begin The property id to assign to the first overridden property.
     * @return The last property id.
    */
    public static int overrideProperties(@Nonnull ch.bailu.gtk.gobject.ObjectClass klass, int property_id_begin)  {
        return JnaClient.INST().gclue_client_override_properties(asCPointerNotNull(klass), property_id_begin);
    }

    public static long getTypeID() { 
        return JnaClient.INST().gclue_client_get_type(); 
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
