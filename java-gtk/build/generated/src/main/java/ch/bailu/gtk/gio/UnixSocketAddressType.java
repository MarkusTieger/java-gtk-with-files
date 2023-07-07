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
public interface UnixSocketAddressType {

    /**
     * invalid
    */
    int INVALID = 0;

    /**
     * anonymous
    */
    int ANONYMOUS = 1;

    /**
     * a filesystem path
    */
    int PATH = 2;

    /**
     * an abstract name
    */
    int ABSTRACT = 3;

    /**
     * an abstract name, 0-padded
     * <br>  to the full length of a unix socket name
    */
    int ABSTRACT_PADDED = 4;

}

/*
enumeration-type
*/
