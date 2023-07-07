/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A time-based [class&#64;Animation].
 * <br>
 * <br>`AdwTimedAnimation` implements a simple animation interpolating the given
 * <br>value from [property&#64;TimedAnimation:value-from] to
 * <br>[property&#64;TimedAnimation:value-to] over
 * <br>[property&#64;TimedAnimation:duration] milliseconds using the curve described by
 * <br>[property&#64;TimedAnimation:easing].
 * <br>
 * <br>If [property&#64;TimedAnimation:reverse] is set to `TRUE`, `AdwTimedAnimation`
 * <br>will instead animate from [property&#64;TimedAnimation:value-to] to
 * <br>[property&#64;TimedAnimation:value-from], and the easing curve will be inverted.
 * <br>
 * <br>The animation can repeat a certain amount of times, or endlessly, depending
 * <br>on the [property&#64;TimedAnimation:repeat-count] value. If
 * <br>[property&#64;TimedAnimation:alternate] is set to `TRUE`, it will also change the
 * <br>direction every other iteration.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.TimedAnimation.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.TimedAnimation.html</a></p>
*/
public class TimedAnimation extends Animation {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TimedAnimation.class.getCanonicalName());
    }

    public TimedAnimation(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwTimedAnimation` on &#64;widget to animate &#64;target from &#64;from
     * <br>to &#64;to.
     * @param widget a widget to create animation on
     * @param from a value to animate from
     * @param to a value to animate to
     * @param duration a duration for the animation
     * @param target a target value to animate
    */
    public TimedAnimation(@Nonnull ch.bailu.gtk.gtk.Widget widget, double from, double to, int duration, @Nonnull AnimationTarget target) {
        super(cast(JnaTimedAnimation.INST().adw_timed_animation_new(asCPointerNotNull(widget), from, to, duration, asCPointerNotNull(target))));
    }

    /**
     * Gets whether &#64;self changes direction on every iteration.
     * @return whether &#64;self alternates
    */
    public boolean getAlternate()  {
        return JnaTimedAnimation.INST().adw_timed_animation_get_alternate(asCPointer());
    }

    /**
     * Gets the duration of &#64;self.
     * @return the duration of &#64;self, in milliseconds
    */
    public int getDuration()  {
        return JnaTimedAnimation.INST().adw_timed_animation_get_duration(asCPointer());
    }

    /**
     * Gets the easing function &#64;self uses.
     * @return the easing function &#64;self uses
    */
    public int getEasing()  {
        return JnaTimedAnimation.INST().adw_timed_animation_get_easing(asCPointer());
    }

    /**
     * Gets the number of times &#64;self will play.
     * @return the number of times &#64;self will play
    */
    public int getRepeatCount()  {
        return JnaTimedAnimation.INST().adw_timed_animation_get_repeat_count(asCPointer());
    }

    /**
     * Gets whether &#64;self plays backwards.
     * @return whether &#64;self plays backwards
    */
    public boolean getReverse()  {
        return JnaTimedAnimation.INST().adw_timed_animation_get_reverse(asCPointer());
    }

    /**
     * Gets the value &#64;self will animate from.
     * @return the value to animate from
    */
    public double getValueFrom()  {
        return JnaTimedAnimation.INST().adw_timed_animation_get_value_from(asCPointer());
    }

    /**
     * Gets the value &#64;self will animate to.
     * @return the value to animate to
    */
    public double getValueTo()  {
        return JnaTimedAnimation.INST().adw_timed_animation_get_value_to(asCPointer());
    }

    /**
     * Sets whether &#64;self changes direction on every iteration.
     * @param alternate whether &#64;self alternates
    */
    public void setAlternate(boolean alternate)  {
        JnaTimedAnimation.INST().adw_timed_animation_set_alternate(asCPointer(), alternate);
    }

    /**
     * Sets the duration of &#64;self.
     * <br>
     * <br>If the animation repeats more than once, sets the duration of one iteration.
     * @param duration the duration to use, in milliseconds
    */
    public void setDuration(int duration)  {
        JnaTimedAnimation.INST().adw_timed_animation_set_duration(asCPointer(), duration);
    }

    /**
     * Sets the easing function &#64;self will use.
     * <br>
     * <br>See [enum&#64;Easing] for the description of specific easing functions.
     * @param easing the easing function to use
    */
    public void setEasing(int easing)  {
        JnaTimedAnimation.INST().adw_timed_animation_set_easing(asCPointer(), easing);
    }

    /**
     * Sets the number of times &#64;self will play.
     * <br>
     * <br>If set to 0, &#64;self will repeat endlessly.
     * @param repeat_count the number of times &#64;self will play
    */
    public void setRepeatCount(int repeat_count)  {
        JnaTimedAnimation.INST().adw_timed_animation_set_repeat_count(asCPointer(), repeat_count);
    }

    /**
     * Sets whether &#64;self plays backwards.
     * @param reverse whether &#64;self plays backwards
    */
    public void setReverse(boolean reverse)  {
        JnaTimedAnimation.INST().adw_timed_animation_set_reverse(asCPointer(), reverse);
    }

    /**
     * Sets the value &#64;self will animate from.
     * <br>
     * <br>The animation will start at this value and end at
     * <br>[property&#64;TimedAnimation:value-to].
     * <br>
     * <br>If [property&#64;TimedAnimation:reverse] is `TRUE`, the animation will end at
     * <br>this value instead.
     * @param value the value to animate from
    */
    public void setValueFrom(double value)  {
        JnaTimedAnimation.INST().adw_timed_animation_set_value_from(asCPointer(), value);
    }

    /**
     * Sets the value &#64;self will animate to.
     * <br>
     * <br>The animation will start at [property&#64;TimedAnimation:value-from] and end at
     * <br>this value.
     * <br>
     * <br>If [property&#64;TimedAnimation:reverse] is `TRUE`, the animation will start
     * <br>at this value instead.
     * @param value the value to animate to
    */
    public void setValueTo(double value)  {
        JnaTimedAnimation.INST().adw_timed_animation_set_value_to(asCPointer(), value);
    }

    public static long getTypeID() { 
        return JnaTimedAnimation.INST().adw_timed_animation_get_type(); 
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
