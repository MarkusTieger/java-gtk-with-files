/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A 3D box, described as the volume between a minimum and
 * <br>a maximum vertices.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Box extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Box.class.getCanonicalName());
    }

    public Box(PointerContainer pointer) {
        super(pointer);
    }

    public Box() {
        super(cast(JnaBox.allocateStructure()));
    }

    private JnaBox.Fields _fields;
    
    JnaBox.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaBox.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String MIN = "min";

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String MAX = "max";

    /**
     * Allocates a new &#35;graphene_box_t.
     * <br>
     * <br>The contents of the returned structure are undefined.
     * @return the newly allocated &#35;graphene_box_t structure.   Use graphene_box_free() to free the resources allocated by this function
    */
    public static Box allocBox()  {
        PointerContainer __self = cast(JnaBox.INST().graphene_box_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Box:alloc");
        }
        return new Box(__self);
    }        
    

    /**
     * Checks whether the &#35;graphene_box_t &#64;a contains the given
     * <br>&#35;graphene_box_t &#64;b.
     * @param b a &#35;graphene_box_t
     * @return `true` if the box is contained in the given box
    */
    public boolean containsBox(@Nonnull Box b)  {
        return JnaBox.INST().graphene_box_contains_box(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Checks whether &#64;box contains the given &#64;point.
     * @param point the coordinates to check
     * @return `true` if the point is contained in the given box
    */
    public boolean containsPoint(@Nonnull Point3D point)  {
        return JnaBox.INST().graphene_box_contains_point(asCPointer(), asCPointerNotNull(point));
    }

    /**
     * Checks whether the two given boxes are equal.
     * @param b a &#35;graphene_box_t
     * @return `true` if the boxes are equal
    */
    public boolean equal(@Nonnull Box b)  {
        return JnaBox.INST().graphene_box_equal(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Expands the dimensions of &#64;box to include the coordinates at &#64;point.
     * @param point the coordinates of the point to include
     * @param res return location for the expanded box
    */
    public void expand(@Nonnull Point3D point, @Nonnull Box res)  {
        JnaBox.INST().graphene_box_expand(asCPointer(), asCPointerNotNull(point), asCPointerNotNull(res));
    }

    /**
     * Expands the dimensions of &#64;box by the given &#64;scalar value.
     * <br>
     * <br>If &#64;scalar is positive, the &#35;graphene_box_t will grow; if &#64;scalar is
     * <br>negative, the &#35;graphene_box_t will shrink.
     * @param scalar a scalar value
     * @param res return location for the expanded box
    */
    public void expandScalar(float scalar, @Nonnull Box res)  {
        JnaBox.INST().graphene_box_expand_scalar(asCPointer(), scalar, asCPointerNotNull(res));
    }

    /**
     * Expands the dimensions of &#64;box to include the coordinates of the
     * <br>given vector.
     * @param vec the coordinates of the point to include, as a &#35;graphene_vec3_t
     * @param res return location for the expanded box
    */
    public void expandVec3(@Nonnull Vec3 vec, @Nonnull Box res)  {
        JnaBox.INST().graphene_box_expand_vec3(asCPointer(), asCPointerNotNull(vec), asCPointerNotNull(res));
    }

    /**
     * Frees the resources allocated by graphene_box_alloc().
    */
    public void free()  {
        JnaBox.INST().graphene_box_free(asCPointer());
    }

    /**
     * Computes the bounding &#35;graphene_sphere_t capable of containing the given
     * <br>&#35;graphene_box_t.
     * @param sphere return location for the bounding sphere
    */
    public void getBoundingSphere(@Nonnull Sphere sphere)  {
        JnaBox.INST().graphene_box_get_bounding_sphere(asCPointer(), asCPointerNotNull(sphere));
    }

    /**
     * Retrieves the coordinates of the center of a &#35;graphene_box_t.
     * @param center return location for the coordinates of   the center
    */
    public void getCenter(@Nonnull Point3D center)  {
        JnaBox.INST().graphene_box_get_center(asCPointer(), asCPointerNotNull(center));
    }

    /**
     * Retrieves the size of the &#64;box on the Z axis.
     * @return the depth of the box
    */
    public float getDepth()  {
        return JnaBox.INST().graphene_box_get_depth(asCPointer());
    }

    /**
     * Retrieves the size of the &#64;box on the Y axis.
     * @return the height of the box
    */
    public float getHeight()  {
        return JnaBox.INST().graphene_box_get_height(asCPointer());
    }

    /**
     * Retrieves the coordinates of the maximum point of the given
     * <br>&#35;graphene_box_t.
     * @param max return location for the maximum point
    */
    public void getMax(@Nonnull Point3D max)  {
        JnaBox.INST().graphene_box_get_max(asCPointer(), asCPointerNotNull(max));
    }

    /**
     * Retrieves the coordinates of the minimum point of the given
     * <br>&#35;graphene_box_t.
     * @param min return location for the minimum point
    */
    public void getMin(@Nonnull Point3D min)  {
        JnaBox.INST().graphene_box_get_min(asCPointer(), asCPointerNotNull(min));
    }

    /**
     * Retrieves the size of the box on all three axes, and stores
     * <br>it into the given &#64;size vector.
     * @param size return location for the size
    */
    public void getSize(@Nonnull Vec3 size)  {
        JnaBox.INST().graphene_box_get_size(asCPointer(), asCPointerNotNull(size));
    }

    /**
     * Retrieves the size of the &#64;box on the X axis.
     * @return the width of the box
    */
    public float getWidth()  {
        return JnaBox.INST().graphene_box_get_width(asCPointer());
    }

    /**
     * Initializes the given &#35;graphene_box_t with two vertices.
     * @param min the coordinates of the minimum vertex
     * @param max the coordinates of the maximum vertex
     * @return the initialized &#35;graphene_box_t
    */
    public Box init(@Nullable Point3D min, @Nullable Point3D max)  {
        return new Box(new PointerContainer(JnaBox.INST().graphene_box_init(asCPointer(), asCPointer(min), asCPointer(max))));
    }

    /**
     * Initializes the given &#35;graphene_box_t with the vertices of
     * <br>another &#35;graphene_box_t.
     * @param src a &#35;graphene_box_t
     * @return the initialized &#35;graphene_box_t
    */
    public Box initFromBox(@Nonnull Box src)  {
        return new Box(new PointerContainer(JnaBox.INST().graphene_box_init_from_box(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Initializes the given &#35;graphene_box_t with two vertices
     * <br>stored inside &#35;graphene_vec3_t.
     * @param min the coordinates of the minimum vertex
     * @param max the coordinates of the maximum vertex
     * @return the initialized &#35;graphene_box_t
    */
    public Box initFromVec3(@Nullable Vec3 min, @Nullable Vec3 max)  {
        return new Box(new PointerContainer(JnaBox.INST().graphene_box_init_from_vec3(asCPointer(), asCPointer(min), asCPointer(max))));
    }

    /**
     * Intersects the two given &#35;graphene_box_t.
     * <br>
     * <br>If the two boxes do not intersect, &#64;res will contain a degenerate box
     * <br>initialized with graphene_box_empty().
     * @param b a &#35;graphene_box_t
     * @param res return location for the result
     * @return true if the two boxes intersect
    */
    public boolean intersection(@Nonnull Box b, @Nullable Box res)  {
        return JnaBox.INST().graphene_box_intersection(asCPointer(), asCPointerNotNull(b), asCPointer(res));
    }

    /**
     * Unions the two given &#35;graphene_box_t.
     * @param b the box to union to &#64;a
     * @param res return location for the result
    */
    public void union(@Nonnull Box b, @Nonnull Box res)  {
        JnaBox.INST().graphene_box_union(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * A degenerate &#35;graphene_box_t that can only be expanded.
     * <br>
     * <br>The returned value is owned by Graphene and should not be modified or freed.
     * @return a &#35;graphene_box_t
    */
    public static Box empty()  {
        return new Box(new PointerContainer(JnaBox.INST().graphene_box_empty()));
    }

    /**
     * A degenerate &#35;graphene_box_t that cannot be expanded.
     * <br>
     * <br>The returned value is owned by Graphene and should not be modified or freed.
     * @return a &#35;graphene_box_t
    */
    public static Box infinite()  {
        return new Box(new PointerContainer(JnaBox.INST().graphene_box_infinite()));
    }

    /**
     * A &#35;graphene_box_t with the minimum vertex set at (-1, -1, -1) and the
     * <br>maximum vertex set at (0, 0, 0).
     * <br>
     * <br>The returned value is owned by Graphene and should not be modified or freed.
     * @return a &#35;graphene_box_t
    */
    public static Box minusOne()  {
        return new Box(new PointerContainer(JnaBox.INST().graphene_box_minus_one()));
    }

    /**
     * A &#35;graphene_box_t with the minimum vertex set at (0, 0, 0) and the
     * <br>maximum vertex set at (1, 1, 1).
     * <br>
     * <br>The returned value is owned by Graphene and should not be modified or freed.
     * @return a &#35;graphene_box_t
    */
    public static Box one()  {
        return new Box(new PointerContainer(JnaBox.INST().graphene_box_one()));
    }

    /**
     * A &#35;graphene_box_t with the minimum vertex set at (-1, -1, -1) and the
     * <br>maximum vertex set at (1, 1, 1).
     * <br>
     * <br>The returned value is owned by Graphene and should not be modified or freed.
     * @return a &#35;graphene_box_t
    */
    public static Box oneMinusOne()  {
        return new Box(new PointerContainer(JnaBox.INST().graphene_box_one_minus_one()));
    }

    /**
     * A &#35;graphene_box_t with both the minimum and maximum vertices set at (0, 0, 0).
     * <br>
     * <br>The returned value is owned by Graphene and should not be modified or freed.
     * @return a &#35;graphene_box_t
    */
    public static Box zero()  {
        return new Box(new PointerContainer(JnaBox.INST().graphene_box_zero()));
    }

    public static long getTypeID() { 
        return JnaBox.INST().graphene_box_get_type(); 
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
        [ParameterModel:java-type-not-supported:{G_::{c:graphene_vec3_t*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:initFromPoints:[ParameterModel:Supported:{Gg:Box:{c:graphene_box_t*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:unsigned int}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const graphene_point3d_t*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:initFromVectors:[ParameterModel:Supported:{Gg:Box:{c:graphene_box_t*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:unsigned int}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const graphene_vec3_t*}}:{j:}]
*/
