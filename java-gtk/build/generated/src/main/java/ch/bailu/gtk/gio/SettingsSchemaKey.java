/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GSettingsSchemaKey is an opaque data structure and can only be accessed
 * <br>using the following functions.
 * <p><a href="https://docs.gtk.org/gio/struct.SettingsSchemaKey.html">https://docs.gtk.org/gio/struct.SettingsSchemaKey.html</a></p>
*/
public class SettingsSchemaKey extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SettingsSchemaKey.class.getCanonicalName());
    }

    public SettingsSchemaKey(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the default value for &#64;key.
     * <br>
     * <br>Note that this is the default value according to the schema.  System
     * <br>administrator defaults and lockdown are not visible via this API.
     * @return the default value for the key
    */
    public ch.bailu.gtk.glib.Variant getDefaultValue()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaSettingsSchemaKey.INST().g_settings_schema_key_get_default_value(asCPointer())));
    }

    /**
     * Gets the description for &#64;key.
     * <br>
     * <br>If no description has been provided in the schema for &#64;key, returns
     * <br>%NULL.
     * <br>
     * <br>The description can be one sentence to several paragraphs in length.
     * <br>Paragraphs are delimited with a double newline.  Descriptions can be
     * <br>translated and the value returned from this function is is the
     * <br>current locale.
     * <br>
     * <br>This function is slow.  The summary and description information for
     * <br>the schemas is not stored in the compiled schema database so this
     * <br>function has to parse all of the source XML files in the schema
     * <br>directory.
     * @return the description for &#64;key, or %NULL
    */
    public ch.bailu.gtk.type.Str getDescription()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSettingsSchemaKey.INST().g_settings_schema_key_get_description(asCPointer())));
    }

    /**
     * Gets the name of &#64;key.
     * @return the name of &#64;key.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSettingsSchemaKey.INST().g_settings_schema_key_get_name(asCPointer())));
    }

    /**
     * Queries the range of a key.
     * <br>
     * <br>This function will return a &#35;GVariant that fully describes the range
     * <br>of values that are valid for &#64;key.
     * <br>
     * <br>The type of &#35;GVariant returned is `(sv)`. The string describes
     * <br>the type of range restriction in effect. The type and meaning of
     * <br>the value contained in the variant depends on the string.
     * <br>
     * <br>If the string is `'type'` then the variant contains an empty array.
     * <br>The element type of that empty array is the expected type of value
     * <br>and all values of that type are valid.
     * <br>
     * <br>If the string is `'enum'` then the variant contains an array
     * <br>enumerating the possible values. Each item in the array is
     * <br>a possible valid value and no other values are valid.
     * <br>
     * <br>If the string is `'flags'` then the variant contains an array. Each
     * <br>item in the array is a value that may appear zero or one times in an
     * <br>array to be used as the value for this key. For example, if the
     * <br>variant contained the array `['x', 'y']` then the valid values for
     * <br>the key would be `[]`, `['x']`, `['y']`, `['x', 'y']` and
     * <br>`['y', 'x']`.
     * <br>
     * <br>Finally, if the string is `'range'` then the variant contains a pair
     * <br>of like-typed values -- the minimum and maximum permissible values
     * <br>for this key.
     * <br>
     * <br>This information should not be used by normal programs.  It is
     * <br>considered to be a hint for introspection purposes.  Normal programs
     * <br>should already know what is permitted by their own schema.  The
     * <br>format may change in any way in the future -- but particularly, new
     * <br>forms may be added to the possibilities described above.
     * <br>
     * <br>You should free the returned value with g_variant_unref() when it is
     * <br>no longer needed.
     * @return a &#35;GVariant describing the range
    */
    public ch.bailu.gtk.glib.Variant getRange()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaSettingsSchemaKey.INST().g_settings_schema_key_get_range(asCPointer())));
    }

    /**
     * Gets the summary for &#64;key.
     * <br>
     * <br>If no summary has been provided in the schema for &#64;key, returns
     * <br>%NULL.
     * <br>
     * <br>The summary is a short description of the purpose of the key; usually
     * <br>one short sentence.  Summaries can be translated and the value
     * <br>returned from this function is is the current locale.
     * <br>
     * <br>This function is slow.  The summary and description information for
     * <br>the schemas is not stored in the compiled schema database so this
     * <br>function has to parse all of the source XML files in the schema
     * <br>directory.
     * @return the summary for &#64;key, or %NULL
    */
    public ch.bailu.gtk.type.Str getSummary()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSettingsSchemaKey.INST().g_settings_schema_key_get_summary(asCPointer())));
    }

    /**
     * Gets the &#35;GVariantType of &#64;key.
     * @return the type of &#64;key
    */
    public ch.bailu.gtk.glib.VariantType getValueType()  {
        return new ch.bailu.gtk.glib.VariantType(new PointerContainer(JnaSettingsSchemaKey.INST().g_settings_schema_key_get_value_type(asCPointer())));
    }

    /**
     * Checks if the given &#64;value is within the
     * <br>permitted range for &#64;key.
     * <br>
     * <br>It is a programmer error if &#64;value is not of the correct type — you
     * <br>must check for this first.
     * @param value the value to check
     * @return %TRUE if &#64;value is valid for &#64;key
    */
    public boolean rangeCheck(@Nonnull ch.bailu.gtk.glib.Variant value)  {
        return JnaSettingsSchemaKey.INST().g_settings_schema_key_range_check(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Increase the reference count of &#64;key, returning a new reference.
     * @return a new reference to &#64;key
    */
    public SettingsSchemaKey ref()  {
        return new SettingsSchemaKey(new PointerContainer(JnaSettingsSchemaKey.INST().g_settings_schema_key_ref(asCPointer())));
    }

    /**
     * Decrease the reference count of &#64;key, possibly freeing it.
    */
    public void unref()  {
        JnaSettingsSchemaKey.INST().g_settings_schema_key_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaSettingsSchemaKey.INST().g_settings_schema_key_get_type(); 
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
