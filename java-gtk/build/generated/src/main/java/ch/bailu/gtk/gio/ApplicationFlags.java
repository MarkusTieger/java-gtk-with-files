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
public interface ApplicationFlags {

    /**
     * Default. Deprecated in 2.74, use
     * <br>  %G_APPLICATION_DEFAULT_FLAGS instead
    */
    int FLAGS_NONE = 0;

    /**
     * Default flags. Since: 2.74
    */
    int DEFAULT_FLAGS = 0;

    /**
     * Run as a service. In this mode, registration
     * <br>     fails if the service is already running, and the application
     * <br>     will initially wait up to 10 seconds for an initial activation
     * <br>     message to arrive.
    */
    int IS_SERVICE = 1;

    /**
     * Don't try to become the primary instance.
    */
    int IS_LAUNCHER = 2;

    /**
     * This application handles opening files (in
     * <br>    the primary instance). Note that this flag only affects the default
     * <br>    implementation of local_command_line(), and has no effect if
     * <br>    %G_APPLICATION_HANDLES_COMMAND_LINE is given.
     * <br>    See g_application_run() for details.
    */
    int HANDLES_OPEN = 4;

    /**
     * This application handles command line
     * <br>    arguments (in the primary instance). Note that this flag only affect
     * <br>    the default implementation of local_command_line().
     * <br>    See g_application_run() for details.
    */
    int HANDLES_COMMAND_LINE = 8;

    /**
     * Send the environment of the
     * <br>    launching process to the primary instance. Set this flag if your
     * <br>    application is expected to behave differently depending on certain
     * <br>    environment variables. For instance, an editor might be expected
     * <br>    to use the `GIT_COMMITTER_NAME` environment variable
     * <br>    when editing a git commit message. The environment is available
     * <br>    to the &#35;GApplication::command-line signal handler, via
     * <br>    g_application_command_line_getenv().
    */
    int SEND_ENVIRONMENT = 16;

    /**
     * Make no attempts to do any of the typical
     * <br>    single-instance application negotiation, even if the application
     * <br>    ID is given.  The application neither attempts to become the
     * <br>    owner of the application ID nor does it check if an existing
     * <br>    owner already exists.  Everything occurs in the local process.
     * <br>    Since: 2.30.
    */
    int NON_UNIQUE = 32;

    /**
     * Allow users to override the
     * <br>    application ID from the command line with `--gapplication-app-id`.
     * <br>    Since: 2.48
    */
    int CAN_OVERRIDE_APP_ID = 64;

    /**
     * Allow another instance to take over
     * <br>    the bus name. Since: 2.60
    */
    int ALLOW_REPLACEMENT = 128;

    /**
     * Take over from another instance. This flag is
     * <br>    usually set by passing `--gapplication-replace` on the commandline.
     * <br>    Since: 2.60
    */
    int REPLACE = 256;

}

/*
enumeration-type
*/
