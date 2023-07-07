/* this file is machine generated */
package ch.bailu.gtk.pangocairo;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public class Pangocairo extends ch.bailu.gtk.type.Package {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Pangocairo.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnShapeRendererFunc {
        /**
         * Function type for rendering attributes of type %PANGO_ATTR_SHAPE
         * <br>with Pango's Cairo renderer.
         * @param cr a Cairo context with current point set to where the shape should be rendered
         * @param attr the %PANGO_ATTR_SHAPE to render
         * @param do_path whether only the shape path should be appended to current path of &#64;cr and no filling/stroking done.  This will be set to %TRUE when called from pango_cairo_layout_path() and pango_cairo_layout_line_path() rendering functions.
         * @param data user data passed to pango_cairo_context_set_shape_renderer()
        */
        void onShapeRendererFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull ch.bailu.gtk.pango.AttrShape attr, boolean do_path, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaPangocairo.OnShapeRendererFunc toOnShapeRendererFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnShapeRendererFunc in) {
        JnaPangocairo.OnShapeRendererFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cr, _attr, _do_path, _data) -> in.onShapeRendererFunc(__callback, new ch.bailu.gtk.cairo.Context(new PointerContainer(_cr)), new ch.bailu.gtk.pango.AttrShape(new PointerContainer(_attr)), _do_path, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaPangocairo.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaPangocairo.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    /**
     * Retrieves any font rendering options previously set with
     * <br>[func&#64;PangoCairo.context_set_font_options].
     * <br>
     * <br>This function does not report options that are derived from
     * <br>the target surface by [func&#64;update_context].
     * @param context a `PangoContext`, from a pangocairo font map
     * @return the font options previously set on the   context, or %NULL if no options have been set. This value is   owned by the context and must not be modified or freed.
    */
    public static ch.bailu.gtk.cairo.FontOptions contextGetFontOptions(@Nonnull ch.bailu.gtk.pango.Context context)  {
        return new ch.bailu.gtk.cairo.FontOptions(new PointerContainer(JnaPangocairo.INST().pango_cairo_context_get_font_options(asCPointerNotNull(context))));
    }

    /**
     * Gets the resolution for the context.
     * <br>
     * <br>See [func&#64;PangoCairo.context_set_resolution]
     * @param context a `PangoContext`, from a pangocairo font map
     * @return the resolution in &quot;dots per inch&quot;. A negative value will   be returned if no resolution has previously been set.
    */
    public static double contextGetResolution(@Nonnull ch.bailu.gtk.pango.Context context)  {
        return JnaPangocairo.INST().pango_cairo_context_get_resolution(asCPointerNotNull(context));
    }

    /**
     * Sets the font options used when rendering text with this context.
     * <br>
     * <br>These options override any options that [func&#64;update_context]
     * <br>derives from the target surface.
     * @param context a `PangoContext`, from a pangocairo font map
     * @param options a `cairo_font_options_t`, or %NULL to unset   any previously set options. A copy is made.
    */
    public static void contextSetFontOptions(@Nonnull ch.bailu.gtk.pango.Context context, @Nullable ch.bailu.gtk.cairo.FontOptions options)  {
        JnaPangocairo.INST().pango_cairo_context_set_font_options(asCPointerNotNull(context), asCPointer(options));
    }

    /**
     * Sets the resolution for the context.
     * <br>
     * <br>This is a scale factor between points specified in a `PangoFontDescription`
     * <br>and Cairo units. The default value is 96, meaning that a 10 point font will
     * <br>be 13 units high. (10 * 96. / 72. = 13.3).
     * @param context a `PangoContext`, from a pangocairo font map
     * @param dpi the resolution in &quot;dots per inch&quot;. (Physical inches aren't actually   involved; the terminology is conventional.) A 0 or negative value   means to use the resolution from the font map.
    */
    public static void contextSetResolution(@Nonnull ch.bailu.gtk.pango.Context context, double dpi)  {
        JnaPangocairo.INST().pango_cairo_context_set_resolution(asCPointerNotNull(context), dpi);
    }

    /**
     * Sets callback function for context to use for rendering attributes
     * <br>of type %PANGO_ATTR_SHAPE.
     * <br>
     * <br>See `PangoCairoShapeRendererFunc` for details.
     * @param context a `PangoContext`, from a pangocairo font map
     * @param func Callback function for rendering attributes of   type %PANGO_ATTR_SHAPE, or %NULL to disable shape rendering.
     * @param data User data that will be passed to &#64;func.
     * @param dnotify Callback that will be called when the   context is freed to release &#64;data
    */
    public static void contextSetShapeRenderer(@Nonnull ch.bailu.gtk.pango.Context context, OnShapeRendererFunc func, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify dnotify)  {
        JnaPangocairo.INST().pango_cairo_context_set_shape_renderer(asCPointerNotNull(context), toOnShapeRendererFunc(getClassHandler().getInstance(), "contextSetShapeRenderer", func), asCPointer(data), toOnDestroyNotify(getClassHandler().getInstance(), "contextSetShapeRenderer", dnotify));
    }

    /**
     * Creates a context object set up to match the current transformation
     * <br>and target surface of the Cairo context.
     * <br>
     * <br>This context can then be
     * <br>used to create a layout using [ctor&#64;Pango.Layout.new].
     * <br>
     * <br>This function is a convenience function that creates a context using
     * <br>the default font map, then updates it to &#64;cr. If you just need to
     * <br>create a layout for use with &#64;cr and do not need to access `PangoContext`
     * <br>directly, you can use [func&#64;create_layout] instead.
     * @param cr a Cairo context
     * @return the newly created `PangoContext`
    */
    public static ch.bailu.gtk.pango.Context createContext(@Nonnull ch.bailu.gtk.cairo.Context cr)  {
        return new ch.bailu.gtk.pango.Context(new PointerContainer(JnaPangocairo.INST().pango_cairo_create_context(asCPointerNotNull(cr))));
    }

    /**
     * Creates a layout object set up to match the current transformation
     * <br>and target surface of the Cairo context.
     * <br>
     * <br>This layout can then be used for text measurement with functions
     * <br>like [method&#64;Pango.Layout.get_size] or drawing with functions like
     * <br>[func&#64;show_layout]. If you change the transformation or target
     * <br>surface for &#64;cr, you need to call [func&#64;update_layout].
     * <br>
     * <br>This function is the most convenient way to use Cairo with Pango,
     * <br>however it is slightly inefficient since it creates a separate
     * <br>`PangoContext` object for each layout. This might matter in an
     * <br>application that was laying out large amounts of text.
     * @param cr a Cairo context
     * @return the newly created `PangoLayout`
    */
    public static ch.bailu.gtk.pango.Layout createLayout(@Nonnull ch.bailu.gtk.cairo.Context cr)  {
        return new ch.bailu.gtk.pango.Layout(new PointerContainer(JnaPangocairo.INST().pango_cairo_create_layout(asCPointerNotNull(cr))));
    }

    /**
     * Add a squiggly line to the current path in the specified cairo context that
     * <br>approximately covers the given rectangle in the style of an underline used
     * <br>to indicate a spelling error.
     * <br>
     * <br>The width of the underline is rounded to an integer number of up/down
     * <br>segments and the resulting rectangle is centered in the original rectangle.
     * @param cr a Cairo context
     * @param x The X coordinate of one corner of the rectangle
     * @param y The Y coordinate of one corner of the rectangle
     * @param width Non-negative width of the rectangle
     * @param height Non-negative height of the rectangle
    */
    public static void errorUnderlinePath(@Nonnull ch.bailu.gtk.cairo.Context cr, double x, double y, double width, double height)  {
        JnaPangocairo.INST().pango_cairo_error_underline_path(asCPointerNotNull(cr), x, y, width, height);
    }

    /**
     * Gets a default `PangoCairoFontMap` to use with Cairo.
     * <br>
     * <br>Note that the type of the returned object will depend on the
     * <br>particular font backend Cairo was compiled to use; you generally
     * <br>should only use the `PangoFontMap` and `PangoCairoFontMap`
     * <br>interfaces on the returned object.
     * <br>
     * <br>The default Cairo fontmap can be changed by using
     * <br>[method&#64;PangoCairo.FontMap.set_default]. This can be used to
     * <br>change the Cairo font backend that the default fontmap uses
     * <br>for example.
     * <br>
     * <br>Note that since Pango 1.32.6, the default fontmap is per-thread.
     * <br>Each thread gets its own default fontmap. In this way, PangoCairo
     * <br>can be used safely from multiple threads.
     * @return the default PangoCairo fontmap  for the current thread. This object is owned by Pango and must  not be freed.
    */
    public static ch.bailu.gtk.pango.FontMap fontMapGetDefault()  {
        return new ch.bailu.gtk.pango.FontMap(new PointerContainer(JnaPangocairo.INST().pango_cairo_font_map_get_default()));
    }

    /**
     * Creates a new `PangoCairoFontMap` object.
     * <br>
     * <br>A fontmap is used to cache information about available fonts,
     * <br>and holds certain global parameters such as the resolution.
     * <br>In most cases, you can use `func&#64;PangoCairo.font_map_get_default]
     * <br>instead.
     * <br>
     * <br>Note that the type of the returned object will depend
     * <br>on the particular font backend Cairo was compiled to use;
     * <br>You generally should only use the `PangoFontMap` and
     * <br>`PangoCairoFontMap` interfaces on the returned object.
     * <br>
     * <br>You can override the type of backend returned by using an
     * <br>environment variable %PANGOCAIRO_BACKEND. Supported types,
     * <br>based on your build, are fc (fontconfig), win32, and coretext.
     * <br>If requested type is not available, NULL is returned. Ie.
     * <br>this is only useful for testing, when at least two backends
     * <br>are compiled in.
     * @return the newly allocated `PangoFontMap`,   which should be freed with g_object_unref().
    */
    public static ch.bailu.gtk.pango.FontMap fontMapNew()  {
        return new ch.bailu.gtk.pango.FontMap(new PointerContainer(JnaPangocairo.INST().pango_cairo_font_map_new()));
    }

    /**
     * Creates a new `PangoCairoFontMap` object of the type suitable
     * <br>to be used with cairo font backend of type &#64;fonttype.
     * <br>
     * <br>In most cases one should simply use [func&#64;PangoCairo.FontMap.new], or
     * <br>in fact in most of those cases, just use [func&#64;PangoCairo.FontMap.get_default].
     * @param fonttype desired &#35;cairo_font_type_t
     * @return the newly allocated   `PangoFontMap` of suitable type which should be freed with   g_object_unref(), or %NULL if the requested cairo font backend   is not supported / compiled in.
    */
    public static ch.bailu.gtk.pango.FontMap fontMapNewForFontType(int fonttype)  {
        return new ch.bailu.gtk.pango.FontMap(new PointerContainer(JnaPangocairo.INST().pango_cairo_font_map_new_for_font_type(fonttype)));
    }

    /**
     * Adds the glyphs in &#64;glyphs to the current path in the specified
     * <br>cairo context.
     * <br>
     * <br>The origin of the glyphs (the left edge of the baseline)
     * <br>will be at the current point of the cairo context.
     * @param cr a Cairo context
     * @param font a `PangoFont` from a `PangoCairoFontMap`
     * @param glyphs a `PangoGlyphString`
    */
    public static void glyphStringPath(@Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull ch.bailu.gtk.pango.Font font, @Nonnull ch.bailu.gtk.pango.GlyphString glyphs)  {
        JnaPangocairo.INST().pango_cairo_glyph_string_path(asCPointerNotNull(cr), asCPointerNotNull(font), asCPointerNotNull(glyphs));
    }

    /**
     * Adds the text in `PangoLayoutLine` to the current path in the
     * <br>specified cairo context.
     * <br>
     * <br>The origin of the glyphs (the left edge of the line) will be
     * <br>at the current point of the cairo context.
     * @param cr a Cairo context
     * @param line a `PangoLayoutLine`
    */
    public static void layoutLinePath(@Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull ch.bailu.gtk.pango.LayoutLine line)  {
        JnaPangocairo.INST().pango_cairo_layout_line_path(asCPointerNotNull(cr), asCPointerNotNull(line));
    }

    /**
     * Adds the text in a `PangoLayout` to the current path in the
     * <br>specified cairo context.
     * <br>
     * <br>The top-left corner of the `PangoLayout` will be at the
     * <br>current point of the cairo context.
     * @param cr a Cairo context
     * @param layout a Pango layout
    */
    public static void layoutPath(@Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull ch.bailu.gtk.pango.Layout layout)  {
        JnaPangocairo.INST().pango_cairo_layout_path(asCPointerNotNull(cr), asCPointerNotNull(layout));
    }

    /**
     * Draw a squiggly line in the specified cairo context that approximately
     * <br>covers the given rectangle in the style of an underline used to indicate a
     * <br>spelling error.
     * <br>
     * <br>The width of the underline is rounded to an integer
     * <br>number of up/down segments and the resulting rectangle is centered in the
     * <br>original rectangle.
     * @param cr a Cairo context
     * @param x The X coordinate of one corner of the rectangle
     * @param y The Y coordinate of one corner of the rectangle
     * @param width Non-negative width of the rectangle
     * @param height Non-negative height of the rectangle
    */
    public static void showErrorUnderline(@Nonnull ch.bailu.gtk.cairo.Context cr, double x, double y, double width, double height)  {
        JnaPangocairo.INST().pango_cairo_show_error_underline(asCPointerNotNull(cr), x, y, width, height);
    }

    /**
     * Draws the glyphs in &#64;glyph_item in the specified cairo context,
     * <br>
     * <br>embedding the text associated with the glyphs in the output if the
     * <br>output format supports it (PDF for example), otherwise it acts
     * <br>similar to [func&#64;show_glyph_string].
     * <br>
     * <br>The origin of the glyphs (the left edge of the baseline) will
     * <br>be drawn at the current point of the cairo context.
     * <br>
     * <br>Note that &#64;text is the start of the text for layout, which is then
     * <br>indexed by `glyph_item-&gt;item-&gt;offset`.
     * @param cr a Cairo context
     * @param text the UTF-8 text that &#64;glyph_item refers to
     * @param glyph_item a `PangoGlyphItem`
    */
    public static void showGlyphItem(@Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull ch.bailu.gtk.type.Str text, @Nonnull ch.bailu.gtk.pango.GlyphItem glyph_item)  {
        JnaPangocairo.INST().pango_cairo_show_glyph_item(asCPointerNotNull(cr), asCPointerNotNull(text), asCPointerNotNull(glyph_item));
    }

    /**
     * Draws the glyphs in &#64;glyphs in the specified cairo context.
     * <br>
     * <br>The origin of the glyphs (the left edge of the baseline) will
     * <br>be drawn at the current point of the cairo context.
     * @param cr a Cairo context
     * @param font a `PangoFont` from a `PangoCairoFontMap`
     * @param glyphs a `PangoGlyphString`
    */
    public static void showGlyphString(@Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull ch.bailu.gtk.pango.Font font, @Nonnull ch.bailu.gtk.pango.GlyphString glyphs)  {
        JnaPangocairo.INST().pango_cairo_show_glyph_string(asCPointerNotNull(cr), asCPointerNotNull(font), asCPointerNotNull(glyphs));
    }

    /**
     * Draws a `PangoLayout` in the specified cairo context.
     * <br>
     * <br>The top-left corner of the `PangoLayout` will be drawn
     * <br>at the current point of the cairo context.
     * @param cr a Cairo context
     * @param layout a Pango layout
    */
    public static void showLayout(@Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull ch.bailu.gtk.pango.Layout layout)  {
        JnaPangocairo.INST().pango_cairo_show_layout(asCPointerNotNull(cr), asCPointerNotNull(layout));
    }

    /**
     * Draws a `PangoLayoutLine` in the specified cairo context.
     * <br>
     * <br>The origin of the glyphs (the left edge of the line) will
     * <br>be drawn at the current point of the cairo context.
     * @param cr a Cairo context
     * @param line a `PangoLayoutLine`
    */
    public static void showLayoutLine(@Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull ch.bailu.gtk.pango.LayoutLine line)  {
        JnaPangocairo.INST().pango_cairo_show_layout_line(asCPointerNotNull(cr), asCPointerNotNull(line));
    }

    /**
     * Updates a `PangoContext` previously created for use with Cairo to
     * <br>match the current transformation and target surface of a Cairo
     * <br>context.
     * <br>
     * <br>If any layouts have been created for the context, it's necessary
     * <br>to call [method&#64;Pango.Layout.context_changed] on those layouts.
     * @param cr a Cairo context
     * @param context a `PangoContext`, from a pangocairo font map
    */
    public static void updateContext(@Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull ch.bailu.gtk.pango.Context context)  {
        JnaPangocairo.INST().pango_cairo_update_context(asCPointerNotNull(cr), asCPointerNotNull(context));
    }

    /**
     * Updates the private `PangoContext` of a `PangoLayout` created with
     * <br>[func&#64;create_layout] to match the current transformation and target
     * <br>surface of a Cairo context.
     * @param cr a Cairo context
     * @param layout a `PangoLayout`, from [func&#64;create_layout]
    */
    public static void updateLayout(@Nonnull ch.bailu.gtk.cairo.Context cr, @Nonnull ch.bailu.gtk.pango.Layout layout)  {
        JnaPangocairo.INST().pango_cairo_update_layout(asCPointerNotNull(cr), asCPointerNotNull(layout));
    }

}

/*
package-type

[MethodModel:cb-returns-callback:java-type-not-supported:contextGetShapeRenderer:[ParameterModel:Supported:[MethodModel:Supported:ShapeRendererFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Context:{c:cairo_t*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AttrShape:{c:PangoAttrShape*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]]
        [ParameterModel:Supported:{Gg:Context:{c:PangoContext*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]
*/
