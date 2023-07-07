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
public interface IOErrorEnum {

    /**
     * Generic error condition for when an operation fails
     * <br>    and no more specific &#35;GIOErrorEnum value is defined.
    */
    int FAILED = 0;

    /**
     * File not found.
    */
    int NOT_FOUND = 1;

    /**
     * File already exists.
    */
    int EXISTS = 2;

    /**
     * File is a directory.
    */
    int IS_DIRECTORY = 3;

    /**
     * File is not a directory.
    */
    int NOT_DIRECTORY = 4;

    /**
     * File is a directory that isn't empty.
    */
    int NOT_EMPTY = 5;

    /**
     * File is not a regular file.
    */
    int NOT_REGULAR_FILE = 6;

    /**
     * File is not a symbolic link.
    */
    int NOT_SYMBOLIC_LINK = 7;

    /**
     * File cannot be mounted.
    */
    int NOT_MOUNTABLE_FILE = 8;

    /**
     * Filename is too many characters.
    */
    int FILENAME_TOO_LONG = 9;

    /**
     * Filename is invalid or contains invalid characters.
    */
    int INVALID_FILENAME = 10;

    /**
     * File contains too many symbolic links.
    */
    int TOO_MANY_LINKS = 11;

    /**
     * No space left on drive.
    */
    int NO_SPACE = 12;

    /**
     * Invalid argument.
    */
    int INVALID_ARGUMENT = 13;

    /**
     * Permission denied.
    */
    int PERMISSION_DENIED = 14;

    /**
     * Operation (or one of its parameters) not supported
    */
    int NOT_SUPPORTED = 15;

    /**
     * File isn't mounted.
    */
    int NOT_MOUNTED = 16;

    /**
     * File is already mounted.
    */
    int ALREADY_MOUNTED = 17;

    /**
     * File was closed.
    */
    int CLOSED = 18;

    /**
     * Operation was cancelled. See &#35;GCancellable.
    */
    int CANCELLED = 19;

    /**
     * Operations are still pending.
    */
    int PENDING = 20;

    /**
     * File is read only.
    */
    int READ_ONLY = 21;

    /**
     * Backup couldn't be created.
    */
    int CANT_CREATE_BACKUP = 22;

    /**
     * File's Entity Tag was incorrect.
    */
    int WRONG_ETAG = 23;

    /**
     * Operation timed out.
    */
    int TIMED_OUT = 24;

    /**
     * Operation would be recursive.
    */
    int WOULD_RECURSE = 25;

    /**
     * File is busy.
    */
    int BUSY = 26;

    /**
     * Operation would block.
    */
    int WOULD_BLOCK = 27;

    /**
     * Host couldn't be found (remote operations).
    */
    int HOST_NOT_FOUND = 28;

    /**
     * Operation would merge files.
    */
    int WOULD_MERGE = 29;

    /**
     * Operation failed and a helper program has
     * <br>    already interacted with the user. Do not display any error dialog.
    */
    int FAILED_HANDLED = 30;

    /**
     * The current process has too many files
     * <br>    open and can't open any more. Duplicate descriptors do count toward
     * <br>    this limit. Since 2.20
    */
    int TOO_MANY_OPEN_FILES = 31;

    /**
     * The object has not been initialized. Since 2.22
    */
    int NOT_INITIALIZED = 32;

    /**
     * The requested address is already in use. Since 2.22
    */
    int ADDRESS_IN_USE = 33;

    /**
     * Need more input to finish operation. Since 2.24
    */
    int PARTIAL_INPUT = 34;

    /**
     * The input data was invalid. Since 2.24
    */
    int INVALID_DATA = 35;

    /**
     * A remote object generated an error that
     * <br>    doesn't correspond to a locally registered &#35;GError error
     * <br>    domain. Use g_dbus_error_get_remote_error() to extract the D-Bus
     * <br>    error name and g_dbus_error_strip_remote_error() to fix up the
     * <br>    message so it matches what was received on the wire. Since 2.26.
    */
    int DBUS_ERROR = 36;

    /**
     * Host unreachable. Since 2.26
    */
    int HOST_UNREACHABLE = 37;

    /**
     * Network unreachable. Since 2.26
    */
    int NETWORK_UNREACHABLE = 38;

    /**
     * Connection refused. Since 2.26
    */
    int CONNECTION_REFUSED = 39;

    /**
     * Connection to proxy server failed. Since 2.26
    */
    int PROXY_FAILED = 40;

    /**
     * Proxy authentication failed. Since 2.26
    */
    int PROXY_AUTH_FAILED = 41;

    /**
     * Proxy server needs authentication. Since 2.26
    */
    int PROXY_NEED_AUTH = 42;

    /**
     * Proxy connection is not allowed by ruleset.
     * <br>    Since 2.26
    */
    int PROXY_NOT_ALLOWED = 43;

    /**
     * Broken pipe. Since 2.36
    */
    int BROKEN_PIPE = 44;

    /**
     * Connection closed by peer. Note that this
     * <br>    is the same code as %G_IO_ERROR_BROKEN_PIPE; before 2.44 some
     * <br>    &quot;connection closed&quot; errors returned %G_IO_ERROR_BROKEN_PIPE, but others
     * <br>    returned %G_IO_ERROR_FAILED. Now they should all return the same
     * <br>    value, which has this more logical name. Since 2.44.
    */
    int CONNECTION_CLOSED = 44;

    /**
     * Transport endpoint is not connected. Since 2.44
    */
    int NOT_CONNECTED = 45;

    /**
     * Message too large. Since 2.48.
    */
    int MESSAGE_TOO_LARGE = 46;

    /**
     * No such device found. Since 2.74
    */
    int NO_SUCH_DEVICE = 47;

}

/*
enumeration-type
*/
