/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The virtual function table for &#35;GListModel.
 * <p><a href="https://docs.gtk.org/gio/struct.ListModelInterface.html">https://docs.gtk.org/gio/struct.ListModelInterface.html</a></p>
*/
public class ListModelInterface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ListModelInterface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGetItemType {
        /**
         * 
         * @param list a &#35;GListModel
         * @return the &#35;GType of the items contained in &#64;list.
        */
        long onGetItemType(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ListModel list);
    }
    
    private static JnaListModelInterface.OnGetItemType toOnGetItemType(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetItemType in) {
        JnaListModelInterface.OnGetItemType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_list) -> in.onGetItemType(__callback, new ListModel(new PointerContainer(_list)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetNItems {
        /**
         * 
         * @param list a &#35;GListModel
         * @return the number of items in &#64;list.
        */
        int onGetNItems(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ListModel list);
    }
    
    private static JnaListModelInterface.OnGetNItems toOnGetNItems(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetNItems in) {
        JnaListModelInterface.OnGetNItems out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_list) -> in.onGetNItems(__callback, new ListModel(new PointerContainer(_list)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetItem {
        /**
         * 
         * @param list a &#35;GListModel
         * @param position the position of the item to fetch
         * @return the object at &#64;position.
        */
        ch.bailu.gtk.type.Pointer onGetItem(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ListModel list, int position);
    }
    
    private static JnaListModelInterface.OnGetItem toOnGetItem(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetItem in) {
        JnaListModelInterface.OnGetItem out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_list, _position) -> in.onGetItem(__callback, new ListModel(new PointerContainer(_list)), _position).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    public ListModelInterface(PointerContainer pointer) {
        super(pointer);
    }

    public ListModelInterface() {
        super(cast(JnaListModelInterface.allocateStructure()));
    }

    private JnaListModelInterface.Fields _fields;
    
    JnaListModelInterface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaListModelInterface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * parent &#35;GTypeInterface
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnGetItemType#onGetItemType}
    */
    public static final String GET_ITEM_TYPE = "get_item_type";

    /**
     * 
     * <br>See {@link OnGetItemType#onGetItemType}
    */
    public void setFieldGetItemType(OnGetItemType get_item_type) {
        toFields().get_item_type = toOnGetItemType(this, GET_ITEM_TYPE, get_item_type);
        toFields().writeField(GET_ITEM_TYPE);
    }

    /**
     * 
     * <br>See {@link OnGetItemType#onGetItemType}
    */
    public JnaListModelInterface.OnGetItemType getFieldGetItemType() {
       toFields().readField(GET_ITEM_TYPE);
       return toFields().get_item_type;
    } 

    /**
     * 
     * <br>See {@link OnGetNItems#onGetNItems}
    */
    public static final String GET_N_ITEMS = "get_n_items";

    /**
     * 
     * <br>See {@link OnGetNItems#onGetNItems}
    */
    public void setFieldGetNItems(OnGetNItems get_n_items) {
        toFields().get_n_items = toOnGetNItems(this, GET_N_ITEMS, get_n_items);
        toFields().writeField(GET_N_ITEMS);
    }

    /**
     * 
     * <br>See {@link OnGetNItems#onGetNItems}
    */
    public JnaListModelInterface.OnGetNItems getFieldGetNItems() {
       toFields().readField(GET_N_ITEMS);
       return toFields().get_n_items;
    } 

    /**
     * 
     * <br>See {@link OnGetItem#onGetItem}
    */
    public static final String GET_ITEM = "get_item";

    /**
     * 
     * <br>See {@link OnGetItem#onGetItem}
    */
    public void setFieldGetItem(OnGetItem get_item) {
        toFields().get_item = toOnGetItem(this, GET_ITEM, get_item);
        toFields().writeField(GET_ITEM);
    }

    /**
     * 
     * <br>See {@link OnGetItem#onGetItem}
    */
    public JnaListModelInterface.OnGetItem getFieldGetItem() {
       toFields().readField(GET_ITEM);
       return toFields().get_item;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ListModel.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(ListModel.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
