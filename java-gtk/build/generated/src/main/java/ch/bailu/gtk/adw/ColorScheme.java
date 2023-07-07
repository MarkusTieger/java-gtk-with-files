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
public interface ColorScheme {

    /**
     * Inherit the parent color-scheme. When set on the
     * <br>  `AdwStyleManager` returned by [func&#64;StyleManager.get_default], it's
     * <br>  equivalent to `ADW_COLOR_SCHEME_PREFER_LIGHT`.
    */
    int DEFAULT = 0;

    /**
     * Always use light appearance.
    */
    int FORCE_LIGHT = 1;

    /**
     * Use light appearance unless the system
     * <br>  prefers dark colors.
    */
    int PREFER_LIGHT = 2;

    /**
     * Use dark appearance unless the system prefers
     * <br>  prefers light colors.
    */
    int PREFER_DARK = 3;

    /**
     * Always use dark appearance.
    */
    int FORCE_DARK = 4;

}

/*
enumeration-type
*/
