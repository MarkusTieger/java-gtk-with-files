/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node controlling the opacity of its single child node.
 * <p><a href="https://docs.gtk.org/gsk4/class.OpacityNode.html">https://docs.gtk.org/gsk4/class.OpacityNode.html</a></p>
*/
public class OpacityNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(OpacityNode.class.getCanonicalName());
    }

    public OpacityNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskRenderNode` that will drawn the &#64;child with reduced
     * <br>&#64;opacity.
     * @param child The node to draw
     * @param opacity The opacity to apply
    */
    public OpacityNode(@Nonnull RenderNode child, float opacity) {
        super(cast(JnaOpacityNode.INST().gsk_opacity_node_new(asCPointerNotNull(child), opacity)));
    }

    /**
     * Gets the child node that is getting opacityed by the given &#64;node.
     * @return The child that is getting opacityed
    */
    public RenderNode getChild()  {
        return new RenderNode(new PointerContainer(JnaOpacityNode.INST().gsk_opacity_node_get_child(asCPointer())));
    }

    /**
     * Gets the transparency factor for an opacity node.
     * @return the opacity factor
    */
    public float getOpacity()  {
        return JnaOpacityNode.INST().gsk_opacity_node_get_opacity(asCPointer());
    }

    public static long getTypeID() { 
        return JnaOpacityNode.INST().gsk_opacity_node_get_type(); 
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
