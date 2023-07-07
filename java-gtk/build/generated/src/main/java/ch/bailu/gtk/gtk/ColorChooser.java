/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkColorChooser` is an interface that is implemented by widgets
 * <br>for choosing colors.
 * <br>
 * <br>Depending on the situation, colors may be allowed to have alpha (translucency).
 * <br>
 * <br>In GTK, the main widgets that implement this interface are
 * <br>[class&#64;Gtk.ColorChooserWidget], [class&#64;Gtk.ColorChooserDialog] and
 * <br>[class&#64;Gtk.ColorButton].
 * <p><a href="https://docs.gtk.org/gtk4/iface.ColorChooser.html">https://docs.gtk.org/gtk4/iface.ColorChooser.html</a></p>
*/
public class ColorChooser extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ColorChooser.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnColorActivated {
        /**
         * Emitted when a color is activated from the color chooser.
         * <br>
         * <br>This usually happens when the user clicks a color swatch,
         * <br>or a color is selected and the user presses one of the keys
         * <br>Space, Shift+Space, Return or Enter.
         * @param color the color
        */
        void onColorActivated(@Nonnull ch.bailu.gtk.gdk.RGBA color);
    }
    
    private static com.sun.jna.Callback toOnColorActivated(OnColorActivated in) {
        return (in == null) ? null: (JnaColorChooser.OnColorActivated) (__self, _color, __data) -> in.onColorActivated(new ch.bailu.gtk.gdk.RGBA(new PointerContainer(_color)));
    }

    public ColorChooser(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the currently-selected color.
     * @param color a `GdkRGBA` to fill in with the current color
    */
    public void getRgba(@Nonnull ch.bailu.gtk.gdk.RGBA color)  {
        JnaColorChooser.INST().gtk_color_chooser_get_rgba(asCPointer(), asCPointerNotNull(color));
    }

    /**
     * Returns whether the color chooser shows the alpha channel.
     * @return %TRUE if the color chooser uses the alpha channel,   %FALSE if not
    */
    public boolean getUseAlpha()  {
        return JnaColorChooser.INST().gtk_color_chooser_get_use_alpha(asCPointer());
    }

    /**
     * Sets the color.
     * @param color the new color
    */
    public void setRgba(@Nonnull ch.bailu.gtk.gdk.RGBA color)  {
        JnaColorChooser.INST().gtk_color_chooser_set_rgba(asCPointer(), asCPointerNotNull(color));
    }

    /**
     * Sets whether or not the color chooser should use the alpha channel.
     * @param use_alpha %TRUE if color chooser should use alpha channel, %FALSE if not
    */
    public void setUseAlpha(boolean use_alpha)  {
        JnaColorChooser.INST().gtk_color_chooser_set_use_alpha(asCPointer(), use_alpha);
    }

    public final static String SIGNAL_ON_COLOR_ACTIVATED = "color-activated";
    
    /**
     * Connect to signal "color-activated".
     * <br>See {@link OnColorActivated#onColorActivated} for signal description.
     * <br>Field {@link #SIGNAL_ON_COLOR_ACTIVATED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onColorActivated(OnColorActivated signal) {
        return connectSignal(SIGNAL_ON_COLOR_ACTIVATED, toOnColorActivated(signal));
    }

    public static long getTypeID() { 
        return JnaColorChooser.INST().gtk_color_chooser_get_type(); 
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
interface-type

[MethodModel:java-type-not-supported:addPalette:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GtkOrientation}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GdkRGBA*}}:{j:}]
*/
