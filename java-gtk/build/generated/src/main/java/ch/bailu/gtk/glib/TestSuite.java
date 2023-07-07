/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque structure representing a test suite.
 * <p><a href="https://docs.gtk.org/glib/struct.TestSuite.html">https://docs.gtk.org/glib/struct.TestSuite.html</a></p>
*/
class TestSuite extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TestSuite.class.getCanonicalName());
    }

    public TestSuite(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Adds &#64;test_case to &#64;suite.
     * @param test_case a &#35;GTestCase
    */
    public void add(@Nonnull TestCase test_case)  {
        JnaTestSuite.INST().g_test_suite_add(asCPointer(), asCPointerNotNull(test_case));
    }

    /**
     * Adds &#64;nestedsuite to &#64;suite.
     * @param nestedsuite another &#35;GTestSuite
    */
    public void addSuite(@Nonnull TestSuite nestedsuite)  {
        JnaTestSuite.INST().g_test_suite_add_suite(asCPointer(), asCPointerNotNull(nestedsuite));
    }

    /**
     * Free the &#64;suite and all nested &#35;GTestSuites.
    */
    public void free()  {
        JnaTestSuite.INST().g_test_suite_free(asCPointer());
    }

}

/*
record-type
flag-disguised
all-fields-supported
*/
