/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An interface for swipeable widgets.
 * <br>
 * <br>The `AdwSwipeable` interface is implemented by all swipeable widgets.
 * <br>
 * <br>See [class&#64;SwipeTracker] for details about implementing it.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/iface.Swipeable.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/iface.Swipeable.html</a></p>
*/
public class Swipeable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Swipeable.class.getCanonicalName());
    }

    public Swipeable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the progress &#64;self will snap back to after the gesture is canceled.
     * @return the cancel progress, unitless
    */
    public double getCancelProgress()  {
        return JnaSwipeable.INST().adw_swipeable_get_cancel_progress(asCPointer());
    }

    /**
     * Gets the swipe distance of &#64;self.
     * <br>
     * <br>This corresponds to how many pixels 1 unit represents.
     * @return the swipe distance in pixels
    */
    public double getDistance()  {
        return JnaSwipeable.INST().adw_swipeable_get_distance(asCPointer());
    }

    /**
     * Gets the current progress of &#64;self.
     * @return the current progress, unitless
    */
    public double getProgress()  {
        return JnaSwipeable.INST().adw_swipeable_get_progress(asCPointer());
    }

    /**
     * Gets the area &#64;self can start a swipe from for the given direction and
     * <br>gesture type.
     * <br>
     * <br>This can be used to restrict swipes to only be possible from a certain area,
     * <br>for example, to only allow edge swipes, or to have a draggable element and
     * <br>ignore swipes elsewhere.
     * <br>
     * <br>If not implemented, the default implementation returns the allocation of
     * <br>&#64;self, allowing swipes from anywhere.
     * @param navigation_direction the direction of the swipe
     * @param is_drag whether the swipe is caused by a dragging gesture
     * @param rect a pointer to a rectangle to store the swipe area
    */
    public void getSwipeArea(int navigation_direction, boolean is_drag, @Nonnull ch.bailu.gtk.gdk.Rectangle rect)  {
        JnaSwipeable.INST().adw_swipeable_get_swipe_area(asCPointer(), navigation_direction, is_drag, asCPointerNotNull(rect));
    }

    public static long getTypeID() { 
        return JnaSwipeable.INST().adw_swipeable_get_type(); 
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
interface-type

[MethodModel:cb-return-value-not-supported:getSnapPoints:[ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
*/
