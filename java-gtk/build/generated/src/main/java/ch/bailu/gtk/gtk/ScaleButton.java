/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkScaleButton` provides a button which pops up a scale widget.
 * <br>
 * <br>This kind of widget is commonly used for volume controls in multimedia
 * <br>applications, and GTK provides a [class&#64;Gtk.VolumeButton] subclass that
 * <br>is tailored for this use case.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkScaleButton` has a single CSS node with name button. To differentiate
 * <br>it from a plain `GtkButton`, it gets the .scale style class.
 * <p><a href="https://docs.gtk.org/gtk4/class.ScaleButton.html">https://docs.gtk.org/gtk4/class.ScaleButton.html</a></p>
*/
public class ScaleButton extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ScaleButton.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnPopdown {
        /**
         * Emitted to dismiss the popup.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Escape&lt;/kbd&gt;.
        */
        void onPopdown();
    }
    
    private static com.sun.jna.Callback toOnPopdown(OnPopdown in) {
        return (in == null) ? null: (JnaScaleButton.OnPopdown) (__self, __data) -> in.onPopdown();
    }

    @FunctionalInterface
    public interface OnPopup {
        /**
         * Emitted to popup the scale widget.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are &lt;kbd&gt;Space&lt;/kbd&gt;,
         * <br>&lt;kbd&gt;Enter&lt;/kbd&gt; and &lt;kbd&gt;Return&lt;/kbd&gt;.
        */
        void onPopup();
    }
    
    private static com.sun.jna.Callback toOnPopup(OnPopup in) {
        return (in == null) ? null: (JnaScaleButton.OnPopup) (__self, __data) -> in.onPopup();
    }

    @FunctionalInterface
    public interface OnValueChanged {
        /**
         * Emitted when the value field has changed.
         * @param value the new value
        */
        void onValueChanged(double value);
    }
    
    private static com.sun.jna.Callback toOnValueChanged(OnValueChanged in) {
        return (in == null) ? null: (JnaScaleButton.OnValueChanged) (__self, _value, __data) -> in.onValueChanged(_value);
    }

    public ScaleButton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkScaleButton`.
     * <br>
     * <br>The new scale button has a range between &#64;min and &#64;max,
     * <br>with a stepping of &#64;step.
     * @param min the minimum value of the scale (usually 0)
     * @param max the maximum value of the scale (usually 100)
     * @param step the stepping of value when a scroll-wheel event,   or up/down arrow event occurs (usually 2)
     * @param icons a %NULL-terminated   array of icon names, or %NULL if you want to set the list   later with gtk_scale_button_set_icons()
    */
    public ScaleButton(double min, double max, double step, @Nullable ch.bailu.gtk.type.Strs icons) {
        super(cast(JnaScaleButton.INST().gtk_scale_button_new(min, max, step, asCPointer(icons))));
    }

    /**
     * Gets the `GtkAdjustment` associated with the `GtkScaleButton`’s scale.
     * <br>
     * <br>See [method&#64;Gtk.Range.get_adjustment] for details.
     * @return the adjustment associated with the scale
    */
    public Adjustment getAdjustment()  {
        return new Adjustment(new PointerContainer(JnaScaleButton.INST().gtk_scale_button_get_adjustment(asCPointer())));
    }

    /**
     * Retrieves the minus button of the `GtkScaleButton`.
     * @return the minus button   of the `GtkScaleButton`
    */
    public Button getMinusButton()  {
        return new Button(new PointerContainer(JnaScaleButton.INST().gtk_scale_button_get_minus_button(asCPointer())));
    }

    /**
     * Retrieves the plus button of the `GtkScaleButton.`
     * @return the plus button   of the `GtkScaleButton`
    */
    public Button getPlusButton()  {
        return new Button(new PointerContainer(JnaScaleButton.INST().gtk_scale_button_get_plus_button(asCPointer())));
    }

    /**
     * Retrieves the popup of the `GtkScaleButton`.
     * @return the popup of the `GtkScaleButton`
    */
    public Widget getPopup()  {
        return new Widget(new PointerContainer(JnaScaleButton.INST().gtk_scale_button_get_popup(asCPointer())));
    }

    /**
     * Gets the current value of the scale button.
     * @return current value of the scale button
    */
    public double getValue()  {
        return JnaScaleButton.INST().gtk_scale_button_get_value(asCPointer());
    }

    /**
     * Sets the `GtkAdjustment` to be used as a model
     * <br>for the `GtkScaleButton`’s scale.
     * <br>
     * <br>See [method&#64;Gtk.Range.set_adjustment] for details.
     * @param adjustment a `GtkAdjustment`
    */
    public void setAdjustment(@Nonnull Adjustment adjustment)  {
        JnaScaleButton.INST().gtk_scale_button_set_adjustment(asCPointer(), asCPointerNotNull(adjustment));
    }

    /**
     * Sets the icons to be used by the scale button.
     * @param icons a %NULL-terminated array of icon names
    */
    public void setIcons(@Nonnull ch.bailu.gtk.type.Strs icons)  {
        JnaScaleButton.INST().gtk_scale_button_set_icons(asCPointer(), asCPointerNotNull(icons));
    }

    /**
     * Sets the current value of the scale.
     * <br>
     * <br>If the value is outside the minimum or maximum range values,
     * <br>it will be clamped to fit inside them.
     * <br>
     * <br>The scale button emits the [signal&#64;Gtk.ScaleButton::value-changed]
     * <br>signal if the value changes.
     * @param value new value of the scale button
    */
    public void setValue(double value)  {
        JnaScaleButton.INST().gtk_scale_button_set_value(asCPointer(), value);
    }

    public final static String SIGNAL_ON_POPDOWN = "popdown";
    
    /**
     * Connect to signal "popdown".
     * <br>See {@link OnPopdown#onPopdown} for signal description.
     * <br>Field {@link #SIGNAL_ON_POPDOWN} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPopdown(OnPopdown signal) {
        return connectSignal(SIGNAL_ON_POPDOWN, toOnPopdown(signal));
    }

    public final static String SIGNAL_ON_POPUP = "popup";
    
    /**
     * Connect to signal "popup".
     * <br>See {@link OnPopup#onPopup} for signal description.
     * <br>Field {@link #SIGNAL_ON_POPUP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPopup(OnPopup signal) {
        return connectSignal(SIGNAL_ON_POPUP, toOnPopup(signal));
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
        return JnaScaleButton.INST().gtk_scale_button_get_type(); 
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
