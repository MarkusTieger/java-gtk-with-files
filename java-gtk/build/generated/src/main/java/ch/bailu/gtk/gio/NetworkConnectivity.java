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
public interface NetworkConnectivity {

    /**
     * The host is not configured with a
     * <br>  route to the Internet; it may or may not be connected to a local
     * <br>  network.
    */
    int LOCAL = 1;

    /**
     * The host is connected to a network, but
     * <br>  does not appear to be able to reach the full Internet, perhaps
     * <br>  due to upstream network problems.
    */
    int LIMITED = 2;

    /**
     * The host is behind a captive portal and
     * <br>  cannot reach the full Internet.
    */
    int PORTAL = 3;

    /**
     * The host is connected to a network, and
     * <br>  appears to be able to reach the full Internet.
    */
    int FULL = 4;

}

/*
enumeration-type
*/
