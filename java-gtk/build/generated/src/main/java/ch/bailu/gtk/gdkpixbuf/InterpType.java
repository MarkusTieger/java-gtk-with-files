/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface InterpType {

    /**
     * Nearest neighbor sampling; this is the fastest
     * <br> and lowest quality mode. Quality is normally unacceptable when scaling
     * <br> down, but may be OK when scaling up.
    */
    int NEAREST = 0;

    /**
     * This is an accurate simulation of the PostScript
     * <br> image operator without any interpolation enabled.  Each pixel is
     * <br> rendered as a tiny parallelogram of solid color, the edges of which
     * <br> are implemented with antialiasing.  It resembles nearest neighbor for
     * <br> enlargement, and bilinear for reduction.
    */
    int TILES = 1;

    /**
     * Best quality/speed balance; use this mode by
     * <br> default. Bilinear interpolation.  For enlargement, it is
     * <br> equivalent to point-sampling the ideal bilinear-interpolated image.
     * <br> For reduction, it is equivalent to laying down small tiles and
     * <br> integrating over the coverage area.
    */
    int BILINEAR = 2;

    /**
     * This is the slowest and highest quality
     * <br> reconstruction function. It is derived from the hyperbolic filters in
     * <br> Wolberg's &quot;Digital Image Warping&quot;, and is formally defined as the
     * <br> hyperbolic-filter sampling the ideal hyperbolic-filter interpolated
     * <br> image (the filter is designed to be idempotent for 1:1 pixel mapping).
     * <br> **Deprecated**: this interpolation filter is deprecated, as in reality
     * <br> it has a lower quality than the &#64;GDK_INTERP_BILINEAR filter
     * <br> (Since: 2.38)
    */
    int HYPER = 3;

}

/*
enumeration-type
*/
