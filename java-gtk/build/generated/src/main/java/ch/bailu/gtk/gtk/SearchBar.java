/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSearchBar` is a container made to have a search entry.
 * <br>
 * <br>![An example GtkSearchBar](search-bar.png)
 * <br>
 * <br>It can also contain additional widgets, such as drop-down menus,
 * <br>or buttons.  The search bar would appear when a search is started
 * <br>through typing on the keyboard, or the application’s search mode
 * <br>is toggled on.
 * <br>
 * <br>For keyboard presses to start a search, the search bar must be told
 * <br>of a widget to capture key events from through
 * <br>[method&#64;Gtk.SearchBar.set_key_capture_widget]. This widget will
 * <br>typically be the top-level window, or a parent container of the
 * <br>search bar. Common shortcuts such as Ctrl+F should be handled as an
 * <br>application action, or through the menu items.
 * <br>
 * <br>You will also need to tell the search bar about which entry you
 * <br>are using as your search entry using [method&#64;Gtk.SearchBar.connect_entry].
 * <br>
 * <br>&#35;&#35; Creating a search bar
 * <br>
 * <br>The following example shows you how to create a more complex search
 * <br>entry.
 * <br>
 * <br>[A simple example](https://gitlab.gnome.org/GNOME/gtk/tree/main/examples/search-bar.c)
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>searchbar
 * <br>╰── revealer
 * <br>    ╰── box
 * <br>         ├── [child]
 * <br>         ╰── [button.close]
 * <br>```
 * <br>
 * <br>`GtkSearchBar` has a main CSS node with name searchbar. It has a child
 * <br>node with name revealer that contains a node with name box. The box node
 * <br>contains both the CSS node of the child widget as well as an optional button
 * <br>node which gets the .close style class applied.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkSearchBar` uses the %GTK_ACCESSIBLE_ROLE_SEARCH role.
 * <p><a href="https://docs.gtk.org/gtk4/class.SearchBar.html">https://docs.gtk.org/gtk4/class.SearchBar.html</a></p>
*/
public class SearchBar extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SearchBar.class.getCanonicalName());
    }

    public SearchBar(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkSearchBar`.
     * <br>
     * <br>You will need to tell it about which widget is going to be your text
     * <br>entry using [method&#64;Gtk.SearchBar.connect_entry].
    */
    public SearchBar() {
        super(cast(JnaSearchBar.INST().gtk_search_bar_new()));
    }

    /**
     * Connects the `GtkEditable widget passed as the one to be used in
     * <br>this search bar.
     * <br>
     * <br>The entry should be a descendant of the search bar. Calling this
     * <br>function manually is only required if the entry isn’t the direct
     * <br>child of the search bar (as in our main example).
     * @param entry a `GtkEditable`
    */
    public void connectEntry(@Nonnull Editable entry)  {
        JnaSearchBar.INST().gtk_search_bar_connect_entry(asCPointer(), asCPointerNotNull(entry));
    }

    /**
     * Gets the child widget of &#64;bar.
     * @return the child widget of &#64;bar
    */
    public Widget getChild()  {
        return new Widget(new PointerContainer(JnaSearchBar.INST().gtk_search_bar_get_child(asCPointer())));
    }

    /**
     * Gets the widget that &#64;bar is capturing key events from.
     * @return The key capture widget.
    */
    public Widget getKeyCaptureWidget()  {
        return new Widget(new PointerContainer(JnaSearchBar.INST().gtk_search_bar_get_key_capture_widget(asCPointer())));
    }

    /**
     * Returns whether the search mode is on or off.
     * @return whether search mode is toggled on
    */
    public boolean getSearchMode()  {
        return JnaSearchBar.INST().gtk_search_bar_get_search_mode(asCPointer());
    }

    /**
     * Returns whether the close button is shown.
     * @return whether the close button is shown
    */
    public boolean getShowCloseButton()  {
        return JnaSearchBar.INST().gtk_search_bar_get_show_close_button(asCPointer());
    }

    /**
     * Sets the child widget of &#64;bar.
     * @param child the child widget
    */
    public void setChild(@Nullable Widget child)  {
        JnaSearchBar.INST().gtk_search_bar_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets &#64;widget as the widget that &#64;bar will capture key events
     * <br>from.
     * <br>
     * <br>If key events are handled by the search bar, the bar will
     * <br>be shown, and the entry populated with the entered text.
     * <br>
     * <br>Note that despite the name of this function, the events
     * <br>are only 'captured' in the bubble phase, which means that
     * <br>editable child widgets of &#64;widget will receive text input
     * <br>before it gets captured. If that is not desired, you can
     * <br>capture and forward the events yourself with
     * <br>[method&#64;Gtk.EventControllerKey.forward].
     * @param widget a `GtkWidget`
    */
    public void setKeyCaptureWidget(@Nullable Widget widget)  {
        JnaSearchBar.INST().gtk_search_bar_set_key_capture_widget(asCPointer(), asCPointer(widget));
    }

    /**
     * Switches the search mode on or off.
     * @param search_mode the new state of the search mode
    */
    public void setSearchMode(boolean search_mode)  {
        JnaSearchBar.INST().gtk_search_bar_set_search_mode(asCPointer(), search_mode);
    }

    /**
     * Shows or hides the close button.
     * <br>
     * <br>Applications that already have a “search” toggle button should not
     * <br>show a close button in their search bar, as it duplicates the role
     * <br>of the toggle button.
     * @param visible whether the close button will be shown or not
    */
    public void setShowCloseButton(boolean visible)  {
        JnaSearchBar.INST().gtk_search_bar_set_show_close_button(asCPointer(), visible);
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
        return JnaSearchBar.INST().gtk_search_bar_get_type(); 
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
