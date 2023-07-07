/* this file is machine generated */
package ch.bailu.gtk.geoclue;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Abstract interface type for the D-Bus interface &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Location.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Location&lt;/link&gt;.
 * <p><a href="https://www.freedesktop.org/software/geoclue/docs/libgeoclue/">https://www.freedesktop.org/software/geoclue/docs/libgeoclue/</a></p>
*/
public class Location extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Location.class.getCanonicalName());
    }

    public Location(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets a copy of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Description&quot;&gt;&quot;Description&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value or %NULL if the property is not set. The returned value should be freed with g_free().
    */
    public ch.bailu.gtk.type.Str dupDescription()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaLocation.INST().gclue_location_dup_description(asCPointer())));
    }

    /**
     * Gets a copy of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Timestamp&quot;&gt;&quot;Timestamp&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value or %NULL if the property is not set. The returned value should be freed with g_variant_unref().
    */
    public ch.bailu.gtk.glib.Variant dupTimestamp()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaLocation.INST().gclue_location_dup_timestamp(asCPointer())));
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Accuracy&quot;&gt;&quot;Accuracy&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value.
    */
    public double getAccuracy()  {
        return JnaLocation.INST().gclue_location_get_accuracy(asCPointer());
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Altitude&quot;&gt;&quot;Altitude&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value.
    */
    public double getAltitude()  {
        return JnaLocation.INST().gclue_location_get_altitude(asCPointer());
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Description&quot;&gt;&quot;Description&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * <br>
     * <br>The returned value is only valid until the property changes so on the client-side it is only safe to use this function on the thread where &#64;object was constructed. Use gclue_location_dup_description() if on another thread.
     * @return The property value or %NULL if the property is not set. Do not free the returned value, it belongs to &#64;object.
    */
    public ch.bailu.gtk.type.Str getDescription()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaLocation.INST().gclue_location_get_description(asCPointer())));
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Heading&quot;&gt;&quot;Heading&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value.
    */
    public double getHeading()  {
        return JnaLocation.INST().gclue_location_get_heading(asCPointer());
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Latitude&quot;&gt;&quot;Latitude&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value.
    */
    public double getLatitude()  {
        return JnaLocation.INST().gclue_location_get_latitude(asCPointer());
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Longitude&quot;&gt;&quot;Longitude&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value.
    */
    public double getLongitude()  {
        return JnaLocation.INST().gclue_location_get_longitude(asCPointer());
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Speed&quot;&gt;&quot;Speed&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * @return The property value.
    */
    public double getSpeed()  {
        return JnaLocation.INST().gclue_location_get_speed(asCPointer());
    }

    /**
     * Gets the value of the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Timestamp&quot;&gt;&quot;Timestamp&quot;&lt;/link&gt; D-Bus property.
     * <br>
     * <br>Since this D-Bus property is readable, it is meaningful to use this function on both the client- and service-side.
     * <br>
     * <br>The returned value is only valid until the property changes so on the client-side it is only safe to use this function on the thread where &#64;object was constructed. Use gclue_location_dup_timestamp() if on another thread.
     * @return The property value or %NULL if the property is not set. Do not free the returned value, it belongs to &#64;object.
    */
    public ch.bailu.gtk.glib.Variant getTimestamp()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaLocation.INST().gclue_location_get_timestamp(asCPointer())));
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Accuracy&quot;&gt;&quot;Accuracy&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setAccuracy(double value)  {
        JnaLocation.INST().gclue_location_set_accuracy(asCPointer(), value);
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Altitude&quot;&gt;&quot;Altitude&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setAltitude(double value)  {
        JnaLocation.INST().gclue_location_set_altitude(asCPointer(), value);
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Description&quot;&gt;&quot;Description&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setDescription(@Nonnull ch.bailu.gtk.type.Str value)  {
        JnaLocation.INST().gclue_location_set_description(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Description&quot;&gt;&quot;Description&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setDescription(String value)  {
        JnaLocation.INST().gclue_location_set_description(asCPointer(), value);
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Heading&quot;&gt;&quot;Heading&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setHeading(double value)  {
        JnaLocation.INST().gclue_location_set_heading(asCPointer(), value);
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Latitude&quot;&gt;&quot;Latitude&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setLatitude(double value)  {
        JnaLocation.INST().gclue_location_set_latitude(asCPointer(), value);
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Longitude&quot;&gt;&quot;Longitude&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setLongitude(double value)  {
        JnaLocation.INST().gclue_location_set_longitude(asCPointer(), value);
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Speed&quot;&gt;&quot;Speed&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setSpeed(double value)  {
        JnaLocation.INST().gclue_location_set_speed(asCPointer(), value);
    }

    /**
     * Sets the &lt;link linkend=&quot;gdbus-property-org-freedesktop-GeoClue2-Location.Timestamp&quot;&gt;&quot;Timestamp&quot;&lt;/link&gt; D-Bus property to &#64;value.
     * <br>
     * <br>Since this D-Bus property is not writable, it is only meaningful to use this function on the service-side.
     * @param value The value to set.
    */
    public void setTimestamp(@Nonnull ch.bailu.gtk.glib.Variant value)  {
        JnaLocation.INST().gclue_location_set_timestamp(asCPointer(), asCPointerNotNull(value));
    }

    /**
     * Gets a machine-readable description of the &lt;link linkend=&quot;gdbus-interface-org-freedesktop-GeoClue2-Location.top_of_page&quot;&gt;org.freedesktop.GeoClue2.Location&lt;/link&gt; D-Bus interface.
     * @return A &#35;GDBusInterfaceInfo. Do not free.
    */
    public static ch.bailu.gtk.gio.DBusInterfaceInfo interfaceInfo()  {
        return new ch.bailu.gtk.gio.DBusInterfaceInfo(new PointerContainer(JnaLocation.INST().gclue_location_interface_info()));
    }

    /**
     * Overrides all &#35;GObject properties in the &#35;GClueLocation interface for a concrete class.
     * <br>The properties are overridden in the order they are defined.
     * @param klass The class structure for a &#35;GObject derived class.
     * @param property_id_begin The property id to assign to the first overridden property.
     * @return The last property id.
    */
    public static int overrideProperties(@Nonnull ch.bailu.gtk.gobject.ObjectClass klass, int property_id_begin)  {
        return JnaLocation.INST().gclue_location_override_properties(asCPointerNotNull(klass), property_id_begin);
    }

    public static long getTypeID() { 
        return JnaLocation.INST().gclue_location_get_type(); 
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
