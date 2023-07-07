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
public interface CredentialsType {

    /**
     * Indicates an invalid native credential type.
    */
    int INVALID = 0;

    /**
     * The native credentials type is a `struct ucred`.
    */
    int LINUX_UCRED = 1;

    /**
     * The native credentials type is a `struct cmsgcred`.
    */
    int FREEBSD_CMSGCRED = 2;

    /**
     * The native credentials type is a `struct sockpeercred`. Added in 2.30.
    */
    int OPENBSD_SOCKPEERCRED = 3;

    /**
     * The native credentials type is a `ucred_t`. Added in 2.40.
    */
    int SOLARIS_UCRED = 4;

    /**
     * The native credentials type is a `struct unpcbid`. Added in 2.42.
    */
    int NETBSD_UNPCBID = 5;

    /**
     * The native credentials type is a `struct xucred`. Added in 2.66.
    */
    int APPLE_XUCRED = 6;

    /**
     * The native credentials type is a PID `DWORD`. Added in 2.72.
    */
    int WIN32_PID = 7;

}

/*
enumeration-type
*/
