/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Interface for creating &#35;GDrive implementations.
 * <p><a href="https://docs.gtk.org/gio/struct.DriveIface.html">https://docs.gtk.org/gio/struct.DriveIface.html</a></p>
*/
public class DriveIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DriveIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * 
         * @param drive 
        */
        void onChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnChanged toOnChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnChanged in) {
        JnaDriveIface.OnChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onChanged(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDisconnected {
        /**
         * 
         * @param drive 
        */
        void onDisconnected(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnDisconnected toOnDisconnected(ch.bailu.gtk.type.Pointer instance, String methodName, OnDisconnected in) {
        JnaDriveIface.OnDisconnected out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onDisconnected(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEjectButton {
        /**
         * 
         * @param drive 
        */
        void onEjectButton(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnEjectButton toOnEjectButton(ch.bailu.gtk.type.Pointer instance, String methodName, OnEjectButton in) {
        JnaDriveIface.OnEjectButton out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onEjectButton(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetName {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return a string containing &#64;drive's name. The returned     string should be freed when no longer needed.
        */
        ch.bailu.gtk.type.Str onGetName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnGetName toOnGetName(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetName in) {
        JnaDriveIface.OnGetName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onGetName(__callback, new Drive(new PointerContainer(_drive))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetIcon {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return &#35;GIcon for the &#64;drive.    Free the returned object with g_object_unref().
        */
        Icon onGetIcon(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnGetIcon toOnGetIcon(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetIcon in) {
        JnaDriveIface.OnGetIcon out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onGetIcon(__callback, new Drive(new PointerContainer(_drive))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHasVolumes {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return %TRUE if the &#64;drive contains volumes, %FALSE otherwise.
        */
        boolean onHasVolumes(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnHasVolumes toOnHasVolumes(ch.bailu.gtk.type.Pointer instance, String methodName, OnHasVolumes in) {
        JnaDriveIface.OnHasVolumes out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onHasVolumes(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetVolumes {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return &#35;GList containing any &#35;GVolume objects on the given &#64;drive.
        */
        ch.bailu.gtk.glib.List onGetVolumes(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnGetVolumes toOnGetVolumes(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetVolumes in) {
        JnaDriveIface.OnGetVolumes out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onGetVolumes(__callback, new Drive(new PointerContainer(_drive))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIsMediaRemovable {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return %TRUE if &#64;drive supports removable media, %FALSE otherwise.
        */
        boolean onIsMediaRemovable(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnIsMediaRemovable toOnIsMediaRemovable(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsMediaRemovable in) {
        JnaDriveIface.OnIsMediaRemovable out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onIsMediaRemovable(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHasMedia {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return %TRUE if &#64;drive has media, %FALSE otherwise.
        */
        boolean onHasMedia(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnHasMedia toOnHasMedia(ch.bailu.gtk.type.Pointer instance, String methodName, OnHasMedia in) {
        JnaDriveIface.OnHasMedia out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onHasMedia(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIsMediaCheckAutomatic {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return %TRUE if the &#64;drive is capable of automatically detecting     media changes, %FALSE otherwise.
        */
        boolean onIsMediaCheckAutomatic(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnIsMediaCheckAutomatic toOnIsMediaCheckAutomatic(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsMediaCheckAutomatic in) {
        JnaDriveIface.OnIsMediaCheckAutomatic out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onIsMediaCheckAutomatic(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCanEject {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return %TRUE if the &#64;drive can be ejected, %FALSE otherwise.
        */
        boolean onCanEject(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnCanEject toOnCanEject(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanEject in) {
        JnaDriveIface.OnCanEject out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onCanEject(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCanPollForMedia {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return %TRUE if the &#64;drive can be polled for media changes,     %FALSE otherwise.
        */
        boolean onCanPollForMedia(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnCanPollForMedia toOnCanPollForMedia(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanPollForMedia in) {
        JnaDriveIface.OnCanPollForMedia out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onCanPollForMedia(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEjectFinish {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @param result a &#35;GAsyncResult.
         * @return %TRUE if the drive has been ejected successfully,     %FALSE otherwise.
        */
        boolean onEjectFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive, @Nonnull AsyncResult result);
    }
    
    private static JnaDriveIface.OnEjectFinish toOnEjectFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnEjectFinish in) {
        JnaDriveIface.OnEjectFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive, _result, _error) -> in.onEjectFinish(__callback, new Drive(new PointerContainer(_drive)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPollForMediaFinish {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @param result a &#35;GAsyncResult.
         * @return %TRUE if the drive has been poll_for_mediaed successfully,     %FALSE otherwise.
        */
        boolean onPollForMediaFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive, @Nonnull AsyncResult result);
    }
    
    private static JnaDriveIface.OnPollForMediaFinish toOnPollForMediaFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnPollForMediaFinish in) {
        JnaDriveIface.OnPollForMediaFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive, _result, _error) -> in.onPollForMediaFinish(__callback, new Drive(new PointerContainer(_drive)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetIdentifier {
        /**
         * 
         * @param drive a &#35;GDrive
         * @param kind the kind of identifier to return
         * @return a newly allocated string containing the     requested identifier, or %NULL if the &#35;GDrive     doesn't have this kind of identifier.
        */
        ch.bailu.gtk.type.Str onGetIdentifier(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive, @Nonnull ch.bailu.gtk.type.Str kind);
    }
    
    private static JnaDriveIface.OnGetIdentifier toOnGetIdentifier(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetIdentifier in) {
        JnaDriveIface.OnGetIdentifier out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive, _kind) -> in.onGetIdentifier(__callback, new Drive(new PointerContainer(_drive)), new ch.bailu.gtk.type.Str(new PointerContainer(_kind))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEnumerateIdentifiers {
        /**
         * 
         * @param drive a &#35;GDrive
         * @return a %NULL-terminated     array of strings containing kinds of identifiers. Use g_strfreev()     to free.
        */
        ch.bailu.gtk.type.Strs onEnumerateIdentifiers(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnEnumerateIdentifiers toOnEnumerateIdentifiers(ch.bailu.gtk.type.Pointer instance, String methodName, OnEnumerateIdentifiers in) {
        JnaDriveIface.OnEnumerateIdentifiers out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onEnumerateIdentifiers(__callback, new Drive(new PointerContainer(_drive))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetStartStopType {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return A value from the &#35;GDriveStartStopType enumeration.
        */
        int onGetStartStopType(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnGetStartStopType toOnGetStartStopType(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetStartStopType in) {
        JnaDriveIface.OnGetStartStopType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onGetStartStopType(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCanStart {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return %TRUE if the &#64;drive can be started, %FALSE otherwise.
        */
        boolean onCanStart(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnCanStart toOnCanStart(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanStart in) {
        JnaDriveIface.OnCanStart out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onCanStart(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCanStartDegraded {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return %TRUE if the &#64;drive can be started degraded, %FALSE otherwise.
        */
        boolean onCanStartDegraded(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnCanStartDegraded toOnCanStartDegraded(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanStartDegraded in) {
        JnaDriveIface.OnCanStartDegraded out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onCanStartDegraded(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnStartFinish {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @param result a &#35;GAsyncResult.
         * @return %TRUE if the drive has been started successfully,     %FALSE otherwise.
        */
        boolean onStartFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive, @Nonnull AsyncResult result);
    }
    
    private static JnaDriveIface.OnStartFinish toOnStartFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnStartFinish in) {
        JnaDriveIface.OnStartFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive, _result, _error) -> in.onStartFinish(__callback, new Drive(new PointerContainer(_drive)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCanStop {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return %TRUE if the &#64;drive can be stopped, %FALSE otherwise.
        */
        boolean onCanStop(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnCanStop toOnCanStop(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanStop in) {
        JnaDriveIface.OnCanStop out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onCanStop(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnStopFinish {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @param result a &#35;GAsyncResult.
         * @return %TRUE if the drive has been stopped successfully,     %FALSE otherwise.
        */
        boolean onStopFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive, @Nonnull AsyncResult result);
    }
    
    private static JnaDriveIface.OnStopFinish toOnStopFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnStopFinish in) {
        JnaDriveIface.OnStopFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive, _result, _error) -> in.onStopFinish(__callback, new Drive(new PointerContainer(_drive)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnStopButton {
        /**
         * 
         * @param drive 
        */
        void onStopButton(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnStopButton toOnStopButton(ch.bailu.gtk.type.Pointer instance, String methodName, OnStopButton in) {
        JnaDriveIface.OnStopButton out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onStopButton(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEjectWithOperationFinish {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @param result a &#35;GAsyncResult.
         * @return %TRUE if the drive was successfully ejected. %FALSE otherwise.
        */
        boolean onEjectWithOperationFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive, @Nonnull AsyncResult result);
    }
    
    private static JnaDriveIface.OnEjectWithOperationFinish toOnEjectWithOperationFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnEjectWithOperationFinish in) {
        JnaDriveIface.OnEjectWithOperationFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive, _result, _error) -> in.onEjectWithOperationFinish(__callback, new Drive(new PointerContainer(_drive)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetSortKey {
        /**
         * 
         * @param drive A &#35;GDrive.
         * @return Sorting key for &#64;drive or %NULL if no such key is available.
        */
        ch.bailu.gtk.type.Str onGetSortKey(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnGetSortKey toOnGetSortKey(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetSortKey in) {
        JnaDriveIface.OnGetSortKey out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onGetSortKey(__callback, new Drive(new PointerContainer(_drive))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetSymbolicIcon {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return symbolic &#35;GIcon for the &#64;drive.    Free the returned object with g_object_unref().
        */
        Icon onGetSymbolicIcon(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnGetSymbolicIcon toOnGetSymbolicIcon(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetSymbolicIcon in) {
        JnaDriveIface.OnGetSymbolicIcon out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onGetSymbolicIcon(__callback, new Drive(new PointerContainer(_drive))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIsRemovable {
        /**
         * 
         * @param drive a &#35;GDrive.
         * @return %TRUE if &#64;drive and/or its media is considered removable, %FALSE otherwise.
        */
        boolean onIsRemovable(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Drive drive);
    }
    
    private static JnaDriveIface.OnIsRemovable toOnIsRemovable(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsRemovable in) {
        JnaDriveIface.OnIsRemovable out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_drive) -> in.onIsRemovable(__callback, new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    public DriveIface(PointerContainer pointer) {
        super(pointer);
    }

    public DriveIface() {
        super(cast(JnaDriveIface.allocateStructure()));
    }

    private JnaDriveIface.Fields _fields;
    
    JnaDriveIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDriveIface.Fields(asCPointer());
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
    public JnaDriveIface.OnChanged getFieldChanged() {
       toFields().readField(CHANGED);
       return toFields().changed;
    } 

    /**
     * 
     * <br>See {@link OnDisconnected#onDisconnected}
    */
    public static final String DISCONNECTED = "disconnected";

    /**
     * 
     * <br>See {@link OnDisconnected#onDisconnected}
    */
    public void setFieldDisconnected(OnDisconnected disconnected) {
        toFields().disconnected = toOnDisconnected(this, DISCONNECTED, disconnected);
        toFields().writeField(DISCONNECTED);
    }

    /**
     * 
     * <br>See {@link OnDisconnected#onDisconnected}
    */
    public JnaDriveIface.OnDisconnected getFieldDisconnected() {
       toFields().readField(DISCONNECTED);
       return toFields().disconnected;
    } 

    /**
     * 
     * <br>See {@link OnEjectButton#onEjectButton}
    */
    public static final String EJECT_BUTTON = "eject_button";

    /**
     * 
     * <br>See {@link OnEjectButton#onEjectButton}
    */
    public void setFieldEjectButton(OnEjectButton eject_button) {
        toFields().eject_button = toOnEjectButton(this, EJECT_BUTTON, eject_button);
        toFields().writeField(EJECT_BUTTON);
    }

    /**
     * 
     * <br>See {@link OnEjectButton#onEjectButton}
    */
    public JnaDriveIface.OnEjectButton getFieldEjectButton() {
       toFields().readField(EJECT_BUTTON);
       return toFields().eject_button;
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
    public JnaDriveIface.OnGetName getFieldGetName() {
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
    public JnaDriveIface.OnGetIcon getFieldGetIcon() {
       toFields().readField(GET_ICON);
       return toFields().get_icon;
    } 

    /**
     * 
     * <br>See {@link OnHasVolumes#onHasVolumes}
    */
    public static final String HAS_VOLUMES = "has_volumes";

    /**
     * 
     * <br>See {@link OnHasVolumes#onHasVolumes}
    */
    public void setFieldHasVolumes(OnHasVolumes has_volumes) {
        toFields().has_volumes = toOnHasVolumes(this, HAS_VOLUMES, has_volumes);
        toFields().writeField(HAS_VOLUMES);
    }

    /**
     * 
     * <br>See {@link OnHasVolumes#onHasVolumes}
    */
    public JnaDriveIface.OnHasVolumes getFieldHasVolumes() {
       toFields().readField(HAS_VOLUMES);
       return toFields().has_volumes;
    } 

    /**
     * 
     * <br>See {@link OnGetVolumes#onGetVolumes}
    */
    public static final String GET_VOLUMES = "get_volumes";

    /**
     * 
     * <br>See {@link OnGetVolumes#onGetVolumes}
    */
    public void setFieldGetVolumes(OnGetVolumes get_volumes) {
        toFields().get_volumes = toOnGetVolumes(this, GET_VOLUMES, get_volumes);
        toFields().writeField(GET_VOLUMES);
    }

    /**
     * 
     * <br>See {@link OnGetVolumes#onGetVolumes}
    */
    public JnaDriveIface.OnGetVolumes getFieldGetVolumes() {
       toFields().readField(GET_VOLUMES);
       return toFields().get_volumes;
    } 

    /**
     * 
     * <br>See {@link OnIsMediaRemovable#onIsMediaRemovable}
    */
    public static final String IS_MEDIA_REMOVABLE = "is_media_removable";

    /**
     * 
     * <br>See {@link OnIsMediaRemovable#onIsMediaRemovable}
    */
    public void setFieldIsMediaRemovable(OnIsMediaRemovable is_media_removable) {
        toFields().is_media_removable = toOnIsMediaRemovable(this, IS_MEDIA_REMOVABLE, is_media_removable);
        toFields().writeField(IS_MEDIA_REMOVABLE);
    }

    /**
     * 
     * <br>See {@link OnIsMediaRemovable#onIsMediaRemovable}
    */
    public JnaDriveIface.OnIsMediaRemovable getFieldIsMediaRemovable() {
       toFields().readField(IS_MEDIA_REMOVABLE);
       return toFields().is_media_removable;
    } 

    /**
     * 
     * <br>See {@link OnHasMedia#onHasMedia}
    */
    public static final String HAS_MEDIA = "has_media";

    /**
     * 
     * <br>See {@link OnHasMedia#onHasMedia}
    */
    public void setFieldHasMedia(OnHasMedia has_media) {
        toFields().has_media = toOnHasMedia(this, HAS_MEDIA, has_media);
        toFields().writeField(HAS_MEDIA);
    }

    /**
     * 
     * <br>See {@link OnHasMedia#onHasMedia}
    */
    public JnaDriveIface.OnHasMedia getFieldHasMedia() {
       toFields().readField(HAS_MEDIA);
       return toFields().has_media;
    } 

    /**
     * 
     * <br>See {@link OnIsMediaCheckAutomatic#onIsMediaCheckAutomatic}
    */
    public static final String IS_MEDIA_CHECK_AUTOMATIC = "is_media_check_automatic";

    /**
     * 
     * <br>See {@link OnIsMediaCheckAutomatic#onIsMediaCheckAutomatic}
    */
    public void setFieldIsMediaCheckAutomatic(OnIsMediaCheckAutomatic is_media_check_automatic) {
        toFields().is_media_check_automatic = toOnIsMediaCheckAutomatic(this, IS_MEDIA_CHECK_AUTOMATIC, is_media_check_automatic);
        toFields().writeField(IS_MEDIA_CHECK_AUTOMATIC);
    }

    /**
     * 
     * <br>See {@link OnIsMediaCheckAutomatic#onIsMediaCheckAutomatic}
    */
    public JnaDriveIface.OnIsMediaCheckAutomatic getFieldIsMediaCheckAutomatic() {
       toFields().readField(IS_MEDIA_CHECK_AUTOMATIC);
       return toFields().is_media_check_automatic;
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
    public JnaDriveIface.OnCanEject getFieldCanEject() {
       toFields().readField(CAN_EJECT);
       return toFields().can_eject;
    } 

    /**
     * 
     * <br>See {@link OnCanPollForMedia#onCanPollForMedia}
    */
    public static final String CAN_POLL_FOR_MEDIA = "can_poll_for_media";

    /**
     * 
     * <br>See {@link OnCanPollForMedia#onCanPollForMedia}
    */
    public void setFieldCanPollForMedia(OnCanPollForMedia can_poll_for_media) {
        toFields().can_poll_for_media = toOnCanPollForMedia(this, CAN_POLL_FOR_MEDIA, can_poll_for_media);
        toFields().writeField(CAN_POLL_FOR_MEDIA);
    }

    /**
     * 
     * <br>See {@link OnCanPollForMedia#onCanPollForMedia}
    */
    public JnaDriveIface.OnCanPollForMedia getFieldCanPollForMedia() {
       toFields().readField(CAN_POLL_FOR_MEDIA);
       return toFields().can_poll_for_media;
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
    public JnaDriveIface.OnEjectFinish getFieldEjectFinish() {
       toFields().readField(EJECT_FINISH);
       return toFields().eject_finish;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String POLL_FOR_MEDIA = "poll_for_media";

    /**
     * 
     * <br>See {@link OnPollForMediaFinish#onPollForMediaFinish}
    */
    public static final String POLL_FOR_MEDIA_FINISH = "poll_for_media_finish";

    /**
     * 
     * <br>See {@link OnPollForMediaFinish#onPollForMediaFinish}
    */
    public void setFieldPollForMediaFinish(OnPollForMediaFinish poll_for_media_finish) {
        toFields().poll_for_media_finish = toOnPollForMediaFinish(this, POLL_FOR_MEDIA_FINISH, poll_for_media_finish);
        toFields().writeField(POLL_FOR_MEDIA_FINISH);
    }

    /**
     * 
     * <br>See {@link OnPollForMediaFinish#onPollForMediaFinish}
    */
    public JnaDriveIface.OnPollForMediaFinish getFieldPollForMediaFinish() {
       toFields().readField(POLL_FOR_MEDIA_FINISH);
       return toFields().poll_for_media_finish;
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
    public JnaDriveIface.OnGetIdentifier getFieldGetIdentifier() {
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
    public JnaDriveIface.OnEnumerateIdentifiers getFieldEnumerateIdentifiers() {
       toFields().readField(ENUMERATE_IDENTIFIERS);
       return toFields().enumerate_identifiers;
    } 

    /**
     * 
     * <br>See {@link OnGetStartStopType#onGetStartStopType}
    */
    public static final String GET_START_STOP_TYPE = "get_start_stop_type";

    /**
     * 
     * <br>See {@link OnGetStartStopType#onGetStartStopType}
    */
    public void setFieldGetStartStopType(OnGetStartStopType get_start_stop_type) {
        toFields().get_start_stop_type = toOnGetStartStopType(this, GET_START_STOP_TYPE, get_start_stop_type);
        toFields().writeField(GET_START_STOP_TYPE);
    }

    /**
     * 
     * <br>See {@link OnGetStartStopType#onGetStartStopType}
    */
    public JnaDriveIface.OnGetStartStopType getFieldGetStartStopType() {
       toFields().readField(GET_START_STOP_TYPE);
       return toFields().get_start_stop_type;
    } 

    /**
     * 
     * <br>See {@link OnCanStart#onCanStart}
    */
    public static final String CAN_START = "can_start";

    /**
     * 
     * <br>See {@link OnCanStart#onCanStart}
    */
    public void setFieldCanStart(OnCanStart can_start) {
        toFields().can_start = toOnCanStart(this, CAN_START, can_start);
        toFields().writeField(CAN_START);
    }

    /**
     * 
     * <br>See {@link OnCanStart#onCanStart}
    */
    public JnaDriveIface.OnCanStart getFieldCanStart() {
       toFields().readField(CAN_START);
       return toFields().can_start;
    } 

    /**
     * 
     * <br>See {@link OnCanStartDegraded#onCanStartDegraded}
    */
    public static final String CAN_START_DEGRADED = "can_start_degraded";

    /**
     * 
     * <br>See {@link OnCanStartDegraded#onCanStartDegraded}
    */
    public void setFieldCanStartDegraded(OnCanStartDegraded can_start_degraded) {
        toFields().can_start_degraded = toOnCanStartDegraded(this, CAN_START_DEGRADED, can_start_degraded);
        toFields().writeField(CAN_START_DEGRADED);
    }

    /**
     * 
     * <br>See {@link OnCanStartDegraded#onCanStartDegraded}
    */
    public JnaDriveIface.OnCanStartDegraded getFieldCanStartDegraded() {
       toFields().readField(CAN_START_DEGRADED);
       return toFields().can_start_degraded;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String START = "start";

    /**
     * 
     * <br>See {@link OnStartFinish#onStartFinish}
    */
    public static final String START_FINISH = "start_finish";

    /**
     * 
     * <br>See {@link OnStartFinish#onStartFinish}
    */
    public void setFieldStartFinish(OnStartFinish start_finish) {
        toFields().start_finish = toOnStartFinish(this, START_FINISH, start_finish);
        toFields().writeField(START_FINISH);
    }

    /**
     * 
     * <br>See {@link OnStartFinish#onStartFinish}
    */
    public JnaDriveIface.OnStartFinish getFieldStartFinish() {
       toFields().readField(START_FINISH);
       return toFields().start_finish;
    } 

    /**
     * 
     * <br>See {@link OnCanStop#onCanStop}
    */
    public static final String CAN_STOP = "can_stop";

    /**
     * 
     * <br>See {@link OnCanStop#onCanStop}
    */
    public void setFieldCanStop(OnCanStop can_stop) {
        toFields().can_stop = toOnCanStop(this, CAN_STOP, can_stop);
        toFields().writeField(CAN_STOP);
    }

    /**
     * 
     * <br>See {@link OnCanStop#onCanStop}
    */
    public JnaDriveIface.OnCanStop getFieldCanStop() {
       toFields().readField(CAN_STOP);
       return toFields().can_stop;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String STOP = "stop";

    /**
     * 
     * <br>See {@link OnStopFinish#onStopFinish}
    */
    public static final String STOP_FINISH = "stop_finish";

    /**
     * 
     * <br>See {@link OnStopFinish#onStopFinish}
    */
    public void setFieldStopFinish(OnStopFinish stop_finish) {
        toFields().stop_finish = toOnStopFinish(this, STOP_FINISH, stop_finish);
        toFields().writeField(STOP_FINISH);
    }

    /**
     * 
     * <br>See {@link OnStopFinish#onStopFinish}
    */
    public JnaDriveIface.OnStopFinish getFieldStopFinish() {
       toFields().readField(STOP_FINISH);
       return toFields().stop_finish;
    } 

    /**
     * 
     * <br>See {@link OnStopButton#onStopButton}
    */
    public static final String STOP_BUTTON = "stop_button";

    /**
     * 
     * <br>See {@link OnStopButton#onStopButton}
    */
    public void setFieldStopButton(OnStopButton stop_button) {
        toFields().stop_button = toOnStopButton(this, STOP_BUTTON, stop_button);
        toFields().writeField(STOP_BUTTON);
    }

    /**
     * 
     * <br>See {@link OnStopButton#onStopButton}
    */
    public JnaDriveIface.OnStopButton getFieldStopButton() {
       toFields().readField(STOP_BUTTON);
       return toFields().stop_button;
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
    public JnaDriveIface.OnEjectWithOperationFinish getFieldEjectWithOperationFinish() {
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
    public JnaDriveIface.OnGetSortKey getFieldGetSortKey() {
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
    public JnaDriveIface.OnGetSymbolicIcon getFieldGetSymbolicIcon() {
       toFields().readField(GET_SYMBOLIC_ICON);
       return toFields().get_symbolic_icon;
    } 

    /**
     * 
     * <br>See {@link OnIsRemovable#onIsRemovable}
    */
    public static final String IS_REMOVABLE = "is_removable";

    /**
     * 
     * <br>See {@link OnIsRemovable#onIsRemovable}
    */
    public void setFieldIsRemovable(OnIsRemovable is_removable) {
        toFields().is_removable = toOnIsRemovable(this, IS_REMOVABLE, is_removable);
        toFields().writeField(IS_REMOVABLE);
    }

    /**
     * 
     * <br>See {@link OnIsRemovable#onIsRemovable}
    */
    public JnaDriveIface.OnIsRemovable getFieldIsRemovable() {
       toFields().readField(IS_REMOVABLE);
       return toFields().is_removable;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Drive.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Drive.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
