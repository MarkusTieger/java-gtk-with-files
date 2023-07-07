/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoLayoutIter` can be used to iterate over the visual
 * <br>extents of a `PangoLayout`.
 * <br>
 * <br>To obtain a `PangoLayoutIter`, use [method&#64;Pango.Layout.get_iter].
 * <br>
 * <br>The `PangoLayoutIter` structure is opaque, and has no user-visible fields.
 * <p><a href="https://docs.gtk.org/Pango/struct.LayoutIter.html">https://docs.gtk.org/Pango/struct.LayoutIter.html</a></p>
*/
public class LayoutIter extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LayoutIter.class.getCanonicalName());
    }

    public LayoutIter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Determines whether &#64;iter is on the last line of the layout.
     * @return %TRUE if &#64;iter is on the last line
    */
    public boolean atLastLine()  {
        return JnaLayoutIter.INST().pango_layout_iter_at_last_line(asCPointer());
    }

    /**
     * Copies a `PangoLayoutIter`.
     * @return the newly allocated `PangoLayoutIter`
    */
    public LayoutIter copy()  {
        return new LayoutIter(new PointerContainer(JnaLayoutIter.INST().pango_layout_iter_copy(asCPointer())));
    }

    /**
     * Frees an iterator that's no longer in use.
    */
    public void free()  {
        JnaLayoutIter.INST().pango_layout_iter_free(asCPointer());
    }

    /**
     * Gets the Y position of the current line's baseline, in layout
     * <br>coordinates.
     * <br>
     * <br>Layout coordinates have the origin at the top left of the entire layout.
     * @return baseline of current line
    */
    public int getBaseline()  {
        return JnaLayoutIter.INST().pango_layout_iter_get_baseline(asCPointer());
    }

    /**
     * Gets the extents of the current character, in layout coordinates.
     * <br>
     * <br>Layout coordinates have the origin at the top left of the entire layout.
     * <br>
     * <br>Only logical extents can sensibly be obtained for characters;
     * <br>ink extents make sense only down to the level of clusters.
     * @param logical_rect rectangle to fill with   logical extents
    */
    public void getCharExtents(@Nonnull Rectangle logical_rect)  {
        JnaLayoutIter.INST().pango_layout_iter_get_char_extents(asCPointer(), asCPointerNotNull(logical_rect));
    }

    /**
     * Gets the extents of the current cluster, in layout coordinates.
     * <br>
     * <br>Layout coordinates have the origin at the top left of the entire layout.
     * @param ink_rect rectangle to fill with ink extents
     * @param logical_rect rectangle to fill with logical extents
    */
    public void getClusterExtents(@Nullable Rectangle ink_rect, @Nullable Rectangle logical_rect)  {
        JnaLayoutIter.INST().pango_layout_iter_get_cluster_extents(asCPointer(), asCPointer(ink_rect), asCPointer(logical_rect));
    }

    /**
     * Gets the current byte index.
     * <br>
     * <br>Note that iterating forward by char moves in visual order,
     * <br>not logical order, so indexes may not be sequential. Also,
     * <br>the index may be equal to the length of the text in the
     * <br>layout, if on the %NULL run (see [method&#64;Pango.LayoutIter.get_run]).
     * @return current byte index
    */
    public int getIndex()  {
        return JnaLayoutIter.INST().pango_layout_iter_get_index(asCPointer());
    }

    /**
     * Gets the layout associated with a `PangoLayoutIter`.
     * @return the layout associated with &#64;iter
    */
    public Layout getLayout()  {
        return new Layout(new PointerContainer(JnaLayoutIter.INST().pango_layout_iter_get_layout(asCPointer())));
    }

    /**
     * Obtains the extents of the `PangoLayout` being iterated over.
     * @param ink_rect rectangle to fill with ink extents
     * @param logical_rect rectangle to fill with logical extents
    */
    public void getLayoutExtents(@Nullable Rectangle ink_rect, @Nullable Rectangle logical_rect)  {
        JnaLayoutIter.INST().pango_layout_iter_get_layout_extents(asCPointer(), asCPointer(ink_rect), asCPointer(logical_rect));
    }

    /**
     * Gets the current line.
     * <br>
     * <br>Use the faster [method&#64;Pango.LayoutIter.get_line_readonly] if
     * <br>you do not plan to modify the contents of the line (glyphs,
     * <br>glyph widths, etc.).
     * @return the current line
    */
    public LayoutLine getLine()  {
        return new LayoutLine(new PointerContainer(JnaLayoutIter.INST().pango_layout_iter_get_line(asCPointer())));
    }

    /**
     * Obtains the extents of the current line.
     * <br>
     * <br>Extents are in layout coordinates (origin is the top-left corner
     * <br>of the entire `PangoLayout`). Thus the extents returned by this
     * <br>function will be the same width/height but not at the same x/y
     * <br>as the extents returned from [method&#64;Pango.LayoutLine.get_extents].
     * @param ink_rect rectangle to fill with ink extents
     * @param logical_rect rectangle to fill with logical extents
    */
    public void getLineExtents(@Nullable Rectangle ink_rect, @Nullable Rectangle logical_rect)  {
        JnaLayoutIter.INST().pango_layout_iter_get_line_extents(asCPointer(), asCPointer(ink_rect), asCPointer(logical_rect));
    }

    /**
     * Gets the current line for read-only access.
     * <br>
     * <br>This is a faster alternative to [method&#64;Pango.LayoutIter.get_line],
     * <br>but the user is not expected to modify the contents of the line
     * <br>(glyphs, glyph widths, etc.).
     * @return the current line, that should not be   modified
    */
    public LayoutLine getLineReadonly()  {
        return new LayoutLine(new PointerContainer(JnaLayoutIter.INST().pango_layout_iter_get_line_readonly(asCPointer())));
    }

    /**
     * Divides the vertical space in the `PangoLayout` being iterated over
     * <br>between the lines in the layout, and returns the space belonging to
     * <br>the current line.
     * <br>
     * <br>A line's range includes the line's logical extents. plus half of the
     * <br>spacing above and below the line, if [method&#64;Pango.Layout.set_spacing]
     * <br>has been called to set layout spacing. The Y positions are in layout
     * <br>coordinates (origin at top left of the entire layout).
     * <br>
     * <br>Note: Since 1.44, Pango uses line heights for placing lines, and there
     * <br>may be gaps between the ranges returned by this function.
     * @param y0_ start of line
     * @param y1_ end of line
    */
    public void getLineYrange(@Nullable ch.bailu.gtk.type.Int y0_, @Nullable ch.bailu.gtk.type.Int y1_)  {
        JnaLayoutIter.INST().pango_layout_iter_get_line_yrange(asCPointer(), asCPointer(y0_), asCPointer(y1_));
    }

    /**
     * Gets the current run.
     * <br>
     * <br>When iterating by run, at the end of each line, there's a position
     * <br>with a %NULL run, so this function can return %NULL. The %NULL run
     * <br>at the end of each line ensures that all lines have at least one run,
     * <br>even lines consisting of only a newline.
     * <br>
     * <br>Use the faster [method&#64;Pango.LayoutIter.get_run_readonly] if you do not
     * <br>plan to modify the contents of the run (glyphs, glyph widths, etc.).
     * @return the current run
    */
    public GlyphItem getRun()  {
        return new GlyphItem(new PointerContainer(JnaLayoutIter.INST().pango_layout_iter_get_run(asCPointer())));
    }

    /**
     * Gets the Y position of the current run's baseline, in layout
     * <br>coordinates.
     * <br>
     * <br>Layout coordinates have the origin at the top left of the entire layout.
     * <br>
     * <br>The run baseline can be different from the line baseline, for
     * <br>example due to superscript or subscript positioning.
     * @return 
    */
    public int getRunBaseline()  {
        return JnaLayoutIter.INST().pango_layout_iter_get_run_baseline(asCPointer());
    }

    /**
     * Gets the extents of the current run in layout coordinates.
     * <br>
     * <br>Layout coordinates have the origin at the top left of the entire layout.
     * @param ink_rect rectangle to fill with ink extents
     * @param logical_rect rectangle to fill with logical extents
    */
    public void getRunExtents(@Nullable Rectangle ink_rect, @Nullable Rectangle logical_rect)  {
        JnaLayoutIter.INST().pango_layout_iter_get_run_extents(asCPointer(), asCPointer(ink_rect), asCPointer(logical_rect));
    }

    /**
     * Gets the current run for read-only access.
     * <br>
     * <br>When iterating by run, at the end of each line, there's a position
     * <br>with a %NULL run, so this function can return %NULL. The %NULL run
     * <br>at the end of each line ensures that all lines have at least one run,
     * <br>even lines consisting of only a newline.
     * <br>
     * <br>This is a faster alternative to [method&#64;Pango.LayoutIter.get_run],
     * <br>but the user is not expected to modify the contents of the run (glyphs,
     * <br>glyph widths, etc.).
     * @return the current run, that   should not be modified
    */
    public GlyphItem getRunReadonly()  {
        return new GlyphItem(new PointerContainer(JnaLayoutIter.INST().pango_layout_iter_get_run_readonly(asCPointer())));
    }

    /**
     * Moves &#64;iter forward to the next character in visual order.
     * <br>
     * <br>If &#64;iter was already at the end of the layout, returns %FALSE.
     * @return whether motion was possible
    */
    public boolean nextChar()  {
        return JnaLayoutIter.INST().pango_layout_iter_next_char(asCPointer());
    }

    /**
     * Moves &#64;iter forward to the next cluster in visual order.
     * <br>
     * <br>If &#64;iter was already at the end of the layout, returns %FALSE.
     * @return whether motion was possible
    */
    public boolean nextCluster()  {
        return JnaLayoutIter.INST().pango_layout_iter_next_cluster(asCPointer());
    }

    /**
     * Moves &#64;iter forward to the start of the next line.
     * <br>
     * <br>If &#64;iter is already on the last line, returns %FALSE.
     * @return whether motion was possible
    */
    public boolean nextLine()  {
        return JnaLayoutIter.INST().pango_layout_iter_next_line(asCPointer());
    }

    /**
     * Moves &#64;iter forward to the next run in visual order.
     * <br>
     * <br>If &#64;iter was already at the end of the layout, returns %FALSE.
     * @return whether motion was possible
    */
    public boolean nextRun()  {
        return JnaLayoutIter.INST().pango_layout_iter_next_run(asCPointer());
    }

    public static long getTypeID() { 
        return JnaLayoutIter.INST().pango_layout_iter_get_type(); 
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
