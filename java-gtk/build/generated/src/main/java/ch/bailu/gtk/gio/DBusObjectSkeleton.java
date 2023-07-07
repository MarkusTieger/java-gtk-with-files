/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GDBusObjectSkeleton instance is essentially a group of D-Bus
 * <br>interfaces. The set of exported interfaces on the object may be
 * <br>dynamic and change at runtime.
 * <br>
 * <br>This type is intended to be used with &#35;GDBusObjectManager.
 * <p><a href="https://docs.gtk.org/gio/class.DBusObjectSkeleton.html">https://docs.gtk.org/gio/class.DBusObjectSkeleton.html</a></p>
*/
public class DBusObjectSkeleton extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusObjectSkeleton.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAuthorizeMethod {
        /**
         * Emitted when a method is invoked by a remote caller and used to
         * <br>determine if the method call is authorized.
         * <br>
         * <br>This signal is like &#35;GDBusInterfaceSkeleton's
         * <br>&#35;GDBusInterfaceSkeleton::g-authorize-method signal,
         * <br>except that it is for the enclosing object.
         * <br>
         * <br>The default class handler just returns %TRUE.
         * @param _interface The &#35;GDBusInterfaceSkeleton that &#64;invocation is for.
         * @param invocation A &#35;GDBusMethodInvocation.
         * @return %TRUE if the call is authorized, %FALSE otherwise.
        */
        boolean onAuthorizeMethod(@Nonnull DBusInterfaceSkeleton _interface, @Nonnull DBusMethodInvocation invocation);
    }
    
    private static com.sun.jna.Callback toOnAuthorizeMethod(OnAuthorizeMethod in) {
        return (in == null) ? null: (JnaDBusObjectSkeleton.OnAuthorizeMethod) (__self, __interface, _invocation, __data) -> in.onAuthorizeMethod(new DBusInterfaceSkeleton(new PointerContainer(__interface)), new DBusMethodInvocation(new PointerContainer(_invocation)));
    }

    public DBusObjectSkeleton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GDBusObjectSkeleton.
     * @param object_path An object path.
    */
    public DBusObjectSkeleton(@Nonnull ch.bailu.gtk.type.Str object_path) {
        super(cast(JnaDBusObjectSkeleton.INST().g_dbus_object_skeleton_new(asCPointerNotNull(object_path))));
    }

    /**
     * Creates a new &#35;GDBusObjectSkeleton.
     * @param object_path An object path.
    */
    public DBusObjectSkeleton(String object_path) {
        super(cast(JnaDBusObjectSkeleton.INST().g_dbus_object_skeleton_new(object_path)));
    }

    /**
     * Adds &#64;interface_ to &#64;object.
     * <br>
     * <br>If &#64;object already contains a &#35;GDBusInterfaceSkeleton with the same
     * <br>interface name, it is removed before &#64;interface_ is added.
     * <br>
     * <br>Note that &#64;object takes its own reference on &#64;interface_ and holds
     * <br>it until removed.
     * @param interface_ A &#35;GDBusInterfaceSkeleton.
    */
    public void addInterface(@Nonnull DBusInterfaceSkeleton interface_)  {
        JnaDBusObjectSkeleton.INST().g_dbus_object_skeleton_add_interface(asCPointer(), asCPointerNotNull(interface_));
    }

    /**
     * This method simply calls g_dbus_interface_skeleton_flush() on all
     * <br>interfaces belonging to &#64;object. See that method for when flushing
     * <br>is useful.
    */
    public void flush()  {
        JnaDBusObjectSkeleton.INST().g_dbus_object_skeleton_flush(asCPointer());
    }

    /**
     * Removes &#64;interface_ from &#64;object.
     * @param interface_ A &#35;GDBusInterfaceSkeleton.
    */
    public void removeInterface(@Nonnull DBusInterfaceSkeleton interface_)  {
        JnaDBusObjectSkeleton.INST().g_dbus_object_skeleton_remove_interface(asCPointer(), asCPointerNotNull(interface_));
    }

    /**
     * Removes the &#35;GDBusInterface with &#64;interface_name from &#64;object.
     * <br>
     * <br>If no D-Bus interface of the given interface exists, this function
     * <br>does nothing.
     * @param interface_name A D-Bus interface name.
    */
    public void removeInterfaceByName(@Nonnull ch.bailu.gtk.type.Str interface_name)  {
        JnaDBusObjectSkeleton.INST().g_dbus_object_skeleton_remove_interface_by_name(asCPointer(), asCPointerNotNull(interface_name));
    }

    /**
     * Removes the &#35;GDBusInterface with &#64;interface_name from &#64;object.
     * <br>
     * <br>If no D-Bus interface of the given interface exists, this function
     * <br>does nothing.
     * @param interface_name A D-Bus interface name.
    */
    public void removeInterfaceByName(String interface_name)  {
        JnaDBusObjectSkeleton.INST().g_dbus_object_skeleton_remove_interface_by_name(asCPointer(), interface_name);
    }

    /**
     * Sets the object path for &#64;object.
     * @param object_path A valid D-Bus object path.
    */
    public void setObjectPath(@Nonnull ch.bailu.gtk.type.Str object_path)  {
        JnaDBusObjectSkeleton.INST().g_dbus_object_skeleton_set_object_path(asCPointer(), asCPointerNotNull(object_path));
    }

    /**
     * Sets the object path for &#64;object.
     * @param object_path A valid D-Bus object path.
    */
    public void setObjectPath(String object_path)  {
        JnaDBusObjectSkeleton.INST().g_dbus_object_skeleton_set_object_path(asCPointer(), object_path);
    }

    public final static String SIGNAL_ON_AUTHORIZE_METHOD = "authorize-method";
    
    /**
     * Connect to signal "authorize-method".
     * <br>See {@link OnAuthorizeMethod#onAuthorizeMethod} for signal description.
     * <br>Field {@link #SIGNAL_ON_AUTHORIZE_METHOD} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAuthorizeMethod(OnAuthorizeMethod signal) {
        return connectSignal(SIGNAL_ON_AUTHORIZE_METHOD, toOnAuthorizeMethod(signal));
    }

    /**
     * Implements interface {@link DBusObject}. Call this to get access to interface functions.
     * @return {@link DBusObject}
    */
    public DBusObject asDBusObject() {
        return new DBusObject(cast());
    }

    public static long getTypeID() { 
        return JnaDBusObjectSkeleton.INST().g_dbus_object_skeleton_get_type(); 
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
