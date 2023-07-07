/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GSubprocess allows the creation of and interaction with child
 * <br>processes.
 * <br>
 * <br>Processes can be communicated with using standard GIO-style APIs (ie:
 * <br>&#35;GInputStream, &#35;GOutputStream).  There are GIO-style APIs to wait for
 * <br>process termination (ie: cancellable and with an asynchronous
 * <br>variant).
 * <br>
 * <br>There is an API to force a process to terminate, as well as a
 * <br>race-free API for sending UNIX signals to a subprocess.
 * <br>
 * <br>One major advantage that GIO brings over the core GLib library is
 * <br>comprehensive API for asynchronous I/O, such
 * <br>g_output_stream_splice_async().  This makes GSubprocess
 * <br>significantly more powerful and flexible than equivalent APIs in
 * <br>some other languages such as the `subprocess.py`
 * <br>included with Python.  For example, using &#35;GSubprocess one could
 * <br>create two child processes, reading standard output from the first,
 * <br>processing it, and writing to the input stream of the second, all
 * <br>without blocking the main loop.
 * <br>
 * <br>A powerful g_subprocess_communicate() API is provided similar to the
 * <br>`communicate()` method of `subprocess.py`. This enables very easy
 * <br>interaction with a subprocess that has been opened with pipes.
 * <br>
 * <br>&#35;GSubprocess defaults to tight control over the file descriptors open
 * <br>in the child process, avoiding dangling-fd issues that are caused by
 * <br>a simple fork()/exec().  The only open file descriptors in the
 * <br>spawned process are ones that were explicitly specified by the
 * <br>&#35;GSubprocess API (unless %G_SUBPROCESS_FLAGS_INHERIT_FDS was
 * <br>specified).
 * <br>
 * <br>&#35;GSubprocess will quickly reap all child processes as they exit,
 * <br>avoiding &quot;zombie processes&quot; remaining around for long periods of
 * <br>time.  g_subprocess_wait() can be used to wait for this to happen,
 * <br>but it will happen even without the call being explicitly made.
 * <br>
 * <br>As a matter of principle, &#35;GSubprocess has no API that accepts
 * <br>shell-style space-separated strings.  It will, however, match the
 * <br>typical shell behaviour of searching the PATH for executables that do
 * <br>not contain a directory separator in their name. By default, the `PATH`
 * <br>of the current process is used.  You can specify
 * <br>%G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP to use the `PATH` of the
 * <br>launcher environment instead.
 * <br>
 * <br>&#35;GSubprocess attempts to have a very simple API for most uses (ie:
 * <br>spawning a subprocess with arguments and support for most typical
 * <br>kinds of input and output redirection).  See g_subprocess_new(). The
 * <br>&#35;GSubprocessLauncher API is provided for more complicated cases
 * <br>(advanced types of redirection, environment variable manipulation,
 * <br>change of working directory, child setup functions, etc).
 * <br>
 * <br>A typical use of &#35;GSubprocess will involve calling
 * <br>g_subprocess_new(), followed by g_subprocess_wait_async() or
 * <br>g_subprocess_wait().  After the process exits, the status can be
 * <br>checked using functions such as g_subprocess_get_if_exited() (which
 * <br>are similar to the familiar WIFEXITED-style POSIX macros).
 * <p><a href="https://docs.gtk.org/gio/class.Subprocess.html">https://docs.gtk.org/gio/class.Subprocess.html</a></p>
*/
public class Subprocess extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Subprocess.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAsyncReadyCallback {
        /**
         * Type definition for a function that will be called back when an asynchronous
         * <br>operation within GIO has been completed. &#35;GAsyncReadyCallback
         * <br>callbacks from &#35;GTask are guaranteed to be invoked in a later
         * <br>iteration of the
         * <br>[thread-default main context][g-main-context-push-thread-default]
         * <br>where the &#35;GTask was created. All other users of
         * <br>&#35;GAsyncReadyCallback must likewise call it asynchronously in a
         * <br>later iteration of the main context.
         * <br>
         * <br>The asynchronous operation is guaranteed to have held a reference to
         * <br>&#64;source_object from the time when the `*_async()` function was called, until
         * <br>after this callback returns.
         * @param source_object the object the asynchronous operation was started with.
         * @param res a &#35;GAsyncResult.
         * @param user_data user data passed to the callback.
        */
        void onAsyncReadyCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.gobject.Object source_object, @Nonnull AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaSubprocess.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaSubprocess.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public Subprocess(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Asynchronous version of g_subprocess_communicate().  Complete
     * <br>invocation with g_subprocess_communicate_finish().
     * @param stdin_buf Input data, or %NULL
     * @param cancellable Cancellable
     * @param callback Callback
     * @param user_data User data
    */
    public void communicateAsync(@Nullable ch.bailu.gtk.glib.Bytes stdin_buf, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSubprocess.INST().g_subprocess_communicate_async(asCPointer(), asCPointer(stdin_buf), asCPointer(cancellable), toOnAsyncReadyCallback(this, "communicateAsync", callback), asCPointer(user_data));
    }

    /**
     * Like g_subprocess_communicate(), but validates the output of the
     * <br>process as UTF-8, and returns it as a regular NUL terminated string.
     * <br>
     * <br>On error, &#64;stdout_buf and &#64;stderr_buf will be set to undefined values and
     * <br>should not be used.
     * @param stdin_buf data to send to the stdin of the subprocess, or %NULL
     * @param cancellable a &#35;GCancellable
     * @param stdout_buf data read from the subprocess stdout
     * @param stderr_buf data read from the subprocess stderr
     * @return 
    */
    public boolean communicateUtf8(@Nullable ch.bailu.gtk.type.Str stdin_buf, @Nullable Cancellable cancellable, @Nullable ch.bailu.gtk.type.Strs stdout_buf, @Nullable ch.bailu.gtk.type.Strs stderr_buf) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSubprocess.INST().g_subprocess_communicate_utf8(asCPointer(), asCPointer(stdin_buf), asCPointer(cancellable), asCPointer(stdout_buf), asCPointer(stderr_buf), 0L);
    }

    /**
     * Like g_subprocess_communicate(), but validates the output of the
     * <br>process as UTF-8, and returns it as a regular NUL terminated string.
     * <br>
     * <br>On error, &#64;stdout_buf and &#64;stderr_buf will be set to undefined values and
     * <br>should not be used.
     * @param stdin_buf data to send to the stdin of the subprocess, or %NULL
     * @param cancellable a &#35;GCancellable
     * @param stdout_buf data read from the subprocess stdout
     * @param stderr_buf data read from the subprocess stderr
     * @return 
    */
    public boolean communicateUtf8(String stdin_buf, @Nullable Cancellable cancellable, @Nullable ch.bailu.gtk.type.Strs stdout_buf, @Nullable ch.bailu.gtk.type.Strs stderr_buf) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSubprocess.INST().g_subprocess_communicate_utf8(asCPointer(), stdin_buf, asCPointer(cancellable), asCPointer(stdout_buf), asCPointer(stderr_buf), 0L);
    }

    /**
     * Asynchronous version of g_subprocess_communicate_utf8().  Complete
     * <br>invocation with g_subprocess_communicate_utf8_finish().
     * @param stdin_buf Input data, or %NULL
     * @param cancellable Cancellable
     * @param callback Callback
     * @param user_data User data
    */
    public void communicateUtf8Async(@Nullable ch.bailu.gtk.type.Str stdin_buf, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSubprocess.INST().g_subprocess_communicate_utf8_async(asCPointer(), asCPointer(stdin_buf), asCPointer(cancellable), toOnAsyncReadyCallback(this, "communicateUtf8Async", callback), asCPointer(user_data));
    }

    /**
     * Asynchronous version of g_subprocess_communicate_utf8().  Complete
     * <br>invocation with g_subprocess_communicate_utf8_finish().
     * @param stdin_buf Input data, or %NULL
     * @param cancellable Cancellable
     * @param callback Callback
     * @param user_data User data
    */
    public void communicateUtf8Async(String stdin_buf, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSubprocess.INST().g_subprocess_communicate_utf8_async(asCPointer(), stdin_buf, asCPointer(cancellable), toOnAsyncReadyCallback(this, "communicateUtf8Async", callback), asCPointer(user_data));
    }

    /**
     * Complete an invocation of g_subprocess_communicate_utf8_async().
     * @param result Result
     * @param stdout_buf Return location for stdout data
     * @param stderr_buf Return location for stderr data
     * @return 
    */
    public boolean communicateUtf8Finish(@Nonnull AsyncResult result, @Nullable ch.bailu.gtk.type.Strs stdout_buf, @Nullable ch.bailu.gtk.type.Strs stderr_buf) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSubprocess.INST().g_subprocess_communicate_utf8_finish(asCPointer(), asCPointerNotNull(result), asCPointer(stdout_buf), asCPointer(stderr_buf), 0L);
    }

    /**
     * Use an operating-system specific method to attempt an immediate,
     * <br>forceful termination of the process.  There is no mechanism to
     * <br>determine whether or not the request itself was successful;
     * <br>however, you can use g_subprocess_wait() to monitor the status of
     * <br>the process after calling this function.
     * <br>
     * <br>On Unix, this function sends %SIGKILL.
    */
    public void forceExit()  {
        JnaSubprocess.INST().g_subprocess_force_exit(asCPointer());
    }

    /**
     * Check the exit status of the subprocess, given that it exited
     * <br>normally.  This is the value passed to the exit() system call or the
     * <br>return value from main.
     * <br>
     * <br>This is equivalent to the system WEXITSTATUS macro.
     * <br>
     * <br>It is an error to call this function before g_subprocess_wait() and
     * <br>unless g_subprocess_get_if_exited() returned %TRUE.
     * @return the exit status
    */
    public int getExitStatus()  {
        return JnaSubprocess.INST().g_subprocess_get_exit_status(asCPointer());
    }

    /**
     * On UNIX, returns the process ID as a decimal string.
     * <br>On Windows, returns the result of GetProcessId() also as a string.
     * <br>If the subprocess has terminated, this will return %NULL.
     * @return the subprocess identifier, or %NULL if the subprocess    has terminated
    */
    public ch.bailu.gtk.type.Str getIdentifier()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSubprocess.INST().g_subprocess_get_identifier(asCPointer())));
    }

    /**
     * Check if the given subprocess exited normally (ie: by way of exit()
     * <br>or return from main()).
     * <br>
     * <br>This is equivalent to the system WIFEXITED macro.
     * <br>
     * <br>It is an error to call this function before g_subprocess_wait() has
     * <br>returned.
     * @return %TRUE if the case of a normal exit
    */
    public boolean getIfExited()  {
        return JnaSubprocess.INST().g_subprocess_get_if_exited(asCPointer());
    }

    /**
     * Check if the given subprocess terminated in response to a signal.
     * <br>
     * <br>This is equivalent to the system WIFSIGNALED macro.
     * <br>
     * <br>It is an error to call this function before g_subprocess_wait() has
     * <br>returned.
     * @return %TRUE if the case of termination due to a signal
    */
    public boolean getIfSignaled()  {
        return JnaSubprocess.INST().g_subprocess_get_if_signaled(asCPointer());
    }

    /**
     * Gets the raw status code of the process, as from waitpid().
     * <br>
     * <br>This value has no particular meaning, but it can be used with the
     * <br>macros defined by the system headers such as WIFEXITED.  It can also
     * <br>be used with g_spawn_check_wait_status().
     * <br>
     * <br>It is more likely that you want to use g_subprocess_get_if_exited()
     * <br>followed by g_subprocess_get_exit_status().
     * <br>
     * <br>It is an error to call this function before g_subprocess_wait() has
     * <br>returned.
     * @return the (meaningless) waitpid() exit status from the kernel
    */
    public int getStatus()  {
        return JnaSubprocess.INST().g_subprocess_get_status(asCPointer());
    }

    /**
     * Gets the &#35;GInputStream from which to read the stderr output of
     * <br>&#64;subprocess.
     * <br>
     * <br>The process must have been created with %G_SUBPROCESS_FLAGS_STDERR_PIPE,
     * <br>otherwise %NULL will be returned.
     * @return the stderr pipe
    */
    public InputStream getStderrPipe()  {
        return new InputStream(new PointerContainer(JnaSubprocess.INST().g_subprocess_get_stderr_pipe(asCPointer())));
    }

    /**
     * Gets the &#35;GOutputStream that you can write to in order to give data
     * <br>to the stdin of &#64;subprocess.
     * <br>
     * <br>The process must have been created with %G_SUBPROCESS_FLAGS_STDIN_PIPE and
     * <br>not %G_SUBPROCESS_FLAGS_STDIN_INHERIT, otherwise %NULL will be returned.
     * @return the stdout pipe
    */
    public OutputStream getStdinPipe()  {
        return new OutputStream(new PointerContainer(JnaSubprocess.INST().g_subprocess_get_stdin_pipe(asCPointer())));
    }

    /**
     * Gets the &#35;GInputStream from which to read the stdout output of
     * <br>&#64;subprocess.
     * <br>
     * <br>The process must have been created with %G_SUBPROCESS_FLAGS_STDOUT_PIPE,
     * <br>otherwise %NULL will be returned.
     * @return the stdout pipe
    */
    public InputStream getStdoutPipe()  {
        return new InputStream(new PointerContainer(JnaSubprocess.INST().g_subprocess_get_stdout_pipe(asCPointer())));
    }

    /**
     * Checks if the process was &quot;successful&quot;.  A process is considered
     * <br>successful if it exited cleanly with an exit status of 0, either by
     * <br>way of the exit() system call or return from main().
     * <br>
     * <br>It is an error to call this function before g_subprocess_wait() has
     * <br>returned.
     * @return %TRUE if the process exited cleanly with a exit status of 0
    */
    public boolean getSuccessful()  {
        return JnaSubprocess.INST().g_subprocess_get_successful(asCPointer());
    }

    /**
     * Get the signal number that caused the subprocess to terminate, given
     * <br>that it terminated due to a signal.
     * <br>
     * <br>This is equivalent to the system WTERMSIG macro.
     * <br>
     * <br>It is an error to call this function before g_subprocess_wait() and
     * <br>unless g_subprocess_get_if_signaled() returned %TRUE.
     * @return the signal causing termination
    */
    public int getTermSig()  {
        return JnaSubprocess.INST().g_subprocess_get_term_sig(asCPointer());
    }

    /**
     * Sends the UNIX signal &#64;signal_num to the subprocess, if it is still
     * <br>running.
     * <br>
     * <br>This API is race-free.  If the subprocess has terminated, it will not
     * <br>be signalled.
     * <br>
     * <br>This API is not available on Windows.
     * @param signal_num the signal number to send
    */
    public void sendSignal(int signal_num)  {
        JnaSubprocess.INST().g_subprocess_send_signal(asCPointer(), signal_num);
    }

    /**
     * Synchronously wait for the subprocess to terminate.
     * <br>
     * <br>After the process terminates you can query its exit status with
     * <br>functions such as g_subprocess_get_if_exited() and
     * <br>g_subprocess_get_exit_status().
     * <br>
     * <br>This function does not fail in the case of the subprocess having
     * <br>abnormal termination.  See g_subprocess_wait_check() for that.
     * <br>
     * <br>Cancelling &#64;cancellable doesn't kill the subprocess.  Call
     * <br>g_subprocess_force_exit() if it is desirable.
     * @param cancellable a &#35;GCancellable
     * @return %TRUE on success, %FALSE if &#64;cancellable was cancelled
    */
    public boolean wait(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSubprocess.INST().g_subprocess_wait(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Wait for the subprocess to terminate.
     * <br>
     * <br>This is the asynchronous version of g_subprocess_wait().
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback a &#35;GAsyncReadyCallback to call when the operation is complete
     * @param user_data user_data for &#64;callback
    */
    public void waitAsync(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSubprocess.INST().g_subprocess_wait_async(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "waitAsync", callback), asCPointer(user_data));
    }

    /**
     * Combines g_subprocess_wait() with g_spawn_check_wait_status().
     * @param cancellable a &#35;GCancellable
     * @return %TRUE on success, %FALSE if process exited abnormally, or &#64;cancellable was cancelled
    */
    public boolean waitCheck(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSubprocess.INST().g_subprocess_wait_check(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Combines g_subprocess_wait_async() with g_spawn_check_wait_status().
     * <br>
     * <br>This is the asynchronous version of g_subprocess_wait_check().
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback a &#35;GAsyncReadyCallback to call when the operation is complete
     * @param user_data user_data for &#64;callback
    */
    public void waitCheckAsync(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSubprocess.INST().g_subprocess_wait_check_async(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "waitCheckAsync", callback), asCPointer(user_data));
    }

    /**
     * Collects the result of a previous call to
     * <br>g_subprocess_wait_check_async().
     * @param result the &#35;GAsyncResult passed to your &#35;GAsyncReadyCallback
     * @return %TRUE if successful, or %FALSE with &#64;error set
    */
    public boolean waitCheckFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSubprocess.INST().g_subprocess_wait_check_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Collects the result of a previous call to
     * <br>g_subprocess_wait_async().
     * @param result the &#35;GAsyncResult passed to your &#35;GAsyncReadyCallback
     * @return %TRUE if successful, or %FALSE with &#64;error set
    */
    public boolean waitFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSubprocess.INST().g_subprocess_wait_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Implements interface {@link Initable}. Call this to get access to interface functions.
     * @return {@link Initable}
    */
    public Initable asInitable() {
        return new Initable(cast());
    }

    public static long getTypeID() { 
        return JnaSubprocess.INST().g_subprocess_get_type(); 
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

[MethodModel:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:Subprocess:{c:GSubprocess*}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GSubprocessFlags}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]

[MethodModel:java-type-not-supported:newv:[ParameterModel:Supported:{Gg:Subprocess:{c:GSubprocess*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GSubprocessFlags}}:{j:int}]

[MethodModel:java-type-not-supported:java-type-not-supported:communicate:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Bytes:{c:GBytes*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GBytes**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GBytes**}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:communicateFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GBytes**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GBytes**}}:{j:}]
*/
