/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface DBusConnectionFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * Perform authentication against server.
    */
    int AUTHENTICATION_CLIENT = 1;

    /**
     * Perform authentication against client.
    */
    int AUTHENTICATION_SERVER = 2;

    /**
     * When
     * <br>authenticating as a server, allow the anonymous authentication
     * <br>method.
    */
    int AUTHENTICATION_ALLOW_ANONYMOUS = 4;

    /**
     * Pass this flag if connecting to a peer that is a
     * <br>message bus. This means that the Hello() method will be invoked as part of the connection setup.
    */
    int MESSAGE_BUS_CONNECTION = 8;

    /**
     * If set, processing of D-Bus messages is
     * <br>delayed until g_dbus_connection_start_message_processing() is called.
    */
    int DELAY_MESSAGE_PROCESSING = 16;

    /**
     * When authenticating
     * <br>as a server, require the UID of the peer to be the same as the UID of the server. (Since: 2.68)
    */
    int AUTHENTICATION_REQUIRE_SAME_USER = 32;

    /**
     * When authenticating, try to use
     * <br> protocols that work across a Linux user namespace boundary, even if this
     * <br> reduces interoperability with older D-Bus implementations. This currently
     * <br> affects client-side `EXTERNAL` authentication, for which this flag makes
     * <br> connections to a server in another user namespace succeed, but causes
     * <br> a deadlock when connecting to a GDBus server older than 2.73.3. Since: 2.74
    */
    int CROSS_NAMESPACE = 64;

}

/*
enumeration-type
*/
