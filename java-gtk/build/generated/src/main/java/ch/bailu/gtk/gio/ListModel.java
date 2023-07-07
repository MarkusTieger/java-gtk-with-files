/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GListModel is an interface that represents a mutable list of
 * <br>&#35;GObjects. Its main intention is as a model for various widgets in
 * <br>user interfaces, such as list views, but it can also be used as a
 * <br>convenient method of returning lists of data, with support for
 * <br>updates.
 * <br>
 * <br>Each object in the list may also report changes in itself via some
 * <br>mechanism (normally the &#35;GObject::notify signal).  Taken together
 * <br>with the &#35;GListModel::items-changed signal, this provides for a list
 * <br>that can change its membership, and in which the members can change
 * <br>their individual properties.
 * <br>
 * <br>A good example would be the list of visible wireless network access
 * <br>points, where each access point can report dynamic properties such as
 * <br>signal strength.
 * <br>
 * <br>It is important to note that the &#35;GListModel itself does not report
 * <br>changes to the individual items.  It only reports changes to the list
 * <br>membership.  If you want to observe changes to the objects themselves
 * <br>then you need to connect signals to the objects that you are
 * <br>interested in.
 * <br>
 * <br>All items in a &#35;GListModel are of (or derived from) the same type.
 * <br>g_list_model_get_item_type() returns that type.  The type may be an
 * <br>interface, in which case all objects in the list must implement it.
 * <br>
 * <br>The semantics are close to that of an array:
 * <br>g_list_model_get_n_items() returns the number of items in the list and
 * <br>g_list_model_get_item() returns an item at a (0-based) position. In
 * <br>order to allow implementations to calculate the list length lazily,
 * <br>you can also iterate over items: starting from 0, repeatedly call
 * <br>g_list_model_get_item() until it returns %NULL.
 * <br>
 * <br>An implementation may create objects lazily, but must take care to
 * <br>return the same object for a given position until all references to
 * <br>it are gone.
 * <br>
 * <br>On the other side, a consumer is expected only to hold references on
 * <br>objects that are currently &quot;user visible&quot;, in order to facilitate the
 * <br>maximum level of laziness in the implementation of the list and to
 * <br>reduce the required number of signal connections at a given time.
 * <br>
 * <br>This interface is intended only to be used from a single thread.  The
 * <br>thread in which it is appropriate to use it depends on the particular
 * <br>implementation, but typically it will be from the thread that owns
 * <br>the [thread-default main context][g-main-context-push-thread-default]
 * <br>in effect at the time that the model was created.
 * <br>
 * <br>Over time, it has established itself as good practice for listmodel
 * <br>implementations to provide properties `item-type` and `n-items` to
 * <br>ease working with them. While it is not required, it is recommended
 * <br>that implementations provide these two properties. They should return
 * <br>the values of g_list_model_get_item_type() and g_list_model_get_n_items()
 * <br>respectively and be defined as such:
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * properties[PROP_ITEM_TYPE] =
 *   g_param_spec_gtype (&quot;item-type&quot;, &quot;&quot;, &quot;&quot;, G_TYPE_OBJECT,
 *                       G_PARAM_CONSTRUCT_ONLY | G_PARAM_READWRITE | G_PARAM_STATIC_STRINGS);
 * properties[PROP_N_ITEMS] =
 *   g_param_spec_uint (&quot;n-items&quot;, &quot;&quot;, &quot;&quot;, 0, G_MAXUINT, 0,
 *                      G_PARAM_READABLE | G_PARAM_STATIC_STRINGS);
 * </pre>
 * <p><a href="https://docs.gtk.org/gio/iface.ListModel.html">https://docs.gtk.org/gio/iface.ListModel.html</a></p>
*/
public class ListModel extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ListModel.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnItemsChanged {
        /**
         * This signal is emitted whenever items were added to or removed
         * <br>from &#64;list. At &#64;position, &#64;removed items were removed and &#64;added
         * <br>items were added in their place.
         * <br>
         * <br>Note: If `removed != added`, the positions of all later items
         * <br>in the model change.
         * @param position the position at which &#64;list changed
         * @param removed the number of items removed
         * @param added the number of items added
        */
        void onItemsChanged(int position, int removed, int added);
    }
    
    private static com.sun.jna.Callback toOnItemsChanged(OnItemsChanged in) {
        return (in == null) ? null: (JnaListModel.OnItemsChanged) (__self, _position, _removed, _added, __data) -> in.onItemsChanged(_position, _removed, _added);
    }

    public ListModel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Get the item at &#64;position.
     * <br>
     * <br>If &#64;position is greater than the number of items in &#64;list, %NULL is
     * <br>returned.
     * <br>
     * <br>%NULL is never returned for an index that is smaller than the length
     * <br>of the list.
     * <br>
     * <br>See also: g_list_model_get_n_items()
     * @param position the position of the item to fetch
     * @return the item at &#64;position.
    */
    public ch.bailu.gtk.type.Pointer getItem(int position)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaListModel.INST().g_list_model_get_item(asCPointer(), position)));
    }

    /**
     * Gets the type of the items in &#64;list.
     * <br>
     * <br>All items returned from g_list_model_get_item() are of the type
     * <br>returned by this function, or a subtype, or if the type is an
     * <br>interface, they are an implementation of that interface.
     * <br>
     * <br>The item type of a &#35;GListModel can not change during the life of the
     * <br>model.
     * @return the &#35;GType of the items contained in &#64;list.
    */
    public long getItemType()  {
        return JnaListModel.INST().g_list_model_get_item_type(asCPointer());
    }

    /**
     * Gets the number of items in &#64;list.
     * <br>
     * <br>Depending on the model implementation, calling this function may be
     * <br>less efficient than iterating the list with increasing values for
     * <br>&#64;position until g_list_model_get_item() returns %NULL.
     * @return the number of items in &#64;list.
    */
    public int getNItems()  {
        return JnaListModel.INST().g_list_model_get_n_items(asCPointer());
    }

    /**
     * Get the item at &#64;position.
     * <br>
     * <br>If &#64;position is greater than the number of items in &#64;list, %NULL is
     * <br>returned.
     * <br>
     * <br>%NULL is never returned for an index that is smaller than the length
     * <br>of the list.
     * <br>
     * <br>This function is meant to be used by language bindings in place
     * <br>of g_list_model_get_item().
     * <br>
     * <br>See also: g_list_model_get_n_items()
     * @param position the position of the item to fetch
     * @return the object at &#64;position.
    */
    public ch.bailu.gtk.gobject.Object getObject(int position)  {
        return new ch.bailu.gtk.gobject.Object(new PointerContainer(JnaListModel.INST().g_list_model_get_object(asCPointer(), position)));
    }

    /**
     * Emits the &#35;GListModel::items-changed signal on &#64;list.
     * <br>
     * <br>This function should only be called by classes implementing
     * <br>&#35;GListModel. It has to be called after the internal representation
     * <br>of &#64;list has been updated, because handlers connected to this signal
     * <br>might query the new state of the list.
     * <br>
     * <br>Implementations must only make changes to the model (as visible to
     * <br>its consumer) in places that will not cause problems for that
     * <br>consumer.  For models that are driven directly by a write API (such
     * <br>as &#35;GListStore), changes can be reported in response to uses of that
     * <br>API.  For models that represent remote data, changes should only be
     * <br>made from a fresh mainloop dispatch.  It is particularly not
     * <br>permitted to make changes in response to a call to the &#35;GListModel
     * <br>consumer API.
     * <br>
     * <br>Stated another way: in general, it is assumed that code making a
     * <br>series of accesses to the model via the API, without returning to the
     * <br>mainloop, and without calling other code, will continue to view the
     * <br>same contents of the model.
     * @param position the position at which &#64;list changed
     * @param removed the number of items removed
     * @param added the number of items added
    */
    public void itemsChanged(int position, int removed, int added)  {
        JnaListModel.INST().g_list_model_items_changed(asCPointer(), position, removed, added);
    }

    public final static String SIGNAL_ON_ITEMS_CHANGED = "items-changed";
    
    /**
     * Connect to signal "items-changed".
     * <br>See {@link OnItemsChanged#onItemsChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_ITEMS_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onItemsChanged(OnItemsChanged signal) {
        return connectSignal(SIGNAL_ON_ITEMS_CHANGED, toOnItemsChanged(signal));
    }

    public static long getTypeID() { 
        return JnaListModel.INST().g_list_model_get_type(); 
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
