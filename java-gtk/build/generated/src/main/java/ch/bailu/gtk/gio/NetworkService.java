/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Like &#35;GNetworkAddress does with hostnames, &#35;GNetworkService
 * <br>provides an easy way to resolve a SRV record, and then attempt to
 * <br>connect to one of the hosts that implements that service, handling
 * <br>service priority/weighting, multiple IP addresses, and multiple
 * <br>address families.
 * <br>
 * <br>See &#35;GSrvTarget for more information about SRV records, and see
 * <br>&#35;GSocketConnectable for an example of using the connectable
 * <br>interface.
 * <p><a href="https://docs.gtk.org/gio/class.NetworkService.html">https://docs.gtk.org/gio/class.NetworkService.html</a></p>
*/
public class NetworkService extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NetworkService.class.getCanonicalName());
    }

    public NetworkService(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GNetworkService representing the given &#64;service,
     * <br>&#64;protocol, and &#64;domain. This will initially be unresolved; use the
     * <br>&#35;GSocketConnectable interface to resolve it.
     * @param service the service type to look up (eg, &quot;ldap&quot;)
     * @param protocol the networking protocol to use for &#64;service (eg, &quot;tcp&quot;)
     * @param domain the DNS domain to look up the service in
    */
    public NetworkService(@Nonnull ch.bailu.gtk.type.Str service, @Nonnull ch.bailu.gtk.type.Str protocol, @Nonnull ch.bailu.gtk.type.Str domain) {
        super(cast(JnaNetworkService.INST().g_network_service_new(asCPointerNotNull(service), asCPointerNotNull(protocol), asCPointerNotNull(domain))));
    }

    /**
     * Creates a new &#35;GNetworkService representing the given &#64;service,
     * <br>&#64;protocol, and &#64;domain. This will initially be unresolved; use the
     * <br>&#35;GSocketConnectable interface to resolve it.
     * @param service the service type to look up (eg, &quot;ldap&quot;)
     * @param protocol the networking protocol to use for &#64;service (eg, &quot;tcp&quot;)
     * @param domain the DNS domain to look up the service in
    */
    public NetworkService(String service, String protocol, String domain) {
        super(cast(JnaNetworkService.INST().g_network_service_new(service, protocol, domain)));
    }

    /**
     * Gets the domain that &#64;srv serves. This might be either UTF-8 or
     * <br>ASCII-encoded, depending on what &#64;srv was created with.
     * @return &#64;srv's domain name
    */
    public ch.bailu.gtk.type.Str getDomain()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaNetworkService.INST().g_network_service_get_domain(asCPointer())));
    }

    /**
     * Gets &#64;srv's protocol name (eg, &quot;tcp&quot;).
     * @return &#64;srv's protocol name
    */
    public ch.bailu.gtk.type.Str getProtocol()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaNetworkService.INST().g_network_service_get_protocol(asCPointer())));
    }

    /**
     * Gets the URI scheme used to resolve proxies. By default, the service name
     * <br>is used as scheme.
     * @return &#64;srv's scheme name
    */
    public ch.bailu.gtk.type.Str getScheme()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaNetworkService.INST().g_network_service_get_scheme(asCPointer())));
    }

    /**
     * Gets &#64;srv's service name (eg, &quot;ldap&quot;).
     * @return &#64;srv's service name
    */
    public ch.bailu.gtk.type.Str getService()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaNetworkService.INST().g_network_service_get_service(asCPointer())));
    }

    /**
     * Set's the URI scheme used to resolve proxies. By default, the service name
     * <br>is used as scheme.
     * @param scheme a URI scheme
    */
    public void setScheme(@Nonnull ch.bailu.gtk.type.Str scheme)  {
        JnaNetworkService.INST().g_network_service_set_scheme(asCPointer(), asCPointerNotNull(scheme));
    }

    /**
     * Set's the URI scheme used to resolve proxies. By default, the service name
     * <br>is used as scheme.
     * @param scheme a URI scheme
    */
    public void setScheme(String scheme)  {
        JnaNetworkService.INST().g_network_service_set_scheme(asCPointer(), scheme);
    }

    /**
     * Implements interface {@link SocketConnectable}. Call this to get access to interface functions.
     * @return {@link SocketConnectable}
    */
    public SocketConnectable asSocketConnectable() {
        return new SocketConnectable(cast());
    }

    public static long getTypeID() { 
        return JnaNetworkService.INST().g_network_service_get_type(); 
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
