/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * This is the subclass of &#35;GSocketConnection that is created
 * <br>for UNIX domain sockets.
 * <br>
 * <br>It contains functions to do some of the UNIX socket specific
 * <br>functionality like passing file descriptors.
 * <br>
 * <br>Since GLib 2.72, &#35;GUnixConnection is available on all platforms. It requires
 * <br>underlying system support (such as Windows 10 with `AF_UNIX`) at run time.
 * <br>
 * <br>Before GLib 2.72, `&lt;gio/gunixconnection.h&gt;` belonged to the UNIX-specific GIO
 * <br>interfaces, thus you had to use the `gio-unix-2.0.pc` pkg-config file when
 * <br>using it. This is no longer necessary since GLib 2.72.
 * <p><a href="https://docs.gtk.org/gio/class.UnixConnection.html">https://docs.gtk.org/gio/class.UnixConnection.html</a></p>
*/
public class UnixConnection extends SocketConnection {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(UnixConnection.class.getCanonicalName());
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
    
    private static JnaUnixConnection.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaUnixConnection.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public UnixConnection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Receives credentials from the sending end of the connection.  The
     * <br>sending end has to call g_unix_connection_send_credentials() (or
     * <br>similar) for this to work.
     * <br>
     * <br>As well as reading the credentials this also reads (and discards) a
     * <br>single byte from the stream, as this is required for credentials
     * <br>passing to work on some implementations.
     * <br>
     * <br>This method can be expected to be available on the following platforms:
     * <br>
     * <br>- Linux since GLib 2.26
     * <br>- FreeBSD since GLib 2.26
     * <br>- GNU/kFreeBSD since GLib 2.36
     * <br>- Solaris, Illumos and OpenSolaris since GLib 2.40
     * <br>- GNU/Hurd since GLib 2.40
     * <br>
     * <br>Other ways to exchange credentials with a foreign peer includes the
     * <br>&#35;GUnixCredentialsMessage type and g_socket_get_credentials() function.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return Received credentials on success (free with g_object_unref()), %NULL if &#64;error is set.
    */
    public Credentials receiveCredentials(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Credentials(new PointerContainer(JnaUnixConnection.INST().g_unix_connection_receive_credentials(asCPointer(), asCPointer(cancellable), 0L)));
    }

    /**
     * Asynchronously receive credentials.
     * <br>
     * <br>For more details, see g_unix_connection_receive_credentials() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called. You can then call
     * <br>g_unix_connection_receive_credentials_finish() to get the result of the operation.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void receiveCredentialsAsync(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaUnixConnection.INST().g_unix_connection_receive_credentials_async(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "receiveCredentialsAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous receive credentials operation started with
     * <br>g_unix_connection_receive_credentials_async().
     * @param result a &#35;GAsyncResult.
     * @return a &#35;GCredentials, or %NULL on error.     Free the returned object with g_object_unref().
    */
    public Credentials receiveCredentialsFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Credentials(new PointerContainer(JnaUnixConnection.INST().g_unix_connection_receive_credentials_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Receives a file descriptor from the sending end of the connection.
     * <br>The sending end has to call g_unix_connection_send_fd() for this
     * <br>to work.
     * <br>
     * <br>As well as reading the fd this also reads a single byte from the
     * <br>stream, as this is required for fd passing to work on some
     * <br>implementations.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @return a file descriptor on success, -1 on error.
    */
    public int receiveFd(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaUnixConnection.INST().g_unix_connection_receive_fd(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Passes the credentials of the current user the receiving side
     * <br>of the connection. The receiving end has to call
     * <br>g_unix_connection_receive_credentials() (or similar) to accept the
     * <br>credentials.
     * <br>
     * <br>As well as sending the credentials this also writes a single NUL
     * <br>byte to the stream, as this is required for credentials passing to
     * <br>work on some implementations.
     * <br>
     * <br>This method can be expected to be available on the following platforms:
     * <br>
     * <br>- Linux since GLib 2.26
     * <br>- FreeBSD since GLib 2.26
     * <br>- GNU/kFreeBSD since GLib 2.36
     * <br>- Solaris, Illumos and OpenSolaris since GLib 2.40
     * <br>- GNU/Hurd since GLib 2.40
     * <br>
     * <br>Other ways to exchange credentials with a foreign peer includes the
     * <br>&#35;GUnixCredentialsMessage type and g_socket_get_credentials() function.
     * @param cancellable A &#35;GCancellable or %NULL.
     * @return %TRUE on success, %FALSE if &#64;error is set.
    */
    public boolean sendCredentials(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaUnixConnection.INST().g_unix_connection_send_credentials(asCPointer(), asCPointer(cancellable), 0L);
    }

    /**
     * Asynchronously send credentials.
     * <br>
     * <br>For more details, see g_unix_connection_send_credentials() which is
     * <br>the synchronous version of this call.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called. You can then call
     * <br>g_unix_connection_send_credentials_finish() to get the result of the operation.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback to call when the request is satisfied
     * @param user_data the data to pass to callback function
    */
    public void sendCredentialsAsync(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaUnixConnection.INST().g_unix_connection_send_credentials_async(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "sendCredentialsAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an asynchronous send credentials operation started with
     * <br>g_unix_connection_send_credentials_async().
     * @param result a &#35;GAsyncResult.
     * @return %TRUE if the operation was successful, otherwise %FALSE.
    */
    public boolean sendCredentialsFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaUnixConnection.INST().g_unix_connection_send_credentials_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Passes a file descriptor to the receiving side of the
     * <br>connection. The receiving end has to call g_unix_connection_receive_fd()
     * <br>to accept the file descriptor.
     * <br>
     * <br>As well as sending the fd this also writes a single byte to the
     * <br>stream, as this is required for fd passing to work on some
     * <br>implementations.
     * @param fd a file descriptor
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a %TRUE on success, %NULL on error.
    */
    public boolean sendFd(int fd, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaUnixConnection.INST().g_unix_connection_send_fd(asCPointer(), fd, asCPointer(cancellable), 0L);
    }

    public static long getTypeID() { 
        return JnaUnixConnection.INST().g_unix_connection_get_type(); 
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
*/
