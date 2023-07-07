/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkDropControllerMotion` is an event controller tracking
 * <br>the pointer during Drag-and-Drop operations.
 * <br>
 * <br>It is modeled after [class&#64;Gtk.EventControllerMotion] so if you
 * <br>have used that, this should feel really familiar.
 * <br>
 * <br>This controller is not able to accept drops, use [class&#64;Gtk.DropTarget]
 * <br>for that purpose.
 * <p><a href="https://docs.gtk.org/gtk4/class.DropControllerMotion.html">https://docs.gtk.org/gtk4/class.DropControllerMotion.html</a></p>
*/
public class DropControllerMotion extends EventController {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DropControllerMotion.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnEnter {
        /**
         * Signals that the pointer has entered the widget.
         * @param x coordinates of pointer location
         * @param y coordinates of pointer location
        */
        void onEnter(double x, double y);
    }
    
    private static com.sun.jna.Callback toOnEnter(OnEnter in) {
        return (in == null) ? null: (JnaDropControllerMotion.OnEnter) (__self, _x, _y, __data) -> in.onEnter(_x, _y);
    }

    @FunctionalInterface
    public interface OnLeave {
        /**
         * Signals that the pointer has left the widget.
        */
        void onLeave();
    }
    
    private static com.sun.jna.Callback toOnLeave(OnLeave in) {
        return (in == null) ? null: (JnaDropControllerMotion.OnLeave) (__self, __data) -> in.onLeave();
    }

    @FunctionalInterface
    public interface OnMotion {
        /**
         * Emitted when the pointer moves inside the widget.
         * @param x the x coordinate
         * @param y the y coordinate
        */
        void onMotion(double x, double y);
    }
    
    private static com.sun.jna.Callback toOnMotion(OnMotion in) {
        return (in == null) ? null: (JnaDropControllerMotion.OnMotion) (__self, _x, _y, __data) -> in.onMotion(_x, _y);
    }

    public DropControllerMotion(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new event controller that will handle pointer motion
     * <br>events during drag and drop.
    */
    public DropControllerMotion() {
        super(cast(JnaDropControllerMotion.INST().gtk_drop_controller_motion_new()));
    }

    /**
     * Returns if a Drag-and-Drop operation is within the widget
     * <br>&#64;self or one of its children.
     * @return %TRUE if a dragging pointer is within &#64;self or one of its children.
    */
    public boolean containsPointer()  {
        return JnaDropControllerMotion.INST().gtk_drop_controller_motion_contains_pointer(asCPointer());
    }

    /**
     * Returns the `GdkDrop` of a current Drag-and-Drop operation
     * <br>over the widget of &#64;self.
     * @return The `GdkDrop` currently   happening within &#64;self
    */
    public ch.bailu.gtk.gdk.Drop getDrop()  {
        return new ch.bailu.gtk.gdk.Drop(new PointerContainer(JnaDropControllerMotion.INST().gtk_drop_controller_motion_get_drop(asCPointer())));
    }

    /**
     * Returns if a Drag-and-Drop operation is within the widget
     * <br>&#64;self, not one of its children.
     * @return %TRUE if a dragging pointer is within &#64;self but   not one of its children
    */
    public boolean isPointer()  {
        return JnaDropControllerMotion.INST().gtk_drop_controller_motion_is_pointer(asCPointer());
    }

    public final static String SIGNAL_ON_ENTER = "enter";
    
    /**
     * Connect to signal "enter".
     * <br>See {@link OnEnter#onEnter} for signal description.
     * <br>Field {@link #SIGNAL_ON_ENTER} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEnter(OnEnter signal) {
        return connectSignal(SIGNAL_ON_ENTER, toOnEnter(signal));
    }

    public final static String SIGNAL_ON_LEAVE = "leave";
    
    /**
     * Connect to signal "leave".
     * <br>See {@link OnLeave#onLeave} for signal description.
     * <br>Field {@link #SIGNAL_ON_LEAVE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLeave(OnLeave signal) {
        return connectSignal(SIGNAL_ON_LEAVE, toOnLeave(signal));
    }

    public final static String SIGNAL_ON_MOTION = "motion";
    
    /**
     * Connect to signal "motion".
     * <br>See {@link OnMotion#onMotion} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOTION} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMotion(OnMotion signal) {
        return connectSignal(SIGNAL_ON_MOTION, toOnMotion(signal));
    }

    public static long getTypeID() { 
        return JnaDropControllerMotion.INST().gtk_drop_controller_motion_get_type(); 
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
