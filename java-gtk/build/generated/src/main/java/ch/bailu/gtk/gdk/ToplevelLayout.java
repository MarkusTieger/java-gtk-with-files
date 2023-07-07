/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GdkToplevelLayout` struct contains information that
 * <br>is necessary to present a sovereign window on screen.
 * <br>
 * <br>The `GdkToplevelLayout` struct is necessary for using
 * <br>[method&#64;Gdk.Toplevel.present].
 * <br>
 * <br>Toplevel surfaces are sovereign windows that can be presented
 * <br>to the user in various states (maximized, on all workspaces,
 * <br>etc).
 * <p><a href="https://docs.gtk.org/gdk4/struct.ToplevelLayout.html">https://docs.gtk.org/gdk4/struct.ToplevelLayout.html</a></p>
*/
public class ToplevelLayout extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ToplevelLayout.class.getCanonicalName());
    }

    public ToplevelLayout(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a toplevel layout description.
     * <br>
     * <br>Used together with gdk_toplevel_present() to describe
     * <br>how a toplevel surface should be placed and behave on-screen.
     * <br>
     * <br>The size is in ”application pixels”, not
     * <br>”device pixels” (see gdk_surface_get_scale_factor()).
    */
    public ToplevelLayout() {
        super(cast(JnaToplevelLayout.INST().gdk_toplevel_layout_new()));
    }

    /**
     * Create a new `GdkToplevelLayout` and copy the contents of &#64;layout into it.
     * @return a copy of &#64;layout.
    */
    public ToplevelLayout copy()  {
        return new ToplevelLayout(new PointerContainer(JnaToplevelLayout.INST().gdk_toplevel_layout_copy(asCPointer())));
    }

    /**
     * Check whether &#64;layout and &#64;other has identical layout properties.
     * @param other another `GdkToplevelLayout`
     * @return %TRUE if &#64;layout and &#64;other have identical layout properties,   otherwise %FALSE.
    */
    public boolean equal(@Nonnull ToplevelLayout other)  {
        return JnaToplevelLayout.INST().gdk_toplevel_layout_equal(asCPointer(), asCPointerNotNull(other));
    }

    /**
     * If the layout specifies whether to the toplevel should go fullscreen,
     * <br>the value pointed to by &#64;fullscreen is set to %TRUE if it should go
     * <br>fullscreen, or %FALSE, if it should go unfullscreen.
     * @param fullscreen location to store whether the toplevel should be fullscreen
     * @return whether the &#64;layout specifies the fullscreen state for the toplevel
    */
    public boolean getFullscreen(@Nonnull ch.bailu.gtk.type.Int fullscreen)  {
        return JnaToplevelLayout.INST().gdk_toplevel_layout_get_fullscreen(asCPointer(), asCPointerNotNull(fullscreen));
    }

    /**
     * Returns the monitor that the layout is fullscreening
     * <br>the surface on.
     * @return the monitor on which &#64;layout fullscreens
    */
    public Monitor getFullscreenMonitor()  {
        return new Monitor(new PointerContainer(JnaToplevelLayout.INST().gdk_toplevel_layout_get_fullscreen_monitor(asCPointer())));
    }

    /**
     * If the layout specifies whether to the toplevel should go maximized,
     * <br>the value pointed to by &#64;maximized is set to %TRUE if it should go
     * <br>fullscreen, or %FALSE, if it should go unmaximized.
     * @param maximized set to %TRUE if the toplevel should be maximized
     * @return whether the &#64;layout specifies the maximized state for the toplevel
    */
    public boolean getMaximized(@Nonnull ch.bailu.gtk.type.Int maximized)  {
        return JnaToplevelLayout.INST().gdk_toplevel_layout_get_maximized(asCPointer(), asCPointerNotNull(maximized));
    }

    /**
     * Returns whether the layout should allow the user
     * <br>to resize the surface.
     * @return %TRUE if the layout is resizable
    */
    public boolean getResizable()  {
        return JnaToplevelLayout.INST().gdk_toplevel_layout_get_resizable(asCPointer());
    }

    /**
     * Increases the reference count of &#64;layout.
     * @return the same &#64;layout
    */
    public ToplevelLayout ref()  {
        return new ToplevelLayout(new PointerContainer(JnaToplevelLayout.INST().gdk_toplevel_layout_ref(asCPointer())));
    }

    /**
     * Sets whether the layout should cause the surface
     * <br>to be fullscreen when presented.
     * @param fullscreen %TRUE to fullscreen the surface
     * @param monitor the monitor to fullscreen on
    */
    public void setFullscreen(boolean fullscreen, @Nullable Monitor monitor)  {
        JnaToplevelLayout.INST().gdk_toplevel_layout_set_fullscreen(asCPointer(), fullscreen, asCPointer(monitor));
    }

    /**
     * Sets whether the layout should cause the surface
     * <br>to be maximized when presented.
     * @param maximized %TRUE to maximize
    */
    public void setMaximized(boolean maximized)  {
        JnaToplevelLayout.INST().gdk_toplevel_layout_set_maximized(asCPointer(), maximized);
    }

    /**
     * Sets whether the layout should allow the user
     * <br>to resize the surface after it has been presented.
     * @param resizable %TRUE to allow resizing
    */
    public void setResizable(boolean resizable)  {
        JnaToplevelLayout.INST().gdk_toplevel_layout_set_resizable(asCPointer(), resizable);
    }

    /**
     * Decreases the reference count of &#64;layout.
    */
    public void unref()  {
        JnaToplevelLayout.INST().gdk_toplevel_layout_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaToplevelLayout.INST().gdk_toplevel_layout_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
record-type
all-fields-supported
*/
