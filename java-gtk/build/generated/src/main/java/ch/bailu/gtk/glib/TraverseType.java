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
public interface TraverseType {

    /**
     * vists a node's left child first, then the node itself,
     * <br>             then its right child. This is the one to use if you
     * <br>             want the output sorted according to the compare
     * <br>             function.
    */
    int IN_ORDER = 0;

    /**
     * visits a node, then its children.
    */
    int PRE_ORDER = 1;

    /**
     * visits the node's children, then the node itself.
    */
    int POST_ORDER = 2;

    /**
     * is not implemented for
     * <br>             [balanced binary trees][glib-Balanced-Binary-Trees].
     * <br>             For [n-ary trees][glib-N-ary-Trees], it
     * <br>             vists the root node first, then its children, then
     * <br>             its grandchildren, and so on. Note that this is less
     * <br>             efficient than the other orders.
    */
    int LEVEL_ORDER = 3;

}

/*
enumeration-type
*/
