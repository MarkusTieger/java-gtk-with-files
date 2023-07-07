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
public interface DBusMessageHeaderField {

    /**
     * Not a valid header field.
    */
    int INVALID = 0;

    /**
     * The object path.
    */
    int PATH = 1;

    /**
     * The interface name.
    */
    int INTERFACE = 2;

    /**
     * The method or signal name.
    */
    int MEMBER = 3;

    /**
     * The name of the error that occurred.
    */
    int ERROR_NAME = 4;

    /**
     * The serial number the message is a reply to.
    */
    int REPLY_SERIAL = 5;

    /**
     * The name the message is intended for.
    */
    int DESTINATION = 6;

    /**
     * Unique name of the sender of the message (filled in by the bus).
    */
    int SENDER = 7;

    /**
     * The signature of the message body.
    */
    int SIGNATURE = 8;

    /**
     * The number of UNIX file descriptors that accompany the message.
    */
    int NUM_UNIX_FDS = 9;

}

/*
enumeration-type
*/
