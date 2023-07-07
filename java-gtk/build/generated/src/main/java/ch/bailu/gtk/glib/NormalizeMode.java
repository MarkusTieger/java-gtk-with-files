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
public interface NormalizeMode {

    /**
     * standardize differences that do not affect the
     * <br>    text content, such as the above-mentioned accent representation
    */
    int DEFAULT = 0;

    /**
     * another name for %G_NORMALIZE_DEFAULT
    */
    int NFD = 0;

    /**
     * like %G_NORMALIZE_DEFAULT, but with
     * <br>    composed forms rather than a maximally decomposed form
    */
    int DEFAULT_COMPOSE = 1;

    /**
     * another name for %G_NORMALIZE_DEFAULT_COMPOSE
    */
    int NFC = 1;

    /**
     * beyond %G_NORMALIZE_DEFAULT also standardize the
     * <br>    &quot;compatibility&quot; characters in Unicode, such as SUPERSCRIPT THREE
     * <br>    to the standard forms (in this case DIGIT THREE). Formatting
     * <br>    information may be lost but for most text operations such
     * <br>    characters should be considered the same
    */
    int ALL = 2;

    /**
     * another name for %G_NORMALIZE_ALL
    */
    int NFKD = 2;

    /**
     * like %G_NORMALIZE_ALL, but with composed
     * <br>    forms rather than a maximally decomposed form
    */
    int ALL_COMPOSE = 3;

    /**
     * another name for %G_NORMALIZE_ALL_COMPOSE
    */
    int NFKC = 3;

}

/*
enumeration-type
*/
