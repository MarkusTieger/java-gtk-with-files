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
public interface PixbufAlphaMode {

    /**
     * A bilevel clipping mask (black and white)
     * <br> will be created and used to draw the image.  Pixels below 0.5 opacity
     * <br> will be considered fully transparent, and all others will be
     * <br> considered fully opaque.
    */
    int BILEVEL = 0;

    /**
     * For now falls back to &#35;GDK_PIXBUF_ALPHA_BILEVEL.
     * <br> In the future it will do full alpha compositing.
    */
    int FULL = 1;

}

/*
enumeration-type
*/
