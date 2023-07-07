/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkDirectoryList` is a list model that wraps g_file_enumerate_children_async().
 * <br>
 * <br>It presents a `GListModel` and fills it asynchronously with the `GFileInfo`s
 * <br>returned from that function.
 * <br>
 * <br>Enumeration will start automatically when a the
 * <br>[property&#64;Gtk.DirectoryList:file] property is set.
 * <br>
 * <br>While the `GtkDirectoryList` is being filled, the
 * <br>[property&#64;Gtk.DirectoryList:loading] property will be set to %TRUE. You can
 * <br>listen to that property if you want to show information like a `GtkSpinner`
 * <br>or a &quot;Loading...&quot; text.
 * <br>
 * <br>If loading fails at any point, the [property&#64;Gtk.DirectoryList:error]
 * <br>property will be set to give more indication about the failure.
 * <br>
 * <br>The `GFileInfo`s returned from a `GtkDirectoryList` have the &quot;standard::file&quot;
 * <br>attribute set to the `GFile` they refer to. This way you can get at the file
 * <br>that is referred to in the same way you would via g_file_enumerator_get_child().
 * <br>This means you do not need access to the `GtkDirectoryList`, but can access
 * <br>the `GFile` directly from the `GFileInfo` when operating with a `GtkListView`
 * <br>or similar.
 * <p><a href="https://docs.gtk.org/gtk4/class.DirectoryList.html">https://docs.gtk.org/gtk4/class.DirectoryList.html</a></p>
*/
public class DirectoryList extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DirectoryList.class.getCanonicalName());
    }

    public DirectoryList(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkDirectoryList`.
     * <br>
     * <br>The `GtkDirectoryList` is querying the given &#64;file
     * <br>with the given &#64;attributes.
     * @param attributes The attributes to query with
     * @param file The file to query
    */
    public DirectoryList(@Nullable ch.bailu.gtk.type.Str attributes, @Nullable ch.bailu.gtk.gio.File file) {
        super(cast(JnaDirectoryList.INST().gtk_directory_list_new(asCPointer(attributes), asCPointer(file))));
    }

    /**
     * Creates a new `GtkDirectoryList`.
     * <br>
     * <br>The `GtkDirectoryList` is querying the given &#64;file
     * <br>with the given &#64;attributes.
     * @param attributes The attributes to query with
     * @param file The file to query
    */
    public DirectoryList(String attributes, @Nullable ch.bailu.gtk.gio.File file) {
        super(cast(JnaDirectoryList.INST().gtk_directory_list_new(attributes, asCPointer(file))));
    }

    /**
     * Gets the attributes queried on the children.
     * @return The queried attributes
    */
    public ch.bailu.gtk.type.Str getAttributes()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDirectoryList.INST().gtk_directory_list_get_attributes(asCPointer())));
    }

    /**
     * Gets the loading error, if any.
     * <br>
     * <br>If an error occurs during the loading process, the loading process
     * <br>will finish and this property allows querying the error that happened.
     * <br>This error will persist until a file is loaded again.
     * <br>
     * <br>An error being set does not mean that no files were loaded, and all
     * <br>successfully queried files will remain in the list.
     * @return The loading error or %NULL if   loading finished successfully
    */
    public ch.bailu.gtk.glib.Error getError()  {
        return new ch.bailu.gtk.glib.Error(new PointerContainer(JnaDirectoryList.INST().gtk_directory_list_get_error(asCPointer())));
    }

    /**
     * Gets the file whose children are currently enumerated.
     * @return The file whose children are enumerated
    */
    public ch.bailu.gtk.gio.File getFile()  {
        return new ch.bailu.gtk.gio.File(new PointerContainer(JnaDirectoryList.INST().gtk_directory_list_get_file(asCPointer())));
    }

    /**
     * Gets the IO priority set via gtk_directory_list_set_io_priority().
     * @return The IO priority.
    */
    public int getIoPriority()  {
        return JnaDirectoryList.INST().gtk_directory_list_get_io_priority(asCPointer());
    }

    /**
     * Returns whether the directory list is monitoring
     * <br>the directory for changes.
     * @return %TRUE if the directory is monitored
    */
    public boolean getMonitored()  {
        return JnaDirectoryList.INST().gtk_directory_list_get_monitored(asCPointer());
    }

    /**
     * Returns %TRUE if the children enumeration is currently in
     * <br>progress.
     * <br>
     * <br>Files will be added to &#64;self from time to time while loading is
     * <br>going on. The order in which are added is undefined and may change
     * <br>in between runs.
     * @return %TRUE if &#64;self is loading
    */
    public boolean isLoading()  {
        return JnaDirectoryList.INST().gtk_directory_list_is_loading(asCPointer());
    }

    /**
     * Sets the &#64;attributes to be enumerated and starts the enumeration.
     * <br>
     * <br>If &#64;attributes is %NULL, no attributes will be queried, but a list
     * <br>of `GFileInfo`s will still be created.
     * @param attributes the attributes to enumerate
    */
    public void setAttributes(@Nullable ch.bailu.gtk.type.Str attributes)  {
        JnaDirectoryList.INST().gtk_directory_list_set_attributes(asCPointer(), asCPointer(attributes));
    }

    /**
     * Sets the &#64;attributes to be enumerated and starts the enumeration.
     * <br>
     * <br>If &#64;attributes is %NULL, no attributes will be queried, but a list
     * <br>of `GFileInfo`s will still be created.
     * @param attributes the attributes to enumerate
    */
    public void setAttributes(String attributes)  {
        JnaDirectoryList.INST().gtk_directory_list_set_attributes(asCPointer(), attributes);
    }

    /**
     * Sets the &#64;file to be enumerated and starts the enumeration.
     * <br>
     * <br>If &#64;file is %NULL, the result will be an empty list.
     * @param file the `GFile` to be enumerated
    */
    public void setFile(@Nullable ch.bailu.gtk.gio.File file)  {
        JnaDirectoryList.INST().gtk_directory_list_set_file(asCPointer(), asCPointer(file));
    }

    /**
     * Sets the IO priority to use while loading directories.
     * <br>
     * <br>Setting the priority while &#64;self is loading will reprioritize the
     * <br>ongoing load as soon as possible.
     * <br>
     * <br>The default IO priority is %G_PRIORITY_DEFAULT, which is higher than
     * <br>the GTK redraw priority. If you are loading a lot of directories in
     * <br>parallel, lowering it to something like %G_PRIORITY_DEFAULT_IDLE
     * <br>may increase responsiveness.
     * @param io_priority IO priority to use
    */
    public void setIoPriority(int io_priority)  {
        JnaDirectoryList.INST().gtk_directory_list_set_io_priority(asCPointer(), io_priority);
    }

    /**
     * Sets whether the directory list will monitor the directory
     * <br>for changes.
     * <br>
     * <br>If monitoring is enabled, the ::items-changed signal will
     * <br>be emitted when the directory contents change.
     * <br>
     * <br>
     * <br>When monitoring is turned on after the initial creation
     * <br>of the directory list, the directory is reloaded to avoid
     * <br>missing files that appeared between the initial loading
     * <br>and when monitoring was turned on.
     * @param monitored %TRUE to monitor the directory for changes
    */
    public void setMonitored(boolean monitored)  {
        JnaDirectoryList.INST().gtk_directory_list_set_monitored(asCPointer(), monitored);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    public static long getTypeID() { 
        return JnaDirectoryList.INST().gtk_directory_list_get_type(); 
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
