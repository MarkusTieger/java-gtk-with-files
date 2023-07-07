/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkListItem` is used by list widgets to represent items in a `GListModel`.
 * <br>
 * <br>The `GtkListItem`s are managed by the list widget (with its factory)
 * <br>and cannot be created by applications, but they need to be populated
 * <br>by application code. This is done by calling [method&#64;Gtk.ListItem.set_child].
 * <br>
 * <br>`GtkListItem`s exist in 2 stages:
 * <br>
 * <br>1. The unbound stage where the listitem is not currently connected to
 * <br>   an item in the list. In that case, the [property&#64;Gtk.ListItem:item]
 * <br>   property is set to %NULL.
 * <br>
 * <br>2. The bound stage where the listitem references an item from the list.
 * <br>   The [property&#64;Gtk.ListItem:item] property is not %NULL.
 * <p><a href="https://docs.gtk.org/gtk4/class.ListItem.html">https://docs.gtk.org/gtk4/class.ListItem.html</a></p>
*/
public class ListItem extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ListItem.class.getCanonicalName());
    }

    public ListItem(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Checks if a list item has been set to be activatable via
     * <br>gtk_list_item_set_activatable().
     * @return %TRUE if the item is activatable
    */
    public boolean getActivatable()  {
        return JnaListItem.INST().gtk_list_item_get_activatable(asCPointer());
    }

    /**
     * Gets the child previously set via gtk_list_item_set_child() or
     * <br>%NULL if none was set.
     * @return The child
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaListItem.INST().gtk_list_item_get_child(asCPointer())));
    }

    /**
     * Gets the model item that associated with &#64;self.
     * <br>
     * <br>If &#64;self is unbound, this function returns %NULL.
     * @return The item displayed
    */
    public ch.bailu.gtk.type.Pointer getItem()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaListItem.INST().gtk_list_item_get_item(asCPointer())));
    }

    /**
     * Gets the position in the model that &#64;self currently displays.
     * <br>
     * <br>If &#64;self is unbound, %GTK_INVALID_LIST_POSITION is returned.
     * @return The position of this item
    */
    public int getPosition()  {
        return JnaListItem.INST().gtk_list_item_get_position(asCPointer());
    }

    /**
     * Checks if a list item has been set to be selectable via
     * <br>gtk_list_item_set_selectable().
     * <br>
     * <br>Do not confuse this function with [method&#64;Gtk.ListItem.get_selected].
     * @return %TRUE if the item is selectable
    */
    public boolean getSelectable()  {
        return JnaListItem.INST().gtk_list_item_get_selectable(asCPointer());
    }

    /**
     * Checks if the item is displayed as selected.
     * <br>
     * <br>The selected state is maintained by the liste widget and its model
     * <br>and cannot be set otherwise.
     * @return %TRUE if the item is selected.
    */
    public boolean getSelected()  {
        return JnaListItem.INST().gtk_list_item_get_selected(asCPointer());
    }

    /**
     * Sets &#64;self to be activatable.
     * <br>
     * <br>If an item is activatable, double-clicking on the item, using
     * <br>the Return key or calling gtk_widget_activate() will activate
     * <br>the item. Activating instructs the containing view to handle
     * <br>activation. `GtkListView` for example will be emitting the
     * <br>[signal&#64;Gtk.ListView::activate] signal.
     * <br>
     * <br>By default, list items are activatable.
     * @param activatable if the item should be activatable
    */
    public void setActivatable(boolean activatable)  {
        JnaListItem.INST().gtk_list_item_set_activatable(asCPointer(), activatable);
    }

    /**
     * Sets the child to be used for this listitem.
     * <br>
     * <br>This function is typically called by applications when
     * <br>setting up a listitem so that the widget can be reused when
     * <br>binding it multiple times.
     * @param child The list item's child or %NULL to unset
    */
    public void setChild(@Nullable Widget child)  {
        JnaListItem.INST().gtk_list_item_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets &#64;self to be selectable.
     * <br>
     * <br>If an item is selectable, clicking on the item or using the keyboard
     * <br>will try to select or unselect the item. If this succeeds is up to
     * <br>the model to determine, as it is managing the selected state.
     * <br>
     * <br>Note that this means that making an item non-selectable has no
     * <br>influence on the selected state at all. A non-selectable item
     * <br>may still be selected.
     * <br>
     * <br>By default, list items are selectable. When rebinding them to
     * <br>a new item, they will also be reset to be selectable by GTK.
     * @param selectable if the item should be selectable
    */
    public void setSelectable(boolean selectable)  {
        JnaListItem.INST().gtk_list_item_set_selectable(asCPointer(), selectable);
    }

    public static long getTypeID() { 
        return JnaListItem.INST().gtk_list_item_get_type(); 
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
