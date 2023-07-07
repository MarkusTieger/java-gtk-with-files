/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for &#35;GProxyAddress.
 * <p><a href="https://docs.gtk.org/gio/struct.ProxyAddressClass.html">https://docs.gtk.org/gio/struct.ProxyAddressClass.html</a></p>
*/
public class ProxyAddressClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ProxyAddressClass.class.getCanonicalName());
    }

    public ProxyAddressClass(PointerContainer pointer) {
        super(pointer);
    }

    public ProxyAddressClass() {
        super(cast(JnaProxyAddressClass.allocateStructure()));
    }

    private JnaProxyAddressClass.Fields _fields;
    
    JnaProxyAddressClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaProxyAddressClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ProxyAddress.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ProxyAddress.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
