/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * This structure is used to provide the type system with the information
 * <br>required to initialize and destruct (finalize) a type's class and
 * <br>its instances.
 * <br>
 * <br>The initialized structure is passed to the g_type_register_static() function
 * <br>(or is copied into the provided &#35;GTypeInfo structure in the
 * <br>g_type_plugin_complete_type_info()). The type system will perform a deep
 * <br>copy of this structure, so its memory does not need to be persistent
 * <br>across invocation of g_type_register_static().
 * <p><a href="https://docs.gtk.org/gobject/struct.TypeInfo.html">https://docs.gtk.org/gobject/struct.TypeInfo.html</a></p>
*/
public class TypeInfo extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TypeInfo.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnBaseInitFunc {
        /**
         * A callback function used by the type system to do base initialization
         * <br>of the class structures of derived types.
         * <br>
         * <br>This function is called as part of the initialization process of all derived
         * <br>classes and should reallocate or reset all dynamic class members copied over
         * <br>from the parent class.
         * <br>
         * <br>For example, class members (such as strings) that are not sufficiently
         * <br>handled by a plain memory copy of the parent class into the derived class
         * <br>have to be altered. See GClassInitFunc() for a discussion of the class
         * <br>initialization process.
         * @param g_class The &#35;GTypeClass structure to initialize
        */
        void onBaseInitFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer g_class);
    }
    
    private static JnaTypeInfo.OnBaseInitFunc toOnBaseInitFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnBaseInitFunc in) {
        JnaTypeInfo.OnBaseInitFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_g_class) -> in.onBaseInitFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_g_class)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnBaseFinalizeFunc {
        /**
         * A callback function used by the type system to finalize those portions
         * <br>of a derived types class structure that were setup from the corresponding
         * <br>GBaseInitFunc() function.
         * <br>
         * <br>Class finalization basically works the inverse way in which class
         * <br>initialization is performed.
         * <br>
         * <br>See GClassInitFunc() for a discussion of the class initialization process.
         * @param g_class The &#35;GTypeClass structure to finalize
        */
        void onBaseFinalizeFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer g_class);
    }
    
    private static JnaTypeInfo.OnBaseFinalizeFunc toOnBaseFinalizeFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnBaseFinalizeFunc in) {
        JnaTypeInfo.OnBaseFinalizeFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_g_class) -> in.onBaseFinalizeFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_g_class)));
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
    
    private static JnaTypeInfo.OnClassInitFunc toOnClassInitFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnClassInitFunc in) {
        JnaTypeInfo.OnClassInitFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_g_class, _class_data) -> in.onClassInitFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_g_class)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_class_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnClassFinalizeFunc {
        /**
         * A callback function used by the type system to finalize a class.
         * <br>
         * <br>This function is rarely needed, as dynamically allocated class resources
         * <br>should be handled by GBaseInitFunc() and GBaseFinalizeFunc().
         * <br>
         * <br>Also, specification of a GClassFinalizeFunc() in the &#35;GTypeInfo
         * <br>structure of a static type is invalid, because classes of static types
         * <br>will never be finalized (they are artificially kept alive when their
         * <br>reference count drops to zero).
         * @param g_class The &#35;GTypeClass structure to finalize
         * @param class_data The &#64;class_data member supplied via the &#35;GTypeInfo structure
        */
        void onClassFinalizeFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer g_class, @Nullable ch.bailu.gtk.type.Pointer class_data);
    }
    
    private static JnaTypeInfo.OnClassFinalizeFunc toOnClassFinalizeFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnClassFinalizeFunc in) {
        JnaTypeInfo.OnClassFinalizeFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_g_class, _class_data) -> in.onClassFinalizeFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_g_class)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_class_data)));
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
    
    private static JnaTypeInfo.OnInstanceInitFunc toOnInstanceInitFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnInstanceInitFunc in) {
        JnaTypeInfo.OnInstanceInitFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_instance, _g_class) -> in.onInstanceInitFunc(__callback, new TypeInstance(new PointerContainer(_instance)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_g_class)));
            __callback.register(out);
        }
        return out;
    }

    public TypeInfo(PointerContainer pointer) {
        super(pointer);
    }

    public TypeInfo() {
        super(cast(JnaTypeInfo.allocateStructure()));
    }

    private JnaTypeInfo.Fields _fields;
    
    JnaTypeInfo.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTypeInfo.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * Size of the class structure (required for interface, classed and instantiatable types)
    */
    public static final String CLASS_SIZE = "class_size";

    /**
     * Size of the class structure (required for interface, classed and instantiatable types)
    */
    public void setFieldClassSize(int class_size) {
        toFields().class_size = class_size;
        toFields().writeField(CLASS_SIZE);
    }

    /**
     * Size of the class structure (required for interface, classed and instantiatable types)
    */
    public int getFieldClassSize() {
       toFields().readField(CLASS_SIZE);
       return toFields().class_size;
    } 

    /**
     * Location of the base initialization function (optional)
     * <br>See {@link OnBaseInitFunc#onBaseInitFunc}
    */
    public static final String BASE_INIT = "base_init";

    /**
     * Location of the base initialization function (optional)
     * <br>See {@link OnBaseInitFunc#onBaseInitFunc}
    */
    public void setFieldBaseInit(OnBaseInitFunc base_init) {
        toFields().base_init = toOnBaseInitFunc(this, BASE_INIT, base_init);
        toFields().writeField(BASE_INIT);
    }

    /**
     * Location of the base initialization function (optional)
     * <br>See {@link OnBaseInitFunc#onBaseInitFunc}
    */
    public JnaTypeInfo.OnBaseInitFunc getFieldBaseInit() {
       toFields().readField(BASE_INIT);
       return toFields().base_init;
    } 

    /**
     * Location of the base finalization function (optional)
     * <br>See {@link OnBaseFinalizeFunc#onBaseFinalizeFunc}
    */
    public static final String BASE_FINALIZE = "base_finalize";

    /**
     * Location of the base finalization function (optional)
     * <br>See {@link OnBaseFinalizeFunc#onBaseFinalizeFunc}
    */
    public void setFieldBaseFinalize(OnBaseFinalizeFunc base_finalize) {
        toFields().base_finalize = toOnBaseFinalizeFunc(this, BASE_FINALIZE, base_finalize);
        toFields().writeField(BASE_FINALIZE);
    }

    /**
     * Location of the base finalization function (optional)
     * <br>See {@link OnBaseFinalizeFunc#onBaseFinalizeFunc}
    */
    public JnaTypeInfo.OnBaseFinalizeFunc getFieldBaseFinalize() {
       toFields().readField(BASE_FINALIZE);
       return toFields().base_finalize;
    } 

    /**
     * Location of the class initialization function for
     * <br> classed and instantiatable types. Location of the default vtable
     * <br> inititalization function for interface types. (optional) This function
     * <br> is used both to fill in virtual functions in the class or default vtable,
     * <br> and to do type-specific setup such as registering signals and object
     * <br> properties.
     * <br>See {@link OnClassInitFunc#onClassInitFunc}
    */
    public static final String CLASS_INIT = "class_init";

    /**
     * Location of the class initialization function for
     * <br> classed and instantiatable types. Location of the default vtable
     * <br> inititalization function for interface types. (optional) This function
     * <br> is used both to fill in virtual functions in the class or default vtable,
     * <br> and to do type-specific setup such as registering signals and object
     * <br> properties.
     * <br>See {@link OnClassInitFunc#onClassInitFunc}
    */
    public void setFieldClassInit(OnClassInitFunc class_init) {
        toFields().class_init = toOnClassInitFunc(this, CLASS_INIT, class_init);
        toFields().writeField(CLASS_INIT);
    }

    /**
     * Location of the class initialization function for
     * <br> classed and instantiatable types. Location of the default vtable
     * <br> inititalization function for interface types. (optional) This function
     * <br> is used both to fill in virtual functions in the class or default vtable,
     * <br> and to do type-specific setup such as registering signals and object
     * <br> properties.
     * <br>See {@link OnClassInitFunc#onClassInitFunc}
    */
    public JnaTypeInfo.OnClassInitFunc getFieldClassInit() {
       toFields().readField(CLASS_INIT);
       return toFields().class_init;
    } 

    /**
     * Location of the class finalization function for
     * <br> classed and instantiatable types. Location of the default vtable
     * <br> finalization function for interface types. (optional)
     * <br>See {@link OnClassFinalizeFunc#onClassFinalizeFunc}
    */
    public static final String CLASS_FINALIZE = "class_finalize";

    /**
     * Location of the class finalization function for
     * <br> classed and instantiatable types. Location of the default vtable
     * <br> finalization function for interface types. (optional)
     * <br>See {@link OnClassFinalizeFunc#onClassFinalizeFunc}
    */
    public void setFieldClassFinalize(OnClassFinalizeFunc class_finalize) {
        toFields().class_finalize = toOnClassFinalizeFunc(this, CLASS_FINALIZE, class_finalize);
        toFields().writeField(CLASS_FINALIZE);
    }

    /**
     * Location of the class finalization function for
     * <br> classed and instantiatable types. Location of the default vtable
     * <br> finalization function for interface types. (optional)
     * <br>See {@link OnClassFinalizeFunc#onClassFinalizeFunc}
    */
    public JnaTypeInfo.OnClassFinalizeFunc getFieldClassFinalize() {
       toFields().readField(CLASS_FINALIZE);
       return toFields().class_finalize;
    } 

    /**
     * User-supplied data passed to the class init/finalize functions
    */
    public static final String CLASS_DATA = "class_data";

    /**
     * User-supplied data passed to the class init/finalize functions
    */
    public void setFieldClassData(ch.bailu.gtk.type.Pointer class_data) {
        toFields().class_data = class_data.asCPointer();
        toFields().writeField(CLASS_DATA);
    }

    /**
     * User-supplied data passed to the class init/finalize functions
    */
    public ch.bailu.gtk.type.Pointer getFieldClassData() {
       toFields().readField(CLASS_DATA);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().class_data));
    } 

    /**
     * Size of the instance (object) structure (required for instantiatable types only)
    */
    public static final String INSTANCE_SIZE = "instance_size";

    /**
     * Size of the instance (object) structure (required for instantiatable types only)
    */
    public void setFieldInstanceSize(int instance_size) {
        toFields().instance_size = instance_size;
        toFields().writeField(INSTANCE_SIZE);
    }

    /**
     * Size of the instance (object) structure (required for instantiatable types only)
    */
    public int getFieldInstanceSize() {
       toFields().readField(INSTANCE_SIZE);
       return toFields().instance_size;
    } 

    /**
     * Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the [slice allocator][glib-Memory-Slices] now.
    */
    public static final String N_PREALLOCS = "n_preallocs";

    /**
     * Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the [slice allocator][glib-Memory-Slices] now.
    */
    public void setFieldNPreallocs(int n_preallocs) {
        toFields().n_preallocs = n_preallocs;
        toFields().writeField(N_PREALLOCS);
    }

    /**
     * Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the [slice allocator][glib-Memory-Slices] now.
    */
    public int getFieldNPreallocs() {
       toFields().readField(N_PREALLOCS);
       return toFields().n_preallocs;
    } 

    /**
     * Location of the instance initialization function (optional, for instantiatable types only)
     * <br>See {@link OnInstanceInitFunc#onInstanceInitFunc}
    */
    public static final String INSTANCE_INIT = "instance_init";

    /**
     * Location of the instance initialization function (optional, for instantiatable types only)
     * <br>See {@link OnInstanceInitFunc#onInstanceInitFunc}
    */
    public void setFieldInstanceInit(OnInstanceInitFunc instance_init) {
        toFields().instance_init = toOnInstanceInitFunc(this, INSTANCE_INIT, instance_init);
        toFields().writeField(INSTANCE_INIT);
    }

    /**
     * Location of the instance initialization function (optional, for instantiatable types only)
     * <br>See {@link OnInstanceInitFunc#onInstanceInitFunc}
    */
    public JnaTypeInfo.OnInstanceInitFunc getFieldInstanceInit() {
       toFields().readField(INSTANCE_INIT);
       return toFields().instance_init;
    } 

    /**
     * A &#35;GTypeValueTable function table for generic handling of GValues
     * <br> of this type (usually only useful for fundamental types)
    */
    public static final String VALUE_TABLE = "value_table";

    /**
     * A &#35;GTypeValueTable function table for generic handling of GValues
     * <br> of this type (usually only useful for fundamental types)
    */
    public void setFieldValueTable(TypeValueTable value_table) {
        toFields().value_table = value_table.asCPointer();
        toFields().writeField(VALUE_TABLE);
    }

    /**
     * A &#35;GTypeValueTable function table for generic handling of GValues
     * <br> of this type (usually only useful for fundamental types)
    */
    public TypeValueTable getFieldValueTable() {
       toFields().readField(VALUE_TABLE);
       return new TypeValueTable(new PointerContainer(toFields().value_table));
    } 

}

/*
record-type
all-fields-supported
*/
