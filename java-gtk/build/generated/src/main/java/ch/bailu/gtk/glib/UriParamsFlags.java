/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface UriParamsFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * Parameter names are case insensitive.
    */
    int CASE_INSENSITIVE = 1;

    /**
     * Replace `+` with space character. Only useful for
     * <br>    URLs on the web, using the `https` or `http` schemas.
    */
    int WWW_FORM = 2;

    /**
     * See %G_URI_FLAGS_PARSE_RELAXED.
    */
    int PARSE_RELAXED = 4;

}

/*
enumeration-type
*/
