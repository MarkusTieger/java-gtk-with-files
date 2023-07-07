/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSearchEntry` is an entry widget that has been tailored for use
 * <br>as a search entry.
 * <br>
 * <br>The main API for interacting with a `GtkSearchEntry` as entry
 * <br>is the `GtkEditable` interface.
 * <br>
 * <br>![An example GtkSearchEntry](search-entry.png)
 * <br>
 * <br>It will show an inactive symbolic “find” icon when the search
 * <br>entry is empty, and a symbolic “clear” icon when there is text.
 * <br>Clicking on the “clear” icon will empty the search entry.
 * <br>
 * <br>To make filtering appear more reactive, it is a good idea to
 * <br>not react to every change in the entry text immediately, but
 * <br>only after a short delay. To support this, `GtkSearchEntry`
 * <br>emits the [signal&#64;Gtk.SearchEntry::search-changed] signal which
 * <br>can be used instead of the [signal&#64;Gtk.Editable::changed] signal.
 * <br>
 * <br>The [signal&#64;Gtk.SearchEntry::previous-match],
 * <br>[signal&#64;Gtk.SearchEntry::next-match] and
 * <br>[signal&#64;Gtk.SearchEntry::stop-search] signals can be used to
 * <br>implement moving between search results and ending the search.
 * <br>
 * <br>Often, `GtkSearchEntry` will be fed events by means of being
 * <br>placed inside a [class&#64;Gtk.SearchBar]. If that is not the case,
 * <br>you can use [method&#64;Gtk.SearchEntry.set_key_capture_widget] to
 * <br>let it capture key input from another widget.
 * <br>
 * <br>`GtkSearchEntry` provides only minimal API and should be used with
 * <br>the [iface&#64;Gtk.Editable] API.
 * <br>
 * <br>&#35;&#35; CSS Nodes
 * <br>
 * <br>```
 * <br>entry.search
 * <br>╰── text
 * <br>```
 * <br>
 * <br>`GtkSearchEntry` has a single CSS node with name entry that carries
 * <br>a `.search` style class, and the text node is a child of that.
 * <br>
 * <br>&#35;&#35; Accessibility
 * <br>
 * <br>`GtkSearchEntry` uses the %GTK_ACCESSIBLE_ROLE_SEARCH_BOX role.
 * <p><a href="https://docs.gtk.org/gtk4/class.SearchEntry.html">https://docs.gtk.org/gtk4/class.SearchEntry.html</a></p>
*/
public class SearchEntry extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SearchEntry.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted when the entry is activated.
         * <br>
         * <br>The keybindings for this signal are all forms of the Enter key.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaSearchEntry.OnActivate) (__self, __data) -> in.onActivate();
    }

    @FunctionalInterface
    public interface OnNextMatch {
        /**
         * Emitted when the user initiates a move to the next match
         * <br>for the current search string.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>Applications should connect to it, to implement moving
         * <br>between matches.
         * <br>
         * <br>The default bindings for this signal is Ctrl-g.
        */
        void onNextMatch();
    }
    
    private static com.sun.jna.Callback toOnNextMatch(OnNextMatch in) {
        return (in == null) ? null: (JnaSearchEntry.OnNextMatch) (__self, __data) -> in.onNextMatch();
    }

    @FunctionalInterface
    public interface OnPreviousMatch {
        /**
         * Emitted when the user initiates a move to the previous match
         * <br>for the current search string.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>Applications should connect to it, to implement moving
         * <br>between matches.
         * <br>
         * <br>The default bindings for this signal is Ctrl-Shift-g.
        */
        void onPreviousMatch();
    }
    
    private static com.sun.jna.Callback toOnPreviousMatch(OnPreviousMatch in) {
        return (in == null) ? null: (JnaSearchEntry.OnPreviousMatch) (__self, __data) -> in.onPreviousMatch();
    }

    @FunctionalInterface
    public interface OnSearchChanged {
        /**
         * Emitted with a delay. The length of the delay can be
         * <br>changed with the [property&#64;Gtk.SearchEntry:search-delay]
         * <br>property.
        */
        void onSearchChanged();
    }
    
    private static com.sun.jna.Callback toOnSearchChanged(OnSearchChanged in) {
        return (in == null) ? null: (JnaSearchEntry.OnSearchChanged) (__self, __data) -> in.onSearchChanged();
    }

    @FunctionalInterface
    public interface OnSearchStarted {
        /**
         * Emitted when the user initiated a search on the entry.
        */
        void onSearchStarted();
    }
    
    private static com.sun.jna.Callback toOnSearchStarted(OnSearchStarted in) {
        return (in == null) ? null: (JnaSearchEntry.OnSearchStarted) (__self, __data) -> in.onSearchStarted();
    }

    @FunctionalInterface
    public interface OnStopSearch {
        /**
         * Emitted when the user stops a search via keyboard input.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>Applications should connect to it, to implement hiding
         * <br>the search entry in this case.
         * <br>
         * <br>The default bindings for this signal is Escape.
        */
        void onStopSearch();
    }
    
    private static com.sun.jna.Callback toOnStopSearch(OnStopSearch in) {
        return (in == null) ? null: (JnaSearchEntry.OnStopSearch) (__self, __data) -> in.onStopSearch();
    }

    public SearchEntry(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkSearchEntry`.
    */
    public SearchEntry() {
        super(cast(JnaSearchEntry.INST().gtk_search_entry_new()));
    }

    /**
     * Gets the widget that &#64;entry is capturing key events from.
     * @return The key capture widget.
    */
    public Widget getKeyCaptureWidget()  {
        return new Widget(new PointerContainer(JnaSearchEntry.INST().gtk_search_entry_get_key_capture_widget(asCPointer())));
    }

    /**
     * Get the delay to be used between the last keypress and the
     * <br>[signal&#64;Gtk.SearchEntry::search-changed] signal being emitted.
     * @return a delay in milliseconds.
    */
    public int getSearchDelay()  {
        return JnaSearchEntry.INST().gtk_search_entry_get_search_delay(asCPointer());
    }

    /**
     * Sets &#64;widget as the widget that &#64;entry will capture key
     * <br>events from.
     * <br>
     * <br>Key events are consumed by the search entry to start or
     * <br>continue a search.
     * <br>
     * <br>If the entry is part of a `GtkSearchBar`, it is preferable
     * <br>to call [method&#64;Gtk.SearchBar.set_key_capture_widget] instead,
     * <br>which will reveal the entry in addition to triggering the
     * <br>search entry.
     * <br>
     * <br>Note that despite the name of this function, the events
     * <br>are only 'captured' in the bubble phase, which means that
     * <br>editable child widgets of &#64;widget will receive text input
     * <br>before it gets captured. If that is not desired, you can
     * <br>capture and forward the events yourself with
     * <br>[method&#64;Gtk.EventControllerKey.forward].
     * @param widget a `GtkWidget`
    */
    public void setKeyCaptureWidget(@Nullable Widget widget)  {
        JnaSearchEntry.INST().gtk_search_entry_set_key_capture_widget(asCPointer(), asCPointer(widget));
    }

    /**
     * Set the delay to be used between the last keypress and the
     * <br>[signal&#64;Gtk.SearchEntry::search-changed] signal being emitted.
     * @param delay a delay in milliseconds
    */
    public void setSearchDelay(int delay)  {
        JnaSearchEntry.INST().gtk_search_entry_set_search_delay(asCPointer(), delay);
    }

    public final static String SIGNAL_ON_ACTIVATE = "activate";
    
    /**
     * Connect to signal "activate".
     * <br>See {@link OnActivate#onActivate} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivate(OnActivate signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE, toOnActivate(signal));
    }

    public final static String SIGNAL_ON_NEXT_MATCH = "next-match";
    
    /**
     * Connect to signal "next-match".
     * <br>See {@link OnNextMatch#onNextMatch} for signal description.
     * <br>Field {@link #SIGNAL_ON_NEXT_MATCH} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onNextMatch(OnNextMatch signal) {
        return connectSignal(SIGNAL_ON_NEXT_MATCH, toOnNextMatch(signal));
    }

    public final static String SIGNAL_ON_PREVIOUS_MATCH = "previous-match";
    
    /**
     * Connect to signal "previous-match".
     * <br>See {@link OnPreviousMatch#onPreviousMatch} for signal description.
     * <br>Field {@link #SIGNAL_ON_PREVIOUS_MATCH} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPreviousMatch(OnPreviousMatch signal) {
        return connectSignal(SIGNAL_ON_PREVIOUS_MATCH, toOnPreviousMatch(signal));
    }

    public final static String SIGNAL_ON_SEARCH_CHANGED = "search-changed";
    
    /**
     * Connect to signal "search-changed".
     * <br>See {@link OnSearchChanged#onSearchChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_SEARCH_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSearchChanged(OnSearchChanged signal) {
        return connectSignal(SIGNAL_ON_SEARCH_CHANGED, toOnSearchChanged(signal));
    }

    public final static String SIGNAL_ON_SEARCH_STARTED = "search-started";
    
    /**
     * Connect to signal "search-started".
     * <br>See {@link OnSearchStarted#onSearchStarted} for signal description.
     * <br>Field {@link #SIGNAL_ON_SEARCH_STARTED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSearchStarted(OnSearchStarted signal) {
        return connectSignal(SIGNAL_ON_SEARCH_STARTED, toOnSearchStarted(signal));
    }

    public final static String SIGNAL_ON_STOP_SEARCH = "stop-search";
    
    /**
     * Connect to signal "stop-search".
     * <br>See {@link OnStopSearch#onStopSearch} for signal description.
     * <br>Field {@link #SIGNAL_ON_STOP_SEARCH} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onStopSearch(OnStopSearch signal) {
        return connectSignal(SIGNAL_ON_STOP_SEARCH, toOnStopSearch(signal));
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
     * Implements interface {@link Editable}. Call this to get access to interface functions.
     * @return {@link Editable}
    */
    public Editable asEditable() {
        return new Editable(cast());
    }

    public static long getTypeID() { 
        return JnaSearchEntry.INST().gtk_search_entry_get_type(); 
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
