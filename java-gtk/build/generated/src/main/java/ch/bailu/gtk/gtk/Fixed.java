/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkFixed` places its child widgets at fixed positions and with fixed sizes.
 * <br>
 * <br>`GtkFixed` performs no automatic layout management.
 * <br>
 * <br>For most applications, you should not use this container! It keeps
 * <br>you from having to learn about the other GTK containers, but it
 * <br>results in broken applications.  With `GtkFixed`, the following
 * <br>things will result in truncated text, overlapping widgets, and
 * <br>other display bugs:
 * <br>
 * <br>- Themes, which may change widget sizes.
 * <br>
 * <br>- Fonts other than the one you used to write the app will of course
 * <br>  change the size of widgets containing text; keep in mind that
 * <br>  users may use a larger font because of difficulty reading the
 * <br>  default, or they may be using a different OS that provides different fonts.
 * <br>
 * <br>- Translation of text into other languages changes its size. Also,
 * <br>  display of non-English text will use a different font in many
 * <br>  cases.
 * <br>
 * <br>In addition, `GtkFixed` does not pay attention to text direction and
 * <br>thus may produce unwanted results if your app is run under right-to-left
 * <br>languages such as Hebrew or Arabic. That is: normally GTK will order
 * <br>containers appropriately for the text direction, e.g. to put labels to
 * <br>the right of the thing they label when using an RTL language, but it can’t
 * <br>do that with `GtkFixed`. So if you need to reorder widgets depending on
 * <br>the text direction, you would need to manually detect it and adjust child
 * <br>positions accordingly.
 * <br>
 * <br>Finally, fixed positioning makes it kind of annoying to add/remove
 * <br>UI elements, since you have to reposition all the other elements. This
 * <br>is a long-term maintenance problem for your application.
 * <br>
 * <br>If you know none of these things are an issue for your application,
 * <br>and prefer the simplicity of `GtkFixed`, by all means use the
 * <br>widget. But you should be aware of the tradeoffs.
 * <p><a href="https://docs.gtk.org/gtk4/class.Fixed.html">https://docs.gtk.org/gtk4/class.Fixed.html</a></p>
*/
public class Fixed extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Fixed.class.getCanonicalName());
    }

    public Fixed(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkFixed`.
    */
    public Fixed() {
        super(cast(JnaFixed.INST().gtk_fixed_new()));
    }

    /**
     * Retrieves the transformation for &#64;widget set using
     * <br>gtk_fixed_set_child_transform().
     * @param widget a `GtkWidget`, child of &#64;fixed
     * @return a `GskTransform`
    */
    public ch.bailu.gtk.gsk.Transform getChildTransform(@Nonnull Widget widget)  {
        return new ch.bailu.gtk.gsk.Transform(new PointerContainer(JnaFixed.INST().gtk_fixed_get_child_transform(asCPointer(), asCPointerNotNull(widget))));
    }

    /**
     * Sets a translation transformation to the given &#64;x and &#64;y
     * <br>coordinates to the child &#64;widget of the `GtkFixed`.
     * @param widget the child widget
     * @param x the horizontal position to move the widget to
     * @param y the vertical position to move the widget to
    */
    public void move(@Nonnull Widget widget, double x, double y)  {
        JnaFixed.INST().gtk_fixed_move(asCPointer(), asCPointerNotNull(widget), x, y);
    }

    /**
     * Adds a widget to a `GtkFixed` at the given position.
     * @param widget the widget to add
     * @param x the horizontal position to place the widget at
     * @param y the vertical position to place the widget at
    */
    public void put(@Nonnull Widget widget, double x, double y)  {
        JnaFixed.INST().gtk_fixed_put(asCPointer(), asCPointerNotNull(widget), x, y);
    }

    /**
     * Removes a child from &#64;fixed.
     * @param widget the child widget to remove
    */
    public void remove(@Nonnull Widget widget)  {
        JnaFixed.INST().gtk_fixed_remove(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Sets the transformation for &#64;widget.
     * <br>
     * <br>This is a convenience function that retrieves the
     * <br>[class&#64;Gtk.FixedLayoutChild] instance associated to
     * <br>&#64;widget and calls [method&#64;Gtk.FixedLayoutChild.set_transform].
     * @param widget a `GtkWidget`, child of &#64;fixed
     * @param transform the transformation assigned to &#64;widget   to reset &#64;widget's transform
    */
    public void setChildTransform(@Nonnull Widget widget, @Nullable ch.bailu.gtk.gsk.Transform transform)  {
        JnaFixed.INST().gtk_fixed_set_child_transform(asCPointer(), asCPointerNotNull(widget), asCPointer(transform));
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
        return JnaFixed.INST().gtk_fixed_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getChildPosition:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Widget:{c:GtkWidget*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
