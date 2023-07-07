/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoFontMetrics` structure holds the overall metric information
 * <br>for a font.
 * <br>
 * <br>The information in a `PangoFontMetrics` structure may be restricted
 * <br>to a script. The fields of this structure are private to implementations
 * <br>of a font backend. See the documentation of the corresponding getters
 * <br>for documentation of their meaning.
 * <br>
 * <br>For an overview of the most important metrics, see:
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;fontmetrics-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img alt=&quot;Font metrics&quot; src=&quot;fontmetrics-light.png&quot;&gt;
 * <br>&lt;/picture&gt;
 * <p><a href="https://docs.gtk.org/Pango/struct.FontMetrics.html">https://docs.gtk.org/Pango/struct.FontMetrics.html</a></p>
*/
public class FontMetrics extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontMetrics.class.getCanonicalName());
    }

    public FontMetrics(PointerContainer pointer) {
        super(pointer);
    }

    public FontMetrics() {
        super(cast(JnaFontMetrics.allocateStructure()));
    }

    private JnaFontMetrics.Fields _fields;
    
    JnaFontMetrics.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFontMetrics.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String REF_COUNT = "ref_count";

    /**
     * 
    */
    public int getFieldRefCount() {
       toFields().readField(REF_COUNT);
       return toFields().ref_count;
    } 

    /**
     * 
    */
    public static final String ASCENT = "ascent";

    /**
     * 
    */
    public int getFieldAscent() {
       toFields().readField(ASCENT);
       return toFields().ascent;
    } 

    /**
     * 
    */
    public static final String DESCENT = "descent";

    /**
     * 
    */
    public int getFieldDescent() {
       toFields().readField(DESCENT);
       return toFields().descent;
    } 

    /**
     * 
    */
    public static final String HEIGHT = "height";

    /**
     * 
    */
    public int getFieldHeight() {
       toFields().readField(HEIGHT);
       return toFields().height;
    } 

    /**
     * 
    */
    public static final String APPROXIMATE_CHAR_WIDTH = "approximate_char_width";

    /**
     * 
    */
    public int getFieldApproximateCharWidth() {
       toFields().readField(APPROXIMATE_CHAR_WIDTH);
       return toFields().approximate_char_width;
    } 

    /**
     * 
    */
    public static final String APPROXIMATE_DIGIT_WIDTH = "approximate_digit_width";

    /**
     * 
    */
    public int getFieldApproximateDigitWidth() {
       toFields().readField(APPROXIMATE_DIGIT_WIDTH);
       return toFields().approximate_digit_width;
    } 

    /**
     * 
    */
    public static final String UNDERLINE_POSITION = "underline_position";

    /**
     * 
    */
    public int getFieldUnderlinePosition() {
       toFields().readField(UNDERLINE_POSITION);
       return toFields().underline_position;
    } 

    /**
     * 
    */
    public static final String UNDERLINE_THICKNESS = "underline_thickness";

    /**
     * 
    */
    public int getFieldUnderlineThickness() {
       toFields().readField(UNDERLINE_THICKNESS);
       return toFields().underline_thickness;
    } 

    /**
     * 
    */
    public static final String STRIKETHROUGH_POSITION = "strikethrough_position";

    /**
     * 
    */
    public int getFieldStrikethroughPosition() {
       toFields().readField(STRIKETHROUGH_POSITION);
       return toFields().strikethrough_position;
    } 

    /**
     * 
    */
    public static final String STRIKETHROUGH_THICKNESS = "strikethrough_thickness";

    /**
     * 
    */
    public int getFieldStrikethroughThickness() {
       toFields().readField(STRIKETHROUGH_THICKNESS);
       return toFields().strikethrough_thickness;
    } 

    /**
     * Gets the approximate character width for a font metrics structure.
     * <br>
     * <br>This is merely a representative value useful, for example, for
     * <br>determining the initial size for a window. Actual characters in
     * <br>text will be wider and narrower than this.
     * @return the character width, in Pango units.
    */
    public int getApproximateCharWidth()  {
        return JnaFontMetrics.INST().pango_font_metrics_get_approximate_char_width(asCPointer());
    }

    /**
     * Gets the approximate digit width for a font metrics structure.
     * <br>
     * <br>This is merely a representative value useful, for example, for
     * <br>determining the initial size for a window. Actual digits in
     * <br>text can be wider or narrower than this, though this value
     * <br>is generally somewhat more accurate than the result of
     * <br>pango_font_metrics_get_approximate_char_width() for digits.
     * @return the digit width, in Pango units.
    */
    public int getApproximateDigitWidth()  {
        return JnaFontMetrics.INST().pango_font_metrics_get_approximate_digit_width(asCPointer());
    }

    /**
     * Gets the ascent from a font metrics structure.
     * <br>
     * <br>The ascent is the distance from the baseline to the logical top
     * <br>of a line of text. (The logical top may be above or below the top
     * <br>of the actual drawn ink. It is necessary to lay out the text to
     * <br>figure where the ink will be.)
     * @return the ascent, in Pango units.
    */
    public int getAscent()  {
        return JnaFontMetrics.INST().pango_font_metrics_get_ascent(asCPointer());
    }

    /**
     * Gets the descent from a font metrics structure.
     * <br>
     * <br>The descent is the distance from the baseline to the logical bottom
     * <br>of a line of text. (The logical bottom may be above or below the
     * <br>bottom of the actual drawn ink. It is necessary to lay out the text
     * <br>to figure where the ink will be.)
     * @return the descent, in Pango units.
    */
    public int getDescent()  {
        return JnaFontMetrics.INST().pango_font_metrics_get_descent(asCPointer());
    }

    /**
     * Gets the line height from a font metrics structure.
     * <br>
     * <br>The line height is the recommended distance between successive
     * <br>baselines in wrapped text using this font.
     * <br>
     * <br>If the line height is not available, 0 is returned.
     * @return the height, in Pango units
    */
    public int getHeight()  {
        return JnaFontMetrics.INST().pango_font_metrics_get_height(asCPointer());
    }

    /**
     * Gets the suggested position to draw the strikethrough.
     * <br>
     * <br>The value returned is the distance *above* the
     * <br>baseline of the top of the strikethrough.
     * @return the suggested strikethrough position, in Pango units.
    */
    public int getStrikethroughPosition()  {
        return JnaFontMetrics.INST().pango_font_metrics_get_strikethrough_position(asCPointer());
    }

    /**
     * Gets the suggested thickness to draw for the strikethrough.
     * @return the suggested strikethrough thickness, in Pango units.
    */
    public int getStrikethroughThickness()  {
        return JnaFontMetrics.INST().pango_font_metrics_get_strikethrough_thickness(asCPointer());
    }

    /**
     * Gets the suggested position to draw the underline.
     * <br>
     * <br>The value returned is the distance *above* the baseline of the top
     * <br>of the underline. Since most fonts have underline positions beneath
     * <br>the baseline, this value is typically negative.
     * @return the suggested underline position, in Pango units.
    */
    public int getUnderlinePosition()  {
        return JnaFontMetrics.INST().pango_font_metrics_get_underline_position(asCPointer());
    }

    /**
     * Gets the suggested thickness to draw for the underline.
     * @return the suggested underline thickness, in Pango units.
    */
    public int getUnderlineThickness()  {
        return JnaFontMetrics.INST().pango_font_metrics_get_underline_thickness(asCPointer());
    }

    /**
     * Increase the reference count of a font metrics structure by one.
     * @return &#64;metrics
    */
    public FontMetrics ref()  {
        return new FontMetrics(new PointerContainer(JnaFontMetrics.INST().pango_font_metrics_ref(asCPointer())));
    }

    /**
     * Decrease the reference count of a font metrics structure by one.
     * <br>
     * <br>If the result is zero, frees the structure and any associated memory.
    */
    public void unref()  {
        JnaFontMetrics.INST().pango_font_metrics_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaFontMetrics.INST().pango_font_metrics_get_type(); 
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
