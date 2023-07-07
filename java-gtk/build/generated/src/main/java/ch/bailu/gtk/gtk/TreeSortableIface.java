/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gtk4/struct.TreeSortableIface.html">https://docs.gtk.org/gtk4/struct.TreeSortableIface.html</a></p>
*/
public class TreeSortableIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeSortableIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnSortColumnChanged {
        /**
         * 
         * @param sortable A `GtkTreeSortable`
        */
        void onSortColumnChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeSortable sortable);
    }
    
    private static JnaTreeSortableIface.OnSortColumnChanged toOnSortColumnChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnSortColumnChanged in) {
        JnaTreeSortableIface.OnSortColumnChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_sortable) -> in.onSortColumnChanged(__callback, new TreeSortable(new PointerContainer(_sortable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetSortColumnId {
        /**
         * 
         * @param sortable A `GtkTreeSortable`
         * @param sort_column_id The sort column id to be filled in
         * @param order The `GtkSortType` to be filled in
         * @return %TRUE if the sort column is not one of the special sort   column ids.
        */
        boolean onGetSortColumnId(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeSortable sortable, @Nonnull ch.bailu.gtk.type.Int sort_column_id, @Nonnull ch.bailu.gtk.type.Int order);
    }
    
    private static JnaTreeSortableIface.OnGetSortColumnId toOnGetSortColumnId(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetSortColumnId in) {
        JnaTreeSortableIface.OnGetSortColumnId out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_sortable, _sort_column_id, _order) -> in.onGetSortColumnId(__callback, new TreeSortable(new PointerContainer(_sortable)), new ch.bailu.gtk.type.Int(new PointerContainer(_sort_column_id)), new ch.bailu.gtk.type.Int(new PointerContainer(_order)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetSortColumnId {
        /**
         * 
         * @param sortable A `GtkTreeSortable`
         * @param sort_column_id the sort column id to set
         * @param order The sort order of the column
        */
        void onSetSortColumnId(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeSortable sortable, int sort_column_id, int order);
    }
    
    private static JnaTreeSortableIface.OnSetSortColumnId toOnSetSortColumnId(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetSortColumnId in) {
        JnaTreeSortableIface.OnSetSortColumnId out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_sortable, _sort_column_id, _order) -> in.onSetSortColumnId(__callback, new TreeSortable(new PointerContainer(_sortable)), _sort_column_id, _order);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHasDefaultSortFunc {
        /**
         * 
         * @param sortable A `GtkTreeSortable`
         * @return %TRUE, if the model has a default sort function
        */
        boolean onHasDefaultSortFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeSortable sortable);
    }
    
    private static JnaTreeSortableIface.OnHasDefaultSortFunc toOnHasDefaultSortFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnHasDefaultSortFunc in) {
        JnaTreeSortableIface.OnHasDefaultSortFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_sortable) -> in.onHasDefaultSortFunc(__callback, new TreeSortable(new PointerContainer(_sortable)));
            __callback.register(out);
        }
        return out;
    }

    public TreeSortableIface(PointerContainer pointer) {
        super(pointer);
    }

    public TreeSortableIface() {
        super(cast(JnaTreeSortableIface.allocateStructure()));
    }

    private JnaTreeSortableIface.Fields _fields;
    
    JnaTreeSortableIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTreeSortableIface.Fields(asCPointer());
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
     * <br>See {@link OnSortColumnChanged#onSortColumnChanged}
    */
    public static final String SORT_COLUMN_CHANGED = "sort_column_changed";

    /**
     * 
     * <br>See {@link OnSortColumnChanged#onSortColumnChanged}
    */
    public void setFieldSortColumnChanged(OnSortColumnChanged sort_column_changed) {
        toFields().sort_column_changed = toOnSortColumnChanged(this, SORT_COLUMN_CHANGED, sort_column_changed);
        toFields().writeField(SORT_COLUMN_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnSortColumnChanged#onSortColumnChanged}
    */
    public JnaTreeSortableIface.OnSortColumnChanged getFieldSortColumnChanged() {
       toFields().readField(SORT_COLUMN_CHANGED);
       return toFields().sort_column_changed;
    } 

    /**
     * 
     * <br>See {@link OnGetSortColumnId#onGetSortColumnId}
    */
    public static final String GET_SORT_COLUMN_ID = "get_sort_column_id";

    /**
     * 
     * <br>See {@link OnGetSortColumnId#onGetSortColumnId}
    */
    public void setFieldGetSortColumnId(OnGetSortColumnId get_sort_column_id) {
        toFields().get_sort_column_id = toOnGetSortColumnId(this, GET_SORT_COLUMN_ID, get_sort_column_id);
        toFields().writeField(GET_SORT_COLUMN_ID);
    }

    /**
     * 
     * <br>See {@link OnGetSortColumnId#onGetSortColumnId}
    */
    public JnaTreeSortableIface.OnGetSortColumnId getFieldGetSortColumnId() {
       toFields().readField(GET_SORT_COLUMN_ID);
       return toFields().get_sort_column_id;
    } 

    /**
     * 
     * <br>See {@link OnSetSortColumnId#onSetSortColumnId}
    */
    public static final String SET_SORT_COLUMN_ID = "set_sort_column_id";

    /**
     * 
     * <br>See {@link OnSetSortColumnId#onSetSortColumnId}
    */
    public void setFieldSetSortColumnId(OnSetSortColumnId set_sort_column_id) {
        toFields().set_sort_column_id = toOnSetSortColumnId(this, SET_SORT_COLUMN_ID, set_sort_column_id);
        toFields().writeField(SET_SORT_COLUMN_ID);
    }

    /**
     * 
     * <br>See {@link OnSetSortColumnId#onSetSortColumnId}
    */
    public JnaTreeSortableIface.OnSetSortColumnId getFieldSetSortColumnId() {
       toFields().readField(SET_SORT_COLUMN_ID);
       return toFields().set_sort_column_id;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String SET_SORT_FUNC = "set_sort_func";

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String SET_DEFAULT_SORT_FUNC = "set_default_sort_func";

    /**
     * 
     * <br>See {@link OnHasDefaultSortFunc#onHasDefaultSortFunc}
    */
    public static final String HAS_DEFAULT_SORT_FUNC = "has_default_sort_func";

    /**
     * 
     * <br>See {@link OnHasDefaultSortFunc#onHasDefaultSortFunc}
    */
    public void setFieldHasDefaultSortFunc(OnHasDefaultSortFunc has_default_sort_func) {
        toFields().has_default_sort_func = toOnHasDefaultSortFunc(this, HAS_DEFAULT_SORT_FUNC, has_default_sort_func);
        toFields().writeField(HAS_DEFAULT_SORT_FUNC);
    }

    /**
     * 
     * <br>See {@link OnHasDefaultSortFunc#onHasDefaultSortFunc}
    */
    public JnaTreeSortableIface.OnHasDefaultSortFunc getFieldHasDefaultSortFunc() {
       toFields().readField(HAS_DEFAULT_SORT_FUNC);
       return toFields().has_default_sort_func;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TreeSortable.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(TreeSortable.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
