/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkBookmarkList` is a list model that wraps `GBookmarkFile`.
 * <br>
 * <br>It presents a `GListModel` and fills it asynchronously with the
 * <br>`GFileInfo`s returned from that function.
 * <br>
 * <br>The `GFileInfo`s in the list have some attributes in the recent
 * <br>namespace added: `recent::private` (boolean) and `recent:applications`
 * <br>(stringv).
 * <p><a href="https://docs.gtk.org/gtk4/class.BookmarkList.html">https://docs.gtk.org/gtk4/class.BookmarkList.html</a></p>
*/
public class BookmarkList extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BookmarkList.class.getCanonicalName());
    }

    public BookmarkList(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkBookmarkList` with the given &#64;attributes.
     * @param filename The bookmark file to load
     * @param attributes The attributes to query
    */
    public BookmarkList(@Nullable ch.bailu.gtk.type.Str filename, @Nullable ch.bailu.gtk.type.Str attributes) {
        super(cast(JnaBookmarkList.INST().gtk_bookmark_list_new(asCPointer(filename), asCPointer(attributes))));
    }

    /**
     * Creates a new `GtkBookmarkList` with the given &#64;attributes.
     * @param filename The bookmark file to load
     * @param attributes The attributes to query
    */
    public BookmarkList(String filename, String attributes) {
        super(cast(JnaBookmarkList.INST().gtk_bookmark_list_new(filename, attributes)));
    }

    /**
     * Gets the attributes queried on the children.
     * @return The queried attributes
    */
    public ch.bailu.gtk.type.Str getAttributes()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBookmarkList.INST().gtk_bookmark_list_get_attributes(asCPointer())));
    }

    /**
     * Returns the filename of the bookmark file that
     * <br>this list is loading.
     * @return the filename of the .xbel file
    */
    public ch.bailu.gtk.type.Str getFilename()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBookmarkList.INST().gtk_bookmark_list_get_filename(asCPointer())));
    }

    /**
     * Gets the IO priority to use while loading file.
     * @return The IO priority.
    */
    public int getIoPriority()  {
        return JnaBookmarkList.INST().gtk_bookmark_list_get_io_priority(asCPointer());
    }

    /**
     * Returns %TRUE if the files are currently being loaded.
     * <br>
     * <br>Files will be added to &#64;self from time to time while loading is
     * <br>going on. The order in which are added is undefined and may change
     * <br>in between runs.
     * @return %TRUE if &#64;self is loading
    */
    public boolean isLoading()  {
        return JnaBookmarkList.INST().gtk_bookmark_list_is_loading(asCPointer());
    }

    /**
     * Sets the &#64;attributes to be enumerated and starts the enumeration.
     * <br>
     * <br>If &#64;attributes is %NULL, no attributes will be queried, but a list
     * <br>of `GFileInfo`s will still be created.
     * @param attributes the attributes to enumerate
    */
    public void setAttributes(@Nullable ch.bailu.gtk.type.Str attributes)  {
        JnaBookmarkList.INST().gtk_bookmark_list_set_attributes(asCPointer(), asCPointer(attributes));
    }

    /**
     * Sets the &#64;attributes to be enumerated and starts the enumeration.
     * <br>
     * <br>If &#64;attributes is %NULL, no attributes will be queried, but a list
     * <br>of `GFileInfo`s will still be created.
     * @param attributes the attributes to enumerate
    */
    public void setAttributes(String attributes)  {
        JnaBookmarkList.INST().gtk_bookmark_list_set_attributes(asCPointer(), attributes);
    }

    /**
     * Sets the IO priority to use while loading files.
     * <br>
     * <br>The default IO priority is %G_PRIORITY_DEFAULT.
     * @param io_priority IO priority to use
    */
    public void setIoPriority(int io_priority)  {
        JnaBookmarkList.INST().gtk_bookmark_list_set_io_priority(asCPointer(), io_priority);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    public static long getTypeID() { 
        return JnaBookmarkList.INST().gtk_bookmark_list_get_type(); 
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
