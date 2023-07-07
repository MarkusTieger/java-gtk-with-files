/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSingleSelection` is a `GtkSelectionModel` that allows selecting a single
 * <br>item.
 * <br>
 * <br>Note that the selection is *persistent* -- if the selected item is removed
 * <br>and re-added in the same [signal&#64;Gio.ListModel::items-changed] emission, it
 * <br>stays selected. In particular, this means that changing the sort order of an
 * <br>underlying sort model will preserve the selection.
 * <p><a href="https://docs.gtk.org/gtk4/class.SingleSelection.html">https://docs.gtk.org/gtk4/class.SingleSelection.html</a></p>
*/
public class SingleSelection extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SingleSelection.class.getCanonicalName());
    }

    public SingleSelection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new selection to handle &#64;model.
     * @param model the `GListModel` to manage
    */
    public SingleSelection(@Nullable ch.bailu.gtk.gio.ListModel model) {
        super(cast(JnaSingleSelection.INST().gtk_single_selection_new(asCPointer(model))));
    }

    /**
     * Checks if autoselect has been enabled or disabled via
     * <br>gtk_single_selection_set_autoselect().
     * @return %TRUE if autoselect is enabled
    */
    public boolean getAutoselect()  {
        return JnaSingleSelection.INST().gtk_single_selection_get_autoselect(asCPointer());
    }

    /**
     * If %TRUE, gtk_selection_model_unselect_item() is supported and allows
     * <br>unselecting the selected item.
     * @return %TRUE to support unselecting
    */
    public boolean getCanUnselect()  {
        return JnaSingleSelection.INST().gtk_single_selection_get_can_unselect(asCPointer());
    }

    /**
     * Gets the model that &#64;self is wrapping.
     * @return The model being wrapped
    */
    public ch.bailu.gtk.gio.ListModel getModel()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaSingleSelection.INST().gtk_single_selection_get_model(asCPointer())));
    }

    /**
     * Gets the position of the selected item.
     * <br>
     * <br>If no item is selected, %GTK_INVALID_LIST_POSITION is returned.
     * @return The position of the selected item
    */
    public int getSelected()  {
        return JnaSingleSelection.INST().gtk_single_selection_get_selected(asCPointer());
    }

    /**
     * Gets the selected item.
     * <br>
     * <br>If no item is selected, %NULL is returned.
     * @return The selected item
    */
    public ch.bailu.gtk.type.Pointer getSelectedItem()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaSingleSelection.INST().gtk_single_selection_get_selected_item(asCPointer())));
    }

    /**
     * Enables or disables autoselect.
     * <br>
     * <br>If &#64;autoselect is %TRUE, &#64;self will enforce that an item is always
     * <br>selected. It will select a new item when the currently selected
     * <br>item is deleted and it will disallow unselecting the current item.
     * @param autoselect %TRUE to always select an item
    */
    public void setAutoselect(boolean autoselect)  {
        JnaSingleSelection.INST().gtk_single_selection_set_autoselect(asCPointer(), autoselect);
    }

    /**
     * If %TRUE, unselecting the current item via
     * <br>gtk_selection_model_unselect_item() is supported.
     * <br>
     * <br>Note that setting [property&#64;Gtk.SingleSelection:autoselect] will
     * <br>cause unselecting to not work, so it practically makes no sense
     * <br>to set both at the same time the same time.
     * @param can_unselect %TRUE to allow unselecting
    */
    public void setCanUnselect(boolean can_unselect)  {
        JnaSingleSelection.INST().gtk_single_selection_set_can_unselect(asCPointer(), can_unselect);
    }

    /**
     * Sets the model that &#64;self should wrap.
     * <br>
     * <br>If &#64;model is %NULL, &#64;self will be empty.
     * @param model A `GListModel` to wrap
    */
    public void setModel(@Nullable ch.bailu.gtk.gio.ListModel model)  {
        JnaSingleSelection.INST().gtk_single_selection_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Selects the item at the given position.
     * <br>
     * <br>If the list does not have an item at &#64;position or
     * <br>%GTK_INVALID_LIST_POSITION is given, the behavior depends on the
     * <br>value of the [property&#64;Gtk.SingleSelection:autoselect] property:
     * <br>If it is set, no change will occur and the old item will stay
     * <br>selected. If it is unset, the selection will be unset and no item
     * <br>will be selected.
     * @param position the item to select or %GTK_INVALID_LIST_POSITION
    */
    public void setSelected(int position)  {
        JnaSingleSelection.INST().gtk_single_selection_set_selected(asCPointer(), position);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    /**
     * Implements interface {@link SelectionModel}. Call this to get access to interface functions.
     * @return {@link SelectionModel}
    */
    public SelectionModel asSelectionModel() {
        return new SelectionModel(cast());
    }

    public static long getTypeID() { 
        return JnaSingleSelection.INST().gtk_single_selection_get_type(); 
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
