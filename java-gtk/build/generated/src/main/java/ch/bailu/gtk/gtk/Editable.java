/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkEditable` is an interface for text editing widgets.
 * <br>
 * <br>Typical examples of editable widgets are [class&#64;Gtk.Entry] and
 * <br>[class&#64;Gtk.SpinButton]. It contains functions for generically manipulating
 * <br>an editable widget, a large number of action signals used for key bindings,
 * <br>and several signals that an application can connect to modify the behavior
 * <br>of a widget.
 * <br>
 * <br>As an example of the latter usage, by connecting the following handler to
 * <br>[signal&#64;Gtk.Editable::insert-text], an application can convert all entry
 * <br>into a widget into uppercase.
 * <br>
 * <br>&#35;&#35; Forcing entry to uppercase.
 * <br>
 * <br>```c
 * <br>&#35;include &lt;ctype.h&gt;
 * <br>
 * <br>void
 * <br>insert_text_handler (GtkEditable *editable,
 * <br>                     const char  *text,
 * <br>                     int          length,
 * <br>                     int         *position,
 * <br>                     gpointer     data)
 * <br>{
 * <br>  char *result = g_utf8_strup (text, length);
 * <br>
 * <br>  g_signal_handlers_block_by_func (editable,
 * <br>                               (gpointer) insert_text_handler, data);
 * <br>  gtk_editable_insert_text (editable, result, length, position);
 * <br>  g_signal_handlers_unblock_by_func (editable,
 * <br>                                     (gpointer) insert_text_handler, data);
 * <br>
 * <br>  g_signal_stop_emission_by_name (editable, &quot;insert_text&quot;);
 * <br>
 * <br>  g_free (result);
 * <br>}
 * <br>```
 * <br>
 * <br>&#35;&#35; Implementing GtkEditable
 * <br>
 * <br>The most likely scenario for implementing `GtkEditable` on your own widget
 * <br>is that you will embed a `GtkText` inside a complex widget, and want to
 * <br>delegate the editable functionality to that text widget. `GtkEditable`
 * <br>provides some utility functions to make this easy.
 * <br>
 * <br>In your class_init function, call [func&#64;Gtk.Editable.install_properties],
 * <br>passing the first available property ID:
 * <br>
 * <br>```c
 * <br>static void
 * <br>my_class_init (MyClass *class)
 * <br>{
 * <br>  ...
 * <br>  g_object_class_install_properties (object_class, NUM_PROPERTIES, props);
 * <br>  gtk_editable_install_properties (object_clas, NUM_PROPERTIES);
 * <br>  ...
 * <br>}
 * <br>```
 * <br>
 * <br>In your interface_init function for the `GtkEditable` interface, provide
 * <br>an implementation for the get_delegate vfunc that returns your text widget:
 * <br>
 * <br>```c
 * <br>GtkEditable *
 * <br>get_editable_delegate (GtkEditable *editable)
 * <br>{
 * <br>  return GTK_EDITABLE (MY_WIDGET (editable)-&gt;text_widget);
 * <br>}
 * <br>
 * <br>static void
 * <br>my_editable_init (GtkEditableInterface *iface)
 * <br>{
 * <br>  iface-&gt;get_delegate = get_editable_delegate;
 * <br>}
 * <br>```
 * <br>
 * <br>You don't need to provide any other vfuncs. The default implementations
 * <br>work by forwarding to the delegate that the GtkEditableInterface.get_delegate()
 * <br>vfunc returns.
 * <br>
 * <br>In your instance_init function, create your text widget, and then call
 * <br>[method&#64;Gtk.Editable.init_delegate]:
 * <br>
 * <br>```c
 * <br>static void
 * <br>my_widget_init (MyWidget *self)
 * <br>{
 * <br>  ...
 * <br>  self-&gt;text_widget = gtk_text_new ();
 * <br>  gtk_editable_init_delegate (GTK_EDITABLE (self));
 * <br>  ...
 * <br>}
 * <br>```
 * <br>
 * <br>In your dispose function, call [method&#64;Gtk.Editable.finish_delegate] before
 * <br>destroying your text widget:
 * <br>
 * <br>```c
 * <br>static void
 * <br>my_widget_dispose (GObject *object)
 * <br>{
 * <br>  ...
 * <br>  gtk_editable_finish_delegate (GTK_EDITABLE (self));
 * <br>  g_clear_pointer (&amp;self-&gt;text_widget, gtk_widget_unparent);
 * <br>  ...
 * <br>}
 * <br>```
 * <br>
 * <br>Finally, use [func&#64;Gtk.Editable.delegate_set_property] in your `set_property`
 * <br>function (and similar for `get_property`), to set the editable properties:
 * <br>
 * <br>```c
 * <br>  ...
 * <br>  if (gtk_editable_delegate_set_property (object, prop_id, value, pspec))
 * <br>    return;
 * <br>
 * <br>  switch (prop_id)
 * <br>  ...
 * <br>```
 * <br>
 * <br>It is important to note that if you create a `GtkEditable` that uses
 * <br>a delegate, the low level [signal&#64;Gtk.Editable::insert-text] and
 * <br>[signal&#64;Gtk.Editable::delete-text] signals will be propagated from the
 * <br>&quot;wrapper&quot; editable to the delegate, but they will not be propagated from
 * <br>the delegate to the &quot;wrapper&quot; editable, as they would cause an infinite
 * <br>recursion. If you wish to connect to the [signal&#64;Gtk.Editable::insert-text]
 * <br>and [signal&#64;Gtk.Editable::delete-text] signals, you will need to connect
 * <br>to them on the delegate obtained via [method&#64;Gtk.Editable.get_delegate].
 * <p><a href="https://docs.gtk.org/gtk4/iface.Editable.html">https://docs.gtk.org/gtk4/iface.Editable.html</a></p>
*/
public class Editable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Editable.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted at the end of a single user-visible operation on the
         * <br>contents.
         * <br>
         * <br>E.g., a paste operation that replaces the contents of the
         * <br>selection will cause only one signal emission (even though it
         * <br>is implemented by first deleting the selection, then inserting
         * <br>the new content, and may cause multiple ::notify::text signals
         * <br>to be emitted).
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaEditable.OnChanged) (__self, __data) -> in.onChanged();
    }

    @FunctionalInterface
    public interface OnDeleteText {
        /**
         * Emitted when text is deleted from the widget by the user.
         * <br>
         * <br>The default handler for this signal will normally be responsible for
         * <br>deleting the text, so by connecting to this signal and then stopping
         * <br>the signal with g_signal_stop_emission(), it is possible to modify the
         * <br>range of deleted text, or prevent it from being deleted entirely.
         * <br>
         * <br>The &#64;start_pos and &#64;end_pos parameters are interpreted as for
         * <br>[method&#64;Gtk.Editable.delete_text].
         * @param start_pos the starting position
         * @param end_pos the end position
        */
        void onDeleteText(int start_pos, int end_pos);
    }
    
    private static com.sun.jna.Callback toOnDeleteText(OnDeleteText in) {
        return (in == null) ? null: (JnaEditable.OnDeleteText) (__self, _start_pos, _end_pos, __data) -> in.onDeleteText(_start_pos, _end_pos);
    }

    @FunctionalInterface
    public interface OnInsertText {
        /**
         * Emitted when text is inserted into the widget by the user.
         * <br>
         * <br>The default handler for this signal will normally be responsible
         * <br>for inserting the text, so by connecting to this signal and then
         * <br>stopping the signal with g_signal_stop_emission(), it is possible
         * <br>to modify the inserted text, or prevent it from being inserted entirely.
         * @param text the new text to insert
         * @param length the length of the new text, in bytes,     or -1 if new_text is nul-terminated
         * @param position the position, in characters,     at which to insert the new text. this is an in-out     parameter.  After the signal emission is finished, it     should point after the newly inserted text.
        */
        void onInsertText(@Nonnull ch.bailu.gtk.type.Str text, int length, @Nonnull ch.bailu.gtk.type.Pointer position);
    }
    
    private static com.sun.jna.Callback toOnInsertText(OnInsertText in) {
        return (in == null) ? null: (JnaEditable.OnInsertText) (__self, _text, _length, _position, __data) -> in.onInsertText(new ch.bailu.gtk.type.Str(new PointerContainer(_text)), _length, new ch.bailu.gtk.type.Pointer(new PointerContainer(_position)));
    }

    public Editable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Deletes the currently selected text of the editable.
     * <br>
     * <br>This call doesn’t do anything if there is no selected text.
    */
    public void deleteSelection()  {
        JnaEditable.INST().gtk_editable_delete_selection(asCPointer());
    }

    /**
     * Deletes a sequence of characters.
     * <br>
     * <br>The characters that are deleted are those characters at positions
     * <br>from &#64;start_pos up to, but not including &#64;end_pos. If &#64;end_pos is
     * <br>negative, then the characters deleted are those from &#64;start_pos to
     * <br>the end of the text.
     * <br>
     * <br>Note that the positions are specified in characters, not bytes.
     * @param start_pos start position
     * @param end_pos end position
    */
    public void deleteText(int start_pos, int end_pos)  {
        JnaEditable.INST().gtk_editable_delete_text(asCPointer(), start_pos, end_pos);
    }

    /**
     * Undoes the setup done by [method&#64;Gtk.Editable.init_delegate].
     * <br>
     * <br>This is a helper function that should be called from dispose,
     * <br>before removing the delegate object.
    */
    public void finishDelegate()  {
        JnaEditable.INST().gtk_editable_finish_delegate(asCPointer());
    }

    /**
     * Gets the alignment of the editable.
     * @return the alignment
    */
    public float getAlignment()  {
        return JnaEditable.INST().gtk_editable_get_alignment(asCPointer());
    }

    /**
     * Retrieves a sequence of characters.
     * <br>
     * <br>The characters that are retrieved are those characters at positions
     * <br>from &#64;start_pos up to, but not including &#64;end_pos. If &#64;end_pos is negative,
     * <br>then the characters retrieved are those characters from &#64;start_pos to
     * <br>the end of the text.
     * <br>
     * <br>Note that positions are specified in characters, not bytes.
     * @param start_pos start of text
     * @param end_pos end of text
     * @return a pointer to the contents of the widget as a   string. This string is allocated by the `GtkEditable` implementation   and should be freed by the caller.
    */
    public ch.bailu.gtk.type.Str getChars(int start_pos, int end_pos)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaEditable.INST().gtk_editable_get_chars(asCPointer(), start_pos, end_pos)));
    }

    /**
     * Gets the `GtkEditable` that &#64;editable is delegating its
     * <br>implementation to.
     * <br>
     * <br>Typically, the delegate is a [class&#64;Gtk.Text] widget.
     * @return the delegate `GtkEditable`
    */
    public Editable getDelegate()  {
        return new Editable(new PointerContainer(JnaEditable.INST().gtk_editable_get_delegate(asCPointer())));
    }

    /**
     * Retrieves whether &#64;editable is editable.
     * @return %TRUE if &#64;editable is editable.
    */
    public boolean getEditable()  {
        return JnaEditable.INST().gtk_editable_get_editable(asCPointer());
    }

    /**
     * Gets if undo/redo actions are enabled for &#64;editable
     * @return %TRUE if undo is enabled
    */
    public boolean getEnableUndo()  {
        return JnaEditable.INST().gtk_editable_get_enable_undo(asCPointer());
    }

    /**
     * Retrieves the desired maximum width of &#64;editable, in characters.
     * @return the maximum width of the entry, in characters
    */
    public int getMaxWidthChars()  {
        return JnaEditable.INST().gtk_editable_get_max_width_chars(asCPointer());
    }

    /**
     * Retrieves the current position of the cursor relative
     * <br>to the start of the content of the editable.
     * <br>
     * <br>Note that this position is in characters, not in bytes.
     * @return the cursor position
    */
    public int getPosition()  {
        return JnaEditable.INST().gtk_editable_get_position(asCPointer());
    }

    /**
     * Retrieves the selection bound of the editable.
     * <br>
     * <br>&#64;start_pos will be filled with the start of the selection and
     * <br>&#64;end_pos with end. If no text was selected both will be identical
     * <br>and %FALSE will be returned.
     * <br>
     * <br>Note that positions are specified in characters, not bytes.
     * @param start_pos location to store the starting position
     * @param end_pos location to store the end position
     * @return %TRUE if there is a non-empty selection, %FALSE otherwise
    */
    public boolean getSelectionBounds(@Nullable ch.bailu.gtk.type.Int start_pos, @Nullable ch.bailu.gtk.type.Int end_pos)  {
        return JnaEditable.INST().gtk_editable_get_selection_bounds(asCPointer(), asCPointer(start_pos), asCPointer(end_pos));
    }

    /**
     * Retrieves the contents of &#64;editable.
     * <br>
     * <br>The returned string is owned by GTK and must not be modified or freed.
     * @return a pointer to the contents of the editable
    */
    public ch.bailu.gtk.type.Str getText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaEditable.INST().gtk_editable_get_text(asCPointer())));
    }

    /**
     * Gets the number of characters of space reserved
     * <br>for the contents of the editable.
     * @return number of chars to request space for, or negative if unset
    */
    public int getWidthChars()  {
        return JnaEditable.INST().gtk_editable_get_width_chars(asCPointer());
    }

    /**
     * Sets up a delegate for `GtkEditable`.
     * <br>
     * <br>This is assuming that the get_delegate vfunc in the `GtkEditable`
     * <br>interface has been set up for the &#64;editable's type.
     * <br>
     * <br>This is a helper function that should be called in instance init,
     * <br>after creating the delegate object.
    */
    public void initDelegate()  {
        JnaEditable.INST().gtk_editable_init_delegate(asCPointer());
    }

    /**
     * Inserts &#64;length bytes of &#64;text into the contents of the
     * <br>widget, at position &#64;position.
     * <br>
     * <br>Note that the position is in characters, not in bytes.
     * <br>The function updates &#64;position to point after the newly
     * <br>inserted text.
     * @param text the text to append
     * @param length the length of the text in bytes, or -1
     * @param position location of the position text will be inserted at
    */
    public void insertText(@Nonnull ch.bailu.gtk.type.Str text, int length, @Nonnull ch.bailu.gtk.type.Int position)  {
        JnaEditable.INST().gtk_editable_insert_text(asCPointer(), asCPointerNotNull(text), length, asCPointerNotNull(position));
    }

    /**
     * Inserts &#64;length bytes of &#64;text into the contents of the
     * <br>widget, at position &#64;position.
     * <br>
     * <br>Note that the position is in characters, not in bytes.
     * <br>The function updates &#64;position to point after the newly
     * <br>inserted text.
     * @param text the text to append
     * @param length the length of the text in bytes, or -1
     * @param position location of the position text will be inserted at
    */
    public void insertText(String text, int length, @Nonnull ch.bailu.gtk.type.Int position)  {
        JnaEditable.INST().gtk_editable_insert_text(asCPointer(), text, length, asCPointerNotNull(position));
    }

    /**
     * Selects a region of text.
     * <br>
     * <br>The characters that are selected are those characters at positions
     * <br>from &#64;start_pos up to, but not including &#64;end_pos. If &#64;end_pos is
     * <br>negative, then the characters selected are those characters from
     * <br>&#64;start_pos to  the end of the text.
     * <br>
     * <br>Note that positions are specified in characters, not bytes.
     * @param start_pos start of region
     * @param end_pos end of region
    */
    public void selectRegion(int start_pos, int end_pos)  {
        JnaEditable.INST().gtk_editable_select_region(asCPointer(), start_pos, end_pos);
    }

    /**
     * Sets the alignment for the contents of the editable.
     * <br>
     * <br>This controls the horizontal positioning of the contents when
     * <br>the displayed text is shorter than the width of the editable.
     * @param xalign The horizontal alignment, from 0 (left) to 1 (right).   Reversed for RTL layouts
    */
    public void setAlignment(float xalign)  {
        JnaEditable.INST().gtk_editable_set_alignment(asCPointer(), xalign);
    }

    /**
     * Determines if the user can edit the text in the editable widget.
     * @param is_editable %TRUE if the user is allowed to edit the text   in the widget
    */
    public void setEditable(boolean is_editable)  {
        JnaEditable.INST().gtk_editable_set_editable(asCPointer(), is_editable);
    }

    /**
     * If enabled, changes to &#64;editable will be saved for undo/redo
     * <br>actions.
     * <br>
     * <br>This results in an additional copy of text changes and are not
     * <br>stored in secure memory. As such, undo is forcefully disabled
     * <br>when [property&#64;Gtk.Text:visibility] is set to %FALSE.
     * @param enable_undo if undo/redo should be enabled
    */
    public void setEnableUndo(boolean enable_undo)  {
        JnaEditable.INST().gtk_editable_set_enable_undo(asCPointer(), enable_undo);
    }

    /**
     * Sets the desired maximum width in characters of &#64;editable.
     * @param n_chars the new desired maximum width, in characters
    */
    public void setMaxWidthChars(int n_chars)  {
        JnaEditable.INST().gtk_editable_set_max_width_chars(asCPointer(), n_chars);
    }

    /**
     * Sets the cursor position in the editable to the given value.
     * <br>
     * <br>The cursor is displayed before the character with the given (base 0)
     * <br>index in the contents of the editable. The value must be less than
     * <br>or equal to the number of characters in the editable. A value of -1
     * <br>indicates that the position should be set after the last character
     * <br>of the editable. Note that &#64;position is in characters, not in bytes.
     * @param position the position of the cursor
    */
    public void setPosition(int position)  {
        JnaEditable.INST().gtk_editable_set_position(asCPointer(), position);
    }

    /**
     * Sets the text in the editable to the given value.
     * <br>
     * <br>This is replacing the current contents.
     * @param text the text to set
    */
    public void setText(@Nonnull ch.bailu.gtk.type.Str text)  {
        JnaEditable.INST().gtk_editable_set_text(asCPointer(), asCPointerNotNull(text));
    }

    /**
     * Sets the text in the editable to the given value.
     * <br>
     * <br>This is replacing the current contents.
     * @param text the text to set
    */
    public void setText(String text)  {
        JnaEditable.INST().gtk_editable_set_text(asCPointer(), text);
    }

    /**
     * Changes the size request of the editable to be about the
     * <br>right size for &#64;n_chars characters.
     * <br>
     * <br>Note that it changes the size request, the size can still
     * <br>be affected by how you pack the widget into containers.
     * <br>If &#64;n_chars is -1, the size reverts to the default size.
     * @param n_chars width in chars
    */
    public void setWidthChars(int n_chars)  {
        JnaEditable.INST().gtk_editable_set_width_chars(asCPointer(), n_chars);
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

    public final static String SIGNAL_ON_DELETE_TEXT = "delete-text";
    
    /**
     * Connect to signal "delete-text".
     * <br>See {@link OnDeleteText#onDeleteText} for signal description.
     * <br>Field {@link #SIGNAL_ON_DELETE_TEXT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDeleteText(OnDeleteText signal) {
        return connectSignal(SIGNAL_ON_DELETE_TEXT, toOnDeleteText(signal));
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

    /**
     * Gets a property of the `GtkEditable` delegate for &#64;object.
     * <br>
     * <br>This is helper function that should be called in the `get_property`
     * <br>function of your `GtkEditable` implementation, before handling your
     * <br>own properties.
     * @param object a `GObject`
     * @param prop_id a property ID
     * @param value value to set
     * @param pspec the `GParamSpec` for the property
     * @return %TRUE if the property was found
    */
    public static boolean delegateGetProperty(@Nonnull ch.bailu.gtk.gobject.Object object, int prop_id, @Nonnull ch.bailu.gtk.gobject.Value value, @Nonnull ch.bailu.gtk.gobject.ParamSpec pspec)  {
        return JnaEditable.INST().gtk_editable_delegate_get_property(asCPointerNotNull(object), prop_id, asCPointerNotNull(value), asCPointerNotNull(pspec));
    }

    /**
     * Sets a property on the `GtkEditable` delegate for &#64;object.
     * <br>
     * <br>This is a helper function that should be called in the `set_property`
     * <br>function of your `GtkEditable` implementation, before handling your
     * <br>own properties.
     * @param object a `GObject`
     * @param prop_id a property ID
     * @param value value to set
     * @param pspec the `GParamSpec` for the property
     * @return %TRUE if the property was found
    */
    public static boolean delegateSetProperty(@Nonnull ch.bailu.gtk.gobject.Object object, int prop_id, @Nonnull ch.bailu.gtk.gobject.Value value, @Nonnull ch.bailu.gtk.gobject.ParamSpec pspec)  {
        return JnaEditable.INST().gtk_editable_delegate_set_property(asCPointerNotNull(object), prop_id, asCPointerNotNull(value), asCPointerNotNull(pspec));
    }

    /**
     * Overrides the `GtkEditable` properties for &#64;class.
     * <br>
     * <br>This is a helper function that should be called in class_init,
     * <br>after installing your own properties.
     * <br>
     * <br>Note that your class must have &quot;text&quot;, &quot;cursor-position&quot;,
     * <br>&quot;selection-bound&quot;, &quot;editable&quot;, &quot;width-chars&quot;, &quot;max-width-chars&quot;,
     * <br>&quot;xalign&quot; and &quot;enable-undo&quot; properties for this function to work.
     * <br>
     * <br>To handle the properties in your set_property and get_property
     * <br>functions, you can either use [func&#64;Gtk.Editable.delegate_set_property]
     * <br>and [func&#64;Gtk.Editable.delegate_get_property] (if you are using
     * <br>a delegate), or remember the &#64;first_prop offset and add it to the
     * <br>values in the [enum&#64;Gtk.EditableProperties] enumeration to get the
     * <br>property IDs for these properties.
     * @param object_class a `GObjectClass`
     * @param first_prop property ID to use for the first property
     * @return the number of properties that were installed
    */
    public static int installProperties(@Nonnull ch.bailu.gtk.gobject.ObjectClass object_class, int first_prop)  {
        return JnaEditable.INST().gtk_editable_install_properties(asCPointerNotNull(object_class), first_prop);
    }

    public static long getTypeID() { 
        return JnaEditable.INST().gtk_editable_get_type(); 
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
interface-type
*/
