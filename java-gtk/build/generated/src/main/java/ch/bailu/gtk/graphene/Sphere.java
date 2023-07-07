/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A sphere, represented by its center and radius.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Sphere extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Sphere.class.getCanonicalName());
    }

    public Sphere(PointerContainer pointer) {
        super(pointer);
    }

    public Sphere() {
        super(cast(JnaSphere.allocateStructure()));
    }

    private JnaSphere.Fields _fields;
    
    JnaSphere.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSphere.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String CENTER = "center";

    /**
     * 
    */
    public static final String RADIUS = "radius";

    /**
     * 
    */
    public float getFieldRadius() {
       toFields().readField(RADIUS);
       return toFields().radius;
    } 

    /**
     * Allocates a new &#35;graphene_sphere_t.
     * <br>
     * <br>The contents of the newly allocated structure are undefined.
     * @return the newly allocated &#35;graphene_sphere_t. Use   graphene_sphere_free() to free the resources allocated by this function
    */
    public static Sphere allocSphere()  {
        PointerContainer __self = cast(JnaSphere.INST().graphene_sphere_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Sphere:alloc");
        }
        return new Sphere(__self);
    }        
    

    /**
     * Checks whether the given &#64;point is contained in the volume
     * <br>of a &#35;graphene_sphere_t.
     * @param point a &#35;graphene_point3d_t
     * @return `true` if the sphere contains the point
    */
    public boolean containsPoint(@Nonnull Point3D point)  {
        return JnaSphere.INST().graphene_sphere_contains_point(asCPointer(), asCPointerNotNull(point));
    }

    /**
     * Computes the distance of the given &#64;point from the surface of
     * <br>a &#35;graphene_sphere_t.
     * @param point a &#35;graphene_point3d_t
     * @return the distance of the point
    */
    public float distance(@Nonnull Point3D point)  {
        return JnaSphere.INST().graphene_sphere_distance(asCPointer(), asCPointerNotNull(point));
    }

    /**
     * Checks whether two &#35;graphene_sphere_t are equal.
     * @param b a &#35;graphene_sphere_t
     * @return `true` if the spheres are equal
    */
    public boolean equal(@Nonnull Sphere b)  {
        return JnaSphere.INST().graphene_sphere_equal(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Frees the resources allocated by graphene_sphere_alloc().
    */
    public void free()  {
        JnaSphere.INST().graphene_sphere_free(asCPointer());
    }

    /**
     * Computes the bounding box capable of containing the
     * <br>given &#35;graphene_sphere_t.
     * @param box return location for the bounding box
    */
    public void getBoundingBox(@Nonnull Box box)  {
        JnaSphere.INST().graphene_sphere_get_bounding_box(asCPointer(), asCPointerNotNull(box));
    }

    /**
     * Retrieves the coordinates of the center of a &#35;graphene_sphere_t.
     * @param center return location for the coordinates of   the center
    */
    public void getCenter(@Nonnull Point3D center)  {
        JnaSphere.INST().graphene_sphere_get_center(asCPointer(), asCPointerNotNull(center));
    }

    /**
     * Retrieves the radius of a &#35;graphene_sphere_t.
     * @return 
    */
    public float getRadius()  {
        return JnaSphere.INST().graphene_sphere_get_radius(asCPointer());
    }

    /**
     * Initializes the given &#35;graphene_sphere_t with the given &#64;center and &#64;radius.
     * @param center the coordinates of the center of the sphere, or %NULL   for a center in (0, 0, 0)
     * @param radius the radius of the sphere
     * @return the initialized &#35;graphene_sphere_t
    */
    public Sphere init(@Nullable Point3D center, float radius)  {
        return new Sphere(new PointerContainer(JnaSphere.INST().graphene_sphere_init(asCPointer(), asCPointer(center), radius)));
    }

    /**
     * Checks whether the sphere has a zero radius.
     * @return `true` if the sphere is empty
    */
    public boolean isEmpty()  {
        return JnaSphere.INST().graphene_sphere_is_empty(asCPointer());
    }

    /**
     * Translates the center of the given &#35;graphene_sphere_t using the &#64;point
     * <br>coordinates as the delta of the translation.
     * @param point the coordinates of the translation
     * @param res return location for the translated sphere
    */
    public void translate(@Nonnull Point3D point, @Nonnull Sphere res)  {
        JnaSphere.INST().graphene_sphere_translate(asCPointer(), asCPointerNotNull(point), asCPointerNotNull(res));
    }

    public static long getTypeID() { 
        return JnaSphere.INST().graphene_sphere_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:initFromPoints:[ParameterModel:Supported:{Gg:Sphere:{c:graphene_sphere_t*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:unsigned int}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const graphene_point3d_t*}}:{j:}]
        [ParameterModel:Supported:{Gg:Point3D:{c:const graphene_point3d_t*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:initFromVectors:[ParameterModel:Supported:{Gg:Sphere:{c:graphene_sphere_t*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:unsigned int}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const graphene_vec3_t*}}:{j:}]
        [ParameterModel:Supported:{Gg:Point3D:{c:const graphene_point3d_t*}}:{j:long}]
*/
