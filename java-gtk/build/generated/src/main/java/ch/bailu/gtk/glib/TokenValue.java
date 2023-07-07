/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A union holding the value of the token.
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public class TokenValue extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TokenValue.class.getCanonicalName());
    }

    public TokenValue(PointerContainer pointer) {
        super(pointer);
    }

    private JnaTokenValue.Fields _fields;
    
    JnaTokenValue.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTokenValue.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * token symbol value
    */
    public static final String V_SYMBOL = "v_symbol";

    /**
     * token symbol value
    */
    public void setFieldVSymbol(ch.bailu.gtk.type.Pointer v_symbol) {
        toFields().v_symbol = v_symbol.asCPointer();
        toFields().writeField(V_SYMBOL);
    }

    /**
     * token symbol value
    */
    public ch.bailu.gtk.type.Pointer getFieldVSymbol() {
       toFields().readField(V_SYMBOL);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().v_symbol));
    } 

    /**
     * token identifier value
    */
    public static final String V_IDENTIFIER = "v_identifier";

    /**
     * token identifier value
    */
    public void setFieldVIdentifier(ch.bailu.gtk.type.Str v_identifier) {
        toFields().v_identifier = v_identifier.asCPointer();
        toFields().writeField(V_IDENTIFIER);
    }

    /**
     * token identifier value
    */
    public ch.bailu.gtk.type.Str getFieldVIdentifier() {
       toFields().readField(V_IDENTIFIER);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().v_identifier));
    } 

    /**
     * token binary integer value
    */
    public static final String V_BINARY = "v_binary";

    /**
     * token binary integer value
    */
    public void setFieldVBinary(long v_binary) {
        toFields().v_binary = v_binary;
        toFields().writeField(V_BINARY);
    }

    /**
     * token binary integer value
    */
    public long getFieldVBinary() {
       toFields().readField(V_BINARY);
       return toFields().v_binary;
    } 

    /**
     * octal integer value
    */
    public static final String V_OCTAL = "v_octal";

    /**
     * octal integer value
    */
    public void setFieldVOctal(long v_octal) {
        toFields().v_octal = v_octal;
        toFields().writeField(V_OCTAL);
    }

    /**
     * octal integer value
    */
    public long getFieldVOctal() {
       toFields().readField(V_OCTAL);
       return toFields().v_octal;
    } 

    /**
     * integer value
    */
    public static final String V_INT = "v_int";

    /**
     * integer value
    */
    public void setFieldVInt(long v_int) {
        toFields().v_int = v_int;
        toFields().writeField(V_INT);
    }

    /**
     * integer value
    */
    public long getFieldVInt() {
       toFields().readField(V_INT);
       return toFields().v_int;
    } 

    /**
     * 64-bit integer value
    */
    public static final String V_INT64 = "v_int64";

    /**
     * 64-bit integer value
    */
    public void setFieldVInt64(long v_int64) {
        toFields().v_int64 = v_int64;
        toFields().writeField(V_INT64);
    }

    /**
     * 64-bit integer value
    */
    public long getFieldVInt64() {
       toFields().readField(V_INT64);
       return toFields().v_int64;
    } 

    /**
     * floating point value
    */
    public static final String V_FLOAT = "v_float";

    /**
     * floating point value
    */
    public void setFieldVFloat(double v_float) {
        toFields().v_float = v_float;
        toFields().writeField(V_FLOAT);
    }

    /**
     * floating point value
    */
    public double getFieldVFloat() {
       toFields().readField(V_FLOAT);
       return toFields().v_float;
    } 

    /**
     * hex integer value
    */
    public static final String V_HEX = "v_hex";

    /**
     * hex integer value
    */
    public void setFieldVHex(long v_hex) {
        toFields().v_hex = v_hex;
        toFields().writeField(V_HEX);
    }

    /**
     * hex integer value
    */
    public long getFieldVHex() {
       toFields().readField(V_HEX);
       return toFields().v_hex;
    } 

    /**
     * string value
    */
    public static final String V_STRING = "v_string";

    /**
     * string value
    */
    public void setFieldVString(ch.bailu.gtk.type.Str v_string) {
        toFields().v_string = v_string.asCPointer();
        toFields().writeField(V_STRING);
    }

    /**
     * string value
    */
    public ch.bailu.gtk.type.Str getFieldVString() {
       toFields().readField(V_STRING);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().v_string));
    } 

    /**
     * comment value
    */
    public static final String V_COMMENT = "v_comment";

    /**
     * comment value
    */
    public void setFieldVComment(ch.bailu.gtk.type.Str v_comment) {
        toFields().v_comment = v_comment.asCPointer();
        toFields().writeField(V_COMMENT);
    }

    /**
     * comment value
    */
    public ch.bailu.gtk.type.Str getFieldVComment() {
       toFields().readField(V_COMMENT);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().v_comment));
    } 

}

/*
union-type
some-fields-unsupported

[FieldModel:v_char:java-type-not-supported:{G_::{c:guchar}}:{j:}]

[FieldModel:v_error:previous-field-unsupported:{G_::{c:guint}}:{j:int}]
*/
