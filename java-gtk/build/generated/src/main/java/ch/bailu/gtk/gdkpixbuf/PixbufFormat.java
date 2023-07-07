/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkPixbufFormat` contains information about the image format accepted
 * <br>by a module.
 * <br>
 * <br>Only modules should access the fields directly, applications should
 * <br>use the `gdk_pixbuf_format_*` family of functions.
 * <p><a href="https://docs.gtk.org/gdk-pixbuf/struct.PixbufFormat.html">https://docs.gtk.org/gdk-pixbuf/struct.PixbufFormat.html</a></p>
*/
public class PixbufFormat extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PixbufFormat.class.getCanonicalName());
    }

    public PixbufFormat(PointerContainer pointer) {
        super(pointer);
    }

    private JnaPixbufFormat.Fields _fields;
    
    JnaPixbufFormat.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPixbufFormat.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the name of the image format
    */
    public static final String NAME = "name";

    /**
     * the name of the image format
    */
    public void setFieldName(ch.bailu.gtk.type.Str name) {
        toFields().name = name.asCPointer();
        toFields().writeField(NAME);
    }

    /**
     * the name of the image format
    */
    public ch.bailu.gtk.type.Str getFieldName() {
       toFields().readField(NAME);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().name));
    } 

    /**
     * the signature of the module
    */
    public static final String SIGNATURE = "signature";

    /**
     * the signature of the module
    */
    public void setFieldSignature(PixbufModulePattern signature) {
        toFields().signature = signature.asCPointer();
        toFields().writeField(SIGNATURE);
    }

    /**
     * the signature of the module
    */
    public PixbufModulePattern getFieldSignature() {
       toFields().readField(SIGNATURE);
       return new PixbufModulePattern(new PointerContainer(toFields().signature));
    } 

    /**
     * the message domain for the `description`
    */
    public static final String DOMAIN = "domain";

    /**
     * the message domain for the `description`
    */
    public void setFieldDomain(ch.bailu.gtk.type.Str domain) {
        toFields().domain = domain.asCPointer();
        toFields().writeField(DOMAIN);
    }

    /**
     * the message domain for the `description`
    */
    public ch.bailu.gtk.type.Str getFieldDomain() {
       toFields().readField(DOMAIN);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().domain));
    } 

    /**
     * a description of the image format
    */
    public static final String DESCRIPTION = "description";

    /**
     * a description of the image format
    */
    public void setFieldDescription(ch.bailu.gtk.type.Str description) {
        toFields().description = description.asCPointer();
        toFields().writeField(DESCRIPTION);
    }

    /**
     * a description of the image format
    */
    public ch.bailu.gtk.type.Str getFieldDescription() {
       toFields().readField(DESCRIPTION);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().description));
    } 

    /**
     * Creates a copy of `format`.
     * @return the newly allocated copy of a `GdkPixbufFormat`. Use   gdk_pixbuf_format_free() to free the resources when done
    */
    public PixbufFormat copy()  {
        return new PixbufFormat(new PointerContainer(JnaPixbufFormat.INST().gdk_pixbuf_format_copy(asCPointer())));
    }

    /**
     * Frees the resources allocated when copying a `GdkPixbufFormat`
     * <br>using gdk_pixbuf_format_copy()
    */
    public void free()  {
        JnaPixbufFormat.INST().gdk_pixbuf_format_free(asCPointer());
    }

    /**
     * Returns a description of the format.
     * @return a description of the format.
    */
    public ch.bailu.gtk.type.Str getDescription()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPixbufFormat.INST().gdk_pixbuf_format_get_description(asCPointer())));
    }

    /**
     * Returns information about the license of the image loader for the format.
     * <br>
     * <br>The returned string should be a shorthand for a well known license, e.g.
     * <br>&quot;LGPL&quot;, &quot;GPL&quot;, &quot;QPL&quot;, &quot;GPL/QPL&quot;, or &quot;other&quot; to indicate some other license.
     * @return a string describing the license of the pixbuf format
    */
    public ch.bailu.gtk.type.Str getLicense()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPixbufFormat.INST().gdk_pixbuf_format_get_license(asCPointer())));
    }

    /**
     * Returns the name of the format.
     * @return the name of the format.
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPixbufFormat.INST().gdk_pixbuf_format_get_name(asCPointer())));
    }

    /**
     * Returns whether this image format is disabled.
     * <br>
     * <br>See gdk_pixbuf_format_set_disabled().
     * @return whether this image format is disabled.
    */
    public boolean isDisabled()  {
        return JnaPixbufFormat.INST().gdk_pixbuf_format_is_disabled(asCPointer());
    }

    /**
     * Returns `TRUE` if the save option specified by &#64;option_key is supported when
     * <br>saving a pixbuf using the module implementing &#64;format.
     * <br>
     * <br>See gdk_pixbuf_save() for more information about option keys.
     * @param option_key the name of an option
     * @return `TRUE` if the specified option is supported
    */
    public boolean isSaveOptionSupported(@Nonnull ch.bailu.gtk.type.Str option_key)  {
        return JnaPixbufFormat.INST().gdk_pixbuf_format_is_save_option_supported(asCPointer(), asCPointerNotNull(option_key));
    }

    /**
     * Returns `TRUE` if the save option specified by &#64;option_key is supported when
     * <br>saving a pixbuf using the module implementing &#64;format.
     * <br>
     * <br>See gdk_pixbuf_save() for more information about option keys.
     * @param option_key the name of an option
     * @return `TRUE` if the specified option is supported
    */
    public boolean isSaveOptionSupported(String option_key)  {
        return JnaPixbufFormat.INST().gdk_pixbuf_format_is_save_option_supported(asCPointer(), option_key);
    }

    /**
     * Returns whether this image format is scalable.
     * <br>
     * <br>If a file is in a scalable format, it is preferable to load it at
     * <br>the desired size, rather than loading it at the default size and
     * <br>scaling the resulting pixbuf to the desired size.
     * @return whether this image format is scalable.
    */
    public boolean isScalable()  {
        return JnaPixbufFormat.INST().gdk_pixbuf_format_is_scalable(asCPointer());
    }

    /**
     * Returns whether pixbufs can be saved in the given format.
     * @return whether pixbufs can be saved in the given format.
    */
    public boolean isWritable()  {
        return JnaPixbufFormat.INST().gdk_pixbuf_format_is_writable(asCPointer());
    }

    /**
     * Disables or enables an image format.
     * <br>
     * <br>If a format is disabled, GdkPixbuf won't use the image loader for
     * <br>this format to load images.
     * <br>
     * <br>Applications can use this to avoid using image loaders with an
     * <br>inappropriate license, see gdk_pixbuf_format_get_license().
     * @param disabled `TRUE` to disable the format &#64;format
    */
    public void setDisabled(boolean disabled)  {
        JnaPixbufFormat.INST().gdk_pixbuf_format_set_disabled(asCPointer(), disabled);
    }

    public static long getTypeID() { 
        return JnaPixbufFormat.INST().gdk_pixbuf_format_get_type(); 
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
some-fields-unsupported

[MethodModel:cb-return-value-not-supported:getExtensions:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]

[MethodModel:cb-return-value-not-supported:getMimeTypes:[ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]]

[FieldModel:mime_types:java-type-not-supported:{G_::{c:gchar**}}:{j:}]

[FieldModel:extensions:java-type-not-supported:previous-field-unsupported:{G_::{c:gchar**}}:{j:}]

[FieldModel:flags:previous-field-unsupported:{G_::{c:guint32}}:{j:int}]

[FieldModel:disabled:previous-field-unsupported:{G_::{c:gboolean}}:{j:boolean}]

[FieldModel:license:previous-field-unsupported:{Gw:Str:{c:gchar*}}:{j:long}]
*/
