/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A base class for animations.
 * <br>
 * <br>`AdwAnimation` represents an animation on a widget. It has a target that
 * <br>provides a value to animate, and a state indicating whether the
 * <br>animation hasn't been started yet, is playing, paused or finished.
 * <br>
 * <br>Currently there are two concrete animation types:
 * <br>[class&#64;TimedAnimation] and [class&#64;SpringAnimation].
 * <br>
 * <br>`AdwAnimation` will automatically skip the animation if
 * <br>[property&#64;Animation:widget] is unmapped, or if
 * <br>[property&#64;Gtk.Settings:gtk-enable-animations] is `FALSE`.
 * <br>
 * <br>The [signal&#64;Animation::done] signal can be used to perform an action after
 * <br>the animation ends, for example hiding a widget after animating its
 * <br>[property&#64;Gtk.Widget:opacity] to 0.
 * <br>
 * <br>`AdwAnimation` will be kept alive while the animation is playing. As such,
 * <br>it's safe to create an animation, start it and immediately unref it:
 * <br>A fire-and-forget animation:
 * <br>
 * <br>```c
 * <br>static void
 * <br>animation_cb (double    value,
 * <br>              MyObject *self)
 * <br>{
 * <br>  // Do something with &#64;value
 * <br>}
 * <br>
 * <br>static void
 * <br>my_object_animate (MyObject *self)
 * <br>{
 * <br>  AdwAnimationTarget *target =
 * <br>    adw_callback_animation_target_new ((AdwAnimationTargetFunc) animation_cb,
 * <br>                                       self, NULL);
 * <br>  g_autoptr (AdwAnimation) animation =
 * <br>    adw_timed_animation_new (widget, 0, 1, 250, target);
 * <br>
 * <br>  adw_animation_play (animation);
 * <br>}
 * <br>```
 * <br>
 * <br>If there's a chance the previous animation for the same target hasn't yet
 * <br>finished, the previous animation should be stopped first, or the existing
 * <br>`AdwAnimation` object can be reused.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Animation.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Animation.html</a></p>
*/
public class Animation extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Animation.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDone {
        /**
         * This signal is emitted when the animation has been completed, either on its
         * <br>own or via calling [method&#64;Animation.skip].
        */
        void onDone();
    }
    
    private static com.sun.jna.Callback toOnDone(OnDone in) {
        return (in == null) ? null: (JnaAnimation.OnDone) (__self, __data) -> in.onDone();
    }

    public Animation(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the current value of &#64;self.
     * <br>
     * <br>The state indicates whether &#64;self is currently playing, paused, finished or
     * <br>hasn't been started yet.
     * @return the animation value
    */
    public int getState()  {
        return JnaAnimation.INST().adw_animation_get_state(asCPointer());
    }

    /**
     * Gets the target &#64;self animates.
     * @return the animation target
    */
    public AnimationTarget getTarget()  {
        return new AnimationTarget(new PointerContainer(JnaAnimation.INST().adw_animation_get_target(asCPointer())));
    }

    /**
     * Gets the current value of &#64;self.
     * @return the current value
    */
    public double getValue()  {
        return JnaAnimation.INST().adw_animation_get_value(asCPointer());
    }

    /**
     * Gets the widget &#64;self was created for.
     * <br>
     * <br>It provides the frame clock for the animation. It's not strictly necessary
     * <br>for this widget to be same as the one being animated.
     * <br>
     * <br>The widget must be mapped in order for the animation to work. If it's not
     * <br>mapped, or if it gets unmapped during an ongoing animation, the animation
     * <br>will be automatically skipped.
     * @return the animation widget
    */
    public ch.bailu.gtk.gtk.Widget getWidget()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaAnimation.INST().adw_animation_get_widget(asCPointer())));
    }

    /**
     * Pauses a playing animation for &#64;self.
     * <br>
     * <br>Does nothing if the current state of &#64;self isn't `ADW_ANIMATION_PLAYING`.
     * <br>
     * <br>Sets [property&#64;Animation:state] to `ADW_ANIMATION_PAUSED`.
    */
    public void pause()  {
        JnaAnimation.INST().adw_animation_pause(asCPointer());
    }

    /**
     * Starts the animation for &#64;self.
     * <br>
     * <br>If the animation is playing, paused or has been completed, restarts it from
     * <br>the beginning. This allows to easily play an animation regardless of whether
     * <br>it's already playing or not.
     * <br>
     * <br>Sets [property&#64;Animation:state] to `ADW_ANIMATION_PLAYING`.
     * <br>
     * <br>The animation will be automatically skipped if [property&#64;Animation:widget] is
     * <br>unmapped, or if [property&#64;Gtk.Settings:gtk-enable-animations] is `FALSE`.
     * <br>
     * <br>As such, it's not guaranteed that the animation will actually run. For
     * <br>example, when using [func&#64;GLib.idle_add] and starting an animation
     * <br>immediately afterwards, it's entirely possible that the idle callback will
     * <br>run after the animation has already finished, and not while it's playing.
    */
    public void play()  {
        JnaAnimation.INST().adw_animation_play(asCPointer());
    }

    /**
     * Resets the animation for &#64;self.
     * <br>
     * <br>Sets [property&#64;Animation:state] to `ADW_ANIMATION_IDLE`.
    */
    public void reset()  {
        JnaAnimation.INST().adw_animation_reset(asCPointer());
    }

    /**
     * Resumes a paused animation for &#64;self.
     * <br>
     * <br>This function must only be used if the animation has been paused with
     * <br>[method&#64;Animation.pause].
     * <br>
     * <br>Sets [property&#64;Animation:state] to `ADW_ANIMATION_PLAYING`.
    */
    public void resume()  {
        JnaAnimation.INST().adw_animation_resume(asCPointer());
    }

    /**
     * Sets the target &#64;self animates to &#64;target.
     * @param target an animation target
    */
    public void setTarget(@Nonnull AnimationTarget target)  {
        JnaAnimation.INST().adw_animation_set_target(asCPointer(), asCPointerNotNull(target));
    }

    /**
     * Skips the animation for &#64;self.
     * <br>
     * <br>If the animation hasn't been started yet, is playing, or is paused, instantly
     * <br>skips the animation to the end and causes [signal&#64;Animation::done] to be
     * <br>emitted.
     * <br>
     * <br>Sets [property&#64;Animation:state] to `ADW_ANIMATION_FINISHED`.
    */
    public void skip()  {
        JnaAnimation.INST().adw_animation_skip(asCPointer());
    }

    public final static String SIGNAL_ON_DONE = "done";
    
    /**
     * Connect to signal "done".
     * <br>See {@link OnDone#onDone} for signal description.
     * <br>Field {@link #SIGNAL_ON_DONE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDone(OnDone signal) {
        return connectSignal(SIGNAL_ON_DONE, toOnDone(signal));
    }

    public static long getTypeID() { 
        return JnaAnimation.INST().adw_animation_get_type(); 
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
