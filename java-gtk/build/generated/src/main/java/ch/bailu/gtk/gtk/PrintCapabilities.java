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
public interface PrintCapabilities {

    /**
     * Print dialog will offer printing even/odd pages.
    */
    int PAGE_SET = 1;

    /**
     * Print dialog will allow to print multiple copies.
    */
    int COPIES = 2;

    /**
     * Print dialog will allow to collate multiple copies.
    */
    int COLLATE = 4;

    /**
     * Print dialog will allow to print pages in reverse order.
    */
    int REVERSE = 8;

    /**
     * Print dialog will allow to scale the output.
    */
    int SCALE = 16;

    /**
     * The program will send the document to
     * <br>  the printer in PDF format
    */
    int GENERATE_PDF = 32;

    /**
     * The program will send the document to
     * <br>  the printer in Postscript format
    */
    int GENERATE_PS = 64;

    /**
     * Print dialog will offer a preview
    */
    int PREVIEW = 128;

    /**
     * Print dialog will offer printing multiple
     * <br>  pages per sheet
    */
    int NUMBER_UP = 256;

    /**
     * Print dialog will allow to rearrange
     * <br>  pages when printing multiple pages per sheet
    */
    int NUMBER_UP_LAYOUT = 512;

}

/*
enumeration-type
*/
