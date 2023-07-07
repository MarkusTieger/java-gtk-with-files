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
public interface EventControllerScrollFlags {

    /**
     * Don't emit scroll.
    */
    int NONE = 0;

    /**
     * Emit scroll with vertical deltas.
    */
    int VERTICAL = 1;

    /**
     * Emit scroll with horizontal deltas.
    */
    int HORIZONTAL = 2;

    /**
     * Only emit deltas that are multiples of 1.
    */
    int DISCRETE = 4;

    /**
     * Emit ::decelerate after continuous scroll finishes.
    */
    int KINETIC = 8;

    /**
     * Emit scroll on both axes.
    */
    int BOTH_AXES = 3;

}

/*
enumeration-type
*/
