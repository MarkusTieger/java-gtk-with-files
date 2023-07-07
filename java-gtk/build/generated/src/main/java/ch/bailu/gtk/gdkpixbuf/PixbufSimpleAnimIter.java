/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gdk-pixbuf/class.PixbufSimpleAnimIter.html">https://docs.gtk.org/gdk-pixbuf/class.PixbufSimpleAnimIter.html</a></p>
*/
public class PixbufSimpleAnimIter extends PixbufAnimationIter {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PixbufSimpleAnimIter.class.getCanonicalName());
    }

    public PixbufSimpleAnimIter(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaPixbufSimpleAnimIter.INST().gdk_pixbuf_simple_anim_iter_get_type(); 
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
