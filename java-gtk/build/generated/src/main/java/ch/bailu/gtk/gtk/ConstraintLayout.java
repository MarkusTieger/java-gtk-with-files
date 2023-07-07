/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A layout manager using constraints to describe relations between widgets.
 * <br>
 * <br>`GtkConstraintLayout` is a layout manager that uses relations between
 * <br>widget attributes, expressed via [class&#64;Gtk.Constraint] instances, to
 * <br>measure and allocate widgets.
 * <br>
 * <br>&#35;&#35;&#35; How do constraints work
 * <br>
 * <br>Constraints are objects defining the relationship between attributes
 * <br>of a widget; you can read the description of the [class&#64;Gtk.Constraint]
 * <br>class to have a more in depth definition.
 * <br>
 * <br>By taking multiple constraints and applying them to the children of
 * <br>a widget using `GtkConstraintLayout`, it's possible to describe
 * <br>complex layout policies; each constraint applied to a child or to the parent
 * <br>widgets contributes to the full description of the layout, in terms of
 * <br>parameters for resolving the value of each attribute.
 * <br>
 * <br>It is important to note that a layout is defined by the totality of
 * <br>constraints; removing a child, or a constraint, from an existing layout
 * <br>without changing the remaining constraints may result in an unstable
 * <br>or unsolvable layout.
 * <br>
 * <br>Constraints have an implicit &quot;reading order&quot;; you should start describing
 * <br>each edge of each child, as well as their relationship with the parent
 * <br>container, from the top left (or top right, in RTL languages), horizontally
 * <br>first, and then vertically.
 * <br>
 * <br>A constraint-based layout with too few constraints can become &quot;unstable&quot;,
 * <br>that is: have more than one solution. The behavior of an unstable layout
 * <br>is undefined.
 * <br>
 * <br>A constraint-based layout with conflicting constraints may be unsolvable,
 * <br>and lead to an unstable layout. You can use the [property&#64;Gtk.Constraint:strength]
 * <br>property of [class&#64;Gtk.Constraint] to &quot;nudge&quot; the layout towards a solution.
 * <br>
 * <br>&#35;&#35;&#35; GtkConstraintLayout as GtkBuildable
 * <br>
 * <br>`GtkConstraintLayout` implements the [iface&#64;Gtk.Buildable] interface and
 * <br>has a custom &quot;constraints&quot; element which allows describing constraints in
 * <br>a [class&#64;Gtk.Builder] UI file.
 * <br>
 * <br>An example of a UI definition fragment specifying a constraint:
 * <br>
 * <br>```xml
 * <br>  &lt;object class=&quot;GtkConstraintLayout&quot;&gt;
 * <br>    &lt;constraints&gt;
 * <br>      &lt;constraint target=&quot;button&quot; target-attribute=&quot;start&quot;
 * <br>                  relation=&quot;eq&quot;
 * <br>                  source=&quot;super&quot; source-attribute=&quot;start&quot;
 * <br>                  constant=&quot;12&quot;
 * <br>                  strength=&quot;required&quot; /&gt;
 * <br>      &lt;constraint target=&quot;button&quot; target-attribute=&quot;width&quot;
 * <br>                  relation=&quot;ge&quot;
 * <br>                  constant=&quot;250&quot;
 * <br>                  strength=&quot;strong&quot; /&gt;
 * <br>    &lt;/constraints&gt;
 * <br>  &lt;/object&gt;
 * <br>```
 * <br>
 * <br>The definition above will add two constraints to the GtkConstraintLayout:
 * <br>
 * <br> - a required constraint between the leading edge of &quot;button&quot; and
 * <br>   the leading edge of the widget using the constraint layout, plus
 * <br>   12 pixels
 * <br> - a strong, constant constraint making the width of &quot;button&quot; greater
 * <br>   than, or equal to 250 pixels
 * <br>
 * <br>The &quot;target&quot; and &quot;target-attribute&quot; attributes are required.
 * <br>
 * <br>The &quot;source&quot; and &quot;source-attribute&quot; attributes of the &quot;constraint&quot;
 * <br>element are optional; if they are not specified, the constraint is
 * <br>assumed to be a constant.
 * <br>
 * <br>The &quot;relation&quot; attribute is optional; if not specified, the constraint
 * <br>is assumed to be an equality.
 * <br>
 * <br>The &quot;strength&quot; attribute is optional; if not specified, the constraint
 * <br>is assumed to be required.
 * <br>
 * <br>The &quot;source&quot; and &quot;target&quot; attributes can be set to &quot;super&quot; to indicate
 * <br>that the constraint target is the widget using the GtkConstraintLayout.
 * <br>
 * <br>There can be &quot;constant&quot; and &quot;multiplier&quot; attributes.
 * <br>
 * <br>Additionally, the &quot;constraints&quot; element can also contain a description
 * <br>of the `GtkConstraintGuides` used by the layout:
 * <br>
 * <br>```xml
 * <br>  &lt;constraints&gt;
 * <br>    &lt;guide min-width=&quot;100&quot; max-width=&quot;500&quot; name=&quot;hspace&quot;/&gt;
 * <br>    &lt;guide min-height=&quot;64&quot; nat-height=&quot;128&quot; name=&quot;vspace&quot; strength=&quot;strong&quot;/&gt;
 * <br>  &lt;/constraints&gt;
 * <br>```
 * <br>
 * <br>The &quot;guide&quot; element has the following optional attributes:
 * <br>
 * <br>  - &quot;min-width&quot;, &quot;nat-width&quot;, and &quot;max-width&quot;, describe the minimum,
 * <br>    natural, and maximum width of the guide, respectively
 * <br>  - &quot;min-height&quot;, &quot;nat-height&quot;, and &quot;max-height&quot;, describe the minimum,
 * <br>    natural, and maximum height of the guide, respectively
 * <br>  - &quot;strength&quot; describes the strength of the constraint on the natural
 * <br>    size of the guide; if not specified, the constraint is assumed to
 * <br>    have a medium strength
 * <br>  - &quot;name&quot; describes a name for the guide, useful when debugging
 * <br>
 * <br>&#35;&#35;&#35; Using the Visual Format Language
 * <br>
 * <br>Complex constraints can be described using a compact syntax called VFL,
 * <br>or *Visual Format Language*.
 * <br>
 * <br>The Visual Format Language describes all the constraints on a row or
 * <br>column, typically starting from the leading edge towards the trailing
 * <br>one. Each element of the layout is composed by &quot;views&quot;, which identify
 * <br>a [iface&#64;Gtk.ConstraintTarget].
 * <br>
 * <br>For instance:
 * <br>
 * <br>```
 * <br>  [button]-[textField]
 * <br>```
 * <br>
 * <br>Describes a constraint that binds the trailing edge of &quot;button&quot; to the
 * <br>leading edge of &quot;textField&quot;, leaving a default space between the two.
 * <br>
 * <br>Using VFL is also possible to specify predicates that describe constraints
 * <br>on attributes like width and height:
 * <br>
 * <br>```
 * <br>  // Width must be greater than, or equal to 50
 * <br>  [button(&gt;=50)]
 * <br>
 * <br>  // Width of button1 must be equal to width of button2
 * <br>  [button1(==button2)]
 * <br>```
 * <br>
 * <br>The default orientation for a VFL description is horizontal, unless
 * <br>otherwise specified:
 * <br>
 * <br>```
 * <br>  // horizontal orientation, default attribute: width
 * <br>  H:[button(&gt;=150)]
 * <br>
 * <br>  // vertical orientation, default attribute: height
 * <br>  V:[button1(==button2)]
 * <br>```
 * <br>
 * <br>It's also possible to specify multiple predicates, as well as their
 * <br>strength:
 * <br>
 * <br>```
 * <br>  // minimum width of button must be 150
 * <br>  // natural width of button can be 250
 * <br>  [button(&gt;=150&#64;required, ==250&#64;medium)]
 * <br>```
 * <br>
 * <br>Finally, it's also possible to use simple arithmetic operators:
 * <br>
 * <br>```
 * <br>  // width of button1 must be equal to width of button2
 * <br>  // divided by 2 plus 12
 * <br>  [button1(button2 / 2 + 12)]
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.ConstraintLayout.html">https://docs.gtk.org/gtk4/class.ConstraintLayout.html</a></p>
*/
public class ConstraintLayout extends LayoutManager {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ConstraintLayout.class.getCanonicalName());
    }

    public ConstraintLayout(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkConstraintLayout` layout manager.
    */
    public ConstraintLayout() {
        super(cast(JnaConstraintLayout.INST().gtk_constraint_layout_new()));
    }

    /**
     * Adds a constraint to the layout manager.
     * <br>
     * <br>The [property&#64;Gtk.Constraint:source] and [property&#64;Gtk.Constraint:target]
     * <br>properties of `constraint` can be:
     * <br>
     * <br> - set to `NULL` to indicate that the constraint refers to the
     * <br>   widget using `layout`
     * <br> - set to the [class&#64;Gtk.Widget] using `layout`
     * <br> - set to a child of the [class&#64;Gtk.Widget] using `layout`
     * <br> - set to a [class&#64;Gtk.ConstraintGuide] that is part of `layout`
     * <br>
     * <br>The &#64;layout acquires the ownership of &#64;constraint after calling
     * <br>this function.
     * @param constraint a [class&#64;Gtk.Constraint]
    */
    public void addConstraint(@Nonnull Constraint constraint)  {
        JnaConstraintLayout.INST().gtk_constraint_layout_add_constraint(asCPointer(), asCPointerNotNull(constraint));
    }

    /**
     * Creates a list of constraints from a VFL description.
     * <br>
     * <br>The Visual Format Language, VFL, is based on Apple's AutoLayout [VFL](https://developer.apple.com/library/content/documentation/UserExperience/Conceptual/AutolayoutPG/VisualFormatLanguage.html).
     * <br>
     * <br>The `views` dictionary is used to match [iface&#64;Gtk.ConstraintTarget]
     * <br>instances to the symbolic view name inside the VFL.
     * <br>
     * <br>The VFL grammar is:
     * <br>
     * <br>```
     * <br>       &lt;visualFormatString&gt; = (&lt;orientation&gt;)?
     * <br>                              (&lt;superview&gt;&lt;connection&gt;)?
     * <br>                              &lt;view&gt;(&lt;connection&gt;&lt;view&gt;)*
     * <br>                              (&lt;connection&gt;&lt;superview&gt;)?
     * <br>              &lt;orientation&gt; = 'H' | 'V'
     * <br>                &lt;superview&gt; = '|'
     * <br>               &lt;connection&gt; = '' | '-' &lt;predicateList&gt; '-' | '-'
     * <br>            &lt;predicateList&gt; = &lt;simplePredicate&gt; | &lt;predicateListWithParens&gt;
     * <br>          &lt;simplePredicate&gt; = &lt;metricName&gt; | &lt;positiveNumber&gt;
     * <br>  &lt;predicateListWithParens&gt; = '(' &lt;predicate&gt; (',' &lt;predicate&gt;)* ')'
     * <br>                &lt;predicate&gt; = (&lt;relation&gt;)? &lt;objectOfPredicate&gt; (&lt;operatorList&gt;)? ('&#64;' &lt;priority&gt;)?
     * <br>                 &lt;relation&gt; = '==' | '&lt;=' | '&gt;='
     * <br>        &lt;objectOfPredicate&gt; = &lt;constant&gt; | &lt;viewName&gt; | ('.' &lt;attributeName&gt;)?
     * <br>                 &lt;priority&gt; = &lt;positiveNumber&gt; | 'required' | 'strong' | 'medium' | 'weak'
     * <br>                 &lt;constant&gt; = &lt;number&gt;
     * <br>             &lt;operatorList&gt; = (&lt;multiplyOperator&gt;)? (&lt;addOperator&gt;)?
     * <br>         &lt;multiplyOperator&gt; = [ '*' | '/' ] &lt;positiveNumber&gt;
     * <br>              &lt;addOperator&gt; = [ '+' | '-' ] &lt;positiveNumber&gt;
     * <br>                 &lt;viewName&gt; = [A-Za-z_]([A-Za-z0-9_]*) // A C identifier
     * <br>               &lt;metricName&gt; = [A-Za-z_]([A-Za-z0-9_]*) // A C identifier
     * <br>            &lt;attributeName&gt; = 'top' | 'bottom' | 'left' | 'right' | 'width' | 'height' |
     * <br>                              'start' | 'end' | 'centerX' | 'centerY' | 'baseline'
     * <br>           &lt;positiveNumber&gt; // A positive real number parseable by g_ascii_strtod()
     * <br>                   &lt;number&gt; // A real number parseable by g_ascii_strtod()
     * <br>```
     * <br>
     * <br>**Note**: The VFL grammar used by GTK is slightly different than the one
     * <br>defined by Apple, as it can use symbolic values for the constraint's
     * <br>strength instead of numeric values; additionally, GTK allows adding
     * <br>simple arithmetic operations inside predicates.
     * <br>
     * <br>Examples of VFL descriptions are:
     * <br>
     * <br>```
     * <br>  // Default spacing
     * <br>  [button]-[textField]
     * <br>
     * <br>  // Width constraint
     * <br>  [button(&gt;=50)]
     * <br>
     * <br>  // Connection to super view
     * <br>  |-50-[purpleBox]-50-|
     * <br>
     * <br>  // Vertical layout
     * <br>  V:[topField]-10-[bottomField]
     * <br>
     * <br>  // Flush views
     * <br>  [maroonView][blueView]
     * <br>
     * <br>  // Priority
     * <br>  [button(100&#64;strong)]
     * <br>
     * <br>  // Equal widths
     * <br>  [button1(==button2)]
     * <br>
     * <br>  // Multiple predicates
     * <br>  [flexibleButton(&gt;=70,&lt;=100)]
     * <br>
     * <br>  // A complete line of layout
     * <br>  |-[find]-[findNext]-[findField(&gt;=20)]-|
     * <br>
     * <br>  // Operators
     * <br>  [button1(button2 / 3 + 50)]
     * <br>
     * <br>  // Named attributes
     * <br>  [button1(==button2.height)]
     * <br>```
     * @param lines an array of Visual Format Language lines   defining a set of constraints
     * @param n_lines the number of lines
     * @param hspacing default horizontal spacing value, or -1 for the fallback value
     * @param vspacing default vertical spacing value, or -1 for the fallback value
     * @param views a dictionary of `[ name, target ]`   pairs; the `name` keys map to the view names in the VFL lines, while   the `target` values map to children of the widget using a `GtkConstraintLayout`,   or guides
     * @return the list of   [class&#64;Gtk.Constraint] instances that were added to the layout
    */
    public ch.bailu.gtk.glib.List addConstraintsFromDescriptionv(@Nonnull ch.bailu.gtk.type.Strs lines, long n_lines, int hspacing, int vspacing, @Nonnull ch.bailu.gtk.glib.HashTable views) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaConstraintLayout.INST().gtk_constraint_layout_add_constraints_from_descriptionv(asCPointer(), asCPointerNotNull(lines), n_lines, hspacing, vspacing, asCPointerNotNull(views), 0L)));
    }

    /**
     * Adds a guide to `layout`.
     * <br>
     * <br>A guide can be used as the source or target of constraints,
     * <br>like a widget, but it is not visible.
     * <br>
     * <br>The `layout` acquires the ownership of `guide` after calling
     * <br>this function.
     * @param guide a [class&#64;Gtk.ConstraintGuide] object
    */
    public void addGuide(@Nonnull ConstraintGuide guide)  {
        JnaConstraintLayout.INST().gtk_constraint_layout_add_guide(asCPointer(), asCPointerNotNull(guide));
    }

    /**
     * Returns a `GListModel` to track the constraints that are
     * <br>part of the layout.
     * <br>
     * <br>Calling this function will enable extra internal bookkeeping
     * <br>to track constraints and emit signals on the returned listmodel.
     * <br>It may slow down operations a lot.
     * <br>
     * <br>Applications should try hard to avoid calling this function
     * <br>because of the slowdowns.
     * @return a   `GListModel` tracking the layout's constraints
    */
    public ch.bailu.gtk.gio.ListModel observeConstraints()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaConstraintLayout.INST().gtk_constraint_layout_observe_constraints(asCPointer())));
    }

    /**
     * Returns a `GListModel` to track the guides that are
     * <br>part of the layout.
     * <br>
     * <br>Calling this function will enable extra internal bookkeeping
     * <br>to track guides and emit signals on the returned listmodel.
     * <br>It may slow down operations a lot.
     * <br>
     * <br>Applications should try hard to avoid calling this function
     * <br>because of the slowdowns.
     * @return a   `GListModel` tracking the layout's guides
    */
    public ch.bailu.gtk.gio.ListModel observeGuides()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaConstraintLayout.INST().gtk_constraint_layout_observe_guides(asCPointer())));
    }

    /**
     * Removes all constraints from the layout manager.
    */
    public void removeAllConstraints()  {
        JnaConstraintLayout.INST().gtk_constraint_layout_remove_all_constraints(asCPointer());
    }

    /**
     * Removes `constraint` from the layout manager,
     * <br>so that it no longer influences the layout.
     * @param constraint a [class&#64;Gtk.Constraint]
    */
    public void removeConstraint(@Nonnull Constraint constraint)  {
        JnaConstraintLayout.INST().gtk_constraint_layout_remove_constraint(asCPointer(), asCPointerNotNull(constraint));
    }

    /**
     * Removes `guide` from the layout manager,
     * <br>so that it no longer influences the layout.
     * @param guide a [class&#64;Gtk.ConstraintGuide] object
    */
    public void removeGuide(@Nonnull ConstraintGuide guide)  {
        JnaConstraintLayout.INST().gtk_constraint_layout_remove_guide(asCPointer(), asCPointerNotNull(guide));
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    public static long getTypeID() { 
        return JnaConstraintLayout.INST().gtk_constraint_layout_get_type(); 
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

[MethodModel:java-type-not-supported:addConstraintsFromDescription:[ParameterModel:Supported:{Gg:List:{c:GList*}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Strs:{c:const char* const*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GError**}}:{j:}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:...}}:{j:java.lang.Object...}]
*/
