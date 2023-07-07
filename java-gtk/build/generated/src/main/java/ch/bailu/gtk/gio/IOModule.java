/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Provides an interface and default functions for loading and unloading
 * <br>modules. This is used internally to make GIO extensible, but can also
 * <br>be used by others to implement module loading.
 * <p><a href="https://docs.gtk.org/gio/class.IOModule.html">https://docs.gtk.org/gio/class.IOModule.html</a></p>
*/
public class IOModule extends ch.bailu.gtk.gobject.TypeModule {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IOModule.class.getCanonicalName());
    }

    public IOModule(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new GIOModule that will load the specific
     * <br>shared library when in use.
     * @param filename filename of the shared library module.
    */
    public IOModule(@Nonnull ch.bailu.gtk.type.Str filename) {
        super(cast(JnaIOModule.INST().g_io_module_new(asCPointerNotNull(filename))));
    }

    /**
     * Creates a new GIOModule that will load the specific
     * <br>shared library when in use.
     * @param filename filename of the shared library module.
    */
    public IOModule(String filename) {
        super(cast(JnaIOModule.INST().g_io_module_new(filename)));
    }

    /**
     * Required API for GIO modules to implement.
     * <br>
     * <br>This function is run after the module has been loaded into GIO,
     * <br>to initialize the module. Typically, this function will call
     * <br>g_io_extension_point_implement().
     * <br>
     * <br>Since 2.56, this function should be named `g_io_&lt;modulename&gt;_load`, where
     * <br>`modulename` is the plugin’s filename with the `lib` or `libgio` prefix and
     * <br>everything after the first dot removed, and with `-` replaced with `_`
     * <br>throughout. For example, `libgiognutls-helper.so` becomes `gnutls_helper`.
     * <br>Using the new symbol names avoids name clashes when building modules
     * <br>statically. The old symbol names continue to be supported, but cannot be used
     * <br>for static builds.
    */
    public void load()  {
        JnaIOModule.INST().g_io_module_load(asCPointer());
    }

    /**
     * Required API for GIO modules to implement.
     * <br>
     * <br>This function is run when the module is being unloaded from GIO,
     * <br>to finalize the module.
     * <br>
     * <br>Since 2.56, this function should be named `g_io_&lt;modulename&gt;_unload`, where
     * <br>`modulename` is the plugin’s filename with the `lib` or `libgio` prefix and
     * <br>everything after the first dot removed, and with `-` replaced with `_`
     * <br>throughout. For example, `libgiognutls-helper.so` becomes `gnutls_helper`.
     * <br>Using the new symbol names avoids name clashes when building modules
     * <br>statically. The old symbol names continue to be supported, but cannot be used
     * <br>for static builds.
    */
    public void unload()  {
        JnaIOModule.INST().g_io_module_unload(asCPointer());
    }

    /**
     * Optional API for GIO modules to implement.
     * <br>
     * <br>Should return a list of all the extension points that may be
     * <br>implemented in this module.
     * <br>
     * <br>This method will not be called in normal use, however it may be
     * <br>called when probing existing modules and recording which extension
     * <br>points that this model is used for. This means we won't have to
     * <br>load and initialize this module unless its needed.
     * <br>
     * <br>If this function is not implemented by the module the module will
     * <br>always be loaded, initialized and then unloaded on application
     * <br>startup so that it can register its extension points during init.
     * <br>
     * <br>Note that a module need not actually implement all the extension
     * <br>points that g_io_module_query() returns, since the exact list of
     * <br>extension may depend on runtime issues. However all extension
     * <br>points actually implemented must be returned by g_io_module_query()
     * <br>(if defined).
     * <br>
     * <br>When installing a module that implements g_io_module_query() you must
     * <br>run gio-querymodules in order to build the cache files required for
     * <br>lazy loading.
     * <br>
     * <br>Since 2.56, this function should be named `g_io_&lt;modulename&gt;_query`, where
     * <br>`modulename` is the plugin’s filename with the `lib` or `libgio` prefix and
     * <br>everything after the first dot removed, and with `-` replaced with `_`
     * <br>throughout. For example, `libgiognutls-helper.so` becomes `gnutls_helper`.
     * <br>Using the new symbol names avoids name clashes when building modules
     * <br>statically. The old symbol names continue to be supported, but cannot be used
     * <br>for static builds.
     * @return A %NULL-terminated array of strings,     listing the supported extension points of the module. The array     must be suitable for freeing with g_strfreev().
    */
    public static ch.bailu.gtk.type.Strs query()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaIOModule.INST().g_io_module_query()));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gobject.TypePlugin}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gobject.TypePlugin}
    */
    public ch.bailu.gtk.gobject.TypePlugin asTypePlugin() {
        return new ch.bailu.gtk.gobject.TypePlugin(cast());
    }

    public static long getTypeID() { 
        return JnaIOModule.INST().g_io_module_get_type(); 
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
