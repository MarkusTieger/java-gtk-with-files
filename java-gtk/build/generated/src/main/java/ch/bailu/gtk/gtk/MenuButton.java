/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkMenuButton` widget is used to display a popup when clicked.
 * <br>
 * <br>![An example GtkMenuButton](menu-button.png)
 * <br>
 * <br>This popup can be provided either as a `GtkPopover` or as an abstract
 * <br>`GMenuModel`.
 * <br>
 * <br>The `GtkMenuButton` widget can show either an icon (set with the
 * <br>[property&#64;Gtk.MenuButton:icon-name] property) or a label (set with the
 * <br>[property&#64;Gtk.MenuButton:label] property). If neither is explicitly set,
 * <br>a [class&#64;Gtk.Image] is automatically created, using an arrow image oriented
 * <br>according to [property&#64;Gtk.MenuButton:direction] or the generic
 * <br>“open-menu-symbolic” icon if the direction is not set.
 * <br>
 * <br>The positioning of the popup is determined by the
 * <br>[property&#64;Gtk.MenuButton:direction] property of the menu button.
 * <br>
 * <br>For menus, the [property&#64;Gtk.Widget:halign] and [property&#64;Gtk.Widget:valign]
 * <br>properties of the menu are also taken into account. For example, when the
 * <br>direction is %GTK_ARROW_DOWN and the horizontal alignment is %GTK_ALIGN_START,
 * <br>the menu will be positioned below the button, with the starting edge
 * <br>(depending on the text direction) of the menu aligned with the starting
 * <br>edge of the button. If there is not enough space below the button, the
 * <br>menu is popped up above the button instead. If the alignment would move
 * <br>part of the menu offscreen, it is “pushed in”.
 * <br>
 * <br>|           | start                | center                | end                |
 * <br>| -         | ---                  | ---                   | ---                |
 * <br>| **down**  | ![](down-start.png)  | ![](down-center.png)  | ![](down-end.png)  |
 * <br>| **up**    | ![](up-start.png)    | ![](up-center.png)    | ![](up-end.png)    |
 * <br>| **left**  | ![](left-start.png)  | ![](left-center.png)  | ![](left-end.png)  |
 * <br>| **right** | ![](right-start.png) | ![](right-center.png) | ![](right-end.png) |
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>menubutton
 * <br>╰── button.toggle
 * <br>    ╰── &lt;content&gt;
 * <br>         ╰── [arrow]
 * <br>```
 * <br>
 * <br>`GtkMenuButton` has a single CSS node with name `menubutton`
 * <br>which contains a `button` node with a `.toggle` style class.
 * <br>
 * <br>If the button contains an icon, it will have the `.image-button` style class,
 * <br>if it contains text, it will have `.text-button` style class. If an arrow is
 * <br>visible in addition to an icon, text or a custom child, it will also have
 * <br>`.arrow-button` style class.
 * <br>
 * <br>Inside the toggle button content, there is an `arrow` node for
 * <br>the indicator, which will carry one of the `.none`, `.up`, `.down`,
 * <br>`.left` or `.right` style classes to indicate the direction that
 * <br>the menu will appear in. The CSS is expected to provide a suitable
 * <br>image for each of these cases using the `-gtk-icon-source` property.
 * <br>
 * <br>Optionally, the `menubutton` node can carry the `.circular` style class
 * <br>to request a round appearance.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkMenuButton` uses the %GTK_ACCESSIBLE_ROLE_BUTTON role.
 * <p><a href="https://docs.gtk.org/gtk4/class.MenuButton.html">https://docs.gtk.org/gtk4/class.MenuButton.html</a></p>
*/
public class MenuButton extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MenuButton.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnMenuButtonCreatePopupFunc {
        /**
         * User-provided callback function to create a popup for a
         * <br>`GtkMenuButton` on demand.
         * <br>
         * <br>This function is called when the popup of &#64;menu_button is shown,
         * <br>but none has been provided via [method&#64;Gtk.MenuButton.set_popover]
         * <br>or [method&#64;Gtk.MenuButton.set_menu_model].
         * @param menu_button the `GtkMenuButton`
         * @param user_data User data passed to gtk_menu_button_set_create_popup_func()
        */
        void onMenuButtonCreatePopupFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MenuButton menu_button, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaMenuButton.OnMenuButtonCreatePopupFunc toOnMenuButtonCreatePopupFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnMenuButtonCreatePopupFunc in) {
        JnaMenuButton.OnMenuButtonCreatePopupFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_menu_button, _user_data) -> in.onMenuButtonCreatePopupFunc(__callback, new MenuButton(new PointerContainer(_menu_button)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaMenuButton.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaMenuButton.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted to when the menu button is activated.
         * <br>
         * <br>The `::activate` signal on `GtkMenuButton` is an action signal and
         * <br>emitting it causes the button to pop up its menu.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaMenuButton.OnActivate) (__self, __data) -> in.onActivate();
    }

    public MenuButton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkMenuButton` widget with downwards-pointing
     * <br>arrow as the only child.
     * <br>
     * <br>You can replace the child widget with another `GtkWidget`
     * <br>should you wish to.
    */
    public MenuButton() {
        super(cast(JnaMenuButton.INST().gtk_menu_button_new()));
    }

    /**
     * Gets whether to show a dropdown arrow even when using an icon.
     * @return whether to show a dropdown arrow even when using an icon
    */
    public boolean getAlwaysShowArrow()  {
        return JnaMenuButton.INST().gtk_menu_button_get_always_show_arrow(asCPointer());
    }

    /**
     * Gets the child widget of &#64;menu_button.
     * @return the child widget of &#64;menu_button
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaMenuButton.INST().gtk_menu_button_get_child(asCPointer())));
    }

    /**
     * Returns the direction the popup will be pointing at when popped up.
     * @return a `GtkArrowType` value
    */
    public int getDirection()  {
        return JnaMenuButton.INST().gtk_menu_button_get_direction(asCPointer());
    }

    /**
     * Returns whether the button has a frame.
     * @return %TRUE if the button has a frame
    */
    public boolean getHasFrame()  {
        return JnaMenuButton.INST().gtk_menu_button_get_has_frame(asCPointer());
    }

    /**
     * Gets the name of the icon shown in the button.
     * @return the name of the icon shown in the button
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMenuButton.INST().gtk_menu_button_get_icon_name(asCPointer())));
    }

    /**
     * Gets the label shown in the button
     * @return the label shown in the button
    */
    public ch.bailu.gtk.type.Str getLabel()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMenuButton.INST().gtk_menu_button_get_label(asCPointer())));
    }

    /**
     * Returns the `GMenuModel` used to generate the popup.
     * @return a `GMenuModel`
    */
    public ch.bailu.gtk.gio.MenuModel getMenuModel()  {
        return new ch.bailu.gtk.gio.MenuModel(new PointerContainer(JnaMenuButton.INST().gtk_menu_button_get_menu_model(asCPointer())));
    }

    /**
     * Returns the `GtkPopover` that pops out of the button.
     * <br>
     * <br>If the button is not using a `GtkPopover`, this function
     * <br>returns %NULL.
     * @return a `GtkPopover` or %NULL
    */
    public Popover getPopover()  {
        return new Popover(new PointerContainer(JnaMenuButton.INST().gtk_menu_button_get_popover(asCPointer())));
    }

    /**
     * Returns whether the menu button acts as a primary menu.
     * @return %TRUE if the button is a primary menu
    */
    public boolean getPrimary()  {
        return JnaMenuButton.INST().gtk_menu_button_get_primary(asCPointer());
    }

    /**
     * Returns whether an embedded underline in the text indicates a
     * <br>mnemonic.
     * @return %TRUE whether an embedded underline in the text indicates   the mnemonic accelerator keys.
    */
    public boolean getUseUnderline()  {
        return JnaMenuButton.INST().gtk_menu_button_get_use_underline(asCPointer());
    }

    /**
     * Dismiss the menu.
    */
    public void popdown()  {
        JnaMenuButton.INST().gtk_menu_button_popdown(asCPointer());
    }

    /**
     * Pop up the menu.
    */
    public void popup()  {
        JnaMenuButton.INST().gtk_menu_button_popup(asCPointer());
    }

    /**
     * Sets whether to show a dropdown arrow even when using an icon or a custom
     * <br>child.
     * @param always_show_arrow hether to show a dropdown arrow even when using an icon
    */
    public void setAlwaysShowArrow(boolean always_show_arrow)  {
        JnaMenuButton.INST().gtk_menu_button_set_always_show_arrow(asCPointer(), always_show_arrow);
    }

    /**
     * Sets the child widget of &#64;menu_button.
     * <br>
     * <br>Setting a child resets [property&#64;Gtk.MenuButton:label] and
     * <br>[property&#64;Gtk.MenuButton:icon-name].
     * <br>
     * <br>If [property&#64;Gtk.MenuButton:always-show-arrow] is set to `TRUE` and
     * <br>[property&#64;Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown arrow
     * <br>will be shown next to the child.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaMenuButton.INST().gtk_menu_button_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets &#64;func to be called when a popup is about to be shown.
     * <br>
     * <br>&#64;func should use one of
     * <br>
     * <br> - [method&#64;Gtk.MenuButton.set_popover]
     * <br> - [method&#64;Gtk.MenuButton.set_menu_model]
     * <br>
     * <br>to set a popup for &#64;menu_button.
     * <br>If &#64;func is non-%NULL, &#64;menu_button will always be sensitive.
     * <br>
     * <br>Using this function will not reset the menu widget attached to
     * <br>&#64;menu_button. Instead, this can be done manually in &#64;func.
     * @param func function to call when a popup is about to   be shown, but none has been provided via other means, or %NULL   to reset to default behavior.
     * @param user_data user data to pass to &#64;func.
     * @param destroy_notify destroy notify for &#64;user_data
    */
    public void setCreatePopupFunc(OnMenuButtonCreatePopupFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy_notify)  {
        JnaMenuButton.INST().gtk_menu_button_set_create_popup_func(asCPointer(), toOnMenuButtonCreatePopupFunc(this, "setCreatePopupFunc", func), asCPointer(user_data), toOnDestroyNotify(this, "setCreatePopupFunc", destroy_notify));
    }

    /**
     * Sets the direction in which the popup will be popped up.
     * <br>
     * <br>If the button is automatically populated with an arrow icon,
     * <br>its direction will be changed to match.
     * <br>
     * <br>If the does not fit in the available space in the given direction,
     * <br>GTK will its best to keep it inside the screen and fully visible.
     * <br>
     * <br>If you pass %GTK_ARROW_NONE for a &#64;direction, the popup will behave
     * <br>as if you passed %GTK_ARROW_DOWN (although you won’t see any arrows).
     * @param direction a `GtkArrowType`
    */
    public void setDirection(int direction)  {
        JnaMenuButton.INST().gtk_menu_button_set_direction(asCPointer(), direction);
    }

    /**
     * Sets the style of the button.
     * @param has_frame whether the button should have a visible frame
    */
    public void setHasFrame(boolean has_frame)  {
        JnaMenuButton.INST().gtk_menu_button_set_has_frame(asCPointer(), has_frame);
    }

    /**
     * Sets the name of an icon to show inside the menu button.
     * <br>
     * <br>Setting icon name resets [property&#64;Gtk.MenuButton:label] and
     * <br>[property&#64;Gtk.MenuButton:child].
     * <br>
     * <br>If [property&#64;Gtk.MenuButton:always-show-arrow] is set to `TRUE` and
     * <br>[property&#64;Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown arrow
     * <br>will be shown next to the icon.
     * @param icon_name the icon name
    */
    public void setIconName(@Nonnull ch.bailu.gtk.type.Str icon_name)  {
        JnaMenuButton.INST().gtk_menu_button_set_icon_name(asCPointer(), asCPointerNotNull(icon_name));
    }

    /**
     * Sets the name of an icon to show inside the menu button.
     * <br>
     * <br>Setting icon name resets [property&#64;Gtk.MenuButton:label] and
     * <br>[property&#64;Gtk.MenuButton:child].
     * <br>
     * <br>If [property&#64;Gtk.MenuButton:always-show-arrow] is set to `TRUE` and
     * <br>[property&#64;Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown arrow
     * <br>will be shown next to the icon.
     * @param icon_name the icon name
    */
    public void setIconName(String icon_name)  {
        JnaMenuButton.INST().gtk_menu_button_set_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets the label to show inside the menu button.
     * <br>
     * <br>Setting a label resets [property&#64;Gtk.MenuButton:icon-name] and
     * <br>[property&#64;Gtk.MenuButton:child].
     * <br>
     * <br>If [property&#64;Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown
     * <br>arrow will be shown next to the label.
     * @param label the label
    */
    public void setLabel(@Nonnull ch.bailu.gtk.type.Str label)  {
        JnaMenuButton.INST().gtk_menu_button_set_label(asCPointer(), asCPointerNotNull(label));
    }

    /**
     * Sets the label to show inside the menu button.
     * <br>
     * <br>Setting a label resets [property&#64;Gtk.MenuButton:icon-name] and
     * <br>[property&#64;Gtk.MenuButton:child].
     * <br>
     * <br>If [property&#64;Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown
     * <br>arrow will be shown next to the label.
     * @param label the label
    */
    public void setLabel(String label)  {
        JnaMenuButton.INST().gtk_menu_button_set_label(asCPointer(), label);
    }

    /**
     * Sets the `GMenuModel` from which the popup will be constructed.
     * <br>
     * <br>If &#64;menu_model is %NULL, the button is disabled.
     * <br>
     * <br>A [class&#64;Gtk.Popover] will be created from the menu model with
     * <br>[ctor&#64;Gtk.PopoverMenu.new_from_model]. Actions will be connected
     * <br>as documented for this function.
     * <br>
     * <br>If [property&#64;Gtk.MenuButton:popover] is already set, it will be
     * <br>dissociated from the &#64;menu_button, and the property is set to %NULL.
     * @param menu_model a `GMenuModel`, or %NULL to unset and disable the   button
    */
    public void setMenuModel(@Nullable ch.bailu.gtk.gio.MenuModel menu_model)  {
        JnaMenuButton.INST().gtk_menu_button_set_menu_model(asCPointer(), asCPointer(menu_model));
    }

    /**
     * Sets the `GtkPopover` that will be popped up when the &#64;menu_button is clicked.
     * <br>
     * <br>If &#64;popover is %NULL, the button is disabled.
     * <br>
     * <br>If [property&#64;Gtk.MenuButton:menu-model] is set, the menu model is dissociated
     * <br>from the &#64;menu_button, and the property is set to %NULL.
     * @param popover a `GtkPopover`, or %NULL to unset and disable the button
    */
    public void setPopover(@Nullable Widget popover)  {
        JnaMenuButton.INST().gtk_menu_button_set_popover(asCPointer(), asCPointer(popover));
    }

    /**
     * Sets whether menu button acts as a primary menu.
     * <br>
     * <br>Primary menus can be opened with the &lt;kbd&gt;F10&lt;/kbd&gt; key.
     * @param primary whether the menubutton should act as a primary menu
    */
    public void setPrimary(boolean primary)  {
        JnaMenuButton.INST().gtk_menu_button_set_primary(asCPointer(), primary);
    }

    /**
     * If true, an underline in the text indicates a mnemonic.
     * @param use_underline %TRUE if underlines in the text indicate mnemonics
    */
    public void setUseUnderline(boolean use_underline)  {
        JnaMenuButton.INST().gtk_menu_button_set_use_underline(asCPointer(), use_underline);
    }

    public final static String SIGNAL_ON_ACTIVATE = "activate";
    
    /**
     * Connect to signal "activate".
     * <br>See {@link OnActivate#onActivate} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivate(OnActivate signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE, toOnActivate(signal));
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
        return JnaMenuButton.INST().gtk_menu_button_get_type(); 
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
