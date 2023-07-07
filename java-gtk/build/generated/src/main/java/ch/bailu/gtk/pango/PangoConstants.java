/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface PangoConstants {

    /**
     * Whether the segment should be shifted to center around the baseline.
     * <br>
     * <br>This is mainly used in vertical writing directions.
    */
    int ANALYSIS_FLAG_CENTERED_BASELINE = 1;

    /**
     * Whether this run holds ellipsized text.
    */
    int ANALYSIS_FLAG_IS_ELLIPSIS = 2;

    /**
     * Whether to add a hyphen at the end of the run during shaping.
    */
    int ANALYSIS_FLAG_NEED_HYPHEN = 4;

    /**
     * Value for &#64;start_index in `PangoAttribute` that indicates
     * <br>the beginning of the text.
    */
    int ATTR_INDEX_FROM_TEXT_BEGINNING = 0;

    /**
     * The scale between dimensions used for Pango distances and device units.
     * <br>
     * <br>The definition of device units is dependent on the output device; it will
     * <br>typically be pixels for a screen, and points for a printer. %PANGO_SCALE is
     * <br>currently 1024, but this may be changed in the future.
     * <br>
     * <br>When setting font sizes, device units are always considered to be
     * <br>points (as in &quot;12 point font&quot;), rather than pixels.
    */
    int SCALE = 1024;

    /**
     * The major component of the version of Pango available at compile-time.
    */
    int VERSION_MAJOR = 1;

    /**
     * The micro component of the version of Pango available at compile-time.
    */
    int VERSION_MICRO = 12;

    /**
     * The minor component of the version of Pango available at compile-time.
    */
    int VERSION_MINOR = 50;

    /**
     * A string literal containing the version of Pango available at compile-time.
    */
    String VERSION_STRING = "1.50.12";

}

/*
enumeration-type

[ParameterModel:value-not-supported:{G_::{c:guint}}:{j:int}]

[ParameterModel:java-type-not-supported:{G_::{c:PangoGlyph}}:{j:}]

[ParameterModel:value-not-supported:java-type-not-supported:{G_::{c:PangoGlyph}}:{j:}]

[ParameterModel:java-type-not-supported:{G_::{c:PangoGlyph}}:{j:}]
*/
