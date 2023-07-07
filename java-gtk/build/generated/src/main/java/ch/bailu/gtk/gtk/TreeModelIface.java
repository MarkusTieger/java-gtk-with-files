/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.TreeModelIface.html">https://docs.gtk.org/gtk4/struct.TreeModelIface.html</a></p>
*/
public class TreeModelIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeModelIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnRowChanged {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param path a `GtkTreePath` pointing to the changed row
         * @param iter a valid `GtkTreeIter` pointing to the changed row
        */
        void onRowChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreePath path, @Nonnull TreeIter iter);
    }
    
    private static JnaTreeModelIface.OnRowChanged toOnRowChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnRowChanged in) {
        JnaTreeModelIface.OnRowChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _path, _iter) -> in.onRowChanged(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreePath(new PointerContainer(_path)), new TreeIter(new PointerContainer(_iter)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRowInserted {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param path a `GtkTreePath` pointing to the inserted row
         * @param iter a valid `GtkTreeIter` pointing to the inserted row
        */
        void onRowInserted(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreePath path, @Nonnull TreeIter iter);
    }
    
    private static JnaTreeModelIface.OnRowInserted toOnRowInserted(ch.bailu.gtk.type.Pointer instance, String methodName, OnRowInserted in) {
        JnaTreeModelIface.OnRowInserted out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _path, _iter) -> in.onRowInserted(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreePath(new PointerContainer(_path)), new TreeIter(new PointerContainer(_iter)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRowHasChildToggled {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param path a `GtkTreePath` pointing to the changed row
         * @param iter a valid `GtkTreeIter` pointing to the changed row
        */
        void onRowHasChildToggled(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreePath path, @Nonnull TreeIter iter);
    }
    
    private static JnaTreeModelIface.OnRowHasChildToggled toOnRowHasChildToggled(ch.bailu.gtk.type.Pointer instance, String methodName, OnRowHasChildToggled in) {
        JnaTreeModelIface.OnRowHasChildToggled out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _path, _iter) -> in.onRowHasChildToggled(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreePath(new PointerContainer(_path)), new TreeIter(new PointerContainer(_iter)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRowDeleted {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param path a `GtkTreePath` pointing to the previous location of   the deleted row
        */
        void onRowDeleted(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreePath path);
    }
    
    private static JnaTreeModelIface.OnRowDeleted toOnRowDeleted(ch.bailu.gtk.type.Pointer instance, String methodName, OnRowDeleted in) {
        JnaTreeModelIface.OnRowDeleted out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _path) -> in.onRowDeleted(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreePath(new PointerContainer(_path)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRowsReordered {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param path a `GtkTreePath` pointing to the tree node whose children   have been reordered
         * @param iter a valid `GtkTreeIter` pointing to the node whose children   have been reordered, or %NULL if the depth of &#64;path is 0
         * @param new_order an array of integers mapping the current position of   each child to its old position before the re-ordering,   i.e. &#64;new_order`[newpos] = oldpos`
        */
        void onRowsReordered(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreePath path, @Nonnull TreeIter iter, @Nonnull ch.bailu.gtk.type.Int new_order);
    }
    
    private static JnaTreeModelIface.OnRowsReordered toOnRowsReordered(ch.bailu.gtk.type.Pointer instance, String methodName, OnRowsReordered in) {
        JnaTreeModelIface.OnRowsReordered out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _path, _iter, _new_order) -> in.onRowsReordered(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreePath(new PointerContainer(_path)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.type.Int(new PointerContainer(_new_order)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetFlags {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @return the flags supported by this interface
        */
        int onGetFlags(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model);
    }
    
    private static JnaTreeModelIface.OnGetFlags toOnGetFlags(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetFlags in) {
        JnaTreeModelIface.OnGetFlags out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model) -> in.onGetFlags(__callback, new TreeModel(new PointerContainer(_tree_model)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetNColumns {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @return the number of columns
        */
        int onGetNColumns(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model);
    }
    
    private static JnaTreeModelIface.OnGetNColumns toOnGetNColumns(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetNColumns in) {
        JnaTreeModelIface.OnGetNColumns out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model) -> in.onGetNColumns(__callback, new TreeModel(new PointerContainer(_tree_model)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetColumnType {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param index_ the column index
         * @return the type of the column
        */
        long onGetColumnType(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, int index_);
    }
    
    private static JnaTreeModelIface.OnGetColumnType toOnGetColumnType(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetColumnType in) {
        JnaTreeModelIface.OnGetColumnType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _index_) -> in.onGetColumnType(__callback, new TreeModel(new PointerContainer(_tree_model)), _index_);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetIter {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param iter the uninitialized `GtkTreeIter`
         * @param path the `GtkTreePath`
         * @return %TRUE, if &#64;iter was set
        */
        boolean onGetIter(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter, @Nonnull TreePath path);
    }
    
    private static JnaTreeModelIface.OnGetIter toOnGetIter(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetIter in) {
        JnaTreeModelIface.OnGetIter out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _iter, _path) -> in.onGetIter(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)), new TreePath(new PointerContainer(_path)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPath {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param iter the `GtkTreeIter`
         * @return a newly-created `GtkTreePath`
        */
        TreePath onGetPath(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter);
    }
    
    private static JnaTreeModelIface.OnGetPath toOnGetPath(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPath in) {
        JnaTreeModelIface.OnGetPath out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _iter) -> in.onGetPath(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetValue {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param iter the `GtkTreeIter`
         * @param column the column to lookup the value at
         * @param value an empty `GValue` to set
        */
        void onGetValue(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter, int column, @Nonnull ch.bailu.gtk.gobject.Value value);
    }
    
    private static JnaTreeModelIface.OnGetValue toOnGetValue(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetValue in) {
        JnaTreeModelIface.OnGetValue out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _iter, _column, _value) -> in.onGetValue(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)), _column, new ch.bailu.gtk.gobject.Value(new PointerContainer(_value)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIterNext {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param iter the `GtkTreeIter`
         * @return %TRUE if &#64;iter has been changed to the next node
        */
        boolean onIterNext(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter);
    }
    
    private static JnaTreeModelIface.OnIterNext toOnIterNext(ch.bailu.gtk.type.Pointer instance, String methodName, OnIterNext in) {
        JnaTreeModelIface.OnIterNext out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _iter) -> in.onIterNext(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIterPrevious {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param iter the `GtkTreeIter`
         * @return %TRUE if &#64;iter has been changed to the previous node
        */
        boolean onIterPrevious(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter);
    }
    
    private static JnaTreeModelIface.OnIterPrevious toOnIterPrevious(ch.bailu.gtk.type.Pointer instance, String methodName, OnIterPrevious in) {
        JnaTreeModelIface.OnIterPrevious out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _iter) -> in.onIterPrevious(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIterChildren {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param iter the new `GtkTreeIter` to be set to the child
         * @param parent the `GtkTreeIter`
         * @return %TRUE, if &#64;iter has been set to the first child
        */
        boolean onIterChildren(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter, @Nullable TreeIter parent);
    }
    
    private static JnaTreeModelIface.OnIterChildren toOnIterChildren(ch.bailu.gtk.type.Pointer instance, String methodName, OnIterChildren in) {
        JnaTreeModelIface.OnIterChildren out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _iter, _parent) -> in.onIterChildren(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)), new TreeIter(new PointerContainer(_parent)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIterHasChild {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param iter the `GtkTreeIter` to test for children
         * @return %TRUE if &#64;iter has children
        */
        boolean onIterHasChild(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter);
    }
    
    private static JnaTreeModelIface.OnIterHasChild toOnIterHasChild(ch.bailu.gtk.type.Pointer instance, String methodName, OnIterHasChild in) {
        JnaTreeModelIface.OnIterHasChild out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _iter) -> in.onIterHasChild(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIterNChildren {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param iter the `GtkTreeIter`
         * @return the number of children of &#64;iter
        */
        int onIterNChildren(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nullable TreeIter iter);
    }
    
    private static JnaTreeModelIface.OnIterNChildren toOnIterNChildren(ch.bailu.gtk.type.Pointer instance, String methodName, OnIterNChildren in) {
        JnaTreeModelIface.OnIterNChildren out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _iter) -> in.onIterNChildren(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIterNthChild {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param iter the `GtkTreeIter` to set to the nth child
         * @param parent the `GtkTreeIter` to get the child from
         * @param n the index of the desired child
         * @return %TRUE, if &#64;parent has an &#64;n-th child
        */
        boolean onIterNthChild(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter, @Nullable TreeIter parent, int n);
    }
    
    private static JnaTreeModelIface.OnIterNthChild toOnIterNthChild(ch.bailu.gtk.type.Pointer instance, String methodName, OnIterNthChild in) {
        JnaTreeModelIface.OnIterNthChild out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _iter, _parent, _n) -> in.onIterNthChild(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)), new TreeIter(new PointerContainer(_parent)), _n);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIterParent {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param iter the new `GtkTreeIter` to set to the parent
         * @param child the `GtkTreeIter`
         * @return %TRUE, if &#64;iter is set to the parent of &#64;child
        */
        boolean onIterParent(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter, @Nonnull TreeIter child);
    }
    
    private static JnaTreeModelIface.OnIterParent toOnIterParent(ch.bailu.gtk.type.Pointer instance, String methodName, OnIterParent in) {
        JnaTreeModelIface.OnIterParent out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _iter, _child) -> in.onIterParent(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)), new TreeIter(new PointerContainer(_child)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRefNode {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param iter the `GtkTreeIter`
        */
        void onRefNode(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter);
    }
    
    private static JnaTreeModelIface.OnRefNode toOnRefNode(ch.bailu.gtk.type.Pointer instance, String methodName, OnRefNode in) {
        JnaTreeModelIface.OnRefNode out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _iter) -> in.onRefNode(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnrefNode {
        /**
         * 
         * @param tree_model a `GtkTreeModel`
         * @param iter the `GtkTreeIter`
        */
        void onUnrefNode(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter);
    }
    
    private static JnaTreeModelIface.OnUnrefNode toOnUnrefNode(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnrefNode in) {
        JnaTreeModelIface.OnUnrefNode out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_model, _iter) -> in.onUnrefNode(__callback, new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)));
            __callback.register(out);
        }
        return out;
    }

    public TreeModelIface(PointerContainer pointer) {
        super(pointer);
    }

    public TreeModelIface() {
        super(cast(JnaTreeModelIface.allocateStructure()));
    }

    private JnaTreeModelIface.Fields _fields;
    
    JnaTreeModelIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTreeModelIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnRowChanged#onRowChanged}
    */
    public static final String ROW_CHANGED = "row_changed";

    /**
     * 
     * <br>See {@link OnRowChanged#onRowChanged}
    */
    public void setFieldRowChanged(OnRowChanged row_changed) {
        toFields().row_changed = toOnRowChanged(this, ROW_CHANGED, row_changed);
        toFields().writeField(ROW_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnRowChanged#onRowChanged}
    */
    public JnaTreeModelIface.OnRowChanged getFieldRowChanged() {
       toFields().readField(ROW_CHANGED);
       return toFields().row_changed;
    } 

    /**
     * 
     * <br>See {@link OnRowInserted#onRowInserted}
    */
    public static final String ROW_INSERTED = "row_inserted";

    /**
     * 
     * <br>See {@link OnRowInserted#onRowInserted}
    */
    public void setFieldRowInserted(OnRowInserted row_inserted) {
        toFields().row_inserted = toOnRowInserted(this, ROW_INSERTED, row_inserted);
        toFields().writeField(ROW_INSERTED);
    }

    /**
     * 
     * <br>See {@link OnRowInserted#onRowInserted}
    */
    public JnaTreeModelIface.OnRowInserted getFieldRowInserted() {
       toFields().readField(ROW_INSERTED);
       return toFields().row_inserted;
    } 

    /**
     * 
     * <br>See {@link OnRowHasChildToggled#onRowHasChildToggled}
    */
    public static final String ROW_HAS_CHILD_TOGGLED = "row_has_child_toggled";

    /**
     * 
     * <br>See {@link OnRowHasChildToggled#onRowHasChildToggled}
    */
    public void setFieldRowHasChildToggled(OnRowHasChildToggled row_has_child_toggled) {
        toFields().row_has_child_toggled = toOnRowHasChildToggled(this, ROW_HAS_CHILD_TOGGLED, row_has_child_toggled);
        toFields().writeField(ROW_HAS_CHILD_TOGGLED);
    }

    /**
     * 
     * <br>See {@link OnRowHasChildToggled#onRowHasChildToggled}
    */
    public JnaTreeModelIface.OnRowHasChildToggled getFieldRowHasChildToggled() {
       toFields().readField(ROW_HAS_CHILD_TOGGLED);
       return toFields().row_has_child_toggled;
    } 

    /**
     * 
     * <br>See {@link OnRowDeleted#onRowDeleted}
    */
    public static final String ROW_DELETED = "row_deleted";

    /**
     * 
     * <br>See {@link OnRowDeleted#onRowDeleted}
    */
    public void setFieldRowDeleted(OnRowDeleted row_deleted) {
        toFields().row_deleted = toOnRowDeleted(this, ROW_DELETED, row_deleted);
        toFields().writeField(ROW_DELETED);
    }

    /**
     * 
     * <br>See {@link OnRowDeleted#onRowDeleted}
    */
    public JnaTreeModelIface.OnRowDeleted getFieldRowDeleted() {
       toFields().readField(ROW_DELETED);
       return toFields().row_deleted;
    } 

    /**
     * 
     * <br>See {@link OnRowsReordered#onRowsReordered}
    */
    public static final String ROWS_REORDERED = "rows_reordered";

    /**
     * 
     * <br>See {@link OnRowsReordered#onRowsReordered}
    */
    public void setFieldRowsReordered(OnRowsReordered rows_reordered) {
        toFields().rows_reordered = toOnRowsReordered(this, ROWS_REORDERED, rows_reordered);
        toFields().writeField(ROWS_REORDERED);
    }

    /**
     * 
     * <br>See {@link OnRowsReordered#onRowsReordered}
    */
    public JnaTreeModelIface.OnRowsReordered getFieldRowsReordered() {
       toFields().readField(ROWS_REORDERED);
       return toFields().rows_reordered;
    } 

    /**
     * 
     * <br>See {@link OnGetFlags#onGetFlags}
    */
    public static final String GET_FLAGS = "get_flags";

    /**
     * 
     * <br>See {@link OnGetFlags#onGetFlags}
    */
    public void setFieldGetFlags(OnGetFlags get_flags) {
        toFields().get_flags = toOnGetFlags(this, GET_FLAGS, get_flags);
        toFields().writeField(GET_FLAGS);
    }

    /**
     * 
     * <br>See {@link OnGetFlags#onGetFlags}
    */
    public JnaTreeModelIface.OnGetFlags getFieldGetFlags() {
       toFields().readField(GET_FLAGS);
       return toFields().get_flags;
    } 

    /**
     * 
     * <br>See {@link OnGetNColumns#onGetNColumns}
    */
    public static final String GET_N_COLUMNS = "get_n_columns";

    /**
     * 
     * <br>See {@link OnGetNColumns#onGetNColumns}
    */
    public void setFieldGetNColumns(OnGetNColumns get_n_columns) {
        toFields().get_n_columns = toOnGetNColumns(this, GET_N_COLUMNS, get_n_columns);
        toFields().writeField(GET_N_COLUMNS);
    }

    /**
     * 
     * <br>See {@link OnGetNColumns#onGetNColumns}
    */
    public JnaTreeModelIface.OnGetNColumns getFieldGetNColumns() {
       toFields().readField(GET_N_COLUMNS);
       return toFields().get_n_columns;
    } 

    /**
     * 
     * <br>See {@link OnGetColumnType#onGetColumnType}
    */
    public static final String GET_COLUMN_TYPE = "get_column_type";

    /**
     * 
     * <br>See {@link OnGetColumnType#onGetColumnType}
    */
    public void setFieldGetColumnType(OnGetColumnType get_column_type) {
        toFields().get_column_type = toOnGetColumnType(this, GET_COLUMN_TYPE, get_column_type);
        toFields().writeField(GET_COLUMN_TYPE);
    }

    /**
     * 
     * <br>See {@link OnGetColumnType#onGetColumnType}
    */
    public JnaTreeModelIface.OnGetColumnType getFieldGetColumnType() {
       toFields().readField(GET_COLUMN_TYPE);
       return toFields().get_column_type;
    } 

    /**
     * 
     * <br>See {@link OnGetIter#onGetIter}
    */
    public static final String GET_ITER = "get_iter";

    /**
     * 
     * <br>See {@link OnGetIter#onGetIter}
    */
    public void setFieldGetIter(OnGetIter get_iter) {
        toFields().get_iter = toOnGetIter(this, GET_ITER, get_iter);
        toFields().writeField(GET_ITER);
    }

    /**
     * 
     * <br>See {@link OnGetIter#onGetIter}
    */
    public JnaTreeModelIface.OnGetIter getFieldGetIter() {
       toFields().readField(GET_ITER);
       return toFields().get_iter;
    } 

    /**
     * 
     * <br>See {@link OnGetPath#onGetPath}
    */
    public static final String GET_PATH = "get_path";

    /**
     * 
     * <br>See {@link OnGetPath#onGetPath}
    */
    public void setFieldGetPath(OnGetPath get_path) {
        toFields().get_path = toOnGetPath(this, GET_PATH, get_path);
        toFields().writeField(GET_PATH);
    }

    /**
     * 
     * <br>See {@link OnGetPath#onGetPath}
    */
    public JnaTreeModelIface.OnGetPath getFieldGetPath() {
       toFields().readField(GET_PATH);
       return toFields().get_path;
    } 

    /**
     * 
     * <br>See {@link OnGetValue#onGetValue}
    */
    public static final String GET_VALUE = "get_value";

    /**
     * 
     * <br>See {@link OnGetValue#onGetValue}
    */
    public void setFieldGetValue(OnGetValue get_value) {
        toFields().get_value = toOnGetValue(this, GET_VALUE, get_value);
        toFields().writeField(GET_VALUE);
    }

    /**
     * 
     * <br>See {@link OnGetValue#onGetValue}
    */
    public JnaTreeModelIface.OnGetValue getFieldGetValue() {
       toFields().readField(GET_VALUE);
       return toFields().get_value;
    } 

    /**
     * 
     * <br>See {@link OnIterNext#onIterNext}
    */
    public static final String ITER_NEXT = "iter_next";

    /**
     * 
     * <br>See {@link OnIterNext#onIterNext}
    */
    public void setFieldIterNext(OnIterNext iter_next) {
        toFields().iter_next = toOnIterNext(this, ITER_NEXT, iter_next);
        toFields().writeField(ITER_NEXT);
    }

    /**
     * 
     * <br>See {@link OnIterNext#onIterNext}
    */
    public JnaTreeModelIface.OnIterNext getFieldIterNext() {
       toFields().readField(ITER_NEXT);
       return toFields().iter_next;
    } 

    /**
     * 
     * <br>See {@link OnIterPrevious#onIterPrevious}
    */
    public static final String ITER_PREVIOUS = "iter_previous";

    /**
     * 
     * <br>See {@link OnIterPrevious#onIterPrevious}
    */
    public void setFieldIterPrevious(OnIterPrevious iter_previous) {
        toFields().iter_previous = toOnIterPrevious(this, ITER_PREVIOUS, iter_previous);
        toFields().writeField(ITER_PREVIOUS);
    }

    /**
     * 
     * <br>See {@link OnIterPrevious#onIterPrevious}
    */
    public JnaTreeModelIface.OnIterPrevious getFieldIterPrevious() {
       toFields().readField(ITER_PREVIOUS);
       return toFields().iter_previous;
    } 

    /**
     * 
     * <br>See {@link OnIterChildren#onIterChildren}
    */
    public static final String ITER_CHILDREN = "iter_children";

    /**
     * 
     * <br>See {@link OnIterChildren#onIterChildren}
    */
    public void setFieldIterChildren(OnIterChildren iter_children) {
        toFields().iter_children = toOnIterChildren(this, ITER_CHILDREN, iter_children);
        toFields().writeField(ITER_CHILDREN);
    }

    /**
     * 
     * <br>See {@link OnIterChildren#onIterChildren}
    */
    public JnaTreeModelIface.OnIterChildren getFieldIterChildren() {
       toFields().readField(ITER_CHILDREN);
       return toFields().iter_children;
    } 

    /**
     * 
     * <br>See {@link OnIterHasChild#onIterHasChild}
    */
    public static final String ITER_HAS_CHILD = "iter_has_child";

    /**
     * 
     * <br>See {@link OnIterHasChild#onIterHasChild}
    */
    public void setFieldIterHasChild(OnIterHasChild iter_has_child) {
        toFields().iter_has_child = toOnIterHasChild(this, ITER_HAS_CHILD, iter_has_child);
        toFields().writeField(ITER_HAS_CHILD);
    }

    /**
     * 
     * <br>See {@link OnIterHasChild#onIterHasChild}
    */
    public JnaTreeModelIface.OnIterHasChild getFieldIterHasChild() {
       toFields().readField(ITER_HAS_CHILD);
       return toFields().iter_has_child;
    } 

    /**
     * 
     * <br>See {@link OnIterNChildren#onIterNChildren}
    */
    public static final String ITER_N_CHILDREN = "iter_n_children";

    /**
     * 
     * <br>See {@link OnIterNChildren#onIterNChildren}
    */
    public void setFieldIterNChildren(OnIterNChildren iter_n_children) {
        toFields().iter_n_children = toOnIterNChildren(this, ITER_N_CHILDREN, iter_n_children);
        toFields().writeField(ITER_N_CHILDREN);
    }

    /**
     * 
     * <br>See {@link OnIterNChildren#onIterNChildren}
    */
    public JnaTreeModelIface.OnIterNChildren getFieldIterNChildren() {
       toFields().readField(ITER_N_CHILDREN);
       return toFields().iter_n_children;
    } 

    /**
     * 
     * <br>See {@link OnIterNthChild#onIterNthChild}
    */
    public static final String ITER_NTH_CHILD = "iter_nth_child";

    /**
     * 
     * <br>See {@link OnIterNthChild#onIterNthChild}
    */
    public void setFieldIterNthChild(OnIterNthChild iter_nth_child) {
        toFields().iter_nth_child = toOnIterNthChild(this, ITER_NTH_CHILD, iter_nth_child);
        toFields().writeField(ITER_NTH_CHILD);
    }

    /**
     * 
     * <br>See {@link OnIterNthChild#onIterNthChild}
    */
    public JnaTreeModelIface.OnIterNthChild getFieldIterNthChild() {
       toFields().readField(ITER_NTH_CHILD);
       return toFields().iter_nth_child;
    } 

    /**
     * 
     * <br>See {@link OnIterParent#onIterParent}
    */
    public static final String ITER_PARENT = "iter_parent";

    /**
     * 
     * <br>See {@link OnIterParent#onIterParent}
    */
    public void setFieldIterParent(OnIterParent iter_parent) {
        toFields().iter_parent = toOnIterParent(this, ITER_PARENT, iter_parent);
        toFields().writeField(ITER_PARENT);
    }

    /**
     * 
     * <br>See {@link OnIterParent#onIterParent}
    */
    public JnaTreeModelIface.OnIterParent getFieldIterParent() {
       toFields().readField(ITER_PARENT);
       return toFields().iter_parent;
    } 

    /**
     * 
     * <br>See {@link OnRefNode#onRefNode}
    */
    public static final String REF_NODE = "ref_node";

    /**
     * 
     * <br>See {@link OnRefNode#onRefNode}
    */
    public void setFieldRefNode(OnRefNode ref_node) {
        toFields().ref_node = toOnRefNode(this, REF_NODE, ref_node);
        toFields().writeField(REF_NODE);
    }

    /**
     * 
     * <br>See {@link OnRefNode#onRefNode}
    */
    public JnaTreeModelIface.OnRefNode getFieldRefNode() {
       toFields().readField(REF_NODE);
       return toFields().ref_node;
    } 

    /**
     * 
     * <br>See {@link OnUnrefNode#onUnrefNode}
    */
    public static final String UNREF_NODE = "unref_node";

    /**
     * 
     * <br>See {@link OnUnrefNode#onUnrefNode}
    */
    public void setFieldUnrefNode(OnUnrefNode unref_node) {
        toFields().unref_node = toOnUnrefNode(this, UNREF_NODE, unref_node);
        toFields().writeField(UNREF_NODE);
    }

    /**
     * 
     * <br>See {@link OnUnrefNode#onUnrefNode}
    */
    public JnaTreeModelIface.OnUnrefNode getFieldUnrefNode() {
       toFields().readField(UNREF_NODE);
       return toFields().unref_node;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TreeModel.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TreeModel.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
