/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GDBusObjectManager type is the base type for service- and
 * <br>client-side implementations of the standardized
 * <br>[org.freedesktop.DBus.ObjectManager](http://dbus.freedesktop.org/doc/dbus-specification.html&#35;standard-interfaces-objectmanager)
 * <br>interface.
 * <br>
 * <br>See &#35;GDBusObjectManagerClient for the client-side implementation
 * <br>and &#35;GDBusObjectManagerServer for the service-side implementation.
 * <p><a href="https://docs.gtk.org/gio/iface.DBusObjectManager.html">https://docs.gtk.org/gio/iface.DBusObjectManager.html</a></p>
*/
public class DBusObjectManager extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusObjectManager.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnInterfaceAdded {
        /**
         * Emitted when &#64;interface is added to &#64;object.
         * <br>
         * <br>This signal exists purely as a convenience to avoid having to
         * <br>connect signals to all objects managed by &#64;manager.
         * @param object The &#35;GDBusObject on which an interface was added.
         * @param _interface The &#35;GDBusInterface that was added.
        */
        void onInterfaceAdded(@Nonnull DBusObject object, @Nonnull DBusInterface _interface);
    }
    
    private static com.sun.jna.Callback toOnInterfaceAdded(OnInterfaceAdded in) {
        return (in == null) ? null: (JnaDBusObjectManager.OnInterfaceAdded) (__self, _object, __interface, __data) -> in.onInterfaceAdded(new DBusObject(new PointerContainer(_object)), new DBusInterface(new PointerContainer(__interface)));
    }

    @FunctionalInterface
    public interface OnInterfaceRemoved {
        /**
         * Emitted when &#64;interface has been removed from &#64;object.
         * <br>
         * <br>This signal exists purely as a convenience to avoid having to
         * <br>connect signals to all objects managed by &#64;manager.
         * @param object The &#35;GDBusObject on which an interface was removed.
         * @param _interface The &#35;GDBusInterface that was removed.
        */
        void onInterfaceRemoved(@Nonnull DBusObject object, @Nonnull DBusInterface _interface);
    }
    
    private static com.sun.jna.Callback toOnInterfaceRemoved(OnInterfaceRemoved in) {
        return (in == null) ? null: (JnaDBusObjectManager.OnInterfaceRemoved) (__self, _object, __interface, __data) -> in.onInterfaceRemoved(new DBusObject(new PointerContainer(_object)), new DBusInterface(new PointerContainer(__interface)));
    }

    @FunctionalInterface
    public interface OnObjectAdded {
        /**
         * Emitted when &#64;object is added to &#64;manager.
         * @param object The &#35;GDBusObject that was added.
        */
        void onObjectAdded(@Nonnull DBusObject object);
    }
    
    private static com.sun.jna.Callback toOnObjectAdded(OnObjectAdded in) {
        return (in == null) ? null: (JnaDBusObjectManager.OnObjectAdded) (__self, _object, __data) -> in.onObjectAdded(new DBusObject(new PointerContainer(_object)));
    }

    @FunctionalInterface
    public interface OnObjectRemoved {
        /**
         * Emitted when &#64;object is removed from &#64;manager.
         * @param object The &#35;GDBusObject that was removed.
        */
        void onObjectRemoved(@Nonnull DBusObject object);
    }
    
    private static com.sun.jna.Callback toOnObjectRemoved(OnObjectRemoved in) {
        return (in == null) ? null: (JnaDBusObjectManager.OnObjectRemoved) (__self, _object, __data) -> in.onObjectRemoved(new DBusObject(new PointerContainer(_object)));
    }

    public DBusObjectManager(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the interface proxy for &#64;interface_name at &#64;object_path, if
     * <br>any.
     * @param object_path Object path to look up.
     * @param interface_name D-Bus interface name to look up.
     * @return A &#35;GDBusInterface instance or %NULL. Free   with g_object_unref().
    */
    public DBusInterface getInterface(@Nonnull ch.bailu.gtk.type.Str object_path, @Nonnull ch.bailu.gtk.type.Str interface_name)  {
        return new DBusInterface(new PointerContainer(JnaDBusObjectManager.INST().g_dbus_object_manager_get_interface(asCPointer(), asCPointerNotNull(object_path), asCPointerNotNull(interface_name))));
    }

    /**
     * Gets the interface proxy for &#64;interface_name at &#64;object_path, if
     * <br>any.
     * @param object_path Object path to look up.
     * @param interface_name D-Bus interface name to look up.
     * @return A &#35;GDBusInterface instance or %NULL. Free   with g_object_unref().
    */
    public DBusInterface getInterface(String object_path, String interface_name)  {
        return new DBusInterface(new PointerContainer(JnaDBusObjectManager.INST().g_dbus_object_manager_get_interface(asCPointer(), object_path, interface_name)));
    }

    /**
     * Gets the &#35;GDBusObject at &#64;object_path, if any.
     * @param object_path Object path to look up.
     * @return A &#35;GDBusObject or %NULL. Free with   g_object_unref().
    */
    public DBusObject getObject(@Nonnull ch.bailu.gtk.type.Str object_path)  {
        return new DBusObject(new PointerContainer(JnaDBusObjectManager.INST().g_dbus_object_manager_get_object(asCPointer(), asCPointerNotNull(object_path))));
    }

    /**
     * Gets the &#35;GDBusObject at &#64;object_path, if any.
     * @param object_path Object path to look up.
     * @return A &#35;GDBusObject or %NULL. Free with   g_object_unref().
    */
    public DBusObject getObject(String object_path)  {
        return new DBusObject(new PointerContainer(JnaDBusObjectManager.INST().g_dbus_object_manager_get_object(asCPointer(), object_path)));
    }

    /**
     * Gets the object path that &#64;manager is for.
     * @return A string owned by &#64;manager. Do not free.
    */
    public ch.bailu.gtk.type.Str getObjectPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusObjectManager.INST().g_dbus_object_manager_get_object_path(asCPointer())));
    }

    /**
     * Gets all &#35;GDBusObject objects known to &#64;manager.
     * @return A list of   &#35;GDBusObject objects. The returned list should be freed with   g_list_free() after each element has been freed with   g_object_unref().
    */
    public ch.bailu.gtk.glib.List getObjects()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaDBusObjectManager.INST().g_dbus_object_manager_get_objects(asCPointer())));
    }

    public final static String SIGNAL_ON_INTERFACE_ADDED = "interface-added";
    
    /**
     * Connect to signal "interface-added".
     * <br>See {@link OnInterfaceAdded#onInterfaceAdded} for signal description.
     * <br>Field {@link #SIGNAL_ON_INTERFACE_ADDED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInterfaceAdded(OnInterfaceAdded signal) {
        return connectSignal(SIGNAL_ON_INTERFACE_ADDED, toOnInterfaceAdded(signal));
    }

    public final static String SIGNAL_ON_INTERFACE_REMOVED = "interface-removed";
    
    /**
     * Connect to signal "interface-removed".
     * <br>See {@link OnInterfaceRemoved#onInterfaceRemoved} for signal description.
     * <br>Field {@link #SIGNAL_ON_INTERFACE_REMOVED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInterfaceRemoved(OnInterfaceRemoved signal) {
        return connectSignal(SIGNAL_ON_INTERFACE_REMOVED, toOnInterfaceRemoved(signal));
    }

    public final static String SIGNAL_ON_OBJECT_ADDED = "object-added";
    
    /**
     * Connect to signal "object-added".
     * <br>See {@link OnObjectAdded#onObjectAdded} for signal description.
     * <br>Field {@link #SIGNAL_ON_OBJECT_ADDED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onObjectAdded(OnObjectAdded signal) {
        return connectSignal(SIGNAL_ON_OBJECT_ADDED, toOnObjectAdded(signal));
    }

    public final static String SIGNAL_ON_OBJECT_REMOVED = "object-removed";
    
    /**
     * Connect to signal "object-removed".
     * <br>See {@link OnObjectRemoved#onObjectRemoved} for signal description.
     * <br>Field {@link #SIGNAL_ON_OBJECT_REMOVED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onObjectRemoved(OnObjectRemoved signal) {
        return connectSignal(SIGNAL_ON_OBJECT_REMOVED, toOnObjectRemoved(signal));
    }

    public static long getTypeID() { 
        return JnaDBusObjectManager.INST().g_dbus_object_manager_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
interface-type
*/
