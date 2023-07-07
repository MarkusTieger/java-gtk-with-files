/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkBuildableIface` interface contains methods that are
 * <br>necessary to allow `GtkBuilder` to construct an object from
 * <br>a `GtkBuilder` UI definition.
 * <p><a href="https://docs.gtk.org/gtk4/struct.BuildableIface.html">https://docs.gtk.org/gtk4/struct.BuildableIface.html</a></p>
*/
public class BuildableIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BuildableIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnSetId {
        /**
         * 
         * @param buildable 
         * @param id 
        */
        void onSetId(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Buildable buildable, @Nonnull ch.bailu.gtk.type.Str id);
    }
    
    private static JnaBuildableIface.OnSetId toOnSetId(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetId in) {
        JnaBuildableIface.OnSetId out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buildable, _id) -> in.onSetId(__callback, new Buildable(new PointerContainer(_buildable)), new ch.bailu.gtk.type.Str(new PointerContainer(_id)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetId {
        /**
         * 
         * @param buildable 
         * @return 
        */
        ch.bailu.gtk.type.Str onGetId(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Buildable buildable);
    }
    
    private static JnaBuildableIface.OnGetId toOnGetId(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetId in) {
        JnaBuildableIface.OnGetId out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buildable) -> in.onGetId(__callback, new Buildable(new PointerContainer(_buildable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAddChild {
        /**
         * 
         * @param buildable a `GtkBuildable`
         * @param builder a `GtkBuilder`
         * @param child child to add
         * @param type kind of child or %NULL
        */
        void onAddChild(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Buildable buildable, @Nonnull Builder builder, @Nonnull ch.bailu.gtk.gobject.Object child, @Nullable ch.bailu.gtk.type.Str type);
    }
    
    private static JnaBuildableIface.OnAddChild toOnAddChild(ch.bailu.gtk.type.Pointer instance, String methodName, OnAddChild in) {
        JnaBuildableIface.OnAddChild out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buildable, _builder, _child, _type) -> in.onAddChild(__callback, new Buildable(new PointerContainer(_buildable)), new Builder(new PointerContainer(_builder)), new ch.bailu.gtk.gobject.Object(new PointerContainer(_child)), new ch.bailu.gtk.type.Str(new PointerContainer(_type)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetBuildableProperty {
        /**
         * 
         * @param buildable 
         * @param builder 
         * @param name 
         * @param value 
        */
        void onSetBuildableProperty(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Buildable buildable, @Nonnull Builder builder, @Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.gobject.Value value);
    }
    
    private static JnaBuildableIface.OnSetBuildableProperty toOnSetBuildableProperty(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetBuildableProperty in) {
        JnaBuildableIface.OnSetBuildableProperty out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buildable, _builder, _name, _value) -> in.onSetBuildableProperty(__callback, new Buildable(new PointerContainer(_buildable)), new Builder(new PointerContainer(_builder)), new ch.bailu.gtk.type.Str(new PointerContainer(_name)), new ch.bailu.gtk.gobject.Value(new PointerContainer(_value)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnConstructChild {
        /**
         * 
         * @param buildable 
         * @param builder 
         * @param name 
         * @return 
        */
        ch.bailu.gtk.gobject.Object onConstructChild(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Buildable buildable, @Nonnull Builder builder, @Nonnull ch.bailu.gtk.type.Str name);
    }
    
    private static JnaBuildableIface.OnConstructChild toOnConstructChild(ch.bailu.gtk.type.Pointer instance, String methodName, OnConstructChild in) {
        JnaBuildableIface.OnConstructChild out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_buildable, _builder, _name) -> in.onConstructChild(__callback, new Buildable(new PointerContainer(_buildable)), new Builder(new PointerContainer(_builder)), new ch.bailu.gtk.type.Str(new PointerContainer(_name))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public BuildableIface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaBuildableIface.Fields _fields;
    
    JnaBuildableIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaBuildableIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the parent class
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnSetId#onSetId}
    */
    public static final String SET_ID = "set_id";

    /**
     * 
     * <br>See {@link OnSetId#onSetId}
    */
    public void setFieldSetId(OnSetId set_id) {
        toFields().set_id = toOnSetId(this, SET_ID, set_id);
        toFields().writeField(SET_ID);
    }

    /**
     * 
     * <br>See {@link OnSetId#onSetId}
    */
    public JnaBuildableIface.OnSetId getFieldSetId() {
       toFields().readField(SET_ID);
       return toFields().set_id;
    } 

    /**
     * 
     * <br>See {@link OnGetId#onGetId}
    */
    public static final String GET_ID = "get_id";

    /**
     * 
     * <br>See {@link OnGetId#onGetId}
    */
    public void setFieldGetId(OnGetId get_id) {
        toFields().get_id = toOnGetId(this, GET_ID, get_id);
        toFields().writeField(GET_ID);
    }

    /**
     * 
     * <br>See {@link OnGetId#onGetId}
    */
    public JnaBuildableIface.OnGetId getFieldGetId() {
       toFields().readField(GET_ID);
       return toFields().get_id;
    } 

    /**
     * 
     * <br>See {@link OnAddChild#onAddChild}
    */
    public static final String ADD_CHILD = "add_child";

    /**
     * 
     * <br>See {@link OnAddChild#onAddChild}
    */
    public void setFieldAddChild(OnAddChild add_child) {
        toFields().add_child = toOnAddChild(this, ADD_CHILD, add_child);
        toFields().writeField(ADD_CHILD);
    }

    /**
     * 
     * <br>See {@link OnAddChild#onAddChild}
    */
    public JnaBuildableIface.OnAddChild getFieldAddChild() {
       toFields().readField(ADD_CHILD);
       return toFields().add_child;
    } 

    /**
     * 
     * <br>See {@link OnSetBuildableProperty#onSetBuildableProperty}
    */
    public static final String SET_BUILDABLE_PROPERTY = "set_buildable_property";

    /**
     * 
     * <br>See {@link OnSetBuildableProperty#onSetBuildableProperty}
    */
    public void setFieldSetBuildableProperty(OnSetBuildableProperty set_buildable_property) {
        toFields().set_buildable_property = toOnSetBuildableProperty(this, SET_BUILDABLE_PROPERTY, set_buildable_property);
        toFields().writeField(SET_BUILDABLE_PROPERTY);
    }

    /**
     * 
     * <br>See {@link OnSetBuildableProperty#onSetBuildableProperty}
    */
    public JnaBuildableIface.OnSetBuildableProperty getFieldSetBuildableProperty() {
       toFields().readField(SET_BUILDABLE_PROPERTY);
       return toFields().set_buildable_property;
    } 

    /**
     * 
     * <br>See {@link OnConstructChild#onConstructChild}
    */
    public static final String CONSTRUCT_CHILD = "construct_child";

    /**
     * 
     * <br>See {@link OnConstructChild#onConstructChild}
    */
    public void setFieldConstructChild(OnConstructChild construct_child) {
        toFields().construct_child = toOnConstructChild(this, CONSTRUCT_CHILD, construct_child);
        toFields().writeField(CONSTRUCT_CHILD);
    }

    /**
     * 
     * <br>See {@link OnConstructChild#onConstructChild}
    */
    public JnaBuildableIface.OnConstructChild getFieldConstructChild() {
       toFields().readField(CONSTRUCT_CHILD);
       return toFields().construct_child;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Buildable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Buildable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:custom_tag_start:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:custom_tag_end:previous-field-unsupported:[MethodModel:Supported:customTagEnd:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Buildable:{c:GtkBuildable*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Builder:{c:GtkBuilder*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:customTagEnd:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Buildable:{c:GtkBuildable*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Builder:{c:GtkBuilder*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:custom_finished:previous-field-unsupported:[MethodModel:Supported:customFinished:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Buildable:{c:GtkBuildable*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Builder:{c:GtkBuilder*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:customFinished:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Buildable:{c:GtkBuildable*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Builder:{c:GtkBuilder*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:parser_finished:previous-field-unsupported:[MethodModel:Supported:parserFinished:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Buildable:{c:GtkBuildable*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Builder:{c:GtkBuilder*}}:{j:long}]]

[MethodModel:Supported:parserFinished:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Buildable:{c:GtkBuildable*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Builder:{c:GtkBuilder*}}:{j:long}]

[FieldModel:get_internal_child:previous-field-unsupported:[MethodModel:Supported:getInternalChild:[ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Buildable:{c:GtkBuildable*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Builder:{c:GtkBuilder*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]]

[MethodModel:Supported:getInternalChild:[ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Buildable:{c:GtkBuildable*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Builder:{c:GtkBuilder*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
*/
