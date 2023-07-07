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
public interface KeyFileFlags {

    /**
     * No flags, default behaviour
    */
    int NONE = 0;

    /**
     * Use this flag if you plan to write the
     * <br>  (possibly modified) contents of the key file back to a file;
     * <br>  otherwise all comments will be lost when the key file is
     * <br>  written back.
    */
    int KEEP_COMMENTS = 1;

    /**
     * Use this flag if you plan to write the
     * <br>  (possibly modified) contents of the key file back to a file;
     * <br>  otherwise only the translations for the current language will be
     * <br>  written back.
    */
    int KEEP_TRANSLATIONS = 2;

}

/*
enumeration-type
*/
