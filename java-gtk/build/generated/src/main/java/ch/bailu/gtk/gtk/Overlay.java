/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkOverlay` is a container which contains a single main child, on top
 * <br>of which it can place “overlay” widgets.
 * <br>
 * <br>![An example GtkOverlay](overlay.png)
 * <br>
 * <br>The position of each overlay widget is determined by its
 * <br>[property&#64;Gtk.Widget:halign] and [property&#64;Gtk.Widget:valign]
 * <br>properties. E.g. a widget with both alignments set to %GTK_ALIGN_START
 * <br>will be placed at the top left corner of the `GtkOverlay` container,
 * <br>whereas an overlay with halign set to %GTK_ALIGN_CENTER and valign set
 * <br>to %GTK_ALIGN_END will be placed a the bottom edge of the `GtkOverlay`,
 * <br>horizontally centered. The position can be adjusted by setting the margin
 * <br>properties of the child to non-zero values.
 * <br>
 * <br>More complicated placement of overlays is possible by connecting
 * <br>to the [signal&#64;Gtk.Overlay::get-child-position] signal.
 * <br>
 * <br>An overlay’s minimum and natural sizes are those of its main child.
 * <br>The sizes of overlay children are not considered when measuring these
 * <br>preferred sizes.
 * <br>
 * <br>&#35; GtkOverlay as GtkBuildable
 * <br>
 * <br>The `GtkOverlay` implementation of the `GtkBuildable` interface
 * <br>supports placing a child as an overlay by specifying “overlay” as
 * <br>the “type” attribute of a `&lt;child&gt;` element.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkOverlay` has a single CSS node with the name “overlay”. Overlay children
 * <br>whose alignments cause them to be positioned at an edge get the style classes
 * <br>“.left”, “.right”, “.top”, and/or “.bottom” according to their position.
 * <p><a href="https://docs.gtk.org/gtk4/class.Overlay.html">https://docs.gtk.org/gtk4/class.Overlay.html</a></p>
*/
public class Overlay extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Overlay.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetChildPosition {
        /**
         * Emitted to determine the position and size of any overlay
         * <br>child widgets.
         * <br>
         * <br>A handler for this signal should fill &#64;allocation with
         * <br>the desired position and size for &#64;widget, relative to
         * <br>the 'main' child of &#64;overlay.
         * <br>
         * <br>The default handler for this signal uses the &#64;widget's
         * <br>halign and valign properties to determine the position
         * <br>and gives the widget its natural size (except that an
         * <br>alignment of %GTK_ALIGN_FILL will cause the overlay to
         * <br>be full-width/height). If the main child is a
         * <br>`GtkScrolledWindow`, the overlays are placed relative
         * <br>to its contents.
         * @param widget the child widget to position
         * @param allocation return   location for the allocation
         * @return %TRUE if the &#64;allocation has been filled
        */
        boolean onGetChildPosition(@Nonnull Widget widget, @Nonnull ch.bailu.gtk.gdk.Rectangle allocation);
    }
    
    private static com.sun.jna.Callback toOnGetChildPosition(OnGetChildPosition in) {
        return (in == null) ? null: (JnaOverlay.OnGetChildPosition) (__self, _widget, _allocation, __data) -> in.onGetChildPosition(new Widget(new PointerContainer(_widget)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_allocation)));
    }

    public Overlay(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkOverlay`.
    */
    public Overlay() {
        super(cast(JnaOverlay.INST().gtk_overlay_new()));
    }

    /**
     * Adds &#64;widget to &#64;overlay.
     * <br>
     * <br>The widget will be stacked on top of the main widget
     * <br>added with [method&#64;Gtk.Overlay.set_child].
     * <br>
     * <br>The position at which &#64;widget is placed is determined
     * <br>from its [property&#64;Gtk.Widget:halign] and
     * <br>[property&#64;Gtk.Widget:valign] properties.
     * @param widget a `GtkWidget` to be added to the container
    */
    public void addOverlay(@Nonnull Widget widget)  {
        JnaOverlay.INST().gtk_overlay_add_overlay(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Gets the child widget of &#64;overlay.
     * @return the child widget of &#64;overlay
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaOverlay.INST().gtk_overlay_get_child(asCPointer())));
    }

    /**
     * Gets whether &#64;widget should be clipped within the parent.
     * @param widget an overlay child of `GtkOverlay`
     * @return whether the widget is clipped within the parent.
    */
    public boolean getClipOverlay(@Nonnull Widget widget)  {
        return JnaOverlay.INST().gtk_overlay_get_clip_overlay(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Gets whether &#64;widget's size is included in the measurement of
     * <br>&#64;overlay.
     * @param widget an overlay child of `GtkOverlay`
     * @return whether the widget is measured
    */
    public boolean getMeasureOverlay(@Nonnull Widget widget)  {
        return JnaOverlay.INST().gtk_overlay_get_measure_overlay(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Removes an overlay that was added with gtk_overlay_add_overlay().
     * @param widget a `GtkWidget` to be removed
    */
    public void removeOverlay(@Nonnull Widget widget)  {
        JnaOverlay.INST().gtk_overlay_remove_overlay(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Sets the child widget of &#64;overlay.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaOverlay.INST().gtk_overlay_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets whether &#64;widget should be clipped within the parent.
     * @param widget an overlay child of `GtkOverlay`
     * @param clip_overlay whether the child should be clipped
    */
    public void setClipOverlay(@Nonnull Widget widget, boolean clip_overlay)  {
        JnaOverlay.INST().gtk_overlay_set_clip_overlay(asCPointer(), asCPointerNotNull(widget), clip_overlay);
    }

    /**
     * Sets whether &#64;widget is included in the measured size of &#64;overlay.
     * <br>
     * <br>The overlay will request the size of the largest child that has
     * <br>this property set to %TRUE. Children who are not included may
     * <br>be drawn outside of &#64;overlay's allocation if they are too large.
     * @param widget an overlay child of `GtkOverlay`
     * @param measure whether the child should be measured
    */
    public void setMeasureOverlay(@Nonnull Widget widget, boolean measure)  {
        JnaOverlay.INST().gtk_overlay_set_measure_overlay(asCPointer(), asCPointerNotNull(widget), measure);
    }

    public final static String SIGNAL_ON_GET_CHILD_POSITION = "get-child-position";
    
    /**
     * Connect to signal "get-child-position".
     * <br>See {@link OnGetChildPosition#onGetChildPosition} for signal description.
     * <br>Field {@link #SIGNAL_ON_GET_CHILD_POSITION} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onGetChildPosition(OnGetChildPosition signal) {
        return connectSignal(SIGNAL_ON_GET_CHILD_POSITION, toOnGetChildPosition(signal));
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
        return JnaOverlay.INST().gtk_overlay_get_type(); 
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
