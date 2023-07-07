/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The virtual function table for &#35;GNetworkMonitor.
 * <p><a href="https://docs.gtk.org/gio/struct.NetworkMonitorInterface.html">https://docs.gtk.org/gio/struct.NetworkMonitorInterface.html</a></p>
*/
public class NetworkMonitorInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NetworkMonitorInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnNetworkChanged {
        /**
         * 
         * @param monitor 
         * @param network_available 
        */
        void onNetworkChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull NetworkMonitor monitor, boolean network_available);
    }
    
    private static JnaNetworkMonitorInterface.OnNetworkChanged toOnNetworkChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnNetworkChanged in) {
        JnaNetworkMonitorInterface.OnNetworkChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_monitor, _network_available) -> in.onNetworkChanged(__callback, new NetworkMonitor(new PointerContainer(_monitor)), _network_available);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCanReach {
        /**
         * 
         * @param monitor a &#35;GNetworkMonitor
         * @param connectable a &#35;GSocketConnectable
         * @param cancellable a &#35;GCancellable, or %NULL
         * @return %TRUE if &#64;connectable is reachable, %FALSE if not.
        */
        boolean onCanReach(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull NetworkMonitor monitor, @Nonnull SocketConnectable connectable, @Nullable Cancellable cancellable);
    }
    
    private static JnaNetworkMonitorInterface.OnCanReach toOnCanReach(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanReach in) {
        JnaNetworkMonitorInterface.OnCanReach out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_monitor, _connectable, _cancellable, _error) -> in.onCanReach(__callback, new NetworkMonitor(new PointerContainer(_monitor)), new SocketConnectable(new PointerContainer(_connectable)), new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCanReachFinish {
        /**
         * 
         * @param monitor a &#35;GNetworkMonitor
         * @param result a &#35;GAsyncResult
         * @return %TRUE if network is reachable, %FALSE if not.
        */
        boolean onCanReachFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull NetworkMonitor monitor, @Nonnull AsyncResult result);
    }
    
    private static JnaNetworkMonitorInterface.OnCanReachFinish toOnCanReachFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanReachFinish in) {
        JnaNetworkMonitorInterface.OnCanReachFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_monitor, _result, _error) -> in.onCanReachFinish(__callback, new NetworkMonitor(new PointerContainer(_monitor)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    public NetworkMonitorInterface(PointerContainer pointer) {
        super(pointer);
    }

    public NetworkMonitorInterface() {
        super(cast(JnaNetworkMonitorInterface.allocateStructure()));
    }

    private JnaNetworkMonitorInterface.Fields _fields;
    
    JnaNetworkMonitorInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaNetworkMonitorInterface.Fields(asCPointer());
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
     * <br>See {@link OnNetworkChanged#onNetworkChanged}
    */
    public static final String NETWORK_CHANGED = "network_changed";

    /**
     * 
     * <br>See {@link OnNetworkChanged#onNetworkChanged}
    */
    public void setFieldNetworkChanged(OnNetworkChanged network_changed) {
        toFields().network_changed = toOnNetworkChanged(this, NETWORK_CHANGED, network_changed);
        toFields().writeField(NETWORK_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnNetworkChanged#onNetworkChanged}
    */
    public JnaNetworkMonitorInterface.OnNetworkChanged getFieldNetworkChanged() {
       toFields().readField(NETWORK_CHANGED);
       return toFields().network_changed;
    } 

    /**
     * 
     * <br>See {@link OnCanReach#onCanReach}
    */
    public static final String CAN_REACH = "can_reach";

    /**
     * 
     * <br>See {@link OnCanReach#onCanReach}
    */
    public void setFieldCanReach(OnCanReach can_reach) {
        toFields().can_reach = toOnCanReach(this, CAN_REACH, can_reach);
        toFields().writeField(CAN_REACH);
    }

    /**
     * 
     * <br>See {@link OnCanReach#onCanReach}
    */
    public JnaNetworkMonitorInterface.OnCanReach getFieldCanReach() {
       toFields().readField(CAN_REACH);
       return toFields().can_reach;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String CAN_REACH_ASYNC = "can_reach_async";

    /**
     * 
     * <br>See {@link OnCanReachFinish#onCanReachFinish}
    */
    public static final String CAN_REACH_FINISH = "can_reach_finish";

    /**
     * 
     * <br>See {@link OnCanReachFinish#onCanReachFinish}
    */
    public void setFieldCanReachFinish(OnCanReachFinish can_reach_finish) {
        toFields().can_reach_finish = toOnCanReachFinish(this, CAN_REACH_FINISH, can_reach_finish);
        toFields().writeField(CAN_REACH_FINISH);
    }

    /**
     * 
     * <br>See {@link OnCanReachFinish#onCanReachFinish}
    */
    public JnaNetworkMonitorInterface.OnCanReachFinish getFieldCanReachFinish() {
       toFields().readField(CAN_REACH_FINISH);
       return toFields().can_reach_finish;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(NetworkMonitor.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(NetworkMonitor.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
