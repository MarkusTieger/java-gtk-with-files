/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An auxiliary class used by [class&#64;ViewStack].
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ViewStackPage.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ViewStackPage.html</a></p>
*/
public class ViewStackPage extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ViewStackPage.class.getCanonicalName());
    }

    public ViewStackPage(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the badge number for this page.
     * @return the badge number for this page
    */
    public int getBadgeNumber()  {
        return JnaViewStackPage.INST().adw_view_stack_page_get_badge_number(asCPointer());
    }

    /**
     * Gets the stack child to which &#64;self belongs.
     * @return the child to which &#64;self belongs
    */
    public ch.bailu.gtk.gtk.Widget getChild()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaViewStackPage.INST().adw_view_stack_page_get_child(asCPointer())));
    }

    /**
     * Gets the icon name of the page.
     * @return the icon name of the page
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaViewStackPage.INST().adw_view_stack_page_get_icon_name(asCPointer())));
    }

    /**
     * Gets the name of the page.
     * @return the name of the page
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaViewStackPage.INST().adw_view_stack_page_get_name(asCPointer())));
    }

    /**
     * Gets whether the page requires the user attention.
     * @return whether the page needs attention
    */
    public boolean getNeedsAttention()  {
        return JnaViewStackPage.INST().adw_view_stack_page_get_needs_attention(asCPointer());
    }

    /**
     * Gets the page title.
     * @return the page title
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaViewStackPage.INST().adw_view_stack_page_get_title(asCPointer())));
    }

    /**
     * Gets whether underlines in the page title indicate mnemonics.
     * @return whether underlines in the page title indicate mnemonics
    */
    public boolean getUseUnderline()  {
        return JnaViewStackPage.INST().adw_view_stack_page_get_use_underline(asCPointer());
    }

    /**
     * Gets whether &#64;self is visible in its `AdwViewStack`.
     * <br>
     * <br>This is independent from the [property&#64;Gtk.Widget:visible]
     * <br>property of its widget.
     * @return whether &#64;self is visible
    */
    public boolean getVisible()  {
        return JnaViewStackPage.INST().adw_view_stack_page_get_visible(asCPointer());
    }

    /**
     * Sets the badge number for this page.
     * <br>
     * <br>[class&#64;ViewSwitcher] can display it as a badge next to the page icon. It is
     * <br>commonly used to display a number of unread items within the page.
     * <br>
     * <br>It can be used together with [property&#64;ViewStack{age}:needs-attention].
     * @param badge_number the new value to set
    */
    public void setBadgeNumber(int badge_number)  {
        JnaViewStackPage.INST().adw_view_stack_page_set_badge_number(asCPointer(), badge_number);
    }

    /**
     * Sets the icon name of the page.
     * @param icon_name the icon name
    */
    public void setIconName(@Nullable ch.bailu.gtk.type.Str icon_name)  {
        JnaViewStackPage.INST().adw_view_stack_page_set_icon_name(asCPointer(), asCPointer(icon_name));
    }

    /**
     * Sets the icon name of the page.
     * @param icon_name the icon name
    */
    public void setIconName(String icon_name)  {
        JnaViewStackPage.INST().adw_view_stack_page_set_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets the name of the page.
     * @param name the page name
    */
    public void setName(@Nullable ch.bailu.gtk.type.Str name)  {
        JnaViewStackPage.INST().adw_view_stack_page_set_name(asCPointer(), asCPointer(name));
    }

    /**
     * Sets the name of the page.
     * @param name the page name
    */
    public void setName(String name)  {
        JnaViewStackPage.INST().adw_view_stack_page_set_name(asCPointer(), name);
    }

    /**
     * Sets whether the page requires the user attention.
     * <br>
     * <br>[class&#64;ViewSwitcher] will display it as a dot next to the page icon.
     * @param needs_attention the new value to set
    */
    public void setNeedsAttention(boolean needs_attention)  {
        JnaViewStackPage.INST().adw_view_stack_page_set_needs_attention(asCPointer(), needs_attention);
    }

    /**
     * Sets the page title.
     * @param title the page title
    */
    public void setTitle(@Nullable ch.bailu.gtk.type.Str title)  {
        JnaViewStackPage.INST().adw_view_stack_page_set_title(asCPointer(), asCPointer(title));
    }

    /**
     * Sets the page title.
     * @param title the page title
    */
    public void setTitle(String title)  {
        JnaViewStackPage.INST().adw_view_stack_page_set_title(asCPointer(), title);
    }

    /**
     * Sets whether underlines in the page title indicate mnemonics.
     * @param use_underline the new value to set
    */
    public void setUseUnderline(boolean use_underline)  {
        JnaViewStackPage.INST().adw_view_stack_page_set_use_underline(asCPointer(), use_underline);
    }

    /**
     * Sets whether &#64;page is visible in its `AdwViewStack`.
     * <br>
     * <br>This is independent from the [property&#64;Gtk.Widget:visible] property of
     * <br>[property&#64;ViewStackPage:child].
     * @param visible whether &#64;self is visible
    */
    public void setVisible(boolean visible)  {
        JnaViewStackPage.INST().adw_view_stack_page_set_visible(asCPointer(), visible);
    }

    public static long getTypeID() { 
        return JnaViewStackPage.INST().adw_view_stack_page_get_type(); 
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
