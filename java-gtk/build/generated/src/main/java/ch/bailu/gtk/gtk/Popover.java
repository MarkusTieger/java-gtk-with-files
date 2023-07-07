/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkPopover` is a bubble-like context popup.
 * <br>
 * <br>![An example GtkPopover](popover.png)
 * <br>
 * <br>It is primarily meant to provide context-dependent information
 * <br>or options. Popovers are attached to a parent widget. By default,
 * <br>they point to the whole widget area, although this behavior can be
 * <br>changed with [method&#64;Gtk.Popover.set_pointing_to].
 * <br>
 * <br>The position of a popover relative to the widget it is attached to
 * <br>can also be changed with [method&#64;Gtk.Popover.set_position]
 * <br>
 * <br>By default, `GtkPopover` performs a grab, in order to ensure input
 * <br>events get redirected to it while it is shown, and also so the popover
 * <br>is dismissed in the expected situations (clicks outside the popover,
 * <br>or the Escape key being pressed). If no such modal behavior is desired
 * <br>on a popover, [method&#64;Gtk.Popover.set_autohide] may be called on it to
 * <br>tweak its behavior.
 * <br>
 * <br>&#35;&#35; GtkPopover as menu replacement
 * <br>
 * <br>`GtkPopover` is often used to replace menus. The best was to do this
 * <br>is to use the [class&#64;Gtk.PopoverMenu] subclass which supports being
 * <br>populated from a `GMenuModel` with [ctor&#64;Gtk.PopoverMenu.new_from_model].
 * <br>
 * <br>```xml
 * <br>&lt;section&gt;
 * <br>  &lt;attribute name=&quot;display-hint&quot;&gt;horizontal-buttons&lt;/attribute&gt;
 * <br>  &lt;item&gt;
 * <br>    &lt;attribute name=&quot;label&quot;&gt;Cut&lt;/attribute&gt;
 * <br>    &lt;attribute name=&quot;action&quot;&gt;app.cut&lt;/attribute&gt;
 * <br>    &lt;attribute name=&quot;verb-icon&quot;&gt;edit-cut-symbolic&lt;/attribute&gt;
 * <br>  &lt;/item&gt;
 * <br>  &lt;item&gt;
 * <br>    &lt;attribute name=&quot;label&quot;&gt;Copy&lt;/attribute&gt;
 * <br>    &lt;attribute name=&quot;action&quot;&gt;app.copy&lt;/attribute&gt;
 * <br>    &lt;attribute name=&quot;verb-icon&quot;&gt;edit-copy-symbolic&lt;/attribute&gt;
 * <br>  &lt;/item&gt;
 * <br>  &lt;item&gt;
 * <br>    &lt;attribute name=&quot;label&quot;&gt;Paste&lt;/attribute&gt;
 * <br>    &lt;attribute name=&quot;action&quot;&gt;app.paste&lt;/attribute&gt;
 * <br>    &lt;attribute name=&quot;verb-icon&quot;&gt;edit-paste-symbolic&lt;/attribute&gt;
 * <br>  &lt;/item&gt;
 * <br>&lt;/section&gt;
 * <br>```
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>popover[.menu]
 * <br>├── arrow
 * <br>╰── contents.background
 * <br>    ╰── &lt;child&gt;
 * <br>```
 * <br>
 * <br>The contents child node always gets the .background style class
 * <br>and the popover itself gets the .menu style class if the popover
 * <br>is menu-like (i.e. `GtkPopoverMenu`).
 * <br>
 * <br>Particular uses of `GtkPopover`, such as touch selection popups or
 * <br>magnifiers in `GtkEntry` or `GtkTextView` get style classes like
 * <br>.touch-selection or .magnifier to differentiate from plain popovers.
 * <br>
 * <br>When styling a popover directly, the popover node should usually
 * <br>not have any background. The visible part of the popover can have
 * <br>a shadow. To specify it in CSS, set the box-shadow of the contents node.
 * <br>
 * <br>Note that, in order to accomplish appropriate arrow visuals, `GtkPopover`
 * <br>uses custom drawing for the arrow node. This makes it possible for the
 * <br>arrow to change its shape dynamically, but it also limits the possibilities
 * <br>of styling it using CSS. In particular, the arrow gets drawn over the
 * <br>content node's border and shadow, so they look like one shape, which
 * <br>means that the border width of the content node and the arrow node should
 * <br>be the same. The arrow also does not support any border shape other than
 * <br>solid, no border-radius, only one border width (border-bottom-width is
 * <br>used) and no box-shadow.
 * <p><a href="https://docs.gtk.org/gtk4/class.Popover.html">https://docs.gtk.org/gtk4/class.Popover.html</a></p>
*/
public class Popover extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Popover.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivateDefault {
        /**
         * Emitted whend the user activates the default widget.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
        */
        void onActivateDefault();
    }
    
    private static com.sun.jna.Callback toOnActivateDefault(OnActivateDefault in) {
        return (in == null) ? null: (JnaPopover.OnActivateDefault) (__self, __data) -> in.onActivateDefault();
    }

    @FunctionalInterface
    public interface OnClosed {
        /**
         * Emitted when the popover is closed.
        */
        void onClosed();
    }
    
    private static com.sun.jna.Callback toOnClosed(OnClosed in) {
        return (in == null) ? null: (JnaPopover.OnClosed) (__self, __data) -> in.onClosed();
    }

    public Popover(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkPopover`.
    */
    public Popover() {
        super(cast(JnaPopover.INST().gtk_popover_new()));
    }

    /**
     * Returns whether the popover is modal.
     * <br>
     * <br>See [method&#64;Gtk.Popover.set_autohide] for the
     * <br>implications of this.
     * @return %TRUE if &#64;popover is modal
    */
    public boolean getAutohide()  {
        return JnaPopover.INST().gtk_popover_get_autohide(asCPointer());
    }

    /**
     * Returns whether the popover will close after a modal child is closed.
     * @return %TRUE if &#64;popover will close after a modal child.
    */
    public boolean getCascadePopdown()  {
        return JnaPopover.INST().gtk_popover_get_cascade_popdown(asCPointer());
    }

    /**
     * Gets the child widget of &#64;popover.
     * @return the child widget of &#64;popover
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaPopover.INST().gtk_popover_get_child(asCPointer())));
    }

    /**
     * Gets whether this popover is showing an arrow
     * <br>pointing at the widget that it is relative to.
     * @return whether the popover has an arrow
    */
    public boolean getHasArrow()  {
        return JnaPopover.INST().gtk_popover_get_has_arrow(asCPointer());
    }

    /**
     * Gets whether mnemonics are visible.
     * @return %TRUE if mnemonics are supposed to be visible   in this popover
    */
    public boolean getMnemonicsVisible()  {
        return JnaPopover.INST().gtk_popover_get_mnemonics_visible(asCPointer());
    }

    /**
     * Gets the offset previous set with gtk_popover_set_offset().
     * @param x_offset a location for the x_offset
     * @param y_offset a location for the y_offset
    */
    public void getOffset(@Nullable ch.bailu.gtk.type.Int x_offset, @Nullable ch.bailu.gtk.type.Int y_offset)  {
        JnaPopover.INST().gtk_popover_get_offset(asCPointer(), asCPointer(x_offset), asCPointer(y_offset));
    }

    /**
     * Gets the rectangle that the popover points to.
     * <br>
     * <br>If a rectangle to point to has been set, this function will
     * <br>return %TRUE and fill in &#64;rect with such rectangle, otherwise
     * <br>it will return %FALSE and fill in &#64;rect with the parent
     * <br>widget coordinates.
     * @param rect location to store the rectangle
     * @return %TRUE if a rectangle to point to was set.
    */
    public boolean getPointingTo(@Nonnull ch.bailu.gtk.gdk.Rectangle rect)  {
        return JnaPopover.INST().gtk_popover_get_pointing_to(asCPointer(), asCPointerNotNull(rect));
    }

    /**
     * Returns the preferred position of &#64;popover.
     * @return The preferred position.
    */
    public int getPosition()  {
        return JnaPopover.INST().gtk_popover_get_position(asCPointer());
    }

    /**
     * Pops &#64;popover down.
     * <br>
     * <br>This may have the side-effect of closing a parent popover
     * <br>as well. See [property&#64;Gtk.Popover:cascade-popdown].
    */
    public void popdown()  {
        JnaPopover.INST().gtk_popover_popdown(asCPointer());
    }

    /**
     * Pops &#64;popover up.
    */
    public void popup()  {
        JnaPopover.INST().gtk_popover_popup(asCPointer());
    }

    /**
     * Presents the popover to the user.
    */
    public void present()  {
        JnaPopover.INST().gtk_popover_present(asCPointer());
    }

    /**
     * Sets whether &#64;popover is modal.
     * <br>
     * <br>A modal popover will grab the keyboard focus on it when being
     * <br>displayed. Focus will wrap around within the popover. Clicking
     * <br>outside the popover area or pressing Esc will dismiss the popover.
     * <br>
     * <br>Called this function on an already showing popup with a new
     * <br>autohide value different from the current one, will cause the
     * <br>popup to be hidden.
     * @param autohide %TRUE to dismiss the popover on outside clicks
    */
    public void setAutohide(boolean autohide)  {
        JnaPopover.INST().gtk_popover_set_autohide(asCPointer(), autohide);
    }

    /**
     * If &#64;cascade_popdown is %TRUE, the popover will be
     * <br>closed when a child modal popover is closed.
     * <br>
     * <br>If %FALSE, &#64;popover will stay visible.
     * @param cascade_popdown %TRUE if the popover should follow a child closing
    */
    public void setCascadePopdown(boolean cascade_popdown)  {
        JnaPopover.INST().gtk_popover_set_cascade_popdown(asCPointer(), cascade_popdown);
    }

    /**
     * Sets the child widget of &#64;popover.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaPopover.INST().gtk_popover_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the default widget of a `GtkPopover`.
     * <br>
     * <br>The default widget is the widget that’s activated when the user
     * <br>presses Enter in a dialog (for example). This function sets or
     * <br>unsets the default widget for a `GtkPopover`.
     * @param widget a child widget of &#64;popover to set as   the default, or %NULL to unset the default widget for the popover
    */
    public void setDefaultWidget(@Nullable Widget widget)  {
        JnaPopover.INST().gtk_popover_set_default_widget(asCPointer(), asCPointer(widget));
    }

    /**
     * Sets whether this popover should draw an arrow
     * <br>pointing at the widget it is relative to.
     * @param has_arrow %TRUE to draw an arrow
    */
    public void setHasArrow(boolean has_arrow)  {
        JnaPopover.INST().gtk_popover_set_has_arrow(asCPointer(), has_arrow);
    }

    /**
     * Sets whether mnemonics should be visible.
     * @param mnemonics_visible the new value
    */
    public void setMnemonicsVisible(boolean mnemonics_visible)  {
        JnaPopover.INST().gtk_popover_set_mnemonics_visible(asCPointer(), mnemonics_visible);
    }

    /**
     * Sets the offset to use when calculating the position
     * <br>of the popover.
     * <br>
     * <br>These values are used when preparing the [struct&#64;Gdk.PopupLayout]
     * <br>for positioning the popover.
     * @param x_offset the x offset to adjust the position by
     * @param y_offset the y offset to adjust the position by
    */
    public void setOffset(int x_offset, int y_offset)  {
        JnaPopover.INST().gtk_popover_set_offset(asCPointer(), x_offset, y_offset);
    }

    /**
     * Sets the rectangle that &#64;popover points to.
     * <br>
     * <br>This is in the coordinate space of the &#64;popover parent.
     * @param rect rectangle to point to
    */
    public void setPointingTo(@Nullable ch.bailu.gtk.gdk.Rectangle rect)  {
        JnaPopover.INST().gtk_popover_set_pointing_to(asCPointer(), asCPointer(rect));
    }

    /**
     * Sets the preferred position for &#64;popover to appear.
     * <br>
     * <br>If the &#64;popover is currently visible, it will be immediately
     * <br>updated.
     * <br>
     * <br>This preference will be respected where possible, although
     * <br>on lack of space (eg. if close to the window edges), the
     * <br>`GtkPopover` may choose to appear on the opposite side.
     * @param position preferred popover position
    */
    public void setPosition(int position)  {
        JnaPopover.INST().gtk_popover_set_position(asCPointer(), position);
    }

    public final static String SIGNAL_ON_ACTIVATE_DEFAULT = "activate-default";
    
    /**
     * Connect to signal "activate-default".
     * <br>See {@link OnActivateDefault#onActivateDefault} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE_DEFAULT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivateDefault(OnActivateDefault signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE_DEFAULT, toOnActivateDefault(signal));
    }

    public final static String SIGNAL_ON_CLOSED = "closed";
    
    /**
     * Connect to signal "closed".
     * <br>See {@link OnClosed#onClosed} for signal description.
     * <br>Field {@link #SIGNAL_ON_CLOSED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onClosed(OnClosed signal) {
        return connectSignal(SIGNAL_ON_CLOSED, toOnClosed(signal));
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
        return JnaPopover.INST().gtk_popover_get_type(); 
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
