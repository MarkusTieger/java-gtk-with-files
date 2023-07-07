/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Represents a value [class&#64;Animation] can animate.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.AnimationTarget.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.AnimationTarget.html</a></p>
*/
public class AnimationTarget extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AnimationTarget.class.getCanonicalName());
    }

    public AnimationTarget(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaAnimationTarget.INST().adw_animation_target_get_type(); 
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
