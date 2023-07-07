/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/glib/struct.TestConfig.html">https://docs.gtk.org/glib/struct.TestConfig.html</a></p>
*/
public class TestConfig extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TestConfig.class.getCanonicalName());
    }

    public TestConfig(PointerContainer pointer) {
        super(pointer);
    }

    public TestConfig() {
        super(cast(JnaTestConfig.allocateStructure()));
    }

    private JnaTestConfig.Fields _fields;
    
    JnaTestConfig.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTestConfig.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String TEST_INITIALIZED = "test_initialized";

    /**
     * 
    */
    public void setFieldTestInitialized(boolean test_initialized) {
        toFields().test_initialized = test_initialized;
        toFields().writeField(TEST_INITIALIZED);
    }

    /**
     * 
    */
    public boolean getFieldTestInitialized() {
       toFields().readField(TEST_INITIALIZED);
       return toFields().test_initialized;
    } 

    /**
     * 
    */
    public static final String TEST_QUICK = "test_quick";

    /**
     * 
    */
    public void setFieldTestQuick(boolean test_quick) {
        toFields().test_quick = test_quick;
        toFields().writeField(TEST_QUICK);
    }

    /**
     * 
    */
    public boolean getFieldTestQuick() {
       toFields().readField(TEST_QUICK);
       return toFields().test_quick;
    } 

    /**
     * 
    */
    public static final String TEST_PERF = "test_perf";

    /**
     * 
    */
    public void setFieldTestPerf(boolean test_perf) {
        toFields().test_perf = test_perf;
        toFields().writeField(TEST_PERF);
    }

    /**
     * 
    */
    public boolean getFieldTestPerf() {
       toFields().readField(TEST_PERF);
       return toFields().test_perf;
    } 

    /**
     * 
    */
    public static final String TEST_VERBOSE = "test_verbose";

    /**
     * 
    */
    public void setFieldTestVerbose(boolean test_verbose) {
        toFields().test_verbose = test_verbose;
        toFields().writeField(TEST_VERBOSE);
    }

    /**
     * 
    */
    public boolean getFieldTestVerbose() {
       toFields().readField(TEST_VERBOSE);
       return toFields().test_verbose;
    } 

    /**
     * 
    */
    public static final String TEST_QUIET = "test_quiet";

    /**
     * 
    */
    public void setFieldTestQuiet(boolean test_quiet) {
        toFields().test_quiet = test_quiet;
        toFields().writeField(TEST_QUIET);
    }

    /**
     * 
    */
    public boolean getFieldTestQuiet() {
       toFields().readField(TEST_QUIET);
       return toFields().test_quiet;
    } 

    /**
     * 
    */
    public static final String TEST_UNDEFINED = "test_undefined";

    /**
     * 
    */
    public void setFieldTestUndefined(boolean test_undefined) {
        toFields().test_undefined = test_undefined;
        toFields().writeField(TEST_UNDEFINED);
    }

    /**
     * 
    */
    public boolean getFieldTestUndefined() {
       toFields().readField(TEST_UNDEFINED);
       return toFields().test_undefined;
    } 

}

/*
record-type
all-fields-supported
*/
