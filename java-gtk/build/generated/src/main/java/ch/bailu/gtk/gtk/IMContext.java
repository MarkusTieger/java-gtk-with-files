/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkIMContext` defines the interface for GTK input methods.
 * <br>
 * <br>`GtkIMContext` is used by GTK text input widgets like `GtkText`
 * <br>to map from key events to Unicode character strings.
 * <br>
 * <br>An input method may consume multiple key events in sequence before finally
 * <br>outputting the composed result. This is called *preediting*, and an input
 * <br>method may provide feedback about this process by displaying the intermediate
 * <br>composition states as preedit text. To do so, the `GtkIMContext` will emit
 * <br>[signal&#64;Gtk.IMContext::preedit-start], [signal&#64;Gtk.IMContext::preedit-changed]
 * <br>and [signal&#64;Gtk.IMContext::preedit-end] signals.
 * <br>
 * <br>For instance, the built-in GTK input method [class&#64;Gtk.IMContextSimple]
 * <br>implements the input of arbitrary Unicode code points by holding down the
 * <br>&lt;kbd&gt;Control&lt;/kbd&gt; and &lt;kbd&gt;Shift&lt;/kbd&gt; keys and then typing &lt;kbd&gt;u&lt;/kbd&gt;
 * <br>followed by the hexadecimal digits of the code point. When releasing the
 * <br>&lt;kbd&gt;Control&lt;/kbd&gt; and &lt;kbd&gt;Shift&lt;/kbd&gt; keys, preediting ends and the
 * <br>character is inserted as text. For example,
 * <br>
 * <br>    Ctrl+Shift+u 2 0 A C
 * <br>
 * <br>results in the € sign.
 * <br>
 * <br>Additional input methods can be made available for use by GTK widgets as
 * <br>loadable modules. An input method module is a small shared library which
 * <br>provides a `GIOExtension` for the extension point named &quot;gtk-im-module&quot;.
 * <br>
 * <br>To connect a widget to the users preferred input method, you should use
 * <br>[class&#64;Gtk.IMMulticontext].
 * <p><a href="https://docs.gtk.org/gtk4/class.IMContext.html">https://docs.gtk.org/gtk4/class.IMContext.html</a></p>
*/
public class IMContext extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IMContext.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCommit {
        /**
         * The ::commit signal is emitted when a complete input sequence
         * <br>has been entered by the user.
         * <br>
         * <br>If the commit comes after a preediting sequence, the
         * <br>::commit signal is emitted after ::preedit-end.
         * <br>
         * <br>This can be a single character immediately after a key press or
         * <br>the final result of preediting.
         * @param str the completed character(s) entered by the user
        */
        void onCommit(@Nonnull ch.bailu.gtk.type.Str str);
    }
    
    private static com.sun.jna.Callback toOnCommit(OnCommit in) {
        return (in == null) ? null: (JnaIMContext.OnCommit) (__self, _str, __data) -> in.onCommit(new ch.bailu.gtk.type.Str(new PointerContainer(_str)));
    }

    @FunctionalInterface
    public interface OnDeleteSurrounding {
        /**
         * The ::delete-surrounding signal is emitted when the input method
         * <br>needs to delete all or part of the context surrounding the cursor.
         * @param offset the character offset from the cursor position of the text   to be deleted. A negative value indicates a position before   the cursor.
         * @param n_chars the number of characters to be deleted
         * @return %TRUE if the signal was handled.
        */
        boolean onDeleteSurrounding(int offset, int n_chars);
    }
    
    private static com.sun.jna.Callback toOnDeleteSurrounding(OnDeleteSurrounding in) {
        return (in == null) ? null: (JnaIMContext.OnDeleteSurrounding) (__self, _offset, _n_chars, __data) -> in.onDeleteSurrounding(_offset, _n_chars);
    }

    @FunctionalInterface
    public interface OnPreeditChanged {
        /**
         * The ::preedit-changed signal is emitted whenever the preedit sequence
         * <br>currently being entered has changed.
         * <br>
         * <br>It is also emitted at the end of a preedit sequence, in which case
         * <br>[method&#64;Gtk.IMContext.get_preedit_string] returns the empty string.
        */
        void onPreeditChanged();
    }
    
    private static com.sun.jna.Callback toOnPreeditChanged(OnPreeditChanged in) {
        return (in == null) ? null: (JnaIMContext.OnPreeditChanged) (__self, __data) -> in.onPreeditChanged();
    }

    @FunctionalInterface
    public interface OnPreeditEnd {
        /**
         * The ::preedit-end signal is emitted when a preediting sequence
         * <br>has been completed or canceled.
        */
        void onPreeditEnd();
    }
    
    private static com.sun.jna.Callback toOnPreeditEnd(OnPreeditEnd in) {
        return (in == null) ? null: (JnaIMContext.OnPreeditEnd) (__self, __data) -> in.onPreeditEnd();
    }

    @FunctionalInterface
    public interface OnPreeditStart {
        /**
         * The ::preedit-start signal is emitted when a new preediting sequence
         * <br>starts.
        */
        void onPreeditStart();
    }
    
    private static com.sun.jna.Callback toOnPreeditStart(OnPreeditStart in) {
        return (in == null) ? null: (JnaIMContext.OnPreeditStart) (__self, __data) -> in.onPreeditStart();
    }

    @FunctionalInterface
    public interface OnRetrieveSurrounding {
        /**
         * The ::retrieve-surrounding signal is emitted when the input method
         * <br>requires the context surrounding the cursor.
         * <br>
         * <br>The callback should set the input method surrounding context by
         * <br>calling the [method&#64;Gtk.IMContext.set_surrounding] method.
         * @return %TRUE if the signal was handled.
        */
        boolean onRetrieveSurrounding();
    }
    
    private static com.sun.jna.Callback toOnRetrieveSurrounding(OnRetrieveSurrounding in) {
        return (in == null) ? null: (JnaIMContext.OnRetrieveSurrounding) (__self, __data) -> in.onRetrieveSurrounding();
    }

    public IMContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Asks the widget that the input context is attached to delete
     * <br>characters around the cursor position by emitting the
     * <br>`::delete_surrounding` signal.
     * <br>
     * <br>Note that &#64;offset and &#64;n_chars are in characters not in bytes
     * <br>which differs from the usage other places in `GtkIMContext`.
     * <br>
     * <br>In order to use this function, you should first call
     * <br>[method&#64;Gtk.IMContext.get_surrounding] to get the current context,
     * <br>and call this function immediately afterwards to make sure that you
     * <br>know what you are deleting. You should also account for the fact
     * <br>that even if the signal was handled, the input context might not
     * <br>have deleted all the characters that were requested to be deleted.
     * <br>
     * <br>This function is used by an input method that wants to make
     * <br>subsitutions in the existing text in response to new input.
     * <br>It is not useful for applications.
     * @param offset offset from cursor position in chars;    a negative value means start before the cursor.
     * @param n_chars number of characters to delete.
     * @return %TRUE if the signal was handled.
    */
    public boolean deleteSurrounding(int offset, int n_chars)  {
        return JnaIMContext.INST().gtk_im_context_delete_surrounding(asCPointer(), offset, n_chars);
    }

    /**
     * Allow an input method to forward key press and release events
     * <br>to another input method without necessarily having a `GdkEvent`
     * <br>available.
     * @param press whether to forward a key press or release event
     * @param surface the surface the event is for
     * @param device the device that the event is for
     * @param time the timestamp for the event
     * @param keycode the keycode for the event
     * @param state modifier state for the event
     * @param group the active keyboard group for the event
     * @return %TRUE if the input method handled the key event.
    */
    public boolean filterKey(boolean press, @Nonnull ch.bailu.gtk.gdk.Surface surface, @Nonnull ch.bailu.gtk.gdk.Device device, int time, int keycode, int state, int group)  {
        return JnaIMContext.INST().gtk_im_context_filter_key(asCPointer(), press, asCPointerNotNull(surface), asCPointerNotNull(device), time, keycode, state, group);
    }

    /**
     * Allow an input method to internally handle key press and release
     * <br>events.
     * <br>
     * <br>If this function returns %TRUE, then no further processing
     * <br>should be done for this key event.
     * @param event the key event
     * @return %TRUE if the input method handled the key event.
    */
    public boolean filterKeypress(@Nonnull ch.bailu.gtk.gdk.Event event)  {
        return JnaIMContext.INST().gtk_im_context_filter_keypress(asCPointer(), asCPointerNotNull(event));
    }

    /**
     * Notify the input method that the widget to which this
     * <br>input context corresponds has gained focus.
     * <br>
     * <br>The input method may, for example, change the displayed
     * <br>feedback to reflect this change.
    */
    public void focusIn()  {
        JnaIMContext.INST().gtk_im_context_focus_in(asCPointer());
    }

    /**
     * Notify the input method that the widget to which this
     * <br>input context corresponds has lost focus.
     * <br>
     * <br>The input method may, for example, change the displayed
     * <br>feedback or reset the contexts state to reflect this change.
    */
    public void focusOut()  {
        JnaIMContext.INST().gtk_im_context_focus_out(asCPointer());
    }

    /**
     * Retrieves context around the insertion point.
     * <br>
     * <br>Input methods typically want context in order to constrain input
     * <br>text based on existing text; this is important for languages such
     * <br>as Thai where only some sequences of characters are allowed.
     * <br>
     * <br>This function is implemented by emitting the
     * <br>[signal&#64;Gtk.IMContext::retrieve-surrounding] signal on the input method;
     * <br>in response to this signal, a widget should provide as much context as
     * <br>is available, up to an entire paragraph, by calling
     * <br>[method&#64;Gtk.IMContext.set_surrounding_with_selection].
     * <br>
     * <br>Note that there is no obligation for a widget to respond to the
     * <br>`::retrieve-surrounding` signal, so input methods must be prepared to
     * <br>function without context.
     * @param text location to store a UTF-8 encoded   string of text holding context around the insertion point.   If the function returns %TRUE, then you must free the result   stored in this location with g_free().
     * @param cursor_index location to store byte index of the insertion   cursor within &#64;text.
     * @param anchor_index location to store byte index of the selection   bound within &#64;text
     * @return `TRUE` if surrounding text was provided; in this case   you must free the result stored in `text`.
    */
    public boolean getSurroundingWithSelection(@Nonnull ch.bailu.gtk.type.Strs text, @Nonnull ch.bailu.gtk.type.Int cursor_index, @Nonnull ch.bailu.gtk.type.Int anchor_index)  {
        return JnaIMContext.INST().gtk_im_context_get_surrounding_with_selection(asCPointer(), asCPointerNotNull(text), asCPointerNotNull(cursor_index), asCPointerNotNull(anchor_index));
    }

    /**
     * Notify the input method that a change such as a change in cursor
     * <br>position has been made.
     * <br>
     * <br>This will typically cause the input method to clear the preedit state.
    */
    public void reset()  {
        JnaIMContext.INST().gtk_im_context_reset(asCPointer());
    }

    /**
     * Set the client widget for the input context.
     * <br>
     * <br>This is the `GtkWidget` holding the input focus. This widget is
     * <br>used in order to correctly position status windows, and may
     * <br>also be used for purposes internal to the input method.
     * @param widget the client widget. This may be %NULL to indicate   that the previous client widget no longer exists.
    */
    public void setClientWidget(@Nullable Widget widget)  {
        JnaIMContext.INST().gtk_im_context_set_client_widget(asCPointer(), asCPointer(widget));
    }

    /**
     * Notify the input method that a change in cursor
     * <br>position has been made.
     * <br>
     * <br>The location is relative to the client widget.
     * @param area new location
    */
    public void setCursorLocation(@Nonnull ch.bailu.gtk.gdk.Rectangle area)  {
        JnaIMContext.INST().gtk_im_context_set_cursor_location(asCPointer(), asCPointerNotNull(area));
    }

    /**
     * Sets surrounding context around the insertion point and preedit
     * <br>string. This function is expected to be called in response to the
     * <br>[signal&#64;Gtk.IMContext::retrieve_surrounding] signal, and will likely
     * <br>have no effect if called at other times.
     * @param text text surrounding the insertion point, as UTF-8.   the preedit string should not be included within &#64;text
     * @param len the length of &#64;text, or -1 if &#64;text is nul-terminated
     * @param cursor_index the byte index of the insertion cursor within &#64;text
     * @param anchor_index the byte index of the selection bound within &#64;text
    */
    public void setSurroundingWithSelection(@Nonnull ch.bailu.gtk.type.Str text, int len, int cursor_index, int anchor_index)  {
        JnaIMContext.INST().gtk_im_context_set_surrounding_with_selection(asCPointer(), asCPointerNotNull(text), len, cursor_index, anchor_index);
    }

    /**
     * Sets surrounding context around the insertion point and preedit
     * <br>string. This function is expected to be called in response to the
     * <br>[signal&#64;Gtk.IMContext::retrieve_surrounding] signal, and will likely
     * <br>have no effect if called at other times.
     * @param text text surrounding the insertion point, as UTF-8.   the preedit string should not be included within &#64;text
     * @param len the length of &#64;text, or -1 if &#64;text is nul-terminated
     * @param cursor_index the byte index of the insertion cursor within &#64;text
     * @param anchor_index the byte index of the selection bound within &#64;text
    */
    public void setSurroundingWithSelection(String text, int len, int cursor_index, int anchor_index)  {
        JnaIMContext.INST().gtk_im_context_set_surrounding_with_selection(asCPointer(), text, len, cursor_index, anchor_index);
    }

    /**
     * Sets whether the IM context should use the preedit string
     * <br>to display feedback.
     * <br>
     * <br>If &#64;use_preedit is %FALSE (default is %TRUE), then the IM context
     * <br>may use some other method to display feedback, such as displaying
     * <br>it in a child of the root window.
     * @param use_preedit whether the IM context should use the preedit string.
    */
    public void setUsePreedit(boolean use_preedit)  {
        JnaIMContext.INST().gtk_im_context_set_use_preedit(asCPointer(), use_preedit);
    }

    public final static String SIGNAL_ON_COMMIT = "commit";
    
    /**
     * Connect to signal "commit".
     * <br>See {@link OnCommit#onCommit} for signal description.
     * <br>Field {@link #SIGNAL_ON_COMMIT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCommit(OnCommit signal) {
        return connectSignal(SIGNAL_ON_COMMIT, toOnCommit(signal));
    }

    public final static String SIGNAL_ON_DELETE_SURROUNDING = "delete-surrounding";
    
    /**
     * Connect to signal "delete-surrounding".
     * <br>See {@link OnDeleteSurrounding#onDeleteSurrounding} for signal description.
     * <br>Field {@link #SIGNAL_ON_DELETE_SURROUNDING} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDeleteSurrounding(OnDeleteSurrounding signal) {
        return connectSignal(SIGNAL_ON_DELETE_SURROUNDING, toOnDeleteSurrounding(signal));
    }

    public final static String SIGNAL_ON_PREEDIT_CHANGED = "preedit-changed";
    
    /**
     * Connect to signal "preedit-changed".
     * <br>See {@link OnPreeditChanged#onPreeditChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_PREEDIT_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPreeditChanged(OnPreeditChanged signal) {
        return connectSignal(SIGNAL_ON_PREEDIT_CHANGED, toOnPreeditChanged(signal));
    }

    public final static String SIGNAL_ON_PREEDIT_END = "preedit-end";
    
    /**
     * Connect to signal "preedit-end".
     * <br>See {@link OnPreeditEnd#onPreeditEnd} for signal description.
     * <br>Field {@link #SIGNAL_ON_PREEDIT_END} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPreeditEnd(OnPreeditEnd signal) {
        return connectSignal(SIGNAL_ON_PREEDIT_END, toOnPreeditEnd(signal));
    }

    public final static String SIGNAL_ON_PREEDIT_START = "preedit-start";
    
    /**
     * Connect to signal "preedit-start".
     * <br>See {@link OnPreeditStart#onPreeditStart} for signal description.
     * <br>Field {@link #SIGNAL_ON_PREEDIT_START} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPreeditStart(OnPreeditStart signal) {
        return connectSignal(SIGNAL_ON_PREEDIT_START, toOnPreeditStart(signal));
    }

    public final static String SIGNAL_ON_RETRIEVE_SURROUNDING = "retrieve-surrounding";
    
    /**
     * Connect to signal "retrieve-surrounding".
     * <br>See {@link OnRetrieveSurrounding#onRetrieveSurrounding} for signal description.
     * <br>Field {@link #SIGNAL_ON_RETRIEVE_SURROUNDING} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRetrieveSurrounding(OnRetrieveSurrounding signal) {
        return connectSignal(SIGNAL_ON_RETRIEVE_SURROUNDING, toOnRetrieveSurrounding(signal));
    }

    public static long getTypeID() { 
        return JnaIMContext.INST().gtk_im_context_get_type(); 
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

[MethodModel:java-type-not-supported:getPreeditString:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoAttrList**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]

[MethodModel:cb-deprecated:getSurrounding:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Strs:{c:char**}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]

[MethodModel:cb-deprecated:setSurrounding:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
*/
