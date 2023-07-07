/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A GMatchInfo is an opaque struct used to return information about
 * <br>matches.
 * <p><a href="https://docs.gtk.org/glib/struct.MatchInfo.html">https://docs.gtk.org/glib/struct.MatchInfo.html</a></p>
*/
public class MatchInfo extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MatchInfo.class.getCanonicalName());
    }

    public MatchInfo(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a new string containing the text in &#64;string_to_expand with
     * <br>references and escape sequences expanded. References refer to the last
     * <br>match done with &#64;string against &#64;regex and have the same syntax used by
     * <br>g_regex_replace().
     * <br>
     * <br>The &#64;string_to_expand must be UTF-8 encoded even if %G_REGEX_RAW was
     * <br>passed to g_regex_new().
     * <br>
     * <br>The backreferences are extracted from the string passed to the match
     * <br>function, so you cannot call this function after freeing the string.
     * <br>
     * <br>&#64;match_info may be %NULL in which case &#64;string_to_expand must not
     * <br>contain references. For instance &quot;foo&#92;n&quot; does not refer to an actual
     * <br>pattern and '&#92;n' merely will be replaced with &#92;n character,
     * <br>while to expand &quot;&#92;0&quot; (whole match) one needs the result of a match.
     * <br>Use g_regex_check_replacement() to find out whether &#64;string_to_expand
     * <br>contains references.
     * @param string_to_expand the string to expand
     * @return the expanded string, or %NULL if an error occurred
    */
    public ch.bailu.gtk.type.Str expandReferences(@Nonnull ch.bailu.gtk.type.Str string_to_expand) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMatchInfo.INST().g_match_info_expand_references(asCPointer(), asCPointerNotNull(string_to_expand), 0L)));
    }

    /**
     * Returns a new string containing the text in &#64;string_to_expand with
     * <br>references and escape sequences expanded. References refer to the last
     * <br>match done with &#64;string against &#64;regex and have the same syntax used by
     * <br>g_regex_replace().
     * <br>
     * <br>The &#64;string_to_expand must be UTF-8 encoded even if %G_REGEX_RAW was
     * <br>passed to g_regex_new().
     * <br>
     * <br>The backreferences are extracted from the string passed to the match
     * <br>function, so you cannot call this function after freeing the string.
     * <br>
     * <br>&#64;match_info may be %NULL in which case &#64;string_to_expand must not
     * <br>contain references. For instance &quot;foo&#92;n&quot; does not refer to an actual
     * <br>pattern and '&#92;n' merely will be replaced with &#92;n character,
     * <br>while to expand &quot;&#92;0&quot; (whole match) one needs the result of a match.
     * <br>Use g_regex_check_replacement() to find out whether &#64;string_to_expand
     * <br>contains references.
     * @param string_to_expand the string to expand
     * @return the expanded string, or %NULL if an error occurred
    */
    public ch.bailu.gtk.type.Str expandReferences(String string_to_expand) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMatchInfo.INST().g_match_info_expand_references(asCPointer(), string_to_expand, 0L)));
    }

    /**
     * Retrieves the text matching the &#64;match_num'th capturing
     * <br>parentheses. 0 is the full text of the match, 1 is the first paren
     * <br>set, 2 the second, and so on.
     * <br>
     * <br>If &#64;match_num is a valid sub pattern but it didn't match anything
     * <br>(e.g. sub pattern 1, matching &quot;b&quot; against &quot;(a)?b&quot;) then an empty
     * <br>string is returned.
     * <br>
     * <br>If the match was obtained using the DFA algorithm, that is using
     * <br>g_regex_match_all() or g_regex_match_all_full(), the retrieved
     * <br>string is not that of a set of parentheses but that of a matched
     * <br>substring. Substrings are matched in reverse order of length, so
     * <br>0 is the longest match.
     * <br>
     * <br>The string is fetched from the string passed to the match function,
     * <br>so you cannot call this function after freeing the string.
     * @param match_num number of the sub expression
     * @return The matched substring, or %NULL if an error     occurred. You have to free the string yourself
    */
    public ch.bailu.gtk.type.Str fetch(int match_num)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMatchInfo.INST().g_match_info_fetch(asCPointer(), match_num)));
    }

    /**
     * Retrieves the text matching the capturing parentheses named &#64;name.
     * <br>
     * <br>If &#64;name is a valid sub pattern name but it didn't match anything
     * <br>(e.g. sub pattern &quot;X&quot;, matching &quot;b&quot; against &quot;(?P&lt;X&gt;a)?b&quot;)
     * <br>then an empty string is returned.
     * <br>
     * <br>The string is fetched from the string passed to the match function,
     * <br>so you cannot call this function after freeing the string.
     * @param name name of the subexpression
     * @return The matched substring, or %NULL if an error     occurred. You have to free the string yourself
    */
    public ch.bailu.gtk.type.Str fetchNamed(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMatchInfo.INST().g_match_info_fetch_named(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Retrieves the text matching the capturing parentheses named &#64;name.
     * <br>
     * <br>If &#64;name is a valid sub pattern name but it didn't match anything
     * <br>(e.g. sub pattern &quot;X&quot;, matching &quot;b&quot; against &quot;(?P&lt;X&gt;a)?b&quot;)
     * <br>then an empty string is returned.
     * <br>
     * <br>The string is fetched from the string passed to the match function,
     * <br>so you cannot call this function after freeing the string.
     * @param name name of the subexpression
     * @return The matched substring, or %NULL if an error     occurred. You have to free the string yourself
    */
    public ch.bailu.gtk.type.Str fetchNamed(String name)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMatchInfo.INST().g_match_info_fetch_named(asCPointer(), name)));
    }

    /**
     * Retrieves the position in bytes of the capturing parentheses named &#64;name.
     * <br>
     * <br>If &#64;name is a valid sub pattern name but it didn't match anything
     * <br>(e.g. sub pattern &quot;X&quot;, matching &quot;b&quot; against &quot;(?P&lt;X&gt;a)?b&quot;)
     * <br>then &#64;start_pos and &#64;end_pos are set to -1 and %TRUE is returned.
     * @param name name of the subexpression
     * @param start_pos pointer to location where to store     the start position, or %NULL
     * @param end_pos pointer to location where to store     the end position, or %NULL
     * @return %TRUE if the position was fetched, %FALSE otherwise.     If the position cannot be fetched, &#64;start_pos and &#64;end_pos     are left unchanged.
    */
    public boolean fetchNamedPos(@Nonnull ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Int start_pos, @Nullable ch.bailu.gtk.type.Int end_pos)  {
        return JnaMatchInfo.INST().g_match_info_fetch_named_pos(asCPointer(), asCPointerNotNull(name), asCPointer(start_pos), asCPointer(end_pos));
    }

    /**
     * Retrieves the position in bytes of the capturing parentheses named &#64;name.
     * <br>
     * <br>If &#64;name is a valid sub pattern name but it didn't match anything
     * <br>(e.g. sub pattern &quot;X&quot;, matching &quot;b&quot; against &quot;(?P&lt;X&gt;a)?b&quot;)
     * <br>then &#64;start_pos and &#64;end_pos are set to -1 and %TRUE is returned.
     * @param name name of the subexpression
     * @param start_pos pointer to location where to store     the start position, or %NULL
     * @param end_pos pointer to location where to store     the end position, or %NULL
     * @return %TRUE if the position was fetched, %FALSE otherwise.     If the position cannot be fetched, &#64;start_pos and &#64;end_pos     are left unchanged.
    */
    public boolean fetchNamedPos(String name, @Nullable ch.bailu.gtk.type.Int start_pos, @Nullable ch.bailu.gtk.type.Int end_pos)  {
        return JnaMatchInfo.INST().g_match_info_fetch_named_pos(asCPointer(), name, asCPointer(start_pos), asCPointer(end_pos));
    }

    /**
     * Retrieves the position in bytes of the &#64;match_num'th capturing
     * <br>parentheses. 0 is the full text of the match, 1 is the first
     * <br>paren set, 2 the second, and so on.
     * <br>
     * <br>If &#64;match_num is a valid sub pattern but it didn't match anything
     * <br>(e.g. sub pattern 1, matching &quot;b&quot; against &quot;(a)?b&quot;) then &#64;start_pos
     * <br>and &#64;end_pos are set to -1 and %TRUE is returned.
     * <br>
     * <br>If the match was obtained using the DFA algorithm, that is using
     * <br>g_regex_match_all() or g_regex_match_all_full(), the retrieved
     * <br>position is not that of a set of parentheses but that of a matched
     * <br>substring. Substrings are matched in reverse order of length, so
     * <br>0 is the longest match.
     * @param match_num number of the sub expression
     * @param start_pos pointer to location where to store     the start position, or %NULL
     * @param end_pos pointer to location where to store     the end position, or %NULL
     * @return %TRUE if the position was fetched, %FALSE otherwise. If   the position cannot be fetched, &#64;start_pos and &#64;end_pos are left   unchanged
    */
    public boolean fetchPos(int match_num, @Nullable ch.bailu.gtk.type.Int start_pos, @Nullable ch.bailu.gtk.type.Int end_pos)  {
        return JnaMatchInfo.INST().g_match_info_fetch_pos(asCPointer(), match_num, asCPointer(start_pos), asCPointer(end_pos));
    }

    /**
     * If &#64;match_info is not %NULL, calls g_match_info_unref(); otherwise does
     * <br>nothing.
    */
    public void free()  {
        JnaMatchInfo.INST().g_match_info_free(asCPointer());
    }

    /**
     * Retrieves the number of matched substrings (including substring 0,
     * <br>that is the whole matched text), so 1 is returned if the pattern
     * <br>has no substrings in it and 0 is returned if the match failed.
     * <br>
     * <br>If the last match was obtained using the DFA algorithm, that is
     * <br>using g_regex_match_all() or g_regex_match_all_full(), the retrieved
     * <br>count is not that of the number of capturing parentheses but that of
     * <br>the number of matched substrings.
     * @return Number of matched substrings, or -1 if an error occurred
    */
    public int getMatchCount()  {
        return JnaMatchInfo.INST().g_match_info_get_match_count(asCPointer());
    }

    /**
     * Returns &#35;GRegex object used in &#64;match_info. It belongs to Glib
     * <br>and must not be freed. Use g_regex_ref() if you need to keep it
     * <br>after you free &#64;match_info object.
     * @return &#35;GRegex object used in &#64;match_info
    */
    public Regex getRegex()  {
        return new Regex(new PointerContainer(JnaMatchInfo.INST().g_match_info_get_regex(asCPointer())));
    }

    /**
     * Returns the string searched with &#64;match_info. This is the
     * <br>string passed to g_regex_match() or g_regex_replace() so
     * <br>you may not free it before calling this function.
     * @return the string searched with &#64;match_info
    */
    public ch.bailu.gtk.type.Str getString()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMatchInfo.INST().g_match_info_get_string(asCPointer())));
    }

    /**
     * Usually if the string passed to g_regex_match*() matches as far as
     * <br>it goes, but is too short to match the entire pattern, %FALSE is
     * <br>returned. There are circumstances where it might be helpful to
     * <br>distinguish this case from other cases in which there is no match.
     * <br>
     * <br>Consider, for example, an application where a human is required to
     * <br>type in data for a field with specific formatting requirements. An
     * <br>example might be a date in the form ddmmmyy, defined by the pattern
     * <br>&quot;^&#92;d?&#92;d(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)&#92;d&#92;d$&quot;.
     * <br>If the application sees the user’s keystrokes one by one, and can
     * <br>check that what has been typed so far is potentially valid, it is
     * <br>able to raise an error as soon as a mistake is made.
     * <br>
     * <br>GRegex supports the concept of partial matching by means of the
     * <br>%G_REGEX_MATCH_PARTIAL_SOFT and %G_REGEX_MATCH_PARTIAL_HARD flags.
     * <br>When they are used, the return code for
     * <br>g_regex_match() or g_regex_match_full() is, as usual, %TRUE
     * <br>for a complete match, %FALSE otherwise. But, when these functions
     * <br>return %FALSE, you can check if the match was partial calling
     * <br>g_match_info_is_partial_match().
     * <br>
     * <br>The difference between %G_REGEX_MATCH_PARTIAL_SOFT and
     * <br>%G_REGEX_MATCH_PARTIAL_HARD is that when a partial match is encountered
     * <br>with %G_REGEX_MATCH_PARTIAL_SOFT, matching continues to search for a
     * <br>possible complete match, while with %G_REGEX_MATCH_PARTIAL_HARD matching
     * <br>stops at the partial match.
     * <br>When both %G_REGEX_MATCH_PARTIAL_SOFT and %G_REGEX_MATCH_PARTIAL_HARD
     * <br>are set, the latter takes precedence.
     * <br>
     * <br>There were formerly some restrictions on the pattern for partial matching.
     * <br>The restrictions no longer apply.
     * <br>
     * <br>See pcrepartial(3) for more information on partial matching.
     * @return %TRUE if the match was partial, %FALSE otherwise
    */
    public boolean isPartialMatch()  {
        return JnaMatchInfo.INST().g_match_info_is_partial_match(asCPointer());
    }

    /**
     * Returns whether the previous match operation succeeded.
     * @return %TRUE if the previous match operation succeeded,   %FALSE otherwise
    */
    public boolean matches()  {
        return JnaMatchInfo.INST().g_match_info_matches(asCPointer());
    }

    /**
     * Scans for the next match using the same parameters of the previous
     * <br>call to g_regex_match_full() or g_regex_match() that returned
     * <br>&#64;match_info.
     * <br>
     * <br>The match is done on the string passed to the match function, so you
     * <br>cannot free it before calling this function.
     * @return %TRUE is the string matched, %FALSE otherwise
    */
    public boolean next() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaMatchInfo.INST().g_match_info_next(asCPointer(), 0L);
    }

    /**
     * Increases reference count of &#64;match_info by 1.
     * @return &#64;match_info
    */
    public MatchInfo ref()  {
        return new MatchInfo(new PointerContainer(JnaMatchInfo.INST().g_match_info_ref(asCPointer())));
    }

    /**
     * Decreases reference count of &#64;match_info by 1. When reference count drops
     * <br>to zero, it frees all the memory associated with the match_info structure.
    */
    public void unref()  {
        JnaMatchInfo.INST().g_match_info_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaMatchInfo.INST().g_match_info_get_type(); 
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

[MethodModel:cb-return-value-not-supported:fetchAll:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
*/
