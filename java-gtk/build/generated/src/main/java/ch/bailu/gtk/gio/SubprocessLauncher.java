/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * This class contains a set of options for launching child processes,
 * <br>such as where its standard input and output will be directed, the
 * <br>argument list, the environment, and more.
 * <br>
 * <br>While the &#35;GSubprocess class has high level functions covering
 * <br>popular cases, use of this class allows access to more advanced
 * <br>options.  It can also be used to launch multiple subprocesses with
 * <br>a similar configuration.
 * <p><a href="https://docs.gtk.org/gio/class.SubprocessLauncher.html">https://docs.gtk.org/gio/class.SubprocessLauncher.html</a></p>
*/
public class SubprocessLauncher extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SubprocessLauncher.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnSpawnChildSetupFunc {
        /**
         * Specifies the type of the setup function passed to g_spawn_async(),
         * <br>g_spawn_sync() and g_spawn_async_with_pipes(), which can, in very
         * <br>limited ways, be used to affect the child's execution.
         * <br>
         * <br>On POSIX platforms, the function is called in the child after GLib
         * <br>has performed all the setup it plans to perform, but before calling
         * <br>exec(). Actions taken in this function will only affect the child,
         * <br>not the parent.
         * <br>
         * <br>On Windows, the function is called in the parent. Its usefulness on
         * <br>Windows is thus questionable. In many cases executing the child setup
         * <br>function in the parent can have ill effects, and you should be very
         * <br>careful when porting software to Windows that uses child setup
         * <br>functions.
         * <br>
         * <br>However, even on POSIX, you are extremely limited in what you can
         * <br>safely do from a &#35;GSpawnChildSetupFunc, because any mutexes that were
         * <br>held by other threads in the parent process at the time of the fork()
         * <br>will still be locked in the child process, and they will never be
         * <br>unlocked (since the threads that held them don't exist in the child).
         * <br>POSIX allows only async-signal-safe functions (see signal(7)) to be
         * <br>called in the child between fork() and exec(), which drastically limits
         * <br>the usefulness of child setup functions.
         * <br>
         * <br>In particular, it is not safe to call any function which may
         * <br>call malloc(), which includes POSIX functions such as setenv().
         * <br>If you need to set up the child environment differently from
         * <br>the parent, you should use g_get_environ(), g_environ_setenv(),
         * <br>and g_environ_unsetenv(), and then pass the complete environment
         * <br>list to the `g_spawn...` function.
         * @param user_data user data to pass to the function.
        */
        void onSpawnChildSetupFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaSubprocessLauncher.OnSpawnChildSetupFunc toOnSpawnChildSetupFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnSpawnChildSetupFunc in) {
        JnaSubprocessLauncher.OnSpawnChildSetupFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_user_data) -> in.onSpawnChildSetupFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaSubprocessLauncher.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaSubprocessLauncher.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public SubprocessLauncher(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GSubprocessLauncher.
     * <br>
     * <br>The launcher is created with the default options.  A copy of the
     * <br>environment of the calling process is made at the time of this call
     * <br>and will be used as the environment that the process is launched in.
     * @param flags &#35;GSubprocessFlags
    */
    public SubprocessLauncher(int flags) {
        super(cast(JnaSubprocessLauncher.INST().g_subprocess_launcher_new(flags)));
    }

    /**
     * Closes all the file descriptors previously passed to the object with
     * <br>g_subprocess_launcher_take_fd(), g_subprocess_launcher_take_stderr_fd(), etc.
     * <br>
     * <br>After calling this method, any subsequent calls to g_subprocess_launcher_spawn() or g_subprocess_launcher_spawnv() will
     * <br>return %G_IO_ERROR_CLOSED. This method is idempotent if
     * <br>called more than once.
     * <br>
     * <br>This function is called automatically when the &#35;GSubprocessLauncher
     * <br>is disposed, but is provided separately so that garbage collected
     * <br>language bindings can call it earlier to guarantee when FDs are closed.
    */
    public void close()  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_close(asCPointer());
    }

    /**
     * Returns the value of the environment variable &#64;variable in the
     * <br>environment of processes launched from this launcher.
     * <br>
     * <br>On UNIX, the returned string can be an arbitrary byte string.
     * <br>On Windows, it will be UTF-8.
     * @param variable the environment variable to get
     * @return the value of the environment variable,     %NULL if unset
    */
    public ch.bailu.gtk.type.Str getenv(@Nonnull ch.bailu.gtk.type.Str variable)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSubprocessLauncher.INST().g_subprocess_launcher_getenv(asCPointer(), asCPointerNotNull(variable))));
    }

    /**
     * Returns the value of the environment variable &#64;variable in the
     * <br>environment of processes launched from this launcher.
     * <br>
     * <br>On UNIX, the returned string can be an arbitrary byte string.
     * <br>On Windows, it will be UTF-8.
     * @param variable the environment variable to get
     * @return the value of the environment variable,     %NULL if unset
    */
    public ch.bailu.gtk.type.Str getenv(String variable)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSubprocessLauncher.INST().g_subprocess_launcher_getenv(asCPointer(), variable)));
    }

    /**
     * Sets up a child setup function.
     * <br>
     * <br>The child setup function will be called after fork() but before
     * <br>exec() on the child's side.
     * <br>
     * <br>&#64;destroy_notify will not be automatically called on the child's side
     * <br>of the fork().  It will only be called when the last reference on the
     * <br>&#35;GSubprocessLauncher is dropped or when a new child setup function is
     * <br>given.
     * <br>
     * <br>%NULL can be given as &#64;child_setup to disable the functionality.
     * <br>
     * <br>Child setup functions are only available on UNIX.
     * @param child_setup a &#35;GSpawnChildSetupFunc to use as the child setup function
     * @param user_data user data for &#64;child_setup
     * @param destroy_notify a &#35;GDestroyNotify for &#64;user_data
    */
    public void setChildSetup(OnSpawnChildSetupFunc child_setup, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy_notify)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_set_child_setup(asCPointer(), toOnSpawnChildSetupFunc(this, "setChildSetup", child_setup), asCPointer(user_data), toOnDestroyNotify(this, "setChildSetup", destroy_notify));
    }

    /**
     * Sets the current working directory that processes will be launched
     * <br>with.
     * <br>
     * <br>By default processes are launched with the current working directory
     * <br>of the launching process at the time of launch.
     * @param cwd the cwd for launched processes
    */
    public void setCwd(@Nonnull ch.bailu.gtk.type.Str cwd)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_set_cwd(asCPointer(), asCPointerNotNull(cwd));
    }

    /**
     * Sets the current working directory that processes will be launched
     * <br>with.
     * <br>
     * <br>By default processes are launched with the current working directory
     * <br>of the launching process at the time of launch.
     * @param cwd the cwd for launched processes
    */
    public void setCwd(String cwd)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_set_cwd(asCPointer(), cwd);
    }

    /**
     * Sets the flags on the launcher.
     * <br>
     * <br>The default flags are %G_SUBPROCESS_FLAGS_NONE.
     * <br>
     * <br>You may not set flags that specify conflicting options for how to
     * <br>handle a particular stdio stream (eg: specifying both
     * <br>%G_SUBPROCESS_FLAGS_STDIN_PIPE and
     * <br>%G_SUBPROCESS_FLAGS_STDIN_INHERIT).
     * <br>
     * <br>You may also not set a flag that conflicts with a previous call to a
     * <br>function like g_subprocess_launcher_set_stdin_file_path() or
     * <br>g_subprocess_launcher_take_stdout_fd().
     * @param flags &#35;GSubprocessFlags
    */
    public void setFlags(int flags)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_set_flags(asCPointer(), flags);
    }

    /**
     * Sets the file path to use as the stderr for spawned processes.
     * <br>
     * <br>If &#64;path is %NULL then any previously given path is unset.
     * <br>
     * <br>The file will be created or truncated when the process is spawned, as
     * <br>would be the case if using '2&gt;' at the shell.
     * <br>
     * <br>If you want to send both stdout and stderr to the same file then use
     * <br>%G_SUBPROCESS_FLAGS_STDERR_MERGE.
     * <br>
     * <br>You may not set a stderr file path if a stderr fd is already set or
     * <br>if the launcher flags contain any flags directing stderr elsewhere.
     * <br>
     * <br>This feature is only available on UNIX.
     * @param path a filename or %NULL
    */
    public void setStderrFilePath(@Nullable ch.bailu.gtk.type.Str path)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_set_stderr_file_path(asCPointer(), asCPointer(path));
    }

    /**
     * Sets the file path to use as the stderr for spawned processes.
     * <br>
     * <br>If &#64;path is %NULL then any previously given path is unset.
     * <br>
     * <br>The file will be created or truncated when the process is spawned, as
     * <br>would be the case if using '2&gt;' at the shell.
     * <br>
     * <br>If you want to send both stdout and stderr to the same file then use
     * <br>%G_SUBPROCESS_FLAGS_STDERR_MERGE.
     * <br>
     * <br>You may not set a stderr file path if a stderr fd is already set or
     * <br>if the launcher flags contain any flags directing stderr elsewhere.
     * <br>
     * <br>This feature is only available on UNIX.
     * @param path a filename or %NULL
    */
    public void setStderrFilePath(String path)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_set_stderr_file_path(asCPointer(), path);
    }

    /**
     * Sets the file path to use as the stdin for spawned processes.
     * <br>
     * <br>If &#64;path is %NULL then any previously given path is unset.
     * <br>
     * <br>The file must exist or spawning the process will fail.
     * <br>
     * <br>You may not set a stdin file path if a stdin fd is already set or if
     * <br>the launcher flags contain any flags directing stdin elsewhere.
     * <br>
     * <br>This feature is only available on UNIX.
     * @param path 
    */
    public void setStdinFilePath(@Nonnull ch.bailu.gtk.type.Str path)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_set_stdin_file_path(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Sets the file path to use as the stdin for spawned processes.
     * <br>
     * <br>If &#64;path is %NULL then any previously given path is unset.
     * <br>
     * <br>The file must exist or spawning the process will fail.
     * <br>
     * <br>You may not set a stdin file path if a stdin fd is already set or if
     * <br>the launcher flags contain any flags directing stdin elsewhere.
     * <br>
     * <br>This feature is only available on UNIX.
     * @param path 
    */
    public void setStdinFilePath(String path)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_set_stdin_file_path(asCPointer(), path);
    }

    /**
     * Sets the file path to use as the stdout for spawned processes.
     * <br>
     * <br>If &#64;path is %NULL then any previously given path is unset.
     * <br>
     * <br>The file will be created or truncated when the process is spawned, as
     * <br>would be the case if using '&gt;' at the shell.
     * <br>
     * <br>You may not set a stdout file path if a stdout fd is already set or
     * <br>if the launcher flags contain any flags directing stdout elsewhere.
     * <br>
     * <br>This feature is only available on UNIX.
     * @param path a filename or %NULL
    */
    public void setStdoutFilePath(@Nullable ch.bailu.gtk.type.Str path)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_set_stdout_file_path(asCPointer(), asCPointer(path));
    }

    /**
     * Sets the file path to use as the stdout for spawned processes.
     * <br>
     * <br>If &#64;path is %NULL then any previously given path is unset.
     * <br>
     * <br>The file will be created or truncated when the process is spawned, as
     * <br>would be the case if using '&gt;' at the shell.
     * <br>
     * <br>You may not set a stdout file path if a stdout fd is already set or
     * <br>if the launcher flags contain any flags directing stdout elsewhere.
     * <br>
     * <br>This feature is only available on UNIX.
     * @param path a filename or %NULL
    */
    public void setStdoutFilePath(String path)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_set_stdout_file_path(asCPointer(), path);
    }

    /**
     * Sets the environment variable &#64;variable in the environment of
     * <br>processes launched from this launcher.
     * <br>
     * <br>On UNIX, both the variable's name and value can be arbitrary byte
     * <br>strings, except that the variable's name cannot contain '='.
     * <br>On Windows, they should be in UTF-8.
     * @param variable the environment variable to set,     must not contain '='
     * @param value the new value for the variable
     * @param overwrite whether to change the variable if it already exists
    */
    public void setenv(@Nonnull ch.bailu.gtk.type.Str variable, @Nonnull ch.bailu.gtk.type.Str value, boolean overwrite)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_setenv(asCPointer(), asCPointerNotNull(variable), asCPointerNotNull(value), overwrite);
    }

    /**
     * Sets the environment variable &#64;variable in the environment of
     * <br>processes launched from this launcher.
     * <br>
     * <br>On UNIX, both the variable's name and value can be arbitrary byte
     * <br>strings, except that the variable's name cannot contain '='.
     * <br>On Windows, they should be in UTF-8.
     * @param variable the environment variable to set,     must not contain '='
     * @param value the new value for the variable
     * @param overwrite whether to change the variable if it already exists
    */
    public void setenv(String variable, String value, boolean overwrite)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_setenv(asCPointer(), variable, value, overwrite);
    }

    /**
     * Transfer an arbitrary file descriptor from parent process to the
     * <br>child.  This function takes ownership of the &#64;source_fd; it will be closed
     * <br>in the parent when &#64;self is freed.
     * <br>
     * <br>By default, all file descriptors from the parent will be closed.
     * <br>This function allows you to create (for example) a custom `pipe()` or
     * <br>`socketpair()` before launching the process, and choose the target
     * <br>descriptor in the child.
     * <br>
     * <br>An example use case is GNUPG, which has a command line argument
     * <br>`--passphrase-fd` providing a file descriptor number where it expects
     * <br>the passphrase to be written.
     * @param source_fd File descriptor in parent process
     * @param target_fd Target descriptor for child process
    */
    public void takeFd(int source_fd, int target_fd)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_take_fd(asCPointer(), source_fd, target_fd);
    }

    /**
     * Sets the file descriptor to use as the stderr for spawned processes.
     * <br>
     * <br>If &#64;fd is -1 then any previously given fd is unset.
     * <br>
     * <br>Note that the default behaviour is to pass stderr through to the
     * <br>stderr of the parent process.
     * <br>
     * <br>The passed &#64;fd belongs to the &#35;GSubprocessLauncher.  It will be
     * <br>automatically closed when the launcher is finalized.  The file
     * <br>descriptor will also be closed on the child side when executing the
     * <br>spawned process.
     * <br>
     * <br>You may not set a stderr fd if a stderr file path is already set or
     * <br>if the launcher flags contain any flags directing stderr elsewhere.
     * <br>
     * <br>This feature is only available on UNIX.
     * @param fd a file descriptor, or -1
    */
    public void takeStderrFd(int fd)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_take_stderr_fd(asCPointer(), fd);
    }

    /**
     * Sets the file descriptor to use as the stdin for spawned processes.
     * <br>
     * <br>If &#64;fd is -1 then any previously given fd is unset.
     * <br>
     * <br>Note that if your intention is to have the stdin of the calling
     * <br>process inherited by the child then %G_SUBPROCESS_FLAGS_STDIN_INHERIT
     * <br>is a better way to go about doing that.
     * <br>
     * <br>The passed &#64;fd is noted but will not be touched in the current
     * <br>process.  It is therefore necessary that it be kept open by the
     * <br>caller until the subprocess is spawned.  The file descriptor will
     * <br>also not be explicitly closed on the child side, so it must be marked
     * <br>O_CLOEXEC if that's what you want.
     * <br>
     * <br>You may not set a stdin fd if a stdin file path is already set or if
     * <br>the launcher flags contain any flags directing stdin elsewhere.
     * <br>
     * <br>This feature is only available on UNIX.
     * @param fd a file descriptor, or -1
    */
    public void takeStdinFd(int fd)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_take_stdin_fd(asCPointer(), fd);
    }

    /**
     * Sets the file descriptor to use as the stdout for spawned processes.
     * <br>
     * <br>If &#64;fd is -1 then any previously given fd is unset.
     * <br>
     * <br>Note that the default behaviour is to pass stdout through to the
     * <br>stdout of the parent process.
     * <br>
     * <br>The passed &#64;fd is noted but will not be touched in the current
     * <br>process.  It is therefore necessary that it be kept open by the
     * <br>caller until the subprocess is spawned.  The file descriptor will
     * <br>also not be explicitly closed on the child side, so it must be marked
     * <br>O_CLOEXEC if that's what you want.
     * <br>
     * <br>You may not set a stdout fd if a stdout file path is already set or
     * <br>if the launcher flags contain any flags directing stdout elsewhere.
     * <br>
     * <br>This feature is only available on UNIX.
     * @param fd a file descriptor, or -1
    */
    public void takeStdoutFd(int fd)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_take_stdout_fd(asCPointer(), fd);
    }

    /**
     * Removes the environment variable &#64;variable from the environment of
     * <br>processes launched from this launcher.
     * <br>
     * <br>On UNIX, the variable's name can be an arbitrary byte string not
     * <br>containing '='. On Windows, it should be in UTF-8.
     * @param variable the environment variable to unset,     must not contain '='
    */
    public void unsetenv(@Nonnull ch.bailu.gtk.type.Str variable)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_unsetenv(asCPointer(), asCPointerNotNull(variable));
    }

    /**
     * Removes the environment variable &#64;variable from the environment of
     * <br>processes launched from this launcher.
     * <br>
     * <br>On UNIX, the variable's name can be an arbitrary byte string not
     * <br>containing '='. On Windows, it should be in UTF-8.
     * @param variable the environment variable to unset,     must not contain '='
    */
    public void unsetenv(String variable)  {
        JnaSubprocessLauncher.INST().g_subprocess_launcher_unsetenv(asCPointer(), variable);
    }

    public static long getTypeID() { 
        return JnaSubprocessLauncher.INST().g_subprocess_launcher_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
class-type

[MethodModel:java-type-not-supported:setEnviron:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:java-type-not-supported:spawn:[ParameterModel:Supported:{Gg:Subprocess:{c:GSubprocess*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:java-type-not-supported:spawnv:[ParameterModel:Supported:{Gg:Subprocess:{c:GSubprocess*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]
*/
