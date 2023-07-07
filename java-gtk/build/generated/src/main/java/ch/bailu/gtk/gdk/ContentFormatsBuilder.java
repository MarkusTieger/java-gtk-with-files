/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkContentFormatsBuilder` is an auxiliary struct used to create
 * <br>new `GdkContentFormats`, and should not be kept around.
 * <p><a href="https://docs.gtk.org/gdk4/struct.ContentFormatsBuilder.html">https://docs.gtk.org/gdk4/struct.ContentFormatsBuilder.html</a></p>
*/
public class ContentFormatsBuilder extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ContentFormatsBuilder.class.getCanonicalName());
    }

    public ContentFormatsBuilder(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a new `GdkContentFormatsBuilder` object.
     * <br>
     * <br>The resulting builder would create an empty `GdkContentFormats`.
     * <br>Use addition functions to add types to it.
    */
    public ContentFormatsBuilder() {
        super(cast(JnaContentFormatsBuilder.INST().gdk_content_formats_builder_new()));
    }

    /**
     * Appends all formats from &#64;formats to &#64;builder, skipping those that
     * <br>already exist.
     * @param formats the formats to add
    */
    public void addFormats(@Nonnull ContentFormats formats)  {
        JnaContentFormatsBuilder.INST().gdk_content_formats_builder_add_formats(asCPointer(), asCPointerNotNull(formats));
    }

    /**
     * Appends &#64;type to &#64;builder if it has not already been added.
     * @param type a `GType`
    */
    public void addGtype(long type)  {
        JnaContentFormatsBuilder.INST().gdk_content_formats_builder_add_gtype(asCPointer(), type);
    }

    /**
     * Appends &#64;mime_type to &#64;builder if it has not already been added.
     * @param mime_type a mime type
    */
    public void addMimeType(@Nonnull ch.bailu.gtk.type.Str mime_type)  {
        JnaContentFormatsBuilder.INST().gdk_content_formats_builder_add_mime_type(asCPointer(), asCPointerNotNull(mime_type));
    }

    /**
     * Appends &#64;mime_type to &#64;builder if it has not already been added.
     * @param mime_type a mime type
    */
    public void addMimeType(String mime_type)  {
        JnaContentFormatsBuilder.INST().gdk_content_formats_builder_add_mime_type(asCPointer(), mime_type);
    }

    /**
     * Creates a new `GdkContentFormats` from the current state of the
     * <br>given &#64;builder, and frees the &#64;builder instance.
     * @return the newly created `GdkContentFormats`   with all the formats added to &#64;builder
    */
    public ContentFormats freeToFormats()  {
        return new ContentFormats(new PointerContainer(JnaContentFormatsBuilder.INST().gdk_content_formats_builder_free_to_formats(asCPointer())));
    }

    /**
     * Acquires a reference on the given &#64;builder.
     * <br>
     * <br>This function is intended primarily for bindings.
     * <br>`GdkContentFormatsBuilder` objects should not be kept around.
     * @return the given `GdkContentFormatsBuilder`   with its reference count increased
    */
    public ContentFormatsBuilder ref()  {
        return new ContentFormatsBuilder(new PointerContainer(JnaContentFormatsBuilder.INST().gdk_content_formats_builder_ref(asCPointer())));
    }

    /**
     * Creates a new `GdkContentFormats` from the given &#64;builder.
     * <br>
     * <br>The given `GdkContentFormatsBuilder` is reset once this function returns;
     * <br>you cannot call this function multiple times on the same &#64;builder instance.
     * <br>
     * <br>This function is intended primarily for bindings. C code should use
     * <br>[method&#64;Gdk.ContentFormatsBuilder.free_to_formats].
     * @return the newly created `GdkContentFormats`   with all the formats added to &#64;builder
    */
    public ContentFormats toFormats()  {
        return new ContentFormats(new PointerContainer(JnaContentFormatsBuilder.INST().gdk_content_formats_builder_to_formats(asCPointer())));
    }

    /**
     * Releases a reference on the given &#64;builder.
    */
    public void unref()  {
        JnaContentFormatsBuilder.INST().gdk_content_formats_builder_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaContentFormatsBuilder.INST().gdk_content_formats_builder_get_type(); 
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
