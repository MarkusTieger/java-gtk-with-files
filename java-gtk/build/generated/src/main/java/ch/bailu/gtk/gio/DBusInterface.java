/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GDBusInterface type is the base type for D-Bus interfaces both
 * <br>on the service side (see &#35;GDBusInterfaceSkeleton) and client side
 * <br>(see &#35;GDBusProxy).
 * <p><a href="https://docs.gtk.org/gio/iface.DBusInterface.html">https://docs.gtk.org/gio/iface.DBusInterface.html</a></p>
*/
public class DBusInterface extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusInterface.class.getCanonicalName());
    }

    public DBusInterface(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the &#35;GDBusObject that &#64;interface_ belongs to, if any.
     * @return A &#35;GDBusObject or %NULL. The returned reference should be freed with g_object_unref().
    */
    public DBusObject dupObject()  {
        return new DBusObject(new PointerContainer(JnaDBusInterface.INST().g_dbus_interface_dup_object(asCPointer())));
    }

    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * <br>implemented by &#64;interface_.
     * @return A &#35;GDBusInterfaceInfo. Do not free.
    */
    public DBusInterfaceInfo getInfo()  {
        return new DBusInterfaceInfo(new PointerContainer(JnaDBusInterface.INST().g_dbus_interface_get_info(asCPointer())));
    }

    /**
     * Gets the &#35;GDBusObject that &#64;interface_ belongs to, if any.
     * <br>
     * <br>It is not safe to use the returned object if &#64;interface_ or
     * <br>the returned object is being used from other threads. See
     * <br>g_dbus_interface_dup_object() for a thread-safe alternative.
     * @return A &#35;GDBusObject or %NULL. The returned     reference belongs to &#64;interface_ and should not be freed.
    */
    public DBusObject getObject()  {
        return new DBusObject(new PointerContainer(JnaDBusInterface.INST().g_dbus_interface_get_object(asCPointer())));
    }

    /**
     * Sets the &#35;GDBusObject for &#64;interface_ to &#64;object.
     * <br>
     * <br>Note that &#64;interface_ will hold a weak reference to &#64;object.
     * @param object A &#35;GDBusObject or %NULL.
    */
    public void setObject(@Nullable DBusObject object)  {
        JnaDBusInterface.INST().g_dbus_interface_set_object(asCPointer(), asCPointer(object));
    }

    public static long getTypeID() { 
        return JnaDBusInterface.INST().g_dbus_interface_get_type(); 
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
