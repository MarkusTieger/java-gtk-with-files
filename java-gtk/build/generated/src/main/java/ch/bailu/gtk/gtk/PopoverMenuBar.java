/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkPopoverMenuBar` presents a horizontal bar of items that pop
 * <br>up popover menus when clicked.
 * <br>
 * <br>![An example GtkPopoverMenuBar](menubar.png)
 * <br>
 * <br>The only way to create instances of `GtkPopoverMenuBar` is
 * <br>from a `GMenuModel`.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>menubar
 * <br>├── item[.active]
 * <br>┊   ╰── popover
 * <br>╰── item
 * <br>    ╰── popover
 * <br>```
 * <br>
 * <br>`GtkPopoverMenuBar` has a single CSS node with name menubar, below which
 * <br>each item has its CSS node, and below that the corresponding popover.
 * <br>
 * <br>The item whose popover is currently open gets the .active
 * <br>style class.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkPopoverMenuBar` uses the %GTK_ACCESSIBLE_ROLE_MENU_BAR role,
 * <br>the menu items use the %GTK_ACCESSIBLE_ROLE_MENU_ITEM role and
 * <br>the menus use the %GTK_ACCESSIBLE_ROLE_MENU role.
 * <p><a href="https://docs.gtk.org/gtk4/class.PopoverMenuBar.html">https://docs.gtk.org/gtk4/class.PopoverMenuBar.html</a></p>
*/
public class PopoverMenuBar extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PopoverMenuBar.class.getCanonicalName());
    }

    public PopoverMenuBar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkPopoverMenuBar` from a `GMenuModel`.
     * @param model a `GMenuModel`
     * @return a new `GtkPopoverMenuBar`
    */
    public static PopoverMenuBar newFromModelPopoverMenuBar(@Nullable ch.bailu.gtk.gio.MenuModel model)  {
        PointerContainer __self = cast(JnaPopoverMenuBar.INST().gtk_popover_menu_bar_new_from_model(asCPointer(model)));
        if (__self.isNull()) {
            throw new NullPointerException("PopoverMenuBar:newFromModel");
        }
        return new PopoverMenuBar(__self);
    }        
    

    /**
     * Adds a custom widget to a generated menubar.
     * <br>
     * <br>For this to work, the menu model of &#64;bar must have an
     * <br>item with a `custom` attribute that matches &#64;id.
     * @param child the `GtkWidget` to add
     * @param id the ID to insert &#64;child at
     * @return %TRUE if &#64;id was found and the widget added
    */
    public boolean addChild(@Nonnull Widget child, @Nonnull ch.bailu.gtk.type.Str id)  {
        return JnaPopoverMenuBar.INST().gtk_popover_menu_bar_add_child(asCPointer(), asCPointerNotNull(child), asCPointerNotNull(id));
    }

    /**
     * Adds a custom widget to a generated menubar.
     * <br>
     * <br>For this to work, the menu model of &#64;bar must have an
     * <br>item with a `custom` attribute that matches &#64;id.
     * @param child the `GtkWidget` to add
     * @param id the ID to insert &#64;child at
     * @return %TRUE if &#64;id was found and the widget added
    */
    public boolean addChild(@Nonnull Widget child, String id)  {
        return JnaPopoverMenuBar.INST().gtk_popover_menu_bar_add_child(asCPointer(), asCPointerNotNull(child), id);
    }

    /**
     * Returns the model from which the contents of &#64;bar are taken.
     * @return a `GMenuModel`
    */
    public ch.bailu.gtk.gio.MenuModel getMenuModel()  {
        return new ch.bailu.gtk.gio.MenuModel(new PointerContainer(JnaPopoverMenuBar.INST().gtk_popover_menu_bar_get_menu_model(asCPointer())));
    }

    /**
     * Removes a widget that has previously been added with
     * <br>gtk_popover_menu_bar_add_child().
     * @param child the `GtkWidget` to remove
     * @return %TRUE if the widget was removed
    */
    public boolean removeChild(@Nonnull Widget child)  {
        return JnaPopoverMenuBar.INST().gtk_popover_menu_bar_remove_child(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Sets a menu model from which &#64;bar should take
     * <br>its contents.
     * @param model a `GMenuModel`
    */
    public void setMenuModel(@Nullable ch.bailu.gtk.gio.MenuModel model)  {
        JnaPopoverMenuBar.INST().gtk_popover_menu_bar_set_menu_model(asCPointer(), asCPointer(model));
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

    public static long getTypeID() { 
        return JnaPopoverMenuBar.INST().gtk_popover_menu_bar_get_type(); 
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
