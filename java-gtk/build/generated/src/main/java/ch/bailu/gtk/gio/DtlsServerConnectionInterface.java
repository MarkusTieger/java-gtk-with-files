/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * vtable for a &#35;GDtlsServerConnection implementation.
 * <p><a href="https://docs.gtk.org/gio/struct.DtlsServerConnectionInterface.html">https://docs.gtk.org/gio/struct.DtlsServerConnectionInterface.html</a></p>
*/
public class DtlsServerConnectionInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DtlsServerConnectionInterface.class.getCanonicalName());
    }

    public DtlsServerConnectionInterface(PointerContainer pointer) {
        super(pointer);
    }

    public DtlsServerConnectionInterface() {
        super(cast(JnaDtlsServerConnectionInterface.allocateStructure()));
    }

    private JnaDtlsServerConnectionInterface.Fields _fields;
    
    JnaDtlsServerConnectionInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDtlsServerConnectionInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DtlsServerConnection.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DtlsServerConnection.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
