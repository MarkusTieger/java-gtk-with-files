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
public interface OptionArg {

    /**
     * No extra argument. This is useful for simple flags or booleans.
    */
    int NONE = 0;

    /**
     * The option takes a UTF-8 string argument.
    */
    int STRING = 1;

    /**
     * The option takes an integer argument.
    */
    int INT = 2;

    /**
     * The option provides a callback (of type
     * <br>    &#35;GOptionArgFunc) to parse the extra argument.
    */
    int CALLBACK = 3;

    /**
     * The option takes a filename as argument, which will
     * <br>       be in the GLib filename encoding rather than UTF-8.
    */
    int FILENAME = 4;

    /**
     * The option takes a string argument, multiple
     * <br>    uses of the option are collected into an array of strings.
    */
    int STRING_ARRAY = 5;

    /**
     * The option takes a filename as argument,
     * <br>    multiple uses of the option are collected into an array of strings.
    */
    int FILENAME_ARRAY = 6;

    /**
     * The option takes a double argument. The argument
     * <br>    can be formatted either for the user's locale or for the &quot;C&quot; locale.
     * <br>    Since 2.12
    */
    int DOUBLE = 7;

    /**
     * The option takes a 64-bit integer. Like
     * <br>    %G_OPTION_ARG_INT but for larger numbers. The number can be in
     * <br>    decimal base, or in hexadecimal (when prefixed with `0x`, for
     * <br>    example, `0xffffffff`). Since 2.12
    */
    int INT64 = 8;

}

/*
enumeration-type
*/
