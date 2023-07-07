/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Functionality for manipulating basic metadata for files. &#35;GFileInfo
 * <br>implements methods for getting information that all files should
 * <br>contain, and allows for manipulation of extended attributes.
 * <br>
 * <br>See [GFileAttribute][gio-GFileAttribute] for more information on how
 * <br>GIO handles file attributes.
 * <br>
 * <br>To obtain a &#35;GFileInfo for a &#35;GFile, use g_file_query_info() (or its
 * <br>async variant). To obtain a &#35;GFileInfo for a file input or output
 * <br>stream, use g_file_input_stream_query_info() or
 * <br>g_file_output_stream_query_info() (or their async variants).
 * <br>
 * <br>To change the actual attributes of a file, you should then set the
 * <br>attribute in the &#35;GFileInfo and call g_file_set_attributes_from_info()
 * <br>or g_file_set_attributes_async() on a GFile.
 * <br>
 * <br>However, not all attributes can be changed in the file. For instance,
 * <br>the actual size of a file cannot be changed via g_file_info_set_size().
 * <br>You may call g_file_query_settable_attributes() and
 * <br>g_file_query_writable_namespaces() to discover the settable attributes
 * <br>of a particular file at runtime.
 * <br>
 * <br>The direct accessors, such as g_file_info_get_name(), are slightly more
 * <br>optimized than the generic attribute accessors, such as
 * <br>g_file_info_get_attribute_byte_string().This optimization will matter
 * <br>only if calling the API in a tight loop.
 * <br>
 * <br>&#35;GFileAttributeMatcher allows for searching through a &#35;GFileInfo for
 * <br>attributes.
 * <p><a href="https://docs.gtk.org/gio/class.FileInfo.html">https://docs.gtk.org/gio/class.FileInfo.html</a></p>
*/
public class FileInfo extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileInfo.class.getCanonicalName());
    }

    public FileInfo(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new file info structure.
    */
    public FileInfo() {
        super(cast(JnaFileInfo.INST().g_file_info_new()));
    }

    /**
     * Clears the status information from &#64;info.
    */
    public void clearStatus()  {
        JnaFileInfo.INST().g_file_info_clear_status(asCPointer());
    }

    /**
     * First clears all of the [GFileAttribute][gio-GFileAttribute] of &#64;dest_info,
     * <br>and then copies all of the file attributes from &#64;src_info to &#64;dest_info.
     * @param dest_info destination to copy attributes to.
    */
    public void copyInto(@Nonnull FileInfo dest_info)  {
        JnaFileInfo.INST().g_file_info_copy_into(asCPointer(), asCPointerNotNull(dest_info));
    }

    /**
     * Duplicates a file info structure.
     * @return a duplicate &#35;GFileInfo of &#64;other.
    */
    public FileInfo dup()  {
        return new FileInfo(new PointerContainer(JnaFileInfo.INST().g_file_info_dup(asCPointer())));
    }

    /**
     * Gets the access time of the current &#64;info and returns it as a
     * <br>&#35;GDateTime.
     * <br>
     * <br>This requires the %G_FILE_ATTRIBUTE_TIME_ACCESS attribute. If
     * <br>%G_FILE_ATTRIBUTE_TIME_ACCESS_USEC is provided, the resulting &#35;GDateTime
     * <br>will have microsecond precision.
     * <br>
     * <br>If nanosecond precision is needed, %G_FILE_ATTRIBUTE_TIME_ACCESS_NSEC must
     * <br>be queried separately using g_file_info_get_attribute_uint32().
     * @return access time, or %NULL if unknown
    */
    public ch.bailu.gtk.glib.DateTime getAccessDateTime()  {
        return new ch.bailu.gtk.glib.DateTime(new PointerContainer(JnaFileInfo.INST().g_file_info_get_access_date_time(asCPointer())));
    }

    /**
     * Gets the value of a attribute, formatted as a string.
     * <br>This escapes things as needed to make the string valid
     * <br>UTF-8.
     * @param attribute a file attribute key.
     * @return a UTF-8 string associated with the given &#64;attribute, or    %NULL if the attribute wasn’t set.    When you're done with the string it must be freed with g_free().
    */
    public ch.bailu.gtk.type.Str getAttributeAsString(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileInfo.INST().g_file_info_get_attribute_as_string(asCPointer(), asCPointerNotNull(attribute))));
    }

    /**
     * Gets the value of a attribute, formatted as a string.
     * <br>This escapes things as needed to make the string valid
     * <br>UTF-8.
     * @param attribute a file attribute key.
     * @return a UTF-8 string associated with the given &#64;attribute, or    %NULL if the attribute wasn’t set.    When you're done with the string it must be freed with g_free().
    */
    public ch.bailu.gtk.type.Str getAttributeAsString(String attribute)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileInfo.INST().g_file_info_get_attribute_as_string(asCPointer(), attribute)));
    }

    /**
     * Gets the value of a boolean attribute. If the attribute does not
     * <br>contain a boolean value, %FALSE will be returned.
     * @param attribute a file attribute key.
     * @return the boolean value contained within the attribute.
    */
    public boolean getAttributeBoolean(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_boolean(asCPointer(), asCPointerNotNull(attribute));
    }

    /**
     * Gets the value of a boolean attribute. If the attribute does not
     * <br>contain a boolean value, %FALSE will be returned.
     * @param attribute a file attribute key.
     * @return the boolean value contained within the attribute.
    */
    public boolean getAttributeBoolean(String attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_boolean(asCPointer(), attribute);
    }

    /**
     * Gets the value of a byte string attribute. If the attribute does
     * <br>not contain a byte string, %NULL will be returned.
     * @param attribute a file attribute key.
     * @return the contents of the &#64;attribute value as a byte string, or %NULL otherwise.
    */
    public ch.bailu.gtk.type.Str getAttributeByteString(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileInfo.INST().g_file_info_get_attribute_byte_string(asCPointer(), asCPointerNotNull(attribute))));
    }

    /**
     * Gets the value of a byte string attribute. If the attribute does
     * <br>not contain a byte string, %NULL will be returned.
     * @param attribute a file attribute key.
     * @return the contents of the &#64;attribute value as a byte string, or %NULL otherwise.
    */
    public ch.bailu.gtk.type.Str getAttributeByteString(String attribute)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileInfo.INST().g_file_info_get_attribute_byte_string(asCPointer(), attribute)));
    }

    /**
     * Gets a signed 32-bit integer contained within the attribute. If the
     * <br>attribute does not contain a signed 32-bit integer, or is invalid,
     * <br>0 will be returned.
     * @param attribute a file attribute key.
     * @return a signed 32-bit integer from the attribute.
    */
    public int getAttributeInt32(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_int32(asCPointer(), asCPointerNotNull(attribute));
    }

    /**
     * Gets a signed 32-bit integer contained within the attribute. If the
     * <br>attribute does not contain a signed 32-bit integer, or is invalid,
     * <br>0 will be returned.
     * @param attribute a file attribute key.
     * @return a signed 32-bit integer from the attribute.
    */
    public int getAttributeInt32(String attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_int32(asCPointer(), attribute);
    }

    /**
     * Gets a signed 64-bit integer contained within the attribute. If the
     * <br>attribute does not contain a signed 64-bit integer, or is invalid,
     * <br>0 will be returned.
     * @param attribute a file attribute key.
     * @return a signed 64-bit integer from the attribute.
    */
    public long getAttributeInt64(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_int64(asCPointer(), asCPointerNotNull(attribute));
    }

    /**
     * Gets a signed 64-bit integer contained within the attribute. If the
     * <br>attribute does not contain a signed 64-bit integer, or is invalid,
     * <br>0 will be returned.
     * @param attribute a file attribute key.
     * @return a signed 64-bit integer from the attribute.
    */
    public long getAttributeInt64(String attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_int64(asCPointer(), attribute);
    }

    /**
     * Gets the value of a &#35;GObject attribute. If the attribute does
     * <br>not contain a &#35;GObject, %NULL will be returned.
     * @param attribute a file attribute key.
     * @return a &#35;GObject associated with the given &#64;attribute, or %NULL otherwise.
    */
    public ch.bailu.gtk.gobject.Object getAttributeObject(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return new ch.bailu.gtk.gobject.Object(new PointerContainer(JnaFileInfo.INST().g_file_info_get_attribute_object(asCPointer(), asCPointerNotNull(attribute))));
    }

    /**
     * Gets the value of a &#35;GObject attribute. If the attribute does
     * <br>not contain a &#35;GObject, %NULL will be returned.
     * @param attribute a file attribute key.
     * @return a &#35;GObject associated with the given &#64;attribute, or %NULL otherwise.
    */
    public ch.bailu.gtk.gobject.Object getAttributeObject(String attribute)  {
        return new ch.bailu.gtk.gobject.Object(new PointerContainer(JnaFileInfo.INST().g_file_info_get_attribute_object(asCPointer(), attribute)));
    }

    /**
     * Gets the attribute status for an attribute key.
     * @param attribute a file attribute key
     * @return a &#35;GFileAttributeStatus for the given &#64;attribute, or    %G_FILE_ATTRIBUTE_STATUS_UNSET if the key is invalid.
    */
    public int getAttributeStatus(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_status(asCPointer(), asCPointerNotNull(attribute));
    }

    /**
     * Gets the attribute status for an attribute key.
     * @param attribute a file attribute key
     * @return a &#35;GFileAttributeStatus for the given &#64;attribute, or    %G_FILE_ATTRIBUTE_STATUS_UNSET if the key is invalid.
    */
    public int getAttributeStatus(String attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_status(asCPointer(), attribute);
    }

    /**
     * Gets the value of a string attribute. If the attribute does
     * <br>not contain a string, %NULL will be returned.
     * @param attribute a file attribute key.
     * @return the contents of the &#64;attribute value as a UTF-8 string, or %NULL otherwise.
    */
    public ch.bailu.gtk.type.Str getAttributeString(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileInfo.INST().g_file_info_get_attribute_string(asCPointer(), asCPointerNotNull(attribute))));
    }

    /**
     * Gets the value of a string attribute. If the attribute does
     * <br>not contain a string, %NULL will be returned.
     * @param attribute a file attribute key.
     * @return the contents of the &#64;attribute value as a UTF-8 string, or %NULL otherwise.
    */
    public ch.bailu.gtk.type.Str getAttributeString(String attribute)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileInfo.INST().g_file_info_get_attribute_string(asCPointer(), attribute)));
    }

    /**
     * Gets the value of a stringv attribute. If the attribute does
     * <br>not contain a stringv, %NULL will be returned.
     * @param attribute a file attribute key.
     * @return the contents of the &#64;attribute value as a stringv, or %NULL otherwise. Do not free. These returned strings are UTF-8.
    */
    public ch.bailu.gtk.type.Strs getAttributeStringv(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaFileInfo.INST().g_file_info_get_attribute_stringv(asCPointer(), asCPointerNotNull(attribute))));
    }

    /**
     * Gets the value of a stringv attribute. If the attribute does
     * <br>not contain a stringv, %NULL will be returned.
     * @param attribute a file attribute key.
     * @return the contents of the &#64;attribute value as a stringv, or %NULL otherwise. Do not free. These returned strings are UTF-8.
    */
    public ch.bailu.gtk.type.Strs getAttributeStringv(String attribute)  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaFileInfo.INST().g_file_info_get_attribute_stringv(asCPointer(), attribute)));
    }

    /**
     * Gets the attribute type for an attribute key.
     * @param attribute a file attribute key.
     * @return a &#35;GFileAttributeType for the given &#64;attribute, or %G_FILE_ATTRIBUTE_TYPE_INVALID if the key is not set.
    */
    public int getAttributeType(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_type(asCPointer(), asCPointerNotNull(attribute));
    }

    /**
     * Gets the attribute type for an attribute key.
     * @param attribute a file attribute key.
     * @return a &#35;GFileAttributeType for the given &#64;attribute, or %G_FILE_ATTRIBUTE_TYPE_INVALID if the key is not set.
    */
    public int getAttributeType(String attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_type(asCPointer(), attribute);
    }

    /**
     * Gets an unsigned 32-bit integer contained within the attribute. If the
     * <br>attribute does not contain an unsigned 32-bit integer, or is invalid,
     * <br>0 will be returned.
     * @param attribute a file attribute key.
     * @return an unsigned 32-bit integer from the attribute.
    */
    public int getAttributeUint32(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_uint32(asCPointer(), asCPointerNotNull(attribute));
    }

    /**
     * Gets an unsigned 32-bit integer contained within the attribute. If the
     * <br>attribute does not contain an unsigned 32-bit integer, or is invalid,
     * <br>0 will be returned.
     * @param attribute a file attribute key.
     * @return an unsigned 32-bit integer from the attribute.
    */
    public int getAttributeUint32(String attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_uint32(asCPointer(), attribute);
    }

    /**
     * Gets a unsigned 64-bit integer contained within the attribute. If the
     * <br>attribute does not contain an unsigned 64-bit integer, or is invalid,
     * <br>0 will be returned.
     * @param attribute a file attribute key.
     * @return a unsigned 64-bit integer from the attribute.
    */
    public long getAttributeUint64(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_uint64(asCPointer(), asCPointerNotNull(attribute));
    }

    /**
     * Gets a unsigned 64-bit integer contained within the attribute. If the
     * <br>attribute does not contain an unsigned 64-bit integer, or is invalid,
     * <br>0 will be returned.
     * @param attribute a file attribute key.
     * @return a unsigned 64-bit integer from the attribute.
    */
    public long getAttributeUint64(String attribute)  {
        return JnaFileInfo.INST().g_file_info_get_attribute_uint64(asCPointer(), attribute);
    }

    /**
     * Gets the file's content type.
     * @return a string containing the file's content type, or %NULL if unknown.
    */
    public ch.bailu.gtk.type.Str getContentType()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileInfo.INST().g_file_info_get_content_type(asCPointer())));
    }

    /**
     * Gets the creation time of the current &#64;info and returns it as a
     * <br>&#35;GDateTime.
     * <br>
     * <br>This requires the %G_FILE_ATTRIBUTE_TIME_CREATED attribute. If
     * <br>%G_FILE_ATTRIBUTE_TIME_CREATED_USEC is provided, the resulting &#35;GDateTime
     * <br>will have microsecond precision.
     * <br>
     * <br>If nanosecond precision is needed, %G_FILE_ATTRIBUTE_TIME_CREATED_NSEC must
     * <br>be queried separately using g_file_info_get_attribute_uint32().
     * @return creation time, or %NULL if unknown
    */
    public ch.bailu.gtk.glib.DateTime getCreationDateTime()  {
        return new ch.bailu.gtk.glib.DateTime(new PointerContainer(JnaFileInfo.INST().g_file_info_get_creation_date_time(asCPointer())));
    }

    /**
     * Returns the &#35;GDateTime representing the deletion date of the file, as
     * <br>available in G_FILE_ATTRIBUTE_TRASH_DELETION_DATE. If the
     * <br>G_FILE_ATTRIBUTE_TRASH_DELETION_DATE attribute is unset, %NULL is returned.
     * @return a &#35;GDateTime, or %NULL.
    */
    public ch.bailu.gtk.glib.DateTime getDeletionDate()  {
        return new ch.bailu.gtk.glib.DateTime(new PointerContainer(JnaFileInfo.INST().g_file_info_get_deletion_date(asCPointer())));
    }

    /**
     * Gets a display name for a file. This is guaranteed to always be set.
     * @return a string containing the display name.
    */
    public ch.bailu.gtk.type.Str getDisplayName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileInfo.INST().g_file_info_get_display_name(asCPointer())));
    }

    /**
     * Gets the edit name for a file.
     * @return a string containing the edit name.
    */
    public ch.bailu.gtk.type.Str getEditName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileInfo.INST().g_file_info_get_edit_name(asCPointer())));
    }

    /**
     * Gets the [entity tag][gfile-etag] for a given
     * <br>&#35;GFileInfo. See %G_FILE_ATTRIBUTE_ETAG_VALUE.
     * @return a string containing the value of the &quot;etag:value&quot; attribute.
    */
    public ch.bailu.gtk.type.Str getEtag()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileInfo.INST().g_file_info_get_etag(asCPointer())));
    }

    /**
     * Gets a file's type (whether it is a regular file, symlink, etc).
     * <br>This is different from the file's content type, see g_file_info_get_content_type().
     * @return a &#35;GFileType for the given file.
    */
    public int getFileType()  {
        return JnaFileInfo.INST().g_file_info_get_file_type(asCPointer());
    }

    /**
     * Gets the icon for a file.
     * @return &#35;GIcon for the given &#64;info.
    */
    public Icon getIcon()  {
        return new Icon(new PointerContainer(JnaFileInfo.INST().g_file_info_get_icon(asCPointer())));
    }

    /**
     * Checks if a file is a backup file.
     * @return %TRUE if file is a backup file, %FALSE otherwise.
    */
    public boolean getIsBackup()  {
        return JnaFileInfo.INST().g_file_info_get_is_backup(asCPointer());
    }

    /**
     * Checks if a file is hidden.
     * @return %TRUE if the file is a hidden file, %FALSE otherwise.
    */
    public boolean getIsHidden()  {
        return JnaFileInfo.INST().g_file_info_get_is_hidden(asCPointer());
    }

    /**
     * Checks if a file is a symlink.
     * @return %TRUE if the given &#64;info is a symlink.
    */
    public boolean getIsSymlink()  {
        return JnaFileInfo.INST().g_file_info_get_is_symlink(asCPointer());
    }

    /**
     * Gets the modification time of the current &#64;info and returns it as a
     * <br>&#35;GDateTime.
     * <br>
     * <br>This requires the %G_FILE_ATTRIBUTE_TIME_MODIFIED attribute. If
     * <br>%G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC is provided, the resulting &#35;GDateTime
     * <br>will have microsecond precision.
     * <br>
     * <br>If nanosecond precision is needed, %G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC must
     * <br>be queried separately using g_file_info_get_attribute_uint32().
     * @return modification time, or %NULL if unknown
    */
    public ch.bailu.gtk.glib.DateTime getModificationDateTime()  {
        return new ch.bailu.gtk.glib.DateTime(new PointerContainer(JnaFileInfo.INST().g_file_info_get_modification_date_time(asCPointer())));
    }

    /**
     * Gets the name for a file. This is guaranteed to always be set.
     * @return a string containing the file name.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileInfo.INST().g_file_info_get_name(asCPointer())));
    }

    /**
     * Gets the value of the sort_order attribute from the &#35;GFileInfo.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
     * @return a &#35;gint32 containing the value of the &quot;standard::sort_order&quot; attribute.
    */
    public int getSortOrder()  {
        return JnaFileInfo.INST().g_file_info_get_sort_order(asCPointer());
    }

    /**
     * Gets the symbolic icon for a file.
     * @return &#35;GIcon for the given &#64;info.
    */
    public Icon getSymbolicIcon()  {
        return new Icon(new PointerContainer(JnaFileInfo.INST().g_file_info_get_symbolic_icon(asCPointer())));
    }

    /**
     * Gets the symlink target for a given &#35;GFileInfo.
     * @return a string containing the symlink target.
    */
    public ch.bailu.gtk.type.Str getSymlinkTarget()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileInfo.INST().g_file_info_get_symlink_target(asCPointer())));
    }

    /**
     * Checks if a file info structure has an attribute named &#64;attribute.
     * @param attribute a file attribute key.
     * @return %TRUE if &#64;info has an attribute named &#64;attribute,     %FALSE otherwise.
    */
    public boolean hasAttribute(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        return JnaFileInfo.INST().g_file_info_has_attribute(asCPointer(), asCPointerNotNull(attribute));
    }

    /**
     * Checks if a file info structure has an attribute named &#64;attribute.
     * @param attribute a file attribute key.
     * @return %TRUE if &#64;info has an attribute named &#64;attribute,     %FALSE otherwise.
    */
    public boolean hasAttribute(String attribute)  {
        return JnaFileInfo.INST().g_file_info_has_attribute(asCPointer(), attribute);
    }

    /**
     * Checks if a file info structure has an attribute in the
     * <br>specified &#64;name_space.
     * @param name_space a file attribute namespace.
     * @return %TRUE if &#64;info has an attribute in &#64;name_space,     %FALSE otherwise.
    */
    public boolean hasNamespace(@Nonnull ch.bailu.gtk.type.Str name_space)  {
        return JnaFileInfo.INST().g_file_info_has_namespace(asCPointer(), asCPointerNotNull(name_space));
    }

    /**
     * Checks if a file info structure has an attribute in the
     * <br>specified &#64;name_space.
     * @param name_space a file attribute namespace.
     * @return %TRUE if &#64;info has an attribute in &#64;name_space,     %FALSE otherwise.
    */
    public boolean hasNamespace(String name_space)  {
        return JnaFileInfo.INST().g_file_info_has_namespace(asCPointer(), name_space);
    }

    /**
     * Lists the file info structure's attributes.
     * @param name_space a file attribute key's namespace, or %NULL to list   all attributes.
     * @return a null-terminated array of strings of all of the possible attribute types for the given &#64;name_space, or %NULL on error.
    */
    public ch.bailu.gtk.type.Strs listAttributes(@Nullable ch.bailu.gtk.type.Str name_space)  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaFileInfo.INST().g_file_info_list_attributes(asCPointer(), asCPointer(name_space))));
    }

    /**
     * Lists the file info structure's attributes.
     * @param name_space a file attribute key's namespace, or %NULL to list   all attributes.
     * @return a null-terminated array of strings of all of the possible attribute types for the given &#64;name_space, or %NULL on error.
    */
    public ch.bailu.gtk.type.Strs listAttributes(String name_space)  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaFileInfo.INST().g_file_info_list_attributes(asCPointer(), name_space)));
    }

    /**
     * Removes all cases of &#64;attribute from &#64;info if it exists.
     * @param attribute a file attribute key.
    */
    public void removeAttribute(@Nonnull ch.bailu.gtk.type.Str attribute)  {
        JnaFileInfo.INST().g_file_info_remove_attribute(asCPointer(), asCPointerNotNull(attribute));
    }

    /**
     * Removes all cases of &#64;attribute from &#64;info if it exists.
     * @param attribute a file attribute key.
    */
    public void removeAttribute(String attribute)  {
        JnaFileInfo.INST().g_file_info_remove_attribute(asCPointer(), attribute);
    }

    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_ACCESS and
     * <br>%G_FILE_ATTRIBUTE_TIME_ACCESS_USEC attributes in the file info to the
     * <br>given date/time value.
     * <br>
     * <br>%G_FILE_ATTRIBUTE_TIME_ACCESS_NSEC will be cleared.
     * @param atime a &#35;GDateTime.
    */
    public void setAccessDateTime(@Nonnull ch.bailu.gtk.glib.DateTime atime)  {
        JnaFileInfo.INST().g_file_info_set_access_date_time(asCPointer(), asCPointerNotNull(atime));
    }

    /**
     * Sets the &#64;attribute to contain the given value, if possible. To unset the
     * <br>attribute, use %G_FILE_ATTRIBUTE_TYPE_INVALID for &#64;type.
     * @param attribute a file attribute key.
     * @param type a &#35;GFileAttributeType
     * @param value_p pointer to the value
    */
    public void setAttribute(@Nonnull ch.bailu.gtk.type.Str attribute, int type, @Nonnull ch.bailu.gtk.type.Pointer value_p)  {
        JnaFileInfo.INST().g_file_info_set_attribute(asCPointer(), asCPointerNotNull(attribute), type, asCPointerNotNull(value_p));
    }

    /**
     * Sets the &#64;attribute to contain the given value, if possible. To unset the
     * <br>attribute, use %G_FILE_ATTRIBUTE_TYPE_INVALID for &#64;type.
     * @param attribute a file attribute key.
     * @param type a &#35;GFileAttributeType
     * @param value_p pointer to the value
    */
    public void setAttribute(String attribute, int type, @Nonnull ch.bailu.gtk.type.Pointer value_p)  {
        JnaFileInfo.INST().g_file_info_set_attribute(asCPointer(), attribute, type, asCPointerNotNull(value_p));
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value a boolean value.
    */
    public void setAttributeBoolean(@Nonnull ch.bailu.gtk.type.Str attribute, boolean attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_boolean(asCPointer(), asCPointerNotNull(attribute), attr_value);
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value a boolean value.
    */
    public void setAttributeBoolean(String attribute, boolean attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_boolean(asCPointer(), attribute, attr_value);
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value a byte string.
    */
    public void setAttributeByteString(@Nonnull ch.bailu.gtk.type.Str attribute, @Nonnull ch.bailu.gtk.type.Str attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_byte_string(asCPointer(), asCPointerNotNull(attribute), asCPointerNotNull(attr_value));
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value a byte string.
    */
    public void setAttributeByteString(String attribute, String attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_byte_string(asCPointer(), attribute, attr_value);
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value a signed 32-bit integer
    */
    public void setAttributeInt32(@Nonnull ch.bailu.gtk.type.Str attribute, int attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_int32(asCPointer(), asCPointerNotNull(attribute), attr_value);
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value a signed 32-bit integer
    */
    public void setAttributeInt32(String attribute, int attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_int32(asCPointer(), attribute, attr_value);
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute attribute name to set.
     * @param attr_value int64 value to set attribute to.
    */
    public void setAttributeInt64(@Nonnull ch.bailu.gtk.type.Str attribute, long attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_int64(asCPointer(), asCPointerNotNull(attribute), attr_value);
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute attribute name to set.
     * @param attr_value int64 value to set attribute to.
    */
    public void setAttributeInt64(String attribute, long attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_int64(asCPointer(), attribute, attr_value);
    }

    /**
     * Sets &#64;mask on &#64;info to match specific attribute types.
     * @param mask a &#35;GFileAttributeMatcher.
    */
    public void setAttributeMask(@Nonnull FileAttributeMatcher mask)  {
        JnaFileInfo.INST().g_file_info_set_attribute_mask(asCPointer(), asCPointerNotNull(mask));
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value a &#35;GObject.
    */
    public void setAttributeObject(@Nonnull ch.bailu.gtk.type.Str attribute, @Nonnull ch.bailu.gtk.gobject.Object attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_object(asCPointer(), asCPointerNotNull(attribute), asCPointerNotNull(attr_value));
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value a &#35;GObject.
    */
    public void setAttributeObject(String attribute, @Nonnull ch.bailu.gtk.gobject.Object attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_object(asCPointer(), attribute, asCPointerNotNull(attr_value));
    }

    /**
     * Sets the attribute status for an attribute key. This is only
     * <br>needed by external code that implement g_file_set_attributes_from_info()
     * <br>or similar functions.
     * <br>
     * <br>The attribute must exist in &#64;info for this to work. Otherwise %FALSE
     * <br>is returned and &#64;info is unchanged.
     * @param attribute a file attribute key
     * @param status a &#35;GFileAttributeStatus
     * @return %TRUE if the status was changed, %FALSE if the key was not set.
    */
    public boolean setAttributeStatus(@Nonnull ch.bailu.gtk.type.Str attribute, int status)  {
        return JnaFileInfo.INST().g_file_info_set_attribute_status(asCPointer(), asCPointerNotNull(attribute), status);
    }

    /**
     * Sets the attribute status for an attribute key. This is only
     * <br>needed by external code that implement g_file_set_attributes_from_info()
     * <br>or similar functions.
     * <br>
     * <br>The attribute must exist in &#64;info for this to work. Otherwise %FALSE
     * <br>is returned and &#64;info is unchanged.
     * @param attribute a file attribute key
     * @param status a &#35;GFileAttributeStatus
     * @return %TRUE if the status was changed, %FALSE if the key was not set.
    */
    public boolean setAttributeStatus(String attribute, int status)  {
        return JnaFileInfo.INST().g_file_info_set_attribute_status(asCPointer(), attribute, status);
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value a UTF-8 string.
    */
    public void setAttributeString(@Nonnull ch.bailu.gtk.type.Str attribute, @Nonnull ch.bailu.gtk.type.Str attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_string(asCPointer(), asCPointerNotNull(attribute), asCPointerNotNull(attr_value));
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value a UTF-8 string.
    */
    public void setAttributeString(String attribute, String attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_string(asCPointer(), attribute, attr_value);
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * <br>
     * <br>Sinze: 2.22
     * @param attribute a file attribute key
     * @param attr_value a %NULL   terminated array of UTF-8 strings.
    */
    public void setAttributeStringv(@Nonnull ch.bailu.gtk.type.Str attribute, @Nonnull ch.bailu.gtk.type.Strs attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_stringv(asCPointer(), asCPointerNotNull(attribute), asCPointerNotNull(attr_value));
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * <br>
     * <br>Sinze: 2.22
     * @param attribute a file attribute key
     * @param attr_value a %NULL   terminated array of UTF-8 strings.
    */
    public void setAttributeStringv(String attribute, @Nonnull ch.bailu.gtk.type.Strs attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_stringv(asCPointer(), attribute, asCPointerNotNull(attr_value));
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value an unsigned 32-bit integer.
    */
    public void setAttributeUint32(@Nonnull ch.bailu.gtk.type.Str attribute, int attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_uint32(asCPointer(), asCPointerNotNull(attribute), attr_value);
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value an unsigned 32-bit integer.
    */
    public void setAttributeUint32(String attribute, int attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_uint32(asCPointer(), attribute, attr_value);
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value an unsigned 64-bit integer.
    */
    public void setAttributeUint64(@Nonnull ch.bailu.gtk.type.Str attribute, long attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_uint64(asCPointer(), asCPointerNotNull(attribute), attr_value);
    }

    /**
     * Sets the &#64;attribute to contain the given &#64;attr_value,
     * <br>if possible.
     * @param attribute a file attribute key.
     * @param attr_value an unsigned 64-bit integer.
    */
    public void setAttributeUint64(String attribute, long attr_value)  {
        JnaFileInfo.INST().g_file_info_set_attribute_uint64(asCPointer(), attribute, attr_value);
    }

    /**
     * Sets the content type attribute for a given &#35;GFileInfo.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE.
     * @param content_type a content type. See [GContentType][gio-GContentType]
    */
    public void setContentType(@Nonnull ch.bailu.gtk.type.Str content_type)  {
        JnaFileInfo.INST().g_file_info_set_content_type(asCPointer(), asCPointerNotNull(content_type));
    }

    /**
     * Sets the content type attribute for a given &#35;GFileInfo.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE.
     * @param content_type a content type. See [GContentType][gio-GContentType]
    */
    public void setContentType(String content_type)  {
        JnaFileInfo.INST().g_file_info_set_content_type(asCPointer(), content_type);
    }

    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_CREATED and
     * <br>%G_FILE_ATTRIBUTE_TIME_CREATED_USEC attributes in the file info to the
     * <br>given date/time value.
     * <br>
     * <br>%G_FILE_ATTRIBUTE_TIME_CREATED_NSEC will be cleared.
     * @param creation_time a &#35;GDateTime.
    */
    public void setCreationDateTime(@Nonnull ch.bailu.gtk.glib.DateTime creation_time)  {
        JnaFileInfo.INST().g_file_info_set_creation_date_time(asCPointer(), asCPointerNotNull(creation_time));
    }

    /**
     * Sets the display name for the current &#35;GFileInfo.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME.
     * @param display_name a string containing a display name.
    */
    public void setDisplayName(@Nonnull ch.bailu.gtk.type.Str display_name)  {
        JnaFileInfo.INST().g_file_info_set_display_name(asCPointer(), asCPointerNotNull(display_name));
    }

    /**
     * Sets the display name for the current &#35;GFileInfo.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME.
     * @param display_name a string containing a display name.
    */
    public void setDisplayName(String display_name)  {
        JnaFileInfo.INST().g_file_info_set_display_name(asCPointer(), display_name);
    }

    /**
     * Sets the edit name for the current file.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME.
     * @param edit_name a string containing an edit name.
    */
    public void setEditName(@Nonnull ch.bailu.gtk.type.Str edit_name)  {
        JnaFileInfo.INST().g_file_info_set_edit_name(asCPointer(), asCPointerNotNull(edit_name));
    }

    /**
     * Sets the edit name for the current file.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME.
     * @param edit_name a string containing an edit name.
    */
    public void setEditName(String edit_name)  {
        JnaFileInfo.INST().g_file_info_set_edit_name(asCPointer(), edit_name);
    }

    /**
     * Sets the file type in a &#35;GFileInfo to &#64;type.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_TYPE.
     * @param type a &#35;GFileType.
    */
    public void setFileType(int type)  {
        JnaFileInfo.INST().g_file_info_set_file_type(asCPointer(), type);
    }

    /**
     * Sets the icon for a given &#35;GFileInfo.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_ICON.
     * @param icon a &#35;GIcon.
    */
    public void setIcon(@Nonnull Icon icon)  {
        JnaFileInfo.INST().g_file_info_set_icon(asCPointer(), asCPointerNotNull(icon));
    }

    /**
     * Sets the &quot;is_hidden&quot; attribute in a &#35;GFileInfo according to &#64;is_hidden.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN.
     * @param is_hidden a &#35;gboolean.
    */
    public void setIsHidden(boolean is_hidden)  {
        JnaFileInfo.INST().g_file_info_set_is_hidden(asCPointer(), is_hidden);
    }

    /**
     * Sets the &quot;is_symlink&quot; attribute in a &#35;GFileInfo according to &#64;is_symlink.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK.
     * @param is_symlink a &#35;gboolean.
    */
    public void setIsSymlink(boolean is_symlink)  {
        JnaFileInfo.INST().g_file_info_set_is_symlink(asCPointer(), is_symlink);
    }

    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_MODIFIED and
     * <br>%G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC attributes in the file info to the
     * <br>given date/time value.
     * <br>
     * <br>%G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC will be cleared.
     * @param mtime a &#35;GDateTime.
    */
    public void setModificationDateTime(@Nonnull ch.bailu.gtk.glib.DateTime mtime)  {
        JnaFileInfo.INST().g_file_info_set_modification_date_time(asCPointer(), asCPointerNotNull(mtime));
    }

    /**
     * Sets the name attribute for the current &#35;GFileInfo.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_NAME.
     * @param name a string containing a name.
    */
    public void setName(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaFileInfo.INST().g_file_info_set_name(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Sets the name attribute for the current &#35;GFileInfo.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_NAME.
     * @param name a string containing a name.
    */
    public void setName(String name)  {
        JnaFileInfo.INST().g_file_info_set_name(asCPointer(), name);
    }

    /**
     * Sets the sort order attribute in the file info structure. See
     * <br>%G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
     * @param sort_order a sort order integer.
    */
    public void setSortOrder(int sort_order)  {
        JnaFileInfo.INST().g_file_info_set_sort_order(asCPointer(), sort_order);
    }

    /**
     * Sets the symbolic icon for a given &#35;GFileInfo.
     * <br>See %G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON.
     * @param icon a &#35;GIcon.
    */
    public void setSymbolicIcon(@Nonnull Icon icon)  {
        JnaFileInfo.INST().g_file_info_set_symbolic_icon(asCPointer(), asCPointerNotNull(icon));
    }

    /**
     * Sets the %G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET attribute in the file info
     * <br>to the given symlink target.
     * @param symlink_target a static string containing a path to a symlink target.
    */
    public void setSymlinkTarget(@Nonnull ch.bailu.gtk.type.Str symlink_target)  {
        JnaFileInfo.INST().g_file_info_set_symlink_target(asCPointer(), asCPointerNotNull(symlink_target));
    }

    /**
     * Sets the %G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET attribute in the file info
     * <br>to the given symlink target.
     * @param symlink_target a static string containing a path to a symlink target.
    */
    public void setSymlinkTarget(String symlink_target)  {
        JnaFileInfo.INST().g_file_info_set_symlink_target(asCPointer(), symlink_target);
    }

    /**
     * Unsets a mask set by g_file_info_set_attribute_mask(), if one
     * <br>is set.
    */
    public void unsetAttributeMask()  {
        JnaFileInfo.INST().g_file_info_unset_attribute_mask(asCPointer());
    }

    public static long getTypeID() { 
        return JnaFileInfo.INST().g_file_info_get_type(); 
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

[MethodModel:java-type-not-supported:getAttributeData:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]

[MethodModel:cb-deprecated:getModificationTime:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:TimeVal:{c:GTimeVal*}}:{j:long}]

[MethodModel:cb-return-value-not-supported:getSize:[ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]]

[MethodModel:cb-deprecated:setModificationTime:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:TimeVal:{c:GTimeVal*}}:{j:long}]

[MethodModel:java-type-not-supported:setSize:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:goffset}}:{j:}]
*/
