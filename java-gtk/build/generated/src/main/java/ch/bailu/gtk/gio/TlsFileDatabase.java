/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GTlsFileDatabase is implemented by &#35;GTlsDatabase objects which load
 * <br>their certificate information from a file. It is an interface which
 * <br>TLS library specific subtypes implement.
 * <p><a href="https://docs.gtk.org/gio/iface.TlsFileDatabase.html">https://docs.gtk.org/gio/iface.TlsFileDatabase.html</a></p>
*/
public class TlsFileDatabase extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsFileDatabase.class.getCanonicalName());
    }

    public TlsFileDatabase(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GTlsFileDatabase which uses anchor certificate authorities
     * <br>in &#64;anchors to verify certificate chains.
     * <br>
     * <br>The certificates in &#64;anchors must be PEM encoded.
     * @param anchors filename of anchor certificate authorities.
     * @return the new &#35;GTlsFileDatabase, or %NULL on error
    */
    public static TlsFileDatabase _new(@Nonnull ch.bailu.gtk.type.Str anchors) throws ch.bailu.gtk.type.exception.AllocationError {
        return new TlsFileDatabase(new PointerContainer(JnaTlsFileDatabase.INST().g_tls_file_database_new(asCPointerNotNull(anchors), 0L)));
    }

    public static long getTypeID() { 
        return JnaTlsFileDatabase.INST().g_tls_file_database_get_type(); 
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
