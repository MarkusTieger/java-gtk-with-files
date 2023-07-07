/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.CharsetConverterClass.html">https://docs.gtk.org/gio/struct.CharsetConverterClass.html</a></p>
*/
public class CharsetConverterClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CharsetConverterClass.class.getCanonicalName());
    }

    public CharsetConverterClass(PointerContainer pointer) {
        super(pointer);
    }

    public CharsetConverterClass() {
        super(cast(JnaCharsetConverterClass.allocateStructure()));
    }

    private JnaCharsetConverterClass.Fields _fields;
    
    JnaCharsetConverterClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaCharsetConverterClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CharsetConverter.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(CharsetConverter.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
