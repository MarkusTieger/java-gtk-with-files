/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkDropTarget` is an event controller to receive Drag-and-Drop operations.
 * <br>
 * <br>The most basic way to use a `GtkDropTarget` to receive drops on a
 * <br>widget is to create it via [ctor&#64;Gtk.DropTarget.new], passing in the
 * <br>`GType` of the data you want to receive and connect to the
 * <br>[signal&#64;Gtk.DropTarget::drop] signal to receive the data:
 * <br>
 * <br>```c
 * <br>static gboolean
 * <br>on_drop (GtkDropTarget *target,
 * <br>         const GValue  *value,
 * <br>         double         x,
 * <br>         double         y,
 * <br>         gpointer       data)
 * <br>{
 * <br>  MyWidget *self = data;
 * <br>
 * <br>  // Call the appropriate setter depending on the type of data
 * <br>  // that we received
 * <br>  if (G_VALUE_HOLDS (value, G_TYPE_FILE))
 * <br>    my_widget_set_file (self, g_value_get_object (value));
 * <br>  else if (G_VALUE_HOLDS (value, GDK_TYPE_PIXBUF))
 * <br>    my_widget_set_pixbuf (self, g_value_get_object (value));
 * <br>  else
 * <br>    return FALSE;
 * <br>
 * <br>  return TRUE;
 * <br>}
 * <br>
 * <br>static void
 * <br>my_widget_init (MyWidget *self)
 * <br>{
 * <br>  GtkDropTarget *target =
 * <br>    gtk_drop_target_new (G_TYPE_INVALID, GDK_ACTION_COPY);
 * <br>
 * <br>  // This widget accepts two types of drop types: GFile objects
 * <br>  // and GdkPixbuf objects
 * <br>  gtk_drop_target_set_gtypes (target, (GTypes [2]) {
 * <br>    G_TYPE_FILE,
 * <br>    GDK_TYPE_PIXBUF,
 * <br>  }, 2);
 * <br>
 * <br>  g_signal_connect (target, &quot;drop&quot;, G_CALLBACK (on_drop), self);
 * <br>  gtk_widget_add_controller (GTK_WIDGET (self), GTK_EVENT_CONTROLLER (target));
 * <br>}
 * <br>```
 * <br>
 * <br>`GtkDropTarget` supports more options, such as:
 * <br>
 * <br> * rejecting potential drops via the [signal&#64;Gtk.DropTarget::accept] signal
 * <br>   and the [method&#64;Gtk.DropTarget.reject] function to let other drop
 * <br>   targets handle the drop
 * <br> * tracking an ongoing drag operation before the drop via the
 * <br>   [signal&#64;Gtk.DropTarget::enter], [signal&#64;Gtk.DropTarget::motion] and
 * <br>   [signal&#64;Gtk.DropTarget::leave] signals
 * <br> * configuring how to receive data by setting the
 * <br>   [property&#64;Gtk.DropTarget:preload] property and listening for its
 * <br>   availability via the [property&#64;Gtk.DropTarget:value] property
 * <br>
 * <br>However, `GtkDropTarget` is ultimately modeled in a synchronous way
 * <br>and only supports data transferred via `GType`. If you want full control
 * <br>over an ongoing drop, the [class&#64;Gtk.DropTargetAsync] object gives you
 * <br>this ability.
 * <br>
 * <br>While a pointer is dragged over the drop target's widget and the drop
 * <br>has not been rejected, that widget will receive the
 * <br>%GTK_STATE_FLAG_DROP_ACTIVE state, which can be used to style the widget.
 * <br>
 * <br>If you are not interested in receiving the drop, but just want to update
 * <br>UI state during a Drag-and-Drop operation (e.g. switching tabs), you can
 * <br>use [class&#64;Gtk.DropControllerMotion].
 * <p><a href="https://docs.gtk.org/gtk4/class.DropTarget.html">https://docs.gtk.org/gtk4/class.DropTarget.html</a></p>
*/
public class DropTarget extends EventController {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DropTarget.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAccept {
        /**
         * Emitted on the drop site when a drop operation is about to begin.
         * <br>
         * <br>If the drop is not accepted, %FALSE will be returned and the drop target
         * <br>will ignore the drop. If %TRUE is returned, the drop is accepted for now
         * <br>but may be rejected later via a call to [method&#64;Gtk.DropTarget.reject]
         * <br>or ultimately by returning %FALSE from a [signal&#64;Gtk.DropTarget::drop]
         * <br>handler.
         * <br>
         * <br>The default handler for this signal decides whether to accept the drop
         * <br>based on the formats provided by the &#64;drop.
         * <br>
         * <br>If the decision whether the drop will be accepted or rejected depends
         * <br>on the data, this function should return %TRUE, the
         * <br>[property&#64;Gtk.DropTarget:preload] property should be set and the value
         * <br>should be inspected via the ::notify:value signal, calling
         * <br>[method&#64;Gtk.DropTarget.reject] if required.
         * @param drop the `GdkDrop`
         * @return %TRUE if &#64;drop is accepted
        */
        boolean onAccept(@Nonnull ch.bailu.gtk.gdk.Drop drop);
    }
    
    private static com.sun.jna.Callback toOnAccept(OnAccept in) {
        return (in == null) ? null: (JnaDropTarget.OnAccept) (__self, _drop, __data) -> in.onAccept(new ch.bailu.gtk.gdk.Drop(new PointerContainer(_drop)));
    }

    @FunctionalInterface
    public interface OnDrop {
        /**
         * Emitted on the drop site when the user drops the data onto the widget.
         * <br>
         * <br>The signal handler must determine whether the pointer position is in
         * <br>a drop zone or not. If it is not in a drop zone, it returns %FALSE
         * <br>and no further processing is necessary.
         * <br>
         * <br>Otherwise, the handler returns %TRUE. In this case, this handler will
         * <br>accept the drop. The handler is responsible for using the given &#64;value
         * <br>and performing the drop operation.
         * @param value the `GValue` being dropped
         * @param x the x coordinate of the current pointer position
         * @param y the y coordinate of the current pointer position
         * @return whether the drop was accepted at the given pointer position
        */
        boolean onDrop(@Nonnull ch.bailu.gtk.gobject.Value value, double x, double y);
    }
    
    private static com.sun.jna.Callback toOnDrop(OnDrop in) {
        return (in == null) ? null: (JnaDropTarget.OnDrop) (__self, _value, _x, _y, __data) -> in.onDrop(new ch.bailu.gtk.gobject.Value(new PointerContainer(_value)), _x, _y);
    }

    @FunctionalInterface
    public interface OnEnter {
        /**
         * Emitted on the drop site when the pointer enters the widget.
         * <br>
         * <br>It can be used to set up custom highlighting.
         * @param x the x coordinate of the current pointer position
         * @param y the y coordinate of the current pointer position
         * @return Preferred action for this drag operation or 0 if   dropping is not supported at the current &#64;x,&#64;y location.
        */
        int onEnter(double x, double y);
    }
    
    private static com.sun.jna.Callback toOnEnter(OnEnter in) {
        return (in == null) ? null: (JnaDropTarget.OnEnter) (__self, _x, _y, __data) -> in.onEnter(_x, _y);
    }

    @FunctionalInterface
    public interface OnLeave {
        /**
         * Emitted on the drop site when the pointer leaves the widget.
         * <br>
         * <br>Its main purpose it to undo things done in
         * <br>[signal&#64;Gtk.DropTarget::enter].
        */
        void onLeave();
    }
    
    private static com.sun.jna.Callback toOnLeave(OnLeave in) {
        return (in == null) ? null: (JnaDropTarget.OnLeave) (__self, __data) -> in.onLeave();
    }

    @FunctionalInterface
    public interface OnMotion {
        /**
         * Emitted while the pointer is moving over the drop target.
         * @param x the x coordinate of the current pointer position
         * @param y the y coordinate of the current pointer position
         * @return Preferred action for this drag operation or 0 if   dropping is not supported at the current &#64;x,&#64;y location.
        */
        int onMotion(double x, double y);
    }
    
    private static com.sun.jna.Callback toOnMotion(OnMotion in) {
        return (in == null) ? null: (JnaDropTarget.OnMotion) (__self, _x, _y, __data) -> in.onMotion(_x, _y);
    }

    public DropTarget(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkDropTarget` object.
     * <br>
     * <br>If the drop target should support more than 1 type, pass
     * <br>%G_TYPE_INVALID for &#64;type and then call
     * <br>[method&#64;Gtk.DropTarget.set_gtypes].
     * @param type The supported type or %G_TYPE_INVALID
     * @param actions the supported actions
    */
    public DropTarget(long type, int actions) {
        super(cast(JnaDropTarget.INST().gtk_drop_target_new(type, actions)));
    }

    /**
     * Gets the actions that this drop target supports.
     * @return the actions that this drop target supports
    */
    public int getActions()  {
        return JnaDropTarget.INST().gtk_drop_target_get_actions(asCPointer());
    }

    /**
     * Gets the currently handled drop operation.
     * <br>
     * <br>If no drop operation is going on, %NULL is returned.
     * @return The current drop
    */
    public ch.bailu.gtk.gdk.Drop getCurrentDrop()  {
        return new ch.bailu.gtk.gdk.Drop(new PointerContainer(JnaDropTarget.INST().gtk_drop_target_get_current_drop(asCPointer())));
    }

    /**
     * Gets the data formats that this drop target accepts.
     * <br>
     * <br>If the result is %NULL, all formats are expected to be supported.
     * @return the supported data formats
    */
    public ch.bailu.gtk.gdk.ContentFormats getFormats()  {
        return new ch.bailu.gtk.gdk.ContentFormats(new PointerContainer(JnaDropTarget.INST().gtk_drop_target_get_formats(asCPointer())));
    }

    /**
     * Gets whether data should be preloaded on hover.
     * @return %TRUE if drop data should be preloaded
    */
    public boolean getPreload()  {
        return JnaDropTarget.INST().gtk_drop_target_get_preload(asCPointer());
    }

    /**
     * Gets the current drop data, as a `GValue`.
     * @return The current drop data
    */
    public ch.bailu.gtk.gobject.Value getValue()  {
        return new ch.bailu.gtk.gobject.Value(new PointerContainer(JnaDropTarget.INST().gtk_drop_target_get_value(asCPointer())));
    }

    /**
     * Rejects the ongoing drop operation.
     * <br>
     * <br>If no drop operation is ongoing, i.e when [property&#64;Gtk.DropTarget:current-drop]
     * <br>is %NULL, this function does nothing.
     * <br>
     * <br>This function should be used when delaying the decision
     * <br>on whether to accept a drag or not until after reading
     * <br>the data.
    */
    public void reject()  {
        JnaDropTarget.INST().gtk_drop_target_reject(asCPointer());
    }

    /**
     * Sets the actions that this drop target supports.
     * @param actions the supported actions
    */
    public void setActions(int actions)  {
        JnaDropTarget.INST().gtk_drop_target_set_actions(asCPointer(), actions);
    }

    /**
     * Sets the supported `GTypes` for this drop target.
     * @param types all supported `GType`s   that can be dropped on the target
     * @param n_types number of &#64;types
    */
    public void setGtypes(@Nullable ch.bailu.gtk.type.Int64 types, long n_types)  {
        JnaDropTarget.INST().gtk_drop_target_set_gtypes(asCPointer(), asCPointer(types), n_types);
    }

    /**
     * Sets whether data should be preloaded on hover.
     * @param preload %TRUE to preload drop data
    */
    public void setPreload(boolean preload)  {
        JnaDropTarget.INST().gtk_drop_target_set_preload(asCPointer(), preload);
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

    public final static String SIGNAL_ON_ENTER = "enter";
    
    /**
     * Connect to signal "enter".
     * <br>See {@link OnEnter#onEnter} for signal description.
     * <br>Field {@link #SIGNAL_ON_ENTER} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEnter(OnEnter signal) {
        return connectSignal(SIGNAL_ON_ENTER, toOnEnter(signal));
    }

    public final static String SIGNAL_ON_LEAVE = "leave";
    
    /**
     * Connect to signal "leave".
     * <br>See {@link OnLeave#onLeave} for signal description.
     * <br>Field {@link #SIGNAL_ON_LEAVE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLeave(OnLeave signal) {
        return connectSignal(SIGNAL_ON_LEAVE, toOnLeave(signal));
    }

    public final static String SIGNAL_ON_MOTION = "motion";
    
    /**
     * Connect to signal "motion".
     * <br>See {@link OnMotion#onMotion} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOTION} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMotion(OnMotion signal) {
        return connectSignal(SIGNAL_ON_MOTION, toOnMotion(signal));
    }

    public static long getTypeID() { 
        return JnaDropTarget.INST().gtk_drop_target_get_type(); 
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

[MethodModel:cb-deprecated:getDrop:[ParameterModel:Supported:{Gg:Drop:{c:GdkDrop*}}:{j:long}]]

[MethodModel:cb-return-value-not-supported:getGtypes:[ParameterModel:java-type-not-supported:{G_::{c:const GType*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
*/
