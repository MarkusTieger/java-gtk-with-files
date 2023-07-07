/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GActionGroup represents a group of actions. Actions can be used to
 * <br>expose functionality in a structured way, either from one part of a
 * <br>program to another, or to the outside world. Action groups are often
 * <br>used together with a &#35;GMenuModel that provides additional
 * <br>representation data for displaying the actions to the user, e.g. in
 * <br>a menu.
 * <br>
 * <br>The main way to interact with the actions in a GActionGroup is to
 * <br>activate them with g_action_group_activate_action(). Activating an
 * <br>action may require a &#35;GVariant parameter. The required type of the
 * <br>parameter can be inquired with g_action_group_get_action_parameter_type().
 * <br>Actions may be disabled, see g_action_group_get_action_enabled().
 * <br>Activating a disabled action has no effect.
 * <br>
 * <br>Actions may optionally have a state in the form of a &#35;GVariant. The
 * <br>current state of an action can be inquired with
 * <br>g_action_group_get_action_state(). Activating a stateful action may
 * <br>change its state, but it is also possible to set the state by calling
 * <br>g_action_group_change_action_state().
 * <br>
 * <br>As typical example, consider a text editing application which has an
 * <br>option to change the current font to 'bold'. A good way to represent
 * <br>this would be a stateful action, with a boolean state. Activating the
 * <br>action would toggle the state.
 * <br>
 * <br>Each action in the group has a unique name (which is a string).  All
 * <br>method calls, except g_action_group_list_actions() take the name of
 * <br>an action as an argument.
 * <br>
 * <br>The &#35;GActionGroup API is meant to be the 'public' API to the action
 * <br>group.  The calls here are exactly the interaction that 'external
 * <br>forces' (eg: UI, incoming D-Bus messages, etc.) are supposed to have
 * <br>with actions.  'Internal' APIs (ie: ones meant only to be accessed by
 * <br>the action group implementation) are found on subclasses.  This is
 * <br>why you will find - for example - g_action_group_get_action_enabled()
 * <br>but not an equivalent set() call.
 * <br>
 * <br>Signals are emitted on the action group in response to state changes
 * <br>on individual actions.
 * <br>
 * <br>Implementations of &#35;GActionGroup should provide implementations for
 * <br>the virtual functions g_action_group_list_actions() and
 * <br>g_action_group_query_action().  The other virtual functions should
 * <br>not be implemented - their &quot;wrappers&quot; are actually implemented with
 * <br>calls to g_action_group_query_action().
 * <p><a href="https://docs.gtk.org/gio/iface.ActionGroup.html">https://docs.gtk.org/gio/iface.ActionGroup.html</a></p>
*/
public class ActionGroup extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ActionGroup.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActionAdded {
        /**
         * Signals that a new action was just added to the group.
         * <br>This signal is emitted after the action has been added
         * <br>and is now visible.
         * @param action_name the name of the action in &#64;action_group
        */
        void onActionAdded(@Nonnull ch.bailu.gtk.type.Str action_name);
    }
    
    private static com.sun.jna.Callback toOnActionAdded(OnActionAdded in) {
        return (in == null) ? null: (JnaActionGroup.OnActionAdded) (__self, _action_name, __data) -> in.onActionAdded(new ch.bailu.gtk.type.Str(new PointerContainer(_action_name)));
    }

    @FunctionalInterface
    public interface OnActionEnabledChanged {
        /**
         * Signals that the enabled status of the named action has changed.
         * @param action_name the name of the action in &#64;action_group
         * @param enabled whether the action is enabled or not
        */
        void onActionEnabledChanged(@Nonnull ch.bailu.gtk.type.Str action_name, boolean enabled);
    }
    
    private static com.sun.jna.Callback toOnActionEnabledChanged(OnActionEnabledChanged in) {
        return (in == null) ? null: (JnaActionGroup.OnActionEnabledChanged) (__self, _action_name, _enabled, __data) -> in.onActionEnabledChanged(new ch.bailu.gtk.type.Str(new PointerContainer(_action_name)), _enabled);
    }

    @FunctionalInterface
    public interface OnActionRemoved {
        /**
         * Signals that an action is just about to be removed from the group.
         * <br>This signal is emitted before the action is removed, so the action
         * <br>is still visible and can be queried from the signal handler.
         * @param action_name the name of the action in &#64;action_group
        */
        void onActionRemoved(@Nonnull ch.bailu.gtk.type.Str action_name);
    }
    
    private static com.sun.jna.Callback toOnActionRemoved(OnActionRemoved in) {
        return (in == null) ? null: (JnaActionGroup.OnActionRemoved) (__self, _action_name, __data) -> in.onActionRemoved(new ch.bailu.gtk.type.Str(new PointerContainer(_action_name)));
    }

    @FunctionalInterface
    public interface OnActionStateChanged {
        /**
         * Signals that the state of the named action has changed.
         * @param action_name the name of the action in &#64;action_group
         * @param value the new value of the state
        */
        void onActionStateChanged(@Nonnull ch.bailu.gtk.type.Str action_name, @Nonnull ch.bailu.gtk.glib.Variant value);
    }
    
    private static com.sun.jna.Callback toOnActionStateChanged(OnActionStateChanged in) {
        return (in == null) ? null: (JnaActionGroup.OnActionStateChanged) (__self, _action_name, _value, __data) -> in.onActionStateChanged(new ch.bailu.gtk.type.Str(new PointerContainer(_action_name)), new ch.bailu.gtk.glib.Variant(new PointerContainer(_value)));
    }

    public ActionGroup(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Emits the &#35;GActionGroup::action-added signal on &#64;action_group.
     * <br>
     * <br>This function should only be called by &#35;GActionGroup implementations.
     * @param action_name the name of an action in the group
    */
    public void actionAdded(@Nonnull ch.bailu.gtk.type.Str action_name)  {
        JnaActionGroup.INST().g_action_group_action_added(asCPointer(), asCPointerNotNull(action_name));
    }

    /**
     * Emits the &#35;GActionGroup::action-added signal on &#64;action_group.
     * <br>
     * <br>This function should only be called by &#35;GActionGroup implementations.
     * @param action_name the name of an action in the group
    */
    public void actionAdded(String action_name)  {
        JnaActionGroup.INST().g_action_group_action_added(asCPointer(), action_name);
    }

    /**
     * Emits the &#35;GActionGroup::action-enabled-changed signal on &#64;action_group.
     * <br>
     * <br>This function should only be called by &#35;GActionGroup implementations.
     * @param action_name the name of an action in the group
     * @param enabled whether or not the action is now enabled
    */
    public void actionEnabledChanged(@Nonnull ch.bailu.gtk.type.Str action_name, boolean enabled)  {
        JnaActionGroup.INST().g_action_group_action_enabled_changed(asCPointer(), asCPointerNotNull(action_name), enabled);
    }

    /**
     * Emits the &#35;GActionGroup::action-enabled-changed signal on &#64;action_group.
     * <br>
     * <br>This function should only be called by &#35;GActionGroup implementations.
     * @param action_name the name of an action in the group
     * @param enabled whether or not the action is now enabled
    */
    public void actionEnabledChanged(String action_name, boolean enabled)  {
        JnaActionGroup.INST().g_action_group_action_enabled_changed(asCPointer(), action_name, enabled);
    }

    /**
     * Emits the &#35;GActionGroup::action-removed signal on &#64;action_group.
     * <br>
     * <br>This function should only be called by &#35;GActionGroup implementations.
     * @param action_name the name of an action in the group
    */
    public void actionRemoved(@Nonnull ch.bailu.gtk.type.Str action_name)  {
        JnaActionGroup.INST().g_action_group_action_removed(asCPointer(), asCPointerNotNull(action_name));
    }

    /**
     * Emits the &#35;GActionGroup::action-removed signal on &#64;action_group.
     * <br>
     * <br>This function should only be called by &#35;GActionGroup implementations.
     * @param action_name the name of an action in the group
    */
    public void actionRemoved(String action_name)  {
        JnaActionGroup.INST().g_action_group_action_removed(asCPointer(), action_name);
    }

    /**
     * Emits the &#35;GActionGroup::action-state-changed signal on &#64;action_group.
     * <br>
     * <br>This function should only be called by &#35;GActionGroup implementations.
     * @param action_name the name of an action in the group
     * @param state the new state of the named action
    */
    public void actionStateChanged(@Nonnull ch.bailu.gtk.type.Str action_name, @Nonnull ch.bailu.gtk.glib.Variant state)  {
        JnaActionGroup.INST().g_action_group_action_state_changed(asCPointer(), asCPointerNotNull(action_name), asCPointerNotNull(state));
    }

    /**
     * Emits the &#35;GActionGroup::action-state-changed signal on &#64;action_group.
     * <br>
     * <br>This function should only be called by &#35;GActionGroup implementations.
     * @param action_name the name of an action in the group
     * @param state the new state of the named action
    */
    public void actionStateChanged(String action_name, @Nonnull ch.bailu.gtk.glib.Variant state)  {
        JnaActionGroup.INST().g_action_group_action_state_changed(asCPointer(), action_name, asCPointerNotNull(state));
    }

    /**
     * Activate the named action within &#64;action_group.
     * <br>
     * <br>If the action is expecting a parameter, then the correct type of
     * <br>parameter must be given as &#64;parameter.  If the action is expecting no
     * <br>parameters then &#64;parameter must be %NULL.  See
     * <br>g_action_group_get_action_parameter_type().
     * <br>
     * <br>If the &#35;GActionGroup implementation supports asynchronous remote
     * <br>activation over D-Bus, this call may return before the relevant
     * <br>D-Bus traffic has been sent, or any replies have been received. In
     * <br>order to block on such asynchronous activation calls,
     * <br>g_dbus_connection_flush() should be called prior to the code, which
     * <br>depends on the result of the action activation. Without flushing
     * <br>the D-Bus connection, there is no guarantee that the action would
     * <br>have been activated.
     * <br>
     * <br>The following code which runs in a remote app instance, shows an
     * <br>example of a &quot;quit&quot; action being activated on the primary app
     * <br>instance over D-Bus. Here g_dbus_connection_flush() is called
     * <br>before `exit()`. Without g_dbus_connection_flush(), the &quot;quit&quot; action
     * <br>may fail to be activated on the primary instance.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * // call &quot;quit&quot; action on primary instance
     * g_action_group_activate_action (G_ACTION_GROUP (app), &quot;quit&quot;, NULL);
     * 
     * // make sure the action is activated now
     * g_dbus_connection_flush (...);
     * 
     * g_debug (&quot;application has been terminated. exiting.&quot;);
     * 
     * exit (0);
     * </pre>
     * @param action_name the name of the action to activate
     * @param parameter parameters to the activation
    */
    public void activateAction(@Nonnull ch.bailu.gtk.type.Str action_name, @Nullable ch.bailu.gtk.glib.Variant parameter)  {
        JnaActionGroup.INST().g_action_group_activate_action(asCPointer(), asCPointerNotNull(action_name), asCPointer(parameter));
    }

    /**
     * Activate the named action within &#64;action_group.
     * <br>
     * <br>If the action is expecting a parameter, then the correct type of
     * <br>parameter must be given as &#64;parameter.  If the action is expecting no
     * <br>parameters then &#64;parameter must be %NULL.  See
     * <br>g_action_group_get_action_parameter_type().
     * <br>
     * <br>If the &#35;GActionGroup implementation supports asynchronous remote
     * <br>activation over D-Bus, this call may return before the relevant
     * <br>D-Bus traffic has been sent, or any replies have been received. In
     * <br>order to block on such asynchronous activation calls,
     * <br>g_dbus_connection_flush() should be called prior to the code, which
     * <br>depends on the result of the action activation. Without flushing
     * <br>the D-Bus connection, there is no guarantee that the action would
     * <br>have been activated.
     * <br>
     * <br>The following code which runs in a remote app instance, shows an
     * <br>example of a &quot;quit&quot; action being activated on the primary app
     * <br>instance over D-Bus. Here g_dbus_connection_flush() is called
     * <br>before `exit()`. Without g_dbus_connection_flush(), the &quot;quit&quot; action
     * <br>may fail to be activated on the primary instance.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * // call &quot;quit&quot; action on primary instance
     * g_action_group_activate_action (G_ACTION_GROUP (app), &quot;quit&quot;, NULL);
     * 
     * // make sure the action is activated now
     * g_dbus_connection_flush (...);
     * 
     * g_debug (&quot;application has been terminated. exiting.&quot;);
     * 
     * exit (0);
     * </pre>
     * @param action_name the name of the action to activate
     * @param parameter parameters to the activation
    */
    public void activateAction(String action_name, @Nullable ch.bailu.gtk.glib.Variant parameter)  {
        JnaActionGroup.INST().g_action_group_activate_action(asCPointer(), action_name, asCPointer(parameter));
    }

    /**
     * Request for the state of the named action within &#64;action_group to be
     * <br>changed to &#64;value.
     * <br>
     * <br>The action must be stateful and &#64;value must be of the correct type.
     * <br>See g_action_group_get_action_state_type().
     * <br>
     * <br>This call merely requests a change.  The action may refuse to change
     * <br>its state or may change its state to something other than &#64;value.
     * <br>See g_action_group_get_action_state_hint().
     * <br>
     * <br>If the &#64;value GVariant is floating, it is consumed.
     * @param action_name the name of the action to request the change on
     * @param value the new state
    */
    public void changeActionState(@Nonnull ch.bailu.gtk.type.Str action_name, @Nonnull ch.bailu.gtk.glib.Variant value)  {
        JnaActionGroup.INST().g_action_group_change_action_state(asCPointer(), asCPointerNotNull(action_name), asCPointerNotNull(value));
    }

    /**
     * Request for the state of the named action within &#64;action_group to be
     * <br>changed to &#64;value.
     * <br>
     * <br>The action must be stateful and &#64;value must be of the correct type.
     * <br>See g_action_group_get_action_state_type().
     * <br>
     * <br>This call merely requests a change.  The action may refuse to change
     * <br>its state or may change its state to something other than &#64;value.
     * <br>See g_action_group_get_action_state_hint().
     * <br>
     * <br>If the &#64;value GVariant is floating, it is consumed.
     * @param action_name the name of the action to request the change on
     * @param value the new state
    */
    public void changeActionState(String action_name, @Nonnull ch.bailu.gtk.glib.Variant value)  {
        JnaActionGroup.INST().g_action_group_change_action_state(asCPointer(), action_name, asCPointerNotNull(value));
    }

    /**
     * Checks if the named action within &#64;action_group is currently enabled.
     * <br>
     * <br>An action must be enabled in order to be activated or in order to
     * <br>have its state changed from outside callers.
     * @param action_name the name of the action to query
     * @return whether or not the action is currently enabled
    */
    public boolean getActionEnabled(@Nonnull ch.bailu.gtk.type.Str action_name)  {
        return JnaActionGroup.INST().g_action_group_get_action_enabled(asCPointer(), asCPointerNotNull(action_name));
    }

    /**
     * Checks if the named action within &#64;action_group is currently enabled.
     * <br>
     * <br>An action must be enabled in order to be activated or in order to
     * <br>have its state changed from outside callers.
     * @param action_name the name of the action to query
     * @return whether or not the action is currently enabled
    */
    public boolean getActionEnabled(String action_name)  {
        return JnaActionGroup.INST().g_action_group_get_action_enabled(asCPointer(), action_name);
    }

    /**
     * Queries the type of the parameter that must be given when activating
     * <br>the named action within &#64;action_group.
     * <br>
     * <br>When activating the action using g_action_group_activate_action(),
     * <br>the &#35;GVariant given to that function must be of the type returned
     * <br>by this function.
     * <br>
     * <br>In the case that this function returns %NULL, you must not give any
     * <br>&#35;GVariant, but %NULL instead.
     * <br>
     * <br>The parameter type of a particular action will never change but it is
     * <br>possible for an action to be removed and for a new action to be added
     * <br>with the same name but a different parameter type.
     * @param action_name the name of the action to query
     * @return the parameter type
    */
    public ch.bailu.gtk.glib.VariantType getActionParameterType(@Nonnull ch.bailu.gtk.type.Str action_name)  {
        return new ch.bailu.gtk.glib.VariantType(new PointerContainer(JnaActionGroup.INST().g_action_group_get_action_parameter_type(asCPointer(), asCPointerNotNull(action_name))));
    }

    /**
     * Queries the type of the parameter that must be given when activating
     * <br>the named action within &#64;action_group.
     * <br>
     * <br>When activating the action using g_action_group_activate_action(),
     * <br>the &#35;GVariant given to that function must be of the type returned
     * <br>by this function.
     * <br>
     * <br>In the case that this function returns %NULL, you must not give any
     * <br>&#35;GVariant, but %NULL instead.
     * <br>
     * <br>The parameter type of a particular action will never change but it is
     * <br>possible for an action to be removed and for a new action to be added
     * <br>with the same name but a different parameter type.
     * @param action_name the name of the action to query
     * @return the parameter type
    */
    public ch.bailu.gtk.glib.VariantType getActionParameterType(String action_name)  {
        return new ch.bailu.gtk.glib.VariantType(new PointerContainer(JnaActionGroup.INST().g_action_group_get_action_parameter_type(asCPointer(), action_name)));
    }

    /**
     * Queries the current state of the named action within &#64;action_group.
     * <br>
     * <br>If the action is not stateful then %NULL will be returned.  If the
     * <br>action is stateful then the type of the return value is the type
     * <br>given by g_action_group_get_action_state_type().
     * <br>
     * <br>The return value (if non-%NULL) should be freed with
     * <br>g_variant_unref() when it is no longer required.
     * @param action_name the name of the action to query
     * @return the current state of the action
    */
    public ch.bailu.gtk.glib.Variant getActionState(@Nonnull ch.bailu.gtk.type.Str action_name)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaActionGroup.INST().g_action_group_get_action_state(asCPointer(), asCPointerNotNull(action_name))));
    }

    /**
     * Queries the current state of the named action within &#64;action_group.
     * <br>
     * <br>If the action is not stateful then %NULL will be returned.  If the
     * <br>action is stateful then the type of the return value is the type
     * <br>given by g_action_group_get_action_state_type().
     * <br>
     * <br>The return value (if non-%NULL) should be freed with
     * <br>g_variant_unref() when it is no longer required.
     * @param action_name the name of the action to query
     * @return the current state of the action
    */
    public ch.bailu.gtk.glib.Variant getActionState(String action_name)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaActionGroup.INST().g_action_group_get_action_state(asCPointer(), action_name)));
    }

    /**
     * Requests a hint about the valid range of values for the state of the
     * <br>named action within &#64;action_group.
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
     * @param action_name the name of the action to query
     * @return the state range hint
    */
    public ch.bailu.gtk.glib.Variant getActionStateHint(@Nonnull ch.bailu.gtk.type.Str action_name)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaActionGroup.INST().g_action_group_get_action_state_hint(asCPointer(), asCPointerNotNull(action_name))));
    }

    /**
     * Requests a hint about the valid range of values for the state of the
     * <br>named action within &#64;action_group.
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
     * @param action_name the name of the action to query
     * @return the state range hint
    */
    public ch.bailu.gtk.glib.Variant getActionStateHint(String action_name)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaActionGroup.INST().g_action_group_get_action_state_hint(asCPointer(), action_name)));
    }

    /**
     * Queries the type of the state of the named action within
     * <br>&#64;action_group.
     * <br>
     * <br>If the action is stateful then this function returns the
     * <br>&#35;GVariantType of the state.  All calls to
     * <br>g_action_group_change_action_state() must give a &#35;GVariant of this
     * <br>type and g_action_group_get_action_state() will return a &#35;GVariant
     * <br>of the same type.
     * <br>
     * <br>If the action is not stateful then this function will return %NULL.
     * <br>In that case, g_action_group_get_action_state() will return %NULL
     * <br>and you must not call g_action_group_change_action_state().
     * <br>
     * <br>The state type of a particular action will never change but it is
     * <br>possible for an action to be removed and for a new action to be added
     * <br>with the same name but a different state type.
     * @param action_name the name of the action to query
     * @return the state type, if the action is stateful
    */
    public ch.bailu.gtk.glib.VariantType getActionStateType(@Nonnull ch.bailu.gtk.type.Str action_name)  {
        return new ch.bailu.gtk.glib.VariantType(new PointerContainer(JnaActionGroup.INST().g_action_group_get_action_state_type(asCPointer(), asCPointerNotNull(action_name))));
    }

    /**
     * Queries the type of the state of the named action within
     * <br>&#64;action_group.
     * <br>
     * <br>If the action is stateful then this function returns the
     * <br>&#35;GVariantType of the state.  All calls to
     * <br>g_action_group_change_action_state() must give a &#35;GVariant of this
     * <br>type and g_action_group_get_action_state() will return a &#35;GVariant
     * <br>of the same type.
     * <br>
     * <br>If the action is not stateful then this function will return %NULL.
     * <br>In that case, g_action_group_get_action_state() will return %NULL
     * <br>and you must not call g_action_group_change_action_state().
     * <br>
     * <br>The state type of a particular action will never change but it is
     * <br>possible for an action to be removed and for a new action to be added
     * <br>with the same name but a different state type.
     * @param action_name the name of the action to query
     * @return the state type, if the action is stateful
    */
    public ch.bailu.gtk.glib.VariantType getActionStateType(String action_name)  {
        return new ch.bailu.gtk.glib.VariantType(new PointerContainer(JnaActionGroup.INST().g_action_group_get_action_state_type(asCPointer(), action_name)));
    }

    /**
     * Checks if the named action exists within &#64;action_group.
     * @param action_name the name of the action to check for
     * @return whether the named action exists
    */
    public boolean hasAction(@Nonnull ch.bailu.gtk.type.Str action_name)  {
        return JnaActionGroup.INST().g_action_group_has_action(asCPointer(), asCPointerNotNull(action_name));
    }

    /**
     * Checks if the named action exists within &#64;action_group.
     * @param action_name the name of the action to check for
     * @return whether the named action exists
    */
    public boolean hasAction(String action_name)  {
        return JnaActionGroup.INST().g_action_group_has_action(asCPointer(), action_name);
    }

    public final static String SIGNAL_ON_ACTION_ADDED = "action-added";
    
    /**
     * Connect to signal "action-added".
     * <br>See {@link OnActionAdded#onActionAdded} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTION_ADDED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActionAdded(OnActionAdded signal) {
        return connectSignal(SIGNAL_ON_ACTION_ADDED, toOnActionAdded(signal));
    }

    public final static String SIGNAL_ON_ACTION_ENABLED_CHANGED = "action-enabled-changed";
    
    /**
     * Connect to signal "action-enabled-changed".
     * <br>See {@link OnActionEnabledChanged#onActionEnabledChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTION_ENABLED_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActionEnabledChanged(OnActionEnabledChanged signal) {
        return connectSignal(SIGNAL_ON_ACTION_ENABLED_CHANGED, toOnActionEnabledChanged(signal));
    }

    public final static String SIGNAL_ON_ACTION_REMOVED = "action-removed";
    
    /**
     * Connect to signal "action-removed".
     * <br>See {@link OnActionRemoved#onActionRemoved} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTION_REMOVED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActionRemoved(OnActionRemoved signal) {
        return connectSignal(SIGNAL_ON_ACTION_REMOVED, toOnActionRemoved(signal));
    }

    public final static String SIGNAL_ON_ACTION_STATE_CHANGED = "action-state-changed";
    
    /**
     * Connect to signal "action-state-changed".
     * <br>See {@link OnActionStateChanged#onActionStateChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTION_STATE_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActionStateChanged(OnActionStateChanged signal) {
        return connectSignal(SIGNAL_ON_ACTION_STATE_CHANGED, toOnActionStateChanged(signal));
    }

    public static long getTypeID() { 
        return JnaActionGroup.INST().g_action_group_get_type(); 
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

[MethodModel:cb-return-value-not-supported:listActions:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:queryAction:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gboolean*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GVariantType**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GVariantType**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GVariant**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GVariant**}}:{j:}]
*/
