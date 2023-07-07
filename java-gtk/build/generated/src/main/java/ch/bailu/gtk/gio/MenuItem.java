/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GMenuItem is an opaque structure type.  You must access it using the
 * <br>functions below.
 * <p><a href="https://docs.gtk.org/gio/class.MenuItem.html">https://docs.gtk.org/gio/class.MenuItem.html</a></p>
*/
public class MenuItem extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MenuItem.class.getCanonicalName());
    }

    public MenuItem(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a &#35;GMenuItem as an exact copy of an existing menu item in a
     * <br>&#35;GMenuModel.
     * <br>
     * <br>&#64;item_index must be valid (ie: be sure to call
     * <br>g_menu_model_get_n_items() first).
     * @param model a &#35;GMenuModel
     * @param item_index the index of an item in &#64;model
     * @return a new &#35;GMenuItem.
    */
    public static MenuItem newFromModelMenuItem(@Nonnull MenuModel model, int item_index)  {
        PointerContainer __self = cast(JnaMenuItem.INST().g_menu_item_new_from_model(asCPointerNotNull(model), item_index));
        if (__self.isNull()) {
            throw new NullPointerException("MenuItem:newFromModel");
        }
        return new MenuItem(__self);
    }        
    

    /**
     * Creates a new &#35;GMenuItem representing a section.
     * <br>
     * <br>This is a convenience API around g_menu_item_new() and
     * <br>g_menu_item_set_section().
     * <br>
     * <br>The effect of having one menu appear as a section of another is
     * <br>exactly as it sounds: the items from &#64;section become a direct part of
     * <br>the menu that &#64;menu_item is added to.
     * <br>
     * <br>Visual separation is typically displayed between two non-empty
     * <br>sections.  If &#64;label is non-%NULL then it will be encorporated into
     * <br>this visual indication.  This allows for labeled subsections of a
     * <br>menu.
     * <br>
     * <br>As a simple example, consider a typical &quot;Edit&quot; menu from a simple
     * <br>program.  It probably contains an &quot;Undo&quot; and &quot;Redo&quot; item, followed by
     * <br>a separator, followed by &quot;Cut&quot;, &quot;Copy&quot; and &quot;Paste&quot;.
     * <br>
     * <br>This would be accomplished by creating three &#35;GMenu instances.  The
     * <br>first would be populated with the &quot;Undo&quot; and &quot;Redo&quot; items, and the
     * <br>second with the &quot;Cut&quot;, &quot;Copy&quot; and &quot;Paste&quot; items.  The first and
     * <br>second menus would then be added as submenus of the third.  In XML
     * <br>format, this would look something like the following:
     * <pre>
     * &lt;menu id='edit-menu'&gt;
     *   &lt;section&gt;
     *     &lt;item label='Undo'/&gt;
     *     &lt;item label='Redo'/&gt;
     *   &lt;/section&gt;
     *   &lt;section&gt;
     *     &lt;item label='Cut'/&gt;
     *     &lt;item label='Copy'/&gt;
     *     &lt;item label='Paste'/&gt;
     *   &lt;/section&gt;
     * &lt;/menu&gt;
     * </pre>
     * <br>
     * <br>The following example is exactly equivalent.  It is more illustrative
     * <br>of the exact relationship between the menus and items (keeping in
     * <br>mind that the 'link' element defines a new menu that is linked to the
     * <br>containing one).  The style of the second example is more verbose and
     * <br>difficult to read (and therefore not recommended except for the
     * <br>purpose of understanding what is really going on).
     * <pre>
     * &lt;menu id='edit-menu'&gt;
     *   &lt;item&gt;
     *     &lt;link name='section'&gt;
     *       &lt;item label='Undo'/&gt;
     *       &lt;item label='Redo'/&gt;
     *     &lt;/link&gt;
     *   &lt;/item&gt;
     *   &lt;item&gt;
     *     &lt;link name='section'&gt;
     *       &lt;item label='Cut'/&gt;
     *       &lt;item label='Copy'/&gt;
     *       &lt;item label='Paste'/&gt;
     *     &lt;/link&gt;
     *   &lt;/item&gt;
     * &lt;/menu&gt;
     * </pre>
     * @param label the section label, or %NULL
     * @param section a &#35;GMenuModel with the items of the section
     * @return a new &#35;GMenuItem
    */
    public static MenuItem newSectionMenuItem(@Nullable ch.bailu.gtk.type.Str label, @Nonnull MenuModel section)  {
        PointerContainer __self = cast(JnaMenuItem.INST().g_menu_item_new_section(asCPointer(label), asCPointerNotNull(section)));
        if (__self.isNull()) {
            throw new NullPointerException("MenuItem:newSection");
        }
        return new MenuItem(__self);
    }        
    

    /**
     * Creates a new &#35;GMenuItem representing a section.
     * <br>
     * <br>This is a convenience API around g_menu_item_new() and
     * <br>g_menu_item_set_section().
     * <br>
     * <br>The effect of having one menu appear as a section of another is
     * <br>exactly as it sounds: the items from &#64;section become a direct part of
     * <br>the menu that &#64;menu_item is added to.
     * <br>
     * <br>Visual separation is typically displayed between two non-empty
     * <br>sections.  If &#64;label is non-%NULL then it will be encorporated into
     * <br>this visual indication.  This allows for labeled subsections of a
     * <br>menu.
     * <br>
     * <br>As a simple example, consider a typical &quot;Edit&quot; menu from a simple
     * <br>program.  It probably contains an &quot;Undo&quot; and &quot;Redo&quot; item, followed by
     * <br>a separator, followed by &quot;Cut&quot;, &quot;Copy&quot; and &quot;Paste&quot;.
     * <br>
     * <br>This would be accomplished by creating three &#35;GMenu instances.  The
     * <br>first would be populated with the &quot;Undo&quot; and &quot;Redo&quot; items, and the
     * <br>second with the &quot;Cut&quot;, &quot;Copy&quot; and &quot;Paste&quot; items.  The first and
     * <br>second menus would then be added as submenus of the third.  In XML
     * <br>format, this would look something like the following:
     * <pre>
     * &lt;menu id='edit-menu'&gt;
     *   &lt;section&gt;
     *     &lt;item label='Undo'/&gt;
     *     &lt;item label='Redo'/&gt;
     *   &lt;/section&gt;
     *   &lt;section&gt;
     *     &lt;item label='Cut'/&gt;
     *     &lt;item label='Copy'/&gt;
     *     &lt;item label='Paste'/&gt;
     *   &lt;/section&gt;
     * &lt;/menu&gt;
     * </pre>
     * <br>
     * <br>The following example is exactly equivalent.  It is more illustrative
     * <br>of the exact relationship between the menus and items (keeping in
     * <br>mind that the 'link' element defines a new menu that is linked to the
     * <br>containing one).  The style of the second example is more verbose and
     * <br>difficult to read (and therefore not recommended except for the
     * <br>purpose of understanding what is really going on).
     * <pre>
     * &lt;menu id='edit-menu'&gt;
     *   &lt;item&gt;
     *     &lt;link name='section'&gt;
     *       &lt;item label='Undo'/&gt;
     *       &lt;item label='Redo'/&gt;
     *     &lt;/link&gt;
     *   &lt;/item&gt;
     *   &lt;item&gt;
     *     &lt;link name='section'&gt;
     *       &lt;item label='Cut'/&gt;
     *       &lt;item label='Copy'/&gt;
     *       &lt;item label='Paste'/&gt;
     *     &lt;/link&gt;
     *   &lt;/item&gt;
     * &lt;/menu&gt;
     * </pre>
     * @param label the section label, or %NULL
     * @param section a &#35;GMenuModel with the items of the section
     * @return a new &#35;GMenuItem
    */
    public static MenuItem newSectionMenuItem(String label, @Nonnull MenuModel section)  {
        PointerContainer __self = cast(JnaMenuItem.INST().g_menu_item_new_section(label, asCPointerNotNull(section)));
        if (__self.isNull()) {
            throw new NullPointerException("MenuItem:newSection");
        }
        return new MenuItem(__self);
    }        
    

    /**
     * Creates a new &#35;GMenuItem representing a submenu.
     * <br>
     * <br>This is a convenience API around g_menu_item_new() and
     * <br>g_menu_item_set_submenu().
     * @param label the section label, or %NULL
     * @param submenu a &#35;GMenuModel with the items of the submenu
     * @return a new &#35;GMenuItem
    */
    public static MenuItem newSubmenuMenuItem(@Nullable ch.bailu.gtk.type.Str label, @Nonnull MenuModel submenu)  {
        PointerContainer __self = cast(JnaMenuItem.INST().g_menu_item_new_submenu(asCPointer(label), asCPointerNotNull(submenu)));
        if (__self.isNull()) {
            throw new NullPointerException("MenuItem:newSubmenu");
        }
        return new MenuItem(__self);
    }        
    

    /**
     * Creates a new &#35;GMenuItem representing a submenu.
     * <br>
     * <br>This is a convenience API around g_menu_item_new() and
     * <br>g_menu_item_set_submenu().
     * @param label the section label, or %NULL
     * @param submenu a &#35;GMenuModel with the items of the submenu
     * @return a new &#35;GMenuItem
    */
    public static MenuItem newSubmenuMenuItem(String label, @Nonnull MenuModel submenu)  {
        PointerContainer __self = cast(JnaMenuItem.INST().g_menu_item_new_submenu(label, asCPointerNotNull(submenu)));
        if (__self.isNull()) {
            throw new NullPointerException("MenuItem:newSubmenu");
        }
        return new MenuItem(__self);
    }        
    

    /**
     * Creates a new &#35;GMenuItem.
     * <br>
     * <br>If &#64;label is non-%NULL it is used to set the &quot;label&quot; attribute of the
     * <br>new item.
     * <br>
     * <br>If &#64;detailed_action is non-%NULL it is used to set the &quot;action&quot; and
     * <br>possibly the &quot;target&quot; attribute of the new item.  See
     * <br>g_menu_item_set_detailed_action() for more information.
     * @param label the section label, or %NULL
     * @param detailed_action the detailed action string, or %NULL
    */
    public MenuItem(@Nullable ch.bailu.gtk.type.Str label, @Nullable ch.bailu.gtk.type.Str detailed_action) {
        super(cast(JnaMenuItem.INST().g_menu_item_new(asCPointer(label), asCPointer(detailed_action))));
    }

    /**
     * Creates a new &#35;GMenuItem.
     * <br>
     * <br>If &#64;label is non-%NULL it is used to set the &quot;label&quot; attribute of the
     * <br>new item.
     * <br>
     * <br>If &#64;detailed_action is non-%NULL it is used to set the &quot;action&quot; and
     * <br>possibly the &quot;target&quot; attribute of the new item.  See
     * <br>g_menu_item_set_detailed_action() for more information.
     * @param label the section label, or %NULL
     * @param detailed_action the detailed action string, or %NULL
    */
    public MenuItem(String label, String detailed_action) {
        super(cast(JnaMenuItem.INST().g_menu_item_new(label, detailed_action)));
    }

    /**
     * Queries the named &#64;attribute on &#64;menu_item.
     * <br>
     * <br>If the attribute exists and matches the &#35;GVariantType corresponding
     * <br>to &#64;format_string then &#64;format_string is used to deconstruct the
     * <br>value into the positional parameters and %TRUE is returned.
     * <br>
     * <br>If the attribute does not exist, or it does exist but has the wrong
     * <br>type, then the positional parameters are ignored and %FALSE is
     * <br>returned.
     * @param attribute the attribute name to query
     * @param format_string a &#35;GVariant format string
     * @param _elipse positional parameters, as per &#64;format_string
     * @return %TRUE if the named attribute was found with the expected     type
    */
    public boolean getAttribute(@Nonnull ch.bailu.gtk.type.Str attribute, @Nonnull ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        return JnaMenuItem.INST().g_menu_item_get_attribute(asCPointer(), asCPointerNotNull(attribute), asCPointerNotNull(format_string), _elipse);
    }

    /**
     * Queries the named &#64;attribute on &#64;menu_item.
     * <br>
     * <br>If the attribute exists and matches the &#35;GVariantType corresponding
     * <br>to &#64;format_string then &#64;format_string is used to deconstruct the
     * <br>value into the positional parameters and %TRUE is returned.
     * <br>
     * <br>If the attribute does not exist, or it does exist but has the wrong
     * <br>type, then the positional parameters are ignored and %FALSE is
     * <br>returned.
     * @param attribute the attribute name to query
     * @param format_string a &#35;GVariant format string
     * @param _elipse positional parameters, as per &#64;format_string
     * @return %TRUE if the named attribute was found with the expected     type
    */
    public boolean getAttribute(String attribute, String format_string, java.lang.Object... _elipse)  {
        return JnaMenuItem.INST().g_menu_item_get_attribute(asCPointer(), attribute, format_string, _elipse);
    }

    /**
     * Queries the named &#64;attribute on &#64;menu_item.
     * <br>
     * <br>If &#64;expected_type is specified and the attribute does not have this
     * <br>type, %NULL is returned.  %NULL is also returned if the attribute
     * <br>simply does not exist.
     * @param attribute the attribute name to query
     * @param expected_type the expected type of the attribute
     * @return the attribute value, or %NULL
    */
    public ch.bailu.gtk.glib.Variant getAttributeValue(@Nonnull ch.bailu.gtk.type.Str attribute, @Nullable ch.bailu.gtk.glib.VariantType expected_type)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaMenuItem.INST().g_menu_item_get_attribute_value(asCPointer(), asCPointerNotNull(attribute), asCPointer(expected_type))));
    }

    /**
     * Queries the named &#64;attribute on &#64;menu_item.
     * <br>
     * <br>If &#64;expected_type is specified and the attribute does not have this
     * <br>type, %NULL is returned.  %NULL is also returned if the attribute
     * <br>simply does not exist.
     * @param attribute the attribute name to query
     * @param expected_type the expected type of the attribute
     * @return the attribute value, or %NULL
    */
    public ch.bailu.gtk.glib.Variant getAttributeValue(String attribute, @Nullable ch.bailu.gtk.glib.VariantType expected_type)  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaMenuItem.INST().g_menu_item_get_attribute_value(asCPointer(), attribute, asCPointer(expected_type))));
    }

    /**
     * Queries the named &#64;link on &#64;menu_item.
     * @param link the link name to query
     * @return the link, or %NULL
    */
    public MenuModel getLink(@Nonnull ch.bailu.gtk.type.Str link)  {
        return new MenuModel(new PointerContainer(JnaMenuItem.INST().g_menu_item_get_link(asCPointer(), asCPointerNotNull(link))));
    }

    /**
     * Queries the named &#64;link on &#64;menu_item.
     * @param link the link name to query
     * @return the link, or %NULL
    */
    public MenuModel getLink(String link)  {
        return new MenuModel(new PointerContainer(JnaMenuItem.INST().g_menu_item_get_link(asCPointer(), link)));
    }

    /**
     * Sets or unsets the &quot;action&quot; and &quot;target&quot; attributes of &#64;menu_item.
     * <br>
     * <br>If &#64;action is %NULL then both the &quot;action&quot; and &quot;target&quot; attributes
     * <br>are unset (and &#64;format_string is ignored along with the positional
     * <br>parameters).
     * <br>
     * <br>If &#64;action is non-%NULL then the &quot;action&quot; attribute is set.
     * <br>&#64;format_string is then inspected.  If it is non-%NULL then the proper
     * <br>position parameters are collected to create a &#35;GVariant instance to
     * <br>use as the target value.  If it is %NULL then the positional
     * <br>parameters are ignored and the &quot;target&quot; attribute is unset.
     * <br>
     * <br>See also g_menu_item_set_action_and_target_value() for an equivalent
     * <br>call that directly accepts a &#35;GVariant.  See
     * <br>g_menu_item_set_detailed_action() for a more convenient version that
     * <br>works with string-typed targets.
     * <br>
     * <br>See also g_menu_item_set_action_and_target_value() for a
     * <br>description of the semantics of the action and target attributes.
     * @param action the name of the action for this item
     * @param format_string a GVariant format string
     * @param _elipse positional parameters, as per &#64;format_string
    */
    public void setActionAndTarget(@Nullable ch.bailu.gtk.type.Str action, @Nullable ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        JnaMenuItem.INST().g_menu_item_set_action_and_target(asCPointer(), asCPointer(action), asCPointer(format_string), _elipse);
    }

    /**
     * Sets or unsets the &quot;action&quot; and &quot;target&quot; attributes of &#64;menu_item.
     * <br>
     * <br>If &#64;action is %NULL then both the &quot;action&quot; and &quot;target&quot; attributes
     * <br>are unset (and &#64;format_string is ignored along with the positional
     * <br>parameters).
     * <br>
     * <br>If &#64;action is non-%NULL then the &quot;action&quot; attribute is set.
     * <br>&#64;format_string is then inspected.  If it is non-%NULL then the proper
     * <br>position parameters are collected to create a &#35;GVariant instance to
     * <br>use as the target value.  If it is %NULL then the positional
     * <br>parameters are ignored and the &quot;target&quot; attribute is unset.
     * <br>
     * <br>See also g_menu_item_set_action_and_target_value() for an equivalent
     * <br>call that directly accepts a &#35;GVariant.  See
     * <br>g_menu_item_set_detailed_action() for a more convenient version that
     * <br>works with string-typed targets.
     * <br>
     * <br>See also g_menu_item_set_action_and_target_value() for a
     * <br>description of the semantics of the action and target attributes.
     * @param action the name of the action for this item
     * @param format_string a GVariant format string
     * @param _elipse positional parameters, as per &#64;format_string
    */
    public void setActionAndTarget(String action, String format_string, java.lang.Object... _elipse)  {
        JnaMenuItem.INST().g_menu_item_set_action_and_target(asCPointer(), action, format_string, _elipse);
    }

    /**
     * Sets or unsets the &quot;action&quot; and &quot;target&quot; attributes of &#64;menu_item.
     * <br>
     * <br>If &#64;action is %NULL then both the &quot;action&quot; and &quot;target&quot; attributes
     * <br>are unset (and &#64;target_value is ignored).
     * <br>
     * <br>If &#64;action is non-%NULL then the &quot;action&quot; attribute is set.  The
     * <br>&quot;target&quot; attribute is then set to the value of &#64;target_value if it is
     * <br>non-%NULL or unset otherwise.
     * <br>
     * <br>Normal menu items (ie: not submenu, section or other custom item
     * <br>types) are expected to have the &quot;action&quot; attribute set to identify
     * <br>the action that they are associated with.  The state type of the
     * <br>action help to determine the disposition of the menu item.  See
     * <br>&#35;GAction and &#35;GActionGroup for an overview of actions.
     * <br>
     * <br>In general, clicking on the menu item will result in activation of
     * <br>the named action with the &quot;target&quot; attribute given as the parameter
     * <br>to the action invocation.  If the &quot;target&quot; attribute is not set then
     * <br>the action is invoked with no parameter.
     * <br>
     * <br>If the action has no state then the menu item is usually drawn as a
     * <br>plain menu item (ie: with no additional decoration).
     * <br>
     * <br>If the action has a boolean state then the menu item is usually drawn
     * <br>as a toggle menu item (ie: with a checkmark or equivalent
     * <br>indication).  The item should be marked as 'toggled' or 'checked'
     * <br>when the boolean state is %TRUE.
     * <br>
     * <br>If the action has a string state then the menu item is usually drawn
     * <br>as a radio menu item (ie: with a radio bullet or equivalent
     * <br>indication).  The item should be marked as 'selected' when the string
     * <br>state is equal to the value of the &#64;target property.
     * <br>
     * <br>See g_menu_item_set_action_and_target() or
     * <br>g_menu_item_set_detailed_action() for two equivalent calls that are
     * <br>probably more convenient for most uses.
     * @param action the name of the action for this item
     * @param target_value a &#35;GVariant to use as the action target
    */
    public void setActionAndTargetValue(@Nullable ch.bailu.gtk.type.Str action, @Nullable ch.bailu.gtk.glib.Variant target_value)  {
        JnaMenuItem.INST().g_menu_item_set_action_and_target_value(asCPointer(), asCPointer(action), asCPointer(target_value));
    }

    /**
     * Sets or unsets the &quot;action&quot; and &quot;target&quot; attributes of &#64;menu_item.
     * <br>
     * <br>If &#64;action is %NULL then both the &quot;action&quot; and &quot;target&quot; attributes
     * <br>are unset (and &#64;target_value is ignored).
     * <br>
     * <br>If &#64;action is non-%NULL then the &quot;action&quot; attribute is set.  The
     * <br>&quot;target&quot; attribute is then set to the value of &#64;target_value if it is
     * <br>non-%NULL or unset otherwise.
     * <br>
     * <br>Normal menu items (ie: not submenu, section or other custom item
     * <br>types) are expected to have the &quot;action&quot; attribute set to identify
     * <br>the action that they are associated with.  The state type of the
     * <br>action help to determine the disposition of the menu item.  See
     * <br>&#35;GAction and &#35;GActionGroup for an overview of actions.
     * <br>
     * <br>In general, clicking on the menu item will result in activation of
     * <br>the named action with the &quot;target&quot; attribute given as the parameter
     * <br>to the action invocation.  If the &quot;target&quot; attribute is not set then
     * <br>the action is invoked with no parameter.
     * <br>
     * <br>If the action has no state then the menu item is usually drawn as a
     * <br>plain menu item (ie: with no additional decoration).
     * <br>
     * <br>If the action has a boolean state then the menu item is usually drawn
     * <br>as a toggle menu item (ie: with a checkmark or equivalent
     * <br>indication).  The item should be marked as 'toggled' or 'checked'
     * <br>when the boolean state is %TRUE.
     * <br>
     * <br>If the action has a string state then the menu item is usually drawn
     * <br>as a radio menu item (ie: with a radio bullet or equivalent
     * <br>indication).  The item should be marked as 'selected' when the string
     * <br>state is equal to the value of the &#64;target property.
     * <br>
     * <br>See g_menu_item_set_action_and_target() or
     * <br>g_menu_item_set_detailed_action() for two equivalent calls that are
     * <br>probably more convenient for most uses.
     * @param action the name of the action for this item
     * @param target_value a &#35;GVariant to use as the action target
    */
    public void setActionAndTargetValue(String action, @Nullable ch.bailu.gtk.glib.Variant target_value)  {
        JnaMenuItem.INST().g_menu_item_set_action_and_target_value(asCPointer(), action, asCPointer(target_value));
    }

    /**
     * Sets or unsets an attribute on &#64;menu_item.
     * <br>
     * <br>The attribute to set or unset is specified by &#64;attribute. This
     * <br>can be one of the standard attribute names %G_MENU_ATTRIBUTE_LABEL,
     * <br>%G_MENU_ATTRIBUTE_ACTION, %G_MENU_ATTRIBUTE_TARGET, or a custom
     * <br>attribute name.
     * <br>Attribute names are restricted to lowercase characters, numbers
     * <br>and '-'. Furthermore, the names must begin with a lowercase character,
     * <br>must not end with a '-', and must not contain consecutive dashes.
     * <br>
     * <br>If &#64;format_string is non-%NULL then the proper position parameters
     * <br>are collected to create a &#35;GVariant instance to use as the attribute
     * <br>value.  If it is %NULL then the positional parameterrs are ignored
     * <br>and the named attribute is unset.
     * <br>
     * <br>See also g_menu_item_set_attribute_value() for an equivalent call
     * <br>that directly accepts a &#35;GVariant.
     * @param attribute the attribute to set
     * @param format_string a &#35;GVariant format string, or %NULL
     * @param _elipse positional parameters, as per &#64;format_string
    */
    public void setAttribute(@Nonnull ch.bailu.gtk.type.Str attribute, @Nullable ch.bailu.gtk.type.Str format_string, java.lang.Object... _elipse)  {
        JnaMenuItem.INST().g_menu_item_set_attribute(asCPointer(), asCPointerNotNull(attribute), asCPointer(format_string), _elipse);
    }

    /**
     * Sets or unsets an attribute on &#64;menu_item.
     * <br>
     * <br>The attribute to set or unset is specified by &#64;attribute. This
     * <br>can be one of the standard attribute names %G_MENU_ATTRIBUTE_LABEL,
     * <br>%G_MENU_ATTRIBUTE_ACTION, %G_MENU_ATTRIBUTE_TARGET, or a custom
     * <br>attribute name.
     * <br>Attribute names are restricted to lowercase characters, numbers
     * <br>and '-'. Furthermore, the names must begin with a lowercase character,
     * <br>must not end with a '-', and must not contain consecutive dashes.
     * <br>
     * <br>If &#64;format_string is non-%NULL then the proper position parameters
     * <br>are collected to create a &#35;GVariant instance to use as the attribute
     * <br>value.  If it is %NULL then the positional parameterrs are ignored
     * <br>and the named attribute is unset.
     * <br>
     * <br>See also g_menu_item_set_attribute_value() for an equivalent call
     * <br>that directly accepts a &#35;GVariant.
     * @param attribute the attribute to set
     * @param format_string a &#35;GVariant format string, or %NULL
     * @param _elipse positional parameters, as per &#64;format_string
    */
    public void setAttribute(String attribute, String format_string, java.lang.Object... _elipse)  {
        JnaMenuItem.INST().g_menu_item_set_attribute(asCPointer(), attribute, format_string, _elipse);
    }

    /**
     * Sets or unsets an attribute on &#64;menu_item.
     * <br>
     * <br>The attribute to set or unset is specified by &#64;attribute. This
     * <br>can be one of the standard attribute names %G_MENU_ATTRIBUTE_LABEL,
     * <br>%G_MENU_ATTRIBUTE_ACTION, %G_MENU_ATTRIBUTE_TARGET, or a custom
     * <br>attribute name.
     * <br>Attribute names are restricted to lowercase characters, numbers
     * <br>and '-'. Furthermore, the names must begin with a lowercase character,
     * <br>must not end with a '-', and must not contain consecutive dashes.
     * <br>
     * <br>must consist only of lowercase
     * <br>ASCII characters, digits and '-'.
     * <br>
     * <br>If &#64;value is non-%NULL then it is used as the new value for the
     * <br>attribute.  If &#64;value is %NULL then the attribute is unset. If
     * <br>the &#64;value &#35;GVariant is floating, it is consumed.
     * <br>
     * <br>See also g_menu_item_set_attribute() for a more convenient way to do
     * <br>the same.
     * @param attribute the attribute to set
     * @param value a &#35;GVariant to use as the value, or %NULL
    */
    public void setAttributeValue(@Nonnull ch.bailu.gtk.type.Str attribute, @Nullable ch.bailu.gtk.glib.Variant value)  {
        JnaMenuItem.INST().g_menu_item_set_attribute_value(asCPointer(), asCPointerNotNull(attribute), asCPointer(value));
    }

    /**
     * Sets or unsets an attribute on &#64;menu_item.
     * <br>
     * <br>The attribute to set or unset is specified by &#64;attribute. This
     * <br>can be one of the standard attribute names %G_MENU_ATTRIBUTE_LABEL,
     * <br>%G_MENU_ATTRIBUTE_ACTION, %G_MENU_ATTRIBUTE_TARGET, or a custom
     * <br>attribute name.
     * <br>Attribute names are restricted to lowercase characters, numbers
     * <br>and '-'. Furthermore, the names must begin with a lowercase character,
     * <br>must not end with a '-', and must not contain consecutive dashes.
     * <br>
     * <br>must consist only of lowercase
     * <br>ASCII characters, digits and '-'.
     * <br>
     * <br>If &#64;value is non-%NULL then it is used as the new value for the
     * <br>attribute.  If &#64;value is %NULL then the attribute is unset. If
     * <br>the &#64;value &#35;GVariant is floating, it is consumed.
     * <br>
     * <br>See also g_menu_item_set_attribute() for a more convenient way to do
     * <br>the same.
     * @param attribute the attribute to set
     * @param value a &#35;GVariant to use as the value, or %NULL
    */
    public void setAttributeValue(String attribute, @Nullable ch.bailu.gtk.glib.Variant value)  {
        JnaMenuItem.INST().g_menu_item_set_attribute_value(asCPointer(), attribute, asCPointer(value));
    }

    /**
     * Sets the &quot;action&quot; and possibly the &quot;target&quot; attribute of &#64;menu_item.
     * <br>
     * <br>The format of &#64;detailed_action is the same format parsed by
     * <br>g_action_parse_detailed_name().
     * <br>
     * <br>See g_menu_item_set_action_and_target() or
     * <br>g_menu_item_set_action_and_target_value() for more flexible (but
     * <br>slightly less convenient) alternatives.
     * <br>
     * <br>See also g_menu_item_set_action_and_target_value() for a description of
     * <br>the semantics of the action and target attributes.
     * @param detailed_action the &quot;detailed&quot; action string
    */
    public void setDetailedAction(@Nonnull ch.bailu.gtk.type.Str detailed_action)  {
        JnaMenuItem.INST().g_menu_item_set_detailed_action(asCPointer(), asCPointerNotNull(detailed_action));
    }

    /**
     * Sets the &quot;action&quot; and possibly the &quot;target&quot; attribute of &#64;menu_item.
     * <br>
     * <br>The format of &#64;detailed_action is the same format parsed by
     * <br>g_action_parse_detailed_name().
     * <br>
     * <br>See g_menu_item_set_action_and_target() or
     * <br>g_menu_item_set_action_and_target_value() for more flexible (but
     * <br>slightly less convenient) alternatives.
     * <br>
     * <br>See also g_menu_item_set_action_and_target_value() for a description of
     * <br>the semantics of the action and target attributes.
     * @param detailed_action the &quot;detailed&quot; action string
    */
    public void setDetailedAction(String detailed_action)  {
        JnaMenuItem.INST().g_menu_item_set_detailed_action(asCPointer(), detailed_action);
    }

    /**
     * Sets (or unsets) the icon on &#64;menu_item.
     * <br>
     * <br>This call is the same as calling g_icon_serialize() and using the
     * <br>result as the value to g_menu_item_set_attribute_value() for
     * <br>%G_MENU_ATTRIBUTE_ICON.
     * <br>
     * <br>This API is only intended for use with &quot;noun&quot; menu items; things like
     * <br>bookmarks or applications in an &quot;Open With&quot; menu.  Don't use it on
     * <br>menu items corresponding to verbs (eg: stock icons for 'Save' or
     * <br>'Quit').
     * <br>
     * <br>If &#64;icon is %NULL then the icon is unset.
     * @param icon a &#35;GIcon, or %NULL
    */
    public void setIcon(@Nonnull Icon icon)  {
        JnaMenuItem.INST().g_menu_item_set_icon(asCPointer(), asCPointerNotNull(icon));
    }

    /**
     * Sets or unsets the &quot;label&quot; attribute of &#64;menu_item.
     * <br>
     * <br>If &#64;label is non-%NULL it is used as the label for the menu item.  If
     * <br>it is %NULL then the label attribute is unset.
     * @param label the label to set, or %NULL to unset
    */
    public void setLabel(@Nullable ch.bailu.gtk.type.Str label)  {
        JnaMenuItem.INST().g_menu_item_set_label(asCPointer(), asCPointer(label));
    }

    /**
     * Sets or unsets the &quot;label&quot; attribute of &#64;menu_item.
     * <br>
     * <br>If &#64;label is non-%NULL it is used as the label for the menu item.  If
     * <br>it is %NULL then the label attribute is unset.
     * @param label the label to set, or %NULL to unset
    */
    public void setLabel(String label)  {
        JnaMenuItem.INST().g_menu_item_set_label(asCPointer(), label);
    }

    /**
     * Creates a link from &#64;menu_item to &#64;model if non-%NULL, or unsets it.
     * <br>
     * <br>Links are used to establish a relationship between a particular menu
     * <br>item and another menu.  For example, %G_MENU_LINK_SUBMENU is used to
     * <br>associate a submenu with a particular menu item, and %G_MENU_LINK_SECTION
     * <br>is used to create a section. Other types of link can be used, but there
     * <br>is no guarantee that clients will be able to make sense of them.
     * <br>Link types are restricted to lowercase characters, numbers
     * <br>and '-'. Furthermore, the names must begin with a lowercase character,
     * <br>must not end with a '-', and must not contain consecutive dashes.
     * @param link type of link to establish or unset
     * @param model the &#35;GMenuModel to link to (or %NULL to unset)
    */
    public void setLink(@Nonnull ch.bailu.gtk.type.Str link, @Nullable MenuModel model)  {
        JnaMenuItem.INST().g_menu_item_set_link(asCPointer(), asCPointerNotNull(link), asCPointer(model));
    }

    /**
     * Creates a link from &#64;menu_item to &#64;model if non-%NULL, or unsets it.
     * <br>
     * <br>Links are used to establish a relationship between a particular menu
     * <br>item and another menu.  For example, %G_MENU_LINK_SUBMENU is used to
     * <br>associate a submenu with a particular menu item, and %G_MENU_LINK_SECTION
     * <br>is used to create a section. Other types of link can be used, but there
     * <br>is no guarantee that clients will be able to make sense of them.
     * <br>Link types are restricted to lowercase characters, numbers
     * <br>and '-'. Furthermore, the names must begin with a lowercase character,
     * <br>must not end with a '-', and must not contain consecutive dashes.
     * @param link type of link to establish or unset
     * @param model the &#35;GMenuModel to link to (or %NULL to unset)
    */
    public void setLink(String link, @Nullable MenuModel model)  {
        JnaMenuItem.INST().g_menu_item_set_link(asCPointer(), link, asCPointer(model));
    }

    /**
     * Sets or unsets the &quot;section&quot; link of &#64;menu_item to &#64;section.
     * <br>
     * <br>The effect of having one menu appear as a section of another is
     * <br>exactly as it sounds: the items from &#64;section become a direct part of
     * <br>the menu that &#64;menu_item is added to.  See g_menu_item_new_section()
     * <br>for more information about what it means for a menu item to be a
     * <br>section.
     * @param section a &#35;GMenuModel, or %NULL
    */
    public void setSection(@Nullable MenuModel section)  {
        JnaMenuItem.INST().g_menu_item_set_section(asCPointer(), asCPointer(section));
    }

    /**
     * Sets or unsets the &quot;submenu&quot; link of &#64;menu_item to &#64;submenu.
     * <br>
     * <br>If &#64;submenu is non-%NULL, it is linked to.  If it is %NULL then the
     * <br>link is unset.
     * <br>
     * <br>The effect of having one menu appear as a submenu of another is
     * <br>exactly as it sounds.
     * @param submenu a &#35;GMenuModel, or %NULL
    */
    public void setSubmenu(@Nullable MenuModel submenu)  {
        JnaMenuItem.INST().g_menu_item_set_submenu(asCPointer(), asCPointer(submenu));
    }

    public static long getTypeID() { 
        return JnaMenuItem.INST().g_menu_item_get_type(); 
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
