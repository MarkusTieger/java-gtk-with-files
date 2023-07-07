/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GTask represents and manages a cancellable &quot;task&quot;.
 * <br>
 * <br>&#35;&#35; Asynchronous operations
 * <br>
 * <br>The most common usage of &#35;GTask is as a &#35;GAsyncResult, to
 * <br>manage data during an asynchronous operation. You call
 * <br>g_task_new() in the &quot;start&quot; method, followed by
 * <br>g_task_set_task_data() and the like if you need to keep some
 * <br>additional data associated with the task, and then pass the
 * <br>task object around through your asynchronous operation.
 * <br>Eventually, you will call a method such as
 * <br>g_task_return_pointer() or g_task_return_error(), which will
 * <br>save the value you give it and then invoke the task's callback
 * <br>function in the
 * <br>[thread-default main context][g-main-context-push-thread-default]
 * <br>where it was created (waiting until the next iteration of the main
 * <br>loop first, if necessary). The caller will pass the &#35;GTask back to
 * <br>the operation's finish function (as a &#35;GAsyncResult), and you can
 * <br>use g_task_propagate_pointer() or the like to extract the
 * <br>return value.
 * <br>
 * <br>Using &#35;GTask requires the thread-default &#35;GMainContext from when the
 * <br>&#35;GTask was constructed to be running at least until the task has completed
 * <br>and its data has been freed.
 * <br>
 * <br>Here is an example for using GTask as a GAsyncResult:
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *     typedef struct {
 *       CakeFrostingType frosting;
 *       char *message;
 *     } DecorationData;
 * 
 *     static void
 *     decoration_data_free (DecorationData *decoration)
 *     {
 *       g_free (decoration-&gt;message);
 *       g_slice_free (DecorationData, decoration);
 *     }
 * 
 *     static void
 *     baked_cb (Cake     *cake,
 *               gpointer  user_data)
 *     {
 *       GTask *task = user_data;
 *       DecorationData *decoration = g_task_get_task_data (task);
 *       GError *error = NULL;
 * 
 *       if (cake == NULL)
 *         {
 *           g_task_return_new_error (task, BAKER_ERROR, BAKER_ERROR_NO_FLOUR,
 *                                    &quot;Go to the supermarket&quot;);
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       if (!cake_decorate (cake, decoration-&gt;frosting, decoration-&gt;message, &amp;error))
 *         {
 *           g_object_unref (cake);
 *           // g_task_return_error() takes ownership of error
 *           g_task_return_error (task, error);
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       g_task_return_pointer (task, cake, g_object_unref);
 *       g_object_unref (task);
 *     }
 * 
 *     void
 *     baker_bake_cake_async (Baker               *self,
 *                            guint                radius,
 *                            CakeFlavor           flavor,
 *                            CakeFrostingType     frosting,
 *                            const char          *message,
 *                            GCancellable        *cancellable,
 *                            GAsyncReadyCallback  callback,
 *                            gpointer             user_data)
 *     {
 *       GTask *task;
 *       DecorationData *decoration;
 *       Cake  *cake;
 * 
 *       task = g_task_new (self, cancellable, callback, user_data);
 *       if (radius &lt; 3)
 *         {
 *           g_task_return_new_error (task, BAKER_ERROR, BAKER_ERROR_TOO_SMALL,
 *                                    &quot;%ucm radius cakes are silly&quot;,
 *                                    radius);
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       cake = _baker_get_cached_cake (self, radius, flavor, frosting, message);
 *       if (cake != NULL)
 *         {
 *           // _baker_get_cached_cake() returns a reffed cake
 *           g_task_return_pointer (task, cake, g_object_unref);
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       decoration = g_slice_new (DecorationData);
 *       decoration-&gt;frosting = frosting;
 *       decoration-&gt;message = g_strdup (message);
 *       g_task_set_task_data (task, decoration, (GDestroyNotify) decoration_data_free);
 * 
 *       _baker_begin_cake (self, radius, flavor, cancellable, baked_cb, task);
 *     }
 * 
 *     Cake *
 *     baker_bake_cake_finish (Baker         *self,
 *                             GAsyncResult  *result,
 *                             GError       **error)
 *     {
 *       g_return_val_if_fail (g_task_is_valid (result, self), NULL);
 * 
 *       return g_task_propagate_pointer (G_TASK (result), error);
 *     }
 * </pre>
 * <br>
 * <br>&#35;&#35; Chained asynchronous operations
 * <br>
 * <br>&#35;GTask also tries to simplify asynchronous operations that
 * <br>internally chain together several smaller asynchronous
 * <br>operations. g_task_get_cancellable(), g_task_get_context(),
 * <br>and g_task_get_priority() allow you to get back the task's
 * <br>&#35;GCancellable, &#35;GMainContext, and [I/O priority][io-priority]
 * <br>when starting a new subtask, so you don't have to keep track
 * <br>of them yourself. g_task_attach_source() simplifies the case
 * <br>of waiting for a source to fire (automatically using the correct
 * <br>&#35;GMainContext and priority).
 * <br>
 * <br>Here is an example for chained asynchronous operations:
 *   <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *     typedef struct {
 *       Cake *cake;
 *       CakeFrostingType frosting;
 *       char *message;
 *     } BakingData;
 * 
 *     static void
 *     decoration_data_free (BakingData *bd)
 *     {
 *       if (bd-&gt;cake)
 *         g_object_unref (bd-&gt;cake);
 *       g_free (bd-&gt;message);
 *       g_slice_free (BakingData, bd);
 *     }
 * 
 *     static void
 *     decorated_cb (Cake         *cake,
 *                   GAsyncResult *result,
 *                   gpointer      user_data)
 *     {
 *       GTask *task = user_data;
 *       GError *error = NULL;
 * 
 *       if (!cake_decorate_finish (cake, result, &amp;error))
 *         {
 *           g_object_unref (cake);
 *           g_task_return_error (task, error);
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       // baking_data_free() will drop its ref on the cake, so we have to
 *       // take another here to give to the caller.
 *       g_task_return_pointer (task, g_object_ref (cake), g_object_unref);
 *       g_object_unref (task);
 *     }
 * 
 *     static gboolean
 *     decorator_ready (gpointer user_data)
 *     {
 *       GTask *task = user_data;
 *       BakingData *bd = g_task_get_task_data (task);
 * 
 *       cake_decorate_async (bd-&gt;cake, bd-&gt;frosting, bd-&gt;message,
 *                            g_task_get_cancellable (task),
 *                            decorated_cb, task);
 * 
 *       return G_SOURCE_REMOVE;
 *     }
 * 
 *     static void
 *     baked_cb (Cake     *cake,
 *               gpointer  user_data)
 *     {
 *       GTask *task = user_data;
 *       BakingData *bd = g_task_get_task_data (task);
 *       GError *error = NULL;
 * 
 *       if (cake == NULL)
 *         {
 *           g_task_return_new_error (task, BAKER_ERROR, BAKER_ERROR_NO_FLOUR,
 *                                    &quot;Go to the supermarket&quot;);
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       bd-&gt;cake = cake;
 * 
 *       // Bail out now if the user has already cancelled
 *       if (g_task_return_error_if_cancelled (task))
 *         {
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       if (cake_decorator_available (cake))
 *         decorator_ready (task);
 *       else
 *         {
 *           GSource *source;
 * 
 *           source = cake_decorator_wait_source_new (cake);
 *           // Attach &#64;source to &#64;task's GMainContext and have it call
 *           // decorator_ready() when it is ready.
 *           g_task_attach_source (task, source, decorator_ready);
 *           g_source_unref (source);
 *         }
 *     }
 * 
 *     void
 *     baker_bake_cake_async (Baker               *self,
 *                            guint                radius,
 *                            CakeFlavor           flavor,
 *                            CakeFrostingType     frosting,
 *                            const char          *message,
 *                            gint                 priority,
 *                            GCancellable        *cancellable,
 *                            GAsyncReadyCallback  callback,
 *                            gpointer             user_data)
 *     {
 *       GTask *task;
 *       BakingData *bd;
 * 
 *       task = g_task_new (self, cancellable, callback, user_data);
 *       g_task_set_priority (task, priority);
 * 
 *       bd = g_slice_new0 (BakingData);
 *       bd-&gt;frosting = frosting;
 *       bd-&gt;message = g_strdup (message);
 *       g_task_set_task_data (task, bd, (GDestroyNotify) baking_data_free);
 * 
 *       _baker_begin_cake (self, radius, flavor, cancellable, baked_cb, task);
 *     }
 * 
 *     Cake *
 *     baker_bake_cake_finish (Baker         *self,
 *                             GAsyncResult  *result,
 *                             GError       **error)
 *     {
 *       g_return_val_if_fail (g_task_is_valid (result, self), NULL);
 * 
 *       return g_task_propagate_pointer (G_TASK (result), error);
 *     }
 * </pre>
 * <br>
 * <br>&#35;&#35; Asynchronous operations from synchronous ones
 * <br>
 * <br>You can use g_task_run_in_thread() to turn a synchronous
 * <br>operation into an asynchronous one, by running it in a thread.
 * <br>When it completes, the result will be dispatched to the
 * <br>[thread-default main context][g-main-context-push-thread-default]
 * <br>where the &#35;GTask was created.
 * <br>
 * <br>Running a task in a thread:
 *   <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *     typedef struct {
 *       guint radius;
 *       CakeFlavor flavor;
 *       CakeFrostingType frosting;
 *       char *message;
 *     } CakeData;
 * 
 *     static void
 *     cake_data_free (CakeData *cake_data)
 *     {
 *       g_free (cake_data-&gt;message);
 *       g_slice_free (CakeData, cake_data);
 *     }
 * 
 *     static void
 *     bake_cake_thread (GTask         *task,
 *                       gpointer       source_object,
 *                       gpointer       task_data,
 *                       GCancellable  *cancellable)
 *     {
 *       Baker *self = source_object;
 *       CakeData *cake_data = task_data;
 *       Cake *cake;
 *       GError *error = NULL;
 * 
 *       cake = bake_cake (baker, cake_data-&gt;radius, cake_data-&gt;flavor,
 *                         cake_data-&gt;frosting, cake_data-&gt;message,
 *                         cancellable, &amp;error);
 *       if (cake)
 *         g_task_return_pointer (task, cake, g_object_unref);
 *       else
 *         g_task_return_error (task, error);
 *     }
 * 
 *     void
 *     baker_bake_cake_async (Baker               *self,
 *                            guint                radius,
 *                            CakeFlavor           flavor,
 *                            CakeFrostingType     frosting,
 *                            const char          *message,
 *                            GCancellable        *cancellable,
 *                            GAsyncReadyCallback  callback,
 *                            gpointer             user_data)
 *     {
 *       CakeData *cake_data;
 *       GTask *task;
 * 
 *       cake_data = g_slice_new (CakeData);
 *       cake_data-&gt;radius = radius;
 *       cake_data-&gt;flavor = flavor;
 *       cake_data-&gt;frosting = frosting;
 *       cake_data-&gt;message = g_strdup (message);
 *       task = g_task_new (self, cancellable, callback, user_data);
 *       g_task_set_task_data (task, cake_data, (GDestroyNotify) cake_data_free);
 *       g_task_run_in_thread (task, bake_cake_thread);
 *       g_object_unref (task);
 *     }
 * 
 *     Cake *
 *     baker_bake_cake_finish (Baker         *self,
 *                             GAsyncResult  *result,
 *                             GError       **error)
 *     {
 *       g_return_val_if_fail (g_task_is_valid (result, self), NULL);
 * 
 *       return g_task_propagate_pointer (G_TASK (result), error);
 *     }
 * </pre>
 * <br>
 * <br>&#35;&#35; Adding cancellability to uncancellable tasks
 * <br>
 * <br>Finally, g_task_run_in_thread() and g_task_run_in_thread_sync()
 * <br>can be used to turn an uncancellable operation into a
 * <br>cancellable one. If you call g_task_set_return_on_cancel(),
 * <br>passing %TRUE, then if the task's &#35;GCancellable is cancelled,
 * <br>it will return control back to the caller immediately, while
 * <br>allowing the task thread to continue running in the background
 * <br>(and simply discarding its result when it finally does finish).
 * <br>Provided that the task thread is careful about how it uses
 * <br>locks and other externally-visible resources, this allows you
 * <br>to make &quot;GLib-friendly&quot; asynchronous and cancellable
 * <br>synchronous variants of blocking APIs.
 * <br>
 * <br>Cancelling a task:
 *   <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *     static void
 *     bake_cake_thread (GTask         *task,
 *                       gpointer       source_object,
 *                       gpointer       task_data,
 *                       GCancellable  *cancellable)
 *     {
 *       Baker *self = source_object;
 *       CakeData *cake_data = task_data;
 *       Cake *cake;
 *       GError *error = NULL;
 * 
 *       cake = bake_cake (baker, cake_data-&gt;radius, cake_data-&gt;flavor,
 *                         cake_data-&gt;frosting, cake_data-&gt;message,
 *                         &amp;error);
 *       if (error)
 *         {
 *           g_task_return_error (task, error);
 *           return;
 *         }
 * 
 *       // If the task has already been cancelled, then we don't want to add
 *       // the cake to the cake cache. Likewise, we don't  want to have the
 *       // task get cancelled in the middle of updating the cache.
 *       // g_task_set_return_on_cancel() will return %TRUE here if it managed
 *       // to disable return-on-cancel, or %FALSE if the task was cancelled
 *       // before it could.
 *       if (g_task_set_return_on_cancel (task, FALSE))
 *         {
 *           // If the caller cancels at this point, their
 *           // GAsyncReadyCallback won't be invoked until we return,
 *           // so we don't have to worry that this code will run at
 *           // the same time as that code does. But if there were
 *           // other functions that might look at the cake cache,
 *           // then we'd probably need a GMutex here as well.
 *           baker_add_cake_to_cache (baker, cake);
 *           g_task_return_pointer (task, cake, g_object_unref);
 *         }
 *     }
 * 
 *     void
 *     baker_bake_cake_async (Baker               *self,
 *                            guint                radius,
 *                            CakeFlavor           flavor,
 *                            CakeFrostingType     frosting,
 *                            const char          *message,
 *                            GCancellable        *cancellable,
 *                            GAsyncReadyCallback  callback,
 *                            gpointer             user_data)
 *     {
 *       CakeData *cake_data;
 *       GTask *task;
 * 
 *       cake_data = g_slice_new (CakeData);
 * 
 *       ...
 * 
 *       task = g_task_new (self, cancellable, callback, user_data);
 *       g_task_set_task_data (task, cake_data, (GDestroyNotify) cake_data_free);
 *       g_task_set_return_on_cancel (task, TRUE);
 *       g_task_run_in_thread (task, bake_cake_thread);
 *     }
 * 
 *     Cake *
 *     baker_bake_cake_sync (Baker               *self,
 *                           guint                radius,
 *                           CakeFlavor           flavor,
 *                           CakeFrostingType     frosting,
 *                           const char          *message,
 *                           GCancellable        *cancellable,
 *                           GError             **error)
 *     {
 *       CakeData *cake_data;
 *       GTask *task;
 *       Cake *cake;
 * 
 *       cake_data = g_slice_new (CakeData);
 * 
 *       ...
 * 
 *       task = g_task_new (self, cancellable, NULL, NULL);
 *       g_task_set_task_data (task, cake_data, (GDestroyNotify) cake_data_free);
 *       g_task_set_return_on_cancel (task, TRUE);
 *       g_task_run_in_thread_sync (task, bake_cake_thread);
 * 
 *       cake = g_task_propagate_pointer (task, error);
 *       g_object_unref (task);
 *       return cake;
 *     }
 * </pre>
 * <br>
 * <br>&#35;&#35; Porting from GSimpleAsyncResult
 * <br>
 * <br>&#35;GTask's API attempts to be simpler than &#35;GSimpleAsyncResult's
 * <br>in several ways:
 * <br>- You can save task-specific data with g_task_set_task_data(), and
 * <br>  retrieve it later with g_task_get_task_data(). This replaces the
 * <br>  abuse of g_simple_async_result_set_op_res_gpointer() for the same
 * <br>  purpose with &#35;GSimpleAsyncResult.
 * <br>- In addition to the task data, &#35;GTask also keeps track of the
 * <br>  [priority][io-priority], &#35;GCancellable, and
 * <br>  &#35;GMainContext associated with the task, so tasks that consist of
 * <br>  a chain of simpler asynchronous operations will have easy access
 * <br>  to those values when starting each sub-task.
 * <br>- g_task_return_error_if_cancelled() provides simplified
 * <br>  handling for cancellation. In addition, cancellation
 * <br>  overrides any other &#35;GTask return value by default, like
 * <br>  &#35;GSimpleAsyncResult does when
 * <br>  g_simple_async_result_set_check_cancellable() is called.
 * <br>  (You can use g_task_set_check_cancellable() to turn off that
 * <br>  behavior.) On the other hand, g_task_run_in_thread()
 * <br>  guarantees that it will always run your
 * <br>  `task_func`, even if the task's &#35;GCancellable
 * <br>  is already cancelled before the task gets a chance to run;
 * <br>  you can start your `task_func` with a
 * <br>  g_task_return_error_if_cancelled() check if you need the
 * <br>  old behavior.
 * <br>- The &quot;return&quot; methods (eg, g_task_return_pointer())
 * <br>  automatically cause the task to be &quot;completed&quot; as well, and
 * <br>  there is no need to worry about the &quot;complete&quot; vs &quot;complete
 * <br>  in idle&quot; distinction. (&#35;GTask automatically figures out
 * <br>  whether the task's callback can be invoked directly, or
 * <br>  if it needs to be sent to another &#35;GMainContext, or delayed
 * <br>  until the next iteration of the current &#35;GMainContext.)
 * <br>- The &quot;finish&quot; functions for &#35;GTask based operations are generally
 * <br>  much simpler than &#35;GSimpleAsyncResult ones, normally consisting
 * <br>  of only a single call to g_task_propagate_pointer() or the like.
 * <br>  Since g_task_propagate_pointer() &quot;steals&quot; the return value from
 * <br>  the &#35;GTask, it is not necessary to juggle pointers around to
 * <br>  prevent it from being freed twice.
 * <br>- With &#35;GSimpleAsyncResult, it was common to call
 * <br>  g_simple_async_result_propagate_error() from the
 * <br>  `_finish()` wrapper function, and have
 * <br>  virtual method implementations only deal with successful
 * <br>  returns. This behavior is deprecated, because it makes it
 * <br>  difficult for a subclass to chain to a parent class's async
 * <br>  methods. Instead, the wrapper function should just be a
 * <br>  simple wrapper, and the virtual method should call an
 * <br>  appropriate `g_task_propagate_` function.
 * <br>  Note that wrapper methods can now use
 * <br>  g_async_result_legacy_propagate_error() to do old-style
 * <br>  &#35;GSimpleAsyncResult error-returning behavior, and
 * <br>  g_async_result_is_tagged() to check if a result is tagged as
 * <br>  having come from the `_async()` wrapper
 * <br>  function (for &quot;short-circuit&quot; results, such as when passing
 * <br>  0 to g_input_stream_read_async()).
 * <p><a href="https://docs.gtk.org/gio/class.Task.html">https://docs.gtk.org/gio/class.Task.html</a></p>
*/
public class Task extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Task.class.getCanonicalName());
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
    
    private static JnaTask.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaTask.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSourceFunc {
        /**
         * Specifies the type of function passed to g_timeout_add(),
         * <br>g_timeout_add_full(), g_idle_add(), and g_idle_add_full().
         * <br>
         * <br>When calling g_source_set_callback(), you may need to cast a function of a
         * <br>different type to this type. Use G_SOURCE_FUNC() to avoid warnings about
         * <br>incompatible function types.
         * @param user_data data passed to the function, set when the source was     created with one of the above functions
         * @return %FALSE if the source should be removed. %G_SOURCE_CONTINUE and %G_SOURCE_REMOVE are more memorable names for the return value.
        */
        boolean onSourceFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaTask.OnSourceFunc toOnSourceFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnSourceFunc in) {
        JnaTask.OnSourceFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_user_data) -> in.onSourceFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTask.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaTask.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTaskThreadFunc {
        /**
         * The prototype for a task function to be run in a thread via
         * <br>g_task_run_in_thread() or g_task_run_in_thread_sync().
         * <br>
         * <br>If the return-on-cancel flag is set on &#64;task, and &#64;cancellable gets
         * <br>cancelled, then the &#35;GTask will be completed immediately (as though
         * <br>g_task_return_error_if_cancelled() had been called), without
         * <br>waiting for the task function to complete. However, the task
         * <br>function will continue running in its thread in the background. The
         * <br>function therefore needs to be careful about how it uses
         * <br>externally-visible state in this case. See
         * <br>g_task_set_return_on_cancel() for more details.
         * <br>
         * <br>Other than in that case, &#64;task will be completed when the
         * <br>&#35;GTaskThreadFunc returns, not when it calls a
         * <br>`g_task_return_` function.
         * @param task the &#35;GTask
         * @param source_object &#64;task's source object
         * @param task_data &#64;task's task data
         * @param cancellable &#64;task's &#35;GCancellable, or %NULL
        */
        void onTaskThreadFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Task task, @Nonnull ch.bailu.gtk.type.Pointer source_object, @Nullable ch.bailu.gtk.type.Pointer task_data, @Nullable Cancellable cancellable);
    }
    
    private static JnaTask.OnTaskThreadFunc toOnTaskThreadFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTaskThreadFunc in) {
        JnaTask.OnTaskThreadFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_task, _source_object, _task_data, _cancellable) -> in.onTaskThreadFunc(__callback, new Task(new PointerContainer(_task)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_source_object)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_task_data)), new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    public Task(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a &#35;GTask acting on &#64;source_object, which will eventually be
     * <br>used to invoke &#64;callback in the current
     * <br>[thread-default main context][g-main-context-push-thread-default].
     * <br>
     * <br>Call this in the &quot;start&quot; method of your asynchronous method, and
     * <br>pass the &#35;GTask around throughout the asynchronous operation. You
     * <br>can use g_task_set_task_data() to attach task-specific data to the
     * <br>object, which you can retrieve later via g_task_get_task_data().
     * <br>
     * <br>By default, if &#64;cancellable is cancelled, then the return value of
     * <br>the task will always be %G_IO_ERROR_CANCELLED, even if the task had
     * <br>already completed before the cancellation. This allows for
     * <br>simplified handling in cases where cancellation may imply that
     * <br>other objects that the task depends on have been destroyed. If you
     * <br>do not want this behavior, you can use
     * <br>g_task_set_check_cancellable() to change it.
     * @param source_object the &#35;GObject that owns   this task, or %NULL.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback.
     * @param callback_data user data passed to &#64;callback.
    */
    public Task(@Nullable ch.bailu.gtk.type.Pointer source_object, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer callback_data) {
        super(cast(JnaTask.INST().g_task_new(asCPointer(source_object), asCPointer(cancellable), toOnAsyncReadyCallback(getClassHandler().getInstance(), "_new", callback), asCPointer(callback_data))));
    }

    /**
     * A utility function for dealing with async operations where you need
     * <br>to wait for a &#35;GSource to trigger. Attaches &#64;source to &#64;task's
     * <br>&#35;GMainContext with &#64;task's [priority][io-priority], and sets &#64;source's
     * <br>callback to &#64;callback, with &#64;task as the callback's `user_data`.
     * <br>
     * <br>It will set the &#64;source’s name to the task’s name (as set with
     * <br>g_task_set_name()), if one has been set.
     * <br>
     * <br>This takes a reference on &#64;task until &#64;source is destroyed.
     * @param source the source to attach
     * @param callback the callback to invoke when &#64;source triggers
    */
    public void attachSource(@Nonnull ch.bailu.gtk.glib.Source source, OnSourceFunc callback)  {
        JnaTask.INST().g_task_attach_source(asCPointer(), asCPointerNotNull(source), toOnSourceFunc(this, "attachSource", callback));
    }

    /**
     * Gets &#64;task's &#35;GCancellable
     * @return &#64;task's &#35;GCancellable
    */
    public Cancellable getCancellable()  {
        return new Cancellable(new PointerContainer(JnaTask.INST().g_task_get_cancellable(asCPointer())));
    }

    /**
     * Gets &#64;task's check-cancellable flag. See
     * <br>g_task_set_check_cancellable() for more details.
     * @return 
    */
    public boolean getCheckCancellable()  {
        return JnaTask.INST().g_task_get_check_cancellable(asCPointer());
    }

    /**
     * Gets the value of &#35;GTask:completed. This changes from %FALSE to %TRUE after
     * <br>the task’s callback is invoked, and will return %FALSE if called from inside
     * <br>the callback.
     * @return %TRUE if the task has completed, %FALSE otherwise.
    */
    public boolean getCompleted()  {
        return JnaTask.INST().g_task_get_completed(asCPointer());
    }

    /**
     * Gets the &#35;GMainContext that &#64;task will return its result in (that
     * <br>is, the context that was the
     * <br>[thread-default main context][g-main-context-push-thread-default]
     * <br>at the point when &#64;task was created).
     * <br>
     * <br>This will always return a non-%NULL value, even if the task's
     * <br>context is the default &#35;GMainContext.
     * @return &#64;task's &#35;GMainContext
    */
    public ch.bailu.gtk.glib.MainContext getContext()  {
        return new ch.bailu.gtk.glib.MainContext(new PointerContainer(JnaTask.INST().g_task_get_context(asCPointer())));
    }

    /**
     * Gets &#64;task’s name. See g_task_set_name().
     * @return &#64;task’s name, or %NULL
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTask.INST().g_task_get_name(asCPointer())));
    }

    /**
     * Gets &#64;task's priority
     * @return &#64;task's priority
    */
    public int getPriority()  {
        return JnaTask.INST().g_task_get_priority(asCPointer());
    }

    /**
     * Gets &#64;task's return-on-cancel flag. See
     * <br>g_task_set_return_on_cancel() for more details.
     * @return 
    */
    public boolean getReturnOnCancel()  {
        return JnaTask.INST().g_task_get_return_on_cancel(asCPointer());
    }

    /**
     * Gets the source object from &#64;task. Like
     * <br>g_async_result_get_source_object(), but does not ref the object.
     * @return &#64;task's source object, or %NULL
    */
    public ch.bailu.gtk.type.Pointer getSourceObject()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTask.INST().g_task_get_source_object(asCPointer())));
    }

    /**
     * Gets &#64;task's source tag. See g_task_set_source_tag().
     * @return &#64;task's source tag
    */
    public ch.bailu.gtk.type.Pointer getSourceTag()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTask.INST().g_task_get_source_tag(asCPointer())));
    }

    /**
     * Gets &#64;task's `task_data`.
     * @return &#64;task's `task_data`.
    */
    public ch.bailu.gtk.type.Pointer getTaskData()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTask.INST().g_task_get_task_data(asCPointer())));
    }

    /**
     * Tests if &#64;task resulted in an error.
     * @return %TRUE if the task resulted in an error, %FALSE otherwise.
    */
    public boolean hadError()  {
        return JnaTask.INST().g_task_had_error(asCPointer());
    }

    /**
     * Gets the result of &#64;task as a &#35;gboolean.
     * <br>
     * <br>If the task resulted in an error, or was cancelled, then this will
     * <br>instead return %FALSE and set &#64;error.
     * <br>
     * <br>Since this method transfers ownership of the return value (or
     * <br>error) to the caller, you may only call it once.
     * @return the task result, or %FALSE on error
    */
    public boolean propagateBoolean() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTask.INST().g_task_propagate_boolean(asCPointer(), 0L);
    }

    /**
     * Gets the result of &#64;task as an integer (&#35;gssize).
     * <br>
     * <br>If the task resulted in an error, or was cancelled, then this will
     * <br>instead return -1 and set &#64;error.
     * <br>
     * <br>Since this method transfers ownership of the return value (or
     * <br>error) to the caller, you may only call it once.
     * @return the task result, or -1 on error
    */
    public long propagateInt() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTask.INST().g_task_propagate_int(asCPointer(), 0L);
    }

    /**
     * Gets the result of &#64;task as a pointer, and transfers ownership
     * <br>of that value to the caller.
     * <br>
     * <br>If the task resulted in an error, or was cancelled, then this will
     * <br>instead return %NULL and set &#64;error.
     * <br>
     * <br>Since this method transfers ownership of the return value (or
     * <br>error) to the caller, you may only call it once.
     * @return the task result, or %NULL on error
    */
    public ch.bailu.gtk.type.Pointer propagatePointer() throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTask.INST().g_task_propagate_pointer(asCPointer(), 0L)));
    }

    /**
     * Gets the result of &#64;task as a &#35;GValue, and transfers ownership of
     * <br>that value to the caller. As with g_task_return_value(), this is
     * <br>a generic low-level method; g_task_propagate_pointer() and the like
     * <br>will usually be more useful for C code.
     * <br>
     * <br>If the task resulted in an error, or was cancelled, then this will
     * <br>instead set &#64;error and return %FALSE.
     * <br>
     * <br>Since this method transfers ownership of the return value (or
     * <br>error) to the caller, you may only call it once.
     * @param value return location for the &#35;GValue
     * @return %TRUE if &#64;task succeeded, %FALSE on error.
    */
    public boolean propagateValue(@Nonnull ch.bailu.gtk.gobject.Value value) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaTask.INST().g_task_propagate_value(asCPointer(), asCPointerNotNull(value), 0L);
    }

    /**
     * Sets &#64;task's result to &#64;result and completes the task (see
     * <br>g_task_return_pointer() for more discussion of exactly what this
     * <br>means).
     * @param result the &#35;gboolean result of a task function.
    */
    public void returnBoolean(boolean result)  {
        JnaTask.INST().g_task_return_boolean(asCPointer(), result);
    }

    /**
     * Sets &#64;task's result to &#64;error (which &#64;task assumes ownership of)
     * <br>and completes the task (see g_task_return_pointer() for more
     * <br>discussion of exactly what this means).
     * <br>
     * <br>Note that since the task takes ownership of &#64;error, and since the
     * <br>task may be completed before returning from g_task_return_error(),
     * <br>you cannot assume that &#64;error is still valid after calling this.
     * <br>Call g_error_copy() on the error if you need to keep a local copy
     * <br>as well.
     * <br>
     * <br>See also g_task_return_new_error().
     * @param error the &#35;GError result of a task function.
    */
    public void returnError(@Nonnull ch.bailu.gtk.glib.Error error)  {
        JnaTask.INST().g_task_return_error(asCPointer(), asCPointerNotNull(error));
    }

    /**
     * Checks if &#64;task's &#35;GCancellable has been cancelled, and if so, sets
     * <br>&#64;task's error accordingly and completes the task (see
     * <br>g_task_return_pointer() for more discussion of exactly what this
     * <br>means).
     * @return %TRUE if &#64;task has been cancelled, %FALSE if not
    */
    public boolean returnErrorIfCancelled()  {
        return JnaTask.INST().g_task_return_error_if_cancelled(asCPointer());
    }

    /**
     * Sets &#64;task's result to &#64;result and completes the task (see
     * <br>g_task_return_pointer() for more discussion of exactly what this
     * <br>means).
     * @param result the integer (&#35;gssize) result of a task function.
    */
    public void returnInt(long result)  {
        JnaTask.INST().g_task_return_int(asCPointer(), result);
    }

    /**
     * Sets &#64;task's result to a new &#35;GError created from &#64;domain, &#64;code,
     * <br>&#64;format, and the remaining arguments, and completes the task (see
     * <br>g_task_return_pointer() for more discussion of exactly what this
     * <br>means).
     * <br>
     * <br>See also g_task_return_error().
     * @param domain a &#35;GQuark.
     * @param code an error code.
     * @param format a string with format characters.
     * @param _elipse a list of values to insert into &#64;format.
    */
    public void returnNewError(int domain, int code, @Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaTask.INST().g_task_return_new_error(asCPointer(), domain, code, asCPointerNotNull(format), _elipse);
    }

    /**
     * Sets &#64;task's result to a new &#35;GError created from &#64;domain, &#64;code,
     * <br>&#64;format, and the remaining arguments, and completes the task (see
     * <br>g_task_return_pointer() for more discussion of exactly what this
     * <br>means).
     * <br>
     * <br>See also g_task_return_error().
     * @param domain a &#35;GQuark.
     * @param code an error code.
     * @param format a string with format characters.
     * @param _elipse a list of values to insert into &#64;format.
    */
    public void returnNewError(int domain, int code, String format, java.lang.Object... _elipse)  {
        JnaTask.INST().g_task_return_new_error(asCPointer(), domain, code, format, _elipse);
    }

    /**
     * Sets &#64;task's result to &#64;result and completes the task. If &#64;result
     * <br>is not %NULL, then &#64;result_destroy will be used to free &#64;result if
     * <br>the caller does not take ownership of it with
     * <br>g_task_propagate_pointer().
     * <br>
     * <br>&quot;Completes the task&quot; means that for an ordinary asynchronous task
     * <br>it will either invoke the task's callback, or else queue that
     * <br>callback to be invoked in the proper &#35;GMainContext, or in the next
     * <br>iteration of the current &#35;GMainContext. For a task run via
     * <br>g_task_run_in_thread() or g_task_run_in_thread_sync(), calling this
     * <br>method will save &#64;result to be returned to the caller later, but
     * <br>the task will not actually be completed until the &#35;GTaskThreadFunc
     * <br>exits.
     * <br>
     * <br>Note that since the task may be completed before returning from
     * <br>g_task_return_pointer(), you cannot assume that &#64;result is still
     * <br>valid after calling this, unless you are still holding another
     * <br>reference on it.
     * @param result the pointer result of a task     function
     * @param result_destroy a &#35;GDestroyNotify function.
    */
    public void returnPointer(@Nullable ch.bailu.gtk.type.Pointer result, OnDestroyNotify result_destroy)  {
        JnaTask.INST().g_task_return_pointer(asCPointer(), asCPointer(result), toOnDestroyNotify(this, "returnPointer", result_destroy));
    }

    /**
     * Sets &#64;task's result to &#64;result (by copying it) and completes the task.
     * <br>
     * <br>If &#64;result is %NULL then a &#35;GValue of type %G_TYPE_POINTER
     * <br>with a value of %NULL will be used for the result.
     * <br>
     * <br>This is a very generic low-level method intended primarily for use
     * <br>by language bindings; for C code, g_task_return_pointer() and the
     * <br>like will normally be much easier to use.
     * @param result the &#35;GValue result of                                      a task function
    */
    public void returnValue(@Nullable ch.bailu.gtk.gobject.Value result)  {
        JnaTask.INST().g_task_return_value(asCPointer(), asCPointer(result));
    }

    /**
     * Runs &#64;task_func in another thread. When &#64;task_func returns, &#64;task's
     * <br>&#35;GAsyncReadyCallback will be invoked in &#64;task's &#35;GMainContext.
     * <br>
     * <br>This takes a ref on &#64;task until the task completes.
     * <br>
     * <br>See &#35;GTaskThreadFunc for more details about how &#64;task_func is handled.
     * <br>
     * <br>Although GLib currently rate-limits the tasks queued via
     * <br>g_task_run_in_thread(), you should not assume that it will always
     * <br>do this. If you have a very large number of tasks to run (several tens of
     * <br>tasks), but don't want them to all run at once, you should only queue a
     * <br>limited number of them (around ten) at a time.
     * @param task_func a &#35;GTaskThreadFunc
    */
    public void runInThread(OnTaskThreadFunc task_func)  {
        JnaTask.INST().g_task_run_in_thread(asCPointer(), toOnTaskThreadFunc(this, "runInThread", task_func));
    }

    /**
     * Runs &#64;task_func in another thread, and waits for it to return or be
     * <br>cancelled. You can use g_task_propagate_pointer(), etc, afterward
     * <br>to get the result of &#64;task_func.
     * <br>
     * <br>See &#35;GTaskThreadFunc for more details about how &#64;task_func is handled.
     * <br>
     * <br>Normally this is used with tasks created with a %NULL
     * <br>`callback`, but note that even if the task does
     * <br>have a callback, it will not be invoked when &#64;task_func returns.
     * <br>&#35;GTask:completed will be set to %TRUE just before this function returns.
     * <br>
     * <br>Although GLib currently rate-limits the tasks queued via
     * <br>g_task_run_in_thread_sync(), you should not assume that it will
     * <br>always do this. If you have a very large number of tasks to run,
     * <br>but don't want them to all run at once, you should only queue a
     * <br>limited number of them at a time.
     * @param task_func a &#35;GTaskThreadFunc
    */
    public void runInThreadSync(OnTaskThreadFunc task_func)  {
        JnaTask.INST().g_task_run_in_thread_sync(asCPointer(), toOnTaskThreadFunc(this, "runInThreadSync", task_func));
    }

    /**
     * Sets or clears &#64;task's check-cancellable flag. If this is %TRUE
     * <br>(the default), then g_task_propagate_pointer(), etc, and
     * <br>g_task_had_error() will check the task's &#35;GCancellable first, and
     * <br>if it has been cancelled, then they will consider the task to have
     * <br>returned an &quot;Operation was cancelled&quot; error
     * <br>(%G_IO_ERROR_CANCELLED), regardless of any other error or return
     * <br>value the task may have had.
     * <br>
     * <br>If &#64;check_cancellable is %FALSE, then the &#35;GTask will not check the
     * <br>cancellable itself, and it is up to &#64;task's owner to do this (eg,
     * <br>via g_task_return_error_if_cancelled()).
     * <br>
     * <br>If you are using g_task_set_return_on_cancel() as well, then
     * <br>you must leave check-cancellable set %TRUE.
     * @param check_cancellable whether &#35;GTask will check the state of   its &#35;GCancellable for you.
    */
    public void setCheckCancellable(boolean check_cancellable)  {
        JnaTask.INST().g_task_set_check_cancellable(asCPointer(), check_cancellable);
    }

    /**
     * Sets &#64;task’s name, used in debugging and profiling. The name defaults to
     * <br>%NULL.
     * <br>
     * <br>The task name should describe in a human readable way what the task does.
     * <br>For example, ‘Open file’ or ‘Connect to network host’. It is used to set the
     * <br>name of the &#35;GSource used for idle completion of the task.
     * <br>
     * <br>This function may only be called before the &#64;task is first used in a thread
     * <br>other than the one it was constructed in. It is called automatically by
     * <br>g_task_set_source_tag() if not called already.
     * @param name a human readable name for the task, or %NULL to unset it
    */
    public void setName(@Nullable ch.bailu.gtk.type.Str name)  {
        JnaTask.INST().g_task_set_name(asCPointer(), asCPointer(name));
    }

    /**
     * Sets &#64;task’s name, used in debugging and profiling. The name defaults to
     * <br>%NULL.
     * <br>
     * <br>The task name should describe in a human readable way what the task does.
     * <br>For example, ‘Open file’ or ‘Connect to network host’. It is used to set the
     * <br>name of the &#35;GSource used for idle completion of the task.
     * <br>
     * <br>This function may only be called before the &#64;task is first used in a thread
     * <br>other than the one it was constructed in. It is called automatically by
     * <br>g_task_set_source_tag() if not called already.
     * @param name a human readable name for the task, or %NULL to unset it
    */
    public void setName(String name)  {
        JnaTask.INST().g_task_set_name(asCPointer(), name);
    }

    /**
     * Sets &#64;task's priority. If you do not call this, it will default to
     * <br>%G_PRIORITY_DEFAULT.
     * <br>
     * <br>This will affect the priority of &#35;GSources created with
     * <br>g_task_attach_source() and the scheduling of tasks run in threads,
     * <br>and can also be explicitly retrieved later via
     * <br>g_task_get_priority().
     * @param priority the [priority][io-priority] of the request
    */
    public void setPriority(int priority)  {
        JnaTask.INST().g_task_set_priority(asCPointer(), priority);
    }

    /**
     * Sets or clears &#64;task's return-on-cancel flag. This is only
     * <br>meaningful for tasks run via g_task_run_in_thread() or
     * <br>g_task_run_in_thread_sync().
     * <br>
     * <br>If &#64;return_on_cancel is %TRUE, then cancelling &#64;task's
     * <br>&#35;GCancellable will immediately cause it to return, as though the
     * <br>task's &#35;GTaskThreadFunc had called
     * <br>g_task_return_error_if_cancelled() and then returned.
     * <br>
     * <br>This allows you to create a cancellable wrapper around an
     * <br>uninterruptible function. The &#35;GTaskThreadFunc just needs to be
     * <br>careful that it does not modify any externally-visible state after
     * <br>it has been cancelled. To do that, the thread should call
     * <br>g_task_set_return_on_cancel() again to (atomically) set
     * <br>return-on-cancel %FALSE before making externally-visible changes;
     * <br>if the task gets cancelled before the return-on-cancel flag could
     * <br>be changed, g_task_set_return_on_cancel() will indicate this by
     * <br>returning %FALSE.
     * <br>
     * <br>You can disable and re-enable this flag multiple times if you wish.
     * <br>If the task's &#35;GCancellable is cancelled while return-on-cancel is
     * <br>%FALSE, then calling g_task_set_return_on_cancel() to set it %TRUE
     * <br>again will cause the task to be cancelled at that point.
     * <br>
     * <br>If the task's &#35;GCancellable is already cancelled before you call
     * <br>g_task_run_in_thread()/g_task_run_in_thread_sync(), then the
     * <br>&#35;GTaskThreadFunc will still be run (for consistency), but the task
     * <br>will also be completed right away.
     * @param return_on_cancel whether the task returns automatically when   it is cancelled.
     * @return %TRUE if &#64;task's return-on-cancel flag was changed to   match &#64;return_on_cancel. %FALSE if &#64;task has already been   cancelled.
    */
    public boolean setReturnOnCancel(boolean return_on_cancel)  {
        return JnaTask.INST().g_task_set_return_on_cancel(asCPointer(), return_on_cancel);
    }

    /**
     * Sets &#64;task's source tag.
     * <br>
     * <br>You can use this to tag a task return
     * <br>value with a particular pointer (usually a pointer to the function
     * <br>doing the tagging) and then later check it using
     * <br>g_task_get_source_tag() (or g_async_result_is_tagged()) in the
     * <br>task's &quot;finish&quot; function, to figure out if the response came from a
     * <br>particular place.
     * <br>
     * <br>A macro wrapper around this function will automatically set the
     * <br>task’s name to the string form of &#64;source_tag if it’s not already
     * <br>set, for convenience.
     * @param source_tag an opaque pointer indicating the source of this task
    */
    public void setSourceTag(@Nullable ch.bailu.gtk.type.Pointer source_tag)  {
        JnaTask.INST().g_task_set_source_tag(asCPointer(), asCPointer(source_tag));
    }

    /**
     * Sets &#64;task's task data (freeing the existing task data, if any).
     * @param task_data task-specific data
     * @param task_data_destroy &#35;GDestroyNotify for &#64;task_data
    */
    public void setTaskData(@Nullable ch.bailu.gtk.type.Pointer task_data, OnDestroyNotify task_data_destroy)  {
        JnaTask.INST().g_task_set_task_data(asCPointer(), asCPointer(task_data), toOnDestroyNotify(this, "setTaskData", task_data_destroy));
    }

    /**
     * Checks that &#64;result is a &#35;GTask, and that &#64;source_object is its
     * <br>source object (or that &#64;source_object is %NULL and &#64;result has no
     * <br>source object). This can be used in g_return_if_fail() checks.
     * @param result A &#35;GAsyncResult
     * @param source_object the source object   expected to be associated with the task
     * @return %TRUE if &#64;result and &#64;source_object are valid, %FALSE if not
    */
    public static boolean isValid(@Nonnull ch.bailu.gtk.type.Pointer result, @Nullable ch.bailu.gtk.type.Pointer source_object)  {
        return JnaTask.INST().g_task_is_valid(asCPointerNotNull(result), asCPointer(source_object));
    }

    /**
     * Creates a &#35;GTask and then immediately calls g_task_return_error()
     * <br>on it. Use this in the wrapper function of an asynchronous method
     * <br>when you want to avoid even calling the virtual method. You can
     * <br>then use g_async_result_is_tagged() in the finish method wrapper to
     * <br>check if the result there is tagged as having been created by the
     * <br>wrapper method, and deal with it appropriately if so.
     * <br>
     * <br>See also g_task_report_new_error().
     * @param source_object the &#35;GObject that owns   this task, or %NULL.
     * @param callback a &#35;GAsyncReadyCallback.
     * @param callback_data user data passed to &#64;callback.
     * @param source_tag an opaque pointer indicating the source of this task
     * @param error error to report
    */
    public static void reportError(@Nullable ch.bailu.gtk.type.Pointer source_object, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer callback_data, @Nullable ch.bailu.gtk.type.Pointer source_tag, @Nonnull ch.bailu.gtk.glib.Error error)  {
        JnaTask.INST().g_task_report_error(asCPointer(source_object), toOnAsyncReadyCallback(getClassHandler().getInstance(), "reportError", callback), asCPointer(callback_data), asCPointer(source_tag), asCPointerNotNull(error));
    }

    /**
     * Creates a &#35;GTask and then immediately calls
     * <br>g_task_return_new_error() on it. Use this in the wrapper function
     * <br>of an asynchronous method when you want to avoid even calling the
     * <br>virtual method. You can then use g_async_result_is_tagged() in the
     * <br>finish method wrapper to check if the result there is tagged as
     * <br>having been created by the wrapper method, and deal with it
     * <br>appropriately if so.
     * <br>
     * <br>See also g_task_report_error().
     * @param source_object the &#35;GObject that owns   this task, or %NULL.
     * @param callback a &#35;GAsyncReadyCallback.
     * @param callback_data user data passed to &#64;callback.
     * @param source_tag an opaque pointer indicating the source of this task
     * @param domain a &#35;GQuark.
     * @param code an error code.
     * @param format a string with format characters.
     * @param _elipse a list of values to insert into &#64;format.
    */
    public static void reportNewError(@Nullable ch.bailu.gtk.type.Pointer source_object, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer callback_data, @Nullable ch.bailu.gtk.type.Pointer source_tag, int domain, int code, @Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaTask.INST().g_task_report_new_error(asCPointer(source_object), toOnAsyncReadyCallback(getClassHandler().getInstance(), "reportNewError", callback), asCPointer(callback_data), asCPointer(source_tag), domain, code, asCPointerNotNull(format), _elipse);
    }

    /**
     * Implements interface {@link AsyncResult}. Call this to get access to interface functions.
     * @return {@link AsyncResult}
    */
    public AsyncResult asAsyncResult() {
        return new AsyncResult(cast());
    }

    public static long getTypeID() { 
        return JnaTask.INST().g_task_get_type(); 
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
