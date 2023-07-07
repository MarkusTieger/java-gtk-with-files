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
public interface FileTest {

    /**
     * %TRUE if the file is a regular file
     * <br>    (not a directory). Note that this test will also return %TRUE
     * <br>    if the tested file is a symlink to a regular file.
    */
    int IS_REGULAR = 1;

    /**
     * %TRUE if the file is a symlink.
    */
    int IS_SYMLINK = 2;

    /**
     * %TRUE if the file is a directory.
    */
    int IS_DIR = 4;

    /**
     * %TRUE if the file is executable.
    */
    int IS_EXECUTABLE = 8;

    /**
     * %TRUE if the file exists. It may or may not
     * <br>    be a regular file.
    */
    int EXISTS = 16;

}

/*
enumeration-type
*/
