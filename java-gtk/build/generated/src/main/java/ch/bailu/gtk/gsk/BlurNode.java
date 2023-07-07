/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node applying a blur effect to its single child.
 * <p><a href="https://docs.gtk.org/gsk4/class.BlurNode.html">https://docs.gtk.org/gsk4/class.BlurNode.html</a></p>
*/
public class BlurNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BlurNode.class.getCanonicalName());
    }

    public BlurNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a render node that blurs the child.
     * @param child the child node to blur
     * @param radius the blur radius. Must be positive
    */
    public BlurNode(@Nonnull RenderNode child, float radius) {
        super(cast(JnaBlurNode.INST().gsk_blur_node_new(asCPointerNotNull(child), radius)));
    }

    /**
     * Retrieves the child `GskRenderNode` of the blur &#64;node.
     * @return the blurred child node
    */
    public RenderNode getChild()  {
        return new RenderNode(new PointerContainer(JnaBlurNode.INST().gsk_blur_node_get_child(asCPointer())));
    }

    /**
     * Retrieves the blur radius of the &#64;node.
     * @return the blur radius
    */
    public float getRadius()  {
        return JnaBlurNode.INST().gsk_blur_node_get_radius(asCPointer());
    }

    public static long getTypeID() { 
        return JnaBlurNode.INST().gsk_blur_node_get_type(); 
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
