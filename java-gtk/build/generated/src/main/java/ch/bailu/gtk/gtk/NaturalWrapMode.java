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
public interface NaturalWrapMode {

    /**
     * Inherit the minimum size request.
     * <br>  In particular, this should be used with %PANGO_WRAP_CHAR.
    */
    int INHERIT = 0;

    /**
     * Try not to wrap the text. This mode is the
     * <br>  closest to GTK3's behavior but can lead to a wide label leaving
     * <br>  lots of empty space below the text.
    */
    int NONE = 1;

    /**
     * Attempt to wrap at word boundaries. This
     * <br>  is useful in particular when using %PANGO_WRAP_WORD_CHAR as the
     * <br>  wrap mode.
    */
    int WORD = 2;

}

/*
enumeration-type
*/
