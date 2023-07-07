/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Stores text and attributes for display in a `GtkTextView`.
 * <br>
 * <br>You may wish to begin by reading the
 * <br>[text widget conceptual overview](section-text-widget.html),
 * <br>which gives an overview of all the objects and data types
 * <br>related to the text widget and how they work together.
 * <br>
 * <br>GtkTextBuffer can support undoing changes to the buffer
 * <br>content, see [method&#64;Gtk.TextBuffer.set_enable_undo].
 * <p><a href="https://docs.gtk.org/gtk4/class.TextBuffer.html">https://docs.gtk.org/gtk4/class.TextBuffer.html</a></p>
*/
public class TextBuffer extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TextBuffer.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnApplyTag {
        /**
         * Emitted to apply a tag to a range of text in a `GtkTextBuffer`.
         * <br>
         * <br>Applying actually occurs in the default handler.
         * <br>
         * <br>Note that if your handler runs before the default handler
         * <br>it must not invalidate the &#64;start and &#64;end iters (or has to
         * <br>revalidate them).
         * <br>
         * <br>See also:
         * <br>[method&#64;Gtk.TextBuffer.apply_tag],
         * <br>[method&#64;Gtk.TextBuffer.insert_with_tags],
         * <br>[method&#64;Gtk.TextBuffer.insert_range].
         * @param tag the applied tag
         * @param start the start of the range the tag is applied to
         * @param end the end of the range the tag is applied to
        */
        void onApplyTag(@Nonnull TextTag tag, @Nonnull TextIter start, @Nonnull TextIter end);
    }
    
    private static com.sun.jna.Callback toOnApplyTag(OnApplyTag in) {
        return (in == null) ? null: (JnaTextBuffer.OnApplyTag) (__self, _tag, _start, _end, __data) -> in.onApplyTag(new TextTag(new PointerContainer(_tag)), new TextIter(new PointerContainer(_start)), new TextIter(new PointerContainer(_end)));
    }

    @FunctionalInterface
    public interface OnBeginUserAction {
        /**
         * Emitted at the beginning of a single user-visible
         * <br>operation on a `GtkTextBuffer`.
         * <br>
         * <br>See also:
         * <br>[method&#64;Gtk.TextBuffer.begin_user_action],
         * <br>[method&#64;Gtk.TextBuffer.insert_interactive],
         * <br>[method&#64;Gtk.TextBuffer.insert_range_interactive],
         * <br>[method&#64;Gtk.TextBuffer.delete_interactive],
         * <br>[method&#64;Gtk.TextBuffer.backspace],
         * <br>[method&#64;Gtk.TextBuffer.delete_selection].
        */
        void onBeginUserAction();
    }
    
    private static com.sun.jna.Callback toOnBeginUserAction(OnBeginUserAction in) {
        return (in == null) ? null: (JnaTextBuffer.OnBeginUserAction) (__self, __data) -> in.onBeginUserAction();
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted when the content of a `GtkTextBuffer` has changed.
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaTextBuffer.OnChanged) (__self, __data) -> in.onChanged();
    }

    @FunctionalInterface
    public interface OnDeleteRange {
        /**
         * Emitted to delete a range from a `GtkTextBuffer`.
         * <br>
         * <br>Note that if your handler runs before the default handler
         * <br>it must not invalidate the &#64;start and &#64;end iters (or has
         * <br>to revalidate them). The default signal handler revalidates
         * <br>the &#64;start and &#64;end iters to both point to the location
         * <br>where text was deleted. Handlers which run after the default
         * <br>handler (see g_signal_connect_after()) do not have access to
         * <br>the deleted text.
         * <br>
         * <br>See also: [method&#64;Gtk.TextBuffer.delete].
         * @param start the start of the range to be deleted
         * @param end the end of the range to be deleted
        */
        void onDeleteRange(@Nonnull TextIter start, @Nonnull TextIter end);
    }
    
    private static com.sun.jna.Callback toOnDeleteRange(OnDeleteRange in) {
        return (in == null) ? null: (JnaTextBuffer.OnDeleteRange) (__self, _start, _end, __data) -> in.onDeleteRange(new TextIter(new PointerContainer(_start)), new TextIter(new PointerContainer(_end)));
    }

    @FunctionalInterface
    public interface OnEndUserAction {
        /**
         * Emitted at the end of a single user-visible
         * <br>operation on the `GtkTextBuffer`.
         * <br>
         * <br>See also:
         * <br>[method&#64;Gtk.TextBuffer.end_user_action],
         * <br>[method&#64;Gtk.TextBuffer.insert_interactive],
         * <br>[method&#64;Gtk.TextBuffer.insert_range_interactive],
         * <br>[method&#64;Gtk.TextBuffer.delete_interactive],
         * <br>[method&#64;Gtk.TextBuffer.backspace],
         * <br>[method&#64;Gtk.TextBuffer.delete_selection],
         * <br>[method&#64;Gtk.TextBuffer.backspace].
        */
        void onEndUserAction();
    }
    
    private static com.sun.jna.Callback toOnEndUserAction(OnEndUserAction in) {
        return (in == null) ? null: (JnaTextBuffer.OnEndUserAction) (__self, __data) -> in.onEndUserAction();
    }

    @FunctionalInterface
    public interface OnInsertChildAnchor {
        /**
         * Emitted to insert a `GtkTextChildAnchor` in a `GtkTextBuffer`.
         * <br>
         * <br>Insertion actually occurs in the default handler.
         * <br>
         * <br>Note that if your handler runs before the default handler
         * <br>it must not invalidate the &#64;location iter (or has to
         * <br>revalidate it). The default signal handler revalidates
         * <br>it to be placed after the inserted &#64;anchor.
         * <br>
         * <br>See also: [method&#64;Gtk.TextBuffer.insert_child_anchor].
         * @param location position to insert &#64;anchor in &#64;textbuffer
         * @param anchor the `GtkTextChildAnchor` to be inserted
        */
        void onInsertChildAnchor(@Nonnull TextIter location, @Nonnull TextChildAnchor anchor);
    }
    
    private static com.sun.jna.Callback toOnInsertChildAnchor(OnInsertChildAnchor in) {
        return (in == null) ? null: (JnaTextBuffer.OnInsertChildAnchor) (__self, _location, _anchor, __data) -> in.onInsertChildAnchor(new TextIter(new PointerContainer(_location)), new TextChildAnchor(new PointerContainer(_anchor)));
    }

    @FunctionalInterface
    public interface OnInsertPaintable {
        /**
         * Emitted to insert a `GdkPaintable` in a `GtkTextBuffer`.
         * <br>
         * <br>Insertion actually occurs in the default handler.
         * <br>
         * <br>Note that if your handler runs before the default handler
         * <br>it must not invalidate the &#64;location iter (or has to
         * <br>revalidate it). The default signal handler revalidates
         * <br>it to be placed after the inserted &#64;paintable.
         * <br>
         * <br>See also: [method&#64;Gtk.TextBuffer.insert_paintable].
         * @param location position to insert &#64;paintable in &#64;textbuffer
         * @param paintable the `GdkPaintable` to be inserted
        */
        void onInsertPaintable(@Nonnull TextIter location, @Nonnull ch.bailu.gtk.gdk.Paintable paintable);
    }
    
    private static com.sun.jna.Callback toOnInsertPaintable(OnInsertPaintable in) {
        return (in == null) ? null: (JnaTextBuffer.OnInsertPaintable) (__self, _location, _paintable, __data) -> in.onInsertPaintable(new TextIter(new PointerContainer(_location)), new ch.bailu.gtk.gdk.Paintable(new PointerContainer(_paintable)));
    }

    @FunctionalInterface
    public interface OnInsertText {
        /**
         * Emitted to insert text in a `GtkTextBuffer`.
         * <br>
         * <br>Insertion actually occurs in the default handler.
         * <br>
         * <br>Note that if your handler runs before the default handler
         * <br>it must not invalidate the &#64;location iter (or has to
         * <br>revalidate it). The default signal handler revalidates
         * <br>it to point to the end of the inserted text.
         * <br>
         * <br>See also: [method&#64;Gtk.TextBuffer.insert],
         * <br>[method&#64;Gtk.TextBuffer.insert_range].
         * @param location position to insert &#64;text in &#64;textbuffer
         * @param text the UTF-8 text to be inserted
         * @param len length of the inserted text in bytes
        */
        void onInsertText(@Nonnull TextIter location, @Nonnull ch.bailu.gtk.type.Str text, int len);
    }
    
    private static com.sun.jna.Callback toOnInsertText(OnInsertText in) {
        return (in == null) ? null: (JnaTextBuffer.OnInsertText) (__self, _location, _text, _len, __data) -> in.onInsertText(new TextIter(new PointerContainer(_location)), new ch.bailu.gtk.type.Str(new PointerContainer(_text)), _len);
    }

    @FunctionalInterface
    public interface OnMarkDeleted {
        /**
         * Emitted as notification after a `GtkTextMark` is deleted.
         * <br>
         * <br>See also: [method&#64;Gtk.TextBuffer.delete_mark].
         * @param mark The mark that was deleted
        */
        void onMarkDeleted(@Nonnull TextMark mark);
    }
    
    private static com.sun.jna.Callback toOnMarkDeleted(OnMarkDeleted in) {
        return (in == null) ? null: (JnaTextBuffer.OnMarkDeleted) (__self, _mark, __data) -> in.onMarkDeleted(new TextMark(new PointerContainer(_mark)));
    }

    @FunctionalInterface
    public interface OnMarkSet {
        /**
         * Emitted as notification after a `GtkTextMark` is set.
         * <br>
         * <br>See also:
         * <br>[method&#64;Gtk.TextBuffer.create_mark],
         * <br>[method&#64;Gtk.TextBuffer.move_mark].
         * @param location The location of &#64;mark in &#64;textbuffer
         * @param mark The mark that is set
        */
        void onMarkSet(@Nonnull TextIter location, @Nonnull TextMark mark);
    }
    
    private static com.sun.jna.Callback toOnMarkSet(OnMarkSet in) {
        return (in == null) ? null: (JnaTextBuffer.OnMarkSet) (__self, _location, _mark, __data) -> in.onMarkSet(new TextIter(new PointerContainer(_location)), new TextMark(new PointerContainer(_mark)));
    }

    @FunctionalInterface
    public interface OnModifiedChanged {
        /**
         * Emitted when the modified bit of a `GtkTextBuffer` flips.
         * <br>
         * <br>See also: [method&#64;Gtk.TextBuffer.set_modified].
        */
        void onModifiedChanged();
    }
    
    private static com.sun.jna.Callback toOnModifiedChanged(OnModifiedChanged in) {
        return (in == null) ? null: (JnaTextBuffer.OnModifiedChanged) (__self, __data) -> in.onModifiedChanged();
    }

    @FunctionalInterface
    public interface OnPasteDone {
        /**
         * Emitted after paste operation has been completed.
         * <br>
         * <br>This is useful to properly scroll the view to the end
         * <br>of the pasted text. See [method&#64;Gtk.TextBuffer.paste_clipboard]
         * <br>for more details.
         * @param clipboard the `GdkClipboard` pasted from
        */
        void onPasteDone(@Nonnull ch.bailu.gtk.gdk.Clipboard clipboard);
    }
    
    private static com.sun.jna.Callback toOnPasteDone(OnPasteDone in) {
        return (in == null) ? null: (JnaTextBuffer.OnPasteDone) (__self, _clipboard, __data) -> in.onPasteDone(new ch.bailu.gtk.gdk.Clipboard(new PointerContainer(_clipboard)));
    }

    @FunctionalInterface
    public interface OnRedo {
        /**
         * Emitted when a request has been made to redo the
         * <br>previously undone operation.
        */
        void onRedo();
    }
    
    private static com.sun.jna.Callback toOnRedo(OnRedo in) {
        return (in == null) ? null: (JnaTextBuffer.OnRedo) (__self, __data) -> in.onRedo();
    }

    @FunctionalInterface
    public interface OnRemoveTag {
        /**
         * Emitted to remove all occurrences of &#64;tag from a range
         * <br>of text in a `GtkTextBuffer`.
         * <br>
         * <br>Removal actually occurs in the default handler.
         * <br>
         * <br>Note that if your handler runs before the default handler
         * <br>it must not invalidate the &#64;start and &#64;end iters (or has
         * <br>to revalidate them).
         * <br>
         * <br>See also: [method&#64;Gtk.TextBuffer.remove_tag].
         * @param tag the tag to be removed
         * @param start the start of the range the tag is removed from
         * @param end the end of the range the tag is removed from
        */
        void onRemoveTag(@Nonnull TextTag tag, @Nonnull TextIter start, @Nonnull TextIter end);
    }
    
    private static com.sun.jna.Callback toOnRemoveTag(OnRemoveTag in) {
        return (in == null) ? null: (JnaTextBuffer.OnRemoveTag) (__self, _tag, _start, _end, __data) -> in.onRemoveTag(new TextTag(new PointerContainer(_tag)), new TextIter(new PointerContainer(_start)), new TextIter(new PointerContainer(_end)));
    }

    @FunctionalInterface
    public interface OnUndo {
        /**
         * Emitted when a request has been made to undo the
         * <br>previous operation or set of operations that have
         * <br>been grouped together.
        */
        void onUndo();
    }
    
    private static com.sun.jna.Callback toOnUndo(OnUndo in) {
        return (in == null) ? null: (JnaTextBuffer.OnUndo) (__self, __data) -> in.onUndo();
    }

    public TextBuffer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new text buffer.
     * @param table a tag table, or %NULL to create a new one
    */
    public TextBuffer(@Nullable TextTagTable table) {
        super(cast(JnaTextBuffer.INST().gtk_text_buffer_new(asCPointer(table))));
    }

    /**
     * Adds the mark at position &#64;where.
     * <br>
     * <br>The mark must not be added to another buffer, and if its name
     * <br>is not %NULL then there must not be another mark in the buffer
     * <br>with the same name.
     * <br>
     * <br>Emits the [signal&#64;Gtk.TextBuffer::mark-set] signal as notification
     * <br>of the mark's initial placement.
     * @param mark the mark to add
     * @param where location to place mark
    */
    public void addMark(@Nonnull TextMark mark, @Nonnull TextIter where)  {
        JnaTextBuffer.INST().gtk_text_buffer_add_mark(asCPointer(), asCPointerNotNull(mark), asCPointerNotNull(where));
    }

    /**
     * Adds &#64;clipboard to the list of clipboards in which the selection
     * <br>contents of &#64;buffer are available.
     * <br>
     * <br>In most cases, &#64;clipboard will be the `GdkClipboard` returned by
     * <br>[method&#64;Gtk.Widget.get_primary_clipboard] for a view of &#64;buffer.
     * @param clipboard a `GdkClipboard`
    */
    public void addSelectionClipboard(@Nonnull ch.bailu.gtk.gdk.Clipboard clipboard)  {
        JnaTextBuffer.INST().gtk_text_buffer_add_selection_clipboard(asCPointer(), asCPointerNotNull(clipboard));
    }

    /**
     * Emits the “apply-tag” signal on &#64;buffer.
     * <br>
     * <br>The default handler for the signal applies
     * <br>&#64;tag to the given range. &#64;start and &#64;end do
     * <br>not have to be in order.
     * @param tag a `GtkTextTag`
     * @param start one bound of range to be tagged
     * @param end other bound of range to be tagged
    */
    public void applyTag(@Nonnull TextTag tag, @Nonnull TextIter start, @Nonnull TextIter end)  {
        JnaTextBuffer.INST().gtk_text_buffer_apply_tag(asCPointer(), asCPointerNotNull(tag), asCPointerNotNull(start), asCPointerNotNull(end));
    }

    /**
     * Emits the “apply-tag” signal on &#64;buffer.
     * <br>
     * <br>Calls [method&#64;Gtk.TextTagTable.lookup] on the buffer’s
     * <br>tag table to get a `GtkTextTag`, then calls
     * <br>[method&#64;Gtk.TextBuffer.apply_tag].
     * @param name name of a named `GtkTextTag`
     * @param start one bound of range to be tagged
     * @param end other bound of range to be tagged
    */
    public void applyTagByName(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull TextIter start, @Nonnull TextIter end)  {
        JnaTextBuffer.INST().gtk_text_buffer_apply_tag_by_name(asCPointer(), asCPointerNotNull(name), asCPointerNotNull(start), asCPointerNotNull(end));
    }

    /**
     * Emits the “apply-tag” signal on &#64;buffer.
     * <br>
     * <br>Calls [method&#64;Gtk.TextTagTable.lookup] on the buffer’s
     * <br>tag table to get a `GtkTextTag`, then calls
     * <br>[method&#64;Gtk.TextBuffer.apply_tag].
     * @param name name of a named `GtkTextTag`
     * @param start one bound of range to be tagged
     * @param end other bound of range to be tagged
    */
    public void applyTagByName(String name, @Nonnull TextIter start, @Nonnull TextIter end)  {
        JnaTextBuffer.INST().gtk_text_buffer_apply_tag_by_name(asCPointer(), name, asCPointerNotNull(start), asCPointerNotNull(end));
    }

    /**
     * Performs the appropriate action as if the user hit the delete
     * <br>key with the cursor at the position specified by &#64;iter.
     * <br>
     * <br>In the normal case a single character will be deleted, but when
     * <br>combining accents are involved, more than one character can
     * <br>be deleted, and when precomposed character and accent combinations
     * <br>are involved, less than one character will be deleted.
     * <br>
     * <br>Because the buffer is modified, all outstanding iterators become
     * <br>invalid after calling this function; however, the &#64;iter will be
     * <br>re-initialized to point to the location where text was deleted.
     * @param iter a position in &#64;buffer
     * @param interactive whether the deletion is caused by user interaction
     * @param default_editable whether the buffer is editable by default
     * @return %TRUE if the buffer was modified
    */
    public boolean backspace(@Nonnull TextIter iter, boolean interactive, boolean default_editable)  {
        return JnaTextBuffer.INST().gtk_text_buffer_backspace(asCPointer(), asCPointerNotNull(iter), interactive, default_editable);
    }

    /**
     * Denotes the beginning of an action that may not be undone.
     * <br>
     * <br>This will cause any previous operations in the undo/redo queue
     * <br>to be cleared.
     * <br>
     * <br>This should be paired with a call to
     * <br>[method&#64;Gtk.TextBuffer.end_irreversible_action] after the irreversible
     * <br>action has completed.
     * <br>
     * <br>You may nest calls to gtk_text_buffer_begin_irreversible_action()
     * <br>and gtk_text_buffer_end_irreversible_action() pairs.
    */
    public void beginIrreversibleAction()  {
        JnaTextBuffer.INST().gtk_text_buffer_begin_irreversible_action(asCPointer());
    }

    /**
     * Called to indicate that the buffer operations between here and a
     * <br>call to gtk_text_buffer_end_user_action() are part of a single
     * <br>user-visible operation.
     * <br>
     * <br>The operations between gtk_text_buffer_begin_user_action() and
     * <br>gtk_text_buffer_end_user_action() can then be grouped when creating
     * <br>an undo stack. `GtkTextBuffer` maintains a count of calls to
     * <br>gtk_text_buffer_begin_user_action() that have not been closed with
     * <br>a call to gtk_text_buffer_end_user_action(), and emits the
     * <br>“begin-user-action” and “end-user-action” signals only for the
     * <br>outermost pair of calls. This allows you to build user actions
     * <br>from other user actions.
     * <br>
     * <br>The “interactive” buffer mutation functions, such as
     * <br>[method&#64;Gtk.TextBuffer.insert_interactive], automatically call
     * <br>begin/end user action around the buffer operations they perform,
     * <br>so there's no need to add extra calls if you user action consists
     * <br>solely of a single call to one of those functions.
    */
    public void beginUserAction()  {
        JnaTextBuffer.INST().gtk_text_buffer_begin_user_action(asCPointer());
    }

    /**
     * Copies the currently-selected text to a clipboard.
     * @param clipboard the `GdkClipboard` object to copy to
    */
    public void copyClipboard(@Nonnull ch.bailu.gtk.gdk.Clipboard clipboard)  {
        JnaTextBuffer.INST().gtk_text_buffer_copy_clipboard(asCPointer(), asCPointerNotNull(clipboard));
    }

    /**
     * Creates and inserts a child anchor.
     * <br>
     * <br>This is a convenience function which simply creates a child anchor
     * <br>with [ctor&#64;Gtk.TextChildAnchor.new] and inserts it into the buffer
     * <br>with [method&#64;Gtk.TextBuffer.insert_child_anchor].
     * <br>
     * <br>The new anchor is owned by the buffer; no reference count is
     * <br>returned to the caller of this function.
     * @param iter location in the buffer
     * @return the created child anchor
    */
    public TextChildAnchor createChildAnchor(@Nonnull TextIter iter)  {
        return new TextChildAnchor(new PointerContainer(JnaTextBuffer.INST().gtk_text_buffer_create_child_anchor(asCPointer(), asCPointerNotNull(iter))));
    }

    /**
     * Creates a mark at position &#64;where.
     * <br>
     * <br>If &#64;mark_name is %NULL, the mark is anonymous; otherwise, the mark
     * <br>can be retrieved by name using [method&#64;Gtk.TextBuffer.get_mark].
     * <br>If a mark has left gravity, and text is inserted at the mark’s
     * <br>current location, the mark will be moved to the left of the
     * <br>newly-inserted text. If the mark has right gravity
     * <br>(&#64;left_gravity = %FALSE), the mark will end up on the right of
     * <br>newly-inserted text. The standard left-to-right cursor is a mark
     * <br>with right gravity (when you type, the cursor stays on the right
     * <br>side of the text you’re typing).
     * <br>
     * <br>The caller of this function does not own a
     * <br>reference to the returned `GtkTextMark`, so you can ignore the
     * <br>return value if you like. Marks are owned by the buffer and go
     * <br>away when the buffer does.
     * <br>
     * <br>Emits the [signal&#64;Gtk.TextBuffer::mark-set] signal as notification
     * <br>of the mark's initial placement.
     * @param mark_name name for mark
     * @param where location to place mark
     * @param left_gravity whether the mark has left gravity
     * @return the new `GtkTextMark` object
    */
    public TextMark createMark(@Nullable ch.bailu.gtk.type.Str mark_name, @Nonnull TextIter where, boolean left_gravity)  {
        return new TextMark(new PointerContainer(JnaTextBuffer.INST().gtk_text_buffer_create_mark(asCPointer(), asCPointer(mark_name), asCPointerNotNull(where), left_gravity)));
    }

    /**
     * Creates a mark at position &#64;where.
     * <br>
     * <br>If &#64;mark_name is %NULL, the mark is anonymous; otherwise, the mark
     * <br>can be retrieved by name using [method&#64;Gtk.TextBuffer.get_mark].
     * <br>If a mark has left gravity, and text is inserted at the mark’s
     * <br>current location, the mark will be moved to the left of the
     * <br>newly-inserted text. If the mark has right gravity
     * <br>(&#64;left_gravity = %FALSE), the mark will end up on the right of
     * <br>newly-inserted text. The standard left-to-right cursor is a mark
     * <br>with right gravity (when you type, the cursor stays on the right
     * <br>side of the text you’re typing).
     * <br>
     * <br>The caller of this function does not own a
     * <br>reference to the returned `GtkTextMark`, so you can ignore the
     * <br>return value if you like. Marks are owned by the buffer and go
     * <br>away when the buffer does.
     * <br>
     * <br>Emits the [signal&#64;Gtk.TextBuffer::mark-set] signal as notification
     * <br>of the mark's initial placement.
     * @param mark_name name for mark
     * @param where location to place mark
     * @param left_gravity whether the mark has left gravity
     * @return the new `GtkTextMark` object
    */
    public TextMark createMark(String mark_name, @Nonnull TextIter where, boolean left_gravity)  {
        return new TextMark(new PointerContainer(JnaTextBuffer.INST().gtk_text_buffer_create_mark(asCPointer(), mark_name, asCPointerNotNull(where), left_gravity)));
    }

    /**
     * Creates a tag and adds it to the tag table for &#64;buffer.
     * <br>
     * <br>Equivalent to calling [ctor&#64;Gtk.TextTag.new] and then adding the
     * <br>tag to the buffer’s tag table. The returned tag is owned by
     * <br>the buffer’s tag table, so the ref count will be equal to one.
     * <br>
     * <br>If &#64;tag_name is %NULL, the tag is anonymous.
     * <br>
     * <br>If &#64;tag_name is non-%NULL, a tag called &#64;tag_name must not already
     * <br>exist in the tag table for this buffer.
     * <br>
     * <br>The &#64;first_property_name argument and subsequent arguments are a list
     * <br>of properties to set on the tag, as with g_object_set().
     * @param tag_name name of the new tag
     * @param first_property_name name of first property to set
     * @param _elipse %NULL-terminated list of property names and values
     * @return a new tag
    */
    public TextTag createTag(@Nullable ch.bailu.gtk.type.Str tag_name, @Nullable ch.bailu.gtk.type.Str first_property_name, java.lang.Object... _elipse)  {
        return new TextTag(new PointerContainer(JnaTextBuffer.INST().gtk_text_buffer_create_tag(asCPointer(), asCPointer(tag_name), asCPointer(first_property_name), _elipse)));
    }

    /**
     * Creates a tag and adds it to the tag table for &#64;buffer.
     * <br>
     * <br>Equivalent to calling [ctor&#64;Gtk.TextTag.new] and then adding the
     * <br>tag to the buffer’s tag table. The returned tag is owned by
     * <br>the buffer’s tag table, so the ref count will be equal to one.
     * <br>
     * <br>If &#64;tag_name is %NULL, the tag is anonymous.
     * <br>
     * <br>If &#64;tag_name is non-%NULL, a tag called &#64;tag_name must not already
     * <br>exist in the tag table for this buffer.
     * <br>
     * <br>The &#64;first_property_name argument and subsequent arguments are a list
     * <br>of properties to set on the tag, as with g_object_set().
     * @param tag_name name of the new tag
     * @param first_property_name name of first property to set
     * @param _elipse %NULL-terminated list of property names and values
     * @return a new tag
    */
    public TextTag createTag(String tag_name, String first_property_name, java.lang.Object... _elipse)  {
        return new TextTag(new PointerContainer(JnaTextBuffer.INST().gtk_text_buffer_create_tag(asCPointer(), tag_name, first_property_name, _elipse)));
    }

    /**
     * Copies the currently-selected text to a clipboard,
     * <br>then deletes said text if it’s editable.
     * @param clipboard the `GdkClipboard` object to cut to
     * @param default_editable default editability of the buffer
    */
    public void cutClipboard(@Nonnull ch.bailu.gtk.gdk.Clipboard clipboard, boolean default_editable)  {
        JnaTextBuffer.INST().gtk_text_buffer_cut_clipboard(asCPointer(), asCPointerNotNull(clipboard), default_editable);
    }

    /**
     * Deletes text between &#64;start and &#64;end.
     * <br>
     * <br>The order of &#64;start and &#64;end is not actually relevant;
     * <br>gtk_text_buffer_delete() will reorder them.
     * <br>
     * <br>This function actually emits the “delete-range” signal, and
     * <br>the default handler of that signal deletes the text. Because the
     * <br>buffer is modified, all outstanding iterators become invalid after
     * <br>calling this function; however, the &#64;start and &#64;end will be
     * <br>re-initialized to point to the location where text was deleted.
     * @param start a position in &#64;buffer
     * @param end another position in &#64;buffer
    */
    public void delete(@Nonnull TextIter start, @Nonnull TextIter end)  {
        JnaTextBuffer.INST().gtk_text_buffer_delete(asCPointer(), asCPointerNotNull(start), asCPointerNotNull(end));
    }

    /**
     * Deletes all editable text in the given range.
     * <br>
     * <br>Calls [method&#64;Gtk.TextBuffer.delete] for each editable
     * <br>sub-range of [&#64;start,&#64;end). &#64;start and &#64;end are revalidated
     * <br>to point to the location of the last deleted range, or left
     * <br>untouched if no text was deleted.
     * @param start_iter start of range to delete
     * @param end_iter end of range
     * @param default_editable whether the buffer is editable by default
     * @return whether some text was actually deleted
    */
    public boolean deleteInteractive(@Nonnull TextIter start_iter, @Nonnull TextIter end_iter, boolean default_editable)  {
        return JnaTextBuffer.INST().gtk_text_buffer_delete_interactive(asCPointer(), asCPointerNotNull(start_iter), asCPointerNotNull(end_iter), default_editable);
    }

    /**
     * Deletes &#64;mark, so that it’s no longer located anywhere in the
     * <br>buffer.
     * <br>
     * <br>Removes the reference the buffer holds to the mark, so if
     * <br>you haven’t called g_object_ref() on the mark, it will be freed.
     * <br>Even if the mark isn’t freed, most operations on &#64;mark become
     * <br>invalid, until it gets added to a buffer again with
     * <br>[method&#64;Gtk.TextBuffer.add_mark]. Use [method&#64;Gtk.TextMark.get_deleted]
     * <br>to find out if a mark has been removed from its buffer.
     * <br>
     * <br>The [signal&#64;Gtk.TextBuffer::mark-deleted] signal will be emitted as
     * <br>notification after the mark is deleted.
     * @param mark a `GtkTextMark` in &#64;buffer
    */
    public void deleteMark(@Nonnull TextMark mark)  {
        JnaTextBuffer.INST().gtk_text_buffer_delete_mark(asCPointer(), asCPointerNotNull(mark));
    }

    /**
     * Deletes the mark named &#64;name; the mark must exist.
     * <br>
     * <br>See [method&#64;Gtk.TextBuffer.delete_mark] for details.
     * @param name name of a mark in &#64;buffer
    */
    public void deleteMarkByName(@Nonnull ch.bailu.gtk.type.Str name)  {
        JnaTextBuffer.INST().gtk_text_buffer_delete_mark_by_name(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Deletes the mark named &#64;name; the mark must exist.
     * <br>
     * <br>See [method&#64;Gtk.TextBuffer.delete_mark] for details.
     * @param name name of a mark in &#64;buffer
    */
    public void deleteMarkByName(String name)  {
        JnaTextBuffer.INST().gtk_text_buffer_delete_mark_by_name(asCPointer(), name);
    }

    /**
     * Deletes the range between the “insert” and “selection_bound” marks,
     * <br>that is, the currently-selected text.
     * <br>
     * <br>If &#64;interactive is %TRUE, the editability of the selection will be
     * <br>considered (users can’t delete uneditable text).
     * @param interactive whether the deletion is caused by user interaction
     * @param default_editable whether the buffer is editable by default
     * @return whether there was a non-empty selection to delete
    */
    public boolean deleteSelection(boolean interactive, boolean default_editable)  {
        return JnaTextBuffer.INST().gtk_text_buffer_delete_selection(asCPointer(), interactive, default_editable);
    }

    /**
     * Denotes the end of an action that may not be undone.
     * <br>
     * <br>This will cause any previous operations in the undo/redo
     * <br>queue to be cleared.
     * <br>
     * <br>This should be called after completing modifications to the
     * <br>text buffer after [method&#64;Gtk.TextBuffer.begin_irreversible_action]
     * <br>was called.
     * <br>
     * <br>You may nest calls to gtk_text_buffer_begin_irreversible_action()
     * <br>and gtk_text_buffer_end_irreversible_action() pairs.
    */
    public void endIrreversibleAction()  {
        JnaTextBuffer.INST().gtk_text_buffer_end_irreversible_action(asCPointer());
    }

    /**
     * Ends a user-visible operation.
     * <br>
     * <br>Should be paired with a call to
     * <br>[method&#64;Gtk.TextBuffer.begin_user_action].
     * <br>See that function for a full explanation.
    */
    public void endUserAction()  {
        JnaTextBuffer.INST().gtk_text_buffer_end_user_action(asCPointer());
    }

    /**
     * Retrieves the first and last iterators in the buffer, i.e. the
     * <br>entire buffer lies within the range [&#64;start,&#64;end).
     * @param start iterator to initialize with first position in the buffer
     * @param end iterator to initialize with the end iterator
    */
    public void getBounds(@Nonnull TextIter start, @Nonnull TextIter end)  {
        JnaTextBuffer.INST().gtk_text_buffer_get_bounds(asCPointer(), asCPointerNotNull(start), asCPointerNotNull(end));
    }

    /**
     * Gets whether there is a redoable action in the history.
     * @return %TRUE if there is an redoable action
    */
    public boolean getCanRedo()  {
        return JnaTextBuffer.INST().gtk_text_buffer_get_can_redo(asCPointer());
    }

    /**
     * Gets whether there is an undoable action in the history.
     * @return %TRUE if there is an undoable action
    */
    public boolean getCanUndo()  {
        return JnaTextBuffer.INST().gtk_text_buffer_get_can_undo(asCPointer());
    }

    /**
     * Gets the number of characters in the buffer.
     * <br>
     * <br>Note that characters and bytes are not the same, you can’t e.g.
     * <br>expect the contents of the buffer in string form to be this
     * <br>many bytes long.
     * <br>
     * <br>The character count is cached, so this function is very fast.
     * @return number of characters in the buffer
    */
    public int getCharCount()  {
        return JnaTextBuffer.INST().gtk_text_buffer_get_char_count(asCPointer());
    }

    /**
     * Gets whether the buffer is saving modifications to the buffer
     * <br>to allow for undo and redo actions.
     * <br>
     * <br>See [method&#64;Gtk.TextBuffer.begin_irreversible_action] and
     * <br>[method&#64;Gtk.TextBuffer.end_irreversible_action] to create
     * <br>changes to the buffer that cannot be undone.
     * @return 
    */
    public boolean getEnableUndo()  {
        return JnaTextBuffer.INST().gtk_text_buffer_get_enable_undo(asCPointer());
    }

    /**
     * Initializes &#64;iter with the “end iterator,” one past the last valid
     * <br>character in the text buffer.
     * <br>
     * <br>If dereferenced with [method&#64;Gtk.TextIter.get_char], the end
     * <br>iterator has a character value of 0.
     * <br>The entire buffer lies in the range from the first position in
     * <br>the buffer (call [method&#64;Gtk.TextBuffer.get_start_iter] to get
     * <br>character position 0) to the end iterator.
     * @param iter iterator to initialize
    */
    public void getEndIter(@Nonnull TextIter iter)  {
        JnaTextBuffer.INST().gtk_text_buffer_get_end_iter(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Indicates whether the buffer has some text currently selected.
     * @return %TRUE if the there is text selected
    */
    public boolean getHasSelection()  {
        return JnaTextBuffer.INST().gtk_text_buffer_get_has_selection(asCPointer());
    }

    /**
     * Returns the mark that represents the cursor (insertion point).
     * <br>
     * <br>Equivalent to calling [method&#64;Gtk.TextBuffer.get_mark]
     * <br>to get the mark named “insert”, but very slightly more
     * <br>efficient, and involves less typing.
     * @return insertion point mark
    */
    public TextMark getInsert()  {
        return new TextMark(new PointerContainer(JnaTextBuffer.INST().gtk_text_buffer_get_insert(asCPointer())));
    }

    /**
     * Obtains the location of &#64;anchor within &#64;buffer.
     * @param iter an iterator to be initialized
     * @param anchor a child anchor that appears in &#64;buffer
    */
    public void getIterAtChildAnchor(@Nonnull TextIter iter, @Nonnull TextChildAnchor anchor)  {
        JnaTextBuffer.INST().gtk_text_buffer_get_iter_at_child_anchor(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(anchor));
    }

    /**
     * Initializes &#64;iter to the start of the given line.
     * <br>
     * <br>If &#64;line_number is greater than or equal to the number of lines
     * <br>in the &#64;buffer, the end iterator is returned.
     * @param iter iterator to initialize
     * @param line_number line number counting from 0
     * @return whether the exact position has been found
    */
    public boolean getIterAtLine(@Nonnull TextIter iter, int line_number)  {
        return JnaTextBuffer.INST().gtk_text_buffer_get_iter_at_line(asCPointer(), asCPointerNotNull(iter), line_number);
    }

    /**
     * Obtains an iterator pointing to &#64;byte_index within the given line.
     * <br>
     * <br>&#64;byte_index must be the start of a UTF-8 character. Note bytes, not
     * <br>characters; UTF-8 may encode one character as multiple bytes.
     * <br>
     * <br>If &#64;line_number is greater than or equal to the number of lines in the &#64;buffer,
     * <br>the end iterator is returned. And if &#64;byte_index is off the
     * <br>end of the line, the iterator at the end of the line is returned.
     * @param iter iterator to initialize
     * @param line_number line number counting from 0
     * @param byte_index byte index from start of line
     * @return whether the exact position has been found
    */
    public boolean getIterAtLineIndex(@Nonnull TextIter iter, int line_number, int byte_index)  {
        return JnaTextBuffer.INST().gtk_text_buffer_get_iter_at_line_index(asCPointer(), asCPointerNotNull(iter), line_number, byte_index);
    }

    /**
     * Obtains an iterator pointing to &#64;char_offset within the given line.
     * <br>
     * <br>Note characters, not bytes; UTF-8 may encode one character as multiple
     * <br>bytes.
     * <br>
     * <br>If &#64;line_number is greater than or equal to the number of lines in the &#64;buffer,
     * <br>the end iterator is returned. And if &#64;char_offset is off the
     * <br>end of the line, the iterator at the end of the line is returned.
     * @param iter iterator to initialize
     * @param line_number line number counting from 0
     * @param char_offset char offset from start of line
     * @return whether the exact position has been found
    */
    public boolean getIterAtLineOffset(@Nonnull TextIter iter, int line_number, int char_offset)  {
        return JnaTextBuffer.INST().gtk_text_buffer_get_iter_at_line_offset(asCPointer(), asCPointerNotNull(iter), line_number, char_offset);
    }

    /**
     * Initializes &#64;iter with the current position of &#64;mark.
     * @param iter iterator to initialize
     * @param mark a `GtkTextMark` in &#64;buffer
    */
    public void getIterAtMark(@Nonnull TextIter iter, @Nonnull TextMark mark)  {
        JnaTextBuffer.INST().gtk_text_buffer_get_iter_at_mark(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(mark));
    }

    /**
     * Initializes &#64;iter to a position &#64;char_offset chars from the start
     * <br>of the entire buffer.
     * <br>
     * <br>If &#64;char_offset is -1 or greater than the number
     * <br>of characters in the buffer, &#64;iter is initialized to the end iterator,
     * <br>the iterator one past the last valid character in the buffer.
     * @param iter iterator to initialize
     * @param char_offset char offset from start of buffer, counting from 0, or -1
    */
    public void getIterAtOffset(@Nonnull TextIter iter, int char_offset)  {
        JnaTextBuffer.INST().gtk_text_buffer_get_iter_at_offset(asCPointer(), asCPointerNotNull(iter), char_offset);
    }

    /**
     * Obtains the number of lines in the buffer.
     * <br>
     * <br>This value is cached, so the function is very fast.
     * @return number of lines in the buffer
    */
    public int getLineCount()  {
        return JnaTextBuffer.INST().gtk_text_buffer_get_line_count(asCPointer());
    }

    /**
     * Returns the mark named &#64;name in buffer &#64;buffer, or %NULL if no such
     * <br>mark exists in the buffer.
     * @param name a mark name
     * @return a `GtkTextMark`
    */
    public TextMark getMark(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new TextMark(new PointerContainer(JnaTextBuffer.INST().gtk_text_buffer_get_mark(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Returns the mark named &#64;name in buffer &#64;buffer, or %NULL if no such
     * <br>mark exists in the buffer.
     * @param name a mark name
     * @return a `GtkTextMark`
    */
    public TextMark getMark(String name)  {
        return new TextMark(new PointerContainer(JnaTextBuffer.INST().gtk_text_buffer_get_mark(asCPointer(), name)));
    }

    /**
     * Gets the maximum number of undo levels to perform.
     * <br>
     * <br>If 0, unlimited undo actions may be performed. Note that this may
     * <br>have a memory usage impact as it requires storing an additional
     * <br>copy of the inserted or removed text within the text buffer.
     * @return 
    */
    public int getMaxUndoLevels()  {
        return JnaTextBuffer.INST().gtk_text_buffer_get_max_undo_levels(asCPointer());
    }

    /**
     * Indicates whether the buffer has been modified since the last call
     * <br>to [method&#64;Gtk.TextBuffer.set_modified] set the modification flag to
     * <br>%FALSE.
     * <br>
     * <br>Used for example to enable a “save” function in a text editor.
     * @return %TRUE if the buffer has been modified
    */
    public boolean getModified()  {
        return JnaTextBuffer.INST().gtk_text_buffer_get_modified(asCPointer());
    }

    /**
     * Returns the mark that represents the selection bound.
     * <br>
     * <br>Equivalent to calling [method&#64;Gtk.TextBuffer.get_mark]
     * <br>to get the mark named “selection_bound”, but very slightly
     * <br>more efficient, and involves less typing.
     * <br>
     * <br>The currently-selected text in &#64;buffer is the region between the
     * <br>“selection_bound” and “insert” marks. If “selection_bound” and
     * <br>“insert” are in the same place, then there is no current selection.
     * <br>[method&#64;Gtk.TextBuffer.get_selection_bounds] is another convenient
     * <br>function for handling the selection, if you just want to know whether
     * <br>there’s a selection and what its bounds are.
     * @return selection bound mark
    */
    public TextMark getSelectionBound()  {
        return new TextMark(new PointerContainer(JnaTextBuffer.INST().gtk_text_buffer_get_selection_bound(asCPointer())));
    }

    /**
     * Returns %TRUE if some text is selected; places the bounds
     * <br>of the selection in &#64;start and &#64;end.
     * <br>
     * <br>If the selection has length 0, then &#64;start and &#64;end are filled
     * <br>in with the same value. &#64;start and &#64;end will be in ascending order.
     * <br>If &#64;start and &#64;end are %NULL, then they are not filled in, but the
     * <br>return value still indicates whether text is selected.
     * @param start iterator to initialize with selection start
     * @param end iterator to initialize with selection end
     * @return whether the selection has nonzero length
    */
    public boolean getSelectionBounds(@Nonnull TextIter start, @Nonnull TextIter end)  {
        return JnaTextBuffer.INST().gtk_text_buffer_get_selection_bounds(asCPointer(), asCPointerNotNull(start), asCPointerNotNull(end));
    }

    /**
     * Get a content provider for this buffer.
     * <br>
     * <br>It can be used to make the content of &#64;buffer available
     * <br>in a `GdkClipboard`, see [method&#64;Gdk.Clipboard.set_content].
     * @return a new `GdkContentProvider`.
    */
    public ch.bailu.gtk.gdk.ContentProvider getSelectionContent()  {
        return new ch.bailu.gtk.gdk.ContentProvider(new PointerContainer(JnaTextBuffer.INST().gtk_text_buffer_get_selection_content(asCPointer())));
    }

    /**
     * Returns the text in the range [&#64;start,&#64;end).
     * <br>
     * <br>Excludes undisplayed text (text marked with tags that set the
     * <br>invisibility attribute) if &#64;include_hidden_chars is %FALSE.
     * <br>The returned string includes a 0xFFFC character whenever the
     * <br>buffer contains embedded images, so byte and character indexes
     * <br>into the returned string do correspond to byte and character
     * <br>indexes into the buffer. Contrast with [method&#64;Gtk.TextBuffer.get_text].
     * <br>Note that 0xFFFC can occur in normal text as well, so it is not a
     * <br>reliable indicator that a paintable or widget is in the buffer.
     * @param start start of a range
     * @param end end of a range
     * @param include_hidden_chars whether to include invisible text
     * @return an allocated UTF-8 string
    */
    public ch.bailu.gtk.type.Str getSlice(@Nonnull TextIter start, @Nonnull TextIter end, boolean include_hidden_chars)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTextBuffer.INST().gtk_text_buffer_get_slice(asCPointer(), asCPointerNotNull(start), asCPointerNotNull(end), include_hidden_chars)));
    }

    /**
     * Initialized &#64;iter with the first position in the text buffer.
     * <br>
     * <br>This is the same as using [method&#64;Gtk.TextBuffer.get_iter_at_offset]
     * <br>to get the iter at character offset 0.
     * @param iter iterator to initialize
    */
    public void getStartIter(@Nonnull TextIter iter)  {
        JnaTextBuffer.INST().gtk_text_buffer_get_start_iter(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Get the `GtkTextTagTable` associated with this buffer.
     * @return the buffer’s tag table
    */
    public TextTagTable getTagTable()  {
        return new TextTagTable(new PointerContainer(JnaTextBuffer.INST().gtk_text_buffer_get_tag_table(asCPointer())));
    }

    /**
     * Returns the text in the range [&#64;start,&#64;end).
     * <br>
     * <br>Excludes undisplayed text (text marked with tags that set the
     * <br>invisibility attribute) if &#64;include_hidden_chars is %FALSE.
     * <br>Does not include characters representing embedded images, so
     * <br>byte and character indexes into the returned string do not
     * <br>correspond to byte and character indexes into the buffer.
     * <br>Contrast with [method&#64;Gtk.TextBuffer.get_slice].
     * @param start start of a range
     * @param end end of a range
     * @param include_hidden_chars whether to include invisible text
     * @return an allocated UTF-8 string
    */
    public ch.bailu.gtk.type.Str getText(@Nonnull TextIter start, @Nonnull TextIter end, boolean include_hidden_chars)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTextBuffer.INST().gtk_text_buffer_get_text(asCPointer(), asCPointerNotNull(start), asCPointerNotNull(end), include_hidden_chars)));
    }

    /**
     * Inserts &#64;len bytes of &#64;text at position &#64;iter.
     * <br>
     * <br>If &#64;len is -1, &#64;text must be nul-terminated and will be inserted in its
     * <br>entirety. Emits the “insert-text” signal; insertion actually occurs
     * <br>in the default handler for the signal. &#64;iter is invalidated when
     * <br>insertion occurs (because the buffer contents change), but the
     * <br>default signal handler revalidates it to point to the end of the
     * <br>inserted text.
     * @param iter a position in the buffer
     * @param text text in UTF-8 format
     * @param len length of text in bytes, or -1
    */
    public void insert(@Nonnull TextIter iter, @Nonnull ch.bailu.gtk.type.Str text, int len)  {
        JnaTextBuffer.INST().gtk_text_buffer_insert(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(text), len);
    }

    /**
     * Inserts &#64;len bytes of &#64;text at position &#64;iter.
     * <br>
     * <br>If &#64;len is -1, &#64;text must be nul-terminated and will be inserted in its
     * <br>entirety. Emits the “insert-text” signal; insertion actually occurs
     * <br>in the default handler for the signal. &#64;iter is invalidated when
     * <br>insertion occurs (because the buffer contents change), but the
     * <br>default signal handler revalidates it to point to the end of the
     * <br>inserted text.
     * @param iter a position in the buffer
     * @param text text in UTF-8 format
     * @param len length of text in bytes, or -1
    */
    public void insert(@Nonnull TextIter iter, String text, int len)  {
        JnaTextBuffer.INST().gtk_text_buffer_insert(asCPointer(), asCPointerNotNull(iter), text, len);
    }

    /**
     * Inserts &#64;text in &#64;buffer.
     * <br>
     * <br>Simply calls [method&#64;Gtk.TextBuffer.insert],
     * <br>using the current cursor position as the insertion point.
     * @param text text in UTF-8 format
     * @param len length of text, in bytes
    */
    public void insertAtCursor(@Nonnull ch.bailu.gtk.type.Str text, int len)  {
        JnaTextBuffer.INST().gtk_text_buffer_insert_at_cursor(asCPointer(), asCPointerNotNull(text), len);
    }

    /**
     * Inserts &#64;text in &#64;buffer.
     * <br>
     * <br>Simply calls [method&#64;Gtk.TextBuffer.insert],
     * <br>using the current cursor position as the insertion point.
     * @param text text in UTF-8 format
     * @param len length of text, in bytes
    */
    public void insertAtCursor(String text, int len)  {
        JnaTextBuffer.INST().gtk_text_buffer_insert_at_cursor(asCPointer(), text, len);
    }

    /**
     * Inserts a child widget anchor into the text buffer at &#64;iter.
     * <br>
     * <br>The anchor will be counted as one character in character counts, and
     * <br>when obtaining the buffer contents as a string, will be represented
     * <br>by the Unicode “object replacement character” 0xFFFC. Note that the
     * <br>“slice” variants for obtaining portions of the buffer as a string
     * <br>include this character for child anchors, but the “text” variants do
     * <br>not. E.g. see [method&#64;Gtk.TextBuffer.get_slice] and
     * <br>[method&#64;Gtk.TextBuffer.get_text].
     * <br>
     * <br>Consider [method&#64;Gtk.TextBuffer.create_child_anchor] as a more
     * <br>convenient alternative to this function. The buffer will add a
     * <br>reference to the anchor, so you can unref it after insertion.
     * @param iter location to insert the anchor
     * @param anchor a `GtkTextChildAnchor`
    */
    public void insertChildAnchor(@Nonnull TextIter iter, @Nonnull TextChildAnchor anchor)  {
        JnaTextBuffer.INST().gtk_text_buffer_insert_child_anchor(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(anchor));
    }

    /**
     * Inserts &#64;text in &#64;buffer.
     * <br>
     * <br>Like [method&#64;Gtk.TextBuffer.insert], but the insertion will not occur
     * <br>if &#64;iter is at a non-editable location in the buffer. Usually you
     * <br>want to prevent insertions at ineditable locations if the insertion
     * <br>results from a user action (is interactive).
     * <br>
     * <br>&#64;default_editable indicates the editability of text that doesn't
     * <br>have a tag affecting editability applied to it. Typically the
     * <br>result of [method&#64;Gtk.TextView.get_editable] is appropriate here.
     * @param iter a position in &#64;buffer
     * @param text some UTF-8 text
     * @param len length of text in bytes, or -1
     * @param default_editable default editability of buffer
     * @return whether text was actually inserted
    */
    public boolean insertInteractive(@Nonnull TextIter iter, @Nonnull ch.bailu.gtk.type.Str text, int len, boolean default_editable)  {
        return JnaTextBuffer.INST().gtk_text_buffer_insert_interactive(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(text), len, default_editable);
    }

    /**
     * Inserts &#64;text in &#64;buffer.
     * <br>
     * <br>Like [method&#64;Gtk.TextBuffer.insert], but the insertion will not occur
     * <br>if &#64;iter is at a non-editable location in the buffer. Usually you
     * <br>want to prevent insertions at ineditable locations if the insertion
     * <br>results from a user action (is interactive).
     * <br>
     * <br>&#64;default_editable indicates the editability of text that doesn't
     * <br>have a tag affecting editability applied to it. Typically the
     * <br>result of [method&#64;Gtk.TextView.get_editable] is appropriate here.
     * @param iter a position in &#64;buffer
     * @param text some UTF-8 text
     * @param len length of text in bytes, or -1
     * @param default_editable default editability of buffer
     * @return whether text was actually inserted
    */
    public boolean insertInteractive(@Nonnull TextIter iter, String text, int len, boolean default_editable)  {
        return JnaTextBuffer.INST().gtk_text_buffer_insert_interactive(asCPointer(), asCPointerNotNull(iter), text, len, default_editable);
    }

    /**
     * Inserts &#64;text in &#64;buffer.
     * <br>
     * <br>Calls [method&#64;Gtk.TextBuffer.insert_interactive]
     * <br>at the cursor position.
     * <br>
     * <br>&#64;default_editable indicates the editability of text that doesn't
     * <br>have a tag affecting editability applied to it. Typically the
     * <br>result of [method&#64;Gtk.TextView.get_editable] is appropriate here.
     * @param text text in UTF-8 format
     * @param len length of text in bytes, or -1
     * @param default_editable default editability of buffer
     * @return whether text was actually inserted
    */
    public boolean insertInteractiveAtCursor(@Nonnull ch.bailu.gtk.type.Str text, int len, boolean default_editable)  {
        return JnaTextBuffer.INST().gtk_text_buffer_insert_interactive_at_cursor(asCPointer(), asCPointerNotNull(text), len, default_editable);
    }

    /**
     * Inserts &#64;text in &#64;buffer.
     * <br>
     * <br>Calls [method&#64;Gtk.TextBuffer.insert_interactive]
     * <br>at the cursor position.
     * <br>
     * <br>&#64;default_editable indicates the editability of text that doesn't
     * <br>have a tag affecting editability applied to it. Typically the
     * <br>result of [method&#64;Gtk.TextView.get_editable] is appropriate here.
     * @param text text in UTF-8 format
     * @param len length of text in bytes, or -1
     * @param default_editable default editability of buffer
     * @return whether text was actually inserted
    */
    public boolean insertInteractiveAtCursor(String text, int len, boolean default_editable)  {
        return JnaTextBuffer.INST().gtk_text_buffer_insert_interactive_at_cursor(asCPointer(), text, len, default_editable);
    }

    /**
     * Inserts the text in &#64;markup at position &#64;iter.
     * <br>
     * <br>&#64;markup will be inserted in its entirety and must be nul-terminated
     * <br>and valid UTF-8. Emits the [signal&#64;Gtk.TextBuffer::insert-text] signal,
     * <br>possibly multiple times; insertion actually occurs in the default handler
     * <br>for the signal. &#64;iter will point to the end of the inserted text on return.
     * @param iter location to insert the markup
     * @param markup a nul-terminated UTF-8 string containing Pango markup
     * @param len length of &#64;markup in bytes, or -1
    */
    public void insertMarkup(@Nonnull TextIter iter, @Nonnull ch.bailu.gtk.type.Str markup, int len)  {
        JnaTextBuffer.INST().gtk_text_buffer_insert_markup(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(markup), len);
    }

    /**
     * Inserts the text in &#64;markup at position &#64;iter.
     * <br>
     * <br>&#64;markup will be inserted in its entirety and must be nul-terminated
     * <br>and valid UTF-8. Emits the [signal&#64;Gtk.TextBuffer::insert-text] signal,
     * <br>possibly multiple times; insertion actually occurs in the default handler
     * <br>for the signal. &#64;iter will point to the end of the inserted text on return.
     * @param iter location to insert the markup
     * @param markup a nul-terminated UTF-8 string containing Pango markup
     * @param len length of &#64;markup in bytes, or -1
    */
    public void insertMarkup(@Nonnull TextIter iter, String markup, int len)  {
        JnaTextBuffer.INST().gtk_text_buffer_insert_markup(asCPointer(), asCPointerNotNull(iter), markup, len);
    }

    /**
     * Inserts an image into the text buffer at &#64;iter.
     * <br>
     * <br>The image will be counted as one character in character counts,
     * <br>and when obtaining the buffer contents as a string, will be
     * <br>represented by the Unicode “object replacement character” 0xFFFC.
     * <br>Note that the “slice” variants for obtaining portions of the buffer
     * <br>as a string include this character for paintable, but the “text”
     * <br>variants do not. e.g. see [method&#64;Gtk.TextBuffer.get_slice] and
     * <br>[method&#64;Gtk.TextBuffer.get_text].
     * @param iter location to insert the paintable
     * @param paintable a `GdkPaintable`
    */
    public void insertPaintable(@Nonnull TextIter iter, @Nonnull ch.bailu.gtk.gdk.Paintable paintable)  {
        JnaTextBuffer.INST().gtk_text_buffer_insert_paintable(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(paintable));
    }

    /**
     * Copies text, tags, and paintables between &#64;start and &#64;end
     * <br>and inserts the copy at &#64;iter.
     * <br>
     * <br>The order of &#64;start and &#64;end doesn’t matter.
     * <br>
     * <br>Used instead of simply getting/inserting text because it preserves
     * <br>images and tags. If &#64;start and &#64;end are in a different buffer from
     * <br>&#64;buffer, the two buffers must share the same tag table.
     * <br>
     * <br>Implemented via emissions of the ::insert-text and ::apply-tag signals,
     * <br>so expect those.
     * @param iter a position in &#64;buffer
     * @param start a position in a `GtkTextBuffer`
     * @param end another position in the same buffer as &#64;start
    */
    public void insertRange(@Nonnull TextIter iter, @Nonnull TextIter start, @Nonnull TextIter end)  {
        JnaTextBuffer.INST().gtk_text_buffer_insert_range(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(start), asCPointerNotNull(end));
    }

    /**
     * Copies text, tags, and paintables between &#64;start and &#64;end
     * <br>and inserts the copy at &#64;iter.
     * <br>
     * <br>Same as [method&#64;Gtk.TextBuffer.insert_range], but does nothing
     * <br>if the insertion point isn’t editable. The &#64;default_editable
     * <br>parameter indicates whether the text is editable at &#64;iter if
     * <br>no tags enclosing &#64;iter affect editability. Typically the result
     * <br>of [method&#64;Gtk.TextView.get_editable] is appropriate here.
     * @param iter a position in &#64;buffer
     * @param start a position in a `GtkTextBuffer`
     * @param end another position in the same buffer as &#64;start
     * @param default_editable default editability of the buffer
     * @return whether an insertion was possible at &#64;iter
    */
    public boolean insertRangeInteractive(@Nonnull TextIter iter, @Nonnull TextIter start, @Nonnull TextIter end, boolean default_editable)  {
        return JnaTextBuffer.INST().gtk_text_buffer_insert_range_interactive(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(start), asCPointerNotNull(end), default_editable);
    }

    /**
     * Inserts &#64;text into &#64;buffer at &#64;iter, applying the list of tags to
     * <br>the newly-inserted text.
     * <br>
     * <br>The last tag specified must be %NULL to terminate the list.
     * <br>Equivalent to calling [method&#64;Gtk.TextBuffer.insert],
     * <br>then [method&#64;Gtk.TextBuffer.apply_tag] on the inserted text;
     * <br>this is just a convenience function.
     * @param iter an iterator in &#64;buffer
     * @param text UTF-8 text
     * @param len length of &#64;text, or -1
     * @param first_tag first tag to apply to &#64;text
     * @param _elipse %NULL-terminated list of tags to apply
    */
    public void insertWithTags(@Nonnull TextIter iter, @Nonnull ch.bailu.gtk.type.Str text, int len, @Nonnull TextTag first_tag, java.lang.Object... _elipse)  {
        JnaTextBuffer.INST().gtk_text_buffer_insert_with_tags(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(text), len, asCPointerNotNull(first_tag), _elipse);
    }

    /**
     * Inserts &#64;text into &#64;buffer at &#64;iter, applying the list of tags to
     * <br>the newly-inserted text.
     * <br>
     * <br>The last tag specified must be %NULL to terminate the list.
     * <br>Equivalent to calling [method&#64;Gtk.TextBuffer.insert],
     * <br>then [method&#64;Gtk.TextBuffer.apply_tag] on the inserted text;
     * <br>this is just a convenience function.
     * @param iter an iterator in &#64;buffer
     * @param text UTF-8 text
     * @param len length of &#64;text, or -1
     * @param first_tag first tag to apply to &#64;text
     * @param _elipse %NULL-terminated list of tags to apply
    */
    public void insertWithTags(@Nonnull TextIter iter, String text, int len, @Nonnull TextTag first_tag, java.lang.Object... _elipse)  {
        JnaTextBuffer.INST().gtk_text_buffer_insert_with_tags(asCPointer(), asCPointerNotNull(iter), text, len, asCPointerNotNull(first_tag), _elipse);
    }

    /**
     * Inserts &#64;text into &#64;buffer at &#64;iter, applying the list of tags to
     * <br>the newly-inserted text.
     * <br>
     * <br>Same as [method&#64;Gtk.TextBuffer.insert_with_tags], but allows you
     * <br>to pass in tag names instead of tag objects.
     * @param iter position in &#64;buffer
     * @param text UTF-8 text
     * @param len length of &#64;text, or -1
     * @param first_tag_name name of a tag to apply to &#64;text
     * @param _elipse more tag names
    */
    public void insertWithTagsByName(@Nonnull TextIter iter, @Nonnull ch.bailu.gtk.type.Str text, int len, @Nonnull ch.bailu.gtk.type.Str first_tag_name, java.lang.Object... _elipse)  {
        JnaTextBuffer.INST().gtk_text_buffer_insert_with_tags_by_name(asCPointer(), asCPointerNotNull(iter), asCPointerNotNull(text), len, asCPointerNotNull(first_tag_name), _elipse);
    }

    /**
     * Inserts &#64;text into &#64;buffer at &#64;iter, applying the list of tags to
     * <br>the newly-inserted text.
     * <br>
     * <br>Same as [method&#64;Gtk.TextBuffer.insert_with_tags], but allows you
     * <br>to pass in tag names instead of tag objects.
     * @param iter position in &#64;buffer
     * @param text UTF-8 text
     * @param len length of &#64;text, or -1
     * @param first_tag_name name of a tag to apply to &#64;text
     * @param _elipse more tag names
    */
    public void insertWithTagsByName(@Nonnull TextIter iter, String text, int len, String first_tag_name, java.lang.Object... _elipse)  {
        JnaTextBuffer.INST().gtk_text_buffer_insert_with_tags_by_name(asCPointer(), asCPointerNotNull(iter), text, len, first_tag_name, _elipse);
    }

    /**
     * Moves &#64;mark to the new location &#64;where.
     * <br>
     * <br>Emits the [signal&#64;Gtk.TextBuffer::mark-set] signal
     * <br>as notification of the move.
     * @param mark a `GtkTextMark`
     * @param where new location for &#64;mark in &#64;buffer
    */
    public void moveMark(@Nonnull TextMark mark, @Nonnull TextIter where)  {
        JnaTextBuffer.INST().gtk_text_buffer_move_mark(asCPointer(), asCPointerNotNull(mark), asCPointerNotNull(where));
    }

    /**
     * Moves the mark named &#64;name (which must exist) to location &#64;where.
     * <br>
     * <br>See [method&#64;Gtk.TextBuffer.move_mark] for details.
     * @param name name of a mark
     * @param where new location for mark
    */
    public void moveMarkByName(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull TextIter where)  {
        JnaTextBuffer.INST().gtk_text_buffer_move_mark_by_name(asCPointer(), asCPointerNotNull(name), asCPointerNotNull(where));
    }

    /**
     * Moves the mark named &#64;name (which must exist) to location &#64;where.
     * <br>
     * <br>See [method&#64;Gtk.TextBuffer.move_mark] for details.
     * @param name name of a mark
     * @param where new location for mark
    */
    public void moveMarkByName(String name, @Nonnull TextIter where)  {
        JnaTextBuffer.INST().gtk_text_buffer_move_mark_by_name(asCPointer(), name, asCPointerNotNull(where));
    }

    /**
     * Pastes the contents of a clipboard.
     * <br>
     * <br>If &#64;override_location is %NULL, the pasted text will be inserted
     * <br>at the cursor position, or the buffer selection will be replaced
     * <br>if the selection is non-empty.
     * <br>
     * <br>Note: pasting is asynchronous, that is, we’ll ask for the paste data
     * <br>and return, and at some point later after the main loop runs, the paste
     * <br>data will be inserted.
     * @param clipboard the `GdkClipboard` to paste from
     * @param override_location location to insert pasted text
     * @param default_editable whether the buffer is editable by default
    */
    public void pasteClipboard(@Nonnull ch.bailu.gtk.gdk.Clipboard clipboard, @Nullable TextIter override_location, boolean default_editable)  {
        JnaTextBuffer.INST().gtk_text_buffer_paste_clipboard(asCPointer(), asCPointerNotNull(clipboard), asCPointer(override_location), default_editable);
    }

    /**
     * This function moves the “insert” and “selection_bound” marks
     * <br>simultaneously.
     * <br>
     * <br>If you move them to the same place in two steps with
     * <br>[method&#64;Gtk.TextBuffer.move_mark], you will temporarily select a
     * <br>region in between their old and new locations, which can be pretty
     * <br>inefficient since the temporarily-selected region will force stuff
     * <br>to be recalculated. This function moves them as a unit, which can
     * <br>be optimized.
     * @param where where to put the cursor
    */
    public void placeCursor(@Nonnull TextIter where)  {
        JnaTextBuffer.INST().gtk_text_buffer_place_cursor(asCPointer(), asCPointerNotNull(where));
    }

    /**
     * Redoes the next redoable action on the buffer, if there is one.
    */
    public void redo()  {
        JnaTextBuffer.INST().gtk_text_buffer_redo(asCPointer());
    }

    /**
     * Removes all tags in the range between &#64;start and &#64;end.
     * <br>
     * <br>Be careful with this function; it could remove tags added in code
     * <br>unrelated to the code you’re currently writing. That is, using this
     * <br>function is probably a bad idea if you have two or more unrelated
     * <br>code sections that add tags.
     * @param start one bound of range to be untagged
     * @param end other bound of range to be untagged
    */
    public void removeAllTags(@Nonnull TextIter start, @Nonnull TextIter end)  {
        JnaTextBuffer.INST().gtk_text_buffer_remove_all_tags(asCPointer(), asCPointerNotNull(start), asCPointerNotNull(end));
    }

    /**
     * Removes a `GdkClipboard` added with
     * <br>gtk_text_buffer_add_selection_clipboard().
     * @param clipboard a `GdkClipboard` added to &#64;buffer by   [method&#64;Gtk.TextBuffer.add_selection_clipboard]
    */
    public void removeSelectionClipboard(@Nonnull ch.bailu.gtk.gdk.Clipboard clipboard)  {
        JnaTextBuffer.INST().gtk_text_buffer_remove_selection_clipboard(asCPointer(), asCPointerNotNull(clipboard));
    }

    /**
     * Emits the “remove-tag” signal.
     * <br>
     * <br>The default handler for the signal removes all occurrences
     * <br>of &#64;tag from the given range. &#64;start and &#64;end don’t have
     * <br>to be in order.
     * @param tag a `GtkTextTag`
     * @param start one bound of range to be untagged
     * @param end other bound of range to be untagged
    */
    public void removeTag(@Nonnull TextTag tag, @Nonnull TextIter start, @Nonnull TextIter end)  {
        JnaTextBuffer.INST().gtk_text_buffer_remove_tag(asCPointer(), asCPointerNotNull(tag), asCPointerNotNull(start), asCPointerNotNull(end));
    }

    /**
     * Emits the “remove-tag” signal.
     * <br>
     * <br>Calls [method&#64;Gtk.TextTagTable.lookup] on the buffer’s
     * <br>tag table to get a `GtkTextTag`, then calls
     * <br>[method&#64;Gtk.TextBuffer.remove_tag].
     * @param name name of a `GtkTextTag`
     * @param start one bound of range to be untagged
     * @param end other bound of range to be untagged
    */
    public void removeTagByName(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull TextIter start, @Nonnull TextIter end)  {
        JnaTextBuffer.INST().gtk_text_buffer_remove_tag_by_name(asCPointer(), asCPointerNotNull(name), asCPointerNotNull(start), asCPointerNotNull(end));
    }

    /**
     * Emits the “remove-tag” signal.
     * <br>
     * <br>Calls [method&#64;Gtk.TextTagTable.lookup] on the buffer’s
     * <br>tag table to get a `GtkTextTag`, then calls
     * <br>[method&#64;Gtk.TextBuffer.remove_tag].
     * @param name name of a `GtkTextTag`
     * @param start one bound of range to be untagged
     * @param end other bound of range to be untagged
    */
    public void removeTagByName(String name, @Nonnull TextIter start, @Nonnull TextIter end)  {
        JnaTextBuffer.INST().gtk_text_buffer_remove_tag_by_name(asCPointer(), name, asCPointerNotNull(start), asCPointerNotNull(end));
    }

    /**
     * This function moves the “insert” and “selection_bound” marks
     * <br>simultaneously.
     * <br>
     * <br>If you move them in two steps with
     * <br>[method&#64;Gtk.TextBuffer.move_mark], you will temporarily select a
     * <br>region in between their old and new locations, which can be pretty
     * <br>inefficient since the temporarily-selected region will force stuff
     * <br>to be recalculated. This function moves them as a unit, which can
     * <br>be optimized.
     * @param ins where to put the “insert” mark
     * @param bound where to put the “selection_bound” mark
    */
    public void selectRange(@Nonnull TextIter ins, @Nonnull TextIter bound)  {
        JnaTextBuffer.INST().gtk_text_buffer_select_range(asCPointer(), asCPointerNotNull(ins), asCPointerNotNull(bound));
    }

    /**
     * Sets whether or not to enable undoable actions in the text buffer.
     * <br>
     * <br>Undoable actions in this context are changes to the text content of
     * <br>the buffer. Changes to tags and marks are not tracked.
     * <br>
     * <br>If enabled, the user will be able to undo the last number of actions
     * <br>up to [method&#64;Gtk.TextBuffer.get_max_undo_levels].
     * <br>
     * <br>See [method&#64;Gtk.TextBuffer.begin_irreversible_action] and
     * <br>[method&#64;Gtk.TextBuffer.end_irreversible_action] to create
     * <br>changes to the buffer that cannot be undone.
     * @param enable_undo %TRUE to enable undo
    */
    public void setEnableUndo(boolean enable_undo)  {
        JnaTextBuffer.INST().gtk_text_buffer_set_enable_undo(asCPointer(), enable_undo);
    }

    /**
     * Sets the maximum number of undo levels to perform.
     * <br>
     * <br>If 0, unlimited undo actions may be performed. Note that this may
     * <br>have a memory usage impact as it requires storing an additional
     * <br>copy of the inserted or removed text within the text buffer.
     * @param max_undo_levels the maximum number of undo actions to perform
    */
    public void setMaxUndoLevels(int max_undo_levels)  {
        JnaTextBuffer.INST().gtk_text_buffer_set_max_undo_levels(asCPointer(), max_undo_levels);
    }

    /**
     * Used to keep track of whether the buffer has been
     * <br>modified since the last time it was saved.
     * <br>
     * <br>Whenever the buffer is saved to disk, call
     * <br>`gtk_text_buffer_set_modified (&#64;buffer, FALSE)`.
     * <br>When the buffer is modified, it will automatically
     * <br>toggled on the modified bit again. When the modified
     * <br>bit flips, the buffer emits the
     * <br>[signal&#64;Gtk.TextBuffer::modified-changed] signal.
     * @param setting modification flag setting
    */
    public void setModified(boolean setting)  {
        JnaTextBuffer.INST().gtk_text_buffer_set_modified(asCPointer(), setting);
    }

    /**
     * Deletes current contents of &#64;buffer, and inserts &#64;text instead. This is
     * <br>automatically marked as an irreversible action in the undo stack. If you
     * <br>wish to mark this action as part of a larger undo operation, call
     * <br>[method&#64;TextBuffer.delete] and [method&#64;TextBuffer.insert] directly instead.
     * <br>
     * <br>If &#64;len is -1, &#64;text must be nul-terminated.
     * <br>&#64;text must be valid UTF-8.
     * @param text UTF-8 text to insert
     * @param len length of &#64;text in bytes
    */
    public void setText(@Nonnull ch.bailu.gtk.type.Str text, int len)  {
        JnaTextBuffer.INST().gtk_text_buffer_set_text(asCPointer(), asCPointerNotNull(text), len);
    }

    /**
     * Deletes current contents of &#64;buffer, and inserts &#64;text instead. This is
     * <br>automatically marked as an irreversible action in the undo stack. If you
     * <br>wish to mark this action as part of a larger undo operation, call
     * <br>[method&#64;TextBuffer.delete] and [method&#64;TextBuffer.insert] directly instead.
     * <br>
     * <br>If &#64;len is -1, &#64;text must be nul-terminated.
     * <br>&#64;text must be valid UTF-8.
     * @param text UTF-8 text to insert
     * @param len length of &#64;text in bytes
    */
    public void setText(String text, int len)  {
        JnaTextBuffer.INST().gtk_text_buffer_set_text(asCPointer(), text, len);
    }

    /**
     * Undoes the last undoable action on the buffer, if there is one.
    */
    public void undo()  {
        JnaTextBuffer.INST().gtk_text_buffer_undo(asCPointer());
    }

    public final static String SIGNAL_ON_APPLY_TAG = "apply-tag";
    
    /**
     * Connect to signal "apply-tag".
     * <br>See {@link OnApplyTag#onApplyTag} for signal description.
     * <br>Field {@link #SIGNAL_ON_APPLY_TAG} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onApplyTag(OnApplyTag signal) {
        return connectSignal(SIGNAL_ON_APPLY_TAG, toOnApplyTag(signal));
    }

    public final static String SIGNAL_ON_BEGIN_USER_ACTION = "begin-user-action";
    
    /**
     * Connect to signal "begin-user-action".
     * <br>See {@link OnBeginUserAction#onBeginUserAction} for signal description.
     * <br>Field {@link #SIGNAL_ON_BEGIN_USER_ACTION} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onBeginUserAction(OnBeginUserAction signal) {
        return connectSignal(SIGNAL_ON_BEGIN_USER_ACTION, toOnBeginUserAction(signal));
    }

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
    }

    public final static String SIGNAL_ON_DELETE_RANGE = "delete-range";
    
    /**
     * Connect to signal "delete-range".
     * <br>See {@link OnDeleteRange#onDeleteRange} for signal description.
     * <br>Field {@link #SIGNAL_ON_DELETE_RANGE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDeleteRange(OnDeleteRange signal) {
        return connectSignal(SIGNAL_ON_DELETE_RANGE, toOnDeleteRange(signal));
    }

    public final static String SIGNAL_ON_END_USER_ACTION = "end-user-action";
    
    /**
     * Connect to signal "end-user-action".
     * <br>See {@link OnEndUserAction#onEndUserAction} for signal description.
     * <br>Field {@link #SIGNAL_ON_END_USER_ACTION} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEndUserAction(OnEndUserAction signal) {
        return connectSignal(SIGNAL_ON_END_USER_ACTION, toOnEndUserAction(signal));
    }

    public final static String SIGNAL_ON_INSERT_CHILD_ANCHOR = "insert-child-anchor";
    
    /**
     * Connect to signal "insert-child-anchor".
     * <br>See {@link OnInsertChildAnchor#onInsertChildAnchor} for signal description.
     * <br>Field {@link #SIGNAL_ON_INSERT_CHILD_ANCHOR} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInsertChildAnchor(OnInsertChildAnchor signal) {
        return connectSignal(SIGNAL_ON_INSERT_CHILD_ANCHOR, toOnInsertChildAnchor(signal));
    }

    public final static String SIGNAL_ON_INSERT_PAINTABLE = "insert-paintable";
    
    /**
     * Connect to signal "insert-paintable".
     * <br>See {@link OnInsertPaintable#onInsertPaintable} for signal description.
     * <br>Field {@link #SIGNAL_ON_INSERT_PAINTABLE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInsertPaintable(OnInsertPaintable signal) {
        return connectSignal(SIGNAL_ON_INSERT_PAINTABLE, toOnInsertPaintable(signal));
    }

    public final static String SIGNAL_ON_INSERT_TEXT = "insert-text";
    
    /**
     * Connect to signal "insert-text".
     * <br>See {@link OnInsertText#onInsertText} for signal description.
     * <br>Field {@link #SIGNAL_ON_INSERT_TEXT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInsertText(OnInsertText signal) {
        return connectSignal(SIGNAL_ON_INSERT_TEXT, toOnInsertText(signal));
    }

    public final static String SIGNAL_ON_MARK_DELETED = "mark-deleted";
    
    /**
     * Connect to signal "mark-deleted".
     * <br>See {@link OnMarkDeleted#onMarkDeleted} for signal description.
     * <br>Field {@link #SIGNAL_ON_MARK_DELETED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMarkDeleted(OnMarkDeleted signal) {
        return connectSignal(SIGNAL_ON_MARK_DELETED, toOnMarkDeleted(signal));
    }

    public final static String SIGNAL_ON_MARK_SET = "mark-set";
    
    /**
     * Connect to signal "mark-set".
     * <br>See {@link OnMarkSet#onMarkSet} for signal description.
     * <br>Field {@link #SIGNAL_ON_MARK_SET} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMarkSet(OnMarkSet signal) {
        return connectSignal(SIGNAL_ON_MARK_SET, toOnMarkSet(signal));
    }

    public final static String SIGNAL_ON_MODIFIED_CHANGED = "modified-changed";
    
    /**
     * Connect to signal "modified-changed".
     * <br>See {@link OnModifiedChanged#onModifiedChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_MODIFIED_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onModifiedChanged(OnModifiedChanged signal) {
        return connectSignal(SIGNAL_ON_MODIFIED_CHANGED, toOnModifiedChanged(signal));
    }

    public final static String SIGNAL_ON_PASTE_DONE = "paste-done";
    
    /**
     * Connect to signal "paste-done".
     * <br>See {@link OnPasteDone#onPasteDone} for signal description.
     * <br>Field {@link #SIGNAL_ON_PASTE_DONE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPasteDone(OnPasteDone signal) {
        return connectSignal(SIGNAL_ON_PASTE_DONE, toOnPasteDone(signal));
    }

    public final static String SIGNAL_ON_REDO = "redo";
    
    /**
     * Connect to signal "redo".
     * <br>See {@link OnRedo#onRedo} for signal description.
     * <br>Field {@link #SIGNAL_ON_REDO} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRedo(OnRedo signal) {
        return connectSignal(SIGNAL_ON_REDO, toOnRedo(signal));
    }

    public final static String SIGNAL_ON_REMOVE_TAG = "remove-tag";
    
    /**
     * Connect to signal "remove-tag".
     * <br>See {@link OnRemoveTag#onRemoveTag} for signal description.
     * <br>Field {@link #SIGNAL_ON_REMOVE_TAG} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRemoveTag(OnRemoveTag signal) {
        return connectSignal(SIGNAL_ON_REMOVE_TAG, toOnRemoveTag(signal));
    }

    public final static String SIGNAL_ON_UNDO = "undo";
    
    /**
     * Connect to signal "undo".
     * <br>See {@link OnUndo#onUndo} for signal description.
     * <br>Field {@link #SIGNAL_ON_UNDO} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUndo(OnUndo signal) {
        return connectSignal(SIGNAL_ON_UNDO, toOnUndo(signal));
    }

    public static long getTypeID() { 
        return JnaTextBuffer.INST().gtk_text_buffer_get_type(); 
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
