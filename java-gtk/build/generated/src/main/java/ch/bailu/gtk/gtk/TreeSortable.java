/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The interface for sortable models used by GtkTreeView
 * <br>
 * <br>`GtkTreeSortable` is an interface to be implemented by tree models which
 * <br>support sorting. The `GtkTreeView` uses the methods provided by this interface
 * <br>to sort the model.
 * <p><a href="https://docs.gtk.org/gtk4/iface.TreeSortable.html">https://docs.gtk.org/gtk4/iface.TreeSortable.html</a></p>
*/
public class TreeSortable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeSortable.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTreeIterCompareFunc {
        /**
         * A GtkTreeIterCompareFunc should return a negative integer, zero, or a positive
         * <br>integer if &#64;a sorts before &#64;b, &#64;a sorts with &#64;b, or &#64;a sorts after &#64;b
         * <br>respectively.
         * <br>
         * <br>If two iters compare as equal, their order in the sorted model
         * <br>is undefined. In order to ensure that the `GtkTreeSortable` behaves as
         * <br>expected, the GtkTreeIterCompareFunc must define a partial order on
         * <br>the model, i.e. it must be reflexive, antisymmetric and transitive.
         * <br>
         * <br>For example, if &#64;model is a product catalogue, then a compare function
         * <br>for the “price” column could be one which returns
         * <br>`price_of(&#64;a) - price_of(&#64;b)`.
         * @param model The `GtkTreeModel` the comparison is within
         * @param a A `GtkTreeIter` in &#64;model
         * @param b Another `GtkTreeIter` in &#64;model
         * @param user_data Data passed when the compare func is assigned e.g. by  gtk_tree_sortable_set_sort_func()
         * @return a negative integer, zero or a positive integer depending on whether   &#64;a sorts before, with or after &#64;b
        */
        int onTreeIterCompareFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel model, @Nonnull TreeIter a, @Nonnull TreeIter b, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaTreeSortable.OnTreeIterCompareFunc toOnTreeIterCompareFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeIterCompareFunc in) {
        JnaTreeSortable.OnTreeIterCompareFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _a, _b, _user_data) -> in.onTreeIterCompareFunc(__callback, new TreeModel(new PointerContainer(_model)), new TreeIter(new PointerContainer(_a)), new TreeIter(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
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
    
    private static JnaTreeSortable.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaTreeSortable.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSortColumnChanged {
        /**
         * The ::sort-column-changed signal is emitted when the sort column
         * <br>or sort order of &#64;sortable is changed. The signal is emitted before
         * <br>the contents of &#64;sortable are resorted.
        */
        void onSortColumnChanged();
    }
    
    private static com.sun.jna.Callback toOnSortColumnChanged(OnSortColumnChanged in) {
        return (in == null) ? null: (JnaTreeSortable.OnSortColumnChanged) (__self, __data) -> in.onSortColumnChanged();
    }

    public TreeSortable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Fills in &#64;sort_column_id and &#64;order with the current sort column and the
     * <br>order. It returns %TRUE unless the &#64;sort_column_id is
     * <br>%GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID or
     * <br>%GTK_TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID.
     * @param sort_column_id The sort column id to be filled in
     * @param order The `GtkSortType` to be filled in
     * @return %TRUE if the sort column is not one of the special sort   column ids.
    */
    public boolean getSortColumnId(@Nonnull ch.bailu.gtk.type.Int sort_column_id, @Nonnull ch.bailu.gtk.type.Int order)  {
        return JnaTreeSortable.INST().gtk_tree_sortable_get_sort_column_id(asCPointer(), asCPointerNotNull(sort_column_id), asCPointerNotNull(order));
    }

    /**
     * Returns %TRUE if the model has a default sort function. This is used
     * <br>primarily by GtkTreeViewColumns in order to determine if a model can
     * <br>go back to the default state, or not.
     * @return %TRUE, if the model has a default sort function
    */
    public boolean hasDefaultSortFunc()  {
        return JnaTreeSortable.INST().gtk_tree_sortable_has_default_sort_func(asCPointer());
    }

    /**
     * Sets the default comparison function used when sorting to be &#64;sort_func.
     * <br>If the current sort column id of &#64;sortable is
     * <br>%GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID, then the model will sort using
     * <br>this function.
     * <br>
     * <br>If &#64;sort_func is %NULL, then there will be no default comparison function.
     * <br>This means that once the model  has been sorted, it can’t go back to the
     * <br>default state. In this case, when the current sort column id of &#64;sortable
     * <br>is %GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID, the model will be unsorted.
     * @param sort_func The comparison function
     * @param user_data User data to pass to &#64;sort_func
     * @param destroy Destroy notifier of &#64;user_data
    */
    public void setDefaultSortFunc(OnTreeIterCompareFunc sort_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy)  {
        JnaTreeSortable.INST().gtk_tree_sortable_set_default_sort_func(asCPointer(), toOnTreeIterCompareFunc(this, "setDefaultSortFunc", sort_func), asCPointer(user_data), toOnDestroyNotify(this, "setDefaultSortFunc", destroy));
    }

    /**
     * Sets the current sort column to be &#64;sort_column_id. The &#64;sortable will
     * <br>resort itself to reflect this change, after emitting a
     * <br>`GtkTreeSortable::sort-column-changed` signal. &#64;sort_column_id may either be
     * <br>a regular column id, or one of the following special values:
     * <br>
     * <br>- %GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID: the default sort function
     * <br>  will be used, if it is set
     * <br>
     * <br>- %GTK_TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID: no sorting will occur
     * @param sort_column_id the sort column id to set
     * @param order The sort order of the column
    */
    public void setSortColumnId(int sort_column_id, int order)  {
        JnaTreeSortable.INST().gtk_tree_sortable_set_sort_column_id(asCPointer(), sort_column_id, order);
    }

    /**
     * Sets the comparison function used when sorting to be &#64;sort_func. If the
     * <br>current sort column id of &#64;sortable is the same as &#64;sort_column_id, then
     * <br>the model will sort using this function.
     * @param sort_column_id the sort column id to set the function for
     * @param sort_func The comparison function
     * @param user_data User data to pass to &#64;sort_func
     * @param destroy Destroy notifier of &#64;user_data
    */
    public void setSortFunc(int sort_column_id, OnTreeIterCompareFunc sort_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy)  {
        JnaTreeSortable.INST().gtk_tree_sortable_set_sort_func(asCPointer(), sort_column_id, toOnTreeIterCompareFunc(this, "setSortFunc", sort_func), asCPointer(user_data), toOnDestroyNotify(this, "setSortFunc", destroy));
    }

    /**
     * Emits a `GtkTreeSortable::sort-column-changed` signal on &#64;sortable.
    */
    public void sortColumnChanged()  {
        JnaTreeSortable.INST().gtk_tree_sortable_sort_column_changed(asCPointer());
    }

    public final static String SIGNAL_ON_SORT_COLUMN_CHANGED = "sort-column-changed";
    
    /**
     * Connect to signal "sort-column-changed".
     * <br>See {@link OnSortColumnChanged#onSortColumnChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_SORT_COLUMN_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSortColumnChanged(OnSortColumnChanged signal) {
        return connectSignal(SIGNAL_ON_SORT_COLUMN_CHANGED, toOnSortColumnChanged(signal));
    }

    public static long getTypeID() { 
        return JnaTreeSortable.INST().gtk_tree_sortable_get_type(); 
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
interface-type
*/
