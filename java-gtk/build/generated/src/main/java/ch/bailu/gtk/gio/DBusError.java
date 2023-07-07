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
public interface DBusError {

    /**
     * A generic error; &quot;something went wrong&quot; - see the error message for
     * <br>more.
    */
    int FAILED = 0;

    /**
     * There was not enough memory to complete an operation.
    */
    int NO_MEMORY = 1;

    /**
     * The bus doesn't know how to launch a service to supply the bus name
     * <br>you wanted.
    */
    int SERVICE_UNKNOWN = 2;

    /**
     * The bus name you referenced doesn't exist (i.e. no application owns
     * <br>it).
    */
    int NAME_HAS_NO_OWNER = 3;

    /**
     * No reply to a message expecting one, usually means a timeout occurred.
    */
    int NO_REPLY = 4;

    /**
     * Something went wrong reading or writing to a socket, for example.
    */
    int IO_ERROR = 5;

    /**
     * A D-Bus bus address was malformed.
    */
    int BAD_ADDRESS = 6;

    /**
     * Requested operation isn't supported (like ENOSYS on UNIX).
    */
    int NOT_SUPPORTED = 7;

    /**
     * Some limited resource is exhausted.
    */
    int LIMITS_EXCEEDED = 8;

    /**
     * Security restrictions don't allow doing what you're trying to do.
    */
    int ACCESS_DENIED = 9;

    /**
     * Authentication didn't work.
    */
    int AUTH_FAILED = 10;

    /**
     * Unable to connect to server (probably caused by ECONNREFUSED on a
     * <br>socket).
    */
    int NO_SERVER = 11;

    /**
     * Certain timeout errors, possibly ETIMEDOUT on a socket.  Note that
     * <br>%G_DBUS_ERROR_NO_REPLY is used for message reply timeouts. Warning:
     * <br>this is confusingly-named given that %G_DBUS_ERROR_TIMED_OUT also
     * <br>exists. We can't fix it for compatibility reasons so just be
     * <br>careful.
    */
    int TIMEOUT = 12;

    /**
     * No network access (probably ENETUNREACH on a socket).
    */
    int NO_NETWORK = 13;

    /**
     * Can't bind a socket since its address is in use (i.e. EADDRINUSE).
    */
    int ADDRESS_IN_USE = 14;

    /**
     * The connection is disconnected and you're trying to use it.
    */
    int DISCONNECTED = 15;

    /**
     * Invalid arguments passed to a method call.
    */
    int INVALID_ARGS = 16;

    /**
     * Missing file.
    */
    int FILE_NOT_FOUND = 17;

    /**
     * Existing file and the operation you're using does not silently overwrite.
    */
    int FILE_EXISTS = 18;

    /**
     * Method name you invoked isn't known by the object you invoked it on.
    */
    int UNKNOWN_METHOD = 19;

    /**
     * Certain timeout errors, e.g. while starting a service. Warning: this is
     * <br>confusingly-named given that %G_DBUS_ERROR_TIMEOUT also exists. We
     * <br>can't fix it for compatibility reasons so just be careful.
    */
    int TIMED_OUT = 20;

    /**
     * Tried to remove or modify a match rule that didn't exist.
    */
    int MATCH_RULE_NOT_FOUND = 21;

    /**
     * The match rule isn't syntactically valid.
    */
    int MATCH_RULE_INVALID = 22;

    /**
     * While starting a new process, the exec() call failed.
    */
    int SPAWN_EXEC_FAILED = 23;

    /**
     * While starting a new process, the fork() call failed.
    */
    int SPAWN_FORK_FAILED = 24;

    /**
     * While starting a new process, the child exited with a status code.
    */
    int SPAWN_CHILD_EXITED = 25;

    /**
     * While starting a new process, the child exited on a signal.
    */
    int SPAWN_CHILD_SIGNALED = 26;

    /**
     * While starting a new process, something went wrong.
    */
    int SPAWN_FAILED = 27;

    /**
     * We failed to setup the environment correctly.
    */
    int SPAWN_SETUP_FAILED = 28;

    /**
     * We failed to setup the config parser correctly.
    */
    int SPAWN_CONFIG_INVALID = 29;

    /**
     * Bus name was not valid.
    */
    int SPAWN_SERVICE_INVALID = 30;

    /**
     * Service file not found in system-services directory.
    */
    int SPAWN_SERVICE_NOT_FOUND = 31;

    /**
     * Permissions are incorrect on the setuid helper.
    */
    int SPAWN_PERMISSIONS_INVALID = 32;

    /**
     * Service file invalid (Name, User or Exec missing).
    */
    int SPAWN_FILE_INVALID = 33;

    /**
     * Tried to get a UNIX process ID and it wasn't available.
    */
    int SPAWN_NO_MEMORY = 34;

    /**
     * Tried to get a UNIX process ID and it wasn't available.
    */
    int UNIX_PROCESS_ID_UNKNOWN = 35;

    /**
     * A type signature is not valid.
    */
    int INVALID_SIGNATURE = 36;

    /**
     * A file contains invalid syntax or is otherwise broken.
    */
    int INVALID_FILE_CONTENT = 37;

    /**
     * Asked for SELinux security context and it wasn't available.
    */
    int SELINUX_SECURITY_CONTEXT_UNKNOWN = 38;

    /**
     * Asked for ADT audit data and it wasn't available.
    */
    int ADT_AUDIT_DATA_UNKNOWN = 39;

    /**
     * There's already an object with the requested object path.
    */
    int OBJECT_PATH_IN_USE = 40;

    /**
     * Object you invoked a method on isn't known. Since 2.42
    */
    int UNKNOWN_OBJECT = 41;

    /**
     * Interface you invoked a method on isn't known by the object. Since 2.42
    */
    int UNKNOWN_INTERFACE = 42;

    /**
     * Property you tried to access isn't known by the object. Since 2.42
    */
    int UNKNOWN_PROPERTY = 43;

    /**
     * Property you tried to set is read-only. Since 2.42
    */
    int PROPERTY_READ_ONLY = 44;

}

/*
enumeration-type
*/
