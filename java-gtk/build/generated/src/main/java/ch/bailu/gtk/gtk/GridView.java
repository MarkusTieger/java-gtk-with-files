/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGridView` presents a large dynamic grid of items.
 * <br>
 * <br>`GtkGridView` uses its factory to generate one child widget for each
 * <br>visible item and shows them in a grid. The orientation of the grid view
 * <br>determines if the grid reflows vertically or horizontally.
 * <br>
 * <br>`GtkGridView` allows the user to select items according to the selection
 * <br>characteristics of the model. For models that allow multiple selected items,
 * <br>it is possible to turn on _rubberband selection_, using
 * <br>[property&#64;Gtk.GridView:enable-rubberband].
 * <br>
 * <br>To learn more about the list widget framework, see the
 * <br>[overview](section-list-widget.html).
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>gridview
 * <br>├── child[.activatable]
 * <br>│
 * <br>├── child[.activatable]
 * <br>│
 * <br>┊
 * <br>╰── [rubberband]
 * <br>```
 * <br>
 * <br>`GtkGridView` uses a single CSS node with name `gridview`. Each child uses
 * <br>a single CSS node with name `child`. If the [property&#64;Gtk.ListItem:activatable]
 * <br>property is set, the corresponding row will have the `.activatable` style
 * <br>class. For rubberband selection, a subnode with name `rubberband` is used.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkGridView` uses the %GTK_ACCESSIBLE_ROLE_GRID role, and the items
 * <br>use the %GTK_ACCESSIBLE_ROLE_GRID_CELL role.
 * <p><a href="https://docs.gtk.org/gtk4/class.GridView.html">https://docs.gtk.org/gtk4/class.GridView.html</a></p>
*/
public class GridView extends ListBase {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GridView.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted when a cell has been activated by the user,
         * <br>usually via activating the GtkGridView|list.activate-item action.
         * <br>
         * <br>This allows for a convenient way to handle activation in a gridview.
         * <br>See [property&#64;Gtk.ListItem:activatable] for details on how to use
         * <br>this signal.
         * @param position position of item to activate
        */
        void onActivate(int position);
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaGridView.OnActivate) (__self, _position, __data) -> in.onActivate(_position);
    }

    public GridView(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkGridView` that uses the given &#64;factory for
     * <br>mapping items to widgets.
     * <br>
     * <br>The function takes ownership of the
     * <br>arguments, so you can write code like
     * <br>```c
     * <br>grid_view = gtk_grid_view_new (create_model (),
     * <br>  gtk_builder_list_item_factory_new_from_resource (&quot;/resource.ui&quot;));
     * <br>```
     * @param model the model to use
     * @param factory The factory to populate items with
    */
    public GridView(@Nullable SelectionModel model, @Nullable ListItemFactory factory) {
        super(cast(JnaGridView.INST().gtk_grid_view_new(asCPointer(model), asCPointer(factory))));
    }

    /**
     * Returns whether rows can be selected by dragging with the mouse.
     * @return %TRUE if rubberband selection is enabled
    */
    public boolean getEnableRubberband()  {
        return JnaGridView.INST().gtk_grid_view_get_enable_rubberband(asCPointer());
    }

    /**
     * Gets the factory that's currently used to populate list items.
     * @return The factory in use
    */
    public ListItemFactory getFactory()  {
        return new ListItemFactory(new PointerContainer(JnaGridView.INST().gtk_grid_view_get_factory(asCPointer())));
    }

    /**
     * Gets the maximum number of columns that the grid will use.
     * @return The maximum number of columns
    */
    public int getMaxColumns()  {
        return JnaGridView.INST().gtk_grid_view_get_max_columns(asCPointer());
    }

    /**
     * Gets the minimum number of columns that the grid will use.
     * @return The minimum number of columns
    */
    public int getMinColumns()  {
        return JnaGridView.INST().gtk_grid_view_get_min_columns(asCPointer());
    }

    /**
     * Gets the model that's currently used to read the items displayed.
     * @return The model in use
    */
    public SelectionModel getModel()  {
        return new SelectionModel(new PointerContainer(JnaGridView.INST().gtk_grid_view_get_model(asCPointer())));
    }

    /**
     * Returns whether items will be activated on single click and
     * <br>selected on hover.
     * @return %TRUE if items are activated on single click
    */
    public boolean getSingleClickActivate()  {
        return JnaGridView.INST().gtk_grid_view_get_single_click_activate(asCPointer());
    }

    /**
     * Sets whether selections can be changed by dragging with the mouse.
     * @param enable_rubberband %TRUE to enable rubberband selection
    */
    public void setEnableRubberband(boolean enable_rubberband)  {
        JnaGridView.INST().gtk_grid_view_set_enable_rubberband(asCPointer(), enable_rubberband);
    }

    /**
     * Sets the `GtkListItemFactory` to use for populating list items.
     * @param factory the factory to use
    */
    public void setFactory(@Nullable ListItemFactory factory)  {
        JnaGridView.INST().gtk_grid_view_set_factory(asCPointer(), asCPointer(factory));
    }

    /**
     * Sets the maximum number of columns to use.
     * <br>
     * <br>This number must be at least 1.
     * <br>
     * <br>If &#64;max_columns is smaller than the minimum set via
     * <br>[method&#64;Gtk.GridView.set_min_columns], that value is used instead.
     * @param max_columns The maximum number of columns
    */
    public void setMaxColumns(int max_columns)  {
        JnaGridView.INST().gtk_grid_view_set_max_columns(asCPointer(), max_columns);
    }

    /**
     * Sets the minimum number of columns to use.
     * <br>
     * <br>This number must be at least 1.
     * <br>
     * <br>If &#64;min_columns is smaller than the minimum set via
     * <br>[method&#64;Gtk.GridView.set_max_columns], that value is ignored.
     * @param min_columns The minimum number of columns
    */
    public void setMinColumns(int min_columns)  {
        JnaGridView.INST().gtk_grid_view_set_min_columns(asCPointer(), min_columns);
    }

    /**
     * Sets the imodel to use.
     * <br>
     * <br>This must be a [iface&#64;Gtk.SelectionModel].
     * @param model the model to use
    */
    public void setModel(@Nullable SelectionModel model)  {
        JnaGridView.INST().gtk_grid_view_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Sets whether items should be activated on single click and
     * <br>selected on hover.
     * @param single_click_activate %TRUE to activate items on single click
    */
    public void setSingleClickActivate(boolean single_click_activate)  {
        JnaGridView.INST().gtk_grid_view_set_single_click_activate(asCPointer(), single_click_activate);
    }

    public final static String SIGNAL_ON_ACTIVATE = "activate";
    
    /**
     * Connect to signal "activate".
     * <br>See {@link OnActivate#onActivate} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivate(OnActivate signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE, toOnActivate(signal));
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
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    /**
     * Implements interface {@link Scrollable}. Call this to get access to interface functions.
     * @return {@link Scrollable}
    */
    public Scrollable asScrollable() {
        return new Scrollable(cast());
    }

    public static long getTypeID() { 
        return JnaGridView.INST().gtk_grid_view_get_type(); 
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
