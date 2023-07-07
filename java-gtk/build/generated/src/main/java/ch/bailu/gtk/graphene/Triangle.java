/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A triangle.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Triangle extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Triangle.class.getCanonicalName());
    }

    public Triangle(PointerContainer pointer) {
        super(pointer);
    }

    public Triangle() {
        super(cast(JnaTriangle.allocateStructure()));
    }

    private JnaTriangle.Fields _fields;
    
    JnaTriangle.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTriangle.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String A = "a";

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String B = "b";

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String C = "c";

    /**
     * Allocates a new &#35;graphene_triangle_t.
     * <br>
     * <br>The contents of the returned structure are undefined.
     * @return the newly allocated &#35;graphene_triangle_t   structure. Use graphene_triangle_free() to free the resources   allocated by this function
    */
    public static Triangle allocTriangle()  {
        PointerContainer __self = cast(JnaTriangle.INST().graphene_triangle_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Triangle:alloc");
        }
        return new Triangle(__self);
    }        
    

    /**
     * Checks whether the given triangle &#64;t contains the point &#64;p.
     * @param p a &#35;graphene_point3d_t
     * @return `true` if the point is inside the triangle
    */
    public boolean containsPoint(@Nonnull Point3D p)  {
        return JnaTriangle.INST().graphene_triangle_contains_point(asCPointer(), asCPointerNotNull(p));
    }

    /**
     * Checks whether the two given &#35;graphene_triangle_t are equal.
     * @param b a &#35;graphene_triangle_t
     * @return `true` if the triangles are equal
    */
    public boolean equal(@Nonnull Triangle b)  {
        return JnaTriangle.INST().graphene_triangle_equal(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Frees the resources allocated by graphene_triangle_alloc().
    */
    public void free()  {
        JnaTriangle.INST().graphene_triangle_free(asCPointer());
    }

    /**
     * Computes the area of the given &#35;graphene_triangle_t.
     * @return the area of the triangle
    */
    public float getArea()  {
        return JnaTriangle.INST().graphene_triangle_get_area(asCPointer());
    }

    /**
     * Computes the [barycentric coordinates](http://en.wikipedia.org/wiki/Barycentric_coordinate_system)
     * <br>of the given point &#64;p.
     * <br>
     * <br>The point &#64;p must lie on the same plane as the triangle &#64;t; if the
     * <br>point is not coplanar, the result of this function is undefined.
     * <br>
     * <br>If we place the origin in the coordinates of the triangle's A point,
     * <br>the barycentric coordinates are `u`, which is on the AC vector; and `v`
     * <br>which is on the AB vector:
     * <br>
     * <br>![](triangle-barycentric.png)
     * <br>
     * <br>The returned &#35;graphene_vec2_t contains the following values, in order:
     * <br>
     * <br> - `res.x = u`
     * <br> - `res.y = v`
     * @param p a &#35;graphene_point3d_t
     * @param res return location for the vector   with the barycentric coordinates
     * @return `true` if the barycentric coordinates are valid
    */
    public boolean getBarycoords(@Nullable Point3D p, @Nonnull Vec2 res)  {
        return JnaTriangle.INST().graphene_triangle_get_barycoords(asCPointer(), asCPointer(p), asCPointerNotNull(res));
    }

    /**
     * Computes the bounding box of the given &#35;graphene_triangle_t.
     * @param res return location for the box
    */
    public void getBoundingBox(@Nonnull Box res)  {
        JnaTriangle.INST().graphene_triangle_get_bounding_box(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Computes the coordinates of the midpoint of the given &#35;graphene_triangle_t.
     * <br>
     * <br>The midpoint G is the [centroid](https://en.wikipedia.org/wiki/Centroid&#35;Triangle_centroid)
     * <br>of the triangle, i.e. the intersection of its medians.
     * @param res return location for the coordinates of   the midpoint
    */
    public void getMidpoint(@Nonnull Point3D res)  {
        JnaTriangle.INST().graphene_triangle_get_midpoint(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Computes the normal vector of the given &#35;graphene_triangle_t.
     * @param res return location for the normal vector
    */
    public void getNormal(@Nonnull Vec3 res)  {
        JnaTriangle.INST().graphene_triangle_get_normal(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Computes the plane based on the vertices of the given &#35;graphene_triangle_t.
     * @param res return location for the plane
    */
    public void getPlane(@Nonnull Plane res)  {
        JnaTriangle.INST().graphene_triangle_get_plane(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Retrieves the three vertices of the given &#35;graphene_triangle_t and returns
     * <br>their coordinates as &#35;graphene_point3d_t.
     * @param a return location for the coordinates   of the first vertex
     * @param b return location for the coordinates   of the second vertex
     * @param c return location for the coordinates   of the third vertex
    */
    public void getPoints(@Nullable Point3D a, @Nullable Point3D b, @Nullable Point3D c)  {
        JnaTriangle.INST().graphene_triangle_get_points(asCPointer(), asCPointer(a), asCPointer(b), asCPointer(c));
    }

    /**
     * Computes the UV coordinates of the given point &#64;p.
     * <br>
     * <br>The point &#64;p must lie on the same plane as the triangle &#64;t; if the point
     * <br>is not coplanar, the result of this function is undefined. If &#64;p is %NULL,
     * <br>the point will be set in (0, 0, 0).
     * <br>
     * <br>The UV coordinates will be placed in the &#64;res vector:
     * <br>
     * <br> - `res.x = u`
     * <br> - `res.y = v`
     * <br>
     * <br>See also: graphene_triangle_get_barycoords()
     * @param p a &#35;graphene_point3d_t
     * @param uv_a the UV coordinates of the first point
     * @param uv_b the UV coordinates of the second point
     * @param uv_c the UV coordinates of the third point
     * @param res a vector containing the UV coordinates   of the given point &#64;p
     * @return `true` if the coordinates are valid
    */
    public boolean getUv(@Nullable Point3D p, @Nonnull Vec2 uv_a, @Nonnull Vec2 uv_b, @Nonnull Vec2 uv_c, @Nonnull Vec2 res)  {
        return JnaTriangle.INST().graphene_triangle_get_uv(asCPointer(), asCPointer(p), asCPointerNotNull(uv_a), asCPointerNotNull(uv_b), asCPointerNotNull(uv_c), asCPointerNotNull(res));
    }

    /**
     * Retrieves the three vertices of the given &#35;graphene_triangle_t.
     * @param a return location for the first vertex
     * @param b return location for the second vertex
     * @param c return location for the third vertex
    */
    public void getVertices(@Nullable Vec3 a, @Nullable Vec3 b, @Nullable Vec3 c)  {
        JnaTriangle.INST().graphene_triangle_get_vertices(asCPointer(), asCPointer(a), asCPointer(b), asCPointer(c));
    }

    /**
     * Initializes a &#35;graphene_triangle_t using the three given 3D points.
     * @param a a &#35;graphene_point3d_t
     * @param b a &#35;graphene_point3d_t
     * @param c a &#35;graphene_point3d_t
     * @return the initialized &#35;graphene_triangle_t
    */
    public Triangle initFromPoint3d(@Nullable Point3D a, @Nullable Point3D b, @Nullable Point3D c)  {
        return new Triangle(new PointerContainer(JnaTriangle.INST().graphene_triangle_init_from_point3d(asCPointer(), asCPointer(a), asCPointer(b), asCPointer(c))));
    }

    /**
     * Initializes a &#35;graphene_triangle_t using the three given vectors.
     * @param a a &#35;graphene_vec3_t
     * @param b a &#35;graphene_vec3_t
     * @param c a &#35;graphene_vec3_t
     * @return the initialized &#35;graphene_triangle_t
    */
    public Triangle initFromVec3(@Nullable Vec3 a, @Nullable Vec3 b, @Nullable Vec3 c)  {
        return new Triangle(new PointerContainer(JnaTriangle.INST().graphene_triangle_init_from_vec3(asCPointer(), asCPointer(a), asCPointer(b), asCPointer(c))));
    }

    public static long getTypeID() { 
        return JnaTriangle.INST().graphene_triangle_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:initFromFloat:[ParameterModel:Supported:{Gg:Triangle:{c:graphene_triangle_t*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const float*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const float*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const float*}}:{j:}]
*/
