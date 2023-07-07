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
public interface FileCopyFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * Overwrite any existing files
    */
    int OVERWRITE = 1;

    /**
     * Make a backup of any existing files.
    */
    int BACKUP = 2;

    /**
     * Don't follow symlinks.
    */
    int NOFOLLOW_SYMLINKS = 4;

    /**
     * Copy all file metadata instead of just default set used for copy (see &#35;GFileInfo).
    */
    int ALL_METADATA = 8;

    /**
     * Don't use copy and delete fallback if native move not supported.
    */
    int NO_FALLBACK_FOR_MOVE = 16;

    /**
     * Leaves target file with default perms, instead of setting the source file perms.
    */
    int TARGET_DEFAULT_PERMS = 32;

}

/*
enumeration-type
*/
