/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.NativeVolumeMonitorClass.html">https://docs.gtk.org/gio/struct.NativeVolumeMonitorClass.html</a></p>
*/
public class NativeVolumeMonitorClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NativeVolumeMonitorClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetMountForMountPath {
        /**
         * 
         * @param mount_path 
         * @param cancellable 
         * @return 
        */
        Mount onGetMountForMountPath(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Str mount_path, @Nonnull Cancellable cancellable);
    }
    
    private static JnaNativeVolumeMonitorClass.OnGetMountForMountPath toOnGetMountForMountPath(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetMountForMountPath in) {
        JnaNativeVolumeMonitorClass.OnGetMountForMountPath out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount_path, _cancellable) -> in.onGetMountForMountPath(__callback, new ch.bailu.gtk.type.Str(new PointerContainer(_mount_path)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public NativeVolumeMonitorClass(PointerContainer pointer) {
        super(pointer);
    }

    public NativeVolumeMonitorClass() {
        super(cast(JnaNativeVolumeMonitorClass.allocateStructure()));
    }

    private JnaNativeVolumeMonitorClass.Fields _fields;
    
    JnaNativeVolumeMonitorClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaNativeVolumeMonitorClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnGetMountForMountPath#onGetMountForMountPath}
    */
    public static final String GET_MOUNT_FOR_MOUNT_PATH = "get_mount_for_mount_path";

    /**
     * 
     * <br>See {@link OnGetMountForMountPath#onGetMountForMountPath}
    */
    public void setFieldGetMountForMountPath(OnGetMountForMountPath get_mount_for_mount_path) {
        toFields().get_mount_for_mount_path = toOnGetMountForMountPath(this, GET_MOUNT_FOR_MOUNT_PATH, get_mount_for_mount_path);
        toFields().writeField(GET_MOUNT_FOR_MOUNT_PATH);
    }

    /**
     * 
     * <br>See {@link OnGetMountForMountPath#onGetMountForMountPath}
    */
    public JnaNativeVolumeMonitorClass.OnGetMountForMountPath getFieldGetMountForMountPath() {
       toFields().readField(GET_MOUNT_FOR_MOUNT_PATH);
       return toFields().get_mount_for_mount_path;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(NativeVolumeMonitor.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(NativeVolumeMonitor.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
