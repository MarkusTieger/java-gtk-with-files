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
public interface IOFlags {

    /**
     * no special flags set. Since: 2.74
    */
    int NONE = 0;

    /**
     * turns on append mode, corresponds to %O_APPEND
     * <br>    (see the documentation of the UNIX open() syscall)
    */
    int APPEND = 1;

    /**
     * turns on nonblocking mode, corresponds to
     * <br>    %O_NONBLOCK/%O_NDELAY (see the documentation of the UNIX open()
     * <br>    syscall)
    */
    int NONBLOCK = 2;

    /**
     * indicates that the io channel is readable.
     * <br>    This flag cannot be changed.
    */
    int IS_READABLE = 4;

    /**
     * indicates that the io channel is writable.
     * <br>    This flag cannot be changed.
    */
    int IS_WRITABLE = 8;

    /**
     * a misspelled version of &#64;G_IO_FLAG_IS_WRITABLE
     * <br>    that existed before the spelling was fixed in GLib 2.30. It is kept
     * <br>    here for compatibility reasons. Deprecated since 2.30
    */
    int IS_WRITEABLE = 8;

    /**
     * indicates that the io channel is seekable,
     * <br>    i.e. that g_io_channel_seek_position() can be used on it.
     * <br>    This flag cannot be changed.
    */
    int IS_SEEKABLE = 16;

    /**
     * the mask that specifies all the valid flags.
    */
    int MASK = 31;

    /**
     * the mask of the flags that are returned from
     * <br>    g_io_channel_get_flags()
    */
    int GET_MASK = 31;

    /**
     * the mask of the flags that the user can modify
     * <br>    with g_io_channel_set_flags()
    */
    int SET_MASK = 3;

}

/*
enumeration-type
*/
