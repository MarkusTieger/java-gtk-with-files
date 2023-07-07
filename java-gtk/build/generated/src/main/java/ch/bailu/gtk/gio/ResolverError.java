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
public interface ResolverError {

    /**
     * the requested name/address/service was not
     * <br>    found
    */
    int NOT_FOUND = 0;

    /**
     * the requested information could not
     * <br>    be looked up due to a network error or similar problem
    */
    int TEMPORARY_FAILURE = 1;

    /**
     * unknown error
    */
    int INTERNAL = 2;

}

/*
enumeration-type
*/
