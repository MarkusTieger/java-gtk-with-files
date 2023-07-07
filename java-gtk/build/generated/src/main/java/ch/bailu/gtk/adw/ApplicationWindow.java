/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A freeform application window.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;application-window-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;application-window.png&quot; alt=&quot;application-window&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>`AdwApplicationWindow` is a [class&#64;Gtk.ApplicationWindow] subclass providing
 * <br>the same features as [class&#64;Window].
 * <br>
 * <br>See [class&#64;Window] for details.
 * <br>
 * <br>Using [property&#64;Gtk.Application:menubar] is not supported and may result in
 * <br>visual glitches.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ApplicationWindow.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ApplicationWindow.html</a></p>
*/
public class ApplicationWindow extends ch.bailu.gtk.gtk.ApplicationWindow {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ApplicationWindow.class.getCanonicalName());
    }

    public ApplicationWindow(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwApplicationWindow` for &#64;app.
     * @param app an application instance
    */
    public ApplicationWindow(@Nonnull ch.bailu.gtk.gtk.Application app) {
        super(cast(JnaApplicationWindow.INST().adw_application_window_new(asCPointerNotNull(app))));
    }

    /**
     * Gets the content widget of &#64;self.
     * <br>
     * <br>This method should always be used instead of [method&#64;Gtk.Window.get_child].
     * @return the content widget of &#64;self
    */
    public ch.bailu.gtk.gtk.Widget getContent()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaApplicationWindow.INST().adw_application_window_get_content(asCPointer())));
    }

    /**
     * Sets the content widget of &#64;self.
     * <br>
     * <br>This method should always be used instead of [method&#64;Gtk.Window.set_child].
     * @param content the content widget
    */
    public void setContent(@Nullable ch.bailu.gtk.gtk.Widget content)  {
        JnaApplicationWindow.INST().adw_application_window_set_content(asCPointer(), asCPointer(content));
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
     * Implements interface {@link ch.bailu.gtk.gtk.Accessible}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Accessible}
    */
    public ch.bailu.gtk.gtk.Accessible asAccessible() {
        return new ch.bailu.gtk.gtk.Accessible(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Buildable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Buildable}
    */
    public ch.bailu.gtk.gtk.Buildable asBuildable() {
        return new ch.bailu.gtk.gtk.Buildable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ConstraintTarget}
    */
    public ch.bailu.gtk.gtk.ConstraintTarget asConstraintTarget() {
        return new ch.bailu.gtk.gtk.ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Native}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Native}
    */
    public ch.bailu.gtk.gtk.Native asNative() {
        return new ch.bailu.gtk.gtk.Native(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Root}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Root}
    */
    public ch.bailu.gtk.gtk.Root asRoot() {
        return new ch.bailu.gtk.gtk.Root(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ShortcutManager}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ShortcutManager}
    */
    public ch.bailu.gtk.gtk.ShortcutManager asShortcutManager() {
        return new ch.bailu.gtk.gtk.ShortcutManager(cast());
    }

    public static long getTypeID() { 
        return JnaApplicationWindow.INST().adw_application_window_get_type(); 
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
