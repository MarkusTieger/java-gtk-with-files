/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GdkCairoContext` is an object representing the platform-specific
 * <br>draw context.
 * <br>
 * <br>`GdkCairoContext`s are created for a surface using
 * <br>[method&#64;Gdk.Surface.create_cairo_context], and the context
 * <br>can then be used to draw on that surface.
 * <p><a href="https://docs.gtk.org/gdk4/class.CairoContext.html">https://docs.gtk.org/gdk4/class.CairoContext.html</a></p>
*/
public class CairoContext extends DrawContext {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CairoContext.class.getCanonicalName());
    }

    public CairoContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves a Cairo context to be used to draw on the `GdkSurface`
     * <br>of &#64;context.
     * <br>
     * <br>A call to [method&#64;Gdk.DrawContext.begin_frame] with this
     * <br>&#64;context must have been done or this function will return %NULL.
     * <br>
     * <br>The returned context is guaranteed to be valid until
     * <br>[method&#64;Gdk.DrawContext.end_frame] is called.
     * @return a Cairo context   to draw on `GdkSurface
    */
    public ch.bailu.gtk.cairo.Context cairoCreate()  {
        return new ch.bailu.gtk.cairo.Context(new PointerContainer(JnaCairoContext.INST().gdk_cairo_context_cairo_create(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaCairoContext.INST().gdk_cairo_context_get_type(); 
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
