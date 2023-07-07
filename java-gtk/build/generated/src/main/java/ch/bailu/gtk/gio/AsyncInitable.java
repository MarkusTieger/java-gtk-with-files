/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * This is the asynchronous version of &#35;GInitable; it behaves the same
 * <br>in all ways except that initialization is asynchronous. For more details
 * <br>see the descriptions on &#35;GInitable.
 * <br>
 * <br>A class may implement both the &#35;GInitable and &#35;GAsyncInitable interfaces.
 * <br>
 * <br>Users of objects implementing this are not intended to use the interface
 * <br>method directly; instead it will be used automatically in various ways.
 * <br>For C applications you generally just call g_async_initable_new_async()
 * <br>directly, or indirectly via a foo_thing_new_async() wrapper. This will call
 * <br>g_async_initable_init_async() under the cover, calling back with %NULL and
 * <br>a set %GError on failure.
 * <br>
 * <br>A typical implementation might look something like this:
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * enum {
 *    NOT_INITIALIZED,
 *    INITIALIZING,
 *    INITIALIZED
 * };
 * 
 * static void
 * _foo_ready_cb (Foo *self)
 * {
 *   GList *l;
 * 
 *   self-&gt;priv-&gt;state = INITIALIZED;
 * 
 *   for (l = self-&gt;priv-&gt;init_results; l != NULL; l = l-&gt;next)
 *     {
 *       GTask *task = l-&gt;data;
 * 
 *       if (self-&gt;priv-&gt;success)
 *         g_task_return_boolean (task, TRUE);
 *       else
 *         g_task_return_new_error (task, ...);
 *       g_object_unref (task);
 *     }
 * 
 *   g_list_free (self-&gt;priv-&gt;init_results);
 *   self-&gt;priv-&gt;init_results = NULL;
 * }
 * 
 * static void
 * foo_init_async (GAsyncInitable       *initable,
 *                 int                   io_priority,
 *                 GCancellable         *cancellable,
 *                 GAsyncReadyCallback   callback,
 *                 gpointer              user_data)
 * {
 *   Foo *self = FOO (initable);
 *   GTask *task;
 * 
 *   task = g_task_new (initable, cancellable, callback, user_data);
 *   g_task_set_name (task, G_STRFUNC);
 * 
 *   switch (self-&gt;priv-&gt;state)
 *     {
 *       case NOT_INITIALIZED:
 *         _foo_get_ready (self);
 *         self-&gt;priv-&gt;init_results = g_list_append (self-&gt;priv-&gt;init_results,
 *                                                   task);
 *         self-&gt;priv-&gt;state = INITIALIZING;
 *         break;
 *       case INITIALIZING:
 *         self-&gt;priv-&gt;init_results = g_list_append (self-&gt;priv-&gt;init_results,
 *                                                   task);
 *         break;
 *       case INITIALIZED:
 *         if (!self-&gt;priv-&gt;success)
 *           g_task_return_new_error (task, ...);
 *         else
 *           g_task_return_boolean (task, TRUE);
 *         g_object_unref (task);
 *         break;
 *     }
 * }
 * 
 * static gboolean
 * foo_init_finish (GAsyncInitable       *initable,
 *                  GAsyncResult         *result,
 *                  GError              **error)
 * {
 *   g_return_val_if_fail (g_task_is_valid (result, initable), FALSE);
 * 
 *   return g_task_propagate_boolean (G_TASK (result), error);
 * }
 * 
 * static void
 * foo_async_initable_iface_init (gpointer g_iface,
 *                                gpointer data)
 * {
 *   GAsyncInitableIface *iface = g_iface;
 * 
 *   iface-&gt;init_async = foo_init_async;
 *   iface-&gt;init_finish = foo_init_finish;
 * }
 * </pre>
 * <p><a href="https://docs.gtk.org/gio/iface.AsyncInitable.html">https://docs.gtk.org/gio/iface.AsyncInitable.html</a></p>
*/
public class AsyncInitable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AsyncInitable.class.getCanonicalName());
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
        void onAsyncReadyCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.gobject.Object source_object, @Nonnull AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaAsyncInitable.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaAsyncInitable.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public AsyncInitable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Starts asynchronous initialization of the object implementing the
     * <br>interface. This must be done before any real use of the object after
     * <br>initial construction. If the object also implements &#35;GInitable you can
     * <br>optionally call g_initable_init() instead.
     * <br>
     * <br>This method is intended for language bindings. If writing in C,
     * <br>g_async_initable_new_async() should typically be used instead.
     * <br>
     * <br>When the initialization is finished, &#64;callback will be called. You can
     * <br>then call g_async_initable_init_finish() to get the result of the
     * <br>initialization.
     * <br>
     * <br>Implementations may also support cancellation. If &#64;cancellable is not
     * <br>%NULL, then initialization can be cancelled by triggering the cancellable
     * <br>object from another thread. If the operation was cancelled, the error
     * <br>%G_IO_ERROR_CANCELLED will be returned. If &#64;cancellable is not %NULL, and
     * <br>the object doesn't support cancellable initialization, the error
     * <br>%G_IO_ERROR_NOT_SUPPORTED will be returned.
     * <br>
     * <br>As with &#35;GInitable, if the object is not initialized, or initialization
     * <br>returns with an error, then all operations on the object except
     * <br>g_object_ref() and g_object_unref() are considered to be invalid, and
     * <br>have undefined behaviour. They will often fail with g_critical() or
     * <br>g_warning(), but this must not be relied on.
     * <br>
     * <br>Callers should not assume that a class which implements &#35;GAsyncInitable can
     * <br>be initialized multiple times; for more information, see g_initable_init().
     * <br>If a class explicitly supports being initialized multiple times,
     * <br>implementation requires yielding all subsequent calls to init_async() on the
     * <br>results of the first call.
     * <br>
     * <br>For classes that also support the &#35;GInitable interface, the default
     * <br>implementation of this method will run the g_initable_init() function
     * <br>in a thread, so if you want to support asynchronous initialization via
     * <br>threads, just implement the &#35;GAsyncInitable interface without overriding
     * <br>any interface methods.
     * @param io_priority the [I/O priority][io-priority] of the operation
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void initAsync(int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaAsyncInitable.INST().g_async_initable_init_async(asCPointer(), io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(this, "initAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes asynchronous initialization and returns the result.
     * <br>See g_async_initable_init_async().
     * @param res a &#35;GAsyncResult.
     * @return %TRUE if successful. If an error has occurred, this function will return %FALSE and set &#64;error appropriately if present.
    */
    public boolean initFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAsyncInitable.INST().g_async_initable_init_finish(asCPointer(), asCPointerNotNull(res), 0L);
    }

    /**
     * Finishes the async construction for the various g_async_initable_new
     * <br>calls, returning the created object or %NULL on error.
     * @param res the &#35;GAsyncResult from the callback
     * @return a newly created &#35;GObject,      or %NULL on error. Free with g_object_unref().
    */
    public ch.bailu.gtk.gobject.Object newFinish(@Nonnull AsyncResult res) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.gobject.Object(new PointerContainer(JnaAsyncInitable.INST().g_async_initable_new_finish(asCPointer(), asCPointerNotNull(res), 0L)));
    }

    /**
     * Helper function for constructing &#35;GAsyncInitable object. This is
     * <br>similar to g_object_new() but also initializes the object asynchronously.
     * <br>
     * <br>When the initialization is finished, &#64;callback will be called. You can
     * <br>then call g_async_initable_new_finish() to get the new object and check
     * <br>for any errors.
     * @param object_type a &#35;GType supporting &#35;GAsyncInitable.
     * @param io_priority the [I/O priority][io-priority] of the operation
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback to call when the initialization is     finished
     * @param user_data the data to pass to callback function
     * @param first_property_name the name of the first property, or %NULL if no     properties
     * @param _elipse the value of the first property, followed by other property    value pairs, and ended by %NULL.
    */
    public static void newAsync(long object_type, int io_priority, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data, @Nullable ch.bailu.gtk.type.Str first_property_name, java.lang.Object... _elipse)  {
        JnaAsyncInitable.INST().g_async_initable_new_async(object_type, io_priority, asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "newAsync", callback), asCPointer(user_data), asCPointer(first_property_name), _elipse);
    }

    public static long getTypeID() { 
        return JnaAsyncInitable.INST().g_async_initable_get_type(); 
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
interface-type

[MethodModel:java-type-not-supported:newValistAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-deprecated:newvAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{Gg:Parameter:{c:GParameter*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
*/
