/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface TransformCategory {

    /**
     * The category of the matrix has not been
     * <br>  determined.
    */
    int UNKNOWN = 0;

    /**
     * Analyzing the matrix concluded that it does
     * <br>  not fit in any other category.
    */
    int ANY = 1;

    /**
     * The matrix is a 3D matrix. This means that
     * <br>  the w column (the last column) has the values (0, 0, 0, 1).
    */
    int _3D = 2;

    /**
     * The matrix is a 2D matrix. This is equivalent
     * <br>  to graphene_matrix_is_2d() returning %TRUE. In particular, this
     * <br>  means that Cairo can deal with the matrix.
    */
    int _2D = 3;

    /**
     * The matrix is a combination of 2D scale
     * <br>  and 2D translation operations. In particular, this means that any
     * <br>  rectangle can be transformed exactly using this matrix.
    */
    int _2D_AFFINE = 4;

    /**
     * The matrix is a 2D translation.
    */
    int _2D_TRANSLATE = 5;

    /**
     * The matrix is the identity matrix.
    */
    int IDENTITY = 6;

}

/*
enumeration-type
*/
