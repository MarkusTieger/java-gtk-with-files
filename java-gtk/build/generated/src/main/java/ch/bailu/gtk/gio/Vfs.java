/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Entry point for using GIO functionality.
 * <p><a href="https://docs.gtk.org/gio/class.Vfs.html">https://docs.gtk.org/gio/class.Vfs.html</a></p>
*/
public class Vfs extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Vfs.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnVfsFileLookupFunc {
        /**
         * This function type is used by g_vfs_register_uri_scheme() to make it
         * <br>possible for a client to associate an URI scheme to a different &#35;GFile
         * <br>implementation.
         * <br>
         * <br>The client should return a reference to the new file that has been
         * <br>created for &#64;uri, or %NULL to continue with the default implementation.
         * @param vfs a &#35;GVfs
         * @param identifier the identifier to look up a &#35;GFile for. This can either     be an URI or a parse name as returned by g_file_get_parse_name()
         * @param user_data user data passed to the function
         * @return a &#35;GFile for &#64;identifier.
        */
        File onVfsFileLookupFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Vfs vfs, @Nonnull ch.bailu.gtk.type.Str identifier, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaVfs.OnVfsFileLookupFunc toOnVfsFileLookupFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnVfsFileLookupFunc in) {
        JnaVfs.OnVfsFileLookupFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_vfs, _identifier, _user_data) -> in.onVfsFileLookupFunc(__callback, new Vfs(new PointerContainer(_vfs)), new ch.bailu.gtk.type.Str(new PointerContainer(_identifier)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaVfs.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaVfs.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public Vfs(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets a &#35;GFile for &#64;path.
     * @param path a string containing a VFS path.
     * @return a &#35;GFile.     Free the returned object with g_object_unref().
    */
    public File getFileForPath(@Nonnull ch.bailu.gtk.type.Str path)  {
        return new File(new PointerContainer(JnaVfs.INST().g_vfs_get_file_for_path(asCPointer(), asCPointerNotNull(path))));
    }

    /**
     * Gets a &#35;GFile for &#64;path.
     * @param path a string containing a VFS path.
     * @return a &#35;GFile.     Free the returned object with g_object_unref().
    */
    public File getFileForPath(String path)  {
        return new File(new PointerContainer(JnaVfs.INST().g_vfs_get_file_for_path(asCPointer(), path)));
    }

    /**
     * Gets a &#35;GFile for &#64;uri.
     * <br>
     * <br>This operation never fails, but the returned object
     * <br>might not support any I/O operation if the URI
     * <br>is malformed or if the URI scheme is not supported.
     * @param uri a string containing a URI
     * @return a &#35;GFile.     Free the returned object with g_object_unref().
    */
    public File getFileForUri(@Nonnull ch.bailu.gtk.type.Str uri)  {
        return new File(new PointerContainer(JnaVfs.INST().g_vfs_get_file_for_uri(asCPointer(), asCPointerNotNull(uri))));
    }

    /**
     * Gets a &#35;GFile for &#64;uri.
     * <br>
     * <br>This operation never fails, but the returned object
     * <br>might not support any I/O operation if the URI
     * <br>is malformed or if the URI scheme is not supported.
     * @param uri a string containing a URI
     * @return a &#35;GFile.     Free the returned object with g_object_unref().
    */
    public File getFileForUri(String uri)  {
        return new File(new PointerContainer(JnaVfs.INST().g_vfs_get_file_for_uri(asCPointer(), uri)));
    }

    /**
     * Checks if the VFS is active.
     * @return %TRUE if construction of the &#64;vfs was successful     and it is now active.
    */
    public boolean isActive()  {
        return JnaVfs.INST().g_vfs_is_active(asCPointer());
    }

    /**
     * This operation never fails, but the returned object might
     * <br>not support any I/O operations if the &#64;parse_name cannot
     * <br>be parsed by the &#35;GVfs module.
     * @param parse_name a string to be parsed by the VFS module.
     * @return a &#35;GFile for the given &#64;parse_name.     Free the returned object with g_object_unref().
    */
    public File parseName(@Nonnull ch.bailu.gtk.type.Str parse_name)  {
        return new File(new PointerContainer(JnaVfs.INST().g_vfs_parse_name(asCPointer(), asCPointerNotNull(parse_name))));
    }

    /**
     * This operation never fails, but the returned object might
     * <br>not support any I/O operations if the &#64;parse_name cannot
     * <br>be parsed by the &#35;GVfs module.
     * @param parse_name a string to be parsed by the VFS module.
     * @return a &#35;GFile for the given &#64;parse_name.     Free the returned object with g_object_unref().
    */
    public File parseName(String parse_name)  {
        return new File(new PointerContainer(JnaVfs.INST().g_vfs_parse_name(asCPointer(), parse_name)));
    }

    /**
     * Registers &#64;uri_func and &#64;parse_name_func as the &#35;GFile URI and parse name
     * <br>lookup functions for URIs with a scheme matching &#64;scheme.
     * <br>Note that &#64;scheme is registered only within the running application, as
     * <br>opposed to desktop-wide as it happens with GVfs backends.
     * <br>
     * <br>When a &#35;GFile is requested with an URI containing &#64;scheme (e.g. through
     * <br>g_file_new_for_uri()), &#64;uri_func will be called to allow a custom
     * <br>constructor. The implementation of &#64;uri_func should not be blocking, and
     * <br>must not call g_vfs_register_uri_scheme() or g_vfs_unregister_uri_scheme().
     * <br>
     * <br>When g_file_parse_name() is called with a parse name obtained from such file,
     * <br>&#64;parse_name_func will be called to allow the &#35;GFile to be created again. In
     * <br>that case, it's responsibility of &#64;parse_name_func to make sure the parse
     * <br>name matches what the custom &#35;GFile implementation returned when
     * <br>g_file_get_parse_name() was previously called. The implementation of
     * <br>&#64;parse_name_func should not be blocking, and must not call
     * <br>g_vfs_register_uri_scheme() or g_vfs_unregister_uri_scheme().
     * <br>
     * <br>It's an error to call this function twice with the same scheme. To unregister
     * <br>a custom URI scheme, use g_vfs_unregister_uri_scheme().
     * @param scheme an URI scheme, e.g. &quot;http&quot;
     * @param uri_func a &#35;GVfsFileLookupFunc
     * @param uri_data custom data passed to be passed to &#64;uri_func, or %NULL
     * @param uri_destroy function to be called when unregistering the     URI scheme, or when &#64;vfs is disposed, to free the resources used     by the URI lookup function
     * @param parse_name_func a &#35;GVfsFileLookupFunc
     * @param parse_name_data custom data passed to be passed to     &#64;parse_name_func, or %NULL
     * @param parse_name_destroy function to be called when unregistering the     URI scheme, or when &#64;vfs is disposed, to free the resources used     by the parse name lookup function
     * @return %TRUE if &#64;scheme was successfully registered, or %FALSE if a handler     for &#64;scheme already exists.
    */
    public boolean registerUriScheme(@Nonnull ch.bailu.gtk.type.Str scheme, OnVfsFileLookupFunc uri_func, @Nullable ch.bailu.gtk.type.Pointer uri_data, OnDestroyNotify uri_destroy, OnVfsFileLookupFunc parse_name_func, @Nullable ch.bailu.gtk.type.Pointer parse_name_data, OnDestroyNotify parse_name_destroy)  {
        return JnaVfs.INST().g_vfs_register_uri_scheme(asCPointer(), asCPointerNotNull(scheme), toOnVfsFileLookupFunc(this, "registerUriScheme", uri_func), asCPointer(uri_data), toOnDestroyNotify(this, "registerUriScheme", uri_destroy), toOnVfsFileLookupFunc(this, "registerUriScheme", parse_name_func), asCPointer(parse_name_data), toOnDestroyNotify(this, "registerUriScheme", parse_name_destroy));
    }

    /**
     * Registers &#64;uri_func and &#64;parse_name_func as the &#35;GFile URI and parse name
     * <br>lookup functions for URIs with a scheme matching &#64;scheme.
     * <br>Note that &#64;scheme is registered only within the running application, as
     * <br>opposed to desktop-wide as it happens with GVfs backends.
     * <br>
     * <br>When a &#35;GFile is requested with an URI containing &#64;scheme (e.g. through
     * <br>g_file_new_for_uri()), &#64;uri_func will be called to allow a custom
     * <br>constructor. The implementation of &#64;uri_func should not be blocking, and
     * <br>must not call g_vfs_register_uri_scheme() or g_vfs_unregister_uri_scheme().
     * <br>
     * <br>When g_file_parse_name() is called with a parse name obtained from such file,
     * <br>&#64;parse_name_func will be called to allow the &#35;GFile to be created again. In
     * <br>that case, it's responsibility of &#64;parse_name_func to make sure the parse
     * <br>name matches what the custom &#35;GFile implementation returned when
     * <br>g_file_get_parse_name() was previously called. The implementation of
     * <br>&#64;parse_name_func should not be blocking, and must not call
     * <br>g_vfs_register_uri_scheme() or g_vfs_unregister_uri_scheme().
     * <br>
     * <br>It's an error to call this function twice with the same scheme. To unregister
     * <br>a custom URI scheme, use g_vfs_unregister_uri_scheme().
     * @param scheme an URI scheme, e.g. &quot;http&quot;
     * @param uri_func a &#35;GVfsFileLookupFunc
     * @param uri_data custom data passed to be passed to &#64;uri_func, or %NULL
     * @param uri_destroy function to be called when unregistering the     URI scheme, or when &#64;vfs is disposed, to free the resources used     by the URI lookup function
     * @param parse_name_func a &#35;GVfsFileLookupFunc
     * @param parse_name_data custom data passed to be passed to     &#64;parse_name_func, or %NULL
     * @param parse_name_destroy function to be called when unregistering the     URI scheme, or when &#64;vfs is disposed, to free the resources used     by the parse name lookup function
     * @return %TRUE if &#64;scheme was successfully registered, or %FALSE if a handler     for &#64;scheme already exists.
    */
    public boolean registerUriScheme(String scheme, OnVfsFileLookupFunc uri_func, @Nullable ch.bailu.gtk.type.Pointer uri_data, OnDestroyNotify uri_destroy, OnVfsFileLookupFunc parse_name_func, @Nullable ch.bailu.gtk.type.Pointer parse_name_data, OnDestroyNotify parse_name_destroy)  {
        return JnaVfs.INST().g_vfs_register_uri_scheme(asCPointer(), scheme, toOnVfsFileLookupFunc(this, "registerUriScheme", uri_func), asCPointer(uri_data), toOnDestroyNotify(this, "registerUriScheme", uri_destroy), toOnVfsFileLookupFunc(this, "registerUriScheme", parse_name_func), asCPointer(parse_name_data), toOnDestroyNotify(this, "registerUriScheme", parse_name_destroy));
    }

    /**
     * Unregisters the URI handler for &#64;scheme previously registered with
     * <br>g_vfs_register_uri_scheme().
     * @param scheme an URI scheme, e.g. &quot;http&quot;
     * @return %TRUE if &#64;scheme was successfully unregistered, or %FALSE if a     handler for &#64;scheme does not exist.
    */
    public boolean unregisterUriScheme(@Nonnull ch.bailu.gtk.type.Str scheme)  {
        return JnaVfs.INST().g_vfs_unregister_uri_scheme(asCPointer(), asCPointerNotNull(scheme));
    }

    /**
     * Unregisters the URI handler for &#64;scheme previously registered with
     * <br>g_vfs_register_uri_scheme().
     * @param scheme an URI scheme, e.g. &quot;http&quot;
     * @return %TRUE if &#64;scheme was successfully unregistered, or %FALSE if a     handler for &#64;scheme does not exist.
    */
    public boolean unregisterUriScheme(String scheme)  {
        return JnaVfs.INST().g_vfs_unregister_uri_scheme(asCPointer(), scheme);
    }

    /**
     * Gets the default &#35;GVfs for the system.
     * @return a &#35;GVfs, which will be the local     file system &#35;GVfs if no other implementation is available.
    */
    public static Vfs getDefault()  {
        return new Vfs(new PointerContainer(JnaVfs.INST().g_vfs_get_default()));
    }

    /**
     * Gets the local &#35;GVfs for the system.
     * @return a &#35;GVfs.
    */
    public static Vfs getLocal()  {
        return new Vfs(new PointerContainer(JnaVfs.INST().g_vfs_get_local()));
    }

    public static long getTypeID() { 
        return JnaVfs.INST().g_vfs_get_type(); 
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

[MethodModel:cb-return-value-not-supported:getSupportedUriSchemes:[ParameterModel:java-type-not-supported:{G_::{c:const gchar* const*}}:{j:}]]
*/
