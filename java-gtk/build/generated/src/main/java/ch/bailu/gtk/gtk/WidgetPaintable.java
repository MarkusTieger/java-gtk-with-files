/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkWidgetPaintable` is a `GdkPaintable` that displays the contents
 * <br>of a widget.
 * <br>
 * <br>`GtkWidgetPaintable` will also take care of the widget not being in a
 * <br>state where it can be drawn (like when it isn't shown) and just draw
 * <br>nothing or where it does not have a size (like when it is hidden) and
 * <br>report no size in that case.
 * <br>
 * <br>Of course, `GtkWidgetPaintable` allows you to monitor widgets for size
 * <br>changes by emitting the [signal&#64;Gdk.Paintable::invalidate-size] signal
 * <br>whenever the size of the widget changes as well as for visual changes by
 * <br>emitting the [signal&#64;Gdk.Paintable::invalidate-contents] signal whenever
 * <br>the widget changes.
 * <br>
 * <br>You can use a `GtkWidgetPaintable` everywhere a `GdkPaintable` is allowed,
 * <br>including using it on a `GtkPicture` (or one of its parents) that it was
 * <br>set on itself via gtk_picture_set_paintable(). The paintable will take care
 * <br>of recursion when this happens. If you do this however, ensure that the
 * <br>[property&#64;Gtk.Picture:can-shrink] property is set to %TRUE or you might
 * <br>end up with an infinitely growing widget.
 * <p><a href="https://docs.gtk.org/gtk4/class.WidgetPaintable.html">https://docs.gtk.org/gtk4/class.WidgetPaintable.html</a></p>
*/
public class WidgetPaintable extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(WidgetPaintable.class.getCanonicalName());
    }

    public WidgetPaintable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new widget paintable observing the given widget.
     * @param widget a `GtkWidget`
    */
    public WidgetPaintable(@Nullable Widget widget) {
        super(cast(JnaWidgetPaintable.INST().gtk_widget_paintable_new(asCPointer(widget))));
    }

    /**
     * Returns the widget that is observed or %NULL if none.
     * @return the observed widget.
    */
    public Widget getWidget()  {
        return new Widget(new PointerContainer(JnaWidgetPaintable.INST().gtk_widget_paintable_get_widget(asCPointer())));
    }

    /**
     * Sets the widget that should be observed.
     * @param widget the widget to observe
    */
    public void setWidget(@Nullable Widget widget)  {
        JnaWidgetPaintable.INST().gtk_widget_paintable_set_widget(asCPointer(), asCPointer(widget));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gdk.Paintable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gdk.Paintable}
    */
    public ch.bailu.gtk.gdk.Paintable asPaintable() {
        return new ch.bailu.gtk.gdk.Paintable(cast());
    }

    public static long getTypeID() { 
        return JnaWidgetPaintable.INST().gtk_widget_paintable_get_type(); 
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
