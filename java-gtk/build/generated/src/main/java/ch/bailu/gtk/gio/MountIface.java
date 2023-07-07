/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Interface for implementing operations for mounts.
 * <p><a href="https://docs.gtk.org/gio/struct.MountIface.html">https://docs.gtk.org/gio/struct.MountIface.html</a></p>
*/
public class MountIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MountIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * 
         * @param mount 
        */
        void onChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount);
    }
    
    private static JnaMountIface.OnChanged toOnChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnChanged in) {
        JnaMountIface.OnChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount) -> in.onChanged(__callback, new Mount(new PointerContainer(_mount)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnmounted {
        /**
         * 
         * @param mount 
        */
        void onUnmounted(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount);
    }
    
    private static JnaMountIface.OnUnmounted toOnUnmounted(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnmounted in) {
        JnaMountIface.OnUnmounted out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount) -> in.onUnmounted(__callback, new Mount(new PointerContainer(_mount)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetRoot {
        /**
         * 
         * @param mount a &#35;GMount.
         * @return a &#35;GFile.      The returned object should be unreffed with      g_object_unref() when no longer needed.
        */
        File onGetRoot(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount);
    }
    
    private static JnaMountIface.OnGetRoot toOnGetRoot(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetRoot in) {
        JnaMountIface.OnGetRoot out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount) -> in.onGetRoot(__callback, new Mount(new PointerContainer(_mount))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetName {
        /**
         * 
         * @param mount a &#35;GMount.
         * @return the name for the given &#64;mount.     The returned string should be freed with g_free()     when no longer needed.
        */
        ch.bailu.gtk.type.Str onGetName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount);
    }
    
    private static JnaMountIface.OnGetName toOnGetName(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetName in) {
        JnaMountIface.OnGetName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount) -> in.onGetName(__callback, new Mount(new PointerContainer(_mount))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetIcon {
        /**
         * 
         * @param mount a &#35;GMount.
         * @return a &#35;GIcon.      The returned object should be unreffed with      g_object_unref() when no longer needed.
        */
        Icon onGetIcon(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount);
    }
    
    private static JnaMountIface.OnGetIcon toOnGetIcon(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetIcon in) {
        JnaMountIface.OnGetIcon out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount) -> in.onGetIcon(__callback, new Mount(new PointerContainer(_mount))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetUuid {
        /**
         * 
         * @param mount a &#35;GMount.
         * @return the UUID for &#64;mount or %NULL if no UUID     can be computed.     The returned string should be freed with g_free()     when no longer needed.
        */
        ch.bailu.gtk.type.Str onGetUuid(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount);
    }
    
    private static JnaMountIface.OnGetUuid toOnGetUuid(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetUuid in) {
        JnaMountIface.OnGetUuid out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount) -> in.onGetUuid(__callback, new Mount(new PointerContainer(_mount))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetVolume {
        /**
         * 
         * @param mount a &#35;GMount.
         * @return a &#35;GVolume or %NULL if &#64;mount is not      associated with a volume.      The returned object should be unreffed with      g_object_unref() when no longer needed.
        */
        Volume onGetVolume(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount);
    }
    
    private static JnaMountIface.OnGetVolume toOnGetVolume(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetVolume in) {
        JnaMountIface.OnGetVolume out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount) -> in.onGetVolume(__callback, new Mount(new PointerContainer(_mount))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetDrive {
        /**
         * 
         * @param mount a &#35;GMount.
         * @return a &#35;GDrive or %NULL if &#64;mount is not      associated with a volume or a drive.      The returned object should be unreffed with      g_object_unref() when no longer needed.
        */
        Drive onGetDrive(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount);
    }
    
    private static JnaMountIface.OnGetDrive toOnGetDrive(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDrive in) {
        JnaMountIface.OnGetDrive out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount) -> in.onGetDrive(__callback, new Mount(new PointerContainer(_mount))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCanUnmount {
        /**
         * 
         * @param mount a &#35;GMount.
         * @return %TRUE if the &#64;mount can be unmounted.
        */
        boolean onCanUnmount(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount);
    }
    
    private static JnaMountIface.OnCanUnmount toOnCanUnmount(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanUnmount in) {
        JnaMountIface.OnCanUnmount out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount) -> in.onCanUnmount(__callback, new Mount(new PointerContainer(_mount)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCanEject {
        /**
         * 
         * @param mount a &#35;GMount.
         * @return %TRUE if the &#64;mount can be ejected.
        */
        boolean onCanEject(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount);
    }
    
    private static JnaMountIface.OnCanEject toOnCanEject(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanEject in) {
        JnaMountIface.OnCanEject out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount) -> in.onCanEject(__callback, new Mount(new PointerContainer(_mount)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnmountFinish {
        /**
         * 
         * @param mount a &#35;GMount.
         * @param result a &#35;GAsyncResult.
         * @return %TRUE if the mount was successfully unmounted. %FALSE otherwise.
        */
        boolean onUnmountFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount, @Nonnull AsyncResult result);
    }
    
    private static JnaMountIface.OnUnmountFinish toOnUnmountFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnmountFinish in) {
        JnaMountIface.OnUnmountFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount, _result, _error) -> in.onUnmountFinish(__callback, new Mount(new PointerContainer(_mount)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEjectFinish {
        /**
         * 
         * @param mount a &#35;GMount.
         * @param result a &#35;GAsyncResult.
         * @return %TRUE if the mount was successfully ejected. %FALSE otherwise.
        */
        boolean onEjectFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount, @Nonnull AsyncResult result);
    }
    
    private static JnaMountIface.OnEjectFinish toOnEjectFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnEjectFinish in) {
        JnaMountIface.OnEjectFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount, _result, _error) -> in.onEjectFinish(__callback, new Mount(new PointerContainer(_mount)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRemountFinish {
        /**
         * 
         * @param mount a &#35;GMount.
         * @param result a &#35;GAsyncResult.
         * @return %TRUE if the mount was successfully remounted. %FALSE otherwise.
        */
        boolean onRemountFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount, @Nonnull AsyncResult result);
    }
    
    private static JnaMountIface.OnRemountFinish toOnRemountFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnRemountFinish in) {
        JnaMountIface.OnRemountFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount, _result, _error) -> in.onRemountFinish(__callback, new Mount(new PointerContainer(_mount)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    public MountIface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaMountIface.Fields _fields;
    
    JnaMountIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaMountIface.Fields(asCPointer());
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
     * <br>See {@link OnChanged#onChanged}
    */
    public static final String CHANGED = "changed";

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public void setFieldChanged(OnChanged changed) {
        toFields().changed = toOnChanged(this, CHANGED, changed);
        toFields().writeField(CHANGED);
    }

    /**
     * 
     * <br>See {@link OnChanged#onChanged}
    */
    public JnaMountIface.OnChanged getFieldChanged() {
       toFields().readField(CHANGED);
       return toFields().changed;
    } 

    /**
     * 
     * <br>See {@link OnUnmounted#onUnmounted}
    */
    public static final String UNMOUNTED = "unmounted";

    /**
     * 
     * <br>See {@link OnUnmounted#onUnmounted}
    */
    public void setFieldUnmounted(OnUnmounted unmounted) {
        toFields().unmounted = toOnUnmounted(this, UNMOUNTED, unmounted);
        toFields().writeField(UNMOUNTED);
    }

    /**
     * 
     * <br>See {@link OnUnmounted#onUnmounted}
    */
    public JnaMountIface.OnUnmounted getFieldUnmounted() {
       toFields().readField(UNMOUNTED);
       return toFields().unmounted;
    } 

    /**
     * 
     * <br>See {@link OnGetRoot#onGetRoot}
    */
    public static final String GET_ROOT = "get_root";

    /**
     * 
     * <br>See {@link OnGetRoot#onGetRoot}
    */
    public void setFieldGetRoot(OnGetRoot get_root) {
        toFields().get_root = toOnGetRoot(this, GET_ROOT, get_root);
        toFields().writeField(GET_ROOT);
    }

    /**
     * 
     * <br>See {@link OnGetRoot#onGetRoot}
    */
    public JnaMountIface.OnGetRoot getFieldGetRoot() {
       toFields().readField(GET_ROOT);
       return toFields().get_root;
    } 

    /**
     * 
     * <br>See {@link OnGetName#onGetName}
    */
    public static final String GET_NAME = "get_name";

    /**
     * 
     * <br>See {@link OnGetName#onGetName}
    */
    public void setFieldGetName(OnGetName get_name) {
        toFields().get_name = toOnGetName(this, GET_NAME, get_name);
        toFields().writeField(GET_NAME);
    }

    /**
     * 
     * <br>See {@link OnGetName#onGetName}
    */
    public JnaMountIface.OnGetName getFieldGetName() {
       toFields().readField(GET_NAME);
       return toFields().get_name;
    } 

    /**
     * 
     * <br>See {@link OnGetIcon#onGetIcon}
    */
    public static final String GET_ICON = "get_icon";

    /**
     * 
     * <br>See {@link OnGetIcon#onGetIcon}
    */
    public void setFieldGetIcon(OnGetIcon get_icon) {
        toFields().get_icon = toOnGetIcon(this, GET_ICON, get_icon);
        toFields().writeField(GET_ICON);
    }

    /**
     * 
     * <br>See {@link OnGetIcon#onGetIcon}
    */
    public JnaMountIface.OnGetIcon getFieldGetIcon() {
       toFields().readField(GET_ICON);
       return toFields().get_icon;
    } 

    /**
     * 
     * <br>See {@link OnGetUuid#onGetUuid}
    */
    public static final String GET_UUID = "get_uuid";

    /**
     * 
     * <br>See {@link OnGetUuid#onGetUuid}
    */
    public void setFieldGetUuid(OnGetUuid get_uuid) {
        toFields().get_uuid = toOnGetUuid(this, GET_UUID, get_uuid);
        toFields().writeField(GET_UUID);
    }

    /**
     * 
     * <br>See {@link OnGetUuid#onGetUuid}
    */
    public JnaMountIface.OnGetUuid getFieldGetUuid() {
       toFields().readField(GET_UUID);
       return toFields().get_uuid;
    } 

    /**
     * 
     * <br>See {@link OnGetVolume#onGetVolume}
    */
    public static final String GET_VOLUME = "get_volume";

    /**
     * 
     * <br>See {@link OnGetVolume#onGetVolume}
    */
    public void setFieldGetVolume(OnGetVolume get_volume) {
        toFields().get_volume = toOnGetVolume(this, GET_VOLUME, get_volume);
        toFields().writeField(GET_VOLUME);
    }

    /**
     * 
     * <br>See {@link OnGetVolume#onGetVolume}
    */
    public JnaMountIface.OnGetVolume getFieldGetVolume() {
       toFields().readField(GET_VOLUME);
       return toFields().get_volume;
    } 

    /**
     * 
     * <br>See {@link OnGetDrive#onGetDrive}
    */
    public static final String GET_DRIVE = "get_drive";

    /**
     * 
     * <br>See {@link OnGetDrive#onGetDrive}
    */
    public void setFieldGetDrive(OnGetDrive get_drive) {
        toFields().get_drive = toOnGetDrive(this, GET_DRIVE, get_drive);
        toFields().writeField(GET_DRIVE);
    }

    /**
     * 
     * <br>See {@link OnGetDrive#onGetDrive}
    */
    public JnaMountIface.OnGetDrive getFieldGetDrive() {
       toFields().readField(GET_DRIVE);
       return toFields().get_drive;
    } 

    /**
     * 
     * <br>See {@link OnCanUnmount#onCanUnmount}
    */
    public static final String CAN_UNMOUNT = "can_unmount";

    /**
     * 
     * <br>See {@link OnCanUnmount#onCanUnmount}
    */
    public void setFieldCanUnmount(OnCanUnmount can_unmount) {
        toFields().can_unmount = toOnCanUnmount(this, CAN_UNMOUNT, can_unmount);
        toFields().writeField(CAN_UNMOUNT);
    }

    /**
     * 
     * <br>See {@link OnCanUnmount#onCanUnmount}
    */
    public JnaMountIface.OnCanUnmount getFieldCanUnmount() {
       toFields().readField(CAN_UNMOUNT);
       return toFields().can_unmount;
    } 

    /**
     * 
     * <br>See {@link OnCanEject#onCanEject}
    */
    public static final String CAN_EJECT = "can_eject";

    /**
     * 
     * <br>See {@link OnCanEject#onCanEject}
    */
    public void setFieldCanEject(OnCanEject can_eject) {
        toFields().can_eject = toOnCanEject(this, CAN_EJECT, can_eject);
        toFields().writeField(CAN_EJECT);
    }

    /**
     * 
     * <br>See {@link OnCanEject#onCanEject}
    */
    public JnaMountIface.OnCanEject getFieldCanEject() {
       toFields().readField(CAN_EJECT);
       return toFields().can_eject;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String UNMOUNT = "unmount";

    /**
     * 
     * <br>See {@link OnUnmountFinish#onUnmountFinish}
    */
    public static final String UNMOUNT_FINISH = "unmount_finish";

    /**
     * 
     * <br>See {@link OnUnmountFinish#onUnmountFinish}
    */
    public void setFieldUnmountFinish(OnUnmountFinish unmount_finish) {
        toFields().unmount_finish = toOnUnmountFinish(this, UNMOUNT_FINISH, unmount_finish);
        toFields().writeField(UNMOUNT_FINISH);
    }

    /**
     * 
     * <br>See {@link OnUnmountFinish#onUnmountFinish}
    */
    public JnaMountIface.OnUnmountFinish getFieldUnmountFinish() {
       toFields().readField(UNMOUNT_FINISH);
       return toFields().unmount_finish;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String EJECT = "eject";

    /**
     * 
     * <br>See {@link OnEjectFinish#onEjectFinish}
    */
    public static final String EJECT_FINISH = "eject_finish";

    /**
     * 
     * <br>See {@link OnEjectFinish#onEjectFinish}
    */
    public void setFieldEjectFinish(OnEjectFinish eject_finish) {
        toFields().eject_finish = toOnEjectFinish(this, EJECT_FINISH, eject_finish);
        toFields().writeField(EJECT_FINISH);
    }

    /**
     * 
     * <br>See {@link OnEjectFinish#onEjectFinish}
    */
    public JnaMountIface.OnEjectFinish getFieldEjectFinish() {
       toFields().readField(EJECT_FINISH);
       return toFields().eject_finish;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String REMOUNT = "remount";

    /**
     * 
     * <br>See {@link OnRemountFinish#onRemountFinish}
    */
    public static final String REMOUNT_FINISH = "remount_finish";

    /**
     * 
     * <br>See {@link OnRemountFinish#onRemountFinish}
    */
    public void setFieldRemountFinish(OnRemountFinish remount_finish) {
        toFields().remount_finish = toOnRemountFinish(this, REMOUNT_FINISH, remount_finish);
        toFields().writeField(REMOUNT_FINISH);
    }

    /**
     * 
     * <br>See {@link OnRemountFinish#onRemountFinish}
    */
    public JnaMountIface.OnRemountFinish getFieldRemountFinish() {
       toFields().readField(REMOUNT_FINISH);
       return toFields().remount_finish;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String GUESS_CONTENT_TYPE = "guess_content_type";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Mount.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Mount.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:guess_content_type_finish:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:guess_content_type_sync:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:pre_unmount:previous-field-unsupported:[MethodModel:Supported:preUnmount:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]]

[MethodModel:Supported:preUnmount:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]

[FieldModel:unmount_with_operation:previous-field-unsupported:[MethodModel:Supported:unmountWithOperation:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:unmountWithOperation:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:unmount_with_operation_finish:previous-field-unsupported:[MethodModel:Supported:unmountWithOperationFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:unmountWithOperationFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:eject_with_operation:previous-field-unsupported:[MethodModel:Supported:ejectWithOperation:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:ejectWithOperation:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:eject_with_operation_finish:previous-field-unsupported:[MethodModel:Supported:ejectWithOperationFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:ejectWithOperationFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:get_default_location:previous-field-unsupported:[MethodModel:Supported:getDefaultLocation:[ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]]

[MethodModel:Supported:getDefaultLocation:[ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]

[FieldModel:get_sort_key:previous-field-unsupported:[MethodModel:Supported:getSortKey:[ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]]

[MethodModel:Supported:getSortKey:[ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]

[FieldModel:get_symbolic_icon:previous-field-unsupported:[MethodModel:Supported:getSymbolicIcon:[ParameterModel:Supported:{Gg:Icon:{c:GIcon*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]]

[MethodModel:Supported:getSymbolicIcon:[ParameterModel:Supported:{Gg:Icon:{c:GIcon*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]
*/
