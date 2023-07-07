/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkAspectFrame` preserves the aspect ratio of its child.
 * <br>
 * <br>The frame can respect the aspect ratio of the child widget,
 * <br>or use its own aspect ratio.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkAspectFrame` uses a CSS node with name `frame`.
 * <p><a href="https://docs.gtk.org/gtk4/class.AspectFrame.html">https://docs.gtk.org/gtk4/class.AspectFrame.html</a></p>
*/
public class AspectFrame extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AspectFrame.class.getCanonicalName());
    }

    public AspectFrame(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a new `GtkAspectFrame`.
     * @param xalign Horizontal alignment of the child within the parent.   Ranges from 0.0 (left aligned) to 1.0 (right aligned)
     * @param yalign Vertical alignment of the child within the parent.   Ranges from 0.0 (top aligned) to 1.0 (bottom aligned)
     * @param ratio The desired aspect ratio.
     * @param obey_child If %TRUE, &#64;ratio is ignored, and the aspect   ratio is taken from the requistion of the child.
    */
    public AspectFrame(float xalign, float yalign, float ratio, boolean obey_child) {
        super(cast(JnaAspectFrame.INST().gtk_aspect_frame_new(xalign, yalign, ratio, obey_child)));
    }

    /**
     * Gets the child widget of &#64;self.
     * @return the child widget of self&#64;
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaAspectFrame.INST().gtk_aspect_frame_get_child(asCPointer())));
    }

    /**
     * Returns whether the child's size request should override
     * <br>the set aspect ratio of the `GtkAspectFrame`.
     * @return whether to obey the child's size request
    */
    public boolean getObeyChild()  {
        return JnaAspectFrame.INST().gtk_aspect_frame_get_obey_child(asCPointer());
    }

    /**
     * Returns the desired aspect ratio of the child.
     * @return the desired aspect ratio
    */
    public float getRatio()  {
        return JnaAspectFrame.INST().gtk_aspect_frame_get_ratio(asCPointer());
    }

    /**
     * Returns the horizontal alignment of the child within the
     * <br>allocation of the `GtkAspectFrame`.
     * @return the horizontal alignment
    */
    public float getXalign()  {
        return JnaAspectFrame.INST().gtk_aspect_frame_get_xalign(asCPointer());
    }

    /**
     * Returns the vertical alignment of the child within the
     * <br>allocation of the `GtkAspectFrame`.
     * @return the vertical alignment
    */
    public float getYalign()  {
        return JnaAspectFrame.INST().gtk_aspect_frame_get_yalign(asCPointer());
    }

    /**
     * Sets the child widget of &#64;self.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaAspectFrame.INST().gtk_aspect_frame_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets whether the aspect ratio of the child's size
     * <br>request should override the set aspect ratio of
     * <br>the `GtkAspectFrame`.
     * @param obey_child If %TRUE, &#64;ratio is ignored, and the aspect    ratio is taken from the requistion of the child.
    */
    public void setObeyChild(boolean obey_child)  {
        JnaAspectFrame.INST().gtk_aspect_frame_set_obey_child(asCPointer(), obey_child);
    }

    /**
     * Sets the desired aspect ratio of the child.
     * @param ratio aspect ratio of the child
    */
    public void setRatio(float ratio)  {
        JnaAspectFrame.INST().gtk_aspect_frame_set_ratio(asCPointer(), ratio);
    }

    /**
     * Sets the horizontal alignment of the child within the allocation
     * <br>of the `GtkAspectFrame`.
     * @param xalign horizontal alignment, from 0.0 (left aligned) to 1.0 (right aligned)
    */
    public void setXalign(float xalign)  {
        JnaAspectFrame.INST().gtk_aspect_frame_set_xalign(asCPointer(), xalign);
    }

    /**
     * Sets the vertical alignment of the child within the allocation
     * <br>of the `GtkAspectFrame`.
     * @param yalign horizontal alignment, from 0.0 (top aligned) to 1.0 (bottom aligned)
    */
    public void setYalign(float yalign)  {
        JnaAspectFrame.INST().gtk_aspect_frame_set_yalign(asCPointer(), yalign);
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaAspectFrame.INST().gtk_aspect_frame_get_type(); 
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
