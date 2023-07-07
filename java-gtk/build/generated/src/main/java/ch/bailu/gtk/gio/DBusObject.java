/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GDBusObject type is the base type for D-Bus objects on both
 * <br>the service side (see &#35;GDBusObjectSkeleton) and the client side
 * <br>(see &#35;GDBusObjectProxy). It is essentially just a container of
 * <br>interfaces.
 * <p><a href="https://docs.gtk.org/gio/iface.DBusObject.html">https://docs.gtk.org/gio/iface.DBusObject.html</a></p>
*/
public class DBusObject extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusObject.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnInterfaceAdded {
        /**
         * Emitted when &#64;interface is added to &#64;object.
         * @param _interface The &#35;GDBusInterface that was added.
        */
        void onInterfaceAdded(@Nonnull DBusInterface _interface);
    }
    
    private static com.sun.jna.Callback toOnInterfaceAdded(OnInterfaceAdded in) {
        return (in == null) ? null: (JnaDBusObject.OnInterfaceAdded) (__self, __interface, __data) -> in.onInterfaceAdded(new DBusInterface(new PointerContainer(__interface)));
    }

    @FunctionalInterface
    public interface OnInterfaceRemoved {
        /**
         * Emitted when &#64;interface is removed from &#64;object.
         * @param _interface The &#35;GDBusInterface that was removed.
        */
        void onInterfaceRemoved(@Nonnull DBusInterface _interface);
    }
    
    private static com.sun.jna.Callback toOnInterfaceRemoved(OnInterfaceRemoved in) {
        return (in == null) ? null: (JnaDBusObject.OnInterfaceRemoved) (__self, __interface, __data) -> in.onInterfaceRemoved(new DBusInterface(new PointerContainer(__interface)));
    }

    public DBusObject(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the D-Bus interface with name &#64;interface_name associated with
     * <br>&#64;object, if any.
     * @param interface_name A D-Bus interface name.
     * @return %NULL if not found, otherwise a   &#35;GDBusInterface that must be freed with g_object_unref().
    */
    public DBusInterface getInterface(@Nonnull ch.bailu.gtk.type.Str interface_name)  {
        return new DBusInterface(new PointerContainer(JnaDBusObject.INST().g_dbus_object_get_interface(asCPointer(), asCPointerNotNull(interface_name))));
    }

    /**
     * Gets the D-Bus interface with name &#64;interface_name associated with
     * <br>&#64;object, if any.
     * @param interface_name A D-Bus interface name.
     * @return %NULL if not found, otherwise a   &#35;GDBusInterface that must be freed with g_object_unref().
    */
    public DBusInterface getInterface(String interface_name)  {
        return new DBusInterface(new PointerContainer(JnaDBusObject.INST().g_dbus_object_get_interface(asCPointer(), interface_name)));
    }

    /**
     * Gets the D-Bus interfaces associated with &#64;object.
     * @return A list of &#35;GDBusInterface instances.   The returned list must be freed by g_list_free() after each element has been freed   with g_object_unref().
    */
    public ch.bailu.gtk.glib.List getInterfaces()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaDBusObject.INST().g_dbus_object_get_interfaces(asCPointer())));
    }

    /**
     * Gets the object path for &#64;object.
     * @return A string owned by &#64;object. Do not free.
    */
    public ch.bailu.gtk.type.Str getObjectPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusObject.INST().g_dbus_object_get_object_path(asCPointer())));
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

    public static long getTypeID() { 
        return JnaDBusObject.INST().g_dbus_object_get_type(); 
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
