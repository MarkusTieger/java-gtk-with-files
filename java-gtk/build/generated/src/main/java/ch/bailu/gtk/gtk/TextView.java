/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A widget that displays the contents of a [class&#64;Gtk.TextBuffer].
 * <br>
 * <br>![An example GtkTextview](multiline-text.png)
 * <br>
 * <br>You may wish to begin by reading the [conceptual overview](section-text-widget.html),
 * <br>which gives an overview of all the objects and data types related to the
 * <br>text widget and how they work together.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>```
 * <br>textview.view
 * <br>├── border.top
 * <br>├── border.left
 * <br>├── text
 * <br>│   ╰── [selection]
 * <br>├── border.right
 * <br>├── border.bottom
 * <br>╰── [window.popup]
 * <br>```
 * <br>
 * <br>`GtkTextView` has a main css node with name textview and style class .view,
 * <br>and subnodes for each of the border windows, and the main text area,
 * <br>with names border and text, respectively. The border nodes each get
 * <br>one of the style classes .left, .right, .top or .bottom.
 * <br>
 * <br>A node representing the selection will appear below the text node.
 * <br>
 * <br>If a context menu is opened, the window node will appear as a subnode
 * <br>of the main node.
 * <br>
 * <br>&#35;&#35; Accessibility
 * <br>
 * <br>`GtkTextView` uses the %GTK_ACCESSIBLE_ROLE_TEXT_BOX role.
 * <p><a href="https://docs.gtk.org/gtk4/class.TextView.html">https://docs.gtk.org/gtk4/class.TextView.html</a></p>
*/
public class TextView extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TextView.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnBackspace {
        /**
         * Gets emitted when the user asks for it.
         * <br>
         * <br>The ::backspace signal is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are
         * <br>&lt;kbd&gt;Backspace&lt;/kbd&gt; and &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Backspace&lt;/kbd&gt;.
        */
        void onBackspace();
    }
    
    private static com.sun.jna.Callback toOnBackspace(OnBackspace in) {
        return (in == null) ? null: (JnaTextView.OnBackspace) (__self, __data) -> in.onBackspace();
    }

    @FunctionalInterface
    public interface OnCopyClipboard {
        /**
         * Gets emitted to copy the selection to the clipboard.
         * <br>
         * <br>The ::copy-clipboard signal is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;c&lt;/kbd&gt; and
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Insert&lt;/kbd&gt;.
        */
        void onCopyClipboard();
    }
    
    private static com.sun.jna.Callback toOnCopyClipboard(OnCopyClipboard in) {
        return (in == null) ? null: (JnaTextView.OnCopyClipboard) (__self, __data) -> in.onCopyClipboard();
    }

    @FunctionalInterface
    public interface OnCutClipboard {
        /**
         * Gets emitted to cut the selection to the clipboard.
         * <br>
         * <br>The ::cut-clipboard signal is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;x&lt;/kbd&gt; and
         * <br>&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Delete&lt;/kbd&gt;.
        */
        void onCutClipboard();
    }
    
    private static com.sun.jna.Callback toOnCutClipboard(OnCutClipboard in) {
        return (in == null) ? null: (JnaTextView.OnCutClipboard) (__self, __data) -> in.onCutClipboard();
    }

    @FunctionalInterface
    public interface OnDeleteFromCursor {
        /**
         * Gets emitted when the user initiates a text deletion.
         * <br>
         * <br>The ::delete-from-cursor signal is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>If the &#64;type is %GTK_DELETE_CHARS, GTK deletes the selection
         * <br>if there is one, otherwise it deletes the requested number
         * <br>of characters.
         * <br>
         * <br>The default bindings for this signal are &lt;kbd&gt;Delete&lt;/kbd&gt; for
         * <br>deleting a character, &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Delete&lt;/kbd&gt; for
         * <br>deleting a word and &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Backspace&lt;/kbd&gt; for
         * <br>deleting a word backwards.
         * @param type the granularity of the deletion, as a `GtkDeleteType`
         * @param count the number of &#64;type units to delete
        */
        void onDeleteFromCursor(int type, int count);
    }
    
    private static com.sun.jna.Callback toOnDeleteFromCursor(OnDeleteFromCursor in) {
        return (in == null) ? null: (JnaTextView.OnDeleteFromCursor) (__self, _type, _count, __data) -> in.onDeleteFromCursor(_type, _count);
    }

    @FunctionalInterface
    public interface OnExtendSelection {
        /**
         * Emitted when the selection needs to be extended at &#64;location.
         * @param granularity the granularity type
         * @param location the location where to extend the selection
         * @param start where the selection should start
         * @param end where the selection should end
         * @return %GDK_EVENT_STOP to stop other handlers from being invoked for the   event. %GDK_EVENT_PROPAGATE to propagate the event further.
        */
        boolean onExtendSelection(int granularity, @Nonnull TextIter location, @Nonnull TextIter start, @Nonnull TextIter end);
    }
    
    private static com.sun.jna.Callback toOnExtendSelection(OnExtendSelection in) {
        return (in == null) ? null: (JnaTextView.OnExtendSelection) (__self, _granularity, _location, _start, _end, __data) -> in.onExtendSelection(_granularity, new TextIter(new PointerContainer(_location)), new TextIter(new PointerContainer(_start)), new TextIter(new PointerContainer(_end)));
    }

    @FunctionalInterface
    public interface OnInsertAtCursor {
        /**
         * Gets emitted when the user initiates the insertion of a
         * <br>fixed string at the cursor.
         * <br>
         * <br>The ::insert-at-cursor signal is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>This signal has no default bindings.
         * @param string the string to insert
        */
        void onInsertAtCursor(@Nonnull ch.bailu.gtk.type.Str string);
    }
    
    private static com.sun.jna.Callback toOnInsertAtCursor(OnInsertAtCursor in) {
        return (in == null) ? null: (JnaTextView.OnInsertAtCursor) (__self, _string, __data) -> in.onInsertAtCursor(new ch.bailu.gtk.type.Str(new PointerContainer(_string)));
    }

    @FunctionalInterface
    public interface OnInsertEmoji {
        /**
         * Gets emitted to present the Emoji chooser for the &#64;text_view.
         * <br>
         * <br>The ::insert-emoji signal is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;.&lt;/kbd&gt; and
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;;&lt;/kbd&gt;
        */
        void onInsertEmoji();
    }
    
    private static com.sun.jna.Callback toOnInsertEmoji(OnInsertEmoji in) {
        return (in == null) ? null: (JnaTextView.OnInsertEmoji) (__self, __data) -> in.onInsertEmoji();
    }

    @FunctionalInterface
    public interface OnMoveCursor {
        /**
         * Gets emitted when the user initiates a cursor movement.
         * <br>
         * <br>The ::move-cursor signal is a [keybinding signal](class.SignalAction.html).
         * <br>If the cursor is not visible in &#64;text_view, this signal causes
         * <br>the viewport to be moved instead.
         * <br>
         * <br>Applications should not connect to it, but may emit it with
         * <br>g_signal_emit_by_name() if they need to control the cursor
         * <br>programmatically.
         * <br>
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
         * <br>- &lt;kbd&gt;PgUp&lt;/kbd&gt;, &lt;kbd&gt;PgDn&lt;/kbd&gt; move vertically by pages
         * <br>- &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;PgUp&lt;/kbd&gt;, &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;PgDn&lt;/kbd&gt;
         * <br>  move horizontally by pages
         * @param step the granularity of the move, as a `GtkMovementStep`
         * @param count the number of &#64;step units to move
         * @param extend_selection %TRUE if the move should extend the selection
        */
        void onMoveCursor(int step, int count, boolean extend_selection);
    }
    
    private static com.sun.jna.Callback toOnMoveCursor(OnMoveCursor in) {
        return (in == null) ? null: (JnaTextView.OnMoveCursor) (__self, _step, _count, _extend_selection, __data) -> in.onMoveCursor(_step, _count, _extend_selection);
    }

    @FunctionalInterface
    public interface OnMoveViewport {
        /**
         * Gets emitted to move the viewport.
         * <br>
         * <br>The ::move-viewport signal is a [keybinding signal](class.SignalAction.html),
         * <br>which can be bound to key combinations to allow the user to move the viewport,
         * <br>i.e. change what part of the text view is visible in a containing scrolled
         * <br>window.
         * <br>
         * <br>There are no default bindings for this signal.
         * @param step the granularity of the movement, as a `GtkScrollStep`
         * @param count the number of &#64;step units to move
        */
        void onMoveViewport(int step, int count);
    }
    
    private static com.sun.jna.Callback toOnMoveViewport(OnMoveViewport in) {
        return (in == null) ? null: (JnaTextView.OnMoveViewport) (__self, _step, _count, __data) -> in.onMoveViewport(_step, _count);
    }

    @FunctionalInterface
    public interface OnPasteClipboard {
        /**
         * Gets emitted to paste the contents of the clipboard
         * <br>into the text view.
         * <br>
         * <br>The ::paste-clipboard signal is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;v&lt;/kbd&gt; and
         * <br>&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Insert&lt;/kbd&gt;.
        */
        void onPasteClipboard();
    }
    
    private static com.sun.jna.Callback toOnPasteClipboard(OnPasteClipboard in) {
        return (in == null) ? null: (JnaTextView.OnPasteClipboard) (__self, __data) -> in.onPasteClipboard();
    }

    @FunctionalInterface
    public interface OnPreeditChanged {
        /**
         * Emitted when preedit text of the active IM changes.
         * <br>
         * <br>If an input method is used, the typed text will not immediately
         * <br>be committed to the buffer. So if you are interested in the text,
         * <br>connect to this signal.
         * <br>
         * <br>This signal is only emitted if the text at the given position
         * <br>is actually editable.
         * @param preedit the current preedit string
        */
        void onPreeditChanged(@Nonnull ch.bailu.gtk.type.Str preedit);
    }
    
    private static com.sun.jna.Callback toOnPreeditChanged(OnPreeditChanged in) {
        return (in == null) ? null: (JnaTextView.OnPreeditChanged) (__self, _preedit, __data) -> in.onPreeditChanged(new ch.bailu.gtk.type.Str(new PointerContainer(_preedit)));
    }

    @FunctionalInterface
    public interface OnSelectAll {
        /**
         * Gets emitted to select or unselect the complete contents of the text view.
         * <br>
         * <br>The ::select-all signal is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal are
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt; and
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;/&lt;/kbd&gt; for selecting and
         * <br>&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt; and
         * <br>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;&#92;&lt;/kbd&gt; for unselecting.
         * @param select %TRUE to select, %FALSE to unselect
        */
        void onSelectAll(boolean select);
    }
    
    private static com.sun.jna.Callback toOnSelectAll(OnSelectAll in) {
        return (in == null) ? null: (JnaTextView.OnSelectAll) (__self, _select, __data) -> in.onSelectAll(_select);
    }

    @FunctionalInterface
    public interface OnSetAnchor {
        /**
         * Gets emitted when the user initiates settings the &quot;anchor&quot; mark.
         * <br>
         * <br>The ::set-anchor signal is a [keybinding signal](class.SignalAction.html)
         * <br>which gets emitted when the user initiates setting the &quot;anchor&quot;
         * <br>mark. The &quot;anchor&quot; mark gets placed at the same position as the
         * <br>&quot;insert&quot; mark.
         * <br>
         * <br>This signal has no default bindings.
        */
        void onSetAnchor();
    }
    
    private static com.sun.jna.Callback toOnSetAnchor(OnSetAnchor in) {
        return (in == null) ? null: (JnaTextView.OnSetAnchor) (__self, __data) -> in.onSetAnchor();
    }

    @FunctionalInterface
    public interface OnToggleCursorVisible {
        /**
         * Gets emitted to toggle the `cursor-visible` property.
         * <br>
         * <br>The ::toggle-cursor-visible signal is a
         * <br>[keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;F7&lt;/kbd&gt;.
        */
        void onToggleCursorVisible();
    }
    
    private static com.sun.jna.Callback toOnToggleCursorVisible(OnToggleCursorVisible in) {
        return (in == null) ? null: (JnaTextView.OnToggleCursorVisible) (__self, __data) -> in.onToggleCursorVisible();
    }

    @FunctionalInterface
    public interface OnToggleOverwrite {
        /**
         * Gets emitted to toggle the overwrite mode of the text view.
         * <br>
         * <br>The ::toggle-overwrite signal is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Insert&lt;/kbd&gt;.
        */
        void onToggleOverwrite();
    }
    
    private static com.sun.jna.Callback toOnToggleOverwrite(OnToggleOverwrite in) {
        return (in == null) ? null: (JnaTextView.OnToggleOverwrite) (__self, __data) -> in.onToggleOverwrite();
    }

    public TextView(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkTextView` widget displaying the buffer &#64;buffer.
     * <br>
     * <br>One buffer can be shared among many widgets. &#64;buffer may be %NULL
     * <br>to create a default buffer, in which case this function is equivalent
     * <br>to [ctor&#64;Gtk.TextView.new]. The text view adds its own reference count
     * <br>to the buffer; it does not take over an existing reference.
     * @param buffer a `GtkTextBuffer`
     * @return a new `GtkTextView`.
    */
    public static TextView newWithBufferTextView(@Nonnull TextBuffer buffer)  {
        PointerContainer __self = cast(JnaTextView.INST().gtk_text_view_new_with_buffer(asCPointerNotNull(buffer)));
        if (__self.isNull()) {
            throw new NullPointerException("TextView:newWithBuffer");
        }
        return new TextView(__self);
    }        
    

    /**
     * Creates a new `GtkTextView`.
     * <br>
     * <br>If you don’t call [method&#64;Gtk.TextView.set_buffer] before using the
     * <br>text view, an empty default buffer will be created for you. Get the
     * <br>buffer with [method&#64;Gtk.TextView.get_buffer]. If you want to specify
     * <br>your own buffer, consider [ctor&#64;Gtk.TextView.new_with_buffer].
    */
    public TextView() {
        super(cast(JnaTextView.INST().gtk_text_view_new()));
    }

    /**
     * Adds a child widget in the text buffer, at the given &#64;anchor.
     * @param child a `GtkWidget`
     * @param anchor a `GtkTextChildAnchor` in the `GtkTextBuffer` for &#64;text_view
    */
    public void addChildAtAnchor(@Nonnull Widget child, @Nonnull TextChildAnchor anchor)  {
        JnaTextView.INST().gtk_text_view_add_child_at_anchor(asCPointer(), asCPointerNotNull(child), asCPointerNotNull(anchor));
    }

    /**
     * Adds &#64;child at a fixed coordinate in the `GtkTextView`'s text window.
     * <br>
     * <br>The &#64;xpos and &#64;ypos must be in buffer coordinates (see
     * <br>[method&#64;Gtk.TextView.get_iter_location] to convert to
     * <br>buffer coordinates).
     * <br>
     * <br>&#64;child will scroll with the text view.
     * <br>
     * <br>If instead you want a widget that will not move with the
     * <br>`GtkTextView` contents see `GtkOverlay`.
     * @param child a `GtkWidget`
     * @param xpos X position of child in window coordinates
     * @param ypos Y position of child in window coordinates
    */
    public void addOverlay(@Nonnull Widget child, int xpos, int ypos)  {
        JnaTextView.INST().gtk_text_view_add_overlay(asCPointer(), asCPointerNotNull(child), xpos, ypos);
    }

    /**
     * Moves the given &#64;iter backward by one display (wrapped) line.
     * <br>
     * <br>A display line is different from a paragraph. Paragraphs are
     * <br>separated by newlines or other paragraph separator characters.
     * <br>Display lines are created by line-wrapping a paragraph. If
     * <br>wrapping is turned off, display lines and paragraphs will be the
     * <br>same. Display lines are divided differently for each view, since
     * <br>they depend on the view’s width; paragraphs are the same in all
     * <br>views, since they depend on the contents of the `GtkTextBuffer`.
     * @param iter a `GtkTextIter`
     * @return %TRUE if &#64;iter was moved and is not on the end iterator
    */
    public boolean backwardDisplayLine(@Nonnull TextIter iter)  {
        return JnaTextView.INST().gtk_text_view_backward_display_line(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Moves the given &#64;iter backward to the next display line start.
     * <br>
     * <br>A display line is different from a paragraph. Paragraphs are
     * <br>separated by newlines or other paragraph separator characters.
     * <br>Display lines are created by line-wrapping a paragraph. If
     * <br>wrapping is turned off, display lines and paragraphs will be the
     * <br>same. Display lines are divided differently for each view, since
     * <br>they depend on the view’s width; paragraphs are the same in all
     * <br>views, since they depend on the contents of the `GtkTextBuffer`.
     * @param iter a `GtkTextIter`
     * @return %TRUE if &#64;iter was moved and is not on the end iterator
    */
    public boolean backwardDisplayLineStart(@Nonnull TextIter iter)  {
        return JnaTextView.INST().gtk_text_view_backward_display_line_start(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Converts buffer coordinates to window coordinates.
     * @param win a `GtkTextWindowType`
     * @param buffer_x buffer x coordinate
     * @param buffer_y buffer y coordinate
     * @param window_x window x coordinate return location
     * @param window_y window y coordinate return location
    */
    public void bufferToWindowCoords(int win, int buffer_x, int buffer_y, @Nullable ch.bailu.gtk.type.Int window_x, @Nullable ch.bailu.gtk.type.Int window_y)  {
        JnaTextView.INST().gtk_text_view_buffer_to_window_coords(asCPointer(), win, buffer_x, buffer_y, asCPointer(window_x), asCPointer(window_y));
    }

    /**
     * Moves the given &#64;iter forward by one display (wrapped) line.
     * <br>
     * <br>A display line is different from a paragraph. Paragraphs are
     * <br>separated by newlines or other paragraph separator characters.
     * <br>Display lines are created by line-wrapping a paragraph. If
     * <br>wrapping is turned off, display lines and paragraphs will be the
     * <br>same. Display lines are divided differently for each view, since
     * <br>they depend on the view’s width; paragraphs are the same in all
     * <br>views, since they depend on the contents of the `GtkTextBuffer`.
     * @param iter a `GtkTextIter`
     * @return %TRUE if &#64;iter was moved and is not on the end iterator
    */
    public boolean forwardDisplayLine(@Nonnull TextIter iter)  {
        return JnaTextView.INST().gtk_text_view_forward_display_line(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Moves the given &#64;iter forward to the next display line end.
     * <br>
     * <br>A display line is different from a paragraph. Paragraphs are
     * <br>separated by newlines or other paragraph separator characters.
     * <br>Display lines are created by line-wrapping a paragraph. If
     * <br>wrapping is turned off, display lines and paragraphs will be the
     * <br>same. Display lines are divided differently for each view, since
     * <br>they depend on the view’s width; paragraphs are the same in all
     * <br>views, since they depend on the contents of the `GtkTextBuffer`.
     * @param iter a `GtkTextIter`
     * @return %TRUE if &#64;iter was moved and is not on the end iterator
    */
    public boolean forwardDisplayLineEnd(@Nonnull TextIter iter)  {
        return JnaTextView.INST().gtk_text_view_forward_display_line_end(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Returns whether pressing the &lt;kbd&gt;Tab&lt;/kbd&gt; key inserts a tab characters.
     * <br>
     * <br>See [method&#64;Gtk.TextView.set_accepts_tab].
     * @return %TRUE if pressing the Tab key inserts a tab character,   %FALSE if pressing the Tab key moves the keyboard focus.
    */
    public boolean getAcceptsTab()  {
        return JnaTextView.INST().gtk_text_view_get_accepts_tab(asCPointer());
    }

    /**
     * Gets the bottom margin for text in the &#64;text_view.
     * @return bottom margin in pixels
    */
    public int getBottomMargin()  {
        return JnaTextView.INST().gtk_text_view_get_bottom_margin(asCPointer());
    }

    /**
     * Returns the `GtkTextBuffer` being displayed by this text view.
     * <br>
     * <br>The reference count on the buffer is not incremented; the caller
     * <br>of this function won’t own a new reference.
     * @return a `GtkTextBuffer`
    */
    public TextBuffer getBuffer()  {
        return new TextBuffer(new PointerContainer(JnaTextView.INST().gtk_text_view_get_buffer(asCPointer())));
    }

    /**
     * Determine the positions of the strong and weak cursors if the
     * <br>insertion point is at &#64;iter.
     * <br>
     * <br>The position of each cursor is stored as a zero-width rectangle.
     * <br>The strong cursor location is the location where characters of
     * <br>the directionality equal to the base direction of the paragraph
     * <br>are inserted. The weak cursor location is the location where
     * <br>characters of the directionality opposite to the base direction
     * <br>of the paragraph are inserted.
     * <br>
     * <br>If &#64;iter is %NULL, the actual cursor position is used.
     * <br>
     * <br>Note that if &#64;iter happens to be the actual cursor position, and
     * <br>there is currently an IM preedit sequence being entered, the
     * <br>returned locations will be adjusted to account for the preedit
     * <br>cursor’s offset within the preedit sequence.
     * <br>
     * <br>The rectangle position is in buffer coordinates; use
     * <br>[method&#64;Gtk.TextView.buffer_to_window_coords] to convert these
     * <br>coordinates to coordinates for one of the windows in the text view.
     * @param iter a `GtkTextIter`
     * @param strong location to store the strong cursor position
     * @param weak location to store the weak cursor position
    */
    public void getCursorLocations(@Nullable TextIter iter, @Nullable ch.bailu.gtk.gdk.Rectangle strong, @Nullable ch.bailu.gtk.gdk.Rectangle weak)  {
        JnaTextView.INST().gtk_text_view_get_cursor_locations(asCPointer(), asCPointer(iter), asCPointer(strong), asCPointer(weak));
    }

    /**
     * Find out whether the cursor should be displayed.
     * @return whether the insertion mark is visible
    */
    public boolean getCursorVisible()  {
        return JnaTextView.INST().gtk_text_view_get_cursor_visible(asCPointer());
    }

    /**
     * Returns the default editability of the `GtkTextView`.
     * <br>
     * <br>Tags in the buffer may override this setting for some ranges of text.
     * @return whether text is editable by default
    */
    public boolean getEditable()  {
        return JnaTextView.INST().gtk_text_view_get_editable(asCPointer());
    }

    /**
     * Gets the menu model that gets added to the context menu
     * <br>or %NULL if none has been set.
     * @return the menu model
    */
    public ch.bailu.gtk.gio.MenuModel getExtraMenu()  {
        return new ch.bailu.gtk.gio.MenuModel(new PointerContainer(JnaTextView.INST().gtk_text_view_get_extra_menu(asCPointer())));
    }

    /**
     * Gets a `GtkWidget` that has previously been set as gutter.
     * <br>
     * <br>See [method&#64;Gtk.TextView.set_gutter].
     * <br>
     * <br>&#64;win must be one of %GTK_TEXT_WINDOW_LEFT, %GTK_TEXT_WINDOW_RIGHT,
     * <br>%GTK_TEXT_WINDOW_TOP, or %GTK_TEXT_WINDOW_BOTTOM.
     * @param win a `GtkTextWindowType`
     * @return a `GtkWidget`
    */
    public Widget getGutter(int win)  {
        return new Widget(new PointerContainer(JnaTextView.INST().gtk_text_view_get_gutter(asCPointer(), win)));
    }

    /**
     * Gets the default indentation of paragraphs in &#64;text_view.
     * <br>
     * <br>Tags in the view’s buffer may override the default.
     * <br>The indentation may be negative.
     * @return number of pixels of indentation
    */
    public int getIndent()  {
        return JnaTextView.INST().gtk_text_view_get_indent(asCPointer());
    }

    /**
     * Gets the `input-hints` of the `GtkTextView`.
     * @return 
    */
    public int getInputHints()  {
        return JnaTextView.INST().gtk_text_view_get_input_hints(asCPointer());
    }

    /**
     * Gets the `input-purpose` of the `GtkTextView`.
     * @return 
    */
    public int getInputPurpose()  {
        return JnaTextView.INST().gtk_text_view_get_input_purpose(asCPointer());
    }

    /**
     * Retrieves the iterator at buffer coordinates &#64;x and &#64;y.
     * <br>
     * <br>Buffer coordinates are coordinates for the entire buffer, not just
     * <br>the currently-displayed portion. If you have coordinates from an
     * <br>event, you have to convert those to buffer coordinates with
     * <br>[method&#64;Gtk.TextView.window_to_buffer_coords].
     * @param iter a `GtkTextIter`
     * @param x x position, in buffer coordinates
     * @param y y position, in buffer coordinates
     * @return %TRUE if the position is over text
    */
    public boolean getIterAtLocation(@Nonnull TextIter iter, int x, int y)  {
        return JnaTextView.INST().gtk_text_view_get_iter_at_location(asCPointer(), asCPointerNotNull(iter), x, y);
    }

    /**
     * Retrieves the iterator pointing to the character at buffer
     * <br>coordinates &#64;x and &#64;y.
     * <br>
     * <br>Buffer coordinates are coordinates for the entire buffer, not just
     * <br>the currently-displayed portion. If you have coordinates from an event,
     * <br>you have to convert those to buffer coordinates with
     * <br>[method&#64;Gtk.TextView.window_to_buffer_coords].
     * <br>
     * <br>Note that this is different from [method&#64;Gtk.TextView.get_iter_at_location],
     * <br>which returns cursor locations, i.e. positions between characters.
     * @param iter a `GtkTextIter`
     * @param trailing if non-%NULL, location to store    an integer indicating where in the grapheme the user clicked.    It will either be zero, or the number of characters in the grapheme.    0 represents the trailing edge of the grapheme.
     * @param x x position, in buffer coordinates
     * @param y y position, in buffer coordinates
     * @return %TRUE if the position is over text
    */
    public boolean getIterAtPosition(@Nonnull TextIter iter, @Nullable ch.bailu.gtk.type.Int trailing, int x, int y)  {
        return JnaTextView.INST().gtk_text_view_get_iter_at_position(asCPointer(), asCPointerNotNull(iter), asCPointer(trailing), x, y);
    }

    /**
     * Gets a rectangle which roughly contains the character at &#64;iter.
     * <br>
     * <br>The rectangle position is in buffer coordinates; use
     * <br>[method&#64;Gtk.TextView.buffer_to_window_coords] to convert these
     * <br>coordinates to coordinates for one of the windows in the text view.
     * @param iter a `GtkTextIter`
     * @param location bounds of the character at &#64;iter
    */
    public void getIterLocation(@Nonnull TextIter iter, @Nonnull ch.bailu.gtk.gdk.Rectangle location)  {
        JnaTextView.INST().gtk_text_view_get_iter_location(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(location));
    }

    /**
     * Gets the default justification of paragraphs in &#64;text_view.
     * <br>
     * <br>Tags in the buffer may override the default.
     * @return default justification
    */
    public int getJustification()  {
        return JnaTextView.INST().gtk_text_view_get_justification(asCPointer());
    }

    /**
     * Gets the default left margin size of paragraphs in the &#64;text_view.
     * <br>
     * <br>Tags in the buffer may override the default.
     * @return left margin in pixels
    */
    public int getLeftMargin()  {
        return JnaTextView.INST().gtk_text_view_get_left_margin(asCPointer());
    }

    /**
     * Gets the `GtkTextIter` at the start of the line containing
     * <br>the coordinate &#64;y.
     * <br>
     * <br>&#64;y is in buffer coordinates, convert from window coordinates with
     * <br>[method&#64;Gtk.TextView.window_to_buffer_coords]. If non-%NULL,
     * <br>&#64;line_top will be filled with the coordinate of the top edge
     * <br>of the line.
     * @param target_iter a `GtkTextIter`
     * @param y a y coordinate
     * @param line_top return location for top coordinate of the line
    */
    public void getLineAtY(@Nonnull TextIter target_iter, int y, @Nonnull ch.bailu.gtk.type.Int line_top)  {
        JnaTextView.INST().gtk_text_view_get_line_at_y(asCPointer(), asCPointerNotNull(target_iter), y, asCPointerNotNull(line_top));
    }

    /**
     * Gets the y coordinate of the top of the line containing &#64;iter,
     * <br>and the height of the line.
     * <br>
     * <br>The coordinate is a buffer coordinate; convert to window
     * <br>coordinates with [method&#64;Gtk.TextView.buffer_to_window_coords].
     * @param iter a `GtkTextIter`
     * @param y return location for a y coordinate
     * @param height return location for a height
    */
    public void getLineYrange(@Nonnull TextIter iter, @Nonnull ch.bailu.gtk.type.Int y, @Nonnull ch.bailu.gtk.type.Int height)  {
        JnaTextView.INST().gtk_text_view_get_line_yrange(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(y), asCPointerNotNull(height));
    }

    /**
     * Gets the `PangoContext` that is used for rendering LTR directed
     * <br>text layouts.
     * <br>
     * <br>The context may be replaced when CSS changes occur.
     * @return a `PangoContext`
    */
    public ch.bailu.gtk.pango.Context getLtrContext()  {
        return new ch.bailu.gtk.pango.Context(new PointerContainer(JnaTextView.INST().gtk_text_view_get_ltr_context(asCPointer())));
    }

    /**
     * Gets whether the `GtkTextView` uses monospace styling.
     * @return %TRUE if monospace fonts are desired
    */
    public boolean getMonospace()  {
        return JnaTextView.INST().gtk_text_view_get_monospace(asCPointer());
    }

    /**
     * Returns whether the `GtkTextView` is in overwrite mode or not.
     * @return whether &#64;text_view is in overwrite mode or not.
    */
    public boolean getOverwrite()  {
        return JnaTextView.INST().gtk_text_view_get_overwrite(asCPointer());
    }

    /**
     * Gets the default number of pixels to put above paragraphs.
     * <br>
     * <br>Adding this function with [method&#64;Gtk.TextView.get_pixels_below_lines]
     * <br>is equal to the line space between each paragraph.
     * @return default number of pixels above paragraphs
    */
    public int getPixelsAboveLines()  {
        return JnaTextView.INST().gtk_text_view_get_pixels_above_lines(asCPointer());
    }

    /**
     * Gets the default number of pixels to put below paragraphs.
     * <br>
     * <br>The line space is the sum of the value returned by this function and
     * <br>the value returned by [method&#64;Gtk.TextView.get_pixels_above_lines].
     * @return default number of blank pixels below paragraphs
    */
    public int getPixelsBelowLines()  {
        return JnaTextView.INST().gtk_text_view_get_pixels_below_lines(asCPointer());
    }

    /**
     * Gets the default number of pixels to put between wrapped lines
     * <br>inside a paragraph.
     * @return default number of pixels of blank space between wrapped lines
    */
    public int getPixelsInsideWrap()  {
        return JnaTextView.INST().gtk_text_view_get_pixels_inside_wrap(asCPointer());
    }

    /**
     * Gets the default right margin for text in &#64;text_view.
     * <br>
     * <br>Tags in the buffer may override the default.
     * @return right margin in pixels
    */
    public int getRightMargin()  {
        return JnaTextView.INST().gtk_text_view_get_right_margin(asCPointer());
    }

    /**
     * Gets the `PangoContext` that is used for rendering RTL directed
     * <br>text layouts.
     * <br>
     * <br>The context may be replaced when CSS changes occur.
     * @return a `PangoContext`
    */
    public ch.bailu.gtk.pango.Context getRtlContext()  {
        return new ch.bailu.gtk.pango.Context(new PointerContainer(JnaTextView.INST().gtk_text_view_get_rtl_context(asCPointer())));
    }

    /**
     * Gets the default tabs for &#64;text_view.
     * <br>
     * <br>Tags in the buffer may override the defaults. The returned array
     * <br>will be %NULL if “standard” (8-space) tabs are used. Free the
     * <br>return value with [method&#64;Pango.TabArray.free].
     * @return copy of default tab array,   or %NULL if standard tabs are used; must be freed with   [method&#64;Pango.TabArray.free].
    */
    public ch.bailu.gtk.pango.TabArray getTabs()  {
        return new ch.bailu.gtk.pango.TabArray(new PointerContainer(JnaTextView.INST().gtk_text_view_get_tabs(asCPointer())));
    }

    /**
     * Gets the top margin for text in the &#64;text_view.
     * @return top margin in pixels
    */
    public int getTopMargin()  {
        return JnaTextView.INST().gtk_text_view_get_top_margin(asCPointer());
    }

    /**
     * Fills &#64;visible_rect with the currently-visible
     * <br>region of the buffer, in buffer coordinates.
     * <br>
     * <br>Convert to window coordinates with
     * <br>[method&#64;Gtk.TextView.buffer_to_window_coords].
     * @param visible_rect rectangle to fill
    */
    public void getVisibleRect(@Nonnull ch.bailu.gtk.gdk.Rectangle visible_rect)  {
        JnaTextView.INST().gtk_text_view_get_visible_rect(asCPointer(), asCPointerNotNull(visible_rect));
    }

    /**
     * Gets the line wrapping for the view.
     * @return the line wrap setting
    */
    public int getWrapMode()  {
        return JnaTextView.INST().gtk_text_view_get_wrap_mode(asCPointer());
    }

    /**
     * Allow the `GtkTextView` input method to internally handle key press
     * <br>and release events.
     * <br>
     * <br>If this function returns %TRUE, then no further processing should be
     * <br>done for this key event. See [method&#64;Gtk.IMContext.filter_keypress].
     * <br>
     * <br>Note that you are expected to call this function from your handler
     * <br>when overriding key event handling. This is needed in the case when
     * <br>you need to insert your own key handling between the input method
     * <br>and the default key event handling of the `GtkTextView`.
     * <br>
     * <br>```c
     * <br>static gboolean
     * <br>gtk_foo_bar_key_press_event (GtkWidget *widget,
     * <br>                             GdkEvent  *event)
     * <br>{
     * <br>  guint keyval;
     * <br>
     * <br>  gdk_event_get_keyval ((GdkEvent*)event, &amp;keyval);
     * <br>
     * <br>  if (keyval == GDK_KEY_Return || keyval == GDK_KEY_KP_Enter)
     * <br>    {
     * <br>      if (gtk_text_view_im_context_filter_keypress (GTK_TEXT_VIEW (widget), event))
     * <br>        return TRUE;
     * <br>    }
     * <br>
     * <br>  // Do some stuff
     * <br>
     * <br>  return GTK_WIDGET_CLASS (gtk_foo_bar_parent_class)-&gt;key_press_event (widget, event);
     * <br>}
     * <br>```
     * @param event the key event
     * @return %TRUE if the input method handled the key event.
    */
    public boolean imContextFilterKeypress(@Nonnull ch.bailu.gtk.gdk.Event event)  {
        return JnaTextView.INST().gtk_text_view_im_context_filter_keypress(asCPointer(), asCPointerNotNull(event));
    }

    /**
     * Moves a mark within the buffer so that it's
     * <br>located within the currently-visible text area.
     * @param mark a `GtkTextMark`
     * @return %TRUE if the mark moved (wasn’t already onscreen)
    */
    public boolean moveMarkOnscreen(@Nonnull TextMark mark)  {
        return JnaTextView.INST().gtk_text_view_move_mark_onscreen(asCPointer(), asCPointerNotNull(mark));
    }

    /**
     * Updates the position of a child.
     * <br>
     * <br>See [method&#64;Gtk.TextView.add_overlay].
     * @param child a widget already added with [method&#64;Gtk.TextView.add_overlay]
     * @param xpos new X position in buffer coordinates
     * @param ypos new Y position in buffer coordinates
    */
    public void moveOverlay(@Nonnull Widget child, int xpos, int ypos)  {
        JnaTextView.INST().gtk_text_view_move_overlay(asCPointer(), asCPointerNotNull(child), xpos, ypos);
    }

    /**
     * Move the iterator a given number of characters visually, treating
     * <br>it as the strong cursor position.
     * <br>
     * <br>If &#64;count is positive, then the new strong cursor position will
     * <br>be &#64;count positions to the right of the old cursor position.
     * <br>If &#64;count is negative then the new strong cursor position will
     * <br>be &#64;count positions to the left of the old cursor position.
     * <br>
     * <br>In the presence of bi-directional text, the correspondence
     * <br>between logical and visual order will depend on the direction
     * <br>of the current run, and there may be jumps when the cursor
     * <br>is moved off of the end of a run.
     * @param iter a `GtkTextIter`
     * @param count number of characters to move (negative moves left,    positive moves right)
     * @return %TRUE if &#64;iter moved and is not on the end iterator
    */
    public boolean moveVisually(@Nonnull TextIter iter, int count)  {
        return JnaTextView.INST().gtk_text_view_move_visually(asCPointer(), asCPointerNotNull(iter), count);
    }

    /**
     * Moves the cursor to the currently visible region of the
     * <br>buffer.
     * @return %TRUE if the cursor had to be moved.
    */
    public boolean placeCursorOnscreen()  {
        return JnaTextView.INST().gtk_text_view_place_cursor_onscreen(asCPointer());
    }

    /**
     * Removes a child widget from &#64;text_view.
     * @param child the child to remove
    */
    public void remove(@Nonnull Widget child)  {
        JnaTextView.INST().gtk_text_view_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Ensures that the cursor is shown.
     * <br>
     * <br>This also resets the time that it will stay blinking (or
     * <br>visible, in case blinking is disabled).
     * <br>
     * <br>This function should be called in response to user input
     * <br>(e.g. from derived classes that override the textview's
     * <br>event handlers).
    */
    public void resetCursorBlink()  {
        JnaTextView.INST().gtk_text_view_reset_cursor_blink(asCPointer());
    }

    /**
     * Reset the input method context of the text view if needed.
     * <br>
     * <br>This can be necessary in the case where modifying the buffer
     * <br>would confuse on-going input method behavior.
    */
    public void resetImContext()  {
        JnaTextView.INST().gtk_text_view_reset_im_context(asCPointer());
    }

    /**
     * Scrolls &#64;text_view the minimum distance such that &#64;mark is contained
     * <br>within the visible area of the widget.
     * @param mark a mark in the buffer for &#64;text_view
    */
    public void scrollMarkOnscreen(@Nonnull TextMark mark)  {
        JnaTextView.INST().gtk_text_view_scroll_mark_onscreen(asCPointer(), asCPointerNotNull(mark));
    }

    /**
     * Scrolls &#64;text_view so that &#64;iter is on the screen in the position
     * <br>indicated by &#64;xalign and &#64;yalign.
     * <br>
     * <br>An alignment of 0.0 indicates left or top, 1.0 indicates right or
     * <br>bottom, 0.5 means center. If &#64;use_align is %FALSE, the text scrolls
     * <br>the minimal distance to get the mark onscreen, possibly not scrolling
     * <br>at all. The effective screen for purposes of this function is reduced
     * <br>by a margin of size &#64;within_margin.
     * <br>
     * <br>Note that this function uses the currently-computed height of the
     * <br>lines in the text buffer. Line heights are computed in an idle
     * <br>handler; so this function may not have the desired effect if it’s
     * <br>called before the height computations. To avoid oddness, consider
     * <br>using [method&#64;Gtk.TextView.scroll_to_mark] which saves a point to be
     * <br>scrolled to after line validation.
     * @param iter a `GtkTextIter`
     * @param within_margin margin as a [0.0,0.5) fraction of screen size
     * @param use_align whether to use alignment arguments (if %FALSE,    just get the mark onscreen)
     * @param xalign horizontal alignment of mark within visible area
     * @param yalign vertical alignment of mark within visible area
     * @return %TRUE if scrolling occurred
    */
    public boolean scrollToIter(@Nonnull TextIter iter, double within_margin, boolean use_align, double xalign, double yalign)  {
        return JnaTextView.INST().gtk_text_view_scroll_to_iter(asCPointer(), asCPointerNotNull(iter), within_margin, use_align, xalign, yalign);
    }

    /**
     * Scrolls &#64;text_view so that &#64;mark is on the screen in the position
     * <br>indicated by &#64;xalign and &#64;yalign.
     * <br>
     * <br>An alignment of 0.0 indicates left or top, 1.0 indicates right or
     * <br>bottom, 0.5 means center. If &#64;use_align is %FALSE, the text scrolls
     * <br>the minimal distance to get the mark onscreen, possibly not scrolling
     * <br>at all. The effective screen for purposes of this function is reduced
     * <br>by a margin of size &#64;within_margin.
     * @param mark a `GtkTextMark`
     * @param within_margin margin as a [0.0,0.5) fraction of screen size
     * @param use_align whether to use alignment arguments (if %FALSE, just    get the mark onscreen)
     * @param xalign horizontal alignment of mark within visible area
     * @param yalign vertical alignment of mark within visible area
    */
    public void scrollToMark(@Nonnull TextMark mark, double within_margin, boolean use_align, double xalign, double yalign)  {
        JnaTextView.INST().gtk_text_view_scroll_to_mark(asCPointer(), asCPointerNotNull(mark), within_margin, use_align, xalign, yalign);
    }

    /**
     * Sets the behavior of the text widget when the &lt;kbd&gt;Tab&lt;/kbd&gt; key is pressed.
     * <br>
     * <br>If &#64;accepts_tab is %TRUE, a tab character is inserted. If &#64;accepts_tab
     * <br>is %FALSE the keyboard focus is moved to the next widget in the focus
     * <br>chain.
     * @param accepts_tab %TRUE if pressing the Tab key should insert a tab    character, %FALSE, if pressing the Tab key should move the    keyboard focus.
    */
    public void setAcceptsTab(boolean accepts_tab)  {
        JnaTextView.INST().gtk_text_view_set_accepts_tab(asCPointer(), accepts_tab);
    }

    /**
     * Sets the bottom margin for text in &#64;text_view.
     * <br>
     * <br>Note that this function is confusingly named.
     * <br>In CSS terms, the value set here is padding.
     * @param bottom_margin bottom margin in pixels
    */
    public void setBottomMargin(int bottom_margin)  {
        JnaTextView.INST().gtk_text_view_set_bottom_margin(asCPointer(), bottom_margin);
    }

    /**
     * Sets &#64;buffer as the buffer being displayed by &#64;text_view.
     * <br>
     * <br>The previous buffer displayed by the text view is unreferenced, and
     * <br>a reference is added to &#64;buffer. If you owned a reference to &#64;buffer
     * <br>before passing it to this function, you must remove that reference
     * <br>yourself; `GtkTextView` will not “adopt” it.
     * @param buffer a `GtkTextBuffer`
    */
    public void setBuffer(@Nullable TextBuffer buffer)  {
        JnaTextView.INST().gtk_text_view_set_buffer(asCPointer(), asCPointer(buffer));
    }

    /**
     * Toggles whether the insertion point should be displayed.
     * <br>
     * <br>A buffer with no editable text probably shouldn’t have a visible
     * <br>cursor, so you may want to turn the cursor off.
     * <br>
     * <br>Note that this property may be overridden by the
     * <br>[property&#64;GtkSettings:gtk-keynav-use-caret] setting.
     * @param setting whether to show the insertion cursor
    */
    public void setCursorVisible(boolean setting)  {
        JnaTextView.INST().gtk_text_view_set_cursor_visible(asCPointer(), setting);
    }

    /**
     * Sets the default editability of the `GtkTextView`.
     * <br>
     * <br>You can override this default setting with tags in the buffer,
     * <br>using the “editable” attribute of tags.
     * @param setting whether it’s editable
    */
    public void setEditable(boolean setting)  {
        JnaTextView.INST().gtk_text_view_set_editable(asCPointer(), setting);
    }

    /**
     * Sets a menu model to add when constructing the context
     * <br>menu for &#64;text_view.
     * <br>
     * <br>You can pass %NULL to remove a previously set extra menu.
     * @param model a `GMenuModel`
    */
    public void setExtraMenu(@Nullable ch.bailu.gtk.gio.MenuModel model)  {
        JnaTextView.INST().gtk_text_view_set_extra_menu(asCPointer(), asCPointer(model));
    }

    /**
     * Places &#64;widget into the gutter specified by &#64;win.
     * <br>
     * <br>&#64;win must be one of %GTK_TEXT_WINDOW_LEFT, %GTK_TEXT_WINDOW_RIGHT,
     * <br>%GTK_TEXT_WINDOW_TOP, or %GTK_TEXT_WINDOW_BOTTOM.
     * @param win a `GtkTextWindowType`
     * @param widget a `GtkWidget`
    */
    public void setGutter(int win, @Nullable Widget widget)  {
        JnaTextView.INST().gtk_text_view_set_gutter(asCPointer(), win, asCPointer(widget));
    }

    /**
     * Sets the default indentation for paragraphs in &#64;text_view.
     * <br>
     * <br>Tags in the buffer may override the default.
     * @param indent indentation in pixels
    */
    public void setIndent(int indent)  {
        JnaTextView.INST().gtk_text_view_set_indent(asCPointer(), indent);
    }

    /**
     * Sets the `input-hints` of the `GtkTextView`.
     * <br>
     * <br>The `input-hints` allow input methods to fine-tune
     * <br>their behaviour.
     * @param hints the hints
    */
    public void setInputHints(int hints)  {
        JnaTextView.INST().gtk_text_view_set_input_hints(asCPointer(), hints);
    }

    /**
     * Sets the `input-purpose` of the `GtkTextView`.
     * <br>
     * <br>The `input-purpose` can be used by on-screen keyboards
     * <br>and other input methods to adjust their behaviour.
     * @param purpose the purpose
    */
    public void setInputPurpose(int purpose)  {
        JnaTextView.INST().gtk_text_view_set_input_purpose(asCPointer(), purpose);
    }

    /**
     * Sets the default justification of text in &#64;text_view.
     * <br>
     * <br>Tags in the view’s buffer may override the default.
     * @param justification justification
    */
    public void setJustification(int justification)  {
        JnaTextView.INST().gtk_text_view_set_justification(asCPointer(), justification);
    }

    /**
     * Sets the default left margin for text in &#64;text_view.
     * <br>
     * <br>Tags in the buffer may override the default.
     * <br>
     * <br>Note that this function is confusingly named.
     * <br>In CSS terms, the value set here is padding.
     * @param left_margin left margin in pixels
    */
    public void setLeftMargin(int left_margin)  {
        JnaTextView.INST().gtk_text_view_set_left_margin(asCPointer(), left_margin);
    }

    /**
     * Sets whether the `GtkTextView` should display text in
     * <br>monospace styling.
     * @param monospace %TRUE to request monospace styling
    */
    public void setMonospace(boolean monospace)  {
        JnaTextView.INST().gtk_text_view_set_monospace(asCPointer(), monospace);
    }

    /**
     * Changes the `GtkTextView` overwrite mode.
     * @param overwrite %TRUE to turn on overwrite mode, %FALSE to turn it off
    */
    public void setOverwrite(boolean overwrite)  {
        JnaTextView.INST().gtk_text_view_set_overwrite(asCPointer(), overwrite);
    }

    /**
     * Sets the default number of blank pixels above paragraphs in &#64;text_view.
     * <br>
     * <br>Tags in the buffer for &#64;text_view may override the defaults.
     * @param pixels_above_lines pixels above paragraphs
    */
    public void setPixelsAboveLines(int pixels_above_lines)  {
        JnaTextView.INST().gtk_text_view_set_pixels_above_lines(asCPointer(), pixels_above_lines);
    }

    /**
     * Sets the default number of pixels of blank space
     * <br>to put below paragraphs in &#64;text_view.
     * <br>
     * <br>May be overridden by tags applied to &#64;text_view’s buffer.
     * @param pixels_below_lines pixels below paragraphs
    */
    public void setPixelsBelowLines(int pixels_below_lines)  {
        JnaTextView.INST().gtk_text_view_set_pixels_below_lines(asCPointer(), pixels_below_lines);
    }

    /**
     * Sets the default number of pixels of blank space to leave between
     * <br>display/wrapped lines within a paragraph.
     * <br>
     * <br>May be overridden by tags in &#64;text_view’s buffer.
     * @param pixels_inside_wrap default number of pixels between wrapped lines
    */
    public void setPixelsInsideWrap(int pixels_inside_wrap)  {
        JnaTextView.INST().gtk_text_view_set_pixels_inside_wrap(asCPointer(), pixels_inside_wrap);
    }

    /**
     * Sets the default right margin for text in the text view.
     * <br>
     * <br>Tags in the buffer may override the default.
     * <br>
     * <br>Note that this function is confusingly named.
     * <br>In CSS terms, the value set here is padding.
     * @param right_margin right margin in pixels
    */
    public void setRightMargin(int right_margin)  {
        JnaTextView.INST().gtk_text_view_set_right_margin(asCPointer(), right_margin);
    }

    /**
     * Sets the default tab stops for paragraphs in &#64;text_view.
     * <br>
     * <br>Tags in the buffer may override the default.
     * @param tabs tabs as a `PangoTabArray`
    */
    public void setTabs(@Nonnull ch.bailu.gtk.pango.TabArray tabs)  {
        JnaTextView.INST().gtk_text_view_set_tabs(asCPointer(), asCPointerNotNull(tabs));
    }

    /**
     * Sets the top margin for text in &#64;text_view.
     * <br>
     * <br>Note that this function is confusingly named.
     * <br>In CSS terms, the value set here is padding.
     * @param top_margin top margin in pixels
    */
    public void setTopMargin(int top_margin)  {
        JnaTextView.INST().gtk_text_view_set_top_margin(asCPointer(), top_margin);
    }

    /**
     * Sets the line wrapping for the view.
     * @param wrap_mode a `GtkWrapMode`
    */
    public void setWrapMode(int wrap_mode)  {
        JnaTextView.INST().gtk_text_view_set_wrap_mode(asCPointer(), wrap_mode);
    }

    /**
     * Determines whether &#64;iter is at the start of a display line.
     * <br>
     * <br>See [method&#64;Gtk.TextView.forward_display_line] for an
     * <br>explanation of display lines vs. paragraphs.
     * @param iter a `GtkTextIter`
     * @return %TRUE if &#64;iter begins a wrapped line
    */
    public boolean startsDisplayLine(@Nonnull TextIter iter)  {
        return JnaTextView.INST().gtk_text_view_starts_display_line(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Converts coordinates on the window identified by &#64;win to buffer
     * <br>coordinates.
     * @param win a `GtkTextWindowType`
     * @param window_x window x coordinate
     * @param window_y window y coordinate
     * @param buffer_x buffer x coordinate return location
     * @param buffer_y buffer y coordinate return location
    */
    public void windowToBufferCoords(int win, int window_x, int window_y, @Nullable ch.bailu.gtk.type.Int buffer_x, @Nullable ch.bailu.gtk.type.Int buffer_y)  {
        JnaTextView.INST().gtk_text_view_window_to_buffer_coords(asCPointer(), win, window_x, window_y, asCPointer(buffer_x), asCPointer(buffer_y));
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

    public final static String SIGNAL_ON_EXTEND_SELECTION = "extend-selection";
    
    /**
     * Connect to signal "extend-selection".
     * <br>See {@link OnExtendSelection#onExtendSelection} for signal description.
     * <br>Field {@link #SIGNAL_ON_EXTEND_SELECTION} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onExtendSelection(OnExtendSelection signal) {
        return connectSignal(SIGNAL_ON_EXTEND_SELECTION, toOnExtendSelection(signal));
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

    public final static String SIGNAL_ON_MOVE_VIEWPORT = "move-viewport";
    
    /**
     * Connect to signal "move-viewport".
     * <br>See {@link OnMoveViewport#onMoveViewport} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOVE_VIEWPORT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMoveViewport(OnMoveViewport signal) {
        return connectSignal(SIGNAL_ON_MOVE_VIEWPORT, toOnMoveViewport(signal));
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

    public final static String SIGNAL_ON_SELECT_ALL = "select-all";
    
    /**
     * Connect to signal "select-all".
     * <br>See {@link OnSelectAll#onSelectAll} for signal description.
     * <br>Field {@link #SIGNAL_ON_SELECT_ALL} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSelectAll(OnSelectAll signal) {
        return connectSignal(SIGNAL_ON_SELECT_ALL, toOnSelectAll(signal));
    }

    public final static String SIGNAL_ON_SET_ANCHOR = "set-anchor";
    
    /**
     * Connect to signal "set-anchor".
     * <br>See {@link OnSetAnchor#onSetAnchor} for signal description.
     * <br>Field {@link #SIGNAL_ON_SET_ANCHOR} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSetAnchor(OnSetAnchor signal) {
        return connectSignal(SIGNAL_ON_SET_ANCHOR, toOnSetAnchor(signal));
    }

    public final static String SIGNAL_ON_TOGGLE_CURSOR_VISIBLE = "toggle-cursor-visible";
    
    /**
     * Connect to signal "toggle-cursor-visible".
     * <br>See {@link OnToggleCursorVisible#onToggleCursorVisible} for signal description.
     * <br>Field {@link #SIGNAL_ON_TOGGLE_CURSOR_VISIBLE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onToggleCursorVisible(OnToggleCursorVisible signal) {
        return connectSignal(SIGNAL_ON_TOGGLE_CURSOR_VISIBLE, toOnToggleCursorVisible(signal));
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
     * Implements interface {@link Scrollable}. Call this to get access to interface functions.
     * @return {@link Scrollable}
    */
    public Scrollable asScrollable() {
        return new Scrollable(cast());
    }

    public static long getTypeID() { 
        return JnaTextView.INST().gtk_text_view_get_type(); 
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
