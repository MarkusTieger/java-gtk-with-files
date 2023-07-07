/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Graphene extends ch.bailu.gtk.type.Package {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Graphene.class.getCanonicalName());
    }

    /**
     * A degenerate &#35;graphene_box_t that can only be expanded.
     * <br>
     * <br>The returned value is owned by Graphene and should not be modified or freed.
     * @return a &#35;graphene_box_t
    */
    public static Box boxEmpty()  {
        return new Box(new PointerContainer(JnaGraphene.INST().graphene_box_empty()));
    }

    /**
     * A degenerate &#35;graphene_box_t that cannot be expanded.
     * <br>
     * <br>The returned value is owned by Graphene and should not be modified or freed.
     * @return a &#35;graphene_box_t
    */
    public static Box boxInfinite()  {
        return new Box(new PointerContainer(JnaGraphene.INST().graphene_box_infinite()));
    }

    /**
     * A &#35;graphene_box_t with the minimum vertex set at (-1, -1, -1) and the
     * <br>maximum vertex set at (0, 0, 0).
     * <br>
     * <br>The returned value is owned by Graphene and should not be modified or freed.
     * @return a &#35;graphene_box_t
    */
    public static Box boxMinusOne()  {
        return new Box(new PointerContainer(JnaGraphene.INST().graphene_box_minus_one()));
    }

    /**
     * A &#35;graphene_box_t with the minimum vertex set at (0, 0, 0) and the
     * <br>maximum vertex set at (1, 1, 1).
     * <br>
     * <br>The returned value is owned by Graphene and should not be modified or freed.
     * @return a &#35;graphene_box_t
    */
    public static Box boxOne()  {
        return new Box(new PointerContainer(JnaGraphene.INST().graphene_box_one()));
    }

    /**
     * A &#35;graphene_box_t with the minimum vertex set at (-1, -1, -1) and the
     * <br>maximum vertex set at (1, 1, 1).
     * <br>
     * <br>The returned value is owned by Graphene and should not be modified or freed.
     * @return a &#35;graphene_box_t
    */
    public static Box boxOneMinusOne()  {
        return new Box(new PointerContainer(JnaGraphene.INST().graphene_box_one_minus_one()));
    }

    /**
     * A &#35;graphene_box_t with both the minimum and maximum vertices set at (0, 0, 0).
     * <br>
     * <br>The returned value is owned by Graphene and should not be modified or freed.
     * @return a &#35;graphene_box_t
    */
    public static Box boxZero()  {
        return new Box(new PointerContainer(JnaGraphene.INST().graphene_box_zero()));
    }

    /**
     * Retrieves a constant point with all three coordinates set to 0.
     * @return a zero point
    */
    public static Point3D point3dZero()  {
        return new Point3D(new PointerContainer(JnaGraphene.INST().graphene_point3d_zero()));
    }

    /**
     * Returns a point fixed at (0, 0).
     * @return a fixed point
    */
    public static Point pointZero()  {
        return new Point(new PointerContainer(JnaGraphene.INST().graphene_point_zero()));
    }

    /**
     * Allocates a new &#35;graphene_rect_t.
     * <br>
     * <br>The contents of the returned rectangle are undefined.
     * @return the newly allocated rectangle
    */
    public static Rect rectAlloc()  {
        return new Rect(new PointerContainer(JnaGraphene.INST().graphene_rect_alloc()));
    }

    /**
     * Returns a degenerate rectangle with origin fixed at (0, 0) and
     * <br>a size of 0, 0.
     * @return a fixed rectangle
    */
    public static Rect rectZero()  {
        return new Rect(new PointerContainer(JnaGraphene.INST().graphene_rect_zero()));
    }

    /**
     * A constant pointer to a zero &#35;graphene_size_t, useful for
     * <br>equality checks and interpolations.
     * @return a constant size
    */
    public static Size sizeZero()  {
        return new Size(new PointerContainer(JnaGraphene.INST().graphene_size_zero()));
    }

    /**
     * Retrieves a constant vector with (1, 1) components.
     * @return the one vector
    */
    public static Vec2 vec2One()  {
        return new Vec2(new PointerContainer(JnaGraphene.INST().graphene_vec2_one()));
    }

    /**
     * Retrieves a constant vector with (1, 0) components.
     * @return the X axis vector
    */
    public static Vec2 vec2XAxis()  {
        return new Vec2(new PointerContainer(JnaGraphene.INST().graphene_vec2_x_axis()));
    }

    /**
     * Retrieves a constant vector with (0, 1) components.
     * @return the Y axis vector
    */
    public static Vec2 vec2YAxis()  {
        return new Vec2(new PointerContainer(JnaGraphene.INST().graphene_vec2_y_axis()));
    }

    /**
     * Retrieves a constant vector with (0, 0) components.
     * @return the zero vector
    */
    public static Vec2 vec2Zero()  {
        return new Vec2(new PointerContainer(JnaGraphene.INST().graphene_vec2_zero()));
    }

    /**
     * Provides a constant pointer to a vector with three components,
     * <br>all sets to 1.
     * @return a constant vector
    */
    public static Vec3 vec3One()  {
        return new Vec3(new PointerContainer(JnaGraphene.INST().graphene_vec3_one()));
    }

    /**
     * Provides a constant pointer to a vector with three components
     * <br>with values set to (1, 0, 0).
     * @return a constant vector
    */
    public static Vec3 vec3XAxis()  {
        return new Vec3(new PointerContainer(JnaGraphene.INST().graphene_vec3_x_axis()));
    }

    /**
     * Provides a constant pointer to a vector with three components
     * <br>with values set to (0, 1, 0).
     * @return a constant vector
    */
    public static Vec3 vec3YAxis()  {
        return new Vec3(new PointerContainer(JnaGraphene.INST().graphene_vec3_y_axis()));
    }

    /**
     * Provides a constant pointer to a vector with three components
     * <br>with values set to (0, 0, 1).
     * @return a constant vector
    */
    public static Vec3 vec3ZAxis()  {
        return new Vec3(new PointerContainer(JnaGraphene.INST().graphene_vec3_z_axis()));
    }

    /**
     * Provides a constant pointer to a vector with three components,
     * <br>all sets to 0.
     * @return a constant vector
    */
    public static Vec3 vec3Zero()  {
        return new Vec3(new PointerContainer(JnaGraphene.INST().graphene_vec3_zero()));
    }

    /**
     * Retrieves a pointer to a &#35;graphene_vec4_t with all its
     * <br>components set to 1.
     * @return a constant vector
    */
    public static Vec4 vec4One()  {
        return new Vec4(new PointerContainer(JnaGraphene.INST().graphene_vec4_one()));
    }

    /**
     * Retrieves a pointer to a &#35;graphene_vec4_t with its
     * <br>components set to (0, 0, 0, 1).
     * @return a constant vector
    */
    public static Vec4 vec4WAxis()  {
        return new Vec4(new PointerContainer(JnaGraphene.INST().graphene_vec4_w_axis()));
    }

    /**
     * Retrieves a pointer to a &#35;graphene_vec4_t with its
     * <br>components set to (1, 0, 0, 0).
     * @return a constant vector
    */
    public static Vec4 vec4XAxis()  {
        return new Vec4(new PointerContainer(JnaGraphene.INST().graphene_vec4_x_axis()));
    }

    /**
     * Retrieves a pointer to a &#35;graphene_vec4_t with its
     * <br>components set to (0, 1, 0, 0).
     * @return a constant vector
    */
    public static Vec4 vec4YAxis()  {
        return new Vec4(new PointerContainer(JnaGraphene.INST().graphene_vec4_y_axis()));
    }

    /**
     * Retrieves a pointer to a &#35;graphene_vec4_t with its
     * <br>components set to (0, 0, 1, 0).
     * @return a constant vector
    */
    public static Vec4 vec4ZAxis()  {
        return new Vec4(new PointerContainer(JnaGraphene.INST().graphene_vec4_z_axis()));
    }

    /**
     * Retrieves a pointer to a &#35;graphene_vec4_t with all its
     * <br>components set to 0.
     * @return a constant vector
    */
    public static Vec4 vec4Zero()  {
        return new Vec4(new PointerContainer(JnaGraphene.INST().graphene_vec4_zero()));
    }

}

/*
package-type
*/
