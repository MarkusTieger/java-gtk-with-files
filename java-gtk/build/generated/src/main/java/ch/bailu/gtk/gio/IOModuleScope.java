/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Represents a scope for loading IO modules. A scope can be used for blocking
 * <br>duplicate modules, or blocking a module you don't want to load.
 * <br>
 * <br>The scope can be used with g_io_modules_load_all_in_directory_with_scope()
 * <br>or g_io_modules_scan_all_in_directory_with_scope().
 * <p><a href="https://docs.gtk.org/gio/struct.IOModuleScope.html">https://docs.gtk.org/gio/struct.IOModuleScope.html</a></p>
*/
class IOModuleScope extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IOModuleScope.class.getCanonicalName());
    }

    public IOModuleScope(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Block modules with the given &#64;basename from being loaded when
     * <br>this scope is used with g_io_modules_scan_all_in_directory_with_scope()
     * <br>or g_io_modules_load_all_in_directory_with_scope().
     * @param basename the basename to block
    */
    public void block(@Nonnull ch.bailu.gtk.type.Str basename)  {
        JnaIOModuleScope.INST().g_io_module_scope_block(asCPointer(), asCPointerNotNull(basename));
    }

    /**
     * Block modules with the given &#64;basename from being loaded when
     * <br>this scope is used with g_io_modules_scan_all_in_directory_with_scope()
     * <br>or g_io_modules_load_all_in_directory_with_scope().
     * @param basename the basename to block
    */
    public void block(String basename)  {
        JnaIOModuleScope.INST().g_io_module_scope_block(asCPointer(), basename);
    }

    /**
     * Free a module scope.
    */
    public void free()  {
        JnaIOModuleScope.INST().g_io_module_scope_free(asCPointer());
    }

    /**
     * Create a new scope for loading of IO modules. A scope can be used for
     * <br>blocking duplicate modules, or blocking a module you don't want to load.
     * <br>
     * <br>Specify the %G_IO_MODULE_SCOPE_BLOCK_DUPLICATES flag to block modules
     * <br>which have the same base name as a module that has already been seen
     * <br>in this scope.
     * @param flags flags for the new scope
     * @return the new module scope
    */
    public static IOModuleScope _new(int flags)  {
        return new IOModuleScope(new PointerContainer(JnaIOModuleScope.INST().g_io_module_scope_new(flags)));
    }

}

/*
record-type
flag-disguised
all-fields-supported
*/
