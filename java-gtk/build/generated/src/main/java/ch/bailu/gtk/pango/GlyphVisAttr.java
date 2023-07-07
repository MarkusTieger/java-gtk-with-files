/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoGlyphVisAttr` structure communicates information between
 * <br>the shaping and rendering phases.
 * <br>
 * <br>Currently, it contains cluster start and color information.
 * <br>More attributes may be added in the future.
 * <br>
 * <br>Clusters are stored in visual order, within the cluster, glyphs
 * <br>are always ordered in logical order, since visual order is meaningless;
 * <br>that is, in Arabic text, accent glyphs follow the glyphs for the
 * <br>base character.
 * <p><a href="https://docs.gtk.org/Pango/struct.GlyphVisAttr.html">https://docs.gtk.org/Pango/struct.GlyphVisAttr.html</a></p>
*/
public class GlyphVisAttr extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GlyphVisAttr.class.getCanonicalName());
    }

    public GlyphVisAttr(PointerContainer pointer) {
        super(pointer);
    }

    public GlyphVisAttr() {
        super(cast(JnaGlyphVisAttr.allocateStructure()));
    }

    private JnaGlyphVisAttr.Fields _fields;
    
    JnaGlyphVisAttr.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaGlyphVisAttr.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * set for the first logical glyph in each cluster.
    */
    public static final String IS_CLUSTER_START = "is_cluster_start";

    /**
     * set for the first logical glyph in each cluster.
    */
    public void setFieldIsClusterStart(int is_cluster_start) {
        toFields().is_cluster_start = is_cluster_start;
        toFields().writeField(IS_CLUSTER_START);
    }

    /**
     * set for the first logical glyph in each cluster.
    */
    public int getFieldIsClusterStart() {
       toFields().readField(IS_CLUSTER_START);
       return toFields().is_cluster_start;
    } 

    /**
     * set if the the font will render this glyph with color. Since 1.50
    */
    public static final String IS_COLOR = "is_color";

    /**
     * set if the the font will render this glyph with color. Since 1.50
    */
    public void setFieldIsColor(int is_color) {
        toFields().is_color = is_color;
        toFields().writeField(IS_COLOR);
    }

    /**
     * set if the the font will render this glyph with color. Since 1.50
    */
    public int getFieldIsColor() {
       toFields().readField(IS_COLOR);
       return toFields().is_color;
    } 

}

/*
record-type
all-fields-supported
*/
