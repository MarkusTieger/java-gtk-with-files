/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GListStore is a simple implementation of &#35;GListModel that stores all
 * <br>items in memory.
 * <br>
 * <br>It provides insertions, deletions, and lookups in logarithmic time
 * <br>with a fast path for the common case of iterating the list linearly.
 * <p><a href="https://docs.gtk.org/gio/class.ListStore.html">https://docs.gtk.org/gio/class.ListStore.html</a></p>
*/
public class ListStore extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ListStore.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCompareDataFunc {
        /**
         * Specifies the type of a comparison function used to compare two
         * <br>values.  The function should return a negative integer if the first
         * <br>value comes before the second, 0 if they are equal, or a positive
         * <br>integer if the first value comes after the second.
         * @param a a value
         * @param b a value to compare with
         * @param user_data user data
         * @return negative value if &#64;a &lt; &#64;b; zero if &#64;a = &#64;b; positive          value if &#64;a &gt; &#64;b
        */
        int onCompareDataFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer a, @Nullable ch.bailu.gtk.type.Pointer b, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaListStore.OnCompareDataFunc toOnCompareDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareDataFunc in) {
        JnaListStore.OnCompareDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onCompareDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public ListStore(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GListStore with items of type &#64;item_type. &#64;item_type
     * <br>must be a subclass of &#35;GObject.
     * @param item_type the &#35;GType of items in the list
    */
    public ListStore(long item_type) {
        super(cast(JnaListStore.INST().g_list_store_new(item_type)));
    }

    /**
     * Appends &#64;item to &#64;store. &#64;item must be of type &#35;GListStore:item-type.
     * <br>
     * <br>This function takes a ref on &#64;item.
     * <br>
     * <br>Use g_list_store_splice() to append multiple items at the same time
     * <br>efficiently.
     * @param item the new item
    */
    public void append(@Nonnull ch.bailu.gtk.type.Pointer item)  {
        JnaListStore.INST().g_list_store_append(asCPointer(), asCPointerNotNull(item));
    }

    /**
     * Inserts &#64;item into &#64;store at &#64;position. &#64;item must be of type
     * <br>&#35;GListStore:item-type or derived from it. &#64;position must be smaller
     * <br>than the length of the list, or equal to it to append.
     * <br>
     * <br>This function takes a ref on &#64;item.
     * <br>
     * <br>Use g_list_store_splice() to insert multiple items at the same time
     * <br>efficiently.
     * @param position the position at which to insert the new item
     * @param item the new item
    */
    public void insert(int position, @Nonnull ch.bailu.gtk.type.Pointer item)  {
        JnaListStore.INST().g_list_store_insert(asCPointer(), position, asCPointerNotNull(item));
    }

    /**
     * Inserts &#64;item into &#64;store at a position to be determined by the
     * <br>&#64;compare_func.
     * <br>
     * <br>The list must already be sorted before calling this function or the
     * <br>result is undefined.  Usually you would approach this by only ever
     * <br>inserting items by way of this function.
     * <br>
     * <br>This function takes a ref on &#64;item.
     * @param item the new item
     * @param compare_func pairwise comparison function for sorting
     * @param user_data user data for &#64;compare_func
     * @return the position at which &#64;item was inserted
    */
    public int insertSorted(@Nonnull ch.bailu.gtk.type.Pointer item, OnCompareDataFunc compare_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return JnaListStore.INST().g_list_store_insert_sorted(asCPointer(), asCPointerNotNull(item), toOnCompareDataFunc(this, "insertSorted", compare_func), asCPointer(user_data));
    }

    /**
     * Removes the item from &#64;store that is at &#64;position. &#64;position must be
     * <br>smaller than the current length of the list.
     * <br>
     * <br>Use g_list_store_splice() to remove multiple items at the same time
     * <br>efficiently.
     * @param position the position of the item that is to be removed
    */
    public void remove(int position)  {
        JnaListStore.INST().g_list_store_remove(asCPointer(), position);
    }

    /**
     * Removes all items from &#64;store.
    */
    public void removeAll()  {
        JnaListStore.INST().g_list_store_remove_all(asCPointer());
    }

    /**
     * Sort the items in &#64;store according to &#64;compare_func.
     * @param compare_func pairwise comparison function for sorting
     * @param user_data user data for &#64;compare_func
    */
    public void sort(OnCompareDataFunc compare_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaListStore.INST().g_list_store_sort(asCPointer(), toOnCompareDataFunc(this, "sort", compare_func), asCPointer(user_data));
    }

    /**
     * Implements interface {@link ListModel}. Call this to get access to interface functions.
     * @return {@link ListModel}
    */
    public ListModel asListModel() {
        return new ListModel(cast());
    }

    public static long getTypeID() { 
        return JnaListStore.INST().g_list_store_get_type(); 
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

[MethodModel:java-type-not-supported:find:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:findWithEqualFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:EqualFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:findWithEqualFuncFull:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:EqualFuncFull:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:splice:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
*/
