/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GMenuModel represents the contents of a menu -- an ordered list of
 * <br>menu items. The items are associated with actions, which can be
 * <br>activated through them. Items can be grouped in sections, and may
 * <br>have submenus associated with them. Both items and sections usually
 * <br>have some representation data, such as labels or icons. The type of
 * <br>the associated action (ie whether it is stateful, and what kind of
 * <br>state it has) can influence the representation of the item.
 * <br>
 * <br>The conceptual model of menus in &#35;GMenuModel is hierarchical:
 * <br>sections and submenus are again represented by &#35;GMenuModels.
 * <br>Menus themselves do not define their own roles. Rather, the role
 * <br>of a particular &#35;GMenuModel is defined by the item that references
 * <br>it (or, in the case of the 'root' menu, is defined by the context
 * <br>in which it is used).
 * <br>
 * <br>As an example, consider the visible portions of this menu:
 * <br>
 * <br>&#35;&#35; An example menu &#35; {&#35;menu-example}
 * <br>
 * <br>![](menu-example.png)
 * <br>
 * <br>There are 8 &quot;menus&quot; visible in the screenshot: one menubar, two
 * <br>submenus and 5 sections:
 * <br>
 * <br>- the toplevel menubar (containing 4 items)
 * <br>- the View submenu (containing 3 sections)
 * <br>- the first section of the View submenu (containing 2 items)
 * <br>- the second section of the View submenu (containing 1 item)
 * <br>- the final section of the View submenu (containing 1 item)
 * <br>- the Highlight Mode submenu (containing 2 sections)
 * <br>- the Sources section (containing 2 items)
 * <br>- the Markup section (containing 2 items)
 * <br>
 * <br>The [example][menu-model] illustrates the conceptual connection between
 * <br>these 8 menus. Each large block in the figure represents a menu and the
 * <br>smaller blocks within the large block represent items in that menu. Some
 * <br>items contain references to other menus.
 * <br>
 * <br>&#35;&#35; A menu example &#35; {&#35;menu-model}
 * <br>
 * <br>![](menu-model.png)
 * <br>
 * <br>Notice that the separators visible in the [example][menu-example]
 * <br>appear nowhere in the [menu model][menu-model]. This is because
 * <br>separators are not explicitly represented in the menu model. Instead,
 * <br>a separator is inserted between any two non-empty sections of a menu.
 * <br>Section items can have labels just like any other item. In that case,
 * <br>a display system may show a section header instead of a separator.
 * <br>
 * <br>The motivation for this abstract model of application controls is
 * <br>that modern user interfaces tend to make these controls available
 * <br>outside the application. Examples include global menus, jumplists,
 * <br>dash boards, etc. To support such uses, it is necessary to 'export'
 * <br>information about actions and their representation in menus, which
 * <br>is exactly what the [GActionGroup exporter][gio-GActionGroup-exporter]
 * <br>and the [GMenuModel exporter][gio-GMenuModel-exporter] do for
 * <br>&#35;GActionGroup and &#35;GMenuModel. The client-side counterparts to
 * <br>make use of the exported information are &#35;GDBusActionGroup and
 * <br>&#35;GDBusMenuModel.
 * <br>
 * <br>The API of &#35;GMenuModel is very generic, with iterators for the
 * <br>attributes and links of an item, see g_menu_model_iterate_item_attributes()
 * <br>and g_menu_model_iterate_item_links(). The 'standard' attributes and
 * <br>link types have predefined names: %G_MENU_ATTRIBUTE_LABEL,
 * <br>%G_MENU_ATTRIBUTE_ACTION, %G_MENU_ATTRIBUTE_TARGET, %G_MENU_LINK_SECTION
 * <br>and %G_MENU_LINK_SUBMENU.
 * <br>
 * <br>Items in a &#35;GMenuModel represent active controls if they refer to
 * <br>an action that can get activated when the user interacts with the
 * <br>menu item. The reference to the action is encoded by the string id
 * <br>in the %G_MENU_ATTRIBUTE_ACTION attribute. An action id uniquely
 * <br>identifies an action in an action group. Which action group(s) provide
 * <br>actions depends on the context in which the menu model is used.
 * <br>E.g. when the model is exported as the application menu of a
 * <br>&#35;GtkApplication, actions can be application-wide or window-specific
 * <br>(and thus come from two different action groups). By convention, the
 * <br>application-wide actions have names that start with &quot;app.&quot;, while the
 * <br>names of window-specific actions start with &quot;win.&quot;.
 * <br>
 * <br>While a wide variety of stateful actions is possible, the following
 * <br>is the minimum that is expected to be supported by all users of exported
 * <br>menu information:
 * <br>- an action with no parameter type and no state
 * <br>- an action with no parameter type and boolean state
 * <br>- an action with string parameter type and string state
 * <br>
 * <br>&#35;&#35; Stateless
 * <br>
 * <br>A stateless action typically corresponds to an ordinary menu item.
 * <br>
 * <br>Selecting such a menu item will activate the action (with no parameter).
 * <br>
 * <br>&#35;&#35; Boolean State
 * <br>
 * <br>An action with a boolean state will most typically be used with a &quot;toggle&quot;
 * <br>or &quot;switch&quot; menu item. The state can be set directly, but activating the
 * <br>action (with no parameter) results in the state being toggled.
 * <br>
 * <br>Selecting a toggle menu item will activate the action. The menu item should
 * <br>be rendered as &quot;checked&quot; when the state is true.
 * <br>
 * <br>&#35;&#35; String Parameter and State
 * <br>
 * <br>Actions with string parameters and state will most typically be used to
 * <br>represent an enumerated choice over the items available for a group of
 * <br>radio menu items. Activating the action with a string parameter is
 * <br>equivalent to setting that parameter as the state.
 * <br>
 * <br>Radio menu items, in addition to being associated with the action, will
 * <br>have a target value. Selecting that menu item will result in activation
 * <br>of the action with the target value as the parameter. The menu item should
 * <br>be rendered as &quot;selected&quot; when the state of the action is equal to the
 * <br>target value of the menu item.
 * <p><a href="https://docs.gtk.org/gio/class.MenuModel.html">https://docs.gtk.org/gio/class.MenuModel.html</a></p>
*/
public class MenuModel extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MenuModel.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnItemsChanged {
        /**
         * Emitted when a change has occurred to the menu.
         * <br>
         * <br>The only changes that can occur to a menu is that items are removed
         * <br>or added.  Items may not change (except by being removed and added
         * <br>back in the same location).  This signal is capable of describing
         * <br>both of those changes (at the same time).
         * <br>
         * <br>The signal means that starting at the index &#64;position, &#64;removed
         * <br>items were removed and &#64;added items were added in their place.  If
         * <br>&#64;removed is zero then only items were added.  If &#64;added is zero
         * <br>then only items were removed.
         * <br>
         * <br>As an example, if the menu contains items a, b, c, d (in that
         * <br>order) and the signal (2, 1, 3) occurs then the new composition of
         * <br>the menu will be a, b, _, _, _, d (with each _ representing some
         * <br>new item).
         * <br>
         * <br>Signal handlers may query the model (particularly the added items)
         * <br>and expect to see the results of the modification that is being
         * <br>reported.  The signal is emitted after the modification.
         * @param position the position of the change
         * @param removed the number of items removed
         * @param added the number of items added
        */
        void onItemsChanged(int position, int removed, int added);
    }
    
    private static com.sun.jna.Callback toOnItemsChanged(OnItemsChanged in) {
        return (in == null) ? null: (JnaMenuModel.OnItemsChanged) (__self, _position, _removed, _added, __data) -> in.onItemsChanged(_position, _removed, _added);
    }

    public MenuModel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Queries item at position &#64;item_index in &#64;model for the attribute
     * <br>specified by &#64;attribute.
     * <br>
     * <br>If the attribute exists and matches the &#35;GVariantType corresponding
     * <br>to &#64;format_string then &#64;format_string is used to deconstruct the
     * <br>value into the positional parameters and %TRUE is returned.
     * <br>
     * <br>If the attribute does not exist, or it does exist but has the wrong
     * <br>type, then the positional parameters are ignored and %FALSE is
     * <br>returned.
     * <br>
     * <br>This function is a mix of g_menu_model_get_item_attribute_value() and
     * <br>g_variant_get(), followed by a g_variant_unref().  As such,
     * <br>&#64;format_string must make a complete copy of the data (since the
     * <br>&#35;GVariant may go away after the call to g_variant_unref()).  In
     * <br>particular, no '&amp;' characters are allowed in &#64;format_string.
     * @param item_index the index of the item
     * @param attribute the attribute to query
     * @param format_string a &#35;GVariant format string
     * @param _elipse positional parameters, as per &#64;format_string
     * @return %TRUE if the named attribute was found with the expected     type
    */
    public boolean getItemAttribute(int item_index, @Nonnull ch.bailu.gtk.type.Str attribute, @Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        return JnaMenuModel.INST().g_menu_model_get_item_attribute(asCPointer(), item_index, asCPointerNotNull(attribute), asCPointerNotNull(format_string), _elipse);
    }

    /**
     * Queries item at position &#64;item_index in &#64;model for the attribute
     * <br>specified by &#64;attribute.
     * <br>
     * <br>If the attribute exists and matches the &#35;GVariantType corresponding
     * <br>to &#64;format_string then &#64;format_string is used to deconstruct the
     * <br>value into the positional parameters and %TRUE is returned.
     * <br>
     * <br>If the attribute does not exist, or it does exist but has the wrong
     * <br>type, then the positional parameters are ignored and %FALSE is
     * <br>returned.
     * <br>
     * <br>This function is a mix of g_menu_model_get_item_attribute_value() and
     * <br>g_variant_get(), followed by a g_variant_unref().  As such,
     * <br>&#64;format_string must make a complete copy of the data (since the
     * <br>&#35;GVariant may go away after the call to g_variant_unref()).  In
     * <br>particular, no '&amp;' characters are allowed in &#64;format_string.
     * @param item_index the index of the item
     * @param attribute the attribute to query
     * @param format_string a &#35;GVariant format string
     * @param _elipse positional parameters, as per &#64;format_string
     * @return %TRUE if the named attribute was found with the expected     type
    */
    public boolean getItemAttribute(int item_index, String attribute, String format_string, java.lang.Object... _elipse)  {
        return JnaMenuModel.INST().g_menu_model_get_item_attribute(asCPointer(), item_index, attribute, format_string, _elipse);
    }

    /**
     * Queries the item at position &#64;item_index in &#64;model for the attribute
     * <br>specified by &#64;attribute.
     * <br>
     * <br>If &#64;expected_type is non-%NULL then it specifies the expected type of
     * <br>the attribute.  If it is %NULL then any type will be accepted.
     * <br>
     * <br>If the attribute exists and matches &#64;expected_type (or if the
     * <br>expected type is unspecified) then the value is returned.
     * <br>
     * <br>If the attribute does not exist, or does not match the expected type
     * <br>then %NULL is returned.
     * @param item_index the index of the item
     * @param attribute the attribute to query
     * @param expected_type the expected type of the attribute, or     %NULL
     * @return the value of the attribute
    */
    public ch.bailu.gtk.glib.Variant getItemAttributeValue(int item_index, @Nonnull ch.bailu.gtk.type.Str attribute, @Nullable ch.bailu.gtk.glib.VariantType expected_type)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaMenuModel.INST().g_menu_model_get_item_attribute_value(asCPointer(), item_index, asCPointerNotNull(attribute), asCPointer(expected_type))));
    }

    /**
     * Queries the item at position &#64;item_index in &#64;model for the attribute
     * <br>specified by &#64;attribute.
     * <br>
     * <br>If &#64;expected_type is non-%NULL then it specifies the expected type of
     * <br>the attribute.  If it is %NULL then any type will be accepted.
     * <br>
     * <br>If the attribute exists and matches &#64;expected_type (or if the
     * <br>expected type is unspecified) then the value is returned.
     * <br>
     * <br>If the attribute does not exist, or does not match the expected type
     * <br>then %NULL is returned.
     * @param item_index the index of the item
     * @param attribute the attribute to query
     * @param expected_type the expected type of the attribute, or     %NULL
     * @return the value of the attribute
    */
    public ch.bailu.gtk.glib.Variant getItemAttributeValue(int item_index, String attribute, @Nullable ch.bailu.gtk.glib.VariantType expected_type)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaMenuModel.INST().g_menu_model_get_item_attribute_value(asCPointer(), item_index, attribute, asCPointer(expected_type))));
    }

    /**
     * Queries the item at position &#64;item_index in &#64;model for the link
     * <br>specified by &#64;link.
     * <br>
     * <br>If the link exists, the linked &#35;GMenuModel is returned.  If the link
     * <br>does not exist, %NULL is returned.
     * @param item_index the index of the item
     * @param link the link to query
     * @return the linked &#35;GMenuModel, or %NULL
    */
    public MenuModel getItemLink(int item_index, @Nonnull ch.bailu.gtk.type.Str link)  {
        return new MenuModel(new PointerContainer(JnaMenuModel.INST().g_menu_model_get_item_link(asCPointer(), item_index, asCPointerNotNull(link))));
    }

    /**
     * Queries the item at position &#64;item_index in &#64;model for the link
     * <br>specified by &#64;link.
     * <br>
     * <br>If the link exists, the linked &#35;GMenuModel is returned.  If the link
     * <br>does not exist, %NULL is returned.
     * @param item_index the index of the item
     * @param link the link to query
     * @return the linked &#35;GMenuModel, or %NULL
    */
    public MenuModel getItemLink(int item_index, String link)  {
        return new MenuModel(new PointerContainer(JnaMenuModel.INST().g_menu_model_get_item_link(asCPointer(), item_index, link)));
    }

    /**
     * Query the number of items in &#64;model.
     * @return the number of items
    */
    public int getNItems()  {
        return JnaMenuModel.INST().g_menu_model_get_n_items(asCPointer());
    }

    /**
     * Queries if &#64;model is mutable.
     * <br>
     * <br>An immutable &#35;GMenuModel will never emit the &#35;GMenuModel::items-changed
     * <br>signal. Consumers of the model may make optimisations accordingly.
     * @return %TRUE if the model is mutable (ie: &quot;items-changed&quot; may be     emitted).
    */
    public boolean isMutable()  {
        return JnaMenuModel.INST().g_menu_model_is_mutable(asCPointer());
    }

    /**
     * Requests emission of the &#35;GMenuModel::items-changed signal on &#64;model.
     * <br>
     * <br>This function should never be called except by &#35;GMenuModel
     * <br>subclasses.  Any other calls to this function will very likely lead
     * <br>to a violation of the interface of the model.
     * <br>
     * <br>The implementation should update its internal representation of the
     * <br>menu before emitting the signal.  The implementation should further
     * <br>expect to receive queries about the new state of the menu (and
     * <br>particularly added menu items) while signal handlers are running.
     * <br>
     * <br>The implementation must dispatch this call directly from a mainloop
     * <br>entry and not in response to calls -- particularly those from the
     * <br>&#35;GMenuModel API.  Said another way: the menu must not change while
     * <br>user code is running without returning to the mainloop.
     * @param position the position of the change
     * @param removed the number of items removed
     * @param added the number of items added
    */
    public void itemsChanged(int position, int removed, int added)  {
        JnaMenuModel.INST().g_menu_model_items_changed(asCPointer(), position, removed, added);
    }

    /**
     * Creates a &#35;GMenuAttributeIter to iterate over the attributes of
     * <br>the item at position &#64;item_index in &#64;model.
     * <br>
     * <br>You must free the iterator with g_object_unref() when you are done.
     * @param item_index the index of the item
     * @return a new &#35;GMenuAttributeIter
    */
    public MenuAttributeIter iterateItemAttributes(int item_index)  {
        return new MenuAttributeIter(new PointerContainer(JnaMenuModel.INST().g_menu_model_iterate_item_attributes(asCPointer(), item_index)));
    }

    /**
     * Creates a &#35;GMenuLinkIter to iterate over the links of the item at
     * <br>position &#64;item_index in &#64;model.
     * <br>
     * <br>You must free the iterator with g_object_unref() when you are done.
     * @param item_index the index of the item
     * @return a new &#35;GMenuLinkIter
    */
    public MenuLinkIter iterateItemLinks(int item_index)  {
        return new MenuLinkIter(new PointerContainer(JnaMenuModel.INST().g_menu_model_iterate_item_links(asCPointer(), item_index)));
    }

    public final static String SIGNAL_ON_ITEMS_CHANGED = "items-changed";
    
    /**
     * Connect to signal "items-changed".
     * <br>See {@link OnItemsChanged#onItemsChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_ITEMS_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onItemsChanged(OnItemsChanged signal) {
        return connectSignal(SIGNAL_ON_ITEMS_CHANGED, toOnItemsChanged(signal));
    }

    public static long getTypeID() { 
        return JnaMenuModel.INST().g_menu_model_get_type(); 
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
