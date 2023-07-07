/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface ShortcutScope {

    /**
     * Shortcuts are handled inside
     * <br>  the widget the controller belongs to.
    */
    int LOCAL = 0;

    /**
     * Shortcuts are handled by
     * <br>  the first ancestor that is a [iface&#64;ShortcutManager]
    */
    int MANAGED = 1;

    /**
     * Shortcuts are handled by
     * <br>  the root widget.
    */
    int GLOBAL = 2;

}

/*
enumeration-type
*/
