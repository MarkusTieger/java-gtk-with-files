/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkBoxLayout` is a layout manager that arranges children in a single
 * <br>row or column.
 * <br>
 * <br>Whether it is a row or column depends on the value of its
 * <br>[property&#64;Gtk.Orientable:orientation] property. Within the other dimension
 * <br>all children all allocated the same size. The `GtkBoxLayout` will respect
 * <br>the [property&#64;Gtk.Widget:halign] and [property&#64;Gtk.Widget:valign]
 * <br>properties of each child widget.
 * <br>
 * <br>If you want all children to be assigned the same size, you can use
 * <br>the [property&#64;Gtk.BoxLayout:homogeneous] property.
 * <br>
 * <br>If you want to specify the amount of space placed between each child,
 * <br>you can use the [property&#64;Gtk.BoxLayout:spacing] property.
 * <p><a href="https://docs.gtk.org/gtk4/class.BoxLayout.html">https://docs.gtk.org/gtk4/class.BoxLayout.html</a></p>
*/
public class BoxLayout extends LayoutManager {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BoxLayout.class.getCanonicalName());
    }

    public BoxLayout(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkBoxLayout`.
     * @param orientation the orientation for the new layout
    */
    public BoxLayout(int orientation) {
        super(cast(JnaBoxLayout.INST().gtk_box_layout_new(orientation)));
    }

    /**
     * Gets the value set by gtk_box_layout_set_baseline_position().
     * @return the baseline position
    */
    public int getBaselinePosition()  {
        return JnaBoxLayout.INST().gtk_box_layout_get_baseline_position(asCPointer());
    }

    /**
     * Returns whether the layout is set to be homogeneous.
     * @return %TRUE if the layout is homogeneous
    */
    public boolean getHomogeneous()  {
        return JnaBoxLayout.INST().gtk_box_layout_get_homogeneous(asCPointer());
    }

    /**
     * Returns the space that &#64;box_layout puts between children.
     * @return the spacing of the layout
    */
    public int getSpacing()  {
        return JnaBoxLayout.INST().gtk_box_layout_get_spacing(asCPointer());
    }

    /**
     * Sets the baseline position of a box layout.
     * <br>
     * <br>The baseline position affects only horizontal boxes with at least one
     * <br>baseline aligned child. If there is more vertical space available than
     * <br>requested, and the baseline is not allocated by the parent then the
     * <br>given &#64;position is used to allocate the baseline within the extra
     * <br>space available.
     * @param position a `GtkBaselinePosition`
    */
    public void setBaselinePosition(int position)  {
        JnaBoxLayout.INST().gtk_box_layout_set_baseline_position(asCPointer(), position);
    }

    /**
     * Sets whether the box layout will allocate the same
     * <br>size to all children.
     * @param homogeneous %TRUE to set the box layout as homogeneous
    */
    public void setHomogeneous(boolean homogeneous)  {
        JnaBoxLayout.INST().gtk_box_layout_set_homogeneous(asCPointer(), homogeneous);
    }

    /**
     * Sets how much spacing to put between children.
     * @param spacing the spacing to apply between children
    */
    public void setSpacing(int spacing)  {
        JnaBoxLayout.INST().gtk_box_layout_set_spacing(asCPointer(), spacing);
    }

    /**
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaBoxLayout.INST().gtk_box_layout_get_type(); 
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
