/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GskTransform` is an object to describe transform matrices.
 * <br>
 * <br>Unlike `graphene_matrix_t`, `GskTransform` retains the steps in how
 * <br>a transform was constructed, and allows inspecting them. It is modeled
 * <br>after the way CSS describes transforms.
 * <br>
 * <br>`GskTransform` objects are immutable and cannot be changed after creation.
 * <br>This means code can safely expose them as properties of objects without
 * <br>having to worry about others changing them.
 * <p><a href="https://docs.gtk.org/gsk4/struct.Transform.html">https://docs.gtk.org/gsk4/struct.Transform.html</a></p>
*/
public class Transform extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Transform.class.getCanonicalName());
    }

    public Transform(PointerContainer pointer) {
        super(pointer);
    }

    public Transform() {
        super(cast(JnaTransform.INST().gsk_transform_new()));
    }

    /**
     * Checks two transforms for equality.
     * @param second the second transform
     * @return %TRUE if the two transforms perform the same operation
    */
    public boolean equal(@Nullable Transform second)  {
        return JnaTransform.INST().gsk_transform_equal(asCPointer(), asCPointer(second));
    }

    /**
     * Returns the category this transform belongs to.
     * @return The category of the transform
    */
    public int getCategory()  {
        return JnaTransform.INST().gsk_transform_get_category(asCPointer());
    }

    /**
     * Inverts the given transform.
     * <br>
     * <br>If &#64;self is not invertible, %NULL is returned.
     * <br>Note that inverting %NULL also returns %NULL, which is
     * <br>the correct inverse of %NULL. If you need to differentiate
     * <br>between those cases, you should check &#64;self is not %NULL
     * <br>before calling this function.
     * @return The inverted transform
    */
    public Transform invert()  {
        return new Transform(new PointerContainer(JnaTransform.INST().gsk_transform_invert(asCPointer())));
    }

    /**
     * Multiplies &#64;next with the given &#64;matrix.
     * @param matrix the matrix to multiply &#64;next with
     * @return The new transform
    */
    public Transform matrix(@Nonnull ch.bailu.gtk.graphene.Matrix matrix)  {
        return new Transform(new PointerContainer(JnaTransform.INST().gsk_transform_matrix(asCPointer(), asCPointerNotNull(matrix))));
    }

    /**
     * Applies a perspective projection transform.
     * <br>
     * <br>This transform scales points in X and Y based on their Z value,
     * <br>scaling points with positive Z values away from the origin, and
     * <br>those with negative Z values towards the origin. Points
     * <br>on the z=0 plane are unchanged.
     * @param depth distance of the z=0 plane. Lower values give a more   flattened pyramid and therefore a more pronounced   perspective effect.
     * @return The new transform
    */
    public Transform perspective(float depth)  {
        return new Transform(new PointerContainer(JnaTransform.INST().gsk_transform_perspective(asCPointer(), depth)));
    }

    /**
     * Converts &#64;self into a human-readable string representation suitable
     * <br>for printing.
     * <br>
     * <br>The result of this function can later be parsed with
     * <br>[func&#64;Gsk.Transform.parse].
     * @param string The string to print into
    */
    public void print(@Nonnull ch.bailu.gtk.glib.GString string)  {
        JnaTransform.INST().gsk_transform_print(asCPointer(), asCPointerNotNull(string));
    }

    /**
     * Acquires a reference on the given `GskTransform`.
     * @return the `GskTransform` with an additional reference
    */
    public Transform ref()  {
        return new Transform(new PointerContainer(JnaTransform.INST().gsk_transform_ref(asCPointer())));
    }

    /**
     * Rotates &#64;next &#64;angle degrees in 2D - or in 3D-speak, around the z axis.
     * @param angle the rotation angle, in degrees (clockwise)
     * @return The new transform
    */
    public Transform rotate(float angle)  {
        return new Transform(new PointerContainer(JnaTransform.INST().gsk_transform_rotate(asCPointer(), angle)));
    }

    /**
     * Rotates &#64;next &#64;angle degrees around &#64;axis.
     * <br>
     * <br>For a rotation in 2D space, use [method&#64;Gsk.Transform.rotate]
     * @param angle the rotation angle, in degrees (clockwise)
     * @param axis The rotation axis
     * @return The new transform
    */
    public Transform rotate3d(float angle, @Nonnull ch.bailu.gtk.graphene.Vec3 axis)  {
        return new Transform(new PointerContainer(JnaTransform.INST().gsk_transform_rotate_3d(asCPointer(), angle, asCPointerNotNull(axis))));
    }

    /**
     * Scales &#64;next in 2-dimensional space by the given factors.
     * <br>
     * <br>Use [method&#64;Gsk.Transform.scale_3d] to scale in all 3 dimensions.
     * @param factor_x scaling factor on the X axis
     * @param factor_y scaling factor on the Y axis
     * @return The new transform
    */
    public Transform scale(float factor_x, float factor_y)  {
        return new Transform(new PointerContainer(JnaTransform.INST().gsk_transform_scale(asCPointer(), factor_x, factor_y)));
    }

    /**
     * Scales &#64;next by the given factors.
     * @param factor_x scaling factor on the X axis
     * @param factor_y scaling factor on the Y axis
     * @param factor_z scaling factor on the Z axis
     * @return The new transform
    */
    public Transform scale3d(float factor_x, float factor_y, float factor_z)  {
        return new Transform(new PointerContainer(JnaTransform.INST().gsk_transform_scale_3d(asCPointer(), factor_x, factor_y, factor_z)));
    }

    /**
     * Applies a skew transform.
     * @param skew_x skew factor, in degrees, on the X axis
     * @param skew_y skew factor, in degrees, on the Y axis
     * @return The new transform
    */
    public Transform skew(float skew_x, float skew_y)  {
        return new Transform(new PointerContainer(JnaTransform.INST().gsk_transform_skew(asCPointer(), skew_x, skew_y)));
    }

    /**
     * Converts a `GskTransform` to a 2D transformation matrix.
     * <br>
     * <br>&#64;self must be a 2D transformation. If you are not
     * <br>sure, use gsk_transform_get_category() &gt;=
     * <br>%GSK_TRANSFORM_CATEGORY_2D to check.
     * <br>
     * <br>The returned values have the following layout:
     * <br>
     * <br>```
     * <br>  | xx yx |   |  a  b  0 |
     * <br>  | xy yy | = |  c  d  0 |
     * <br>  | dx dy |   | tx ty  1 |
     * <br>```
     * <br>
     * <br>This function can be used to convert between a `GskTransform`
     * <br>and a matrix type from other 2D drawing libraries, in particular
     * <br>Cairo.
     * @param out_xx return location for the xx member
     * @param out_yx return location for the yx member
     * @param out_xy return location for the xy member
     * @param out_yy return location for the yy member
     * @param out_dx return location for the x0 member
     * @param out_dy return location for the y0 member
    */
    public void to2d(@Nonnull ch.bailu.gtk.type.Flt out_xx, @Nonnull ch.bailu.gtk.type.Flt out_yx, @Nonnull ch.bailu.gtk.type.Flt out_xy, @Nonnull ch.bailu.gtk.type.Flt out_yy, @Nonnull ch.bailu.gtk.type.Flt out_dx, @Nonnull ch.bailu.gtk.type.Flt out_dy)  {
        JnaTransform.INST().gsk_transform_to_2d(asCPointer(), asCPointerNotNull(out_xx), asCPointerNotNull(out_yx), asCPointerNotNull(out_xy), asCPointerNotNull(out_yy), asCPointerNotNull(out_dx), asCPointerNotNull(out_dy));
    }

    /**
     * Converts a `GskTransform` to 2D transformation factors.
     * <br>
     * <br>To recreate an equivalent transform from the factors returned
     * <br>by this function, use
     * <br>
     * <br>    gsk_transform_skew (
     * <br>        gsk_transform_scale (
     * <br>            gsk_transform_rotate (
     * <br>                gsk_transform_translate (NULL, &amp;GRAPHENE_POINT_T (dx, dy)),
     * <br>                angle),
     * <br>            scale_x, scale_y),
     * <br>        skew_x, skew_y)
     * <br>
     * <br>&#64;self must be a 2D transformation. If you are not sure, use
     * <br>
     * <br>    gsk_transform_get_category() &gt;= %GSK_TRANSFORM_CATEGORY_2D
     * <br>
     * <br>to check.
     * @param out_skew_x return location for the skew factor   in the  x direction
     * @param out_skew_y return location for the skew factor   in the  y direction
     * @param out_scale_x return location for the scale   factor in the x direction
     * @param out_scale_y return location for the scale   factor in the y direction
     * @param out_angle return location for the rotation angle
     * @param out_dx return location for the translation   in the x direction
     * @param out_dy return location for the translation   in the y direction
    */
    public void to2dComponents(@Nonnull ch.bailu.gtk.type.Flt out_skew_x, @Nonnull ch.bailu.gtk.type.Flt out_skew_y, @Nonnull ch.bailu.gtk.type.Flt out_scale_x, @Nonnull ch.bailu.gtk.type.Flt out_scale_y, @Nonnull ch.bailu.gtk.type.Flt out_angle, @Nonnull ch.bailu.gtk.type.Flt out_dx, @Nonnull ch.bailu.gtk.type.Flt out_dy)  {
        JnaTransform.INST().gsk_transform_to_2d_components(asCPointer(), asCPointerNotNull(out_skew_x), asCPointerNotNull(out_skew_y), asCPointerNotNull(out_scale_x), asCPointerNotNull(out_scale_y), asCPointerNotNull(out_angle), asCPointerNotNull(out_dx), asCPointerNotNull(out_dy));
    }

    /**
     * Converts a `GskTransform` to 2D affine transformation factors.
     * <br>
     * <br>To recreate an equivalent transform from the factors returned
     * <br>by this function, use
     * <br>
     * <br>    gsk_transform_scale (gsk_transform_translate (NULL,
     * <br>                                                  &amp;GRAPHENE_POINT_T (dx, dy)),
     * <br>                         sx, sy)
     * <br>
     * <br>&#64;self must be a 2D affine transformation. If you are not
     * <br>sure, use
     * <br>
     * <br>    gsk_transform_get_category() &gt;= %GSK_TRANSFORM_CATEGORY_2D_AFFINE
     * <br>
     * <br>to check.
     * @param out_scale_x return location for the scale   factor in the x direction
     * @param out_scale_y return location for the scale   factor in the y direction
     * @param out_dx return location for the translation   in the x direction
     * @param out_dy return location for the translation   in the y direction
    */
    public void toAffine(@Nonnull ch.bailu.gtk.type.Flt out_scale_x, @Nonnull ch.bailu.gtk.type.Flt out_scale_y, @Nonnull ch.bailu.gtk.type.Flt out_dx, @Nonnull ch.bailu.gtk.type.Flt out_dy)  {
        JnaTransform.INST().gsk_transform_to_affine(asCPointer(), asCPointerNotNull(out_scale_x), asCPointerNotNull(out_scale_y), asCPointerNotNull(out_dx), asCPointerNotNull(out_dy));
    }

    /**
     * Computes the actual value of &#64;self and stores it in &#64;out_matrix.
     * <br>
     * <br>The previous value of &#64;out_matrix will be ignored.
     * @param out_matrix The matrix to set
    */
    public void toMatrix(@Nonnull ch.bailu.gtk.graphene.Matrix out_matrix)  {
        JnaTransform.INST().gsk_transform_to_matrix(asCPointer(), asCPointerNotNull(out_matrix));
    }

    /**
     * Converts a matrix into a string that is suitable for printing.
     * <br>
     * <br>The resulting string can be parsed with [func&#64;Gsk.Transform.parse].
     * <br>
     * <br>This is a wrapper around [method&#64;Gsk.Transform.print].
     * @return A new string for &#64;self
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTransform.INST().gsk_transform_to_string(asCPointer())));
    }

    /**
     * Converts a `GskTransform` to a translation operation.
     * <br>
     * <br>&#64;self must be a 2D transformation. If you are not
     * <br>sure, use
     * <br>
     * <br>    gsk_transform_get_category() &gt;= %GSK_TRANSFORM_CATEGORY_2D_TRANSLATE
     * <br>
     * <br>to check.
     * @param out_dx return location for the translation   in the x direction
     * @param out_dy return location for the translation   in the y direction
    */
    public void toTranslate(@Nonnull ch.bailu.gtk.type.Flt out_dx, @Nonnull ch.bailu.gtk.type.Flt out_dy)  {
        JnaTransform.INST().gsk_transform_to_translate(asCPointer(), asCPointerNotNull(out_dx), asCPointerNotNull(out_dy));
    }

    /**
     * Applies all the operations from &#64;other to &#64;next.
     * @param other Transform to apply
     * @return The new transform
    */
    public Transform transform(@Nullable Transform other)  {
        return new Transform(new PointerContainer(JnaTransform.INST().gsk_transform_transform(asCPointer(), asCPointer(other))));
    }

    /**
     * Transforms a `graphene_rect_t` using the given transform &#64;self.
     * <br>
     * <br>The result is the bounding box containing the coplanar quad.
     * @param rect a `graphene_rect_t`
     * @param out_rect return location for the bounds   of the transformed rectangle
    */
    public void transformBounds(@Nonnull ch.bailu.gtk.graphene.Rect rect, @Nonnull ch.bailu.gtk.graphene.Rect out_rect)  {
        JnaTransform.INST().gsk_transform_transform_bounds(asCPointer(), asCPointerNotNull(rect), asCPointerNotNull(out_rect));
    }

    /**
     * Transforms a `graphene_point_t` using the given transform &#64;self.
     * @param point a `graphene_point_t`
     * @param out_point return location for   the transformed point
    */
    public void transformPoint(@Nonnull ch.bailu.gtk.graphene.Point point, @Nonnull ch.bailu.gtk.graphene.Point out_point)  {
        JnaTransform.INST().gsk_transform_transform_point(asCPointer(), asCPointerNotNull(point), asCPointerNotNull(out_point));
    }

    /**
     * Translates &#64;next in 2-dimensional space by &#64;point.
     * @param point the point to translate the transform by
     * @return The new transform
    */
    public Transform translate(@Nonnull ch.bailu.gtk.graphene.Point point)  {
        return new Transform(new PointerContainer(JnaTransform.INST().gsk_transform_translate(asCPointer(), asCPointerNotNull(point))));
    }

    /**
     * Translates &#64;next by &#64;point.
     * @param point the point to translate the transform by
     * @return The new transform
    */
    public Transform translate3d(@Nonnull ch.bailu.gtk.graphene.Point3D point)  {
        return new Transform(new PointerContainer(JnaTransform.INST().gsk_transform_translate_3d(asCPointer(), asCPointerNotNull(point))));
    }

    /**
     * Releases a reference on the given `GskTransform`.
     * <br>
     * <br>If the reference was the last, the resources associated to the &#64;self are
     * <br>freed.
    */
    public void unref()  {
        JnaTransform.INST().gsk_transform_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaTransform.INST().gsk_transform_get_type(); 
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
record-type
all-fields-supported

[MethodModel:java-type-not-supported:parse:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GskTransform**}}:{j:}]
*/
