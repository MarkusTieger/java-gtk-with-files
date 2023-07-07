/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDBusActionGroup is an implementation of the &#35;GActionGroup
 * <br>interface that can be used as a proxy for an action group
 * <br>that is exported over D-Bus with g_dbus_connection_export_action_group().
 * <p><a href="https://docs.gtk.org/gio/class.DBusActionGroup.html">https://docs.gtk.org/gio/class.DBusActionGroup.html</a></p>
*/
public class DBusActionGroup extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusActionGroup.class.getCanonicalName());
    }

    public DBusActionGroup(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Obtains a &#35;GDBusActionGroup for the action group which is exported at
     * <br>the given &#64;bus_name and &#64;object_path.
     * <br>
     * <br>The thread default main context is taken at the time of this call.
     * <br>All signals on the menu model (and any linked models) are reported
     * <br>with respect to this context.  All calls on the returned menu model
     * <br>(and linked models) must also originate from this same context, with
     * <br>the thread default main context unchanged.
     * <br>
     * <br>This call is non-blocking.  The returned action group may or may not
     * <br>already be filled in.  The correct thing to do is connect the signals
     * <br>for the action group to monitor for changes and then to call
     * <br>g_action_group_list_actions() to get the initial list.
     * @param connection A &#35;GDBusConnection
     * @param bus_name the bus name which exports the action     group or %NULL if &#64;connection is not a message bus connection
     * @param object_path the object path at which the action group is exported
     * @return a &#35;GDBusActionGroup
    */
    public static DBusActionGroup get(@Nonnull DBusConnection connection, @Nullable ch.bailu.gtk.type.Str bus_name, @Nonnull ch.bailu.gtk.type.Str object_path)  {
        return new DBusActionGroup(new PointerContainer(JnaDBusActionGroup.INST().g_dbus_action_group_get(asCPointerNotNull(connection), asCPointer(bus_name), asCPointerNotNull(object_path))));
    }

    /**
     * Implements interface {@link ActionGroup}. Call this to get access to interface functions.
     * @return {@link ActionGroup}
    */
    public ActionGroup asActionGroup() {
        return new ActionGroup(cast());
    }

    /**
     * Implements interface {@link RemoteActionGroup}. Call this to get access to interface functions.
     * @return {@link RemoteActionGroup}
    */
    public RemoteActionGroup asRemoteActionGroup() {
        return new RemoteActionGroup(cast());
    }

    public static long getTypeID() { 
        return JnaDBusActionGroup.INST().g_dbus_action_group_get_type(); 
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
*/
