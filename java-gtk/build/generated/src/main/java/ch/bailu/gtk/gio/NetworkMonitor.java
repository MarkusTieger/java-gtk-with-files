/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GNetworkMonitor provides an easy-to-use cross-platform API
 * <br>for monitoring network connectivity. On Linux, the available
 * <br>implementations are based on the kernel's netlink interface and
 * <br>on NetworkManager.
 * <br>
 * <br>There is also an implementation for use inside Flatpak sandboxes.
 * <p><a href="https://docs.gtk.org/gio/iface.NetworkMonitor.html">https://docs.gtk.org/gio/iface.NetworkMonitor.html</a></p>
*/
public class NetworkMonitor extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NetworkMonitor.class.getCanonicalName());
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
    
    private static JnaNetworkMonitor.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaNetworkMonitor.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnNetworkChanged {
        /**
         * Emitted when the network configuration changes.
         * @param network_available the current value of &#35;GNetworkMonitor:network-available
        */
        void onNetworkChanged(boolean network_available);
    }
    
    private static com.sun.jna.Callback toOnNetworkChanged(OnNetworkChanged in) {
        return (in == null) ? null: (JnaNetworkMonitor.OnNetworkChanged) (__self, _network_available, __data) -> in.onNetworkChanged(_network_available);
    }

    public NetworkMonitor(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Attempts to determine whether or not the host pointed to by
     * <br>&#64;connectable can be reached, without actually trying to connect to
     * <br>it.
     * <br>
     * <br>This may return %TRUE even when &#35;GNetworkMonitor:network-available
     * <br>is %FALSE, if, for example, &#64;monitor can determine that
     * <br>&#64;connectable refers to a host on a local network.
     * <br>
     * <br>If &#64;monitor believes that an attempt to connect to &#64;connectable
     * <br>will succeed, it will return %TRUE. Otherwise, it will return
     * <br>%FALSE and set &#64;error to an appropriate error (such as
     * <br>%G_IO_ERROR_HOST_UNREACHABLE).
     * <br>
     * <br>Note that although this does not attempt to connect to
     * <br>&#64;connectable, it may still block for a brief period of time (eg,
     * <br>trying to do multicast DNS on the local network), so if you do not
     * <br>want to block, you should use g_network_monitor_can_reach_async().
     * @param connectable a &#35;GSocketConnectable
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return %TRUE if &#64;connectable is reachable, %FALSE if not.
    */
    public boolean canReach(@Nonnull SocketConnectable connectable, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaNetworkMonitor.INST().g_network_monitor_can_reach(asCPointer(), asCPointerNotNull(connectable), asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously attempts to determine whether or not the host
     * <br>pointed to by &#64;connectable can be reached, without actually
     * <br>trying to connect to it.
     * <br>
     * <br>For more details, see g_network_monitor_can_reach().
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_network_monitor_can_reach_finish()
     * <br>to get the result of the operation.
     * @param connectable a &#35;GSocketConnectable
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback a &#35;GAsyncReadyCallback to call when the     request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void canReachAsync(@Nonnull SocketConnectable connectable, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaNetworkMonitor.INST().g_network_monitor_can_reach_async(asCPointer(), asCPointerNotNull(connectable), asCPointer(cancellable), toOnAsyncReadyCallback(this, "canReachAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an async network connectivity test.
     * <br>See g_network_monitor_can_reach_async().
     * @param result a &#35;GAsyncResult
     * @return %TRUE if network is reachable, %FALSE if not.
    */
    public boolean canReachFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaNetworkMonitor.INST().g_network_monitor_can_reach_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Gets a more detailed networking state than
     * <br>g_network_monitor_get_network_available().
     * <br>
     * <br>If &#35;GNetworkMonitor:network-available is %FALSE, then the
     * <br>connectivity state will be %G_NETWORK_CONNECTIVITY_LOCAL.
     * <br>
     * <br>If &#35;GNetworkMonitor:network-available is %TRUE, then the
     * <br>connectivity state will be %G_NETWORK_CONNECTIVITY_FULL (if there
     * <br>is full Internet connectivity), %G_NETWORK_CONNECTIVITY_LIMITED (if
     * <br>the host has a default route, but appears to be unable to actually
     * <br>reach the full Internet), or %G_NETWORK_CONNECTIVITY_PORTAL (if the
     * <br>host is trapped behind a &quot;captive portal&quot; that requires some sort
     * <br>of login or acknowledgement before allowing full Internet access).
     * <br>
     * <br>Note that in the case of %G_NETWORK_CONNECTIVITY_LIMITED and
     * <br>%G_NETWORK_CONNECTIVITY_PORTAL, it is possible that some sites are
     * <br>reachable but others are not. In this case, applications can
     * <br>attempt to connect to remote servers, but should gracefully fall
     * <br>back to their &quot;offline&quot; behavior if the connection attempt fails.
     * @return the network connectivity state
    */
    public int getConnectivity()  {
        return JnaNetworkMonitor.INST().g_network_monitor_get_connectivity(asCPointer());
    }

    /**
     * Checks if the network is available. &quot;Available&quot; here means that the
     * <br>system has a default route available for at least one of IPv4 or
     * <br>IPv6. It does not necessarily imply that the public Internet is
     * <br>reachable. See &#35;GNetworkMonitor:network-available for more details.
     * @return whether the network is available
    */
    public boolean getNetworkAvailable()  {
        return JnaNetworkMonitor.INST().g_network_monitor_get_network_available(asCPointer());
    }

    /**
     * Checks if the network is metered.
     * <br>See &#35;GNetworkMonitor:network-metered for more details.
     * @return whether the connection is metered
    */
    public boolean getNetworkMetered()  {
        return JnaNetworkMonitor.INST().g_network_monitor_get_network_metered(asCPointer());
    }

    public final static String SIGNAL_ON_NETWORK_CHANGED = "network-changed";
    
    /**
     * Connect to signal "network-changed".
     * <br>See {@link OnNetworkChanged#onNetworkChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_NETWORK_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onNetworkChanged(OnNetworkChanged signal) {
        return connectSignal(SIGNAL_ON_NETWORK_CHANGED, toOnNetworkChanged(signal));
    }

    /**
     * Gets the default &#35;GNetworkMonitor for the system.
     * @return a &#35;GNetworkMonitor, which will be     a dummy object if no network monitor is available
    */
    public static NetworkMonitor getDefault()  {
        return new NetworkMonitor(new PointerContainer(JnaNetworkMonitor.INST().g_network_monitor_get_default()));
    }

    public static long getTypeID() { 
        return JnaNetworkMonitor.INST().g_network_monitor_get_type(); 
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
