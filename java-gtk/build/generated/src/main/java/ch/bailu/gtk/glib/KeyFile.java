/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The GKeyFile struct contains only private data
 * <br>and should not be accessed directly.
 * <p><a href="https://docs.gtk.org/glib/struct.KeyFile.html">https://docs.gtk.org/glib/struct.KeyFile.html</a></p>
*/
public class KeyFile extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(KeyFile.class.getCanonicalName());
    }

    public KeyFile(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new empty &#35;GKeyFile object. Use
     * <br>g_key_file_load_from_file(), g_key_file_load_from_data(),
     * <br>g_key_file_load_from_dirs() or g_key_file_load_from_data_dirs() to
     * <br>read an existing key file.
    */
    public KeyFile() {
        super(cast(JnaKeyFile.INST().g_key_file_new()));
    }

    /**
     * Clears all keys and groups from &#64;key_file, and decreases the
     * <br>reference count by 1. If the reference count reaches zero,
     * <br>frees the key file and all its allocated memory.
    */
    public void free()  {
        JnaKeyFile.INST().g_key_file_free(asCPointer());
    }

    /**
     * Returns the value associated with &#64;key under &#64;group_name as a
     * <br>boolean.
     * <br>
     * <br>If &#64;key cannot be found then %FALSE is returned and &#64;error is set
     * <br>to %G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the value
     * <br>associated with &#64;key cannot be interpreted as a boolean then %FALSE
     * <br>is returned and &#64;error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     * @param group_name a group name
     * @param key a key
     * @return the value associated with the key as a boolean,    or %FALSE if the key was not found or could not be parsed.
    */
    public boolean getBoolean(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_get_boolean(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), 0L);
    }

    /**
     * Returns the value associated with &#64;key under &#64;group_name as a
     * <br>boolean.
     * <br>
     * <br>If &#64;key cannot be found then %FALSE is returned and &#64;error is set
     * <br>to %G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the value
     * <br>associated with &#64;key cannot be interpreted as a boolean then %FALSE
     * <br>is returned and &#64;error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     * @param group_name a group name
     * @param key a key
     * @return the value associated with the key as a boolean,    or %FALSE if the key was not found or could not be parsed.
    */
    public boolean getBoolean(String group_name, String key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_get_boolean(asCPointer(), group_name, key, 0L);
    }

    /**
     * Returns the values associated with &#64;key under &#64;group_name as
     * <br>booleans.
     * <br>
     * <br>If &#64;key cannot be found then %NULL is returned and &#64;error is set to
     * <br>%G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the values associated
     * <br>with &#64;key cannot be interpreted as booleans then %NULL is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     * @param group_name a group name
     * @param key a key
     * @param length the number of booleans returned
     * @return     the values associated with the key as a list of booleans, or %NULL if the    key was not found or could not be parsed. The returned list of booleans    should be freed with g_free() when no longer needed.
    */
    public ch.bailu.gtk.type.Int getBooleanList(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Int64 length) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Int(new PointerContainer(JnaKeyFile.INST().g_key_file_get_boolean_list(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), asCPointerNotNull(length), 0L)));
    }

    /**
     * Returns the values associated with &#64;key under &#64;group_name as
     * <br>booleans.
     * <br>
     * <br>If &#64;key cannot be found then %NULL is returned and &#64;error is set to
     * <br>%G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the values associated
     * <br>with &#64;key cannot be interpreted as booleans then %NULL is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     * @param group_name a group name
     * @param key a key
     * @param length the number of booleans returned
     * @return     the values associated with the key as a list of booleans, or %NULL if the    key was not found or could not be parsed. The returned list of booleans    should be freed with g_free() when no longer needed.
    */
    public ch.bailu.gtk.type.Int getBooleanList(String group_name, String key, @Nonnull ch.bailu.gtk.type.Int64 length) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Int(new PointerContainer(JnaKeyFile.INST().g_key_file_get_boolean_list(asCPointer(), group_name, key, asCPointerNotNull(length), 0L)));
    }

    /**
     * Retrieves a comment above &#64;key from &#64;group_name.
     * <br>If &#64;key is %NULL then &#64;comment will be read from above
     * <br>&#64;group_name. If both &#64;key and &#64;group_name are %NULL, then
     * <br>&#64;comment will be read from above the first group in the file.
     * <br>
     * <br>Note that the returned string does not include the '&#35;' comment markers,
     * <br>but does include any whitespace after them (on each line). It includes
     * <br>the line breaks between lines, but does not include the final line break.
     * @param group_name a group name, or %NULL
     * @param key a key
     * @return a comment that should be freed with g_free()
    */
    public ch.bailu.gtk.type.Str getComment(@Nullable ch.bailu.gtk.type.Str group_name, @Nullable ch.bailu.gtk.type.Str key) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaKeyFile.INST().g_key_file_get_comment(asCPointer(), asCPointer(group_name), asCPointer(key), 0L)));
    }

    /**
     * Retrieves a comment above &#64;key from &#64;group_name.
     * <br>If &#64;key is %NULL then &#64;comment will be read from above
     * <br>&#64;group_name. If both &#64;key and &#64;group_name are %NULL, then
     * <br>&#64;comment will be read from above the first group in the file.
     * <br>
     * <br>Note that the returned string does not include the '&#35;' comment markers,
     * <br>but does include any whitespace after them (on each line). It includes
     * <br>the line breaks between lines, but does not include the final line break.
     * @param group_name a group name, or %NULL
     * @param key a key
     * @return a comment that should be freed with g_free()
    */
    public ch.bailu.gtk.type.Str getComment(String group_name, String key) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaKeyFile.INST().g_key_file_get_comment(asCPointer(), group_name, key, 0L)));
    }

    /**
     * Returns the value associated with &#64;key under &#64;group_name as a
     * <br>double. If &#64;group_name is %NULL, the start_group is used.
     * <br>
     * <br>If &#64;key cannot be found then 0.0 is returned and &#64;error is set to
     * <br>%G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the value associated
     * <br>with &#64;key cannot be interpreted as a double then 0.0 is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     * @param group_name a group name
     * @param key a key
     * @return the value associated with the key as a double, or     0.0 if the key was not found or could not be parsed.
    */
    public double getDouble(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_get_double(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), 0L);
    }

    /**
     * Returns the value associated with &#64;key under &#64;group_name as a
     * <br>double. If &#64;group_name is %NULL, the start_group is used.
     * <br>
     * <br>If &#64;key cannot be found then 0.0 is returned and &#64;error is set to
     * <br>%G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the value associated
     * <br>with &#64;key cannot be interpreted as a double then 0.0 is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     * @param group_name a group name
     * @param key a key
     * @return the value associated with the key as a double, or     0.0 if the key was not found or could not be parsed.
    */
    public double getDouble(String group_name, String key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_get_double(asCPointer(), group_name, key, 0L);
    }

    /**
     * Returns the values associated with &#64;key under &#64;group_name as
     * <br>doubles.
     * <br>
     * <br>If &#64;key cannot be found then %NULL is returned and &#64;error is set to
     * <br>%G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the values associated
     * <br>with &#64;key cannot be interpreted as doubles then %NULL is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     * @param group_name a group name
     * @param key a key
     * @param length the number of doubles returned
     * @return      the values associated with the key as a list of doubles, or %NULL if the     key was not found or could not be parsed. The returned list of doubles     should be freed with g_free() when no longer needed.
    */
    public ch.bailu.gtk.type.Dbl getDoubleList(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Int64 length) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Dbl(new PointerContainer(JnaKeyFile.INST().g_key_file_get_double_list(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), asCPointerNotNull(length), 0L)));
    }

    /**
     * Returns the values associated with &#64;key under &#64;group_name as
     * <br>doubles.
     * <br>
     * <br>If &#64;key cannot be found then %NULL is returned and &#64;error is set to
     * <br>%G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the values associated
     * <br>with &#64;key cannot be interpreted as doubles then %NULL is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     * @param group_name a group name
     * @param key a key
     * @param length the number of doubles returned
     * @return      the values associated with the key as a list of doubles, or %NULL if the     key was not found or could not be parsed. The returned list of doubles     should be freed with g_free() when no longer needed.
    */
    public ch.bailu.gtk.type.Dbl getDoubleList(String group_name, String key, @Nonnull ch.bailu.gtk.type.Int64 length) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Dbl(new PointerContainer(JnaKeyFile.INST().g_key_file_get_double_list(asCPointer(), group_name, key, asCPointerNotNull(length), 0L)));
    }

    /**
     * Returns the value associated with &#64;key under &#64;group_name as a signed
     * <br>64-bit integer. This is similar to g_key_file_get_integer() but can return
     * <br>64-bit results without truncation.
     * @param group_name a non-%NULL group name
     * @param key a non-%NULL key
     * @return the value associated with the key as a signed 64-bit integer, or 0 if the key was not found or could not be parsed.
    */
    public long getInt64(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_get_int64(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), 0L);
    }

    /**
     * Returns the value associated with &#64;key under &#64;group_name as a signed
     * <br>64-bit integer. This is similar to g_key_file_get_integer() but can return
     * <br>64-bit results without truncation.
     * @param group_name a non-%NULL group name
     * @param key a non-%NULL key
     * @return the value associated with the key as a signed 64-bit integer, or 0 if the key was not found or could not be parsed.
    */
    public long getInt64(String group_name, String key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_get_int64(asCPointer(), group_name, key, 0L);
    }

    /**
     * Returns the value associated with &#64;key under &#64;group_name as an
     * <br>integer.
     * <br>
     * <br>If &#64;key cannot be found then 0 is returned and &#64;error is set to
     * <br>%G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the value associated
     * <br>with &#64;key cannot be interpreted as an integer, or is out of range
     * <br>for a &#35;gint, then 0 is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     * @param group_name a group name
     * @param key a key
     * @return the value associated with the key as an integer, or     0 if the key was not found or could not be parsed.
    */
    public int getInteger(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_get_integer(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), 0L);
    }

    /**
     * Returns the value associated with &#64;key under &#64;group_name as an
     * <br>integer.
     * <br>
     * <br>If &#64;key cannot be found then 0 is returned and &#64;error is set to
     * <br>%G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the value associated
     * <br>with &#64;key cannot be interpreted as an integer, or is out of range
     * <br>for a &#35;gint, then 0 is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     * @param group_name a group name
     * @param key a key
     * @return the value associated with the key as an integer, or     0 if the key was not found or could not be parsed.
    */
    public int getInteger(String group_name, String key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_get_integer(asCPointer(), group_name, key, 0L);
    }

    /**
     * Returns the values associated with &#64;key under &#64;group_name as
     * <br>integers.
     * <br>
     * <br>If &#64;key cannot be found then %NULL is returned and &#64;error is set to
     * <br>%G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the values associated
     * <br>with &#64;key cannot be interpreted as integers, or are out of range for
     * <br>&#35;gint, then %NULL is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     * @param group_name a group name
     * @param key a key
     * @param length the number of integers returned
     * @return      the values associated with the key as a list of integers, or %NULL if     the key was not found or could not be parsed. The returned list of     integers should be freed with g_free() when no longer needed.
    */
    public ch.bailu.gtk.type.Int getIntegerList(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Int64 length) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Int(new PointerContainer(JnaKeyFile.INST().g_key_file_get_integer_list(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), asCPointerNotNull(length), 0L)));
    }

    /**
     * Returns the values associated with &#64;key under &#64;group_name as
     * <br>integers.
     * <br>
     * <br>If &#64;key cannot be found then %NULL is returned and &#64;error is set to
     * <br>%G_KEY_FILE_ERROR_KEY_NOT_FOUND. Likewise, if the values associated
     * <br>with &#64;key cannot be interpreted as integers, or are out of range for
     * <br>&#35;gint, then %NULL is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_INVALID_VALUE.
     * @param group_name a group name
     * @param key a key
     * @param length the number of integers returned
     * @return      the values associated with the key as a list of integers, or %NULL if     the key was not found or could not be parsed. The returned list of     integers should be freed with g_free() when no longer needed.
    */
    public ch.bailu.gtk.type.Int getIntegerList(String group_name, String key, @Nonnull ch.bailu.gtk.type.Int64 length) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Int(new PointerContainer(JnaKeyFile.INST().g_key_file_get_integer_list(asCPointer(), group_name, key, asCPointerNotNull(length), 0L)));
    }

    /**
     * Returns the actual locale which the result of
     * <br>g_key_file_get_locale_string() or g_key_file_get_locale_string_list()
     * <br>came from.
     * <br>
     * <br>If calling g_key_file_get_locale_string() or
     * <br>g_key_file_get_locale_string_list() with exactly the same &#64;key_file,
     * <br>&#64;group_name, &#64;key and &#64;locale, the result of those functions will
     * <br>have originally been tagged with the locale that is the result of
     * <br>this function.
     * @param group_name a group name
     * @param key a key
     * @param locale a locale identifier or %NULL
     * @return the locale from the file, or %NULL if the key was not   found or the entry in the file was was untranslated
    */
    public ch.bailu.gtk.type.Str getLocaleForKey(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, @Nullable ch.bailu.gtk.type.Str locale)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaKeyFile.INST().g_key_file_get_locale_for_key(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), asCPointer(locale))));
    }

    /**
     * Returns the actual locale which the result of
     * <br>g_key_file_get_locale_string() or g_key_file_get_locale_string_list()
     * <br>came from.
     * <br>
     * <br>If calling g_key_file_get_locale_string() or
     * <br>g_key_file_get_locale_string_list() with exactly the same &#64;key_file,
     * <br>&#64;group_name, &#64;key and &#64;locale, the result of those functions will
     * <br>have originally been tagged with the locale that is the result of
     * <br>this function.
     * @param group_name a group name
     * @param key a key
     * @param locale a locale identifier or %NULL
     * @return the locale from the file, or %NULL if the key was not   found or the entry in the file was was untranslated
    */
    public ch.bailu.gtk.type.Str getLocaleForKey(String group_name, String key, String locale)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaKeyFile.INST().g_key_file_get_locale_for_key(asCPointer(), group_name, key, locale)));
    }

    /**
     * Returns the value associated with &#64;key under &#64;group_name
     * <br>translated in the given &#64;locale if available.  If &#64;locale is
     * <br>%NULL then the current locale is assumed.
     * <br>
     * <br>If &#64;locale is to be non-%NULL, or if the current locale will change over
     * <br>the lifetime of the &#35;GKeyFile, it must be loaded with
     * <br>%G_KEY_FILE_KEEP_TRANSLATIONS in order to load strings for all locales.
     * <br>
     * <br>If &#64;key cannot be found then %NULL is returned and &#64;error is set
     * <br>to %G_KEY_FILE_ERROR_KEY_NOT_FOUND. If the value associated
     * <br>with &#64;key cannot be interpreted or no suitable translation can
     * <br>be found then the untranslated value is returned.
     * @param group_name a group name
     * @param key a key
     * @param locale a locale identifier or %NULL
     * @return a newly allocated string or %NULL if the specified   key cannot be found.
    */
    public ch.bailu.gtk.type.Str getLocaleString(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, @Nullable ch.bailu.gtk.type.Str locale) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaKeyFile.INST().g_key_file_get_locale_string(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), asCPointer(locale), 0L)));
    }

    /**
     * Returns the value associated with &#64;key under &#64;group_name
     * <br>translated in the given &#64;locale if available.  If &#64;locale is
     * <br>%NULL then the current locale is assumed.
     * <br>
     * <br>If &#64;locale is to be non-%NULL, or if the current locale will change over
     * <br>the lifetime of the &#35;GKeyFile, it must be loaded with
     * <br>%G_KEY_FILE_KEEP_TRANSLATIONS in order to load strings for all locales.
     * <br>
     * <br>If &#64;key cannot be found then %NULL is returned and &#64;error is set
     * <br>to %G_KEY_FILE_ERROR_KEY_NOT_FOUND. If the value associated
     * <br>with &#64;key cannot be interpreted or no suitable translation can
     * <br>be found then the untranslated value is returned.
     * @param group_name a group name
     * @param key a key
     * @param locale a locale identifier or %NULL
     * @return a newly allocated string or %NULL if the specified   key cannot be found.
    */
    public ch.bailu.gtk.type.Str getLocaleString(String group_name, String key, String locale) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaKeyFile.INST().g_key_file_get_locale_string(asCPointer(), group_name, key, locale, 0L)));
    }

    /**
     * Returns the name of the start group of the file.
     * @return The start group of the key file.
    */
    public ch.bailu.gtk.type.Str getStartGroup()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaKeyFile.INST().g_key_file_get_start_group(asCPointer())));
    }

    /**
     * Returns the string value associated with &#64;key under &#64;group_name.
     * <br>Unlike g_key_file_get_value(), this function handles escape sequences
     * <br>like &#92;s.
     * <br>
     * <br>In the event the key cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_KEY_FILE_ERROR_KEY_NOT_FOUND.  In the
     * <br>event that the &#64;group_name cannot be found, %NULL is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_GROUP_NOT_FOUND.
     * @param group_name a group name
     * @param key a key
     * @return a newly allocated string or %NULL if the specified   key cannot be found.
    */
    public ch.bailu.gtk.type.Str getString(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaKeyFile.INST().g_key_file_get_string(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), 0L)));
    }

    /**
     * Returns the string value associated with &#64;key under &#64;group_name.
     * <br>Unlike g_key_file_get_value(), this function handles escape sequences
     * <br>like &#92;s.
     * <br>
     * <br>In the event the key cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_KEY_FILE_ERROR_KEY_NOT_FOUND.  In the
     * <br>event that the &#64;group_name cannot be found, %NULL is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_GROUP_NOT_FOUND.
     * @param group_name a group name
     * @param key a key
     * @return a newly allocated string or %NULL if the specified   key cannot be found.
    */
    public ch.bailu.gtk.type.Str getString(String group_name, String key) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaKeyFile.INST().g_key_file_get_string(asCPointer(), group_name, key, 0L)));
    }

    /**
     * Returns the value associated with &#64;key under &#64;group_name as an unsigned
     * <br>64-bit integer. This is similar to g_key_file_get_integer() but can return
     * <br>large positive results without truncation.
     * @param group_name a non-%NULL group name
     * @param key a non-%NULL key
     * @return the value associated with the key as an unsigned 64-bit integer, or 0 if the key was not found or could not be parsed.
    */
    public long getUint64(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_get_uint64(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), 0L);
    }

    /**
     * Returns the value associated with &#64;key under &#64;group_name as an unsigned
     * <br>64-bit integer. This is similar to g_key_file_get_integer() but can return
     * <br>large positive results without truncation.
     * @param group_name a non-%NULL group name
     * @param key a non-%NULL key
     * @return the value associated with the key as an unsigned 64-bit integer, or 0 if the key was not found or could not be parsed.
    */
    public long getUint64(String group_name, String key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_get_uint64(asCPointer(), group_name, key, 0L);
    }

    /**
     * Returns the raw value associated with &#64;key under &#64;group_name.
     * <br>Use g_key_file_get_string() to retrieve an unescaped UTF-8 string.
     * <br>
     * <br>In the event the key cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_KEY_FILE_ERROR_KEY_NOT_FOUND.  In the
     * <br>event that the &#64;group_name cannot be found, %NULL is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_GROUP_NOT_FOUND.
     * @param group_name a group name
     * @param key a key
     * @return a newly allocated string or %NULL if the specified  key cannot be found.
    */
    public ch.bailu.gtk.type.Str getValue(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaKeyFile.INST().g_key_file_get_value(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), 0L)));
    }

    /**
     * Returns the raw value associated with &#64;key under &#64;group_name.
     * <br>Use g_key_file_get_string() to retrieve an unescaped UTF-8 string.
     * <br>
     * <br>In the event the key cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_KEY_FILE_ERROR_KEY_NOT_FOUND.  In the
     * <br>event that the &#64;group_name cannot be found, %NULL is returned
     * <br>and &#64;error is set to %G_KEY_FILE_ERROR_GROUP_NOT_FOUND.
     * @param group_name a group name
     * @param key a key
     * @return a newly allocated string or %NULL if the specified  key cannot be found.
    */
    public ch.bailu.gtk.type.Str getValue(String group_name, String key) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaKeyFile.INST().g_key_file_get_value(asCPointer(), group_name, key, 0L)));
    }

    /**
     * Looks whether the key file has the group &#64;group_name.
     * @param group_name a group name
     * @return %TRUE if &#64;group_name is a part of &#64;key_file, %FALSE otherwise.
    */
    public boolean hasGroup(@Nonnull ch.bailu.gtk.type.Str group_name)  {
        return JnaKeyFile.INST().g_key_file_has_group(asCPointer(), asCPointerNotNull(group_name));
    }

    /**
     * Looks whether the key file has the group &#64;group_name.
     * @param group_name a group name
     * @return %TRUE if &#64;group_name is a part of &#64;key_file, %FALSE otherwise.
    */
    public boolean hasGroup(String group_name)  {
        return JnaKeyFile.INST().g_key_file_has_group(asCPointer(), group_name);
    }

    /**
     * Looks whether the key file has the key &#64;key in the group
     * <br>&#64;group_name.
     * <br>
     * <br>Note that this function does not follow the rules for &#35;GError strictly;
     * <br>the return value both carries meaning and signals an error.  To use
     * <br>this function, you must pass a &#35;GError pointer in &#64;error, and check
     * <br>whether it is not %NULL to see if an error occurred.
     * <br>
     * <br>Language bindings should use g_key_file_get_value() to test whether
     * <br>or not a key exists.
     * @param group_name a group name
     * @param key a key name
     * @return %TRUE if &#64;key is a part of &#64;group_name, %FALSE otherwise
    */
    public boolean hasKey(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_has_key(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), 0L);
    }

    /**
     * Looks whether the key file has the key &#64;key in the group
     * <br>&#64;group_name.
     * <br>
     * <br>Note that this function does not follow the rules for &#35;GError strictly;
     * <br>the return value both carries meaning and signals an error.  To use
     * <br>this function, you must pass a &#35;GError pointer in &#64;error, and check
     * <br>whether it is not %NULL to see if an error occurred.
     * <br>
     * <br>Language bindings should use g_key_file_get_value() to test whether
     * <br>or not a key exists.
     * @param group_name a group name
     * @param key a key name
     * @return %TRUE if &#64;key is a part of &#64;group_name, %FALSE otherwise
    */
    public boolean hasKey(String group_name, String key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_has_key(asCPointer(), group_name, key, 0L);
    }

    /**
     * Loads a key file from the data in &#64;bytes into an empty &#35;GKeyFile structure.
     * <br>If the object cannot be created then %error is set to a &#35;GKeyFileError.
     * @param bytes a &#35;GBytes
     * @param flags flags from &#35;GKeyFileFlags
     * @return %TRUE if a key file could be loaded, %FALSE otherwise
    */
    public boolean loadFromBytes(@Nonnull Bytes bytes, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_load_from_bytes(asCPointer(), asCPointerNotNull(bytes), flags, 0L);
    }

    /**
     * Loads a key file from memory into an empty &#35;GKeyFile structure.
     * <br>If the object cannot be created then %error is set to a &#35;GKeyFileError.
     * @param data key file loaded in memory
     * @param length the length of &#64;data in bytes (or (gsize)-1 if data is nul-terminated)
     * @param flags flags from &#35;GKeyFileFlags
     * @return %TRUE if a key file could be loaded, %FALSE otherwise
    */
    public boolean loadFromData(@Nonnull ch.bailu.gtk.type.Str data, long length, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_load_from_data(asCPointer(), asCPointerNotNull(data), length, flags, 0L);
    }

    /**
     * Loads a key file from memory into an empty &#35;GKeyFile structure.
     * <br>If the object cannot be created then %error is set to a &#35;GKeyFileError.
     * @param data key file loaded in memory
     * @param length the length of &#64;data in bytes (or (gsize)-1 if data is nul-terminated)
     * @param flags flags from &#35;GKeyFileFlags
     * @return %TRUE if a key file could be loaded, %FALSE otherwise
    */
    public boolean loadFromData(String data, long length, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_load_from_data(asCPointer(), data, length, flags, 0L);
    }

    /**
     * Loads a key file into an empty &#35;GKeyFile structure.
     * <br>
     * <br>If the OS returns an error when opening or reading the file, a
     * <br>%G_FILE_ERROR is returned. If there is a problem parsing the file, a
     * <br>%G_KEY_FILE_ERROR is returned.
     * <br>
     * <br>This function will never return a %G_KEY_FILE_ERROR_NOT_FOUND error. If the
     * <br>&#64;file is not found, %G_FILE_ERROR_NOENT is returned.
     * @param file the path of a filename to load, in the GLib filename encoding
     * @param flags flags from &#35;GKeyFileFlags
     * @return %TRUE if a key file could be loaded, %FALSE otherwise
    */
    public boolean loadFromFile(@Nonnull ch.bailu.gtk.type.Str file, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_load_from_file(asCPointer(), asCPointerNotNull(file), flags, 0L);
    }

    /**
     * Loads a key file into an empty &#35;GKeyFile structure.
     * <br>
     * <br>If the OS returns an error when opening or reading the file, a
     * <br>%G_FILE_ERROR is returned. If there is a problem parsing the file, a
     * <br>%G_KEY_FILE_ERROR is returned.
     * <br>
     * <br>This function will never return a %G_KEY_FILE_ERROR_NOT_FOUND error. If the
     * <br>&#64;file is not found, %G_FILE_ERROR_NOENT is returned.
     * @param file the path of a filename to load, in the GLib filename encoding
     * @param flags flags from &#35;GKeyFileFlags
     * @return %TRUE if a key file could be loaded, %FALSE otherwise
    */
    public boolean loadFromFile(String file, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_load_from_file(asCPointer(), file, flags, 0L);
    }

    /**
     * Increases the reference count of &#64;key_file.
     * @return the same &#64;key_file.
    */
    public KeyFile ref()  {
        return new KeyFile(new PointerContainer(JnaKeyFile.INST().g_key_file_ref(asCPointer())));
    }

    /**
     * Removes a comment above &#64;key from &#64;group_name.
     * <br>If &#64;key is %NULL then &#64;comment will be removed above &#64;group_name.
     * <br>If both &#64;key and &#64;group_name are %NULL, then &#64;comment will
     * <br>be removed above the first group in the file.
     * @param group_name a group name, or %NULL
     * @param key a key
     * @return %TRUE if the comment was removed, %FALSE otherwise
    */
    public boolean removeComment(@Nullable ch.bailu.gtk.type.Str group_name, @Nullable ch.bailu.gtk.type.Str key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_remove_comment(asCPointer(), asCPointer(group_name), asCPointer(key), 0L);
    }

    /**
     * Removes a comment above &#64;key from &#64;group_name.
     * <br>If &#64;key is %NULL then &#64;comment will be removed above &#64;group_name.
     * <br>If both &#64;key and &#64;group_name are %NULL, then &#64;comment will
     * <br>be removed above the first group in the file.
     * @param group_name a group name, or %NULL
     * @param key a key
     * @return %TRUE if the comment was removed, %FALSE otherwise
    */
    public boolean removeComment(String group_name, String key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_remove_comment(asCPointer(), group_name, key, 0L);
    }

    /**
     * Removes the specified group, &#64;group_name,
     * <br>from the key file.
     * @param group_name a group name
     * @return %TRUE if the group was removed, %FALSE otherwise
    */
    public boolean removeGroup(@Nonnull ch.bailu.gtk.type.Str group_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_remove_group(asCPointer(), asCPointerNotNull(group_name), 0L);
    }

    /**
     * Removes the specified group, &#64;group_name,
     * <br>from the key file.
     * @param group_name a group name
     * @return %TRUE if the group was removed, %FALSE otherwise
    */
    public boolean removeGroup(String group_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_remove_group(asCPointer(), group_name, 0L);
    }

    /**
     * Removes &#64;key in &#64;group_name from the key file.
     * @param group_name a group name
     * @param key a key name to remove
     * @return %TRUE if the key was removed, %FALSE otherwise
    */
    public boolean removeKey(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_remove_key(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), 0L);
    }

    /**
     * Removes &#64;key in &#64;group_name from the key file.
     * @param group_name a group name
     * @param key a key name to remove
     * @return %TRUE if the key was removed, %FALSE otherwise
    */
    public boolean removeKey(String group_name, String key) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_remove_key(asCPointer(), group_name, key, 0L);
    }

    /**
     * Writes the contents of &#64;key_file to &#64;filename using
     * <br>g_file_set_contents(). If you need stricter guarantees about durability of
     * <br>the written file than are provided by g_file_set_contents(), use
     * <br>g_file_set_contents_full() with the return value of g_key_file_to_data().
     * <br>
     * <br>This function can fail for any of the reasons that
     * <br>g_file_set_contents() may fail.
     * @param filename the name of the file to write to
     * @return %TRUE if successful, else %FALSE with &#64;error set
    */
    public boolean saveToFile(@Nonnull ch.bailu.gtk.type.Str filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_save_to_file(asCPointer(), asCPointerNotNull(filename), 0L);
    }

    /**
     * Writes the contents of &#64;key_file to &#64;filename using
     * <br>g_file_set_contents(). If you need stricter guarantees about durability of
     * <br>the written file than are provided by g_file_set_contents(), use
     * <br>g_file_set_contents_full() with the return value of g_key_file_to_data().
     * <br>
     * <br>This function can fail for any of the reasons that
     * <br>g_file_set_contents() may fail.
     * @param filename the name of the file to write to
     * @return %TRUE if successful, else %FALSE with &#64;error set
    */
    public boolean saveToFile(String filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_save_to_file(asCPointer(), filename, 0L);
    }

    /**
     * Associates a new boolean value with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param value %TRUE or %FALSE
    */
    public void setBoolean(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, boolean value)  {
        JnaKeyFile.INST().g_key_file_set_boolean(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), value);
    }

    /**
     * Associates a new boolean value with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param value %TRUE or %FALSE
    */
    public void setBoolean(String group_name, String key, boolean value)  {
        JnaKeyFile.INST().g_key_file_set_boolean(asCPointer(), group_name, key, value);
    }

    /**
     * Associates a list of boolean values with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * <br>If &#64;group_name is %NULL, the start_group is used.
     * @param group_name a group name
     * @param key a key
     * @param list an array of boolean values
     * @param length length of &#64;list
    */
    public void setBooleanList(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Int list, long length)  {
        JnaKeyFile.INST().g_key_file_set_boolean_list(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), asCPointerNotNull(list), length);
    }

    /**
     * Associates a list of boolean values with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * <br>If &#64;group_name is %NULL, the start_group is used.
     * @param group_name a group name
     * @param key a key
     * @param list an array of boolean values
     * @param length length of &#64;list
    */
    public void setBooleanList(String group_name, String key, @Nonnull ch.bailu.gtk.type.Int list, long length)  {
        JnaKeyFile.INST().g_key_file_set_boolean_list(asCPointer(), group_name, key, asCPointerNotNull(list), length);
    }

    /**
     * Places a comment above &#64;key from &#64;group_name.
     * <br>
     * <br>If &#64;key is %NULL then &#64;comment will be written above &#64;group_name.
     * <br>If both &#64;key and &#64;group_name  are %NULL, then &#64;comment will be
     * <br>written above the first group in the file.
     * <br>
     * <br>Note that this function prepends a '&#35;' comment marker to
     * <br>each line of &#64;comment.
     * @param group_name a group name, or %NULL
     * @param key a key
     * @param comment a comment
     * @return %TRUE if the comment was written, %FALSE otherwise
    */
    public boolean setComment(@Nullable ch.bailu.gtk.type.Str group_name, @Nullable ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Str comment) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_set_comment(asCPointer(), asCPointer(group_name), asCPointer(key), asCPointerNotNull(comment), 0L);
    }

    /**
     * Places a comment above &#64;key from &#64;group_name.
     * <br>
     * <br>If &#64;key is %NULL then &#64;comment will be written above &#64;group_name.
     * <br>If both &#64;key and &#64;group_name  are %NULL, then &#64;comment will be
     * <br>written above the first group in the file.
     * <br>
     * <br>Note that this function prepends a '&#35;' comment marker to
     * <br>each line of &#64;comment.
     * @param group_name a group name, or %NULL
     * @param key a key
     * @param comment a comment
     * @return %TRUE if the comment was written, %FALSE otherwise
    */
    public boolean setComment(String group_name, String key, String comment) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaKeyFile.INST().g_key_file_set_comment(asCPointer(), group_name, key, comment, 0L);
    }

    /**
     * Associates a new double value with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param value a double value
    */
    public void setDouble(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, double value)  {
        JnaKeyFile.INST().g_key_file_set_double(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), value);
    }

    /**
     * Associates a new double value with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param value a double value
    */
    public void setDouble(String group_name, String key, double value)  {
        JnaKeyFile.INST().g_key_file_set_double(asCPointer(), group_name, key, value);
    }

    /**
     * Associates a list of double values with &#64;key under
     * <br>&#64;group_name.  If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param list an array of double values
     * @param length number of double values in &#64;list
    */
    public void setDoubleList(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Dbl list, long length)  {
        JnaKeyFile.INST().g_key_file_set_double_list(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), asCPointerNotNull(list), length);
    }

    /**
     * Associates a list of double values with &#64;key under
     * <br>&#64;group_name.  If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param list an array of double values
     * @param length number of double values in &#64;list
    */
    public void setDoubleList(String group_name, String key, @Nonnull ch.bailu.gtk.type.Dbl list, long length)  {
        JnaKeyFile.INST().g_key_file_set_double_list(asCPointer(), group_name, key, asCPointerNotNull(list), length);
    }

    /**
     * Associates a new integer value with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param value an integer value
    */
    public void setInt64(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, long value)  {
        JnaKeyFile.INST().g_key_file_set_int64(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), value);
    }

    /**
     * Associates a new integer value with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param value an integer value
    */
    public void setInt64(String group_name, String key, long value)  {
        JnaKeyFile.INST().g_key_file_set_int64(asCPointer(), group_name, key, value);
    }

    /**
     * Associates a new integer value with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param value an integer value
    */
    public void setInteger(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, int value)  {
        JnaKeyFile.INST().g_key_file_set_integer(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), value);
    }

    /**
     * Associates a new integer value with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param value an integer value
    */
    public void setInteger(String group_name, String key, int value)  {
        JnaKeyFile.INST().g_key_file_set_integer(asCPointer(), group_name, key, value);
    }

    /**
     * Associates a list of integer values with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param list an array of integer values
     * @param length number of integer values in &#64;list
    */
    public void setIntegerList(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Int list, long length)  {
        JnaKeyFile.INST().g_key_file_set_integer_list(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), asCPointerNotNull(list), length);
    }

    /**
     * Associates a list of integer values with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param list an array of integer values
     * @param length number of integer values in &#64;list
    */
    public void setIntegerList(String group_name, String key, @Nonnull ch.bailu.gtk.type.Int list, long length)  {
        JnaKeyFile.INST().g_key_file_set_integer_list(asCPointer(), group_name, key, asCPointerNotNull(list), length);
    }

    /**
     * Sets the character which is used to separate
     * <br>values in lists. Typically ';' or ',' are used
     * <br>as separators. The default list separator is ';'.
     * @param separator the separator
    */
    public void setListSeparator(byte separator)  {
        JnaKeyFile.INST().g_key_file_set_list_separator(asCPointer(), separator);
    }

    /**
     * Associates a string value for &#64;key and &#64;locale under &#64;group_name.
     * <br>If the translation for &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param locale a locale identifier
     * @param string a string
    */
    public void setLocaleString(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Str locale, @Nonnull ch.bailu.gtk.type.Str string)  {
        JnaKeyFile.INST().g_key_file_set_locale_string(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), asCPointerNotNull(locale), asCPointerNotNull(string));
    }

    /**
     * Associates a string value for &#64;key and &#64;locale under &#64;group_name.
     * <br>If the translation for &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param locale a locale identifier
     * @param string a string
    */
    public void setLocaleString(String group_name, String key, String locale, String string)  {
        JnaKeyFile.INST().g_key_file_set_locale_string(asCPointer(), group_name, key, locale, string);
    }

    /**
     * Associates a new string value with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * <br>If &#64;group_name cannot be found then it is created.
     * <br>Unlike g_key_file_set_value(), this function handles characters
     * <br>that need escaping, such as newlines.
     * @param group_name a group name
     * @param key a key
     * @param string a string
    */
    public void setString(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Str string)  {
        JnaKeyFile.INST().g_key_file_set_string(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), asCPointerNotNull(string));
    }

    /**
     * Associates a new string value with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * <br>If &#64;group_name cannot be found then it is created.
     * <br>Unlike g_key_file_set_value(), this function handles characters
     * <br>that need escaping, such as newlines.
     * @param group_name a group name
     * @param key a key
     * @param string a string
    */
    public void setString(String group_name, String key, String string)  {
        JnaKeyFile.INST().g_key_file_set_string(asCPointer(), group_name, key, string);
    }

    /**
     * Associates a new integer value with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param value an integer value
    */
    public void setUint64(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, long value)  {
        JnaKeyFile.INST().g_key_file_set_uint64(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), value);
    }

    /**
     * Associates a new integer value with &#64;key under &#64;group_name.
     * <br>If &#64;key cannot be found then it is created.
     * @param group_name a group name
     * @param key a key
     * @param value an integer value
    */
    public void setUint64(String group_name, String key, long value)  {
        JnaKeyFile.INST().g_key_file_set_uint64(asCPointer(), group_name, key, value);
    }

    /**
     * Associates a new value with &#64;key under &#64;group_name.
     * <br>
     * <br>If &#64;key cannot be found then it is created. If &#64;group_name cannot
     * <br>be found then it is created. To set an UTF-8 string which may contain
     * <br>characters that need escaping (such as newlines or spaces), use
     * <br>g_key_file_set_string().
     * @param group_name a group name
     * @param key a key
     * @param value a string
    */
    public void setValue(@Nonnull ch.bailu.gtk.type.Str group_name, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Str value)  {
        JnaKeyFile.INST().g_key_file_set_value(asCPointer(), asCPointerNotNull(group_name), asCPointerNotNull(key), asCPointerNotNull(value));
    }

    /**
     * Associates a new value with &#64;key under &#64;group_name.
     * <br>
     * <br>If &#64;key cannot be found then it is created. If &#64;group_name cannot
     * <br>be found then it is created. To set an UTF-8 string which may contain
     * <br>characters that need escaping (such as newlines or spaces), use
     * <br>g_key_file_set_string().
     * @param group_name a group name
     * @param key a key
     * @param value a string
    */
    public void setValue(String group_name, String key, String value)  {
        JnaKeyFile.INST().g_key_file_set_value(asCPointer(), group_name, key, value);
    }

    /**
     * This function outputs &#64;key_file as a string.
     * <br>
     * <br>Note that this function never reports an error,
     * <br>so it is safe to pass %NULL as &#64;error.
     * @param length return location for the length of the   returned string, or %NULL
     * @return a newly allocated string holding   the contents of the &#35;GKeyFile
    */
    public ch.bailu.gtk.type.Str toData(@Nullable ch.bailu.gtk.type.Int64 length) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaKeyFile.INST().g_key_file_to_data(asCPointer(), asCPointer(length), 0L)));
    }

    /**
     * Decreases the reference count of &#64;key_file by 1. If the reference count
     * <br>reaches zero, frees the key file and all its allocated memory.
    */
    public void unref()  {
        JnaKeyFile.INST().g_key_file_unref(asCPointer());
    }

    /**
     * 
     * @return 
    */
    public static int errorQuark()  {
        return JnaKeyFile.INST().g_key_file_error_quark();
    }

    public static long getTypeID() { 
        return JnaKeyFile.INST().g_key_file_get_type(); 
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

[MethodModel:cb-return-value-not-supported:getGroups:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getKeys:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getLocaleStringList:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getStringList:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:loadFromDataDirs:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GKeyFileFlags}}:{j:int}]

[MethodModel:java-type-not-supported:java-type-not-supported:loadFromDirs:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GKeyFileFlags}}:{j:int}]

[MethodModel:java-type-not-supported:setLocaleStringList:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:java-type-not-supported:setStringList:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
*/
