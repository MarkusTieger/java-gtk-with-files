/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDBusMenuModel is an implementation of &#35;GMenuModel that can be used
 * <br>as a proxy for a menu model that is exported over D-Bus with
 * <br>g_dbus_connection_export_menu_model().
 * <p><a href="https://docs.gtk.org/gio/class.DBusMenuModel.html">https://docs.gtk.org/gio/class.DBusMenuModel.html</a></p>
*/
public class DBusMenuModel extends MenuModel {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusMenuModel.class.getCanonicalName());
    }

    public DBusMenuModel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Obtains a &#35;GDBusMenuModel for the menu model which is exported
     * <br>at the given &#64;bus_name and &#64;object_path.
     * <br>
     * <br>The thread default main context is taken at the time of this call.
     * <br>All signals on the menu model (and any linked models) are reported
     * <br>with respect to this context.  All calls on the returned menu model
     * <br>(and linked models) must also originate from this same context, with
     * <br>the thread default main context unchanged.
     * @param connection a &#35;GDBusConnection
     * @param bus_name the bus name which exports the menu model     or %NULL if &#64;connection is not a message bus connection
     * @param object_path the object path at which the menu model is exported
     * @return a &#35;GDBusMenuModel object. Free with     g_object_unref().
    */
    public static DBusMenuModel get(@Nonnull DBusConnection connection, @Nullable ch.bailu.gtk.type.Str bus_name, @Nonnull ch.bailu.gtk.type.Str object_path)  {
        return new DBusMenuModel(new PointerContainer(JnaDBusMenuModel.INST().g_dbus_menu_model_get(asCPointerNotNull(connection), asCPointer(bus_name), asCPointerNotNull(object_path))));
    }

    public static long getTypeID() { 
        return JnaDBusMenuModel.INST().g_dbus_menu_model_get_type(); 
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
