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
public interface MemoryFormat {

    /**
     * 4 bytes; for blue, green, red, alpha.
     * <br>  The color values are premultiplied with the alpha value.
    */
    int B8G8R8A8_PREMULTIPLIED = 0;

    /**
     * 4 bytes; for alpha, red, green, blue.
     * <br>  The color values are premultiplied with the alpha value.
    */
    int A8R8G8B8_PREMULTIPLIED = 1;

    /**
     * 4 bytes; for red, green, blue, alpha
     * <br>  The color values are premultiplied with the alpha value.
    */
    int R8G8B8A8_PREMULTIPLIED = 2;

    /**
     * 4 bytes; for blue, green, red, alpha.
    */
    int B8G8R8A8 = 3;

    /**
     * 4 bytes; for alpha, red, green, blue.
    */
    int A8R8G8B8 = 4;

    /**
     * 4 bytes; for red, green, blue, alpha.
    */
    int R8G8B8A8 = 5;

    /**
     * 4 bytes; for alpha, blue, green, red.
    */
    int A8B8G8R8 = 6;

    /**
     * 3 bytes; for red, green, blue. The data is opaque.
    */
    int R8G8B8 = 7;

    /**
     * 3 bytes; for blue, green, red. The data is opaque.
    */
    int B8G8R8 = 8;

    /**
     * 3 guint16 values; for red, green, blue. Since: 4.6
    */
    int R16G16B16 = 9;

    /**
     * 4 guint16 values; for red, green,
     * <br>  blue, alpha. The color values are premultiplied with the alpha value.
     * <br> Since: 4.6
    */
    int R16G16B16A16_PREMULTIPLIED = 10;

    /**
     * 4 guint16 values; for red, green, blue, alpha.
     * <br> Since: 4.6
    */
    int R16G16B16A16 = 11;

    /**
     * 3 half-float values; for red, green, blue.
     * <br>  The data is opaque. Since: 4.6
    */
    int R16G16B16_FLOAT = 12;

    /**
     * 4 half-float values; for
     * <br>  red, green, blue and alpha. The color values are premultiplied with
     * <br>  the alpha value. Since: 4.6
    */
    int R16G16B16A16_FLOAT_PREMULTIPLIED = 13;

    /**
     * 4 half-float values; for red, green,
     * <br>  blue and alpha. Since: 4.6
    */
    int R16G16B16A16_FLOAT = 14;

    /**
     * 
    */
    int R32G32B32_FLOAT = 15;

    /**
     * 4 float values; for
     * <br>  red, green, blue and alpha. The color values are premultiplied with
     * <br>  the alpha value. Since: 4.6
    */
    int R32G32B32A32_FLOAT_PREMULTIPLIED = 16;

    /**
     * 4 float values; for red, green, blue and
     * <br>  alpha. Since: 4.6
    */
    int R32G32B32A32_FLOAT = 17;

    /**
     * The number of formats. This value will change as
     * <br>  more formats get added, so do not rely on its concrete integer.
    */
    int N_FORMATS = 18;

}

/*
enumeration-type
*/
