/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node applying a rectangular clip to its single child node.
 * <p><a href="https://docs.gtk.org/gsk4/class.ClipNode.html">https://docs.gtk.org/gsk4/class.ClipNode.html</a></p>
*/
public class ClipNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ClipNode.class.getCanonicalName());
    }

    public ClipNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskRenderNode` that will clip the &#64;child to the area
     * <br>given by &#64;clip.
     * @param child The node to draw
     * @param clip The clip to apply
    */
    public ClipNode(@Nonnull RenderNode child, @Nonnull ch.bailu.gtk.graphene.Rect clip) {
        super(cast(JnaClipNode.INST().gsk_clip_node_new(asCPointerNotNull(child), asCPointerNotNull(clip))));
    }

    /**
     * Gets the child node that is getting clipped by the given &#64;node.
     * @return The child that is getting clipped
    */
    public RenderNode getChild()  {
        return new RenderNode(new PointerContainer(JnaClipNode.INST().gsk_clip_node_get_child(asCPointer())));
    }

    /**
     * Retrieves the clip rectangle for &#64;node.
     * @return a clip rectangle
    */
    public ch.bailu.gtk.graphene.Rect getClip()  {
        return new ch.bailu.gtk.graphene.Rect(new PointerContainer(JnaClipNode.INST().gsk_clip_node_get_clip(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaClipNode.INST().gsk_clip_node_get_type(); 
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
