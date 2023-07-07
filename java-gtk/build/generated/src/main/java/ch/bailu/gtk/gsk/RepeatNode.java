/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node repeating its single child node.
 * <p><a href="https://docs.gtk.org/gsk4/class.RepeatNode.html">https://docs.gtk.org/gsk4/class.RepeatNode.html</a></p>
*/
public class RepeatNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RepeatNode.class.getCanonicalName());
    }

    public RepeatNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskRenderNode` that will repeat the drawing of &#64;child across
     * <br>the given &#64;bounds.
     * @param bounds The bounds of the area to be painted
     * @param child The child to repeat
     * @param child_bounds The area of the child to repeat or %NULL to     use the child's bounds
    */
    public RepeatNode(@Nonnull ch.bailu.gtk.graphene.Rect bounds, @Nonnull RenderNode child, @Nullable ch.bailu.gtk.graphene.Rect child_bounds) {
        super(cast(JnaRepeatNode.INST().gsk_repeat_node_new(asCPointerNotNull(bounds), asCPointerNotNull(child), asCPointer(child_bounds))));
    }

    /**
     * Retrieves the child of &#64;node.
     * @return a `GskRenderNode`
    */
    public RenderNode getChild()  {
        return new RenderNode(new PointerContainer(JnaRepeatNode.INST().gsk_repeat_node_get_child(asCPointer())));
    }

    /**
     * Retrieves the bounding rectangle of the child of &#64;node.
     * @return a bounding rectangle
    */
    public ch.bailu.gtk.graphene.Rect getChildBounds()  {
        return new ch.bailu.gtk.graphene.Rect(new PointerContainer(JnaRepeatNode.INST().gsk_repeat_node_get_child_bounds(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaRepeatNode.INST().gsk_repeat_node_get_type(); 
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
