/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface SystemSetting {

    /**
     * the [property&#64;Gtk.Settings:gtk-xft-dpi] setting has changed
    */
    int DPI = 0;

    /**
     * The [property&#64;Gtk.Settings:gtk-font-name] setting has changed
    */
    int FONT_NAME = 1;

    /**
     * The font configuration has changed in a way that
     * <br>  requires text to be redrawn. This can be any of the
     * <br>  [property&#64;Gtk.Settings:gtk-xft-antialias],
     * <br>  [property&#64;Gtk.Settings:gtk-xft-hinting],
     * <br>  [property&#64;Gtk.Settings:gtk-xft-hintstyle],
     * <br>  [property&#64;Gtk.Settings:gtk-xft-rgba] or
     * <br>  [property&#64;Gtk.Settings:gtk-fontconfig-timestamp] settings
    */
    int FONT_CONFIG = 2;

    /**
     * The display has changed
    */
    int DISPLAY = 3;

    /**
     * The icon theme has changed in a way that requires
     * <br>  icons to be looked up again
    */
    int ICON_THEME = 4;

}

/*
enumeration-type
*/
