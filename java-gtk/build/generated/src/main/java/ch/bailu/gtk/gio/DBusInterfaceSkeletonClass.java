/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for &#35;GDBusInterfaceSkeleton.
 * <p><a href="https://docs.gtk.org/gio/struct.DBusInterfaceSkeletonClass.html">https://docs.gtk.org/gio/struct.DBusInterfaceSkeletonClass.html</a></p>
*/
public class DBusInterfaceSkeletonClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusInterfaceSkeletonClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetInfo {
        /**
         * 
         * @param interface_ A &#35;GDBusInterfaceSkeleton.
         * @return A &#35;GDBusInterfaceInfo (never %NULL). Do not free.
        */
        DBusInterfaceInfo onGetInfo(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusInterfaceSkeleton interface_);
    }
    
    private static JnaDBusInterfaceSkeletonClass.OnGetInfo toOnGetInfo(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetInfo in) {
        JnaDBusInterfaceSkeletonClass.OnGetInfo out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_interface_) -> in.onGetInfo(__callback, new DBusInterfaceSkeleton(new PointerContainer(_interface_))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetVtable {
        /**
         * 
         * @param interface_ A &#35;GDBusInterfaceSkeleton.
         * @return A &#35;GDBusInterfaceVTable (never %NULL).
        */
        DBusInterfaceVTable onGetVtable(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusInterfaceSkeleton interface_);
    }
    
    private static JnaDBusInterfaceSkeletonClass.OnGetVtable toOnGetVtable(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetVtable in) {
        JnaDBusInterfaceSkeletonClass.OnGetVtable out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_interface_) -> in.onGetVtable(__callback, new DBusInterfaceSkeleton(new PointerContainer(_interface_))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetProperties {
        /**
         * 
         * @param interface_ A &#35;GDBusInterfaceSkeleton.
         * @return A &#35;GVariant of type ['a{sv}'][G-VARIANT-TYPE-VARDICT:CAPS]. Free with g_variant_unref().
        */
        ch.bailu.gtk.glib.Variant onGetProperties(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusInterfaceSkeleton interface_);
    }
    
    private static JnaDBusInterfaceSkeletonClass.OnGetProperties toOnGetProperties(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetProperties in) {
        JnaDBusInterfaceSkeletonClass.OnGetProperties out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_interface_) -> in.onGetProperties(__callback, new DBusInterfaceSkeleton(new PointerContainer(_interface_))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFlush {
        /**
         * 
         * @param interface_ A &#35;GDBusInterfaceSkeleton.
        */
        void onFlush(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusInterfaceSkeleton interface_);
    }
    
    private static JnaDBusInterfaceSkeletonClass.OnFlush toOnFlush(ch.bailu.gtk.type.Pointer instance, String methodName, OnFlush in) {
        JnaDBusInterfaceSkeletonClass.OnFlush out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_interface_) -> in.onFlush(__callback, new DBusInterfaceSkeleton(new PointerContainer(_interface_)));
            __callback.register(out);
        }
        return out;
    }

    public DBusInterfaceSkeletonClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDBusInterfaceSkeletonClass.Fields _fields;
    
    JnaDBusInterfaceSkeletonClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusInterfaceSkeletonClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent class.
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnGetInfo#onGetInfo}
    */
    public static final String GET_INFO = "get_info";

    /**
     * 
     * <br>See {@link OnGetInfo#onGetInfo}
    */
    public void setFieldGetInfo(OnGetInfo get_info) {
        toFields().get_info = toOnGetInfo(this, GET_INFO, get_info);
        toFields().writeField(GET_INFO);
    }

    /**
     * 
     * <br>See {@link OnGetInfo#onGetInfo}
    */
    public JnaDBusInterfaceSkeletonClass.OnGetInfo getFieldGetInfo() {
       toFields().readField(GET_INFO);
       return toFields().get_info;
    } 

    /**
     * 
     * <br>See {@link OnGetVtable#onGetVtable}
    */
    public static final String GET_VTABLE = "get_vtable";

    /**
     * 
     * <br>See {@link OnGetVtable#onGetVtable}
    */
    public void setFieldGetVtable(OnGetVtable get_vtable) {
        toFields().get_vtable = toOnGetVtable(this, GET_VTABLE, get_vtable);
        toFields().writeField(GET_VTABLE);
    }

    /**
     * 
     * <br>See {@link OnGetVtable#onGetVtable}
    */
    public JnaDBusInterfaceSkeletonClass.OnGetVtable getFieldGetVtable() {
       toFields().readField(GET_VTABLE);
       return toFields().get_vtable;
    } 

    /**
     * 
     * <br>See {@link OnGetProperties#onGetProperties}
    */
    public static final String GET_PROPERTIES = "get_properties";

    /**
     * 
     * <br>See {@link OnGetProperties#onGetProperties}
    */
    public void setFieldGetProperties(OnGetProperties get_properties) {
        toFields().get_properties = toOnGetProperties(this, GET_PROPERTIES, get_properties);
        toFields().writeField(GET_PROPERTIES);
    }

    /**
     * 
     * <br>See {@link OnGetProperties#onGetProperties}
    */
    public JnaDBusInterfaceSkeletonClass.OnGetProperties getFieldGetProperties() {
       toFields().readField(GET_PROPERTIES);
       return toFields().get_properties;
    } 

    /**
     * 
     * <br>See {@link OnFlush#onFlush}
    */
    public static final String FLUSH = "flush";

    /**
     * 
     * <br>See {@link OnFlush#onFlush}
    */
    public void setFieldFlush(OnFlush flush) {
        toFields().flush = toOnFlush(this, FLUSH, flush);
        toFields().writeField(FLUSH);
    }

    /**
     * 
     * <br>See {@link OnFlush#onFlush}
    */
    public JnaDBusInterfaceSkeletonClass.OnFlush getFieldFlush() {
       toFields().readField(FLUSH);
       return toFields().flush;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusInterfaceSkeleton.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusInterfaceSkeleton.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:vfunc_padding:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:g_authorize_method:previous-field-unsupported:[MethodModel:Supported:gAuthorizeMethod:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:DBusInterfaceSkeleton:{c:GDBusInterfaceSkeleton*}}:{j:long}]
        [ParameterModel:Supported:{Gg:DBusMethodInvocation:{c:GDBusMethodInvocation*}}:{j:long}]]

[MethodModel:Supported:gAuthorizeMethod:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:DBusInterfaceSkeleton:{c:GDBusInterfaceSkeleton*}}:{j:long}]
        [ParameterModel:Supported:{Gg:DBusMethodInvocation:{c:GDBusMethodInvocation*}}:{j:long}]

[FieldModel:signal_padding:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
