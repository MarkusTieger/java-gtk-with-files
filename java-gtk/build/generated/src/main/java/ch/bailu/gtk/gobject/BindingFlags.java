/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface BindingFlags {

    /**
     * The default binding; if the source property
     * <br>  changes, the target property is updated with its value.
    */
    int DEFAULT = 0;

    /**
     * Bidirectional binding; if either the
     * <br>  property of the source or the property of the target changes,
     * <br>  the other is updated.
    */
    int BIDIRECTIONAL = 1;

    /**
     * Synchronize the values of the source and
     * <br>  target properties when creating the binding; the direction of
     * <br>  the synchronization is always from the source to the target.
    */
    int SYNC_CREATE = 2;

    /**
     * If the two properties being bound are
     * <br>  booleans, setting one to %TRUE will result in the other being
     * <br>  set to %FALSE and vice versa. This flag will only work for
     * <br>  boolean properties, and cannot be used when passing custom
     * <br>  transformation functions to g_object_bind_property_full().
    */
    int INVERT_BOOLEAN = 4;

}

/*
enumeration-type
*/
