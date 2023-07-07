/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `PangoRenderer` is a base class for objects that can render text
 * <br>provided as `PangoGlyphString` or `PangoLayout`.
 * <br>
 * <br>By subclassing `PangoRenderer` and overriding operations such as
 * <br>&#64;draw_glyphs and &#64;draw_rectangle, renderers for particular font
 * <br>backends and destinations can be created.
 * <p><a href="https://docs.gtk.org/Pango/class.Renderer.html">https://docs.gtk.org/Pango/class.Renderer.html</a></p>
*/
public class Renderer extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Renderer.class.getCanonicalName());
    }

    public Renderer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Does initial setup before rendering operations on &#64;renderer.
     * <br>
     * <br>[method&#64;Pango.Renderer.deactivate] should be called when done drawing.
     * <br>Calls such as [method&#64;Pango.Renderer.draw_layout] automatically
     * <br>activate the layout before drawing on it.
     * <br>
     * <br>Calls to [method&#64;Pango.Renderer.activate] and
     * <br>[method&#64;Pango.Renderer.deactivate] can be nested and the
     * <br>renderer will only be initialized and deinitialized once.
    */
    public void activate()  {
        JnaRenderer.INST().pango_renderer_activate(asCPointer());
    }

    /**
     * Cleans up after rendering operations on &#64;renderer.
     * <br>
     * <br>See docs for [method&#64;Pango.Renderer.activate].
    */
    public void deactivate()  {
        JnaRenderer.INST().pango_renderer_deactivate(asCPointer());
    }

    /**
     * Draw a squiggly line that approximately covers the given rectangle
     * <br>in the style of an underline used to indicate a spelling error.
     * <br>
     * <br>The width of the underline is rounded to an integer number
     * <br>of up/down segments and the resulting rectangle is centered
     * <br>in the original rectangle.
     * <br>
     * <br>This should be called while &#64;renderer is already active.
     * <br>Use [method&#64;Pango.Renderer.activate] to activate a renderer.
     * @param x X coordinate of underline, in Pango units in user coordinate system
     * @param y Y coordinate of underline, in Pango units in user coordinate system
     * @param width width of underline, in Pango units in user coordinate system
     * @param height height of underline, in Pango units in user coordinate system
    */
    public void drawErrorUnderline(int x, int y, int width, int height)  {
        JnaRenderer.INST().pango_renderer_draw_error_underline(asCPointer(), x, y, width, height);
    }

    /**
     * Draws the glyphs in &#64;glyph_item with the specified `PangoRenderer`,
     * <br>embedding the text associated with the glyphs in the output if the
     * <br>output format supports it.
     * <br>
     * <br>This is useful for rendering text in PDF.
     * <br>
     * <br>Note that this method does not handle attributes in &#64;glyph_item.
     * <br>If you want colors, shapes and lines handled automatically according
     * <br>to those attributes, you need to use pango_renderer_draw_layout_line()
     * <br>or pango_renderer_draw_layout().
     * <br>
     * <br>Note that &#64;text is the start of the text for layout, which is then
     * <br>indexed by `glyph_item-&gt;item-&gt;offset`.
     * <br>
     * <br>If &#64;text is %NULL, this simply calls [method&#64;Pango.Renderer.draw_glyphs].
     * <br>
     * <br>The default implementation of this method simply falls back to
     * <br>[method&#64;Pango.Renderer.draw_glyphs].
     * @param text the UTF-8 text that &#64;glyph_item refers to
     * @param glyph_item a `PangoGlyphItem`
     * @param x X position of left edge of baseline, in user space coordinates   in Pango units
     * @param y Y position of left edge of baseline, in user space coordinates   in Pango units
    */
    public void drawGlyphItem(@Nullable ch.bailu.gtk.type.Str text, @Nonnull GlyphItem glyph_item, int x, int y)  {
        JnaRenderer.INST().pango_renderer_draw_glyph_item(asCPointer(), asCPointer(text), asCPointerNotNull(glyph_item), x, y);
    }

    /**
     * Draws the glyphs in &#64;glyph_item with the specified `PangoRenderer`,
     * <br>embedding the text associated with the glyphs in the output if the
     * <br>output format supports it.
     * <br>
     * <br>This is useful for rendering text in PDF.
     * <br>
     * <br>Note that this method does not handle attributes in &#64;glyph_item.
     * <br>If you want colors, shapes and lines handled automatically according
     * <br>to those attributes, you need to use pango_renderer_draw_layout_line()
     * <br>or pango_renderer_draw_layout().
     * <br>
     * <br>Note that &#64;text is the start of the text for layout, which is then
     * <br>indexed by `glyph_item-&gt;item-&gt;offset`.
     * <br>
     * <br>If &#64;text is %NULL, this simply calls [method&#64;Pango.Renderer.draw_glyphs].
     * <br>
     * <br>The default implementation of this method simply falls back to
     * <br>[method&#64;Pango.Renderer.draw_glyphs].
     * @param text the UTF-8 text that &#64;glyph_item refers to
     * @param glyph_item a `PangoGlyphItem`
     * @param x X position of left edge of baseline, in user space coordinates   in Pango units
     * @param y Y position of left edge of baseline, in user space coordinates   in Pango units
    */
    public void drawGlyphItem(String text, @Nonnull GlyphItem glyph_item, int x, int y)  {
        JnaRenderer.INST().pango_renderer_draw_glyph_item(asCPointer(), text, asCPointerNotNull(glyph_item), x, y);
    }

    /**
     * Draws the glyphs in &#64;glyphs with the specified `PangoRenderer`.
     * @param font a `PangoFont`
     * @param glyphs a `PangoGlyphString`
     * @param x X position of left edge of baseline, in user space coordinates   in Pango units.
     * @param y Y position of left edge of baseline, in user space coordinates   in Pango units.
    */
    public void drawGlyphs(@Nonnull Font font, @Nonnull GlyphString glyphs, int x, int y)  {
        JnaRenderer.INST().pango_renderer_draw_glyphs(asCPointer(), asCPointerNotNull(font), asCPointerNotNull(glyphs), x, y);
    }

    /**
     * Draws &#64;layout with the specified `PangoRenderer`.
     * <br>
     * <br>This is equivalent to drawing the lines of the layout, at their
     * <br>respective positions relative to &#64;x, &#64;y.
     * @param layout a `PangoLayout`
     * @param x X position of left edge of baseline, in user space coordinates   in Pango units.
     * @param y Y position of left edge of baseline, in user space coordinates   in Pango units.
    */
    public void drawLayout(@Nonnull Layout layout, int x, int y)  {
        JnaRenderer.INST().pango_renderer_draw_layout(asCPointer(), asCPointerNotNull(layout), x, y);
    }

    /**
     * Draws &#64;line with the specified `PangoRenderer`.
     * <br>
     * <br>This draws the glyph items that make up the line, as well as
     * <br>shapes, backgrounds and lines that are specified by the attributes
     * <br>of those items.
     * @param line a `PangoLayoutLine`
     * @param x X position of left edge of baseline, in user space coordinates   in Pango units.
     * @param y Y position of left edge of baseline, in user space coordinates   in Pango units.
    */
    public void drawLayoutLine(@Nonnull LayoutLine line, int x, int y)  {
        JnaRenderer.INST().pango_renderer_draw_layout_line(asCPointer(), asCPointerNotNull(line), x, y);
    }

    /**
     * Draws an axis-aligned rectangle in user space coordinates with the
     * <br>specified `PangoRenderer`.
     * <br>
     * <br>This should be called while &#64;renderer is already active.
     * <br>Use [method&#64;Pango.Renderer.activate] to activate a renderer.
     * @param part type of object this rectangle is part of
     * @param x X position at which to draw rectangle, in user space coordinates   in Pango units
     * @param y Y position at which to draw rectangle, in user space coordinates   in Pango units
     * @param width width of rectangle in Pango units
     * @param height height of rectangle in Pango units
    */
    public void drawRectangle(int part, int x, int y, int width, int height)  {
        JnaRenderer.INST().pango_renderer_draw_rectangle(asCPointer(), part, x, y, width, height);
    }

    /**
     * Draws a trapezoid with the parallel sides aligned with the X axis
     * <br>using the given `PangoRenderer`; coordinates are in device space.
     * @param part type of object this trapezoid is part of
     * @param y1_ Y coordinate of top of trapezoid
     * @param x11 X coordinate of left end of top of trapezoid
     * @param x21 X coordinate of right end of top of trapezoid
     * @param y2 Y coordinate of bottom of trapezoid
     * @param x12 X coordinate of left end of bottom of trapezoid
     * @param x22 X coordinate of right end of bottom of trapezoid
    */
    public void drawTrapezoid(int part, double y1_, double x11, double x21, double y2, double x12, double x22)  {
        JnaRenderer.INST().pango_renderer_draw_trapezoid(asCPointer(), part, y1_, x11, x21, y2, x12, x22);
    }

    /**
     * Gets the current alpha for the specified part.
     * @param part the part to get the alpha for
     * @return the alpha for the specified part,   or 0 if it hasn't been set and should be   inherited from the environment.
    */
    public int getAlpha(int part)  {
        return JnaRenderer.INST().pango_renderer_get_alpha(asCPointer(), part);
    }

    /**
     * Gets the current rendering color for the specified part.
     * @param part the part to get the color for
     * @return the color for the   specified part, or %NULL if it hasn't been set and should be   inherited from the environment.
    */
    public Color getColor(int part)  {
        return new Color(new PointerContainer(JnaRenderer.INST().pango_renderer_get_color(asCPointer(), part)));
    }

    /**
     * Gets the layout currently being rendered using &#64;renderer.
     * <br>
     * <br>Calling this function only makes sense from inside a subclass's
     * <br>methods, like in its draw_shape vfunc, for example.
     * <br>
     * <br>The returned layout should not be modified while still being
     * <br>rendered.
     * @return the layout, or %NULL if   no layout is being rendered using &#64;renderer at this time.
    */
    public Layout getLayout()  {
        return new Layout(new PointerContainer(JnaRenderer.INST().pango_renderer_get_layout(asCPointer())));
    }

    /**
     * Gets the layout line currently being rendered using &#64;renderer.
     * <br>
     * <br>Calling this function only makes sense from inside a subclass's
     * <br>methods, like in its draw_shape vfunc, for example.
     * <br>
     * <br>The returned layout line should not be modified while still being
     * <br>rendered.
     * @return the layout line, or %NULL   if no layout line is being rendered using &#64;renderer at this time.
    */
    public LayoutLine getLayoutLine()  {
        return new LayoutLine(new PointerContainer(JnaRenderer.INST().pango_renderer_get_layout_line(asCPointer())));
    }

    /**
     * Gets the transformation matrix that will be applied when
     * <br>rendering.
     * <br>
     * <br>See [method&#64;Pango.Renderer.set_matrix].
     * @return the matrix, or %NULL if no matrix has   been set (which is the same as the identity matrix). The returned   matrix is owned by Pango and must not be modified or freed.
    */
    public Matrix getMatrix()  {
        return new Matrix(new PointerContainer(JnaRenderer.INST().pango_renderer_get_matrix(asCPointer())));
    }

    /**
     * Informs Pango that the way that the rendering is done
     * <br>for &#64;part has changed.
     * <br>
     * <br>This should be called if the rendering changes in a way that would
     * <br>prevent multiple pieces being joined together into one drawing call.
     * <br>For instance, if a subclass of `PangoRenderer` was to add a stipple
     * <br>option for drawing underlines, it needs to call
     * <br>
     * <br>```
     * <br>pango_renderer_part_changed (render, PANGO_RENDER_PART_UNDERLINE);
     * <br>```
     * <br>
     * <br>When the stipple changes or underlines with different stipples
     * <br>might be joined together. Pango automatically calls this for
     * <br>changes to colors. (See [method&#64;Pango.Renderer.set_color])
     * @param part the part for which rendering has changed.
    */
    public void partChanged(int part)  {
        JnaRenderer.INST().pango_renderer_part_changed(asCPointer(), part);
    }

    /**
     * Sets the alpha for part of the rendering.
     * <br>
     * <br>Note that the alpha may only be used if a color is
     * <br>specified for &#64;part as well.
     * @param part the part to set the alpha for
     * @param alpha an alpha value between 1 and 65536, or 0 to unset the alpha
    */
    public void setAlpha(int part, int alpha)  {
        JnaRenderer.INST().pango_renderer_set_alpha(asCPointer(), part, alpha);
    }

    /**
     * Sets the color for part of the rendering.
     * <br>
     * <br>Also see [method&#64;Pango.Renderer.set_alpha].
     * @param part the part to change the color of
     * @param color the new color or %NULL to unset the current color
    */
    public void setColor(int part, @Nullable Color color)  {
        JnaRenderer.INST().pango_renderer_set_color(asCPointer(), part, asCPointer(color));
    }

    /**
     * Sets the transformation matrix that will be applied when rendering.
     * @param matrix a `PangoMatrix`, or %NULL to unset any existing matrix  (No matrix set is the same as setting the identity matrix.)
    */
    public void setMatrix(@Nullable Matrix matrix)  {
        JnaRenderer.INST().pango_renderer_set_matrix(asCPointer(), asCPointer(matrix));
    }

    public static long getTypeID() { 
        return JnaRenderer.INST().pango_renderer_get_type(); 
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

[MethodModel:java-type-not-supported:drawGlyph:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Font:{c:PangoFont*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoGlyph}}:{j:}]
        [ParameterModel:Supported:{G_::{c:double}}:{j:double}]
        [ParameterModel:Supported:{G_::{c:double}}:{j:double}]
*/
