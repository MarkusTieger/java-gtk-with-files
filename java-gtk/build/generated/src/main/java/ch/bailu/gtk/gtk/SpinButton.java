/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkSpinButton` is an ideal way to allow the user to set the
 * <br>value of some attribute.
 * <br>
 * <br>![An example GtkSpinButton](spinbutton.png)
 * <br>
 * <br>Rather than having to directly type a number into a `GtkEntry`,
 * <br>`GtkSpinButton` allows the user to click on one of two arrows
 * <br>to increment or decrement the displayed value. A value can still be
 * <br>typed in, with the bonus that it can be checked to ensure it is in a
 * <br>given range.
 * <br>
 * <br>The main properties of a `GtkSpinButton` are through an adjustment.
 * <br>See the [class&#64;Gtk.Adjustment] documentation for more details about
 * <br>an adjustment's properties.
 * <br>
 * <br>Note that `GtkSpinButton` will by default make its entry large enough
 * <br>to accommodate the lower and upper bounds of the adjustment. If this
 * <br>is not desired, the automatic sizing can be turned off by explicitly
 * <br>setting [property&#64;Gtk.Editable:width-chars] to a value != -1.
 * <br>
 * <br>&#35;&#35; Using a GtkSpinButton to get an integer
 * <br>
 * <br>```c
 * <br>// Provides a function to retrieve an integer value from a GtkSpinButton
 * <br>// and creates a spin button to model percentage values.
 * <br>
 * <br>int
 * <br>grab_int_value (GtkSpinButton *button,
 * <br>                gpointer       user_data)
 * <br>{
 * <br>  return gtk_spin_button_get_value_as_int (button);
 * <br>}
 * <br>
 * <br>void
 * <br>create_integer_spin_button (void)
 * <br>{
 * <br>
 * <br>  GtkWidget *window, *button;
 * <br>  GtkAdjustment *adjustment;
 * <br>
 * <br>  adjustment = gtk_adjustment_new (50.0, 0.0, 100.0, 1.0, 5.0, 0.0);
 * <br>
 * <br>  window = gtk_window_new ();
 * <br>
 * <br>  // creates the spinbutton, with no decimal places
 * <br>  button = gtk_spin_button_new (adjustment, 1.0, 0);
 * <br>  gtk_window_set_child (GTK_WINDOW (window), button);
 * <br>
 * <br>  gtk_widget_show (window);
 * <br>}
 * <br>```
 * <br>
 * <br>&#35;&#35; Using a GtkSpinButton to get a floating point value
 * <br>
 * <br>```c
 * <br>// Provides a function to retrieve a floating point value from a
 * <br>// GtkSpinButton, and creates a high precision spin button.
 * <br>
 * <br>float
 * <br>grab_float_value (GtkSpinButton *button,
 * <br>                  gpointer       user_data)
 * <br>{
 * <br>  return gtk_spin_button_get_value (button);
 * <br>}
 * <br>
 * <br>void
 * <br>create_floating_spin_button (void)
 * <br>{
 * <br>  GtkWidget *window, *button;
 * <br>  GtkAdjustment *adjustment;
 * <br>
 * <br>  adjustment = gtk_adjustment_new (2.500, 0.0, 5.0, 0.001, 0.1, 0.0);
 * <br>
 * <br>  window = gtk_window_new ();
 * <br>
 * <br>  // creates the spinbutton, with three decimal places
 * <br>  button = gtk_spin_button_new (adjustment, 0.001, 3);
 * <br>  gtk_window_set_child (GTK_WINDOW (window), button);
 * <br>
 * <br>  gtk_widget_show (window);
 * <br>}
 * <br>```
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>spinbutton.horizontal
 * <br>├── text
 * <br>│    ├── undershoot.left
 * <br>│    ╰── undershoot.right
 * <br>├── button.down
 * <br>╰── button.up
 * <br>```
 * <br>
 * <br>```
 * <br>spinbutton.vertical
 * <br>├── button.up
 * <br>├── text
 * <br>│    ├── undershoot.left
 * <br>│    ╰── undershoot.right
 * <br>╰── button.down
 * <br>```
 * <br>
 * <br>`GtkSpinButton`s main CSS node has the name spinbutton. It creates subnodes
 * <br>for the entry and the two buttons, with these names. The button nodes have
 * <br>the style classes .up and .down. The `GtkText` subnodes (if present) are put
 * <br>below the text node. The orientation of the spin button is reflected in
 * <br>the .vertical or .horizontal style class on the main node.
 * <br>
 * <br>&#35; Accessiblity
 * <br>
 * <br>`GtkSpinButton` uses the %GTK_ACCESSIBLE_ROLE_SPIN_BUTTON role.
 * <p><a href="https://docs.gtk.org/gtk4/class.SpinButton.html">https://docs.gtk.org/gtk4/class.SpinButton.html</a></p>
*/
public class SpinButton extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SpinButton.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChangeValue {
        /**
         * Emitted when the user initiates a value change.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>Applications should not connect to it, but may emit it with
         * <br>g_signal_emit_by_name() if they need to control the cursor
         * <br>programmatically.
         * <br>
         * <br>The default bindings for this signal are Up/Down and PageUp/PageDown.
         * @param scroll a `GtkScrollType` to specify the speed and amount of change
        */
        void onChangeValue(int scroll);
    }
    
    private static com.sun.jna.Callback toOnChangeValue(OnChangeValue in) {
        return (in == null) ? null: (JnaSpinButton.OnChangeValue) (__self, _scroll, __data) -> in.onChangeValue(_scroll);
    }

    @FunctionalInterface
    public interface OnInput {
        /**
         * Emitted to convert the users input into a double value.
         * <br>
         * <br>The signal handler is expected to use [method&#64;Gtk.Editable.get_text]
         * <br>to retrieve the text of the spinbutton and set &#64;new_value to the
         * <br>new value.
         * <br>
         * <br>The default conversion uses g_strtod().
         * @param new_value return location for the new value
         * @return %TRUE for a successful conversion, %FALSE if the input   was not handled, and %GTK_INPUT_ERROR if the conversion failed.
        */
        int onInput(@Nonnull ch.bailu.gtk.type.Pointer new_value);
    }
    
    private static com.sun.jna.Callback toOnInput(OnInput in) {
        return (in == null) ? null: (JnaSpinButton.OnInput) (__self, _new_value, __data) -> in.onInput(new ch.bailu.gtk.type.Pointer(new PointerContainer(_new_value)));
    }

    @FunctionalInterface
    public interface OnOutput {
        /**
         * Emitted to tweak the formatting of the value for display.
         * <br>
         * <br>```c
         * <br>// show leading zeros
         * <br>static gboolean
         * <br>on_output (GtkSpinButton *spin,
         * <br>           gpointer       data)
         * <br>{
         * <br>   GtkAdjustment *adjustment;
         * <br>   char *text;
         * <br>   int value;
         * <br>
         * <br>   adjustment = gtk_spin_button_get_adjustment (spin);
         * <br>   value = (int)gtk_adjustment_get_value (adjustment);
         * <br>   text = g_strdup_printf (&quot;%02d&quot;, value);
         * <br>   gtk_editable_set_text (GTK_EDITABLE (spin), text):
         * <br>   g_free (text);
         * <br>
         * <br>   return TRUE;
         * <br>}
         * <br>```
         * @return %TRUE if the value has been displayed
        */
        boolean onOutput();
    }
    
    private static com.sun.jna.Callback toOnOutput(OnOutput in) {
        return (in == null) ? null: (JnaSpinButton.OnOutput) (__self, __data) -> in.onOutput();
    }

    @FunctionalInterface
    public interface OnValueChanged {
        /**
         * Emitted when the value is changed.
         * <br>
         * <br>Also see the [signal&#64;Gtk.SpinButton::output] signal.
        */
        void onValueChanged();
    }
    
    private static com.sun.jna.Callback toOnValueChanged(OnValueChanged in) {
        return (in == null) ? null: (JnaSpinButton.OnValueChanged) (__self, __data) -> in.onValueChanged();
    }

    @FunctionalInterface
    public interface OnWrapped {
        /**
         * Emitted right after the spinbutton wraps from its maximum
         * <br>to its minimum value or vice-versa.
        */
        void onWrapped();
    }
    
    private static com.sun.jna.Callback toOnWrapped(OnWrapped in) {
        return (in == null) ? null: (JnaSpinButton.OnWrapped) (__self, __data) -> in.onWrapped();
    }

    public SpinButton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkSpinButton` with the given properties.
     * <br>
     * <br>This is a convenience constructor that allows creation
     * <br>of a numeric `GtkSpinButton` without manually creating
     * <br>an adjustment. The value is initially set to the minimum
     * <br>value and a page increment of 10 * &#64;step is the default.
     * <br>The precision of the spin button is equivalent to the
     * <br>precision of &#64;step.
     * <br>
     * <br>Note that the way in which the precision is derived works
     * <br>best if &#64;step is a power of ten. If the resulting precision
     * <br>is not suitable for your needs, use
     * <br>[method&#64;Gtk.SpinButton.set_digits] to correct it.
     * @param min Minimum allowable value
     * @param max Maximum allowable value
     * @param step Increment added or subtracted by spinning the widget
     * @return The new `GtkSpinButton`
    */
    public static SpinButton newWithRangeSpinButton(double min, double max, double step)  {
        PointerContainer __self = cast(JnaSpinButton.INST().gtk_spin_button_new_with_range(min, max, step));
        if (__self.isNull()) {
            throw new NullPointerException("SpinButton:newWithRange");
        }
        return new SpinButton(__self);
    }        
    

    /**
     * Creates a new `GtkSpinButton`.
     * @param adjustment the `GtkAdjustment` that this spin button should use
     * @param climb_rate specifies by how much the rate of change in the value will   accelerate if you continue to hold down an up/down button or arrow key
     * @param digits the number of decimal places to display
    */
    public SpinButton(@Nullable Adjustment adjustment, double climb_rate, int digits) {
        super(cast(JnaSpinButton.INST().gtk_spin_button_new(asCPointer(adjustment), climb_rate, digits)));
    }

    /**
     * Changes the properties of an existing spin button.
     * <br>
     * <br>The adjustment, climb rate, and number of decimal places
     * <br>are updated accordingly.
     * @param adjustment a `GtkAdjustment` to replace the spin button’s   existing adjustment, or %NULL to leave its current adjustment unchanged
     * @param climb_rate the new climb rate
     * @param digits the number of decimal places to display in the spin button
    */
    public void configure(@Nullable Adjustment adjustment, double climb_rate, int digits)  {
        JnaSpinButton.INST().gtk_spin_button_configure(asCPointer(), asCPointer(adjustment), climb_rate, digits);
    }

    /**
     * Get the adjustment associated with a `GtkSpinButton`.
     * @return the `GtkAdjustment` of &#64;spin_button
    */
    public Adjustment getAdjustment()  {
        return new Adjustment(new PointerContainer(JnaSpinButton.INST().gtk_spin_button_get_adjustment(asCPointer())));
    }

    /**
     * Returns the acceleration rate for repeated changes.
     * @return the acceleration rate
    */
    public double getClimbRate()  {
        return JnaSpinButton.INST().gtk_spin_button_get_climb_rate(asCPointer());
    }

    /**
     * Fetches the precision of &#64;spin_button.
     * @return the current precision
    */
    public int getDigits()  {
        return JnaSpinButton.INST().gtk_spin_button_get_digits(asCPointer());
    }

    /**
     * Returns whether non-numeric text can be typed into the spin button.
     * @return %TRUE if only numeric text can be entered
    */
    public boolean getNumeric()  {
        return JnaSpinButton.INST().gtk_spin_button_get_numeric(asCPointer());
    }

    /**
     * Returns whether the values are corrected to the nearest step.
     * @return %TRUE if values are snapped to the nearest step
    */
    public boolean getSnapToTicks()  {
        return JnaSpinButton.INST().gtk_spin_button_get_snap_to_ticks(asCPointer());
    }

    /**
     * Gets the update behavior of a spin button.
     * <br>
     * <br>See [method&#64;Gtk.SpinButton.set_update_policy].
     * @return the current update policy
    */
    public int getUpdatePolicy()  {
        return JnaSpinButton.INST().gtk_spin_button_get_update_policy(asCPointer());
    }

    /**
     * Get the value in the &#64;spin_button.
     * @return the value of &#64;spin_button
    */
    public double getValue()  {
        return JnaSpinButton.INST().gtk_spin_button_get_value(asCPointer());
    }

    /**
     * Get the value &#64;spin_button represented as an integer.
     * @return the value of &#64;spin_button
    */
    public int getValueAsInt()  {
        return JnaSpinButton.INST().gtk_spin_button_get_value_as_int(asCPointer());
    }

    /**
     * Returns whether the spin button’s value wraps around to the
     * <br>opposite limit when the upper or lower limit of the range is
     * <br>exceeded.
     * @return %TRUE if the spin button wraps around
    */
    public boolean getWrap()  {
        return JnaSpinButton.INST().gtk_spin_button_get_wrap(asCPointer());
    }

    /**
     * Replaces the `GtkAdjustment` associated with &#64;spin_button.
     * @param adjustment a `GtkAdjustment` to replace the existing adjustment
    */
    public void setAdjustment(@Nonnull Adjustment adjustment)  {
        JnaSpinButton.INST().gtk_spin_button_set_adjustment(asCPointer(), asCPointerNotNull(adjustment));
    }

    /**
     * Sets the acceleration rate for repeated changes when you
     * <br>hold down a button or key.
     * @param climb_rate the rate of acceleration, must be &gt;= 0
    */
    public void setClimbRate(double climb_rate)  {
        JnaSpinButton.INST().gtk_spin_button_set_climb_rate(asCPointer(), climb_rate);
    }

    /**
     * Set the precision to be displayed by &#64;spin_button.
     * <br>
     * <br>Up to 20 digit precision is allowed.
     * @param digits the number of digits after the decimal point to be   displayed for the spin button’s value
    */
    public void setDigits(int digits)  {
        JnaSpinButton.INST().gtk_spin_button_set_digits(asCPointer(), digits);
    }

    /**
     * Sets the step and page increments for spin_button.
     * <br>
     * <br>This affects how quickly the value changes when
     * <br>the spin button’s arrows are activated.
     * @param step increment applied for a button 1 press.
     * @param page increment applied for a button 2 press.
    */
    public void setIncrements(double step, double page)  {
        JnaSpinButton.INST().gtk_spin_button_set_increments(asCPointer(), step, page);
    }

    /**
     * Sets the flag that determines if non-numeric text can be typed
     * <br>into the spin button.
     * @param numeric flag indicating if only numeric entry is allowed
    */
    public void setNumeric(boolean numeric)  {
        JnaSpinButton.INST().gtk_spin_button_set_numeric(asCPointer(), numeric);
    }

    /**
     * Sets the minimum and maximum allowable values for &#64;spin_button.
     * <br>
     * <br>If the current value is outside this range, it will be adjusted
     * <br>to fit within the range, otherwise it will remain unchanged.
     * @param min minimum allowable value
     * @param max maximum allowable value
    */
    public void setRange(double min, double max)  {
        JnaSpinButton.INST().gtk_spin_button_set_range(asCPointer(), min, max);
    }

    /**
     * Sets the policy as to whether values are corrected to the
     * <br>nearest step increment when a spin button is activated after
     * <br>providing an invalid value.
     * @param snap_to_ticks a flag indicating if invalid values should be corrected
    */
    public void setSnapToTicks(boolean snap_to_ticks)  {
        JnaSpinButton.INST().gtk_spin_button_set_snap_to_ticks(asCPointer(), snap_to_ticks);
    }

    /**
     * Sets the update behavior of a spin button.
     * <br>
     * <br>This determines whether the spin button is always
     * <br>updated or only when a valid value is set.
     * @param policy a `GtkSpinButtonUpdatePolicy` value
    */
    public void setUpdatePolicy(int policy)  {
        JnaSpinButton.INST().gtk_spin_button_set_update_policy(asCPointer(), policy);
    }

    /**
     * Sets the value of &#64;spin_button.
     * @param value the new value
    */
    public void setValue(double value)  {
        JnaSpinButton.INST().gtk_spin_button_set_value(asCPointer(), value);
    }

    /**
     * Sets the flag that determines if a spin button value wraps
     * <br>around to the opposite limit when the upper or lower limit
     * <br>of the range is exceeded.
     * @param wrap a flag indicating if wrapping behavior is performed
    */
    public void setWrap(boolean wrap)  {
        JnaSpinButton.INST().gtk_spin_button_set_wrap(asCPointer(), wrap);
    }

    /**
     * Increment or decrement a spin button’s value in a specified
     * <br>direction by a specified amount.
     * @param direction a `GtkSpinType` indicating the direction to spin
     * @param increment step increment to apply in the specified direction
    */
    public void spin(int direction, double increment)  {
        JnaSpinButton.INST().gtk_spin_button_spin(asCPointer(), direction, increment);
    }

    /**
     * Manually force an update of the spin button.
    */
    public void update()  {
        JnaSpinButton.INST().gtk_spin_button_update(asCPointer());
    }

    public final static String SIGNAL_ON_CHANGE_VALUE = "change-value";
    
    /**
     * Connect to signal "change-value".
     * <br>See {@link OnChangeValue#onChangeValue} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGE_VALUE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChangeValue(OnChangeValue signal) {
        return connectSignal(SIGNAL_ON_CHANGE_VALUE, toOnChangeValue(signal));
    }

    public final static String SIGNAL_ON_INPUT = "input";
    
    /**
     * Connect to signal "input".
     * <br>See {@link OnInput#onInput} for signal description.
     * <br>Field {@link #SIGNAL_ON_INPUT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInput(OnInput signal) {
        return connectSignal(SIGNAL_ON_INPUT, toOnInput(signal));
    }

    public final static String SIGNAL_ON_OUTPUT = "output";
    
    /**
     * Connect to signal "output".
     * <br>See {@link OnOutput#onOutput} for signal description.
     * <br>Field {@link #SIGNAL_ON_OUTPUT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onOutput(OnOutput signal) {
        return connectSignal(SIGNAL_ON_OUTPUT, toOnOutput(signal));
    }

    public final static String SIGNAL_ON_VALUE_CHANGED = "value-changed";
    
    /**
     * Connect to signal "value-changed".
     * <br>See {@link OnValueChanged#onValueChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_VALUE_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onValueChanged(OnValueChanged signal) {
        return connectSignal(SIGNAL_ON_VALUE_CHANGED, toOnValueChanged(signal));
    }

    public final static String SIGNAL_ON_WRAPPED = "wrapped";
    
    /**
     * Connect to signal "wrapped".
     * <br>See {@link OnWrapped#onWrapped} for signal description.
     * <br>Field {@link #SIGNAL_ON_WRAPPED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onWrapped(OnWrapped signal) {
        return connectSignal(SIGNAL_ON_WRAPPED, toOnWrapped(signal));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link CellEditable}. Call this to get access to interface functions.
     * @return {@link CellEditable}
    */
    public CellEditable asCellEditable() {
        return new CellEditable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link Editable}. Call this to get access to interface functions.
     * @return {@link Editable}
    */
    public Editable asEditable() {
        return new Editable(cast());
    }

    /**
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaSpinButton.INST().gtk_spin_button_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getIncrements:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:getRange:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
