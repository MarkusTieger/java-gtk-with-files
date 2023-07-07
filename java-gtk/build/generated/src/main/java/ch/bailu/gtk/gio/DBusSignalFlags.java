/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface DBusSignalFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * Don't actually send the AddMatch
     * <br>D-Bus call for this signal subscription.  This gives you more control
     * <br>over which match rules you add (but you must add them manually).
    */
    int NO_MATCH_RULE = 1;

    /**
     * Match first arguments that
     * <br>contain a bus or interface name with the given namespace.
    */
    int MATCH_ARG0_NAMESPACE = 2;

    /**
     * Match first arguments that
     * <br>contain an object path that is either equivalent to the given path,
     * <br>or one of the paths is a subpath of the other.
    */
    int MATCH_ARG0_PATH = 4;

}

/*
enumeration-type
*/
