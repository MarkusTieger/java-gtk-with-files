/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GOnce struct controls a one-time initialization function. Any
 * <br>one-time initialization function must have its own unique &#35;GOnce
 * <br>struct.
 * <p><a href="https://docs.gtk.org/glib/struct.Once.html">https://docs.gtk.org/glib/struct.Once.html</a></p>
*/
public class Once extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Once.class.getCanonicalName());
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
    
    private static JnaOnce.OnThreadFunc toOnThreadFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnThreadFunc in) {
        JnaOnce.OnThreadFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_user_data) -> in.onThreadFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public Once(PointerContainer pointer) {
        super(pointer);
    }

    private JnaOnce.Fields _fields;
    
    JnaOnce.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaOnce.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the status of the &#35;GOnce
    */
    public static final String STATUS = "status";

    /**
     * the status of the &#35;GOnce
    */
    public void setFieldStatus(int status) {
        toFields().status = status;
        toFields().writeField(STATUS);
    }

    /**
     * the status of the &#35;GOnce
    */
    public int getFieldStatus() {
       toFields().readField(STATUS);
       return toFields().status;
    } 

    /**
     * 
     * @param func 
     * @param arg 
     * @return 
    */
    public ch.bailu.gtk.type.Pointer impl(OnThreadFunc func, @Nullable ch.bailu.gtk.type.Pointer arg)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaOnce.INST().g_once_impl(asCPointer(), toOnThreadFunc(this, "impl", func), asCPointer(arg))));
    }

    /**
     * Function to be called when starting a critical initialization
     * <br>section. The argument &#64;location must point to a static
     * <br>0-initialized variable that will be set to a value other than 0 at
     * <br>the end of the initialization section. In combination with
     * <br>g_once_init_leave() and the unique address &#64;value_location, it can
     * <br>be ensured that an initialization section will be executed only once
     * <br>during a program's life time, and that concurrent threads are
     * <br>blocked until initialization completed. To be used in constructs
     * <br>like this:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   static gsize initialization_value = 0;
     * 
     *   if (g_once_init_enter (&amp;initialization_value))
     *     {
     *       gsize setup_value = 42; // initialization code here
     * 
     *       g_once_init_leave (&amp;initialization_value, setup_value);
     *     }
     * 
     *   // use initialization_value here
     * </pre>
     * <br>
     * <br>While &#64;location has a `volatile` qualifier, this is a historical artifact and
     * <br>the pointer passed to it should not be `volatile`.
     * @param location location of a static initializable variable    containing 0
     * @return %TRUE if the initialization section should be entered,     %FALSE and blocks otherwise
    */
    public static boolean initEnter(@Nonnull ch.bailu.gtk.type.Pointer location)  {
        return JnaOnce.INST().g_once_init_enter(asCPointerNotNull(location));
    }

    /**
     * Counterpart to g_once_init_enter(). Expects a location of a static
     * <br>0-initialized initialization variable, and an initialization value
     * <br>other than 0. Sets the variable to the initialization value, and
     * <br>releases concurrent threads blocking in g_once_init_enter() on this
     * <br>initialization variable.
     * <br>
     * <br>While &#64;location has a `volatile` qualifier, this is a historical artifact and
     * <br>the pointer passed to it should not be `volatile`.
     * @param location location of a static initializable variable    containing 0
     * @param result new non-0 value for *&#64;value_location
    */
    public static void initLeave(@Nonnull ch.bailu.gtk.type.Pointer location, long result)  {
        JnaOnce.INST().g_once_init_leave(asCPointerNotNull(location), result);
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:retval:java-type-not-supported:{G_::{c:volatile gpointer}}:{j:}]
*/
