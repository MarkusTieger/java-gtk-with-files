/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.MultiSorterClass.html">https://docs.gtk.org/gtk4/struct.MultiSorterClass.html</a></p>
*/
public class MultiSorterClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MultiSorterClass.class.getCanonicalName());
    }

    public MultiSorterClass(PointerContainer pointer) {
        super(pointer);
    }

    public MultiSorterClass() {
        super(cast(JnaMultiSorterClass.allocateStructure()));
    }

    private JnaMultiSorterClass.Fields _fields;
    
    JnaMultiSorterClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaMultiSorterClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MultiSorter.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(MultiSorter.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
