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
public interface AccessibleRole {

    /**
     * An element with important, and usually
     * <br>  time-sensitive, information
    */
    int ALERT = 0;

    /**
     * A type of dialog that contains an
     * <br>  alert message
    */
    int ALERT_DIALOG = 1;

    /**
     * Unused
    */
    int BANNER = 2;

    /**
     * An input element that allows for
     * <br>  user-triggered actions when clicked or pressed
    */
    int BUTTON = 3;

    /**
     * Unused
    */
    int CAPTION = 4;

    /**
     * Unused
    */
    int CELL = 5;

    /**
     * A checkable input element that has
     * <br>  three possible values: `true`, `false`, or `mixed`
    */
    int CHECKBOX = 6;

    /**
     * A header in a columned list.
    */
    int COLUMN_HEADER = 7;

    /**
     * An input that controls another element,
     * <br>  such as a list or a grid, that can dynamically pop up to help the user
     * <br>  set the value of the input
    */
    int COMBO_BOX = 8;

    /**
     * Abstract role.
    */
    int COMMAND = 9;

    /**
     * Abstract role.
    */
    int COMPOSITE = 10;

    /**
     * A dialog is a window that is designed to interrupt
     * <br>   the current processing of an application in order to prompt the user to enter
     * <br>   information or require a response.
    */
    int DIALOG = 11;

    /**
     * Unused
    */
    int DOCUMENT = 12;

    /**
     * Unused
    */
    int FEED = 13;

    /**
     * Unused
    */
    int FORM = 14;

    /**
     * Unused
    */
    int GENERIC = 15;

    /**
     * A grid of items.
    */
    int GRID = 16;

    /**
     * An item in a grid or tree grid.
    */
    int GRID_CELL = 17;

    /**
     * An element that groups multiple widgets. GTK uses
     * <br>  this role for various containers, like [class&#64;Box], [class&#64;Viewport], and [class&#64;HeaderBar].
    */
    int GROUP = 18;

    /**
     * Unused
    */
    int HEADING = 19;

    /**
     * An image.
    */
    int IMG = 20;

    /**
     * Abstract role.
    */
    int INPUT = 21;

    /**
     * A visible name or caption for a user interface component.
    */
    int LABEL = 22;

    /**
     * Abstract role.
    */
    int LANDMARK = 23;

    /**
     * Unused
    */
    int LEGEND = 24;

    /**
     * A clickable link.
    */
    int LINK = 25;

    /**
     * A list of items.
    */
    int LIST = 26;

    /**
     * Unused.
    */
    int LIST_BOX = 27;

    /**
     * An item in a list.
    */
    int LIST_ITEM = 28;

    /**
     * Unused
    */
    int LOG = 29;

    /**
     * Unused
    */
    int MAIN = 30;

    /**
     * Unused
    */
    int MARQUEE = 31;

    /**
     * Unused
    */
    int MATH = 32;

    /**
     * An element that represents a value within a known range.
    */
    int METER = 33;

    /**
     * A menu.
    */
    int MENU = 34;

    /**
     * A menubar.
    */
    int MENU_BAR = 35;

    /**
     * An item in a menu.
    */
    int MENU_ITEM = 36;

    /**
     * A check item in a menu.
    */
    int MENU_ITEM_CHECKBOX = 37;

    /**
     * A radio item in a menu.
    */
    int MENU_ITEM_RADIO = 38;

    /**
     * Unused
    */
    int NAVIGATION = 39;

    /**
     * An element that is not represented to accessibility technologies.
    */
    int NONE = 40;

    /**
     * Unused
    */
    int NOTE = 41;

    /**
     * Unused
    */
    int OPTION = 42;

    /**
     * An element that is not represented to accessibility technologies.
    */
    int PRESENTATION = 43;

    /**
     * An element that displays the progress
     * <br>   status for tasks that take a long time.
    */
    int PROGRESS_BAR = 44;

    /**
     * A checkable input in a group of radio roles,
     * <br>   only one of which can be checked at a time.
    */
    int RADIO = 45;

    /**
     * Unused
    */
    int RADIO_GROUP = 46;

    /**
     * Abstract role.
    */
    int RANGE = 47;

    /**
     * Unused
    */
    int REGION = 48;

    /**
     * A row in a columned list.
    */
    int ROW = 49;

    /**
     * Unused
    */
    int ROW_GROUP = 50;

    /**
     * Unused
    */
    int ROW_HEADER = 51;

    /**
     * A graphical object that controls the scrolling
     * <br>   of content within a viewing area, regardless of whether the content is fully
     * <br>   displayed within the viewing area.
    */
    int SCROLLBAR = 52;

    /**
     * Unused
    */
    int SEARCH = 53;

    /**
     * A type of textbox intended for specifying
     * <br>   search criteria.
    */
    int SEARCH_BOX = 54;

    /**
     * Abstract role.
    */
    int SECTION = 55;

    /**
     * Abstract role.
    */
    int SECTION_HEAD = 56;

    /**
     * Abstract role.
    */
    int SELECT = 57;

    /**
     * A divider that separates and distinguishes
     * <br>   sections of content or groups of menuitems.
    */
    int SEPARATOR = 58;

    /**
     * A user input where the user selects a value
     * <br>   from within a given range.
    */
    int SLIDER = 59;

    /**
     * A form of range that expects the user to
     * <br>   select from among discrete choices.
    */
    int SPIN_BUTTON = 60;

    /**
     * Unused
    */
    int STATUS = 61;

    /**
     * Abstract role.
    */
    int STRUCTURE = 62;

    /**
     * A type of checkbox that represents on/off values,
     * <br>   as opposed to checked/unchecked values.
    */
    int SWITCH = 63;

    /**
     * An item in a list of tab used for switching pages.
    */
    int TAB = 64;

    /**
     * Unused
    */
    int TABLE = 65;

    /**
     * A list of tabs for switching pages.
    */
    int TAB_LIST = 66;

    /**
     * A page in a notebook or stack.
    */
    int TAB_PANEL = 67;

    /**
     * A type of input that allows free-form text
     * <br>   as its value.
    */
    int TEXT_BOX = 68;

    /**
     * Unused
    */
    int TIME = 69;

    /**
     * Unused
    */
    int TIMER = 70;

    /**
     * Unused
    */
    int TOOLBAR = 71;

    /**
     * Unused
    */
    int TOOLTIP = 72;

    /**
     * Unused
    */
    int TREE = 73;

    /**
     * A treeview-like, columned list.
    */
    int TREE_GRID = 74;

    /**
     * Unused
    */
    int TREE_ITEM = 75;

    /**
     * An interactive component of a graphical user
     * <br>   interface. This is the role that GTK uses by default for widgets.
    */
    int WIDGET = 76;

    /**
     * An application window.
    */
    int WINDOW = 77;

}

/*
enumeration-type
*/
