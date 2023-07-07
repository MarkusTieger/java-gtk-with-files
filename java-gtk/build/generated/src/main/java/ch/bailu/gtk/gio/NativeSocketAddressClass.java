/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.NativeSocketAddressClass.html">https://docs.gtk.org/gio/struct.NativeSocketAddressClass.html</a></p>
*/
public class NativeSocketAddressClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NativeSocketAddressClass.class.getCanonicalName());
    }

    public NativeSocketAddressClass(PointerContainer pointer) {
        super(pointer);
    }

    public NativeSocketAddressClass() {
        super(cast(JnaNativeSocketAddressClass.allocateStructure()));
    }

    private JnaNativeSocketAddressClass.Fields _fields;
    
    JnaNativeSocketAddressClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaNativeSocketAddressClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(NativeSocketAddress.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(NativeSocketAddress.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
