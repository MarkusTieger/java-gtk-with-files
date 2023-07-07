/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque structure representing a test case.
 * <p><a href="https://docs.gtk.org/glib/struct.TestCase.html">https://docs.gtk.org/glib/struct.TestCase.html</a></p>
*/
class TestCase extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TestCase.class.getCanonicalName());
    }

    public TestCase(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Free the &#64;test_case.
    */
    public void free()  {
        JnaTestCase.INST().g_test_case_free(asCPointer());
    }

}

/*
record-type
flag-disguised
all-fields-supported
*/
