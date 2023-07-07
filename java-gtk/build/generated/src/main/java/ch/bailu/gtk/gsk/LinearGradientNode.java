/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node for a linear gradient.
 * <p><a href="https://docs.gtk.org/gsk4/class.LinearGradientNode.html">https://docs.gtk.org/gsk4/class.LinearGradientNode.html</a></p>
*/
public class LinearGradientNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LinearGradientNode.class.getCanonicalName());
    }

    public LinearGradientNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the final point of the linear gradient.
     * @return the final point
    */
    public ch.bailu.gtk.graphene.Point getEnd()  {
        return new ch.bailu.gtk.graphene.Point(new PointerContainer(JnaLinearGradientNode.INST().gsk_linear_gradient_node_get_end(asCPointer())));
    }

    /**
     * Retrieves the number of color stops in the gradient.
     * @return the number of color stops
    */
    public long getNColorStops()  {
        return JnaLinearGradientNode.INST().gsk_linear_gradient_node_get_n_color_stops(asCPointer());
    }

    /**
     * Retrieves the initial point of the linear gradient.
     * @return the initial point
    */
    public ch.bailu.gtk.graphene.Point getStart()  {
        return new ch.bailu.gtk.graphene.Point(new PointerContainer(JnaLinearGradientNode.INST().gsk_linear_gradient_node_get_start(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaLinearGradientNode.INST().gsk_linear_gradient_node_get_type(); 
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

[MethodModel:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:LinearGradientNode:{c:GskRenderNode*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Rect:{c:const graphene_rect_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GskColorStop*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getColorStops:[ParameterModel:java-type-not-supported:{G_::{c:const GskColorStop*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
*/
