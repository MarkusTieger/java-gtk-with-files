/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkAccessible` is an interface for describing UI elements for
 * <br>Assistive Technologies.
 * <br>
 * <br>Every accessible implementation has:
 * <br>
 * <br> - a “role”, represented by a value of the [enum&#64;Gtk.AccessibleRole] enumeration
 * <br> - an “attribute”, represented by a set of [enum&#64;Gtk.AccessibleState],
 * <br>   [enum&#64;Gtk.AccessibleProperty] and [enum&#64;Gtk.AccessibleRelation] values
 * <br>
 * <br>The role cannot be changed after instantiating a `GtkAccessible`
 * <br>implementation.
 * <br>
 * <br>The attributes are updated every time a UI element's state changes in
 * <br>a way that should be reflected by assistive technologies. For instance,
 * <br>if a `GtkWidget` visibility changes, the %GTK_ACCESSIBLE_STATE_HIDDEN
 * <br>state will also change to reflect the [property&#64;Gtk.Widget:visible] property.
 * <p><a href="https://docs.gtk.org/gtk4/iface.Accessible.html">https://docs.gtk.org/gtk4/iface.Accessible.html</a></p>
*/
public class Accessible extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Accessible.class.getCanonicalName());
    }

    public Accessible(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the `GtkAccessibleRole` for the given `GtkAccessible`.
     * @return a `GtkAccessibleRole`
    */
    public int getAccessibleRole()  {
        return JnaAccessible.INST().gtk_accessible_get_accessible_role(asCPointer());
    }

    /**
     * Resets the accessible &#64;property to its default value.
     * @param property a `GtkAccessibleProperty`
    */
    public void resetProperty(int property)  {
        JnaAccessible.INST().gtk_accessible_reset_property(asCPointer(), property);
    }

    /**
     * Resets the accessible &#64;relation to its default value.
     * @param relation a `GtkAccessibleRelation`
    */
    public void resetRelation(int relation)  {
        JnaAccessible.INST().gtk_accessible_reset_relation(asCPointer(), relation);
    }

    /**
     * Resets the accessible &#64;state to its default value.
     * @param state a `GtkAccessibleState`
    */
    public void resetState(int state)  {
        JnaAccessible.INST().gtk_accessible_reset_state(asCPointer(), state);
    }

    /**
     * Updates a list of accessible properties.
     * <br>
     * <br>See the [enum&#64;Gtk.AccessibleProperty] documentation for the
     * <br>value types of accessible properties.
     * <br>
     * <br>This function should be called by `GtkWidget` types whenever
     * <br>an accessible property change must be communicated to assistive
     * <br>technologies.
     * <br>
     * <br>Example:
     * <br>```c
     * <br>value = gtk_adjustment_get_value (adjustment);
     * <br>gtk_accessible_update_property (GTK_ACCESSIBLE (spin_button),
     * <br>                                   GTK_ACCESSIBLE_PROPERTY_VALUE_NOW, value,
     * <br>                                   -1);
     * <br>```
     * @param first_property the first `GtkAccessibleProperty`
     * @param _elipse a list of property and value pairs, terminated by -1
    */
    public void updateProperty(int first_property, java.lang.Object... _elipse)  {
        JnaAccessible.INST().gtk_accessible_update_property(asCPointer(), first_property, _elipse);
    }

    /**
     * Updates a list of accessible relations.
     * <br>
     * <br>This function should be called by `GtkWidget` types whenever an accessible
     * <br>relation change must be communicated to assistive technologies.
     * <br>
     * <br>If the [enum&#64;Gtk.AccessibleRelation] requires a list of references,
     * <br>you should pass each reference individually, followed by %NULL, e.g.
     * <br>
     * <br>```c
     * <br>gtk_accessible_update_relation (accessible,
     * <br>                                GTK_ACCESSIBLE_RELATION_CONTROLS,
     * <br>                                  ref1, NULL,
     * <br>                                GTK_ACCESSIBLE_RELATION_LABELLED_BY,
     * <br>                                  ref1, ref2, ref3, NULL,
     * <br>                                -1);
     * <br>```
     * @param first_relation the first `GtkAccessibleRelation`
     * @param _elipse a list of relation and value pairs, terminated by -1
    */
    public void updateRelation(int first_relation, java.lang.Object... _elipse)  {
        JnaAccessible.INST().gtk_accessible_update_relation(asCPointer(), first_relation, _elipse);
    }

    /**
     * Updates a list of accessible states. See the [enum&#64;Gtk.AccessibleState]
     * <br>documentation for the value types of accessible states.
     * <br>
     * <br>This function should be called by `GtkWidget` types whenever an accessible
     * <br>state change must be communicated to assistive technologies.
     * <br>
     * <br>Example:
     * <br>```c
     * <br>value = GTK_ACCESSIBLE_TRISTATE_MIXED;
     * <br>gtk_accessible_update_state (GTK_ACCESSIBLE (check_button),
     * <br>                             GTK_ACCESSIBLE_STATE_CHECKED, value,
     * <br>                             -1);
     * <br>```
     * @param first_state the first `GtkAccessibleState`
     * @param _elipse a list of state and value pairs, terminated by -1
    */
    public void updateState(int first_state, java.lang.Object... _elipse)  {
        JnaAccessible.INST().gtk_accessible_update_state(asCPointer(), first_state, _elipse);
    }

    public static long getTypeID() { 
        return JnaAccessible.INST().gtk_accessible_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:updatePropertyValue:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkAccessibleProperty*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:updateRelationValue:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkAccessibleRelation*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:updateStateValue:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkAccessibleState*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:const GValue*}}:{j:}]
*/
