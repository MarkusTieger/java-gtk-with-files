/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * vtable for a &#35;GDtlsClientConnection implementation.
 * <p><a href="https://docs.gtk.org/gio/struct.DtlsClientConnectionInterface.html">https://docs.gtk.org/gio/struct.DtlsClientConnectionInterface.html</a></p>
*/
public class DtlsClientConnectionInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DtlsClientConnectionInterface.class.getCanonicalName());
    }

    public DtlsClientConnectionInterface(PointerContainer pointer) {
        super(pointer);
    }

    public DtlsClientConnectionInterface() {
        super(cast(JnaDtlsClientConnectionInterface.allocateStructure()));
    }

    private JnaDtlsClientConnectionInterface.Fields _fields;
    
    JnaDtlsClientConnectionInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDtlsClientConnectionInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DtlsClientConnection.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DtlsClientConnection.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
