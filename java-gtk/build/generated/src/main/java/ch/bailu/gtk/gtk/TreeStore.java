/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A tree-like data structure that can be used with the GtkTreeView
 * <br>
 * <br>The `GtkTreeStore` object is a list model for use with a `GtkTreeView`
 * <br>widget.  It implements the `GtkTreeModel` interface, and consequently,
 * <br>can use all of the methods available there.  It also implements the
 * <br>`GtkTreeSortable` interface so it can be sorted by the view.  Finally,
 * <br>it also implements the tree
 * <br>[drag and drop][gtk3-GtkTreeView-drag-and-drop]
 * <br>interfaces.
 * <br>
 * <br>&#35; GtkTreeStore as GtkBuildable
 * <br>
 * <br>The GtkTreeStore implementation of the `GtkBuildable` interface allows
 * <br>to specify the model columns with a &lt;columns&gt; element that may contain
 * <br>multiple &lt;column&gt; elements, each specifying one model column. The “type”
 * <br>attribute specifies the data type for the column.
 * <br>
 * <br>An example of a UI Definition fragment for a tree store:
 * <pre>
 * &lt;object class=&quot;GtkTreeStore&quot;&gt;
 *   &lt;columns&gt;
 *     &lt;column type=&quot;gchararray&quot;/&gt;
 *     &lt;column type=&quot;gchararray&quot;/&gt;
 *     &lt;column type=&quot;gint&quot;/&gt;
 *   &lt;/columns&gt;
 * &lt;/object&gt;
 * </pre>
 * <p><a href="https://docs.gtk.org/gtk4/class.TreeStore.html">https://docs.gtk.org/gtk4/class.TreeStore.html</a></p>
*/
public class TreeStore extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeStore.class.getCanonicalName());
    }

    public TreeStore(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Non vararg creation function.  Used primarily by language bindings.
     * @param n_columns number of columns in the tree store
     * @param types an array of `GType` types for the columns, from first to last
     * @return a new `GtkTreeStore`
    */
    public static TreeStore newvTreeStore(int n_columns, @Nonnull ch.bailu.gtk.type.Int64 types)  {
        PointerContainer __self = cast(JnaTreeStore.INST().gtk_tree_store_newv(n_columns, asCPointerNotNull(types)));
        if (__self.isNull()) {
            throw new NullPointerException("TreeStore:newv");
        }
        return new TreeStore(__self);
    }        
    

    /**
     * Creates a new tree store as with &#64;n_columns columns each of the types passed
     * <br>in.  Note that only types derived from standard GObject fundamental types
     * <br>are supported.
     * <br>
     * <br>As an example,
     * <br>
     * <br>```
     * <br>gtk_tree_store_new (3, G_TYPE_INT, G_TYPE_STRING, GDK_TYPE_TEXTURE);
     * <br>```
     * <br>
     * <br>will create a new `GtkTreeStore` with three columns, of type
     * <br>`int`, `gchararray`, and `GdkTexture` respectively.
     * @param n_columns number of columns in the tree store
     * @param _elipse all `GType` types for the columns, from first to last
    */
    public TreeStore(int n_columns, java.lang.Object... _elipse) {
        super(cast(JnaTreeStore.INST().gtk_tree_store_new(n_columns, _elipse)));
    }

    /**
     * Appends a new row to &#64;tree_store.  If &#64;parent is non-%NULL, then it will append the
     * <br>new row after the last child of &#64;parent, otherwise it will append a row to
     * <br>the top level.  &#64;iter will be changed to point to this new row.  The row will
     * <br>be empty after this function is called.  To fill in values, you need to call
     * <br>gtk_tree_store_set() or gtk_tree_store_set_value().
     * @param iter An unset `GtkTreeIter` to set to the appended row
     * @param parent A valid `GtkTreeIter`
    */
    public void append(@Nonnull TreeIter iter, @Nullable TreeIter parent)  {
        JnaTreeStore.INST().gtk_tree_store_append(asCPointer(), asCPointerNotNull(iter), asCPointer(parent));
    }

    /**
     * Removes all rows from &#64;tree_store
    */
    public void clear()  {
        JnaTreeStore.INST().gtk_tree_store_clear(asCPointer());
    }

    /**
     * Creates a new row at &#64;position.  If parent is non-%NULL, then the row will be
     * <br>made a child of &#64;parent.  Otherwise, the row will be created at the toplevel.
     * <br>If &#64;position is -1 or is larger than the number of rows at that level, then
     * <br>the new row will be inserted to the end of the list.  &#64;iter will be changed
     * <br>to point to this new row.  The row will be empty after this function is
     * <br>called.  To fill in values, you need to call gtk_tree_store_set() or
     * <br>gtk_tree_store_set_value().
     * @param iter An unset `GtkTreeIter` to set to the new row
     * @param parent A valid `GtkTreeIter`
     * @param position position to insert the new row, or -1 for last
    */
    public void insert(@Nonnull TreeIter iter, @Nullable TreeIter parent, int position)  {
        JnaTreeStore.INST().gtk_tree_store_insert(asCPointer(), asCPointerNotNull(iter), asCPointer(parent), position);
    }

    /**
     * Inserts a new row after &#64;sibling.  If &#64;sibling is %NULL, then the row will be
     * <br>prepended to &#64;parent ’s children.  If &#64;parent and &#64;sibling are %NULL, then
     * <br>the row will be prepended to the toplevel.  If both &#64;sibling and &#64;parent are
     * <br>set, then &#64;parent must be the parent of &#64;sibling.  When &#64;sibling is set,
     * <br>&#64;parent is optional.
     * <br>
     * <br>&#64;iter will be changed to point to this new row.  The row will be empty after
     * <br>this function is called.  To fill in values, you need to call
     * <br>gtk_tree_store_set() or gtk_tree_store_set_value().
     * @param iter An unset `GtkTreeIter` to set to the new row
     * @param parent A valid `GtkTreeIter`
     * @param sibling A valid `GtkTreeIter`
    */
    public void insertAfter(@Nonnull TreeIter iter, @Nullable TreeIter parent, @Nullable TreeIter sibling)  {
        JnaTreeStore.INST().gtk_tree_store_insert_after(asCPointer(), asCPointerNotNull(iter), asCPointer(parent), asCPointer(sibling));
    }

    /**
     * Inserts a new row before &#64;sibling.  If &#64;sibling is %NULL, then the row will
     * <br>be appended to &#64;parent ’s children.  If &#64;parent and &#64;sibling are %NULL, then
     * <br>the row will be appended to the toplevel.  If both &#64;sibling and &#64;parent are
     * <br>set, then &#64;parent must be the parent of &#64;sibling.  When &#64;sibling is set,
     * <br>&#64;parent is optional.
     * <br>
     * <br>&#64;iter will be changed to point to this new row.  The row will be empty after
     * <br>this function is called.  To fill in values, you need to call
     * <br>gtk_tree_store_set() or gtk_tree_store_set_value().
     * @param iter An unset `GtkTreeIter` to set to the new row
     * @param parent A valid `GtkTreeIter`
     * @param sibling A valid `GtkTreeIter`
    */
    public void insertBefore(@Nonnull TreeIter iter, @Nullable TreeIter parent, @Nullable TreeIter sibling)  {
        JnaTreeStore.INST().gtk_tree_store_insert_before(asCPointer(), asCPointerNotNull(iter), asCPointer(parent), asCPointer(sibling));
    }

    /**
     * Creates a new row at &#64;position. &#64;iter will be changed to point to this
     * <br>new row. If &#64;position is -1, or larger than the number of rows on the list, then
     * <br>the new row will be appended to the list. The row will be filled with
     * <br>the values given to this function.
     * <br>
     * <br>Calling
     * <br>`gtk_tree_store_insert_with_values (tree_store, iter, position, ...)`
     * <br>has the same effect as calling
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * gtk_tree_store_insert (tree_store, iter, position);
     * gtk_tree_store_set (tree_store, iter, ...);
     * </pre>
     * <br>with the different that the former will only emit a row_inserted signal,
     * <br>while the latter will emit row_inserted, row_changed and if the tree store
     * <br>is sorted, rows_reordered.  Since emitting the rows_reordered signal
     * <br>repeatedly can affect the performance of the program,
     * <br>gtk_tree_store_insert_with_values() should generally be preferred when
     * <br>inserting rows in a sorted tree store.
     * @param iter An unset `GtkTreeIter` to set the new row
     * @param parent A valid `GtkTreeIter`
     * @param position position to insert the new row, or -1 to append after existing rows
     * @param _elipse pairs of column number and value, terminated with -1
    */
    public void insertWithValues(@Nullable TreeIter iter, @Nullable TreeIter parent, int position, java.lang.Object... _elipse)  {
        JnaTreeStore.INST().gtk_tree_store_insert_with_values(asCPointer(), asCPointer(iter), asCPointer(parent), position, _elipse);
    }

    /**
     * Returns %TRUE if &#64;iter is an ancestor of &#64;descendant.  That is, &#64;iter is the
     * <br>parent (or grandparent or great-grandparent) of &#64;descendant.
     * @param iter A valid `GtkTreeIter`
     * @param descendant A valid `GtkTreeIter`
     * @return %TRUE, if &#64;iter is an ancestor of &#64;descendant
    */
    public boolean isAncestor(@Nonnull TreeIter iter, @Nonnull TreeIter descendant)  {
        return JnaTreeStore.INST().gtk_tree_store_is_ancestor(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(descendant));
    }

    /**
     * Returns the depth of &#64;iter.  This will be 0 for anything on the root level, 1
     * <br>for anything down a level, etc.
     * @param iter A valid `GtkTreeIter`
     * @return The depth of &#64;iter
    */
    public int iterDepth(@Nonnull TreeIter iter)  {
        return JnaTreeStore.INST().gtk_tree_store_iter_depth(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Checks if the given iter is a valid iter for this `GtkTreeStore`.
     * <br>
     * <br>This function is slow. Only use it for debugging and/or testing
     * <br>purposes.
     * @param iter the iterator to check
     * @return %TRUE if the iter is valid, %FALSE if the iter is invalid.
    */
    public boolean iterIsValid(@Nonnull TreeIter iter)  {
        return JnaTreeStore.INST().gtk_tree_store_iter_is_valid(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Moves &#64;iter in &#64;tree_store to the position after &#64;position. &#64;iter and
     * <br>&#64;position should be in the same level. Note that this function only
     * <br>works with unsorted stores. If &#64;position is %NULL, &#64;iter will be moved
     * <br>to the start of the level.
     * @param iter A `GtkTreeIter`.
     * @param position A `GtkTreeIter`.
    */
    public void moveAfter(@Nonnull TreeIter iter, @Nullable TreeIter position)  {
        JnaTreeStore.INST().gtk_tree_store_move_after(asCPointer(), asCPointerNotNull(iter), asCPointer(position));
    }

    /**
     * Moves &#64;iter in &#64;tree_store to the position before &#64;position. &#64;iter and
     * <br>&#64;position should be in the same level. Note that this function only
     * <br>works with unsorted stores. If &#64;position is %NULL, &#64;iter will be
     * <br>moved to the end of the level.
     * @param iter A `GtkTreeIter`
     * @param position A `GtkTreeIter`
    */
    public void moveBefore(@Nonnull TreeIter iter, @Nullable TreeIter position)  {
        JnaTreeStore.INST().gtk_tree_store_move_before(asCPointer(), asCPointerNotNull(iter), asCPointer(position));
    }

    /**
     * Prepends a new row to &#64;tree_store.  If &#64;parent is non-%NULL, then it will prepend
     * <br>the new row before the first child of &#64;parent, otherwise it will prepend a row
     * <br>to the top level.  &#64;iter will be changed to point to this new row.  The row
     * <br>will be empty after this function is called.  To fill in values, you need to
     * <br>call gtk_tree_store_set() or gtk_tree_store_set_value().
     * @param iter An unset `GtkTreeIter` to set to the prepended row
     * @param parent A valid `GtkTreeIter`
    */
    public void prepend(@Nonnull TreeIter iter, @Nullable TreeIter parent)  {
        JnaTreeStore.INST().gtk_tree_store_prepend(asCPointer(), asCPointerNotNull(iter), asCPointer(parent));
    }

    /**
     * Removes &#64;iter from &#64;tree_store.  After being removed, &#64;iter is set to the
     * <br>next valid row at that level, or invalidated if it previously pointed to the
     * <br>last one.
     * @param iter A valid `GtkTreeIter`
     * @return %TRUE if &#64;iter is still valid, %FALSE if not.
    */
    public boolean remove(@Nonnull TreeIter iter)  {
        return JnaTreeStore.INST().gtk_tree_store_remove(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Reorders the children of &#64;parent in &#64;tree_store to follow the order
     * <br>indicated by &#64;new_order. Note that this function only works with
     * <br>unsorted stores.
     * @param parent A `GtkTreeIter`
     * @param new_order an array of integers mapping the new position of each child   to its old position before the re-ordering,   i.e. &#64;new_order`[newpos] = oldpos`.
    */
    public void reorder(@Nullable TreeIter parent, @Nonnull ch.bailu.gtk.type.Int new_order)  {
        JnaTreeStore.INST().gtk_tree_store_reorder(asCPointer(), asCPointer(parent), asCPointerNotNull(new_order));
    }

    /**
     * Sets the value of one or more cells in the row referenced by &#64;iter.
     * <br>The variable argument list should contain integer column numbers,
     * <br>each column number followed by the value to be set.
     * <br>The list is terminated by a -1. For example, to set column 0 with type
     * <br>%G_TYPE_STRING to “Foo”, you would write
     * <br>`gtk_tree_store_set (store, iter, 0, &quot;Foo&quot;, -1)`.
     * <br>
     * <br>The value will be referenced by the store if it is a %G_TYPE_OBJECT, and it
     * <br>will be copied if it is a %G_TYPE_STRING or %G_TYPE_BOXED.
     * @param iter A valid `GtkTreeIter` for the row being modified
     * @param _elipse pairs of column number and value, terminated with -1
    */
    public void set(@Nonnull TreeIter iter, java.lang.Object... _elipse)  {
        JnaTreeStore.INST().gtk_tree_store_set(asCPointer(), asCPointerNotNull(iter), _elipse);
    }

    /**
     * This function is meant primarily for `GObjects` that inherit from
     * <br>`GtkTreeStore`, and should only be used when constructing a new
     * <br>`GtkTreeStore`.  It will not function after a row has been added,
     * <br>or a method on the `GtkTreeModel` interface is called.
     * @param n_columns Number of columns for the tree store
     * @param types An array of `GType` types, one for each column
    */
    public void setColumnTypes(int n_columns, @Nonnull ch.bailu.gtk.type.Int64 types)  {
        JnaTreeStore.INST().gtk_tree_store_set_column_types(asCPointer(), n_columns, asCPointerNotNull(types));
    }

    /**
     * Sets the data in the cell specified by &#64;iter and &#64;column.
     * <br>The type of &#64;value must be convertible to the type of the
     * <br>column.
     * @param iter A valid `GtkTreeIter` for the row being modified
     * @param column column number to modify
     * @param value new value for the cell
    */
    public void setValue(@Nonnull TreeIter iter, int column, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        JnaTreeStore.INST().gtk_tree_store_set_value(asCPointer(), asCPointerNotNull(iter), column, asCPointerNotNull(value));
    }

    /**
     * Swaps &#64;a and &#64;b in the same level of &#64;tree_store. Note that this function
     * <br>only works with unsorted stores.
     * @param a A `GtkTreeIter`.
     * @param b Another `GtkTreeIter`.
    */
    public void swap(@Nonnull TreeIter a, @Nonnull TreeIter b)  {
        JnaTreeStore.INST().gtk_tree_store_swap(asCPointer(), asCPointerNotNull(a), asCPointerNotNull(b));
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link TreeDragDest}. Call this to get access to interface functions.
     * @return {@link TreeDragDest}
    */
    public TreeDragDest asTreeDragDest() {
        return new TreeDragDest(cast());
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
        return JnaTreeStore.INST().gtk_tree_store_get_type(); 
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

[MethodModel:java-type-not-supported:insertWithValuesv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:TreeIter:{c:GtkTreeIter*}}:{j:long}]
        [ParameterModel:Supported:{Gg:TreeIter:{c:GtkTreeIter*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GValue*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]

[MethodModel:java-type-not-supported:setValist:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:TreeIter:{c:GtkTreeIter*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:java-type-not-supported:setValuesv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:TreeIter:{c:GtkTreeIter*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GValue*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
*/
