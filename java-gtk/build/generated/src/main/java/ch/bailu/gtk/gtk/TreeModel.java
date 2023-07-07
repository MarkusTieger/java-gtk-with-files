/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The tree interface used by GtkTreeView
 * <br>
 * <br>The `GtkTreeModel` interface defines a generic tree interface for
 * <br>use by the `GtkTreeView` widget. It is an abstract interface, and
 * <br>is designed to be usable with any appropriate data structure. The
 * <br>programmer just has to implement this interface on their own data
 * <br>type for it to be viewable by a `GtkTreeView` widget.
 * <br>
 * <br>The model is represented as a hierarchical tree of strongly-typed,
 * <br>columned data. In other words, the model can be seen as a tree where
 * <br>every node has different values depending on which column is being
 * <br>queried. The type of data found in a column is determined by using
 * <br>the GType system (ie. %G_TYPE_INT, %GTK_TYPE_BUTTON, %G_TYPE_POINTER,
 * <br>etc). The types are homogeneous per column across all nodes. It is
 * <br>important to note that this interface only provides a way of examining
 * <br>a model and observing changes. The implementation of each individual
 * <br>model decides how and if changes are made.
 * <br>
 * <br>In order to make life simpler for programmers who do not need to
 * <br>write their own specialized model, two generic models are provided
 * <br>— the `GtkTreeStore` and the `GtkListStore`. To use these, the
 * <br>developer simply pushes data into these models as necessary. These
 * <br>models provide the data structure as well as all appropriate tree
 * <br>interfaces. As a result, implementing drag and drop, sorting, and
 * <br>storing data is trivial. For the vast majority of trees and lists,
 * <br>these two models are sufficient.
 * <br>
 * <br>Models are accessed on a node/column level of granularity. One can
 * <br>query for the value of a model at a certain node and a certain
 * <br>column on that node. There are two structures used to reference a
 * <br>particular node in a model. They are the [struct&#64;Gtk.TreePath] and
 * <br>the [struct&#64;Gtk.TreeIter] (“iter” is short for iterator). Most of the
 * <br>interface consists of operations on a [struct&#64;Gtk.TreeIter].
 * <br>
 * <br>A path is essentially a potential node. It is a location on a model
 * <br>that may or may not actually correspond to a node on a specific
 * <br>model. A [struct&#64;Gtk.TreePath] can be converted into either an
 * <br>array of unsigned integers or a string. The string form is a list
 * <br>of numbers separated by a colon. Each number refers to the offset
 * <br>at that level. Thus, the path `0` refers to the root
 * <br>node and the path `2:4` refers to the fifth child of
 * <br>the third node.
 * <br>
 * <br>By contrast, a [struct&#64;Gtk.TreeIter] is a reference to a specific node on
 * <br>a specific model. It is a generic struct with an integer and three
 * <br>generic pointers. These are filled in by the model in a model-specific
 * <br>way. One can convert a path to an iterator by calling
 * <br>gtk_tree_model_get_iter(). These iterators are the primary way
 * <br>of accessing a model and are similar to the iterators used by
 * <br>`GtkTextBuffer`. They are generally statically allocated on the
 * <br>stack and only used for a short time. The model interface defines
 * <br>a set of operations using them for navigating the model.
 * <br>
 * <br>It is expected that models fill in the iterator with private data.
 * <br>For example, the `GtkListStore` model, which is internally a simple
 * <br>linked list, stores a list node in one of the pointers. The
 * <br>`GtkTreeModel`Sort stores an array and an offset in two of the
 * <br>pointers. Additionally, there is an integer field. This field is
 * <br>generally filled with a unique stamp per model. This stamp is for
 * <br>catching errors resulting from using invalid iterators with a model.
 * <br>
 * <br>The lifecycle of an iterator can be a little confusing at first.
 * <br>Iterators are expected to always be valid for as long as the model
 * <br>is unchanged (and doesn’t emit a signal). The model is considered
 * <br>to own all outstanding iterators and nothing needs to be done to
 * <br>free them from the user’s point of view. Additionally, some models
 * <br>guarantee that an iterator is valid for as long as the node it refers
 * <br>to is valid (most notably the `GtkTreeStore` and `GtkListStore`).
 * <br>Although generally uninteresting, as one always has to allow for
 * <br>the case where iterators do not persist beyond a signal, some very
 * <br>important performance enhancements were made in the sort model.
 * <br>As a result, the %GTK_TREE_MODEL_ITERS_PERSIST flag was added to
 * <br>indicate this behavior.
 * <br>
 * <br>To help show some common operation of a model, some examples are
 * <br>provided. The first example shows three ways of getting the iter at
 * <br>the location `3:2:5`. While the first method shown is
 * <br>easier, the second is much more common, as you often get paths from
 * <br>callbacks.
 * <br>
 * <br>&#35;&#35; Acquiring a `GtkTreeIter`
 * <br>
 * <br>```c
 * <br>// Three ways of getting the iter pointing to the location
 * <br>GtkTreePath *path;
 * <br>GtkTreeIter iter;
 * <br>GtkTreeIter parent_iter;
 * <br>
 * <br>// get the iterator from a string
 * <br>gtk_tree_model_get_iter_from_string (model,
 * <br>                                     &amp;iter,
 * <br>                                     &quot;3:2:5&quot;);
 * <br>
 * <br>// get the iterator from a path
 * <br>path = gtk_tree_path_new_from_string (&quot;3:2:5&quot;);
 * <br>gtk_tree_model_get_iter (model, &amp;iter, path);
 * <br>gtk_tree_path_free (path);
 * <br>
 * <br>// walk the tree to find the iterator
 * <br>gtk_tree_model_iter_nth_child (model, &amp;iter,
 * <br>                               NULL, 3);
 * <br>parent_iter = iter;
 * <br>gtk_tree_model_iter_nth_child (model, &amp;iter,
 * <br>                               &amp;parent_iter, 2);
 * <br>parent_iter = iter;
 * <br>gtk_tree_model_iter_nth_child (model, &amp;iter,
 * <br>                               &amp;parent_iter, 5);
 * <br>```
 * <br>
 * <br>This second example shows a quick way of iterating through a list
 * <br>and getting a string and an integer from each row. The
 * <br>populate_model() function used below is not
 * <br>shown, as it is specific to the `GtkListStore`. For information on
 * <br>how to write such a function, see the `GtkListStore` documentation.
 * <br>
 * <br>&#35;&#35; Reading data from a `GtkTreeModel`
 * <br>
 * <br>```c
 * <br>enum
 * <br>{
 * <br>  STRING_COLUMN,
 * <br>  INT_COLUMN,
 * <br>  N_COLUMNS
 * <br>};
 * <br>
 * <br>...
 * <br>
 * <br>GtkTreeModel *list_store;
 * <br>GtkTreeIter iter;
 * <br>gboolean valid;
 * <br>int row_count = 0;
 * <br>
 * <br>// make a new list_store
 * <br>list_store = gtk_list_store_new (N_COLUMNS,
 * <br>                                 G_TYPE_STRING,
 * <br>                                 G_TYPE_INT);
 * <br>
 * <br>// Fill the list store with data
 * <br>populate_model (list_store);
 * <br>
 * <br>// Get the first iter in the list, check it is valid and walk
 * <br>// through the list, reading each row.
 * <br>
 * <br>valid = gtk_tree_model_get_iter_first (list_store,
 * <br>                                       &amp;iter);
 * <br>while (valid)
 * <br> {
 * <br>   char *str_data;
 * <br>   int    int_data;
 * <br>
 * <br>   // Make sure you terminate calls to gtk_tree_model_get() with a “-1” value
 * <br>   gtk_tree_model_get (list_store, &amp;iter,
 * <br>                       STRING_COLUMN, &amp;str_data,
 * <br>                       INT_COLUMN, &amp;int_data,
 * <br>                       -1);
 * <br>
 * <br>   // Do something with the data
 * <br>   g_print (&quot;Row %d: (%s,%d)&#92;n&quot;,
 * <br>            row_count, str_data, int_data);
 * <br>   g_free (str_data);
 * <br>
 * <br>   valid = gtk_tree_model_iter_next (list_store,
 * <br>                                     &amp;iter);
 * <br>   row_count++;
 * <br> }
 * <br>```
 * <br>
 * <br>The `GtkTreeModel` interface contains two methods for reference
 * <br>counting: gtk_tree_model_ref_node() and gtk_tree_model_unref_node().
 * <br>These two methods are optional to implement. The reference counting
 * <br>is meant as a way for views to let models know when nodes are being
 * <br>displayed. `GtkTreeView` will take a reference on a node when it is
 * <br>visible, which means the node is either in the toplevel or expanded.
 * <br>Being displayed does not mean that the node is currently directly
 * <br>visible to the user in the viewport. Based on this reference counting
 * <br>scheme a caching model, for example, can decide whether or not to cache
 * <br>a node based on the reference count. A file-system based model would
 * <br>not want to keep the entire file hierarchy in memory, but just the
 * <br>folders that are currently expanded in every current view.
 * <br>
 * <br>When working with reference counting, the following rules must be taken
 * <br>into account:
 * <br>
 * <br>- Never take a reference on a node without owning a reference on its parent.
 * <br>  This means that all parent nodes of a referenced node must be referenced
 * <br>  as well.
 * <br>
 * <br>- Outstanding references on a deleted node are not released. This is not
 * <br>  possible because the node has already been deleted by the time the
 * <br>  row-deleted signal is received.
 * <br>
 * <br>- Models are not obligated to emit a signal on rows of which none of its
 * <br>  siblings are referenced. To phrase this differently, signals are only
 * <br>  required for levels in which nodes are referenced. For the root level
 * <br>  however, signals must be emitted at all times (however the root level
 * <br>  is always referenced when any view is attached).
 * <p><a href="https://docs.gtk.org/gtk4/iface.TreeModel.html">https://docs.gtk.org/gtk4/iface.TreeModel.html</a></p>
*/
public class TreeModel extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeModel.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTreeModelForeachFunc {
        /**
         * Type of the callback passed to gtk_tree_model_foreach() to
         * <br>iterate over the rows in a tree model.
         * @param model the `GtkTreeModel` being iterated
         * @param path the current `GtkTreePath`
         * @param iter the current `GtkTreeIter`
         * @param data The user data passed to gtk_tree_model_foreach()
         * @return %TRUE to stop iterating, %FALSE to continue
        */
        boolean onTreeModelForeachFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeModel model, @Nonnull TreePath path, @Nonnull TreeIter iter, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTreeModel.OnTreeModelForeachFunc toOnTreeModelForeachFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeModelForeachFunc in) {
        JnaTreeModel.OnTreeModelForeachFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _path, _iter, _data) -> in.onTreeModelForeachFunc(__callback, new TreeModel(new PointerContainer(_model)), new TreePath(new PointerContainer(_path)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRowChanged {
        /**
         * This signal is emitted when a row in the model has changed.
         * @param path a `GtkTreePath` identifying the changed row
         * @param iter a valid `GtkTreeIter` pointing to the changed row
        */
        void onRowChanged(@Nonnull TreePath path, @Nonnull TreeIter iter);
    }
    
    private static com.sun.jna.Callback toOnRowChanged(OnRowChanged in) {
        return (in == null) ? null: (JnaTreeModel.OnRowChanged) (__self, _path, _iter, __data) -> in.onRowChanged(new TreePath(new PointerContainer(_path)), new TreeIter(new PointerContainer(_iter)));
    }

    @FunctionalInterface
    public interface OnRowDeleted {
        /**
         * This signal is emitted when a row has been deleted.
         * <br>
         * <br>Note that no iterator is passed to the signal handler,
         * <br>since the row is already deleted.
         * <br>
         * <br>This should be called by models after a row has been removed.
         * <br>The location pointed to by &#64;path should be the location that
         * <br>the row previously was at. It may not be a valid location anymore.
         * @param path a `GtkTreePath` identifying the row
        */
        void onRowDeleted(@Nonnull TreePath path);
    }
    
    private static com.sun.jna.Callback toOnRowDeleted(OnRowDeleted in) {
        return (in == null) ? null: (JnaTreeModel.OnRowDeleted) (__self, _path, __data) -> in.onRowDeleted(new TreePath(new PointerContainer(_path)));
    }

    @FunctionalInterface
    public interface OnRowHasChildToggled {
        /**
         * This signal is emitted when a row has gotten the first child
         * <br>row or lost its last child row.
         * @param path a `GtkTreePath` identifying the row
         * @param iter a valid `GtkTreeIter` pointing to the row
        */
        void onRowHasChildToggled(@Nonnull TreePath path, @Nonnull TreeIter iter);
    }
    
    private static com.sun.jna.Callback toOnRowHasChildToggled(OnRowHasChildToggled in) {
        return (in == null) ? null: (JnaTreeModel.OnRowHasChildToggled) (__self, _path, _iter, __data) -> in.onRowHasChildToggled(new TreePath(new PointerContainer(_path)), new TreeIter(new PointerContainer(_iter)));
    }

    @FunctionalInterface
    public interface OnRowInserted {
        /**
         * This signal is emitted when a new row has been inserted in
         * <br>the model.
         * <br>
         * <br>Note that the row may still be empty at this point, since
         * <br>it is a common pattern to first insert an empty row, and
         * <br>then fill it with the desired values.
         * @param path a `GtkTreePath` identifying the new row
         * @param iter a valid `GtkTreeIter` pointing to the new row
        */
        void onRowInserted(@Nonnull TreePath path, @Nonnull TreeIter iter);
    }
    
    private static com.sun.jna.Callback toOnRowInserted(OnRowInserted in) {
        return (in == null) ? null: (JnaTreeModel.OnRowInserted) (__self, _path, _iter, __data) -> in.onRowInserted(new TreePath(new PointerContainer(_path)), new TreeIter(new PointerContainer(_iter)));
    }

    @FunctionalInterface
    public interface OnRowsReordered {
        /**
         * This signal is emitted when the children of a node in the
         * <br>`GtkTreeModel` have been reordered.
         * <br>
         * <br>Note that this signal is not emitted
         * <br>when rows are reordered by DND, since this is implemented
         * <br>by removing and then reinserting the row.
         * @param path a `GtkTreePath` identifying the tree node whose children     have been reordered
         * @param iter a valid `GtkTreeIter` pointing to the node whose children     have been reordered, or %NULL if the depth of &#64;path is 0
         * @param new_order an array of integers mapping the current position     of each child to its old position before the re-ordering,     i.e. &#64;new_order`[newpos] = oldpos`
        */
        void onRowsReordered(@Nonnull TreePath path, @Nonnull TreeIter iter, @Nullable ch.bailu.gtk.type.Pointer new_order);
    }
    
    private static com.sun.jna.Callback toOnRowsReordered(OnRowsReordered in) {
        return (in == null) ? null: (JnaTreeModel.OnRowsReordered) (__self, _path, _iter, _new_order, __data) -> in.onRowsReordered(new TreePath(new PointerContainer(_path)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_new_order)));
    }

    public TreeModel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkTreeModel`, with &#64;child_model as the child_model
     * <br>and &#64;root as the virtual root.
     * @param root A `GtkTreePath`
     * @return A new `GtkTreeModel`.
    */
    public TreeModel filterNew(@Nullable TreePath root)  {
        return new TreeModel(new PointerContainer(JnaTreeModel.INST().gtk_tree_model_filter_new(asCPointer(), asCPointer(root))));
    }

    /**
     * Calls &#64;func on each node in model in a depth-first fashion.
     * <br>
     * <br>If &#64;func returns %TRUE, then the tree ceases to be walked,
     * <br>and gtk_tree_model_foreach() returns.
     * @param func a function to be called on each row
     * @param user_data user data to passed to &#64;func
    */
    public void foreach(OnTreeModelForeachFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaTreeModel.INST().gtk_tree_model_foreach(asCPointer(), toOnTreeModelForeachFunc(this, "foreach", func), asCPointer(user_data));
    }

    /**
     * Gets the value of one or more cells in the row referenced by &#64;iter.
     * <br>
     * <br>The variable argument list should contain integer column numbers,
     * <br>each column number followed by a place to store the value being
     * <br>retrieved.  The list is terminated by a -1. For example, to get a
     * <br>value from column 0 with type %G_TYPE_STRING, you would
     * <br>write: `gtk_tree_model_get (model, iter, 0, &amp;place_string_here, -1)`,
     * <br>where `place_string_here` is a &#35;gchararray
     * <br>to be filled with the string.
     * <br>
     * <br>Returned values with type %G_TYPE_OBJECT have to be unreferenced,
     * <br>values with type %G_TYPE_STRING or %G_TYPE_BOXED have to be freed.
     * <br>Other values are passed by value.
     * @param iter a row in &#64;tree_model
     * @param _elipse pairs of column number and value return locations,   terminated by -1
    */
    public void get(@Nonnull TreeIter iter, java.lang.Object... _elipse)  {
        JnaTreeModel.INST().gtk_tree_model_get(asCPointer(), asCPointerNotNull(iter), _elipse);
    }

    /**
     * Returns the type of the column.
     * @param index_ the column index
     * @return the type of the column
    */
    public long getColumnType(int index_)  {
        return JnaTreeModel.INST().gtk_tree_model_get_column_type(asCPointer(), index_);
    }

    /**
     * Returns a set of flags supported by this interface.
     * <br>
     * <br>The flags are a bitwise combination of `GtkTreeModel`Flags.
     * <br>The flags supported should not change during the lifetime
     * <br>of the &#64;tree_model.
     * @return the flags supported by this interface
    */
    public int getFlags()  {
        return JnaTreeModel.INST().gtk_tree_model_get_flags(asCPointer());
    }

    /**
     * Sets &#64;iter to a valid iterator pointing to &#64;path.
     * <br>
     * <br>If &#64;path does not exist, &#64;iter is set to an invalid
     * <br>iterator and %FALSE is returned.
     * @param iter the uninitialized `GtkTreeIter`
     * @param path the `GtkTreePath`
     * @return %TRUE, if &#64;iter was set
    */
    public boolean getIter(@Nonnull TreeIter iter, @Nonnull TreePath path)  {
        return JnaTreeModel.INST().gtk_tree_model_get_iter(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(path));
    }

    /**
     * Initializes &#64;iter with the first iterator in the tree
     * <br>(the one at the path &quot;0&quot;).
     * <br>
     * <br>Returns %FALSE if the tree is empty, %TRUE otherwise.
     * @param iter the uninitialized `GtkTreeIter`
     * @return %TRUE, if &#64;iter was set
    */
    public boolean getIterFirst(@Nonnull TreeIter iter)  {
        return JnaTreeModel.INST().gtk_tree_model_get_iter_first(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Sets &#64;iter to a valid iterator pointing to &#64;path_string, if it
     * <br>exists.
     * <br>
     * <br>Otherwise, &#64;iter is left invalid and %FALSE is returned.
     * @param iter an uninitialized `GtkTreeIter`
     * @param path_string a string representation of a `GtkTreePath`
     * @return %TRUE, if &#64;iter was set
    */
    public boolean getIterFromString(@Nonnull TreeIter iter, @Nonnull ch.bailu.gtk.type.Str path_string)  {
        return JnaTreeModel.INST().gtk_tree_model_get_iter_from_string(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(path_string));
    }

    /**
     * Sets &#64;iter to a valid iterator pointing to &#64;path_string, if it
     * <br>exists.
     * <br>
     * <br>Otherwise, &#64;iter is left invalid and %FALSE is returned.
     * @param iter an uninitialized `GtkTreeIter`
     * @param path_string a string representation of a `GtkTreePath`
     * @return %TRUE, if &#64;iter was set
    */
    public boolean getIterFromString(@Nonnull TreeIter iter, String path_string)  {
        return JnaTreeModel.INST().gtk_tree_model_get_iter_from_string(asCPointer(), asCPointerNotNull(iter), path_string);
    }

    /**
     * Returns the number of columns supported by &#64;tree_model.
     * @return the number of columns
    */
    public int getNColumns()  {
        return JnaTreeModel.INST().gtk_tree_model_get_n_columns(asCPointer());
    }

    /**
     * Returns a newly-created `GtkTreePath` referenced by &#64;iter.
     * <br>
     * <br>This path should be freed with gtk_tree_path_free().
     * @param iter the `GtkTreeIter`
     * @return a newly-created `GtkTreePath`
    */
    public TreePath getPath(@Nonnull TreeIter iter)  {
        return new TreePath(new PointerContainer(JnaTreeModel.INST().gtk_tree_model_get_path(asCPointer(), asCPointerNotNull(iter))));
    }

    /**
     * Generates a string representation of the iter.
     * <br>
     * <br>This string is a “:” separated list of numbers.
     * <br>For example, “4:10:0:3” would be an acceptable
     * <br>return value for this string.
     * @param iter a `GtkTreeIter`
     * @return a newly-allocated string
    */
    public ch.bailu.gtk.type.Str getStringFromIter(@Nonnull TreeIter iter)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTreeModel.INST().gtk_tree_model_get_string_from_iter(asCPointer(), asCPointerNotNull(iter))));
    }

    /**
     * Initializes and sets &#64;value to that at &#64;column.
     * <br>
     * <br>When done with &#64;value, g_value_unset() needs to be called
     * <br>to free any allocated memory.
     * @param iter the `GtkTreeIter`
     * @param column the column to lookup the value at
     * @param value an empty `GValue` to set
    */
    public void getValue(@Nonnull TreeIter iter, int column, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        JnaTreeModel.INST().gtk_tree_model_get_value(asCPointer(), asCPointerNotNull(iter), column, asCPointerNotNull(value));
    }

    /**
     * Sets &#64;iter to point to the first child of &#64;parent.
     * <br>
     * <br>If &#64;parent has no children, %FALSE is returned and &#64;iter is
     * <br>set to be invalid. &#64;parent will remain a valid node after this
     * <br>function has been called.
     * <br>
     * <br>If &#64;parent is %NULL returns the first node, equivalent to
     * <br>`gtk_tree_model_get_iter_first (tree_model, iter);`
     * @param iter the new `GtkTreeIter` to be set to the child
     * @param parent the `GtkTreeIter`
     * @return %TRUE, if &#64;iter has been set to the first child
    */
    public boolean iterChildren(@Nonnull TreeIter iter, @Nullable TreeIter parent)  {
        return JnaTreeModel.INST().gtk_tree_model_iter_children(asCPointer(), asCPointerNotNull(iter), asCPointer(parent));
    }

    /**
     * Returns %TRUE if &#64;iter has children, %FALSE otherwise.
     * @param iter the `GtkTreeIter` to test for children
     * @return %TRUE if &#64;iter has children
    */
    public boolean iterHasChild(@Nonnull TreeIter iter)  {
        return JnaTreeModel.INST().gtk_tree_model_iter_has_child(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Returns the number of children that &#64;iter has.
     * <br>
     * <br>As a special case, if &#64;iter is %NULL, then the number
     * <br>of toplevel nodes is returned.
     * @param iter the `GtkTreeIter`
     * @return the number of children of &#64;iter
    */
    public int iterNChildren(@Nullable TreeIter iter)  {
        return JnaTreeModel.INST().gtk_tree_model_iter_n_children(asCPointer(), asCPointer(iter));
    }

    /**
     * Sets &#64;iter to point to the node following it at the current level.
     * <br>
     * <br>If there is no next &#64;iter, %FALSE is returned and &#64;iter is set
     * <br>to be invalid.
     * @param iter the `GtkTreeIter`
     * @return %TRUE if &#64;iter has been changed to the next node
    */
    public boolean iterNext(@Nonnull TreeIter iter)  {
        return JnaTreeModel.INST().gtk_tree_model_iter_next(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Sets &#64;iter to be the child of &#64;parent, using the given index.
     * <br>
     * <br>The first index is 0. If &#64;n is too big, or &#64;parent has no children,
     * <br>&#64;iter is set to an invalid iterator and %FALSE is returned. &#64;parent
     * <br>will remain a valid node after this function has been called. As a
     * <br>special case, if &#64;parent is %NULL, then the &#64;n-th root node
     * <br>is set.
     * @param iter the `GtkTreeIter` to set to the nth child
     * @param parent the `GtkTreeIter` to get the child from
     * @param n the index of the desired child
     * @return %TRUE, if &#64;parent has an &#64;n-th child
    */
    public boolean iterNthChild(@Nonnull TreeIter iter, @Nullable TreeIter parent, int n)  {
        return JnaTreeModel.INST().gtk_tree_model_iter_nth_child(asCPointer(), asCPointerNotNull(iter), asCPointer(parent), n);
    }

    /**
     * Sets &#64;iter to be the parent of &#64;child.
     * <br>
     * <br>If &#64;child is at the toplevel, and doesn’t have a parent, then
     * <br>&#64;iter is set to an invalid iterator and %FALSE is returned.
     * <br>&#64;child will remain a valid node after this function has been
     * <br>called.
     * <br>
     * <br>&#64;iter will be initialized before the lookup is performed, so &#64;child
     * <br>and &#64;iter cannot point to the same memory location.
     * @param iter the new `GtkTreeIter` to set to the parent
     * @param child the `GtkTreeIter`
     * @return %TRUE, if &#64;iter is set to the parent of &#64;child
    */
    public boolean iterParent(@Nonnull TreeIter iter, @Nonnull TreeIter child)  {
        return JnaTreeModel.INST().gtk_tree_model_iter_parent(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(child));
    }

    /**
     * Sets &#64;iter to point to the previous node at the current level.
     * <br>
     * <br>If there is no previous &#64;iter, %FALSE is returned and &#64;iter is
     * <br>set to be invalid.
     * @param iter the `GtkTreeIter`
     * @return %TRUE if &#64;iter has been changed to the previous node
    */
    public boolean iterPrevious(@Nonnull TreeIter iter)  {
        return JnaTreeModel.INST().gtk_tree_model_iter_previous(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Lets the tree ref the node.
     * <br>
     * <br>This is an optional method for models to implement.
     * <br>To be more specific, models may ignore this call as it exists
     * <br>primarily for performance reasons.
     * <br>
     * <br>This function is primarily meant as a way for views to let
     * <br>caching models know when nodes are being displayed (and hence,
     * <br>whether or not to cache that node). Being displayed means a node
     * <br>is in an expanded branch, regardless of whether the node is currently
     * <br>visible in the viewport. For example, a file-system based model
     * <br>would not want to keep the entire file-hierarchy in memory,
     * <br>just the sections that are currently being displayed by
     * <br>every current view.
     * <br>
     * <br>A model should be expected to be able to get an iter independent
     * <br>of its reffed state.
     * @param iter the `GtkTreeIter`
    */
    public void refNode(@Nonnull TreeIter iter)  {
        JnaTreeModel.INST().gtk_tree_model_ref_node(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Emits the ::row-changed signal on &#64;tree_model.
     * <br>
     * <br>See [signal&#64;Gtk.TreeModel::row-changed].
     * @param path a `GtkTreePath` pointing to the changed row
     * @param iter a valid `GtkTreeIter` pointing to the changed row
    */
    public void rowChanged(@Nonnull TreePath path, @Nonnull TreeIter iter)  {
        JnaTreeModel.INST().gtk_tree_model_row_changed(asCPointer(), asCPointerNotNull(path), asCPointerNotNull(iter));
    }

    /**
     * Emits the ::row-deleted signal on &#64;tree_model.
     * <br>
     * <br>See [signal&#64;Gtk.TreeModel::row-deleted].
     * <br>
     * <br>This should be called by models after a row has been removed.
     * <br>The location pointed to by &#64;path should be the location that
     * <br>the row previously was at. It may not be a valid location anymore.
     * <br>
     * <br>Nodes that are deleted are not unreffed, this means that any
     * <br>outstanding references on the deleted node should not be released.
     * @param path a `GtkTreePath` pointing to the previous location of   the deleted row
    */
    public void rowDeleted(@Nonnull TreePath path)  {
        JnaTreeModel.INST().gtk_tree_model_row_deleted(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Emits the ::row-has-child-toggled signal on &#64;tree_model.
     * <br>
     * <br>See [signal&#64;Gtk.TreeModel::row-has-child-toggled].
     * <br>
     * <br>This should be called by models after the child
     * <br>state of a node changes.
     * @param path a `GtkTreePath` pointing to the changed row
     * @param iter a valid `GtkTreeIter` pointing to the changed row
    */
    public void rowHasChildToggled(@Nonnull TreePath path, @Nonnull TreeIter iter)  {
        JnaTreeModel.INST().gtk_tree_model_row_has_child_toggled(asCPointer(), asCPointerNotNull(path), asCPointerNotNull(iter));
    }

    /**
     * Emits the ::row-inserted signal on &#64;tree_model.
     * <br>
     * <br>See [signal&#64;Gtk.TreeModel::row-inserted].
     * @param path a `GtkTreePath` pointing to the inserted row
     * @param iter a valid `GtkTreeIter` pointing to the inserted row
    */
    public void rowInserted(@Nonnull TreePath path, @Nonnull TreeIter iter)  {
        JnaTreeModel.INST().gtk_tree_model_row_inserted(asCPointer(), asCPointerNotNull(path), asCPointerNotNull(iter));
    }

    /**
     * Emits the ::rows-reordered signal on &#64;tree_model.
     * <br>
     * <br>See [signal&#64;Gtk.TreeModel::rows-reordered].
     * <br>
     * <br>This should be called by models when their rows have been
     * <br>reordered.
     * @param path a `GtkTreePath` pointing to the tree node whose children   have been reordered
     * @param iter a valid `GtkTreeIter` pointing to the node whose children   have been reordered, or %NULL if the depth of &#64;path is 0
     * @param new_order an array of integers mapping the current position of   each child to its old position before the re-ordering,   i.e. &#64;new_order`[newpos] = oldpos`
    */
    public void rowsReordered(@Nonnull TreePath path, @Nonnull TreeIter iter, @Nonnull ch.bailu.gtk.type.Int new_order)  {
        JnaTreeModel.INST().gtk_tree_model_rows_reordered(asCPointer(), asCPointerNotNull(path), asCPointerNotNull(iter), asCPointerNotNull(new_order));
    }

    /**
     * Emits the ::rows-reordered signal on &#64;tree_model.
     * <br>
     * <br>See [signal&#64;Gtk.TreeModel::rows-reordered].
     * <br>
     * <br>This should be called by models when their rows have been
     * <br>reordered.
     * @param path a `GtkTreePath` pointing to the tree node whose children   have been reordered
     * @param iter a valid `GtkTreeIter` pointing to the node   whose children have been reordered, or %NULL if the depth   of &#64;path is 0
     * @param new_order an array of integers   mapping the current position of each child to its old   position before the re-ordering,   i.e. &#64;new_order`[newpos] = oldpos`
     * @param length length of &#64;new_order array
    */
    public void rowsReorderedWithLength(@Nonnull TreePath path, @Nullable TreeIter iter, @Nonnull ch.bailu.gtk.type.Int new_order, int length)  {
        JnaTreeModel.INST().gtk_tree_model_rows_reordered_with_length(asCPointer(), asCPointerNotNull(path), asCPointer(iter), asCPointerNotNull(new_order), length);
    }

    /**
     * Lets the tree unref the node.
     * <br>
     * <br>This is an optional method for models to implement.
     * <br>To be more specific, models may ignore this call as it exists
     * <br>primarily for performance reasons. For more information on what
     * <br>this means, see gtk_tree_model_ref_node().
     * <br>
     * <br>Please note that nodes that are deleted are not unreffed.
     * @param iter the `GtkTreeIter`
    */
    public void unrefNode(@Nonnull TreeIter iter)  {
        JnaTreeModel.INST().gtk_tree_model_unref_node(asCPointer(), asCPointerNotNull(iter));
    }

    public final static String SIGNAL_ON_ROW_CHANGED = "row-changed";
    
    /**
     * Connect to signal "row-changed".
     * <br>See {@link OnRowChanged#onRowChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_ROW_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRowChanged(OnRowChanged signal) {
        return connectSignal(SIGNAL_ON_ROW_CHANGED, toOnRowChanged(signal));
    }

    public final static String SIGNAL_ON_ROW_DELETED = "row-deleted";
    
    /**
     * Connect to signal "row-deleted".
     * <br>See {@link OnRowDeleted#onRowDeleted} for signal description.
     * <br>Field {@link #SIGNAL_ON_ROW_DELETED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRowDeleted(OnRowDeleted signal) {
        return connectSignal(SIGNAL_ON_ROW_DELETED, toOnRowDeleted(signal));
    }

    public final static String SIGNAL_ON_ROW_HAS_CHILD_TOGGLED = "row-has-child-toggled";
    
    /**
     * Connect to signal "row-has-child-toggled".
     * <br>See {@link OnRowHasChildToggled#onRowHasChildToggled} for signal description.
     * <br>Field {@link #SIGNAL_ON_ROW_HAS_CHILD_TOGGLED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRowHasChildToggled(OnRowHasChildToggled signal) {
        return connectSignal(SIGNAL_ON_ROW_HAS_CHILD_TOGGLED, toOnRowHasChildToggled(signal));
    }

    public final static String SIGNAL_ON_ROW_INSERTED = "row-inserted";
    
    /**
     * Connect to signal "row-inserted".
     * <br>See {@link OnRowInserted#onRowInserted} for signal description.
     * <br>Field {@link #SIGNAL_ON_ROW_INSERTED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRowInserted(OnRowInserted signal) {
        return connectSignal(SIGNAL_ON_ROW_INSERTED, toOnRowInserted(signal));
    }

    public final static String SIGNAL_ON_ROWS_REORDERED = "rows-reordered";
    
    /**
     * Connect to signal "rows-reordered".
     * <br>See {@link OnRowsReordered#onRowsReordered} for signal description.
     * <br>Field {@link #SIGNAL_ON_ROWS_REORDERED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRowsReordered(OnRowsReordered signal) {
        return connectSignal(SIGNAL_ON_ROWS_REORDERED, toOnRowsReordered(signal));
    }

    public static long getTypeID() { 
        return JnaTreeModel.INST().gtk_tree_model_get_type(); 
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

[MethodModel:java-type-not-supported:getValist:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:TreeIter:{c:GtkTreeIter*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
*/
