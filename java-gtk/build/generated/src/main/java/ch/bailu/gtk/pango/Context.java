/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoContext` stores global information used to control the
 * <br>itemization process.
 * <br>
 * <br>The information stored by `PangoContext` includes the fontmap used
 * <br>to look up fonts, and default values such as the default language,
 * <br>default gravity, or default font.
 * <br>
 * <br>To obtain a `PangoContext`, use [method&#64;Pango.FontMap.create_context].
 * <p><a href="https://docs.gtk.org/Pango/class.Context.html">https://docs.gtk.org/Pango/class.Context.html</a></p>
*/
public class Context extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Context.class.getCanonicalName());
    }

    public Context(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `PangoContext` initialized to default values.
     * <br>
     * <br>This function is not particularly useful as it should always
     * <br>be followed by a [method&#64;Pango.Context.set_font_map] call, and the
     * <br>function [method&#64;Pango.FontMap.create_context] does these two steps
     * <br>together and hence users are recommended to use that.
     * <br>
     * <br>If you are using Pango as part of a higher-level system,
     * <br>that system may have it's own way of create a `PangoContext`.
     * <br>For instance, the GTK toolkit has, among others,
     * <br>`gtk_widget_get_pango_context()`. Use those instead.
    */
    public Context() {
        super(cast(JnaContext.INST().pango_context_new()));
    }

    /**
     * Forces a change in the context, which will cause any `PangoLayout`
     * <br>using this context to re-layout.
     * <br>
     * <br>This function is only useful when implementing a new backend
     * <br>for Pango, something applications won't do. Backends should
     * <br>call this function if they have attached extra data to the context
     * <br>and such data is changed.
    */
    public void changed()  {
        JnaContext.INST().pango_context_changed(asCPointer());
    }

    /**
     * Retrieves the base direction for the context.
     * <br>
     * <br>See [method&#64;Pango.Context.set_base_dir].
     * @return the base direction for the context.
    */
    public int getBaseDir()  {
        return JnaContext.INST().pango_context_get_base_dir(asCPointer());
    }

    /**
     * Retrieves the base gravity for the context.
     * <br>
     * <br>See [method&#64;Pango.Context.set_base_gravity].
     * @return the base gravity for the context.
    */
    public int getBaseGravity()  {
        return JnaContext.INST().pango_context_get_base_gravity(asCPointer());
    }

    /**
     * Retrieve the default font description for the context.
     * @return a pointer to the context's default font   description. This value must not be modified or freed.
    */
    public FontDescription getFontDescription()  {
        return new FontDescription(new PointerContainer(JnaContext.INST().pango_context_get_font_description(asCPointer())));
    }

    /**
     * Gets the `PangoFontMap` used to look up fonts for this context.
     * @return the font map for the.   `PangoContext` This value is owned by Pango and should not be   unreferenced.
    */
    public FontMap getFontMap()  {
        return new FontMap(new PointerContainer(JnaContext.INST().pango_context_get_font_map(asCPointer())));
    }

    /**
     * Retrieves the gravity for the context.
     * <br>
     * <br>This is similar to [method&#64;Pango.Context.get_base_gravity],
     * <br>except for when the base gravity is %PANGO_GRAVITY_AUTO for
     * <br>which [func&#64;Pango.Gravity.get_for_matrix] is used to return the
     * <br>gravity from the current context matrix.
     * @return the resolved gravity for the context.
    */
    public int getGravity()  {
        return JnaContext.INST().pango_context_get_gravity(asCPointer());
    }

    /**
     * Retrieves the gravity hint for the context.
     * <br>
     * <br>See [method&#64;Pango.Context.set_gravity_hint] for details.
     * @return the gravity hint for the context.
    */
    public int getGravityHint()  {
        return JnaContext.INST().pango_context_get_gravity_hint(asCPointer());
    }

    /**
     * Retrieves the global language tag for the context.
     * @return the global language tag.
    */
    public Language getLanguage()  {
        return new Language(new PointerContainer(JnaContext.INST().pango_context_get_language(asCPointer())));
    }

    /**
     * Gets the transformation matrix that will be applied when
     * <br>rendering with this context.
     * <br>
     * <br>See [method&#64;Pango.Context.set_matrix].
     * @return the matrix, or %NULL if no   matrix has been set (which is the same as the identity matrix).   The returned matrix is owned by Pango and must not be modified   or freed.
    */
    public Matrix getMatrix()  {
        return new Matrix(new PointerContainer(JnaContext.INST().pango_context_get_matrix(asCPointer())));
    }

    /**
     * Get overall metric information for a particular font description.
     * <br>
     * <br>Since the metrics may be substantially different for different scripts,
     * <br>a language tag can be provided to indicate that the metrics should be
     * <br>retrieved that correspond to the script(s) used by that language.
     * <br>
     * <br>The `PangoFontDescription` is interpreted in the same way as by [func&#64;itemize],
     * <br>and the family name may be a comma separated list of names. If characters
     * <br>from multiple of these families would be used to render the string, then
     * <br>the returned fonts would be a composite of the metrics for the fonts loaded
     * <br>for the individual families.
     * @param desc a `PangoFontDescription` structure. %NULL means that the   font description from the context will be used.
     * @param language language tag used to determine which script to get   the metrics for. %NULL means that the language tag from the context   will be used. If no language tag is set on the context, metrics   for the default language (as determined by [func&#64;Pango.Language.get_default]   will be returned.
     * @return a `PangoFontMetrics` object. The caller must call   [method&#64;Pango.FontMetrics.unref] when finished using the object.
    */
    public FontMetrics getMetrics(@Nullable FontDescription desc, @Nullable Language language)  {
        return new FontMetrics(new PointerContainer(JnaContext.INST().pango_context_get_metrics(asCPointer(), asCPointer(desc), asCPointer(language))));
    }

    /**
     * Returns whether font rendering with this context should
     * <br>round glyph positions and widths.
     * @return 
    */
    public boolean getRoundGlyphPositions()  {
        return JnaContext.INST().pango_context_get_round_glyph_positions(asCPointer());
    }

    /**
     * Returns the current serial number of &#64;context.
     * <br>
     * <br>The serial number is initialized to an small number larger than zero
     * <br>when a new context is created and is increased whenever the context
     * <br>is changed using any of the setter functions, or the `PangoFontMap` it
     * <br>uses to find fonts has changed. The serial may wrap, but will never
     * <br>have the value 0. Since it can wrap, never compare it with &quot;less than&quot;,
     * <br>always use &quot;not equals&quot;.
     * <br>
     * <br>This can be used to automatically detect changes to a `PangoContext`,
     * <br>and is only useful when implementing objects that need update when their
     * <br>`PangoContext` changes, like `PangoLayout`.
     * @return The current serial number of &#64;context.
    */
    public int getSerial()  {
        return JnaContext.INST().pango_context_get_serial(asCPointer());
    }

    /**
     * Loads the font in one of the fontmaps in the context
     * <br>that is the closest match for &#64;desc.
     * @param desc a `PangoFontDescription` describing the font to load
     * @return the newly allocated `PangoFont`   that was loaded, or %NULL if no font matched.
    */
    public Font loadFont(@Nonnull FontDescription desc)  {
        return new Font(new PointerContainer(JnaContext.INST().pango_context_load_font(asCPointer(), asCPointerNotNull(desc))));
    }

    /**
     * Load a set of fonts in the context that can be used to render
     * <br>a font matching &#64;desc.
     * @param desc a `PangoFontDescription` describing the fonts to load
     * @param language a `PangoLanguage` the fonts will be used for
     * @return the newly allocated   `PangoFontset` loaded, or %NULL if no font matched.
    */
    public Fontset loadFontset(@Nonnull FontDescription desc, @Nonnull Language language)  {
        return new Fontset(new PointerContainer(JnaContext.INST().pango_context_load_fontset(asCPointer(), asCPointerNotNull(desc), asCPointerNotNull(language))));
    }

    /**
     * Sets the base direction for the context.
     * <br>
     * <br>The base direction is used in applying the Unicode bidirectional
     * <br>algorithm; if the &#64;direction is %PANGO_DIRECTION_LTR or
     * <br>%PANGO_DIRECTION_RTL, then the value will be used as the paragraph
     * <br>direction in the Unicode bidirectional algorithm. A value of
     * <br>%PANGO_DIRECTION_WEAK_LTR or %PANGO_DIRECTION_WEAK_RTL is used only
     * <br>for paragraphs that do not contain any strong characters themselves.
     * @param direction the new base direction
    */
    public void setBaseDir(int direction)  {
        JnaContext.INST().pango_context_set_base_dir(asCPointer(), direction);
    }

    /**
     * Sets the base gravity for the context.
     * <br>
     * <br>The base gravity is used in laying vertical text out.
     * @param gravity the new base gravity
    */
    public void setBaseGravity(int gravity)  {
        JnaContext.INST().pango_context_set_base_gravity(asCPointer(), gravity);
    }

    /**
     * Set the default font description for the context
     * @param desc the new pango font description
    */
    public void setFontDescription(@Nullable FontDescription desc)  {
        JnaContext.INST().pango_context_set_font_description(asCPointer(), asCPointer(desc));
    }

    /**
     * Sets the font map to be searched when fonts are looked-up
     * <br>in this context.
     * <br>
     * <br>This is only for internal use by Pango backends, a `PangoContext`
     * <br>obtained via one of the recommended methods should already have a
     * <br>suitable font map.
     * @param font_map the `PangoFontMap` to set.
    */
    public void setFontMap(@Nullable FontMap font_map)  {
        JnaContext.INST().pango_context_set_font_map(asCPointer(), asCPointer(font_map));
    }

    /**
     * Sets the gravity hint for the context.
     * <br>
     * <br>The gravity hint is used in laying vertical text out, and
     * <br>is only relevant if gravity of the context as returned by
     * <br>[method&#64;Pango.Context.get_gravity] is set to %PANGO_GRAVITY_EAST
     * <br>or %PANGO_GRAVITY_WEST.
     * @param hint the new gravity hint
    */
    public void setGravityHint(int hint)  {
        JnaContext.INST().pango_context_set_gravity_hint(asCPointer(), hint);
    }

    /**
     * Sets the global language tag for the context.
     * <br>
     * <br>The default language for the locale of the running process
     * <br>can be found using [func&#64;Pango.Language.get_default].
     * @param language the new language tag.
    */
    public void setLanguage(@Nullable Language language)  {
        JnaContext.INST().pango_context_set_language(asCPointer(), asCPointer(language));
    }

    /**
     * Sets the transformation matrix that will be applied when rendering
     * <br>with this context.
     * <br>
     * <br>Note that reported metrics are in the user space coordinates before
     * <br>the application of the matrix, not device-space coordinates after the
     * <br>application of the matrix. So, they don't scale with the matrix, though
     * <br>they may change slightly for different matrices, depending on how the
     * <br>text is fit to the pixel grid.
     * @param matrix a `PangoMatrix`, or %NULL to unset any existing matrix. (No matrix set is the same as setting the identity matrix.)
    */
    public void setMatrix(@Nullable Matrix matrix)  {
        JnaContext.INST().pango_context_set_matrix(asCPointer(), asCPointer(matrix));
    }

    /**
     * Sets whether font rendering with this context should
     * <br>round glyph positions and widths to integral positions,
     * <br>in device units.
     * <br>
     * <br>This is useful when the renderer can't handle subpixel
     * <br>positioning of glyphs.
     * <br>
     * <br>The default value is to round glyph positions, to remain
     * <br>compatible with previous Pango behavior.
     * @param round_positions whether to round glyph positions
    */
    public void setRoundGlyphPositions(boolean round_positions)  {
        JnaContext.INST().pango_context_set_round_glyph_positions(asCPointer(), round_positions);
    }

    public static long getTypeID() { 
        return JnaContext.INST().pango_context_get_type(); 
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

[MethodModel:java-type-not-supported:listFamilies:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoFontFamily***}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
*/
