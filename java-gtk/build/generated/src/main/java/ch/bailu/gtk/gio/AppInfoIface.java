/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Application Information interface, for operating system portability.
 * <p><a href="https://docs.gtk.org/gio/struct.AppInfoIface.html">https://docs.gtk.org/gio/struct.AppInfoIface.html</a></p>
*/
public class AppInfoIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AppInfoIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDup {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @return a duplicate of &#64;appinfo.
        */
        AppInfo onDup(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnDup toOnDup(ch.bailu.gtk.type.Pointer instance, String methodName, OnDup in) {
        JnaAppInfoIface.OnDup out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onDup(__callback, new AppInfo(new PointerContainer(_appinfo))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEqual {
        /**
         * 
         * @param appinfo1 the first &#35;GAppInfo.
         * @param appinfo2 the second &#35;GAppInfo.
         * @return %TRUE if &#64;appinfo1 is equal to &#64;appinfo2. %FALSE otherwise.
        */
        boolean onEqual(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo1, @Nonnull AppInfo appinfo2);
    }
    
    private static JnaAppInfoIface.OnEqual toOnEqual(ch.bailu.gtk.type.Pointer instance, String methodName, OnEqual in) {
        JnaAppInfoIface.OnEqual out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo1, _appinfo2) -> in.onEqual(__callback, new AppInfo(new PointerContainer(_appinfo1)), new AppInfo(new PointerContainer(_appinfo2)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetId {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @return a string containing the application's ID.
        */
        ch.bailu.gtk.type.Str onGetId(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnGetId toOnGetId(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetId in) {
        JnaAppInfoIface.OnGetId out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onGetId(__callback, new AppInfo(new PointerContainer(_appinfo))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetName {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @return the name of the application for &#64;appinfo.
        */
        ch.bailu.gtk.type.Str onGetName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnGetName toOnGetName(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetName in) {
        JnaAppInfoIface.OnGetName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onGetName(__callback, new AppInfo(new PointerContainer(_appinfo))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetDescription {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @return a string containing a description of the application &#64;appinfo, or %NULL if none.
        */
        ch.bailu.gtk.type.Str onGetDescription(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnGetDescription toOnGetDescription(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDescription in) {
        JnaAppInfoIface.OnGetDescription out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onGetDescription(__callback, new AppInfo(new PointerContainer(_appinfo))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetExecutable {
        /**
         * 
         * @param appinfo a &#35;GAppInfo
         * @return a string containing the &#64;appinfo's application binaries name
        */
        ch.bailu.gtk.type.Str onGetExecutable(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnGetExecutable toOnGetExecutable(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetExecutable in) {
        JnaAppInfoIface.OnGetExecutable out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onGetExecutable(__callback, new AppInfo(new PointerContainer(_appinfo))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetIcon {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @return the default &#35;GIcon for &#64;appinfo or %NULL if there is no default icon.
        */
        Icon onGetIcon(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnGetIcon toOnGetIcon(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetIcon in) {
        JnaAppInfoIface.OnGetIcon out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onGetIcon(__callback, new AppInfo(new PointerContainer(_appinfo))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLaunch {
        /**
         * 
         * @param appinfo a &#35;GAppInfo
         * @param files a &#35;GList of &#35;GFile objects
         * @param context a &#35;GAppLaunchContext or %NULL
         * @return %TRUE on successful launch, %FALSE otherwise.
        */
        boolean onLaunch(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo, @Nullable ch.bailu.gtk.glib.List files, @Nullable AppLaunchContext context);
    }
    
    private static JnaAppInfoIface.OnLaunch toOnLaunch(ch.bailu.gtk.type.Pointer instance, String methodName, OnLaunch in) {
        JnaAppInfoIface.OnLaunch out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo, _files, _context, _error) -> in.onLaunch(__callback, new AppInfo(new PointerContainer(_appinfo)), new ch.bailu.gtk.glib.List(new PointerContainer(_files)), new AppLaunchContext(new PointerContainer(_context)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSupportsUris {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @return %TRUE if the &#64;appinfo supports URIs.
        */
        boolean onSupportsUris(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnSupportsUris toOnSupportsUris(ch.bailu.gtk.type.Pointer instance, String methodName, OnSupportsUris in) {
        JnaAppInfoIface.OnSupportsUris out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onSupportsUris(__callback, new AppInfo(new PointerContainer(_appinfo)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSupportsFiles {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @return %TRUE if the &#64;appinfo supports files.
        */
        boolean onSupportsFiles(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnSupportsFiles toOnSupportsFiles(ch.bailu.gtk.type.Pointer instance, String methodName, OnSupportsFiles in) {
        JnaAppInfoIface.OnSupportsFiles out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onSupportsFiles(__callback, new AppInfo(new PointerContainer(_appinfo)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLaunchUris {
        /**
         * 
         * @param appinfo a &#35;GAppInfo
         * @param uris a &#35;GList containing URIs to launch.
         * @param context a &#35;GAppLaunchContext or %NULL
         * @return %TRUE on successful launch, %FALSE otherwise.
        */
        boolean onLaunchUris(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo, @Nullable ch.bailu.gtk.glib.List uris, @Nullable AppLaunchContext context);
    }
    
    private static JnaAppInfoIface.OnLaunchUris toOnLaunchUris(ch.bailu.gtk.type.Pointer instance, String methodName, OnLaunchUris in) {
        JnaAppInfoIface.OnLaunchUris out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo, _uris, _context, _error) -> in.onLaunchUris(__callback, new AppInfo(new PointerContainer(_appinfo)), new ch.bailu.gtk.glib.List(new PointerContainer(_uris)), new AppLaunchContext(new PointerContainer(_context)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnShouldShow {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @return %TRUE if the &#64;appinfo should be shown, %FALSE otherwise.
        */
        boolean onShouldShow(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnShouldShow toOnShouldShow(ch.bailu.gtk.type.Pointer instance, String methodName, OnShouldShow in) {
        JnaAppInfoIface.OnShouldShow out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onShouldShow(__callback, new AppInfo(new PointerContainer(_appinfo)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetAsDefaultForType {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @param content_type the content type.
         * @return %TRUE on success, %FALSE on error.
        */
        boolean onSetAsDefaultForType(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo, @Nonnull ch.bailu.gtk.type.Str content_type);
    }
    
    private static JnaAppInfoIface.OnSetAsDefaultForType toOnSetAsDefaultForType(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetAsDefaultForType in) {
        JnaAppInfoIface.OnSetAsDefaultForType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo, _content_type, _error) -> in.onSetAsDefaultForType(__callback, new AppInfo(new PointerContainer(_appinfo)), new ch.bailu.gtk.type.Str(new PointerContainer(_content_type)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetAsDefaultForExtension {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @param extension a string containing the file extension     (without the dot).
         * @return %TRUE on success, %FALSE on error.
        */
        boolean onSetAsDefaultForExtension(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo, @Nonnull ch.bailu.gtk.type.Str extension);
    }
    
    private static JnaAppInfoIface.OnSetAsDefaultForExtension toOnSetAsDefaultForExtension(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetAsDefaultForExtension in) {
        JnaAppInfoIface.OnSetAsDefaultForExtension out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo, _extension, _error) -> in.onSetAsDefaultForExtension(__callback, new AppInfo(new PointerContainer(_appinfo)), new ch.bailu.gtk.type.Str(new PointerContainer(_extension)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAddSupportsType {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @param content_type a string.
         * @return %TRUE on success, %FALSE on error.
        */
        boolean onAddSupportsType(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo, @Nonnull ch.bailu.gtk.type.Str content_type);
    }
    
    private static JnaAppInfoIface.OnAddSupportsType toOnAddSupportsType(ch.bailu.gtk.type.Pointer instance, String methodName, OnAddSupportsType in) {
        JnaAppInfoIface.OnAddSupportsType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo, _content_type, _error) -> in.onAddSupportsType(__callback, new AppInfo(new PointerContainer(_appinfo)), new ch.bailu.gtk.type.Str(new PointerContainer(_content_type)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCanRemoveSupportsType {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @return %TRUE if it is possible to remove supported     content types from a given &#64;appinfo, %FALSE if not.
        */
        boolean onCanRemoveSupportsType(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnCanRemoveSupportsType toOnCanRemoveSupportsType(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanRemoveSupportsType in) {
        JnaAppInfoIface.OnCanRemoveSupportsType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onCanRemoveSupportsType(__callback, new AppInfo(new PointerContainer(_appinfo)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnRemoveSupportsType {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @param content_type a string.
         * @return %TRUE on success, %FALSE on error.
        */
        boolean onRemoveSupportsType(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo, @Nonnull ch.bailu.gtk.type.Str content_type);
    }
    
    private static JnaAppInfoIface.OnRemoveSupportsType toOnRemoveSupportsType(ch.bailu.gtk.type.Pointer instance, String methodName, OnRemoveSupportsType in) {
        JnaAppInfoIface.OnRemoveSupportsType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo, _content_type, _error) -> in.onRemoveSupportsType(__callback, new AppInfo(new PointerContainer(_appinfo)), new ch.bailu.gtk.type.Str(new PointerContainer(_content_type)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCanDelete {
        /**
         * 
         * @param appinfo a &#35;GAppInfo
         * @return %TRUE if &#64;appinfo can be deleted
        */
        boolean onCanDelete(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnCanDelete toOnCanDelete(ch.bailu.gtk.type.Pointer instance, String methodName, OnCanDelete in) {
        JnaAppInfoIface.OnCanDelete out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onCanDelete(__callback, new AppInfo(new PointerContainer(_appinfo)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDoDelete {
        /**
         * 
         * @param appinfo a &#35;GAppInfo
         * @return %TRUE if &#64;appinfo has been deleted
        */
        boolean onDoDelete(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnDoDelete toOnDoDelete(ch.bailu.gtk.type.Pointer instance, String methodName, OnDoDelete in) {
        JnaAppInfoIface.OnDoDelete out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onDoDelete(__callback, new AppInfo(new PointerContainer(_appinfo)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetCommandline {
        /**
         * 
         * @param appinfo a &#35;GAppInfo
         * @return a string containing the &#64;appinfo's commandline,     or %NULL if this information is not available
        */
        ch.bailu.gtk.type.Str onGetCommandline(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnGetCommandline toOnGetCommandline(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetCommandline in) {
        JnaAppInfoIface.OnGetCommandline out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onGetCommandline(__callback, new AppInfo(new PointerContainer(_appinfo))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetDisplayName {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @return the display name of the application for &#64;appinfo, or the name if no display name is available.
        */
        ch.bailu.gtk.type.Str onGetDisplayName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnGetDisplayName toOnGetDisplayName(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetDisplayName in) {
        JnaAppInfoIface.OnGetDisplayName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onGetDisplayName(__callback, new AppInfo(new PointerContainer(_appinfo))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetAsLastUsedForType {
        /**
         * 
         * @param appinfo a &#35;GAppInfo.
         * @param content_type the content type.
         * @return %TRUE on success, %FALSE on error.
        */
        boolean onSetAsLastUsedForType(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo, @Nonnull ch.bailu.gtk.type.Str content_type);
    }
    
    private static JnaAppInfoIface.OnSetAsLastUsedForType toOnSetAsLastUsedForType(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetAsLastUsedForType in) {
        JnaAppInfoIface.OnSetAsLastUsedForType out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo, _content_type, _error) -> in.onSetAsLastUsedForType(__callback, new AppInfo(new PointerContainer(_appinfo)), new ch.bailu.gtk.type.Str(new PointerContainer(_content_type)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetSupportedTypes {
        /**
         * 
         * @param appinfo a &#35;GAppInfo that can handle files
         * @return     a list of content types.
        */
        ch.bailu.gtk.type.Strs onGetSupportedTypes(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo);
    }
    
    private static JnaAppInfoIface.OnGetSupportedTypes toOnGetSupportedTypes(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetSupportedTypes in) {
        JnaAppInfoIface.OnGetSupportedTypes out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo) -> in.onGetSupportedTypes(__callback, new AppInfo(new PointerContainer(_appinfo))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnLaunchUrisFinish {
        /**
         * 
         * @param appinfo a &#35;GAppInfo
         * @param result a &#35;GAsyncResult
         * @return %TRUE on successful launch, %FALSE otherwise.
        */
        boolean onLaunchUrisFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull AppInfo appinfo, @Nonnull AsyncResult result);
    }
    
    private static JnaAppInfoIface.OnLaunchUrisFinish toOnLaunchUrisFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnLaunchUrisFinish in) {
        JnaAppInfoIface.OnLaunchUrisFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_appinfo, _result, _error) -> in.onLaunchUrisFinish(__callback, new AppInfo(new PointerContainer(_appinfo)), new AsyncResult(new PointerContainer(_result)));
            __callback.register(out);
        }
        return out;
    }

    public AppInfoIface(PointerContainer pointer) {
        super(pointer);
    }

    public AppInfoIface() {
        super(cast(JnaAppInfoIface.allocateStructure()));
    }

    private JnaAppInfoIface.Fields _fields;
    
    JnaAppInfoIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAppInfoIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnDup#onDup}
    */
    public static final String DUP = "dup";

    /**
     * 
     * <br>See {@link OnDup#onDup}
    */
    public void setFieldDup(OnDup dup) {
        toFields().dup = toOnDup(this, DUP, dup);
        toFields().writeField(DUP);
    }

    /**
     * 
     * <br>See {@link OnDup#onDup}
    */
    public JnaAppInfoIface.OnDup getFieldDup() {
       toFields().readField(DUP);
       return toFields().dup;
    } 

    /**
     * 
     * <br>See {@link OnEqual#onEqual}
    */
    public static final String EQUAL = "equal";

    /**
     * 
     * <br>See {@link OnEqual#onEqual}
    */
    public void setFieldEqual(OnEqual equal) {
        toFields().equal = toOnEqual(this, EQUAL, equal);
        toFields().writeField(EQUAL);
    }

    /**
     * 
     * <br>See {@link OnEqual#onEqual}
    */
    public JnaAppInfoIface.OnEqual getFieldEqual() {
       toFields().readField(EQUAL);
       return toFields().equal;
    } 

    /**
     * 
     * <br>See {@link OnGetId#onGetId}
    */
    public static final String GET_ID = "get_id";

    /**
     * 
     * <br>See {@link OnGetId#onGetId}
    */
    public void setFieldGetId(OnGetId get_id) {
        toFields().get_id = toOnGetId(this, GET_ID, get_id);
        toFields().writeField(GET_ID);
    }

    /**
     * 
     * <br>See {@link OnGetId#onGetId}
    */
    public JnaAppInfoIface.OnGetId getFieldGetId() {
       toFields().readField(GET_ID);
       return toFields().get_id;
    } 

    /**
     * 
     * <br>See {@link OnGetName#onGetName}
    */
    public static final String GET_NAME = "get_name";

    /**
     * 
     * <br>See {@link OnGetName#onGetName}
    */
    public void setFieldGetName(OnGetName get_name) {
        toFields().get_name = toOnGetName(this, GET_NAME, get_name);
        toFields().writeField(GET_NAME);
    }

    /**
     * 
     * <br>See {@link OnGetName#onGetName}
    */
    public JnaAppInfoIface.OnGetName getFieldGetName() {
       toFields().readField(GET_NAME);
       return toFields().get_name;
    } 

    /**
     * 
     * <br>See {@link OnGetDescription#onGetDescription}
    */
    public static final String GET_DESCRIPTION = "get_description";

    /**
     * 
     * <br>See {@link OnGetDescription#onGetDescription}
    */
    public void setFieldGetDescription(OnGetDescription get_description) {
        toFields().get_description = toOnGetDescription(this, GET_DESCRIPTION, get_description);
        toFields().writeField(GET_DESCRIPTION);
    }

    /**
     * 
     * <br>See {@link OnGetDescription#onGetDescription}
    */
    public JnaAppInfoIface.OnGetDescription getFieldGetDescription() {
       toFields().readField(GET_DESCRIPTION);
       return toFields().get_description;
    } 

    /**
     * 
     * <br>See {@link OnGetExecutable#onGetExecutable}
    */
    public static final String GET_EXECUTABLE = "get_executable";

    /**
     * 
     * <br>See {@link OnGetExecutable#onGetExecutable}
    */
    public void setFieldGetExecutable(OnGetExecutable get_executable) {
        toFields().get_executable = toOnGetExecutable(this, GET_EXECUTABLE, get_executable);
        toFields().writeField(GET_EXECUTABLE);
    }

    /**
     * 
     * <br>See {@link OnGetExecutable#onGetExecutable}
    */
    public JnaAppInfoIface.OnGetExecutable getFieldGetExecutable() {
       toFields().readField(GET_EXECUTABLE);
       return toFields().get_executable;
    } 

    /**
     * 
     * <br>See {@link OnGetIcon#onGetIcon}
    */
    public static final String GET_ICON = "get_icon";

    /**
     * 
     * <br>See {@link OnGetIcon#onGetIcon}
    */
    public void setFieldGetIcon(OnGetIcon get_icon) {
        toFields().get_icon = toOnGetIcon(this, GET_ICON, get_icon);
        toFields().writeField(GET_ICON);
    }

    /**
     * 
     * <br>See {@link OnGetIcon#onGetIcon}
    */
    public JnaAppInfoIface.OnGetIcon getFieldGetIcon() {
       toFields().readField(GET_ICON);
       return toFields().get_icon;
    } 

    /**
     * 
     * <br>See {@link OnLaunch#onLaunch}
    */
    public static final String LAUNCH = "launch";

    /**
     * 
     * <br>See {@link OnLaunch#onLaunch}
    */
    public void setFieldLaunch(OnLaunch launch) {
        toFields().launch = toOnLaunch(this, LAUNCH, launch);
        toFields().writeField(LAUNCH);
    }

    /**
     * 
     * <br>See {@link OnLaunch#onLaunch}
    */
    public JnaAppInfoIface.OnLaunch getFieldLaunch() {
       toFields().readField(LAUNCH);
       return toFields().launch;
    } 

    /**
     * 
     * <br>See {@link OnSupportsUris#onSupportsUris}
    */
    public static final String SUPPORTS_URIS = "supports_uris";

    /**
     * 
     * <br>See {@link OnSupportsUris#onSupportsUris}
    */
    public void setFieldSupportsUris(OnSupportsUris supports_uris) {
        toFields().supports_uris = toOnSupportsUris(this, SUPPORTS_URIS, supports_uris);
        toFields().writeField(SUPPORTS_URIS);
    }

    /**
     * 
     * <br>See {@link OnSupportsUris#onSupportsUris}
    */
    public JnaAppInfoIface.OnSupportsUris getFieldSupportsUris() {
       toFields().readField(SUPPORTS_URIS);
       return toFields().supports_uris;
    } 

    /**
     * 
     * <br>See {@link OnSupportsFiles#onSupportsFiles}
    */
    public static final String SUPPORTS_FILES = "supports_files";

    /**
     * 
     * <br>See {@link OnSupportsFiles#onSupportsFiles}
    */
    public void setFieldSupportsFiles(OnSupportsFiles supports_files) {
        toFields().supports_files = toOnSupportsFiles(this, SUPPORTS_FILES, supports_files);
        toFields().writeField(SUPPORTS_FILES);
    }

    /**
     * 
     * <br>See {@link OnSupportsFiles#onSupportsFiles}
    */
    public JnaAppInfoIface.OnSupportsFiles getFieldSupportsFiles() {
       toFields().readField(SUPPORTS_FILES);
       return toFields().supports_files;
    } 

    /**
     * 
     * <br>See {@link OnLaunchUris#onLaunchUris}
    */
    public static final String LAUNCH_URIS = "launch_uris";

    /**
     * 
     * <br>See {@link OnLaunchUris#onLaunchUris}
    */
    public void setFieldLaunchUris(OnLaunchUris launch_uris) {
        toFields().launch_uris = toOnLaunchUris(this, LAUNCH_URIS, launch_uris);
        toFields().writeField(LAUNCH_URIS);
    }

    /**
     * 
     * <br>See {@link OnLaunchUris#onLaunchUris}
    */
    public JnaAppInfoIface.OnLaunchUris getFieldLaunchUris() {
       toFields().readField(LAUNCH_URIS);
       return toFields().launch_uris;
    } 

    /**
     * 
     * <br>See {@link OnShouldShow#onShouldShow}
    */
    public static final String SHOULD_SHOW = "should_show";

    /**
     * 
     * <br>See {@link OnShouldShow#onShouldShow}
    */
    public void setFieldShouldShow(OnShouldShow should_show) {
        toFields().should_show = toOnShouldShow(this, SHOULD_SHOW, should_show);
        toFields().writeField(SHOULD_SHOW);
    }

    /**
     * 
     * <br>See {@link OnShouldShow#onShouldShow}
    */
    public JnaAppInfoIface.OnShouldShow getFieldShouldShow() {
       toFields().readField(SHOULD_SHOW);
       return toFields().should_show;
    } 

    /**
     * 
     * <br>See {@link OnSetAsDefaultForType#onSetAsDefaultForType}
    */
    public static final String SET_AS_DEFAULT_FOR_TYPE = "set_as_default_for_type";

    /**
     * 
     * <br>See {@link OnSetAsDefaultForType#onSetAsDefaultForType}
    */
    public void setFieldSetAsDefaultForType(OnSetAsDefaultForType set_as_default_for_type) {
        toFields().set_as_default_for_type = toOnSetAsDefaultForType(this, SET_AS_DEFAULT_FOR_TYPE, set_as_default_for_type);
        toFields().writeField(SET_AS_DEFAULT_FOR_TYPE);
    }

    /**
     * 
     * <br>See {@link OnSetAsDefaultForType#onSetAsDefaultForType}
    */
    public JnaAppInfoIface.OnSetAsDefaultForType getFieldSetAsDefaultForType() {
       toFields().readField(SET_AS_DEFAULT_FOR_TYPE);
       return toFields().set_as_default_for_type;
    } 

    /**
     * 
     * <br>See {@link OnSetAsDefaultForExtension#onSetAsDefaultForExtension}
    */
    public static final String SET_AS_DEFAULT_FOR_EXTENSION = "set_as_default_for_extension";

    /**
     * 
     * <br>See {@link OnSetAsDefaultForExtension#onSetAsDefaultForExtension}
    */
    public void setFieldSetAsDefaultForExtension(OnSetAsDefaultForExtension set_as_default_for_extension) {
        toFields().set_as_default_for_extension = toOnSetAsDefaultForExtension(this, SET_AS_DEFAULT_FOR_EXTENSION, set_as_default_for_extension);
        toFields().writeField(SET_AS_DEFAULT_FOR_EXTENSION);
    }

    /**
     * 
     * <br>See {@link OnSetAsDefaultForExtension#onSetAsDefaultForExtension}
    */
    public JnaAppInfoIface.OnSetAsDefaultForExtension getFieldSetAsDefaultForExtension() {
       toFields().readField(SET_AS_DEFAULT_FOR_EXTENSION);
       return toFields().set_as_default_for_extension;
    } 

    /**
     * 
     * <br>See {@link OnAddSupportsType#onAddSupportsType}
    */
    public static final String ADD_SUPPORTS_TYPE = "add_supports_type";

    /**
     * 
     * <br>See {@link OnAddSupportsType#onAddSupportsType}
    */
    public void setFieldAddSupportsType(OnAddSupportsType add_supports_type) {
        toFields().add_supports_type = toOnAddSupportsType(this, ADD_SUPPORTS_TYPE, add_supports_type);
        toFields().writeField(ADD_SUPPORTS_TYPE);
    }

    /**
     * 
     * <br>See {@link OnAddSupportsType#onAddSupportsType}
    */
    public JnaAppInfoIface.OnAddSupportsType getFieldAddSupportsType() {
       toFields().readField(ADD_SUPPORTS_TYPE);
       return toFields().add_supports_type;
    } 

    /**
     * 
     * <br>See {@link OnCanRemoveSupportsType#onCanRemoveSupportsType}
    */
    public static final String CAN_REMOVE_SUPPORTS_TYPE = "can_remove_supports_type";

    /**
     * 
     * <br>See {@link OnCanRemoveSupportsType#onCanRemoveSupportsType}
    */
    public void setFieldCanRemoveSupportsType(OnCanRemoveSupportsType can_remove_supports_type) {
        toFields().can_remove_supports_type = toOnCanRemoveSupportsType(this, CAN_REMOVE_SUPPORTS_TYPE, can_remove_supports_type);
        toFields().writeField(CAN_REMOVE_SUPPORTS_TYPE);
    }

    /**
     * 
     * <br>See {@link OnCanRemoveSupportsType#onCanRemoveSupportsType}
    */
    public JnaAppInfoIface.OnCanRemoveSupportsType getFieldCanRemoveSupportsType() {
       toFields().readField(CAN_REMOVE_SUPPORTS_TYPE);
       return toFields().can_remove_supports_type;
    } 

    /**
     * 
     * <br>See {@link OnRemoveSupportsType#onRemoveSupportsType}
    */
    public static final String REMOVE_SUPPORTS_TYPE = "remove_supports_type";

    /**
     * 
     * <br>See {@link OnRemoveSupportsType#onRemoveSupportsType}
    */
    public void setFieldRemoveSupportsType(OnRemoveSupportsType remove_supports_type) {
        toFields().remove_supports_type = toOnRemoveSupportsType(this, REMOVE_SUPPORTS_TYPE, remove_supports_type);
        toFields().writeField(REMOVE_SUPPORTS_TYPE);
    }

    /**
     * 
     * <br>See {@link OnRemoveSupportsType#onRemoveSupportsType}
    */
    public JnaAppInfoIface.OnRemoveSupportsType getFieldRemoveSupportsType() {
       toFields().readField(REMOVE_SUPPORTS_TYPE);
       return toFields().remove_supports_type;
    } 

    /**
     * 
     * <br>See {@link OnCanDelete#onCanDelete}
    */
    public static final String CAN_DELETE = "can_delete";

    /**
     * 
     * <br>See {@link OnCanDelete#onCanDelete}
    */
    public void setFieldCanDelete(OnCanDelete can_delete) {
        toFields().can_delete = toOnCanDelete(this, CAN_DELETE, can_delete);
        toFields().writeField(CAN_DELETE);
    }

    /**
     * 
     * <br>See {@link OnCanDelete#onCanDelete}
    */
    public JnaAppInfoIface.OnCanDelete getFieldCanDelete() {
       toFields().readField(CAN_DELETE);
       return toFields().can_delete;
    } 

    /**
     * 
     * <br>See {@link OnDoDelete#onDoDelete}
    */
    public static final String DO_DELETE = "do_delete";

    /**
     * 
     * <br>See {@link OnDoDelete#onDoDelete}
    */
    public void setFieldDoDelete(OnDoDelete do_delete) {
        toFields().do_delete = toOnDoDelete(this, DO_DELETE, do_delete);
        toFields().writeField(DO_DELETE);
    }

    /**
     * 
     * <br>See {@link OnDoDelete#onDoDelete}
    */
    public JnaAppInfoIface.OnDoDelete getFieldDoDelete() {
       toFields().readField(DO_DELETE);
       return toFields().do_delete;
    } 

    /**
     * 
     * <br>See {@link OnGetCommandline#onGetCommandline}
    */
    public static final String GET_COMMANDLINE = "get_commandline";

    /**
     * 
     * <br>See {@link OnGetCommandline#onGetCommandline}
    */
    public void setFieldGetCommandline(OnGetCommandline get_commandline) {
        toFields().get_commandline = toOnGetCommandline(this, GET_COMMANDLINE, get_commandline);
        toFields().writeField(GET_COMMANDLINE);
    }

    /**
     * 
     * <br>See {@link OnGetCommandline#onGetCommandline}
    */
    public JnaAppInfoIface.OnGetCommandline getFieldGetCommandline() {
       toFields().readField(GET_COMMANDLINE);
       return toFields().get_commandline;
    } 

    /**
     * 
     * <br>See {@link OnGetDisplayName#onGetDisplayName}
    */
    public static final String GET_DISPLAY_NAME = "get_display_name";

    /**
     * 
     * <br>See {@link OnGetDisplayName#onGetDisplayName}
    */
    public void setFieldGetDisplayName(OnGetDisplayName get_display_name) {
        toFields().get_display_name = toOnGetDisplayName(this, GET_DISPLAY_NAME, get_display_name);
        toFields().writeField(GET_DISPLAY_NAME);
    }

    /**
     * 
     * <br>See {@link OnGetDisplayName#onGetDisplayName}
    */
    public JnaAppInfoIface.OnGetDisplayName getFieldGetDisplayName() {
       toFields().readField(GET_DISPLAY_NAME);
       return toFields().get_display_name;
    } 

    /**
     * 
     * <br>See {@link OnSetAsLastUsedForType#onSetAsLastUsedForType}
    */
    public static final String SET_AS_LAST_USED_FOR_TYPE = "set_as_last_used_for_type";

    /**
     * 
     * <br>See {@link OnSetAsLastUsedForType#onSetAsLastUsedForType}
    */
    public void setFieldSetAsLastUsedForType(OnSetAsLastUsedForType set_as_last_used_for_type) {
        toFields().set_as_last_used_for_type = toOnSetAsLastUsedForType(this, SET_AS_LAST_USED_FOR_TYPE, set_as_last_used_for_type);
        toFields().writeField(SET_AS_LAST_USED_FOR_TYPE);
    }

    /**
     * 
     * <br>See {@link OnSetAsLastUsedForType#onSetAsLastUsedForType}
    */
    public JnaAppInfoIface.OnSetAsLastUsedForType getFieldSetAsLastUsedForType() {
       toFields().readField(SET_AS_LAST_USED_FOR_TYPE);
       return toFields().set_as_last_used_for_type;
    } 

    /**
     * 
     * <br>See {@link OnGetSupportedTypes#onGetSupportedTypes}
    */
    public static final String GET_SUPPORTED_TYPES = "get_supported_types";

    /**
     * 
     * <br>See {@link OnGetSupportedTypes#onGetSupportedTypes}
    */
    public void setFieldGetSupportedTypes(OnGetSupportedTypes get_supported_types) {
        toFields().get_supported_types = toOnGetSupportedTypes(this, GET_SUPPORTED_TYPES, get_supported_types);
        toFields().writeField(GET_SUPPORTED_TYPES);
    }

    /**
     * 
     * <br>See {@link OnGetSupportedTypes#onGetSupportedTypes}
    */
    public JnaAppInfoIface.OnGetSupportedTypes getFieldGetSupportedTypes() {
       toFields().readField(GET_SUPPORTED_TYPES);
       return toFields().get_supported_types;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String LAUNCH_URIS_ASYNC = "launch_uris_async";

    /**
     * 
     * <br>See {@link OnLaunchUrisFinish#onLaunchUrisFinish}
    */
    public static final String LAUNCH_URIS_FINISH = "launch_uris_finish";

    /**
     * 
     * <br>See {@link OnLaunchUrisFinish#onLaunchUrisFinish}
    */
    public void setFieldLaunchUrisFinish(OnLaunchUrisFinish launch_uris_finish) {
        toFields().launch_uris_finish = toOnLaunchUrisFinish(this, LAUNCH_URIS_FINISH, launch_uris_finish);
        toFields().writeField(LAUNCH_URIS_FINISH);
    }

    /**
     * 
     * <br>See {@link OnLaunchUrisFinish#onLaunchUrisFinish}
    */
    public JnaAppInfoIface.OnLaunchUrisFinish getFieldLaunchUrisFinish() {
       toFields().readField(LAUNCH_URIS_FINISH);
       return toFields().launch_uris_finish;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(AppInfo.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(AppInfo.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
