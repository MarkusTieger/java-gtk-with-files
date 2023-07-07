/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSelectionModel` is an interface that add support for selection to list models.
 * <br>
 * <br>This support is then used by widgets using list models to add the ability
 * <br>to select and unselect various items.
 * <br>
 * <br>GTK provides default implementations of the most common selection modes such
 * <br>as [class&#64;Gtk.SingleSelection], so you will only need to implement this
 * <br>interface if you want detailed control about how selections should be handled.
 * <br>
 * <br>A `GtkSelectionModel` supports a single boolean per item indicating if an item is
 * <br>selected or not. This can be queried via [method&#64;Gtk.SelectionModel.is_selected].
 * <br>When the selected state of one or more items changes, the model will emit the
 * <br>[signal&#64;Gtk.SelectionModel::selection-changed] signal by calling the
 * <br>[method&#64;Gtk.SelectionModel.selection_changed] function. The positions given
 * <br>in that signal may have their selection state changed, though that is not a
 * <br>requirement. If new items added to the model via the
 * <br>[signal&#64;Gio.ListModel::items-changed] signal are selected or not is up to the
 * <br>implementation.
 * <br>
 * <br>Note that items added via [signal&#64;Gio.ListModel::items-changed] may already
 * <br>be selected and no [signal&#64;Gtk.SelectionModel::selection-changed] will be
 * <br>emitted for them. So to track which items are selected, it is necessary to
 * <br>listen to both signals.
 * <br>
 * <br>Additionally, the interface can expose functionality to select and unselect
 * <br>items. If these functions are implemented, GTK's list widgets will allow users
 * <br>to select and unselect items. However, `GtkSelectionModel`s are free to only
 * <br>implement them partially or not at all. In that case the widgets will not
 * <br>support the unimplemented operations.
 * <br>
 * <br>When selecting or unselecting is supported by a model, the return values of
 * <br>the selection functions do *not* indicate if selection or unselection happened.
 * <br>They are only meant to indicate complete failure, like when this mode of
 * <br>selecting is not supported by the model.
 * <br>
 * <br>Selections may happen asynchronously, so the only reliable way to find out
 * <br>when an item was selected is to listen to the signals that indicate selection.
 * <p><a href="https://docs.gtk.org/gtk4/iface.SelectionModel.html">https://docs.gtk.org/gtk4/iface.SelectionModel.html</a></p>
*/
public class SelectionModel extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SelectionModel.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnSelectionChanged {
        /**
         * Emitted when the selection state of some of the items in &#64;model changes.
         * <br>
         * <br>Note that this signal does not specify the new selection state of the
         * <br>items, they need to be queried manually. It is also not necessary for
         * <br>a model to change the selection state of any of the items in the selection
         * <br>model, though it would be rather useless to emit such a signal.
         * @param position The first item that may have changed
         * @param n_items number of items with changes
        */
        void onSelectionChanged(int position, int n_items);
    }
    
    private static com.sun.jna.Callback toOnSelectionChanged(OnSelectionChanged in) {
        return (in == null) ? null: (JnaSelectionModel.OnSelectionChanged) (__self, _position, _n_items, __data) -> in.onSelectionChanged(_position, _n_items);
    }

    public SelectionModel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the set containing all currently selected items in the model.
     * <br>
     * <br>This function may be slow, so if you are only interested in single item,
     * <br>consider using [method&#64;Gtk.SelectionModel.is_selected] or if you are only
     * <br>interested in a few, consider [method&#64;Gtk.SelectionModel.get_selection_in_range].
     * @return a `GtkBitset` containing all the values currently   selected in &#64;model. If no items are selected, the bitset is empty.   The bitset must not be modified.
    */
    public Bitset getSelection()  {
        return new Bitset(new PointerContainer(JnaSelectionModel.INST().gtk_selection_model_get_selection(asCPointer())));
    }

    /**
     * Gets the set of selected items in a range.
     * <br>
     * <br>This function is an optimization for
     * <br>[method&#64;Gtk.SelectionModel.get_selection] when you are only
     * <br>interested in part of the model's selected state. A common use
     * <br>case is in response to the [signal&#64;Gtk.SelectionModel::selection-changed]
     * <br>signal.
     * @param position start of the queired range
     * @param n_items number of items in the queried range
     * @return A `GtkBitset` that matches the selection state   for the given range with all other values being undefined.   The bitset must not be modified.
    */
    public Bitset getSelectionInRange(int position, int n_items)  {
        return new Bitset(new PointerContainer(JnaSelectionModel.INST().gtk_selection_model_get_selection_in_range(asCPointer(), position, n_items)));
    }

    /**
     * Checks if the given item is selected.
     * @param position the position of the item to query
     * @return %TRUE if the item is selected
    */
    public boolean isSelected(int position)  {
        return JnaSelectionModel.INST().gtk_selection_model_is_selected(asCPointer(), position);
    }

    /**
     * Requests to select all items in the model.
     * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean that all items are now selected.
    */
    public boolean selectAll()  {
        return JnaSelectionModel.INST().gtk_selection_model_select_all(asCPointer());
    }

    /**
     * Requests to select an item in the model.
     * @param position the position of the item to select
     * @param unselect_rest whether previously selected items should be unselected
     * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean the item was selected.
    */
    public boolean selectItem(int position, boolean unselect_rest)  {
        return JnaSelectionModel.INST().gtk_selection_model_select_item(asCPointer(), position, unselect_rest);
    }

    /**
     * Requests to select a range of items in the model.
     * @param position the first item to select
     * @param n_items the number of items to select
     * @param unselect_rest whether previously selected items should be unselected
     * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean the range was selected.
    */
    public boolean selectRange(int position, int n_items, boolean unselect_rest)  {
        return JnaSelectionModel.INST().gtk_selection_model_select_range(asCPointer(), position, n_items, unselect_rest);
    }

    /**
     * Helper function for implementations of `GtkSelectionModel`.
     * <br>
     * <br>Call this when a the selection changes to emit the
     * <br>[signal&#64;Gtk.SelectionModel::selection-changed] signal.
     * @param position the first changed item
     * @param n_items the number of changed items
    */
    public void selectionChanged(int position, int n_items)  {
        JnaSelectionModel.INST().gtk_selection_model_selection_changed(asCPointer(), position, n_items);
    }

    /**
     * Make selection changes.
     * <br>
     * <br>This is the most advanced selection updating method that allows
     * <br>the most fine-grained control over selection changes. If you can,
     * <br>you should try the simpler versions, as implementations are more
     * <br>likely to implement support for those.
     * <br>
     * <br>Requests that the selection state of all positions set in &#64;mask
     * <br>be updated to the respective value in the &#64;selected bitmask.
     * <br>
     * <br>In pseudocode, it would look something like this:
     * <br>
     * <br>```c
     * <br>for (i = 0; i &lt; n_items; i++)
     * <br>  {
     * <br>    // don't change values not in the mask
     * <br>    if (!gtk_bitset_contains (mask, i))
     * <br>      continue;
     * <br>
     * <br>    if (gtk_bitset_contains (selected, i))
     * <br>      select_item (i);
     * <br>    else
     * <br>      unselect_item (i);
     * <br>  }
     * <br>
     * <br>gtk_selection_model_selection_changed (model,
     * <br>                                       first_changed_item,
     * <br>                                       n_changed_items);
     * <br>```
     * <br>
     * <br>&#64;mask and &#64;selected must not be modified. They may refer to the
     * <br>same bitset, which would mean that every item in the set should
     * <br>be selected.
     * @param selected bitmask specifying if items should be selected or unselected
     * @param mask bitmask specifying which items should be updated
     * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean that all items were updated according   to the inputs.
    */
    public boolean setSelection(@Nonnull Bitset selected, @Nonnull Bitset mask)  {
        return JnaSelectionModel.INST().gtk_selection_model_set_selection(asCPointer(), asCPointerNotNull(selected), asCPointerNotNull(mask));
    }

    /**
     * Requests to unselect all items in the model.
     * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean that all items are now unselected.
    */
    public boolean unselectAll()  {
        return JnaSelectionModel.INST().gtk_selection_model_unselect_all(asCPointer());
    }

    /**
     * Requests to unselect an item in the model.
     * @param position the position of the item to unselect
     * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean the item was unselected.
    */
    public boolean unselectItem(int position)  {
        return JnaSelectionModel.INST().gtk_selection_model_unselect_item(asCPointer(), position);
    }

    /**
     * Requests to unselect a range of items in the model.
     * @param position the first item to unselect
     * @param n_items the number of items to unselect
     * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean the range was unselected.
    */
    public boolean unselectRange(int position, int n_items)  {
        return JnaSelectionModel.INST().gtk_selection_model_unselect_range(asCPointer(), position, n_items);
    }

    public final static String SIGNAL_ON_SELECTION_CHANGED = "selection-changed";
    
    /**
     * Connect to signal "selection-changed".
     * <br>See {@link OnSelectionChanged#onSelectionChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_SELECTION_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSelectionChanged(OnSelectionChanged signal) {
        return connectSignal(SIGNAL_ON_SELECTION_CHANGED, toOnSelectionChanged(signal));
    }

    public static long getTypeID() { 
        return JnaSelectionModel.INST().gtk_selection_model_get_type(); 
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
