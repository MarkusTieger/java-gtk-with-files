/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque data structure representing a set of bookmarks.
 * <p><a href="https://docs.gtk.org/glib/struct.BookmarkFile.html">https://docs.gtk.org/glib/struct.BookmarkFile.html</a></p>
*/
class BookmarkFile extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BookmarkFile.class.getCanonicalName());
    }

    public BookmarkFile(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Adds the application with &#64;name and &#64;exec to the list of
     * <br>applications that have registered a bookmark for &#64;uri into
     * <br>&#64;bookmark.
     * <br>
     * <br>Every bookmark inside a &#35;GBookmarkFile must have at least an
     * <br>application registered.  Each application must provide a name, a
     * <br>command line useful for launching the bookmark, the number of times
     * <br>the bookmark has been registered by the application and the last
     * <br>time the application registered this bookmark.
     * <br>
     * <br>If &#64;name is %NULL, the name of the application will be the
     * <br>same returned by g_get_application_name(); if &#64;exec is %NULL, the
     * <br>command line will be a composition of the program name as
     * <br>returned by g_get_prgname() and the &quot;&#92;%u&quot; modifier, which will be
     * <br>expanded to the bookmark's URI.
     * <br>
     * <br>This function will automatically take care of updating the
     * <br>registrations count and timestamping in case an application
     * <br>with the same &#64;name had already registered a bookmark for
     * <br>&#64;uri inside &#64;bookmark.
     * <br>
     * <br>If no bookmark for &#64;uri is found, one is created.
     * @param uri a valid URI
     * @param name the name of the application registering the bookmark   or %NULL
     * @param exec command line to be used to launch the bookmark or %NULL
    */
    public void addApplication(@Nonnull ch.bailu.gtk.type.Str uri, @Nullable ch.bailu.gtk.type.Str name, @Nullable ch.bailu.gtk.type.Str exec)  {
        JnaBookmarkFile.INST().g_bookmark_file_add_application(asCPointer(), asCPointerNotNull(uri), asCPointer(name), asCPointer(exec));
    }

    /**
     * Adds the application with &#64;name and &#64;exec to the list of
     * <br>applications that have registered a bookmark for &#64;uri into
     * <br>&#64;bookmark.
     * <br>
     * <br>Every bookmark inside a &#35;GBookmarkFile must have at least an
     * <br>application registered.  Each application must provide a name, a
     * <br>command line useful for launching the bookmark, the number of times
     * <br>the bookmark has been registered by the application and the last
     * <br>time the application registered this bookmark.
     * <br>
     * <br>If &#64;name is %NULL, the name of the application will be the
     * <br>same returned by g_get_application_name(); if &#64;exec is %NULL, the
     * <br>command line will be a composition of the program name as
     * <br>returned by g_get_prgname() and the &quot;&#92;%u&quot; modifier, which will be
     * <br>expanded to the bookmark's URI.
     * <br>
     * <br>This function will automatically take care of updating the
     * <br>registrations count and timestamping in case an application
     * <br>with the same &#64;name had already registered a bookmark for
     * <br>&#64;uri inside &#64;bookmark.
     * <br>
     * <br>If no bookmark for &#64;uri is found, one is created.
     * @param uri a valid URI
     * @param name the name of the application registering the bookmark   or %NULL
     * @param exec command line to be used to launch the bookmark or %NULL
    */
    public void addApplication(String uri, String name, String exec)  {
        JnaBookmarkFile.INST().g_bookmark_file_add_application(asCPointer(), uri, name, exec);
    }

    /**
     * Adds &#64;group to the list of groups to which the bookmark for &#64;uri
     * <br>belongs to.
     * <br>
     * <br>If no bookmark for &#64;uri is found then it is created.
     * @param uri a valid URI
     * @param group the group name to be added
    */
    public void addGroup(@Nonnull ch.bailu.gtk.type.Str uri, @Nonnull ch.bailu.gtk.type.Str group)  {
        JnaBookmarkFile.INST().g_bookmark_file_add_group(asCPointer(), asCPointerNotNull(uri), asCPointerNotNull(group));
    }

    /**
     * Adds &#64;group to the list of groups to which the bookmark for &#64;uri
     * <br>belongs to.
     * <br>
     * <br>If no bookmark for &#64;uri is found then it is created.
     * @param uri a valid URI
     * @param group the group name to be added
    */
    public void addGroup(String uri, String group)  {
        JnaBookmarkFile.INST().g_bookmark_file_add_group(asCPointer(), uri, group);
    }

    /**
     * Frees a &#35;GBookmarkFile.
    */
    public void free()  {
        JnaBookmarkFile.INST().g_bookmark_file_free(asCPointer());
    }

    /**
     * Gets the time the bookmark for &#64;uri was added to &#64;bookmark
     * <br>
     * <br>In the event the URI cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI
     * @return a &#35;GDateTime
    */
    public DateTime getAddedDateTime(@Nonnull ch.bailu.gtk.type.Str uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new DateTime(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_get_added_date_time(asCPointer(), asCPointerNotNull(uri), 0L)));
    }

    /**
     * Gets the time the bookmark for &#64;uri was added to &#64;bookmark
     * <br>
     * <br>In the event the URI cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI
     * @return a &#35;GDateTime
    */
    public DateTime getAddedDateTime(String uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new DateTime(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_get_added_date_time(asCPointer(), uri, 0L)));
    }

    /**
     * Retrieves the description of the bookmark for &#64;uri.
     * <br>
     * <br>In the event the URI cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI
     * @return a newly allocated string or %NULL if the specified   URI cannot be found.
    */
    public ch.bailu.gtk.type.Str getDescription(@Nonnull ch.bailu.gtk.type.Str uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_get_description(asCPointer(), asCPointerNotNull(uri), 0L)));
    }

    /**
     * Retrieves the description of the bookmark for &#64;uri.
     * <br>
     * <br>In the event the URI cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI
     * @return a newly allocated string or %NULL if the specified   URI cannot be found.
    */
    public ch.bailu.gtk.type.Str getDescription(String uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_get_description(asCPointer(), uri, 0L)));
    }

    /**
     * Gets whether the private flag of the bookmark for &#64;uri is set.
     * <br>
     * <br>In the event the URI cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.  In the
     * <br>event that the private flag cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
     * @param uri a valid URI
     * @return %TRUE if the private flag is set, %FALSE otherwise.
    */
    public boolean getIsPrivate(@Nonnull ch.bailu.gtk.type.Str uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_get_is_private(asCPointer(), asCPointerNotNull(uri), 0L);
    }

    /**
     * Gets whether the private flag of the bookmark for &#64;uri is set.
     * <br>
     * <br>In the event the URI cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.  In the
     * <br>event that the private flag cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
     * @param uri a valid URI
     * @return %TRUE if the private flag is set, %FALSE otherwise.
    */
    public boolean getIsPrivate(String uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_get_is_private(asCPointer(), uri, 0L);
    }

    /**
     * Retrieves the MIME type of the resource pointed by &#64;uri.
     * <br>
     * <br>In the event the URI cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.  In the
     * <br>event that the MIME type cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
     * @param uri a valid URI
     * @return a newly allocated string or %NULL if the specified   URI cannot be found.
    */
    public ch.bailu.gtk.type.Str getMimeType(@Nonnull ch.bailu.gtk.type.Str uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_get_mime_type(asCPointer(), asCPointerNotNull(uri), 0L)));
    }

    /**
     * Retrieves the MIME type of the resource pointed by &#64;uri.
     * <br>
     * <br>In the event the URI cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.  In the
     * <br>event that the MIME type cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
     * @param uri a valid URI
     * @return a newly allocated string or %NULL if the specified   URI cannot be found.
    */
    public ch.bailu.gtk.type.Str getMimeType(String uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_get_mime_type(asCPointer(), uri, 0L)));
    }

    /**
     * Gets the time when the bookmark for &#64;uri was last modified.
     * <br>
     * <br>In the event the URI cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI
     * @return a &#35;GDateTime
    */
    public DateTime getModifiedDateTime(@Nonnull ch.bailu.gtk.type.Str uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new DateTime(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_get_modified_date_time(asCPointer(), asCPointerNotNull(uri), 0L)));
    }

    /**
     * Gets the time when the bookmark for &#64;uri was last modified.
     * <br>
     * <br>In the event the URI cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI
     * @return a &#35;GDateTime
    */
    public DateTime getModifiedDateTime(String uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new DateTime(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_get_modified_date_time(asCPointer(), uri, 0L)));
    }

    /**
     * Gets the number of bookmarks inside &#64;bookmark.
     * @return the number of bookmarks
    */
    public int getSize()  {
        return JnaBookmarkFile.INST().g_bookmark_file_get_size(asCPointer());
    }

    /**
     * Returns the title of the bookmark for &#64;uri.
     * <br>
     * <br>If &#64;uri is %NULL, the title of &#64;bookmark is returned.
     * <br>
     * <br>In the event the URI cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI or %NULL
     * @return a newly allocated string or %NULL if the specified   URI cannot be found.
    */
    public ch.bailu.gtk.type.Str getTitle(@Nullable ch.bailu.gtk.type.Str uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_get_title(asCPointer(), asCPointer(uri), 0L)));
    }

    /**
     * Returns the title of the bookmark for &#64;uri.
     * <br>
     * <br>If &#64;uri is %NULL, the title of &#64;bookmark is returned.
     * <br>
     * <br>In the event the URI cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI or %NULL
     * @return a newly allocated string or %NULL if the specified   URI cannot be found.
    */
    public ch.bailu.gtk.type.Str getTitle(String uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_get_title(asCPointer(), uri, 0L)));
    }

    /**
     * Gets the time the bookmark for &#64;uri was last visited.
     * <br>
     * <br>In the event the URI cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI
     * @return a &#35;GDateTime
    */
    public DateTime getVisitedDateTime(@Nonnull ch.bailu.gtk.type.Str uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new DateTime(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_get_visited_date_time(asCPointer(), asCPointerNotNull(uri), 0L)));
    }

    /**
     * Gets the time the bookmark for &#64;uri was last visited.
     * <br>
     * <br>In the event the URI cannot be found, %NULL is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI
     * @return a &#35;GDateTime
    */
    public DateTime getVisitedDateTime(String uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return new DateTime(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_get_visited_date_time(asCPointer(), uri, 0L)));
    }

    /**
     * Checks whether the bookmark for &#64;uri inside &#64;bookmark has been
     * <br>registered by application &#64;name.
     * <br>
     * <br>In the event the URI cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI
     * @param name the name of the application
     * @return %TRUE if the application &#64;name was found
    */
    public boolean hasApplication(@Nonnull ch.bailu.gtk.type.Str uri, @Nonnull ch.bailu.gtk.type.Str name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_has_application(asCPointer(), asCPointerNotNull(uri), asCPointerNotNull(name), 0L);
    }

    /**
     * Checks whether the bookmark for &#64;uri inside &#64;bookmark has been
     * <br>registered by application &#64;name.
     * <br>
     * <br>In the event the URI cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI
     * @param name the name of the application
     * @return %TRUE if the application &#64;name was found
    */
    public boolean hasApplication(String uri, String name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_has_application(asCPointer(), uri, name, 0L);
    }

    /**
     * Checks whether &#64;group appears in the list of groups to which
     * <br>the bookmark for &#64;uri belongs to.
     * <br>
     * <br>In the event the URI cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI
     * @param group the group name to be searched
     * @return %TRUE if &#64;group was found.
    */
    public boolean hasGroup(@Nonnull ch.bailu.gtk.type.Str uri, @Nonnull ch.bailu.gtk.type.Str group) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_has_group(asCPointer(), asCPointerNotNull(uri), asCPointerNotNull(group), 0L);
    }

    /**
     * Checks whether &#64;group appears in the list of groups to which
     * <br>the bookmark for &#64;uri belongs to.
     * <br>
     * <br>In the event the URI cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param uri a valid URI
     * @param group the group name to be searched
     * @return %TRUE if &#64;group was found.
    */
    public boolean hasGroup(String uri, String group) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_has_group(asCPointer(), uri, group, 0L);
    }

    /**
     * Looks whether the desktop bookmark has an item with its URI set to &#64;uri.
     * @param uri a valid URI
     * @return %TRUE if &#64;uri is inside &#64;bookmark, %FALSE otherwise
    */
    public boolean hasItem(@Nonnull ch.bailu.gtk.type.Str uri)  {
        return JnaBookmarkFile.INST().g_bookmark_file_has_item(asCPointer(), asCPointerNotNull(uri));
    }

    /**
     * Looks whether the desktop bookmark has an item with its URI set to &#64;uri.
     * @param uri a valid URI
     * @return %TRUE if &#64;uri is inside &#64;bookmark, %FALSE otherwise
    */
    public boolean hasItem(String uri)  {
        return JnaBookmarkFile.INST().g_bookmark_file_has_item(asCPointer(), uri);
    }

    /**
     * Loads a bookmark file from memory into an empty &#35;GBookmarkFile
     * <br>structure.  If the object cannot be created then &#64;error is set to a
     * <br>&#35;GBookmarkFileError.
     * @param data desktop bookmarks    loaded in memory
     * @param length the length of &#64;data in bytes
     * @return %TRUE if a desktop bookmark could be loaded.
    */
    public boolean loadFromData(@Nonnull ch.bailu.gtk.type.Str data, long length) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_load_from_data(asCPointer(), asCPointerNotNull(data), length, 0L);
    }

    /**
     * Loads a bookmark file from memory into an empty &#35;GBookmarkFile
     * <br>structure.  If the object cannot be created then &#64;error is set to a
     * <br>&#35;GBookmarkFileError.
     * @param data desktop bookmarks    loaded in memory
     * @param length the length of &#64;data in bytes
     * @return %TRUE if a desktop bookmark could be loaded.
    */
    public boolean loadFromData(String data, long length) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_load_from_data(asCPointer(), data, length, 0L);
    }

    /**
     * Loads a desktop bookmark file into an empty &#35;GBookmarkFile structure.
     * <br>If the file could not be loaded then &#64;error is set to either a &#35;GFileError
     * <br>or &#35;GBookmarkFileError.
     * @param filename the path of a filename to load, in the     GLib file name encoding
     * @return %TRUE if a desktop bookmark file could be loaded
    */
    public boolean loadFromFile(@Nonnull ch.bailu.gtk.type.Str filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_load_from_file(asCPointer(), asCPointerNotNull(filename), 0L);
    }

    /**
     * Loads a desktop bookmark file into an empty &#35;GBookmarkFile structure.
     * <br>If the file could not be loaded then &#64;error is set to either a &#35;GFileError
     * <br>or &#35;GBookmarkFileError.
     * @param filename the path of a filename to load, in the     GLib file name encoding
     * @return %TRUE if a desktop bookmark file could be loaded
    */
    public boolean loadFromFile(String filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_load_from_file(asCPointer(), filename, 0L);
    }

    /**
     * Changes the URI of a bookmark item from &#64;old_uri to &#64;new_uri.  Any
     * <br>existing bookmark for &#64;new_uri will be overwritten.  If &#64;new_uri is
     * <br>%NULL, then the bookmark is removed.
     * <br>
     * <br>In the event the URI cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param old_uri a valid URI
     * @param new_uri a valid URI, or %NULL
     * @return %TRUE if the URI was successfully changed
    */
    public boolean moveItem(@Nonnull ch.bailu.gtk.type.Str old_uri, @Nullable ch.bailu.gtk.type.Str new_uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_move_item(asCPointer(), asCPointerNotNull(old_uri), asCPointer(new_uri), 0L);
    }

    /**
     * Changes the URI of a bookmark item from &#64;old_uri to &#64;new_uri.  Any
     * <br>existing bookmark for &#64;new_uri will be overwritten.  If &#64;new_uri is
     * <br>%NULL, then the bookmark is removed.
     * <br>
     * <br>In the event the URI cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * @param old_uri a valid URI
     * @param new_uri a valid URI, or %NULL
     * @return %TRUE if the URI was successfully changed
    */
    public boolean moveItem(String old_uri, String new_uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_move_item(asCPointer(), old_uri, new_uri, 0L);
    }

    /**
     * Removes application registered with &#64;name from the list of applications
     * <br>that have registered a bookmark for &#64;uri inside &#64;bookmark.
     * <br>
     * <br>In the event the URI cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * <br>In the event that no application with name &#64;app_name has registered
     * <br>a bookmark for &#64;uri,  %FALSE is returned and error is set to
     * <br>%G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED.
     * @param uri a valid URI
     * @param name the name of the application
     * @return %TRUE if the application was successfully removed.
    */
    public boolean removeApplication(@Nonnull ch.bailu.gtk.type.Str uri, @Nonnull ch.bailu.gtk.type.Str name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_remove_application(asCPointer(), asCPointerNotNull(uri), asCPointerNotNull(name), 0L);
    }

    /**
     * Removes application registered with &#64;name from the list of applications
     * <br>that have registered a bookmark for &#64;uri inside &#64;bookmark.
     * <br>
     * <br>In the event the URI cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * <br>In the event that no application with name &#64;app_name has registered
     * <br>a bookmark for &#64;uri,  %FALSE is returned and error is set to
     * <br>%G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED.
     * @param uri a valid URI
     * @param name the name of the application
     * @return %TRUE if the application was successfully removed.
    */
    public boolean removeApplication(String uri, String name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_remove_application(asCPointer(), uri, name, 0L);
    }

    /**
     * Removes &#64;group from the list of groups to which the bookmark
     * <br>for &#64;uri belongs to.
     * <br>
     * <br>In the event the URI cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * <br>In the event no group was defined, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
     * @param uri a valid URI
     * @param group the group name to be removed
     * @return %TRUE if &#64;group was successfully removed.
    */
    public boolean removeGroup(@Nonnull ch.bailu.gtk.type.Str uri, @Nonnull ch.bailu.gtk.type.Str group) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_remove_group(asCPointer(), asCPointerNotNull(uri), asCPointerNotNull(group), 0L);
    }

    /**
     * Removes &#64;group from the list of groups to which the bookmark
     * <br>for &#64;uri belongs to.
     * <br>
     * <br>In the event the URI cannot be found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * <br>In the event no group was defined, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
     * @param uri a valid URI
     * @param group the group name to be removed
     * @return %TRUE if &#64;group was successfully removed.
    */
    public boolean removeGroup(String uri, String group) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_remove_group(asCPointer(), uri, group, 0L);
    }

    /**
     * Removes the bookmark for &#64;uri from the bookmark file &#64;bookmark.
     * @param uri a valid URI
     * @return %TRUE if the bookmark was removed successfully.
    */
    public boolean removeItem(@Nonnull ch.bailu.gtk.type.Str uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_remove_item(asCPointer(), asCPointerNotNull(uri), 0L);
    }

    /**
     * Removes the bookmark for &#64;uri from the bookmark file &#64;bookmark.
     * @param uri a valid URI
     * @return %TRUE if the bookmark was removed successfully.
    */
    public boolean removeItem(String uri) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_remove_item(asCPointer(), uri, 0L);
    }

    /**
     * Sets the time the bookmark for &#64;uri was added into &#64;bookmark.
     * <br>
     * <br>If no bookmark for &#64;uri is found then it is created.
     * @param uri a valid URI
     * @param added a &#35;GDateTime
    */
    public void setAddedDateTime(@Nonnull ch.bailu.gtk.type.Str uri, @Nonnull DateTime added)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_added_date_time(asCPointer(), asCPointerNotNull(uri), asCPointerNotNull(added));
    }

    /**
     * Sets the time the bookmark for &#64;uri was added into &#64;bookmark.
     * <br>
     * <br>If no bookmark for &#64;uri is found then it is created.
     * @param uri a valid URI
     * @param added a &#35;GDateTime
    */
    public void setAddedDateTime(String uri, @Nonnull DateTime added)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_added_date_time(asCPointer(), uri, asCPointerNotNull(added));
    }

    /**
     * Sets the meta-data of application &#64;name inside the list of
     * <br>applications that have registered a bookmark for &#64;uri inside
     * <br>&#64;bookmark.
     * <br>
     * <br>You should rarely use this function; use g_bookmark_file_add_application()
     * <br>and g_bookmark_file_remove_application() instead.
     * <br>
     * <br>&#64;name can be any UTF-8 encoded string used to identify an
     * <br>application.
     * <br>&#64;exec can have one of these two modifiers: &quot;&#92;%f&quot;, which will
     * <br>be expanded as the local file name retrieved from the bookmark's
     * <br>URI; &quot;&#92;%u&quot;, which will be expanded as the bookmark's URI.
     * <br>The expansion is done automatically when retrieving the stored
     * <br>command line using the g_bookmark_file_get_application_info() function.
     * <br>&#64;count is the number of times the application has registered the
     * <br>bookmark; if is &lt; 0, the current registration count will be increased
     * <br>by one, if is 0, the application with &#64;name will be removed from
     * <br>the list of registered applications.
     * <br>&#64;stamp is the Unix time of the last registration.
     * <br>
     * <br>If you try to remove an application by setting its registration count to
     * <br>zero, and no bookmark for &#64;uri is found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND; similarly,
     * <br>in the event that no application &#64;name has registered a bookmark
     * <br>for &#64;uri,  %FALSE is returned and error is set to
     * <br>%G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED.  Otherwise, if no bookmark
     * <br>for &#64;uri is found, one is created.
     * @param uri a valid URI
     * @param name an application's name
     * @param exec an application's command line
     * @param count the number of registrations done for this application
     * @param stamp the time of the last registration for this application,    which may be %NULL if &#64;count is 0
     * @return %TRUE if the application's meta-data was successfully   changed.
    */
    public boolean setApplicationInfo(@Nonnull ch.bailu.gtk.type.Str uri, @Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str exec, int count, @Nullable DateTime stamp) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_set_application_info(asCPointer(), asCPointerNotNull(uri), asCPointerNotNull(name), asCPointerNotNull(exec), count, asCPointer(stamp), 0L);
    }

    /**
     * Sets the meta-data of application &#64;name inside the list of
     * <br>applications that have registered a bookmark for &#64;uri inside
     * <br>&#64;bookmark.
     * <br>
     * <br>You should rarely use this function; use g_bookmark_file_add_application()
     * <br>and g_bookmark_file_remove_application() instead.
     * <br>
     * <br>&#64;name can be any UTF-8 encoded string used to identify an
     * <br>application.
     * <br>&#64;exec can have one of these two modifiers: &quot;&#92;%f&quot;, which will
     * <br>be expanded as the local file name retrieved from the bookmark's
     * <br>URI; &quot;&#92;%u&quot;, which will be expanded as the bookmark's URI.
     * <br>The expansion is done automatically when retrieving the stored
     * <br>command line using the g_bookmark_file_get_application_info() function.
     * <br>&#64;count is the number of times the application has registered the
     * <br>bookmark; if is &lt; 0, the current registration count will be increased
     * <br>by one, if is 0, the application with &#64;name will be removed from
     * <br>the list of registered applications.
     * <br>&#64;stamp is the Unix time of the last registration.
     * <br>
     * <br>If you try to remove an application by setting its registration count to
     * <br>zero, and no bookmark for &#64;uri is found, %FALSE is returned and
     * <br>&#64;error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND; similarly,
     * <br>in the event that no application &#64;name has registered a bookmark
     * <br>for &#64;uri,  %FALSE is returned and error is set to
     * <br>%G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED.  Otherwise, if no bookmark
     * <br>for &#64;uri is found, one is created.
     * @param uri a valid URI
     * @param name an application's name
     * @param exec an application's command line
     * @param count the number of registrations done for this application
     * @param stamp the time of the last registration for this application,    which may be %NULL if &#64;count is 0
     * @return %TRUE if the application's meta-data was successfully   changed.
    */
    public boolean setApplicationInfo(String uri, String name, String exec, int count, @Nullable DateTime stamp) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_set_application_info(asCPointer(), uri, name, exec, count, asCPointer(stamp), 0L);
    }

    /**
     * Sets &#64;description as the description of the bookmark for &#64;uri.
     * <br>
     * <br>If &#64;uri is %NULL, the description of &#64;bookmark is set.
     * <br>
     * <br>If a bookmark for &#64;uri cannot be found then it is created.
     * @param uri a valid URI or %NULL
     * @param description a string
    */
    public void setDescription(@Nullable ch.bailu.gtk.type.Str uri, @Nonnull ch.bailu.gtk.type.Str description)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_description(asCPointer(), asCPointer(uri), asCPointerNotNull(description));
    }

    /**
     * Sets &#64;description as the description of the bookmark for &#64;uri.
     * <br>
     * <br>If &#64;uri is %NULL, the description of &#64;bookmark is set.
     * <br>
     * <br>If a bookmark for &#64;uri cannot be found then it is created.
     * @param uri a valid URI or %NULL
     * @param description a string
    */
    public void setDescription(String uri, String description)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_description(asCPointer(), uri, description);
    }

    /**
     * Sets the icon for the bookmark for &#64;uri. If &#64;href is %NULL, unsets
     * <br>the currently set icon. &#64;href can either be a full URL for the icon
     * <br>file or the icon name following the Icon Naming specification.
     * <br>
     * <br>If no bookmark for &#64;uri is found one is created.
     * @param uri a valid URI
     * @param href the URI of the icon for the bookmark, or %NULL
     * @param mime_type the MIME type of the icon for the bookmark
    */
    public void setIcon(@Nonnull ch.bailu.gtk.type.Str uri, @Nullable ch.bailu.gtk.type.Str href, @Nonnull ch.bailu.gtk.type.Str mime_type)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_icon(asCPointer(), asCPointerNotNull(uri), asCPointer(href), asCPointerNotNull(mime_type));
    }

    /**
     * Sets the icon for the bookmark for &#64;uri. If &#64;href is %NULL, unsets
     * <br>the currently set icon. &#64;href can either be a full URL for the icon
     * <br>file or the icon name following the Icon Naming specification.
     * <br>
     * <br>If no bookmark for &#64;uri is found one is created.
     * @param uri a valid URI
     * @param href the URI of the icon for the bookmark, or %NULL
     * @param mime_type the MIME type of the icon for the bookmark
    */
    public void setIcon(String uri, String href, String mime_type)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_icon(asCPointer(), uri, href, mime_type);
    }

    /**
     * Sets the private flag of the bookmark for &#64;uri.
     * <br>
     * <br>If a bookmark for &#64;uri cannot be found then it is created.
     * @param uri a valid URI
     * @param is_private %TRUE if the bookmark should be marked as private
    */
    public void setIsPrivate(@Nonnull ch.bailu.gtk.type.Str uri, boolean is_private)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_is_private(asCPointer(), asCPointerNotNull(uri), is_private);
    }

    /**
     * Sets the private flag of the bookmark for &#64;uri.
     * <br>
     * <br>If a bookmark for &#64;uri cannot be found then it is created.
     * @param uri a valid URI
     * @param is_private %TRUE if the bookmark should be marked as private
    */
    public void setIsPrivate(String uri, boolean is_private)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_is_private(asCPointer(), uri, is_private);
    }

    /**
     * Sets &#64;mime_type as the MIME type of the bookmark for &#64;uri.
     * <br>
     * <br>If a bookmark for &#64;uri cannot be found then it is created.
     * @param uri a valid URI
     * @param mime_type a MIME type
    */
    public void setMimeType(@Nonnull ch.bailu.gtk.type.Str uri, @Nonnull ch.bailu.gtk.type.Str mime_type)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_mime_type(asCPointer(), asCPointerNotNull(uri), asCPointerNotNull(mime_type));
    }

    /**
     * Sets &#64;mime_type as the MIME type of the bookmark for &#64;uri.
     * <br>
     * <br>If a bookmark for &#64;uri cannot be found then it is created.
     * @param uri a valid URI
     * @param mime_type a MIME type
    */
    public void setMimeType(String uri, String mime_type)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_mime_type(asCPointer(), uri, mime_type);
    }

    /**
     * Sets the last time the bookmark for &#64;uri was last modified.
     * <br>
     * <br>If no bookmark for &#64;uri is found then it is created.
     * <br>
     * <br>The &quot;modified&quot; time should only be set when the bookmark's meta-data
     * <br>was actually changed.  Every function of &#35;GBookmarkFile that
     * <br>modifies a bookmark also changes the modification time, except for
     * <br>g_bookmark_file_set_visited_date_time().
     * @param uri a valid URI
     * @param modified a &#35;GDateTime
    */
    public void setModifiedDateTime(@Nonnull ch.bailu.gtk.type.Str uri, @Nonnull DateTime modified)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_modified_date_time(asCPointer(), asCPointerNotNull(uri), asCPointerNotNull(modified));
    }

    /**
     * Sets the last time the bookmark for &#64;uri was last modified.
     * <br>
     * <br>If no bookmark for &#64;uri is found then it is created.
     * <br>
     * <br>The &quot;modified&quot; time should only be set when the bookmark's meta-data
     * <br>was actually changed.  Every function of &#35;GBookmarkFile that
     * <br>modifies a bookmark also changes the modification time, except for
     * <br>g_bookmark_file_set_visited_date_time().
     * @param uri a valid URI
     * @param modified a &#35;GDateTime
    */
    public void setModifiedDateTime(String uri, @Nonnull DateTime modified)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_modified_date_time(asCPointer(), uri, asCPointerNotNull(modified));
    }

    /**
     * Sets &#64;title as the title of the bookmark for &#64;uri inside the
     * <br>bookmark file &#64;bookmark.
     * <br>
     * <br>If &#64;uri is %NULL, the title of &#64;bookmark is set.
     * <br>
     * <br>If a bookmark for &#64;uri cannot be found then it is created.
     * @param uri a valid URI or %NULL
     * @param title a UTF-8 encoded string
    */
    public void setTitle(@Nullable ch.bailu.gtk.type.Str uri, @Nonnull ch.bailu.gtk.type.Str title)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_title(asCPointer(), asCPointer(uri), asCPointerNotNull(title));
    }

    /**
     * Sets &#64;title as the title of the bookmark for &#64;uri inside the
     * <br>bookmark file &#64;bookmark.
     * <br>
     * <br>If &#64;uri is %NULL, the title of &#64;bookmark is set.
     * <br>
     * <br>If a bookmark for &#64;uri cannot be found then it is created.
     * @param uri a valid URI or %NULL
     * @param title a UTF-8 encoded string
    */
    public void setTitle(String uri, String title)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_title(asCPointer(), uri, title);
    }

    /**
     * Sets the time the bookmark for &#64;uri was last visited.
     * <br>
     * <br>If no bookmark for &#64;uri is found then it is created.
     * <br>
     * <br>The &quot;visited&quot; time should only be set if the bookmark was launched,
     * <br>either using the command line retrieved by g_bookmark_file_get_application_info()
     * <br>or by the default application for the bookmark's MIME type, retrieved
     * <br>using g_bookmark_file_get_mime_type().  Changing the &quot;visited&quot; time
     * <br>does not affect the &quot;modified&quot; time.
     * @param uri a valid URI
     * @param visited a &#35;GDateTime
    */
    public void setVisitedDateTime(@Nonnull ch.bailu.gtk.type.Str uri, @Nonnull DateTime visited)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_visited_date_time(asCPointer(), asCPointerNotNull(uri), asCPointerNotNull(visited));
    }

    /**
     * Sets the time the bookmark for &#64;uri was last visited.
     * <br>
     * <br>If no bookmark for &#64;uri is found then it is created.
     * <br>
     * <br>The &quot;visited&quot; time should only be set if the bookmark was launched,
     * <br>either using the command line retrieved by g_bookmark_file_get_application_info()
     * <br>or by the default application for the bookmark's MIME type, retrieved
     * <br>using g_bookmark_file_get_mime_type().  Changing the &quot;visited&quot; time
     * <br>does not affect the &quot;modified&quot; time.
     * @param uri a valid URI
     * @param visited a &#35;GDateTime
    */
    public void setVisitedDateTime(String uri, @Nonnull DateTime visited)  {
        JnaBookmarkFile.INST().g_bookmark_file_set_visited_date_time(asCPointer(), uri, asCPointerNotNull(visited));
    }

    /**
     * This function outputs &#64;bookmark as a string.
     * @param length return location for the length of the returned string, or %NULL
     * @return    a newly allocated string holding the contents of the &#35;GBookmarkFile
    */
    public ch.bailu.gtk.type.Str toData(@Nullable ch.bailu.gtk.type.Int64 length) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_to_data(asCPointer(), asCPointer(length), 0L)));
    }

    /**
     * This function outputs &#64;bookmark into a file.  The write process is
     * <br>guaranteed to be atomic by using g_file_set_contents() internally.
     * @param filename path of the output file
     * @return %TRUE if the file was successfully written.
    */
    public boolean toFile(@Nonnull ch.bailu.gtk.type.Str filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_to_file(asCPointer(), asCPointerNotNull(filename), 0L);
    }

    /**
     * This function outputs &#64;bookmark into a file.  The write process is
     * <br>guaranteed to be atomic by using g_file_set_contents() internally.
     * @param filename path of the output file
     * @return %TRUE if the file was successfully written.
    */
    public boolean toFile(String filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaBookmarkFile.INST().g_bookmark_file_to_file(asCPointer(), filename, 0L);
    }

    /**
     * 
     * @return 
    */
    public static int errorQuark()  {
        return JnaBookmarkFile.INST().g_bookmark_file_error_quark();
    }

    /**
     * Creates a new empty &#35;GBookmarkFile object.
     * <br>
     * <br>Use g_bookmark_file_load_from_file(), g_bookmark_file_load_from_data()
     * <br>or g_bookmark_file_load_from_data_dirs() to read an existing bookmark
     * <br>file.
     * @return an empty &#35;GBookmarkFile
    */
    public static BookmarkFile _new()  {
        return new BookmarkFile(new PointerContainer(JnaBookmarkFile.INST().g_bookmark_file_new()));
    }

}

/*
record-type
flag-disguised
all-fields-supported

[MethodModel:cb-deprecated:getAdded:[ParameterModel:Supported:{G_::{c:time_t}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-deprecated:java-type-not-supported:java-type-not-supported:java-type-not-supported:getAppInfo:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:time_t*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:getApplicationInfo:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:unsigned int*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateTime**}}:{j:}]

[MethodModel:cb-return-value-not-supported:getApplications:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getGroups:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:java-type-not-supported:getIcon:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:cb-deprecated:getModified:[ParameterModel:Supported:{G_::{c:time_t}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getUris:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-deprecated:getVisited:[ParameterModel:Supported:{G_::{c:time_t}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:java-type-not-supported:loadFromDataDirs:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[MethodModel:cb-deprecated:setAdded:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:time_t}}:{j:long}]

[MethodModel:cb-deprecated:setAppInfo:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:time_t}}:{j:long}]

[MethodModel:java-type-not-supported:setGroups:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:const gchar**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]

[MethodModel:cb-deprecated:setModified:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:time_t}}:{j:long}]

[MethodModel:cb-deprecated:setVisited:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:time_t}}:{j:long}]
*/
