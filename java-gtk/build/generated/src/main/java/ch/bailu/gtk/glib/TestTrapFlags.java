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
public interface TestTrapFlags {

    /**
     * Default behaviour. Since: 2.74
    */
    int DEFAULT = 0;

    /**
     * Redirect stdout of the test child to
     * <br>    `/dev/null` so it cannot be observed on the console during test
     * <br>    runs. The actual output is still captured though to allow later
     * <br>    tests with g_test_trap_assert_stdout().
    */
    int SILENCE_STDOUT = 128;

    /**
     * Redirect stderr of the test child to
     * <br>    `/dev/null` so it cannot be observed on the console during test
     * <br>    runs. The actual output is still captured though to allow later
     * <br>    tests with g_test_trap_assert_stderr().
    */
    int SILENCE_STDERR = 256;

    /**
     * If this flag is given, stdin of the
     * <br>    child process is shared with stdin of its parent process.
     * <br>    It is redirected to `/dev/null` otherwise.
    */
    int INHERIT_STDIN = 512;

}

/*
enumeration-type
*/
