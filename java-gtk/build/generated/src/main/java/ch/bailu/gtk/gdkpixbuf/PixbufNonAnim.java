/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gdk-pixbuf/class.PixbufNonAnim.html">https://docs.gtk.org/gdk-pixbuf/class.PixbufNonAnim.html</a></p>
*/
public class PixbufNonAnim extends PixbufAnimation {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PixbufNonAnim.class.getCanonicalName());
    }

    public PixbufNonAnim(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * 
     * @param pixbuf 
    */
    public PixbufNonAnim(@Nonnull Pixbuf pixbuf) {
        super(cast(JnaPixbufNonAnim.INST().gdk_pixbuf_non_anim_new(asCPointerNotNull(pixbuf))));
    }

    public static long getTypeID() { 
        return JnaPixbufNonAnim.INST().gdk_pixbuf_non_anim_get_type(); 
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
