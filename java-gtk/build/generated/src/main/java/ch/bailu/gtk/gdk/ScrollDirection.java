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
public interface ScrollDirection {

    /**
     * the surface is scrolled up.
    */
    int UP = 0;

    /**
     * the surface is scrolled down.
    */
    int DOWN = 1;

    /**
     * the surface is scrolled to the left.
    */
    int LEFT = 2;

    /**
     * the surface is scrolled to the right.
    */
    int RIGHT = 3;

    /**
     * the scrolling is determined by the delta values
     * <br>  in scroll events. See gdk_scroll_event_get_deltas()
    */
    int SMOOTH = 4;

}

/*
enumeration-type
*/
