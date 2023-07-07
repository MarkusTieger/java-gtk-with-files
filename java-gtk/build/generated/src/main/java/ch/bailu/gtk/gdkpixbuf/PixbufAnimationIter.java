/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque object representing an iterator which points to a
 * <br>certain position in an animation.
 * <p><a href="https://docs.gtk.org/gdk-pixbuf/class.PixbufAnimationIter.html">https://docs.gtk.org/gdk-pixbuf/class.PixbufAnimationIter.html</a></p>
*/
public class PixbufAnimationIter extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PixbufAnimationIter.class.getCanonicalName());
    }

    public PixbufAnimationIter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Possibly advances an animation to a new frame.
     * <br>
     * <br>Chooses the frame based on the start time passed to
     * <br>gdk_pixbuf_animation_get_iter().
     * <br>
     * <br>&#64;current_time would normally come from g_get_current_time(), and
     * <br>must be greater than or equal to the time passed to
     * <br>gdk_pixbuf_animation_get_iter(), and must increase or remain
     * <br>unchanged each time gdk_pixbuf_animation_iter_get_pixbuf() is
     * <br>called. That is, you can't go backward in time; animations only
     * <br>play forward.
     * <br>
     * <br>As a shortcut, pass `NULL` for the current time and g_get_current_time()
     * <br>will be invoked on your behalf. So you only need to explicitly pass
     * <br>&#64;current_time if you're doing something odd like playing the animation
     * <br>at double speed.
     * <br>
     * <br>If this function returns `FALSE`, there's no need to update the animation
     * <br>display, assuming the display had been rendered prior to advancing;
     * <br>if `TRUE`, you need to call gdk_pixbuf_animation_iter_get_pixbuf()
     * <br>and update the display with the new pixbuf.
     * @param current_time current time
     * @return `TRUE` if the image may need updating
    */
    public boolean advance(@Nullable ch.bailu.gtk.glib.TimeVal current_time)  {
        return JnaPixbufAnimationIter.INST().gdk_pixbuf_animation_iter_advance(asCPointer(), asCPointer(current_time));
    }

    /**
     * Gets the number of milliseconds the current pixbuf should be displayed,
     * <br>or -1 if the current pixbuf should be displayed forever.
     * <br>
     * <br>The `g_timeout_add()` function conveniently takes a timeout in milliseconds,
     * <br>so you can use a timeout to schedule the next update.
     * <br>
     * <br>Note that some formats, like GIF, might clamp the timeout values in the
     * <br>image file to avoid updates that are just too quick. The minimum timeout
     * <br>for GIF images is currently 20 milliseconds.
     * @return delay time in milliseconds (thousandths of a second)
    */
    public int getDelayTime()  {
        return JnaPixbufAnimationIter.INST().gdk_pixbuf_animation_iter_get_delay_time(asCPointer());
    }

    /**
     * Gets the current pixbuf which should be displayed.
     * <br>
     * <br>The pixbuf might not be the same size as the animation itself
     * <br>(gdk_pixbuf_animation_get_width(), gdk_pixbuf_animation_get_height()).
     * <br>
     * <br>This pixbuf should be displayed for gdk_pixbuf_animation_iter_get_delay_time()
     * <br>milliseconds.
     * <br>
     * <br>The caller of this function does not own a reference to the returned
     * <br>pixbuf; the returned pixbuf will become invalid when the iterator
     * <br>advances to the next frame, which may happen anytime you call
     * <br>gdk_pixbuf_animation_iter_advance().
     * <br>
     * <br>Copy the pixbuf to keep it (don't just add a reference), as it may get
     * <br>recycled as you advance the iterator.
     * @return the pixbuf to be displayed
    */
    public Pixbuf getPixbuf()  {
        return new Pixbuf(new PointerContainer(JnaPixbufAnimationIter.INST().gdk_pixbuf_animation_iter_get_pixbuf(asCPointer())));
    }

    /**
     * Used to determine how to respond to the area_updated signal on
     * <br>&#35;GdkPixbufLoader when loading an animation.
     * <br>
     * <br>The `::area_updated` signal is emitted for an area of the frame currently
     * <br>streaming in to the loader. So if you're on the currently loading frame,
     * <br>you will need to redraw the screen for the updated area.
     * @return `TRUE` if the frame we're on is partially loaded, or the last frame
    */
    public boolean onCurrentlyLoadingFrame()  {
        return JnaPixbufAnimationIter.INST().gdk_pixbuf_animation_iter_on_currently_loading_frame(asCPointer());
    }

    public static long getTypeID() { 
        return JnaPixbufAnimationIter.INST().gdk_pixbuf_animation_iter_get_type(); 
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
class-type
*/
