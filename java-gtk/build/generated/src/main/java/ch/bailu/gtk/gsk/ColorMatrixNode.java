/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node controlling the color matrix of its single child node.
 * <p><a href="https://docs.gtk.org/gsk4/class.ColorMatrixNode.html">https://docs.gtk.org/gsk4/class.ColorMatrixNode.html</a></p>
*/
public class ColorMatrixNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ColorMatrixNode.class.getCanonicalName());
    }

    public ColorMatrixNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskRenderNode` that will drawn the &#64;child with
     * <br>&#64;color_matrix.
     * <br>
     * <br>In particular, the node will transform the operation
     * <br>
     * <br>    pixel = color_matrix * pixel + color_offset
     * <br>
     * <br>for every pixel.
     * @param child The node to draw
     * @param color_matrix The matrix to apply
     * @param color_offset Values to add to the color
    */
    public ColorMatrixNode(@Nonnull RenderNode child, @Nonnull ch.bailu.gtk.graphene.Matrix color_matrix, @Nonnull ch.bailu.gtk.graphene.Vec4 color_offset) {
        super(cast(JnaColorMatrixNode.INST().gsk_color_matrix_node_new(asCPointerNotNull(child), asCPointerNotNull(color_matrix), asCPointerNotNull(color_offset))));
    }

    /**
     * Gets the child node that is getting its colors modified by the given &#64;node.
     * @return The child that is getting its colors modified
    */
    public RenderNode getChild()  {
        return new RenderNode(new PointerContainer(JnaColorMatrixNode.INST().gsk_color_matrix_node_get_child(asCPointer())));
    }

    /**
     * Retrieves the color matrix used by the &#64;node.
     * @return a 4x4 color matrix
    */
    public ch.bailu.gtk.graphene.Matrix getColorMatrix()  {
        return new ch.bailu.gtk.graphene.Matrix(new PointerContainer(JnaColorMatrixNode.INST().gsk_color_matrix_node_get_color_matrix(asCPointer())));
    }

    /**
     * Retrieves the color offset used by the &#64;node.
     * @return a color vector
    */
    public ch.bailu.gtk.graphene.Vec4 getColorOffset()  {
        return new ch.bailu.gtk.graphene.Vec4(new PointerContainer(JnaColorMatrixNode.INST().gsk_color_matrix_node_get_color_offset(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaColorMatrixNode.INST().gsk_color_matrix_node_get_type(); 
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
