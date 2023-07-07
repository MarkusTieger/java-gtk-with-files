/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.InetSocketAddressClass.html">https://docs.gtk.org/gio/struct.InetSocketAddressClass.html</a></p>
*/
public class InetSocketAddressClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InetSocketAddressClass.class.getCanonicalName());
    }

    public InetSocketAddressClass(PointerContainer pointer) {
        super(pointer);
    }

    public InetSocketAddressClass() {
        super(cast(JnaInetSocketAddressClass.allocateStructure()));
    }

    private JnaInetSocketAddressClass.Fields _fields;
    
    JnaInetSocketAddressClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaInetSocketAddressClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(InetSocketAddress.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(InetSocketAddress.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
