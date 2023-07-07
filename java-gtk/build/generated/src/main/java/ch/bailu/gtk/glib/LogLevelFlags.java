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
public interface LogLevelFlags {

    /**
     * internal flag
    */
    int FLAG_RECURSION = 1;

    /**
     * internal flag
    */
    int FLAG_FATAL = 2;

    /**
     * log level for errors, see g_error().
     * <br>    This level is also used for messages produced by g_assert().
    */
    int LEVEL_ERROR = 4;

    /**
     * log level for critical warning messages, see
     * <br>    g_critical().
     * <br>    This level is also used for messages produced by g_return_if_fail()
     * <br>    and g_return_val_if_fail().
    */
    int LEVEL_CRITICAL = 8;

    /**
     * log level for warnings, see g_warning()
    */
    int LEVEL_WARNING = 16;

    /**
     * log level for messages, see g_message()
    */
    int LEVEL_MESSAGE = 32;

    /**
     * log level for informational messages, see g_info()
    */
    int LEVEL_INFO = 64;

    /**
     * log level for debug messages, see g_debug()
    */
    int LEVEL_DEBUG = 128;

    /**
     * a mask including all log levels
    */
    int LEVEL_MASK = -4;

}

/*
enumeration-type
*/
