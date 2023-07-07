/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkRecentInfo` contains the metadata associated with an item in the
 * <br>recently used files list.
 * <p><a href="https://docs.gtk.org/gtk4/struct.RecentInfo.html">https://docs.gtk.org/gtk4/struct.RecentInfo.html</a></p>
*/
public class RecentInfo extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RecentInfo.class.getCanonicalName());
    }

    public RecentInfo(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GAppInfo` for the specified `GtkRecentInfo`
     * <br>
     * <br>In case of error, &#64;error will be set either with a
     * <br>%GTK_RECENT_MANAGER_ERROR or a %G_IO_ERROR
     * @param app_name the name of the application that should   be mapped to a `GAppInfo`; if %NULL is used then the default   application for the MIME type is used
     * @return the newly created `GAppInfo`
    */
    public ch.bailu.gtk.gio.AppInfo createAppInfo(@Nullable ch.bailu.gtk.type.Str app_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.gio.AppInfo(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_create_app_info(asCPointer(), asCPointer(app_name), 0L)));
    }

    /**
     * Creates a `GAppInfo` for the specified `GtkRecentInfo`
     * <br>
     * <br>In case of error, &#64;error will be set either with a
     * <br>%GTK_RECENT_MANAGER_ERROR or a %G_IO_ERROR
     * @param app_name the name of the application that should   be mapped to a `GAppInfo`; if %NULL is used then the default   application for the MIME type is used
     * @return the newly created `GAppInfo`
    */
    public ch.bailu.gtk.gio.AppInfo createAppInfo(String app_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.gio.AppInfo(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_create_app_info(asCPointer(), app_name, 0L)));
    }

    /**
     * Checks whether the resource pointed by &#64;info still exists.
     * <br>At the moment this check is done only on resources pointing
     * <br>to local files.
     * @return %TRUE if the resource exists
    */
    public boolean exists()  {
        return JnaRecentInfo.INST().gtk_recent_info_exists(asCPointer());
    }

    /**
     * Gets the time when the resource
     * <br>was added to the recently used resources list.
     * @return a `GDateTime` for the time    when the resource was added
    */
    public ch.bailu.gtk.glib.DateTime getAdded()  {
        return new ch.bailu.gtk.glib.DateTime(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_get_added(asCPointer())));
    }

    /**
     * Gets the number of days elapsed since the last update
     * <br>of the resource pointed by &#64;info.
     * @return a positive integer containing the number of days   elapsed since the time this resource was last modified
    */
    public int getAge()  {
        return JnaRecentInfo.INST().gtk_recent_info_get_age(asCPointer());
    }

    /**
     * Retrieves the list of applications that have registered this resource.
     * @param length return location for the length of the returned list
     * @return a newly   allocated %NULL-terminated array of strings. Use g_strfreev() to free it.
    */
    public ch.bailu.gtk.type.Strs getApplications(@Nullable ch.bailu.gtk.type.Int64 length)  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_get_applications(asCPointer(), asCPointer(length))));
    }

    /**
     * Gets the (short) description of the resource.
     * @return the description of the resource. The returned string   is owned by the recent manager, and should not be freed.
    */
    public ch.bailu.gtk.type.Str getDescription()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_get_description(asCPointer())));
    }

    /**
     * Gets the name of the resource.
     * <br>
     * <br>If none has been defined, the basename
     * <br>of the resource is obtained.
     * @return the display name of the resource. The returned string   is owned by the recent manager, and should not be freed.
    */
    public ch.bailu.gtk.type.Str getDisplayName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_get_display_name(asCPointer())));
    }

    /**
     * Retrieves the icon associated to the resource MIME type.
     * @return a `GIcon` containing the icon
    */
    public ch.bailu.gtk.gio.Icon getGicon()  {
        return new ch.bailu.gtk.gio.Icon(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_get_gicon(asCPointer())));
    }

    /**
     * Returns all groups registered for the recently used item &#64;info.
     * <br>
     * <br>The array of returned group names will be %NULL terminated, so
     * <br>length might optionally be %NULL.
     * @param length return location for the number of groups returned
     * @return    a newly allocated %NULL terminated array of strings.   Use g_strfreev() to free it.
    */
    public ch.bailu.gtk.type.Strs getGroups(@Nullable ch.bailu.gtk.type.Int64 length)  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_get_groups(asCPointer(), asCPointer(length))));
    }

    /**
     * Gets the MIME type of the resource.
     * @return the MIME type of the resource. The returned string   is owned by the recent manager, and should not be freed.
    */
    public ch.bailu.gtk.type.Str getMimeType()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_get_mime_type(asCPointer())));
    }

    /**
     * Gets the time when the meta-data
     * <br>for the resource was last modified.
     * @return a `GDateTime` for the time   when the resource was last modified
    */
    public ch.bailu.gtk.glib.DateTime getModified()  {
        return new ch.bailu.gtk.glib.DateTime(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_get_modified(asCPointer())));
    }

    /**
     * Gets the value of the “private” flag.
     * <br>
     * <br>Resources in the recently used list that have this flag
     * <br>set to %TRUE should only be displayed by the applications
     * <br>that have registered them.
     * @return %TRUE if the private flag was found, %FALSE otherwise
    */
    public boolean getPrivateHint()  {
        return JnaRecentInfo.INST().gtk_recent_info_get_private_hint(asCPointer());
    }

    /**
     * Computes a valid UTF-8 string that can be used as the
     * <br>name of the item in a menu or list.
     * <br>
     * <br>For example, calling this function on an item that refers
     * <br>to “file:///foo/bar.txt” will yield “bar.txt”.
     * @return A newly-allocated string in UTF-8 encoding   free it with g_free()
    */
    public ch.bailu.gtk.type.Str getShortName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_get_short_name(asCPointer())));
    }

    /**
     * Gets the URI of the resource.
     * @return the URI of the resource. The returned string is   owned by the recent manager, and should not be freed.
    */
    public ch.bailu.gtk.type.Str getUri()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_get_uri(asCPointer())));
    }

    /**
     * Gets a displayable version of the resource’s URI.
     * <br>
     * <br>If the resource is local, it returns a local path; if the
     * <br>resource is not local, it returns the UTF-8 encoded content
     * <br>of [method&#64;Gtk.RecentInfo.get_uri].
     * @return a newly allocated UTF-8 string containing the   resource’s URI or %NULL. Use g_free() when done using it.
    */
    public ch.bailu.gtk.type.Str getUriDisplay()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_get_uri_display(asCPointer())));
    }

    /**
     * Gets the time when the meta-data
     * <br>for the resource was last visited.
     * @return a `GDateTime` for the time    when the resource was last visited
    */
    public ch.bailu.gtk.glib.DateTime getVisited()  {
        return new ch.bailu.gtk.glib.DateTime(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_get_visited(asCPointer())));
    }

    /**
     * Checks whether an application registered this resource using &#64;app_name.
     * @param app_name a string containing an application name
     * @return %TRUE if an application with name &#64;app_name was found,   %FALSE otherwise
    */
    public boolean hasApplication(@Nonnull ch.bailu.gtk.type.Str app_name)  {
        return JnaRecentInfo.INST().gtk_recent_info_has_application(asCPointer(), asCPointerNotNull(app_name));
    }

    /**
     * Checks whether an application registered this resource using &#64;app_name.
     * @param app_name a string containing an application name
     * @return %TRUE if an application with name &#64;app_name was found,   %FALSE otherwise
    */
    public boolean hasApplication(String app_name)  {
        return JnaRecentInfo.INST().gtk_recent_info_has_application(asCPointer(), app_name);
    }

    /**
     * Checks whether &#64;group_name appears inside the groups
     * <br>registered for the recently used item &#64;info.
     * @param group_name name of a group
     * @return %TRUE if the group was found
    */
    public boolean hasGroup(@Nonnull ch.bailu.gtk.type.Str group_name)  {
        return JnaRecentInfo.INST().gtk_recent_info_has_group(asCPointer(), asCPointerNotNull(group_name));
    }

    /**
     * Checks whether &#64;group_name appears inside the groups
     * <br>registered for the recently used item &#64;info.
     * @param group_name name of a group
     * @return %TRUE if the group was found
    */
    public boolean hasGroup(String group_name)  {
        return JnaRecentInfo.INST().gtk_recent_info_has_group(asCPointer(), group_name);
    }

    /**
     * Checks whether the resource is local or not by looking at the
     * <br>scheme of its URI.
     * @return %TRUE if the resource is local
    */
    public boolean isLocal()  {
        return JnaRecentInfo.INST().gtk_recent_info_is_local(asCPointer());
    }

    /**
     * Gets the name of the last application that have registered the
     * <br>recently used resource represented by &#64;info.
     * @return an application name. Use g_free() to free it.
    */
    public ch.bailu.gtk.type.Str lastApplication()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_last_application(asCPointer())));
    }

    /**
     * Checks whether two `GtkRecentInfo` point to the same resource.
     * @param info_b a `GtkRecentInfo`
     * @return %TRUE if both `GtkRecentInfo` point to the same   resource, %FALSE otherwise
    */
    public boolean match(@Nonnull RecentInfo info_b)  {
        return JnaRecentInfo.INST().gtk_recent_info_match(asCPointer(), asCPointerNotNull(info_b));
    }

    /**
     * Increases the reference count of &#64;recent_info by one.
     * @return the recent info object with its reference count   increased by one
    */
    public RecentInfo ref()  {
        return new RecentInfo(new PointerContainer(JnaRecentInfo.INST().gtk_recent_info_ref(asCPointer())));
    }

    /**
     * Decreases the reference count of &#64;info by one.
     * <br>
     * <br>If the reference count reaches zero, &#64;info is
     * <br>deallocated, and the memory freed.
    */
    public void unref()  {
        JnaRecentInfo.INST().gtk_recent_info_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaRecentInfo.INST().gtk_recent_info_get_type(); 
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
record-type
all-fields-supported

[MethodModel:java-type-not-supported:java-type-not-supported:getApplicationInfo:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Strs:{c:const char**}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GDateTime**}}:{j:}]
*/
