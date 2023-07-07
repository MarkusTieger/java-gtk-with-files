/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/</a></p>
*/
public class Adw extends ch.bailu.gtk.type.Package {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Adw.class.getCanonicalName());
    }

    /**
     * Computes easing with &#64;easing for &#64;value.
     * <br>
     * <br>&#64;value should generally be in the [0, 1] range.
     * @param self an easing value
     * @param value a value to ease
     * @return the easing for &#64;value
    */
    public static double easingEase(int self, double value)  {
        return JnaAdw.INST().adw_easing_ease(self, value);
    }

    /**
     * Checks whether animations are enabled for &#64;widget.
     * <br>
     * <br>This should be used when implementing an animated widget to know whether to
     * <br>animate it or not.
     * @param widget a `GtkWidget`
     * @return whether animations are enabled for &#64;widget
    */
    public static boolean getEnableAnimations(@Nonnull ch.bailu.gtk.gtk.Widget widget)  {
        return JnaAdw.INST().adw_get_enable_animations(asCPointerNotNull(widget));
    }

    /**
     * Returns the major version number of the Adwaita library.
     * <br>
     * <br>For example, in libadwaita version 1.2.3 this is 1.
     * <br>
     * <br>This function is in the library, so it represents the libadwaita library your
     * <br>code is running against. Contrast with the [const&#64;MAJOR_VERSION] constant,
     * <br>which represents the major version of the libadwaita headers you have
     * <br>included when compiling your code.
     * @return the major version number of the Adwaita library
    */
    public static int getMajorVersion()  {
        return JnaAdw.INST().adw_get_major_version();
    }

    /**
     * Returns the micro version number of the Adwaita library.
     * <br>
     * <br>For example, in libadwaita version 1.2.3 this is 3.
     * <br>
     * <br>This function is in the library, so it represents the libadwaita library your
     * <br>code is running against. Contrast with the [const&#64;MAJOR_VERSION] constant,
     * <br>which represents the micro version of the libadwaita headers you have
     * <br>included when compiling your code.
     * @return the micro version number of the Adwaita library
    */
    public static int getMicroVersion()  {
        return JnaAdw.INST().adw_get_micro_version();
    }

    /**
     * Returns the minor version number of the Adwaita library.
     * <br>
     * <br>For example, in libadwaita version 1.2.3 this is 2.
     * <br>
     * <br>This function is in the library, so it represents the libadwaita library your
     * <br>code is running against. Contrast with the [const&#64;MAJOR_VERSION] constant,
     * <br>which represents the minor version of the libadwaita headers you have
     * <br>included when compiling your code.
     * @return the minor version number of the Adwaita library
    */
    public static int getMinorVersion()  {
        return JnaAdw.INST().adw_get_minor_version();
    }

    /**
     * Initializes Libadwaita.
     * <br>
     * <br>This function can be used instead of [func&#64;Gtk.init] as it initializes GTK
     * <br>implicitly.
     * <br>
     * <br>There's no need to call this function if you're using [class&#64;Application].
     * <br>
     * <br>If Libadwaita has already been initialized, the function will simply return.
     * <br>
     * <br>This makes sure translations, types, themes, and icons for the Adwaita
     * <br>library are set up properly.
    */
    public static void init()  {
        JnaAdw.INST().adw_init();
    }

    /**
     * Use this function to check if libadwaita has been initialized with
     * <br>[func&#64;init].
     * @return the initialization status
    */
    public static boolean isInitialized()  {
        return JnaAdw.INST().adw_is_initialized();
    }

    /**
     * Computes the linear interpolation between &#64;a and &#64;b for &#64;t.
     * @param a the start
     * @param b the end
     * @param t the interpolation rate
     * @return the computed value
    */
    public static double lerp(double a, double b, double t)  {
        return JnaAdw.INST().adw_lerp(a, b, t);
    }

    /**
     * A convenience function for showing an application’s about window.
     * @param parent the parent top-level window
     * @param first_property_name the name of the first property
     * @param _elipse value of first property, followed by more pairs of property name and   value, `NULL`-terminated
    */
    public static void showAboutWindow(@Nullable ch.bailu.gtk.gtk.Window parent, @Nonnull ch.bailu.gtk.type.Str first_property_name, java.lang.Object... _elipse)  {
        JnaAdw.INST().adw_show_about_window(asCPointer(parent), asCPointerNotNull(first_property_name), _elipse);
    }

}

/*
package-type
*/
