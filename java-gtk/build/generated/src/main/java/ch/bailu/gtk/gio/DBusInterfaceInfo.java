/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Information about a D-Bus interface.
 * <p><a href="https://docs.gtk.org/gio/struct.DBusInterfaceInfo.html">https://docs.gtk.org/gio/struct.DBusInterfaceInfo.html</a></p>
*/
public class DBusInterfaceInfo extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusInterfaceInfo.class.getCanonicalName());
    }

    public DBusInterfaceInfo(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDBusInterfaceInfo.Fields _fields;
    
    JnaDBusInterfaceInfo.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusInterfaceInfo.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The reference count or -1 if statically allocated.
    */
    public static final String REF_COUNT = "ref_count";

    /**
     * The reference count or -1 if statically allocated.
    */
    public void setFieldRefCount(int ref_count) {
        toFields().ref_count = ref_count;
        toFields().writeField(REF_COUNT);
    }

    /**
     * The reference count or -1 if statically allocated.
    */
    public int getFieldRefCount() {
       toFields().readField(REF_COUNT);
       return toFields().ref_count;
    } 

    /**
     * The name of the D-Bus interface, e.g. &quot;org.freedesktop.DBus.Properties&quot;.
    */
    public static final String NAME = "name";

    /**
     * The name of the D-Bus interface, e.g. &quot;org.freedesktop.DBus.Properties&quot;.
    */
    public void setFieldName(ch.bailu.gtk.type.Str name) {
        toFields().name = name.asCPointer();
        toFields().writeField(NAME);
    }

    /**
     * The name of the D-Bus interface, e.g. &quot;org.freedesktop.DBus.Properties&quot;.
    */
    public ch.bailu.gtk.type.Str getFieldName() {
       toFields().readField(NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().name));
    } 

    /**
     * Builds a lookup-cache to speed up
     * <br>g_dbus_interface_info_lookup_method(),
     * <br>g_dbus_interface_info_lookup_signal() and
     * <br>g_dbus_interface_info_lookup_property().
     * <br>
     * <br>If this has already been called with &#64;info, the existing cache is
     * <br>used and its use count is increased.
     * <br>
     * <br>Note that &#64;info cannot be modified until
     * <br>g_dbus_interface_info_cache_release() is called.
    */
    public void cacheBuild()  {
        JnaDBusInterfaceInfo.INST().g_dbus_interface_info_cache_build(asCPointer());
    }

    /**
     * Decrements the usage count for the cache for &#64;info built by
     * <br>g_dbus_interface_info_cache_build() (if any) and frees the
     * <br>resources used by the cache if the usage count drops to zero.
    */
    public void cacheRelease()  {
        JnaDBusInterfaceInfo.INST().g_dbus_interface_info_cache_release(asCPointer());
    }

    /**
     * Appends an XML representation of &#64;info (and its children) to &#64;string_builder.
     * <br>
     * <br>This function is typically used for generating introspection XML
     * <br>documents at run-time for handling the
     * <br>`org.freedesktop.DBus.Introspectable.Introspect`
     * <br>method.
     * @param indent Indentation level.
     * @param string_builder A &#35;GString to to append XML data to.
    */
    public void generateXml(int indent, @Nonnull ch.bailu.gtk.glib.GString string_builder)  {
        JnaDBusInterfaceInfo.INST().g_dbus_interface_info_generate_xml(asCPointer(), indent, asCPointerNotNull(string_builder));
    }

    /**
     * Looks up information about a method.
     * <br>
     * <br>The cost of this function is O(n) in number of methods unless
     * <br>g_dbus_interface_info_cache_build() has been used on &#64;info.
     * @param name A D-Bus method name (typically in CamelCase)
     * @return A &#35;GDBusMethodInfo or %NULL if not found. Do not free, it is owned by &#64;info.
    */
    public DBusMethodInfo lookupMethod(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new DBusMethodInfo(new PointerContainer(JnaDBusInterfaceInfo.INST().g_dbus_interface_info_lookup_method(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Looks up information about a method.
     * <br>
     * <br>The cost of this function is O(n) in number of methods unless
     * <br>g_dbus_interface_info_cache_build() has been used on &#64;info.
     * @param name A D-Bus method name (typically in CamelCase)
     * @return A &#35;GDBusMethodInfo or %NULL if not found. Do not free, it is owned by &#64;info.
    */
    public DBusMethodInfo lookupMethod(String name)  {
        return new DBusMethodInfo(new PointerContainer(JnaDBusInterfaceInfo.INST().g_dbus_interface_info_lookup_method(asCPointer(), name)));
    }

    /**
     * Looks up information about a property.
     * <br>
     * <br>The cost of this function is O(n) in number of properties unless
     * <br>g_dbus_interface_info_cache_build() has been used on &#64;info.
     * @param name A D-Bus property name (typically in CamelCase).
     * @return A &#35;GDBusPropertyInfo or %NULL if not found. Do not free, it is owned by &#64;info.
    */
    public DBusPropertyInfo lookupProperty(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new DBusPropertyInfo(new PointerContainer(JnaDBusInterfaceInfo.INST().g_dbus_interface_info_lookup_property(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Looks up information about a property.
     * <br>
     * <br>The cost of this function is O(n) in number of properties unless
     * <br>g_dbus_interface_info_cache_build() has been used on &#64;info.
     * @param name A D-Bus property name (typically in CamelCase).
     * @return A &#35;GDBusPropertyInfo or %NULL if not found. Do not free, it is owned by &#64;info.
    */
    public DBusPropertyInfo lookupProperty(String name)  {
        return new DBusPropertyInfo(new PointerContainer(JnaDBusInterfaceInfo.INST().g_dbus_interface_info_lookup_property(asCPointer(), name)));
    }

    /**
     * Looks up information about a signal.
     * <br>
     * <br>The cost of this function is O(n) in number of signals unless
     * <br>g_dbus_interface_info_cache_build() has been used on &#64;info.
     * @param name A D-Bus signal name (typically in CamelCase)
     * @return A &#35;GDBusSignalInfo or %NULL if not found. Do not free, it is owned by &#64;info.
    */
    public DBusSignalInfo lookupSignal(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new DBusSignalInfo(new PointerContainer(JnaDBusInterfaceInfo.INST().g_dbus_interface_info_lookup_signal(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Looks up information about a signal.
     * <br>
     * <br>The cost of this function is O(n) in number of signals unless
     * <br>g_dbus_interface_info_cache_build() has been used on &#64;info.
     * @param name A D-Bus signal name (typically in CamelCase)
     * @return A &#35;GDBusSignalInfo or %NULL if not found. Do not free, it is owned by &#64;info.
    */
    public DBusSignalInfo lookupSignal(String name)  {
        return new DBusSignalInfo(new PointerContainer(JnaDBusInterfaceInfo.INST().g_dbus_interface_info_lookup_signal(asCPointer(), name)));
    }

    /**
     * If &#64;info is statically allocated does nothing. Otherwise increases
     * <br>the reference count.
     * @return The same &#64;info.
    */
    public DBusInterfaceInfo ref()  {
        return new DBusInterfaceInfo(new PointerContainer(JnaDBusInterfaceInfo.INST().g_dbus_interface_info_ref(asCPointer())));
    }

    /**
     * If &#64;info is statically allocated, does nothing. Otherwise decreases
     * <br>the reference count of &#64;info. When its reference count drops to 0,
     * <br>the memory used is freed.
    */
    public void unref()  {
        JnaDBusInterfaceInfo.INST().g_dbus_interface_info_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaDBusInterfaceInfo.INST().g_dbus_interface_info_get_type(); 
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
record-type
some-fields-unsupported

[FieldModel:methods:java-type-not-supported:{G_::{c:GDBusMethodInfo**}}:{j:}]

[FieldModel:signals:java-type-not-supported:previous-field-unsupported:{G_::{c:GDBusSignalInfo**}}:{j:}]

[FieldModel:properties:java-type-not-supported:previous-field-unsupported:{G_::{c:GDBusPropertyInfo**}}:{j:}]

[FieldModel:annotations:java-type-not-supported:previous-field-unsupported:{G_::{c:GDBusAnnotationInfo**}}:{j:}]
*/
