/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node applying a blending function between its two child nodes.
 * <p><a href="https://docs.gtk.org/gsk4/class.BlendNode.html">https://docs.gtk.org/gsk4/class.BlendNode.html</a></p>
*/
public class BlendNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BlendNode.class.getCanonicalName());
    }

    public BlendNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskRenderNode` that will use &#64;blend_mode to blend the &#64;top
     * <br>node onto the &#64;bottom node.
     * @param bottom The bottom node to be drawn
     * @param top The node to be blended onto the &#64;bottom node
     * @param blend_mode The blend mode to use
    */
    public BlendNode(@Nonnull RenderNode bottom, @Nonnull RenderNode top, int blend_mode) {
        super(cast(JnaBlendNode.INST().gsk_blend_node_new(asCPointerNotNull(bottom), asCPointerNotNull(top), blend_mode)));
    }

    /**
     * Retrieves the blend mode used by &#64;node.
     * @return the blend mode
    */
    public int getBlendMode()  {
        return JnaBlendNode.INST().gsk_blend_node_get_blend_mode(asCPointer());
    }

    /**
     * Retrieves the bottom `GskRenderNode` child of the &#64;node.
     * @return the bottom child node
    */
    public RenderNode getBottomChild()  {
        return new RenderNode(new PointerContainer(JnaBlendNode.INST().gsk_blend_node_get_bottom_child(asCPointer())));
    }

    /**
     * Retrieves the top `GskRenderNode` child of the &#64;node.
     * @return the top child node
    */
    public RenderNode getTopChild()  {
        return new RenderNode(new PointerContainer(JnaBlendNode.INST().gsk_blend_node_get_top_child(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaBlendNode.INST().gsk_blend_node_get_type(); 
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
