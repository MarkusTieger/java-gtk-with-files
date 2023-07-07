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
public interface HookFlagMask {

    /**
     * set if the hook has not been destroyed
    */
    int ACTIVE = 1;

    /**
     * set if the hook is currently being run
    */
    int IN_CALL = 2;

    /**
     * A mask covering all bits reserved for
     * <br>  hook flags; see %G_HOOK_FLAG_USER_SHIFT
    */
    int MASK = 15;

}

/*
enumeration-type
*/
