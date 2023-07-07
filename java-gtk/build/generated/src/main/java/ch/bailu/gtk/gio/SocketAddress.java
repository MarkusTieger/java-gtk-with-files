/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GSocketAddress is the equivalent of struct sockaddr in the BSD
 * <br>sockets API. This is an abstract class; use &#35;GInetSocketAddress
 * <br>for internet sockets, or &#35;GUnixSocketAddress for UNIX domain sockets.
 * <p><a href="https://docs.gtk.org/gio/class.SocketAddress.html">https://docs.gtk.org/gio/class.SocketAddress.html</a></p>
*/
public class SocketAddress extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SocketAddress.class.getCanonicalName());
    }

    public SocketAddress(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a &#35;GSocketAddress subclass corresponding to the native
     * <br>struct sockaddr &#64;native.
     * @param _native a pointer to a struct sockaddr
     * @param len the size of the memory location pointed to by &#64;native
     * @return a new &#35;GSocketAddress if &#64;native could successfully     be converted, otherwise %NULL
    */
    public static SocketAddress newFromNativeSocketAddress(@Nonnull ch.bailu.gtk.type.Pointer _native, long len)  {
        PointerContainer __self = cast(JnaSocketAddress.INST().g_socket_address_new_from_native(asCPointerNotNull(_native), len));
        if (__self.isNull()) {
            throw new NullPointerException("SocketAddress:newFromNative");
        }
        return new SocketAddress(__self);
    }        
    

    /**
     * Gets the socket family type of &#64;address.
     * @return the socket family type of &#64;address
    */
    public int getFamily()  {
        return JnaSocketAddress.INST().g_socket_address_get_family(asCPointer());
    }

    /**
     * Gets the size of &#64;address's native struct sockaddr.
     * <br>You can use this to allocate memory to pass to
     * <br>g_socket_address_to_native().
     * @return the size of the native struct sockaddr that     &#64;address represents
    */
    public long getNativeSize()  {
        return JnaSocketAddress.INST().g_socket_address_get_native_size(asCPointer());
    }

    /**
     * Converts a &#35;GSocketAddress to a native struct sockaddr, which can
     * <br>be passed to low-level functions like connect() or bind().
     * <br>
     * <br>If not enough space is available, a %G_IO_ERROR_NO_SPACE error
     * <br>is returned. If the address type is not known on the system
     * <br>then a %G_IO_ERROR_NOT_SUPPORTED error is returned.
     * @param dest a pointer to a memory location that will contain the native struct sockaddr
     * @param destlen the size of &#64;dest. Must be at least as large as     g_socket_address_get_native_size()
     * @return %TRUE if &#64;dest was filled in, %FALSE on error
    */
    public boolean toNative(@Nullable ch.bailu.gtk.type.Pointer dest, long destlen) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaSocketAddress.INST().g_socket_address_to_native(asCPointer(), asCPointer(dest), destlen, 0L);
    }

    /**
     * Implements interface {@link SocketConnectable}. Call this to get access to interface functions.
     * @return {@link SocketConnectable}
    */
    public SocketConnectable asSocketConnectable() {
        return new SocketConnectable(cast());
    }

    public static long getTypeID() { 
        return JnaSocketAddress.INST().g_socket_address_get_type(); 
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
