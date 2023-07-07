/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An interface for writing VFS file handles.
 * <p><a href="https://docs.gtk.org/gio/struct.FileIface.html">https://docs.gtk.org/gio/struct.FileIface.html</a></p>
*/
public class FileIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDup {
        /**
         * 
         * @param file input &#35;GFile
         * @return a new &#35;GFile that is a duplicate   of the given &#35;GFile.
        */
        File onDup(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file);
    }
    
    private static JnaFileIface.OnDup toOnDup(ch.bailu.gtk.type.Pointer instance, String methodName, OnDup in) {
        JnaFileIface.OnDup out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file) -> in.onDup(__callback, new File(new PointerContainer(_file))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHash {
        /**
         * 
         * @param file &#35;gconstpointer to a &#35;GFile
         * @return 0 if &#64;file is not a valid &#35;GFile, otherwise an   integer that can be used as hash value for the &#35;GFile.   This function is intended for easily hashing a &#35;GFile to   add to a &#35;GHashTable or similar data structure.
        */
        int onHash(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file);
    }
    
    private static JnaFileIface.OnHash toOnHash(ch.bailu.gtk.type.Pointer instance, String methodName, OnHash in) {
        JnaFileIface.OnHash out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file) -> in.onHash(__callback, new File(new PointerContainer(_file)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEqual {
        /**
         * 
         * @param file1 the first &#35;GFile
         * @param file2 the second &#35;GFile
         * @return %TRUE if &#64;file1 and &#64;file2 are equal.
        */
        boolean onEqual(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file1, @Nonnull File file2);
    }
    
    private static JnaFileIface.OnEqual toOnEqual(ch.bailu.gtk.type.Pointer instance, String methodName, OnEqual in) {
        JnaFileIface.OnEqual out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file1, _file2) -> in.onEqual(__callback, new File(new PointerContainer(_file1)), new File(new PointerContainer(_file2)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIsNative {
        /**
         * 
         * @param file input &#35;GFile
         * @return %TRUE if &#64;file is native
        */
        boolean onIsNative(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file);
    }
    
    private static JnaFileIface.OnIsNative toOnIsNative(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsNative in) {
        JnaFileIface.OnIsNative out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file) -> in.onIsNative(__callback, new File(new PointerContainer(_file)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnHasUriScheme {
        /**
         * 
         * @param file input &#35;GFile
         * @param uri_scheme a string containing a URI scheme
         * @return %TRUE if &#35;GFile's backend supports the   given URI scheme, %FALSE if URI scheme is %NULL,   not supported, or &#35;GFile is invalid.
        */
        boolean onHasUriScheme(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull ch.bailu.gtk.type.Str uri_scheme);
    }
    
    private static JnaFileIface.OnHasUriScheme toOnHasUriScheme(ch.bailu.gtk.type.Pointer instance, String methodName, OnHasUriScheme in) {
        JnaFileIface.OnHasUriScheme out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _uri_scheme) -> in.onHasUriScheme(__callback, new File(new PointerContainer(_file)), new ch.bailu.gtk.type.Str(new PointerContainer(_uri_scheme)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetUriScheme {
        /**
         * 
         * @param file input &#35;GFile
         * @return a string containing the URI scheme for the given   &#35;GFile or %NULL if the &#35;GFile was constructed with an invalid URI. The   returned string should be freed with g_free() when no longer needed.
        */
        ch.bailu.gtk.type.Str onGetUriScheme(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file);
    }
    
    private static JnaFileIface.OnGetUriScheme toOnGetUriScheme(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetUriScheme in) {
        JnaFileIface.OnGetUriScheme out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file) -> in.onGetUriScheme(__callback, new File(new PointerContainer(_file))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetBasename {
        /**
         * 
         * @param file input &#35;GFile
         * @return string containing the &#35;GFile's   base name, or %NULL if given &#35;GFile is invalid. The returned string   should be freed with g_free() when no longer needed.
        */
        ch.bailu.gtk.type.Str onGetBasename(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file);
    }
    
    private static JnaFileIface.OnGetBasename toOnGetBasename(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetBasename in) {
        JnaFileIface.OnGetBasename out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file) -> in.onGetBasename(__callback, new File(new PointerContainer(_file))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetPath {
        /**
         * 
         * @param file input &#35;GFile
         * @return string containing the &#35;GFile's path,   or %NULL if no such path exists. The returned string should be freed   with g_free() when no longer needed.
        */
        ch.bailu.gtk.type.Str onGetPath(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file);
    }
    
    private static JnaFileIface.OnGetPath toOnGetPath(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetPath in) {
        JnaFileIface.OnGetPath out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file) -> in.onGetPath(__callback, new File(new PointerContainer(_file))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetUri {
        /**
         * 
         * @param file input &#35;GFile
         * @return a string containing the &#35;GFile's URI. If the &#35;GFile was constructed   with an invalid URI, an invalid URI is returned.   The returned string should be freed with g_free()   when no longer needed.
        */
        ch.bailu.gtk.type.Str onGetUri(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file);
    }
    
    private static JnaFileIface.OnGetUri toOnGetUri(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetUri in) {
        JnaFileIface.OnGetUri out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file) -> in.onGetUri(__callback, new File(new PointerContainer(_file))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetParseName {
        /**
         * 
         * @param file input &#35;GFile
         * @return a string containing the &#35;GFile's parse name.   The returned string should be freed with g_free()   when no longer needed.
        */
        ch.bailu.gtk.type.Str onGetParseName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file);
    }
    
    private static JnaFileIface.OnGetParseName toOnGetParseName(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetParseName in) {
        JnaFileIface.OnGetParseName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file) -> in.onGetParseName(__callback, new File(new PointerContainer(_file))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetParent {
        /**
         * 
         * @param file input &#35;GFile
         * @return a &#35;GFile structure to the   parent of the given &#35;GFile or %NULL if there is no parent. Free   the returned object with g_object_unref().
        */
        File onGetParent(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file);
    }
    
    private static JnaFileIface.OnGetParent toOnGetParent(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetParent in) {
        JnaFileIface.OnGetParent out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file) -> in.onGetParent(__callback, new File(new PointerContainer(_file))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnPrefixMatches {
        /**
         * 
         * @param prefix input &#35;GFile
         * @param file input &#35;GFile
         * @return %TRUE if the &#64;file's parent, grandparent, etc is &#64;prefix,   %FALSE otherwise.
        */
        boolean onPrefixMatches(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File prefix, @Nonnull File file);
    }
    
    private static JnaFileIface.OnPrefixMatches toOnPrefixMatches(ch.bailu.gtk.type.Pointer instance, String methodName, OnPrefixMatches in) {
        JnaFileIface.OnPrefixMatches out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_prefix, _file) -> in.onPrefixMatches(__callback, new File(new PointerContainer(_prefix)), new File(new PointerContainer(_file)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetRelativePath {
        /**
         * 
         * @param parent input &#35;GFile
         * @param descendant input &#35;GFile
         * @return string with the relative path from   &#64;descendant to &#64;parent, or %NULL if &#64;descendant doesn't have &#64;parent as   prefix. The returned string should be freed with g_free() when   no longer needed.
        */
        ch.bailu.gtk.type.Str onGetRelativePath(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File parent, @Nonnull File descendant);
    }
    
    private static JnaFileIface.OnGetRelativePath toOnGetRelativePath(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetRelativePath in) {
        JnaFileIface.OnGetRelativePath out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_parent, _descendant) -> in.onGetRelativePath(__callback, new File(new PointerContainer(_parent)), new File(new PointerContainer(_descendant))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnResolveRelativePath {
        /**
         * 
         * @param file input &#35;GFile
         * @param relative_path a given relative path string
         * @return a &#35;GFile for the resolved path.
        */
        File onResolveRelativePath(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull ch.bailu.gtk.type.Str relative_path);
    }
    
    private static JnaFileIface.OnResolveRelativePath toOnResolveRelativePath(ch.bailu.gtk.type.Pointer instance, String methodName, OnResolveRelativePath in) {
        JnaFileIface.OnResolveRelativePath out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _relative_path) -> in.onResolveRelativePath(__callback, new File(new PointerContainer(_file)), new ch.bailu.gtk.type.Str(new PointerContainer(_relative_path))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetChildForDisplayName {
        /**
         * 
         * @param file input &#35;GFile
         * @param display_name string to a possible child
         * @return a &#35;GFile to the specified child, or   %NULL if the display name couldn't be converted.   Free the returned object with g_object_unref().
        */
        File onGetChildForDisplayName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull ch.bailu.gtk.type.Str display_name);
    }
    
    private static JnaFileIface.OnGetChildForDisplayName toOnGetChildForDisplayName(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetChildForDisplayName in) {
        JnaFileIface.OnGetChildForDisplayName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _display_name, _error) -> in.onGetChildForDisplayName(__callback, new File(new PointerContainer(_file)), new ch.bailu.gtk.type.Str(new PointerContainer(_display_name))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEnumerateChildren {
        /**
         * 
         * @param file input &#35;GFile
         * @param attributes an attribute query string
         * @param flags a set of &#35;GFileQueryInfoFlags
         * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
         * @return A &#35;GFileEnumerator if successful,   %NULL on error. Free the returned object with g_object_unref().
        */
        FileEnumerator onEnumerateChildren(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull ch.bailu.gtk.type.Str attributes, int flags, @Nullable Cancellable cancellable);
    }
    
    private static JnaFileIface.OnEnumerateChildren toOnEnumerateChildren(ch.bailu.gtk.type.Pointer instance, String methodName, OnEnumerateChildren in) {
        JnaFileIface.OnEnumerateChildren out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _attributes, _flags, _cancellable, _error) -> in.onEnumerateChildren(__callback, new File(new PointerContainer(_file)), new ch.bailu.gtk.type.Str(new PointerContainer(_attributes)), _flags, new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnEnumerateChildrenFinish {
        /**
         * 
         * @param file input &#35;GFile
         * @param res a &#35;GAsyncResult
         * @return a &#35;GFileEnumerator or %NULL   if an error occurred.   Free the returned object with g_object_unref().
        */
        FileEnumerator onEnumerateChildrenFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull AsyncResult res);
    }
    
    private static JnaFileIface.OnEnumerateChildrenFinish toOnEnumerateChildrenFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnEnumerateChildrenFinish in) {
        JnaFileIface.OnEnumerateChildrenFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _res, _error) -> in.onEnumerateChildrenFinish(__callback, new File(new PointerContainer(_file)), new AsyncResult(new PointerContainer(_res))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnQueryInfo {
        /**
         * 
         * @param file input &#35;GFile
         * @param attributes an attribute query string
         * @param flags a set of &#35;GFileQueryInfoFlags
         * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
         * @return a &#35;GFileInfo for the given &#64;file, or %NULL   on error. Free the returned object with g_object_unref().
        */
        FileInfo onQueryInfo(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull ch.bailu.gtk.type.Str attributes, int flags, @Nullable Cancellable cancellable);
    }
    
    private static JnaFileIface.OnQueryInfo toOnQueryInfo(ch.bailu.gtk.type.Pointer instance, String methodName, OnQueryInfo in) {
        JnaFileIface.OnQueryInfo out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _attributes, _flags, _cancellable, _error) -> in.onQueryInfo(__callback, new File(new PointerContainer(_file)), new ch.bailu.gtk.type.Str(new PointerContainer(_attributes)), _flags, new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnQueryInfoFinish {
        /**
         * 
         * @param file input &#35;GFile
         * @param res a &#35;GAsyncResult
         * @return &#35;GFileInfo for given &#64;file   or %NULL on error. Free the returned object with   g_object_unref().
        */
        FileInfo onQueryInfoFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull AsyncResult res);
    }
    
    private static JnaFileIface.OnQueryInfoFinish toOnQueryInfoFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnQueryInfoFinish in) {
        JnaFileIface.OnQueryInfoFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _res, _error) -> in.onQueryInfoFinish(__callback, new File(new PointerContainer(_file)), new AsyncResult(new PointerContainer(_res))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnQueryFilesystemInfo {
        /**
         * 
         * @param file input &#35;GFile
         * @param attributes an attribute query string
         * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
         * @return a &#35;GFileInfo or %NULL if there was an error.   Free the returned object with g_object_unref().
        */
        FileInfo onQueryFilesystemInfo(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull ch.bailu.gtk.type.Str attributes, @Nullable Cancellable cancellable);
    }
    
    private static JnaFileIface.OnQueryFilesystemInfo toOnQueryFilesystemInfo(ch.bailu.gtk.type.Pointer instance, String methodName, OnQueryFilesystemInfo in) {
        JnaFileIface.OnQueryFilesystemInfo out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _attributes, _cancellable, _error) -> in.onQueryFilesystemInfo(__callback, new File(new PointerContainer(_file)), new ch.bailu.gtk.type.Str(new PointerContainer(_attributes)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnQueryFilesystemInfoFinish {
        /**
         * 
         * @param file input &#35;GFile
         * @param res a &#35;GAsyncResult
         * @return &#35;GFileInfo for given &#64;file   or %NULL on error.   Free the returned object with g_object_unref().
        */
        FileInfo onQueryFilesystemInfoFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull AsyncResult res);
    }
    
    private static JnaFileIface.OnQueryFilesystemInfoFinish toOnQueryFilesystemInfoFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnQueryFilesystemInfoFinish in) {
        JnaFileIface.OnQueryFilesystemInfoFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _res, _error) -> in.onQueryFilesystemInfoFinish(__callback, new File(new PointerContainer(_file)), new AsyncResult(new PointerContainer(_res))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFindEnclosingMount {
        /**
         * 
         * @param file input &#35;GFile
         * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
         * @return a &#35;GMount where the &#64;file is located   or %NULL on error.   Free the returned object with g_object_unref().
        */
        Mount onFindEnclosingMount(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nullable Cancellable cancellable);
    }
    
    private static JnaFileIface.OnFindEnclosingMount toOnFindEnclosingMount(ch.bailu.gtk.type.Pointer instance, String methodName, OnFindEnclosingMount in) {
        JnaFileIface.OnFindEnclosingMount out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _cancellable, _error) -> in.onFindEnclosingMount(__callback, new File(new PointerContainer(_file)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFindEnclosingMountFinish {
        /**
         * 
         * @param file a &#35;GFile
         * @param res a &#35;GAsyncResult
         * @return &#35;GMount for given &#64;file or %NULL on error.   Free the returned object with g_object_unref().
        */
        Mount onFindEnclosingMountFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull AsyncResult res);
    }
    
    private static JnaFileIface.OnFindEnclosingMountFinish toOnFindEnclosingMountFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnFindEnclosingMountFinish in) {
        JnaFileIface.OnFindEnclosingMountFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _res, _error) -> in.onFindEnclosingMountFinish(__callback, new File(new PointerContainer(_file)), new AsyncResult(new PointerContainer(_res))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetDisplayName {
        /**
         * 
         * @param file input &#35;GFile
         * @param display_name a string
         * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
         * @return a &#35;GFile specifying what &#64;file was renamed to,   or %NULL if there was an error.   Free the returned object with g_object_unref().
        */
        File onSetDisplayName(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull ch.bailu.gtk.type.Str display_name, @Nullable Cancellable cancellable);
    }
    
    private static JnaFileIface.OnSetDisplayName toOnSetDisplayName(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetDisplayName in) {
        JnaFileIface.OnSetDisplayName out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _display_name, _cancellable, _error) -> in.onSetDisplayName(__callback, new File(new PointerContainer(_file)), new ch.bailu.gtk.type.Str(new PointerContainer(_display_name)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetDisplayNameFinish {
        /**
         * 
         * @param file input &#35;GFile
         * @param res a &#35;GAsyncResult
         * @return a &#35;GFile or %NULL on error.   Free the returned object with g_object_unref().
        */
        File onSetDisplayNameFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull AsyncResult res);
    }
    
    private static JnaFileIface.OnSetDisplayNameFinish toOnSetDisplayNameFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetDisplayNameFinish in) {
        JnaFileIface.OnSetDisplayNameFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _res, _error) -> in.onSetDisplayNameFinish(__callback, new File(new PointerContainer(_file)), new AsyncResult(new PointerContainer(_res))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnQuerySettableAttributes {
        /**
         * 
         * @param file input &#35;GFile
         * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
         * @return a &#35;GFileAttributeInfoList describing the settable attributes.   When you are done with it, release it with   g_file_attribute_info_list_unref()
        */
        FileAttributeInfoList onQuerySettableAttributes(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nullable Cancellable cancellable);
    }
    
    private static JnaFileIface.OnQuerySettableAttributes toOnQuerySettableAttributes(ch.bailu.gtk.type.Pointer instance, String methodName, OnQuerySettableAttributes in) {
        JnaFileIface.OnQuerySettableAttributes out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _cancellable, _error) -> in.onQuerySettableAttributes(__callback, new File(new PointerContainer(_file)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnQuerySettableAttributesAsync {
        void onQuerySettableAttributesAsync(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFileIface.OnQuerySettableAttributesAsync toOnQuerySettableAttributesAsync(ch.bailu.gtk.type.Pointer instance, String methodName, OnQuerySettableAttributesAsync in) {
        JnaFileIface.OnQuerySettableAttributesAsync out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onQuerySettableAttributesAsync(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnQuerySettableAttributesFinish {
        void onQuerySettableAttributesFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFileIface.OnQuerySettableAttributesFinish toOnQuerySettableAttributesFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnQuerySettableAttributesFinish in) {
        JnaFileIface.OnQuerySettableAttributesFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onQuerySettableAttributesFinish(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnQueryWritableNamespaces {
        /**
         * 
         * @param file input &#35;GFile
         * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
         * @return a &#35;GFileAttributeInfoList describing the writable namespaces.   When you are done with it, release it with   g_file_attribute_info_list_unref()
        */
        FileAttributeInfoList onQueryWritableNamespaces(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nullable Cancellable cancellable);
    }
    
    private static JnaFileIface.OnQueryWritableNamespaces toOnQueryWritableNamespaces(ch.bailu.gtk.type.Pointer instance, String methodName, OnQueryWritableNamespaces in) {
        JnaFileIface.OnQueryWritableNamespaces out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _cancellable, _error) -> in.onQueryWritableNamespaces(__callback, new File(new PointerContainer(_file)), new Cancellable(new PointerContainer(_cancellable))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnQueryWritableNamespacesAsync {
        void onQueryWritableNamespacesAsync(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFileIface.OnQueryWritableNamespacesAsync toOnQueryWritableNamespacesAsync(ch.bailu.gtk.type.Pointer instance, String methodName, OnQueryWritableNamespacesAsync in) {
        JnaFileIface.OnQueryWritableNamespacesAsync out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onQueryWritableNamespacesAsync(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnQueryWritableNamespacesFinish {
        void onQueryWritableNamespacesFinish(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaFileIface.OnQueryWritableNamespacesFinish toOnQueryWritableNamespacesFinish(ch.bailu.gtk.type.Pointer instance, String methodName, OnQueryWritableNamespacesFinish in) {
        JnaFileIface.OnQueryWritableNamespacesFinish out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onQueryWritableNamespacesFinish(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetAttribute {
        /**
         * 
         * @param file input &#35;GFile
         * @param attribute a string containing the attribute's name
         * @param type The type of the attribute
         * @param value_p a pointer to the value (or the pointer   itself if the type is a pointer type)
         * @param flags a set of &#35;GFileQueryInfoFlags
         * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
         * @return %TRUE if the attribute was set, %FALSE otherwise.
        */
        boolean onSetAttribute(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull ch.bailu.gtk.type.Str attribute, int type, @Nullable ch.bailu.gtk.type.Pointer value_p, int flags, @Nullable Cancellable cancellable);
    }
    
    private static JnaFileIface.OnSetAttribute toOnSetAttribute(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetAttribute in) {
        JnaFileIface.OnSetAttribute out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _attribute, _type, _value_p, _flags, _cancellable, _error) -> in.onSetAttribute(__callback, new File(new PointerContainer(_file)), new ch.bailu.gtk.type.Str(new PointerContainer(_attribute)), _type, new ch.bailu.gtk.type.Pointer(new PointerContainer(_value_p)), _flags, new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnSetAttributesFromInfo {
        /**
         * 
         * @param file input &#35;GFile
         * @param info a &#35;GFileInfo
         * @param flags &#35;GFileQueryInfoFlags
         * @param cancellable optional &#35;GCancellable object,   %NULL to ignore
         * @return %FALSE if there was any error, %TRUE otherwise.
        */
        boolean onSetAttributesFromInfo(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull File file, @Nonnull FileInfo info, int flags, @Nullable Cancellable cancellable);
    }
    
    private static JnaFileIface.OnSetAttributesFromInfo toOnSetAttributesFromInfo(ch.bailu.gtk.type.Pointer instance, String methodName, OnSetAttributesFromInfo in) {
        JnaFileIface.OnSetAttributesFromInfo out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_file, _info, _flags, _cancellable, _error) -> in.onSetAttributesFromInfo(__callback, new File(new PointerContainer(_file)), new FileInfo(new PointerContainer(_info)), _flags, new Cancellable(new PointerContainer(_cancellable)));
            __callback.register(out);
        }
        return out;
    }

    public FileIface(PointerContainer pointer) {
        super(pointer);
    }

    private JnaFileIface.Fields _fields;
    
    JnaFileIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFileIface.Fields(asCPointer());
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
    public JnaFileIface.OnDup getFieldDup() {
       toFields().readField(DUP);
       return toFields().dup;
    } 

    /**
     * 
     * <br>See {@link OnHash#onHash}
    */
    public static final String HASH = "hash";

    /**
     * 
     * <br>See {@link OnHash#onHash}
    */
    public void setFieldHash(OnHash hash) {
        toFields().hash = toOnHash(this, HASH, hash);
        toFields().writeField(HASH);
    }

    /**
     * 
     * <br>See {@link OnHash#onHash}
    */
    public JnaFileIface.OnHash getFieldHash() {
       toFields().readField(HASH);
       return toFields().hash;
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
    public JnaFileIface.OnEqual getFieldEqual() {
       toFields().readField(EQUAL);
       return toFields().equal;
    } 

    /**
     * 
     * <br>See {@link OnIsNative#onIsNative}
    */
    public static final String IS_NATIVE = "is_native";

    /**
     * 
     * <br>See {@link OnIsNative#onIsNative}
    */
    public void setFieldIsNative(OnIsNative is_native) {
        toFields().is_native = toOnIsNative(this, IS_NATIVE, is_native);
        toFields().writeField(IS_NATIVE);
    }

    /**
     * 
     * <br>See {@link OnIsNative#onIsNative}
    */
    public JnaFileIface.OnIsNative getFieldIsNative() {
       toFields().readField(IS_NATIVE);
       return toFields().is_native;
    } 

    /**
     * 
     * <br>See {@link OnHasUriScheme#onHasUriScheme}
    */
    public static final String HAS_URI_SCHEME = "has_uri_scheme";

    /**
     * 
     * <br>See {@link OnHasUriScheme#onHasUriScheme}
    */
    public void setFieldHasUriScheme(OnHasUriScheme has_uri_scheme) {
        toFields().has_uri_scheme = toOnHasUriScheme(this, HAS_URI_SCHEME, has_uri_scheme);
        toFields().writeField(HAS_URI_SCHEME);
    }

    /**
     * 
     * <br>See {@link OnHasUriScheme#onHasUriScheme}
    */
    public JnaFileIface.OnHasUriScheme getFieldHasUriScheme() {
       toFields().readField(HAS_URI_SCHEME);
       return toFields().has_uri_scheme;
    } 

    /**
     * 
     * <br>See {@link OnGetUriScheme#onGetUriScheme}
    */
    public static final String GET_URI_SCHEME = "get_uri_scheme";

    /**
     * 
     * <br>See {@link OnGetUriScheme#onGetUriScheme}
    */
    public void setFieldGetUriScheme(OnGetUriScheme get_uri_scheme) {
        toFields().get_uri_scheme = toOnGetUriScheme(this, GET_URI_SCHEME, get_uri_scheme);
        toFields().writeField(GET_URI_SCHEME);
    }

    /**
     * 
     * <br>See {@link OnGetUriScheme#onGetUriScheme}
    */
    public JnaFileIface.OnGetUriScheme getFieldGetUriScheme() {
       toFields().readField(GET_URI_SCHEME);
       return toFields().get_uri_scheme;
    } 

    /**
     * 
     * <br>See {@link OnGetBasename#onGetBasename}
    */
    public static final String GET_BASENAME = "get_basename";

    /**
     * 
     * <br>See {@link OnGetBasename#onGetBasename}
    */
    public void setFieldGetBasename(OnGetBasename get_basename) {
        toFields().get_basename = toOnGetBasename(this, GET_BASENAME, get_basename);
        toFields().writeField(GET_BASENAME);
    }

    /**
     * 
     * <br>See {@link OnGetBasename#onGetBasename}
    */
    public JnaFileIface.OnGetBasename getFieldGetBasename() {
       toFields().readField(GET_BASENAME);
       return toFields().get_basename;
    } 

    /**
     * 
     * <br>See {@link OnGetPath#onGetPath}
    */
    public static final String GET_PATH = "get_path";

    /**
     * 
     * <br>See {@link OnGetPath#onGetPath}
    */
    public void setFieldGetPath(OnGetPath get_path) {
        toFields().get_path = toOnGetPath(this, GET_PATH, get_path);
        toFields().writeField(GET_PATH);
    }

    /**
     * 
     * <br>See {@link OnGetPath#onGetPath}
    */
    public JnaFileIface.OnGetPath getFieldGetPath() {
       toFields().readField(GET_PATH);
       return toFields().get_path;
    } 

    /**
     * 
     * <br>See {@link OnGetUri#onGetUri}
    */
    public static final String GET_URI = "get_uri";

    /**
     * 
     * <br>See {@link OnGetUri#onGetUri}
    */
    public void setFieldGetUri(OnGetUri get_uri) {
        toFields().get_uri = toOnGetUri(this, GET_URI, get_uri);
        toFields().writeField(GET_URI);
    }

    /**
     * 
     * <br>See {@link OnGetUri#onGetUri}
    */
    public JnaFileIface.OnGetUri getFieldGetUri() {
       toFields().readField(GET_URI);
       return toFields().get_uri;
    } 

    /**
     * 
     * <br>See {@link OnGetParseName#onGetParseName}
    */
    public static final String GET_PARSE_NAME = "get_parse_name";

    /**
     * 
     * <br>See {@link OnGetParseName#onGetParseName}
    */
    public void setFieldGetParseName(OnGetParseName get_parse_name) {
        toFields().get_parse_name = toOnGetParseName(this, GET_PARSE_NAME, get_parse_name);
        toFields().writeField(GET_PARSE_NAME);
    }

    /**
     * 
     * <br>See {@link OnGetParseName#onGetParseName}
    */
    public JnaFileIface.OnGetParseName getFieldGetParseName() {
       toFields().readField(GET_PARSE_NAME);
       return toFields().get_parse_name;
    } 

    /**
     * 
     * <br>See {@link OnGetParent#onGetParent}
    */
    public static final String GET_PARENT = "get_parent";

    /**
     * 
     * <br>See {@link OnGetParent#onGetParent}
    */
    public void setFieldGetParent(OnGetParent get_parent) {
        toFields().get_parent = toOnGetParent(this, GET_PARENT, get_parent);
        toFields().writeField(GET_PARENT);
    }

    /**
     * 
     * <br>See {@link OnGetParent#onGetParent}
    */
    public JnaFileIface.OnGetParent getFieldGetParent() {
       toFields().readField(GET_PARENT);
       return toFields().get_parent;
    } 

    /**
     * 
     * <br>See {@link OnPrefixMatches#onPrefixMatches}
    */
    public static final String PREFIX_MATCHES = "prefix_matches";

    /**
     * 
     * <br>See {@link OnPrefixMatches#onPrefixMatches}
    */
    public void setFieldPrefixMatches(OnPrefixMatches prefix_matches) {
        toFields().prefix_matches = toOnPrefixMatches(this, PREFIX_MATCHES, prefix_matches);
        toFields().writeField(PREFIX_MATCHES);
    }

    /**
     * 
     * <br>See {@link OnPrefixMatches#onPrefixMatches}
    */
    public JnaFileIface.OnPrefixMatches getFieldPrefixMatches() {
       toFields().readField(PREFIX_MATCHES);
       return toFields().prefix_matches;
    } 

    /**
     * 
     * <br>See {@link OnGetRelativePath#onGetRelativePath}
    */
    public static final String GET_RELATIVE_PATH = "get_relative_path";

    /**
     * 
     * <br>See {@link OnGetRelativePath#onGetRelativePath}
    */
    public void setFieldGetRelativePath(OnGetRelativePath get_relative_path) {
        toFields().get_relative_path = toOnGetRelativePath(this, GET_RELATIVE_PATH, get_relative_path);
        toFields().writeField(GET_RELATIVE_PATH);
    }

    /**
     * 
     * <br>See {@link OnGetRelativePath#onGetRelativePath}
    */
    public JnaFileIface.OnGetRelativePath getFieldGetRelativePath() {
       toFields().readField(GET_RELATIVE_PATH);
       return toFields().get_relative_path;
    } 

    /**
     * 
     * <br>See {@link OnResolveRelativePath#onResolveRelativePath}
    */
    public static final String RESOLVE_RELATIVE_PATH = "resolve_relative_path";

    /**
     * 
     * <br>See {@link OnResolveRelativePath#onResolveRelativePath}
    */
    public void setFieldResolveRelativePath(OnResolveRelativePath resolve_relative_path) {
        toFields().resolve_relative_path = toOnResolveRelativePath(this, RESOLVE_RELATIVE_PATH, resolve_relative_path);
        toFields().writeField(RESOLVE_RELATIVE_PATH);
    }

    /**
     * 
     * <br>See {@link OnResolveRelativePath#onResolveRelativePath}
    */
    public JnaFileIface.OnResolveRelativePath getFieldResolveRelativePath() {
       toFields().readField(RESOLVE_RELATIVE_PATH);
       return toFields().resolve_relative_path;
    } 

    /**
     * 
     * <br>See {@link OnGetChildForDisplayName#onGetChildForDisplayName}
    */
    public static final String GET_CHILD_FOR_DISPLAY_NAME = "get_child_for_display_name";

    /**
     * 
     * <br>See {@link OnGetChildForDisplayName#onGetChildForDisplayName}
    */
    public void setFieldGetChildForDisplayName(OnGetChildForDisplayName get_child_for_display_name) {
        toFields().get_child_for_display_name = toOnGetChildForDisplayName(this, GET_CHILD_FOR_DISPLAY_NAME, get_child_for_display_name);
        toFields().writeField(GET_CHILD_FOR_DISPLAY_NAME);
    }

    /**
     * 
     * <br>See {@link OnGetChildForDisplayName#onGetChildForDisplayName}
    */
    public JnaFileIface.OnGetChildForDisplayName getFieldGetChildForDisplayName() {
       toFields().readField(GET_CHILD_FOR_DISPLAY_NAME);
       return toFields().get_child_for_display_name;
    } 

    /**
     * 
     * <br>See {@link OnEnumerateChildren#onEnumerateChildren}
    */
    public static final String ENUMERATE_CHILDREN = "enumerate_children";

    /**
     * 
     * <br>See {@link OnEnumerateChildren#onEnumerateChildren}
    */
    public void setFieldEnumerateChildren(OnEnumerateChildren enumerate_children) {
        toFields().enumerate_children = toOnEnumerateChildren(this, ENUMERATE_CHILDREN, enumerate_children);
        toFields().writeField(ENUMERATE_CHILDREN);
    }

    /**
     * 
     * <br>See {@link OnEnumerateChildren#onEnumerateChildren}
    */
    public JnaFileIface.OnEnumerateChildren getFieldEnumerateChildren() {
       toFields().readField(ENUMERATE_CHILDREN);
       return toFields().enumerate_children;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String ENUMERATE_CHILDREN_ASYNC = "enumerate_children_async";

    /**
     * 
     * <br>See {@link OnEnumerateChildrenFinish#onEnumerateChildrenFinish}
    */
    public static final String ENUMERATE_CHILDREN_FINISH = "enumerate_children_finish";

    /**
     * 
     * <br>See {@link OnEnumerateChildrenFinish#onEnumerateChildrenFinish}
    */
    public void setFieldEnumerateChildrenFinish(OnEnumerateChildrenFinish enumerate_children_finish) {
        toFields().enumerate_children_finish = toOnEnumerateChildrenFinish(this, ENUMERATE_CHILDREN_FINISH, enumerate_children_finish);
        toFields().writeField(ENUMERATE_CHILDREN_FINISH);
    }

    /**
     * 
     * <br>See {@link OnEnumerateChildrenFinish#onEnumerateChildrenFinish}
    */
    public JnaFileIface.OnEnumerateChildrenFinish getFieldEnumerateChildrenFinish() {
       toFields().readField(ENUMERATE_CHILDREN_FINISH);
       return toFields().enumerate_children_finish;
    } 

    /**
     * 
     * <br>See {@link OnQueryInfo#onQueryInfo}
    */
    public static final String QUERY_INFO = "query_info";

    /**
     * 
     * <br>See {@link OnQueryInfo#onQueryInfo}
    */
    public void setFieldQueryInfo(OnQueryInfo query_info) {
        toFields().query_info = toOnQueryInfo(this, QUERY_INFO, query_info);
        toFields().writeField(QUERY_INFO);
    }

    /**
     * 
     * <br>See {@link OnQueryInfo#onQueryInfo}
    */
    public JnaFileIface.OnQueryInfo getFieldQueryInfo() {
       toFields().readField(QUERY_INFO);
       return toFields().query_info;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String QUERY_INFO_ASYNC = "query_info_async";

    /**
     * 
     * <br>See {@link OnQueryInfoFinish#onQueryInfoFinish}
    */
    public static final String QUERY_INFO_FINISH = "query_info_finish";

    /**
     * 
     * <br>See {@link OnQueryInfoFinish#onQueryInfoFinish}
    */
    public void setFieldQueryInfoFinish(OnQueryInfoFinish query_info_finish) {
        toFields().query_info_finish = toOnQueryInfoFinish(this, QUERY_INFO_FINISH, query_info_finish);
        toFields().writeField(QUERY_INFO_FINISH);
    }

    /**
     * 
     * <br>See {@link OnQueryInfoFinish#onQueryInfoFinish}
    */
    public JnaFileIface.OnQueryInfoFinish getFieldQueryInfoFinish() {
       toFields().readField(QUERY_INFO_FINISH);
       return toFields().query_info_finish;
    } 

    /**
     * 
     * <br>See {@link OnQueryFilesystemInfo#onQueryFilesystemInfo}
    */
    public static final String QUERY_FILESYSTEM_INFO = "query_filesystem_info";

    /**
     * 
     * <br>See {@link OnQueryFilesystemInfo#onQueryFilesystemInfo}
    */
    public void setFieldQueryFilesystemInfo(OnQueryFilesystemInfo query_filesystem_info) {
        toFields().query_filesystem_info = toOnQueryFilesystemInfo(this, QUERY_FILESYSTEM_INFO, query_filesystem_info);
        toFields().writeField(QUERY_FILESYSTEM_INFO);
    }

    /**
     * 
     * <br>See {@link OnQueryFilesystemInfo#onQueryFilesystemInfo}
    */
    public JnaFileIface.OnQueryFilesystemInfo getFieldQueryFilesystemInfo() {
       toFields().readField(QUERY_FILESYSTEM_INFO);
       return toFields().query_filesystem_info;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String QUERY_FILESYSTEM_INFO_ASYNC = "query_filesystem_info_async";

    /**
     * 
     * <br>See {@link OnQueryFilesystemInfoFinish#onQueryFilesystemInfoFinish}
    */
    public static final String QUERY_FILESYSTEM_INFO_FINISH = "query_filesystem_info_finish";

    /**
     * 
     * <br>See {@link OnQueryFilesystemInfoFinish#onQueryFilesystemInfoFinish}
    */
    public void setFieldQueryFilesystemInfoFinish(OnQueryFilesystemInfoFinish query_filesystem_info_finish) {
        toFields().query_filesystem_info_finish = toOnQueryFilesystemInfoFinish(this, QUERY_FILESYSTEM_INFO_FINISH, query_filesystem_info_finish);
        toFields().writeField(QUERY_FILESYSTEM_INFO_FINISH);
    }

    /**
     * 
     * <br>See {@link OnQueryFilesystemInfoFinish#onQueryFilesystemInfoFinish}
    */
    public JnaFileIface.OnQueryFilesystemInfoFinish getFieldQueryFilesystemInfoFinish() {
       toFields().readField(QUERY_FILESYSTEM_INFO_FINISH);
       return toFields().query_filesystem_info_finish;
    } 

    /**
     * 
     * <br>See {@link OnFindEnclosingMount#onFindEnclosingMount}
    */
    public static final String FIND_ENCLOSING_MOUNT = "find_enclosing_mount";

    /**
     * 
     * <br>See {@link OnFindEnclosingMount#onFindEnclosingMount}
    */
    public void setFieldFindEnclosingMount(OnFindEnclosingMount find_enclosing_mount) {
        toFields().find_enclosing_mount = toOnFindEnclosingMount(this, FIND_ENCLOSING_MOUNT, find_enclosing_mount);
        toFields().writeField(FIND_ENCLOSING_MOUNT);
    }

    /**
     * 
     * <br>See {@link OnFindEnclosingMount#onFindEnclosingMount}
    */
    public JnaFileIface.OnFindEnclosingMount getFieldFindEnclosingMount() {
       toFields().readField(FIND_ENCLOSING_MOUNT);
       return toFields().find_enclosing_mount;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String FIND_ENCLOSING_MOUNT_ASYNC = "find_enclosing_mount_async";

    /**
     * 
     * <br>See {@link OnFindEnclosingMountFinish#onFindEnclosingMountFinish}
    */
    public static final String FIND_ENCLOSING_MOUNT_FINISH = "find_enclosing_mount_finish";

    /**
     * 
     * <br>See {@link OnFindEnclosingMountFinish#onFindEnclosingMountFinish}
    */
    public void setFieldFindEnclosingMountFinish(OnFindEnclosingMountFinish find_enclosing_mount_finish) {
        toFields().find_enclosing_mount_finish = toOnFindEnclosingMountFinish(this, FIND_ENCLOSING_MOUNT_FINISH, find_enclosing_mount_finish);
        toFields().writeField(FIND_ENCLOSING_MOUNT_FINISH);
    }

    /**
     * 
     * <br>See {@link OnFindEnclosingMountFinish#onFindEnclosingMountFinish}
    */
    public JnaFileIface.OnFindEnclosingMountFinish getFieldFindEnclosingMountFinish() {
       toFields().readField(FIND_ENCLOSING_MOUNT_FINISH);
       return toFields().find_enclosing_mount_finish;
    } 

    /**
     * 
     * <br>See {@link OnSetDisplayName#onSetDisplayName}
    */
    public static final String SET_DISPLAY_NAME = "set_display_name";

    /**
     * 
     * <br>See {@link OnSetDisplayName#onSetDisplayName}
    */
    public void setFieldSetDisplayName(OnSetDisplayName set_display_name) {
        toFields().set_display_name = toOnSetDisplayName(this, SET_DISPLAY_NAME, set_display_name);
        toFields().writeField(SET_DISPLAY_NAME);
    }

    /**
     * 
     * <br>See {@link OnSetDisplayName#onSetDisplayName}
    */
    public JnaFileIface.OnSetDisplayName getFieldSetDisplayName() {
       toFields().readField(SET_DISPLAY_NAME);
       return toFields().set_display_name;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String SET_DISPLAY_NAME_ASYNC = "set_display_name_async";

    /**
     * 
     * <br>See {@link OnSetDisplayNameFinish#onSetDisplayNameFinish}
    */
    public static final String SET_DISPLAY_NAME_FINISH = "set_display_name_finish";

    /**
     * 
     * <br>See {@link OnSetDisplayNameFinish#onSetDisplayNameFinish}
    */
    public void setFieldSetDisplayNameFinish(OnSetDisplayNameFinish set_display_name_finish) {
        toFields().set_display_name_finish = toOnSetDisplayNameFinish(this, SET_DISPLAY_NAME_FINISH, set_display_name_finish);
        toFields().writeField(SET_DISPLAY_NAME_FINISH);
    }

    /**
     * 
     * <br>See {@link OnSetDisplayNameFinish#onSetDisplayNameFinish}
    */
    public JnaFileIface.OnSetDisplayNameFinish getFieldSetDisplayNameFinish() {
       toFields().readField(SET_DISPLAY_NAME_FINISH);
       return toFields().set_display_name_finish;
    } 

    /**
     * 
     * <br>See {@link OnQuerySettableAttributes#onQuerySettableAttributes}
    */
    public static final String QUERY_SETTABLE_ATTRIBUTES = "query_settable_attributes";

    /**
     * 
     * <br>See {@link OnQuerySettableAttributes#onQuerySettableAttributes}
    */
    public void setFieldQuerySettableAttributes(OnQuerySettableAttributes query_settable_attributes) {
        toFields().query_settable_attributes = toOnQuerySettableAttributes(this, QUERY_SETTABLE_ATTRIBUTES, query_settable_attributes);
        toFields().writeField(QUERY_SETTABLE_ATTRIBUTES);
    }

    /**
     * 
     * <br>See {@link OnQuerySettableAttributes#onQuerySettableAttributes}
    */
    public JnaFileIface.OnQuerySettableAttributes getFieldQuerySettableAttributes() {
       toFields().readField(QUERY_SETTABLE_ATTRIBUTES);
       return toFields().query_settable_attributes;
    } 

    /**
     * 
     * <br>See {@link OnQuerySettableAttributesAsync#onQuerySettableAttributesAsync}
    */
    public static final String _QUERY_SETTABLE_ATTRIBUTES_ASYNC = "_query_settable_attributes_async";

    /**
     * 
     * <br>See {@link OnQuerySettableAttributesAsync#onQuerySettableAttributesAsync}
    */
    public void setFieldQuerySettableAttributesAsync(OnQuerySettableAttributesAsync _query_settable_attributes_async) {
        toFields()._query_settable_attributes_async = toOnQuerySettableAttributesAsync(this, _QUERY_SETTABLE_ATTRIBUTES_ASYNC, _query_settable_attributes_async);
        toFields().writeField(_QUERY_SETTABLE_ATTRIBUTES_ASYNC);
    }

    /**
     * 
     * <br>See {@link OnQuerySettableAttributesAsync#onQuerySettableAttributesAsync}
    */
    public JnaFileIface.OnQuerySettableAttributesAsync getFieldQuerySettableAttributesAsync() {
       toFields().readField(_QUERY_SETTABLE_ATTRIBUTES_ASYNC);
       return toFields()._query_settable_attributes_async;
    } 

    /**
     * 
     * <br>See {@link OnQuerySettableAttributesFinish#onQuerySettableAttributesFinish}
    */
    public static final String _QUERY_SETTABLE_ATTRIBUTES_FINISH = "_query_settable_attributes_finish";

    /**
     * 
     * <br>See {@link OnQuerySettableAttributesFinish#onQuerySettableAttributesFinish}
    */
    public void setFieldQuerySettableAttributesFinish(OnQuerySettableAttributesFinish _query_settable_attributes_finish) {
        toFields()._query_settable_attributes_finish = toOnQuerySettableAttributesFinish(this, _QUERY_SETTABLE_ATTRIBUTES_FINISH, _query_settable_attributes_finish);
        toFields().writeField(_QUERY_SETTABLE_ATTRIBUTES_FINISH);
    }

    /**
     * 
     * <br>See {@link OnQuerySettableAttributesFinish#onQuerySettableAttributesFinish}
    */
    public JnaFileIface.OnQuerySettableAttributesFinish getFieldQuerySettableAttributesFinish() {
       toFields().readField(_QUERY_SETTABLE_ATTRIBUTES_FINISH);
       return toFields()._query_settable_attributes_finish;
    } 

    /**
     * 
     * <br>See {@link OnQueryWritableNamespaces#onQueryWritableNamespaces}
    */
    public static final String QUERY_WRITABLE_NAMESPACES = "query_writable_namespaces";

    /**
     * 
     * <br>See {@link OnQueryWritableNamespaces#onQueryWritableNamespaces}
    */
    public void setFieldQueryWritableNamespaces(OnQueryWritableNamespaces query_writable_namespaces) {
        toFields().query_writable_namespaces = toOnQueryWritableNamespaces(this, QUERY_WRITABLE_NAMESPACES, query_writable_namespaces);
        toFields().writeField(QUERY_WRITABLE_NAMESPACES);
    }

    /**
     * 
     * <br>See {@link OnQueryWritableNamespaces#onQueryWritableNamespaces}
    */
    public JnaFileIface.OnQueryWritableNamespaces getFieldQueryWritableNamespaces() {
       toFields().readField(QUERY_WRITABLE_NAMESPACES);
       return toFields().query_writable_namespaces;
    } 

    /**
     * 
     * <br>See {@link OnQueryWritableNamespacesAsync#onQueryWritableNamespacesAsync}
    */
    public static final String _QUERY_WRITABLE_NAMESPACES_ASYNC = "_query_writable_namespaces_async";

    /**
     * 
     * <br>See {@link OnQueryWritableNamespacesAsync#onQueryWritableNamespacesAsync}
    */
    public void setFieldQueryWritableNamespacesAsync(OnQueryWritableNamespacesAsync _query_writable_namespaces_async) {
        toFields()._query_writable_namespaces_async = toOnQueryWritableNamespacesAsync(this, _QUERY_WRITABLE_NAMESPACES_ASYNC, _query_writable_namespaces_async);
        toFields().writeField(_QUERY_WRITABLE_NAMESPACES_ASYNC);
    }

    /**
     * 
     * <br>See {@link OnQueryWritableNamespacesAsync#onQueryWritableNamespacesAsync}
    */
    public JnaFileIface.OnQueryWritableNamespacesAsync getFieldQueryWritableNamespacesAsync() {
       toFields().readField(_QUERY_WRITABLE_NAMESPACES_ASYNC);
       return toFields()._query_writable_namespaces_async;
    } 

    /**
     * 
     * <br>See {@link OnQueryWritableNamespacesFinish#onQueryWritableNamespacesFinish}
    */
    public static final String _QUERY_WRITABLE_NAMESPACES_FINISH = "_query_writable_namespaces_finish";

    /**
     * 
     * <br>See {@link OnQueryWritableNamespacesFinish#onQueryWritableNamespacesFinish}
    */
    public void setFieldQueryWritableNamespacesFinish(OnQueryWritableNamespacesFinish _query_writable_namespaces_finish) {
        toFields()._query_writable_namespaces_finish = toOnQueryWritableNamespacesFinish(this, _QUERY_WRITABLE_NAMESPACES_FINISH, _query_writable_namespaces_finish);
        toFields().writeField(_QUERY_WRITABLE_NAMESPACES_FINISH);
    }

    /**
     * 
     * <br>See {@link OnQueryWritableNamespacesFinish#onQueryWritableNamespacesFinish}
    */
    public JnaFileIface.OnQueryWritableNamespacesFinish getFieldQueryWritableNamespacesFinish() {
       toFields().readField(_QUERY_WRITABLE_NAMESPACES_FINISH);
       return toFields()._query_writable_namespaces_finish;
    } 

    /**
     * 
     * <br>See {@link OnSetAttribute#onSetAttribute}
    */
    public static final String SET_ATTRIBUTE = "set_attribute";

    /**
     * 
     * <br>See {@link OnSetAttribute#onSetAttribute}
    */
    public void setFieldSetAttribute(OnSetAttribute set_attribute) {
        toFields().set_attribute = toOnSetAttribute(this, SET_ATTRIBUTE, set_attribute);
        toFields().writeField(SET_ATTRIBUTE);
    }

    /**
     * 
     * <br>See {@link OnSetAttribute#onSetAttribute}
    */
    public JnaFileIface.OnSetAttribute getFieldSetAttribute() {
       toFields().readField(SET_ATTRIBUTE);
       return toFields().set_attribute;
    } 

    /**
     * 
     * <br>See {@link OnSetAttributesFromInfo#onSetAttributesFromInfo}
    */
    public static final String SET_ATTRIBUTES_FROM_INFO = "set_attributes_from_info";

    /**
     * 
     * <br>See {@link OnSetAttributesFromInfo#onSetAttributesFromInfo}
    */
    public void setFieldSetAttributesFromInfo(OnSetAttributesFromInfo set_attributes_from_info) {
        toFields().set_attributes_from_info = toOnSetAttributesFromInfo(this, SET_ATTRIBUTES_FROM_INFO, set_attributes_from_info);
        toFields().writeField(SET_ATTRIBUTES_FROM_INFO);
    }

    /**
     * 
     * <br>See {@link OnSetAttributesFromInfo#onSetAttributesFromInfo}
    */
    public JnaFileIface.OnSetAttributesFromInfo getFieldSetAttributesFromInfo() {
       toFields().readField(SET_ATTRIBUTES_FROM_INFO);
       return toFields().set_attributes_from_info;
    } 

    /**
     * 
     * <br>Private field: cb-with-cb
    */
    public static final String SET_ATTRIBUTES_ASYNC = "set_attributes_async";

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(File.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(File.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:set_attributes_finish:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:read_fn:previous-field-unsupported:[MethodModel:Supported:readFn:[ParameterModel:Supported:{Gg:FileInputStream:{c:GFileInputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:readFn:[ParameterModel:Supported:{Gg:FileInputStream:{c:GFileInputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:read_async:previous-field-unsupported:[MethodModel:Supported:readAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:readAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:read_finish:previous-field-unsupported:[MethodModel:Supported:readFinish:[ParameterModel:Supported:{Gg:FileInputStream:{c:GFileInputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:readFinish:[ParameterModel:Supported:{Gg:FileInputStream:{c:GFileInputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:append_to:previous-field-unsupported:[MethodModel:Supported:appendTo:[ParameterModel:Supported:{Gg:FileOutputStream:{c:GFileOutputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:appendTo:[ParameterModel:Supported:{Gg:FileOutputStream:{c:GFileOutputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:append_to_async:previous-field-unsupported:[MethodModel:Supported:appendToAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:appendToAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:append_to_finish:previous-field-unsupported:[MethodModel:Supported:appendToFinish:[ParameterModel:Supported:{Gg:FileOutputStream:{c:GFileOutputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:appendToFinish:[ParameterModel:Supported:{Gg:FileOutputStream:{c:GFileOutputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:create:previous-field-unsupported:[MethodModel:Supported:create:[ParameterModel:Supported:{Gg:FileOutputStream:{c:GFileOutputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:create:[ParameterModel:Supported:{Gg:FileOutputStream:{c:GFileOutputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:create_async:previous-field-unsupported:[MethodModel:Supported:createAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:createAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:create_finish:previous-field-unsupported:[MethodModel:Supported:createFinish:[ParameterModel:Supported:{Gg:FileOutputStream:{c:GFileOutputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:createFinish:[ParameterModel:Supported:{Gg:FileOutputStream:{c:GFileOutputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:replace:previous-field-unsupported:[MethodModel:Supported:replace:[ParameterModel:Supported:{Gg:FileOutputStream:{c:GFileOutputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:replace:[ParameterModel:Supported:{Gg:FileOutputStream:{c:GFileOutputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:replace_async:previous-field-unsupported:[MethodModel:Supported:replaceAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:replaceAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:replace_finish:previous-field-unsupported:[MethodModel:Supported:replaceFinish:[ParameterModel:Supported:{Gg:FileOutputStream:{c:GFileOutputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:replaceFinish:[ParameterModel:Supported:{Gg:FileOutputStream:{c:GFileOutputStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:delete_file:previous-field-unsupported:[MethodModel:Supported:deleteFile:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:deleteFile:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:delete_file_async:previous-field-unsupported:[MethodModel:Supported:deleteFileAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:deleteFileAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:delete_file_finish:previous-field-unsupported:[MethodModel:Supported:deleteFileFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:deleteFileFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:trash:previous-field-unsupported:[MethodModel:Supported:trash:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:trash:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:trash_async:previous-field-unsupported:[MethodModel:Supported:trashAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:trashAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:trash_finish:previous-field-unsupported:[MethodModel:Supported:trashFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:trashFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:make_directory:previous-field-unsupported:[MethodModel:Supported:makeDirectory:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:makeDirectory:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:make_directory_async:previous-field-unsupported:[MethodModel:Supported:makeDirectoryAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:makeDirectoryAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:make_directory_finish:previous-field-unsupported:[MethodModel:Supported:makeDirectoryFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:makeDirectoryFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:make_symbolic_link:previous-field-unsupported:[MethodModel:Supported:makeSymbolicLink:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:makeSymbolicLink:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:make_symbolic_link_async:previous-field-unsupported:[MethodModel:Supported:makeSymbolicLinkAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:makeSymbolicLinkAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:make_symbolic_link_finish:previous-field-unsupported:[MethodModel:Supported:makeSymbolicLinkFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:makeSymbolicLinkFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:copy:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:copy_async:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:copy_finish:previous-field-unsupported:[MethodModel:Supported:copyFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:copyFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:move:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:move_async:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:move_finish:previous-field-unsupported:[MethodModel:Supported:moveFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:moveFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:mount_mountable:previous-field-unsupported:[MethodModel:Supported:mountMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountMountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:mountMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountMountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:mount_mountable_finish:previous-field-unsupported:[MethodModel:Supported:mountMountableFinish:[ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:mountMountableFinish:[ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:unmount_mountable:previous-field-unsupported:[MethodModel:Supported:unmountMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:unmountMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:unmount_mountable_finish:previous-field-unsupported:[MethodModel:Supported:unmountMountableFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:unmountMountableFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:eject_mountable:previous-field-unsupported:[MethodModel:Supported:ejectMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:ejectMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:eject_mountable_finish:previous-field-unsupported:[MethodModel:Supported:ejectMountableFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:ejectMountableFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:mount_enclosing_volume:previous-field-unsupported:[MethodModel:Supported:mountEnclosingVolume:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountMountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:mountEnclosingVolume:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountMountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:mount_enclosing_volume_finish:previous-field-unsupported:[MethodModel:Supported:mountEnclosingVolumeFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:mountEnclosingVolumeFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:monitor_dir:previous-field-unsupported:[MethodModel:Supported:monitorDir:[ParameterModel:Supported:{Gg:FileMonitor:{c:GFileMonitor*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileMonitorFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:monitorDir:[ParameterModel:Supported:{Gg:FileMonitor:{c:GFileMonitor*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileMonitorFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:monitor_file:previous-field-unsupported:[MethodModel:Supported:monitorFile:[ParameterModel:Supported:{Gg:FileMonitor:{c:GFileMonitor*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileMonitorFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:monitorFile:[ParameterModel:Supported:{Gg:FileMonitor:{c:GFileMonitor*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileMonitorFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:open_readwrite:previous-field-unsupported:[MethodModel:Supported:openReadwrite:[ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:openReadwrite:[ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:open_readwrite_async:previous-field-unsupported:[MethodModel:Supported:openReadwriteAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:openReadwriteAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:open_readwrite_finish:previous-field-unsupported:[MethodModel:Supported:openReadwriteFinish:[ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:openReadwriteFinish:[ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:create_readwrite:previous-field-unsupported:[MethodModel:Supported:createReadwrite:[ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:createReadwrite:[ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:create_readwrite_async:previous-field-unsupported:[MethodModel:Supported:createReadwriteAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:createReadwriteAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:create_readwrite_finish:previous-field-unsupported:[MethodModel:Supported:createReadwriteFinish:[ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:createReadwriteFinish:[ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:replace_readwrite:previous-field-unsupported:[MethodModel:Supported:replaceReadwrite:[ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]]

[MethodModel:Supported:replaceReadwrite:[ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]

[FieldModel:replace_readwrite_async:previous-field-unsupported:[MethodModel:Supported:replaceReadwriteAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:replaceReadwriteAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:GFileCreateFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:replace_readwrite_finish:previous-field-unsupported:[MethodModel:Supported:replaceReadwriteFinish:[ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:replaceReadwriteFinish:[ParameterModel:Supported:{Gg:FileIOStream:{c:GFileIOStream*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:start_mountable:previous-field-unsupported:[MethodModel:Supported:startMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GDriveStartFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:startMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GDriveStartFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:start_mountable_finish:previous-field-unsupported:[MethodModel:Supported:startMountableFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:startMountableFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:stop_mountable:previous-field-unsupported:[MethodModel:Supported:stopMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:stopMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:stop_mountable_finish:previous-field-unsupported:[MethodModel:Supported:stopMountableFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:stopMountableFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:supports_thread_contexts:previous-field-unsupported:{G_::{c:gboolean}}:{j:boolean}]

[FieldModel:unmount_mountable_with_operation:previous-field-unsupported:[MethodModel:Supported:unmountMountableWithOperation:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:unmountMountableWithOperation:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:unmount_mountable_with_operation_finish:previous-field-unsupported:[MethodModel:Supported:unmountMountableWithOperationFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:unmountMountableWithOperationFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:eject_mountable_with_operation:previous-field-unsupported:[MethodModel:Supported:ejectMountableWithOperation:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:ejectMountableWithOperation:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GMountUnmountFlags}}:{j:int}]
        [ParameterModel:Supported:{Gg:MountOperation:{c:GMountOperation*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:eject_mountable_with_operation_finish:previous-field-unsupported:[MethodModel:Supported:ejectMountableWithOperationFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:ejectMountableWithOperationFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:poll_mountable:previous-field-unsupported:[MethodModel:Supported:pollMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:pollMountable:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:poll_mountable_finish:previous-field-unsupported:[MethodModel:Supported:pollMountableFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]]

[MethodModel:Supported:pollMountableFinish:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]

[FieldModel:measure_disk_usage:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:measure_disk_usage_async:previous-field-unsupported:[MethodModel:Supported:measureDiskUsageAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileMeasureFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:FileMeasureProgressCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:guint64}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint64}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint64}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]

[MethodModel:Supported:measureDiskUsageAsync:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:File:{c:GFile*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GFileMeasureFlags}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:gint}}:{j:int}]
        [ParameterModel:Supported:{Gg:Cancellable:{c:GCancellable*}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:FileMeasureProgressCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
        [ParameterModel:Supported:{G_::{c:guint64}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint64}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint64}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:[MethodModel:Supported:AsyncReadyCallback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Object:{c:GObject*}}:{j:long}]
        [ParameterModel:Supported:{Gg:AsyncResult:{c:GAsyncResult*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:measure_disk_usage_finish:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]
*/
