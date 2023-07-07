/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GMount interface represents user-visible mounts. Note, when
 * <br>porting from GnomeVFS, &#35;GMount is the moral equivalent of &#35;GnomeVFSVolume.
 * <br>
 * <br>&#35;GMount is a &quot;mounted&quot; filesystem that you can access. Mounted is in
 * <br>quotes because it's not the same as a unix mount, it might be a gvfs
 * <br>mount, but you can still access the files on it if you use GIO. Might or
 * <br>might not be related to a volume object.
 * <br>
 * <br>Unmounting a &#35;GMount instance is an asynchronous operation. For
 * <br>more information about asynchronous operations, see &#35;GAsyncResult
 * <br>and &#35;GTask. To unmount a &#35;GMount instance, first call
 * <br>g_mount_unmount_with_operation() with (at least) the &#35;GMount instance and a
 * <br>&#35;GAsyncReadyCallback.  The callback will be fired when the
 * <br>operation has resolved (either with success or failure), and a
 * <br>&#35;GAsyncResult structure will be passed to the callback.  That
 * <br>callback should then call g_mount_unmount_with_operation_finish() with the &#35;GMount
 * <br>and the &#35;GAsyncResult data to see if the operation was completed
 * <br>successfully.  If an &#64;error is present when g_mount_unmount_with_operation_finish()
 * <br>is called, then it will be filled with any error information.
 * <p><a href="https://docs.gtk.org/gio/iface.Mount.html">https://docs.gtk.org/gio/iface.Mount.html</a></p>
*/
public class Mount extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Mount.class.getCanonicalName());
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
    
    private static JnaMount.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaMount.OnAsyncReadyCallback out = null;
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
         * Emitted when the mount has been changed.
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaMount.OnChanged) (__self, __data) -> in.onChanged();
    }

    @FunctionalInterface
    public interface OnPreUnmount {
        /**
         * This signal may be emitted when the &#35;GMount is about to be
         * <br>unmounted.
         * <br>
         * <br>This signal depends on the backend and is only emitted if
         * <br>GIO was used to unmount.
        */
        void onPreUnmount();
    }
    
    private static com.sun.jna.Callback toOnPreUnmount(OnPreUnmount in) {
        return (in == null) ? null: (JnaMount.OnPreUnmount) (__self, __data) -> in.onPreUnmount();
    }

    @FunctionalInterface
    public interface OnUnmounted {
        /**
         * This signal is emitted when the &#35;GMount have been
         * <br>unmounted. If the recipient is holding references to the
         * <br>object they should release them so the object can be
         * <br>finalized.
        */
        void onUnmounted();
    }
    
    private static com.sun.jna.Callback toOnUnmounted(OnUnmounted in) {
        return (in == null) ? null: (JnaMount.OnUnmounted) (__self, __data) -> in.onUnmounted();
    }

    public Mount(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Checks if &#64;mount can be ejected.
     * @return %TRUE if the &#64;mount can be ejected.
    */
    public boolean canEject()  {
        return JnaMount.INST().g_mount_can_eject(asCPointer());
    }

    /**
     * Checks if &#64;mount can be unmounted.
     * @return %TRUE if the &#64;mount can be unmounted.
    */
    public boolean canUnmount()  {
        return JnaMount.INST().g_mount_can_unmount(asCPointer());
    }

    /**
     * Ejects a mount. This is an asynchronous operation, and is
     * <br>finished by calling g_mount_eject_with_operation_finish() with the &#64;mount
     * <br>and &#35;GAsyncResult data returned in the &#64;callback.
     * @param flags flags affecting the unmount if required for eject
     * @param mount_operation a &#35;GMountOperation or %NULL to avoid     user interaction.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback, or %NULL.
     * @param user_data user data passed to &#64;callback.
    */
    public void ejectWithOperation(int flags, @Nullable MountOperation mount_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaMount.INST().g_mount_eject_with_operation(asCPointer(), flags, asCPointer(mount_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "ejectWithOperation", callback), asCPointer(user_data));
    }

    /**
     * Finishes ejecting a mount. If any errors occurred during the operation,
     * <br>&#64;error will be set to contain the errors and %FALSE will be returned.
     * @param result a &#35;GAsyncResult.
     * @return %TRUE if the mount was successfully ejected. %FALSE otherwise.
    */
    public boolean ejectWithOperationFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaMount.INST().g_mount_eject_with_operation_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Gets the default location of &#64;mount. The default location of the given
     * <br>&#64;mount is a path that reflects the main entry point for the user (e.g.
     * <br>the home directory, or the root of the volume).
     * @return a &#35;GFile.      The returned object should be unreffed with      g_object_unref() when no longer needed.
    */
    public File getDefaultLocation()  {
        return new File(new PointerContainer(JnaMount.INST().g_mount_get_default_location(asCPointer())));
    }

    /**
     * Gets the drive for the &#64;mount.
     * <br>
     * <br>This is a convenience method for getting the &#35;GVolume and then
     * <br>using that object to get the &#35;GDrive.
     * @return a &#35;GDrive or %NULL if &#64;mount is not      associated with a volume or a drive.      The returned object should be unreffed with      g_object_unref() when no longer needed.
    */
    public Drive getDrive()  {
        return new Drive(new PointerContainer(JnaMount.INST().g_mount_get_drive(asCPointer())));
    }

    /**
     * Gets the icon for &#64;mount.
     * @return a &#35;GIcon.      The returned object should be unreffed with      g_object_unref() when no longer needed.
    */
    public Icon getIcon()  {
        return new Icon(new PointerContainer(JnaMount.INST().g_mount_get_icon(asCPointer())));
    }

    /**
     * Gets the name of &#64;mount.
     * @return the name for the given &#64;mount.     The returned string should be freed with g_free()     when no longer needed.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMount.INST().g_mount_get_name(asCPointer())));
    }

    /**
     * Gets the root directory on &#64;mount.
     * @return a &#35;GFile.      The returned object should be unreffed with      g_object_unref() when no longer needed.
    */
    public File getRoot()  {
        return new File(new PointerContainer(JnaMount.INST().g_mount_get_root(asCPointer())));
    }

    /**
     * Gets the sort key for &#64;mount, if any.
     * @return Sorting key for &#64;mount or %NULL if no such key is available.
    */
    public ch.bailu.gtk.type.Str getSortKey()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMount.INST().g_mount_get_sort_key(asCPointer())));
    }

    /**
     * Gets the symbolic icon for &#64;mount.
     * @return a &#35;GIcon.      The returned object should be unreffed with      g_object_unref() when no longer needed.
    */
    public Icon getSymbolicIcon()  {
        return new Icon(new PointerContainer(JnaMount.INST().g_mount_get_symbolic_icon(asCPointer())));
    }

    /**
     * Gets the UUID for the &#64;mount. The reference is typically based on
     * <br>the file system UUID for the mount in question and should be
     * <br>considered an opaque string. Returns %NULL if there is no UUID
     * <br>available.
     * @return the UUID for &#64;mount or %NULL if no UUID     can be computed.     The returned string should be freed with g_free()     when no longer needed.
    */
    public ch.bailu.gtk.type.Str getUuid()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMount.INST().g_mount_get_uuid(asCPointer())));
    }

    /**
     * Gets the volume for the &#64;mount.
     * @return a &#35;GVolume or %NULL if &#64;mount is not      associated with a volume.      The returned object should be unreffed with      g_object_unref() when no longer needed.
    */
    public Volume getVolume()  {
        return new Volume(new PointerContainer(JnaMount.INST().g_mount_get_volume(asCPointer())));
    }

    /**
     * Tries to guess the type of content stored on &#64;mount. Returns one or
     * <br>more textual identifiers of well-known content types (typically
     * <br>prefixed with &quot;x-content/&quot;), e.g. x-content/image-dcf for camera
     * <br>memory cards. See the
     * <br>[shared-mime-info](http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec)
     * <br>specification for more on x-content types.
     * <br>
     * <br>This is an asynchronous operation (see
     * <br>g_mount_guess_content_type_sync() for the synchronous version), and
     * <br>is finished by calling g_mount_guess_content_type_finish() with the
     * <br>&#64;mount and &#35;GAsyncResult data returned in the &#64;callback.
     * @param force_rescan Whether to force a rescan of the content.     Otherwise a cached result will be used if available
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback
     * @param user_data user data passed to &#64;callback
    */
    public void guessContentType(boolean force_rescan, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaMount.INST().g_mount_guess_content_type(asCPointer(), force_rescan, asCPointer(cancellable), toOnAsyncReadyCallback(this, "guessContentType", callback), asCPointer(user_data));
    }

    /**
     * Determines if &#64;mount is shadowed. Applications or libraries should
     * <br>avoid displaying &#64;mount in the user interface if it is shadowed.
     * <br>
     * <br>A mount is said to be shadowed if there exists one or more user
     * <br>visible objects (currently &#35;GMount objects) with a root that is
     * <br>inside the root of &#64;mount.
     * <br>
     * <br>One application of shadow mounts is when exposing a single file
     * <br>system that is used to address several logical volumes. In this
     * <br>situation, a &#35;GVolumeMonitor implementation would create two
     * <br>&#35;GVolume objects (for example, one for the camera functionality of
     * <br>the device and one for a SD card reader on the device) with
     * <br>activation URIs `gphoto2://[usb:001,002]/store1/`
     * <br>and `gphoto2://[usb:001,002]/store2/`. When the
     * <br>underlying mount (with root
     * <br>`gphoto2://[usb:001,002]/`) is mounted, said
     * <br>&#35;GVolumeMonitor implementation would create two &#35;GMount objects
     * <br>(each with their root matching the corresponding volume activation
     * <br>root) that would shadow the original mount.
     * <br>
     * <br>The proxy monitor in GVfs 2.26 and later, automatically creates and
     * <br>manage shadow mounts (and shadows the underlying mount) if the
     * <br>activation root on a &#35;GVolume is set.
     * @return %TRUE if &#64;mount is shadowed.
    */
    public boolean isShadowed()  {
        return JnaMount.INST().g_mount_is_shadowed(asCPointer());
    }

    /**
     * Remounts a mount. This is an asynchronous operation, and is
     * <br>finished by calling g_mount_remount_finish() with the &#64;mount
     * <br>and &#35;GAsyncResults data returned in the &#64;callback.
     * <br>
     * <br>Remounting is useful when some setting affecting the operation
     * <br>of the volume has been changed, as these may need a remount to
     * <br>take affect. While this is semantically equivalent with unmounting
     * <br>and then remounting not all backends might need to actually be
     * <br>unmounted.
     * @param flags flags affecting the operation
     * @param mount_operation a &#35;GMountOperation or %NULL to avoid     user interaction.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback, or %NULL.
     * @param user_data user data passed to &#64;callback.
    */
    public void remount(int flags, @Nullable MountOperation mount_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaMount.INST().g_mount_remount(asCPointer(), flags, asCPointer(mount_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "remount", callback), asCPointer(user_data));
    }

    /**
     * Finishes remounting a mount. If any errors occurred during the operation,
     * <br>&#64;error will be set to contain the errors and %FALSE will be returned.
     * @param result a &#35;GAsyncResult.
     * @return %TRUE if the mount was successfully remounted. %FALSE otherwise.
    */
    public boolean remountFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaMount.INST().g_mount_remount_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Increments the shadow count on &#64;mount. Usually used by
     * <br>&#35;GVolumeMonitor implementations when creating a shadow mount for
     * <br>&#64;mount, see g_mount_is_shadowed() for more information. The caller
     * <br>will need to emit the &#35;GMount::changed signal on &#64;mount manually.
    */
    public void shadow()  {
        JnaMount.INST().g_mount_shadow(asCPointer());
    }

    /**
     * Unmounts a mount. This is an asynchronous operation, and is
     * <br>finished by calling g_mount_unmount_with_operation_finish() with the &#64;mount
     * <br>and &#35;GAsyncResult data returned in the &#64;callback.
     * @param flags flags affecting the operation
     * @param mount_operation a &#35;GMountOperation or %NULL to avoid     user interaction.
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore.
     * @param callback a &#35;GAsyncReadyCallback, or %NULL.
     * @param user_data user data passed to &#64;callback.
    */
    public void unmountWithOperation(int flags, @Nullable MountOperation mount_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaMount.INST().g_mount_unmount_with_operation(asCPointer(), flags, asCPointer(mount_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "unmountWithOperation", callback), asCPointer(user_data));
    }

    /**
     * Finishes unmounting a mount. If any errors occurred during the operation,
     * <br>&#64;error will be set to contain the errors and %FALSE will be returned.
     * @param result a &#35;GAsyncResult.
     * @return %TRUE if the mount was successfully unmounted. %FALSE otherwise.
    */
    public boolean unmountWithOperationFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaMount.INST().g_mount_unmount_with_operation_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Decrements the shadow count on &#64;mount. Usually used by
     * <br>&#35;GVolumeMonitor implementations when destroying a shadow mount for
     * <br>&#64;mount, see g_mount_is_shadowed() for more information. The caller
     * <br>will need to emit the &#35;GMount::changed signal on &#64;mount manually.
    */
    public void unshadow()  {
        JnaMount.INST().g_mount_unshadow(asCPointer());
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

    public final static String SIGNAL_ON_PRE_UNMOUNT = "pre-unmount";
    
    /**
     * Connect to signal "pre-unmount".
     * <br>See {@link OnPreUnmount#onPreUnmount} for signal description.
     * <br>Field {@link #SIGNAL_ON_PRE_UNMOUNT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPreUnmount(OnPreUnmount signal) {
        return connectSignal(SIGNAL_ON_PRE_UNMOUNT, toOnPreUnmount(signal));
    }

    public final static String SIGNAL_ON_UNMOUNTED = "unmounted";
    
    /**
     * Connect to signal "unmounted".
     * <br>See {@link OnUnmounted#onUnmounted} for signal description.
     * <br>Field {@link #SIGNAL_ON_UNMOUNTED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUnmounted(OnUnmounted signal) {
        return connectSignal(SIGNAL_ON_UNMOUNTED, toOnUnmounted(signal));
    }

    public static long getTypeID() { 
        return JnaMount.INST().g_mount_get_type(); 
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

[MethodModel:cb-return-value-not-supported:guessContentTypeFinish:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:guessContentTypeSync:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[MethodModel:cb-deprecated:unmount:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-deprecated:unmountFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
*/
