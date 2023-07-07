/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GDBusObjectProxy is an object used to represent a remote object
 * <br>with one or more D-Bus interfaces. Normally, you don't instantiate
 * <br>a &#35;GDBusObjectProxy yourself - typically &#35;GDBusObjectManagerClient
 * <br>is used to obtain it.
 * <p><a href="https://docs.gtk.org/gio/class.DBusObjectProxy.html">https://docs.gtk.org/gio/class.DBusObjectProxy.html</a></p>
*/
public class DBusObjectProxy extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusObjectProxy.class.getCanonicalName());
    }

    public DBusObjectProxy(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GDBusObjectProxy for the given connection and
     * <br>object path.
     * @param connection a &#35;GDBusConnection
     * @param object_path the object path
    */
    public DBusObjectProxy(@Nonnull DBusConnection connection, @Nonnull ch.bailu.gtk.type.Str object_path) {
        super(cast(JnaDBusObjectProxy.INST().g_dbus_object_proxy_new(asCPointerNotNull(connection), asCPointerNotNull(object_path))));
    }

    /**
     * Creates a new &#35;GDBusObjectProxy for the given connection and
     * <br>object path.
     * @param connection a &#35;GDBusConnection
     * @param object_path the object path
    */
    public DBusObjectProxy(@Nonnull DBusConnection connection, String object_path) {
        super(cast(JnaDBusObjectProxy.INST().g_dbus_object_proxy_new(asCPointerNotNull(connection), object_path)));
    }

    /**
     * Gets the connection that &#64;proxy is for.
     * @return A &#35;GDBusConnection. Do not free, the   object is owned by &#64;proxy.
    */
    public DBusConnection getConnection()  {
        return new DBusConnection(new PointerContainer(JnaDBusObjectProxy.INST().g_dbus_object_proxy_get_connection(asCPointer())));
    }

    /**
     * Implements interface {@link DBusObject}. Call this to get access to interface functions.
     * @return {@link DBusObject}
    */
    public DBusObject asDBusObject() {
        return new DBusObject(cast());
    }

    public static long getTypeID() { 
        return JnaDBusObjectProxy.INST().g_dbus_object_proxy_get_type(); 
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
class-type
*/
