/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Abstract base class for D-Bus interfaces on the service side.
 * <p><a href="https://docs.gtk.org/gio/class.DBusInterfaceSkeleton.html">https://docs.gtk.org/gio/class.DBusInterfaceSkeleton.html</a></p>
*/
public class DBusInterfaceSkeleton extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusInterfaceSkeleton.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGAuthorizeMethod {
        /**
         * Emitted when a method is invoked by a remote caller and used to
         * <br>determine if the method call is authorized.
         * <br>
         * <br>Note that this signal is emitted in a thread dedicated to
         * <br>handling the method call so handlers are allowed to perform
         * <br>blocking IO. This means that it is appropriate to call e.g.
         * <br>[polkit_authority_check_authorization_sync()](http://hal.freedesktop.org/docs/polkit/PolkitAuthority.html&#35;polkit-authority-check-authorization-sync)
         * <br>with the
         * <br>[POLKIT_CHECK_AUTHORIZATION_FLAGS_ALLOW_USER_INTERACTION](http://hal.freedesktop.org/docs/polkit/PolkitAuthority.html&#35;POLKIT-CHECK-AUTHORIZATION-FLAGS-ALLOW-USER-INTERACTION:CAPS)
         * <br>flag set.
         * <br>
         * <br>If %FALSE is returned then no further handlers are run and the
         * <br>signal handler must take a reference to &#64;invocation and finish
         * <br>handling the call (e.g. return an error via
         * <br>g_dbus_method_invocation_return_error()).
         * <br>
         * <br>Otherwise, if %TRUE is returned, signal emission continues. If no
         * <br>handlers return %FALSE, then the method is dispatched. If
         * <br>&#64;interface has an enclosing &#35;GDBusObjectSkeleton, then the
         * <br>&#35;GDBusObjectSkeleton::authorize-method signal handlers run before
         * <br>the handlers for this signal.
         * <br>
         * <br>The default class handler just returns %TRUE.
         * <br>
         * <br>Please note that the common case is optimized: if no signals
         * <br>handlers are connected and the default class handler isn't
         * <br>overridden (for both &#64;interface and the enclosing
         * <br>&#35;GDBusObjectSkeleton, if any) and &#35;GDBusInterfaceSkeleton:g-flags does
         * <br>not have the
         * <br>%G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD
         * <br>flags set, no dedicated thread is ever used and the call will be
         * <br>handled in the same thread as the object that &#64;interface belongs
         * <br>to was exported in.
         * @param invocation A &#35;GDBusMethodInvocation.
         * @return %TRUE if the call is authorized, %FALSE otherwise.
        */
        boolean onGAuthorizeMethod(@Nonnull DBusMethodInvocation invocation);
    }
    
    private static com.sun.jna.Callback toOnGAuthorizeMethod(OnGAuthorizeMethod in) {
        return (in == null) ? null: (JnaDBusInterfaceSkeleton.OnGAuthorizeMethod) (__self, _invocation, __data) -> in.onGAuthorizeMethod(new DBusMethodInvocation(new PointerContainer(_invocation)));
    }

    public DBusInterfaceSkeleton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Exports &#64;interface_ at &#64;object_path on &#64;connection.
     * <br>
     * <br>This can be called multiple times to export the same &#64;interface_
     * <br>onto multiple connections however the &#64;object_path provided must be
     * <br>the same for all connections.
     * <br>
     * <br>Use g_dbus_interface_skeleton_unexport() to unexport the object.
     * @param connection A &#35;GDBusConnection to export &#64;interface_ on.
     * @param object_path The path to export the interface at.
     * @return %TRUE if the interface was exported on &#64;connection, otherwise %FALSE with &#64;error set.
    */
    public boolean export(@Nonnull DBusConnection connection, @Nonnull ch.bailu.gtk.type.Str object_path) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_export(asCPointer(), asCPointerNotNull(connection), asCPointerNotNull(object_path), 0L);
    }

    /**
     * Exports &#64;interface_ at &#64;object_path on &#64;connection.
     * <br>
     * <br>This can be called multiple times to export the same &#64;interface_
     * <br>onto multiple connections however the &#64;object_path provided must be
     * <br>the same for all connections.
     * <br>
     * <br>Use g_dbus_interface_skeleton_unexport() to unexport the object.
     * @param connection A &#35;GDBusConnection to export &#64;interface_ on.
     * @param object_path The path to export the interface at.
     * @return %TRUE if the interface was exported on &#64;connection, otherwise %FALSE with &#64;error set.
    */
    public boolean export(@Nonnull DBusConnection connection, String object_path) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_export(asCPointer(), asCPointerNotNull(connection), object_path, 0L);
    }

    /**
     * If &#64;interface_ has outstanding changes, request for these changes to be
     * <br>emitted immediately.
     * <br>
     * <br>For example, an exported D-Bus interface may queue up property
     * <br>changes and emit the
     * <br>`org.freedesktop.DBus.Properties.PropertiesChanged`
     * <br>signal later (e.g. in an idle handler). This technique is useful
     * <br>for collapsing multiple property changes into one.
    */
    public void flush()  {
        JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_flush(asCPointer());
    }

    /**
     * Gets the first connection that &#64;interface_ is exported on, if any.
     * @return A &#35;GDBusConnection or %NULL if &#64;interface_ is not exported anywhere. Do not free, the object belongs to &#64;interface_.
    */
    public DBusConnection getConnection()  {
        return new DBusConnection(new PointerContainer(JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_get_connection(asCPointer())));
    }

    /**
     * Gets a list of the connections that &#64;interface_ is exported on.
     * @return A list of   all the connections that &#64;interface_ is exported on. The returned   list should be freed with g_list_free() after each element has   been freed with g_object_unref().
    */
    public ch.bailu.gtk.glib.List getConnections()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_get_connections(asCPointer())));
    }

    /**
     * Gets the &#35;GDBusInterfaceSkeletonFlags that describes what the behavior
     * <br>of &#64;interface_
     * @return One or more flags from the &#35;GDBusInterfaceSkeletonFlags enumeration.
    */
    public int getFlags()  {
        return JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_get_flags(asCPointer());
    }

    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * <br>implemented by &#64;interface_.
     * @return A &#35;GDBusInterfaceInfo (never %NULL). Do not free.
    */
    public DBusInterfaceInfo getInfo()  {
        return new DBusInterfaceInfo(new PointerContainer(JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_get_info(asCPointer())));
    }

    /**
     * Gets the object path that &#64;interface_ is exported on, if any.
     * @return A string owned by &#64;interface_ or %NULL if &#64;interface_ is not exported anywhere. Do not free, the string belongs to &#64;interface_.
    */
    public ch.bailu.gtk.type.Str getObjectPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_get_object_path(asCPointer())));
    }

    /**
     * Gets all D-Bus properties for &#64;interface_.
     * @return A &#35;GVariant of type ['a{sv}'][G-VARIANT-TYPE-VARDICT:CAPS]. Free with g_variant_unref().
    */
    public ch.bailu.gtk.glib.Variant getProperties()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_get_properties(asCPointer())));
    }

    /**
     * Gets the interface vtable for the D-Bus interface implemented by
     * <br>&#64;interface_. The returned function pointers should expect &#64;interface_
     * <br>itself to be passed as &#64;user_data.
     * @return A &#35;GDBusInterfaceVTable (never %NULL).
    */
    public DBusInterfaceVTable getVtable()  {
        return new DBusInterfaceVTable(new PointerContainer(JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_get_vtable(asCPointer())));
    }

    /**
     * Checks if &#64;interface_ is exported on &#64;connection.
     * @param connection A &#35;GDBusConnection.
     * @return %TRUE if &#64;interface_ is exported on &#64;connection, %FALSE otherwise.
    */
    public boolean hasConnection(@Nonnull DBusConnection connection)  {
        return JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_has_connection(asCPointer(), asCPointerNotNull(connection));
    }

    /**
     * Sets flags describing what the behavior of &#64;skeleton should be.
     * @param flags Flags from the &#35;GDBusInterfaceSkeletonFlags enumeration.
    */
    public void setFlags(int flags)  {
        JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_set_flags(asCPointer(), flags);
    }

    /**
     * Stops exporting &#64;interface_ on all connections it is exported on.
     * <br>
     * <br>To unexport &#64;interface_ from only a single connection, use
     * <br>g_dbus_interface_skeleton_unexport_from_connection()
    */
    public void unexport()  {
        JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_unexport(asCPointer());
    }

    /**
     * Stops exporting &#64;interface_ on &#64;connection.
     * <br>
     * <br>To stop exporting on all connections the interface is exported on,
     * <br>use g_dbus_interface_skeleton_unexport().
     * @param connection A &#35;GDBusConnection.
    */
    public void unexportFromConnection(@Nonnull DBusConnection connection)  {
        JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_unexport_from_connection(asCPointer(), asCPointerNotNull(connection));
    }

    public final static String SIGNAL_ON_G_AUTHORIZE_METHOD = "g-authorize-method";
    
    /**
     * Connect to signal "g-authorize-method".
     * <br>See {@link OnGAuthorizeMethod#onGAuthorizeMethod} for signal description.
     * <br>Field {@link #SIGNAL_ON_G_AUTHORIZE_METHOD} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onGAuthorizeMethod(OnGAuthorizeMethod signal) {
        return connectSignal(SIGNAL_ON_G_AUTHORIZE_METHOD, toOnGAuthorizeMethod(signal));
    }

    /**
     * Implements interface {@link DBusInterface}. Call this to get access to interface functions.
     * @return {@link DBusInterface}
    */
    public DBusInterface asDBusInterface() {
        return new DBusInterface(cast());
    }

    public static long getTypeID() { 
        return JnaDBusInterfaceSkeleton.INST().g_dbus_interface_skeleton_get_type(); 
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
