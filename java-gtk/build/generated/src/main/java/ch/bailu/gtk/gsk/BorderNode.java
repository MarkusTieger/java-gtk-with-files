/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node for a border.
 * <p><a href="https://docs.gtk.org/gsk4/class.BorderNode.html">https://docs.gtk.org/gsk4/class.BorderNode.html</a></p>
*/
public class BorderNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BorderNode.class.getCanonicalName());
    }

    public BorderNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the colors of the border.
     * @return an array of 4 `GdkRGBA` structs     for the top, right, bottom and left color of the border
    */
    public ch.bailu.gtk.gdk.RGBA getColors()  {
        return new ch.bailu.gtk.gdk.RGBA(new PointerContainer(JnaBorderNode.INST().gsk_border_node_get_colors(asCPointer())));
    }

    /**
     * Retrieves the outline of the border.
     * @return the outline of the border
    */
    public RoundedRect getOutline()  {
        return new RoundedRect(new PointerContainer(JnaBorderNode.INST().gsk_border_node_get_outline(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaBorderNode.INST().gsk_border_node_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:BorderNode:{c:GskRenderNode*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:RoundedRect:{c:const GskRoundedRect*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const float*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GdkRGBA*}}:{j:}]

[MethodModel:cb-return-value-not-supported:getWidths:[ParameterModel:java-type-not-supported:{G_::{c:const float*}}:{j:}]]
*/
