/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkMapListModel` maps the items in a list model to different items.
 * <br>
 * <br>`GtkMapListModel` uses a [callback&#64;Gtk.MapListModelMapFunc].
 * <br>
 * <br>Example: Create a list of `GtkEventControllers`
 * <br>```c
 * <br>static gpointer
 * <br>map_to_controllers (gpointer widget,
 * <br>                    gpointer data)
 * <br>{
 * <br>  gpointer result = gtk_widget_observe_controllers (widget);
 * <br>  g_object_unref (widget);
 * <br>  return result;
 * <br>}
 * <br>
 * <br>widgets = gtk_widget_observe_children (widget);
 * <br>
 * <br>controllers = gtk_map_list_model_new (widgets,
 * <br>                                      map_to_controllers,
 * <br>                                      NULL, NULL);
 * <br>
 * <br>model = gtk_flatten_list_model_new (GTK_TYPE_EVENT_CONTROLLER,
 * <br>                                    controllers);
 * <br>```
 * <br>
 * <br>`GtkMapListModel` will attempt to discard the mapped objects as soon as
 * <br>they are no longer needed and recreate them if necessary.
 * <p><a href="https://docs.gtk.org/gtk4/class.MapListModel.html">https://docs.gtk.org/gtk4/class.MapListModel.html</a></p>
*/
public class MapListModel extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MapListModel.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnMapListModelMapFunc {
        /**
         * User function that is called to map an &#64;item of the original model to
         * <br>an item expected by the map model.
         * <br>
         * <br>The returned items must conform to the item type of the model they are
         * <br>used with.
         * @param item The item to map
         * @param user_data user data
         * @return The item to map to
        */
        ch.bailu.gtk.type.Pointer onMapListModelMapFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer item, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaMapListModel.OnMapListModelMapFunc toOnMapListModelMapFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnMapListModelMapFunc in) {
        JnaMapListModel.OnMapListModelMapFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_item, _user_data) -> in.onMapListModelMapFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_item)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
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
    
    private static JnaMapListModel.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaMapListModel.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public MapListModel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkMapListModel` for the given arguments.
     * @param model The model to map
     * @param map_func map function
     * @param user_data user data passed to &#64;map_func
     * @param user_destroy destroy notifier for &#64;user_data
    */
    public MapListModel(@Nullable ch.bailu.gtk.gio.ListModel model, OnMapListModelMapFunc map_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_destroy) {
        super(cast(JnaMapListModel.INST().gtk_map_list_model_new(asCPointer(model), toOnMapListModelMapFunc(getClassHandler().getInstance(), "_new", map_func), asCPointer(user_data), toOnDestroyNotify(getClassHandler().getInstance(), "_new", user_destroy))));
    }

    /**
     * Gets the model that is currently being mapped or %NULL if none.
     * @return The model that gets mapped
    */
    public ch.bailu.gtk.gio.ListModel getModel()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaMapListModel.INST().gtk_map_list_model_get_model(asCPointer())));
    }

    /**
     * Checks if a map function is currently set on &#64;self.
     * @return %TRUE if a map function is set
    */
    public boolean hasMap()  {
        return JnaMapListModel.INST().gtk_map_list_model_has_map(asCPointer());
    }

    /**
     * Sets the function used to map items.
     * <br>
     * <br>The function will be called whenever an item needs to be mapped
     * <br>and must return the item to use for the given input item.
     * <br>
     * <br>Note that `GtkMapListModel` may call this function multiple times
     * <br>on the same item, because it may delete items it doesn't need anymore.
     * <br>
     * <br>GTK makes no effort to ensure that &#64;map_func conforms to the item type
     * <br>of &#64;self. It assumes that the caller knows what they are doing and the map
     * <br>function returns items of the appropriate type.
     * @param map_func map function
     * @param user_data user data passed to &#64;map_func
     * @param user_destroy destroy notifier for &#64;user_data
    */
    public void setMapFunc(OnMapListModelMapFunc map_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_destroy)  {
        JnaMapListModel.INST().gtk_map_list_model_set_map_func(asCPointer(), toOnMapListModelMapFunc(this, "setMapFunc", map_func), asCPointer(user_data), toOnDestroyNotify(this, "setMapFunc", user_destroy));
    }

    /**
     * Sets the model to be mapped.
     * <br>
     * <br>GTK makes no effort to ensure that &#64;model conforms to the item type
     * <br>expected by the map function. It assumes that the caller knows what
     * <br>they are doing and have set up an appropriate map function.
     * @param model The model to be mapped
    */
    public void setModel(@Nullable ch.bailu.gtk.gio.ListModel model)  {
        JnaMapListModel.INST().gtk_map_list_model_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    public static long getTypeID() { 
        return JnaMapListModel.INST().gtk_map_list_model_get_type(); 
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
