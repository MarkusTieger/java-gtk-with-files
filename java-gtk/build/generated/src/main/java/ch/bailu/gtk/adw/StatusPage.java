/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A page used for empty/error states and similar use-cases.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;status-page-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;status-page.png&quot; alt=&quot;status-page&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwStatusPage` widget can have an icon, a title, a description and a
 * <br>custom widget which is displayed below them.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwStatusPage` has a main CSS node with name `statuspage`.
 * <br>
 * <br>`AdwStatusPage` can use the
 * <br>[`.compact`](style-classes.html&#35;compact-status-page) style class for when it
 * <br>needs to fit into a small space such a sidebar or a popover.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.StatusPage.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.StatusPage.html</a></p>
*/
public class StatusPage extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StatusPage.class.getCanonicalName());
    }

    public StatusPage(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwStatusPage`.
    */
    public StatusPage() {
        super(cast(JnaStatusPage.INST().adw_status_page_new()));
    }

    /**
     * Gets the child widget of &#64;self.
     * @return the child widget of &#64;self
    */
    public ch.bailu.gtk.gtk.Widget getChild()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaStatusPage.INST().adw_status_page_get_child(asCPointer())));
    }

    /**
     * Gets the description for &#64;self.
     * @return the description
    */
    public ch.bailu.gtk.type.Str getDescription()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStatusPage.INST().adw_status_page_get_description(asCPointer())));
    }

    /**
     * Gets the icon name for &#64;self.
     * @return the icon name
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStatusPage.INST().adw_status_page_get_icon_name(asCPointer())));
    }

    /**
     * Gets the paintable for &#64;self.
     * @return the paintable
    */
    public ch.bailu.gtk.gdk.Paintable getPaintable()  {
        return new ch.bailu.gtk.gdk.Paintable(new PointerContainer(JnaStatusPage.INST().adw_status_page_get_paintable(asCPointer())));
    }

    /**
     * Gets the title for &#64;self.
     * @return the title
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStatusPage.INST().adw_status_page_get_title(asCPointer())));
    }

    /**
     * Sets the child widget of &#64;self.
     * @param child the child widget
    */
    public void setChild(@Nullable ch.bailu.gtk.gtk.Widget child)  {
        JnaStatusPage.INST().adw_status_page_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the description for &#64;self.
     * <br>
     * <br>The description is displayed below the title.
     * @param description the description
    */
    public void setDescription(@Nullable ch.bailu.gtk.type.Str description)  {
        JnaStatusPage.INST().adw_status_page_set_description(asCPointer(), asCPointer(description));
    }

    /**
     * Sets the description for &#64;self.
     * <br>
     * <br>The description is displayed below the title.
     * @param description the description
    */
    public void setDescription(String description)  {
        JnaStatusPage.INST().adw_status_page_set_description(asCPointer(), description);
    }

    /**
     * Sets the icon name for &#64;self.
     * <br>
     * <br>Changing this will set [property&#64;StatusPage:paintable] to `NULL`.
     * @param icon_name the icon name
    */
    public void setIconName(@Nullable ch.bailu.gtk.type.Str icon_name)  {
        JnaStatusPage.INST().adw_status_page_set_icon_name(asCPointer(), asCPointer(icon_name));
    }

    /**
     * Sets the icon name for &#64;self.
     * <br>
     * <br>Changing this will set [property&#64;StatusPage:paintable] to `NULL`.
     * @param icon_name the icon name
    */
    public void setIconName(String icon_name)  {
        JnaStatusPage.INST().adw_status_page_set_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets the paintable for &#64;self.
     * <br>
     * <br>Changing this will set [property&#64;StatusPage:icon-name] to `NULL`.
     * @param paintable the paintable
    */
    public void setPaintable(@Nullable ch.bailu.gtk.gdk.Paintable paintable)  {
        JnaStatusPage.INST().adw_status_page_set_paintable(asCPointer(), asCPointer(paintable));
    }

    /**
     * Sets the title for &#64;self.
     * <br>
     * <br>The title is displayed below the icon.
     * @param title the title
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaStatusPage.INST().adw_status_page_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * Sets the title for &#64;self.
     * <br>
     * <br>The title is displayed below the icon.
     * @param title the title
    */
    public void setTitle(String title)  {
        JnaStatusPage.INST().adw_status_page_set_title(asCPointer(), title);
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
        return JnaStatusPage.INST().adw_status_page_get_type(); 
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
