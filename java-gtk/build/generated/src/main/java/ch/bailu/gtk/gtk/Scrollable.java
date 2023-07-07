/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkScrollable` is an interface for widgets with native scrolling ability.
 * <br>
 * <br>To implement this interface you should override the
 * <br>[property&#64;Gtk.Scrollable:hadjustment] and
 * <br>[property&#64;Gtk.Scrollable:vadjustment] properties.
 * <br>
 * <br>&#35;&#35; Creating a scrollable widget
 * <br>
 * <br>All scrollable widgets should do the following.
 * <br>
 * <br>- When a parent widget sets the scrollable child widget’s adjustments,
 * <br>  the widget should connect to the [signal&#64;Gtk.Adjustment::value-changed]
 * <br>  signal. The child widget should then populate the adjustments’ properties
 * <br>  as soon as possible, which usually means queueing an allocation right away
 * <br>  and populating the properties in the [vfunc&#64;Gtk.Widget.size_allocate]
 * <br>  implementation.
 * <br>
 * <br>- Because its preferred size is the size for a fully expanded widget,
 * <br>  the scrollable widget must be able to cope with underallocations.
 * <br>  This means that it must accept any value passed to its
 * <br>  [vfunc&#64;Gtk.Widget.size_allocate] implementation.
 * <br>
 * <br>- When the parent allocates space to the scrollable child widget,
 * <br>  the widget must ensure the adjustments’ property values are correct and up
 * <br>  to date, for example using [method&#64;Gtk.Adjustment.configure].
 * <br>
 * <br>- When any of the adjustments emits the [signal&#64;Gtk.Adjustment::value-changed]
 * <br>  signal, the scrollable widget should scroll its contents.
 * <p><a href="https://docs.gtk.org/gtk4/iface.Scrollable.html">https://docs.gtk.org/gtk4/iface.Scrollable.html</a></p>
*/
public class Scrollable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Scrollable.class.getCanonicalName());
    }

    public Scrollable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the size of a non-scrolling border around the
     * <br>outside of the scrollable.
     * <br>
     * <br>An example for this would be treeview headers. GTK can use
     * <br>this information to display overlaid graphics, like the
     * <br>overshoot indication, at the right position.
     * @param border return location for the results
     * @return %TRUE if &#64;border has been set
    */
    public boolean getBorder(@Nonnull Border border)  {
        return JnaScrollable.INST().gtk_scrollable_get_border(asCPointer(), asCPointerNotNull(border));
    }

    /**
     * Retrieves the `GtkAdjustment` used for horizontal scrolling.
     * @return horizontal `GtkAdjustment`.
    */
    public Adjustment getHadjustment()  {
        return new Adjustment(new PointerContainer(JnaScrollable.INST().gtk_scrollable_get_hadjustment(asCPointer())));
    }

    /**
     * Gets the horizontal `GtkScrollablePolicy`.
     * @return The horizontal `GtkScrollablePolicy`.
    */
    public int getHscrollPolicy()  {
        return JnaScrollable.INST().gtk_scrollable_get_hscroll_policy(asCPointer());
    }

    /**
     * Retrieves the `GtkAdjustment` used for vertical scrolling.
     * @return vertical `GtkAdjustment`.
    */
    public Adjustment getVadjustment()  {
        return new Adjustment(new PointerContainer(JnaScrollable.INST().gtk_scrollable_get_vadjustment(asCPointer())));
    }

    /**
     * Gets the vertical `GtkScrollablePolicy`.
     * @return The vertical `GtkScrollablePolicy`.
    */
    public int getVscrollPolicy()  {
        return JnaScrollable.INST().gtk_scrollable_get_vscroll_policy(asCPointer());
    }

    /**
     * Sets the horizontal adjustment of the `GtkScrollable`.
     * @param hadjustment a `GtkAdjustment`
    */
    public void setHadjustment(@Nullable Adjustment hadjustment)  {
        JnaScrollable.INST().gtk_scrollable_set_hadjustment(asCPointer(), asCPointer(hadjustment));
    }

    /**
     * Sets the `GtkScrollablePolicy`.
     * <br>
     * <br>The policy determines whether horizontal scrolling should start
     * <br>below the minimum width or below the natural width.
     * @param policy the horizontal `GtkScrollablePolicy`
    */
    public void setHscrollPolicy(int policy)  {
        JnaScrollable.INST().gtk_scrollable_set_hscroll_policy(asCPointer(), policy);
    }

    /**
     * Sets the vertical adjustment of the `GtkScrollable`.
     * @param vadjustment a `GtkAdjustment`
    */
    public void setVadjustment(@Nullable Adjustment vadjustment)  {
        JnaScrollable.INST().gtk_scrollable_set_vadjustment(asCPointer(), asCPointer(vadjustment));
    }

    /**
     * Sets the `GtkScrollablePolicy`.
     * <br>
     * <br>The policy determines whether vertical scrolling should start
     * <br>below the minimum height or below the natural height.
     * @param policy the vertical `GtkScrollablePolicy`
    */
    public void setVscrollPolicy(int policy)  {
        JnaScrollable.INST().gtk_scrollable_set_vscroll_policy(asCPointer(), policy);
    }

    public static long getTypeID() { 
        return JnaScrollable.INST().gtk_scrollable_get_type(); 
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
*/
