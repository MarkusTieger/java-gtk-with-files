/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/glib/struct.TestLogMsg.html">https://docs.gtk.org/glib/struct.TestLogMsg.html</a></p>
*/
public class TestLogMsg extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TestLogMsg.class.getCanonicalName());
    }

    public TestLogMsg(PointerContainer pointer) {
        super(pointer);
    }

    private JnaTestLogMsg.Fields _fields;
    
    JnaTestLogMsg.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTestLogMsg.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String LOG_TYPE = "log_type";

    /**
     * 
    */
    public void setFieldLogType(int log_type) {
        toFields().log_type = log_type;
        toFields().writeField(LOG_TYPE);
    }

    /**
     * 
    */
    public int getFieldLogType() {
       toFields().readField(LOG_TYPE);
       return toFields().log_type;
    } 

    /**
     * 
    */
    public static final String N_STRINGS = "n_strings";

    /**
     * 
    */
    public void setFieldNStrings(int n_strings) {
        toFields().n_strings = n_strings;
        toFields().writeField(N_STRINGS);
    }

    /**
     * 
    */
    public int getFieldNStrings() {
       toFields().readField(N_STRINGS);
       return toFields().n_strings;
    } 

    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
    */
    public void free()  {
        JnaTestLogMsg.INST().g_test_log_msg_free(asCPointer());
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:strings:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[FieldModel:n_nums:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:nums:java-type-not-supported:previous-field-unsupported:{G_::{c:long double*}}:{j:}]
*/
