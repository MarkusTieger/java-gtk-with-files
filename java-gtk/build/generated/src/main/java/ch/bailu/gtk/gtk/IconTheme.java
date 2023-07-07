/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkIconTheme` provides a facility for loading themed icons.
 * <br>
 * <br>The main reason for using a name rather than simply providing a filename
 * <br>is to allow different icons to be used depending on what “icon theme” is
 * <br>selected by the user. The operation of icon themes on Linux and Unix
 * <br>follows the [Icon Theme Specification](http://www.freedesktop.org/Standards/icon-theme-spec)
 * <br>There is a fallback icon theme, named `hicolor`, where applications
 * <br>should install their icons, but additional icon themes can be installed
 * <br>as operating system vendors and users choose.
 * <br>
 * <br>In many cases, named themes are used indirectly, via [class&#64;Gtk.Image]
 * <br>rather than directly, but looking up icons directly is also simple. The
 * <br>`GtkIconTheme` object acts as a database of all the icons in the current
 * <br>theme. You can create new `GtkIconTheme` objects, but it’s much more
 * <br>efficient to use the standard icon theme of the `GtkWidget` so that the
 * <br>icon information is shared with other people looking up icons.
 * <br>
 * <br>```c
 * <br>GtkIconTheme *icon_theme;
 * <br>GtkIconPaintable *icon;
 * <br>GdkPaintable *paintable;
 * <br>
 * <br>icon_theme = gtk_icon_theme_get_for_display (gtk_widget_get_display (my_widget));
 * <br>icon = gtk_icon_theme_lookup_icon (icon_theme,
 * <br>                                   &quot;my-icon-name&quot;, // icon name
 * <br>                                   48, // icon size
 * <br>                                   1,  // scale
 * <br>                                   0,  // flags);
 * <br>paintable = GDK_PAINTABLE (icon);
 * <br>// Use the paintable
 * <br>g_object_unref (icon);
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.IconTheme.html">https://docs.gtk.org/gtk4/class.IconTheme.html</a></p>
*/
public class IconTheme extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IconTheme.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted when the icon theme changes.
         * <br>
         * <br>This can happen becuase current icon theme is switched or
         * <br>because GTK detects that a change has occurred in the
         * <br>contents of the current icon theme.
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaIconTheme.OnChanged) (__self, __data) -> in.onChanged();
    }

    public IconTheme(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new icon theme object.
     * <br>
     * <br>Icon theme objects are used to lookup up an icon by name
     * <br>in a particular icon theme. Usually, you’ll want to use
     * <br>[func&#64;Gtk.IconTheme.get_for_display] rather than creating
     * <br>a new icon theme object for scratch.
    */
    public IconTheme() {
        super(cast(JnaIconTheme.INST().gtk_icon_theme_new()));
    }

    /**
     * Adds a resource path that will be looked at when looking
     * <br>for icons, similar to search paths.
     * <br>
     * <br>See [method&#64;Gtk.IconTheme.set_resource_path].
     * <br>
     * <br>This function should be used to make application-specific icons
     * <br>available as part of the icon theme.
     * @param path a resource path
    */
    public void addResourcePath(@Nonnull ch.bailu.gtk.type.Str path)  {
        JnaIconTheme.INST().gtk_icon_theme_add_resource_path(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Adds a resource path that will be looked at when looking
     * <br>for icons, similar to search paths.
     * <br>
     * <br>See [method&#64;Gtk.IconTheme.set_resource_path].
     * <br>
     * <br>This function should be used to make application-specific icons
     * <br>available as part of the icon theme.
     * @param path a resource path
    */
    public void addResourcePath(String path)  {
        JnaIconTheme.INST().gtk_icon_theme_add_resource_path(asCPointer(), path);
    }

    /**
     * Appends a directory to the search path.
     * <br>
     * <br>See [method&#64;Gtk.IconTheme.set_search_path].
     * @param path directory name to append to the icon path
    */
    public void addSearchPath(@Nonnull ch.bailu.gtk.type.Str path)  {
        JnaIconTheme.INST().gtk_icon_theme_add_search_path(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Appends a directory to the search path.
     * <br>
     * <br>See [method&#64;Gtk.IconTheme.set_search_path].
     * @param path directory name to append to the icon path
    */
    public void addSearchPath(String path)  {
        JnaIconTheme.INST().gtk_icon_theme_add_search_path(asCPointer(), path);
    }

    /**
     * Returns the display that the `GtkIconTheme` object was
     * <br>created for.
     * @return the display of &#64;icon_theme
    */
    public ch.bailu.gtk.gdk.Display getDisplay()  {
        return new ch.bailu.gtk.gdk.Display(new PointerContainer(JnaIconTheme.INST().gtk_icon_theme_get_display(asCPointer())));
    }

    /**
     * Lists the names of icons in the current icon theme.
     * @return a string array   holding the names of all the icons in the theme. You must   free the array using g_strfreev().
    */
    public ch.bailu.gtk.type.Strs getIconNames()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaIconTheme.INST().gtk_icon_theme_get_icon_names(asCPointer())));
    }

    /**
     * Returns an array of integers describing the sizes at which
     * <br>the icon is available without scaling.
     * <br>
     * <br>A size of -1 means that the icon is available in a scalable
     * <br>format. The array is zero-terminated.
     * @param icon_name the name of an icon
     * @return A newly   allocated array describing the sizes at which the icon is   available. The array should be freed with g_free() when it is no   longer needed.
    */
    public ch.bailu.gtk.type.Int getIconSizes(@Nonnull ch.bailu.gtk.type.Str icon_name)  {
        return new ch.bailu.gtk.type.Int(new PointerContainer(JnaIconTheme.INST().gtk_icon_theme_get_icon_sizes(asCPointer(), asCPointerNotNull(icon_name))));
    }

    /**
     * Returns an array of integers describing the sizes at which
     * <br>the icon is available without scaling.
     * <br>
     * <br>A size of -1 means that the icon is available in a scalable
     * <br>format. The array is zero-terminated.
     * @param icon_name the name of an icon
     * @return A newly   allocated array describing the sizes at which the icon is   available. The array should be freed with g_free() when it is no   longer needed.
    */
    public ch.bailu.gtk.type.Int getIconSizes(String icon_name)  {
        return new ch.bailu.gtk.type.Int(new PointerContainer(JnaIconTheme.INST().gtk_icon_theme_get_icon_sizes(asCPointer(), icon_name)));
    }

    /**
     * Gets the current resource path.
     * <br>
     * <br>See [method&#64;Gtk.IconTheme.set_resource_path].
     * @return    A list of resource paths
    */
    public ch.bailu.gtk.type.Strs getResourcePath()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaIconTheme.INST().gtk_icon_theme_get_resource_path(asCPointer())));
    }

    /**
     * Gets the current search path.
     * <br>
     * <br>See [method&#64;Gtk.IconTheme.set_search_path].
     * @return    a list of icon theme path directories
    */
    public ch.bailu.gtk.type.Strs getSearchPath()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaIconTheme.INST().gtk_icon_theme_get_search_path(asCPointer())));
    }

    /**
     * Gets the current icon theme name.
     * <br>
     * <br>Returns (transfer full): the current icon theme name,
     * @return 
    */
    public ch.bailu.gtk.type.Str getThemeName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaIconTheme.INST().gtk_icon_theme_get_theme_name(asCPointer())));
    }

    /**
     * Checks whether an icon theme includes an icon
     * <br>for a particular `GIcon`.
     * @param gicon a `GIcon`
     * @return %TRUE if &#64;self includes an icon for &#64;gicon
    */
    public boolean hasGicon(@Nonnull ch.bailu.gtk.gio.Icon gicon)  {
        return JnaIconTheme.INST().gtk_icon_theme_has_gicon(asCPointer(), asCPointerNotNull(gicon));
    }

    /**
     * Checks whether an icon theme includes an icon
     * <br>for a particular name.
     * @param icon_name the name of an icon
     * @return %TRUE if &#64;self includes an  icon for &#64;icon_name.
    */
    public boolean hasIcon(@Nonnull ch.bailu.gtk.type.Str icon_name)  {
        return JnaIconTheme.INST().gtk_icon_theme_has_icon(asCPointer(), asCPointerNotNull(icon_name));
    }

    /**
     * Checks whether an icon theme includes an icon
     * <br>for a particular name.
     * @param icon_name the name of an icon
     * @return %TRUE if &#64;self includes an  icon for &#64;icon_name.
    */
    public boolean hasIcon(String icon_name)  {
        return JnaIconTheme.INST().gtk_icon_theme_has_icon(asCPointer(), icon_name);
    }

    /**
     * Looks up a icon for a desired size and window scale.
     * <br>
     * <br>The icon can then be rendered by using it as a `GdkPaintable`,
     * <br>or you can get information such as the filename and size.
     * @param icon the `GIcon` to look up
     * @param size desired icon size
     * @param scale the desired scale
     * @param direction text direction the icon will be displayed in
     * @param flags flags modifying the behavior of the icon lookup
     * @return a `GtkIconPaintable` containing   information about the icon. Unref with g_object_unref()
    */
    public IconPaintable lookupByGicon(@Nonnull ch.bailu.gtk.gio.Icon icon, int size, int scale, int direction, int flags)  {
        return new IconPaintable(new PointerContainer(JnaIconTheme.INST().gtk_icon_theme_lookup_by_gicon(asCPointer(), asCPointerNotNull(icon), size, scale, direction, flags)));
    }

    /**
     * Looks up a named icon for a desired size and window scale,
     * <br>returning a `GtkIconPaintable`.
     * <br>
     * <br>The icon can then be rendered by using it as a `GdkPaintable`,
     * <br>or you can get information such as the filename and size.
     * <br>
     * <br>If the available &#64;icon_name is not available and &#64;fallbacks are
     * <br>provided, they will be tried in order.
     * <br>
     * <br>If no matching icon is found, then a paintable that renders the
     * <br>&quot;missing icon&quot; icon is returned. If you need to do something else
     * <br>for missing icons you need to use [method&#64;Gtk.IconTheme.has_icon].
     * <br>
     * <br>Note that you probably want to listen for icon theme changes and
     * <br>update the icon. This is usually done by overriding the
     * <br>GtkWidgetClass.css-changed() function.
     * @param icon_name the name of the icon to lookup
     * @param fallbacks 
     * @param size desired icon size.
     * @param scale the window scale this will be displayed on
     * @param direction text direction the icon will be displayed in
     * @param flags flags modifying the behavior of the icon lookup
     * @return a `GtkIconPaintable` object   containing the icon.
    */
    public IconPaintable lookupIcon(@Nonnull ch.bailu.gtk.type.Str icon_name, @Nullable ch.bailu.gtk.type.Strs fallbacks, int size, int scale, int direction, int flags)  {
        return new IconPaintable(new PointerContainer(JnaIconTheme.INST().gtk_icon_theme_lookup_icon(asCPointer(), asCPointerNotNull(icon_name), asCPointer(fallbacks), size, scale, direction, flags)));
    }

    /**
     * Looks up a named icon for a desired size and window scale,
     * <br>returning a `GtkIconPaintable`.
     * <br>
     * <br>The icon can then be rendered by using it as a `GdkPaintable`,
     * <br>or you can get information such as the filename and size.
     * <br>
     * <br>If the available &#64;icon_name is not available and &#64;fallbacks are
     * <br>provided, they will be tried in order.
     * <br>
     * <br>If no matching icon is found, then a paintable that renders the
     * <br>&quot;missing icon&quot; icon is returned. If you need to do something else
     * <br>for missing icons you need to use [method&#64;Gtk.IconTheme.has_icon].
     * <br>
     * <br>Note that you probably want to listen for icon theme changes and
     * <br>update the icon. This is usually done by overriding the
     * <br>GtkWidgetClass.css-changed() function.
     * @param icon_name the name of the icon to lookup
     * @param fallbacks 
     * @param size desired icon size.
     * @param scale the window scale this will be displayed on
     * @param direction text direction the icon will be displayed in
     * @param flags flags modifying the behavior of the icon lookup
     * @return a `GtkIconPaintable` object   containing the icon.
    */
    public IconPaintable lookupIcon(String icon_name, @Nullable ch.bailu.gtk.type.Strs fallbacks, int size, int scale, int direction, int flags)  {
        return new IconPaintable(new PointerContainer(JnaIconTheme.INST().gtk_icon_theme_lookup_icon(asCPointer(), icon_name, asCPointer(fallbacks), size, scale, direction, flags)));
    }

    /**
     * Sets the resource paths that will be looked at when
     * <br>looking for icons, similar to search paths.
     * <br>
     * <br>The resources are considered as part of the hicolor icon theme
     * <br>and must be located in subdirectories that are defined in the
     * <br>hicolor icon theme, such as `&#64;path/16x16/actions/run.png`
     * <br>or `&#64;path/scalable/actions/run.svg`.
     * <br>
     * <br>Icons that are directly placed in the resource path instead
     * <br>of a subdirectory are also considered as ultimate fallback,
     * <br>but they are treated like unthemed icons.
     * @param path    NULL-terminated array of resource paths   that are searched for icons
    */
    public void setResourcePath(@Nullable ch.bailu.gtk.type.Strs path)  {
        JnaIconTheme.INST().gtk_icon_theme_set_resource_path(asCPointer(), asCPointer(path));
    }

    /**
     * Sets the search path for the icon theme object.
     * <br>
     * <br>When looking for an icon theme, GTK will search for a subdirectory
     * <br>of one or more of the directories in &#64;path with the same name
     * <br>as the icon theme containing an index.theme file. (Themes from
     * <br>multiple of the path elements are combined to allow themes to be
     * <br>extended by adding icons in the user’s home directory.)
     * <br>
     * <br>In addition if an icon found isn’t found either in the current
     * <br>icon theme or the default icon theme, and an image file with
     * <br>the right name is found directly in one of the elements of
     * <br>&#64;path, then that image will be used for the icon name.
     * <br>(This is legacy feature, and new icons should be put
     * <br>into the fallback icon theme, which is called hicolor,
     * <br>rather than directly on the icon path.)
     * @param path NULL-terminated   array of directories that are searched for icon themes
    */
    public void setSearchPath(@Nullable ch.bailu.gtk.type.Strs path)  {
        JnaIconTheme.INST().gtk_icon_theme_set_search_path(asCPointer(), asCPointer(path));
    }

    /**
     * Sets the name of the icon theme that the `GtkIconTheme` object uses
     * <br>overriding system configuration.
     * <br>
     * <br>This function cannot be called on the icon theme objects returned
     * <br>from [func&#64;Gtk.IconTheme.get_for_display].
     * @param theme_name name of icon theme to use instead of   configured theme, or %NULL to unset a previously set custom theme
    */
    public void setThemeName(@Nullable ch.bailu.gtk.type.Str theme_name)  {
        JnaIconTheme.INST().gtk_icon_theme_set_theme_name(asCPointer(), asCPointer(theme_name));
    }

    /**
     * Sets the name of the icon theme that the `GtkIconTheme` object uses
     * <br>overriding system configuration.
     * <br>
     * <br>This function cannot be called on the icon theme objects returned
     * <br>from [func&#64;Gtk.IconTheme.get_for_display].
     * @param theme_name name of icon theme to use instead of   configured theme, or %NULL to unset a previously set custom theme
    */
    public void setThemeName(String theme_name)  {
        JnaIconTheme.INST().gtk_icon_theme_set_theme_name(asCPointer(), theme_name);
    }

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
    }

    /**
     * Gets the icon theme object associated with &#64;display.
     * <br>
     * <br>If this function has not previously been called for the given
     * <br>display, a new icon theme object will be created and associated
     * <br>with the display. Icon theme objects are fairly expensive to create,
     * <br>so using this function is usually a better choice than calling
     * <br>[ctor&#64;Gtk.IconTheme.new] and setting the display yourself; by using
     * <br>this function a single icon theme object will be shared between users.
     * @param display a `GdkDisplay`
     * @return A unique `GtkIconTheme` associated with   the given display. This icon theme is associated with the display   and can be used as long as the display is open. Do not ref or unref it.
    */
    public static IconTheme getForDisplay(@Nonnull ch.bailu.gtk.gdk.Display display)  {
        return new IconTheme(new PointerContainer(JnaIconTheme.INST().gtk_icon_theme_get_for_display(asCPointerNotNull(display))));
    }

    public static long getTypeID() { 
        return JnaIconTheme.INST().gtk_icon_theme_get_type(); 
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
