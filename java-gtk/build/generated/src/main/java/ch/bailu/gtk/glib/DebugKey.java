/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Associates a string with a bit flag.
 * <br>Used in g_parse_debug_string().
 * <p><a href="https://docs.gtk.org/glib/struct.DebugKey.html">https://docs.gtk.org/glib/struct.DebugKey.html</a></p>
*/
public class DebugKey extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DebugKey.class.getCanonicalName());
    }

    public DebugKey(PointerContainer pointer) {
        super(pointer);
    }

    public DebugKey() {
        super(cast(JnaDebugKey.allocateStructure()));
    }

    private JnaDebugKey.Fields _fields;
    
    JnaDebugKey.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDebugKey.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the string
    */
    public static final String KEY = "key";

    /**
     * the string
    */
    public void setFieldKey(ch.bailu.gtk.type.Str key) {
        toFields().key = key.asCPointer();
        toFields().writeField(KEY);
    }

    /**
     * the string
    */
    public ch.bailu.gtk.type.Str getFieldKey() {
       toFields().readField(KEY);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().key));
    } 

    /**
     * the flag
    */
    public static final String VALUE = "value";

    /**
     * the flag
    */
    public void setFieldValue(int value) {
        toFields().value = value;
        toFields().writeField(VALUE);
    }

    /**
     * the flag
    */
    public int getFieldValue() {
       toFields().readField(VALUE);
       return toFields().value;
    } 

}

/*
record-type
all-fields-supported
*/
