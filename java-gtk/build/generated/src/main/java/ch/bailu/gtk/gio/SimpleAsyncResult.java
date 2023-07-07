/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * As of GLib 2.46, &#35;GSimpleAsyncResult is deprecated in favor of
 * <br>&#35;GTask, which provides a simpler API.
 * <br>
 * <br>&#35;GSimpleAsyncResult implements &#35;GAsyncResult.
 * <br>
 * <br>GSimpleAsyncResult handles &#35;GAsyncReadyCallbacks, error
 * <br>reporting, operation cancellation and the final state of an operation,
 * <br>completely transparent to the application. Results can be returned
 * <br>as a pointer e.g. for functions that return data that is collected
 * <br>asynchronously, a boolean value for checking the success or failure
 * <br>of an operation, or a &#35;gssize for operations which return the number
 * <br>of bytes modified by the operation; all of the simple return cases
 * <br>are covered.
 * <br>
 * <br>Most of the time, an application will not need to know of the details
 * <br>of this API; it is handled transparently, and any necessary operations
 * <br>are handled by &#35;GAsyncResult's interface. However, if implementing a
 * <br>new GIO module, for writing language bindings, or for complex
 * <br>applications that need better control of how asynchronous operations
 * <br>are completed, it is important to understand this functionality.
 * <br>
 * <br>GSimpleAsyncResults are tagged with the calling function to ensure
 * <br>that asynchronous functions and their finishing functions are used
 * <br>together correctly.
 * <br>
 * <br>To create a new &#35;GSimpleAsyncResult, call g_simple_async_result_new().
 * <br>If the result needs to be created for a &#35;GError, use
 * <br>g_simple_async_result_new_from_error() or
 * <br>g_simple_async_result_new_take_error(). If a &#35;GError is not available
 * <br>(e.g. the asynchronous operation's doesn't take a &#35;GError argument),
 * <br>but the result still needs to be created for an error condition, use
 * <br>g_simple_async_result_new_error() (or g_simple_async_result_set_error_va()
 * <br>if your application or binding requires passing a variable argument list
 * <br>directly), and the error can then be propagated through the use of
 * <br>g_simple_async_result_propagate_error().
 * <br>
 * <br>An asynchronous operation can be made to ignore a cancellation event by
 * <br>calling g_simple_async_result_set_handle_cancellation() with a
 * <br>&#35;GSimpleAsyncResult for the operation and %FALSE. This is useful for
 * <br>operations that are dangerous to cancel, such as close (which would
 * <br>cause a leak if cancelled before being run).
 * <br>
 * <br>GSimpleAsyncResult can integrate into GLib's event loop, &#35;GMainLoop,
 * <br>or it can use &#35;GThreads.
 * <br>g_simple_async_result_complete() will finish an I/O task directly
 * <br>from the point where it is called. g_simple_async_result_complete_in_idle()
 * <br>will finish it from an idle handler in the
 * <br>[thread-default main context][g-main-context-push-thread-default]
 * <br>where the &#35;GSimpleAsyncResult was created.
 * <br>g_simple_async_result_run_in_thread() will run the job in a
 * <br>separate thread and then use
 * <br>g_simple_async_result_complete_in_idle() to deliver the result.
 * <br>
 * <br>To set the results of an asynchronous function,
 * <br>g_simple_async_result_set_op_res_gpointer(),
 * <br>g_simple_async_result_set_op_res_gboolean(), and
 * <br>g_simple_async_result_set_op_res_gssize()
 * <br>are provided, setting the operation's result to a gpointer, gboolean, or
 * <br>gssize, respectively.
 * <br>
 * <br>Likewise, to get the result of an asynchronous function,
 * <br>g_simple_async_result_get_op_res_gpointer(),
 * <br>g_simple_async_result_get_op_res_gboolean(), and
 * <br>g_simple_async_result_get_op_res_gssize() are
 * <br>provided, getting the operation's result as a gpointer, gboolean, and
 * <br>gssize, respectively.
 * <br>
 * <br>For the details of the requirements implementations must respect, see
 * <br>&#35;GAsyncResult.  A typical implementation of an asynchronous operation
 * <br>using GSimpleAsyncResult looks something like this:
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * static void
 * baked_cb (Cake    *cake,
 *           gpointer user_data)
 * {
 *   // In this example, this callback is not given a reference to the cake,
 *   // so the GSimpleAsyncResult has to take a reference to it.
 *   GSimpleAsyncResult *result = user_data;
 * 
 *   if (cake == NULL)
 *     g_simple_async_result_set_error (result,
 *                                      BAKER_ERRORS,
 *                                      BAKER_ERROR_NO_FLOUR,
 *                                      &quot;Go to the supermarket&quot;);
 *   else
 *     g_simple_async_result_set_op_res_gpointer (result,
 *                                                g_object_ref (cake),
 *                                                g_object_unref);
 * 
 * 
 *   // In this example, we assume that baked_cb is called as a callback from
 *   // the mainloop, so it's safe to complete the operation synchronously here.
 *   // If, however, _baker_prepare_cake () might call its callback without
 *   // first returning to the mainloop — inadvisable, but some APIs do so —
 *   // we would need to use g_simple_async_result_complete_in_idle().
 *   g_simple_async_result_complete (result);
 *   g_object_unref (result);
 * }
 * 
 * void
 * baker_bake_cake_async (Baker              *self,
 *                        guint               radius,
 *                        GAsyncReadyCallback callback,
 *                        gpointer            user_data)
 * {
 *   GSimpleAsyncResult *simple;
 *   Cake               *cake;
 * 
 *   if (radius &lt; 3)
 *     {
 *       g_simple_async_report_error_in_idle (G_OBJECT (self),
 *                                            callback,
 *                                            user_data,
 *                                            BAKER_ERRORS,
 *                                            BAKER_ERROR_TOO_SMALL,
 *                                            &quot;%ucm radius cakes are silly&quot;,
 *                                            radius);
 *       return;
 *     }
 * 
 *   simple = g_simple_async_result_new (G_OBJECT (self),
 *                                       callback,
 *                                       user_data,
 *                                       baker_bake_cake_async);
 *   cake = _baker_get_cached_cake (self, radius);
 * 
 *   if (cake != NULL)
 *     {
 *       g_simple_async_result_set_op_res_gpointer (simple,
 *                                                  g_object_ref (cake),
 *                                                  g_object_unref);
 *       g_simple_async_result_complete_in_idle (simple);
 *       g_object_unref (simple);
 *       // Drop the reference returned by _baker_get_cached_cake();
 *       // the GSimpleAsyncResult has taken its own reference.
 *       g_object_unref (cake);
 *       return;
 *     }
 * 
 *   _baker_prepare_cake (self, radius, baked_cb, simple);
 * }
 * 
 * Cake *
 * baker_bake_cake_finish (Baker        *self,
 *                         GAsyncResult *result,
 *                         GError      **error)
 * {
 *   GSimpleAsyncResult *simple;
 *   Cake               *cake;
 * 
 *   g_return_val_if_fail (g_simple_async_result_is_valid (result,
 *                                                         G_OBJECT (self),
 *                                                         baker_bake_cake_async),
 *                         NULL);
 * 
 *   simple = (GSimpleAsyncResult *) result;
 * 
 *   if (g_simple_async_result_propagate_error (simple, error))
 *     return NULL;
 * 
 *   cake = CAKE (g_simple_async_result_get_op_res_gpointer (simple));
 *   return g_object_ref (cake);
 * }
 * </pre>
 * <p><a href="https://docs.gtk.org/gio/class.SimpleAsyncResult.html">https://docs.gtk.org/gio/class.SimpleAsyncResult.html</a></p>
*/
public class SimpleAsyncResult extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SimpleAsyncResult.class.getCanonicalName());
    }

    public SimpleAsyncResult(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Implements interface {@link AsyncResult}. Call this to get access to interface functions.
     * @return {@link AsyncResult}
    */
    public AsyncResult asAsyncResult() {
        return new AsyncResult(cast());
    }

    public static long getTypeID() { 
        return JnaSimpleAsyncResult.INST().g_simple_async_result_get_type(); 
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

[MethodModel:cb-deprecated:_new:[ParameterModel:Supported:{Gg:SimpleAsyncResult:{c:GSimpleAsyncResult*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-deprecated:newError:[ParameterModel:Supported:{Gg:SimpleAsyncResult:{c:GSimpleAsyncResult*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:cb-deprecated:newFromError:[ParameterModel:Supported:{Gg:SimpleAsyncResult:{c:GSimpleAsyncResult*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gg:Error:{c:const GError*}}:{j:long}]

[MethodModel:cb-deprecated:newTakeError:[ParameterModel:Supported:{Gg:SimpleAsyncResult:{c:GSimpleAsyncResult*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gg:Error:{c:GError*}}:{j:long}]

[MethodModel:cb-deprecated:complete:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[MethodModel:cb-deprecated:completeInIdle:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[MethodModel:cb-deprecated:getOpResGboolean:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]

[MethodModel:cb-deprecated:getOpResGpointer:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:cb-deprecated:getOpResGssize:[ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]]

[MethodModel:cb-deprecated:getSourceTag:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:cb-deprecated:propagateError:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]

[MethodModel:cb-deprecated:runInThread:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:[MethodModel:Supported:SimpleAsyncThreadFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:SimpleAsyncResult:{c:GSimpleAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:cb-deprecated:setCheckCancellable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:cb-deprecated:setError:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:cb-deprecated:java-type-not-supported:setErrorVa:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:cb-deprecated:setFromError:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Error:{c:const GError*}}:{j:long}]

[MethodModel:cb-deprecated:setHandleCancellation:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]

[MethodModel:cb-deprecated:setOpResGboolean:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]

[MethodModel:cb-deprecated:setOpResGpointer:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:cb-deprecated:setOpResGssize:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]

[MethodModel:cb-deprecated:takeError:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Error:{c:GError*}}:{j:long}]

[MethodModel:cb-deprecated:isValid:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
*/
