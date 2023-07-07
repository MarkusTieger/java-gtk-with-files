/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkFileChooserWidget` is a widget for choosing files.
 * <br>
 * <br>It exposes the [iface&#64;Gtk.FileChooser] interface, and you should
 * <br>use the methods of this interface to interact with the
 * <br>widget.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkFileChooserWidget` has a single CSS node with name filechooser.
 * <p><a href="https://docs.gtk.org/gtk4/class.FileChooserWidget.html">https://docs.gtk.org/gtk4/class.FileChooserWidget.html</a></p>
*/
public class FileChooserWidget extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileChooserWidget.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDesktopFolder {
        /**
         * Emitted when the user asks for it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This is used to make the file chooser show the user's Desktop
         * <br>folder in the file list.
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;D&lt;/kbd&gt;.
        */
        void onDesktopFolder();
    }
    
    private static com.sun.jna.Callback toOnDesktopFolder(OnDesktopFolder in) {
        return (in == null) ? null: (JnaFileChooserWidget.OnDesktopFolder) (__self, __data) -> in.onDesktopFolder();
    }

    @FunctionalInterface
    public interface OnDownFolder {
        /**
         * Emitted when the user asks for it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This is used to make the file chooser go to a child of the
         * <br>current folder in the file hierarchy. The subfolder that will
         * <br>be used is displayed in the path bar widget of the file chooser.
         * <br>For example, if the path bar is showing &quot;/foo/bar/baz&quot;, with bar
         * <br>currently displayed, then this will cause the file chooser to
         * <br>switch to the &quot;baz&quot; subfolder.
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;Down&lt;/kbd&gt;.
        */
        void onDownFolder();
    }
    
    private static com.sun.jna.Callback toOnDownFolder(OnDownFolder in) {
        return (in == null) ? null: (JnaFileChooserWidget.OnDownFolder) (__self, __data) -> in.onDownFolder();
    }

    @FunctionalInterface
    public interface OnHomeFolder {
        /**
         * Emitted when the user asks for it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This is used to make the file chooser show the user's home
         * <br>folder in the file list.
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;Home&lt;/kbd&gt;.
        */
        void onHomeFolder();
    }
    
    private static com.sun.jna.Callback toOnHomeFolder(OnHomeFolder in) {
        return (in == null) ? null: (JnaFileChooserWidget.OnHomeFolder) (__self, __data) -> in.onHomeFolder();
    }

    @FunctionalInterface
    public interface OnLocationPopup {
        /**
         * Emitted when the user asks for it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This is used to make the file chooser show a &quot;Location&quot; prompt which
         * <br>the user can use to manually type the name of the file he wishes to select.
         * <br>
         * <br>The default bindings for this signal are &lt;kbd&gt;Control&lt;/kbd&gt;-&lt;kbd&gt;L&lt;/kbd&gt;
         * <br>with a &#64;path string of &quot;&quot; (the empty string). It is also bound to
         * <br>&lt;kbd&gt;/&lt;/kbd&gt; with a &#64;path string of &quot;`/`&quot; (a slash):  this lets you
         * <br>type `/` and immediately type a path name. On Unix systems, this is
         * <br>bound to &lt;kbd&gt;~&lt;/kbd&gt; (tilde) with a &#64;path string of &quot;~&quot; itself for
         * <br>access to home directories.
         * @param path a string that gets put in the text entry for the file name
        */
        void onLocationPopup(@Nonnull ch.bailu.gtk.type.Str path);
    }
    
    private static com.sun.jna.Callback toOnLocationPopup(OnLocationPopup in) {
        return (in == null) ? null: (JnaFileChooserWidget.OnLocationPopup) (__self, _path, __data) -> in.onLocationPopup(new ch.bailu.gtk.type.Str(new PointerContainer(_path)));
    }

    @FunctionalInterface
    public interface OnLocationPopupOnPaste {
        /**
         * Emitted when the user asks for it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This is used to make the file chooser show a &quot;Location&quot; prompt
         * <br>when the user pastes into a `GtkFileChooserWidget`.
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Control&lt;/kbd&gt;-&lt;kbd&gt;V&lt;/kbd&gt;.
        */
        void onLocationPopupOnPaste();
    }
    
    private static com.sun.jna.Callback toOnLocationPopupOnPaste(OnLocationPopupOnPaste in) {
        return (in == null) ? null: (JnaFileChooserWidget.OnLocationPopupOnPaste) (__self, __data) -> in.onLocationPopupOnPaste();
    }

    @FunctionalInterface
    public interface OnLocationTogglePopup {
        /**
         * Emitted when the user asks for it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This is used to toggle the visibility of a &quot;Location&quot; prompt
         * <br>which the user can use to manually type the name of the file
         * <br>he wishes to select.
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Control&lt;/kbd&gt;-&lt;kbd&gt;L&lt;/kbd&gt;.
        */
        void onLocationTogglePopup();
    }
    
    private static com.sun.jna.Callback toOnLocationTogglePopup(OnLocationTogglePopup in) {
        return (in == null) ? null: (JnaFileChooserWidget.OnLocationTogglePopup) (__self, __data) -> in.onLocationTogglePopup();
    }

    @FunctionalInterface
    public interface OnPlacesShortcut {
        /**
         * Emitted when the user asks for it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This is used to move the focus to the places sidebar.
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;P&lt;/kbd&gt;.
        */
        void onPlacesShortcut();
    }
    
    private static com.sun.jna.Callback toOnPlacesShortcut(OnPlacesShortcut in) {
        return (in == null) ? null: (JnaFileChooserWidget.OnPlacesShortcut) (__self, __data) -> in.onPlacesShortcut();
    }

    @FunctionalInterface
    public interface OnQuickBookmark {
        /**
         * Emitted when the user asks for it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This is used to make the file chooser switch to the bookmark
         * <br>specified in the &#64;bookmark_index parameter. For example, if
         * <br>you have three bookmarks, you can pass 0, 1, 2 to this signal
         * <br>to switch to each of them, respectively.
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;1&lt;/kbd&gt;,
         * <br>&lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;2&lt;/kbd&gt;, etc. until &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;0&lt;/kbd&gt;.
         * <br>Note that in the default binding, that &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;1&lt;/kbd&gt; is
         * <br>actually defined to switch to the bookmark at index 0, and so on
         * <br>successively.
         * @param bookmark_index the number of the bookmark to switch to
        */
        void onQuickBookmark(int bookmark_index);
    }
    
    private static com.sun.jna.Callback toOnQuickBookmark(OnQuickBookmark in) {
        return (in == null) ? null: (JnaFileChooserWidget.OnQuickBookmark) (__self, _bookmark_index, __data) -> in.onQuickBookmark(_bookmark_index);
    }

    @FunctionalInterface
    public interface OnRecentShortcut {
        /**
         * Emitted when the user asks for it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This is used to make the file chooser show the Recent location.
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;R&lt;/kbd&gt;.
        */
        void onRecentShortcut();
    }
    
    private static com.sun.jna.Callback toOnRecentShortcut(OnRecentShortcut in) {
        return (in == null) ? null: (JnaFileChooserWidget.OnRecentShortcut) (__self, __data) -> in.onRecentShortcut();
    }

    @FunctionalInterface
    public interface OnSearchShortcut {
        /**
         * Emitted when the user asks for it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This is used to make the file chooser show the search entry.
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;S&lt;/kbd&gt;.
        */
        void onSearchShortcut();
    }
    
    private static com.sun.jna.Callback toOnSearchShortcut(OnSearchShortcut in) {
        return (in == null) ? null: (JnaFileChooserWidget.OnSearchShortcut) (__self, __data) -> in.onSearchShortcut();
    }

    @FunctionalInterface
    public interface OnShowHidden {
        /**
         * Emitted when the user asks for it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This is used to make the file chooser display hidden files.
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Control&lt;/kbd&gt;-&lt;kbd&gt;H&lt;/kbd&gt;.
        */
        void onShowHidden();
    }
    
    private static com.sun.jna.Callback toOnShowHidden(OnShowHidden in) {
        return (in == null) ? null: (JnaFileChooserWidget.OnShowHidden) (__self, __data) -> in.onShowHidden();
    }

    @FunctionalInterface
    public interface OnUpFolder {
        /**
         * Emitted when the user asks for it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This is used to make the file chooser go to the parent
         * <br>of the current folder in the file hierarchy.
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;Up&lt;/kbd&gt;.
        */
        void onUpFolder();
    }
    
    private static com.sun.jna.Callback toOnUpFolder(OnUpFolder in) {
        return (in == null) ? null: (JnaFileChooserWidget.OnUpFolder) (__self, __data) -> in.onUpFolder();
    }

    public FileChooserWidget(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkFileChooserWidget`.
     * <br>
     * <br>This is a file chooser widget that can be embedded in custom
     * <br>windows, and it is the same widget that is used by
     * <br>`GtkFileChooserDialog`.
     * @param action Open or save mode for the widget
    */
    public FileChooserWidget(int action) {
        super(cast(JnaFileChooserWidget.INST().gtk_file_chooser_widget_new(action)));
    }

    public final static String SIGNAL_ON_DESKTOP_FOLDER = "desktop-folder";
    
    /**
     * Connect to signal "desktop-folder".
     * <br>See {@link OnDesktopFolder#onDesktopFolder} for signal description.
     * <br>Field {@link #SIGNAL_ON_DESKTOP_FOLDER} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDesktopFolder(OnDesktopFolder signal) {
        return connectSignal(SIGNAL_ON_DESKTOP_FOLDER, toOnDesktopFolder(signal));
    }

    public final static String SIGNAL_ON_DOWN_FOLDER = "down-folder";
    
    /**
     * Connect to signal "down-folder".
     * <br>See {@link OnDownFolder#onDownFolder} for signal description.
     * <br>Field {@link #SIGNAL_ON_DOWN_FOLDER} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDownFolder(OnDownFolder signal) {
        return connectSignal(SIGNAL_ON_DOWN_FOLDER, toOnDownFolder(signal));
    }

    public final static String SIGNAL_ON_HOME_FOLDER = "home-folder";
    
    /**
     * Connect to signal "home-folder".
     * <br>See {@link OnHomeFolder#onHomeFolder} for signal description.
     * <br>Field {@link #SIGNAL_ON_HOME_FOLDER} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onHomeFolder(OnHomeFolder signal) {
        return connectSignal(SIGNAL_ON_HOME_FOLDER, toOnHomeFolder(signal));
    }

    public final static String SIGNAL_ON_LOCATION_POPUP = "location-popup";
    
    /**
     * Connect to signal "location-popup".
     * <br>See {@link OnLocationPopup#onLocationPopup} for signal description.
     * <br>Field {@link #SIGNAL_ON_LOCATION_POPUP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLocationPopup(OnLocationPopup signal) {
        return connectSignal(SIGNAL_ON_LOCATION_POPUP, toOnLocationPopup(signal));
    }

    public final static String SIGNAL_ON_LOCATION_POPUP_ON_PASTE = "location-popup-on-paste";
    
    /**
     * Connect to signal "location-popup-on-paste".
     * <br>See {@link OnLocationPopupOnPaste#onLocationPopupOnPaste} for signal description.
     * <br>Field {@link #SIGNAL_ON_LOCATION_POPUP_ON_PASTE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLocationPopupOnPaste(OnLocationPopupOnPaste signal) {
        return connectSignal(SIGNAL_ON_LOCATION_POPUP_ON_PASTE, toOnLocationPopupOnPaste(signal));
    }

    public final static String SIGNAL_ON_LOCATION_TOGGLE_POPUP = "location-toggle-popup";
    
    /**
     * Connect to signal "location-toggle-popup".
     * <br>See {@link OnLocationTogglePopup#onLocationTogglePopup} for signal description.
     * <br>Field {@link #SIGNAL_ON_LOCATION_TOGGLE_POPUP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLocationTogglePopup(OnLocationTogglePopup signal) {
        return connectSignal(SIGNAL_ON_LOCATION_TOGGLE_POPUP, toOnLocationTogglePopup(signal));
    }

    public final static String SIGNAL_ON_PLACES_SHORTCUT = "places-shortcut";
    
    /**
     * Connect to signal "places-shortcut".
     * <br>See {@link OnPlacesShortcut#onPlacesShortcut} for signal description.
     * <br>Field {@link #SIGNAL_ON_PLACES_SHORTCUT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPlacesShortcut(OnPlacesShortcut signal) {
        return connectSignal(SIGNAL_ON_PLACES_SHORTCUT, toOnPlacesShortcut(signal));
    }

    public final static String SIGNAL_ON_QUICK_BOOKMARK = "quick-bookmark";
    
    /**
     * Connect to signal "quick-bookmark".
     * <br>See {@link OnQuickBookmark#onQuickBookmark} for signal description.
     * <br>Field {@link #SIGNAL_ON_QUICK_BOOKMARK} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onQuickBookmark(OnQuickBookmark signal) {
        return connectSignal(SIGNAL_ON_QUICK_BOOKMARK, toOnQuickBookmark(signal));
    }

    public final static String SIGNAL_ON_RECENT_SHORTCUT = "recent-shortcut";
    
    /**
     * Connect to signal "recent-shortcut".
     * <br>See {@link OnRecentShortcut#onRecentShortcut} for signal description.
     * <br>Field {@link #SIGNAL_ON_RECENT_SHORTCUT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRecentShortcut(OnRecentShortcut signal) {
        return connectSignal(SIGNAL_ON_RECENT_SHORTCUT, toOnRecentShortcut(signal));
    }

    public final static String SIGNAL_ON_SEARCH_SHORTCUT = "search-shortcut";
    
    /**
     * Connect to signal "search-shortcut".
     * <br>See {@link OnSearchShortcut#onSearchShortcut} for signal description.
     * <br>Field {@link #SIGNAL_ON_SEARCH_SHORTCUT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSearchShortcut(OnSearchShortcut signal) {
        return connectSignal(SIGNAL_ON_SEARCH_SHORTCUT, toOnSearchShortcut(signal));
    }

    public final static String SIGNAL_ON_SHOW_HIDDEN = "show-hidden";
    
    /**
     * Connect to signal "show-hidden".
     * <br>See {@link OnShowHidden#onShowHidden} for signal description.
     * <br>Field {@link #SIGNAL_ON_SHOW_HIDDEN} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onShowHidden(OnShowHidden signal) {
        return connectSignal(SIGNAL_ON_SHOW_HIDDEN, toOnShowHidden(signal));
    }

    public final static String SIGNAL_ON_UP_FOLDER = "up-folder";
    
    /**
     * Connect to signal "up-folder".
     * <br>See {@link OnUpFolder#onUpFolder} for signal description.
     * <br>Field {@link #SIGNAL_ON_UP_FOLDER} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUpFolder(OnUpFolder signal) {
        return connectSignal(SIGNAL_ON_UP_FOLDER, toOnUpFolder(signal));
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
     * Implements interface {@link FileChooser}. Call this to get access to interface functions.
     * @return {@link FileChooser}
    */
    public FileChooser asFileChooser() {
        return new FileChooser(cast());
    }

    public static long getTypeID() { 
        return JnaFileChooserWidget.INST().gtk_file_chooser_widget_get_type(); 
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
