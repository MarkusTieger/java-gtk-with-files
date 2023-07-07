/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A structure capable of holding a 4x4 matrix.
 * <br>
 * <br>The contents of the &#35;graphene_matrix_t structure are private and
 * <br>should never be accessed directly.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Matrix extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Matrix.class.getCanonicalName());
    }

    public Matrix(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Allocates a new &#35;graphene_matrix_t.
     * @return the newly allocated matrix
    */
    public static Matrix allocMatrix()  {
        PointerContainer __self = cast(JnaMatrix.INST().graphene_matrix_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Matrix:alloc");
        }
        return new Matrix(__self);
    }        
    

    /**
     * Decomposes a transformation matrix into its component transformations.
     * <br>
     * <br>The algorithm for decomposing a matrix is taken from the
     * <br>[CSS3 Transforms specification](http://dev.w3.org/csswg/css-transforms/);
     * <br>specifically, the decomposition code is based on the equivalent code
     * <br>published in &quot;Graphics Gems II&quot;, edited by Jim Arvo, and
     * <br>[available online](http://web.archive.org/web/20150512160205/http://tog.acm.org/resources/GraphicsGems/gemsii/unmatrix.c).
     * @param translate the translation vector
     * @param scale the scale vector
     * @param rotate the rotation quaternion
     * @param shear the shear vector
     * @param perspective the perspective vector
     * @return `true` if the matrix could be decomposed
    */
    public boolean decompose(@Nonnull Vec3 translate, @Nonnull Vec3 scale, @Nonnull Quaternion rotate, @Nonnull Vec3 shear, @Nonnull Vec4 perspective)  {
        return JnaMatrix.INST().graphene_matrix_decompose(asCPointer(), asCPointerNotNull(translate), asCPointerNotNull(scale), asCPointerNotNull(rotate), asCPointerNotNull(shear), asCPointerNotNull(perspective));
    }

    /**
     * Computes the determinant of the given matrix.
     * @return the value of the determinant
    */
    public float determinant()  {
        return JnaMatrix.INST().graphene_matrix_determinant(asCPointer());
    }

    /**
     * Checks whether the two given &#35;graphene_matrix_t matrices are equal.
     * @param b a &#35;graphene_matrix_t
     * @return `true` if the two matrices are equal, and `false` otherwise
    */
    public boolean equal(@Nonnull Matrix b)  {
        return JnaMatrix.INST().graphene_matrix_equal(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Checks whether the two given &#35;graphene_matrix_t matrices are
     * <br>byte-by-byte equal.
     * <br>
     * <br>While this function is faster than graphene_matrix_equal(), it
     * <br>can also return false negatives, so it should be used in
     * <br>conjuction with either graphene_matrix_equal() or
     * <br>graphene_matrix_near(). For instance:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   if (graphene_matrix_equal_fast (a, b))
     *     {
     *       // matrices are definitely the same
     *     }
     *   else
     *     {
     *       if (graphene_matrix_equal (a, b))
     *         // matrices contain the same values within an epsilon of FLT_EPSILON
     *       else if (graphene_matrix_near (a, b, 0.0001))
     *         // matrices contain the same values within an epsilon of 0.0001
     *       else
     *         // matrices are not equal
     *     }
     * </pre>
     * @param b a &#35;graphene_matrix_t
     * @return `true` if the matrices are equal. and `false` otherwise
    */
    public boolean equalFast(@Nonnull Matrix b)  {
        return JnaMatrix.INST().graphene_matrix_equal_fast(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Frees the resources allocated by graphene_matrix_alloc().
    */
    public void free()  {
        JnaMatrix.INST().graphene_matrix_free(asCPointer());
    }

    /**
     * Retrieves the scaling factor on the X axis in &#64;m.
     * @return the value of the scaling factor
    */
    public float getXScale()  {
        return JnaMatrix.INST().graphene_matrix_get_x_scale(asCPointer());
    }

    /**
     * Retrieves the translation component on the X axis from &#64;m.
     * @return the translation component
    */
    public float getXTranslation()  {
        return JnaMatrix.INST().graphene_matrix_get_x_translation(asCPointer());
    }

    /**
     * Retrieves the scaling factor on the Y axis in &#64;m.
     * @return the value of the scaling factor
    */
    public float getYScale()  {
        return JnaMatrix.INST().graphene_matrix_get_y_scale(asCPointer());
    }

    /**
     * Retrieves the translation component on the Y axis from &#64;m.
     * @return the translation component
    */
    public float getYTranslation()  {
        return JnaMatrix.INST().graphene_matrix_get_y_translation(asCPointer());
    }

    /**
     * Retrieves the scaling factor on the Z axis in &#64;m.
     * @return the value of the scaling factor
    */
    public float getZScale()  {
        return JnaMatrix.INST().graphene_matrix_get_z_scale(asCPointer());
    }

    /**
     * Retrieves the translation component on the Z axis from &#64;m.
     * @return the translation component
    */
    public float getZTranslation()  {
        return JnaMatrix.INST().graphene_matrix_get_z_translation(asCPointer());
    }

    /**
     * Initializes a &#35;graphene_matrix_t from the values of an affine
     * <br>transformation matrix.
     * <br>
     * <br>The arguments map to the following matrix layout:
     * <br>
     * <pre>&lt;!-- language=&quot;plain&quot; --&gt;
     *   ⎛ xx  yx ⎞   ⎛  a   b  0 ⎞
     *   ⎜ xy  yy ⎟ = ⎜  c   d  0 ⎟
     *   ⎝ x0  y0 ⎠   ⎝ tx  ty  1 ⎠
     * </pre>
     * <br>
     * <br>This function can be used to convert between an affine matrix type
     * <br>from other libraries and a &#35;graphene_matrix_t.
     * @param xx the xx member
     * @param yx the yx member
     * @param xy the xy member
     * @param yy the yy member
     * @param x_0 the x0 member
     * @param y_0 the y0 member
     * @return the initialized matrix
    */
    public Matrix initFrom2d(double xx, double yx, double xy, double yy, double x_0, double y_0)  {
        return new Matrix(new PointerContainer(JnaMatrix.INST().graphene_matrix_init_from_2d(asCPointer(), xx, yx, xy, yy, x_0, y_0)));
    }

    /**
     * Initializes a &#35;graphene_matrix_t using the values of the
     * <br>given matrix.
     * @param src a &#35;graphene_matrix_t
     * @return the initialized matrix
    */
    public Matrix initFromMatrix(@Nonnull Matrix src)  {
        return new Matrix(new PointerContainer(JnaMatrix.INST().graphene_matrix_init_from_matrix(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Initializes a &#35;graphene_matrix_t with the given four row
     * <br>vectors.
     * @param v0 the first row vector
     * @param v1 the second row vector
     * @param v2 the third row vector
     * @param v3 the fourth row vector
     * @return the initialized matrix
    */
    public Matrix initFromVec4(@Nonnull Vec4 v0, @Nonnull Vec4 v1, @Nonnull Vec4 v2, @Nonnull Vec4 v3)  {
        return new Matrix(new PointerContainer(JnaMatrix.INST().graphene_matrix_init_from_vec4(asCPointer(), asCPointerNotNull(v0), asCPointerNotNull(v1), asCPointerNotNull(v2), asCPointerNotNull(v3))));
    }

    /**
     * Initializes a &#35;graphene_matrix_t compatible with &#35;graphene_frustum_t.
     * <br>
     * <br>See also: graphene_frustum_init_from_matrix()
     * @param left distance of the left clipping plane
     * @param right distance of the right clipping plane
     * @param bottom distance of the bottom clipping plane
     * @param top distance of the top clipping plane
     * @param z_near distance of the near clipping plane
     * @param z_far distance of the far clipping plane
     * @return the initialized matrix
    */
    public Matrix initFrustum(float left, float right, float bottom, float top, float z_near, float z_far)  {
        return new Matrix(new PointerContainer(JnaMatrix.INST().graphene_matrix_init_frustum(asCPointer(), left, right, bottom, top, z_near, z_far)));
    }

    /**
     * Initializes a &#35;graphene_matrix_t with the identity matrix.
     * @return the initialized matrix
    */
    public Matrix initIdentity()  {
        return new Matrix(new PointerContainer(JnaMatrix.INST().graphene_matrix_init_identity(asCPointer())));
    }

    /**
     * Initializes a &#35;graphene_matrix_t so that it positions the &quot;camera&quot;
     * <br>at the given &#64;eye coordinates towards an object at the &#64;center
     * <br>coordinates. The top of the camera is aligned to the direction
     * <br>of the &#64;up vector.
     * <br>
     * <br>Before the transform, the camera is assumed to be placed at the
     * <br>origin, looking towards the negative Z axis, with the top side of
     * <br>the camera facing in the direction of the Y axis and the right
     * <br>side in the direction of the X axis.
     * <br>
     * <br>In theory, one could use &#64;m to transform a model of such a camera
     * <br>into world-space. However, it is more common to use the inverse of
     * <br>&#64;m to transform another object from world coordinates to the view
     * <br>coordinates of the camera. Typically you would then apply the
     * <br>camera projection transform to get from view to screen
     * <br>coordinates.
     * @param eye the vector describing the position to look from
     * @param center the vector describing the position to look at
     * @param up the vector describing the world's upward direction; usually,   this is the graphene_vec3_y_axis() vector
     * @return the initialized matrix
    */
    public Matrix initLookAt(@Nonnull Vec3 eye, @Nonnull Vec3 center, @Nonnull Vec3 up)  {
        return new Matrix(new PointerContainer(JnaMatrix.INST().graphene_matrix_init_look_at(asCPointer(), asCPointerNotNull(eye), asCPointerNotNull(center), asCPointerNotNull(up))));
    }

    /**
     * Initializes a &#35;graphene_matrix_t with an orthographic projection.
     * @param left the left edge of the clipping plane
     * @param right the right edge of the clipping plane
     * @param top the top edge of the clipping plane
     * @param bottom the bottom edge of the clipping plane
     * @param z_near the distance of the near clipping plane
     * @param z_far the distance of the far clipping plane
     * @return the initialized matrix
    */
    public Matrix initOrtho(float left, float right, float top, float bottom, float z_near, float z_far)  {
        return new Matrix(new PointerContainer(JnaMatrix.INST().graphene_matrix_init_ortho(asCPointer(), left, right, top, bottom, z_near, z_far)));
    }

    /**
     * Initializes a &#35;graphene_matrix_t with a perspective projection.
     * @param fovy the field of view angle, in degrees
     * @param aspect the aspect value
     * @param z_near the near Z plane
     * @param z_far the far Z plane
     * @return the initialized matrix
    */
    public Matrix initPerspective(float fovy, float aspect, float z_near, float z_far)  {
        return new Matrix(new PointerContainer(JnaMatrix.INST().graphene_matrix_init_perspective(asCPointer(), fovy, aspect, z_near, z_far)));
    }

    /**
     * Initializes &#64;m to represent a rotation of &#64;angle degrees on
     * <br>the axis represented by the &#64;axis vector.
     * @param angle the rotation angle, in degrees
     * @param axis the axis vector as a &#35;graphene_vec3_t
     * @return the initialized matrix
    */
    public Matrix initRotate(float angle, @Nonnull Vec3 axis)  {
        return new Matrix(new PointerContainer(JnaMatrix.INST().graphene_matrix_init_rotate(asCPointer(), angle, asCPointerNotNull(axis))));
    }

    /**
     * Initializes a &#35;graphene_matrix_t with the given scaling factors.
     * @param x the scale factor on the X axis
     * @param y the scale factor on the Y axis
     * @param z the scale factor on the Z axis
     * @return the initialized matrix
    */
    public Matrix initScale(float x, float y, float z)  {
        return new Matrix(new PointerContainer(JnaMatrix.INST().graphene_matrix_init_scale(asCPointer(), x, y, z)));
    }

    /**
     * Initializes a &#35;graphene_matrix_t with a skew transformation
     * <br>with the given factors.
     * @param x_skew skew factor, in radians, on the X axis
     * @param y_skew skew factor, in radians, on the Y axis
     * @return the initialized matrix
    */
    public Matrix initSkew(float x_skew, float y_skew)  {
        return new Matrix(new PointerContainer(JnaMatrix.INST().graphene_matrix_init_skew(asCPointer(), x_skew, y_skew)));
    }

    /**
     * Initializes a &#35;graphene_matrix_t with a translation to the
     * <br>given coordinates.
     * @param p the translation coordinates
     * @return the initialized matrix
    */
    public Matrix initTranslate(@Nonnull Point3D p)  {
        return new Matrix(new PointerContainer(JnaMatrix.INST().graphene_matrix_init_translate(asCPointer(), asCPointerNotNull(p))));
    }

    /**
     * Linearly interpolates the two given &#35;graphene_matrix_t by
     * <br>interpolating the decomposed transformations separately.
     * <br>
     * <br>If either matrix cannot be reduced to their transformations
     * <br>then the interpolation cannot be performed, and this function
     * <br>will return an identity matrix.
     * @param b a &#35;graphene_matrix_t
     * @param factor the linear interpolation factor
     * @param res return location for the   interpolated matrix
    */
    public void interpolate(@Nonnull Matrix b, double factor, @Nonnull Matrix res)  {
        JnaMatrix.INST().graphene_matrix_interpolate(asCPointer(), asCPointerNotNull(b), factor, asCPointerNotNull(res));
    }

    /**
     * Inverts the given matrix.
     * @param res return location for the   inverse matrix
     * @return `true` if the matrix is invertible
    */
    public boolean inverse(@Nonnull Matrix res)  {
        return JnaMatrix.INST().graphene_matrix_inverse(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Checks whether the given &#35;graphene_matrix_t is compatible with an
     * <br>a 2D affine transformation matrix.
     * @return `true` if the matrix is compatible with an affine   transformation matrix
    */
    public boolean is2d()  {
        return JnaMatrix.INST().graphene_matrix_is_2d(asCPointer());
    }

    /**
     * Checks whether a &#35;graphene_matrix_t has a visible back face.
     * @return `true` if the back face of the matrix is visible
    */
    public boolean isBackfaceVisible()  {
        return JnaMatrix.INST().graphene_matrix_is_backface_visible(asCPointer());
    }

    /**
     * Checks whether the given &#35;graphene_matrix_t is the identity matrix.
     * @return `true` if the matrix is the identity matrix
    */
    public boolean isIdentity()  {
        return JnaMatrix.INST().graphene_matrix_is_identity(asCPointer());
    }

    /**
     * Checks whether a matrix is singular.
     * @return `true` if the matrix is singular
    */
    public boolean isSingular()  {
        return JnaMatrix.INST().graphene_matrix_is_singular(asCPointer());
    }

    /**
     * Multiplies two &#35;graphene_matrix_t.
     * <br>
     * <br>Matrix multiplication is not commutative in general; the order of the factors matters.
     * <br>The product of this multiplication is (&#64;a × &#64;b)
     * @param b a &#35;graphene_matrix_t
     * @param res return location for the matrix   result
    */
    public void multiply(@Nonnull Matrix b, @Nonnull Matrix res)  {
        JnaMatrix.INST().graphene_matrix_multiply(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Compares the two given &#35;graphene_matrix_t matrices and checks
     * <br>whether their values are within the given &#64;epsilon of each
     * <br>other.
     * @param b a &#35;graphene_matrix_t
     * @param epsilon the threshold between the two matrices
     * @return `true` if the two matrices are near each other, and   `false` otherwise
    */
    public boolean near(@Nonnull Matrix b, float epsilon)  {
        return JnaMatrix.INST().graphene_matrix_near(asCPointer(), asCPointerNotNull(b), epsilon);
    }

    /**
     * Normalizes the given &#35;graphene_matrix_t.
     * @param res return location for the normalized matrix
    */
    public void normalize(@Nonnull Matrix res)  {
        JnaMatrix.INST().graphene_matrix_normalize(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Applies a perspective of &#64;depth to the matrix.
     * @param depth the depth of the perspective
     * @param res return location for the   perspective matrix
    */
    public void perspective(float depth, @Nonnull Matrix res)  {
        JnaMatrix.INST().graphene_matrix_perspective(asCPointer(), depth, asCPointerNotNull(res));
    }

    /**
     * Prints the contents of a matrix to the standard error stream.
     * <br>
     * <br>This function is only useful for debugging; there are no guarantees
     * <br>made on the format of the output.
    */
    public void print()  {
        JnaMatrix.INST().graphene_matrix_print(asCPointer());
    }

    /**
     * Projects a &#35;graphene_point_t using the matrix &#64;m.
     * @param p a &#35;graphene_point_t
     * @param res return location for the projected   point
    */
    public void projectPoint(@Nonnull Point p, @Nonnull Point res)  {
        JnaMatrix.INST().graphene_matrix_project_point(asCPointer(), asCPointerNotNull(p), asCPointerNotNull(res));
    }

    /**
     * Projects all corners of a &#35;graphene_rect_t using the given matrix.
     * <br>
     * <br>See also: graphene_matrix_project_point()
     * @param r a &#35;graphene_rect_t
     * @param res return location for the projected   rectangle
    */
    public void projectRect(@Nonnull Rect r, @Nonnull Quad res)  {
        JnaMatrix.INST().graphene_matrix_project_rect(asCPointer(), asCPointerNotNull(r), asCPointerNotNull(res));
    }

    /**
     * Projects a &#35;graphene_rect_t using the given matrix.
     * <br>
     * <br>The resulting rectangle is the axis aligned bounding rectangle capable
     * <br>of fully containing the projected rectangle.
     * @param r a &#35;graphene_rect_t
     * @param res return location for the projected   rectangle
    */
    public void projectRectBounds(@Nonnull Rect r, @Nonnull Rect res)  {
        JnaMatrix.INST().graphene_matrix_project_rect_bounds(asCPointer(), asCPointerNotNull(r), asCPointerNotNull(res));
    }

    /**
     * Adds a rotation transformation to &#64;m, using the given &#64;angle
     * <br>and &#64;axis vector.
     * <br>
     * <br>This is the equivalent of calling graphene_matrix_init_rotate() and
     * <br>then multiplying the matrix &#64;m with the rotation matrix.
     * @param angle the rotation angle, in degrees
     * @param axis the rotation axis, as a &#35;graphene_vec3_t
    */
    public void rotate(float angle, @Nonnull Vec3 axis)  {
        JnaMatrix.INST().graphene_matrix_rotate(asCPointer(), angle, asCPointerNotNull(axis));
    }

    /**
     * Adds a rotation transformation to &#64;m, using the given
     * <br>&#35;graphene_euler_t.
     * @param e a rotation described by a &#35;graphene_euler_t
    */
    public void rotateEuler(@Nonnull Euler e)  {
        JnaMatrix.INST().graphene_matrix_rotate_euler(asCPointer(), asCPointerNotNull(e));
    }

    /**
     * Adds a rotation transformation to &#64;m, using the given
     * <br>&#35;graphene_quaternion_t.
     * <br>
     * <br>This is the equivalent of calling graphene_quaternion_to_matrix() and
     * <br>then multiplying &#64;m with the rotation matrix.
     * @param q a rotation described by a &#35;graphene_quaternion_t
    */
    public void rotateQuaternion(@Nonnull Quaternion q)  {
        JnaMatrix.INST().graphene_matrix_rotate_quaternion(asCPointer(), asCPointerNotNull(q));
    }

    /**
     * Adds a rotation transformation around the X axis to &#64;m, using
     * <br>the given &#64;angle.
     * <br>
     * <br>See also: graphene_matrix_rotate()
     * @param angle the rotation angle, in degrees
    */
    public void rotateX(float angle)  {
        JnaMatrix.INST().graphene_matrix_rotate_x(asCPointer(), angle);
    }

    /**
     * Adds a rotation transformation around the Y axis to &#64;m, using
     * <br>the given &#64;angle.
     * <br>
     * <br>See also: graphene_matrix_rotate()
     * @param angle the rotation angle, in degrees
    */
    public void rotateY(float angle)  {
        JnaMatrix.INST().graphene_matrix_rotate_y(asCPointer(), angle);
    }

    /**
     * Adds a rotation transformation around the Z axis to &#64;m, using
     * <br>the given &#64;angle.
     * <br>
     * <br>See also: graphene_matrix_rotate()
     * @param angle the rotation angle, in degrees
    */
    public void rotateZ(float angle)  {
        JnaMatrix.INST().graphene_matrix_rotate_z(asCPointer(), angle);
    }

    /**
     * Adds a scaling transformation to &#64;m, using the three
     * <br>given factors.
     * <br>
     * <br>This is the equivalent of calling graphene_matrix_init_scale() and then
     * <br>multiplying the matrix &#64;m with the scale matrix.
     * @param factor_x scaling factor on the X axis
     * @param factor_y scaling factor on the Y axis
     * @param factor_z scaling factor on the Z axis
    */
    public void scale(float factor_x, float factor_y, float factor_z)  {
        JnaMatrix.INST().graphene_matrix_scale(asCPointer(), factor_x, factor_y, factor_z);
    }

    /**
     * Adds a skew of &#64;factor on the X and Y axis to the given matrix.
     * @param factor skew factor
    */
    public void skewXy(float factor)  {
        JnaMatrix.INST().graphene_matrix_skew_xy(asCPointer(), factor);
    }

    /**
     * Adds a skew of &#64;factor on the X and Z axis to the given matrix.
     * @param factor skew factor
    */
    public void skewXz(float factor)  {
        JnaMatrix.INST().graphene_matrix_skew_xz(asCPointer(), factor);
    }

    /**
     * Adds a skew of &#64;factor on the Y and Z axis to the given matrix.
     * @param factor skew factor
    */
    public void skewYz(float factor)  {
        JnaMatrix.INST().graphene_matrix_skew_yz(asCPointer(), factor);
    }

    /**
     * Converts a &#35;graphene_matrix_t to an array of floating point
     * <br>values.
     * @param v return location   for an array of floating point values. The array must be capable   of holding at least 16 values.
    */
    public void toFloat(@Nonnull ch.bailu.gtk.type.Flt v)  {
        JnaMatrix.INST().graphene_matrix_to_float(asCPointer(), asCPointerNotNull(v));
    }

    /**
     * Transforms each corner of a &#35;graphene_rect_t using the given matrix &#64;m.
     * <br>
     * <br>The result is the axis aligned bounding rectangle containing the coplanar
     * <br>quadrilateral.
     * <br>
     * <br>See also: graphene_matrix_transform_point()
     * @param r a &#35;graphene_rect_t
     * @param res return location for the bounds   of the transformed rectangle
    */
    public void transformBounds(@Nonnull Rect r, @Nonnull Rect res)  {
        JnaMatrix.INST().graphene_matrix_transform_bounds(asCPointer(), asCPointerNotNull(r), asCPointerNotNull(res));
    }

    /**
     * Transforms the vertices of a &#35;graphene_box_t using the given matrix &#64;m.
     * <br>
     * <br>The result is the axis aligned bounding box containing the transformed
     * <br>vertices.
     * @param b a &#35;graphene_box_t
     * @param res return location for the bounds   of the transformed box
    */
    public void transformBox(@Nonnull Box b, @Nonnull Box res)  {
        JnaMatrix.INST().graphene_matrix_transform_box(asCPointer(), asCPointerNotNull(b), asCPointerNotNull(res));
    }

    /**
     * Transforms the given &#35;graphene_point_t using the matrix &#64;m.
     * <br>
     * <br>Unlike graphene_matrix_transform_vec3(), this function will take into
     * <br>account the fourth row vector of the &#35;graphene_matrix_t when computing
     * <br>the dot product of each row vector of the matrix.
     * <br>
     * <br>See also: graphene_simd4x4f_point3_mul()
     * @param p a &#35;graphene_point_t
     * @param res return location for the   transformed &#35;graphene_point_t
    */
    public void transformPoint(@Nonnull Point p, @Nonnull Point res)  {
        JnaMatrix.INST().graphene_matrix_transform_point(asCPointer(), asCPointerNotNull(p), asCPointerNotNull(res));
    }

    /**
     * Transforms the given &#35;graphene_point3d_t using the matrix &#64;m.
     * <br>
     * <br>Unlike graphene_matrix_transform_vec3(), this function will take into
     * <br>account the fourth row vector of the &#35;graphene_matrix_t when computing
     * <br>the dot product of each row vector of the matrix.
     * <br>
     * <br>See also: graphene_simd4x4f_point3_mul()
     * @param p a &#35;graphene_point3d_t
     * @param res return location for the result
    */
    public void transformPoint3d(@Nonnull Point3D p, @Nonnull Point3D res)  {
        JnaMatrix.INST().graphene_matrix_transform_point3d(asCPointer(), asCPointerNotNull(p), asCPointerNotNull(res));
    }

    /**
     * Transform a &#35;graphene_ray_t using the given matrix &#64;m.
     * @param r a &#35;graphene_ray_t
     * @param res return location for the   transformed ray
    */
    public void transformRay(@Nonnull Ray r, @Nonnull Ray res)  {
        JnaMatrix.INST().graphene_matrix_transform_ray(asCPointer(), asCPointerNotNull(r), asCPointerNotNull(res));
    }

    /**
     * Transforms each corner of a &#35;graphene_rect_t using the given matrix &#64;m.
     * <br>
     * <br>The result is a coplanar quadrilateral.
     * <br>
     * <br>See also: graphene_matrix_transform_point()
     * @param r a &#35;graphene_rect_t
     * @param res return location for the   transformed quad
    */
    public void transformRect(@Nonnull Rect r, @Nonnull Quad res)  {
        JnaMatrix.INST().graphene_matrix_transform_rect(asCPointer(), asCPointerNotNull(r), asCPointerNotNull(res));
    }

    /**
     * Transforms a &#35;graphene_sphere_t using the given matrix &#64;m. The
     * <br>result is the bounding sphere containing the transformed sphere.
     * @param s a &#35;graphene_sphere_t
     * @param res return location for the bounds   of the transformed sphere
    */
    public void transformSphere(@Nonnull Sphere s, @Nonnull Sphere res)  {
        JnaMatrix.INST().graphene_matrix_transform_sphere(asCPointer(), asCPointerNotNull(s), asCPointerNotNull(res));
    }

    /**
     * Transforms the given &#35;graphene_vec3_t using the matrix &#64;m.
     * <br>
     * <br>This function will multiply the X, Y, and Z row vectors of the matrix &#64;m
     * <br>with the corresponding components of the vector &#64;v. The W row vector will
     * <br>be ignored.
     * <br>
     * <br>See also: graphene_simd4x4f_vec3_mul()
     * @param v a &#35;graphene_vec3_t
     * @param res return location for a &#35;graphene_vec3_t
    */
    public void transformVec3(@Nonnull Vec3 v, @Nonnull Vec3 res)  {
        JnaMatrix.INST().graphene_matrix_transform_vec3(asCPointer(), asCPointerNotNull(v), asCPointerNotNull(res));
    }

    /**
     * Transforms the given &#35;graphene_vec4_t using the matrix &#64;m.
     * <br>
     * <br>See also: graphene_simd4x4f_vec4_mul()
     * @param v a &#35;graphene_vec4_t
     * @param res return location for a &#35;graphene_vec4_t
    */
    public void transformVec4(@Nonnull Vec4 v, @Nonnull Vec4 res)  {
        JnaMatrix.INST().graphene_matrix_transform_vec4(asCPointer(), asCPointerNotNull(v), asCPointerNotNull(res));
    }

    /**
     * Adds a translation transformation to &#64;m using the coordinates
     * <br>of the given &#35;graphene_point3d_t.
     * <br>
     * <br>This is the equivalent of calling graphene_matrix_init_translate() and
     * <br>then multiplying &#64;m with the translation matrix.
     * @param pos a &#35;graphene_point3d_t
    */
    public void translate(@Nonnull Point3D pos)  {
        JnaMatrix.INST().graphene_matrix_translate(asCPointer(), asCPointerNotNull(pos));
    }

    /**
     * Transposes the given matrix.
     * @param res return location for the   transposed matrix
    */
    public void transpose(@Nonnull Matrix res)  {
        JnaMatrix.INST().graphene_matrix_transpose(asCPointer(), asCPointerNotNull(res));
    }

    /**
     * Unprojects the given &#64;point using the &#64;projection matrix and
     * <br>a &#64;modelview matrix.
     * @param modelview a &#35;graphene_matrix_t for the modelview matrix; this is   the inverse of the modelview used when projecting the point
     * @param point a &#35;graphene_point3d_t with the coordinates of the point
     * @param res return location for the unprojected   point
    */
    public void unprojectPoint3d(@Nonnull Matrix modelview, @Nonnull Point3D point, @Nonnull Point3D res)  {
        JnaMatrix.INST().graphene_matrix_unproject_point3d(asCPointer(), asCPointerNotNull(modelview), asCPointerNotNull(point), asCPointerNotNull(res));
    }

    /**
     * Undoes the transformation on the corners of a &#35;graphene_rect_t using the
     * <br>given matrix, within the given axis aligned rectangular &#64;bounds.
     * @param r a &#35;graphene_rect_t
     * @param bounds the bounds of the transformation
     * @param res return location for the   untransformed rectangle
    */
    public void untransformBounds(@Nonnull Rect r, @Nonnull Rect bounds, @Nonnull Rect res)  {
        JnaMatrix.INST().graphene_matrix_untransform_bounds(asCPointer(), asCPointerNotNull(r), asCPointerNotNull(bounds), asCPointerNotNull(res));
    }

    /**
     * Undoes the transformation of a &#35;graphene_point_t using the
     * <br>given matrix, within the given axis aligned rectangular &#64;bounds.
     * @param p a &#35;graphene_point_t
     * @param bounds the bounds of the transformation
     * @param res return location for the   untransformed point
     * @return `true` if the point was successfully untransformed
    */
    public boolean untransformPoint(@Nonnull Point p, @Nonnull Rect bounds, @Nonnull Point res)  {
        return JnaMatrix.INST().graphene_matrix_untransform_point(asCPointer(), asCPointerNotNull(p), asCPointerNotNull(bounds), asCPointerNotNull(res));
    }

    public static long getTypeID() { 
        return JnaMatrix.INST().graphene_matrix_get_type(); 
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

[MethodModel:java-type-not-supported:getRow:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:unsigned int}}:{j:}]
        [ParameterModel:Supported:{Gg:Vec4:{c:graphene_vec4_t*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:getValue:[ParameterModel:Supported:{G_::{c:float}}:{j:float}]]
        [ParameterModel:java-type-not-supported:{G_::{c:unsigned int}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:unsigned int}}:{j:}]

[MethodModel:java-type-not-supported:initFromFloat:[ParameterModel:Supported:{Gg:Matrix:{c:graphene_matrix_t*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const float*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:to2d:[ParameterModel:Supported:{G_::{c:_Bool}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]

[FieldModel:value:direct-type:{Gg:Simd4X4F:{c:graphene_simd4x4f_t}}:{j:long}]
*/
