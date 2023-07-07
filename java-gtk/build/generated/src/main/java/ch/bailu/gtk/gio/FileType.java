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
public interface FileType {

    /**
     * File's type is unknown.
    */
    int UNKNOWN = 0;

    /**
     * File handle represents a regular file.
    */
    int REGULAR = 1;

    /**
     * File handle represents a directory.
    */
    int DIRECTORY = 2;

    /**
     * File handle represents a symbolic link
     * <br>   (Unix systems).
    */
    int SYMBOLIC_LINK = 3;

    /**
     * File is a &quot;special&quot; file, such as a socket, fifo,
     * <br>   block device, or character device.
    */
    int SPECIAL = 4;

    /**
     * File is a shortcut (Windows systems).
    */
    int SHORTCUT = 5;

    /**
     * File is a mountable location.
    */
    int MOUNTABLE = 6;

}

/*
enumeration-type
*/
