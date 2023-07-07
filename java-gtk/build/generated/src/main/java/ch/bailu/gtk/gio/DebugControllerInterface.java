/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The virtual function table for &#35;GDebugController.
 * <p><a href="https://docs.gtk.org/gio/struct.DebugControllerInterface.html">https://docs.gtk.org/gio/struct.DebugControllerInterface.html</a></p>
*/
public class DebugControllerInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DebugControllerInterface.class.getCanonicalName());
    }

    public DebugControllerInterface(PointerContainer pointer) {
        super(pointer);
    }

    public DebugControllerInterface() {
        super(cast(JnaDebugControllerInterface.allocateStructure()));
    }

    private JnaDebugControllerInterface.Fields _fields;
    
    JnaDebugControllerInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDebugControllerInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DebugController.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DebugController.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
