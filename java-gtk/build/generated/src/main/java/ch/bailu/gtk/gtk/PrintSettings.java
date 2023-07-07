/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkPrintSettings` object represents the settings of a print dialog in
 * <br>a system-independent way.
 * <br>
 * <br>The main use for this object is that once you’ve printed you can get a
 * <br>settings object that represents the settings the user chose, and the next
 * <br>time you print you can pass that object in so that the user doesn’t have
 * <br>to re-set all his settings.
 * <br>
 * <br>Its also possible to enumerate the settings so that you can easily save
 * <br>the settings for the next time your app runs, or even store them in a
 * <br>document. The predefined keys try to use shared values as much as possible
 * <br>so that moving such a document between systems still works.
 * <p><a href="https://docs.gtk.org/gtk4/class.PrintSettings.html">https://docs.gtk.org/gtk4/class.PrintSettings.html</a></p>
*/
public class PrintSettings extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PrintSettings.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnPrintSettingsFunc {
        /**
         * 
         * @param key 
         * @param value 
         * @param user_data 
        */
        void onPrintSettingsFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull ch.bailu.gtk.type.Str value, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaPrintSettings.OnPrintSettingsFunc toOnPrintSettingsFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnPrintSettingsFunc in) {
        JnaPrintSettings.OnPrintSettingsFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_key, _value, _user_data) -> in.onPrintSettingsFunc(__callback, new ch.bailu.gtk.type.Str(new PointerContainer(_key)), new ch.bailu.gtk.type.Str(new PointerContainer(_value)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public PrintSettings(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Reads the print settings from &#64;file_name.
     * <br>
     * <br>Returns a new `GtkPrintSettings` object with the restored settings,
     * <br>or %NULL if an error occurred. If the file could not be loaded then
     * <br>error is set to either a `GFileError` or `GKeyFileError`.
     * <br>
     * <br>See [method&#64;Gtk.PrintSettings.to_file].
     * @param file_name the filename to read the settings from
     * @return the restored `GtkPrintSettings`
    */
    public static PrintSettings newFromFilePrintSettings(@Nonnull ch.bailu.gtk.type.Str file_name) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPrintSettings.INST().gtk_print_settings_new_from_file(asCPointerNotNull(file_name), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PrintSettings:newFromFile");
        }
        return new PrintSettings(__self);
    }        
    

    /**
     * Reads the print settings from &#64;file_name.
     * <br>
     * <br>Returns a new `GtkPrintSettings` object with the restored settings,
     * <br>or %NULL if an error occurred. If the file could not be loaded then
     * <br>error is set to either a `GFileError` or `GKeyFileError`.
     * <br>
     * <br>See [method&#64;Gtk.PrintSettings.to_file].
     * @param file_name the filename to read the settings from
     * @return the restored `GtkPrintSettings`
    */
    public static PrintSettings newFromFilePrintSettings(String file_name) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPrintSettings.INST().gtk_print_settings_new_from_file(file_name, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PrintSettings:newFromFile");
        }
        return new PrintSettings(__self);
    }        
    

    /**
     * Deserialize print settings from an a{sv} variant.
     * <br>
     * <br>The variant must be in the format produced by
     * <br>[method&#64;Gtk.PrintSettings.to_gvariant].
     * @param variant an a{sv} `GVariant`
     * @return a new `GtkPrintSettings` object
    */
    public static PrintSettings newFromGvariantPrintSettings(@Nonnull ch.bailu.gtk.glib.Variant variant)  {
        PointerContainer __self = cast(JnaPrintSettings.INST().gtk_print_settings_new_from_gvariant(asCPointerNotNull(variant)));
        if (__self.isNull()) {
            throw new NullPointerException("PrintSettings:newFromGvariant");
        }
        return new PrintSettings(__self);
    }        
    

    /**
     * Reads the print settings from the group &#64;group_name in &#64;key_file.
     * <br>
     * <br>Returns a new `GtkPrintSettings` object with the restored settings,
     * <br>or %NULL if an error occurred. If the file could not be loaded then
     * <br>error is set to either `GFileError` or `GKeyFileError`.
     * @param key_file the `GKeyFile` to retrieve the settings from
     * @param group_name the name of the group to use, or %NULL to use   the default “Print Settings”
     * @return the restored `GtkPrintSettings`
    */
    public static PrintSettings newFromKeyFilePrintSettings(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, @Nullable ch.bailu.gtk.type.Str group_name) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPrintSettings.INST().gtk_print_settings_new_from_key_file(asCPointerNotNull(key_file), asCPointer(group_name), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PrintSettings:newFromKeyFile");
        }
        return new PrintSettings(__self);
    }        
    

    /**
     * Reads the print settings from the group &#64;group_name in &#64;key_file.
     * <br>
     * <br>Returns a new `GtkPrintSettings` object with the restored settings,
     * <br>or %NULL if an error occurred. If the file could not be loaded then
     * <br>error is set to either `GFileError` or `GKeyFileError`.
     * @param key_file the `GKeyFile` to retrieve the settings from
     * @param group_name the name of the group to use, or %NULL to use   the default “Print Settings”
     * @return the restored `GtkPrintSettings`
    */
    public static PrintSettings newFromKeyFilePrintSettings(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, String group_name) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaPrintSettings.INST().gtk_print_settings_new_from_key_file(asCPointerNotNull(key_file), group_name, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("PrintSettings:newFromKeyFile");
        }
        return new PrintSettings(__self);
    }        
    

    /**
     * Creates a new `GtkPrintSettings` object.
    */
    public PrintSettings() {
        super(cast(JnaPrintSettings.INST().gtk_print_settings_new()));
    }

    /**
     * Copies a `GtkPrintSettings` object.
     * @return a newly allocated copy of &#64;other
    */
    public PrintSettings copy()  {
        return new PrintSettings(new PointerContainer(JnaPrintSettings.INST().gtk_print_settings_copy(asCPointer())));
    }

    /**
     * Calls &#64;func for each key-value pair of &#64;settings.
     * @param func the function to call
     * @param user_data user data for &#64;func
    */
    public void foreach(OnPrintSettingsFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaPrintSettings.INST().gtk_print_settings_foreach(asCPointer(), toOnPrintSettingsFunc(this, "foreach", func), asCPointer(user_data));
    }

    /**
     * Looks up the string value associated with &#64;key.
     * @param key a key
     * @return the string value for &#64;key
    */
    public ch.bailu.gtk.type.Str get(@Nonnull ch.bailu.gtk.type.Str key)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrintSettings.INST().gtk_print_settings_get(asCPointer(), asCPointerNotNull(key))));
    }

    /**
     * Looks up the string value associated with &#64;key.
     * @param key a key
     * @return the string value for &#64;key
    */
    public ch.bailu.gtk.type.Str get(String key)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrintSettings.INST().gtk_print_settings_get(asCPointer(), key)));
    }

    /**
     * Returns the boolean represented by the value
     * <br>that is associated with &#64;key.
     * <br>
     * <br>The string “true” represents %TRUE, any other
     * <br>string %FALSE.
     * @param key a key
     * @return %TRUE, if &#64;key maps to a true value.
    */
    public boolean getBool(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_bool(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Returns the boolean represented by the value
     * <br>that is associated with &#64;key.
     * <br>
     * <br>The string “true” represents %TRUE, any other
     * <br>string %FALSE.
     * @param key a key
     * @return %TRUE, if &#64;key maps to a true value.
    */
    public boolean getBool(String key)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_bool(asCPointer(), key);
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_COLLATE.
     * @return whether to collate the printed pages
    */
    public boolean getCollate()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_collate(asCPointer());
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
     * @return the default source
    */
    public ch.bailu.gtk.type.Str getDefaultSource()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrintSettings.INST().gtk_print_settings_get_default_source(asCPointer())));
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_DITHER.
     * @return the dithering that is used
    */
    public ch.bailu.gtk.type.Str getDither()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrintSettings.INST().gtk_print_settings_get_dither(asCPointer())));
    }

    /**
     * Returns the double value associated with &#64;key, or 0.
     * @param key a key
     * @return the double value of &#64;key
    */
    public double getDouble(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_double(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Returns the double value associated with &#64;key, or 0.
     * @param key a key
     * @return the double value of &#64;key
    */
    public double getDouble(String key)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_double(asCPointer(), key);
    }

    /**
     * Returns the floating point number represented by
     * <br>the value that is associated with &#64;key, or &#64;default_val
     * <br>if the value does not represent a floating point number.
     * <br>
     * <br>Floating point numbers are parsed with g_ascii_strtod().
     * @param key a key
     * @param def the default value
     * @return the floating point number associated with &#64;key
    */
    public double getDoubleWithDefault(@Nonnull ch.bailu.gtk.type.Str key, double def)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_double_with_default(asCPointer(), asCPointerNotNull(key), def);
    }

    /**
     * Returns the floating point number represented by
     * <br>the value that is associated with &#64;key, or &#64;default_val
     * <br>if the value does not represent a floating point number.
     * <br>
     * <br>Floating point numbers are parsed with g_ascii_strtod().
     * @param key a key
     * @param def the default value
     * @return the floating point number associated with &#64;key
    */
    public double getDoubleWithDefault(String key, double def)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_double_with_default(asCPointer(), key, def);
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_DUPLEX.
     * @return whether to print the output in duplex.
    */
    public int getDuplex()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_duplex(asCPointer());
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
     * @return the finishings
    */
    public ch.bailu.gtk.type.Str getFinishings()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrintSettings.INST().gtk_print_settings_get_finishings(asCPointer())));
    }

    /**
     * Returns the integer value of &#64;key, or 0.
     * @param key a key
     * @return the integer value of &#64;key
    */
    public int getInt(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_int(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Returns the integer value of &#64;key, or 0.
     * @param key a key
     * @return the integer value of &#64;key
    */
    public int getInt(String key)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_int(asCPointer(), key);
    }

    /**
     * Returns the value of &#64;key, interpreted as
     * <br>an integer, or the default value.
     * @param key a key
     * @param def the default value
     * @return the integer value of &#64;key
    */
    public int getIntWithDefault(@Nonnull ch.bailu.gtk.type.Str key, int def)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_int_with_default(asCPointer(), asCPointerNotNull(key), def);
    }

    /**
     * Returns the value of &#64;key, interpreted as
     * <br>an integer, or the default value.
     * @param key a key
     * @param def the default value
     * @return the integer value of &#64;key
    */
    public int getIntWithDefault(String key, int def)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_int_with_default(asCPointer(), key, def);
    }

    /**
     * Returns the value associated with &#64;key, interpreted
     * <br>as a length.
     * <br>
     * <br>The returned value is converted to &#64;units.
     * @param key a key
     * @param unit the unit of the return value
     * @return the length value of &#64;key, converted to &#64;unit
    */
    public double getLength(@Nonnull ch.bailu.gtk.type.Str key, int unit)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_length(asCPointer(), asCPointerNotNull(key), unit);
    }

    /**
     * Returns the value associated with &#64;key, interpreted
     * <br>as a length.
     * <br>
     * <br>The returned value is converted to &#64;units.
     * @param key a key
     * @param unit the unit of the return value
     * @return the length value of &#64;key, converted to &#64;unit
    */
    public double getLength(String key, int unit)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_length(asCPointer(), key, unit);
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
     * <br>
     * <br>The set of media types is defined in PWG 5101.1-2002 PWG.
     * @return the media type
    */
    public ch.bailu.gtk.type.Str getMediaType()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrintSettings.INST().gtk_print_settings_get_media_type(asCPointer())));
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_N_COPIES.
     * @return the number of copies to print
    */
    public int getNCopies()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_n_copies(asCPointer());
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
     * @return the number of pages per sheet
    */
    public int getNumberUp()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_number_up(asCPointer());
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
     * @return layout of page in number-up mode
    */
    public int getNumberUpLayout()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_number_up_layout(asCPointer());
    }

    /**
     * Get the value of %GTK_PRINT_SETTINGS_ORIENTATION,
     * <br>converted to a `GtkPageOrientation`.
     * @return the orientation
    */
    public int getOrientation()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_orientation(asCPointer());
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
     * @return the output bin
    */
    public ch.bailu.gtk.type.Str getOutputBin()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrintSettings.INST().gtk_print_settings_get_output_bin(asCPointer())));
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
     * @return the set of pages to print
    */
    public int getPageSet()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_page_set(asCPointer());
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT,
     * <br>converted to &#64;unit.
     * @param unit the unit for the return value
     * @return the paper height, in units of &#64;unit
    */
    public double getPaperHeight(int unit)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_paper_height(asCPointer(), unit);
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT,
     * <br>converted to a `GtkPaperSize`.
     * @return the paper size
    */
    public PaperSize getPaperSize()  {
        return new PaperSize(new PointerContainer(JnaPrintSettings.INST().gtk_print_settings_get_paper_size(asCPointer())));
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH,
     * <br>converted to &#64;unit.
     * @param unit the unit for the return value
     * @return the paper width, in units of &#64;unit
    */
    public double getPaperWidth(int unit)  {
        return JnaPrintSettings.INST().gtk_print_settings_get_paper_width(asCPointer(), unit);
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
     * @return which pages to print
    */
    public int getPrintPages()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_print_pages(asCPointer());
    }

    /**
     * Convenience function to obtain the value of
     * <br>%GTK_PRINT_SETTINGS_PRINTER.
     * @return the printer name
    */
    public ch.bailu.gtk.type.Str getPrinter()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrintSettings.INST().gtk_print_settings_get_printer(asCPointer())));
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
     * @return the resolution in lpi (lines per inch)
    */
    public double getPrinterLpi()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_printer_lpi(asCPointer());
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_QUALITY.
     * @return the print quality
    */
    public int getQuality()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_quality(asCPointer());
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION.
     * @return the resolution in dpi
    */
    public int getResolution()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_resolution(asCPointer());
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_X.
     * @return the horizontal resolution in dpi
    */
    public int getResolutionX()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_resolution_x(asCPointer());
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_RESOLUTION_Y.
     * @return the vertical resolution in dpi
    */
    public int getResolutionY()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_resolution_y(asCPointer());
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_REVERSE.
     * @return whether to reverse the order of the printed pages
    */
    public boolean getReverse()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_reverse(asCPointer());
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_SCALE.
     * @return the scale in percent
    */
    public double getScale()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_scale(asCPointer());
    }

    /**
     * Gets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
     * @return whether to use color
    */
    public boolean getUseColor()  {
        return JnaPrintSettings.INST().gtk_print_settings_get_use_color(asCPointer());
    }

    /**
     * Returns %TRUE, if a value is associated with &#64;key.
     * @param key a key
     * @return %TRUE, if &#64;key has a value
    */
    public boolean hasKey(@Nonnull ch.bailu.gtk.type.Str key)  {
        return JnaPrintSettings.INST().gtk_print_settings_has_key(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Returns %TRUE, if a value is associated with &#64;key.
     * @param key a key
     * @return %TRUE, if &#64;key has a value
    */
    public boolean hasKey(String key)  {
        return JnaPrintSettings.INST().gtk_print_settings_has_key(asCPointer(), key);
    }

    /**
     * Reads the print settings from &#64;file_name.
     * <br>
     * <br>If the file could not be loaded then error is set to either
     * <br>a `GFileError` or `GKeyFileError`.
     * <br>
     * <br>See [method&#64;Gtk.PrintSettings.to_file].
     * @param file_name the filename to read the settings from
     * @return %TRUE on success
    */
    public boolean loadFile(@Nonnull ch.bailu.gtk.type.Str file_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPrintSettings.INST().gtk_print_settings_load_file(asCPointer(), asCPointerNotNull(file_name), 0L);
    }

    /**
     * Reads the print settings from &#64;file_name.
     * <br>
     * <br>If the file could not be loaded then error is set to either
     * <br>a `GFileError` or `GKeyFileError`.
     * <br>
     * <br>See [method&#64;Gtk.PrintSettings.to_file].
     * @param file_name the filename to read the settings from
     * @return %TRUE on success
    */
    public boolean loadFile(String file_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPrintSettings.INST().gtk_print_settings_load_file(asCPointer(), file_name, 0L);
    }

    /**
     * Reads the print settings from the group &#64;group_name in &#64;key_file.
     * <br>
     * <br>If the file could not be loaded then error is set to either a
     * <br>`GFileError` or `GKeyFileError`.
     * @param key_file the `GKeyFile` to retrieve the settings from
     * @param group_name the name of the group to use, or %NULL   to use the default “Print Settings”
     * @return %TRUE on success
    */
    public boolean loadKeyFile(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, @Nullable ch.bailu.gtk.type.Str group_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPrintSettings.INST().gtk_print_settings_load_key_file(asCPointer(), asCPointerNotNull(key_file), asCPointer(group_name), 0L);
    }

    /**
     * Reads the print settings from the group &#64;group_name in &#64;key_file.
     * <br>
     * <br>If the file could not be loaded then error is set to either a
     * <br>`GFileError` or `GKeyFileError`.
     * @param key_file the `GKeyFile` to retrieve the settings from
     * @param group_name the name of the group to use, or %NULL   to use the default “Print Settings”
     * @return %TRUE on success
    */
    public boolean loadKeyFile(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, String group_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPrintSettings.INST().gtk_print_settings_load_key_file(asCPointer(), asCPointerNotNull(key_file), group_name, 0L);
    }

    /**
     * Associates &#64;value with &#64;key.
     * @param key a key
     * @param value a string value
    */
    public void set(@Nonnull ch.bailu.gtk.type.Str key, @Nullable ch.bailu.gtk.type.Str value)  {
        JnaPrintSettings.INST().gtk_print_settings_set(asCPointer(), asCPointerNotNull(key), asCPointer(value));
    }

    /**
     * Associates &#64;value with &#64;key.
     * @param key a key
     * @param value a string value
    */
    public void set(String key, String value)  {
        JnaPrintSettings.INST().gtk_print_settings_set(asCPointer(), key, value);
    }

    /**
     * Sets &#64;key to a boolean value.
     * @param key a key
     * @param value a boolean
    */
    public void setBool(@Nonnull ch.bailu.gtk.type.Str key, boolean value)  {
        JnaPrintSettings.INST().gtk_print_settings_set_bool(asCPointer(), asCPointerNotNull(key), value);
    }

    /**
     * Sets &#64;key to a boolean value.
     * @param key a key
     * @param value a boolean
    */
    public void setBool(String key, boolean value)  {
        JnaPrintSettings.INST().gtk_print_settings_set_bool(asCPointer(), key, value);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_COLLATE.
     * @param collate whether to collate the output
    */
    public void setCollate(boolean collate)  {
        JnaPrintSettings.INST().gtk_print_settings_set_collate(asCPointer(), collate);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
     * @param default_source the default source
    */
    public void setDefaultSource(@Nonnull ch.bailu.gtk.type.Str default_source)  {
        JnaPrintSettings.INST().gtk_print_settings_set_default_source(asCPointer(), asCPointerNotNull(default_source));
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DEFAULT_SOURCE.
     * @param default_source the default source
    */
    public void setDefaultSource(String default_source)  {
        JnaPrintSettings.INST().gtk_print_settings_set_default_source(asCPointer(), default_source);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DITHER.
     * @param dither the dithering that is used
    */
    public void setDither(@Nonnull ch.bailu.gtk.type.Str dither)  {
        JnaPrintSettings.INST().gtk_print_settings_set_dither(asCPointer(), asCPointerNotNull(dither));
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DITHER.
     * @param dither the dithering that is used
    */
    public void setDither(String dither)  {
        JnaPrintSettings.INST().gtk_print_settings_set_dither(asCPointer(), dither);
    }

    /**
     * Sets &#64;key to a double value.
     * @param key a key
     * @param value a double value
    */
    public void setDouble(@Nonnull ch.bailu.gtk.type.Str key, double value)  {
        JnaPrintSettings.INST().gtk_print_settings_set_double(asCPointer(), asCPointerNotNull(key), value);
    }

    /**
     * Sets &#64;key to a double value.
     * @param key a key
     * @param value a double value
    */
    public void setDouble(String key, double value)  {
        JnaPrintSettings.INST().gtk_print_settings_set_double(asCPointer(), key, value);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_DUPLEX.
     * @param duplex a `GtkPrintDuplex` value
    */
    public void setDuplex(int duplex)  {
        JnaPrintSettings.INST().gtk_print_settings_set_duplex(asCPointer(), duplex);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
     * @param finishings the finishings
    */
    public void setFinishings(@Nonnull ch.bailu.gtk.type.Str finishings)  {
        JnaPrintSettings.INST().gtk_print_settings_set_finishings(asCPointer(), asCPointerNotNull(finishings));
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_FINISHINGS.
     * @param finishings the finishings
    */
    public void setFinishings(String finishings)  {
        JnaPrintSettings.INST().gtk_print_settings_set_finishings(asCPointer(), finishings);
    }

    /**
     * Sets &#64;key to an integer value.
     * @param key a key
     * @param value an integer
    */
    public void setInt(@Nonnull ch.bailu.gtk.type.Str key, int value)  {
        JnaPrintSettings.INST().gtk_print_settings_set_int(asCPointer(), asCPointerNotNull(key), value);
    }

    /**
     * Sets &#64;key to an integer value.
     * @param key a key
     * @param value an integer
    */
    public void setInt(String key, int value)  {
        JnaPrintSettings.INST().gtk_print_settings_set_int(asCPointer(), key, value);
    }

    /**
     * Associates a length in units of &#64;unit with &#64;key.
     * @param key a key
     * @param value a length
     * @param unit the unit of &#64;length
    */
    public void setLength(@Nonnull ch.bailu.gtk.type.Str key, double value, int unit)  {
        JnaPrintSettings.INST().gtk_print_settings_set_length(asCPointer(), asCPointerNotNull(key), value, unit);
    }

    /**
     * Associates a length in units of &#64;unit with &#64;key.
     * @param key a key
     * @param value a length
     * @param unit the unit of &#64;length
    */
    public void setLength(String key, double value, int unit)  {
        JnaPrintSettings.INST().gtk_print_settings_set_length(asCPointer(), key, value, unit);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
     * <br>
     * <br>The set of media types is defined in PWG 5101.1-2002 PWG.
     * @param media_type the media type
    */
    public void setMediaType(@Nonnull ch.bailu.gtk.type.Str media_type)  {
        JnaPrintSettings.INST().gtk_print_settings_set_media_type(asCPointer(), asCPointerNotNull(media_type));
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_MEDIA_TYPE.
     * <br>
     * <br>The set of media types is defined in PWG 5101.1-2002 PWG.
     * @param media_type the media type
    */
    public void setMediaType(String media_type)  {
        JnaPrintSettings.INST().gtk_print_settings_set_media_type(asCPointer(), media_type);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_N_COPIES.
     * @param num_copies the number of copies
    */
    public void setNCopies(int num_copies)  {
        JnaPrintSettings.INST().gtk_print_settings_set_n_copies(asCPointer(), num_copies);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP.
     * @param number_up the number of pages per sheet
    */
    public void setNumberUp(int number_up)  {
        JnaPrintSettings.INST().gtk_print_settings_set_number_up(asCPointer(), number_up);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_NUMBER_UP_LAYOUT.
     * @param number_up_layout a `GtkNumberUpLayout` value
    */
    public void setNumberUpLayout(int number_up_layout)  {
        JnaPrintSettings.INST().gtk_print_settings_set_number_up_layout(asCPointer(), number_up_layout);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_ORIENTATION.
     * @param orientation a page orientation
    */
    public void setOrientation(int orientation)  {
        JnaPrintSettings.INST().gtk_print_settings_set_orientation(asCPointer(), orientation);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
     * @param output_bin the output bin
    */
    public void setOutputBin(@Nonnull ch.bailu.gtk.type.Str output_bin)  {
        JnaPrintSettings.INST().gtk_print_settings_set_output_bin(asCPointer(), asCPointerNotNull(output_bin));
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_OUTPUT_BIN.
     * @param output_bin the output bin
    */
    public void setOutputBin(String output_bin)  {
        JnaPrintSettings.INST().gtk_print_settings_set_output_bin(asCPointer(), output_bin);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAGE_SET.
     * @param page_set a `GtkPageSet` value
    */
    public void setPageSet(int page_set)  {
        JnaPrintSettings.INST().gtk_print_settings_set_page_set(asCPointer(), page_set);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAPER_HEIGHT.
     * @param height the paper height
     * @param unit the units of &#64;height
    */
    public void setPaperHeight(double height, int unit)  {
        JnaPrintSettings.INST().gtk_print_settings_set_paper_height(asCPointer(), height, unit);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAPER_FORMAT,
     * <br>%GTK_PRINT_SETTINGS_PAPER_WIDTH and
     * <br>%GTK_PRINT_SETTINGS_PAPER_HEIGHT.
     * @param paper_size a paper size
    */
    public void setPaperSize(@Nonnull PaperSize paper_size)  {
        JnaPrintSettings.INST().gtk_print_settings_set_paper_size(asCPointer(), asCPointerNotNull(paper_size));
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PAPER_WIDTH.
     * @param width the paper width
     * @param unit the units of &#64;width
    */
    public void setPaperWidth(double width, int unit)  {
        JnaPrintSettings.INST().gtk_print_settings_set_paper_width(asCPointer(), width, unit);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PRINT_PAGES.
     * @param pages a `GtkPrintPages` value
    */
    public void setPrintPages(int pages)  {
        JnaPrintSettings.INST().gtk_print_settings_set_print_pages(asCPointer(), pages);
    }

    /**
     * Convenience function to set %GTK_PRINT_SETTINGS_PRINTER
     * <br>to &#64;printer.
     * @param printer the printer name
    */
    public void setPrinter(@Nonnull ch.bailu.gtk.type.Str printer)  {
        JnaPrintSettings.INST().gtk_print_settings_set_printer(asCPointer(), asCPointerNotNull(printer));
    }

    /**
     * Convenience function to set %GTK_PRINT_SETTINGS_PRINTER
     * <br>to &#64;printer.
     * @param printer the printer name
    */
    public void setPrinter(String printer)  {
        JnaPrintSettings.INST().gtk_print_settings_set_printer(asCPointer(), printer);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_PRINTER_LPI.
     * @param lpi the resolution in lpi (lines per inch)
    */
    public void setPrinterLpi(double lpi)  {
        JnaPrintSettings.INST().gtk_print_settings_set_printer_lpi(asCPointer(), lpi);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_QUALITY.
     * @param quality a `GtkPrintQuality` value
    */
    public void setQuality(int quality)  {
        JnaPrintSettings.INST().gtk_print_settings_set_quality(asCPointer(), quality);
    }

    /**
     * Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
     * <br>%GTK_PRINT_SETTINGS_RESOLUTION_X and
     * <br>%GTK_PRINT_SETTINGS_RESOLUTION_Y.
     * @param resolution the resolution in dpi
    */
    public void setResolution(int resolution)  {
        JnaPrintSettings.INST().gtk_print_settings_set_resolution(asCPointer(), resolution);
    }

    /**
     * Sets the values of %GTK_PRINT_SETTINGS_RESOLUTION,
     * <br>%GTK_PRINT_SETTINGS_RESOLUTION_X and
     * <br>%GTK_PRINT_SETTINGS_RESOLUTION_Y.
     * @param resolution_x the horizontal resolution in dpi
     * @param resolution_y the vertical resolution in dpi
    */
    public void setResolutionXy(int resolution_x, int resolution_y)  {
        JnaPrintSettings.INST().gtk_print_settings_set_resolution_xy(asCPointer(), resolution_x, resolution_y);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_REVERSE.
     * @param reverse whether to reverse the output
    */
    public void setReverse(boolean reverse)  {
        JnaPrintSettings.INST().gtk_print_settings_set_reverse(asCPointer(), reverse);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_SCALE.
     * @param scale the scale in percent
    */
    public void setScale(double scale)  {
        JnaPrintSettings.INST().gtk_print_settings_set_scale(asCPointer(), scale);
    }

    /**
     * Sets the value of %GTK_PRINT_SETTINGS_USE_COLOR.
     * @param use_color whether to use color
    */
    public void setUseColor(boolean use_color)  {
        JnaPrintSettings.INST().gtk_print_settings_set_use_color(asCPointer(), use_color);
    }

    /**
     * This function saves the print settings from &#64;settings to &#64;file_name.
     * <br>
     * <br>If the file could not be written then error is set to either a
     * <br>`GFileError` or `GKeyFileError`.
     * @param file_name the file to save to
     * @return %TRUE on success
    */
    public boolean toFile(@Nonnull ch.bailu.gtk.type.Str file_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPrintSettings.INST().gtk_print_settings_to_file(asCPointer(), asCPointerNotNull(file_name), 0L);
    }

    /**
     * This function saves the print settings from &#64;settings to &#64;file_name.
     * <br>
     * <br>If the file could not be written then error is set to either a
     * <br>`GFileError` or `GKeyFileError`.
     * @param file_name the file to save to
     * @return %TRUE on success
    */
    public boolean toFile(String file_name) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPrintSettings.INST().gtk_print_settings_to_file(asCPointer(), file_name, 0L);
    }

    /**
     * Serialize print settings to an a{sv} variant.
     * @return a new, floating, `GVariant`
    */
    public ch.bailu.gtk.glib.Variant toGvariant()  {
        return new ch.bailu.gtk.glib.Variant(new PointerContainer(JnaPrintSettings.INST().gtk_print_settings_to_gvariant(asCPointer())));
    }

    /**
     * This function adds the print settings from &#64;settings to &#64;key_file.
     * @param key_file the `GKeyFile` to save the print settings to
     * @param group_name the group to add the settings to in &#64;key_file, or   %NULL to use the default “Print Settings”
    */
    public void toKeyFile(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, @Nullable ch.bailu.gtk.type.Str group_name)  {
        JnaPrintSettings.INST().gtk_print_settings_to_key_file(asCPointer(), asCPointerNotNull(key_file), asCPointer(group_name));
    }

    /**
     * This function adds the print settings from &#64;settings to &#64;key_file.
     * @param key_file the `GKeyFile` to save the print settings to
     * @param group_name the group to add the settings to in &#64;key_file, or   %NULL to use the default “Print Settings”
    */
    public void toKeyFile(@Nonnull ch.bailu.gtk.glib.KeyFile key_file, String group_name)  {
        JnaPrintSettings.INST().gtk_print_settings_to_key_file(asCPointer(), asCPointerNotNull(key_file), group_name);
    }

    /**
     * Removes any value associated with &#64;key.
     * <br>
     * <br>This has the same effect as setting the value to %NULL.
     * @param key a key
    */
    public void unset(@Nonnull ch.bailu.gtk.type.Str key)  {
        JnaPrintSettings.INST().gtk_print_settings_unset(asCPointer(), asCPointerNotNull(key));
    }

    /**
     * Removes any value associated with &#64;key.
     * <br>
     * <br>This has the same effect as setting the value to %NULL.
     * @param key a key
    */
    public void unset(String key)  {
        JnaPrintSettings.INST().gtk_print_settings_unset(asCPointer(), key);
    }

    public static long getTypeID() { 
        return JnaPrintSettings.INST().gtk_print_settings_get_type(); 
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

[MethodModel:cb-return-value-not-supported:getPageRanges:[ParameterModel:java-type-not-supported:{G_::{c:GtkPageRange*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]

[MethodModel:java-type-not-supported:setPageRanges:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkPageRange*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
*/
