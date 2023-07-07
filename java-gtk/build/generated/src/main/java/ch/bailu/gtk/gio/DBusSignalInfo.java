/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Information about a signal on a D-Bus interface.
 * <p><a href="https://docs.gtk.org/gio/struct.DBusSignalInfo.html">https://docs.gtk.org/gio/struct.DBusSignalInfo.html</a></p>
*/
public class DBusSignalInfo extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusSignalInfo.class.getCanonicalName());
    }

    public DBusSignalInfo(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDBusSignalInfo.Fields _fields;
    
    JnaDBusSignalInfo.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusSignalInfo.Fields(asCPointer());
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
     * The name of the D-Bus signal, e.g. &quot;NameOwnerChanged&quot;.
    */
    public static final String NAME = "name";

    /**
     * The name of the D-Bus signal, e.g. &quot;NameOwnerChanged&quot;.
    */
    public void setFieldName(ch.bailu.gtk.type.Str name) {
        toFields().name = name.asCPointer();
        toFields().writeField(NAME);
    }

    /**
     * The name of the D-Bus signal, e.g. &quot;NameOwnerChanged&quot;.
    */
    public ch.bailu.gtk.type.Str getFieldName() {
       toFields().readField(NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().name));
    } 

    /**
     * If &#64;info is statically allocated does nothing. Otherwise increases
     * <br>the reference count.
     * @return The same &#64;info.
    */
    public DBusSignalInfo ref()  {
        return new DBusSignalInfo(new PointerContainer(JnaDBusSignalInfo.INST().g_dbus_signal_info_ref(asCPointer())));
    }

    /**
     * If &#64;info is statically allocated, does nothing. Otherwise decreases
     * <br>the reference count of &#64;info. When its reference count drops to 0,
     * <br>the memory used is freed.
    */
    public void unref()  {
        JnaDBusSignalInfo.INST().g_dbus_signal_info_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaDBusSignalInfo.INST().g_dbus_signal_info_get_type(); 
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

[FieldModel:args:java-type-not-supported:{G_::{c:GDBusArgInfo**}}:{j:}]

[FieldModel:annotations:java-type-not-supported:previous-field-unsupported:{G_::{c:GDBusAnnotationInfo**}}:{j:}]
*/
