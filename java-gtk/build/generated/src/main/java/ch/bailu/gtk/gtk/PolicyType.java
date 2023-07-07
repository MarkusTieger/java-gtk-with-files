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
public interface PolicyType {

    /**
     * The scrollbar is always visible. The view size is
     * <br>  independent of the content.
    */
    int ALWAYS = 0;

    /**
     * The scrollbar will appear and disappear as necessary.
     * <br>  For example, when all of a `GtkTreeView` can not be seen.
    */
    int AUTOMATIC = 1;

    /**
     * The scrollbar should never appear. In this mode the
     * <br>  content determines the size.
    */
    int NEVER = 2;

    /**
     * Don't show a scrollbar, but don't force the
     * <br>  size to follow the content. This can be used e.g. to make multiple
     * <br>  scrolled windows share a scrollbar.
    */
    int EXTERNAL = 3;

}

/*
enumeration-type
*/
