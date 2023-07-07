/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface CoverageLevel {

    /**
     * The character is not representable with
     * <br>  the font.
    */
    int NONE = 0;

    /**
     * The character is represented in a
     * <br>  way that may be comprehensible but is not the correct
     * <br>  graphical form. For instance, a Hangul character represented
     * <br>  as a a sequence of Jamos, or a Latin transliteration of a
     * <br>  Cyrillic word.
    */
    int FALLBACK = 1;

    /**
     * The character is represented as
     * <br>  basically the correct graphical form, but with a stylistic
     * <br>  variant inappropriate for the current script.
    */
    int APPROXIMATE = 2;

    /**
     * The character is represented as the
     * <br>  correct graphical form.
    */
    int EXACT = 3;

}

/*
enumeration-type
*/
