/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Physical parameters of a spring for [class&#64;SpringAnimation].
 * <br>
 * <br>Any spring can be described by three parameters: mass, stiffness and damping.
 * <br>
 * <br>An undamped spring will produce an oscillatory motion which will go on
 * <br>forever.
 * <br>
 * <br>The frequency and amplitude of the oscillations will be determined by the
 * <br>stiffness (how &quot;strong&quot; the spring is) and its mass (how much &quot;inertia&quot; it
 * <br>has).
 * <br>
 * <br>If damping is larger than 0, the amplitude of that oscillating motion will
 * <br>exponientally decrease over time. If that damping is strong enough that the
 * <br>spring can't complete a full oscillation, it's called an overdamped spring.
 * <br>
 * <br>If we the spring can oscillate, it's called an underdamped spring.
 * <br>
 * <br>The value between these two behaviors is called critical damping; a
 * <br>critically damped spring will comes to rest in the minimum possible time
 * <br>without producing oscillations.
 * <br>
 * <br>The damping can be replaced by damping ratio, which produces the following
 * <br>springs:
 * <br>
 * <br>* 0: an undamped spring.
 * <br>* Between 0 and 1: an underdamped spring.
 * <br>* 1: a critically damped spring.
 * <br>* Larger than 1: an overdamped spring.
 * <br>
 * <br>As such
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.SpringParams.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/struct.SpringParams.html</a></p>
*/
public class SpringParams extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SpringParams.class.getCanonicalName());
    }

    public SpringParams(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwSpringParams` from &#64;mass, &#64;stiffness and &#64;damping.
     * <br>
     * <br>See [ctor&#64;SpringParams.new] for a simplified constructor using damping ratio
     * <br>instead of &#64;damping.
     * @param damping the damping of the spring
     * @param mass the mass of the spring
     * @param stiffness the stiffness of the spring
     * @return the newly created spring parameters
    */
    public static SpringParams newFullSpringParams(double damping, double mass, double stiffness)  {
        PointerContainer __self = cast(JnaSpringParams.INST().adw_spring_params_new_full(damping, mass, stiffness));
        if (__self.isNull()) {
            throw new NullPointerException("SpringParams:newFull");
        }
        return new SpringParams(__self);
    }        
    

    /**
     * Creates a new `AdwSpringParams` from &#64;mass, &#64;stiffness and &#64;damping_ratio.
     * <br>
     * <br>The damping value is calculated from &#64;damping_ratio and the other two
     * <br>parameters.
     * <br>
     * <br>* If &#64;damping_ratio is 0, the spring will not be damped and will oscillate
     * <br>  endlessly.
     * <br>* If &#64;damping_ratio is between 0 and 1, the spring is underdamped and will
     * <br>  always overshoot.
     * <br>* If &#64;damping_ratio is 1, the spring is critically damped and will reach its
     * <br>  resting position the quickest way possible.
     * <br>* If &#64;damping_ratio is larger than 1, the spring is overdamped and will reach
     * <br>  its resting position faster than it can complete an oscillation.
     * <br>
     * <br>[ctor&#64;SpringParams.new_full] allows to pass a raw damping value instead.
     * @param damping_ratio the damping ratio of the spring
     * @param mass the mass of the spring
     * @param stiffness the stiffness of the spring
    */
    public SpringParams(double damping_ratio, double mass, double stiffness) {
        super(cast(JnaSpringParams.INST().adw_spring_params_new(damping_ratio, mass, stiffness)));
    }

    /**
     * Gets the damping of &#64;self.
     * @return the damping
    */
    public double getDamping()  {
        return JnaSpringParams.INST().adw_spring_params_get_damping(asCPointer());
    }

    /**
     * Gets the damping ratio of &#64;self.
     * @return the damping ratio
    */
    public double getDampingRatio()  {
        return JnaSpringParams.INST().adw_spring_params_get_damping_ratio(asCPointer());
    }

    /**
     * Gets the mass of &#64;self.
     * @return the mass
    */
    public double getMass()  {
        return JnaSpringParams.INST().adw_spring_params_get_mass(asCPointer());
    }

    /**
     * Gets the stiffness of &#64;self.
     * @return the stiffness
    */
    public double getStiffness()  {
        return JnaSpringParams.INST().adw_spring_params_get_stiffness(asCPointer());
    }

    /**
     * Increases the reference count of &#64;self.
     * @return &#64;self
    */
    public SpringParams ref()  {
        return new SpringParams(new PointerContainer(JnaSpringParams.INST().adw_spring_params_ref(asCPointer())));
    }

    /**
     * Decreases the reference count of &#64;self.
     * <br>
     * <br>If the last reference is dropped, the structure is freed.
    */
    public void unref()  {
        JnaSpringParams.INST().adw_spring_params_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaSpringParams.INST().adw_spring_params_get_type(); 
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
record-type
all-fields-supported
*/
