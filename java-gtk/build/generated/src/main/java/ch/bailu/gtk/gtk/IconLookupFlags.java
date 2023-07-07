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
public interface IconLookupFlags {

    /**
     * Try to always load regular icons, even
     * <br>  when symbolic icon names are given
    */
    int FORCE_REGULAR = 1;

    /**
     * Try to always load symbolic icons, even
     * <br>  when regular icon names are given
    */
    int FORCE_SYMBOLIC = 2;

    /**
     * Starts loading the texture in the background
     * <br>  so it is ready when later needed.
    */
    int PRELOAD = 4;

}

/*
enumeration-type
*/
