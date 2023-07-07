/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A point with three components: X, Y, and Z.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Point3D extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Point3D.class.getCanonicalName());
    }

    public Point3D(PointerContainer pointer) {
        super(pointer);
    }

    public Point3D() {
        super(cast(JnaPoint3D.allocateStructure()));
    }

    private JnaPoint3D.Fields _fields;
    
    JnaPoint3D.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPoint3D.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the X coordinate
    */
    public static final String X = "x";

    /**
     * the X coordinate
    */
    public void setFieldX(float x) {
        toFields().x = x;
        toFields().writeField(X);
    }

    /**
     * the X coordinate
    */
    public float getFieldX() {
       toFields().readField(X);
       return toFields().x;
    } 

    /**
     * the Y coordinate
    */
    public static final String Y = "y";

    /**
     * the Y coordinate
    */
    public void setFieldY(float y) {
        toFields().y = y;
        toFields().writeField(Y);
    }

    /**
     * the Y coordinate
    */
    public float getFieldY() {
       toFields().readField(Y);
       return toFields().y;
    } 

    /**
     * the Z coordinate
    */
    public static final String Z = "z";

    /**
     * the Z coordinate
    */
    public void setFieldZ(float z) {
        toFields().z = z;
        toFields().writeField(Z);
    }

    /**
     * the Z coordinate
    */
    public float getFieldZ() {
       toFields().readField(Z);
       return toFields().z;
    } 

    /**
     * Allocates a &#35;graphene_point3d_t structure.
     * @return the newly allocated structure.   Use graphene_point3d_free() to free the resources   allocated by this function.
    */
    public static Point3D allocPoint3D()  {
        PointerContainer __self = cast(JnaPoint3D.INST().graphene_point3d_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Point3D:alloc");
        }
        return new Point3D(__self);
    }        
    

    /**
     * Computes the cross product of the two given &#35;graphene_point3d_t.
     * @param b a &#35;graphene_point3d_t
     * @param res return location for the cross   product
    */
    public void cross(@Nonnull Point3D b, @Nonnull Point3D res)  {
        JnaPoint3D.INST().graphene_point3d_cross(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Computes the distance between the two given &#35;graphene_point3d_t.
     * @param b a &#35;graphene_point3d_t
     * @param delta return location for the distance   components on the X, Y, and Z axis
     * @return the distance between two points
    */
    public float distance(@Nonnull Point3D b, @Nullable Vec3 delta)  {
        return JnaPoint3D.INST().graphene_point3d_distance(asCPointer(), asCPointerNotNull(b), asCPointer(delta));
    }

    /**
     * Computes the dot product of the two given &#35;graphene_point3d_t.
     * @param b a &#35;graphene_point3d_t
     * @return the value of the dot product
    */
    public float dot(@Nonnull Point3D b)  {
        return JnaPoint3D.INST().graphene_point3d_dot(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Checks whether two given points are equal.
     * @param b a &#35;graphene_point3d_t
     * @return `true` if the points are equal
    */
    public boolean equal(@Nonnull Point3D b)  {
        return JnaPoint3D.INST().graphene_point3d_equal(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Frees the resources allocated via graphene_point3d_alloc().
    */
    public void free()  {
        JnaPoint3D.INST().graphene_point3d_free(asCPointer());
    }

    /**
     * Initializes a &#35;graphene_point3d_t with the given coordinates.
     * @param x the X coordinate of the point
     * @param y the Y coordinate of the point
     * @param z the Z coordinate of the point
     * @return the initialized &#35;graphene_point3d_t
    */
    public Point3D init(float x, float y, float z)  {
        return new Point3D(new PointerContainer(JnaPoint3D.INST().graphene_point3d_init(asCPointer(), x, y, z)));
    }

    /**
     * Initializes a &#35;graphene_point3d_t using the coordinates of
     * <br>another &#35;graphene_point3d_t.
     * @param src a &#35;graphene_point3d_t
     * @return the initialized point
    */
    public Point3D initFromPoint(@Nonnull Point3D src)  {
        return new Point3D(new PointerContainer(JnaPoint3D.INST().graphene_point3d_init_from_point(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Initializes a &#35;graphene_point3d_t using the components
     * <br>of a &#35;graphene_vec3_t.
     * @param v a &#35;graphene_vec3_t
     * @return the initialized &#35;graphene_point3d_t
    */
    public Point3D initFromVec3(@Nonnull Vec3 v)  {
        return new Point3D(new PointerContainer(JnaPoint3D.INST().graphene_point3d_init_from_vec3(asCPointer(), asCPointerNotNull(v))));
    }

    /**
     * Linearly interpolates each component of &#64;a and &#64;b using the
     * <br>provided &#64;factor, and places the result in &#64;res.
     * @param b a &#35;graphene_point3d_t
     * @param factor the interpolation factor
     * @param res the return location for the   interpolated &#35;graphene_point3d_t
    */
    public void interpolate(@Nonnull Point3D b, double factor, @Nonnull Point3D res)  {
        JnaPoint3D.INST().graphene_point3d_interpolate(asCPointer(), asCPointerNotNull(b), factor, asCPointerNotNull(res));
    }

    /**
     * Computes the length of the vector represented by the
     * <br>coordinates of the given &#35;graphene_point3d_t.
     * @return the length of the vector represented by the point
    */
    public float length()  {
        return JnaPoint3D.INST().graphene_point3d_length(asCPointer());
    }

    /**
     * Checks whether the two points are near each other, within
     * <br>an &#64;epsilon factor.
     * @param b a &#35;graphene_point3d_t
     * @param epsilon fuzzyness factor
     * @return `true` if the points are near each other
    */
    public boolean near(@Nonnull Point3D b, float epsilon)  {
        return JnaPoint3D.INST().graphene_point3d_near(asCPointer(), asCPointerNotNull(b), epsilon);
    }

    /**
     * Computes the normalization of the vector represented by the
     * <br>coordinates of the given &#35;graphene_point3d_t.
     * @param res return location for the normalized   &#35;graphene_point3d_t
    */
    public void normalize(@Nonnull Point3D res)  {
        JnaPoint3D.INST().graphene_point3d_normalize(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Normalizes the coordinates of a &#35;graphene_point3d_t using the
     * <br>given viewport and clipping planes.
     * <br>
     * <br>The coordinates of the resulting &#35;graphene_point3d_t will be
     * <br>in the [ -1, 1 ] range.
     * @param viewport a &#35;graphene_rect_t representing a viewport
     * @param z_near the coordinate of the near clipping plane, or 0 for   the default near clipping plane
     * @param z_far the coordinate of the far clipping plane, or 1 for the   default far clipping plane
     * @param res the return location for the   normalized &#35;graphene_point3d_t
    */
    public void normalizeViewport(@Nonnull Rect viewport, float z_near, float z_far, @Nonnull Point3D res)  {
        JnaPoint3D.INST().graphene_point3d_normalize_viewport(asCPointer(), asCPointerNotNull(viewport), z_near, z_far, asCPointerNotNull(res));
    }

    /**
     * Scales the coordinates of the given &#35;graphene_point3d_t by
     * <br>the given &#64;factor.
     * @param factor the scaling factor
     * @param res return location for the scaled point
    */
    public void scale(float factor, @Nonnull Point3D res)  {
        JnaPoint3D.INST().graphene_point3d_scale(asCPointer(), factor, asCPointerNotNull(res));
    }

    /**
     * Stores the coordinates of a &#35;graphene_point3d_t into a
     * <br>&#35;graphene_vec3_t.
     * @param v return location for a &#35;graphene_vec3_t
    */
    public void toVec3(@Nonnull Vec3 v)  {
        JnaPoint3D.INST().graphene_point3d_to_vec3(asCPointer(), asCPointerNotNull(v));
    }

    /**
     * Retrieves a constant point with all three coordinates set to 0.
     * @return a zero point
    */
    public static Point3D zero()  {
        return new Point3D(new PointerContainer(JnaPoint3D.INST().graphene_point3d_zero()));
    }

    public static long getTypeID() { 
        return JnaPoint3D.INST().graphene_point3d_get_type(); 
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
