/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GDBusAuthObserver type provides a mechanism for participating
 * <br>in how a &#35;GDBusServer (or a &#35;GDBusConnection) authenticates remote
 * <br>peers. Simply instantiate a &#35;GDBusAuthObserver and connect to the
 * <br>signals you are interested in. Note that new signals may be added
 * <br>in the future
 * <br>
 * <br>&#35;&#35; Controlling Authentication Mechanisms
 * <br>
 * <br>By default, a &#35;GDBusServer or server-side &#35;GDBusConnection will allow
 * <br>any authentication mechanism to be used. If you only
 * <br>want to allow D-Bus connections with the `EXTERNAL` mechanism,
 * <br>which makes use of credentials passing and is the recommended
 * <br>mechanism for modern Unix platforms such as Linux and the BSD family,
 * <br>you would use a signal handler like this:
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * static gboolean
 * on_allow_mechanism (GDBusAuthObserver *observer,
 *                     const gchar       *mechanism,
 *                     gpointer           user_data)
 * {
 *   if (g_strcmp0 (mechanism, &quot;EXTERNAL&quot;) == 0)
 *     {
 *       return TRUE;
 *     }
 * 
 *   return FALSE;
 * }
 * </pre>
 * <br>
 * <br>&#35;&#35; Controlling Authorization &#35; {&#35;auth-observer}
 * <br>
 * <br>By default, a &#35;GDBusServer or server-side &#35;GDBusConnection will accept
 * <br>connections from any successfully authenticated user (but not from
 * <br>anonymous connections using the `ANONYMOUS` mechanism). If you only
 * <br>want to allow D-Bus connections from processes owned by the same uid
 * <br>as the server, since GLib 2.68, you should use the
 * <br>%G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER flag. It’s equivalent
 * <br>to the following signal handler:
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * static gboolean
 * on_authorize_authenticated_peer (GDBusAuthObserver *observer,
 *                                  GIOStream         *stream,
 *                                  GCredentials      *credentials,
 *                                  gpointer           user_data)
 * {
 *   gboolean authorized;
 * 
 *   authorized = FALSE;
 *   if (credentials != NULL)
 *     {
 *       GCredentials *own_credentials;
 *       own_credentials = g_credentials_new ();
 *       if (g_credentials_is_same_user (credentials, own_credentials, NULL))
 *         authorized = TRUE;
 *       g_object_unref (own_credentials);
 *     }
 * 
 *   return authorized;
 * }
 * </pre>
 * <p><a href="https://docs.gtk.org/gio/class.DBusAuthObserver.html">https://docs.gtk.org/gio/class.DBusAuthObserver.html</a></p>
*/
public class DBusAuthObserver extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusAuthObserver.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAllowMechanism {
        /**
         * Emitted to check if &#64;mechanism is allowed to be used.
         * @param mechanism The name of the mechanism, e.g. `DBUS_COOKIE_SHA1`.
         * @return %TRUE if &#64;mechanism can be used to authenticate the other peer, %FALSE if not.
        */
        boolean onAllowMechanism(@Nonnull ch.bailu.gtk.type.Str mechanism);
    }
    
    private static com.sun.jna.Callback toOnAllowMechanism(OnAllowMechanism in) {
        return (in == null) ? null: (JnaDBusAuthObserver.OnAllowMechanism) (__self, _mechanism, __data) -> in.onAllowMechanism(new ch.bailu.gtk.type.Str(new PointerContainer(_mechanism)));
    }

    @FunctionalInterface
    public interface OnAuthorizeAuthenticatedPeer {
        /**
         * Emitted to check if a peer that is successfully authenticated
         * <br>is authorized.
         * @param stream A &#35;GIOStream for the &#35;GDBusConnection.
         * @param credentials Credentials received from the peer or %NULL.
         * @return %TRUE if the peer is authorized, %FALSE if not.
        */
        boolean onAuthorizeAuthenticatedPeer(@Nonnull IOStream stream, @Nullable Credentials credentials);
    }
    
    private static com.sun.jna.Callback toOnAuthorizeAuthenticatedPeer(OnAuthorizeAuthenticatedPeer in) {
        return (in == null) ? null: (JnaDBusAuthObserver.OnAuthorizeAuthenticatedPeer) (__self, _stream, _credentials, __data) -> in.onAuthorizeAuthenticatedPeer(new IOStream(new PointerContainer(_stream)), new Credentials(new PointerContainer(_credentials)));
    }

    public DBusAuthObserver(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GDBusAuthObserver object.
    */
    public DBusAuthObserver() {
        super(cast(JnaDBusAuthObserver.INST().g_dbus_auth_observer_new()));
    }

    /**
     * Emits the &#35;GDBusAuthObserver::allow-mechanism signal on &#64;observer.
     * @param mechanism The name of the mechanism, e.g. `DBUS_COOKIE_SHA1`.
     * @return %TRUE if &#64;mechanism can be used to authenticate the other peer, %FALSE if not.
    */
    public boolean allowMechanism(@Nonnull ch.bailu.gtk.type.Str mechanism)  {
        return JnaDBusAuthObserver.INST().g_dbus_auth_observer_allow_mechanism(asCPointer(), asCPointerNotNull(mechanism));
    }

    /**
     * Emits the &#35;GDBusAuthObserver::allow-mechanism signal on &#64;observer.
     * @param mechanism The name of the mechanism, e.g. `DBUS_COOKIE_SHA1`.
     * @return %TRUE if &#64;mechanism can be used to authenticate the other peer, %FALSE if not.
    */
    public boolean allowMechanism(String mechanism)  {
        return JnaDBusAuthObserver.INST().g_dbus_auth_observer_allow_mechanism(asCPointer(), mechanism);
    }

    /**
     * Emits the &#35;GDBusAuthObserver::authorize-authenticated-peer signal on &#64;observer.
     * @param stream A &#35;GIOStream for the &#35;GDBusConnection.
     * @param credentials Credentials received from the peer or %NULL.
     * @return %TRUE if the peer is authorized, %FALSE if not.
    */
    public boolean authorizeAuthenticatedPeer(@Nonnull IOStream stream, @Nullable Credentials credentials)  {
        return JnaDBusAuthObserver.INST().g_dbus_auth_observer_authorize_authenticated_peer(asCPointer(), asCPointerNotNull(stream), asCPointer(credentials));
    }

    public final static String SIGNAL_ON_ALLOW_MECHANISM = "allow-mechanism";
    
    /**
     * Connect to signal "allow-mechanism".
     * <br>See {@link OnAllowMechanism#onAllowMechanism} for signal description.
     * <br>Field {@link #SIGNAL_ON_ALLOW_MECHANISM} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAllowMechanism(OnAllowMechanism signal) {
        return connectSignal(SIGNAL_ON_ALLOW_MECHANISM, toOnAllowMechanism(signal));
    }

    public final static String SIGNAL_ON_AUTHORIZE_AUTHENTICATED_PEER = "authorize-authenticated-peer";
    
    /**
     * Connect to signal "authorize-authenticated-peer".
     * <br>See {@link OnAuthorizeAuthenticatedPeer#onAuthorizeAuthenticatedPeer} for signal description.
     * <br>Field {@link #SIGNAL_ON_AUTHORIZE_AUTHENTICATED_PEER} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAuthorizeAuthenticatedPeer(OnAuthorizeAuthenticatedPeer signal) {
        return connectSignal(SIGNAL_ON_AUTHORIZE_AUTHENTICATED_PEER, toOnAuthorizeAuthenticatedPeer(signal));
    }

    public static long getTypeID() { 
        return JnaDBusAuthObserver.INST().g_dbus_auth_observer_get_type(); 
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
