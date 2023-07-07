/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The class structure for the GParamSpec type.
 * <br>Normally, GParamSpec classes are filled by
 * <br>g_param_type_register_static().
 * <p><a href="https://docs.gtk.org/gobject/struct.ParamSpecClass.html">https://docs.gtk.org/gobject/struct.ParamSpecClass.html</a></p>
*/
public class ParamSpecClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ParamSpecClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnFinalize {
        /**
         * 
         * @param pspec 
        */
        void onFinalize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ParamSpec pspec);
    }
    
    private static JnaParamSpecClass.OnFinalize toOnFinalize(ch.bailu.gtk.type.Pointer instance, String methodName, OnFinalize in) {
        JnaParamSpecClass.OnFinalize out = null;
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
    
    private static JnaParamSpecClass.OnValueSetDefault toOnValueSetDefault(ch.bailu.gtk.type.Pointer instance, String methodName, OnValueSetDefault in) {
        JnaParamSpecClass.OnValueSetDefault out = null;
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
    
    private static JnaParamSpecClass.OnValueValidate toOnValueValidate(ch.bailu.gtk.type.Pointer instance, String methodName, OnValueValidate in) {
        JnaParamSpecClass.OnValueValidate out = null;
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
    
    private static JnaParamSpecClass.OnValuesCmp toOnValuesCmp(ch.bailu.gtk.type.Pointer instance, String methodName, OnValuesCmp in) {
        JnaParamSpecClass.OnValuesCmp out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_pspec, _value1, _value2) -> in.onValuesCmp(__callback, new ParamSpec(new PointerContainer(_pspec)), new Value(new PointerContainer(_value1)), new Value(new PointerContainer(_value2)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnValueIsValid {
        /**
         * 
         * @param pspec 
         * @param value 
         * @return 
        */
        boolean onValueIsValid(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ParamSpec pspec, @Nonnull Value value);
    }
    
    private static JnaParamSpecClass.OnValueIsValid toOnValueIsValid(ch.bailu.gtk.type.Pointer instance, String methodName, OnValueIsValid in) {
        JnaParamSpecClass.OnValueIsValid out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_pspec, _value) -> in.onValueIsValid(__callback, new ParamSpec(new PointerContainer(_pspec)), new Value(new PointerContainer(_value)));
            __callback.register(out);
        }
        return out;
    }

    public ParamSpecClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaParamSpecClass.Fields _fields;
    
    JnaParamSpecClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaParamSpecClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the parent class
     * <br>Private field: direct-type
    */
    public static final String G_TYPE_CLASS = "g_type_class";

    /**
     * the &#35;GValue type for this parameter
    */
    public static final String VALUE_TYPE = "value_type";

    /**
     * the &#35;GValue type for this parameter
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
    public JnaParamSpecClass.OnFinalize getFieldFinalize() {
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
    public JnaParamSpecClass.OnValueSetDefault getFieldValueSetDefault() {
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
    public JnaParamSpecClass.OnValueValidate getFieldValueValidate() {
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
    public JnaParamSpecClass.OnValuesCmp getFieldValuesCmp() {
       toFields().readField(VALUES_CMP);
       return toFields().values_cmp;
    } 

    /**
     * 
     * <br>See {@link OnValueIsValid#onValueIsValid}
    */
    public static final String VALUE_IS_VALID = "value_is_valid";

    /**
     * 
     * <br>See {@link OnValueIsValid#onValueIsValid}
    */
    public void setFieldValueIsValid(OnValueIsValid value_is_valid) {
        toFields().value_is_valid = toOnValueIsValid(this, VALUE_IS_VALID, value_is_valid);
        toFields().writeField(VALUE_IS_VALID);
    }

    /**
     * 
     * <br>See {@link OnValueIsValid#onValueIsValid}
    */
    public JnaParamSpecClass.OnValueIsValid getFieldValueIsValid() {
       toFields().readField(VALUE_IS_VALID);
       return toFields().value_is_valid;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ParamSpec.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ParamSpec.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:dummy:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
