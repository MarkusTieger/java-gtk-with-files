/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * This structure is used to provide the type system with the information
 * <br>required to initialize and destruct (finalize) a parameter's class and
 * <br>instances thereof.
 * <br>
 * <br>The initialized structure is passed to the g_param_type_register_static()
 * <br>The type system will perform a deep copy of this structure, so its memory
 * <br>does not need to be persistent across invocation of
 * <br>g_param_type_register_static().
 * <p><a href="https://docs.gtk.org/gobject/struct.ParamSpecTypeInfo.html">https://docs.gtk.org/gobject/struct.ParamSpecTypeInfo.html</a></p>
*/
public class ParamSpecTypeInfo extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ParamSpecTypeInfo.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnInstanceInit {
        /**
         * 
         * @param pspec 
        */
        void onInstanceInit(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ParamSpec pspec);
    }
    
    private static JnaParamSpecTypeInfo.OnInstanceInit toOnInstanceInit(ch.bailu.gtk.type.Pointer instance, String methodName, OnInstanceInit in) {
        JnaParamSpecTypeInfo.OnInstanceInit out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_pspec) -> in.onInstanceInit(__callback, new ParamSpec(new PointerContainer(_pspec)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFinalize {
        /**
         * 
         * @param pspec 
        */
        void onFinalize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ParamSpec pspec);
    }
    
    private static JnaParamSpecTypeInfo.OnFinalize toOnFinalize(ch.bailu.gtk.type.Pointer instance, String methodName, OnFinalize in) {
        JnaParamSpecTypeInfo.OnFinalize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_pspec) -> in.onFinalize(__callback, new ParamSpec(new PointerContainer(_pspec)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnValueSetDefault {
        /**
         * 
         * @param pspec 
         * @param value 
        */
        void onValueSetDefault(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ParamSpec pspec, @Nonnull Value value);
    }
    
    private static JnaParamSpecTypeInfo.OnValueSetDefault toOnValueSetDefault(ch.bailu.gtk.type.Pointer instance, String methodName, OnValueSetDefault in) {
        JnaParamSpecTypeInfo.OnValueSetDefault out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_pspec, _value) -> in.onValueSetDefault(__callback, new ParamSpec(new PointerContainer(_pspec)), new Value(new PointerContainer(_value)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnValueValidate {
        /**
         * 
         * @param pspec 
         * @param value 
         * @return 
        */
        boolean onValueValidate(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ParamSpec pspec, @Nonnull Value value);
    }
    
    private static JnaParamSpecTypeInfo.OnValueValidate toOnValueValidate(ch.bailu.gtk.type.Pointer instance, String methodName, OnValueValidate in) {
        JnaParamSpecTypeInfo.OnValueValidate out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_pspec, _value) -> in.onValueValidate(__callback, new ParamSpec(new PointerContainer(_pspec)), new Value(new PointerContainer(_value)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnValuesCmp {
        /**
         * 
         * @param pspec 
         * @param value1 
         * @param value2 
         * @return 
        */
        int onValuesCmp(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ParamSpec pspec, @Nonnull Value value1, @Nonnull Value value2);
    }
    
    private static JnaParamSpecTypeInfo.OnValuesCmp toOnValuesCmp(ch.bailu.gtk.type.Pointer instance, String methodName, OnValuesCmp in) {
        JnaParamSpecTypeInfo.OnValuesCmp out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_pspec, _value1, _value2) -> in.onValuesCmp(__callback, new ParamSpec(new PointerContainer(_pspec)), new Value(new PointerContainer(_value1)), new Value(new PointerContainer(_value2)));
            __callback.register(out);
        }
        return out;
    }

    public ParamSpecTypeInfo(PointerContainer pointer) {
        super(pointer);
    }

    public ParamSpecTypeInfo() {
        super(cast(JnaParamSpecTypeInfo.allocateStructure()));
    }

    private JnaParamSpecTypeInfo.Fields _fields;
    
    JnaParamSpecTypeInfo.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaParamSpecTypeInfo.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * Size of the instance (object) structure.
    */
    public static final String INSTANCE_SIZE = "instance_size";

    /**
     * Size of the instance (object) structure.
    */
    public void setFieldInstanceSize(int instance_size) {
        toFields().instance_size = instance_size;
        toFields().writeField(INSTANCE_SIZE);
    }

    /**
     * Size of the instance (object) structure.
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
     * 
     * <br>See {@link OnInstanceInit#onInstanceInit}
    */
    public static final String INSTANCE_INIT = "instance_init";

    /**
     * 
     * <br>See {@link OnInstanceInit#onInstanceInit}
    */
    public void setFieldInstanceInit(OnInstanceInit instance_init) {
        toFields().instance_init = toOnInstanceInit(this, INSTANCE_INIT, instance_init);
        toFields().writeField(INSTANCE_INIT);
    }

    /**
     * 
     * <br>See {@link OnInstanceInit#onInstanceInit}
    */
    public JnaParamSpecTypeInfo.OnInstanceInit getFieldInstanceInit() {
       toFields().readField(INSTANCE_INIT);
       return toFields().instance_init;
    } 

    /**
     * The &#35;GType of values conforming to this &#35;GParamSpec
    */
    public static final String VALUE_TYPE = "value_type";

    /**
     * The &#35;GType of values conforming to this &#35;GParamSpec
    */
    public void setFieldValueType(long value_type) {
        toFields().value_type = value_type;
        toFields().writeField(VALUE_TYPE);
    }

    /**
     * The &#35;GType of values conforming to this &#35;GParamSpec
    */
    public long getFieldValueType() {
       toFields().readField(VALUE_TYPE);
       return toFields().value_type;
    } 

    /**
     * 
     * <br>See {@link OnFinalize#onFinalize}
    */
    public static final String FINALIZE = "finalize";

    /**
     * 
     * <br>See {@link OnFinalize#onFinalize}
    */
    public void setFieldFinalize(OnFinalize finalize) {
        toFields().finalize = toOnFinalize(this, FINALIZE, finalize);
        toFields().writeField(FINALIZE);
    }

    /**
     * 
     * <br>See {@link OnFinalize#onFinalize}
    */
    public JnaParamSpecTypeInfo.OnFinalize getFieldFinalize() {
       toFields().readField(FINALIZE);
       return toFields().finalize;
    } 

    /**
     * 
     * <br>See {@link OnValueSetDefault#onValueSetDefault}
    */
    public static final String VALUE_SET_DEFAULT = "value_set_default";

    /**
     * 
     * <br>See {@link OnValueSetDefault#onValueSetDefault}
    */
    public void setFieldValueSetDefault(OnValueSetDefault value_set_default) {
        toFields().value_set_default = toOnValueSetDefault(this, VALUE_SET_DEFAULT, value_set_default);
        toFields().writeField(VALUE_SET_DEFAULT);
    }

    /**
     * 
     * <br>See {@link OnValueSetDefault#onValueSetDefault}
    */
    public JnaParamSpecTypeInfo.OnValueSetDefault getFieldValueSetDefault() {
       toFields().readField(VALUE_SET_DEFAULT);
       return toFields().value_set_default;
    } 

    /**
     * 
     * <br>See {@link OnValueValidate#onValueValidate}
    */
    public static final String VALUE_VALIDATE = "value_validate";

    /**
     * 
     * <br>See {@link OnValueValidate#onValueValidate}
    */
    public void setFieldValueValidate(OnValueValidate value_validate) {
        toFields().value_validate = toOnValueValidate(this, VALUE_VALIDATE, value_validate);
        toFields().writeField(VALUE_VALIDATE);
    }

    /**
     * 
     * <br>See {@link OnValueValidate#onValueValidate}
    */
    public JnaParamSpecTypeInfo.OnValueValidate getFieldValueValidate() {
       toFields().readField(VALUE_VALIDATE);
       return toFields().value_validate;
    } 

    /**
     * 
     * <br>See {@link OnValuesCmp#onValuesCmp}
    */
    public static final String VALUES_CMP = "values_cmp";

    /**
     * 
     * <br>See {@link OnValuesCmp#onValuesCmp}
    */
    public void setFieldValuesCmp(OnValuesCmp values_cmp) {
        toFields().values_cmp = toOnValuesCmp(this, VALUES_CMP, values_cmp);
        toFields().writeField(VALUES_CMP);
    }

    /**
     * 
     * <br>See {@link OnValuesCmp#onValuesCmp}
    */
    public JnaParamSpecTypeInfo.OnValuesCmp getFieldValuesCmp() {
       toFields().readField(VALUES_CMP);
       return toFields().values_cmp;
    } 

}

/*
record-type
all-fields-supported
*/
