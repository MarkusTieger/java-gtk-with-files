/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkIconView` is a widget which displays data in a grid of icons.
 * <br>
 * <br>`GtkIconView` provides an alternative view on a `GtkTreeModel`.
 * <br>It displays the model as a grid of icons with labels. Like
 * <br>[class&#64;Gtk.TreeView], it allows to select one or multiple items
 * <br>(depending on the selection mode, see [method&#64;Gtk.IconView.set_selection_mode]).
 * <br>In addition to selection with the arrow keys, `GtkIconView` supports
 * <br>rubberband selection, which is controlled by dragging the pointer.
 * <br>
 * <br>Note that if the tree model is backed by an actual tree store (as
 * <br>opposed to a flat list where the mapping to icons is obvious),
 * <br>`GtkIconView` will only display the first level of the tree and
 * <br>ignore the tree’s branches.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>iconview.view
 * <br>╰── [rubberband]
 * <br>```
 * <br>
 * <br>`GtkIconView` has a single CSS node with name iconview and style class .view.
 * <br>For rubberband selection, a subnode with name rubberband is used.
 * <p><a href="https://docs.gtk.org/gtk4/class.IconView.html">https://docs.gtk.org/gtk4/class.IconView.html</a></p>
*/
public class IconView extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IconView.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnIconViewForeachFunc {
        /**
         * A function used by gtk_icon_view_selected_foreach() to map all
         * <br>selected rows.
         * <br>
         * <br>It will be called on every selected row in the view.
         * @param icon_view a `GtkIconView`
         * @param path The `GtkTreePath` of a selected row
         * @param data user data
        */
        void onIconViewForeachFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull IconView icon_view, @Nonnull TreePath path, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaIconView.OnIconViewForeachFunc toOnIconViewForeachFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnIconViewForeachFunc in) {
        JnaIconView.OnIconViewForeachFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_icon_view, _path, _data) -> in.onIconViewForeachFunc(__callback, new IconView(new PointerContainer(_icon_view)), new TreePath(new PointerContainer(_path)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivateCursorItem {
        /**
         * A [keybinding signal][class&#64;Gtk.SignalAction]
         * <br>which gets emitted when the user activates the currently
         * <br>focused item.
         * <br>
         * <br>Applications should not connect to it, but may emit it with
         * <br>g_signal_emit_by_name() if they need to control activation
         * <br>programmatically.
         * <br>
         * <br>The default bindings for this signal are Space, Return and Enter.
         * @return 
        */
        boolean onActivateCursorItem();
    }
    
    private static com.sun.jna.Callback toOnActivateCursorItem(OnActivateCursorItem in) {
        return (in == null) ? null: (JnaIconView.OnActivateCursorItem) (__self, __data) -> in.onActivateCursorItem();
    }

    @FunctionalInterface
    public interface OnItemActivated {
        /**
         * The ::item-activated signal is emitted when the method
         * <br>gtk_icon_view_item_activated() is called, when the user double
         * <br>clicks an item with the &quot;activate-on-single-click&quot; property set
         * <br>to %FALSE, or when the user single clicks an item when the
         * <br>&quot;activate-on-single-click&quot; property set to %TRUE. It is also
         * <br>emitted when a non-editable item is selected and one of the keys:
         * <br>Space, Return or Enter is pressed.
         * @param path the `GtkTreePath` for the activated item
        */
        void onItemActivated(@Nonnull TreePath path);
    }
    
    private static com.sun.jna.Callback toOnItemActivated(OnItemActivated in) {
        return (in == null) ? null: (JnaIconView.OnItemActivated) (__self, _path, __data) -> in.onItemActivated(new TreePath(new PointerContainer(_path)));
    }

    @FunctionalInterface
    public interface OnMoveCursor {
        /**
         * The ::move-cursor signal is a
         * <br>[keybinding signal][class&#64;Gtk.SignalAction]
         * <br>which gets emitted when the user initiates a cursor movement.
         * <br>
         * <br>Applications should not connect to it, but may emit it with
         * <br>g_signal_emit_by_name() if they need to control the cursor
         * <br>programmatically.
         * <br>
         * <br>The default bindings for this signal include
         * <br>- Arrow keys which move by individual steps
         * <br>- Home/End keys which move to the first/last item
         * <br>- PageUp/PageDown which move by &quot;pages&quot;
         * <br>All of these will extend the selection when combined with
         * <br>the Shift modifier.
         * @param step the granularity of the move, as a `GtkMovementStep`
         * @param count the number of &#64;step units to move
         * @param extend whether to extend the selection
         * @param modify whether to modify the selection
         * @return 
        */
        boolean onMoveCursor(int step, int count, boolean extend, boolean modify);
    }
    
    private static com.sun.jna.Callback toOnMoveCursor(OnMoveCursor in) {
        return (in == null) ? null: (JnaIconView.OnMoveCursor) (__self, _step, _count, _extend, _modify, __data) -> in.onMoveCursor(_step, _count, _extend, _modify);
    }

    @FunctionalInterface
    public interface OnSelectAll {
        /**
         * A [keybinding signal][class&#64;Gtk.SignalAction]
         * <br>which gets emitted when the user selects all items.
         * <br>
         * <br>Applications should not connect to it, but may emit it with
         * <br>g_signal_emit_by_name() if they need to control selection
         * <br>programmatically.
         * <br>
         * <br>The default binding for this signal is Ctrl-a.
        */
        void onSelectAll();
    }
    
    private static com.sun.jna.Callback toOnSelectAll(OnSelectAll in) {
        return (in == null) ? null: (JnaIconView.OnSelectAll) (__self, __data) -> in.onSelectAll();
    }

    @FunctionalInterface
    public interface OnSelectCursorItem {
        /**
         * A [keybinding signal][class&#64;Gtk.SignalAction]
         * <br>which gets emitted when the user selects the item that is currently
         * <br>focused.
         * <br>
         * <br>Applications should not connect to it, but may emit it with
         * <br>g_signal_emit_by_name() if they need to control selection
         * <br>programmatically.
         * <br>
         * <br>There is no default binding for this signal.
        */
        void onSelectCursorItem();
    }
    
    private static com.sun.jna.Callback toOnSelectCursorItem(OnSelectCursorItem in) {
        return (in == null) ? null: (JnaIconView.OnSelectCursorItem) (__self, __data) -> in.onSelectCursorItem();
    }

    @FunctionalInterface
    public interface OnSelectionChanged {
        /**
         * The ::selection-changed signal is emitted when the selection
         * <br>(i.e. the set of selected items) changes.
        */
        void onSelectionChanged();
    }
    
    private static com.sun.jna.Callback toOnSelectionChanged(OnSelectionChanged in) {
        return (in == null) ? null: (JnaIconView.OnSelectionChanged) (__self, __data) -> in.onSelectionChanged();
    }

    @FunctionalInterface
    public interface OnToggleCursorItem {
        /**
         * A [keybinding signal][class&#64;Gtk.SignalAction]
         * <br>which gets emitted when the user toggles whether the currently
         * <br>focused item is selected or not. The exact effect of this
         * <br>depend on the selection mode.
         * <br>
         * <br>Applications should not connect to it, but may emit it with
         * <br>g_signal_emit_by_name() if they need to control selection
         * <br>programmatically.
         * <br>
         * <br>There is no default binding for this signal is Ctrl-Space.
        */
        void onToggleCursorItem();
    }
    
    private static com.sun.jna.Callback toOnToggleCursorItem(OnToggleCursorItem in) {
        return (in == null) ? null: (JnaIconView.OnToggleCursorItem) (__self, __data) -> in.onToggleCursorItem();
    }

    @FunctionalInterface
    public interface OnUnselectAll {
        /**
         * A [keybinding signal][class&#64;Gtk.SignalAction]
         * <br>which gets emitted when the user unselects all items.
         * <br>
         * <br>Applications should not connect to it, but may emit it with
         * <br>g_signal_emit_by_name() if they need to control selection
         * <br>programmatically.
         * <br>
         * <br>The default binding for this signal is Ctrl-Shift-a.
        */
        void onUnselectAll();
    }
    
    private static com.sun.jna.Callback toOnUnselectAll(OnUnselectAll in) {
        return (in == null) ? null: (JnaIconView.OnUnselectAll) (__self, __data) -> in.onUnselectAll();
    }

    public IconView(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkIconView` widget using the
     * <br>specified &#64;area to layout cells inside the icons.
     * @param area the `GtkCellArea` to use to layout cells
     * @return A newly created `GtkIconView` widget
    */
    public static IconView newWithAreaIconView(@Nonnull CellArea area)  {
        PointerContainer __self = cast(JnaIconView.INST().gtk_icon_view_new_with_area(asCPointerNotNull(area)));
        if (__self.isNull()) {
            throw new NullPointerException("IconView:newWithArea");
        }
        return new IconView(__self);
    }        
    

    /**
     * Creates a new `GtkIconView` widget with the model &#64;model.
     * @param model The model.
     * @return A newly created `GtkIconView` widget.
    */
    public static IconView newWithModelIconView(@Nonnull TreeModel model)  {
        PointerContainer __self = cast(JnaIconView.INST().gtk_icon_view_new_with_model(asCPointerNotNull(model)));
        if (__self.isNull()) {
            throw new NullPointerException("IconView:newWithModel");
        }
        return new IconView(__self);
    }        
    

    /**
     * Creates a new `GtkIconView` widget
    */
    public IconView() {
        super(cast(JnaIconView.INST().gtk_icon_view_new()));
    }

    /**
     * Creates a `GdkPaintable` representation of the item at &#64;path.
     * <br>This image is used for a drag icon.
     * @param path a `GtkTreePath` in &#64;icon_view
     * @return a newly-allocated `GdkPaintable` of the drag icon.
    */
    public ch.bailu.gtk.gdk.Paintable createDragIcon(@Nonnull TreePath path)  {
        return new ch.bailu.gtk.gdk.Paintable(new PointerContainer(JnaIconView.INST().gtk_icon_view_create_drag_icon(asCPointer(), asCPointerNotNull(path))));
    }

    /**
     * Turns &#64;icon_view into a drop destination for automatic DND. Calling this
     * <br>method sets `GtkIconView`:reorderable to %FALSE.
     * @param formats the formats that the drag will support
     * @param actions the bitmask of possible actions for a drag to this    widget
    */
    public void enableModelDragDest(@Nonnull ch.bailu.gtk.gdk.ContentFormats formats, int actions)  {
        JnaIconView.INST().gtk_icon_view_enable_model_drag_dest(asCPointer(), asCPointerNotNull(formats), actions);
    }

    /**
     * Turns &#64;icon_view into a drag source for automatic DND. Calling this
     * <br>method sets `GtkIconView`:reorderable to %FALSE.
     * @param start_button_mask Mask of allowed buttons to start drag
     * @param formats the formats that the drag will support
     * @param actions the bitmask of possible actions for a drag from this    widget
    */
    public void enableModelDragSource(int start_button_mask, @Nonnull ch.bailu.gtk.gdk.ContentFormats formats, int actions)  {
        JnaIconView.INST().gtk_icon_view_enable_model_drag_source(asCPointer(), start_button_mask, asCPointerNotNull(formats), actions);
    }

    /**
     * Gets the setting set by gtk_icon_view_set_activate_on_single_click().
     * @return %TRUE if item-activated will be emitted on a single click
    */
    public boolean getActivateOnSingleClick()  {
        return JnaIconView.INST().gtk_icon_view_get_activate_on_single_click(asCPointer());
    }

    /**
     * Fills the bounding rectangle in widget coordinates for the cell specified by
     * <br>&#64;path and &#64;cell. If &#64;cell is %NULL the main cell area is used.
     * <br>
     * <br>This function is only valid if &#64;icon_view is realized.
     * @param path a `GtkTreePath`
     * @param cell a `GtkCellRenderer`
     * @param rect rectangle to fill with cell rect
     * @return %FALSE if there is no such item, %TRUE otherwise
    */
    public boolean getCellRect(@Nonnull TreePath path, @Nullable CellRenderer cell, @Nonnull ch.bailu.gtk.gdk.Rectangle rect)  {
        return JnaIconView.INST().gtk_icon_view_get_cell_rect(asCPointer(), asCPointerNotNull(path), asCPointer(cell), asCPointerNotNull(rect));
    }

    /**
     * Returns the value of the ::column-spacing property.
     * @return the space between columns
    */
    public int getColumnSpacing()  {
        return JnaIconView.INST().gtk_icon_view_get_column_spacing(asCPointer());
    }

    /**
     * Returns the value of the ::columns property.
     * @return the number of columns, or -1
    */
    public int getColumns()  {
        return JnaIconView.INST().gtk_icon_view_get_columns(asCPointer());
    }

    /**
     * Gets the column in which the item &#64;path is currently
     * <br>displayed. Column numbers start at 0.
     * @param path the `GtkTreePath` of the item
     * @return The column in which the item is displayed
    */
    public int getItemColumn(@Nonnull TreePath path)  {
        return JnaIconView.INST().gtk_icon_view_get_item_column(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Returns the value of the ::item-orientation property which determines
     * <br>whether the labels are drawn beside the icons instead of below.
     * @return the relative position of texts and icons
    */
    public int getItemOrientation()  {
        return JnaIconView.INST().gtk_icon_view_get_item_orientation(asCPointer());
    }

    /**
     * Returns the value of the ::item-padding property.
     * @return the padding around items
    */
    public int getItemPadding()  {
        return JnaIconView.INST().gtk_icon_view_get_item_padding(asCPointer());
    }

    /**
     * Gets the row in which the item &#64;path is currently
     * <br>displayed. Row numbers start at 0.
     * @param path the `GtkTreePath` of the item
     * @return The row in which the item is displayed
    */
    public int getItemRow(@Nonnull TreePath path)  {
        return JnaIconView.INST().gtk_icon_view_get_item_row(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Returns the value of the ::item-width property.
     * @return the width of a single item, or -1
    */
    public int getItemWidth()  {
        return JnaIconView.INST().gtk_icon_view_get_item_width(asCPointer());
    }

    /**
     * Returns the value of the ::margin property.
     * @return the space at the borders
    */
    public int getMargin()  {
        return JnaIconView.INST().gtk_icon_view_get_margin(asCPointer());
    }

    /**
     * Returns the column with markup text for &#64;icon_view.
     * @return the markup column, or -1 if it’s unset.
    */
    public int getMarkupColumn()  {
        return JnaIconView.INST().gtk_icon_view_get_markup_column(asCPointer());
    }

    /**
     * Returns the model the `GtkIconView` is based on.  Returns %NULL if the
     * <br>model is unset.
     * @return The currently used `GtkTreeModel`
    */
    public TreeModel getModel()  {
        return new TreeModel(new PointerContainer(JnaIconView.INST().gtk_icon_view_get_model(asCPointer())));
    }

    /**
     * Gets the path for the icon at the given position.
     * @param x The x position to be identified
     * @param y The y position to be identified
     * @return The `GtkTreePath` corresponding to the icon or %NULL if no icon exists at that position.
    */
    public TreePath getPathAtPos(int x, int y)  {
        return new TreePath(new PointerContainer(JnaIconView.INST().gtk_icon_view_get_path_at_pos(asCPointer(), x, y)));
    }

    /**
     * Returns the column with pixbufs for &#64;icon_view.
     * @return the pixbuf column, or -1 if it’s unset.
    */
    public int getPixbufColumn()  {
        return JnaIconView.INST().gtk_icon_view_get_pixbuf_column(asCPointer());
    }

    /**
     * Retrieves whether the user can reorder the list via drag-and-drop.
     * <br>See gtk_icon_view_set_reorderable().
     * @return %TRUE if the list can be reordered.
    */
    public boolean getReorderable()  {
        return JnaIconView.INST().gtk_icon_view_get_reorderable(asCPointer());
    }

    /**
     * Returns the value of the ::row-spacing property.
     * @return the space between rows
    */
    public int getRowSpacing()  {
        return JnaIconView.INST().gtk_icon_view_get_row_spacing(asCPointer());
    }

    /**
     * Creates a list of paths of all selected items. Additionally, if you are
     * <br>planning on modifying the model after calling this function, you may
     * <br>want to convert the returned list into a list of `GtkTreeRowReferences`.
     * <br>To do this, you can use gtk_tree_row_reference_new().
     * <br>
     * <br>To free the return value, use `g_list_free_full`:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * GtkWidget *icon_view = gtk_icon_view_new ();
     * // Use icon_view
     * 
     * GList *list = gtk_icon_view_get_selected_items (GTK_ICON_VIEW (icon_view));
     * 
     * // use list
     * 
     * g_list_free_full (list, (GDestroyNotify) gtk_tree_path_free);
     * </pre>
     * @return A `GList` containing a `GtkTreePath` for each selected row.
    */
    public ch.bailu.gtk.glib.List getSelectedItems()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaIconView.INST().gtk_icon_view_get_selected_items(asCPointer())));
    }

    /**
     * Gets the selection mode of the &#64;icon_view.
     * @return the current selection mode
    */
    public int getSelectionMode()  {
        return JnaIconView.INST().gtk_icon_view_get_selection_mode(asCPointer());
    }

    /**
     * Returns the value of the ::spacing property.
     * @return the space between cells
    */
    public int getSpacing()  {
        return JnaIconView.INST().gtk_icon_view_get_spacing(asCPointer());
    }

    /**
     * Returns the column with text for &#64;icon_view.
     * @return the text column, or -1 if it’s unset.
    */
    public int getTextColumn()  {
        return JnaIconView.INST().gtk_icon_view_get_text_column(asCPointer());
    }

    /**
     * Returns the column of &#64;icon_view’s model which is being used for
     * <br>displaying tooltips on &#64;icon_view’s rows.
     * @return the index of the tooltip column that is currently being used, or -1 if this is disabled.
    */
    public int getTooltipColumn()  {
        return JnaIconView.INST().gtk_icon_view_get_tooltip_column(asCPointer());
    }

    /**
     * Activates the item determined by &#64;path.
     * @param path The `GtkTreePath` to be activated
    */
    public void itemActivated(@Nonnull TreePath path)  {
        JnaIconView.INST().gtk_icon_view_item_activated(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Returns %TRUE if the icon pointed to by &#64;path is currently
     * <br>selected. If &#64;path does not point to a valid location, %FALSE is returned.
     * @param path A `GtkTreePath` to check selection on.
     * @return %TRUE if &#64;path is selected.
    */
    public boolean pathIsSelected(@Nonnull TreePath path)  {
        return JnaIconView.INST().gtk_icon_view_path_is_selected(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Moves the alignments of &#64;icon_view to the position specified by &#64;path.
     * <br>&#64;row_align determines where the row is placed, and &#64;col_align determines
     * <br>where &#64;column is placed.  Both are expected to be between 0.0 and 1.0.
     * <br>0.0 means left/top alignment, 1.0 means right/bottom alignment, 0.5 means
     * <br>center.
     * <br>
     * <br>If &#64;use_align is %FALSE, then the alignment arguments are ignored, and the
     * <br>tree does the minimum amount of work to scroll the item onto the screen.
     * <br>This means that the item will be scrolled to the edge closest to its current
     * <br>position.  If the item is currently visible on the screen, nothing is done.
     * <br>
     * <br>This function only works if the model is set, and &#64;path is a valid row on
     * <br>the model. If the model changes before the &#64;icon_view is realized, the
     * <br>centered path will be modified to reflect this change.
     * @param path The path of the item to move to.
     * @param use_align whether to use alignment arguments, or %FALSE.
     * @param row_align The vertical alignment of the item specified by &#64;path.
     * @param col_align The horizontal alignment of the item specified by &#64;path.
    */
    public void scrollToPath(@Nonnull TreePath path, boolean use_align, float row_align, float col_align)  {
        JnaIconView.INST().gtk_icon_view_scroll_to_path(asCPointer(), asCPointerNotNull(path), use_align, row_align, col_align);
    }

    /**
     * Selects all the icons. &#64;icon_view must has its selection mode set
     * <br>to %GTK_SELECTION_MULTIPLE.
    */
    public void selectAll()  {
        JnaIconView.INST().gtk_icon_view_select_all(asCPointer());
    }

    /**
     * Selects the row at &#64;path.
     * @param path The `GtkTreePath` to be selected.
    */
    public void selectPath(@Nonnull TreePath path)  {
        JnaIconView.INST().gtk_icon_view_select_path(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Calls a function for each selected icon. Note that the model or
     * <br>selection cannot be modified from within this function.
     * @param func The function to call for each selected icon.
     * @param data User data to pass to the function.
    */
    public void selectedForeach(OnIconViewForeachFunc func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaIconView.INST().gtk_icon_view_selected_foreach(asCPointer(), toOnIconViewForeachFunc(this, "selectedForeach", func), asCPointer(data));
    }

    /**
     * Causes the `GtkIconView`::item-activated signal to be emitted on
     * <br>a single click instead of a double click.
     * @param single %TRUE to emit item-activated on a single click
    */
    public void setActivateOnSingleClick(boolean single)  {
        JnaIconView.INST().gtk_icon_view_set_activate_on_single_click(asCPointer(), single);
    }

    /**
     * Sets the ::column-spacing property which specifies the space
     * <br>which is inserted between the columns of the icon view.
     * @param column_spacing the column spacing
    */
    public void setColumnSpacing(int column_spacing)  {
        JnaIconView.INST().gtk_icon_view_set_column_spacing(asCPointer(), column_spacing);
    }

    /**
     * Sets the ::columns property which determines in how
     * <br>many columns the icons are arranged. If &#64;columns is
     * <br>-1, the number of columns will be chosen automatically
     * <br>to fill the available area.
     * @param columns the number of columns
    */
    public void setColumns(int columns)  {
        JnaIconView.INST().gtk_icon_view_set_columns(asCPointer(), columns);
    }

    /**
     * Sets the current keyboard focus to be at &#64;path, and selects it.  This is
     * <br>useful when you want to focus the user’s attention on a particular item.
     * <br>If &#64;cell is not %NULL, then focus is given to the cell specified by
     * <br>it. Additionally, if &#64;start_editing is %TRUE, then editing should be
     * <br>started in the specified cell.
     * <br>
     * <br>This function is often followed by `gtk_widget_grab_focus
     * <br>(icon_view)` in order to give keyboard focus to the widget.
     * <br>Please note that editing can only happen when the widget is realized.
     * @param path A `GtkTreePath`
     * @param cell One of the cell renderers of &#64;icon_view
     * @param start_editing %TRUE if the specified cell should start being edited.
    */
    public void setCursor(@Nonnull TreePath path, @Nullable CellRenderer cell, boolean start_editing)  {
        JnaIconView.INST().gtk_icon_view_set_cursor(asCPointer(), asCPointerNotNull(path), asCPointer(cell), start_editing);
    }

    /**
     * Sets the item that is highlighted for feedback.
     * @param path The path of the item to highlight
     * @param pos Specifies where to drop, relative to the item
    */
    public void setDragDestItem(@Nullable TreePath path, int pos)  {
        JnaIconView.INST().gtk_icon_view_set_drag_dest_item(asCPointer(), asCPointer(path), pos);
    }

    /**
     * Sets the ::item-orientation property which determines whether the labels
     * <br>are drawn beside the icons instead of below.
     * @param orientation the relative position of texts and icons
    */
    public void setItemOrientation(int orientation)  {
        JnaIconView.INST().gtk_icon_view_set_item_orientation(asCPointer(), orientation);
    }

    /**
     * Sets the `GtkIconView`:item-padding property which specifies the padding
     * <br>around each of the icon view’s items.
     * @param item_padding the item padding
    */
    public void setItemPadding(int item_padding)  {
        JnaIconView.INST().gtk_icon_view_set_item_padding(asCPointer(), item_padding);
    }

    /**
     * Sets the ::item-width property which specifies the width
     * <br>to use for each item. If it is set to -1, the icon view will
     * <br>automatically determine a suitable item size.
     * @param item_width the width for each item
    */
    public void setItemWidth(int item_width)  {
        JnaIconView.INST().gtk_icon_view_set_item_width(asCPointer(), item_width);
    }

    /**
     * Sets the ::margin property which specifies the space
     * <br>which is inserted at the top, bottom, left and right
     * <br>of the icon view.
     * @param margin the margin
    */
    public void setMargin(int margin)  {
        JnaIconView.INST().gtk_icon_view_set_margin(asCPointer(), margin);
    }

    /**
     * Sets the column with markup information for &#64;icon_view to be
     * <br>&#64;column. The markup column must be of type `G_TYPE_STRING`.
     * <br>If the markup column is set to something, it overrides
     * <br>the text column set by gtk_icon_view_set_text_column().
     * @param column A column in the currently used model, or -1 to display no text
    */
    public void setMarkupColumn(int column)  {
        JnaIconView.INST().gtk_icon_view_set_markup_column(asCPointer(), column);
    }

    /**
     * Sets the model for a `GtkIconView`.
     * <br>If the &#64;icon_view already has a model set, it will remove
     * <br>it before setting the new model.  If &#64;model is %NULL, then
     * <br>it will unset the old model.
     * @param model The model.
    */
    public void setModel(@Nullable TreeModel model)  {
        JnaIconView.INST().gtk_icon_view_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Sets the column with pixbufs for &#64;icon_view to be &#64;column. The pixbuf
     * <br>column must be of type `GDK_TYPE_PIXBUF`
     * @param column A column in the currently used model, or -1 to disable
    */
    public void setPixbufColumn(int column)  {
        JnaIconView.INST().gtk_icon_view_set_pixbuf_column(asCPointer(), column);
    }

    /**
     * This function is a convenience function to allow you to reorder models that
     * <br>support the `GtkTreeDragSourceIface` and the `GtkTreeDragDestIface`. Both
     * <br>`GtkTreeStore` and `GtkListStore` support these. If &#64;reorderable is %TRUE, then
     * <br>the user can reorder the model by dragging and dropping rows.  The
     * <br>developer can listen to these changes by connecting to the model's
     * <br>row_inserted and row_deleted signals. The reordering is implemented by setting up
     * <br>the icon view as a drag source and destination. Therefore, drag and
     * <br>drop can not be used in a reorderable view for any other purpose.
     * <br>
     * <br>This function does not give you any degree of control over the order -- any
     * <br>reordering is allowed.  If more control is needed, you should probably
     * <br>handle drag and drop manually.
     * @param reorderable %TRUE, if the list of items can be reordered.
    */
    public void setReorderable(boolean reorderable)  {
        JnaIconView.INST().gtk_icon_view_set_reorderable(asCPointer(), reorderable);
    }

    /**
     * Sets the ::row-spacing property which specifies the space
     * <br>which is inserted between the rows of the icon view.
     * @param row_spacing the row spacing
    */
    public void setRowSpacing(int row_spacing)  {
        JnaIconView.INST().gtk_icon_view_set_row_spacing(asCPointer(), row_spacing);
    }

    /**
     * Sets the selection mode of the &#64;icon_view.
     * @param mode The selection mode
    */
    public void setSelectionMode(int mode)  {
        JnaIconView.INST().gtk_icon_view_set_selection_mode(asCPointer(), mode);
    }

    /**
     * Sets the ::spacing property which specifies the space
     * <br>which is inserted between the cells (i.e. the icon and
     * <br>the text) of an item.
     * @param spacing the spacing
    */
    public void setSpacing(int spacing)  {
        JnaIconView.INST().gtk_icon_view_set_spacing(asCPointer(), spacing);
    }

    /**
     * Sets the column with text for &#64;icon_view to be &#64;column. The text
     * <br>column must be of type `G_TYPE_STRING`.
     * @param column A column in the currently used model, or -1 to display no text
    */
    public void setTextColumn(int column)  {
        JnaIconView.INST().gtk_icon_view_set_text_column(asCPointer(), column);
    }

    /**
     * Sets the tip area of &#64;tooltip to the area which &#64;cell occupies in
     * <br>the item pointed to by &#64;path. See also gtk_tooltip_set_tip_area().
     * <br>
     * <br>See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
     * @param tooltip a `GtkTooltip`
     * @param path a `GtkTreePath`
     * @param cell a `GtkCellRenderer`
    */
    public void setTooltipCell(@Nonnull Tooltip tooltip, @Nonnull TreePath path, @Nullable CellRenderer cell)  {
        JnaIconView.INST().gtk_icon_view_set_tooltip_cell(asCPointer(), asCPointerNotNull(tooltip), asCPointerNotNull(path), asCPointer(cell));
    }

    /**
     * If you only plan to have simple (text-only) tooltips on full items, you
     * <br>can use this function to have `GtkIconView` handle these automatically
     * <br>for you. &#64;column should be set to the column in &#64;icon_view’s model
     * <br>containing the tooltip texts, or -1 to disable this feature.
     * <br>
     * <br>When enabled, `GtkWidget:has-tooltip` will be set to %TRUE and
     * <br>&#64;icon_view will connect a `GtkWidget::query-tooltip` signal handler.
     * <br>
     * <br>Note that the signal handler sets the text with gtk_tooltip_set_markup(),
     * <br>so &amp;, &lt;, etc have to be escaped in the text.
     * @param column an integer, which is a valid column number for &#64;icon_view’s model
    */
    public void setTooltipColumn(int column)  {
        JnaIconView.INST().gtk_icon_view_set_tooltip_column(asCPointer(), column);
    }

    /**
     * Sets the tip area of &#64;tooltip to be the area covered by the item at &#64;path.
     * <br>See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
     * <br>See also gtk_tooltip_set_tip_area().
     * @param tooltip a `GtkTooltip`
     * @param path a `GtkTreePath`
    */
    public void setTooltipItem(@Nonnull Tooltip tooltip, @Nonnull TreePath path)  {
        JnaIconView.INST().gtk_icon_view_set_tooltip_item(asCPointer(), asCPointerNotNull(tooltip), asCPointerNotNull(path));
    }

    /**
     * Unselects all the icons.
    */
    public void unselectAll()  {
        JnaIconView.INST().gtk_icon_view_unselect_all(asCPointer());
    }

    /**
     * Unselects the row at &#64;path.
     * @param path The `GtkTreePath` to be unselected.
    */
    public void unselectPath(@Nonnull TreePath path)  {
        JnaIconView.INST().gtk_icon_view_unselect_path(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Undoes the effect of gtk_icon_view_enable_model_drag_dest(). Calling this
     * <br>method sets `GtkIconView`:reorderable to %FALSE.
    */
    public void unsetModelDragDest()  {
        JnaIconView.INST().gtk_icon_view_unset_model_drag_dest(asCPointer());
    }

    /**
     * Undoes the effect of gtk_icon_view_enable_model_drag_source(). Calling this
     * <br>method sets `GtkIconView`:reorderable to %FALSE.
    */
    public void unsetModelDragSource()  {
        JnaIconView.INST().gtk_icon_view_unset_model_drag_source(asCPointer());
    }

    public final static String SIGNAL_ON_ACTIVATE_CURSOR_ITEM = "activate-cursor-item";
    
    /**
     * Connect to signal "activate-cursor-item".
     * <br>See {@link OnActivateCursorItem#onActivateCursorItem} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE_CURSOR_ITEM} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivateCursorItem(OnActivateCursorItem signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE_CURSOR_ITEM, toOnActivateCursorItem(signal));
    }

    public final static String SIGNAL_ON_ITEM_ACTIVATED = "item-activated";
    
    /**
     * Connect to signal "item-activated".
     * <br>See {@link OnItemActivated#onItemActivated} for signal description.
     * <br>Field {@link #SIGNAL_ON_ITEM_ACTIVATED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onItemActivated(OnItemActivated signal) {
        return connectSignal(SIGNAL_ON_ITEM_ACTIVATED, toOnItemActivated(signal));
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

    public final static String SIGNAL_ON_SELECT_CURSOR_ITEM = "select-cursor-item";
    
    /**
     * Connect to signal "select-cursor-item".
     * <br>See {@link OnSelectCursorItem#onSelectCursorItem} for signal description.
     * <br>Field {@link #SIGNAL_ON_SELECT_CURSOR_ITEM} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSelectCursorItem(OnSelectCursorItem signal) {
        return connectSignal(SIGNAL_ON_SELECT_CURSOR_ITEM, toOnSelectCursorItem(signal));
    }

    public final static String SIGNAL_ON_SELECTION_CHANGED = "selection-changed";
    
    /**
     * Connect to signal "selection-changed".
     * <br>See {@link OnSelectionChanged#onSelectionChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_SELECTION_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSelectionChanged(OnSelectionChanged signal) {
        return connectSignal(SIGNAL_ON_SELECTION_CHANGED, toOnSelectionChanged(signal));
    }

    public final static String SIGNAL_ON_TOGGLE_CURSOR_ITEM = "toggle-cursor-item";
    
    /**
     * Connect to signal "toggle-cursor-item".
     * <br>See {@link OnToggleCursorItem#onToggleCursorItem} for signal description.
     * <br>Field {@link #SIGNAL_ON_TOGGLE_CURSOR_ITEM} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onToggleCursorItem(OnToggleCursorItem signal) {
        return connectSignal(SIGNAL_ON_TOGGLE_CURSOR_ITEM, toOnToggleCursorItem(signal));
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
     * Implements interface {@link CellLayout}. Call this to get access to interface functions.
     * @return {@link CellLayout}
    */
    public CellLayout asCellLayout() {
        return new CellLayout(cast());
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
        return JnaIconView.INST().gtk_icon_view_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getCursor:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreePath**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkCellRenderer**}}:{j:}]

[MethodModel:java-type-not-supported:getDestItemAtPos:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreePath**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:java-type-not-supported:getDragDestItem:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreePath**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:getItemAtPos:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreePath**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkCellRenderer**}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:getTooltipContext:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreeModel**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreePath**}}:{j:}]
        [ParameterModel:Supported:{Gg:TreeIter:{c:GtkTreeIter*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:getVisibleRange:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreePath**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreePath**}}:{j:}]
*/
