/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface GtkConstants {

    /**
     * An undefined value. The accessible attribute is either unset, or its
     * <br>value is undefined.
    */
    int ACCESSIBLE_VALUE_UNDEFINED = -1;

    /**
     * Like [func&#64;get_binary_age], but from the headers used at
     * <br>application compile time, rather than from the library linked
     * <br>against at application run time.
    */
    int BINARY_AGE = 803;

    /**
     * 
    */
    String IM_MODULE_EXTENSION_POINT_NAME = "gtk-im-module";

    /**
     * Constant to return from a signal handler for the ::input
     * <br>signal in case of conversion failure.
     * <br>
     * <br>See [signal&#64;Gtk.SpinButton::input].
    */
    int INPUT_ERROR = -1;

    /**
     * Like [func&#64;get_interface_age], but from the headers used at
     * <br>application compile time, rather than from the library linked
     * <br>against at application run time.
    */
    int INTERFACE_AGE = 3;

    /**
     * The name used for the stock full offset included by `GtkLevelBar`.
    */
    String LEVEL_BAR_OFFSET_FULL = "full";

    /**
     * The name used for the stock high offset included by `GtkLevelBar`.
    */
    String LEVEL_BAR_OFFSET_HIGH = "high";

    /**
     * The name used for the stock low offset included by `GtkLevelBar`.
    */
    String LEVEL_BAR_OFFSET_LOW = "low";

    /**
     * Like [func&#64;get_major_version], but from the headers used at
     * <br>application compile time, rather than from the library linked
     * <br>against at application run time.
    */
    int MAJOR_VERSION = 4;

    /**
     * 
    */
    int MAX_COMPOSE_LEN = 7;

    /**
     * 
    */
    String MEDIA_FILE_EXTENSION_POINT_NAME = "gtk-media-file";

    /**
     * Like [func&#64;get_micro_version], but from the headers used at
     * <br>application compile time, rather than from the library linked
     * <br>against at application run time.
    */
    int MICRO_VERSION = 3;

    /**
     * Like [func&#64;get_minor_version], but from the headers used at
     * <br>application compile time, rather than from the library linked
     * <br>against at application run time.
    */
    int MINOR_VERSION = 8;

    /**
     * Name for the A3 paper size.
    */
    String PAPER_NAME_A3 = "iso_a3";

    /**
     * Name for the A4 paper size.
    */
    String PAPER_NAME_A4 = "iso_a4";

    /**
     * Name for the A5 paper size.
    */
    String PAPER_NAME_A5 = "iso_a5";

    /**
     * Name for the B5 paper size.
    */
    String PAPER_NAME_B5 = "iso_b5";

    /**
     * Name for the Executive paper size.
    */
    String PAPER_NAME_EXECUTIVE = "na_executive";

    /**
     * Name for the Legal paper size.
    */
    String PAPER_NAME_LEGAL = "na_legal";

    /**
     * Name for the Letter paper size.
    */
    String PAPER_NAME_LETTER = "na_letter";

    /**
     * 
    */
    String PRINT_SETTINGS_COLLATE = "collate";

    /**
     * 
    */
    String PRINT_SETTINGS_DEFAULT_SOURCE = "default-source";

    /**
     * 
    */
    String PRINT_SETTINGS_DITHER = "dither";

    /**
     * 
    */
    String PRINT_SETTINGS_DUPLEX = "duplex";

    /**
     * 
    */
    String PRINT_SETTINGS_FINISHINGS = "finishings";

    /**
     * 
    */
    String PRINT_SETTINGS_MEDIA_TYPE = "media-type";

    /**
     * 
    */
    String PRINT_SETTINGS_NUMBER_UP = "number-up";

    /**
     * 
    */
    String PRINT_SETTINGS_NUMBER_UP_LAYOUT = "number-up-layout";

    /**
     * 
    */
    String PRINT_SETTINGS_N_COPIES = "n-copies";

    /**
     * 
    */
    String PRINT_SETTINGS_ORIENTATION = "orientation";

    /**
     * The key used by the “Print to file” printer to store the file
     * <br>name of the output without the path to the directory and the
     * <br>file extension.
    */
    String PRINT_SETTINGS_OUTPUT_BASENAME = "output-basename";

    /**
     * 
    */
    String PRINT_SETTINGS_OUTPUT_BIN = "output-bin";

    /**
     * The key used by the “Print to file” printer to store the
     * <br>directory to which the output should be written.
    */
    String PRINT_SETTINGS_OUTPUT_DIR = "output-dir";

    /**
     * The key used by the “Print to file” printer to store the format
     * <br>of the output. The supported values are “PS” and “PDF”.
    */
    String PRINT_SETTINGS_OUTPUT_FILE_FORMAT = "output-file-format";

    /**
     * The key used by the “Print to file” printer to store the URI
     * <br>to which the output should be written. GTK itself supports
     * <br>only “file://” URIs.
    */
    String PRINT_SETTINGS_OUTPUT_URI = "output-uri";

    /**
     * 
    */
    String PRINT_SETTINGS_PAGE_RANGES = "page-ranges";

    /**
     * 
    */
    String PRINT_SETTINGS_PAGE_SET = "page-set";

    /**
     * 
    */
    String PRINT_SETTINGS_PAPER_FORMAT = "paper-format";

    /**
     * 
    */
    String PRINT_SETTINGS_PAPER_HEIGHT = "paper-height";

    /**
     * 
    */
    String PRINT_SETTINGS_PAPER_WIDTH = "paper-width";

    /**
     * 
    */
    String PRINT_SETTINGS_PRINTER = "printer";

    /**
     * 
    */
    String PRINT_SETTINGS_PRINTER_LPI = "printer-lpi";

    /**
     * 
    */
    String PRINT_SETTINGS_PRINT_PAGES = "print-pages";

    /**
     * 
    */
    String PRINT_SETTINGS_QUALITY = "quality";

    /**
     * 
    */
    String PRINT_SETTINGS_RESOLUTION = "resolution";

    /**
     * 
    */
    String PRINT_SETTINGS_RESOLUTION_X = "resolution-x";

    /**
     * 
    */
    String PRINT_SETTINGS_RESOLUTION_Y = "resolution-y";

    /**
     * 
    */
    String PRINT_SETTINGS_REVERSE = "reverse";

    /**
     * 
    */
    String PRINT_SETTINGS_SCALE = "scale";

    /**
     * 
    */
    String PRINT_SETTINGS_USE_COLOR = "use-color";

    /**
     * 
    */
    String PRINT_SETTINGS_WIN32_DRIVER_EXTRA = "win32-driver-extra";

    /**
     * 
    */
    String PRINT_SETTINGS_WIN32_DRIVER_VERSION = "win32-driver-version";

    /**
     * Use this priority for functionality related to size allocation.
     * <br>
     * <br>It is used internally by GTK+ to compute the sizes of widgets.
     * <br>This priority is higher than %GDK_PRIORITY_REDRAW to avoid
     * <br>resizing a widget which was just redrawn.
    */
    int PRIORITY_RESIZE = 110;

    /**
     * A priority that can be used when adding a `GtkStyleProvider`
     * <br>for application-specific style information.
    */
    int STYLE_PROVIDER_PRIORITY_APPLICATION = 600;

    /**
     * The priority used for default style information
     * <br>that is used in the absence of themes.
     * <br>
     * <br>Note that this is not very useful for providing default
     * <br>styling for custom style classes - themes are likely to
     * <br>override styling provided at this priority with
     * <br>catch-all `* {...}` rules.
    */
    int STYLE_PROVIDER_PRIORITY_FALLBACK = 1;

    /**
     * The priority used for style information provided
     * <br>via `GtkSettings`.
     * <br>
     * <br>This priority is higher than %GTK_STYLE_PROVIDER_PRIORITY_THEME
     * <br>to let settings override themes.
    */
    int STYLE_PROVIDER_PRIORITY_SETTINGS = 400;

    /**
     * The priority used for style information provided
     * <br>by themes.
    */
    int STYLE_PROVIDER_PRIORITY_THEME = 200;

    /**
     * The priority used for the style information from
     * <br>`$XDG_CONFIG_HOME/gtk-4.0/gtk.css`.
     * <br>
     * <br>You should not use priorities higher than this, to
     * <br>give the user the last word.
    */
    int STYLE_PROVIDER_PRIORITY_USER = 800;

    /**
     * The priority at which the text view validates onscreen lines
     * <br>in an idle job in the background.
    */
    int TEXT_VIEW_PRIORITY_VALIDATE = 125;

    /**
     * Uses the default sort function in a [iface&#64;Gtk.TreeSortable].
     * <br>
     * <br>See also: [method&#64;Gtk.TreeSortable.set_sort_column_id]
    */
    int TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID = -1;

    /**
     * Disables sorting in a [iface&#64;Gtk.TreeSortable].
     * <br>
     * <br>See also: [method&#64;Gtk.TreeSortable.set_sort_column_id]
    */
    int TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID = -2;

}

/*
enumeration-type

[ParameterModel:value-not-supported:{G_::{c:guint}}:{j:int}]
*/
