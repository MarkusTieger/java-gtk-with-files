/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Structure representing a single field in a structured log entry. See
 * <br>g_log_structured() for details.
 * <br>
 * <br>Log fields may contain arbitrary values, including binary with embedded nul
 * <br>bytes. If the field contains a string, the string must be UTF-8 encoded and
 * <br>have a trailing nul byte. Otherwise, &#64;length must be set to a non-negative
 * <br>value.
 * <p><a href="https://docs.gtk.org/glib/struct.LogField.html">https://docs.gtk.org/glib/struct.LogField.html</a></p>
*/
public class LogField extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LogField.class.getCanonicalName());
    }

    public LogField(PointerContainer pointer) {
        super(pointer);
    }

    public LogField() {
        super(cast(JnaLogField.allocateStructure()));
    }

    private JnaLogField.Fields _fields;
    
    JnaLogField.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaLogField.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * field name (UTF-8 string)
    */
    public static final String KEY = "key";

    /**
     * field name (UTF-8 string)
    */
    public void setFieldKey(ch.bailu.gtk.type.Str key) {
        toFields().key = key.asCPointer();
        toFields().writeField(KEY);
    }

    /**
     * field name (UTF-8 string)
    */
    public ch.bailu.gtk.type.Str getFieldKey() {
       toFields().readField(KEY);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().key));
    } 

    /**
     * field value (arbitrary bytes)
    */
    public static final String VALUE = "value";

    /**
     * field value (arbitrary bytes)
    */
    public void setFieldValue(ch.bailu.gtk.type.Pointer value) {
        toFields().value = value.asCPointer();
        toFields().writeField(VALUE);
    }

    /**
     * field value (arbitrary bytes)
    */
    public ch.bailu.gtk.type.Pointer getFieldValue() {
       toFields().readField(VALUE);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().value));
    } 

    /**
     * length of &#64;value, in bytes, or -1 if it is nul-terminated
    */
    public static final String LENGTH = "length";

    /**
     * length of &#64;value, in bytes, or -1 if it is nul-terminated
    */
    public void setFieldLength(long length) {
        toFields().length = length;
        toFields().writeField(LENGTH);
    }

    /**
     * length of &#64;value, in bytes, or -1 if it is nul-terminated
    */
    public long getFieldLength() {
       toFields().readField(LENGTH);
       return toFields().length;
    } 

}

/*
record-type
all-fields-supported
*/
