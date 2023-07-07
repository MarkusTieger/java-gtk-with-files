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
public interface DBusSubtreeFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * Method calls to objects not in the enumerated range
     * <br>                                                      will still be dispatched. This is useful if you want
     * <br>                                                      to dynamically spawn objects in the subtree.
    */
    int DISPATCH_TO_UNENUMERATED_NODES = 1;

}

/*
enumeration-type
*/
