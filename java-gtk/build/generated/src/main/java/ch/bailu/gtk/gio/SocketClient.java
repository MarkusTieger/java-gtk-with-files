/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GSocketClient is a lightweight high-level utility class for connecting to
 * <br>a network host using a connection oriented socket type.
 * <br>
 * <br>You create a &#35;GSocketClient object, set any options you want, and then
 * <br>call a sync or async connect operation, which returns a &#35;GSocketConnection
 * <br>subclass on success.
 * <br>
 * <br>The type of the &#35;GSocketConnection object returned depends on the type of
 * <br>the underlying socket that is in use. For instance, for a TCP/IP connection
 * <br>it will be a &#35;GTcpConnection.
 * <br>
 * <br>As &#35;GSocketClient is a lightweight object, you don't need to cache it. You
 * <br>can just create a new one any time you need one.
 * <p><a href="https://docs.gtk.org/gio/class.SocketClient.html">https://docs.gtk.org/gio/class.SocketClient.html</a></p>
*/
public class SocketClient extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SocketClient.class.getCanonicalName());
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
    
    private static JnaSocketClient.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaSocketClient.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEvent {
        /**
         * Emitted when &#64;client's activity on &#64;connectable changes state.
         * <br>Among other things, this can be used to provide progress
         * <br>information about a network connection in the UI. The meanings of
         * <br>the different &#64;event values are as follows:
         * <br>
         * <br>- %G_SOCKET_CLIENT_RESOLVING: &#64;client is about to look up &#64;connectable
         * <br>  in DNS. &#64;connection will be %NULL.
         * <br>
         * <br>- %G_SOCKET_CLIENT_RESOLVED:  &#64;client has successfully resolved
         * <br>  &#64;connectable in DNS. &#64;connection will be %NULL.
         * <br>
         * <br>- %G_SOCKET_CLIENT_CONNECTING: &#64;client is about to make a connection
         * <br>  to a remote host; either a proxy server or the destination server
         * <br>  itself. &#64;connection is the &#35;GSocketConnection, which is not yet
         * <br>  connected.  Since GLib 2.40, you can access the remote
         * <br>  address via g_socket_connection_get_remote_address().
         * <br>
         * <br>- %G_SOCKET_CLIENT_CONNECTED: &#64;client has successfully connected
         * <br>  to a remote host. &#64;connection is the connected &#35;GSocketConnection.
         * <br>
         * <br>- %G_SOCKET_CLIENT_PROXY_NEGOTIATING: &#64;client is about to negotiate
         * <br>  with a proxy to get it to connect to &#64;connectable. &#64;connection is
         * <br>  the &#35;GSocketConnection to the proxy server.
         * <br>
         * <br>- %G_SOCKET_CLIENT_PROXY_NEGOTIATED: &#64;client has negotiated a
         * <br>  connection to &#64;connectable through a proxy server. &#64;connection is
         * <br>  the stream returned from g_proxy_connect(), which may or may not
         * <br>  be a &#35;GSocketConnection.
         * <br>
         * <br>- %G_SOCKET_CLIENT_TLS_HANDSHAKING: &#64;client is about to begin a TLS
         * <br>  handshake. &#64;connection is a &#35;GTlsClientConnection.
         * <br>
         * <br>- %G_SOCKET_CLIENT_TLS_HANDSHAKED: &#64;client has successfully completed
         * <br>  the TLS handshake. &#64;connection is a &#35;GTlsClientConnection.
         * <br>
         * <br>- %G_SOCKET_CLIENT_COMPLETE: &#64;client has either successfully connected
         * <br>  to &#64;connectable (in which case &#64;connection is the &#35;GSocketConnection
         * <br>  that it will be returning to the caller) or has failed (in which
         * <br>  case &#64;connection is %NULL and the client is about to return an error).
         * <br>
         * <br>Each event except %G_SOCKET_CLIENT_COMPLETE may be emitted
         * <br>multiple times (or not at all) for a given connectable (in
         * <br>particular, if &#64;client ends up attempting to connect to more than
         * <br>one address). However, if &#64;client emits the &#35;GSocketClient::event
         * <br>signal at all for a given connectable, then it will always emit
         * <br>it with %G_SOCKET_CLIENT_COMPLETE when it is done.
         * <br>
         * <br>Note that there may be additional &#35;GSocketClientEvent values in
         * <br>the future; unrecognized &#64;event values should be ignored.
         * @param event the event that is occurring
         * @param connectable the &#35;GSocketConnectable that &#64;event is occurring on
         * @param connection the current representation of the connection
        */
        void onEvent(int event, @Nonnull SocketConnectable connectable, @Nullable IOStream connection);
    }
    
    private static com.sun.jna.Callback toOnEvent(OnEvent in) {
        return (in == null) ? null: (JnaSocketClient.OnEvent) (__self, _event, _connectable, _connection, __data) -> in.onEvent(_event, new SocketConnectable(new PointerContainer(_connectable)), new IOStream(new PointerContainer(_connection)));
    }

    public SocketClient(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GSocketClient with the default options.
    */
    public SocketClient() {
        super(cast(JnaSocketClient.INST().g_socket_client_new()));
    }

    /**
     * Enable proxy protocols to be handled by the application. When the
     * <br>indicated proxy protocol is returned by the &#35;GProxyResolver,
     * <br>&#35;GSocketClient will consider this protocol as supported but will
     * <br>not try to find a &#35;GProxy instance to handle handshaking. The
     * <br>application must check for this case by calling
     * <br>g_socket_connection_get_remote_address() on the returned
     * <br>&#35;GSocketConnection, and seeing if it's a &#35;GProxyAddress of the
     * <br>appropriate type, to determine whether or not it needs to handle
     * <br>the proxy handshaking itself.
     * <br>
     * <br>This should be used for proxy protocols that are dialects of
     * <br>another protocol such as HTTP proxy. It also allows cohabitation of
     * <br>proxy protocols that are reused between protocols. A good example
     * <br>is HTTP. It can be used to proxy HTTP, FTP and Gopher and can also
     * <br>be use as generic socket proxy through the HTTP CONNECT method.
     * <br>
     * <br>When the proxy is detected as being an application proxy, TLS handshake
     * <br>will be skipped. This is required to let the application do the proxy
     * <br>specific handshake.
     * @param protocol The proxy protocol
    */
    public void addApplicationProxy(@Nonnull ch.bailu.gtk.type.Str protocol)  {
        JnaSocketClient.INST().g_socket_client_add_application_proxy(asCPointer(), asCPointerNotNull(protocol));
    }

    /**
     * Enable proxy protocols to be handled by the application. When the
     * <br>indicated proxy protocol is returned by the &#35;GProxyResolver,
     * <br>&#35;GSocketClient will consider this protocol as supported but will
     * <br>not try to find a &#35;GProxy instance to handle handshaking. The
     * <br>application must check for this case by calling
     * <br>g_socket_connection_get_remote_address() on the returned
     * <br>&#35;GSocketConnection, and seeing if it's a &#35;GProxyAddress of the
     * <br>appropriate type, to determine whether or not it needs to handle
     * <br>the proxy handshaking itself.
     * <br>
     * <br>This should be used for proxy protocols that are dialects of
     * <br>another protocol such as HTTP proxy. It also allows cohabitation of
     * <br>proxy protocols that are reused between protocols. A good example
     * <br>is HTTP. It can be used to proxy HTTP, FTP and Gopher and can also
     * <br>be use as generic socket proxy through the HTTP CONNECT method.
     * <br>
     * <br>When the proxy is detected as being an application proxy, TLS handshake
     * <br>will be skipped. This is required to let the application do the proxy
     * <br>specific handshake.
     * @param protocol The proxy protocol
    */
    public void addApplicationProxy(String protocol)  {
        JnaSocketClient.INST().g_socket_client_add_application_proxy(asCPointer(), protocol);
    }

    /**
     * Tries to resolve the &#64;connectable and make a network connection to it.
     * <br>
     * <br>Upon a successful connection, a new &#35;GSocketConnection is constructed
     * <br>and returned.  The caller owns this new object and must drop their
     * <br>reference to it when finished with it.
     * <br>
     * <br>The type of the &#35;GSocketConnection object returned depends on the type of
     * <br>the underlying socket that is used. For instance, for a TCP/IP connection
     * <br>it will be a &#35;GTcpConnection.
     * <br>
     * <br>The socket created will be the same family as the address that the
     * <br>&#64;connectable resolves to, unless family is set with g_socket_client_set_family()
     * <br>or indirectly via g_socket_client_set_local_address(). The socket type
     * <br>defaults to %G_SOCKET_TYPE_STREAM but can be set with
     * <br>g_socket_client_set_socket_type().
     * <br>
     * <br>If a local address is specified with g_socket_client_set_local_address() the
     * <br>socket will be bound to this address before connecting.
     * @param connectable a &#35;GSocketConnectable specifying the remote address.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @return a &#35;GSocketConnection on success, %NULL on error.
    */
    public SocketConnection connect(@Nonnull SocketConnectable connectable, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketConnection(new PointerContainer(JnaSocketClient.INST().g_socket_client_connect(asCPointer(), asCPointerNotNull(connectable), asCPointer(cancellable), 0L)));
    }

    /**
     * This is the asynchronous version of g_socket_client_connect().
     * <br>
     * <br>You may wish to prefer the asynchronous version even in synchronous
     * <br>command line programs because, since 2.60, it implements
     * <br>[RFC 8305](https://tools.ietf.org/html/rfc8305) &quot;Happy Eyeballs&quot;
     * <br>recommendations to work around long connection timeouts in networks
     * <br>where IPv6 is broken by performing an IPv4 connection simultaneously
     * <br>without waiting for IPv6 to time out, which is not supported by the
     * <br>synchronous call. (This is not an API guarantee, and may change in
     * <br>the future.)
     * <br>
     * <br>When the operation is finished &#64;callback will be
     * <br>called. You can then call g_socket_client_connect_finish() to get
     * <br>the result of the operation.
     * @param connectable a &#35;GSocketConnectable specifying the remote address.
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data user data for the callback
    */
    public void connectAsync(@Nonnull SocketConnectable connectable, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSocketClient.INST().g_socket_client_connect_async(asCPointer(), asCPointerNotNull(connectable), asCPointer(cancellable), toOnAsyncReadyCallback(this, "connectAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an async connect operation. See g_socket_client_connect_async()
     * @param result a &#35;GAsyncResult.
     * @return a &#35;GSocketConnection on success, %NULL on error.
    */
    public SocketConnection connectFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketConnection(new PointerContainer(JnaSocketClient.INST().g_socket_client_connect_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * This is a helper function for g_socket_client_connect().
     * <br>
     * <br>Attempts to create a TCP connection to the named host.
     * <br>
     * <br>&#64;host_and_port may be in any of a number of recognized formats; an IPv6
     * <br>address, an IPv4 address, or a domain name (in which case a DNS
     * <br>lookup is performed).  Quoting with [] is supported for all address
     * <br>types.  A port override may be specified in the usual way with a
     * <br>colon.  Ports may be given as decimal numbers or symbolic names (in
     * <br>which case an /etc/services lookup is performed).
     * <br>
     * <br>If no port override is given in &#64;host_and_port then &#64;default_port will be
     * <br>used as the port number to connect to.
     * <br>
     * <br>In general, &#64;host_and_port is expected to be provided by the user (allowing
     * <br>them to give the hostname, and a port override if necessary) and
     * <br>&#64;default_port is expected to be provided by the application.
     * <br>
     * <br>In the case that an IP address is given, a single connection
     * <br>attempt is made.  In the case that a name is given, multiple
     * <br>connection attempts may be made, in turn and according to the
     * <br>number of address records in DNS, until a connection succeeds.
     * <br>
     * <br>Upon a successful connection, a new &#35;GSocketConnection is constructed
     * <br>and returned.  The caller owns this new object and must drop their
     * <br>reference to it when finished with it.
     * <br>
     * <br>In the event of any failure (DNS error, service not found, no hosts
     * <br>connectable) %NULL is returned and &#64;error (if non-%NULL) is set
     * <br>accordingly.
     * @param host_and_port the name and optionally port of the host to connect to
     * @param default_port the default port to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a &#35;GSocketConnection on success, %NULL on error.
    */
    public SocketConnection connectToHost(@Nonnull ch.bailu.gtk.type.Str host_and_port, int default_port, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketConnection(new PointerContainer(JnaSocketClient.INST().g_socket_client_connect_to_host(asCPointer(), asCPointerNotNull(host_and_port), default_port, asCPointer(cancellable), 0L)));
    }

    /**
     * This is a helper function for g_socket_client_connect().
     * <br>
     * <br>Attempts to create a TCP connection to the named host.
     * <br>
     * <br>&#64;host_and_port may be in any of a number of recognized formats; an IPv6
     * <br>address, an IPv4 address, or a domain name (in which case a DNS
     * <br>lookup is performed).  Quoting with [] is supported for all address
     * <br>types.  A port override may be specified in the usual way with a
     * <br>colon.  Ports may be given as decimal numbers or symbolic names (in
     * <br>which case an /etc/services lookup is performed).
     * <br>
     * <br>If no port override is given in &#64;host_and_port then &#64;default_port will be
     * <br>used as the port number to connect to.
     * <br>
     * <br>In general, &#64;host_and_port is expected to be provided by the user (allowing
     * <br>them to give the hostname, and a port override if necessary) and
     * <br>&#64;default_port is expected to be provided by the application.
     * <br>
     * <br>In the case that an IP address is given, a single connection
     * <br>attempt is made.  In the case that a name is given, multiple
     * <br>connection attempts may be made, in turn and according to the
     * <br>number of address records in DNS, until a connection succeeds.
     * <br>
     * <br>Upon a successful connection, a new &#35;GSocketConnection is constructed
     * <br>and returned.  The caller owns this new object and must drop their
     * <br>reference to it when finished with it.
     * <br>
     * <br>In the event of any failure (DNS error, service not found, no hosts
     * <br>connectable) %NULL is returned and &#64;error (if non-%NULL) is set
     * <br>accordingly.
     * @param host_and_port the name and optionally port of the host to connect to
     * @param default_port the default port to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a &#35;GSocketConnection on success, %NULL on error.
    */
    public SocketConnection connectToHost(String host_and_port, int default_port, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketConnection(new PointerContainer(JnaSocketClient.INST().g_socket_client_connect_to_host(asCPointer(), host_and_port, default_port, asCPointer(cancellable), 0L)));
    }

    /**
     * This is the asynchronous version of g_socket_client_connect_to_host().
     * <br>
     * <br>When the operation is finished &#64;callback will be
     * <br>called. You can then call g_socket_client_connect_to_host_finish() to get
     * <br>the result of the operation.
     * @param host_and_port the name and optionally the port of the host to connect to
     * @param default_port the default port to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data user data for the callback
    */
    public void connectToHostAsync(@Nonnull ch.bailu.gtk.type.Str host_and_port, int default_port, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSocketClient.INST().g_socket_client_connect_to_host_async(asCPointer(), asCPointerNotNull(host_and_port), default_port, asCPointer(cancellable), toOnAsyncReadyCallback(this, "connectToHostAsync", callback), asCPointer(user_data));
    }

    /**
     * This is the asynchronous version of g_socket_client_connect_to_host().
     * <br>
     * <br>When the operation is finished &#64;callback will be
     * <br>called. You can then call g_socket_client_connect_to_host_finish() to get
     * <br>the result of the operation.
     * @param host_and_port the name and optionally the port of the host to connect to
     * @param default_port the default port to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data user data for the callback
    */
    public void connectToHostAsync(String host_and_port, int default_port, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSocketClient.INST().g_socket_client_connect_to_host_async(asCPointer(), host_and_port, default_port, asCPointer(cancellable), toOnAsyncReadyCallback(this, "connectToHostAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an async connect operation. See g_socket_client_connect_to_host_async()
     * @param result a &#35;GAsyncResult.
     * @return a &#35;GSocketConnection on success, %NULL on error.
    */
    public SocketConnection connectToHostFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketConnection(new PointerContainer(JnaSocketClient.INST().g_socket_client_connect_to_host_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Attempts to create a TCP connection to a service.
     * <br>
     * <br>This call looks up the SRV record for &#64;service at &#64;domain for the
     * <br>&quot;tcp&quot; protocol.  It then attempts to connect, in turn, to each of
     * <br>the hosts providing the service until either a connection succeeds
     * <br>or there are no hosts remaining.
     * <br>
     * <br>Upon a successful connection, a new &#35;GSocketConnection is constructed
     * <br>and returned.  The caller owns this new object and must drop their
     * <br>reference to it when finished with it.
     * <br>
     * <br>In the event of any failure (DNS error, service not found, no hosts
     * <br>connectable) %NULL is returned and &#64;error (if non-%NULL) is set
     * <br>accordingly.
     * @param domain a domain name
     * @param service the name of the service to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a &#35;GSocketConnection if successful, or %NULL on error
    */
    public SocketConnection connectToService(@Nonnull ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str service, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketConnection(new PointerContainer(JnaSocketClient.INST().g_socket_client_connect_to_service(asCPointer(), asCPointerNotNull(domain), asCPointerNotNull(service), asCPointer(cancellable), 0L)));
    }

    /**
     * Attempts to create a TCP connection to a service.
     * <br>
     * <br>This call looks up the SRV record for &#64;service at &#64;domain for the
     * <br>&quot;tcp&quot; protocol.  It then attempts to connect, in turn, to each of
     * <br>the hosts providing the service until either a connection succeeds
     * <br>or there are no hosts remaining.
     * <br>
     * <br>Upon a successful connection, a new &#35;GSocketConnection is constructed
     * <br>and returned.  The caller owns this new object and must drop their
     * <br>reference to it when finished with it.
     * <br>
     * <br>In the event of any failure (DNS error, service not found, no hosts
     * <br>connectable) %NULL is returned and &#64;error (if non-%NULL) is set
     * <br>accordingly.
     * @param domain a domain name
     * @param service the name of the service to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a &#35;GSocketConnection if successful, or %NULL on error
    */
    public SocketConnection connectToService(String domain, String service, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketConnection(new PointerContainer(JnaSocketClient.INST().g_socket_client_connect_to_service(asCPointer(), domain, service, asCPointer(cancellable), 0L)));
    }

    /**
     * This is the asynchronous version of
     * <br>g_socket_client_connect_to_service().
     * @param domain a domain name
     * @param service the name of the service to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data user data for the callback
    */
    public void connectToServiceAsync(@Nonnull ch.bailu.gtk.type.Str domain, @Nonnull ch.bailu.gtk.type.Str service, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSocketClient.INST().g_socket_client_connect_to_service_async(asCPointer(), asCPointerNotNull(domain), asCPointerNotNull(service), asCPointer(cancellable), toOnAsyncReadyCallback(this, "connectToServiceAsync", callback), asCPointer(user_data));
    }

    /**
     * This is the asynchronous version of
     * <br>g_socket_client_connect_to_service().
     * @param domain a domain name
     * @param service the name of the service to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data user data for the callback
    */
    public void connectToServiceAsync(String domain, String service, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSocketClient.INST().g_socket_client_connect_to_service_async(asCPointer(), domain, service, asCPointer(cancellable), toOnAsyncReadyCallback(this, "connectToServiceAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an async connect operation. See g_socket_client_connect_to_service_async()
     * @param result a &#35;GAsyncResult.
     * @return a &#35;GSocketConnection on success, %NULL on error.
    */
    public SocketConnection connectToServiceFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketConnection(new PointerContainer(JnaSocketClient.INST().g_socket_client_connect_to_service_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * This is a helper function for g_socket_client_connect().
     * <br>
     * <br>Attempts to create a TCP connection with a network URI.
     * <br>
     * <br>&#64;uri may be any valid URI containing an &quot;authority&quot; (hostname/port)
     * <br>component. If a port is not specified in the URI, &#64;default_port
     * <br>will be used. TLS will be negotiated if &#35;GSocketClient:tls is %TRUE.
     * <br>(&#35;GSocketClient does not know to automatically assume TLS for
     * <br>certain URI schemes.)
     * <br>
     * <br>Using this rather than g_socket_client_connect() or
     * <br>g_socket_client_connect_to_host() allows &#35;GSocketClient to
     * <br>determine when to use application-specific proxy protocols.
     * <br>
     * <br>Upon a successful connection, a new &#35;GSocketConnection is constructed
     * <br>and returned.  The caller owns this new object and must drop their
     * <br>reference to it when finished with it.
     * <br>
     * <br>In the event of any failure (DNS error, service not found, no hosts
     * <br>connectable) %NULL is returned and &#64;error (if non-%NULL) is set
     * <br>accordingly.
     * @param uri A network URI
     * @param default_port the default port to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a &#35;GSocketConnection on success, %NULL on error.
    */
    public SocketConnection connectToUri(@Nonnull ch.bailu.gtk.type.Str uri, int default_port, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketConnection(new PointerContainer(JnaSocketClient.INST().g_socket_client_connect_to_uri(asCPointer(), asCPointerNotNull(uri), default_port, asCPointer(cancellable), 0L)));
    }

    /**
     * This is a helper function for g_socket_client_connect().
     * <br>
     * <br>Attempts to create a TCP connection with a network URI.
     * <br>
     * <br>&#64;uri may be any valid URI containing an &quot;authority&quot; (hostname/port)
     * <br>component. If a port is not specified in the URI, &#64;default_port
     * <br>will be used. TLS will be negotiated if &#35;GSocketClient:tls is %TRUE.
     * <br>(&#35;GSocketClient does not know to automatically assume TLS for
     * <br>certain URI schemes.)
     * <br>
     * <br>Using this rather than g_socket_client_connect() or
     * <br>g_socket_client_connect_to_host() allows &#35;GSocketClient to
     * <br>determine when to use application-specific proxy protocols.
     * <br>
     * <br>Upon a successful connection, a new &#35;GSocketConnection is constructed
     * <br>and returned.  The caller owns this new object and must drop their
     * <br>reference to it when finished with it.
     * <br>
     * <br>In the event of any failure (DNS error, service not found, no hosts
     * <br>connectable) %NULL is returned and &#64;error (if non-%NULL) is set
     * <br>accordingly.
     * @param uri A network URI
     * @param default_port the default port to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @return a &#35;GSocketConnection on success, %NULL on error.
    */
    public SocketConnection connectToUri(String uri, int default_port, @Nullable Cancellable cancellable) throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketConnection(new PointerContainer(JnaSocketClient.INST().g_socket_client_connect_to_uri(asCPointer(), uri, default_port, asCPointer(cancellable), 0L)));
    }

    /**
     * This is the asynchronous version of g_socket_client_connect_to_uri().
     * <br>
     * <br>When the operation is finished &#64;callback will be
     * <br>called. You can then call g_socket_client_connect_to_uri_finish() to get
     * <br>the result of the operation.
     * @param uri a network uri
     * @param default_port the default port to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data user data for the callback
    */
    public void connectToUriAsync(@Nonnull ch.bailu.gtk.type.Str uri, int default_port, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSocketClient.INST().g_socket_client_connect_to_uri_async(asCPointer(), asCPointerNotNull(uri), default_port, asCPointer(cancellable), toOnAsyncReadyCallback(this, "connectToUriAsync", callback), asCPointer(user_data));
    }

    /**
     * This is the asynchronous version of g_socket_client_connect_to_uri().
     * <br>
     * <br>When the operation is finished &#64;callback will be
     * <br>called. You can then call g_socket_client_connect_to_uri_finish() to get
     * <br>the result of the operation.
     * @param uri a network uri
     * @param default_port the default port to connect to
     * @param cancellable a &#35;GCancellable, or %NULL
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data user data for the callback
    */
    public void connectToUriAsync(String uri, int default_port, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaSocketClient.INST().g_socket_client_connect_to_uri_async(asCPointer(), uri, default_port, asCPointer(cancellable), toOnAsyncReadyCallback(this, "connectToUriAsync", callback), asCPointer(user_data));
    }

    /**
     * Finishes an async connect operation. See g_socket_client_connect_to_uri_async()
     * @param result a &#35;GAsyncResult.
     * @return a &#35;GSocketConnection on success, %NULL on error.
    */
    public SocketConnection connectToUriFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return new SocketConnection(new PointerContainer(JnaSocketClient.INST().g_socket_client_connect_to_uri_finish(asCPointer(), asCPointerNotNull(result), 0L)));
    }

    /**
     * Gets the proxy enable state; see g_socket_client_set_enable_proxy()
     * @return whether proxying is enabled
    */
    public boolean getEnableProxy()  {
        return JnaSocketClient.INST().g_socket_client_get_enable_proxy(asCPointer());
    }

    /**
     * Gets the socket family of the socket client.
     * <br>
     * <br>See g_socket_client_set_family() for details.
     * @return a &#35;GSocketFamily
    */
    public int getFamily()  {
        return JnaSocketClient.INST().g_socket_client_get_family(asCPointer());
    }

    /**
     * Gets the local address of the socket client.
     * <br>
     * <br>See g_socket_client_set_local_address() for details.
     * @return a &#35;GSocketAddress or %NULL. Do not free.
    */
    public SocketAddress getLocalAddress()  {
        return new SocketAddress(new PointerContainer(JnaSocketClient.INST().g_socket_client_get_local_address(asCPointer())));
    }

    /**
     * Gets the protocol name type of the socket client.
     * <br>
     * <br>See g_socket_client_set_protocol() for details.
     * @return a &#35;GSocketProtocol
    */
    public int getProtocol()  {
        return JnaSocketClient.INST().g_socket_client_get_protocol(asCPointer());
    }

    /**
     * Gets the &#35;GProxyResolver being used by &#64;client. Normally, this will
     * <br>be the resolver returned by g_proxy_resolver_get_default(), but you
     * <br>can override it with g_socket_client_set_proxy_resolver().
     * @return The &#35;GProxyResolver being used by   &#64;client.
    */
    public ProxyResolver getProxyResolver()  {
        return new ProxyResolver(new PointerContainer(JnaSocketClient.INST().g_socket_client_get_proxy_resolver(asCPointer())));
    }

    /**
     * Gets the socket type of the socket client.
     * <br>
     * <br>See g_socket_client_set_socket_type() for details.
     * @return a &#35;GSocketFamily
    */
    public int getSocketType()  {
        return JnaSocketClient.INST().g_socket_client_get_socket_type(asCPointer());
    }

    /**
     * Gets the I/O timeout time for sockets created by &#64;client.
     * <br>
     * <br>See g_socket_client_set_timeout() for details.
     * @return the timeout in seconds
    */
    public int getTimeout()  {
        return JnaSocketClient.INST().g_socket_client_get_timeout(asCPointer());
    }

    /**
     * Gets whether &#64;client creates TLS connections. See
     * <br>g_socket_client_set_tls() for details.
     * @return whether &#64;client uses TLS
    */
    public boolean getTls()  {
        return JnaSocketClient.INST().g_socket_client_get_tls(asCPointer());
    }

    /**
     * Sets whether or not &#64;client attempts to make connections via a
     * <br>proxy server. When enabled (the default), &#35;GSocketClient will use a
     * <br>&#35;GProxyResolver to determine if a proxy protocol such as SOCKS is
     * <br>needed, and automatically do the necessary proxy negotiation.
     * <br>
     * <br>See also g_socket_client_set_proxy_resolver().
     * @param enable whether to enable proxies
    */
    public void setEnableProxy(boolean enable)  {
        JnaSocketClient.INST().g_socket_client_set_enable_proxy(asCPointer(), enable);
    }

    /**
     * Sets the socket family of the socket client.
     * <br>If this is set to something other than %G_SOCKET_FAMILY_INVALID
     * <br>then the sockets created by this object will be of the specified
     * <br>family.
     * <br>
     * <br>This might be useful for instance if you want to force the local
     * <br>connection to be an ipv4 socket, even though the address might
     * <br>be an ipv6 mapped to ipv4 address.
     * @param family a &#35;GSocketFamily
    */
    public void setFamily(int family)  {
        JnaSocketClient.INST().g_socket_client_set_family(asCPointer(), family);
    }

    /**
     * Sets the local address of the socket client.
     * <br>The sockets created by this object will bound to the
     * <br>specified address (if not %NULL) before connecting.
     * <br>
     * <br>This is useful if you want to ensure that the local
     * <br>side of the connection is on a specific port, or on
     * <br>a specific interface.
     * @param address a &#35;GSocketAddress, or %NULL
    */
    public void setLocalAddress(@Nullable SocketAddress address)  {
        JnaSocketClient.INST().g_socket_client_set_local_address(asCPointer(), asCPointer(address));
    }

    /**
     * Sets the protocol of the socket client.
     * <br>The sockets created by this object will use of the specified
     * <br>protocol.
     * <br>
     * <br>If &#64;protocol is %G_SOCKET_PROTOCOL_DEFAULT that means to use the default
     * <br>protocol for the socket family and type.
     * @param protocol a &#35;GSocketProtocol
    */
    public void setProtocol(int protocol)  {
        JnaSocketClient.INST().g_socket_client_set_protocol(asCPointer(), protocol);
    }

    /**
     * Overrides the &#35;GProxyResolver used by &#64;client. You can call this if
     * <br>you want to use specific proxies, rather than using the system
     * <br>default proxy settings.
     * <br>
     * <br>Note that whether or not the proxy resolver is actually used
     * <br>depends on the setting of &#35;GSocketClient:enable-proxy, which is not
     * <br>changed by this function (but which is %TRUE by default)
     * @param proxy_resolver a &#35;GProxyResolver, or %NULL for the   default.
    */
    public void setProxyResolver(@Nullable ProxyResolver proxy_resolver)  {
        JnaSocketClient.INST().g_socket_client_set_proxy_resolver(asCPointer(), asCPointer(proxy_resolver));
    }

    /**
     * Sets the socket type of the socket client.
     * <br>The sockets created by this object will be of the specified
     * <br>type.
     * <br>
     * <br>It doesn't make sense to specify a type of %G_SOCKET_TYPE_DATAGRAM,
     * <br>as GSocketClient is used for connection oriented services.
     * @param type a &#35;GSocketType
    */
    public void setSocketType(int type)  {
        JnaSocketClient.INST().g_socket_client_set_socket_type(asCPointer(), type);
    }

    /**
     * Sets the I/O timeout for sockets created by &#64;client. &#64;timeout is a
     * <br>time in seconds, or 0 for no timeout (the default).
     * <br>
     * <br>The timeout value affects the initial connection attempt as well,
     * <br>so setting this may cause calls to g_socket_client_connect(), etc,
     * <br>to fail with %G_IO_ERROR_TIMED_OUT.
     * @param timeout the timeout
    */
    public void setTimeout(int timeout)  {
        JnaSocketClient.INST().g_socket_client_set_timeout(asCPointer(), timeout);
    }

    /**
     * Sets whether &#64;client creates TLS (aka SSL) connections. If &#64;tls is
     * <br>%TRUE, &#64;client will wrap its connections in a &#35;GTlsClientConnection
     * <br>and perform a TLS handshake when connecting.
     * <br>
     * <br>Note that since &#35;GSocketClient must return a &#35;GSocketConnection,
     * <br>but &#35;GTlsClientConnection is not a &#35;GSocketConnection, this
     * <br>actually wraps the resulting &#35;GTlsClientConnection in a
     * <br>&#35;GTcpWrapperConnection when returning it. You can use
     * <br>g_tcp_wrapper_connection_get_base_io_stream() on the return value
     * <br>to extract the &#35;GTlsClientConnection.
     * <br>
     * <br>If you need to modify the behavior of the TLS handshake (eg, by
     * <br>setting a client-side certificate to use, or connecting to the
     * <br>&#35;GTlsConnection::accept-certificate signal), you can connect to
     * <br>&#64;client's &#35;GSocketClient::event signal and wait for it to be
     * <br>emitted with %G_SOCKET_CLIENT_TLS_HANDSHAKING, which will give you
     * <br>a chance to see the &#35;GTlsClientConnection before the handshake
     * <br>starts.
     * @param tls whether to use TLS
    */
    public void setTls(boolean tls)  {
        JnaSocketClient.INST().g_socket_client_set_tls(asCPointer(), tls);
    }

    public final static String SIGNAL_ON_EVENT = "event";
    
    /**
     * Connect to signal "event".
     * <br>See {@link OnEvent#onEvent} for signal description.
     * <br>Field {@link #SIGNAL_ON_EVENT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEvent(OnEvent signal) {
        return connectSignal(SIGNAL_ON_EVENT, toOnEvent(signal));
    }

    public static long getTypeID() { 
        return JnaSocketClient.INST().g_socket_client_get_type(); 
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

[MethodModel:cb-deprecated:getTlsValidationFlags:[ParameterModel:Supported:{G_::{c:GTlsCertificateFlags}}:{j:int}]]

[MethodModel:cb-deprecated:setTlsValidationFlags:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GTlsCertificateFlags}}:{j:int}]
*/
