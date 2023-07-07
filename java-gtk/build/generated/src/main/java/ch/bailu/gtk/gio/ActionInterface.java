/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The virtual function table for &#35;GAction.
 * <p><a href="https://docs.gtk.org/gio/struct.ActionInterface.html">https://docs.gtk.org/gio/struct.ActionInterface.html</a></p>
*/
public class ActionInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ActionInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetName {
        /**
         * 
         * @param action a &#35;GAction
         * @return the name of the action
        */
        ch.bailu.gtk.type.Str onGetName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Action action);
    }
    
    private static JnaActionInterface.OnGetName toOnGetName(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetName in) {
        JnaActionInterface.OnGetName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action) -> in.onGetName(__callback, new Action(new PointerContainer(_action))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetParameterType {
        /**
         * 
         * @param action a &#35;GAction
         * @return the parameter type
        */
        ch.bailu.gtk.glib.VariantType onGetParameterType(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Action action);
    }
    
    private static JnaActionInterface.OnGetParameterType toOnGetParameterType(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetParameterType in) {
        JnaActionInterface.OnGetParameterType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action) -> in.onGetParameterType(__callback, new Action(new PointerContainer(_action))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetStateType {
        /**
         * 
         * @param action a &#35;GAction
         * @return the state type, if the action is stateful
        */
        ch.bailu.gtk.glib.VariantType onGetStateType(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Action action);
    }
    
    private static JnaActionInterface.OnGetStateType toOnGetStateType(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetStateType in) {
        JnaActionInterface.OnGetStateType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action) -> in.onGetStateType(__callback, new Action(new PointerContainer(_action))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetStateHint {
        /**
         * 
         * @param action a &#35;GAction
         * @return the state range hint
        */
        ch.bailu.gtk.glib.Variant onGetStateHint(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Action action);
    }
    
    private static JnaActionInterface.OnGetStateHint toOnGetStateHint(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetStateHint in) {
        JnaActionInterface.OnGetStateHint out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action) -> in.onGetStateHint(__callback, new Action(new PointerContainer(_action))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetEnabled {
        /**
         * 
         * @param action a &#35;GAction
         * @return whether the action is enabled
        */
        boolean onGetEnabled(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Action action);
    }
    
    private static JnaActionInterface.OnGetEnabled toOnGetEnabled(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetEnabled in) {
        JnaActionInterface.OnGetEnabled out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action) -> in.onGetEnabled(__callback, new Action(new PointerContainer(_action)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetState {
        /**
         * 
         * @param action a &#35;GAction
         * @return the current state of the action
        */
        ch.bailu.gtk.glib.Variant onGetState(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Action action);
    }
    
    private static JnaActionInterface.OnGetState toOnGetState(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetState in) {
        JnaActionInterface.OnGetState out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action) -> in.onGetState(__callback, new Action(new PointerContainer(_action))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnChangeState {
        /**
         * 
         * @param action a &#35;GAction
         * @param value the new state
        */
        void onChangeState(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Action action, @Nonnull ch.bailu.gtk.glib.Variant value);
    }
    
    private static JnaActionInterface.OnChangeState toOnChangeState(ch.bailu.gtk.type.Pointer instance, String methodName, OnChangeState in) {
        JnaActionInterface.OnChangeState out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action, _value) -> in.onChangeState(__callback, new Action(new PointerContainer(_action)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_value)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * 
         * @param action a &#35;GAction
         * @param parameter the parameter to the activation
        */
        void onActivate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Action action, @Nullable ch.bailu.gtk.glib.Variant parameter);
    }
    
    private static JnaActionInterface.OnActivate toOnActivate(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivate in) {
        JnaActionInterface.OnActivate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action, _parameter) -> in.onActivate(__callback, new Action(new PointerContainer(_action)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_parameter)));
            __callback.register(out);
        }
        return out;
    }

    public ActionInterface(PointerContainer pointer) {
        super(pointer);
    }

    public ActionInterface() {
        super(cast(JnaActionInterface.allocateStructure()));
    }

    private JnaActionInterface.Fields _fields;
    
    JnaActionInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaActionInterface.Fields(asCPointer());
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
     * <br>See {@link OnGetName#onGetName}
    */
    public static final String GET_NAME = "get_name";

    /**
     * 
     * <br>See {@link OnGetName#onGetName}
    */
    public void setFieldGetName(OnGetName get_name) {
        toFields().get_name = toOnGetName(this, GET_NAME, get_name);
        toFields().writeField(GET_NAME);
    }

    /**
     * 
     * <br>See {@link OnGetName#onGetName}
    */
    public JnaActionInterface.OnGetName getFieldGetName() {
       toFields().readField(GET_NAME);
       return toFields().get_name;
    } 

    /**
     * 
     * <br>See {@link OnGetParameterType#onGetParameterType}
    */
    public static final String GET_PARAMETER_TYPE = "get_parameter_type";

    /**
     * 
     * <br>See {@link OnGetParameterType#onGetParameterType}
    */
    public void setFieldGetParameterType(OnGetParameterType get_parameter_type) {
        toFields().get_parameter_type = toOnGetParameterType(this, GET_PARAMETER_TYPE, get_parameter_type);
        toFields().writeField(GET_PARAMETER_TYPE);
    }

    /**
     * 
     * <br>See {@link OnGetParameterType#onGetParameterType}
    */
    public JnaActionInterface.OnGetParameterType getFieldGetParameterType() {
       toFields().readField(GET_PARAMETER_TYPE);
       return toFields().get_parameter_type;
    } 

    /**
     * 
     * <br>See {@link OnGetStateType#onGetStateType}
    */
    public static final String GET_STATE_TYPE = "get_state_type";

    /**
     * 
     * <br>See {@link OnGetStateType#onGetStateType}
    */
    public void setFieldGetStateType(OnGetStateType get_state_type) {
        toFields().get_state_type = toOnGetStateType(this, GET_STATE_TYPE, get_state_type);
        toFields().writeField(GET_STATE_TYPE);
    }

    /**
     * 
     * <br>See {@link OnGetStateType#onGetStateType}
    */
    public JnaActionInterface.OnGetStateType getFieldGetStateType() {
       toFields().readField(GET_STATE_TYPE);
       return toFields().get_state_type;
    } 

    /**
     * 
     * <br>See {@link OnGetStateHint#onGetStateHint}
    */
    public static final String GET_STATE_HINT = "get_state_hint";

    /**
     * 
     * <br>See {@link OnGetStateHint#onGetStateHint}
    */
    public void setFieldGetStateHint(OnGetStateHint get_state_hint) {
        toFields().get_state_hint = toOnGetStateHint(this, GET_STATE_HINT, get_state_hint);
        toFields().writeField(GET_STATE_HINT);
    }

    /**
     * 
     * <br>See {@link OnGetStateHint#onGetStateHint}
    */
    public JnaActionInterface.OnGetStateHint getFieldGetStateHint() {
       toFields().readField(GET_STATE_HINT);
       return toFields().get_state_hint;
    } 

    /**
     * 
     * <br>See {@link OnGetEnabled#onGetEnabled}
    */
    public static final String GET_ENABLED = "get_enabled";

    /**
     * 
     * <br>See {@link OnGetEnabled#onGetEnabled}
    */
    public void setFieldGetEnabled(OnGetEnabled get_enabled) {
        toFields().get_enabled = toOnGetEnabled(this, GET_ENABLED, get_enabled);
        toFields().writeField(GET_ENABLED);
    }

    /**
     * 
     * <br>See {@link OnGetEnabled#onGetEnabled}
    */
    public JnaActionInterface.OnGetEnabled getFieldGetEnabled() {
       toFields().readField(GET_ENABLED);
       return toFields().get_enabled;
    } 

    /**
     * 
     * <br>See {@link OnGetState#onGetState}
    */
    public static final String GET_STATE = "get_state";

    /**
     * 
     * <br>See {@link OnGetState#onGetState}
    */
    public void setFieldGetState(OnGetState get_state) {
        toFields().get_state = toOnGetState(this, GET_STATE, get_state);
        toFields().writeField(GET_STATE);
    }

    /**
     * 
     * <br>See {@link OnGetState#onGetState}
    */
    public JnaActionInterface.OnGetState getFieldGetState() {
       toFields().readField(GET_STATE);
       return toFields().get_state;
    } 

    /**
     * 
     * <br>See {@link OnChangeState#onChangeState}
    */
    public static final String CHANGE_STATE = "change_state";

    /**
     * 
     * <br>See {@link OnChangeState#onChangeState}
    */
    public void setFieldChangeState(OnChangeState change_state) {
        toFields().change_state = toOnChangeState(this, CHANGE_STATE, change_state);
        toFields().writeField(CHANGE_STATE);
    }

    /**
     * 
     * <br>See {@link OnChangeState#onChangeState}
    */
    public JnaActionInterface.OnChangeState getFieldChangeState() {
       toFields().readField(CHANGE_STATE);
       return toFields().change_state;
    } 

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public static final String ACTIVATE = "activate";

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public void setFieldActivate(OnActivate activate) {
        toFields().activate = toOnActivate(this, ACTIVATE, activate);
        toFields().writeField(ACTIVATE);
    }

    /**
     * 
     * <br>See {@link OnActivate#onActivate}
    */
    public JnaActionInterface.OnActivate getFieldActivate() {
       toFields().readField(ACTIVATE);
       return toFields().activate;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Action.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Action.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
