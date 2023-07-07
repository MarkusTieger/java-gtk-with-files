/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GParamSpec derived structure that contains the meta data for integer properties.
 * <p><a href="https://docs.gtk.org/gobject/class.ParamSpecInt.html">https://docs.gtk.org/gobject/class.ParamSpecInt.html</a></p>
*/
public class ParamSpecInt extends ParamSpec {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ParamSpecInt.class.getCanonicalName());
    }

    public ParamSpecInt(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaParamSpecInt.INST().intern(); 
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
