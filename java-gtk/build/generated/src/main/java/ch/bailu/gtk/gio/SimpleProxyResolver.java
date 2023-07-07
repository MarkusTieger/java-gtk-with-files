/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GSimpleProxyResolver is a simple &#35;GProxyResolver implementation
 * <br>that handles a single default proxy, multiple URI-scheme-specific
 * <br>proxies, and a list of hosts that proxies should not be used for.
 * <br>
 * <br>&#35;GSimpleProxyResolver is never the default proxy resolver, but it
 * <br>can be used as the base class for another proxy resolver
 * <br>implementation, or it can be created and used manually, such as
 * <br>with g_socket_client_set_proxy_resolver().
 * <p><a href="https://docs.gtk.org/gio/class.SimpleProxyResolver.html">https://docs.gtk.org/gio/class.SimpleProxyResolver.html</a></p>
*/
public class SimpleProxyResolver extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SimpleProxyResolver.class.getCanonicalName());
    }

    public SimpleProxyResolver(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Sets the default proxy on &#64;resolver, to be used for any URIs that
     * <br>don't match &#35;GSimpleProxyResolver:ignore-hosts or a proxy set
     * <br>via g_simple_proxy_resolver_set_uri_proxy().
     * <br>
     * <br>If &#64;default_proxy starts with &quot;socks://&quot;,
     * <br>&#35;GSimpleProxyResolver will treat it as referring to all three of
     * <br>the socks5, socks4a, and socks4 proxy types.
     * @param default_proxy the default proxy to use
    */
    public void setDefaultProxy(@Nullable ch.bailu.gtk.type.Str default_proxy)  {
        JnaSimpleProxyResolver.INST().g_simple_proxy_resolver_set_default_proxy(asCPointer(), asCPointer(default_proxy));
    }

    /**
     * Sets the default proxy on &#64;resolver, to be used for any URIs that
     * <br>don't match &#35;GSimpleProxyResolver:ignore-hosts or a proxy set
     * <br>via g_simple_proxy_resolver_set_uri_proxy().
     * <br>
     * <br>If &#64;default_proxy starts with &quot;socks://&quot;,
     * <br>&#35;GSimpleProxyResolver will treat it as referring to all three of
     * <br>the socks5, socks4a, and socks4 proxy types.
     * @param default_proxy the default proxy to use
    */
    public void setDefaultProxy(String default_proxy)  {
        JnaSimpleProxyResolver.INST().g_simple_proxy_resolver_set_default_proxy(asCPointer(), default_proxy);
    }

    /**
     * Adds a URI-scheme-specific proxy to &#64;resolver; URIs whose scheme
     * <br>matches &#64;uri_scheme (and which don't match
     * <br>&#35;GSimpleProxyResolver:ignore-hosts) will be proxied via &#64;proxy.
     * <br>
     * <br>As with &#35;GSimpleProxyResolver:default-proxy, if &#64;proxy starts with
     * <br>&quot;socks://&quot;, &#35;GSimpleProxyResolver will treat it
     * <br>as referring to all three of the socks5, socks4a, and socks4 proxy
     * <br>types.
     * @param uri_scheme the URI scheme to add a proxy for
     * @param proxy the proxy to use for &#64;uri_scheme
    */
    public void setUriProxy(@Nonnull ch.bailu.gtk.type.Str uri_scheme, @Nonnull ch.bailu.gtk.type.Str proxy)  {
        JnaSimpleProxyResolver.INST().g_simple_proxy_resolver_set_uri_proxy(asCPointer(), asCPointerNotNull(uri_scheme), asCPointerNotNull(proxy));
    }

    /**
     * Adds a URI-scheme-specific proxy to &#64;resolver; URIs whose scheme
     * <br>matches &#64;uri_scheme (and which don't match
     * <br>&#35;GSimpleProxyResolver:ignore-hosts) will be proxied via &#64;proxy.
     * <br>
     * <br>As with &#35;GSimpleProxyResolver:default-proxy, if &#64;proxy starts with
     * <br>&quot;socks://&quot;, &#35;GSimpleProxyResolver will treat it
     * <br>as referring to all three of the socks5, socks4a, and socks4 proxy
     * <br>types.
     * @param uri_scheme the URI scheme to add a proxy for
     * @param proxy the proxy to use for &#64;uri_scheme
    */
    public void setUriProxy(String uri_scheme, String proxy)  {
        JnaSimpleProxyResolver.INST().g_simple_proxy_resolver_set_uri_proxy(asCPointer(), uri_scheme, proxy);
    }

    /**
     * Implements interface {@link ProxyResolver}. Call this to get access to interface functions.
     * @return {@link ProxyResolver}
    */
    public ProxyResolver asProxyResolver() {
        return new ProxyResolver(cast());
    }

    public static long getTypeID() { 
        return JnaSimpleProxyResolver.INST().g_simple_proxy_resolver_get_type(); 
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

[MethodModel:java-type-not-supported:setIgnoreHosts:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:java-type-not-supported:_new:[ParameterModel:Supported:{Gg:ProxyResolver:{c:GProxyResolver*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
*/
