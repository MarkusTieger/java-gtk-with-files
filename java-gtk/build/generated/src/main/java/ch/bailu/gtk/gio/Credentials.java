/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GCredentials type is a reference-counted wrapper for native
 * <br>credentials. This information is typically used for identifying,
 * <br>authenticating and authorizing other processes.
 * <br>
 * <br>Some operating systems supports looking up the credentials of the
 * <br>remote peer of a communication endpoint - see e.g.
 * <br>g_socket_get_credentials().
 * <br>
 * <br>Some operating systems supports securely sending and receiving
 * <br>credentials over a Unix Domain Socket, see
 * <br>&#35;GUnixCredentialsMessage, g_unix_connection_send_credentials() and
 * <br>g_unix_connection_receive_credentials() for details.
 * <br>
 * <br>On Linux, the native credential type is a `struct ucred` - see the
 * <br>unix(7) man page for details. This corresponds to
 * <br>%G_CREDENTIALS_TYPE_LINUX_UCRED.
 * <br>
 * <br>On Apple operating systems (including iOS, tvOS, and macOS),
 * <br>the native credential type is a `struct xucred`.
 * <br>This corresponds to %G_CREDENTIALS_TYPE_APPLE_XUCRED.
 * <br>
 * <br>On FreeBSD, Debian GNU/kFreeBSD, and GNU/Hurd, the native
 * <br>credential type is a `struct cmsgcred`. This corresponds
 * <br>to %G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED.
 * <br>
 * <br>On NetBSD, the native credential type is a `struct unpcbid`.
 * <br>This corresponds to %G_CREDENTIALS_TYPE_NETBSD_UNPCBID.
 * <br>
 * <br>On OpenBSD, the native credential type is a `struct sockpeercred`.
 * <br>This corresponds to %G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED.
 * <br>
 * <br>On Solaris (including OpenSolaris and its derivatives), the native
 * <br>credential type is a `ucred_t`. This corresponds to
 * <br>%G_CREDENTIALS_TYPE_SOLARIS_UCRED.
 * <br>
 * <br>Since GLib 2.72, on Windows, the native credentials may contain the PID of a
 * <br>process. This corresponds to %G_CREDENTIALS_TYPE_WIN32_PID.
 * <p><a href="https://docs.gtk.org/gio/class.Credentials.html">https://docs.gtk.org/gio/class.Credentials.html</a></p>
*/
public class Credentials extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Credentials.class.getCanonicalName());
    }

    public Credentials(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GCredentials object with credentials matching the
     * <br>the current process.
    */
    public Credentials() {
        super(cast(JnaCredentials.INST().g_credentials_new()));
    }

    /**
     * Gets a pointer to native credentials of type &#64;native_type from
     * <br>&#64;credentials.
     * <br>
     * <br>It is a programming error (which will cause a warning to be
     * <br>logged) to use this method if there is no &#35;GCredentials support for
     * <br>the OS or if &#64;native_type isn't supported by the OS.
     * @param native_type The type of native credentials to get.
     * @return The pointer to native credentials or     %NULL if there is no &#35;GCredentials support for the OS or if &#64;native_type     isn't supported by the OS. Do not free the returned data, it is owned     by &#64;credentials.
    */
    public ch.bailu.gtk.type.Pointer getNative(int native_type)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaCredentials.INST().g_credentials_get_native(asCPointer(), native_type)));
    }

    /**
     * Checks if &#64;credentials and &#64;other_credentials is the same user.
     * <br>
     * <br>This operation can fail if &#35;GCredentials is not supported on the
     * <br>the OS.
     * @param other_credentials A &#35;GCredentials.
     * @return %TRUE if &#64;credentials and &#64;other_credentials has the same user, %FALSE otherwise or if &#64;error is set.
    */
    public boolean isSameUser(@Nonnull Credentials other_credentials) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaCredentials.INST().g_credentials_is_same_user(asCPointer(), asCPointerNotNull(other_credentials), 0L);
    }

    /**
     * Copies the native credentials of type &#64;native_type from &#64;native
     * <br>into &#64;credentials.
     * <br>
     * <br>It is a programming error (which will cause a warning to be
     * <br>logged) to use this method if there is no &#35;GCredentials support for
     * <br>the OS or if &#64;native_type isn't supported by the OS.
     * @param native_type The type of native credentials to set.
     * @param _native A pointer to native credentials.
    */
    public void setNative(int native_type, @Nonnull ch.bailu.gtk.type.Pointer _native)  {
        JnaCredentials.INST().g_credentials_set_native(asCPointer(), native_type, asCPointerNotNull(_native));
    }

    /**
     * Creates a human-readable textual representation of &#64;credentials
     * <br>that can be used in logging and debug messages. The format of the
     * <br>returned string may change in future GLib release.
     * @return A string that should be freed with g_free().
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaCredentials.INST().g_credentials_to_string(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaCredentials.INST().g_credentials_get_type(); 
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

[MethodModel:cb-return-value-not-supported:getUnixPid:[ParameterModel:java-type-not-supported:{G_::{c:pid_t}}:{j:}]]

[MethodModel:cb-return-value-not-supported:getUnixUser:[ParameterModel:java-type-not-supported:{G_::{c:uid_t}}:{j:}]]

[MethodModel:java-type-not-supported:setUnixUser:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:uid_t}}:{j:}]
*/
