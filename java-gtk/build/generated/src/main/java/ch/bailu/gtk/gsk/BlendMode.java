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
public interface BlendMode {

    /**
     * The default blend mode, which specifies no blending
    */
    int DEFAULT = 0;

    /**
     * The source color is multiplied by the destination
     * <br>  and replaces the destination
    */
    int MULTIPLY = 1;

    /**
     * Multiplies the complements of the destination and source
     * <br>  color values, then complements the result.
    */
    int SCREEN = 2;

    /**
     * Multiplies or screens the colors, depending on the
     * <br>  destination color value. This is the inverse of hard-list
    */
    int OVERLAY = 3;

    /**
     * Selects the darker of the destination and source colors
    */
    int DARKEN = 4;

    /**
     * Selects the lighter of the destination and source colors
    */
    int LIGHTEN = 5;

    /**
     * Brightens the destination color to reflect the source color
    */
    int COLOR_DODGE = 6;

    /**
     * Darkens the destination color to reflect the source color
    */
    int COLOR_BURN = 7;

    /**
     * Multiplies or screens the colors, depending on the source color value
    */
    int HARD_LIGHT = 8;

    /**
     * Darkens or lightens the colors, depending on the source color value
    */
    int SOFT_LIGHT = 9;

    /**
     * Subtracts the darker of the two constituent colors from the lighter color
    */
    int DIFFERENCE = 10;

    /**
     * Produces an effect similar to that of the difference mode but lower in contrast
    */
    int EXCLUSION = 11;

    /**
     * Creates a color with the hue and saturation of the source color and the luminosity of the destination color
    */
    int COLOR = 12;

    /**
     * Creates a color with the hue of the source color and the saturation and luminosity of the destination color
    */
    int HUE = 13;

    /**
     * Creates a color with the saturation of the source color and the hue and luminosity of the destination color
    */
    int SATURATION = 14;

    /**
     * Creates a color with the luminosity of the source color and the hue and saturation of the destination color
    */
    int LUMINOSITY = 15;

}

/*
enumeration-type
*/
