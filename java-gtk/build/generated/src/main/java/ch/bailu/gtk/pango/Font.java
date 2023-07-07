/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoFont` is used to represent a font in a
 * <br>rendering-system-independent manner.
 * <p><a href="https://docs.gtk.org/Pango/class.Font.html">https://docs.gtk.org/Pango/class.Font.html</a></p>
*/
public class Font extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Font.class.getCanonicalName());
    }

    public Font(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a description of the font, with font size set in points.
     * <br>
     * <br>Use [method&#64;Pango.Font.describe_with_absolute_size] if you want
     * <br>the font size in device units.
     * @return a newly-allocated `PangoFontDescription` object.
    */
    public FontDescription describe()  {
        return new FontDescription(new PointerContainer(JnaFont.INST().pango_font_describe(asCPointer())));
    }

    /**
     * Returns a description of the font, with absolute font size set
     * <br>in device units.
     * <br>
     * <br>Use [method&#64;Pango.Font.describe] if you want the font size in points.
     * @return a newly-allocated `PangoFontDescription` object.
    */
    public FontDescription describeWithAbsoluteSize()  {
        return new FontDescription(new PointerContainer(JnaFont.INST().pango_font_describe_with_absolute_size(asCPointer())));
    }

    /**
     * Computes the coverage map for a given font and language tag.
     * @param language the language tag
     * @return a newly-allocated `PangoCoverage`   object.
    */
    public Coverage getCoverage(@Nonnull Language language)  {
        return new Coverage(new PointerContainer(JnaFont.INST().pango_font_get_coverage(asCPointer(), asCPointerNotNull(language))));
    }

    /**
     * Gets the `PangoFontFace` to which &#64;font belongs.
     * @return the `PangoFontFace`
    */
    public FontFace getFace()  {
        return new FontFace(new PointerContainer(JnaFont.INST().pango_font_get_face(asCPointer())));
    }

    /**
     * Gets the font map for which the font was created.
     * <br>
     * <br>Note that the font maintains a *weak* reference to
     * <br>the font map, so if all references to font map are
     * <br>dropped, the font map will be finalized even if there
     * <br>are fonts created with the font map that are still alive.
     * <br>In that case this function will return %NULL.
     * <br>
     * <br>It is the responsibility of the user to ensure that the
     * <br>font map is kept alive. In most uses this is not an issue
     * <br>as a `PangoContext` holds a reference to the font map.
     * @return the `PangoFontMap`   for the font
    */
    public FontMap getFontMap()  {
        return new FontMap(new PointerContainer(JnaFont.INST().pango_font_get_font_map(asCPointer())));
    }

    /**
     * Gets overall metric information for a font.
     * <br>
     * <br>Since the metrics may be substantially different for different scripts,
     * <br>a language tag can be provided to indicate that the metrics should be
     * <br>retrieved that correspond to the script(s) used by that language.
     * <br>
     * <br>If &#64;font is %NULL, this function gracefully sets some sane values in the
     * <br>output variables and returns.
     * @param language language tag used to determine which script   to get the metrics for, or %NULL to indicate to get the metrics for   the entire font.
     * @return a `PangoFontMetrics` object. The caller must call   [method&#64;Pango.FontMetrics.unref] when finished using the object.
    */
    public FontMetrics getMetrics(@Nullable Language language)  {
        return new FontMetrics(new PointerContainer(JnaFont.INST().pango_font_get_metrics(asCPointer(), asCPointer(language))));
    }

    /**
     * Returns whether the font provides a glyph for this character.
     * @param wc a Unicode character
     * @return `TRUE` if &#64;font can render &#64;wc
    */
    public boolean hasChar(byte wc)  {
        return JnaFont.INST().pango_font_has_char(asCPointer(), wc);
    }

    /**
     * Serializes the &#64;font in a way that can be uniquely identified.
     * <br>
     * <br>There are no guarantees about the format of the output across different
     * <br>versions of Pango.
     * <br>
     * <br>The intended use of this function is testing, benchmarking and debugging.
     * <br>The format is not meant as a permanent storage format.
     * <br>
     * <br>To recreate a font from its serialized form, use [func&#64;Pango.Font.deserialize].
     * @return a `GBytes` containing the serialized form of &#64;font
    */
    public ch.bailu.gtk.glib.Bytes serialize()  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaFont.INST().pango_font_serialize(asCPointer())));
    }

    /**
     * Loads data previously created via [method&#64;Pango.Font.serialize].
     * <br>
     * <br>For a discussion of the supported format, see that function.
     * <br>
     * <br>Note: to verify that the returned font is identical to
     * <br>the one that was serialized, you can compare &#64;bytes to the
     * <br>result of serializing the font again.
     * @param context a `PangoContext`
     * @param bytes the bytes containing the data
     * @return a new `PangoFont`
    */
    public static Font deserialize(@Nonnull Context context, @Nonnull ch.bailu.gtk.glib.Bytes bytes) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Font(new PointerContainer(JnaFont.INST().pango_font_deserialize(asCPointerNotNull(context), asCPointerNotNull(bytes), 0L)));
    }

    public static long getTypeID() { 
        return JnaFont.INST().pango_font_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getFeatures:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:hb_feature_t*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:getGlyphExtents:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoGlyph}}:{j:}]
        [ParameterModel:Supported:{Gg:Rectangle:{c:PangoRectangle*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Rectangle:{c:PangoRectangle*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getHbFont:[ParameterModel:java-type-not-supported:{G_::{c:hb_font_t*}}:{j:}]]

[MethodModel:cb-return-value-not-supported:getLanguages:[ParameterModel:java-type-not-supported:{G_::{c:PangoLanguage**}}:{j:}]]

[MethodModel:java-type-not-supported:descriptionsFree:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoFontDescription**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
*/
