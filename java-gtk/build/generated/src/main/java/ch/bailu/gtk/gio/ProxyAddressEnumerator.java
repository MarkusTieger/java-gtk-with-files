/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GProxyAddressEnumerator is a wrapper around &#35;GSocketAddressEnumerator which
 * <br>takes the &#35;GSocketAddress instances returned by the &#35;GSocketAddressEnumerator
 * <br>and wraps them in &#35;GProxyAddress instances, using the given
 * <br>&#35;GProxyAddressEnumerator:proxy-resolver.
 * <br>
 * <br>This enumerator will be returned (for example, by
 * <br>g_socket_connectable_enumerate()) as appropriate when a proxy is configured;
 * <br>there should be no need to manually wrap a &#35;GSocketAddressEnumerator instance
 * <br>with one.
 * <p><a href="https://docs.gtk.org/gio/class.ProxyAddressEnumerator.html">https://docs.gtk.org/gio/class.ProxyAddressEnumerator.html</a></p>
*/
public class ProxyAddressEnumerator extends SocketAddressEnumerator {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ProxyAddressEnumerator.class.getCanonicalName());
    }

    public ProxyAddressEnumerator(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaProxyAddressEnumerator.INST().g_proxy_address_enumerator_get_type(); 
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
