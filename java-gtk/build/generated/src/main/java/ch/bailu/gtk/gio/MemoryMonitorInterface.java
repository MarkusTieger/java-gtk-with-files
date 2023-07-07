/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The virtual function table for &#35;GMemoryMonitor.
 * <p><a href="https://docs.gtk.org/gio/struct.MemoryMonitorInterface.html">https://docs.gtk.org/gio/struct.MemoryMonitorInterface.html</a></p>
*/
public class MemoryMonitorInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MemoryMonitorInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnLowMemoryWarning {
        /**
         * 
         * @param monitor 
         * @param level 
        */
        void onLowMemoryWarning(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull MemoryMonitor monitor, int level);
    }
    
    private static JnaMemoryMonitorInterface.OnLowMemoryWarning toOnLowMemoryWarning(ch.bailu.gtk.type.Pointer instance, String methodName, OnLowMemoryWarning in) {
        JnaMemoryMonitorInterface.OnLowMemoryWarning out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_monitor, _level) -> in.onLowMemoryWarning(__callback, new MemoryMonitor(new PointerContainer(_monitor)), _level);
            __callback.register(out);
        }
        return out;
    }

    public MemoryMonitorInterface(PointerContainer pointer) {
        super(pointer);
    }

    public MemoryMonitorInterface() {
        super(cast(JnaMemoryMonitorInterface.allocateStructure()));
    }

    private JnaMemoryMonitorInterface.Fields _fields;
    
    JnaMemoryMonitorInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaMemoryMonitorInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnLowMemoryWarning#onLowMemoryWarning}
    */
    public static final String LOW_MEMORY_WARNING = "low_memory_warning";

    /**
     * 
     * <br>See {@link OnLowMemoryWarning#onLowMemoryWarning}
    */
    public void setFieldLowMemoryWarning(OnLowMemoryWarning low_memory_warning) {
        toFields().low_memory_warning = toOnLowMemoryWarning(this, LOW_MEMORY_WARNING, low_memory_warning);
        toFields().writeField(LOW_MEMORY_WARNING);
    }

    /**
     * 
     * <br>See {@link OnLowMemoryWarning#onLowMemoryWarning}
    */
    public JnaMemoryMonitorInterface.OnLowMemoryWarning getFieldLowMemoryWarning() {
       toFields().readField(LOW_MEMORY_WARNING);
       return toFields().low_memory_warning;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MemoryMonitor.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MemoryMonitor.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
