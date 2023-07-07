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
public interface IOCondition {

    /**
     * There is data to read.
    */
    int IN = 1;

    /**
     * Data can be written (without blocking).
    */
    int OUT = 4;

    /**
     * There is urgent data to read.
    */
    int PRI = 2;

    /**
     * Error condition.
    */
    int ERR = 8;

    /**
     * Hung up (the connection has been broken, usually for
     * <br>           pipes and sockets).
    */
    int HUP = 16;

    /**
     * Invalid request. The file descriptor is not open.
    */
    int NVAL = 32;

}

/*
enumeration-type
*/
