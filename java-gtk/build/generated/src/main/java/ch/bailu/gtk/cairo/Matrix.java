/* this file is machine generated */
package ch.bailu.gtk.cairo;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://www.cairographics.org/manual/">https://www.cairographics.org/manual/</a></p>
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
     * 
    */
    public static final String XX = "xx";

    /**
     * 
    */
    public void setFieldXx(double xx) {
        toFields().xx = xx;
        toFields().writeField(XX);
    }

    /**
     * 
    */
    public double getFieldXx() {
       toFields().readField(XX);
       return toFields().xx;
    } 

    /**
     * 
    */
    public static final String YX = "yx";

    /**
     * 
    */
    public void setFieldYx(double yx) {
        toFields().yx = yx;
        toFields().writeField(YX);
    }

    /**
     * 
    */
    public double getFieldYx() {
       toFields().readField(YX);
       return toFields().yx;
    } 

    /**
     * 
    */
    public static final String XY = "xy";

    /**
     * 
    */
    public void setFieldXy(double xy) {
        toFields().xy = xy;
        toFields().writeField(XY);
    }

    /**
     * 
    */
    public double getFieldXy() {
       toFields().readField(XY);
       return toFields().xy;
    } 

    /**
     * 
    */
    public static final String YY = "yy";

    /**
     * 
    */
    public void setFieldYy(double yy) {
        toFields().yy = yy;
        toFields().writeField(YY);
    }

    /**
     * 
    */
    public double getFieldYy() {
       toFields().readField(YY);
       return toFields().yy;
    } 

    /**
     * 
    */
    public static final String X0 = "x0";

    /**
     * 
    */
    public void setFieldX0(double x0) {
        toFields().x0 = x0;
        toFields().writeField(X0);
    }

    /**
     * 
    */
    public double getFieldX0() {
       toFields().readField(X0);
       return toFields().x0;
    } 

    /**
     * 
    */
    public static final String Y0 = "y0";

    /**
     * 
    */
    public void setFieldY0(double y0) {
        toFields().y0 = y0;
        toFields().writeField(Y0);
    }

    /**
     * 
    */
    public double getFieldY0() {
       toFields().readField(Y0);
       return toFields().y0;
    } 

    public void initIdentity()  {
        JnaMatrix.INST().cairo_matrix_init_identity(asCPointer());
    }

    /**
     * 
     * @param tx 
     * @param ty 
    */
    public void translate(double tx, double ty)  {
        JnaMatrix.INST().cairo_matrix_translate(asCPointer(), tx, ty);
    }

    /**
     * 
     * @param sx 
     * @param sy 
    */
    public void scale(double sx, double sy)  {
        JnaMatrix.INST().cairo_matrix_scale(asCPointer(), sx, sy);
    }

    /**
     * 
     * @param radians 
    */
    public void rotate(double radians)  {
        JnaMatrix.INST().cairo_matrix_rotate(asCPointer(), radians);
    }

    public void invert()  {
        JnaMatrix.INST().cairo_matrix_invert(asCPointer());
    }

    /**
     * 
     * @param a 
     * @param b 
    */
    public void multiply(@Nonnull Matrix a, @Nonnull Matrix b)  {
        JnaMatrix.INST().cairo_matrix_multiply(asCPointer(), asCPointerNotNull(a), asCPointerNotNull(b));
    }

    /**
     * 
     * @param xx 
     * @param yx 
     * @param xy 
     * @param yy 
     * @param x0 
     * @param y0 
    */
    public void init(double xx, double yx, double xy, double yy, double x0, double y0)  {
        JnaMatrix.INST().cairo_matrix_init(asCPointer(), xx, yx, xy, yy, x0, y0);
    }

}

/*
record-type
all-fields-supported

[MethodModel:java-type-not-supported:java-type-not-supported:distance:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:transformPoint:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
