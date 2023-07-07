/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node applying a rounded rectangle clip to its single child.
 * <p><a href="https://docs.gtk.org/gsk4/class.RoundedClipNode.html">https://docs.gtk.org/gsk4/class.RoundedClipNode.html</a></p>
*/
public class RoundedClipNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RoundedClipNode.class.getCanonicalName());
    }

    public RoundedClipNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskRenderNode` that will clip the &#64;child to the area
     * <br>given by &#64;clip.
     * @param child The node to draw
     * @param clip The clip to apply
    */
    public RoundedClipNode(@Nonnull RenderNode child, @Nonnull RoundedRect clip) {
        super(cast(JnaRoundedClipNode.INST().gsk_rounded_clip_node_new(asCPointerNotNull(child), asCPointerNotNull(clip))));
    }

    /**
     * Gets the child node that is getting clipped by the given &#64;node.
     * @return The child that is getting clipped
    */
    public RenderNode getChild()  {
        return new RenderNode(new PointerContainer(JnaRoundedClipNode.INST().gsk_rounded_clip_node_get_child(asCPointer())));
    }

    /**
     * Retrieves the rounded rectangle used to clip the contents of the &#64;node.
     * @return a rounded rectangle
    */
    public RoundedRect getClip()  {
        return new RoundedRect(new PointerContainer(JnaRoundedClipNode.INST().gsk_rounded_clip_node_get_clip(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaRoundedClipNode.INST().gsk_rounded_clip_node_get_type(); 
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
