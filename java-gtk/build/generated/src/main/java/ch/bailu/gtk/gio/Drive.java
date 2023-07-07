/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDrive - this represent a piece of hardware connected to the machine.
 * <br>It's generally only created for removable hardware or hardware with
 * <br>removable media.
 * <br>
 * <br>&#35;GDrive is a container class for &#35;GVolume objects that stem from
 * <br>the same piece of media. As such, &#35;GDrive abstracts a drive with
 * <br>(or without) removable media and provides operations for querying
 * <br>whether media is available, determining whether media change is
 * <br>automatically detected and ejecting the media.
 * <br>
 * <br>If the &#35;GDrive reports that media isn't automatically detected, one
 * <br>can poll for media; typically one should not do this periodically
 * <br>as a poll for media operation is potentially expensive and may
 * <br>spin up the drive creating noise.
 * <br>
 * <br>&#35;GDrive supports starting and stopping drives with authentication
 * <br>support for the former. This can be used to support a diverse set
 * <br>of use cases including connecting/disconnecting iSCSI devices,
 * <br>powering down external disk enclosures and starting/stopping
 * <br>multi-disk devices such as RAID devices. Note that the actual
 * <br>semantics and side-effects of starting/stopping a &#35;GDrive may vary
 * <br>according to implementation. To choose the correct verbs in e.g. a
 * <br>file manager, use g_drive_get_start_stop_type().
 * <br>
 * <br>For porting from GnomeVFS note that there is no equivalent of
 * <br>&#35;GDrive in that API.
 * <p><a href="https://docs.gtk.org/gio/iface.Drive.html">https://docs.gtk.org/gio/iface.Drive.html</a></p>
*/
public class Drive extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Drive.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAsyncReadyCallback {
        /**
         * Type definition for a function that will be called back when an asynchronous
         * <br>operation within GIO has been completed. &#35;GAsyncReadyCallback
         * <br>callbacks from &#35;GTask are guaranteed to be invoked in a later
         * <br>iteration of the
         * <br>[thread-default main context][g-main-context-push-thread-default]
         * <br>where the &#35;GTask was created. All other users of
         * <br>&#35;GAsyncReadyCallback must likewise call it asynchronously in a
         * <br>later iteration of the main context.
         * <br>
         * <br>The asynchronous operation is guaranteed to have held a reference to
         * <br>&#64;source_object from the time when the `*_async()` function was called, until
         * <br>after this callback returns.
         * @param source_object the object the asynchronous operation was started with.
         * @param res a &#35;GAsyncResult.
         * @param user_data user data passed to the callback.
        */
        void onAsyncReadyCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.gobject.Object source_object, @Nonnull AsyncResult res, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaDrive.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaDrive.OnAsyncReadyCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_source_object, _res, _user_data) -> in.onAsyncReadyCallback(__callback, new ch.bailu.gtk.gobject.Object(new PointerContainer(_source_object)), new AsyncResult(new PointerContainer(_res)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted when the drive's state has changed.
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaDrive.OnChanged) (__self, __data) -> in.onChanged();
    }

    @FunctionalInterface
    public interface OnDisconnected {
        /**
         * This signal is emitted when the &#35;GDrive have been
         * <br>disconnected. If the recipient is holding references to the
         * <br>object they should release them so the object can be
         * <br>finalized.
        */
        void onDisconnected();
    }
    
    private static com.sun.jna.Callback toOnDisconnected(OnDisconnected in) {
        return (in == null) ? null: (JnaDrive.OnDisconnected) (__self, __data) -> in.onDisconnected();
    }

    @FunctionalInterface
    public interface OnEjectButton {
        /**
         * Emitted when the physical eject button (if any) of a drive has
         * <br>been pressed.
        */
        void onEjectButton();
    }
    
    private static com.sun.jna.Callback toOnEjectButton(OnEjectButton in) {
        return (in == null) ? null: (JnaDrive.OnEjectButton) (__self, __data) -> in.onEjectButton();
    }

    @FunctionalInterface
    public interface OnStopButton {
        /**
         * Emitted when the physical stop button (if any) of a drive has
         * <br>been pressed.
        */
        void onStopButton();
    }
    
    private static com.sun.jna.Callback toOnStopButton(OnStopButton in) {
        return (in == null) ? null: (JnaDrive.OnStopButton) (__self, __data) -> in.onStopButton();
    }

    public Drive(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Checks if a drive can be ejected.
     * @return %TRUE if the &#64;drive can be ejected, %FALSE otherwise.
    */
    public boolean canEject()  {
        return JnaDrive.INST().g_drive_can_eject(asCPointer());
    }

    /**
     * Checks if a drive can be polled for media changes.
     * @return %TRUE if the &#64;drive can be polled for media changes,     %FALSE otherwise.
    */
    public boolean canPollForMedia()  {
        return JnaDrive.INST().g_drive_can_poll_for_media(asCPointer());
    }

    /**
     * Checks if a drive can be started.
     * @return %TRUE if the &#64;drive can be started, %FALSE otherwise.
    */
    public boolean canStart()  {
        return JnaDrive.INST().g_drive_can_start(asCPointer());
    }

    /**
     * Checks if a drive can be started degraded.
     * @return %TRUE if the &#64;drive can be started degraded, %FALSE otherwise.
    */
    public boolean canStartDegraded()  {
        return JnaDrive.INST().g_drive_can_start_degraded(asCPointer());
    }

    /**
     * Checks if a drive can be stopped.
     * @return %TRUE if the &#64;drive can be stopped, %FALSE otherwise.
    */
    public boolean canStop()  {
        return JnaDrive.INST().g_drive_can_stop(asCPointer());
    }

    /**
     * Ejects a drive. This is an asynchronous operation, and is
     * <br>finished by calling g_drive_eject_with_operation_finish() with the &#64;drive
     * <br>and &#35;GAsyncResult data returned in the &#64;callback.
     * @param flags flags affecting the unmount if required for eject
     * @param mount_operation a &#35;GMountOperation or %NULL to avoid     user interaction.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback, or %NULL.
     * @param user_data user data passed to &#64;callback.
    */
    public void ejectWithOperation(int flags, @Nullable MountOperation mount_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDrive.INST().g_drive_eject_with_operation(asCPointer(), flags, asCPointer(mount_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "ejectWithOperation", callback), asCPointer(user_data));
    }

    /**
     * Finishes ejecting a drive. If any errors occurred during the operation,
     * <br>&#64;error will be set to contain the errors and %FALSE will be returned.
     * @param result a &#35;GAsyncResult.
     * @return %TRUE if the drive was successfully ejected. %FALSE otherwise.
    */
    public boolean ejectWithOperationFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDrive.INST().g_drive_eject_with_operation_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Gets the kinds of identifiers that &#64;drive has.
     * <br>Use g_drive_get_identifier() to obtain the identifiers
     * <br>themselves.
     * @return a %NULL-terminated     array of strings containing kinds of identifiers. Use g_strfreev()     to free.
    */
    public ch.bailu.gtk.type.Strs enumerateIdentifiers()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaDrive.INST().g_drive_enumerate_identifiers(asCPointer())));
    }

    /**
     * Gets the icon for &#64;drive.
     * @return &#35;GIcon for the &#64;drive.    Free the returned object with g_object_unref().
    */
    public Icon getIcon()  {
        return new Icon(new PointerContainer(JnaDrive.INST().g_drive_get_icon(asCPointer())));
    }

    /**
     * Gets the identifier of the given kind for &#64;drive. The only
     * <br>identifier currently available is
     * <br>%G_DRIVE_IDENTIFIER_KIND_UNIX_DEVICE.
     * @param kind the kind of identifier to return
     * @return a newly allocated string containing the     requested identifier, or %NULL if the &#35;GDrive     doesn't have this kind of identifier.
    */
    public ch.bailu.gtk.type.Str getIdentifier(@Nonnull ch.bailu.gtk.type.Str kind)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDrive.INST().g_drive_get_identifier(asCPointer(), asCPointerNotNull(kind))));
    }

    /**
     * Gets the identifier of the given kind for &#64;drive. The only
     * <br>identifier currently available is
     * <br>%G_DRIVE_IDENTIFIER_KIND_UNIX_DEVICE.
     * @param kind the kind of identifier to return
     * @return a newly allocated string containing the     requested identifier, or %NULL if the &#35;GDrive     doesn't have this kind of identifier.
    */
    public ch.bailu.gtk.type.Str getIdentifier(String kind)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDrive.INST().g_drive_get_identifier(asCPointer(), kind)));
    }

    /**
     * Gets the name of &#64;drive.
     * @return a string containing &#64;drive's name. The returned     string should be freed when no longer needed.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDrive.INST().g_drive_get_name(asCPointer())));
    }

    /**
     * Gets the sort key for &#64;drive, if any.
     * @return Sorting key for &#64;drive or %NULL if no such key is available.
    */
    public ch.bailu.gtk.type.Str getSortKey()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDrive.INST().g_drive_get_sort_key(asCPointer())));
    }

    /**
     * Gets a hint about how a drive can be started/stopped.
     * @return A value from the &#35;GDriveStartStopType enumeration.
    */
    public int getStartStopType()  {
        return JnaDrive.INST().g_drive_get_start_stop_type(asCPointer());
    }

    /**
     * Gets the icon for &#64;drive.
     * @return symbolic &#35;GIcon for the &#64;drive.    Free the returned object with g_object_unref().
    */
    public Icon getSymbolicIcon()  {
        return new Icon(new PointerContainer(JnaDrive.INST().g_drive_get_symbolic_icon(asCPointer())));
    }

    /**
     * Get a list of mountable volumes for &#64;drive.
     * <br>
     * <br>The returned list should be freed with g_list_free(), after
     * <br>its elements have been unreffed with g_object_unref().
     * @return &#35;GList containing any &#35;GVolume objects on the given &#64;drive.
    */
    public ch.bailu.gtk.glib.List getVolumes()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaDrive.INST().g_drive_get_volumes(asCPointer())));
    }

    /**
     * Checks if the &#64;drive has media. Note that the OS may not be polling
     * <br>the drive for media changes; see g_drive_is_media_check_automatic()
     * <br>for more details.
     * @return %TRUE if &#64;drive has media, %FALSE otherwise.
    */
    public boolean hasMedia()  {
        return JnaDrive.INST().g_drive_has_media(asCPointer());
    }

    /**
     * Check if &#64;drive has any mountable volumes.
     * @return %TRUE if the &#64;drive contains volumes, %FALSE otherwise.
    */
    public boolean hasVolumes()  {
        return JnaDrive.INST().g_drive_has_volumes(asCPointer());
    }

    /**
     * Checks if &#64;drive is capable of automatically detecting media changes.
     * @return %TRUE if the &#64;drive is capable of automatically detecting     media changes, %FALSE otherwise.
    */
    public boolean isMediaCheckAutomatic()  {
        return JnaDrive.INST().g_drive_is_media_check_automatic(asCPointer());
    }

    /**
     * Checks if the &#64;drive supports removable media.
     * @return %TRUE if &#64;drive supports removable media, %FALSE otherwise.
    */
    public boolean isMediaRemovable()  {
        return JnaDrive.INST().g_drive_is_media_removable(asCPointer());
    }

    /**
     * Checks if the &#35;GDrive and/or its media is considered removable by the user.
     * <br>See g_drive_is_media_removable().
     * @return %TRUE if &#64;drive and/or its media is considered removable, %FALSE otherwise.
    */
    public boolean isRemovable()  {
        return JnaDrive.INST().g_drive_is_removable(asCPointer());
    }

    /**
     * Asynchronously polls &#64;drive to see if media has been inserted or removed.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_drive_poll_for_media_finish() to obtain the
     * <br>result of the operation.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback, or %NULL.
     * @param user_data user data to pass to &#64;callback
    */
    public void pollForMedia(@Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDrive.INST().g_drive_poll_for_media(asCPointer(), asCPointer(cancellable), toOnAsyncReadyCallback(this, "pollForMedia", callback), asCPointer(user_data));
    }

    /**
     * Finishes an operation started with g_drive_poll_for_media() on a drive.
     * @param result a &#35;GAsyncResult.
     * @return %TRUE if the drive has been poll_for_mediaed successfully,     %FALSE otherwise.
    */
    public boolean pollForMediaFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDrive.INST().g_drive_poll_for_media_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Asynchronously starts a drive.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_drive_start_finish() to obtain the
     * <br>result of the operation.
     * @param flags flags affecting the start operation.
     * @param mount_operation a &#35;GMountOperation or %NULL to avoid     user interaction.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback, or %NULL.
     * @param user_data user data to pass to &#64;callback
    */
    public void start(int flags, @Nullable MountOperation mount_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDrive.INST().g_drive_start(asCPointer(), flags, asCPointer(mount_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "start", callback), asCPointer(user_data));
    }

    /**
     * Finishes starting a drive.
     * @param result a &#35;GAsyncResult.
     * @return %TRUE if the drive has been started successfully,     %FALSE otherwise.
    */
    public boolean startFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDrive.INST().g_drive_start_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Asynchronously stops a drive.
     * <br>
     * <br>When the operation is finished, &#64;callback will be called.
     * <br>You can then call g_drive_stop_finish() to obtain the
     * <br>result of the operation.
     * @param flags flags affecting the unmount if required for stopping.
     * @param mount_operation a &#35;GMountOperation or %NULL to avoid     user interaction.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback, or %NULL.
     * @param user_data user data to pass to &#64;callback
    */
    public void stop(int flags, @Nullable MountOperation mount_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaDrive.INST().g_drive_stop(asCPointer(), flags, asCPointer(mount_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "stop", callback), asCPointer(user_data));
    }

    /**
     * Finishes stopping a drive.
     * @param result a &#35;GAsyncResult.
     * @return %TRUE if the drive has been stopped successfully,     %FALSE otherwise.
    */
    public boolean stopFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaDrive.INST().g_drive_stop_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
    }

    public final static String SIGNAL_ON_DISCONNECTED = "disconnected";
    
    /**
     * Connect to signal "disconnected".
     * <br>See {@link OnDisconnected#onDisconnected} for signal description.
     * <br>Field {@link #SIGNAL_ON_DISCONNECTED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDisconnected(OnDisconnected signal) {
        return connectSignal(SIGNAL_ON_DISCONNECTED, toOnDisconnected(signal));
    }

    public final static String SIGNAL_ON_EJECT_BUTTON = "eject-button";
    
    /**
     * Connect to signal "eject-button".
     * <br>See {@link OnEjectButton#onEjectButton} for signal description.
     * <br>Field {@link #SIGNAL_ON_EJECT_BUTTON} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEjectButton(OnEjectButton signal) {
        return connectSignal(SIGNAL_ON_EJECT_BUTTON, toOnEjectButton(signal));
    }

    public final static String SIGNAL_ON_STOP_BUTTON = "stop-button";
    
    /**
     * Connect to signal "stop-button".
     * <br>See {@link OnStopButton#onStopButton} for signal description.
     * <br>Field {@link #SIGNAL_ON_STOP_BUTTON} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onStopButton(OnStopButton signal) {
        return connectSignal(SIGNAL_ON_STOP_BUTTON, toOnStopButton(signal));
    }

    public static long getTypeID() { 
        return JnaDrive.INST().g_drive_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
interface-type

[MethodModel:cb-deprecated:eject:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-deprecated:ejectFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
*/
