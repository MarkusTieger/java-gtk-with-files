/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoLayout` structure represents an entire paragraph of text.
 * <br>
 * <br>While complete access to the layout capabilities of Pango is provided
 * <br>using the detailed interfaces for itemization and shaping, using
 * <br>that functionality directly involves writing a fairly large amount
 * <br>of code. `PangoLayout` provides a high-level driver for formatting
 * <br>entire paragraphs of text at once. This includes paragraph-level
 * <br>functionality such as line breaking, justification, alignment and
 * <br>ellipsization.
 * <br>
 * <br>A `PangoLayout` is initialized with a `PangoContext`, UTF-8 string
 * <br>and set of attributes for that string. Once that is done, the set of
 * <br>formatted lines can be extracted from the object, the layout can be
 * <br>rendered, and conversion between logical character positions within
 * <br>the layout's text, and the physical position of the resulting glyphs
 * <br>can be made.
 * <br>
 * <br>There are a number of parameters to adjust the formatting of a
 * <br>`PangoLayout`. The following image shows adjustable parameters
 * <br>(on the left) and font metrics (on the right):
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;layout-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img alt=&quot;Pango Layout Parameters&quot; src=&quot;layout-light.png&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The following images demonstrate the effect of alignment and
 * <br>justification on the layout of text:
 * <br>
 * <br>| | |
 * <br>| --- | --- |
 * <br>| ![align=left](align-left.png) | ![align=left, justify](align-left-justify.png) |
 * <br>| ![align=center](align-center.png) | ![align=center, justify](align-center-justify.png) |
 * <br>| ![align=right](align-right.png) | ![align=right, justify](align-right-justify.png) |
 * <br>
 * <br>
 * <br>It is possible, as well, to ignore the 2-D setup,
 * <br>and simply treat the results of a `PangoLayout` as a list of lines.
 * <p><a href="https://docs.gtk.org/Pango/class.Layout.html">https://docs.gtk.org/Pango/class.Layout.html</a></p>
*/
public class Layout extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Layout.class.getCanonicalName());
    }

    public Layout(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a new `PangoLayout` object with attributes initialized to
     * <br>default values for a particular `PangoContext`.
     * @param context a `PangoContext`
    */
    public Layout(@Nonnull Context context) {
        super(cast(JnaLayout.INST().pango_layout_new(asCPointerNotNull(context))));
    }

    /**
     * Forces recomputation of any state in the `PangoLayout` that
     * <br>might depend on the layout's context.
     * <br>
     * <br>This function should be called if you make changes to the context
     * <br>subsequent to creating the layout.
    */
    public void contextChanged()  {
        JnaLayout.INST().pango_layout_context_changed(asCPointer());
    }

    /**
     * Creates a deep copy-by-value of the layout.
     * <br>
     * <br>The attribute list, tab array, and text from the original layout
     * <br>are all copied by value.
     * @return the newly allocated `PangoLayout`
    */
    public Layout copy()  {
        return new Layout(new PointerContainer(JnaLayout.INST().pango_layout_copy(asCPointer())));
    }

    /**
     * Gets the alignment for the layout: how partial lines are
     * <br>positioned within the horizontal space available.
     * @return the alignment
    */
    public int getAlignment()  {
        return JnaLayout.INST().pango_layout_get_alignment(asCPointer());
    }

    /**
     * Gets the attribute list for the layout, if any.
     * @return a `PangoAttrList`
    */
    public AttrList getAttributes()  {
        return new AttrList(new PointerContainer(JnaLayout.INST().pango_layout_get_attributes(asCPointer())));
    }

    /**
     * Gets whether to calculate the base direction for the layout
     * <br>according to its contents.
     * <br>
     * <br>See [method&#64;Pango.Layout.set_auto_dir].
     * @return %TRUE if the bidirectional base direction   is computed from the layout's contents, %FALSE otherwise
    */
    public boolean getAutoDir()  {
        return JnaLayout.INST().pango_layout_get_auto_dir(asCPointer());
    }

    /**
     * Gets the Y position of baseline of the first line in &#64;layout.
     * @return baseline of first line, from top of &#64;layout
    */
    public int getBaseline()  {
        return JnaLayout.INST().pango_layout_get_baseline(asCPointer());
    }

    /**
     * Given an index within a layout, determines the positions that of the
     * <br>strong and weak cursors if the insertion point is at that index.
     * <br>
     * <br>This is a variant of [method&#64;Pango.Layout.get_cursor_pos] that applies
     * <br>font metric information about caret slope and offset to the positions
     * <br>it returns.
     * <br>
     * <br>&lt;picture&gt;
     * <br>  &lt;source srcset=&quot;caret-metrics-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
     * <br>  &lt;img alt=&quot;Caret metrics&quot; src=&quot;caret-metrics-light.png&quot;&gt;
     * <br>&lt;/picture&gt;
     * @param index_ the byte index of the cursor
     * @param strong_pos location to store the strong cursor position
     * @param weak_pos location to store the weak cursor position
    */
    public void getCaretPos(int index_, @Nullable Rectangle strong_pos, @Nullable Rectangle weak_pos)  {
        JnaLayout.INST().pango_layout_get_caret_pos(asCPointer(), index_, asCPointer(strong_pos), asCPointer(weak_pos));
    }

    /**
     * Returns the number of Unicode characters in the
     * <br>the text of &#64;layout.
     * @return the number of Unicode characters   in the text of &#64;layout
    */
    public int getCharacterCount()  {
        return JnaLayout.INST().pango_layout_get_character_count(asCPointer());
    }

    /**
     * Retrieves the `PangoContext` used for this layout.
     * @return the `PangoContext` for the layout
    */
    public Context getContext()  {
        return new Context(new PointerContainer(JnaLayout.INST().pango_layout_get_context(asCPointer())));
    }

    /**
     * Given an index within a layout, determines the positions that of the
     * <br>strong and weak cursors if the insertion point is at that index.
     * <br>
     * <br>The position of each cursor is stored as a zero-width rectangle
     * <br>with the height of the run extents.
     * <br>
     * <br>&lt;picture&gt;
     * <br>  &lt;source srcset=&quot;cursor-positions-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
     * <br>  &lt;img alt=&quot;Cursor positions&quot; src=&quot;cursor-positions-light.png&quot;&gt;
     * <br>&lt;/picture&gt;
     * <br>
     * <br>The strong cursor location is the location where characters of the
     * <br>directionality equal to the base direction of the layout are inserted.
     * <br>The weak cursor location is the location where characters of the
     * <br>directionality opposite to the base direction of the layout are inserted.
     * <br>
     * <br>The following example shows text with both a strong and a weak cursor.
     * <br>
     * <br>&lt;picture&gt;
     * <br>  &lt;source srcset=&quot;split-cursor-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
     * <br>  &lt;img alt=&quot;Strong and weak cursors&quot; src=&quot;split-cursor-light.png&quot;&gt;
     * <br>&lt;/picture&gt;
     * <br>
     * <br>The strong cursor has a little arrow pointing to the right, the weak
     * <br>cursor to the left. Typing a 'c' in this situation will insert the
     * <br>character after the 'b', and typing another Hebrew character, like 'ג',
     * <br>will insert it at the end.
     * @param index_ the byte index of the cursor
     * @param strong_pos location to store the strong cursor position
     * @param weak_pos location to store the weak cursor position
    */
    public void getCursorPos(int index_, @Nullable Rectangle strong_pos, @Nullable Rectangle weak_pos)  {
        JnaLayout.INST().pango_layout_get_cursor_pos(asCPointer(), index_, asCPointer(strong_pos), asCPointer(weak_pos));
    }

    /**
     * Gets the text direction at the given character position in &#64;layout.
     * @param index the byte index of the char
     * @return the text direction at &#64;index
    */
    public int getDirection(int index)  {
        return JnaLayout.INST().pango_layout_get_direction(asCPointer(), index);
    }

    /**
     * Gets the type of ellipsization being performed for &#64;layout.
     * <br>
     * <br>See [method&#64;Pango.Layout.set_ellipsize].
     * <br>
     * <br>Use [method&#64;Pango.Layout.is_ellipsized] to query whether any
     * <br>paragraphs were actually ellipsized.
     * @return the current ellipsization mode for &#64;layout
    */
    public int getEllipsize()  {
        return JnaLayout.INST().pango_layout_get_ellipsize(asCPointer());
    }

    /**
     * Computes the logical and ink extents of &#64;layout.
     * <br>
     * <br>Logical extents are usually what you want for positioning things. Note
     * <br>that both extents may have non-zero x and y. You may want to use those
     * <br>to offset where you render the layout. Not doing that is a very typical
     * <br>bug that shows up as right-to-left layouts not being correctly positioned
     * <br>in a layout with a set width.
     * <br>
     * <br>The extents are given in layout coordinates and in Pango units; layout
     * <br>coordinates begin at the top left corner of the layout.
     * @param ink_rect rectangle used to store the extents of the   layout as drawn
     * @param logical_rect rectangle used to store the logical   extents of the layout
    */
    public void getExtents(@Nullable Rectangle ink_rect, @Nullable Rectangle logical_rect)  {
        JnaLayout.INST().pango_layout_get_extents(asCPointer(), asCPointer(ink_rect), asCPointer(logical_rect));
    }

    /**
     * Gets the font description for the layout, if any.
     * @return a pointer to the   layout's font description, or %NULL if the font description   from the layout's context is inherited.
    */
    public FontDescription getFontDescription()  {
        return new FontDescription(new PointerContainer(JnaLayout.INST().pango_layout_get_font_description(asCPointer())));
    }

    /**
     * Gets the height of layout used for ellipsization.
     * <br>
     * <br>See [method&#64;Pango.Layout.set_height] for details.
     * @return the height, in Pango units if positive,   or number of lines if negative.
    */
    public int getHeight()  {
        return JnaLayout.INST().pango_layout_get_height(asCPointer());
    }

    /**
     * Gets the paragraph indent width in Pango units.
     * <br>
     * <br>A negative value indicates a hanging indentation.
     * @return the indent in Pango units
    */
    public int getIndent()  {
        return JnaLayout.INST().pango_layout_get_indent(asCPointer());
    }

    /**
     * Returns an iterator to iterate over the visual extents of the layout.
     * @return the new `PangoLayoutIter`
    */
    public LayoutIter getIter()  {
        return new LayoutIter(new PointerContainer(JnaLayout.INST().pango_layout_get_iter(asCPointer())));
    }

    /**
     * Gets whether each complete line should be stretched to fill the entire
     * <br>width of the layout.
     * @return the justify value
    */
    public boolean getJustify()  {
        return JnaLayout.INST().pango_layout_get_justify(asCPointer());
    }

    /**
     * Gets whether the last line should be stretched
     * <br>to fill the entire width of the layout.
     * @return the justify value
    */
    public boolean getJustifyLastLine()  {
        return JnaLayout.INST().pango_layout_get_justify_last_line(asCPointer());
    }

    /**
     * Retrieves a particular line from a `PangoLayout`.
     * <br>
     * <br>Use the faster [method&#64;Pango.Layout.get_line_readonly] if you do not
     * <br>plan to modify the contents of the line (glyphs, glyph widths, etc.).
     * @param line the index of a line, which must be between 0 and   `pango_layout_get_line_count(layout) - 1`, inclusive.
     * @return the requested `PangoLayoutLine`,   or %NULL if the index is out of range. This layout line can be ref'ed   and retained, but will become invalid if changes are made to the   `PangoLayout`.
    */
    public LayoutLine getLine(int line)  {
        return new LayoutLine(new PointerContainer(JnaLayout.INST().pango_layout_get_line(asCPointer(), line)));
    }

    /**
     * Retrieves the count of lines for the &#64;layout.
     * @return the line count
    */
    public int getLineCount()  {
        return JnaLayout.INST().pango_layout_get_line_count(asCPointer());
    }

    /**
     * Retrieves a particular line from a `PangoLayout`.
     * <br>
     * <br>This is a faster alternative to [method&#64;Pango.Layout.get_line],
     * <br>but the user is not expected to modify the contents of the line
     * <br>(glyphs, glyph widths, etc.).
     * @param line the index of a line, which must be between 0 and   `pango_layout_get_line_count(layout) - 1`, inclusive.
     * @return the requested `PangoLayoutLine`,   or %NULL if the index is out of range. This layout line can be ref'ed   and retained, but will become invalid if changes are made to the   `PangoLayout`. No changes should be made to the line.
    */
    public LayoutLine getLineReadonly(int line)  {
        return new LayoutLine(new PointerContainer(JnaLayout.INST().pango_layout_get_line_readonly(asCPointer(), line)));
    }

    /**
     * Gets the line spacing factor of &#64;layout.
     * <br>
     * <br>See [method&#64;Pango.Layout.set_line_spacing].
     * @return 
    */
    public float getLineSpacing()  {
        return JnaLayout.INST().pango_layout_get_line_spacing(asCPointer());
    }

    /**
     * Returns the lines of the &#64;layout as a list.
     * <br>
     * <br>Use the faster [method&#64;Pango.Layout.get_lines_readonly] if you do not
     * <br>plan to modify the contents of the lines (glyphs, glyph widths, etc.).
     * @return a `GSList`   containing the lines in the layout. This points to internal data of the   `PangoLayout` and must be used with care. It will become invalid on any   change to the layout's text or properties.
    */
    public ch.bailu.gtk.glib.SList getLines()  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaLayout.INST().pango_layout_get_lines(asCPointer())));
    }

    /**
     * Returns the lines of the &#64;layout as a list.
     * <br>
     * <br>This is a faster alternative to [method&#64;Pango.Layout.get_lines],
     * <br>but the user is not expected to modify the contents of the lines
     * <br>(glyphs, glyph widths, etc.).
     * @return a `GSList`   containing the lines in the layout. This points to internal data of the   `PangoLayout` and must be used with care. It will become invalid on any   change to the layout's text or properties. No changes should be made to   the lines.
    */
    public ch.bailu.gtk.glib.SList getLinesReadonly()  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaLayout.INST().pango_layout_get_lines_readonly(asCPointer())));
    }

    /**
     * Computes the logical and ink extents of &#64;layout in device units.
     * <br>
     * <br>This function just calls [method&#64;Pango.Layout.get_extents] followed by
     * <br>two [func&#64;extents_to_pixels] calls, rounding &#64;ink_rect and &#64;logical_rect
     * <br>such that the rounded rectangles fully contain the unrounded one (that is,
     * <br>passes them as first argument to [func&#64;Pango.extents_to_pixels]).
     * @param ink_rect rectangle used to store the extents of the   layout as drawn
     * @param logical_rect rectangle used to store the logical   extents of the layout
    */
    public void getPixelExtents(@Nullable Rectangle ink_rect, @Nullable Rectangle logical_rect)  {
        JnaLayout.INST().pango_layout_get_pixel_extents(asCPointer(), asCPointer(ink_rect), asCPointer(logical_rect));
    }

    /**
     * Determines the logical width and height of a `PangoLayout` in device
     * <br>units.
     * <br>
     * <br>[method&#64;Pango.Layout.get_size] returns the width and height
     * <br>scaled by %PANGO_SCALE. This is simply a convenience function
     * <br>around [method&#64;Pango.Layout.get_pixel_extents].
     * @param width location to store the logical width
     * @param height location to store the logical height
    */
    public void getPixelSize(@Nullable ch.bailu.gtk.type.Int width, @Nullable ch.bailu.gtk.type.Int height)  {
        JnaLayout.INST().pango_layout_get_pixel_size(asCPointer(), asCPointer(width), asCPointer(height));
    }

    /**
     * Returns the current serial number of &#64;layout.
     * <br>
     * <br>The serial number is initialized to an small number larger than zero
     * <br>when a new layout is created and is increased whenever the layout is
     * <br>changed using any of the setter functions, or the `PangoContext` it
     * <br>uses has changed. The serial may wrap, but will never have the value 0.
     * <br>Since it can wrap, never compare it with &quot;less than&quot;, always use &quot;not equals&quot;.
     * <br>
     * <br>This can be used to automatically detect changes to a `PangoLayout`,
     * <br>and is useful for example to decide whether a layout needs redrawing.
     * <br>To force the serial to be increased, use
     * <br>[method&#64;Pango.Layout.context_changed].
     * @return The current serial number of &#64;layout.
    */
    public int getSerial()  {
        return JnaLayout.INST().pango_layout_get_serial(asCPointer());
    }

    /**
     * Obtains whether &#64;layout is in single paragraph mode.
     * <br>
     * <br>See [method&#64;Pango.Layout.set_single_paragraph_mode].
     * @return %TRUE if the layout does not break paragraphs   at paragraph separator characters, %FALSE otherwise
    */
    public boolean getSingleParagraphMode()  {
        return JnaLayout.INST().pango_layout_get_single_paragraph_mode(asCPointer());
    }

    /**
     * Determines the logical width and height of a `PangoLayout` in Pango
     * <br>units.
     * <br>
     * <br>This is simply a convenience function around [method&#64;Pango.Layout.get_extents].
     * @param width location to store the logical width
     * @param height location to store the logical height
    */
    public void getSize(@Nullable ch.bailu.gtk.type.Int width, @Nullable ch.bailu.gtk.type.Int height)  {
        JnaLayout.INST().pango_layout_get_size(asCPointer(), asCPointer(width), asCPointer(height));
    }

    /**
     * Gets the amount of spacing between the lines of the layout.
     * @return the spacing in Pango units
    */
    public int getSpacing()  {
        return JnaLayout.INST().pango_layout_get_spacing(asCPointer());
    }

    /**
     * Gets the current `PangoTabArray` used by this layout.
     * <br>
     * <br>If no `PangoTabArray` has been set, then the default tabs are
     * <br>in use and %NULL is returned. Default tabs are every 8 spaces.
     * <br>
     * <br>The return value should be freed with [method&#64;Pango.TabArray.free].
     * @return a copy of the tabs for this layout
    */
    public TabArray getTabs()  {
        return new TabArray(new PointerContainer(JnaLayout.INST().pango_layout_get_tabs(asCPointer())));
    }

    /**
     * Gets the text in the layout.
     * <br>
     * <br>The returned text should not be freed or modified.
     * @return the text in the &#64;layout
    */
    public ch.bailu.gtk.type.Str getText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaLayout.INST().pango_layout_get_text(asCPointer())));
    }

    /**
     * Counts the number of unknown glyphs in &#64;layout.
     * <br>
     * <br>This function can be used to determine if there are any fonts
     * <br>available to render all characters in a certain string, or when
     * <br>used in combination with %PANGO_ATTR_FALLBACK, to check if a
     * <br>certain font supports all the characters in the string.
     * @return The number of unknown glyphs in &#64;layout
    */
    public int getUnknownGlyphsCount()  {
        return JnaLayout.INST().pango_layout_get_unknown_glyphs_count(asCPointer());
    }

    /**
     * Gets the width to which the lines of the `PangoLayout` should wrap.
     * @return the width in Pango units, or -1 if no width set.
    */
    public int getWidth()  {
        return JnaLayout.INST().pango_layout_get_width(asCPointer());
    }

    /**
     * Gets the wrap mode for the layout.
     * <br>
     * <br>Use [method&#64;Pango.Layout.is_wrapped] to query whether
     * <br>any paragraphs were actually wrapped.
     * @return active wrap mode.
    */
    public int getWrap()  {
        return JnaLayout.INST().pango_layout_get_wrap(asCPointer());
    }

    /**
     * Converts from byte &#64;index_ within the &#64;layout to line and X position.
     * <br>
     * <br>The X position is measured from the left edge of the line.
     * @param index_ the byte index of a grapheme within the layout
     * @param trailing an integer indicating the edge of the grapheme to retrieve the   position of. If &gt; 0, the trailing edge of the grapheme, if 0,   the leading of the grapheme
     * @param line location to store resulting line index. (which will   between 0 and pango_layout_get_line_count(layout) - 1)
     * @param x_pos location to store resulting position within line   (%PANGO_SCALE units per device unit)
    */
    public void indexToLineX(int index_, boolean trailing, @Nullable ch.bailu.gtk.type.Int line, @Nullable ch.bailu.gtk.type.Int x_pos)  {
        JnaLayout.INST().pango_layout_index_to_line_x(asCPointer(), index_, trailing, asCPointer(line), asCPointer(x_pos));
    }

    /**
     * Converts from an index within a `PangoLayout` to the onscreen position
     * <br>corresponding to the grapheme at that index.
     * <br>
     * <br>The returns is represented as rectangle. Note that `pos-&gt;x` is
     * <br>always the leading edge of the grapheme and `pos-&gt;x + pos-&gt;width` the
     * <br>trailing edge of the grapheme. If the directionality of the grapheme
     * <br>is right-to-left, then `pos-&gt;width` will be negative.
     * @param index_ byte index within &#64;layout
     * @param pos rectangle in which to store the position of the grapheme
    */
    public void indexToPos(int index_, @Nonnull Rectangle pos)  {
        JnaLayout.INST().pango_layout_index_to_pos(asCPointer(), index_, asCPointerNotNull(pos));
    }

    /**
     * Queries whether the layout had to ellipsize any paragraphs.
     * <br>
     * <br>This returns %TRUE if the ellipsization mode for &#64;layout
     * <br>is not %PANGO_ELLIPSIZE_NONE, a positive width is set on &#64;layout,
     * <br>and there are paragraphs exceeding that width that have to be
     * <br>ellipsized.
     * @return %TRUE if any paragraphs had to be ellipsized,   %FALSE otherwise
    */
    public boolean isEllipsized()  {
        return JnaLayout.INST().pango_layout_is_ellipsized(asCPointer());
    }

    /**
     * Queries whether the layout had to wrap any paragraphs.
     * <br>
     * <br>This returns %TRUE if a positive width is set on &#64;layout,
     * <br>ellipsization mode of &#64;layout is set to %PANGO_ELLIPSIZE_NONE,
     * <br>and there are paragraphs exceeding the layout width that have
     * <br>to be wrapped.
     * @return %TRUE if any paragraphs had to be wrapped, %FALSE   otherwise
    */
    public boolean isWrapped()  {
        return JnaLayout.INST().pango_layout_is_wrapped(asCPointer());
    }

    /**
     * Computes a new cursor position from an old position and a direction.
     * <br>
     * <br>If &#64;direction is positive, then the new position will cause the strong
     * <br>or weak cursor to be displayed one position to right of where it was
     * <br>with the old cursor position. If &#64;direction is negative, it will be
     * <br>moved to the left.
     * <br>
     * <br>In the presence of bidirectional text, the correspondence between
     * <br>logical and visual order will depend on the direction of the current
     * <br>run, and there may be jumps when the cursor is moved off of the end
     * <br>of a run.
     * <br>
     * <br>Motion here is in cursor positions, not in characters, so a single
     * <br>call to this function may move the cursor over multiple characters
     * <br>when multiple characters combine to form a single grapheme.
     * @param strong whether the moving cursor is the strong cursor or the   weak cursor. The strong cursor is the cursor corresponding   to text insertion in the base direction for the layout.
     * @param old_index the byte index of the current cursor position
     * @param old_trailing if 0, the cursor was at the leading edge of the   grapheme indicated by &#64;old_index, if &gt; 0, the cursor   was at the trailing edge.
     * @param direction direction to move cursor. A negative   value indicates motion to the left
     * @param new_index location to store the new cursor byte index.   A value of -1 indicates that the cursor has been moved off the   beginning of the layout. A value of %G_MAXINT indicates that   the cursor has been moved off the end of the layout.
     * @param new_trailing number of characters to move forward from   the location returned for &#64;new_index to get the position where   the cursor should be displayed. This allows distinguishing the   position at the beginning of one line from the position at the   end of the preceding line. &#64;new_index is always on the line where   the cursor should be displayed.
    */
    public void moveCursorVisually(boolean strong, int old_index, int old_trailing, int direction, @Nonnull ch.bailu.gtk.type.Int new_index, @Nonnull ch.bailu.gtk.type.Int new_trailing)  {
        JnaLayout.INST().pango_layout_move_cursor_visually(asCPointer(), strong, old_index, old_trailing, direction, asCPointerNotNull(new_index), asCPointerNotNull(new_trailing));
    }

    /**
     * Serializes the &#64;layout for later deserialization via [func&#64;Pango.Layout.deserialize].
     * <br>
     * <br>There are no guarantees about the format of the output across different
     * <br>versions of Pango and [func&#64;Pango.Layout.deserialize] will reject data
     * <br>that it cannot parse.
     * <br>
     * <br>The intended use of this function is testing, benchmarking and debugging.
     * <br>The format is not meant as a permanent storage format.
     * @param flags `PangoLayoutSerializeFlags`
     * @return a `GBytes` containing the serialized form of &#64;layout
    */
    public ch.bailu.gtk.glib.Bytes serialize(int flags)  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaLayout.INST().pango_layout_serialize(asCPointer(), flags)));
    }

    /**
     * Sets the alignment for the layout: how partial lines are
     * <br>positioned within the horizontal space available.
     * <br>
     * <br>The default alignment is %PANGO_ALIGN_LEFT.
     * @param alignment the alignment
    */
    public void setAlignment(int alignment)  {
        JnaLayout.INST().pango_layout_set_alignment(asCPointer(), alignment);
    }

    /**
     * Sets the text attributes for a layout object.
     * <br>
     * <br>References &#64;attrs, so the caller can unref its reference.
     * @param attrs a `PangoAttrList`
    */
    public void setAttributes(@Nullable AttrList attrs)  {
        JnaLayout.INST().pango_layout_set_attributes(asCPointer(), asCPointer(attrs));
    }

    /**
     * Sets whether to calculate the base direction
     * <br>for the layout according to its contents.
     * <br>
     * <br>When this flag is on (the default), then paragraphs in &#64;layout that
     * <br>begin with strong right-to-left characters (Arabic and Hebrew principally),
     * <br>will have right-to-left layout, paragraphs with letters from other scripts
     * <br>will have left-to-right layout. Paragraphs with only neutral characters
     * <br>get their direction from the surrounding paragraphs.
     * <br>
     * <br>When %FALSE, the choice between left-to-right and right-to-left
     * <br>layout is done according to the base direction of the layout's
     * <br>`PangoContext`. (See [method&#64;Pango.Context.set_base_dir]).
     * <br>
     * <br>When the auto-computed direction of a paragraph differs from the
     * <br>base direction of the context, the interpretation of
     * <br>%PANGO_ALIGN_LEFT and %PANGO_ALIGN_RIGHT are swapped.
     * @param auto_dir if %TRUE, compute the bidirectional base direction   from the layout's contents
    */
    public void setAutoDir(boolean auto_dir)  {
        JnaLayout.INST().pango_layout_set_auto_dir(asCPointer(), auto_dir);
    }

    /**
     * Sets the type of ellipsization being performed for &#64;layout.
     * <br>
     * <br>Depending on the ellipsization mode &#64;ellipsize text is
     * <br>removed from the start, middle, or end of text so they
     * <br>fit within the width and height of layout set with
     * <br>[method&#64;Pango.Layout.set_width] and [method&#64;Pango.Layout.set_height].
     * <br>
     * <br>If the layout contains characters such as newlines that
     * <br>force it to be layed out in multiple paragraphs, then whether
     * <br>each paragraph is ellipsized separately or the entire layout
     * <br>is ellipsized as a whole depends on the set height of the layout.
     * <br>
     * <br>The default value is %PANGO_ELLIPSIZE_NONE.
     * <br>
     * <br>See [method&#64;Pango.Layout.set_height] for details.
     * @param ellipsize the new ellipsization mode for &#64;layout
    */
    public void setEllipsize(int ellipsize)  {
        JnaLayout.INST().pango_layout_set_ellipsize(asCPointer(), ellipsize);
    }

    /**
     * Sets the default font description for the layout.
     * <br>
     * <br>If no font description is set on the layout, the
     * <br>font description from the layout's context is used.
     * @param desc the new `PangoFontDescription`   to unset the current font description
    */
    public void setFontDescription(@Nullable FontDescription desc)  {
        JnaLayout.INST().pango_layout_set_font_description(asCPointer(), asCPointer(desc));
    }

    /**
     * Sets the height to which the `PangoLayout` should be ellipsized at.
     * <br>
     * <br>There are two different behaviors, based on whether &#64;height is positive
     * <br>or negative.
     * <br>
     * <br>If &#64;height is positive, it will be the maximum height of the layout. Only
     * <br>lines would be shown that would fit, and if there is any text omitted,
     * <br>an ellipsis added. At least one line is included in each paragraph regardless
     * <br>of how small the height value is. A value of zero will render exactly one
     * <br>line for the entire layout.
     * <br>
     * <br>If &#64;height is negative, it will be the (negative of) maximum number of lines
     * <br>per paragraph. That is, the total number of lines shown may well be more than
     * <br>this value if the layout contains multiple paragraphs of text.
     * <br>The default value of -1 means that the first line of each paragraph is ellipsized.
     * <br>This behavior may be changed in the future to act per layout instead of per
     * <br>paragraph. File a bug against pango at
     * <br>[https://gitlab.gnome.org/gnome/pango](https://gitlab.gnome.org/gnome/pango)
     * <br>if your code relies on this behavior.
     * <br>
     * <br>Height setting only has effect if a positive width is set on
     * <br>&#64;layout and ellipsization mode of &#64;layout is not %PANGO_ELLIPSIZE_NONE.
     * <br>The behavior is undefined if a height other than -1 is set and
     * <br>ellipsization mode is set to %PANGO_ELLIPSIZE_NONE, and may change in the
     * <br>future.
     * @param height the desired height of the layout in Pango units if positive,   or desired number of lines if negative.
    */
    public void setHeight(int height)  {
        JnaLayout.INST().pango_layout_set_height(asCPointer(), height);
    }

    /**
     * Sets the width in Pango units to indent each paragraph.
     * <br>
     * <br>A negative value of &#64;indent will produce a hanging indentation.
     * <br>That is, the first line will have the full width, and subsequent
     * <br>lines will be indented by the absolute value of &#64;indent.
     * <br>
     * <br>The indent setting is ignored if layout alignment is set to
     * <br>%PANGO_ALIGN_CENTER.
     * <br>
     * <br>The default value is 0.
     * @param indent the amount by which to indent
    */
    public void setIndent(int indent)  {
        JnaLayout.INST().pango_layout_set_indent(asCPointer(), indent);
    }

    /**
     * Sets whether each complete line should be stretched to fill the
     * <br>entire width of the layout.
     * <br>
     * <br>Stretching is typically done by adding whitespace, but for some scripts
     * <br>(such as Arabic), the justification may be done in more complex ways,
     * <br>like extending the characters.
     * <br>
     * <br>Note that this setting is not implemented and so is ignored in
     * <br>Pango older than 1.18.
     * <br>
     * <br>Note that tabs and justification conflict with each other:
     * <br>Justification will move content away from its tab-aligned
     * <br>positions.
     * <br>
     * <br>The default value is %FALSE.
     * <br>
     * <br>Also see [method&#64;Pango.Layout.set_justify_last_line].
     * @param justify whether the lines in the layout should be justified
    */
    public void setJustify(boolean justify)  {
        JnaLayout.INST().pango_layout_set_justify(asCPointer(), justify);
    }

    /**
     * Sets whether the last line should be stretched to fill the
     * <br>entire width of the layout.
     * <br>
     * <br>This only has an effect if [method&#64;Pango.Layout.set_justify] has
     * <br>been called as well.
     * <br>
     * <br>The default value is %FALSE.
     * @param justify whether the last line in the layout should be justified
    */
    public void setJustifyLastLine(boolean justify)  {
        JnaLayout.INST().pango_layout_set_justify_last_line(asCPointer(), justify);
    }

    /**
     * Sets a factor for line spacing.
     * <br>
     * <br>Typical values are: 0, 1, 1.5, 2. The default values is 0.
     * <br>
     * <br>If &#64;factor is non-zero, lines are placed so that
     * <br>
     * <br>    baseline2 = baseline1 + factor * height2
     * <br>
     * <br>where height2 is the line height of the second line
     * <br>(as determined by the font(s)). In this case, the spacing
     * <br>set with [method&#64;Pango.Layout.set_spacing] is ignored.
     * <br>
     * <br>If &#64;factor is zero (the default), spacing is applied as before.
     * <br>
     * <br>Note: for semantics that are closer to the CSS line-height
     * <br>property, see [func&#64;Pango.attr_line_height_new].
     * @param factor the new line spacing factor
    */
    public void setLineSpacing(float factor)  {
        JnaLayout.INST().pango_layout_set_line_spacing(asCPointer(), factor);
    }

    /**
     * Sets the layout text and attribute list from marked-up text.
     * <br>
     * <br>See [Pango Markup](pango_markup.html)).
     * <br>
     * <br>Replaces the current text and attribute list.
     * <br>
     * <br>This is the same as [method&#64;Pango.Layout.set_markup_with_accel],
     * <br>but the markup text isn't scanned for accelerators.
     * @param markup marked-up text
     * @param length length of marked-up text in bytes, or -1 if &#64;markup is   `NUL`-terminated
    */
    public void setMarkup(@Nonnull ch.bailu.gtk.type.Str markup, int length)  {
        JnaLayout.INST().pango_layout_set_markup(asCPointer(), asCPointerNotNull(markup), length);
    }

    /**
     * Sets the layout text and attribute list from marked-up text.
     * <br>
     * <br>See [Pango Markup](pango_markup.html)).
     * <br>
     * <br>Replaces the current text and attribute list.
     * <br>
     * <br>This is the same as [method&#64;Pango.Layout.set_markup_with_accel],
     * <br>but the markup text isn't scanned for accelerators.
     * @param markup marked-up text
     * @param length length of marked-up text in bytes, or -1 if &#64;markup is   `NUL`-terminated
    */
    public void setMarkup(String markup, int length)  {
        JnaLayout.INST().pango_layout_set_markup(asCPointer(), markup, length);
    }

    /**
     * Sets the single paragraph mode of &#64;layout.
     * <br>
     * <br>If &#64;setting is %TRUE, do not treat newlines and similar characters
     * <br>as paragraph separators; instead, keep all text in a single paragraph,
     * <br>and display a glyph for paragraph separator characters. Used when
     * <br>you want to allow editing of newlines on a single text line.
     * <br>
     * <br>The default value is %FALSE.
     * @param setting new setting
    */
    public void setSingleParagraphMode(boolean setting)  {
        JnaLayout.INST().pango_layout_set_single_paragraph_mode(asCPointer(), setting);
    }

    /**
     * Sets the amount of spacing in Pango units between
     * <br>the lines of the layout.
     * <br>
     * <br>When placing lines with spacing, Pango arranges things so that
     * <br>
     * <br>    line2.top = line1.bottom + spacing
     * <br>
     * <br>The default value is 0.
     * <br>
     * <br>Note: Since 1.44, Pango is using the line height (as determined
     * <br>by the font) for placing lines when the line spacing factor is set
     * <br>to a non-zero value with [method&#64;Pango.Layout.set_line_spacing].
     * <br>In that case, the &#64;spacing set with this function is ignored.
     * <br>
     * <br>Note: for semantics that are closer to the CSS line-height
     * <br>property, see [func&#64;Pango.attr_line_height_new].
     * @param spacing the amount of spacing
    */
    public void setSpacing(int spacing)  {
        JnaLayout.INST().pango_layout_set_spacing(asCPointer(), spacing);
    }

    /**
     * Sets the tabs to use for &#64;layout, overriding the default tabs.
     * <br>
     * <br>`PangoLayout` will place content at the next tab position
     * <br>whenever it meets a Tab character (U+0009).
     * <br>
     * <br>By default, tabs are every 8 spaces. If &#64;tabs is %NULL, the
     * <br>default tabs are reinstated. &#64;tabs is copied into the layout;
     * <br>you must free your copy of &#64;tabs yourself.
     * <br>
     * <br>Note that tabs and justification conflict with each other:
     * <br>Justification will move content away from its tab-aligned
     * <br>positions. The same is true for alignments other than
     * <br>%PANGO_ALIGN_LEFT.
     * @param tabs a `PangoTabArray`
    */
    public void setTabs(@Nullable TabArray tabs)  {
        JnaLayout.INST().pango_layout_set_tabs(asCPointer(), asCPointer(tabs));
    }

    /**
     * Sets the text of the layout.
     * <br>
     * <br>This function validates &#64;text and renders invalid UTF-8
     * <br>with a placeholder glyph.
     * <br>
     * <br>Note that if you have used [method&#64;Pango.Layout.set_markup] or
     * <br>[method&#64;Pango.Layout.set_markup_with_accel] on &#64;layout before, you
     * <br>may want to call [method&#64;Pango.Layout.set_attributes] to clear the
     * <br>attributes set on the layout from the markup as this function does
     * <br>not clear attributes.
     * @param text the text
     * @param length maximum length of &#64;text, in bytes. -1 indicates that   the string is nul-terminated and the length should be calculated.   The text will also be truncated on encountering a nul-termination   even when &#64;length is positive.
    */
    public void setText(@Nonnull ch.bailu.gtk.type.Str text, int length)  {
        JnaLayout.INST().pango_layout_set_text(asCPointer(), asCPointerNotNull(text), length);
    }

    /**
     * Sets the text of the layout.
     * <br>
     * <br>This function validates &#64;text and renders invalid UTF-8
     * <br>with a placeholder glyph.
     * <br>
     * <br>Note that if you have used [method&#64;Pango.Layout.set_markup] or
     * <br>[method&#64;Pango.Layout.set_markup_with_accel] on &#64;layout before, you
     * <br>may want to call [method&#64;Pango.Layout.set_attributes] to clear the
     * <br>attributes set on the layout from the markup as this function does
     * <br>not clear attributes.
     * @param text the text
     * @param length maximum length of &#64;text, in bytes. -1 indicates that   the string is nul-terminated and the length should be calculated.   The text will also be truncated on encountering a nul-termination   even when &#64;length is positive.
    */
    public void setText(String text, int length)  {
        JnaLayout.INST().pango_layout_set_text(asCPointer(), text, length);
    }

    /**
     * Sets the width to which the lines of the `PangoLayout` should wrap or
     * <br>ellipsized.
     * <br>
     * <br>The default value is -1: no width set.
     * @param width the desired width in Pango units, or -1 to indicate that no   wrapping or ellipsization should be performed.
    */
    public void setWidth(int width)  {
        JnaLayout.INST().pango_layout_set_width(asCPointer(), width);
    }

    /**
     * Sets the wrap mode.
     * <br>
     * <br>The wrap mode only has effect if a width is set on the layout
     * <br>with [method&#64;Pango.Layout.set_width]. To turn off wrapping,
     * <br>set the width to -1.
     * <br>
     * <br>The default value is %PANGO_WRAP_WORD.
     * @param wrap the wrap mode
    */
    public void setWrap(int wrap)  {
        JnaLayout.INST().pango_layout_set_wrap(asCPointer(), wrap);
    }

    /**
     * A convenience method to serialize a layout to a file.
     * <br>
     * <br>It is equivalent to calling [method&#64;Pango.Layout.serialize]
     * <br>followed by [func&#64;GLib.file_set_contents].
     * <br>
     * <br>See those two functions for details on the arguments.
     * <br>
     * <br>It is mostly intended for use inside a debugger to quickly dump
     * <br>a layout to a file for later inspection.
     * @param flags `PangoLayoutSerializeFlags`
     * @param filename the file to save it to
     * @return %TRUE if saving was successful
    */
    public boolean writeToFile(int flags, @Nonnull ch.bailu.gtk.type.Str filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaLayout.INST().pango_layout_write_to_file(asCPointer(), flags, asCPointerNotNull(filename), 0L);
    }

    /**
     * A convenience method to serialize a layout to a file.
     * <br>
     * <br>It is equivalent to calling [method&#64;Pango.Layout.serialize]
     * <br>followed by [func&#64;GLib.file_set_contents].
     * <br>
     * <br>See those two functions for details on the arguments.
     * <br>
     * <br>It is mostly intended for use inside a debugger to quickly dump
     * <br>a layout to a file for later inspection.
     * @param flags `PangoLayoutSerializeFlags`
     * @param filename the file to save it to
     * @return %TRUE if saving was successful
    */
    public boolean writeToFile(int flags, String filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaLayout.INST().pango_layout_write_to_file(asCPointer(), flags, filename, 0L);
    }

    /**
     * Converts from X and Y position within a layout to the byte index to the
     * <br>character at that logical position.
     * <br>
     * <br>If the Y position is not inside the layout, the closest position is
     * <br>chosen (the position will be clamped inside the layout). If the X position
     * <br>is not within the layout, then the start or the end of the line is
     * <br>chosen as described for [method&#64;Pango.LayoutLine.x_to_index]. If either
     * <br>the X or Y positions were not inside the layout, then the function returns
     * <br>%FALSE; on an exact hit, it returns %TRUE.
     * @param x the X offset (in Pango units) from the left edge of the layout
     * @param y the Y offset (in Pango units) from the top edge of the layout
     * @param index_ location to store calculated byte index
     * @param trailing location to store a integer indicating where   in the grapheme the user clicked. It will either be zero, or the   number of characters in the grapheme. 0 represents the leading edge   of the grapheme.
     * @return %TRUE if the coordinates were inside text, %FALSE otherwise
    */
    public boolean xyToIndex(int x, int y, @Nonnull ch.bailu.gtk.type.Int index_, @Nonnull ch.bailu.gtk.type.Int trailing)  {
        return JnaLayout.INST().pango_layout_xy_to_index(asCPointer(), x, y, asCPointerNotNull(index_), asCPointerNotNull(trailing));
    }

    /**
     * Loads data previously created via [method&#64;Pango.Layout.serialize].
     * <br>
     * <br>For a discussion of the supported format, see that function.
     * <br>
     * <br>Note: to verify that the returned layout is identical to
     * <br>the one that was serialized, you can compare &#64;bytes to the
     * <br>result of serializing the layout again.
     * @param context a `PangoContext`
     * @param bytes the bytes containing the data
     * @param flags `PangoLayoutDeserializeFlags`
     * @return a new `PangoLayout`
    */
    public static Layout deserialize(@Nonnull Context context, @Nonnull ch.bailu.gtk.glib.Bytes bytes, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Layout(new PointerContainer(JnaLayout.INST().pango_layout_deserialize(asCPointerNotNull(context), asCPointerNotNull(bytes), flags, 0L)));
    }

    public static long getTypeID() { 
        return JnaLayout.INST().pango_layout_get_type(); 
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
class-type

[MethodModel:java-type-not-supported:getLogAttrs:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoLogAttr**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getLogAttrsReadonly:[ParameterModel:java-type-not-supported:{G_::{c:const PangoLogAttr*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:java-type-not-supported:setMarkupWithAccel:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gunichar}}:{j:byte}]
        [ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]
*/
