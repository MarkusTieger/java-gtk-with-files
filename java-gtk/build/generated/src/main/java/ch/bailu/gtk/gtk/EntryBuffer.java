/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkEntryBuffer` hold the text displayed in a `GtkText` widget.
 * <br>
 * <br>A single `GtkEntryBuffer` object can be shared by multiple widgets
 * <br>which will then share the same text content, but not the cursor
 * <br>position, visibility attributes, icon etc.
 * <br>
 * <br>`GtkEntryBuffer` may be derived from. Such a derived class might allow
 * <br>text to be stored in an alternate location, such as non-pageable memory,
 * <br>useful in the case of important passwords. Or a derived class could
 * <br>integrate with an application’s concept of undo/redo.
 * <p><a href="https://docs.gtk.org/gtk4/class.EntryBuffer.html">https://docs.gtk.org/gtk4/class.EntryBuffer.html</a></p>
*/
public class EntryBuffer extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EntryBuffer.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDeletedText {
        /**
         * The text is altered in the default handler for this signal.
         * <br>
         * <br>If you want access to the text after the text has been modified,
         * <br>use %G_CONNECT_AFTER.
         * @param position the position the text was deleted at.
         * @param n_chars The number of characters that were deleted.
        */
        void onDeletedText(int position, int n_chars);
    }
    
    private static com.sun.jna.Callback toOnDeletedText(OnDeletedText in) {
        return (in == null) ? null: (JnaEntryBuffer.OnDeletedText) (__self, _position, _n_chars, __data) -> in.onDeletedText(_position, _n_chars);
    }

    @FunctionalInterface
    public interface OnInsertedText {
        /**
         * This signal is emitted after text is inserted into the buffer.
         * @param position the position the text was inserted at.
         * @param chars The text that was inserted.
         * @param n_chars The number of characters that were inserted.
        */
        void onInsertedText(int position, @Nonnull ch.bailu.gtk.type.Str chars, int n_chars);
    }
    
    private static com.sun.jna.Callback toOnInsertedText(OnInsertedText in) {
        return (in == null) ? null: (JnaEntryBuffer.OnInsertedText) (__self, _position, _chars, _n_chars, __data) -> in.onInsertedText(_position, new ch.bailu.gtk.type.Str(new PointerContainer(_chars)), _n_chars);
    }

    public EntryBuffer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a new `GtkEntryBuffer` object.
     * <br>
     * <br>Optionally, specify initial text to set in the buffer.
     * @param initial_chars initial buffer text
     * @param n_initial_chars number of characters in &#64;initial_chars, or -1
    */
    public EntryBuffer(@Nullable ch.bailu.gtk.type.Str initial_chars, int n_initial_chars) {
        super(cast(JnaEntryBuffer.INST().gtk_entry_buffer_new(asCPointer(initial_chars), n_initial_chars)));
    }

    /**
     * Create a new `GtkEntryBuffer` object.
     * <br>
     * <br>Optionally, specify initial text to set in the buffer.
     * @param initial_chars initial buffer text
     * @param n_initial_chars number of characters in &#64;initial_chars, or -1
    */
    public EntryBuffer(String initial_chars, int n_initial_chars) {
        super(cast(JnaEntryBuffer.INST().gtk_entry_buffer_new(initial_chars, n_initial_chars)));
    }

    /**
     * Deletes a sequence of characters from the buffer.
     * <br>
     * <br>&#64;n_chars characters are deleted starting at &#64;position.
     * <br>If &#64;n_chars is negative, then all characters until the
     * <br>end of the text are deleted.
     * <br>
     * <br>If &#64;position or &#64;n_chars are out of bounds, then they
     * <br>are coerced to sane values.
     * <br>
     * <br>Note that the positions are specified in characters,
     * <br>not bytes.
     * @param position position at which to delete text
     * @param n_chars number of characters to delete
     * @return The number of characters deleted.
    */
    public int deleteText(int position, int n_chars)  {
        return JnaEntryBuffer.INST().gtk_entry_buffer_delete_text(asCPointer(), position, n_chars);
    }

    /**
     * Used when subclassing `GtkEntryBuffer`.
     * @param position position at which text was deleted
     * @param n_chars number of characters deleted
    */
    public void emitDeletedText(int position, int n_chars)  {
        JnaEntryBuffer.INST().gtk_entry_buffer_emit_deleted_text(asCPointer(), position, n_chars);
    }

    /**
     * Used when subclassing `GtkEntryBuffer`.
     * @param position position at which text was inserted
     * @param chars text that was inserted
     * @param n_chars number of characters inserted
    */
    public void emitInsertedText(int position, @Nonnull ch.bailu.gtk.type.Str chars, int n_chars)  {
        JnaEntryBuffer.INST().gtk_entry_buffer_emit_inserted_text(asCPointer(), position, asCPointerNotNull(chars), n_chars);
    }

    /**
     * Used when subclassing `GtkEntryBuffer`.
     * @param position position at which text was inserted
     * @param chars text that was inserted
     * @param n_chars number of characters inserted
    */
    public void emitInsertedText(int position, String chars, int n_chars)  {
        JnaEntryBuffer.INST().gtk_entry_buffer_emit_inserted_text(asCPointer(), position, chars, n_chars);
    }

    /**
     * Retrieves the length in bytes of the buffer.
     * <br>
     * <br>See [method&#64;Gtk.EntryBuffer.get_length].
     * @return The byte length of the buffer.
    */
    public long getBytes()  {
        return JnaEntryBuffer.INST().gtk_entry_buffer_get_bytes(asCPointer());
    }

    /**
     * Retrieves the length in characters of the buffer.
     * @return The number of characters in the buffer.
    */
    public int getLength()  {
        return JnaEntryBuffer.INST().gtk_entry_buffer_get_length(asCPointer());
    }

    /**
     * Retrieves the maximum allowed length of the text in &#64;buffer.
     * @return the maximum allowed number of characters   in `GtkEntryBuffer`, or 0 if there is no maximum.
    */
    public int getMaxLength()  {
        return JnaEntryBuffer.INST().gtk_entry_buffer_get_max_length(asCPointer());
    }

    /**
     * Retrieves the contents of the buffer.
     * <br>
     * <br>The memory pointer returned by this call will not change
     * <br>unless this object emits a signal, or is finalized.
     * @return a pointer to the contents of the widget as a   string. This string points to internally allocated storage   in the buffer and must not be freed, modified or stored.
    */
    public ch.bailu.gtk.type.Str getText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaEntryBuffer.INST().gtk_entry_buffer_get_text(asCPointer())));
    }

    /**
     * Inserts &#64;n_chars characters of &#64;chars into the contents of the
     * <br>buffer, at position &#64;position.
     * <br>
     * <br>If &#64;n_chars is negative, then characters from chars will be inserted
     * <br>until a null-terminator is found. If &#64;position or &#64;n_chars are out of
     * <br>bounds, or the maximum buffer text length is exceeded, then they are
     * <br>coerced to sane values.
     * <br>
     * <br>Note that the position and length are in characters, not in bytes.
     * @param position the position at which to insert text.
     * @param chars the text to insert into the buffer.
     * @param n_chars the length of the text in characters, or -1
     * @return The number of characters actually inserted.
    */
    public int insertText(int position, @Nonnull ch.bailu.gtk.type.Str chars, int n_chars)  {
        return JnaEntryBuffer.INST().gtk_entry_buffer_insert_text(asCPointer(), position, asCPointerNotNull(chars), n_chars);
    }

    /**
     * Inserts &#64;n_chars characters of &#64;chars into the contents of the
     * <br>buffer, at position &#64;position.
     * <br>
     * <br>If &#64;n_chars is negative, then characters from chars will be inserted
     * <br>until a null-terminator is found. If &#64;position or &#64;n_chars are out of
     * <br>bounds, or the maximum buffer text length is exceeded, then they are
     * <br>coerced to sane values.
     * <br>
     * <br>Note that the position and length are in characters, not in bytes.
     * @param position the position at which to insert text.
     * @param chars the text to insert into the buffer.
     * @param n_chars the length of the text in characters, or -1
     * @return The number of characters actually inserted.
    */
    public int insertText(int position, String chars, int n_chars)  {
        return JnaEntryBuffer.INST().gtk_entry_buffer_insert_text(asCPointer(), position, chars, n_chars);
    }

    /**
     * Sets the maximum allowed length of the contents of the buffer.
     * <br>
     * <br>If the current contents are longer than the given length, then
     * <br>they will be truncated to fit.
     * @param max_length the maximum length of the entry buffer, or 0 for no maximum.   (other than the maximum length of entries.) The value passed in will   be clamped to the range 0-65536.
    */
    public void setMaxLength(int max_length)  {
        JnaEntryBuffer.INST().gtk_entry_buffer_set_max_length(asCPointer(), max_length);
    }

    /**
     * Sets the text in the buffer.
     * <br>
     * <br>This is roughly equivalent to calling
     * <br>[method&#64;Gtk.EntryBuffer.delete_text] and
     * <br>[method&#64;Gtk.EntryBuffer.insert_text].
     * <br>
     * <br>Note that &#64;n_chars is in characters, not in bytes.
     * @param chars the new text
     * @param n_chars the number of characters in &#64;text, or -1
    */
    public void setText(@Nonnull ch.bailu.gtk.type.Str chars, int n_chars)  {
        JnaEntryBuffer.INST().gtk_entry_buffer_set_text(asCPointer(), asCPointerNotNull(chars), n_chars);
    }

    /**
     * Sets the text in the buffer.
     * <br>
     * <br>This is roughly equivalent to calling
     * <br>[method&#64;Gtk.EntryBuffer.delete_text] and
     * <br>[method&#64;Gtk.EntryBuffer.insert_text].
     * <br>
     * <br>Note that &#64;n_chars is in characters, not in bytes.
     * @param chars the new text
     * @param n_chars the number of characters in &#64;text, or -1
    */
    public void setText(String chars, int n_chars)  {
        JnaEntryBuffer.INST().gtk_entry_buffer_set_text(asCPointer(), chars, n_chars);
    }

    public final static String SIGNAL_ON_DELETED_TEXT = "deleted-text";
    
    /**
     * Connect to signal "deleted-text".
     * <br>See {@link OnDeletedText#onDeletedText} for signal description.
     * <br>Field {@link #SIGNAL_ON_DELETED_TEXT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDeletedText(OnDeletedText signal) {
        return connectSignal(SIGNAL_ON_DELETED_TEXT, toOnDeletedText(signal));
    }

    public final static String SIGNAL_ON_INSERTED_TEXT = "inserted-text";
    
    /**
     * Connect to signal "inserted-text".
     * <br>See {@link OnInsertedText#onInsertedText} for signal description.
     * <br>Field {@link #SIGNAL_ON_INSERTED_TEXT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInsertedText(OnInsertedText signal) {
        return connectSignal(SIGNAL_ON_INSERTED_TEXT, toOnInsertedText(signal));
    }

    public static long getTypeID() { 
        return JnaEntryBuffer.INST().gtk_entry_buffer_get_type(); 
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
