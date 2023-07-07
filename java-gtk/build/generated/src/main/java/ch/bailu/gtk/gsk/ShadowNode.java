/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node drawing one or more shadows behind its single child node.
 * <p><a href="https://docs.gtk.org/gsk4/class.ShadowNode.html">https://docs.gtk.org/gsk4/class.ShadowNode.html</a></p>
*/
public class ShadowNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ShadowNode.class.getCanonicalName());
    }

    public ShadowNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the child `GskRenderNode` of the shadow &#64;node.
     * @return the child render node
    */
    public RenderNode getChild()  {
        return new RenderNode(new PointerContainer(JnaShadowNode.INST().gsk_shadow_node_get_child(asCPointer())));
    }

    /**
     * Retrieves the number of shadows in the &#64;node.
     * @return the number of shadows.
    */
    public long getNShadows()  {
        return JnaShadowNode.INST().gsk_shadow_node_get_n_shadows(asCPointer());
    }

    /**
     * Retrieves the shadow data at the given index &#64;i.
     * @param i the given index
     * @return the shadow data
    */
    public Shadow getShadow(long i)  {
        return new Shadow(new PointerContainer(JnaShadowNode.INST().gsk_shadow_node_get_shadow(asCPointer(), i)));
    }

    public static long getTypeID() { 
        return JnaShadowNode.INST().gsk_shadow_node_get_type(); 
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

[MethodModel:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:ShadowNode:{c:GskRenderNode*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:RenderNode:{c:GskRenderNode*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GskShadow*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
*/
