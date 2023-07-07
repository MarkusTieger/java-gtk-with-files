/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Objects that describe one or more potential socket endpoints
 * <br>implement &#35;GSocketConnectable. Callers can then use
 * <br>g_socket_connectable_enumerate() to get a &#35;GSocketAddressEnumerator
 * <br>to try out each socket address in turn until one succeeds, as shown
 * <br>in the sample code below.
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * MyConnectionType *
 * connect_to_host (const char    *hostname,
 *                  guint16        port,
 *                  GCancellable  *cancellable,
 *                  GError       **error)
 * {
 *   MyConnection *conn = NULL;
 *   GSocketConnectable *addr;
 *   GSocketAddressEnumerator *enumerator;
 *   GSocketAddress *sockaddr;
 *   GError *conn_error = NULL;
 * 
 *   addr = g_network_address_new (hostname, port);
 *   enumerator = g_socket_connectable_enumerate (addr);
 *   g_object_unref (addr);
 * 
 *   // Try each sockaddr until we succeed. Record the first connection error,
 *   // but not any further ones (since they'll probably be basically the same
 *   // as the first).
 *   while (!conn &amp;&amp; (sockaddr = g_socket_address_enumerator_next (enumerator, cancellable, error))
 *     {
 *       conn = connect_to_sockaddr (sockaddr, conn_error ? NULL : &amp;conn_error);
 *       g_object_unref (sockaddr);
 *     }
 *   g_object_unref (enumerator);
 * 
 *   if (conn)
 *     {
 *       if (conn_error)
 *         {
 *           // We couldn't connect to the first address, but we succeeded
 *           // in connecting to a later address.
 *           g_error_free (conn_error);
 *         }
 *       return conn;
 *     }
 *   else if (error)
 *     {
 *       /// Either initial lookup failed, or else the caller cancelled us.
 *       if (conn_error)
 *         g_error_free (conn_error);
 *       return NULL;
 *     }
 *   else
 *     {
 *       g_error_propagate (error, conn_error);
 *       return NULL;
 *     }
 * }
 * </pre>
 * <p><a href="https://docs.gtk.org/gio/iface.SocketConnectable.html">https://docs.gtk.org/gio/iface.SocketConnectable.html</a></p>
*/
public class SocketConnectable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SocketConnectable.class.getCanonicalName());
    }

    public SocketConnectable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a &#35;GSocketAddressEnumerator for &#64;connectable.
     * @return a new &#35;GSocketAddressEnumerator.
    */
    public SocketAddressEnumerator enumerate()  {
        return new SocketAddressEnumerator(new PointerContainer(JnaSocketConnectable.INST().g_socket_connectable_enumerate(asCPointer())));
    }

    /**
     * Creates a &#35;GSocketAddressEnumerator for &#64;connectable that will
     * <br>return a &#35;GProxyAddress for each of its addresses that you must connect
     * <br>to via a proxy.
     * <br>
     * <br>If &#64;connectable does not implement
     * <br>g_socket_connectable_proxy_enumerate(), this will fall back to
     * <br>calling g_socket_connectable_enumerate().
     * @return a new &#35;GSocketAddressEnumerator.
    */
    public SocketAddressEnumerator proxyEnumerate()  {
        return new SocketAddressEnumerator(new PointerContainer(JnaSocketConnectable.INST().g_socket_connectable_proxy_enumerate(asCPointer())));
    }

    /**
     * Format a &#35;GSocketConnectable as a string. This is a human-readable format for
     * <br>use in debugging output, and is not a stable serialization format. It is not
     * <br>suitable for use in user interfaces as it exposes too much information for a
     * <br>user.
     * <br>
     * <br>If the &#35;GSocketConnectable implementation does not support string formatting,
     * <br>the implementation’s type name will be returned as a fallback.
     * @return the formatted string
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaSocketConnectable.INST().g_socket_connectable_to_string(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaSocketConnectable.INST().g_socket_connectable_get_type(); 
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
interface-type
*/
