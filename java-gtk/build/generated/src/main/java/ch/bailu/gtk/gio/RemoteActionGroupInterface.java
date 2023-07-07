/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The virtual function table for &#35;GRemoteActionGroup.
 * <p><a href="https://docs.gtk.org/gio/struct.RemoteActionGroupInterface.html">https://docs.gtk.org/gio/struct.RemoteActionGroupInterface.html</a></p>
*/
public class RemoteActionGroupInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RemoteActionGroupInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivateActionFull {
        /**
         * 
         * @param remote a &#35;GDBusActionGroup
         * @param action_name the name of the action to activate
         * @param parameter the optional parameter to the activation
         * @param platform_data the platform data to send
        */
        void onActivateActionFull(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull RemoteActionGroup remote, @Nonnull ch.bailu.gtk.type.Str action_name, @Nullable ch.bailu.gtk.glib.Variant parameter, @Nonnull ch.bailu.gtk.glib.Variant platform_data);
    }
    
    private static JnaRemoteActionGroupInterface.OnActivateActionFull toOnActivateActionFull(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivateActionFull in) {
        JnaRemoteActionGroupInterface.OnActivateActionFull out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_remote, _action_name, _parameter, _platform_data) -> in.onActivateActionFull(__callback, new RemoteActionGroup(new PointerContainer(_remote)), new ch.bailu.gtk.type.Str(new PointerContainer(_action_name)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_parameter)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_platform_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnChangeActionStateFull {
        /**
         * 
         * @param remote a &#35;GRemoteActionGroup
         * @param action_name the name of the action to change the state of
         * @param value the new requested value for the state
         * @param platform_data the platform data to send
        */
        void onChangeActionStateFull(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull RemoteActionGroup remote, @Nonnull ch.bailu.gtk.type.Str action_name, @Nonnull ch.bailu.gtk.glib.Variant value, @Nonnull ch.bailu.gtk.glib.Variant platform_data);
    }
    
    private static JnaRemoteActionGroupInterface.OnChangeActionStateFull toOnChangeActionStateFull(ch.bailu.gtk.type.Pointer instance, String methodName, OnChangeActionStateFull in) {
        JnaRemoteActionGroupInterface.OnChangeActionStateFull out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_remote, _action_name, _value, _platform_data) -> in.onChangeActionStateFull(__callback, new RemoteActionGroup(new PointerContainer(_remote)), new ch.bailu.gtk.type.Str(new PointerContainer(_action_name)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_value)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_platform_data)));
            __callback.register(out);
        }
        return out;
    }

    public RemoteActionGroupInterface(PointerContainer pointer) {
        super(pointer);
    }

    public RemoteActionGroupInterface() {
        super(cast(JnaRemoteActionGroupInterface.allocateStructure()));
    }

    private JnaRemoteActionGroupInterface.Fields _fields;
    
    JnaRemoteActionGroupInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRemoteActionGroupInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnActivateActionFull#onActivateActionFull}
    */
    public static final String ACTIVATE_ACTION_FULL = "activate_action_full";

    /**
     * 
     * <br>See {@link OnActivateActionFull#onActivateActionFull}
    */
    public void setFieldActivateActionFull(OnActivateActionFull activate_action_full) {
        toFields().activate_action_full = toOnActivateActionFull(this, ACTIVATE_ACTION_FULL, activate_action_full);
        toFields().writeField(ACTIVATE_ACTION_FULL);
    }

    /**
     * 
     * <br>See {@link OnActivateActionFull#onActivateActionFull}
    */
    public JnaRemoteActionGroupInterface.OnActivateActionFull getFieldActivateActionFull() {
       toFields().readField(ACTIVATE_ACTION_FULL);
       return toFields().activate_action_full;
    } 

    /**
     * 
     * <br>See {@link OnChangeActionStateFull#onChangeActionStateFull}
    */
    public static final String CHANGE_ACTION_STATE_FULL = "change_action_state_full";

    /**
     * 
     * <br>See {@link OnChangeActionStateFull#onChangeActionStateFull}
    */
    public void setFieldChangeActionStateFull(OnChangeActionStateFull change_action_state_full) {
        toFields().change_action_state_full = toOnChangeActionStateFull(this, CHANGE_ACTION_STATE_FULL, change_action_state_full);
        toFields().writeField(CHANGE_ACTION_STATE_FULL);
    }

    /**
     * 
     * <br>See {@link OnChangeActionStateFull#onChangeActionStateFull}
    */
    public JnaRemoteActionGroupInterface.OnChangeActionStateFull getFieldChangeActionStateFull() {
       toFields().readField(CHANGE_ACTION_STATE_FULL);
       return toFields().change_action_state_full;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(RemoteActionGroup.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(RemoteActionGroup.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
