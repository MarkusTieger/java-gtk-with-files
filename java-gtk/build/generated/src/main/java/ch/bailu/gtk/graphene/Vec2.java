/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A structure capable of holding a vector with two dimensions, x and y.
 * <br>
 * <br>The contents of the &#35;graphene_vec2_t structure are private and should
 * <br>never be accessed directly.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Vec2 extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Vec2.class.getCanonicalName());
    }

    public Vec2(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Allocates a new &#35;graphene_vec2_t structure.
     * <br>
     * <br>The contents of the returned structure are undefined.
     * <br>
     * <br>Use graphene_vec2_init() to initialize the vector.
     * @return the newly allocated &#35;graphene_vec2_t   structure. Use graphene_vec2_free() to free the resources allocated   by this function.
    */
    public static Vec2 allocVec2()  {
        PointerContainer __self = cast(JnaVec2.INST().graphene_vec2_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Vec2:alloc");
        }
        return new Vec2(__self);
    }        
    

    /**
     * Adds each component of the two passed vectors and places
     * <br>each result into the components of &#64;res.
     * @param b a &#35;graphene_vec2_t
     * @param res return location for the result
    */
    public void add(@Nonnull Vec2 b, @Nonnull Vec2 res)  {
        JnaVec2.INST().graphene_vec2_add(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Divides each component of the first operand &#64;a by the corresponding
     * <br>component of the second operand &#64;b, and places the results into the
     * <br>vector &#64;res.
     * @param b a &#35;graphene_vec2_t
     * @param res return location for the result
    */
    public void divide(@Nonnull Vec2 b, @Nonnull Vec2 res)  {
        JnaVec2.INST().graphene_vec2_divide(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Computes the dot product of the two given vectors.
     * @param b a &#35;graphene_vec2_t
     * @return the dot product of the vectors
    */
    public float dot(@Nonnull Vec2 b)  {
        return JnaVec2.INST().graphene_vec2_dot(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Checks whether the two given &#35;graphene_vec2_t are equal.
     * @param v2 a &#35;graphene_vec2_t
     * @return `true` if the two vectors are equal, and false otherwise
    */
    public boolean equal(@Nonnull Vec2 v2)  {
        return JnaVec2.INST().graphene_vec2_equal(asCPointer(), asCPointerNotNull(v2));
    }

    /**
     * Frees the resources allocated by &#64;v
    */
    public void free()  {
        JnaVec2.INST().graphene_vec2_free(asCPointer());
    }

    /**
     * Retrieves the X component of the &#35;graphene_vec2_t.
     * @return the value of the X component
    */
    public float getX()  {
        return JnaVec2.INST().graphene_vec2_get_x(asCPointer());
    }

    /**
     * Retrieves the Y component of the &#35;graphene_vec2_t.
     * @return the value of the Y component
    */
    public float getY()  {
        return JnaVec2.INST().graphene_vec2_get_y(asCPointer());
    }

    /**
     * Initializes a &#35;graphene_vec2_t using the given values.
     * <br>
     * <br>This function can be called multiple times.
     * @param x the X field of the vector
     * @param y the Y field of the vector
     * @return the initialized vector
    */
    public Vec2 init(float x, float y)  {
        return new Vec2(new PointerContainer(JnaVec2.INST().graphene_vec2_init(asCPointer(), x, y)));
    }

    /**
     * Copies the contents of &#64;src into &#64;v.
     * @param src a &#35;graphene_vec2_t
     * @return the initialized vector
    */
    public Vec2 initFromVec2(@Nonnull Vec2 src)  {
        return new Vec2(new PointerContainer(JnaVec2.INST().graphene_vec2_init_from_vec2(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Linearly interpolates &#64;v1 and &#64;v2 using the given &#64;factor.
     * @param v2 a &#35;graphene_vec2_t
     * @param factor the interpolation factor
     * @param res the interpolated vector
    */
    public void interpolate(@Nonnull Vec2 v2, double factor, @Nonnull Vec2 res)  {
        JnaVec2.INST().graphene_vec2_interpolate(asCPointer(), asCPointerNotNull(v2), factor, asCPointerNotNull(res));
    }

    /**
     * Computes the length of the given vector.
     * @return the length of the vector
    */
    public float length()  {
        return JnaVec2.INST().graphene_vec2_length(asCPointer());
    }

    /**
     * Compares the two given vectors and places the maximum
     * <br>values of each component into &#64;res.
     * @param b a &#35;graphene_vec2_t
     * @param res the resulting vector
    */
    public void max(@Nonnull Vec2 b, @Nonnull Vec2 res)  {
        JnaVec2.INST().graphene_vec2_max(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Compares the two given vectors and places the minimum
     * <br>values of each component into &#64;res.
     * @param b a &#35;graphene_vec2_t
     * @param res the resulting vector
    */
    public void min(@Nonnull Vec2 b, @Nonnull Vec2 res)  {
        JnaVec2.INST().graphene_vec2_min(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Multiplies each component of the two passed vectors and places
     * <br>each result into the components of &#64;res.
     * @param b a &#35;graphene_vec2_t
     * @param res return location for the result
    */
    public void multiply(@Nonnull Vec2 b, @Nonnull Vec2 res)  {
        JnaVec2.INST().graphene_vec2_multiply(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Compares the two given &#35;graphene_vec2_t vectors and checks
     * <br>whether their values are within the given &#64;epsilon.
     * @param v2 a &#35;graphene_vec2_t
     * @param epsilon the threshold between the two vectors
     * @return `true` if the two vectors are near each other
    */
    public boolean near(@Nonnull Vec2 v2, float epsilon)  {
        return JnaVec2.INST().graphene_vec2_near(asCPointer(), asCPointerNotNull(v2), epsilon);
    }

    /**
     * Negates the given &#35;graphene_vec2_t.
     * @param res return location for the result vector
    */
    public void negate(@Nonnull Vec2 res)  {
        JnaVec2.INST().graphene_vec2_negate(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Computes the normalized vector for the given vector &#64;v.
     * @param res return location for the   normalized vector
    */
    public void normalize(@Nonnull Vec2 res)  {
        JnaVec2.INST().graphene_vec2_normalize(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Multiplies all components of the given vector with the given scalar &#64;factor.
     * @param factor the scalar factor
     * @param res return location for the result vector
    */
    public void scale(float factor, @Nonnull Vec2 res)  {
        JnaVec2.INST().graphene_vec2_scale(asCPointer(), factor, asCPointerNotNull(res));
    }

    /**
     * Subtracts from each component of the first operand &#64;a the
     * <br>corresponding component of the second operand &#64;b and places
     * <br>each result into the components of &#64;res.
     * @param b a &#35;graphene_vec2_t
     * @param res return location for the result
    */
    public void subtract(@Nonnull Vec2 b, @Nonnull Vec2 res)  {
        JnaVec2.INST().graphene_vec2_subtract(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Stores the components of &#64;v into an array.
     * @param dest return location   for an array of floating point values with at least 2 elements
    */
    public void toFloat(@Nonnull ch.bailu.gtk.type.Flt dest)  {
        JnaVec2.INST().graphene_vec2_to_float(asCPointer(), asCPointerNotNull(dest));
    }

    /**
     * Retrieves a constant vector with (1, 1) components.
     * @return the one vector
    */
    public static Vec2 one()  {
        return new Vec2(new PointerContainer(JnaVec2.INST().graphene_vec2_one()));
    }

    /**
     * Retrieves a constant vector with (1, 0) components.
     * @return the X axis vector
    */
    public static Vec2 xAxis()  {
        return new Vec2(new PointerContainer(JnaVec2.INST().graphene_vec2_x_axis()));
    }

    /**
     * Retrieves a constant vector with (0, 1) components.
     * @return the Y axis vector
    */
    public static Vec2 yAxis()  {
        return new Vec2(new PointerContainer(JnaVec2.INST().graphene_vec2_y_axis()));
    }

    /**
     * Retrieves a constant vector with (0, 0) components.
     * @return the zero vector
    */
    public static Vec2 zero()  {
        return new Vec2(new PointerContainer(JnaVec2.INST().graphene_vec2_zero()));
    }

    public static long getTypeID() { 
        return JnaVec2.INST().graphene_vec2_get_type(); 
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

[MethodModel:java-type-not-supported:initFromFloat:[ParameterModel:Supported:{Gg:Vec2:{c:graphene_vec2_t*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const float*}}:{j:}]

[FieldModel:value:direct-type:{Gg:Simd4F:{c:graphene_simd4f_t}}:{j:long}]
*/
