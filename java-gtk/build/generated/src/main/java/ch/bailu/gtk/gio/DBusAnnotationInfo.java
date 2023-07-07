/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Information about an annotation.
 * <p><a href="https://docs.gtk.org/gio/struct.DBusAnnotationInfo.html">https://docs.gtk.org/gio/struct.DBusAnnotationInfo.html</a></p>
*/
public class DBusAnnotationInfo extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusAnnotationInfo.class.getCanonicalName());
    }

    public DBusAnnotationInfo(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDBusAnnotationInfo.Fields _fields;
    
    JnaDBusAnnotationInfo.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusAnnotationInfo.Fields(asCPointer());
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
     * The name of the annotation, e.g. &quot;org.freedesktop.DBus.Deprecated&quot;.
    */
    public static final String KEY = "key";

    /**
     * The name of the annotation, e.g. &quot;org.freedesktop.DBus.Deprecated&quot;.
    */
    public void setFieldKey(ch.bailu.gtk.type.Str key) {
        toFields().key = key.asCPointer();
        toFields().writeField(KEY);
    }

    /**
     * The name of the annotation, e.g. &quot;org.freedesktop.DBus.Deprecated&quot;.
    */
    public ch.bailu.gtk.type.Str getFieldKey() {
       toFields().readField(KEY);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().key));
    } 

    /**
     * The value of the annotation.
    */
    public static final String VALUE = "value";

    /**
     * The value of the annotation.
    */
    public void setFieldValue(ch.bailu.gtk.type.Str value) {
        toFields().value = value.asCPointer();
        toFields().writeField(VALUE);
    }

    /**
     * The value of the annotation.
    */
    public ch.bailu.gtk.type.Str getFieldValue() {
       toFields().readField(VALUE);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().value));
    } 

    /**
     * If &#64;info is statically allocated does nothing. Otherwise increases
     * <br>the reference count.
     * @return The same &#64;info.
    */
    public DBusAnnotationInfo ref()  {
        return new DBusAnnotationInfo(new PointerContainer(JnaDBusAnnotationInfo.INST().g_dbus_annotation_info_ref(asCPointer())));
    }

    /**
     * If &#64;info is statically allocated, does nothing. Otherwise decreases
     * <br>the reference count of &#64;info. When its reference count drops to 0,
     * <br>the memory used is freed.
    */
    public void unref()  {
        JnaDBusAnnotationInfo.INST().g_dbus_annotation_info_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaDBusAnnotationInfo.INST().g_dbus_annotation_info_get_type(); 
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

[FieldModel:annotations:java-type-not-supported:{G_::{c:GDBusAnnotationInfo**}}:{j:}]

[MethodModel:java-type-not-supported:lookup:[ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GDBusAnnotationInfo**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
*/
