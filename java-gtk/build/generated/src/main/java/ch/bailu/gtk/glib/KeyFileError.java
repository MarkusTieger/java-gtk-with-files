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
public interface KeyFileError {

    /**
     * the text being parsed was in
     * <br>  an unknown encoding
    */
    int UNKNOWN_ENCODING = 0;

    /**
     * document was ill-formed
    */
    int PARSE = 1;

    /**
     * the file was not found
    */
    int NOT_FOUND = 2;

    /**
     * a requested key was not found
    */
    int KEY_NOT_FOUND = 3;

    /**
     * a requested group was not found
    */
    int GROUP_NOT_FOUND = 4;

    /**
     * a value could not be parsed
    */
    int INVALID_VALUE = 5;

}

/*
enumeration-type
*/
