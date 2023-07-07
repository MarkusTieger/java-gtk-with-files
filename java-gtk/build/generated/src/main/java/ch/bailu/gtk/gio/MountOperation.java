/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GMountOperation provides a mechanism for interacting with the user.
 * <br>It can be used for authenticating mountable operations, such as loop
 * <br>mounting files, hard drive partitions or server locations. It can
 * <br>also be used to ask the user questions or show a list of applications
 * <br>preventing unmount or eject operations from completing.
 * <br>
 * <br>Note that &#35;GMountOperation is used for more than just &#35;GMount
 * <br>objects – for example it is also used in g_drive_start() and
 * <br>g_drive_stop().
 * <br>
 * <br>Users should instantiate a subclass of this that implements all the
 * <br>various callbacks to show the required dialogs, such as
 * <br>&#35;GtkMountOperation. If no user interaction is desired (for example
 * <br>when automounting filesystems at login time), usually %NULL can be
 * <br>passed, see each method taking a &#35;GMountOperation for details.
 * <br>
 * <br>The term ‘TCRYPT’ is used to mean ‘compatible with TrueCrypt and VeraCrypt’.
 * <br>[TrueCrypt](https://en.wikipedia.org/wiki/TrueCrypt) is a discontinued system for
 * <br>encrypting file containers, partitions or whole disks, typically used with Windows.
 * <br>[VeraCrypt](https://www.veracrypt.fr/) is a maintained fork of TrueCrypt with various
 * <br>improvements and auditing fixes.
 * <p><a href="https://docs.gtk.org/gio/class.MountOperation.html">https://docs.gtk.org/gio/class.MountOperation.html</a></p>
*/
public class MountOperation extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MountOperation.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAborted {
        /**
         * Emitted by the backend when e.g. a device becomes unavailable
         * <br>while a mount operation is in progress.
         * <br>
         * <br>Implementations of GMountOperation should handle this signal
         * <br>by dismissing open password dialogs.
        */
        void onAborted();
    }
    
    private static com.sun.jna.Callback toOnAborted(OnAborted in) {
        return (in == null) ? null: (JnaMountOperation.OnAborted) (__self, __data) -> in.onAborted();
    }

    @FunctionalInterface
    public interface OnAskPassword {
        /**
         * Emitted when a mount operation asks the user for a password.
         * <br>
         * <br>If the message contains a line break, the first line should be
         * <br>presented as a heading. For example, it may be used as the
         * <br>primary text in a &#35;GtkMessageDialog.
         * @param message string containing a message to display to the user.
         * @param default_user string containing the default user name.
         * @param default_domain string containing the default domain.
         * @param flags a set of &#35;GAskPasswordFlags.
        */
        void onAskPassword(@Nonnull ch.bailu.gtk.type.Str message, @Nonnull ch.bailu.gtk.type.Str default_user, @Nonnull ch.bailu.gtk.type.Str default_domain, int flags);
    }
    
    private static com.sun.jna.Callback toOnAskPassword(OnAskPassword in) {
        return (in == null) ? null: (JnaMountOperation.OnAskPassword) (__self, _message, _default_user, _default_domain, _flags, __data) -> in.onAskPassword(new ch.bailu.gtk.type.Str(new PointerContainer(_message)), new ch.bailu.gtk.type.Str(new PointerContainer(_default_user)), new ch.bailu.gtk.type.Str(new PointerContainer(_default_domain)), _flags);
    }

    @FunctionalInterface
    public interface OnReply {
        /**
         * Emitted when the user has replied to the mount operation.
         * @param result a &#35;GMountOperationResult indicating how the request was handled
        */
        void onReply(int result);
    }
    
    private static com.sun.jna.Callback toOnReply(OnReply in) {
        return (in == null) ? null: (JnaMountOperation.OnReply) (__self, _result, __data) -> in.onReply(_result);
    }

    @FunctionalInterface
    public interface OnShowUnmountProgress {
        /**
         * Emitted when an unmount operation has been busy for more than some time
         * <br>(typically 1.5 seconds).
         * <br>
         * <br>When unmounting or ejecting a volume, the kernel might need to flush
         * <br>pending data in its buffers to the volume stable storage, and this operation
         * <br>can take a considerable amount of time. This signal may be emitted several
         * <br>times as long as the unmount operation is outstanding, and then one
         * <br>last time when the operation is completed, with &#64;bytes_left set to zero.
         * <br>
         * <br>Implementations of GMountOperation should handle this signal by
         * <br>showing an UI notification, and then dismiss it, or show another notification
         * <br>of completion, when &#64;bytes_left reaches zero.
         * <br>
         * <br>If the message contains a line break, the first line should be
         * <br>presented as a heading. For example, it may be used as the
         * <br>primary text in a &#35;GtkMessageDialog.
         * @param message string containing a message to display to the user
         * @param time_left the estimated time left before the operation completes,     in microseconds, or -1
         * @param bytes_left the amount of bytes to be written before the operation     completes (or -1 if such amount is not known), or zero if the operation     is completed
        */
        void onShowUnmountProgress(@Nonnull ch.bailu.gtk.type.Str message, long time_left, long bytes_left);
    }
    
    private static com.sun.jna.Callback toOnShowUnmountProgress(OnShowUnmountProgress in) {
        return (in == null) ? null: (JnaMountOperation.OnShowUnmountProgress) (__self, _message, _time_left, _bytes_left, __data) -> in.onShowUnmountProgress(new ch.bailu.gtk.type.Str(new PointerContainer(_message)), _time_left, _bytes_left);
    }

    public MountOperation(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new mount operation.
    */
    public MountOperation() {
        super(cast(JnaMountOperation.INST().g_mount_operation_new()));
    }

    /**
     * Check to see whether the mount operation is being used
     * <br>for an anonymous user.
     * @return %TRUE if mount operation is anonymous.
    */
    public boolean getAnonymous()  {
        return JnaMountOperation.INST().g_mount_operation_get_anonymous(asCPointer());
    }

    /**
     * Gets a choice from the mount operation.
     * @return an integer containing an index of the user's choice from the choice's list, or `0`.
    */
    public int getChoice()  {
        return JnaMountOperation.INST().g_mount_operation_get_choice(asCPointer());
    }

    /**
     * Gets the domain of the mount operation.
     * @return a string set to the domain.
    */
    public ch.bailu.gtk.type.Str getDomain()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMountOperation.INST().g_mount_operation_get_domain(asCPointer())));
    }

    /**
     * Check to see whether the mount operation is being used
     * <br>for a TCRYPT hidden volume.
     * @return %TRUE if mount operation is for hidden volume.
    */
    public boolean getIsTcryptHiddenVolume()  {
        return JnaMountOperation.INST().g_mount_operation_get_is_tcrypt_hidden_volume(asCPointer());
    }

    /**
     * Check to see whether the mount operation is being used
     * <br>for a TCRYPT system volume.
     * @return %TRUE if mount operation is for system volume.
    */
    public boolean getIsTcryptSystemVolume()  {
        return JnaMountOperation.INST().g_mount_operation_get_is_tcrypt_system_volume(asCPointer());
    }

    /**
     * Gets a password from the mount operation.
     * @return a string containing the password within &#64;op.
    */
    public ch.bailu.gtk.type.Str getPassword()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMountOperation.INST().g_mount_operation_get_password(asCPointer())));
    }

    /**
     * Gets the state of saving passwords for the mount operation.
     * @return a &#35;GPasswordSave flag.
    */
    public int getPasswordSave()  {
        return JnaMountOperation.INST().g_mount_operation_get_password_save(asCPointer());
    }

    /**
     * Gets a PIM from the mount operation.
     * @return The VeraCrypt PIM within &#64;op.
    */
    public int getPim()  {
        return JnaMountOperation.INST().g_mount_operation_get_pim(asCPointer());
    }

    /**
     * Get the user name from the mount operation.
     * @return a string containing the user name.
    */
    public ch.bailu.gtk.type.Str getUsername()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMountOperation.INST().g_mount_operation_get_username(asCPointer())));
    }

    /**
     * Emits the &#35;GMountOperation::reply signal.
     * @param result a &#35;GMountOperationResult
    */
    public void reply(int result)  {
        JnaMountOperation.INST().g_mount_operation_reply(asCPointer(), result);
    }

    /**
     * Sets the mount operation to use an anonymous user if &#64;anonymous is %TRUE.
     * @param anonymous boolean value.
    */
    public void setAnonymous(boolean anonymous)  {
        JnaMountOperation.INST().g_mount_operation_set_anonymous(asCPointer(), anonymous);
    }

    /**
     * Sets a default choice for the mount operation.
     * @param choice an integer.
    */
    public void setChoice(int choice)  {
        JnaMountOperation.INST().g_mount_operation_set_choice(asCPointer(), choice);
    }

    /**
     * Sets the mount operation's domain.
     * @param domain the domain to set.
    */
    public void setDomain(@Nullable ch.bailu.gtk.type.Str domain)  {
        JnaMountOperation.INST().g_mount_operation_set_domain(asCPointer(), asCPointer(domain));
    }

    /**
     * Sets the mount operation's domain.
     * @param domain the domain to set.
    */
    public void setDomain(String domain)  {
        JnaMountOperation.INST().g_mount_operation_set_domain(asCPointer(), domain);
    }

    /**
     * Sets the mount operation to use a hidden volume if &#64;hidden_volume is %TRUE.
     * @param hidden_volume boolean value.
    */
    public void setIsTcryptHiddenVolume(boolean hidden_volume)  {
        JnaMountOperation.INST().g_mount_operation_set_is_tcrypt_hidden_volume(asCPointer(), hidden_volume);
    }

    /**
     * Sets the mount operation to use a system volume if &#64;system_volume is %TRUE.
     * @param system_volume boolean value.
    */
    public void setIsTcryptSystemVolume(boolean system_volume)  {
        JnaMountOperation.INST().g_mount_operation_set_is_tcrypt_system_volume(asCPointer(), system_volume);
    }

    /**
     * Sets the mount operation's password to &#64;password.
     * @param password password to set.
    */
    public void setPassword(@Nullable ch.bailu.gtk.type.Str password)  {
        JnaMountOperation.INST().g_mount_operation_set_password(asCPointer(), asCPointer(password));
    }

    /**
     * Sets the mount operation's password to &#64;password.
     * @param password password to set.
    */
    public void setPassword(String password)  {
        JnaMountOperation.INST().g_mount_operation_set_password(asCPointer(), password);
    }

    /**
     * Sets the state of saving passwords for the mount operation.
     * @param save a set of &#35;GPasswordSave flags.
    */
    public void setPasswordSave(int save)  {
        JnaMountOperation.INST().g_mount_operation_set_password_save(asCPointer(), save);
    }

    /**
     * Sets the mount operation's PIM to &#64;pim.
     * @param pim an unsigned integer.
    */
    public void setPim(int pim)  {
        JnaMountOperation.INST().g_mount_operation_set_pim(asCPointer(), pim);
    }

    /**
     * Sets the user name within &#64;op to &#64;username.
     * @param username input username.
    */
    public void setUsername(@Nullable ch.bailu.gtk.type.Str username)  {
        JnaMountOperation.INST().g_mount_operation_set_username(asCPointer(), asCPointer(username));
    }

    /**
     * Sets the user name within &#64;op to &#64;username.
     * @param username input username.
    */
    public void setUsername(String username)  {
        JnaMountOperation.INST().g_mount_operation_set_username(asCPointer(), username);
    }

    public final static String SIGNAL_ON_ABORTED = "aborted";
    
    /**
     * Connect to signal "aborted".
     * <br>See {@link OnAborted#onAborted} for signal description.
     * <br>Field {@link #SIGNAL_ON_ABORTED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAborted(OnAborted signal) {
        return connectSignal(SIGNAL_ON_ABORTED, toOnAborted(signal));
    }

    public final static String SIGNAL_ON_ASK_PASSWORD = "ask-password";
    
    /**
     * Connect to signal "ask-password".
     * <br>See {@link OnAskPassword#onAskPassword} for signal description.
     * <br>Field {@link #SIGNAL_ON_ASK_PASSWORD} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAskPassword(OnAskPassword signal) {
        return connectSignal(SIGNAL_ON_ASK_PASSWORD, toOnAskPassword(signal));
    }

    public final static String SIGNAL_ON_REPLY = "reply";
    
    /**
     * Connect to signal "reply".
     * <br>See {@link OnReply#onReply} for signal description.
     * <br>Field {@link #SIGNAL_ON_REPLY} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onReply(OnReply signal) {
        return connectSignal(SIGNAL_ON_REPLY, toOnReply(signal));
    }

    public final static String SIGNAL_ON_SHOW_UNMOUNT_PROGRESS = "show-unmount-progress";
    
    /**
     * Connect to signal "show-unmount-progress".
     * <br>See {@link OnShowUnmountProgress#onShowUnmountProgress} for signal description.
     * <br>Field {@link #SIGNAL_ON_SHOW_UNMOUNT_PROGRESS} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onShowUnmountProgress(OnShowUnmountProgress signal) {
        return connectSignal(SIGNAL_ON_SHOW_UNMOUNT_PROGRESS, toOnShowUnmountProgress(signal));
    }

    public static long getTypeID() { 
        return JnaMountOperation.INST().g_mount_operation_get_type(); 
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
class-type

[MethodModel:java-type-not-supported:askQuestion:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:void*}}:{j:}]

[MethodModel:java-type-not-supported:showProcesses:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Array:{c:void*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
