/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoLayoutLine` represents one of the lines resulting from laying
 * <br>out a paragraph via `PangoLayout`.
 * <br>
 * <br>`PangoLayoutLine` structures are obtained by calling
 * <br>[method&#64;Pango.Layout.get_line] and are only valid until the text,
 * <br>attributes, or settings of the parent `PangoLayout` are modified.
 * <p><a href="https://docs.gtk.org/Pango/struct.LayoutLine.html">https://docs.gtk.org/Pango/struct.LayoutLine.html</a></p>
*/
public class LayoutLine extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LayoutLine.class.getCanonicalName());
    }

    public LayoutLine(PointerContainer pointer) {
        super(pointer);
    }

    public LayoutLine() {
        super(cast(JnaLayoutLine.allocateStructure()));
    }

    private JnaLayoutLine.Fields _fields;
    
    JnaLayoutLine.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaLayoutLine.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the layout this line belongs to, might be %NULL
    */
    public static final String LAYOUT = "layout";

    /**
     * the layout this line belongs to, might be %NULL
    */
    public void setFieldLayout(Layout layout) {
        toFields().layout = layout.asCPointer();
        toFields().writeField(LAYOUT);
    }

    /**
     * the layout this line belongs to, might be %NULL
    */
    public Layout getFieldLayout() {
       toFields().readField(LAYOUT);
       return new Layout(new PointerContainer(toFields().layout));
    } 

    /**
     * start of line as byte index into layout-&gt;text
    */
    public static final String START_INDEX = "start_index";

    /**
     * start of line as byte index into layout-&gt;text
    */
    public void setFieldStartIndex(int start_index) {
        toFields().start_index = start_index;
        toFields().writeField(START_INDEX);
    }

    /**
     * start of line as byte index into layout-&gt;text
    */
    public int getFieldStartIndex() {
       toFields().readField(START_INDEX);
       return toFields().start_index;
    } 

    /**
     * length of line in bytes
    */
    public static final String LENGTH = "length";

    /**
     * length of line in bytes
    */
    public void setFieldLength(int length) {
        toFields().length = length;
        toFields().writeField(LENGTH);
    }

    /**
     * length of line in bytes
    */
    public int getFieldLength() {
       toFields().readField(LENGTH);
       return toFields().length;
    } 

    /**
     * list of runs in the
     * <br>  line, from left to right
    */
    public static final String RUNS = "runs";

    /**
     * list of runs in the
     * <br>  line, from left to right
    */
    public void setFieldRuns(ch.bailu.gtk.glib.SList runs) {
        toFields().runs = runs.asCPointer();
        toFields().writeField(RUNS);
    }

    /**
     * list of runs in the
     * <br>  line, from left to right
    */
    public ch.bailu.gtk.glib.SList getFieldRuns() {
       toFields().readField(RUNS);
       return new ch.bailu.gtk.glib.SList(new PointerContainer(toFields().runs));
    } 

    /**
     * &#35;TRUE if this is the first line of the paragraph
    */
    public static final String IS_PARAGRAPH_START = "is_paragraph_start";

    /**
     * &#35;TRUE if this is the first line of the paragraph
    */
    public void setFieldIsParagraphStart(int is_paragraph_start) {
        toFields().is_paragraph_start = is_paragraph_start;
        toFields().writeField(IS_PARAGRAPH_START);
    }

    /**
     * &#35;TRUE if this is the first line of the paragraph
    */
    public int getFieldIsParagraphStart() {
       toFields().readField(IS_PARAGRAPH_START);
       return toFields().is_paragraph_start;
    } 

    /**
     * &#35;Resolved PangoDirection of line
    */
    public static final String RESOLVED_DIR = "resolved_dir";

    /**
     * &#35;Resolved PangoDirection of line
    */
    public void setFieldResolvedDir(int resolved_dir) {
        toFields().resolved_dir = resolved_dir;
        toFields().writeField(RESOLVED_DIR);
    }

    /**
     * &#35;Resolved PangoDirection of line
    */
    public int getFieldResolvedDir() {
       toFields().readField(RESOLVED_DIR);
       return toFields().resolved_dir;
    } 

    /**
     * Computes the logical and ink extents of a layout line.
     * <br>
     * <br>See [method&#64;Pango.Font.get_glyph_extents] for details
     * <br>about the interpretation of the rectangles.
     * @param ink_rect rectangle used to store the extents of   the glyph string as drawn
     * @param logical_rect rectangle used to store the logical   extents of the glyph string
    */
    public void getExtents(@Nullable Rectangle ink_rect, @Nullable Rectangle logical_rect)  {
        JnaLayoutLine.INST().pango_layout_line_get_extents(asCPointer(), asCPointer(ink_rect), asCPointer(logical_rect));
    }

    /**
     * Computes the height of the line, as the maximum of the heights
     * <br>of fonts used in this line.
     * <br>
     * <br>Note that the actual baseline-to-baseline distance between lines
     * <br>of text is influenced by other factors, such as
     * <br>[method&#64;Pango.Layout.set_spacing] and
     * <br>[method&#64;Pango.Layout.set_line_spacing].
     * @param height return location for the line height
    */
    public void getHeight(@Nullable ch.bailu.gtk.type.Int height)  {
        JnaLayoutLine.INST().pango_layout_line_get_height(asCPointer(), asCPointer(height));
    }

    /**
     * Returns the length of the line, in bytes.
     * @return the length of the line
    */
    public int getLength()  {
        return JnaLayoutLine.INST().pango_layout_line_get_length(asCPointer());
    }

    /**
     * Computes the logical and ink extents of &#64;layout_line in device units.
     * <br>
     * <br>This function just calls [method&#64;Pango.LayoutLine.get_extents] followed by
     * <br>two [func&#64;extents_to_pixels] calls, rounding &#64;ink_rect and &#64;logical_rect
     * <br>such that the rounded rectangles fully contain the unrounded one (that is,
     * <br>passes them as first argument to [func&#64;extents_to_pixels]).
     * @param ink_rect rectangle used to store the extents of   the glyph string as drawn
     * @param logical_rect rectangle used to store the logical   extents of the glyph string
    */
    public void getPixelExtents(@Nullable Rectangle ink_rect, @Nullable Rectangle logical_rect)  {
        JnaLayoutLine.INST().pango_layout_line_get_pixel_extents(asCPointer(), asCPointer(ink_rect), asCPointer(logical_rect));
    }

    /**
     * Returns the resolved direction of the line.
     * @return the resolved direction of the line
    */
    public int getResolvedDirection()  {
        return JnaLayoutLine.INST().pango_layout_line_get_resolved_direction(asCPointer());
    }

    /**
     * Returns the start index of the line, as byte index
     * <br>into the text of the layout.
     * @return the start index of the line
    */
    public int getStartIndex()  {
        return JnaLayoutLine.INST().pango_layout_line_get_start_index(asCPointer());
    }

    /**
     * Converts an index within a line to a X position.
     * @param index_ byte offset of a grapheme within the layout
     * @param trailing an integer indicating the edge of the grapheme to retrieve   the position of. If &gt; 0, the trailing edge of the grapheme,   if 0, the leading of the grapheme
     * @param x_pos location to store the x_offset (in Pango units)
    */
    public void indexToX(int index_, boolean trailing, @Nonnull ch.bailu.gtk.type.Int x_pos)  {
        JnaLayoutLine.INST().pango_layout_line_index_to_x(asCPointer(), index_, trailing, asCPointerNotNull(x_pos));
    }

    /**
     * Returns whether this is the first line of the paragraph.
     * @return %TRUE if this is the first line
    */
    public boolean isParagraphStart()  {
        return JnaLayoutLine.INST().pango_layout_line_is_paragraph_start(asCPointer());
    }

    /**
     * Increase the reference count of a `PangoLayoutLine` by one.
     * @return the line passed in.
    */
    public LayoutLine ref()  {
        return new LayoutLine(new PointerContainer(JnaLayoutLine.INST().pango_layout_line_ref(asCPointer())));
    }

    /**
     * Decrease the reference count of a `PangoLayoutLine` by one.
     * <br>
     * <br>If the result is zero, the line and all associated memory
     * <br>will be freed.
    */
    public void unref()  {
        JnaLayoutLine.INST().pango_layout_line_unref(asCPointer());
    }

    /**
     * Converts from x offset to the byte index of the corresponding character
     * <br>within the text of the layout.
     * <br>
     * <br>If &#64;x_pos is outside the line, &#64;index_ and &#64;trailing will point to the very
     * <br>first or very last position in the line. This determination is based on the
     * <br>resolved direction of the paragraph; for example, if the resolved direction
     * <br>is right-to-left, then an X position to the right of the line (after it)
     * <br>results in 0 being stored in &#64;index_ and &#64;trailing. An X position to the
     * <br>left of the line results in &#64;index_ pointing to the (logical) last grapheme
     * <br>in the line and &#64;trailing being set to the number of characters in that
     * <br>grapheme. The reverse is true for a left-to-right line.
     * @param x_pos the X offset (in Pango units) from the left edge of the line.
     * @param index_ location to store calculated byte index for the grapheme   in which the user clicked
     * @param trailing location to store an integer indicating where in the   grapheme the user clicked. It will either be zero, or the number of   characters in the grapheme. 0 represents the leading edge of the grapheme.
     * @return %FALSE if &#64;x_pos was outside the line, %TRUE if inside
    */
    public boolean xToIndex(int x_pos, @Nonnull ch.bailu.gtk.type.Int index_, @Nonnull ch.bailu.gtk.type.Int trailing)  {
        return JnaLayoutLine.INST().pango_layout_line_x_to_index(asCPointer(), x_pos, asCPointerNotNull(index_), asCPointerNotNull(trailing));
    }

    public static long getTypeID() { 
        return JnaLayoutLine.INST().pango_layout_line_get_type(); 
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

[MethodModel:java-type-not-supported:getXRanges:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:int**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
*/
