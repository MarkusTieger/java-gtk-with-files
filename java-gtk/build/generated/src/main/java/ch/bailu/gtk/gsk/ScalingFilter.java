/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface ScalingFilter {

    /**
     * linear interpolation filter
    */
    int LINEAR = 0;

    /**
     * nearest neighbor interpolation filter
    */
    int NEAREST = 1;

    /**
     * linear interpolation along each axis,
     * <br>  plus mipmap generation, with linear interpolation along the mipmap
     * <br>  levels
    */
    int TRILINEAR = 2;

}

/*
enumeration-type
*/
