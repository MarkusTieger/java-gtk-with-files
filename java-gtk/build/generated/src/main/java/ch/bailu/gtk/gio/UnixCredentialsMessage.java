/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * This &#35;GSocketControlMessage contains a &#35;GCredentials instance.  It
 * <br>may be sent using g_socket_send_message() and received using
 * <br>g_socket_receive_message() over UNIX sockets (ie: sockets in the
 * <br>%G_SOCKET_FAMILY_UNIX family).
 * <br>
 * <br>For an easier way to send and receive credentials over
 * <br>stream-oriented UNIX sockets, see
 * <br>g_unix_connection_send_credentials() and
 * <br>g_unix_connection_receive_credentials(). To receive credentials of
 * <br>a foreign process connected to a socket, use
 * <br>g_socket_get_credentials().
 * <br>
 * <br>Since GLib 2.72, &#35;GUnixCredentialMessage is available on all platforms. It
 * <br>requires underlying system support (such as Windows 10 with `AF_UNIX`) at run
 * <br>time.
 * <br>
 * <br>Before GLib 2.72, `&lt;gio/gunixcredentialsmessage.h&gt;` belonged to the UNIX-specific
 * <br>GIO interfaces, thus you had to use the `gio-unix-2.0.pc` pkg-config file
 * <br>when using it. This is no longer necessary since GLib 2.72.
 * <p><a href="https://docs.gtk.org/gio/class.UnixCredentialsMessage.html">https://docs.gtk.org/gio/class.UnixCredentialsMessage.html</a></p>
*/
public class UnixCredentialsMessage extends SocketControlMessage {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(UnixCredentialsMessage.class.getCanonicalName());
    }

    public UnixCredentialsMessage(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GUnixCredentialsMessage holding &#64;credentials.
     * @param credentials A &#35;GCredentials object.
     * @return a new &#35;GUnixCredentialsMessage
    */
    public static UnixCredentialsMessage newWithCredentialsUnixCredentialsMessage(@Nonnull Credentials credentials)  {
        PointerContainer __self = cast(JnaUnixCredentialsMessage.INST().g_unix_credentials_message_new_with_credentials(asCPointerNotNull(credentials)));
        if (__self.isNull()) {
            throw new NullPointerException("UnixCredentialsMessage:newWithCredentials");
        }
        return new UnixCredentialsMessage(__self);
    }        
    

    /**
     * Creates a new &#35;GUnixCredentialsMessage with credentials matching the current processes.
    */
    public UnixCredentialsMessage() {
        super(cast(JnaUnixCredentialsMessage.INST().g_unix_credentials_message_new()));
    }

    /**
     * Gets the credentials stored in &#64;message.
     * @return A &#35;GCredentials instance. Do not free, it is owned by &#64;message.
    */
    public Credentials getCredentials()  {
        return new Credentials(new PointerContainer(JnaUnixCredentialsMessage.INST().g_unix_credentials_message_get_credentials(asCPointer())));
    }

    /**
     * Checks if passing &#35;GCredentials on a &#35;GSocket is supported on this platform.
     * @return %TRUE if supported, %FALSE otherwise
    */
    public static boolean isSupported()  {
        return JnaUnixCredentialsMessage.INST().g_unix_credentials_message_is_supported();
    }

    public static long getTypeID() { 
        return JnaUnixCredentialsMessage.INST().g_unix_credentials_message_get_type(); 
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
