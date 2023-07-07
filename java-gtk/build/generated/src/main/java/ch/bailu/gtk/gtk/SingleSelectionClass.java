/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.SingleSelectionClass.html">https://docs.gtk.org/gtk4/struct.SingleSelectionClass.html</a></p>
*/
public class SingleSelectionClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SingleSelectionClass.class.getCanonicalName());
    }

    public SingleSelectionClass(PointerContainer pointer) {
        super(pointer);
    }

    public SingleSelectionClass() {
        super(cast(JnaSingleSelectionClass.allocateStructure()));
    }

    private JnaSingleSelectionClass.Fields _fields;
    
    JnaSingleSelectionClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSingleSelectionClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SingleSelection.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SingleSelection.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
