/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GThreadPool struct represents a thread pool. It has three
 * <br>public read-only members, but the underlying struct is bigger,
 * <br>so you must not copy this struct.
 * <p><a href="https://docs.gtk.org/glib/struct.ThreadPool.html">https://docs.gtk.org/glib/struct.ThreadPool.html</a></p>
*/
public class ThreadPool extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ThreadPool.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCompareDataFunc {
        /**
         * Specifies the type of a comparison function used to compare two
         * <br>values.  The function should return a negative integer if the first
         * <br>value comes before the second, 0 if they are equal, or a positive
         * <br>integer if the first value comes after the second.
         * @param a a value
         * @param b a value to compare with
         * @param user_data user data
         * @return negative value if &#64;a &lt; &#64;b; zero if &#64;a = &#64;b; positive          value if &#64;a &gt; &#64;b
        */
        int onCompareDataFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer a, @Nullable ch.bailu.gtk.type.Pointer b, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaThreadPool.OnCompareDataFunc toOnCompareDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareDataFunc in) {
        JnaThreadPool.OnCompareDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onCompareDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFunc {
        /**
         * Specifies the type of functions passed to g_list_foreach() and
         * <br>g_slist_foreach().
         * @param data the element's data
         * @param user_data user data passed to g_list_foreach() or g_slist_foreach()
        */
        void onFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaThreadPool.OnFunc toOnFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnFunc in) {
        JnaThreadPool.OnFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data, _user_data) -> in.onFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
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
    
    private static JnaThreadPool.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaThreadPool.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public ThreadPool(PointerContainer pointer) {
        super(pointer);
    }

    public ThreadPool() {
        super(cast(JnaThreadPool.allocateStructure()));
    }

    private JnaThreadPool.Fields _fields;
    
    JnaThreadPool.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaThreadPool.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the function to execute in the threads of this pool
     * <br>See {@link OnFunc#onFunc}
    */
    public static final String FUNC = "func";

    /**
     * the function to execute in the threads of this pool
     * <br>See {@link OnFunc#onFunc}
    */
    public void setFieldFunc(OnFunc func) {
        toFields().func = toOnFunc(this, FUNC, func);
        toFields().writeField(FUNC);
    }

    /**
     * the function to execute in the threads of this pool
     * <br>See {@link OnFunc#onFunc}
    */
    public JnaThreadPool.OnFunc getFieldFunc() {
       toFields().readField(FUNC);
       return toFields().func;
    } 

    /**
     * the user data for the threads of this pool
    */
    public static final String USER_DATA = "user_data";

    /**
     * the user data for the threads of this pool
    */
    public void setFieldUserData(ch.bailu.gtk.type.Pointer user_data) {
        toFields().user_data = user_data.asCPointer();
        toFields().writeField(USER_DATA);
    }

    /**
     * the user data for the threads of this pool
    */
    public ch.bailu.gtk.type.Pointer getFieldUserData() {
       toFields().readField(USER_DATA);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().user_data));
    } 

    /**
     * are all threads exclusive to this pool
    */
    public static final String EXCLUSIVE = "exclusive";

    /**
     * are all threads exclusive to this pool
    */
    public void setFieldExclusive(boolean exclusive) {
        toFields().exclusive = exclusive;
        toFields().writeField(EXCLUSIVE);
    }

    /**
     * are all threads exclusive to this pool
    */
    public boolean getFieldExclusive() {
       toFields().readField(EXCLUSIVE);
       return toFields().exclusive;
    } 

    /**
     * Frees all resources allocated for &#64;pool.
     * <br>
     * <br>If &#64;immediate is %TRUE, no new task is processed for &#64;pool.
     * <br>Otherwise &#64;pool is not freed before the last task is processed.
     * <br>Note however, that no thread of this pool is interrupted while
     * <br>processing a task. Instead at least all still running threads
     * <br>can finish their tasks before the &#64;pool is freed.
     * <br>
     * <br>If &#64;wait_ is %TRUE, this function does not return before all
     * <br>tasks to be processed (dependent on &#64;immediate, whether all
     * <br>or only the currently running) are ready.
     * <br>Otherwise this function returns immediately.
     * <br>
     * <br>After calling this function &#64;pool must not be used anymore.
     * @param immediate should &#64;pool shut down immediately?
     * @param wait_ should the function wait for all tasks to be finished?
    */
    public void free(boolean immediate, boolean wait_)  {
        JnaThreadPool.INST().g_thread_pool_free(asCPointer(), immediate, wait_);
    }

    /**
     * Returns the maximal number of threads for &#64;pool.
     * @return the maximal number of threads
    */
    public int getMaxThreads()  {
        return JnaThreadPool.INST().g_thread_pool_get_max_threads(asCPointer());
    }

    /**
     * Returns the number of threads currently running in &#64;pool.
     * @return the number of threads currently running
    */
    public int getNumThreads()  {
        return JnaThreadPool.INST().g_thread_pool_get_num_threads(asCPointer());
    }

    /**
     * Moves the item to the front of the queue of unprocessed
     * <br>items, so that it will be processed next.
     * @param data an unprocessed item in the pool
     * @return %TRUE if the item was found and moved
    */
    public boolean moveToFront(@Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaThreadPool.INST().g_thread_pool_move_to_front(asCPointer(), asCPointer(data));
    }

    /**
     * Inserts &#64;data into the list of tasks to be executed by &#64;pool.
     * <br>
     * <br>When the number of currently running threads is lower than the
     * <br>maximal allowed number of threads, a new thread is started (or
     * <br>reused) with the properties given to g_thread_pool_new().
     * <br>Otherwise, &#64;data stays in the queue until a thread in this pool
     * <br>finishes its previous task and processes &#64;data.
     * <br>
     * <br>&#64;error can be %NULL to ignore errors, or non-%NULL to report
     * <br>errors. An error can only occur when a new thread couldn't be
     * <br>created. In that case &#64;data is simply appended to the queue of
     * <br>work to do.
     * <br>
     * <br>Before version 2.32, this function did not return a success status.
     * @param data a new task for &#64;pool
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean push(@Nullable ch.bailu.gtk.type.Pointer data) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaThreadPool.INST().g_thread_pool_push(asCPointer(), asCPointer(data), 0L);
    }

    /**
     * Sets the maximal allowed number of threads for &#64;pool.
     * <br>A value of -1 means that the maximal number of threads
     * <br>is unlimited. If &#64;pool is an exclusive thread pool, setting
     * <br>the maximal number of threads to -1 is not allowed.
     * <br>
     * <br>Setting &#64;max_threads to 0 means stopping all work for &#64;pool.
     * <br>It is effectively frozen until &#64;max_threads is set to a non-zero
     * <br>value again.
     * <br>
     * <br>A thread is never terminated while calling &#64;func, as supplied by
     * <br>g_thread_pool_new(). Instead the maximal number of threads only
     * <br>has effect for the allocation of new threads in g_thread_pool_push().
     * <br>A new thread is allocated, whenever the number of currently
     * <br>running threads in &#64;pool is smaller than the maximal number.
     * <br>
     * <br>&#64;error can be %NULL to ignore errors, or non-%NULL to report
     * <br>errors. An error can only occur when a new thread couldn't be
     * <br>created.
     * <br>
     * <br>Before version 2.32, this function did not return a success status.
     * @param max_threads a new maximal number of threads for &#64;pool,     or -1 for unlimited
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean setMaxThreads(int max_threads) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaThreadPool.INST().g_thread_pool_set_max_threads(asCPointer(), max_threads, 0L);
    }

    /**
     * Sets the function used to sort the list of tasks. This allows the
     * <br>tasks to be processed by a priority determined by &#64;func, and not
     * <br>just in the order in which they were added to the pool.
     * <br>
     * <br>Note, if the maximum number of threads is more than 1, the order
     * <br>that threads are executed cannot be guaranteed 100%. Threads are
     * <br>scheduled by the operating system and are executed at random. It
     * <br>cannot be assumed that threads are executed in the order they are
     * <br>created.
     * @param func the &#35;GCompareDataFunc used to sort the list of tasks.     This function is passed two tasks. It should return     0 if the order in which they are handled does not matter,     a negative value if the first task should be processed before     the second or a positive value if the second task should be     processed first.
     * @param user_data user data passed to &#64;func
    */
    public void setSortFunction(OnCompareDataFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaThreadPool.INST().g_thread_pool_set_sort_function(asCPointer(), toOnCompareDataFunc(this, "setSortFunction", func), asCPointer(user_data));
    }

    /**
     * Returns the number of tasks still unprocessed in &#64;pool.
     * @return the number of unprocessed tasks
    */
    public int unprocessed()  {
        return JnaThreadPool.INST().g_thread_pool_unprocessed(asCPointer());
    }

    /**
     * This function will return the maximum &#64;interval that a
     * <br>thread will wait in the thread pool for new tasks before
     * <br>being stopped.
     * <br>
     * <br>If this function returns 0, threads waiting in the thread
     * <br>pool for new work are not stopped.
     * @return the maximum &#64;interval (milliseconds) to wait     for new tasks in the thread pool before stopping the     thread
    */
    public static int getMaxIdleTime()  {
        return JnaThreadPool.INST().g_thread_pool_get_max_idle_time();
    }

    /**
     * Returns the maximal allowed number of unused threads.
     * @return the maximal number of unused threads
    */
    public static int getMaxUnusedThreads()  {
        return JnaThreadPool.INST().g_thread_pool_get_max_unused_threads();
    }

    /**
     * Returns the number of currently unused threads.
     * @return the number of currently unused threads
    */
    public static int getNumUnusedThreads()  {
        return JnaThreadPool.INST().g_thread_pool_get_num_unused_threads();
    }

    /**
     * This function creates a new thread pool.
     * <br>
     * <br>Whenever you call g_thread_pool_push(), either a new thread is
     * <br>created or an unused one is reused. At most &#64;max_threads threads
     * <br>are running concurrently for this thread pool. &#64;max_threads = -1
     * <br>allows unlimited threads to be created for this thread pool. The
     * <br>newly created or reused thread now executes the function &#64;func
     * <br>with the two arguments. The first one is the parameter to
     * <br>g_thread_pool_push() and the second one is &#64;user_data.
     * <br>
     * <br>Pass g_get_num_processors() to &#64;max_threads to create as many threads as
     * <br>there are logical processors on the system. This will not pin each thread to
     * <br>a specific processor.
     * <br>
     * <br>The parameter &#64;exclusive determines whether the thread pool owns
     * <br>all threads exclusive or shares them with other thread pools.
     * <br>If &#64;exclusive is %TRUE, &#64;max_threads threads are started
     * <br>immediately and they will run exclusively for this thread pool
     * <br>until it is destroyed by g_thread_pool_free(). If &#64;exclusive is
     * <br>%FALSE, threads are created when needed and shared between all
     * <br>non-exclusive thread pools. This implies that &#64;max_threads may
     * <br>not be -1 for exclusive thread pools. Besides, exclusive thread
     * <br>pools are not affected by g_thread_pool_set_max_idle_time()
     * <br>since their threads are never considered idle and returned to the
     * <br>global pool.
     * <br>
     * <br>&#64;error can be %NULL to ignore errors, or non-%NULL to report
     * <br>errors. An error can only occur when &#64;exclusive is set to %TRUE
     * <br>and not all &#64;max_threads threads could be created.
     * <br>See &#35;GThreadError for possible errors that may occur.
     * <br>Note, even in case of error a valid &#35;GThreadPool is returned.
     * @param func a function to execute in the threads of the new thread pool
     * @param user_data user data that is handed over to &#64;func every time it     is called
     * @param max_threads the maximal number of threads to execute concurrently     in  the new thread pool, -1 means no limit
     * @param exclusive should this thread pool be exclusive?
     * @return the new &#35;GThreadPool
    */
    public static ThreadPool _new(OnFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data, int max_threads, boolean exclusive) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ThreadPool(new PointerContainer(JnaThreadPool.INST().g_thread_pool_new(toOnFunc(getClassHandler().getInstance(), "_new", func), asCPointer(user_data), max_threads, exclusive, 0L)));
    }

    /**
     * This function creates a new thread pool similar to g_thread_pool_new()
     * <br>but allowing &#64;item_free_func to be specified to free the data passed
     * <br>to g_thread_pool_push() in the case that the &#35;GThreadPool is stopped
     * <br>and freed before all tasks have been executed.
     * @param func a function to execute in the threads of the new thread pool
     * @param user_data user data that is handed over to &#64;func every time it     is called
     * @param item_free_func used to pass as a free function to     g_async_queue_new_full()
     * @param max_threads the maximal number of threads to execute concurrently     in the new thread pool, `-1` means no limit
     * @param exclusive should this thread pool be exclusive?
     * @return the new &#35;GThreadPool
    */
    public static ThreadPool newFull(OnFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify item_free_func, int max_threads, boolean exclusive) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ThreadPool(new PointerContainer(JnaThreadPool.INST().g_thread_pool_new_full(toOnFunc(getClassHandler().getInstance(), "newFull", func), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "newFull", item_free_func), max_threads, exclusive, 0L)));
    }

    /**
     * This function will set the maximum &#64;interval that a thread
     * <br>waiting in the pool for new tasks can be idle for before
     * <br>being stopped. This function is similar to calling
     * <br>g_thread_pool_stop_unused_threads() on a regular timeout,
     * <br>except this is done on a per thread basis.
     * <br>
     * <br>By setting &#64;interval to 0, idle threads will not be stopped.
     * <br>
     * <br>The default value is 15000 (15 seconds).
     * @param interval the maximum &#64;interval (in milliseconds)     a thread can be idle
    */
    public static void setMaxIdleTime(int interval)  {
        JnaThreadPool.INST().g_thread_pool_set_max_idle_time(interval);
    }

    /**
     * Sets the maximal number of unused threads to &#64;max_threads.
     * <br>If &#64;max_threads is -1, no limit is imposed on the number
     * <br>of unused threads.
     * <br>
     * <br>The default value is 2.
     * @param max_threads maximal number of unused threads
    */
    public static void setMaxUnusedThreads(int max_threads)  {
        JnaThreadPool.INST().g_thread_pool_set_max_unused_threads(max_threads);
    }

    /**
     * Stops all currently unused threads. This does not change the
     * <br>maximal number of unused threads. This function can be used to
     * <br>regularly stop all unused threads e.g. from g_timeout_add().
    */
    public static void stopUnusedThreads()  {
        JnaThreadPool.INST().g_thread_pool_stop_unused_threads();
    }

}

/*
record-type
all-fields-supported
*/
