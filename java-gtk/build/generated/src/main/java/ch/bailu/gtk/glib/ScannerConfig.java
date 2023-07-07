/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Specifies the &#35;GScanner parser configuration. Most settings can
 * <br>be changed during the parsing phase and will affect the lexical
 * <br>parsing of the next unpeeked token.
 * <p><a href="https://docs.gtk.org/glib/struct.ScannerConfig.html">https://docs.gtk.org/glib/struct.ScannerConfig.html</a></p>
*/
public class ScannerConfig extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ScannerConfig.class.getCanonicalName());
    }

    public ScannerConfig(PointerContainer pointer) {
        super(pointer);
    }

    public ScannerConfig() {
        super(cast(JnaScannerConfig.allocateStructure()));
    }

    private JnaScannerConfig.Fields _fields;
    
    JnaScannerConfig.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaScannerConfig.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * specifies which characters should be skipped
     * <br>    by the scanner (the default is the whitespace characters: space,
     * <br>    tab, carriage-return and line-feed).
    */
    public static final String CSET_SKIP_CHARACTERS = "cset_skip_characters";

    /**
     * specifies which characters should be skipped
     * <br>    by the scanner (the default is the whitespace characters: space,
     * <br>    tab, carriage-return and line-feed).
    */
    public void setFieldCsetSkipCharacters(ch.bailu.gtk.type.Str cset_skip_characters) {
        toFields().cset_skip_characters = cset_skip_characters.asCPointer();
        toFields().writeField(CSET_SKIP_CHARACTERS);
    }

    /**
     * specifies which characters should be skipped
     * <br>    by the scanner (the default is the whitespace characters: space,
     * <br>    tab, carriage-return and line-feed).
    */
    public ch.bailu.gtk.type.Str getFieldCsetSkipCharacters() {
       toFields().readField(CSET_SKIP_CHARACTERS);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().cset_skip_characters));
    } 

    /**
     * specifies the characters which can start
     * <br>    identifiers (the default is %G_CSET_a_2_z, &quot;_&quot;, and %G_CSET_A_2_Z).
    */
    public static final String CSET_IDENTIFIER_FIRST = "cset_identifier_first";

    /**
     * specifies the characters which can start
     * <br>    identifiers (the default is %G_CSET_a_2_z, &quot;_&quot;, and %G_CSET_A_2_Z).
    */
    public void setFieldCsetIdentifierFirst(ch.bailu.gtk.type.Str cset_identifier_first) {
        toFields().cset_identifier_first = cset_identifier_first.asCPointer();
        toFields().writeField(CSET_IDENTIFIER_FIRST);
    }

    /**
     * specifies the characters which can start
     * <br>    identifiers (the default is %G_CSET_a_2_z, &quot;_&quot;, and %G_CSET_A_2_Z).
    */
    public ch.bailu.gtk.type.Str getFieldCsetIdentifierFirst() {
       toFields().readField(CSET_IDENTIFIER_FIRST);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().cset_identifier_first));
    } 

    /**
     * specifies the characters which can be used
     * <br>    in identifiers, after the first character (the default is
     * <br>    %G_CSET_a_2_z, &quot;_0123456789&quot;, %G_CSET_A_2_Z, %G_CSET_LATINS,
     * <br>    %G_CSET_LATINC).
    */
    public static final String CSET_IDENTIFIER_NTH = "cset_identifier_nth";

    /**
     * specifies the characters which can be used
     * <br>    in identifiers, after the first character (the default is
     * <br>    %G_CSET_a_2_z, &quot;_0123456789&quot;, %G_CSET_A_2_Z, %G_CSET_LATINS,
     * <br>    %G_CSET_LATINC).
    */
    public void setFieldCsetIdentifierNth(ch.bailu.gtk.type.Str cset_identifier_nth) {
        toFields().cset_identifier_nth = cset_identifier_nth.asCPointer();
        toFields().writeField(CSET_IDENTIFIER_NTH);
    }

    /**
     * specifies the characters which can be used
     * <br>    in identifiers, after the first character (the default is
     * <br>    %G_CSET_a_2_z, &quot;_0123456789&quot;, %G_CSET_A_2_Z, %G_CSET_LATINS,
     * <br>    %G_CSET_LATINC).
    */
    public ch.bailu.gtk.type.Str getFieldCsetIdentifierNth() {
       toFields().readField(CSET_IDENTIFIER_NTH);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().cset_identifier_nth));
    } 

    /**
     * specifies the characters at the start and
     * <br>    end of single-line comments. The default is &quot;&#35;&#92;n&quot; which means
     * <br>    that single-line comments start with a '&#35;' and continue until
     * <br>    a '&#92;n' (end of line).
    */
    public static final String CPAIR_COMMENT_SINGLE = "cpair_comment_single";

    /**
     * specifies the characters at the start and
     * <br>    end of single-line comments. The default is &quot;&#35;&#92;n&quot; which means
     * <br>    that single-line comments start with a '&#35;' and continue until
     * <br>    a '&#92;n' (end of line).
    */
    public void setFieldCpairCommentSingle(ch.bailu.gtk.type.Str cpair_comment_single) {
        toFields().cpair_comment_single = cpair_comment_single.asCPointer();
        toFields().writeField(CPAIR_COMMENT_SINGLE);
    }

    /**
     * specifies the characters at the start and
     * <br>    end of single-line comments. The default is &quot;&#35;&#92;n&quot; which means
     * <br>    that single-line comments start with a '&#35;' and continue until
     * <br>    a '&#92;n' (end of line).
    */
    public ch.bailu.gtk.type.Str getFieldCpairCommentSingle() {
       toFields().readField(CPAIR_COMMENT_SINGLE);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().cpair_comment_single));
    } 

    /**
     * specifies if symbols are case sensitive (the
     * <br>    default is %FALSE).
    */
    public static final String CASE_SENSITIVE = "case_sensitive";

    /**
     * specifies if symbols are case sensitive (the
     * <br>    default is %FALSE).
    */
    public void setFieldCaseSensitive(int case_sensitive) {
        toFields().case_sensitive = case_sensitive;
        toFields().writeField(CASE_SENSITIVE);
    }

    /**
     * specifies if symbols are case sensitive (the
     * <br>    default is %FALSE).
    */
    public int getFieldCaseSensitive() {
       toFields().readField(CASE_SENSITIVE);
       return toFields().case_sensitive;
    } 

    /**
     * specifies if multi-line comments are skipped
     * <br>    and not returned as tokens (the default is %TRUE).
    */
    public static final String SKIP_COMMENT_MULTI = "skip_comment_multi";

    /**
     * specifies if multi-line comments are skipped
     * <br>    and not returned as tokens (the default is %TRUE).
    */
    public void setFieldSkipCommentMulti(int skip_comment_multi) {
        toFields().skip_comment_multi = skip_comment_multi;
        toFields().writeField(SKIP_COMMENT_MULTI);
    }

    /**
     * specifies if multi-line comments are skipped
     * <br>    and not returned as tokens (the default is %TRUE).
    */
    public int getFieldSkipCommentMulti() {
       toFields().readField(SKIP_COMMENT_MULTI);
       return toFields().skip_comment_multi;
    } 

    /**
     * specifies if single-line comments are skipped
     * <br>    and not returned as tokens (the default is %TRUE).
    */
    public static final String SKIP_COMMENT_SINGLE = "skip_comment_single";

    /**
     * specifies if single-line comments are skipped
     * <br>    and not returned as tokens (the default is %TRUE).
    */
    public void setFieldSkipCommentSingle(int skip_comment_single) {
        toFields().skip_comment_single = skip_comment_single;
        toFields().writeField(SKIP_COMMENT_SINGLE);
    }

    /**
     * specifies if single-line comments are skipped
     * <br>    and not returned as tokens (the default is %TRUE).
    */
    public int getFieldSkipCommentSingle() {
       toFields().readField(SKIP_COMMENT_SINGLE);
       return toFields().skip_comment_single;
    } 

    /**
     * specifies if multi-line comments are recognized
     * <br>    (the default is %TRUE).
    */
    public static final String SCAN_COMMENT_MULTI = "scan_comment_multi";

    /**
     * specifies if multi-line comments are recognized
     * <br>    (the default is %TRUE).
    */
    public void setFieldScanCommentMulti(int scan_comment_multi) {
        toFields().scan_comment_multi = scan_comment_multi;
        toFields().writeField(SCAN_COMMENT_MULTI);
    }

    /**
     * specifies if multi-line comments are recognized
     * <br>    (the default is %TRUE).
    */
    public int getFieldScanCommentMulti() {
       toFields().readField(SCAN_COMMENT_MULTI);
       return toFields().scan_comment_multi;
    } 

    /**
     * specifies if identifiers are recognized (the
     * <br>    default is %TRUE).
    */
    public static final String SCAN_IDENTIFIER = "scan_identifier";

    /**
     * specifies if identifiers are recognized (the
     * <br>    default is %TRUE).
    */
    public void setFieldScanIdentifier(int scan_identifier) {
        toFields().scan_identifier = scan_identifier;
        toFields().writeField(SCAN_IDENTIFIER);
    }

    /**
     * specifies if identifiers are recognized (the
     * <br>    default is %TRUE).
    */
    public int getFieldScanIdentifier() {
       toFields().readField(SCAN_IDENTIFIER);
       return toFields().scan_identifier;
    } 

    /**
     * specifies if single-character
     * <br>    identifiers are recognized (the default is %FALSE).
    */
    public static final String SCAN_IDENTIFIER_1CHAR = "scan_identifier_1char";

    /**
     * specifies if single-character
     * <br>    identifiers are recognized (the default is %FALSE).
    */
    public void setFieldScanIdentifier1char(int scan_identifier_1char) {
        toFields().scan_identifier_1char = scan_identifier_1char;
        toFields().writeField(SCAN_IDENTIFIER_1CHAR);
    }

    /**
     * specifies if single-character
     * <br>    identifiers are recognized (the default is %FALSE).
    */
    public int getFieldScanIdentifier1char() {
       toFields().readField(SCAN_IDENTIFIER_1CHAR);
       return toFields().scan_identifier_1char;
    } 

    /**
     * specifies if %NULL is reported as
     * <br>    %G_TOKEN_IDENTIFIER_NULL (the default is %FALSE).
    */
    public static final String SCAN_IDENTIFIER_NULL = "scan_identifier_NULL";

    /**
     * specifies if %NULL is reported as
     * <br>    %G_TOKEN_IDENTIFIER_NULL (the default is %FALSE).
    */
    public void setFieldScanIdentifierNull(int scan_identifier_NULL) {
        toFields().scan_identifier_NULL = scan_identifier_NULL;
        toFields().writeField(SCAN_IDENTIFIER_NULL);
    }

    /**
     * specifies if %NULL is reported as
     * <br>    %G_TOKEN_IDENTIFIER_NULL (the default is %FALSE).
    */
    public int getFieldScanIdentifierNull() {
       toFields().readField(SCAN_IDENTIFIER_NULL);
       return toFields().scan_identifier_NULL;
    } 

    /**
     * specifies if symbols are recognized (the default
     * <br>    is %TRUE).
    */
    public static final String SCAN_SYMBOLS = "scan_symbols";

    /**
     * specifies if symbols are recognized (the default
     * <br>    is %TRUE).
    */
    public void setFieldScanSymbols(int scan_symbols) {
        toFields().scan_symbols = scan_symbols;
        toFields().writeField(SCAN_SYMBOLS);
    }

    /**
     * specifies if symbols are recognized (the default
     * <br>    is %TRUE).
    */
    public int getFieldScanSymbols() {
       toFields().readField(SCAN_SYMBOLS);
       return toFields().scan_symbols;
    } 

    /**
     * specifies if binary numbers are recognized (the
     * <br>    default is %FALSE).
    */
    public static final String SCAN_BINARY = "scan_binary";

    /**
     * specifies if binary numbers are recognized (the
     * <br>    default is %FALSE).
    */
    public void setFieldScanBinary(int scan_binary) {
        toFields().scan_binary = scan_binary;
        toFields().writeField(SCAN_BINARY);
    }

    /**
     * specifies if binary numbers are recognized (the
     * <br>    default is %FALSE).
    */
    public int getFieldScanBinary() {
       toFields().readField(SCAN_BINARY);
       return toFields().scan_binary;
    } 

    /**
     * specifies if octal numbers are recognized (the
     * <br>    default is %TRUE).
    */
    public static final String SCAN_OCTAL = "scan_octal";

    /**
     * specifies if octal numbers are recognized (the
     * <br>    default is %TRUE).
    */
    public void setFieldScanOctal(int scan_octal) {
        toFields().scan_octal = scan_octal;
        toFields().writeField(SCAN_OCTAL);
    }

    /**
     * specifies if octal numbers are recognized (the
     * <br>    default is %TRUE).
    */
    public int getFieldScanOctal() {
       toFields().readField(SCAN_OCTAL);
       return toFields().scan_octal;
    } 

    /**
     * specifies if floating point numbers are recognized
     * <br>    (the default is %TRUE).
    */
    public static final String SCAN_FLOAT = "scan_float";

    /**
     * specifies if floating point numbers are recognized
     * <br>    (the default is %TRUE).
    */
    public void setFieldScanFloat(int scan_float) {
        toFields().scan_float = scan_float;
        toFields().writeField(SCAN_FLOAT);
    }

    /**
     * specifies if floating point numbers are recognized
     * <br>    (the default is %TRUE).
    */
    public int getFieldScanFloat() {
       toFields().readField(SCAN_FLOAT);
       return toFields().scan_float;
    } 

    /**
     * specifies if hexadecimal numbers are recognized (the
     * <br>    default is %TRUE).
    */
    public static final String SCAN_HEX = "scan_hex";

    /**
     * specifies if hexadecimal numbers are recognized (the
     * <br>    default is %TRUE).
    */
    public void setFieldScanHex(int scan_hex) {
        toFields().scan_hex = scan_hex;
        toFields().writeField(SCAN_HEX);
    }

    /**
     * specifies if hexadecimal numbers are recognized (the
     * <br>    default is %TRUE).
    */
    public int getFieldScanHex() {
       toFields().readField(SCAN_HEX);
       return toFields().scan_hex;
    } 

    /**
     * specifies if '$' is recognized as a prefix for
     * <br>    hexadecimal numbers (the default is %FALSE).
    */
    public static final String SCAN_HEX_DOLLAR = "scan_hex_dollar";

    /**
     * specifies if '$' is recognized as a prefix for
     * <br>    hexadecimal numbers (the default is %FALSE).
    */
    public void setFieldScanHexDollar(int scan_hex_dollar) {
        toFields().scan_hex_dollar = scan_hex_dollar;
        toFields().writeField(SCAN_HEX_DOLLAR);
    }

    /**
     * specifies if '$' is recognized as a prefix for
     * <br>    hexadecimal numbers (the default is %FALSE).
    */
    public int getFieldScanHexDollar() {
       toFields().readField(SCAN_HEX_DOLLAR);
       return toFields().scan_hex_dollar;
    } 

    /**
     * specifies if strings can be enclosed in single
     * <br>    quotes (the default is %TRUE).
    */
    public static final String SCAN_STRING_SQ = "scan_string_sq";

    /**
     * specifies if strings can be enclosed in single
     * <br>    quotes (the default is %TRUE).
    */
    public void setFieldScanStringSq(int scan_string_sq) {
        toFields().scan_string_sq = scan_string_sq;
        toFields().writeField(SCAN_STRING_SQ);
    }

    /**
     * specifies if strings can be enclosed in single
     * <br>    quotes (the default is %TRUE).
    */
    public int getFieldScanStringSq() {
       toFields().readField(SCAN_STRING_SQ);
       return toFields().scan_string_sq;
    } 

    /**
     * specifies if strings can be enclosed in double
     * <br>    quotes (the default is %TRUE).
    */
    public static final String SCAN_STRING_DQ = "scan_string_dq";

    /**
     * specifies if strings can be enclosed in double
     * <br>    quotes (the default is %TRUE).
    */
    public void setFieldScanStringDq(int scan_string_dq) {
        toFields().scan_string_dq = scan_string_dq;
        toFields().writeField(SCAN_STRING_DQ);
    }

    /**
     * specifies if strings can be enclosed in double
     * <br>    quotes (the default is %TRUE).
    */
    public int getFieldScanStringDq() {
       toFields().readField(SCAN_STRING_DQ);
       return toFields().scan_string_dq;
    } 

    /**
     * specifies if binary, octal and hexadecimal numbers
     * <br>    are reported as %G_TOKEN_INT (the default is %TRUE).
    */
    public static final String NUMBERS_2_INT = "numbers_2_int";

    /**
     * specifies if binary, octal and hexadecimal numbers
     * <br>    are reported as %G_TOKEN_INT (the default is %TRUE).
    */
    public void setFieldNumbers2Int(int numbers_2_int) {
        toFields().numbers_2_int = numbers_2_int;
        toFields().writeField(NUMBERS_2_INT);
    }

    /**
     * specifies if binary, octal and hexadecimal numbers
     * <br>    are reported as %G_TOKEN_INT (the default is %TRUE).
    */
    public int getFieldNumbers2Int() {
       toFields().readField(NUMBERS_2_INT);
       return toFields().numbers_2_int;
    } 

    /**
     * specifies if all numbers are reported as %G_TOKEN_FLOAT
     * <br>    (the default is %FALSE).
    */
    public static final String INT_2_FLOAT = "int_2_float";

    /**
     * specifies if all numbers are reported as %G_TOKEN_FLOAT
     * <br>    (the default is %FALSE).
    */
    public void setFieldInt2Float(int int_2_float) {
        toFields().int_2_float = int_2_float;
        toFields().writeField(INT_2_FLOAT);
    }

    /**
     * specifies if all numbers are reported as %G_TOKEN_FLOAT
     * <br>    (the default is %FALSE).
    */
    public int getFieldInt2Float() {
       toFields().readField(INT_2_FLOAT);
       return toFields().int_2_float;
    } 

    /**
     * specifies if identifiers are reported as strings
     * <br>    (the default is %FALSE).
    */
    public static final String IDENTIFIER_2_STRING = "identifier_2_string";

    /**
     * specifies if identifiers are reported as strings
     * <br>    (the default is %FALSE).
    */
    public void setFieldIdentifier2String(int identifier_2_string) {
        toFields().identifier_2_string = identifier_2_string;
        toFields().writeField(IDENTIFIER_2_STRING);
    }

    /**
     * specifies if identifiers are reported as strings
     * <br>    (the default is %FALSE).
    */
    public int getFieldIdentifier2String() {
       toFields().readField(IDENTIFIER_2_STRING);
       return toFields().identifier_2_string;
    } 

    /**
     * specifies if characters are reported by setting
     * <br>    `token = ch` or as %G_TOKEN_CHAR (the default is %TRUE).
    */
    public static final String CHAR_2_TOKEN = "char_2_token";

    /**
     * specifies if characters are reported by setting
     * <br>    `token = ch` or as %G_TOKEN_CHAR (the default is %TRUE).
    */
    public void setFieldChar2Token(int char_2_token) {
        toFields().char_2_token = char_2_token;
        toFields().writeField(CHAR_2_TOKEN);
    }

    /**
     * specifies if characters are reported by setting
     * <br>    `token = ch` or as %G_TOKEN_CHAR (the default is %TRUE).
    */
    public int getFieldChar2Token() {
       toFields().readField(CHAR_2_TOKEN);
       return toFields().char_2_token;
    } 

    /**
     * specifies if symbols are reported by setting
     * <br>    `token = v_symbol` or as %G_TOKEN_SYMBOL (the default is %FALSE).
    */
    public static final String SYMBOL_2_TOKEN = "symbol_2_token";

    /**
     * specifies if symbols are reported by setting
     * <br>    `token = v_symbol` or as %G_TOKEN_SYMBOL (the default is %FALSE).
    */
    public void setFieldSymbol2Token(int symbol_2_token) {
        toFields().symbol_2_token = symbol_2_token;
        toFields().writeField(SYMBOL_2_TOKEN);
    }

    /**
     * specifies if symbols are reported by setting
     * <br>    `token = v_symbol` or as %G_TOKEN_SYMBOL (the default is %FALSE).
    */
    public int getFieldSymbol2Token() {
       toFields().readField(SYMBOL_2_TOKEN);
       return toFields().symbol_2_token;
    } 

    /**
     * specifies if a symbol is searched for in the
     * <br>    default scope in addition to the current scope (the default is %FALSE).
    */
    public static final String SCOPE_0_FALLBACK = "scope_0_fallback";

    /**
     * specifies if a symbol is searched for in the
     * <br>    default scope in addition to the current scope (the default is %FALSE).
    */
    public void setFieldScope0Fallback(int scope_0_fallback) {
        toFields().scope_0_fallback = scope_0_fallback;
        toFields().writeField(SCOPE_0_FALLBACK);
    }

    /**
     * specifies if a symbol is searched for in the
     * <br>    default scope in addition to the current scope (the default is %FALSE).
    */
    public int getFieldScope0Fallback() {
       toFields().readField(SCOPE_0_FALLBACK);
       return toFields().scope_0_fallback;
    } 

    /**
     * use value.v_int64 rather than v_int
    */
    public static final String STORE_INT64 = "store_int64";

    /**
     * use value.v_int64 rather than v_int
    */
    public void setFieldStoreInt64(int store_int64) {
        toFields().store_int64 = store_int64;
        toFields().writeField(STORE_INT64);
    }

    /**
     * use value.v_int64 rather than v_int
    */
    public int getFieldStoreInt64() {
       toFields().readField(STORE_INT64);
       return toFields().store_int64;
    } 

    /**
     * 
    */
    public static final String PADDING_DUMMY = "padding_dummy";

    /**
     * 
    */
    public int getFieldPaddingDummy() {
       toFields().readField(PADDING_DUMMY);
       return toFields().padding_dummy;
    } 

}

/*
record-type
all-fields-supported
*/
