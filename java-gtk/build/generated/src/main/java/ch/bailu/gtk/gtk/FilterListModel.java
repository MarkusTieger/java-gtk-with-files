/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkFilterListModel` is a list model that filters the elements of
 * <br>the underlying model according to a `GtkFilter`.
 * <br>
 * <br>It hides some elements from the other model according to
 * <br>criteria given by a `GtkFilter`.
 * <br>
 * <br>The model can be set up to do incremental searching, so that
 * <br>filtering long lists doesn't block the UI. See
 * <br>[method&#64;Gtk.FilterListModel.set_incremental] for details.
 * <p><a href="https://docs.gtk.org/gtk4/class.FilterListModel.html">https://docs.gtk.org/gtk4/class.FilterListModel.html</a></p>
*/
public class FilterListModel extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FilterListModel.class.getCanonicalName());
    }

    public FilterListModel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkFilterListModel` that will filter &#64;model using the given
     * <br>&#64;filter.
     * @param model the model to sort
     * @param filter filter
    */
    public FilterListModel(@Nullable ch.bailu.gtk.gio.ListModel model, @Nullable Filter filter) {
        super(cast(JnaFilterListModel.INST().gtk_filter_list_model_new(asCPointer(model), asCPointer(filter))));
    }

    /**
     * Gets the `GtkFilter` currently set on &#64;self.
     * @return The filter currently in use
    */
    public Filter getFilter()  {
        return new Filter(new PointerContainer(JnaFilterListModel.INST().gtk_filter_list_model_get_filter(asCPointer())));
    }

    /**
     * Returns whether incremental filtering is enabled.
     * <br>
     * <br>See [method&#64;Gtk.FilterListModel.set_incremental].
     * @return %TRUE if incremental filtering is enabled
    */
    public boolean getIncremental()  {
        return JnaFilterListModel.INST().gtk_filter_list_model_get_incremental(asCPointer());
    }

    /**
     * Gets the model currently filtered or %NULL if none.
     * @return The model that gets filtered
    */
    public ch.bailu.gtk.gio.ListModel getModel()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaFilterListModel.INST().gtk_filter_list_model_get_model(asCPointer())));
    }

    /**
     * Returns the number of items that have not been filtered yet.
     * <br>
     * <br>You can use this value to check if &#64;self is busy filtering by
     * <br>comparing the return value to 0 or you can compute the percentage
     * <br>of the filter remaining by dividing the return value by the total
     * <br>number of items in the underlying model:
     * <br>
     * <br>```c
     * <br>pending = gtk_filter_list_model_get_pending (self);
     * <br>model = gtk_filter_list_model_get_model (self);
     * <br>percentage = pending / (double) g_list_model_get_n_items (model);
     * <br>```
     * <br>
     * <br>If no filter operation is ongoing - in particular when
     * <br>[property&#64;Gtk.FilterListModel:incremental] is %FALSE - this
     * <br>function returns 0.
     * @return The number of items not yet filtered
    */
    public int getPending()  {
        return JnaFilterListModel.INST().gtk_filter_list_model_get_pending(asCPointer());
    }

    /**
     * Sets the filter used to filter items.
     * @param filter filter to use
    */
    public void setFilter(@Nullable Filter filter)  {
        JnaFilterListModel.INST().gtk_filter_list_model_set_filter(asCPointer(), asCPointer(filter));
    }

    /**
     * Sets the filter model to do an incremental sort.
     * <br>
     * <br>When incremental filtering is enabled, the `GtkFilterListModel` will not
     * <br>run filters immediately, but will instead queue an idle handler that
     * <br>incrementally filters the items and adds them to the list. This of course
     * <br>means that items are not instantly added to the list, but only appear
     * <br>incrementally.
     * <br>
     * <br>When your filter blocks the UI while filtering, you might consider
     * <br>turning this on. Depending on your model and filters, this may become
     * <br>interesting around 10,000 to 100,000 items.
     * <br>
     * <br>By default, incremental filtering is disabled.
     * <br>
     * <br>See [method&#64;Gtk.FilterListModel.get_pending] for progress information
     * <br>about an ongoing incremental filtering operation.
     * @param incremental %TRUE to enable incremental filtering
    */
    public void setIncremental(boolean incremental)  {
        JnaFilterListModel.INST().gtk_filter_list_model_set_incremental(asCPointer(), incremental);
    }

    /**
     * Sets the model to be filtered.
     * <br>
     * <br>Note that GTK makes no effort to ensure that &#64;model conforms to
     * <br>the item type of &#64;self. It assumes that the caller knows what they
     * <br>are doing and have set up an appropriate filter to ensure that item
     * <br>types match.
     * @param model The model to be filtered
    */
    public void setModel(@Nullable ch.bailu.gtk.gio.ListModel model)  {
        JnaFilterListModel.INST().gtk_filter_list_model_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    public static long getTypeID() { 
        return JnaFilterListModel.INST().gtk_filter_list_model_get_type(); 
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
