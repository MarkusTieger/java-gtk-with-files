/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSizeGroup` groups widgets together so they all request the same size.
 * <br>
 * <br>This is typically useful when you want a column of widgets to have the
 * <br>same size, but you can’t use a `GtkGrid`.
 * <br>
 * <br>In detail, the size requested for each widget in a `GtkSizeGroup` is
 * <br>the maximum of the sizes that would have been requested for each
 * <br>widget in the size group if they were not in the size group. The mode
 * <br>of the size group (see [method&#64;Gtk.SizeGroup.set_mode]) determines whether
 * <br>this applies to the horizontal size, the vertical size, or both sizes.
 * <br>
 * <br>Note that size groups only affect the amount of space requested, not
 * <br>the size that the widgets finally receive. If you want the widgets in
 * <br>a `GtkSizeGroup` to actually be the same size, you need to pack them in
 * <br>such a way that they get the size they request and not more.
 * <br>
 * <br>`GtkSizeGroup` objects are referenced by each widget in the size group,
 * <br>so once you have added all widgets to a `GtkSizeGroup`, you can drop
 * <br>the initial reference to the size group with g_object_unref(). If the
 * <br>widgets in the size group are subsequently destroyed, then they will
 * <br>be removed from the size group and drop their references on the size
 * <br>group; when all widgets have been removed, the size group will be
 * <br>freed.
 * <br>
 * <br>Widgets can be part of multiple size groups; GTK will compute the
 * <br>horizontal size of a widget from the horizontal requisition of all
 * <br>widgets that can be reached from the widget by a chain of size groups
 * <br>of type %GTK_SIZE_GROUP_HORIZONTAL or %GTK_SIZE_GROUP_BOTH, and the
 * <br>vertical size from the vertical requisition of all widgets that can be
 * <br>reached from the widget by a chain of size groups of type
 * <br>%GTK_SIZE_GROUP_VERTICAL or %GTK_SIZE_GROUP_BOTH.
 * <br>
 * <br>Note that only non-contextual sizes of every widget are ever consulted
 * <br>by size groups (since size groups have no knowledge of what size a widget
 * <br>will be allocated in one dimension, it cannot derive how much height
 * <br>a widget will receive for a given width). When grouping widgets that
 * <br>trade height for width in mode %GTK_SIZE_GROUP_VERTICAL or %GTK_SIZE_GROUP_BOTH:
 * <br>the height for the minimum width will be the requested height for all
 * <br>widgets in the group. The same is of course true when horizontally grouping
 * <br>width for height widgets.
 * <br>
 * <br>Widgets that trade height-for-width should set a reasonably large minimum
 * <br>width by way of [property&#64;Gtk.Label:width-chars] for instance. Widgets with
 * <br>static sizes as well as widgets that grow (such as ellipsizing text) need no
 * <br>such considerations.
 * <br>
 * <br>&#35; GtkSizeGroup as GtkBuildable
 * <br>
 * <br>Size groups can be specified in a UI definition by placing an &lt;object&gt;
 * <br>element with `class=&quot;GtkSizeGroup&quot;` somewhere in the UI definition. The
 * <br>widgets that belong to the size group are specified by a &lt;widgets&gt; element
 * <br>that may contain multiple &lt;widget&gt; elements, one for each member of the
 * <br>size group. The ”name” attribute gives the id of the widget.
 * <br>
 * <br>An example of a UI definition fragment with `GtkSizeGroup`:
 * <br>```xml
 * <br>&lt;object class=&quot;GtkSizeGroup&quot;&gt;
 * <br>  &lt;property name=&quot;mode&quot;&gt;horizontal&lt;/property&gt;
 * <br>  &lt;widgets&gt;
 * <br>    &lt;widget name=&quot;radio1&quot;/&gt;
 * <br>    &lt;widget name=&quot;radio2&quot;/&gt;
 * <br>  &lt;/widgets&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.SizeGroup.html">https://docs.gtk.org/gtk4/class.SizeGroup.html</a></p>
*/
public class SizeGroup extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SizeGroup.class.getCanonicalName());
    }

    public SizeGroup(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a new `GtkSizeGroup`.
     * @param mode the mode for the new size group.
    */
    public SizeGroup(int mode) {
        super(cast(JnaSizeGroup.INST().gtk_size_group_new(mode)));
    }

    /**
     * Adds a widget to a `GtkSizeGroup`.
     * <br>
     * <br>In the future, the requisition
     * <br>of the widget will be determined as the maximum of its requisition
     * <br>and the requisition of the other widgets in the size group.
     * <br>Whether this applies horizontally, vertically, or in both directions
     * <br>depends on the mode of the size group.
     * <br>See [method&#64;Gtk.SizeGroup.set_mode].
     * <br>
     * <br>When the widget is destroyed or no longer referenced elsewhere, it
     * <br>will be removed from the size group.
     * @param widget the `GtkWidget` to add
    */
    public void addWidget(@Nonnull Widget widget)  {
        JnaSizeGroup.INST().gtk_size_group_add_widget(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Gets the current mode of the size group.
     * @return the current mode of the size group.
    */
    public int getMode()  {
        return JnaSizeGroup.INST().gtk_size_group_get_mode(asCPointer());
    }

    /**
     * Returns the list of widgets associated with &#64;size_group.
     * @return a `GSList` of   widgets. The list is owned by GTK and should not be modified.
    */
    public ch.bailu.gtk.glib.SList getWidgets()  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaSizeGroup.INST().gtk_size_group_get_widgets(asCPointer())));
    }

    /**
     * Removes a widget from a `GtkSizeGroup`.
     * @param widget the `GtkWidget` to remove
    */
    public void removeWidget(@Nonnull Widget widget)  {
        JnaSizeGroup.INST().gtk_size_group_remove_widget(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Sets the `GtkSizeGroupMode` of the size group.
     * <br>
     * <br>The mode of the size group determines whether the widgets in the
     * <br>size group should all have the same horizontal requisition
     * <br>(%GTK_SIZE_GROUP_HORIZONTAL) all have the same vertical requisition
     * <br>(%GTK_SIZE_GROUP_VERTICAL), or should all have the same requisition
     * <br>in both directions (%GTK_SIZE_GROUP_BOTH).
     * @param mode the mode to set for the size group.
    */
    public void setMode(int mode)  {
        JnaSizeGroup.INST().gtk_size_group_set_mode(asCPointer(), mode);
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    public static long getTypeID() { 
        return JnaSizeGroup.INST().gtk_size_group_get_type(); 
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
