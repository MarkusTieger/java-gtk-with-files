/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The list of virtual functions for the `GtkSelectionModel` interface.
 * <br>No function must be implemented, but unless `GtkSelectionModel::is_selected()`
 * <br>is implemented, it will not be possible to select items in the set.
 * <br>
 * <br>The model does not need to implement any functions to support either
 * <br>selecting or unselecting items. Of course, if the model does not do that,
 * <br>it means that users cannot select or unselect items in a list widget
 * <br>using the model.
 * <br>
 * <br>All selection functions fall back to `GtkSelectionModel::set_selection()`
 * <br>so it is sufficient to implement just that function for full selection
 * <br>support.
 * <p><a href="https://docs.gtk.org/gtk4/struct.SelectionModelInterface.html">https://docs.gtk.org/gtk4/struct.SelectionModelInterface.html</a></p>
*/
public class SelectionModelInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SelectionModelInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnIsSelected {
        /**
         * 
         * @param model a `GtkSelectionModel`
         * @param position the position of the item to query
         * @return %TRUE if the item is selected
        */
        boolean onIsSelected(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SelectionModel model, int position);
    }
    
    private static JnaSelectionModelInterface.OnIsSelected toOnIsSelected(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsSelected in) {
        JnaSelectionModelInterface.OnIsSelected out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _position) -> in.onIsSelected(__callback, new SelectionModel(new PointerContainer(_model)), _position);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetSelectionInRange {
        /**
         * 
         * @param model a `GtkSelectionModel`
         * @param position start of the queired range
         * @param n_items number of items in the queried range
         * @return A `GtkBitset` that matches the selection state   for the given range with all other values being undefined.   The bitset must not be modified.
        */
        Bitset onGetSelectionInRange(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SelectionModel model, int position, int n_items);
    }
    
    private static JnaSelectionModelInterface.OnGetSelectionInRange toOnGetSelectionInRange(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetSelectionInRange in) {
        JnaSelectionModelInterface.OnGetSelectionInRange out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _position, _n_items) -> in.onGetSelectionInRange(__callback, new SelectionModel(new PointerContainer(_model)), _position, _n_items).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSelectItem {
        /**
         * 
         * @param model a `GtkSelectionModel`
         * @param position the position of the item to select
         * @param unselect_rest whether previously selected items should be unselected
         * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean the item was selected.
        */
        boolean onSelectItem(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SelectionModel model, int position, boolean unselect_rest);
    }
    
    private static JnaSelectionModelInterface.OnSelectItem toOnSelectItem(ch.bailu.gtk.type.Pointer instance, String methodName, OnSelectItem in) {
        JnaSelectionModelInterface.OnSelectItem out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _position, _unselect_rest) -> in.onSelectItem(__callback, new SelectionModel(new PointerContainer(_model)), _position, _unselect_rest);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnselectItem {
        /**
         * 
         * @param model a `GtkSelectionModel`
         * @param position the position of the item to unselect
         * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean the item was unselected.
        */
        boolean onUnselectItem(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SelectionModel model, int position);
    }
    
    private static JnaSelectionModelInterface.OnUnselectItem toOnUnselectItem(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnselectItem in) {
        JnaSelectionModelInterface.OnUnselectItem out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _position) -> in.onUnselectItem(__callback, new SelectionModel(new PointerContainer(_model)), _position);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSelectRange {
        /**
         * 
         * @param model a `GtkSelectionModel`
         * @param position the first item to select
         * @param n_items the number of items to select
         * @param unselect_rest whether previously selected items should be unselected
         * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean the range was selected.
        */
        boolean onSelectRange(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SelectionModel model, int position, int n_items, boolean unselect_rest);
    }
    
    private static JnaSelectionModelInterface.OnSelectRange toOnSelectRange(ch.bailu.gtk.type.Pointer instance, String methodName, OnSelectRange in) {
        JnaSelectionModelInterface.OnSelectRange out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _position, _n_items, _unselect_rest) -> in.onSelectRange(__callback, new SelectionModel(new PointerContainer(_model)), _position, _n_items, _unselect_rest);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnselectRange {
        /**
         * 
         * @param model a `GtkSelectionModel`
         * @param position the first item to unselect
         * @param n_items the number of items to unselect
         * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean the range was unselected.
        */
        boolean onUnselectRange(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SelectionModel model, int position, int n_items);
    }
    
    private static JnaSelectionModelInterface.OnUnselectRange toOnUnselectRange(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnselectRange in) {
        JnaSelectionModelInterface.OnUnselectRange out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _position, _n_items) -> in.onUnselectRange(__callback, new SelectionModel(new PointerContainer(_model)), _position, _n_items);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSelectAll {
        /**
         * 
         * @param model a `GtkSelectionModel`
         * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean that all items are now selected.
        */
        boolean onSelectAll(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SelectionModel model);
    }
    
    private static JnaSelectionModelInterface.OnSelectAll toOnSelectAll(ch.bailu.gtk.type.Pointer instance, String methodName, OnSelectAll in) {
        JnaSelectionModelInterface.OnSelectAll out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model) -> in.onSelectAll(__callback, new SelectionModel(new PointerContainer(_model)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnUnselectAll {
        /**
         * 
         * @param model a `GtkSelectionModel`
         * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean that all items are now unselected.
        */
        boolean onUnselectAll(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SelectionModel model);
    }
    
    private static JnaSelectionModelInterface.OnUnselectAll toOnUnselectAll(ch.bailu.gtk.type.Pointer instance, String methodName, OnUnselectAll in) {
        JnaSelectionModelInterface.OnUnselectAll out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model) -> in.onUnselectAll(__callback, new SelectionModel(new PointerContainer(_model)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetSelection {
        /**
         * 
         * @param model a `GtkSelectionModel`
         * @param selected bitmask specifying if items should be selected or unselected
         * @param mask bitmask specifying which items should be updated
         * @return %TRUE if this action was supported and no fallback should be   tried. This does not mean that all items were updated according   to the inputs.
        */
        boolean onSetSelection(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull SelectionModel model, @Nonnull Bitset selected, @Nonnull Bitset mask);
    }
    
    private static JnaSelectionModelInterface.OnSetSelection toOnSetSelection(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetSelection in) {
        JnaSelectionModelInterface.OnSetSelection out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_model, _selected, _mask) -> in.onSetSelection(__callback, new SelectionModel(new PointerContainer(_model)), new Bitset(new PointerContainer(_selected)), new Bitset(new PointerContainer(_mask)));
            __callback.register(out);
        }
        return out;
    }

    public SelectionModelInterface(PointerContainer pointer) {
        super(pointer);
    }

    public SelectionModelInterface() {
        super(cast(JnaSelectionModelInterface.allocateStructure()));
    }

    private JnaSelectionModelInterface.Fields _fields;
    
    JnaSelectionModelInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSelectionModelInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnIsSelected#onIsSelected}
    */
    public static final String IS_SELECTED = "is_selected";

    /**
     * 
     * <br>See {@link OnIsSelected#onIsSelected}
    */
    public void setFieldIsSelected(OnIsSelected is_selected) {
        toFields().is_selected = toOnIsSelected(this, IS_SELECTED, is_selected);
        toFields().writeField(IS_SELECTED);
    }

    /**
     * 
     * <br>See {@link OnIsSelected#onIsSelected}
    */
    public JnaSelectionModelInterface.OnIsSelected getFieldIsSelected() {
       toFields().readField(IS_SELECTED);
       return toFields().is_selected;
    } 

    /**
     * 
     * <br>See {@link OnGetSelectionInRange#onGetSelectionInRange}
    */
    public static final String GET_SELECTION_IN_RANGE = "get_selection_in_range";

    /**
     * 
     * <br>See {@link OnGetSelectionInRange#onGetSelectionInRange}
    */
    public void setFieldGetSelectionInRange(OnGetSelectionInRange get_selection_in_range) {
        toFields().get_selection_in_range = toOnGetSelectionInRange(this, GET_SELECTION_IN_RANGE, get_selection_in_range);
        toFields().writeField(GET_SELECTION_IN_RANGE);
    }

    /**
     * 
     * <br>See {@link OnGetSelectionInRange#onGetSelectionInRange}
    */
    public JnaSelectionModelInterface.OnGetSelectionInRange getFieldGetSelectionInRange() {
       toFields().readField(GET_SELECTION_IN_RANGE);
       return toFields().get_selection_in_range;
    } 

    /**
     * 
     * <br>See {@link OnSelectItem#onSelectItem}
    */
    public static final String SELECT_ITEM = "select_item";

    /**
     * 
     * <br>See {@link OnSelectItem#onSelectItem}
    */
    public void setFieldSelectItem(OnSelectItem select_item) {
        toFields().select_item = toOnSelectItem(this, SELECT_ITEM, select_item);
        toFields().writeField(SELECT_ITEM);
    }

    /**
     * 
     * <br>See {@link OnSelectItem#onSelectItem}
    */
    public JnaSelectionModelInterface.OnSelectItem getFieldSelectItem() {
       toFields().readField(SELECT_ITEM);
       return toFields().select_item;
    } 

    /**
     * 
     * <br>See {@link OnUnselectItem#onUnselectItem}
    */
    public static final String UNSELECT_ITEM = "unselect_item";

    /**
     * 
     * <br>See {@link OnUnselectItem#onUnselectItem}
    */
    public void setFieldUnselectItem(OnUnselectItem unselect_item) {
        toFields().unselect_item = toOnUnselectItem(this, UNSELECT_ITEM, unselect_item);
        toFields().writeField(UNSELECT_ITEM);
    }

    /**
     * 
     * <br>See {@link OnUnselectItem#onUnselectItem}
    */
    public JnaSelectionModelInterface.OnUnselectItem getFieldUnselectItem() {
       toFields().readField(UNSELECT_ITEM);
       return toFields().unselect_item;
    } 

    /**
     * 
     * <br>See {@link OnSelectRange#onSelectRange}
    */
    public static final String SELECT_RANGE = "select_range";

    /**
     * 
     * <br>See {@link OnSelectRange#onSelectRange}
    */
    public void setFieldSelectRange(OnSelectRange select_range) {
        toFields().select_range = toOnSelectRange(this, SELECT_RANGE, select_range);
        toFields().writeField(SELECT_RANGE);
    }

    /**
     * 
     * <br>See {@link OnSelectRange#onSelectRange}
    */
    public JnaSelectionModelInterface.OnSelectRange getFieldSelectRange() {
       toFields().readField(SELECT_RANGE);
       return toFields().select_range;
    } 

    /**
     * 
     * <br>See {@link OnUnselectRange#onUnselectRange}
    */
    public static final String UNSELECT_RANGE = "unselect_range";

    /**
     * 
     * <br>See {@link OnUnselectRange#onUnselectRange}
    */
    public void setFieldUnselectRange(OnUnselectRange unselect_range) {
        toFields().unselect_range = toOnUnselectRange(this, UNSELECT_RANGE, unselect_range);
        toFields().writeField(UNSELECT_RANGE);
    }

    /**
     * 
     * <br>See {@link OnUnselectRange#onUnselectRange}
    */
    public JnaSelectionModelInterface.OnUnselectRange getFieldUnselectRange() {
       toFields().readField(UNSELECT_RANGE);
       return toFields().unselect_range;
    } 

    /**
     * 
     * <br>See {@link OnSelectAll#onSelectAll}
    */
    public static final String SELECT_ALL = "select_all";

    /**
     * 
     * <br>See {@link OnSelectAll#onSelectAll}
    */
    public void setFieldSelectAll(OnSelectAll select_all) {
        toFields().select_all = toOnSelectAll(this, SELECT_ALL, select_all);
        toFields().writeField(SELECT_ALL);
    }

    /**
     * 
     * <br>See {@link OnSelectAll#onSelectAll}
    */
    public JnaSelectionModelInterface.OnSelectAll getFieldSelectAll() {
       toFields().readField(SELECT_ALL);
       return toFields().select_all;
    } 

    /**
     * 
     * <br>See {@link OnUnselectAll#onUnselectAll}
    */
    public static final String UNSELECT_ALL = "unselect_all";

    /**
     * 
     * <br>See {@link OnUnselectAll#onUnselectAll}
    */
    public void setFieldUnselectAll(OnUnselectAll unselect_all) {
        toFields().unselect_all = toOnUnselectAll(this, UNSELECT_ALL, unselect_all);
        toFields().writeField(UNSELECT_ALL);
    }

    /**
     * 
     * <br>See {@link OnUnselectAll#onUnselectAll}
    */
    public JnaSelectionModelInterface.OnUnselectAll getFieldUnselectAll() {
       toFields().readField(UNSELECT_ALL);
       return toFields().unselect_all;
    } 

    /**
     * 
     * <br>See {@link OnSetSelection#onSetSelection}
    */
    public static final String SET_SELECTION = "set_selection";

    /**
     * 
     * <br>See {@link OnSetSelection#onSetSelection}
    */
    public void setFieldSetSelection(OnSetSelection set_selection) {
        toFields().set_selection = toOnSetSelection(this, SET_SELECTION, set_selection);
        toFields().writeField(SET_SELECTION);
    }

    /**
     * 
     * <br>See {@link OnSetSelection#onSetSelection}
    */
    public JnaSelectionModelInterface.OnSetSelection getFieldSetSelection() {
       toFields().readField(SET_SELECTION);
       return toFields().set_selection;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SelectionModel.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(SelectionModel.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
