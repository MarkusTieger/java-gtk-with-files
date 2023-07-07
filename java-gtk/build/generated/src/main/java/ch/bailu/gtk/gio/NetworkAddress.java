/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GNetworkAddress provides an easy way to resolve a hostname and
 * <br>then attempt to connect to that host, handling the possibility of
 * <br>multiple IP addresses and multiple address families.
 * <br>
 * <br>The enumeration results of resolved addresses *may* be cached as long
 * <br>as this object is kept alive which may have unexpected results if
 * <br>alive for too long.
 * <br>
 * <br>See &#35;GSocketConnectable for an example of using the connectable
 * <br>interface.
 * <p><a href="https://docs.gtk.org/gio/class.NetworkAddress.html">https://docs.gtk.org/gio/class.NetworkAddress.html</a></p>
*/
public class NetworkAddress extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NetworkAddress.class.getCanonicalName());
    }

    public NetworkAddress(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GSocketConnectable for connecting to the local host
     * <br>over a loopback connection to the given &#64;port. This is intended for
     * <br>use in connecting to local services which may be running on IPv4 or
     * <br>IPv6.
     * <br>
     * <br>The connectable will return IPv4 and IPv6 loopback addresses,
     * <br>regardless of how the host resolves `localhost`. By contrast,
     * <br>g_network_address_new() will often only return an IPv4 address when
     * <br>resolving `localhost`, and an IPv6 address for `localhost6`.
     * <br>
     * <br>g_network_address_get_hostname() will always return `localhost` for
     * <br>a &#35;GNetworkAddress created with this constructor.
     * @param port the port
     * @return the new &#35;GNetworkAddress
    */
    public static NetworkAddress newLoopbackNetworkAddress(int port)  {
        PointerContainer __self = cast(JnaNetworkAddress.INST().g_network_address_new_loopback(port));
        if (__self.isNull()) {
            throw new NullPointerException("NetworkAddress:newLoopback");
        }
        return new NetworkAddress(__self);
    }        
    

    /**
     * Creates a new &#35;GSocketConnectable for connecting to the given
     * <br>&#64;hostname and &#64;port.
     * <br>
     * <br>Note that depending on the configuration of the machine, a
     * <br>&#64;hostname of `localhost` may refer to the IPv4 loopback address
     * <br>only, or to both IPv4 and IPv6; use
     * <br>g_network_address_new_loopback() to create a &#35;GNetworkAddress that
     * <br>is guaranteed to resolve to both addresses.
     * @param hostname the hostname
     * @param port the port
    */
    public NetworkAddress(@Nonnull ch.bailu.gtk.type.Str hostname, int port) {
        super(cast(JnaNetworkAddress.INST().g_network_address_new(asCPointerNotNull(hostname), port)));
    }

    /**
     * Creates a new &#35;GSocketConnectable for connecting to the given
     * <br>&#64;hostname and &#64;port.
     * <br>
     * <br>Note that depending on the configuration of the machine, a
     * <br>&#64;hostname of `localhost` may refer to the IPv4 loopback address
     * <br>only, or to both IPv4 and IPv6; use
     * <br>g_network_address_new_loopback() to create a &#35;GNetworkAddress that
     * <br>is guaranteed to resolve to both addresses.
     * @param hostname the hostname
     * @param port the port
    */
    public NetworkAddress(String hostname, int port) {
        super(cast(JnaNetworkAddress.INST().g_network_address_new(hostname, port)));
    }

    /**
     * Gets &#64;addr's hostname. This might be either UTF-8 or ASCII-encoded,
     * <br>depending on what &#64;addr was created with.
     * @return &#64;addr's hostname
    */
    public ch.bailu.gtk.type.Str getHostname()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaNetworkAddress.INST().g_network_address_get_hostname(asCPointer())));
    }

    /**
     * Gets &#64;addr's port number
     * @return &#64;addr's port (which may be 0)
    */
    public int getPort()  {
        return JnaNetworkAddress.INST().g_network_address_get_port(asCPointer());
    }

    /**
     * Gets &#64;addr's scheme
     * @return &#64;addr's scheme (%NULL if not built from URI)
    */
    public ch.bailu.gtk.type.Str getScheme()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaNetworkAddress.INST().g_network_address_get_scheme(asCPointer())));
    }

    /**
     * Creates a new &#35;GSocketConnectable for connecting to the given
     * <br>&#64;hostname and &#64;port. May fail and return %NULL in case
     * <br>parsing &#64;host_and_port fails.
     * <br>
     * <br>&#64;host_and_port may be in any of a number of recognised formats; an IPv6
     * <br>address, an IPv4 address, or a domain name (in which case a DNS
     * <br>lookup is performed). Quoting with [] is supported for all address
     * <br>types. A port override may be specified in the usual way with a
     * <br>colon.
     * <br>
     * <br>If no port is specified in &#64;host_and_port then &#64;default_port will be
     * <br>used as the port number to connect to.
     * <br>
     * <br>In general, &#64;host_and_port is expected to be provided by the user
     * <br>(allowing them to give the hostname, and a port override if necessary)
     * <br>and &#64;default_port is expected to be provided by the application.
     * <br>
     * <br>(The port component of &#64;host_and_port can also be specified as a
     * <br>service name rather than as a numeric port, but this functionality
     * <br>is deprecated, because it depends on the contents of /etc/services,
     * <br>which is generally quite sparse on platforms other than Linux.)
     * @param host_and_port the hostname and optionally a port
     * @param default_port the default port if not in &#64;host_and_port
     * @return the new   &#35;GNetworkAddress, or %NULL on error
    */
    public static NetworkAddress parse(@Nonnull ch.bailu.gtk.type.Str host_and_port, int default_port) throws ch.bailu.gtk.type.exception.AllocationError {
        return new NetworkAddress(new PointerContainer(JnaNetworkAddress.INST().g_network_address_parse(asCPointerNotNull(host_and_port), default_port, 0L)));
    }

    /**
     * Creates a new &#35;GSocketConnectable for connecting to the given
     * <br>&#64;uri. May fail and return %NULL in case parsing &#64;uri fails.
     * <br>
     * <br>Using this rather than g_network_address_new() or
     * <br>g_network_address_parse() allows &#35;GSocketClient to determine
     * <br>when to use application-specific proxy protocols.
     * @param uri the hostname and optionally a port
     * @param default_port The default port if none is found in the URI
     * @return the new   &#35;GNetworkAddress, or %NULL on error
    */
    public static NetworkAddress parseUri(@Nonnull ch.bailu.gtk.type.Str uri, int default_port) throws ch.bailu.gtk.type.exception.AllocationError {
        return new NetworkAddress(new PointerContainer(JnaNetworkAddress.INST().g_network_address_parse_uri(asCPointerNotNull(uri), default_port, 0L)));
    }

    /**
     * Implements interface {@link SocketConnectable}. Call this to get access to interface functions.
     * @return {@link SocketConnectable}
    */
    public SocketConnectable asSocketConnectable() {
        return new SocketConnectable(cast());
    }

    public static long getTypeID() { 
        return JnaNetworkAddress.INST().g_network_address_get_type(); 
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
