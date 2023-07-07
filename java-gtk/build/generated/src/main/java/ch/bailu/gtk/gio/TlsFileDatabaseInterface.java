/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Provides an interface for &#35;GTlsFileDatabase implementations.
 * <p><a href="https://docs.gtk.org/gio/struct.TlsFileDatabaseInterface.html">https://docs.gtk.org/gio/struct.TlsFileDatabaseInterface.html</a></p>
*/
public class TlsFileDatabaseInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsFileDatabaseInterface.class.getCanonicalName());
    }

    public TlsFileDatabaseInterface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaTlsFileDatabaseInterface.Fields _fields;
    
    JnaTlsFileDatabaseInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTlsFileDatabaseInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsFileDatabase.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsFileDatabase.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
