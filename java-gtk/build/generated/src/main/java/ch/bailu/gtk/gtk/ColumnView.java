/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkColumnView` presents a large dynamic list of items using multiple columns
 * <br>with headers.
 * <br>
 * <br>`GtkColumnView` uses the factories of its columns to generate a cell widget for
 * <br>each column, for each visible item and displays them together as the row for
 * <br>this item.
 * <br>
 * <br>The [property&#64;Gtk.ColumnView:show-row-separators] and
 * <br>[property&#64;Gtk.ColumnView:show-column-separators] properties offer a simple way
 * <br>to display separators between the rows or columns.
 * <br>
 * <br>`GtkColumnView` allows the user to select items according to the selection
 * <br>characteristics of the model. For models that allow multiple selected items,
 * <br>it is possible to turn on *rubberband selection*, using
 * <br>[property&#64;Gtk.ColumnView:enable-rubberband].
 * <br>
 * <br>The column view supports sorting that can be customized by the user by
 * <br>clicking on column headers. To set this up, the `GtkSorter` returned by
 * <br>[method&#64;Gtk.ColumnView.get_sorter] must be attached to a sort model for the
 * <br>data that the view is showing, and the columns must have sorters attached to
 * <br>them by calling [method&#64;Gtk.ColumnViewColumn.set_sorter]. The initial sort
 * <br>order can be set with [method&#64;Gtk.ColumnView.sort_by_column].
 * <br>
 * <br>The column view also supports interactive resizing and reordering of
 * <br>columns, via Drag-and-Drop of the column headers. This can be enabled or
 * <br>disabled with the [property&#64;Gtk.ColumnView:reorderable] and
 * <br>[property&#64;Gtk.ColumnViewColumn:resizable] properties.
 * <br>
 * <br>To learn more about the list widget framework, see the
 * <br>[overview](section-list-widget.html).
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>columnview[.column-separators][.rich-list][.navigation-sidebar][.data-table]
 * <br>├── header
 * <br>│   ├── &lt;column header&gt;
 * <br>┊   ┊
 * <br>│   ╰── &lt;column header&gt;
 * <br>│
 * <br>├── listview
 * <br>│
 * <br>┊
 * <br>╰── [rubberband]
 * <br>```
 * <br>
 * <br>`GtkColumnView` uses a single CSS node named columnview. It may carry the
 * <br>.column-separators style class, when [property&#64;Gtk.ColumnView:show-column-separators]
 * <br>property is set. Header widgets appear below a node with name header.
 * <br>The rows are contained in a `GtkListView` widget, so there is a listview
 * <br>node with the same structure as for a standalone `GtkListView` widget.
 * <br>If [property&#64;Gtk.ColumnView:show-row-separators] is set, it will be passed
 * <br>on to the list view, causing its CSS node to carry the .separators style class.
 * <br>For rubberband selection, a node with name rubberband is used.
 * <br>
 * <br>The main columnview node may also carry style classes to select
 * <br>the style of [list presentation](section-list-widget.html&#35;list-styles):
 * <br>.rich-list, .navigation-sidebar or .data-table.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkColumnView` uses the %GTK_ACCESSIBLE_ROLE_TREE_GRID role, header title
 * <br>widgets are using the %GTK_ACCESSIBLE_ROLE_COLUMN_HEADER role. The row widgets
 * <br>are using the %GTK_ACCESSIBLE_ROLE_ROW role, and individual cells are using
 * <br>the %GTK_ACCESSIBLE_ROLE_GRID_CELL role
 * <p><a href="https://docs.gtk.org/gtk4/class.ColumnView.html">https://docs.gtk.org/gtk4/class.ColumnView.html</a></p>
*/
public class ColumnView extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ColumnView.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted when a row has been activated by the user, usually via activating
         * <br>the GtkListBase|list.activate-item action.
         * <br>
         * <br>This allows for a convenient way to handle activation in a columnview.
         * <br>See [method&#64;Gtk.ListItem.set_activatable] for details on how to use this
         * <br>signal.
         * @param position position of item to activate
        */
        void onActivate(int position);
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaColumnView.OnActivate) (__self, _position, __data) -> in.onActivate(_position);
    }

    public ColumnView(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkColumnView`.
     * <br>
     * <br>You most likely want to call [method&#64;Gtk.ColumnView.append_column]
     * <br>to add columns next.
     * @param model the list model to use
    */
    public ColumnView(@Nullable SelectionModel model) {
        super(cast(JnaColumnView.INST().gtk_column_view_new(asCPointer(model))));
    }

    /**
     * Appends the &#64;column to the end of the columns in &#64;self.
     * @param column a `GtkColumnViewColumn` that hasn't been added to a   `GtkColumnView` yet
    */
    public void appendColumn(@Nonnull ColumnViewColumn column)  {
        JnaColumnView.INST().gtk_column_view_append_column(asCPointer(), asCPointerNotNull(column));
    }

    /**
     * Gets the list of columns in this column view.
     * <br>
     * <br>This list is constant over the lifetime of &#64;self and can be used to
     * <br>monitor changes to the columns of &#64;self by connecting to the
     * <br>::items-changed signal.
     * @return The list managing the columns
    */
    public ch.bailu.gtk.gio.ListModel getColumns()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaColumnView.INST().gtk_column_view_get_columns(asCPointer())));
    }

    /**
     * Returns whether rows can be selected by dragging with the mouse.
     * @return %TRUE if rubberband selection is enabled
    */
    public boolean getEnableRubberband()  {
        return JnaColumnView.INST().gtk_column_view_get_enable_rubberband(asCPointer());
    }

    /**
     * Gets the model that's currently used to read the items displayed.
     * @return The model in use
    */
    public SelectionModel getModel()  {
        return new SelectionModel(new PointerContainer(JnaColumnView.INST().gtk_column_view_get_model(asCPointer())));
    }

    /**
     * Returns whether columns are reorderable.
     * @return %TRUE if columns are reorderable
    */
    public boolean getReorderable()  {
        return JnaColumnView.INST().gtk_column_view_get_reorderable(asCPointer());
    }

    /**
     * Returns whether the list should show separators
     * <br>between columns.
     * @return %TRUE if the list shows column separators
    */
    public boolean getShowColumnSeparators()  {
        return JnaColumnView.INST().gtk_column_view_get_show_column_separators(asCPointer());
    }

    /**
     * Returns whether the list should show separators
     * <br>between rows.
     * @return %TRUE if the list shows separators
    */
    public boolean getShowRowSeparators()  {
        return JnaColumnView.INST().gtk_column_view_get_show_row_separators(asCPointer());
    }

    /**
     * Returns whether rows will be activated on single click and
     * <br>selected on hover.
     * @return %TRUE if rows are activated on single click
    */
    public boolean getSingleClickActivate()  {
        return JnaColumnView.INST().gtk_column_view_get_single_click_activate(asCPointer());
    }

    /**
     * Returns a special sorter that reflects the users sorting
     * <br>choices in the column view.
     * <br>
     * <br>To allow users to customizable sorting by clicking on column
     * <br>headers, this sorter needs to be set on the sort model underneath
     * <br>the model that is displayed by the view.
     * <br>
     * <br>See [method&#64;Gtk.ColumnViewColumn.set_sorter] for setting up
     * <br>per-column sorting.
     * <br>
     * <br>Here is an example:
     * <br>```c
     * <br>gtk_column_view_column_set_sorter (column, sorter);
     * <br>gtk_column_view_append_column (view, column);
     * <br>sorter = g_object_ref (gtk_column_view_get_sorter (view)));
     * <br>model = gtk_sort_list_model_new (store, sorter);
     * <br>selection = gtk_no_selection_new (model);
     * <br>gtk_column_view_set_model (view, selection);
     * <br>```
     * @return the `GtkSorter` of &#64;self
    */
    public Sorter getSorter()  {
        return new Sorter(new PointerContainer(JnaColumnView.INST().gtk_column_view_get_sorter(asCPointer())));
    }

    /**
     * Inserts a column at the given position in the columns of &#64;self.
     * <br>
     * <br>If &#64;column is already a column of &#64;self, it will be repositioned.
     * @param position the position to insert &#64;column at
     * @param column the `GtkColumnViewColumn` to insert
    */
    public void insertColumn(int position, @Nonnull ColumnViewColumn column)  {
        JnaColumnView.INST().gtk_column_view_insert_column(asCPointer(), position, asCPointerNotNull(column));
    }

    /**
     * Removes the &#64;column from the list of columns of &#64;self.
     * @param column a `GtkColumnViewColumn` that's part of &#64;self
    */
    public void removeColumn(@Nonnull ColumnViewColumn column)  {
        JnaColumnView.INST().gtk_column_view_remove_column(asCPointer(), asCPointerNotNull(column));
    }

    /**
     * Sets whether selections can be changed by dragging with the mouse.
     * @param enable_rubberband %TRUE to enable rubberband selection
    */
    public void setEnableRubberband(boolean enable_rubberband)  {
        JnaColumnView.INST().gtk_column_view_set_enable_rubberband(asCPointer(), enable_rubberband);
    }

    /**
     * Sets the model to use.
     * <br>
     * <br>This must be a [iface&#64;Gtk.SelectionModel].
     * @param model the model to use
    */
    public void setModel(@Nullable SelectionModel model)  {
        JnaColumnView.INST().gtk_column_view_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Sets whether columns should be reorderable by dragging.
     * @param reorderable whether columns should be reorderable
    */
    public void setReorderable(boolean reorderable)  {
        JnaColumnView.INST().gtk_column_view_set_reorderable(asCPointer(), reorderable);
    }

    /**
     * Sets whether the list should show separators
     * <br>between columns.
     * @param show_column_separators %TRUE to show column separators
    */
    public void setShowColumnSeparators(boolean show_column_separators)  {
        JnaColumnView.INST().gtk_column_view_set_show_column_separators(asCPointer(), show_column_separators);
    }

    /**
     * Sets whether the list should show separators
     * <br>between rows.
     * @param show_row_separators %TRUE to show row separators
    */
    public void setShowRowSeparators(boolean show_row_separators)  {
        JnaColumnView.INST().gtk_column_view_set_show_row_separators(asCPointer(), show_row_separators);
    }

    /**
     * Sets whether rows should be activated on single click and
     * <br>selected on hover.
     * @param single_click_activate %TRUE to activate items on single click
    */
    public void setSingleClickActivate(boolean single_click_activate)  {
        JnaColumnView.INST().gtk_column_view_set_single_click_activate(asCPointer(), single_click_activate);
    }

    /**
     * Sets the sorting of the view.
     * <br>
     * <br>This function should be used to set up the initial sorting.
     * <br>At runtime, users can change the sorting of a column view
     * <br>by clicking on the list headers.
     * <br>
     * <br>This call only has an effect if the sorter returned by
     * <br>[method&#64;Gtk.ColumnView.get_sorter] is set on a sort model,
     * <br>and [method&#64;Gtk.ColumnViewColumn.set_sorter] has been called
     * <br>on &#64;column to associate a sorter with the column.
     * <br>
     * <br>If &#64;column is %NULL, the view will be unsorted.
     * @param column the `GtkColumnViewColumn` to sort by
     * @param direction the direction to sort in
    */
    public void sortByColumn(@Nullable ColumnViewColumn column, int direction)  {
        JnaColumnView.INST().gtk_column_view_sort_by_column(asCPointer(), asCPointer(column), direction);
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
     * Implements interface {@link Scrollable}. Call this to get access to interface functions.
     * @return {@link Scrollable}
    */
    public Scrollable asScrollable() {
        return new Scrollable(cast());
    }

    public static long getTypeID() { 
        return JnaColumnView.INST().gtk_column_view_get_type(); 
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
