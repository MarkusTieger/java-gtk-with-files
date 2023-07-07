/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkScale` is a slider control used to select a numeric value.
 * <br>
 * <br>![An example GtkScale](scales.png)
 * <br>
 * <br>To use it, you’ll probably want to investigate the methods on its base
 * <br>class, [class&#64;GtkRange], in addition to the methods for `GtkScale` itself.
 * <br>To set the value of a scale, you would normally use [method&#64;Gtk.Range.set_value].
 * <br>To detect changes to the value, you would normally use the
 * <br>[signal&#64;Gtk.Range::value-changed] signal.
 * <br>
 * <br>Note that using the same upper and lower bounds for the `GtkScale` (through
 * <br>the `GtkRange` methods) will hide the slider itself. This is useful for
 * <br>applications that want to show an undeterminate value on the scale, without
 * <br>changing the layout of the application (such as movie or music players).
 * <br>
 * <br>&#35; GtkScale as GtkBuildable
 * <br>
 * <br>`GtkScale` supports a custom &lt;marks&gt; element, which can contain multiple
 * <br>&lt;mark&#92;&gt; elements. The “value” and “position” attributes have the same
 * <br>meaning as [method&#64;Gtk.Scale.add_mark] parameters of the same name. If
 * <br>the element is not empty, its content is taken as the markup to show at
 * <br>the mark. It can be translated with the usual ”translatable” and
 * <br>“context” attributes.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>scale[.fine-tune][.marks-before][.marks-after]
 * <br>├── [value][.top][.right][.bottom][.left]
 * <br>├── marks.top
 * <br>│   ├── mark
 * <br>│   ┊    ├── [label]
 * <br>│   ┊    ╰── indicator
 * <br>┊   ┊
 * <br>│   ╰── mark
 * <br>├── marks.bottom
 * <br>│   ├── mark
 * <br>│   ┊    ├── indicator
 * <br>│   ┊    ╰── [label]
 * <br>┊   ┊
 * <br>│   ╰── mark
 * <br>╰── trough
 * <br>    ├── [fill]
 * <br>    ├── [highlight]
 * <br>    ╰── slider
 * <br>```
 * <br>
 * <br>`GtkScale` has a main CSS node with name scale and a subnode for its contents,
 * <br>with subnodes named trough and slider.
 * <br>
 * <br>The main node gets the style class .fine-tune added when the scale is in
 * <br>'fine-tuning' mode.
 * <br>
 * <br>If the scale has an origin (see [method&#64;Gtk.Scale.set_has_origin]), there is
 * <br>a subnode with name highlight below the trough node that is used for rendering
 * <br>the highlighted part of the trough.
 * <br>
 * <br>If the scale is showing a fill level (see [method&#64;Gtk.Range.set_show_fill_level]),
 * <br>there is a subnode with name fill below the trough node that is used for
 * <br>rendering the filled in part of the trough.
 * <br>
 * <br>If marks are present, there is a marks subnode before or after the trough
 * <br>node, below which each mark gets a node with name mark. The marks nodes get
 * <br>either the .top or .bottom style class.
 * <br>
 * <br>The mark node has a subnode named indicator. If the mark has text, it also
 * <br>has a subnode named label. When the mark is either above or left of the
 * <br>scale, the label subnode is the first when present. Otherwise, the indicator
 * <br>subnode is the first.
 * <br>
 * <br>The main CSS node gets the 'marks-before' and/or 'marks-after' style classes
 * <br>added depending on what marks are present.
 * <br>
 * <br>If the scale is displaying the value (see [property&#64;Gtk.Scale:draw-value]),
 * <br>there is subnode with name value. This node will get the .top or .bottom style
 * <br>classes similar to the marks node.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkScale` uses the %GTK_ACCESSIBLE_ROLE_SLIDER role.
 * <p><a href="https://docs.gtk.org/gtk4/class.Scale.html">https://docs.gtk.org/gtk4/class.Scale.html</a></p>
*/
public class Scale extends Range {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Scale.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnScaleFormatValueFunc {
        /**
         * 
         * @param scale The `GtkScale`
         * @param value The numeric value to format
         * @param user_data user data
         * @return A newly allocated string describing a textual representation   of the given numerical value.
        */
        ch.bailu.gtk.type.Str onScaleFormatValueFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Scale scale, double value, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaScale.OnScaleFormatValueFunc toOnScaleFormatValueFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnScaleFormatValueFunc in) {
        JnaScale.OnScaleFormatValueFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_scale, _value, _user_data) -> in.onScaleFormatValueFunc(__callback, new Scale(new PointerContainer(_scale)), _value, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaScale.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaScale.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public Scale(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new scale widget with a range from &#64;min to &#64;max.
     * <br>
     * <br>The returns scale will have the given orientation and will let the
     * <br>user input a number between &#64;min and &#64;max (including &#64;min and &#64;max)
     * <br>with the increment &#64;step. &#64;step must be nonzero; it’s the distance
     * <br>the slider moves when using the arrow keys to adjust the scale
     * <br>value.
     * <br>
     * <br>Note that the way in which the precision is derived works best if
     * <br>&#64;step is a power of ten. If the resulting precision is not suitable
     * <br>for your needs, use [method&#64;Gtk.Scale.set_digits] to correct it.
     * @param orientation the scale’s orientation.
     * @param min minimum value
     * @param max maximum value
     * @param step step increment (tick size) used with keyboard shortcuts
     * @return a new `GtkScale`
    */
    public static Scale newWithRangeScale(int orientation, double min, double max, double step)  {
        PointerContainer __self = cast(JnaScale.INST().gtk_scale_new_with_range(orientation, min, max, step));
        if (__self.isNull()) {
            throw new NullPointerException("Scale:newWithRange");
        }
        return new Scale(__self);
    }        
    

    /**
     * Creates a new `GtkScale`.
     * @param orientation the scale’s orientation.
     * @param adjustment the [class&#64;Gtk.Adjustment] which sets   the range of the scale, or %NULL to create a new adjustment.
    */
    public Scale(int orientation, @Nullable Adjustment adjustment) {
        super(cast(JnaScale.INST().gtk_scale_new(orientation, asCPointer(adjustment))));
    }

    /**
     * Adds a mark at &#64;value.
     * <br>
     * <br>A mark is indicated visually by drawing a tick mark next to the scale,
     * <br>and GTK makes it easy for the user to position the scale exactly at the
     * <br>marks value.
     * <br>
     * <br>If &#64;markup is not %NULL, text is shown next to the tick mark.
     * <br>
     * <br>To remove marks from a scale, use [method&#64;Gtk.Scale.clear_marks].
     * @param value the value at which the mark is placed, must be between   the lower and upper limits of the scales’ adjustment
     * @param position where to draw the mark. For a horizontal scale, %GTK_POS_TOP   and %GTK_POS_LEFT are drawn above the scale, anything else below.   For a vertical scale, %GTK_POS_LEFT and %GTK_POS_TOP are drawn to   the left of the scale, anything else to the right.
     * @param markup Text to be shown at the mark, using Pango markup
    */
    public void addMark(double value, int position, @Nullable ch.bailu.gtk.type.Str markup)  {
        JnaScale.INST().gtk_scale_add_mark(asCPointer(), value, position, asCPointer(markup));
    }

    /**
     * Adds a mark at &#64;value.
     * <br>
     * <br>A mark is indicated visually by drawing a tick mark next to the scale,
     * <br>and GTK makes it easy for the user to position the scale exactly at the
     * <br>marks value.
     * <br>
     * <br>If &#64;markup is not %NULL, text is shown next to the tick mark.
     * <br>
     * <br>To remove marks from a scale, use [method&#64;Gtk.Scale.clear_marks].
     * @param value the value at which the mark is placed, must be between   the lower and upper limits of the scales’ adjustment
     * @param position where to draw the mark. For a horizontal scale, %GTK_POS_TOP   and %GTK_POS_LEFT are drawn above the scale, anything else below.   For a vertical scale, %GTK_POS_LEFT and %GTK_POS_TOP are drawn to   the left of the scale, anything else to the right.
     * @param markup Text to be shown at the mark, using Pango markup
    */
    public void addMark(double value, int position, String markup)  {
        JnaScale.INST().gtk_scale_add_mark(asCPointer(), value, position, markup);
    }

    /**
     * Removes any marks that have been added.
    */
    public void clearMarks()  {
        JnaScale.INST().gtk_scale_clear_marks(asCPointer());
    }

    /**
     * Gets the number of decimal places that are displayed in the value.
     * @return the number of decimal places that are displayed
    */
    public int getDigits()  {
        return JnaScale.INST().gtk_scale_get_digits(asCPointer());
    }

    /**
     * Returns whether the current value is displayed as a string
     * <br>next to the slider.
     * @return whether the current value is displayed as a string
    */
    public boolean getDrawValue()  {
        return JnaScale.INST().gtk_scale_get_draw_value(asCPointer());
    }

    /**
     * Returns whether the scale has an origin.
     * @return %TRUE if the scale has an origin.
    */
    public boolean getHasOrigin()  {
        return JnaScale.INST().gtk_scale_get_has_origin(asCPointer());
    }

    /**
     * Gets the `PangoLayout` used to display the scale.
     * <br>
     * <br>The returned object is owned by the scale so does not need
     * <br>to be freed by the caller.
     * @return the [class&#64;Pango.Layout]   for this scale, or %NULL if the [property&#64;GtkScale:draw-value]   property is %FALSE.
    */
    public ch.bailu.gtk.pango.Layout getLayout()  {
        return new ch.bailu.gtk.pango.Layout(new PointerContainer(JnaScale.INST().gtk_scale_get_layout(asCPointer())));
    }

    /**
     * Obtains the coordinates where the scale will draw the
     * <br>`PangoLayout` representing the text in the scale.
     * <br>
     * <br>Remember when using the `PangoLayout` function you need to
     * <br>convert to and from pixels using `PANGO_PIXELS()` or `PANGO_SCALE`.
     * <br>
     * <br>If the [property&#64;GtkScale:draw-value] property is %FALSE, the return
     * <br>values are undefined.
     * @param x location to store X offset of layout
     * @param y location to store Y offset of layout
    */
    public void getLayoutOffsets(@Nullable ch.bailu.gtk.type.Int x, @Nullable ch.bailu.gtk.type.Int y)  {
        JnaScale.INST().gtk_scale_get_layout_offsets(asCPointer(), asCPointer(x), asCPointer(y));
    }

    /**
     * Gets the position in which the current value is displayed.
     * @return the position in which the current value is displayed
    */
    public int getValuePos()  {
        return JnaScale.INST().gtk_scale_get_value_pos(asCPointer());
    }

    /**
     * Sets the number of decimal places that are displayed in the value.
     * <br>
     * <br>Also causes the value of the adjustment to be rounded to this number
     * <br>of digits, so the retrieved value matches the displayed one, if
     * <br>[property&#64;GtkScale:draw-value] is %TRUE when the value changes. If
     * <br>you want to enforce rounding the value when [property&#64;GtkScale:draw-value]
     * <br>is %FALSE, you can set [property&#64;GtkRange:round-digits] instead.
     * <br>
     * <br>Note that rounding to a small number of digits can interfere with
     * <br>the smooth autoscrolling that is built into `GtkScale`. As an alternative,
     * <br>you can use [method&#64;Gtk.Scale.set_format_value_func] to format the displayed
     * <br>value yourself.
     * @param digits the number of decimal places to display,   e.g. use 1 to display 1.0, 2 to display 1.00, etc
    */
    public void setDigits(int digits)  {
        JnaScale.INST().gtk_scale_set_digits(asCPointer(), digits);
    }

    /**
     * Specifies whether the current value is displayed as a string next
     * <br>to the slider.
     * @param draw_value %TRUE to draw the value
    */
    public void setDrawValue(boolean draw_value)  {
        JnaScale.INST().gtk_scale_set_draw_value(asCPointer(), draw_value);
    }

    /**
     * &#64;func allows you to change how the scale value is displayed.
     * <br>
     * <br>The given function will return an allocated string representing
     * <br>&#64;value. That string will then be used to display the scale's value.
     * <br>
     * <br>If &#35;NULL is passed as &#64;func, the value will be displayed on
     * <br>its own, rounded according to the value of the
     * <br>[property&#64;GtkScale:digits] property.
     * @param func function that formats the value
     * @param user_data user data to pass to &#64;func
     * @param destroy_notify destroy function for &#64;user_data
    */
    public void setFormatValueFunc(OnScaleFormatValueFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy_notify)  {
        JnaScale.INST().gtk_scale_set_format_value_func(asCPointer(), toOnScaleFormatValueFunc(this, "setFormatValueFunc", func), asCPointer(user_data), toOnDestroyNotify(this, "setFormatValueFunc", destroy_notify));
    }

    /**
     * Sets whether the scale has an origin.
     * <br>
     * <br>If [property&#64;GtkScale:has-origin] is set to %TRUE (the default),
     * <br>the scale will highlight the part of the trough between the origin
     * <br>(bottom or left side) and the current value.
     * @param has_origin %TRUE if the scale has an origin
    */
    public void setHasOrigin(boolean has_origin)  {
        JnaScale.INST().gtk_scale_set_has_origin(asCPointer(), has_origin);
    }

    /**
     * Sets the position in which the current value is displayed.
     * @param pos the position in which the current value is displayed
    */
    public void setValuePos(int pos)  {
        JnaScale.INST().gtk_scale_set_value_pos(asCPointer(), pos);
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
        return JnaScale.INST().gtk_scale_get_type(); 
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
