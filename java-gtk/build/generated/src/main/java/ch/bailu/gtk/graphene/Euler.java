/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Describe a rotation using Euler angles.
 * <br>
 * <br>The contents of the &#35;graphene_euler_t structure are private
 * <br>and should never be accessed directly.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Euler extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Euler.class.getCanonicalName());
    }

    public Euler(PointerContainer pointer) {
        super(pointer);
    }

    public Euler() {
        super(cast(JnaEuler.allocateStructure()));
    }

    private JnaEuler.Fields _fields;
    
    JnaEuler.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaEuler.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String ANGLES = "angles";

    /**
     * 
    */
    public static final String ORDER = "order";

    /**
     * 
    */
    public int getFieldOrder() {
       toFields().readField(ORDER);
       return toFields().order;
    } 

    /**
     * Allocates a new &#35;graphene_euler_t.
     * <br>
     * <br>The contents of the returned structure are undefined.
     * @return the newly allocated &#35;graphene_euler_t
    */
    public static Euler allocEuler()  {
        PointerContainer __self = cast(JnaEuler.INST().graphene_euler_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Euler:alloc");
        }
        return new Euler(__self);
    }        
    

    /**
     * Checks if two &#35;graphene_euler_t are equal.
     * @param b a &#35;graphene_euler_t
     * @return `true` if the two &#35;graphene_euler_t are equal
    */
    public boolean equal(@Nonnull Euler b)  {
        return JnaEuler.INST().graphene_euler_equal(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Frees the resources allocated by graphene_euler_alloc().
    */
    public void free()  {
        JnaEuler.INST().graphene_euler_free(asCPointer());
    }

    /**
     * Retrieves the first component of the Euler angle vector,
     * <br>depending on the order of rotation.
     * <br>
     * <br>See also: graphene_euler_get_x()
     * @return the first component of the Euler angle vector, in radians
    */
    public float getAlpha()  {
        return JnaEuler.INST().graphene_euler_get_alpha(asCPointer());
    }

    /**
     * Retrieves the second component of the Euler angle vector,
     * <br>depending on the order of rotation.
     * <br>
     * <br>See also: graphene_euler_get_y()
     * @return the second component of the Euler angle vector, in radians
    */
    public float getBeta()  {
        return JnaEuler.INST().graphene_euler_get_beta(asCPointer());
    }

    /**
     * Retrieves the third component of the Euler angle vector,
     * <br>depending on the order of rotation.
     * <br>
     * <br>See also: graphene_euler_get_z()
     * @return the third component of the Euler angle vector, in radians
    */
    public float getGamma()  {
        return JnaEuler.INST().graphene_euler_get_gamma(asCPointer());
    }

    /**
     * Retrieves the order used to apply the rotations described in the
     * <br>&#35;graphene_euler_t structure, when converting to and from other
     * <br>structures, like &#35;graphene_quaternion_t and &#35;graphene_matrix_t.
     * <br>
     * <br>This function does not return the %GRAPHENE_EULER_ORDER_DEFAULT
     * <br>enumeration value; it will return the effective order of rotation
     * <br>instead.
     * @return the order used to apply the rotations
    */
    public int getOrder()  {
        return JnaEuler.INST().graphene_euler_get_order(asCPointer());
    }

    /**
     * Retrieves the rotation angle on the X axis, in degrees.
     * @return the rotation angle
    */
    public float getX()  {
        return JnaEuler.INST().graphene_euler_get_x(asCPointer());
    }

    /**
     * Retrieves the rotation angle on the Y axis, in degrees.
     * @return the rotation angle
    */
    public float getY()  {
        return JnaEuler.INST().graphene_euler_get_y(asCPointer());
    }

    /**
     * Retrieves the rotation angle on the Z axis, in degrees.
     * @return the rotation angle
    */
    public float getZ()  {
        return JnaEuler.INST().graphene_euler_get_z(asCPointer());
    }

    /**
     * Initializes a &#35;graphene_euler_t using the given angles.
     * <br>
     * <br>The order of the rotations is %GRAPHENE_EULER_ORDER_DEFAULT.
     * @param x rotation angle on the X axis, in degrees
     * @param y rotation angle on the Y axis, in degrees
     * @param z rotation angle on the Z axis, in degrees
     * @return the initialized &#35;graphene_euler_t
    */
    public Euler init(float x, float y, float z)  {
        return new Euler(new PointerContainer(JnaEuler.INST().graphene_euler_init(asCPointer(), x, y, z)));
    }

    /**
     * Initializes a &#35;graphene_euler_t using the angles and order of
     * <br>another &#35;graphene_euler_t.
     * <br>
     * <br>If the &#35;graphene_euler_t &#64;src is %NULL, this function is equivalent
     * <br>to calling graphene_euler_init() with all angles set to 0.
     * @param src a &#35;graphene_euler_t
     * @return the initialized &#35;graphene_euler_t
    */
    public Euler initFromEuler(@Nullable Euler src)  {
        return new Euler(new PointerContainer(JnaEuler.INST().graphene_euler_init_from_euler(asCPointer(), asCPointer(src))));
    }

    /**
     * Initializes a &#35;graphene_euler_t using the given rotation matrix.
     * <br>
     * <br>If the &#35;graphene_matrix_t &#64;m is %NULL, the &#35;graphene_euler_t will
     * <br>be initialized with all angles set to 0.
     * @param m a rotation matrix
     * @param order the order used to apply the rotations
     * @return the initialized &#35;graphene_euler_t
    */
    public Euler initFromMatrix(@Nullable Matrix m, int order)  {
        return new Euler(new PointerContainer(JnaEuler.INST().graphene_euler_init_from_matrix(asCPointer(), asCPointer(m), order)));
    }

    /**
     * Initializes a &#35;graphene_euler_t using the given normalized quaternion.
     * <br>
     * <br>If the &#35;graphene_quaternion_t &#64;q is %NULL, the &#35;graphene_euler_t will
     * <br>be initialized with all angles set to 0.
     * @param q a normalized &#35;graphene_quaternion_t
     * @param order the order used to apply the rotations
     * @return the initialized &#35;graphene_euler_t
    */
    public Euler initFromQuaternion(@Nullable Quaternion q, int order)  {
        return new Euler(new PointerContainer(JnaEuler.INST().graphene_euler_init_from_quaternion(asCPointer(), asCPointer(q), order)));
    }

    /**
     * Initializes a &#35;graphene_euler_t using the given angles
     * <br>and order of rotation.
     * @param x rotation angle on the X axis, in radians
     * @param y rotation angle on the Y axis, in radians
     * @param z rotation angle on the Z axis, in radians
     * @param order order of rotations
     * @return the initialized &#35;graphene_euler_t
    */
    public Euler initFromRadians(float x, float y, float z, int order)  {
        return new Euler(new PointerContainer(JnaEuler.INST().graphene_euler_init_from_radians(asCPointer(), x, y, z, order)));
    }

    /**
     * Initializes a &#35;graphene_euler_t using the angles contained in a
     * <br>&#35;graphene_vec3_t.
     * <br>
     * <br>If the &#35;graphene_vec3_t &#64;v is %NULL, the &#35;graphene_euler_t will be
     * <br>initialized with all angles set to 0.
     * @param v a &#35;graphene_vec3_t containing the rotation   angles in degrees
     * @param order the order used to apply the rotations
     * @return the initialized &#35;graphene_euler_t
    */
    public Euler initFromVec3(@Nullable Vec3 v, int order)  {
        return new Euler(new PointerContainer(JnaEuler.INST().graphene_euler_init_from_vec3(asCPointer(), asCPointer(v), order)));
    }

    /**
     * Initializes a &#35;graphene_euler_t with the given angles and &#64;order.
     * @param x rotation angle on the X axis, in degrees
     * @param y rotation angle on the Y axis, in degrees
     * @param z rotation angle on the Z axis, in degrees
     * @param order the order used to apply the rotations
     * @return the initialized &#35;graphene_euler_t
    */
    public Euler initWithOrder(float x, float y, float z, int order)  {
        return new Euler(new PointerContainer(JnaEuler.INST().graphene_euler_init_with_order(asCPointer(), x, y, z, order)));
    }

    /**
     * Reorders a &#35;graphene_euler_t using &#64;order.
     * <br>
     * <br>This function is equivalent to creating a &#35;graphene_quaternion_t from the
     * <br>given &#35;graphene_euler_t, and then converting the quaternion into another
     * <br>&#35;graphene_euler_t.
     * @param order the new order
     * @param res return location for the reordered   &#35;graphene_euler_t
    */
    public void reorder(int order, @Nonnull Euler res)  {
        JnaEuler.INST().graphene_euler_reorder(asCPointer(), order, asCPointerNotNull(res));
    }

    /**
     * Converts a &#35;graphene_euler_t into a transformation matrix expressing
     * <br>the extrinsic composition of rotations described by the Euler angles.
     * <br>
     * <br>The rotations are applied over the reference frame axes in the order
     * <br>associated with the &#35;graphene_euler_t; for instance, if the order
     * <br>used to initialize &#64;e is %GRAPHENE_EULER_ORDER_XYZ:
     * <br>
     * <br> * the first rotation moves the body around the X axis with
     * <br>   an angle φ
     * <br> * the second rotation moves the body around the Y axis with
     * <br>   an angle of ϑ
     * <br> * the third rotation moves the body around the Z axis with
     * <br>   an angle of ψ
     * <br>
     * <br>The rotation sign convention is right-handed, to preserve compatibility
     * <br>between Euler-based, quaternion-based, and angle-axis-based rotations.
     * @param res return location for a &#35;graphene_matrix_t
    */
    public void toMatrix(@Nonnull Matrix res)  {
        JnaEuler.INST().graphene_euler_to_matrix(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Converts a &#35;graphene_euler_t into a &#35;graphene_quaternion_t.
     * @param res return location for a &#35;graphene_quaternion_t
    */
    public void toQuaternion(@Nonnull Quaternion res)  {
        JnaEuler.INST().graphene_euler_to_quaternion(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Retrieves the angles of a &#35;graphene_euler_t and initializes a
     * <br>&#35;graphene_vec3_t with them.
     * @param res return location for a &#35;graphene_vec3_t
    */
    public void toVec3(@Nonnull Vec3 res)  {
        JnaEuler.INST().graphene_euler_to_vec3(asCPointer(), asCPointerNotNull(res));
    }

    public static long getTypeID() { 
        return JnaEuler.INST().graphene_euler_get_type(); 
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
