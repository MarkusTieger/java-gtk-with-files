/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The GRWLock struct is an opaque data structure to represent a
 * <br>reader-writer lock. It is similar to a &#35;GMutex in that it allows
 * <br>multiple threads to coordinate access to a shared resource.
 * <br>
 * <br>The difference to a mutex is that a reader-writer lock discriminates
 * <br>between read-only ('reader') and full ('writer') access. While only
 * <br>one thread at a time is allowed write access (by holding the 'writer'
 * <br>lock via g_rw_lock_writer_lock()), multiple threads can gain
 * <br>simultaneous read-only access (by holding the 'reader' lock via
 * <br>g_rw_lock_reader_lock()).
 * <br>
 * <br>It is unspecified whether readers or writers have priority in acquiring the
 * <br>lock when a reader already holds the lock and a writer is queued to acquire
 * <br>it.
 * <br>
 * <br>Here is an example for an array with access functions:
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *   GRWLock lock;
 *   GPtrArray *array;
 * 
 *   gpointer
 *   my_array_get (guint index)
 *   {
 *     gpointer retval = NULL;
 * 
 *     if (!array)
 *       return NULL;
 * 
 *     g_rw_lock_reader_lock (&amp;lock);
 *     if (index &lt; array-&gt;len)
 *       retval = g_ptr_array_index (array, index);
 *     g_rw_lock_reader_unlock (&amp;lock);
 * 
 *     return retval;
 *   }
 * 
 *   void
 *   my_array_set (guint index, gpointer data)
 *   {
 *     g_rw_lock_writer_lock (&amp;lock);
 * 
 *     if (!array)
 *       array = g_ptr_array_new ();
 * 
 *     if (index &gt;= array-&gt;len)
 *       g_ptr_array_set_size (array, index+1);
 *     g_ptr_array_index (array, index) = data;
 * 
 *     g_rw_lock_writer_unlock (&amp;lock);
 *   }
 *  </pre>
 * <br>This example shows an array which can be accessed by many readers
 * <br>(the my_array_get() function) simultaneously, whereas the writers
 * <br>(the my_array_set() function) will only be allowed one at a time
 * <br>and only if no readers currently access the array. This is because
 * <br>of the potentially dangerous resizing of the array. Using these
 * <br>functions is fully multi-thread safe now.
 * <br>
 * <br>If a &#35;GRWLock is allocated in static storage then it can be used
 * <br>without initialisation.  Otherwise, you should call
 * <br>g_rw_lock_init() on it and g_rw_lock_clear() when done.
 * <br>
 * <br>A GRWLock should only be accessed with the g_rw_lock_ functions.
 * <p><a href="https://docs.gtk.org/glib/struct.RWLock.html">https://docs.gtk.org/glib/struct.RWLock.html</a></p>
*/
public class RWLock extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RWLock.class.getCanonicalName());
    }

    public RWLock(PointerContainer pointer) {
        super(pointer);
    }

    private JnaRWLock.Fields _fields;
    
    JnaRWLock.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRWLock.Fields(asCPointer());
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
     * Frees the resources allocated to a lock with g_rw_lock_init().
     * <br>
     * <br>This function should not be used with a &#35;GRWLock that has been
     * <br>statically allocated.
     * <br>
     * <br>Calling g_rw_lock_clear() when any thread holds the lock
     * <br>leads to undefined behaviour.
    */
    public void clear()  {
        JnaRWLock.INST().g_rw_lock_clear(asCPointer());
    }

    /**
     * Initializes a &#35;GRWLock so that it can be used.
     * <br>
     * <br>This function is useful to initialize a lock that has been
     * <br>allocated on the stack, or as part of a larger structure.  It is not
     * <br>necessary to initialise a reader-writer lock that has been statically
     * <br>allocated.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   typedef struct {
     *     GRWLock l;
     *     ...
     *   } Blob;
     * 
     * Blob *b;
     * 
     * b = g_new (Blob, 1);
     * g_rw_lock_init (&amp;b-&gt;l);
     * </pre>
     * <br>
     * <br>To undo the effect of g_rw_lock_init() when a lock is no longer
     * <br>needed, use g_rw_lock_clear().
     * <br>
     * <br>Calling g_rw_lock_init() on an already initialized &#35;GRWLock leads
     * <br>to undefined behaviour.
    */
    public void init()  {
        JnaRWLock.INST().g_rw_lock_init(asCPointer());
    }

    /**
     * Obtain a read lock on &#64;rw_lock. If another thread currently holds
     * <br>the write lock on &#64;rw_lock, the current thread will block until the
     * <br>write lock was (held and) released. If another thread does not hold
     * <br>the write lock, but is waiting for it, it is implementation defined
     * <br>whether the reader or writer will block. Read locks can be taken
     * <br>recursively.
     * <br>
     * <br>Calling g_rw_lock_reader_lock() while the current thread already
     * <br>owns a write lock leads to undefined behaviour. Read locks however
     * <br>can be taken recursively, in which case you need to make sure to
     * <br>call g_rw_lock_reader_unlock() the same amount of times.
     * <br>
     * <br>It is implementation-defined how many read locks are allowed to be
     * <br>held on the same lock simultaneously. If the limit is hit,
     * <br>or if a deadlock is detected, a critical warning will be emitted.
    */
    public void readerLock()  {
        JnaRWLock.INST().g_rw_lock_reader_lock(asCPointer());
    }

    /**
     * Tries to obtain a read lock on &#64;rw_lock and returns %TRUE if
     * <br>the read lock was successfully obtained. Otherwise it
     * <br>returns %FALSE.
     * @return %TRUE if &#64;rw_lock could be locked
    */
    public boolean readerTrylock()  {
        return JnaRWLock.INST().g_rw_lock_reader_trylock(asCPointer());
    }

    /**
     * Release a read lock on &#64;rw_lock.
     * <br>
     * <br>Calling g_rw_lock_reader_unlock() on a lock that is not held
     * <br>by the current thread leads to undefined behaviour.
    */
    public void readerUnlock()  {
        JnaRWLock.INST().g_rw_lock_reader_unlock(asCPointer());
    }

    /**
     * Obtain a write lock on &#64;rw_lock. If another thread currently holds
     * <br>a read or write lock on &#64;rw_lock, the current thread will block
     * <br>until all other threads have dropped their locks on &#64;rw_lock.
     * <br>
     * <br>Calling g_rw_lock_writer_lock() while the current thread already
     * <br>owns a read or write lock on &#64;rw_lock leads to undefined behaviour.
    */
    public void writerLock()  {
        JnaRWLock.INST().g_rw_lock_writer_lock(asCPointer());
    }

    /**
     * Tries to obtain a write lock on &#64;rw_lock. If another thread
     * <br>currently holds a read or write lock on &#64;rw_lock, it immediately
     * <br>returns %FALSE.
     * <br>Otherwise it locks &#64;rw_lock and returns %TRUE.
     * @return %TRUE if &#64;rw_lock could be locked
    */
    public boolean writerTrylock()  {
        return JnaRWLock.INST().g_rw_lock_writer_trylock(asCPointer());
    }

    /**
     * Release a write lock on &#64;rw_lock.
     * <br>
     * <br>Calling g_rw_lock_writer_unlock() on a lock that is not held
     * <br>by the current thread leads to undefined behaviour.
    */
    public void writerUnlock()  {
        JnaRWLock.INST().g_rw_lock_writer_unlock(asCPointer());
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:i:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
