/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GInitable is implemented by objects that can fail during
 * <br>initialization. If an object implements this interface then
 * <br>it must be initialized as the first thing after construction,
 * <br>either via g_initable_init() or g_async_initable_init_async()
 * <br>(the latter is only available if it also implements &#35;GAsyncInitable).
 * <br>
 * <br>If the object is not initialized, or initialization returns with an
 * <br>error, then all operations on the object except g_object_ref() and
 * <br>g_object_unref() are considered to be invalid, and have undefined
 * <br>behaviour. They will often fail with g_critical() or g_warning(), but
 * <br>this must not be relied on.
 * <br>
 * <br>Users of objects implementing this are not intended to use
 * <br>the interface method directly, instead it will be used automatically
 * <br>in various ways. For C applications you generally just call
 * <br>g_initable_new() directly, or indirectly via a foo_thing_new() wrapper.
 * <br>This will call g_initable_init() under the cover, returning %NULL and
 * <br>setting a &#35;GError on failure (at which point the instance is
 * <br>unreferenced).
 * <br>
 * <br>For bindings in languages where the native constructor supports
 * <br>exceptions the binding could check for objects implementing %GInitable
 * <br>during normal construction and automatically initialize them, throwing
 * <br>an exception on failure.
 * <p><a href="https://docs.gtk.org/gio/iface.Initable.html">https://docs.gtk.org/gio/iface.Initable.html</a></p>
*/
public class Initable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Initable.class.getCanonicalName());
    }

    public Initable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Initializes the object implementing the interface.
     * <br>
     * <br>This method is intended for language bindings. If writing in C,
     * <br>g_initable_new() should typically be used instead.
     * <br>
     * <br>The object must be initialized before any real use after initial
     * <br>construction, either with this function or g_async_initable_init_async().
     * <br>
     * <br>Implementations may also support cancellation. If &#64;cancellable is not %NULL,
     * <br>then initialization can be cancelled by triggering the cancellable object
     * <br>from another thread. If the operation was cancelled, the error
     * <br>%G_IO_ERROR_CANCELLED will be returned. If &#64;cancellable is not %NULL and
     * <br>the object doesn't support cancellable initialization the error
     * <br>%G_IO_ERROR_NOT_SUPPORTED will be returned.
     * <br>
     * <br>If the object is not initialized, or initialization returns with an
     * <br>error, then all operations on the object except g_object_ref() and
     * <br>g_object_unref() are considered to be invalid, and have undefined
     * <br>behaviour. See the [introduction][ginitable] for more details.
     * <br>
     * <br>Callers should not assume that a class which implements &#35;GInitable can be
     * <br>initialized multiple times, unless the class explicitly documents itself as
     * <br>supporting this. Generally, a class’ implementation of init() can assume
     * <br>(and assert) that it will only be called once. Previously, this documentation
     * <br>recommended all &#35;GInitable implementations should be idempotent; that
     * <br>recommendation was relaxed in GLib 2.54.
     * <br>
     * <br>If a class explicitly supports being initialized multiple times, it is
     * <br>recommended that the method is idempotent: multiple calls with the same
     * <br>arguments should return the same results. Only the first call initializes
     * <br>the object; further calls return the result of the first call.
     * <br>
     * <br>One reason why a class might need to support idempotent initialization is if
     * <br>it is designed to be used via the singleton pattern, with a
     * <br>&#35;GObjectClass.constructor that sometimes returns an existing instance.
     * <br>In this pattern, a caller would expect to be able to call g_initable_init()
     * <br>on the result of g_object_new(), regardless of whether it is in fact a new
     * <br>instance.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return %TRUE if successful. If an error has occurred, this function will     return %FALSE and set &#64;error appropriately if present.
    */
    public boolean init(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaInitable.INST().g_initable_init(asCPointer(), asCPointer(cancellable), 0L);
    }

    public static long getTypeID() { 
        return JnaInitable.INST().g_initable_get_type(); 
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
interface-type

[MethodModel:java-type-not-supported:_new:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:java-type-not-supported:newValist:[ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:cb-deprecated:java-type-not-supported:newv:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GParameter*}}:{j:}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
*/
