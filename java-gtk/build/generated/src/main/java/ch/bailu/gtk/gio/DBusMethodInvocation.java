/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Instances of the &#35;GDBusMethodInvocation class are used when
 * <br>handling D-Bus method calls. It provides a way to asynchronously
 * <br>return results and errors.
 * <br>
 * <br>The normal way to obtain a &#35;GDBusMethodInvocation object is to receive
 * <br>it as an argument to the handle_method_call() function in a
 * <br>&#35;GDBusInterfaceVTable that was passed to g_dbus_connection_register_object().
 * <p><a href="https://docs.gtk.org/gio/class.DBusMethodInvocation.html">https://docs.gtk.org/gio/class.DBusMethodInvocation.html</a></p>
*/
public class DBusMethodInvocation extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusMethodInvocation.class.getCanonicalName());
    }

    public DBusMethodInvocation(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the &#35;GDBusConnection the method was invoked on.
     * @return A &#35;GDBusConnection. Do not free, it is owned by &#64;invocation.
    */
    public DBusConnection getConnection()  {
        return new DBusConnection(new PointerContainer(JnaDBusMethodInvocation.INST().g_dbus_method_invocation_get_connection(asCPointer())));
    }

    /**
     * Gets the name of the D-Bus interface the method was invoked on.
     * <br>
     * <br>If this method call is a property Get, Set or GetAll call that has
     * <br>been redirected to the method call handler then
     * <br>&quot;org.freedesktop.DBus.Properties&quot; will be returned.  See
     * <br>&#35;GDBusInterfaceVTable for more information.
     * @return A string. Do not free, it is owned by &#64;invocation.
    */
    public ch.bailu.gtk.type.Str getInterfaceName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusMethodInvocation.INST().g_dbus_method_invocation_get_interface_name(asCPointer())));
    }

    /**
     * Gets the &#35;GDBusMessage for the method invocation. This is useful if
     * <br>you need to use low-level protocol features, such as UNIX file
     * <br>descriptor passing, that cannot be properly expressed in the
     * <br>&#35;GVariant API.
     * <br>
     * <br>See this [server][gdbus-server] and [client][gdbus-unix-fd-client]
     * <br>for an example of how to use this low-level API to send and receive
     * <br>UNIX file descriptors.
     * @return &#35;GDBusMessage. Do not free, it is owned by &#64;invocation.
    */
    public DBusMessage getMessage()  {
        return new DBusMessage(new PointerContainer(JnaDBusMethodInvocation.INST().g_dbus_method_invocation_get_message(asCPointer())));
    }

    /**
     * Gets information about the method call, if any.
     * <br>
     * <br>If this method invocation is a property Get, Set or GetAll call that
     * <br>has been redirected to the method call handler then %NULL will be
     * <br>returned.  See g_dbus_method_invocation_get_property_info() and
     * <br>&#35;GDBusInterfaceVTable for more information.
     * @return A &#35;GDBusMethodInfo or %NULL. Do not free, it is owned by &#64;invocation.
    */
    public DBusMethodInfo getMethodInfo()  {
        return new DBusMethodInfo(new PointerContainer(JnaDBusMethodInvocation.INST().g_dbus_method_invocation_get_method_info(asCPointer())));
    }

    /**
     * Gets the name of the method that was invoked.
     * @return A string. Do not free, it is owned by &#64;invocation.
    */
    public ch.bailu.gtk.type.Str getMethodName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusMethodInvocation.INST().g_dbus_method_invocation_get_method_name(asCPointer())));
    }

    /**
     * Gets the object path the method was invoked on.
     * @return A string. Do not free, it is owned by &#64;invocation.
    */
    public ch.bailu.gtk.type.Str getObjectPath()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusMethodInvocation.INST().g_dbus_method_invocation_get_object_path(asCPointer())));
    }

    /**
     * Gets the parameters of the method invocation. If there are no input
     * <br>parameters then this will return a GVariant with 0 children rather than NULL.
     * @return A &#35;GVariant tuple. Do not unref this because it is owned by &#64;invocation.
    */
    public ch.bailu.gtk.glib.Variant getParameters()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaDBusMethodInvocation.INST().g_dbus_method_invocation_get_parameters(asCPointer())));
    }

    /**
     * Gets information about the property that this method call is for, if
     * <br>any.
     * <br>
     * <br>This will only be set in the case of an invocation in response to a
     * <br>property Get or Set call that has been directed to the method call
     * <br>handler for an object on account of its property_get() or
     * <br>property_set() vtable pointers being unset.
     * <br>
     * <br>See &#35;GDBusInterfaceVTable for more information.
     * <br>
     * <br>If the call was GetAll, %NULL will be returned.
     * @return a &#35;GDBusPropertyInfo or %NULL
    */
    public DBusPropertyInfo getPropertyInfo()  {
        return new DBusPropertyInfo(new PointerContainer(JnaDBusMethodInvocation.INST().g_dbus_method_invocation_get_property_info(asCPointer())));
    }

    /**
     * Gets the bus name that invoked the method.
     * @return A string. Do not free, it is owned by &#64;invocation.
    */
    public ch.bailu.gtk.type.Str getSender()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDBusMethodInvocation.INST().g_dbus_method_invocation_get_sender(asCPointer())));
    }

    /**
     * Gets the &#64;user_data &#35;gpointer passed to g_dbus_connection_register_object().
     * @return A &#35;gpointer.
    */
    public ch.bailu.gtk.type.Pointer getUserData()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaDBusMethodInvocation.INST().g_dbus_method_invocation_get_user_data(asCPointer())));
    }

    /**
     * Finishes handling a D-Bus method call by returning an error.
     * <br>
     * <br>This method will take ownership of &#64;invocation. See
     * <br>&#35;GDBusInterfaceVTable for more information about the ownership of
     * <br>&#64;invocation.
     * @param error_name A valid D-Bus error name.
     * @param error_message A valid D-Bus error message.
    */
    public void returnDbusError(@Nonnull ch.bailu.gtk.type.Str error_name, @Nonnull ch.bailu.gtk.type.Str error_message)  {
        JnaDBusMethodInvocation.INST().g_dbus_method_invocation_return_dbus_error(asCPointer(), asCPointerNotNull(error_name), asCPointerNotNull(error_message));
    }

    /**
     * Finishes handling a D-Bus method call by returning an error.
     * <br>
     * <br>This method will take ownership of &#64;invocation. See
     * <br>&#35;GDBusInterfaceVTable for more information about the ownership of
     * <br>&#64;invocation.
     * @param error_name A valid D-Bus error name.
     * @param error_message A valid D-Bus error message.
    */
    public void returnDbusError(String error_name, String error_message)  {
        JnaDBusMethodInvocation.INST().g_dbus_method_invocation_return_dbus_error(asCPointer(), error_name, error_message);
    }

    /**
     * Finishes handling a D-Bus method call by returning an error.
     * <br>
     * <br>See g_dbus_error_encode_gerror() for details about what error name
     * <br>will be returned on the wire. In a nutshell, if the given error is
     * <br>registered using g_dbus_error_register_error() the name given
     * <br>during registration is used. Otherwise, a name of the form
     * <br>`org.gtk.GDBus.UnmappedGError.Quark...` is used. This provides
     * <br>transparent mapping of &#35;GError between applications using GDBus.
     * <br>
     * <br>If you are writing an application intended to be portable,
     * <br>always register errors with g_dbus_error_register_error()
     * <br>or use g_dbus_method_invocation_return_dbus_error().
     * <br>
     * <br>This method will take ownership of &#64;invocation. See
     * <br>&#35;GDBusInterfaceVTable for more information about the ownership of
     * <br>&#64;invocation.
     * <br>
     * <br>Since 2.48, if the method call requested for a reply not to be sent
     * <br>then this call will free &#64;invocation but otherwise do nothing (as per
     * <br>the recommendations of the D-Bus specification).
     * @param domain A &#35;GQuark for the &#35;GError error domain.
     * @param code The error code.
     * @param format printf()-style format.
     * @param _elipse Parameters for &#64;format.
    */
    public void returnError(int domain, int code, @Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaDBusMethodInvocation.INST().g_dbus_method_invocation_return_error(asCPointer(), domain, code, asCPointerNotNull(format), _elipse);
    }

    /**
     * Finishes handling a D-Bus method call by returning an error.
     * <br>
     * <br>See g_dbus_error_encode_gerror() for details about what error name
     * <br>will be returned on the wire. In a nutshell, if the given error is
     * <br>registered using g_dbus_error_register_error() the name given
     * <br>during registration is used. Otherwise, a name of the form
     * <br>`org.gtk.GDBus.UnmappedGError.Quark...` is used. This provides
     * <br>transparent mapping of &#35;GError between applications using GDBus.
     * <br>
     * <br>If you are writing an application intended to be portable,
     * <br>always register errors with g_dbus_error_register_error()
     * <br>or use g_dbus_method_invocation_return_dbus_error().
     * <br>
     * <br>This method will take ownership of &#64;invocation. See
     * <br>&#35;GDBusInterfaceVTable for more information about the ownership of
     * <br>&#64;invocation.
     * <br>
     * <br>Since 2.48, if the method call requested for a reply not to be sent
     * <br>then this call will free &#64;invocation but otherwise do nothing (as per
     * <br>the recommendations of the D-Bus specification).
     * @param domain A &#35;GQuark for the &#35;GError error domain.
     * @param code The error code.
     * @param format printf()-style format.
     * @param _elipse Parameters for &#64;format.
    */
    public void returnError(int domain, int code, String format, java.lang.Object... _elipse)  {
        JnaDBusMethodInvocation.INST().g_dbus_method_invocation_return_error(asCPointer(), domain, code, format, _elipse);
    }

    /**
     * Like g_dbus_method_invocation_return_error() but without printf()-style formatting.
     * <br>
     * <br>This method will take ownership of &#64;invocation. See
     * <br>&#35;GDBusInterfaceVTable for more information about the ownership of
     * <br>&#64;invocation.
     * @param domain A &#35;GQuark for the &#35;GError error domain.
     * @param code The error code.
     * @param message The error message.
    */
    public void returnErrorLiteral(int domain, int code, @Nonnull ch.bailu.gtk.type.Str message)  {
        JnaDBusMethodInvocation.INST().g_dbus_method_invocation_return_error_literal(asCPointer(), domain, code, asCPointerNotNull(message));
    }

    /**
     * Like g_dbus_method_invocation_return_error() but without printf()-style formatting.
     * <br>
     * <br>This method will take ownership of &#64;invocation. See
     * <br>&#35;GDBusInterfaceVTable for more information about the ownership of
     * <br>&#64;invocation.
     * @param domain A &#35;GQuark for the &#35;GError error domain.
     * @param code The error code.
     * @param message The error message.
    */
    public void returnErrorLiteral(int domain, int code, String message)  {
        JnaDBusMethodInvocation.INST().g_dbus_method_invocation_return_error_literal(asCPointer(), domain, code, message);
    }

    /**
     * Like g_dbus_method_invocation_return_error() but takes a &#35;GError
     * <br>instead of the error domain, error code and message.
     * <br>
     * <br>This method will take ownership of &#64;invocation. See
     * <br>&#35;GDBusInterfaceVTable for more information about the ownership of
     * <br>&#64;invocation.
     * @param error A &#35;GError.
    */
    public void returnGerror(@Nonnull ch.bailu.gtk.glib.Error error)  {
        JnaDBusMethodInvocation.INST().g_dbus_method_invocation_return_gerror(asCPointer(), asCPointerNotNull(error));
    }

    /**
     * Finishes handling a D-Bus method call by returning &#64;parameters.
     * <br>If the &#64;parameters GVariant is floating, it is consumed.
     * <br>
     * <br>It is an error if &#64;parameters is not of the right format: it must be a tuple
     * <br>containing the out-parameters of the D-Bus method. Even if the method has a
     * <br>single out-parameter, it must be contained in a tuple. If the method has no
     * <br>out-parameters, &#64;parameters may be %NULL or an empty tuple.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GDBusMethodInvocation *invocation = some_invocation;
     * g_autofree gchar *result_string = NULL;
     * g_autoptr (GError) error = NULL;
     * 
     * result_string = calculate_result (&amp;error);
     * 
     * if (error != NULL)
     *   g_dbus_method_invocation_return_gerror (invocation, error);
     * else
     *   g_dbus_method_invocation_return_value (invocation,
     *                                          g_variant_new (&quot;(s)&quot;, result_string));
     * 
     * // Do not free &#64;invocation here; returning a value does that
     * </pre>
     * <br>
     * <br>This method will take ownership of &#64;invocation. See
     * <br>&#35;GDBusInterfaceVTable for more information about the ownership of
     * <br>&#64;invocation.
     * <br>
     * <br>Since 2.48, if the method call requested for a reply not to be sent
     * <br>then this call will sink &#64;parameters and free &#64;invocation, but
     * <br>otherwise do nothing (as per the recommendations of the D-Bus
     * <br>specification).
     * @param parameters A &#35;GVariant tuple with out parameters for the method or %NULL if not passing any parameters.
    */
    public void returnValue(@Nullable ch.bailu.gtk.glib.Variant parameters)  {
        JnaDBusMethodInvocation.INST().g_dbus_method_invocation_return_value(asCPointer(), asCPointer(parameters));
    }

    /**
     * Like g_dbus_method_invocation_return_value() but also takes a &#35;GUnixFDList.
     * <br>
     * <br>This method is only available on UNIX.
     * <br>
     * <br>This method will take ownership of &#64;invocation. See
     * <br>&#35;GDBusInterfaceVTable for more information about the ownership of
     * <br>&#64;invocation.
     * @param parameters A &#35;GVariant tuple with out parameters for the method or %NULL if not passing any parameters.
     * @param fd_list A &#35;GUnixFDList or %NULL.
    */
    public void returnValueWithUnixFdList(@Nullable ch.bailu.gtk.glib.Variant parameters, @Nullable UnixFDList fd_list)  {
        JnaDBusMethodInvocation.INST().g_dbus_method_invocation_return_value_with_unix_fd_list(asCPointer(), asCPointer(parameters), asCPointer(fd_list));
    }

    /**
     * Like g_dbus_method_invocation_return_gerror() but takes ownership
     * <br>of &#64;error so the caller does not need to free it.
     * <br>
     * <br>This method will take ownership of &#64;invocation. See
     * <br>&#35;GDBusInterfaceVTable for more information about the ownership of
     * <br>&#64;invocation.
     * @param error A &#35;GError.
    */
    public void takeError(@Nonnull ch.bailu.gtk.glib.Error error)  {
        JnaDBusMethodInvocation.INST().g_dbus_method_invocation_take_error(asCPointer(), asCPointerNotNull(error));
    }

    public static long getTypeID() { 
        return JnaDBusMethodInvocation.INST().g_dbus_method_invocation_get_type(); 
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

[MethodModel:java-type-not-supported:returnErrorValist:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GQuark}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
*/
