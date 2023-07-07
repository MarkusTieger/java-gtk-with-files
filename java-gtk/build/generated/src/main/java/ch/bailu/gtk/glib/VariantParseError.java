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
public interface VariantParseError {

    /**
     * generic error (unused)
    */
    int FAILED = 0;

    /**
     * a non-basic &#35;GVariantType was given where a basic type was expected
    */
    int BASIC_TYPE_EXPECTED = 1;

    /**
     * cannot infer the &#35;GVariantType
    */
    int CANNOT_INFER_TYPE = 2;

    /**
     * an indefinite &#35;GVariantType was given where a definite type was expected
    */
    int DEFINITE_TYPE_EXPECTED = 3;

    /**
     * extra data after parsing finished
    */
    int INPUT_NOT_AT_END = 4;

    /**
     * invalid character in number or unicode escape
    */
    int INVALID_CHARACTER = 5;

    /**
     * not a valid &#35;GVariant format string
    */
    int INVALID_FORMAT_STRING = 6;

    /**
     * not a valid object path
    */
    int INVALID_OBJECT_PATH = 7;

    /**
     * not a valid type signature
    */
    int INVALID_SIGNATURE = 8;

    /**
     * not a valid &#35;GVariant type string
    */
    int INVALID_TYPE_STRING = 9;

    /**
     * could not find a common type for array entries
    */
    int NO_COMMON_TYPE = 10;

    /**
     * the numerical value is out of range of the given type
    */
    int NUMBER_OUT_OF_RANGE = 11;

    /**
     * the numerical value is out of range for any type
    */
    int NUMBER_TOO_BIG = 12;

    /**
     * cannot parse as variant of the specified type
    */
    int TYPE_ERROR = 13;

    /**
     * an unexpected token was encountered
    */
    int UNEXPECTED_TOKEN = 14;

    /**
     * an unknown keyword was encountered
    */
    int UNKNOWN_KEYWORD = 15;

    /**
     * unterminated string constant
    */
    int UNTERMINATED_STRING_CONSTANT = 16;

    /**
     * no value given
    */
    int VALUE_EXPECTED = 17;

    /**
     * variant was too deeply nested; &#35;GVariant is only guaranteed to handle nesting up to 64 levels (Since: 2.64)
    */
    int RECURSION = 18;

}

/*
enumeration-type
*/
