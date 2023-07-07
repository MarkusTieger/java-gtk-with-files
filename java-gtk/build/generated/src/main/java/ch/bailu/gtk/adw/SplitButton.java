/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A combined button and dropdown widget.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;split-button-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;split-button.png&quot; alt=&quot;split-button&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>`AdwSplitButton` is typically used to present a set of actions in a menu,
 * <br>but allow access to one of them with a single click.
 * <br>
 * <br>The API is very similar to [class&#64;Gtk.Button] and [class&#64;Gtk.MenuButton], see
 * <br>their documentation for details.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>```
 * <br>splitbutton[.image-button][.text-button]
 * <br>├── button
 * <br>│   ╰── &lt;content&gt;
 * <br>├── separator
 * <br>╰── menubutton
 * <br>    ╰── button.toggle
 * <br>        ╰── arrow
 * <br>```
 * <br>
 * <br>`AdwSplitButton`'s CSS node is called `splitbutton`. It contains the css
 * <br>nodes: `button`, `separator`, `menubutton`. See [class&#64;Gtk.MenuButton]
 * <br>documentation for the `menubutton` contents.
 * <br>
 * <br>The main CSS node will contain the `.image-button` or `.text-button` style
 * <br>classes matching the button contents. The nested button nodes will never
 * <br>contain them.
 * <br>
 * <br>&#35;&#35; Accessibility
 * <br>
 * <br>`AdwSplitButton` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.SplitButton.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.SplitButton.html</a></p>
*/
public class SplitButton extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SplitButton.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted to animate press then release.
         * <br>
         * <br>This is an action signal. Applications should never connect to this signal,
         * <br>but use the [signal&#64;SplitButton::clicked] signal.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaSplitButton.OnActivate) (__self, __data) -> in.onActivate();
    }

    @FunctionalInterface
    public interface OnClicked {
        /**
         * Emitted when the button has been activated (pressed and released).
        */
        void onClicked();
    }
    
    private static com.sun.jna.Callback toOnClicked(OnClicked in) {
        return (in == null) ? null: (JnaSplitButton.OnClicked) (__self, __data) -> in.onClicked();
    }

    public SplitButton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwSplitButton`.
    */
    public SplitButton() {
        super(cast(JnaSplitButton.INST().adw_split_button_new()));
    }

    /**
     * Gets the child widget.
     * @return the child widget
    */
    public ch.bailu.gtk.gtk.Widget getChild()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaSplitButton.INST().adw_split_button_get_child(asCPointer())));
    }

    /**
     * Gets the direction in which the popup will be popped up.
     * @return the direction
    */
    public int getDirection()  {
        return JnaSplitButton.INST().adw_split_button_get_direction(asCPointer());
    }

    /**
     * Gets the tooltip of the dropdown button of &#64;self.
     * @return the dropdown tooltip of &#64;self
    */
    public ch.bailu.gtk.type.Str getDropdownTooltip()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSplitButton.INST().adw_split_button_get_dropdown_tooltip(asCPointer())));
    }

    /**
     * Gets the name of the icon used to automatically populate the button.
     * @return the icon name
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSplitButton.INST().adw_split_button_get_icon_name(asCPointer())));
    }

    /**
     * Gets the label for &#64;self.
     * @return the label for &#64;self
    */
    public ch.bailu.gtk.type.Str getLabel()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSplitButton.INST().adw_split_button_get_label(asCPointer())));
    }

    /**
     * Gets the menu model from which the popup will be created.
     * @return the menu model
    */
    public ch.bailu.gtk.gio.MenuModel getMenuModel()  {
        return new ch.bailu.gtk.gio.MenuModel(new PointerContainer(JnaSplitButton.INST().adw_split_button_get_menu_model(asCPointer())));
    }

    /**
     * Gets the popover that will be popped up when the dropdown is clicked.
     * @return the popover
    */
    public ch.bailu.gtk.gtk.Popover getPopover()  {
        return new ch.bailu.gtk.gtk.Popover(new PointerContainer(JnaSplitButton.INST().adw_split_button_get_popover(asCPointer())));
    }

    /**
     * Gets whether an underline in the text indicates a mnemonic.
     * @return whether an underline in the text indicates a mnemonic
    */
    public boolean getUseUnderline()  {
        return JnaSplitButton.INST().adw_split_button_get_use_underline(asCPointer());
    }

    /**
     * Dismisses the menu.
    */
    public void popdown()  {
        JnaSplitButton.INST().adw_split_button_popdown(asCPointer());
    }

    /**
     * Pops up the menu.
    */
    public void popup()  {
        JnaSplitButton.INST().adw_split_button_popup(asCPointer());
    }

    /**
     * Sets the child widget.
     * <br>
     * <br>Setting the child widget will set [property&#64;SplitButton:label] and
     * <br>[property&#64;SplitButton:icon-name] to `NULL`.
     * @param child the new child widget
    */
    public void setChild(@Nullable ch.bailu.gtk.gtk.Widget child)  {
        JnaSplitButton.INST().adw_split_button_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the direction in which the popup will be popped up.
     * <br>
     * <br>The dropdown arrow icon will point at the same direction.
     * <br>
     * <br>If the does not fit in the available space in the given direction, GTK will
     * <br>try its best to keep it inside the screen and fully visible.
     * <br>
     * <br>If you pass `GTK_ARROW_NONE`, it's equivalent to `GTK_ARROW_DOWN`.
     * @param direction the direction
    */
    public void setDirection(int direction)  {
        JnaSplitButton.INST().adw_split_button_set_direction(asCPointer(), direction);
    }

    /**
     * Sets the tooltip of the dropdown button of &#64;self.
     * <br>
     * <br>The tooltip can be marked up with the Pango text markup language.
     * @param tooltip the dropdown tooltip of &#64;self
    */
    public void setDropdownTooltip(@Nonnull ch.bailu.gtk.type.Str tooltip)  {
        JnaSplitButton.INST().adw_split_button_set_dropdown_tooltip(asCPointer(), asCPointerNotNull(tooltip));
    }

    /**
     * Sets the tooltip of the dropdown button of &#64;self.
     * <br>
     * <br>The tooltip can be marked up with the Pango text markup language.
     * @param tooltip the dropdown tooltip of &#64;self
    */
    public void setDropdownTooltip(String tooltip)  {
        JnaSplitButton.INST().adw_split_button_set_dropdown_tooltip(asCPointer(), tooltip);
    }

    /**
     * Sets the name of the icon used to automatically populate the button.
     * <br>
     * <br>Setting the icon name will set [property&#64;SplitButton:label] and
     * <br>[property&#64;SplitButton:child] to `NULL`.
     * @param icon_name the icon name to set
    */
    public void setIconName(@Nonnull ch.bailu.gtk.type.Str icon_name)  {
        JnaSplitButton.INST().adw_split_button_set_icon_name(asCPointer(), asCPointerNotNull(icon_name));
    }

    /**
     * Sets the name of the icon used to automatically populate the button.
     * <br>
     * <br>Setting the icon name will set [property&#64;SplitButton:label] and
     * <br>[property&#64;SplitButton:child] to `NULL`.
     * @param icon_name the icon name to set
    */
    public void setIconName(String icon_name)  {
        JnaSplitButton.INST().adw_split_button_set_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets the label for &#64;self.
     * <br>
     * <br>Setting the label will set [property&#64;SplitButton:icon-name] and
     * <br>[property&#64;SplitButton:child] to `NULL`.
     * @param label the label to set
    */
    public void setLabel(@Nonnull ch.bailu.gtk.type.Str label)  {
        JnaSplitButton.INST().adw_split_button_set_label(asCPointer(), asCPointerNotNull(label));
    }

    /**
     * Sets the label for &#64;self.
     * <br>
     * <br>Setting the label will set [property&#64;SplitButton:icon-name] and
     * <br>[property&#64;SplitButton:child] to `NULL`.
     * @param label the label to set
    */
    public void setLabel(String label)  {
        JnaSplitButton.INST().adw_split_button_set_label(asCPointer(), label);
    }

    /**
     * Sets the menu model from which the popup will be created.
     * <br>
     * <br>If the menu model is `NULL`, the dropdown is disabled.
     * <br>
     * <br>A [class&#64;Gtk.Popover] will be created from the menu model with
     * <br>[ctor&#64;Gtk.PopoverMenu.new_from_model]. Actions will be connected as
     * <br>documented for this function.
     * <br>
     * <br>If [property&#64;SplitButton:popover] is already set, it will be dissociated from
     * <br>the button, and the property is set to `NULL`.
     * @param menu_model the menu model
    */
    public void setMenuModel(@Nullable ch.bailu.gtk.gio.MenuModel menu_model)  {
        JnaSplitButton.INST().adw_split_button_set_menu_model(asCPointer(), asCPointer(menu_model));
    }

    /**
     * Sets the popover that will be popped up when the dropdown is clicked.
     * <br>
     * <br>If the popover is `NULL`, the dropdown is disabled.
     * <br>
     * <br>If [property&#64;SplitButton:menu-model] is set, the menu model is dissociated
     * <br>from the button, and the property is set to `NULL`.
     * @param popover the popover
    */
    public void setPopover(@Nullable ch.bailu.gtk.gtk.Popover popover)  {
        JnaSplitButton.INST().adw_split_button_set_popover(asCPointer(), asCPointer(popover));
    }

    /**
     * Sets whether an underline in the text indicates a mnemonic.
     * <br>
     * <br>See [property&#64;SplitButton:label].
     * @param use_underline whether an underline in the text indicates a mnemonic
    */
    public void setUseUnderline(boolean use_underline)  {
        JnaSplitButton.INST().adw_split_button_set_use_underline(asCPointer(), use_underline);
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

    public final static String SIGNAL_ON_CLICKED = "clicked";
    
    /**
     * Connect to signal "clicked".
     * <br>See {@link OnClicked#onClicked} for signal description.
     * <br>Field {@link #SIGNAL_ON_CLICKED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onClicked(OnClicked signal) {
        return connectSignal(SIGNAL_ON_CLICKED, toOnClicked(signal));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Accessible}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Accessible}
    */
    public ch.bailu.gtk.gtk.Accessible asAccessible() {
        return new ch.bailu.gtk.gtk.Accessible(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Actionable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Actionable}
    */
    public ch.bailu.gtk.gtk.Actionable asActionable() {
        return new ch.bailu.gtk.gtk.Actionable(cast());
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
        return JnaSplitButton.INST().adw_split_button_get_type(); 
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
