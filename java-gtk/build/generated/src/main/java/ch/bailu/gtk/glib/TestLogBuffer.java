/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/glib/struct.TestLogBuffer.html">https://docs.gtk.org/glib/struct.TestLogBuffer.html</a></p>
*/
public class TestLogBuffer extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TestLogBuffer.class.getCanonicalName());
    }

    public TestLogBuffer(PointerContainer pointer) {
        super(pointer);
    }

    public TestLogBuffer() {
        super(cast(JnaTestLogBuffer.allocateStructure()));
    }

    private JnaTestLogBuffer.Fields _fields;
    
    JnaTestLogBuffer.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTestLogBuffer.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String DATA = "data";

    /**
     * 
    */
    public GString getFieldData() {
       toFields().readField(DATA);
       return new GString(new PointerContainer(toFields().data));
    } 

    /**
     * 
    */
    public static final String MSGS = "msgs";

    /**
     * 
    */
    public SList getFieldMsgs() {
       toFields().readField(MSGS);
       return new SList(new PointerContainer(toFields().msgs));
    } 

    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
    */
    public void free()  {
        JnaTestLogBuffer.INST().g_test_log_buffer_free(asCPointer());
    }

    /**
     * Internal function for gtester to retrieve test log messages, no ABI guarantees provided.
     * @return 
    */
    public TestLogMsg pop()  {
        return new TestLogMsg(new PointerContainer(JnaTestLogBuffer.INST().g_test_log_buffer_pop(asCPointer())));
    }

    /**
     * Internal function for gtester to decode test log messages, no ABI guarantees provided.
     * @return 
    */
    public static TestLogBuffer _new()  {
        return new TestLogBuffer(new PointerContainer(JnaTestLogBuffer.INST().g_test_log_buffer_new()));
    }

}

/*
record-type
all-fields-supported

[MethodModel:java-type-not-supported:push:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:const guint8*}}:{j:}]
*/
