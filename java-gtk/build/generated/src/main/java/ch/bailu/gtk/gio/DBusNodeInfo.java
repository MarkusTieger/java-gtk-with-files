/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Information about nodes in a remote object hierarchy.
 * <p><a href="https://docs.gtk.org/gio/struct.DBusNodeInfo.html">https://docs.gtk.org/gio/struct.DBusNodeInfo.html</a></p>
*/
public class DBusNodeInfo extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusNodeInfo.class.getCanonicalName());
    }

    public DBusNodeInfo(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDBusNodeInfo.Fields _fields;
    
    JnaDBusNodeInfo.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusNodeInfo.Fields(asCPointer());
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
     * The path of the node or %NULL if omitted. Note that this may be a relative path. See the D-Bus specification for more details.
    */
    public static final String PATH = "path";

    /**
     * The path of the node or %NULL if omitted. Note that this may be a relative path. See the D-Bus specification for more details.
    */
    public void setFieldPath(ch.bailu.gtk.type.Str path) {
        toFields().path = path.asCPointer();
        toFields().writeField(PATH);
    }

    /**
     * The path of the node or %NULL if omitted. Note that this may be a relative path. See the D-Bus specification for more details.
    */
    public ch.bailu.gtk.type.Str getFieldPath() {
       toFields().readField(PATH);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().path));
    } 

    /**
     * Parses &#64;xml_data and returns a &#35;GDBusNodeInfo representing the data.
     * <br>
     * <br>The introspection XML must contain exactly one top-level
     * <br>&lt;node&gt; element.
     * <br>
     * <br>Note that this routine is using a
     * <br>[GMarkup][glib-Simple-XML-Subset-Parser.description]-based
     * <br>parser that only accepts a subset of valid XML documents.
     * @param xml_data Valid D-Bus introspection XML.
     * @return A &#35;GDBusNodeInfo structure or %NULL if &#64;error is set. Free with g_dbus_node_info_unref().
    */
    public static DBusNodeInfo newForXmlDBusNodeInfo(@Nonnull ch.bailu.gtk.type.Str xml_data) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusNodeInfo.INST().g_dbus_node_info_new_for_xml(asCPointerNotNull(xml_data), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusNodeInfo:newForXml");
        }
        return new DBusNodeInfo(__self);
    }        
    

    /**
     * Parses &#64;xml_data and returns a &#35;GDBusNodeInfo representing the data.
     * <br>
     * <br>The introspection XML must contain exactly one top-level
     * <br>&lt;node&gt; element.
     * <br>
     * <br>Note that this routine is using a
     * <br>[GMarkup][glib-Simple-XML-Subset-Parser.description]-based
     * <br>parser that only accepts a subset of valid XML documents.
     * @param xml_data Valid D-Bus introspection XML.
     * @return A &#35;GDBusNodeInfo structure or %NULL if &#64;error is set. Free with g_dbus_node_info_unref().
    */
    public static DBusNodeInfo newForXmlDBusNodeInfo(String xml_data) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaDBusNodeInfo.INST().g_dbus_node_info_new_for_xml(xml_data, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("DBusNodeInfo:newForXml");
        }
        return new DBusNodeInfo(__self);
    }        
    

    /**
     * Appends an XML representation of &#64;info (and its children) to &#64;string_builder.
     * <br>
     * <br>This function is typically used for generating introspection XML documents at run-time for
     * <br>handling the `org.freedesktop.DBus.Introspectable.Introspect`  method.
     * @param indent Indentation level.
     * @param string_builder A &#35;GString to to append XML data to.
    */
    public void generateXml(int indent, @Nonnull ch.bailu.gtk.glib.GString string_builder)  {
        JnaDBusNodeInfo.INST().g_dbus_node_info_generate_xml(asCPointer(), indent, asCPointerNotNull(string_builder));
    }

    /**
     * Looks up information about an interface.
     * <br>
     * <br>The cost of this function is O(n) in number of interfaces.
     * @param name A D-Bus interface name.
     * @return A &#35;GDBusInterfaceInfo or %NULL if not found. Do not free, it is owned by &#64;info.
    */
    public DBusInterfaceInfo lookupInterface(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new DBusInterfaceInfo(new PointerContainer(JnaDBusNodeInfo.INST().g_dbus_node_info_lookup_interface(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Looks up information about an interface.
     * <br>
     * <br>The cost of this function is O(n) in number of interfaces.
     * @param name A D-Bus interface name.
     * @return A &#35;GDBusInterfaceInfo or %NULL if not found. Do not free, it is owned by &#64;info.
    */
    public DBusInterfaceInfo lookupInterface(String name)  {
        return new DBusInterfaceInfo(new PointerContainer(JnaDBusNodeInfo.INST().g_dbus_node_info_lookup_interface(asCPointer(), name)));
    }

    /**
     * If &#64;info is statically allocated does nothing. Otherwise increases
     * <br>the reference count.
     * @return The same &#64;info.
    */
    public DBusNodeInfo ref()  {
        return new DBusNodeInfo(new PointerContainer(JnaDBusNodeInfo.INST().g_dbus_node_info_ref(asCPointer())));
    }

    /**
     * If &#64;info is statically allocated, does nothing. Otherwise decreases
     * <br>the reference count of &#64;info. When its reference count drops to 0,
     * <br>the memory used is freed.
    */
    public void unref()  {
        JnaDBusNodeInfo.INST().g_dbus_node_info_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaDBusNodeInfo.INST().g_dbus_node_info_get_type(); 
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

[FieldModel:interfaces:java-type-not-supported:{G_::{c:GDBusInterfaceInfo**}}:{j:}]

[FieldModel:nodes:java-type-not-supported:previous-field-unsupported:{G_::{c:GDBusNodeInfo**}}:{j:}]

[FieldModel:annotations:java-type-not-supported:previous-field-unsupported:{G_::{c:GDBusAnnotationInfo**}}:{j:}]
*/
