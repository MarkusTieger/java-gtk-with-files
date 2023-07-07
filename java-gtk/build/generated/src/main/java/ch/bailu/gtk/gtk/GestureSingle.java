/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGestureSingle` is a `GtkGestures` subclass optimized for singe-touch
 * <br>and mouse gestures.
 * <br>
 * <br>Under interaction, these gestures stick to the first interacting sequence,
 * <br>which is accessible through [method&#64;Gtk.GestureSingle.get_current_sequence]
 * <br>while the gesture is being interacted with.
 * <br>
 * <br>By default gestures react to both %GDK_BUTTON_PRIMARY and touch events.
 * <br>[method&#64;Gtk.GestureSingle.set_touch_only] can be used to change the
 * <br>touch behavior. Callers may also specify a different mouse button number
 * <br>to interact with through [method&#64;Gtk.GestureSingle.set_button], or react
 * <br>to any mouse button by setting it to 0. While the gesture is active, the
 * <br>button being currently pressed can be known through
 * <br>[method&#64;Gtk.GestureSingle.get_current_button].
 * <p><a href="https://docs.gtk.org/gtk4/class.GestureSingle.html">https://docs.gtk.org/gtk4/class.GestureSingle.html</a></p>
*/
public class GestureSingle extends Gesture {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GestureSingle.class.getCanonicalName());
    }

    public GestureSingle(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the button number &#64;gesture listens for.
     * <br>
     * <br>If this is 0, the gesture reacts to any button press.
     * @return The button number, or 0 for any button
    */
    public int getButton()  {
        return JnaGestureSingle.INST().gtk_gesture_single_get_button(asCPointer());
    }

    /**
     * Returns the button number currently interacting
     * <br>with &#64;gesture, or 0 if there is none.
     * @return The current button number
    */
    public int getCurrentButton()  {
        return JnaGestureSingle.INST().gtk_gesture_single_get_current_button(asCPointer());
    }

    /**
     * Returns the event sequence currently interacting with &#64;gesture.
     * <br>
     * <br>This is only meaningful if [method&#64;Gtk.Gesture.is_active]
     * <br>returns %TRUE.
     * @return the current sequence
    */
    public ch.bailu.gtk.gdk.EventSequence getCurrentSequence()  {
        return new ch.bailu.gtk.gdk.EventSequence(new PointerContainer(JnaGestureSingle.INST().gtk_gesture_single_get_current_sequence(asCPointer())));
    }

    /**
     * Gets whether a gesture is exclusive.
     * <br>
     * <br>For more information, see [method&#64;Gtk.GestureSingle.set_exclusive].
     * @return Whether the gesture is exclusive
    */
    public boolean getExclusive()  {
        return JnaGestureSingle.INST().gtk_gesture_single_get_exclusive(asCPointer());
    }

    /**
     * Returns %TRUE if the gesture is only triggered by touch events.
     * @return %TRUE if the gesture only handles touch events
    */
    public boolean getTouchOnly()  {
        return JnaGestureSingle.INST().gtk_gesture_single_get_touch_only(asCPointer());
    }

    /**
     * Sets the button number &#64;gesture listens to.
     * <br>
     * <br>If non-0, every button press from a different button
     * <br>number will be ignored. Touch events implicitly match
     * <br>with button 1.
     * @param button button number to listen to, or 0 for any button
    */
    public void setButton(int button)  {
        JnaGestureSingle.INST().gtk_gesture_single_set_button(asCPointer(), button);
    }

    /**
     * Sets whether &#64;gesture is exclusive.
     * <br>
     * <br>An exclusive gesture will only handle pointer and &quot;pointer emulated&quot;
     * <br>touch events, so at any given time, there is only one sequence able
     * <br>to interact with those.
     * @param exclusive %TRUE to make &#64;gesture exclusive
    */
    public void setExclusive(boolean exclusive)  {
        JnaGestureSingle.INST().gtk_gesture_single_set_exclusive(asCPointer(), exclusive);
    }

    /**
     * Sets whether to handle only touch events.
     * <br>
     * <br>If &#64;touch_only is %TRUE, &#64;gesture will only handle events of type
     * <br>%GDK_TOUCH_BEGIN, %GDK_TOUCH_UPDATE or %GDK_TOUCH_END. If %FALSE,
     * <br>mouse events will be handled too.
     * @param touch_only whether &#64;gesture handles only touch events
    */
    public void setTouchOnly(boolean touch_only)  {
        JnaGestureSingle.INST().gtk_gesture_single_set_touch_only(asCPointer(), touch_only);
    }

    public static long getTypeID() { 
        return JnaGestureSingle.INST().gtk_gesture_single_get_type(); 
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
