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
public interface WrapMode {

    /**
     * do not wrap lines; just make the text area wider
    */
    int NONE = 0;

    /**
     * wrap text, breaking lines anywhere the cursor can
     * <br>  appear (between characters, usually - if you want to be technical,
     * <br>  between graphemes, see pango_get_log_attrs())
    */
    int CHAR = 1;

    /**
     * wrap text, breaking lines in between words
    */
    int WORD = 2;

    /**
     * wrap text, breaking lines in between words, or if
     * <br>  that is not enough, also between graphemes
    */
    int WORD_CHAR = 3;

}

/*
enumeration-type
*/
