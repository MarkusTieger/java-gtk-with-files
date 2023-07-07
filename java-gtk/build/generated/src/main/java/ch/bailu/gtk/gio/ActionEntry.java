/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * This struct defines a single action.  It is for use with
 * <br>g_action_map_add_action_entries().
 * <br>
 * <br>The order of the items in the structure are intended to reflect
 * <br>frequency of use.  It is permissible to use an incomplete initialiser
 * <br>in order to leave some of the later values as %NULL.  All values
 * <br>after &#64;name are optional.  Additional optional fields may be added in
 * <br>the future.
 * <br>
 * <br>See g_action_map_add_action_entries() for an example.
 * <p><a href="https://docs.gtk.org/gio/struct.ActionEntry.html">https://docs.gtk.org/gio/struct.ActionEntry.html</a></p>
*/
public class ActionEntry extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ActionEntry.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * 
         * @param action 
         * @param parameter 
         * @param user_data 
        */
        void onActivate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SimpleAction action, @Nonnull ch.bailu.gtk.glib.Variant parameter, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaActionEntry.OnActivate toOnActivate(ch.bailu.gtk.type.Pointer instance, String methodName, OnActivate in) {
        JnaActionEntry.OnActivate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action, _parameter, _user_data) -> in.onActivate(__callback, new SimpleAction(new PointerContainer(_action)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_parameter)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnChangeState {
        /**
         * 
         * @param action 
         * @param value 
         * @param user_data 
        */
        void onChangeState(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SimpleAction action, @Nonnull ch.bailu.gtk.glib.Variant value, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaActionEntry.OnChangeState toOnChangeState(ch.bailu.gtk.type.Pointer instance, String methodName, OnChangeState in) {
        JnaActionEntry.OnChangeState out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_action, _value, _user_data) -> in.onChangeState(__callback, new SimpleAction(new PointerContainer(_action)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_value)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public ActionEntry(PointerContainer pointer) {
        super(pointer);
    }

    private JnaActionEntry.Fields _fields;
    
    JnaActionEntry.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaActionEntry.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the name of the action
    */
    public static final String NAME = "name";

    /**
     * the name of the action
    */
    public void setFieldName(ch.bailu.gtk.type.Str name) {
        toFields().name = name.asCPointer();
        toFields().writeField(NAME);
    }

    /**
     * the name of the action
    */
    public ch.bailu.gtk.type.Str getFieldName() {
       toFields().readField(NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().name));
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
    public JnaActionEntry.OnActivate getFieldActivate() {
       toFields().readField(ACTIVATE);
       return toFields().activate;
    } 

    /**
     * the type of the parameter that must be passed to the
     * <br>                 activate function for this action, given as a single
     * <br>                 GVariant type string (or %NULL for no parameter)
    */
    public static final String PARAMETER_TYPE = "parameter_type";

    /**
     * the type of the parameter that must be passed to the
     * <br>                 activate function for this action, given as a single
     * <br>                 GVariant type string (or %NULL for no parameter)
    */
    public void setFieldParameterType(ch.bailu.gtk.type.Str parameter_type) {
        toFields().parameter_type = parameter_type.asCPointer();
        toFields().writeField(PARAMETER_TYPE);
    }

    /**
     * the type of the parameter that must be passed to the
     * <br>                 activate function for this action, given as a single
     * <br>                 GVariant type string (or %NULL for no parameter)
    */
    public ch.bailu.gtk.type.Str getFieldParameterType() {
       toFields().readField(PARAMETER_TYPE);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().parameter_type));
    } 

    /**
     * the initial state for this action, given in
     * <br>        [GVariant text format][gvariant-text].  The state is parsed
     * <br>        with no extra type information, so type tags must be added to
     * <br>        the string if they are necessary.  Stateless actions should
     * <br>        give %NULL here.
    */
    public static final String STATE = "state";

    /**
     * the initial state for this action, given in
     * <br>        [GVariant text format][gvariant-text].  The state is parsed
     * <br>        with no extra type information, so type tags must be added to
     * <br>        the string if they are necessary.  Stateless actions should
     * <br>        give %NULL here.
    */
    public void setFieldState(ch.bailu.gtk.type.Str state) {
        toFields().state = state.asCPointer();
        toFields().writeField(STATE);
    }

    /**
     * the initial state for this action, given in
     * <br>        [GVariant text format][gvariant-text].  The state is parsed
     * <br>        with no extra type information, so type tags must be added to
     * <br>        the string if they are necessary.  Stateless actions should
     * <br>        give %NULL here.
    */
    public ch.bailu.gtk.type.Str getFieldState() {
       toFields().readField(STATE);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().state));
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
    public JnaActionEntry.OnChangeState getFieldChangeState() {
       toFields().readField(CHANGE_STATE);
       return toFields().change_state;
    } 

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
