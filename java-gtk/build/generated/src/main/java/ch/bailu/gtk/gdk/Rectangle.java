/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkRectangle` data type for representing rectangles.
 * <br>
 * <br>`GdkRectangle` is identical to `cairo_rectangle_t`. Together with Cairo’s
 * <br>`cairo_region_t` data type, these are the central types for representing
 * <br>sets of pixels.
 * <br>
 * <br>The intersection of two rectangles can be computed with
 * <br>[method&#64;Gdk.Rectangle.intersect]; to find the union of two rectangles use
 * <br>[method&#64;Gdk.Rectangle.union].
 * <br>
 * <br>The `cairo_region_t` type provided by Cairo is usually used for managing
 * <br>non-rectangular clipping of graphical operations.
 * <br>
 * <br>The Graphene library has a number of other data types for regions and
 * <br>volumes in 2D and 3D.
 * <p><a href="https://docs.gtk.org/gdk4/struct.Rectangle.html">https://docs.gtk.org/gdk4/struct.Rectangle.html</a></p>
*/
public class Rectangle extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Rectangle.class.getCanonicalName());
    }

    public Rectangle(PointerContainer pointer) {
        super(pointer);
    }

    public Rectangle() {
        super(cast(JnaRectangle.allocateStructure()));
    }

    private JnaRectangle.Fields _fields;
    
    JnaRectangle.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRectangle.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the x coordinate of the top left corner
    */
    public static final String X = "x";

    /**
     * the x coordinate of the top left corner
    */
    public void setFieldX(int x) {
        toFields().x = x;
        toFields().writeField(X);
    }

    /**
     * the x coordinate of the top left corner
    */
    public int getFieldX() {
       toFields().readField(X);
       return toFields().x;
    } 

    /**
     * the y coordinate of the top left corner
    */
    public static final String Y = "y";

    /**
     * the y coordinate of the top left corner
    */
    public void setFieldY(int y) {
        toFields().y = y;
        toFields().writeField(Y);
    }

    /**
     * the y coordinate of the top left corner
    */
    public int getFieldY() {
       toFields().readField(Y);
       return toFields().y;
    } 

    /**
     * the width of the rectangle
    */
    public static final String WIDTH = "width";

    /**
     * the width of the rectangle
    */
    public void setFieldWidth(int width) {
        toFields().width = width;
        toFields().writeField(WIDTH);
    }

    /**
     * the width of the rectangle
    */
    public int getFieldWidth() {
       toFields().readField(WIDTH);
       return toFields().width;
    } 

    /**
     * the height of the rectangle
    */
    public static final String HEIGHT = "height";

    /**
     * the height of the rectangle
    */
    public void setFieldHeight(int height) {
        toFields().height = height;
        toFields().writeField(HEIGHT);
    }

    /**
     * the height of the rectangle
    */
    public int getFieldHeight() {
       toFields().readField(HEIGHT);
       return toFields().height;
    } 

    /**
     * Returns %TRUE if &#64;rect contains the point described by &#64;x and &#64;y.
     * @param x X coordinate
     * @param y Y coordinate
     * @return %TRUE if &#64;rect contains the point
    */
    public boolean containsPoint(int x, int y)  {
        return JnaRectangle.INST().gdk_rectangle_contains_point(asCPointer(), x, y);
    }

    /**
     * Checks if the two given rectangles are equal.
     * @param rect2 a `GdkRectangle`
     * @return %TRUE if the rectangles are equal.
    */
    public boolean equal(@Nonnull Rectangle rect2)  {
        return JnaRectangle.INST().gdk_rectangle_equal(asCPointer(), asCPointerNotNull(rect2));
    }

    /**
     * Calculates the intersection of two rectangles.
     * <br>
     * <br>It is allowed for &#64;dest to be the same as either &#64;src1 or &#64;src2.
     * <br>If the rectangles do not intersect, &#64;dest’s width and height is set
     * <br>to 0 and its x and y values are undefined. If you are only interested
     * <br>in whether the rectangles intersect, but not in the intersecting area
     * <br>itself, pass %NULL for &#64;dest.
     * @param src2 a `GdkRectangle`
     * @param dest return location for the   intersection of &#64;src1 and &#64;src2
     * @return %TRUE if the rectangles intersect.
    */
    public boolean intersect(@Nonnull Rectangle src2, @Nullable Rectangle dest)  {
        return JnaRectangle.INST().gdk_rectangle_intersect(asCPointer(), asCPointerNotNull(src2), asCPointer(dest));
    }

    /**
     * Calculates the union of two rectangles.
     * <br>
     * <br>The union of rectangles &#64;src1 and &#64;src2 is the smallest rectangle which
     * <br>includes both &#64;src1 and &#64;src2 within it. It is allowed for &#64;dest to be
     * <br>the same as either &#64;src1 or &#64;src2.
     * <br>
     * <br>Note that this function does not ignore 'empty' rectangles (ie. with
     * <br>zero width or height).
     * @param src2 a `GdkRectangle`
     * @param dest return location for the union of &#64;src1 and &#64;src2
    */
    public void union(@Nonnull Rectangle src2, @Nonnull Rectangle dest)  {
        JnaRectangle.INST().gdk_rectangle_union(asCPointer(), asCPointerNotNull(src2), asCPointerNotNull(dest));
    }

    public static long getTypeID() { 
        return JnaRectangle.INST().gdk_rectangle_get_type(); 
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
*/
