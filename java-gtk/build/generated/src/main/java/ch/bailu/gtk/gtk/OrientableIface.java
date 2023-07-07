/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.OrientableIface.html">https://docs.gtk.org/gtk4/struct.OrientableIface.html</a></p>
*/
public class OrientableIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(OrientableIface.class.getCanonicalName());
    }

    public OrientableIface(PointerContainer pointer) {
        super(pointer);
    }

    public OrientableIface() {
        super(cast(JnaOrientableIface.allocateStructure()));
    }

    private JnaOrientableIface.Fields _fields;
    
    JnaOrientableIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaOrientableIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String BASE_IFACE = "base_iface";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Orientable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Orientable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
