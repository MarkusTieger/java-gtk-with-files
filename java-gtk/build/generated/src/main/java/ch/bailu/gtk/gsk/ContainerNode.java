/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node that can contain other render nodes.
 * <p><a href="https://docs.gtk.org/gsk4/class.ContainerNode.html">https://docs.gtk.org/gsk4/class.ContainerNode.html</a></p>
*/
public class ContainerNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ContainerNode.class.getCanonicalName());
    }

    public ContainerNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets one of the children of &#64;container.
     * @param idx the position of the child to get
     * @return the &#64;idx'th child of &#64;container
    */
    public RenderNode getChild(int idx)  {
        return new RenderNode(new PointerContainer(JnaContainerNode.INST().gsk_container_node_get_child(asCPointer(), idx)));
    }

    /**
     * Retrieves the number of direct children of &#64;node.
     * @return the number of children of the `GskRenderNode`
    */
    public int getNChildren()  {
        return JnaContainerNode.INST().gsk_container_node_get_n_children(asCPointer());
    }

    public static long getTypeID() { 
        return JnaContainerNode.INST().gsk_container_node_get_type(); 
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

[MethodModel:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:ContainerNode:{c:GskRenderNode*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GskRenderNode**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
*/
