/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A 3D volume delimited by 2D clip planes.
 * <br>
 * <br>The contents of the `graphene_frustum_t` are private, and should not be
 * <br>modified directly.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Frustum extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Frustum.class.getCanonicalName());
    }

    public Frustum(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Allocates a new &#35;graphene_frustum_t structure.
     * <br>
     * <br>The contents of the returned structure are undefined.
     * @return the newly allocated &#35;graphene_frustum_t   structure. Use graphene_frustum_free() to free the resources   allocated by this function.
    */
    public static Frustum allocFrustum()  {
        PointerContainer __self = cast(JnaFrustum.INST().graphene_frustum_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Frustum:alloc");
        }
        return new Frustum(__self);
    }        
    

    /**
     * Checks whether a point is inside the volume defined by the given
     * <br>&#35;graphene_frustum_t.
     * @param point a &#35;graphene_point3d_t
     * @return `true` if the point is inside the frustum
    */
    public boolean containsPoint(@Nonnull Point3D point)  {
        return JnaFrustum.INST().graphene_frustum_contains_point(asCPointer(), asCPointerNotNull(point));
    }

    /**
     * Checks whether the two given &#35;graphene_frustum_t are equal.
     * @param b a &#35;graphene_frustum_t
     * @return `true` if the given frustums are equal
    */
    public boolean equal(@Nonnull Frustum b)  {
        return JnaFrustum.INST().graphene_frustum_equal(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Frees the resources allocated by graphene_frustum_alloc().
    */
    public void free()  {
        JnaFrustum.INST().graphene_frustum_free(asCPointer());
    }

    /**
     * Initializes the given &#35;graphene_frustum_t using the provided
     * <br>clipping planes.
     * @param p0 a clipping plane
     * @param p1 a clipping plane
     * @param p2 a clipping plane
     * @param p3 a clipping plane
     * @param p4 a clipping plane
     * @param p5 a clipping plane
     * @return the initialized frustum
    */
    public Frustum init(@Nonnull Plane p0, @Nonnull Plane p1, @Nonnull Plane p2, @Nonnull Plane p3, @Nonnull Plane p4, @Nonnull Plane p5)  {
        return new Frustum(new PointerContainer(JnaFrustum.INST().graphene_frustum_init(asCPointer(), asCPointerNotNull(p0), asCPointerNotNull(p1), asCPointerNotNull(p2), asCPointerNotNull(p3), asCPointerNotNull(p4), asCPointerNotNull(p5))));
    }

    /**
     * Initializes the given &#35;graphene_frustum_t using the clipping
     * <br>planes of another &#35;graphene_frustum_t.
     * @param src a &#35;graphene_frustum_t
     * @return the initialized frustum
    */
    public Frustum initFromFrustum(@Nonnull Frustum src)  {
        return new Frustum(new PointerContainer(JnaFrustum.INST().graphene_frustum_init_from_frustum(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Initializes a &#35;graphene_frustum_t using the given &#64;matrix.
     * @param matrix a &#35;graphene_matrix_t
     * @return the initialized frustum
    */
    public Frustum initFromMatrix(@Nonnull Matrix matrix)  {
        return new Frustum(new PointerContainer(JnaFrustum.INST().graphene_frustum_init_from_matrix(asCPointer(), asCPointerNotNull(matrix))));
    }

    /**
     * Checks whether the given &#64;box intersects a plane of
     * <br>a &#35;graphene_frustum_t.
     * @param box a &#35;graphene_box_t
     * @return `true` if the box intersects the frustum
    */
    public boolean intersectsBox(@Nonnull Box box)  {
        return JnaFrustum.INST().graphene_frustum_intersects_box(asCPointer(), asCPointerNotNull(box));
    }

    /**
     * Checks whether the given &#64;sphere intersects a plane of
     * <br>a &#35;graphene_frustum_t.
     * @param sphere a &#35;graphene_sphere_t
     * @return `true` if the sphere intersects the frustum
    */
    public boolean intersectsSphere(@Nonnull Sphere sphere)  {
        return JnaFrustum.INST().graphene_frustum_intersects_sphere(asCPointer(), asCPointerNotNull(sphere));
    }

    public static long getTypeID() { 
        return JnaFrustum.INST().graphene_frustum_get_type(); 
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
some-fields-unsupported

[MethodModel:java-type-not-supported:getPlanes:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:graphene_plane_t*}}:{j:}]

[FieldModel:planes:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
