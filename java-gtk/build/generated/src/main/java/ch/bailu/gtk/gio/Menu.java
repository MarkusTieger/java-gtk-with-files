/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GMenu is a simple implementation of &#35;GMenuModel.
 * <br>You populate a &#35;GMenu by adding &#35;GMenuItem instances to it.
 * <br>
 * <br>There are some convenience functions to allow you to directly
 * <br>add items (avoiding &#35;GMenuItem) for the common cases. To add
 * <br>a regular item, use g_menu_insert(). To add a section, use
 * <br>g_menu_insert_section(). To add a submenu, use
 * <br>g_menu_insert_submenu().
 * <p><a href="https://docs.gtk.org/gio/class.Menu.html">https://docs.gtk.org/gio/class.Menu.html</a></p>
*/
public class Menu extends MenuModel {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Menu.class.getCanonicalName());
    }

    public Menu(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GMenu.
     * <br>
     * <br>The new menu has no items.
    */
    public Menu() {
        super(cast(JnaMenu.INST().g_menu_new()));
    }

    /**
     * Convenience function for appending a normal menu item to the end of
     * <br>&#64;menu.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * <br>flexible alternative.
     * @param label the section label, or %NULL
     * @param detailed_action the detailed action string, or %NULL
    */
    public void append(@Nullable ch.bailu.gtk.type.Str label, @Nullable ch.bailu.gtk.type.Str detailed_action)  {
        JnaMenu.INST().g_menu_append(asCPointer(), asCPointer(label), asCPointer(detailed_action));
    }

    /**
     * Convenience function for appending a normal menu item to the end of
     * <br>&#64;menu.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * <br>flexible alternative.
     * @param label the section label, or %NULL
     * @param detailed_action the detailed action string, or %NULL
    */
    public void append(String label, String detailed_action)  {
        JnaMenu.INST().g_menu_append(asCPointer(), label, detailed_action);
    }

    /**
     * Appends &#64;item to the end of &#64;menu.
     * <br>
     * <br>See g_menu_insert_item() for more information.
     * @param item a &#35;GMenuItem to append
    */
    public void appendItem(@Nonnull MenuItem item)  {
        JnaMenu.INST().g_menu_append_item(asCPointer(), asCPointerNotNull(item));
    }

    /**
     * Convenience function for appending a section menu item to the end of
     * <br>&#64;menu.  Combine g_menu_item_new_section() and g_menu_insert_item() for a
     * <br>more flexible alternative.
     * @param label the section label, or %NULL
     * @param section a &#35;GMenuModel with the items of the section
    */
    public void appendSection(@Nullable ch.bailu.gtk.type.Str label, @Nonnull MenuModel section)  {
        JnaMenu.INST().g_menu_append_section(asCPointer(), asCPointer(label), asCPointerNotNull(section));
    }

    /**
     * Convenience function for appending a section menu item to the end of
     * <br>&#64;menu.  Combine g_menu_item_new_section() and g_menu_insert_item() for a
     * <br>more flexible alternative.
     * @param label the section label, or %NULL
     * @param section a &#35;GMenuModel with the items of the section
    */
    public void appendSection(String label, @Nonnull MenuModel section)  {
        JnaMenu.INST().g_menu_append_section(asCPointer(), label, asCPointerNotNull(section));
    }

    /**
     * Convenience function for appending a submenu menu item to the end of
     * <br>&#64;menu.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for a
     * <br>more flexible alternative.
     * @param label the section label, or %NULL
     * @param submenu a &#35;GMenuModel with the items of the submenu
    */
    public void appendSubmenu(@Nullable ch.bailu.gtk.type.Str label, @Nonnull MenuModel submenu)  {
        JnaMenu.INST().g_menu_append_submenu(asCPointer(), asCPointer(label), asCPointerNotNull(submenu));
    }

    /**
     * Convenience function for appending a submenu menu item to the end of
     * <br>&#64;menu.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for a
     * <br>more flexible alternative.
     * @param label the section label, or %NULL
     * @param submenu a &#35;GMenuModel with the items of the submenu
    */
    public void appendSubmenu(String label, @Nonnull MenuModel submenu)  {
        JnaMenu.INST().g_menu_append_submenu(asCPointer(), label, asCPointerNotNull(submenu));
    }

    /**
     * Marks &#64;menu as frozen.
     * <br>
     * <br>After the menu is frozen, it is an error to attempt to make any
     * <br>changes to it.  In effect this means that the &#35;GMenu API must no
     * <br>longer be used.
     * <br>
     * <br>This function causes g_menu_model_is_mutable() to begin returning
     * <br>%FALSE, which has some positive performance implications.
    */
    public void freeze()  {
        JnaMenu.INST().g_menu_freeze(asCPointer());
    }

    /**
     * Convenience function for inserting a normal menu item into &#64;menu.
     * <br>Combine g_menu_item_new() and g_menu_insert_item() for a more flexible
     * <br>alternative.
     * @param position the position at which to insert the item
     * @param label the section label, or %NULL
     * @param detailed_action the detailed action string, or %NULL
    */
    public void insert(int position, @Nullable ch.bailu.gtk.type.Str label, @Nullable ch.bailu.gtk.type.Str detailed_action)  {
        JnaMenu.INST().g_menu_insert(asCPointer(), position, asCPointer(label), asCPointer(detailed_action));
    }

    /**
     * Convenience function for inserting a normal menu item into &#64;menu.
     * <br>Combine g_menu_item_new() and g_menu_insert_item() for a more flexible
     * <br>alternative.
     * @param position the position at which to insert the item
     * @param label the section label, or %NULL
     * @param detailed_action the detailed action string, or %NULL
    */
    public void insert(int position, String label, String detailed_action)  {
        JnaMenu.INST().g_menu_insert(asCPointer(), position, label, detailed_action);
    }

    /**
     * Inserts &#64;item into &#64;menu.
     * <br>
     * <br>The &quot;insertion&quot; is actually done by copying all of the attribute and
     * <br>link values of &#64;item and using them to form a new item within &#64;menu.
     * <br>As such, &#64;item itself is not really inserted, but rather, a menu item
     * <br>that is exactly the same as the one presently described by &#64;item.
     * <br>
     * <br>This means that &#64;item is essentially useless after the insertion
     * <br>occurs.  Any changes you make to it are ignored unless it is inserted
     * <br>again (at which point its updated values will be copied).
     * <br>
     * <br>You should probably just free &#64;item once you're done.
     * <br>
     * <br>There are many convenience functions to take care of common cases.
     * <br>See g_menu_insert(), g_menu_insert_section() and
     * <br>g_menu_insert_submenu() as well as &quot;prepend&quot; and &quot;append&quot; variants of
     * <br>each of these functions.
     * @param position the position at which to insert the item
     * @param item the &#35;GMenuItem to insert
    */
    public void insertItem(int position, @Nonnull MenuItem item)  {
        JnaMenu.INST().g_menu_insert_item(asCPointer(), position, asCPointerNotNull(item));
    }

    /**
     * Convenience function for inserting a section menu item into &#64;menu.
     * <br>Combine g_menu_item_new_section() and g_menu_insert_item() for a more
     * <br>flexible alternative.
     * @param position the position at which to insert the item
     * @param label the section label, or %NULL
     * @param section a &#35;GMenuModel with the items of the section
    */
    public void insertSection(int position, @Nullable ch.bailu.gtk.type.Str label, @Nonnull MenuModel section)  {
        JnaMenu.INST().g_menu_insert_section(asCPointer(), position, asCPointer(label), asCPointerNotNull(section));
    }

    /**
     * Convenience function for inserting a section menu item into &#64;menu.
     * <br>Combine g_menu_item_new_section() and g_menu_insert_item() for a more
     * <br>flexible alternative.
     * @param position the position at which to insert the item
     * @param label the section label, or %NULL
     * @param section a &#35;GMenuModel with the items of the section
    */
    public void insertSection(int position, String label, @Nonnull MenuModel section)  {
        JnaMenu.INST().g_menu_insert_section(asCPointer(), position, label, asCPointerNotNull(section));
    }

    /**
     * Convenience function for inserting a submenu menu item into &#64;menu.
     * <br>Combine g_menu_item_new_submenu() and g_menu_insert_item() for a more
     * <br>flexible alternative.
     * @param position the position at which to insert the item
     * @param label the section label, or %NULL
     * @param submenu a &#35;GMenuModel with the items of the submenu
    */
    public void insertSubmenu(int position, @Nullable ch.bailu.gtk.type.Str label, @Nonnull MenuModel submenu)  {
        JnaMenu.INST().g_menu_insert_submenu(asCPointer(), position, asCPointer(label), asCPointerNotNull(submenu));
    }

    /**
     * Convenience function for inserting a submenu menu item into &#64;menu.
     * <br>Combine g_menu_item_new_submenu() and g_menu_insert_item() for a more
     * <br>flexible alternative.
     * @param position the position at which to insert the item
     * @param label the section label, or %NULL
     * @param submenu a &#35;GMenuModel with the items of the submenu
    */
    public void insertSubmenu(int position, String label, @Nonnull MenuModel submenu)  {
        JnaMenu.INST().g_menu_insert_submenu(asCPointer(), position, label, asCPointerNotNull(submenu));
    }

    /**
     * Convenience function for prepending a normal menu item to the start
     * <br>of &#64;menu.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * <br>flexible alternative.
     * @param label the section label, or %NULL
     * @param detailed_action the detailed action string, or %NULL
    */
    public void prepend(@Nullable ch.bailu.gtk.type.Str label, @Nullable ch.bailu.gtk.type.Str detailed_action)  {
        JnaMenu.INST().g_menu_prepend(asCPointer(), asCPointer(label), asCPointer(detailed_action));
    }

    /**
     * Convenience function for prepending a normal menu item to the start
     * <br>of &#64;menu.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * <br>flexible alternative.
     * @param label the section label, or %NULL
     * @param detailed_action the detailed action string, or %NULL
    */
    public void prepend(String label, String detailed_action)  {
        JnaMenu.INST().g_menu_prepend(asCPointer(), label, detailed_action);
    }

    /**
     * Prepends &#64;item to the start of &#64;menu.
     * <br>
     * <br>See g_menu_insert_item() for more information.
     * @param item a &#35;GMenuItem to prepend
    */
    public void prependItem(@Nonnull MenuItem item)  {
        JnaMenu.INST().g_menu_prepend_item(asCPointer(), asCPointerNotNull(item));
    }

    /**
     * Convenience function for prepending a section menu item to the start
     * <br>of &#64;menu.  Combine g_menu_item_new_section() and g_menu_insert_item() for
     * <br>a more flexible alternative.
     * @param label the section label, or %NULL
     * @param section a &#35;GMenuModel with the items of the section
    */
    public void prependSection(@Nullable ch.bailu.gtk.type.Str label, @Nonnull MenuModel section)  {
        JnaMenu.INST().g_menu_prepend_section(asCPointer(), asCPointer(label), asCPointerNotNull(section));
    }

    /**
     * Convenience function for prepending a section menu item to the start
     * <br>of &#64;menu.  Combine g_menu_item_new_section() and g_menu_insert_item() for
     * <br>a more flexible alternative.
     * @param label the section label, or %NULL
     * @param section a &#35;GMenuModel with the items of the section
    */
    public void prependSection(String label, @Nonnull MenuModel section)  {
        JnaMenu.INST().g_menu_prepend_section(asCPointer(), label, asCPointerNotNull(section));
    }

    /**
     * Convenience function for prepending a submenu menu item to the start
     * <br>of &#64;menu.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for
     * <br>a more flexible alternative.
     * @param label the section label, or %NULL
     * @param submenu a &#35;GMenuModel with the items of the submenu
    */
    public void prependSubmenu(@Nullable ch.bailu.gtk.type.Str label, @Nonnull MenuModel submenu)  {
        JnaMenu.INST().g_menu_prepend_submenu(asCPointer(), asCPointer(label), asCPointerNotNull(submenu));
    }

    /**
     * Convenience function for prepending a submenu menu item to the start
     * <br>of &#64;menu.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for
     * <br>a more flexible alternative.
     * @param label the section label, or %NULL
     * @param submenu a &#35;GMenuModel with the items of the submenu
    */
    public void prependSubmenu(String label, @Nonnull MenuModel submenu)  {
        JnaMenu.INST().g_menu_prepend_submenu(asCPointer(), label, asCPointerNotNull(submenu));
    }

    /**
     * Removes an item from the menu.
     * <br>
     * <br>&#64;position gives the index of the item to remove.
     * <br>
     * <br>It is an error if position is not in range the range from 0 to one
     * <br>less than the number of items in the menu.
     * <br>
     * <br>It is not possible to remove items by identity since items are added
     * <br>to the menu simply by copying their links and attributes (ie:
     * <br>identity of the item itself is not preserved).
     * @param position the position of the item to remove
    */
    public void remove(int position)  {
        JnaMenu.INST().g_menu_remove(asCPointer(), position);
    }

    /**
     * Removes all items in the menu.
    */
    public void removeAll()  {
        JnaMenu.INST().g_menu_remove_all(asCPointer());
    }

    public static long getTypeID() { 
        return JnaMenu.INST().g_menu_get_type(); 
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
