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
public interface DeleteType {

    /**
     * Delete characters.
    */
    int CHARS = 0;

    /**
     * Delete only the portion of the word to the
     * <br>  left/right of cursor if we’re in the middle of a word.
    */
    int WORD_ENDS = 1;

    /**
     * Delete words.
    */
    int WORDS = 2;

    /**
     * Delete display-lines. Display-lines
     * <br>  refers to the visible lines, with respect to the current line
     * <br>  breaks. As opposed to paragraphs, which are defined by line
     * <br>  breaks in the input.
    */
    int DISPLAY_LINES = 3;

    /**
     * Delete only the portion of the
     * <br>  display-line to the left/right of cursor.
    */
    int DISPLAY_LINE_ENDS = 4;

    /**
     * Delete to the end of the
     * <br>  paragraph. Like C-k in Emacs (or its reverse).
    */
    int PARAGRAPH_ENDS = 5;

    /**
     * Delete entire line. Like C-k in pico.
    */
    int PARAGRAPHS = 6;

    /**
     * Delete only whitespace. Like M-&#92; in Emacs.
    */
    int WHITESPACE = 7;

}

/*
enumeration-type
*/
