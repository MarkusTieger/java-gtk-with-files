/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface Underline {

    /**
     * no underline should be drawn
    */
    int NONE = 0;

    /**
     * a single underline should be drawn
    */
    int SINGLE = 1;

    /**
     * a double underline should be drawn
    */
    int DOUBLE = 2;

    /**
     * a single underline should be drawn at a
     * <br>  position beneath the ink extents of the text being
     * <br>  underlined. This should be used only for underlining
     * <br>  single characters, such as for keyboard accelerators.
     * <br>  %PANGO_UNDERLINE_SINGLE should be used for extended
     * <br>  portions of text.
    */
    int LOW = 3;

    /**
     * an underline indicating an error should
     * <br>  be drawn below. The exact style of rendering is up to the
     * <br>  `PangoRenderer` in use, but typical styles include wavy
     * <br>  or dotted lines.
     * <br>  This underline is typically used to indicate an error such
     * <br>  as a possible mispelling; in some cases a contrasting color
     * <br>  may automatically be used. This type of underlining is
     * <br>  available since Pango 1.4.
    */
    int ERROR = 4;

    /**
     * Like &#64;PANGO_UNDERLINE_SINGLE, but
     * <br>  drawn continuously across multiple runs. This type
     * <br>  of underlining is available since Pango 1.46.
    */
    int SINGLE_LINE = 5;

    /**
     * Like &#64;PANGO_UNDERLINE_DOUBLE, but
     * <br>  drawn continuously across multiple runs. This type
     * <br>  of underlining is available since Pango 1.46.
    */
    int DOUBLE_LINE = 6;

    /**
     * Like &#64;PANGO_UNDERLINE_ERROR, but
     * <br>  drawn continuously across multiple runs. This type
     * <br>  of underlining is available since Pango 1.46.
    */
    int ERROR_LINE = 7;

}

/*
enumeration-type
*/
