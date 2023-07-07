/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSettings` provides a mechanism to share global settings between
 * <br>applications.
 * <br>
 * <br>On the X window system, this sharing is realized by an
 * <br>[XSettings](http://www.freedesktop.org/wiki/Specifications/xsettings-spec)
 * <br>manager that is usually part of the desktop environment, along with
 * <br>utilities that let the user change these settings.
 * <br>
 * <br>On Wayland, the settings are obtained either via a settings portal,
 * <br>or by reading desktop settings from DConf.
 * <br>
 * <br>In the absence of these sharing mechanisms, GTK reads default values for
 * <br>settings from `settings.ini` files in `/etc/gtk-4.0`, `$XDG_CONFIG_DIRS/gtk-4.0`
 * <br>and `$XDG_CONFIG_HOME/gtk-4.0`. These files must be valid key files (see
 * <br>`GKeyFile`), and have a section called Settings. Themes can also provide
 * <br>default values for settings by installing a `settings.ini` file
 * <br>next to their `gtk.css` file.
 * <br>
 * <br>Applications can override system-wide settings by setting the property
 * <br>of the `GtkSettings` object with g_object_set(). This should be restricted
 * <br>to special cases though; `GtkSettings` are not meant as an application
 * <br>configuration facility.
 * <br>
 * <br>There is one `GtkSettings` instance per display. It can be obtained with
 * <br>[func&#64;Gtk.Settings.get_for_display], but in many cases, it is more
 * <br>convenient to use [method&#64;Gtk.Widget.get_settings].
 * <p><a href="https://docs.gtk.org/gtk4/class.Settings.html">https://docs.gtk.org/gtk4/class.Settings.html</a></p>
*/
public class Settings extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Settings.class.getCanonicalName());
    }

    public Settings(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Undoes the effect of calling g_object_set() to install an
     * <br>application-specific value for a setting.
     * <br>
     * <br>After this call, the setting will again follow the session-wide
     * <br>value for this setting.
     * @param name the name of the setting to reset
    */
    public void resetProperty(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaSettings.INST().gtk_settings_reset_property(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Undoes the effect of calling g_object_set() to install an
     * <br>application-specific value for a setting.
     * <br>
     * <br>After this call, the setting will again follow the session-wide
     * <br>value for this setting.
     * @param name the name of the setting to reset
    */
    public void resetProperty(String name)  {
        JnaSettings.INST().gtk_settings_reset_property(asCPointer(), name);
    }

    /**
     * Gets the `GtkSettings` object for the default display, creating
     * <br>it if necessary.
     * <br>
     * <br>See [func&#64;Gtk.Settings.get_for_display].
     * @return a `GtkSettings` object. If there is   no default display, then returns %NULL.
    */
    public static Settings getDefault()  {
        return new Settings(new PointerContainer(JnaSettings.INST().gtk_settings_get_default()));
    }

    /**
     * Gets the `GtkSettings` object for &#64;display, creating it if necessary.
     * @param display a `GdkDisplay`
     * @return a `GtkSettings` object
    */
    public static Settings getForDisplay(@Nonnull ch.bailu.gtk.gdk.Display display)  {
        return new Settings(new PointerContainer(JnaSettings.INST().gtk_settings_get_for_display(asCPointerNotNull(display))));
    }

    /**
     * Implements interface {@link StyleProvider}. Call this to get access to interface functions.
     * @return {@link StyleProvider}
    */
    public StyleProvider asStyleProvider() {
        return new StyleProvider(cast());
    }

    public static long getTypeID() { 
        return JnaSettings.INST().gtk_settings_get_type(); 
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
