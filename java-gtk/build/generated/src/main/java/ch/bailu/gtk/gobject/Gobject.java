/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public class Gobject extends ch.bailu.gtk.type.Package {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Gobject.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnBoxedCopyFunc {
        /**
         * This function is provided by the user and should produce a copy
         * <br>of the passed in boxed structure.
         * @param boxed The boxed structure to be copied.
         * @return The newly created copy of the boxed structure.
        */
        ch.bailu.gtk.type.Pointer onBoxedCopyFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer boxed);
    }
    
    private static JnaGobject.OnBoxedCopyFunc toOnBoxedCopyFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnBoxedCopyFunc in) {
        JnaGobject.OnBoxedCopyFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_boxed) -> in.onBoxedCopyFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_boxed))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnBoxedFreeFunc {
        /**
         * This function is provided by the user and should free the boxed
         * <br>structure passed.
         * @param boxed The boxed structure to be freed.
        */
        void onBoxedFreeFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer boxed);
    }
    
    private static JnaGobject.OnBoxedFreeFunc toOnBoxedFreeFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnBoxedFreeFunc in) {
        JnaGobject.OnBoxedFreeFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_boxed) -> in.onBoxedFreeFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_boxed)));
            __callback.register(out);
        }
        return out;
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
    
    private static JnaGobject.OnCallback toOnCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnCallback in) {
        JnaGobject.OnCallback out = null;
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
    
    private static JnaGobject.OnClosureNotify toOnClosureNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnClosureNotify in) {
        JnaGobject.OnClosureNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data, _closure) -> in.onClosureNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)), new Closure(new PointerContainer(_closure)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTypeClassCacheFunc {
        /**
         * A callback function which is called when the reference count of a class
         * <br>drops to zero.
         * <br>
         * <br>It may use g_type_class_ref() to prevent the class from being freed. You
         * <br>should not call g_type_class_unref() from a &#35;GTypeClassCacheFunc function
         * <br>to prevent infinite recursion, use g_type_class_unref_uncached() instead.
         * <br>
         * <br>The functions have to check the class id passed in to figure
         * <br>whether they actually want to cache the class of this type, since all
         * <br>classes are routed through the same &#35;GTypeClassCacheFunc chain.
         * @param cache_data data that was given to the g_type_add_class_cache_func() call
         * @param g_class The &#35;GTypeClass structure which is    unreferenced
         * @return %TRUE to stop further &#35;GTypeClassCacheFuncs from being  called, %FALSE to continue
        */
        boolean onTypeClassCacheFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer cache_data, @Nonnull TypeClass g_class);
    }
    
    private static JnaGobject.OnTypeClassCacheFunc toOnTypeClassCacheFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTypeClassCacheFunc in) {
        JnaGobject.OnTypeClassCacheFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cache_data, _g_class) -> in.onTypeClassCacheFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_cache_data)), new TypeClass(new PointerContainer(_g_class)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTypeInterfaceCheckFunc {
        /**
         * A callback called after an interface vtable is initialized.
         * <br>
         * <br>See g_type_add_interface_check().
         * @param check_data data passed to g_type_add_interface_check()
         * @param g_iface the interface that has been    initialized
        */
        void onTypeInterfaceCheckFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer check_data, @Nonnull ch.bailu.gtk.type.Pointer g_iface);
    }
    
    private static JnaGobject.OnTypeInterfaceCheckFunc toOnTypeInterfaceCheckFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTypeInterfaceCheckFunc in) {
        JnaGobject.OnTypeInterfaceCheckFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_check_data, _g_iface) -> in.onTypeInterfaceCheckFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_check_data)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_g_iface)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnClassInitFunc {
        /**
         * A callback function used by the type system to initialize the class
         * <br>of a specific type.
         * <br>
         * <br>This function should initialize all static class members.
         * <br>
         * <br>The initialization process of a class involves:
         * <br>
         * <br>- Copying common members from the parent class over to the
         * <br>  derived class structure.
         * <br>- Zero initialization of the remaining members not copied
         * <br>  over from the parent class.
         * <br>- Invocation of the GBaseInitFunc() initializers of all parent
         * <br>  types and the class' type.
         * <br>- Invocation of the class' GClassInitFunc() initializer.
         * <br>
         * <br>Since derived classes are partially initialized through a memory copy
         * <br>of the parent class, the general rule is that GBaseInitFunc() and
         * <br>GBaseFinalizeFunc() should take care of necessary reinitialization
         * <br>and release of those class members that were introduced by the type
         * <br>that specified these GBaseInitFunc()/GBaseFinalizeFunc().
         * <br>GClassInitFunc() should only care about initializing static
         * <br>class members, while dynamic class members (such as allocated strings
         * <br>or reference counted resources) are better handled by a GBaseInitFunc()
         * <br>for this type, so proper initialization of the dynamic class members
         * <br>is performed for class initialization of derived types as well.
         * <br>
         * <br>An example may help to correspond the intend of the different class
         * <br>initializers:
         * <br>
         * <pre>&lt;!-- language=&quot;C&quot; --&gt;
         * typedef struct {
         *   GObjectClass parent_class;
         *   gint         static_integer;
         *   gchar       *dynamic_string;
         * } TypeAClass;
         * static void
         * type_a_base_class_init (TypeAClass *class)
         * {
         *   class-&gt;dynamic_string = g_strdup (&quot;some string&quot;);
         * }
         * static void
         * type_a_base_class_finalize (TypeAClass *class)
         * {
         *   g_free (class-&gt;dynamic_string);
         * }
         * static void
         * type_a_class_init (TypeAClass *class)
         * {
         *   class-&gt;static_integer = 42;
         * }
         * 
         * typedef struct {
         *   TypeAClass   parent_class;
         *   gfloat       static_float;
         *   GString     *dynamic_gstring;
         * } TypeBClass;
         * static void
         * type_b_base_class_init (TypeBClass *class)
         * {
         *   class-&gt;dynamic_gstring = g_string_new (&quot;some other string&quot;);
         * }
         * static void
         * type_b_base_class_finalize (TypeBClass *class)
         * {
         *   g_string_free (class-&gt;dynamic_gstring);
         * }
         * static void
         * type_b_class_init (TypeBClass *class)
         * {
         *   class-&gt;static_float = 3.14159265358979323846;
         * }
         * </pre>
         * <br>
         * <br>Initialization of TypeBClass will first cause initialization of
         * <br>TypeAClass (derived classes reference their parent classes, see
         * <br>g_type_class_ref() on this).
         * <br>
         * <br>Initialization of TypeAClass roughly involves zero-initializing its fields,
         * <br>then calling its GBaseInitFunc() type_a_base_class_init() to allocate
         * <br>its dynamic members (dynamic_string), and finally calling its GClassInitFunc()
         * <br>type_a_class_init() to initialize its static members (static_integer).
         * <br>The first step in the initialization process of TypeBClass is then
         * <br>a plain memory copy of the contents of TypeAClass into TypeBClass and
         * <br>zero-initialization of the remaining fields in TypeBClass.
         * <br>The dynamic members of TypeAClass within TypeBClass now need
         * <br>reinitialization which is performed by calling type_a_base_class_init()
         * <br>with an argument of TypeBClass.
         * <br>
         * <br>After that, the GBaseInitFunc() of TypeBClass, type_b_base_class_init()
         * <br>is called to allocate the dynamic members of TypeBClass (dynamic_gstring),
         * <br>and finally the GClassInitFunc() of TypeBClass, type_b_class_init(),
         * <br>is called to complete the initialization process with the static members
         * <br>(static_float).
         * <br>
         * <br>Corresponding finalization counter parts to the GBaseInitFunc() functions
         * <br>have to be provided to release allocated resources at class finalization
         * <br>time.
         * @param g_class The &#35;GTypeClass structure to initialize.
         * @param class_data The &#64;class_data member supplied via the &#35;GTypeInfo structure.
        */
        void onClassInitFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer g_class, @Nullable ch.bailu.gtk.type.Pointer class_data);
    }
    
    private static JnaGobject.OnClassInitFunc toOnClassInitFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnClassInitFunc in) {
        JnaGobject.OnClassInitFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_g_class, _class_data) -> in.onClassInitFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_g_class)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_class_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnInstanceInitFunc {
        /**
         * A callback function used by the type system to initialize a new
         * <br>instance of a type.
         * <br>
         * <br>This function initializes all instance members and allocates any resources
         * <br>required by it.
         * <br>
         * <br>Initialization of a derived instance involves calling all its parent
         * <br>types instance initializers, so the class member of the instance
         * <br>is altered during its initialization to always point to the class that
         * <br>belongs to the type the current initializer was introduced for.
         * <br>
         * <br>The extended members of &#64;instance are guaranteed to have been filled with
         * <br>zeros before this function is called.
         * @param instance The instance to initialize
         * @param g_class The class of the type the instance is    created for
        */
        void onInstanceInitFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TypeInstance instance, @Nonnull ch.bailu.gtk.type.Pointer g_class);
    }
    
    private static JnaGobject.OnInstanceInitFunc toOnInstanceInitFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnInstanceInitFunc in) {
        JnaGobject.OnInstanceInitFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_instance, _g_class) -> in.onInstanceInitFunc(__callback, new TypeInstance(new PointerContainer(_instance)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_g_class)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnValueTransform {
        /**
         * The type of value transformation functions which can be registered with
         * <br>g_value_register_transform_func().
         * <br>
         * <br>&#64;dest_value will be initialized to the correct destination type.
         * @param src_value Source value.
         * @param dest_value Target value.
        */
        void onValueTransform(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Value src_value, @Nonnull Value dest_value);
    }
    
    private static JnaGobject.OnValueTransform toOnValueTransform(ch.bailu.gtk.type.Pointer instance, String methodName, OnValueTransform in) {
        JnaGobject.OnValueTransform out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_src_value, _dest_value) -> in.onValueTransform(__callback, new Value(new PointerContainer(_src_value)), new Value(new PointerContainer(_dest_value)));
            __callback.register(out);
        }
        return out;
    }

    /**
     * Provide a copy of a boxed structure &#64;src_boxed which is of type &#64;boxed_type.
     * @param boxed_type The type of &#64;src_boxed.
     * @param src_boxed The boxed structure to be copied.
     * @return The newly created copy of the boxed    structure.
    */
    public static ch.bailu.gtk.type.Pointer boxedCopy(long boxed_type, @Nonnull ch.bailu.gtk.type.Pointer src_boxed)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGobject.INST().g_boxed_copy(boxed_type, asCPointerNotNull(src_boxed))));
    }

    /**
     * Free the boxed structure &#64;boxed which is of type &#64;boxed_type.
     * @param boxed_type The type of &#64;boxed.
     * @param boxed The boxed structure to be freed.
    */
    public static void boxedFree(long boxed_type, @Nonnull ch.bailu.gtk.type.Pointer boxed)  {
        JnaGobject.INST().g_boxed_free(boxed_type, asCPointerNotNull(boxed));
    }

    /**
     * This function creates a new %G_TYPE_BOXED derived type id for a new
     * <br>boxed type with name &#64;name.
     * <br>
     * <br>Boxed type handling functions have to be provided to copy and free
     * <br>opaque boxed structures of this type.
     * <br>
     * <br>For the general case, it is recommended to use G_DEFINE_BOXED_TYPE()
     * <br>instead of calling g_boxed_type_register_static() directly. The macro
     * <br>will create the appropriate `*_get_type()` function for the boxed type.
     * @param name Name of the new boxed type.
     * @param boxed_copy Boxed structure copy function.
     * @param boxed_free Boxed structure free function.
     * @return New %G_TYPE_BOXED derived type id for &#64;name.
    */
    public static long boxedTypeRegisterStatic(@Nonnull ch.bailu.gtk.type.Str name, OnBoxedCopyFunc boxed_copy, OnBoxedFreeFunc boxed_free)  {
        return JnaGobject.INST().g_boxed_type_register_static(asCPointerNotNull(name), toOnBoxedCopyFunc(getClassHandler().getInstance(), "boxedTypeRegisterStatic", boxed_copy), toOnBoxedFreeFunc(getClassHandler().getInstance(), "boxedTypeRegisterStatic", boxed_free));
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
    public static void cclosureMarshalBooleanBoxedBoxed(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_BOOLEAN__BOXED_BOXED(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalBooleanFlags(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_BOOLEAN__FLAGS(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalStringObjectPointer(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_STRING__OBJECT_POINTER(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidBoolean(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__BOOLEAN(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidBoxed(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__BOXED(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidChar(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__CHAR(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidDouble(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__DOUBLE(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidEnum(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__ENUM(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidFlags(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__FLAGS(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidFloat(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__FLOAT(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidInt(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__INT(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidLong(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__LONG(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidObject(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__OBJECT(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidParam(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__PARAM(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidPointer(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__POINTER(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidString(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__STRING(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidUchar(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__UCHAR(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidUint(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__UINT(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidUintPointer(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__UINT_POINTER(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidUlong(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__ULONG(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidVariant(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__VARIANT(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalVoidVoid(@Nonnull Closure closure, @Nonnull Value return_value, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_VOID__VOID(asCPointerNotNull(closure), asCPointerNotNull(return_value), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static void cclosureMarshalGeneric(@Nonnull Closure closure, @Nonnull Value return_gvalue, int n_param_values, @Nonnull Value param_values, @Nullable ch.bailu.gtk.type.Pointer invocation_hint, @Nullable ch.bailu.gtk.type.Pointer marshal_data)  {
        JnaGobject.INST().g_cclosure_marshal_generic(asCPointerNotNull(closure), asCPointerNotNull(return_gvalue), n_param_values, asCPointerNotNull(param_values), asCPointer(invocation_hint), asCPointer(marshal_data));
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
    public static Closure cclosureNew(OnCallback callback_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnClosureNotify destroy_data)  {
        return new Closure(new PointerContainer(JnaGobject.INST().g_cclosure_new(toOnCallback(getClassHandler().getInstance(), "cclosureNew", callback_func), asCPointer(user_data), toOnClosureNotify(getClassHandler().getInstance(), "cclosureNew", destroy_data))));
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
    public static Closure cclosureNewObject(OnCallback callback_func, @Nonnull Object object)  {
        return new Closure(new PointerContainer(JnaGobject.INST().g_cclosure_new_object(toOnCallback(getClassHandler().getInstance(), "cclosureNewObject", callback_func), asCPointerNotNull(object))));
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
    public static Closure cclosureNewObjectSwap(OnCallback callback_func, @Nonnull Object object)  {
        return new Closure(new PointerContainer(JnaGobject.INST().g_cclosure_new_object_swap(toOnCallback(getClassHandler().getInstance(), "cclosureNewObjectSwap", callback_func), asCPointerNotNull(object))));
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
    public static Closure cclosureNewSwap(OnCallback callback_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnClosureNotify destroy_data)  {
        return new Closure(new PointerContainer(JnaGobject.INST().g_cclosure_new_swap(toOnCallback(getClassHandler().getInstance(), "cclosureNewSwap", callback_func), asCPointer(user_data), toOnClosureNotify(getClassHandler().getInstance(), "cclosureNewSwap", destroy_data))));
    }

    /**
     * This function is meant to be called from the `complete_type_info`
     * <br>function of a &#35;GTypePlugin implementation, as in the following
     * <br>example:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * static void
     * my_enum_complete_type_info (GTypePlugin     *plugin,
     *                             GType            g_type,
     *                             GTypeInfo       *info,
     *                             GTypeValueTable *value_table)
     * {
     *   static const GEnumValue values[] = {
     *     { MY_ENUM_FOO, &quot;MY_ENUM_FOO&quot;, &quot;foo&quot; },
     *     { MY_ENUM_BAR, &quot;MY_ENUM_BAR&quot;, &quot;bar&quot; },
     *     { 0, NULL, NULL }
     *   };
     * 
     *   g_enum_complete_type_info (type, info, values);
     * }
     * </pre>
     * @param g_enum_type the type identifier of the type being completed
     * @param info the &#35;GTypeInfo struct to be filled in
     * @param const_values An array of &#35;GEnumValue structs for the possible  enumeration values. The array is terminated by a struct with all  members being 0.
    */
    public static void enumCompleteTypeInfo(long g_enum_type, @Nonnull TypeInfo info, @Nonnull EnumValue const_values)  {
        JnaGobject.INST().g_enum_complete_type_info(g_enum_type, asCPointerNotNull(info), asCPointerNotNull(const_values));
    }

    /**
     * Returns the &#35;GEnumValue for a value.
     * @param enum_class a &#35;GEnumClass
     * @param value the value to look up
     * @return the &#35;GEnumValue for &#64;value, or %NULL          if &#64;value is not a member of the enumeration
    */
    public static EnumValue enumGetValue(@Nonnull EnumClass enum_class, int value)  {
        return new EnumValue(new PointerContainer(JnaGobject.INST().g_enum_get_value(asCPointerNotNull(enum_class), value)));
    }

    /**
     * Looks up a &#35;GEnumValue by name.
     * @param enum_class a &#35;GEnumClass
     * @param name the name to look up
     * @return the &#35;GEnumValue with name &#64;name,          or %NULL if the enumeration doesn't have a member          with that name
    */
    public static EnumValue enumGetValueByName(@Nonnull EnumClass enum_class, @Nonnull ch.bailu.gtk.type.Str name)  {
        return new EnumValue(new PointerContainer(JnaGobject.INST().g_enum_get_value_by_name(asCPointerNotNull(enum_class), asCPointerNotNull(name))));
    }

    /**
     * Looks up a &#35;GEnumValue by nickname.
     * @param enum_class a &#35;GEnumClass
     * @param nick the nickname to look up
     * @return the &#35;GEnumValue with nickname &#64;nick,          or %NULL if the enumeration doesn't have a member          with that nickname
    */
    public static EnumValue enumGetValueByNick(@Nonnull EnumClass enum_class, @Nonnull ch.bailu.gtk.type.Str nick)  {
        return new EnumValue(new PointerContainer(JnaGobject.INST().g_enum_get_value_by_nick(asCPointerNotNull(enum_class), asCPointerNotNull(nick))));
    }

    /**
     * Registers a new static enumeration type with the name &#64;name.
     * <br>
     * <br>It is normally more convenient to let [glib-mkenums][glib-mkenums],
     * <br>generate a my_enum_get_type() function from a usual C enumeration
     * <br>definition  than to write one yourself using g_enum_register_static().
     * @param name A nul-terminated string used as the name of the new type.
     * @param const_static_values An array of &#35;GEnumValue structs for the possible  enumeration values. The array is terminated by a struct with all  members being 0. GObject keeps a reference to the data, so it cannot  be stack-allocated.
     * @return The new type identifier.
    */
    public static long enumRegisterStatic(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull EnumValue const_static_values)  {
        return JnaGobject.INST().g_enum_register_static(asCPointerNotNull(name), asCPointerNotNull(const_static_values));
    }

    /**
     * Pretty-prints &#64;value in the form of the enum’s name.
     * <br>
     * <br>This is intended to be used for debugging purposes. The format of the output
     * <br>may change in the future.
     * @param g_enum_type the type identifier of a &#35;GEnumClass type
     * @param value the value
     * @return a newly-allocated text string
    */
    public static ch.bailu.gtk.type.Str enumToString(long g_enum_type, int value)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGobject.INST().g_enum_to_string(g_enum_type, value)));
    }

    /**
     * This function is meant to be called from the complete_type_info()
     * <br>function of a &#35;GTypePlugin implementation, see the example for
     * <br>g_enum_complete_type_info() above.
     * @param g_flags_type the type identifier of the type being completed
     * @param info the &#35;GTypeInfo struct to be filled in
     * @param const_values An array of &#35;GFlagsValue structs for the possible  enumeration values. The array is terminated by a struct with all  members being 0.
    */
    public static void flagsCompleteTypeInfo(long g_flags_type, @Nonnull TypeInfo info, @Nonnull FlagsValue const_values)  {
        JnaGobject.INST().g_flags_complete_type_info(g_flags_type, asCPointerNotNull(info), asCPointerNotNull(const_values));
    }

    /**
     * Returns the first &#35;GFlagsValue which is set in &#64;value.
     * @param flags_class a &#35;GFlagsClass
     * @param value the value
     * @return the first &#35;GFlagsValue which is set in          &#64;value, or %NULL if none is set
    */
    public static FlagsValue flagsGetFirstValue(@Nonnull FlagsClass flags_class, int value)  {
        return new FlagsValue(new PointerContainer(JnaGobject.INST().g_flags_get_first_value(asCPointerNotNull(flags_class), value)));
    }

    /**
     * Looks up a &#35;GFlagsValue by name.
     * @param flags_class a &#35;GFlagsClass
     * @param name the name to look up
     * @return the &#35;GFlagsValue with name &#64;name,          or %NULL if there is no flag with that name
    */
    public static FlagsValue flagsGetValueByName(@Nonnull FlagsClass flags_class, @Nonnull ch.bailu.gtk.type.Str name)  {
        return new FlagsValue(new PointerContainer(JnaGobject.INST().g_flags_get_value_by_name(asCPointerNotNull(flags_class), asCPointerNotNull(name))));
    }

    /**
     * Looks up a &#35;GFlagsValue by nickname.
     * @param flags_class a &#35;GFlagsClass
     * @param nick the nickname to look up
     * @return the &#35;GFlagsValue with nickname &#64;nick,          or %NULL if there is no flag with that nickname
    */
    public static FlagsValue flagsGetValueByNick(@Nonnull FlagsClass flags_class, @Nonnull ch.bailu.gtk.type.Str nick)  {
        return new FlagsValue(new PointerContainer(JnaGobject.INST().g_flags_get_value_by_nick(asCPointerNotNull(flags_class), asCPointerNotNull(nick))));
    }

    /**
     * Registers a new static flags type with the name &#64;name.
     * <br>
     * <br>It is normally more convenient to let [glib-mkenums][glib-mkenums]
     * <br>generate a my_flags_get_type() function from a usual C enumeration
     * <br>definition than to write one yourself using g_flags_register_static().
     * @param name A nul-terminated string used as the name of the new type.
     * @param const_static_values An array of &#35;GFlagsValue structs for the possible  flags values. The array is terminated by a struct with all members being 0.  GObject keeps a reference to the data, so it cannot be stack-allocated.
     * @return The new type identifier.
    */
    public static long flagsRegisterStatic(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull FlagsValue const_static_values)  {
        return JnaGobject.INST().g_flags_register_static(asCPointerNotNull(name), asCPointerNotNull(const_static_values));
    }

    /**
     * Pretty-prints &#64;value in the form of the flag names separated by ` | ` and
     * <br>sorted. Any extra bits will be shown at the end as a hexadecimal number.
     * <br>
     * <br>This is intended to be used for debugging purposes. The format of the output
     * <br>may change in the future.
     * @param flags_type the type identifier of a &#35;GFlagsClass type
     * @param value the value
     * @return a newly-allocated text string
    */
    public static ch.bailu.gtk.type.Str flagsToString(long flags_type, int value)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGobject.INST().g_flags_to_string(flags_type, value)));
    }

    /**
     * 
     * @return 
    */
    public static long gtypeGetType()  {
        return JnaGobject.INST().g_gtype_get_type();
    }

    /**
     * Creates a new &#35;GParamSpecBoolean instance specifying a %G_TYPE_BOOLEAN
     * <br>property. In many cases, it may be more appropriate to use an enum with
     * <br>g_param_spec_enum(), both to improve code clarity by using explicitly named
     * <br>values, and to allow for more values to be added in future without breaking
     * <br>API.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecBoolean(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, boolean default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_boolean(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecBoxed instance specifying a %G_TYPE_BOXED
     * <br>derived property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param boxed_type %G_TYPE_BOXED derived type of this property
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecBoxed(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, long boxed_type, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_boxed(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), boxed_type, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecChar instance specifying a %G_TYPE_CHAR property.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecChar(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, int minimum, int maximum, int default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_char(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), minimum, maximum, default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecDouble instance specifying a %G_TYPE_DOUBLE
     * <br>property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecDouble(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, double minimum, double maximum, double default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_double(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), minimum, maximum, default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecEnum instance specifying a %G_TYPE_ENUM
     * <br>property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param enum_type a &#35;GType derived from %G_TYPE_ENUM
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecEnum(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, long enum_type, int default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_enum(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), enum_type, default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecFlags instance specifying a %G_TYPE_FLAGS
     * <br>property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param flags_type a &#35;GType derived from %G_TYPE_FLAGS
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecFlags(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, long flags_type, int default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_flags(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), flags_type, default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecFloat instance specifying a %G_TYPE_FLOAT property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecFloat(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, float minimum, float maximum, float default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_float(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), minimum, maximum, default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecGType instance specifying a
     * <br>%G_TYPE_GTYPE property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param is_a_type a &#35;GType whose subtypes are allowed as values  of the property (use %G_TYPE_NONE for any type)
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecGtype(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, long is_a_type, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_gtype(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), is_a_type, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecInt instance specifying a %G_TYPE_INT property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecInt(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, int minimum, int maximum, int default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_int(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), minimum, maximum, default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecInt64 instance specifying a %G_TYPE_INT64 property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecInt64(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, long minimum, long maximum, long default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_int64(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), minimum, maximum, default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecLong instance specifying a %G_TYPE_LONG property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecLong(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, long minimum, long maximum, long default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_long(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), minimum, maximum, default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecBoxed instance specifying a %G_TYPE_OBJECT
     * <br>derived property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param object_type %G_TYPE_OBJECT derived type of this property
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecObject(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, long object_type, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_object(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), object_type, flags)));
    }

    /**
     * Creates a new property of type &#35;GParamSpecOverride. This is used
     * <br>to direct operations to another paramspec, and will not be directly
     * <br>useful unless you are implementing a new base type similar to GObject.
     * @param name the name of the property.
     * @param overridden The property that is being overridden
     * @return the newly created &#35;GParamSpec
    */
    public static ParamSpec paramSpecOverride(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull ParamSpec overridden)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_override(asCPointerNotNull(name), asCPointerNotNull(overridden))));
    }

    /**
     * Creates a new &#35;GParamSpecParam instance specifying a %G_TYPE_PARAM
     * <br>property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param param_type a &#35;GType derived from %G_TYPE_PARAM
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecParam(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, long param_type, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_param(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), param_type, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecPointer instance specifying a pointer property.
     * <br>Where possible, it is better to use g_param_spec_object() or
     * <br>g_param_spec_boxed() to expose memory management information.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecPointer(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_pointer(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), flags)));
    }

    /**
     * Creates a new &#35;GParamSpecString instance.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecString(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, @Nullable ch.bailu.gtk.type.Str default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_string(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), asCPointer(default_value), flags)));
    }

    /**
     * Creates a new &#35;GParamSpecUChar instance specifying a %G_TYPE_UCHAR property.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecUchar(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, int minimum, int maximum, int default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_uchar(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), minimum, maximum, default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecUInt instance specifying a %G_TYPE_UINT property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecUint(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, int minimum, int maximum, int default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_uint(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), minimum, maximum, default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecUInt64 instance specifying a %G_TYPE_UINT64
     * <br>property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecUint64(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, long minimum, long maximum, long default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_uint64(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), minimum, maximum, default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecULong instance specifying a %G_TYPE_ULONG
     * <br>property.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecUlong(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, long minimum, long maximum, long default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_ulong(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), minimum, maximum, default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecUnichar instance specifying a %G_TYPE_UINT
     * <br>property. &#35;GValue structures for this property can be accessed with
     * <br>g_value_set_uint() and g_value_get_uint().
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param default_value default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecUnichar(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, byte default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_unichar(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), default_value, flags)));
    }

    /**
     * Creates a new &#35;GParamSpecValueArray instance specifying a
     * <br>%G_TYPE_VALUE_ARRAY property. %G_TYPE_VALUE_ARRAY is a
     * <br>%G_TYPE_BOXED type, as such, &#35;GValue structures for this property
     * <br>can be accessed with g_value_set_boxed() and g_value_get_boxed().
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param element_spec a &#35;GParamSpec describing the elements contained in  arrays of this property, may be %NULL
     * @param flags flags for the property specified
     * @return a newly created parameter specification
    */
    public static ParamSpec paramSpecValueArray(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, @Nonnull ParamSpec element_spec, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_value_array(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), asCPointerNotNull(element_spec), flags)));
    }

    /**
     * Creates a new &#35;GParamSpecVariant instance specifying a &#35;GVariant
     * <br>property.
     * <br>
     * <br>If &#64;default_value is floating, it is consumed.
     * <br>
     * <br>See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param type a &#35;GVariantType
     * @param default_value a &#35;GVariant of type &#64;type to                 use as the default value, or %NULL
     * @param flags flags for the property specified
     * @return the newly created &#35;GParamSpec
    */
    public static ParamSpec paramSpecVariant(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str nick, @Nullable ch.bailu.gtk.type.Str blurb, @Nonnull ch.bailu.gtk.glib.VariantType type, @Nullable ch.bailu.gtk.glib.Variant default_value, int flags)  {
        return new ParamSpec(new PointerContainer(JnaGobject.INST().g_param_spec_variant(asCPointerNotNull(name), asCPointer(nick), asCPointer(blurb), asCPointerNotNull(type), asCPointer(default_value), flags)));
    }

    /**
     * Registers &#64;name as the name of a new static type derived
     * <br>from %G_TYPE_PARAM.
     * <br>
     * <br>The type system uses the information contained in the &#35;GParamSpecTypeInfo
     * <br>structure pointed to by &#64;info to manage the &#35;GParamSpec type and its
     * <br>instances.
     * @param name 0-terminated string used as the name of the new &#35;GParamSpec type.
     * @param pspec_info The &#35;GParamSpecTypeInfo for this &#35;GParamSpec type.
     * @return The new type identifier.
    */
    public static long paramTypeRegisterStatic(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull ParamSpecTypeInfo pspec_info)  {
        return JnaGobject.INST().g_param_type_register_static(asCPointerNotNull(name), asCPointerNotNull(pspec_info));
    }

    /**
     * Transforms &#64;src_value into &#64;dest_value if possible, and then
     * <br>validates &#64;dest_value, in order for it to conform to &#64;pspec.  If
     * <br>&#64;strict_validation is %TRUE this function will only succeed if the
     * <br>transformed &#64;dest_value complied to &#64;pspec without modifications.
     * <br>
     * <br>See also g_value_type_transformable(), g_value_transform() and
     * <br>g_param_value_validate().
     * @param pspec a valid &#35;GParamSpec
     * @param src_value source &#35;GValue
     * @param dest_value destination &#35;GValue of correct type for &#64;pspec
     * @param strict_validation %TRUE requires &#64;dest_value to conform to &#64;pspec without modifications
     * @return %TRUE if transformation and validation were successful,  %FALSE otherwise and &#64;dest_value is left untouched.
    */
    public static boolean paramValueConvert(@Nonnull ParamSpec pspec, @Nonnull Value src_value, @Nonnull Value dest_value, boolean strict_validation)  {
        return JnaGobject.INST().g_param_value_convert(asCPointerNotNull(pspec), asCPointerNotNull(src_value), asCPointerNotNull(dest_value), strict_validation);
    }

    /**
     * Checks whether &#64;value contains the default value as specified in &#64;pspec.
     * @param pspec a valid &#35;GParamSpec
     * @param value a &#35;GValue of correct type for &#64;pspec
     * @return whether &#64;value contains the canonical default for this &#64;pspec
    */
    public static boolean paramValueDefaults(@Nonnull ParamSpec pspec, @Nonnull Value value)  {
        return JnaGobject.INST().g_param_value_defaults(asCPointerNotNull(pspec), asCPointerNotNull(value));
    }

    /**
     * Return whether the contents of &#64;value comply with the specifications
     * <br>set out by &#64;pspec.
     * @param pspec a valid &#35;GParamSpec
     * @param value a &#35;GValue of correct type for &#64;pspec
     * @return whether the contents of &#64;value comply with the specifications   set out by &#64;pspec.
    */
    public static boolean paramValueIsValid(@Nonnull ParamSpec pspec, @Nonnull Value value)  {
        return JnaGobject.INST().g_param_value_is_valid(asCPointerNotNull(pspec), asCPointerNotNull(value));
    }

    /**
     * Sets &#64;value to its default value as specified in &#64;pspec.
     * @param pspec a valid &#35;GParamSpec
     * @param value a &#35;GValue of correct type for &#64;pspec; since 2.64, you   can also pass an empty &#35;GValue, initialized with %G_VALUE_INIT
    */
    public static void paramValueSetDefault(@Nonnull ParamSpec pspec, @Nonnull Value value)  {
        JnaGobject.INST().g_param_value_set_default(asCPointerNotNull(pspec), asCPointerNotNull(value));
    }

    /**
     * Ensures that the contents of &#64;value comply with the specifications
     * <br>set out by &#64;pspec. For example, a &#35;GParamSpecInt might require
     * <br>that integers stored in &#64;value may not be smaller than -42 and not be
     * <br>greater than +42. If &#64;value contains an integer outside of this range,
     * <br>it is modified accordingly, so the resulting value will fit into the
     * <br>range -42 .. +42.
     * @param pspec a valid &#35;GParamSpec
     * @param value a &#35;GValue of correct type for &#64;pspec
     * @return whether modifying &#64;value was necessary to ensure validity
    */
    public static boolean paramValueValidate(@Nonnull ParamSpec pspec, @Nonnull Value value)  {
        return JnaGobject.INST().g_param_value_validate(asCPointerNotNull(pspec), asCPointerNotNull(value));
    }

    /**
     * Compares &#64;value1 with &#64;value2 according to &#64;pspec, and return -1, 0 or +1,
     * <br>if &#64;value1 is found to be less than, equal to or greater than &#64;value2,
     * <br>respectively.
     * @param pspec a valid &#35;GParamSpec
     * @param value1 a &#35;GValue of correct type for &#64;pspec
     * @param value2 a &#35;GValue of correct type for &#64;pspec
     * @return -1, 0 or +1, for a less than, equal to or greater than result
    */
    public static int paramValuesCmp(@Nonnull ParamSpec pspec, @Nonnull Value value1, @Nonnull Value value2)  {
        return JnaGobject.INST().g_param_values_cmp(asCPointerNotNull(pspec), asCPointerNotNull(value1), asCPointerNotNull(value2));
    }

    /**
     * Creates a new %G_TYPE_POINTER derived type id for a new
     * <br>pointer type with name &#64;name.
     * @param name the name of the new pointer type.
     * @return a new %G_TYPE_POINTER derived type id for &#64;name.
    */
    public static long pointerTypeRegisterStatic(@Nonnull ch.bailu.gtk.type.Str name)  {
        return JnaGobject.INST().g_pointer_type_register_static(asCPointerNotNull(name));
    }

    /**
     * A predefined &#35;GSignalAccumulator for signals intended to be used as a
     * <br>hook for application code to provide a particular value.  Usually
     * <br>only one such value is desired and multiple handlers for the same
     * <br>signal don't make much sense (except for the case of the default
     * <br>handler defined in the class structure, in which case you will
     * <br>usually want the signal connection to override the class handler).
     * <br>
     * <br>This accumulator will use the return value from the first signal
     * <br>handler that is run as the return value for the signal and not run
     * <br>any further handlers (ie: the first handler &quot;wins&quot;).
     * @param ihint standard &#35;GSignalAccumulator parameter
     * @param return_accu standard &#35;GSignalAccumulator parameter
     * @param handler_return standard &#35;GSignalAccumulator parameter
     * @param dummy standard &#35;GSignalAccumulator parameter
     * @return standard &#35;GSignalAccumulator result
    */
    public static boolean signalAccumulatorFirstWins(@Nonnull SignalInvocationHint ihint, @Nonnull Value return_accu, @Nonnull Value handler_return, @Nullable ch.bailu.gtk.type.Pointer dummy)  {
        return JnaGobject.INST().g_signal_accumulator_first_wins(asCPointerNotNull(ihint), asCPointerNotNull(return_accu), asCPointerNotNull(handler_return), asCPointer(dummy));
    }

    /**
     * A predefined &#35;GSignalAccumulator for signals that return a
     * <br>boolean values. The behavior that this accumulator gives is
     * <br>that a return of %TRUE stops the signal emission: no further
     * <br>callbacks will be invoked, while a return of %FALSE allows
     * <br>the emission to continue. The idea here is that a %TRUE return
     * <br>indicates that the callback handled the signal, and no further
     * <br>handling is needed.
     * @param ihint standard &#35;GSignalAccumulator parameter
     * @param return_accu standard &#35;GSignalAccumulator parameter
     * @param handler_return standard &#35;GSignalAccumulator parameter
     * @param dummy standard &#35;GSignalAccumulator parameter
     * @return standard &#35;GSignalAccumulator result
    */
    public static boolean signalAccumulatorTrueHandled(@Nonnull SignalInvocationHint ihint, @Nonnull Value return_accu, @Nonnull Value handler_return, @Nullable ch.bailu.gtk.type.Pointer dummy)  {
        return JnaGobject.INST().g_signal_accumulator_true_handled(asCPointerNotNull(ihint), asCPointerNotNull(return_accu), asCPointerNotNull(handler_return), asCPointer(dummy));
    }

    /**
     * Calls the original class closure of a signal. This function should
     * <br>only be called from an overridden class closure; see
     * <br>g_signal_override_class_closure() and
     * <br>g_signal_override_class_handler().
     * @param instance the instance the signal is being    emitted on.
     * @param _elipse parameters to be passed to the parent class closure, followed by a  location for the return value. If the return type of the signal  is %G_TYPE_NONE, the return value location can be omitted.
    */
    public static void signalChainFromOverriddenHandler(@Nonnull ch.bailu.gtk.type.Pointer instance, java.lang.Object... _elipse)  {
        JnaGobject.INST().g_signal_chain_from_overridden_handler(asCPointerNotNull(instance), _elipse);
    }

    /**
     * Connects a closure to a signal for a particular object.
     * @param instance the instance to connect to.
     * @param detailed_signal a string of the form &quot;signal-name::detail&quot;.
     * @param closure the closure to connect.
     * @param after whether the handler should be called before or after the  default handler of the signal.
     * @return the handler ID (always greater than 0 for successful connections)
    */
    public static long signalConnectClosure(@Nonnull ch.bailu.gtk.type.Pointer instance, @Nonnull ch.bailu.gtk.type.Str detailed_signal, @Nonnull Closure closure, boolean after)  {
        return JnaGobject.INST().g_signal_connect_closure(asCPointerNotNull(instance), asCPointerNotNull(detailed_signal), asCPointerNotNull(closure), after);
    }

    /**
     * Connects a closure to a signal for a particular object.
     * @param instance the instance to connect to.
     * @param signal_id the id of the signal.
     * @param detail the detail.
     * @param closure the closure to connect.
     * @param after whether the handler should be called before or after the  default handler of the signal.
     * @return the handler ID (always greater than 0 for successful connections)
    */
    public static long signalConnectClosureById(@Nonnull ch.bailu.gtk.type.Pointer instance, int signal_id, int detail, @Nonnull Closure closure, boolean after)  {
        return JnaGobject.INST().g_signal_connect_closure_by_id(asCPointerNotNull(instance), signal_id, detail, asCPointerNotNull(closure), after);
    }

    /**
     * Connects a &#35;GCallback function to a signal for a particular object. Similar
     * <br>to g_signal_connect(), but allows to provide a &#35;GClosureNotify for the data
     * <br>which will be called when the signal handler is disconnected and no longer
     * <br>used. Specify &#64;connect_flags if you need `..._after()` or
     * <br>`..._swapped()` variants of this function.
     * @param instance the instance to connect to.
     * @param detailed_signal a string of the form &quot;signal-name::detail&quot;.
     * @param c_handler the &#35;GCallback to connect.
     * @param data data to pass to &#64;c_handler calls.
     * @param destroy_data a &#35;GClosureNotify for &#64;data.
     * @param connect_flags a combination of &#35;GConnectFlags.
     * @return the handler ID (always greater than 0 for successful connections)
    */
    public static long signalConnectData(@Nonnull ch.bailu.gtk.type.Pointer instance, @Nonnull ch.bailu.gtk.type.Str detailed_signal, OnCallback c_handler, @Nullable ch.bailu.gtk.type.Pointer data, OnClosureNotify destroy_data, int connect_flags)  {
        return JnaGobject.INST().g_signal_connect_data(asCPointerNotNull(instance), asCPointerNotNull(detailed_signal), toOnCallback(getClassHandler().getInstance(), "signalConnectData", c_handler), asCPointer(data), toOnClosureNotify(getClassHandler().getInstance(), "signalConnectData", destroy_data), connect_flags);
    }

    /**
     * This is similar to g_signal_connect_data(), but uses a closure which
     * <br>ensures that the &#64;gobject stays alive during the call to &#64;c_handler
     * <br>by temporarily adding a reference count to &#64;gobject.
     * <br>
     * <br>When the &#64;gobject is destroyed the signal handler will be automatically
     * <br>disconnected.  Note that this is not currently threadsafe (ie:
     * <br>emitting a signal while &#64;gobject is being destroyed in another thread
     * <br>is not safe).
     * @param instance the instance to connect to.
     * @param detailed_signal a string of the form &quot;signal-name::detail&quot;.
     * @param c_handler the &#35;GCallback to connect.
     * @param gobject the object to pass as data    to &#64;c_handler.
     * @param connect_flags a combination of &#35;GConnectFlags.
     * @return the handler id.
    */
    public static long signalConnectObject(@Nonnull ch.bailu.gtk.type.Pointer instance, @Nonnull ch.bailu.gtk.type.Str detailed_signal, OnCallback c_handler, @Nullable ch.bailu.gtk.type.Pointer gobject, int connect_flags)  {
        return JnaGobject.INST().g_signal_connect_object(asCPointerNotNull(instance), asCPointerNotNull(detailed_signal), toOnCallback(getClassHandler().getInstance(), "signalConnectObject", c_handler), asCPointer(gobject), connect_flags);
    }

    /**
     * Emits a signal. Signal emission is done synchronously.
     * <br>The method will only return control after all handlers are called or signal emission was stopped.
     * <br>
     * <br>Note that g_signal_emit() resets the return value to the default
     * <br>if no handlers are connected, in contrast to g_signal_emitv().
     * @param instance the instance the signal is being emitted on.
     * @param signal_id the signal id
     * @param detail the detail
     * @param _elipse parameters to be passed to the signal, followed by a  location for the return value. If the return type of the signal  is %G_TYPE_NONE, the return value location can be omitted.
    */
    public static void signalEmit(@Nonnull ch.bailu.gtk.type.Pointer instance, int signal_id, int detail, java.lang.Object... _elipse)  {
        JnaGobject.INST().g_signal_emit(asCPointerNotNull(instance), signal_id, detail, _elipse);
    }

    /**
     * Emits a signal. Signal emission is done synchronously.
     * <br>The method will only return control after all handlers are called or signal emission was stopped.
     * <br>
     * <br>Note that g_signal_emit_by_name() resets the return value to the default
     * <br>if no handlers are connected, in contrast to g_signal_emitv().
     * @param instance the instance the signal is being emitted on.
     * @param detailed_signal a string of the form &quot;signal-name::detail&quot;.
     * @param _elipse parameters to be passed to the signal, followed by a  location for the return value. If the return type of the signal  is %G_TYPE_NONE, the return value location can be omitted. The  number of parameters to pass to this function is defined when creating the signal.
    */
    public static void signalEmitByName(@Nonnull ch.bailu.gtk.type.Pointer instance, @Nonnull ch.bailu.gtk.type.Str detailed_signal, java.lang.Object... _elipse)  {
        JnaGobject.INST().g_signal_emit_by_name(asCPointerNotNull(instance), asCPointerNotNull(detailed_signal), _elipse);
    }

    /**
     * Returns the invocation hint of the innermost signal emission of instance.
     * @param instance the instance to query
     * @return the invocation hint of the innermost     signal emission, or %NULL if not found.
    */
    public static SignalInvocationHint signalGetInvocationHint(@Nonnull ch.bailu.gtk.type.Pointer instance)  {
        return new SignalInvocationHint(new PointerContainer(JnaGobject.INST().g_signal_get_invocation_hint(asCPointerNotNull(instance))));
    }

    /**
     * Blocks a handler of an instance so it will not be called during any
     * <br>signal emissions unless it is unblocked again. Thus &quot;blocking&quot; a
     * <br>signal handler means to temporarily deactivate it, a signal handler
     * <br>has to be unblocked exactly the same amount of times it has been
     * <br>blocked before to become active again.
     * <br>
     * <br>The &#64;handler_id has to be a valid signal handler id, connected to a
     * <br>signal of &#64;instance.
     * @param instance The instance to block the signal handler of.
     * @param handler_id Handler id of the handler to be blocked.
    */
    public static void signalHandlerBlock(@Nonnull ch.bailu.gtk.type.Pointer instance, long handler_id)  {
        JnaGobject.INST().g_signal_handler_block(asCPointerNotNull(instance), handler_id);
    }

    /**
     * Disconnects a handler from an instance so it will not be called during
     * <br>any future or currently ongoing emissions of the signal it has been
     * <br>connected to. The &#64;handler_id becomes invalid and may be reused.
     * <br>
     * <br>The &#64;handler_id has to be a valid signal handler id, connected to a
     * <br>signal of &#64;instance.
     * @param instance The instance to remove the signal handler from.
     * @param handler_id Handler id of the handler to be disconnected.
    */
    public static void signalHandlerDisconnect(@Nonnull ch.bailu.gtk.type.Pointer instance, long handler_id)  {
        JnaGobject.INST().g_signal_handler_disconnect(asCPointerNotNull(instance), handler_id);
    }

    /**
     * Finds the first signal handler that matches certain selection criteria.
     * <br>The criteria mask is passed as an OR-ed combination of &#35;GSignalMatchType
     * <br>flags, and the criteria values are passed as arguments.
     * <br>The match &#64;mask has to be non-0 for successful matches.
     * <br>If no handler was found, 0 is returned.
     * @param instance The instance owning the signal handler to be found.
     * @param mask Mask indicating which of &#64;signal_id, &#64;detail, &#64;closure, &#64;func  and/or &#64;data the handler has to match.
     * @param signal_id Signal the handler has to be connected to.
     * @param detail Signal detail the handler has to be connected to.
     * @param closure The closure the handler will invoke.
     * @param func The C closure callback of the handler (useless for non-C closures).
     * @param data The closure data of the handler's closure.
     * @return A valid non-0 signal handler id for a successful match.
    */
    public static long signalHandlerFind(@Nonnull ch.bailu.gtk.type.Pointer instance, int mask, int signal_id, int detail, @Nullable Closure closure, @Nullable ch.bailu.gtk.type.Pointer func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaGobject.INST().g_signal_handler_find(asCPointerNotNull(instance), mask, signal_id, detail, asCPointer(closure), asCPointer(func), asCPointer(data));
    }

    /**
     * Returns whether &#64;handler_id is the ID of a handler connected to &#64;instance.
     * @param instance The instance where a signal handler is sought.
     * @param handler_id the handler ID.
     * @return whether &#64;handler_id identifies a handler connected to &#64;instance.
    */
    public static boolean signalHandlerIsConnected(@Nonnull ch.bailu.gtk.type.Pointer instance, long handler_id)  {
        return JnaGobject.INST().g_signal_handler_is_connected(asCPointerNotNull(instance), handler_id);
    }

    /**
     * Undoes the effect of a previous g_signal_handler_block() call.  A
     * <br>blocked handler is skipped during signal emissions and will not be
     * <br>invoked, unblocking it (for exactly the amount of times it has been
     * <br>blocked before) reverts its &quot;blocked&quot; state, so the handler will be
     * <br>recognized by the signal system and is called upon future or
     * <br>currently ongoing signal emissions (since the order in which
     * <br>handlers are called during signal emissions is deterministic,
     * <br>whether the unblocked handler in question is called as part of a
     * <br>currently ongoing emission depends on how far that emission has
     * <br>proceeded yet).
     * <br>
     * <br>The &#64;handler_id has to be a valid id of a signal handler that is
     * <br>connected to a signal of &#64;instance and is currently blocked.
     * @param instance The instance to unblock the signal handler of.
     * @param handler_id Handler id of the handler to be unblocked.
    */
    public static void signalHandlerUnblock(@Nonnull ch.bailu.gtk.type.Pointer instance, long handler_id)  {
        JnaGobject.INST().g_signal_handler_unblock(asCPointerNotNull(instance), handler_id);
    }

    /**
     * Blocks all handlers on an instance that match a certain selection criteria.
     * <br>The criteria mask is passed as an OR-ed combination of &#35;GSignalMatchType
     * <br>flags, and the criteria values are passed as arguments.
     * <br>Passing at least one of the %G_SIGNAL_MATCH_CLOSURE, %G_SIGNAL_MATCH_FUNC
     * <br>or %G_SIGNAL_MATCH_DATA match flags is required for successful matches.
     * <br>If no handlers were found, 0 is returned, the number of blocked handlers
     * <br>otherwise.
     * @param instance The instance to block handlers from.
     * @param mask Mask indicating which of &#64;signal_id, &#64;detail, &#64;closure, &#64;func  and/or &#64;data the handlers have to match.
     * @param signal_id Signal the handlers have to be connected to.
     * @param detail Signal detail the handlers have to be connected to.
     * @param closure The closure the handlers will invoke.
     * @param func The C closure callback of the handlers (useless for non-C closures).
     * @param data The closure data of the handlers' closures.
     * @return The number of handlers that matched.
    */
    public static int signalHandlersBlockMatched(@Nonnull ch.bailu.gtk.type.Pointer instance, int mask, int signal_id, int detail, @Nullable Closure closure, @Nullable ch.bailu.gtk.type.Pointer func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaGobject.INST().g_signal_handlers_block_matched(asCPointerNotNull(instance), mask, signal_id, detail, asCPointer(closure), asCPointer(func), asCPointer(data));
    }

    /**
     * Destroy all signal handlers of a type instance. This function is
     * <br>an implementation detail of the &#35;GObject dispose implementation,
     * <br>and should not be used outside of the type system.
     * @param instance The instance whose signal handlers are destroyed
    */
    public static void signalHandlersDestroy(@Nonnull ch.bailu.gtk.type.Pointer instance)  {
        JnaGobject.INST().g_signal_handlers_destroy(asCPointerNotNull(instance));
    }

    /**
     * Disconnects all handlers on an instance that match a certain
     * <br>selection criteria. The criteria mask is passed as an OR-ed
     * <br>combination of &#35;GSignalMatchType flags, and the criteria values are
     * <br>passed as arguments.  Passing at least one of the
     * <br>%G_SIGNAL_MATCH_CLOSURE, %G_SIGNAL_MATCH_FUNC or
     * <br>%G_SIGNAL_MATCH_DATA match flags is required for successful
     * <br>matches.  If no handlers were found, 0 is returned, the number of
     * <br>disconnected handlers otherwise.
     * @param instance The instance to remove handlers from.
     * @param mask Mask indicating which of &#64;signal_id, &#64;detail, &#64;closure, &#64;func  and/or &#64;data the handlers have to match.
     * @param signal_id Signal the handlers have to be connected to.
     * @param detail Signal detail the handlers have to be connected to.
     * @param closure The closure the handlers will invoke.
     * @param func The C closure callback of the handlers (useless for non-C closures).
     * @param data The closure data of the handlers' closures.
     * @return The number of handlers that matched.
    */
    public static int signalHandlersDisconnectMatched(@Nonnull ch.bailu.gtk.type.Pointer instance, int mask, int signal_id, int detail, @Nullable Closure closure, @Nullable ch.bailu.gtk.type.Pointer func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaGobject.INST().g_signal_handlers_disconnect_matched(asCPointerNotNull(instance), mask, signal_id, detail, asCPointer(closure), asCPointer(func), asCPointer(data));
    }

    /**
     * Unblocks all handlers on an instance that match a certain selection
     * <br>criteria. The criteria mask is passed as an OR-ed combination of
     * <br>&#35;GSignalMatchType flags, and the criteria values are passed as arguments.
     * <br>Passing at least one of the %G_SIGNAL_MATCH_CLOSURE, %G_SIGNAL_MATCH_FUNC
     * <br>or %G_SIGNAL_MATCH_DATA match flags is required for successful matches.
     * <br>If no handlers were found, 0 is returned, the number of unblocked handlers
     * <br>otherwise. The match criteria should not apply to any handlers that are
     * <br>not currently blocked.
     * @param instance The instance to unblock handlers from.
     * @param mask Mask indicating which of &#64;signal_id, &#64;detail, &#64;closure, &#64;func  and/or &#64;data the handlers have to match.
     * @param signal_id Signal the handlers have to be connected to.
     * @param detail Signal detail the handlers have to be connected to.
     * @param closure The closure the handlers will invoke.
     * @param func The C closure callback of the handlers (useless for non-C closures).
     * @param data The closure data of the handlers' closures.
     * @return The number of handlers that matched.
    */
    public static int signalHandlersUnblockMatched(@Nonnull ch.bailu.gtk.type.Pointer instance, int mask, int signal_id, int detail, @Nullable Closure closure, @Nullable ch.bailu.gtk.type.Pointer func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaGobject.INST().g_signal_handlers_unblock_matched(asCPointerNotNull(instance), mask, signal_id, detail, asCPointer(closure), asCPointer(func), asCPointer(data));
    }

    /**
     * Returns whether there are any handlers connected to &#64;instance for the
     * <br>given signal id and detail.
     * <br>
     * <br>If &#64;detail is 0 then it will only match handlers that were connected
     * <br>without detail.  If &#64;detail is non-zero then it will match handlers
     * <br>connected both without detail and with the given detail.  This is
     * <br>consistent with how a signal emitted with &#64;detail would be delivered
     * <br>to those handlers.
     * <br>
     * <br>Since 2.46 this also checks for a non-default class closure being
     * <br>installed, as this is basically always what you want.
     * <br>
     * <br>One example of when you might use this is when the arguments to the
     * <br>signal are difficult to compute. A class implementor may opt to not
     * <br>emit the signal if no one is attached anyway, thus saving the cost
     * <br>of building the arguments.
     * @param instance the object whose signal handlers are sought.
     * @param signal_id the signal id.
     * @param detail the detail.
     * @param may_be_blocked whether blocked handlers should count as match.
     * @return %TRUE if a handler is connected to the signal, %FALSE          otherwise.
    */
    public static boolean signalHasHandlerPending(@Nonnull ch.bailu.gtk.type.Pointer instance, int signal_id, int detail, boolean may_be_blocked)  {
        return JnaGobject.INST().g_signal_has_handler_pending(asCPointerNotNull(instance), signal_id, detail, may_be_blocked);
    }

    /**
     * Validate a signal name. This can be useful for dynamically-generated signals
     * <br>which need to be validated at run-time before actually trying to create them.
     * <br>
     * <br>See [canonical parameter names][canonical-parameter-names] for details of
     * <br>the rules for valid names. The rules for signal names are the same as those
     * <br>for property names.
     * @param name the canonical name of the signal
     * @return %TRUE if &#64;name is a valid signal name, %FALSE otherwise.
    */
    public static boolean signalIsValidName(@Nonnull ch.bailu.gtk.type.Str name)  {
        return JnaGobject.INST().g_signal_is_valid_name(asCPointerNotNull(name));
    }

    /**
     * Given the name of the signal and the type of object it connects to, gets
     * <br>the signal's identifying integer. Emitting the signal by number is
     * <br>somewhat faster than using the name each time.
     * <br>
     * <br>Also tries the ancestors of the given type.
     * <br>
     * <br>The type class passed as &#64;itype must already have been instantiated (for
     * <br>example, using g_type_class_ref()) for this function to work, as signals are
     * <br>always installed during class initialization.
     * <br>
     * <br>See g_signal_new() for details on allowed signal names.
     * @param name the signal's name.
     * @param itype the type that the signal operates on.
     * @return the signal's identifying number, or 0 if no signal was found.
    */
    public static int signalLookup(@Nonnull ch.bailu.gtk.type.Str name, long itype)  {
        return JnaGobject.INST().g_signal_lookup(asCPointerNotNull(name), itype);
    }

    /**
     * Given the signal's identifier, finds its name.
     * <br>
     * <br>Two different signals may have the same name, if they have differing types.
     * @param signal_id the signal's identifying number.
     * @return the signal name, or %NULL if the signal number was invalid.
    */
    public static ch.bailu.gtk.type.Str signalName(int signal_id)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGobject.INST().g_signal_name(signal_id)));
    }

    /**
     * Overrides the class closure (i.e. the default handler) for the given signal
     * <br>for emissions on instances of &#64;instance_type. &#64;instance_type must be derived
     * <br>from the type to which the signal belongs.
     * <br>
     * <br>See g_signal_chain_from_overridden() and
     * <br>g_signal_chain_from_overridden_handler() for how to chain up to the
     * <br>parent class closure from inside the overridden one.
     * @param signal_id the signal id
     * @param instance_type the instance type on which to override the class closure  for the signal.
     * @param class_closure the closure.
    */
    public static void signalOverrideClassClosure(int signal_id, long instance_type, @Nonnull Closure class_closure)  {
        JnaGobject.INST().g_signal_override_class_closure(signal_id, instance_type, asCPointerNotNull(class_closure));
    }

    /**
     * Overrides the class closure (i.e. the default handler) for the
     * <br>given signal for emissions on instances of &#64;instance_type with
     * <br>callback &#64;class_handler. &#64;instance_type must be derived from the
     * <br>type to which the signal belongs.
     * <br>
     * <br>See g_signal_chain_from_overridden() and
     * <br>g_signal_chain_from_overridden_handler() for how to chain up to the
     * <br>parent class closure from inside the overridden one.
     * @param signal_name the name for the signal
     * @param instance_type the instance type on which to override the class handler  for the signal.
     * @param class_handler the handler.
    */
    public static void signalOverrideClassHandler(@Nonnull ch.bailu.gtk.type.Str signal_name, long instance_type, OnCallback class_handler)  {
        JnaGobject.INST().g_signal_override_class_handler(asCPointerNotNull(signal_name), instance_type, toOnCallback(getClassHandler().getInstance(), "signalOverrideClassHandler", class_handler));
    }

    /**
     * Queries the signal system for in-depth information about a
     * <br>specific signal. This function will fill in a user-provided
     * <br>structure to hold signal-specific information. If an invalid
     * <br>signal id is passed in, the &#64;signal_id member of the &#35;GSignalQuery
     * <br>is 0. All members filled into the &#35;GSignalQuery structure should
     * <br>be considered constant and have to be left untouched.
     * @param signal_id The signal id of the signal to query information for.
     * @param query A user provided structure that is  filled in with constant values upon success.
    */
    public static void signalQuery(int signal_id, @Nonnull SignalQuery query)  {
        JnaGobject.INST().g_signal_query(signal_id, asCPointerNotNull(query));
    }

    /**
     * Deletes an emission hook.
     * @param signal_id the id of the signal
     * @param hook_id the id of the emission hook, as returned by  g_signal_add_emission_hook()
    */
    public static void signalRemoveEmissionHook(int signal_id, long hook_id)  {
        JnaGobject.INST().g_signal_remove_emission_hook(signal_id, hook_id);
    }

    /**
     * Stops a signal's current emission.
     * <br>
     * <br>This will prevent the default method from running, if the signal was
     * <br>%G_SIGNAL_RUN_LAST and you connected normally (i.e. without the &quot;after&quot;
     * <br>flag).
     * <br>
     * <br>Prints a warning if used on a signal which isn't being emitted.
     * @param instance the object whose signal handlers you wish to stop.
     * @param signal_id the signal identifier, as returned by g_signal_lookup().
     * @param detail the detail which the signal was emitted with.
    */
    public static void signalStopEmission(@Nonnull ch.bailu.gtk.type.Pointer instance, int signal_id, int detail)  {
        JnaGobject.INST().g_signal_stop_emission(asCPointerNotNull(instance), signal_id, detail);
    }

    /**
     * Stops a signal's current emission.
     * <br>
     * <br>This is just like g_signal_stop_emission() except it will look up the
     * <br>signal id for you.
     * @param instance the object whose signal handlers you wish to stop.
     * @param detailed_signal a string of the form &quot;signal-name::detail&quot;.
    */
    public static void signalStopEmissionByName(@Nonnull ch.bailu.gtk.type.Pointer instance, @Nonnull ch.bailu.gtk.type.Str detailed_signal)  {
        JnaGobject.INST().g_signal_stop_emission_by_name(asCPointerNotNull(instance), asCPointerNotNull(detailed_signal));
    }

    /**
     * Creates a new closure which invokes the function found at the offset
     * <br>&#64;struct_offset in the class structure of the interface or classed type
     * <br>identified by &#64;itype.
     * @param itype the &#35;GType identifier of an interface or classed type
     * @param struct_offset the offset of the member function of &#64;itype's class  structure which is to be invoked by the new closure
     * @return a floating reference to a new &#35;GCClosure
    */
    public static Closure signalTypeCclosureNew(long itype, int struct_offset)  {
        return new Closure(new PointerContainer(JnaGobject.INST().g_signal_type_cclosure_new(itype, struct_offset)));
    }

    /**
     * Set the callback for a source as a &#35;GClosure.
     * <br>
     * <br>If the source is not one of the standard GLib types, the &#64;closure_callback
     * <br>and &#64;closure_marshal fields of the &#35;GSourceFuncs structure must have been
     * <br>filled in with pointers to appropriate functions.
     * @param source the source
     * @param closure a &#35;GClosure
    */
    public static void sourceSetClosure(@Nonnull ch.bailu.gtk.glib.Source source, @Nonnull Closure closure)  {
        JnaGobject.INST().g_source_set_closure(asCPointerNotNull(source), asCPointerNotNull(closure));
    }

    /**
     * Sets a dummy callback for &#64;source. The callback will do nothing, and
     * <br>if the source expects a &#35;gboolean return value, it will return %TRUE.
     * <br>(If the source expects any other type of return value, it will return
     * <br>a 0/%NULL value; whatever g_value_init() initializes a &#35;GValue to for
     * <br>that type.)
     * <br>
     * <br>If the source is not one of the standard GLib types, the
     * <br>&#64;closure_callback and &#64;closure_marshal fields of the &#35;GSourceFuncs
     * <br>structure must have been filled in with pointers to appropriate
     * <br>functions.
     * @param source the source
    */
    public static void sourceSetDummyCallback(@Nonnull ch.bailu.gtk.glib.Source source)  {
        JnaGobject.INST().g_source_set_dummy_callback(asCPointerNotNull(source));
    }

    /**
     * Return a newly allocated string, which describes the contents of a
     * <br>&#35;GValue.  The main purpose of this function is to describe &#35;GValue
     * <br>contents for debugging output, the way in which the contents are
     * <br>described may change between different GLib versions.
     * @param value &#35;GValue which contents are to be described.
     * @return Newly allocated string.
    */
    public static ch.bailu.gtk.type.Str strdupValueContents(@Nonnull Value value)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGobject.INST().g_strdup_value_contents(asCPointerNotNull(value))));
    }

    /**
     * Adds a &#35;GTypeClassCacheFunc to be called before the reference count of a
     * <br>class goes from one to zero. This can be used to prevent premature class
     * <br>destruction. All installed &#35;GTypeClassCacheFunc functions will be chained
     * <br>until one of them returns %TRUE. The functions have to check the class id
     * <br>passed in to figure whether they actually want to cache the class of this
     * <br>type, since all classes are routed through the same &#35;GTypeClassCacheFunc
     * <br>chain.
     * @param cache_data data to be passed to &#64;cache_func
     * @param cache_func a &#35;GTypeClassCacheFunc
    */
    public static void typeAddClassCacheFunc(@Nullable ch.bailu.gtk.type.Pointer cache_data, OnTypeClassCacheFunc cache_func)  {
        JnaGobject.INST().g_type_add_class_cache_func(asCPointer(cache_data), toOnTypeClassCacheFunc(getClassHandler().getInstance(), "typeAddClassCacheFunc", cache_func));
    }

    /**
     * Registers a private class structure for a classed type;
     * <br>when the class is allocated, the private structures for
     * <br>the class and all of its parent types are allocated
     * <br>sequentially in the same memory block as the public
     * <br>structures, and are zero-filled.
     * <br>
     * <br>This function should be called in the
     * <br>type's get_type() function after the type is registered.
     * <br>The private structure can be retrieved using the
     * <br>G_TYPE_CLASS_GET_PRIVATE() macro.
     * @param class_type GType of a classed type
     * @param private_size size of private structure
    */
    public static void typeAddClassPrivate(long class_type, long private_size)  {
        JnaGobject.INST().g_type_add_class_private(class_type, private_size);
    }

    /**
     * 
     * @param class_type 
     * @param private_size 
     * @return 
    */
    public static int typeAddInstancePrivate(long class_type, long private_size)  {
        return JnaGobject.INST().g_type_add_instance_private(class_type, private_size);
    }

    /**
     * Adds a function to be called after an interface vtable is
     * <br>initialized for any class (i.e. after the &#64;interface_init
     * <br>member of &#35;GInterfaceInfo has been called).
     * <br>
     * <br>This function is useful when you want to check an invariant
     * <br>that depends on the interfaces of a class. For instance, the
     * <br>implementation of &#35;GObject uses this facility to check that an
     * <br>object implements all of the properties that are defined on its
     * <br>interfaces.
     * @param check_data data to pass to &#64;check_func
     * @param check_func function to be called after each interface     is initialized
    */
    public static void typeAddInterfaceCheck(@Nullable ch.bailu.gtk.type.Pointer check_data, OnTypeInterfaceCheckFunc check_func)  {
        JnaGobject.INST().g_type_add_interface_check(asCPointer(check_data), toOnTypeInterfaceCheckFunc(getClassHandler().getInstance(), "typeAddInterfaceCheck", check_func));
    }

    /**
     * Adds &#64;interface_type to the dynamic &#64;instance_type. The information
     * <br>contained in the &#35;GTypePlugin structure pointed to by &#64;plugin
     * <br>is used to manage the relationship.
     * @param instance_type &#35;GType value of an instantiatable type
     * @param interface_type &#35;GType value of an interface type
     * @param plugin &#35;GTypePlugin structure to retrieve the &#35;GInterfaceInfo from
    */
    public static void typeAddInterfaceDynamic(long instance_type, long interface_type, @Nonnull TypePlugin plugin)  {
        JnaGobject.INST().g_type_add_interface_dynamic(instance_type, interface_type, asCPointerNotNull(plugin));
    }

    /**
     * Adds &#64;interface_type to the static &#64;instance_type.
     * <br>The information contained in the &#35;GInterfaceInfo structure
     * <br>pointed to by &#64;info is used to manage the relationship.
     * @param instance_type &#35;GType value of an instantiatable type
     * @param interface_type &#35;GType value of an interface type
     * @param info &#35;GInterfaceInfo structure for this        (&#64;instance_type, &#64;interface_type) combination
    */
    public static void typeAddInterfaceStatic(long instance_type, long interface_type, @Nonnull InterfaceInfo info)  {
        JnaGobject.INST().g_type_add_interface_static(instance_type, interface_type, asCPointerNotNull(info));
    }

    /**
     * 
     * @param g_class 
     * @param is_a_type 
     * @return 
    */
    public static TypeClass typeCheckClassCast(@Nonnull TypeClass g_class, long is_a_type)  {
        return new TypeClass(new PointerContainer(JnaGobject.INST().g_type_check_class_cast(asCPointerNotNull(g_class), is_a_type)));
    }

    /**
     * 
     * @param g_class 
     * @param is_a_type 
     * @return 
    */
    public static boolean typeCheckClassIsA(@Nonnull TypeClass g_class, long is_a_type)  {
        return JnaGobject.INST().g_type_check_class_is_a(asCPointerNotNull(g_class), is_a_type);
    }

    /**
     * Private helper function to aid implementation of the
     * <br>G_TYPE_CHECK_INSTANCE() macro.
     * @param instance a valid &#35;GTypeInstance structure
     * @return %TRUE if &#64;instance is valid, %FALSE otherwise
    */
    public static boolean typeCheckInstance(@Nonnull TypeInstance instance)  {
        return JnaGobject.INST().g_type_check_instance(asCPointerNotNull(instance));
    }

    /**
     * 
     * @param instance 
     * @param iface_type 
     * @return 
    */
    public static TypeInstance typeCheckInstanceCast(@Nonnull TypeInstance instance, long iface_type)  {
        return new TypeInstance(new PointerContainer(JnaGobject.INST().g_type_check_instance_cast(asCPointerNotNull(instance), iface_type)));
    }

    /**
     * 
     * @param instance 
     * @param iface_type 
     * @return 
    */
    public static boolean typeCheckInstanceIsA(@Nonnull TypeInstance instance, long iface_type)  {
        return JnaGobject.INST().g_type_check_instance_is_a(asCPointerNotNull(instance), iface_type);
    }

    /**
     * 
     * @param instance 
     * @param fundamental_type 
     * @return 
    */
    public static boolean typeCheckInstanceIsFundamentallyA(@Nonnull TypeInstance instance, long fundamental_type)  {
        return JnaGobject.INST().g_type_check_instance_is_fundamentally_a(asCPointerNotNull(instance), fundamental_type);
    }

    /**
     * 
     * @param type 
     * @return 
    */
    public static boolean typeCheckIsValueType(long type)  {
        return JnaGobject.INST().g_type_check_is_value_type(type);
    }

    /**
     * 
     * @param value 
     * @return 
    */
    public static boolean typeCheckValue(@Nonnull Value value)  {
        return JnaGobject.INST().g_type_check_value(asCPointerNotNull(value));
    }

    /**
     * 
     * @param value 
     * @param type 
     * @return 
    */
    public static boolean typeCheckValueHolds(@Nonnull Value value, long type)  {
        return JnaGobject.INST().g_type_check_value_holds(asCPointerNotNull(value), type);
    }

    /**
     * 
     * @param g_class 
     * @param private_size_or_offset 
    */
    public static void typeClassAdjustPrivateOffset(@Nullable ch.bailu.gtk.type.Pointer g_class, @Nonnull ch.bailu.gtk.type.Int private_size_or_offset)  {
        JnaGobject.INST().g_type_class_adjust_private_offset(asCPointer(g_class), asCPointerNotNull(private_size_or_offset));
    }

    /**
     * This function is essentially the same as g_type_class_ref(),
     * <br>except that the classes reference count isn't incremented.
     * <br>As a consequence, this function may return %NULL if the class
     * <br>of the type passed in does not currently exist (hasn't been
     * <br>referenced before).
     * @param type type ID of a classed type
     * @return the &#35;GTypeClass     structure for the given type ID or %NULL if the class does not     currently exist
    */
    public static ch.bailu.gtk.type.Pointer typeClassPeek(long type)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGobject.INST().g_type_class_peek(type)));
    }

    /**
     * A more efficient version of g_type_class_peek() which works only for
     * <br>static types.
     * @param type type ID of a classed type
     * @return the &#35;GTypeClass     structure for the given type ID or %NULL if the class does not     currently exist or is dynamically loaded
    */
    public static ch.bailu.gtk.type.Pointer typeClassPeekStatic(long type)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGobject.INST().g_type_class_peek_static(type)));
    }

    /**
     * Increments the reference count of the class structure belonging to
     * <br>&#64;type. This function will demand-create the class if it doesn't
     * <br>exist already.
     * @param type type ID of a classed type
     * @return the &#35;GTypeClass     structure for the given type ID
    */
    public static ch.bailu.gtk.type.Pointer typeClassRef(long type)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGobject.INST().g_type_class_ref(type)));
    }

    /**
     * Creates and initializes an instance of &#64;type if &#64;type is valid and
     * <br>can be instantiated. The type system only performs basic allocation
     * <br>and structure setups for instances: actual instance creation should
     * <br>happen through functions supplied by the type's fundamental type
     * <br>implementation.  So use of g_type_create_instance() is reserved for
     * <br>implementers of fundamental types only. E.g. instances of the
     * <br>&#35;GObject hierarchy should be created via g_object_new() and never
     * <br>directly through g_type_create_instance() which doesn't handle things
     * <br>like singleton objects or object construction.
     * <br>
     * <br>The extended members of the returned instance are guaranteed to be filled
     * <br>with zeros.
     * <br>
     * <br>Note: Do not use this function, unless you're implementing a
     * <br>fundamental type. Also language bindings should not use this
     * <br>function, but g_object_new() instead.
     * @param type an instantiatable type to create an instance for
     * @return an allocated and initialized instance, subject to further     treatment by the fundamental type implementation
    */
    public static TypeInstance typeCreateInstance(long type)  {
        return new TypeInstance(new PointerContainer(JnaGobject.INST().g_type_create_instance(type)));
    }

    /**
     * If the interface type &#64;g_type is currently in use, returns its
     * <br>default interface vtable.
     * @param g_type an interface type
     * @return the default     vtable for the interface, or %NULL if the type is not currently     in use
    */
    public static ch.bailu.gtk.type.Pointer typeDefaultInterfacePeek(long g_type)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGobject.INST().g_type_default_interface_peek(g_type)));
    }

    /**
     * Increments the reference count for the interface type &#64;g_type,
     * <br>and returns the default interface vtable for the type.
     * <br>
     * <br>If the type is not currently in use, then the default vtable
     * <br>for the type will be created and initialized by calling
     * <br>the base interface init and default vtable init functions for
     * <br>the type (the &#64;base_init and &#64;class_init members of &#35;GTypeInfo).
     * <br>Calling g_type_default_interface_ref() is useful when you
     * <br>want to make sure that signals and properties for an interface
     * <br>have been installed.
     * @param g_type an interface type
     * @return the default     vtable for the interface; call g_type_default_interface_unref()     when you are done using the interface.
    */
    public static ch.bailu.gtk.type.Pointer typeDefaultInterfaceRef(long g_type)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGobject.INST().g_type_default_interface_ref(g_type)));
    }

    /**
     * Decrements the reference count for the type corresponding to the
     * <br>interface default vtable &#64;g_iface. If the type is dynamic, then
     * <br>when no one is using the interface and all references have
     * <br>been released, the finalize function for the interface's default
     * <br>vtable (the &#64;class_finalize member of &#35;GTypeInfo) will be called.
     * @param g_iface the default vtable     structure for an interface, as returned by g_type_default_interface_ref()
    */
    public static void typeDefaultInterfaceUnref(@Nonnull ch.bailu.gtk.type.Pointer g_iface)  {
        JnaGobject.INST().g_type_default_interface_unref(asCPointerNotNull(g_iface));
    }

    /**
     * Returns the length of the ancestry of the passed in type. This
     * <br>includes the type itself, so that e.g. a fundamental type has depth 1.
     * @param type a &#35;GType
     * @return the depth of &#64;type
    */
    public static int typeDepth(long type)  {
        return JnaGobject.INST().g_type_depth(type);
    }

    /**
     * Ensures that the indicated &#64;type has been registered with the
     * <br>type system, and its _class_init() method has been run.
     * <br>
     * <br>In theory, simply calling the type's _get_type() method (or using
     * <br>the corresponding macro) is supposed take care of this. However,
     * <br>_get_type() methods are often marked %G_GNUC_CONST for performance
     * <br>reasons, even though this is technically incorrect (since
     * <br>%G_GNUC_CONST requires that the function not have side effects,
     * <br>which _get_type() methods do on the first call). As a result, if
     * <br>you write a bare call to a _get_type() macro, it may get optimized
     * <br>out by the compiler. Using g_type_ensure() guarantees that the
     * <br>type's _get_type() method is called.
     * @param type a &#35;GType
    */
    public static void typeEnsure(long type)  {
        JnaGobject.INST().g_type_ensure(type);
    }

    /**
     * Frees an instance of a type, returning it to the instance pool for
     * <br>the type, if there is one.
     * <br>
     * <br>Like g_type_create_instance(), this function is reserved for
     * <br>implementors of fundamental types.
     * @param instance an instance of a type
    */
    public static void typeFreeInstance(@Nonnull TypeInstance instance)  {
        JnaGobject.INST().g_type_free_instance(asCPointerNotNull(instance));
    }

    /**
     * Look up the type ID from a given type name, returning 0 if no type
     * <br>has been registered under this name (this is the preferred method
     * <br>to find out by name whether a specific type has been registered
     * <br>yet).
     * @param name type name to look up
     * @return corresponding type ID or 0
    */
    public static long typeFromName(@Nonnull ch.bailu.gtk.type.Str name)  {
        return JnaGobject.INST().g_type_from_name(asCPointerNotNull(name));
    }

    /**
     * Internal function, used to extract the fundamental type ID portion.
     * <br>Use G_TYPE_FUNDAMENTAL() instead.
     * @param type_id valid type ID
     * @return fundamental type ID
    */
    public static long typeFundamental(long type_id)  {
        return JnaGobject.INST().g_type_fundamental(type_id);
    }

    /**
     * Returns the next free fundamental type id which can be used to
     * <br>register a new fundamental type with g_type_register_fundamental().
     * <br>The returned type ID represents the highest currently registered
     * <br>fundamental type identifier.
     * @return the next available fundamental type ID to be registered,     or 0 if the type system ran out of fundamental type IDs
    */
    public static long typeFundamentalNext()  {
        return JnaGobject.INST().g_type_fundamental_next();
    }

    /**
     * Returns the number of instances allocated of the particular type;
     * <br>this is only available if GLib is built with debugging support and
     * <br>the instance_count debug flag is set (by setting the GOBJECT_DEBUG
     * <br>variable to include instance-count).
     * @param type a &#35;GType
     * @return the number of instances allocated of the given type;   if instance counts are not available, returns 0.
    */
    public static int typeGetInstanceCount(long type)  {
        return JnaGobject.INST().g_type_get_instance_count(type);
    }

    /**
     * Returns the &#35;GTypePlugin structure for &#64;type.
     * @param type &#35;GType to retrieve the plugin for
     * @return the corresponding plugin     if &#64;type is a dynamic type, %NULL otherwise
    */
    public static TypePlugin typeGetPlugin(long type)  {
        return new TypePlugin(new PointerContainer(JnaGobject.INST().g_type_get_plugin(type)));
    }

    /**
     * Obtains data which has previously been attached to &#64;type
     * <br>with g_type_set_qdata().
     * <br>
     * <br>Note that this does not take subtyping into account; data
     * <br>attached to one type with g_type_set_qdata() cannot
     * <br>be retrieved from a subtype using g_type_get_qdata().
     * @param type a &#35;GType
     * @param quark a &#35;GQuark id to identify the data
     * @return the data, or %NULL if no data was found
    */
    public static ch.bailu.gtk.type.Pointer typeGetQdata(long type, int quark)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGobject.INST().g_type_get_qdata(type, quark)));
    }

    /**
     * Returns an opaque serial number that represents the state of the set
     * <br>of registered types. Any time a type is registered this serial changes,
     * <br>which means you can cache information based on type lookups (such as
     * <br>g_type_from_name()) and know if the cache is still valid at a later
     * <br>time by comparing the current serial with the one at the type lookup.
     * @return An unsigned int, representing the state of type registrations
    */
    public static int typeGetTypeRegistrationSerial()  {
        return JnaGobject.INST().g_type_get_type_registration_serial();
    }

    /**
     * Adds &#64;prerequisite_type to the list of prerequisites of &#64;interface_type.
     * <br>This means that any type implementing &#64;interface_type must also implement
     * <br>&#64;prerequisite_type. Prerequisites can be thought of as an alternative to
     * <br>interface derivation (which GType doesn't support). An interface can have
     * <br>at most one instantiatable prerequisite type.
     * @param interface_type &#35;GType value of an interface type
     * @param prerequisite_type &#35;GType value of an interface or instantiatable type
    */
    public static void typeInterfaceAddPrerequisite(long interface_type, long prerequisite_type)  {
        JnaGobject.INST().g_type_interface_add_prerequisite(interface_type, prerequisite_type);
    }

    /**
     * Returns the &#35;GTypePlugin structure for the dynamic interface
     * <br>&#64;interface_type which has been added to &#64;instance_type, or %NULL
     * <br>if &#64;interface_type has not been added to &#64;instance_type or does
     * <br>not have a &#35;GTypePlugin structure. See g_type_add_interface_dynamic().
     * @param instance_type &#35;GType of an instantiatable type
     * @param interface_type &#35;GType of an interface type
     * @return the &#35;GTypePlugin for the dynamic     interface &#64;interface_type of &#64;instance_type
    */
    public static TypePlugin typeInterfaceGetPlugin(long instance_type, long interface_type)  {
        return new TypePlugin(new PointerContainer(JnaGobject.INST().g_type_interface_get_plugin(instance_type, interface_type)));
    }

    /**
     * Returns the most specific instantiatable prerequisite of an
     * <br>interface type. If the interface type has no instantiatable
     * <br>prerequisite, %G_TYPE_INVALID is returned.
     * <br>
     * <br>See g_type_interface_add_prerequisite() for more information
     * <br>about prerequisites.
     * @param interface_type an interface type
     * @return the instantiatable prerequisite type or %G_TYPE_INVALID if none
    */
    public static long typeInterfaceInstantiatablePrerequisite(long interface_type)  {
        return JnaGobject.INST().g_type_interface_instantiatable_prerequisite(interface_type);
    }

    /**
     * Returns the &#35;GTypeInterface structure of an interface to which the
     * <br>passed in class conforms.
     * @param instance_class a &#35;GTypeClass structure
     * @param iface_type an interface ID which this class conforms to
     * @return the &#35;GTypeInterface     structure of &#64;iface_type if implemented by &#64;instance_class, %NULL     otherwise
    */
    public static ch.bailu.gtk.type.Pointer typeInterfacePeek(@Nonnull ch.bailu.gtk.type.Pointer instance_class, long iface_type)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaGobject.INST().g_type_interface_peek(asCPointerNotNull(instance_class), iface_type)));
    }

    /**
     * If &#64;is_a_type is a derivable type, check whether &#64;type is a
     * <br>descendant of &#64;is_a_type. If &#64;is_a_type is an interface, check
     * <br>whether &#64;type conforms to it.
     * @param type type to check ancestry for
     * @param is_a_type possible ancestor of &#64;type or interface that &#64;type     could conform to
     * @return %TRUE if &#64;type is a &#64;is_a_type
    */
    public static boolean typeIsA(long type, long is_a_type)  {
        return JnaGobject.INST().g_type_is_a(type, is_a_type);
    }

    /**
     * Get the unique name that is assigned to a type ID.  Note that this
     * <br>function (like all other GType API) cannot cope with invalid type
     * <br>IDs. %G_TYPE_INVALID may be passed to this function, as may be any
     * <br>other validly registered type ID, but randomized type IDs should
     * <br>not be passed in and will most likely lead to a crash.
     * @param type type to return name for
     * @return static type name or %NULL
    */
    public static ch.bailu.gtk.type.Str typeName(long type)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGobject.INST().g_type_name(type)));
    }

    /**
     * 
     * @param g_class 
     * @return 
    */
    public static ch.bailu.gtk.type.Str typeNameFromClass(@Nonnull TypeClass g_class)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGobject.INST().g_type_name_from_class(asCPointerNotNull(g_class))));
    }

    /**
     * 
     * @param instance 
     * @return 
    */
    public static ch.bailu.gtk.type.Str typeNameFromInstance(@Nonnull TypeInstance instance)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGobject.INST().g_type_name_from_instance(asCPointerNotNull(instance))));
    }

    /**
     * Given a &#64;leaf_type and a &#64;root_type which is contained in its
     * <br>ancestry, return the type that &#64;root_type is the immediate parent
     * <br>of. In other words, this function determines the type that is
     * <br>derived directly from &#64;root_type which is also a base class of
     * <br>&#64;leaf_type.  Given a root type and a leaf type, this function can
     * <br>be used to determine the types and order in which the leaf type is
     * <br>descended from the root type.
     * @param leaf_type descendant of &#64;root_type and the type to be returned
     * @param root_type immediate parent of the returned type
     * @return immediate child of &#64;root_type and ancestor of &#64;leaf_type
    */
    public static long typeNextBase(long leaf_type, long root_type)  {
        return JnaGobject.INST().g_type_next_base(leaf_type, root_type);
    }

    /**
     * Return the direct parent type of the passed in type. If the passed
     * <br>in type has no parent, i.e. is a fundamental type, 0 is returned.
     * @param type the derived type
     * @return the parent type
    */
    public static long typeParent(long type)  {
        return JnaGobject.INST().g_type_parent(type);
    }

    /**
     * Get the corresponding quark of the type IDs name.
     * @param type type to return quark of type name for
     * @return the type names quark or 0
    */
    public static int typeQname(long type)  {
        return JnaGobject.INST().g_type_qname(type);
    }

    /**
     * Queries the type system for information about a specific type.
     * <br>This function will fill in a user-provided structure to hold
     * <br>type-specific information. If an invalid &#35;GType is passed in, the
     * <br>&#64;type member of the &#35;GTypeQuery is 0. All members filled into the
     * <br>&#35;GTypeQuery structure should be considered constant and have to be
     * <br>left untouched.
     * @param type &#35;GType of a static, classed type
     * @param query a user provided structure that is     filled in with constant values upon success
    */
    public static void typeQuery(long type, @Nonnull TypeQuery query)  {
        JnaGobject.INST().g_type_query(type, asCPointerNotNull(query));
    }

    /**
     * Registers &#64;type_name as the name of a new dynamic type derived from
     * <br>&#64;parent_type.  The type system uses the information contained in the
     * <br>&#35;GTypePlugin structure pointed to by &#64;plugin to manage the type and its
     * <br>instances (if not abstract).  The value of &#64;flags determines the nature
     * <br>(e.g. abstract or not) of the type.
     * @param parent_type type from which this type will be derived
     * @param type_name 0-terminated string used as the name of the new type
     * @param plugin &#35;GTypePlugin structure to retrieve the &#35;GTypeInfo from
     * @param flags bitwise combination of &#35;GTypeFlags values
     * @return the new type identifier or %G_TYPE_INVALID if registration failed
    */
    public static long typeRegisterDynamic(long parent_type, @Nonnull ch.bailu.gtk.type.Str type_name, @Nonnull TypePlugin plugin, int flags)  {
        return JnaGobject.INST().g_type_register_dynamic(parent_type, asCPointerNotNull(type_name), asCPointerNotNull(plugin), flags);
    }

    /**
     * Registers &#64;type_id as the predefined identifier and &#64;type_name as the
     * <br>name of a fundamental type. If &#64;type_id is already registered, or a
     * <br>type named &#64;type_name is already registered, the behaviour is undefined.
     * <br>The type system uses the information contained in the &#35;GTypeInfo structure
     * <br>pointed to by &#64;info and the &#35;GTypeFundamentalInfo structure pointed to by
     * <br>&#64;finfo to manage the type and its instances. The value of &#64;flags determines
     * <br>additional characteristics of the fundamental type.
     * @param type_id a predefined type identifier
     * @param type_name 0-terminated string used as the name of the new type
     * @param info &#35;GTypeInfo structure for this type
     * @param finfo &#35;GTypeFundamentalInfo structure for this type
     * @param flags bitwise combination of &#35;GTypeFlags values
     * @return the predefined type identifier
    */
    public static long typeRegisterFundamental(long type_id, @Nonnull ch.bailu.gtk.type.Str type_name, @Nonnull TypeInfo info, @Nonnull TypeFundamentalInfo finfo, int flags)  {
        return JnaGobject.INST().g_type_register_fundamental(type_id, asCPointerNotNull(type_name), asCPointerNotNull(info), asCPointerNotNull(finfo), flags);
    }

    /**
     * Registers &#64;type_name as the name of a new static type derived from
     * <br>&#64;parent_type. The type system uses the information contained in the
     * <br>&#35;GTypeInfo structure pointed to by &#64;info to manage the type and its
     * <br>instances (if not abstract). The value of &#64;flags determines the nature
     * <br>(e.g. abstract or not) of the type.
     * @param parent_type type from which this type will be derived
     * @param type_name 0-terminated string used as the name of the new type
     * @param info &#35;GTypeInfo structure for this type
     * @param flags bitwise combination of &#35;GTypeFlags values
     * @return the new type identifier
    */
    public static long typeRegisterStatic(long parent_type, @Nonnull ch.bailu.gtk.type.Str type_name, @Nonnull TypeInfo info, int flags)  {
        return JnaGobject.INST().g_type_register_static(parent_type, asCPointerNotNull(type_name), asCPointerNotNull(info), flags);
    }

    /**
     * Registers &#64;type_name as the name of a new static type derived from
     * <br>&#64;parent_type.  The value of &#64;flags determines the nature (e.g.
     * <br>abstract or not) of the type. It works by filling a &#35;GTypeInfo
     * <br>struct and calling g_type_register_static().
     * @param parent_type type from which this type will be derived
     * @param type_name 0-terminated string used as the name of the new type
     * @param class_size size of the class structure (see &#35;GTypeInfo)
     * @param class_init location of the class initialization function (see &#35;GTypeInfo)
     * @param instance_size size of the instance structure (see &#35;GTypeInfo)
     * @param instance_init location of the instance initialization function (see &#35;GTypeInfo)
     * @param flags bitwise combination of &#35;GTypeFlags values
     * @return the new type identifier
    */
    public static long typeRegisterStaticSimple(long parent_type, @Nonnull ch.bailu.gtk.type.Str type_name, int class_size, OnClassInitFunc class_init, int instance_size, OnInstanceInitFunc instance_init, int flags)  {
        return JnaGobject.INST().g_type_register_static_simple(parent_type, asCPointerNotNull(type_name), class_size, toOnClassInitFunc(getClassHandler().getInstance(), "typeRegisterStaticSimple", class_init), instance_size, toOnInstanceInitFunc(getClassHandler().getInstance(), "typeRegisterStaticSimple", instance_init), flags);
    }

    /**
     * Removes a previously installed &#35;GTypeClassCacheFunc. The cache
     * <br>maintained by &#64;cache_func has to be empty when calling
     * <br>g_type_remove_class_cache_func() to avoid leaks.
     * @param cache_data data that was given when adding &#64;cache_func
     * @param cache_func a &#35;GTypeClassCacheFunc
    */
    public static void typeRemoveClassCacheFunc(@Nullable ch.bailu.gtk.type.Pointer cache_data, OnTypeClassCacheFunc cache_func)  {
        JnaGobject.INST().g_type_remove_class_cache_func(asCPointer(cache_data), toOnTypeClassCacheFunc(getClassHandler().getInstance(), "typeRemoveClassCacheFunc", cache_func));
    }

    /**
     * Removes an interface check function added with
     * <br>g_type_add_interface_check().
     * @param check_data callback data passed to g_type_add_interface_check()
     * @param check_func callback function passed to g_type_add_interface_check()
    */
    public static void typeRemoveInterfaceCheck(@Nullable ch.bailu.gtk.type.Pointer check_data, OnTypeInterfaceCheckFunc check_func)  {
        JnaGobject.INST().g_type_remove_interface_check(asCPointer(check_data), toOnTypeInterfaceCheckFunc(getClassHandler().getInstance(), "typeRemoveInterfaceCheck", check_func));
    }

    /**
     * Attaches arbitrary data to a type.
     * @param type a &#35;GType
     * @param quark a &#35;GQuark id to identify the data
     * @param data the data
    */
    public static void typeSetQdata(long type, int quark, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaGobject.INST().g_type_set_qdata(type, quark, asCPointer(data));
    }

    /**
     * 
     * @param type 
     * @param flags 
     * @return 
    */
    public static boolean typeTestFlags(long type, int flags)  {
        return JnaGobject.INST().g_type_test_flags(type, flags);
    }

    /**
     * Returns the location of the &#35;GTypeValueTable associated with &#64;type.
     * <br>
     * <br>Note that this function should only be used from source code
     * <br>that implements or has internal knowledge of the implementation of
     * <br>&#64;type.
     * @param type a &#35;GType
     * @return location of the &#35;GTypeValueTable associated with &#64;type or     %NULL if there is no &#35;GTypeValueTable associated with &#64;type
    */
    public static TypeValueTable typeValueTablePeek(long type)  {
        return new TypeValueTable(new PointerContainer(JnaGobject.INST().g_type_value_table_peek(type)));
    }

    /**
     * Registers a value transformation function for use in g_value_transform().
     * <br>A previously registered transformation function for &#64;src_type and &#64;dest_type
     * <br>will be replaced.
     * @param src_type Source type.
     * @param dest_type Target type.
     * @param transform_func a function which transforms values of type &#64;src_type  into value of type &#64;dest_type
    */
    public static void valueRegisterTransformFunc(long src_type, long dest_type, OnValueTransform transform_func)  {
        JnaGobject.INST().g_value_register_transform_func(src_type, dest_type, toOnValueTransform(getClassHandler().getInstance(), "valueRegisterTransformFunc", transform_func));
    }

    /**
     * Returns whether a &#35;GValue of type &#64;src_type can be copied into
     * <br>a &#35;GValue of type &#64;dest_type.
     * @param src_type source type to be copied.
     * @param dest_type destination type for copying.
     * @return %TRUE if g_value_copy() is possible with &#64;src_type and &#64;dest_type.
    */
    public static boolean valueTypeCompatible(long src_type, long dest_type)  {
        return JnaGobject.INST().g_value_type_compatible(src_type, dest_type);
    }

    /**
     * Check whether g_value_transform() is able to transform values
     * <br>of type &#64;src_type into values of type &#64;dest_type. Note that for
     * <br>the types to be transformable, they must be compatible or a
     * <br>transformation function must be registered.
     * @param src_type Source type.
     * @param dest_type Target type.
     * @return %TRUE if the transformation is possible, %FALSE otherwise.
    */
    public static boolean valueTypeTransformable(long src_type, long dest_type)  {
        return JnaGobject.INST().g_value_type_transformable(src_type, dest_type);
    }

}

/*
package-type

[MethodModel:java-type-not-supported:clearObject:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GObject**}}:{j:}]

[MethodModel:java-type-not-supported:clearSignalHandler:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gulong*}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-not-supported:signalAddEmissionHook:[ParameterModel:Supported:{G_::{c:gulong}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:SignalEmissionHook:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:SignalInvocationHint:{c:GSignalInvocationHint*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:DestroyNotify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:java-type-not-supported:signalChainFromOverridden:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]

[MethodModel:java-type-not-supported:signalEmitValist:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:java-type-not-supported:signalEmitv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:signalListIds:[ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:cb-not-supported:signalNew:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GSignalFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:[MethodModel:Supported:SignalAccumulator:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:SignalInvocationHint:{c:GSignalInvocationHint*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:const GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:ClosureMarshal:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:cb-not-supported:signalNewClassHandler:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GSignalFlags}}:{j:int}]
        [ParameterModel:Supported:[MethodModel:Supported:Callback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]
        [ParameterModel:Supported:[MethodModel:Supported:SignalAccumulator:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:SignalInvocationHint:{c:GSignalInvocationHint*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:const GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:ClosureMarshal:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:cb-not-supported:java-type-not-supported:signalNewValist:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GSignalFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:SignalAccumulator:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:SignalInvocationHint:{c:GSignalInvocationHint*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:const GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:ClosureMarshal:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:cb-not-supported:signalNewv:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GSignalFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:SignalAccumulator:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:SignalInvocationHint:{c:GSignalInvocationHint*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:const GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:ClosureMarshal:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:signalParseName:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GQuark*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]

[MethodModel:cb-not-supported:signalSetVaMarshaller:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:VaClosureMarshal:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Closure:{c:GClosure*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Value:{c:GValue*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]]

[MethodModel:java-type-not-supported:typeChildren:[ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:cb-deprecated:typeInit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[MethodModel:cb-deprecated:typeInitWithDebugFlags:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GTypeDebugFlags}}:{j:int}]

[MethodModel:java-type-not-supported:typeInterfacePrerequisites:[ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:typeInterfaces:[ParameterModel:Supported:{Gw:Int64:{c:GType*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
*/
