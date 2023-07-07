/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An [class&#64;AnimationTarget] changing the value of a property of a
 * <br>[class&#64;GObject.Object] instance.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.PropertyAnimationTarget.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.PropertyAnimationTarget.html</a></p>
*/
public class PropertyAnimationTarget extends AnimationTarget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PropertyAnimationTarget.class.getCanonicalName());
    }

    public PropertyAnimationTarget(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwPropertyAnimationTarget` for the &#64;pspec property on
     * <br>&#64;object.
     * @param object an object to be animated
     * @param pspec the param spec of the property on &#64;object to animate
     * @return new newly created `AdwPropertyAnimationTarget`
    */
    public static PropertyAnimationTarget newForPspecPropertyAnimationTarget(@Nonnull ch.bailu.gtk.gobject.Object object, @Nonnull ch.bailu.gtk.gobject.ParamSpec pspec)  {
        PointerContainer __self = cast(JnaPropertyAnimationTarget.INST().adw_property_animation_target_new_for_pspec(asCPointerNotNull(object), asCPointerNotNull(pspec)));
        if (__self.isNull()) {
            throw new NullPointerException("PropertyAnimationTarget:newForPspec");
        }
        return new PropertyAnimationTarget(__self);
    }        
    

    /**
     * Creates a new `AdwPropertyAnimationTarget` for the &#64;property_name property on
     * <br>&#64;object.
     * @param object an object to be animated
     * @param property_name the name of the property on &#64;object to animate
    */
    public PropertyAnimationTarget(@Nonnull ch.bailu.gtk.gobject.Object object, @Nonnull ch.bailu.gtk.type.Str property_name) {
        super(cast(JnaPropertyAnimationTarget.INST().adw_property_animation_target_new(asCPointerNotNull(object), asCPointerNotNull(property_name))));
    }

    /**
     * Creates a new `AdwPropertyAnimationTarget` for the &#64;property_name property on
     * <br>&#64;object.
     * @param object an object to be animated
     * @param property_name the name of the property on &#64;object to animate
    */
    public PropertyAnimationTarget(@Nonnull ch.bailu.gtk.gobject.Object object, String property_name) {
        super(cast(JnaPropertyAnimationTarget.INST().adw_property_animation_target_new(asCPointerNotNull(object), property_name)));
    }

    /**
     * Gets the object animated by &#64;self.
     * <br>
     * <br>The `AdwPropertyAnimationTarget` instance does not hold a strong reference on
     * <br>the object; make sure the object is kept alive throughout the target's
     * <br>lifetime.
     * @return the animated object
    */
    public ch.bailu.gtk.gobject.Object getObject()  {
        return new ch.bailu.gtk.gobject.Object(new PointerContainer(JnaPropertyAnimationTarget.INST().adw_property_animation_target_get_object(asCPointer())));
    }

    /**
     * Gets the `GParamSpec` of the property animated by &#64;self.
     * @return the animated property's `GParamSpec`
    */
    public ch.bailu.gtk.gobject.ParamSpec getPspec()  {
        return new ch.bailu.gtk.gobject.ParamSpec(new PointerContainer(JnaPropertyAnimationTarget.INST().adw_property_animation_target_get_pspec(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaPropertyAnimationTarget.INST().adw_property_animation_target_get_type(); 
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
