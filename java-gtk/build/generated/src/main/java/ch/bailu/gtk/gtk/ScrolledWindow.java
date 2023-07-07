/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkScrolledWindow` is a container that makes its child scrollable.
 * <br>
 * <br>It does so using either internally added scrollbars or externally
 * <br>associated adjustments, and optionally draws a frame around the child.
 * <br>
 * <br>Widgets with native scrolling support, i.e. those whose classes implement
 * <br>the [iface&#64;Gtk.Scrollable] interface, are added directly. For other types
 * <br>of widget, the class [class&#64;Gtk.Viewport] acts as an adaptor, giving
 * <br>scrollability to other widgets. [method&#64;Gtk.ScrolledWindow.set_child]
 * <br>intelligently accounts for whether or not the added child is a `GtkScrollable`.
 * <br>If it isn’t, then it wraps the child in a `GtkViewport`. Therefore, you can
 * <br>just add any child widget and not worry about the details.
 * <br>
 * <br>If [method&#64;Gtk.ScrolledWindow.set_child] has added a `GtkViewport` for you,
 * <br>you can remove both your added child widget from the `GtkViewport`, and the
 * <br>`GtkViewport` from the `GtkScrolledWindow`, like this:
 * <br>
 * <br>```c
 * <br>GtkWidget *scrolled_window = gtk_scrolled_window_new ();
 * <br>GtkWidget *child_widget = gtk_button_new ();
 * <br>
 * <br>// GtkButton is not a GtkScrollable, so GtkScrolledWindow will automatically
 * <br>// add a GtkViewport.
 * <br>gtk_box_append (GTK_BOX (scrolled_window), child_widget);
 * <br>
 * <br>// Either of these will result in child_widget being unparented:
 * <br>gtk_box_remove (GTK_BOX (scrolled_window), child_widget);
 * <br>// or
 * <br>gtk_box_remove (GTK_BOX (scrolled_window),
 * <br>                      gtk_bin_get_child (GTK_BIN (scrolled_window)));
 * <br>```
 * <br>
 * <br>Unless [property&#64;Gtk.ScrolledWindow:hscrollbar-policy] and
 * <br>[property&#64;Gtk.ScrolledWindow:vscrollbar-policy] are %GTK_POLICY_NEVER or
 * <br>%GTK_POLICY_EXTERNAL, `GtkScrolledWindow` adds internal `GtkScrollbar` widgets
 * <br>around its child. The scroll position of the child, and if applicable the
 * <br>scrollbars, is controlled by the [property&#64;Gtk.ScrolledWindow:hadjustment]
 * <br>and [property&#64;Gtk.ScrolledWindow:vadjustment] that are associated with the
 * <br>`GtkScrolledWindow`. See the docs on [class&#64;Gtk.Scrollbar] for the details,
 * <br>but note that the “step_increment” and “page_increment” fields are only
 * <br>effective if the policy causes scrollbars to be present.
 * <br>
 * <br>If a `GtkScrolledWindow` doesn’t behave quite as you would like, or
 * <br>doesn’t have exactly the right layout, it’s very possible to set up
 * <br>your own scrolling with `GtkScrollbar` and for example a `GtkGrid`.
 * <br>
 * <br>&#35; Touch support
 * <br>
 * <br>`GtkScrolledWindow` has built-in support for touch devices. When a
 * <br>touchscreen is used, swiping will move the scrolled window, and will
 * <br>expose 'kinetic' behavior. This can be turned off with the
 * <br>[property&#64;Gtk.ScrolledWindow:kinetic-scrolling] property if it is undesired.
 * <br>
 * <br>`GtkScrolledWindow` also displays visual 'overshoot' indication when
 * <br>the content is pulled beyond the end, and this situation can be
 * <br>captured with the [signal&#64;Gtk.ScrolledWindow::edge-overshot] signal.
 * <br>
 * <br>If no mouse device is present, the scrollbars will overlaid as
 * <br>narrow, auto-hiding indicators over the content. If traditional
 * <br>scrollbars are desired although no mouse is present, this behaviour
 * <br>can be turned off with the [property&#64;Gtk.ScrolledWindow:overlay-scrolling]
 * <br>property.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkScrolledWindow` has a main CSS node with name scrolledwindow.
 * <br>It gets a .frame style class added when [property&#64;Gtk.ScrolledWindow:has-frame]
 * <br>is %TRUE.
 * <br>
 * <br>It uses subnodes with names overshoot and undershoot to draw the overflow
 * <br>and underflow indications. These nodes get the .left, .right, .top or .bottom
 * <br>style class added depending on where the indication is drawn.
 * <br>
 * <br>`GtkScrolledWindow` also sets the positional style classes (.left, .right,
 * <br>.top, .bottom) and style classes related to overlay scrolling
 * <br>(.overlay-indicator, .dragging, .hovering) on its scrollbars.
 * <br>
 * <br>If both scrollbars are visible, the area where they meet is drawn
 * <br>with a subnode named junction.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkScrolledWindow` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 * <p><a href="https://docs.gtk.org/gtk4/class.ScrolledWindow.html">https://docs.gtk.org/gtk4/class.ScrolledWindow.html</a></p>
*/
public class ScrolledWindow extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ScrolledWindow.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnEdgeOvershot {
        /**
         * Emitted whenever user initiated scrolling makes the scrolled
         * <br>window firmly surpass the limits defined by the adjustment
         * <br>in that orientation.
         * <br>
         * <br>A similar behavior without edge resistance is provided by the
         * <br>[signal&#64;Gtk.ScrolledWindow::edge-reached] signal.
         * <br>
         * <br>Note: The &#64;pos argument is LTR/RTL aware, so callers should be
         * <br>aware too if intending to provide behavior on horizontal edges.
         * @param pos edge side that was hit
        */
        void onEdgeOvershot(int pos);
    }
    
    private static com.sun.jna.Callback toOnEdgeOvershot(OnEdgeOvershot in) {
        return (in == null) ? null: (JnaScrolledWindow.OnEdgeOvershot) (__self, _pos, __data) -> in.onEdgeOvershot(_pos);
    }

    @FunctionalInterface
    public interface OnEdgeReached {
        /**
         * Emitted whenever user-initiated scrolling makes the scrolled
         * <br>window exactly reach the lower or upper limits defined by the
         * <br>adjustment in that orientation.
         * <br>
         * <br>A similar behavior with edge resistance is provided by the
         * <br>[signal&#64;Gtk.ScrolledWindow::edge-overshot] signal.
         * <br>
         * <br>Note: The &#64;pos argument is LTR/RTL aware, so callers should be
         * <br>aware too if intending to provide behavior on horizontal edges.
         * @param pos edge side that was reached
        */
        void onEdgeReached(int pos);
    }
    
    private static com.sun.jna.Callback toOnEdgeReached(OnEdgeReached in) {
        return (in == null) ? null: (JnaScrolledWindow.OnEdgeReached) (__self, _pos, __data) -> in.onEdgeReached(_pos);
    }

    @FunctionalInterface
    public interface OnMoveFocusOut {
        /**
         * Emitted when focus is moved away from the scrolled window by a
         * <br>keybinding.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are
         * <br>`Ctrl + Tab` to move forward and `Ctrl + Shift + Tab` to
         * <br>move backward.
         * @param direction_type either %GTK_DIR_TAB_FORWARD or   %GTK_DIR_TAB_BACKWARD
        */
        void onMoveFocusOut(int direction_type);
    }
    
    private static com.sun.jna.Callback toOnMoveFocusOut(OnMoveFocusOut in) {
        return (in == null) ? null: (JnaScrolledWindow.OnMoveFocusOut) (__self, _direction_type, __data) -> in.onMoveFocusOut(_direction_type);
    }

    @FunctionalInterface
    public interface OnScrollChild {
        /**
         * Emitted when a keybinding that scrolls is pressed.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The horizontal or vertical adjustment is updated which triggers a
         * <br>signal that the scrolled window’s child may listen to and scroll itself.
         * @param scroll a `GtkScrollType` describing how much to scroll
         * @param horizontal whether the keybinding scrolls the child   horizontally or not
         * @return 
        */
        boolean onScrollChild(int scroll, boolean horizontal);
    }
    
    private static com.sun.jna.Callback toOnScrollChild(OnScrollChild in) {
        return (in == null) ? null: (JnaScrolledWindow.OnScrollChild) (__self, _scroll, _horizontal, __data) -> in.onScrollChild(_scroll, _horizontal);
    }

    public ScrolledWindow(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new scrolled window.
    */
    public ScrolledWindow() {
        super(cast(JnaScrolledWindow.INST().gtk_scrolled_window_new()));
    }

    /**
     * Gets the child widget of &#64;scrolled_window.
     * @return the child widget of &#64;scrolled_window
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaScrolledWindow.INST().gtk_scrolled_window_get_child(asCPointer())));
    }

    /**
     * Returns the horizontal scrollbar’s adjustment.
     * <br>
     * <br>This is the adjustment used to connect the horizontal scrollbar
     * <br>to the child widget’s horizontal scroll functionality.
     * @return the horizontal `GtkAdjustment`
    */
    public Adjustment getHadjustment()  {
        return new Adjustment(new PointerContainer(JnaScrolledWindow.INST().gtk_scrolled_window_get_hadjustment(asCPointer())));
    }

    /**
     * Gets whether the scrolled window draws a frame.
     * @return %TRUE if the &#64;scrolled_window has a frame
    */
    public boolean getHasFrame()  {
        return JnaScrolledWindow.INST().gtk_scrolled_window_get_has_frame(asCPointer());
    }

    /**
     * Returns the horizontal scrollbar of &#64;scrolled_window.
     * @return the horizontal scrollbar of the scrolled window.
    */
    public Widget getHscrollbar()  {
        return new Widget(new PointerContainer(JnaScrolledWindow.INST().gtk_scrolled_window_get_hscrollbar(asCPointer())));
    }

    /**
     * Returns the specified kinetic scrolling behavior.
     * @return the scrolling behavior flags.
    */
    public boolean getKineticScrolling()  {
        return JnaScrolledWindow.INST().gtk_scrolled_window_get_kinetic_scrolling(asCPointer());
    }

    /**
     * Returns the maximum content height set.
     * @return the maximum content height, or -1
    */
    public int getMaxContentHeight()  {
        return JnaScrolledWindow.INST().gtk_scrolled_window_get_max_content_height(asCPointer());
    }

    /**
     * Returns the maximum content width set.
     * @return the maximum content width, or -1
    */
    public int getMaxContentWidth()  {
        return JnaScrolledWindow.INST().gtk_scrolled_window_get_max_content_width(asCPointer());
    }

    /**
     * Gets the minimal content height of &#64;scrolled_window.
     * @return the minimal content height
    */
    public int getMinContentHeight()  {
        return JnaScrolledWindow.INST().gtk_scrolled_window_get_min_content_height(asCPointer());
    }

    /**
     * Gets the minimum content width of &#64;scrolled_window.
     * @return the minimum content width
    */
    public int getMinContentWidth()  {
        return JnaScrolledWindow.INST().gtk_scrolled_window_get_min_content_width(asCPointer());
    }

    /**
     * Returns whether overlay scrolling is enabled for this scrolled window.
     * @return %TRUE if overlay scrolling is enabled
    */
    public boolean getOverlayScrolling()  {
        return JnaScrolledWindow.INST().gtk_scrolled_window_get_overlay_scrolling(asCPointer());
    }

    /**
     * Gets the placement of the contents with respect to the scrollbars.
     * @return the current placement value.
    */
    public int getPlacement()  {
        return JnaScrolledWindow.INST().gtk_scrolled_window_get_placement(asCPointer());
    }

    /**
     * Retrieves the current policy values for the horizontal and vertical
     * <br>scrollbars.
     * <br>
     * <br>See [method&#64;Gtk.ScrolledWindow.set_policy].
     * @param hscrollbar_policy location to store the policy   for the horizontal scrollbar
     * @param vscrollbar_policy location to store the policy   for the vertical scrollbar
    */
    public void getPolicy(@Nullable ch.bailu.gtk.type.Int hscrollbar_policy, @Nullable ch.bailu.gtk.type.Int vscrollbar_policy)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_get_policy(asCPointer(), asCPointer(hscrollbar_policy), asCPointer(vscrollbar_policy));
    }

    /**
     * Reports whether the natural height of the child will be calculated
     * <br>and propagated through the scrolled window’s requested natural height.
     * @return whether natural height propagation is enabled.
    */
    public boolean getPropagateNaturalHeight()  {
        return JnaScrolledWindow.INST().gtk_scrolled_window_get_propagate_natural_height(asCPointer());
    }

    /**
     * Reports whether the natural width of the child will be calculated
     * <br>and propagated through the scrolled window’s requested natural width.
     * @return whether natural width propagation is enabled.
    */
    public boolean getPropagateNaturalWidth()  {
        return JnaScrolledWindow.INST().gtk_scrolled_window_get_propagate_natural_width(asCPointer());
    }

    /**
     * Returns the vertical scrollbar’s adjustment.
     * <br>
     * <br>This is the adjustment used to connect the vertical
     * <br>scrollbar to the child widget’s vertical scroll functionality.
     * @return the vertical `GtkAdjustment`
    */
    public Adjustment getVadjustment()  {
        return new Adjustment(new PointerContainer(JnaScrolledWindow.INST().gtk_scrolled_window_get_vadjustment(asCPointer())));
    }

    /**
     * Returns the vertical scrollbar of &#64;scrolled_window.
     * @return the vertical scrollbar of the scrolled window.
    */
    public Widget getVscrollbar()  {
        return new Widget(new PointerContainer(JnaScrolledWindow.INST().gtk_scrolled_window_get_vscrollbar(asCPointer())));
    }

    /**
     * Sets the child widget of &#64;scrolled_window.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the `GtkAdjustment` for the horizontal scrollbar.
     * @param hadjustment the `GtkAdjustment` to use, or %NULL to create a new one
    */
    public void setHadjustment(@Nullable Adjustment hadjustment)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_hadjustment(asCPointer(), asCPointer(hadjustment));
    }

    /**
     * Changes the frame drawn around the contents of &#64;scrolled_window.
     * @param has_frame whether to draw a frame around scrolled window contents
    */
    public void setHasFrame(boolean has_frame)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_has_frame(asCPointer(), has_frame);
    }

    /**
     * Turns kinetic scrolling on or off.
     * <br>
     * <br>Kinetic scrolling only applies to devices with source
     * <br>%GDK_SOURCE_TOUCHSCREEN.
     * @param kinetic_scrolling %TRUE to enable kinetic scrolling
    */
    public void setKineticScrolling(boolean kinetic_scrolling)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_kinetic_scrolling(asCPointer(), kinetic_scrolling);
    }

    /**
     * Sets the maximum height that &#64;scrolled_window should keep visible.
     * <br>
     * <br>The &#64;scrolled_window will grow up to this height before it starts
     * <br>scrolling the content.
     * <br>
     * <br>It is a programming error to set the maximum content height to a value
     * <br>smaller than [property&#64;Gtk.ScrolledWindow:min-content-height].
     * @param height the maximum content height
    */
    public void setMaxContentHeight(int height)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_max_content_height(asCPointer(), height);
    }

    /**
     * Sets the maximum width that &#64;scrolled_window should keep visible.
     * <br>
     * <br>The &#64;scrolled_window will grow up to this width before it starts
     * <br>scrolling the content.
     * <br>
     * <br>It is a programming error to set the maximum content width to a
     * <br>value smaller than [property&#64;Gtk.ScrolledWindow:min-content-width].
     * @param width the maximum content width
    */
    public void setMaxContentWidth(int width)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_max_content_width(asCPointer(), width);
    }

    /**
     * Sets the minimum height that &#64;scrolled_window should keep visible.
     * <br>
     * <br>Note that this can and (usually will) be smaller than the minimum
     * <br>size of the content.
     * <br>
     * <br>It is a programming error to set the minimum content height to a
     * <br>value greater than [property&#64;Gtk.ScrolledWindow:max-content-height].
     * @param height the minimal content height
    */
    public void setMinContentHeight(int height)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_min_content_height(asCPointer(), height);
    }

    /**
     * Sets the minimum width that &#64;scrolled_window should keep visible.
     * <br>
     * <br>Note that this can and (usually will) be smaller than the minimum
     * <br>size of the content.
     * <br>
     * <br>It is a programming error to set the minimum content width to a
     * <br>value greater than [property&#64;Gtk.ScrolledWindow:max-content-width].
     * @param width the minimal content width
    */
    public void setMinContentWidth(int width)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_min_content_width(asCPointer(), width);
    }

    /**
     * Enables or disables overlay scrolling for this scrolled window.
     * @param overlay_scrolling whether to enable overlay scrolling
    */
    public void setOverlayScrolling(boolean overlay_scrolling)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_overlay_scrolling(asCPointer(), overlay_scrolling);
    }

    /**
     * Sets the placement of the contents with respect to the scrollbars
     * <br>for the scrolled window.
     * <br>
     * <br>The default is %GTK_CORNER_TOP_LEFT, meaning the child is
     * <br>in the top left, with the scrollbars underneath and to the right.
     * <br>Other values in [enum&#64;Gtk.CornerType] are %GTK_CORNER_TOP_RIGHT,
     * <br>%GTK_CORNER_BOTTOM_LEFT, and %GTK_CORNER_BOTTOM_RIGHT.
     * <br>
     * <br>See also [method&#64;Gtk.ScrolledWindow.get_placement] and
     * <br>[method&#64;Gtk.ScrolledWindow.unset_placement].
     * @param window_placement position of the child window
    */
    public void setPlacement(int window_placement)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_placement(asCPointer(), window_placement);
    }

    /**
     * Sets the scrollbar policy for the horizontal and vertical scrollbars.
     * <br>
     * <br>The policy determines when the scrollbar should appear; it is a value
     * <br>from the [enum&#64;Gtk.PolicyType] enumeration. If %GTK_POLICY_ALWAYS, the
     * <br>scrollbar is always present; if %GTK_POLICY_NEVER, the scrollbar is
     * <br>never present; if %GTK_POLICY_AUTOMATIC, the scrollbar is present only
     * <br>if needed (that is, if the slider part of the bar would be smaller
     * <br>than the trough — the display is larger than the page size).
     * @param hscrollbar_policy policy for horizontal bar
     * @param vscrollbar_policy policy for vertical bar
    */
    public void setPolicy(int hscrollbar_policy, int vscrollbar_policy)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_policy(asCPointer(), hscrollbar_policy, vscrollbar_policy);
    }

    /**
     * Sets whether the natural height of the child should be calculated
     * <br>and propagated through the scrolled window’s requested natural height.
     * @param propagate whether to propagate natural height
    */
    public void setPropagateNaturalHeight(boolean propagate)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_propagate_natural_height(asCPointer(), propagate);
    }

    /**
     * Sets whether the natural width of the child should be calculated
     * <br>and propagated through the scrolled window’s requested natural width.
     * @param propagate whether to propagate natural width
    */
    public void setPropagateNaturalWidth(boolean propagate)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_propagate_natural_width(asCPointer(), propagate);
    }

    /**
     * Sets the `GtkAdjustment` for the vertical scrollbar.
     * @param vadjustment the `GtkAdjustment` to use, or %NULL to create a new one
    */
    public void setVadjustment(@Nullable Adjustment vadjustment)  {
        JnaScrolledWindow.INST().gtk_scrolled_window_set_vadjustment(asCPointer(), asCPointer(vadjustment));
    }

    /**
     * Unsets the placement of the contents with respect to the scrollbars.
     * <br>
     * <br>If no window placement is set for a scrolled window,
     * <br>it defaults to %GTK_CORNER_TOP_LEFT.
    */
    public void unsetPlacement()  {
        JnaScrolledWindow.INST().gtk_scrolled_window_unset_placement(asCPointer());
    }

    public final static String SIGNAL_ON_EDGE_OVERSHOT = "edge-overshot";
    
    /**
     * Connect to signal "edge-overshot".
     * <br>See {@link OnEdgeOvershot#onEdgeOvershot} for signal description.
     * <br>Field {@link #SIGNAL_ON_EDGE_OVERSHOT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEdgeOvershot(OnEdgeOvershot signal) {
        return connectSignal(SIGNAL_ON_EDGE_OVERSHOT, toOnEdgeOvershot(signal));
    }

    public final static String SIGNAL_ON_EDGE_REACHED = "edge-reached";
    
    /**
     * Connect to signal "edge-reached".
     * <br>See {@link OnEdgeReached#onEdgeReached} for signal description.
     * <br>Field {@link #SIGNAL_ON_EDGE_REACHED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEdgeReached(OnEdgeReached signal) {
        return connectSignal(SIGNAL_ON_EDGE_REACHED, toOnEdgeReached(signal));
    }

    public final static String SIGNAL_ON_MOVE_FOCUS_OUT = "move-focus-out";
    
    /**
     * Connect to signal "move-focus-out".
     * <br>See {@link OnMoveFocusOut#onMoveFocusOut} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOVE_FOCUS_OUT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMoveFocusOut(OnMoveFocusOut signal) {
        return connectSignal(SIGNAL_ON_MOVE_FOCUS_OUT, toOnMoveFocusOut(signal));
    }

    public final static String SIGNAL_ON_SCROLL_CHILD = "scroll-child";
    
    /**
     * Connect to signal "scroll-child".
     * <br>See {@link OnScrollChild#onScrollChild} for signal description.
     * <br>Field {@link #SIGNAL_ON_SCROLL_CHILD} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onScrollChild(OnScrollChild signal) {
        return connectSignal(SIGNAL_ON_SCROLL_CHILD, toOnScrollChild(signal));
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
        return JnaScrolledWindow.INST().gtk_scrolled_window_get_type(); 
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
