/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkListBox` is a vertical list.
 * <br>
 * <br>A `GtkListBox` only contains `GtkListBoxRow` children. These rows can
 * <br>by dynamically sorted and filtered, and headers can be added dynamically
 * <br>depending on the row content. It also allows keyboard and mouse navigation
 * <br>and selection like a typical list.
 * <br>
 * <br>Using `GtkListBox` is often an alternative to `GtkTreeView`, especially
 * <br>when the list contents has a more complicated layout than what is allowed
 * <br>by a `GtkCellRenderer`, or when the contents is interactive (i.e. has a
 * <br>button in it).
 * <br>
 * <br>Although a `GtkListBox` must have only `GtkListBoxRow` children, you can
 * <br>add any kind of widget to it via [method&#64;Gtk.ListBox.prepend],
 * <br>[method&#64;Gtk.ListBox.append] and [method&#64;Gtk.ListBox.insert] and a
 * <br>`GtkListBoxRow` widget will automatically be inserted between the list
 * <br>and the widget.
 * <br>
 * <br>`GtkListBoxRows` can be marked as activatable or selectable. If a row is
 * <br>activatable, [signal&#64;Gtk.ListBox::row-activated] will be emitted for it when
 * <br>the user tries to activate it. If it is selectable, the row will be marked
 * <br>as selected when the user tries to select it.
 * <br>
 * <br>&#35; GtkListBox as GtkBuildable
 * <br>
 * <br>The `GtkListBox` implementation of the `GtkBuildable` interface supports
 * <br>setting a child as the placeholder by specifying “placeholder” as the “type”
 * <br>attribute of a &lt;child&gt; element. See [method&#64;Gtk.ListBox.set_placeholder]
 * <br>for info.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <pre>&lt;!-- language=&quot;plain&quot; --&gt;
 * list[.separators][.rich-list][.navigation-sidebar]
 * ╰── row[.activatable]
 * </pre>
 * <br>
 * <br>`GtkListBox` uses a single CSS node named list. It may carry the .separators
 * <br>style class, when the [property&#64;Gtk.ListBox:show-separators] property is set.
 * <br>Each `GtkListBoxRow` uses a single CSS node named row. The row nodes get the
 * <br>.activatable style class added when appropriate.
 * <br>
 * <br>The main list node may also carry style classes to select
 * <br>the style of [list presentation](section-list-widget.html&#35;list-styles):
 * <br>.rich-list, .navigation-sidebar or .data-table.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkListBox` uses the %GTK_ACCESSIBLE_ROLE_LIST role and `GtkListBoxRow` uses
 * <br>the %GTK_ACCESSIBLE_ROLE_LIST_ITEM role.
 * <p><a href="https://docs.gtk.org/gtk4/class.ListBox.html">https://docs.gtk.org/gtk4/class.ListBox.html</a></p>
*/
public class ListBox extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ListBox.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnListBoxCreateWidgetFunc {
        /**
         * Called for list boxes that are bound to a `GListModel` with
         * <br>gtk_list_box_bind_model() for each item that gets added to the model.
         * <br>
         * <br>If the widget returned is not a &#35;GtkListBoxRow widget, then the widget
         * <br>will be inserted as the child of an intermediate &#35;GtkListBoxRow.
         * @param item the item from the model for which to create a widget for
         * @param user_data user data
         * @return a `GtkWidget` that represents &#64;item
        */
        Widget onListBoxCreateWidgetFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer item, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaListBox.OnListBoxCreateWidgetFunc toOnListBoxCreateWidgetFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnListBoxCreateWidgetFunc in) {
        JnaListBox.OnListBoxCreateWidgetFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_item, _user_data) -> in.onListBoxCreateWidgetFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_item)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaListBox.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaListBox.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnListBoxForeachFunc {
        /**
         * A function used by gtk_list_box_selected_foreach().
         * <br>
         * <br>It will be called on every selected child of the &#64;box.
         * @param box a `GtkListBox`
         * @param row a `GtkListBoxRow`
         * @param user_data user data
        */
        void onListBoxForeachFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ListBox box, @Nonnull ListBoxRow row, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaListBox.OnListBoxForeachFunc toOnListBoxForeachFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnListBoxForeachFunc in) {
        JnaListBox.OnListBoxForeachFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_box, _row, _user_data) -> in.onListBoxForeachFunc(__callback, new ListBox(new PointerContainer(_box)), new ListBoxRow(new PointerContainer(_row)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnListBoxFilterFunc {
        /**
         * Will be called whenever the row changes or is added and lets you control
         * <br>if the row should be visible or not.
         * @param row the row that may be filtered
         * @param user_data user data
         * @return %TRUE if the row should be visible, %FALSE otherwise
        */
        boolean onListBoxFilterFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ListBoxRow row, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaListBox.OnListBoxFilterFunc toOnListBoxFilterFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnListBoxFilterFunc in) {
        JnaListBox.OnListBoxFilterFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_row, _user_data) -> in.onListBoxFilterFunc(__callback, new ListBoxRow(new PointerContainer(_row)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnListBoxUpdateHeaderFunc {
        /**
         * Whenever &#64;row changes or which row is before &#64;row changes this
         * <br>is called, which lets you update the header on &#64;row.
         * <br>
         * <br>You may remove or set a new one via [method&#64;Gtk.ListBoxRow.set_header]
         * <br>or just change the state of the current header widget.
         * @param row the row to update
         * @param before the row before &#64;row, or %NULL if it is first
         * @param user_data user data
        */
        void onListBoxUpdateHeaderFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ListBoxRow row, @Nullable ListBoxRow before, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaListBox.OnListBoxUpdateHeaderFunc toOnListBoxUpdateHeaderFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnListBoxUpdateHeaderFunc in) {
        JnaListBox.OnListBoxUpdateHeaderFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_row, _before, _user_data) -> in.onListBoxUpdateHeaderFunc(__callback, new ListBoxRow(new PointerContainer(_row)), new ListBoxRow(new PointerContainer(_before)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnListBoxSortFunc {
        /**
         * Compare two rows to determine which should be first.
         * @param row1 the first row
         * @param row2 the second row
         * @param user_data user data
         * @return &lt; 0 if &#64;row1 should be before &#64;row2, 0 if they are   equal and &gt; 0 otherwise
        */
        int onListBoxSortFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ListBoxRow row1, @Nonnull ListBoxRow row2, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaListBox.OnListBoxSortFunc toOnListBoxSortFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnListBoxSortFunc in) {
        JnaListBox.OnListBoxSortFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_row1, _row2, _user_data) -> in.onListBoxSortFunc(__callback, new ListBoxRow(new PointerContainer(_row1)), new ListBoxRow(new PointerContainer(_row2)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivateCursorRow {
        void onActivateCursorRow();
    }
    
    private static com.sun.jna.Callback toOnActivateCursorRow(OnActivateCursorRow in) {
        return (in == null) ? null: (JnaListBox.OnActivateCursorRow) (__self, __data) -> in.onActivateCursorRow();
    }

    @FunctionalInterface
    public interface OnMoveCursor {
        /**
         * 
         * @param object 
         * @param p0 
         * @param p1 
         * @param p2 
        */
        void onMoveCursor(int object, int p0, boolean p1, boolean p2);
    }
    
    private static com.sun.jna.Callback toOnMoveCursor(OnMoveCursor in) {
        return (in == null) ? null: (JnaListBox.OnMoveCursor) (__self, _object, _p0, _p1, _p2, __data) -> in.onMoveCursor(_object, _p0, _p1, _p2);
    }

    @FunctionalInterface
    public interface OnRowActivated {
        /**
         * Emitted when a row has been activated by the user.
         * @param row the activated row
        */
        void onRowActivated(@Nonnull ListBoxRow row);
    }
    
    private static com.sun.jna.Callback toOnRowActivated(OnRowActivated in) {
        return (in == null) ? null: (JnaListBox.OnRowActivated) (__self, _row, __data) -> in.onRowActivated(new ListBoxRow(new PointerContainer(_row)));
    }

    @FunctionalInterface
    public interface OnRowSelected {
        /**
         * Emitted when a new row is selected, or (with a %NULL &#64;row)
         * <br>when the selection is cleared.
         * <br>
         * <br>When the &#64;box is using %GTK_SELECTION_MULTIPLE, this signal will not
         * <br>give you the full picture of selection changes, and you should use
         * <br>the [signal&#64;Gtk.ListBox::selected-rows-changed] signal instead.
         * @param row the selected row
        */
        void onRowSelected(@Nullable ListBoxRow row);
    }
    
    private static com.sun.jna.Callback toOnRowSelected(OnRowSelected in) {
        return (in == null) ? null: (JnaListBox.OnRowSelected) (__self, _row, __data) -> in.onRowSelected(new ListBoxRow(new PointerContainer(_row)));
    }

    @FunctionalInterface
    public interface OnSelectAll {
        /**
         * Emitted to select all children of the box, if the selection
         * <br>mode permits it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
        */
        void onSelectAll();
    }
    
    private static com.sun.jna.Callback toOnSelectAll(OnSelectAll in) {
        return (in == null) ? null: (JnaListBox.OnSelectAll) (__self, __data) -> in.onSelectAll();
    }

    @FunctionalInterface
    public interface OnSelectedRowsChanged {
        /**
         * Emitted when the set of selected rows changes.
        */
        void onSelectedRowsChanged();
    }
    
    private static com.sun.jna.Callback toOnSelectedRowsChanged(OnSelectedRowsChanged in) {
        return (in == null) ? null: (JnaListBox.OnSelectedRowsChanged) (__self, __data) -> in.onSelectedRowsChanged();
    }

    @FunctionalInterface
    public interface OnToggleCursorRow {
        void onToggleCursorRow();
    }
    
    private static com.sun.jna.Callback toOnToggleCursorRow(OnToggleCursorRow in) {
        return (in == null) ? null: (JnaListBox.OnToggleCursorRow) (__self, __data) -> in.onToggleCursorRow();
    }

    @FunctionalInterface
    public interface OnUnselectAll {
        /**
         * Emitted to unselect all children of the box, if the selection
         * <br>mode permits it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
        */
        void onUnselectAll();
    }
    
    private static com.sun.jna.Callback toOnUnselectAll(OnUnselectAll in) {
        return (in == null) ? null: (JnaListBox.OnUnselectAll) (__self, __data) -> in.onUnselectAll();
    }

    public ListBox(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkListBox` container.
    */
    public ListBox() {
        super(cast(JnaListBox.INST().gtk_list_box_new()));
    }

    /**
     * Append a widget to the list.
     * <br>
     * <br>If a sort function is set, the widget will
     * <br>actually be inserted at the calculated position.
     * @param child the `GtkWidget` to add
    */
    public void append(@Nonnull Widget child)  {
        JnaListBox.INST().gtk_list_box_append(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Binds &#64;model to &#64;box.
     * <br>
     * <br>If &#64;box was already bound to a model, that previous binding is
     * <br>destroyed.
     * <br>
     * <br>The contents of &#64;box are cleared and then filled with widgets that
     * <br>represent items from &#64;model. &#64;box is updated whenever &#64;model changes.
     * <br>If &#64;model is %NULL, &#64;box is left empty.
     * <br>
     * <br>It is undefined to add or remove widgets directly (for example, with
     * <br>[method&#64;Gtk.ListBox.insert]) while &#64;box is bound to a model.
     * <br>
     * <br>Note that using a model is incompatible with the filtering and sorting
     * <br>functionality in `GtkListBox`. When using a model, filtering and sorting
     * <br>should be implemented by the model.
     * @param model the `GListModel` to be bound to &#64;box
     * @param create_widget_func a function that creates widgets for items   or %NULL in case you also passed %NULL as &#64;model
     * @param user_data user data passed to &#64;create_widget_func
     * @param user_data_free_func function for freeing &#64;user_data
    */
    public void bindModel(@Nullable ch.bailu.gtk.gio.ListModel model, OnListBoxCreateWidgetFunc create_widget_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_free_func)  {
        JnaListBox.INST().gtk_list_box_bind_model(asCPointer(), asCPointer(model), toOnListBoxCreateWidgetFunc(this, "bindModel", create_widget_func), asCPointer(user_data), toOnDestroyNotify(this, "bindModel", user_data_free_func));
    }

    /**
     * Add a drag highlight to a row.
     * <br>
     * <br>This is a helper function for implementing DnD onto a `GtkListBox`.
     * <br>The passed in &#64;row will be highlighted by setting the
     * <br>%GTK_STATE_FLAG_DROP_ACTIVE state and any previously highlighted
     * <br>row will be unhighlighted.
     * <br>
     * <br>The row will also be unhighlighted when the widget gets
     * <br>a drag leave event.
     * @param row a `GtkListBoxRow`
    */
    public void dragHighlightRow(@Nonnull ListBoxRow row)  {
        JnaListBox.INST().gtk_list_box_drag_highlight_row(asCPointer(), asCPointerNotNull(row));
    }

    /**
     * If a row has previously been highlighted via gtk_list_box_drag_highlight_row(),
     * <br>it will have the highlight removed.
    */
    public void dragUnhighlightRow()  {
        JnaListBox.INST().gtk_list_box_drag_unhighlight_row(asCPointer());
    }

    /**
     * Returns whether rows activate on single clicks.
     * @return %TRUE if rows are activated on single click, %FALSE otherwise
    */
    public boolean getActivateOnSingleClick()  {
        return JnaListBox.INST().gtk_list_box_get_activate_on_single_click(asCPointer());
    }

    /**
     * Gets the adjustment (if any) that the widget uses to
     * <br>for vertical scrolling.
     * @return the adjustment
    */
    public Adjustment getAdjustment()  {
        return new Adjustment(new PointerContainer(JnaListBox.INST().gtk_list_box_get_adjustment(asCPointer())));
    }

    /**
     * Gets the n-th child in the list (not counting headers).
     * <br>
     * <br>If &#64;index_ is negative or larger than the number of items in the
     * <br>list, %NULL is returned.
     * @param index_ the index of the row
     * @return the child `GtkWidget`
    */
    public ListBoxRow getRowAtIndex(int index_)  {
        return new ListBoxRow(new PointerContainer(JnaListBox.INST().gtk_list_box_get_row_at_index(asCPointer(), index_)));
    }

    /**
     * Gets the row at the &#64;y position.
     * @param y position
     * @return the row
    */
    public ListBoxRow getRowAtY(int y)  {
        return new ListBoxRow(new PointerContainer(JnaListBox.INST().gtk_list_box_get_row_at_y(asCPointer(), y)));
    }

    /**
     * Gets the selected row, or %NULL if no rows are selected.
     * <br>
     * <br>Note that the box may allow multiple selection, in which
     * <br>case you should use [method&#64;Gtk.ListBox.selected_foreach] to
     * <br>find all selected rows.
     * @return the selected row
    */
    public ListBoxRow getSelectedRow()  {
        return new ListBoxRow(new PointerContainer(JnaListBox.INST().gtk_list_box_get_selected_row(asCPointer())));
    }

    /**
     * Creates a list of all selected children.
     * @return    A `GList` containing the `GtkWidget` for each selected child.   Free with g_list_free() when done.
    */
    public ch.bailu.gtk.glib.List getSelectedRows()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaListBox.INST().gtk_list_box_get_selected_rows(asCPointer())));
    }

    /**
     * Gets the selection mode of the listbox.
     * @return a `GtkSelectionMode`
    */
    public int getSelectionMode()  {
        return JnaListBox.INST().gtk_list_box_get_selection_mode(asCPointer());
    }

    /**
     * Returns whether the list box should show separators
     * <br>between rows.
     * @return %TRUE if the list box shows separators
    */
    public boolean getShowSeparators()  {
        return JnaListBox.INST().gtk_list_box_get_show_separators(asCPointer());
    }

    /**
     * Insert the &#64;child into the &#64;box at &#64;position.
     * <br>
     * <br>If a sort function is
     * <br>set, the widget will actually be inserted at the calculated position.
     * <br>
     * <br>If &#64;position is -1, or larger than the total number of items in the
     * <br>&#64;box, then the &#64;child will be appended to the end.
     * @param child the `GtkWidget` to add
     * @param position the position to insert &#64;child in
    */
    public void insert(@Nonnull Widget child, int position)  {
        JnaListBox.INST().gtk_list_box_insert(asCPointer(), asCPointerNotNull(child), position);
    }

    /**
     * Update the filtering for all rows.
     * <br>
     * <br>Call this when result
     * <br>of the filter function on the &#64;box is changed due
     * <br>to an external factor. For instance, this would be used
     * <br>if the filter function just looked for a specific search
     * <br>string and the entry with the search string has changed.
    */
    public void invalidateFilter()  {
        JnaListBox.INST().gtk_list_box_invalidate_filter(asCPointer());
    }

    /**
     * Update the separators for all rows.
     * <br>
     * <br>Call this when result
     * <br>of the header function on the &#64;box is changed due
     * <br>to an external factor.
    */
    public void invalidateHeaders()  {
        JnaListBox.INST().gtk_list_box_invalidate_headers(asCPointer());
    }

    /**
     * Update the sorting for all rows.
     * <br>
     * <br>Call this when result
     * <br>of the sort function on the &#64;box is changed due
     * <br>to an external factor.
    */
    public void invalidateSort()  {
        JnaListBox.INST().gtk_list_box_invalidate_sort(asCPointer());
    }

    /**
     * Prepend a widget to the list.
     * <br>
     * <br>If a sort function is set, the widget will
     * <br>actually be inserted at the calculated position.
     * @param child the `GtkWidget` to add
    */
    public void prepend(@Nonnull Widget child)  {
        JnaListBox.INST().gtk_list_box_prepend(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Removes a child from &#64;box.
     * @param child the child to remove
    */
    public void remove(@Nonnull Widget child)  {
        JnaListBox.INST().gtk_list_box_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Select all children of &#64;box, if the selection mode allows it.
    */
    public void selectAll()  {
        JnaListBox.INST().gtk_list_box_select_all(asCPointer());
    }

    /**
     * Make &#64;row the currently selected row.
     * @param row The row to select
    */
    public void selectRow(@Nullable ListBoxRow row)  {
        JnaListBox.INST().gtk_list_box_select_row(asCPointer(), asCPointer(row));
    }

    /**
     * Calls a function for each selected child.
     * <br>
     * <br>Note that the selection cannot be modified from within this function.
     * @param func the function to call for each selected child
     * @param data user data to pass to the function
    */
    public void selectedForeach(OnListBoxForeachFunc func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaListBox.INST().gtk_list_box_selected_foreach(asCPointer(), toOnListBoxForeachFunc(this, "selectedForeach", func), asCPointer(data));
    }

    /**
     * If &#64;single is %TRUE, rows will be activated when you click on them,
     * <br>otherwise you need to double-click.
     * @param single a boolean
    */
    public void setActivateOnSingleClick(boolean single)  {
        JnaListBox.INST().gtk_list_box_set_activate_on_single_click(asCPointer(), single);
    }

    /**
     * Sets the adjustment (if any) that the widget uses to
     * <br>for vertical scrolling.
     * <br>
     * <br>For instance, this is used to get the page size for
     * <br>PageUp/Down key handling.
     * <br>
     * <br>In the normal case when the &#64;box is packed inside
     * <br>a `GtkScrolledWindow` the adjustment from that will
     * <br>be picked up automatically, so there is no need
     * <br>to manually do that.
     * @param adjustment the adjustment
    */
    public void setAdjustment(@Nullable Adjustment adjustment)  {
        JnaListBox.INST().gtk_list_box_set_adjustment(asCPointer(), asCPointer(adjustment));
    }

    /**
     * By setting a filter function on the &#64;box one can decide dynamically which
     * <br>of the rows to show.
     * <br>
     * <br>For instance, to implement a search function on a list that
     * <br>filters the original list to only show the matching rows.
     * <br>
     * <br>The &#64;filter_func will be called for each row after the call, and
     * <br>it will continue to be called each time a row changes (via
     * <br>[method&#64;Gtk.ListBoxRow.changed]) or when [method&#64;Gtk.ListBox.invalidate_filter]
     * <br>is called.
     * <br>
     * <br>Note that using a filter function is incompatible with using a model
     * <br>(see [method&#64;Gtk.ListBox.bind_model]).
     * @param filter_func callback that lets you filter which rows to show
     * @param user_data user data passed to &#64;filter_func
     * @param destroy destroy notifier for &#64;user_data
    */
    public void setFilterFunc(OnListBoxFilterFunc filter_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy)  {
        JnaListBox.INST().gtk_list_box_set_filter_func(asCPointer(), toOnListBoxFilterFunc(this, "setFilterFunc", filter_func), asCPointer(user_data), toOnDestroyNotify(this, "setFilterFunc", destroy));
    }

    /**
     * Sets a header function.
     * <br>
     * <br>By setting a header function on the &#64;box one can dynamically add headers
     * <br>in front of rows, depending on the contents of the row and its position
     * <br>in the list.
     * <br>
     * <br>For instance, one could use it to add headers in front of the first item
     * <br>of a new kind, in a list sorted by the kind.
     * <br>
     * <br>The &#64;update_header can look at the current header widget using
     * <br>[method&#64;Gtk.ListBoxRow.get_header] and either update the state of the widget
     * <br>as needed, or set a new one using [method&#64;Gtk.ListBoxRow.set_header]. If no
     * <br>header is needed, set the header to %NULL.
     * <br>
     * <br>Note that you may get many calls &#64;update_header to this for a particular
     * <br>row when e.g. changing things that don’t affect the header. In this case
     * <br>it is important for performance to not blindly replace an existing header
     * <br>with an identical one.
     * <br>
     * <br>The &#64;update_header function will be called for each row after the call,
     * <br>and it will continue to be called each time a row changes (via
     * <br>[method&#64;Gtk.ListBoxRow.changed]) and when the row before changes (either
     * <br>by [method&#64;Gtk.ListBoxRow.changed] on the previous row, or when the previous
     * <br>row becomes a different row). It is also called for all rows when
     * <br>[method&#64;Gtk.ListBox.invalidate_headers] is called.
     * @param update_header callback that lets you add row headers
     * @param user_data user data passed to &#64;update_header
     * @param destroy destroy notifier for &#64;user_data
    */
    public void setHeaderFunc(OnListBoxUpdateHeaderFunc update_header, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy)  {
        JnaListBox.INST().gtk_list_box_set_header_func(asCPointer(), toOnListBoxUpdateHeaderFunc(this, "setHeaderFunc", update_header), asCPointer(user_data), toOnDestroyNotify(this, "setHeaderFunc", destroy));
    }

    /**
     * Sets the placeholder widget that is shown in the list when
     * <br>it doesn't display any visible children.
     * @param placeholder a `GtkWidget`
    */
    public void setPlaceholder(@Nullable Widget placeholder)  {
        JnaListBox.INST().gtk_list_box_set_placeholder(asCPointer(), asCPointer(placeholder));
    }

    /**
     * Sets how selection works in the listbox.
     * @param mode The `GtkSelectionMode`
    */
    public void setSelectionMode(int mode)  {
        JnaListBox.INST().gtk_list_box_set_selection_mode(asCPointer(), mode);
    }

    /**
     * Sets whether the list box should show separators
     * <br>between rows.
     * @param show_separators %TRUE to show separators
    */
    public void setShowSeparators(boolean show_separators)  {
        JnaListBox.INST().gtk_list_box_set_show_separators(asCPointer(), show_separators);
    }

    /**
     * Sets a sort function.
     * <br>
     * <br>By setting a sort function on the &#64;box one can dynamically reorder
     * <br>the rows of the list, based on the contents of the rows.
     * <br>
     * <br>The &#64;sort_func will be called for each row after the call, and will
     * <br>continue to be called each time a row changes (via
     * <br>[method&#64;Gtk.ListBoxRow.changed]) and when [method&#64;Gtk.ListBox.invalidate_sort]
     * <br>is called.
     * <br>
     * <br>Note that using a sort function is incompatible with using a model
     * <br>(see [method&#64;Gtk.ListBox.bind_model]).
     * @param sort_func the sort function
     * @param user_data user data passed to &#64;sort_func
     * @param destroy destroy notifier for &#64;user_data
    */
    public void setSortFunc(OnListBoxSortFunc sort_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy)  {
        JnaListBox.INST().gtk_list_box_set_sort_func(asCPointer(), toOnListBoxSortFunc(this, "setSortFunc", sort_func), asCPointer(user_data), toOnDestroyNotify(this, "setSortFunc", destroy));
    }

    /**
     * Unselect all children of &#64;box, if the selection mode allows it.
    */
    public void unselectAll()  {
        JnaListBox.INST().gtk_list_box_unselect_all(asCPointer());
    }

    /**
     * Unselects a single row of &#64;box, if the selection mode allows it.
     * @param row the row to unselected
    */
    public void unselectRow(@Nonnull ListBoxRow row)  {
        JnaListBox.INST().gtk_list_box_unselect_row(asCPointer(), asCPointerNotNull(row));
    }

    public final static String SIGNAL_ON_ACTIVATE_CURSOR_ROW = "activate-cursor-row";
    
    /**
     * Connect to signal "activate-cursor-row".
     * <br>See {@link OnActivateCursorRow#onActivateCursorRow} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE_CURSOR_ROW} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivateCursorRow(OnActivateCursorRow signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE_CURSOR_ROW, toOnActivateCursorRow(signal));
    }

    public final static String SIGNAL_ON_MOVE_CURSOR = "move-cursor";
    
    /**
     * Connect to signal "move-cursor".
     * <br>See {@link OnMoveCursor#onMoveCursor} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOVE_CURSOR} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMoveCursor(OnMoveCursor signal) {
        return connectSignal(SIGNAL_ON_MOVE_CURSOR, toOnMoveCursor(signal));
    }

    public final static String SIGNAL_ON_ROW_ACTIVATED = "row-activated";
    
    /**
     * Connect to signal "row-activated".
     * <br>See {@link OnRowActivated#onRowActivated} for signal description.
     * <br>Field {@link #SIGNAL_ON_ROW_ACTIVATED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRowActivated(OnRowActivated signal) {
        return connectSignal(SIGNAL_ON_ROW_ACTIVATED, toOnRowActivated(signal));
    }

    public final static String SIGNAL_ON_ROW_SELECTED = "row-selected";
    
    /**
     * Connect to signal "row-selected".
     * <br>See {@link OnRowSelected#onRowSelected} for signal description.
     * <br>Field {@link #SIGNAL_ON_ROW_SELECTED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRowSelected(OnRowSelected signal) {
        return connectSignal(SIGNAL_ON_ROW_SELECTED, toOnRowSelected(signal));
    }

    public final static String SIGNAL_ON_SELECT_ALL = "select-all";
    
    /**
     * Connect to signal "select-all".
     * <br>See {@link OnSelectAll#onSelectAll} for signal description.
     * <br>Field {@link #SIGNAL_ON_SELECT_ALL} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSelectAll(OnSelectAll signal) {
        return connectSignal(SIGNAL_ON_SELECT_ALL, toOnSelectAll(signal));
    }

    public final static String SIGNAL_ON_SELECTED_ROWS_CHANGED = "selected-rows-changed";
    
    /**
     * Connect to signal "selected-rows-changed".
     * <br>See {@link OnSelectedRowsChanged#onSelectedRowsChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_SELECTED_ROWS_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSelectedRowsChanged(OnSelectedRowsChanged signal) {
        return connectSignal(SIGNAL_ON_SELECTED_ROWS_CHANGED, toOnSelectedRowsChanged(signal));
    }

    public final static String SIGNAL_ON_TOGGLE_CURSOR_ROW = "toggle-cursor-row";
    
    /**
     * Connect to signal "toggle-cursor-row".
     * <br>See {@link OnToggleCursorRow#onToggleCursorRow} for signal description.
     * <br>Field {@link #SIGNAL_ON_TOGGLE_CURSOR_ROW} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onToggleCursorRow(OnToggleCursorRow signal) {
        return connectSignal(SIGNAL_ON_TOGGLE_CURSOR_ROW, toOnToggleCursorRow(signal));
    }

    public final static String SIGNAL_ON_UNSELECT_ALL = "unselect-all";
    
    /**
     * Connect to signal "unselect-all".
     * <br>See {@link OnUnselectAll#onUnselectAll} for signal description.
     * <br>Field {@link #SIGNAL_ON_UNSELECT_ALL} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUnselectAll(OnUnselectAll signal) {
        return connectSignal(SIGNAL_ON_UNSELECT_ALL, toOnUnselectAll(signal));
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
        return JnaListBox.INST().gtk_list_box_get_type(); 
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
