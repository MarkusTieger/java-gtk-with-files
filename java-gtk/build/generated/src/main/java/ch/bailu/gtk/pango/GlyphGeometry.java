/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoGlyphGeometry` structure contains width and positioning
 * <br>information for a single glyph.
 * <br>
 * <br>Note that &#64;width is not guaranteed to be the same as the glyph
 * <br>extents. Kerning and other positioning applied during shaping will
 * <br>affect both the &#64;width and the &#64;x_offset for the glyphs in the
 * <br>glyph string that results from shaping.
 * <br>
 * <br>The information in this struct is intended for rendering the glyphs,
 * <br>as follows:
 * <br>
 * <br>1. Assume the current point is (x, y)
 * <br>2. Render the current glyph at (x + x_offset, y + y_offset),
 * <br>3. Advance the current point to (x + width, y)
 * <br>4. Render the next glyph
 * <p><a href="https://docs.gtk.org/Pango/struct.GlyphGeometry.html">https://docs.gtk.org/Pango/struct.GlyphGeometry.html</a></p>
*/
public class GlyphGeometry extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GlyphGeometry.class.getCanonicalName());
    }

    public GlyphGeometry(PointerContainer pointer) {
        super(pointer);
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:width:java-type-not-supported:{G_::{c:PangoGlyphUnit}}:{j:}]

[FieldModel:x_offset:java-type-not-supported:previous-field-unsupported:{G_::{c:PangoGlyphUnit}}:{j:}]

[FieldModel:y_offset:java-type-not-supported:previous-field-unsupported:{G_::{c:PangoGlyphUnit}}:{j:}]
*/
