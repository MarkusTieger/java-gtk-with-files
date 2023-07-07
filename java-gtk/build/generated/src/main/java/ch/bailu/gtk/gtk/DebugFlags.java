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
public interface DebugFlags {

    /**
     * Information about GtkTextView
    */
    int TEXT = 1;

    /**
     * Information about GtkTreeView
    */
    int TREE = 2;

    /**
     * Information about keyboard shortcuts
    */
    int KEYBINDINGS = 4;

    /**
     * Information about modules and extensions
    */
    int MODULES = 8;

    /**
     * Information about size allocation
    */
    int GEOMETRY = 16;

    /**
     * Information about icon themes
    */
    int ICONTHEME = 32;

    /**
     * Information about printing
    */
    int PRINTING = 64;

    /**
     * Trace GtkBuilder operation
    */
    int BUILDER = 128;

    /**
     * Information about size requests
    */
    int SIZE_REQUEST = 256;

    /**
     * Disable the style property cache
    */
    int NO_CSS_CACHE = 512;

    /**
     * Open the GTK inspector
    */
    int INTERACTIVE = 1024;

    /**
     * Pretend the pointer is a touchscreen
    */
    int TOUCHSCREEN = 2048;

    /**
     * Information about actions and menu models
    */
    int ACTIONS = 4096;

    /**
     * Information from layout managers
    */
    int LAYOUT = 8192;

    /**
     * Include debug render nodes in the generated snapshots
    */
    int SNAPSHOT = 16384;

    /**
     * Information from the constraints solver
    */
    int CONSTRAINTS = 32768;

    /**
     * Log unused GtkBuilder objects
    */
    int BUILDER_OBJECTS = 65536;

    /**
     * Information about accessibility state changes
    */
    int A11Y = 131072;

    /**
     * Information about icon fallback. Since: 4.2
    */
    int ICONFALLBACK = 262144;

    /**
     * 
    */
    int INVERT_TEXT_DIR = 524288;

}

/*
enumeration-type
*/
