/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGestureDrag` is a `GtkGesture` implementation for drags.
 * <br>
 * <br>The drag operation itself can be tracked throughout the
 * <br>[signal&#64;Gtk.GestureDrag::drag-begin],
 * <br>[signal&#64;Gtk.GestureDrag::drag-update] and
 * <br>[signal&#64;Gtk.GestureDrag::drag-end] signals, and the relevant
 * <br>coordinates can be extracted through
 * <br>[method&#64;Gtk.GestureDrag.get_offset] and
 * <br>[method&#64;Gtk.GestureDrag.get_start_point].
 * <p><a href="https://docs.gtk.org/gtk4/class.GestureDrag.html">https://docs.gtk.org/gtk4/class.GestureDrag.html</a></p>
*/
public class GestureDrag extends GestureSingle {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GestureDrag.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDragBegin {
        /**
         * Emitted whenever dragging starts.
         * @param start_x X coordinate, relative to the widget allocation
         * @param start_y Y coordinate, relative to the widget allocation
        */
        void onDragBegin(double start_x, double start_y);
    }
    
    private static com.sun.jna.Callback toOnDragBegin(OnDragBegin in) {
        return (in == null) ? null: (JnaGestureDrag.OnDragBegin) (__self, _start_x, _start_y, __data) -> in.onDragBegin(_start_x, _start_y);
    }

    @FunctionalInterface
    public interface OnDragEnd {
        /**
         * Emitted whenever the dragging is finished.
         * @param offset_x X offset, relative to the start point
         * @param offset_y Y offset, relative to the start point
        */
        void onDragEnd(double offset_x, double offset_y);
    }
    
    private static com.sun.jna.Callback toOnDragEnd(OnDragEnd in) {
        return (in == null) ? null: (JnaGestureDrag.OnDragEnd) (__self, _offset_x, _offset_y, __data) -> in.onDragEnd(_offset_x, _offset_y);
    }

    @FunctionalInterface
    public interface OnDragUpdate {
        /**
         * Emitted whenever the dragging point moves.
         * @param offset_x X offset, relative to the start point
         * @param offset_y Y offset, relative to the start point
        */
        void onDragUpdate(double offset_x, double offset_y);
    }
    
    private static com.sun.jna.Callback toOnDragUpdate(OnDragUpdate in) {
        return (in == null) ? null: (JnaGestureDrag.OnDragUpdate) (__self, _offset_x, _offset_y, __data) -> in.onDragUpdate(_offset_x, _offset_y);
    }

    public GestureDrag(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a newly created `GtkGesture` that recognizes drags.
    */
    public GestureDrag() {
        super(cast(JnaGestureDrag.INST().gtk_gesture_drag_new()));
    }

    public final static String SIGNAL_ON_DRAG_BEGIN = "drag-begin";
    
    /**
     * Connect to signal "drag-begin".
     * <br>See {@link OnDragBegin#onDragBegin} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRAG_BEGIN} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDragBegin(OnDragBegin signal) {
        return connectSignal(SIGNAL_ON_DRAG_BEGIN, toOnDragBegin(signal));
    }

    public final static String SIGNAL_ON_DRAG_END = "drag-end";
    
    /**
     * Connect to signal "drag-end".
     * <br>See {@link OnDragEnd#onDragEnd} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRAG_END} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDragEnd(OnDragEnd signal) {
        return connectSignal(SIGNAL_ON_DRAG_END, toOnDragEnd(signal));
    }

    public final static String SIGNAL_ON_DRAG_UPDATE = "drag-update";
    
    /**
     * Connect to signal "drag-update".
     * <br>See {@link OnDragUpdate#onDragUpdate} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRAG_UPDATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDragUpdate(OnDragUpdate signal) {
        return connectSignal(SIGNAL_ON_DRAG_UPDATE, toOnDragUpdate(signal));
    }

    public static long getTypeID() { 
        return JnaGestureDrag.INST().gtk_gesture_drag_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getOffset:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:getStartPoint:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
