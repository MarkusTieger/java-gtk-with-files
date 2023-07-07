/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkDragIcon` is a `GtkRoot` implementation for drag icons.
 * <br>
 * <br>A drag icon moves with the pointer during a Drag-and-Drop operation
 * <br>and is destroyed when the drag ends.
 * <br>
 * <br>To set up a drag icon and associate it with an ongoing drag operation,
 * <br>use [func&#64;Gtk.DragIcon.get_for_drag] to get the icon for a drag. You can
 * <br>then use it like any other widget and use [method&#64;Gtk.DragIcon.set_child]
 * <br>to set whatever widget should be used for the drag icon.
 * <br>
 * <br>Keep in mind that drag icons do not allow user input.
 * <p><a href="https://docs.gtk.org/gtk4/class.DragIcon.html">https://docs.gtk.org/gtk4/class.DragIcon.html</a></p>
*/
public class DragIcon extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DragIcon.class.getCanonicalName());
    }

    public DragIcon(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the widget currently used as drag icon.
     * @return The drag icon
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaDragIcon.INST().gtk_drag_icon_get_child(asCPointer())));
    }

    /**
     * Sets the widget to display as the drag icon.
     * @param child a `GtkWidget`
    */
    public void setChild(@Nullable Widget child)  {
        JnaDragIcon.INST().gtk_drag_icon_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Creates a widget that can be used as a drag icon for the given
     * <br>&#64;value.
     * <br>
     * <br>Supported types include strings, `GdkRGBA` and `GtkTextBuffer`.
     * <br>If GTK does not know how to create a widget for a given value,
     * <br>it will return %NULL.
     * <br>
     * <br>This method is used to set the default drag icon on drag-and-drop
     * <br>operations started by `GtkDragSource`, so you don't need to set
     * <br>a drag icon using this function there.
     * @param value a `GValue`
     * @return A new `GtkWidget`   for displaying &#64;value as a drag icon.
    */
    public static Widget createWidgetForValue(@Nonnull ch.bailu.gtk.gobject.Value value)  {
        return new Widget(new PointerContainer(JnaDragIcon.INST().gtk_drag_icon_create_widget_for_value(asCPointerNotNull(value))));
    }

    /**
     * Gets the `GtkDragIcon` in use with &#64;drag.
     * <br>
     * <br>If no drag icon exists yet, a new one will be created
     * <br>and shown.
     * @param drag a `GdkDrag`
     * @return the `GtkDragIcon`
    */
    public static Widget getForDrag(@Nonnull ch.bailu.gtk.gdk.Drag drag)  {
        return new Widget(new PointerContainer(JnaDragIcon.INST().gtk_drag_icon_get_for_drag(asCPointerNotNull(drag))));
    }

    /**
     * Creates a `GtkDragIcon` that shows &#64;paintable, and associates
     * <br>it with the drag operation.
     * <br>
     * <br>The hotspot position on the paintable is aligned with the
     * <br>hotspot of the cursor.
     * @param drag a `GdkDrag`
     * @param paintable a `GdkPaintable` to display
     * @param hot_x X coordinate of the hotspot
     * @param hot_y Y coordinate of the hotspot
    */
    public static void setFromPaintable(@Nonnull ch.bailu.gtk.gdk.Drag drag, @Nonnull ch.bailu.gtk.gdk.Paintable paintable, int hot_x, int hot_y)  {
        JnaDragIcon.INST().gtk_drag_icon_set_from_paintable(asCPointerNotNull(drag), asCPointerNotNull(paintable), hot_x, hot_y);
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
     * Implements interface {@link Native}. Call this to get access to interface functions.
     * @return {@link Native}
    */
    public Native asNative() {
        return new Native(cast());
    }

    /**
     * Implements interface {@link Root}. Call this to get access to interface functions.
     * @return {@link Root}
    */
    public Root asRoot() {
        return new Root(cast());
    }

    public static long getTypeID() { 
        return JnaDragIcon.INST().gtk_drag_icon_get_type(); 
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
