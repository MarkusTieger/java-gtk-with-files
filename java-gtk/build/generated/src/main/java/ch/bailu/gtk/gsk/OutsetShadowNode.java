/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node for an outset shadow.
 * <p><a href="https://docs.gtk.org/gsk4/class.OutsetShadowNode.html">https://docs.gtk.org/gsk4/class.OutsetShadowNode.html</a></p>
*/
public class OutsetShadowNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(OutsetShadowNode.class.getCanonicalName());
    }

    public OutsetShadowNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskRenderNode` that will render an outset shadow
     * <br>around the box given by &#64;outline.
     * @param outline outline of the region surrounded by shadow
     * @param color color of the shadow
     * @param dx horizontal offset of shadow
     * @param dy vertical offset of shadow
     * @param spread how far the shadow spreads towards the inside
     * @param blur_radius how much blur to apply to the shadow
    */
    public OutsetShadowNode(@Nonnull RoundedRect outline, @Nonnull ch.bailu.gtk.gdk.RGBA color, float dx, float dy, float spread, float blur_radius) {
        super(cast(JnaOutsetShadowNode.INST().gsk_outset_shadow_node_new(asCPointerNotNull(outline), asCPointerNotNull(color), dx, dy, spread, blur_radius)));
    }

    /**
     * Retrieves the blur radius of the shadow.
     * @return the blur radius, in pixels
    */
    public float getBlurRadius()  {
        return JnaOutsetShadowNode.INST().gsk_outset_shadow_node_get_blur_radius(asCPointer());
    }

    /**
     * Retrieves the color of the outset shadow.
     * @return a color
    */
    public ch.bailu.gtk.gdk.RGBA getColor()  {
        return new ch.bailu.gtk.gdk.RGBA(new PointerContainer(JnaOutsetShadowNode.INST().gsk_outset_shadow_node_get_color(asCPointer())));
    }

    /**
     * Retrieves the horizontal offset of the outset shadow.
     * @return an offset, in pixels
    */
    public float getDx()  {
        return JnaOutsetShadowNode.INST().gsk_outset_shadow_node_get_dx(asCPointer());
    }

    /**
     * Retrieves the vertical offset of the outset shadow.
     * @return an offset, in pixels
    */
    public float getDy()  {
        return JnaOutsetShadowNode.INST().gsk_outset_shadow_node_get_dy(asCPointer());
    }

    /**
     * Retrieves the outline rectangle of the outset shadow.
     * @return a rounded rectangle
    */
    public RoundedRect getOutline()  {
        return new RoundedRect(new PointerContainer(JnaOutsetShadowNode.INST().gsk_outset_shadow_node_get_outline(asCPointer())));
    }

    /**
     * Retrieves how much the shadow spreads outwards.
     * @return the size of the shadow, in pixels
    */
    public float getSpread()  {
        return JnaOutsetShadowNode.INST().gsk_outset_shadow_node_get_spread(asCPointer());
    }

    public static long getTypeID() { 
        return JnaOutsetShadowNode.INST().gsk_outset_shadow_node_get_type(); 
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
