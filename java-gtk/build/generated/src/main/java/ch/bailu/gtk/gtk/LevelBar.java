/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkLevelBar` is a widget that can be used as a level indicator.
 * <br>
 * <br>Typical use cases are displaying the strength of a password, or
 * <br>showing the charge level of a battery.
 * <br>
 * <br>![An example GtkLevelBar](levelbar.png)
 * <br>
 * <br>Use [method&#64;Gtk.LevelBar.set_value] to set the current value, and
 * <br>[method&#64;Gtk.LevelBar.add_offset_value] to set the value offsets at which
 * <br>the bar will be considered in a different state. GTK will add a few
 * <br>offsets by default on the level bar: %GTK_LEVEL_BAR_OFFSET_LOW,
 * <br>%GTK_LEVEL_BAR_OFFSET_HIGH and %GTK_LEVEL_BAR_OFFSET_FULL, with
 * <br>values 0.25, 0.75 and 1.0 respectively.
 * <br>
 * <br>Note that it is your responsibility to update preexisting offsets
 * <br>when changing the minimum or maximum value. GTK will simply clamp
 * <br>them to the new range.
 * <br>
 * <br>&#35;&#35; Adding a custom offset on the bar
 * <br>
 * <br>```c
 * <br>static GtkWidget *
 * <br>create_level_bar (void)
 * <br>{
 * <br>  GtkWidget *widget;
 * <br>  GtkLevelBar *bar;
 * <br>
 * <br>  widget = gtk_level_bar_new ();
 * <br>  bar = GTK_LEVEL_BAR (widget);
 * <br>
 * <br>  // This changes the value of the default low offset
 * <br>
 * <br>  gtk_level_bar_add_offset_value (bar,
 * <br>                                  GTK_LEVEL_BAR_OFFSET_LOW,
 * <br>                                  0.10);
 * <br>
 * <br>  // This adds a new offset to the bar; the application will
 * <br>  // be able to change its color CSS like this:
 * <br>  //
 * <br>  // levelbar block.my-offset {
 * <br>  //   background-color: magenta;
 * <br>  //   border-style: solid;
 * <br>  //   border-color: black;
 * <br>  //   border-style: 1px;
 * <br>  // }
 * <br>
 * <br>  gtk_level_bar_add_offset_value (bar, &quot;my-offset&quot;, 0.60);
 * <br>
 * <br>  return widget;
 * <br>}
 * <br>```
 * <br>
 * <br>The default interval of values is between zero and one, but it’s possible
 * <br>to modify the interval using [method&#64;Gtk.LevelBar.set_min_value] and
 * <br>[method&#64;Gtk.LevelBar.set_max_value]. The value will be always drawn in
 * <br>proportion to the admissible interval, i.e. a value of 15 with a specified
 * <br>interval between 10 and 20 is equivalent to a value of 0.5 with an interval
 * <br>between 0 and 1. When %GTK_LEVEL_BAR_MODE_DISCRETE is used, the bar level
 * <br>is rendered as a finite number of separated blocks instead of a single one.
 * <br>The number of blocks that will be rendered is equal to the number of units
 * <br>specified by the admissible interval.
 * <br>
 * <br>For instance, to build a bar rendered with five blocks, it’s sufficient to
 * <br>set the minimum value to 0 and the maximum value to 5 after changing the
 * <br>indicator mode to discrete.
 * <br>
 * <br>&#35; GtkLevelBar as GtkBuildable
 * <br>
 * <br>The `GtkLevelBar` implementation of the `GtkBuildable` interface supports a
 * <br>custom &lt;offsets&gt; element, which can contain any number of &lt;offset&gt; elements,
 * <br>each of which must have name and value attributes.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>levelbar[.discrete]
 * <br>╰── trough
 * <br>    ├── block.filled.level-name
 * <br>    ┊
 * <br>    ├── block.empty
 * <br>    ┊
 * <br>```
 * <br>
 * <br>`GtkLevelBar` has a main CSS node with name levelbar and one of the style
 * <br>classes .discrete or .continuous and a subnode with name trough. Below the
 * <br>trough node are a number of nodes with name block and style class .filled
 * <br>or .empty. In continuous mode, there is exactly one node of each, in discrete
 * <br>mode, the number of filled and unfilled nodes corresponds to blocks that are
 * <br>drawn. The block.filled nodes also get a style class .level-name corresponding
 * <br>to the level for the current value.
 * <br>
 * <br>In horizontal orientation, the nodes are always arranged from left to right,
 * <br>regardless of text direction.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkLevelBar` uses the %GTK_ACCESSIBLE_ROLE_METER role.
 * <p><a href="https://docs.gtk.org/gtk4/class.LevelBar.html">https://docs.gtk.org/gtk4/class.LevelBar.html</a></p>
*/
public class LevelBar extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LevelBar.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnOffsetChanged {
        /**
         * Emitted when an offset specified on the bar changes value.
         * <br>
         * <br>This typically is the result of a [method&#64;Gtk.LevelBar.add_offset_value]
         * <br>call.
         * <br>
         * <br>The signal supports detailed connections; you can connect to the
         * <br>detailed signal &quot;changed::x&quot; in order to only receive callbacks when
         * <br>the value of offset &quot;x&quot; changes.
         * @param name the name of the offset that changed value
        */
        void onOffsetChanged(@Nonnull ch.bailu.gtk.type.Str name);
    }
    
    private static com.sun.jna.Callback toOnOffsetChanged(OnOffsetChanged in) {
        return (in == null) ? null: (JnaLevelBar.OnOffsetChanged) (__self, _name, __data) -> in.onOffsetChanged(new ch.bailu.gtk.type.Str(new PointerContainer(_name)));
    }

    public LevelBar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkLevelBar` for the specified interval.
     * @param min_value a positive value
     * @param max_value a positive value
     * @return a `GtkLevelBar`
    */
    public static LevelBar newForIntervalLevelBar(double min_value, double max_value)  {
        PointerContainer __self = cast(JnaLevelBar.INST().gtk_level_bar_new_for_interval(min_value, max_value));
        if (__self.isNull()) {
            throw new NullPointerException("LevelBar:newForInterval");
        }
        return new LevelBar(__self);
    }        
    

    /**
     * Creates a new `GtkLevelBar`.
    */
    public LevelBar() {
        super(cast(JnaLevelBar.INST().gtk_level_bar_new()));
    }

    /**
     * Adds a new offset marker on &#64;self at the position specified by &#64;value.
     * <br>
     * <br>When the bar value is in the interval topped by &#64;value (or between &#64;value
     * <br>and [property&#64;Gtk.LevelBar:max-value] in case the offset is the last one
     * <br>on the bar) a style class named `level-`&#64;name will be applied
     * <br>when rendering the level bar fill.
     * <br>
     * <br>If another offset marker named &#64;name exists, its value will be
     * <br>replaced by &#64;value.
     * @param name the name of the new offset
     * @param value the value for the new offset
    */
    public void addOffsetValue(@Nonnull ch.bailu.gtk.type.Str name, double value)  {
        JnaLevelBar.INST().gtk_level_bar_add_offset_value(asCPointer(), asCPointerNotNull(name), value);
    }

    /**
     * Adds a new offset marker on &#64;self at the position specified by &#64;value.
     * <br>
     * <br>When the bar value is in the interval topped by &#64;value (or between &#64;value
     * <br>and [property&#64;Gtk.LevelBar:max-value] in case the offset is the last one
     * <br>on the bar) a style class named `level-`&#64;name will be applied
     * <br>when rendering the level bar fill.
     * <br>
     * <br>If another offset marker named &#64;name exists, its value will be
     * <br>replaced by &#64;value.
     * @param name the name of the new offset
     * @param value the value for the new offset
    */
    public void addOffsetValue(String name, double value)  {
        JnaLevelBar.INST().gtk_level_bar_add_offset_value(asCPointer(), name, value);
    }

    /**
     * Returns whether the levelbar is inverted.
     * @return %TRUE if the level bar is inverted
    */
    public boolean getInverted()  {
        return JnaLevelBar.INST().gtk_level_bar_get_inverted(asCPointer());
    }

    /**
     * Returns the `max-value` of the `GtkLevelBar`.
     * @return a positive value
    */
    public double getMaxValue()  {
        return JnaLevelBar.INST().gtk_level_bar_get_max_value(asCPointer());
    }

    /**
     * Returns the `min-value of the `GtkLevelBar`.
     * @return a positive value
    */
    public double getMinValue()  {
        return JnaLevelBar.INST().gtk_level_bar_get_min_value(asCPointer());
    }

    /**
     * Returns the `mode` of the `GtkLevelBar`.
     * @return a `GtkLevelBarMode`
    */
    public int getMode()  {
        return JnaLevelBar.INST().gtk_level_bar_get_mode(asCPointer());
    }

    /**
     * Returns the `value` of the `GtkLevelBar`.
     * @return a value in the interval between   [property&#64;Gtk.LevelBar:min-value[ and [property&#64;Gtk.LevelBar:max-value]
    */
    public double getValue()  {
        return JnaLevelBar.INST().gtk_level_bar_get_value(asCPointer());
    }

    /**
     * Removes an offset marker from a `GtkLevelBar`.
     * <br>
     * <br>The marker must have been previously added with
     * <br>[method&#64;Gtk.LevelBar.add_offset_value].
     * @param name the name of an offset in the bar
    */
    public void removeOffsetValue(@Nullable ch.bailu.gtk.type.Str name)  {
        JnaLevelBar.INST().gtk_level_bar_remove_offset_value(asCPointer(), asCPointer(name));
    }

    /**
     * Removes an offset marker from a `GtkLevelBar`.
     * <br>
     * <br>The marker must have been previously added with
     * <br>[method&#64;Gtk.LevelBar.add_offset_value].
     * @param name the name of an offset in the bar
    */
    public void removeOffsetValue(String name)  {
        JnaLevelBar.INST().gtk_level_bar_remove_offset_value(asCPointer(), name);
    }

    /**
     * Sets whether the `GtkLevelBar` is inverted.
     * @param inverted %TRUE to invert the level bar
    */
    public void setInverted(boolean inverted)  {
        JnaLevelBar.INST().gtk_level_bar_set_inverted(asCPointer(), inverted);
    }

    /**
     * Sets the `max-value` of the `GtkLevelBar`.
     * <br>
     * <br>You probably want to update preexisting level offsets after calling
     * <br>this function.
     * @param value a positive value
    */
    public void setMaxValue(double value)  {
        JnaLevelBar.INST().gtk_level_bar_set_max_value(asCPointer(), value);
    }

    /**
     * Sets the `min-value` of the `GtkLevelBar`.
     * <br>
     * <br>You probably want to update preexisting level offsets after calling
     * <br>this function.
     * @param value a positive value
    */
    public void setMinValue(double value)  {
        JnaLevelBar.INST().gtk_level_bar_set_min_value(asCPointer(), value);
    }

    /**
     * Sets the `mode` of the `GtkLevelBar`.
     * @param mode a `GtkLevelBarMode`
    */
    public void setMode(int mode)  {
        JnaLevelBar.INST().gtk_level_bar_set_mode(asCPointer(), mode);
    }

    /**
     * Sets the value of the `GtkLevelBar`.
     * @param value a value in the interval between   [property&#64;Gtk.LevelBar:min-value] and [property&#64;Gtk.LevelBar:max-value]
    */
    public void setValue(double value)  {
        JnaLevelBar.INST().gtk_level_bar_set_value(asCPointer(), value);
    }

    public final static String SIGNAL_ON_OFFSET_CHANGED = "offset-changed";
    
    /**
     * Connect to signal "offset-changed".
     * <br>See {@link OnOffsetChanged#onOffsetChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_OFFSET_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onOffsetChanged(OnOffsetChanged signal) {
        return connectSignal(SIGNAL_ON_OFFSET_CHANGED, toOnOffsetChanged(signal));
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
        return JnaLevelBar.INST().gtk_level_bar_get_type(); 
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

[MethodModel:java-type-not-supported:getOffsetValue:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
