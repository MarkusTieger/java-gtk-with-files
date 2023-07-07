/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A widget with two panes, arranged either horizontally or vertically.
 * <br>
 * <br>![An example GtkPaned](panes.png)
 * <br>
 * <br>The division between the two panes is adjustable by the user
 * <br>by dragging a handle.
 * <br>
 * <br>Child widgets are added to the panes of the widget with
 * <br>[method&#64;Gtk.Paned.set_start_child] and [method&#64;Gtk.Paned.set_end_child].
 * <br>The division between the two children is set by default from the size
 * <br>requests of the children, but it can be adjusted by the user.
 * <br>
 * <br>A paned widget draws a separator between the two child widgets and a
 * <br>small handle that the user can drag to adjust the division. It does not
 * <br>draw any relief around the children or around the separator. (The space
 * <br>in which the separator is called the gutter.) Often, it is useful to put
 * <br>each child inside a [class&#64;Gtk.Frame] so that the gutter appears as a
 * <br>ridge. No separator is drawn if one of the children is missing.
 * <br>
 * <br>Each child has two options that can be set, &quot;resize&quot; and &quot;shrink&quot;. If
 * <br>&quot;resize&quot; is true then, when the `GtkPaned` is resized, that child will
 * <br>expand or shrink along with the paned widget. If &quot;shrink&quot; is true, then
 * <br>that child can be made smaller than its requisition by the user.
 * <br>Setting &quot;shrink&quot; to false allows the application to set a minimum size.
 * <br>If &quot;resize&quot; is false for both children, then this is treated as if
 * <br>&quot;resize&quot; is true for both children.
 * <br>
 * <br>The application can set the position of the slider as if it were set
 * <br>by the user, by calling [method&#64;Gtk.Paned.set_position].
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>paned
 * <br>├── &lt;child&gt;
 * <br>├── separator[.wide]
 * <br>╰── &lt;child&gt;
 * <br>```
 * <br>
 * <br>`GtkPaned` has a main CSS node with name paned, and a subnode for
 * <br>the separator with name separator. The subnode gets a .wide style
 * <br>class when the paned is supposed to be wide.
 * <br>
 * <br>In horizontal orientation, the nodes are arranged based on the text
 * <br>direction, so in left-to-right mode, :first-child will select the
 * <br>leftmost child, while it will select the rightmost child in
 * <br>RTL layouts.
 * <br>
 * <br>&#35;&#35; Creating a paned widget with minimum sizes.
 * <br>
 * <br>```c
 * <br>GtkWidget *hpaned = gtk_paned_new (GTK_ORIENTATION_HORIZONTAL);
 * <br>GtkWidget *frame1 = gtk_frame_new (NULL);
 * <br>GtkWidget *frame2 = gtk_frame_new (NULL);
 * <br>
 * <br>gtk_widget_set_size_request (hpaned, 200, -1);
 * <br>
 * <br>gtk_paned_set_start_child (GTK_PANED (hpaned), frame1);
 * <br>gtk_paned_set_start_child_resize (GTK_PANED (hpaned), TRUE);
 * <br>gtk_paned_set_start_child_shrink (GTK_PANED (hpaned), FALSE);
 * <br>gtk_widget_set_size_request (frame1, 50, -1);
 * <br>
 * <br>gtk_paned_set_end_child (GTK_PANED (hpaned), frame2);
 * <br>gtk_paned_set_end_child_resize (GTK_PANED (hpaned), FALSE);
 * <br>gtk_paned_set_end_child_shrink (GTK_PANED (hpaned), FALSE);
 * <br>gtk_widget_set_size_request (frame2, 50, -1);
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.Paned.html">https://docs.gtk.org/gtk4/class.Paned.html</a></p>
*/
public class Paned extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Paned.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAcceptPosition {
        /**
         * Emitted to accept the current position of the handle when
         * <br>moving it using key bindings.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Return&lt;/kbd&gt; or
         * <br>&lt;kbd&gt;Space&lt;/kbd&gt;.
         * @return 
        */
        boolean onAcceptPosition();
    }
    
    private static com.sun.jna.Callback toOnAcceptPosition(OnAcceptPosition in) {
        return (in == null) ? null: (JnaPaned.OnAcceptPosition) (__self, __data) -> in.onAcceptPosition();
    }

    @FunctionalInterface
    public interface OnCancelPosition {
        /**
         * Emitted to cancel moving the position of the handle using key
         * <br>bindings.
         * <br>
         * <br>The position of the handle will be reset to the value prior to
         * <br>moving it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Escape&lt;/kbd&gt;.
         * @return 
        */
        boolean onCancelPosition();
    }
    
    private static com.sun.jna.Callback toOnCancelPosition(OnCancelPosition in) {
        return (in == null) ? null: (JnaPaned.OnCancelPosition) (__self, __data) -> in.onCancelPosition();
    }

    @FunctionalInterface
    public interface OnCycleChildFocus {
        /**
         * Emitted to cycle the focus between the children of the paned.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding is &lt;kbd&gt;F6&lt;/kbd&gt;.
         * @param reversed whether cycling backward or forward
         * @return 
        */
        boolean onCycleChildFocus(boolean reversed);
    }
    
    private static com.sun.jna.Callback toOnCycleChildFocus(OnCycleChildFocus in) {
        return (in == null) ? null: (JnaPaned.OnCycleChildFocus) (__self, _reversed, __data) -> in.onCycleChildFocus(_reversed);
    }

    @FunctionalInterface
    public interface OnCycleHandleFocus {
        /**
         * Emitted to cycle whether the paned should grab focus to allow
         * <br>the user to change position of the handle by using key bindings.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;F8&lt;/kbd&gt;.
         * @param reversed whether cycling backward or forward
         * @return 
        */
        boolean onCycleHandleFocus(boolean reversed);
    }
    
    private static com.sun.jna.Callback toOnCycleHandleFocus(OnCycleHandleFocus in) {
        return (in == null) ? null: (JnaPaned.OnCycleHandleFocus) (__self, _reversed, __data) -> in.onCycleHandleFocus(_reversed);
    }

    @FunctionalInterface
    public interface OnMoveHandle {
        /**
         * Emitted to move the handle with key bindings.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * @param scroll_type a `GtkScrollType`
         * @return 
        */
        boolean onMoveHandle(int scroll_type);
    }
    
    private static com.sun.jna.Callback toOnMoveHandle(OnMoveHandle in) {
        return (in == null) ? null: (JnaPaned.OnMoveHandle) (__self, _scroll_type, __data) -> in.onMoveHandle(_scroll_type);
    }

    @FunctionalInterface
    public interface OnToggleHandleFocus {
        /**
         * Emitted to accept the current position of the handle and then
         * <br>move focus to the next widget in the focus chain.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding is &lt;kbd&gt;Tab&lt;/kbd&gt;.
         * @return 
        */
        boolean onToggleHandleFocus();
    }
    
    private static com.sun.jna.Callback toOnToggleHandleFocus(OnToggleHandleFocus in) {
        return (in == null) ? null: (JnaPaned.OnToggleHandleFocus) (__self, __data) -> in.onToggleHandleFocus();
    }

    public Paned(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkPaned` widget.
     * @param orientation the paned’s orientation.
    */
    public Paned(int orientation) {
        super(cast(JnaPaned.INST().gtk_paned_new(orientation)));
    }

    /**
     * Retrieves the end child of the given `GtkPaned`.
     * @return the end child widget
    */
    public Widget getEndChild()  {
        return new Widget(new PointerContainer(JnaPaned.INST().gtk_paned_get_end_child(asCPointer())));
    }

    /**
     * Obtains the position of the divider between the two panes.
     * @return the position of the divider, in pixels
    */
    public int getPosition()  {
        return JnaPaned.INST().gtk_paned_get_position(asCPointer());
    }

    /**
     * Returns whether the [property&#64;Gtk.Paned:end-child] can be resized.
     * @return true if the end child is resizable
    */
    public boolean getResizeEndChild()  {
        return JnaPaned.INST().gtk_paned_get_resize_end_child(asCPointer());
    }

    /**
     * Returns whether the [property&#64;Gtk.Paned:start-child] can be resized.
     * @return true if the start child is resizable
    */
    public boolean getResizeStartChild()  {
        return JnaPaned.INST().gtk_paned_get_resize_start_child(asCPointer());
    }

    /**
     * Returns whether the [property&#64;Gtk.Paned:end-child] can shrink.
     * @return true if the end child is shrinkable
    */
    public boolean getShrinkEndChild()  {
        return JnaPaned.INST().gtk_paned_get_shrink_end_child(asCPointer());
    }

    /**
     * Returns whether the [property&#64;Gtk.Paned:start-child] can shrink.
     * @return true if the start child is shrinkable
    */
    public boolean getShrinkStartChild()  {
        return JnaPaned.INST().gtk_paned_get_shrink_start_child(asCPointer());
    }

    /**
     * Retrieves the start child of the given `GtkPaned`.
     * @return the start child widget
    */
    public Widget getStartChild()  {
        return new Widget(new PointerContainer(JnaPaned.INST().gtk_paned_get_start_child(asCPointer())));
    }

    /**
     * Gets whether the separator should be wide.
     * @return %TRUE if the paned should have a wide handle
    */
    public boolean getWideHandle()  {
        return JnaPaned.INST().gtk_paned_get_wide_handle(asCPointer());
    }

    /**
     * Sets the end child of &#64;paned to &#64;child.
     * <br>
     * <br>If &#64;child is `NULL`, the existing child will be removed.
     * @param child the widget to add
    */
    public void setEndChild(@Nullable Widget child)  {
        JnaPaned.INST().gtk_paned_set_end_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the position of the divider between the two panes.
     * @param position pixel position of divider, a negative value means that the position   is unset
    */
    public void setPosition(int position)  {
        JnaPaned.INST().gtk_paned_set_position(asCPointer(), position);
    }

    /**
     * Sets whether the [property&#64;Gtk.Paned:end-child] can be resized.
     * @param resize true to let the end child be resized
    */
    public void setResizeEndChild(boolean resize)  {
        JnaPaned.INST().gtk_paned_set_resize_end_child(asCPointer(), resize);
    }

    /**
     * Sets whether the [property&#64;Gtk.Paned:start-child] can be resized.
     * @param resize true to let the start child be resized
    */
    public void setResizeStartChild(boolean resize)  {
        JnaPaned.INST().gtk_paned_set_resize_start_child(asCPointer(), resize);
    }

    /**
     * Sets whether the [property&#64;Gtk.Paned:end-child] can shrink.
     * @param resize true to let the end child be shrunk
    */
    public void setShrinkEndChild(boolean resize)  {
        JnaPaned.INST().gtk_paned_set_shrink_end_child(asCPointer(), resize);
    }

    /**
     * Sets whether the [property&#64;Gtk.Paned:start-child] can shrink.
     * @param resize true to let the start child be shrunk
    */
    public void setShrinkStartChild(boolean resize)  {
        JnaPaned.INST().gtk_paned_set_shrink_start_child(asCPointer(), resize);
    }

    /**
     * Sets the start child of &#64;paned to &#64;child.
     * <br>
     * <br>If &#64;child is `NULL`, the existing child will be removed.
     * @param child the widget to add
    */
    public void setStartChild(@Nullable Widget child)  {
        JnaPaned.INST().gtk_paned_set_start_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets whether the separator should be wide.
     * @param wide the new value for the [property&#64;Gtk.Paned:wide-handle] property
    */
    public void setWideHandle(boolean wide)  {
        JnaPaned.INST().gtk_paned_set_wide_handle(asCPointer(), wide);
    }

    public final static String SIGNAL_ON_ACCEPT_POSITION = "accept-position";
    
    /**
     * Connect to signal "accept-position".
     * <br>See {@link OnAcceptPosition#onAcceptPosition} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACCEPT_POSITION} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAcceptPosition(OnAcceptPosition signal) {
        return connectSignal(SIGNAL_ON_ACCEPT_POSITION, toOnAcceptPosition(signal));
    }

    public final static String SIGNAL_ON_CANCEL_POSITION = "cancel-position";
    
    /**
     * Connect to signal "cancel-position".
     * <br>See {@link OnCancelPosition#onCancelPosition} for signal description.
     * <br>Field {@link #SIGNAL_ON_CANCEL_POSITION} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCancelPosition(OnCancelPosition signal) {
        return connectSignal(SIGNAL_ON_CANCEL_POSITION, toOnCancelPosition(signal));
    }

    public final static String SIGNAL_ON_CYCLE_CHILD_FOCUS = "cycle-child-focus";
    
    /**
     * Connect to signal "cycle-child-focus".
     * <br>See {@link OnCycleChildFocus#onCycleChildFocus} for signal description.
     * <br>Field {@link #SIGNAL_ON_CYCLE_CHILD_FOCUS} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCycleChildFocus(OnCycleChildFocus signal) {
        return connectSignal(SIGNAL_ON_CYCLE_CHILD_FOCUS, toOnCycleChildFocus(signal));
    }

    public final static String SIGNAL_ON_CYCLE_HANDLE_FOCUS = "cycle-handle-focus";
    
    /**
     * Connect to signal "cycle-handle-focus".
     * <br>See {@link OnCycleHandleFocus#onCycleHandleFocus} for signal description.
     * <br>Field {@link #SIGNAL_ON_CYCLE_HANDLE_FOCUS} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCycleHandleFocus(OnCycleHandleFocus signal) {
        return connectSignal(SIGNAL_ON_CYCLE_HANDLE_FOCUS, toOnCycleHandleFocus(signal));
    }

    public final static String SIGNAL_ON_MOVE_HANDLE = "move-handle";
    
    /**
     * Connect to signal "move-handle".
     * <br>See {@link OnMoveHandle#onMoveHandle} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOVE_HANDLE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMoveHandle(OnMoveHandle signal) {
        return connectSignal(SIGNAL_ON_MOVE_HANDLE, toOnMoveHandle(signal));
    }

    public final static String SIGNAL_ON_TOGGLE_HANDLE_FOCUS = "toggle-handle-focus";
    
    /**
     * Connect to signal "toggle-handle-focus".
     * <br>See {@link OnToggleHandleFocus#onToggleHandleFocus} for signal description.
     * <br>Field {@link #SIGNAL_ON_TOGGLE_HANDLE_FOCUS} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onToggleHandleFocus(OnToggleHandleFocus signal) {
        return connectSignal(SIGNAL_ON_TOGGLE_HANDLE_FOCUS, toOnToggleHandleFocus(signal));
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
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaPaned.INST().gtk_paned_get_type(); 
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
