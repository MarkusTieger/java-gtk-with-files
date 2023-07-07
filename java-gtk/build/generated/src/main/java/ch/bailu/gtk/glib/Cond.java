/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GCond struct is an opaque data structure that represents a
 * <br>condition. Threads can block on a &#35;GCond if they find a certain
 * <br>condition to be false. If other threads change the state of this
 * <br>condition they signal the &#35;GCond, and that causes the waiting
 * <br>threads to be woken up.
 * <br>
 * <br>Consider the following example of a shared variable.  One or more
 * <br>threads can wait for data to be published to the variable and when
 * <br>another thread publishes the data, it can signal one of the waiting
 * <br>threads to wake up to collect the data.
 * <br>
 * <br>Here is an example for using GCond to block a thread until a condition
 * <br>is satisfied:
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *   gpointer current_data = NULL;
 *   GMutex data_mutex;
 *   GCond data_cond;
 * 
 *   void
 *   push_data (gpointer data)
 *   {
 *     g_mutex_lock (&amp;data_mutex);
 *     current_data = data;
 *     g_cond_signal (&amp;data_cond);
 *     g_mutex_unlock (&amp;data_mutex);
 *   }
 * 
 *   gpointer
 *   pop_data (void)
 *   {
 *     gpointer data;
 * 
 *     g_mutex_lock (&amp;data_mutex);
 *     while (!current_data)
 *       g_cond_wait (&amp;data_cond, &amp;data_mutex);
 *     data = current_data;
 *     current_data = NULL;
 *     g_mutex_unlock (&amp;data_mutex);
 * 
 *     return data;
 *   }
 * </pre>
 * <br>Whenever a thread calls pop_data() now, it will wait until
 * <br>current_data is non-%NULL, i.e. until some other thread
 * <br>has called push_data().
 * <br>
 * <br>The example shows that use of a condition variable must always be
 * <br>paired with a mutex.  Without the use of a mutex, there would be a
 * <br>race between the check of &#64;current_data by the while loop in
 * <br>pop_data() and waiting. Specifically, another thread could set
 * <br>&#64;current_data after the check, and signal the cond (with nobody
 * <br>waiting on it) before the first thread goes to sleep. &#35;GCond is
 * <br>specifically useful for its ability to release the mutex and go
 * <br>to sleep atomically.
 * <br>
 * <br>It is also important to use the g_cond_wait() and g_cond_wait_until()
 * <br>functions only inside a loop which checks for the condition to be
 * <br>true.  See g_cond_wait() for an explanation of why the condition may
 * <br>not be true even after it returns.
 * <br>
 * <br>If a &#35;GCond is allocated in static storage then it can be used
 * <br>without initialisation.  Otherwise, you should call g_cond_init()
 * <br>on it and g_cond_clear() when done.
 * <br>
 * <br>A &#35;GCond should only be accessed via the g_cond_ functions.
 * <p><a href="https://docs.gtk.org/glib/struct.Cond.html">https://docs.gtk.org/glib/struct.Cond.html</a></p>
*/
public class Cond extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Cond.class.getCanonicalName());
    }

    public Cond(PointerContainer pointer) {
        super(pointer);
    }

    private JnaCond.Fields _fields;
    
    JnaCond.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaCond.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String P = "p";

    /**
     * 
    */
    public ch.bailu.gtk.type.Pointer getFieldP() {
       toFields().readField(P);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().p));
    } 

    /**
     * If threads are waiting for &#64;cond, all of them are unblocked.
     * <br>If no threads are waiting for &#64;cond, this function has no effect.
     * <br>It is good practice to lock the same mutex as the waiting threads
     * <br>while calling this function, though not required.
    */
    public void broadcast()  {
        JnaCond.INST().g_cond_broadcast(asCPointer());
    }

    /**
     * Frees the resources allocated to a &#35;GCond with g_cond_init().
     * <br>
     * <br>This function should not be used with a &#35;GCond that has been
     * <br>statically allocated.
     * <br>
     * <br>Calling g_cond_clear() for a &#35;GCond on which threads are
     * <br>blocking leads to undefined behaviour.
    */
    public void clear()  {
        JnaCond.INST().g_cond_clear(asCPointer());
    }

    /**
     * Initialises a &#35;GCond so that it can be used.
     * <br>
     * <br>This function is useful to initialise a &#35;GCond that has been
     * <br>allocated as part of a larger structure.  It is not necessary to
     * <br>initialise a &#35;GCond that has been statically allocated.
     * <br>
     * <br>To undo the effect of g_cond_init() when a &#35;GCond is no longer
     * <br>needed, use g_cond_clear().
     * <br>
     * <br>Calling g_cond_init() on an already-initialised &#35;GCond leads
     * <br>to undefined behaviour.
    */
    public void init()  {
        JnaCond.INST().g_cond_init(asCPointer());
    }

    /**
     * If threads are waiting for &#64;cond, at least one of them is unblocked.
     * <br>If no threads are waiting for &#64;cond, this function has no effect.
     * <br>It is good practice to hold the same lock as the waiting thread
     * <br>while calling this function, though not required.
    */
    public void signal()  {
        JnaCond.INST().g_cond_signal(asCPointer());
    }

    /**
     * Atomically releases &#64;mutex and waits until &#64;cond is signalled.
     * <br>When this function returns, &#64;mutex is locked again and owned by the
     * <br>calling thread.
     * <br>
     * <br>When using condition variables, it is possible that a spurious wakeup
     * <br>may occur (ie: g_cond_wait() returns even though g_cond_signal() was
     * <br>not called).  It's also possible that a stolen wakeup may occur.
     * <br>This is when g_cond_signal() is called, but another thread acquires
     * <br>&#64;mutex before this thread and modifies the state of the program in
     * <br>such a way that when g_cond_wait() is able to return, the expected
     * <br>condition is no longer met.
     * <br>
     * <br>For this reason, g_cond_wait() must always be used in a loop.  See
     * <br>the documentation for &#35;GCond for a complete example.
     * @param mutex a &#35;GMutex that is currently locked
    */
    public void wait(@Nonnull Mutex mutex)  {
        JnaCond.INST().g_cond_wait(asCPointer(), asCPointerNotNull(mutex));
    }

    /**
     * Waits until either &#64;cond is signalled or &#64;end_time has passed.
     * <br>
     * <br>As with g_cond_wait() it is possible that a spurious or stolen wakeup
     * <br>could occur.  For that reason, waiting on a condition variable should
     * <br>always be in a loop, based on an explicitly-checked predicate.
     * <br>
     * <br>%TRUE is returned if the condition variable was signalled (or in the
     * <br>case of a spurious wakeup).  %FALSE is returned if &#64;end_time has
     * <br>passed.
     * <br>
     * <br>The following code shows how to correctly perform a timed wait on a
     * <br>condition variable (extending the example presented in the
     * <br>documentation for &#35;GCond):
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * gpointer
     * pop_data_timed (void)
     * {
     *   gint64 end_time;
     *   gpointer data;
     * 
     *   g_mutex_lock (&amp;data_mutex);
     * 
     *   end_time = g_get_monotonic_time () + 5 * G_TIME_SPAN_SECOND;
     *   while (!current_data)
     *     if (!g_cond_wait_until (&amp;data_cond, &amp;data_mutex, end_time))
     *       {
     *         // timeout has passed.
     *         g_mutex_unlock (&amp;data_mutex);
     *         return NULL;
     *       }
     * 
     *   // there is data for us
     *   data = current_data;
     *   current_data = NULL;
     * 
     *   g_mutex_unlock (&amp;data_mutex);
     * 
     *   return data;
     * }
     * </pre>
     * <br>
     * <br>Notice that the end time is calculated once, before entering the
     * <br>loop and reused.  This is the motivation behind the use of absolute
     * <br>time on this API -- if a relative time of 5 seconds were passed
     * <br>directly to the call and a spurious wakeup occurred, the program would
     * <br>have to start over waiting again (which would lead to a total wait
     * <br>time of more than 5 seconds).
     * @param mutex a &#35;GMutex that is currently locked
     * @param end_time the monotonic time to wait until
     * @return %TRUE on a signal, %FALSE on a timeout
    */
    public boolean waitUntil(@Nonnull Mutex mutex, long end_time)  {
        return JnaCond.INST().g_cond_wait_until(asCPointer(), asCPointerNotNull(mutex), end_time);
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:i:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
