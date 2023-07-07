/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkTreeModel` which hides parts of an underlying tree model
 * <br>
 * <br>A `GtkTreeModelFilter` is a tree model which wraps another tree model,
 * <br>and can do the following things:
 * <br>
 * <br>- Filter specific rows, based on data from a “visible column”, a column
 * <br>  storing booleans indicating whether the row should be filtered or not,
 * <br>  or based on the return value of a “visible function”, which gets a
 * <br>  model, iter and user_data and returns a boolean indicating whether the
 * <br>  row should be filtered or not.
 * <br>
 * <br>- Modify the “appearance” of the model, using a modify function.
 * <br>  This is extremely powerful and allows for just changing some
 * <br>  values and also for creating a completely different model based
 * <br>  on the given child model.
 * <br>
 * <br>- Set a different root node, also known as a “virtual root”. You can pass
 * <br>  in a `GtkTreePath` indicating the root node for the filter at construction
 * <br>  time.
 * <br>
 * <br>The basic API is similar to `GtkTreeModelSort`. For an example on its usage,
 * <br>see the section on `GtkTreeModelSort`.
 * <br>
 * <br>When using `GtkTreeModelFilter`, it is important to realize that
 * <br>`GtkTreeModelFilter` maintains an internal cache of all nodes which are
 * <br>visible in its clients. The cache is likely to be a subtree of the tree
 * <br>exposed by the child model. `GtkTreeModelFilter` will not cache the entire
 * <br>child model when unnecessary to not compromise the caching mechanism
 * <br>that is exposed by the reference counting scheme. If the child model
 * <br>implements reference counting, unnecessary signals may not be emitted
 * <br>because of reference counting rule 3, see the `GtkTreeModel`
 * <br>documentation. (Note that e.g. `GtkTreeStore` does not implement
 * <br>reference counting and will always emit all signals, even when
 * <br>the receiving node is not visible).
 * <br>
 * <br>Because of this, limitations for possible visible functions do apply.
 * <br>In general, visible functions should only use data or properties from
 * <br>the node for which the visibility state must be determined, its siblings
 * <br>or its parents. Usually, having a dependency on the state of any child
 * <br>node is not possible, unless references are taken on these explicitly.
 * <br>When no such reference exists, no signals may be received for these child
 * <br>nodes (see reference counting rule number 3 in the `GtkTreeModel` section).
 * <br>
 * <br>Determining the visibility state of a given node based on the state
 * <br>of its child nodes is a frequently occurring use case. Therefore,
 * <br>`GtkTreeModelFilter` explicitly supports this. For example, when a node
 * <br>does not have any children, you might not want the node to be visible.
 * <br>As soon as the first row is added to the node’s child level (or the
 * <br>last row removed), the node’s visibility should be updated.
 * <br>
 * <br>This introduces a dependency from the node on its child nodes. In order
 * <br>to accommodate this, `GtkTreeModelFilter` must make sure the necessary
 * <br>signals are received from the child model. This is achieved by building,
 * <br>for all nodes which are exposed as visible nodes to `GtkTreeModelFilter`'s
 * <br>clients, the child level (if any) and take a reference on the first node
 * <br>in this level. Furthermore, for every row-inserted, row-changed or
 * <br>row-deleted signal (also these which were not handled because the node
 * <br>was not cached), `GtkTreeModelFilter` will check if the visibility state
 * <br>of any parent node has changed.
 * <br>
 * <br>Beware, however, that this explicit support is limited to these two
 * <br>cases. For example, if you want a node to be visible only if two nodes
 * <br>in a child’s child level (2 levels deeper) are visible, you are on your
 * <br>own. In this case, either rely on `GtkTreeStore` to emit all signals
 * <br>because it does not implement reference counting, or for models that
 * <br>do implement reference counting, obtain references on these child levels
 * <br>yourself.
 * <p><a href="https://docs.gtk.org/gtk4/class.TreeModelFilter.html">https://docs.gtk.org/gtk4/class.TreeModelFilter.html</a></p>
*/
public class TreeModelFilter extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeModelFilter.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTreeModelFilterModifyFunc {
        /**
         * A function which calculates display values from raw values in the model.
         * <br>It must fill &#64;value with the display value for the column &#64;column in the
         * <br>row indicated by &#64;iter.
         * <br>
         * <br>Since this function is called for each data access, it’s not a
         * <br>particularly efficient operation.
         * @param model the `GtkTreeModelFilter`
         * @param iter a `GtkTreeIter` pointing to the row whose display values are determined
         * @param value A `GValue` which is already initialized for  with the correct type for the column &#64;column.
         * @param column the column whose display value is determined
         * @param data user data given to gtk_tree_model_filter_set_modify_func()
        */
        void onTreeModelFilterModifyFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel model, @Nonnull TreeIter iter, @Nonnull ch.bailu.gtk.gobject.Value value, int column, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTreeModelFilter.OnTreeModelFilterModifyFunc toOnTreeModelFilterModifyFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeModelFilterModifyFunc in) {
        JnaTreeModelFilter.OnTreeModelFilterModifyFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _iter, _value, _column, _data) -> in.onTreeModelFilterModifyFunc(__callback, new TreeModel(new PointerContainer(_model)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.gobject.Value(new PointerContainer(_value)), _column, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
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
    
    private static JnaTreeModelFilter.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaTreeModelFilter.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTreeModelFilterVisibleFunc {
        /**
         * A function which decides whether the row indicated by &#64;iter is visible.
         * @param model the child model of the `GtkTreeModelFilter`
         * @param iter a `GtkTreeIter` pointing to the row in &#64;model whose visibility   is determined
         * @param data user data given to gtk_tree_model_filter_set_visible_func()
         * @return Whether the row indicated by &#64;iter is visible.
        */
        boolean onTreeModelFilterVisibleFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel model, @Nonnull TreeIter iter, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTreeModelFilter.OnTreeModelFilterVisibleFunc toOnTreeModelFilterVisibleFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeModelFilterVisibleFunc in) {
        JnaTreeModelFilter.OnTreeModelFilterVisibleFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _iter, _data) -> in.onTreeModelFilterVisibleFunc(__callback, new TreeModel(new PointerContainer(_model)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public TreeModelFilter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * This function should almost never be called. It clears the &#64;filter
     * <br>of any cached iterators that haven’t been reffed with
     * <br>gtk_tree_model_ref_node(). This might be useful if the child model
     * <br>being filtered is static (and doesn’t change often) and there has been
     * <br>a lot of unreffed access to nodes. As a side effect of this function,
     * <br>all unreffed iters will be invalid.
    */
    public void clearCache()  {
        JnaTreeModelFilter.INST().gtk_tree_model_filter_clear_cache(asCPointer());
    }

    /**
     * Sets &#64;filter_iter to point to the row in &#64;filter that corresponds to the
     * <br>row pointed at by &#64;child_iter.  If &#64;filter_iter was not set, %FALSE is
     * <br>returned.
     * @param filter_iter An uninitialized `GtkTreeIter`
     * @param child_iter A valid `GtkTreeIter` pointing to a row on the child model.
     * @return %TRUE, if &#64;filter_iter was set, i.e. if &#64;child_iter is a valid iterator pointing to a visible row in child model.
    */
    public boolean convertChildIterToIter(@Nonnull TreeIter filter_iter, @Nonnull TreeIter child_iter)  {
        return JnaTreeModelFilter.INST().gtk_tree_model_filter_convert_child_iter_to_iter(asCPointer(), asCPointerNotNull(filter_iter), asCPointerNotNull(child_iter));
    }

    /**
     * Converts &#64;child_path to a path relative to &#64;filter. That is, &#64;child_path
     * <br>points to a path in the child model. The rerturned path will point to the
     * <br>same row in the filtered model. If &#64;child_path isn’t a valid path on the
     * <br>child model or points to a row which is not visible in &#64;filter, then %NULL
     * <br>is returned.
     * @param child_path A `GtkTreePath` to convert.
     * @return A newly allocated `GtkTreePath`
    */
    public TreePath convertChildPathToPath(@Nonnull TreePath child_path)  {
        return new TreePath(new PointerContainer(JnaTreeModelFilter.INST().gtk_tree_model_filter_convert_child_path_to_path(asCPointer(), asCPointerNotNull(child_path))));
    }

    /**
     * Sets &#64;child_iter to point to the row pointed to by &#64;filter_iter.
     * @param child_iter An uninitialized `GtkTreeIter`
     * @param filter_iter A valid `GtkTreeIter` pointing to a row on &#64;filter.
    */
    public void convertIterToChildIter(@Nonnull TreeIter child_iter, @Nonnull TreeIter filter_iter)  {
        JnaTreeModelFilter.INST().gtk_tree_model_filter_convert_iter_to_child_iter(asCPointer(), asCPointerNotNull(child_iter), asCPointerNotNull(filter_iter));
    }

    /**
     * Converts &#64;filter_path to a path on the child model of &#64;filter. That is,
     * <br>&#64;filter_path points to a location in &#64;filter. The returned path will
     * <br>point to the same location in the model not being filtered. If &#64;filter_path
     * <br>does not point to a location in the child model, %NULL is returned.
     * @param filter_path A `GtkTreePath` to convert.
     * @return A newly allocated `GtkTreePath`
    */
    public TreePath convertPathToChildPath(@Nonnull TreePath filter_path)  {
        return new TreePath(new PointerContainer(JnaTreeModelFilter.INST().gtk_tree_model_filter_convert_path_to_child_path(asCPointer(), asCPointerNotNull(filter_path))));
    }

    /**
     * Returns a pointer to the child model of &#64;filter.
     * @return A pointer to a `GtkTreeModel`
    */
    public TreeModel getModel()  {
        return new TreeModel(new PointerContainer(JnaTreeModelFilter.INST().gtk_tree_model_filter_get_model(asCPointer())));
    }

    /**
     * Emits ::row_changed for each row in the child model, which causes
     * <br>the filter to re-evaluate whether a row is visible or not.
    */
    public void refilter()  {
        JnaTreeModelFilter.INST().gtk_tree_model_filter_refilter(asCPointer());
    }

    /**
     * With the &#64;n_columns and &#64;types parameters, you give an array of column
     * <br>types for this model (which will be exposed to the parent model/view).
     * <br>The &#64;func, &#64;data and &#64;destroy parameters are for specifying the modify
     * <br>function. The modify function will get called for each
     * <br>data access, the goal of the modify function is to return the data which
     * <br>should be displayed at the location specified using the parameters of the
     * <br>modify function.
     * <br>
     * <br>Note that gtk_tree_model_filter_set_modify_func()
     * <br>can only be called once for a given filter model.
     * @param n_columns The number of columns in the filter model.
     * @param types The `GType`s of the columns.
     * @param func A `GtkTreeModelFilterModifyFunc`
     * @param data User data to pass to the modify function
     * @param destroy Destroy notifier of &#64;data
    */
    public void setModifyFunc(int n_columns, @Nonnull ch.bailu.gtk.type.Int64 types, OnTreeModelFilterModifyFunc func, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy)  {
        JnaTreeModelFilter.INST().gtk_tree_model_filter_set_modify_func(asCPointer(), n_columns, asCPointerNotNull(types), toOnTreeModelFilterModifyFunc(this, "setModifyFunc", func), asCPointer(data), toOnDestroyNotify(this, "setModifyFunc", destroy));
    }

    /**
     * Sets &#64;column of the child_model to be the column where &#64;filter should
     * <br>look for visibility information. &#64;columns should be a column of type
     * <br>%G_TYPE_BOOLEAN, where %TRUE means that a row is visible, and %FALSE
     * <br>if not.
     * <br>
     * <br>Note that gtk_tree_model_filter_set_visible_func() or
     * <br>gtk_tree_model_filter_set_visible_column() can only be called
     * <br>once for a given filter model.
     * @param column A `int` which is the column containing the visible information
    */
    public void setVisibleColumn(int column)  {
        JnaTreeModelFilter.INST().gtk_tree_model_filter_set_visible_column(asCPointer(), column);
    }

    /**
     * Sets the visible function used when filtering the &#64;filter to be &#64;func.
     * <br>The function should return %TRUE if the given row should be visible and
     * <br>%FALSE otherwise.
     * <br>
     * <br>If the condition calculated by the function changes over time (e.g.
     * <br>because it depends on some global parameters), you must call
     * <br>gtk_tree_model_filter_refilter() to keep the visibility information
     * <br>of the model up-to-date.
     * <br>
     * <br>Note that &#64;func is called whenever a row is inserted, when it may still
     * <br>be empty. The visible function should therefore take special care of empty
     * <br>rows, like in the example below.
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * static gboolean
     * visible_func (GtkTreeModel *model,
     *               GtkTreeIter  *iter,
     *               gpointer      data)
     * {
     *   // Visible if row is non-empty and first column is “HI”
     *   char *str;
     *   gboolean visible = FALSE;
     * 
     *   gtk_tree_model_get (model, iter, 0, &amp;str, -1);
     *   if (str &amp;&amp; strcmp (str, &quot;HI&quot;) == 0)
     *     visible = TRUE;
     *   g_free (str);
     * 
     *   return visible;
     * }
     * </pre>
     * <br>
     * <br>Note that gtk_tree_model_filter_set_visible_func() or
     * <br>gtk_tree_model_filter_set_visible_column() can only be called
     * <br>once for a given filter model.
     * @param func A `GtkTreeModelFilterVisibleFunc`, the visible function
     * @param data User data to pass to the visible function
     * @param destroy Destroy notifier of &#64;data
    */
    public void setVisibleFunc(OnTreeModelFilterVisibleFunc func, @Nullable ch.bailu.gtk.type.Pointer data, OnDestroyNotify destroy)  {
        JnaTreeModelFilter.INST().gtk_tree_model_filter_set_visible_func(asCPointer(), toOnTreeModelFilterVisibleFunc(this, "setVisibleFunc", func), asCPointer(data), toOnDestroyNotify(this, "setVisibleFunc", destroy));
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

    public static long getTypeID() { 
        return JnaTreeModelFilter.INST().gtk_tree_model_filter_get_type(); 
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
