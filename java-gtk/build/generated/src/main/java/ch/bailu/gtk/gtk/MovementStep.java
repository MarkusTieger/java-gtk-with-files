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
public interface MovementStep {

    /**
     * Move forward or back by graphemes
    */
    int LOGICAL_POSITIONS = 0;

    /**
     * Move left or right by graphemes
    */
    int VISUAL_POSITIONS = 1;

    /**
     * Move forward or back by words
    */
    int WORDS = 2;

    /**
     * Move up or down lines (wrapped lines)
    */
    int DISPLAY_LINES = 3;

    /**
     * Move to either end of a line
    */
    int DISPLAY_LINE_ENDS = 4;

    /**
     * Move up or down paragraphs (newline-ended lines)
    */
    int PARAGRAPHS = 5;

    /**
     * Move to either end of a paragraph
    */
    int PARAGRAPH_ENDS = 6;

    /**
     * Move by pages
    */
    int PAGES = 7;

    /**
     * Move to ends of the buffer
    */
    int BUFFER_ENDS = 8;

    /**
     * Move horizontally by pages
    */
    int HORIZONTAL_PAGES = 9;

}

/*
enumeration-type
*/
