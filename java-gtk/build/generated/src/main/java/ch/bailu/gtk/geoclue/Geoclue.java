/* this file is machine generated */
package ch.bailu.gtk.geoclue;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://www.freedesktop.org/software/geoclue/docs/libgeoclue/">https://www.freedesktop.org/software/geoclue/docs/libgeoclue/</a></p>
*/
public class Geoclue extends ch.bailu.gtk.type.Package {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Geoclue.class.getCanonicalName());
    }

    /**
     * Gets a machine-readable description of the &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Client.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Client&lt;/link&gt; D-Bus interface.
     * @return A &#35;GDBusInterfaceInfo. Do not free.
    */
    public static ch.bailu.gtk.gio.DBusInterfaceInfo clientInterfaceInfo()  {
        return new ch.bailu.gtk.gio.DBusInterfaceInfo(new PointerContainer(JnaGeoclue.INST().gclue_client_interface_info()));
    }

    /**
     * Overrides all &#35;GObject properties in the &#35;GClueClient interface for a concrete class.
     * <br>The properties are overridden in the order they are defined.
     * @param klass The class structure for a &#35;GObject derived class.
     * @param property_id_begin The property id to assign to the first overridden property.
     * @return The last property id.
    */
    public static int clientOverrideProperties(@Nonnull ch.bailu.gtk.gobject.ObjectClass klass, int property_id_begin)  {
        return JnaGeoclue.INST().gclue_client_override_properties(asCPointerNotNull(klass), property_id_begin);
    }

    /**
     * Gets a machine-readable description of the &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Location.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Location&lt;/link&gt; D-Bus interface.
     * @return A &#35;GDBusInterfaceInfo. Do not free.
    */
    public static ch.bailu.gtk.gio.DBusInterfaceInfo locationInterfaceInfo()  {
        return new ch.bailu.gtk.gio.DBusInterfaceInfo(new PointerContainer(JnaGeoclue.INST().gclue_location_interface_info()));
    }

    /**
     * Overrides all &#35;GObject properties in the &#35;GClueLocation interface for a concrete class.
     * <br>The properties are overridden in the order they are defined.
     * @param klass The class structure for a &#35;GObject derived class.
     * @param property_id_begin The property id to assign to the first overridden property.
     * @return The last property id.
    */
    public static int locationOverrideProperties(@Nonnull ch.bailu.gtk.gobject.ObjectClass klass, int property_id_begin)  {
        return JnaGeoclue.INST().gclue_location_override_properties(asCPointerNotNull(klass), property_id_begin);
    }

    /**
     * Gets a machine-readable description of the &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Manager.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Manager&lt;/link&gt; D-Bus interface.
     * @return A &#35;GDBusInterfaceInfo. Do not free.
    */
    public static ch.bailu.gtk.gio.DBusInterfaceInfo managerInterfaceInfo()  {
        return new ch.bailu.gtk.gio.DBusInterfaceInfo(new PointerContainer(JnaGeoclue.INST().gclue_manager_interface_info()));
    }

    /**
     * Overrides all &#35;GObject properties in the &#35;GClueManager interface for a concrete class.
     * <br>The properties are overridden in the order they are defined.
     * @param klass The class structure for a &#35;GObject derived class.
     * @param property_id_begin The property id to assign to the first overridden property.
     * @return The last property id.
    */
    public static int managerOverrideProperties(@Nonnull ch.bailu.gtk.gobject.ObjectClass klass, int property_id_begin)  {
        return JnaGeoclue.INST().gclue_manager_override_properties(asCPointerNotNull(klass), property_id_begin);
    }

}

/*
package-type
*/
