/* this file is machine generated */
package ch.bailu.gtk.gobject;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A &#35;GParamSpec derived structure that redirects operations to
 * <br>other types of &#35;GParamSpec.
 * <br>
 * <br>All operations other than getting or setting the value are redirected,
 * <br>including accessing the nick and blurb, validating a value, and so
 * <br>forth.
 * <br>
 * <br>See g_param_spec_get_redirect_target() for retrieving the overridden
 * <br>property. &#35;GParamSpecOverride is used in implementing
 * <br>g_object_class_override_property(), and will not be directly useful
 * <br>unless you are implementing a new base type similar to GObject.
 * <p><a href="https://docs.gtk.org/gobject/class.ParamSpecOverride.html">https://docs.gtk.org/gobject/class.ParamSpecOverride.html</a></p>
*/
public class ParamSpecOverride extends ParamSpec {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ParamSpecOverride.class.getCanonicalName());
    }

    public ParamSpecOverride(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaParamSpecOverride.INST().intern(); 
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
