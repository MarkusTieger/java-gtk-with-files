/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GdkToplevelSize` struct contains information that is useful
 * <br>to compute the size of a toplevel.
 * <p><a href="https://docs.gtk.org/gdk4/struct.ToplevelSize.html">https://docs.gtk.org/gdk4/struct.ToplevelSize.html</a></p>
*/
class ToplevelSize extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ToplevelSize.class.getCanonicalName());
    }

    public ToplevelSize(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the bounds the toplevel is placed within.
     * <br>
     * <br>The bounds represent the largest size a toplevel may have while still being
     * <br>able to fit within some type of boundary. Depending on the backend, this may
     * <br>be equivalent to the dimensions of the work area or the monitor on which the
     * <br>window is being presented on, or something else that limits the way a
     * <br>toplevel can be presented.
     * @param bounds_width return location for width
     * @param bounds_height return location for height
    */
    public void getBounds(@Nonnull ch.bailu.gtk.type.Int bounds_width, @Nonnull ch.bailu.gtk.type.Int bounds_height)  {
        JnaToplevelSize.INST().gdk_toplevel_size_get_bounds(asCPointer(), asCPointerNotNull(bounds_width), asCPointerNotNull(bounds_height));
    }

    /**
     * Sets the minimum size of the toplevel.
     * <br>
     * <br>The minimum size corresponds to the limitations the toplevel can be shrunk
     * <br>to, without resulting in incorrect painting. A user of a `GdkToplevel` should
     * <br>calculate these given both the existing size, and the bounds retrieved from
     * <br>the `GdkToplevelSize` object.
     * <br>
     * <br>The minimum size should be within the bounds (see
     * <br>[method&#64;Gdk.ToplevelSize.get_bounds]).
     * @param min_width the minimum width
     * @param min_height the minimum height
    */
    public void setMinSize(int min_width, int min_height)  {
        JnaToplevelSize.INST().gdk_toplevel_size_set_min_size(asCPointer(), min_width, min_height);
    }

    /**
     * Sets the shadows size of the toplevel.
     * <br>
     * <br>The shadow width corresponds to the part of the computed surface size
     * <br>that would consist of the shadow margin surrounding the window, would
     * <br>there be any.
     * @param left width of the left part of the shadow
     * @param right width of the right part of the shadow
     * @param top height of the top part of the shadow
     * @param bottom height of the bottom part of the shadow
    */
    public void setShadowWidth(int left, int right, int top, int bottom)  {
        JnaToplevelSize.INST().gdk_toplevel_size_set_shadow_width(asCPointer(), left, right, top, bottom);
    }

    /**
     * Sets the size the toplevel prefers to be resized to.
     * <br>
     * <br>The size should be within the bounds (see
     * <br>[method&#64;Gdk.ToplevelSize.get_bounds]). The set size should
     * <br>be considered as a hint, and should not be assumed to be
     * <br>respected by the windowing system, or backend.
     * @param width the width
     * @param height the height
    */
    public void setSize(int width, int height)  {
        JnaToplevelSize.INST().gdk_toplevel_size_set_size(asCPointer(), width, height);
    }

}

/*
record-type
flag-disguised
all-fields-supported
*/
