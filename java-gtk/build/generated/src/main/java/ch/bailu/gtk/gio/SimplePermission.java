/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GSimplePermission is a trivial implementation of &#35;GPermission that
 * <br>represents a permission that is either always or never allowed.  The
 * <br>value is given at construction and doesn't change.
 * <br>
 * <br>Calling request or release will result in errors.
 * <p><a href="https://docs.gtk.org/gio/class.SimplePermission.html">https://docs.gtk.org/gio/class.SimplePermission.html</a></p>
*/
public class SimplePermission extends Permission {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SimplePermission.class.getCanonicalName());
    }

    public SimplePermission(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GPermission instance that represents an action that is
     * <br>either always or never allowed.
     * @param allowed %TRUE if the action is allowed
    */
    public SimplePermission(boolean allowed) {
        super(cast(JnaSimplePermission.INST().g_simple_permission_new(allowed)));
    }

    public static long getTypeID() { 
        return JnaSimplePermission.INST().g_simple_permission_get_type(); 
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
