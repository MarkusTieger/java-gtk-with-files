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
public interface DBusServerFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * All &#35;GDBusServer::new-connection
     * <br>signals will run in separated dedicated threads (see signal for
     * <br>details).
    */
    int RUN_IN_THREAD = 1;

    /**
     * Allow the anonymous
     * <br>authentication method.
    */
    int AUTHENTICATION_ALLOW_ANONYMOUS = 2;

    /**
     * Require the UID of the
     * <br>peer to be the same as the UID of the server when authenticating. (Since: 2.68)
    */
    int AUTHENTICATION_REQUIRE_SAME_USER = 4;

}

/*
enumeration-type
*/
