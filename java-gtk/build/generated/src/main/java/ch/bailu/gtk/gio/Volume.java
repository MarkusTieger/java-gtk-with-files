/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GVolume interface represents user-visible objects that can be
 * <br>mounted. Note, when porting from GnomeVFS, &#35;GVolume is the moral
 * <br>equivalent of &#35;GnomeVFSDrive.
 * <br>
 * <br>Mounting a &#35;GVolume instance is an asynchronous operation. For more
 * <br>information about asynchronous operations, see &#35;GAsyncResult and
 * <br>&#35;GTask. To mount a &#35;GVolume, first call g_volume_mount() with (at
 * <br>least) the &#35;GVolume instance, optionally a &#35;GMountOperation object
 * <br>and a &#35;GAsyncReadyCallback.
 * <br>
 * <br>Typically, one will only want to pass %NULL for the
 * <br>&#35;GMountOperation if automounting all volumes when a desktop session
 * <br>starts since it's not desirable to put up a lot of dialogs asking
 * <br>for credentials.
 * <br>
 * <br>The callback will be fired when the operation has resolved (either
 * <br>with success or failure), and a &#35;GAsyncResult instance will be
 * <br>passed to the callback.  That callback should then call
 * <br>g_volume_mount_finish() with the &#35;GVolume instance and the
 * <br>&#35;GAsyncResult data to see if the operation was completed
 * <br>successfully.  If an &#64;error is present when g_volume_mount_finish()
 * <br>is called, then it will be filled with any error information.
 * <br>
 * <br>&#35;&#35; Volume Identifiers &#35; {&#35;volume-identifier}
 * <br>
 * <br>It is sometimes necessary to directly access the underlying
 * <br>operating system object behind a volume (e.g. for passing a volume
 * <br>to an application via the commandline). For this purpose, GIO
 * <br>allows to obtain an 'identifier' for the volume. There can be
 * <br>different kinds of identifiers, such as Hal UDIs, filesystem labels,
 * <br>traditional Unix devices (e.g. `/dev/sda2`), UUIDs. GIO uses predefined
 * <br>strings as names for the different kinds of identifiers:
 * <br>%G_VOLUME_IDENTIFIER_KIND_UUID, %G_VOLUME_IDENTIFIER_KIND_LABEL, etc.
 * <br>Use g_volume_get_identifier() to obtain an identifier for a volume.
 * <br>
 * <br>
 * <br>Note that %G_VOLUME_IDENTIFIER_KIND_HAL_UDI will only be available
 * <br>when the gvfs hal volume monitor is in use. Other volume monitors
 * <br>will generally be able to provide the %G_VOLUME_IDENTIFIER_KIND_UNIX_DEVICE
 * <br>identifier, which can be used to obtain a hal device by means of
 * <br>libhal_manager_find_device_string_match().
 * <p><a href="https://docs.gtk.org/gio/iface.Volume.html">https://docs.gtk.org/gio/iface.Volume.html</a></p>
*/
public class Volume extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Volume.class.getCanonicalName());
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
    
    private static JnaVolume.OnAsyncReadyCallback toOnAsyncReadyCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnAsyncReadyCallback in) {
        JnaVolume.OnAsyncReadyCallback out = null;
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
         * Emitted when the volume has been changed.
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaVolume.OnChanged) (__self, __data) -> in.onChanged();
    }

    @FunctionalInterface
    public interface OnRemoved {
        /**
         * This signal is emitted when the &#35;GVolume have been removed. If
         * <br>the recipient is holding references to the object they should
         * <br>release them so the object can be finalized.
        */
        void onRemoved();
    }
    
    private static com.sun.jna.Callback toOnRemoved(OnRemoved in) {
        return (in == null) ? null: (JnaVolume.OnRemoved) (__self, __data) -> in.onRemoved();
    }

    public Volume(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Checks if a volume can be ejected.
     * @return %TRUE if the &#64;volume can be ejected. %FALSE otherwise
    */
    public boolean canEject()  {
        return JnaVolume.INST().g_volume_can_eject(asCPointer());
    }

    /**
     * Checks if a volume can be mounted.
     * @return %TRUE if the &#64;volume can be mounted. %FALSE otherwise
    */
    public boolean canMount()  {
        return JnaVolume.INST().g_volume_can_mount(asCPointer());
    }

    /**
     * Ejects a volume. This is an asynchronous operation, and is
     * <br>finished by calling g_volume_eject_with_operation_finish() with the &#64;volume
     * <br>and &#35;GAsyncResult data returned in the &#64;callback.
     * @param flags flags affecting the unmount if required for eject
     * @param mount_operation a &#35;GMountOperation or %NULL to     avoid user interaction
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback, or %NULL
     * @param user_data user data passed to &#64;callback
    */
    public void ejectWithOperation(int flags, @Nullable MountOperation mount_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaVolume.INST().g_volume_eject_with_operation(asCPointer(), flags, asCPointer(mount_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "ejectWithOperation", callback), asCPointer(user_data));
    }

    /**
     * Finishes ejecting a volume. If any errors occurred during the operation,
     * <br>&#64;error will be set to contain the errors and %FALSE will be returned.
     * @param result a &#35;GAsyncResult
     * @return %TRUE if the volume was successfully ejected. %FALSE otherwise
    */
    public boolean ejectWithOperationFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaVolume.INST().g_volume_eject_with_operation_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Gets the kinds of [identifiers][volume-identifier] that &#64;volume has.
     * <br>Use g_volume_get_identifier() to obtain the identifiers themselves.
     * @return a %NULL-terminated array   of strings containing kinds of identifiers. Use g_strfreev() to free.
    */
    public ch.bailu.gtk.type.Strs enumerateIdentifiers()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaVolume.INST().g_volume_enumerate_identifiers(asCPointer())));
    }

    /**
     * Gets the activation root for a &#35;GVolume if it is known ahead of
     * <br>mount time. Returns %NULL otherwise. If not %NULL and if &#64;volume
     * <br>is mounted, then the result of g_mount_get_root() on the
     * <br>&#35;GMount object obtained from g_volume_get_mount() will always
     * <br>either be equal or a prefix of what this function returns. In
     * <br>other words, in code
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   GMount *mount;
     *   GFile *mount_root
     *   GFile *volume_activation_root;
     * 
     *   mount = g_volume_get_mount (volume); // mounted, so never NULL
     *   mount_root = g_mount_get_root (mount);
     *   volume_activation_root = g_volume_get_activation_root (volume); // assume not NULL
     * </pre>
     * <br>then the expression
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *   (g_file_has_prefix (volume_activation_root, mount_root) ||
     *    g_file_equal (volume_activation_root, mount_root))
     * </pre>
     * <br>will always be %TRUE.
     * <br>
     * <br>Activation roots are typically used in &#35;GVolumeMonitor
     * <br>implementations to find the underlying mount to shadow, see
     * <br>g_mount_is_shadowed() for more details.
     * @return the activation root of &#64;volume     or %NULL. Use g_object_unref() to free.
    */
    public File getActivationRoot()  {
        return new File(new PointerContainer(JnaVolume.INST().g_volume_get_activation_root(asCPointer())));
    }

    /**
     * Gets the drive for the &#64;volume.
     * @return a &#35;GDrive or %NULL if &#64;volume is not     associated with a drive. The returned object should be unreffed     with g_object_unref() when no longer needed.
    */
    public Drive getDrive()  {
        return new Drive(new PointerContainer(JnaVolume.INST().g_volume_get_drive(asCPointer())));
    }

    /**
     * Gets the icon for &#64;volume.
     * @return a &#35;GIcon.     The returned object should be unreffed with g_object_unref()     when no longer needed.
    */
    public Icon getIcon()  {
        return new Icon(new PointerContainer(JnaVolume.INST().g_volume_get_icon(asCPointer())));
    }

    /**
     * Gets the identifier of the given kind for &#64;volume.
     * <br>See the [introduction][volume-identifier] for more
     * <br>information about volume identifiers.
     * @param kind the kind of identifier to return
     * @return a newly allocated string containing the     requested identifier, or %NULL if the &#35;GVolume     doesn't have this kind of identifier
    */
    public ch.bailu.gtk.type.Str getIdentifier(@Nonnull ch.bailu.gtk.type.Str kind)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVolume.INST().g_volume_get_identifier(asCPointer(), asCPointerNotNull(kind))));
    }

    /**
     * Gets the identifier of the given kind for &#64;volume.
     * <br>See the [introduction][volume-identifier] for more
     * <br>information about volume identifiers.
     * @param kind the kind of identifier to return
     * @return a newly allocated string containing the     requested identifier, or %NULL if the &#35;GVolume     doesn't have this kind of identifier
    */
    public ch.bailu.gtk.type.Str getIdentifier(String kind)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVolume.INST().g_volume_get_identifier(asCPointer(), kind)));
    }

    /**
     * Gets the mount for the &#64;volume.
     * @return a &#35;GMount or %NULL if &#64;volume isn't mounted.     The returned object should be unreffed with g_object_unref()     when no longer needed.
    */
    public Mount getMount()  {
        return new Mount(new PointerContainer(JnaVolume.INST().g_volume_get_mount(asCPointer())));
    }

    /**
     * Gets the name of &#64;volume.
     * @return the name for the given &#64;volume. The returned string should     be freed with g_free() when no longer needed.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVolume.INST().g_volume_get_name(asCPointer())));
    }

    /**
     * Gets the sort key for &#64;volume, if any.
     * @return Sorting key for &#64;volume or %NULL if no such key is available
    */
    public ch.bailu.gtk.type.Str getSortKey()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVolume.INST().g_volume_get_sort_key(asCPointer())));
    }

    /**
     * Gets the symbolic icon for &#64;volume.
     * @return a &#35;GIcon.     The returned object should be unreffed with g_object_unref()     when no longer needed.
    */
    public Icon getSymbolicIcon()  {
        return new Icon(new PointerContainer(JnaVolume.INST().g_volume_get_symbolic_icon(asCPointer())));
    }

    /**
     * Gets the UUID for the &#64;volume. The reference is typically based on
     * <br>the file system UUID for the volume in question and should be
     * <br>considered an opaque string. Returns %NULL if there is no UUID
     * <br>available.
     * @return the UUID for &#64;volume or %NULL if no UUID     can be computed.     The returned string should be freed with g_free()     when no longer needed.
    */
    public ch.bailu.gtk.type.Str getUuid()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaVolume.INST().g_volume_get_uuid(asCPointer())));
    }

    /**
     * Mounts a volume. This is an asynchronous operation, and is
     * <br>finished by calling g_volume_mount_finish() with the &#64;volume
     * <br>and &#35;GAsyncResult returned in the &#64;callback.
     * @param flags flags affecting the operation
     * @param mount_operation a &#35;GMountOperation or %NULL to avoid user interaction
     * @param cancellable optional &#35;GCancellable object, %NULL to ignore
     * @param callback a &#35;GAsyncReadyCallback, or %NULL
     * @param user_data user data that gets passed to &#64;callback
    */
    public void mount(int flags, @Nullable MountOperation mount_operation, @Nullable Cancellable cancellable, OnAsyncReadyCallback callback, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaVolume.INST().g_volume_mount(asCPointer(), flags, asCPointer(mount_operation), asCPointer(cancellable), toOnAsyncReadyCallback(this, "mount", callback), asCPointer(user_data));
    }

    /**
     * Finishes mounting a volume. If any errors occurred during the operation,
     * <br>&#64;error will be set to contain the errors and %FALSE will be returned.
     * <br>
     * <br>If the mount operation succeeded, g_volume_get_mount() on &#64;volume
     * <br>is guaranteed to return the mount right after calling this
     * <br>function; there's no need to listen for the 'mount-added' signal on
     * <br>&#35;GVolumeMonitor.
     * @param result a &#35;GAsyncResult
     * @return %TRUE, %FALSE if operation failed
    */
    public boolean mountFinish(@Nonnull AsyncResult result) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaVolume.INST().g_volume_mount_finish(asCPointer(), asCPointerNotNull(result), 0L);
    }

    /**
     * Returns whether the volume should be automatically mounted.
     * @return %TRUE if the volume should be automatically mounted
    */
    public boolean shouldAutomount()  {
        return JnaVolume.INST().g_volume_should_automount(asCPointer());
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

    public final static String SIGNAL_ON_REMOVED = "removed";
    
    /**
     * Connect to signal "removed".
     * <br>See {@link OnRemoved#onRemoved} for signal description.
     * <br>Field {@link #SIGNAL_ON_REMOVED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRemoved(OnRemoved signal) {
        return connectSignal(SIGNAL_ON_REMOVED, toOnRemoved(signal));
    }

    public static long getTypeID() { 
        return JnaVolume.INST().g_volume_get_type(); 
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
