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
public interface PixbufFormatFlags {

    /**
     * the module can write out images in the format.
    */
    int WRITABLE = 1;

    /**
     * the image format is scalable
    */
    int SCALABLE = 2;

    /**
     * the module is threadsafe. gdk-pixbuf
     * <br>    ignores modules that are not marked as threadsafe. (Since 2.28).
    */
    int THREADSAFE = 4;

}

/*
enumeration-type
*/
