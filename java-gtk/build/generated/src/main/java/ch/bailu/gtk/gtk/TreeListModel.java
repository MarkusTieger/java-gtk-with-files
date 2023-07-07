/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkTreeListModel` is a list model that can create child models on demand.
 * <p><a href="https://docs.gtk.org/gtk4/class.TreeListModel.html">https://docs.gtk.org/gtk4/class.TreeListModel.html</a></p>
*/
public class TreeListModel extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeListModel.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTreeListModelCreateModelFunc {
        /**
         * Prototype of the function called to create new child models when
         * <br>gtk_tree_list_row_set_expanded() is called.
         * <br>
         * <br>This function can return %NULL to indicate that &#64;item is guaranteed to be
         * <br>a leaf node and will never have children. If it does not have children but
         * <br>may get children later, it should return an empty model that is filled once
         * <br>children arrive.
         * @param item The item that is being expanded
         * @param user_data User data passed when registering the function
         * @return The model tracking the children of   &#64;item or %NULL if &#64;item can never have children
        */
        ch.bailu.gtk.gio.ListModel onTreeListModelCreateModelFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer item, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaTreeListModel.OnTreeListModelCreateModelFunc toOnTreeListModelCreateModelFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeListModelCreateModelFunc in) {
        JnaTreeListModel.OnTreeListModelCreateModelFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_item, _user_data) -> in.onTreeListModelCreateModelFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_item)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTreeListModel.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaTreeListModel.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public TreeListModel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new empty `GtkTreeListModel` displaying &#64;root
     * <br>with all rows collapsed.
     * @param root The `GListModel` to use as root
     * @param passthrough %TRUE to pass through items from the models
     * @param autoexpand %TRUE to set the autoexpand property and expand the &#64;root model
     * @param create_func Function to call to create the `GListModel` for the children   of an item
     * @param user_data Data to pass to &#64;create_func
     * @param user_destroy Function to call to free &#64;user_data
    */
    public TreeListModel(@Nonnull ch.bailu.gtk.gio.ListModel root, boolean passthrough, boolean autoexpand, OnTreeListModelCreateModelFunc create_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_destroy) {
        super(cast(JnaTreeListModel.INST().gtk_tree_list_model_new(asCPointerNotNull(root), passthrough, autoexpand, toOnTreeListModelCreateModelFunc(getClassHandler().getInstance(), "_new", create_func), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "_new", user_destroy))));
    }

    /**
     * Gets whether the model is set to automatically expand new rows
     * <br>that get added.
     * <br>
     * <br>This can be either rows added by changes to the underlying
     * <br>models or via [method&#64;Gtk.TreeListRow.set_expanded].
     * @return %TRUE if the model is set to autoexpand
    */
    public boolean getAutoexpand()  {
        return JnaTreeListModel.INST().gtk_tree_list_model_get_autoexpand(asCPointer());
    }

    /**
     * Gets the row item corresponding to the child at index &#64;position for
     * <br>&#64;self's root model.
     * <br>
     * <br>If &#64;position is greater than the number of children in the root model,
     * <br>%NULL is returned.
     * <br>
     * <br>Do not confuse this function with [method&#64;Gtk.TreeListModel.get_row].
     * @param position position of the child to get
     * @return the child in &#64;position
    */
    public TreeListRow getChildRow(int position)  {
        return new TreeListRow(new PointerContainer(JnaTreeListModel.INST().gtk_tree_list_model_get_child_row(asCPointer(), position)));
    }

    /**
     * Gets the root model that &#64;self was created with.
     * @return the root model
    */
    public ch.bailu.gtk.gio.ListModel getModel()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaTreeListModel.INST().gtk_tree_list_model_get_model(asCPointer())));
    }

    /**
     * Gets whether the model is passing through original row items.
     * <br>
     * <br>If this function returns %FALSE, the `GListModel` functions for &#64;self
     * <br>return custom `GtkTreeListRow` objects. You need to call
     * <br>[method&#64;Gtk.TreeListRow.get_item] on these objects to get the original
     * <br>item.
     * <br>
     * <br>If %TRUE, the values of the child models are passed through in their
     * <br>original state. You then need to call [method&#64;Gtk.TreeListModel.get_row]
     * <br>to get the custom `GtkTreeListRow`s.
     * @return %TRUE if the model is passing through original row items
    */
    public boolean getPassthrough()  {
        return JnaTreeListModel.INST().gtk_tree_list_model_get_passthrough(asCPointer());
    }

    /**
     * Gets the row object for the given row.
     * <br>
     * <br>If &#64;position is greater than the number of items in &#64;self,
     * <br>%NULL is returned.
     * <br>
     * <br>The row object can be used to expand and collapse rows as
     * <br>well as to inspect its position in the tree. See its
     * <br>documentation for details.
     * <br>
     * <br>This row object is persistent and will refer to the current
     * <br>item as long as the row is present in &#64;self, independent of
     * <br>other rows being added or removed.
     * <br>
     * <br>If &#64;self is set to not be passthrough, this function is
     * <br>equivalent to calling g_list_model_get_item().
     * <br>
     * <br>Do not confuse this function with [method&#64;Gtk.TreeListModel.get_child_row].
     * @param position the position of the row to fetch
     * @return The row item
    */
    public TreeListRow getRow(int position)  {
        return new TreeListRow(new PointerContainer(JnaTreeListModel.INST().gtk_tree_list_model_get_row(asCPointer(), position)));
    }

    /**
     * Sets whether the model should autoexpand.
     * <br>
     * <br>If set to %TRUE, the model will recursively expand all rows that
     * <br>get added to the model. This can be either rows added by changes
     * <br>to the underlying models or via [method&#64;Gtk.TreeListRow.set_expanded].
     * @param autoexpand %TRUE to make the model autoexpand its rows
    */
    public void setAutoexpand(boolean autoexpand)  {
        JnaTreeListModel.INST().gtk_tree_list_model_set_autoexpand(asCPointer(), autoexpand);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    public static long getTypeID() { 
        return JnaTreeListModel.INST().gtk_tree_list_model_get_type(); 
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
