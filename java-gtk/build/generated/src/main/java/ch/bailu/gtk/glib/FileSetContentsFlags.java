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
public interface FileSetContentsFlags {

    /**
     * No guarantees about file consistency or durability.
     * <br>  The most dangerous setting, which is slightly faster than other settings.
    */
    int NONE = 0;

    /**
     * Guarantee file consistency: after a crash,
     * <br>  either the old version of the file or the new version of the file will be
     * <br>  available, but not a mixture. On Unix systems this equates to an `fsync()`
     * <br>  on the file and use of an atomic `rename()` of the new version of the file
     * <br>  over the old.
    */
    int CONSISTENT = 1;

    /**
     * Guarantee file durability: after a crash, the
     * <br>  new version of the file will be available. On Unix systems this equates to
     * <br>  an `fsync()` on the file (if %G_FILE_SET_CONTENTS_CONSISTENT is unset), or
     * <br>  the effects of %G_FILE_SET_CONTENTS_CONSISTENT plus an `fsync()` on the
     * <br>  directory containing the file after calling `rename()`.
    */
    int DURABLE = 2;

    /**
     * Only apply consistency and durability
     * <br>  guarantees if the file already exists. This may speed up file operations
     * <br>  if the file doesn’t currently exist, but may result in a corrupted version
     * <br>  of the new file if the system crashes while writing it.
    */
    int ONLY_EXISTING = 4;

}

/*
enumeration-type
*/
