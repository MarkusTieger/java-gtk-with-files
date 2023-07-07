/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A helper widget for setting a window's title and subtitle.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;window-title-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;window-title.png&quot; alt=&quot;window-title&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>`AdwWindowTitle` shows a title and subtitle. It's intended to be used as the
 * <br>title child of [class&#64;Gtk.HeaderBar] or [class&#64;HeaderBar].
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwWindowTitle` has a single CSS node with name `windowtitle`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.WindowTitle.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.WindowTitle.html</a></p>
*/
public class WindowTitle extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(WindowTitle.class.getCanonicalName());
    }

    public WindowTitle(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwWindowTitle`.
     * @param title a title
     * @param subtitle a subtitle
    */
    public WindowTitle(@Nonnull ch.bailu.gtk.type.Str title, @Nonnull ch.bailu.gtk.type.Str subtitle) {
        super(cast(JnaWindowTitle.INST().adw_window_title_new(asCPointerNotNull(title), asCPointerNotNull(subtitle))));
    }

    /**
     * Creates a new `AdwWindowTitle`.
     * @param title a title
     * @param subtitle a subtitle
    */
    public WindowTitle(String title, String subtitle) {
        super(cast(JnaWindowTitle.INST().adw_window_title_new(title, subtitle)));
    }

    /**
     * Gets the subtitle of &#64;self.
     * @return the subtitle
    */
    public ch.bailu.gtk.type.Str getSubtitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaWindowTitle.INST().adw_window_title_get_subtitle(asCPointer())));
    }

    /**
     * Gets the title of &#64;self.
     * @return the title
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaWindowTitle.INST().adw_window_title_get_title(asCPointer())));
    }

    /**
     * Sets the subtitle of &#64;self.
     * <br>
     * <br>The subtitle should give the user additional details.
     * @param subtitle a subtitle
    */
    public void setSubtitle(@Nonnull ch.bailu.gtk.type.Str subtitle)  {
        JnaWindowTitle.INST().adw_window_title_set_subtitle(asCPointer(), asCPointerNotNull(subtitle));
    }

    /**
     * Sets the subtitle of &#64;self.
     * <br>
     * <br>The subtitle should give the user additional details.
     * @param subtitle a subtitle
    */
    public void setSubtitle(String subtitle)  {
        JnaWindowTitle.INST().adw_window_title_set_subtitle(asCPointer(), subtitle);
    }

    /**
     * Sets the title of &#64;self.
     * <br>
     * <br>The title typically identifies the current view or content item, and
     * <br>generally does not use the application name.
     * @param title a title
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaWindowTitle.INST().adw_window_title_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * Sets the title of &#64;self.
     * <br>
     * <br>The title typically identifies the current view or content item, and
     * <br>generally does not use the application name.
     * @param title a title
    */
    public void setTitle(String title)  {
        JnaWindowTitle.INST().adw_window_title_set_title(asCPointer(), title);
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

    public static long getTypeID() { 
        return JnaWindowTitle.INST().adw_window_title_get_type(); 
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
