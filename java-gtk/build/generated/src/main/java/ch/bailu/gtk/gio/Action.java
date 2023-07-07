/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GAction represents a single named action.
 * <br>
 * <br>The main interface to an action is that it can be activated with
 * <br>g_action_activate().  This results in the 'activate' signal being
 * <br>emitted.  An activation has a &#35;GVariant parameter (which may be
 * <br>%NULL).  The correct type for the parameter is determined by a static
 * <br>parameter type (which is given at construction time).
 * <br>
 * <br>An action may optionally have a state, in which case the state may be
 * <br>set with g_action_change_state().  This call takes a &#35;GVariant.  The
 * <br>correct type for the state is determined by a static state type
 * <br>(which is given at construction time).
 * <br>
 * <br>The state may have a hint associated with it, specifying its valid
 * <br>range.
 * <br>
 * <br>&#35;GAction is merely the interface to the concept of an action, as
 * <br>described above.  Various implementations of actions exist, including
 * <br>&#35;GSimpleAction.
 * <br>
 * <br>In all cases, the implementing class is responsible for storing the
 * <br>name of the action, the parameter type, the enabled state, the
 * <br>optional state type and the state and emitting the appropriate
 * <br>signals when these change.  The implementor is responsible for filtering
 * <br>calls to g_action_activate() and g_action_change_state() for type
 * <br>safety and for the state being enabled.
 * <br>
 * <br>Probably the only useful thing to do with a &#35;GAction is to put it
 * <br>inside of a &#35;GSimpleActionGroup.
 * <p><a href="https://docs.gtk.org/gio/iface.Action.html">https://docs.gtk.org/gio/iface.Action.html</a></p>
*/
public class Action extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Action.class.getCanonicalName());
    }

    public Action(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Activates the action.
     * <br>
     * <br>&#64;parameter must be the correct type of parameter for the action (ie:
     * <br>the parameter type given at construction time).  If the parameter
     * <br>type was %NULL then &#64;parameter must also be %NULL.
     * <br>
     * <br>If the &#64;parameter GVariant is floating, it is consumed.
     * @param parameter the parameter to the activation
    */
    public void activate(@Nullable ch.bailu.gtk.glib.Variant parameter)  {
        JnaAction.INST().g_action_activate(asCPointer(), asCPointer(parameter));
    }

    /**
     * Request for the state of &#64;action to be changed to &#64;value.
     * <br>
     * <br>The action must be stateful and &#64;value must be of the correct type.
     * <br>See g_action_get_state_type().
     * <br>
     * <br>This call merely requests a change.  The action may refuse to change
     * <br>its state or may change its state to something other than &#64;value.
     * <br>See g_action_get_state_hint().
     * <br>
     * <br>If the &#64;value GVariant is floating, it is consumed.
     * @param value the new state
    */
    public void changeState(@Nonnull ch.bailu.gtk.glib.Variant value)  {
        JnaAction.INST().g_action_change_state(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Checks if &#64;action is currently enabled.
     * <br>
     * <br>An action must be enabled in order to be activated or in order to
     * <br>have its state changed from outside callers.
     * @return whether the action is enabled
    */
    public boolean getEnabled()  {
        return JnaAction.INST().g_action_get_enabled(asCPointer());
    }

    /**
     * Queries the name of &#64;action.
     * @return the name of the action
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAction.INST().g_action_get_name(asCPointer())));
    }

    /**
     * Queries the type of the parameter that must be given when activating
     * <br>&#64;action.
     * <br>
     * <br>When activating the action using g_action_activate(), the &#35;GVariant
     * <br>given to that function must be of the type returned by this function.
     * <br>
     * <br>In the case that this function returns %NULL, you must not give any
     * <br>&#35;GVariant, but %NULL instead.
     * @return the parameter type
    */
    public ch.bailu.gtk.glib.VariantType getParameterType()  {
        return new ch.bailu.gtk.glib.VariantType(new PointerContainer(JnaAction.INST().g_action_get_parameter_type(asCPointer())));
    }

    /**
     * Queries the current state of &#64;action.
     * <br>
     * <br>If the action is not stateful then %NULL will be returned.  If the
     * <br>action is stateful then the type of the return value is the type
     * <br>given by g_action_get_state_type().
     * <br>
     * <br>The return value (if non-%NULL) should be freed with
     * <br>g_variant_unref() when it is no longer required.
     * @return the current state of the action
    */
    public ch.bailu.gtk.glib.Variant getState()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaAction.INST().g_action_get_state(asCPointer())));
    }

    /**
     * Requests a hint about the valid range of values for the state of
     * <br>&#64;action.
     * <br>
     * <br>If %NULL is returned it either means that the action is not stateful
     * <br>or that there is no hint about the valid range of values for the
     * <br>state of the action.
     * <br>
     * <br>If a &#35;GVariant array is returned then each item in the array is a
     * <br>possible value for the state.  If a &#35;GVariant pair (ie: two-tuple) is
     * <br>returned then the tuple specifies the inclusive lower and upper bound
     * <br>of valid values for the state.
     * <br>
     * <br>In any case, the information is merely a hint.  It may be possible to
     * <br>have a state value outside of the hinted range and setting a value
     * <br>within the range may fail.
     * <br>
     * <br>The return value (if non-%NULL) should be freed with
     * <br>g_variant_unref() when it is no longer required.
     * @return the state range hint
    */
    public ch.bailu.gtk.glib.Variant getStateHint()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaAction.INST().g_action_get_state_hint(asCPointer())));
    }

    /**
     * Queries the type of the state of &#64;action.
     * <br>
     * <br>If the action is stateful (e.g. created with
     * <br>g_simple_action_new_stateful()) then this function returns the
     * <br>&#35;GVariantType of the state.  This is the type of the initial value
     * <br>given as the state. All calls to g_action_change_state() must give a
     * <br>&#35;GVariant of this type and g_action_get_state() will return a
     * <br>&#35;GVariant of the same type.
     * <br>
     * <br>If the action is not stateful (e.g. created with g_simple_action_new())
     * <br>then this function will return %NULL. In that case, g_action_get_state()
     * <br>will return %NULL and you must not call g_action_change_state().
     * @return the state type, if the action is stateful
    */
    public ch.bailu.gtk.glib.VariantType getStateType()  {
        return new ch.bailu.gtk.glib.VariantType(new PointerContainer(JnaAction.INST().g_action_get_state_type(asCPointer())));
    }

    /**
     * Checks if &#64;action_name is valid.
     * <br>
     * <br>&#64;action_name is valid if it consists only of alphanumeric characters,
     * <br>plus '-' and '.'.  The empty string is not a valid action name.
     * <br>
     * <br>It is an error to call this function with a non-utf8 &#64;action_name.
     * <br>&#64;action_name must not be %NULL.
     * @param action_name a potential action name
     * @return %TRUE if &#64;action_name is valid
    */
    public static boolean nameIsValid(@Nonnull ch.bailu.gtk.type.Str action_name)  {
        return JnaAction.INST().g_action_name_is_valid(asCPointerNotNull(action_name));
    }

    /**
     * Formats a detailed action name from &#64;action_name and &#64;target_value.
     * <br>
     * <br>It is an error to call this function with an invalid action name.
     * <br>
     * <br>This function is the opposite of g_action_parse_detailed_name().
     * <br>It will produce a string that can be parsed back to the &#64;action_name
     * <br>and &#64;target_value by that function.
     * <br>
     * <br>See that function for the types of strings that will be printed by
     * <br>this function.
     * @param action_name a valid action name
     * @param target_value a &#35;GVariant target value, or %NULL
     * @return a detailed format string
    */
    public static ch.bailu.gtk.type.Str printDetailedName(@Nonnull ch.bailu.gtk.type.Str action_name, @Nullable ch.bailu.gtk.glib.Variant target_value)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAction.INST().g_action_print_detailed_name(asCPointerNotNull(action_name), asCPointer(target_value))));
    }

    public static long getTypeID() { 
        return JnaAction.INST().g_action_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:parseDetailedName:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GVariant**}}:{j:}]
*/
