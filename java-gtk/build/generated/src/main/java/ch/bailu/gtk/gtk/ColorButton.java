/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkColorButton` allows to open a color chooser dialog to change
 * <br>the color.
 * <br>
 * <br>![An example GtkColorButton](color-button.png)
 * <br>
 * <br>It is suitable widget for selecting a color in a preference dialog.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>colorbutton
 * <br>╰── button.color
 * <br>    ╰── [content]
 * <br>```
 * <br>
 * <br>`GtkColorButton` has a single CSS node with name colorbutton which
 * <br>contains a button node. To differentiate it from a plain `GtkButton`,
 * <br>it gets the .color style class.
 * <p><a href="https://docs.gtk.org/gtk4/class.ColorButton.html">https://docs.gtk.org/gtk4/class.ColorButton.html</a></p>
*/
public class ColorButton extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ColorButton.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted to when the color button is activated.
         * <br>
         * <br>The `::activate` signal on `GtkMenuButton` is an action signal and
         * <br>emitting it causes the button to pop up its dialog.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaColorButton.OnActivate) (__self, __data) -> in.onActivate();
    }

    @FunctionalInterface
    public interface OnColorSet {
        /**
         * Emitted when the user selects a color.
         * <br>
         * <br>When handling this signal, use [method&#64;Gtk.ColorChooser.get_rgba]
         * <br>to find out which color was just selected.
         * <br>
         * <br>Note that this signal is only emitted when the user changes the color.
         * <br>If you need to react to programmatic color changes as well, use
         * <br>the notify::rgba signal.
        */
        void onColorSet();
    }
    
    private static com.sun.jna.Callback toOnColorSet(OnColorSet in) {
        return (in == null) ? null: (JnaColorButton.OnColorSet) (__self, __data) -> in.onColorSet();
    }

    public ColorButton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new color button showing the given color.
     * @param rgba A `GdkRGBA` to set the current color with
     * @return a new color button
    */
    public static ColorButton newWithRgbaColorButton(@Nonnull ch.bailu.gtk.gdk.RGBA rgba)  {
        PointerContainer __self = cast(JnaColorButton.INST().gtk_color_button_new_with_rgba(asCPointerNotNull(rgba)));
        if (__self.isNull()) {
            throw new NullPointerException("ColorButton:newWithRgba");
        }
        return new ColorButton(__self);
    }        
    

    /**
     * Creates a new color button.
     * <br>
     * <br>This returns a widget in the form of a small button containing
     * <br>a swatch representing the current selected color. When the button
     * <br>is clicked, a color chooser dialog will open, allowing the user
     * <br>to select a color. The swatch will be updated to reflect the new
     * <br>color when the user finishes.
    */
    public ColorButton() {
        super(cast(JnaColorButton.INST().gtk_color_button_new()));
    }

    /**
     * Gets whether the dialog is modal.
     * @return %TRUE if the dialog is modal
    */
    public boolean getModal()  {
        return JnaColorButton.INST().gtk_color_button_get_modal(asCPointer());
    }

    /**
     * Gets the title of the color chooser dialog.
     * @return An internal string, do not free the return value
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaColorButton.INST().gtk_color_button_get_title(asCPointer())));
    }

    /**
     * Sets whether the dialog should be modal.
     * @param modal %TRUE to make the dialog modal
    */
    public void setModal(boolean modal)  {
        JnaColorButton.INST().gtk_color_button_set_modal(asCPointer(), modal);
    }

    /**
     * Sets the title for the color chooser dialog.
     * @param title String containing new window title
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaColorButton.INST().gtk_color_button_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * Sets the title for the color chooser dialog.
     * @param title String containing new window title
    */
    public void setTitle(String title)  {
        JnaColorButton.INST().gtk_color_button_set_title(asCPointer(), title);
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

    public final static String SIGNAL_ON_COLOR_SET = "color-set";
    
    /**
     * Connect to signal "color-set".
     * <br>See {@link OnColorSet#onColorSet} for signal description.
     * <br>Field {@link #SIGNAL_ON_COLOR_SET} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onColorSet(OnColorSet signal) {
        return connectSignal(SIGNAL_ON_COLOR_SET, toOnColorSet(signal));
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
     * Implements interface {@link ColorChooser}. Call this to get access to interface functions.
     * @return {@link ColorChooser}
    */
    public ColorChooser asColorChooser() {
        return new ColorChooser(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaColorButton.INST().gtk_color_button_get_type(); 
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
