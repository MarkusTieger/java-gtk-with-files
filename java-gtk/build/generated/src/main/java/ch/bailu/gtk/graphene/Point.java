/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A point with two coordinates.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Point extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Point.class.getCanonicalName());
    }

    public Point(PointerContainer pointer) {
        super(pointer);
    }

    public Point() {
        super(cast(JnaPoint.allocateStructure()));
    }

    private JnaPoint.Fields _fields;
    
    JnaPoint.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPoint.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the X coordinate of the point
    */
    public static final String X = "x";

    /**
     * the X coordinate of the point
    */
    public void setFieldX(float x) {
        toFields().x = x;
        toFields().writeField(X);
    }

    /**
     * the X coordinate of the point
    */
    public float getFieldX() {
       toFields().readField(X);
       return toFields().x;
    } 

    /**
     * the Y coordinate of the point
    */
    public static final String Y = "y";

    /**
     * the Y coordinate of the point
    */
    public void setFieldY(float y) {
        toFields().y = y;
        toFields().writeField(Y);
    }

    /**
     * the Y coordinate of the point
    */
    public float getFieldY() {
       toFields().readField(Y);
       return toFields().y;
    } 

    /**
     * Allocates a new &#35;graphene_point_t structure.
     * <br>
     * <br>The coordinates of the returned point are (0, 0).
     * <br>
     * <br>It's possible to chain this function with graphene_point_init()
     * <br>or graphene_point_init_from_point(), e.g.:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   graphene_point_t *
     *   point_new (float x, float y)
     *   {
     *     return graphene_point_init (graphene_point_alloc (), x, y);
     *   }
     * 
     *   graphene_point_t *
     *   point_copy (const graphene_point_t *p)
     *   {
     *     return graphene_point_init_from_point (graphene_point_alloc (), p);
     *   }
     * </pre>
     * @return the newly allocated &#35;graphene_point_t.   Use graphene_point_free() to free the resources allocated by   this function.
    */
    public static Point allocPoint()  {
        PointerContainer __self = cast(JnaPoint.INST().graphene_point_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Point:alloc");
        }
        return new Point(__self);
    }        
    

    /**
     * Computes the distance between &#64;a and &#64;b.
     * @param b a &#35;graphene_point_t
     * @param d_x distance component on the X axis
     * @param d_y distance component on the Y axis
     * @return the distance between the two points
    */
    public float distance(@Nonnull Point b, @Nullable ch.bailu.gtk.type.Flt d_x, @Nullable ch.bailu.gtk.type.Flt d_y)  {
        return JnaPoint.INST().graphene_point_distance(asCPointer(), asCPointerNotNull(b), asCPointer(d_x), asCPointer(d_y));
    }

    /**
     * Checks if the two points &#64;a and &#64;b point to the same
     * <br>coordinates.
     * <br>
     * <br>This function accounts for floating point fluctuations; if
     * <br>you want to control the fuzziness of the match, you can use
     * <br>graphene_point_near() instead.
     * @param b a &#35;graphene_point_t
     * @return `true` if the points have the same coordinates
    */
    public boolean equal(@Nonnull Point b)  {
        return JnaPoint.INST().graphene_point_equal(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Frees the resources allocated by graphene_point_alloc().
    */
    public void free()  {
        JnaPoint.INST().graphene_point_free(asCPointer());
    }

    /**
     * Initializes &#64;p to the given &#64;x and &#64;y coordinates.
     * <br>
     * <br>It's safe to call this function multiple times.
     * @param x the X coordinate
     * @param y the Y coordinate
     * @return the initialized point
    */
    public Point init(float x, float y)  {
        return new Point(new PointerContainer(JnaPoint.INST().graphene_point_init(asCPointer(), x, y)));
    }

    /**
     * Initializes &#64;p with the same coordinates of &#64;src.
     * @param src the &#35;graphene_point_t to use
     * @return the initialized point
    */
    public Point initFromPoint(@Nonnull Point src)  {
        return new Point(new PointerContainer(JnaPoint.INST().graphene_point_init_from_point(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Initializes &#64;p with the coordinates inside the given &#35;graphene_vec2_t.
     * @param src a &#35;graphene_vec2_t
     * @return the initialized point
    */
    public Point initFromVec2(@Nonnull Vec2 src)  {
        return new Point(new PointerContainer(JnaPoint.INST().graphene_point_init_from_vec2(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Linearly interpolates the coordinates of &#64;a and &#64;b using the
     * <br>given &#64;factor.
     * @param b a &#35;graphene_point_t
     * @param factor the linear interpolation factor
     * @param res return location for the interpolated   point
    */
    public void interpolate(@Nonnull Point b, double factor, @Nonnull Point res)  {
        JnaPoint.INST().graphene_point_interpolate(asCPointer(), asCPointerNotNull(b), factor, asCPointerNotNull(res));
    }

    /**
     * Checks whether the two points &#64;a and &#64;b are within
     * <br>the threshold of &#64;epsilon.
     * @param b a &#35;graphene_point_t
     * @param epsilon threshold between the two points
     * @return `true` if the distance is within &#64;epsilon
    */
    public boolean near(@Nonnull Point b, float epsilon)  {
        return JnaPoint.INST().graphene_point_near(asCPointer(), asCPointerNotNull(b), epsilon);
    }

    /**
     * Stores the coordinates of the given &#35;graphene_point_t into a
     * <br>&#35;graphene_vec2_t.
     * @param v return location for the vertex
    */
    public void toVec2(@Nonnull Vec2 v)  {
        JnaPoint.INST().graphene_point_to_vec2(asCPointer(), asCPointerNotNull(v));
    }

    /**
     * Returns a point fixed at (0, 0).
     * @return a fixed point
    */
    public static Point zero()  {
        return new Point(new PointerContainer(JnaPoint.INST().graphene_point_zero()));
    }

    public static long getTypeID() { 
        return JnaPoint.INST().graphene_point_get_type(); 
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
