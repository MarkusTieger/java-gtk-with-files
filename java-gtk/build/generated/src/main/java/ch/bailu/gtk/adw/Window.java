/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A freeform window.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;window-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;window.png&quot; alt=&quot;window&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwWindow` widget is a subclass of [class&#64;Gtk.Window] which has no
 * <br>titlebar area. It means [class&#64;Gtk.HeaderBar] can be used as follows:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;AdwWindow&quot;&gt;
 * <br>  &lt;property name=&quot;content&quot;&gt;
 * <br>    &lt;object class=&quot;GtkBox&quot;&gt;
 * <br>      &lt;property name=&quot;orientation&quot;&gt;vertical&lt;/property&gt;
 * <br>      &lt;child&gt;
 * <br>        &lt;object class=&quot;GtkHeaderBar&quot;/&gt;
 * <br>      &lt;/child&gt;
 * <br>      &lt;child&gt;
 * <br>        &lt;!-- ... --&gt;
 * <br>      &lt;/child&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/property&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>Using [property&#64;Gtk.Window:titlebar] or [property&#64;Gtk.Window:child]
 * <br>is not supported and will result in a crash. Use [property&#64;Window:content]
 * <br>instead.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Window.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Window.html</a></p>
*/
public class Window extends ch.bailu.gtk.gtk.Window {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Window.class.getCanonicalName());
    }

    public Window(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwWindow`.
    */
    public Window() {
        super(cast(JnaWindow.INST().adw_window_new()));
    }

    /**
     * Gets the content widget of &#64;self.
     * <br>
     * <br>This method should always be used instead of [method&#64;Gtk.Window.get_child].
     * @return the content widget of &#64;self
    */
    public ch.bailu.gtk.gtk.Widget getContent()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaWindow.INST().adw_window_get_content(asCPointer())));
    }

    /**
     * Sets the content widget of &#64;self.
     * <br>
     * <br>This method should always be used instead of [method&#64;Gtk.Window.set_child].
     * @param content the content widget
    */
    public void setContent(@Nullable ch.bailu.gtk.gtk.Widget content)  {
        JnaWindow.INST().adw_window_set_content(asCPointer(), asCPointer(content));
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
        return JnaWindow.INST().adw_window_get_type(); 
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
