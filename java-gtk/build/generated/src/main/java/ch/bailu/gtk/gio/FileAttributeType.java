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
public interface FileAttributeType {

    /**
     * indicates an invalid or uninitialized type.
    */
    int INVALID = 0;

    /**
     * a null terminated UTF8 string.
    */
    int STRING = 1;

    /**
     * a zero terminated string of non-zero bytes.
    */
    int BYTE_STRING = 2;

    /**
     * a boolean value.
    */
    int BOOLEAN = 3;

    /**
     * an unsigned 4-byte/32-bit integer.
    */
    int UINT32 = 4;

    /**
     * a signed 4-byte/32-bit integer.
    */
    int INT32 = 5;

    /**
     * an unsigned 8-byte/64-bit integer.
    */
    int UINT64 = 6;

    /**
     * a signed 8-byte/64-bit integer.
    */
    int INT64 = 7;

    /**
     * a &#35;GObject.
    */
    int OBJECT = 8;

    /**
     * a %NULL terminated char **. Since 2.22
    */
    int STRINGV = 9;

}

/*
enumeration-type
*/
