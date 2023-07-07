/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkAdjustment` is a model for a numeric value.
 * <br>
 * <br>The `GtkAdjustment has an associated lower and upper bound.
 * <br>It also contains step and page increments, and a page size.
 * <br>
 * <br>Adjustments are used within several GTK widgets, including
 * <br>[class&#64;Gtk.SpinButton], [class&#64;Gtk.Viewport], [class&#64;Gtk.Scrollbar]
 * <br>and [class&#64;Gtk.Scale].
 * <br>
 * <br>The `GtkAdjustment` object does not update the value itself. Instead
 * <br>it is left up to the owner of the `GtkAdjustment` to control the value.
 * <p><a href="https://docs.gtk.org/gtk4/class.Adjustment.html">https://docs.gtk.org/gtk4/class.Adjustment.html</a></p>
*/
public class Adjustment extends ch.bailu.gtk.gobject.InitiallyUnowned {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Adjustment.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted when one or more of the `GtkAdjustment` properties have been
         * <br>changed.
         * <br>
         * <br>Note that the [property&#64;Gtk.Adjustment:value] property is
         * <br>covered by the [signal&#64;Gtk.Adjustment::value-changed] signal.
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaAdjustment.OnChanged) (__self, __data) -> in.onChanged();
    }

    @FunctionalInterface
    public interface OnValueChanged {
        /**
         * Emitted when the value has been changed.
        */
        void onValueChanged();
    }
    
    private static com.sun.jna.Callback toOnValueChanged(OnValueChanged in) {
        return (in == null) ? null: (JnaAdjustment.OnValueChanged) (__self, __data) -> in.onValueChanged();
    }

    public Adjustment(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkAdjustment`.
     * @param value the initial value
     * @param lower the minimum value
     * @param upper the maximum value
     * @param step_increment the step increment
     * @param page_increment the page increment
     * @param page_size the page size
    */
    public Adjustment(double value, double lower, double upper, double step_increment, double page_increment, double page_size) {
        super(cast(JnaAdjustment.INST().gtk_adjustment_new(value, lower, upper, step_increment, page_increment, page_size)));
    }

    /**
     * Updates the value property to ensure that the range
     * <br>between &#64;lower and &#64;upper is in the current page.
     * <br>
     * <br>The current page goes from `value` to `value` + `page-size`.
     * <br>If the range is larger than the page size, then only the
     * <br>start of it will be in the current page.
     * <br>
     * <br>A [signal&#64;Gtk.Adjustment::value-changed] signal will be emitted
     * <br>if the value is changed.
     * @param lower the lower value
     * @param upper the upper value
    */
    public void clampPage(double lower, double upper)  {
        JnaAdjustment.INST().gtk_adjustment_clamp_page(asCPointer(), lower, upper);
    }

    /**
     * Sets all properties of the adjustment at once.
     * <br>
     * <br>Use this function to avoid multiple emissions of the
     * <br>[signal&#64;Gtk.Adjustment::changed] signal. See
     * <br>[method&#64;Gtk.Adjustment.set_lower] for an alternative
     * <br>way of compressing multiple emissions of
     * <br>[signal&#64;Gtk.Adjustment::changed] into one.
     * @param value the new value
     * @param lower the new minimum value
     * @param upper the new maximum value
     * @param step_increment the new step increment
     * @param page_increment the new page increment
     * @param page_size the new page size
    */
    public void configure(double value, double lower, double upper, double step_increment, double page_increment, double page_size)  {
        JnaAdjustment.INST().gtk_adjustment_configure(asCPointer(), value, lower, upper, step_increment, page_increment, page_size);
    }

    /**
     * Retrieves the minimum value of the adjustment.
     * @return The current minimum value of the adjustment
    */
    public double getLower()  {
        return JnaAdjustment.INST().gtk_adjustment_get_lower(asCPointer());
    }

    /**
     * Gets the smaller of step increment and page increment.
     * @return the minimum increment of &#64;adjustment
    */
    public double getMinimumIncrement()  {
        return JnaAdjustment.INST().gtk_adjustment_get_minimum_increment(asCPointer());
    }

    /**
     * Retrieves the page increment of the adjustment.
     * @return The current page increment of the adjustment
    */
    public double getPageIncrement()  {
        return JnaAdjustment.INST().gtk_adjustment_get_page_increment(asCPointer());
    }

    /**
     * Retrieves the page size of the adjustment.
     * @return The current page size of the adjustment
    */
    public double getPageSize()  {
        return JnaAdjustment.INST().gtk_adjustment_get_page_size(asCPointer());
    }

    /**
     * Retrieves the step increment of the adjustment.
     * @return The current step increment of the adjustment.
    */
    public double getStepIncrement()  {
        return JnaAdjustment.INST().gtk_adjustment_get_step_increment(asCPointer());
    }

    /**
     * Retrieves the maximum value of the adjustment.
     * @return The current maximum value of the adjustment
    */
    public double getUpper()  {
        return JnaAdjustment.INST().gtk_adjustment_get_upper(asCPointer());
    }

    /**
     * Gets the current value of the adjustment.
     * @return The current value of the adjustment
    */
    public double getValue()  {
        return JnaAdjustment.INST().gtk_adjustment_get_value(asCPointer());
    }

    /**
     * Sets the minimum value of the adjustment.
     * <br>
     * <br>When setting multiple adjustment properties via their individual
     * <br>setters, multiple [signal&#64;Gtk.Adjustment::changed] signals will
     * <br>be emitted. However, since the emission of the
     * <br>[signal&#64;Gtk.Adjustment::changed] signal is tied to the emission
     * <br>of the ::notify signals of the changed properties, it’s possible
     * <br>to compress the [signal&#64;Gtk.Adjustment::changed] signals into one
     * <br>by calling g_object_freeze_notify() and g_object_thaw_notify()
     * <br>around the calls to the individual setters.
     * <br>
     * <br>Alternatively, using a single g_object_set() for all the properties
     * <br>to change, or using [method&#64;Gtk.Adjustment.configure] has the same effect.
     * @param lower the new minimum value
    */
    public void setLower(double lower)  {
        JnaAdjustment.INST().gtk_adjustment_set_lower(asCPointer(), lower);
    }

    /**
     * Sets the page increment of the adjustment.
     * <br>
     * <br>See [method&#64;Gtk.Adjustment.set_lower] about how to compress
     * <br>multiple emissions of the [signal&#64;Gtk.Adjustment::changed]
     * <br>signal when setting multiple adjustment properties.
     * @param page_increment the new page increment
    */
    public void setPageIncrement(double page_increment)  {
        JnaAdjustment.INST().gtk_adjustment_set_page_increment(asCPointer(), page_increment);
    }

    /**
     * Sets the page size of the adjustment.
     * <br>
     * <br>See [method&#64;Gtk.Adjustment.set_lower] about how to compress
     * <br>multiple emissions of the [signal&#64;Gtk.Adjustment::changed]
     * <br>signal when setting multiple adjustment properties.
     * @param page_size the new page size
    */
    public void setPageSize(double page_size)  {
        JnaAdjustment.INST().gtk_adjustment_set_page_size(asCPointer(), page_size);
    }

    /**
     * Sets the step increment of the adjustment.
     * <br>
     * <br>See [method&#64;Gtk.Adjustment.set_lower] about how to compress
     * <br>multiple emissions of the [signal&#64;Gtk.Adjustment::changed]
     * <br>signal when setting multiple adjustment properties.
     * @param step_increment the new step increment
    */
    public void setStepIncrement(double step_increment)  {
        JnaAdjustment.INST().gtk_adjustment_set_step_increment(asCPointer(), step_increment);
    }

    /**
     * Sets the maximum value of the adjustment.
     * <br>
     * <br>Note that values will be restricted by `upper - page-size`
     * <br>if the page-size property is nonzero.
     * <br>
     * <br>See [method&#64;Gtk.Adjustment.set_lower] about how to compress
     * <br>multiple emissions of the [signal&#64;Gtk.Adjustment::changed]
     * <br>signal when setting multiple adjustment properties.
     * @param upper the new maximum value
    */
    public void setUpper(double upper)  {
        JnaAdjustment.INST().gtk_adjustment_set_upper(asCPointer(), upper);
    }

    /**
     * Sets the `GtkAdjustment` value.
     * <br>
     * <br>The value is clamped to lie between [property&#64;Gtk.Adjustment:lower]
     * <br>and [property&#64;Gtk.Adjustment:upper].
     * <br>
     * <br>Note that for adjustments which are used in a `GtkScrollbar`,
     * <br>the effective range of allowed values goes from
     * <br>[property&#64;Gtk.Adjustment:lower] to
     * <br>[property&#64;Gtk.Adjustment:upper] - [property&#64;Gtk.Adjustment:page-size].
     * @param value the new value
    */
    public void setValue(double value)  {
        JnaAdjustment.INST().gtk_adjustment_set_value(asCPointer(), value);
    }

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
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

    public static long getTypeID() { 
        return JnaAdjustment.INST().gtk_adjustment_get_type(); 
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
