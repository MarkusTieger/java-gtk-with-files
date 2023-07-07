/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.InscriptionClass.html">https://docs.gtk.org/gtk4/struct.InscriptionClass.html</a></p>
*/
public class InscriptionClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InscriptionClass.class.getCanonicalName());
    }

    public InscriptionClass(PointerContainer pointer) {
        super(pointer);
    }

    public InscriptionClass() {
        super(cast(JnaInscriptionClass.allocateStructure()));
    }

    private JnaInscriptionClass.Fields _fields;
    
    JnaInscriptionClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaInscriptionClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Inscription.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Inscription.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
