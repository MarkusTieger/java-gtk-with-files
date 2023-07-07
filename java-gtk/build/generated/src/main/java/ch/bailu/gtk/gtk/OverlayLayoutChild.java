/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkLayoutChild` subclass for children in a `GtkOverlayLayout`.
 * <p><a href="https://docs.gtk.org/gtk4/class.OverlayLayoutChild.html">https://docs.gtk.org/gtk4/class.OverlayLayoutChild.html</a></p>
*/
public class OverlayLayoutChild extends LayoutChild {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(OverlayLayoutChild.class.getCanonicalName());
    }

    public OverlayLayoutChild(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves whether the child is clipped.
     * @return whether the child is clipped
    */
    public boolean getClipOverlay()  {
        return JnaOverlayLayoutChild.INST().gtk_overlay_layout_child_get_clip_overlay(asCPointer());
    }

    /**
     * Retrieves whether the child is measured.
     * @return whether the child is measured
    */
    public boolean getMeasure()  {
        return JnaOverlayLayoutChild.INST().gtk_overlay_layout_child_get_measure(asCPointer());
    }

    /**
     * Sets whether to clip this child.
     * @param clip_overlay whether to clip this child
    */
    public void setClipOverlay(boolean clip_overlay)  {
        JnaOverlayLayoutChild.INST().gtk_overlay_layout_child_set_clip_overlay(asCPointer(), clip_overlay);
    }

    /**
     * Sets whether to measure this child.
     * @param measure whether to measure this child
    */
    public void setMeasure(boolean measure)  {
        JnaOverlayLayoutChild.INST().gtk_overlay_layout_child_set_measure(asCPointer(), measure);
    }

    public static long getTypeID() { 
        return JnaOverlayLayoutChild.INST().gtk_overlay_layout_child_get_type(); 
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
