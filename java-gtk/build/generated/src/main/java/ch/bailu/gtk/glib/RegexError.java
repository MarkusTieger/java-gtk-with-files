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
public interface RegexError {

    /**
     * Compilation of the regular expression failed.
    */
    int COMPILE = 0;

    /**
     * Optimization of the regular expression failed.
    */
    int OPTIMIZE = 1;

    /**
     * Replacement failed due to an ill-formed replacement
     * <br>    string.
    */
    int REPLACE = 2;

    /**
     * The match process failed.
    */
    int MATCH = 3;

    /**
     * Internal error of the regular expression engine.
     * <br>    Since 2.16
    */
    int INTERNAL = 4;

    /**
     * &quot;&#92;&#92;&quot; at end of pattern. Since 2.16
    */
    int STRAY_BACKSLASH = 101;

    /**
     * &quot;&#92;&#92;c&quot; at end of pattern. Since 2.16
    */
    int MISSING_CONTROL_CHAR = 102;

    /**
     * Unrecognized character follows &quot;&#92;&#92;&quot;.
     * <br>    Since 2.16
    */
    int UNRECOGNIZED_ESCAPE = 103;

    /**
     * Numbers out of order in &quot;{}&quot;
     * <br>    quantifier. Since 2.16
    */
    int QUANTIFIERS_OUT_OF_ORDER = 104;

    /**
     * Number too big in &quot;{}&quot; quantifier.
     * <br>    Since 2.16
    */
    int QUANTIFIER_TOO_BIG = 105;

    /**
     * Missing terminating &quot;]&quot; for
     * <br>    character class. Since 2.16
    */
    int UNTERMINATED_CHARACTER_CLASS = 106;

    /**
     * Invalid escape sequence
     * <br>    in character class. Since 2.16
    */
    int INVALID_ESCAPE_IN_CHARACTER_CLASS = 107;

    /**
     * Range out of order in character class.
     * <br>    Since 2.16
    */
    int RANGE_OUT_OF_ORDER = 108;

    /**
     * Nothing to repeat. Since 2.16
    */
    int NOTHING_TO_REPEAT = 109;

    /**
     * Unrecognized character after &quot;(?&quot;,
     * <br>    &quot;(?&lt;&quot; or &quot;(?P&quot;. Since 2.16
    */
    int UNRECOGNIZED_CHARACTER = 112;

    /**
     * POSIX named classes are
     * <br>    supported only within a class. Since 2.16
    */
    int POSIX_NAMED_CLASS_OUTSIDE_CLASS = 113;

    /**
     * Missing terminating &quot;)&quot; or &quot;)&quot;
     * <br>    without opening &quot;(&quot;. Since 2.16
    */
    int UNMATCHED_PARENTHESIS = 114;

    /**
     * Reference to non-existent
     * <br>    subpattern. Since 2.16
    */
    int INEXISTENT_SUBPATTERN_REFERENCE = 115;

    /**
     * Missing terminating &quot;)&quot; after comment.
     * <br>    Since 2.16
    */
    int UNTERMINATED_COMMENT = 118;

    /**
     * Regular expression too large.
     * <br>    Since 2.16
    */
    int EXPRESSION_TOO_LARGE = 120;

    /**
     * Failed to get memory. Since 2.16
    */
    int MEMORY_ERROR = 121;

    /**
     * Lookbehind assertion is not
     * <br>    fixed length. Since 2.16
    */
    int VARIABLE_LENGTH_LOOKBEHIND = 125;

    /**
     * Malformed number or name after &quot;(?(&quot;.
     * <br>    Since 2.16
    */
    int MALFORMED_CONDITION = 126;

    /**
     * Conditional group contains
     * <br>    more than two branches. Since 2.16
    */
    int TOO_MANY_CONDITIONAL_BRANCHES = 127;

    /**
     * Assertion expected after &quot;(?(&quot;.
     * <br>    Since 2.16
    */
    int ASSERTION_EXPECTED = 128;

    /**
     * Unknown POSIX class name.
     * <br>    Since 2.16
    */
    int UNKNOWN_POSIX_CLASS_NAME = 130;

    /**
     * POSIX collating
     * <br>    elements are not supported. Since 2.16
    */
    int POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED = 131;

    /**
     * Character value in &quot;&#92;&#92;x{...}&quot; sequence
     * <br>    is too large. Since 2.16
    */
    int HEX_CODE_TOO_LARGE = 134;

    /**
     * Invalid condition &quot;(?(0)&quot;. Since 2.16
    */
    int INVALID_CONDITION = 135;

    /**
     * &#92;&#92;C not allowed in
     * <br>    lookbehind assertion. Since 2.16
    */
    int SINGLE_BYTE_MATCH_IN_LOOKBEHIND = 136;

    /**
     * Recursive call could loop indefinitely.
     * <br>    Since 2.16
    */
    int INFINITE_LOOP = 140;

    /**
     * Missing terminator
     * <br>    in subpattern name. Since 2.16
    */
    int MISSING_SUBPATTERN_NAME_TERMINATOR = 142;

    /**
     * Two named subpatterns have
     * <br>    the same name. Since 2.16
    */
    int DUPLICATE_SUBPATTERN_NAME = 143;

    /**
     * Malformed &quot;&#92;&#92;P&quot; or &quot;&#92;&#92;p&quot; sequence.
     * <br>    Since 2.16
    */
    int MALFORMED_PROPERTY = 146;

    /**
     * Unknown property name after &quot;&#92;&#92;P&quot; or
     * <br>    &quot;&#92;&#92;p&quot;. Since 2.16
    */
    int UNKNOWN_PROPERTY = 147;

    /**
     * Subpattern name is too long
     * <br>    (maximum 32 characters). Since 2.16
    */
    int SUBPATTERN_NAME_TOO_LONG = 148;

    /**
     * Too many named subpatterns (maximum
     * <br>    10,000). Since 2.16
    */
    int TOO_MANY_SUBPATTERNS = 149;

    /**
     * Octal value is greater than &quot;&#92;&#92;377&quot;.
     * <br>    Since 2.16
    */
    int INVALID_OCTAL_VALUE = 151;

    /**
     * &quot;DEFINE&quot; group contains more
     * <br>    than one branch. Since 2.16
    */
    int TOO_MANY_BRANCHES_IN_DEFINE = 154;

    /**
     * Repeating a &quot;DEFINE&quot; group is not allowed.
     * <br>    This error is never raised. Since: 2.16 Deprecated: 2.34
    */
    int DEFINE_REPETION = 155;

    /**
     * Inconsistent newline options.
     * <br>    Since 2.16
    */
    int INCONSISTENT_NEWLINE_OPTIONS = 156;

    /**
     * &quot;&#92;&#92;g&quot; is not followed by a braced,
     * <br>     angle-bracketed, or quoted name or number, or by a plain number. Since: 2.16
    */
    int MISSING_BACK_REFERENCE = 157;

    /**
     * relative reference must not be zero. Since: 2.34
    */
    int INVALID_RELATIVE_REFERENCE = 158;

    /**
     * the backtracing
     * <br>    control verb used does not allow an argument. Since: 2.34
    */
    int BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN = 159;

    /**
     * unknown backtracing
     * <br>    control verb. Since: 2.34
    */
    int UNKNOWN_BACKTRACKING_CONTROL_VERB = 160;

    /**
     * number is too big in escape sequence. Since: 2.34
    */
    int NUMBER_TOO_BIG = 161;

    /**
     * Missing subpattern name. Since: 2.34
    */
    int MISSING_SUBPATTERN_NAME = 162;

    /**
     * Missing digit. Since 2.34
    */
    int MISSING_DIGIT = 163;

    /**
     * In JavaScript compatibility mode,
     * <br>    &quot;[&quot; is an invalid data character. Since: 2.34
    */
    int INVALID_DATA_CHARACTER = 164;

    /**
     * different names for subpatterns of the
     * <br>    same number are not allowed. Since: 2.34
    */
    int EXTRA_SUBPATTERN_NAME = 165;

    /**
     * the backtracing control
     * <br>    verb requires an argument. Since: 2.34
    */
    int BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED = 166;

    /**
     * &quot;&#92;&#92;c&quot; must be followed by an ASCII
     * <br>    character. Since: 2.34
    */
    int INVALID_CONTROL_CHAR = 168;

    /**
     * &quot;&#92;&#92;k&quot; is not followed by a braced, angle-bracketed, or
     * <br>    quoted name. Since: 2.34
    */
    int MISSING_NAME = 169;

    /**
     * &quot;&#92;&#92;N&quot; is not supported in a class. Since: 2.34
    */
    int NOT_SUPPORTED_IN_CLASS = 171;

    /**
     * too many forward references. Since: 2.34
    */
    int TOO_MANY_FORWARD_REFERENCES = 172;

    /**
     * the name is too long in &quot;(*MARK)&quot;, &quot;(*PRUNE)&quot;,
     * <br>    &quot;(*SKIP)&quot;, or &quot;(*THEN)&quot;. Since: 2.34
    */
    int NAME_TOO_LONG = 175;

    /**
     * the character value in the &#92;&#92;u sequence is
     * <br>    too large. Since: 2.34
    */
    int CHARACTER_VALUE_TOO_LARGE = 176;

}

/*
enumeration-type
*/
