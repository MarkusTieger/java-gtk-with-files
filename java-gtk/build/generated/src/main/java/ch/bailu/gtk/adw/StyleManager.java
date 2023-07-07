/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A class for managing application-wide styling.
 * <br>
 * <br>`AdwStyleManager` provides a way to query and influence the application
 * <br>styles, such as whether to use dark or high contrast appearance.
 * <br>
 * <br>It allows to set the color scheme via the
 * <br>[property&#64;StyleManager:color-scheme] property, and to query the current
 * <br>appearance, as well as whether a system-wide color scheme preference exists.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.StyleManager.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.StyleManager.html</a></p>
*/
public class StyleManager extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StyleManager.class.getCanonicalName());
    }

    public StyleManager(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the requested application color scheme.
     * @return the color scheme
    */
    public int getColorScheme()  {
        return JnaStyleManager.INST().adw_style_manager_get_color_scheme(asCPointer());
    }

    /**
     * Gets whether the application is using dark appearance.
     * <br>
     * <br>This can be used to query the current appearance, as requested via
     * <br>[property&#64;StyleManager:color-scheme].
     * @return whether the application is using dark appearance
    */
    public boolean getDark()  {
        return JnaStyleManager.INST().adw_style_manager_get_dark(asCPointer());
    }

    /**
     * Gets the display the style manager is associated with.
     * <br>
     * <br>The display will be `NULL` for the style manager returned by
     * <br>[func&#64;StyleManager.get_default].
     * @return (nullable): the display
    */
    public ch.bailu.gtk.gdk.Display getDisplay()  {
        return new ch.bailu.gtk.gdk.Display(new PointerContainer(JnaStyleManager.INST().adw_style_manager_get_display(asCPointer())));
    }

    /**
     * Gets whether the application is using high contrast appearance.
     * <br>
     * <br>This cannot be overridden by applications.
     * @return whether the application is using high contrast appearance
    */
    public boolean getHighContrast()  {
        return JnaStyleManager.INST().adw_style_manager_get_high_contrast(asCPointer());
    }

    /**
     * Gets whether the system supports color schemes.
     * <br>
     * <br>This can be used to check if the current environment provides a color scheme
     * <br>preference. For example, applications might want to show a separate
     * <br>appearance switcher if it's set to `FALSE`.
     * @return whether the system supports color schemes
    */
    public boolean getSystemSupportsColorSchemes()  {
        return JnaStyleManager.INST().adw_style_manager_get_system_supports_color_schemes(asCPointer());
    }

    /**
     * Sets the requested application color scheme.
     * <br>
     * <br>The effective appearance will be decided based on the application color
     * <br>scheme and the system preferred color scheme. The
     * <br>[property&#64;StyleManager:dark] property can be used to query the current
     * <br>effective appearance.
     * <br>
     * <br>The `ADW_COLOR_SCHEME_PREFER_LIGHT` color scheme results in the application
     * <br>using light appearance unless the system prefers dark colors. This is the
     * <br>default value.
     * <br>
     * <br>The `ADW_COLOR_SCHEME_PREFER_DARK` color scheme results in the application
     * <br>using dark appearance, but can still switch to the light appearance if the
     * <br>system can prefers it, for example, when the high contrast preference is
     * <br>enabled.
     * <br>
     * <br>The `ADW_COLOR_SCHEME_FORCE_LIGHT` and `ADW_COLOR_SCHEME_FORCE_DARK` values
     * <br>ignore the system preference entirely. They are useful if the application
     * <br>wants to match its UI to its content or to provide a separate color scheme
     * <br>switcher.
     * <br>
     * <br>If a per-[class&#64;Gdk.Display] style manager has its color scheme set to
     * <br>`ADW_COLOR_SCHEME_DEFAULT`, it will inherit the color scheme from the
     * <br>default style manager.
     * <br>
     * <br>For the default style manager, `ADW_COLOR_SCHEME_DEFAULT` is equivalent to
     * <br>`ADW_COLOR_SCHEME_PREFER_LIGHT`.
     * <br>
     * <br>The [property&#64;StyleManager:system-supports-color-schemes] property can be
     * <br>used to check if the current environment provides a color scheme
     * <br>preference.
     * @param color_scheme the color scheme
    */
    public void setColorScheme(int color_scheme)  {
        JnaStyleManager.INST().adw_style_manager_set_color_scheme(asCPointer(), color_scheme);
    }

    /**
     * Gets the default `AdwStyleManager` instance.
     * <br>
     * <br>It manages all [class&#64;Gdk.Display] instances unless the style manager for
     * <br>that display has an override.
     * <br>
     * <br>See [func&#64;StyleManager.get_for_display].
     * @return the default style manager
    */
    public static StyleManager getDefault()  {
        return new StyleManager(new PointerContainer(JnaStyleManager.INST().adw_style_manager_get_default()));
    }

    /**
     * Gets the `AdwStyleManager` instance managing &#64;display.
     * <br>
     * <br>It can be used to override styles for that specific display instead of the
     * <br>whole application.
     * <br>
     * <br>Most applications should use [func&#64;StyleManager.get_default] instead.
     * @param display a `GdkDisplay`
     * @return the style manager for &#64;display
    */
    public static StyleManager getForDisplay(@Nonnull ch.bailu.gtk.gdk.Display display)  {
        return new StyleManager(new PointerContainer(JnaStyleManager.INST().adw_style_manager_get_for_display(asCPointerNotNull(display))));
    }

    public static long getTypeID() { 
        return JnaStyleManager.INST().adw_style_manager_get_type(); 
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
