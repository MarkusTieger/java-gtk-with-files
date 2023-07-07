/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Applications and libraries often contain binary or textual data that is
 * <br>really part of the application, rather than user data. For instance
 * <br>&#35;GtkBuilder .ui files, splashscreen images, GMenu markup XML, CSS files,
 * <br>icons, etc. These are often shipped as files in `$datadir/appname`, or
 * <br>manually included as literal strings in the code.
 * <br>
 * <br>The &#35;GResource API and the [glib-compile-resources][glib-compile-resources] program
 * <br>provide a convenient and efficient alternative to this which has some nice properties. You
 * <br>maintain the files as normal files, so its easy to edit them, but during the build the files
 * <br>are combined into a binary bundle that is linked into the executable. This means that loading
 * <br>the resource files are efficient (as they are already in memory, shared with other instances) and
 * <br>simple (no need to check for things like I/O errors or locate the files in the filesystem). It
 * <br>also makes it easier to create relocatable applications.
 * <br>
 * <br>Resource files can also be marked as compressed. Such files will be included in the resource bundle
 * <br>in a compressed form, but will be automatically uncompressed when the resource is used. This
 * <br>is very useful e.g. for larger text files that are parsed once (or rarely) and then thrown away.
 * <br>
 * <br>Resource files can also be marked to be preprocessed, by setting the value of the
 * <br>`preprocess` attribute to a comma-separated list of preprocessing options.
 * <br>The only options currently supported are:
 * <br>
 * <br>`xml-stripblanks` which will use the xmllint command
 * <br>to strip ignorable whitespace from the XML file. For this to work,
 * <br>the `XMLLINT` environment variable must be set to the full path to
 * <br>the xmllint executable, or xmllint must be in the `PATH`; otherwise
 * <br>the preprocessing step is skipped.
 * <br>
 * <br>`to-pixdata` (deprecated since gdk-pixbuf 2.32) which will use the
 * <br>`gdk-pixbuf-pixdata` command to convert images to the &#35;GdkPixdata format,
 * <br>which allows you to create pixbufs directly using the data inside the
 * <br>resource file, rather than an (uncompressed) copy of it. For this, the
 * <br>`gdk-pixbuf-pixdata` program must be in the `PATH`, or the
 * <br>`GDK_PIXBUF_PIXDATA` environment variable must be set to the full path to the
 * <br>`gdk-pixbuf-pixdata` executable; otherwise the resource compiler will abort.
 * <br>`to-pixdata` has been deprecated since gdk-pixbuf 2.32, as &#35;GResource
 * <br>supports embedding modern image formats just as well. Instead of using it,
 * <br>embed a PNG or SVG file in your &#35;GResource.
 * <br>
 * <br>`json-stripblanks` which will use the `json-glib-format` command to strip
 * <br>ignorable whitespace from the JSON file. For this to work, the
 * <br>`JSON_GLIB_FORMAT` environment variable must be set to the full path to the
 * <br>`json-glib-format` executable, or it must be in the `PATH`;
 * <br>otherwise the preprocessing step is skipped. In addition, at least version
 * <br>1.6 of `json-glib-format` is required.
 * <br>
 * <br>Resource files will be exported in the GResource namespace using the
 * <br>combination of the given `prefix` and the filename from the `file` element.
 * <br>The `alias` attribute can be used to alter the filename to expose them at a
 * <br>different location in the resource namespace. Typically, this is used to
 * <br>include files from a different source directory without exposing the source
 * <br>directory in the resource namespace, as in the example below.
 * <br>
 * <br>Resource bundles are created by the [glib-compile-resources][glib-compile-resources] program
 * <br>which takes an XML file that describes the bundle, and a set of files that the XML references. These
 * <br>are combined into a binary resource bundle.
 * <br>
 * <br>An example resource description:
 * <pre>
 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;
 * &lt;gresources&gt;
 *   &lt;gresource prefix=&quot;/org/gtk/Example&quot;&gt;
 *     &lt;file&gt;data/splashscreen.png&lt;/file&gt;
 *     &lt;file compressed=&quot;true&quot;&gt;dialog.ui&lt;/file&gt;
 *     &lt;file preprocess=&quot;xml-stripblanks&quot;&gt;menumarkup.xml&lt;/file&gt;
 *     &lt;file alias=&quot;example.css&quot;&gt;data/example.css&lt;/file&gt;
 *   &lt;/gresource&gt;
 * &lt;/gresources&gt;
 * </pre>
 * <br>
 * <br>This will create a resource bundle with the following files:
 * <pre>
 * /org/gtk/Example/data/splashscreen.png
 * /org/gtk/Example/dialog.ui
 * /org/gtk/Example/menumarkup.xml
 * /org/gtk/Example/example.css
 * </pre>
 * <br>
 * <br>Note that all resources in the process share the same namespace, so use Java-style
 * <br>path prefixes (like in the above example) to avoid conflicts.
 * <br>
 * <br>You can then use [glib-compile-resources][glib-compile-resources] to compile the XML to a
 * <br>binary bundle that you can load with g_resource_load(). However, its more common to use the --generate-source and
 * <br>--generate-header arguments to create a source file and header to link directly into your application.
 * <br>This will generate `get_resource()`, `register_resource()` and
 * <br>`unregister_resource()` functions, prefixed by the `--c-name` argument passed
 * <br>to [glib-compile-resources][glib-compile-resources]. `get_resource()` returns
 * <br>the generated &#35;GResource object. The register and unregister functions
 * <br>register the resource so its files can be accessed using
 * <br>g_resources_lookup_data().
 * <br>
 * <br>Once a &#35;GResource has been created and registered all the data in it can be accessed globally in the process by
 * <br>using API calls like g_resources_open_stream() to stream the data or g_resources_lookup_data() to get a direct pointer
 * <br>to the data. You can also use URIs like &quot;resource:///org/gtk/Example/data/splashscreen.png&quot; with &#35;GFile to access
 * <br>the resource data.
 * <br>
 * <br>Some higher-level APIs, such as &#35;GtkApplication, will automatically load
 * <br>resources from certain well-known paths in the resource namespace as a
 * <br>convenience. See the documentation for those APIs for details.
 * <br>
 * <br>There are two forms of the generated source, the default version uses the compiler support for constructor
 * <br>and destructor functions (where available) to automatically create and register the &#35;GResource on startup
 * <br>or library load time. If you pass `--manual-register`, two functions to register/unregister the resource are created
 * <br>instead. This requires an explicit initialization call in your application/library, but it works on all platforms,
 * <br>even on the minor ones where constructors are not supported. (Constructor support is available for at least Win32, Mac OS and Linux.)
 * <br>
 * <br>Note that resource data can point directly into the data segment of e.g. a library, so if you are unloading libraries
 * <br>during runtime you need to be very careful with keeping around pointers to data from a resource, as this goes away
 * <br>when the library is unloaded. However, in practice this is not generally a problem, since most resource accesses
 * <br>are for your own resources, and resource data is often used once, during parsing, and then released.
 * <br>
 * <br>When debugging a program or testing a change to an installed version, it is often useful to be able to
 * <br>replace resources in the program or library, without recompiling, for debugging or quick hacking and testing
 * <br>purposes. Since GLib 2.50, it is possible to use the `G_RESOURCE_OVERLAYS` environment variable to selectively overlay
 * <br>resources with replacements from the filesystem.  It is a %G_SEARCHPATH_SEPARATOR-separated list of substitutions to perform
 * <br>during resource lookups. It is ignored when running in a setuid process.
 * <br>
 * <br>A substitution has the form
 * <br>
 * <pre>
 *    /org/gtk/libgtk=/home/desrt/gtk-overlay
 * </pre>
 * <br>
 * <br>The part before the `=` is the resource subpath for which the overlay applies.  The part after is a
 * <br>filesystem path which contains files and subdirectories as you would like to be loaded as resources with the
 * <br>equivalent names.
 * <br>
 * <br>In the example above, if an application tried to load a resource with the resource path
 * <br>`/org/gtk/libgtk/ui/gtkdialog.ui` then GResource would check the filesystem path
 * <br>`/home/desrt/gtk-overlay/ui/gtkdialog.ui`.  If a file was found there, it would be used instead.  This is an
 * <br>overlay, not an outright replacement, which means that if a file is not found at that path, the built-in
 * <br>version will be used instead.  Whiteouts are not currently supported.
 * <br>
 * <br>Substitutions must start with a slash, and must not contain a trailing slash before the '='.  The path after
 * <br>the slash should ideally be absolute, but this is not strictly required.  It is possible to overlay the
 * <br>location of a single resource with an individual file.
 * <p><a href="https://docs.gtk.org/gio/struct.Resource.html">https://docs.gtk.org/gio/struct.Resource.html</a></p>
*/
public class Resource extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Resource.class.getCanonicalName());
    }

    public Resource(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a GResource from a reference to the binary resource bundle.
     * <br>This will keep a reference to &#64;data while the resource lives, so
     * <br>the data should not be modified or freed.
     * <br>
     * <br>If you want to use this resource in the global resource namespace you need
     * <br>to register it with g_resources_register().
     * <br>
     * <br>Note: &#64;data must be backed by memory that is at least pointer aligned.
     * <br>Otherwise this function will internally create a copy of the memory since
     * <br>GLib 2.56, or in older versions fail and exit the process.
     * <br>
     * <br>If &#64;data is empty or corrupt, %G_RESOURCE_ERROR_INTERNAL will be returned.
     * @param data A &#35;GBytes
     * @return a new &#35;GResource, or %NULL on error
    */
    public static Resource newFromDataResource(@Nonnull ch.bailu.gtk.glib.Bytes data) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaResource.INST().g_resource_new_from_data(asCPointerNotNull(data), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("Resource:newFromData");
        }
        return new Resource(__self);
    }        
    

    /**
     * Registers the resource with the process-global set of resources.
     * <br>Once a resource is registered the files in it can be accessed
     * <br>with the global resource lookup functions like g_resources_lookup_data().
    */
    public void register()  {
        JnaResource.INST().g_resources_register(asCPointer());
    }

    /**
     * Unregisters the resource from the process-global set of resources.
    */
    public void unregister()  {
        JnaResource.INST().g_resources_unregister(asCPointer());
    }

    /**
     * Returns all the names of children at the specified &#64;path in the resource.
     * <br>The return result is a %NULL terminated list of strings which should
     * <br>be released with g_strfreev().
     * <br>
     * <br>If &#64;path is invalid or does not exist in the &#35;GResource,
     * <br>%G_RESOURCE_ERROR_NOT_FOUND will be returned.
     * <br>
     * <br>&#64;lookup_flags controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookup_flags A &#35;GResourceLookupFlags
     * @return an array of constant strings
    */
    public ch.bailu.gtk.type.Strs enumerateChildren(@Nonnull ch.bailu.gtk.type.Str path, int lookup_flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaResource.INST().g_resource_enumerate_children(asCPointer(), asCPointerNotNull(path), lookup_flags, 0L)));
    }

    /**
     * Returns all the names of children at the specified &#64;path in the resource.
     * <br>The return result is a %NULL terminated list of strings which should
     * <br>be released with g_strfreev().
     * <br>
     * <br>If &#64;path is invalid or does not exist in the &#35;GResource,
     * <br>%G_RESOURCE_ERROR_NOT_FOUND will be returned.
     * <br>
     * <br>&#64;lookup_flags controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookup_flags A &#35;GResourceLookupFlags
     * @return an array of constant strings
    */
    public ch.bailu.gtk.type.Strs enumerateChildren(String path, int lookup_flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaResource.INST().g_resource_enumerate_children(asCPointer(), path, lookup_flags, 0L)));
    }

    /**
     * Looks for a file at the specified &#64;path in the resource and
     * <br>if found returns information about it.
     * <br>
     * <br>&#64;lookup_flags controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookup_flags A &#35;GResourceLookupFlags
     * @param size a location to place the length of the contents of the file,    or %NULL if the length is not needed
     * @param flags a location to place the flags about the file,    or %NULL if the length is not needed
     * @return %TRUE if the file was found. %FALSE if there were errors
    */
    public boolean getInfo(@Nonnull ch.bailu.gtk.type.Str path, int lookup_flags, @Nullable ch.bailu.gtk.type.Int64 size, @Nullable ch.bailu.gtk.type.Int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaResource.INST().g_resource_get_info(asCPointer(), asCPointerNotNull(path), lookup_flags, asCPointer(size), asCPointer(flags), 0L);
    }

    /**
     * Looks for a file at the specified &#64;path in the resource and
     * <br>if found returns information about it.
     * <br>
     * <br>&#64;lookup_flags controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookup_flags A &#35;GResourceLookupFlags
     * @param size a location to place the length of the contents of the file,    or %NULL if the length is not needed
     * @param flags a location to place the flags about the file,    or %NULL if the length is not needed
     * @return %TRUE if the file was found. %FALSE if there were errors
    */
    public boolean getInfo(String path, int lookup_flags, @Nullable ch.bailu.gtk.type.Int64 size, @Nullable ch.bailu.gtk.type.Int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaResource.INST().g_resource_get_info(asCPointer(), path, lookup_flags, asCPointer(size), asCPointer(flags), 0L);
    }

    /**
     * Looks for a file at the specified &#64;path in the resource and
     * <br>returns a &#35;GBytes that lets you directly access the data in
     * <br>memory.
     * <br>
     * <br>The data is always followed by a zero byte, so you
     * <br>can safely use the data as a C string. However, that byte
     * <br>is not included in the size of the GBytes.
     * <br>
     * <br>For uncompressed resource files this is a pointer directly into
     * <br>the resource bundle, which is typically in some readonly data section
     * <br>in the program binary. For compressed files we allocate memory on
     * <br>the heap and automatically uncompress the data.
     * <br>
     * <br>&#64;lookup_flags controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookup_flags A &#35;GResourceLookupFlags
     * @return &#35;GBytes or %NULL on error.     Free the returned object with g_bytes_unref()
    */
    public ch.bailu.gtk.glib.Bytes lookupData(@Nonnull ch.bailu.gtk.type.Str path, int lookup_flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaResource.INST().g_resource_lookup_data(asCPointer(), asCPointerNotNull(path), lookup_flags, 0L)));
    }

    /**
     * Looks for a file at the specified &#64;path in the resource and
     * <br>returns a &#35;GBytes that lets you directly access the data in
     * <br>memory.
     * <br>
     * <br>The data is always followed by a zero byte, so you
     * <br>can safely use the data as a C string. However, that byte
     * <br>is not included in the size of the GBytes.
     * <br>
     * <br>For uncompressed resource files this is a pointer directly into
     * <br>the resource bundle, which is typically in some readonly data section
     * <br>in the program binary. For compressed files we allocate memory on
     * <br>the heap and automatically uncompress the data.
     * <br>
     * <br>&#64;lookup_flags controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookup_flags A &#35;GResourceLookupFlags
     * @return &#35;GBytes or %NULL on error.     Free the returned object with g_bytes_unref()
    */
    public ch.bailu.gtk.glib.Bytes lookupData(String path, int lookup_flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaResource.INST().g_resource_lookup_data(asCPointer(), path, lookup_flags, 0L)));
    }

    /**
     * Looks for a file at the specified &#64;path in the resource and
     * <br>returns a &#35;GInputStream that lets you read the data.
     * <br>
     * <br>&#64;lookup_flags controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookup_flags A &#35;GResourceLookupFlags
     * @return &#35;GInputStream or %NULL on error.     Free the returned object with g_object_unref()
    */
    public InputStream openStream(@Nonnull ch.bailu.gtk.type.Str path, int lookup_flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new InputStream(new PointerContainer(JnaResource.INST().g_resource_open_stream(asCPointer(), asCPointerNotNull(path), lookup_flags, 0L)));
    }

    /**
     * Looks for a file at the specified &#64;path in the resource and
     * <br>returns a &#35;GInputStream that lets you read the data.
     * <br>
     * <br>&#64;lookup_flags controls the behaviour of the lookup.
     * @param path A pathname inside the resource
     * @param lookup_flags A &#35;GResourceLookupFlags
     * @return &#35;GInputStream or %NULL on error.     Free the returned object with g_object_unref()
    */
    public InputStream openStream(String path, int lookup_flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return new InputStream(new PointerContainer(JnaResource.INST().g_resource_open_stream(asCPointer(), path, lookup_flags, 0L)));
    }

    /**
     * Atomically increments the reference count of &#64;resource by one. This
     * <br>function is MT-safe and may be called from any thread.
     * @return The passed in &#35;GResource
    */
    public Resource ref()  {
        return new Resource(new PointerContainer(JnaResource.INST().g_resource_ref(asCPointer())));
    }

    /**
     * Atomically decrements the reference count of &#64;resource by one. If the
     * <br>reference count drops to 0, all memory allocated by the resource is
     * <br>released. This function is MT-safe and may be called from any
     * <br>thread.
    */
    public void unref()  {
        JnaResource.INST().g_resource_unref(asCPointer());
    }

    /**
     * Loads a binary resource bundle and creates a &#35;GResource representation of it, allowing
     * <br>you to query it for data.
     * <br>
     * <br>If you want to use this resource in the global resource namespace you need
     * <br>to register it with g_resources_register().
     * <br>
     * <br>If &#64;filename is empty or the data in it is corrupt,
     * <br>%G_RESOURCE_ERROR_INTERNAL will be returned. If &#64;filename doesn’t exist, or
     * <br>there is an error in reading it, an error from g_mapped_file_new() will be
     * <br>returned.
     * @param filename the path of a filename to load, in the GLib filename encoding
     * @return a new &#35;GResource, or %NULL on error
    */
    public static Resource load(@Nonnull ch.bailu.gtk.type.Str filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return new Resource(new PointerContainer(JnaResource.INST().g_resource_load(asCPointerNotNull(filename), 0L)));
    }

    public static long getTypeID() { 
        return JnaResource.INST().g_resource_get_type(); 
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
*/
