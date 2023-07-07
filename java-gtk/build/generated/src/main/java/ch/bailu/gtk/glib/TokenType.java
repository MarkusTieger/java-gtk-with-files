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
public interface TokenType {

    /**
     * the end of the file
    */
    int EOF = 0;

    /**
     * a '(' character
    */
    int LEFT_PAREN = 40;

    /**
     * a ')' character
    */
    int RIGHT_PAREN = 41;

    /**
     * a '{' character
    */
    int LEFT_CURLY = 123;

    /**
     * a '}' character
    */
    int RIGHT_CURLY = 125;

    /**
     * a '[' character
    */
    int LEFT_BRACE = 91;

    /**
     * a ']' character
    */
    int RIGHT_BRACE = 93;

    /**
     * a '=' character
    */
    int EQUAL_SIGN = 61;

    /**
     * a ',' character
    */
    int COMMA = 44;

    /**
     * not a token
    */
    int NONE = 256;

    /**
     * an error occurred
    */
    int ERROR = 257;

    /**
     * a character
    */
    int CHAR = 258;

    /**
     * a binary integer
    */
    int BINARY = 259;

    /**
     * an octal integer
    */
    int OCTAL = 260;

    /**
     * an integer
    */
    int INT = 261;

    /**
     * a hex integer
    */
    int HEX = 262;

    /**
     * a floating point number
    */
    int FLOAT = 263;

    /**
     * a string
    */
    int STRING = 264;

    /**
     * a symbol
    */
    int SYMBOL = 265;

    /**
     * an identifier
    */
    int IDENTIFIER = 266;

    /**
     * a null identifier
    */
    int IDENTIFIER_NULL = 267;

    /**
     * one line comment
    */
    int COMMENT_SINGLE = 268;

    /**
     * multi line comment
    */
    int COMMENT_MULTI = 269;

}

/*
enumeration-type
*/
