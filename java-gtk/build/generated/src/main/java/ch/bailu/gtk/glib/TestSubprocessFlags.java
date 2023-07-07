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
public interface TestSubprocessFlags {

    /**
     * Default behaviour. Since: 2.74
    */
    int DEFAULT = 0;

    /**
     * If this flag is given, the child
     * <br>    process will inherit the parent's stdin. Otherwise, the child's
     * <br>    stdin is redirected to `/dev/null`.
    */
    int INHERIT_STDIN = 1;

    /**
     * If this flag is given, the child
     * <br>    process will inherit the parent's stdout. Otherwise, the child's
     * <br>    stdout will not be visible, but it will be captured to allow
     * <br>    later tests with g_test_trap_assert_stdout().
    */
    int INHERIT_STDOUT = 2;

    /**
     * If this flag is given, the child
     * <br>    process will inherit the parent's stderr. Otherwise, the child's
     * <br>    stderr will not be visible, but it will be captured to allow
     * <br>    later tests with g_test_trap_assert_stderr().
    */
    int INHERIT_STDERR = 4;

}

/*
enumeration-type
*/
