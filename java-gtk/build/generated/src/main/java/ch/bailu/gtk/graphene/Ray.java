/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A ray emitted from an origin in a given direction.
 * <br>
 * <br>The contents of the `graphene_ray_t` structure are private, and should not
 * <br>be modified directly.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Ray extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Ray.class.getCanonicalName());
    }

    public Ray(PointerContainer pointer) {
        super(pointer);
    }

    public Ray() {
        super(cast(JnaRay.allocateStructure()));
    }

    private JnaRay.Fields _fields;
    
    JnaRay.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRay.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String ORIGIN = "origin";

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String DIRECTION = "direction";

    /**
     * Allocates a new &#35;graphene_ray_t structure.
     * <br>
     * <br>The contents of the returned structure are undefined.
     * @return the newly allocated &#35;graphene_ray_t.   Use graphene_ray_free() to free the resources allocated by   this function
    */
    public static Ray allocRay()  {
        PointerContainer __self = cast(JnaRay.INST().graphene_ray_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Ray:alloc");
        }
        return new Ray(__self);
    }        
    

    /**
     * Checks whether the two given &#35;graphene_ray_t are equal.
     * @param b a &#35;graphene_ray_t
     * @return `true` if the given rays are equal
    */
    public boolean equal(@Nonnull Ray b)  {
        return JnaRay.INST().graphene_ray_equal(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Frees the resources allocated by graphene_ray_alloc().
    */
    public void free()  {
        JnaRay.INST().graphene_ray_free(asCPointer());
    }

    /**
     * Computes the point on the given &#35;graphene_ray_t that is closest to the
     * <br>given point &#64;p.
     * @param p a &#35;graphene_point3d_t
     * @param res return location for the closest point3d
    */
    public void getClosestPointToPoint(@Nonnull Point3D p, @Nonnull Point3D res)  {
        JnaRay.INST().graphene_ray_get_closest_point_to_point(asCPointer(), asCPointerNotNull(p), asCPointerNotNull(res));
    }

    /**
     * Retrieves the direction of the given &#35;graphene_ray_t.
     * @param direction return location for the direction
    */
    public void getDirection(@Nonnull Vec3 direction)  {
        JnaRay.INST().graphene_ray_get_direction(asCPointer(), asCPointerNotNull(direction));
    }

    /**
     * Computes the distance of the origin of the given &#35;graphene_ray_t from the
     * <br>given plane.
     * <br>
     * <br>If the ray does not intersect the plane, this function returns `INFINITY`.
     * @param p a &#35;graphene_plane_t
     * @return the distance of the origin of the ray from the plane
    */
    public float getDistanceToPlane(@Nonnull Plane p)  {
        return JnaRay.INST().graphene_ray_get_distance_to_plane(asCPointer(), asCPointerNotNull(p));
    }

    /**
     * Computes the distance of the closest approach between the
     * <br>given &#35;graphene_ray_t &#64;r and the point &#64;p.
     * <br>
     * <br>The closest approach to a ray from a point is the distance
     * <br>between the point and the projection of the point on the
     * <br>ray itself.
     * @param p a &#35;graphene_point3d_t
     * @return the distance of the point
    */
    public float getDistanceToPoint(@Nonnull Point3D p)  {
        return JnaRay.INST().graphene_ray_get_distance_to_point(asCPointer(), asCPointerNotNull(p));
    }

    /**
     * Retrieves the origin of the given &#35;graphene_ray_t.
     * @param origin return location for the origin
    */
    public void getOrigin(@Nonnull Point3D origin)  {
        JnaRay.INST().graphene_ray_get_origin(asCPointer(), asCPointerNotNull(origin));
    }

    /**
     * Retrieves the coordinates of a point at the distance &#64;t along the
     * <br>given &#35;graphene_ray_t.
     * @param t the distance along the ray
     * @param position return location for the position
    */
    public void getPositionAt(float t, @Nonnull Point3D position)  {
        JnaRay.INST().graphene_ray_get_position_at(asCPointer(), t, asCPointerNotNull(position));
    }

    /**
     * Initializes the given &#35;graphene_ray_t using the given &#64;origin
     * <br>and &#64;direction values.
     * @param origin the origin of the ray
     * @param direction the direction vector
     * @return the initialized ray
    */
    public Ray init(@Nullable Point3D origin, @Nullable Vec3 direction)  {
        return new Ray(new PointerContainer(JnaRay.INST().graphene_ray_init(asCPointer(), asCPointer(origin), asCPointer(direction))));
    }

    /**
     * Initializes the given &#35;graphene_ray_t using the origin and direction
     * <br>values of another &#35;graphene_ray_t.
     * @param src a &#35;graphene_ray_t
     * @return the initialized ray
    */
    public Ray initFromRay(@Nonnull Ray src)  {
        return new Ray(new PointerContainer(JnaRay.INST().graphene_ray_init_from_ray(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Initializes the given &#35;graphene_ray_t using the given vectors.
     * @param origin a &#35;graphene_vec3_t
     * @param direction a &#35;graphene_vec3_t
     * @return the initialized ray
    */
    public Ray initFromVec3(@Nullable Vec3 origin, @Nullable Vec3 direction)  {
        return new Ray(new PointerContainer(JnaRay.INST().graphene_ray_init_from_vec3(asCPointer(), asCPointer(origin), asCPointer(direction))));
    }

    /**
     * Intersects the given &#35;graphene_ray_t &#64;r with the given
     * <br>&#35;graphene_box_t &#64;b.
     * @param b a &#35;graphene_box_t
     * @param t_out the distance of the point on the ray that intersects the box
     * @return the type of intersection
    */
    public int intersectBox(@Nonnull Box b, @Nonnull ch.bailu.gtk.type.Flt t_out)  {
        return JnaRay.INST().graphene_ray_intersect_box(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(t_out));
    }

    /**
     * Intersects the given &#35;graphene_ray_t &#64;r with the given
     * <br>&#35;graphene_sphere_t &#64;s.
     * @param s a &#35;graphene_sphere_t
     * @param t_out the distance of the point on the ray that intersects the sphere
     * @return the type of intersection
    */
    public int intersectSphere(@Nonnull Sphere s, @Nonnull ch.bailu.gtk.type.Flt t_out)  {
        return JnaRay.INST().graphene_ray_intersect_sphere(asCPointer(), asCPointerNotNull(s), asCPointerNotNull(t_out));
    }

    /**
     * Intersects the given &#35;graphene_ray_t &#64;r with the given
     * <br>&#35;graphene_triangle_t &#64;t.
     * @param t a &#35;graphene_triangle_t
     * @param t_out the distance of the point on the ray that intersects the triangle
     * @return the type of intersection
    */
    public int intersectTriangle(@Nonnull Triangle t, @Nonnull ch.bailu.gtk.type.Flt t_out)  {
        return JnaRay.INST().graphene_ray_intersect_triangle(asCPointer(), asCPointerNotNull(t), asCPointerNotNull(t_out));
    }

    /**
     * Checks whether the given &#35;graphene_ray_t &#64;r intersects the
     * <br>given &#35;graphene_box_t &#64;b.
     * <br>
     * <br>See also: graphene_ray_intersect_box()
     * @param b a &#35;graphene_box_t
     * @return `true` if the ray intersects the box
    */
    public boolean intersectsBox(@Nonnull Box b)  {
        return JnaRay.INST().graphene_ray_intersects_box(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Checks if the given &#35;graphene_ray_t &#64;r intersects the
     * <br>given &#35;graphene_sphere_t &#64;s.
     * <br>
     * <br>See also: graphene_ray_intersect_sphere()
     * @param s a &#35;graphene_sphere_t
     * @return `true` if the ray intersects the sphere
    */
    public boolean intersectsSphere(@Nonnull Sphere s)  {
        return JnaRay.INST().graphene_ray_intersects_sphere(asCPointer(), asCPointerNotNull(s));
    }

    /**
     * Checks whether the given &#35;graphene_ray_t &#64;r intersects the
     * <br>given &#35;graphene_triangle_t &#64;b.
     * <br>
     * <br>See also: graphene_ray_intersect_triangle()
     * @param t a &#35;graphene_triangle_t
     * @return `true` if the ray intersects the triangle
    */
    public boolean intersectsTriangle(@Nonnull Triangle t)  {
        return JnaRay.INST().graphene_ray_intersects_triangle(asCPointer(), asCPointerNotNull(t));
    }

    public static long getTypeID() { 
        return JnaRay.INST().graphene_ray_get_type(); 
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
