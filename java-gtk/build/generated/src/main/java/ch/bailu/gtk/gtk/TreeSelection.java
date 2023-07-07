/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The selection object for GtkTreeView
 * <br>
 * <br>The `GtkTreeSelection` object is a helper object to manage the selection
 * <br>for a `GtkTreeView` widget.  The `GtkTreeSelection` object is
 * <br>automatically created when a new `GtkTreeView` widget is created, and
 * <br>cannot exist independently of this widget.  The primary reason the
 * <br>`GtkTreeSelection` objects exists is for cleanliness of code and API.
 * <br>That is, there is no conceptual reason all these functions could not be
 * <br>methods on the `GtkTreeView` widget instead of a separate function.
 * <br>
 * <br>The `GtkTreeSelection` object is gotten from a `GtkTreeView` by calling
 * <br>gtk_tree_view_get_selection().  It can be manipulated to check the
 * <br>selection status of the tree, as well as select and deselect individual
 * <br>rows.  Selection is done completely view side.  As a result, multiple
 * <br>views of the same model can have completely different selections.
 * <br>Additionally, you cannot change the selection of a row on the model that
 * <br>is not currently displayed by the view without expanding its parents
 * <br>first.
 * <br>
 * <br>One of the important things to remember when monitoring the selection of
 * <br>a view is that the `GtkTreeSelection`::changed signal is mostly a hint.
 * <br>That is, it may only emit one signal when a range of rows is selected.
 * <br>Additionally, it may on occasion emit a `GtkTreeSelection`::changed signal
 * <br>when nothing has happened (mostly as a result of programmers calling
 * <br>select_row on an already selected row).
 * <p><a href="https://docs.gtk.org/gtk4/class.TreeSelection.html">https://docs.gtk.org/gtk4/class.TreeSelection.html</a></p>
*/
public class TreeSelection extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeSelection.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTreeSelectionForeachFunc {
        /**
         * A function used by gtk_tree_selection_selected_foreach() to map all
         * <br>selected rows.  It will be called on every selected row in the view.
         * @param model The `GtkTreeModel` being viewed
         * @param path The `GtkTreePath` of a selected row
         * @param iter A `GtkTreeIter` pointing to a selected row
         * @param data user data
        */
        void onTreeSelectionForeachFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel model, @Nonnull TreePath path, @Nonnull TreeIter iter, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTreeSelection.OnTreeSelectionForeachFunc toOnTreeSelectionForeachFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeSelectionForeachFunc in) {
        JnaTreeSelection.OnTreeSelectionForeachFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _path, _iter, _data) -> in.onTreeSelectionForeachFunc(__callback, new TreeModel(new PointerContainer(_model)), new TreePath(new PointerContainer(_path)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTreeSelectionFunc {
        /**
         * A function used by gtk_tree_selection_set_select_function() to filter
         * <br>whether or not a row may be selected. It is called whenever a row's
         * <br>state might change.
         * <br>
         * <br>A return value of %TRUE indicates to &#64;selection that it is okay to
         * <br>change the selection.
         * @param selection A `GtkTreeSelection`
         * @param model A `GtkTreeModel` being viewed
         * @param path The `GtkTreePath` of the row in question
         * @param path_currently_selected %TRUE, if the path is currently selected
         * @param data user data
         * @return %TRUE, if the selection state of the row can be toggled
        */
        boolean onTreeSelectionFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeSelection selection, @Nonnull TreeModel model, @Nonnull TreePath path, boolean path_currently_selected, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTreeSelection.OnTreeSelectionFunc toOnTreeSelectionFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeSelectionFunc in) {
        JnaTreeSelection.OnTreeSelectionFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_selection, _model, _path, _path_currently_selected, _data) -> in.onTreeSelectionFunc(__callback, new TreeSelection(new PointerContainer(_selection)), new TreeModel(new PointerContainer(_model)), new TreePath(new PointerContainer(_path)), _path_currently_selected, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
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
    
    private static JnaTreeSelection.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaTreeSelection.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted whenever the selection has (possibly) changed. Please note that
         * <br>this signal is mostly a hint.  It may only be emitted once when a range
         * <br>of rows are selected, and it may occasionally be emitted when nothing
         * <br>has happened.
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaTreeSelection.OnChanged) (__self, __data) -> in.onChanged();
    }

    public TreeSelection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the number of rows that have been selected in &#64;tree.
     * @return The number of rows selected.
    */
    public int countSelectedRows()  {
        return JnaTreeSelection.INST().gtk_tree_selection_count_selected_rows(asCPointer());
    }

    /**
     * Gets the selection mode for &#64;selection. See
     * <br>gtk_tree_selection_set_mode().
     * @return the current selection mode
    */
    public int getMode()  {
        return JnaTreeSelection.INST().gtk_tree_selection_get_mode(asCPointer());
    }

    /**
     * Returns the tree view associated with &#64;selection.
     * @return A `GtkTreeView`
    */
    public TreeView getTreeView()  {
        return new TreeView(new PointerContainer(JnaTreeSelection.INST().gtk_tree_selection_get_tree_view(asCPointer())));
    }

    /**
     * Returns the user data for the selection function.
     * @return The user data.
    */
    public ch.bailu.gtk.type.Pointer getUserData()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTreeSelection.INST().gtk_tree_selection_get_user_data(asCPointer())));
    }

    /**
     * Returns %TRUE if the row at &#64;iter is currently selected.
     * @param iter A valid `GtkTreeIter`
     * @return %TRUE, if &#64;iter is selected
    */
    public boolean iterIsSelected(@Nonnull TreeIter iter)  {
        return JnaTreeSelection.INST().gtk_tree_selection_iter_is_selected(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Returns %TRUE if the row pointed to by &#64;path is currently selected.  If &#64;path
     * <br>does not point to a valid location, %FALSE is returned
     * @param path A `GtkTreePath` to check selection on.
     * @return %TRUE if &#64;path is selected.
    */
    public boolean pathIsSelected(@Nonnull TreePath path)  {
        return JnaTreeSelection.INST().gtk_tree_selection_path_is_selected(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Selects all the nodes. &#64;selection must be set to %GTK_SELECTION_MULTIPLE
     * <br>mode.
    */
    public void selectAll()  {
        JnaTreeSelection.INST().gtk_tree_selection_select_all(asCPointer());
    }

    /**
     * Selects the specified iterator.
     * @param iter The `GtkTreeIter` to be selected.
    */
    public void selectIter(@Nonnull TreeIter iter)  {
        JnaTreeSelection.INST().gtk_tree_selection_select_iter(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Select the row at &#64;path.
     * @param path The `GtkTreePath` to be selected.
    */
    public void selectPath(@Nonnull TreePath path)  {
        JnaTreeSelection.INST().gtk_tree_selection_select_path(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Selects a range of nodes, determined by &#64;start_path and &#64;end_path inclusive.
     * <br>&#64;selection must be set to %GTK_SELECTION_MULTIPLE mode.
     * @param start_path The initial node of the range.
     * @param end_path The final node of the range.
    */
    public void selectRange(@Nonnull TreePath start_path, @Nonnull TreePath end_path)  {
        JnaTreeSelection.INST().gtk_tree_selection_select_range(asCPointer(), asCPointerNotNull(start_path), asCPointerNotNull(end_path));
    }

    /**
     * Calls a function for each selected node. Note that you cannot modify
     * <br>the tree or selection from within this function. As a result,
     * <br>gtk_tree_selection_get_selected_rows() might be more useful.
     * @param func The function to call for each selected node.
     * @param data user data to pass to the function.
    */
    public void selectedForeach(OnTreeSelectionForeachFunc func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaTreeSelection.INST().gtk_tree_selection_selected_foreach(asCPointer(), toOnTreeSelectionForeachFunc(this, "selectedForeach", func), asCPointer(data));
    }

    /**
     * Sets the selection mode of the &#64;selection.  If the previous type was
     * <br>%GTK_SELECTION_MULTIPLE, then the anchor is kept selected, if it was
     * <br>previously selected.
     * @param type The selection mode
    */
    public void setMode(int type)  {
        JnaTreeSelection.INST().gtk_tree_selection_set_mode(asCPointer(), type);
    }

    /**
     * Sets the selection function.
     * <br>
     * <br>If set, this function is called before any node is selected or unselected,
     * <br>giving some control over which nodes are selected. The select function
     * <br>should return %TRUE if the state of the node may be toggled, and %FALSE
     * <br>if the state of the node should be left unchanged.
     * @param func The selection function. May be %NULL
     * @param data The selection function’s data. May be %NULL
     * @param destroy The destroy function for user data.  May be %NULL
    */
    public void setSelectFunction(OnTreeSelectionFunc func, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy)  {
        JnaTreeSelection.INST().gtk_tree_selection_set_select_function(asCPointer(), toOnTreeSelectionFunc(this, "setSelectFunction", func), asCPointer(data), toOnDestroyNotify(this, "setSelectFunction", destroy));
    }

    /**
     * Unselects all the nodes.
    */
    public void unselectAll()  {
        JnaTreeSelection.INST().gtk_tree_selection_unselect_all(asCPointer());
    }

    /**
     * Unselects the specified iterator.
     * @param iter The `GtkTreeIter` to be unselected.
    */
    public void unselectIter(@Nonnull TreeIter iter)  {
        JnaTreeSelection.INST().gtk_tree_selection_unselect_iter(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Unselects the row at &#64;path.
     * @param path The `GtkTreePath` to be unselected.
    */
    public void unselectPath(@Nonnull TreePath path)  {
        JnaTreeSelection.INST().gtk_tree_selection_unselect_path(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Unselects a range of nodes, determined by &#64;start_path and &#64;end_path
     * <br>inclusive.
     * @param start_path The initial node of the range.
     * @param end_path The initial node of the range.
    */
    public void unselectRange(@Nonnull TreePath start_path, @Nonnull TreePath end_path)  {
        JnaTreeSelection.INST().gtk_tree_selection_unselect_range(asCPointer(), asCPointerNotNull(start_path), asCPointerNotNull(end_path));
    }

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
    }

    public static long getTypeID() { 
        return JnaTreeSelection.INST().gtk_tree_selection_get_type(); 
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

[MethodModel:cb-returns-callback:getSelectFunction:[ParameterModel:Supported:[MethodModel:Supported:TreeSelectionFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:TreeSelection:{c:GtkTreeSelection*}}:{j:long}]
        [ParameterModel:Supported:{Gg:TreeModel:{c:GtkTreeModel*}}:{j:long}]
        [ParameterModel:Supported:{Gg:TreePath:{c:GtkTreePath*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]]

[MethodModel:java-type-not-supported:getSelected:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreeModel**}}:{j:}]
        [ParameterModel:Supported:{Gg:TreeIter:{c:GtkTreeIter*}}:{j:long}]

[MethodModel:java-type-not-supported:getSelectedRows:[ParameterModel:Supported:{Gg:List:{c:GList*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkTreeModel**}}:{j:}]
*/
