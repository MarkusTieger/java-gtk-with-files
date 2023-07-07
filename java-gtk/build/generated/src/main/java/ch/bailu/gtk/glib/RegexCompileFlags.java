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
public interface RegexCompileFlags {

    /**
     * No special options set. Since: 2.74
    */
    int DEFAULT = 0;

    /**
     * Letters in the pattern match both upper- and
     * <br>    lowercase letters. This option can be changed within a pattern
     * <br>    by a &quot;(?i)&quot; option setting.
    */
    int CASELESS = 1;

    /**
     * By default, GRegex treats the strings as consisting
     * <br>    of a single line of characters (even if it actually contains
     * <br>    newlines). The &quot;start of line&quot; metacharacter (&quot;^&quot;) matches only
     * <br>    at the start of the string, while the &quot;end of line&quot; metacharacter
     * <br>    (&quot;$&quot;) matches only at the end of the string, or before a terminating
     * <br>    newline (unless %G_REGEX_DOLLAR_ENDONLY is set). When
     * <br>    %G_REGEX_MULTILINE is set, the &quot;start of line&quot; and &quot;end of line&quot;
     * <br>    constructs match immediately following or immediately before any
     * <br>    newline in the string, respectively, as well as at the very start
     * <br>    and end. This can be changed within a pattern by a &quot;(?m)&quot; option
     * <br>    setting.
    */
    int MULTILINE = 2;

    /**
     * A dot metacharacter (&quot;.&quot;) in the pattern matches all
     * <br>    characters, including newlines. Without it, newlines are excluded.
     * <br>    This option can be changed within a pattern by a (&quot;?s&quot;) option setting.
    */
    int DOTALL = 4;

    /**
     * Whitespace data characters in the pattern are
     * <br>    totally ignored except when escaped or inside a character class.
     * <br>    Whitespace does not include the VT character (code 11). In addition,
     * <br>    characters between an unescaped &quot;&#35;&quot; outside a character class and
     * <br>    the next newline character, inclusive, are also ignored. This can
     * <br>    be changed within a pattern by a &quot;(?x)&quot; option setting.
    */
    int EXTENDED = 8;

    /**
     * The pattern is forced to be &quot;anchored&quot;, that is,
     * <br>    it is constrained to match only at the first matching point in the
     * <br>    string that is being searched. This effect can also be achieved by
     * <br>    appropriate constructs in the pattern itself such as the &quot;^&quot;
     * <br>    metacharacter.
    */
    int ANCHORED = 16;

    /**
     * A dollar metacharacter (&quot;$&quot;) in the pattern
     * <br>    matches only at the end of the string. Without this option, a
     * <br>    dollar also matches immediately before the final character if
     * <br>    it is a newline (but not before any other newlines). This option
     * <br>    is ignored if %G_REGEX_MULTILINE is set.
    */
    int DOLLAR_ENDONLY = 32;

    /**
     * Inverts the &quot;greediness&quot; of the quantifiers so that
     * <br>    they are not greedy by default, but become greedy if followed by &quot;?&quot;.
     * <br>    It can also be set by a &quot;(?U)&quot; option setting within the pattern.
    */
    int UNGREEDY = 512;

    /**
     * Usually strings must be valid UTF-8 strings, using this
     * <br>    flag they are considered as a raw sequence of bytes.
    */
    int RAW = 2048;

    /**
     * Disables the use of numbered capturing
     * <br>    parentheses in the pattern. Any opening parenthesis that is not
     * <br>    followed by &quot;?&quot; behaves as if it were followed by &quot;?:&quot; but named
     * <br>    parentheses can still be used for capturing (and they acquire numbers
     * <br>    in the usual way).
    */
    int NO_AUTO_CAPTURE = 4096;

    /**
     * Since 2.74 and the port to pcre2, requests JIT
     * <br>    compilation, which, if the just-in-time compiler is available, further
     * <br>    processes a compiled pattern into machine code that executes much
     * <br>    faster. However, it comes at the cost of extra processing before the
     * <br>    match is performed, so it is most beneficial to use this when the same
     * <br>    compiled pattern is used for matching many times. Before 2.74 this
     * <br>    option used the built-in non-JIT optimizations in pcre1.
    */
    int OPTIMIZE = 8192;

    /**
     * Limits an unanchored pattern to match before (or at) the
     * <br>    first newline. Since: 2.34
    */
    int FIRSTLINE = 262144;

    /**
     * Names used to identify capturing subpatterns need not
     * <br>    be unique. This can be helpful for certain types of pattern when it
     * <br>    is known that only one instance of the named subpattern can ever be
     * <br>    matched.
    */
    int DUPNAMES = 524288;

    /**
     * Usually any newline character or character sequence is
     * <br>    recognized. If this option is set, the only recognized newline character
     * <br>    is '&#92;r'.
    */
    int NEWLINE_CR = 1048576;

    /**
     * Usually any newline character or character sequence is
     * <br>    recognized. If this option is set, the only recognized newline character
     * <br>    is '&#92;n'.
    */
    int NEWLINE_LF = 2097152;

    /**
     * Usually any newline character or character sequence is
     * <br>    recognized. If this option is set, the only recognized newline character
     * <br>    sequence is '&#92;r&#92;n'.
    */
    int NEWLINE_CRLF = 3145728;

    /**
     * Usually any newline character or character sequence
     * <br>    is recognized. If this option is set, the only recognized newline character
     * <br>    sequences are '&#92;r', '&#92;n', and '&#92;r&#92;n'. Since: 2.34
    */
    int NEWLINE_ANYCRLF = 5242880;

    /**
     * Usually any newline character or character sequence
     * <br>    is recognised. If this option is set, then &quot;&#92;R&quot; only recognizes the newline
     * <br>   characters '&#92;r', '&#92;n' and '&#92;r&#92;n'. Since: 2.34
    */
    int BSR_ANYCRLF = 8388608;

    /**
     * Changes behaviour so that it is compatible with
     * <br>    JavaScript rather than PCRE. Since GLib 2.74 this is no longer supported,
     * <br>    as libpcre2 does not support it. Since: 2.34 Deprecated: 2.74
    */
    int JAVASCRIPT_COMPAT = 33554432;

}

/*
enumeration-type
*/
