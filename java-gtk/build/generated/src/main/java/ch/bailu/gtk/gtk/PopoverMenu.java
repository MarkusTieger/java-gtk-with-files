/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkPopoverMenu` is a subclass of `GtkPopover` that implements menu
 * <br>behavior.
 * <br>
 * <br>![An example GtkPopoverMenu](menu.png)
 * <br>
 * <br>`GtkPopoverMenu` treats its children like menus and allows switching
 * <br>between them. It can open submenus as traditional, nested submenus,
 * <br>or in a more touch-friendly sliding fashion.
 * <br>
 * <br>`GtkPopoverMenu` is meant to be used primarily with menu models,
 * <br>using [ctor&#64;Gtk.PopoverMenu.new_from_model]. If you need to put
 * <br>other widgets such as a `GtkSpinButton` or a `GtkSwitch` into a popover,
 * <br>you can use [method&#64;Gtk.PopoverMenu.add_child].
 * <br>
 * <br>For more dialog-like behavior, use a plain `GtkPopover`.
 * <br>
 * <br>&#35;&#35; Menu models
 * <br>
 * <br>The XML format understood by `GtkBuilder` for `GMenuModel` consists
 * <br>of a toplevel `&lt;menu&gt;` element, which contains one or more `&lt;item&gt;`
 * <br>elements. Each `&lt;item&gt;` element contains `&lt;attribute&gt;` and `&lt;link&gt;`
 * <br>elements with a mandatory name attribute. `&lt;link&gt;` elements have the
 * <br>same content model as `&lt;menu&gt;`. Instead of `&lt;link name=&quot;submenu&quot;&gt;`
 * <br>or `&lt;link name=&quot;section&quot;&gt;`, you can use `&lt;submenu&gt;` or `&lt;section&gt;`
 * <br>elements.
 * <br>
 * <br>```xml
 * <br>&lt;menu id='app-menu'&gt;
 * <br>  &lt;section&gt;
 * <br>    &lt;item&gt;
 * <br>      &lt;attribute name='label' translatable='yes'&gt;_New Window&lt;/attribute&gt;
 * <br>      &lt;attribute name='action'&gt;app.new&lt;/attribute&gt;
 * <br>    &lt;/item&gt;
 * <br>    &lt;item&gt;
 * <br>      &lt;attribute name='label' translatable='yes'&gt;_About Sunny&lt;/attribute&gt;
 * <br>      &lt;attribute name='action'&gt;app.about&lt;/attribute&gt;
 * <br>    &lt;/item&gt;
 * <br>    &lt;item&gt;
 * <br>      &lt;attribute name='label' translatable='yes'&gt;_Quit&lt;/attribute&gt;
 * <br>      &lt;attribute name='action'&gt;app.quit&lt;/attribute&gt;
 * <br>    &lt;/item&gt;
 * <br>  &lt;/section&gt;
 * <br>&lt;/menu&gt;
 * <br>```
 * <br>
 * <br>Attribute values can be translated using gettext, like other `GtkBuilder`
 * <br>content. `&lt;attribute&gt;` elements can be marked for translation with a
 * <br>`translatable=&quot;yes&quot;` attribute. It is also possible to specify message
 * <br>context and translator comments, using the context and comments attributes.
 * <br>To make use of this, the `GtkBuilder` must have been given the gettext
 * <br>domain to use.
 * <br>
 * <br>The following attributes are used when constructing menu items:
 * <br>
 * <br>- &quot;label&quot;: a user-visible string to display
 * <br>- &quot;use-markup&quot;: whether the text in the menu item includes [Pango markup](https://docs.gtk.org/Pango/pango_markup.html)
 * <br>- &quot;action&quot;: the prefixed name of the action to trigger
 * <br>- &quot;target&quot;: the parameter to use when activating the action
 * <br>- &quot;icon&quot; and &quot;verb-icon&quot;: names of icons that may be displayed
 * <br>- &quot;submenu-action&quot;: name of an action that may be used to track
 * <br>     whether a submenu is open
 * <br>- &quot;hidden-when&quot;: a string used to determine when the item will be hidden.
 * <br>     Possible values include &quot;action-disabled&quot;, &quot;action-missing&quot;, &quot;macos-menubar&quot;.
 * <br>     This is mainly useful for exported menus, see [method&#64;Gtk.Application.set_menubar].
 * <br>- &quot;custom&quot;: a string used to match against the ID of a custom child added with
 * <br>     [method&#64;Gtk.PopoverMenu.add_child], [method&#64;Gtk.PopoverMenuBar.add_child],
 * <br>     or in the ui file with `&lt;child type=&quot;ID&quot;&gt;`.
 * <br>
 * <br>The following attributes are used when constructing sections:
 * <br>
 * <br>- &quot;label&quot;: a user-visible string to use as section heading
 * <br>- &quot;display-hint&quot;: a string used to determine special formatting for the section.
 * <br>    Possible values include &quot;horizontal-buttons&quot;, &quot;circular-buttons&quot; and
 * <br>    &quot;inline-buttons&quot;. They all indicate that section should be
 * <br>    displayed as a horizontal row of buttons.
 * <br>- &quot;text-direction&quot;: a string used to determine the `GtkTextDirection` to use
 * <br>    when &quot;display-hint&quot; is set to &quot;horizontal-buttons&quot;. Possible values
 * <br>    include &quot;rtl&quot;, &quot;ltr&quot;, and &quot;none&quot;.
 * <br>
 * <br>The following attributes are used when constructing submenus:
 * <br>
 * <br>- &quot;label&quot;: a user-visible string to display
 * <br>- &quot;icon&quot;: icon name to display
 * <br>
 * <br>Menu items will also show accelerators, which are usually associated
 * <br>with actions via [method&#64;Gtk.Application.set_accels_for_action],
 * <br>[id&#64;gtk_widget_class_add_binding_action] or
 * <br>[method&#64;Gtk.ShortcutController.add_shortcut].
 * <br>
 * <br>&#35; CSS Nodes
 * <br>
 * <br>`GtkPopoverMenu` is just a subclass of `GtkPopover` that adds custom content
 * <br>to it, therefore it has the same CSS nodes. It is one of the cases that add
 * <br>a .menu style class to the popover's main node.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkPopoverMenu` uses the %GTK_ACCESSIBLE_ROLE_MENU role, and its
 * <br>items use the %GTK_ACCESSIBLE_ROLE_MENU_ITEM,
 * <br>%GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX or
 * <br>%GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO roles, depending on the
 * <br>action they are connected to.
 * <p><a href="https://docs.gtk.org/gtk4/class.PopoverMenu.html">https://docs.gtk.org/gtk4/class.PopoverMenu.html</a></p>
*/
public class PopoverMenu extends Popover {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PopoverMenu.class.getCanonicalName());
    }

    public PopoverMenu(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkPopoverMenu` and populates it according to &#64;model.
     * <br>
     * <br>The created buttons are connected to actions found in the
     * <br>`GtkApplicationWindow` to which the popover belongs - typically
     * <br>by means of being attached to a widget that is contained within
     * <br>the `GtkApplicationWindow`s widget hierarchy.
     * <br>
     * <br>Actions can also be added using [method&#64;Gtk.Widget.insert_action_group]
     * <br>on the menus attach widget or on any of its parent widgets.
     * <br>
     * <br>This function creates menus with sliding submenus.
     * <br>See [ctor&#64;Gtk.PopoverMenu.new_from_model_full] for a way
     * <br>to control this.
     * @param model a `GMenuModel`
     * @return the new `GtkPopoverMenu`
    */
    public static PopoverMenu newFromModelPopoverMenu(@Nullable ch.bailu.gtk.gio.MenuModel model)  {
        PointerContainer __self = cast(JnaPopoverMenu.INST().gtk_popover_menu_new_from_model(asCPointer(model)));
        if (__self.isNull()) {
            throw new NullPointerException("PopoverMenu:newFromModel");
        }
        return new PopoverMenu(__self);
    }        
    

    /**
     * Creates a `GtkPopoverMenu` and populates it according to &#64;model.
     * <br>
     * <br>The created buttons are connected to actions found in the
     * <br>action groups that are accessible from the parent widget.
     * <br>This includes the `GtkApplicationWindow` to which the popover
     * <br>belongs. Actions can also be added using [method&#64;Gtk.Widget.insert_action_group]
     * <br>on the parent widget or on any of its parent widgets.
     * <br>
     * <br>The only flag that is supported currently is
     * <br>%GTK_POPOVER_MENU_NESTED, which makes GTK create traditional,
     * <br>nested submenus instead of the default sliding submenus.
     * @param model a `GMenuModel`
     * @param flags flags that affect how the menu is created
     * @return the new `GtkPopoverMenu`
    */
    public static PopoverMenu newFromModelFullPopoverMenu(@Nonnull ch.bailu.gtk.gio.MenuModel model, int flags)  {
        PointerContainer __self = cast(JnaPopoverMenu.INST().gtk_popover_menu_new_from_model_full(asCPointerNotNull(model), flags));
        if (__self.isNull()) {
            throw new NullPointerException("PopoverMenu:newFromModelFull");
        }
        return new PopoverMenu(__self);
    }        
    

    /**
     * Adds a custom widget to a generated menu.
     * <br>
     * <br>For this to work, the menu model of &#64;popover must have
     * <br>an item with a `custom` attribute that matches &#64;id.
     * @param child the `GtkWidget` to add
     * @param id the ID to insert &#64;child at
     * @return %TRUE if &#64;id was found and the widget added
    */
    public boolean addChild(@Nonnull Widget child, @Nonnull ch.bailu.gtk.type.Str id)  {
        return JnaPopoverMenu.INST().gtk_popover_menu_add_child(asCPointer(), asCPointerNotNull(child), asCPointerNotNull(id));
    }

    /**
     * Adds a custom widget to a generated menu.
     * <br>
     * <br>For this to work, the menu model of &#64;popover must have
     * <br>an item with a `custom` attribute that matches &#64;id.
     * @param child the `GtkWidget` to add
     * @param id the ID to insert &#64;child at
     * @return %TRUE if &#64;id was found and the widget added
    */
    public boolean addChild(@Nonnull Widget child, String id)  {
        return JnaPopoverMenu.INST().gtk_popover_menu_add_child(asCPointer(), asCPointerNotNull(child), id);
    }

    /**
     * Returns the menu model used to populate the popover.
     * @return the menu model of &#64;popover
    */
    public ch.bailu.gtk.gio.MenuModel getMenuModel()  {
        return new ch.bailu.gtk.gio.MenuModel(new PointerContainer(JnaPopoverMenu.INST().gtk_popover_menu_get_menu_model(asCPointer())));
    }

    /**
     * Removes a widget that has previously been added with
     * <br>gtk_popover_menu_add_child().
     * @param child the `GtkWidget` to remove
     * @return %TRUE if the widget was removed
    */
    public boolean removeChild(@Nonnull Widget child)  {
        return JnaPopoverMenu.INST().gtk_popover_menu_remove_child(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Sets a new menu model on &#64;popover.
     * <br>
     * <br>The existing contents of &#64;popover are removed, and
     * <br>the &#64;popover is populated with new contents according
     * <br>to &#64;model.
     * @param model a `GMenuModel`
    */
    public void setMenuModel(@Nullable ch.bailu.gtk.gio.MenuModel model)  {
        JnaPopoverMenu.INST().gtk_popover_menu_set_menu_model(asCPointer(), asCPointer(model));
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

    /**
     * Implements interface {@link Native}. Call this to get access to interface functions.
     * @return {@link Native}
    */
    public Native asNative() {
        return new Native(cast());
    }

    /**
     * Implements interface {@link ShortcutManager}. Call this to get access to interface functions.
     * @return {@link ShortcutManager}
    */
    public ShortcutManager asShortcutManager() {
        return new ShortcutManager(cast());
    }

    public static long getTypeID() { 
        return JnaPopoverMenu.INST().gtk_popover_menu_get_type(); 
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
