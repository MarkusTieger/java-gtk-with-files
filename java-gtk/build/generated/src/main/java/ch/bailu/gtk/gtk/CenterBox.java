/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkCenterBox` arranges three children in a row, keeping the middle child
 * <br>centered as well as possible.
 * <br>
 * <br>![An example GtkCenterBox](centerbox.png)
 * <br>
 * <br>To add children to `GtkCenterBox`, use [method&#64;Gtk.CenterBox.set_start_widget],
 * <br>[method&#64;Gtk.CenterBox.set_center_widget] and
 * <br>[method&#64;Gtk.CenterBox.set_end_widget].
 * <br>
 * <br>The sizing and positioning of children can be influenced with the
 * <br>align and expand properties of the children.
 * <br>
 * <br>&#35; GtkCenterBox as GtkBuildable
 * <br>
 * <br>The `GtkCenterBox` implementation of the `GtkBuildable` interface
 * <br>supports placing children in the 3 positions by specifying “start”, “center”
 * <br>or “end” as the “type” attribute of a &lt;child&gt; element.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkCenterBox` uses a single CSS node with the name “box”,
 * <br>
 * <br>The first child of the `GtkCenterBox` will be allocated depending on the
 * <br>text direction, i.e. in left-to-right layouts it will be allocated on the
 * <br>left and in right-to-left layouts on the right.
 * <br>
 * <br>In vertical orientation, the nodes of the children are arranged from top to
 * <br>bottom.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkCenterBox` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 * <p><a href="https://docs.gtk.org/gtk4/class.CenterBox.html">https://docs.gtk.org/gtk4/class.CenterBox.html</a></p>
*/
public class CenterBox extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CenterBox.class.getCanonicalName());
    }

    public CenterBox(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkCenterBox`.
    */
    public CenterBox() {
        super(cast(JnaCenterBox.INST().gtk_center_box_new()));
    }

    /**
     * Gets the value set by gtk_center_box_set_baseline_position().
     * @return the baseline position
    */
    public int getBaselinePosition()  {
        return JnaCenterBox.INST().gtk_center_box_get_baseline_position(asCPointer());
    }

    /**
     * Gets the center widget, or %NULL if there is none.
     * @return the center widget.
    */
    public Widget getCenterWidget()  {
        return new Widget(new PointerContainer(JnaCenterBox.INST().gtk_center_box_get_center_widget(asCPointer())));
    }

    /**
     * Gets the end widget, or %NULL if there is none.
     * @return the end widget.
    */
    public Widget getEndWidget()  {
        return new Widget(new PointerContainer(JnaCenterBox.INST().gtk_center_box_get_end_widget(asCPointer())));
    }

    /**
     * Gets the start widget, or %NULL if there is none.
     * @return the start widget.
    */
    public Widget getStartWidget()  {
        return new Widget(new PointerContainer(JnaCenterBox.INST().gtk_center_box_get_start_widget(asCPointer())));
    }

    /**
     * Sets the baseline position of a center box.
     * <br>
     * <br>This affects only horizontal boxes with at least one baseline
     * <br>aligned child. If there is more vertical space available than
     * <br>requested, and the baseline is not allocated by the parent then
     * <br>&#64;position is used to allocate the baseline wrt. the extra space
     * <br>available.
     * @param position a `GtkBaselinePosition`
    */
    public void setBaselinePosition(int position)  {
        JnaCenterBox.INST().gtk_center_box_set_baseline_position(asCPointer(), position);
    }

    /**
     * Sets the center widget.
     * <br>
     * <br>To remove the existing center widget, pas %NULL.
     * @param child the new center widget
    */
    public void setCenterWidget(@Nullable Widget child)  {
        JnaCenterBox.INST().gtk_center_box_set_center_widget(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the end widget.
     * <br>
     * <br>To remove the existing end widget, pass %NULL.
     * @param child the new end widget
    */
    public void setEndWidget(@Nullable Widget child)  {
        JnaCenterBox.INST().gtk_center_box_set_end_widget(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the start widget.
     * <br>
     * <br>To remove the existing start widget, pass %NULL.
     * @param child the new start widget
    */
    public void setStartWidget(@Nullable Widget child)  {
        JnaCenterBox.INST().gtk_center_box_set_start_widget(asCPointer(), asCPointer(child));
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

    /**
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaCenterBox.INST().gtk_center_box_get_type(); 
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
