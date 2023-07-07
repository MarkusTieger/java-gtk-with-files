/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkConstraintGuide` is an invisible layout element in a
 * <br>`GtkConstraintLayout`.
 * <br>
 * <br>The `GtkConstraintLayout` treats guides like widgets. They
 * <br>can be used as the source or target of a `GtkConstraint`.
 * <br>
 * <br>Guides have a minimum, maximum and natural size. Depending
 * <br>on the constraints that are applied, they can act like a
 * <br>guideline that widgets can be aligned to, or like *flexible
 * <br>space*.
 * <br>
 * <br>Unlike a `GtkWidget`, a `GtkConstraintGuide` will not be drawn.
 * <p><a href="https://docs.gtk.org/gtk4/class.ConstraintGuide.html">https://docs.gtk.org/gtk4/class.ConstraintGuide.html</a></p>
*/
public class ConstraintGuide extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ConstraintGuide.class.getCanonicalName());
    }

    public ConstraintGuide(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkConstraintGuide` object.
    */
    public ConstraintGuide() {
        super(cast(JnaConstraintGuide.INST().gtk_constraint_guide_new()));
    }

    /**
     * Gets the maximum size of &#64;guide.
     * @param width return location for the maximum width
     * @param height return location for the maximum height
    */
    public void getMaxSize(@Nullable ch.bailu.gtk.type.Int width, @Nullable ch.bailu.gtk.type.Int height)  {
        JnaConstraintGuide.INST().gtk_constraint_guide_get_max_size(asCPointer(), asCPointer(width), asCPointer(height));
    }

    /**
     * Gets the minimum size of &#64;guide.
     * @param width return location for the minimum width
     * @param height return location for the minimum height
    */
    public void getMinSize(@Nullable ch.bailu.gtk.type.Int width, @Nullable ch.bailu.gtk.type.Int height)  {
        JnaConstraintGuide.INST().gtk_constraint_guide_get_min_size(asCPointer(), asCPointer(width), asCPointer(height));
    }

    /**
     * Retrieves the name set using gtk_constraint_guide_set_name().
     * @return the name of the guide
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaConstraintGuide.INST().gtk_constraint_guide_get_name(asCPointer())));
    }

    /**
     * Gets the natural size of &#64;guide.
     * @param width return location for the natural width
     * @param height return location for the natural height
    */
    public void getNatSize(@Nullable ch.bailu.gtk.type.Int width, @Nullable ch.bailu.gtk.type.Int height)  {
        JnaConstraintGuide.INST().gtk_constraint_guide_get_nat_size(asCPointer(), asCPointer(width), asCPointer(height));
    }

    /**
     * Retrieves the strength set using gtk_constraint_guide_set_strength().
     * @return the strength of the constraint on the natural size
    */
    public int getStrength()  {
        return JnaConstraintGuide.INST().gtk_constraint_guide_get_strength(asCPointer());
    }

    /**
     * Sets the maximum size of &#64;guide.
     * <br>
     * <br>If &#64;guide is attached to a `GtkConstraintLayout`,
     * <br>the constraints will be updated to reflect the new size.
     * @param width the new maximum width, or -1 to not change it
     * @param height the new maximum height, or -1 to not change it
    */
    public void setMaxSize(int width, int height)  {
        JnaConstraintGuide.INST().gtk_constraint_guide_set_max_size(asCPointer(), width, height);
    }

    /**
     * Sets the minimum size of &#64;guide.
     * <br>
     * <br>If &#64;guide is attached to a `GtkConstraintLayout`,
     * <br>the constraints will be updated to reflect the new size.
     * @param width the new minimum width, or -1 to not change it
     * @param height the new minimum height, or -1 to not change it
    */
    public void setMinSize(int width, int height)  {
        JnaConstraintGuide.INST().gtk_constraint_guide_set_min_size(asCPointer(), width, height);
    }

    /**
     * Sets a name for the given `GtkConstraintGuide`.
     * <br>
     * <br>The name is useful for debugging purposes.
     * @param name a name for the &#64;guide
    */
    public void setName(@Nullable ch.bailu.gtk.type.Str name)  {
        JnaConstraintGuide.INST().gtk_constraint_guide_set_name(asCPointer(), asCPointer(name));
    }

    /**
     * Sets a name for the given `GtkConstraintGuide`.
     * <br>
     * <br>The name is useful for debugging purposes.
     * @param name a name for the &#64;guide
    */
    public void setName(String name)  {
        JnaConstraintGuide.INST().gtk_constraint_guide_set_name(asCPointer(), name);
    }

    /**
     * Sets the natural size of &#64;guide.
     * <br>
     * <br>If &#64;guide is attached to a `GtkConstraintLayout`,
     * <br>the constraints will be updated to reflect the new size.
     * @param width the new natural width, or -1 to not change it
     * @param height the new natural height, or -1 to not change it
    */
    public void setNatSize(int width, int height)  {
        JnaConstraintGuide.INST().gtk_constraint_guide_set_nat_size(asCPointer(), width, height);
    }

    /**
     * Sets the strength of the constraint on the natural size of the
     * <br>given `GtkConstraintGuide`.
     * @param strength the strength of the constraint
    */
    public void setStrength(int strength)  {
        JnaConstraintGuide.INST().gtk_constraint_guide_set_strength(asCPointer(), strength);
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaConstraintGuide.INST().gtk_constraint_guide_get_type(); 
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
