/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoMatrix` specifies a transformation between user-space
 * <br>and device coordinates.
 * <br>
 * <br>The transformation is given by
 * <br>
 * <br>```
 * <br>x_device = x_user * matrix-&gt;xx + y_user * matrix-&gt;xy + matrix-&gt;x0;
 * <br>y_device = x_user * matrix-&gt;yx + y_user * matrix-&gt;yy + matrix-&gt;y0;
 * <br>```
 * <p><a href="https://docs.gtk.org/Pango/struct.Matrix.html">https://docs.gtk.org/Pango/struct.Matrix.html</a></p>
*/
public class Matrix extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Matrix.class.getCanonicalName());
    }

    public Matrix(PointerContainer pointer) {
        super(pointer);
    }

    public Matrix() {
        super(cast(JnaMatrix.allocateStructure()));
    }

    private JnaMatrix.Fields _fields;
    
    JnaMatrix.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaMatrix.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 1st component of the transformation matrix
    */
    public static final String XX = "xx";

    /**
     * 1st component of the transformation matrix
    */
    public void setFieldXx(double xx) {
        toFields().xx = xx;
        toFields().writeField(XX);
    }

    /**
     * 1st component of the transformation matrix
    */
    public double getFieldXx() {
       toFields().readField(XX);
       return toFields().xx;
    } 

    /**
     * 2nd component of the transformation matrix
    */
    public static final String XY = "xy";

    /**
     * 2nd component of the transformation matrix
    */
    public void setFieldXy(double xy) {
        toFields().xy = xy;
        toFields().writeField(XY);
    }

    /**
     * 2nd component of the transformation matrix
    */
    public double getFieldXy() {
       toFields().readField(XY);
       return toFields().xy;
    } 

    /**
     * 3rd component of the transformation matrix
    */
    public static final String YX = "yx";

    /**
     * 3rd component of the transformation matrix
    */
    public void setFieldYx(double yx) {
        toFields().yx = yx;
        toFields().writeField(YX);
    }

    /**
     * 3rd component of the transformation matrix
    */
    public double getFieldYx() {
       toFields().readField(YX);
       return toFields().yx;
    } 

    /**
     * 4th component of the transformation matrix
    */
    public static final String YY = "yy";

    /**
     * 4th component of the transformation matrix
    */
    public void setFieldYy(double yy) {
        toFields().yy = yy;
        toFields().writeField(YY);
    }

    /**
     * 4th component of the transformation matrix
    */
    public double getFieldYy() {
       toFields().readField(YY);
       return toFields().yy;
    } 

    /**
     * x translation
    */
    public static final String X0 = "x0";

    /**
     * x translation
    */
    public void setFieldX0(double x0) {
        toFields().x0 = x0;
        toFields().writeField(X0);
    }

    /**
     * x translation
    */
    public double getFieldX0() {
       toFields().readField(X0);
       return toFields().x0;
    } 

    /**
     * y translation
    */
    public static final String Y0 = "y0";

    /**
     * y translation
    */
    public void setFieldY0(double y0) {
        toFields().y0 = y0;
        toFields().writeField(Y0);
    }

    /**
     * y translation
    */
    public double getFieldY0() {
       toFields().readField(Y0);
       return toFields().y0;
    } 

    /**
     * Changes the transformation represented by &#64;matrix to be the
     * <br>transformation given by first applying transformation
     * <br>given by &#64;new_matrix then applying the original transformation.
     * @param new_matrix a `PangoMatrix`
    */
    public void concat(@Nonnull Matrix new_matrix)  {
        JnaMatrix.INST().pango_matrix_concat(asCPointer(), asCPointerNotNull(new_matrix));
    }

    /**
     * Copies a `PangoMatrix`.
     * @return the newly allocated `PangoMatrix`
    */
    public Matrix copy()  {
        return new Matrix(new PointerContainer(JnaMatrix.INST().pango_matrix_copy(asCPointer())));
    }

    /**
     * Free a `PangoMatrix`.
    */
    public void free()  {
        JnaMatrix.INST().pango_matrix_free(asCPointer());
    }

    /**
     * Returns the scale factor of a matrix on the height of the font.
     * <br>
     * <br>That is, the scale factor in the direction perpendicular to the
     * <br>vector that the X coordinate is mapped to.  If the scale in the X
     * <br>coordinate is needed as well, use [method&#64;Pango.Matrix.get_font_scale_factors].
     * @return the scale factor of &#64;matrix on the height of the font,   or 1.0 if &#64;matrix is %NULL.
    */
    public double getFontScaleFactor()  {
        return JnaMatrix.INST().pango_matrix_get_font_scale_factor(asCPointer());
    }

    /**
     * Gets the slant ratio of a matrix.
     * <br>
     * <br>For a simple shear matrix in the form:
     * <br>
     * <br>    1 λ
     * <br>    0 1
     * <br>
     * <br>this is simply λ.
     * @return the slant ratio of &#64;matrix
    */
    public double getSlantRatio()  {
        return JnaMatrix.INST().pango_matrix_get_slant_ratio(asCPointer());
    }

    /**
     * Changes the transformation represented by &#64;matrix to be the
     * <br>transformation given by first rotating by &#64;degrees degrees
     * <br>counter-clockwise then applying the original transformation.
     * @param degrees degrees to rotate counter-clockwise
    */
    public void rotate(double degrees)  {
        JnaMatrix.INST().pango_matrix_rotate(asCPointer(), degrees);
    }

    /**
     * Changes the transformation represented by &#64;matrix to be the
     * <br>transformation given by first scaling by &#64;sx in the X direction
     * <br>and &#64;sy in the Y direction then applying the original
     * <br>transformation.
     * @param scale_x amount to scale by in X direction
     * @param scale_y amount to scale by in Y direction
    */
    public void scale(double scale_x, double scale_y)  {
        JnaMatrix.INST().pango_matrix_scale(asCPointer(), scale_x, scale_y);
    }

    /**
     * First transforms the &#64;rect using &#64;matrix, then calculates the bounding box
     * <br>of the transformed rectangle.
     * <br>
     * <br>This function is useful for example when you want to draw a rotated
     * <br>&#64;PangoLayout to an image buffer, and want to know how large the image
     * <br>should be and how much you should shift the layout when rendering.
     * <br>
     * <br>For better accuracy, you should use [method&#64;Pango.Matrix.transform_rectangle]
     * <br>on original rectangle in Pango units and convert to pixels afterward
     * <br>using [func&#64;extents_to_pixels]'s first argument.
     * @param rect in/out bounding box in device units
    */
    public void transformPixelRectangle(@Nullable Rectangle rect)  {
        JnaMatrix.INST().pango_matrix_transform_pixel_rectangle(asCPointer(), asCPointer(rect));
    }

    /**
     * First transforms &#64;rect using &#64;matrix, then calculates the bounding box
     * <br>of the transformed rectangle.
     * <br>
     * <br>This function is useful for example when you want to draw a rotated
     * <br>&#64;PangoLayout to an image buffer, and want to know how large the image
     * <br>should be and how much you should shift the layout when rendering.
     * <br>
     * <br>If you have a rectangle in device units (pixels), use
     * <br>[method&#64;Pango.Matrix.transform_pixel_rectangle].
     * <br>
     * <br>If you have the rectangle in Pango units and want to convert to
     * <br>transformed pixel bounding box, it is more accurate to transform it first
     * <br>(using this function) and pass the result to pango_extents_to_pixels(),
     * <br>first argument, for an inclusive rounded rectangle.
     * <br>However, there are valid reasons that you may want to convert
     * <br>to pixels first and then transform, for example when the transformed
     * <br>coordinates may overflow in Pango units (large matrix translation for
     * <br>example).
     * @param rect in/out bounding box in Pango units
    */
    public void transformRectangle(@Nullable Rectangle rect)  {
        JnaMatrix.INST().pango_matrix_transform_rectangle(asCPointer(), asCPointer(rect));
    }

    /**
     * Changes the transformation represented by &#64;matrix to be the
     * <br>transformation given by first translating by (&#64;tx, &#64;ty)
     * <br>then applying the original transformation.
     * @param tx amount to translate in the X direction
     * @param ty amount to translate in the Y direction
    */
    public void translate(double tx, double ty)  {
        JnaMatrix.INST().pango_matrix_translate(asCPointer(), tx, ty);
    }

    public static long getTypeID() { 
        return JnaMatrix.INST().pango_matrix_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getFontScaleFactors:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:transformDistance:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:transformPoint:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
