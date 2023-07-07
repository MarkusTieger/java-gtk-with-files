/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The location and size of a rectangle region.
 * <br>
 * <br>The width and height of a &#35;graphene_rect_t can be negative; for instance,
 * <br>a &#35;graphene_rect_t with an origin of [ 0, 0 ] and a size of [ 10, 10 ] is
 * <br>equivalent to a &#35;graphene_rect_t with an origin of [ 10, 10 ] and a size
 * <br>of [ -10, -10 ].
 * <br>
 * <br>Application code can normalize rectangles using graphene_rect_normalize();
 * <br>this function will ensure that the width and height of a rectangle are
 * <br>positive values. All functions taking a &#35;graphene_rect_t as an argument
 * <br>will internally operate on a normalized copy; all functions returning a
 * <br>&#35;graphene_rect_t will always return a normalized rectangle.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Rect extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Rect.class.getCanonicalName());
    }

    public Rect(PointerContainer pointer) {
        super(pointer);
    }

    public Rect() {
        super(cast(JnaRect.allocateStructure()));
    }

    private JnaRect.Fields _fields;
    
    JnaRect.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRect.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the coordinates of the origin of the rectangle
     * <br>Private field: direct-type
    */
    public static final String ORIGIN = "origin";

    /**
     * the size of the rectangle
     * <br>Private field: direct-type
    */
    public static final String SIZE = "size";

    /**
     * Checks whether a &#35;graphene_rect_t contains the given coordinates.
     * @param p a &#35;graphene_point_t
     * @return `true` if the rectangle contains the point
    */
    public boolean containsPoint(@Nonnull Point p)  {
        return JnaRect.INST().graphene_rect_contains_point(asCPointer(), asCPointerNotNull(p));
    }

    /**
     * Checks whether a &#35;graphene_rect_t fully contains the given
     * <br>rectangle.
     * @param b a &#35;graphene_rect_t
     * @return `true` if the rectangle &#64;a fully contains &#64;b
    */
    public boolean containsRect(@Nonnull Rect b)  {
        return JnaRect.INST().graphene_rect_contains_rect(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Checks whether the two given rectangle are equal.
     * @param b a &#35;graphene_rect_t
     * @return `true` if the rectangles are equal
    */
    public boolean equal(@Nonnull Rect b)  {
        return JnaRect.INST().graphene_rect_equal(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Expands a &#35;graphene_rect_t to contain the given &#35;graphene_point_t.
     * @param p a &#35;graphene_point_t
     * @param res return location for the expanded rectangle
    */
    public void expand(@Nonnull Point p, @Nonnull Rect res)  {
        JnaRect.INST().graphene_rect_expand(asCPointer(), asCPointerNotNull(p), asCPointerNotNull(res));
    }

    /**
     * Frees the resources allocated by graphene_rect_alloc().
    */
    public void free()  {
        JnaRect.INST().graphene_rect_free(asCPointer());
    }

    /**
     * Compute the area of given normalized rectangle.
     * @return the area of the normalized rectangle
    */
    public float getArea()  {
        return JnaRect.INST().graphene_rect_get_area(asCPointer());
    }

    /**
     * Retrieves the coordinates of the bottom-left corner of the given rectangle.
     * @param p return location for a &#35;graphene_point_t
    */
    public void getBottomLeft(@Nonnull Point p)  {
        JnaRect.INST().graphene_rect_get_bottom_left(asCPointer(), asCPointerNotNull(p));
    }

    /**
     * Retrieves the coordinates of the bottom-right corner of the given rectangle.
     * @param p return location for a &#35;graphene_point_t
    */
    public void getBottomRight(@Nonnull Point p)  {
        JnaRect.INST().graphene_rect_get_bottom_right(asCPointer(), asCPointerNotNull(p));
    }

    /**
     * Retrieves the coordinates of the center of the given rectangle.
     * @param p return location for a &#35;graphene_point_t
    */
    public void getCenter(@Nonnull Point p)  {
        JnaRect.INST().graphene_rect_get_center(asCPointer(), asCPointerNotNull(p));
    }

    /**
     * Retrieves the normalized height of the given rectangle.
     * @return the normalized height of the rectangle
    */
    public float getHeight()  {
        return JnaRect.INST().graphene_rect_get_height(asCPointer());
    }

    /**
     * Retrieves the coordinates of the top-left corner of the given rectangle.
     * @param p return location for a &#35;graphene_point_t
    */
    public void getTopLeft(@Nonnull Point p)  {
        JnaRect.INST().graphene_rect_get_top_left(asCPointer(), asCPointerNotNull(p));
    }

    /**
     * Retrieves the coordinates of the top-right corner of the given rectangle.
     * @param p return location for a &#35;graphene_point_t
    */
    public void getTopRight(@Nonnull Point p)  {
        JnaRect.INST().graphene_rect_get_top_right(asCPointer(), asCPointerNotNull(p));
    }

    /**
     * Retrieves the normalized width of the given rectangle.
     * @return the normalized width of the rectangle
    */
    public float getWidth()  {
        return JnaRect.INST().graphene_rect_get_width(asCPointer());
    }

    /**
     * Retrieves the normalized X coordinate of the origin of the given
     * <br>rectangle.
     * @return the normalized X coordinate of the rectangle
    */
    public float getX()  {
        return JnaRect.INST().graphene_rect_get_x(asCPointer());
    }

    /**
     * Retrieves the normalized Y coordinate of the origin of the given
     * <br>rectangle.
     * @return the normalized Y coordinate of the rectangle
    */
    public float getY()  {
        return JnaRect.INST().graphene_rect_get_y(asCPointer());
    }

    /**
     * Initializes the given &#35;graphene_rect_t with the given values.
     * <br>
     * <br>This function will implicitly normalize the &#35;graphene_rect_t
     * <br>before returning.
     * @param x the X coordinate of the &#64;graphene_rect_t.origin
     * @param y the Y coordinate of the &#64;graphene_rect_t.origin
     * @param width the width of the &#64;graphene_rect_t.size
     * @param height the height of the &#64;graphene_rect_t.size
     * @return the initialized rectangle
    */
    public Rect init(float x, float y, float width, float height)  {
        return new Rect(new PointerContainer(JnaRect.INST().graphene_rect_init(asCPointer(), x, y, width, height)));
    }

    /**
     * Initializes &#64;r using the given &#64;src rectangle.
     * <br>
     * <br>This function will implicitly normalize the &#35;graphene_rect_t
     * <br>before returning.
     * @param src a &#35;graphene_rect_t
     * @return the initialized rectangle
    */
    public Rect initFromRect(@Nonnull Rect src)  {
        return new Rect(new PointerContainer(JnaRect.INST().graphene_rect_init_from_rect(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Changes the given rectangle to be smaller, or larger depending on the
     * <br>given inset parameters.
     * <br>
     * <br>To create an inset rectangle, use positive &#64;d_x or &#64;d_y values; to
     * <br>create a larger, encompassing rectangle, use negative &#64;d_x or &#64;d_y
     * <br>values.
     * <br>
     * <br>The origin of the rectangle is offset by &#64;d_x and &#64;d_y, while the size
     * <br>is adjusted by `(2 * &#64;d_x, 2 * &#64;d_y)`. If &#64;d_x and &#64;d_y are positive
     * <br>values, the size of the rectangle is decreased; if &#64;d_x and &#64;d_y are
     * <br>negative values, the size of the rectangle is increased.
     * <br>
     * <br>If the size of the resulting inset rectangle has a negative width or
     * <br>height then the size will be set to zero.
     * @param d_x the horizontal inset
     * @param d_y the vertical inset
     * @return the inset rectangle
    */
    public Rect inset(float d_x, float d_y)  {
        return new Rect(new PointerContainer(JnaRect.INST().graphene_rect_inset(asCPointer(), d_x, d_y)));
    }

    /**
     * Changes the given rectangle to be smaller, or larger depending on the
     * <br>given inset parameters.
     * <br>
     * <br>To create an inset rectangle, use positive &#64;d_x or &#64;d_y values; to
     * <br>create a larger, encompassing rectangle, use negative &#64;d_x or &#64;d_y
     * <br>values.
     * <br>
     * <br>The origin of the rectangle is offset by &#64;d_x and &#64;d_y, while the size
     * <br>is adjusted by `(2 * &#64;d_x, 2 * &#64;d_y)`. If &#64;d_x and &#64;d_y are positive
     * <br>values, the size of the rectangle is decreased; if &#64;d_x and &#64;d_y are
     * <br>negative values, the size of the rectangle is increased.
     * <br>
     * <br>If the size of the resulting inset rectangle has a negative width or
     * <br>height then the size will be set to zero.
     * @param d_x the horizontal inset
     * @param d_y the vertical inset
     * @param res return location for the inset rectangle
    */
    public void insetR(float d_x, float d_y, @Nonnull Rect res)  {
        JnaRect.INST().graphene_rect_inset_r(asCPointer(), d_x, d_y, asCPointerNotNull(res));
    }

    /**
     * Linearly interpolates the origin and size of the two given
     * <br>rectangles.
     * @param b a &#35;graphene_rect_t
     * @param factor the linear interpolation factor
     * @param res return location for the   interpolated rectangle
    */
    public void interpolate(@Nonnull Rect b, double factor, @Nonnull Rect res)  {
        JnaRect.INST().graphene_rect_interpolate(asCPointer(), asCPointerNotNull(b), factor, asCPointerNotNull(res));
    }

    /**
     * Computes the intersection of the two given rectangles.
     * <br>
     * <br>![](rectangle-intersection.png)
     * <br>
     * <br>The intersection in the image above is the blue outline.
     * <br>
     * <br>If the two rectangles do not intersect, &#64;res will contain
     * <br>a degenerate rectangle with origin in (0, 0) and a size of 0.
     * @param b a &#35;graphene_rect_t
     * @param res return location for   a &#35;graphene_rect_t
     * @return `true` if the two rectangles intersect
    */
    public boolean intersection(@Nonnull Rect b, @Nullable Rect res)  {
        return JnaRect.INST().graphene_rect_intersection(asCPointer(), asCPointerNotNull(b), asCPointer(res));
    }

    /**
     * Normalizes the passed rectangle.
     * <br>
     * <br>This function ensures that the size of the rectangle is made of
     * <br>positive values, and that the origin is the top-left corner of
     * <br>the rectangle.
     * @return the normalized rectangle
    */
    public Rect normalize()  {
        return new Rect(new PointerContainer(JnaRect.INST().graphene_rect_normalize(asCPointer())));
    }

    /**
     * Normalizes the passed rectangle.
     * <br>
     * <br>This function ensures that the size of the rectangle is made of
     * <br>positive values, and that the origin is in the top-left corner
     * <br>of the rectangle.
     * @param res the return location for the   normalized rectangle
    */
    public void normalizeR(@Nonnull Rect res)  {
        JnaRect.INST().graphene_rect_normalize_r(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Offsets the origin by &#64;d_x and &#64;d_y.
     * <br>
     * <br>The size of the rectangle is unchanged.
     * @param d_x the horizontal offset
     * @param d_y the vertical offset
     * @return the offset rectangle
    */
    public Rect offset(float d_x, float d_y)  {
        return new Rect(new PointerContainer(JnaRect.INST().graphene_rect_offset(asCPointer(), d_x, d_y)));
    }

    /**
     * Offsets the origin of the given rectangle by &#64;d_x and &#64;d_y.
     * <br>
     * <br>The size of the rectangle is left unchanged.
     * @param d_x the horizontal offset
     * @param d_y the vertical offset
     * @param res return location for the offset   rectangle
    */
    public void offsetR(float d_x, float d_y, @Nonnull Rect res)  {
        JnaRect.INST().graphene_rect_offset_r(asCPointer(), d_x, d_y, asCPointerNotNull(res));
    }

    /**
     * Rounds the origin of the given rectangle to its nearest
     * <br>integer value and and recompute the size so that the
     * <br>rectangle is large enough to contain all the conrners
     * <br>of the original rectangle.
     * <br>
     * <br>This function is the equivalent of calling `floor` on
     * <br>the coordinates of the origin, and recomputing the size
     * <br>calling `ceil` on the bottom-right coordinates.
     * <br>
     * <br>If you want to be sure that the rounded rectangle
     * <br>completely covers the area that was covered by the
     * <br>original rectangle — i.e. you want to cover the area
     * <br>including all its corners — this function will make sure
     * <br>that the size is recomputed taking into account the ceiling
     * <br>of the coordinates of the bottom-right corner.
     * <br>If the difference between the original coordinates and the
     * <br>coordinates of the rounded rectangle is greater than the
     * <br>difference between the original size and and the rounded
     * <br>size, then the move of the origin would not be compensated
     * <br>by a move in the anti-origin, leaving the corners of the
     * <br>original rectangle outside the rounded one.
     * @param res return location for the   rectangle with rounded extents
    */
    public void roundExtents(@Nonnull Rect res)  {
        JnaRect.INST().graphene_rect_round_extents(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Scales the size and origin of a rectangle horizontaly by &#64;s_h,
     * <br>and vertically by &#64;s_v. The result &#64;res is normalized.
     * @param s_h horizontal scale factor
     * @param s_v vertical scale factor
     * @param res return location for the   scaled rectangle
    */
    public void scale(float s_h, float s_v, @Nonnull Rect res)  {
        JnaRect.INST().graphene_rect_scale(asCPointer(), s_h, s_v, asCPointerNotNull(res));
    }

    /**
     * Computes the union of the two given rectangles.
     * <br>
     * <br>![](rectangle-union.png)
     * <br>
     * <br>The union in the image above is the blue outline.
     * @param b a &#35;graphene_rect_t
     * @param res return location for a &#35;graphene_rect_t
    */
    public void union(@Nonnull Rect b, @Nonnull Rect res)  {
        JnaRect.INST().graphene_rect_union(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Allocates a new &#35;graphene_rect_t.
     * <br>
     * <br>The contents of the returned rectangle are undefined.
     * @return the newly allocated rectangle
    */
    public static Rect alloc()  {
        return new Rect(new PointerContainer(JnaRect.INST().graphene_rect_alloc()));
    }

    /**
     * Returns a degenerate rectangle with origin fixed at (0, 0) and
     * <br>a size of 0, 0.
     * @return a fixed rectangle
    */
    public static Rect zero()  {
        return new Rect(new PointerContainer(JnaRect.INST().graphene_rect_zero()));
    }

    public static long getTypeID() { 
        return JnaRect.INST().graphene_rect_get_type(); 
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

[MethodModel:java-type-not-supported:getVertices:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:graphene_vec2_t*}}:{j:}]

[MethodModel:cb-deprecated:round:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Rect:{c:graphene_rect_t*}}:{j:long}]

[MethodModel:cb-deprecated:roundToPixel:[ParameterModel:Supported:{Gg:Rect:{c:graphene_rect_t*}}:{j:long}]]
*/
