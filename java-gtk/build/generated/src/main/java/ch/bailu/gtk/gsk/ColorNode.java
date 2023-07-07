/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node for a solid color.
 * <p><a href="https://docs.gtk.org/gsk4/class.ColorNode.html">https://docs.gtk.org/gsk4/class.ColorNode.html</a></p>
*/
public class ColorNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ColorNode.class.getCanonicalName());
    }

    public ColorNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskRenderNode` that will render the color specified by &#64;rgba into
     * <br>the area given by &#64;bounds.
     * @param rgba a `GdkRGBA` specifying a color
     * @param bounds the rectangle to render the color into
    */
    public ColorNode(@Nonnull ch.bailu.gtk.gdk.RGBA rgba, @Nonnull ch.bailu.gtk.graphene.Rect bounds) {
        super(cast(JnaColorNode.INST().gsk_color_node_new(asCPointerNotNull(rgba), asCPointerNotNull(bounds))));
    }

    /**
     * Retrieves the color of the given &#64;node.
     * @return the color of the node
    */
    public ch.bailu.gtk.gdk.RGBA getColor()  {
        return new ch.bailu.gtk.gdk.RGBA(new PointerContainer(JnaColorNode.INST().gsk_color_node_get_color(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaColorNode.INST().gsk_color_node_get_type(); 
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
