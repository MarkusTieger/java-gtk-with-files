/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A GtkTreeModel which makes an underlying tree model sortable
 * <br>
 * <br>The `GtkTreeModelSort` is a model which implements the `GtkTreeSortable`
 * <br>interface.  It does not hold any data itself, but rather is created with
 * <br>a child model and proxies its data.  It has identical column types to
 * <br>this child model, and the changes in the child are propagated.  The
 * <br>primary purpose of this model is to provide a way to sort a different
 * <br>model without modifying it. Note that the sort function used by
 * <br>`GtkTreeModelSort` is not guaranteed to be stable.
 * <br>
 * <br>The use of this is best demonstrated through an example.  In the
 * <br>following sample code we create two `GtkTreeView` widgets each with a
 * <br>view of the same data.  As the model is wrapped here by a
 * <br>`GtkTreeModelSort`, the two `GtkTreeView`s can each sort their
 * <br>view of the data without affecting the other.  By contrast, if we
 * <br>simply put the same model in each widget, then sorting the first would
 * <br>sort the second.
 * <br>
 * <br>&#35;&#35; Using a `GtkTreeModelSort`
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * {
 *   GtkTreeView *tree_view1;
 *   GtkTreeView *tree_view2;
 *   GtkTreeModel *sort_model1;
 *   GtkTreeModel *sort_model2;
 *   GtkTreeModel *child_model;
 * 
 *   // get the child model
 *   child_model = get_my_model ();
 * 
 *   // Create the first tree
 *   sort_model1 = gtk_tree_model_sort_new_with_model (child_model);
 *   tree_view1 = gtk_tree_view_new_with_model (sort_model1);
 * 
 *   // Create the second tree
 *   sort_model2 = gtk_tree_model_sort_new_with_model (child_model);
 *   tree_view2 = gtk_tree_view_new_with_model (sort_model2);
 * 
 *   // Now we can sort the two models independently
 *   gtk_tree_sortable_set_sort_column_id (GTK_TREE_SORTABLE (sort_model1),
 *                                         COLUMN_1, GTK_SORT_ASCENDING);
 *   gtk_tree_sortable_set_sort_column_id (GTK_TREE_SORTABLE (sort_model2),
 *                                         COLUMN_1, GTK_SORT_DESCENDING);
 * }
 * </pre>
 * <br>
 * <br>To demonstrate how to access the underlying child model from the sort
 * <br>model, the next example will be a callback for the `GtkTreeSelection`
 * <br>`GtkTreeSelection::changed` signal.  In this callback, we get a string
 * <br>from COLUMN_1 of the model.  We then modify the string, find the same
 * <br>selected row on the child model, and change the row there.
 * <br>
 * <br>&#35;&#35; Accessing the child model of in a selection changed callback
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * void
 * selection_changed (GtkTreeSelection *selection, gpointer data)
 * {
 *   GtkTreeModel *sort_model = NULL;
 *   GtkTreeModel *child_model;
 *   GtkTreeIter sort_iter;
 *   GtkTreeIter child_iter;
 *   char *some_data = NULL;
 *   char *modified_data;
 * 
 *   // Get the current selected row and the model.
 *   if (! gtk_tree_selection_get_selected (selection,
 *                                          &amp;sort_model,
 *                                          &amp;sort_iter))
 *     return;
 * 
 *   // Look up the current value on the selected row and get
 *   // a new value to change it to.
 *   gtk_tree_model_get (GTK_TREE_MODEL (sort_model), &amp;sort_iter,
 *                       COLUMN_1, &amp;some_data,
 *                       -1);
 * 
 *   modified_data = change_the_data (some_data);
 *   g_free (some_data);
 * 
 *   // Get an iterator on the child model, instead of the sort model.
 *   gtk_tree_model_sort_convert_iter_to_child_iter (GTK_TREE_MODEL_SORT (sort_model),
 *                                                   &amp;child_iter,
 *                                                   &amp;sort_iter);
 * 
 *   // Get the child model and change the value of the row. In this
 *   // example, the child model is a GtkListStore. It could be any other
 *   // type of model, though.
 *   child_model = gtk_tree_model_sort_get_model (GTK_TREE_MODEL_SORT (sort_model));
 *   gtk_list_store_set (GTK_LIST_STORE (child_model), &amp;child_iter,
 *                       COLUMN_1, &amp;modified_data,
 *                       -1);
 *   g_free (modified_data);
 * }
 * </pre>
 * <p><a href="https://docs.gtk.org/gtk4/class.TreeModelSort.html">https://docs.gtk.org/gtk4/class.TreeModelSort.html</a></p>
*/
public class TreeModelSort extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeModelSort.class.getCanonicalName());
    }

    public TreeModelSort(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkTreeModelSort`, with &#64;child_model as the child model.
     * @param child_model A `GtkTreeModel`
     * @return A new `GtkTreeModelSort`.
    */
    public static TreeModelSort newWithModelTreeModelSort(@Nonnull TreeModel child_model)  {
        PointerContainer __self = cast(JnaTreeModelSort.INST().gtk_tree_model_sort_new_with_model(asCPointerNotNull(child_model)));
        if (__self.isNull()) {
            throw new NullPointerException("TreeModelSort:newWithModel");
        }
        return new TreeModelSort(__self);
    }        
    

    /**
     * This function should almost never be called.  It clears the &#64;tree_model_sort
     * <br>of any cached iterators that haven’t been reffed with
     * <br>gtk_tree_model_ref_node().  This might be useful if the child model being
     * <br>sorted is static (and doesn’t change often) and there has been a lot of
     * <br>unreffed access to nodes.  As a side effect of this function, all unreffed
     * <br>iters will be invalid.
    */
    public void clearCache()  {
        JnaTreeModelSort.INST().gtk_tree_model_sort_clear_cache(asCPointer());
    }

    /**
     * Sets &#64;sort_iter to point to the row in &#64;tree_model_sort that corresponds to
     * <br>the row pointed at by &#64;child_iter.  If &#64;sort_iter was not set, %FALSE
     * <br>is returned.  Note: a boolean is only returned since 2.14.
     * @param sort_iter An uninitialized `GtkTreeIter`
     * @param child_iter A valid `GtkTreeIter` pointing to a row on the child model
     * @return %TRUE, if &#64;sort_iter was set, i.e. if &#64;sort_iter is a valid iterator pointer to a visible row in the child model.
    */
    public boolean convertChildIterToIter(@Nonnull TreeIter sort_iter, @Nonnull TreeIter child_iter)  {
        return JnaTreeModelSort.INST().gtk_tree_model_sort_convert_child_iter_to_iter(asCPointer(), asCPointerNotNull(sort_iter), asCPointerNotNull(child_iter));
    }

    /**
     * Converts &#64;child_path to a path relative to &#64;tree_model_sort.  That is,
     * <br>&#64;child_path points to a path in the child model.  The returned path will
     * <br>point to the same row in the sorted model.  If &#64;child_path isn’t a valid
     * <br>path on the child model, then %NULL is returned.
     * @param child_path A `GtkTreePath` to convert
     * @return A newly allocated `GtkTreePath`
    */
    public TreePath convertChildPathToPath(@Nonnull TreePath child_path)  {
        return new TreePath(new PointerContainer(JnaTreeModelSort.INST().gtk_tree_model_sort_convert_child_path_to_path(asCPointer(), asCPointerNotNull(child_path))));
    }

    /**
     * Sets &#64;child_iter to point to the row pointed to by &#64;sorted_iter.
     * @param child_iter An uninitialized `GtkTreeIter`
     * @param sorted_iter A valid `GtkTreeIter` pointing to a row on &#64;tree_model_sort.
    */
    public void convertIterToChildIter(@Nonnull TreeIter child_iter, @Nonnull TreeIter sorted_iter)  {
        JnaTreeModelSort.INST().gtk_tree_model_sort_convert_iter_to_child_iter(asCPointer(), asCPointerNotNull(child_iter), asCPointerNotNull(sorted_iter));
    }

    /**
     * Converts &#64;sorted_path to a path on the child model of &#64;tree_model_sort.
     * <br>That is, &#64;sorted_path points to a location in &#64;tree_model_sort.  The
     * <br>returned path will point to the same location in the model not being
     * <br>sorted.  If &#64;sorted_path does not point to a location in the child model,
     * <br>%NULL is returned.
     * @param sorted_path A `GtkTreePath` to convert
     * @return A newly allocated `GtkTreePath`
    */
    public TreePath convertPathToChildPath(@Nonnull TreePath sorted_path)  {
        return new TreePath(new PointerContainer(JnaTreeModelSort.INST().gtk_tree_model_sort_convert_path_to_child_path(asCPointer(), asCPointerNotNull(sorted_path))));
    }

    /**
     * Returns the model the `GtkTreeModelSort` is sorting.
     * @return the &quot;child model&quot; being sorted
    */
    public TreeModel getModel()  {
        return new TreeModel(new PointerContainer(JnaTreeModelSort.INST().gtk_tree_model_sort_get_model(asCPointer())));
    }

    /**
     * &gt; This function is slow. Only use it for debugging and/or testing
     * <br>&gt; purposes.
     * <br>
     * <br>Checks if the given iter is a valid iter for this `GtkTreeModelSort`.
     * @param iter A `GtkTreeIter`
     * @return %TRUE if the iter is valid, %FALSE if the iter is invalid.
    */
    public boolean iterIsValid(@Nonnull TreeIter iter)  {
        return JnaTreeModelSort.INST().gtk_tree_model_sort_iter_is_valid(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * This resets the default sort function to be in the “unsorted” state.  That
     * <br>is, it is in the same order as the child model. It will re-sort the model
     * <br>to be in the same order as the child model only if the `GtkTreeModelSort`
     * <br>is in “unsorted” state.
    */
    public void resetDefaultSortFunc()  {
        JnaTreeModelSort.INST().gtk_tree_model_sort_reset_default_sort_func(asCPointer());
    }

    /**
     * Implements interface {@link TreeDragSource}. Call this to get access to interface functions.
     * @return {@link TreeDragSource}
    */
    public TreeDragSource asTreeDragSource() {
        return new TreeDragSource(cast());
    }

    /**
     * Implements interface {@link TreeModel}. Call this to get access to interface functions.
     * @return {@link TreeModel}
    */
    public TreeModel asTreeModel() {
        return new TreeModel(cast());
    }

    /**
     * Implements interface {@link TreeSortable}. Call this to get access to interface functions.
     * @return {@link TreeSortable}
    */
    public TreeSortable asTreeSortable() {
        return new TreeSortable(cast());
    }

    public static long getTypeID() { 
        return JnaTreeModelSort.INST().gtk_tree_model_sort_get_type(); 
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
