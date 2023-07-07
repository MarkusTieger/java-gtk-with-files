/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkRange` is the common base class for widgets which visualize an
 * <br>adjustment.
 * <br>
 * <br>Widgets that are derived from `GtkRange` include
 * <br>[class&#64;Gtk.Scale] and [class&#64;Gtk.Scrollbar].
 * <br>
 * <br>Apart from signals for monitoring the parameters of the adjustment,
 * <br>`GtkRange` provides properties and methods for setting a
 * <br>“fill level” on range widgets. See [method&#64;Gtk.Range.set_fill_level].
 * <p><a href="https://docs.gtk.org/gtk4/class.Range.html">https://docs.gtk.org/gtk4/class.Range.html</a></p>
*/
public class Range extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Range.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAdjustBounds {
        /**
         * Emitted before clamping a value, to give the application a
         * <br>chance to adjust the bounds.
         * @param value the value before we clamp
        */
        void onAdjustBounds(double value);
    }
    
    private static com.sun.jna.Callback toOnAdjustBounds(OnAdjustBounds in) {
        return (in == null) ? null: (JnaRange.OnAdjustBounds) (__self, _value, __data) -> in.onAdjustBounds(_value);
    }

    @FunctionalInterface
    public interface OnChangeValue {
        /**
         * Emitted when a scroll action is performed on a range.
         * <br>
         * <br>It allows an application to determine the type of scroll event
         * <br>that occurred and the resultant new value. The application can
         * <br>handle the event itself and return %TRUE to prevent further
         * <br>processing. Or, by returning %FALSE, it can pass the event to
         * <br>other handlers until the default GTK handler is reached.
         * <br>
         * <br>The value parameter is unrounded. An application that overrides
         * <br>the ::change-value signal is responsible for clamping the value
         * <br>to the desired number of decimal digits; the default GTK
         * <br>handler clamps the value based on [property&#64;Gtk.Range:round-digits].
         * @param scroll the type of scroll action that was performed
         * @param value the new value resulting from the scroll action
         * @return %TRUE to prevent other handlers from being invoked for     the signal, %FALSE to propagate the signal further
        */
        boolean onChangeValue(int scroll, double value);
    }
    
    private static com.sun.jna.Callback toOnChangeValue(OnChangeValue in) {
        return (in == null) ? null: (JnaRange.OnChangeValue) (__self, _scroll, _value, __data) -> in.onChangeValue(_scroll, _value);
    }

    @FunctionalInterface
    public interface OnMoveSlider {
        /**
         * Virtual function that moves the slider.
         * <br>
         * <br>Used for keybindings.
         * @param step how to move the slider
        */
        void onMoveSlider(int step);
    }
    
    private static com.sun.jna.Callback toOnMoveSlider(OnMoveSlider in) {
        return (in == null) ? null: (JnaRange.OnMoveSlider) (__self, _step, __data) -> in.onMoveSlider(_step);
    }

    @FunctionalInterface
    public interface OnValueChanged {
        /**
         * Emitted when the range value changes.
        */
        void onValueChanged();
    }
    
    private static com.sun.jna.Callback toOnValueChanged(OnValueChanged in) {
        return (in == null) ? null: (JnaRange.OnValueChanged) (__self, __data) -> in.onValueChanged();
    }

    public Range(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Get the adjustment which is the “model” object for `GtkRange`.
     * @return a `GtkAdjustment`
    */
    public Adjustment getAdjustment()  {
        return new Adjustment(new PointerContainer(JnaRange.INST().gtk_range_get_adjustment(asCPointer())));
    }

    /**
     * Gets the current position of the fill level indicator.
     * @return The current fill level
    */
    public double getFillLevel()  {
        return JnaRange.INST().gtk_range_get_fill_level(asCPointer());
    }

    /**
     * Gets whether the `GtkRange` respects text direction.
     * <br>
     * <br>See [method&#64;Gtk.Range.set_flippable].
     * @return %TRUE if the range is flippable
    */
    public boolean getFlippable()  {
        return JnaRange.INST().gtk_range_get_flippable(asCPointer());
    }

    /**
     * Gets whether the range is inverted.
     * <br>
     * <br>See [method&#64;Gtk.Range.set_inverted].
     * @return %TRUE if the range is inverted
    */
    public boolean getInverted()  {
        return JnaRange.INST().gtk_range_get_inverted(asCPointer());
    }

    /**
     * This function returns the area that contains the range’s trough,
     * <br>in coordinates relative to &#64;range's origin.
     * <br>
     * <br>This function is useful mainly for `GtkRange` subclasses.
     * @param range_rect return location for the range rectangle
    */
    public void getRangeRect(@Nonnull ch.bailu.gtk.gdk.Rectangle range_rect)  {
        JnaRange.INST().gtk_range_get_range_rect(asCPointer(), asCPointerNotNull(range_rect));
    }

    /**
     * Gets whether the range is restricted to the fill level.
     * @return %TRUE if &#64;range is restricted to the fill level.
    */
    public boolean getRestrictToFillLevel()  {
        return JnaRange.INST().gtk_range_get_restrict_to_fill_level(asCPointer());
    }

    /**
     * Gets the number of digits to round the value to when
     * <br>it changes.
     * <br>
     * <br>See [signal&#64;Gtk.Range::change-value].
     * @return the number of digits to round to
    */
    public int getRoundDigits()  {
        return JnaRange.INST().gtk_range_get_round_digits(asCPointer());
    }

    /**
     * Gets whether the range displays the fill level graphically.
     * @return %TRUE if &#64;range shows the fill level.
    */
    public boolean getShowFillLevel()  {
        return JnaRange.INST().gtk_range_get_show_fill_level(asCPointer());
    }

    /**
     * This function returns sliders range along the long dimension,
     * <br>in widget-&gt;window coordinates.
     * <br>
     * <br>This function is useful mainly for `GtkRange` subclasses.
     * @param slider_start return location for the slider's start
     * @param slider_end return location for the slider's end
    */
    public void getSliderRange(@Nullable ch.bailu.gtk.type.Int slider_start, @Nullable ch.bailu.gtk.type.Int slider_end)  {
        JnaRange.INST().gtk_range_get_slider_range(asCPointer(), asCPointer(slider_start), asCPointer(slider_end));
    }

    /**
     * This function is useful mainly for `GtkRange` subclasses.
     * <br>
     * <br>See [method&#64;Gtk.Range.set_slider_size_fixed].
     * @return whether the range’s slider has a fixed size.
    */
    public boolean getSliderSizeFixed()  {
        return JnaRange.INST().gtk_range_get_slider_size_fixed(asCPointer());
    }

    /**
     * Gets the current value of the range.
     * @return current value of the range.
    */
    public double getValue()  {
        return JnaRange.INST().gtk_range_get_value(asCPointer());
    }

    /**
     * Sets the adjustment to be used as the “model” object for the `GtkRange`
     * <br>
     * <br>The adjustment indicates the current range value, the minimum and
     * <br>maximum range values, the step/page increments used for keybindings
     * <br>and scrolling, and the page size.
     * <br>
     * <br>The page size is normally 0 for `GtkScale` and nonzero for `GtkScrollbar`,
     * <br>and indicates the size of the visible area of the widget being scrolled.
     * <br>The page size affects the size of the scrollbar slider.
     * @param adjustment a `GtkAdjustment`
    */
    public void setAdjustment(@Nonnull Adjustment adjustment)  {
        JnaRange.INST().gtk_range_set_adjustment(asCPointer(), asCPointerNotNull(adjustment));
    }

    /**
     * Set the new position of the fill level indicator.
     * <br>
     * <br>The “fill level” is probably best described by its most prominent
     * <br>use case, which is an indicator for the amount of pre-buffering in
     * <br>a streaming media player. In that use case, the value of the range
     * <br>would indicate the current play position, and the fill level would
     * <br>be the position up to which the file/stream has been downloaded.
     * <br>
     * <br>This amount of prebuffering can be displayed on the range’s trough
     * <br>and is themeable separately from the trough. To enable fill level
     * <br>display, use [method&#64;Gtk.Range.set_show_fill_level]. The range defaults
     * <br>to not showing the fill level.
     * <br>
     * <br>Additionally, it’s possible to restrict the range’s slider position
     * <br>to values which are smaller than the fill level. This is controlled
     * <br>by [method&#64;Gtk.Range.set_restrict_to_fill_level] and is by default
     * <br>enabled.
     * @param fill_level the new position of the fill level indicator
    */
    public void setFillLevel(double fill_level)  {
        JnaRange.INST().gtk_range_set_fill_level(asCPointer(), fill_level);
    }

    /**
     * Sets whether the `GtkRange` respects text direction.
     * <br>
     * <br>If a range is flippable, it will switch its direction
     * <br>if it is horizontal and its direction is %GTK_TEXT_DIR_RTL.
     * <br>
     * <br>See [method&#64;Gtk.Widget.get_direction].
     * @param flippable %TRUE to make the range flippable
    */
    public void setFlippable(boolean flippable)  {
        JnaRange.INST().gtk_range_set_flippable(asCPointer(), flippable);
    }

    /**
     * Sets the step and page sizes for the range.
     * <br>
     * <br>The step size is used when the user clicks the `GtkScrollbar`
     * <br>arrows or moves a `GtkScale` via arrow keys. The page size
     * <br>is used for example when moving via Page Up or Page Down keys.
     * @param step step size
     * @param page page size
    */
    public void setIncrements(double step, double page)  {
        JnaRange.INST().gtk_range_set_increments(asCPointer(), step, page);
    }

    /**
     * Sets whether to invert the range.
     * <br>
     * <br>Ranges normally move from lower to higher values as the
     * <br>slider moves from top to bottom or left to right. Inverted
     * <br>ranges have higher values at the top or on the right rather
     * <br>than on the bottom or left.
     * @param setting %TRUE to invert the range
    */
    public void setInverted(boolean setting)  {
        JnaRange.INST().gtk_range_set_inverted(asCPointer(), setting);
    }

    /**
     * Sets the allowable values in the `GtkRange`.
     * <br>
     * <br>The range value is clamped to be between &#64;min and &#64;max.
     * <br>(If the range has a non-zero page size, it is clamped
     * <br>between &#64;min and &#64;max - page-size.)
     * @param min minimum range value
     * @param max maximum range value
    */
    public void setRange(double min, double max)  {
        JnaRange.INST().gtk_range_set_range(asCPointer(), min, max);
    }

    /**
     * Sets whether the slider is restricted to the fill level.
     * <br>
     * <br>See [method&#64;Gtk.Range.set_fill_level] for a general description
     * <br>of the fill level concept.
     * @param restrict_to_fill_level Whether the fill level restricts slider movement.
    */
    public void setRestrictToFillLevel(boolean restrict_to_fill_level)  {
        JnaRange.INST().gtk_range_set_restrict_to_fill_level(asCPointer(), restrict_to_fill_level);
    }

    /**
     * Sets the number of digits to round the value to when
     * <br>it changes.
     * <br>
     * <br>See [signal&#64;Gtk.Range::change-value].
     * @param round_digits the precision in digits, or -1
    */
    public void setRoundDigits(int round_digits)  {
        JnaRange.INST().gtk_range_set_round_digits(asCPointer(), round_digits);
    }

    /**
     * Sets whether a graphical fill level is show on the trough.
     * <br>
     * <br>See [method&#64;Gtk.Range.set_fill_level] for a general description
     * <br>of the fill level concept.
     * @param show_fill_level Whether a fill level indicator graphics is shown.
    */
    public void setShowFillLevel(boolean show_fill_level)  {
        JnaRange.INST().gtk_range_set_show_fill_level(asCPointer(), show_fill_level);
    }

    /**
     * Sets whether the range’s slider has a fixed size, or a size that
     * <br>depends on its adjustment’s page size.
     * <br>
     * <br>This function is useful mainly for `GtkRange` subclasses.
     * @param size_fixed %TRUE to make the slider size constant
    */
    public void setSliderSizeFixed(boolean size_fixed)  {
        JnaRange.INST().gtk_range_set_slider_size_fixed(asCPointer(), size_fixed);
    }

    /**
     * Sets the current value of the range.
     * <br>
     * <br>If the value is outside the minimum or maximum range values,
     * <br>it will be clamped to fit inside them. The range emits the
     * <br>[signal&#64;Gtk.Range::value-changed] signal if the value changes.
     * @param value new value of the range
    */
    public void setValue(double value)  {
        JnaRange.INST().gtk_range_set_value(asCPointer(), value);
    }

    public final static String SIGNAL_ON_ADJUST_BOUNDS = "adjust-bounds";
    
    /**
     * Connect to signal "adjust-bounds".
     * <br>See {@link OnAdjustBounds#onAdjustBounds} for signal description.
     * <br>Field {@link #SIGNAL_ON_ADJUST_BOUNDS} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAdjustBounds(OnAdjustBounds signal) {
        return connectSignal(SIGNAL_ON_ADJUST_BOUNDS, toOnAdjustBounds(signal));
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

    public final static String SIGNAL_ON_MOVE_SLIDER = "move-slider";
    
    /**
     * Connect to signal "move-slider".
     * <br>See {@link OnMoveSlider#onMoveSlider} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOVE_SLIDER} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMoveSlider(OnMoveSlider signal) {
        return connectSignal(SIGNAL_ON_MOVE_SLIDER, toOnMoveSlider(signal));
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
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaRange.INST().gtk_range_get_type(); 
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
