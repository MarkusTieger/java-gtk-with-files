/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoGlyphString` is used to store strings of glyphs with geometry
 * <br>and visual attribute information.
 * <br>
 * <br>The storage for the glyph information is owned by the structure
 * <br>which simplifies memory management.
 * <p><a href="https://docs.gtk.org/Pango/struct.GlyphString.html">https://docs.gtk.org/Pango/struct.GlyphString.html</a></p>
*/
public class GlyphString extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GlyphString.class.getCanonicalName());
    }

    public GlyphString(PointerContainer pointer) {
        super(pointer);
    }

    private JnaGlyphString.Fields _fields;
    
    JnaGlyphString.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaGlyphString.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * number of glyphs in this glyph string
    */
    public static final String NUM_GLYPHS = "num_glyphs";

    /**
     * number of glyphs in this glyph string
    */
    public void setFieldNumGlyphs(int num_glyphs) {
        toFields().num_glyphs = num_glyphs;
        toFields().writeField(NUM_GLYPHS);
    }

    /**
     * number of glyphs in this glyph string
    */
    public int getFieldNumGlyphs() {
       toFields().readField(NUM_GLYPHS);
       return toFields().num_glyphs;
    } 

    /**
     * Create a new `PangoGlyphString`.
    */
    public GlyphString() {
        super(cast(JnaGlyphString.INST().pango_glyph_string_new()));
    }

    /**
     * Copy a glyph string and associated storage.
     * @return the newly allocated `PangoGlyphString`
    */
    public GlyphString copy()  {
        return new GlyphString(new PointerContainer(JnaGlyphString.INST().pango_glyph_string_copy(asCPointer())));
    }

    /**
     * Compute the logical and ink extents of a glyph string.
     * <br>
     * <br>See the documentation for [method&#64;Pango.Font.get_glyph_extents] for details
     * <br>about the interpretation of the rectangles.
     * <br>
     * <br>Examples of logical (red) and ink (green) rects:
     * <br>
     * <br>![](rects1.png) ![](rects2.png)
     * @param font a `PangoFont`
     * @param ink_rect rectangle used to store the extents of the glyph string as drawn
     * @param logical_rect rectangle used to store the logical extents of the glyph string
    */
    public void extents(@Nonnull Font font, @Nullable Rectangle ink_rect, @Nullable Rectangle logical_rect)  {
        JnaGlyphString.INST().pango_glyph_string_extents(asCPointer(), asCPointerNotNull(font), asCPointer(ink_rect), asCPointer(logical_rect));
    }

    /**
     * Computes the extents of a sub-portion of a glyph string.
     * <br>
     * <br>The extents are relative to the start of the glyph string range
     * <br>(the origin of their coordinate system is at the start of the range,
     * <br>not at the start of the entire glyph string).
     * @param start start index
     * @param end end index (the range is the set of bytes with   indices such that start &lt;= index &lt; end)
     * @param font a `PangoFont`
     * @param ink_rect rectangle used to   store the extents of the glyph string range as drawn
     * @param logical_rect rectangle used to   store the logical extents of the glyph string range
    */
    public void extentsRange(int start, int end, @Nonnull Font font, @Nullable Rectangle ink_rect, @Nullable Rectangle logical_rect)  {
        JnaGlyphString.INST().pango_glyph_string_extents_range(asCPointer(), start, end, asCPointerNotNull(font), asCPointer(ink_rect), asCPointer(logical_rect));
    }

    /**
     * Free a glyph string and associated storage.
    */
    public void free()  {
        JnaGlyphString.INST().pango_glyph_string_free(asCPointer());
    }

    /**
     * Given a `PangoGlyphString` and corresponding text, determine the width
     * <br>corresponding to each character.
     * <br>
     * <br>When multiple characters compose a single cluster, the width of the
     * <br>entire cluster is divided equally among the characters.
     * <br>
     * <br>See also [method&#64;Pango.GlyphItem.get_logical_widths].
     * @param text the text corresponding to the glyphs
     * @param length the length of &#64;text, in bytes
     * @param embedding_level the embedding level of the string
     * @param logical_widths an array whose length is the number of   characters in text (equal to `g_utf8_strlen (text, length)` unless   text has `NUL` bytes) to be filled in with the resulting character widths.
    */
    public void getLogicalWidths(@Nonnull ch.bailu.gtk.type.Str text, int length, int embedding_level, @Nonnull ch.bailu.gtk.type.Int logical_widths)  {
        JnaGlyphString.INST().pango_glyph_string_get_logical_widths(asCPointer(), asCPointerNotNull(text), length, embedding_level, asCPointerNotNull(logical_widths));
    }

    /**
     * Given a `PangoGlyphString` and corresponding text, determine the width
     * <br>corresponding to each character.
     * <br>
     * <br>When multiple characters compose a single cluster, the width of the
     * <br>entire cluster is divided equally among the characters.
     * <br>
     * <br>See also [method&#64;Pango.GlyphItem.get_logical_widths].
     * @param text the text corresponding to the glyphs
     * @param length the length of &#64;text, in bytes
     * @param embedding_level the embedding level of the string
     * @param logical_widths an array whose length is the number of   characters in text (equal to `g_utf8_strlen (text, length)` unless   text has `NUL` bytes) to be filled in with the resulting character widths.
    */
    public void getLogicalWidths(String text, int length, int embedding_level, @Nonnull ch.bailu.gtk.type.Int logical_widths)  {
        JnaGlyphString.INST().pango_glyph_string_get_logical_widths(asCPointer(), text, length, embedding_level, asCPointerNotNull(logical_widths));
    }

    /**
     * Computes the logical width of the glyph string.
     * <br>
     * <br>This can also be computed using [method&#64;Pango.GlyphString.extents].
     * <br>However, since this only computes the width, it's much faster. This
     * <br>is in fact only a convenience function that computes the sum of
     * <br>&#64;geometry.width for each glyph in the &#64;glyphs.
     * @return the logical width of the glyph string.
    */
    public int getWidth()  {
        return JnaGlyphString.INST().pango_glyph_string_get_width(asCPointer());
    }

    /**
     * Converts from character position to x position.
     * <br>
     * <br>The X position is measured from the left edge of the run.
     * <br>Character positions are obtained using font metrics for ligatures
     * <br>where available, and computed by dividing up each cluster
     * <br>into equal portions, otherwise.
     * <br>
     * <br>&lt;picture&gt;
     * <br>  &lt;source srcset=&quot;glyphstring-positions-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
     * <br>  &lt;img alt=&quot;Glyph positions&quot; src=&quot;glyphstring-positions-light.png&quot;&gt;
     * <br>&lt;/picture&gt;
     * @param text the text for the run
     * @param length the number of bytes (not characters) in &#64;text.
     * @param analysis the analysis information return from [func&#64;itemize]
     * @param index_ the byte index within &#64;text
     * @param trailing whether we should compute the result for the beginning (%FALSE)   or end (%TRUE) of the character.
     * @param x_pos location to store result
    */
    public void indexToX(@Nonnull ch.bailu.gtk.type.Str text, int length, @Nonnull Analysis analysis, int index_, boolean trailing, @Nonnull ch.bailu.gtk.type.Int x_pos)  {
        JnaGlyphString.INST().pango_glyph_string_index_to_x(asCPointer(), asCPointerNotNull(text), length, asCPointerNotNull(analysis), index_, trailing, asCPointerNotNull(x_pos));
    }

    /**
     * Converts from character position to x position.
     * <br>
     * <br>The X position is measured from the left edge of the run.
     * <br>Character positions are obtained using font metrics for ligatures
     * <br>where available, and computed by dividing up each cluster
     * <br>into equal portions, otherwise.
     * <br>
     * <br>&lt;picture&gt;
     * <br>  &lt;source srcset=&quot;glyphstring-positions-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
     * <br>  &lt;img alt=&quot;Glyph positions&quot; src=&quot;glyphstring-positions-light.png&quot;&gt;
     * <br>&lt;/picture&gt;
     * @param text the text for the run
     * @param length the number of bytes (not characters) in &#64;text.
     * @param analysis the analysis information return from [func&#64;itemize]
     * @param index_ the byte index within &#64;text
     * @param trailing whether we should compute the result for the beginning (%FALSE)   or end (%TRUE) of the character.
     * @param x_pos location to store result
    */
    public void indexToX(String text, int length, @Nonnull Analysis analysis, int index_, boolean trailing, @Nonnull ch.bailu.gtk.type.Int x_pos)  {
        JnaGlyphString.INST().pango_glyph_string_index_to_x(asCPointer(), text, length, asCPointerNotNull(analysis), index_, trailing, asCPointerNotNull(x_pos));
    }

    /**
     * Converts from character position to x position.
     * <br>
     * <br>This variant of [method&#64;Pango.GlyphString.index_to_x] additionally
     * <br>accepts a `PangoLogAttr` array. The grapheme boundary information
     * <br>in it can be used to disambiguate positioning inside some complex
     * <br>clusters.
     * @param text the text for the run
     * @param length the number of bytes (not characters) in &#64;text.
     * @param analysis the analysis information return from [func&#64;itemize]
     * @param attrs `PangoLogAttr` array for &#64;text
     * @param index_ the byte index within &#64;text
     * @param trailing whether we should compute the result for the beginning (%FALSE)   or end (%TRUE) of the character.
     * @param x_pos location to store result
    */
    public void indexToXFull(@Nonnull ch.bailu.gtk.type.Str text, int length, @Nonnull Analysis analysis, @Nullable LogAttr attrs, int index_, boolean trailing, @Nonnull ch.bailu.gtk.type.Int x_pos)  {
        JnaGlyphString.INST().pango_glyph_string_index_to_x_full(asCPointer(), asCPointerNotNull(text), length, asCPointerNotNull(analysis), asCPointer(attrs), index_, trailing, asCPointerNotNull(x_pos));
    }

    /**
     * Converts from character position to x position.
     * <br>
     * <br>This variant of [method&#64;Pango.GlyphString.index_to_x] additionally
     * <br>accepts a `PangoLogAttr` array. The grapheme boundary information
     * <br>in it can be used to disambiguate positioning inside some complex
     * <br>clusters.
     * @param text the text for the run
     * @param length the number of bytes (not characters) in &#64;text.
     * @param analysis the analysis information return from [func&#64;itemize]
     * @param attrs `PangoLogAttr` array for &#64;text
     * @param index_ the byte index within &#64;text
     * @param trailing whether we should compute the result for the beginning (%FALSE)   or end (%TRUE) of the character.
     * @param x_pos location to store result
    */
    public void indexToXFull(String text, int length, @Nonnull Analysis analysis, @Nullable LogAttr attrs, int index_, boolean trailing, @Nonnull ch.bailu.gtk.type.Int x_pos)  {
        JnaGlyphString.INST().pango_glyph_string_index_to_x_full(asCPointer(), text, length, asCPointerNotNull(analysis), asCPointer(attrs), index_, trailing, asCPointerNotNull(x_pos));
    }

    /**
     * Resize a glyph string to the given length.
     * @param new_len the new length of the string
    */
    public void setSize(int new_len)  {
        JnaGlyphString.INST().pango_glyph_string_set_size(asCPointer(), new_len);
    }

    /**
     * Convert from x offset to character position.
     * <br>
     * <br>Character positions are computed by dividing up each cluster into
     * <br>equal portions. In scripts where positioning within a cluster is
     * <br>not allowed (such as Thai), the returned value may not be a valid
     * <br>cursor position; the caller must combine the result with the logical
     * <br>attributes for the text to compute the valid cursor position.
     * @param text the text for the run
     * @param length the number of bytes (not characters) in text.
     * @param analysis the analysis information return from [func&#64;itemize]
     * @param x_pos the x offset (in Pango units)
     * @param index_ location to store calculated byte index within &#64;text
     * @param trailing location to store a boolean indicating whether the   user clicked on the leading or trailing edge of the character
    */
    public void xToIndex(@Nonnull ch.bailu.gtk.type.Str text, int length, @Nonnull Analysis analysis, int x_pos, @Nonnull ch.bailu.gtk.type.Int index_, @Nonnull ch.bailu.gtk.type.Int trailing)  {
        JnaGlyphString.INST().pango_glyph_string_x_to_index(asCPointer(), asCPointerNotNull(text), length, asCPointerNotNull(analysis), x_pos, asCPointerNotNull(index_), asCPointerNotNull(trailing));
    }

    /**
     * Convert from x offset to character position.
     * <br>
     * <br>Character positions are computed by dividing up each cluster into
     * <br>equal portions. In scripts where positioning within a cluster is
     * <br>not allowed (such as Thai), the returned value may not be a valid
     * <br>cursor position; the caller must combine the result with the logical
     * <br>attributes for the text to compute the valid cursor position.
     * @param text the text for the run
     * @param length the number of bytes (not characters) in text.
     * @param analysis the analysis information return from [func&#64;itemize]
     * @param x_pos the x offset (in Pango units)
     * @param index_ location to store calculated byte index within &#64;text
     * @param trailing location to store a boolean indicating whether the   user clicked on the leading or trailing edge of the character
    */
    public void xToIndex(String text, int length, @Nonnull Analysis analysis, int x_pos, @Nonnull ch.bailu.gtk.type.Int index_, @Nonnull ch.bailu.gtk.type.Int trailing)  {
        JnaGlyphString.INST().pango_glyph_string_x_to_index(asCPointer(), text, length, asCPointerNotNull(analysis), x_pos, asCPointerNotNull(index_), asCPointerNotNull(trailing));
    }

    public static long getTypeID() { 
        return JnaGlyphString.INST().pango_glyph_string_get_type(); 
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
some-fields-unsupported

[FieldModel:glyphs:java-type-not-supported:{G_::{c:PangoGlyphInfo*}}:{j:}]

[FieldModel:log_clusters:previous-field-unsupported:{Gw:Int:{c:int*}}:{j:long}]

[FieldModel:space:previous-field-unsupported:{G_::{c:int}}:{j:int}]
*/
