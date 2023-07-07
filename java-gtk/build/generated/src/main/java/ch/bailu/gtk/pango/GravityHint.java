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
public interface GravityHint {

    /**
     * scripts will take their natural gravity based
     * <br>  on the base gravity and the script.  This is the default.
    */
    int NATURAL = 0;

    /**
     * always use the base gravity set, regardless of
     * <br>  the script.
    */
    int STRONG = 1;

    /**
     * for scripts not in their natural direction (eg.
     * <br>  Latin in East gravity), choose per-script gravity such that every script
     * <br>  respects the line progression. This means, Latin and Arabic will take
     * <br>  opposite gravities and both flow top-to-bottom for example.
    */
    int LINE = 2;

}

/*
enumeration-type
*/
