/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The list of virtual functions for the `GtkSymbolicPaintable` interface.
 * <br>No function must be implemented, default implementations exist for each one.
 * <p><a href="https://docs.gtk.org/gtk4/struct.SymbolicPaintableInterface.html">https://docs.gtk.org/gtk4/struct.SymbolicPaintableInterface.html</a></p>
*/
public class SymbolicPaintableInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SymbolicPaintableInterface.class.getCanonicalName());
    }

    public SymbolicPaintableInterface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaSymbolicPaintableInterface.Fields _fields;
    
    JnaSymbolicPaintableInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSymbolicPaintableInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SymbolicPaintable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SymbolicPaintable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:snapshot_symbolic:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
