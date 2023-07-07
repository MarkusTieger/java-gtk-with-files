/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A 2D plane that extends infinitely in a 3D volume.
 * <br>
 * <br>The contents of the `graphene_plane_t` are private, and should not be
 * <br>modified directly.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Plane extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Plane.class.getCanonicalName());
    }

    public Plane(PointerContainer pointer) {
        super(pointer);
    }

    public Plane() {
        super(cast(JnaPlane.allocateStructure()));
    }

    private JnaPlane.Fields _fields;
    
    JnaPlane.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPlane.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String NORMAL = "normal";

    /**
     * 
    */
    public static final String CONSTANT = "constant";

    /**
     * 
    */
    public float getFieldConstant() {
       toFields().readField(CONSTANT);
       return toFields().constant;
    } 

    /**
     * Allocates a new &#35;graphene_plane_t structure.
     * <br>
     * <br>The contents of the returned structure are undefined.
     * @return the newly allocated &#35;graphene_plane_t.   Use graphene_plane_free() to free the resources allocated by   this function
    */
    public static Plane allocPlane()  {
        PointerContainer __self = cast(JnaPlane.INST().graphene_plane_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Plane:alloc");
        }
        return new Plane(__self);
    }        
    

    /**
     * Computes the distance of &#64;point from a &#35;graphene_plane_t.
     * @param point a &#35;graphene_point3d_t
     * @return the distance of the given &#35;graphene_point3d_t from the plane
    */
    public float distance(@Nonnull Point3D point)  {
        return JnaPlane.INST().graphene_plane_distance(asCPointer(), asCPointerNotNull(point));
    }

    /**
     * Checks whether the two given &#35;graphene_plane_t are equal.
     * @param b a &#35;graphene_plane_t
     * @return `true` if the given planes are equal
    */
    public boolean equal(@Nonnull Plane b)  {
        return JnaPlane.INST().graphene_plane_equal(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Frees the resources allocated by graphene_plane_alloc().
    */
    public void free()  {
        JnaPlane.INST().graphene_plane_free(asCPointer());
    }

    /**
     * Retrieves the distance along the normal vector of the
     * <br>given &#35;graphene_plane_t from the origin.
     * @return the constant value of the plane
    */
    public float getConstant()  {
        return JnaPlane.INST().graphene_plane_get_constant(asCPointer());
    }

    /**
     * Retrieves the normal vector pointing towards the origin of the
     * <br>given &#35;graphene_plane_t.
     * @param normal return location for the normal vector
    */
    public void getNormal(@Nonnull Vec3 normal)  {
        JnaPlane.INST().graphene_plane_get_normal(asCPointer(), asCPointerNotNull(normal));
    }

    /**
     * Initializes the given &#35;graphene_plane_t using the given &#64;normal vector
     * <br>and &#64;constant values.
     * @param normal a unit length normal vector defining the plane   pointing towards the origin; if unset, we use the X axis by default
     * @param constant the distance from the origin to the plane along the   normal vector; the sign determines the half-space occupied by the   plane
     * @return the initialized plane
    */
    public Plane init(@Nullable Vec3 normal, float constant)  {
        return new Plane(new PointerContainer(JnaPlane.INST().graphene_plane_init(asCPointer(), asCPointer(normal), constant)));
    }

    /**
     * Initializes the given &#35;graphene_plane_t using the normal
     * <br>vector and constant of another &#35;graphene_plane_t.
     * @param src a &#35;graphene_plane_t
     * @return the initialized plane
    */
    public Plane initFromPlane(@Nonnull Plane src)  {
        return new Plane(new PointerContainer(JnaPlane.INST().graphene_plane_init_from_plane(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Initializes the given &#35;graphene_plane_t using the given normal vector
     * <br>and an arbitrary co-planar point.
     * @param normal a normal vector defining the plane pointing towards the origin
     * @param point a &#35;graphene_point3d_t
     * @return the initialized plane
    */
    public Plane initFromPoint(@Nonnull Vec3 normal, @Nonnull Point3D point)  {
        return new Plane(new PointerContainer(JnaPlane.INST().graphene_plane_init_from_point(asCPointer(), asCPointerNotNull(normal), asCPointerNotNull(point))));
    }

    /**
     * Initializes the given &#35;graphene_plane_t using the 3 provided co-planar
     * <br>points.
     * <br>
     * <br>The winding order is counter-clockwise, and determines which direction
     * <br>the normal vector will point.
     * @param a a &#35;graphene_point3d_t
     * @param b a &#35;graphene_point3d_t
     * @param c a &#35;graphene_point3d_t
     * @return the initialized plane
    */
    public Plane initFromPoints(@Nonnull Point3D a, @Nonnull Point3D b, @Nonnull Point3D c)  {
        return new Plane(new PointerContainer(JnaPlane.INST().graphene_plane_init_from_points(asCPointer(), asCPointerNotNull(a), asCPointerNotNull(b), asCPointerNotNull(c))));
    }

    /**
     * Initializes the given &#35;graphene_plane_t using the components of
     * <br>the given &#35;graphene_vec4_t vector.
     * @param src a &#35;graphene_vec4_t containing the normal vector in its first   three components, and the distance in its fourth component
     * @return the initialized plane
    */
    public Plane initFromVec4(@Nonnull Vec4 src)  {
        return new Plane(new PointerContainer(JnaPlane.INST().graphene_plane_init_from_vec4(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Negates the normal vector and constant of a &#35;graphene_plane_t, effectively
     * <br>mirroring the plane across the origin.
     * @param res return location for the negated plane
    */
    public void negate(@Nonnull Plane res)  {
        JnaPlane.INST().graphene_plane_negate(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Normalizes the vector of the given &#35;graphene_plane_t,
     * <br>and adjusts the constant accordingly.
     * @param res return location for the normalized plane
    */
    public void normalize(@Nonnull Plane res)  {
        JnaPlane.INST().graphene_plane_normalize(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Transforms a &#35;graphene_plane_t &#64;p using the given &#64;matrix
     * <br>and &#64;normal_matrix.
     * <br>
     * <br>If &#64;normal_matrix is %NULL, a transformation matrix for the plane
     * <br>normal will be computed from &#64;matrix. If you are transforming
     * <br>multiple planes using the same &#64;matrix it's recommended to compute
     * <br>the normal matrix beforehand to avoid incurring in the cost of
     * <br>recomputing it every time.
     * @param matrix a &#35;graphene_matrix_t
     * @param normal_matrix a &#35;graphene_matrix_t
     * @param res the transformed plane
    */
    public void transform(@Nonnull Matrix matrix, @Nullable Matrix normal_matrix, @Nonnull Plane res)  {
        JnaPlane.INST().graphene_plane_transform(asCPointer(), asCPointerNotNull(matrix), asCPointer(normal_matrix), asCPointerNotNull(res));
    }

    public static long getTypeID() { 
        return JnaPlane.INST().graphene_plane_get_type(); 
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
