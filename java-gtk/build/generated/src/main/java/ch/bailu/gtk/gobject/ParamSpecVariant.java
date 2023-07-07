/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GParamSpec derived structure that contains the meta data for &#35;GVariant properties.
 * <br>
 * <br>When comparing values with g_param_values_cmp(), scalar values with the same
 * <br>type will be compared with g_variant_compare(). Other non-%NULL variants will
 * <br>be checked for equality with g_variant_equal(), and their sort order is
 * <br>otherwise undefined. %NULL is ordered before non-%NULL variants. Two %NULL
 * <br>values compare equal.
 * <p><a href="https://docs.gtk.org/gobject/class.ParamSpecVariant.html">https://docs.gtk.org/gobject/class.ParamSpecVariant.html</a></p>
*/
public class ParamSpecVariant extends ParamSpec {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ParamSpecVariant.class.getCanonicalName());
    }

    public ParamSpecVariant(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaParamSpecVariant.INST().intern(); 
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

[FieldModel:padding:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
