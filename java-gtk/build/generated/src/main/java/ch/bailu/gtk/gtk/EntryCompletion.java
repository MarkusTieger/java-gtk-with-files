/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkEntryCompletion` is an auxiliary object to provide completion functionality
 * <br>for `GtkEntry`.
 * <br>
 * <br>It implements the [iface&#64;Gtk.CellLayout] interface, to allow the user
 * <br>to add extra cells to the `GtkTreeView` with completion matches.
 * <br>
 * <br>“Completion functionality” means that when the user modifies the text
 * <br>in the entry, `GtkEntryCompletion` checks which rows in the model match
 * <br>the current content of the entry, and displays a list of matches.
 * <br>By default, the matching is done by comparing the entry text
 * <br>case-insensitively against the text column of the model (see
 * <br>[method&#64;Gtk.EntryCompletion.set_text_column]), but this can be overridden
 * <br>with a custom match function (see [method&#64;Gtk.EntryCompletion.set_match_func]).
 * <br>
 * <br>When the user selects a completion, the content of the entry is
 * <br>updated. By default, the content of the entry is replaced by the
 * <br>text column of the model, but this can be overridden by connecting
 * <br>to the [signal&#64;Gtk.EntryCompletion::match-selected] signal and updating the
 * <br>entry in the signal handler. Note that you should return %TRUE from
 * <br>the signal handler to suppress the default behaviour.
 * <br>
 * <br>To add completion functionality to an entry, use
 * <br>[method&#64;Gtk.Entry.set_completion].
 * <br>
 * <br>`GtkEntryCompletion` uses a [class&#64;Gtk.TreeModelFilter] model to
 * <br>represent the subset of the entire model that is currently matching.
 * <br>While the `GtkEntryCompletion` signals
 * <br>[signal&#64;Gtk.EntryCompletion::match-selected] and
 * <br>[signal&#64;Gtk.EntryCompletion::cursor-on-match] take the original model
 * <br>and an iter pointing to that model as arguments, other callbacks and
 * <br>signals (such as `GtkCellLayoutDataFunc` or
 * <br>[signal&#64;Gtk.CellArea::apply-attributes)]
 * <br>will generally take the filter model as argument. As long as you are
 * <br>only calling [method&#64;Gtk.TreeModel.get], this will make no difference to
 * <br>you. If for some reason, you need the original model, use
 * <br>[method&#64;Gtk.TreeModelFilter.get_model]. Don’t forget to use
 * <br>[method&#64;Gtk.TreeModelFilter.convert_iter_to_child_iter] to obtain a
 * <br>matching iter.
 * <p><a href="https://docs.gtk.org/gtk4/class.EntryCompletion.html">https://docs.gtk.org/gtk4/class.EntryCompletion.html</a></p>
*/
public class EntryCompletion extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EntryCompletion.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnEntryCompletionMatchFunc {
        /**
         * A function which decides whether the row indicated by &#64;iter matches
         * <br>a given &#64;key, and should be displayed as a possible completion for &#64;key.
         * <br>
         * <br>Note that &#64;key is normalized and case-folded (see g_utf8_normalize()
         * <br>and g_utf8_casefold()). If this is not appropriate, match functions
         * <br>have access to the unmodified key via
         * <br>`gtk_editable_get_text (GTK_EDITABLE (gtk_entry_completion_get_entry ()))`.
         * @param completion the `GtkEntryCompletion`
         * @param key the string to match, normalized and case-folded
         * @param iter a `GtkTreeIter` indicating the row to match
         * @param user_data user data given to gtk_entry_completion_set_match_func()
         * @return %TRUE if &#64;iter should be displayed as a possible completion   for &#64;key
        */
        boolean onEntryCompletionMatchFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull EntryCompletion completion, @Nonnull ch.bailu.gtk.type.Str key, @Nonnull TreeIter iter, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaEntryCompletion.OnEntryCompletionMatchFunc toOnEntryCompletionMatchFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnEntryCompletionMatchFunc in) {
        JnaEntryCompletion.OnEntryCompletionMatchFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_completion, _key, _iter, _user_data) -> in.onEntryCompletionMatchFunc(__callback, new EntryCompletion(new PointerContainer(_completion)), new ch.bailu.gtk.type.Str(new PointerContainer(_key)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaEntryCompletion.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaEntryCompletion.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCursorOnMatch {
        /**
         * Emitted when a match from the cursor is on a match of the list.
         * <br>
         * <br>The default behaviour is to replace the contents
         * <br>of the entry with the contents of the text column in the row
         * <br>pointed to by &#64;iter.
         * <br>
         * <br>Note that &#64;model is the model that was passed to
         * <br>[method&#64;Gtk.EntryCompletion.set_model].
         * @param model the `GtkTreeModel` containing the matches
         * @param iter a `GtkTreeIter` positioned at the selected match
         * @return %TRUE if the signal has been handled
        */
        boolean onCursorOnMatch(@Nonnull TreeModel model, @Nonnull TreeIter iter);
    }
    
    private static com.sun.jna.Callback toOnCursorOnMatch(OnCursorOnMatch in) {
        return (in == null) ? null: (JnaEntryCompletion.OnCursorOnMatch) (__self, _model, _iter, __data) -> in.onCursorOnMatch(new TreeModel(new PointerContainer(_model)), new TreeIter(new PointerContainer(_iter)));
    }

    @FunctionalInterface
    public interface OnInsertPrefix {
        /**
         * Emitted when the inline autocompletion is triggered.
         * <br>
         * <br>The default behaviour is to make the entry display the
         * <br>whole prefix and select the newly inserted part.
         * <br>
         * <br>Applications may connect to this signal in order to insert only a
         * <br>smaller part of the &#64;prefix into the entry - e.g. the entry used in
         * <br>the `GtkFileChooser` inserts only the part of the prefix up to the
         * <br>next '/'.
         * @param prefix the common prefix of all possible completions
         * @return %TRUE if the signal has been handled
        */
        boolean onInsertPrefix(@Nonnull ch.bailu.gtk.type.Str prefix);
    }
    
    private static com.sun.jna.Callback toOnInsertPrefix(OnInsertPrefix in) {
        return (in == null) ? null: (JnaEntryCompletion.OnInsertPrefix) (__self, _prefix, __data) -> in.onInsertPrefix(new ch.bailu.gtk.type.Str(new PointerContainer(_prefix)));
    }

    @FunctionalInterface
    public interface OnMatchSelected {
        /**
         * Emitted when a match from the list is selected.
         * <br>
         * <br>The default behaviour is to replace the contents of the
         * <br>entry with the contents of the text column in the row
         * <br>pointed to by &#64;iter.
         * <br>
         * <br>Note that &#64;model is the model that was passed to
         * <br>[method&#64;Gtk.EntryCompletion.set_model].
         * @param model the `GtkTreeModel` containing the matches
         * @param iter a `GtkTreeIter` positioned at the selected match
         * @return %TRUE if the signal has been handled
        */
        boolean onMatchSelected(@Nonnull TreeModel model, @Nonnull TreeIter iter);
    }
    
    private static com.sun.jna.Callback toOnMatchSelected(OnMatchSelected in) {
        return (in == null) ? null: (JnaEntryCompletion.OnMatchSelected) (__self, _model, _iter, __data) -> in.onMatchSelected(new TreeModel(new PointerContainer(_model)), new TreeIter(new PointerContainer(_iter)));
    }

    @FunctionalInterface
    public interface OnNoMatches {
        /**
         * Emitted when the filter model has zero
         * <br>number of rows in completion_complete method.
         * <br>
         * <br>In other words when `GtkEntryCompletion` is out of suggestions.
        */
        void onNoMatches();
    }
    
    private static com.sun.jna.Callback toOnNoMatches(OnNoMatches in) {
        return (in == null) ? null: (JnaEntryCompletion.OnNoMatches) (__self, __data) -> in.onNoMatches();
    }

    public EntryCompletion(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkEntryCompletion` object using the
     * <br>specified &#64;area.
     * <br>
     * <br>The `GtkCellArea` is used to layout cells in the underlying
     * <br>`GtkTreeViewColumn` for the drop-down menu.
     * @param area the `GtkCellArea` used to layout cells
     * @return A newly created `GtkEntryCompletion` object
    */
    public static EntryCompletion newWithAreaEntryCompletion(@Nonnull CellArea area)  {
        PointerContainer __self = cast(JnaEntryCompletion.INST().gtk_entry_completion_new_with_area(asCPointerNotNull(area)));
        if (__self.isNull()) {
            throw new NullPointerException("EntryCompletion:newWithArea");
        }
        return new EntryCompletion(__self);
    }        
    

    /**
     * Creates a new `GtkEntryCompletion` object.
    */
    public EntryCompletion() {
        super(cast(JnaEntryCompletion.INST().gtk_entry_completion_new()));
    }

    /**
     * Requests a completion operation, or in other words a refiltering of the
     * <br>current list with completions, using the current key.
     * <br>
     * <br>The completion list view will be updated accordingly.
    */
    public void complete()  {
        JnaEntryCompletion.INST().gtk_entry_completion_complete(asCPointer());
    }

    /**
     * Computes the common prefix that is shared by all rows in &#64;completion
     * <br>that start with &#64;key.
     * <br>
     * <br>If no row matches &#64;key, %NULL will be returned.
     * <br>Note that a text column must have been set for this function to work,
     * <br>see [method&#64;Gtk.EntryCompletion.set_text_column] for details.
     * @param key The text to complete for
     * @return The common prefix all rows   starting with &#64;key
    */
    public ch.bailu.gtk.type.Str computePrefix(@Nonnull ch.bailu.gtk.type.Str key)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaEntryCompletion.INST().gtk_entry_completion_compute_prefix(asCPointer(), asCPointerNotNull(key))));
    }

    /**
     * Computes the common prefix that is shared by all rows in &#64;completion
     * <br>that start with &#64;key.
     * <br>
     * <br>If no row matches &#64;key, %NULL will be returned.
     * <br>Note that a text column must have been set for this function to work,
     * <br>see [method&#64;Gtk.EntryCompletion.set_text_column] for details.
     * @param key The text to complete for
     * @return The common prefix all rows   starting with &#64;key
    */
    public ch.bailu.gtk.type.Str computePrefix(String key)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaEntryCompletion.INST().gtk_entry_completion_compute_prefix(asCPointer(), key)));
    }

    /**
     * Get the original text entered by the user that triggered
     * <br>the completion or %NULL if there’s no completion ongoing.
     * @return the prefix for the current completion
    */
    public ch.bailu.gtk.type.Str getCompletionPrefix()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaEntryCompletion.INST().gtk_entry_completion_get_completion_prefix(asCPointer())));
    }

    /**
     * Gets the entry &#64;completion has been attached to.
     * @return The entry &#64;completion has been attached to
    */
    public Widget getEntry()  {
        return new Widget(new PointerContainer(JnaEntryCompletion.INST().gtk_entry_completion_get_entry(asCPointer())));
    }

    /**
     * Returns whether the common prefix of the possible completions should
     * <br>be automatically inserted in the entry.
     * @return %TRUE if inline completion is turned on
    */
    public boolean getInlineCompletion()  {
        return JnaEntryCompletion.INST().gtk_entry_completion_get_inline_completion(asCPointer());
    }

    /**
     * Returns %TRUE if inline-selection mode is turned on.
     * @return %TRUE if inline-selection mode is on
    */
    public boolean getInlineSelection()  {
        return JnaEntryCompletion.INST().gtk_entry_completion_get_inline_selection(asCPointer());
    }

    /**
     * Returns the minimum key length as set for &#64;completion.
     * @return The currently used minimum key length
    */
    public int getMinimumKeyLength()  {
        return JnaEntryCompletion.INST().gtk_entry_completion_get_minimum_key_length(asCPointer());
    }

    /**
     * Returns the model the `GtkEntryCompletion` is using as data source.
     * <br>
     * <br>Returns %NULL if the model is unset.
     * @return A `GtkTreeModel`
    */
    public TreeModel getModel()  {
        return new TreeModel(new PointerContainer(JnaEntryCompletion.INST().gtk_entry_completion_get_model(asCPointer())));
    }

    /**
     * Returns whether the completions should be presented in a popup window.
     * @return %TRUE if popup completion is turned on
    */
    public boolean getPopupCompletion()  {
        return JnaEntryCompletion.INST().gtk_entry_completion_get_popup_completion(asCPointer());
    }

    /**
     * Returns whether the completion popup window will be resized to the
     * <br>width of the entry.
     * @return %TRUE if the popup window will be resized to the width of   the entry
    */
    public boolean getPopupSetWidth()  {
        return JnaEntryCompletion.INST().gtk_entry_completion_get_popup_set_width(asCPointer());
    }

    /**
     * Returns whether the completion popup window will appear even if there is
     * <br>only a single match.
     * @return %TRUE if the popup window will appear regardless of the    number of matches
    */
    public boolean getPopupSingleMatch()  {
        return JnaEntryCompletion.INST().gtk_entry_completion_get_popup_single_match(asCPointer());
    }

    /**
     * Returns the column in the model of &#64;completion to get strings from.
     * @return the column containing the strings
    */
    public int getTextColumn()  {
        return JnaEntryCompletion.INST().gtk_entry_completion_get_text_column(asCPointer());
    }

    /**
     * Requests a prefix insertion.
    */
    public void insertPrefix()  {
        JnaEntryCompletion.INST().gtk_entry_completion_insert_prefix(asCPointer());
    }

    /**
     * Sets whether the common prefix of the possible completions should
     * <br>be automatically inserted in the entry.
     * @param inline_completion %TRUE to do inline completion
    */
    public void setInlineCompletion(boolean inline_completion)  {
        JnaEntryCompletion.INST().gtk_entry_completion_set_inline_completion(asCPointer(), inline_completion);
    }

    /**
     * Sets whether it is possible to cycle through the possible completions
     * <br>inside the entry.
     * @param inline_selection %TRUE to do inline selection
    */
    public void setInlineSelection(boolean inline_selection)  {
        JnaEntryCompletion.INST().gtk_entry_completion_set_inline_selection(asCPointer(), inline_selection);
    }

    /**
     * Sets the match function for &#64;completion to be &#64;func.
     * <br>
     * <br>The match function is used to determine if a row should or
     * <br>should not be in the completion list.
     * @param func the `GtkEntryCompletion`MatchFunc to use
     * @param func_data user data for &#64;func
     * @param func_notify destroy notify for &#64;func_data.
    */
    public void setMatchFunc(OnEntryCompletionMatchFunc func, @Nullable ch.bailu.gtk.type.Pointer func_data, OnDestroyNotify func_notify)  {
        JnaEntryCompletion.INST().gtk_entry_completion_set_match_func(asCPointer(), toOnEntryCompletionMatchFunc(this, "setMatchFunc", func), asCPointer(func_data), toOnDestroyNotify(this, "setMatchFunc", func_notify));
    }

    /**
     * Requires the length of the search key for &#64;completion to be at least
     * <br>&#64;length.
     * <br>
     * <br>This is useful for long lists, where completing using a small
     * <br>key takes a lot of time and will come up with meaningless results anyway
     * <br>(ie, a too large dataset).
     * @param length the minimum length of the key in order to start completing
    */
    public void setMinimumKeyLength(int length)  {
        JnaEntryCompletion.INST().gtk_entry_completion_set_minimum_key_length(asCPointer(), length);
    }

    /**
     * Sets the model for a `GtkEntryCompletion`.
     * <br>
     * <br>If &#64;completion already has a model set, it will remove it
     * <br>before setting the new model. If model is %NULL, then it
     * <br>will unset the model.
     * @param model the `GtkTreeModel`
    */
    public void setModel(@Nullable TreeModel model)  {
        JnaEntryCompletion.INST().gtk_entry_completion_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Sets whether the completions should be presented in a popup window.
     * @param popup_completion %TRUE to do popup completion
    */
    public void setPopupCompletion(boolean popup_completion)  {
        JnaEntryCompletion.INST().gtk_entry_completion_set_popup_completion(asCPointer(), popup_completion);
    }

    /**
     * Sets whether the completion popup window will be resized to be the same
     * <br>width as the entry.
     * @param popup_set_width %TRUE to make the width of the popup the same as the entry
    */
    public void setPopupSetWidth(boolean popup_set_width)  {
        JnaEntryCompletion.INST().gtk_entry_completion_set_popup_set_width(asCPointer(), popup_set_width);
    }

    /**
     * Sets whether the completion popup window will appear even if there is
     * <br>only a single match.
     * <br>
     * <br>You may want to set this to %FALSE if you
     * <br>are using [property&#64;Gtk.EntryCompletion:inline-completion].
     * @param popup_single_match %TRUE if the popup should appear even for a single match
    */
    public void setPopupSingleMatch(boolean popup_single_match)  {
        JnaEntryCompletion.INST().gtk_entry_completion_set_popup_single_match(asCPointer(), popup_single_match);
    }

    /**
     * Convenience function for setting up the most used case of this code: a
     * <br>completion list with just strings.
     * <br>
     * <br>This function will set up &#64;completion
     * <br>to have a list displaying all (and just) strings in the completion list,
     * <br>and to get those strings from &#64;column in the model of &#64;completion.
     * <br>
     * <br>This functions creates and adds a `GtkCellRendererText` for the selected
     * <br>column. If you need to set the text column, but don't want the cell
     * <br>renderer, use g_object_set() to set the
     * <br>[property&#64;Gtk.EntryCompletion:text-column] property directly.
     * @param column the column in the model of &#64;completion to get strings from
    */
    public void setTextColumn(int column)  {
        JnaEntryCompletion.INST().gtk_entry_completion_set_text_column(asCPointer(), column);
    }

    public final static String SIGNAL_ON_CURSOR_ON_MATCH = "cursor-on-match";
    
    /**
     * Connect to signal "cursor-on-match".
     * <br>See {@link OnCursorOnMatch#onCursorOnMatch} for signal description.
     * <br>Field {@link #SIGNAL_ON_CURSOR_ON_MATCH} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCursorOnMatch(OnCursorOnMatch signal) {
        return connectSignal(SIGNAL_ON_CURSOR_ON_MATCH, toOnCursorOnMatch(signal));
    }

    public final static String SIGNAL_ON_INSERT_PREFIX = "insert-prefix";
    
    /**
     * Connect to signal "insert-prefix".
     * <br>See {@link OnInsertPrefix#onInsertPrefix} for signal description.
     * <br>Field {@link #SIGNAL_ON_INSERT_PREFIX} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInsertPrefix(OnInsertPrefix signal) {
        return connectSignal(SIGNAL_ON_INSERT_PREFIX, toOnInsertPrefix(signal));
    }

    public final static String SIGNAL_ON_MATCH_SELECTED = "match-selected";
    
    /**
     * Connect to signal "match-selected".
     * <br>See {@link OnMatchSelected#onMatchSelected} for signal description.
     * <br>Field {@link #SIGNAL_ON_MATCH_SELECTED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMatchSelected(OnMatchSelected signal) {
        return connectSignal(SIGNAL_ON_MATCH_SELECTED, toOnMatchSelected(signal));
    }

    public final static String SIGNAL_ON_NO_MATCHES = "no-matches";
    
    /**
     * Connect to signal "no-matches".
     * <br>See {@link OnNoMatches#onNoMatches} for signal description.
     * <br>Field {@link #SIGNAL_ON_NO_MATCHES} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onNoMatches(OnNoMatches signal) {
        return connectSignal(SIGNAL_ON_NO_MATCHES, toOnNoMatches(signal));
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link CellLayout}. Call this to get access to interface functions.
     * @return {@link CellLayout}
    */
    public CellLayout asCellLayout() {
        return new CellLayout(cast());
    }

    public static long getTypeID() { 
        return JnaEntryCompletion.INST().gtk_entry_completion_get_type(); 
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
