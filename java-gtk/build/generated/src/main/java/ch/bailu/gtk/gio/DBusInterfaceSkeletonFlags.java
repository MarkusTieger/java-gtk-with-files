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
public interface DBusInterfaceSkeletonFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * Each method invocation is handled in
     * <br>  a thread dedicated to the invocation. This means that the method implementation can use blocking IO
     * <br>  without blocking any other part of the process. It also means that the method implementation must
     * <br>  use locking to access data structures used by other threads.
    */
    int HANDLE_METHOD_INVOCATIONS_IN_THREAD = 1;

}

/*
enumeration-type
*/
