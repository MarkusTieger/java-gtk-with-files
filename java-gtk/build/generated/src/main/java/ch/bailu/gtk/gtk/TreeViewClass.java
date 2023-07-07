/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.TreeViewClass.html">https://docs.gtk.org/gtk4/struct.TreeViewClass.html</a></p>
*/
public class TreeViewClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeViewClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnRowActivated {
        /**
         * 
         * @param tree_view A `GtkTreeView`
         * @param path The `GtkTreePath` to be activated.
         * @param column The `GtkTreeViewColumn` to be activated.
        */
        void onRowActivated(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view, @Nonnull TreePath path, @Nullable TreeViewColumn column);
    }
    
    private static JnaTreeViewClass.OnRowActivated toOnRowActivated(ch.bailu.gtk.type.Pointer instance, String methodName, OnRowActivated in) {
        JnaTreeViewClass.OnRowActivated out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view, _path, _column) -> in.onRowActivated(__callback, new TreeView(new PointerContainer(_tree_view)), new TreePath(new PointerContainer(_path)), new TreeViewColumn(new PointerContainer(_column)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTestExpandRow {
        /**
         * 
         * @param tree_view 
         * @param iter 
         * @param path 
         * @return 
        */
        boolean onTestExpandRow(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view, @Nonnull TreeIter iter, @Nonnull TreePath path);
    }
    
    private static JnaTreeViewClass.OnTestExpandRow toOnTestExpandRow(ch.bailu.gtk.type.Pointer instance, String methodName, OnTestExpandRow in) {
        JnaTreeViewClass.OnTestExpandRow out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view, _iter, _path) -> in.onTestExpandRow(__callback, new TreeView(new PointerContainer(_tree_view)), new TreeIter(new PointerContainer(_iter)), new TreePath(new PointerContainer(_path)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTestCollapseRow {
        /**
         * 
         * @param tree_view 
         * @param iter 
         * @param path 
         * @return 
        */
        boolean onTestCollapseRow(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view, @Nonnull TreeIter iter, @Nonnull TreePath path);
    }
    
    private static JnaTreeViewClass.OnTestCollapseRow toOnTestCollapseRow(ch.bailu.gtk.type.Pointer instance, String methodName, OnTestCollapseRow in) {
        JnaTreeViewClass.OnTestCollapseRow out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view, _iter, _path) -> in.onTestCollapseRow(__callback, new TreeView(new PointerContainer(_tree_view)), new TreeIter(new PointerContainer(_iter)), new TreePath(new PointerContainer(_path)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRowExpanded {
        /**
         * 
         * @param tree_view 
         * @param iter 
         * @param path 
        */
        void onRowExpanded(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view, @Nonnull TreeIter iter, @Nonnull TreePath path);
    }
    
    private static JnaTreeViewClass.OnRowExpanded toOnRowExpanded(ch.bailu.gtk.type.Pointer instance, String methodName, OnRowExpanded in) {
        JnaTreeViewClass.OnRowExpanded out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view, _iter, _path) -> in.onRowExpanded(__callback, new TreeView(new PointerContainer(_tree_view)), new TreeIter(new PointerContainer(_iter)), new TreePath(new PointerContainer(_path)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRowCollapsed {
        /**
         * 
         * @param tree_view 
         * @param iter 
         * @param path 
        */
        void onRowCollapsed(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view, @Nonnull TreeIter iter, @Nonnull TreePath path);
    }
    
    private static JnaTreeViewClass.OnRowCollapsed toOnRowCollapsed(ch.bailu.gtk.type.Pointer instance, String methodName, OnRowCollapsed in) {
        JnaTreeViewClass.OnRowCollapsed out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view, _iter, _path) -> in.onRowCollapsed(__callback, new TreeView(new PointerContainer(_tree_view)), new TreeIter(new PointerContainer(_iter)), new TreePath(new PointerContainer(_path)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnColumnsChanged {
        /**
         * 
         * @param tree_view 
        */
        void onColumnsChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view);
    }
    
    private static JnaTreeViewClass.OnColumnsChanged toOnColumnsChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnColumnsChanged in) {
        JnaTreeViewClass.OnColumnsChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view) -> in.onColumnsChanged(__callback, new TreeView(new PointerContainer(_tree_view)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCursorChanged {
        /**
         * 
         * @param tree_view 
        */
        void onCursorChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view);
    }
    
    private static JnaTreeViewClass.OnCursorChanged toOnCursorChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnCursorChanged in) {
        JnaTreeViewClass.OnCursorChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view) -> in.onCursorChanged(__callback, new TreeView(new PointerContainer(_tree_view)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMoveCursor {
        /**
         * 
         * @param tree_view 
         * @param step 
         * @param count 
         * @param extend 
         * @param modify 
         * @return 
        */
        boolean onMoveCursor(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view, int step, int count, boolean extend, boolean modify);
    }
    
    private static JnaTreeViewClass.OnMoveCursor toOnMoveCursor(ch.bailu.gtk.type.Pointer instance, String methodName, OnMoveCursor in) {
        JnaTreeViewClass.OnMoveCursor out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view, _step, _count, _extend, _modify) -> in.onMoveCursor(__callback, new TreeView(new PointerContainer(_tree_view)), _step, _count, _extend, _modify);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSelectAll {
        /**
         * 
         * @param tree_view 
         * @return 
        */
        boolean onSelectAll(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view);
    }
    
    private static JnaTreeViewClass.OnSelectAll toOnSelectAll(ch.bailu.gtk.type.Pointer instance, String methodName, OnSelectAll in) {
        JnaTreeViewClass.OnSelectAll out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view) -> in.onSelectAll(__callback, new TreeView(new PointerContainer(_tree_view)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnselectAll {
        /**
         * 
         * @param tree_view 
         * @return 
        */
        boolean onUnselectAll(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view);
    }
    
    private static JnaTreeViewClass.OnUnselectAll toOnUnselectAll(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnselectAll in) {
        JnaTreeViewClass.OnUnselectAll out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view) -> in.onUnselectAll(__callback, new TreeView(new PointerContainer(_tree_view)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSelectCursorRow {
        /**
         * 
         * @param tree_view 
         * @param start_editing 
         * @return 
        */
        boolean onSelectCursorRow(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view, boolean start_editing);
    }
    
    private static JnaTreeViewClass.OnSelectCursorRow toOnSelectCursorRow(ch.bailu.gtk.type.Pointer instance, String methodName, OnSelectCursorRow in) {
        JnaTreeViewClass.OnSelectCursorRow out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view, _start_editing) -> in.onSelectCursorRow(__callback, new TreeView(new PointerContainer(_tree_view)), _start_editing);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnToggleCursorRow {
        /**
         * 
         * @param tree_view 
         * @return 
        */
        boolean onToggleCursorRow(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view);
    }
    
    private static JnaTreeViewClass.OnToggleCursorRow toOnToggleCursorRow(ch.bailu.gtk.type.Pointer instance, String methodName, OnToggleCursorRow in) {
        JnaTreeViewClass.OnToggleCursorRow out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view) -> in.onToggleCursorRow(__callback, new TreeView(new PointerContainer(_tree_view)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnExpandCollapseCursorRow {
        /**
         * 
         * @param tree_view 
         * @param logical 
         * @param expand 
         * @param open_all 
         * @return 
        */
        boolean onExpandCollapseCursorRow(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view, boolean logical, boolean expand, boolean open_all);
    }
    
    private static JnaTreeViewClass.OnExpandCollapseCursorRow toOnExpandCollapseCursorRow(ch.bailu.gtk.type.Pointer instance, String methodName, OnExpandCollapseCursorRow in) {
        JnaTreeViewClass.OnExpandCollapseCursorRow out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view, _logical, _expand, _open_all) -> in.onExpandCollapseCursorRow(__callback, new TreeView(new PointerContainer(_tree_view)), _logical, _expand, _open_all);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSelectCursorParent {
        /**
         * 
         * @param tree_view 
         * @return 
        */
        boolean onSelectCursorParent(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view);
    }
    
    private static JnaTreeViewClass.OnSelectCursorParent toOnSelectCursorParent(ch.bailu.gtk.type.Pointer instance, String methodName, OnSelectCursorParent in) {
        JnaTreeViewClass.OnSelectCursorParent out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view) -> in.onSelectCursorParent(__callback, new TreeView(new PointerContainer(_tree_view)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnStartInteractiveSearch {
        /**
         * 
         * @param tree_view 
         * @return 
        */
        boolean onStartInteractiveSearch(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeView tree_view);
    }
    
    private static JnaTreeViewClass.OnStartInteractiveSearch toOnStartInteractiveSearch(ch.bailu.gtk.type.Pointer instance, String methodName, OnStartInteractiveSearch in) {
        JnaTreeViewClass.OnStartInteractiveSearch out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_view) -> in.onStartInteractiveSearch(__callback, new TreeView(new PointerContainer(_tree_view)));
            __callback.register(out);
        }
        return out;
    }

    public TreeViewClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaTreeViewClass.Fields _fields;
    
    JnaTreeViewClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTreeViewClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnRowActivated#onRowActivated}
    */
    public static final String ROW_ACTIVATED = "row_activated";

    /**
     * 
     * <br>See {@link OnRowActivated#onRowActivated}
    */
    public void setFieldRowActivated(OnRowActivated row_activated) {
        toFields().row_activated = toOnRowActivated(this, ROW_ACTIVATED, row_activated);
        toFields().writeField(ROW_ACTIVATED);
    }

    /**
     * 
     * <br>See {@link OnRowActivated#onRowActivated}
    */
    public JnaTreeViewClass.OnRowActivated getFieldRowActivated() {
       toFields().readField(ROW_ACTIVATED);
       return toFields().row_activated;
    } 

    /**
     * 
     * <br>See {@link OnTestExpandRow#onTestExpandRow}
    */
    public static final String TEST_EXPAND_ROW = "test_expand_row";

    /**
     * 
     * <br>See {@link OnTestExpandRow#onTestExpandRow}
    */
    public void setFieldTestExpandRow(OnTestExpandRow test_expand_row) {
        toFields().test_expand_row = toOnTestExpandRow(this, TEST_EXPAND_ROW, test_expand_row);
        toFields().writeField(TEST_EXPAND_ROW);
    }

    /**
     * 
     * <br>See {@link OnTestExpandRow#onTestExpandRow}
    */
    public JnaTreeViewClass.OnTestExpandRow getFieldTestExpandRow() {
       toFields().readField(TEST_EXPAND_ROW);
       return toFields().test_expand_row;
    } 

    /**
     * 
     * <br>See {@link OnTestCollapseRow#onTestCollapseRow}
    */
    public static final String TEST_COLLAPSE_ROW = "test_collapse_row";

    /**
     * 
     * <br>See {@link OnTestCollapseRow#onTestCollapseRow}
    */
    public void setFieldTestCollapseRow(OnTestCollapseRow test_collapse_row) {
        toFields().test_collapse_row = toOnTestCollapseRow(this, TEST_COLLAPSE_ROW, test_collapse_row);
        toFields().writeField(TEST_COLLAPSE_ROW);
    }

    /**
     * 
     * <br>See {@link OnTestCollapseRow#onTestCollapseRow}
    */
    public JnaTreeViewClass.OnTestCollapseRow getFieldTestCollapseRow() {
       toFields().readField(TEST_COLLAPSE_ROW);
       return toFields().test_collapse_row;
    } 

    /**
     * 
     * <br>See {@link OnRowExpanded#onRowExpanded}
    */
    public static final String ROW_EXPANDED = "row_expanded";

    /**
     * 
     * <br>See {@link OnRowExpanded#onRowExpanded}
    */
    public void setFieldRowExpanded(OnRowExpanded row_expanded) {
        toFields().row_expanded = toOnRowExpanded(this, ROW_EXPANDED, row_expanded);
        toFields().writeField(ROW_EXPANDED);
    }

    /**
     * 
     * <br>See {@link OnRowExpanded#onRowExpanded}
    */
    public JnaTreeViewClass.OnRowExpanded getFieldRowExpanded() {
       toFields().readField(ROW_EXPANDED);
       return toFields().row_expanded;
    } 

    /**
     * 
     * <br>See {@link OnRowCollapsed#onRowCollapsed}
    */
    public static final String ROW_COLLAPSED = "row_collapsed";

    /**
     * 
     * <br>See {@link OnRowCollapsed#onRowCollapsed}
    */
    public void setFieldRowCollapsed(OnRowCollapsed row_collapsed) {
        toFields().row_collapsed = toOnRowCollapsed(this, ROW_COLLAPSED, row_collapsed);
        toFields().writeField(ROW_COLLAPSED);
    }

    /**
     * 
     * <br>See {@link OnRowCollapsed#onRowCollapsed}
    */
    public JnaTreeViewClass.OnRowCollapsed getFieldRowCollapsed() {
       toFields().readField(ROW_COLLAPSED);
       return toFields().row_collapsed;
    } 

    /**
     * 
     * <br>See {@link OnColumnsChanged#onColumnsChanged}
    */
    public static final String COLUMNS_CHANGED = "columns_changed";

    /**
     * 
     * <br>See {@link OnColumnsChanged#onColumnsChanged}
    */
    public void setFieldColumnsChanged(OnColumnsChanged columns_changed) {
        toFields().columns_changed = toOnColumnsChanged(this, COLUMNS_CHANGED, columns_changed);
        toFields().writeField(COLUMNS_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnColumnsChanged#onColumnsChanged}
    */
    public JnaTreeViewClass.OnColumnsChanged getFieldColumnsChanged() {
       toFields().readField(COLUMNS_CHANGED);
       return toFields().columns_changed;
    } 

    /**
     * 
     * <br>See {@link OnCursorChanged#onCursorChanged}
    */
    public static final String CURSOR_CHANGED = "cursor_changed";

    /**
     * 
     * <br>See {@link OnCursorChanged#onCursorChanged}
    */
    public void setFieldCursorChanged(OnCursorChanged cursor_changed) {
        toFields().cursor_changed = toOnCursorChanged(this, CURSOR_CHANGED, cursor_changed);
        toFields().writeField(CURSOR_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnCursorChanged#onCursorChanged}
    */
    public JnaTreeViewClass.OnCursorChanged getFieldCursorChanged() {
       toFields().readField(CURSOR_CHANGED);
       return toFields().cursor_changed;
    } 

    /**
     * 
     * <br>See {@link OnMoveCursor#onMoveCursor}
    */
    public static final String MOVE_CURSOR = "move_cursor";

    /**
     * 
     * <br>See {@link OnMoveCursor#onMoveCursor}
    */
    public void setFieldMoveCursor(OnMoveCursor move_cursor) {
        toFields().move_cursor = toOnMoveCursor(this, MOVE_CURSOR, move_cursor);
        toFields().writeField(MOVE_CURSOR);
    }

    /**
     * 
     * <br>See {@link OnMoveCursor#onMoveCursor}
    */
    public JnaTreeViewClass.OnMoveCursor getFieldMoveCursor() {
       toFields().readField(MOVE_CURSOR);
       return toFields().move_cursor;
    } 

    /**
     * 
     * <br>See {@link OnSelectAll#onSelectAll}
    */
    public static final String SELECT_ALL = "select_all";

    /**
     * 
     * <br>See {@link OnSelectAll#onSelectAll}
    */
    public void setFieldSelectAll(OnSelectAll select_all) {
        toFields().select_all = toOnSelectAll(this, SELECT_ALL, select_all);
        toFields().writeField(SELECT_ALL);
    }

    /**
     * 
     * <br>See {@link OnSelectAll#onSelectAll}
    */
    public JnaTreeViewClass.OnSelectAll getFieldSelectAll() {
       toFields().readField(SELECT_ALL);
       return toFields().select_all;
    } 

    /**
     * 
     * <br>See {@link OnUnselectAll#onUnselectAll}
    */
    public static final String UNSELECT_ALL = "unselect_all";

    /**
     * 
     * <br>See {@link OnUnselectAll#onUnselectAll}
    */
    public void setFieldUnselectAll(OnUnselectAll unselect_all) {
        toFields().unselect_all = toOnUnselectAll(this, UNSELECT_ALL, unselect_all);
        toFields().writeField(UNSELECT_ALL);
    }

    /**
     * 
     * <br>See {@link OnUnselectAll#onUnselectAll}
    */
    public JnaTreeViewClass.OnUnselectAll getFieldUnselectAll() {
       toFields().readField(UNSELECT_ALL);
       return toFields().unselect_all;
    } 

    /**
     * 
     * <br>See {@link OnSelectCursorRow#onSelectCursorRow}
    */
    public static final String SELECT_CURSOR_ROW = "select_cursor_row";

    /**
     * 
     * <br>See {@link OnSelectCursorRow#onSelectCursorRow}
    */
    public void setFieldSelectCursorRow(OnSelectCursorRow select_cursor_row) {
        toFields().select_cursor_row = toOnSelectCursorRow(this, SELECT_CURSOR_ROW, select_cursor_row);
        toFields().writeField(SELECT_CURSOR_ROW);
    }

    /**
     * 
     * <br>See {@link OnSelectCursorRow#onSelectCursorRow}
    */
    public JnaTreeViewClass.OnSelectCursorRow getFieldSelectCursorRow() {
       toFields().readField(SELECT_CURSOR_ROW);
       return toFields().select_cursor_row;
    } 

    /**
     * 
     * <br>See {@link OnToggleCursorRow#onToggleCursorRow}
    */
    public static final String TOGGLE_CURSOR_ROW = "toggle_cursor_row";

    /**
     * 
     * <br>See {@link OnToggleCursorRow#onToggleCursorRow}
    */
    public void setFieldToggleCursorRow(OnToggleCursorRow toggle_cursor_row) {
        toFields().toggle_cursor_row = toOnToggleCursorRow(this, TOGGLE_CURSOR_ROW, toggle_cursor_row);
        toFields().writeField(TOGGLE_CURSOR_ROW);
    }

    /**
     * 
     * <br>See {@link OnToggleCursorRow#onToggleCursorRow}
    */
    public JnaTreeViewClass.OnToggleCursorRow getFieldToggleCursorRow() {
       toFields().readField(TOGGLE_CURSOR_ROW);
       return toFields().toggle_cursor_row;
    } 

    /**
     * 
     * <br>See {@link OnExpandCollapseCursorRow#onExpandCollapseCursorRow}
    */
    public static final String EXPAND_COLLAPSE_CURSOR_ROW = "expand_collapse_cursor_row";

    /**
     * 
     * <br>See {@link OnExpandCollapseCursorRow#onExpandCollapseCursorRow}
    */
    public void setFieldExpandCollapseCursorRow(OnExpandCollapseCursorRow expand_collapse_cursor_row) {
        toFields().expand_collapse_cursor_row = toOnExpandCollapseCursorRow(this, EXPAND_COLLAPSE_CURSOR_ROW, expand_collapse_cursor_row);
        toFields().writeField(EXPAND_COLLAPSE_CURSOR_ROW);
    }

    /**
     * 
     * <br>See {@link OnExpandCollapseCursorRow#onExpandCollapseCursorRow}
    */
    public JnaTreeViewClass.OnExpandCollapseCursorRow getFieldExpandCollapseCursorRow() {
       toFields().readField(EXPAND_COLLAPSE_CURSOR_ROW);
       return toFields().expand_collapse_cursor_row;
    } 

    /**
     * 
     * <br>See {@link OnSelectCursorParent#onSelectCursorParent}
    */
    public static final String SELECT_CURSOR_PARENT = "select_cursor_parent";

    /**
     * 
     * <br>See {@link OnSelectCursorParent#onSelectCursorParent}
    */
    public void setFieldSelectCursorParent(OnSelectCursorParent select_cursor_parent) {
        toFields().select_cursor_parent = toOnSelectCursorParent(this, SELECT_CURSOR_PARENT, select_cursor_parent);
        toFields().writeField(SELECT_CURSOR_PARENT);
    }

    /**
     * 
     * <br>See {@link OnSelectCursorParent#onSelectCursorParent}
    */
    public JnaTreeViewClass.OnSelectCursorParent getFieldSelectCursorParent() {
       toFields().readField(SELECT_CURSOR_PARENT);
       return toFields().select_cursor_parent;
    } 

    /**
     * 
     * <br>See {@link OnStartInteractiveSearch#onStartInteractiveSearch}
    */
    public static final String START_INTERACTIVE_SEARCH = "start_interactive_search";

    /**
     * 
     * <br>See {@link OnStartInteractiveSearch#onStartInteractiveSearch}
    */
    public void setFieldStartInteractiveSearch(OnStartInteractiveSearch start_interactive_search) {
        toFields().start_interactive_search = toOnStartInteractiveSearch(this, START_INTERACTIVE_SEARCH, start_interactive_search);
        toFields().writeField(START_INTERACTIVE_SEARCH);
    }

    /**
     * 
     * <br>See {@link OnStartInteractiveSearch#onStartInteractiveSearch}
    */
    public JnaTreeViewClass.OnStartInteractiveSearch getFieldStartInteractiveSearch() {
       toFields().readField(START_INTERACTIVE_SEARCH);
       return toFields().start_interactive_search;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TreeView.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TreeView.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:_reserved:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
