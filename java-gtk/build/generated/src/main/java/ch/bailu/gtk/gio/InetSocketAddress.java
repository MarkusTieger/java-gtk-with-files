/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An IPv4 or IPv6 socket address; that is, the combination of a
 * <br>&#35;GInetAddress and a port number.
 * <p><a href="https://docs.gtk.org/gio/class.InetSocketAddress.html">https://docs.gtk.org/gio/class.InetSocketAddress.html</a></p>
*/
public class InetSocketAddress extends SocketAddress {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InetSocketAddress.class.getCanonicalName());
    }

    public InetSocketAddress(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GInetSocketAddress for &#64;address and &#64;port.
     * <br>
     * <br>If &#64;address is an IPv6 address, it can also contain a scope ID
     * <br>(separated from the address by a `%`).
     * @param address the string form of an IP address
     * @param port a port number
     * @return a new &#35;GInetSocketAddress, or %NULL if &#64;address cannot be parsed.
    */
    public static InetSocketAddress newFromStringInetSocketAddress(@Nonnull ch.bailu.gtk.type.Str address, int port)  {
        PointerContainer __self = cast(JnaInetSocketAddress.INST().g_inet_socket_address_new_from_string(asCPointerNotNull(address), port));
        if (__self.isNull()) {
            throw new NullPointerException("InetSocketAddress:newFromString");
        }
        return new InetSocketAddress(__self);
    }        
    

    /**
     * Creates a new &#35;GInetSocketAddress for &#64;address and &#64;port.
     * <br>
     * <br>If &#64;address is an IPv6 address, it can also contain a scope ID
     * <br>(separated from the address by a `%`).
     * @param address the string form of an IP address
     * @param port a port number
     * @return a new &#35;GInetSocketAddress, or %NULL if &#64;address cannot be parsed.
    */
    public static InetSocketAddress newFromStringInetSocketAddress(String address, int port)  {
        PointerContainer __self = cast(JnaInetSocketAddress.INST().g_inet_socket_address_new_from_string(address, port));
        if (__self.isNull()) {
            throw new NullPointerException("InetSocketAddress:newFromString");
        }
        return new InetSocketAddress(__self);
    }        
    

    /**
     * Creates a new &#35;GInetSocketAddress for &#64;address and &#64;port.
     * @param address a &#35;GInetAddress
     * @param port a port number
    */
    public InetSocketAddress(@Nonnull InetAddress address, int port) {
        super(cast(JnaInetSocketAddress.INST().g_inet_socket_address_new(asCPointerNotNull(address), port)));
    }

    /**
     * Gets &#64;address's &#35;GInetAddress.
     * @return the &#35;GInetAddress for &#64;address, which must be g_object_ref()'d if it will be stored
    */
    public InetAddress getAddress()  {
        return new InetAddress(new PointerContainer(JnaInetSocketAddress.INST().g_inet_socket_address_get_address(asCPointer())));
    }

    /**
     * Gets the `sin6_flowinfo` field from &#64;address,
     * <br>which must be an IPv6 address.
     * @return the flowinfo field
    */
    public int getFlowinfo()  {
        return JnaInetSocketAddress.INST().g_inet_socket_address_get_flowinfo(asCPointer());
    }

    /**
     * Gets &#64;address's port.
     * @return the port for &#64;address
    */
    public int getPort()  {
        return JnaInetSocketAddress.INST().g_inet_socket_address_get_port(asCPointer());
    }

    /**
     * Gets the `sin6_scope_id` field from &#64;address,
     * <br>which must be an IPv6 address.
     * @return the scope id field
    */
    public int getScopeId()  {
        return JnaInetSocketAddress.INST().g_inet_socket_address_get_scope_id(asCPointer());
    }

    /**
     * Implements interface {@link SocketConnectable}. Call this to get access to interface functions.
     * @return {@link SocketConnectable}
    */
    public SocketConnectable asSocketConnectable() {
        return new SocketConnectable(cast());
    }

    public static long getTypeID() { 
        return JnaInetSocketAddress.INST().g_inet_socket_address_get_type(); 
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
