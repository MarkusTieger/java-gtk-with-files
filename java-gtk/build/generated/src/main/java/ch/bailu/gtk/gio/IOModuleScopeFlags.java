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
public interface IOModuleScopeFlags {

    /**
     * No module scan flags
    */
    int NONE = 0;

    /**
     * When using this scope to load or
     * <br>    scan modules, automatically block a modules which has the same base
     * <br>    basename as previously loaded module.
    */
    int BLOCK_DUPLICATES = 1;

}

/*
enumeration-type
*/
