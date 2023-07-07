/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface NotifyType {

    /**
     * the surface is entered from an ancestor or
     * <br>  left towards an ancestor.
    */
    int ANCESTOR = 0;

    /**
     * the pointer moves between an ancestor and an
     * <br>  inferior of the surface.
    */
    int VIRTUAL = 1;

    /**
     * the surface is entered from an inferior or
     * <br>  left towards an inferior.
    */
    int INFERIOR = 2;

    /**
     * the surface is entered from or left towards
     * <br>  a surface which is neither an ancestor nor an inferior.
    */
    int NONLINEAR = 3;

    /**
     * the pointer moves between two surfaces
     * <br>  which are not ancestors of each other and the surface is part of
     * <br>  the ancestor chain between one of these surfaces and their least
     * <br>  common ancestor.
    */
    int NONLINEAR_VIRTUAL = 4;

    /**
     * an unknown type of enter/leave event occurred.
    */
    int UNKNOWN = 5;

}

/*
enumeration-type
*/
