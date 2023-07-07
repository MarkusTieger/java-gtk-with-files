/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A spring-based [class&#64;Animation].
 * <br>
 * <br>`AdwSpringAnimation` implements an animation driven by a physical model of a
 * <br>spring described by [struct&#64;SpringParams], with a resting position in
 * <br>[property&#64;SpringAnimation:value-to], stretched to
 * <br>[property&#64;SpringAnimation:value-from].
 * <br>
 * <br>Since the animation is physically simulated, spring animations don't have a
 * <br>fixed duration. The animation will stop when the simulated spring comes to a
 * <br>rest - when the amplitude of the oscillations becomes smaller than
 * <br>[property&#64;SpringAnimation:epsilon], or immediately when it reaches
 * <br>[property&#64;SpringAnimation:value-to] if
 * <br>[property&#64;SpringAnimation:clamp] is set to `TRUE`. The estimated duration can
 * <br>be obtained with [property&#64;SpringAnimation:estimated-duration].
 * <br>
 * <br>Due to the nature of spring-driven motion the animation can overshoot
 * <br>[property&#64;SpringAnimation:value-to] before coming to a rest. Whether the
 * <br>animation will overshoot or not depends on the damping ratio of the spring.
 * <br>See [struct&#64;SpringParams] for more information about specific damping ratio
 * <br>values.
 * <br>
 * <br>If [property&#64;SpringAnimation:clamp] is `TRUE`, the animation will abruptly
 * <br>end as soon as it reaches the final value, preventing overshooting.
 * <br>
 * <br>Animations can have an initial velocity value, set via
 * <br>[property&#64;SpringAnimation:initial-velocity], which adjusts the curve without
 * <br>changing the duration. This makes spring animations useful for deceleration
 * <br>at the end of gestures.
 * <br>
 * <br>If the initial and final values are equal, and the initial velocity is not 0,
 * <br>the animation value will bounce and return to its resting position.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.SpringAnimation.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.SpringAnimation.html</a></p>
*/
public class SpringAnimation extends Animation {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SpringAnimation.class.getCanonicalName());
    }

    public SpringAnimation(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwSpringAnimation` on &#64;widget.
     * <br>
     * <br>The animation will animate &#64;target from &#64;from to &#64;to with the dynamics of a
     * <br>spring described by &#64;spring_params.
     * @param widget a widget to create animation on
     * @param from a value to animate from
     * @param to a value to animate to
     * @param spring_params physical parameters of the spring
     * @param target a target value to animate
    */
    public SpringAnimation(@Nonnull ch.bailu.gtk.gtk.Widget widget, double from, double to, @Nonnull SpringParams spring_params, @Nonnull AnimationTarget target) {
        super(cast(JnaSpringAnimation.INST().adw_spring_animation_new(asCPointerNotNull(widget), from, to, asCPointerNotNull(spring_params), asCPointerNotNull(target))));
    }

    /**
     * Gets whether &#64;self should be clamped.
     * @return whether &#64;self is clamped
    */
    public boolean getClamp()  {
        return JnaSpringAnimation.INST().adw_spring_animation_get_clamp(asCPointer());
    }

    /**
     * Gets the precision of the spring.
     * @return the epsilon value
    */
    public double getEpsilon()  {
        return JnaSpringAnimation.INST().adw_spring_animation_get_epsilon(asCPointer());
    }

    /**
     * Gets the estimated duration of &#64;self.
     * <br>
     * <br>Can be [const&#64;DURATION_INFINITE] if the spring damping is set to 0.
     * @return the estimated duration
    */
    public int getEstimatedDuration()  {
        return JnaSpringAnimation.INST().adw_spring_animation_get_estimated_duration(asCPointer());
    }

    /**
     * Gets the initial velocity of &#64;self.
     * @return the initial velocity
    */
    public double getInitialVelocity()  {
        return JnaSpringAnimation.INST().adw_spring_animation_get_initial_velocity(asCPointer());
    }

    /**
     * Gets the physical parameters of the spring of &#64;self.
     * @return the spring parameters
    */
    public SpringParams getSpringParams()  {
        return new SpringParams(new PointerContainer(JnaSpringAnimation.INST().adw_spring_animation_get_spring_params(asCPointer())));
    }

    /**
     * Gets the value &#64;self will animate from.
     * @return the value to animate from
    */
    public double getValueFrom()  {
        return JnaSpringAnimation.INST().adw_spring_animation_get_value_from(asCPointer());
    }

    /**
     * Gets the value &#64;self will animate to.
     * @return the value to animate to
    */
    public double getValueTo()  {
        return JnaSpringAnimation.INST().adw_spring_animation_get_value_to(asCPointer());
    }

    /**
     * Gets the current velocity of &#64;self.
     * @return the current velocity
    */
    public double getVelocity()  {
        return JnaSpringAnimation.INST().adw_spring_animation_get_velocity(asCPointer());
    }

    /**
     * Sets whether &#64;self should be clamped.
     * <br>
     * <br>If set to `TRUE`, the animation will abruptly end as soon as it reaches the
     * <br>final value, preventing overshooting.
     * <br>
     * <br>It won't prevent overshooting [property&#64;SpringAnimation:value-from] if a
     * <br>relative negative [property&#64;SpringAnimation:initial-velocity] is set.
     * @param clamp the new value
    */
    public void setClamp(boolean clamp)  {
        JnaSpringAnimation.INST().adw_spring_animation_set_clamp(asCPointer(), clamp);
    }

    /**
     * Sets the precision of the spring.
     * <br>
     * <br>The level of precision used to determine when the animation has come to a
     * <br>rest, that is, when the amplitude of the oscillations becomes smaller than
     * <br>this value.
     * <br>
     * <br>If the epsilon value is too small, the animation will take a long time to
     * <br>stop after the animated value has stopped visibly changing.
     * <br>
     * <br>If the epsilon value is too large, the animation will end prematurely.
     * <br>
     * <br>The default value is 0.001.
     * @param epsilon the new value
    */
    public void setEpsilon(double epsilon)  {
        JnaSpringAnimation.INST().adw_spring_animation_set_epsilon(asCPointer(), epsilon);
    }

    /**
     * Sets the initial velocity of &#64;self.
     * <br>
     * <br>Initial velocity affects only the animation curve, but not its duration.
     * @param velocity the initial velocity
    */
    public void setInitialVelocity(double velocity)  {
        JnaSpringAnimation.INST().adw_spring_animation_set_initial_velocity(asCPointer(), velocity);
    }

    /**
     * Sets the physical parameters of the spring of &#64;self.
     * @param spring_params the new spring parameters
    */
    public void setSpringParams(@Nonnull SpringParams spring_params)  {
        JnaSpringAnimation.INST().adw_spring_animation_set_spring_params(asCPointer(), asCPointerNotNull(spring_params));
    }

    /**
     * Sets the value &#64;self will animate from.
     * <br>
     * <br>The animation will start at this value and end at
     * <br>[property&#64;SpringAnimation:value-to].
     * @param value the value to animate from
    */
    public void setValueFrom(double value)  {
        JnaSpringAnimation.INST().adw_spring_animation_set_value_from(asCPointer(), value);
    }

    /**
     * Sets the value &#64;self will animate to.
     * <br>
     * <br>The animation will start at [property&#64;SpringAnimation:value-from] and end at
     * <br>this value.
     * @param value the value to animate to
    */
    public void setValueTo(double value)  {
        JnaSpringAnimation.INST().adw_spring_animation_set_value_to(asCPointer(), value);
    }

    public static long getTypeID() { 
        return JnaSpringAnimation.INST().adw_spring_animation_get_type(); 
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
