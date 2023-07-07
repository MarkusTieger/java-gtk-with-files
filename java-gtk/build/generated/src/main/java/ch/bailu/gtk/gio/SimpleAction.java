/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GSimpleAction is the obvious simple implementation of the &#35;GAction
 * <br>interface. This is the easiest way to create an action for purposes of
 * <br>adding it to a &#35;GSimpleActionGroup.
 * <br>
 * <br>See also &#35;GtkAction.
 * <p><a href="https://docs.gtk.org/gio/class.SimpleAction.html">https://docs.gtk.org/gio/class.SimpleAction.html</a></p>
*/
public class SimpleAction extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SimpleAction.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Indicates that the action was just activated.
         * <br>
         * <br>&#64;parameter will always be of the expected type, i.e. the parameter type
         * <br>specified when the action was created. If an incorrect type is given when
         * <br>activating the action, this signal is not emitted.
         * <br>
         * <br>Since GLib 2.40, if no handler is connected to this signal then the
         * <br>default behaviour for boolean-stated actions with a %NULL parameter
         * <br>type is to toggle them via the &#35;GSimpleAction::change-state signal.
         * <br>For stateful actions where the state type is equal to the parameter
         * <br>type, the default is to forward them directly to
         * <br>&#35;GSimpleAction::change-state.  This should allow almost all users
         * <br>of &#35;GSimpleAction to connect only one handler or the other.
         * @param parameter the parameter to the activation, or %NULL if it has   no parameter
        */
        void onActivate(@Nullable ch.bailu.gtk.glib.Variant parameter);
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaSimpleAction.OnActivate) (__self, _parameter, __data) -> in.onActivate(new ch.bailu.gtk.glib.Variant(new PointerContainer(_parameter)));
    }

    @FunctionalInterface
    public interface OnChangeState {
        /**
         * Indicates that the action just received a request to change its
         * <br>state.
         * <br>
         * <br>&#64;value will always be of the correct state type, i.e. the type of the
         * <br>initial state passed to g_simple_action_new_stateful(). If an incorrect
         * <br>type is given when requesting to change the state, this signal is not
         * <br>emitted.
         * <br>
         * <br>If no handler is connected to this signal then the default
         * <br>behaviour is to call g_simple_action_set_state() to set the state
         * <br>to the requested value. If you connect a signal handler then no
         * <br>default action is taken. If the state should change then you must
         * <br>call g_simple_action_set_state() from the handler.
         * <br>
         * <br>An example of a 'change-state' handler:
         * <pre>&lt;!-- language=&quot;C&quot; --&gt;
         * static void
         * change_volume_state (GSimpleAction *action,
         *                      GVariant      *value,
         *                      gpointer       user_data)
         * {
         *   gint requested;
         * 
         *   requested = g_variant_get_int32 (value);
         * 
         *   // Volume only goes from 0 to 10
         *   if (0 &lt;= requested &amp;&amp; requested &lt;= 10)
         *     g_simple_action_set_state (action, value);
         * }
         * </pre>
         * <br>
         * <br>The handler need not set the state to the requested value.
         * <br>It could set it to any value at all, or take some other action.
         * @param value the requested value for the state
        */
        void onChangeState(@Nullable ch.bailu.gtk.glib.Variant value);
    }
    
    private static com.sun.jna.Callback toOnChangeState(OnChangeState in) {
        return (in == null) ? null: (JnaSimpleAction.OnChangeState) (__self, _value, __data) -> in.onChangeState(new ch.bailu.gtk.glib.Variant(new PointerContainer(_value)));
    }

    public SimpleAction(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new stateful action.
     * <br>
     * <br>All future state values must have the same &#35;GVariantType as the initial
     * <br>&#64;state.
     * <br>
     * <br>If the &#64;state &#35;GVariant is floating, it is consumed.
     * @param name the name of the action
     * @param parameter_type the type of the parameter that will be passed to   handlers for the &#35;GSimpleAction::activate signal, or %NULL for no parameter
     * @param state the initial state of the action
     * @return a new &#35;GSimpleAction
    */
    public static SimpleAction newStatefulSimpleAction(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.glib.VariantType parameter_type, @Nonnull ch.bailu.gtk.glib.Variant state)  {
        PointerContainer __self = cast(JnaSimpleAction.INST().g_simple_action_new_stateful(asCPointerNotNull(name), asCPointer(parameter_type), asCPointerNotNull(state)));
        if (__self.isNull()) {
            throw new NullPointerException("SimpleAction:newStateful");
        }
        return new SimpleAction(__self);
    }        
    

    /**
     * Creates a new stateful action.
     * <br>
     * <br>All future state values must have the same &#35;GVariantType as the initial
     * <br>&#64;state.
     * <br>
     * <br>If the &#64;state &#35;GVariant is floating, it is consumed.
     * @param name the name of the action
     * @param parameter_type the type of the parameter that will be passed to   handlers for the &#35;GSimpleAction::activate signal, or %NULL for no parameter
     * @param state the initial state of the action
     * @return a new &#35;GSimpleAction
    */
    public static SimpleAction newStatefulSimpleAction(String name, @Nullable ch.bailu.gtk.glib.VariantType parameter_type, @Nonnull ch.bailu.gtk.glib.Variant state)  {
        PointerContainer __self = cast(JnaSimpleAction.INST().g_simple_action_new_stateful(name, asCPointer(parameter_type), asCPointerNotNull(state)));
        if (__self.isNull()) {
            throw new NullPointerException("SimpleAction:newStateful");
        }
        return new SimpleAction(__self);
    }        
    

    /**
     * Creates a new action.
     * <br>
     * <br>The created action is stateless. See g_simple_action_new_stateful() to create
     * <br>an action that has state.
     * @param name the name of the action
     * @param parameter_type the type of parameter that will be passed to   handlers for the &#35;GSimpleAction::activate signal, or %NULL for no parameter
    */
    public SimpleAction(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.glib.VariantType parameter_type) {
        super(cast(JnaSimpleAction.INST().g_simple_action_new(asCPointerNotNull(name), asCPointer(parameter_type))));
    }

    /**
     * Creates a new action.
     * <br>
     * <br>The created action is stateless. See g_simple_action_new_stateful() to create
     * <br>an action that has state.
     * @param name the name of the action
     * @param parameter_type the type of parameter that will be passed to   handlers for the &#35;GSimpleAction::activate signal, or %NULL for no parameter
    */
    public SimpleAction(String name, @Nullable ch.bailu.gtk.glib.VariantType parameter_type) {
        super(cast(JnaSimpleAction.INST().g_simple_action_new(name, asCPointer(parameter_type))));
    }

    /**
     * Sets the action as enabled or not.
     * <br>
     * <br>An action must be enabled in order to be activated or in order to
     * <br>have its state changed from outside callers.
     * <br>
     * <br>This should only be called by the implementor of the action.  Users
     * <br>of the action should not attempt to modify its enabled flag.
     * @param enabled whether the action is enabled
    */
    public void setEnabled(boolean enabled)  {
        JnaSimpleAction.INST().g_simple_action_set_enabled(asCPointer(), enabled);
    }

    /**
     * Sets the state of the action.
     * <br>
     * <br>This directly updates the 'state' property to the given value.
     * <br>
     * <br>This should only be called by the implementor of the action.  Users
     * <br>of the action should not attempt to directly modify the 'state'
     * <br>property.  Instead, they should call g_action_change_state() to
     * <br>request the change.
     * <br>
     * <br>If the &#64;value GVariant is floating, it is consumed.
     * @param value the new &#35;GVariant for the state
    */
    public void setState(@Nonnull ch.bailu.gtk.glib.Variant value)  {
        JnaSimpleAction.INST().g_simple_action_set_state(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Sets the state hint for the action.
     * <br>
     * <br>See g_action_get_state_hint() for more information about
     * <br>action state hints.
     * @param state_hint a &#35;GVariant representing the state hint
    */
    public void setStateHint(@Nullable ch.bailu.gtk.glib.Variant state_hint)  {
        JnaSimpleAction.INST().g_simple_action_set_state_hint(asCPointer(), asCPointer(state_hint));
    }

    public final static String SIGNAL_ON_ACTIVATE = "activate";
    
    /**
     * Connect to signal "activate".
     * <br>See {@link OnActivate#onActivate} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivate(OnActivate signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE, toOnActivate(signal));
    }

    public final static String SIGNAL_ON_CHANGE_STATE = "change-state";
    
    /**
     * Connect to signal "change-state".
     * <br>See {@link OnChangeState#onChangeState} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGE_STATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChangeState(OnChangeState signal) {
        return connectSignal(SIGNAL_ON_CHANGE_STATE, toOnChangeState(signal));
    }

    /**
     * Implements interface {@link Action}. Call this to get access to interface functions.
     * @return {@link Action}
    */
    public Action asAction() {
        return new Action(cast());
    }

    public static long getTypeID() { 
        return JnaSimpleAction.INST().g_simple_action_get_type(); 
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
