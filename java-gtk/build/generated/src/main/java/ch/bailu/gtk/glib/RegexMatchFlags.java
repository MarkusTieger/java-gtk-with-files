/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface RegexMatchFlags {

    /**
     * No special options set. Since: 2.74
    */
    int DEFAULT = 0;

    /**
     * The pattern is forced to be &quot;anchored&quot;, that is,
     * <br>    it is constrained to match only at the first matching point in the
     * <br>    string that is being searched. This effect can also be achieved by
     * <br>    appropriate constructs in the pattern itself such as the &quot;^&quot;
     * <br>    metacharacter.
    */
    int ANCHORED = 16;

    /**
     * Specifies that first character of the string is
     * <br>    not the beginning of a line, so the circumflex metacharacter should
     * <br>    not match before it. Setting this without %G_REGEX_MULTILINE (at
     * <br>    compile time) causes circumflex never to match. This option affects
     * <br>    only the behaviour of the circumflex metacharacter, it does not
     * <br>    affect &quot;&#92;A&quot;.
    */
    int NOTBOL = 128;

    /**
     * Specifies that the end of the subject string is
     * <br>    not the end of a line, so the dollar metacharacter should not match
     * <br>    it nor (except in multiline mode) a newline immediately before it.
     * <br>    Setting this without %G_REGEX_MULTILINE (at compile time) causes
     * <br>    dollar never to match. This option affects only the behaviour of
     * <br>    the dollar metacharacter, it does not affect &quot;&#92;Z&quot; or &quot;&#92;z&quot;.
    */
    int NOTEOL = 256;

    /**
     * An empty string is not considered to be a valid
     * <br>    match if this option is set. If there are alternatives in the pattern,
     * <br>    they are tried. If all the alternatives match the empty string, the
     * <br>    entire match fails. For example, if the pattern &quot;a?b?&quot; is applied to
     * <br>    a string not beginning with &quot;a&quot; or &quot;b&quot;, it matches the empty string
     * <br>    at the start of the string. With this flag set, this match is not
     * <br>    valid, so GRegex searches further into the string for occurrences
     * <br>    of &quot;a&quot; or &quot;b&quot;.
    */
    int NOTEMPTY = 1024;

    /**
     * Turns on the partial matching feature, for more
     * <br>    documentation on partial matching see g_match_info_is_partial_match().
    */
    int PARTIAL = 32768;

    /**
     * Overrides the newline definition set when
     * <br>    creating a new &#35;GRegex, setting the '&#92;r' character as line terminator.
    */
    int NEWLINE_CR = 1048576;

    /**
     * Overrides the newline definition set when
     * <br>    creating a new &#35;GRegex, setting the '&#92;n' character as line terminator.
    */
    int NEWLINE_LF = 2097152;

    /**
     * Overrides the newline definition set when
     * <br>    creating a new &#35;GRegex, setting the '&#92;r&#92;n' characters sequence as line terminator.
    */
    int NEWLINE_CRLF = 3145728;

    /**
     * Overrides the newline definition set when
     * <br>    creating a new &#35;GRegex, any Unicode newline sequence
     * <br>    is recognised as a newline. These are '&#92;r', '&#92;n' and '&#92;rn', and the
     * <br>    single characters U+000B LINE TABULATION, U+000C FORM FEED (FF),
     * <br>    U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and
     * <br>    U+2029 PARAGRAPH SEPARATOR.
    */
    int NEWLINE_ANY = 4194304;

    /**
     * Overrides the newline definition set when
     * <br>    creating a new &#35;GRegex; any '&#92;r', '&#92;n', or '&#92;r&#92;n' character sequence
     * <br>    is recognized as a newline. Since: 2.34
    */
    int NEWLINE_ANYCRLF = 5242880;

    /**
     * Overrides the newline definition for &quot;&#92;R&quot; set when
     * <br>    creating a new &#35;GRegex; only '&#92;r', '&#92;n', or '&#92;r&#92;n' character sequences
     * <br>    are recognized as a newline by &quot;&#92;R&quot;. Since: 2.34
    */
    int BSR_ANYCRLF = 8388608;

    /**
     * Overrides the newline definition for &quot;&#92;R&quot; set when
     * <br>    creating a new &#35;GRegex; any Unicode newline character or character sequence
     * <br>    are recognized as a newline by &quot;&#92;R&quot;. These are '&#92;r', '&#92;n' and '&#92;rn', and the
     * <br>    single characters U+000B LINE TABULATION, U+000C FORM FEED (FF),
     * <br>    U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and
     * <br>    U+2029 PARAGRAPH SEPARATOR. Since: 2.34
    */
    int BSR_ANY = 16777216;

    /**
     * An alias for %G_REGEX_MATCH_PARTIAL. Since: 2.34
    */
    int PARTIAL_SOFT = 32768;

    /**
     * Turns on the partial matching feature. In contrast to
     * <br>    to %G_REGEX_MATCH_PARTIAL_SOFT, this stops matching as soon as a partial match
     * <br>    is found, without continuing to search for a possible complete match. See
     * <br>    g_match_info_is_partial_match() for more information. Since: 2.34
    */
    int PARTIAL_HARD = 134217728;

    /**
     * Like %G_REGEX_MATCH_NOTEMPTY, but only applied to
     * <br>    the start of the matched string. For anchored
     * <br>    patterns this can only happen for pattern containing &quot;&#92;K&quot;. Since: 2.34
    */
    int NOTEMPTY_ATSTART = 268435456;

}

/*
enumeration-type
*/
