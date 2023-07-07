/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Provides a base class for implementing asynchronous function results.
 * <br>
 * <br>Asynchronous operations are broken up into two separate operations
 * <br>which are chained together by a &#35;GAsyncReadyCallback. To begin
 * <br>an asynchronous operation, provide a &#35;GAsyncReadyCallback to the
 * <br>asynchronous function. This callback will be triggered when the
 * <br>operation has completed, and must be run in a later iteration of
 * <br>the [thread-default main context][g-main-context-push-thread-default]
 * <br>from where the operation was initiated. It will be passed a
 * <br>&#35;GAsyncResult instance filled with the details of the operation's
 * <br>success or failure, the object the asynchronous function was
 * <br>started for and any error codes returned. The asynchronous callback
 * <br>function is then expected to call the corresponding &quot;_finish()&quot;
 * <br>function, passing the object the function was called for, the
 * <br>&#35;GAsyncResult instance, and (optionally) an &#64;error to grab any
 * <br>error conditions that may have occurred.
 * <br>
 * <br>The &quot;_finish()&quot; function for an operation takes the generic result
 * <br>(of type &#35;GAsyncResult) and returns the specific result that the
 * <br>operation in question yields (e.g. a &#35;GFileEnumerator for a
 * <br>&quot;enumerate children&quot; operation). If the result or error status of the
 * <br>operation is not needed, there is no need to call the &quot;_finish()&quot;
 * <br>function; GIO will take care of cleaning up the result and error
 * <br>information after the &#35;GAsyncReadyCallback returns. You can pass
 * <br>%NULL for the &#35;GAsyncReadyCallback if you don't need to take any
 * <br>action at all after the operation completes. Applications may also
 * <br>take a reference to the &#35;GAsyncResult and call &quot;_finish()&quot; later;
 * <br>however, the &quot;_finish()&quot; function may be called at most once.
 * <br>
 * <br>Example of a typical asynchronous operation flow:
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * void _theoretical_frobnitz_async (Theoretical         *t,
 *                                   GCancellable        *c,
 *                                   GAsyncReadyCallback  cb,
 *                                   gpointer             u);
 * 
 * gboolean _theoretical_frobnitz_finish (Theoretical   *t,
 *                                        GAsyncResult  *res,
 *                                        GError       **e);
 * 
 * static void
 * frobnitz_result_func (GObject      *source_object,
 * 		 GAsyncResult *res,
 * 		 gpointer      user_data)
 * {
 *   gboolean success = FALSE;
 * 
 *   success = _theoretical_frobnitz_finish (source_object, res, NULL);
 * 
 *   if (success)
 *     g_printf (&quot;Hurray!&#92;n&quot;);
 *   else
 *     g_printf (&quot;Uh oh!&#92;n&quot;);
 * 
 *   ...
 * 
 * }
 * 
 * int main (int argc, void *argv[])
 * {
 *    ...
 * 
 *    _theoretical_frobnitz_async (theoretical_data,
 *                                 NULL,
 *                                 frobnitz_result_func,
 *                                 NULL);
 * 
 *    ...
 * }
 * </pre>
 * <br>
 * <br>The callback for an asynchronous operation is called only once, and is
 * <br>always called, even in the case of a cancelled operation. On cancellation
 * <br>the result is a %G_IO_ERROR_CANCELLED error.
 * <br>
 * <br>&#35;&#35; I/O Priority &#35; {&#35;io-priority}
 * <br>
 * <br>Many I/O-related asynchronous operations have a priority parameter,
 * <br>which is used in certain cases to determine the order in which
 * <br>operations are executed. They are not used to determine system-wide
 * <br>I/O scheduling. Priorities are integers, with lower numbers indicating
 * <br>higher priority. It is recommended to choose priorities between
 * <br>%G_PRIORITY_LOW and %G_PRIORITY_HIGH, with %G_PRIORITY_DEFAULT
 * <br>as a default.
 * <p><a href="https://docs.gtk.org/gio/iface.AsyncResult.html">https://docs.gtk.org/gio/iface.AsyncResult.html</a></p>
*/
public class AsyncResult extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AsyncResult.class.getCanonicalName());
    }

    public AsyncResult(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the source object from a &#35;GAsyncResult.
     * @return a new reference to the source    object for the &#64;res, or %NULL if there is none.
    */
    public ch.bailu.gtk.gobject.Object getSourceObject()  {
        return new ch.bailu.gtk.gobject.Object(new PointerContainer(JnaAsyncResult.INST().g_async_result_get_source_object(asCPointer())));
    }

    /**
     * Gets the user data from a &#35;GAsyncResult.
     * @return the user data for &#64;res.
    */
    public ch.bailu.gtk.type.Pointer getUserData()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaAsyncResult.INST().g_async_result_get_user_data(asCPointer())));
    }

    /**
     * Checks if &#64;res has the given &#64;source_tag (generally a function
     * <br>pointer indicating the function &#64;res was created by).
     * @param source_tag an application-defined tag
     * @return %TRUE if &#64;res has the indicated &#64;source_tag, %FALSE if   not.
    */
    public boolean isTagged(@Nullable ch.bailu.gtk.type.Pointer source_tag)  {
        return JnaAsyncResult.INST().g_async_result_is_tagged(asCPointer(), asCPointer(source_tag));
    }

    /**
     * If &#64;res is a &#35;GSimpleAsyncResult, this is equivalent to
     * <br>g_simple_async_result_propagate_error(). Otherwise it returns
     * <br>%FALSE.
     * <br>
     * <br>This can be used for legacy error handling in async *_finish()
     * <br>wrapper functions that traditionally handled &#35;GSimpleAsyncResult
     * <br>error returns themselves rather than calling into the virtual method.
     * <br>This should not be used in new code; &#35;GAsyncResult errors that are
     * <br>set by virtual methods should also be extracted by virtual methods,
     * <br>to enable subclasses to chain up correctly.
     * @return %TRUE if &#64;error is has been filled in with an error from   &#64;res, %FALSE if not.
    */
    public boolean legacyPropagateError() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaAsyncResult.INST().g_async_result_legacy_propagate_error(asCPointer(), 0L);
    }

    public static long getTypeID() { 
        return JnaAsyncResult.INST().g_async_result_get_type(); 
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
*/
