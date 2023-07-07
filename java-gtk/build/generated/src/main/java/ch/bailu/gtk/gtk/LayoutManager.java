/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Layout managers are delegate classes that handle the preferred size
 * <br>and the allocation of a widget.
 * <br>
 * <br>You typically subclass `GtkLayoutManager` if you want to implement a
 * <br>layout policy for the children of a widget, or if you want to determine
 * <br>the size of a widget depending on its contents.
 * <br>
 * <br>Each `GtkWidget` can only have a `GtkLayoutManager` instance associated
 * <br>to it at any given time; it is possible, though, to replace the layout
 * <br>manager instance using [method&#64;Gtk.Widget.set_layout_manager].
 * <br>
 * <br>&#35;&#35; Layout properties
 * <br>
 * <br>A layout manager can expose properties for controlling the layout of
 * <br>each child, by creating an object type derived from [class&#64;Gtk.LayoutChild]
 * <br>and installing the properties on it as normal `GObject` properties.
 * <br>
 * <br>Each `GtkLayoutChild` instance storing the layout properties for a
 * <br>specific child is created through the [method&#64;Gtk.LayoutManager.get_layout_child]
 * <br>method; a `GtkLayoutManager` controls the creation of its `GtkLayoutChild`
 * <br>instances by overriding the GtkLayoutManagerClass.create_layout_child()
 * <br>virtual function. The typical implementation should look like:
 * <br>
 * <br>```c
 * <br>static GtkLayoutChild *
 * <br>create_layout_child (GtkLayoutManager *manager,
 * <br>                     GtkWidget        *container,
 * <br>                     GtkWidget        *child)
 * <br>{
 * <br>  return g_object_new (your_layout_child_get_type (),
 * <br>                       &quot;layout-manager&quot;, manager,
 * <br>                       &quot;child-widget&quot;, child,
 * <br>                       NULL);
 * <br>}
 * <br>```
 * <br>
 * <br>The [property&#64;Gtk.LayoutChild:layout-manager] and
 * <br>[property&#64;Gtk.LayoutChild:child-widget] properties
 * <br>on the newly created `GtkLayoutChild` instance are mandatory. The
 * <br>`GtkLayoutManager` will cache the newly created `GtkLayoutChild` instance
 * <br>until the widget is removed from its parent, or the parent removes the
 * <br>layout manager.
 * <br>
 * <br>Each `GtkLayoutManager` instance creating a `GtkLayoutChild` should use
 * <br>[method&#64;Gtk.LayoutManager.get_layout_child] every time it needs to query
 * <br>the layout properties; each `GtkLayoutChild` instance should call
 * <br>[method&#64;Gtk.LayoutManager.layout_changed] every time a property is
 * <br>updated, in order to queue a new size measuring and allocation.
 * <p><a href="https://docs.gtk.org/gtk4/class.LayoutManager.html">https://docs.gtk.org/gtk4/class.LayoutManager.html</a></p>
*/
public class LayoutManager extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(LayoutManager.class.getCanonicalName());
    }

    public LayoutManager(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Assigns the given &#64;width, &#64;height, and &#64;baseline to
     * <br>a &#64;widget, and computes the position and sizes of the children of
     * <br>the &#64;widget using the layout management policy of &#64;manager.
     * @param widget the `GtkWidget` using &#64;manager
     * @param width the new width of the &#64;widget
     * @param height the new height of the &#64;widget
     * @param baseline the baseline position of the &#64;widget, or -1
    */
    public void allocate(@Nonnull Widget widget, int width, int height, int baseline)  {
        JnaLayoutManager.INST().gtk_layout_manager_allocate(asCPointer(), asCPointerNotNull(widget), width, height, baseline);
    }

    /**
     * Retrieves a `GtkLayoutChild` instance for the `GtkLayoutManager`,
     * <br>creating one if necessary.
     * <br>
     * <br>The &#64;child widget must be a child of the widget using &#64;manager.
     * <br>
     * <br>The `GtkLayoutChild` instance is owned by the `GtkLayoutManager`,
     * <br>and is guaranteed to exist as long as &#64;child is a child of the
     * <br>`GtkWidget` using the given `GtkLayoutManager`.
     * @param child a `GtkWidget`
     * @return a `GtkLayoutChild`
    */
    public LayoutChild getLayoutChild(@Nonnull Widget child)  {
        return new LayoutChild(new PointerContainer(JnaLayoutManager.INST().gtk_layout_manager_get_layout_child(asCPointer(), asCPointerNotNull(child))));
    }

    /**
     * Retrieves the request mode of &#64;manager.
     * @return a `GtkSizeRequestMode`
    */
    public int getRequestMode()  {
        return JnaLayoutManager.INST().gtk_layout_manager_get_request_mode(asCPointer());
    }

    /**
     * Retrieves the `GtkWidget` using the given `GtkLayoutManager`.
     * @return a `GtkWidget`
    */
    public Widget getWidget()  {
        return new Widget(new PointerContainer(JnaLayoutManager.INST().gtk_layout_manager_get_widget(asCPointer())));
    }

    /**
     * Queues a resize on the `GtkWidget` using &#64;manager, if any.
     * <br>
     * <br>This function should be called by subclasses of `GtkLayoutManager`
     * <br>in response to changes to their layout management policies.
    */
    public void layoutChanged()  {
        JnaLayoutManager.INST().gtk_layout_manager_layout_changed(asCPointer());
    }

    /**
     * Measures the size of the &#64;widget using &#64;manager, for the
     * <br>given &#64;orientation and size.
     * <br>
     * <br>See the [class&#64;Gtk.Widget] documentation on layout management for
     * <br>more details.
     * @param widget the `GtkWidget` using &#64;manager
     * @param orientation the orientation to measure
     * @param for_size Size for the opposite of &#64;orientation; for instance, if   the &#64;orientation is %GTK_ORIENTATION_HORIZONTAL, this is the height   of the widget; if the &#64;orientation is %GTK_ORIENTATION_VERTICAL, this   is the width of the widget. This allows to measure the height for the   given width, and the width for the given height. Use -1 if the size   is not known
     * @param minimum the minimum size for the given size and   orientation
     * @param natural the natural, or preferred size for the   given size and orientation
     * @param minimum_baseline the baseline position for the   minimum size
     * @param natural_baseline the baseline position for the   natural size
    */
    public void measure(@Nonnull Widget widget, int orientation, int for_size, @Nullable ch.bailu.gtk.type.Int minimum, @Nullable ch.bailu.gtk.type.Int natural, @Nullable ch.bailu.gtk.type.Int minimum_baseline, @Nullable ch.bailu.gtk.type.Int natural_baseline)  {
        JnaLayoutManager.INST().gtk_layout_manager_measure(asCPointer(), asCPointerNotNull(widget), orientation, for_size, asCPointer(minimum), asCPointer(natural), asCPointer(minimum_baseline), asCPointer(natural_baseline));
    }

    public static long getTypeID() { 
        return JnaLayoutManager.INST().gtk_layout_manager_get_type(); 
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
