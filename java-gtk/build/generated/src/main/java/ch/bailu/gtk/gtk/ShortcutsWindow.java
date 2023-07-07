/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkShortcutsWindow` shows information about the keyboard shortcuts
 * <br>and gestures of an application.
 * <br>
 * <br>The shortcuts can be grouped, and you can have multiple sections in this
 * <br>window, corresponding to the major modes of your application.
 * <br>
 * <br>Additionally, the shortcuts can be filtered by the current view, to avoid
 * <br>showing information that is not relevant in the current application context.
 * <br>
 * <br>The recommended way to construct a `GtkShortcutsWindow` is with
 * <br>[class&#64;Gtk.Builder], by populating a `GtkShortcutsWindow` with one or
 * <br>more `GtkShortcutsSection` objects, which contain `GtkShortcutsGroups`
 * <br>that in turn contain objects of class `GtkShortcutsShortcut`.
 * <br>
 * <br>&#35; A simple example:
 * <br>
 * <br>![](gedit-shortcuts.png)
 * <br>
 * <br>This example has as single section. As you can see, the shortcut groups
 * <br>are arranged in columns, and spread across several pages if there are too
 * <br>many to find on a single page.
 * <br>
 * <br>The .ui file for this example can be found [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-gedit.ui).
 * <br>
 * <br>&#35; An example with multiple views:
 * <br>
 * <br>![](clocks-shortcuts.png)
 * <br>
 * <br>This example shows a `GtkShortcutsWindow` that has been configured to show only
 * <br>the shortcuts relevant to the &quot;stopwatch&quot; view.
 * <br>
 * <br>The .ui file for this example can be found [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-clocks.ui).
 * <br>
 * <br>&#35; An example with multiple sections:
 * <br>
 * <br>![](builder-shortcuts.png)
 * <br>
 * <br>This example shows a `GtkShortcutsWindow` with two sections, &quot;Editor Shortcuts&quot;
 * <br>and &quot;Terminal Shortcuts&quot;.
 * <br>
 * <br>The .ui file for this example can be found [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-builder.ui).
 * <p><a href="https://docs.gtk.org/gtk4/class.ShortcutsWindow.html">https://docs.gtk.org/gtk4/class.ShortcutsWindow.html</a></p>
*/
public class ShortcutsWindow extends Window {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ShortcutsWindow.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnClose {
        /**
         * Emitted when the user uses a keybinding to close the window.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is the Escape key.
        */
        void onClose();
    }
    
    private static com.sun.jna.Callback toOnClose(OnClose in) {
        return (in == null) ? null: (JnaShortcutsWindow.OnClose) (__self, __data) -> in.onClose();
    }

    @FunctionalInterface
    public interface OnSearch {
        /**
         * Emitted when the user uses a keybinding to start a search.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is Control-F.
        */
        void onSearch();
    }
    
    private static com.sun.jna.Callback toOnSearch(OnSearch in) {
        return (in == null) ? null: (JnaShortcutsWindow.OnSearch) (__self, __data) -> in.onSearch();
    }

    public ShortcutsWindow(PointerContainer pointer) {
        super(pointer);
    }

    public final static String SIGNAL_ON_CLOSE = "close";
    
    /**
     * Connect to signal "close".
     * <br>See {@link OnClose#onClose} for signal description.
     * <br>Field {@link #SIGNAL_ON_CLOSE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onClose(OnClose signal) {
        return connectSignal(SIGNAL_ON_CLOSE, toOnClose(signal));
    }

    public final static String SIGNAL_ON_SEARCH = "search";
    
    /**
     * Connect to signal "search".
     * <br>See {@link OnSearch#onSearch} for signal description.
     * <br>Field {@link #SIGNAL_ON_SEARCH} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSearch(OnSearch signal) {
        return connectSignal(SIGNAL_ON_SEARCH, toOnSearch(signal));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link Native}. Call this to get access to interface functions.
     * @return {@link Native}
    */
    public Native asNative() {
        return new Native(cast());
    }

    /**
     * Implements interface {@link Root}. Call this to get access to interface functions.
     * @return {@link Root}
    */
    public Root asRoot() {
        return new Root(cast());
    }

    /**
     * Implements interface {@link ShortcutManager}. Call this to get access to interface functions.
     * @return {@link ShortcutManager}
    */
    public ShortcutManager asShortcutManager() {
        return new ShortcutManager(cast());
    }

    public static long getTypeID() { 
        return JnaShortcutsWindow.INST().gtk_shortcuts_window_get_type(); 
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
