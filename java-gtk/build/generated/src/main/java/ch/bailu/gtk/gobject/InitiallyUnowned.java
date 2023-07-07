/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A type for objects that have an initially floating reference.
 * <br>
 * <br>All the fields in the `GInitiallyUnowned` structure are private to the
 * <br>implementation and should never be accessed directly.
 * <p><a href="https://docs.gtk.org/gobject/class.InitiallyUnowned.html">https://docs.gtk.org/gobject/class.InitiallyUnowned.html</a></p>
*/
public class InitiallyUnowned extends Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(InitiallyUnowned.class.getCanonicalName());
    }

    public InitiallyUnowned(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaInitiallyUnowned.INST().g_initially_unowned_get_type(); 
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
class-type

[FieldModel:g_type_instance:direct-type:{Gg:TypeInstance:{c:GTypeInstance}}:{j:long}]

[FieldModel:ref_count:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:qdata:previous-field-unsupported:{Gg:Data:{c:GData*}}:{j:long}]
*/
