/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDebugControllerDBus is an implementation of &#35;GDebugController which exposes
 * <br>debug settings as a D-Bus object.
 * <br>
 * <br>It is a &#35;GInitable object, and will register an object at
 * <br>`/org/gtk/Debugging` on the bus given as
 * <br>&#35;GDebugControllerDBus:connection once it’s initialized. The object will be
 * <br>unregistered when the last reference to the &#35;GDebugControllerDBus is dropped.
 * <br>
 * <br>This D-Bus object can be used by remote processes to enable or disable debug
 * <br>output in this process. Remote processes calling
 * <br>`org.gtk.Debugging.SetDebugEnabled()` will affect the value of
 * <br>&#35;GDebugController:debug-enabled and, by default, g_log_get_debug_enabled().
 * <br>default.
 * <br>
 * <br>By default, all processes will be able to call `SetDebugEnabled()`. If this
 * <br>process is privileged, or might expose sensitive information in its debug
 * <br>output, you may want to restrict the ability to enable debug output to
 * <br>privileged users or processes.
 * <br>
 * <br>One option is to install a D-Bus security policy which restricts access to
 * <br>`SetDebugEnabled()`, installing something like the following in
 * <br>`$datadir/dbus-1/system.d/`:
 * <pre>&lt;!-- language=&quot;XML&quot; --&gt;
 * &lt;?xml version=&quot;1.0&quot;?&gt; &lt;!--*-nxml-*--&gt;
 * &lt;!DOCTYPE busconfig PUBLIC &quot;-//freedesktop//DTD D-BUS Bus Configuration 1.0//EN&quot;
 *      &quot;http://www.freedesktop.org/standards/dbus/1.0/busconfig.dtd&quot;&gt;
 * &lt;busconfig&gt;
 *   &lt;policy user=&quot;root&quot;&gt;
 *     &lt;allow send_destination=&quot;com.example.MyService&quot; send_interface=&quot;org.gtk.Debugging&quot;/&gt;
 *   &lt;/policy&gt;
 *   &lt;policy context=&quot;default&quot;&gt;
 *     &lt;deny send_destination=&quot;com.example.MyService&quot; send_interface=&quot;org.gtk.Debugging&quot;/&gt;
 *   &lt;/policy&gt;
 * &lt;/busconfig&gt;
 * </pre>
 * <br>
 * <br>This will prevent the `SetDebugEnabled()` method from being called by all
 * <br>except root. It will not prevent the `DebugEnabled` property from being read,
 * <br>as it’s accessed through the `org.freedesktop.DBus.Properties` interface.
 * <br>
 * <br>Another option is to use polkit to allow or deny requests on a case-by-case
 * <br>basis, allowing for the possibility of dynamic authorisation. To do this,
 * <br>connect to the &#35;GDebugControllerDBus::authorize signal and query polkit in
 * <br>it:
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 *   g_autoptr(GError) child_error = NULL;
 *   g_autoptr(GDBusConnection) connection = g_bus_get_sync (G_BUS_TYPE_SYSTEM, NULL, NULL);
 *   gulong debug_controller_authorize_id = 0;
 * 
 *   // Set up the debug controller.
 *   debug_controller = G_DEBUG_CONTROLLER (g_debug_controller_dbus_new (priv-&gt;connection, NULL, &amp;child_error));
 *   if (debug_controller == NULL)
 *     {
 *       g_error (&quot;Could not register debug controller on bus: %s&quot;),
 *                child_error-&gt;message);
 *     }
 * 
 *   debug_controller_authorize_id = g_signal_connect (debug_controller,
 *                                                     &quot;authorize&quot;,
 *                                                     G_CALLBACK (debug_controller_authorize_cb),
 *                                                     self);
 * 
 *   static gboolean
 *   debug_controller_authorize_cb (GDebugControllerDBus  *debug_controller,
 *                                  GDBusMethodInvocation *invocation,
 *                                  gpointer               user_data)
 *   {
 *     g_autoptr(PolkitAuthority) authority = NULL;
 *     g_autoptr(PolkitSubject) subject = NULL;
 *     g_autoptr(PolkitAuthorizationResult) auth_result = NULL;
 *     g_autoptr(GError) local_error = NULL;
 *     GDBusMessage *message;
 *     GDBusMessageFlags message_flags;
 *     PolkitCheckAuthorizationFlags flags = POLKIT_CHECK_AUTHORIZATION_FLAGS_NONE;
 * 
 *     message = g_dbus_method_invocation_get_message (invocation);
 *     message_flags = g_dbus_message_get_flags (message);
 * 
 *     authority = polkit_authority_get_sync (NULL, &amp;local_error);
 *     if (authority == NULL)
 *       {
 *         g_warning (&quot;Failed to get polkit authority: %s&quot;, local_error-&gt;message);
 *         return FALSE;
 *       }
 * 
 *     if (message_flags &amp; G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION)
 *       flags |= POLKIT_CHECK_AUTHORIZATION_FLAGS_ALLOW_USER_INTERACTION;
 * 
 *     subject = polkit_system_bus_name_new (g_dbus_method_invocation_get_sender (invocation));
 * 
 *     auth_result = polkit_authority_check_authorization_sync (authority,
 *                                                              subject,
 *                                                              &quot;com.example.MyService.set-debug-enabled&quot;,
 *                                                              NULL,
 *                                                              flags,
 *                                                              NULL,
 *                                                              &amp;local_error);
 *     if (auth_result == NULL)
 *       {
 *         g_warning (&quot;Failed to get check polkit authorization: %s&quot;, local_error-&gt;message);
 *         return FALSE;
 *       }
 * 
 *     return polkit_authorization_result_get_is_authorized (auth_result);
 *   }
 * </pre>
 * <p><a href="https://docs.gtk.org/gio/class.DebugControllerDBus.html">https://docs.gtk.org/gio/class.DebugControllerDBus.html</a></p>
*/
public class DebugControllerDBus extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DebugControllerDBus.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAuthorize {
        /**
         * Emitted when a D-Bus peer is trying to change the debug settings and used
         * <br>to determine if that is authorized.
         * <br>
         * <br>This signal is emitted in a dedicated worker thread, so handlers are
         * <br>allowed to perform blocking I/O. This means that, for example, it is
         * <br>appropriate to call `polkit_authority_check_authorization_sync()` to check
         * <br>authorization using polkit.
         * <br>
         * <br>If %FALSE is returned then no further handlers are run and the request to
         * <br>change the debug settings is rejected.
         * <br>
         * <br>Otherwise, if %TRUE is returned, signal emission continues. If no handlers
         * <br>return %FALSE, then the debug settings are allowed to be changed.
         * <br>
         * <br>Signal handlers must not modify &#64;invocation, or cause it to return a value.
         * <br>
         * <br>The default class handler just returns %TRUE.
         * @param invocation A &#35;GDBusMethodInvocation.
         * @return %TRUE if the call is authorized, %FALSE otherwise.
        */
        boolean onAuthorize(@Nonnull DBusMethodInvocation invocation);
    }
    
    private static com.sun.jna.Callback toOnAuthorize(OnAuthorize in) {
        return (in == null) ? null: (JnaDebugControllerDBus.OnAuthorize) (__self, _invocation, __data) -> in.onAuthorize(new DBusMethodInvocation(new PointerContainer(_invocation)));
    }

    public DebugControllerDBus(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a new &#35;GDebugControllerDBus and synchronously initialize it.
     * <br>
     * <br>Initializing the object will export the debug object on &#64;connection. The
     * <br>object will remain registered until the last reference to the
     * <br>&#35;GDebugControllerDBus is dropped.
     * <br>
     * <br>Initialization may fail if registering the object on &#64;connection fails.
     * @param connection a &#35;GDBusConnection to register the debug object on
     * @param cancellable a &#35;GCancellable, or %NULL
    */
    public DebugControllerDBus(@Nonnull DBusConnection connection, @Nullable Cancellable cancellable) {
        super(cast(JnaDebugControllerDBus.INST().g_debug_controller_dbus_new(asCPointerNotNull(connection), asCPointer(cancellable), 0L)));
    }

    /**
     * Stop the debug controller, unregistering its object from the bus.
     * <br>
     * <br>Any pending method calls to the object will complete successfully, but new
     * <br>ones will return an error. This method will block until all pending
     * <br>&#35;GDebugControllerDBus::authorize signals have been handled. This is expected
     * <br>to not take long, as it will just be waiting for threads to join. If any
     * <br>&#35;GDebugControllerDBus::authorize signal handlers are still executing in other
     * <br>threads, this will block until after they have returned.
     * <br>
     * <br>This method will be called automatically when the final reference to the
     * <br>&#35;GDebugControllerDBus is dropped. You may want to call it explicitly to know
     * <br>when the controller has been fully removed from the bus, or to break
     * <br>reference count cycles.
     * <br>
     * <br>Calling this method from within a &#35;GDebugControllerDBus::authorize signal
     * <br>handler will cause a deadlock and must not be done.
    */
    public void stop()  {
        JnaDebugControllerDBus.INST().g_debug_controller_dbus_stop(asCPointer());
    }

    public final static String SIGNAL_ON_AUTHORIZE = "authorize";
    
    /**
     * Connect to signal "authorize".
     * <br>See {@link OnAuthorize#onAuthorize} for signal description.
     * <br>Field {@link #SIGNAL_ON_AUTHORIZE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAuthorize(OnAuthorize signal) {
        return connectSignal(SIGNAL_ON_AUTHORIZE, toOnAuthorize(signal));
    }

    /**
     * Implements interface {@link DebugController}. Call this to get access to interface functions.
     * @return {@link DebugController}
    */
    public DebugController asDebugController() {
        return new DebugController(cast());
    }

    /**
     * Implements interface {@link Initable}. Call this to get access to interface functions.
     * @return {@link Initable}
    */
    public Initable asInitable() {
        return new Initable(cast());
    }

    public static long getTypeID() { 
        return JnaDebugControllerDBus.INST().g_debug_controller_dbus_get_type(); 
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
