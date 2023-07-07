/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkPageSetup` object stores the page size, orientation and margins.
 * <br>
 * <br>The idea is that you can get one of these from the page setup dialog
 * <br>and then pass it to the `GtkPrintOperation` when printing.
 * <br>The benefit of splitting this out of the `GtkPrintSettings` is that
 * <br>these affect the actual layout of the page, and thus need to be set
 * <br>long before user prints.
 * <br>
 * <br>&#35;&#35; Margins
 * <br>
 * <br>The margins specified in this object are the “print margins”, i.e. the
 * <br>parts of the page that the printer cannot print on. These are different
 * <br>from the layout margins that a word processor uses; they are typically
 * <br>used to determine the minimal size for the layout margins.
 * <br>
 * <br>To obtain a `GtkPageSetup` use [ctor&#64;Gtk.PageSetup.new] to get the defaults,
 * <br>or use [func&#64;Gtk.print_run_page_setup_dialog] to show the page setup dialog
 * <br>and receive the resulting page setup.
 * <br>
 * <br>&#35;&#35; A page setup dialog
 * <br>
 * <br>```c
 * <br>static GtkPrintSettings *settings = NULL;
 * <br>static GtkPageSetup *page_setup = NULL;
 * <br>
 * <br>static void
 * <br>do_page_setup (void)
 * <br>{
 * <br>  GtkPageSetup *new_page_setup;
 * <br>
 * <br>  if (settings == NULL)
 * <br>    settings = gtk_print_settings_new ();
 * <br>
 * <br>  new_page_setup = gtk_print_run_page_setup_dialog (GTK_WINDOW (main_window),
 * <br>                                                    page_setup, settings);
 * <br>
 * <br>  if (page_setup)
 * <br>    g_object_unref (page_setup);
 * <br>
 * <br>  page_setup = new_page_setup;
 * <br>}
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.PageSetup.html">https://docs.gtk.org/gtk4/class.PageSetup.html</a></p>
*/
public class PageSetup extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PageSetup.class.getCanonicalName());
    }

    public PageSetup(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Reads the page setup from the file &#64;file_name.
     * <br>
     * <br>Returns a new `GtkPageSetup` object with the restored
     * <br>page setup, or %NULL if an error occurred.
     * <br>See [method&#64;Gtk.PageSetup.to_file].
     * @param file_name the filename to read the page setup from
     * @return the restored `GtkPageSetup`
    */
    public static PageSetup newFromFilePageSetup(@Nonnull ch.bailu.gtk.type.Str file_name) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPageSetup.INST().gtk_page_setup_new_from_file(asCPointerNotNull(file_name), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PageSetup:newFromFile");
        }
        return new PageSetup(__self);
    }        
    

    /**
     * Reads the page setup from the file &#64;file_name.
     * <br>
     * <br>Returns a new `GtkPageSetup` object with the restored
     * <br>page setup, or %NULL if an error occurred.
     * <br>See [method&#64;Gtk.PageSetup.to_file].
     * @param file_name the filename to read the page setup from
     * @return the restored `GtkPageSetup`
    */
    public static PageSetup newFromFilePageSetup(String file_name) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPageSetup.INST().gtk_page_setup_new_from_file(file_name, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PageSetup:newFromFile");
        }
        return new PageSetup(__self);
    }        
    

    /**
     * Desrialize a page setup from an a{sv} variant.
     * <br>
     * <br>The variant must be in the format produced by
     * <br>[method&#64;Gtk.PageSetup.to_gvariant].
     * @param variant an a{sv} `GVariant`
     * @return a new `GtkPageSetup` object
    */
    public static PageSetup newFromGvariantPageSetup(@Nonnull ch.bailu.gtk.glib.Variant variant)  {
        PointerContainer __self = cast(JnaPageSetup.INST().gtk_page_setup_new_from_gvariant(asCPointerNotNull(variant)));
        if (__self.isNull()) {
            throw new NullPointerException("PageSetup:newFromGvariant");
        }
        return new PageSetup(__self);
    }        
    

    /**
     * Reads the page setup from the group &#64;group_name in the key file
     * <br>&#64;key_file.
     * <br>
     * <br>Returns a new `GtkPageSetup` object with the restored
     * <br>page setup, or %NULL if an error occurred.
     * @param key_file the `GKeyFile` to retrieve the page_setup from
     * @param group_name the name of the group in the key_file to read    to use the default name “Page Setup”
     * @return the restored `GtkPageSetup`
    */
    public static PageSetup newFromKeyFilePageSetup(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, @Nullable ch.bailu.gtk.type.Str group_name) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPageSetup.INST().gtk_page_setup_new_from_key_file(asCPointerNotNull(key_file), asCPointer(group_name), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PageSetup:newFromKeyFile");
        }
        return new PageSetup(__self);
    }        
    

    /**
     * Reads the page setup from the group &#64;group_name in the key file
     * <br>&#64;key_file.
     * <br>
     * <br>Returns a new `GtkPageSetup` object with the restored
     * <br>page setup, or %NULL if an error occurred.
     * @param key_file the `GKeyFile` to retrieve the page_setup from
     * @param group_name the name of the group in the key_file to read    to use the default name “Page Setup”
     * @return the restored `GtkPageSetup`
    */
    public static PageSetup newFromKeyFilePageSetup(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, String group_name) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPageSetup.INST().gtk_page_setup_new_from_key_file(asCPointerNotNull(key_file), group_name, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PageSetup:newFromKeyFile");
        }
        return new PageSetup(__self);
    }        
    

    /**
     * Creates a new `GtkPageSetup`.
    */
    public PageSetup() {
        super(cast(JnaPageSetup.INST().gtk_page_setup_new()));
    }

    /**
     * Copies a `GtkPageSetup`.
     * @return a copy of &#64;other
    */
    public PageSetup copy()  {
        return new PageSetup(new PointerContainer(JnaPageSetup.INST().gtk_page_setup_copy(asCPointer())));
    }

    /**
     * Gets the bottom margin in units of &#64;unit.
     * @param unit the unit for the return value
     * @return the bottom margin
    */
    public double getBottomMargin(int unit)  {
        return JnaPageSetup.INST().gtk_page_setup_get_bottom_margin(asCPointer(), unit);
    }

    /**
     * Gets the left margin in units of &#64;unit.
     * @param unit the unit for the return value
     * @return the left margin
    */
    public double getLeftMargin(int unit)  {
        return JnaPageSetup.INST().gtk_page_setup_get_left_margin(asCPointer(), unit);
    }

    /**
     * Gets the page orientation of the `GtkPageSetup`.
     * @return the page orientation
    */
    public int getOrientation()  {
        return JnaPageSetup.INST().gtk_page_setup_get_orientation(asCPointer());
    }

    /**
     * Returns the page height in units of &#64;unit.
     * <br>
     * <br>Note that this function takes orientation
     * <br>and margins into consideration.
     * <br>See [method&#64;Gtk.PageSetup.get_paper_height].
     * @param unit the unit for the return value
     * @return the page height.
    */
    public double getPageHeight(int unit)  {
        return JnaPageSetup.INST().gtk_page_setup_get_page_height(asCPointer(), unit);
    }

    /**
     * Returns the page width in units of &#64;unit.
     * <br>
     * <br>Note that this function takes orientation
     * <br>and margins into consideration.
     * <br>See [method&#64;Gtk.PageSetup.get_paper_width].
     * @param unit the unit for the return value
     * @return the page width.
    */
    public double getPageWidth(int unit)  {
        return JnaPageSetup.INST().gtk_page_setup_get_page_width(asCPointer(), unit);
    }

    /**
     * Returns the paper height in units of &#64;unit.
     * <br>
     * <br>Note that this function takes orientation,
     * <br>but not margins into consideration.
     * <br>See [method&#64;Gtk.PageSetup.get_page_height].
     * @param unit the unit for the return value
     * @return the paper height.
    */
    public double getPaperHeight(int unit)  {
        return JnaPageSetup.INST().gtk_page_setup_get_paper_height(asCPointer(), unit);
    }

    /**
     * Gets the paper size of the `GtkPageSetup`.
     * @return the paper size
    */
    public PaperSize getPaperSize()  {
        return new PaperSize(new PointerContainer(JnaPageSetup.INST().gtk_page_setup_get_paper_size(asCPointer())));
    }

    /**
     * Returns the paper width in units of &#64;unit.
     * <br>
     * <br>Note that this function takes orientation,
     * <br>but not margins into consideration.
     * <br>See [method&#64;Gtk.PageSetup.get_page_width].
     * @param unit the unit for the return value
     * @return the paper width.
    */
    public double getPaperWidth(int unit)  {
        return JnaPageSetup.INST().gtk_page_setup_get_paper_width(asCPointer(), unit);
    }

    /**
     * Gets the right margin in units of &#64;unit.
     * @param unit the unit for the return value
     * @return the right margin
    */
    public double getRightMargin(int unit)  {
        return JnaPageSetup.INST().gtk_page_setup_get_right_margin(asCPointer(), unit);
    }

    /**
     * Gets the top margin in units of &#64;unit.
     * @param unit the unit for the return value
     * @return the top margin
    */
    public double getTopMargin(int unit)  {
        return JnaPageSetup.INST().gtk_page_setup_get_top_margin(asCPointer(), unit);
    }

    /**
     * Reads the page setup from the file &#64;file_name.
     * <br>
     * <br>See [method&#64;Gtk.PageSetup.to_file].
     * @param file_name the filename to read the page setup from
     * @return %TRUE on success
    */
    public boolean loadFile(@Nonnull ch.bailu.gtk.type.Str file_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPageSetup.INST().gtk_page_setup_load_file(asCPointer(), asCPointerNotNull(file_name), 0L);
    }

    /**
     * Reads the page setup from the file &#64;file_name.
     * <br>
     * <br>See [method&#64;Gtk.PageSetup.to_file].
     * @param file_name the filename to read the page setup from
     * @return %TRUE on success
    */
    public boolean loadFile(String file_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPageSetup.INST().gtk_page_setup_load_file(asCPointer(), file_name, 0L);
    }

    /**
     * Reads the page setup from the group &#64;group_name in the key file
     * <br>&#64;key_file.
     * @param key_file the `GKeyFile` to retrieve the page_setup from
     * @param group_name the name of the group in the key_file to read   to use the default name “Page Setup”
     * @return %TRUE on success
    */
    public boolean loadKeyFile(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, @Nullable ch.bailu.gtk.type.Str group_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPageSetup.INST().gtk_page_setup_load_key_file(asCPointer(), asCPointerNotNull(key_file), asCPointer(group_name), 0L);
    }

    /**
     * Reads the page setup from the group &#64;group_name in the key file
     * <br>&#64;key_file.
     * @param key_file the `GKeyFile` to retrieve the page_setup from
     * @param group_name the name of the group in the key_file to read   to use the default name “Page Setup”
     * @return %TRUE on success
    */
    public boolean loadKeyFile(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, String group_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPageSetup.INST().gtk_page_setup_load_key_file(asCPointer(), asCPointerNotNull(key_file), group_name, 0L);
    }

    /**
     * Sets the bottom margin of the `GtkPageSetup`.
     * @param margin the new bottom margin in units of &#64;unit
     * @param unit the units for &#64;margin
    */
    public void setBottomMargin(double margin, int unit)  {
        JnaPageSetup.INST().gtk_page_setup_set_bottom_margin(asCPointer(), margin, unit);
    }

    /**
     * Sets the left margin of the `GtkPageSetup`.
     * @param margin the new left margin in units of &#64;unit
     * @param unit the units for &#64;margin
    */
    public void setLeftMargin(double margin, int unit)  {
        JnaPageSetup.INST().gtk_page_setup_set_left_margin(asCPointer(), margin, unit);
    }

    /**
     * Sets the page orientation of the `GtkPageSetup`.
     * @param orientation a `GtkPageOrientation` value
    */
    public void setOrientation(int orientation)  {
        JnaPageSetup.INST().gtk_page_setup_set_orientation(asCPointer(), orientation);
    }

    /**
     * Sets the paper size of the `GtkPageSetup` without
     * <br>changing the margins.
     * <br>
     * <br>See [method&#64;Gtk.PageSetup.set_paper_size_and_default_margins].
     * @param size a `GtkPaperSize`
    */
    public void setPaperSize(@Nonnull PaperSize size)  {
        JnaPageSetup.INST().gtk_page_setup_set_paper_size(asCPointer(), asCPointerNotNull(size));
    }

    /**
     * Sets the paper size of the `GtkPageSetup` and modifies
     * <br>the margins according to the new paper size.
     * @param size a `GtkPaperSize`
    */
    public void setPaperSizeAndDefaultMargins(@Nonnull PaperSize size)  {
        JnaPageSetup.INST().gtk_page_setup_set_paper_size_and_default_margins(asCPointer(), asCPointerNotNull(size));
    }

    /**
     * Sets the right margin of the `GtkPageSetup`.
     * @param margin the new right margin in units of &#64;unit
     * @param unit the units for &#64;margin
    */
    public void setRightMargin(double margin, int unit)  {
        JnaPageSetup.INST().gtk_page_setup_set_right_margin(asCPointer(), margin, unit);
    }

    /**
     * Sets the top margin of the `GtkPageSetup`.
     * @param margin the new top margin in units of &#64;unit
     * @param unit the units for &#64;margin
    */
    public void setTopMargin(double margin, int unit)  {
        JnaPageSetup.INST().gtk_page_setup_set_top_margin(asCPointer(), margin, unit);
    }

    /**
     * This function saves the information from &#64;setup to &#64;file_name.
     * @param file_name the file to save to
     * @return %TRUE on success
    */
    public boolean toFile(@Nonnull ch.bailu.gtk.type.Str file_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPageSetup.INST().gtk_page_setup_to_file(asCPointer(), asCPointerNotNull(file_name), 0L);
    }

    /**
     * This function saves the information from &#64;setup to &#64;file_name.
     * @param file_name the file to save to
     * @return %TRUE on success
    */
    public boolean toFile(String file_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPageSetup.INST().gtk_page_setup_to_file(asCPointer(), file_name, 0L);
    }

    /**
     * Serialize page setup to an a{sv} variant.
     * @return a new, floating, `GVariant`
    */
    public ch.bailu.gtk.glib.Variant toGvariant()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaPageSetup.INST().gtk_page_setup_to_gvariant(asCPointer())));
    }

    /**
     * This function adds the page setup from &#64;setup to &#64;key_file.
     * @param key_file the `GKeyFile` to save the page setup to
     * @param group_name the group to add the settings to in &#64;key_file,   or %NULL to use the default name “Page Setup”
    */
    public void toKeyFile(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, @Nullable ch.bailu.gtk.type.Str group_name)  {
        JnaPageSetup.INST().gtk_page_setup_to_key_file(asCPointer(), asCPointerNotNull(key_file), asCPointer(group_name));
    }

    /**
     * This function adds the page setup from &#64;setup to &#64;key_file.
     * @param key_file the `GKeyFile` to save the page setup to
     * @param group_name the group to add the settings to in &#64;key_file,   or %NULL to use the default name “Page Setup”
    */
    public void toKeyFile(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, String group_name)  {
        JnaPageSetup.INST().gtk_page_setup_to_key_file(asCPointer(), asCPointerNotNull(key_file), group_name);
    }

    public static long getTypeID() { 
        return JnaPageSetup.INST().gtk_page_setup_get_type(); 
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
