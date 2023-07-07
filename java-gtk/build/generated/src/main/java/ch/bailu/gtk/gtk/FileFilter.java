/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkFileFilter` filters files by name or mime type.
 * <br>
 * <br>`GtkFileFilter` can be used to restrict the files being shown in a
 * <br>`GtkFileChooser`. Files can be filtered based on their name (with
 * <br>[method&#64;Gtk.FileFilter.add_pattern] or [method&#64;Gtk.FileFilter.add_suffix])
 * <br>or on their mime type (with [method&#64;Gtk.FileFilter.add_mime_type]).
 * <br>
 * <br>Filtering by mime types handles aliasing and subclassing of mime
 * <br>types; e.g. a filter for text/plain also matches a file with mime
 * <br>type application/rtf, since application/rtf is a subclass of
 * <br>text/plain. Note that `GtkFileFilter` allows wildcards for the
 * <br>subtype of a mime type, so you can e.g. filter for image/&#92;*.
 * <br>
 * <br>Normally, file filters are used by adding them to a `GtkFileChooser`
 * <br>(see [method&#64;Gtk.FileChooser.add_filter]), but it is also possible to
 * <br>manually use a file filter on any [class&#64;Gtk.FilterListModel] containing
 * <br>`GFileInfo` objects.
 * <br>
 * <br>&#35; GtkFileFilter as GtkBuildable
 * <br>
 * <br>The `GtkFileFilter` implementation of the `GtkBuildable` interface
 * <br>supports adding rules using the `&lt;mime-types&gt;` and `&lt;patterns&gt;` and
 * <br>`&lt;suffixes&gt;` elements and listing the rules within. Specifying a
 * <br>`&lt;mime-type&gt;` or `&lt;pattern&gt;` or `&lt;suffix&gt;` has the same effect as
 * <br>as calling
 * <br>[method&#64;Gtk.FileFilter.add_mime_type] or
 * <br>[method&#64;Gtk.FileFilter.add_pattern] or
 * <br>[method&#64;Gtk.FileFilter.add_suffix].
 * <br>
 * <br>An example of a UI definition fragment specifying `GtkFileFilter`
 * <br>rules:
 * <br>```xml
 * <br>&lt;object class=&quot;GtkFileFilter&quot;&gt;
 * <br>  &lt;property name=&quot;name&quot; translatable=&quot;yes&quot;&gt;Text and Images&lt;/property&gt;
 * <br>  &lt;mime-types&gt;
 * <br>    &lt;mime-type&gt;text/plain&lt;/mime-type&gt;
 * <br>    &lt;mime-type&gt;image/ *&lt;/mime-type&gt;
 * <br>  &lt;/mime-types&gt;
 * <br>  &lt;patterns&gt;
 * <br>    &lt;pattern&gt;*.txt&lt;/pattern&gt;
 * <br>  &lt;/patterns&gt;
 * <br>  &lt;suffixes&gt;
 * <br>    &lt;suffix&gt;png&lt;/suffix&gt;
 * <br>  &lt;/suffixes&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.FileFilter.html">https://docs.gtk.org/gtk4/class.FileFilter.html</a></p>
*/
public class FileFilter extends Filter {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileFilter.class.getCanonicalName());
    }

    public FileFilter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Deserialize a file filter from a `GVariant`.
     * <br>
     * <br>The variant must be in the format produced by
     * <br>[method&#64;Gtk.FileFilter.to_gvariant].
     * @param variant an `a{sv}` `GVariant`
     * @return a new `GtkFileFilter` object
    */
    public static FileFilter newFromGvariantFileFilter(@Nonnull ch.bailu.gtk.glib.Variant variant)  {
        PointerContainer __self = cast(JnaFileFilter.INST().gtk_file_filter_new_from_gvariant(asCPointerNotNull(variant)));
        if (__self.isNull()) {
            throw new NullPointerException("FileFilter:newFromGvariant");
        }
        return new FileFilter(__self);
    }        
    

    /**
     * Creates a new `GtkFileFilter` with no rules added to it.
     * <br>
     * <br>Such a filter doesn’t accept any files, so is not
     * <br>particularly useful until you add rules with
     * <br>[method&#64;Gtk.FileFilter.add_mime_type],
     * <br>[method&#64;Gtk.FileFilter.add_pattern],
     * <br>[method&#64;Gtk.FileFilter.add_suffix] or
     * <br>[method&#64;Gtk.FileFilter.add_pixbuf_formats].
     * <br>
     * <br>To create a filter that accepts any file, use:
     * <br>```c
     * <br>GtkFileFilter *filter = gtk_file_filter_new ();
     * <br>gtk_file_filter_add_pattern (filter, &quot;*&quot;);
     * <br>```
    */
    public FileFilter() {
        super(cast(JnaFileFilter.INST().gtk_file_filter_new()));
    }

    /**
     * Adds a rule allowing a given mime type to &#64;filter.
     * @param mime_type name of a MIME type
    */
    public void addMimeType(@Nonnull ch.bailu.gtk.type.Str mime_type)  {
        JnaFileFilter.INST().gtk_file_filter_add_mime_type(asCPointer(), asCPointerNotNull(mime_type));
    }

    /**
     * Adds a rule allowing a given mime type to &#64;filter.
     * @param mime_type name of a MIME type
    */
    public void addMimeType(String mime_type)  {
        JnaFileFilter.INST().gtk_file_filter_add_mime_type(asCPointer(), mime_type);
    }

    /**
     * Adds a rule allowing a shell style glob to a filter.
     * <br>
     * <br>Note that it depends on the platform whether pattern
     * <br>matching ignores case or not. On Windows, it does, on
     * <br>other platforms, it doesn't.
     * @param pattern a shell style glob
    */
    public void addPattern(@Nonnull ch.bailu.gtk.type.Str pattern)  {
        JnaFileFilter.INST().gtk_file_filter_add_pattern(asCPointer(), asCPointerNotNull(pattern));
    }

    /**
     * Adds a rule allowing a shell style glob to a filter.
     * <br>
     * <br>Note that it depends on the platform whether pattern
     * <br>matching ignores case or not. On Windows, it does, on
     * <br>other platforms, it doesn't.
     * @param pattern a shell style glob
    */
    public void addPattern(String pattern)  {
        JnaFileFilter.INST().gtk_file_filter_add_pattern(asCPointer(), pattern);
    }

    /**
     * Adds a rule allowing image files in the formats supported
     * <br>by GdkPixbuf.
     * <br>
     * <br>This is equivalent to calling [method&#64;Gtk.FileFilter.add_mime_type]
     * <br>for all the supported mime types.
    */
    public void addPixbufFormats()  {
        JnaFileFilter.INST().gtk_file_filter_add_pixbuf_formats(asCPointer());
    }

    /**
     * Adds a suffix match rule to a filter.
     * <br>
     * <br>This is similar to adding a match for the pattern
     * <br>&quot;*.&#64;suffix&quot;.
     * <br>
     * <br>In contrast to pattern matches, suffix matches
     * <br>are *always* case-insensitive.
     * @param suffix filename suffix to match
    */
    public void addSuffix(@Nonnull ch.bailu.gtk.type.Str suffix)  {
        JnaFileFilter.INST().gtk_file_filter_add_suffix(asCPointer(), asCPointerNotNull(suffix));
    }

    /**
     * Adds a suffix match rule to a filter.
     * <br>
     * <br>This is similar to adding a match for the pattern
     * <br>&quot;*.&#64;suffix&quot;.
     * <br>
     * <br>In contrast to pattern matches, suffix matches
     * <br>are *always* case-insensitive.
     * @param suffix filename suffix to match
    */
    public void addSuffix(String suffix)  {
        JnaFileFilter.INST().gtk_file_filter_add_suffix(asCPointer(), suffix);
    }

    /**
     * Gets the attributes that need to be filled in for the `GFileInfo`
     * <br>passed to this filter.
     * <br>
     * <br>This function will not typically be used by applications;
     * <br>it is intended principally for use in the implementation
     * <br>of `GtkFileChooser`.
     * @return the attributes
    */
    public ch.bailu.gtk.type.Strs getAttributes()  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaFileFilter.INST().gtk_file_filter_get_attributes(asCPointer())));
    }

    /**
     * Gets the human-readable name for the filter.
     * <br>
     * <br>See [method&#64;Gtk.FileFilter.set_name].
     * @return The human-readable name of the filter
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFileFilter.INST().gtk_file_filter_get_name(asCPointer())));
    }

    /**
     * Sets a human-readable name of the filter.
     * <br>
     * <br>This is the string that will be displayed in the file chooser
     * <br>if there is a selectable list of filters.
     * @param name the human-readable-name for the filter, or %NULL   to remove any existing name.
    */
    public void setName(@Nullable ch.bailu.gtk.type.Str name)  {
        JnaFileFilter.INST().gtk_file_filter_set_name(asCPointer(), asCPointer(name));
    }

    /**
     * Sets a human-readable name of the filter.
     * <br>
     * <br>This is the string that will be displayed in the file chooser
     * <br>if there is a selectable list of filters.
     * @param name the human-readable-name for the filter, or %NULL   to remove any existing name.
    */
    public void setName(String name)  {
        JnaFileFilter.INST().gtk_file_filter_set_name(asCPointer(), name);
    }

    /**
     * Serialize a file filter to an `a{sv}` variant.
     * @return a new, floating, `GVariant`
    */
    public ch.bailu.gtk.glib.Variant toGvariant()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaFileFilter.INST().gtk_file_filter_to_gvariant(asCPointer())));
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    public static long getTypeID() { 
        return JnaFileFilter.INST().gtk_file_filter_get_type(); 
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
