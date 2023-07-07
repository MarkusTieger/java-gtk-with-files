/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDBusObjectManagerServer is used to export &#35;GDBusObject instances using
 * <br>the standardized
 * <br>[org.freedesktop.DBus.ObjectManager](http://dbus.freedesktop.org/doc/dbus-specification.html&#35;standard-interfaces-objectmanager)
 * <br>interface. For example, remote D-Bus clients can get all objects
 * <br>and properties in a single call. Additionally, any change in the
 * <br>object hierarchy is broadcast using signals. This means that D-Bus
 * <br>clients can keep caches up to date by only listening to D-Bus
 * <br>signals.
 * <br>
 * <br>The recommended path to export an object manager at is the path form of the
 * <br>well-known name of a D-Bus service, or below. For example, if a D-Bus service
 * <br>is available at the well-known name `net.example.ExampleService1`, the object
 * <br>manager should typically be exported at `/net/example/ExampleService1`, or
 * <br>below (to allow for multiple object managers in a service).
 * <br>
 * <br>It is supported, but not recommended, to export an object manager at the root
 * <br>path, `/`.
 * <br>
 * <br>See &#35;GDBusObjectManagerClient for the client-side code that is
 * <br>intended to be used with &#35;GDBusObjectManagerServer or any D-Bus
 * <br>object implementing the org.freedesktop.DBus.ObjectManager
 * <br>interface.
 * <p><a href="https://docs.gtk.org/gio/class.DBusObjectManagerServer.html">https://docs.gtk.org/gio/class.DBusObjectManagerServer.html</a></p>
*/
public class DBusObjectManagerServer extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusObjectManagerServer.class.getCanonicalName());
    }

    public DBusObjectManagerServer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GDBusObjectManagerServer object.
     * <br>
     * <br>The returned server isn't yet exported on any connection. To do so,
     * <br>use g_dbus_object_manager_server_set_connection(). Normally you
     * <br>want to export all of your objects before doing so to avoid
     * <br>[InterfacesAdded](http://dbus.freedesktop.org/doc/dbus-specification.html&#35;standard-interfaces-objectmanager)
     * <br>signals being emitted.
     * @param object_path The object path to export the manager object at.
    */
    public DBusObjectManagerServer(@Nonnull ch.bailu.gtk.type.Str object_path) {
        super(cast(JnaDBusObjectManagerServer.INST().g_dbus_object_manager_server_new(asCPointerNotNull(object_path))));
    }

    /**
     * Creates a new &#35;GDBusObjectManagerServer object.
     * <br>
     * <br>The returned server isn't yet exported on any connection. To do so,
     * <br>use g_dbus_object_manager_server_set_connection(). Normally you
     * <br>want to export all of your objects before doing so to avoid
     * <br>[InterfacesAdded](http://dbus.freedesktop.org/doc/dbus-specification.html&#35;standard-interfaces-objectmanager)
     * <br>signals being emitted.
     * @param object_path The object path to export the manager object at.
    */
    public DBusObjectManagerServer(String object_path) {
        super(cast(JnaDBusObjectManagerServer.INST().g_dbus_object_manager_server_new(object_path)));
    }

    /**
     * Exports &#64;object on &#64;manager.
     * <br>
     * <br>If there is already a &#35;GDBusObject exported at the object path,
     * <br>then the old object is removed.
     * <br>
     * <br>The object path for &#64;object must be in the hierarchy rooted by the
     * <br>object path for &#64;manager.
     * <br>
     * <br>Note that &#64;manager will take a reference on &#64;object for as long as
     * <br>it is exported.
     * @param object A &#35;GDBusObjectSkeleton.
    */
    public void export(@Nonnull DBusObjectSkeleton object)  {
        JnaDBusObjectManagerServer.INST().g_dbus_object_manager_server_export(asCPointer(), asCPointerNotNull(object));
    }

    /**
     * Like g_dbus_object_manager_server_export() but appends a string of
     * <br>the form _N (with N being a natural number) to &#64;object's object path
     * <br>if an object with the given path already exists. As such, the
     * <br>&#35;GDBusObjectProxy:g-object-path property of &#64;object may be modified.
     * @param object An object.
    */
    public void exportUniquely(@Nonnull DBusObjectSkeleton object)  {
        JnaDBusObjectManagerServer.INST().g_dbus_object_manager_server_export_uniquely(asCPointer(), asCPointerNotNull(object));
    }

    /**
     * Gets the &#35;GDBusConnection used by &#64;manager.
     * @return A &#35;GDBusConnection object or %NULL if   &#64;manager isn't exported on a connection. The returned object should   be freed with g_object_unref().
    */
    public DBusConnection getConnection()  {
        return new DBusConnection(new PointerContainer(JnaDBusObjectManagerServer.INST().g_dbus_object_manager_server_get_connection(asCPointer())));
    }

    /**
     * Returns whether &#64;object is currently exported on &#64;manager.
     * @param object An object.
     * @return %TRUE if &#64;object is exported
    */
    public boolean isExported(@Nonnull DBusObjectSkeleton object)  {
        return JnaDBusObjectManagerServer.INST().g_dbus_object_manager_server_is_exported(asCPointer(), asCPointerNotNull(object));
    }

    /**
     * Exports all objects managed by &#64;manager on &#64;connection. If
     * <br>&#64;connection is %NULL, stops exporting objects.
     * @param connection A &#35;GDBusConnection or %NULL.
    */
    public void setConnection(@Nullable DBusConnection connection)  {
        JnaDBusObjectManagerServer.INST().g_dbus_object_manager_server_set_connection(asCPointer(), asCPointer(connection));
    }

    /**
     * If &#64;manager has an object at &#64;path, removes the object. Otherwise
     * <br>does nothing.
     * <br>
     * <br>Note that &#64;object_path must be in the hierarchy rooted by the
     * <br>object path for &#64;manager.
     * @param object_path An object path.
     * @return %TRUE if object at &#64;object_path was removed, %FALSE otherwise.
    */
    public boolean unexport(@Nonnull ch.bailu.gtk.type.Str object_path)  {
        return JnaDBusObjectManagerServer.INST().g_dbus_object_manager_server_unexport(asCPointer(), asCPointerNotNull(object_path));
    }

    /**
     * If &#64;manager has an object at &#64;path, removes the object. Otherwise
     * <br>does nothing.
     * <br>
     * <br>Note that &#64;object_path must be in the hierarchy rooted by the
     * <br>object path for &#64;manager.
     * @param object_path An object path.
     * @return %TRUE if object at &#64;object_path was removed, %FALSE otherwise.
    */
    public boolean unexport(String object_path)  {
        return JnaDBusObjectManagerServer.INST().g_dbus_object_manager_server_unexport(asCPointer(), object_path);
    }

    /**
     * Implements interface {@link DBusObjectManager}. Call this to get access to interface functions.
     * @return {@link DBusObjectManager}
    */
    public DBusObjectManager asDBusObjectManager() {
        return new DBusObjectManager(cast());
    }

    public static long getTypeID() { 
        return JnaDBusObjectManagerServer.INST().g_dbus_object_manager_server_get_type(); 
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
