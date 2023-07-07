/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSwitch` is a &quot;light switch&quot; that has two states: on or off.
 * <br>
 * <br>![An example GtkSwitch](switch.png)
 * <br>
 * <br>The user can control which state should be active by clicking the
 * <br>empty area, or by dragging the handle.
 * <br>
 * <br>`GtkSwitch` can also handle situations where the underlying state
 * <br>changes with a delay. See [signal&#64;GtkSwitch::state-set] for details.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>switch
 * <br>├── label
 * <br>├── label
 * <br>╰── slider
 * <br>```
 * <br>
 * <br>`GtkSwitch` has four css nodes, the main node with the name switch and
 * <br>subnodes for the slider and the on and off labels. Neither of them is
 * <br>using any style classes.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkSwitch` uses the %GTK_ACCESSIBLE_ROLE_SWITCH role.
 * <p><a href="https://docs.gtk.org/gtk4/class.Switch.html">https://docs.gtk.org/gtk4/class.Switch.html</a></p>
*/
public class Switch extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Switch.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted to animate the switch.
         * <br>
         * <br>Applications should never connect to this signal,
         * <br>but use the [property&#64;Gtk.Switch:active] property.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaSwitch.OnActivate) (__self, __data) -> in.onActivate();
    }

    @FunctionalInterface
    public interface OnStateSet {
        /**
         * Emitted to change the underlying state.
         * <br>
         * <br>The ::state-set signal is emitted when the user changes the switch
         * <br>position. The default handler keeps the state in sync with the
         * <br>[property&#64;Gtk.Switch:active] property.
         * <br>
         * <br>To implement delayed state change, applications can connect to this
         * <br>signal, initiate the change of the underlying state, and call
         * <br>[method&#64;Gtk.Switch.set_state] when the underlying state change is
         * <br>complete. The signal handler should return %TRUE to prevent the
         * <br>default handler from running.
         * <br>
         * <br>Visually, the underlying state is represented by the trough color of
         * <br>the switch, while the [property&#64;Gtk.Switch:active] property is
         * <br>represented by the position of the switch.
         * @param state the new state of the switch
         * @return %TRUE to stop the signal emission
        */
        boolean onStateSet(boolean state);
    }
    
    private static com.sun.jna.Callback toOnStateSet(OnStateSet in) {
        return (in == null) ? null: (JnaSwitch.OnStateSet) (__self, _state, __data) -> in.onStateSet(_state);
    }

    public Switch(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkSwitch` widget.
    */
    public Switch() {
        super(cast(JnaSwitch.INST().gtk_switch_new()));
    }

    /**
     * Gets whether the `GtkSwitch` is in its “on” or “off” state.
     * @return %TRUE if the `GtkSwitch` is active, and %FALSE otherwise
    */
    public boolean getActive()  {
        return JnaSwitch.INST().gtk_switch_get_active(asCPointer());
    }

    /**
     * Gets the underlying state of the `GtkSwitch`.
     * @return the underlying state
    */
    public boolean getState()  {
        return JnaSwitch.INST().gtk_switch_get_state(asCPointer());
    }

    /**
     * Changes the state of &#64;self to the desired one.
     * @param is_active %TRUE if &#64;self should be active, and %FALSE otherwise
    */
    public void setActive(boolean is_active)  {
        JnaSwitch.INST().gtk_switch_set_active(asCPointer(), is_active);
    }

    /**
     * Sets the underlying state of the `GtkSwitch`.
     * <br>
     * <br>Normally, this is the same as [property&#64;Gtk.Switch:active], unless
     * <br>the switch is set up for delayed state changes. This function is
     * <br>typically called from a [signal&#64;Gtk.Switch::state-set] signal handler.
     * <br>
     * <br>See [signal&#64;Gtk.Switch::state-set] for details.
     * @param state the new state
    */
    public void setState(boolean state)  {
        JnaSwitch.INST().gtk_switch_set_state(asCPointer(), state);
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

    public final static String SIGNAL_ON_STATE_SET = "state-set";
    
    /**
     * Connect to signal "state-set".
     * <br>See {@link OnStateSet#onStateSet} for signal description.
     * <br>Field {@link #SIGNAL_ON_STATE_SET} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onStateSet(OnStateSet signal) {
        return connectSignal(SIGNAL_ON_STATE_SET, toOnStateSet(signal));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Actionable}. Call this to get access to interface functions.
     * @return {@link Actionable}
    */
    public Actionable asActionable() {
        return new Actionable(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaSwitch.INST().gtk_switch_get_type(); 
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
