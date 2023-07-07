/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node for a radial gradient.
 * <p><a href="https://docs.gtk.org/gsk4/class.RadialGradientNode.html">https://docs.gtk.org/gsk4/class.RadialGradientNode.html</a></p>
*/
public class RadialGradientNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RadialGradientNode.class.getCanonicalName());
    }

    public RadialGradientNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the center pointer for the gradient.
     * @return the center point for the gradient
    */
    public ch.bailu.gtk.graphene.Point getCenter()  {
        return new ch.bailu.gtk.graphene.Point(new PointerContainer(JnaRadialGradientNode.INST().gsk_radial_gradient_node_get_center(asCPointer())));
    }

    /**
     * Retrieves the end value for the gradient.
     * @return the end value for the gradient
    */
    public float getEnd()  {
        return JnaRadialGradientNode.INST().gsk_radial_gradient_node_get_end(asCPointer());
    }

    /**
     * Retrieves the horizonal radius for the gradient.
     * @return the horizontal radius for the gradient
    */
    public float getHradius()  {
        return JnaRadialGradientNode.INST().gsk_radial_gradient_node_get_hradius(asCPointer());
    }

    /**
     * Retrieves the number of color stops in the gradient.
     * @return the number of color stops
    */
    public long getNColorStops()  {
        return JnaRadialGradientNode.INST().gsk_radial_gradient_node_get_n_color_stops(asCPointer());
    }

    /**
     * Retrieves the start value for the gradient.
     * @return the start value for the gradient
    */
    public float getStart()  {
        return JnaRadialGradientNode.INST().gsk_radial_gradient_node_get_start(asCPointer());
    }

    /**
     * Retrieves the vertical radius for the gradient.
     * @return the vertical radius for the gradient
    */
    public float getVradius()  {
        return JnaRadialGradientNode.INST().gsk_radial_gradient_node_get_vradius(asCPointer());
    }

    public static long getTypeID() { 
        return JnaRadialGradientNode.INST().gsk_radial_gradient_node_get_type(); 
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

[MethodModel:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:RadialGradientNode:{c:GskRenderNode*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Rect:{c:const graphene_rect_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GskColorStop*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getColorStops:[ParameterModel:java-type-not-supported:{G_::{c:const GskColorStop*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
*/
