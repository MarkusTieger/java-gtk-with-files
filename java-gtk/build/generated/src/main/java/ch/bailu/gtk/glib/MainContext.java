/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GMainContext` struct is an opaque data
 * <br>type representing a set of sources to be handled in a main loop.
 * <p><a href="https://docs.gtk.org/glib/struct.MainContext.html">https://docs.gtk.org/glib/struct.MainContext.html</a></p>
*/
public class MainContext extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MainContext.class.getCanonicalName());
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
    
    private static JnaMainContext.OnSourceFunc toOnSourceFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnSourceFunc in) {
        JnaMainContext.OnSourceFunc out = null;
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
    
    private static JnaMainContext.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaMainContext.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPollFunc {
        /**
         * Specifies the type of function passed to g_main_context_set_poll_func().
         * <br>The semantics of the function should match those of the poll() system call.
         * @param ufds an array of &#35;GPollFD elements
         * @param nfsd the number of elements in &#64;ufds
         * @param timeout_ the maximum time to wait for an event of the file descriptors.     A negative value indicates an infinite timeout.
         * @return the number of &#35;GPollFD elements which have events or errors     reported, or -1 if an error occurred.
        */
        int onPollFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PollFD ufds, int nfsd, int timeout_);
    }
    
    private static JnaMainContext.OnPollFunc toOnPollFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnPollFunc in) {
        JnaMainContext.OnPollFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_ufds, _nfsd, _timeout_) -> in.onPollFunc(__callback, new PollFD(new PointerContainer(_ufds)), _nfsd, _timeout_);
            __callback.register(out);
        }
        return out;
    }

    public MainContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GMainContext structure.
     * @param flags a bitwise-OR combination of &#35;GMainContextFlags flags that can only be         set at creation time.
     * @return the new &#35;GMainContext
    */
    public static MainContext newWithFlagsMainContext(int flags)  {
        PointerContainer __self = cast(JnaMainContext.INST().g_main_context_new_with_flags(flags));
        if (__self.isNull()) {
            throw new NullPointerException("MainContext:newWithFlags");
        }
        return new MainContext(__self);
    }        
    

    /**
     * Creates a new &#35;GMainContext structure.
    */
    public MainContext() {
        super(cast(JnaMainContext.INST().g_main_context_new()));
    }

    /**
     * Tries to become the owner of the specified context.
     * <br>If some other thread is the owner of the context,
     * <br>returns %FALSE immediately. Ownership is properly
     * <br>recursive: the owner can require ownership again
     * <br>and will release ownership when g_main_context_release()
     * <br>is called as many times as g_main_context_acquire().
     * <br>
     * <br>You must be the owner of a context before you
     * <br>can call g_main_context_prepare(), g_main_context_query(),
     * <br>g_main_context_check(), g_main_context_dispatch().
     * @return %TRUE if the operation succeeded, and   this thread is now the owner of &#64;context.
    */
    public boolean acquire()  {
        return JnaMainContext.INST().g_main_context_acquire(asCPointer());
    }

    /**
     * Adds a file descriptor to the set of file descriptors polled for
     * <br>this context. This will very seldom be used directly. Instead
     * <br>a typical event source will use g_source_add_unix_fd() instead.
     * @param fd a &#35;GPollFD structure holding information about a file      descriptor to watch.
     * @param priority the priority for this file descriptor which should be      the same as the priority used for g_source_attach() to ensure that the      file descriptor is polled whenever the results may be needed.
    */
    public void addPoll(@Nonnull PollFD fd, int priority)  {
        JnaMainContext.INST().g_main_context_add_poll(asCPointer(), asCPointerNotNull(fd), priority);
    }

    /**
     * Dispatches all pending sources.
     * <br>
     * <br>You must have successfully acquired the context with
     * <br>g_main_context_acquire() before you may call this function.
    */
    public void dispatch()  {
        JnaMainContext.INST().g_main_context_dispatch(asCPointer());
    }

    /**
     * Finds a source with the given source functions and user data.  If
     * <br>multiple sources exist with the same source function and user data,
     * <br>the first one found will be returned.
     * @param funcs the &#64;source_funcs passed to g_source_new().
     * @param user_data the user data from the callback.
     * @return the source, if one was found, otherwise %NULL
    */
    public Source findSourceByFuncsUserData(@Nonnull SourceFuncs funcs, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new Source(new PointerContainer(JnaMainContext.INST().g_main_context_find_source_by_funcs_user_data(asCPointer(), asCPointerNotNull(funcs), asCPointer(user_data))));
    }

    /**
     * Finds a &#35;GSource given a pair of context and ID.
     * <br>
     * <br>It is a programmer error to attempt to look up a non-existent source.
     * <br>
     * <br>More specifically: source IDs can be reissued after a source has been
     * <br>destroyed and therefore it is never valid to use this function with a
     * <br>source ID which may have already been removed.  An example is when
     * <br>scheduling an idle to run in another thread with g_idle_add(): the
     * <br>idle may already have run and been removed by the time this function
     * <br>is called on its (now invalid) source ID.  This source ID may have
     * <br>been reissued, leading to the operation being performed against the
     * <br>wrong source.
     * @param source_id the source ID, as returned by g_source_get_id().
     * @return the &#35;GSource
    */
    public Source findSourceById(int source_id)  {
        return new Source(new PointerContainer(JnaMainContext.INST().g_main_context_find_source_by_id(asCPointer(), source_id)));
    }

    /**
     * Finds a source with the given user data for the callback.  If
     * <br>multiple sources exist with the same user data, the first
     * <br>one found will be returned.
     * @param user_data the user_data for the callback.
     * @return the source, if one was found, otherwise %NULL
    */
    public Source findSourceByUserData(@Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new Source(new PointerContainer(JnaMainContext.INST().g_main_context_find_source_by_user_data(asCPointer(), asCPointer(user_data))));
    }

    /**
     * Invokes a function in such a way that &#64;context is owned during the
     * <br>invocation of &#64;function.
     * <br>
     * <br>If &#64;context is %NULL then the global default main context — as
     * <br>returned by g_main_context_default() — is used.
     * <br>
     * <br>If &#64;context is owned by the current thread, &#64;function is called
     * <br>directly.  Otherwise, if &#64;context is the thread-default main context
     * <br>of the current thread and g_main_context_acquire() succeeds, then
     * <br>&#64;function is called and g_main_context_release() is called
     * <br>afterwards.
     * <br>
     * <br>In any other case, an idle source is created to call &#64;function and
     * <br>that source is attached to &#64;context (presumably to be run in another
     * <br>thread).  The idle source is attached with %G_PRIORITY_DEFAULT
     * <br>priority.  If you want a different priority, use
     * <br>g_main_context_invoke_full().
     * <br>
     * <br>Note that, as with normal idle functions, &#64;function should probably
     * <br>return %FALSE.  If it returns %TRUE, it will be continuously run in a
     * <br>loop (and may prevent this call from returning).
     * @param function function to call
     * @param data data to pass to &#64;function
    */
    public void invoke(OnSourceFunc function, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaMainContext.INST().g_main_context_invoke(asCPointer(), toOnSourceFunc(this, "invoke", function), asCPointer(data));
    }

    /**
     * Invokes a function in such a way that &#64;context is owned during the
     * <br>invocation of &#64;function.
     * <br>
     * <br>This function is the same as g_main_context_invoke() except that it
     * <br>lets you specify the priority in case &#64;function ends up being
     * <br>scheduled as an idle and also lets you give a &#35;GDestroyNotify for &#64;data.
     * <br>
     * <br>&#64;notify should not assume that it is called from any particular
     * <br>thread or with any particular context acquired.
     * @param priority the priority at which to run &#64;function
     * @param function function to call
     * @param data data to pass to &#64;function
     * @param notify a function to call when &#64;data is no longer in use, or %NULL.
    */
    public void invokeFull(int priority, OnSourceFunc function, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify notify)  {
        JnaMainContext.INST().g_main_context_invoke_full(asCPointer(), priority, toOnSourceFunc(this, "invokeFull", function), asCPointer(data), toOnDestroyNotify(this, "invokeFull", notify));
    }

    /**
     * Determines whether this thread holds the (recursive)
     * <br>ownership of this &#35;GMainContext. This is useful to
     * <br>know before waiting on another thread that may be
     * <br>blocking to get ownership of &#64;context.
     * @return %TRUE if current thread is owner of &#64;context.
    */
    public boolean isOwner()  {
        return JnaMainContext.INST().g_main_context_is_owner(asCPointer());
    }

    /**
     * Runs a single iteration for the given main loop. This involves
     * <br>checking to see if any event sources are ready to be processed,
     * <br>then if no events sources are ready and &#64;may_block is %TRUE, waiting
     * <br>for a source to become ready, then dispatching the highest priority
     * <br>events sources that are ready. Otherwise, if &#64;may_block is %FALSE
     * <br>sources are not waited to become ready, only those highest priority
     * <br>events sources will be dispatched (if any), that are ready at this
     * <br>given moment without further waiting.
     * <br>
     * <br>Note that even when &#64;may_block is %TRUE, it is still possible for
     * <br>g_main_context_iteration() to return %FALSE, since the wait may
     * <br>be interrupted for other reasons than an event source becoming ready.
     * @param may_block whether the call may block.
     * @return %TRUE if events were dispatched.
    */
    public boolean iteration(boolean may_block)  {
        return JnaMainContext.INST().g_main_context_iteration(asCPointer(), may_block);
    }

    /**
     * Checks if any sources have pending events for the given context.
     * @return %TRUE if events are pending.
    */
    public boolean pending()  {
        return JnaMainContext.INST().g_main_context_pending(asCPointer());
    }

    /**
     * Pops &#64;context off the thread-default context stack (verifying that
     * <br>it was on the top of the stack).
    */
    public void popThreadDefault()  {
        JnaMainContext.INST().g_main_context_pop_thread_default(asCPointer());
    }

    /**
     * Prepares to poll sources within a main loop. The resulting information
     * <br>for polling is determined by calling g_main_context_query ().
     * <br>
     * <br>You must have successfully acquired the context with
     * <br>g_main_context_acquire() before you may call this function.
     * @param priority location to store priority of highest priority            source already ready.
     * @return %TRUE if some source is ready to be dispatched               prior to polling.
    */
    public boolean prepare(@Nullable ch.bailu.gtk.type.Int priority)  {
        return JnaMainContext.INST().g_main_context_prepare(asCPointer(), asCPointer(priority));
    }

    /**
     * Acquires &#64;context and sets it as the thread-default context for the
     * <br>current thread. This will cause certain asynchronous operations
     * <br>(such as most [gio][gio]-based I/O) which are
     * <br>started in this thread to run under &#64;context and deliver their
     * <br>results to its main loop, rather than running under the global
     * <br>default context in the main thread. Note that calling this function
     * <br>changes the context returned by g_main_context_get_thread_default(),
     * <br>not the one returned by g_main_context_default(), so it does not affect
     * <br>the context used by functions like g_idle_add().
     * <br>
     * <br>Normally you would call this function shortly after creating a new
     * <br>thread, passing it a &#35;GMainContext which will be run by a
     * <br>&#35;GMainLoop in that thread, to set a new default context for all
     * <br>async operations in that thread. In this case you may not need to
     * <br>ever call g_main_context_pop_thread_default(), assuming you want the
     * <br>new &#35;GMainContext to be the default for the whole lifecycle of the
     * <br>thread.
     * <br>
     * <br>If you don't have control over how the new thread was created (e.g.
     * <br>in the new thread isn't newly created, or if the thread life
     * <br>cycle is managed by a &#35;GThreadPool), it is always suggested to wrap
     * <br>the logic that needs to use the new &#35;GMainContext inside a
     * <br>g_main_context_push_thread_default() / g_main_context_pop_thread_default()
     * <br>pair, otherwise threads that are re-used will end up never explicitly
     * <br>releasing the &#35;GMainContext reference they hold.
     * <br>
     * <br>In some cases you may want to schedule a single operation in a
     * <br>non-default context, or temporarily use a non-default context in
     * <br>the main thread. In that case, you can wrap the call to the
     * <br>asynchronous operation inside a
     * <br>g_main_context_push_thread_default() /
     * <br>g_main_context_pop_thread_default() pair, but it is up to you to
     * <br>ensure that no other asynchronous operations accidentally get
     * <br>started while the non-default context is active.
     * <br>
     * <br>Beware that libraries that predate this function may not correctly
     * <br>handle being used from a thread with a thread-default context. Eg,
     * <br>see g_file_supports_thread_contexts().
    */
    public void pushThreadDefault()  {
        JnaMainContext.INST().g_main_context_push_thread_default(asCPointer());
    }

    /**
     * Increases the reference count on a &#35;GMainContext object by one.
     * @return the &#64;context that was passed in (since 2.6)
    */
    public MainContext ref()  {
        return new MainContext(new PointerContainer(JnaMainContext.INST().g_main_context_ref(asCPointer())));
    }

    /**
     * Releases ownership of a context previously acquired by this thread
     * <br>with g_main_context_acquire(). If the context was acquired multiple
     * <br>times, the ownership will be released only when g_main_context_release()
     * <br>is called as many times as it was acquired.
    */
    public void release()  {
        JnaMainContext.INST().g_main_context_release(asCPointer());
    }

    /**
     * Removes file descriptor from the set of file descriptors to be
     * <br>polled for a particular context.
     * @param fd a &#35;GPollFD descriptor previously added with g_main_context_add_poll()
    */
    public void removePoll(@Nonnull PollFD fd)  {
        JnaMainContext.INST().g_main_context_remove_poll(asCPointer(), asCPointerNotNull(fd));
    }

    /**
     * Sets the function to use to handle polling of file descriptors. It
     * <br>will be used instead of the poll() system call
     * <br>(or GLib's replacement function, which is used where
     * <br>poll() isn't available).
     * <br>
     * <br>This function could possibly be used to integrate the GLib event
     * <br>loop with an external event loop.
     * @param func the function to call to poll all file descriptors
    */
    public void setPollFunc(OnPollFunc func)  {
        JnaMainContext.INST().g_main_context_set_poll_func(asCPointer(), toOnPollFunc(this, "setPollFunc", func));
    }

    /**
     * Decreases the reference count on a &#35;GMainContext object by one. If
     * <br>the result is zero, free the context and free all associated memory.
    */
    public void unref()  {
        JnaMainContext.INST().g_main_context_unref(asCPointer());
    }

    /**
     * If &#64;context is currently blocking in g_main_context_iteration()
     * <br>waiting for a source to become ready, cause it to stop blocking
     * <br>and return.  Otherwise, cause the next invocation of
     * <br>g_main_context_iteration() to return without blocking.
     * <br>
     * <br>This API is useful for low-level control over &#35;GMainContext; for
     * <br>example, integrating it with main loop implementations such as
     * <br>&#35;GMainLoop.
     * <br>
     * <br>Another related use for this function is when implementing a main
     * <br>loop with a termination condition, computed from multiple threads:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   &#35;define NUM_TASKS 10
     *   static gint tasks_remaining = NUM_TASKS;  // (atomic)
     *   ...
     *  
     *   while (g_atomic_int_get (&amp;tasks_remaining) != 0)
     *     g_main_context_iteration (NULL, TRUE);
     * </pre>
     * <br> 
     * <br>Then in a thread:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   perform_work();
     * 
     *   if (g_atomic_int_dec_and_test (&amp;tasks_remaining))
     *     g_main_context_wakeup (NULL);
     * </pre>
    */
    public void wakeup()  {
        JnaMainContext.INST().g_main_context_wakeup(asCPointer());
    }

    /**
     * Returns the global default main context. This is the main context
     * <br>used for main loop functions when a main loop is not explicitly
     * <br>specified, and corresponds to the &quot;main&quot; main loop. See also
     * <br>g_main_context_get_thread_default().
     * @return the global default main context.
    */
    public static MainContext _default()  {
        return new MainContext(new PointerContainer(JnaMainContext.INST().g_main_context_default()));
    }

    /**
     * Gets the thread-default &#35;GMainContext for this thread. Asynchronous
     * <br>operations that want to be able to be run in contexts other than
     * <br>the default one should call this method or
     * <br>g_main_context_ref_thread_default() to get a &#35;GMainContext to add
     * <br>their &#35;GSources to. (Note that even in single-threaded
     * <br>programs applications may sometimes want to temporarily push a
     * <br>non-default context, so it is not safe to assume that this will
     * <br>always return %NULL if you are running in the default thread.)
     * <br>
     * <br>If you need to hold a reference on the context, use
     * <br>g_main_context_ref_thread_default() instead.
     * @return the thread-default &#35;GMainContext, or %NULL if the thread-default context is the global default context.
    */
    public static MainContext getThreadDefault()  {
        return new MainContext(new PointerContainer(JnaMainContext.INST().g_main_context_get_thread_default()));
    }

    /**
     * Gets the thread-default &#35;GMainContext for this thread, as with
     * <br>g_main_context_get_thread_default(), but also adds a reference to
     * <br>it with g_main_context_ref(). In addition, unlike
     * <br>g_main_context_get_thread_default(), if the thread-default context
     * <br>is the global default context, this will return that &#35;GMainContext
     * <br>(with a ref added to it) rather than returning %NULL.
     * @return the thread-default &#35;GMainContext. Unref     with g_main_context_unref() when you are done with it.
    */
    public static MainContext refThreadDefault()  {
        return new MainContext(new PointerContainer(JnaMainContext.INST().g_main_context_ref_thread_default()));
    }

    public static long getTypeID() { 
        return JnaMainContext.INST().g_main_context_get_type(); 
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
record-type
all-fields-supported

[MethodModel:java-type-not-supported:check:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GPollFD*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:cb-returns-callback:getPollFunc:[ParameterModel:Supported:[MethodModel:Supported:PollFunc:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{Gg:PollFD:{c:GPollFD*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]]

[MethodModel:java-type-not-supported:query:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GPollFD*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:cb-deprecated:wait:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Cond:{c:GCond*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Mutex:{c:GMutex*}}:{j:long}]
*/
