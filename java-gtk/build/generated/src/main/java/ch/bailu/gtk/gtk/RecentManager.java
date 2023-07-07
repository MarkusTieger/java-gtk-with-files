/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkRecentManager` manages and looks up recently used files.
 * <br>
 * <br>Each recently used file is identified by its URI, and has meta-data
 * <br>associated to it, like the names and command lines of the applications
 * <br>that have registered it, the number of time each application has
 * <br>registered the same file, the mime type of the file and whether
 * <br>the file should be displayed only by the applications that have
 * <br>registered it.
 * <br>
 * <br>The recently used files list is per user.
 * <br>
 * <br>`GtkRecentManager` acts like a database of all the recently
 * <br>used files. You can create new `GtkRecentManager` objects, but
 * <br>it is more efficient to use the default manager created by GTK.
 * <br>
 * <br>Adding a new recently used file is as simple as:
 * <br>
 * <br>```c
 * <br>GtkRecentManager *manager;
 * <br>
 * <br>manager = gtk_recent_manager_get_default ();
 * <br>gtk_recent_manager_add_item (manager, file_uri);
 * <br>```
 * <br>
 * <br>The `GtkRecentManager` will try to gather all the needed information
 * <br>from the file itself through GIO.
 * <br>
 * <br>Looking up the meta-data associated with a recently used file
 * <br>given its URI requires calling [method&#64;Gtk.RecentManager.lookup_item]:
 * <br>
 * <br>```c
 * <br>GtkRecentManager *manager;
 * <br>GtkRecentInfo *info;
 * <br>GError *error = NULL;
 * <br>
 * <br>manager = gtk_recent_manager_get_default ();
 * <br>info = gtk_recent_manager_lookup_item (manager, file_uri, &amp;error);
 * <br>if (error)
 * <br>  {
 * <br>    g_warning (&quot;Could not find the file: %s&quot;, error-&gt;message);
 * <br>    g_error_free (error);
 * <br>  }
 * <br>else
 * <br> {
 * <br>   // Use the info object
 * <br>   gtk_recent_info_unref (info);
 * <br> }
 * <br>```
 * <br>
 * <br>In order to retrieve the list of recently used files, you can use
 * <br>[method&#64;Gtk.RecentManager.get_items], which returns a list of
 * <br>[struct&#64;Gtk.RecentInfo].
 * <br>
 * <br>Note that the maximum age of the recently used files list is
 * <br>controllable through the [property&#64;Gtk.Settings:gtk-recent-files-max-age]
 * <br>property.
 * <p><a href="https://docs.gtk.org/gtk4/class.RecentManager.html">https://docs.gtk.org/gtk4/class.RecentManager.html</a></p>
*/
public class RecentManager extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RecentManager.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted when the current recently used resources manager changes
         * <br>its contents.
         * <br>
         * <br>This can happen either by calling [method&#64;Gtk.RecentManager.add_item]
         * <br>or by another application.
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaRecentManager.OnChanged) (__self, __data) -> in.onChanged();
    }

    public RecentManager(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new recent manager object.
     * <br>
     * <br>Recent manager objects are used to handle the list of recently used
     * <br>resources. A `GtkRecentManager` object monitors the recently used
     * <br>resources list, and emits the [signal&#64;Gtk.RecentManager::changed]
     * <br>signal each time something inside the list changes.
     * <br>
     * <br>`GtkRecentManager` objects are expensive: be sure to create them
     * <br>only when needed. You should use [func&#64;Gtk.RecentManager.get_default]
     * <br>instead.
    */
    public RecentManager() {
        super(cast(JnaRecentManager.INST().gtk_recent_manager_new()));
    }

    /**
     * Adds a new resource, pointed by &#64;uri, into the recently used
     * <br>resources list, using the metadata specified inside the
     * <br>`GtkRecentData` passed in &#64;recent_data.
     * <br>
     * <br>The passed URI will be used to identify this resource inside the
     * <br>list.
     * <br>
     * <br>In order to register the new recently used resource, metadata about
     * <br>the resource must be passed as well as the URI; the metadata is
     * <br>stored in a `GtkRecentData`, which must contain the MIME
     * <br>type of the resource pointed by the URI; the name of the application
     * <br>that is registering the item, and a command line to be used when
     * <br>launching the item.
     * <br>
     * <br>Optionally, a `GtkRecentData` might contain a UTF-8 string
     * <br>to be used when viewing the item instead of the last component of
     * <br>the URI; a short description of the item; whether the item should
     * <br>be considered private - that is, should be displayed only by the
     * <br>applications that have registered it.
     * @param uri a valid URI
     * @param recent_data metadata of the resource
     * @return %TRUE if the new item was successfully added to the   recently used resources list, %FALSE otherwise
    */
    public boolean addFull(@Nonnull ch.bailu.gtk.type.Str uri, @Nonnull RecentData recent_data)  {
        return JnaRecentManager.INST().gtk_recent_manager_add_full(asCPointer(), asCPointerNotNull(uri), asCPointerNotNull(recent_data));
    }

    /**
     * Adds a new resource, pointed by &#64;uri, into the recently used
     * <br>resources list, using the metadata specified inside the
     * <br>`GtkRecentData` passed in &#64;recent_data.
     * <br>
     * <br>The passed URI will be used to identify this resource inside the
     * <br>list.
     * <br>
     * <br>In order to register the new recently used resource, metadata about
     * <br>the resource must be passed as well as the URI; the metadata is
     * <br>stored in a `GtkRecentData`, which must contain the MIME
     * <br>type of the resource pointed by the URI; the name of the application
     * <br>that is registering the item, and a command line to be used when
     * <br>launching the item.
     * <br>
     * <br>Optionally, a `GtkRecentData` might contain a UTF-8 string
     * <br>to be used when viewing the item instead of the last component of
     * <br>the URI; a short description of the item; whether the item should
     * <br>be considered private - that is, should be displayed only by the
     * <br>applications that have registered it.
     * @param uri a valid URI
     * @param recent_data metadata of the resource
     * @return %TRUE if the new item was successfully added to the   recently used resources list, %FALSE otherwise
    */
    public boolean addFull(String uri, @Nonnull RecentData recent_data)  {
        return JnaRecentManager.INST().gtk_recent_manager_add_full(asCPointer(), uri, asCPointerNotNull(recent_data));
    }

    /**
     * Adds a new resource, pointed by &#64;uri, into the recently used
     * <br>resources list.
     * <br>
     * <br>This function automatically retrieves some of the needed
     * <br>metadata and setting other metadata to common default values;
     * <br>it then feeds the data to [method&#64;Gtk.RecentManager.add_full].
     * <br>
     * <br>See [method&#64;Gtk.RecentManager.add_full] if you want to explicitly
     * <br>define the metadata for the resource pointed by &#64;uri.
     * @param uri a valid URI
     * @return %TRUE if the new item was successfully added   to the recently used resources list
    */
    public boolean addItem(@Nonnull ch.bailu.gtk.type.Str uri)  {
        return JnaRecentManager.INST().gtk_recent_manager_add_item(asCPointer(), asCPointerNotNull(uri));
    }

    /**
     * Adds a new resource, pointed by &#64;uri, into the recently used
     * <br>resources list.
     * <br>
     * <br>This function automatically retrieves some of the needed
     * <br>metadata and setting other metadata to common default values;
     * <br>it then feeds the data to [method&#64;Gtk.RecentManager.add_full].
     * <br>
     * <br>See [method&#64;Gtk.RecentManager.add_full] if you want to explicitly
     * <br>define the metadata for the resource pointed by &#64;uri.
     * @param uri a valid URI
     * @return %TRUE if the new item was successfully added   to the recently used resources list
    */
    public boolean addItem(String uri)  {
        return JnaRecentManager.INST().gtk_recent_manager_add_item(asCPointer(), uri);
    }

    /**
     * Gets the list of recently used resources.
     * @return a list of   newly allocated `GtkRecentInfo objects`. Use   [method&#64;Gtk.RecentInfo.unref] on each item inside the list, and then   free the list itself using g_list_free().
    */
    public ch.bailu.gtk.glib.List getItems()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaRecentManager.INST().gtk_recent_manager_get_items(asCPointer())));
    }

    /**
     * Checks whether there is a recently used resource registered
     * <br>with &#64;uri inside the recent manager.
     * @param uri a URI
     * @return %TRUE if the resource was found, %FALSE otherwise
    */
    public boolean hasItem(@Nonnull ch.bailu.gtk.type.Str uri)  {
        return JnaRecentManager.INST().gtk_recent_manager_has_item(asCPointer(), asCPointerNotNull(uri));
    }

    /**
     * Checks whether there is a recently used resource registered
     * <br>with &#64;uri inside the recent manager.
     * @param uri a URI
     * @return %TRUE if the resource was found, %FALSE otherwise
    */
    public boolean hasItem(String uri)  {
        return JnaRecentManager.INST().gtk_recent_manager_has_item(asCPointer(), uri);
    }

    /**
     * Searches for a URI inside the recently used resources list, and
     * <br>returns a `GtkRecentInfo` containing information about the resource
     * <br>like its MIME type, or its display name.
     * @param uri a URI
     * @return a `GtkRecentInfo` containing information   about the resource pointed by &#64;uri, or %NULL if the URI was   not registered in the recently used resources list. Free with   [method&#64;Gtk.RecentInfo.unref].
    */
    public RecentInfo lookupItem(@Nonnull ch.bailu.gtk.type.Str uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new RecentInfo(new PointerContainer(JnaRecentManager.INST().gtk_recent_manager_lookup_item(asCPointer(), asCPointerNotNull(uri), 0L)));
    }

    /**
     * Searches for a URI inside the recently used resources list, and
     * <br>returns a `GtkRecentInfo` containing information about the resource
     * <br>like its MIME type, or its display name.
     * @param uri a URI
     * @return a `GtkRecentInfo` containing information   about the resource pointed by &#64;uri, or %NULL if the URI was   not registered in the recently used resources list. Free with   [method&#64;Gtk.RecentInfo.unref].
    */
    public RecentInfo lookupItem(String uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new RecentInfo(new PointerContainer(JnaRecentManager.INST().gtk_recent_manager_lookup_item(asCPointer(), uri, 0L)));
    }

    /**
     * Changes the location of a recently used resource from &#64;uri to &#64;new_uri.
     * <br>
     * <br>Please note that this function will not affect the resource pointed
     * <br>by the URIs, but only the URI used in the recently used resources list.
     * @param uri the URI of a recently used resource
     * @param new_uri the new URI of the recently used resource, or    %NULL to remove the item pointed by &#64;uri in the list
     * @return %TRUE on success
    */
    public boolean moveItem(@Nonnull ch.bailu.gtk.type.Str uri, @Nullable ch.bailu.gtk.type.Str new_uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaRecentManager.INST().gtk_recent_manager_move_item(asCPointer(), asCPointerNotNull(uri), asCPointer(new_uri), 0L);
    }

    /**
     * Changes the location of a recently used resource from &#64;uri to &#64;new_uri.
     * <br>
     * <br>Please note that this function will not affect the resource pointed
     * <br>by the URIs, but only the URI used in the recently used resources list.
     * @param uri the URI of a recently used resource
     * @param new_uri the new URI of the recently used resource, or    %NULL to remove the item pointed by &#64;uri in the list
     * @return %TRUE on success
    */
    public boolean moveItem(String uri, String new_uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaRecentManager.INST().gtk_recent_manager_move_item(asCPointer(), uri, new_uri, 0L);
    }

    /**
     * Purges every item from the recently used resources list.
     * @return the number of items that have been removed from the   recently used resources list
    */
    public int purgeItems() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaRecentManager.INST().gtk_recent_manager_purge_items(asCPointer(), 0L);
    }

    /**
     * Removes a resource pointed by &#64;uri from the recently used resources
     * <br>list handled by a recent manager.
     * @param uri the URI of the item you wish to remove
     * @return %TRUE if the item pointed by &#64;uri has been successfully   removed by the recently used resources list, and %FALSE otherwise
    */
    public boolean removeItem(@Nonnull ch.bailu.gtk.type.Str uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaRecentManager.INST().gtk_recent_manager_remove_item(asCPointer(), asCPointerNotNull(uri), 0L);
    }

    /**
     * Removes a resource pointed by &#64;uri from the recently used resources
     * <br>list handled by a recent manager.
     * @param uri the URI of the item you wish to remove
     * @return %TRUE if the item pointed by &#64;uri has been successfully   removed by the recently used resources list, and %FALSE otherwise
    */
    public boolean removeItem(String uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaRecentManager.INST().gtk_recent_manager_remove_item(asCPointer(), uri, 0L);
    }

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
    }

    /**
     * Gets a unique instance of `GtkRecentManager` that you can share
     * <br>in your application without caring about memory management.
     * @return A unique `GtkRecentManager`. Do not ref or   unref it.
    */
    public static RecentManager getDefault()  {
        return new RecentManager(new PointerContainer(JnaRecentManager.INST().gtk_recent_manager_get_default()));
    }

    public static long getTypeID() { 
        return JnaRecentManager.INST().gtk_recent_manager_get_type(); 
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
