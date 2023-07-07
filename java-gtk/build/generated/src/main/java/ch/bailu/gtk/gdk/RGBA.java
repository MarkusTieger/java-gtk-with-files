/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkRGBA` is used to represent a color, in a way that is compatible
 * <br>with cairo’s notion of color.
 * <br>
 * <br>`GdkRGBA` is a convenient way to pass colors around. It’s based on
 * <br>cairo’s way to deal with colors and mirrors its behavior. All values
 * <br>are in the range from 0.0 to 1.0 inclusive. So the color
 * <br>(0.0, 0.0, 0.0, 0.0) represents transparent black and
 * <br>(1.0, 1.0, 1.0, 1.0) is opaque white. Other values will
 * <br>be clamped to this range when drawing.
 * <p><a href="https://docs.gtk.org/gdk4/struct.RGBA.html">https://docs.gtk.org/gdk4/struct.RGBA.html</a></p>
*/
public class RGBA extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RGBA.class.getCanonicalName());
    }

    public RGBA(PointerContainer pointer) {
        super(pointer);
    }

    public RGBA() {
        super(cast(JnaRGBA.allocateStructure()));
    }

    private JnaRGBA.Fields _fields;
    
    JnaRGBA.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRGBA.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The intensity of the red channel from 0.0 to 1.0 inclusive
    */
    public static final String RED = "red";

    /**
     * The intensity of the red channel from 0.0 to 1.0 inclusive
    */
    public void setFieldRed(float red) {
        toFields().red = red;
        toFields().writeField(RED);
    }

    /**
     * The intensity of the red channel from 0.0 to 1.0 inclusive
    */
    public float getFieldRed() {
       toFields().readField(RED);
       return toFields().red;
    } 

    /**
     * The intensity of the green channel from 0.0 to 1.0 inclusive
    */
    public static final String GREEN = "green";

    /**
     * The intensity of the green channel from 0.0 to 1.0 inclusive
    */
    public void setFieldGreen(float green) {
        toFields().green = green;
        toFields().writeField(GREEN);
    }

    /**
     * The intensity of the green channel from 0.0 to 1.0 inclusive
    */
    public float getFieldGreen() {
       toFields().readField(GREEN);
       return toFields().green;
    } 

    /**
     * The intensity of the blue channel from 0.0 to 1.0 inclusive
    */
    public static final String BLUE = "blue";

    /**
     * The intensity of the blue channel from 0.0 to 1.0 inclusive
    */
    public void setFieldBlue(float blue) {
        toFields().blue = blue;
        toFields().writeField(BLUE);
    }

    /**
     * The intensity of the blue channel from 0.0 to 1.0 inclusive
    */
    public float getFieldBlue() {
       toFields().readField(BLUE);
       return toFields().blue;
    } 

    /**
     * The opacity of the color from 0.0 for completely translucent to
     * <br>  1.0 for opaque
    */
    public static final String ALPHA = "alpha";

    /**
     * The opacity of the color from 0.0 for completely translucent to
     * <br>  1.0 for opaque
    */
    public void setFieldAlpha(float alpha) {
        toFields().alpha = alpha;
        toFields().writeField(ALPHA);
    }

    /**
     * The opacity of the color from 0.0 for completely translucent to
     * <br>  1.0 for opaque
    */
    public float getFieldAlpha() {
       toFields().readField(ALPHA);
       return toFields().alpha;
    } 

    /**
     * Makes a copy of a `GdkRGBA`.
     * <br>
     * <br>The result must be freed through [method&#64;Gdk.RGBA.free].
     * @return A newly allocated `GdkRGBA`, with the same contents as &#64;rgba
    */
    public RGBA copy()  {
        return new RGBA(new PointerContainer(JnaRGBA.INST().gdk_rgba_copy(asCPointer())));
    }

    /**
     * Compares two `GdkRGBA` colors.
     * @param p2 another `GdkRGBA`
     * @return %TRUE if the two colors compare equal
    */
    public boolean equal(@Nonnull ch.bailu.gtk.type.Pointer p2)  {
        return JnaRGBA.INST().gdk_rgba_equal(asCPointer(), asCPointerNotNull(p2));
    }

    /**
     * Frees a `GdkRGBA`.
    */
    public void free()  {
        JnaRGBA.INST().gdk_rgba_free(asCPointer());
    }

    /**
     * A hash function suitable for using for a hash
     * <br>table that stores `GdkRGBA`s.
     * @return The hash value for &#64;p
    */
    public int hash()  {
        return JnaRGBA.INST().gdk_rgba_hash(asCPointer());
    }

    /**
     * Checks if an &#64;rgba value is transparent.
     * <br>
     * <br>That is, drawing with the value would not produce any change.
     * @return %TRUE if the &#64;rgba is clear
    */
    public boolean isClear()  {
        return JnaRGBA.INST().gdk_rgba_is_clear(asCPointer());
    }

    /**
     * Checks if an &#64;rgba value is opaque.
     * <br>
     * <br>That is, drawing with the value will not retain any results
     * <br>from previous contents.
     * @return %TRUE if the &#64;rgba is opaque
    */
    public boolean isOpaque()  {
        return JnaRGBA.INST().gdk_rgba_is_opaque(asCPointer());
    }

    /**
     * Parses a textual representation of a color.
     * <br>
     * <br>The string can be either one of:
     * <br>
     * <br>- A standard name (Taken from the Css specification).
     * <br>- A hexadecimal value in the form “&#92;&#35;rgb”, “&#92;&#35;rrggbb”,
     * <br>  “&#92;&#35;rrrgggbbb” or ”&#92;&#35;rrrrggggbbbb”
     * <br>- A hexadecimal value in the form “&#92;&#35;rgba”, “&#92;&#35;rrggbbaa”,
     * <br>  or ”&#92;&#35;rrrrggggbbbbaaaa”
     * <br>- A RGB color in the form “rgb(r,g,b)” (In this case the color
     * <br>  will have full opacity)
     * <br>- A RGBA color in the form “rgba(r,g,b,a)”
     * <br>
     * <br>Where “r”, “g”, “b” and “a” are respectively the red, green,
     * <br>blue and alpha color values. In the last two cases, “r”, “g”,
     * <br>and “b” are either integers in the range 0 to 255 or percentage
     * <br>values in the range 0% to 100%, and a is a floating point value
     * <br>in the range 0 to 1.
     * @param spec the string specifying the color
     * @return %TRUE if the parsing succeeded
    */
    public boolean parse(@Nonnull ch.bailu.gtk.type.Str spec)  {
        return JnaRGBA.INST().gdk_rgba_parse(asCPointer(), asCPointerNotNull(spec));
    }

    /**
     * Parses a textual representation of a color.
     * <br>
     * <br>The string can be either one of:
     * <br>
     * <br>- A standard name (Taken from the Css specification).
     * <br>- A hexadecimal value in the form “&#92;&#35;rgb”, “&#92;&#35;rrggbb”,
     * <br>  “&#92;&#35;rrrgggbbb” or ”&#92;&#35;rrrrggggbbbb”
     * <br>- A hexadecimal value in the form “&#92;&#35;rgba”, “&#92;&#35;rrggbbaa”,
     * <br>  or ”&#92;&#35;rrrrggggbbbbaaaa”
     * <br>- A RGB color in the form “rgb(r,g,b)” (In this case the color
     * <br>  will have full opacity)
     * <br>- A RGBA color in the form “rgba(r,g,b,a)”
     * <br>
     * <br>Where “r”, “g”, “b” and “a” are respectively the red, green,
     * <br>blue and alpha color values. In the last two cases, “r”, “g”,
     * <br>and “b” are either integers in the range 0 to 255 or percentage
     * <br>values in the range 0% to 100%, and a is a floating point value
     * <br>in the range 0 to 1.
     * @param spec the string specifying the color
     * @return %TRUE if the parsing succeeded
    */
    public boolean parse(String spec)  {
        return JnaRGBA.INST().gdk_rgba_parse(asCPointer(), spec);
    }

    /**
     * Returns a textual specification of &#64;rgba in the form
     * <br>`rgb(r,g,b)` or `rgba(r,g,b,a)`, where “r”, “g”, “b” and
     * <br>“a” represent the red, green, blue and alpha values
     * <br>respectively. “r”, “g”, and “b” are represented as integers
     * <br>in the range 0 to 255, and “a” is represented as a floating
     * <br>point value in the range 0 to 1.
     * <br>
     * <br>These string forms are string forms that are supported by
     * <br>the CSS3 colors module, and can be parsed by [method&#64;Gdk.RGBA.parse].
     * <br>
     * <br>Note that this string representation may lose some precision,
     * <br>since “r”, “g” and “b” are represented as 8-bit integers. If
     * <br>this is a concern, you should use a different representation.
     * @return A newly allocated text string
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRGBA.INST().gdk_rgba_to_string(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaRGBA.INST().gdk_rgba_get_type(); 
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
