/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GThread struct represents a running thread. This struct
 * <br>is returned by g_thread_new() or g_thread_try_new(). You can
 * <br>obtain the &#35;GThread struct representing the current thread by
 * <br>calling g_thread_self().
 * <br>
 * <br>GThread is refcounted, see g_thread_ref() and g_thread_unref().
 * <br>The thread represented by it holds a reference while it is running,
 * <br>and g_thread_join() consumes the reference that it is given, so
 * <br>it is normally not necessary to manage GThread references
 * <br>explicitly.
 * <br>
 * <br>The structure is opaque -- none of its fields may be directly
 * <br>accessed.
 * <p><a href="https://docs.gtk.org/glib/struct.Thread.html">https://docs.gtk.org/glib/struct.Thread.html</a></p>
*/
public class Thread extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Thread.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnThreadFunc {
        /**
         * Specifies the type of the &#64;func functions passed to g_thread_new()
         * <br>or g_thread_try_new().
         * @param user_data data passed to the thread
         * @return the return value of the thread
        */
        ch.bailu.gtk.type.Pointer onThreadFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaThread.OnThreadFunc toOnThreadFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnThreadFunc in) {
        JnaThread.OnThreadFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_user_data) -> in.onThreadFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public Thread(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * This function is the same as g_thread_new() except that
     * <br>it allows for the possibility of failure.
     * <br>
     * <br>If a thread can not be created (due to resource limits),
     * <br>&#64;error is set and %NULL is returned.
     * @param name an (optional) name for the new thread
     * @param func a function to execute in the new thread
     * @param data an argument to supply to the new thread
     * @return the new &#35;GThread, or %NULL if an error occurred
    */
    public static Thread tryNewThread(@Nullable ch.bailu.gtk.type.Str name, OnThreadFunc func, @Nullable ch.bailu.gtk.type.Pointer data) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaThread.INST().g_thread_try_new(asCPointer(name), toOnThreadFunc(getClassHandler().getInstance(), "tryNew", func), asCPointer(data), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Thread:tryNew");
        }
        return new Thread(__self);
    }        
    

    /**
     * This function is the same as g_thread_new() except that
     * <br>it allows for the possibility of failure.
     * <br>
     * <br>If a thread can not be created (due to resource limits),
     * <br>&#64;error is set and %NULL is returned.
     * @param name an (optional) name for the new thread
     * @param func a function to execute in the new thread
     * @param data an argument to supply to the new thread
     * @return the new &#35;GThread, or %NULL if an error occurred
    */
    public static Thread tryNewThread(String name, OnThreadFunc func, @Nullable ch.bailu.gtk.type.Pointer data) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaThread.INST().g_thread_try_new(name, toOnThreadFunc(getClassHandler().getInstance(), "tryNew", func), asCPointer(data), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Thread:tryNew");
        }
        return new Thread(__self);
    }        
    

    /**
     * This function creates a new thread. The new thread starts by invoking
     * <br>&#64;func with the argument data. The thread will run until &#64;func returns
     * <br>or until g_thread_exit() is called from the new thread. The return value
     * <br>of &#64;func becomes the return value of the thread, which can be obtained
     * <br>with g_thread_join().
     * <br>
     * <br>The &#64;name can be useful for discriminating threads in a debugger.
     * <br>It is not used for other purposes and does not have to be unique.
     * <br>Some systems restrict the length of &#64;name to 16 bytes.
     * <br>
     * <br>If the thread can not be created the program aborts. See
     * <br>g_thread_try_new() if you want to attempt to deal with failures.
     * <br>
     * <br>If you are using threads to offload (potentially many) short-lived tasks,
     * <br>&#35;GThreadPool may be more appropriate than manually spawning and tracking
     * <br>multiple &#35;GThreads.
     * <br>
     * <br>To free the struct returned by this function, use g_thread_unref().
     * <br>Note that g_thread_join() implicitly unrefs the &#35;GThread as well.
     * <br>
     * <br>New threads by default inherit their scheduler policy (POSIX) or thread
     * <br>priority (Windows) of the thread creating the new thread.
     * <br>
     * <br>This behaviour changed in GLib 2.64: before threads on Windows were not
     * <br>inheriting the thread priority but were spawned with the default priority.
     * <br>Starting with GLib 2.64 the behaviour is now consistent between Windows and
     * <br>POSIX and all threads inherit their parent thread's priority.
     * @param name an (optional) name for the new thread
     * @param func a function to execute in the new thread
     * @param data an argument to supply to the new thread
    */
    public Thread(@Nullable ch.bailu.gtk.type.Str name, OnThreadFunc func, @Nullable ch.bailu.gtk.type.Pointer data) {
        super(cast(JnaThread.INST().g_thread_new(asCPointer(name), toOnThreadFunc(getClassHandler().getInstance(), "_new", func), asCPointer(data))));
    }

    /**
     * This function creates a new thread. The new thread starts by invoking
     * <br>&#64;func with the argument data. The thread will run until &#64;func returns
     * <br>or until g_thread_exit() is called from the new thread. The return value
     * <br>of &#64;func becomes the return value of the thread, which can be obtained
     * <br>with g_thread_join().
     * <br>
     * <br>The &#64;name can be useful for discriminating threads in a debugger.
     * <br>It is not used for other purposes and does not have to be unique.
     * <br>Some systems restrict the length of &#64;name to 16 bytes.
     * <br>
     * <br>If the thread can not be created the program aborts. See
     * <br>g_thread_try_new() if you want to attempt to deal with failures.
     * <br>
     * <br>If you are using threads to offload (potentially many) short-lived tasks,
     * <br>&#35;GThreadPool may be more appropriate than manually spawning and tracking
     * <br>multiple &#35;GThreads.
     * <br>
     * <br>To free the struct returned by this function, use g_thread_unref().
     * <br>Note that g_thread_join() implicitly unrefs the &#35;GThread as well.
     * <br>
     * <br>New threads by default inherit their scheduler policy (POSIX) or thread
     * <br>priority (Windows) of the thread creating the new thread.
     * <br>
     * <br>This behaviour changed in GLib 2.64: before threads on Windows were not
     * <br>inheriting the thread priority but were spawned with the default priority.
     * <br>Starting with GLib 2.64 the behaviour is now consistent between Windows and
     * <br>POSIX and all threads inherit their parent thread's priority.
     * @param name an (optional) name for the new thread
     * @param func a function to execute in the new thread
     * @param data an argument to supply to the new thread
    */
    public Thread(String name, OnThreadFunc func, @Nullable ch.bailu.gtk.type.Pointer data) {
        super(cast(JnaThread.INST().g_thread_new(name, toOnThreadFunc(getClassHandler().getInstance(), "_new", func), asCPointer(data))));
    }

    /**
     * Waits until &#64;thread finishes, i.e. the function &#64;func, as
     * <br>given to g_thread_new(), returns or g_thread_exit() is called.
     * <br>If &#64;thread has already terminated, then g_thread_join()
     * <br>returns immediately.
     * <br>
     * <br>Any thread can wait for any other thread by calling g_thread_join(),
     * <br>not just its 'creator'. Calling g_thread_join() from multiple threads
     * <br>for the same &#64;thread leads to undefined behaviour.
     * <br>
     * <br>The value returned by &#64;func or given to g_thread_exit() is
     * <br>returned by this function.
     * <br>
     * <br>g_thread_join() consumes the reference to the passed-in &#64;thread.
     * <br>This will usually cause the &#35;GThread struct and associated resources
     * <br>to be freed. Use g_thread_ref() to obtain an extra reference if you
     * <br>want to keep the GThread alive beyond the g_thread_join() call.
     * @return the return value of the thread
    */
    public ch.bailu.gtk.type.Pointer join()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaThread.INST().g_thread_join(asCPointer())));
    }

    /**
     * Increase the reference count on &#64;thread.
     * @return a new reference to &#64;thread
    */
    public Thread ref()  {
        return new Thread(new PointerContainer(JnaThread.INST().g_thread_ref(asCPointer())));
    }

    /**
     * Decrease the reference count on &#64;thread, possibly freeing all
     * <br>resources associated with it.
     * <br>
     * <br>Note that each thread holds a reference to its &#35;GThread while
     * <br>it is running, so it is safe to drop your own reference to it
     * <br>if you don't need it anymore.
    */
    public void unref()  {
        JnaThread.INST().g_thread_unref(asCPointer());
    }

    /**
     * 
     * @return 
    */
    public static int errorQuark()  {
        return JnaThread.INST().g_thread_error_quark();
    }

    /**
     * Terminates the current thread.
     * <br>
     * <br>If another thread is waiting for us using g_thread_join() then the
     * <br>waiting thread will be woken up and get &#64;retval as the return value
     * <br>of g_thread_join().
     * <br>
     * <br>Calling g_thread_exit() with a parameter &#64;retval is equivalent to
     * <br>returning &#64;retval from the function &#64;func, as given to g_thread_new().
     * <br>
     * <br>You must only call g_thread_exit() from a thread that you created
     * <br>yourself with g_thread_new() or related APIs. You must not call
     * <br>this function from a thread created with another threading library
     * <br>or or from within a &#35;GThreadPool.
     * @param retval the return value of this thread
    */
    public static void exit(@Nullable ch.bailu.gtk.type.Pointer retval)  {
        JnaThread.INST().g_thread_exit(asCPointer(retval));
    }

    /**
     * This function returns the &#35;GThread corresponding to the
     * <br>current thread. Note that this function does not increase
     * <br>the reference count of the returned struct.
     * <br>
     * <br>This function will return a &#35;GThread even for threads that
     * <br>were not created by GLib (i.e. those created by other threading
     * <br>APIs). This may be useful for thread identification purposes
     * <br>(i.e. comparisons) but you must not use GLib functions (such
     * <br>as g_thread_join()) on these threads.
     * @return the &#35;GThread representing the current thread
    */
    public static Thread self()  {
        return new Thread(new PointerContainer(JnaThread.INST().g_thread_self()));
    }

    /**
     * Causes the calling thread to voluntarily relinquish the CPU, so
     * <br>that other threads can run.
     * <br>
     * <br>This function is often used as a method to make busy wait less evil.
    */
    public static void yield()  {
        JnaThread.INST().g_thread_yield();
    }

    public static long getTypeID() { 
        return JnaThread.INST().g_thread_get_type(); 
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
*/
