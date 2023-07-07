/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GCClosure is a specialization of &#35;GClosure for C function callbacks.
 * <p><a href="https://docs.gtk.org/gobject/struct.CClosure.html">https://docs.gtk.org/gobject/struct.CClosure.html</a></p>
*/
public class CClosure extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CClosure.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCallback {
        /**
         * The type used for callback functions in structure definitions and function
         * <br>signatures.
         * <br>
         * <br>This doesn't mean that all callback functions must take no  parameters and
         * <br>return void. The required signature of a callback function is determined by
         * <br>the context in which is used (e.g. the signal to which it is connected).
         * <br>
         * <br>Use G_CALLBACK() to cast the callback function to a &#35;GCallback.
        */
        void onCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaCClosure.OnCallback toOnCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnCallback in) {
        JnaCClosure.OnCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onCallback(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnClosureNotify {
        /**
         * The type used for the various notification callbacks which can be registered
         * <br>on closures.
         * @param data data specified when registering the notification callback
         * @param closure the &#35;GClosure on which the notification is emitted
        */
        void onClosureNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data, @Nonnull Closure closure);
    }
    
    private static JnaCClosure.OnClosureNotify toOnClosureNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnClosureNotify in) {
        JnaCClosure.OnClosureNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data, _closure) -> in.onClosureNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)), new Closure(new PointerContainer(_closure)));
            __callback.register(out);
        }
        return out;
    }

    public CClosure(PointerContainer pointer) {
        super(pointer);
    }

    public CClosure() {
        super(cast(JnaCClosure.allocateStructure()));
    }

    private JnaCClosure.Fields _fields;
    
    JnaCClosure.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaCClosure.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the &#35;GClosure
     * <br>Private field: direct-type
    */
    public static final String CLOSURE = "closure";

    /**
     * the callback function
    */
    public static final String CALLBACK = "callback";

    /**
     * the callback function
    */
    public void setFieldCallback(ch.bailu.gtk.type.Pointer callback) {
        toFields().callback = callback.asCPointer();
        toFields().writeField(CALLBACK);
    }

    /**
     * the callback function
    */
    public ch.bailu.gtk.type.Pointer getFieldCallback() {
       toFields().readField(CALLBACK);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().callback));
    } 

    /**
     * A &#35;GClosureMarshal function for use with signals with handlers that
     * <br>take two boxed pointers as arguments and return a boolean.  If you
     * <br>have such a signal, you will probably also need to use an
     * <br>accumulator, such as g_signal_accumulator_true_handled().
     * @param closure A &#35;GClosure.
     * @param return_value A &#35;GValue to store the return value. May be %NULL   if the callback of closure doesn't return a value.
     * @param n_param_values The length of the &#64;param_values array.
     * @param param_values An array of &#35;GValues holding the arguments   on which to invoke the callback of closure.
     * @param invocation_hint The invocation hint given as the last argument to   g_closure_invoke().
     * @param marshal_data Additional data specified when registering the   marshaller, see g_closure_set_marshal() and   g_closure_set_meta_marshal()
    */
    public static void marshalBooleanBoxedBoxed(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_BOOLEAN__BOXED_BOXED(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`gboolean (*callback) (gpointer instance, gint arg1, gpointer user_data)` where the &#35;gint parameter
     * <br>denotes a flags type.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value a &#35;GValue which can store the returned &#35;gboolean
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding instance and arg1
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalBooleanFlags(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_BOOLEAN__FLAGS(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`gchar* (*callback) (gpointer instance, GObject *arg1, gpointer arg2, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value a &#35;GValue, which can store the returned string
     * @param n_param_values 3
     * @param param_values a &#35;GValue array holding instance, arg1 and arg2
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalStringObjectPointer(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_STRING__OBJECT_POINTER(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, gboolean arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;gboolean parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidBoolean(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__BOOLEAN(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, GBoxed *arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;GBoxed* parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidBoxed(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__BOXED(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, gchar arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;gchar parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidChar(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__CHAR(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, gdouble arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;gdouble parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidDouble(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__DOUBLE(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, gint arg1, gpointer user_data)` where the &#35;gint parameter denotes an enumeration type..
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the enumeration parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidEnum(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__ENUM(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, gint arg1, gpointer user_data)` where the &#35;gint parameter denotes a flags type.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the flags parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidFlags(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__FLAGS(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, gfloat arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;gfloat parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidFloat(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__FLOAT(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, gint arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;gint parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidInt(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__INT(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, glong arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;glong parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidLong(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__LONG(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, GObject *arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;GObject* parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidObject(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__OBJECT(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, GParamSpec *arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;GParamSpec* parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidParam(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__PARAM(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, gpointer arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;gpointer parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidPointer(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__POINTER(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, const gchar *arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;gchar* parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidString(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__STRING(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, guchar arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;guchar parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidUchar(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__UCHAR(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, guint arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;guint parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidUint(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__UINT(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, guint arg1, gpointer arg2, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 3
     * @param param_values a &#35;GValue array holding instance, arg1 and arg2
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidUintPointer(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__UINT_POINTER(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, gulong arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;gulong parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidUlong(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__ULONG(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, GVariant *arg1, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 2
     * @param param_values a &#35;GValue array holding the instance and the &#35;GVariant* parameter
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidVariant(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__VARIANT(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A marshaller for a &#35;GCClosure with a callback of type
     * <br>`void (*callback) (gpointer instance, gpointer user_data)`.
     * @param closure the &#35;GClosure to which the marshaller belongs
     * @param return_value ignored
     * @param n_param_values 1
     * @param param_values a &#35;GValue array holding only the instance
     * @param invocation_hint the invocation hint given as the last argument  to g_closure_invoke()
     * @param marshal_data additional data specified when registering the marshaller
    */
    public static void marshalVoidVoid(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_VOID__VOID(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * A generic marshaller function implemented via
     * <br>[libffi](http://sourceware.org/libffi/).
     * <br>
     * <br>Normally this function is not passed explicitly to g_signal_new(),
     * <br>but used automatically by GLib when specifying a %NULL marshaller.
     * @param closure A &#35;GClosure.
     * @param return_gvalue A &#35;GValue to store the return value. May be %NULL   if the callback of closure doesn't return a value.
     * @param n_param_values The length of the &#64;param_values array.
     * @param param_values An array of &#35;GValues holding the arguments   on which to invoke the callback of closure.
     * @param invocation_hint The invocation hint given as the last argument to   g_closure_invoke().
     * @param marshal_data Additional data specified when registering the   marshaller, see g_closure_set_marshal() and   g_closure_set_meta_marshal()
    */
    public static void marshalGeneric(@Nonnull Closure closure, @Nonnull Value return_gvalue, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaCClosure.INST().g_cclosure_marshal_generic(asCPointerNotNull(closure), asCPointerNotNull(return_gvalue), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
    }

    /**
     * Creates a new closure which invokes &#64;callback_func with &#64;user_data as
     * <br>the last parameter.
     * <br>
     * <br>&#64;destroy_data will be called as a finalize notifier on the &#35;GClosure.
     * @param callback_func the function to invoke
     * @param user_data user data to pass to &#64;callback_func
     * @param destroy_data destroy notify to be called when &#64;user_data is no longer used
     * @return a floating reference to a new &#35;GCClosure
    */
    public static Closure _new(OnCallback callback_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnClosureNotify destroy_data)  {
        return new Closure(new PointerContainer(JnaCClosure.INST().g_cclosure_new(toOnCallback(getClassHandler().getInstance(), "_new", callback_func), asCPointer(user_data), toOnClosureNotify(getClassHandler().getInstance(), "_new", destroy_data))));
    }

    /**
     * A variant of g_cclosure_new() which uses &#64;object as &#64;user_data and
     * <br>calls g_object_watch_closure() on &#64;object and the created
     * <br>closure. This function is useful when you have a callback closely
     * <br>associated with a &#35;GObject, and want the callback to no longer run
     * <br>after the object is is freed.
     * @param callback_func the function to invoke
     * @param object a &#35;GObject pointer to pass to &#64;callback_func
     * @return a new &#35;GCClosure
    */
    public static Closure newObject(OnCallback callback_func, @Nonnull Object object)  {
        return new Closure(new PointerContainer(JnaCClosure.INST().g_cclosure_new_object(toOnCallback(getClassHandler().getInstance(), "newObject", callback_func), asCPointerNotNull(object))));
    }

    /**
     * A variant of g_cclosure_new_swap() which uses &#64;object as &#64;user_data
     * <br>and calls g_object_watch_closure() on &#64;object and the created
     * <br>closure. This function is useful when you have a callback closely
     * <br>associated with a &#35;GObject, and want the callback to no longer run
     * <br>after the object is is freed.
     * @param callback_func the function to invoke
     * @param object a &#35;GObject pointer to pass to &#64;callback_func
     * @return a new &#35;GCClosure
    */
    public static Closure newObjectSwap(OnCallback callback_func, @Nonnull Object object)  {
        return new Closure(new PointerContainer(JnaCClosure.INST().g_cclosure_new_object_swap(toOnCallback(getClassHandler().getInstance(), "newObjectSwap", callback_func), asCPointerNotNull(object))));
    }

    /**
     * Creates a new closure which invokes &#64;callback_func with &#64;user_data as
     * <br>the first parameter.
     * <br>
     * <br>&#64;destroy_data will be called as a finalize notifier on the &#35;GClosure.
     * @param callback_func the function to invoke
     * @param user_data user data to pass to &#64;callback_func
     * @param destroy_data destroy notify to be called when &#64;user_data is no longer used
     * @return a floating reference to a new &#35;GCClosure
    */
    public static Closure newSwap(OnCallback callback_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnClosureNotify destroy_data)  {
        return new Closure(new PointerContainer(JnaCClosure.INST().g_cclosure_new_swap(toOnCallback(getClassHandler().getInstance(), "newSwap", callback_func), asCPointer(user_data), toOnClosureNotify(getClassHandler().getInstance(), "newSwap", destroy_data))));
    }

}

/*
record-type
all-fields-supported

[MethodModel:java-type-not-supported:marshalBooleanBoxedBoxedv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalBooleanFlagsv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalStringObjectPointerv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidBooleanv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidBoxedv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidCharv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidDoublev:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidEnumv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidFlagsv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidFloatv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidIntv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidLongv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidObjectv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidParamv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidPointerv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidStringv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidUcharv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidUintPointerv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidUintv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidUlongv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidVariantv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalVoidVoidv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:marshalGenericVa:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]
*/
