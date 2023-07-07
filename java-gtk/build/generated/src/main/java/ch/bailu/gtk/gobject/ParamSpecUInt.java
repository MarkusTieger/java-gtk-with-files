/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GParamSpec derived structure that contains the meta data for unsigned integer properties.
 * <p><a href="https://docs.gtk.org/gobject/class.ParamSpecUInt.html">https://docs.gtk.org/gobject/class.ParamSpecUInt.html</a></p>
*/
public class ParamSpecUInt extends ParamSpec {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ParamSpecUInt.class.getCanonicalName());
    }

    public ParamSpecUInt(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaParamSpecUInt.INST().intern(); 
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
*/
