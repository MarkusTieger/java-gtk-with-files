/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node for a conic gradient.
 * <p><a href="https://docs.gtk.org/gsk4/class.ConicGradientNode.html">https://docs.gtk.org/gsk4/class.ConicGradientNode.html</a></p>
*/
public class ConicGradientNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ConicGradientNode.class.getCanonicalName());
    }

    public ConicGradientNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the angle for the gradient in radians, normalized in [0, 2 * PI].
     * <br>
     * <br>The angle is starting at the top and going clockwise, as expressed
     * <br>in the css specification:
     * <br>
     * <br>    angle = 90 - gsk_conic_gradient_node_get_rotation()
     * @return the angle for the gradient
    */
    public float getAngle()  {
        return JnaConicGradientNode.INST().gsk_conic_gradient_node_get_angle(asCPointer());
    }

    /**
     * Retrieves the center pointer for the gradient.
     * @return the center point for the gradient
    */
    public ch.bailu.gtk.graphene.Point getCenter()  {
        return new ch.bailu.gtk.graphene.Point(new PointerContainer(JnaConicGradientNode.INST().gsk_conic_gradient_node_get_center(asCPointer())));
    }

    /**
     * Retrieves the number of color stops in the gradient.
     * @return the number of color stops
    */
    public long getNColorStops()  {
        return JnaConicGradientNode.INST().gsk_conic_gradient_node_get_n_color_stops(asCPointer());
    }

    /**
     * Retrieves the rotation for the gradient in degrees.
     * @return the rotation for the gradient
    */
    public float getRotation()  {
        return JnaConicGradientNode.INST().gsk_conic_gradient_node_get_rotation(asCPointer());
    }

    public static long getTypeID() { 
        return JnaConicGradientNode.INST().gsk_conic_gradient_node_get_type(); 
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

[MethodModel:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:ConicGradientNode:{c:GskRenderNode*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Rect:{c:const graphene_rect_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:float}}:{j:float}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GskColorStop*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getColorStops:[ParameterModel:java-type-not-supported:{G_::{c:const GskColorStop*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
*/
