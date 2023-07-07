/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A widget for displaying both trees and lists
 * <br>
 * <br>Widget that displays any object that implements the [iface&#64;Gtk.TreeModel] interface.
 * <br>
 * <br>Please refer to the [tree widget conceptual overview](section-tree-widget.html)
 * <br>for an overview of all the objects and data types related to the tree
 * <br>widget and how they work together.
 * <br>
 * <br>&#35;&#35; Coordinate systems in GtkTreeView API
 * <br>
 * <br>Several different coordinate systems are exposed in the `GtkTreeView` API.
 * <br>These are:
 * <br>
 * <br>![](tree-view-coordinates.png)
 * <br>
 * <br>- Widget coordinates: Coordinates relative to the widget (usually `widget-&gt;window`).
 * <br>
 * <br>- Bin window coordinates: Coordinates relative to the window that GtkTreeView renders to.
 * <br>
 * <br>- Tree coordinates: Coordinates relative to the entire scrollable area of GtkTreeView. These
 * <br>  coordinates start at (0, 0) for row 0 of the tree.
 * <br>
 * <br>Several functions are available for converting between the different
 * <br>coordinate systems.  The most common translations are between widget and bin
 * <br>window coordinates and between bin window and tree coordinates. For the
 * <br>former you can use [method&#64;Gtk.TreeView.convert_widget_to_bin_window_coords]
 * <br>(and vice versa), for the latter [method&#64;Gtk.TreeView.convert_bin_window_to_tree_coords]
 * <br>(and vice versa).
 * <br>
 * <br>&#35;&#35; `GtkTreeView` as `GtkBuildable`
 * <br>
 * <br>The `GtkTreeView` implementation of the `GtkBuildable` interface accepts
 * <br>[class&#64;Gtk.TreeViewColumn] objects as `&lt;child&gt;` elements and exposes the
 * <br>internal [class&#64;Gtk.TreeSelection] in UI definitions.
 * <br>
 * <br>An example of a UI definition fragment with `GtkTreeView`:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkTreeView&quot; id=&quot;treeview&quot;&gt;
 * <br>  &lt;property name=&quot;model&quot;&gt;liststore1&lt;/property&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkTreeViewColumn&quot; id=&quot;test-column&quot;&gt;
 * <br>      &lt;property name=&quot;title&quot;&gt;Test&lt;/property&gt;
 * <br>      &lt;child&gt;
 * <br>        &lt;object class=&quot;GtkCellRendererText&quot; id=&quot;test-renderer&quot;/&gt;
 * <br>        &lt;attributes&gt;
 * <br>          &lt;attribute name=&quot;text&quot;&gt;1&lt;/attribute&gt;
 * <br>        &lt;/attributes&gt;
 * <br>      &lt;/child&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>  &lt;child internal-child=&quot;selection&quot;&gt;
 * <br>    &lt;object class=&quot;GtkTreeSelection&quot; id=&quot;selection&quot;&gt;
 * <br>      &lt;signal name=&quot;changed&quot; handler=&quot;on_treeview_selection_changed&quot;/&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>```
 * <br>treeview.view
 * <br>├── header
 * <br>│   ├── button
 * <br>│   │   ╰── [sort-indicator]
 * <br>┊   ┊
 * <br>│   ╰── button
 * <br>│       ╰── [sort-indicator]
 * <br>│
 * <br>├── [rubberband]
 * <br>╰── [dndtarget]
 * <br>```
 * <br>
 * <br>`GtkTreeView` has a main CSS node with name `treeview` and style class `.view`.
 * <br>It has a subnode with name `header`, which is the parent for all the column
 * <br>header widgets' CSS nodes.
 * <br>
 * <br>Each column header consists of a `button`, which among other content, has a
 * <br>child with name `sort-indicator`, which carries the `.ascending` or `.descending`
 * <br>style classes when the column header should show a sort indicator. The CSS
 * <br>is expected to provide a suitable image using the `-gtk-icon-source` property.
 * <br>
 * <br>For rubberband selection, a subnode with name `rubberband` is used.
 * <br>
 * <br>For the drop target location during DND, a subnode with name `dndtarget` is used.
 * <p><a href="https://docs.gtk.org/gtk4/class.TreeView.html">https://docs.gtk.org/gtk4/class.TreeView.html</a></p>
*/
public class TreeView extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeView.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTreeCellDataFunc {
        /**
         * A function to set the properties of a cell instead of just using the
         * <br>straight mapping between the cell and the model.
         * <br>
         * <br>This function is useful for customizing the cell renderer. For example,
         * <br>a function might get an* integer from the &#64;tree_model, and render it to
         * <br>the “text” attribute of “cell” by converting it to its written equivalent.
         * <br>
         * <br>See also: gtk_tree_view_column_set_cell_data_func()
         * @param tree_column A `GtkTreeViewColumn`
         * @param cell The `GtkCellRenderer` that is being rendered by &#64;tree_column
         * @param tree_model The `GtkTreeModel` being rendered
         * @param iter A `GtkTreeIter` of the current row rendered
         * @param data user data
        */
        void onTreeCellDataFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeViewColumn tree_column, @Nonnull CellRenderer cell, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTreeView.OnTreeCellDataFunc toOnTreeCellDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeCellDataFunc in) {
        JnaTreeView.OnTreeCellDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_column, _cell, _tree_model, _iter, _data) -> in.onTreeCellDataFunc(__callback, new TreeViewColumn(new PointerContainer(_tree_column)), new CellRenderer(new PointerContainer(_cell)), new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
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
    
    private static JnaTreeView.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaTreeView.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTreeViewMappingFunc {
        /**
         * Function used for gtk_tree_view_map_expanded_rows().
         * @param tree_view A `GtkTreeView`
         * @param path The path that’s expanded
         * @param user_data user data
        */
        void onTreeViewMappingFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view, @Nonnull TreePath path, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaTreeView.OnTreeViewMappingFunc toOnTreeViewMappingFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeViewMappingFunc in) {
        JnaTreeView.OnTreeViewMappingFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view, _path, _user_data) -> in.onTreeViewMappingFunc(__callback, new TreeView(new PointerContainer(_tree_view)), new TreePath(new PointerContainer(_path)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTreeViewColumnDropFunc {
        /**
         * Function type for determining whether &#64;column can be dropped in a
         * <br>particular spot (as determined by &#64;prev_column and &#64;next_column).  In
         * <br>left to right locales, &#64;prev_column is on the left of the potential drop
         * <br>spot, and &#64;next_column is on the right.  In right to left mode, this is
         * <br>reversed.  This function should return %TRUE if the spot is a valid drop
         * <br>spot.  Please note that returning %TRUE does not actually indicate that
         * <br>the column drop was made, but is meant only to indicate a possible drop
         * <br>spot to the user.
         * @param tree_view A `GtkTreeView`
         * @param column The `GtkTreeViewColumn` being dragged
         * @param prev_column A `GtkTreeViewColumn` on one side of &#64;column
         * @param next_column A `GtkTreeViewColumn` on the other side of &#64;column
         * @param data user data
         * @return %TRUE, if &#64;column can be dropped in this spot
        */
        boolean onTreeViewColumnDropFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view, @Nonnull TreeViewColumn column, @Nonnull TreeViewColumn prev_column, @Nonnull TreeViewColumn next_column, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTreeView.OnTreeViewColumnDropFunc toOnTreeViewColumnDropFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeViewColumnDropFunc in) {
        JnaTreeView.OnTreeViewColumnDropFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view, _column, _prev_column, _next_column, _data) -> in.onTreeViewColumnDropFunc(__callback, new TreeView(new PointerContainer(_tree_view)), new TreeViewColumn(new PointerContainer(_column)), new TreeViewColumn(new PointerContainer(_prev_column)), new TreeViewColumn(new PointerContainer(_next_column)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTreeViewRowSeparatorFunc {
        /**
         * Function type for determining whether the row pointed to by &#64;iter should
         * <br>be rendered as a separator. A common way to implement this is to have a
         * <br>boolean column in the model, whose values the `GtkTreeViewRowSeparatorFunc`
         * <br>returns.
         * @param model the `GtkTreeModel`
         * @param iter a `GtkTreeIter` pointing at a row in &#64;model
         * @param data user data
         * @return %TRUE if the row is a separator
        */
        boolean onTreeViewRowSeparatorFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel model, @Nonnull TreeIter iter, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTreeView.OnTreeViewRowSeparatorFunc toOnTreeViewRowSeparatorFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeViewRowSeparatorFunc in) {
        JnaTreeView.OnTreeViewRowSeparatorFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _iter, _data) -> in.onTreeViewRowSeparatorFunc(__callback, new TreeModel(new PointerContainer(_model)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTreeViewSearchEqualFunc {
        /**
         * A function used for checking whether a row in &#64;model matches
         * <br>a search key string entered by the user. Note the return value
         * <br>is reversed from what you would normally expect, though it
         * <br>has some similarity to strcmp() returning 0 for equal strings.
         * @param model the `GtkTreeModel` being searched
         * @param column the search column set by gtk_tree_view_set_search_column()
         * @param key the key string to compare with
         * @param iter a `GtkTreeIter` pointing the row of &#64;model that should be compared  with &#64;key.
         * @param search_data user data from gtk_tree_view_set_search_equal_func()
         * @return %FALSE if the row matches, %TRUE otherwise.
        */
        boolean onTreeViewSearchEqualFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel model, int column, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull TreeIter iter, @Nullable ch.bailu.gtk.type.Pointer search_data);
    }
    
    private static JnaTreeView.OnTreeViewSearchEqualFunc toOnTreeViewSearchEqualFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeViewSearchEqualFunc in) {
        JnaTreeView.OnTreeViewSearchEqualFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _column, _key, _iter, _search_data) -> in.onTreeViewSearchEqualFunc(__callback, new TreeModel(new PointerContainer(_model)), _column, new ch.bailu.gtk.type.Str(new PointerContainer(_key)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_search_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnColumnsChanged {
        /**
         * The number of columns of the treeview has changed.
        */
        void onColumnsChanged();
    }
    
    private static com.sun.jna.Callback toOnColumnsChanged(OnColumnsChanged in) {
        return (in == null) ? null: (JnaTreeView.OnColumnsChanged) (__self, __data) -> in.onColumnsChanged();
    }

    @FunctionalInterface
    public interface OnCursorChanged {
        /**
         * The position of the cursor (focused cell) has changed.
        */
        void onCursorChanged();
    }
    
    private static com.sun.jna.Callback toOnCursorChanged(OnCursorChanged in) {
        return (in == null) ? null: (JnaTreeView.OnCursorChanged) (__self, __data) -> in.onCursorChanged();
    }

    @FunctionalInterface
    public interface OnExpandCollapseCursorRow {
        /**
         * 
         * @param object 
         * @param p0 
         * @param p1 
         * @return 
        */
        boolean onExpandCollapseCursorRow(boolean object, boolean p0, boolean p1);
    }
    
    private static com.sun.jna.Callback toOnExpandCollapseCursorRow(OnExpandCollapseCursorRow in) {
        return (in == null) ? null: (JnaTreeView.OnExpandCollapseCursorRow) (__self, _object, _p0, _p1, __data) -> in.onExpandCollapseCursorRow(_object, _p0, _p1);
    }

    @FunctionalInterface
    public interface OnMoveCursor {
        /**
         * The `GtkTreeView`::move-cursor signal is a [keybinding
         * <br>signal][class&#64;Gtk.SignalAction] which gets emitted when the user
         * <br>presses one of the cursor keys.
         * <br>
         * <br>Applications should not connect to it, but may emit it with
         * <br>g_signal_emit_by_name() if they need to control the cursor
         * <br>programmatically. In contrast to gtk_tree_view_set_cursor() and
         * <br>gtk_tree_view_set_cursor_on_cell() when moving horizontally
         * <br>`GtkTreeView`::move-cursor does not reset the current selection.
         * @param step the granularity of the move, as a `GtkMovementStep`.     %GTK_MOVEMENT_LOGICAL_POSITIONS, %GTK_MOVEMENT_VISUAL_POSITIONS,     %GTK_MOVEMENT_DISPLAY_LINES, %GTK_MOVEMENT_PAGES and     %GTK_MOVEMENT_BUFFER_ENDS are supported.     %GTK_MOVEMENT_LOGICAL_POSITIONS and %GTK_MOVEMENT_VISUAL_POSITIONS     are treated identically.
         * @param direction the direction to move: +1 to move forwards; -1 to move     backwards. The resulting movement is undefined for all other values.
         * @param extend whether to extend the selection
         * @param modify whether to modify the selection
         * @return %TRUE if &#64;step is supported, %FALSE otherwise.
        */
        boolean onMoveCursor(int step, int direction, boolean extend, boolean modify);
    }
    
    private static com.sun.jna.Callback toOnMoveCursor(OnMoveCursor in) {
        return (in == null) ? null: (JnaTreeView.OnMoveCursor) (__self, _step, _direction, _extend, _modify, __data) -> in.onMoveCursor(_step, _direction, _extend, _modify);
    }

    @FunctionalInterface
    public interface OnRowActivated {
        /**
         * The &quot;row-activated&quot; signal is emitted when the method
         * <br>[`method&#64;Gtk.TreeView.row_activated`] is called.
         * <br>
         * <br>This signal is emitted when the user double-clicks a treeview row with the
         * <br>[property&#64;Gtk.TreeView:activate-on-single-click] property set to %FALSE,
         * <br>or when the user single-clicks a row when that property set to %TRUE.
         * <br>
         * <br>This signal is also emitted when a non-editable row is selected and one
         * <br>of the keys: &lt;kbd&gt;Space&lt;/kbd&gt;, &lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Space&lt;/kbd&gt;,
         * <br>&lt;kbd&gt;Return&lt;/kbd&gt; or &lt;kbd&gt;Enter&lt;/kbd&gt; is pressed.
         * <br>
         * <br>For selection handling refer to the
         * <br>[tree widget conceptual overview](section-tree-widget.html)
         * <br>as well as `GtkTreeSelection`.
         * @param path the `GtkTreePath` for the activated row
         * @param column the `GtkTreeViewColumn` in which the activation occurred
        */
        void onRowActivated(@Nonnull TreePath path, @Nullable TreeViewColumn column);
    }
    
    private static com.sun.jna.Callback toOnRowActivated(OnRowActivated in) {
        return (in == null) ? null: (JnaTreeView.OnRowActivated) (__self, _path, _column, __data) -> in.onRowActivated(new TreePath(new PointerContainer(_path)), new TreeViewColumn(new PointerContainer(_column)));
    }

    @FunctionalInterface
    public interface OnRowCollapsed {
        /**
         * The given row has been collapsed (child nodes are hidden).
         * @param iter the tree iter of the collapsed row
         * @param path a tree path that points to the row
        */
        void onRowCollapsed(@Nonnull TreeIter iter, @Nonnull TreePath path);
    }
    
    private static com.sun.jna.Callback toOnRowCollapsed(OnRowCollapsed in) {
        return (in == null) ? null: (JnaTreeView.OnRowCollapsed) (__self, _iter, _path, __data) -> in.onRowCollapsed(new TreeIter(new PointerContainer(_iter)), new TreePath(new PointerContainer(_path)));
    }

    @FunctionalInterface
    public interface OnRowExpanded {
        /**
         * The given row has been expanded (child nodes are shown).
         * @param iter the tree iter of the expanded row
         * @param path a tree path that points to the row
        */
        void onRowExpanded(@Nonnull TreeIter iter, @Nonnull TreePath path);
    }
    
    private static com.sun.jna.Callback toOnRowExpanded(OnRowExpanded in) {
        return (in == null) ? null: (JnaTreeView.OnRowExpanded) (__self, _iter, _path, __data) -> in.onRowExpanded(new TreeIter(new PointerContainer(_iter)), new TreePath(new PointerContainer(_path)));
    }

    @FunctionalInterface
    public interface OnSelectAll {
        /**
         * 
         * @return 
        */
        boolean onSelectAll();
    }
    
    private static com.sun.jna.Callback toOnSelectAll(OnSelectAll in) {
        return (in == null) ? null: (JnaTreeView.OnSelectAll) (__self, __data) -> in.onSelectAll();
    }

    @FunctionalInterface
    public interface OnSelectCursorParent {
        /**
         * 
         * @return 
        */
        boolean onSelectCursorParent();
    }
    
    private static com.sun.jna.Callback toOnSelectCursorParent(OnSelectCursorParent in) {
        return (in == null) ? null: (JnaTreeView.OnSelectCursorParent) (__self, __data) -> in.onSelectCursorParent();
    }

    @FunctionalInterface
    public interface OnSelectCursorRow {
        /**
         * 
         * @param object 
         * @return 
        */
        boolean onSelectCursorRow(boolean object);
    }
    
    private static com.sun.jna.Callback toOnSelectCursorRow(OnSelectCursorRow in) {
        return (in == null) ? null: (JnaTreeView.OnSelectCursorRow) (__self, _object, __data) -> in.onSelectCursorRow(_object);
    }

    @FunctionalInterface
    public interface OnStartInteractiveSearch {
        /**
         * 
         * @return 
        */
        boolean onStartInteractiveSearch();
    }
    
    private static com.sun.jna.Callback toOnStartInteractiveSearch(OnStartInteractiveSearch in) {
        return (in == null) ? null: (JnaTreeView.OnStartInteractiveSearch) (__self, __data) -> in.onStartInteractiveSearch();
    }

    @FunctionalInterface
    public interface OnTestCollapseRow {
        /**
         * The given row is about to be collapsed (hide its children nodes). Use this
         * <br>signal if you need to control the collapsibility of individual rows.
         * @param iter the tree iter of the row to collapse
         * @param path a tree path that points to the row
         * @return %FALSE to allow collapsing, %TRUE to reject
        */
        boolean onTestCollapseRow(@Nonnull TreeIter iter, @Nonnull TreePath path);
    }
    
    private static com.sun.jna.Callback toOnTestCollapseRow(OnTestCollapseRow in) {
        return (in == null) ? null: (JnaTreeView.OnTestCollapseRow) (__self, _iter, _path, __data) -> in.onTestCollapseRow(new TreeIter(new PointerContainer(_iter)), new TreePath(new PointerContainer(_path)));
    }

    @FunctionalInterface
    public interface OnTestExpandRow {
        /**
         * The given row is about to be expanded (show its children nodes). Use this
         * <br>signal if you need to control the expandability of individual rows.
         * @param iter the tree iter of the row to expand
         * @param path a tree path that points to the row
         * @return %FALSE to allow expansion, %TRUE to reject
        */
        boolean onTestExpandRow(@Nonnull TreeIter iter, @Nonnull TreePath path);
    }
    
    private static com.sun.jna.Callback toOnTestExpandRow(OnTestExpandRow in) {
        return (in == null) ? null: (JnaTreeView.OnTestExpandRow) (__self, _iter, _path, __data) -> in.onTestExpandRow(new TreeIter(new PointerContainer(_iter)), new TreePath(new PointerContainer(_path)));
    }

    @FunctionalInterface
    public interface OnToggleCursorRow {
        /**
         * 
         * @return 
        */
        boolean onToggleCursorRow();
    }
    
    private static com.sun.jna.Callback toOnToggleCursorRow(OnToggleCursorRow in) {
        return (in == null) ? null: (JnaTreeView.OnToggleCursorRow) (__self, __data) -> in.onToggleCursorRow();
    }

    @FunctionalInterface
    public interface OnUnselectAll {
        /**
         * 
         * @return 
        */
        boolean onUnselectAll();
    }
    
    private static com.sun.jna.Callback toOnUnselectAll(OnUnselectAll in) {
        return (in == null) ? null: (JnaTreeView.OnUnselectAll) (__self, __data) -> in.onUnselectAll();
    }

    public TreeView(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkTreeView` widget with the model initialized to &#64;model.
     * @param model the model.
     * @return A newly created `GtkTreeView` widget.
    */
    public static TreeView newWithModelTreeView(@Nonnull TreeModel model)  {
        PointerContainer __self = cast(JnaTreeView.INST().gtk_tree_view_new_with_model(asCPointerNotNull(model)));
        if (__self.isNull()) {
            throw new NullPointerException("TreeView:newWithModel");
        }
        return new TreeView(__self);
    }        
    

    /**
     * Creates a new `GtkTreeView` widget.
    */
    public TreeView() {
        super(cast(JnaTreeView.INST().gtk_tree_view_new()));
    }

    /**
     * Appends &#64;column to the list of columns. If &#64;tree_view has “fixed_height”
     * <br>mode enabled, then &#64;column must have its “sizing” property set to be
     * <br>GTK_TREE_VIEW_COLUMN_FIXED.
     * @param column The `GtkTreeViewColumn` to add.
     * @return The number of columns in &#64;tree_view after appending.
    */
    public int appendColumn(@Nonnull TreeViewColumn column)  {
        return JnaTreeView.INST().gtk_tree_view_append_column(asCPointer(), asCPointerNotNull(column));
    }

    /**
     * Recursively collapses all visible, expanded nodes in &#64;tree_view.
    */
    public void collapseAll()  {
        JnaTreeView.INST().gtk_tree_view_collapse_all(asCPointer());
    }

    /**
     * Collapses a row (hides its child rows, if they exist).
     * @param path path to a row in the &#64;tree_view
     * @return %TRUE if the row was collapsed.
    */
    public boolean collapseRow(@Nonnull TreePath path)  {
        return JnaTreeView.INST().gtk_tree_view_collapse_row(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Resizes all columns to their optimal width. Only works after the
     * <br>treeview has been realized.
    */
    public void columnsAutosize()  {
        JnaTreeView.INST().gtk_tree_view_columns_autosize(asCPointer());
    }

    /**
     * Converts bin_window coordinates to coordinates for the
     * <br>tree (the full scrollable area of the tree).
     * @param bx X coordinate relative to bin_window
     * @param by Y coordinate relative to bin_window
     * @param tx return location for tree X coordinate
     * @param ty return location for tree Y coordinate
    */
    public void convertBinWindowToTreeCoords(int bx, int by, @Nonnull ch.bailu.gtk.type.Int tx, @Nonnull ch.bailu.gtk.type.Int ty)  {
        JnaTreeView.INST().gtk_tree_view_convert_bin_window_to_tree_coords(asCPointer(), bx, by, asCPointerNotNull(tx), asCPointerNotNull(ty));
    }

    /**
     * Converts bin_window coordinates to widget relative coordinates.
     * @param bx bin_window X coordinate
     * @param by bin_window Y coordinate
     * @param wx return location for widget X coordinate
     * @param wy return location for widget Y coordinate
    */
    public void convertBinWindowToWidgetCoords(int bx, int by, @Nonnull ch.bailu.gtk.type.Int wx, @Nonnull ch.bailu.gtk.type.Int wy)  {
        JnaTreeView.INST().gtk_tree_view_convert_bin_window_to_widget_coords(asCPointer(), bx, by, asCPointerNotNull(wx), asCPointerNotNull(wy));
    }

    /**
     * Converts tree coordinates (coordinates in full scrollable area of the tree)
     * <br>to bin_window coordinates.
     * @param tx tree X coordinate
     * @param ty tree Y coordinate
     * @param bx return location for X coordinate relative to bin_window
     * @param by return location for Y coordinate relative to bin_window
    */
    public void convertTreeToBinWindowCoords(int tx, int ty, @Nonnull ch.bailu.gtk.type.Int bx, @Nonnull ch.bailu.gtk.type.Int by)  {
        JnaTreeView.INST().gtk_tree_view_convert_tree_to_bin_window_coords(asCPointer(), tx, ty, asCPointerNotNull(bx), asCPointerNotNull(by));
    }

    /**
     * Converts tree coordinates (coordinates in full scrollable area of the tree)
     * <br>to widget coordinates.
     * @param tx X coordinate relative to the tree
     * @param ty Y coordinate relative to the tree
     * @param wx return location for widget X coordinate
     * @param wy return location for widget Y coordinate
    */
    public void convertTreeToWidgetCoords(int tx, int ty, @Nonnull ch.bailu.gtk.type.Int wx, @Nonnull ch.bailu.gtk.type.Int wy)  {
        JnaTreeView.INST().gtk_tree_view_convert_tree_to_widget_coords(asCPointer(), tx, ty, asCPointerNotNull(wx), asCPointerNotNull(wy));
    }

    /**
     * Converts widget coordinates to coordinates for the bin_window.
     * @param wx X coordinate relative to the widget
     * @param wy Y coordinate relative to the widget
     * @param bx return location for bin_window X coordinate
     * @param by return location for bin_window Y coordinate
    */
    public void convertWidgetToBinWindowCoords(int wx, int wy, @Nonnull ch.bailu.gtk.type.Int bx, @Nonnull ch.bailu.gtk.type.Int by)  {
        JnaTreeView.INST().gtk_tree_view_convert_widget_to_bin_window_coords(asCPointer(), wx, wy, asCPointerNotNull(bx), asCPointerNotNull(by));
    }

    /**
     * Converts widget coordinates to coordinates for the
     * <br>tree (the full scrollable area of the tree).
     * @param wx X coordinate relative to the widget
     * @param wy Y coordinate relative to the widget
     * @param tx return location for tree X coordinate
     * @param ty return location for tree Y coordinate
    */
    public void convertWidgetToTreeCoords(int wx, int wy, @Nonnull ch.bailu.gtk.type.Int tx, @Nonnull ch.bailu.gtk.type.Int ty)  {
        JnaTreeView.INST().gtk_tree_view_convert_widget_to_tree_coords(asCPointer(), wx, wy, asCPointerNotNull(tx), asCPointerNotNull(ty));
    }

    /**
     * Creates a `cairo_surface_t` representation of the row at &#64;path.
     * <br>This image is used for a drag icon.
     * @param path a `GtkTreePath` in &#64;tree_view
     * @return a newly-allocated surface of the drag icon.
    */
    public ch.bailu.gtk.gdk.Paintable createRowDragIcon(@Nonnull TreePath path)  {
        return new ch.bailu.gtk.gdk.Paintable(new PointerContainer(JnaTreeView.INST().gtk_tree_view_create_row_drag_icon(asCPointer(), asCPointerNotNull(path))));
    }

    /**
     * Turns &#64;tree_view into a drop destination for automatic DND. Calling
     * <br>this method sets `GtkTreeView`:reorderable to %FALSE.
     * @param formats the target formats that the drag will support
     * @param actions the bitmask of possible actions for a drag from this    widget
    */
    public void enableModelDragDest(@Nonnull ch.bailu.gtk.gdk.ContentFormats formats, int actions)  {
        JnaTreeView.INST().gtk_tree_view_enable_model_drag_dest(asCPointer(), asCPointerNotNull(formats), actions);
    }

    /**
     * Turns &#64;tree_view into a drag source for automatic DND. Calling this
     * <br>method sets `GtkTreeView`:reorderable to %FALSE.
     * @param start_button_mask Mask of allowed buttons to start drag
     * @param formats the target formats that the drag will support
     * @param actions the bitmask of possible actions for a drag from this    widget
    */
    public void enableModelDragSource(int start_button_mask, @Nonnull ch.bailu.gtk.gdk.ContentFormats formats, int actions)  {
        JnaTreeView.INST().gtk_tree_view_enable_model_drag_source(asCPointer(), start_button_mask, asCPointerNotNull(formats), actions);
    }

    /**
     * Recursively expands all nodes in the &#64;tree_view.
    */
    public void expandAll()  {
        JnaTreeView.INST().gtk_tree_view_expand_all(asCPointer());
    }

    /**
     * Opens the row so its children are visible.
     * @param path path to a row
     * @param open_all whether to recursively expand, or just expand immediate children
     * @return %TRUE if the row existed and had children
    */
    public boolean expandRow(@Nonnull TreePath path, boolean open_all)  {
        return JnaTreeView.INST().gtk_tree_view_expand_row(asCPointer(), asCPointerNotNull(path), open_all);
    }

    /**
     * Expands the row at &#64;path. This will also expand all parent rows of
     * <br>&#64;path as necessary.
     * @param path path to a row.
    */
    public void expandToPath(@Nonnull TreePath path)  {
        JnaTreeView.INST().gtk_tree_view_expand_to_path(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Gets the setting set by gtk_tree_view_set_activate_on_single_click().
     * @return %TRUE if row-activated will be emitted on a single click
    */
    public boolean getActivateOnSingleClick()  {
        return JnaTreeView.INST().gtk_tree_view_get_activate_on_single_click(asCPointer());
    }

    /**
     * Fills the bounding rectangle in bin_window coordinates for the cell at the
     * <br>row specified by &#64;path and the column specified by &#64;column.  If &#64;path is
     * <br>%NULL, or points to a node not found in the tree, the &#64;y and &#64;height fields of
     * <br>the rectangle will be filled with 0. If &#64;column is %NULL, the &#64;x and &#64;width
     * <br>fields will be filled with 0.  The returned rectangle is equivalent to the
     * <br>&#64;background_area passed to gtk_cell_renderer_render().  These background
     * <br>areas tile to cover the entire bin window.  Contrast with the &#64;cell_area,
     * <br>returned by gtk_tree_view_get_cell_area(), which returns only the cell
     * <br>itself, excluding surrounding borders and the tree expander area.
     * @param path a `GtkTreePath` for the row, or %NULL to get only horizontal coordinates
     * @param column a `GtkTreeViewColumn` for the column, or %NULL to get only vertical coordinates
     * @param rect rectangle to fill with cell background rect
    */
    public void getBackgroundArea(@Nullable TreePath path, @Nullable TreeViewColumn column, @Nonnull ch.bailu.gtk.gdk.Rectangle rect)  {
        JnaTreeView.INST().gtk_tree_view_get_background_area(asCPointer(), asCPointer(path), asCPointer(column), asCPointerNotNull(rect));
    }

    /**
     * Fills the bounding rectangle in bin_window coordinates for the cell at the
     * <br>row specified by &#64;path and the column specified by &#64;column.  If &#64;path is
     * <br>%NULL, or points to a path not currently displayed, the &#64;y and &#64;height fields
     * <br>of the rectangle will be filled with 0. If &#64;column is %NULL, the &#64;x and &#64;width
     * <br>fields will be filled with 0.  The sum of all cell rects does not cover the
     * <br>entire tree; there are extra pixels in between rows, for example. The
     * <br>returned rectangle is equivalent to the &#64;cell_area passed to
     * <br>gtk_cell_renderer_render().  This function is only valid if &#64;tree_view is
     * <br>realized.
     * @param path a `GtkTreePath` for the row, or %NULL to get only horizontal coordinates
     * @param column a `GtkTreeViewColumn` for the column, or %NULL to get only vertical coordinates
     * @param rect rectangle to fill with cell rect
    */
    public void getCellArea(@Nullable TreePath path, @Nullable TreeViewColumn column, @Nonnull ch.bailu.gtk.gdk.Rectangle rect)  {
        JnaTreeView.INST().gtk_tree_view_get_cell_area(asCPointer(), asCPointer(path), asCPointer(column), asCPointerNotNull(rect));
    }

    /**
     * Gets the `GtkTreeViewColumn` at the given position in the &#35;tree_view.
     * @param n The position of the column, counting from 0.
     * @return The `GtkTreeViewColumn`, or %NULL if the position is outside the range of columns.
    */
    public TreeViewColumn getColumn(int n)  {
        return new TreeViewColumn(new PointerContainer(JnaTreeView.INST().gtk_tree_view_get_column(asCPointer(), n)));
    }

    /**
     * Returns a `GList` of all the `GtkTreeViewColumn`s currently in &#64;tree_view.
     * <br>The returned list must be freed with g_list_free ().
     * @return A list of `GtkTreeViewColumn`s
    */
    public ch.bailu.gtk.glib.List getColumns()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaTreeView.INST().gtk_tree_view_get_columns(asCPointer())));
    }

    /**
     * Returns whether or not the tree allows to start interactive searching
     * <br>by typing in text.
     * @return whether or not to let the user search interactively
    */
    public boolean getEnableSearch()  {
        return JnaTreeView.INST().gtk_tree_view_get_enable_search(asCPointer());
    }

    /**
     * Returns whether or not tree lines are drawn in &#64;tree_view.
     * @return %TRUE if tree lines are drawn in &#64;tree_view, %FALSE otherwise.
    */
    public boolean getEnableTreeLines()  {
        return JnaTreeView.INST().gtk_tree_view_get_enable_tree_lines(asCPointer());
    }

    /**
     * Returns the column that is the current expander column,
     * <br>or %NULL if none has been set.
     * <br>This column has the expander arrow drawn next to it.
     * @return The expander column.
    */
    public TreeViewColumn getExpanderColumn()  {
        return new TreeViewColumn(new PointerContainer(JnaTreeView.INST().gtk_tree_view_get_expander_column(asCPointer())));
    }

    /**
     * Returns whether fixed height mode is turned on for &#64;tree_view.
     * @return %TRUE if &#64;tree_view is in fixed height mode
    */
    public boolean getFixedHeightMode()  {
        return JnaTreeView.INST().gtk_tree_view_get_fixed_height_mode(asCPointer());
    }

    /**
     * Returns which grid lines are enabled in &#64;tree_view.
     * @return a `GtkTreeView`GridLines value indicating which grid lines are enabled.
    */
    public int getGridLines()  {
        return JnaTreeView.INST().gtk_tree_view_get_grid_lines(asCPointer());
    }

    /**
     * Returns whether all header columns are clickable.
     * @return %TRUE if all header columns are clickable, otherwise %FALSE
    */
    public boolean getHeadersClickable()  {
        return JnaTreeView.INST().gtk_tree_view_get_headers_clickable(asCPointer());
    }

    /**
     * Returns %TRUE if the headers on the &#64;tree_view are visible.
     * @return Whether the headers are visible or not.
    */
    public boolean getHeadersVisible()  {
        return JnaTreeView.INST().gtk_tree_view_get_headers_visible(asCPointer());
    }

    /**
     * Returns whether hover expansion mode is turned on for &#64;tree_view.
     * @return %TRUE if &#64;tree_view is in hover expansion mode
    */
    public boolean getHoverExpand()  {
        return JnaTreeView.INST().gtk_tree_view_get_hover_expand(asCPointer());
    }

    /**
     * Returns whether hover selection mode is turned on for &#64;tree_view.
     * @return %TRUE if &#64;tree_view is in hover selection mode
    */
    public boolean getHoverSelection()  {
        return JnaTreeView.INST().gtk_tree_view_get_hover_selection(asCPointer());
    }

    /**
     * Returns the amount, in pixels, of extra indentation for child levels
     * <br>in &#64;tree_view.
     * @return the amount of extra indentation for child levels in &#64;tree_view.  A return value of 0 means that this feature is disabled.
    */
    public int getLevelIndentation()  {
        return JnaTreeView.INST().gtk_tree_view_get_level_indentation(asCPointer());
    }

    /**
     * Returns the model the `GtkTreeView` is based on.  Returns %NULL if the
     * <br>model is unset.
     * @return A `GtkTreeModel`
    */
    public TreeModel getModel()  {
        return new TreeModel(new PointerContainer(JnaTreeView.INST().gtk_tree_view_get_model(asCPointer())));
    }

    /**
     * Queries the number of columns in the given &#64;tree_view.
     * @return The number of columns in the &#64;tree_view
    */
    public int getNColumns()  {
        return JnaTreeView.INST().gtk_tree_view_get_n_columns(asCPointer());
    }

    /**
     * Retrieves whether the user can reorder the tree via drag-and-drop. See
     * <br>gtk_tree_view_set_reorderable().
     * @return %TRUE if the tree can be reordered.
    */
    public boolean getReorderable()  {
        return JnaTreeView.INST().gtk_tree_view_get_reorderable(asCPointer());
    }

    /**
     * Returns whether rubber banding is turned on for &#64;tree_view.  If the
     * <br>selection mode is %GTK_SELECTION_MULTIPLE, rubber banding will allow the
     * <br>user to select multiple rows by dragging the mouse.
     * @return %TRUE if rubber banding in &#64;tree_view is enabled.
    */
    public boolean getRubberBanding()  {
        return JnaTreeView.INST().gtk_tree_view_get_rubber_banding(asCPointer());
    }

    /**
     * Gets the column searched on by the interactive search code.
     * @return the column the interactive search code searches in.
    */
    public int getSearchColumn()  {
        return JnaTreeView.INST().gtk_tree_view_get_search_column(asCPointer());
    }

    /**
     * Returns the `GtkEntry` which is currently in use as interactive search
     * <br>entry for &#64;tree_view.  In case the built-in entry is being used, %NULL
     * <br>will be returned.
     * @return the entry currently in use as search entry.
    */
    public Editable getSearchEntry()  {
        return new Editable(new PointerContainer(JnaTreeView.INST().gtk_tree_view_get_search_entry(asCPointer())));
    }

    /**
     * Gets the `GtkTreeSelection` associated with &#64;tree_view.
     * @return A `GtkTreeSelection` object.
    */
    public TreeSelection getSelection()  {
        return new TreeSelection(new PointerContainer(JnaTreeView.INST().gtk_tree_view_get_selection(asCPointer())));
    }

    /**
     * Returns whether or not expanders are drawn in &#64;tree_view.
     * @return %TRUE if expanders are drawn in &#64;tree_view, %FALSE otherwise.
    */
    public boolean getShowExpanders()  {
        return JnaTreeView.INST().gtk_tree_view_get_show_expanders(asCPointer());
    }

    /**
     * Returns the column of &#64;tree_view’s model which is being used for
     * <br>displaying tooltips on &#64;tree_view’s rows.
     * @return the index of the tooltip column that is currently being used, or -1 if this is disabled.
    */
    public int getTooltipColumn()  {
        return JnaTreeView.INST().gtk_tree_view_get_tooltip_column(asCPointer());
    }

    /**
     * Fills &#64;visible_rect with the currently-visible region of the
     * <br>buffer, in tree coordinates. Convert to bin_window coordinates with
     * <br>gtk_tree_view_convert_tree_to_bin_window_coords().
     * <br>Tree coordinates start at 0,0 for row 0 of the tree, and cover the entire
     * <br>scrollable area of the tree.
     * @param visible_rect rectangle to fill
    */
    public void getVisibleRect(@Nonnull ch.bailu.gtk.gdk.Rectangle visible_rect)  {
        JnaTreeView.INST().gtk_tree_view_get_visible_rect(asCPointer(), asCPointerNotNull(visible_rect));
    }

    /**
     * This inserts the &#64;column into the &#64;tree_view at &#64;position.  If &#64;position is
     * <br>-1, then the column is inserted at the end. If &#64;tree_view has
     * <br>“fixed_height” mode enabled, then &#64;column must have its “sizing” property
     * <br>set to be GTK_TREE_VIEW_COLUMN_FIXED.
     * @param column The `GtkTreeViewColumn` to be inserted.
     * @param position The position to insert &#64;column in.
     * @return The number of columns in &#64;tree_view after insertion.
    */
    public int insertColumn(@Nonnull TreeViewColumn column, int position)  {
        return JnaTreeView.INST().gtk_tree_view_insert_column(asCPointer(), asCPointerNotNull(column), position);
    }

    /**
     * Creates a new `GtkTreeViewColumn` and inserts it into the &#64;tree_view at
     * <br>&#64;position.  If &#64;position is -1, then the newly created column is inserted at
     * <br>the end.  The column is initialized with the attributes given. If &#64;tree_view
     * <br>has “fixed_height” mode enabled, then the new column will have its sizing
     * <br>property set to be GTK_TREE_VIEW_COLUMN_FIXED.
     * @param position The position to insert the new column in
     * @param title The title to set the header to
     * @param cell The `GtkCellRenderer`
     * @param _elipse A %NULL-terminated list of attributes
     * @return The number of columns in &#64;tree_view after insertion.
    */
    public int insertColumnWithAttributes(int position, @Nonnull ch.bailu.gtk.type.Str title, @Nonnull CellRenderer cell, java.lang.Object... _elipse)  {
        return JnaTreeView.INST().gtk_tree_view_insert_column_with_attributes(asCPointer(), position, asCPointerNotNull(title), asCPointerNotNull(cell), _elipse);
    }

    /**
     * Creates a new `GtkTreeViewColumn` and inserts it into the &#64;tree_view at
     * <br>&#64;position.  If &#64;position is -1, then the newly created column is inserted at
     * <br>the end.  The column is initialized with the attributes given. If &#64;tree_view
     * <br>has “fixed_height” mode enabled, then the new column will have its sizing
     * <br>property set to be GTK_TREE_VIEW_COLUMN_FIXED.
     * @param position The position to insert the new column in
     * @param title The title to set the header to
     * @param cell The `GtkCellRenderer`
     * @param _elipse A %NULL-terminated list of attributes
     * @return The number of columns in &#64;tree_view after insertion.
    */
    public int insertColumnWithAttributes(int position, String title, @Nonnull CellRenderer cell, java.lang.Object... _elipse)  {
        return JnaTreeView.INST().gtk_tree_view_insert_column_with_attributes(asCPointer(), position, title, asCPointerNotNull(cell), _elipse);
    }

    /**
     * Convenience function that inserts a new column into the `GtkTreeView`
     * <br>with the given cell renderer and a `GtkTreeCellDataFunc` to set cell renderer
     * <br>attributes (normally using data from the model). See also
     * <br>gtk_tree_view_column_set_cell_data_func(), gtk_tree_view_column_pack_start().
     * <br>If &#64;tree_view has “fixed_height” mode enabled, then the new column will have its
     * <br>“sizing” property set to be GTK_TREE_VIEW_COLUMN_FIXED.
     * @param position Position to insert, -1 for append
     * @param title column title
     * @param cell cell renderer for column
     * @param func function to set attributes of cell renderer
     * @param data data for &#64;func
     * @param dnotify destroy notifier for &#64;data
     * @return number of columns in the tree view post-insert
    */
    public int insertColumnWithDataFunc(int position, @Nonnull ch.bailu.gtk.type.Str title, @Nonnull CellRenderer cell, OnTreeCellDataFunc func, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify dnotify)  {
        return JnaTreeView.INST().gtk_tree_view_insert_column_with_data_func(asCPointer(), position, asCPointerNotNull(title), asCPointerNotNull(cell), toOnTreeCellDataFunc(this, "insertColumnWithDataFunc", func), asCPointer(data), toOnDestroyNotify(this, "insertColumnWithDataFunc", dnotify));
    }

    /**
     * Convenience function that inserts a new column into the `GtkTreeView`
     * <br>with the given cell renderer and a `GtkTreeCellDataFunc` to set cell renderer
     * <br>attributes (normally using data from the model). See also
     * <br>gtk_tree_view_column_set_cell_data_func(), gtk_tree_view_column_pack_start().
     * <br>If &#64;tree_view has “fixed_height” mode enabled, then the new column will have its
     * <br>“sizing” property set to be GTK_TREE_VIEW_COLUMN_FIXED.
     * @param position Position to insert, -1 for append
     * @param title column title
     * @param cell cell renderer for column
     * @param func function to set attributes of cell renderer
     * @param data data for &#64;func
     * @param dnotify destroy notifier for &#64;data
     * @return number of columns in the tree view post-insert
    */
    public int insertColumnWithDataFunc(int position, String title, @Nonnull CellRenderer cell, OnTreeCellDataFunc func, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify dnotify)  {
        return JnaTreeView.INST().gtk_tree_view_insert_column_with_data_func(asCPointer(), position, title, asCPointerNotNull(cell), toOnTreeCellDataFunc(this, "insertColumnWithDataFunc", func), asCPointer(data), toOnDestroyNotify(this, "insertColumnWithDataFunc", dnotify));
    }

    /**
     * Returns whether a rubber banding operation is currently being done
     * <br>in &#64;tree_view.
     * @return %TRUE if a rubber banding operation is currently being done in &#64;tree_view.
    */
    public boolean isRubberBandingActive()  {
        return JnaTreeView.INST().gtk_tree_view_is_rubber_banding_active(asCPointer());
    }

    /**
     * Calls &#64;func on all expanded rows.
     * @param func A function to be called
     * @param data User data to be passed to the function.
    */
    public void mapExpandedRows(OnTreeViewMappingFunc func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaTreeView.INST().gtk_tree_view_map_expanded_rows(asCPointer(), toOnTreeViewMappingFunc(this, "mapExpandedRows", func), asCPointer(data));
    }

    /**
     * Moves &#64;column to be after to &#64;base_column.  If &#64;base_column is %NULL, then
     * <br>&#64;column is placed in the first position.
     * @param column The `GtkTreeViewColumn` to be moved.
     * @param base_column The `GtkTreeViewColumn` to be moved relative to
    */
    public void moveColumnAfter(@Nonnull TreeViewColumn column, @Nullable TreeViewColumn base_column)  {
        JnaTreeView.INST().gtk_tree_view_move_column_after(asCPointer(), asCPointerNotNull(column), asCPointer(base_column));
    }

    /**
     * Removes &#64;column from &#64;tree_view.
     * @param column The `GtkTreeViewColumn` to remove.
     * @return The number of columns in &#64;tree_view after removing.
    */
    public int removeColumn(@Nonnull TreeViewColumn column)  {
        return JnaTreeView.INST().gtk_tree_view_remove_column(asCPointer(), asCPointerNotNull(column));
    }

    /**
     * Activates the cell determined by &#64;path and &#64;column.
     * @param path The `GtkTreePath` to be activated.
     * @param column The `GtkTreeViewColumn` to be activated.
    */
    public void rowActivated(@Nonnull TreePath path, @Nullable TreeViewColumn column)  {
        JnaTreeView.INST().gtk_tree_view_row_activated(asCPointer(), asCPointerNotNull(path), asCPointer(column));
    }

    /**
     * Returns %TRUE if the node pointed to by &#64;path is expanded in &#64;tree_view.
     * @param path A `GtkTreePath` to test expansion state.
     * @return %TRUE if &#35;path is expanded.
    */
    public boolean rowExpanded(@Nonnull TreePath path)  {
        return JnaTreeView.INST().gtk_tree_view_row_expanded(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Moves the alignments of &#64;tree_view to the position specified by &#64;column and
     * <br>&#64;path.  If &#64;column is %NULL, then no horizontal scrolling occurs.  Likewise,
     * <br>if &#64;path is %NULL no vertical scrolling occurs.  At a minimum, one of &#64;column
     * <br>or &#64;path need to be non-%NULL.  &#64;row_align determines where the row is
     * <br>placed, and &#64;col_align determines where &#64;column is placed.  Both are expected
     * <br>to be between 0.0 and 1.0. 0.0 means left/top alignment, 1.0 means
     * <br>right/bottom alignment, 0.5 means center.
     * <br>
     * <br>If &#64;use_align is %FALSE, then the alignment arguments are ignored, and the
     * <br>tree does the minimum amount of work to scroll the cell onto the screen.
     * <br>This means that the cell will be scrolled to the edge closest to its current
     * <br>position.  If the cell is currently visible on the screen, nothing is done.
     * <br>
     * <br>This function only works if the model is set, and &#64;path is a valid row on the
     * <br>model.  If the model changes before the &#64;tree_view is realized, the centered
     * <br>path will be modified to reflect this change.
     * @param path The path of the row to move to
     * @param column The `GtkTreeViewColumn` to move horizontally to
     * @param use_align whether to use alignment arguments, or %FALSE.
     * @param row_align The vertical alignment of the row specified by &#64;path.
     * @param col_align The horizontal alignment of the column specified by &#64;column.
    */
    public void scrollToCell(@Nullable TreePath path, @Nullable TreeViewColumn column, boolean use_align, float row_align, float col_align)  {
        JnaTreeView.INST().gtk_tree_view_scroll_to_cell(asCPointer(), asCPointer(path), asCPointer(column), use_align, row_align, col_align);
    }

    /**
     * Scrolls the tree view such that the top-left corner of the visible
     * <br>area is &#64;tree_x, &#64;tree_y, where &#64;tree_x and &#64;tree_y are specified
     * <br>in tree coordinates.  The &#64;tree_view must be realized before
     * <br>this function is called.  If it isn't, you probably want to be
     * <br>using gtk_tree_view_scroll_to_cell().
     * <br>
     * <br>If either &#64;tree_x or &#64;tree_y are -1, then that direction isn’t scrolled.
     * @param tree_x X coordinate of new top-left pixel of visible area, or -1
     * @param tree_y Y coordinate of new top-left pixel of visible area, or -1
    */
    public void scrollToPoint(int tree_x, int tree_y)  {
        JnaTreeView.INST().gtk_tree_view_scroll_to_point(asCPointer(), tree_x, tree_y);
    }

    /**
     * Cause the `GtkTreeView`::row-activated signal to be emitted
     * <br>on a single click instead of a double click.
     * @param single %TRUE to emit row-activated on a single click
    */
    public void setActivateOnSingleClick(boolean single)  {
        JnaTreeView.INST().gtk_tree_view_set_activate_on_single_click(asCPointer(), single);
    }

    /**
     * Sets a user function for determining where a column may be dropped when
     * <br>dragged.  This function is called on every column pair in turn at the
     * <br>beginning of a column drag to determine where a drop can take place.  The
     * <br>arguments passed to &#64;func are: the &#64;tree_view, the `GtkTreeViewColumn` being
     * <br>dragged, the two `GtkTreeViewColumn`s determining the drop spot, and
     * <br>&#64;user_data.  If either of the `GtkTreeViewColumn` arguments for the drop spot
     * <br>are %NULL, then they indicate an edge.  If &#64;func is set to be %NULL, then
     * <br>&#64;tree_view reverts to the default behavior of allowing all columns to be
     * <br>dropped everywhere.
     * @param func A function to determine which columns are reorderable
     * @param user_data User data to be passed to &#64;func
     * @param destroy Destroy notifier for &#64;user_data
    */
    public void setColumnDragFunction(OnTreeViewColumnDropFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy)  {
        JnaTreeView.INST().gtk_tree_view_set_column_drag_function(asCPointer(), toOnTreeViewColumnDropFunc(this, "setColumnDragFunction", func), asCPointer(user_data), toOnDestroyNotify(this, "setColumnDragFunction", destroy));
    }

    /**
     * Sets the current keyboard focus to be at &#64;path, and selects it.  This is
     * <br>useful when you want to focus the user’s attention on a particular row.  If
     * <br>&#64;focus_column is not %NULL, then focus is given to the column specified by
     * <br>it. Additionally, if &#64;focus_column is specified, and &#64;start_editing is
     * <br>%TRUE, then editing should be started in the specified cell.
     * <br>This function is often followed by &#64;gtk_widget_grab_focus (&#64;tree_view)
     * <br>in order to give keyboard focus to the widget.  Please note that editing
     * <br>can only happen when the widget is realized.
     * <br>
     * <br>If &#64;path is invalid for &#64;model, the current cursor (if any) will be unset
     * <br>and the function will return without failing.
     * @param path A `GtkTreePath`
     * @param focus_column A `GtkTreeViewColumn`
     * @param start_editing %TRUE if the specified cell should start being edited.
    */
    public void setCursor(@Nonnull TreePath path, @Nullable TreeViewColumn focus_column, boolean start_editing)  {
        JnaTreeView.INST().gtk_tree_view_set_cursor(asCPointer(), asCPointerNotNull(path), asCPointer(focus_column), start_editing);
    }

    /**
     * Sets the current keyboard focus to be at &#64;path, and selects it.  This is
     * <br>useful when you want to focus the user’s attention on a particular row.  If
     * <br>&#64;focus_column is not %NULL, then focus is given to the column specified by
     * <br>it. If &#64;focus_column and &#64;focus_cell are not %NULL, and &#64;focus_column
     * <br>contains 2 or more editable or activatable cells, then focus is given to
     * <br>the cell specified by &#64;focus_cell. Additionally, if &#64;focus_column is
     * <br>specified, and &#64;start_editing is %TRUE, then editing should be started in
     * <br>the specified cell.  This function is often followed by
     * <br>&#64;gtk_widget_grab_focus (&#64;tree_view) in order to give keyboard focus to the
     * <br>widget.  Please note that editing can only happen when the widget is
     * <br>realized.
     * <br>
     * <br>If &#64;path is invalid for &#64;model, the current cursor (if any) will be unset
     * <br>and the function will return without failing.
     * @param path A `GtkTreePath`
     * @param focus_column A `GtkTreeViewColumn`
     * @param focus_cell A `GtkCellRenderer`
     * @param start_editing %TRUE if the specified cell should start being edited.
    */
    public void setCursorOnCell(@Nonnull TreePath path, @Nullable TreeViewColumn focus_column, @Nullable CellRenderer focus_cell, boolean start_editing)  {
        JnaTreeView.INST().gtk_tree_view_set_cursor_on_cell(asCPointer(), asCPointerNotNull(path), asCPointer(focus_column), asCPointer(focus_cell), start_editing);
    }

    /**
     * Sets the row that is highlighted for feedback.
     * <br>If &#64;path is %NULL, an existing highlight is removed.
     * @param path The path of the row to highlight
     * @param pos Specifies whether to drop before, after or into the row
    */
    public void setDragDestRow(@Nullable TreePath path, int pos)  {
        JnaTreeView.INST().gtk_tree_view_set_drag_dest_row(asCPointer(), asCPointer(path), pos);
    }

    /**
     * If &#64;enable_search is set, then the user can type in text to search through
     * <br>the tree interactively (this is sometimes called &quot;typeahead find&quot;).
     * <br>
     * <br>Note that even if this is %FALSE, the user can still initiate a search
     * <br>using the “start-interactive-search” key binding.
     * @param enable_search %TRUE, if the user can search interactively
    */
    public void setEnableSearch(boolean enable_search)  {
        JnaTreeView.INST().gtk_tree_view_set_enable_search(asCPointer(), enable_search);
    }

    /**
     * Sets whether to draw lines interconnecting the expanders in &#64;tree_view.
     * <br>This does not have any visible effects for lists.
     * @param enabled %TRUE to enable tree line drawing, %FALSE otherwise.
    */
    public void setEnableTreeLines(boolean enabled)  {
        JnaTreeView.INST().gtk_tree_view_set_enable_tree_lines(asCPointer(), enabled);
    }

    /**
     * Sets the column to draw the expander arrow at. It must be in &#64;tree_view.
     * <br>If &#64;column is %NULL, then the expander arrow is always at the first
     * <br>visible column.
     * <br>
     * <br>If you do not want expander arrow to appear in your tree, set the
     * <br>expander column to a hidden column.
     * @param column %NULL, or the column to draw the expander arrow at.
    */
    public void setExpanderColumn(@Nullable TreeViewColumn column)  {
        JnaTreeView.INST().gtk_tree_view_set_expander_column(asCPointer(), asCPointer(column));
    }

    /**
     * Enables or disables the fixed height mode of &#64;tree_view.
     * <br>Fixed height mode speeds up `GtkTreeView` by assuming that all
     * <br>rows have the same height.
     * <br>Only enable this option if all rows are the same height and all
     * <br>columns are of type %GTK_TREE_VIEW_COLUMN_FIXED.
     * @param enable %TRUE to enable fixed height mode
    */
    public void setFixedHeightMode(boolean enable)  {
        JnaTreeView.INST().gtk_tree_view_set_fixed_height_mode(asCPointer(), enable);
    }

    /**
     * Sets which grid lines to draw in &#64;tree_view.
     * @param grid_lines a `GtkTreeView`GridLines value indicating which grid lines to enable.
    */
    public void setGridLines(int grid_lines)  {
        JnaTreeView.INST().gtk_tree_view_set_grid_lines(asCPointer(), grid_lines);
    }

    /**
     * Allow the column title buttons to be clicked.
     * @param setting %TRUE if the columns are clickable.
    */
    public void setHeadersClickable(boolean setting)  {
        JnaTreeView.INST().gtk_tree_view_set_headers_clickable(asCPointer(), setting);
    }

    /**
     * Sets the visibility state of the headers.
     * @param headers_visible %TRUE if the headers are visible
    */
    public void setHeadersVisible(boolean headers_visible)  {
        JnaTreeView.INST().gtk_tree_view_set_headers_visible(asCPointer(), headers_visible);
    }

    /**
     * Enables or disables the hover expansion mode of &#64;tree_view.
     * <br>Hover expansion makes rows expand or collapse if the pointer
     * <br>moves over them.
     * @param expand %TRUE to enable hover selection mode
    */
    public void setHoverExpand(boolean expand)  {
        JnaTreeView.INST().gtk_tree_view_set_hover_expand(asCPointer(), expand);
    }

    /**
     * Enables or disables the hover selection mode of &#64;tree_view.
     * <br>Hover selection makes the selected row follow the pointer.
     * <br>Currently, this works only for the selection modes
     * <br>%GTK_SELECTION_SINGLE and %GTK_SELECTION_BROWSE.
     * @param hover %TRUE to enable hover selection mode
    */
    public void setHoverSelection(boolean hover)  {
        JnaTreeView.INST().gtk_tree_view_set_hover_selection(asCPointer(), hover);
    }

    /**
     * Sets the amount of extra indentation for child levels to use in &#64;tree_view
     * <br>in addition to the default indentation.  The value should be specified in
     * <br>pixels, a value of 0 disables this feature and in this case only the default
     * <br>indentation will be used.
     * <br>This does not have any visible effects for lists.
     * @param indentation the amount, in pixels, of extra indentation in &#64;tree_view.
    */
    public void setLevelIndentation(int indentation)  {
        JnaTreeView.INST().gtk_tree_view_set_level_indentation(asCPointer(), indentation);
    }

    /**
     * Sets the model for a `GtkTreeView`.  If the &#64;tree_view already has a model
     * <br>set, it will remove it before setting the new model.  If &#64;model is %NULL,
     * <br>then it will unset the old model.
     * @param model The model.
    */
    public void setModel(@Nullable TreeModel model)  {
        JnaTreeView.INST().gtk_tree_view_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * This function is a convenience function to allow you to reorder
     * <br>models that support the `GtkTreeDragSourceIface` and the
     * <br>`GtkTreeDragDestIface`.  Both `GtkTreeStore` and `GtkListStore` support
     * <br>these.  If &#64;reorderable is %TRUE, then the user can reorder the
     * <br>model by dragging and dropping rows. The developer can listen to
     * <br>these changes by connecting to the model’s `GtkTreeModel::row-inserted`
     * <br>and `GtkTreeModel::row-deleted` signals. The reordering is implemented
     * <br>by setting up the tree view as a drag source and destination.
     * <br>Therefore, drag and drop can not be used in a reorderable view for any
     * <br>other purpose.
     * <br>
     * <br>This function does not give you any degree of control over the order -- any
     * <br>reordering is allowed.  If more control is needed, you should probably
     * <br>handle drag and drop manually.
     * @param reorderable %TRUE, if the tree can be reordered.
    */
    public void setReorderable(boolean reorderable)  {
        JnaTreeView.INST().gtk_tree_view_set_reorderable(asCPointer(), reorderable);
    }

    /**
     * Sets the row separator function, which is used to determine
     * <br>whether a row should be drawn as a separator. If the row separator
     * <br>function is %NULL, no separators are drawn. This is the default value.
     * @param func a `GtkTreeView`RowSeparatorFunc
     * @param data user data to pass to &#64;func
     * @param destroy destroy notifier for &#64;data
    */
    public void setRowSeparatorFunc(OnTreeViewRowSeparatorFunc func, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy)  {
        JnaTreeView.INST().gtk_tree_view_set_row_separator_func(asCPointer(), toOnTreeViewRowSeparatorFunc(this, "setRowSeparatorFunc", func), asCPointer(data), toOnDestroyNotify(this, "setRowSeparatorFunc", destroy));
    }

    /**
     * Enables or disables rubber banding in &#64;tree_view.  If the selection mode
     * <br>is %GTK_SELECTION_MULTIPLE, rubber banding will allow the user to select
     * <br>multiple rows by dragging the mouse.
     * @param enable %TRUE to enable rubber banding
    */
    public void setRubberBanding(boolean enable)  {
        JnaTreeView.INST().gtk_tree_view_set_rubber_banding(asCPointer(), enable);
    }

    /**
     * Sets &#64;column as the column where the interactive search code should
     * <br>search in for the current model.
     * <br>
     * <br>If the search column is set, users can use the “start-interactive-search”
     * <br>key binding to bring up search popup. The enable-search property controls
     * <br>whether simply typing text will also start an interactive search.
     * <br>
     * <br>Note that &#64;column refers to a column of the current model. The search
     * <br>column is reset to -1 when the model is changed.
     * @param column the column of the model to search in, or -1 to disable searching
    */
    public void setSearchColumn(int column)  {
        JnaTreeView.INST().gtk_tree_view_set_search_column(asCPointer(), column);
    }

    /**
     * Sets the entry which the interactive search code will use for this
     * <br>&#64;tree_view.  This is useful when you want to provide a search entry
     * <br>in our interface at all time at a fixed position.  Passing %NULL for
     * <br>&#64;entry will make the interactive search code use the built-in popup
     * <br>entry again.
     * @param entry the entry the interactive search code of &#64;tree_view should use
    */
    public void setSearchEntry(@Nullable Editable entry)  {
        JnaTreeView.INST().gtk_tree_view_set_search_entry(asCPointer(), asCPointer(entry));
    }

    /**
     * Sets the compare function for the interactive search capabilities; note
     * <br>that somewhat like strcmp() returning 0 for equality
     * <br>`GtkTreeView`SearchEqualFunc returns %FALSE on matches.
     * @param search_equal_func the compare function to use during the search
     * @param search_user_data user data to pass to &#64;search_equal_func
     * @param search_destroy Destroy notifier for &#64;search_user_data
    */
    public void setSearchEqualFunc(OnTreeViewSearchEqualFunc search_equal_func, @Nullable ch.bailu.gtk.type.Pointer search_user_data, OnDestroyNotify search_destroy)  {
        JnaTreeView.INST().gtk_tree_view_set_search_equal_func(asCPointer(), toOnTreeViewSearchEqualFunc(this, "setSearchEqualFunc", search_equal_func), asCPointer(search_user_data), toOnDestroyNotify(this, "setSearchEqualFunc", search_destroy));
    }

    /**
     * Sets whether to draw and enable expanders and indent child rows in
     * <br>&#64;tree_view.  When disabled there will be no expanders visible in trees
     * <br>and there will be no way to expand and collapse rows by default.  Also
     * <br>note that hiding the expanders will disable the default indentation.  You
     * <br>can set a custom indentation in this case using
     * <br>gtk_tree_view_set_level_indentation().
     * <br>This does not have any visible effects for lists.
     * @param enabled %TRUE to enable expander drawing, %FALSE otherwise.
    */
    public void setShowExpanders(boolean enabled)  {
        JnaTreeView.INST().gtk_tree_view_set_show_expanders(asCPointer(), enabled);
    }

    /**
     * Sets the tip area of &#64;tooltip to the area &#64;path, &#64;column and &#64;cell have
     * <br>in common.  For example if &#64;path is %NULL and &#64;column is set, the tip
     * <br>area will be set to the full area covered by &#64;column.  See also
     * <br>gtk_tooltip_set_tip_area().
     * <br>
     * <br>Note that if &#64;path is not specified and &#64;cell is set and part of a column
     * <br>containing the expander, the tooltip might not show and hide at the correct
     * <br>position.  In such cases &#64;path must be set to the current node under the
     * <br>mouse cursor for this function to operate correctly.
     * <br>
     * <br>See also gtk_tree_view_set_tooltip_column() for a simpler alternative.
     * @param tooltip a `GtkTooltip`
     * @param path a `GtkTreePath`
     * @param column a `GtkTreeViewColumn`
     * @param cell a `GtkCellRenderer`
    */
    public void setTooltipCell(@Nonnull Tooltip tooltip, @Nullable TreePath path, @Nullable TreeViewColumn column, @Nullable CellRenderer cell)  {
        JnaTreeView.INST().gtk_tree_view_set_tooltip_cell(asCPointer(), asCPointerNotNull(tooltip), asCPointer(path), asCPointer(column), asCPointer(cell));
    }

    /**
     * If you only plan to have simple (text-only) tooltips on full rows, you
     * <br>can use this function to have `GtkTreeView` handle these automatically
     * <br>for you. &#64;column should be set to the column in &#64;tree_view’s model
     * <br>containing the tooltip texts, or -1 to disable this feature.
     * <br>
     * <br>When enabled, `GtkWidget:has-tooltip` will be set to %TRUE and
     * <br>&#64;tree_view will connect a `GtkWidget::query-tooltip` signal handler.
     * <br>
     * <br>Note that the signal handler sets the text with gtk_tooltip_set_markup(),
     * <br>so &amp;, &lt;, etc have to be escaped in the text.
     * @param column an integer, which is a valid column number for &#64;tree_view’s model
    */
    public void setTooltipColumn(int column)  {
        JnaTreeView.INST().gtk_tree_view_set_tooltip_column(asCPointer(), column);
    }

    /**
     * Sets the tip area of &#64;tooltip to be the area covered by the row at &#64;path.
     * <br>See also gtk_tree_view_set_tooltip_column() for a simpler alternative.
     * <br>See also gtk_tooltip_set_tip_area().
     * @param tooltip a `GtkTooltip`
     * @param path a `GtkTreePath`
    */
    public void setTooltipRow(@Nonnull Tooltip tooltip, @Nonnull TreePath path)  {
        JnaTreeView.INST().gtk_tree_view_set_tooltip_row(asCPointer(), asCPointerNotNull(tooltip), asCPointerNotNull(path));
    }

    /**
     * Undoes the effect of
     * <br>gtk_tree_view_enable_model_drag_dest(). Calling this method sets
     * <br>`GtkTreeView`:reorderable to %FALSE.
    */
    public void unsetRowsDragDest()  {
        JnaTreeView.INST().gtk_tree_view_unset_rows_drag_dest(asCPointer());
    }

    /**
     * Undoes the effect of
     * <br>gtk_tree_view_enable_model_drag_source(). Calling this method sets
     * <br>`GtkTreeView`:reorderable to %FALSE.
    */
    public void unsetRowsDragSource()  {
        JnaTreeView.INST().gtk_tree_view_unset_rows_drag_source(asCPointer());
    }

    public final static String SIGNAL_ON_COLUMNS_CHANGED = "columns-changed";
    
    /**
     * Connect to signal "columns-changed".
     * <br>See {@link OnColumnsChanged#onColumnsChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_COLUMNS_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onColumnsChanged(OnColumnsChanged signal) {
        return connectSignal(SIGNAL_ON_COLUMNS_CHANGED, toOnColumnsChanged(signal));
    }

    public final static String SIGNAL_ON_CURSOR_CHANGED = "cursor-changed";
    
    /**
     * Connect to signal "cursor-changed".
     * <br>See {@link OnCursorChanged#onCursorChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CURSOR_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCursorChanged(OnCursorChanged signal) {
        return connectSignal(SIGNAL_ON_CURSOR_CHANGED, toOnCursorChanged(signal));
    }

    public final static String SIGNAL_ON_EXPAND_COLLAPSE_CURSOR_ROW = "expand-collapse-cursor-row";
    
    /**
     * Connect to signal "expand-collapse-cursor-row".
     * <br>See {@link OnExpandCollapseCursorRow#onExpandCollapseCursorRow} for signal description.
     * <br>Field {@link #SIGNAL_ON_EXPAND_COLLAPSE_CURSOR_ROW} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onExpandCollapseCursorRow(OnExpandCollapseCursorRow signal) {
        return connectSignal(SIGNAL_ON_EXPAND_COLLAPSE_CURSOR_ROW, toOnExpandCollapseCursorRow(signal));
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

    public final static String SIGNAL_ON_ROW_COLLAPSED = "row-collapsed";
    
    /**
     * Connect to signal "row-collapsed".
     * <br>See {@link OnRowCollapsed#onRowCollapsed} for signal description.
     * <br>Field {@link #SIGNAL_ON_ROW_COLLAPSED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRowCollapsed(OnRowCollapsed signal) {
        return connectSignal(SIGNAL_ON_ROW_COLLAPSED, toOnRowCollapsed(signal));
    }

    public final static String SIGNAL_ON_ROW_EXPANDED = "row-expanded";
    
    /**
     * Connect to signal "row-expanded".
     * <br>See {@link OnRowExpanded#onRowExpanded} for signal description.
     * <br>Field {@link #SIGNAL_ON_ROW_EXPANDED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRowExpanded(OnRowExpanded signal) {
        return connectSignal(SIGNAL_ON_ROW_EXPANDED, toOnRowExpanded(signal));
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

    public final static String SIGNAL_ON_SELECT_CURSOR_PARENT = "select-cursor-parent";
    
    /**
     * Connect to signal "select-cursor-parent".
     * <br>See {@link OnSelectCursorParent#onSelectCursorParent} for signal description.
     * <br>Field {@link #SIGNAL_ON_SELECT_CURSOR_PARENT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSelectCursorParent(OnSelectCursorParent signal) {
        return connectSignal(SIGNAL_ON_SELECT_CURSOR_PARENT, toOnSelectCursorParent(signal));
    }

    public final static String SIGNAL_ON_SELECT_CURSOR_ROW = "select-cursor-row";
    
    /**
     * Connect to signal "select-cursor-row".
     * <br>See {@link OnSelectCursorRow#onSelectCursorRow} for signal description.
     * <br>Field {@link #SIGNAL_ON_SELECT_CURSOR_ROW} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSelectCursorRow(OnSelectCursorRow signal) {
        return connectSignal(SIGNAL_ON_SELECT_CURSOR_ROW, toOnSelectCursorRow(signal));
    }

    public final static String SIGNAL_ON_START_INTERACTIVE_SEARCH = "start-interactive-search";
    
    /**
     * Connect to signal "start-interactive-search".
     * <br>See {@link OnStartInteractiveSearch#onStartInteractiveSearch} for signal description.
     * <br>Field {@link #SIGNAL_ON_START_INTERACTIVE_SEARCH} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onStartInteractiveSearch(OnStartInteractiveSearch signal) {
        return connectSignal(SIGNAL_ON_START_INTERACTIVE_SEARCH, toOnStartInteractiveSearch(signal));
    }

    public final static String SIGNAL_ON_TEST_COLLAPSE_ROW = "test-collapse-row";
    
    /**
     * Connect to signal "test-collapse-row".
     * <br>See {@link OnTestCollapseRow#onTestCollapseRow} for signal description.
     * <br>Field {@link #SIGNAL_ON_TEST_COLLAPSE_ROW} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onTestCollapseRow(OnTestCollapseRow signal) {
        return connectSignal(SIGNAL_ON_TEST_COLLAPSE_ROW, toOnTestCollapseRow(signal));
    }

    public final static String SIGNAL_ON_TEST_EXPAND_ROW = "test-expand-row";
    
    /**
     * Connect to signal "test-expand-row".
     * <br>See {@link OnTestExpandRow#onTestExpandRow} for signal description.
     * <br>Field {@link #SIGNAL_ON_TEST_EXPAND_ROW} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onTestExpandRow(OnTestExpandRow signal) {
        return connectSignal(SIGNAL_ON_TEST_EXPAND_ROW, toOnTestExpandRow(signal));
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

    /**
     * Implements interface {@link Scrollable}. Call this to get access to interface functions.
     * @return {@link Scrollable}
    */
    public Scrollable asScrollable() {
        return new Scrollable(cast());
    }

    public static long getTypeID() { 
        return JnaTreeView.INST().gtk_tree_view_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getCursor:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreePath**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreeViewColumn**}}:{j:}]

[MethodModel:java-type-not-supported:getDestRowAtPos:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreePath**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:java-type-not-supported:getDragDestRow:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreePath**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:getPathAtPos:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreePath**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreeViewColumn**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]

[MethodModel:cb-returns-callback:getRowSeparatorFunc:[ParameterModel:Supported:[MethodModel:Supported:TreeViewRowSeparatorFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:TreeModel:{c:GtkTreeModel*}}:{j:long}]
        [ParameterModel:Supported:{Gg:TreeIter:{c:GtkTreeIter*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]]

[MethodModel:cb-returns-callback:getSearchEqualFunc:[ParameterModel:Supported:[MethodModel:Supported:TreeViewSearchEqualFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:TreeModel:{c:GtkTreeModel*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gg:TreeIter:{c:GtkTreeIter*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]]

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

[MethodModel:java-type-not-supported:java-type-not-supported:isBlankAtPos:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreePath**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreeViewColumn**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
*/
