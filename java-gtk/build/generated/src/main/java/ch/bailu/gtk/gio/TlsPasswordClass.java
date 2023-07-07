/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for &#35;GTlsPassword.
 * <p><a href="https://docs.gtk.org/gio/struct.TlsPasswordClass.html">https://docs.gtk.org/gio/struct.TlsPasswordClass.html</a></p>
*/
public class TlsPasswordClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TlsPasswordClass.class.getCanonicalName());
    }

    public TlsPasswordClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaTlsPasswordClass.Fields _fields;
    
    JnaTlsPasswordClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTlsPasswordClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsPassword.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TlsPassword.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:get_value:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:set_value:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:get_default_warning:previous-field-unsupported:[MethodModel:Supported:getDefaultWarning:[ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:TlsPassword:{c:GTlsPassword*}}:{j:long}]]

[MethodModel:Supported:getDefaultWarning:[ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:TlsPassword:{c:GTlsPassword*}}:{j:long}]

[FieldModel:padding:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
