/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkPaperSize` handles paper sizes.
 * <br>
 * <br>It uses the standard called
 * <br>[PWG 5101.1-2002 PWG: Standard for Media Standardized Names](http://www.pwg.org/standards.html)
 * <br>to name the paper sizes (and to get the data for the page sizes).
 * <br>In addition to standard paper sizes, `GtkPaperSize` allows to
 * <br>construct custom paper sizes with arbitrary dimensions.
 * <br>
 * <br>The `GtkPaperSize` object stores not only the dimensions (width
 * <br>and height) of a paper size and its name, it also provides
 * <br>default print margins.
 * <p><a href="https://docs.gtk.org/gtk4/struct.PaperSize.html">https://docs.gtk.org/gtk4/struct.PaperSize.html</a></p>
*/
public class PaperSize extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PaperSize.class.getCanonicalName());
    }

    public PaperSize(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkPaperSize` object with the
     * <br>given parameters.
     * @param name the paper name
     * @param display_name the human-readable name
     * @param width the paper width, in units of &#64;unit
     * @param height the paper height, in units of &#64;unit
     * @param unit the unit for &#64;width and &#64;height. not %GTK_UNIT_NONE.
     * @return a new `GtkPaperSize` object, use [method&#64;Gtk.PaperSize.free] to free it
    */
    public static PaperSize newCustomPaperSize(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull ch.bailu.gtk.type.Str display_name, double width, double height, int unit)  {
        PointerContainer __self = cast(JnaPaperSize.INST().gtk_paper_size_new_custom(asCPointerNotNull(name), asCPointerNotNull(display_name), width, height, unit));
        if (__self.isNull()) {
            throw new NullPointerException("PaperSize:newCustom");
        }
        return new PaperSize(__self);
    }        
    

    /**
     * Creates a new `GtkPaperSize` object with the
     * <br>given parameters.
     * @param name the paper name
     * @param display_name the human-readable name
     * @param width the paper width, in units of &#64;unit
     * @param height the paper height, in units of &#64;unit
     * @param unit the unit for &#64;width and &#64;height. not %GTK_UNIT_NONE.
     * @return a new `GtkPaperSize` object, use [method&#64;Gtk.PaperSize.free] to free it
    */
    public static PaperSize newCustomPaperSize(String name, String display_name, double width, double height, int unit)  {
        PointerContainer __self = cast(JnaPaperSize.INST().gtk_paper_size_new_custom(name, display_name, width, height, unit));
        if (__self.isNull()) {
            throw new NullPointerException("PaperSize:newCustom");
        }
        return new PaperSize(__self);
    }        
    

    /**
     * Deserialize a paper size from a `GVariant`.
     * <br>
     * <br>The `GVariant must be in the format produced by
     * <br>[method&#64;Gtk.PaperSize.to_gvariant].
     * @param variant an a{sv} `GVariant`
     * @return a new `GtkPaperSize` object
    */
    public static PaperSize newFromGvariantPaperSize(@Nonnull ch.bailu.gtk.glib.Variant variant)  {
        PointerContainer __self = cast(JnaPaperSize.INST().gtk_paper_size_new_from_gvariant(asCPointerNotNull(variant)));
        if (__self.isNull()) {
            throw new NullPointerException("PaperSize:newFromGvariant");
        }
        return new PaperSize(__self);
    }        
    

    /**
     * Creates a new `GtkPaperSize` object by using
     * <br>IPP information.
     * <br>
     * <br>If &#64;ipp_name is not a recognized paper name,
     * <br>&#64;width and &#64;height are used to
     * <br>construct a custom `GtkPaperSize` object.
     * @param ipp_name an IPP paper name
     * @param width the paper width, in points
     * @param height the paper height in points
     * @return a new `GtkPaperSize`, use [method&#64;Gtk.PaperSize.free] to free it
    */
    public static PaperSize newFromIppPaperSize(@Nonnull ch.bailu.gtk.type.Str ipp_name, double width, double height)  {
        PointerContainer __self = cast(JnaPaperSize.INST().gtk_paper_size_new_from_ipp(asCPointerNotNull(ipp_name), width, height));
        if (__self.isNull()) {
            throw new NullPointerException("PaperSize:newFromIpp");
        }
        return new PaperSize(__self);
    }        
    

    /**
     * Creates a new `GtkPaperSize` object by using
     * <br>IPP information.
     * <br>
     * <br>If &#64;ipp_name is not a recognized paper name,
     * <br>&#64;width and &#64;height are used to
     * <br>construct a custom `GtkPaperSize` object.
     * @param ipp_name an IPP paper name
     * @param width the paper width, in points
     * @param height the paper height in points
     * @return a new `GtkPaperSize`, use [method&#64;Gtk.PaperSize.free] to free it
    */
    public static PaperSize newFromIppPaperSize(String ipp_name, double width, double height)  {
        PointerContainer __self = cast(JnaPaperSize.INST().gtk_paper_size_new_from_ipp(ipp_name, width, height));
        if (__self.isNull()) {
            throw new NullPointerException("PaperSize:newFromIpp");
        }
        return new PaperSize(__self);
    }        
    

    /**
     * Reads a paper size from the group &#64;group_name in the key file
     * <br>&#64;key_file.
     * @param key_file the `GKeyFile` to retrieve the papersize from
     * @param group_name the name of the group in the key file to read,   or %NULL to read the first group
     * @return a new `GtkPaperSize` object with the restored paper size
    */
    public static PaperSize newFromKeyFilePaperSize(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, @Nullable ch.bailu.gtk.type.Str group_name) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPaperSize.INST().gtk_paper_size_new_from_key_file(asCPointerNotNull(key_file), asCPointer(group_name), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PaperSize:newFromKeyFile");
        }
        return new PaperSize(__self);
    }        
    

    /**
     * Reads a paper size from the group &#64;group_name in the key file
     * <br>&#64;key_file.
     * @param key_file the `GKeyFile` to retrieve the papersize from
     * @param group_name the name of the group in the key file to read,   or %NULL to read the first group
     * @return a new `GtkPaperSize` object with the restored paper size
    */
    public static PaperSize newFromKeyFilePaperSize(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, String group_name) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPaperSize.INST().gtk_paper_size_new_from_key_file(asCPointerNotNull(key_file), group_name, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PaperSize:newFromKeyFile");
        }
        return new PaperSize(__self);
    }        
    

    /**
     * Creates a new `GtkPaperSize` object by using
     * <br>PPD information.
     * <br>
     * <br>If &#64;ppd_name is not a recognized PPD paper name,
     * <br>&#64;ppd_display_name, &#64;width and &#64;height are used to
     * <br>construct a custom `GtkPaperSize` object.
     * @param ppd_name a PPD paper name
     * @param ppd_display_name the corresponding human-readable name
     * @param width the paper width, in points
     * @param height the paper height in points
     * @return a new `GtkPaperSize`, use [method&#64;Gtk.PaperSize.free] to free it
    */
    public static PaperSize newFromPpdPaperSize(@Nonnull ch.bailu.gtk.type.Str ppd_name, @Nonnull ch.bailu.gtk.type.Str ppd_display_name, double width, double height)  {
        PointerContainer __self = cast(JnaPaperSize.INST().gtk_paper_size_new_from_ppd(asCPointerNotNull(ppd_name), asCPointerNotNull(ppd_display_name), width, height));
        if (__self.isNull()) {
            throw new NullPointerException("PaperSize:newFromPpd");
        }
        return new PaperSize(__self);
    }        
    

    /**
     * Creates a new `GtkPaperSize` object by using
     * <br>PPD information.
     * <br>
     * <br>If &#64;ppd_name is not a recognized PPD paper name,
     * <br>&#64;ppd_display_name, &#64;width and &#64;height are used to
     * <br>construct a custom `GtkPaperSize` object.
     * @param ppd_name a PPD paper name
     * @param ppd_display_name the corresponding human-readable name
     * @param width the paper width, in points
     * @param height the paper height in points
     * @return a new `GtkPaperSize`, use [method&#64;Gtk.PaperSize.free] to free it
    */
    public static PaperSize newFromPpdPaperSize(String ppd_name, String ppd_display_name, double width, double height)  {
        PointerContainer __self = cast(JnaPaperSize.INST().gtk_paper_size_new_from_ppd(ppd_name, ppd_display_name, width, height));
        if (__self.isNull()) {
            throw new NullPointerException("PaperSize:newFromPpd");
        }
        return new PaperSize(__self);
    }        
    

    /**
     * Creates a new `GtkPaperSize` object by parsing a
     * <br>[PWG 5101.1-2002](ftp://ftp.pwg.org/pub/pwg/candidates/cs-pwgmsn10-20020226-5101.1.pdf)
     * <br>paper name.
     * <br>
     * <br>If &#64;name is %NULL, the default paper size is returned,
     * <br>see [func&#64;Gtk.PaperSize.get_default].
     * @param name a paper size name
    */
    public PaperSize(@Nullable ch.bailu.gtk.type.Str name) {
        super(cast(JnaPaperSize.INST().gtk_paper_size_new(asCPointer(name))));
    }

    /**
     * Creates a new `GtkPaperSize` object by parsing a
     * <br>[PWG 5101.1-2002](ftp://ftp.pwg.org/pub/pwg/candidates/cs-pwgmsn10-20020226-5101.1.pdf)
     * <br>paper name.
     * <br>
     * <br>If &#64;name is %NULL, the default paper size is returned,
     * <br>see [func&#64;Gtk.PaperSize.get_default].
     * @param name a paper size name
    */
    public PaperSize(String name) {
        super(cast(JnaPaperSize.INST().gtk_paper_size_new(name)));
    }

    /**
     * Copies an existing `GtkPaperSize`.
     * @return a copy of &#64;other
    */
    public PaperSize copy()  {
        return new PaperSize(new PointerContainer(JnaPaperSize.INST().gtk_paper_size_copy(asCPointer())));
    }

    /**
     * Free the given `GtkPaperSize` object.
    */
    public void free()  {
        JnaPaperSize.INST().gtk_paper_size_free(asCPointer());
    }

    /**
     * Gets the default bottom margin for the `GtkPaperSize`.
     * @param unit the unit for the return value, not %GTK_UNIT_NONE
     * @return the default bottom margin
    */
    public double getDefaultBottomMargin(int unit)  {
        return JnaPaperSize.INST().gtk_paper_size_get_default_bottom_margin(asCPointer(), unit);
    }

    /**
     * Gets the default left margin for the `GtkPaperSize`.
     * @param unit the unit for the return value, not %GTK_UNIT_NONE
     * @return the default left margin
    */
    public double getDefaultLeftMargin(int unit)  {
        return JnaPaperSize.INST().gtk_paper_size_get_default_left_margin(asCPointer(), unit);
    }

    /**
     * Gets the default right margin for the `GtkPaperSize`.
     * @param unit the unit for the return value, not %GTK_UNIT_NONE
     * @return the default right margin
    */
    public double getDefaultRightMargin(int unit)  {
        return JnaPaperSize.INST().gtk_paper_size_get_default_right_margin(asCPointer(), unit);
    }

    /**
     * Gets the default top margin for the `GtkPaperSize`.
     * @param unit the unit for the return value, not %GTK_UNIT_NONE
     * @return the default top margin
    */
    public double getDefaultTopMargin(int unit)  {
        return JnaPaperSize.INST().gtk_paper_size_get_default_top_margin(asCPointer(), unit);
    }

    /**
     * Gets the human-readable name of the `GtkPaperSize`.
     * @return the human-readable name of &#64;size
    */
    public ch.bailu.gtk.type.Str getDisplayName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPaperSize.INST().gtk_paper_size_get_display_name(asCPointer())));
    }

    /**
     * Gets the paper height of the `GtkPaperSize`, in
     * <br>units of &#64;unit.
     * @param unit the unit for the return value, not %GTK_UNIT_NONE
     * @return the paper height
    */
    public double getHeight(int unit)  {
        return JnaPaperSize.INST().gtk_paper_size_get_height(asCPointer(), unit);
    }

    /**
     * Gets the name of the `GtkPaperSize`.
     * @return the name of &#64;size
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPaperSize.INST().gtk_paper_size_get_name(asCPointer())));
    }

    /**
     * Gets the PPD name of the `GtkPaperSize`, which
     * <br>may be %NULL.
     * @return the PPD name of &#64;size
    */
    public ch.bailu.gtk.type.Str getPpdName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPaperSize.INST().gtk_paper_size_get_ppd_name(asCPointer())));
    }

    /**
     * Gets the paper width of the `GtkPaperSize`, in
     * <br>units of &#64;unit.
     * @param unit the unit for the return value, not %GTK_UNIT_NONE
     * @return the paper width
    */
    public double getWidth(int unit)  {
        return JnaPaperSize.INST().gtk_paper_size_get_width(asCPointer(), unit);
    }

    /**
     * Returns %TRUE if &#64;size is not a standard paper size.
     * @return whether &#64;size is a custom paper size.
    */
    public boolean isCustom()  {
        return JnaPaperSize.INST().gtk_paper_size_is_custom(asCPointer());
    }

    /**
     * Compares two `GtkPaperSize` objects.
     * @param size2 another `GtkPaperSize` object
     * @return %TRUE, if &#64;size1 and &#64;size2 represent the same paper size
    */
    public boolean isEqual(@Nonnull PaperSize size2)  {
        return JnaPaperSize.INST().gtk_paper_size_is_equal(asCPointer(), asCPointerNotNull(size2));
    }

    /**
     * Returns %TRUE if &#64;size is an IPP standard paper size.
     * @return whether &#64;size is not an IPP custom paper size.
    */
    public boolean isIpp()  {
        return JnaPaperSize.INST().gtk_paper_size_is_ipp(asCPointer());
    }

    /**
     * Changes the dimensions of a &#64;size to &#64;width x &#64;height.
     * @param width the new width in units of &#64;unit
     * @param height the new height in units of &#64;unit
     * @param unit the unit for &#64;width and &#64;height
    */
    public void setSize(double width, double height, int unit)  {
        JnaPaperSize.INST().gtk_paper_size_set_size(asCPointer(), width, height, unit);
    }

    /**
     * Serialize a paper size to an `a{sv}` variant.
     * @return a new, floating, `GVariant`
    */
    public ch.bailu.gtk.glib.Variant toGvariant()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaPaperSize.INST().gtk_paper_size_to_gvariant(asCPointer())));
    }

    /**
     * This function adds the paper size from &#64;size to &#64;key_file.
     * @param key_file the `GKeyFile` to save the paper size to
     * @param group_name the group to add the settings to in &#64;key_file
    */
    public void toKeyFile(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, @Nonnull ch.bailu.gtk.type.Str group_name)  {
        JnaPaperSize.INST().gtk_paper_size_to_key_file(asCPointer(), asCPointerNotNull(key_file), asCPointerNotNull(group_name));
    }

    /**
     * This function adds the paper size from &#64;size to &#64;key_file.
     * @param key_file the `GKeyFile` to save the paper size to
     * @param group_name the group to add the settings to in &#64;key_file
    */
    public void toKeyFile(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, String group_name)  {
        JnaPaperSize.INST().gtk_paper_size_to_key_file(asCPointer(), asCPointerNotNull(key_file), group_name);
    }

    /**
     * Returns the name of the default paper size, which
     * <br>depends on the current locale.
     * @return the name of the default paper size. The string is owned by GTK and should not be modified.
    */
    public static ch.bailu.gtk.type.Str getDefault()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPaperSize.INST().gtk_paper_size_get_default()));
    }

    /**
     * Creates a list of known paper sizes.
     * @param include_custom whether to include custom paper sizes   as defined in the page setup dialog
     * @return a newly allocated list of newly    allocated `GtkPaperSize` objects
    */
    public static ch.bailu.gtk.glib.List getPaperSizes(boolean include_custom)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaPaperSize.INST().gtk_paper_size_get_paper_sizes(include_custom)));
    }

    public static long getTypeID() { 
        return JnaPaperSize.INST().gtk_paper_size_get_type(); 
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
