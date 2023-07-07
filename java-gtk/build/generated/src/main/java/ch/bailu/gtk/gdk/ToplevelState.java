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
public interface ToplevelState {

    /**
     * the surface is minimized
    */
    int MINIMIZED = 1;

    /**
     * the surface is maximized
    */
    int MAXIMIZED = 2;

    /**
     * the surface is sticky
    */
    int STICKY = 4;

    /**
     * the surface is maximized without decorations
    */
    int FULLSCREEN = 8;

    /**
     * the surface is kept above other surfaces
    */
    int ABOVE = 16;

    /**
     * the surface is kept below other surfaces
    */
    int BELOW = 32;

    /**
     * the surface is presented as focused (with active decorations)
    */
    int FOCUSED = 64;

    /**
     * the surface is in a tiled state
    */
    int TILED = 128;

    /**
     * whether the top edge is tiled
    */
    int TOP_TILED = 256;

    /**
     * whether the top edge is resizable
    */
    int TOP_RESIZABLE = 512;

    /**
     * whether the right edge is tiled
    */
    int RIGHT_TILED = 1024;

    /**
     * whether the right edge is resizable
    */
    int RIGHT_RESIZABLE = 2048;

    /**
     * whether the bottom edge is tiled
    */
    int BOTTOM_TILED = 4096;

    /**
     * whether the bottom edge is resizable
    */
    int BOTTOM_RESIZABLE = 8192;

    /**
     * whether the left edge is tiled
    */
    int LEFT_TILED = 16384;

    /**
     * whether the left edge is resizable
    */
    int LEFT_RESIZABLE = 32768;

}

/*
enumeration-type
*/
