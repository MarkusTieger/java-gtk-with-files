/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkConstraint` describes a constraint between attributes of two widgets,
 * <br> expressed as a linear equation.
 * <br>
 * <br>The typical equation for a constraint is:
 * <br>
 * <br>```
 * <br>  target.target_attr = source.source_attr × multiplier + constant
 * <br>```
 * <br>
 * <br>Each `GtkConstraint` is part of a system that will be solved by a
 * <br>[class&#64;Gtk.ConstraintLayout] in order to allocate and position each
 * <br>child widget or guide.
 * <br>
 * <br>The source and target, as well as their attributes, of a `GtkConstraint`
 * <br>instance are immutable after creation.
 * <p><a href="https://docs.gtk.org/gtk4/class.Constraint.html">https://docs.gtk.org/gtk4/class.Constraint.html</a></p>
*/
public class Constraint extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Constraint.class.getCanonicalName());
    }

    public Constraint(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new constraint representing a relation between a layout
     * <br>attribute on a target and a constant value.
     * @param target a the target of the constraint
     * @param target_attribute the attribute of `target` to be set
     * @param relation the relation equivalence between `target_attribute` and `constant`
     * @param constant a constant factor to be set on `target_attribute`
     * @param strength the strength of the constraint
     * @return the newly created constraint
    */
    public static Constraint newConstantConstraint(@Nullable ch.bailu.gtk.type.Pointer target, int target_attribute, int relation, double constant, int strength)  {
        PointerContainer __self = cast(JnaConstraint.INST().gtk_constraint_new_constant(asCPointer(target), target_attribute, relation, constant, strength));
        if (__self.isNull()) {
            throw new NullPointerException("Constraint:newConstant");
        }
        return new Constraint(__self);
    }        
    

    /**
     * Creates a new constraint representing a relation between a layout
     * <br>attribute on a source and a layout attribute on a target.
     * @param target the target of the constraint
     * @param target_attribute the attribute of `target` to be set
     * @param relation the relation equivalence between `target_attribute` and `source_attribute`
     * @param source the source of the constraint
     * @param source_attribute the attribute of `source` to be read
     * @param multiplier a multiplication factor to be applied to `source_attribute`
     * @param constant a constant factor to be added to `source_attribute`
     * @param strength the strength of the constraint
    */
    public Constraint(@Nullable ch.bailu.gtk.type.Pointer target, int target_attribute, int relation, @Nullable ch.bailu.gtk.type.Pointer source, int source_attribute, double multiplier, double constant, int strength) {
        super(cast(JnaConstraint.INST().gtk_constraint_new(asCPointer(target), target_attribute, relation, asCPointer(source), source_attribute, multiplier, constant, strength)));
    }

    /**
     * Retrieves the constant factor added to the source attributes' value.
     * @return a constant factor
    */
    public double getConstant()  {
        return JnaConstraint.INST().gtk_constraint_get_constant(asCPointer());
    }

    /**
     * Retrieves the multiplication factor applied to the source
     * <br>attribute's value.
     * @return a multiplication factor
    */
    public double getMultiplier()  {
        return JnaConstraint.INST().gtk_constraint_get_multiplier(asCPointer());
    }

    /**
     * The order relation between the terms of the constraint.
     * @return a relation type
    */
    public int getRelation()  {
        return JnaConstraint.INST().gtk_constraint_get_relation(asCPointer());
    }

    /**
     * Retrieves the [iface&#64;Gtk.ConstraintTarget] used as the source for the
     * <br>constraint.
     * <br>
     * <br>If the source is set to `NULL` at creation, the constraint will use
     * <br>the widget using the [class&#64;Gtk.ConstraintLayout] as the source.
     * @return the source of the constraint
    */
    public ConstraintTarget getSource()  {
        return new ConstraintTarget(new PointerContainer(JnaConstraint.INST().gtk_constraint_get_source(asCPointer())));
    }

    /**
     * Retrieves the attribute of the source to be read by the constraint.
     * @return the source's attribute
    */
    public int getSourceAttribute()  {
        return JnaConstraint.INST().gtk_constraint_get_source_attribute(asCPointer());
    }

    /**
     * Retrieves the strength of the constraint.
     * @return the strength value
    */
    public int getStrength()  {
        return JnaConstraint.INST().gtk_constraint_get_strength(asCPointer());
    }

    /**
     * Retrieves the [iface&#64;Gtk.ConstraintTarget] used as the target for
     * <br>the constraint.
     * <br>
     * <br>If the targe is set to `NULL` at creation, the constraint will use
     * <br>the widget using the [class&#64;Gtk.ConstraintLayout] as the target.
     * @return a `GtkConstraintTarget`
    */
    public ConstraintTarget getTarget()  {
        return new ConstraintTarget(new PointerContainer(JnaConstraint.INST().gtk_constraint_get_target(asCPointer())));
    }

    /**
     * Retrieves the attribute of the target to be set by the constraint.
     * @return the target's attribute
    */
    public int getTargetAttribute()  {
        return JnaConstraint.INST().gtk_constraint_get_target_attribute(asCPointer());
    }

    /**
     * Checks whether the constraint is attached to a [class&#64;Gtk.ConstraintLayout],
     * <br>and it is contributing to the layout.
     * @return `TRUE` if the constraint is attached
    */
    public boolean isAttached()  {
        return JnaConstraint.INST().gtk_constraint_is_attached(asCPointer());
    }

    /**
     * Checks whether the constraint describes a relation between an attribute
     * <br>on the [property&#64;Gtk.Constraint:target] and a constant value.
     * @return `TRUE` if the constraint is a constant relation
    */
    public boolean isConstant()  {
        return JnaConstraint.INST().gtk_constraint_is_constant(asCPointer());
    }

    /**
     * Checks whether the constraint is a required relation for solving the
     * <br>constraint layout.
     * @return %TRUE if the constraint is required
    */
    public boolean isRequired()  {
        return JnaConstraint.INST().gtk_constraint_is_required(asCPointer());
    }

    public static long getTypeID() { 
        return JnaConstraint.INST().gtk_constraint_get_type(); 
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
