/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkDragSource` is an event controller to initiate Drag-And-Drop operations.
 * <br>
 * <br>`GtkDragSource` can be set up with the necessary
 * <br>ingredients for a DND operation ahead of time. This includes
 * <br>the source for the data that is being transferred, in the form
 * <br>of a [class&#64;Gdk.ContentProvider], the desired action, and the icon to
 * <br>use during the drag operation. After setting it up, the drag
 * <br>source must be added to a widget as an event controller, using
 * <br>[method&#64;Gtk.Widget.add_controller].
 * <br>
 * <br>```c
 * <br>static void
 * <br>my_widget_init (MyWidget *self)
 * <br>{
 * <br>  GtkDragSource *drag_source = gtk_drag_source_new ();
 * <br>
 * <br>  g_signal_connect (drag_source, &quot;prepare&quot;, G_CALLBACK (on_drag_prepare), self);
 * <br>  g_signal_connect (drag_source, &quot;drag-begin&quot;, G_CALLBACK (on_drag_begin), self);
 * <br>
 * <br>  gtk_widget_add_controller (GTK_WIDGET (self), GTK_EVENT_CONTROLLER (drag_source));
 * <br>}
 * <br>```
 * <br>
 * <br>Setting up the content provider and icon ahead of time only makes
 * <br>sense when the data does not change. More commonly, you will want
 * <br>to set them up just in time. To do so, `GtkDragSource` has
 * <br>[signal&#64;Gtk.DragSource::prepare] and [signal&#64;Gtk.DragSource::drag-begin]
 * <br>signals.
 * <br>
 * <br>The ::prepare signal is emitted before a drag is started, and
 * <br>can be used to set the content provider and actions that the
 * <br>drag should be started with.
 * <br>
 * <br>```c
 * <br>static GdkContentProvider *
 * <br>on_drag_prepare (GtkDragSource *source,
 * <br>                 double         x,
 * <br>                 double         y,
 * <br>                 MyWidget      *self)
 * <br>{
 * <br>  // This widget supports two types of content: GFile objects
 * <br>  // and GdkPixbuf objects; GTK will handle the serialization
 * <br>  // of these types automatically
 * <br>  GFile *file = my_widget_get_file (self);
 * <br>  GdkPixbuf *pixbuf = my_widget_get_pixbuf (self);
 * <br>
 * <br>  return gdk_content_provider_new_union ((GdkContentProvider *[2]) {
 * <br>      gdk_content_provider_new_typed (G_TYPE_FILE, file),
 * <br>      gdk_content_provider_new_typed (GDK_TYPE_PIXBUF, pixbuf),
 * <br>    }, 2);
 * <br>}
 * <br>```
 * <br>
 * <br>The ::drag-begin signal is emitted after the `GdkDrag` object has
 * <br>been created, and can be used to set up the drag icon.
 * <br>
 * <br>```c
 * <br>static void
 * <br>on_drag_begin (GtkDragSource *source,
 * <br>               GdkDrag       *drag,
 * <br>               MyWidget      *self)
 * <br>{
 * <br>  // Set the widget as the drag icon
 * <br>  GdkPaintable *paintable = gtk_widget_paintable_new (GTK_WIDGET (self));
 * <br>  gtk_drag_source_set_icon (source, paintable, 0, 0);
 * <br>  g_object_unref (paintable);
 * <br>}
 * <br>```
 * <br>
 * <br>During the DND operation, `GtkDragSource` emits signals that
 * <br>can be used to obtain updates about the status of the operation,
 * <br>but it is not normally necessary to connect to any signals,
 * <br>except for one case: when the supported actions include
 * <br>%GDK_ACTION_MOVE, you need to listen for the
 * <br>[signal&#64;Gtk.DragSource::drag-end] signal and delete the
 * <br>data after it has been transferred.
 * <p><a href="https://docs.gtk.org/gtk4/class.DragSource.html">https://docs.gtk.org/gtk4/class.DragSource.html</a></p>
*/
public class DragSource extends GestureSingle {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DragSource.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDragBegin {
        /**
         * Emitted on the drag source when a drag is started.
         * <br>
         * <br>It can be used to e.g. set a custom drag icon with
         * <br>[method&#64;Gtk.DragSource.set_icon].
         * @param drag the `GdkDrag` object
        */
        void onDragBegin(@Nonnull ch.bailu.gtk.gdk.Drag drag);
    }
    
    private static com.sun.jna.Callback toOnDragBegin(OnDragBegin in) {
        return (in == null) ? null: (JnaDragSource.OnDragBegin) (__self, _drag, __data) -> in.onDragBegin(new ch.bailu.gtk.gdk.Drag(new PointerContainer(_drag)));
    }

    @FunctionalInterface
    public interface OnDragCancel {
        /**
         * Emitted on the drag source when a drag has failed.
         * <br>
         * <br>The signal handler may handle a failed drag operation based on
         * <br>the type of error. It should return %TRUE if the failure has been handled
         * <br>and the default &quot;drag operation failed&quot; animation should not be shown.
         * @param drag the `GdkDrag` object
         * @param reason information on why the drag failed
         * @return %TRUE if the failed drag operation has been already handled
        */
        boolean onDragCancel(@Nonnull ch.bailu.gtk.gdk.Drag drag, int reason);
    }
    
    private static com.sun.jna.Callback toOnDragCancel(OnDragCancel in) {
        return (in == null) ? null: (JnaDragSource.OnDragCancel) (__self, _drag, _reason, __data) -> in.onDragCancel(new ch.bailu.gtk.gdk.Drag(new PointerContainer(_drag)), _reason);
    }

    @FunctionalInterface
    public interface OnDragEnd {
        /**
         * Emitted on the drag source when a drag is finished.
         * <br>
         * <br>A typical reason to connect to this signal is to undo
         * <br>things done in [signal&#64;Gtk.DragSource::prepare] or
         * <br>[signal&#64;Gtk.DragSource::drag-begin] handlers.
         * @param drag the `GdkDrag` object
         * @param delete_data %TRUE if the drag was performing %GDK_ACTION_MOVE,    and the data should be deleted
        */
        void onDragEnd(@Nonnull ch.bailu.gtk.gdk.Drag drag, boolean delete_data);
    }
    
    private static com.sun.jna.Callback toOnDragEnd(OnDragEnd in) {
        return (in == null) ? null: (JnaDragSource.OnDragEnd) (__self, _drag, _delete_data, __data) -> in.onDragEnd(new ch.bailu.gtk.gdk.Drag(new PointerContainer(_drag)), _delete_data);
    }

    @FunctionalInterface
    public interface OnPrepare {
        /**
         * Emitted when a drag is about to be initiated.
         * <br>
         * <br>It returns the `GdkContentProvider` to use for the drag that is about
         * <br>to start. The default handler for this signal returns the value of
         * <br>the [property&#64;Gtk.DragSource:content] property, so if you set up that
         * <br>property ahead of time, you don't need to connect to this signal.
         * @param x the X coordinate of the drag starting point
         * @param y the Y coordinate fo the drag starting point
         * @return a `GdkContentProvider`
        */
        ch.bailu.gtk.gdk.ContentProvider onPrepare(double x, double y);
    }
    
    private static com.sun.jna.Callback toOnPrepare(OnPrepare in) {
        return (in == null) ? null: (JnaDragSource.OnPrepare) (__self, _x, _y, __data) -> in.onPrepare(_x, _y).asCPointer();
    }

    public DragSource(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkDragSource` object.
    */
    public DragSource() {
        super(cast(JnaDragSource.INST().gtk_drag_source_new()));
    }

    /**
     * Cancels a currently ongoing drag operation.
    */
    public void dragCancel()  {
        JnaDragSource.INST().gtk_drag_source_drag_cancel(asCPointer());
    }

    /**
     * Gets the actions that are currently set on the `GtkDragSource`.
     * @return the actions set on &#64;source
    */
    public int getActions()  {
        return JnaDragSource.INST().gtk_drag_source_get_actions(asCPointer());
    }

    /**
     * Gets the current content provider of a `GtkDragSource`.
     * @return the `GdkContentProvider` of &#64;source
    */
    public ch.bailu.gtk.gdk.ContentProvider getContent()  {
        return new ch.bailu.gtk.gdk.ContentProvider(new PointerContainer(JnaDragSource.INST().gtk_drag_source_get_content(asCPointer())));
    }

    /**
     * Returns the underlying `GdkDrag` object for an ongoing drag.
     * @return the `GdkDrag` of the current   drag operation
    */
    public ch.bailu.gtk.gdk.Drag getDrag()  {
        return new ch.bailu.gtk.gdk.Drag(new PointerContainer(JnaDragSource.INST().gtk_drag_source_get_drag(asCPointer())));
    }

    /**
     * Sets the actions on the `GtkDragSource`.
     * <br>
     * <br>During a DND operation, the actions are offered to potential
     * <br>drop targets. If &#64;actions include %GDK_ACTION_MOVE, you need
     * <br>to listen to the [signal&#64;Gtk.DragSource::drag-end] signal and
     * <br>handle &#64;delete_data being %TRUE.
     * <br>
     * <br>This function can be called before a drag is started,
     * <br>or in a handler for the [signal&#64;Gtk.DragSource::prepare] signal.
     * @param actions the actions to offer
    */
    public void setActions(int actions)  {
        JnaDragSource.INST().gtk_drag_source_set_actions(asCPointer(), actions);
    }

    /**
     * Sets a content provider on a `GtkDragSource`.
     * <br>
     * <br>When the data is requested in the cause of a DND operation,
     * <br>it will be obtained from the content provider.
     * <br>
     * <br>This function can be called before a drag is started,
     * <br>or in a handler for the [signal&#64;Gtk.DragSource::prepare] signal.
     * <br>
     * <br>You may consider setting the content provider back to
     * <br>%NULL in a [signal&#64;Gtk.DragSource::drag-end] signal handler.
     * @param content a `GdkContentProvider`
    */
    public void setContent(@Nullable ch.bailu.gtk.gdk.ContentProvider content)  {
        JnaDragSource.INST().gtk_drag_source_set_content(asCPointer(), asCPointer(content));
    }

    /**
     * Sets a paintable to use as icon during DND operations.
     * <br>
     * <br>The hotspot coordinates determine the point on the icon
     * <br>that gets aligned with the hotspot of the cursor.
     * <br>
     * <br>If &#64;paintable is %NULL, a default icon is used.
     * <br>
     * <br>This function can be called before a drag is started, or in
     * <br>a [signal&#64;Gtk.DragSource::prepare] or
     * <br>[signal&#64;Gtk.DragSource::drag-begin] signal handler.
     * @param paintable the `GdkPaintable` to use as icon
     * @param hot_x the hotspot X coordinate on the icon
     * @param hot_y the hotspot Y coordinate on the icon
    */
    public void setIcon(@Nullable ch.bailu.gtk.gdk.Paintable paintable, int hot_x, int hot_y)  {
        JnaDragSource.INST().gtk_drag_source_set_icon(asCPointer(), asCPointer(paintable), hot_x, hot_y);
    }

    public final static String SIGNAL_ON_DRAG_BEGIN = "drag-begin";
    
    /**
     * Connect to signal "drag-begin".
     * <br>See {@link OnDragBegin#onDragBegin} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRAG_BEGIN} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDragBegin(OnDragBegin signal) {
        return connectSignal(SIGNAL_ON_DRAG_BEGIN, toOnDragBegin(signal));
    }

    public final static String SIGNAL_ON_DRAG_CANCEL = "drag-cancel";
    
    /**
     * Connect to signal "drag-cancel".
     * <br>See {@link OnDragCancel#onDragCancel} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRAG_CANCEL} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDragCancel(OnDragCancel signal) {
        return connectSignal(SIGNAL_ON_DRAG_CANCEL, toOnDragCancel(signal));
    }

    public final static String SIGNAL_ON_DRAG_END = "drag-end";
    
    /**
     * Connect to signal "drag-end".
     * <br>See {@link OnDragEnd#onDragEnd} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRAG_END} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDragEnd(OnDragEnd signal) {
        return connectSignal(SIGNAL_ON_DRAG_END, toOnDragEnd(signal));
    }

    public final static String SIGNAL_ON_PREPARE = "prepare";
    
    /**
     * Connect to signal "prepare".
     * <br>See {@link OnPrepare#onPrepare} for signal description.
     * <br>Field {@link #SIGNAL_ON_PREPARE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPrepare(OnPrepare signal) {
        return connectSignal(SIGNAL_ON_PREPARE, toOnPrepare(signal));
    }

    public static long getTypeID() { 
        return JnaDragSource.INST().gtk_drag_source_get_type(); 
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
