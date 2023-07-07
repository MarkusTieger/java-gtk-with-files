/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GParamSpec derived structure that contains the meta data for %G_TYPE_PARAM
 * <br>properties.
 * <p><a href="https://docs.gtk.org/gobject/class.ParamSpecParam.html">https://docs.gtk.org/gobject/class.ParamSpecParam.html</a></p>
*/
public class ParamSpecParam extends ParamSpec {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ParamSpecParam.class.getCanonicalName());
    }

    public ParamSpecParam(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaParamSpecParam.INST().intern(); 
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
