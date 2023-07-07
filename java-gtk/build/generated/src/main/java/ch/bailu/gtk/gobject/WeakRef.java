/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A structure containing a weak reference to a &#35;GObject.
 * <br>
 * <br>A `GWeakRef` can either be empty (i.e. point to %NULL), or point to an
 * <br>object for as long as at least one &quot;strong&quot; reference to that object
 * <br>exists. Before the object's &#35;GObjectClass.dispose method is called,
 * <br>every &#35;GWeakRef associated with becomes empty (i.e. points to %NULL).
 * <br>
 * <br>Like &#35;GValue, &#35;GWeakRef can be statically allocated, stack- or
 * <br>heap-allocated, or embedded in larger structures.
 * <br>
 * <br>Unlike g_object_weak_ref() and g_object_add_weak_pointer(), this weak
 * <br>reference is thread-safe: converting a weak pointer to a reference is
 * <br>atomic with respect to invalidation of weak pointers to destroyed
 * <br>objects.
 * <br>
 * <br>If the object's &#35;GObjectClass.dispose method results in additional
 * <br>references to the object being held (‘re-referencing’), any &#35;GWeakRefs taken
 * <br>before it was disposed will continue to point to %NULL.  Any &#35;GWeakRefs taken
 * <br>during disposal and after re-referencing, or after disposal has returned due
 * <br>to the re-referencing, will continue to point to the object until its refcount
 * <br>goes back to zero, at which point they too will be invalidated.
 * <br>
 * <br>It is invalid to take a &#35;GWeakRef on an object during &#35;GObjectClass.dispose
 * <br>without first having or creating a strong reference to the object.
 * <p><a href="https://docs.gtk.org/gobject/struct.WeakRef.html">https://docs.gtk.org/gobject/struct.WeakRef.html</a></p>
*/
public class WeakRef extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(WeakRef.class.getCanonicalName());
    }

    public WeakRef(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Frees resources associated with a non-statically-allocated &#35;GWeakRef.
     * <br>After this call, the &#35;GWeakRef is left in an undefined state.
     * <br>
     * <br>You should only call this on a &#35;GWeakRef that previously had
     * <br>g_weak_ref_init() called on it.
    */
    public void clear()  {
        JnaWeakRef.INST().g_weak_ref_clear(asCPointer());
    }

    /**
     * If &#64;weak_ref is not empty, atomically acquire a strong
     * <br>reference to the object it points to, and return that reference.
     * <br>
     * <br>This function is needed because of the potential race between taking
     * <br>the pointer value and g_object_ref() on it, if the object was losing
     * <br>its last reference at the same time in a different thread.
     * <br>
     * <br>The caller should release the resulting reference in the usual way,
     * <br>by using g_object_unref().
     * @return the object pointed to     by &#64;weak_ref, or %NULL if it was empty
    */
    public ch.bailu.gtk.type.Pointer get()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaWeakRef.INST().g_weak_ref_get(asCPointer())));
    }

    /**
     * Initialise a non-statically-allocated &#35;GWeakRef.
     * <br>
     * <br>This function also calls g_weak_ref_set() with &#64;object on the
     * <br>freshly-initialised weak reference.
     * <br>
     * <br>This function should always be matched with a call to
     * <br>g_weak_ref_clear().  It is not necessary to use this function for a
     * <br>&#35;GWeakRef in static storage because it will already be
     * <br>properly initialised.  Just use g_weak_ref_set() directly.
     * @param object a &#35;GObject or %NULL
    */
    public void init(@Nullable ch.bailu.gtk.type.Pointer object)  {
        JnaWeakRef.INST().g_weak_ref_init(asCPointer(), asCPointer(object));
    }

    /**
     * Change the object to which &#64;weak_ref points, or set it to
     * <br>%NULL.
     * <br>
     * <br>You must own a strong reference on &#64;object while calling this
     * <br>function.
     * @param object a &#35;GObject or %NULL
    */
    public void set(@Nullable ch.bailu.gtk.type.Pointer object)  {
        JnaWeakRef.INST().g_weak_ref_set(asCPointer(), asCPointer(object));
    }

}

/*
record-type
all-fields-supported
*/
