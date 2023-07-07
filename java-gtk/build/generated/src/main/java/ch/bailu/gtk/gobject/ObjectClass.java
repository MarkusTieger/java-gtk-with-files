/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The class structure for the GObject type.
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * // Example of implementing a singleton using a constructor.
 * static MySingleton *the_singleton = NULL;
 * 
 * static GObject*
 * my_singleton_constructor (GType                  type,
 *                           guint                  n_construct_params,
 *                           GObjectConstructParam *construct_params)
 * {
 *   GObject *object;
 *   
 *   if (!the_singleton)
 *     {
 *       object = G_OBJECT_CLASS (parent_class)-&gt;constructor (type,
 *                                                            n_construct_params,
 *                                                            construct_params);
 *       the_singleton = MY_SINGLETON (object);
 *     }
 *   else
 *     object = g_object_ref (G_OBJECT (the_singleton));
 * 
 *   return object;
 * }
 * </pre>
 * <p><a href="https://docs.gtk.org/gobject/struct.ObjectClass.html">https://docs.gtk.org/gobject/struct.ObjectClass.html</a></p>
*/
public class ObjectClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ObjectClass.class.getCanonicalName());
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
    
    private static JnaObjectClass.OnConstructor toOnConstructor(ch.bailu.gtk.type.Pointer instance, String methodName, OnConstructor in) {
        JnaObjectClass.OnConstructor out = null;
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
    
    private static JnaObjectClass.OnSetProperty toOnSetProperty(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetProperty in) {
        JnaObjectClass.OnSetProperty out = null;
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
    
    private static JnaObjectClass.OnGetProperty toOnGetProperty(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetProperty in) {
        JnaObjectClass.OnGetProperty out = null;
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
    
    private static JnaObjectClass.OnDispose toOnDispose(ch.bailu.gtk.type.Pointer instance, String methodName, OnDispose in) {
        JnaObjectClass.OnDispose out = null;
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
    
    private static JnaObjectClass.OnFinalize toOnFinalize(ch.bailu.gtk.type.Pointer instance, String methodName, OnFinalize in) {
        JnaObjectClass.OnFinalize out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onFinalize(__callback, new Object(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    public ObjectClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaObjectClass.Fields _fields;
    
    JnaObjectClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaObjectClass.Fields(asCPointer());
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
    public JnaObjectClass.OnConstructor getFieldConstructor() {
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
    public JnaObjectClass.OnSetProperty getFieldSetProperty() {
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
    public JnaObjectClass.OnGetProperty getFieldGetProperty() {
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
    public JnaObjectClass.OnDispose getFieldDispose() {
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
    public JnaObjectClass.OnFinalize getFieldFinalize() {
       toFields().readField(FINALIZE);
       return toFields().finalize;
    } 

    /**
     * Looks up the &#35;GParamSpec for a property of a class.
     * @param property_name the name of the property to look up
     * @return the &#35;GParamSpec for the property, or          %NULL if the class doesn't have a property of that name
    */
    public ParamSpec findProperty(@Nonnull ch.bailu.gtk.type.Str property_name)  {
        return new ParamSpec(new PointerContainer(JnaObjectClass.INST().g_object_class_find_property(asCPointer(), asCPointerNotNull(property_name))));
    }

    /**
     * Looks up the &#35;GParamSpec for a property of a class.
     * @param property_name the name of the property to look up
     * @return the &#35;GParamSpec for the property, or          %NULL if the class doesn't have a property of that name
    */
    public ParamSpec findProperty(String property_name)  {
        return new ParamSpec(new PointerContainer(JnaObjectClass.INST().g_object_class_find_property(asCPointer(), property_name)));
    }

    /**
     * Installs a new property.
     * <br>
     * <br>All properties should be installed during the class initializer.  It
     * <br>is possible to install properties after that, but doing so is not
     * <br>recommend, and specifically, is not guaranteed to be thread-safe vs.
     * <br>use of properties on the same type on other threads.
     * <br>
     * <br>Note that it is possible to redefine a property in a derived class,
     * <br>by installing a property with the same name. This can be useful at times,
     * <br>e.g. to change the range of allowed values or the default value.
     * @param property_id the id for the new property
     * @param pspec the &#35;GParamSpec for the new property
    */
    public void installProperty(int property_id, @Nonnull ParamSpec pspec)  {
        JnaObjectClass.INST().g_object_class_install_property(asCPointer(), property_id, asCPointerNotNull(pspec));
    }

    /**
     * Registers &#64;property_id as referring to a property with the name
     * <br>&#64;name in a parent class or in an interface implemented by &#64;oclass.
     * <br>This allows this class to &quot;override&quot; a property implementation in
     * <br>a parent class or to provide the implementation of a property from
     * <br>an interface.
     * <br>
     * <br>Internally, overriding is implemented by creating a property of type
     * <br>&#35;GParamSpecOverride; generally operations that query the properties of
     * <br>the object class, such as g_object_class_find_property() or
     * <br>g_object_class_list_properties() will return the overridden
     * <br>property. However, in one case, the &#64;construct_properties argument of
     * <br>the &#64;constructor virtual function, the &#35;GParamSpecOverride is passed
     * <br>instead, so that the &#64;param_id field of the &#35;GParamSpec will be
     * <br>correct.  For virtually all uses, this makes no difference. If you
     * <br>need to get the overridden property, you can call
     * <br>g_param_spec_get_redirect_target().
     * @param property_id the new property ID
     * @param name the name of a property registered in a parent class or  in an interface of this class.
    */
    public void overrideProperty(int property_id, @Nonnull ch.bailu.gtk.type.Str name)  {
        JnaObjectClass.INST().g_object_class_override_property(asCPointer(), property_id, asCPointerNotNull(name));
    }

    /**
     * Registers &#64;property_id as referring to a property with the name
     * <br>&#64;name in a parent class or in an interface implemented by &#64;oclass.
     * <br>This allows this class to &quot;override&quot; a property implementation in
     * <br>a parent class or to provide the implementation of a property from
     * <br>an interface.
     * <br>
     * <br>Internally, overriding is implemented by creating a property of type
     * <br>&#35;GParamSpecOverride; generally operations that query the properties of
     * <br>the object class, such as g_object_class_find_property() or
     * <br>g_object_class_list_properties() will return the overridden
     * <br>property. However, in one case, the &#64;construct_properties argument of
     * <br>the &#64;constructor virtual function, the &#35;GParamSpecOverride is passed
     * <br>instead, so that the &#64;param_id field of the &#35;GParamSpec will be
     * <br>correct.  For virtually all uses, this makes no difference. If you
     * <br>need to get the overridden property, you can call
     * <br>g_param_spec_get_redirect_target().
     * @param property_id the new property ID
     * @param name the name of a property registered in a parent class or  in an interface of this class.
    */
    public void overrideProperty(int property_id, String name)  {
        JnaObjectClass.INST().g_object_class_override_property(asCPointer(), property_id, name);
    }

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Object.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Object.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[MethodModel:java-type-not-supported:installProperties:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GParamSpec**}}:{j:}]

[MethodModel:cb-return-value-not-supported:java-type-not-supported:listProperties:[ParameterModel:java-type-not-supported:{G_::{c:GParamSpec**}}:{j:}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

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
