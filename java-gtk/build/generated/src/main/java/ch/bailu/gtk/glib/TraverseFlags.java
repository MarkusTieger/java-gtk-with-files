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
public interface TraverseFlags {

    /**
     * only leaf nodes should be visited. This name has
     * <br>                    been introduced in 2.6, for older version use
     * <br>                    %G_TRAVERSE_LEAFS.
    */
    int LEAVES = 1;

    /**
     * only non-leaf nodes should be visited. This
     * <br>                        name has been introduced in 2.6, for older
     * <br>                        version use %G_TRAVERSE_NON_LEAFS.
    */
    int NON_LEAVES = 2;

    /**
     * all nodes should be visited.
    */
    int ALL = 3;

    /**
     * a mask of all traverse flags.
    */
    int MASK = 3;

    /**
     * identical to %G_TRAVERSE_LEAVES.
    */
    int LEAFS = 1;

    /**
     * identical to %G_TRAVERSE_NON_LEAVES.
    */
    int NON_LEAFS = 2;

}

/*
enumeration-type
*/
