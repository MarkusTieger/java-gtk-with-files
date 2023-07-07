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
public interface BusNameOwnerFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * Allow another message bus connection to claim the name.
    */
    int ALLOW_REPLACEMENT = 1;

    /**
     * If another message bus connection owns the name and have
     * <br>specified %G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT, then take the name from the other connection.
    */
    int REPLACE = 2;

    /**
     * If another message bus connection owns the name, immediately
     * <br>return an error from g_bus_own_name() rather than entering the waiting queue for that name. (Since 2.54)
    */
    int DO_NOT_QUEUE = 4;

}

/*
enumeration-type
*/
