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
public interface CssParserError {

    /**
     * Unknown failure.
    */
    int FAILED = 0;

    /**
     * The given text does not form valid syntax
    */
    int SYNTAX = 1;

    /**
     * Failed to import a resource
    */
    int IMPORT = 2;

    /**
     * The given name has not been defined
    */
    int NAME = 3;

    /**
     * The given value is not correct
    */
    int UNKNOWN_VALUE = 4;

}

/*
enumeration-type
*/
