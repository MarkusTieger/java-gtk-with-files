/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for &#35;GDBusProxy.
 * <p><a href="https://docs.gtk.org/gio/struct.DBusProxyClass.html">https://docs.gtk.org/gio/struct.DBusProxyClass.html</a></p>
*/
public class DBusProxyClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DBusProxyClass.class.getCanonicalName());
    }

    public DBusProxyClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaDBusProxyClass.Fields _fields;
    
    JnaDBusProxyClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaDBusProxyClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusProxy.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(DBusProxy.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:g_properties_changed:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:g_signal:previous-field-unsupported:[MethodModel:Supported:gSignal:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:DBusProxy:{c:GDBusProxy*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]]

[MethodModel:Supported:gSignal:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:DBusProxy:{c:GDBusProxy*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Variant:{c:GVariant*}}:{j:long}]

[FieldModel:padding:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
