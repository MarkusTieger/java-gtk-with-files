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
public interface OptionError {

    /**
     * An option was not known to the parser.
     * <br> This error will only be reported, if the parser hasn't been instructed
     * <br> to ignore unknown options, see g_option_context_set_ignore_unknown_options().
    */
    int UNKNOWN_OPTION = 0;

    /**
     * A value couldn't be parsed.
    */
    int BAD_VALUE = 1;

    /**
     * A &#35;GOptionArgFunc callback failed.
    */
    int FAILED = 2;

}

/*
enumeration-type
*/
