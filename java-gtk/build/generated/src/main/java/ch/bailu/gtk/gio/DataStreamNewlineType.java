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
public interface DataStreamNewlineType {

    /**
     * Selects &quot;LF&quot; line endings, common on most modern UNIX platforms.
    */
    int LF = 0;

    /**
     * Selects &quot;CR&quot; line endings.
    */
    int CR = 1;

    /**
     * Selects &quot;CR, LF&quot; line ending, common on Microsoft Windows.
    */
    int CR_LF = 2;

    /**
     * Automatically try to handle any line ending type.
    */
    int ANY = 3;

}

/*
enumeration-type
*/
