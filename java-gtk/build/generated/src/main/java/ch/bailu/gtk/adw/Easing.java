/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/</a></p>
*/
public interface Easing {

    /**
     * Linear tweening.
    */
    int LINEAR = 0;

    /**
     * Quadratic tweening.
    */
    int EASE_IN_QUAD = 1;

    /**
     * Quadratic tweening, inverse of `ADW_EASE_IN_QUAD`.
    */
    int EASE_OUT_QUAD = 2;

    /**
     * Quadratic tweening, combining `ADW_EASE_IN_QUAD` and
     * <br>  `ADW_EASE_OUT_QUAD`.
    */
    int EASE_IN_OUT_QUAD = 3;

    /**
     * Cubic tweening.
    */
    int EASE_IN_CUBIC = 4;

    /**
     * Cubic tweening, inverse of `ADW_EASE_IN_CUBIC`.
    */
    int EASE_OUT_CUBIC = 5;

    /**
     * Cubic tweening, combining `ADW_EASE_IN_CUBIC` and
     * <br>  `ADW_EASE_OUT_CUBIC`.
    */
    int EASE_IN_OUT_CUBIC = 6;

    /**
     * Quartic tweening.
    */
    int EASE_IN_QUART = 7;

    /**
     * Quartic tweening, inverse of `ADW_EASE_IN_QUART`.
    */
    int EASE_OUT_QUART = 8;

    /**
     * Quartic tweening, combining `ADW_EASE_IN_QUART` and
     * <br>  `ADW_EASE_OUT_QUART`.
    */
    int EASE_IN_OUT_QUART = 9;

    /**
     * Quintic tweening.
    */
    int EASE_IN_QUINT = 10;

    /**
     * Quintic tweening, inverse of `ADW_EASE_IN_QUINT`.
    */
    int EASE_OUT_QUINT = 11;

    /**
     * Quintic tweening, combining `ADW_EASE_IN_QUINT` and
     * <br>  `ADW_EASE_OUT_QUINT`.
    */
    int EASE_IN_OUT_QUINT = 12;

    /**
     * Sine wave tweening.
    */
    int EASE_IN_SINE = 13;

    /**
     * Sine wave tweening, inverse of `ADW_EASE_IN_SINE`.
    */
    int EASE_OUT_SINE = 14;

    /**
     * Sine wave tweening, combining `ADW_EASE_IN_SINE` and
     * <br>  `ADW_EASE_OUT_SINE`.
    */
    int EASE_IN_OUT_SINE = 15;

    /**
     * Exponential tweening.
    */
    int EASE_IN_EXPO = 16;

    /**
     * Exponential tweening, inverse of `ADW_EASE_IN_EXPO`.
    */
    int EASE_OUT_EXPO = 17;

    /**
     * Exponential tweening, combining `ADW_EASE_IN_EXPO` and
     * <br>  `ADW_EASE_OUT_EXPO`.
    */
    int EASE_IN_OUT_EXPO = 18;

    /**
     * Circular tweening.
    */
    int EASE_IN_CIRC = 19;

    /**
     * Circular tweening, inverse of `ADW_EASE_IN_CIRC`.
    */
    int EASE_OUT_CIRC = 20;

    /**
     * Circular tweening, combining `ADW_EASE_IN_CIRC` and
     * <br>  `ADW_EASE_OUT_CIRC`.
    */
    int EASE_IN_OUT_CIRC = 21;

    /**
     * Elastic tweening, with offshoot on start.
    */
    int EASE_IN_ELASTIC = 22;

    /**
     * Elastic tweening, with offshoot on end, inverse of
     * <br>  `ADW_EASE_IN_ELASTIC`.
    */
    int EASE_OUT_ELASTIC = 23;

    /**
     * Elastic tweening, with offshoot on both ends,
     * <br>  combining `ADW_EASE_IN_ELASTIC` and `ADW_EASE_OUT_ELASTIC`.
    */
    int EASE_IN_OUT_ELASTIC = 24;

    /**
     * Overshooting cubic tweening, with backtracking on start.
    */
    int EASE_IN_BACK = 25;

    /**
     * Overshooting cubic tweening, with backtracking on end,
     * <br>  inverse of `ADW_EASE_IN_BACK`.
    */
    int EASE_OUT_BACK = 26;

    /**
     * Overshooting cubic tweening, with backtracking on both
     * <br>  ends, combining `ADW_EASE_IN_BACK` and `ADW_EASE_OUT_BACK`.
    */
    int EASE_IN_OUT_BACK = 27;

    /**
     * Exponentially decaying parabolic (bounce) tweening,
     * <br>  on start.
    */
    int EASE_IN_BOUNCE = 28;

    /**
     * Exponentially decaying parabolic (bounce) tweening,
     * <br>  with bounce on end, inverse of `ADW_EASE_IN_BOUNCE`.
    */
    int EASE_OUT_BOUNCE = 29;

    /**
     * Exponentially decaying parabolic (bounce) tweening,
     * <br>  with bounce on both ends, combining `ADW_EASE_IN_BOUNCE` and
     * <br>  `ADW_EASE_OUT_BOUNCE`.
    */
    int EASE_IN_OUT_BOUNCE = 30;

}

/*
enumeration-type
*/
