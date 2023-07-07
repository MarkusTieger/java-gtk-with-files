/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Base type for D-Bus interfaces.
 * <p><a href="https://docs.gtk.org/gio/struct.DBusInterfaceIface.html">https://docs.gtk.org/gio/struct.DBusInterfaceIface.html</a></p>
*/
public class DBusInterfaceIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusInterfaceIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetInfo {
        /**
         * 
         * @param interface_ An exported D-Bus interface.
         * @return A &#35;GDBusInterfaceInfo. Do not free.
        */
        DBusInterfaceInfo onGetInfo(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusInterface interface_);
    }
    
    private static JnaDBusInterfaceIface.OnGetInfo toOnGetInfo(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetInfo in) {
        JnaDBusInterfaceIface.OnGetInfo out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_interface_) -> in.onGetInfo(__callback, new DBusInterface(new PointerContainer(_interface_))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetObject {
        /**
         * 
         * @param interface_ An exported D-Bus interface
         * @return A &#35;GDBusObject or %NULL. The returned     reference belongs to &#64;interface_ and should not be freed.
        */
        DBusObject onGetObject(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusInterface interface_);
    }
    
    private static JnaDBusInterfaceIface.OnGetObject toOnGetObject(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetObject in) {
        JnaDBusInterfaceIface.OnGetObject out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_interface_) -> in.onGetObject(__callback, new DBusInterface(new PointerContainer(_interface_))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetObject {
        /**
         * 
         * @param interface_ An exported D-Bus interface.
         * @param object A &#35;GDBusObject or %NULL.
        */
        void onSetObject(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusInterface interface_, @Nullable DBusObject object);
    }
    
    private static JnaDBusInterfaceIface.OnSetObject toOnSetObject(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetObject in) {
        JnaDBusInterfaceIface.OnSetObject out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_interface_, _object) -> in.onSetObject(__callback, new DBusInterface(new PointerContainer(_interface_)), new DBusObject(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDupObject {
        /**
         * 
         * @param interface_ An exported D-Bus interface.
         * @return A &#35;GDBusObject or %NULL. The returned reference should be freed with g_object_unref().
        */
        DBusObject onDupObject(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusInterface interface_);
    }
    
    private static JnaDBusInterfaceIface.OnDupObject toOnDupObject(ch.bailu.gtk.type.Pointer instance, String methodName, OnDupObject in) {
        JnaDBusInterfaceIface.OnDupObject out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_interface_) -> in.onDupObject(__callback, new DBusInterface(new PointerContainer(_interface_))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public DBusInterfaceIface(PointerContainer pointer) {
        super(pointer);
    }

    public DBusInterfaceIface() {
        super(cast(JnaDBusInterfaceIface.allocateStructure()));
    }

    private JnaDBusInterfaceIface.Fields _fields;
    
    JnaDBusInterfaceIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusInterfaceIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String PARENT_IFACE = "parent_iface";

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
    public JnaDBusInterfaceIface.OnGetInfo getFieldGetInfo() {
       toFields().readField(GET_INFO);
       return toFields().get_info;
    } 

    /**
     * 
     * <br>See {@link OnGetObject#onGetObject}
    */
    public static final String GET_OBJECT = "get_object";

    /**
     * 
     * <br>See {@link OnGetObject#onGetObject}
    */
    public void setFieldGetObject(OnGetObject get_object) {
        toFields().get_object = toOnGetObject(this, GET_OBJECT, get_object);
        toFields().writeField(GET_OBJECT);
    }

    /**
     * 
     * <br>See {@link OnGetObject#onGetObject}
    */
    public JnaDBusInterfaceIface.OnGetObject getFieldGetObject() {
       toFields().readField(GET_OBJECT);
       return toFields().get_object;
    } 

    /**
     * 
     * <br>See {@link OnSetObject#onSetObject}
    */
    public static final String SET_OBJECT = "set_object";

    /**
     * 
     * <br>See {@link OnSetObject#onSetObject}
    */
    public void setFieldSetObject(OnSetObject set_object) {
        toFields().set_object = toOnSetObject(this, SET_OBJECT, set_object);
        toFields().writeField(SET_OBJECT);
    }

    /**
     * 
     * <br>See {@link OnSetObject#onSetObject}
    */
    public JnaDBusInterfaceIface.OnSetObject getFieldSetObject() {
       toFields().readField(SET_OBJECT);
       return toFields().set_object;
    } 

    /**
     * 
     * <br>See {@link OnDupObject#onDupObject}
    */
    public static final String DUP_OBJECT = "dup_object";

    /**
     * 
     * <br>See {@link OnDupObject#onDupObject}
    */
    public void setFieldDupObject(OnDupObject dup_object) {
        toFields().dup_object = toOnDupObject(this, DUP_OBJECT, dup_object);
        toFields().writeField(DUP_OBJECT);
    }

    /**
     * 
     * <br>See {@link OnDupObject#onDupObject}
    */
    public JnaDBusInterfaceIface.OnDupObject getFieldDupObject() {
       toFields().readField(DUP_OBJECT);
       return toFields().dup_object;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusInterface.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusInterface.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
