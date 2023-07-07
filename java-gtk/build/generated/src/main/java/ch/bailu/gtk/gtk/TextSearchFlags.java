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
public interface TextSearchFlags {

    /**
     * Search only visible data. A search match may
     * <br>have invisible text interspersed.
    */
    int VISIBLE_ONLY = 1;

    /**
     * Search only text. A match may have paintables or
     * <br>child widgets mixed inside the matched range.
    */
    int TEXT_ONLY = 2;

    /**
     * The text will be matched regardless of
     * <br>what case it is in.
    */
    int CASE_INSENSITIVE = 4;

}

/*
enumeration-type
*/
