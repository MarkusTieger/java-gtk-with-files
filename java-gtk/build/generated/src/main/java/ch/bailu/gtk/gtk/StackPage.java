/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkStackPage` is an auxiliary class used by `GtkStack`.
 * <p><a href="https://docs.gtk.org/gtk4/class.StackPage.html">https://docs.gtk.org/gtk4/class.StackPage.html</a></p>
*/
public class StackPage extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StackPage.class.getCanonicalName());
    }

    public StackPage(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the stack child to which &#64;self belongs.
     * @return the child to which &#64;self belongs
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaStackPage.INST().gtk_stack_page_get_child(asCPointer())));
    }

    /**
     * Returns the icon name of the page.
     * @return The value of the [property&#64;Gtk.StackPage:icon-name] property
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStackPage.INST().gtk_stack_page_get_icon_name(asCPointer())));
    }

    /**
     * Returns the name of the page.
     * @return The value of the [property&#64;Gtk.StackPage:name] property
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStackPage.INST().gtk_stack_page_get_name(asCPointer())));
    }

    /**
     * Returns whether the page is marked as “needs attention”.
     * @return The value of the [property&#64;Gtk.StackPage:needs-attention]   property.
    */
    public boolean getNeedsAttention()  {
        return JnaStackPage.INST().gtk_stack_page_get_needs_attention(asCPointer());
    }

    /**
     * Gets the page title.
     * @return The value of the [property&#64;Gtk.StackPage:title] property
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStackPage.INST().gtk_stack_page_get_title(asCPointer())));
    }

    /**
     * Gets whether underlines in the page title indicate mnemonics.
     * @return The value of the [property&#64;Gtk.StackPage:use-underline] property
    */
    public boolean getUseUnderline()  {
        return JnaStackPage.INST().gtk_stack_page_get_use_underline(asCPointer());
    }

    /**
     * Returns whether &#64;page is visible in its `GtkStack`.
     * <br>
     * <br>This is independent from the [property&#64;Gtk.Widget:visible]
     * <br>property of its widget.
     * @return %TRUE if &#64;page is visible
    */
    public boolean getVisible()  {
        return JnaStackPage.INST().gtk_stack_page_get_visible(asCPointer());
    }

    /**
     * Sets the icon name of the page.
     * @param setting the new value to set
    */
    public void setIconName(@Nonnull ch.bailu.gtk.type.Str setting)  {
        JnaStackPage.INST().gtk_stack_page_set_icon_name(asCPointer(), asCPointerNotNull(setting));
    }

    /**
     * Sets the icon name of the page.
     * @param setting the new value to set
    */
    public void setIconName(String setting)  {
        JnaStackPage.INST().gtk_stack_page_set_icon_name(asCPointer(), setting);
    }

    /**
     * Sets the name of the page.
     * @param setting the new value to set
    */
    public void setName(@Nonnull ch.bailu.gtk.type.Str setting)  {
        JnaStackPage.INST().gtk_stack_page_set_name(asCPointer(), asCPointerNotNull(setting));
    }

    /**
     * Sets the name of the page.
     * @param setting the new value to set
    */
    public void setName(String setting)  {
        JnaStackPage.INST().gtk_stack_page_set_name(asCPointer(), setting);
    }

    /**
     * Sets whether the page is marked as “needs attention”.
     * @param setting the new value to set
    */
    public void setNeedsAttention(boolean setting)  {
        JnaStackPage.INST().gtk_stack_page_set_needs_attention(asCPointer(), setting);
    }

    /**
     * Sets the page title.
     * @param setting the new value to set
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str setting)  {
        JnaStackPage.INST().gtk_stack_page_set_title(asCPointer(), asCPointerNotNull(setting));
    }

    /**
     * Sets the page title.
     * @param setting the new value to set
    */
    public void setTitle(String setting)  {
        JnaStackPage.INST().gtk_stack_page_set_title(asCPointer(), setting);
    }

    /**
     * Sets whether underlines in the page title indicate mnemonics.
     * @param setting the new value to set
    */
    public void setUseUnderline(boolean setting)  {
        JnaStackPage.INST().gtk_stack_page_set_use_underline(asCPointer(), setting);
    }

    /**
     * Sets whether &#64;page is visible in its `GtkStack`.
     * @param visible The new property value
    */
    public void setVisible(boolean visible)  {
        JnaStackPage.INST().gtk_stack_page_set_visible(asCPointer(), visible);
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    public static long getTypeID() { 
        return JnaStackPage.INST().gtk_stack_page_get_type(); 
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
