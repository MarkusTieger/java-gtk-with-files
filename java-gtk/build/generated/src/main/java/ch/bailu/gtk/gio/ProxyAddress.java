/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Support for proxied &#35;GInetSocketAddress.
 * <p><a href="https://docs.gtk.org/gio/class.ProxyAddress.html">https://docs.gtk.org/gio/class.ProxyAddress.html</a></p>
*/
public class ProxyAddress extends InetSocketAddress {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ProxyAddress.class.getCanonicalName());
    }

    public ProxyAddress(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GProxyAddress for &#64;inetaddr with &#64;protocol that should
     * <br>tunnel through &#64;dest_hostname and &#64;dest_port.
     * <br>
     * <br>(Note that this method doesn't set the &#35;GProxyAddress:uri or
     * <br>&#35;GProxyAddress:destination-protocol fields; use g_object_new()
     * <br>directly if you want to set those.)
     * @param inetaddr The proxy server &#35;GInetAddress.
     * @param port The proxy server port.
     * @param protocol The proxy protocol to support, in lower case (e.g. socks, http).
     * @param dest_hostname The destination hostname the proxy should tunnel to.
     * @param dest_port The destination port to tunnel to.
     * @param username The username to authenticate to the proxy server     (or %NULL).
     * @param password The password to authenticate to the proxy server     (or %NULL).
    */
    public ProxyAddress(@Nonnull InetAddress inetaddr, int port, @Nonnull ch.bailu.gtk.type.Str protocol, @Nonnull ch.bailu.gtk.type.Str dest_hostname, int dest_port, @Nullable ch.bailu.gtk.type.Str username, @Nullable ch.bailu.gtk.type.Str password) {
        super(cast(JnaProxyAddress.INST().g_proxy_address_new(asCPointerNotNull(inetaddr), port, asCPointerNotNull(protocol), asCPointerNotNull(dest_hostname), dest_port, asCPointer(username), asCPointer(password))));
    }

    /**
     * Creates a new &#35;GProxyAddress for &#64;inetaddr with &#64;protocol that should
     * <br>tunnel through &#64;dest_hostname and &#64;dest_port.
     * <br>
     * <br>(Note that this method doesn't set the &#35;GProxyAddress:uri or
     * <br>&#35;GProxyAddress:destination-protocol fields; use g_object_new()
     * <br>directly if you want to set those.)
     * @param inetaddr The proxy server &#35;GInetAddress.
     * @param port The proxy server port.
     * @param protocol The proxy protocol to support, in lower case (e.g. socks, http).
     * @param dest_hostname The destination hostname the proxy should tunnel to.
     * @param dest_port The destination port to tunnel to.
     * @param username The username to authenticate to the proxy server     (or %NULL).
     * @param password The password to authenticate to the proxy server     (or %NULL).
    */
    public ProxyAddress(@Nonnull InetAddress inetaddr, int port, String protocol, String dest_hostname, int dest_port, String username, String password) {
        super(cast(JnaProxyAddress.INST().g_proxy_address_new(asCPointerNotNull(inetaddr), port, protocol, dest_hostname, dest_port, username, password)));
    }

    /**
     * Gets &#64;proxy's destination hostname; that is, the name of the host
     * <br>that will be connected to via the proxy, not the name of the proxy
     * <br>itself.
     * @return the &#64;proxy's destination hostname
    */
    public ch.bailu.gtk.type.Str getDestinationHostname()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaProxyAddress.INST().g_proxy_address_get_destination_hostname(asCPointer())));
    }

    /**
     * Gets &#64;proxy's destination port; that is, the port on the
     * <br>destination host that will be connected to via the proxy, not the
     * <br>port number of the proxy itself.
     * @return the &#64;proxy's destination port
    */
    public int getDestinationPort()  {
        return JnaProxyAddress.INST().g_proxy_address_get_destination_port(asCPointer());
    }

    /**
     * Gets the protocol that is being spoken to the destination
     * <br>server; eg, &quot;http&quot; or &quot;ftp&quot;.
     * @return the &#64;proxy's destination protocol
    */
    public ch.bailu.gtk.type.Str getDestinationProtocol()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaProxyAddress.INST().g_proxy_address_get_destination_protocol(asCPointer())));
    }

    /**
     * Gets &#64;proxy's password.
     * @return the &#64;proxy's password
    */
    public ch.bailu.gtk.type.Str getPassword()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaProxyAddress.INST().g_proxy_address_get_password(asCPointer())));
    }

    /**
     * Gets &#64;proxy's protocol. eg, &quot;socks&quot; or &quot;http&quot;
     * @return the &#64;proxy's protocol
    */
    public ch.bailu.gtk.type.Str getProtocol()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaProxyAddress.INST().g_proxy_address_get_protocol(asCPointer())));
    }

    /**
     * Gets the proxy URI that &#64;proxy was constructed from.
     * @return the &#64;proxy's URI, or %NULL if unknown
    */
    public ch.bailu.gtk.type.Str getUri()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaProxyAddress.INST().g_proxy_address_get_uri(asCPointer())));
    }

    /**
     * Gets &#64;proxy's username.
     * @return the &#64;proxy's username
    */
    public ch.bailu.gtk.type.Str getUsername()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaProxyAddress.INST().g_proxy_address_get_username(asCPointer())));
    }

    /**
     * Implements interface {@link SocketConnectable}. Call this to get access to interface functions.
     * @return {@link SocketConnectable}
    */
    public SocketConnectable asSocketConnectable() {
        return new SocketConnectable(cast());
    }

    public static long getTypeID() { 
        return JnaProxyAddress.INST().g_proxy_address_get_type(); 
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
