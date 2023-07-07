/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Base type for D-Bus object managers.
 * <p><a href="https://docs.gtk.org/gio/struct.DBusObjectManagerIface.html">https://docs.gtk.org/gio/struct.DBusObjectManagerIface.html</a></p>
*/
public class DBusObjectManagerIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusObjectManagerIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetObjectPath {
        /**
         * 
         * @param manager A &#35;GDBusObjectManager.
         * @return A string owned by &#64;manager. Do not free.
        */
        ch.bailu.gtk.type.Str onGetObjectPath(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObjectManager manager);
    }
    
    private static JnaDBusObjectManagerIface.OnGetObjectPath toOnGetObjectPath(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetObjectPath in) {
        JnaDBusObjectManagerIface.OnGetObjectPath out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager) -> in.onGetObjectPath(__callback, new DBusObjectManager(new PointerContainer(_manager))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetObjects {
        /**
         * 
         * @param manager A &#35;GDBusObjectManager.
         * @return A list of   &#35;GDBusObject objects. The returned list should be freed with   g_list_free() after each element has been freed with   g_object_unref().
        */
        ch.bailu.gtk.glib.List onGetObjects(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObjectManager manager);
    }
    
    private static JnaDBusObjectManagerIface.OnGetObjects toOnGetObjects(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetObjects in) {
        JnaDBusObjectManagerIface.OnGetObjects out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager) -> in.onGetObjects(__callback, new DBusObjectManager(new PointerContainer(_manager))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetObject {
        /**
         * 
         * @param manager A &#35;GDBusObjectManager.
         * @param object_path Object path to look up.
         * @return A &#35;GDBusObject or %NULL. Free with   g_object_unref().
        */
        DBusObject onGetObject(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObjectManager manager, @Nonnull ch.bailu.gtk.type.Str object_path);
    }
    
    private static JnaDBusObjectManagerIface.OnGetObject toOnGetObject(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetObject in) {
        JnaDBusObjectManagerIface.OnGetObject out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager, _object_path) -> in.onGetObject(__callback, new DBusObjectManager(new PointerContainer(_manager)), new ch.bailu.gtk.type.Str(new PointerContainer(_object_path))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetInterface {
        /**
         * 
         * @param manager A &#35;GDBusObjectManager.
         * @param object_path Object path to look up.
         * @param interface_name D-Bus interface name to look up.
         * @return A &#35;GDBusInterface instance or %NULL. Free   with g_object_unref().
        */
        DBusInterface onGetInterface(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObjectManager manager, @Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull ch.bailu.gtk.type.Str interface_name);
    }
    
    private static JnaDBusObjectManagerIface.OnGetInterface toOnGetInterface(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetInterface in) {
        JnaDBusObjectManagerIface.OnGetInterface out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager, _object_path, _interface_name) -> in.onGetInterface(__callback, new DBusObjectManager(new PointerContainer(_manager)), new ch.bailu.gtk.type.Str(new PointerContainer(_object_path)), new ch.bailu.gtk.type.Str(new PointerContainer(_interface_name))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnObjectAdded {
        /**
         * 
         * @param manager 
         * @param object 
        */
        void onObjectAdded(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObjectManager manager, @Nonnull DBusObject object);
    }
    
    private static JnaDBusObjectManagerIface.OnObjectAdded toOnObjectAdded(ch.bailu.gtk.type.Pointer instance, String methodName, OnObjectAdded in) {
        JnaDBusObjectManagerIface.OnObjectAdded out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager, _object) -> in.onObjectAdded(__callback, new DBusObjectManager(new PointerContainer(_manager)), new DBusObject(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnObjectRemoved {
        /**
         * 
         * @param manager 
         * @param object 
        */
        void onObjectRemoved(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObjectManager manager, @Nonnull DBusObject object);
    }
    
    private static JnaDBusObjectManagerIface.OnObjectRemoved toOnObjectRemoved(ch.bailu.gtk.type.Pointer instance, String methodName, OnObjectRemoved in) {
        JnaDBusObjectManagerIface.OnObjectRemoved out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager, _object) -> in.onObjectRemoved(__callback, new DBusObjectManager(new PointerContainer(_manager)), new DBusObject(new PointerContainer(_object)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnInterfaceAdded {
        /**
         * 
         * @param manager 
         * @param object 
         * @param interface_ 
        */
        void onInterfaceAdded(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObjectManager manager, @Nonnull DBusObject object, @Nonnull DBusInterface interface_);
    }
    
    private static JnaDBusObjectManagerIface.OnInterfaceAdded toOnInterfaceAdded(ch.bailu.gtk.type.Pointer instance, String methodName, OnInterfaceAdded in) {
        JnaDBusObjectManagerIface.OnInterfaceAdded out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager, _object, _interface_) -> in.onInterfaceAdded(__callback, new DBusObjectManager(new PointerContainer(_manager)), new DBusObject(new PointerContainer(_object)), new DBusInterface(new PointerContainer(_interface_)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnInterfaceRemoved {
        /**
         * 
         * @param manager 
         * @param object 
         * @param interface_ 
        */
        void onInterfaceRemoved(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull DBusObjectManager manager, @Nonnull DBusObject object, @Nonnull DBusInterface interface_);
    }
    
    private static JnaDBusObjectManagerIface.OnInterfaceRemoved toOnInterfaceRemoved(ch.bailu.gtk.type.Pointer instance, String methodName, OnInterfaceRemoved in) {
        JnaDBusObjectManagerIface.OnInterfaceRemoved out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_manager, _object, _interface_) -> in.onInterfaceRemoved(__callback, new DBusObjectManager(new PointerContainer(_manager)), new DBusObject(new PointerContainer(_object)), new DBusInterface(new PointerContainer(_interface_)));
            __callback.register(out);
        }
        return out;
    }

    public DBusObjectManagerIface(PointerContainer pointer) {
        super(pointer);
    }

    public DBusObjectManagerIface() {
        super(cast(JnaDBusObjectManagerIface.allocateStructure()));
    }

    private JnaDBusObjectManagerIface.Fields _fields;
    
    JnaDBusObjectManagerIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusObjectManagerIface.Fields(asCPointer());
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
    public JnaDBusObjectManagerIface.OnGetObjectPath getFieldGetObjectPath() {
       toFields().readField(GET_OBJECT_PATH);
       return toFields().get_object_path;
    } 

    /**
     * 
     * <br>See {@link OnGetObjects#onGetObjects}
    */
    public static final String GET_OBJECTS = "get_objects";

    /**
     * 
     * <br>See {@link OnGetObjects#onGetObjects}
    */
    public void setFieldGetObjects(OnGetObjects get_objects) {
        toFields().get_objects = toOnGetObjects(this, GET_OBJECTS, get_objects);
        toFields().writeField(GET_OBJECTS);
    }

    /**
     * 
     * <br>See {@link OnGetObjects#onGetObjects}
    */
    public JnaDBusObjectManagerIface.OnGetObjects getFieldGetObjects() {
       toFields().readField(GET_OBJECTS);
       return toFields().get_objects;
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
    public JnaDBusObjectManagerIface.OnGetObject getFieldGetObject() {
       toFields().readField(GET_OBJECT);
       return toFields().get_object;
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
    public JnaDBusObjectManagerIface.OnGetInterface getFieldGetInterface() {
       toFields().readField(GET_INTERFACE);
       return toFields().get_interface;
    } 

    /**
     * 
     * <br>See {@link OnObjectAdded#onObjectAdded}
    */
    public static final String OBJECT_ADDED = "object_added";

    /**
     * 
     * <br>See {@link OnObjectAdded#onObjectAdded}
    */
    public void setFieldObjectAdded(OnObjectAdded object_added) {
        toFields().object_added = toOnObjectAdded(this, OBJECT_ADDED, object_added);
        toFields().writeField(OBJECT_ADDED);
    }

    /**
     * 
     * <br>See {@link OnObjectAdded#onObjectAdded}
    */
    public JnaDBusObjectManagerIface.OnObjectAdded getFieldObjectAdded() {
       toFields().readField(OBJECT_ADDED);
       return toFields().object_added;
    } 

    /**
     * 
     * <br>See {@link OnObjectRemoved#onObjectRemoved}
    */
    public static final String OBJECT_REMOVED = "object_removed";

    /**
     * 
     * <br>See {@link OnObjectRemoved#onObjectRemoved}
    */
    public void setFieldObjectRemoved(OnObjectRemoved object_removed) {
        toFields().object_removed = toOnObjectRemoved(this, OBJECT_REMOVED, object_removed);
        toFields().writeField(OBJECT_REMOVED);
    }

    /**
     * 
     * <br>See {@link OnObjectRemoved#onObjectRemoved}
    */
    public JnaDBusObjectManagerIface.OnObjectRemoved getFieldObjectRemoved() {
       toFields().readField(OBJECT_REMOVED);
       return toFields().object_removed;
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
    public JnaDBusObjectManagerIface.OnInterfaceAdded getFieldInterfaceAdded() {
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
    public JnaDBusObjectManagerIface.OnInterfaceRemoved getFieldInterfaceRemoved() {
       toFields().readField(INTERFACE_REMOVED);
       return toFields().interface_removed;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusObjectManager.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusObjectManager.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
