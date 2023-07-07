/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GdkContentFormats` structure is used to advertise and negotiate the
 * <br>format of content.
 * <br>
 * <br>You will encounter `GdkContentFormats` when interacting with objects
 * <br>controlling operations that pass data between different widgets, window
 * <br>or application, like [class&#64;Gdk.Drag], [class&#64;Gdk.Drop],
 * <br>[class&#64;Gdk.Clipboard] or [class&#64;Gdk.ContentProvider].
 * <br>
 * <br>GDK supports content in 2 forms: `GType` and mime type.
 * <br>Using `GTypes` is meant only for in-process content transfers. Mime types
 * <br>are meant to be used for data passing both in-process and out-of-process.
 * <br>The details of how data is passed is described in the documentation of
 * <br>the actual implementations. To transform between the two forms,
 * <br>[class&#64;Gdk.ContentSerializer] and [class&#64;Gdk.ContentDeserializer] are used.
 * <br>
 * <br>A `GdkContentFormats` describes a set of possible formats content can be
 * <br>exchanged in. It is assumed that this set is ordered. `GTypes` are more
 * <br>important than mime types. Order between different `GTypes` or mime types
 * <br>is the order they were added in, most important first. Functions that
 * <br>care about order, such as [method&#64;Gdk.ContentFormats.union], will describe
 * <br>in their documentation how they interpret that order, though in general the
 * <br>order of the first argument is considered the primary order of the result,
 * <br>followed by the order of further arguments.
 * <br>
 * <br>For debugging purposes, the function [method&#64;Gdk.ContentFormats.to_string]
 * <br>exists. It will print a comma-separated list of formats from most important
 * <br>to least important.
 * <br>
 * <br>`GdkContentFormats` is an immutable struct. After creation, you cannot change
 * <br>the types it represents. Instead, new `GdkContentFormats` have to be created.
 * <br>The [struct&#64;Gdk.ContentFormatsBuilder] structure is meant to help in this
 * <br>endeavor.
 * <p><a href="https://docs.gtk.org/gdk4/struct.ContentFormats.html">https://docs.gtk.org/gdk4/struct.ContentFormats.html</a></p>
*/
public class ContentFormats extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ContentFormats.class.getCanonicalName());
    }

    public ContentFormats(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GdkContentFormats` for a given `GType`.
     * @param type a `GType`
     * @return a new `GdkContentFormats`
    */
    public static ContentFormats newForGtypeContentFormats(long type)  {
        PointerContainer __self = cast(JnaContentFormats.INST().gdk_content_formats_new_for_gtype(type));
        if (__self.isNull()) {
            throw new NullPointerException("ContentFormats:newForGtype");
        }
        return new ContentFormats(__self);
    }        
    

    /**
     * Creates a new `GdkContentFormats` from an array of mime types.
     * <br>
     * <br>The mime types must be valid and different from each other or the
     * <br>behavior of the return value is undefined. If you cannot guarantee
     * <br>this, use [struct&#64;Gdk.ContentFormatsBuilder] instead.
     * @param mime_types Pointer to an   array of mime types
     * @param n_mime_types number of entries in &#64;mime_types.
    */
    public ContentFormats(@Nullable ch.bailu.gtk.type.Strs mime_types, int n_mime_types) {
        super(cast(JnaContentFormats.INST().gdk_content_formats_new(asCPointer(mime_types), n_mime_types)));
    }

    /**
     * Checks if a given `GType` is part of the given &#64;formats.
     * @param type the `GType` to search for
     * @return %TRUE if the `GType` was found
    */
    public boolean containGtype(long type)  {
        return JnaContentFormats.INST().gdk_content_formats_contain_gtype(asCPointer(), type);
    }

    /**
     * Checks if a given mime type is part of the given &#64;formats.
     * @param mime_type the mime type to search for
     * @return %TRUE if the mime_type was found
    */
    public boolean containMimeType(@Nonnull ch.bailu.gtk.type.Str mime_type)  {
        return JnaContentFormats.INST().gdk_content_formats_contain_mime_type(asCPointer(), asCPointerNotNull(mime_type));
    }

    /**
     * Checks if a given mime type is part of the given &#64;formats.
     * @param mime_type the mime type to search for
     * @return %TRUE if the mime_type was found
    */
    public boolean containMimeType(String mime_type)  {
        return JnaContentFormats.INST().gdk_content_formats_contain_mime_type(asCPointer(), mime_type);
    }

    /**
     * Gets the mime types included in &#64;formats.
     * <br>
     * <br>Note that &#64;formats may not contain any mime types, in particular
     * <br>when they are empty. In that case %NULL will be returned.
     * @param n_mime_types optional pointer to take the   number of mime types contained in the return value
     * @return    %NULL-terminated array of interned strings of mime types included   in &#64;formats
    */
    public ch.bailu.gtk.type.Strs getMimeTypes(@Nullable ch.bailu.gtk.type.Int64 n_mime_types)  {
        return new ch.bailu.gtk.type.Strs(new PointerContainer(JnaContentFormats.INST().gdk_content_formats_get_mime_types(asCPointer(), asCPointer(n_mime_types))));
    }

    /**
     * Checks if &#64;first and &#64;second have any matching formats.
     * @param second the `GdkContentFormats` to intersect with
     * @return %TRUE if a matching format was found.
    */
    public boolean match(@Nonnull ContentFormats second)  {
        return JnaContentFormats.INST().gdk_content_formats_match(asCPointer(), asCPointerNotNull(second));
    }

    /**
     * Finds the first `GType` from &#64;first that is also contained
     * <br>in &#64;second.
     * <br>
     * <br>If no matching `GType` is found, %G_TYPE_INVALID is returned.
     * @param second the `GdkContentFormats` to intersect with
     * @return The first common `GType` or %G_TYPE_INVALID if none.
    */
    public long matchGtype(@Nonnull ContentFormats second)  {
        return JnaContentFormats.INST().gdk_content_formats_match_gtype(asCPointer(), asCPointerNotNull(second));
    }

    /**
     * Finds the first mime type from &#64;first that is also contained
     * <br>in &#64;second.
     * <br>
     * <br>If no matching mime type is found, %NULL is returned.
     * @param second the `GdkContentFormats` to intersect with
     * @return The first common mime type or %NULL if none
    */
    public ch.bailu.gtk.type.Str matchMimeType(@Nonnull ContentFormats second)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaContentFormats.INST().gdk_content_formats_match_mime_type(asCPointer(), asCPointerNotNull(second))));
    }

    /**
     * Prints the given &#64;formats into a string for human consumption.
     * <br>
     * <br>The result of this function can later be parsed with
     * <br>[func&#64;Gdk.ContentFormats.parse].
     * @param string a `GString` to print into
    */
    public void print(@Nonnull ch.bailu.gtk.glib.GString string)  {
        JnaContentFormats.INST().gdk_content_formats_print(asCPointer(), asCPointerNotNull(string));
    }

    /**
     * Increases the reference count of a `GdkContentFormats` by one.
     * @return the passed in `GdkContentFormats`.
    */
    public ContentFormats ref()  {
        return new ContentFormats(new PointerContainer(JnaContentFormats.INST().gdk_content_formats_ref(asCPointer())));
    }

    /**
     * Prints the given &#64;formats into a human-readable string.
     * <br>
     * <br>The resulting string can be parsed with [func&#64;Gdk.ContentFormats.parse].
     * <br>
     * <br>This is a small wrapper around [method&#64;Gdk.ContentFormats.print]
     * <br>to help when debugging.
     * @return a new string
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaContentFormats.INST().gdk_content_formats_to_string(asCPointer())));
    }

    /**
     * Append all missing types from &#64;second to &#64;first, in the order
     * <br>they had in &#64;second.
     * @param second the `GdkContentFormats` to merge from
     * @return a new `GdkContentFormats`
    */
    public ContentFormats union(@Nonnull ContentFormats second)  {
        return new ContentFormats(new PointerContainer(JnaContentFormats.INST().gdk_content_formats_union(asCPointer(), asCPointerNotNull(second))));
    }

    /**
     * Add GTypes for mime types in &#64;formats for which deserializers are
     * <br>registered.
     * @return a new `GdkContentFormats`
    */
    public ContentFormats unionDeserializeGtypes()  {
        return new ContentFormats(new PointerContainer(JnaContentFormats.INST().gdk_content_formats_union_deserialize_gtypes(asCPointer())));
    }

    /**
     * Add mime types for GTypes in &#64;formats for which deserializers are
     * <br>registered.
     * @return a new `GdkContentFormats`
    */
    public ContentFormats unionDeserializeMimeTypes()  {
        return new ContentFormats(new PointerContainer(JnaContentFormats.INST().gdk_content_formats_union_deserialize_mime_types(asCPointer())));
    }

    /**
     * Add GTypes for the mime types in &#64;formats for which serializers are
     * <br>registered.
     * @return a new `GdkContentFormats`
    */
    public ContentFormats unionSerializeGtypes()  {
        return new ContentFormats(new PointerContainer(JnaContentFormats.INST().gdk_content_formats_union_serialize_gtypes(asCPointer())));
    }

    /**
     * Add mime types for GTypes in &#64;formats for which serializers are
     * <br>registered.
     * @return a new `GdkContentFormats`
    */
    public ContentFormats unionSerializeMimeTypes()  {
        return new ContentFormats(new PointerContainer(JnaContentFormats.INST().gdk_content_formats_union_serialize_mime_types(asCPointer())));
    }

    /**
     * Decreases the reference count of a `GdkContentFormats` by one.
     * <br>
     * <br>If the resulting reference count is zero, frees the formats.
    */
    public void unref()  {
        JnaContentFormats.INST().gdk_content_formats_unref(asCPointer());
    }

    /**
     * Parses the given &#64;string into `GdkContentFormats` and
     * <br>returns the formats.
     * <br>
     * <br>Strings printed via [method&#64;Gdk.ContentFormats.to_string]
     * <br>can be read in again successfully using this function.
     * <br>
     * <br>If &#64;string does not describe valid content formats, %NULL
     * <br>is returned.
     * @param string the string to parse
     * @return the content formats if &#64;string is valid
    */
    public static ContentFormats parse(@Nonnull ch.bailu.gtk.type.Str string)  {
        return new ContentFormats(new PointerContainer(JnaContentFormats.INST().gdk_content_formats_parse(asCPointerNotNull(string))));
    }

    public static long getTypeID() { 
        return JnaContentFormats.INST().gdk_content_formats_get_type(); 
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

[MethodModel:cb-return-value-not-supported:getGtypes:[ParameterModel:java-type-not-supported:{G_::{c:const GType*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
*/
