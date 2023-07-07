/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node for a Cairo surface.
 * <p><a href="https://docs.gtk.org/gsk4/class.CairoNode.html">https://docs.gtk.org/gsk4/class.CairoNode.html</a></p>
*/
public class CairoNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CairoNode.class.getCanonicalName());
    }

    public CairoNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskRenderNode` that will render a cairo surface
     * <br>into the area given by &#64;bounds.
     * <br>
     * <br>You can draw to the cairo surface using [method&#64;Gsk.CairoNode.get_draw_context].
     * @param bounds the rectangle to render to
    */
    public CairoNode(@Nonnull ch.bailu.gtk.graphene.Rect bounds) {
        super(cast(JnaCairoNode.INST().gsk_cairo_node_new(asCPointerNotNull(bounds))));
    }

    /**
     * Creates a Cairo context for drawing using the surface associated
     * <br>to the render node.
     * <br>
     * <br>If no surface exists yet, a surface will be created optimized for
     * <br>rendering to &#64;renderer.
     * @return a Cairo context used for drawing; use   cairo_destroy() when done drawing
    */
    public ch.bailu.gtk.cairo.Context getDrawContext()  {
        return new ch.bailu.gtk.cairo.Context(new PointerContainer(JnaCairoNode.INST().gsk_cairo_node_get_draw_context(asCPointer())));
    }

    /**
     * Retrieves the Cairo surface used by the render node.
     * @return a Cairo surface
    */
    public ch.bailu.gtk.cairo.Surface getSurface()  {
        return new ch.bailu.gtk.cairo.Surface(new PointerContainer(JnaCairoNode.INST().gsk_cairo_node_get_surface(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaCairoNode.INST().gsk_cairo_node_get_type(); 
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
