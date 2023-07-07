/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A base class for Adwaita applications.
 * <br>
 * <br>`AdwApplication` handles library initialization by calling [func&#64;init] in the
 * <br>default [signal&#64;Gio.Application::startup] signal handler, in turn chaining up
 * <br>as required by [class&#64;Gtk.Application]. Therefore, any subclass of
 * <br>`AdwApplication` should always chain up its `startup` handler before using
 * <br>any Adwaita or GTK API.
 * <br>
 * <br>&#35;&#35; Automatic Resources
 * <br>
 * <br>`AdwApplication` will automatically load stylesheets located in the
 * <br>application's resource base path (see
 * <br>[method&#64;Gio.Application.set_resource_base_path], if they're present.
 * <br>
 * <br>They can be used to add custom styles to the application, as follows:
 * <br>
 * <br>- `style.css` contains styles that are always present.
 * <br>
 * <br>- `style-dark.css` contains styles only used when
 * <br>[property&#64;StyleManager:dark] is `TRUE`.
 * <br>
 * <br>- `style-hc.css` contains styles used when the system high contrast
 * <br>  preference is enabled.
 * <br>
 * <br>- `style-hc-dark.css` contains styles used when the system high contrast
 * <br>  preference is enabled and [property&#64;StyleManager:dark] is `TRUE`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Application.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Application.html</a></p>
*/
public class Application extends ch.bailu.gtk.gtk.Application {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Application.class.getCanonicalName());
    }

    public Application(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwApplication`.
     * <br>
     * <br>If `application_id` is not `NULL`, then it must be valid. See
     * <br>[func&#64;Gio.Application.id_is_valid].
     * <br>
     * <br>If no application ID is given then some features (most notably application
     * <br>uniqueness) will be disabled.
     * @param application_id The application ID
     * @param flags The application flags
    */
    public Application(@Nullable ch.bailu.gtk.type.Str application_id, int flags) {
        super(cast(JnaApplication.INST().adw_application_new(asCPointer(application_id), flags)));
    }

    /**
     * Creates a new `AdwApplication`.
     * <br>
     * <br>If `application_id` is not `NULL`, then it must be valid. See
     * <br>[func&#64;Gio.Application.id_is_valid].
     * <br>
     * <br>If no application ID is given then some features (most notably application
     * <br>uniqueness) will be disabled.
     * @param application_id The application ID
     * @param flags The application flags
    */
    public Application(String application_id, int flags) {
        super(cast(JnaApplication.INST().adw_application_new(application_id, flags)));
    }

    /**
     * Gets the style manager for &#64;self.
     * <br>
     * <br>This is a convenience property allowing to access `AdwStyleManager` through
     * <br>property bindings or expressions.
     * @return the style manager
    */
    public StyleManager getStyleManager()  {
        return new StyleManager(new PointerContainer(JnaApplication.INST().adw_application_get_style_manager(asCPointer())));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ActionGroup}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ActionGroup}
    */
    public ch.bailu.gtk.gio.ActionGroup asActionGroup() {
        return new ch.bailu.gtk.gio.ActionGroup(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ActionMap}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ActionMap}
    */
    public ch.bailu.gtk.gio.ActionMap asActionMap() {
        return new ch.bailu.gtk.gio.ActionMap(cast());
    }

    public static long getTypeID() { 
        return JnaApplication.INST().adw_application_get_type(); 
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
