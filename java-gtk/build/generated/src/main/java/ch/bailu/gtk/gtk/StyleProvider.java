/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkStyleProvider` is an interface for style information used by
 * <br>`GtkStyleContext`.
 * <br>
 * <br>See [method&#64;Gtk.StyleContext.add_provider] and
 * <br>[func&#64;Gtk.StyleContext.add_provider_for_display] for
 * <br>adding `GtkStyleProviders`.
 * <br>
 * <br>GTK uses the `GtkStyleProvider` implementation for CSS in
 * <br>[class&#64;Gtk.CssProvider].
 * <p><a href="https://docs.gtk.org/gtk4/iface.StyleProvider.html">https://docs.gtk.org/gtk4/iface.StyleProvider.html</a></p>
*/
public class StyleProvider extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StyleProvider.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGtkPrivateChanged {
        void onGtkPrivateChanged();
    }
    
    private static com.sun.jna.Callback toOnGtkPrivateChanged(OnGtkPrivateChanged in) {
        return (in == null) ? null: (JnaStyleProvider.OnGtkPrivateChanged) (__self, __data) -> in.onGtkPrivateChanged();
    }

    public StyleProvider(PointerContainer pointer) {
        super(pointer);
    }

    public final static String SIGNAL_ON_GTK_PRIVATE_CHANGED = "gtk-private-changed";
    
    /**
     * Connect to signal "gtk-private-changed".
     * <br>See {@link OnGtkPrivateChanged#onGtkPrivateChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_GTK_PRIVATE_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onGtkPrivateChanged(OnGtkPrivateChanged signal) {
        return connectSignal(SIGNAL_ON_GTK_PRIVATE_CHANGED, toOnGtkPrivateChanged(signal));
    }

    public static long getTypeID() { 
        return JnaStyleProvider.INST().gtk_style_provider_get_type(); 
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
*/
