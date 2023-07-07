/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GParamSpec derived structure that contains the meta data for object properties.
 * <p><a href="https://docs.gtk.org/gobject/class.ParamSpecObject.html">https://docs.gtk.org/gobject/class.ParamSpecObject.html</a></p>
*/
public class ParamSpecObject extends ParamSpec {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ParamSpecObject.class.getCanonicalName());
    }

    public ParamSpecObject(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaParamSpecObject.INST().intern(); 
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
