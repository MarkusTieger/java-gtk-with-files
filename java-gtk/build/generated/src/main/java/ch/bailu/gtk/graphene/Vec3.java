/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A structure capable of holding a vector with three dimensions: x, y, and z.
 * <br>
 * <br>The contents of the &#35;graphene_vec3_t structure are private and should
 * <br>never be accessed directly.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Vec3 extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Vec3.class.getCanonicalName());
    }

    public Vec3(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Allocates a new &#35;graphene_vec3_t structure.
     * <br>
     * <br>The contents of the returned structure are undefined.
     * <br>
     * <br>Use graphene_vec3_init() to initialize the vector.
     * @return the newly allocated &#35;graphene_vec3_t   structure. Use graphene_vec3_free() to free the resources allocated   by this function.
    */
    public static Vec3 allocVec3()  {
        PointerContainer __self = cast(JnaVec3.INST().graphene_vec3_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Vec3:alloc");
        }
        return new Vec3(__self);
    }        
    

    /**
     * Adds each component of the two given vectors.
     * @param b a &#35;graphene_vec3_t
     * @param res return location for the resulting vector
    */
    public void add(@Nonnull Vec3 b, @Nonnull Vec3 res)  {
        JnaVec3.INST().graphene_vec3_add(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Computes the cross product of the two given vectors.
     * @param b a &#35;graphene_vec3_t
     * @param res return location for the resulting vector
    */
    public void cross(@Nonnull Vec3 b, @Nonnull Vec3 res)  {
        JnaVec3.INST().graphene_vec3_cross(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Divides each component of the first operand &#64;a by the corresponding
     * <br>component of the second operand &#64;b, and places the results into the
     * <br>vector &#64;res.
     * @param b a &#35;graphene_vec3_t
     * @param res return location for the resulting vector
    */
    public void divide(@Nonnull Vec3 b, @Nonnull Vec3 res)  {
        JnaVec3.INST().graphene_vec3_divide(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Computes the dot product of the two given vectors.
     * @param b a &#35;graphene_vec3_t
     * @return the value of the dot product
    */
    public float dot(@Nonnull Vec3 b)  {
        return JnaVec3.INST().graphene_vec3_dot(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Checks whether the two given &#35;graphene_vec3_t are equal.
     * @param v2 a &#35;graphene_vec3_t
     * @return `true` if the two vectors are equal, and false otherwise
    */
    public boolean equal(@Nonnull Vec3 v2)  {
        return JnaVec3.INST().graphene_vec3_equal(asCPointer(), asCPointerNotNull(v2));
    }

    /**
     * Frees the resources allocated by &#64;v
    */
    public void free()  {
        JnaVec3.INST().graphene_vec3_free(asCPointer());
    }

    /**
     * Retrieves the first component of the given vector &#64;v.
     * @return the value of the first component of the vector
    */
    public float getX()  {
        return JnaVec3.INST().graphene_vec3_get_x(asCPointer());
    }

    /**
     * Creates a &#35;graphene_vec2_t that contains the first and second
     * <br>components of the given &#35;graphene_vec3_t.
     * @param res return location for a &#35;graphene_vec2_t
    */
    public void getXy(@Nonnull Vec2 res)  {
        JnaVec3.INST().graphene_vec3_get_xy(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Creates a &#35;graphene_vec3_t that contains the first two components of
     * <br>the given &#35;graphene_vec3_t, and the third component set to 0.
     * @param res return location for a &#35;graphene_vec3_t
    */
    public void getXy0(@Nonnull Vec3 res)  {
        JnaVec3.INST().graphene_vec3_get_xy0(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Converts a &#35;graphene_vec3_t in a &#35;graphene_vec4_t using 0.0
     * <br>as the value for the fourth component of the resulting vector.
     * @param res return location for the vector
    */
    public void getXyz0(@Nonnull Vec4 res)  {
        JnaVec3.INST().graphene_vec3_get_xyz0(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Converts a &#35;graphene_vec3_t in a &#35;graphene_vec4_t using 1.0
     * <br>as the value for the fourth component of the resulting vector.
     * @param res return location for the vector
    */
    public void getXyz1(@Nonnull Vec4 res)  {
        JnaVec3.INST().graphene_vec3_get_xyz1(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Converts a &#35;graphene_vec3_t in a &#35;graphene_vec4_t using &#64;w as
     * <br>the value of the fourth component of the resulting vector.
     * @param w the value of the W component
     * @param res return location for the vector
    */
    public void getXyzw(float w, @Nonnull Vec4 res)  {
        JnaVec3.INST().graphene_vec3_get_xyzw(asCPointer(), w, asCPointerNotNull(res));
    }

    /**
     * Retrieves the second component of the given vector &#64;v.
     * @return the value of the second component of the vector
    */
    public float getY()  {
        return JnaVec3.INST().graphene_vec3_get_y(asCPointer());
    }

    /**
     * Retrieves the third component of the given vector &#64;v.
     * @return the value of the third component of the vector
    */
    public float getZ()  {
        return JnaVec3.INST().graphene_vec3_get_z(asCPointer());
    }

    /**
     * Initializes a &#35;graphene_vec3_t using the given values.
     * <br>
     * <br>This function can be called multiple times.
     * @param x the X field of the vector
     * @param y the Y field of the vector
     * @param z the Z field of the vector
     * @return a pointer to the initialized   vector
    */
    public Vec3 init(float x, float y, float z)  {
        return new Vec3(new PointerContainer(JnaVec3.INST().graphene_vec3_init(asCPointer(), x, y, z)));
    }

    /**
     * Initializes a &#35;graphene_vec3_t with the values of another
     * <br>&#35;graphene_vec3_t.
     * @param src a &#35;graphene_vec3_t
     * @return the initialized vector
    */
    public Vec3 initFromVec3(@Nonnull Vec3 src)  {
        return new Vec3(new PointerContainer(JnaVec3.INST().graphene_vec3_init_from_vec3(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Linearly interpolates &#64;v1 and &#64;v2 using the given &#64;factor.
     * @param v2 a &#35;graphene_vec3_t
     * @param factor the interpolation factor
     * @param res the interpolated vector
    */
    public void interpolate(@Nonnull Vec3 v2, double factor, @Nonnull Vec3 res)  {
        JnaVec3.INST().graphene_vec3_interpolate(asCPointer(), asCPointerNotNull(v2), factor, asCPointerNotNull(res));
    }

    /**
     * Retrieves the length of the given vector &#64;v.
     * @return the value of the length of the vector
    */
    public float length()  {
        return JnaVec3.INST().graphene_vec3_length(asCPointer());
    }

    /**
     * Compares each component of the two given vectors and creates a
     * <br>vector that contains the maximum values.
     * @param b a &#35;graphene_vec3_t
     * @param res return location for the result vector
    */
    public void max(@Nonnull Vec3 b, @Nonnull Vec3 res)  {
        JnaVec3.INST().graphene_vec3_max(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Compares each component of the two given vectors and creates a
     * <br>vector that contains the minimum values.
     * @param b a &#35;graphene_vec3_t
     * @param res return location for the result vector
    */
    public void min(@Nonnull Vec3 b, @Nonnull Vec3 res)  {
        JnaVec3.INST().graphene_vec3_min(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Multiplies each component of the two given vectors.
     * @param b a &#35;graphene_vec3_t
     * @param res return location for the resulting vector
    */
    public void multiply(@Nonnull Vec3 b, @Nonnull Vec3 res)  {
        JnaVec3.INST().graphene_vec3_multiply(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Compares the two given &#35;graphene_vec3_t vectors and checks
     * <br>whether their values are within the given &#64;epsilon.
     * @param v2 a &#35;graphene_vec3_t
     * @param epsilon the threshold between the two vectors
     * @return `true` if the two vectors are near each other
    */
    public boolean near(@Nonnull Vec3 v2, float epsilon)  {
        return JnaVec3.INST().graphene_vec3_near(asCPointer(), asCPointerNotNull(v2), epsilon);
    }

    /**
     * Negates the given &#35;graphene_vec3_t.
     * @param res return location for the result vector
    */
    public void negate(@Nonnull Vec3 res)  {
        JnaVec3.INST().graphene_vec3_negate(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Normalizes the given &#35;graphene_vec3_t.
     * @param res return location for the normalized vector
    */
    public void normalize(@Nonnull Vec3 res)  {
        JnaVec3.INST().graphene_vec3_normalize(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Multiplies all components of the given vector with the given scalar &#64;factor.
     * @param factor the scalar factor
     * @param res return location for the result vector
    */
    public void scale(float factor, @Nonnull Vec3 res)  {
        JnaVec3.INST().graphene_vec3_scale(asCPointer(), factor, asCPointerNotNull(res));
    }

    /**
     * Subtracts from each component of the first operand &#64;a the
     * <br>corresponding component of the second operand &#64;b and places
     * <br>each result into the components of &#64;res.
     * @param b a &#35;graphene_vec3_t
     * @param res return location for the resulting vector
    */
    public void subtract(@Nonnull Vec3 b, @Nonnull Vec3 res)  {
        JnaVec3.INST().graphene_vec3_subtract(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Copies the components of a &#35;graphene_vec3_t into the given array.
     * @param dest return location for   an array of floating point values
    */
    public void toFloat(@Nonnull ch.bailu.gtk.type.Flt dest)  {
        JnaVec3.INST().graphene_vec3_to_float(asCPointer(), asCPointerNotNull(dest));
    }

    /**
     * Provides a constant pointer to a vector with three components,
     * <br>all sets to 1.
     * @return a constant vector
    */
    public static Vec3 one()  {
        return new Vec3(new PointerContainer(JnaVec3.INST().graphene_vec3_one()));
    }

    /**
     * Provides a constant pointer to a vector with three components
     * <br>with values set to (1, 0, 0).
     * @return a constant vector
    */
    public static Vec3 xAxis()  {
        return new Vec3(new PointerContainer(JnaVec3.INST().graphene_vec3_x_axis()));
    }

    /**
     * Provides a constant pointer to a vector with three components
     * <br>with values set to (0, 1, 0).
     * @return a constant vector
    */
    public static Vec3 yAxis()  {
        return new Vec3(new PointerContainer(JnaVec3.INST().graphene_vec3_y_axis()));
    }

    /**
     * Provides a constant pointer to a vector with three components
     * <br>with values set to (0, 0, 1).
     * @return a constant vector
    */
    public static Vec3 zAxis()  {
        return new Vec3(new PointerContainer(JnaVec3.INST().graphene_vec3_z_axis()));
    }

    /**
     * Provides a constant pointer to a vector with three components,
     * <br>all sets to 0.
     * @return a constant vector
    */
    public static Vec3 zero()  {
        return new Vec3(new PointerContainer(JnaVec3.INST().graphene_vec3_zero()));
    }

    public static long getTypeID() { 
        return JnaVec3.INST().graphene_vec3_get_type(); 
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

[MethodModel:java-type-not-supported:initFromFloat:[ParameterModel:Supported:{Gg:Vec3:{c:graphene_vec3_t*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const float*}}:{j:}]

[FieldModel:value:direct-type:{Gg:Simd4F:{c:graphene_simd4f_t}}:{j:long}]
*/
