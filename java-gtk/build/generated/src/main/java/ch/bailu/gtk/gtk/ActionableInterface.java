/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The interface vtable for `GtkActionable`.
 * <p><a href="https://docs.gtk.org/gtk4/struct.ActionableInterface.html">https://docs.gtk.org/gtk4/struct.ActionableInterface.html</a></p>
*/
public class ActionableInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ActionableInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetActionName {
        /**
         * 
         * @param actionable a `GtkActionable` widget
         * @return the action name
        */
        ch.bailu.gtk.type.Str onGetActionName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Actionable actionable);
    }
    
    private static JnaActionableInterface.OnGetActionName toOnGetActionName(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetActionName in) {
        JnaActionableInterface.OnGetActionName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_actionable) -> in.onGetActionName(__callback, new Actionable(new PointerContainer(_actionable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetActionName {
        /**
         * 
         * @param actionable a `GtkActionable` widget
         * @param action_name an action name
        */
        void onSetActionName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Actionable actionable, @Nullable ch.bailu.gtk.type.Str action_name);
    }
    
    private static JnaActionableInterface.OnSetActionName toOnSetActionName(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetActionName in) {
        JnaActionableInterface.OnSetActionName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_actionable, _action_name) -> in.onSetActionName(__callback, new Actionable(new PointerContainer(_actionable)), new ch.bailu.gtk.type.Str(new PointerContainer(_action_name)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetActionTargetValue {
        /**
         * 
         * @param actionable a `GtkActionable` widget
         * @return the current target value
        */
        ch.bailu.gtk.glib.Variant onGetActionTargetValue(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Actionable actionable);
    }
    
    private static JnaActionableInterface.OnGetActionTargetValue toOnGetActionTargetValue(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetActionTargetValue in) {
        JnaActionableInterface.OnGetActionTargetValue out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_actionable) -> in.onGetActionTargetValue(__callback, new Actionable(new PointerContainer(_actionable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetActionTargetValue {
        /**
         * 
         * @param actionable a `GtkActionable` widget
         * @param target_value a [struct&#64;GLib.Variant] to set as the target value
        */
        void onSetActionTargetValue(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Actionable actionable, @Nullable ch.bailu.gtk.glib.Variant target_value);
    }
    
    private static JnaActionableInterface.OnSetActionTargetValue toOnSetActionTargetValue(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetActionTargetValue in) {
        JnaActionableInterface.OnSetActionTargetValue out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_actionable, _target_value) -> in.onSetActionTargetValue(__callback, new Actionable(new PointerContainer(_actionable)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_target_value)));
            __callback.register(out);
        }
        return out;
    }

    public ActionableInterface(PointerContainer pointer) {
        super(pointer);
    }

    public ActionableInterface() {
        super(cast(JnaActionableInterface.allocateStructure()));
    }

    private JnaActionableInterface.Fields _fields;
    
    JnaActionableInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaActionableInterface.Fields(asCPointer());
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
     * <br>See {@link OnGetActionName#onGetActionName}
    */
    public static final String GET_ACTION_NAME = "get_action_name";

    /**
     * 
     * <br>See {@link OnGetActionName#onGetActionName}
    */
    public void setFieldGetActionName(OnGetActionName get_action_name) {
        toFields().get_action_name = toOnGetActionName(this, GET_ACTION_NAME, get_action_name);
        toFields().writeField(GET_ACTION_NAME);
    }

    /**
     * 
     * <br>See {@link OnGetActionName#onGetActionName}
    */
    public JnaActionableInterface.OnGetActionName getFieldGetActionName() {
       toFields().readField(GET_ACTION_NAME);
       return toFields().get_action_name;
    } 

    /**
     * 
     * <br>See {@link OnSetActionName#onSetActionName}
    */
    public static final String SET_ACTION_NAME = "set_action_name";

    /**
     * 
     * <br>See {@link OnSetActionName#onSetActionName}
    */
    public void setFieldSetActionName(OnSetActionName set_action_name) {
        toFields().set_action_name = toOnSetActionName(this, SET_ACTION_NAME, set_action_name);
        toFields().writeField(SET_ACTION_NAME);
    }

    /**
     * 
     * <br>See {@link OnSetActionName#onSetActionName}
    */
    public JnaActionableInterface.OnSetActionName getFieldSetActionName() {
       toFields().readField(SET_ACTION_NAME);
       return toFields().set_action_name;
    } 

    /**
     * 
     * <br>See {@link OnGetActionTargetValue#onGetActionTargetValue}
    */
    public static final String GET_ACTION_TARGET_VALUE = "get_action_target_value";

    /**
     * 
     * <br>See {@link OnGetActionTargetValue#onGetActionTargetValue}
    */
    public void setFieldGetActionTargetValue(OnGetActionTargetValue get_action_target_value) {
        toFields().get_action_target_value = toOnGetActionTargetValue(this, GET_ACTION_TARGET_VALUE, get_action_target_value);
        toFields().writeField(GET_ACTION_TARGET_VALUE);
    }

    /**
     * 
     * <br>See {@link OnGetActionTargetValue#onGetActionTargetValue}
    */
    public JnaActionableInterface.OnGetActionTargetValue getFieldGetActionTargetValue() {
       toFields().readField(GET_ACTION_TARGET_VALUE);
       return toFields().get_action_target_value;
    } 

    /**
     * 
     * <br>See {@link OnSetActionTargetValue#onSetActionTargetValue}
    */
    public static final String SET_ACTION_TARGET_VALUE = "set_action_target_value";

    /**
     * 
     * <br>See {@link OnSetActionTargetValue#onSetActionTargetValue}
    */
    public void setFieldSetActionTargetValue(OnSetActionTargetValue set_action_target_value) {
        toFields().set_action_target_value = toOnSetActionTargetValue(this, SET_ACTION_TARGET_VALUE, set_action_target_value);
        toFields().writeField(SET_ACTION_TARGET_VALUE);
    }

    /**
     * 
     * <br>See {@link OnSetActionTargetValue#onSetActionTargetValue}
    */
    public JnaActionableInterface.OnSetActionTargetValue getFieldSetActionTargetValue() {
       toFields().readField(SET_ACTION_TARGET_VALUE);
       return toFields().set_action_target_value;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Actionable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Actionable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
