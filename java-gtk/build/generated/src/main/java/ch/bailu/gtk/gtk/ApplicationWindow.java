/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkApplicationWindow` is a `GtkWindow` subclass that integrates with
 * <br>`GtkApplication`.
 * <br>
 * <br>Notably, `GtkApplicationWindow` can handle an application menubar.
 * <br>
 * <br>This class implements the `GActionGroup` and `GActionMap` interfaces,
 * <br>to let you add window-specific actions that will be exported by the
 * <br>associated [class&#64;Gtk.Application], together with its application-wide
 * <br>actions. Window-specific actions are prefixed with the “win.”
 * <br>prefix and application-wide actions are prefixed with the “app.”
 * <br>prefix. Actions must be addressed with the prefixed name when
 * <br>referring to them from a `GMenuModel`.
 * <br>
 * <br>Note that widgets that are placed inside a `GtkApplicationWindow`
 * <br>can also activate these actions, if they implement the
 * <br>[iface&#64;Gtk.Actionable] interface.
 * <br>
 * <br>The settings [property&#64;Gtk.Settings:gtk-shell-shows-app-menu] and
 * <br>[property&#64;Gtk.Settings:gtk-shell-shows-menubar] tell GTK whether the
 * <br>desktop environment is showing the application menu and menubar
 * <br>models outside the application as part of the desktop shell.
 * <br>For instance, on OS X, both menus will be displayed remotely;
 * <br>on Windows neither will be.
 * <br>
 * <br>If the desktop environment does not display the menubar, then
 * <br>`GtkApplicationWindow` will automatically show a menubar for it.
 * <br>This behaviour can be overridden with the
 * <br>[property&#64;Gtk.ApplicationWindow:show-menubar] property. If the
 * <br>desktop environment does not display the application menu, then
 * <br>it will automatically be included in the menubar or in the windows
 * <br>client-side decorations.
 * <br>
 * <br>See [class&#64;Gtk.PopoverMenu] for information about the XML language
 * <br>used by `GtkBuilder` for menu models.
 * <br>
 * <br>See also: [method&#64;Gtk.Application.set_menubar].
 * <br>
 * <br>&#35;&#35; A GtkApplicationWindow with a menubar
 * <br>
 * <br>The code sample below shows how to set up a `GtkApplicationWindow`
 * <br>with a menu bar defined on the [class&#64;Gtk.Application]:
 * <br>
 * <br>```c
 * <br>GtkApplication *app = gtk_application_new (&quot;org.gtk.test&quot;, 0);
 * <br>
 * <br>GtkBuilder *builder = gtk_builder_new_from_string (
 * <br>    &quot;&lt;interface&gt;&quot;
 * <br>    &quot;  &lt;menu id='menubar'&gt;&quot;
 * <br>    &quot;    &lt;submenu&gt;&quot;
 * <br>    &quot;      &lt;attribute name='label' translatable='yes'&gt;_Edit&lt;/attribute&gt;&quot;
 * <br>    &quot;      &lt;item&gt;&quot;
 * <br>    &quot;        &lt;attribute name='label' translatable='yes'&gt;_Copy&lt;/attribute&gt;&quot;
 * <br>    &quot;        &lt;attribute name='action'&gt;win.copy&lt;/attribute&gt;&quot;
 * <br>    &quot;      &lt;/item&gt;&quot;
 * <br>    &quot;      &lt;item&gt;&quot;
 * <br>    &quot;        &lt;attribute name='label' translatable='yes'&gt;_Paste&lt;/attribute&gt;&quot;
 * <br>    &quot;        &lt;attribute name='action'&gt;win.paste&lt;/attribute&gt;&quot;
 * <br>    &quot;      &lt;/item&gt;&quot;
 * <br>    &quot;    &lt;/submenu&gt;&quot;
 * <br>    &quot;  &lt;/menu&gt;&quot;
 * <br>    &quot;&lt;/interface&gt;&quot;,
 * <br>    -1);
 * <br>
 * <br>GMenuModel *menubar = G_MENU_MODEL (gtk_builder_get_object (builder, &quot;menubar&quot;));
 * <br>gtk_application_set_menubar (GTK_APPLICATION (app), menubar);
 * <br>g_object_unref (builder);
 * <br>
 * <br>// ...
 * <br>
 * <br>GtkWidget *window = gtk_application_window_new (app);
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.ApplicationWindow.html">https://docs.gtk.org/gtk4/class.ApplicationWindow.html</a></p>
*/
public class ApplicationWindow extends Window {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ApplicationWindow.class.getCanonicalName());
    }

    public ApplicationWindow(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkApplicationWindow`.
     * @param application a `GtkApplication`
    */
    public ApplicationWindow(@Nonnull Application application) {
        super(cast(JnaApplicationWindow.INST().gtk_application_window_new(asCPointerNotNull(application))));
    }

    /**
     * Gets the `GtkShortcutsWindow` that is associated with &#64;window.
     * <br>
     * <br>See [method&#64;Gtk.ApplicationWindow.set_help_overlay].
     * @return the help overlay associated   with &#64;window
    */
    public ShortcutsWindow getHelpOverlay()  {
        return new ShortcutsWindow(new PointerContainer(JnaApplicationWindow.INST().gtk_application_window_get_help_overlay(asCPointer())));
    }

    /**
     * Returns the unique ID of the window.
     * <br>
     * <br> If the window has not yet been added to a `GtkApplication`, returns `0`.
     * @return the unique ID for &#64;window, or `0` if the window   has not yet been added to a `GtkApplication`
    */
    public int getId()  {
        return JnaApplicationWindow.INST().gtk_application_window_get_id(asCPointer());
    }

    /**
     * Returns whether the window will display a menubar for the app menu
     * <br>and menubar as needed.
     * @return %TRUE if &#64;window will display a menubar when needed
    */
    public boolean getShowMenubar()  {
        return JnaApplicationWindow.INST().gtk_application_window_get_show_menubar(asCPointer());
    }

    /**
     * Associates a shortcuts window with the application window.
     * <br>
     * <br>Additionally, sets up an action with the name
     * <br>`win.show-help-overlay` to present it.
     * <br>
     * <br>&#64;window takes responsibility for destroying &#64;help_overlay.
     * @param help_overlay a `GtkShortcutsWindow`
    */
    public void setHelpOverlay(@Nullable ShortcutsWindow help_overlay)  {
        JnaApplicationWindow.INST().gtk_application_window_set_help_overlay(asCPointer(), asCPointer(help_overlay));
    }

    /**
     * Sets whether the window will display a menubar for the app menu
     * <br>and menubar as needed.
     * @param show_menubar whether to show a menubar when needed
    */
    public void setShowMenubar(boolean show_menubar)  {
        JnaApplicationWindow.INST().gtk_application_window_set_show_menubar(asCPointer(), show_menubar);
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
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link Native}. Call this to get access to interface functions.
     * @return {@link Native}
    */
    public Native asNative() {
        return new Native(cast());
    }

    /**
     * Implements interface {@link Root}. Call this to get access to interface functions.
     * @return {@link Root}
    */
    public Root asRoot() {
        return new Root(cast());
    }

    /**
     * Implements interface {@link ShortcutManager}. Call this to get access to interface functions.
     * @return {@link ShortcutManager}
    */
    public ShortcutManager asShortcutManager() {
        return new ShortcutManager(cast());
    }

    public static long getTypeID() { 
        return JnaApplicationWindow.INST().gtk_application_window_get_type(); 
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
