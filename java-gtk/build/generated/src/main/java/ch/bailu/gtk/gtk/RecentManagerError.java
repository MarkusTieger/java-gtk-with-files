/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface RecentManagerError {

    /**
     * the URI specified does not exists in
     * <br>  the recently used resources list.
    */
    int NOT_FOUND = 0;

    /**
     * the URI specified is not valid.
    */
    int INVALID_URI = 1;

    /**
     * the supplied string is not
     * <br>  UTF-8 encoded.
    */
    int INVALID_ENCODING = 2;

    /**
     * no application has registered
     * <br>  the specified item.
    */
    int NOT_REGISTERED = 3;

    /**
     * failure while reading the recently used
     * <br>  resources file.
    */
    int READ = 4;

    /**
     * failure while writing the recently used
     * <br>  resources file.
    */
    int WRITE = 5;

    /**
     * unspecified error.
    */
    int UNKNOWN = 6;

}

/*
enumeration-type
*/
