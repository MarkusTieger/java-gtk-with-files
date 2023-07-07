/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A socket address of some unknown native type.
 * <p><a href="https://docs.gtk.org/gio/class.NativeSocketAddress.html">https://docs.gtk.org/gio/class.NativeSocketAddress.html</a></p>
*/
public class NativeSocketAddress extends SocketAddress {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NativeSocketAddress.class.getCanonicalName());
    }

    public NativeSocketAddress(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GNativeSocketAddress for &#64;native and &#64;len.
     * @param _native a native address object
     * @param len the length of &#64;native, in bytes
    */
    public NativeSocketAddress(@Nullable ch.bailu.gtk.type.Pointer _native, long len) {
        super(cast(JnaNativeSocketAddress.INST().g_native_socket_address_new(asCPointer(_native), len)));
    }

    /**
     * Implements interface {@link SocketConnectable}. Call this to get access to interface functions.
     * @return {@link SocketConnectable}
    */
    public SocketConnectable asSocketConnectable() {
        return new SocketConnectable(cast());
    }

    public static long getTypeID() { 
        return JnaNativeSocketAddress.INST().g_native_socket_address_get_type(); 
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
