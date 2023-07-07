/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque structure representing an opened directory.
 * <p><a href="https://docs.gtk.org/glib/struct.Dir.html">https://docs.gtk.org/glib/struct.Dir.html</a></p>
*/
class Dir extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Dir.class.getCanonicalName());
    }

    public Dir(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Closes the directory and deallocates all related resources.
    */
    public void close()  {
        JnaDir.INST().g_dir_close(asCPointer());
    }

    /**
     * Retrieves the name of another entry in the directory, or %NULL.
     * <br>The order of entries returned from this function is not defined,
     * <br>and may vary by file system or other operating-system dependent
     * <br>factors.
     * <br>
     * <br>%NULL may also be returned in case of errors. On Unix, you can
     * <br>check `errno` to find out if %NULL was returned because of an error.
     * <br>
     * <br>On Unix, the '.' and '..' entries are omitted, and the returned
     * <br>name is in the on-disk encoding.
     * <br>
     * <br>On Windows, as is true of all GLib functions which operate on
     * <br>filenames, the returned name is in UTF-8.
     * @return The entry's name or %NULL if there are no   more entries. The return value is owned by GLib and   must not be modified or freed.
    */
    public ch.bailu.gtk.type.Str readName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDir.INST().g_dir_read_name(asCPointer())));
    }

    /**
     * Resets the given directory. The next call to g_dir_read_name()
     * <br>will return the first entry again.
    */
    public void rewind()  {
        JnaDir.INST().g_dir_rewind(asCPointer());
    }

    /**
     * Creates a subdirectory in the preferred directory for temporary
     * <br>files (as returned by g_get_tmp_dir()).
     * <br>
     * <br>&#64;tmpl should be a string in the GLib file name encoding containing
     * <br>a sequence of six 'X' characters, as the parameter to g_mkstemp().
     * <br>However, unlike these functions, the template should only be a
     * <br>basename, no directory components are allowed. If template is
     * <br>%NULL, a default template is used.
     * <br>
     * <br>Note that in contrast to g_mkdtemp() (and mkdtemp()) &#64;tmpl is not
     * <br>modified, and might thus be a read-only literal string.
     * @param tmpl Template for directory name,     as in g_mkdtemp(), basename only, or %NULL for a default template
     * @return The actual name used. This string     should be freed with g_free() when not needed any longer and is     is in the GLib file name encoding. In case of errors, %NULL is     returned and &#64;error will be set.
    */
    public static ch.bailu.gtk.type.Str makeTmp(@Nullable ch.bailu.gtk.type.Str tmpl) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaDir.INST().g_dir_make_tmp(asCPointer(tmpl), 0L)));
    }

    /**
     * Opens a directory for reading. The names of the files in the
     * <br>directory can then be retrieved using g_dir_read_name().  Note
     * <br>that the ordering is not defined.
     * @param path the path to the directory you are interested in. On Unix         in the on-disk encoding. On Windows in UTF-8
     * @param flags Currently must be set to 0. Reserved for future use.
     * @return a newly allocated &#35;GDir on success, %NULL on failure.   If non-%NULL, you must free the result with g_dir_close()   when you are finished with it.
    */
    public static Dir open(@Nonnull ch.bailu.gtk.type.Str path, int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Dir(new PointerContainer(JnaDir.INST().g_dir_open(asCPointerNotNull(path), flags, 0L)));
    }

}

/*
record-type
flag-disguised
all-fields-supported
*/
