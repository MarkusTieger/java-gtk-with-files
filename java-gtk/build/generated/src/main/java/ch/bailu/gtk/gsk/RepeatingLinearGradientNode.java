/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node for a repeating linear gradient.
 * <p><a href="https://docs.gtk.org/gsk4/class.RepeatingLinearGradientNode.html">https://docs.gtk.org/gsk4/class.RepeatingLinearGradientNode.html</a></p>
*/
public class RepeatingLinearGradientNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RepeatingLinearGradientNode.class.getCanonicalName());
    }

    public RepeatingLinearGradientNode(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaRepeatingLinearGradientNode.INST().gsk_repeating_linear_gradient_node_get_type(); 
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

[MethodModel:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:RepeatingLinearGradientNode:{c:GskRenderNode*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Rect:{c:const graphene_rect_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GskColorStop*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
*/
