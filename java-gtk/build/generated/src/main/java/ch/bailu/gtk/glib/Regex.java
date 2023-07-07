/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The g_regex_*() functions implement regular
 * <br>expression pattern matching using syntax and semantics similar to
 * <br>Perl regular expression.
 * <br>
 * <br>Some functions accept a &#64;start_position argument, setting it differs
 * <br>from just passing over a shortened string and setting %G_REGEX_MATCH_NOTBOL
 * <br>in the case of a pattern that begins with any kind of lookbehind assertion.
 * <br>For example, consider the pattern &quot;&#92;Biss&#92;B&quot; which finds occurrences of &quot;iss&quot;
 * <br>in the middle of words. (&quot;&#92;B&quot; matches only if the current position in the
 * <br>subject is not a word boundary.) When applied to the string &quot;Mississipi&quot;
 * <br>from the fourth byte, namely &quot;issipi&quot;, it does not match, because &quot;&#92;B&quot; is
 * <br>always false at the start of the subject, which is deemed to be a word
 * <br>boundary. However, if the entire string is passed , but with
 * <br>&#64;start_position set to 4, it finds the second occurrence of &quot;iss&quot; because
 * <br>it is able to look behind the starting point to discover that it is
 * <br>preceded by a letter.
 * <br>
 * <br>Note that, unless you set the %G_REGEX_RAW flag, all the strings passed
 * <br>to these functions must be encoded in UTF-8. The lengths and the positions
 * <br>inside the strings are in bytes and not in characters, so, for instance,
 * <br>&quot;&#92;xc3&#92;xa0&quot; (i.e. &quot;à&quot;) is two bytes long but it is treated as a
 * <br>single character. If you set %G_REGEX_RAW the strings can be non-valid
 * <br>UTF-8 strings and a byte is treated as a character, so &quot;&#92;xc3&#92;xa0&quot; is two
 * <br>bytes and two characters long.
 * <br>
 * <br>When matching a pattern, &quot;&#92;n&quot; matches only against a &quot;&#92;n&quot; character in
 * <br>the string, and &quot;&#92;r&quot; matches only a &quot;&#92;r&quot; character. To match any newline
 * <br>sequence use &quot;&#92;R&quot;. This particular group matches either the two-character
 * <br>sequence CR + LF (&quot;&#92;r&#92;n&quot;), or one of the single characters LF (linefeed,
 * <br>U+000A, &quot;&#92;n&quot;), VT vertical tab, U+000B, &quot;&#92;v&quot;), FF (formfeed, U+000C, &quot;&#92;f&quot;),
 * <br>CR (carriage return, U+000D, &quot;&#92;r&quot;), NEL (next line, U+0085), LS (line
 * <br>separator, U+2028), or PS (paragraph separator, U+2029).
 * <br>
 * <br>The behaviour of the dot, circumflex, and dollar metacharacters are
 * <br>affected by newline characters, the default is to recognize any newline
 * <br>character (the same characters recognized by &quot;&#92;R&quot;). This can be changed
 * <br>with %G_REGEX_NEWLINE_CR, %G_REGEX_NEWLINE_LF and %G_REGEX_NEWLINE_CRLF
 * <br>compile options, and with %G_REGEX_MATCH_NEWLINE_ANY,
 * <br>%G_REGEX_MATCH_NEWLINE_CR, %G_REGEX_MATCH_NEWLINE_LF and
 * <br>%G_REGEX_MATCH_NEWLINE_CRLF match options. These settings are also
 * <br>relevant when compiling a pattern if %G_REGEX_EXTENDED is set, and an
 * <br>unescaped &quot;&#35;&quot; outside a character class is encountered. This indicates
 * <br>a comment that lasts until after the next newline.
 * <br>
 * <br>When setting the %G_REGEX_JAVASCRIPT_COMPAT flag, pattern syntax and pattern
 * <br>matching is changed to be compatible with the way that regular expressions
 * <br>work in JavaScript. More precisely, a lonely ']' character in the pattern
 * <br>is a syntax error; the '&#92;x' escape only allows 0 to 2 hexadecimal digits, and
 * <br>you must use the '&#92;u' escape sequence with 4 hex digits to specify a unicode
 * <br>codepoint instead of '&#92;x' or 'x{....}'. If '&#92;x' or '&#92;u' are not followed by
 * <br>the specified number of hex digits, they match 'x' and 'u' literally; also
 * <br>'&#92;U' always matches 'U' instead of being an error in the pattern. Finally,
 * <br>pattern matching is modified so that back references to an unset subpattern
 * <br>group produces a match with the empty string instead of an error. See
 * <br>pcreapi(3) for more information.
 * <br>
 * <br>Creating and manipulating the same &#35;GRegex structure from different
 * <br>threads is not a problem as &#35;GRegex does not modify its internal
 * <br>state between creation and destruction, on the other hand &#35;GMatchInfo
 * <br>is not threadsafe.
 * <br>
 * <br>The regular expressions low-level functionalities are obtained through
 * <br>the excellent
 * <br>[PCRE](http://www.pcre.org/)
 * <br>library written by Philip Hazel.
 * <p><a href="https://docs.gtk.org/glib/struct.Regex.html">https://docs.gtk.org/glib/struct.Regex.html</a></p>
*/
public class Regex extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Regex.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnRegexEvalCallback {
        /**
         * Specifies the type of the function passed to g_regex_replace_eval().
         * <br>It is called for each occurrence of the pattern in the string passed
         * <br>to g_regex_replace_eval(), and it should append the replacement to
         * <br>&#64;result.
         * @param match_info the &#35;GMatchInfo generated by the match.     Use g_match_info_get_regex() and g_match_info_get_string() if you     need the &#35;GRegex or the matched string.
         * @param result a &#35;GString containing the new string
         * @param user_data user data passed to g_regex_replace_eval()
         * @return %FALSE to continue the replacement process, %TRUE to stop it
        */
        boolean onRegexEvalCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MatchInfo match_info, @Nonnull GString result, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaRegex.OnRegexEvalCallback toOnRegexEvalCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnRegexEvalCallback in) {
        JnaRegex.OnRegexEvalCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_match_info, _result, _user_data) -> in.onRegexEvalCallback(__callback, new MatchInfo(new PointerContainer(_match_info)), new GString(new PointerContainer(_result)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public Regex(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Compiles the regular expression to an internal form, and does
     * <br>the initial setup of the &#35;GRegex structure.
     * @param pattern the regular expression
     * @param compile_options compile options for the regular expression, or 0
     * @param match_options match options for the regular expression, or 0
    */
    public Regex(@Nonnull ch.bailu.gtk.type.Str pattern, int compile_options, int match_options) {
        super(cast(JnaRegex.INST().g_regex_new(asCPointerNotNull(pattern), compile_options, match_options, 0L)));
    }

    /**
     * Compiles the regular expression to an internal form, and does
     * <br>the initial setup of the &#35;GRegex structure.
     * @param pattern the regular expression
     * @param compile_options compile options for the regular expression, or 0
     * @param match_options match options for the regular expression, or 0
    */
    public Regex(String pattern, int compile_options, int match_options) {
        super(cast(JnaRegex.INST().g_regex_new(pattern, compile_options, match_options, 0L)));
    }

    /**
     * Returns the number of capturing subpatterns in the pattern.
     * @return the number of capturing subpatterns
    */
    public int getCaptureCount()  {
        return JnaRegex.INST().g_regex_get_capture_count(asCPointer());
    }

    /**
     * Returns the compile options that &#64;regex was created with.
     * <br>
     * <br>Depending on the version of PCRE that is used, this may or may not
     * <br>include flags set by option expressions such as `(?i)` found at the
     * <br>top-level within the compiled pattern.
     * @return flags from &#35;GRegexCompileFlags
    */
    public int getCompileFlags()  {
        return JnaRegex.INST().g_regex_get_compile_flags(asCPointer());
    }

    /**
     * Checks whether the pattern contains explicit CR or LF references.
     * @return %TRUE if the pattern contains explicit CR or LF references
    */
    public boolean getHasCrOrLf()  {
        return JnaRegex.INST().g_regex_get_has_cr_or_lf(asCPointer());
    }

    /**
     * Returns the match options that &#64;regex was created with.
     * @return flags from &#35;GRegexMatchFlags
    */
    public int getMatchFlags()  {
        return JnaRegex.INST().g_regex_get_match_flags(asCPointer());
    }

    /**
     * Returns the number of the highest back reference
     * <br>in the pattern, or 0 if the pattern does not contain
     * <br>back references.
     * @return the number of the highest back reference
    */
    public int getMaxBackref()  {
        return JnaRegex.INST().g_regex_get_max_backref(asCPointer());
    }

    /**
     * Gets the number of characters in the longest lookbehind assertion in the
     * <br>pattern. This information is useful when doing multi-segment matching using
     * <br>the partial matching facilities.
     * @return the number of characters in the longest lookbehind assertion.
    */
    public int getMaxLookbehind()  {
        return JnaRegex.INST().g_regex_get_max_lookbehind(asCPointer());
    }

    /**
     * Gets the pattern string associated with &#64;regex, i.e. a copy of
     * <br>the string passed to g_regex_new().
     * @return the pattern of &#64;regex
    */
    public ch.bailu.gtk.type.Str getPattern()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRegex.INST().g_regex_get_pattern(asCPointer())));
    }

    /**
     * Retrieves the number of the subexpression named &#64;name.
     * @param name name of the subexpression
     * @return The number of the subexpression or -1 if &#64;name   does not exists
    */
    public int getStringNumber(@Nonnull ch.bailu.gtk.type.Str name)  {
        return JnaRegex.INST().g_regex_get_string_number(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Retrieves the number of the subexpression named &#64;name.
     * @param name name of the subexpression
     * @return The number of the subexpression or -1 if &#64;name   does not exists
    */
    public int getStringNumber(String name)  {
        return JnaRegex.INST().g_regex_get_string_number(asCPointer(), name);
    }

    /**
     * Increases reference count of &#64;regex by 1.
     * @return &#64;regex
    */
    public Regex ref()  {
        return new Regex(new PointerContainer(JnaRegex.INST().g_regex_ref(asCPointer())));
    }

    /**
     * Replaces all occurrences of the pattern in &#64;regex with the
     * <br>replacement text. Backreferences of the form '&#92;number' or
     * <br>'&#92;g&lt;number&gt;' in the replacement text are interpolated by the
     * <br>number-th captured subexpression of the match, '&#92;g&lt;name&gt;' refers
     * <br>to the captured subexpression with the given name. '&#92;0' refers
     * <br>to the complete match, but '&#92;0' followed by a number is the octal
     * <br>representation of a character. To include a literal '&#92;' in the
     * <br>replacement, write '&#92;&#92;&#92;&#92;'.
     * <br>
     * <br>There are also escapes that changes the case of the following text:
     * <br>
     * <br>- &#92;l: Convert to lower case the next character
     * <br>- &#92;u: Convert to upper case the next character
     * <br>- &#92;L: Convert to lower case till &#92;E
     * <br>- &#92;U: Convert to upper case till &#92;E
     * <br>- &#92;E: End case modification
     * <br>
     * <br>If you do not need to use backreferences use g_regex_replace_literal().
     * <br>
     * <br>The &#64;replacement string must be UTF-8 encoded even if %G_REGEX_RAW was
     * <br>passed to g_regex_new(). If you want to use not UTF-8 encoded strings
     * <br>you can use g_regex_replace_literal().
     * <br>
     * <br>Setting &#64;start_position differs from just passing over a shortened
     * <br>string and setting %G_REGEX_MATCH_NOTBOL in the case of a pattern that
     * <br>begins with any kind of lookbehind assertion, such as &quot;&#92;b&quot;.
     * @param string the string to perform matches against
     * @param string_len the length of &#64;string, in bytes, or -1 if &#64;string is nul-terminated
     * @param start_position starting index of the string to match, in bytes
     * @param replacement text to replace each match with
     * @param match_options options for the match
     * @return a newly allocated string containing the replacements
    */
    public ch.bailu.gtk.type.Str replace(@Nonnull ch.bailu.gtk.type.Str string, long string_len, int start_position, @Nonnull ch.bailu.gtk.type.Str replacement, int match_options) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRegex.INST().g_regex_replace(asCPointer(), asCPointerNotNull(string), string_len, start_position, asCPointerNotNull(replacement), match_options, 0L)));
    }

    /**
     * Replaces all occurrences of the pattern in &#64;regex with the
     * <br>replacement text. Backreferences of the form '&#92;number' or
     * <br>'&#92;g&lt;number&gt;' in the replacement text are interpolated by the
     * <br>number-th captured subexpression of the match, '&#92;g&lt;name&gt;' refers
     * <br>to the captured subexpression with the given name. '&#92;0' refers
     * <br>to the complete match, but '&#92;0' followed by a number is the octal
     * <br>representation of a character. To include a literal '&#92;' in the
     * <br>replacement, write '&#92;&#92;&#92;&#92;'.
     * <br>
     * <br>There are also escapes that changes the case of the following text:
     * <br>
     * <br>- &#92;l: Convert to lower case the next character
     * <br>- &#92;u: Convert to upper case the next character
     * <br>- &#92;L: Convert to lower case till &#92;E
     * <br>- &#92;U: Convert to upper case till &#92;E
     * <br>- &#92;E: End case modification
     * <br>
     * <br>If you do not need to use backreferences use g_regex_replace_literal().
     * <br>
     * <br>The &#64;replacement string must be UTF-8 encoded even if %G_REGEX_RAW was
     * <br>passed to g_regex_new(). If you want to use not UTF-8 encoded strings
     * <br>you can use g_regex_replace_literal().
     * <br>
     * <br>Setting &#64;start_position differs from just passing over a shortened
     * <br>string and setting %G_REGEX_MATCH_NOTBOL in the case of a pattern that
     * <br>begins with any kind of lookbehind assertion, such as &quot;&#92;b&quot;.
     * @param string the string to perform matches against
     * @param string_len the length of &#64;string, in bytes, or -1 if &#64;string is nul-terminated
     * @param start_position starting index of the string to match, in bytes
     * @param replacement text to replace each match with
     * @param match_options options for the match
     * @return a newly allocated string containing the replacements
    */
    public ch.bailu.gtk.type.Str replace(String string, long string_len, int start_position, String replacement, int match_options) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRegex.INST().g_regex_replace(asCPointer(), string, string_len, start_position, replacement, match_options, 0L)));
    }

    /**
     * Replaces occurrences of the pattern in regex with the output of
     * <br>&#64;eval for that occurrence.
     * <br>
     * <br>Setting &#64;start_position differs from just passing over a shortened
     * <br>string and setting %G_REGEX_MATCH_NOTBOL in the case of a pattern
     * <br>that begins with any kind of lookbehind assertion, such as &quot;&#92;b&quot;.
     * <br>
     * <br>The following example uses g_regex_replace_eval() to replace multiple
     * <br>strings at once:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * static gboolean
     * eval_cb (const GMatchInfo *info,
     *          GString          *res,
     *          gpointer          data)
     * {
     *   gchar *match;
     *   gchar *r;
     * 
     *    match = g_match_info_fetch (info, 0);
     *    r = g_hash_table_lookup ((GHashTable *)data, match);
     *    g_string_append (res, r);
     *    g_free (match);
     * 
     *    return FALSE;
     * }
     * 
     * ...
     * 
     * GRegex *reg;
     * GHashTable *h;
     * gchar *res;
     * 
     * h = g_hash_table_new (g_str_hash, g_str_equal);
     * 
     * g_hash_table_insert (h, &quot;1&quot;, &quot;ONE&quot;);
     * g_hash_table_insert (h, &quot;2&quot;, &quot;TWO&quot;);
     * g_hash_table_insert (h, &quot;3&quot;, &quot;THREE&quot;);
     * g_hash_table_insert (h, &quot;4&quot;, &quot;FOUR&quot;);
     * 
     * reg = g_regex_new (&quot;1|2|3|4&quot;, G_REGEX_DEFAULT, G_REGEX_MATCH_DEFAULT, NULL);
     * res = g_regex_replace_eval (reg, text, -1, 0, 0, eval_cb, h, NULL);
     * g_hash_table_destroy (h);
     * 
     * ...
     * </pre>
     * @param string string to perform matches against
     * @param string_len the length of &#64;string, in bytes, or -1 if &#64;string is nul-terminated
     * @param start_position starting index of the string to match, in bytes
     * @param match_options options for the match
     * @param eval a function to call for each match
     * @param user_data user data to pass to the function
     * @return a newly allocated string containing the replacements
    */
    public ch.bailu.gtk.type.Str replaceEval(@Nonnull ch.bailu.gtk.type.Str string, long string_len, int start_position, int match_options, OnRegexEvalCallback eval, @Nullable ch.bailu.gtk.type.Pointer user_data) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRegex.INST().g_regex_replace_eval(asCPointer(), asCPointerNotNull(string), string_len, start_position, match_options, toOnRegexEvalCallback(this, "replaceEval", eval), asCPointer(user_data), 0L)));
    }

    /**
     * Replaces occurrences of the pattern in regex with the output of
     * <br>&#64;eval for that occurrence.
     * <br>
     * <br>Setting &#64;start_position differs from just passing over a shortened
     * <br>string and setting %G_REGEX_MATCH_NOTBOL in the case of a pattern
     * <br>that begins with any kind of lookbehind assertion, such as &quot;&#92;b&quot;.
     * <br>
     * <br>The following example uses g_regex_replace_eval() to replace multiple
     * <br>strings at once:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * static gboolean
     * eval_cb (const GMatchInfo *info,
     *          GString          *res,
     *          gpointer          data)
     * {
     *   gchar *match;
     *   gchar *r;
     * 
     *    match = g_match_info_fetch (info, 0);
     *    r = g_hash_table_lookup ((GHashTable *)data, match);
     *    g_string_append (res, r);
     *    g_free (match);
     * 
     *    return FALSE;
     * }
     * 
     * ...
     * 
     * GRegex *reg;
     * GHashTable *h;
     * gchar *res;
     * 
     * h = g_hash_table_new (g_str_hash, g_str_equal);
     * 
     * g_hash_table_insert (h, &quot;1&quot;, &quot;ONE&quot;);
     * g_hash_table_insert (h, &quot;2&quot;, &quot;TWO&quot;);
     * g_hash_table_insert (h, &quot;3&quot;, &quot;THREE&quot;);
     * g_hash_table_insert (h, &quot;4&quot;, &quot;FOUR&quot;);
     * 
     * reg = g_regex_new (&quot;1|2|3|4&quot;, G_REGEX_DEFAULT, G_REGEX_MATCH_DEFAULT, NULL);
     * res = g_regex_replace_eval (reg, text, -1, 0, 0, eval_cb, h, NULL);
     * g_hash_table_destroy (h);
     * 
     * ...
     * </pre>
     * @param string string to perform matches against
     * @param string_len the length of &#64;string, in bytes, or -1 if &#64;string is nul-terminated
     * @param start_position starting index of the string to match, in bytes
     * @param match_options options for the match
     * @param eval a function to call for each match
     * @param user_data user data to pass to the function
     * @return a newly allocated string containing the replacements
    */
    public ch.bailu.gtk.type.Str replaceEval(String string, long string_len, int start_position, int match_options, OnRegexEvalCallback eval, @Nullable ch.bailu.gtk.type.Pointer user_data) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRegex.INST().g_regex_replace_eval(asCPointer(), string, string_len, start_position, match_options, toOnRegexEvalCallback(this, "replaceEval", eval), asCPointer(user_data), 0L)));
    }

    /**
     * Replaces all occurrences of the pattern in &#64;regex with the
     * <br>replacement text. &#64;replacement is replaced literally, to
     * <br>include backreferences use g_regex_replace().
     * <br>
     * <br>Setting &#64;start_position differs from just passing over a
     * <br>shortened string and setting %G_REGEX_MATCH_NOTBOL in the
     * <br>case of a pattern that begins with any kind of lookbehind
     * <br>assertion, such as &quot;&#92;b&quot;.
     * @param string the string to perform matches against
     * @param string_len the length of &#64;string, in bytes, or -1 if &#64;string is nul-terminated
     * @param start_position starting index of the string to match, in bytes
     * @param replacement text to replace each match with
     * @param match_options options for the match
     * @return a newly allocated string containing the replacements
    */
    public ch.bailu.gtk.type.Str replaceLiteral(@Nonnull ch.bailu.gtk.type.Str string, long string_len, int start_position, @Nonnull ch.bailu.gtk.type.Str replacement, int match_options) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRegex.INST().g_regex_replace_literal(asCPointer(), asCPointerNotNull(string), string_len, start_position, asCPointerNotNull(replacement), match_options, 0L)));
    }

    /**
     * Replaces all occurrences of the pattern in &#64;regex with the
     * <br>replacement text. &#64;replacement is replaced literally, to
     * <br>include backreferences use g_regex_replace().
     * <br>
     * <br>Setting &#64;start_position differs from just passing over a
     * <br>shortened string and setting %G_REGEX_MATCH_NOTBOL in the
     * <br>case of a pattern that begins with any kind of lookbehind
     * <br>assertion, such as &quot;&#92;b&quot;.
     * @param string the string to perform matches against
     * @param string_len the length of &#64;string, in bytes, or -1 if &#64;string is nul-terminated
     * @param start_position starting index of the string to match, in bytes
     * @param replacement text to replace each match with
     * @param match_options options for the match
     * @return a newly allocated string containing the replacements
    */
    public ch.bailu.gtk.type.Str replaceLiteral(String string, long string_len, int start_position, String replacement, int match_options) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRegex.INST().g_regex_replace_literal(asCPointer(), string, string_len, start_position, replacement, match_options, 0L)));
    }

    /**
     * Decreases reference count of &#64;regex by 1. When reference count drops
     * <br>to zero, it frees all the memory associated with the regex structure.
    */
    public void unref()  {
        JnaRegex.INST().g_regex_unref(asCPointer());
    }

    /**
     * Checks whether &#64;replacement is a valid replacement string
     * <br>(see g_regex_replace()), i.e. that all escape sequences in
     * <br>it are valid.
     * <br>
     * <br>If &#64;has_references is not %NULL then &#64;replacement is checked
     * <br>for pattern references. For instance, replacement text 'foo&#92;n'
     * <br>does not contain references and may be evaluated without information
     * <br>about actual match, but '&#92;0&#92;1' (whole match followed by first
     * <br>subpattern) requires valid &#35;GMatchInfo object.
     * @param replacement the replacement string
     * @param has_references location to store information about   references in &#64;replacement or %NULL
     * @return whether &#64;replacement is a valid replacement string
    */
    public static boolean checkReplacement(@Nonnull ch.bailu.gtk.type.Str replacement, @Nullable ch.bailu.gtk.type.Int has_references) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaRegex.INST().g_regex_check_replacement(asCPointerNotNull(replacement), asCPointer(has_references), 0L);
    }

    /**
     * 
     * @return 
    */
    public static int errorQuark()  {
        return JnaRegex.INST().g_regex_error_quark();
    }

    /**
     * Escapes the nul characters in &#64;string to &quot;&#92;x00&quot;.  It can be used
     * <br>to compile a regex with embedded nul characters.
     * <br>
     * <br>For completeness, &#64;length can be -1 for a nul-terminated string.
     * <br>In this case the output string will be of course equal to &#64;string.
     * @param string the string to escape
     * @param length the length of &#64;string
     * @return a newly-allocated escaped string
    */
    public static ch.bailu.gtk.type.Str escapeNul(@Nonnull ch.bailu.gtk.type.Str string, int length)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRegex.INST().g_regex_escape_nul(asCPointerNotNull(string), length)));
    }

    /**
     * Escapes the special characters used for regular expressions
     * <br>in &#64;string, for instance &quot;a.b*c&quot; becomes &quot;a&#92;.b&#92;*c&quot;. This
     * <br>function is useful to dynamically generate regular expressions.
     * <br>
     * <br>&#64;string can contain nul characters that are replaced with &quot;&#92;0&quot;,
     * <br>in this case remember to specify the correct length of &#64;string
     * <br>in &#64;length.
     * @param string the string to escape
     * @param length the length of &#64;string, in bytes, or -1 if &#64;string is nul-terminated
     * @return a newly-allocated escaped string
    */
    public static ch.bailu.gtk.type.Str escapeString(@Nonnull ch.bailu.gtk.type.Str string, int length)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRegex.INST().g_regex_escape_string(asCPointerNotNull(string), length)));
    }

    /**
     * Scans for a match in &#64;string for &#64;pattern.
     * <br>
     * <br>This function is equivalent to g_regex_match() but it does not
     * <br>require to compile the pattern with g_regex_new(), avoiding some
     * <br>lines of code when you need just to do a match without extracting
     * <br>substrings, capture counts, and so on.
     * <br>
     * <br>If this function is to be called on the same &#64;pattern more than
     * <br>once, it's more efficient to compile the pattern once with
     * <br>g_regex_new() and then use g_regex_match().
     * @param pattern the regular expression
     * @param string the string to scan for matches
     * @param compile_options compile options for the regular expression, or 0
     * @param match_options match options, or 0
     * @return %TRUE if the string matched, %FALSE otherwise
    */
    public static boolean matchSimple(@Nonnull ch.bailu.gtk.type.Str pattern, @Nonnull ch.bailu.gtk.type.Str string, int compile_options, int match_options)  {
        return JnaRegex.INST().g_regex_match_simple(asCPointerNotNull(pattern), asCPointerNotNull(string), compile_options, match_options);
    }

    public static long getTypeID() { 
        return JnaRegex.INST().g_regex_get_type(); 
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

[MethodModel:java-type-not-supported:match:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GRegexMatchFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GMatchInfo**}}:{j:}]

[MethodModel:java-type-not-supported:matchAll:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GRegexMatchFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GMatchInfo**}}:{j:}]

[MethodModel:java-type-not-supported:matchAllFull:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:GRegexMatchFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GMatchInfo**}}:{j:}]

[MethodModel:java-type-not-supported:matchFull:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:GRegexMatchFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GMatchInfo**}}:{j:}]

[MethodModel:cb-return-value-not-supported:split:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GRegexMatchFlags}}:{j:int}]

[MethodModel:cb-return-value-not-supported:splitFull:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:GRegexMatchFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:cb-return-value-not-supported:splitSimple:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GRegexCompileFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:GRegexMatchFlags}}:{j:int}]
*/
