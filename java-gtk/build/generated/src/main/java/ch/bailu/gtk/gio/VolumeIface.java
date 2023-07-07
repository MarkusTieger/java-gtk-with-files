/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Interface for implementing operations for mountable volumes.
 * <p><a href="https://docs.gtk.org/gio/struct.VolumeIface.html">https://docs.gtk.org/gio/struct.VolumeIface.html</a></p>
*/
public class VolumeIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(VolumeIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * 
         * @param volume 
        */
        void onChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnChanged toOnChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnChanged in) {
        JnaVolumeIface.OnChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onChanged(__callback, new Volume(new PointerContainer(_volume)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRemoved {
        /**
         * 
         * @param volume 
        */
        void onRemoved(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnRemoved toOnRemoved(ch.bailu.gtk.type.Pointer instance, String methodName, OnRemoved in) {
        JnaVolumeIface.OnRemoved out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onRemoved(__callback, new Volume(new PointerContainer(_volume)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetName {
        /**
         * 
         * @param volume a &#35;GVolume
         * @return the name for the given &#64;volume. The returned string should     be freed with g_free() when no longer needed.
        */
        ch.bailu.gtk.type.Str onGetName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnGetName toOnGetName(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetName in) {
        JnaVolumeIface.OnGetName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onGetName(__callback, new Volume(new PointerContainer(_volume))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetIcon {
        /**
         * 
         * @param volume a &#35;GVolume
         * @return a &#35;GIcon.     The returned object should be unreffed with g_object_unref()     when no longer needed.
        */
        Icon onGetIcon(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnGetIcon toOnGetIcon(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetIcon in) {
        JnaVolumeIface.OnGetIcon out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onGetIcon(__callback, new Volume(new PointerContainer(_volume))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetUuid {
        /**
         * 
         * @param volume a &#35;GVolume
         * @return the UUID for &#64;volume or %NULL if no UUID     can be computed.     The returned string should be freed with g_free()     when no longer needed.
        */
        ch.bailu.gtk.type.Str onGetUuid(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnGetUuid toOnGetUuid(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetUuid in) {
        JnaVolumeIface.OnGetUuid out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onGetUuid(__callback, new Volume(new PointerContainer(_volume))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetDrive {
        /**
         * 
         * @param volume a &#35;GVolume
         * @return a &#35;GDrive or %NULL if &#64;volume is not     associated with a drive. The returned object should be unreffed     with g_object_unref() when no longer needed.
        */
        Drive onGetDrive(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnGetDrive toOnGetDrive(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDrive in) {
        JnaVolumeIface.OnGetDrive out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onGetDrive(__callback, new Volume(new PointerContainer(_volume))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetMount {
        /**
         * 
         * @param volume a &#35;GVolume
         * @return a &#35;GMount or %NULL if &#64;volume isn't mounted.     The returned object should be unreffed with g_object_unref()     when no longer needed.
        */
        Mount onGetMount(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnGetMount toOnGetMount(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetMount in) {
        JnaVolumeIface.OnGetMount out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onGetMount(__callback, new Volume(new PointerContainer(_volume))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCanMount {
        /**
         * 
         * @param volume a &#35;GVolume
         * @return %TRUE if the &#64;volume can be mounted. %FALSE otherwise
        */
        boolean onCanMount(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnCanMount toOnCanMount(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanMount in) {
        JnaVolumeIface.OnCanMount out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onCanMount(__callback, new Volume(new PointerContainer(_volume)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCanEject {
        /**
         * 
         * @param volume a &#35;GVolume
         * @return %TRUE if the &#64;volume can be ejected. %FALSE otherwise
        */
        boolean onCanEject(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnCanEject toOnCanEject(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanEject in) {
        JnaVolumeIface.OnCanEject out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onCanEject(__callback, new Volume(new PointerContainer(_volume)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMountFinish {
        /**
         * 
         * @param volume a &#35;GVolume
         * @param result a &#35;GAsyncResult
         * @return %TRUE, %FALSE if operation failed
        */
        boolean onMountFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume, @Nonnull AsyncResult result);
    }
    
    private static JnaVolumeIface.OnMountFinish toOnMountFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnMountFinish in) {
        JnaVolumeIface.OnMountFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume, _result, _error) -> in.onMountFinish(__callback, new Volume(new PointerContainer(_volume)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEjectFinish {
        /**
         * 
         * @param volume pointer to a &#35;GVolume
         * @param result a &#35;GAsyncResult
         * @return %TRUE, %FALSE if operation failed
        */
        boolean onEjectFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume, @Nonnull AsyncResult result);
    }
    
    private static JnaVolumeIface.OnEjectFinish toOnEjectFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnEjectFinish in) {
        JnaVolumeIface.OnEjectFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume, _result, _error) -> in.onEjectFinish(__callback, new Volume(new PointerContainer(_volume)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetIdentifier {
        /**
         * 
         * @param volume a &#35;GVolume
         * @param kind the kind of identifier to return
         * @return a newly allocated string containing the     requested identifier, or %NULL if the &#35;GVolume     doesn't have this kind of identifier
        */
        ch.bailu.gtk.type.Str onGetIdentifier(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume, @Nonnull ch.bailu.gtk.type.Str kind);
    }
    
    private static JnaVolumeIface.OnGetIdentifier toOnGetIdentifier(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetIdentifier in) {
        JnaVolumeIface.OnGetIdentifier out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume, _kind) -> in.onGetIdentifier(__callback, new Volume(new PointerContainer(_volume)), new ch.bailu.gtk.type.Str(new PointerContainer(_kind))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEnumerateIdentifiers {
        /**
         * 
         * @param volume a &#35;GVolume
         * @return a %NULL-terminated array   of strings containing kinds of identifiers. Use g_strfreev() to free.
        */
        ch.bailu.gtk.type.Strs onEnumerateIdentifiers(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnEnumerateIdentifiers toOnEnumerateIdentifiers(ch.bailu.gtk.type.Pointer instance, String methodName, OnEnumerateIdentifiers in) {
        JnaVolumeIface.OnEnumerateIdentifiers out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onEnumerateIdentifiers(__callback, new Volume(new PointerContainer(_volume))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnShouldAutomount {
        /**
         * 
         * @param volume a &#35;GVolume
         * @return %TRUE if the volume should be automatically mounted
        */
        boolean onShouldAutomount(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnShouldAutomount toOnShouldAutomount(ch.bailu.gtk.type.Pointer instance, String methodName, OnShouldAutomount in) {
        JnaVolumeIface.OnShouldAutomount out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onShouldAutomount(__callback, new Volume(new PointerContainer(_volume)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetActivationRoot {
        /**
         * 
         * @param volume a &#35;GVolume
         * @return the activation root of &#64;volume     or %NULL. Use g_object_unref() to free.
        */
        File onGetActivationRoot(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnGetActivationRoot toOnGetActivationRoot(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetActivationRoot in) {
        JnaVolumeIface.OnGetActivationRoot out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onGetActivationRoot(__callback, new Volume(new PointerContainer(_volume))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEjectWithOperationFinish {
        /**
         * 
         * @param volume a &#35;GVolume
         * @param result a &#35;GAsyncResult
         * @return %TRUE if the volume was successfully ejected. %FALSE otherwise
        */
        boolean onEjectWithOperationFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume, @Nonnull AsyncResult result);
    }
    
    private static JnaVolumeIface.OnEjectWithOperationFinish toOnEjectWithOperationFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnEjectWithOperationFinish in) {
        JnaVolumeIface.OnEjectWithOperationFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume, _result, _error) -> in.onEjectWithOperationFinish(__callback, new Volume(new PointerContainer(_volume)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetSortKey {
        /**
         * 
         * @param volume a &#35;GVolume
         * @return Sorting key for &#64;volume or %NULL if no such key is available
        */
        ch.bailu.gtk.type.Str onGetSortKey(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnGetSortKey toOnGetSortKey(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetSortKey in) {
        JnaVolumeIface.OnGetSortKey out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onGetSortKey(__callback, new Volume(new PointerContainer(_volume))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetSymbolicIcon {
        /**
         * 
         * @param volume a &#35;GVolume
         * @return a &#35;GIcon.     The returned object should be unreffed with g_object_unref()     when no longer needed.
        */
        Icon onGetSymbolicIcon(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Volume volume);
    }
    
    private static JnaVolumeIface.OnGetSymbolicIcon toOnGetSymbolicIcon(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetSymbolicIcon in) {
        JnaVolumeIface.OnGetSymbolicIcon out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume) -> in.onGetSymbolicIcon(__callback, new Volume(new PointerContainer(_volume))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public VolumeIface(PointerContainer pointer) {
        super(pointer);
    }

    public VolumeIface() {
        super(cast(JnaVolumeIface.allocateStructure()));
    }

    private JnaVolumeIface.Fields _fields;
    
    JnaVolumeIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaVolumeIface.Fields(asCPointer());
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
    public JnaVolumeIface.OnChanged getFieldChanged() {
       toFields().readField(CHANGED);
       return toFields().changed;
    } 

    /**
     * 
     * <br>See {@link OnRemoved#onRemoved}
    */
    public static final String REMOVED = "removed";

    /**
     * 
     * <br>See {@link OnRemoved#onRemoved}
    */
    public void setFieldRemoved(OnRemoved removed) {
        toFields().removed = toOnRemoved(this, REMOVED, removed);
        toFields().writeField(REMOVED);
    }

    /**
     * 
     * <br>See {@link OnRemoved#onRemoved}
    */
    public JnaVolumeIface.OnRemoved getFieldRemoved() {
       toFields().readField(REMOVED);
       return toFields().removed;
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
    public JnaVolumeIface.OnGetName getFieldGetName() {
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
    public JnaVolumeIface.OnGetIcon getFieldGetIcon() {
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
    public JnaVolumeIface.OnGetUuid getFieldGetUuid() {
       toFields().readField(GET_UUID);
       return toFields().get_uuid;
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
    public JnaVolumeIface.OnGetDrive getFieldGetDrive() {
       toFields().readField(GET_DRIVE);
       return toFields().get_drive;
    } 

    /**
     * 
     * <br>See {@link OnGetMount#onGetMount}
    */
    public static final String GET_MOUNT = "get_mount";

    /**
     * 
     * <br>See {@link OnGetMount#onGetMount}
    */
    public void setFieldGetMount(OnGetMount get_mount) {
        toFields().get_mount = toOnGetMount(this, GET_MOUNT, get_mount);
        toFields().writeField(GET_MOUNT);
    }

    /**
     * 
     * <br>See {@link OnGetMount#onGetMount}
    */
    public JnaVolumeIface.OnGetMount getFieldGetMount() {
       toFields().readField(GET_MOUNT);
       return toFields().get_mount;
    } 

    /**
     * 
     * <br>See {@link OnCanMount#onCanMount}
    */
    public static final String CAN_MOUNT = "can_mount";

    /**
     * 
     * <br>See {@link OnCanMount#onCanMount}
    */
    public void setFieldCanMount(OnCanMount can_mount) {
        toFields().can_mount = toOnCanMount(this, CAN_MOUNT, can_mount);
        toFields().writeField(CAN_MOUNT);
    }

    /**
     * 
     * <br>See {@link OnCanMount#onCanMount}
    */
    public JnaVolumeIface.OnCanMount getFieldCanMount() {
       toFields().readField(CAN_MOUNT);
       return toFields().can_mount;
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
    public JnaVolumeIface.OnCanEject getFieldCanEject() {
       toFields().readField(CAN_EJECT);
       return toFields().can_eject;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String MOUNT_FN = "mount_fn";

    /**
     * 
     * <br>See {@link OnMountFinish#onMountFinish}
    */
    public static final String MOUNT_FINISH = "mount_finish";

    /**
     * 
     * <br>See {@link OnMountFinish#onMountFinish}
    */
    public void setFieldMountFinish(OnMountFinish mount_finish) {
        toFields().mount_finish = toOnMountFinish(this, MOUNT_FINISH, mount_finish);
        toFields().writeField(MOUNT_FINISH);
    }

    /**
     * 
     * <br>See {@link OnMountFinish#onMountFinish}
    */
    public JnaVolumeIface.OnMountFinish getFieldMountFinish() {
       toFields().readField(MOUNT_FINISH);
       return toFields().mount_finish;
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
    public JnaVolumeIface.OnEjectFinish getFieldEjectFinish() {
       toFields().readField(EJECT_FINISH);
       return toFields().eject_finish;
    } 

    /**
     * 
     * <br>See {@link OnGetIdentifier#onGetIdentifier}
    */
    public static final String GET_IDENTIFIER = "get_identifier";

    /**
     * 
     * <br>See {@link OnGetIdentifier#onGetIdentifier}
    */
    public void setFieldGetIdentifier(OnGetIdentifier get_identifier) {
        toFields().get_identifier = toOnGetIdentifier(this, GET_IDENTIFIER, get_identifier);
        toFields().writeField(GET_IDENTIFIER);
    }

    /**
     * 
     * <br>See {@link OnGetIdentifier#onGetIdentifier}
    */
    public JnaVolumeIface.OnGetIdentifier getFieldGetIdentifier() {
       toFields().readField(GET_IDENTIFIER);
       return toFields().get_identifier;
    } 

    /**
     * 
     * <br>See {@link OnEnumerateIdentifiers#onEnumerateIdentifiers}
    */
    public static final String ENUMERATE_IDENTIFIERS = "enumerate_identifiers";

    /**
     * 
     * <br>See {@link OnEnumerateIdentifiers#onEnumerateIdentifiers}
    */
    public void setFieldEnumerateIdentifiers(OnEnumerateIdentifiers enumerate_identifiers) {
        toFields().enumerate_identifiers = toOnEnumerateIdentifiers(this, ENUMERATE_IDENTIFIERS, enumerate_identifiers);
        toFields().writeField(ENUMERATE_IDENTIFIERS);
    }

    /**
     * 
     * <br>See {@link OnEnumerateIdentifiers#onEnumerateIdentifiers}
    */
    public JnaVolumeIface.OnEnumerateIdentifiers getFieldEnumerateIdentifiers() {
       toFields().readField(ENUMERATE_IDENTIFIERS);
       return toFields().enumerate_identifiers;
    } 

    /**
     * 
     * <br>See {@link OnShouldAutomount#onShouldAutomount}
    */
    public static final String SHOULD_AUTOMOUNT = "should_automount";

    /**
     * 
     * <br>See {@link OnShouldAutomount#onShouldAutomount}
    */
    public void setFieldShouldAutomount(OnShouldAutomount should_automount) {
        toFields().should_automount = toOnShouldAutomount(this, SHOULD_AUTOMOUNT, should_automount);
        toFields().writeField(SHOULD_AUTOMOUNT);
    }

    /**
     * 
     * <br>See {@link OnShouldAutomount#onShouldAutomount}
    */
    public JnaVolumeIface.OnShouldAutomount getFieldShouldAutomount() {
       toFields().readField(SHOULD_AUTOMOUNT);
       return toFields().should_automount;
    } 

    /**
     * 
     * <br>See {@link OnGetActivationRoot#onGetActivationRoot}
    */
    public static final String GET_ACTIVATION_ROOT = "get_activation_root";

    /**
     * 
     * <br>See {@link OnGetActivationRoot#onGetActivationRoot}
    */
    public void setFieldGetActivationRoot(OnGetActivationRoot get_activation_root) {
        toFields().get_activation_root = toOnGetActivationRoot(this, GET_ACTIVATION_ROOT, get_activation_root);
        toFields().writeField(GET_ACTIVATION_ROOT);
    }

    /**
     * 
     * <br>See {@link OnGetActivationRoot#onGetActivationRoot}
    */
    public JnaVolumeIface.OnGetActivationRoot getFieldGetActivationRoot() {
       toFields().readField(GET_ACTIVATION_ROOT);
       return toFields().get_activation_root;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String EJECT_WITH_OPERATION = "eject_with_operation";

    /**
     * 
     * <br>See {@link OnEjectWithOperationFinish#onEjectWithOperationFinish}
    */
    public static final String EJECT_WITH_OPERATION_FINISH = "eject_with_operation_finish";

    /**
     * 
     * <br>See {@link OnEjectWithOperationFinish#onEjectWithOperationFinish}
    */
    public void setFieldEjectWithOperationFinish(OnEjectWithOperationFinish eject_with_operation_finish) {
        toFields().eject_with_operation_finish = toOnEjectWithOperationFinish(this, EJECT_WITH_OPERATION_FINISH, eject_with_operation_finish);
        toFields().writeField(EJECT_WITH_OPERATION_FINISH);
    }

    /**
     * 
     * <br>See {@link OnEjectWithOperationFinish#onEjectWithOperationFinish}
    */
    public JnaVolumeIface.OnEjectWithOperationFinish getFieldEjectWithOperationFinish() {
       toFields().readField(EJECT_WITH_OPERATION_FINISH);
       return toFields().eject_with_operation_finish;
    } 

    /**
     * 
     * <br>See {@link OnGetSortKey#onGetSortKey}
    */
    public static final String GET_SORT_KEY = "get_sort_key";

    /**
     * 
     * <br>See {@link OnGetSortKey#onGetSortKey}
    */
    public void setFieldGetSortKey(OnGetSortKey get_sort_key) {
        toFields().get_sort_key = toOnGetSortKey(this, GET_SORT_KEY, get_sort_key);
        toFields().writeField(GET_SORT_KEY);
    }

    /**
     * 
     * <br>See {@link OnGetSortKey#onGetSortKey}
    */
    public JnaVolumeIface.OnGetSortKey getFieldGetSortKey() {
       toFields().readField(GET_SORT_KEY);
       return toFields().get_sort_key;
    } 

    /**
     * 
     * <br>See {@link OnGetSymbolicIcon#onGetSymbolicIcon}
    */
    public static final String GET_SYMBOLIC_ICON = "get_symbolic_icon";

    /**
     * 
     * <br>See {@link OnGetSymbolicIcon#onGetSymbolicIcon}
    */
    public void setFieldGetSymbolicIcon(OnGetSymbolicIcon get_symbolic_icon) {
        toFields().get_symbolic_icon = toOnGetSymbolicIcon(this, GET_SYMBOLIC_ICON, get_symbolic_icon);
        toFields().writeField(GET_SYMBOLIC_ICON);
    }

    /**
     * 
     * <br>See {@link OnGetSymbolicIcon#onGetSymbolicIcon}
    */
    public JnaVolumeIface.OnGetSymbolicIcon getFieldGetSymbolicIcon() {
       toFields().readField(GET_SYMBOLIC_ICON);
       return toFields().get_symbolic_icon;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Volume.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Volume.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
