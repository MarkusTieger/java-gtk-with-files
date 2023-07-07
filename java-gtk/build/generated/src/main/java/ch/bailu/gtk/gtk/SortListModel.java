/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GListModel` that sorts the elements of an underlying model
 * <br>according to a `GtkSorter`.
 * <br>
 * <br>The model is a stable sort. If two items compare equal according
 * <br>to the sorter, the one that appears first in the original model will
 * <br>also appear first after sorting.
 * <br>Note that if you change the sorter, the previous order will have no
 * <br>influence on the new order. If you want that, consider using a
 * <br>`GtkMultiSorter` and appending the previous sorter to it.
 * <br>
 * <br>The model can be set up to do incremental sorting, so that
 * <br>sorting long lists doesn't block the UI. See
 * <br>[method&#64;Gtk.SortListModel.set_incremental] for details.
 * <br>
 * <br>`GtkSortListModel` is a generic model and because of that it
 * <br>cannot take advantage of any external knowledge when sorting.
 * <br>If you run into performance issues with `GtkSortListModel`,
 * <br>it is strongly recommended that you write your own sorting list
 * <br>model.
 * <p><a href="https://docs.gtk.org/gtk4/class.SortListModel.html">https://docs.gtk.org/gtk4/class.SortListModel.html</a></p>
*/
public class SortListModel extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SortListModel.class.getCanonicalName());
    }

    public SortListModel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new sort list model that uses the &#64;sorter to sort &#64;model.
     * @param model the model to sort
     * @param sorter the `GtkSorter` to sort &#64;model with,
    */
    public SortListModel(@Nullable ch.bailu.gtk.gio.ListModel model, @Nullable Sorter sorter) {
        super(cast(JnaSortListModel.INST().gtk_sort_list_model_new(asCPointer(model), asCPointer(sorter))));
    }

    /**
     * Returns whether incremental sorting is enabled.
     * <br>
     * <br>See [method&#64;Gtk.SortListModel.set_incremental].
     * @return %TRUE if incremental sorting is enabled
    */
    public boolean getIncremental()  {
        return JnaSortListModel.INST().gtk_sort_list_model_get_incremental(asCPointer());
    }

    /**
     * Gets the model currently sorted or %NULL if none.
     * @return The model that gets sorted
    */
    public ch.bailu.gtk.gio.ListModel getModel()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaSortListModel.INST().gtk_sort_list_model_get_model(asCPointer())));
    }

    /**
     * Estimates progress of an ongoing sorting operation.
     * <br>
     * <br>The estimate is the number of items that would still need to be
     * <br>sorted to finish the sorting operation if this was a linear
     * <br>algorithm. So this number is not related to how many items are
     * <br>already correctly sorted.
     * <br>
     * <br>If you want to estimate the progress, you can use code like this:
     * <br>```c
     * <br>pending = gtk_sort_list_model_get_pending (self);
     * <br>model = gtk_sort_list_model_get_model (self);
     * <br>progress = 1.0 - pending / (double) MAX (1, g_list_model_get_n_items (model));
     * <br>```
     * <br>
     * <br>If no sort operation is ongoing - in particular when
     * <br>[property&#64;Gtk.SortListModel:incremental] is %FALSE - this
     * <br>function returns 0.
     * @return a progress estimate of remaining items to sort
    */
    public int getPending()  {
        return JnaSortListModel.INST().gtk_sort_list_model_get_pending(asCPointer());
    }

    /**
     * Gets the sorter that is used to sort &#64;self.
     * @return the sorter of &#35;self
    */
    public Sorter getSorter()  {
        return new Sorter(new PointerContainer(JnaSortListModel.INST().gtk_sort_list_model_get_sorter(asCPointer())));
    }

    /**
     * Sets the sort model to do an incremental sort.
     * <br>
     * <br>When incremental sorting is enabled, the `GtkSortListModel` will not do
     * <br>a complete sort immediately, but will instead queue an idle handler that
     * <br>incrementally sorts the items towards their correct position. This of
     * <br>course means that items do not instantly appear in the right place. It
     * <br>also means that the total sorting time is a lot slower.
     * <br>
     * <br>When your filter blocks the UI while sorting, you might consider
     * <br>turning this on. Depending on your model and sorters, this may become
     * <br>interesting around 10,000 to 100,000 items.
     * <br>
     * <br>By default, incremental sorting is disabled.
     * <br>
     * <br>See [method&#64;Gtk.SortListModel.get_pending] for progress information
     * <br>about an ongoing incremental sorting operation.
     * @param incremental %TRUE to sort incrementally
    */
    public void setIncremental(boolean incremental)  {
        JnaSortListModel.INST().gtk_sort_list_model_set_incremental(asCPointer(), incremental);
    }

    /**
     * Sets the model to be sorted.
     * <br>
     * <br>The &#64;model's item type must conform to the item type of &#64;self.
     * @param model The model to be sorted
    */
    public void setModel(@Nullable ch.bailu.gtk.gio.ListModel model)  {
        JnaSortListModel.INST().gtk_sort_list_model_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Sets a new sorter on &#64;self.
     * @param sorter the `GtkSorter` to sort &#64;model with
    */
    public void setSorter(@Nullable Sorter sorter)  {
        JnaSortListModel.INST().gtk_sort_list_model_set_sorter(asCPointer(), asCPointer(sorter));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    public static long getTypeID() { 
        return JnaSortListModel.INST().gtk_sort_list_model_get_type(); 
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
