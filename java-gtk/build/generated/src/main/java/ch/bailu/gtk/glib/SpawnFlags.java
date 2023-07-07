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
public interface SpawnFlags {

    /**
     * no flags, default behaviour
    */
    int DEFAULT = 0;

    /**
     * the parent's open file descriptors will
     * <br>    be inherited by the child; otherwise all descriptors except stdin,
     * <br>    stdout and stderr will be closed before calling exec() in the child.
    */
    int LEAVE_DESCRIPTORS_OPEN = 1;

    /**
     * the child will not be automatically reaped;
     * <br>    you must use g_child_watch_add() yourself (or call waitpid() or handle
     * <br>    `SIGCHLD` yourself), or the child will become a zombie.
    */
    int DO_NOT_REAP_CHILD = 2;

    /**
     * `argv[0]` need not be an absolute path, it will be
     * <br>    looked for in the user's `PATH`.
    */
    int SEARCH_PATH = 4;

    /**
     * the child's standard output will be discarded,
     * <br>    instead of going to the same location as the parent's standard output.
    */
    int STDOUT_TO_DEV_NULL = 8;

    /**
     * the child's standard error will be discarded.
    */
    int STDERR_TO_DEV_NULL = 16;

    /**
     * the child will inherit the parent's standard
     * <br>    input (by default, the child's standard input is attached to `/dev/null`).
    */
    int CHILD_INHERITS_STDIN = 32;

    /**
     * the first element of `argv` is the file to
     * <br>    execute, while the remaining elements are the actual argument vector
     * <br>    to pass to the file. Normally g_spawn_async_with_pipes() uses `argv[0]`
     * <br>    as the file to execute, and passes all of `argv` to the child.
    */
    int FILE_AND_ARGV_ZERO = 64;

    /**
     * if `argv[0]` is not an absolute path,
     * <br>    it will be looked for in the `PATH` from the passed child environment.
     * <br>    Since: 2.34
    */
    int SEARCH_PATH_FROM_ENVP = 128;

    /**
     * create all pipes with the `O_CLOEXEC` flag set.
     * <br>    Since: 2.40
    */
    int CLOEXEC_PIPES = 256;

    /**
     * The child will inherit the parent's standard output.
    */
    int CHILD_INHERITS_STDOUT = 512;

    /**
     * The child will inherit the parent's standard error.
    */
    int CHILD_INHERITS_STDERR = 1024;

    /**
     * The child's standard input is attached to `/dev/null`.
    */
    int STDIN_FROM_DEV_NULL = 2048;

}

/*
enumeration-type
*/
