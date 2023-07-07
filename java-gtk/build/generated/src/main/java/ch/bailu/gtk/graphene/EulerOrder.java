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
public interface EulerOrder {

    /**
     * Rotate in the default order; the
     * <br>  default order is one of the following enumeration values
    */
    int DEFAULT = -1;

    /**
     * Rotate in the X, Y, and Z order. Deprecated in
     * <br>  Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SXYZ
    */
    int XYZ = 0;

    /**
     * Rotate in the Y, Z, and X order. Deprecated in
     * <br>  Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SYZX
    */
    int YZX = 1;

    /**
     * Rotate in the Z, X, and Y order. Deprecated in
     * <br>  Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SZXY
    */
    int ZXY = 2;

    /**
     * Rotate in the X, Z, and Y order. Deprecated in
     * <br>  Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SXZY
    */
    int XZY = 3;

    /**
     * Rotate in the Y, X, and Z order. Deprecated in
     * <br>  Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SYXZ
    */
    int YXZ = 4;

    /**
     * Rotate in the Z, Y, and X order. Deprecated in
     * <br>  Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SZYX
    */
    int ZYX = 5;

    /**
     * Defines a static rotation along the X, Y, and Z axes (Since: 1.10)
    */
    int SXYZ = 6;

    /**
     * Defines a static rotation along the X, Y, and X axes (Since: 1.10)
    */
    int SXYX = 7;

    /**
     * Defines a static rotation along the X, Z, and Y axes (Since: 1.10)
    */
    int SXZY = 8;

    /**
     * Defines a static rotation along the X, Z, and X axes (Since: 1.10)
    */
    int SXZX = 9;

    /**
     * Defines a static rotation along the Y, Z, and X axes (Since: 1.10)
    */
    int SYZX = 10;

    /**
     * Defines a static rotation along the Y, Z, and Y axes (Since: 1.10)
    */
    int SYZY = 11;

    /**
     * Defines a static rotation along the Y, X, and Z axes (Since: 1.10)
    */
    int SYXZ = 12;

    /**
     * Defines a static rotation along the Y, X, and Y axes (Since: 1.10)
    */
    int SYXY = 13;

    /**
     * Defines a static rotation along the Z, X, and Y axes (Since: 1.10)
    */
    int SZXY = 14;

    /**
     * Defines a static rotation along the Z, X, and Z axes (Since: 1.10)
    */
    int SZXZ = 15;

    /**
     * Defines a static rotation along the Z, Y, and X axes (Since: 1.10)
    */
    int SZYX = 16;

    /**
     * Defines a static rotation along the Z, Y, and Z axes (Since: 1.10)
    */
    int SZYZ = 17;

    /**
     * Defines a relative rotation along the Z, Y, and X axes (Since: 1.10)
    */
    int RZYX = 18;

    /**
     * Defines a relative rotation along the X, Y, and X axes (Since: 1.10)
    */
    int RXYX = 19;

    /**
     * Defines a relative rotation along the Y, Z, and X axes (Since: 1.10)
    */
    int RYZX = 20;

    /**
     * Defines a relative rotation along the X, Z, and X axes (Since: 1.10)
    */
    int RXZX = 21;

    /**
     * Defines a relative rotation along the X, Z, and Y axes (Since: 1.10)
    */
    int RXZY = 22;

    /**
     * Defines a relative rotation along the Y, Z, and Y axes (Since: 1.10)
    */
    int RYZY = 23;

    /**
     * Defines a relative rotation along the Z, X, and Y axes (Since: 1.10)
    */
    int RZXY = 24;

    /**
     * Defines a relative rotation along the Y, X, and Y axes (Since: 1.10)
    */
    int RYXY = 25;

    /**
     * Defines a relative rotation along the Y, X, and Z axes (Since: 1.10)
    */
    int RYXZ = 26;

    /**
     * Defines a relative rotation along the Z, X, and Z axes (Since: 1.10)
    */
    int RZXZ = 27;

    /**
     * Defines a relative rotation along the X, Y, and Z axes (Since: 1.10)
    */
    int RXYZ = 28;

    /**
     * Defines a relative rotation along the Z, Y, and Z axes (Since: 1.10)
    */
    int RZYZ = 29;

}

/*
enumeration-type
*/
