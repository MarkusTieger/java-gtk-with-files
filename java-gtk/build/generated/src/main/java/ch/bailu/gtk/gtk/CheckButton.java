/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkCheckButton` places a label next to an indicator.
 * <br>
 * <br>![Example GtkCheckButtons](check-button.png)
 * <br>
 * <br>A `GtkCheckButton` is created by calling either [ctor&#64;Gtk.CheckButton.new]
 * <br>or [ctor&#64;Gtk.CheckButton.new_with_label].
 * <br>
 * <br>The state of a `GtkCheckButton` can be set specifically using
 * <br>[method&#64;Gtk.CheckButton.set_active], and retrieved using
 * <br>[method&#64;Gtk.CheckButton.get_active].
 * <br>
 * <br>&#35; Inconsistent state
 * <br>
 * <br>In addition to &quot;on&quot; and &quot;off&quot;, check buttons can be an
 * <br>&quot;in between&quot; state that is neither on nor off. This can be used
 * <br>e.g. when the user has selected a range of elements (such as some
 * <br>text or spreadsheet cells) that are affected by a check button,
 * <br>and the current values in that range are inconsistent.
 * <br>
 * <br>To set a `GtkCheckButton` to inconsistent state, use
 * <br>[method&#64;Gtk.CheckButton.set_inconsistent].
 * <br>
 * <br>&#35; Grouping
 * <br>
 * <br>Check buttons can be grouped together, to form mutually exclusive
 * <br>groups - only one of the buttons can be toggled at a time, and toggling
 * <br>another one will switch the currently toggled one off.
 * <br>
 * <br>Grouped check buttons use a different indicator, and are commonly referred
 * <br>to as *radio buttons*.
 * <br>
 * <br>![Example GtkCheckButtons](radio-button.png)
 * <br>
 * <br>To add a `GtkCheckButton` to a group, use [method&#64;Gtk.CheckButton.set_group].
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>checkbutton[.text-button]
 * <br>├── check
 * <br>╰── [label]
 * <br>```
 * <br>
 * <br>A `GtkCheckButton` has a main node with name checkbutton. If the
 * <br>[property&#64;Gtk.CheckButton:label] or [property&#64;Gtk.CheckButton:child]
 * <br>properties are set, it contains a child widget. The indicator node
 * <br>is named check when no group is set, and radio if the checkbutton
 * <br>is grouped together with other checkbuttons.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkCheckButton` uses the %GTK_ACCESSIBLE_ROLE_CHECKBOX role.
 * <p><a href="https://docs.gtk.org/gtk4/class.CheckButton.html">https://docs.gtk.org/gtk4/class.CheckButton.html</a></p>
*/
public class CheckButton extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CheckButton.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted to when the check button is activated.
         * <br>
         * <br>The `::activate` signal on `GtkCheckButton` is an action signal and
         * <br>emitting it causes the button to animate press then release.
         * <br>
         * <br>Applications should never connect to this signal, but use the
         * <br>[signal&#64;Gtk.CheckButton::toggled] signal.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaCheckButton.OnActivate) (__self, __data) -> in.onActivate();
    }

    @FunctionalInterface
    public interface OnToggled {
        /**
         * Emitted when the buttons's [property&#64;Gtk.CheckButton:active]
         * <br>property changes.
        */
        void onToggled();
    }
    
    private static com.sun.jna.Callback toOnToggled(OnToggled in) {
        return (in == null) ? null: (JnaCheckButton.OnToggled) (__self, __data) -> in.onToggled();
    }

    public CheckButton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkCheckButton` with the given text.
     * @param label the text for the check button.
     * @return a new `GtkCheckButton`
    */
    public static CheckButton newWithLabelCheckButton(@Nullable ch.bailu.gtk.type.Str label)  {
        PointerContainer __self = cast(JnaCheckButton.INST().gtk_check_button_new_with_label(asCPointer(label)));
        if (__self.isNull()) {
            throw new NullPointerException("CheckButton:newWithLabel");
        }
        return new CheckButton(__self);
    }        
    

    /**
     * Creates a new `GtkCheckButton` with the given text.
     * @param label the text for the check button.
     * @return a new `GtkCheckButton`
    */
    public static CheckButton newWithLabelCheckButton(String label)  {
        PointerContainer __self = cast(JnaCheckButton.INST().gtk_check_button_new_with_label(label));
        if (__self.isNull()) {
            throw new NullPointerException("CheckButton:newWithLabel");
        }
        return new CheckButton(__self);
    }        
    

    /**
     * Creates a new `GtkCheckButton` with the given text and a mnemonic.
     * @param label The text of the button, with an underscore   in front of the mnemonic character
     * @return a new `GtkCheckButton`
    */
    public static CheckButton newWithMnemonicCheckButton(@Nullable ch.bailu.gtk.type.Str label)  {
        PointerContainer __self = cast(JnaCheckButton.INST().gtk_check_button_new_with_mnemonic(asCPointer(label)));
        if (__self.isNull()) {
            throw new NullPointerException("CheckButton:newWithMnemonic");
        }
        return new CheckButton(__self);
    }        
    

    /**
     * Creates a new `GtkCheckButton` with the given text and a mnemonic.
     * @param label The text of the button, with an underscore   in front of the mnemonic character
     * @return a new `GtkCheckButton`
    */
    public static CheckButton newWithMnemonicCheckButton(String label)  {
        PointerContainer __self = cast(JnaCheckButton.INST().gtk_check_button_new_with_mnemonic(label));
        if (__self.isNull()) {
            throw new NullPointerException("CheckButton:newWithMnemonic");
        }
        return new CheckButton(__self);
    }        
    

    /**
     * Creates a new `GtkCheckButton`.
    */
    public CheckButton() {
        super(cast(JnaCheckButton.INST().gtk_check_button_new()));
    }

    /**
     * Returns whether the check button is active.
     * @return whether the check button is active
    */
    public boolean getActive()  {
        return JnaCheckButton.INST().gtk_check_button_get_active(asCPointer());
    }

    /**
     * Gets the child widget of &#64;button or `NULL` if [property&#64;CheckButton:label] is set.
     * @return the child widget of &#64;button
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaCheckButton.INST().gtk_check_button_get_child(asCPointer())));
    }

    /**
     * Returns whether the check button is in an inconsistent state.
     * @return %TRUE if &#64;check_button is currently in an inconsistent state
    */
    public boolean getInconsistent()  {
        return JnaCheckButton.INST().gtk_check_button_get_inconsistent(asCPointer());
    }

    /**
     * Returns the label of the check button or `NULL` if [property&#64;CheckButton:child] is set.
     * @return The label &#64;self shows next   to the indicator. If no label is shown, %NULL will be returned.
    */
    public ch.bailu.gtk.type.Str getLabel()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaCheckButton.INST().gtk_check_button_get_label(asCPointer())));
    }

    /**
     * Returns whether underlines in the label indicate mnemonics.
     * @return The value of the [property&#64;Gtk.CheckButton:use-underline] property.   See [method&#64;Gtk.CheckButton.set_use_underline] for details on how to set   a new value.
    */
    public boolean getUseUnderline()  {
        return JnaCheckButton.INST().gtk_check_button_get_use_underline(asCPointer());
    }

    /**
     * Changes the check buttons active state.
     * @param setting the new value to set
    */
    public void setActive(boolean setting)  {
        JnaCheckButton.INST().gtk_check_button_set_active(asCPointer(), setting);
    }

    /**
     * Sets the child widget of &#64;button.
     * <br>
     * <br>Note that by using this API, you take full responsibility for setting
     * <br>up the proper accessibility label and description information for &#64;button.
     * <br>Most likely, you'll either set the accessibility label or description
     * <br>for &#64;button explicitly, or you'll set a labelled-by or described-by
     * <br>relations from &#64;child to &#64;button.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaCheckButton.INST().gtk_check_button_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Adds &#64;self to the group of &#64;group.
     * <br>
     * <br>In a group of multiple check buttons, only one button can be active
     * <br>at a time. The behavior of a checkbutton in a group is also commonly
     * <br>known as a *radio button*.
     * <br>
     * <br>Setting the group of a check button also changes the css name of the
     * <br>indicator widget's CSS node to 'radio'.
     * <br>
     * <br>Setting up groups in a cycle leads to undefined behavior.
     * <br>
     * <br>Note that the same effect can be achieved via the [iface&#64;Gtk.Actionable]
     * <br>API, by using the same action with parameter type and state type 's'
     * <br>for all buttons in the group, and giving each button its own target
     * <br>value.
     * @param group another `GtkCheckButton` to   form a group with
    */
    public void setGroup(@Nullable CheckButton group)  {
        JnaCheckButton.INST().gtk_check_button_set_group(asCPointer(), asCPointer(group));
    }

    /**
     * Sets the `GtkCheckButton` to inconsistent state.
     * <br>
     * <br>You shoud turn off the inconsistent state again if the user checks
     * <br>the check button. This has to be done manually.
     * @param inconsistent %TRUE if state is inconsistent
    */
    public void setInconsistent(boolean inconsistent)  {
        JnaCheckButton.INST().gtk_check_button_set_inconsistent(asCPointer(), inconsistent);
    }

    /**
     * Sets the text of &#64;self.
     * <br>
     * <br>If [property&#64;Gtk.CheckButton:use-underline] is %TRUE, an underscore
     * <br>in &#64;label is interpreted as mnemonic indicator, see
     * <br>[method&#64;Gtk.CheckButton.set_use_underline] for details on this behavior.
     * @param label The text shown next to the indicator, or %NULL   to show no text
    */
    public void setLabel(@Nullable ch.bailu.gtk.type.Str label)  {
        JnaCheckButton.INST().gtk_check_button_set_label(asCPointer(), asCPointer(label));
    }

    /**
     * Sets the text of &#64;self.
     * <br>
     * <br>If [property&#64;Gtk.CheckButton:use-underline] is %TRUE, an underscore
     * <br>in &#64;label is interpreted as mnemonic indicator, see
     * <br>[method&#64;Gtk.CheckButton.set_use_underline] for details on this behavior.
     * @param label The text shown next to the indicator, or %NULL   to show no text
    */
    public void setLabel(String label)  {
        JnaCheckButton.INST().gtk_check_button_set_label(asCPointer(), label);
    }

    /**
     * Sets whether underlines in the label indicate mnemonics.
     * <br>
     * <br>If &#64;setting is %TRUE, an underscore character in &#64;self's label
     * <br>indicates a mnemonic accelerator key. This behavior is similar
     * <br>to [property&#64;Gtk.Label:use-underline].
     * @param setting the new value to set
    */
    public void setUseUnderline(boolean setting)  {
        JnaCheckButton.INST().gtk_check_button_set_use_underline(asCPointer(), setting);
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

    public final static String SIGNAL_ON_TOGGLED = "toggled";
    
    /**
     * Connect to signal "toggled".
     * <br>See {@link OnToggled#onToggled} for signal description.
     * <br>Field {@link #SIGNAL_ON_TOGGLED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onToggled(OnToggled signal) {
        return connectSignal(SIGNAL_ON_TOGGLED, toOnToggled(signal));
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
        return JnaCheckButton.INST().gtk_check_button_get_type(); 
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
