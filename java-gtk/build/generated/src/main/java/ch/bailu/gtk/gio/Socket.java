/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GSocket is a low-level networking primitive. It is a more or less
 * <br>direct mapping of the BSD socket API in a portable GObject based API.
 * <br>It supports both the UNIX socket implementations and winsock2 on Windows.
 * <br>
 * <br>&#35;GSocket is the platform independent base upon which the higher level
 * <br>network primitives are based. Applications are not typically meant to
 * <br>use it directly, but rather through classes like &#35;GSocketClient,
 * <br>&#35;GSocketService and &#35;GSocketConnection. However there may be cases where
 * <br>direct use of &#35;GSocket is useful.
 * <br>
 * <br>&#35;GSocket implements the &#35;GInitable interface, so if it is manually constructed
 * <br>by e.g. g_object_new() you must call g_initable_init() and check the
 * <br>results before using the object. This is done automatically in
 * <br>g_socket_new() and g_socket_new_from_fd(), so these functions can return
 * <br>%NULL.
 * <br>
 * <br>Sockets operate in two general modes, blocking or non-blocking. When
 * <br>in blocking mode all operations (which don’t take an explicit blocking
 * <br>parameter) block until the requested operation
 * <br>is finished or there is an error. In non-blocking mode all calls that
 * <br>would block return immediately with a %G_IO_ERROR_WOULD_BLOCK error.
 * <br>To know when a call would successfully run you can call g_socket_condition_check(),
 * <br>or g_socket_condition_wait(). You can also use g_socket_create_source() and
 * <br>attach it to a &#35;GMainContext to get callbacks when I/O is possible.
 * <br>Note that all sockets are always set to non blocking mode in the system, and
 * <br>blocking mode is emulated in GSocket.
 * <br>
 * <br>When working in non-blocking mode applications should always be able to
 * <br>handle getting a %G_IO_ERROR_WOULD_BLOCK error even when some other
 * <br>function said that I/O was possible. This can easily happen in case
 * <br>of a race condition in the application, but it can also happen for other
 * <br>reasons. For instance, on Windows a socket is always seen as writable
 * <br>until a write returns %G_IO_ERROR_WOULD_BLOCK.
 * <br>
 * <br>&#35;GSockets can be either connection oriented or datagram based.
 * <br>For connection oriented types you must first establish a connection by
 * <br>either connecting to an address or accepting a connection from another
 * <br>address. For connectionless socket types the target/source address is
 * <br>specified or received in each I/O operation.
 * <br>
 * <br>All socket file descriptors are set to be close-on-exec.
 * <br>
 * <br>Note that creating a &#35;GSocket causes the signal %SIGPIPE to be
 * <br>ignored for the remainder of the program. If you are writing a
 * <br>command-line utility that uses &#35;GSocket, you may need to take into
 * <br>account the fact that your program will not automatically be killed
 * <br>if it tries to write to %stdout after it has been closed.
 * <br>
 * <br>Like most other APIs in GLib, &#35;GSocket is not inherently thread safe. To use
 * <br>a &#35;GSocket concurrently from multiple threads, you must implement your own
 * <br>locking.
 * <p><a href="https://docs.gtk.org/gio/class.Socket.html">https://docs.gtk.org/gio/class.Socket.html</a></p>
*/
public class Socket extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Socket.class.getCanonicalName());
    }

    public Socket(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GSocket from a native file descriptor
     * <br>or winsock SOCKET handle.
     * <br>
     * <br>This reads all the settings from the file descriptor so that
     * <br>all properties should work. Note that the file descriptor
     * <br>will be set to non-blocking mode, independent on the blocking
     * <br>mode of the &#35;GSocket.
     * <br>
     * <br>On success, the returned &#35;GSocket takes ownership of &#64;fd. On failure, the
     * <br>caller must close &#64;fd themselves.
     * <br>
     * <br>Since GLib 2.46, it is no longer a fatal error to call this on a non-socket
     * <br>descriptor.  Instead, a GError will be set with code %G_IO_ERROR_FAILED
     * @param fd a native socket file descriptor.
     * @return a &#35;GSocket or %NULL on error.     Free the returned object with g_object_unref().
    */
    public static Socket newFromFdSocket(int fd) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaSocket.INST().g_socket_new_from_fd(fd, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Socket:newFromFd");
        }
        return new Socket(__self);
    }        
    

    /**
     * Creates a new &#35;GSocket with the defined family, type and protocol.
     * <br>If &#64;protocol is 0 (%G_SOCKET_PROTOCOL_DEFAULT) the default protocol type
     * <br>for the family and type is used.
     * <br>
     * <br>The &#64;protocol is a family and type specific int that specifies what
     * <br>kind of protocol to use. &#35;GSocketProtocol lists several common ones.
     * <br>Many families only support one protocol, and use 0 for this, others
     * <br>support several and using 0 means to use the default protocol for
     * <br>the family and type.
     * <br>
     * <br>The protocol id is passed directly to the operating
     * <br>system, so you can use protocols not listed in &#35;GSocketProtocol if you
     * <br>know the protocol number used for it.
     * @param family the socket family to use, e.g. %G_SOCKET_FAMILY_IPV4.
     * @param type the socket type to use.
     * @param protocol the id of the protocol to use, or 0 for default.
    */
    public Socket(int family, int type, int protocol) {
        super(cast(JnaSocket.INST().g_socket_new(family, type, protocol, 0L)));
    }

    /**
     * Accept incoming connections on a connection-based socket. This removes
     * <br>the first outstanding connection request from the listening socket and
     * <br>creates a &#35;GSocket object for it.
     * <br>
     * <br>The &#64;socket must be bound to a local address with g_socket_bind() and
     * <br>must be listening for incoming connections (g_socket_listen()).
     * <br>
     * <br>If there are no outstanding connections then the operation will block
     * <br>or return %G_IO_ERROR_WOULD_BLOCK if non-blocking I/O is enabled.
     * <br>To be notified of an incoming connection, wait for the %G_IO_IN condition.
     * @param cancellable a %GCancellable or %NULL
     * @return a new &#35;GSocket, or %NULL on error.     Free the returned object with g_object_unref().
    */
    public Socket accept(@Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Socket(new PointerContainer(JnaSocket.INST().g_socket_accept(asCPointer(), asCPointer(cancellable), 0L)));
    }

    /**
     * When a socket is created it is attached to an address family, but it
     * <br>doesn't have an address in this family. g_socket_bind() assigns the
     * <br>address (sometimes called name) of the socket.
     * <br>
     * <br>It is generally required to bind to a local address before you can
     * <br>receive connections. (See g_socket_listen() and g_socket_accept() ).
     * <br>In certain situations, you may also want to bind a socket that will be
     * <br>used to initiate connections, though this is not normally required.
     * <br>
     * <br>If &#64;socket is a TCP socket, then &#64;allow_reuse controls the setting
     * <br>of the `SO_REUSEADDR` socket option; normally it should be %TRUE for
     * <br>server sockets (sockets that you will eventually call
     * <br>g_socket_accept() on), and %FALSE for client sockets. (Failing to
     * <br>set this flag on a server socket may cause g_socket_bind() to return
     * <br>%G_IO_ERROR_ADDRESS_IN_USE if the server program is stopped and then
     * <br>immediately restarted.)
     * <br>
     * <br>If &#64;socket is a UDP socket, then &#64;allow_reuse determines whether or
     * <br>not other UDP sockets can be bound to the same address at the same
     * <br>time. In particular, you can have several UDP sockets bound to the
     * <br>same address, and they will all receive all of the multicast and
     * <br>broadcast packets sent to that address. (The behavior of unicast
     * <br>UDP packets to an address with multiple listeners is not defined.)
     * @param address a &#35;GSocketAddress specifying the local address.
     * @param allow_reuse whether to allow reusing this address
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean bind(@Nonnull SocketAddress address, boolean allow_reuse) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_bind(asCPointer(), asCPointerNotNull(address), allow_reuse, 0L);
    }

    /**
     * Checks and resets the pending connect error for the socket.
     * <br>This is used to check for errors when g_socket_connect() is
     * <br>used in non-blocking mode.
     * @return %TRUE if no error, %FALSE otherwise, setting &#64;error to the error
    */
    public boolean checkConnectResult() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_check_connect_result(asCPointer(), 0L);
    }

    /**
     * Closes the socket, shutting down any active connection.
     * <br>
     * <br>Closing a socket does not wait for all outstanding I/O operations
     * <br>to finish, so the caller should not rely on them to be guaranteed
     * <br>to complete even if the close returns with no error.
     * <br>
     * <br>Once the socket is closed, all other operations will return
     * <br>%G_IO_ERROR_CLOSED. Closing a socket multiple times will not
     * <br>return an error.
     * <br>
     * <br>Sockets will be automatically closed when the last reference
     * <br>is dropped, but you might want to call this function to make sure
     * <br>resources are released as early as possible.
     * <br>
     * <br>Beware that due to the way that TCP works, it is possible for
     * <br>recently-sent data to be lost if either you close a socket while the
     * <br>%G_IO_IN condition is set, or else if the remote connection tries to
     * <br>send something to you after you close the socket but before it has
     * <br>finished reading all of the data you sent. There is no easy generic
     * <br>way to avoid this problem; the easiest fix is to design the network
     * <br>protocol such that the client will never send data &quot;out of turn&quot;.
     * <br>Another solution is for the server to half-close the connection by
     * <br>calling g_socket_shutdown() with only the &#64;shutdown_write flag set,
     * <br>and then wait for the client to notice this and close its side of the
     * <br>connection, after which the server can safely call g_socket_close().
     * <br>(This is what &#35;GTcpConnection does if you call
     * <br>g_tcp_connection_set_graceful_disconnect(). But of course, this
     * <br>only works if the client will close its connection after the server
     * <br>does.)
     * @return %TRUE on success, %FALSE on error
    */
    public boolean close() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_close(asCPointer(), 0L);
    }

    /**
     * Checks on the readiness of &#64;socket to perform operations.
     * <br>The operations specified in &#64;condition are checked for and masked
     * <br>against the currently-satisfied conditions on &#64;socket. The result
     * <br>is returned.
     * <br>
     * <br>Note that on Windows, it is possible for an operation to return
     * <br>%G_IO_ERROR_WOULD_BLOCK even immediately after
     * <br>g_socket_condition_check() has claimed that the socket is ready for
     * <br>writing. Rather than calling g_socket_condition_check() and then
     * <br>writing to the socket if it succeeds, it is generally better to
     * <br>simply try writing to the socket right away, and try again later if
     * <br>the initial attempt returns %G_IO_ERROR_WOULD_BLOCK.
     * <br>
     * <br>It is meaningless to specify %G_IO_ERR or %G_IO_HUP in condition;
     * <br>these conditions will always be set in the output if they are true.
     * <br>
     * <br>This call never blocks.
     * @param condition a &#35;GIOCondition mask to check
     * @return the &#64;GIOCondition mask of the current state
    */
    public int conditionCheck(int condition)  {
        return JnaSocket.INST().g_socket_condition_check(asCPointer(), condition);
    }

    /**
     * Waits for up to &#64;timeout_us microseconds for &#64;condition to become true
     * <br>on &#64;socket. If the condition is met, %TRUE is returned.
     * <br>
     * <br>If &#64;cancellable is cancelled before the condition is met, or if
     * <br>&#64;timeout_us (or the socket's &#35;GSocket:timeout) is reached before the
     * <br>condition is met, then %FALSE is returned and &#64;error, if non-%NULL,
     * <br>is set to the appropriate value (%G_IO_ERROR_CANCELLED or
     * <br>%G_IO_ERROR_TIMED_OUT).
     * <br>
     * <br>If you don't want a timeout, use g_socket_condition_wait().
     * <br>(Alternatively, you can pass -1 for &#64;timeout_us.)
     * <br>
     * <br>Note that although &#64;timeout_us is in microseconds for consistency with
     * <br>other GLib APIs, this function actually only has millisecond
     * <br>resolution, and the behavior is undefined if &#64;timeout_us is not an
     * <br>exact number of milliseconds.
     * @param condition a &#35;GIOCondition mask to wait for
     * @param timeout_us the maximum time (in microseconds) to wait, or -1
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return %TRUE if the condition was met, %FALSE otherwise
    */
    public boolean conditionTimedWait(int condition, long timeout_us, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_condition_timed_wait(asCPointer(), condition, timeout_us, asCPointer(cancellable), 0L);
    }

    /**
     * Waits for &#64;condition to become true on &#64;socket. When the condition
     * <br>is met, %TRUE is returned.
     * <br>
     * <br>If &#64;cancellable is cancelled before the condition is met, or if the
     * <br>socket has a timeout set and it is reached before the condition is
     * <br>met, then %FALSE is returned and &#64;error, if non-%NULL, is set to
     * <br>the appropriate value (%G_IO_ERROR_CANCELLED or
     * <br>%G_IO_ERROR_TIMED_OUT).
     * <br>
     * <br>See also g_socket_condition_timed_wait().
     * @param condition a &#35;GIOCondition mask to wait for
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return %TRUE if the condition was met, %FALSE otherwise
    */
    public boolean conditionWait(int condition, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_condition_wait(asCPointer(), condition, asCPointer(cancellable), 0L);
    }

    /**
     * Connect the socket to the specified remote address.
     * <br>
     * <br>For connection oriented socket this generally means we attempt to make
     * <br>a connection to the &#64;address. For a connection-less socket it sets
     * <br>the default address for g_socket_send() and discards all incoming datagrams
     * <br>from other sources.
     * <br>
     * <br>Generally connection oriented sockets can only connect once, but
     * <br>connection-less sockets can connect multiple times to change the
     * <br>default address.
     * <br>
     * <br>If the connect call needs to do network I/O it will block, unless
     * <br>non-blocking I/O is enabled. Then %G_IO_ERROR_PENDING is returned
     * <br>and the user can be notified of the connection finishing by waiting
     * <br>for the G_IO_OUT condition. The result of the connection must then be
     * <br>checked with g_socket_check_connect_result().
     * @param address a &#35;GSocketAddress specifying the remote address.
     * @param cancellable a %GCancellable or %NULL
     * @return %TRUE if connected, %FALSE on error.
    */
    public boolean connect(@Nonnull SocketAddress address, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_connect(asCPointer(), asCPointerNotNull(address), asCPointer(cancellable), 0L);
    }

    /**
     * Creates a &#35;GSocketConnection subclass of the right type for
     * <br>&#64;socket.
     * @return a &#35;GSocketConnection
    */
    public SocketConnection connectionFactoryCreateConnection()  {
        return new SocketConnection(new PointerContainer(JnaSocket.INST().g_socket_connection_factory_create_connection(asCPointer())));
    }

    /**
     * Creates a &#35;GSource that can be attached to a %GMainContext to monitor
     * <br>for the availability of the specified &#64;condition on the socket. The &#35;GSource
     * <br>keeps a reference to the &#64;socket.
     * <br>
     * <br>The callback on the source is of the &#35;GSocketSourceFunc type.
     * <br>
     * <br>It is meaningless to specify %G_IO_ERR or %G_IO_HUP in &#64;condition;
     * <br>these conditions will always be reported output if they are true.
     * <br>
     * <br>&#64;cancellable if not %NULL can be used to cancel the source, which will
     * <br>cause the source to trigger, reporting the current condition (which
     * <br>is likely 0 unless cancellation happened at the same time as a
     * <br>condition change). You can check for this in the callback using
     * <br>g_cancellable_is_cancelled().
     * <br>
     * <br>If &#64;socket has a timeout set, and it is reached before &#64;condition
     * <br>occurs, the source will then trigger anyway, reporting %G_IO_IN or
     * <br>%G_IO_OUT depending on &#64;condition. However, &#64;socket will have been
     * <br>marked as having had a timeout, and so the next &#35;GSocket I/O method
     * <br>you call will then fail with a %G_IO_ERROR_TIMED_OUT.
     * @param condition a &#35;GIOCondition mask to monitor
     * @param cancellable a %GCancellable or %NULL
     * @return a newly allocated %GSource, free with g_source_unref().
    */
    public ch.bailu.gtk.glib.Source createSource(int condition, @Nullable Cancellable cancellable)  {
        return new ch.bailu.gtk.glib.Source(new PointerContainer(JnaSocket.INST().g_socket_create_source(asCPointer(), condition, asCPointer(cancellable))));
    }

    /**
     * Get the amount of data pending in the OS input buffer, without blocking.
     * <br>
     * <br>If &#64;socket is a UDP or SCTP socket, this will return the size of
     * <br>just the next packet, even if additional packets are buffered after
     * <br>that one.
     * <br>
     * <br>Note that on Windows, this function is rather inefficient in the
     * <br>UDP case, and so if you know any plausible upper bound on the size
     * <br>of the incoming packet, it is better to just do a
     * <br>g_socket_receive() with a buffer of that size, rather than calling
     * <br>g_socket_get_available_bytes() first and then doing a receive of
     * <br>exactly the right size.
     * @return the number of bytes that can be read from the socket without blocking or truncating, or -1 on error.
    */
    public long getAvailableBytes()  {
        return JnaSocket.INST().g_socket_get_available_bytes(asCPointer());
    }

    /**
     * Gets the blocking mode of the socket. For details on blocking I/O,
     * <br>see g_socket_set_blocking().
     * @return %TRUE if blocking I/O is used, %FALSE otherwise.
    */
    public boolean getBlocking()  {
        return JnaSocket.INST().g_socket_get_blocking(asCPointer());
    }

    /**
     * Gets the broadcast setting on &#64;socket; if %TRUE,
     * <br>it is possible to send packets to broadcast
     * <br>addresses.
     * @return the broadcast setting on &#64;socket
    */
    public boolean getBroadcast()  {
        return JnaSocket.INST().g_socket_get_broadcast(asCPointer());
    }

    /**
     * Returns the credentials of the foreign process connected to this
     * <br>socket, if any (e.g. it is only supported for %G_SOCKET_FAMILY_UNIX
     * <br>sockets).
     * <br>
     * <br>If this operation isn't supported on the OS, the method fails with
     * <br>the %G_IO_ERROR_NOT_SUPPORTED error. On Linux this is implemented
     * <br>by reading the %SO_PEERCRED option on the underlying socket.
     * <br>
     * <br>This method can be expected to be available on the following platforms:
     * <br>
     * <br>- Linux since GLib 2.26
     * <br>- OpenBSD since GLib 2.30
     * <br>- Solaris, Illumos and OpenSolaris since GLib 2.40
     * <br>- NetBSD since GLib 2.42
     * <br>- macOS, tvOS, iOS since GLib 2.66
     * <br>
     * <br>Other ways to obtain credentials from a foreign peer includes the
     * <br>&#35;GUnixCredentialsMessage type and
     * <br>g_unix_connection_send_credentials() /
     * <br>g_unix_connection_receive_credentials() functions.
     * @return %NULL if &#64;error is set, otherwise a &#35;GCredentials object that must be freed with g_object_unref().
    */
    public Credentials getCredentials() throws ch.bailu.gtk.type.exception.AllocationError {
        return new Credentials(new PointerContainer(JnaSocket.INST().g_socket_get_credentials(asCPointer(), 0L)));
    }

    /**
     * Gets the socket family of the socket.
     * @return a &#35;GSocketFamily
    */
    public int getFamily()  {
        return JnaSocket.INST().g_socket_get_family(asCPointer());
    }

    /**
     * Returns the underlying OS socket object. On unix this
     * <br>is a socket file descriptor, and on Windows this is
     * <br>a Winsock2 SOCKET handle. This may be useful for
     * <br>doing platform specific or otherwise unusual operations
     * <br>on the socket.
     * @return the file descriptor of the socket.
    */
    public int getFd()  {
        return JnaSocket.INST().g_socket_get_fd(asCPointer());
    }

    /**
     * Gets the keepalive mode of the socket. For details on this,
     * <br>see g_socket_set_keepalive().
     * @return %TRUE if keepalive is active, %FALSE otherwise.
    */
    public boolean getKeepalive()  {
        return JnaSocket.INST().g_socket_get_keepalive(asCPointer());
    }

    /**
     * Gets the listen backlog setting of the socket. For details on this,
     * <br>see g_socket_set_listen_backlog().
     * @return the maximum number of pending connections.
    */
    public int getListenBacklog()  {
        return JnaSocket.INST().g_socket_get_listen_backlog(asCPointer());
    }

    /**
     * Try to get the local address of a bound socket. This is only
     * <br>useful if the socket has been bound to a local address,
     * <br>either explicitly or implicitly when connecting.
     * @return a &#35;GSocketAddress or %NULL on error.     Free the returned object with g_object_unref().
    */
    public SocketAddress getLocalAddress() throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketAddress(new PointerContainer(JnaSocket.INST().g_socket_get_local_address(asCPointer(), 0L)));
    }

    /**
     * Gets the multicast loopback setting on &#64;socket; if %TRUE (the
     * <br>default), outgoing multicast packets will be looped back to
     * <br>multicast listeners on the same host.
     * @return the multicast loopback setting on &#64;socket
    */
    public boolean getMulticastLoopback()  {
        return JnaSocket.INST().g_socket_get_multicast_loopback(asCPointer());
    }

    /**
     * Gets the multicast time-to-live setting on &#64;socket; see
     * <br>g_socket_set_multicast_ttl() for more details.
     * @return the multicast time-to-live setting on &#64;socket
    */
    public int getMulticastTtl()  {
        return JnaSocket.INST().g_socket_get_multicast_ttl(asCPointer());
    }

    /**
     * Gets the value of an integer-valued option on &#64;socket, as with
     * <br>getsockopt(). (If you need to fetch a  non-integer-valued option,
     * <br>you will need to call getsockopt() directly.)
     * <br>
     * <br>The [&lt;gio/gnetworking.h&gt;][gio-gnetworking.h]
     * <br>header pulls in system headers that will define most of the
     * <br>standard/portable socket options. For unusual socket protocols or
     * <br>platform-dependent options, you may need to include additional
     * <br>headers.
     * <br>
     * <br>Note that even for socket options that are a single byte in size,
     * <br>&#64;value is still a pointer to a &#35;gint variable, not a &#35;guchar;
     * <br>g_socket_get_option() will handle the conversion internally.
     * @param level the &quot;API level&quot; of the option (eg, `SOL_SOCKET`)
     * @param optname the &quot;name&quot; of the option (eg, `SO_BROADCAST`)
     * @param value return location for the option value
     * @return success or failure. On failure, &#64;error will be set, and   the system error value (`errno` or WSAGetLastError()) will still   be set to the result of the getsockopt() call.
    */
    public boolean getOption(int level, int optname, @Nonnull ch.bailu.gtk.type.Int value) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_get_option(asCPointer(), level, optname, asCPointerNotNull(value), 0L);
    }

    /**
     * Gets the socket protocol id the socket was created with.
     * <br>In case the protocol is unknown, -1 is returned.
     * @return a protocol id, or -1 if unknown
    */
    public int getProtocol()  {
        return JnaSocket.INST().g_socket_get_protocol(asCPointer());
    }

    /**
     * Try to get the remote address of a connected socket. This is only
     * <br>useful for connection oriented sockets that have been connected.
     * @return a &#35;GSocketAddress or %NULL on error.     Free the returned object with g_object_unref().
    */
    public SocketAddress getRemoteAddress() throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketAddress(new PointerContainer(JnaSocket.INST().g_socket_get_remote_address(asCPointer(), 0L)));
    }

    /**
     * Gets the socket type of the socket.
     * @return a &#35;GSocketType
    */
    public int getSocketType()  {
        return JnaSocket.INST().g_socket_get_socket_type(asCPointer());
    }

    /**
     * Gets the timeout setting of the socket. For details on this, see
     * <br>g_socket_set_timeout().
     * @return the timeout in seconds
    */
    public int getTimeout()  {
        return JnaSocket.INST().g_socket_get_timeout(asCPointer());
    }

    /**
     * Gets the unicast time-to-live setting on &#64;socket; see
     * <br>g_socket_set_ttl() for more details.
     * @return the time-to-live setting on &#64;socket
    */
    public int getTtl()  {
        return JnaSocket.INST().g_socket_get_ttl(asCPointer());
    }

    /**
     * Checks whether a socket is closed.
     * @return %TRUE if socket is closed, %FALSE otherwise
    */
    public boolean isClosed()  {
        return JnaSocket.INST().g_socket_is_closed(asCPointer());
    }

    /**
     * Check whether the socket is connected. This is only useful for
     * <br>connection-oriented sockets.
     * <br>
     * <br>If using g_socket_shutdown(), this function will return %TRUE until the
     * <br>socket has been shut down for reading and writing. If you do a non-blocking
     * <br>connect, this function will not return %TRUE until after you call
     * <br>g_socket_check_connect_result().
     * @return %TRUE if socket is connected, %FALSE otherwise.
    */
    public boolean isConnected()  {
        return JnaSocket.INST().g_socket_is_connected(asCPointer());
    }

    /**
     * Registers &#64;socket to receive multicast messages sent to &#64;group.
     * <br>&#64;socket must be a %G_SOCKET_TYPE_DATAGRAM socket, and must have
     * <br>been bound to an appropriate interface and port with
     * <br>g_socket_bind().
     * <br>
     * <br>If &#64;iface is %NULL, the system will automatically pick an interface
     * <br>to bind to based on &#64;group.
     * <br>
     * <br>If &#64;source_specific is %TRUE, source-specific multicast as defined
     * <br>in RFC 4604 is used. Note that on older platforms this may fail
     * <br>with a %G_IO_ERROR_NOT_SUPPORTED error.
     * <br>
     * <br>To bind to a given source-specific multicast address, use
     * <br>g_socket_join_multicast_group_ssm() instead.
     * @param group a &#35;GInetAddress specifying the group address to join.
     * @param source_specific %TRUE if source-specific multicast should be used
     * @param iface Name of the interface to use, or %NULL
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean joinMulticastGroup(@Nonnull InetAddress group, boolean source_specific, @Nullable ch.bailu.gtk.type.Str iface) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_join_multicast_group(asCPointer(), asCPointerNotNull(group), source_specific, asCPointer(iface), 0L);
    }

    /**
     * Registers &#64;socket to receive multicast messages sent to &#64;group.
     * <br>&#64;socket must be a %G_SOCKET_TYPE_DATAGRAM socket, and must have
     * <br>been bound to an appropriate interface and port with
     * <br>g_socket_bind().
     * <br>
     * <br>If &#64;iface is %NULL, the system will automatically pick an interface
     * <br>to bind to based on &#64;group.
     * <br>
     * <br>If &#64;source_specific is %TRUE, source-specific multicast as defined
     * <br>in RFC 4604 is used. Note that on older platforms this may fail
     * <br>with a %G_IO_ERROR_NOT_SUPPORTED error.
     * <br>
     * <br>To bind to a given source-specific multicast address, use
     * <br>g_socket_join_multicast_group_ssm() instead.
     * @param group a &#35;GInetAddress specifying the group address to join.
     * @param source_specific %TRUE if source-specific multicast should be used
     * @param iface Name of the interface to use, or %NULL
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean joinMulticastGroup(@Nonnull InetAddress group, boolean source_specific, String iface) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_join_multicast_group(asCPointer(), asCPointerNotNull(group), source_specific, iface, 0L);
    }

    /**
     * Registers &#64;socket to receive multicast messages sent to &#64;group.
     * <br>&#64;socket must be a %G_SOCKET_TYPE_DATAGRAM socket, and must have
     * <br>been bound to an appropriate interface and port with
     * <br>g_socket_bind().
     * <br>
     * <br>If &#64;iface is %NULL, the system will automatically pick an interface
     * <br>to bind to based on &#64;group.
     * <br>
     * <br>If &#64;source_specific is not %NULL, use source-specific multicast as
     * <br>defined in RFC 4604. Note that on older platforms this may fail
     * <br>with a %G_IO_ERROR_NOT_SUPPORTED error.
     * <br>
     * <br>Note that this function can be called multiple times for the same
     * <br>&#64;group with different &#64;source_specific in order to receive multicast
     * <br>packets from more than one source.
     * @param group a &#35;GInetAddress specifying the group address to join.
     * @param source_specific a &#35;GInetAddress specifying the source-specific multicast address or %NULL to ignore.
     * @param iface Name of the interface to use, or %NULL
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean joinMulticastGroupSsm(@Nonnull InetAddress group, @Nullable InetAddress source_specific, @Nullable ch.bailu.gtk.type.Str iface) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_join_multicast_group_ssm(asCPointer(), asCPointerNotNull(group), asCPointer(source_specific), asCPointer(iface), 0L);
    }

    /**
     * Registers &#64;socket to receive multicast messages sent to &#64;group.
     * <br>&#64;socket must be a %G_SOCKET_TYPE_DATAGRAM socket, and must have
     * <br>been bound to an appropriate interface and port with
     * <br>g_socket_bind().
     * <br>
     * <br>If &#64;iface is %NULL, the system will automatically pick an interface
     * <br>to bind to based on &#64;group.
     * <br>
     * <br>If &#64;source_specific is not %NULL, use source-specific multicast as
     * <br>defined in RFC 4604. Note that on older platforms this may fail
     * <br>with a %G_IO_ERROR_NOT_SUPPORTED error.
     * <br>
     * <br>Note that this function can be called multiple times for the same
     * <br>&#64;group with different &#64;source_specific in order to receive multicast
     * <br>packets from more than one source.
     * @param group a &#35;GInetAddress specifying the group address to join.
     * @param source_specific a &#35;GInetAddress specifying the source-specific multicast address or %NULL to ignore.
     * @param iface Name of the interface to use, or %NULL
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean joinMulticastGroupSsm(@Nonnull InetAddress group, @Nullable InetAddress source_specific, String iface) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_join_multicast_group_ssm(asCPointer(), asCPointerNotNull(group), asCPointer(source_specific), iface, 0L);
    }

    /**
     * Removes &#64;socket from the multicast group defined by &#64;group, &#64;iface,
     * <br>and &#64;source_specific (which must all have the same values they had
     * <br>when you joined the group).
     * <br>
     * <br>&#64;socket remains bound to its address and port, and can still receive
     * <br>unicast messages after calling this.
     * <br>
     * <br>To unbind to a given source-specific multicast address, use
     * <br>g_socket_leave_multicast_group_ssm() instead.
     * @param group a &#35;GInetAddress specifying the group address to leave.
     * @param source_specific %TRUE if source-specific multicast was used
     * @param iface Interface used
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean leaveMulticastGroup(@Nonnull InetAddress group, boolean source_specific, @Nullable ch.bailu.gtk.type.Str iface) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_leave_multicast_group(asCPointer(), asCPointerNotNull(group), source_specific, asCPointer(iface), 0L);
    }

    /**
     * Removes &#64;socket from the multicast group defined by &#64;group, &#64;iface,
     * <br>and &#64;source_specific (which must all have the same values they had
     * <br>when you joined the group).
     * <br>
     * <br>&#64;socket remains bound to its address and port, and can still receive
     * <br>unicast messages after calling this.
     * <br>
     * <br>To unbind to a given source-specific multicast address, use
     * <br>g_socket_leave_multicast_group_ssm() instead.
     * @param group a &#35;GInetAddress specifying the group address to leave.
     * @param source_specific %TRUE if source-specific multicast was used
     * @param iface Interface used
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean leaveMulticastGroup(@Nonnull InetAddress group, boolean source_specific, String iface) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_leave_multicast_group(asCPointer(), asCPointerNotNull(group), source_specific, iface, 0L);
    }

    /**
     * Removes &#64;socket from the multicast group defined by &#64;group, &#64;iface,
     * <br>and &#64;source_specific (which must all have the same values they had
     * <br>when you joined the group).
     * <br>
     * <br>&#64;socket remains bound to its address and port, and can still receive
     * <br>unicast messages after calling this.
     * @param group a &#35;GInetAddress specifying the group address to leave.
     * @param source_specific a &#35;GInetAddress specifying the source-specific multicast address or %NULL to ignore.
     * @param iface Name of the interface to use, or %NULL
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean leaveMulticastGroupSsm(@Nonnull InetAddress group, @Nullable InetAddress source_specific, @Nullable ch.bailu.gtk.type.Str iface) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_leave_multicast_group_ssm(asCPointer(), asCPointerNotNull(group), asCPointer(source_specific), asCPointer(iface), 0L);
    }

    /**
     * Removes &#64;socket from the multicast group defined by &#64;group, &#64;iface,
     * <br>and &#64;source_specific (which must all have the same values they had
     * <br>when you joined the group).
     * <br>
     * <br>&#64;socket remains bound to its address and port, and can still receive
     * <br>unicast messages after calling this.
     * @param group a &#35;GInetAddress specifying the group address to leave.
     * @param source_specific a &#35;GInetAddress specifying the source-specific multicast address or %NULL to ignore.
     * @param iface Name of the interface to use, or %NULL
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean leaveMulticastGroupSsm(@Nonnull InetAddress group, @Nullable InetAddress source_specific, String iface) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_leave_multicast_group_ssm(asCPointer(), asCPointerNotNull(group), asCPointer(source_specific), iface, 0L);
    }

    /**
     * Marks the socket as a server socket, i.e. a socket that is used
     * <br>to accept incoming requests using g_socket_accept().
     * <br>
     * <br>Before calling this the socket must be bound to a local address using
     * <br>g_socket_bind().
     * <br>
     * <br>To set the maximum amount of outstanding clients, use
     * <br>g_socket_set_listen_backlog().
     * @return %TRUE on success, %FALSE on error.
    */
    public boolean listen() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_listen(asCPointer(), 0L);
    }

    /**
     * Receive data (up to &#64;size bytes) from a socket. This is mainly used by
     * <br>connection-oriented sockets; it is identical to g_socket_receive_from()
     * <br>with &#64;address set to %NULL.
     * <br>
     * <br>For %G_SOCKET_TYPE_DATAGRAM and %G_SOCKET_TYPE_SEQPACKET sockets,
     * <br>g_socket_receive() will always read either 0 or 1 complete messages from
     * <br>the socket. If the received message is too large to fit in &#64;buffer, then
     * <br>the data beyond &#64;size bytes will be discarded, without any explicit
     * <br>indication that this has occurred.
     * <br>
     * <br>For %G_SOCKET_TYPE_STREAM sockets, g_socket_receive() can return any
     * <br>number of bytes, up to &#64;size. If more than &#64;size bytes have been
     * <br>received, the additional data will be returned in future calls to
     * <br>g_socket_receive().
     * <br>
     * <br>If the socket is in blocking mode the call will block until there
     * <br>is some data to receive, the connection is closed, or there is an
     * <br>error. If there is no data available and the socket is in
     * <br>non-blocking mode, a %G_IO_ERROR_WOULD_BLOCK error will be
     * <br>returned. To be notified when data is available, wait for the
     * <br>%G_IO_IN condition.
     * <br>
     * <br>On error -1 is returned and &#64;error is set accordingly.
     * @param buffer      a buffer to read data into (which should be at least &#64;size bytes long).
     * @param size the number of bytes you want to read from the socket
     * @param cancellable a %GCancellable or %NULL
     * @return Number of bytes read, or 0 if the connection was closed by the peer, or -1 on error
    */
    public long receive(@Nonnull ch.bailu.gtk.type.Str buffer, long size, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_receive(asCPointer(), asCPointerNotNull(buffer), size, asCPointer(cancellable), 0L);
    }

    /**
     * This behaves exactly the same as g_socket_receive(), except that
     * <br>the choice of blocking or non-blocking behavior is determined by
     * <br>the &#64;blocking argument rather than by &#64;socket's properties.
     * @param buffer      a buffer to read data into (which should be at least &#64;size bytes long).
     * @param size the number of bytes you want to read from the socket
     * @param blocking whether to do blocking or non-blocking I/O
     * @param cancellable a %GCancellable or %NULL
     * @return Number of bytes read, or 0 if the connection was closed by the peer, or -1 on error
    */
    public long receiveWithBlocking(@Nonnull ch.bailu.gtk.type.Str buffer, long size, boolean blocking, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_receive_with_blocking(asCPointer(), asCPointerNotNull(buffer), size, blocking, asCPointer(cancellable), 0L);
    }

    /**
     * Tries to send &#64;size bytes from &#64;buffer on the socket. This is
     * <br>mainly used by connection-oriented sockets; it is identical to
     * <br>g_socket_send_to() with &#64;address set to %NULL.
     * <br>
     * <br>If the socket is in blocking mode the call will block until there is
     * <br>space for the data in the socket queue. If there is no space available
     * <br>and the socket is in non-blocking mode a %G_IO_ERROR_WOULD_BLOCK error
     * <br>will be returned. To be notified when space is available, wait for the
     * <br>%G_IO_OUT condition. Note though that you may still receive
     * <br>%G_IO_ERROR_WOULD_BLOCK from g_socket_send() even if you were previously
     * <br>notified of a %G_IO_OUT condition. (On Windows in particular, this is
     * <br>very common due to the way the underlying APIs work.)
     * <br>
     * <br>On error -1 is returned and &#64;error is set accordingly.
     * @param buffer the buffer     containing the data to send.
     * @param size the number of bytes to send
     * @param cancellable a %GCancellable or %NULL
     * @return Number of bytes written (which may be less than &#64;size), or -1 on error
    */
    public long send(@Nonnull ch.bailu.gtk.type.Str buffer, long size, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_send(asCPointer(), asCPointerNotNull(buffer), size, asCPointer(cancellable), 0L);
    }

    /**
     * Tries to send &#64;size bytes from &#64;buffer on the socket. This is
     * <br>mainly used by connection-oriented sockets; it is identical to
     * <br>g_socket_send_to() with &#64;address set to %NULL.
     * <br>
     * <br>If the socket is in blocking mode the call will block until there is
     * <br>space for the data in the socket queue. If there is no space available
     * <br>and the socket is in non-blocking mode a %G_IO_ERROR_WOULD_BLOCK error
     * <br>will be returned. To be notified when space is available, wait for the
     * <br>%G_IO_OUT condition. Note though that you may still receive
     * <br>%G_IO_ERROR_WOULD_BLOCK from g_socket_send() even if you were previously
     * <br>notified of a %G_IO_OUT condition. (On Windows in particular, this is
     * <br>very common due to the way the underlying APIs work.)
     * <br>
     * <br>On error -1 is returned and &#64;error is set accordingly.
     * @param buffer the buffer     containing the data to send.
     * @param size the number of bytes to send
     * @param cancellable a %GCancellable or %NULL
     * @return Number of bytes written (which may be less than &#64;size), or -1 on error
    */
    public long send(String buffer, long size, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_send(asCPointer(), buffer, size, asCPointer(cancellable), 0L);
    }

    /**
     * Tries to send &#64;size bytes from &#64;buffer to &#64;address. If &#64;address is
     * <br>%NULL then the message is sent to the default receiver (set by
     * <br>g_socket_connect()).
     * <br>
     * <br>See g_socket_send() for additional information.
     * @param address a &#35;GSocketAddress, or %NULL
     * @param buffer the buffer     containing the data to send.
     * @param size the number of bytes to send
     * @param cancellable a %GCancellable or %NULL
     * @return Number of bytes written (which may be less than &#64;size), or -1 on error
    */
    public long sendTo(@Nullable SocketAddress address, @Nonnull ch.bailu.gtk.type.Str buffer, long size, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_send_to(asCPointer(), asCPointer(address), asCPointerNotNull(buffer), size, asCPointer(cancellable), 0L);
    }

    /**
     * Tries to send &#64;size bytes from &#64;buffer to &#64;address. If &#64;address is
     * <br>%NULL then the message is sent to the default receiver (set by
     * <br>g_socket_connect()).
     * <br>
     * <br>See g_socket_send() for additional information.
     * @param address a &#35;GSocketAddress, or %NULL
     * @param buffer the buffer     containing the data to send.
     * @param size the number of bytes to send
     * @param cancellable a %GCancellable or %NULL
     * @return Number of bytes written (which may be less than &#64;size), or -1 on error
    */
    public long sendTo(@Nullable SocketAddress address, String buffer, long size, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_send_to(asCPointer(), asCPointer(address), buffer, size, asCPointer(cancellable), 0L);
    }

    /**
     * This behaves exactly the same as g_socket_send(), except that
     * <br>the choice of blocking or non-blocking behavior is determined by
     * <br>the &#64;blocking argument rather than by &#64;socket's properties.
     * @param buffer the buffer     containing the data to send.
     * @param size the number of bytes to send
     * @param blocking whether to do blocking or non-blocking I/O
     * @param cancellable a %GCancellable or %NULL
     * @return Number of bytes written (which may be less than &#64;size), or -1 on error
    */
    public long sendWithBlocking(@Nonnull ch.bailu.gtk.type.Str buffer, long size, boolean blocking, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_send_with_blocking(asCPointer(), asCPointerNotNull(buffer), size, blocking, asCPointer(cancellable), 0L);
    }

    /**
     * This behaves exactly the same as g_socket_send(), except that
     * <br>the choice of blocking or non-blocking behavior is determined by
     * <br>the &#64;blocking argument rather than by &#64;socket's properties.
     * @param buffer the buffer     containing the data to send.
     * @param size the number of bytes to send
     * @param blocking whether to do blocking or non-blocking I/O
     * @param cancellable a %GCancellable or %NULL
     * @return Number of bytes written (which may be less than &#64;size), or -1 on error
    */
    public long sendWithBlocking(String buffer, long size, boolean blocking, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_send_with_blocking(asCPointer(), buffer, size, blocking, asCPointer(cancellable), 0L);
    }

    /**
     * Sets the blocking mode of the socket. In blocking mode
     * <br>all operations (which don’t take an explicit blocking parameter) block until
     * <br>they succeed or there is an error. In
     * <br>non-blocking mode all functions return results immediately or
     * <br>with a %G_IO_ERROR_WOULD_BLOCK error.
     * <br>
     * <br>All sockets are created in blocking mode. However, note that the
     * <br>platform level socket is always non-blocking, and blocking mode
     * <br>is a GSocket level feature.
     * @param blocking Whether to use blocking I/O or not.
    */
    public void setBlocking(boolean blocking)  {
        JnaSocket.INST().g_socket_set_blocking(asCPointer(), blocking);
    }

    /**
     * Sets whether &#64;socket should allow sending to broadcast addresses.
     * <br>This is %FALSE by default.
     * @param broadcast whether &#64;socket should allow sending to broadcast     addresses
    */
    public void setBroadcast(boolean broadcast)  {
        JnaSocket.INST().g_socket_set_broadcast(asCPointer(), broadcast);
    }

    /**
     * Sets or unsets the %SO_KEEPALIVE flag on the underlying socket. When
     * <br>this flag is set on a socket, the system will attempt to verify that the
     * <br>remote socket endpoint is still present if a sufficiently long period of
     * <br>time passes with no data being exchanged. If the system is unable to
     * <br>verify the presence of the remote endpoint, it will automatically close
     * <br>the connection.
     * <br>
     * <br>This option is only functional on certain kinds of sockets. (Notably,
     * <br>%G_SOCKET_PROTOCOL_TCP sockets.)
     * <br>
     * <br>The exact time between pings is system- and protocol-dependent, but will
     * <br>normally be at least two hours. Most commonly, you would set this flag
     * <br>on a server socket if you want to allow clients to remain idle for long
     * <br>periods of time, but also want to ensure that connections are eventually
     * <br>garbage-collected if clients crash or become unreachable.
     * @param keepalive Value for the keepalive flag
    */
    public void setKeepalive(boolean keepalive)  {
        JnaSocket.INST().g_socket_set_keepalive(asCPointer(), keepalive);
    }

    /**
     * Sets the maximum number of outstanding connections allowed
     * <br>when listening on this socket. If more clients than this are
     * <br>connecting to the socket and the application is not handling them
     * <br>on time then the new connections will be refused.
     * <br>
     * <br>Note that this must be called before g_socket_listen() and has no
     * <br>effect if called after that.
     * @param backlog the maximum number of pending connections.
    */
    public void setListenBacklog(int backlog)  {
        JnaSocket.INST().g_socket_set_listen_backlog(asCPointer(), backlog);
    }

    /**
     * Sets whether outgoing multicast packets will be received by sockets
     * <br>listening on that multicast address on the same host. This is %TRUE
     * <br>by default.
     * @param loopback whether &#64;socket should receive messages sent to its   multicast groups from the local host
    */
    public void setMulticastLoopback(boolean loopback)  {
        JnaSocket.INST().g_socket_set_multicast_loopback(asCPointer(), loopback);
    }

    /**
     * Sets the time-to-live for outgoing multicast datagrams on &#64;socket.
     * <br>By default, this is 1, meaning that multicast packets will not leave
     * <br>the local network.
     * @param ttl the time-to-live value for all multicast datagrams on &#64;socket
    */
    public void setMulticastTtl(int ttl)  {
        JnaSocket.INST().g_socket_set_multicast_ttl(asCPointer(), ttl);
    }

    /**
     * Sets the value of an integer-valued option on &#64;socket, as with
     * <br>setsockopt(). (If you need to set a non-integer-valued option,
     * <br>you will need to call setsockopt() directly.)
     * <br>
     * <br>The [&lt;gio/gnetworking.h&gt;][gio-gnetworking.h]
     * <br>header pulls in system headers that will define most of the
     * <br>standard/portable socket options. For unusual socket protocols or
     * <br>platform-dependent options, you may need to include additional
     * <br>headers.
     * @param level the &quot;API level&quot; of the option (eg, `SOL_SOCKET`)
     * @param optname the &quot;name&quot; of the option (eg, `SO_BROADCAST`)
     * @param value the value to set the option to
     * @return success or failure. On failure, &#64;error will be set, and   the system error value (`errno` or WSAGetLastError()) will still   be set to the result of the setsockopt() call.
    */
    public boolean setOption(int level, int optname, int value) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_set_option(asCPointer(), level, optname, value, 0L);
    }

    /**
     * Sets the time in seconds after which I/O operations on &#64;socket will
     * <br>time out if they have not yet completed.
     * <br>
     * <br>On a blocking socket, this means that any blocking &#35;GSocket
     * <br>operation will time out after &#64;timeout seconds of inactivity,
     * <br>returning %G_IO_ERROR_TIMED_OUT.
     * <br>
     * <br>On a non-blocking socket, calls to g_socket_condition_wait() will
     * <br>also fail with %G_IO_ERROR_TIMED_OUT after the given time. Sources
     * <br>created with g_socket_create_source() will trigger after
     * <br>&#64;timeout seconds of inactivity, with the requested condition
     * <br>set, at which point calling g_socket_receive(), g_socket_send(),
     * <br>g_socket_check_connect_result(), etc, will fail with
     * <br>%G_IO_ERROR_TIMED_OUT.
     * <br>
     * <br>If &#64;timeout is 0 (the default), operations will never time out
     * <br>on their own.
     * <br>
     * <br>Note that if an I/O operation is interrupted by a signal, this may
     * <br>cause the timeout to be reset.
     * @param timeout the timeout for &#64;socket, in seconds, or 0 for none
    */
    public void setTimeout(int timeout)  {
        JnaSocket.INST().g_socket_set_timeout(asCPointer(), timeout);
    }

    /**
     * Sets the time-to-live for outgoing unicast packets on &#64;socket.
     * <br>By default the platform-specific default value is used.
     * @param ttl the time-to-live value for all unicast packets on &#64;socket
    */
    public void setTtl(int ttl)  {
        JnaSocket.INST().g_socket_set_ttl(asCPointer(), ttl);
    }

    /**
     * Shut down part or all of a full-duplex connection.
     * <br>
     * <br>If &#64;shutdown_read is %TRUE then the receiving side of the connection
     * <br>is shut down, and further reading is disallowed.
     * <br>
     * <br>If &#64;shutdown_write is %TRUE then the sending side of the connection
     * <br>is shut down, and further writing is disallowed.
     * <br>
     * <br>It is allowed for both &#64;shutdown_read and &#64;shutdown_write to be %TRUE.
     * <br>
     * <br>One example where it is useful to shut down only one side of a connection is
     * <br>graceful disconnect for TCP connections where you close the sending side,
     * <br>then wait for the other side to close the connection, thus ensuring that the
     * <br>other side saw all sent data.
     * @param shutdown_read whether to shut down the read side
     * @param shutdown_write whether to shut down the write side
     * @return %TRUE on success, %FALSE on error
    */
    public boolean shutdown(boolean shutdown_read, boolean shutdown_write) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocket.INST().g_socket_shutdown(asCPointer(), shutdown_read, shutdown_write, 0L);
    }

    /**
     * Checks if a socket is capable of speaking IPv4.
     * <br>
     * <br>IPv4 sockets are capable of speaking IPv4.  On some operating systems
     * <br>and under some combinations of circumstances IPv6 sockets are also
     * <br>capable of speaking IPv4.  See RFC 3493 section 3.7 for more
     * <br>information.
     * <br>
     * <br>No other types of sockets are currently considered as being capable
     * <br>of speaking IPv4.
     * @return %TRUE if this socket can be used with IPv4.
    */
    public boolean speaksIpv4()  {
        return JnaSocket.INST().g_socket_speaks_ipv4(asCPointer());
    }

    /**
     * Implements interface {@link DatagramBased}. Call this to get access to interface functions.
     * @return {@link DatagramBased}
    */
    public DatagramBased asDatagramBased() {
        return new DatagramBased(cast());
    }

    /**
     * Implements interface {@link Initable}. Call this to get access to interface functions.
     * @return {@link Initable}
    */
    public Initable asInitable() {
        return new Initable(cast());
    }

    public static long getTypeID() { 
        return JnaSocket.INST().g_socket_get_type(); 
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

[MethodModel:java-type-not-supported:receiveFrom:[ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GSocketAddress**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:receiveMessage:[ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GSocketAddress**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GInputVector*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GSocketControlMessage***}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:java-type-not-supported:receiveMessages:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GInputMessage*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:sendMessage:[ParameterModel:Supported:{G_::{c:gssize}}:{j:long}]]
        [ParameterModel:Supported:{Gg:SocketAddress:{c:GSocketAddress*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GOutputVector*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GSocketControlMessage**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:sendMessageWithTimeout:[ParameterModel:Supported:{G_::{c:GPollableReturn}}:{j:int}]]
        [ParameterModel:Supported:{Gg:SocketAddress:{c:GSocketAddress*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GOutputVector*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GSocketControlMessage**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:java-type-not-supported:sendMessages:[ParameterModel:Supported:{G_::{c:gint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GOutputMessage*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
*/
