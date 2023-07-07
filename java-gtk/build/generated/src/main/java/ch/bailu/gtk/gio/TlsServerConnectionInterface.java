/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * vtable for a &#35;GTlsServerConnection implementation.
 * <p><a href="https://docs.gtk.org/gio/struct.TlsServerConnectionInterface.html">https://docs.gtk.org/gio/struct.TlsServerConnectionInterface.html</a></p>
*/
public class TlsServerConnectionInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsServerConnectionInterface.class.getCanonicalName());
    }

    public TlsServerConnectionInterface(PointerContainer pointer) {
        super(pointer);
    }

    public TlsServerConnectionInterface() {
        super(cast(JnaTlsServerConnectionInterface.allocateStructure()));
    }

    private JnaTlsServerConnectionInterface.Fields _fields;
    
    JnaTlsServerConnectionInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTlsServerConnectionInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsServerConnection.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsServerConnection.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
