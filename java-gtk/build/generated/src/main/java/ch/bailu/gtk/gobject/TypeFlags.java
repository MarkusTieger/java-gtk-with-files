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
public interface TypeFlags {

    /**
     * No special flags. Since: 2.74
    */
    int NONE = 0;

    /**
     * Indicates an abstract type. No instances can be
     * <br> created for an abstract type
    */
    int ABSTRACT = 16;

    /**
     * Indicates an abstract value type, i.e. a type
     * <br> that introduces a value table, but can't be used for
     * <br> g_value_init()
    */
    int VALUE_ABSTRACT = 32;

    /**
     * Indicates a final type. A final type is a non-derivable
     * <br> leaf node in a deep derivable type hierarchy tree. Since: 2.70
    */
    int FINAL = 64;

}

/*
enumeration-type
*/
