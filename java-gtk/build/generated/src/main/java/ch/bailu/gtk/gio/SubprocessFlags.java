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
public interface SubprocessFlags {

    /**
     * No flags.
    */
    int NONE = 0;

    /**
     * create a pipe for the stdin of the
     * <br>  spawned process that can be accessed with
     * <br>  g_subprocess_get_stdin_pipe().
    */
    int STDIN_PIPE = 1;

    /**
     * stdin is inherited from the
     * <br>  calling process.
    */
    int STDIN_INHERIT = 2;

    /**
     * create a pipe for the stdout of the
     * <br>  spawned process that can be accessed with
     * <br>  g_subprocess_get_stdout_pipe().
    */
    int STDOUT_PIPE = 4;

    /**
     * silence the stdout of the spawned
     * <br>  process (ie: redirect to `/dev/null`).
    */
    int STDOUT_SILENCE = 8;

    /**
     * create a pipe for the stderr of the
     * <br>  spawned process that can be accessed with
     * <br>  g_subprocess_get_stderr_pipe().
    */
    int STDERR_PIPE = 16;

    /**
     * silence the stderr of the spawned
     * <br>  process (ie: redirect to `/dev/null`).
    */
    int STDERR_SILENCE = 32;

    /**
     * merge the stderr of the spawned
     * <br>  process with whatever the stdout happens to be.  This is a good way
     * <br>  of directing both streams to a common log file, for example.
    */
    int STDERR_MERGE = 64;

    /**
     * spawned processes will inherit the
     * <br>  file descriptors of their parent, unless those descriptors have
     * <br>  been explicitly marked as close-on-exec.  This flag has no effect
     * <br>  over the &quot;standard&quot; file descriptors (stdin, stdout, stderr).
    */
    int INHERIT_FDS = 128;

    /**
     * if path searching is
     * <br>  needed when spawning the subprocess, use the `PATH` in the launcher
     * <br>  environment. (Since: 2.72)
    */
    int SEARCH_PATH_FROM_ENVP = 256;

}

/*
enumeration-type
*/
