/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GdkDrop` object represents the target of an ongoing DND operation.
 * <br>
 * <br>Possible drop sites get informed about the status of the ongoing drag
 * <br>operation with events of type %GDK_DRAG_ENTER, %GDK_DRAG_LEAVE,
 * <br>%GDK_DRAG_MOTION and %GDK_DROP_START. The `GdkDrop` object can be obtained
 * <br>from these [class&#64;Gdk.Event] types using [method&#64;Gdk.DNDEvent.get_drop].
 * <br>
 * <br>The actual data transfer is initiated from the target side via an async
 * <br>read, using one of the `GdkDrop` methods for this purpose:
 * <br>[method&#64;Gdk.Drop.read_async] or [method&#64;Gdk.Drop.read_value_async].
 * <br>
 * <br>GTK provides a higher level abstraction based on top of these functions,
 * <br>and so they are not normally needed in GTK applications. See the
 * <br>&quot;Drag and Drop&quot; section of the GTK documentation for more information.
 * <p><a href="https://docs.gtk.org/gdk4/class.Drop.html">https://docs.gtk.org/gdk4/class.Drop.html</a></p>
*/
public class Drop extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Drop.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAsyncReadyCallback {
        /**
         * Type definition for a function that will be called back when an asynchronous
         * <br>operation within GIO has been completed. &#35;GAsyncReadyCallback
         * <br>callbacks from &#35;GTask are guaranteed to be invoked in a later
         * <br>iteration of the
         * <br>[thread-default main context][g-main-context-push-thread-default]
         * <br>where the &#35;GTask was created. All other users of
         * <br>&#35;GAsyncReadyCallback must likewise call it asynchronously in a
         * <br>later iteration of the main context.
         * <br>
         * <br>The asynchronous operation is guaranteed to have held a reference to
         * <br>&#64;source_object from the time when the `*_async()` function was called, until
         * <br>after this callback returns.
         * @param source_object the object the asynchronous operation was started with.
         * @param res a &#35;GAsyncResult.
         * @param user_data user data passed to the callback.
        */
        void onAsyncReadyCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.gobject.Object source_object, @Nonnull ch.bailu.gtk.gio.AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaDrop.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaDrop.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new ch.bailu.gtk.gio.AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public Drop(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Ends the drag operation after a drop.
     * <br>
     * <br>The &#64;action must be a single action selected from the actions
     * <br>available via [method&#64;Gdk.Drop.get_actions].
     * @param action the action performed by the destination or 0 if the drop failed
    */
    public void finish(int action)  {
        JnaDrop.INST().gdk_drop_finish(asCPointer(), action);
    }

    /**
     * Returns the possible actions for this `GdkDrop`.
     * <br>
     * <br>If this value contains multiple actions - i.e.
     * <br>[func&#64;Gdk.DragAction.is_unique] returns %FALSE for the result -
     * <br>[method&#64;Gdk.Drop.finish] must choose the action to use when
     * <br>accepting the drop. This will only happen if you passed
     * <br>%GDK_ACTION_ASK as one of the possible actions in
     * <br>[method&#64;Gdk.Drop.status]. %GDK_ACTION_ASK itself will not
     * <br>be included in the actions returned by this function.
     * <br>
     * <br>This value may change over the lifetime of the [class&#64;Gdk.Drop]
     * <br>both as a response to source side actions as well as to calls to
     * <br>[method&#64;Gdk.Drop.status] or [method&#64;Gdk.Drop.finish]. The source
     * <br>side will not change this value anymore once a drop has started.
     * @return The possible `GdkDragActions`
    */
    public int getActions()  {
        return JnaDrop.INST().gdk_drop_get_actions(asCPointer());
    }

    /**
     * Returns the `GdkDevice` performing the drop.
     * @return The `GdkDevice` performing the drop.
    */
    public Device getDevice()  {
        return new Device(new PointerContainer(JnaDrop.INST().gdk_drop_get_device(asCPointer())));
    }

    /**
     * Gets the `GdkDisplay` that &#64;self was created for.
     * @return a `GdkDisplay`
    */
    public Display getDisplay()  {
        return new Display(new PointerContainer(JnaDrop.INST().gdk_drop_get_display(asCPointer())));
    }

    /**
     * If this is an in-app drag-and-drop operation, returns the `GdkDrag`
     * <br>that corresponds to this drop.
     * <br>
     * <br>If it is not, %NULL is returned.
     * @return the corresponding `GdkDrag`
    */
    public Drag getDrag()  {
        return new Drag(new PointerContainer(JnaDrop.INST().gdk_drop_get_drag(asCPointer())));
    }

    /**
     * Returns the `GdkContentFormats` that the drop offers the data
     * <br>to be read in.
     * @return The possible `GdkContentFormats`
    */
    public ContentFormats getFormats()  {
        return new ContentFormats(new PointerContainer(JnaDrop.INST().gdk_drop_get_formats(asCPointer())));
    }

    /**
     * Returns the `GdkSurface` performing the drop.
     * @return The `GdkSurface` performing the drop.
    */
    public Surface getSurface()  {
        return new Surface(new PointerContainer(JnaDrop.INST().gdk_drop_get_surface(asCPointer())));
    }

    /**
     * Asynchronously read the dropped data from a `GdkDrop`
     * <br>in a format that complies with one of the mime types.
     * @param mime_types    pointer to an array of mime types
     * @param io_priority the I/O priority for the read operation
     * @param cancellable optional `GCancellable` object
     * @param callback a `GAsyncReadyCallback` to call when   the request is satisfied
     * @param user_data the data to pass to &#64;callback
    */
    public void readAsync(@Nonnull ch.bailu.gtk.type.Strs mime_types, int io_priority, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDrop.INST().gdk_drop_read_async(asCPointer(), asCPointerNotNull(mime_types), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "readAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an async drop read operation.
     * <br>
     * <br>Note that you must not use blocking read calls on the returned stream
     * <br>in the GTK thread, since some platforms might require communication with
     * <br>GTK to complete the data transfer. You can use async APIs such as
     * <br>g_input_stream_read_bytes_async().
     * <br>
     * <br>See [method&#64;Gdk.Drop.read_async].
     * @param result a `GAsyncResult`
     * @param out_mime_type return location for the used mime type
     * @return the `GInputStream`
    */
    public ch.bailu.gtk.gio.InputStream readFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult result, @Nonnull ch.bailu.gtk.type.Strs out_mime_type) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.gio.InputStream(new PointerContainer(JnaDrop.INST().gdk_drop_read_finish(asCPointer(), asCPointerNotNull(result), asCPointerNotNull(out_mime_type), 0L)));
    }

    /**
     * Asynchronously request the drag operation's contents converted
     * <br>to the given &#64;type.
     * <br>
     * <br>When the operation is finished &#64;callback will be called. You must
     * <br>then call [method&#64;Gdk.Drop.read_value_finish] to get the resulting
     * <br>`GValue`.
     * <br>
     * <br>For local drag-and-drop operations that are available in the given
     * <br>`GType`, the value will be copied directly. Otherwise, GDK will
     * <br>try to use [func&#64;Gdk.content_deserialize_async] to convert the data.
     * @param type a `GType` to read
     * @param io_priority the I/O priority of the request.
     * @param cancellable optional `GCancellable` object, %NULL to ignore.
     * @param callback callback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void readValueAsync(long type, int io_priority, @Nullable ch.bailu.gtk.gio.Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDrop.INST().gdk_drop_read_value_async(asCPointer(), type, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "readValueAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an async drop read.
     * <br>
     * <br>See [method&#64;Gdk.Drop.read_value_async].
     * @param result a `GAsyncResult`
     * @return a `GValue` containing the result.
    */
    public ch.bailu.gtk.gobject.Value readValueFinish(@Nonnull ch.bailu.gtk.gio.AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.gobject.Value(new PointerContainer(JnaDrop.INST().gdk_drop_read_value_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Selects all actions that are potentially supported by the destination.
     * <br>
     * <br>When calling this function, do not restrict the passed in actions to
     * <br>the ones provided by [method&#64;Gdk.Drop.get_actions]. Those actions may
     * <br>change in the future, even depending on the actions you provide here.
     * <br>
     * <br>The &#64;preferred action is a hint to the drag-and-drop mechanism about which
     * <br>action to use when multiple actions are possible.
     * <br>
     * <br>This function should be called by drag destinations in response to
     * <br>%GDK_DRAG_ENTER or %GDK_DRAG_MOTION events. If the destination does
     * <br>not yet know the exact actions it supports, it should set any possible
     * <br>actions first and then later call this function again.
     * @param actions Supported actions of the destination, or 0 to indicate    that a drop will not be accepted
     * @param preferred A unique action that's a member of &#64;actions indicating the    preferred action
    */
    public void status(int actions, int preferred)  {
        JnaDrop.INST().gdk_drop_status(asCPointer(), actions, preferred);
    }

    public static long getTypeID() { 
        return JnaDrop.INST().gdk_drop_get_type(); 
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
