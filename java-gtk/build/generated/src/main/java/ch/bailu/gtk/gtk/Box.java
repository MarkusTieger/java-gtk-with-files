/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkBox` widget arranges child widgets into a single row or column.
 * <br>
 * <br>![An example GtkBox](box.png)
 * <br>
 * <br>Whether it is a row or column depends on the value of its
 * <br>[property&#64;Gtk.Orientable:orientation] property. Within the other
 * <br>dimension, all children are allocated the same size. Of course, the
 * <br>[property&#64;Gtk.Widget:halign] and [property&#64;Gtk.Widget:valign] properties
 * <br>can be used on the children to influence their allocation.
 * <br>
 * <br>Use repeated calls to [method&#64;Gtk.Box.append] to pack widgets into a
 * <br>`GtkBox` from start to end. Use [method&#64;Gtk.Box.remove] to remove widgets
 * <br>from the `GtkBox`. [method&#64;Gtk.Box.insert_child_after] can be used to add
 * <br>a child at a particular position.
 * <br>
 * <br>Use [method&#64;Gtk.Box.set_homogeneous] to specify whether or not all children
 * <br>of the `GtkBox` are forced to get the same amount of space.
 * <br>
 * <br>Use [method&#64;Gtk.Box.set_spacing] to determine how much space will be minimally
 * <br>placed between all children in the `GtkBox`. Note that spacing is added
 * <br>*between* the children.
 * <br>
 * <br>Use [method&#64;Gtk.Box.reorder_child_after] to move a child to a different
 * <br>place in the box.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkBox` uses a single CSS node with name box.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkBox` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 * <p><a href="https://docs.gtk.org/gtk4/class.Box.html">https://docs.gtk.org/gtk4/class.Box.html</a></p>
*/
public class Box extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Box.class.getCanonicalName());
    }

    public Box(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkBox`.
     * @param orientation the box’s orientation
     * @param spacing the number of pixels to place by default between children
    */
    public Box(int orientation, int spacing) {
        super(cast(JnaBox.INST().gtk_box_new(orientation, spacing)));
    }

    /**
     * Adds &#64;child as the last child to &#64;box.
     * @param child the `GtkWidget` to append
    */
    public void append(@Nonnull Widget child)  {
        JnaBox.INST().gtk_box_append(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Gets the value set by gtk_box_set_baseline_position().
     * @return the baseline position
    */
    public int getBaselinePosition()  {
        return JnaBox.INST().gtk_box_get_baseline_position(asCPointer());
    }

    /**
     * Returns whether the box is homogeneous (all children are the
     * <br>same size).
     * @return %TRUE if the box is homogeneous.
    */
    public boolean getHomogeneous()  {
        return JnaBox.INST().gtk_box_get_homogeneous(asCPointer());
    }

    /**
     * Gets the value set by gtk_box_set_spacing().
     * @return spacing between children
    */
    public int getSpacing()  {
        return JnaBox.INST().gtk_box_get_spacing(asCPointer());
    }

    /**
     * Inserts &#64;child in the position after &#64;sibling in the list
     * <br>of &#64;box children.
     * <br>
     * <br>If &#64;sibling is %NULL, insert &#64;child at the first position.
     * @param child the `GtkWidget` to insert
     * @param sibling the sibling after which to insert &#64;child
    */
    public void insertChildAfter(@Nonnull Widget child, @Nullable Widget sibling)  {
        JnaBox.INST().gtk_box_insert_child_after(asCPointer(), asCPointerNotNull(child), asCPointer(sibling));
    }

    /**
     * Adds &#64;child as the first child to &#64;box.
     * @param child the `GtkWidget` to prepend
    */
    public void prepend(@Nonnull Widget child)  {
        JnaBox.INST().gtk_box_prepend(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Removes a child widget from &#64;box.
     * <br>
     * <br>The child must have been added before with
     * <br>[method&#64;Gtk.Box.append], [method&#64;Gtk.Box.prepend], or
     * <br>[method&#64;Gtk.Box.insert_child_after].
     * @param child the child to remove
    */
    public void remove(@Nonnull Widget child)  {
        JnaBox.INST().gtk_box_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Moves &#64;child to the position after &#64;sibling in the list
     * <br>of &#64;box children.
     * <br>
     * <br>If &#64;sibling is %NULL, move &#64;child to the first position.
     * @param child the `GtkWidget` to move, must be a child of &#64;box
     * @param sibling the sibling to move &#64;child after
    */
    public void reorderChildAfter(@Nonnull Widget child, @Nullable Widget sibling)  {
        JnaBox.INST().gtk_box_reorder_child_after(asCPointer(), asCPointerNotNull(child), asCPointer(sibling));
    }

    /**
     * Sets the baseline position of a box.
     * <br>
     * <br>This affects only horizontal boxes with at least one baseline
     * <br>aligned child. If there is more vertical space available than
     * <br>requested, and the baseline is not allocated by the parent then
     * <br>&#64;position is used to allocate the baseline with respect to the
     * <br>extra space available.
     * @param position a `GtkBaselinePosition`
    */
    public void setBaselinePosition(int position)  {
        JnaBox.INST().gtk_box_set_baseline_position(asCPointer(), position);
    }

    /**
     * Sets whether or not all children of &#64;box are given equal space
     * <br>in the box.
     * @param homogeneous a boolean value, %TRUE to create equal allotments,   %FALSE for variable allotments
    */
    public void setHomogeneous(boolean homogeneous)  {
        JnaBox.INST().gtk_box_set_homogeneous(asCPointer(), homogeneous);
    }

    /**
     * Sets the number of pixels to place between children of &#64;box.
     * @param spacing the number of pixels to put between children
    */
    public void setSpacing(int spacing)  {
        JnaBox.INST().gtk_box_set_spacing(asCPointer(), spacing);
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
        return JnaBox.INST().gtk_box_get_type(); 
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
