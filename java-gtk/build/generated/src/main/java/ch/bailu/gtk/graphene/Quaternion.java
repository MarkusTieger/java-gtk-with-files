/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A quaternion.
 * <br>
 * <br>The contents of the &#35;graphene_quaternion_t structure are private
 * <br>and should never be accessed directly.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Quaternion extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Quaternion.class.getCanonicalName());
    }

    public Quaternion(PointerContainer pointer) {
        super(pointer);
    }

    public Quaternion() {
        super(cast(JnaQuaternion.allocateStructure()));
    }

    private JnaQuaternion.Fields _fields;
    
    JnaQuaternion.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaQuaternion.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String X = "x";

    /**
     * 
    */
    public float getFieldX() {
       toFields().readField(X);
       return toFields().x;
    } 

    /**
     * 
    */
    public static final String Y = "y";

    /**
     * 
    */
    public float getFieldY() {
       toFields().readField(Y);
       return toFields().y;
    } 

    /**
     * 
    */
    public static final String Z = "z";

    /**
     * 
    */
    public float getFieldZ() {
       toFields().readField(Z);
       return toFields().z;
    } 

    /**
     * 
    */
    public static final String W = "w";

    /**
     * 
    */
    public float getFieldW() {
       toFields().readField(W);
       return toFields().w;
    } 

    /**
     * Allocates a new &#35;graphene_quaternion_t.
     * <br>
     * <br>The contents of the returned value are undefined.
     * @return the newly allocated &#35;graphene_quaternion_t
    */
    public static Quaternion allocQuaternion()  {
        PointerContainer __self = cast(JnaQuaternion.INST().graphene_quaternion_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Quaternion:alloc");
        }
        return new Quaternion(__self);
    }        
    

    /**
     * Adds two &#35;graphene_quaternion_t &#64;a and &#64;b.
     * @param b a &#35;graphene_quaternion_t
     * @param res the result of the operation
    */
    public void add(@Nonnull Quaternion b, @Nonnull Quaternion res)  {
        JnaQuaternion.INST().graphene_quaternion_add(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Computes the dot product of two &#35;graphene_quaternion_t.
     * @param b a &#35;graphene_quaternion_t
     * @return the value of the dot products
    */
    public float dot(@Nonnull Quaternion b)  {
        return JnaQuaternion.INST().graphene_quaternion_dot(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Checks whether the given quaternions are equal.
     * @param b a &#35;graphene_quaternion_t
     * @return `true` if the quaternions are equal
    */
    public boolean equal(@Nonnull Quaternion b)  {
        return JnaQuaternion.INST().graphene_quaternion_equal(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Releases the resources allocated by graphene_quaternion_alloc().
    */
    public void free()  {
        JnaQuaternion.INST().graphene_quaternion_free(asCPointer());
    }

    /**
     * Initializes a &#35;graphene_quaternion_t using the given four values.
     * @param x the first component of the quaternion
     * @param y the second component of the quaternion
     * @param z the third component of the quaternion
     * @param w the fourth component of the quaternion
     * @return the initialized quaternion
    */
    public Quaternion init(float x, float y, float z, float w)  {
        return new Quaternion(new PointerContainer(JnaQuaternion.INST().graphene_quaternion_init(asCPointer(), x, y, z, w)));
    }

    /**
     * Initializes a &#35;graphene_quaternion_t using an &#64;angle on a
     * <br>specific &#64;axis.
     * @param angle the rotation on a given axis, in degrees
     * @param axis the axis of rotation, expressed as a vector
     * @return the initialized quaternion
    */
    public Quaternion initFromAngleVec3(float angle, @Nonnull Vec3 axis)  {
        return new Quaternion(new PointerContainer(JnaQuaternion.INST().graphene_quaternion_init_from_angle_vec3(asCPointer(), angle, asCPointerNotNull(axis))));
    }

    /**
     * Initializes a &#35;graphene_quaternion_t using the values of
     * <br>the [Euler angles](http://en.wikipedia.org/wiki/Euler_angles)
     * <br>on each axis.
     * <br>
     * <br>See also: graphene_quaternion_init_from_euler()
     * @param deg_x rotation angle on the X axis (yaw), in degrees
     * @param deg_y rotation angle on the Y axis (pitch), in degrees
     * @param deg_z rotation angle on the Z axis (roll), in degrees
     * @return the initialized quaternion
    */
    public Quaternion initFromAngles(float deg_x, float deg_y, float deg_z)  {
        return new Quaternion(new PointerContainer(JnaQuaternion.INST().graphene_quaternion_init_from_angles(asCPointer(), deg_x, deg_y, deg_z)));
    }

    /**
     * Initializes a &#35;graphene_quaternion_t using the given &#35;graphene_euler_t.
     * @param e a &#35;graphene_euler_t
     * @return the initialized &#35;graphene_quaternion_t
    */
    public Quaternion initFromEuler(@Nonnull Euler e)  {
        return new Quaternion(new PointerContainer(JnaQuaternion.INST().graphene_quaternion_init_from_euler(asCPointer(), asCPointerNotNull(e))));
    }

    /**
     * Initializes a &#35;graphene_quaternion_t using the rotation components
     * <br>of a transformation matrix.
     * @param m a &#35;graphene_matrix_t
     * @return the initialized quaternion
    */
    public Quaternion initFromMatrix(@Nonnull Matrix m)  {
        return new Quaternion(new PointerContainer(JnaQuaternion.INST().graphene_quaternion_init_from_matrix(asCPointer(), asCPointerNotNull(m))));
    }

    /**
     * Initializes a &#35;graphene_quaternion_t with the values from &#64;src.
     * @param src a &#35;graphene_quaternion_t
     * @return the initialized quaternion
    */
    public Quaternion initFromQuaternion(@Nonnull Quaternion src)  {
        return new Quaternion(new PointerContainer(JnaQuaternion.INST().graphene_quaternion_init_from_quaternion(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Initializes a &#35;graphene_quaternion_t using the values of
     * <br>the [Euler angles](http://en.wikipedia.org/wiki/Euler_angles)
     * <br>on each axis.
     * <br>
     * <br>See also: graphene_quaternion_init_from_euler()
     * @param rad_x rotation angle on the X axis (yaw), in radians
     * @param rad_y rotation angle on the Y axis (pitch), in radians
     * @param rad_z rotation angle on the Z axis (roll), in radians
     * @return the initialized quaternion
    */
    public Quaternion initFromRadians(float rad_x, float rad_y, float rad_z)  {
        return new Quaternion(new PointerContainer(JnaQuaternion.INST().graphene_quaternion_init_from_radians(asCPointer(), rad_x, rad_y, rad_z)));
    }

    /**
     * Initializes a &#35;graphene_quaternion_t with the values from &#64;src.
     * @param src a &#35;graphene_vec4_t
     * @return the initialized quaternion
    */
    public Quaternion initFromVec4(@Nonnull Vec4 src)  {
        return new Quaternion(new PointerContainer(JnaQuaternion.INST().graphene_quaternion_init_from_vec4(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Initializes a &#35;graphene_quaternion_t using the identity
     * <br>transformation.
     * @return the initialized quaternion
    */
    public Quaternion initIdentity()  {
        return new Quaternion(new PointerContainer(JnaQuaternion.INST().graphene_quaternion_init_identity(asCPointer())));
    }

    /**
     * Inverts a &#35;graphene_quaternion_t, and returns the conjugate
     * <br>quaternion of &#64;q.
     * @param res return location for the inverted   quaternion
    */
    public void invert(@Nonnull Quaternion res)  {
        JnaQuaternion.INST().graphene_quaternion_invert(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Multiplies two &#35;graphene_quaternion_t &#64;a and &#64;b.
     * @param b a &#35;graphene_quaternion_t
     * @param res the result of the operation
    */
    public void multiply(@Nonnull Quaternion b, @Nonnull Quaternion res)  {
        JnaQuaternion.INST().graphene_quaternion_multiply(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Normalizes a &#35;graphene_quaternion_t.
     * @param res return location for the normalized   quaternion
    */
    public void normalize(@Nonnull Quaternion res)  {
        JnaQuaternion.INST().graphene_quaternion_normalize(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Scales all the elements of a &#35;graphene_quaternion_t &#64;q using
     * <br>the given scalar factor.
     * @param factor a scaling factor
     * @param res the result of the operation
    */
    public void scale(float factor, @Nonnull Quaternion res)  {
        JnaQuaternion.INST().graphene_quaternion_scale(asCPointer(), factor, asCPointerNotNull(res));
    }

    /**
     * Interpolates between the two given quaternions using a spherical
     * <br>linear interpolation, or [SLERP](http://en.wikipedia.org/wiki/Slerp),
     * <br>using the given interpolation &#64;factor.
     * @param b a &#35;graphene_quaternion_t
     * @param factor the linear interpolation factor
     * @param res return location for the interpolated   quaternion
    */
    public void slerp(@Nonnull Quaternion b, float factor, @Nonnull Quaternion res)  {
        JnaQuaternion.INST().graphene_quaternion_slerp(asCPointer(), asCPointerNotNull(b), factor, asCPointerNotNull(res));
    }

    /**
     * Converts a quaternion into an &#64;angle, &#64;axis pair.
     * @param angle return location for the angle, in degrees
     * @param axis return location for the rotation axis
    */
    public void toAngleVec3(@Nonnull ch.bailu.gtk.type.Flt angle, @Nonnull Vec3 axis)  {
        JnaQuaternion.INST().graphene_quaternion_to_angle_vec3(asCPointer(), asCPointerNotNull(angle), asCPointerNotNull(axis));
    }

    /**
     * Converts a &#35;graphene_quaternion_t to its corresponding rotations
     * <br>on the [Euler angles](http://en.wikipedia.org/wiki/Euler_angles)
     * <br>on each axis.
     * @param deg_x return location for the rotation angle on   the X axis (yaw), in degrees
     * @param deg_y return location for the rotation angle on   the Y axis (pitch), in degrees
     * @param deg_z return location for the rotation angle on   the Z axis (roll), in degrees
    */
    public void toAngles(@Nullable ch.bailu.gtk.type.Flt deg_x, @Nullable ch.bailu.gtk.type.Flt deg_y, @Nullable ch.bailu.gtk.type.Flt deg_z)  {
        JnaQuaternion.INST().graphene_quaternion_to_angles(asCPointer(), asCPointer(deg_x), asCPointer(deg_y), asCPointer(deg_z));
    }

    /**
     * Converts a quaternion into a transformation matrix expressing
     * <br>the rotation defined by the &#35;graphene_quaternion_t.
     * @param m a &#35;graphene_matrix_t
    */
    public void toMatrix(@Nonnull Matrix m)  {
        JnaQuaternion.INST().graphene_quaternion_to_matrix(asCPointer(), asCPointerNotNull(m));
    }

    /**
     * Converts a &#35;graphene_quaternion_t to its corresponding rotations
     * <br>on the [Euler angles](http://en.wikipedia.org/wiki/Euler_angles)
     * <br>on each axis.
     * @param rad_x return location for the rotation angle on   the X axis (yaw), in radians
     * @param rad_y return location for the rotation angle on   the Y axis (pitch), in radians
     * @param rad_z return location for the rotation angle on   the Z axis (roll), in radians
    */
    public void toRadians(@Nullable ch.bailu.gtk.type.Flt rad_x, @Nullable ch.bailu.gtk.type.Flt rad_y, @Nullable ch.bailu.gtk.type.Flt rad_z)  {
        JnaQuaternion.INST().graphene_quaternion_to_radians(asCPointer(), asCPointer(rad_x), asCPointer(rad_y), asCPointer(rad_z));
    }

    /**
     * Copies the components of a &#35;graphene_quaternion_t into a
     * <br>&#35;graphene_vec4_t.
     * @param res return location for a   &#35;graphene_vec4_t
    */
    public void toVec4(@Nonnull Vec4 res)  {
        JnaQuaternion.INST().graphene_quaternion_to_vec4(asCPointer(), asCPointerNotNull(res));
    }

    public static long getTypeID() { 
        return JnaQuaternion.INST().graphene_quaternion_get_type(); 
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
