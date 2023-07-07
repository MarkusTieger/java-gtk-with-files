/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GPrivate struct is an opaque data structure to represent a
 * <br>thread-local data key. It is approximately equivalent to the
 * <br>pthread_setspecific()/pthread_getspecific() APIs on POSIX and to
 * <br>TlsSetValue()/TlsGetValue() on Windows.
 * <br>
 * <br>If you don't already know why you might want this functionality,
 * <br>then you probably don't need it.
 * <br>
 * <br>&#35;GPrivate is a very limited resource (as far as 128 per program,
 * <br>shared between all libraries). It is also not possible to destroy a
 * <br>&#35;GPrivate after it has been used. As such, it is only ever acceptable
 * <br>to use &#35;GPrivate in static scope, and even then sparingly so.
 * <br>
 * <br>See G_PRIVATE_INIT() for a couple of examples.
 * <br>
 * <br>The &#35;GPrivate structure should be considered opaque.  It should only
 * <br>be accessed via the g_private_ functions.
 * <p><a href="https://docs.gtk.org/glib/struct.Private.html">https://docs.gtk.org/glib/struct.Private.html</a></p>
*/
public class Private extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Private.class.getCanonicalName());
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
    
    private static JnaPrivate.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaPrivate.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public Private(PointerContainer pointer) {
        super(pointer);
    }

    private JnaPrivate.Fields _fields;
    
    JnaPrivate.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPrivate.Fields(asCPointer());
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
     * 
     * <br>See {@link OnDestroyNotify#onDestroyNotify}
    */
    public static final String NOTIFY = "notify";

    /**
     * 
     * <br>See {@link OnDestroyNotify#onDestroyNotify}
    */
    public void setFieldNotify(OnDestroyNotify notify) {
        toFields().notify = toOnDestroyNotify(this, NOTIFY, notify);
        toFields().writeField(NOTIFY);
    }

    /**
     * 
     * <br>See {@link OnDestroyNotify#onDestroyNotify}
    */
    public JnaPrivate.OnDestroyNotify getFieldNotify() {
       toFields().readField(NOTIFY);
       return toFields().notify;
    } 

    /**
     * Returns the current value of the thread local variable &#64;key.
     * <br>
     * <br>If the value has not yet been set in this thread, %NULL is returned.
     * <br>Values are never copied between threads (when a new thread is
     * <br>created, for example).
     * @return the thread-local value
    */
    public ch.bailu.gtk.type.Pointer get()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaPrivate.INST().g_private_get(asCPointer())));
    }

    /**
     * Sets the thread local variable &#64;key to have the value &#64;value in the
     * <br>current thread.
     * <br>
     * <br>This function differs from g_private_set() in the following way: if
     * <br>the previous value was non-%NULL then the &#35;GDestroyNotify handler for
     * <br>&#64;key is run on it.
     * @param value the new value
    */
    public void replace(@Nullable ch.bailu.gtk.type.Pointer value)  {
        JnaPrivate.INST().g_private_replace(asCPointer(), asCPointer(value));
    }

    /**
     * Sets the thread local variable &#64;key to have the value &#64;value in the
     * <br>current thread.
     * <br>
     * <br>This function differs from g_private_replace() in the following way:
     * <br>the &#35;GDestroyNotify for &#64;key is not called on the old value.
     * @param value the new value
    */
    public void set(@Nullable ch.bailu.gtk.type.Pointer value)  {
        JnaPrivate.INST().g_private_set(asCPointer(), asCPointer(value));
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:future:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
