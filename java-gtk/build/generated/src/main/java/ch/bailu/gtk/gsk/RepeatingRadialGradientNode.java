/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node for a repeating radial gradient.
 * <p><a href="https://docs.gtk.org/gsk4/class.RepeatingRadialGradientNode.html">https://docs.gtk.org/gsk4/class.RepeatingRadialGradientNode.html</a></p>
*/
public class RepeatingRadialGradientNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RepeatingRadialGradientNode.class.getCanonicalName());
    }

    public RepeatingRadialGradientNode(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaRepeatingRadialGradientNode.INST().gsk_repeating_radial_gradient_node_get_type(); 
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

[MethodModel:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:RepeatingRadialGradientNode:{c:GskRenderNode*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Rect:{c:const graphene_rect_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GskColorStop*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
*/
