/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkToggleButton` is a button which remains “pressed-in” when
 * <br>clicked.
 * <br>
 * <br>Clicking again will cause the toggle button to return to its normal state.
 * <br>
 * <br>A toggle button is created by calling either [ctor&#64;Gtk.ToggleButton.new] or
 * <br>[ctor&#64;Gtk.ToggleButton.new_with_label]. If using the former, it is advisable
 * <br>to pack a widget, (such as a `GtkLabel` and/or a `GtkImage`), into the toggle
 * <br>button’s container. (See [class&#64;Gtk.Button] for more information).
 * <br>
 * <br>The state of a `GtkToggleButton` can be set specifically using
 * <br>[method&#64;Gtk.ToggleButton.set_active], and retrieved using
 * <br>[method&#64;Gtk.ToggleButton.get_active].
 * <br>
 * <br>To simply switch the state of a toggle button, use
 * <br>[method&#64;Gtk.ToggleButton.toggled].
 * <br>
 * <br>&#35;&#35; Grouping
 * <br>
 * <br>Toggle buttons can be grouped together, to form mutually exclusive
 * <br>groups - only one of the buttons can be toggled at a time, and toggling
 * <br>another one will switch the currently toggled one off.
 * <br>
 * <br>To add a `GtkToggleButton` to a group, use [method&#64;Gtk.ToggleButton.set_group].
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`GtkToggleButton` has a single CSS node with name button. To differentiate
 * <br>it from a plain `GtkButton`, it gets the `.toggle` style class.
 * <br>
 * <br>&#35;&#35; Creating two `GtkToggleButton` widgets.
 * <br>
 * <br>```c
 * <br>static void
 * <br>output_state (GtkToggleButton *source,
 * <br>              gpointer         user_data)
 * <br>{
 * <br>  g_print (&quot;Toggle button &quot;%s&quot; is active: %s&quot;,
 * <br>           gtk_button_get_label (GTK_BUTTON (source)),
 * <br>           gtk_toggle_button_get_active (source) ? &quot;Yes&quot; : &quot;No&quot;);
 * <br>}
 * <br>
 * <br>static void
 * <br>make_toggles (void)
 * <br>{
 * <br>  GtkWidget *window, *toggle1, *toggle2;
 * <br>  GtkWidget *box;
 * <br>  const char *text;
 * <br>
 * <br>  window = gtk_window_new ();
 * <br>  box = gtk_box_new (GTK_ORIENTATION_VERTICAL, 12);
 * <br>
 * <br>  text = &quot;Hi, I’m toggle button one&quot;;
 * <br>  toggle1 = gtk_toggle_button_new_with_label (text);
 * <br>
 * <br>  g_signal_connect (toggle1, &quot;toggled&quot;,
 * <br>                    G_CALLBACK (output_state),
 * <br>                    NULL);
 * <br>  gtk_box_append (GTK_BOX (box), toggle1);
 * <br>
 * <br>  text = &quot;Hi, I’m toggle button two&quot;;
 * <br>  toggle2 = gtk_toggle_button_new_with_label (text);
 * <br>  g_signal_connect (toggle2, &quot;toggled&quot;,
 * <br>                    G_CALLBACK (output_state),
 * <br>                    NULL);
 * <br>  gtk_box_append (GTK_BOX (box), toggle2);
 * <br>
 * <br>  gtk_window_set_child (GTK_WINDOW (window), box);
 * <br>  gtk_widget_show (window);
 * <br>}
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.ToggleButton.html">https://docs.gtk.org/gtk4/class.ToggleButton.html</a></p>
*/
public class ToggleButton extends Button {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ToggleButton.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnToggled {
        /**
         * Emitted whenever the `GtkToggleButton`'s state is changed.
        */
        void onToggled();
    }
    
    private static com.sun.jna.Callback toOnToggled(OnToggled in) {
        return (in == null) ? null: (JnaToggleButton.OnToggled) (__self, __data) -> in.onToggled();
    }

    public ToggleButton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new toggle button with a text label.
     * @param label a string containing the message to be placed in the toggle button.
     * @return a new toggle button.
    */
    public static ToggleButton newWithLabelToggleButton(@Nonnull ch.bailu.gtk.type.Str label)  {
        PointerContainer __self = cast(JnaToggleButton.INST().gtk_toggle_button_new_with_label(asCPointerNotNull(label)));
        if (__self.isNull()) {
            throw new NullPointerException("ToggleButton:newWithLabel");
        }
        return new ToggleButton(__self);
    }        
    

    /**
     * Creates a new toggle button with a text label.
     * @param label a string containing the message to be placed in the toggle button.
     * @return a new toggle button.
    */
    public static ToggleButton newWithLabelToggleButton(String label)  {
        PointerContainer __self = cast(JnaToggleButton.INST().gtk_toggle_button_new_with_label(label));
        if (__self.isNull()) {
            throw new NullPointerException("ToggleButton:newWithLabel");
        }
        return new ToggleButton(__self);
    }        
    

    /**
     * Creates a new `GtkToggleButton` containing a label.
     * <br>
     * <br>The label will be created using [ctor&#64;Gtk.Label.new_with_mnemonic],
     * <br>so underscores in &#64;label indicate the mnemonic for the button.
     * @param label the text of the button, with an underscore in front of the   mnemonic character
     * @return a new `GtkToggleButton`
    */
    public static ToggleButton newWithMnemonicToggleButton(@Nonnull ch.bailu.gtk.type.Str label)  {
        PointerContainer __self = cast(JnaToggleButton.INST().gtk_toggle_button_new_with_mnemonic(asCPointerNotNull(label)));
        if (__self.isNull()) {
            throw new NullPointerException("ToggleButton:newWithMnemonic");
        }
        return new ToggleButton(__self);
    }        
    

    /**
     * Creates a new `GtkToggleButton` containing a label.
     * <br>
     * <br>The label will be created using [ctor&#64;Gtk.Label.new_with_mnemonic],
     * <br>so underscores in &#64;label indicate the mnemonic for the button.
     * @param label the text of the button, with an underscore in front of the   mnemonic character
     * @return a new `GtkToggleButton`
    */
    public static ToggleButton newWithMnemonicToggleButton(String label)  {
        PointerContainer __self = cast(JnaToggleButton.INST().gtk_toggle_button_new_with_mnemonic(label));
        if (__self.isNull()) {
            throw new NullPointerException("ToggleButton:newWithMnemonic");
        }
        return new ToggleButton(__self);
    }        
    

    /**
     * Creates a new toggle button.
     * <br>
     * <br>A widget should be packed into the button, as in [ctor&#64;Gtk.Button.new].
    */
    public ToggleButton() {
        super(cast(JnaToggleButton.INST().gtk_toggle_button_new()));
    }

    /**
     * Queries a `GtkToggleButton` and returns its current state.
     * <br>
     * <br>Returns %TRUE if the toggle button is pressed in and %FALSE
     * <br>if it is raised.
     * @return whether the button is pressed
    */
    public boolean getActive()  {
        return JnaToggleButton.INST().gtk_toggle_button_get_active(asCPointer());
    }

    /**
     * Sets the status of the toggle button.
     * <br>
     * <br>Set to %TRUE if you want the `GtkToggleButton` to be “pressed in”,
     * <br>and %FALSE to raise it.
     * <br>
     * <br>If the status of the button changes, this action causes the
     * <br>[signal&#64;GtkToggleButton::toggled] signal to be emitted.
     * @param is_active %TRUE or %FALSE.
    */
    public void setActive(boolean is_active)  {
        JnaToggleButton.INST().gtk_toggle_button_set_active(asCPointer(), is_active);
    }

    /**
     * Adds &#64;self to the group of &#64;group.
     * <br>
     * <br>In a group of multiple toggle buttons, only one button can be active
     * <br>at a time.
     * <br>
     * <br>Setting up groups in a cycle leads to undefined behavior.
     * <br>
     * <br>Note that the same effect can be achieved via the [iface&#64;Gtk.Actionable]
     * <br>API, by using the same action with parameter type and state type 's'
     * <br>for all buttons in the group, and giving each button its own target
     * <br>value.
     * @param group another `GtkToggleButton` to   form a group with
    */
    public void setGroup(@Nullable ToggleButton group)  {
        JnaToggleButton.INST().gtk_toggle_button_set_group(asCPointer(), asCPointer(group));
    }

    /**
     * Emits the ::toggled signal on the `GtkToggleButton`.
     * <br>
     * <br>There is no good reason for an application ever to call this function.
    */
    public void toggled()  {
        JnaToggleButton.INST().gtk_toggle_button_toggled(asCPointer());
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
        return JnaToggleButton.INST().gtk_toggle_button_get_type(); 
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
