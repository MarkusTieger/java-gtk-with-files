/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public class Pango extends ch.bailu.gtk.type.Package {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Pango.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAttrDataCopyFunc {
        /**
         * Type of a function that can duplicate user data for an attribute.
         * @param user_data user data to copy
         * @return new copy of &#64;user_data.
        */
        ch.bailu.gtk.type.Pointer onAttrDataCopyFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaPango.OnAttrDataCopyFunc toOnAttrDataCopyFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnAttrDataCopyFunc in) {
        JnaPango.OnAttrDataCopyFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_user_data) -> in.onAttrDataCopyFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
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
    
    private static JnaPango.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaPango.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    /**
     * Create a new allow-breaks attribute.
     * <br>
     * <br>If breaks are disabled, the range will be kept in a
     * <br>single run, as far as possible.
     * @param allow_breaks %TRUE if we line breaks are allowed
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrAllowBreaksNew(boolean allow_breaks)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_allow_breaks_new(allow_breaks)));
    }

    /**
     * Create a new background alpha attribute.
     * @param alpha the alpha value, between 1 and 65536
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrBackgroundAlphaNew(int alpha)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_background_alpha_new(alpha)));
    }

    /**
     * Create a new background color attribute.
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrBackgroundNew(int red, int green, int blue)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_background_new(red, green, blue)));
    }

    /**
     * Create a new baseline displacement attribute.
     * <br>
     * <br>The effect of this attribute is to shift the baseline of a run,
     * <br>relative to the run of preceding run.
     * <br>
     * <br>&lt;picture&gt;
     * <br>  &lt;source srcset=&quot;baseline-shift-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
     * <br>  &lt;img alt=&quot;Baseline Shift&quot; src=&quot;baseline-shift-light.png&quot;&gt;
     * <br>&lt;/picture&gt;
     * @param shift either a `PangoBaselineShift` enumeration value or an absolute value (&gt; 1024)   in Pango units, relative to the baseline of the previous run.   Positive values displace the text upwards.
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrBaselineShiftNew(int shift)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_baseline_shift_new(shift)));
    }

    /**
     * Create a new font fallback attribute.
     * <br>
     * <br>If fallback is disabled, characters will only be
     * <br>used from the closest matching font on the system.
     * <br>No fallback will be done to other fonts on the system
     * <br>that might contain the characters in the text.
     * @param enable_fallback %TRUE if we should fall back on other fonts   for characters the active font is missing
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrFallbackNew(boolean enable_fallback)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_fallback_new(enable_fallback)));
    }

    /**
     * Create a new font family attribute.
     * @param family the family or comma-separated list of families
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrFamilyNew(@Nonnull ch.bailu.gtk.type.Str family)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_family_new(asCPointerNotNull(family))));
    }

    /**
     * Create a new font description attribute.
     * <br>
     * <br>This attribute allows setting family, style, weight, variant,
     * <br>stretch, and size simultaneously.
     * @param desc the font description
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrFontDescNew(@Nonnull FontDescription desc)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_font_desc_new(asCPointerNotNull(desc))));
    }

    /**
     * Create a new font features tag attribute.
     * <br>
     * <br>You can use this attribute to select OpenType font features like small-caps,
     * <br>alternative glyphs, ligatures, etc. for fonts that support them.
     * @param features a string with OpenType font features, with the syntax of the [CSS font-feature-settings property](https://www.w3.org/TR/css-fonts-4/&#35;font-rend-desc)
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrFontFeaturesNew(@Nonnull ch.bailu.gtk.type.Str features)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_font_features_new(asCPointerNotNull(features))));
    }

    /**
     * Create a new font scale attribute.
     * <br>
     * <br>The effect of this attribute is to change the font size of a run,
     * <br>relative to the size of preceding run.
     * @param scale a `PangoFontScale` value, which indicates font size change relative   to the size of the previous run.
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrFontScaleNew(int scale)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_font_scale_new(scale)));
    }

    /**
     * Create a new foreground alpha attribute.
     * @param alpha the alpha value, between 1 and 65536
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrForegroundAlphaNew(int alpha)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_foreground_alpha_new(alpha)));
    }

    /**
     * Create a new foreground color attribute.
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrForegroundNew(int red, int green, int blue)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_foreground_new(red, green, blue)));
    }

    /**
     * Create a new gravity hint attribute.
     * @param hint the gravity hint value
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrGravityHintNew(int hint)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_gravity_hint_new(hint)));
    }

    /**
     * Create a new gravity attribute.
     * @param gravity the gravity value; should not be %PANGO_GRAVITY_AUTO
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrGravityNew(int gravity)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_gravity_new(gravity)));
    }

    /**
     * Create a new insert-hyphens attribute.
     * <br>
     * <br>Pango will insert hyphens when breaking lines in
     * <br>the middle of a word. This attribute can be used
     * <br>to suppress the hyphen.
     * @param insert_hyphens %TRUE if hyphens should be inserted
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrInsertHyphensNew(boolean insert_hyphens)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_insert_hyphens_new(insert_hyphens)));
    }

    /**
     * Create a new language tag attribute.
     * @param language language tag
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrLanguageNew(@Nonnull Language language)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_language_new(asCPointerNotNull(language))));
    }

    /**
     * Create a new letter-spacing attribute.
     * @param letter_spacing amount of extra space to add between   graphemes of the text, in Pango units
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrLetterSpacingNew(int letter_spacing)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_letter_spacing_new(letter_spacing)));
    }

    /**
     * Modify the height of logical line extents by a factor.
     * <br>
     * <br>This affects the values returned by
     * <br>[method&#64;Pango.LayoutLine.get_extents],
     * <br>[method&#64;Pango.LayoutLine.get_pixel_extents] and
     * <br>[method&#64;Pango.LayoutIter.get_line_extents].
     * @param factor the scaling factor to apply to the logical height
     * @return 
    */
    public static Attribute attrLineHeightNew(double factor)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_line_height_new(factor)));
    }

    /**
     * Override the height of logical line extents to be &#64;height.
     * <br>
     * <br>This affects the values returned by
     * <br>[method&#64;Pango.LayoutLine.get_extents],
     * <br>[method&#64;Pango.LayoutLine.get_pixel_extents] and
     * <br>[method&#64;Pango.LayoutIter.get_line_extents].
     * @param height the line height, in %PANGO_SCALE-ths of a point
     * @return 
    */
    public static Attribute attrLineHeightNewAbsolute(int height)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_line_height_new_absolute(height)));
    }

    /**
     * Deserializes a `PangoAttrList` from a string.
     * <br>
     * <br>This is the counterpart to [method&#64;Pango.AttrList.to_string].
     * <br>See that functions for details about the format.
     * @param text a string
     * @return a new `PangoAttrList`
    */
    public static AttrList attrListFromString(@Nonnull ch.bailu.gtk.type.Str text)  {
        return new AttrList(new PointerContainer(JnaPango.INST().pango_attr_list_from_string(asCPointerNotNull(text))));
    }

    /**
     * Create a new overline color attribute.
     * <br>
     * <br>This attribute modifies the color of overlines.
     * <br>If not set, overlines will use the foreground color.
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrOverlineColorNew(int red, int green, int blue)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_overline_color_new(red, green, blue)));
    }

    /**
     * Create a new overline-style attribute.
     * @param overline the overline style
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrOverlineNew(int overline)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_overline_new(overline)));
    }

    /**
     * Create a new baseline displacement attribute.
     * @param rise the amount that the text should be displaced vertically,   in Pango units. Positive values displace the text upwards.
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrRiseNew(int rise)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_rise_new(rise)));
    }

    /**
     * Create a new font size scale attribute.
     * <br>
     * <br>The base font for the affected text will have
     * <br>its size multiplied by &#64;scale_factor.
     * @param scale_factor factor to scale the font
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrScaleNew(double scale_factor)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_scale_new(scale_factor)));
    }

    /**
     * Marks the range of the attribute as a single sentence.
     * <br>
     * <br>Note that this may require adjustments to word and
     * <br>sentence classification around the range.
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrSentenceNew()  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_sentence_new()));
    }

    /**
     * Create a new shape attribute.
     * <br>
     * <br>A shape is used to impose a particular ink and logical
     * <br>rectangle on the result of shaping a particular glyph.
     * <br>This might be used, for instance, for embedding a picture
     * <br>or a widget inside a `PangoLayout`.
     * @param ink_rect ink rectangle to assign to each character
     * @param logical_rect logical rectangle to assign to each character
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrShapeNew(@Nonnull Rectangle ink_rect, @Nonnull Rectangle logical_rect)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_shape_new(asCPointerNotNull(ink_rect), asCPointerNotNull(logical_rect))));
    }

    /**
     * Creates a new shape attribute.
     * <br>
     * <br>Like [func&#64;Pango.AttrShape.new], but a user data pointer
     * <br>is also provided; this pointer can be accessed when later
     * <br>rendering the glyph.
     * @param ink_rect ink rectangle to assign to each character
     * @param logical_rect logical rectangle to assign to each character
     * @param data user data pointer
     * @param copy_func function to copy &#64;data when the   attribute is copied. If %NULL, &#64;data is simply copied   as a pointer
     * @param destroy_func function to free &#64;data when the   attribute is freed
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrShapeNewWithData(@Nonnull Rectangle ink_rect, @Nonnull Rectangle logical_rect, @Nullable ch.bailu.gtk.type.Pointer data, OnAttrDataCopyFunc copy_func, OnDestroyNotify destroy_func)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_shape_new_with_data(asCPointerNotNull(ink_rect), asCPointerNotNull(logical_rect), asCPointer(data), toOnAttrDataCopyFunc(getClassHandler().getInstance(), "attrShapeNewWithData", copy_func), toOnDestroyNotify(getClassHandler().getInstance(), "attrShapeNewWithData", destroy_func))));
    }

    /**
     * Create a new attribute that influences how invisible
     * <br>characters are rendered.
     * @param flags `PangoShowFlags` to apply
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrShowNew(int flags)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_show_new(flags)));
    }

    /**
     * Create a new font-size attribute in fractional points.
     * @param size the font size, in %PANGO_SCALE-ths of a point
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrSizeNew(int size)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_size_new(size)));
    }

    /**
     * Create a new font-size attribute in device units.
     * @param size the font size, in %PANGO_SCALE-ths of a device unit
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrSizeNewAbsolute(int size)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_size_new_absolute(size)));
    }

    /**
     * Create a new font stretch attribute.
     * @param stretch the stretch
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrStretchNew(int stretch)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_stretch_new(stretch)));
    }

    /**
     * Create a new strikethrough color attribute.
     * <br>
     * <br>This attribute modifies the color of strikethrough lines.
     * <br>If not set, strikethrough lines will use the foreground color.
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrStrikethroughColorNew(int red, int green, int blue)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_strikethrough_color_new(red, green, blue)));
    }

    /**
     * Create a new strike-through attribute.
     * @param strikethrough %TRUE if the text should be struck-through
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrStrikethroughNew(boolean strikethrough)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_strikethrough_new(strikethrough)));
    }

    /**
     * Create a new font slant style attribute.
     * @param style the slant style
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrStyleNew(int style)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_style_new(style)));
    }

    /**
     * Create a new attribute that influences how characters
     * <br>are transformed during shaping.
     * @param transform `PangoTextTransform` to apply
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrTextTransformNew(int transform)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_text_transform_new(transform)));
    }

    /**
     * Fetches the attribute type name.
     * <br>
     * <br>The attribute type name is the string passed in
     * <br>when registering the type using
     * <br>[func&#64;Pango.AttrType.register].
     * <br>
     * <br>The returned value is an interned string (see
     * <br>g_intern_string() for what that means) that should
     * <br>not be modified or freed.
     * @param type an attribute type ID to fetch the name for
     * @return the type ID name (which   may be %NULL), or %NULL if &#64;type is a built-in Pango   attribute type or invalid.
    */
    public static ch.bailu.gtk.type.Str attrTypeGetName(int type)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPango.INST().pango_attr_type_get_name(type)));
    }

    /**
     * Allocate a new attribute type ID.
     * <br>
     * <br>The attribute type name can be accessed later
     * <br>by using [func&#64;Pango.AttrType.get_name].
     * @param name an identifier for the type
     * @return the new type ID.
    */
    public static int attrTypeRegister(@Nonnull ch.bailu.gtk.type.Str name)  {
        return JnaPango.INST().pango_attr_type_register(asCPointerNotNull(name));
    }

    /**
     * Create a new underline color attribute.
     * <br>
     * <br>This attribute modifies the color of underlines.
     * <br>If not set, underlines will use the foreground color.
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrUnderlineColorNew(int red, int green, int blue)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_underline_color_new(red, green, blue)));
    }

    /**
     * Create a new underline-style attribute.
     * @param underline the underline style
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrUnderlineNew(int underline)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_underline_new(underline)));
    }

    /**
     * Create a new font variant attribute (normal or small caps).
     * @param variant the variant
     * @return the newly allocated `PangoAttribute`,   which should be freed with [method&#64;Pango.Attribute.destroy].
    */
    public static Attribute attrVariantNew(int variant)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_variant_new(variant)));
    }

    /**
     * Create a new font weight attribute.
     * @param weight the weight
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrWeightNew(int weight)  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_weight_new(weight)));
    }

    /**
     * Marks the range of the attribute as a single word.
     * <br>
     * <br>Note that this may require adjustments to word and
     * <br>sentence classification around the range.
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute attrWordNew()  {
        return new Attribute(new PointerContainer(JnaPango.INST().pango_attr_word_new()));
    }

    /**
     * Determines the bidirectional type of a character.
     * <br>
     * <br>The bidirectional type is specified in the Unicode Character Database.
     * <br>
     * <br>A simplified version of this function is available as [func&#64;unichar_direction].
     * @param ch a Unicode character
     * @return the bidirectional character type, as used in the Unicode bidirectional algorithm.
    */
    public static int bidiTypeForUnichar(byte ch)  {
        return JnaPango.INST().pango_bidi_type_for_unichar(ch);
    }

    /**
     * This is the default break algorithm.
     * <br>
     * <br>It applies rules from the [Unicode Line Breaking Algorithm](http://www.unicode.org/unicode/reports/tr14/)
     * <br>without language-specific tailoring, therefore the &#64;analyis argument is unused
     * <br>and can be %NULL.
     * <br>
     * <br>See [func&#64;Pango.tailor_break] for language-specific breaks.
     * <br>
     * <br>See [func&#64;Pango.attr_break] for attribute-based customization.
     * @param text text to break. Must be valid UTF-8
     * @param length length of text in bytes (may be -1 if &#64;text is nul-terminated)
     * @param analysis a `PangoAnalysis` structure for the &#64;text
     * @param attrs logical attributes to fill in
     * @param attrs_len size of the array passed as &#64;attrs
    */
    public static void defaultBreak(@Nonnull ch.bailu.gtk.type.Str text, int length, @Nullable Analysis analysis, @Nonnull LogAttr attrs, int attrs_len)  {
        JnaPango.INST().pango_default_break(asCPointerNotNull(text), length, asCPointer(analysis), asCPointerNotNull(attrs), attrs_len);
    }

    /**
     * Converts extents from Pango units to device units.
     * <br>
     * <br>The conversion is done by dividing by the %PANGO_SCALE factor and
     * <br>performing rounding.
     * <br>
     * <br>The &#64;inclusive rectangle is converted by flooring the x/y coordinates
     * <br>and extending width/height, such that the final rectangle completely
     * <br>includes the original rectangle.
     * <br>
     * <br>The &#64;nearest rectangle is converted by rounding the coordinates
     * <br>of the rectangle to the nearest device unit (pixel).
     * <br>
     * <br>The rule to which argument to use is: if you want the resulting device-space
     * <br>rectangle to completely contain the original rectangle, pass it in as
     * <br>&#64;inclusive. If you want two touching-but-not-overlapping rectangles stay
     * <br>touching-but-not-overlapping after rounding to device units, pass them in
     * <br>as &#64;nearest.
     * @param inclusive rectangle to round to pixels inclusively
     * @param nearest rectangle to round to nearest pixels
    */
    public static void extentsToPixels(@Nullable Rectangle inclusive, @Nullable Rectangle nearest)  {
        JnaPango.INST().pango_extents_to_pixels(asCPointer(inclusive), asCPointer(nearest));
    }

    /**
     * Searches a string the first character that has a strong
     * <br>direction, according to the Unicode bidirectional algorithm.
     * @param text the text to process. Must be valid UTF-8
     * @param length length of &#64;text in bytes (may be -1 if &#64;text is nul-terminated)
     * @return The direction corresponding to the first strong character.   If no such character is found, then %PANGO_DIRECTION_NEUTRAL is returned.
    */
    public static int findBaseDir(@Nonnull ch.bailu.gtk.type.Str text, int length)  {
        return JnaPango.INST().pango_find_base_dir(asCPointerNotNull(text), length);
    }

    /**
     * Locates a paragraph boundary in &#64;text.
     * <br>
     * <br>A boundary is caused by delimiter characters, such as
     * <br>a newline, carriage return, carriage return-newline pair,
     * <br>or Unicode paragraph separator character.
     * <br>
     * <br>The index of the run of delimiters is returned in
     * <br>&#64;paragraph_delimiter_index. The index of the start of the
     * <br>next paragraph (index after all delimiters) is stored n
     * <br>&#64;next_paragraph_start.
     * <br>
     * <br>If no delimiters are found, both &#64;paragraph_delimiter_index
     * <br>and &#64;next_paragraph_start are filled with the length of &#64;text
     * <br>(an index one off the end).
     * @param text UTF-8 text
     * @param length length of &#64;text in bytes, or -1 if nul-terminated
     * @param paragraph_delimiter_index return location for index of   delimiter
     * @param next_paragraph_start return location for start of next   paragraph
    */
    public static void findParagraphBoundary(@Nonnull ch.bailu.gtk.type.Str text, int length, @Nonnull ch.bailu.gtk.type.Int paragraph_delimiter_index, @Nonnull ch.bailu.gtk.type.Int next_paragraph_start)  {
        JnaPango.INST().pango_find_paragraph_boundary(asCPointerNotNull(text), length, asCPointerNotNull(paragraph_delimiter_index), asCPointerNotNull(next_paragraph_start));
    }

    /**
     * Creates a new font description from a string representation.
     * <br>
     * <br>The string must have the form
     * <br>
     * <br>    &quot;&#92;[FAMILY-LIST] &#92;[STYLE-OPTIONS] &#92;[SIZE] &#92;[VARIATIONS]&quot;,
     * <br>
     * <br>where FAMILY-LIST is a comma-separated list of families optionally
     * <br>terminated by a comma, STYLE_OPTIONS is a whitespace-separated list
     * <br>of words where each word describes one of style, variant, weight,
     * <br>stretch, or gravity, and SIZE is a decimal number (size in points)
     * <br>or optionally followed by the unit modifier &quot;px&quot; for absolute size.
     * <br>VARIATIONS is a comma-separated list of font variation
     * <br>specifications of the form &quot;&#92;&#64;axis=value&quot; (the = sign is optional).
     * <br>
     * <br>The following words are understood as styles:
     * <br>&quot;Normal&quot;, &quot;Roman&quot;, &quot;Oblique&quot;, &quot;Italic&quot;.
     * <br>
     * <br>The following words are understood as variants:
     * <br>&quot;Small-Caps&quot;, &quot;All-Small-Caps&quot;, &quot;Petite-Caps&quot;, &quot;All-Petite-Caps&quot;,
     * <br>&quot;Unicase&quot;, &quot;Title-Caps&quot;.
     * <br>
     * <br>The following words are understood as weights:
     * <br>&quot;Thin&quot;, &quot;Ultra-Light&quot;, &quot;Extra-Light&quot;, &quot;Light&quot;, &quot;Semi-Light&quot;,
     * <br>&quot;Demi-Light&quot;, &quot;Book&quot;, &quot;Regular&quot;, &quot;Medium&quot;, &quot;Semi-Bold&quot;, &quot;Demi-Bold&quot;,
     * <br>&quot;Bold&quot;, &quot;Ultra-Bold&quot;, &quot;Extra-Bold&quot;, &quot;Heavy&quot;, &quot;Black&quot;, &quot;Ultra-Black&quot;,
     * <br>&quot;Extra-Black&quot;.
     * <br>
     * <br>The following words are understood as stretch values:
     * <br>&quot;Ultra-Condensed&quot;, &quot;Extra-Condensed&quot;, &quot;Condensed&quot;, &quot;Semi-Condensed&quot;,
     * <br>&quot;Semi-Expanded&quot;, &quot;Expanded&quot;, &quot;Extra-Expanded&quot;, &quot;Ultra-Expanded&quot;.
     * <br>
     * <br>The following words are understood as gravity values:
     * <br>&quot;Not-Rotated&quot;, &quot;South&quot;, &quot;Upside-Down&quot;, &quot;North&quot;, &quot;Rotated-Left&quot;,
     * <br>&quot;East&quot;, &quot;Rotated-Right&quot;, &quot;West&quot;.
     * <br>
     * <br>Any one of the options may be absent. If FAMILY-LIST is absent, then
     * <br>the family_name field of the resulting font description will be
     * <br>initialized to %NULL. If STYLE-OPTIONS is missing, then all style
     * <br>options will be set to the default values. If SIZE is missing, the
     * <br>size in the resulting font description will be set to 0.
     * <br>
     * <br>A typical example:
     * <br>
     * <br>    &quot;Cantarell Italic Light 15 &#92;&#64;wght=200&quot;
     * @param str string representation of a font description.
     * @return a new `PangoFontDescription`.
    */
    public static FontDescription fontDescriptionFromString(@Nonnull ch.bailu.gtk.type.Str str)  {
        return new FontDescription(new PointerContainer(JnaPango.INST().pango_font_description_from_string(asCPointerNotNull(str))));
    }

    /**
     * Finds the gravity that best matches the rotation component
     * <br>in a `PangoMatrix`.
     * @param matrix a `PangoMatrix`
     * @return the gravity of &#64;matrix, which will never be %PANGO_GRAVITY_AUTO, or %PANGO_GRAVITY_SOUTH if &#64;matrix is %NULL
    */
    public static int gravityGetForMatrix(@Nullable Matrix matrix)  {
        return JnaPango.INST().pango_gravity_get_for_matrix(asCPointer(matrix));
    }

    /**
     * Returns the gravity to use in laying out a `PangoItem`.
     * <br>
     * <br>The gravity is determined based on the script, base gravity, and hint.
     * <br>
     * <br>If &#64;base_gravity is %PANGO_GRAVITY_AUTO, it is first replaced with the
     * <br>preferred gravity of &#64;script.  To get the preferred gravity of a script,
     * <br>pass %PANGO_GRAVITY_AUTO and %PANGO_GRAVITY_HINT_STRONG in.
     * @param script `PangoScript` to query
     * @param base_gravity base gravity of the paragraph
     * @param hint orientation hint
     * @return resolved gravity suitable to use for a run of text with &#64;script
    */
    public static int gravityGetForScript(int script, int base_gravity, int hint)  {
        return JnaPango.INST().pango_gravity_get_for_script(script, base_gravity, hint);
    }

    /**
     * Returns the gravity to use in laying out a single character
     * <br>or `PangoItem`.
     * <br>
     * <br>The gravity is determined based on the script, East Asian width,
     * <br>base gravity, and hint,
     * <br>
     * <br>This function is similar to [func&#64;Pango.Gravity.get_for_script] except
     * <br>that this function makes a distinction between narrow/half-width and
     * <br>wide/full-width characters also. Wide/full-width characters always
     * <br>stand *upright*, that is, they always take the base gravity,
     * <br>whereas narrow/full-width characters are always rotated in vertical
     * <br>context.
     * <br>
     * <br>If &#64;base_gravity is %PANGO_GRAVITY_AUTO, it is first replaced with the
     * <br>preferred gravity of &#64;script.
     * @param script `PangoScript` to query
     * @param wide %TRUE for wide characters as returned by g_unichar_iswide()
     * @param base_gravity base gravity of the paragraph
     * @param hint orientation hint
     * @return resolved gravity suitable to use for a run of text with &#64;script and &#64;wide.
    */
    public static int gravityGetForScriptAndWidth(int script, boolean wide, int base_gravity, int hint)  {
        return JnaPango.INST().pango_gravity_get_for_script_and_width(script, wide, base_gravity, hint);
    }

    /**
     * Converts a `PangoGravity` value to its natural rotation in radians.
     * <br>
     * <br>Note that [method&#64;Pango.Matrix.rotate] takes angle in degrees, not radians.
     * <br>So, to call [method&#64;Pango.Matrix,rotate] with the output of this function
     * <br>you should multiply it by (180. / G_PI).
     * @param gravity gravity to query, should not be %PANGO_GRAVITY_AUTO
     * @return the rotation value corresponding to &#64;gravity.
    */
    public static double gravityToRotation(int gravity)  {
        return JnaPango.INST().pango_gravity_to_rotation(gravity);
    }

    /**
     * Checks if a character that should not be normally rendered.
     * <br>
     * <br>This includes all Unicode characters with &quot;ZERO WIDTH&quot; in their name,
     * <br>as well as *bidi* formatting characters, and a few other ones.
     * <br>
     * <br>This is totally different from [func&#64;GLib.unichar_iszerowidth] and is at best misnamed.
     * @param ch a Unicode character
     * @return %TRUE if &#64;ch is a zero-width character, %FALSE otherwise
    */
    public static boolean isZeroWidth(byte ch)  {
        return JnaPango.INST().pango_is_zero_width(ch);
    }

    /**
     * Breaks a piece of text into segments with consistent directional
     * <br>level and font.
     * <br>
     * <br>Each byte of &#64;text will be contained in exactly one of the items in the
     * <br>returned list; the generated list of items will be in logical order (the
     * <br>start offsets of the items are ascending).
     * <br>
     * <br>&#64;cached_iter should be an iterator over &#64;attrs currently positioned
     * <br>at a range before or containing &#64;start_index; &#64;cached_iter will be
     * <br>advanced to the range covering the position just after
     * <br>&#64;start_index + &#64;length. (i.e. if itemizing in a loop, just keep passing
     * <br>in the same &#64;cached_iter).
     * @param context a structure holding information that affects   the itemization process.
     * @param text the text to itemize. Must be valid UTF-8
     * @param start_index first byte in &#64;text to process
     * @param length the number of bytes (not characters) to process   after &#64;start_index. This must be &gt;= 0.
     * @param attrs the set of attributes that apply to &#64;text.
     * @param cached_iter Cached attribute iterator
     * @return a `GList` of   [struct&#64;Pango.Item] structures. The items should be freed using   [method&#64;Pango.Item.free] in combination with [func&#64;GLib.List.free_full].
    */
    public static ch.bailu.gtk.glib.List itemize(@Nonnull Context context, @Nonnull ch.bailu.gtk.type.Str text, int start_index, int length, @Nonnull AttrList attrs, @Nullable AttrIterator cached_iter)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaPango.INST().pango_itemize(asCPointerNotNull(context), asCPointerNotNull(text), start_index, length, asCPointerNotNull(attrs), asCPointer(cached_iter))));
    }

    /**
     * Like `pango_itemize()`, but with an explicitly specified base direction.
     * <br>
     * <br>The base direction is used when computing bidirectional levels.
     * <br>[func&#64;itemize] gets the base direction from the `PangoContext`
     * <br>(see [method&#64;Pango.Context.set_base_dir]).
     * @param context a structure holding information that affects   the itemization process.
     * @param base_dir base direction to use for bidirectional processing
     * @param text the text to itemize.
     * @param start_index first byte in &#64;text to process
     * @param length the number of bytes (not characters) to process   after &#64;start_index. This must be &gt;= 0.
     * @param attrs the set of attributes that apply to &#64;text.
     * @param cached_iter Cached attribute iterator
     * @return a `GList` of   [struct&#64;Pango.Item] structures. The items should be freed using   [method&#64;Pango.Item.free] probably in combination with [func&#64;GLib.List.free_full].
    */
    public static ch.bailu.gtk.glib.List itemizeWithBaseDir(@Nonnull Context context, int base_dir, @Nonnull ch.bailu.gtk.type.Str text, int start_index, int length, @Nonnull AttrList attrs, @Nullable AttrIterator cached_iter)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaPango.INST().pango_itemize_with_base_dir(asCPointerNotNull(context), base_dir, asCPointerNotNull(text), start_index, length, asCPointerNotNull(attrs), asCPointer(cached_iter))));
    }

    /**
     * Convert a language tag to a `PangoLanguage`.
     * <br>
     * <br>The language tag must be in a RFC-3066 format. `PangoLanguage` pointers
     * <br>can be efficiently copied (copy the pointer) and compared with other
     * <br>language tags (compare the pointer.)
     * <br>
     * <br>This function first canonicalizes the string by converting it to
     * <br>lowercase, mapping '_' to '-', and stripping all characters other
     * <br>than letters and '-'.
     * <br>
     * <br>Use [func&#64;Pango.Language.get_default] if you want to get the
     * <br>`PangoLanguage` for the current locale of the process.
     * @param language a string representing a language tag
     * @return a `PangoLanguage`
    */
    public static Language languageFromString(@Nullable ch.bailu.gtk.type.Str language)  {
        return new Language(new PointerContainer(JnaPango.INST().pango_language_from_string(asCPointer(language))));
    }

    /**
     * Returns the `PangoLanguage` for the current locale of the process.
     * <br>
     * <br>On Unix systems, this is the return value is derived from
     * <br>`setlocale (LC_CTYPE, NULL)`, and the user can
     * <br>affect this through the environment variables LC_ALL, LC_CTYPE or
     * <br>LANG (checked in that order). The locale string typically is in
     * <br>the form lang_COUNTRY, where lang is an ISO-639 language code, and
     * <br>COUNTRY is an ISO-3166 country code. For instance, sv_FI for
     * <br>Swedish as written in Finland or pt_BR for Portuguese as written in
     * <br>Brazil.
     * <br>
     * <br>On Windows, the C library does not use any such environment
     * <br>variables, and setting them won't affect the behavior of functions
     * <br>like ctime(). The user sets the locale through the Regional Options
     * <br>in the Control Panel. The C library (in the setlocale() function)
     * <br>does not use country and language codes, but country and language
     * <br>names spelled out in English.
     * <br>However, this function does check the above environment
     * <br>variables, and does return a Unix-style locale string based on
     * <br>either said environment variables or the thread's current locale.
     * <br>
     * <br>Your application should call `setlocale(LC_ALL, &quot;&quot;)` for the user
     * <br>settings to take effect. GTK does this in its initialization
     * <br>functions automatically (by calling gtk_set_locale()).
     * <br>See the setlocale() manpage for more details.
     * <br>
     * <br>Note that the default language can change over the life of an application.
     * <br>
     * <br>Also note that this function will not do the right thing if you
     * <br>use per-thread locales with uselocale(). In that case, you should
     * <br>just call pango_language_from_string() yourself.
     * @return the default language as a `PangoLanguage`
    */
    public static Language languageGetDefault()  {
        return new Language(new PointerContainer(JnaPango.INST().pango_language_get_default()));
    }

    /**
     * 
     * @return 
    */
    public static int layoutDeserializeErrorQuark()  {
        return JnaPango.INST().pango_layout_deserialize_error_quark();
    }

    /**
     * Incrementally parses marked-up text to create a plain-text string
     * <br>and an attribute list.
     * <br>
     * <br>See the [Pango Markup](pango_markup.html) docs for details about the
     * <br>supported markup.
     * <br>
     * <br>If &#64;accel_marker is nonzero, the given character will mark the
     * <br>character following it as an accelerator. For example, &#64;accel_marker
     * <br>might be an ampersand or underscore. All characters marked
     * <br>as an accelerator will receive a %PANGO_UNDERLINE_LOW attribute,
     * <br>and the first character so marked will be returned in &#64;accel_char,
     * <br>when calling [func&#64;markup_parser_finish]. Two &#64;accel_marker characters
     * <br>following each other produce a single literal &#64;accel_marker character.
     * <br>
     * <br>To feed markup to the parser, use [method&#64;GLib.MarkupParseContext.parse]
     * <br>on the returned [struct&#64;GLib.MarkupParseContext]. When done with feeding markup
     * <br>to the parser, use [func&#64;markup_parser_finish] to get the data out
     * <br>of it, and then use [method&#64;GLib.MarkupParseContext.free] to free it.
     * <br>
     * <br>This function is designed for applications that read Pango markup
     * <br>from streams. To simply parse a string containing Pango markup,
     * <br>the [func&#64;Pango.parse_markup] API is recommended instead.
     * @param accel_marker character that precedes an accelerator, or 0 for none
     * @return a `GMarkupParseContext` that should be destroyed with [method&#64;GLib.MarkupParseContext.free].
    */
    public static ch.bailu.gtk.glib.MarkupParseContext markupParserNew(byte accel_marker)  {
        return new ch.bailu.gtk.glib.MarkupParseContext(new PointerContainer(JnaPango.INST().pango_markup_parser_new(accel_marker)));
    }

    /**
     * Parses a font stretch.
     * <br>
     * <br>The allowed values are
     * <br>&quot;ultra_condensed&quot;, &quot;extra_condensed&quot;, &quot;condensed&quot;,
     * <br>&quot;semi_condensed&quot;, &quot;normal&quot;, &quot;semi_expanded&quot;, &quot;expanded&quot;,
     * <br>&quot;extra_expanded&quot; and &quot;ultra_expanded&quot;. Case variations are
     * <br>ignored and the '_' characters may be omitted.
     * @param str a string to parse.
     * @param stretch a `PangoStretch` to store the result in.
     * @param warn if %TRUE, issue a g_warning() on bad input.
     * @return %TRUE if &#64;str was successfully parsed.
    */
    public static boolean parseStretch(@Nonnull ch.bailu.gtk.type.Str str, @Nonnull ch.bailu.gtk.type.Int stretch, boolean warn)  {
        return JnaPango.INST().pango_parse_stretch(asCPointerNotNull(str), asCPointerNotNull(stretch), warn);
    }

    /**
     * Parses a font style.
     * <br>
     * <br>The allowed values are &quot;normal&quot;, &quot;italic&quot; and &quot;oblique&quot;, case
     * <br>variations being
     * <br>ignored.
     * @param str a string to parse.
     * @param style a `PangoStyle` to store the result in.
     * @param warn if %TRUE, issue a g_warning() on bad input.
     * @return %TRUE if &#64;str was successfully parsed.
    */
    public static boolean parseStyle(@Nonnull ch.bailu.gtk.type.Str str, @Nonnull ch.bailu.gtk.type.Int style, boolean warn)  {
        return JnaPango.INST().pango_parse_style(asCPointerNotNull(str), asCPointerNotNull(style), warn);
    }

    /**
     * Parses a font variant.
     * <br>
     * <br>The allowed values are &quot;normal&quot;, &quot;small-caps&quot;, &quot;all-small-caps&quot;,
     * <br>&quot;petite-caps&quot;, &quot;all-petite-caps&quot;, &quot;unicase&quot; and &quot;title-caps&quot;,
     * <br>case variations being ignored.
     * @param str a string to parse.
     * @param variant a `PangoVariant` to store the result in.
     * @param warn if %TRUE, issue a g_warning() on bad input.
     * @return %TRUE if &#64;str was successfully parsed.
    */
    public static boolean parseVariant(@Nonnull ch.bailu.gtk.type.Str str, @Nonnull ch.bailu.gtk.type.Int variant, boolean warn)  {
        return JnaPango.INST().pango_parse_variant(asCPointerNotNull(str), asCPointerNotNull(variant), warn);
    }

    /**
     * Parses a font weight.
     * <br>
     * <br>The allowed values are &quot;heavy&quot;,
     * <br>&quot;ultrabold&quot;, &quot;bold&quot;, &quot;normal&quot;, &quot;light&quot;, &quot;ultraleight&quot;
     * <br>and integers. Case variations are ignored.
     * @param str a string to parse.
     * @param weight a `PangoWeight` to store the result in.
     * @param warn if %TRUE, issue a g_warning() on bad input.
     * @return %TRUE if &#64;str was successfully parsed.
    */
    public static boolean parseWeight(@Nonnull ch.bailu.gtk.type.Str str, @Nonnull ch.bailu.gtk.type.Int weight, boolean warn)  {
        return JnaPango.INST().pango_parse_weight(asCPointerNotNull(str), asCPointerNotNull(weight), warn);
    }

    /**
     * Quantizes the thickness and position of a line to whole device pixels.
     * <br>
     * <br>This is typically used for underline or strikethrough. The purpose of
     * <br>this function is to avoid such lines looking blurry.
     * <br>
     * <br>Care is taken to make sure &#64;thickness is at least one pixel when this
     * <br>function returns, but returned &#64;position may become zero as a result
     * <br>of rounding.
     * @param thickness pointer to the thickness of a line, in Pango units
     * @param position corresponding position
    */
    public static void quantizeLineGeometry(@Nonnull ch.bailu.gtk.type.Int thickness, @Nonnull ch.bailu.gtk.type.Int position)  {
        JnaPango.INST().pango_quantize_line_geometry(asCPointerNotNull(thickness), asCPointerNotNull(position));
    }

    /**
     * Reorder items from logical order to visual order.
     * <br>
     * <br>The visual order is determined from the associated directional
     * <br>levels of the items. The original list is unmodified.
     * <br>
     * <br>(Please open a bug if you use this function.
     * <br> It is not a particularly convenient interface, and the code
     * <br> is duplicated elsewhere in Pango for that reason.)
     * @param items a `GList` of `PangoItem`   in logical order.
     * @return a `GList`   of `PangoItem` structures in visual order.
    */
    public static ch.bailu.gtk.glib.List reorderItems(@Nonnull ch.bailu.gtk.glib.List items)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaPango.INST().pango_reorder_items(asCPointerNotNull(items))));
    }

    /**
     * Finds a language tag that is reasonably representative of &#64;script.
     * <br>
     * <br>The language will usually be the most widely spoken or used language
     * <br>written in that script: for instance, the sample language for
     * <br>%PANGO_SCRIPT_CYRILLIC is ru (Russian), the sample language for
     * <br>%PANGO_SCRIPT_ARABIC is ar.
     * <br>
     * <br>For some scripts, no sample language will be returned because
     * <br>there is no language that is sufficiently representative. The
     * <br>best example of this is %PANGO_SCRIPT_HAN, where various different
     * <br>variants of written Chinese, Japanese, and Korean all use
     * <br>significantly different sets of Han characters and forms
     * <br>of shared characters. No sample language can be provided
     * <br>for many historical scripts as well.
     * <br>
     * <br>As of 1.18, this function checks the environment variables
     * <br>`PANGO_LANGUAGE` and `LANGUAGE` (checked in that order) first.
     * <br>If one of them is set, it is parsed as a list of language tags
     * <br>separated by colons or other separators. This function
     * <br>will return the first language in the parsed list that Pango
     * <br>believes may use &#64;script for writing. This last predicate
     * <br>is tested using [method&#64;Pango.Language.includes_script]. This can
     * <br>be used to control Pango's font selection for non-primary
     * <br>languages. For example, a `PANGO_LANGUAGE` enviroment variable
     * <br>set to &quot;en:fa&quot; makes Pango choose fonts suitable for Persian (fa)
     * <br>instead of Arabic (ar) when a segment of Arabic text is found
     * <br>in an otherwise non-Arabic text. The same trick can be used to
     * <br>choose a default language for %PANGO_SCRIPT_HAN when setting
     * <br>context language is not feasible.
     * @param script a `PangoScript`
     * @return a `PangoLanguage` that is representative   of the script
    */
    public static Language scriptGetSampleLanguage(int script)  {
        return new Language(new PointerContainer(JnaPango.INST().pango_script_get_sample_language(script)));
    }

    /**
     * Convert the characters in &#64;text into glyphs.
     * <br>
     * <br>Given a segment of text and the corresponding `PangoAnalysis` structure
     * <br>returned from [func&#64;Pango.itemize], convert the characters into glyphs. You
     * <br>may also pass in only a substring of the item from [func&#64;Pango.itemize].
     * <br>
     * <br>It is recommended that you use [func&#64;Pango.shape_full] instead, since
     * <br>that API allows for shaping interaction happening across text item
     * <br>boundaries.
     * <br>
     * <br>Some aspects of hyphen insertion and text transformation (in particular,
     * <br>capitalization) require log attrs, and thus can only be handled by
     * <br>[func&#64;Pango.shape_item].
     * <br>
     * <br>Note that the extra attributes in the &#64;analyis that is returned from
     * <br>[func&#64;Pango.itemize] have indices that are relative to the entire paragraph,
     * <br>so you need to subtract the item offset from their indices before
     * <br>calling [func&#64;Pango.shape].
     * @param text the text to process
     * @param length the length (in bytes) of &#64;text
     * @param analysis `PangoAnalysis` structure from [func&#64;Pango.itemize]
     * @param glyphs glyph string in which to store results
    */
    public static void shape(@Nonnull ch.bailu.gtk.type.Str text, int length, @Nonnull Analysis analysis, @Nonnull GlyphString glyphs)  {
        JnaPango.INST().pango_shape(asCPointerNotNull(text), length, asCPointerNotNull(analysis), asCPointerNotNull(glyphs));
    }

    /**
     * Convert the characters in &#64;text into glyphs.
     * <br>
     * <br>Given a segment of text and the corresponding `PangoAnalysis` structure
     * <br>returned from [func&#64;Pango.itemize], convert the characters into glyphs.
     * <br>You may also pass in only a substring of the item from [func&#64;Pango.itemize].
     * <br>
     * <br>This is similar to [func&#64;Pango.shape], except it also can optionally take
     * <br>the full paragraph text as input, which will then be used to perform
     * <br>certain cross-item shaping interactions. If you have access to the broader
     * <br>text of which &#64;item_text is part of, provide the broader text as
     * <br>&#64;paragraph_text. If &#64;paragraph_text is %NULL, item text is used instead.
     * <br>
     * <br>Some aspects of hyphen insertion and text transformation (in particular,
     * <br>capitalization) require log attrs, and thus can only be handled by
     * <br>[func&#64;Pango.shape_item].
     * <br>
     * <br>Note that the extra attributes in the &#64;analyis that is returned from
     * <br>[func&#64;Pango.itemize] have indices that are relative to the entire paragraph,
     * <br>so you do not pass the full paragraph text as &#64;paragraph_text, you need
     * <br>to subtract the item offset from their indices before calling
     * <br>[func&#64;Pango.shape_full].
     * @param item_text valid UTF-8 text to shape.
     * @param item_length the length (in bytes) of &#64;item_text. -1 means nul-terminated text.
     * @param paragraph_text text of the paragraph (see details).
     * @param paragraph_length the length (in bytes) of &#64;paragraph_text. -1 means nul-terminated text.
     * @param analysis `PangoAnalysis` structure from [func&#64;Pango.itemize].
     * @param glyphs glyph string in which to store results.
    */
    public static void shapeFull(@Nonnull ch.bailu.gtk.type.Str item_text, int item_length, @Nullable ch.bailu.gtk.type.Str paragraph_text, int paragraph_length, @Nonnull Analysis analysis, @Nonnull GlyphString glyphs)  {
        JnaPango.INST().pango_shape_full(asCPointerNotNull(item_text), item_length, asCPointer(paragraph_text), paragraph_length, asCPointerNotNull(analysis), asCPointerNotNull(glyphs));
    }

    /**
     * Convert the characters in &#64;item into glyphs.
     * <br>
     * <br>This is similar to [func&#64;Pango.shape_with_flags], except it takes a
     * <br>`PangoItem` instead of separate &#64;item_text and &#64;analysis arguments.
     * <br>
     * <br>It also takes &#64;log_attrs, which are needed for implementing some aspects
     * <br>of hyphen insertion and text transforms (in particular, capitalization).
     * <br>
     * <br>Note that the extra attributes in the &#64;analyis that is returned from
     * <br>[func&#64;Pango.itemize] have indices that are relative to the entire paragraph,
     * <br>so you do not pass the full paragraph text as &#64;paragraph_text, you need
     * <br>to subtract the item offset from their indices before calling
     * <br>[func&#64;Pango.shape_with_flags].
     * @param item `PangoItem` to shape
     * @param paragraph_text text of the paragraph (see details).
     * @param paragraph_length the length (in bytes) of &#64;paragraph_text.     -1 means nul-terminated text.
     * @param log_attrs array of `PangoLogAttr` for &#64;item
     * @param glyphs glyph string in which to store results
     * @param flags flags influencing the shaping process
    */
    public static void shapeItem(@Nonnull Item item, @Nullable ch.bailu.gtk.type.Str paragraph_text, int paragraph_length, @Nullable LogAttr log_attrs, @Nonnull GlyphString glyphs, int flags)  {
        JnaPango.INST().pango_shape_item(asCPointerNotNull(item), asCPointer(paragraph_text), paragraph_length, asCPointer(log_attrs), asCPointerNotNull(glyphs), flags);
    }

    /**
     * Convert the characters in &#64;text into glyphs.
     * <br>
     * <br>Given a segment of text and the corresponding `PangoAnalysis` structure
     * <br>returned from [func&#64;Pango.itemize], convert the characters into glyphs.
     * <br>You may also pass in only a substring of the item from [func&#64;Pango.itemize].
     * <br>
     * <br>This is similar to [func&#64;Pango.shape_full], except it also takes flags
     * <br>that can influence the shaping process.
     * <br>
     * <br>Some aspects of hyphen insertion and text transformation (in particular,
     * <br>capitalization) require log attrs, and thus can only be handled by
     * <br>[func&#64;Pango.shape_item].
     * <br>
     * <br>Note that the extra attributes in the &#64;analyis that is returned from
     * <br>[func&#64;Pango.itemize] have indices that are relative to the entire paragraph,
     * <br>so you do not pass the full paragraph text as &#64;paragraph_text, you need
     * <br>to subtract the item offset from their indices before calling
     * <br>[func&#64;Pango.shape_with_flags].
     * @param item_text valid UTF-8 text to shape
     * @param item_length the length (in bytes) of &#64;item_text.     -1 means nul-terminated text.
     * @param paragraph_text text of the paragraph (see details).
     * @param paragraph_length the length (in bytes) of &#64;paragraph_text.     -1 means nul-terminated text.
     * @param analysis `PangoAnalysis` structure from [func&#64;Pango.itemize]
     * @param glyphs glyph string in which to store results
     * @param flags flags influencing the shaping process
    */
    public static void shapeWithFlags(@Nonnull ch.bailu.gtk.type.Str item_text, int item_length, @Nullable ch.bailu.gtk.type.Str paragraph_text, int paragraph_length, @Nonnull Analysis analysis, @Nonnull GlyphString glyphs, int flags)  {
        JnaPango.INST().pango_shape_with_flags(asCPointerNotNull(item_text), item_length, asCPointer(paragraph_text), paragraph_length, asCPointerNotNull(analysis), asCPointerNotNull(glyphs), flags);
    }

    /**
     * Deserializes a `PangoTabArray` from a string.
     * <br>
     * <br>This is the counterpart to [method&#64;Pango.TabArray.to_string].
     * <br>See that functions for details about the format.
     * @param text a string
     * @return a new `PangoTabArray`
    */
    public static TabArray tabArrayFromString(@Nonnull ch.bailu.gtk.type.Str text)  {
        return new TabArray(new PointerContainer(JnaPango.INST().pango_tab_array_from_string(asCPointerNotNull(text))));
    }

    /**
     * Determines the inherent direction of a character.
     * <br>
     * <br>The inherent direction is either `PANGO_DIRECTION_LTR`, `PANGO_DIRECTION_RTL`,
     * <br>or `PANGO_DIRECTION_NEUTRAL`.
     * <br>
     * <br>This function is useful to categorize characters into left-to-right
     * <br>letters, right-to-left letters, and everything else. If full Unicode
     * <br>bidirectional type of a character is needed, [func&#64;Pango.BidiType.for_unichar]
     * <br>can be used instead.
     * @param ch a Unicode character
     * @return the direction of the character.
    */
    public static int unicharDirection(byte ch)  {
        return JnaPango.INST().pango_unichar_direction(ch);
    }

    /**
     * Converts a floating-point number to Pango units.
     * <br>
     * <br>The conversion is done by multiplying &#64;d by %PANGO_SCALE and
     * <br>rounding the result to nearest integer.
     * @param d double floating-point value
     * @return the value in Pango units.
    */
    public static int unitsFromDouble(double d)  {
        return JnaPango.INST().pango_units_from_double(d);
    }

    /**
     * Converts a number in Pango units to floating-point.
     * <br>
     * <br>The conversion is done by dividing &#64;i by %PANGO_SCALE.
     * @param i value in Pango units
     * @return the double value.
    */
    public static double unitsToDouble(int i)  {
        return JnaPango.INST().pango_units_to_double(i);
    }

    /**
     * Returns the encoded version of Pango available at run-time.
     * <br>
     * <br>This is similar to the macro %PANGO_VERSION except that the macro
     * <br>returns the encoded version available at compile-time. A version
     * <br>number can be encoded into an integer using PANGO_VERSION_ENCODE().
     * @return The encoded version of Pango library available at run time.
    */
    public static int version()  {
        return JnaPango.INST().pango_version();
    }

    /**
     * Checks that the Pango library in use is compatible with the
     * <br>given version.
     * <br>
     * <br>Generally you would pass in the constants %PANGO_VERSION_MAJOR,
     * <br>%PANGO_VERSION_MINOR, %PANGO_VERSION_MICRO as the three arguments
     * <br>to this function; that produces a check that the library in use at
     * <br>run-time is compatible with the version of Pango the application or
     * <br>module was compiled against.
     * <br>
     * <br>Compatibility is defined by two things: first the version
     * <br>of the running library is newer than the version
     * <br>&#64;required_major.required_minor.&#64;required_micro. Second
     * <br>the running library must be binary compatible with the
     * <br>version &#64;required_major.required_minor.&#64;required_micro
     * <br>(same major version.)
     * <br>
     * <br>For compile-time version checking use PANGO_VERSION_CHECK().
     * @param required_major the required major version
     * @param required_minor the required minor version
     * @param required_micro the required major version
     * @return %NULL if the Pango library is compatible   with the given version, or a string describing the version   mismatch.  The returned string is owned by Pango and should not   be modified or freed.
    */
    public static ch.bailu.gtk.type.Str versionCheck(int required_major, int required_minor, int required_micro)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPango.INST().pango_version_check(required_major, required_minor, required_micro)));
    }

    /**
     * Returns the version of Pango available at run-time.
     * <br>
     * <br>This is similar to the macro %PANGO_VERSION_STRING except that the
     * <br>macro returns the version available at compile-time.
     * @return A string containing the version of Pango library available   at run time. The returned string is owned by Pango and should not   be modified or freed.
    */
    public static ch.bailu.gtk.type.Str versionString()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPango.INST().pango_version_string()));
    }

}

/*
package-type

[MethodModel:java-type-not-supported:attrBreak:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:AttrList:{c:PangoAttrList*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoLogAttr*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]

[MethodModel:cb-deprecated:java-type-not-supported:break:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Analysis:{c:PangoAnalysis*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoLogAttr*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]

[MethodModel:java-type-not-supported:getLogAttrs:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Language:{c:PangoLanguage*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoLogAttr*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]

[MethodModel:cb-deprecated:java-type-not-supported:getMirrorChar:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:gunichar}}:{j:byte}]
        [ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]

[MethodModel:cb-return-value-not-supported:languageGetPreferred:[ParameterModel:java-type-not-supported:{G_::{c:PangoLanguage**}}:{j:}]]

[MethodModel:cb-return-value-not-supported:log2visGetEmbeddingLevels:[ParameterModel:java-type-not-supported:{G_::{c:guint8*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:PangoDirection*}}:{j:int}]

[MethodModel:java-type-not-supported:java-type-not-supported:markupParserFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:MarkupParseContext:{c:GMarkupParseContext*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoAttrList**}}:{j:}]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]

[MethodModel:cb-deprecated:parseEnum:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:GType}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:parseMarkup:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gunichar}}:{j:byte}]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoAttrList**}}:{j:}]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]

[MethodModel:cb-deprecated:java-type-not-supported:readLine:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:FILE*}}:{j:}]
        [ParameterModel:Supported:{Gg:GString:{c:GString*}}:{j:long}]

[MethodModel:cb-deprecated:scanInt:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Strs:{c:const char**}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]

[MethodModel:cb-deprecated:scanString:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Strs:{c:const char**}}:{j:long}]
        [ParameterModel:Supported:{Gg:GString:{c:GString*}}:{j:long}]

[MethodModel:cb-deprecated:scanWord:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Strs:{c:const char**}}:{j:long}]
        [ParameterModel:Supported:{Gg:GString:{c:GString*}}:{j:long}]

[MethodModel:cb-deprecated:scriptForUnichar:[ParameterModel:Supported:{G_::{c:PangoScript}}:{j:int}]]
        [ParameterModel:Supported:{G_::{c:gunichar}}:{j:byte}]

[MethodModel:cb-deprecated:skipSpace:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Strs:{c:const char**}}:{j:long}]

[MethodModel:cb-deprecated:splitFileList:[ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]

[MethodModel:java-type-not-supported:tailorBreak:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Analysis:{c:PangoAnalysis*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoLogAttr*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]

[MethodModel:cb-deprecated:trimString:[ParameterModel:Supported:{Gw:Str:{c:char*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
*/
