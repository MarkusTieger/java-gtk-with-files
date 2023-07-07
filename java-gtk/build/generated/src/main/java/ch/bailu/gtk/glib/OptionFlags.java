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
public interface OptionFlags {

    /**
     * No flags. Since: 2.42.
    */
    int NONE = 0;

    /**
     * The option doesn't appear in `--help` output.
    */
    int HIDDEN = 1;

    /**
     * The option appears in the main section of the
     * <br>    `--help` output, even if it is defined in a group.
    */
    int IN_MAIN = 2;

    /**
     * For options of the %G_OPTION_ARG_NONE kind, this
     * <br>    flag indicates that the sense of the option is reversed. i.e. %FALSE will
     * <br>    be stored into the argument rather than %TRUE.
    */
    int REVERSE = 4;

    /**
     * For options of the %G_OPTION_ARG_CALLBACK kind,
     * <br>    this flag indicates that the callback does not take any argument
     * <br>    (like a %G_OPTION_ARG_NONE option). Since 2.8
    */
    int NO_ARG = 8;

    /**
     * For options of the %G_OPTION_ARG_CALLBACK
     * <br>    kind, this flag indicates that the argument should be passed to the
     * <br>    callback in the GLib filename encoding rather than UTF-8. Since 2.8
    */
    int FILENAME = 16;

    /**
     * For options of the %G_OPTION_ARG_CALLBACK
     * <br>    kind, this flag indicates that the argument supply is optional.
     * <br>    If no argument is given then data of %GOptionParseFunc will be
     * <br>    set to NULL. Since 2.8
    */
    int OPTIONAL_ARG = 32;

    /**
     * This flag turns off the automatic conflict
     * <br>    resolution which prefixes long option names with `groupname-` if
     * <br>    there is a conflict. This option should only be used in situations
     * <br>    where aliasing is necessary to model some legacy commandline interface.
     * <br>    It is not safe to use this option, unless all option groups are under
     * <br>    your direct control. Since 2.8.
    */
    int NOALIAS = 64;

}

/*
enumeration-type
*/
