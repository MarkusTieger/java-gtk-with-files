/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkComboBoxText` is a simple variant of `GtkComboBox` for text-only
 * <br>use cases.
 * <br>
 * <br>![An example GtkComboBoxText](combo-box-text.png)
 * <br>
 * <br>`GtkComboBoxText` hides the model-view complexity of `GtkComboBox`.
 * <br>
 * <br>To create a `GtkComboBoxText`, use [ctor&#64;Gtk.ComboBoxText.new] or
 * <br>[ctor&#64;Gtk.ComboBoxText.new_with_entry].
 * <br>
 * <br>You can add items to a `GtkComboBoxText` with
 * <br>[method&#64;Gtk.ComboBoxText.append_text],
 * <br>[method&#64;Gtk.ComboBoxText.insert_text] or
 * <br>[method&#64;Gtk.ComboBoxText.prepend_text] and remove options with
 * <br>[method&#64;Gtk.ComboBoxText.remove].
 * <br>
 * <br>If the `GtkComboBoxText` contains an entry (via the
 * <br>[property&#64;Gtk.ComboBox:has-entry] property), its contents can be retrieved
 * <br>using [method&#64;Gtk.ComboBoxText.get_active_text].
 * <br>
 * <br>You should not call [method&#64;Gtk.ComboBox.set_model] or attempt to pack more
 * <br>cells into this combo box via its [iface&#64;Gtk.CellLayout] interface.
 * <br>
 * <br>&#35; GtkComboBoxText as GtkBuildable
 * <br>
 * <br>The `GtkComboBoxText` implementation of the `GtkBuildable` interface supports
 * <br>adding items directly using the &lt;items&gt; element and specifying &lt;item&gt;
 * <br>elements for each item. Each &lt;item&gt; element can specify the “id”
 * <br>corresponding to the appended text and also supports the regular
 * <br>translation attributes “translatable”, “context” and “comments”.
 * <br>
 * <br>Here is a UI definition fragment specifying `GtkComboBoxText` items:
 * <br>```xml
 * <br>&lt;object class=&quot;GtkComboBoxText&quot;&gt;
 * <br>  &lt;items&gt;
 * <br>    &lt;item translatable=&quot;yes&quot; id=&quot;factory&quot;&gt;Factory&lt;/item&gt;
 * <br>    &lt;item translatable=&quot;yes&quot; id=&quot;home&quot;&gt;Home&lt;/item&gt;
 * <br>    &lt;item translatable=&quot;yes&quot; id=&quot;subway&quot;&gt;Subway&lt;/item&gt;
 * <br>  &lt;/items&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>combobox
 * <br>╰── box.linked
 * <br>    ├── entry.combo
 * <br>    ├── button.combo
 * <br>    ╰── window.popup
 * <br>```
 * <br>
 * <br>`GtkComboBoxText` has a single CSS node with name combobox. It adds
 * <br>the style class .combo to the main CSS nodes of its entry and button
 * <br>children, and the .linked class to the node of its internal box.
 * <p><a href="https://docs.gtk.org/gtk4/class.ComboBoxText.html">https://docs.gtk.org/gtk4/class.ComboBoxText.html</a></p>
*/
public class ComboBoxText extends ComboBox {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ComboBoxText.class.getCanonicalName());
    }

    public ComboBoxText(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkComboBoxText` with an entry.
     * @return a new `GtkComboBoxText`
    */
    public static ComboBoxText newWithEntryComboBoxText()  {
        PointerContainer __self = cast(JnaComboBoxText.INST().gtk_combo_box_text_new_with_entry());
        if (__self.isNull()) {
            throw new NullPointerException("ComboBoxText:newWithEntry");
        }
        return new ComboBoxText(__self);
    }        
    

    /**
     * Creates a new `GtkComboBoxText`.
    */
    public ComboBoxText() {
        super(cast(JnaComboBoxText.INST().gtk_combo_box_text_new()));
    }

    /**
     * Appends &#64;text to the list of strings stored in &#64;combo_box.
     * <br>
     * <br>If &#64;id is non-%NULL then it is used as the ID of the row.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.ComboBoxText.insert]
     * <br>with a position of -1.
     * @param id a string ID for this value
     * @param text A string
    */
    public void append(@Nullable ch.bailu.gtk.type.Str id, @Nonnull ch.bailu.gtk.type.Str text)  {
        JnaComboBoxText.INST().gtk_combo_box_text_append(asCPointer(), asCPointer(id), asCPointerNotNull(text));
    }

    /**
     * Appends &#64;text to the list of strings stored in &#64;combo_box.
     * <br>
     * <br>If &#64;id is non-%NULL then it is used as the ID of the row.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.ComboBoxText.insert]
     * <br>with a position of -1.
     * @param id a string ID for this value
     * @param text A string
    */
    public void append(String id, String text)  {
        JnaComboBoxText.INST().gtk_combo_box_text_append(asCPointer(), id, text);
    }

    /**
     * Appends &#64;text to the list of strings stored in &#64;combo_box.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.ComboBoxText.insert_text]
     * <br>with a position of -1.
     * @param text A string
    */
    public void appendText(@Nonnull ch.bailu.gtk.type.Str text)  {
        JnaComboBoxText.INST().gtk_combo_box_text_append_text(asCPointer(), asCPointerNotNull(text));
    }

    /**
     * Appends &#64;text to the list of strings stored in &#64;combo_box.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.ComboBoxText.insert_text]
     * <br>with a position of -1.
     * @param text A string
    */
    public void appendText(String text)  {
        JnaComboBoxText.INST().gtk_combo_box_text_append_text(asCPointer(), text);
    }

    /**
     * Returns the currently active string in &#64;combo_box.
     * <br>
     * <br>If no row is currently selected, %NULL is returned.
     * <br>If &#64;combo_box contains an entry, this function will
     * <br>return its contents (which will not necessarily
     * <br>be an item from the list).
     * @return a newly allocated   string containing the currently active text.   Must be freed with g_free().
    */
    public ch.bailu.gtk.type.Str getActiveText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaComboBoxText.INST().gtk_combo_box_text_get_active_text(asCPointer())));
    }

    /**
     * Inserts &#64;text at &#64;position in the list of strings stored in &#64;combo_box.
     * <br>
     * <br>If &#64;id is non-%NULL then it is used as the ID of the row.
     * <br>See [property&#64;Gtk.ComboBox:id-column].
     * <br>
     * <br>If &#64;position is negative then &#64;text is appended.
     * @param position An index to insert &#64;text
     * @param id a string ID for this value
     * @param text A string to display
    */
    public void insert(int position, @Nullable ch.bailu.gtk.type.Str id, @Nonnull ch.bailu.gtk.type.Str text)  {
        JnaComboBoxText.INST().gtk_combo_box_text_insert(asCPointer(), position, asCPointer(id), asCPointerNotNull(text));
    }

    /**
     * Inserts &#64;text at &#64;position in the list of strings stored in &#64;combo_box.
     * <br>
     * <br>If &#64;id is non-%NULL then it is used as the ID of the row.
     * <br>See [property&#64;Gtk.ComboBox:id-column].
     * <br>
     * <br>If &#64;position is negative then &#64;text is appended.
     * @param position An index to insert &#64;text
     * @param id a string ID for this value
     * @param text A string to display
    */
    public void insert(int position, String id, String text)  {
        JnaComboBoxText.INST().gtk_combo_box_text_insert(asCPointer(), position, id, text);
    }

    /**
     * Inserts &#64;text at &#64;position in the list of strings stored in &#64;combo_box.
     * <br>
     * <br>If &#64;position is negative then &#64;text is appended.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.ComboBoxText.insert]
     * <br>with a %NULL ID string.
     * @param position An index to insert &#64;text
     * @param text A string
    */
    public void insertText(int position, @Nonnull ch.bailu.gtk.type.Str text)  {
        JnaComboBoxText.INST().gtk_combo_box_text_insert_text(asCPointer(), position, asCPointerNotNull(text));
    }

    /**
     * Inserts &#64;text at &#64;position in the list of strings stored in &#64;combo_box.
     * <br>
     * <br>If &#64;position is negative then &#64;text is appended.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.ComboBoxText.insert]
     * <br>with a %NULL ID string.
     * @param position An index to insert &#64;text
     * @param text A string
    */
    public void insertText(int position, String text)  {
        JnaComboBoxText.INST().gtk_combo_box_text_insert_text(asCPointer(), position, text);
    }

    /**
     * Prepends &#64;text to the list of strings stored in &#64;combo_box.
     * <br>
     * <br>If &#64;id is non-%NULL then it is used as the ID of the row.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.ComboBoxText.insert]
     * <br>with a position of 0.
     * @param id a string ID for this value
     * @param text a string
    */
    public void prepend(@Nullable ch.bailu.gtk.type.Str id, @Nonnull ch.bailu.gtk.type.Str text)  {
        JnaComboBoxText.INST().gtk_combo_box_text_prepend(asCPointer(), asCPointer(id), asCPointerNotNull(text));
    }

    /**
     * Prepends &#64;text to the list of strings stored in &#64;combo_box.
     * <br>
     * <br>If &#64;id is non-%NULL then it is used as the ID of the row.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.ComboBoxText.insert]
     * <br>with a position of 0.
     * @param id a string ID for this value
     * @param text a string
    */
    public void prepend(String id, String text)  {
        JnaComboBoxText.INST().gtk_combo_box_text_prepend(asCPointer(), id, text);
    }

    /**
     * Prepends &#64;text to the list of strings stored in &#64;combo_box.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.ComboBoxText.insert_text]
     * <br>with a position of 0.
     * @param text A string
    */
    public void prependText(@Nonnull ch.bailu.gtk.type.Str text)  {
        JnaComboBoxText.INST().gtk_combo_box_text_prepend_text(asCPointer(), asCPointerNotNull(text));
    }

    /**
     * Prepends &#64;text to the list of strings stored in &#64;combo_box.
     * <br>
     * <br>This is the same as calling [method&#64;Gtk.ComboBoxText.insert_text]
     * <br>with a position of 0.
     * @param text A string
    */
    public void prependText(String text)  {
        JnaComboBoxText.INST().gtk_combo_box_text_prepend_text(asCPointer(), text);
    }

    /**
     * Removes the string at &#64;position from &#64;combo_box.
     * @param position Index of the item to remove
    */
    public void remove(int position)  {
        JnaComboBoxText.INST().gtk_combo_box_text_remove(asCPointer(), position);
    }

    /**
     * Removes all the text entries from the combo box.
    */
    public void removeAll()  {
        JnaComboBoxText.INST().gtk_combo_box_text_remove_all(asCPointer());
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
     * Implements interface {@link CellEditable}. Call this to get access to interface functions.
     * @return {@link CellEditable}
    */
    public CellEditable asCellEditable() {
        return new CellEditable(cast());
    }

    /**
     * Implements interface {@link CellLayout}. Call this to get access to interface functions.
     * @return {@link CellLayout}
    */
    public CellLayout asCellLayout() {
        return new CellLayout(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaComboBoxText.INST().gtk_combo_box_text_get_type(); 
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
