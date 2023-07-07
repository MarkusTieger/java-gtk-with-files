/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A [class&#64;Gtk.ListBoxRow] with an embedded text entry.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;entry-row-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;entry-row.png&quot; alt=&quot;entry-row&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>`AdwEntryRow` has a title that doubles as placeholder text. It shows an icon
 * <br>indicating that it's editable and can receive additional widgets before or
 * <br>after the editable part.
 * <br>
 * <br>If [property&#64;EntryRow:show-apply-button] is set to `TRUE`, `AdwEntryRow` can
 * <br>show an apply button when editing its contents. This can be useful if
 * <br>changing its contents can result in an expensive operation, such as network
 * <br>activity.
 * <br>
 * <br>`AdwEntryRow` provides only minimal API and should be used with the
 * <br>[iface&#64;Gtk.Editable] API.
 * <br>
 * <br>See also [class&#64;PasswordEntryRow].
 * <br>
 * <br>&#35;&#35; AdwEntryRow as GtkBuildable
 * <br>
 * <br>The `AdwEntryRow` implementation of the [iface&#64;Gtk.Buildable] interface
 * <br>supports adding a child at its end by specifying “suffix” or omitting the
 * <br>“type” attribute of a &lt;child&gt; element.
 * <br>
 * <br>It also supports adding a child as a prefix widget by specifying “prefix” as
 * <br>the “type” attribute of a &lt;child&gt; element.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwEntryRow` has a single CSS node with name `row` and the `.entry` style
 * <br>class.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.EntryRow.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.EntryRow.html</a></p>
*/
public class EntryRow extends PreferencesRow {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EntryRow.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnApply {
        /**
         * Emitted when the apply button is pressed.
         * <br>
         * <br>See [property&#64;EntryRow:show-apply-button].
        */
        void onApply();
    }
    
    private static com.sun.jna.Callback toOnApply(OnApply in) {
        return (in == null) ? null: (JnaEntryRow.OnApply) (__self, __data) -> in.onApply();
    }

    @FunctionalInterface
    public interface OnEntryActivated {
        /**
         * Emitted when the embedded entry is activated.
        */
        void onEntryActivated();
    }
    
    private static com.sun.jna.Callback toOnEntryActivated(OnEntryActivated in) {
        return (in == null) ? null: (JnaEntryRow.OnEntryActivated) (__self, __data) -> in.onEntryActivated();
    }

    public EntryRow(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwEntryRow`.
    */
    public EntryRow() {
        super(cast(JnaEntryRow.INST().adw_entry_row_new()));
    }

    /**
     * Adds a prefix widget to &#64;self.
     * @param widget a widget
    */
    public void addPrefix(@Nonnull ch.bailu.gtk.gtk.Widget widget)  {
        JnaEntryRow.INST().adw_entry_row_add_prefix(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Adds a suffix widget to &#64;self.
     * @param widget a widget
    */
    public void addSuffix(@Nonnull ch.bailu.gtk.gtk.Widget widget)  {
        JnaEntryRow.INST().adw_entry_row_add_suffix(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Gets whether activating the embedded entry can activate the default widget.
     * @return whether to activate the default widget
    */
    public boolean getActivatesDefault()  {
        return JnaEntryRow.INST().adw_entry_row_get_activates_default(asCPointer());
    }

    /**
     * Gets Pango attributes applied to the text of the embedded entry.
     * @return the list of attributes
    */
    public ch.bailu.gtk.pango.AttrList getAttributes()  {
        return new ch.bailu.gtk.pango.AttrList(new PointerContainer(JnaEntryRow.INST().adw_entry_row_get_attributes(asCPointer())));
    }

    /**
     * Gets whether to suggest emoji replacements on &#64;self.
     * @return whether or not emoji completion is enabled
    */
    public boolean getEnableEmojiCompletion()  {
        return JnaEntryRow.INST().adw_entry_row_get_enable_emoji_completion(asCPointer());
    }

    /**
     * Gets the additional input hints of &#64;self.
     * @return The input hints
    */
    public int getInputHints()  {
        return JnaEntryRow.INST().adw_entry_row_get_input_hints(asCPointer());
    }

    /**
     * Gets the input purpose of &#64;self.
     * @return the input purpose
    */
    public int getInputPurpose()  {
        return JnaEntryRow.INST().adw_entry_row_get_input_purpose(asCPointer());
    }

    /**
     * Gets whether &#64;self can show the apply button.
     * @return whether to show the apply button
    */
    public boolean getShowApplyButton()  {
        return JnaEntryRow.INST().adw_entry_row_get_show_apply_button(asCPointer());
    }

    /**
     * Removes a child from &#64;self.
     * @param widget the child to be removed
    */
    public void remove(@Nonnull ch.bailu.gtk.gtk.Widget widget)  {
        JnaEntryRow.INST().adw_entry_row_remove(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Sets whether activating the embedded entry can activate the default widget.
     * @param activates whether to activate the default widget
    */
    public void setActivatesDefault(boolean activates)  {
        JnaEntryRow.INST().adw_entry_row_set_activates_default(asCPointer(), activates);
    }

    /**
     * Sets Pango attributes to apply to the text of the embedded entry.
     * <br>
     * <br>The [struct&#64;Pango.Attribute]'s `start_index` and `end_index` must refer to
     * <br>the [class&#64;Gtk.EntryBuffer] text, i.e. without the preedit string.
     * @param attributes a list of attributes
    */
    public void setAttributes(@Nullable ch.bailu.gtk.pango.AttrList attributes)  {
        JnaEntryRow.INST().adw_entry_row_set_attributes(asCPointer(), asCPointer(attributes));
    }

    /**
     * Sets whether to suggest emoji replacements on &#64;self.
     * <br>
     * <br>Emoji replacement is done with :-delimited names, like `:heart:`.
     * @param enable_emoji_completion Whether emoji completion should be enabled or not
    */
    public void setEnableEmojiCompletion(boolean enable_emoji_completion)  {
        JnaEntryRow.INST().adw_entry_row_set_enable_emoji_completion(asCPointer(), enable_emoji_completion);
    }

    /**
     * Set additional input hints for &#64;self.
     * <br>
     * <br>Input hints allow input methods to fine-tune their behavior.
     * <br>
     * <br>See also: [property&#64;AdwEntryRow:input-purpose]
     * @param hints the hints
    */
    public void setInputHints(int hints)  {
        JnaEntryRow.INST().adw_entry_row_set_input_hints(asCPointer(), hints);
    }

    /**
     * Sets the input purpose of &#64;self.
     * <br>
     * <br>The input purpose can be used by input methods to adjust their behavior.
     * @param purpose the purpose
    */
    public void setInputPurpose(int purpose)  {
        JnaEntryRow.INST().adw_entry_row_set_input_purpose(asCPointer(), purpose);
    }

    /**
     * Sets whether &#64;self can show the apply button.
     * <br>
     * <br>When set to `TRUE`, typing text in the entry will reveal an apply button.
     * <br>Clicking it or pressing the &lt;kbd&gt;Enter&lt;/kbd&gt; key will hide the button and
     * <br>emit the [signal&#64;EntryRow::apply] signal.
     * <br>
     * <br>This is useful if changing the entry contents can trigger an expensive
     * <br>operation, e.g. network activity, to avoid triggering it after typing every
     * <br>character.
     * @param show_apply_button whether to show the apply button
    */
    public void setShowApplyButton(boolean show_apply_button)  {
        JnaEntryRow.INST().adw_entry_row_set_show_apply_button(asCPointer(), show_apply_button);
    }

    public final static String SIGNAL_ON_APPLY = "apply";
    
    /**
     * Connect to signal "apply".
     * <br>See {@link OnApply#onApply} for signal description.
     * <br>Field {@link #SIGNAL_ON_APPLY} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onApply(OnApply signal) {
        return connectSignal(SIGNAL_ON_APPLY, toOnApply(signal));
    }

    public final static String SIGNAL_ON_ENTRY_ACTIVATED = "entry-activated";
    
    /**
     * Connect to signal "entry-activated".
     * <br>See {@link OnEntryActivated#onEntryActivated} for signal description.
     * <br>Field {@link #SIGNAL_ON_ENTRY_ACTIVATED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEntryActivated(OnEntryActivated signal) {
        return connectSignal(SIGNAL_ON_ENTRY_ACTIVATED, toOnEntryActivated(signal));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Accessible}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Accessible}
    */
    public ch.bailu.gtk.gtk.Accessible asAccessible() {
        return new ch.bailu.gtk.gtk.Accessible(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Actionable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Actionable}
    */
    public ch.bailu.gtk.gtk.Actionable asActionable() {
        return new ch.bailu.gtk.gtk.Actionable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Buildable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Buildable}
    */
    public ch.bailu.gtk.gtk.Buildable asBuildable() {
        return new ch.bailu.gtk.gtk.Buildable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ConstraintTarget}
    */
    public ch.bailu.gtk.gtk.ConstraintTarget asConstraintTarget() {
        return new ch.bailu.gtk.gtk.ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Editable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Editable}
    */
    public ch.bailu.gtk.gtk.Editable asEditable() {
        return new ch.bailu.gtk.gtk.Editable(cast());
    }

    public static long getTypeID() { 
        return JnaEntryRow.INST().adw_entry_row_get_type(); 
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
