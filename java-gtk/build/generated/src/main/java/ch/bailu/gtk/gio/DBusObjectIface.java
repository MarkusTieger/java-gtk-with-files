/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Base object type for D-Bus objects.
 * <p><a href="https://docs.gtk.org/gio/struct.DBusObjectIface.html">https://docs.gtk.org/gio/struct.DBusObjectIface.html</a></p>
*/
public class DBusObjectIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusObjectIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetObjectPath {
        /**
         * 
         * @param object A &#35;GDBusObject.
         * @return A string owned by &#64;object. Do not free.
        */
        ch.bailu.gtk.type.Str onGetObjectPath(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObject object);
    }
    
    private static JnaDBusObjectIface.OnGetObjectPath toOnGetObjectPath(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetObjectPath in) {
        JnaDBusObjectIface.OnGetObjectPath out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetObjectPath(__callback, new DBusObject(new PointerContainer(_object))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetInterfaces {
        /**
         * 
         * @param object A &#35;GDBusObject.
         * @return A list of &#35;GDBusInterface instances.   The returned list must be freed by g_list_free() after each element has been freed   with g_object_unref().
        */
        ch.bailu.gtk.glib.List onGetInterfaces(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObject object);
    }
    
    private static JnaDBusObjectIface.OnGetInterfaces toOnGetInterfaces(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetInterfaces in) {
        JnaDBusObjectIface.OnGetInterfaces out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object) -> in.onGetInterfaces(__callback, new DBusObject(new PointerContainer(_object))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetInterface {
        /**
         * 
         * @param object A &#35;GDBusObject.
         * @param interface_name A D-Bus interface name.
         * @return %NULL if not found, otherwise a   &#35;GDBusInterface that must be freed with g_object_unref().
        */
        DBusInterface onGetInterface(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObject object, @Nonnull ch.bailu.gtk.type.Str interface_name);
    }
    
    private static JnaDBusObjectIface.OnGetInterface toOnGetInterface(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetInterface in) {
        JnaDBusObjectIface.OnGetInterface out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object, _interface_name) -> in.onGetInterface(__callback, new DBusObject(new PointerContainer(_object)), new ch.bailu.gtk.type.Str(new PointerContainer(_interface_name))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnInterfaceAdded {
        /**
         * 
         * @param object 
         * @param interface_ 
        */
        void onInterfaceAdded(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObject object, @Nonnull DBusInterface interface_);
    }
    
    private static JnaDBusObjectIface.OnInterfaceAdded toOnInterfaceAdded(ch.bailu.gtk.type.Pointer instance, String methodName, OnInterfaceAdded in) {
        JnaDBusObjectIface.OnInterfaceAdded out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object, _interface_) -> in.onInterfaceAdded(__callback, new DBusObject(new PointerContainer(_object)), new DBusInterface(new PointerContainer(_interface_)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnInterfaceRemoved {
        /**
         * 
         * @param object 
         * @param interface_ 
        */
        void onInterfaceRemoved(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObject object, @Nonnull DBusInterface interface_);
    }
    
    private static JnaDBusObjectIface.OnInterfaceRemoved toOnInterfaceRemoved(ch.bailu.gtk.type.Pointer instance, String methodName, OnInterfaceRemoved in) {
        JnaDBusObjectIface.OnInterfaceRemoved out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_object, _interface_) -> in.onInterfaceRemoved(__callback, new DBusObject(new PointerContainer(_object)), new DBusInterface(new PointerContainer(_interface_)));
            __callback.register(out);
        }
        return out;
    }

    public DBusObjectIface(PointerContainer pointer) {
        super(pointer);
    }

    public DBusObjectIface() {
        super(cast(JnaDBusObjectIface.allocateStructure()));
    }

    private JnaDBusObjectIface.Fields _fields;
    
    JnaDBusObjectIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusObjectIface.Fields(asCPointer());
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
     * <br>See {@link OnGetObjectPath#onGetObjectPath}
    */
    public static final String GET_OBJECT_PATH = "get_object_path";

    /**
     * 
     * <br>See {@link OnGetObjectPath#onGetObjectPath}
    */
    public void setFieldGetObjectPath(OnGetObjectPath get_object_path) {
        toFields().get_object_path = toOnGetObjectPath(this, GET_OBJECT_PATH, get_object_path);
        toFields().writeField(GET_OBJECT_PATH);
    }

    /**
     * 
     * <br>See {@link OnGetObjectPath#onGetObjectPath}
    */
    public JnaDBusObjectIface.OnGetObjectPath getFieldGetObjectPath() {
       toFields().readField(GET_OBJECT_PATH);
       return toFields().get_object_path;
    } 

    /**
     * 
     * <br>See {@link OnGetInterfaces#onGetInterfaces}
    */
    public static final String GET_INTERFACES = "get_interfaces";

    /**
     * 
     * <br>See {@link OnGetInterfaces#onGetInterfaces}
    */
    public void setFieldGetInterfaces(OnGetInterfaces get_interfaces) {
        toFields().get_interfaces = toOnGetInterfaces(this, GET_INTERFACES, get_interfaces);
        toFields().writeField(GET_INTERFACES);
    }

    /**
     * 
     * <br>See {@link OnGetInterfaces#onGetInterfaces}
    */
    public JnaDBusObjectIface.OnGetInterfaces getFieldGetInterfaces() {
       toFields().readField(GET_INTERFACES);
       return toFields().get_interfaces;
    } 

    /**
     * 
     * <br>See {@link OnGetInterface#onGetInterface}
    */
    public static final String GET_INTERFACE = "get_interface";

    /**
     * 
     * <br>See {@link OnGetInterface#onGetInterface}
    */
    public void setFieldGetInterface(OnGetInterface get_interface) {
        toFields().get_interface = toOnGetInterface(this, GET_INTERFACE, get_interface);
        toFields().writeField(GET_INTERFACE);
    }

    /**
     * 
     * <br>See {@link OnGetInterface#onGetInterface}
    */
    public JnaDBusObjectIface.OnGetInterface getFieldGetInterface() {
       toFields().readField(GET_INTERFACE);
       return toFields().get_interface;
    } 

    /**
     * 
     * <br>See {@link OnInterfaceAdded#onInterfaceAdded}
    */
    public static final String INTERFACE_ADDED = "interface_added";

    /**
     * 
     * <br>See {@link OnInterfaceAdded#onInterfaceAdded}
    */
    public void setFieldInterfaceAdded(OnInterfaceAdded interface_added) {
        toFields().interface_added = toOnInterfaceAdded(this, INTERFACE_ADDED, interface_added);
        toFields().writeField(INTERFACE_ADDED);
    }

    /**
     * 
     * <br>See {@link OnInterfaceAdded#onInterfaceAdded}
    */
    public JnaDBusObjectIface.OnInterfaceAdded getFieldInterfaceAdded() {
       toFields().readField(INTERFACE_ADDED);
       return toFields().interface_added;
    } 

    /**
     * 
     * <br>See {@link OnInterfaceRemoved#onInterfaceRemoved}
    */
    public static final String INTERFACE_REMOVED = "interface_removed";

    /**
     * 
     * <br>See {@link OnInterfaceRemoved#onInterfaceRemoved}
    */
    public void setFieldInterfaceRemoved(OnInterfaceRemoved interface_removed) {
        toFields().interface_removed = toOnInterfaceRemoved(this, INTERFACE_REMOVED, interface_removed);
        toFields().writeField(INTERFACE_REMOVED);
    }

    /**
     * 
     * <br>See {@link OnInterfaceRemoved#onInterfaceRemoved}
    */
    public JnaDBusObjectIface.OnInterfaceRemoved getFieldInterfaceRemoved() {
       toFields().readField(INTERFACE_REMOVED);
       return toFields().interface_removed;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusObject.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusObject.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
