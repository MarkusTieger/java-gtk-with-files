/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A list-like data structure that can be used with the [class&#64;Gtk.TreeView].
 * <br>
 * <br>The `GtkListStore` object is a list model for use with a `GtkTreeView`
 * <br>widget.  It implements the `GtkTreeModel` interface, and consequentialy,
 * <br>can use all of the methods available there.  It also implements the
 * <br>`GtkTreeSortable` interface so it can be sorted by the view.
 * <br>Finally, it also implements the tree
 * <br>[drag](iface.TreeDragSource.html) and [drop](iface.TreeDragDest.html)
 * <br>interfaces.
 * <br>
 * <br>The `GtkListStore` can accept most `GType`s as a column type, though
 * <br>it can’t accept all custom types.  Internally, it will keep a copy of
 * <br>data passed in (such as a string or a boxed pointer).  Columns that
 * <br>accept `GObject`s are handled a little differently.  The
 * <br>`GtkListStore` will keep a reference to the object instead of copying the
 * <br>value.  As a result, if the object is modified, it is up to the
 * <br>application writer to call [method&#64;Gtk.TreeModel.row_changed] to emit the
 * <br>[signal&#64;Gtk.TreeModel::row_changed] signal. This most commonly affects lists
 * <br>with [class&#64;Gdk.Texture]s stored.
 * <br>
 * <br>An example for creating a simple list store:
 * <br>
 * <br>```c
 * <br>enum {
 * <br>  COLUMN_STRING,
 * <br>  COLUMN_INT,
 * <br>  COLUMN_BOOLEAN,
 * <br>  N_COLUMNS
 * <br>};
 * <br>
 * <br>{
 * <br>  GtkListStore *list_store;
 * <br>  GtkTreePath *path;
 * <br>  GtkTreeIter iter;
 * <br>  int i;
 * <br>
 * <br>  list_store = gtk_list_store_new (N_COLUMNS,
 * <br>                                   G_TYPE_STRING,
 * <br>                                   G_TYPE_INT,
 * <br>                                   G_TYPE_BOOLEAN);
 * <br>
 * <br>  for (i = 0; i &lt; 10; i++)
 * <br>    {
 * <br>      char *some_data;
 * <br>
 * <br>      some_data = get_some_data (i);
 * <br>
 * <br>      // Add a new row to the model
 * <br>      gtk_list_store_append (list_store, &amp;iter);
 * <br>      gtk_list_store_set (list_store, &amp;iter,
 * <br>                          COLUMN_STRING, some_data,
 * <br>                          COLUMN_INT, i,
 * <br>                          COLUMN_BOOLEAN,  FALSE,
 * <br>                          -1);
 * <br>
 * <br>      // As the store will keep a copy of the string internally,
 * <br>      // we free some_data.
 * <br>      g_free (some_data);
 * <br>    }
 * <br>
 * <br>  // Modify a particular row
 * <br>  path = gtk_tree_path_new_from_string (&quot;4&quot;);
 * <br>  gtk_tree_model_get_iter (GTK_TREE_MODEL (list_store),
 * <br>                           &amp;iter,
 * <br>                           path);
 * <br>  gtk_tree_path_free (path);
 * <br>  gtk_list_store_set (list_store, &amp;iter,
 * <br>                      COLUMN_BOOLEAN, TRUE,
 * <br>                      -1);
 * <br>}
 * <br>```
 * <br>
 * <br>&#35; Performance Considerations
 * <br>
 * <br>Internally, the `GtkListStore` was originally implemented with a linked list
 * <br>with a tail pointer.  As a result, it was fast at data insertion and deletion,
 * <br>and not fast at random data access.  The `GtkListStore` sets the
 * <br>`GTK_TREE_MODEL_ITERS_PERSIST` flag, which means that `GtkTreeIter`s can be
 * <br>cached while the row exists.  Thus, if access to a particular row is needed
 * <br>often and your code is expected to run on older versions of GTK, it is worth
 * <br>keeping the iter around.
 * <br>
 * <br>&#35; Atomic Operations
 * <br>
 * <br>It is important to note that only the methods
 * <br>gtk_list_store_insert_with_values() and gtk_list_store_insert_with_valuesv()
 * <br>are atomic, in the sense that the row is being appended to the store and the
 * <br>values filled in in a single operation with regard to `GtkTreeModel` signaling.
 * <br>In contrast, using e.g. gtk_list_store_append() and then gtk_list_store_set()
 * <br>will first create a row, which triggers the `GtkTreeModel::row-inserted` signal
 * <br>on `GtkListStore`. The row, however, is still empty, and any signal handler
 * <br>connecting to `GtkTreeModel::row-inserted` on this particular store should be prepared
 * <br>for the situation that the row might be empty. This is especially important
 * <br>if you are wrapping the `GtkListStore` inside a `GtkTreeModel`Filter and are
 * <br>using a `GtkTreeModel`FilterVisibleFunc. Using any of the non-atomic operations
 * <br>to append rows to the `GtkListStore` will cause the
 * <br>`GtkTreeModel`FilterVisibleFunc to be visited with an empty row first; the
 * <br>function must be prepared for that.
 * <br>
 * <br>&#35; GtkListStore as GtkBuildable
 * <br>
 * <br>The GtkListStore implementation of the [iface&#64;Gtk.Buildable] interface allows
 * <br>to specify the model columns with a `&lt;columns&gt;` element that may contain
 * <br>multiple `&lt;column&gt;` elements, each specifying one model column. The “type”
 * <br>attribute specifies the data type for the column.
 * <br>
 * <br>Additionally, it is possible to specify content for the list store
 * <br>in the UI definition, with the `&lt;data&gt;` element. It can contain multiple
 * <br>`&lt;row&gt;` elements, each specifying to content for one row of the list model.
 * <br>Inside a `&lt;row&gt;`, the `&lt;col&gt;` elements specify the content for individual cells.
 * <br>
 * <br>Note that it is probably more common to define your models in the code,
 * <br>and one might consider it a layering violation to specify the content of
 * <br>a list store in a UI definition, data, not presentation, and common wisdom
 * <br>is to separate the two, as far as possible.
 * <br>
 * <br>An example of a UI Definition fragment for a list store:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkListStore&quot;&gt;
 * <br>  &lt;columns&gt;
 * <br>    &lt;column type=&quot;gchararray&quot;/&gt;
 * <br>    &lt;column type=&quot;gchararray&quot;/&gt;
 * <br>    &lt;column type=&quot;gint&quot;/&gt;
 * <br>  &lt;/columns&gt;
 * <br>  &lt;data&gt;
 * <br>    &lt;row&gt;
 * <br>      &lt;col id=&quot;0&quot;&gt;John&lt;/col&gt;
 * <br>      &lt;col id=&quot;1&quot;&gt;Doe&lt;/col&gt;
 * <br>      &lt;col id=&quot;2&quot;&gt;25&lt;/col&gt;
 * <br>    &lt;/row&gt;
 * <br>    &lt;row&gt;
 * <br>      &lt;col id=&quot;0&quot;&gt;Johan&lt;/col&gt;
 * <br>      &lt;col id=&quot;1&quot;&gt;Dahlin&lt;/col&gt;
 * <br>      &lt;col id=&quot;2&quot;&gt;50&lt;/col&gt;
 * <br>    &lt;/row&gt;
 * <br>  &lt;/data&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.ListStore.html">https://docs.gtk.org/gtk4/class.ListStore.html</a></p>
*/
public class ListStore extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ListStore.class.getCanonicalName());
    }

    public ListStore(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Non-vararg creation function.  Used primarily by language bindings.
     * @param n_columns number of columns in the list store
     * @param types an array of `GType` types for the columns, from first to last
     * @return a new `GtkListStore`
    */
    public static ListStore newvListStore(int n_columns, @Nonnull ch.bailu.gtk.type.Int64 types)  {
        PointerContainer __self = cast(JnaListStore.INST().gtk_list_store_newv(n_columns, asCPointerNotNull(types)));
        if (__self.isNull()) {
            throw new NullPointerException("ListStore:newv");
        }
        return new ListStore(__self);
    }        
    

    /**
     * Creates a new list store as with &#64;n_columns columns each of the types passed
     * <br>in.  Note that only types derived from standard GObject fundamental types
     * <br>are supported.
     * <br>
     * <br>As an example, `gtk_list_store_new (3, G_TYPE_INT, G_TYPE_STRING,
     * <br>GDK_TYPE_TEXTURE);` will create a new `GtkListStore` with three columns, of type
     * <br>int, string and `GdkTexture`, respectively.
     * @param n_columns number of columns in the list store
     * @param _elipse all `GType` types for the columns, from first to last
    */
    public ListStore(int n_columns, java.lang.Object... _elipse) {
        super(cast(JnaListStore.INST().gtk_list_store_new(n_columns, _elipse)));
    }

    /**
     * Appends a new row to &#64;list_store.  &#64;iter will be changed to point to this new
     * <br>row.  The row will be empty after this function is called.  To fill in
     * <br>values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     * @param iter An unset `GtkTreeIter` to set to the appended row
    */
    public void append(@Nonnull TreeIter iter)  {
        JnaListStore.INST().gtk_list_store_append(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Removes all rows from the list store.
    */
    public void clear()  {
        JnaListStore.INST().gtk_list_store_clear(asCPointer());
    }

    /**
     * Creates a new row at &#64;position.  &#64;iter will be changed to point to this new
     * <br>row.  If &#64;position is -1 or is larger than the number of rows on the list,
     * <br>then the new row will be appended to the list. The row will be empty after
     * <br>this function is called.  To fill in values, you need to call
     * <br>gtk_list_store_set() or gtk_list_store_set_value().
     * @param iter An unset `GtkTreeIter` to set to the new row
     * @param position position to insert the new row, or -1 for last
    */
    public void insert(@Nonnull TreeIter iter, int position)  {
        JnaListStore.INST().gtk_list_store_insert(asCPointer(), asCPointerNotNull(iter), position);
    }

    /**
     * Inserts a new row after &#64;sibling. If &#64;sibling is %NULL, then the row will be
     * <br>prepended to the beginning of the list. &#64;iter will be changed to point to
     * <br>this new row. The row will be empty after this function is called. To fill
     * <br>in values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     * @param iter An unset `GtkTreeIter` to set to the new row
     * @param sibling A valid `GtkTreeIter`
    */
    public void insertAfter(@Nonnull TreeIter iter, @Nullable TreeIter sibling)  {
        JnaListStore.INST().gtk_list_store_insert_after(asCPointer(), asCPointerNotNull(iter), asCPointer(sibling));
    }

    /**
     * Inserts a new row before &#64;sibling. If &#64;sibling is %NULL, then the row will
     * <br>be appended to the end of the list. &#64;iter will be changed to point to this
     * <br>new row. The row will be empty after this function is called. To fill in
     * <br>values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     * @param iter An unset `GtkTreeIter` to set to the new row
     * @param sibling A valid `GtkTreeIter`
    */
    public void insertBefore(@Nonnull TreeIter iter, @Nullable TreeIter sibling)  {
        JnaListStore.INST().gtk_list_store_insert_before(asCPointer(), asCPointerNotNull(iter), asCPointer(sibling));
    }

    /**
     * Creates a new row at &#64;position. &#64;iter will be changed to point to this new
     * <br>row. If &#64;position is -1, or larger than the number of rows in the list, then
     * <br>the new row will be appended to the list. The row will be filled with the
     * <br>values given to this function.
     * <br>
     * <br>Calling
     * <br>`gtk_list_store_insert_with_values (list_store, iter, position...)`
     * <br>has the same effect as calling:
     * <br>
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     * static void
     * insert_value (GtkListStore *list_store,
     *               GtkTreeIter  *iter,
     *               int           position)
     * {
     *   gtk_list_store_insert (list_store, iter, position);
     *   gtk_list_store_set (list_store,
     *                       iter
     *                       // ...
     *                       );
     * }
     * </pre>
     * <br>
     * <br>with the difference that the former will only emit `GtkTreeModel`::row-inserted
     * <br>once, while the latter will emit `GtkTreeModel`::row-inserted,
     * <br>`GtkTreeModel`::row-changed and, if the list store is sorted,
     * <br>`GtkTreeModel`::rows-reordered for every inserted value.
     * <br>
     * <br>Since emitting the `GtkTreeModel::rows-reordered` signal repeatedly can
     * <br>affect the performance of the program, gtk_list_store_insert_with_values()
     * <br>should generally be preferred when inserting rows in a sorted list store.
     * @param iter An unset `GtkTreeIter` to set to the new row
     * @param position position to insert the new row, or -1 to append after existing    rows
     * @param _elipse pairs of column number and value, terminated with -1
    */
    public void insertWithValues(@Nullable TreeIter iter, int position, java.lang.Object... _elipse)  {
        JnaListStore.INST().gtk_list_store_insert_with_values(asCPointer(), asCPointer(iter), position, _elipse);
    }

    /**
     * Checks if the given iter is a valid iter for this `GtkListStore`.
     * <br>
     * <br>This function is slow. Only use it for debugging and/or testing
     * <br>purposes.
     * @param iter the iterator to check
     * @return %TRUE if the iter is valid, %FALSE if the iter is invalid.
    */
    public boolean iterIsValid(@Nonnull TreeIter iter)  {
        return JnaListStore.INST().gtk_list_store_iter_is_valid(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Moves &#64;iter in &#64;store to the position after &#64;position. Note that this
     * <br>function only works with unsorted stores. If &#64;position is %NULL, &#64;iter
     * <br>will be moved to the start of the list.
     * @param iter A `GtkTreeIter`
     * @param position A `GtkTreeIter`
    */
    public void moveAfter(@Nonnull TreeIter iter, @Nullable TreeIter position)  {
        JnaListStore.INST().gtk_list_store_move_after(asCPointer(), asCPointerNotNull(iter), asCPointer(position));
    }

    /**
     * Moves &#64;iter in &#64;store to the position before &#64;position. Note that this
     * <br>function only works with unsorted stores. If &#64;position is %NULL, &#64;iter
     * <br>will be moved to the end of the list.
     * @param iter A `GtkTreeIter`
     * @param position A `GtkTreeIter`
    */
    public void moveBefore(@Nonnull TreeIter iter, @Nullable TreeIter position)  {
        JnaListStore.INST().gtk_list_store_move_before(asCPointer(), asCPointerNotNull(iter), asCPointer(position));
    }

    /**
     * Prepends a new row to &#64;list_store. &#64;iter will be changed to point to this new
     * <br>row. The row will be empty after this function is called. To fill in
     * <br>values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     * @param iter An unset `GtkTreeIter` to set to the prepend row
    */
    public void prepend(@Nonnull TreeIter iter)  {
        JnaListStore.INST().gtk_list_store_prepend(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Removes the given row from the list store.  After being removed,
     * <br>&#64;iter is set to be the next valid row, or invalidated if it pointed
     * <br>to the last row in &#64;list_store.
     * @param iter A valid `GtkTreeIter`
     * @return %TRUE if &#64;iter is valid, %FALSE if not.
    */
    public boolean remove(@Nonnull TreeIter iter)  {
        return JnaListStore.INST().gtk_list_store_remove(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Reorders &#64;store to follow the order indicated by &#64;new_order. Note that
     * <br>this function only works with unsorted stores.
     * @param new_order an array of integers mapping the new   position of each child to its old position before the re-ordering,   i.e. &#64;new_order`[newpos] = oldpos`. It must have   exactly as many items as the list store’s length.
    */
    public void reorder(@Nonnull ch.bailu.gtk.type.Int new_order)  {
        JnaListStore.INST().gtk_list_store_reorder(asCPointer(), asCPointerNotNull(new_order));
    }

    /**
     * Sets the value of one or more cells in the row referenced by &#64;iter.
     * <br>The variable argument list should contain integer column numbers,
     * <br>each column number followed by the value to be set.
     * <br>The list is terminated by a -1. For example, to set column 0 with type
     * <br>%G_TYPE_STRING to “Foo”, you would write `gtk_list_store_set (store, iter,
     * <br>0, &quot;Foo&quot;, -1)`.
     * <br>
     * <br>The value will be referenced by the store if it is a %G_TYPE_OBJECT, and it
     * <br>will be copied if it is a %G_TYPE_STRING or %G_TYPE_BOXED.
     * @param iter row iterator
     * @param _elipse pairs of column number and value, terminated with -1
    */
    public void set(@Nonnull TreeIter iter, java.lang.Object... _elipse)  {
        JnaListStore.INST().gtk_list_store_set(asCPointer(), asCPointerNotNull(iter), _elipse);
    }

    /**
     * This function is meant primarily for `GObject`s that inherit from `GtkListStore`,
     * <br>and should only be used when constructing a new `GtkListStore`.  It will not
     * <br>function after a row has been added, or a method on the `GtkTreeModel`
     * <br>interface is called.
     * @param n_columns Number of columns for the list store
     * @param types An array length n of `GType`s
    */
    public void setColumnTypes(int n_columns, @Nonnull ch.bailu.gtk.type.Int64 types)  {
        JnaListStore.INST().gtk_list_store_set_column_types(asCPointer(), n_columns, asCPointerNotNull(types));
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
        JnaListStore.INST().gtk_list_store_set_value(asCPointer(), asCPointerNotNull(iter), column, asCPointerNotNull(value));
    }

    /**
     * Swaps &#64;a and &#64;b in &#64;store. Note that this function only works with
     * <br>unsorted stores.
     * @param a A `GtkTreeIter`
     * @param b Another `GtkTreeIter`
    */
    public void swap(@Nonnull TreeIter a, @Nonnull TreeIter b)  {
        JnaListStore.INST().gtk_list_store_swap(asCPointer(), asCPointerNotNull(a), asCPointerNotNull(b));
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
        return JnaListStore.INST().gtk_list_store_get_type(); 
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
