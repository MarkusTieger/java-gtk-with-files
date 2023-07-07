/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque struct representing a simple animation.
 * <p><a href="https://docs.gtk.org/gdk-pixbuf/class.PixbufSimpleAnim.html">https://docs.gtk.org/gdk-pixbuf/class.PixbufSimpleAnim.html</a></p>
*/
public class PixbufSimpleAnim extends PixbufAnimation {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PixbufSimpleAnim.class.getCanonicalName());
    }

    public PixbufSimpleAnim(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new, empty animation.
     * @param width the width of the animation
     * @param height the height of the animation
     * @param rate the speed of the animation, in frames per second
    */
    public PixbufSimpleAnim(int width, int height, float rate) {
        super(cast(JnaPixbufSimpleAnim.INST().gdk_pixbuf_simple_anim_new(width, height, rate)));
    }

    /**
     * Adds a new frame to &#64;animation. The &#64;pixbuf must
     * <br>have the dimensions specified when the animation
     * <br>was constructed.
     * @param pixbuf the pixbuf to add
    */
    public void addFrame(@Nonnull Pixbuf pixbuf)  {
        JnaPixbufSimpleAnim.INST().gdk_pixbuf_simple_anim_add_frame(asCPointer(), asCPointerNotNull(pixbuf));
    }

    /**
     * Gets whether &#64;animation should loop indefinitely when it reaches the end.
     * @return %TRUE if the animation loops forever, %FALSE otherwise
    */
    public boolean getLoop()  {
        return JnaPixbufSimpleAnim.INST().gdk_pixbuf_simple_anim_get_loop(asCPointer());
    }

    /**
     * Sets whether &#64;animation should loop indefinitely when it reaches the end.
     * @param loop whether to loop the animation
    */
    public void setLoop(boolean loop)  {
        JnaPixbufSimpleAnim.INST().gdk_pixbuf_simple_anim_set_loop(asCPointer(), loop);
    }

    public static long getTypeID() { 
        return JnaPixbufSimpleAnim.INST().gdk_pixbuf_simple_anim_get_type(); 
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
