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
public interface FileCreateFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * Create a file that can only be
     * <br>   accessed by the current user.
    */
    int PRIVATE = 1;

    /**
     * Replace the destination
     * <br>   as if it didn't exist before. Don't try to keep any old
     * <br>   permissions, replace instead of following links. This
     * <br>   is generally useful if you're doing a &quot;copy over&quot;
     * <br>   rather than a &quot;save new version of&quot; replace operation.
     * <br>   You can think of it as &quot;unlink destination&quot; before
     * <br>   writing to it, although the implementation may not
     * <br>   be exactly like that. This flag can only be used with
     * <br>   g_file_replace() and its variants, including g_file_replace_contents().
     * <br>   Since 2.20
    */
    int REPLACE_DESTINATION = 2;

}

/*
enumeration-type
*/
