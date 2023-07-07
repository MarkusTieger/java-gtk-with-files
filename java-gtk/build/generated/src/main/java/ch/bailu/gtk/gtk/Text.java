/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkText` widget is a single-line text entry widget.
 * <br>
 * <br>`GtkText` is the common implementation of single-line text editing
 * <br>that is shared between `GtkEntry`, `GtkPasswordEntry`, `GtkSpinButton`
 * <br>and other widgets. In all of these, `GtkText` is used as the delegate
 * <br>for the [iface&#64;Gtk.Editable] implementation.
 * <br>
 * <br>A fairly large set of key bindings are supported by default. If the
 * <br>entered text is longer than the allocation of the widget, the widget
 * <br>will scroll so that the cursor position is visible.
 * <br>
 * <br>When using an entry for passwords and other sensitive information,
 * <br>it can be put into “password mode” using [method&#64;Gtk.Text.set_visibility].
 * <br>In this mode, entered text is displayed using a “invisible” character.
 * <br>By default, GTK picks the best invisible character that is available
 * <br>in the current font, but it can be changed with
 * <br>[method&#64;Gtk.Text.set_invisible_char].
 * <br>
 * <br>If you are looking to add icons or progress display in an entry, look
 * <br>at `GtkEntry`. There other alternatives for more specialized use cases,
 * <br>such as `GtkSearchEntry`.
 * <br>
 * <br>If you need multi-line editable text, look at `GtkTextView`.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>text[.read-only]
 * <br>├── placeholder
 * <br>├── undershoot.left
 * <br>├── undershoot.right
 * <br>├── [selection]
 * <br>├── [block-cursor]
 * <br>╰── [window.popup]
 * <br>```
 * <br>
 * <br>`GtkText` has a main node with the name text. Depending on the properties
 * <br>of the widget, the .read-only style class may appear.
 * <br>
 * <br>When the entry has a selection, it adds a subnode with the name selection.
 * <br>
 * <br>When the entry is in overwrite mode, it adds a subnode with the name
 * <br>block-cursor that determines how the block cursor is drawn.
 * <br>
 * <br>The CSS node for a context menu is added as a subnode below text as well.
 * <br>
 * <br>The undershoot nodes are used to draw the underflow indication when content
 * <br>is scrolled out of view. These nodes get the .left and .right style classes
 * <br>added depending on where the indication is drawn.
 * <br>
 * <br>When touch is used and touch selection handles are shown, they are using
 * <br>CSS nodes with name cursor-handle. They get the .top or .bottom style class
 * <br>depending on where they are shown in relation to the selection. If there is
 * <br>just a single handle for the text cursor, it gets the style class
 * <br>.insertion-cursor.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkText` uses the %GTK_ACCESSIBLE_ROLE_NONE role, which causes it to be
 * <br>skipped for accessibility. This is because `GtkText` is expected to be used
 * <br>as a delegate for a `GtkEditable` implementation that will be represented
 * <br>to accessibility.
 * <p><a href="https://docs.gtk.org/gtk4/class.Text.html">https://docs.gtk.org/gtk4/class.Text.html</a></p>
*/
public class Text extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Text.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted when the user hits the Enter key.
         * <br>
         * <br>The default bindings for this signal are all forms
         * <br>of the &lt;kbd&gt;Enter&lt;/kbd&gt; key.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaText.OnActivate) (__self, __data) -> in.onActivate();
    }

    @FunctionalInterface
    public interface OnBackspace {
        /**
         * Emitted when the user asks for it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are
         * <br>&lt;kbd&gt;Backspace&lt;/kbd&gt; and &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Backspace&lt;/kbd&gt;.
        */
        void onBackspace();
    }
    
    private static com.sun.jna.Callback toOnBackspace(OnBackspace in) {
        return (in == null) ? null: (JnaText.OnBackspace) (__self, __data) -> in.onBackspace();
    }

    @FunctionalInterface
    public interface OnCopyClipboard {
        /**
         * Emitted to copy the selection to the clipboard.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;c&lt;/kbd&gt; and
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Insert&lt;/kbd&gt;.
        */
        void onCopyClipboard();
    }
    
    private static com.sun.jna.Callback toOnCopyClipboard(OnCopyClipboard in) {
        return (in == null) ? null: (JnaText.OnCopyClipboard) (__self, __data) -> in.onCopyClipboard();
    }

    @FunctionalInterface
    public interface OnCutClipboard {
        /**
         * Emitted to cut the selection to the clipboard.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;x&lt;/kbd&gt; and
         * <br>&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Delete&lt;/kbd&gt;.
        */
        void onCutClipboard();
    }
    
    private static com.sun.jna.Callback toOnCutClipboard(OnCutClipboard in) {
        return (in == null) ? null: (JnaText.OnCutClipboard) (__self, __data) -> in.onCutClipboard();
    }

    @FunctionalInterface
    public interface OnDeleteFromCursor {
        /**
         * Emitted when the user initiates a text deletion.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>If the &#64;type is %GTK_DELETE_CHARS, GTK deletes the selection
         * <br>if there is one, otherwise it deletes the requested number
         * <br>of characters.
         * <br>
         * <br>The default bindings for this signal are &lt;kbd&gt;Delete&lt;/kbd&gt;
         * <br>for deleting a character and &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Delete&lt;/kbd&gt;
         * <br>for deleting a word.
         * @param type the granularity of the deletion, as a `GtkDeleteType`
         * @param count the number of &#64;type units to delete
        */
        void onDeleteFromCursor(int type, int count);
    }
    
    private static com.sun.jna.Callback toOnDeleteFromCursor(OnDeleteFromCursor in) {
        return (in == null) ? null: (JnaText.OnDeleteFromCursor) (__self, _type, _count, __data) -> in.onDeleteFromCursor(_type, _count);
    }

    @FunctionalInterface
    public interface OnInsertAtCursor {
        /**
         * Emitted when the user initiates the insertion of a
         * <br>fixed string at the cursor.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This signal has no default bindings.
         * @param string the string to insert
        */
        void onInsertAtCursor(@Nonnull ch.bailu.gtk.type.Str string);
    }
    
    private static com.sun.jna.Callback toOnInsertAtCursor(OnInsertAtCursor in) {
        return (in == null) ? null: (JnaText.OnInsertAtCursor) (__self, _string, __data) -> in.onInsertAtCursor(new ch.bailu.gtk.type.Str(new PointerContainer(_string)));
    }

    @FunctionalInterface
    public interface OnInsertEmoji {
        /**
         * Emitted to present the Emoji chooser for the widget.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;.&lt;/kbd&gt; and
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;;&lt;/kbd&gt;
        */
        void onInsertEmoji();
    }
    
    private static com.sun.jna.Callback toOnInsertEmoji(OnInsertEmoji in) {
        return (in == null) ? null: (JnaText.OnInsertEmoji) (__self, __data) -> in.onInsertEmoji();
    }

    @FunctionalInterface
    public interface OnMoveCursor {
        /**
         * Emitted when the user initiates a cursor movement.
         * <br>
         * <br>If the cursor is not visible in &#64;self, this signal causes
         * <br>the viewport to be moved instead.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>Applications should not connect to it, but may emit it with
         * <br>g_signal_emit_by_name() if they need to control the cursor
         * <br>programmatically.
         * <br>
         * <br>The default bindings for this signal come in two variants,
         * <br>the variant with the &lt;kbd&gt;Shift&lt;/kbd&gt; modifier extends the
         * <br>selection, the variant without it does not.
         * <br>There are too many key combinations to list them all here.
         * <br>
         * <br>- &lt;kbd&gt;←&lt;/kbd&gt;, &lt;kbd&gt;→&lt;/kbd&gt;, &lt;kbd&gt;↑&lt;/kbd&gt;, &lt;kbd&gt;↓&lt;/kbd&gt;
         * <br>  move by individual characters/lines
         * <br>- &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;→&lt;/kbd&gt;, etc. move by words/paragraphs
         * <br>- &lt;kbd&gt;Home&lt;/kbd&gt;, &lt;kbd&gt;End&lt;/kbd&gt; move to the ends of the buffer
         * @param step the granularity of the move, as a `GtkMovementStep`
         * @param count the number of &#64;step units to move
         * @param extend %TRUE if the move should extend the selection
        */
        void onMoveCursor(int step, int count, boolean extend);
    }
    
    private static com.sun.jna.Callback toOnMoveCursor(OnMoveCursor in) {
        return (in == null) ? null: (JnaText.OnMoveCursor) (__self, _step, _count, _extend, __data) -> in.onMoveCursor(_step, _count, _extend);
    }

    @FunctionalInterface
    public interface OnPasteClipboard {
        /**
         * Emitted to paste the contents of the clipboard.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;v&lt;/kbd&gt; and &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Insert&lt;/kbd&gt;.
        */
        void onPasteClipboard();
    }
    
    private static com.sun.jna.Callback toOnPasteClipboard(OnPasteClipboard in) {
        return (in == null) ? null: (JnaText.OnPasteClipboard) (__self, __data) -> in.onPasteClipboard();
    }

    @FunctionalInterface
    public interface OnPreeditChanged {
        /**
         * Emitted when the preedit text changes.
         * <br>
         * <br>If an input method is used, the typed text will not immediately
         * <br>be committed to the buffer. So if you are interested in the text,
         * <br>connect to this signal.
         * @param preedit the current preedit string
        */
        void onPreeditChanged(@Nonnull ch.bailu.gtk.type.Str preedit);
    }
    
    private static com.sun.jna.Callback toOnPreeditChanged(OnPreeditChanged in) {
        return (in == null) ? null: (JnaText.OnPreeditChanged) (__self, _preedit, __data) -> in.onPreeditChanged(new ch.bailu.gtk.type.Str(new PointerContainer(_preedit)));
    }

    @FunctionalInterface
    public interface OnToggleOverwrite {
        /**
         * Emitted to toggle the overwrite mode of the `GtkText`.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal is &lt;kbd&gt;Insert&lt;/kbd&gt;.
        */
        void onToggleOverwrite();
    }
    
    private static com.sun.jna.Callback toOnToggleOverwrite(OnToggleOverwrite in) {
        return (in == null) ? null: (JnaText.OnToggleOverwrite) (__self, __data) -> in.onToggleOverwrite();
    }

    public Text(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkText` with the specified text buffer.
     * @param buffer The buffer to use for the new `GtkText`.
     * @return a new `GtkText`
    */
    public static Text newWithBufferText(@Nonnull EntryBuffer buffer)  {
        PointerContainer __self = cast(JnaText.INST().gtk_text_new_with_buffer(asCPointerNotNull(buffer)));
        if (__self.isNull()) {
            throw new NullPointerException("Text:newWithBuffer");
        }
        return new Text(__self);
    }        
    

    /**
     * Creates a new `GtkText`.
    */
    public Text() {
        super(cast(JnaText.INST().gtk_text_new()));
    }

    /**
     * Determine the positions of the strong and weak cursors if the
     * <br>insertion point in the layout is at &#64;position.
     * <br>
     * <br>The position of each cursor is stored as a zero-width rectangle.
     * <br>The strong cursor location is the location where characters of
     * <br>the directionality equal to the base direction are inserted.
     * <br>The weak cursor location is the location where characters of
     * <br>the directionality opposite to the base direction are inserted.
     * <br>
     * <br>The rectangle positions are in widget coordinates.
     * @param position the character position
     * @param strong location to store the strong cursor position
     * @param weak location to store the weak cursor position
    */
    public void computeCursorExtents(long position, @Nullable ch.bailu.gtk.graphene.Rect strong, @Nullable ch.bailu.gtk.graphene.Rect weak)  {
        JnaText.INST().gtk_text_compute_cursor_extents(asCPointer(), position, asCPointer(strong), asCPointer(weak));
    }

    /**
     * Returns whether pressing Enter will activate
     * <br>the default widget for the window containing &#64;self.
     * <br>
     * <br>See [method&#64;Gtk.Text.set_activates_default].
     * @return %TRUE if the `GtkText` will activate the default widget
    */
    public boolean getActivatesDefault()  {
        return JnaText.INST().gtk_text_get_activates_default(asCPointer());
    }

    /**
     * Gets the attribute list that was set on the `GtkText`.
     * <br>
     * <br>See [method&#64;Gtk.Text.set_attributes].
     * @return the attribute list
    */
    public ch.bailu.gtk.pango.AttrList getAttributes()  {
        return new ch.bailu.gtk.pango.AttrList(new PointerContainer(JnaText.INST().gtk_text_get_attributes(asCPointer())));
    }

    /**
     * Get the `GtkEntryBuffer` object which holds the text for
     * <br>this widget.
     * @return A `GtkEntryBuffer` object.
    */
    public EntryBuffer getBuffer()  {
        return new EntryBuffer(new PointerContainer(JnaText.INST().gtk_text_get_buffer(asCPointer())));
    }

    /**
     * Returns whether Emoji completion is enabled for this
     * <br>`GtkText` widget.
     * @return %TRUE if Emoji completion is enabled
    */
    public boolean getEnableEmojiCompletion()  {
        return JnaText.INST().gtk_text_get_enable_emoji_completion(asCPointer());
    }

    /**
     * Gets the menu model for extra items in the context menu.
     * <br>
     * <br>See [method&#64;Gtk.Text.set_extra_menu].
     * @return the menu model
    */
    public ch.bailu.gtk.gio.MenuModel getExtraMenu()  {
        return new ch.bailu.gtk.gio.MenuModel(new PointerContainer(JnaText.INST().gtk_text_get_extra_menu(asCPointer())));
    }

    /**
     * Gets the input hints of the `GtkText`.
     * @return 
    */
    public int getInputHints()  {
        return JnaText.INST().gtk_text_get_input_hints(asCPointer());
    }

    /**
     * Gets the input purpose of the `GtkText`.
     * @return 
    */
    public int getInputPurpose()  {
        return JnaText.INST().gtk_text_get_input_purpose(asCPointer());
    }

    /**
     * Retrieves the character displayed when visibility is set to false.
     * <br>
     * <br>Note that GTK does not compute this value unless it needs it,
     * <br>so the value returned by this function is not very useful unless
     * <br>it has been explicitly set with [method&#64;Gtk.Text.set_invisible_char].
     * @return the current invisible char, or 0, if &#64;text does not   show invisible text at all.
    */
    public byte getInvisibleChar()  {
        return JnaText.INST().gtk_text_get_invisible_char(asCPointer());
    }

    /**
     * Retrieves the maximum allowed length of the text in &#64;self.
     * <br>
     * <br>See [method&#64;Gtk.Text.set_max_length].
     * <br>
     * <br>This is equivalent to getting &#64;self's `GtkEntryBuffer` and
     * <br>calling [method&#64;Gtk.EntryBuffer.get_max_length] on it.
     * @return the maximum allowed number of characters   in `GtkText`, or 0 if there is no maximum.
    */
    public int getMaxLength()  {
        return JnaText.INST().gtk_text_get_max_length(asCPointer());
    }

    /**
     * Gets whether text is overwritten when typing in the `GtkText`.
     * <br>
     * <br>See [method&#64;Gtk.Text.set_overwrite_mode].
     * @return whether the text is overwritten when typing
    */
    public boolean getOverwriteMode()  {
        return JnaText.INST().gtk_text_get_overwrite_mode(asCPointer());
    }

    /**
     * Retrieves the text that will be displayed when
     * <br>&#64;self is empty and unfocused
     * <br>
     * <br>If no placeholder text has been set, %NULL will be returned.
     * @return the placeholder text
    */
    public ch.bailu.gtk.type.Str getPlaceholderText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaText.INST().gtk_text_get_placeholder_text(asCPointer())));
    }

    /**
     * Returns whether the `GtkText` will grow and shrink
     * <br>with the content.
     * @return %TRUE if &#64;self will propagate the text width
    */
    public boolean getPropagateTextWidth()  {
        return JnaText.INST().gtk_text_get_propagate_text_width(asCPointer());
    }

    /**
     * Gets the tabstops that were set on the `GtkText`.
     * <br>
     * <br>See [method&#64;Gtk.Text.set_tabs].
     * @return the tabstops
    */
    public ch.bailu.gtk.pango.TabArray getTabs()  {
        return new ch.bailu.gtk.pango.TabArray(new PointerContainer(JnaText.INST().gtk_text_get_tabs(asCPointer())));
    }

    /**
     * Retrieves the current length of the text in &#64;self.
     * <br>
     * <br>This is equivalent to getting &#64;self's `GtkEntryBuffer`
     * <br>and calling [method&#64;Gtk.EntryBuffer.get_length] on it.
     * @return the current number of characters   in `GtkText`, or 0 if there are none.
    */
    public int getTextLength()  {
        return JnaText.INST().gtk_text_get_text_length(asCPointer());
    }

    /**
     * Returns whether the `GtkText` will truncate multi-line text
     * <br>that is pasted into the widget
     * @return %TRUE if &#64;self will truncate multi-line text
    */
    public boolean getTruncateMultiline()  {
        return JnaText.INST().gtk_text_get_truncate_multiline(asCPointer());
    }

    /**
     * Retrieves whether the text in &#64;self is visible.
     * @return %TRUE if the text is currently visible
    */
    public boolean getVisibility()  {
        return JnaText.INST().gtk_text_get_visibility(asCPointer());
    }

    /**
     * Causes &#64;self to have keyboard focus.
     * <br>
     * <br>It behaves like [method&#64;Gtk.Widget.grab_focus],
     * <br>except that it doesn't select the contents of &#64;self.
     * <br>You only want to call this on some special entries
     * <br>which the user usually doesn't want to replace all text in,
     * <br>such as search-as-you-type entries.
     * @return %TRUE if focus is now inside &#64;self
    */
    public boolean grabFocusWithoutSelecting()  {
        return JnaText.INST().gtk_text_grab_focus_without_selecting(asCPointer());
    }

    /**
     * If &#64;activates is %TRUE, pressing Enter will activate
     * <br>the default widget for the window containing &#64;self.
     * <br>
     * <br>This usually means that the dialog containing the `GtkText`
     * <br>will be closed, since the default widget is usually one of
     * <br>the dialog buttons.
     * @param activates %TRUE to activate window’s default widget on Enter keypress
    */
    public void setActivatesDefault(boolean activates)  {
        JnaText.INST().gtk_text_set_activates_default(asCPointer(), activates);
    }

    /**
     * Sets attributes that are applied to the text.
     * @param attrs a `PangoAttrList`
    */
    public void setAttributes(@Nullable ch.bailu.gtk.pango.AttrList attrs)  {
        JnaText.INST().gtk_text_set_attributes(asCPointer(), asCPointer(attrs));
    }

    /**
     * Set the `GtkEntryBuffer` object which holds the text for
     * <br>this widget.
     * @param buffer a `GtkEntryBuffer`
    */
    public void setBuffer(@Nonnull EntryBuffer buffer)  {
        JnaText.INST().gtk_text_set_buffer(asCPointer(), asCPointerNotNull(buffer));
    }

    /**
     * Sets whether Emoji completion is enabled.
     * <br>
     * <br>If it is, typing ':', followed by a recognized keyword,
     * <br>will pop up a window with suggested Emojis matching the
     * <br>keyword.
     * @param enable_emoji_completion %TRUE to enable Emoji completion
    */
    public void setEnableEmojiCompletion(boolean enable_emoji_completion)  {
        JnaText.INST().gtk_text_set_enable_emoji_completion(asCPointer(), enable_emoji_completion);
    }

    /**
     * Sets a menu model to add when constructing
     * <br>the context menu for &#64;self.
     * @param model a `GMenuModel`
    */
    public void setExtraMenu(@Nullable ch.bailu.gtk.gio.MenuModel model)  {
        JnaText.INST().gtk_text_set_extra_menu(asCPointer(), asCPointer(model));
    }

    /**
     * Sets input hints that allow input methods
     * <br>to fine-tune their behaviour.
     * @param hints the hints
    */
    public void setInputHints(int hints)  {
        JnaText.INST().gtk_text_set_input_hints(asCPointer(), hints);
    }

    /**
     * Sets the input purpose of the `GtkText`.
     * <br>
     * <br>This can be used by on-screen keyboards and other
     * <br>input methods to adjust their behaviour.
     * @param purpose the purpose
    */
    public void setInputPurpose(int purpose)  {
        JnaText.INST().gtk_text_set_input_purpose(asCPointer(), purpose);
    }

    /**
     * Sets the character to use when in “password mode”.
     * <br>
     * <br>By default, GTK picks the best invisible char available in the
     * <br>current font. If you set the invisible char to 0, then the user
     * <br>will get no feedback at all; there will be no text on the screen
     * <br>as they type.
     * @param ch a Unicode character
    */
    public void setInvisibleChar(byte ch)  {
        JnaText.INST().gtk_text_set_invisible_char(asCPointer(), ch);
    }

    /**
     * Sets the maximum allowed length of the contents of the widget.
     * <br>
     * <br>If the current contents are longer than the given length, then
     * <br>they will be truncated to fit.
     * <br>
     * <br>This is equivalent to getting &#64;self's `GtkEntryBuffer` and
     * <br>calling [method&#64;Gtk.EntryBuffer.set_max_length] on it.
     * @param length the maximum length of the `GtkText`, or 0 for no maximum.   (other than the maximum length of entries.) The value passed   in will be clamped to the range 0-65536.
    */
    public void setMaxLength(int length)  {
        JnaText.INST().gtk_text_set_max_length(asCPointer(), length);
    }

    /**
     * Sets whether the text is overwritten when typing
     * <br>in the `GtkText`.
     * @param overwrite new value
    */
    public void setOverwriteMode(boolean overwrite)  {
        JnaText.INST().gtk_text_set_overwrite_mode(asCPointer(), overwrite);
    }

    /**
     * Sets text to be displayed in &#64;self when it is empty.
     * <br>
     * <br>This can be used to give a visual hint of the expected
     * <br>contents of the `GtkText`.
     * @param text a string to be displayed when &#64;self   is empty and unfocused
    */
    public void setPlaceholderText(@Nullable ch.bailu.gtk.type.Str text)  {
        JnaText.INST().gtk_text_set_placeholder_text(asCPointer(), asCPointer(text));
    }

    /**
     * Sets text to be displayed in &#64;self when it is empty.
     * <br>
     * <br>This can be used to give a visual hint of the expected
     * <br>contents of the `GtkText`.
     * @param text a string to be displayed when &#64;self   is empty and unfocused
    */
    public void setPlaceholderText(String text)  {
        JnaText.INST().gtk_text_set_placeholder_text(asCPointer(), text);
    }

    /**
     * Sets whether the `GtkText` should grow and shrink with the content.
     * @param propagate_text_width %TRUE to propagate the text width
    */
    public void setPropagateTextWidth(boolean propagate_text_width)  {
        JnaText.INST().gtk_text_set_propagate_text_width(asCPointer(), propagate_text_width);
    }

    /**
     * Sets tabstops that are applied to the text.
     * @param tabs a `PangoTabArray`
    */
    public void setTabs(@Nullable ch.bailu.gtk.pango.TabArray tabs)  {
        JnaText.INST().gtk_text_set_tabs(asCPointer(), asCPointer(tabs));
    }

    /**
     * Sets whether the `GtkText` should truncate multi-line text
     * <br>that is pasted into the widget.
     * @param truncate_multiline %TRUE to truncate multi-line text
    */
    public void setTruncateMultiline(boolean truncate_multiline)  {
        JnaText.INST().gtk_text_set_truncate_multiline(asCPointer(), truncate_multiline);
    }

    /**
     * Sets whether the contents of the `GtkText` are visible or not.
     * <br>
     * <br>When visibility is set to %FALSE, characters are displayed
     * <br>as the invisible char, and will also appear that way when
     * <br>the text in the widget is copied to the clipboard.
     * <br>
     * <br>By default, GTK picks the best invisible character available
     * <br>in the current font, but it can be changed with
     * <br>[method&#64;Gtk.Text.set_invisible_char].
     * <br>
     * <br>Note that you probably want to set [property&#64;Gtk.Text:input-purpose]
     * <br>to %GTK_INPUT_PURPOSE_PASSWORD or %GTK_INPUT_PURPOSE_PIN to
     * <br>inform input methods about the purpose of this self,
     * <br>in addition to setting visibility to %FALSE.
     * @param visible %TRUE if the contents of the `GtkText` are displayed   as plaintext
    */
    public void setVisibility(boolean visible)  {
        JnaText.INST().gtk_text_set_visibility(asCPointer(), visible);
    }

    /**
     * Unsets the invisible char.
     * <br>
     * <br>After calling this, the default invisible
     * <br>char is used again.
    */
    public void unsetInvisibleChar()  {
        JnaText.INST().gtk_text_unset_invisible_char(asCPointer());
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

    public final static String SIGNAL_ON_BACKSPACE = "backspace";
    
    /**
     * Connect to signal "backspace".
     * <br>See {@link OnBackspace#onBackspace} for signal description.
     * <br>Field {@link #SIGNAL_ON_BACKSPACE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onBackspace(OnBackspace signal) {
        return connectSignal(SIGNAL_ON_BACKSPACE, toOnBackspace(signal));
    }

    public final static String SIGNAL_ON_COPY_CLIPBOARD = "copy-clipboard";
    
    /**
     * Connect to signal "copy-clipboard".
     * <br>See {@link OnCopyClipboard#onCopyClipboard} for signal description.
     * <br>Field {@link #SIGNAL_ON_COPY_CLIPBOARD} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCopyClipboard(OnCopyClipboard signal) {
        return connectSignal(SIGNAL_ON_COPY_CLIPBOARD, toOnCopyClipboard(signal));
    }

    public final static String SIGNAL_ON_CUT_CLIPBOARD = "cut-clipboard";
    
    /**
     * Connect to signal "cut-clipboard".
     * <br>See {@link OnCutClipboard#onCutClipboard} for signal description.
     * <br>Field {@link #SIGNAL_ON_CUT_CLIPBOARD} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCutClipboard(OnCutClipboard signal) {
        return connectSignal(SIGNAL_ON_CUT_CLIPBOARD, toOnCutClipboard(signal));
    }

    public final static String SIGNAL_ON_DELETE_FROM_CURSOR = "delete-from-cursor";
    
    /**
     * Connect to signal "delete-from-cursor".
     * <br>See {@link OnDeleteFromCursor#onDeleteFromCursor} for signal description.
     * <br>Field {@link #SIGNAL_ON_DELETE_FROM_CURSOR} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDeleteFromCursor(OnDeleteFromCursor signal) {
        return connectSignal(SIGNAL_ON_DELETE_FROM_CURSOR, toOnDeleteFromCursor(signal));
    }

    public final static String SIGNAL_ON_INSERT_AT_CURSOR = "insert-at-cursor";
    
    /**
     * Connect to signal "insert-at-cursor".
     * <br>See {@link OnInsertAtCursor#onInsertAtCursor} for signal description.
     * <br>Field {@link #SIGNAL_ON_INSERT_AT_CURSOR} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInsertAtCursor(OnInsertAtCursor signal) {
        return connectSignal(SIGNAL_ON_INSERT_AT_CURSOR, toOnInsertAtCursor(signal));
    }

    public final static String SIGNAL_ON_INSERT_EMOJI = "insert-emoji";
    
    /**
     * Connect to signal "insert-emoji".
     * <br>See {@link OnInsertEmoji#onInsertEmoji} for signal description.
     * <br>Field {@link #SIGNAL_ON_INSERT_EMOJI} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInsertEmoji(OnInsertEmoji signal) {
        return connectSignal(SIGNAL_ON_INSERT_EMOJI, toOnInsertEmoji(signal));
    }

    public final static String SIGNAL_ON_MOVE_CURSOR = "move-cursor";
    
    /**
     * Connect to signal "move-cursor".
     * <br>See {@link OnMoveCursor#onMoveCursor} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOVE_CURSOR} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMoveCursor(OnMoveCursor signal) {
        return connectSignal(SIGNAL_ON_MOVE_CURSOR, toOnMoveCursor(signal));
    }

    public final static String SIGNAL_ON_PASTE_CLIPBOARD = "paste-clipboard";
    
    /**
     * Connect to signal "paste-clipboard".
     * <br>See {@link OnPasteClipboard#onPasteClipboard} for signal description.
     * <br>Field {@link #SIGNAL_ON_PASTE_CLIPBOARD} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPasteClipboard(OnPasteClipboard signal) {
        return connectSignal(SIGNAL_ON_PASTE_CLIPBOARD, toOnPasteClipboard(signal));
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

    public final static String SIGNAL_ON_TOGGLE_OVERWRITE = "toggle-overwrite";
    
    /**
     * Connect to signal "toggle-overwrite".
     * <br>See {@link OnToggleOverwrite#onToggleOverwrite} for signal description.
     * <br>Field {@link #SIGNAL_ON_TOGGLE_OVERWRITE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onToggleOverwrite(OnToggleOverwrite signal) {
        return connectSignal(SIGNAL_ON_TOGGLE_OVERWRITE, toOnToggleOverwrite(signal));
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
        return JnaText.INST().gtk_text_get_type(); 
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
