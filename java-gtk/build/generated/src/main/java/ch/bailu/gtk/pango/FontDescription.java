/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoFontDescription` describes a font in an implementation-independent
 * <br>manner.
 * <br>
 * <br>`PangoFontDescription` structures are used both to list what fonts are
 * <br>available on the system and also for specifying the characteristics of
 * <br>a font to load.
 * <p><a href="https://docs.gtk.org/Pango/struct.FontDescription.html">https://docs.gtk.org/Pango/struct.FontDescription.html</a></p>
*/
public class FontDescription extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontDescription.class.getCanonicalName());
    }

    public FontDescription(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new font description structure with all fields unset.
    */
    public FontDescription() {
        super(cast(JnaFontDescription.INST().pango_font_description_new()));
    }

    /**
     * Determines if the style attributes of &#64;new_match are a closer match
     * <br>for &#64;desc than those of &#64;old_match are, or if &#64;old_match is %NULL,
     * <br>determines if &#64;new_match is a match at all.
     * <br>
     * <br>Approximate matching is done for weight and style; other style attributes
     * <br>must match exactly. Style attributes are all attributes other than family
     * <br>and size-related attributes. Approximate matching for style considers
     * <br>%PANGO_STYLE_OBLIQUE and %PANGO_STYLE_ITALIC as matches, but not as good
     * <br>a match as when the styles are equal.
     * <br>
     * <br>Note that &#64;old_match must match &#64;desc.
     * @param old_match a `PangoFontDescription`, or %NULL
     * @param new_match a `PangoFontDescription`
     * @return %TRUE if &#64;new_match is a better match
    */
    public boolean betterMatch(@Nullable FontDescription old_match, @Nonnull FontDescription new_match)  {
        return JnaFontDescription.INST().pango_font_description_better_match(asCPointer(), asCPointer(old_match), asCPointerNotNull(new_match));
    }

    /**
     * Make a copy of a `PangoFontDescription`.
     * @return the newly allocated `PangoFontDescription`,   which should be freed with [method&#64;Pango.FontDescription.free],   or %NULL if &#64;desc was %NULL.
    */
    public FontDescription copy()  {
        return new FontDescription(new PointerContainer(JnaFontDescription.INST().pango_font_description_copy(asCPointer())));
    }

    /**
     * Make a copy of a `PangoFontDescription`, but don't duplicate
     * <br>allocated fields.
     * <br>
     * <br>This is like [method&#64;Pango.FontDescription.copy], but only a shallow
     * <br>copy is made of the family name and other allocated fields. The result
     * <br>can only be used until &#64;desc is modified or freed. This is meant
     * <br>to be used when the copy is only needed temporarily.
     * @return the newly allocated `PangoFontDescription`,   which should be freed with [method&#64;Pango.FontDescription.free],   or %NULL if &#64;desc was %NULL.
    */
    public FontDescription copyStatic()  {
        return new FontDescription(new PointerContainer(JnaFontDescription.INST().pango_font_description_copy_static(asCPointer())));
    }

    /**
     * Compares two font descriptions for equality.
     * <br>
     * <br>Two font descriptions are considered equal if the fonts they describe
     * <br>are provably identical. This means that their masks do not have to match,
     * <br>as long as other fields are all the same. (Two font descriptions may
     * <br>result in identical fonts being loaded, but still compare %FALSE.)
     * @param desc2 another `PangoFontDescription`
     * @return %TRUE if the two font descriptions are identical,   %FALSE otherwise.
    */
    public boolean equal(@Nonnull FontDescription desc2)  {
        return JnaFontDescription.INST().pango_font_description_equal(asCPointer(), asCPointerNotNull(desc2));
    }

    /**
     * Frees a font description.
    */
    public void free()  {
        JnaFontDescription.INST().pango_font_description_free(asCPointer());
    }

    /**
     * Gets the family name field of a font description.
     * <br>
     * <br>See [method&#64;Pango.FontDescription.set_family].
     * @return the family name field for the   font description, or %NULL if not previously set. This has the same   life-time as the font description itself and should not be freed.
    */
    public ch.bailu.gtk.type.Str getFamily()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFontDescription.INST().pango_font_description_get_family(asCPointer())));
    }

    /**
     * Gets the gravity field of a font description.
     * <br>
     * <br>See [method&#64;Pango.FontDescription.set_gravity].
     * @return the gravity field for the font description.   Use [method&#64;Pango.FontDescription.get_set_fields] to find out   if the field was explicitly set or not.
    */
    public int getGravity()  {
        return JnaFontDescription.INST().pango_font_description_get_gravity(asCPointer());
    }

    /**
     * Determines which fields in a font description have been set.
     * @return a bitmask with bits set corresponding to the   fields in &#64;desc that have been set.
    */
    public int getSetFields()  {
        return JnaFontDescription.INST().pango_font_description_get_set_fields(asCPointer());
    }

    /**
     * Gets the size field of a font description.
     * <br>
     * <br>See [method&#64;Pango.FontDescription.set_size].
     * @return the size field for the font description in points   or device units. You must call   [method&#64;Pango.FontDescription.get_size_is_absolute] to find out   which is the case. Returns 0 if the size field has not previously   been set or it has been set to 0 explicitly.   Use [method&#64;Pango.FontDescription.get_set_fields] to find out   if the field was explicitly set or not.
    */
    public int getSize()  {
        return JnaFontDescription.INST().pango_font_description_get_size(asCPointer());
    }

    /**
     * Determines whether the size of the font is in points (not absolute)
     * <br>or device units (absolute).
     * <br>
     * <br>See [method&#64;Pango.FontDescription.set_size]
     * <br>and [method&#64;Pango.FontDescription.set_absolute_size].
     * @return whether the size for the font description is in   points or device units. Use [method&#64;Pango.FontDescription.get_set_fields]   to find out if the size field of the font description was explicitly   set or not.
    */
    public boolean getSizeIsAbsolute()  {
        return JnaFontDescription.INST().pango_font_description_get_size_is_absolute(asCPointer());
    }

    /**
     * Gets the stretch field of a font description.
     * <br>
     * <br>See [method&#64;Pango.FontDescription.set_stretch].
     * @return the stretch field for the font description.   Use [method&#64;Pango.FontDescription.get_set_fields] to find   out if the field was explicitly set or not.
    */
    public int getStretch()  {
        return JnaFontDescription.INST().pango_font_description_get_stretch(asCPointer());
    }

    /**
     * Gets the style field of a `PangoFontDescription`.
     * <br>
     * <br>See [method&#64;Pango.FontDescription.set_style].
     * @return the style field for the font description.   Use [method&#64;Pango.FontDescription.get_set_fields] to   find out if the field was explicitly set or not.
    */
    public int getStyle()  {
        return JnaFontDescription.INST().pango_font_description_get_style(asCPointer());
    }

    /**
     * Gets the variant field of a `PangoFontDescription`.
     * <br>
     * <br>See [method&#64;Pango.FontDescription.set_variant].
     * @return the variant field for the font description.   Use [method&#64;Pango.FontDescription.get_set_fields] to find   out if the field was explicitly set or not.
    */
    public int getVariant()  {
        return JnaFontDescription.INST().pango_font_description_get_variant(asCPointer());
    }

    /**
     * Gets the variations field of a font description.
     * <br>
     * <br>See [method&#64;Pango.FontDescription.set_variations].
     * @return the variations field for the font   description, or %NULL if not previously set. This has the same   life-time as the font description itself and should not be freed.
    */
    public ch.bailu.gtk.type.Str getVariations()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFontDescription.INST().pango_font_description_get_variations(asCPointer())));
    }

    /**
     * Gets the weight field of a font description.
     * <br>
     * <br>See [method&#64;Pango.FontDescription.set_weight].
     * @return the weight field for the font description.   Use [method&#64;Pango.FontDescription.get_set_fields] to find   out if the field was explicitly set or not.
    */
    public int getWeight()  {
        return JnaFontDescription.INST().pango_font_description_get_weight(asCPointer());
    }

    /**
     * Computes a hash of a `PangoFontDescription` structure.
     * <br>
     * <br>This is suitable to be used, for example, as an argument
     * <br>to g_hash_table_new(). The hash value is independent of &#64;desc-&gt;mask.
     * @return the hash value.
    */
    public int hash()  {
        return JnaFontDescription.INST().pango_font_description_hash(asCPointer());
    }

    /**
     * Merges the fields that are set in &#64;desc_to_merge into the fields in
     * <br>&#64;desc.
     * <br>
     * <br>If &#64;replace_existing is %FALSE, only fields in &#64;desc that
     * <br>are not already set are affected. If %TRUE, then fields that are
     * <br>already set will be replaced as well.
     * <br>
     * <br>If &#64;desc_to_merge is %NULL, this function performs nothing.
     * @param desc_to_merge the `PangoFontDescription` to merge from,   or %NULL
     * @param replace_existing if %TRUE, replace fields in &#64;desc with the   corresponding values from &#64;desc_to_merge, even if they   are already exist.
    */
    public void merge(@Nullable FontDescription desc_to_merge, boolean replace_existing)  {
        JnaFontDescription.INST().pango_font_description_merge(asCPointer(), asCPointer(desc_to_merge), replace_existing);
    }

    /**
     * Merges the fields that are set in &#64;desc_to_merge into the fields in
     * <br>&#64;desc, without copying allocated fields.
     * <br>
     * <br>This is like [method&#64;Pango.FontDescription.merge], but only a shallow copy
     * <br>is made of the family name and other allocated fields. &#64;desc can only
     * <br>be used until &#64;desc_to_merge is modified or freed. This is meant to
     * <br>be used when the merged font description is only needed temporarily.
     * @param desc_to_merge the `PangoFontDescription` to merge from
     * @param replace_existing if %TRUE, replace fields in &#64;desc with the   corresponding values from &#64;desc_to_merge, even if they   are already exist.
    */
    public void mergeStatic(@Nonnull FontDescription desc_to_merge, boolean replace_existing)  {
        JnaFontDescription.INST().pango_font_description_merge_static(asCPointer(), asCPointerNotNull(desc_to_merge), replace_existing);
    }

    /**
     * Sets the size field of a font description, in device units.
     * <br>
     * <br>This is mutually exclusive with [method&#64;Pango.FontDescription.set_size]
     * <br>which sets the font size in points.
     * @param size the new size, in Pango units. There are %PANGO_SCALE Pango units   in one device unit. For an output backend where a device unit is a pixel,   a &#64;size value of 10 * PANGO_SCALE gives a 10 pixel font.
    */
    public void setAbsoluteSize(double size)  {
        JnaFontDescription.INST().pango_font_description_set_absolute_size(asCPointer(), size);
    }

    /**
     * Sets the family name field of a font description.
     * <br>
     * <br>The family
     * <br>name represents a family of related font styles, and will
     * <br>resolve to a particular `PangoFontFamily`. In some uses of
     * <br>`PangoFontDescription`, it is also possible to use a comma
     * <br>separated list of family names for this field.
     * @param family a string representing the family name.
    */
    public void setFamily(@Nonnull ch.bailu.gtk.type.Str family)  {
        JnaFontDescription.INST().pango_font_description_set_family(asCPointer(), asCPointerNotNull(family));
    }

    /**
     * Sets the family name field of a font description.
     * <br>
     * <br>The family
     * <br>name represents a family of related font styles, and will
     * <br>resolve to a particular `PangoFontFamily`. In some uses of
     * <br>`PangoFontDescription`, it is also possible to use a comma
     * <br>separated list of family names for this field.
     * @param family a string representing the family name.
    */
    public void setFamily(String family)  {
        JnaFontDescription.INST().pango_font_description_set_family(asCPointer(), family);
    }

    /**
     * Sets the family name field of a font description, without copying the string.
     * <br>
     * <br>This is like [method&#64;Pango.FontDescription.set_family], except that no
     * <br>copy of &#64;family is made. The caller must make sure that the
     * <br>string passed in stays around until &#64;desc has been freed or the
     * <br>name is set again. This function can be used if &#64;family is a static
     * <br>string such as a C string literal, or if &#64;desc is only needed temporarily.
     * @param family a string representing the family name
    */
    public void setFamilyStatic(@Nonnull ch.bailu.gtk.type.Str family)  {
        JnaFontDescription.INST().pango_font_description_set_family_static(asCPointer(), asCPointerNotNull(family));
    }

    /**
     * Sets the family name field of a font description, without copying the string.
     * <br>
     * <br>This is like [method&#64;Pango.FontDescription.set_family], except that no
     * <br>copy of &#64;family is made. The caller must make sure that the
     * <br>string passed in stays around until &#64;desc has been freed or the
     * <br>name is set again. This function can be used if &#64;family is a static
     * <br>string such as a C string literal, or if &#64;desc is only needed temporarily.
     * @param family a string representing the family name
    */
    public void setFamilyStatic(String family)  {
        JnaFontDescription.INST().pango_font_description_set_family_static(asCPointer(), family);
    }

    /**
     * Sets the gravity field of a font description.
     * <br>
     * <br>The gravity field
     * <br>specifies how the glyphs should be rotated. If &#64;gravity is
     * <br>%PANGO_GRAVITY_AUTO, this actually unsets the gravity mask on
     * <br>the font description.
     * <br>
     * <br>This function is seldom useful to the user. Gravity should normally
     * <br>be set on a `PangoContext`.
     * @param gravity the gravity for the font description.
    */
    public void setGravity(int gravity)  {
        JnaFontDescription.INST().pango_font_description_set_gravity(asCPointer(), gravity);
    }

    /**
     * Sets the size field of a font description in fractional points.
     * <br>
     * <br>This is mutually exclusive with
     * <br>[method&#64;Pango.FontDescription.set_absolute_size].
     * @param size the size of the font in points, scaled by %PANGO_SCALE.   (That is, a &#64;size value of 10 * PANGO_SCALE is a 10 point font.   The conversion factor between points and device units depends on   system configuration and the output device. For screen display, a   logical DPI of 96 is common, in which case a 10 point font corresponds   to a 10 * (96 / 72) = 13.3 pixel font.   Use [method&#64;Pango.FontDescription.set_absolute_size] if you need   a particular size in device units.
    */
    public void setSize(int size)  {
        JnaFontDescription.INST().pango_font_description_set_size(asCPointer(), size);
    }

    /**
     * Sets the stretch field of a font description.
     * <br>
     * <br>The [enum&#64;Pango.Stretch] field specifies how narrow or
     * <br>wide the font should be.
     * @param stretch the stretch for the font description
    */
    public void setStretch(int stretch)  {
        JnaFontDescription.INST().pango_font_description_set_stretch(asCPointer(), stretch);
    }

    /**
     * Sets the style field of a `PangoFontDescription`.
     * <br>
     * <br>The [enum&#64;Pango.Style] enumeration describes whether the font is
     * <br>slanted and the manner in which it is slanted; it can be either
     * <br>%PANGO_STYLE_NORMAL, %PANGO_STYLE_ITALIC, or %PANGO_STYLE_OBLIQUE.
     * <br>
     * <br>Most fonts will either have a italic style or an oblique style,
     * <br>but not both, and font matching in Pango will match italic
     * <br>specifications with oblique fonts and vice-versa if an exact
     * <br>match is not found.
     * @param style the style for the font description
    */
    public void setStyle(int style)  {
        JnaFontDescription.INST().pango_font_description_set_style(asCPointer(), style);
    }

    /**
     * Sets the variant field of a font description.
     * <br>
     * <br>The [enum&#64;Pango.Variant] can either be %PANGO_VARIANT_NORMAL
     * <br>or %PANGO_VARIANT_SMALL_CAPS.
     * @param variant the variant type for the font description.
    */
    public void setVariant(int variant)  {
        JnaFontDescription.INST().pango_font_description_set_variant(asCPointer(), variant);
    }

    /**
     * Sets the variations field of a font description.
     * <br>
     * <br>OpenType font variations allow to select a font instance by
     * <br>specifying values for a number of axes, such as width or weight.
     * <br>
     * <br>The format of the variations string is
     * <br>
     * <br>    AXIS1=VALUE,AXIS2=VALUE...
     * <br>
     * <br>with each AXIS a 4 character tag that identifies a font axis,
     * <br>and each VALUE a floating point number. Unknown axes are ignored,
     * <br>and values are clamped to their allowed range.
     * <br>
     * <br>Pango does not currently have a way to find supported axes of
     * <br>a font. Both harfbuzz and freetype have API for this. See
     * <br>for example [hb_ot_var_get_axis_infos](https://harfbuzz.github.io/harfbuzz-hb-ot-var.html&#35;hb-ot-var-get-axis-infos).
     * @param variations a string representing the variations
    */
    public void setVariations(@Nullable ch.bailu.gtk.type.Str variations)  {
        JnaFontDescription.INST().pango_font_description_set_variations(asCPointer(), asCPointer(variations));
    }

    /**
     * Sets the variations field of a font description.
     * <br>
     * <br>OpenType font variations allow to select a font instance by
     * <br>specifying values for a number of axes, such as width or weight.
     * <br>
     * <br>The format of the variations string is
     * <br>
     * <br>    AXIS1=VALUE,AXIS2=VALUE...
     * <br>
     * <br>with each AXIS a 4 character tag that identifies a font axis,
     * <br>and each VALUE a floating point number. Unknown axes are ignored,
     * <br>and values are clamped to their allowed range.
     * <br>
     * <br>Pango does not currently have a way to find supported axes of
     * <br>a font. Both harfbuzz and freetype have API for this. See
     * <br>for example [hb_ot_var_get_axis_infos](https://harfbuzz.github.io/harfbuzz-hb-ot-var.html&#35;hb-ot-var-get-axis-infos).
     * @param variations a string representing the variations
    */
    public void setVariations(String variations)  {
        JnaFontDescription.INST().pango_font_description_set_variations(asCPointer(), variations);
    }

    /**
     * Sets the variations field of a font description.
     * <br>
     * <br>This is like [method&#64;Pango.FontDescription.set_variations], except
     * <br>that no copy of &#64;variations is made. The caller must make sure that
     * <br>the string passed in stays around until &#64;desc has been freed
     * <br>or the name is set again. This function can be used if
     * <br>&#64;variations is a static string such as a C string literal,
     * <br>or if &#64;desc is only needed temporarily.
     * @param variations a string representing the variations
    */
    public void setVariationsStatic(@Nonnull ch.bailu.gtk.type.Str variations)  {
        JnaFontDescription.INST().pango_font_description_set_variations_static(asCPointer(), asCPointerNotNull(variations));
    }

    /**
     * Sets the variations field of a font description.
     * <br>
     * <br>This is like [method&#64;Pango.FontDescription.set_variations], except
     * <br>that no copy of &#64;variations is made. The caller must make sure that
     * <br>the string passed in stays around until &#64;desc has been freed
     * <br>or the name is set again. This function can be used if
     * <br>&#64;variations is a static string such as a C string literal,
     * <br>or if &#64;desc is only needed temporarily.
     * @param variations a string representing the variations
    */
    public void setVariationsStatic(String variations)  {
        JnaFontDescription.INST().pango_font_description_set_variations_static(asCPointer(), variations);
    }

    /**
     * Sets the weight field of a font description.
     * <br>
     * <br>The weight field
     * <br>specifies how bold or light the font should be. In addition
     * <br>to the values of the [enum&#64;Pango.Weight] enumeration, other
     * <br>intermediate numeric values are possible.
     * @param weight the weight for the font description.
    */
    public void setWeight(int weight)  {
        JnaFontDescription.INST().pango_font_description_set_weight(asCPointer(), weight);
    }

    /**
     * Creates a filename representation of a font description.
     * <br>
     * <br>The filename is identical to the result from calling
     * <br>[method&#64;Pango.FontDescription.to_string], but with underscores
     * <br>instead of characters that are untypical in filenames, and in
     * <br>lower case only.
     * @return a new string that must be freed with g_free().
    */
    public ch.bailu.gtk.type.Str toFilename()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFontDescription.INST().pango_font_description_to_filename(asCPointer())));
    }

    /**
     * Creates a string representation of a font description.
     * <br>
     * <br>See [func&#64;Pango.FontDescription.from_string] for a description
     * <br>of the format of the string representation. The family list in
     * <br>the string description will only have a terminating comma if
     * <br>the last word of the list is a valid style option.
     * @return a new string that must be freed with g_free().
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFontDescription.INST().pango_font_description_to_string(asCPointer())));
    }

    /**
     * Unsets some of the fields in a `PangoFontDescription`.
     * <br>
     * <br>The unset fields will get back to their default values.
     * @param to_unset bitmask of fields in the &#64;desc to unset.
    */
    public void unsetFields(int to_unset)  {
        JnaFontDescription.INST().pango_font_description_unset_fields(asCPointer(), to_unset);
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
    public static FontDescription fromString(@Nonnull ch.bailu.gtk.type.Str str)  {
        return new FontDescription(new PointerContainer(JnaFontDescription.INST().pango_font_description_from_string(asCPointerNotNull(str))));
    }

    public static long getTypeID() { 
        return JnaFontDescription.INST().pango_font_description_get_type(); 
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
