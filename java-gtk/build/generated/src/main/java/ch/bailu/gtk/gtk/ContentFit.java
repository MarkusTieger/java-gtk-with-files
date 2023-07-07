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
public interface ContentFit {

    /**
     * Make the content fill the entire allocation,
     * <br>  without taking its aspect ratio in consideration. The resulting
     * <br>  content will appear as stretched if its aspect ratio is different
     * <br>  from the allocation aspect ratio.
    */
    int FILL = 0;

    /**
     * Scale the content to fit the allocation,
     * <br>  while taking its aspect ratio in consideration. The resulting
     * <br>  content will appear as letterboxed if its aspect ratio is different
     * <br>  from the allocation aspect ratio.
    */
    int CONTAIN = 1;

    /**
     * Cover the entire allocation, while taking
     * <br>  the content aspect ratio in consideration. The resulting content
     * <br>  will appear as clipped if its aspect ratio is different from the
     * <br>  allocation aspect ratio.
    */
    int COVER = 2;

    /**
     * The content is scaled down to fit the
     * <br>  allocation, if needed, otherwise its original size is used.
    */
    int SCALE_DOWN = 3;

}

/*
enumeration-type
*/
