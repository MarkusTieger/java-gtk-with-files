/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkListItemFactory` creates widgets for the items taken from a `GListModel`.
 * <br>
 * <br>This is one of the core concepts of handling list widgets such
 * <br>as [class&#64;Gtk.ListView] or [class&#64;Gtk.GridView].
 * <br>
 * <br>The `GtkListItemFactory` is tasked with creating widgets for items
 * <br>taken from the model when the views need them and updating them as
 * <br>the items displayed by the view change.
 * <br>
 * <br>A view is usually only able to display anything after both a factory
 * <br>and a model have been set on the view. So it is important that you do
 * <br>not skip this step when setting up your first view.
 * <br>
 * <br>Because views do not display the whole list at once but only a few
 * <br>items, they only need to maintain a few widgets at a time. They will
 * <br>instruct the `GtkListItemFactory` to create these widgets and bind them
 * <br>to the items that are currently displayed.
 * <br>
 * <br>As the list model changes or the user scrolls to the list, the items will
 * <br>change and the view will instruct the factory to bind the widgets to those
 * <br>new items.
 * <br>
 * <br>The actual widgets used for displaying those widgets is provided by you.
 * <br>
 * <br>When the factory needs widgets created, it will create a `GtkListItem`
 * <br>and hand it to your code to set up a widget for. This list item will provide
 * <br>various properties with information about what item to display and provide
 * <br>you with some opportunities to configure its behavior. See the
 * <br>[class&#64;Gtk.ListItem] documentation for further details.
 * <br>
 * <br>Various implementations of `GtkListItemFactory` exist to allow you different
 * <br>ways to provide those widgets. The most common implementations are
 * <br>[class&#64;Gtk.BuilderListItemFactory] which takes a `GtkBuilder` .ui file
 * <br>and then creates widgets and manages everything automatically from the
 * <br>information in that file and [class&#64;Gtk.SignalListItemFactory] which allows
 * <br>you to connect to signals with your own code and retain full control over
 * <br>how the widgets are setup and managed.
 * <br>
 * <br>A `GtkListItemFactory` is supposed to be final - that means its behavior should
 * <br>not change and the first widget created from it should behave the same way as
 * <br>the last widget created from it.
 * <br>If you intend to do changes to the behavior, it is recommended that you create
 * <br>a new `GtkListItemFactory` which will allow the views to recreate its widgets.
 * <br>
 * <br>Once you have chosen your factory and created it, you need to set it
 * <br>on the view widget you want to use it with, such as via
 * <br>[method&#64;Gtk.ListView.set_factory]. Reusing factories across different
 * <br>views is allowed, but very uncommon.
 * <p><a href="https://docs.gtk.org/gtk4/class.ListItemFactory.html">https://docs.gtk.org/gtk4/class.ListItemFactory.html</a></p>
*/
public class ListItemFactory extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ListItemFactory.class.getCanonicalName());
    }

    public ListItemFactory(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaListItemFactory.INST().gtk_list_item_factory_get_type(); 
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
