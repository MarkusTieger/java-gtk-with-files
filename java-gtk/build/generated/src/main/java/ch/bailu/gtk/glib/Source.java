/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GSource` struct is an opaque data type
 * <br>representing an event source.
 * <p><a href="https://docs.gtk.org/glib/struct.Source.html">https://docs.gtk.org/glib/struct.Source.html</a></p>
*/
public class Source extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Source.class.getCanonicalName());
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
    
    private static JnaSource.OnSourceFunc toOnSourceFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnSourceFunc in) {
        JnaSource.OnSourceFunc out = null;
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
    
    private static JnaSource.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaSource.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSourceDisposeFunc {
        /**
         * Dispose function for &#64;source. See g_source_set_dispose_function() for
         * <br>details.
         * @param source &#35;GSource that is currently being disposed
        */
        void onSourceDisposeFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Source source);
    }
    
    private static JnaSource.OnSourceDisposeFunc toOnSourceDisposeFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnSourceDisposeFunc in) {
        JnaSource.OnSourceDisposeFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source) -> in.onSourceDisposeFunc(__callback, new Source(new PointerContainer(_source)));
            __callback.register(out);
        }
        return out;
    }

    public Source(PointerContainer pointer) {
        super(pointer);
    }

    public Source() {
        super(cast(JnaSource.allocateStructure()));
    }

    private JnaSource.Fields _fields;
    
    JnaSource.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSource.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String CALLBACK_DATA = "callback_data";

    /**
     * 
    */
    public ch.bailu.gtk.type.Pointer getFieldCallbackData() {
       toFields().readField(CALLBACK_DATA);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().callback_data));
    } 

    /**
     * 
    */
    public static final String CALLBACK_FUNCS = "callback_funcs";

    /**
     * 
    */
    public SourceCallbackFuncs getFieldCallbackFuncs() {
       toFields().readField(CALLBACK_FUNCS);
       return new SourceCallbackFuncs(new PointerContainer(toFields().callback_funcs));
    } 

    /**
     * 
    */
    public static final String SOURCE_FUNCS = "source_funcs";

    /**
     * 
    */
    public SourceFuncs getFieldSourceFuncs() {
       toFields().readField(SOURCE_FUNCS);
       return new SourceFuncs(new PointerContainer(toFields().source_funcs));
    } 

    /**
     * 
    */
    public static final String REF_COUNT = "ref_count";

    /**
     * 
    */
    public int getFieldRefCount() {
       toFields().readField(REF_COUNT);
       return toFields().ref_count;
    } 

    /**
     * 
    */
    public static final String CONTEXT = "context";

    /**
     * 
    */
    public MainContext getFieldContext() {
       toFields().readField(CONTEXT);
       return new MainContext(new PointerContainer(toFields().context));
    } 

    /**
     * 
    */
    public static final String PRIORITY = "priority";

    /**
     * 
    */
    public int getFieldPriority() {
       toFields().readField(PRIORITY);
       return toFields().priority;
    } 

    /**
     * 
    */
    public static final String FLAGS = "flags";

    /**
     * 
    */
    public int getFieldFlags() {
       toFields().readField(FLAGS);
       return toFields().flags;
    } 

    /**
     * 
    */
    public static final String SOURCE_ID = "source_id";

    /**
     * 
    */
    public int getFieldSourceId() {
       toFields().readField(SOURCE_ID);
       return toFields().source_id;
    } 

    /**
     * 
    */
    public static final String POLL_FDS = "poll_fds";

    /**
     * 
    */
    public SList getFieldPollFds() {
       toFields().readField(POLL_FDS);
       return new SList(new PointerContainer(toFields().poll_fds));
    } 

    /**
     * 
    */
    public static final String PREV = "prev";

    /**
     * 
    */
    public Source getFieldPrev() {
       toFields().readField(PREV);
       return new Source(new PointerContainer(toFields().prev));
    } 

    /**
     * 
    */
    public static final String NEXT = "next";

    /**
     * 
    */
    public Source getFieldNext() {
       toFields().readField(NEXT);
       return new Source(new PointerContainer(toFields().next));
    } 

    /**
     * 
    */
    public static final String NAME = "name";

    /**
     * 
    */
    public ch.bailu.gtk.type.Str getFieldName() {
       toFields().readField(NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().name));
    } 

    /**
     * 
    */
    public static final String PRIV = "priv";

    /**
     * 
    */
    public SourcePrivate getFieldPriv() {
       toFields().readField(PRIV);
       return new SourcePrivate(new PointerContainer(toFields().priv));
    } 

    /**
     * Creates a new &#35;GSource structure. The size is specified to
     * <br>allow creating structures derived from &#35;GSource that contain
     * <br>additional data. The size passed in must be at least
     * <br>`sizeof (GSource)`.
     * <br>
     * <br>The source will not initially be associated with any &#35;GMainContext
     * <br>and must be added to one with g_source_attach() before it will be
     * <br>executed.
     * @param source_funcs structure containing functions that implement                the sources behavior.
     * @param struct_size size of the &#35;GSource structure to create.
    */
    public Source(@Nonnull SourceFuncs source_funcs, int struct_size) {
        super(cast(JnaSource.INST().g_source_new(asCPointerNotNull(source_funcs), struct_size)));
    }

    /**
     * Adds &#64;child_source to &#64;source as a &quot;polled&quot; source; when &#64;source is
     * <br>added to a &#35;GMainContext, &#64;child_source will be automatically added
     * <br>with the same priority, when &#64;child_source is triggered, it will
     * <br>cause &#64;source to dispatch (in addition to calling its own
     * <br>callback), and when &#64;source is destroyed, it will destroy
     * <br>&#64;child_source as well. (&#64;source will also still be dispatched if
     * <br>its own prepare/check functions indicate that it is ready.)
     * <br>
     * <br>If you don't need &#64;child_source to do anything on its own when it
     * <br>triggers, you can call g_source_set_dummy_callback() on it to set a
     * <br>callback that does nothing (except return %TRUE if appropriate).
     * <br>
     * <br>&#64;source will hold a reference on &#64;child_source while &#64;child_source
     * <br>is attached to it.
     * <br>
     * <br>This API is only intended to be used by implementations of &#35;GSource.
     * <br>Do not call this API on a &#35;GSource that you did not create.
     * @param child_source a second &#35;GSource that &#64;source should &quot;poll&quot;
    */
    public void addChildSource(@Nonnull Source child_source)  {
        JnaSource.INST().g_source_add_child_source(asCPointer(), asCPointerNotNull(child_source));
    }

    /**
     * Adds a file descriptor to the set of file descriptors polled for
     * <br>this source. This is usually combined with g_source_new() to add an
     * <br>event source. The event source's check function will typically test
     * <br>the &#64;revents field in the &#35;GPollFD struct and return %TRUE if events need
     * <br>to be processed.
     * <br>
     * <br>This API is only intended to be used by implementations of &#35;GSource.
     * <br>Do not call this API on a &#35;GSource that you did not create.
     * <br>
     * <br>Using this API forces the linear scanning of event sources on each
     * <br>main loop iteration.  Newly-written event sources should try to use
     * <br>g_source_add_unix_fd() instead of this API.
     * @param fd a &#35;GPollFD structure holding information about a file      descriptor to watch.
    */
    public void addPoll(@Nonnull PollFD fd)  {
        JnaSource.INST().g_source_add_poll(asCPointer(), asCPointerNotNull(fd));
    }

    /**
     * Monitors &#64;fd for the IO events in &#64;events.
     * <br>
     * <br>The tag returned by this function can be used to remove or modify the
     * <br>monitoring of the fd using g_source_remove_unix_fd() or
     * <br>g_source_modify_unix_fd().
     * <br>
     * <br>It is not necessary to remove the fd before destroying the source; it
     * <br>will be cleaned up automatically.
     * <br>
     * <br>This API is only intended to be used by implementations of &#35;GSource.
     * <br>Do not call this API on a &#35;GSource that you did not create.
     * <br>
     * <br>As the name suggests, this function is not available on Windows.
     * @param fd the fd to monitor
     * @param events an event mask
     * @return an opaque tag
    */
    public ch.bailu.gtk.type.Pointer addUnixFd(int fd, int events)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaSource.INST().g_source_add_unix_fd(asCPointer(), fd, events)));
    }

    /**
     * Adds a &#35;GSource to a &#64;context so that it will be executed within
     * <br>that context. Remove it by calling g_source_destroy().
     * <br>
     * <br>This function is safe to call from any thread, regardless of which thread
     * <br>the &#64;context is running in.
     * @param context a &#35;GMainContext (if %NULL, the default context will be used)
     * @return the ID (greater than 0) for the source within the   &#35;GMainContext.
    */
    public int attach(@Nullable MainContext context)  {
        return JnaSource.INST().g_source_attach(asCPointer(), asCPointer(context));
    }

    /**
     * Removes a source from its &#35;GMainContext, if any, and mark it as
     * <br>destroyed.  The source cannot be subsequently added to another
     * <br>context. It is safe to call this on sources which have already been
     * <br>removed from their context.
     * <br>
     * <br>This does not unref the &#35;GSource: if you still hold a reference, use
     * <br>g_source_unref() to drop it.
     * <br>
     * <br>This function is safe to call from any thread, regardless of which thread
     * <br>the &#35;GMainContext is running in.
     * <br>
     * <br>If the source is currently attached to a &#35;GMainContext, destroying it
     * <br>will effectively unset the callback similar to calling g_source_set_callback().
     * <br>This can mean, that the data's &#35;GDestroyNotify gets called right away.
    */
    public void destroy()  {
        JnaSource.INST().g_source_destroy(asCPointer());
    }

    /**
     * Checks whether a source is allowed to be called recursively.
     * <br>see g_source_set_can_recurse().
     * @return whether recursion is allowed.
    */
    public boolean getCanRecurse()  {
        return JnaSource.INST().g_source_get_can_recurse(asCPointer());
    }

    /**
     * Gets the &#35;GMainContext with which the source is associated.
     * <br>
     * <br>You can call this on a source that has been destroyed, provided
     * <br>that the &#35;GMainContext it was attached to still exists (in which
     * <br>case it will return that &#35;GMainContext). In particular, you can
     * <br>always call this function on the source returned from
     * <br>g_main_current_source(). But calling this function on a source
     * <br>whose &#35;GMainContext has been destroyed is an error.
     * @return the &#35;GMainContext with which the               source is associated, or %NULL if the context has not               yet been added to a source.
    */
    public MainContext getContext()  {
        return new MainContext(new PointerContainer(JnaSource.INST().g_source_get_context(asCPointer())));
    }

    /**
     * Returns the numeric ID for a particular source. The ID of a source
     * <br>is a positive integer which is unique within a particular main loop
     * <br>context. The reverse
     * <br>mapping from ID to source is done by g_main_context_find_source_by_id().
     * <br>
     * <br>You can only call this function while the source is associated to a
     * <br>&#35;GMainContext instance; calling this function before g_source_attach()
     * <br>or after g_source_destroy() yields undefined behavior. The ID returned
     * <br>is unique within the &#35;GMainContext instance passed to g_source_attach().
     * @return the ID (greater than 0) for the source
    */
    public int getId()  {
        return JnaSource.INST().g_source_get_id(asCPointer());
    }

    /**
     * Gets a name for the source, used in debugging and profiling.  The
     * <br>name may be &#35;NULL if it has never been set with g_source_set_name().
     * @return the name of the source
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSource.INST().g_source_get_name(asCPointer())));
    }

    /**
     * Gets the priority of a source.
     * @return the priority of the source
    */
    public int getPriority()  {
        return JnaSource.INST().g_source_get_priority(asCPointer());
    }

    /**
     * Gets the &quot;ready time&quot; of &#64;source, as set by
     * <br>g_source_set_ready_time().
     * <br>
     * <br>Any time before the current monotonic time (including 0) is an
     * <br>indication that the source will fire immediately.
     * @return the monotonic ready time, -1 for &quot;never&quot;
    */
    public long getReadyTime()  {
        return JnaSource.INST().g_source_get_ready_time(asCPointer());
    }

    /**
     * Gets the time to be used when checking this source. The advantage of
     * <br>calling this function over calling g_get_monotonic_time() directly is
     * <br>that when checking multiple sources, GLib can cache a single value
     * <br>instead of having to repeatedly get the system monotonic time.
     * <br>
     * <br>The time here is the system monotonic time, if available, or some
     * <br>other reasonable alternative otherwise.  See g_get_monotonic_time().
     * @return the monotonic time in microseconds
    */
    public long getTime()  {
        return JnaSource.INST().g_source_get_time(asCPointer());
    }

    /**
     * Returns whether &#64;source has been destroyed.
     * <br>
     * <br>This is important when you operate upon your objects
     * <br>from within idle handlers, but may have freed the object
     * <br>before the dispatch of your idle handler.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * static gboolean
     * idle_callback (gpointer data)
     * {
     *   SomeWidget *self = data;
     *    
     *   g_mutex_lock (&amp;self-&gt;idle_id_mutex);
     *   // do stuff with self
     *   self-&gt;idle_id = 0;
     *   g_mutex_unlock (&amp;self-&gt;idle_id_mutex);
     *    
     *   return G_SOURCE_REMOVE;
     * }
     *  
     * static void
     * some_widget_do_stuff_later (SomeWidget *self)
     * {
     *   g_mutex_lock (&amp;self-&gt;idle_id_mutex);
     *   self-&gt;idle_id = g_idle_add (idle_callback, self);
     *   g_mutex_unlock (&amp;self-&gt;idle_id_mutex);
     * }
     *  
     * static void
     * some_widget_init (SomeWidget *self)
     * {
     *   g_mutex_init (&amp;self-&gt;idle_id_mutex);
     * 
     *   // ...
     * }
     * 
     * static void
     * some_widget_finalize (GObject *object)
     * {
     *   SomeWidget *self = SOME_WIDGET (object);
     *    
     *   if (self-&gt;idle_id)
     *     g_source_remove (self-&gt;idle_id);
     *    
     *   g_mutex_clear (&amp;self-&gt;idle_id_mutex);
     * 
     *   G_OBJECT_CLASS (parent_class)-&gt;finalize (object);
     * }
     * </pre>
     * <br>
     * <br>This will fail in a multi-threaded application if the
     * <br>widget is destroyed before the idle handler fires due
     * <br>to the use after free in the callback. A solution, to
     * <br>this particular problem, is to check to if the source
     * <br>has already been destroy within the callback.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * static gboolean
     * idle_callback (gpointer data)
     * {
     *   SomeWidget *self = data;
     *   
     *   g_mutex_lock (&amp;self-&gt;idle_id_mutex);
     *   if (!g_source_is_destroyed (g_main_current_source ()))
     *     {
     *       // do stuff with self
     *     }
     *   g_mutex_unlock (&amp;self-&gt;idle_id_mutex);
     *   
     *   return FALSE;
     * }
     * </pre>
     * <br>
     * <br>Calls to this function from a thread other than the one acquired by the
     * <br>&#35;GMainContext the &#35;GSource is attached to are typically redundant, as the
     * <br>source could be destroyed immediately after this function returns. However,
     * <br>once a source is destroyed it cannot be un-destroyed, so this function can be
     * <br>used for opportunistic checks from any thread.
     * @return %TRUE if the source has been destroyed
    */
    public boolean isDestroyed()  {
        return JnaSource.INST().g_source_is_destroyed(asCPointer());
    }

    /**
     * Updates the event mask to watch for the fd identified by &#64;tag.
     * <br>
     * <br>&#64;tag is the tag returned from g_source_add_unix_fd().
     * <br>
     * <br>If you want to remove a fd, don't set its event mask to zero.
     * <br>Instead, call g_source_remove_unix_fd().
     * <br>
     * <br>This API is only intended to be used by implementations of &#35;GSource.
     * <br>Do not call this API on a &#35;GSource that you did not create.
     * <br>
     * <br>As the name suggests, this function is not available on Windows.
     * @param tag the tag from g_source_add_unix_fd()
     * @param new_events the new event mask to watch
    */
    public void modifyUnixFd(@Nonnull ch.bailu.gtk.type.Pointer tag, int new_events)  {
        JnaSource.INST().g_source_modify_unix_fd(asCPointer(), asCPointerNotNull(tag), new_events);
    }

    /**
     * Queries the events reported for the fd corresponding to &#64;tag on
     * <br>&#64;source during the last poll.
     * <br>
     * <br>The return value of this function is only defined when the function
     * <br>is called from the check or dispatch functions for &#64;source.
     * <br>
     * <br>This API is only intended to be used by implementations of &#35;GSource.
     * <br>Do not call this API on a &#35;GSource that you did not create.
     * <br>
     * <br>As the name suggests, this function is not available on Windows.
     * @param tag the tag from g_source_add_unix_fd()
     * @return the conditions reported on the fd
    */
    public int queryUnixFd(@Nonnull ch.bailu.gtk.type.Pointer tag)  {
        return JnaSource.INST().g_source_query_unix_fd(asCPointer(), asCPointerNotNull(tag));
    }

    /**
     * Increases the reference count on a source by one.
     * @return &#64;source
    */
    public Source ref()  {
        return new Source(new PointerContainer(JnaSource.INST().g_source_ref(asCPointer())));
    }

    /**
     * Detaches &#64;child_source from &#64;source and destroys it.
     * <br>
     * <br>This API is only intended to be used by implementations of &#35;GSource.
     * <br>Do not call this API on a &#35;GSource that you did not create.
     * @param child_source a &#35;GSource previously passed to     g_source_add_child_source().
    */
    public void removeChildSource(@Nonnull Source child_source)  {
        JnaSource.INST().g_source_remove_child_source(asCPointer(), asCPointerNotNull(child_source));
    }

    /**
     * Removes a file descriptor from the set of file descriptors polled for
     * <br>this source.
     * <br>
     * <br>This API is only intended to be used by implementations of &#35;GSource.
     * <br>Do not call this API on a &#35;GSource that you did not create.
     * @param fd a &#35;GPollFD structure previously passed to g_source_add_poll().
    */
    public void removePoll(@Nonnull PollFD fd)  {
        JnaSource.INST().g_source_remove_poll(asCPointer(), asCPointerNotNull(fd));
    }

    /**
     * Reverses the effect of a previous call to g_source_add_unix_fd().
     * <br>
     * <br>You only need to call this if you want to remove an fd from being
     * <br>watched while keeping the same source around.  In the normal case you
     * <br>will just want to destroy the source.
     * <br>
     * <br>This API is only intended to be used by implementations of &#35;GSource.
     * <br>Do not call this API on a &#35;GSource that you did not create.
     * <br>
     * <br>As the name suggests, this function is not available on Windows.
     * @param tag the tag from g_source_add_unix_fd()
    */
    public void removeUnixFd(@Nonnull ch.bailu.gtk.type.Pointer tag)  {
        JnaSource.INST().g_source_remove_unix_fd(asCPointer(), asCPointerNotNull(tag));
    }

    /**
     * Sets the callback function for a source. The callback for a source is
     * <br>called from the source's dispatch function.
     * <br>
     * <br>The exact type of &#64;func depends on the type of source; ie. you
     * <br>should not count on &#64;func being called with &#64;data as its first
     * <br>parameter. Cast &#64;func with G_SOURCE_FUNC() to avoid warnings about
     * <br>incompatible function types.
     * <br>
     * <br>See [memory management of sources][mainloop-memory-management] for details
     * <br>on how to handle memory management of &#64;data.
     * <br>
     * <br>Typically, you won't use this function. Instead use functions specific
     * <br>to the type of source you are using, such as g_idle_add() or g_timeout_add().
     * <br>
     * <br>It is safe to call this function multiple times on a source which has already
     * <br>been attached to a context. The changes will take effect for the next time
     * <br>the source is dispatched after this call returns.
     * <br>
     * <br>Note that g_source_destroy() for a currently attached source has the effect
     * <br>of also unsetting the callback.
     * @param func a callback function
     * @param data the data to pass to callback function
     * @param notify a function to call when &#64;data is no longer in use, or %NULL.
    */
    public void setCallback(OnSourceFunc func, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify notify)  {
        JnaSource.INST().g_source_set_callback(asCPointer(), toOnSourceFunc(this, "setCallback", func), asCPointer(data), toOnDestroyNotify(this, "setCallback", notify));
    }

    /**
     * Sets the callback function storing the data as a refcounted callback
     * <br>&quot;object&quot;. This is used internally. Note that calling
     * <br>g_source_set_callback_indirect() assumes
     * <br>an initial reference count on &#64;callback_data, and thus
     * <br>&#64;callback_funcs-&gt;unref will eventually be called once more
     * <br>than &#64;callback_funcs-&gt;ref.
     * <br>
     * <br>It is safe to call this function multiple times on a source which has already
     * <br>been attached to a context. The changes will take effect for the next time
     * <br>the source is dispatched after this call returns.
     * @param callback_data pointer to callback data &quot;object&quot;
     * @param callback_funcs functions for reference counting &#64;callback_data                  and getting the callback and data
    */
    public void setCallbackIndirect(@Nullable ch.bailu.gtk.type.Pointer callback_data, @Nonnull SourceCallbackFuncs callback_funcs)  {
        JnaSource.INST().g_source_set_callback_indirect(asCPointer(), asCPointer(callback_data), asCPointerNotNull(callback_funcs));
    }

    /**
     * Sets whether a source can be called recursively. If &#64;can_recurse is
     * <br>%TRUE, then while the source is being dispatched then this source
     * <br>will be processed normally. Otherwise, all processing of this
     * <br>source is blocked until the dispatch function returns.
     * @param can_recurse whether recursion is allowed for this source
    */
    public void setCanRecurse(boolean can_recurse)  {
        JnaSource.INST().g_source_set_can_recurse(asCPointer(), can_recurse);
    }

    /**
     * Set &#64;dispose as dispose function on &#64;source. &#64;dispose will be called once
     * <br>the reference count of &#64;source reaches 0 but before any of the state of the
     * <br>source is freed, especially before the finalize function is called.
     * <br>
     * <br>This means that at this point &#64;source is still a valid &#35;GSource and it is
     * <br>allow for the reference count to increase again until &#64;dispose returns.
     * <br>
     * <br>The dispose function can be used to clear any &quot;weak&quot; references to the
     * <br>&#64;source in other data structures in a thread-safe way where it is possible
     * <br>for another thread to increase the reference count of &#64;source again while
     * <br>it is being freed.
     * <br>
     * <br>The finalize function can not be used for this purpose as at that point
     * <br>&#64;source is already partially freed and not valid anymore.
     * <br>
     * <br>This should only ever be called from &#35;GSource implementations.
     * @param dispose &#35;GSourceDisposeFunc to set on the source
    */
    public void setDisposeFunction(OnSourceDisposeFunc dispose)  {
        JnaSource.INST().g_source_set_dispose_function(asCPointer(), toOnSourceDisposeFunc(this, "setDisposeFunction", dispose));
    }

    /**
     * Sets the source functions (can be used to override
     * <br>default implementations) of an unattached source.
     * @param funcs the new &#35;GSourceFuncs
    */
    public void setFuncs(@Nonnull SourceFuncs funcs)  {
        JnaSource.INST().g_source_set_funcs(asCPointer(), asCPointerNotNull(funcs));
    }

    /**
     * Sets a name for the source, used in debugging and profiling.
     * <br>The name defaults to &#35;NULL.
     * <br>
     * <br>The source name should describe in a human-readable way
     * <br>what the source does. For example, &quot;X11 event queue&quot;
     * <br>or &quot;GTK+ repaint idle handler&quot; or whatever it is.
     * <br>
     * <br>It is permitted to call this function multiple times, but is not
     * <br>recommended due to the potential performance impact.  For example,
     * <br>one could change the name in the &quot;check&quot; function of a &#35;GSourceFuncs
     * <br>to include details like the event type in the source name.
     * <br>
     * <br>Use caution if changing the name while another thread may be
     * <br>accessing it with g_source_get_name(); that function does not copy
     * <br>the value, and changing the value will free it while the other thread
     * <br>may be attempting to use it.
     * <br>
     * <br>Also see g_source_set_static_name().
     * @param name debug name for the source
    */
    public void setName(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaSource.INST().g_source_set_name(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Sets a name for the source, used in debugging and profiling.
     * <br>The name defaults to &#35;NULL.
     * <br>
     * <br>The source name should describe in a human-readable way
     * <br>what the source does. For example, &quot;X11 event queue&quot;
     * <br>or &quot;GTK+ repaint idle handler&quot; or whatever it is.
     * <br>
     * <br>It is permitted to call this function multiple times, but is not
     * <br>recommended due to the potential performance impact.  For example,
     * <br>one could change the name in the &quot;check&quot; function of a &#35;GSourceFuncs
     * <br>to include details like the event type in the source name.
     * <br>
     * <br>Use caution if changing the name while another thread may be
     * <br>accessing it with g_source_get_name(); that function does not copy
     * <br>the value, and changing the value will free it while the other thread
     * <br>may be attempting to use it.
     * <br>
     * <br>Also see g_source_set_static_name().
     * @param name debug name for the source
    */
    public void setName(String name)  {
        JnaSource.INST().g_source_set_name(asCPointer(), name);
    }

    /**
     * Sets the priority of a source. While the main loop is being run, a
     * <br>source will be dispatched if it is ready to be dispatched and no
     * <br>sources at a higher (numerically smaller) priority are ready to be
     * <br>dispatched.
     * <br>
     * <br>A child source always has the same priority as its parent.  It is not
     * <br>permitted to change the priority of a source once it has been added
     * <br>as a child of another source.
     * @param priority the new priority.
    */
    public void setPriority(int priority)  {
        JnaSource.INST().g_source_set_priority(asCPointer(), priority);
    }

    /**
     * Sets a &#35;GSource to be dispatched when the given monotonic time is
     * <br>reached (or passed).  If the monotonic time is in the past (as it
     * <br>always will be if &#64;ready_time is 0) then the source will be
     * <br>dispatched immediately.
     * <br>
     * <br>If &#64;ready_time is -1 then the source is never woken up on the basis
     * <br>of the passage of time.
     * <br>
     * <br>Dispatching the source does not reset the ready time.  You should do
     * <br>so yourself, from the source dispatch function.
     * <br>
     * <br>Note that if you have a pair of sources where the ready time of one
     * <br>suggests that it will be delivered first but the priority for the
     * <br>other suggests that it would be delivered first, and the ready time
     * <br>for both sources is reached during the same main context iteration,
     * <br>then the order of dispatch is undefined.
     * <br>
     * <br>It is a no-op to call this function on a &#35;GSource which has already been
     * <br>destroyed with g_source_destroy().
     * <br>
     * <br>This API is only intended to be used by implementations of &#35;GSource.
     * <br>Do not call this API on a &#35;GSource that you did not create.
     * @param ready_time the monotonic time at which the source will be ready,              0 for &quot;immediately&quot;, -1 for &quot;never&quot;
    */
    public void setReadyTime(long ready_time)  {
        JnaSource.INST().g_source_set_ready_time(asCPointer(), ready_time);
    }

    /**
     * A variant of g_source_set_name() that does not
     * <br>duplicate the &#64;name, and can only be used with
     * <br>string literals.
     * @param name debug name for the source
    */
    public void setStaticName(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaSource.INST().g_source_set_static_name(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * A variant of g_source_set_name() that does not
     * <br>duplicate the &#64;name, and can only be used with
     * <br>string literals.
     * @param name debug name for the source
    */
    public void setStaticName(String name)  {
        JnaSource.INST().g_source_set_static_name(asCPointer(), name);
    }

    /**
     * Decreases the reference count of a source by one. If the
     * <br>resulting reference count is zero the source and associated
     * <br>memory will be destroyed.
    */
    public void unref()  {
        JnaSource.INST().g_source_unref(asCPointer());
    }

    /**
     * Removes the source with the given ID from the default main context. You must
     * <br>use g_source_destroy() for sources added to a non-default main context.
     * <br>
     * <br>The ID of a &#35;GSource is given by g_source_get_id(), or will be
     * <br>returned by the functions g_source_attach(), g_idle_add(),
     * <br>g_idle_add_full(), g_timeout_add(), g_timeout_add_full(),
     * <br>g_child_watch_add(), g_child_watch_add_full(), g_io_add_watch(), and
     * <br>g_io_add_watch_full().
     * <br>
     * <br>It is a programmer error to attempt to remove a non-existent source.
     * <br>
     * <br>More specifically: source IDs can be reissued after a source has been
     * <br>destroyed and therefore it is never valid to use this function with a
     * <br>source ID which may have already been removed.  An example is when
     * <br>scheduling an idle to run in another thread with g_idle_add(): the
     * <br>idle may already have run and been removed by the time this function
     * <br>is called on its (now invalid) source ID.  This source ID may have
     * <br>been reissued, leading to the operation being performed against the
     * <br>wrong source.
     * @param tag the ID of the source to remove.
     * @return %TRUE if the source was found and removed.
    */
    public static boolean remove(int tag)  {
        return JnaSource.INST().g_source_remove(tag);
    }

    /**
     * Removes a source from the default main loop context given the
     * <br>source functions and user data. If multiple sources exist with the
     * <br>same source functions and user data, only one will be destroyed.
     * @param funcs The &#64;source_funcs passed to g_source_new()
     * @param user_data the user data for the callback
     * @return %TRUE if a source was found and removed.
    */
    public static boolean removeByFuncsUserData(@Nonnull SourceFuncs funcs, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return JnaSource.INST().g_source_remove_by_funcs_user_data(asCPointerNotNull(funcs), asCPointer(user_data));
    }

    /**
     * Removes a source from the default main loop context given the user
     * <br>data for the callback. If multiple sources exist with the same user
     * <br>data, only one will be destroyed.
     * @param user_data the user_data for the callback.
     * @return %TRUE if a source was found and removed.
    */
    public static boolean removeByUserData(@Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return JnaSource.INST().g_source_remove_by_user_data(asCPointer(user_data));
    }

    /**
     * Sets the name of a source using its ID.
     * <br>
     * <br>This is a convenience utility to set source names from the return
     * <br>value of g_idle_add(), g_timeout_add(), etc.
     * <br>
     * <br>It is a programmer error to attempt to set the name of a non-existent
     * <br>source.
     * <br>
     * <br>More specifically: source IDs can be reissued after a source has been
     * <br>destroyed and therefore it is never valid to use this function with a
     * <br>source ID which may have already been removed.  An example is when
     * <br>scheduling an idle to run in another thread with g_idle_add(): the
     * <br>idle may already have run and been removed by the time this function
     * <br>is called on its (now invalid) source ID.  This source ID may have
     * <br>been reissued, leading to the operation being performed against the
     * <br>wrong source.
     * @param tag a &#35;GSource ID
     * @param name debug name for the source
    */
    public static void setNameById(int tag, @Nonnull ch.bailu.gtk.type.Str name)  {
        JnaSource.INST().g_source_set_name_by_id(tag, asCPointerNotNull(name));
    }

    public static long getTypeID() { 
        return JnaSource.INST().g_source_get_type(); 
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

[MethodModel:cb-deprecated:getCurrentTime:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:TimeVal:{c:GTimeVal*}}:{j:long}]
*/
