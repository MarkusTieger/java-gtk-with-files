/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GDesktopAppInfo is an implementation of &#35;GAppInfo based on
 * <br>desktop files.
 * <br>
 * <br>Note that `&lt;gio/gdesktopappinfo.h&gt;` belongs to the UNIX-specific
 * <br>GIO interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * <br>file when using it.
 * <p><a href="https://docs.gtk.org/gio/class.DesktopAppInfo.html">https://docs.gtk.org/gio/class.DesktopAppInfo.html</a></p>
*/
public class DesktopAppInfo extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DesktopAppInfo.class.getCanonicalName());
    }

    public DesktopAppInfo(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GDesktopAppInfo.
     * @param filename the path of a desktop file, in the GLib      filename encoding
     * @return a new &#35;GDesktopAppInfo or %NULL on error.
    */
    public static DesktopAppInfo newFromFilenameDesktopAppInfo(@Nonnull ch.bailu.gtk.type.Str filename)  {
        PointerContainer __self = cast(JnaDesktopAppInfo.INST().g_desktop_app_info_new_from_filename(asCPointerNotNull(filename)));
        if (__self.isNull()) {
            throw new NullPointerException("DesktopAppInfo:newFromFilename");
        }
        return new DesktopAppInfo(__self);
    }        
    

    /**
     * Creates a new &#35;GDesktopAppInfo.
     * @param filename the path of a desktop file, in the GLib      filename encoding
     * @return a new &#35;GDesktopAppInfo or %NULL on error.
    */
    public static DesktopAppInfo newFromFilenameDesktopAppInfo(String filename)  {
        PointerContainer __self = cast(JnaDesktopAppInfo.INST().g_desktop_app_info_new_from_filename(filename));
        if (__self.isNull()) {
            throw new NullPointerException("DesktopAppInfo:newFromFilename");
        }
        return new DesktopAppInfo(__self);
    }        
    

    /**
     * Creates a new &#35;GDesktopAppInfo.
     * @param key_file an opened &#35;GKeyFile
     * @return a new &#35;GDesktopAppInfo or %NULL on error.
    */
    public static DesktopAppInfo newFromKeyfileDesktopAppInfo(@Nonnull ch.bailu.gtk.glib.KeyFile key_file)  {
        PointerContainer __self = cast(JnaDesktopAppInfo.INST().g_desktop_app_info_new_from_keyfile(asCPointerNotNull(key_file)));
        if (__self.isNull()) {
            throw new NullPointerException("DesktopAppInfo:newFromKeyfile");
        }
        return new DesktopAppInfo(__self);
    }        
    

    /**
     * Creates a new &#35;GDesktopAppInfo based on a desktop file id.
     * <br>
     * <br>A desktop file id is the basename of the desktop file, including the
     * <br>.desktop extension. GIO is looking for a desktop file with this name
     * <br>in the `applications` subdirectories of the XDG
     * <br>data directories (i.e. the directories specified in the `XDG_DATA_HOME`
     * <br>and `XDG_DATA_DIRS` environment variables). GIO also supports the
     * <br>prefix-to-subdirectory mapping that is described in the
     * <br>[Menu Spec](http://standards.freedesktop.org/menu-spec/latest/)
     * <br>(i.e. a desktop id of kde-foo.desktop will match
     * <br>`/usr/share/applications/kde/foo.desktop`).
     * @param desktop_id the desktop file id
    */
    public DesktopAppInfo(@Nonnull ch.bailu.gtk.type.Str desktop_id) {
        super(cast(JnaDesktopAppInfo.INST().g_desktop_app_info_new(asCPointerNotNull(desktop_id))));
    }

    /**
     * Creates a new &#35;GDesktopAppInfo based on a desktop file id.
     * <br>
     * <br>A desktop file id is the basename of the desktop file, including the
     * <br>.desktop extension. GIO is looking for a desktop file with this name
     * <br>in the `applications` subdirectories of the XDG
     * <br>data directories (i.e. the directories specified in the `XDG_DATA_HOME`
     * <br>and `XDG_DATA_DIRS` environment variables). GIO also supports the
     * <br>prefix-to-subdirectory mapping that is described in the
     * <br>[Menu Spec](http://standards.freedesktop.org/menu-spec/latest/)
     * <br>(i.e. a desktop id of kde-foo.desktop will match
     * <br>`/usr/share/applications/kde/foo.desktop`).
     * @param desktop_id the desktop file id
    */
    public DesktopAppInfo(String desktop_id) {
        super(cast(JnaDesktopAppInfo.INST().g_desktop_app_info_new(desktop_id)));
    }

    /**
     * Gets the user-visible display name of the &quot;additional application
     * <br>action&quot; specified by &#64;action_name.
     * <br>
     * <br>This corresponds to the &quot;Name&quot; key within the keyfile group for the
     * <br>action.
     * @param action_name the name of the action as from   g_desktop_app_info_list_actions()
     * @return the locale-specific action name
    */
    public ch.bailu.gtk.type.Str getActionName(@Nonnull ch.bailu.gtk.type.Str action_name)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDesktopAppInfo.INST().g_desktop_app_info_get_action_name(asCPointer(), asCPointerNotNull(action_name))));
    }

    /**
     * Gets the user-visible display name of the &quot;additional application
     * <br>action&quot; specified by &#64;action_name.
     * <br>
     * <br>This corresponds to the &quot;Name&quot; key within the keyfile group for the
     * <br>action.
     * @param action_name the name of the action as from   g_desktop_app_info_list_actions()
     * @return the locale-specific action name
    */
    public ch.bailu.gtk.type.Str getActionName(String action_name)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDesktopAppInfo.INST().g_desktop_app_info_get_action_name(asCPointer(), action_name)));
    }

    /**
     * Looks up a boolean value in the keyfile backing &#64;info.
     * <br>
     * <br>The &#64;key is looked up in the &quot;Desktop Entry&quot; group.
     * @param key the key to look up
     * @return the boolean value, or %FALSE if the key     is not found
    */
    public boolean getBoolean(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaDesktopAppInfo.INST().g_desktop_app_info_get_boolean(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Looks up a boolean value in the keyfile backing &#64;info.
     * <br>
     * <br>The &#64;key is looked up in the &quot;Desktop Entry&quot; group.
     * @param key the key to look up
     * @return the boolean value, or %FALSE if the key     is not found
    */
    public boolean getBoolean(String key)  {
        return JnaDesktopAppInfo.INST().g_desktop_app_info_get_boolean(asCPointer(), key);
    }

    /**
     * Gets the categories from the desktop file.
     * @return The unparsed Categories key from the desktop file;     i.e. no attempt is made to split it by ';' or validate it.
    */
    public ch.bailu.gtk.type.Str getCategories()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDesktopAppInfo.INST().g_desktop_app_info_get_categories(asCPointer())));
    }

    /**
     * When &#64;info was created from a known filename, return it.  In some
     * <br>situations such as the &#35;GDesktopAppInfo returned from
     * <br>g_desktop_app_info_new_from_keyfile(), this function will return %NULL.
     * @return The full path to the file for &#64;info,     or %NULL if not known.
    */
    public ch.bailu.gtk.type.Str getFilename()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDesktopAppInfo.INST().g_desktop_app_info_get_filename(asCPointer())));
    }

    /**
     * Gets the generic name from the desktop file.
     * @return The value of the GenericName key
    */
    public ch.bailu.gtk.type.Str getGenericName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDesktopAppInfo.INST().g_desktop_app_info_get_generic_name(asCPointer())));
    }

    /**
     * A desktop file is hidden if the Hidden key in it is
     * <br>set to True.
     * @return %TRUE if hidden, %FALSE otherwise.
    */
    public boolean getIsHidden()  {
        return JnaDesktopAppInfo.INST().g_desktop_app_info_get_is_hidden(asCPointer());
    }

    /**
     * Gets the keywords from the desktop file.
     * @return The value of the Keywords key
    */
    public ch.bailu.gtk.type.Strs getKeywords()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaDesktopAppInfo.INST().g_desktop_app_info_get_keywords(asCPointer())));
    }

    /**
     * Looks up a localized string value in the keyfile backing &#64;info
     * <br>translated to the current locale.
     * <br>
     * <br>The &#64;key is looked up in the &quot;Desktop Entry&quot; group.
     * @param key the key to look up
     * @return a newly allocated string, or %NULL if the key     is not found
    */
    public ch.bailu.gtk.type.Str getLocaleString(@Nonnull ch.bailu.gtk.type.Str key)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDesktopAppInfo.INST().g_desktop_app_info_get_locale_string(asCPointer(), asCPointerNotNull(key))));
    }

    /**
     * Looks up a localized string value in the keyfile backing &#64;info
     * <br>translated to the current locale.
     * <br>
     * <br>The &#64;key is looked up in the &quot;Desktop Entry&quot; group.
     * @param key the key to look up
     * @return a newly allocated string, or %NULL if the key     is not found
    */
    public ch.bailu.gtk.type.Str getLocaleString(String key)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDesktopAppInfo.INST().g_desktop_app_info_get_locale_string(asCPointer(), key)));
    }

    /**
     * Gets the value of the NoDisplay key, which helps determine if the
     * <br>application info should be shown in menus. See
     * <br>%G_KEY_FILE_DESKTOP_KEY_NO_DISPLAY and g_app_info_should_show().
     * @return The value of the NoDisplay key
    */
    public boolean getNodisplay()  {
        return JnaDesktopAppInfo.INST().g_desktop_app_info_get_nodisplay(asCPointer());
    }

    /**
     * Checks if the application info should be shown in menus that list available
     * <br>applications for a specific name of the desktop, based on the
     * <br>`OnlyShowIn` and `NotShowIn` keys.
     * <br>
     * <br>&#64;desktop_env should typically be given as %NULL, in which case the
     * <br>`XDG_CURRENT_DESKTOP` environment variable is consulted.  If you want
     * <br>to override the default mechanism then you may specify &#64;desktop_env,
     * <br>but this is not recommended.
     * <br>
     * <br>Note that g_app_info_should_show() for &#64;info will include this check (with
     * <br>%NULL for &#64;desktop_env) as well as additional checks.
     * @param desktop_env a string specifying a desktop name
     * @return %TRUE if the &#64;info should be shown in &#64;desktop_env according to the `OnlyShowIn` and `NotShowIn` keys, %FALSE otherwise.
    */
    public boolean getShowIn(@Nullable ch.bailu.gtk.type.Str desktop_env)  {
        return JnaDesktopAppInfo.INST().g_desktop_app_info_get_show_in(asCPointer(), asCPointer(desktop_env));
    }

    /**
     * Checks if the application info should be shown in menus that list available
     * <br>applications for a specific name of the desktop, based on the
     * <br>`OnlyShowIn` and `NotShowIn` keys.
     * <br>
     * <br>&#64;desktop_env should typically be given as %NULL, in which case the
     * <br>`XDG_CURRENT_DESKTOP` environment variable is consulted.  If you want
     * <br>to override the default mechanism then you may specify &#64;desktop_env,
     * <br>but this is not recommended.
     * <br>
     * <br>Note that g_app_info_should_show() for &#64;info will include this check (with
     * <br>%NULL for &#64;desktop_env) as well as additional checks.
     * @param desktop_env a string specifying a desktop name
     * @return %TRUE if the &#64;info should be shown in &#64;desktop_env according to the `OnlyShowIn` and `NotShowIn` keys, %FALSE otherwise.
    */
    public boolean getShowIn(String desktop_env)  {
        return JnaDesktopAppInfo.INST().g_desktop_app_info_get_show_in(asCPointer(), desktop_env);
    }

    /**
     * Retrieves the StartupWMClass field from &#64;info. This represents the
     * <br>WM_CLASS property of the main window of the application, if launched
     * <br>through &#64;info.
     * @return the startup WM class, or %NULL if none is set in the desktop file.
    */
    public ch.bailu.gtk.type.Str getStartupWmClass()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDesktopAppInfo.INST().g_desktop_app_info_get_startup_wm_class(asCPointer())));
    }

    /**
     * Looks up a string value in the keyfile backing &#64;info.
     * <br>
     * <br>The &#64;key is looked up in the &quot;Desktop Entry&quot; group.
     * @param key the key to look up
     * @return a newly allocated string, or %NULL if the key     is not found
    */
    public ch.bailu.gtk.type.Str getString(@Nonnull ch.bailu.gtk.type.Str key)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDesktopAppInfo.INST().g_desktop_app_info_get_string(asCPointer(), asCPointerNotNull(key))));
    }

    /**
     * Looks up a string value in the keyfile backing &#64;info.
     * <br>
     * <br>The &#64;key is looked up in the &quot;Desktop Entry&quot; group.
     * @param key the key to look up
     * @return a newly allocated string, or %NULL if the key     is not found
    */
    public ch.bailu.gtk.type.Str getString(String key)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDesktopAppInfo.INST().g_desktop_app_info_get_string(asCPointer(), key)));
    }

    /**
     * Returns whether &#64;key exists in the &quot;Desktop Entry&quot; group
     * <br>of the keyfile backing &#64;info.
     * @param key the key to look up
     * @return %TRUE if the &#64;key exists
    */
    public boolean hasKey(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaDesktopAppInfo.INST().g_desktop_app_info_has_key(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Returns whether &#64;key exists in the &quot;Desktop Entry&quot; group
     * <br>of the keyfile backing &#64;info.
     * @param key the key to look up
     * @return %TRUE if the &#64;key exists
    */
    public boolean hasKey(String key)  {
        return JnaDesktopAppInfo.INST().g_desktop_app_info_has_key(asCPointer(), key);
    }

    /**
     * Activates the named application action.
     * <br>
     * <br>You may only call this function on action names that were
     * <br>returned from g_desktop_app_info_list_actions().
     * <br>
     * <br>Note that if the main entry of the desktop file indicates that the
     * <br>application supports startup notification, and &#64;launch_context is
     * <br>non-%NULL, then startup notification will be used when activating the
     * <br>action (and as such, invocation of the action on the receiving side
     * <br>must signal the end of startup notification when it is completed).
     * <br>This is the expected behaviour of applications declaring additional
     * <br>actions, as per the desktop file specification.
     * <br>
     * <br>As with g_app_info_launch() there is no way to detect failures that
     * <br>occur while using this function.
     * @param action_name the name of the action as from   g_desktop_app_info_list_actions()
     * @param launch_context a &#35;GAppLaunchContext
    */
    public void launchAction(@Nonnull ch.bailu.gtk.type.Str action_name, @Nullable AppLaunchContext launch_context)  {
        JnaDesktopAppInfo.INST().g_desktop_app_info_launch_action(asCPointer(), asCPointerNotNull(action_name), asCPointer(launch_context));
    }

    /**
     * Activates the named application action.
     * <br>
     * <br>You may only call this function on action names that were
     * <br>returned from g_desktop_app_info_list_actions().
     * <br>
     * <br>Note that if the main entry of the desktop file indicates that the
     * <br>application supports startup notification, and &#64;launch_context is
     * <br>non-%NULL, then startup notification will be used when activating the
     * <br>action (and as such, invocation of the action on the receiving side
     * <br>must signal the end of startup notification when it is completed).
     * <br>This is the expected behaviour of applications declaring additional
     * <br>actions, as per the desktop file specification.
     * <br>
     * <br>As with g_app_info_launch() there is no way to detect failures that
     * <br>occur while using this function.
     * @param action_name the name of the action as from   g_desktop_app_info_list_actions()
     * @param launch_context a &#35;GAppLaunchContext
    */
    public void launchAction(String action_name, @Nullable AppLaunchContext launch_context)  {
        JnaDesktopAppInfo.INST().g_desktop_app_info_launch_action(asCPointer(), action_name, asCPointer(launch_context));
    }

    /**
     * Gets all applications that implement &#64;interface.
     * <br>
     * <br>An application implements an interface if that interface is listed in
     * <br>the Implements= line of the desktop file of the application.
     * @param _interface the name of the interface
     * @return a list of &#35;GDesktopAppInfo objects.
    */
    public static ch.bailu.gtk.glib.List getImplementations(@Nonnull ch.bailu.gtk.type.Str _interface)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaDesktopAppInfo.INST().g_desktop_app_info_get_implementations(asCPointerNotNull(_interface))));
    }

    /**
     * Implements interface {@link AppInfo}. Call this to get access to interface functions.
     * @return {@link AppInfo}
    */
    public AppInfo asAppInfo() {
        return new AppInfo(cast());
    }

    public static long getTypeID() { 
        return JnaDesktopAppInfo.INST().g_desktop_app_info_get_type(); 
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

[MethodModel:cb-return-value-not-supported:getStringList:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:cb-not-supported:launchUrisAsManager:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:List:{c:GList*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AppLaunchContext:{c:GAppLaunchContext*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GSpawnFlags}}:{j:int}]
        [ParameterModel:Supported:[MethodModel:Supported:SpawnChildSetupFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:DesktopAppLaunchCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:DesktopAppInfo:{c:GDesktopAppInfo*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GPid}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[MethodModel:cb-not-supported:launchUrisAsManagerWithFds:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:List:{c:GList*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AppLaunchContext:{c:GAppLaunchContext*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GSpawnFlags}}:{j:int}]
        [ParameterModel:Supported:[MethodModel:Supported:SpawnChildSetupFunc:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:cb-not-supported:[MethodModel:java-type-not-supported:DesktopAppLaunchCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:DesktopAppInfo:{c:GDesktopAppInfo*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:GPid}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]

[MethodModel:cb-return-value-not-supported:listActions:[ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]]

[MethodModel:cb-return-value-not-supported:search:[ParameterModel:java-type-not-supported:{G_::{c:gchar***}}:{j:}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]

[MethodModel:cb-deprecated:setDesktopEnv:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
*/
