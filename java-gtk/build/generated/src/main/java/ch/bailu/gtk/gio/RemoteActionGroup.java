/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The GRemoteActionGroup interface is implemented by &#35;GActionGroup
 * <br>instances that either transmit action invocations to other processes
 * <br>or receive action invocations in the local process from other
 * <br>processes.
 * <br>
 * <br>The interface has `_full` variants of the two
 * <br>methods on &#35;GActionGroup used to activate actions:
 * <br>g_action_group_activate_action() and
 * <br>g_action_group_change_action_state(). These variants allow a
 * <br>&quot;platform data&quot; &#35;GVariant to be specified: a dictionary providing
 * <br>context for the action invocation (for example: timestamps, startup
 * <br>notification IDs, etc).
 * <br>
 * <br>&#35;GDBusActionGroup implements &#35;GRemoteActionGroup.  This provides a
 * <br>mechanism to send platform data for action invocations over D-Bus.
 * <br>
 * <br>Additionally, g_dbus_connection_export_action_group() will check if
 * <br>the exported &#35;GActionGroup implements &#35;GRemoteActionGroup and use the
 * <br>`_full` variants of the calls if available.  This
 * <br>provides a mechanism by which to receive platform data for action
 * <br>invocations that arrive by way of D-Bus.
 * <p><a href="https://docs.gtk.org/gio/iface.RemoteActionGroup.html">https://docs.gtk.org/gio/iface.RemoteActionGroup.html</a></p>
*/
public class RemoteActionGroup extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RemoteActionGroup.class.getCanonicalName());
    }

    public RemoteActionGroup(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Activates the remote action.
     * <br>
     * <br>This is the same as g_action_group_activate_action() except that it
     * <br>allows for provision of &quot;platform data&quot; to be sent along with the
     * <br>activation request.  This typically contains details such as the user
     * <br>interaction timestamp or startup notification information.
     * <br>
     * <br>&#64;platform_data must be non-%NULL and must have the type
     * <br>%G_VARIANT_TYPE_VARDICT.  If it is floating, it will be consumed.
     * @param action_name the name of the action to activate
     * @param parameter the optional parameter to the activation
     * @param platform_data the platform data to send
    */
    public void activateActionFull(@Nonnull ch.bailu.gtk.type.Str action_name, @Nullable ch.bailu.gtk.glib.Variant parameter, @Nonnull ch.bailu.gtk.glib.Variant platform_data)  {
        JnaRemoteActionGroup.INST().g_remote_action_group_activate_action_full(asCPointer(), asCPointerNotNull(action_name), asCPointer(parameter), asCPointerNotNull(platform_data));
    }

    /**
     * Activates the remote action.
     * <br>
     * <br>This is the same as g_action_group_activate_action() except that it
     * <br>allows for provision of &quot;platform data&quot; to be sent along with the
     * <br>activation request.  This typically contains details such as the user
     * <br>interaction timestamp or startup notification information.
     * <br>
     * <br>&#64;platform_data must be non-%NULL and must have the type
     * <br>%G_VARIANT_TYPE_VARDICT.  If it is floating, it will be consumed.
     * @param action_name the name of the action to activate
     * @param parameter the optional parameter to the activation
     * @param platform_data the platform data to send
    */
    public void activateActionFull(String action_name, @Nullable ch.bailu.gtk.glib.Variant parameter, @Nonnull ch.bailu.gtk.glib.Variant platform_data)  {
        JnaRemoteActionGroup.INST().g_remote_action_group_activate_action_full(asCPointer(), action_name, asCPointer(parameter), asCPointerNotNull(platform_data));
    }

    /**
     * Changes the state of a remote action.
     * <br>
     * <br>This is the same as g_action_group_change_action_state() except that
     * <br>it allows for provision of &quot;platform data&quot; to be sent along with the
     * <br>state change request.  This typically contains details such as the
     * <br>user interaction timestamp or startup notification information.
     * <br>
     * <br>&#64;platform_data must be non-%NULL and must have the type
     * <br>%G_VARIANT_TYPE_VARDICT.  If it is floating, it will be consumed.
     * @param action_name the name of the action to change the state of
     * @param value the new requested value for the state
     * @param platform_data the platform data to send
    */
    public void changeActionStateFull(@Nonnull ch.bailu.gtk.type.Str action_name, @Nonnull ch.bailu.gtk.glib.Variant value, @Nonnull ch.bailu.gtk.glib.Variant platform_data)  {
        JnaRemoteActionGroup.INST().g_remote_action_group_change_action_state_full(asCPointer(), asCPointerNotNull(action_name), asCPointerNotNull(value), asCPointerNotNull(platform_data));
    }

    /**
     * Changes the state of a remote action.
     * <br>
     * <br>This is the same as g_action_group_change_action_state() except that
     * <br>it allows for provision of &quot;platform data&quot; to be sent along with the
     * <br>state change request.  This typically contains details such as the
     * <br>user interaction timestamp or startup notification information.
     * <br>
     * <br>&#64;platform_data must be non-%NULL and must have the type
     * <br>%G_VARIANT_TYPE_VARDICT.  If it is floating, it will be consumed.
     * @param action_name the name of the action to change the state of
     * @param value the new requested value for the state
     * @param platform_data the platform data to send
    */
    public void changeActionStateFull(String action_name, @Nonnull ch.bailu.gtk.glib.Variant value, @Nonnull ch.bailu.gtk.glib.Variant platform_data)  {
        JnaRemoteActionGroup.INST().g_remote_action_group_change_action_state_full(asCPointer(), action_name, asCPointerNotNull(value), asCPointerNotNull(platform_data));
    }

    public static long getTypeID() { 
        return JnaRemoteActionGroup.INST().g_remote_action_group_get_type(); 
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
*/
