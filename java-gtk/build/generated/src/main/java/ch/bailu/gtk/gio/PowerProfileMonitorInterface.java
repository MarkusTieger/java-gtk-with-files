/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The virtual function table for &#35;GPowerProfileMonitor.
 * <p><a href="https://docs.gtk.org/gio/struct.PowerProfileMonitorInterface.html">https://docs.gtk.org/gio/struct.PowerProfileMonitorInterface.html</a></p>
*/
public class PowerProfileMonitorInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PowerProfileMonitorInterface.class.getCanonicalName());
    }

    public PowerProfileMonitorInterface(PointerContainer pointer) {
        super(pointer);
    }

    public PowerProfileMonitorInterface() {
        super(cast(JnaPowerProfileMonitorInterface.allocateStructure()));
    }

    private JnaPowerProfileMonitorInterface.Fields _fields;
    
    JnaPowerProfileMonitorInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPowerProfileMonitorInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PowerProfileMonitor.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(PowerProfileMonitor.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
