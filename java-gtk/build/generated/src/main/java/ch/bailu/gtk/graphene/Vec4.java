/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A structure capable of holding a vector with four dimensions: x, y, z, and w.
 * <br>
 * <br>The contents of the &#35;graphene_vec4_t structure are private and should
 * <br>never be accessed directly.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Vec4 extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Vec4.class.getCanonicalName());
    }

    public Vec4(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Allocates a new &#35;graphene_vec4_t structure.
     * <br>
     * <br>The contents of the returned structure are undefined.
     * <br>
     * <br>Use graphene_vec4_init() to initialize the vector.
     * @return the newly allocated &#35;graphene_vec4_t   structure. Use graphene_vec4_free() to free the resources allocated   by this function.
    */
    public static Vec4 allocVec4()  {
        PointerContainer __self = cast(JnaVec4.INST().graphene_vec4_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Vec4:alloc");
        }
        return new Vec4(__self);
    }        
    

    /**
     * Adds each component of the two given vectors.
     * @param b a &#35;graphene_vec4_t
     * @param res return location for the resulting vector
    */
    public void add(@Nonnull Vec4 b, @Nonnull Vec4 res)  {
        JnaVec4.INST().graphene_vec4_add(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Divides each component of the first operand &#64;a by the corresponding
     * <br>component of the second operand &#64;b, and places the results into the
     * <br>vector &#64;res.
     * @param b a &#35;graphene_vec4_t
     * @param res return location for the resulting vector
    */
    public void divide(@Nonnull Vec4 b, @Nonnull Vec4 res)  {
        JnaVec4.INST().graphene_vec4_divide(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Computes the dot product of the two given vectors.
     * @param b a &#35;graphene_vec4_t
     * @return the value of the dot product
    */
    public float dot(@Nonnull Vec4 b)  {
        return JnaVec4.INST().graphene_vec4_dot(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Checks whether the two given &#35;graphene_vec4_t are equal.
     * @param v2 a &#35;graphene_vec4_t
     * @return `true` if the two vectors are equal, and false otherwise
    */
    public boolean equal(@Nonnull Vec4 v2)  {
        return JnaVec4.INST().graphene_vec4_equal(asCPointer(), asCPointerNotNull(v2));
    }

    /**
     * Frees the resources allocated by &#64;v
    */
    public void free()  {
        JnaVec4.INST().graphene_vec4_free(asCPointer());
    }

    /**
     * Retrieves the value of the fourth component of the given &#35;graphene_vec4_t.
     * @return the value of the fourth component
    */
    public float getW()  {
        return JnaVec4.INST().graphene_vec4_get_w(asCPointer());
    }

    /**
     * Retrieves the value of the first component of the given &#35;graphene_vec4_t.
     * @return the value of the first component
    */
    public float getX()  {
        return JnaVec4.INST().graphene_vec4_get_x(asCPointer());
    }

    /**
     * Creates a &#35;graphene_vec2_t that contains the first two components
     * <br>of the given &#35;graphene_vec4_t.
     * @param res return location for a &#35;graphene_vec2_t
    */
    public void getXy(@Nonnull Vec2 res)  {
        JnaVec4.INST().graphene_vec4_get_xy(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Creates a &#35;graphene_vec3_t that contains the first three components
     * <br>of the given &#35;graphene_vec4_t.
     * @param res return location for a graphene_vec3_t
    */
    public void getXyz(@Nonnull Vec3 res)  {
        JnaVec4.INST().graphene_vec4_get_xyz(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Retrieves the value of the second component of the given &#35;graphene_vec4_t.
     * @return the value of the second component
    */
    public float getY()  {
        return JnaVec4.INST().graphene_vec4_get_y(asCPointer());
    }

    /**
     * Retrieves the value of the third component of the given &#35;graphene_vec4_t.
     * @return the value of the third component
    */
    public float getZ()  {
        return JnaVec4.INST().graphene_vec4_get_z(asCPointer());
    }

    /**
     * Initializes a &#35;graphene_vec4_t using the given values.
     * <br>
     * <br>This function can be called multiple times.
     * @param x the X field of the vector
     * @param y the Y field of the vector
     * @param z the Z field of the vector
     * @param w the W field of the vector
     * @return a pointer to the initialized   vector
    */
    public Vec4 init(float x, float y, float z, float w)  {
        return new Vec4(new PointerContainer(JnaVec4.INST().graphene_vec4_init(asCPointer(), x, y, z, w)));
    }

    /**
     * Initializes a &#35;graphene_vec4_t using the components of a
     * <br>&#35;graphene_vec2_t and the values of &#64;z and &#64;w.
     * @param src a &#35;graphene_vec2_t
     * @param z the value for the third component of &#64;v
     * @param w the value for the fourth component of &#64;v
     * @return the initialized vector
    */
    public Vec4 initFromVec2(@Nonnull Vec2 src, float z, float w)  {
        return new Vec4(new PointerContainer(JnaVec4.INST().graphene_vec4_init_from_vec2(asCPointer(), asCPointerNotNull(src), z, w)));
    }

    /**
     * Initializes a &#35;graphene_vec4_t using the components of a
     * <br>&#35;graphene_vec3_t and the value of &#64;w.
     * @param src a &#35;graphene_vec3_t
     * @param w the value for the fourth component of &#64;v
     * @return the initialized vector
    */
    public Vec4 initFromVec3(@Nonnull Vec3 src, float w)  {
        return new Vec4(new PointerContainer(JnaVec4.INST().graphene_vec4_init_from_vec3(asCPointer(), asCPointerNotNull(src), w)));
    }

    /**
     * Initializes a &#35;graphene_vec4_t using the components of
     * <br>another &#35;graphene_vec4_t.
     * @param src a &#35;graphene_vec4_t
     * @return the initialized vector
    */
    public Vec4 initFromVec4(@Nonnull Vec4 src)  {
        return new Vec4(new PointerContainer(JnaVec4.INST().graphene_vec4_init_from_vec4(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Linearly interpolates &#64;v1 and &#64;v2 using the given &#64;factor.
     * @param v2 a &#35;graphene_vec4_t
     * @param factor the interpolation factor
     * @param res the interpolated vector
    */
    public void interpolate(@Nonnull Vec4 v2, double factor, @Nonnull Vec4 res)  {
        JnaVec4.INST().graphene_vec4_interpolate(asCPointer(), asCPointerNotNull(v2), factor, asCPointerNotNull(res));
    }

    /**
     * Computes the length of the given &#35;graphene_vec4_t.
     * @return the length of the vector
    */
    public float length()  {
        return JnaVec4.INST().graphene_vec4_length(asCPointer());
    }

    /**
     * Compares each component of the two given vectors and creates a
     * <br>vector that contains the maximum values.
     * @param b a &#35;graphene_vec4_t
     * @param res return location for the result vector
    */
    public void max(@Nonnull Vec4 b, @Nonnull Vec4 res)  {
        JnaVec4.INST().graphene_vec4_max(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Compares each component of the two given vectors and creates a
     * <br>vector that contains the minimum values.
     * @param b a &#35;graphene_vec4_t
     * @param res return location for the result vector
    */
    public void min(@Nonnull Vec4 b, @Nonnull Vec4 res)  {
        JnaVec4.INST().graphene_vec4_min(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Multiplies each component of the two given vectors.
     * @param b a &#35;graphene_vec4_t
     * @param res return location for the resulting vector
    */
    public void multiply(@Nonnull Vec4 b, @Nonnull Vec4 res)  {
        JnaVec4.INST().graphene_vec4_multiply(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Compares the two given &#35;graphene_vec4_t vectors and checks
     * <br>whether their values are within the given &#64;epsilon.
     * @param v2 a &#35;graphene_vec4_t
     * @param epsilon the threshold between the two vectors
     * @return `true` if the two vectors are near each other
    */
    public boolean near(@Nonnull Vec4 v2, float epsilon)  {
        return JnaVec4.INST().graphene_vec4_near(asCPointer(), asCPointerNotNull(v2), epsilon);
    }

    /**
     * Negates the given &#35;graphene_vec4_t.
     * @param res return location for the result vector
    */
    public void negate(@Nonnull Vec4 res)  {
        JnaVec4.INST().graphene_vec4_negate(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Normalizes the given &#35;graphene_vec4_t.
     * @param res return location for the normalized   vector
    */
    public void normalize(@Nonnull Vec4 res)  {
        JnaVec4.INST().graphene_vec4_normalize(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Multiplies all components of the given vector with the given scalar &#64;factor.
     * @param factor the scalar factor
     * @param res return location for the result vector
    */
    public void scale(float factor, @Nonnull Vec4 res)  {
        JnaVec4.INST().graphene_vec4_scale(asCPointer(), factor, asCPointerNotNull(res));
    }

    /**
     * Subtracts from each component of the first operand &#64;a the
     * <br>corresponding component of the second operand &#64;b and places
     * <br>each result into the components of &#64;res.
     * @param b a &#35;graphene_vec4_t
     * @param res return location for the resulting vector
    */
    public void subtract(@Nonnull Vec4 b, @Nonnull Vec4 res)  {
        JnaVec4.INST().graphene_vec4_subtract(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Stores the components of the given &#35;graphene_vec4_t into an array
     * <br>of floating point values.
     * @param dest return location for   an array of floating point values
    */
    public void toFloat(@Nonnull ch.bailu.gtk.type.Flt dest)  {
        JnaVec4.INST().graphene_vec4_to_float(asCPointer(), asCPointerNotNull(dest));
    }

    /**
     * Retrieves a pointer to a &#35;graphene_vec4_t with all its
     * <br>components set to 1.
     * @return a constant vector
    */
    public static Vec4 one()  {
        return new Vec4(new PointerContainer(JnaVec4.INST().graphene_vec4_one()));
    }

    /**
     * Retrieves a pointer to a &#35;graphene_vec4_t with its
     * <br>components set to (0, 0, 0, 1).
     * @return a constant vector
    */
    public static Vec4 wAxis()  {
        return new Vec4(new PointerContainer(JnaVec4.INST().graphene_vec4_w_axis()));
    }

    /**
     * Retrieves a pointer to a &#35;graphene_vec4_t with its
     * <br>components set to (1, 0, 0, 0).
     * @return a constant vector
    */
    public static Vec4 xAxis()  {
        return new Vec4(new PointerContainer(JnaVec4.INST().graphene_vec4_x_axis()));
    }

    /**
     * Retrieves a pointer to a &#35;graphene_vec4_t with its
     * <br>components set to (0, 1, 0, 0).
     * @return a constant vector
    */
    public static Vec4 yAxis()  {
        return new Vec4(new PointerContainer(JnaVec4.INST().graphene_vec4_y_axis()));
    }

    /**
     * Retrieves a pointer to a &#35;graphene_vec4_t with its
     * <br>components set to (0, 0, 1, 0).
     * @return a constant vector
    */
    public static Vec4 zAxis()  {
        return new Vec4(new PointerContainer(JnaVec4.INST().graphene_vec4_z_axis()));
    }

    /**
     * Retrieves a pointer to a &#35;graphene_vec4_t with all its
     * <br>components set to 0.
     * @return a constant vector
    */
    public static Vec4 zero()  {
        return new Vec4(new PointerContainer(JnaVec4.INST().graphene_vec4_zero()));
    }

    public static long getTypeID() { 
        return JnaVec4.INST().graphene_vec4_get_type(); 
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

[MethodModel:java-type-not-supported:initFromFloat:[ParameterModel:Supported:{Gg:Vec4:{c:graphene_vec4_t*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const float*}}:{j:}]

[FieldModel:value:direct-type:{Gg:Simd4F:{c:graphene_simd4f_t}}:{j:long}]
*/
