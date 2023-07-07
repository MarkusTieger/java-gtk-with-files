/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The GRecMutex struct is an opaque data structure to represent a
 * <br>recursive mutex. It is similar to a &#35;GMutex with the difference
 * <br>that it is possible to lock a GRecMutex multiple times in the same
 * <br>thread without deadlock. When doing so, care has to be taken to
 * <br>unlock the recursive mutex as often as it has been locked.
 * <br>
 * <br>If a &#35;GRecMutex is allocated in static storage then it can be used
 * <br>without initialisation.  Otherwise, you should call
 * <br>g_rec_mutex_init() on it and g_rec_mutex_clear() when done.
 * <br>
 * <br>A GRecMutex should only be accessed with the
 * <br>g_rec_mutex_ functions.
 * <p><a href="https://docs.gtk.org/glib/struct.RecMutex.html">https://docs.gtk.org/glib/struct.RecMutex.html</a></p>
*/
public class RecMutex extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RecMutex.class.getCanonicalName());
    }

    public RecMutex(PointerContainer pointer) {
        super(pointer);
    }

    private JnaRecMutex.Fields _fields;
    
    JnaRecMutex.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRecMutex.Fields(asCPointer());
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
     * Frees the resources allocated to a recursive mutex with
     * <br>g_rec_mutex_init().
     * <br>
     * <br>This function should not be used with a &#35;GRecMutex that has been
     * <br>statically allocated.
     * <br>
     * <br>Calling g_rec_mutex_clear() on a locked recursive mutex leads
     * <br>to undefined behaviour.
    */
    public void clear()  {
        JnaRecMutex.INST().g_rec_mutex_clear(asCPointer());
    }

    /**
     * Initializes a &#35;GRecMutex so that it can be used.
     * <br>
     * <br>This function is useful to initialize a recursive mutex
     * <br>that has been allocated on the stack, or as part of a larger
     * <br>structure.
     * <br>
     * <br>It is not necessary to initialise a recursive mutex that has been
     * <br>statically allocated.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   typedef struct {
     *     GRecMutex m;
     *     ...
     *   } Blob;
     * 
     * Blob *b;
     * 
     * b = g_new (Blob, 1);
     * g_rec_mutex_init (&amp;b-&gt;m);
     * </pre>
     * <br>
     * <br>Calling g_rec_mutex_init() on an already initialized &#35;GRecMutex
     * <br>leads to undefined behaviour.
     * <br>
     * <br>To undo the effect of g_rec_mutex_init() when a recursive mutex
     * <br>is no longer needed, use g_rec_mutex_clear().
    */
    public void init()  {
        JnaRecMutex.INST().g_rec_mutex_init(asCPointer());
    }

    /**
     * Locks &#64;rec_mutex. If &#64;rec_mutex is already locked by another
     * <br>thread, the current thread will block until &#64;rec_mutex is
     * <br>unlocked by the other thread. If &#64;rec_mutex is already locked
     * <br>by the current thread, the 'lock count' of &#64;rec_mutex is increased.
     * <br>The mutex will only become available again when it is unlocked
     * <br>as many times as it has been locked.
    */
    public void lock()  {
        JnaRecMutex.INST().g_rec_mutex_lock(asCPointer());
    }

    /**
     * Tries to lock &#64;rec_mutex. If &#64;rec_mutex is already locked
     * <br>by another thread, it immediately returns %FALSE. Otherwise
     * <br>it locks &#64;rec_mutex and returns %TRUE.
     * @return %TRUE if &#64;rec_mutex could be locked
    */
    public boolean trylock()  {
        return JnaRecMutex.INST().g_rec_mutex_trylock(asCPointer());
    }

    /**
     * Unlocks &#64;rec_mutex. If another thread is blocked in a
     * <br>g_rec_mutex_lock() call for &#64;rec_mutex, it will become unblocked
     * <br>and can lock &#64;rec_mutex itself.
     * <br>
     * <br>Calling g_rec_mutex_unlock() on a recursive mutex that is not
     * <br>locked by the current thread leads to undefined behaviour.
    */
    public void unlock()  {
        JnaRecMutex.INST().g_rec_mutex_unlock(asCPointer());
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:i:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
