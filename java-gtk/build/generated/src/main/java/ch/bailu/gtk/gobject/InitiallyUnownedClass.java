/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The class structure for the GInitiallyUnowned type.
 * <p><a href="https://docs.gtk.org/gobject/struct.InitiallyUnownedClass.html">https://docs.gtk.org/gobject/struct.InitiallyUnownedClass.html</a></p>
*/
public class InitiallyUnownedClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InitiallyUnownedClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnConstructor {
        /**
         * 
         * @param type 
         * @param n_construct_properties 
         * @param construct_properties 
         * @return 
        */
        Object onConstructor(ch.bailu.gtk.lib.handler.CallbackHandler __self, long type, int n_construct_properties, @Nonnull ObjectConstructParam construct_properties);
    }
    
    private static JnaInitiallyUnownedClass.OnConstructor toOnConstructor(ch.bailu.gtk.type.Pointer instance, String methodName, OnConstructor in) {
        JnaInitiallyUnownedClass.OnConstructor out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_type, _n_construct_properties, _construct_properties) -> in.onConstructor(__callback, _type, _n_construct_properties, new ObjectConstructParam(new PointerContainer(_construct_properties))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetProperty {
        /**
         * 
         * @param object 
         * @param property_id 
         * @param value 
         * @param pspec 
        */
        void onSetProperty(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Object object, int property_id, @Nonnull Value value, @Nonnull ParamSpec pspec);
    }
    
    private static JnaInitiallyUnownedClass.OnSetProperty toOnSetProperty(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetProperty in) {
        JnaInitiallyUnownedClass.OnSetProperty out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object, _property_id, _value, _pspec) -> in.onSetProperty(__callback, new Object(new PointerContainer(_object)), _property_id, new Value(new PointerContainer(_value)), new ParamSpec(new PointerContainer(_pspec)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetProperty {
        /**
         * 
         * @param object 
         * @param property_id 
         * @param value 
         * @param pspec 
        */
        void onGetProperty(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Object object, int property_id, @Nonnull Value value, @Nonnull ParamSpec pspec);
    }
    
    private static JnaInitiallyUnownedClass.OnGetProperty toOnGetProperty(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetProperty in) {
        JnaInitiallyUnownedClass.OnGetProperty out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object, _property_id, _value, _pspec) -> in.onGetProperty(__callback, new Object(new PointerContainer(_object)), _property_id, new Value(new PointerContainer(_value)), new ParamSpec(new PointerContainer(_pspec)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDispose {
        /**
         * 
         * @param object 
        */
        void onDispose(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Object object);
    }
    
    private static JnaInitiallyUnownedClass.OnDispose toOnDispose(ch.bailu.gtk.type.Pointer instance, String methodName, OnDispose in) {
        JnaInitiallyUnownedClass.OnDispose out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onDispose(__callback, new Object(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFinalize {
        /**
         * 
         * @param object 
        */
        void onFinalize(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Object object);
    }
    
    private static JnaInitiallyUnownedClass.OnFinalize toOnFinalize(ch.bailu.gtk.type.Pointer instance, String methodName, OnFinalize in) {
        JnaInitiallyUnownedClass.OnFinalize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onFinalize(__callback, new Object(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    public InitiallyUnownedClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaInitiallyUnownedClass.Fields _fields;
    
    JnaInitiallyUnownedClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaInitiallyUnownedClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the parent class
     * <br>Private field: direct-type
    */
    public static final String G_TYPE_CLASS = "g_type_class";

    /**
     * 
    */
    public static final String CONSTRUCT_PROPERTIES = "construct_properties";

    /**
     * 
    */
    public ch.bailu.gtk.glib.SList getFieldConstructProperties() {
       toFields().readField(CONSTRUCT_PROPERTIES);
       return new ch.bailu.gtk.glib.SList(new PointerContainer(toFields().construct_properties));
    } 

    /**
     * 
     * <br>See {@link OnConstructor#onConstructor}
    */
    public static final String CONSTRUCTOR = "constructor";

    /**
     * 
     * <br>See {@link OnConstructor#onConstructor}
    */
    public void setFieldConstructor(OnConstructor constructor) {
        toFields().constructor = toOnConstructor(this, CONSTRUCTOR, constructor);
        toFields().writeField(CONSTRUCTOR);
    }

    /**
     * 
     * <br>See {@link OnConstructor#onConstructor}
    */
    public JnaInitiallyUnownedClass.OnConstructor getFieldConstructor() {
       toFields().readField(CONSTRUCTOR);
       return toFields().constructor;
    } 

    /**
     * 
     * <br>See {@link OnSetProperty#onSetProperty}
    */
    public static final String SET_PROPERTY = "set_property";

    /**
     * 
     * <br>See {@link OnSetProperty#onSetProperty}
    */
    public void setFieldSetProperty(OnSetProperty set_property) {
        toFields().set_property = toOnSetProperty(this, SET_PROPERTY, set_property);
        toFields().writeField(SET_PROPERTY);
    }

    /**
     * 
     * <br>See {@link OnSetProperty#onSetProperty}
    */
    public JnaInitiallyUnownedClass.OnSetProperty getFieldSetProperty() {
       toFields().readField(SET_PROPERTY);
       return toFields().set_property;
    } 

    /**
     * 
     * <br>See {@link OnGetProperty#onGetProperty}
    */
    public static final String GET_PROPERTY = "get_property";

    /**
     * 
     * <br>See {@link OnGetProperty#onGetProperty}
    */
    public void setFieldGetProperty(OnGetProperty get_property) {
        toFields().get_property = toOnGetProperty(this, GET_PROPERTY, get_property);
        toFields().writeField(GET_PROPERTY);
    }

    /**
     * 
     * <br>See {@link OnGetProperty#onGetProperty}
    */
    public JnaInitiallyUnownedClass.OnGetProperty getFieldGetProperty() {
       toFields().readField(GET_PROPERTY);
       return toFields().get_property;
    } 

    /**
     * 
     * <br>See {@link OnDispose#onDispose}
    */
    public static final String DISPOSE = "dispose";

    /**
     * 
     * <br>See {@link OnDispose#onDispose}
    */
    public void setFieldDispose(OnDispose dispose) {
        toFields().dispose = toOnDispose(this, DISPOSE, dispose);
        toFields().writeField(DISPOSE);
    }

    /**
     * 
     * <br>See {@link OnDispose#onDispose}
    */
    public JnaInitiallyUnownedClass.OnDispose getFieldDispose() {
       toFields().readField(DISPOSE);
       return toFields().dispose;
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
    public JnaInitiallyUnownedClass.OnFinalize getFieldFinalize() {
       toFields().readField(FINALIZE);
       return toFields().finalize;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(InitiallyUnowned.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(InitiallyUnowned.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:dispatch_properties_changed:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:notify:previous-field-unsupported:[MethodModel:Supported:notify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:ParamSpec:{c:GParamSpec*}}:{j:long}]]

[MethodModel:Supported:notify:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:ParamSpec:{c:GParamSpec*}}:{j:long}]

[FieldModel:constructed:previous-field-unsupported:[MethodModel:Supported:constructed:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]]

[MethodModel:Supported:constructed:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]

[FieldModel:flags:previous-field-unsupported:{G_::{c:gsize}}:{j:long}]

[FieldModel:n_construct_properties:previous-field-unsupported:{G_::{c:gsize}}:{j:long}]

[FieldModel:pspecs:previous-field-unsupported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:n_pspecs:previous-field-unsupported:{G_::{c:gsize}}:{j:long}]

[FieldModel:pdummy:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
