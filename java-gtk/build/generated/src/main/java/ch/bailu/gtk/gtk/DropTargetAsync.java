/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkDropTargetAsync` is an event controller to receive Drag-and-Drop
 * <br>operations, asynchronously.
 * <br>
 * <br>It is the more complete but also more complex method of handling drop
 * <br>operations compared to [class&#64;Gtk.DropTarget], and you should only use
 * <br>it if `GtkDropTarget` doesn't provide all the features you need.
 * <br>
 * <br>To use a `GtkDropTargetAsync` to receive drops on a widget, you create
 * <br>a `GtkDropTargetAsync` object, configure which data formats and actions
 * <br>you support, connect to its signals, and then attach it to the widget
 * <br>with [method&#64;Gtk.Widget.add_controller].
 * <br>
 * <br>During a drag operation, the first signal that a `GtkDropTargetAsync`
 * <br>emits is [signal&#64;Gtk.DropTargetAsync::accept], which is meant to determine
 * <br>whether the target is a possible drop site for the ongoing drop. The
 * <br>default handler for the ::accept signal accepts the drop if it finds
 * <br>a compatible data format and an action that is supported on both sides.
 * <br>
 * <br>If it is, and the widget becomes a target, you will receive a
 * <br>[signal&#64;Gtk.DropTargetAsync::drag-enter] signal, followed by
 * <br>[signal&#64;Gtk.DropTargetAsync::drag-motion] signals as the pointer moves,
 * <br>optionally a [signal&#64;Gtk.DropTargetAsync::drop] signal when a drop happens,
 * <br>and finally a [signal&#64;Gtk.DropTargetAsync::drag-leave] signal when the
 * <br>pointer moves off the widget.
 * <br>
 * <br>The ::drag-enter and ::drag-motion handler return a `GdkDragAction`
 * <br>to update the status of the ongoing operation. The ::drop handler
 * <br>should decide if it ultimately accepts the drop and if it does, it
 * <br>should initiate the data transfer and finish the operation by calling
 * <br>[method&#64;Gdk.Drop.finish].
 * <br>
 * <br>Between the ::drag-enter and ::drag-leave signals the widget is a
 * <br>current drop target, and will receive the %GTK_STATE_FLAG_DROP_ACTIVE
 * <br>state, which can be used by themes to style the widget as a drop target.
 * <p><a href="https://docs.gtk.org/gtk4/class.DropTargetAsync.html">https://docs.gtk.org/gtk4/class.DropTargetAsync.html</a></p>
*/
public class DropTargetAsync extends EventController {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DropTargetAsync.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAccept {
        /**
         * Emitted on the drop site when a drop operation is about to begin.
         * <br>
         * <br>If the drop is not accepted, %FALSE will be returned and the drop target
         * <br>will ignore the drop. If %TRUE is returned, the drop is accepted for now
         * <br>but may be rejected later via a call to [method&#64;Gtk.DropTargetAsync.reject_drop]
         * <br>or ultimately by returning %FALSE from a [signal&#64;Gtk.DropTargetAsync::drop]
         * <br>handler.
         * <br>
         * <br>The default handler for this signal decides whether to accept the drop
         * <br>based on the formats provided by the &#64;drop.
         * <br>
         * <br>If the decision whether the drop will be accepted or rejected needs
         * <br>further processing, such as inspecting the data, this function should
         * <br>return %TRUE and proceed as is &#64;drop was accepted and if it decides to
         * <br>reject the drop later, it should call [method&#64;Gtk.DropTargetAsync.reject_drop].
         * @param drop the `GdkDrop`
         * @return %TRUE if &#64;drop is accepted
        */
        boolean onAccept(@Nonnull ch.bailu.gtk.gdk.Drop drop);
    }
    
    private static com.sun.jna.Callback toOnAccept(OnAccept in) {
        return (in == null) ? null: (JnaDropTargetAsync.OnAccept) (__self, _drop, __data) -> in.onAccept(new ch.bailu.gtk.gdk.Drop(new PointerContainer(_drop)));
    }

    @FunctionalInterface
    public interface OnDragEnter {
        /**
         * Emitted on the drop site when the pointer enters the widget.
         * <br>
         * <br>It can be used to set up custom highlighting.
         * @param drop the `GdkDrop`
         * @param x the x coordinate of the current pointer position
         * @param y the y coordinate of the current pointer position
         * @return Preferred action for this drag operation.
        */
        int onDragEnter(@Nonnull ch.bailu.gtk.gdk.Drop drop, double x, double y);
    }
    
    private static com.sun.jna.Callback toOnDragEnter(OnDragEnter in) {
        return (in == null) ? null: (JnaDropTargetAsync.OnDragEnter) (__self, _drop, _x, _y, __data) -> in.onDragEnter(new ch.bailu.gtk.gdk.Drop(new PointerContainer(_drop)), _x, _y);
    }

    @FunctionalInterface
    public interface OnDragLeave {
        /**
         * Emitted on the drop site when the pointer leaves the widget.
         * <br>
         * <br>Its main purpose it to undo things done in
         * <br>`GtkDropTargetAsync`::drag-enter.
         * @param drop the `GdkDrop`
        */
        void onDragLeave(@Nonnull ch.bailu.gtk.gdk.Drop drop);
    }
    
    private static com.sun.jna.Callback toOnDragLeave(OnDragLeave in) {
        return (in == null) ? null: (JnaDropTargetAsync.OnDragLeave) (__self, _drop, __data) -> in.onDragLeave(new ch.bailu.gtk.gdk.Drop(new PointerContainer(_drop)));
    }

    @FunctionalInterface
    public interface OnDragMotion {
        /**
         * Emitted while the pointer is moving over the drop target.
         * @param drop the `GdkDrop`
         * @param x the x coordinate of the current pointer position
         * @param y the y coordinate of the current pointer position
         * @return Preferred action for this drag operation.
        */
        int onDragMotion(@Nonnull ch.bailu.gtk.gdk.Drop drop, double x, double y);
    }
    
    private static com.sun.jna.Callback toOnDragMotion(OnDragMotion in) {
        return (in == null) ? null: (JnaDropTargetAsync.OnDragMotion) (__self, _drop, _x, _y, __data) -> in.onDragMotion(new ch.bailu.gtk.gdk.Drop(new PointerContainer(_drop)), _x, _y);
    }

    @FunctionalInterface
    public interface OnDrop {
        /**
         * Emitted on the drop site when the user drops the data onto the widget.
         * <br>
         * <br>The signal handler must determine whether the pointer position is in a
         * <br>drop zone or not. If it is not in a drop zone, it returns %FALSE and no
         * <br>further processing is necessary.
         * <br>
         * <br>Otherwise, the handler returns %TRUE. In this case, this handler will
         * <br>accept the drop. The handler must ensure that [method&#64;Gdk.Drop.finish]
         * <br>is called to let the source know that the drop is done. The call to
         * <br>[method&#64;Gdk.Drop.finish] must only be done when all data has been received.
         * <br>
         * <br>To receive the data, use one of the read functions provided by
         * <br>[class&#64;Gdk.Drop] such as [method&#64;Gdk.Drop.read_async] or
         * <br>[method&#64;Gdk.Drop.read_value_async].
         * @param drop the `GdkDrop`
         * @param x the x coordinate of the current pointer position
         * @param y the y coordinate of the current pointer position
         * @return whether the drop is accepted at the given pointer position
        */
        boolean onDrop(@Nonnull ch.bailu.gtk.gdk.Drop drop, double x, double y);
    }
    
    private static com.sun.jna.Callback toOnDrop(OnDrop in) {
        return (in == null) ? null: (JnaDropTargetAsync.OnDrop) (__self, _drop, _x, _y, __data) -> in.onDrop(new ch.bailu.gtk.gdk.Drop(new PointerContainer(_drop)), _x, _y);
    }

    public DropTargetAsync(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkDropTargetAsync` object.
     * @param formats the supported data formats
     * @param actions the supported actions
    */
    public DropTargetAsync(@Nullable ch.bailu.gtk.gdk.ContentFormats formats, int actions) {
        super(cast(JnaDropTargetAsync.INST().gtk_drop_target_async_new(asCPointer(formats), actions)));
    }

    /**
     * Gets the actions that this drop target supports.
     * @return the actions that this drop target supports
    */
    public int getActions()  {
        return JnaDropTargetAsync.INST().gtk_drop_target_async_get_actions(asCPointer());
    }

    /**
     * Gets the data formats that this drop target accepts.
     * <br>
     * <br>If the result is %NULL, all formats are expected to be supported.
     * @return the supported data formats
    */
    public ch.bailu.gtk.gdk.ContentFormats getFormats()  {
        return new ch.bailu.gtk.gdk.ContentFormats(new PointerContainer(JnaDropTargetAsync.INST().gtk_drop_target_async_get_formats(asCPointer())));
    }

    /**
     * Sets the &#64;drop as not accepted on this drag site.
     * <br>
     * <br>This function should be used when delaying the decision
     * <br>on whether to accept a drag or not until after reading
     * <br>the data.
     * @param drop the `GdkDrop` of an ongoing drag operation
    */
    public void rejectDrop(@Nonnull ch.bailu.gtk.gdk.Drop drop)  {
        JnaDropTargetAsync.INST().gtk_drop_target_async_reject_drop(asCPointer(), asCPointerNotNull(drop));
    }

    /**
     * Sets the actions that this drop target supports.
     * @param actions the supported actions
    */
    public void setActions(int actions)  {
        JnaDropTargetAsync.INST().gtk_drop_target_async_set_actions(asCPointer(), actions);
    }

    /**
     * Sets the data formats that this drop target will accept.
     * @param formats the supported data formats or %NULL for any format
    */
    public void setFormats(@Nullable ch.bailu.gtk.gdk.ContentFormats formats)  {
        JnaDropTargetAsync.INST().gtk_drop_target_async_set_formats(asCPointer(), asCPointer(formats));
    }

    public final static String SIGNAL_ON_ACCEPT = "accept";
    
    /**
     * Connect to signal "accept".
     * <br>See {@link OnAccept#onAccept} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACCEPT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAccept(OnAccept signal) {
        return connectSignal(SIGNAL_ON_ACCEPT, toOnAccept(signal));
    }

    public final static String SIGNAL_ON_DRAG_ENTER = "drag-enter";
    
    /**
     * Connect to signal "drag-enter".
     * <br>See {@link OnDragEnter#onDragEnter} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRAG_ENTER} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDragEnter(OnDragEnter signal) {
        return connectSignal(SIGNAL_ON_DRAG_ENTER, toOnDragEnter(signal));
    }

    public final static String SIGNAL_ON_DRAG_LEAVE = "drag-leave";
    
    /**
     * Connect to signal "drag-leave".
     * <br>See {@link OnDragLeave#onDragLeave} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRAG_LEAVE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDragLeave(OnDragLeave signal) {
        return connectSignal(SIGNAL_ON_DRAG_LEAVE, toOnDragLeave(signal));
    }

    public final static String SIGNAL_ON_DRAG_MOTION = "drag-motion";
    
    /**
     * Connect to signal "drag-motion".
     * <br>See {@link OnDragMotion#onDragMotion} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRAG_MOTION} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDragMotion(OnDragMotion signal) {
        return connectSignal(SIGNAL_ON_DRAG_MOTION, toOnDragMotion(signal));
    }

    public final static String SIGNAL_ON_DROP = "drop";
    
    /**
     * Connect to signal "drop".
     * <br>See {@link OnDrop#onDrop} for signal description.
     * <br>Field {@link #SIGNAL_ON_DROP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDrop(OnDrop signal) {
        return connectSignal(SIGNAL_ON_DROP, toOnDrop(signal));
    }

    public static long getTypeID() { 
        return JnaDropTargetAsync.INST().gtk_drop_target_async_get_type(); 
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
