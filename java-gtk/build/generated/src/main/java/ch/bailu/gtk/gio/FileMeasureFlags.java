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
public interface FileMeasureFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * Report any error encountered
     * <br>  while traversing the directory tree.  Normally errors are only
     * <br>  reported for the toplevel file.
    */
    int REPORT_ANY_ERROR = 2;

    /**
     * Tally usage based on apparent file
     * <br>  sizes.  Normally, the block-size is used, if available, as this is a
     * <br>  more accurate representation of disk space used.
     * <br>  Compare with `du --apparent-size`.
    */
    int APPARENT_SIZE = 4;

    /**
     * Do not cross mount point boundaries.
     * <br>  Compare with `du -x`.
    */
    int NO_XDEV = 8;

}

/*
enumeration-type
*/
