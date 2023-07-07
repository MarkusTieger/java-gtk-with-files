/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoGlyphInfo` structure represents a single glyph with
 * <br>positioning information and visual attributes.
 * <p><a href="https://docs.gtk.org/Pango/struct.GlyphInfo.html">https://docs.gtk.org/Pango/struct.GlyphInfo.html</a></p>
*/
public class GlyphInfo extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GlyphInfo.class.getCanonicalName());
    }

    public GlyphInfo(PointerContainer pointer) {
        super(pointer);
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:glyph:java-type-not-supported:{G_::{c:PangoGlyph}}:{j:}]

[FieldModel:geometry:direct-type:previous-field-unsupported:{Gg:GlyphGeometry:{c:PangoGlyphGeometry}}:{j:long}]

[FieldModel:attr:direct-type:previous-field-unsupported:{Gg:GlyphVisAttr:{c:PangoGlyphVisAttr}}:{j:long}]
*/
