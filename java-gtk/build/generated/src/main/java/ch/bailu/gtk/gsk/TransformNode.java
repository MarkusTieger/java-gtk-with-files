/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node applying a `GskTransform` to its single child node.
 * <p><a href="https://docs.gtk.org/gsk4/class.TransformNode.html">https://docs.gtk.org/gsk4/class.TransformNode.html</a></p>
*/
public class TransformNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TransformNode.class.getCanonicalName());
    }

    public TransformNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskRenderNode` that will transform the given &#64;child
     * <br>with the given &#64;transform.
     * @param child The node to transform
     * @param transform The transform to apply
    */
    public TransformNode(@Nonnull RenderNode child, @Nonnull Transform transform) {
        super(cast(JnaTransformNode.INST().gsk_transform_node_new(asCPointerNotNull(child), asCPointerNotNull(transform))));
    }

    /**
     * Gets the child node that is getting transformed by the given &#64;node.
     * @return The child that is getting transformed
    */
    public RenderNode getChild()  {
        return new RenderNode(new PointerContainer(JnaTransformNode.INST().gsk_transform_node_get_child(asCPointer())));
    }

    /**
     * Retrieves the `GskTransform` used by the &#64;node.
     * @return a `GskTransform`
    */
    public Transform getTransform()  {
        return new Transform(new PointerContainer(JnaTransformNode.INST().gsk_transform_node_get_transform(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaTransformNode.INST().gsk_transform_node_get_type(); 
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
