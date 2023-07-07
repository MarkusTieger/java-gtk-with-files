/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GMutex struct is an opaque data structure to represent a mutex
 * <br>(mutual exclusion). It can be used to protect data against shared
 * <br>access.
 * <br>
 * <br>Take for example the following function:
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *   int
 *   give_me_next_number (void)
 *   {
 *     static int current_number = 0;
 * 
 *     // now do a very complicated calculation to calculate the new
 *     // number, this might for example be a random number generator
 *     current_number = calc_next_number (current_number);
 * 
 *     return current_number;
 *   }
 * </pre>
 * <br>It is easy to see that this won't work in a multi-threaded
 * <br>application. There current_number must be protected against shared
 * <br>access. A &#35;GMutex can be used as a solution to this problem:
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *   int
 *   give_me_next_number (void)
 *   {
 *     static GMutex mutex;
 *     static int current_number = 0;
 *     int ret_val;
 * 
 *     g_mutex_lock (&amp;mutex);
 *     ret_val = current_number = calc_next_number (current_number);
 *     g_mutex_unlock (&amp;mutex);
 * 
 *     return ret_val;
 *   }
 * </pre>
 * <br>Notice that the &#35;GMutex is not initialised to any particular value.
 * <br>Its placement in static storage ensures that it will be initialised
 * <br>to all-zeros, which is appropriate.
 * <br>
 * <br>If a &#35;GMutex is placed in other contexts (eg: embedded in a struct)
 * <br>then it must be explicitly initialised using g_mutex_init().
 * <br>
 * <br>A &#35;GMutex should only be accessed via g_mutex_ functions.
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public class Mutex extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Mutex.class.getCanonicalName());
    }

    public Mutex(PointerContainer pointer) {
        super(pointer);
    }

    private JnaMutex.Fields _fields;
    
    JnaMutex.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaMutex.Fields(asCPointer());
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
     * Frees the resources allocated to a mutex with g_mutex_init().
     * <br>
     * <br>This function should not be used with a &#35;GMutex that has been
     * <br>statically allocated.
     * <br>
     * <br>Calling g_mutex_clear() on a locked mutex leads to undefined
     * <br>behaviour.
    */
    public void clear()  {
        JnaMutex.INST().g_mutex_clear(asCPointer());
    }

    /**
     * Initializes a &#35;GMutex so that it can be used.
     * <br>
     * <br>This function is useful to initialize a mutex that has been
     * <br>allocated on the stack, or as part of a larger structure.
     * <br>It is not necessary to initialize a mutex that has been
     * <br>statically allocated.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   typedef struct {
     *     GMutex m;
     *     ...
     *   } Blob;
     * 
     * Blob *b;
     * 
     * b = g_new (Blob, 1);
     * g_mutex_init (&amp;b-&gt;m);
     * </pre>
     * <br>
     * <br>To undo the effect of g_mutex_init() when a mutex is no longer
     * <br>needed, use g_mutex_clear().
     * <br>
     * <br>Calling g_mutex_init() on an already initialized &#35;GMutex leads
     * <br>to undefined behaviour.
    */
    public void init()  {
        JnaMutex.INST().g_mutex_init(asCPointer());
    }

    /**
     * Locks &#64;mutex. If &#64;mutex is already locked by another thread, the
     * <br>current thread will block until &#64;mutex is unlocked by the other
     * <br>thread.
     * <br>
     * <br>&#35;GMutex is neither guaranteed to be recursive nor to be
     * <br>non-recursive.  As such, calling g_mutex_lock() on a &#35;GMutex that has
     * <br>already been locked by the same thread results in undefined behaviour
     * <br>(including but not limited to deadlocks).
    */
    public void lock()  {
        JnaMutex.INST().g_mutex_lock(asCPointer());
    }

    /**
     * Tries to lock &#64;mutex. If &#64;mutex is already locked by another thread,
     * <br>it immediately returns %FALSE. Otherwise it locks &#64;mutex and returns
     * <br>%TRUE.
     * <br>
     * <br>&#35;GMutex is neither guaranteed to be recursive nor to be
     * <br>non-recursive.  As such, calling g_mutex_lock() on a &#35;GMutex that has
     * <br>already been locked by the same thread results in undefined behaviour
     * <br>(including but not limited to deadlocks or arbitrary return values).
     * @return %TRUE if &#64;mutex could be locked
    */
    public boolean trylock()  {
        return JnaMutex.INST().g_mutex_trylock(asCPointer());
    }

    /**
     * Unlocks &#64;mutex. If another thread is blocked in a g_mutex_lock()
     * <br>call for &#64;mutex, it will become unblocked and can lock &#64;mutex itself.
     * <br>
     * <br>Calling g_mutex_unlock() on a mutex that is not locked by the
     * <br>current thread leads to undefined behaviour.
    */
    public void unlock()  {
        JnaMutex.INST().g_mutex_unlock(asCPointer());
    }

}

/*
union-type
some-fields-unsupported

[FieldModel:i:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
