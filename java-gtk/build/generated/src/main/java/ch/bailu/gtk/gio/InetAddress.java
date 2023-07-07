/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GInetAddress represents an IPv4 or IPv6 internet address. Use
 * <br>g_resolver_lookup_by_name() or g_resolver_lookup_by_name_async() to
 * <br>look up the &#35;GInetAddress for a hostname. Use
 * <br>g_resolver_lookup_by_address() or
 * <br>g_resolver_lookup_by_address_async() to look up the hostname for a
 * <br>&#35;GInetAddress.
 * <br>
 * <br>To actually connect to a remote host, you will need a
 * <br>&#35;GInetSocketAddress (which includes a &#35;GInetAddress as well as a
 * <br>port number).
 * <p><a href="https://docs.gtk.org/gio/class.InetAddress.html">https://docs.gtk.org/gio/class.InetAddress.html</a></p>
*/
public class InetAddress extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InetAddress.class.getCanonicalName());
    }

    public InetAddress(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a &#35;GInetAddress for the &quot;any&quot; address (unassigned/&quot;don't
     * <br>care&quot;) for &#64;family.
     * @param family the address family
     * @return a new &#35;GInetAddress corresponding to the &quot;any&quot; address for &#64;family.     Free the returned object with g_object_unref().
    */
    public static InetAddress newAnyInetAddress(int family)  {
        PointerContainer __self = cast(JnaInetAddress.INST().g_inet_address_new_any(family));
        if (__self.isNull()) {
            throw new NullPointerException("InetAddress:newAny");
        }
        return new InetAddress(__self);
    }        
    

    /**
     * Parses &#64;string as an IP address and creates a new &#35;GInetAddress.
     * @param string a string representation of an IP address
     * @return a new &#35;GInetAddress corresponding to &#64;string, or %NULL if &#64;string could not be parsed.     Free the returned object with g_object_unref().
    */
    public static InetAddress newFromStringInetAddress(@Nonnull ch.bailu.gtk.type.Str string)  {
        PointerContainer __self = cast(JnaInetAddress.INST().g_inet_address_new_from_string(asCPointerNotNull(string)));
        if (__self.isNull()) {
            throw new NullPointerException("InetAddress:newFromString");
        }
        return new InetAddress(__self);
    }        
    

    /**
     * Parses &#64;string as an IP address and creates a new &#35;GInetAddress.
     * @param string a string representation of an IP address
     * @return a new &#35;GInetAddress corresponding to &#64;string, or %NULL if &#64;string could not be parsed.     Free the returned object with g_object_unref().
    */
    public static InetAddress newFromStringInetAddress(String string)  {
        PointerContainer __self = cast(JnaInetAddress.INST().g_inet_address_new_from_string(string));
        if (__self.isNull()) {
            throw new NullPointerException("InetAddress:newFromString");
        }
        return new InetAddress(__self);
    }        
    

    /**
     * Creates a &#35;GInetAddress for the loopback address for &#64;family.
     * @param family the address family
     * @return a new &#35;GInetAddress corresponding to the loopback address for &#64;family.     Free the returned object with g_object_unref().
    */
    public static InetAddress newLoopbackInetAddress(int family)  {
        PointerContainer __self = cast(JnaInetAddress.INST().g_inet_address_new_loopback(family));
        if (__self.isNull()) {
            throw new NullPointerException("InetAddress:newLoopback");
        }
        return new InetAddress(__self);
    }        
    

    /**
     * Checks if two &#35;GInetAddress instances are equal, e.g. the same address.
     * @param other_address Another &#35;GInetAddress.
     * @return %TRUE if &#64;address and &#64;other_address are equal, %FALSE otherwise.
    */
    public boolean equal(@Nonnull InetAddress other_address)  {
        return JnaInetAddress.INST().g_inet_address_equal(asCPointer(), asCPointerNotNull(other_address));
    }

    /**
     * Gets &#64;address's family
     * @return &#64;address's family
    */
    public int getFamily()  {
        return JnaInetAddress.INST().g_inet_address_get_family(asCPointer());
    }

    /**
     * Tests whether &#64;address is the &quot;any&quot; address for its family.
     * @return %TRUE if &#64;address is the &quot;any&quot; address for its family.
    */
    public boolean getIsAny()  {
        return JnaInetAddress.INST().g_inet_address_get_is_any(asCPointer());
    }

    /**
     * Tests whether &#64;address is a link-local address (that is, if it
     * <br>identifies a host on a local network that is not connected to the
     * <br>Internet).
     * @return %TRUE if &#64;address is a link-local address.
    */
    public boolean getIsLinkLocal()  {
        return JnaInetAddress.INST().g_inet_address_get_is_link_local(asCPointer());
    }

    /**
     * Tests whether &#64;address is the loopback address for its family.
     * @return %TRUE if &#64;address is the loopback address for its family.
    */
    public boolean getIsLoopback()  {
        return JnaInetAddress.INST().g_inet_address_get_is_loopback(asCPointer());
    }

    /**
     * Tests whether &#64;address is a global multicast address.
     * @return %TRUE if &#64;address is a global multicast address.
    */
    public boolean getIsMcGlobal()  {
        return JnaInetAddress.INST().g_inet_address_get_is_mc_global(asCPointer());
    }

    /**
     * Tests whether &#64;address is a link-local multicast address.
     * @return %TRUE if &#64;address is a link-local multicast address.
    */
    public boolean getIsMcLinkLocal()  {
        return JnaInetAddress.INST().g_inet_address_get_is_mc_link_local(asCPointer());
    }

    /**
     * Tests whether &#64;address is a node-local multicast address.
     * @return %TRUE if &#64;address is a node-local multicast address.
    */
    public boolean getIsMcNodeLocal()  {
        return JnaInetAddress.INST().g_inet_address_get_is_mc_node_local(asCPointer());
    }

    /**
     * Tests whether &#64;address is an organization-local multicast address.
     * @return %TRUE if &#64;address is an organization-local multicast address.
    */
    public boolean getIsMcOrgLocal()  {
        return JnaInetAddress.INST().g_inet_address_get_is_mc_org_local(asCPointer());
    }

    /**
     * Tests whether &#64;address is a site-local multicast address.
     * @return %TRUE if &#64;address is a site-local multicast address.
    */
    public boolean getIsMcSiteLocal()  {
        return JnaInetAddress.INST().g_inet_address_get_is_mc_site_local(asCPointer());
    }

    /**
     * Tests whether &#64;address is a multicast address.
     * @return %TRUE if &#64;address is a multicast address.
    */
    public boolean getIsMulticast()  {
        return JnaInetAddress.INST().g_inet_address_get_is_multicast(asCPointer());
    }

    /**
     * Tests whether &#64;address is a site-local address such as 10.0.0.1
     * <br>(that is, the address identifies a host on a local network that can
     * <br>not be reached directly from the Internet, but which may have
     * <br>outgoing Internet connectivity via a NAT or firewall).
     * @return %TRUE if &#64;address is a site-local address.
    */
    public boolean getIsSiteLocal()  {
        return JnaInetAddress.INST().g_inet_address_get_is_site_local(asCPointer());
    }

    /**
     * Gets the size of the native raw binary address for &#64;address. This
     * <br>is the size of the data that you get from g_inet_address_to_bytes().
     * @return the number of bytes used for the native version of &#64;address.
    */
    public long getNativeSize()  {
        return JnaInetAddress.INST().g_inet_address_get_native_size(asCPointer());
    }

    /**
     * Converts &#64;address to string form.
     * @return a representation of &#64;address as a string, which should be freed after use.
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaInetAddress.INST().g_inet_address_to_string(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaInetAddress.INST().g_inet_address_get_type(); 
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

[MethodModel:java-type-not-supported:newFromBytes:[ParameterModel:Supported:{Gg:InetAddress:{c:GInetAddress*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guint8*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:GSocketFamily}}:{j:int}]

[MethodModel:cb-return-value-not-supported:toBytes:[ParameterModel:java-type-not-supported:{G_::{c:const guint8*}}:{j:}]]
*/
