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
public interface BookmarkFileError {

    /**
     * URI was ill-formed
    */
    int INVALID_URI = 0;

    /**
     * a requested field was not found
    */
    int INVALID_VALUE = 1;

    /**
     * a requested application did
     * <br>    not register a bookmark
    */
    int APP_NOT_REGISTERED = 2;

    /**
     * a requested URI was not found
    */
    int URI_NOT_FOUND = 3;

    /**
     * document was ill formed
    */
    int READ = 4;

    /**
     * the text being parsed was
     * <br>    in an unknown encoding
    */
    int UNKNOWN_ENCODING = 5;

    /**
     * an error occurred while writing
    */
    int WRITE = 6;

    /**
     * requested file was not found
    */
    int FILE_NOT_FOUND = 7;

}

/*
enumeration-type
*/
