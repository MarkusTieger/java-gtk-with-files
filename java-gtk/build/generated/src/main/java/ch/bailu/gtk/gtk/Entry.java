/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkEntry` is a single line text entry widget.
 * <br>
 * <br>![An example GtkEntry](entry.png)
 * <br>
 * <br>A fairly large set of key bindings are supported by default. If the
 * <br>entered text is longer than the allocation of the widget, the widget
 * <br>will scroll so that the cursor position is visible.
 * <br>
 * <br>When using an entry for passwords and other sensitive information, it
 * <br>can be put into “password mode” using [method&#64;Gtk.Entry.set_visibility].
 * <br>In this mode, entered text is displayed using a “invisible” character.
 * <br>By default, GTK picks the best invisible character that is available
 * <br>in the current font, but it can be changed with
 * <br>[method&#64;Gtk.Entry.set_invisible_char].
 * <br>
 * <br>`GtkEntry` has the ability to display progress or activity
 * <br>information behind the text. To make an entry display such information,
 * <br>use [method&#64;Gtk.Entry.set_progress_fraction] or
 * <br>[method&#64;Gtk.Entry.set_progress_pulse_step].
 * <br>
 * <br>Additionally, `GtkEntry` can show icons at either side of the entry.
 * <br>These icons can be activatable by clicking, can be set up as drag source
 * <br>and can have tooltips. To add an icon, use
 * <br>[method&#64;Gtk.Entry.set_icon_from_gicon] or one of the various other functions
 * <br>that set an icon from an icon name or a paintable. To trigger an action when
 * <br>the user clicks an icon, connect to the [signal&#64;Gtk.Entry::icon-press] signal.
 * <br>To allow DND operations from an icon, use
 * <br>[method&#64;Gtk.Entry.set_icon_drag_source]. To set a tooltip on an icon, use
 * <br>[method&#64;Gtk.Entry.set_icon_tooltip_text] or the corresponding function
 * <br>for markup.
 * <br>
 * <br>Note that functionality or information that is only available by clicking
 * <br>on an icon in an entry may not be accessible at all to users which are not
 * <br>able to use a mouse or other pointing device. It is therefore recommended
 * <br>that any such functionality should also be available by other means, e.g.
 * <br>via the context menu of the entry.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>entry[.flat][.warning][.error]
 * <br>├── text[.readonly]
 * <br>├── image.left
 * <br>├── image.right
 * <br>╰── [progress[.pulse]]
 * <br>```
 * <br>
 * <br>`GtkEntry` has a main node with the name entry. Depending on the properties
 * <br>of the entry, the style classes .read-only and .flat may appear. The style
 * <br>classes .warning and .error may also be used with entries.
 * <br>
 * <br>When the entry shows icons, it adds subnodes with the name image and the
 * <br>style class .left or .right, depending on where the icon appears.
 * <br>
 * <br>When the entry shows progress, it adds a subnode with the name progress.
 * <br>The node has the style class .pulse when the shown progress is pulsing.
 * <br>
 * <br>For all the subnodes added to the text node in various situations,
 * <br>see [class&#64;Gtk.Text].
 * <br>
 * <br>&#35; GtkEntry as GtkBuildable
 * <br>
 * <br>The `GtkEntry` implementation of the `GtkBuildable` interface supports a
 * <br>custom &lt;attributes&gt; element, which supports any number of &lt;attribute&gt;
 * <br>elements. The &lt;attribute&gt; element has attributes named “name“, “value“,
 * <br>“start“ and “end“ and allows you to specify `PangoAttribute` values for
 * <br>this label.
 * <br>
 * <br>An example of a UI definition fragment specifying Pango attributes:
 * <br>```xml
 * <br>&lt;object class=&quot;GtkEntry&quot;&gt;
 * <br>  &lt;attributes&gt;
 * <br>    &lt;attribute name=&quot;weight&quot; value=&quot;PANGO_WEIGHT_BOLD&quot;/&gt;
 * <br>    &lt;attribute name=&quot;background&quot; value=&quot;red&quot; start=&quot;5&quot; end=&quot;10&quot;/&gt;
 * <br>  &lt;/attributes&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>The start and end attributes specify the range of characters to which the
 * <br>Pango attribute applies. If start and end are not specified, the attribute
 * <br>is applied to the whole text. Note that specifying ranges does not make much
 * <br>sense with translatable attributes. Use markup embedded in the translatable
 * <br>content instead.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkEntry` uses the %GTK_ACCESSIBLE_ROLE_TEXT_BOX role.
 * <p><a href="https://docs.gtk.org/gtk4/class.Entry.html">https://docs.gtk.org/gtk4/class.Entry.html</a></p>
*/
public class Entry extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Entry.class.getCanonicalName());
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
        return (in == null) ? null: (JnaEntry.OnActivate) (__self, __data) -> in.onActivate();
    }

    @FunctionalInterface
    public interface OnIconPress {
        /**
         * Emitted when an activatable icon is clicked.
         * @param icon_pos The position of the clicked icon
        */
        void onIconPress(int icon_pos);
    }
    
    private static com.sun.jna.Callback toOnIconPress(OnIconPress in) {
        return (in == null) ? null: (JnaEntry.OnIconPress) (__self, _icon_pos, __data) -> in.onIconPress(_icon_pos);
    }

    @FunctionalInterface
    public interface OnIconRelease {
        /**
         * Emitted on the button release from a mouse click
         * <br>over an activatable icon.
         * @param icon_pos The position of the clicked icon
        */
        void onIconRelease(int icon_pos);
    }
    
    private static com.sun.jna.Callback toOnIconRelease(OnIconRelease in) {
        return (in == null) ? null: (JnaEntry.OnIconRelease) (__self, _icon_pos, __data) -> in.onIconRelease(_icon_pos);
    }

    public Entry(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new entry with the specified text buffer.
     * @param buffer The buffer to use for the new `GtkEntry`.
     * @return a new `GtkEntry`
    */
    public static Entry newWithBufferEntry(@Nonnull EntryBuffer buffer)  {
        PointerContainer __self = cast(JnaEntry.INST().gtk_entry_new_with_buffer(asCPointerNotNull(buffer)));
        if (__self.isNull()) {
            throw new NullPointerException("Entry:newWithBuffer");
        }
        return new Entry(__self);
    }        
    

    /**
     * Creates a new entry.
    */
    public Entry() {
        super(cast(JnaEntry.INST().gtk_entry_new()));
    }

    /**
     * Retrieves the value set by gtk_entry_set_activates_default().
     * @return %TRUE if the entry will activate the default widget
    */
    public boolean getActivatesDefault()  {
        return JnaEntry.INST().gtk_entry_get_activates_default(asCPointer());
    }

    /**
     * Gets the value set by gtk_entry_set_alignment().
     * <br>
     * <br>See also: [property&#64;Gtk.Editable:xalign]
     * @return the alignment
    */
    public float getAlignment()  {
        return JnaEntry.INST().gtk_entry_get_alignment(asCPointer());
    }

    /**
     * Gets the attribute list of the `GtkEntry`.
     * <br>
     * <br>See [method&#64;Gtk.Entry.set_attributes].
     * @return the attribute list
    */
    public ch.bailu.gtk.pango.AttrList getAttributes()  {
        return new ch.bailu.gtk.pango.AttrList(new PointerContainer(JnaEntry.INST().gtk_entry_get_attributes(asCPointer())));
    }

    /**
     * Get the `GtkEntryBuffer` object which holds the text for
     * <br>this widget.
     * @return A `GtkEntryBuffer` object.
    */
    public EntryBuffer getBuffer()  {
        return new EntryBuffer(new PointerContainer(JnaEntry.INST().gtk_entry_get_buffer(asCPointer())));
    }

    /**
     * Returns the auxiliary completion object currently
     * <br>in use by &#64;entry.
     * @return The auxiliary   completion object currently in use by &#64;entry
    */
    public EntryCompletion getCompletion()  {
        return new EntryCompletion(new PointerContainer(JnaEntry.INST().gtk_entry_get_completion(asCPointer())));
    }

    /**
     * Returns the index of the icon which is the source of the
     * <br>current  DND operation, or -1.
     * @return index of the icon which is the source of the   current DND operation, or -1.
    */
    public int getCurrentIconDragSource()  {
        return JnaEntry.INST().gtk_entry_get_current_icon_drag_source(asCPointer());
    }

    /**
     * Gets the menu model set with gtk_entry_set_extra_menu().
     * @return the menu model
    */
    public ch.bailu.gtk.gio.MenuModel getExtraMenu()  {
        return new ch.bailu.gtk.gio.MenuModel(new PointerContainer(JnaEntry.INST().gtk_entry_get_extra_menu(asCPointer())));
    }

    /**
     * Gets the value set by gtk_entry_set_has_frame().
     * @return whether the entry has a beveled frame
    */
    public boolean getHasFrame()  {
        return JnaEntry.INST().gtk_entry_get_has_frame(asCPointer());
    }

    /**
     * Returns whether the icon is activatable.
     * @param icon_pos Icon position
     * @return %TRUE if the icon is activatable.
    */
    public boolean getIconActivatable(int icon_pos)  {
        return JnaEntry.INST().gtk_entry_get_icon_activatable(asCPointer(), icon_pos);
    }

    /**
     * Gets the area where entry’s icon at &#64;icon_pos is drawn.
     * <br>
     * <br>This function is useful when drawing something to the
     * <br>entry in a draw callback.
     * <br>
     * <br>If the entry is not realized or has no icon at the given
     * <br>position, &#64;icon_area is filled with zeros. Otherwise,
     * <br>&#64;icon_area will be filled with the icon's allocation,
     * <br>relative to &#64;entry's allocation.
     * @param icon_pos Icon position
     * @param icon_area Return location for the icon’s area
    */
    public void getIconArea(int icon_pos, @Nonnull ch.bailu.gtk.gdk.Rectangle icon_area)  {
        JnaEntry.INST().gtk_entry_get_icon_area(asCPointer(), icon_pos, asCPointerNotNull(icon_area));
    }

    /**
     * Finds the icon at the given position and return its index.
     * <br>
     * <br>The position’s coordinates are relative to the &#64;entry’s
     * <br>top left corner. If &#64;x, &#64;y doesn’t lie inside an icon,
     * <br>-1 is returned. This function is intended for use in a
     * <br> [signal&#64;Gtk.Widget::query-tooltip] signal handler.
     * @param x the x coordinate of the position to find, relative to &#64;entry
     * @param y the y coordinate of the position to find, relative to &#64;entry
     * @return the index of the icon at the given position, or -1
    */
    public int getIconAtPos(int x, int y)  {
        return JnaEntry.INST().gtk_entry_get_icon_at_pos(asCPointer(), x, y);
    }

    /**
     * Retrieves the `GIcon` used for the icon.
     * <br>
     * <br>%NULL will be returned if there is no icon or if the icon was
     * <br>set by some other method (e.g., by `GdkPaintable` or icon name).
     * @param icon_pos Icon position
     * @return A `GIcon`
    */
    public ch.bailu.gtk.gio.Icon getIconGicon(int icon_pos)  {
        return new ch.bailu.gtk.gio.Icon(new PointerContainer(JnaEntry.INST().gtk_entry_get_icon_gicon(asCPointer(), icon_pos)));
    }

    /**
     * Retrieves the icon name used for the icon.
     * <br>
     * <br>%NULL is returned if there is no icon or if the icon was set
     * <br>by some other method (e.g., by `GdkPaintable` or gicon).
     * @param icon_pos Icon position
     * @return An icon name
    */
    public ch.bailu.gtk.type.Str getIconName(int icon_pos)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaEntry.INST().gtk_entry_get_icon_name(asCPointer(), icon_pos)));
    }

    /**
     * Retrieves the `GdkPaintable` used for the icon.
     * <br>
     * <br>If no `GdkPaintable` was used for the icon, %NULL is returned.
     * @param icon_pos Icon position
     * @return A `GdkPaintable`   if no icon is set for this position or the icon set is not   a `GdkPaintable`.
    */
    public ch.bailu.gtk.gdk.Paintable getIconPaintable(int icon_pos)  {
        return new ch.bailu.gtk.gdk.Paintable(new PointerContainer(JnaEntry.INST().gtk_entry_get_icon_paintable(asCPointer(), icon_pos)));
    }

    /**
     * Returns whether the icon appears sensitive or insensitive.
     * @param icon_pos Icon position
     * @return %TRUE if the icon is sensitive.
    */
    public boolean getIconSensitive(int icon_pos)  {
        return JnaEntry.INST().gtk_entry_get_icon_sensitive(asCPointer(), icon_pos);
    }

    /**
     * Gets the type of representation being used by the icon
     * <br>to store image data.
     * <br>
     * <br>If the icon has no image data, the return value will
     * <br>be %GTK_IMAGE_EMPTY.
     * @param icon_pos Icon position
     * @return image representation being used
    */
    public int getIconStorageType(int icon_pos)  {
        return JnaEntry.INST().gtk_entry_get_icon_storage_type(asCPointer(), icon_pos);
    }

    /**
     * Gets the contents of the tooltip on the icon at the specified
     * <br>position in &#64;entry.
     * @param icon_pos the icon position
     * @return the tooltip text
    */
    public ch.bailu.gtk.type.Str getIconTooltipMarkup(int icon_pos)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaEntry.INST().gtk_entry_get_icon_tooltip_markup(asCPointer(), icon_pos)));
    }

    /**
     * Gets the contents of the tooltip on the icon at the specified
     * <br>position in &#64;entry.
     * @param icon_pos the icon position
     * @return the tooltip text
    */
    public ch.bailu.gtk.type.Str getIconTooltipText(int icon_pos)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaEntry.INST().gtk_entry_get_icon_tooltip_text(asCPointer(), icon_pos)));
    }

    /**
     * Gets the input hints of this `GtkEntry`.
     * @return the input hints
    */
    public int getInputHints()  {
        return JnaEntry.INST().gtk_entry_get_input_hints(asCPointer());
    }

    /**
     * Gets the input purpose of the `GtkEntry`.
     * @return the input purpose
    */
    public int getInputPurpose()  {
        return JnaEntry.INST().gtk_entry_get_input_purpose(asCPointer());
    }

    /**
     * Retrieves the character displayed in place of the actual text
     * <br>in “password mode”.
     * @return the current invisible char, or 0, if the entry does not   show invisible text at all.
    */
    public byte getInvisibleChar()  {
        return JnaEntry.INST().gtk_entry_get_invisible_char(asCPointer());
    }

    /**
     * Retrieves the maximum allowed length of the text in &#64;entry.
     * <br>
     * <br>See [method&#64;Gtk.Entry.set_max_length].
     * @return the maximum allowed number of characters   in `GtkEntry`, or 0 if there is no maximum.
    */
    public int getMaxLength()  {
        return JnaEntry.INST().gtk_entry_get_max_length(asCPointer());
    }

    /**
     * Gets whether the `GtkEntry` is in overwrite mode.
     * @return whether the text is overwritten when typing.
    */
    public boolean getOverwriteMode()  {
        return JnaEntry.INST().gtk_entry_get_overwrite_mode(asCPointer());
    }

    /**
     * Retrieves the text that will be displayed when &#64;entry
     * <br>is empty and unfocused
     * @return a pointer to the   placeholder text as a string. This string points to   internally allocated storage in the widget and must   not be freed, modified or stored. If no placeholder   text has been set, %NULL will be returned.
    */
    public ch.bailu.gtk.type.Str getPlaceholderText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaEntry.INST().gtk_entry_get_placeholder_text(asCPointer())));
    }

    /**
     * Returns the current fraction of the task that’s been completed.
     * <br>
     * <br>See [method&#64;Gtk.Entry.set_progress_fraction].
     * @return a fraction from 0.0 to 1.0
    */
    public double getProgressFraction()  {
        return JnaEntry.INST().gtk_entry_get_progress_fraction(asCPointer());
    }

    /**
     * Retrieves the pulse step set with
     * <br>gtk_entry_set_progress_pulse_step().
     * @return a fraction from 0.0 to 1.0
    */
    public double getProgressPulseStep()  {
        return JnaEntry.INST().gtk_entry_get_progress_pulse_step(asCPointer());
    }

    /**
     * Gets the tabstops of the `GtkEntry.
     * <br>
     * <br>See [method&#64;Gtk.Entry.set_tabs].
     * @return the tabstops
    */
    public ch.bailu.gtk.pango.TabArray getTabs()  {
        return new ch.bailu.gtk.pango.TabArray(new PointerContainer(JnaEntry.INST().gtk_entry_get_tabs(asCPointer())));
    }

    /**
     * Retrieves the current length of the text in &#64;entry.
     * <br>
     * <br>This is equivalent to getting &#64;entry's `GtkEntryBuffer`
     * <br>and calling [method&#64;Gtk.EntryBuffer.get_length] on it.
     * @return the current number of characters   in `GtkEntry`, or 0 if there are none.
    */
    public int getTextLength()  {
        return JnaEntry.INST().gtk_entry_get_text_length(asCPointer());
    }

    /**
     * Retrieves whether the text in &#64;entry is visible.
     * <br>
     * <br>See [method&#64;Gtk.Entry.set_visibility].
     * @return %TRUE if the text is currently visible
    */
    public boolean getVisibility()  {
        return JnaEntry.INST().gtk_entry_get_visibility(asCPointer());
    }

    /**
     * Causes &#64;entry to have keyboard focus.
     * <br>
     * <br>It behaves like [method&#64;Gtk.Widget.grab_focus], except that it doesn't
     * <br>select the contents of the entry. You only want to call this on some
     * <br>special entries which the user usually doesn't want to replace all text
     * <br>in, such as search-as-you-type entries.
     * @return %TRUE if focus is now inside &#64;self
    */
    public boolean grabFocusWithoutSelecting()  {
        return JnaEntry.INST().gtk_entry_grab_focus_without_selecting(asCPointer());
    }

    /**
     * Indicates that some progress is made, but you don’t
     * <br>know how much.
     * <br>
     * <br>Causes the entry’s progress indicator to enter “activity
     * <br>mode”, where a block bounces back and forth. Each call to
     * <br>gtk_entry_progress_pulse() causes the block to move by a
     * <br>little bit (the amount of movement per pulse is determined
     * <br>by [method&#64;Gtk.Entry.set_progress_pulse_step]).
    */
    public void progressPulse()  {
        JnaEntry.INST().gtk_entry_progress_pulse(asCPointer());
    }

    /**
     * Reset the input method context of the entry if needed.
     * <br>
     * <br>This can be necessary in the case where modifying the buffer
     * <br>would confuse on-going input method behavior.
    */
    public void resetImContext()  {
        JnaEntry.INST().gtk_entry_reset_im_context(asCPointer());
    }

    /**
     * Sets whether pressing Enter in the &#64;entry will activate the default
     * <br>widget for the window containing the entry.
     * <br>
     * <br>This usually means that the dialog containing the entry will be closed,
     * <br>since the default widget is usually one of the dialog buttons.
     * @param setting %TRUE to activate window’s default widget on Enter keypress
    */
    public void setActivatesDefault(boolean setting)  {
        JnaEntry.INST().gtk_entry_set_activates_default(asCPointer(), setting);
    }

    /**
     * Sets the alignment for the contents of the entry.
     * <br>
     * <br>This controls the horizontal positioning of the contents when
     * <br>the displayed text is shorter than the width of the entry.
     * <br>
     * <br>See also: [property&#64;Gtk.Editable:xalign]
     * @param xalign The horizontal alignment, from 0 (left) to 1 (right).   Reversed for RTL layouts
    */
    public void setAlignment(float xalign)  {
        JnaEntry.INST().gtk_entry_set_alignment(asCPointer(), xalign);
    }

    /**
     * Sets a `PangoAttrList`.
     * <br>
     * <br>The attributes in the list are applied to the entry text.
     * <br>
     * <br>Since the attributes will be applies to text that changes
     * <br>as the user types, it makes most sense to use attributes
     * <br>with unlimited extent.
     * @param attrs a `PangoAttrList`
    */
    public void setAttributes(@Nonnull ch.bailu.gtk.pango.AttrList attrs)  {
        JnaEntry.INST().gtk_entry_set_attributes(asCPointer(), asCPointerNotNull(attrs));
    }

    /**
     * Set the `GtkEntryBuffer` object which holds the text for
     * <br>this widget.
     * @param buffer a `GtkEntryBuffer`
    */
    public void setBuffer(@Nonnull EntryBuffer buffer)  {
        JnaEntry.INST().gtk_entry_set_buffer(asCPointer(), asCPointerNotNull(buffer));
    }

    /**
     * Sets &#64;completion to be the auxiliary completion object
     * <br>to use with &#64;entry.
     * <br>
     * <br>All further configuration of the completion mechanism is
     * <br>done on &#64;completion using the `GtkEntryCompletion` API.
     * <br>Completion is disabled if &#64;completion is set to %NULL.
     * @param completion The `GtkEntryCompletion`
    */
    public void setCompletion(@Nullable EntryCompletion completion)  {
        JnaEntry.INST().gtk_entry_set_completion(asCPointer(), asCPointer(completion));
    }

    /**
     * Sets a menu model to add when constructing
     * <br>the context menu for &#64;entry.
     * @param model a `GMenuModel`
    */
    public void setExtraMenu(@Nullable ch.bailu.gtk.gio.MenuModel model)  {
        JnaEntry.INST().gtk_entry_set_extra_menu(asCPointer(), asCPointer(model));
    }

    /**
     * Sets whether the entry has a beveled frame around it.
     * @param setting new value
    */
    public void setHasFrame(boolean setting)  {
        JnaEntry.INST().gtk_entry_set_has_frame(asCPointer(), setting);
    }

    /**
     * Sets whether the icon is activatable.
     * @param icon_pos Icon position
     * @param activatable %TRUE if the icon should be activatable
    */
    public void setIconActivatable(int icon_pos, boolean activatable)  {
        JnaEntry.INST().gtk_entry_set_icon_activatable(asCPointer(), icon_pos, activatable);
    }

    /**
     * Sets up the icon at the given position as drag source.
     * <br>
     * <br>This makes it so that GTK will start a drag
     * <br>operation when the user clicks and drags the icon.
     * @param icon_pos icon position
     * @param provider a `GdkContentProvider`
     * @param actions a bitmask of the allowed drag actions
    */
    public void setIconDragSource(int icon_pos, @Nonnull ch.bailu.gtk.gdk.ContentProvider provider, int actions)  {
        JnaEntry.INST().gtk_entry_set_icon_drag_source(asCPointer(), icon_pos, asCPointerNotNull(provider), actions);
    }

    /**
     * Sets the icon shown in the entry at the specified position
     * <br>from the current icon theme.
     * <br>
     * <br>If the icon isn’t known, a “broken image” icon will be
     * <br>displayed instead.
     * <br>
     * <br>If &#64;icon is %NULL, no icon will be shown in the
     * <br>specified position.
     * @param icon_pos The position at which to set the icon
     * @param icon The icon to set
    */
    public void setIconFromGicon(int icon_pos, @Nullable ch.bailu.gtk.gio.Icon icon)  {
        JnaEntry.INST().gtk_entry_set_icon_from_gicon(asCPointer(), icon_pos, asCPointer(icon));
    }

    /**
     * Sets the icon shown in the entry at the specified position
     * <br>from the current icon theme.
     * <br>
     * <br>If the icon name isn’t known, a “broken image” icon will be
     * <br>displayed instead.
     * <br>
     * <br>If &#64;icon_name is %NULL, no icon will be shown in the
     * <br>specified position.
     * @param icon_pos The position at which to set the icon
     * @param icon_name An icon name
    */
    public void setIconFromIconName(int icon_pos, @Nullable ch.bailu.gtk.type.Str icon_name)  {
        JnaEntry.INST().gtk_entry_set_icon_from_icon_name(asCPointer(), icon_pos, asCPointer(icon_name));
    }

    /**
     * Sets the icon shown in the entry at the specified position
     * <br>from the current icon theme.
     * <br>
     * <br>If the icon name isn’t known, a “broken image” icon will be
     * <br>displayed instead.
     * <br>
     * <br>If &#64;icon_name is %NULL, no icon will be shown in the
     * <br>specified position.
     * @param icon_pos The position at which to set the icon
     * @param icon_name An icon name
    */
    public void setIconFromIconName(int icon_pos, String icon_name)  {
        JnaEntry.INST().gtk_entry_set_icon_from_icon_name(asCPointer(), icon_pos, icon_name);
    }

    /**
     * Sets the icon shown in the specified position using a `GdkPaintable`.
     * <br>
     * <br>If &#64;paintable is %NULL, no icon will be shown in the specified position.
     * @param icon_pos Icon position
     * @param paintable A `GdkPaintable`
    */
    public void setIconFromPaintable(int icon_pos, @Nullable ch.bailu.gtk.gdk.Paintable paintable)  {
        JnaEntry.INST().gtk_entry_set_icon_from_paintable(asCPointer(), icon_pos, asCPointer(paintable));
    }

    /**
     * Sets the sensitivity for the specified icon.
     * @param icon_pos Icon position
     * @param sensitive Specifies whether the icon should appear   sensitive or insensitive
    */
    public void setIconSensitive(int icon_pos, boolean sensitive)  {
        JnaEntry.INST().gtk_entry_set_icon_sensitive(asCPointer(), icon_pos, sensitive);
    }

    /**
     * Sets &#64;tooltip as the contents of the tooltip for the icon at
     * <br>the specified position.
     * <br>
     * <br>&#64;tooltip is assumed to be marked up with Pango Markup.
     * <br>
     * <br>Use %NULL for &#64;tooltip to remove an existing tooltip.
     * <br>
     * <br>See also [method&#64;Gtk.Widget.set_tooltip_markup] and
     * <br>[method&#64;Gtk.Entry.set_icon_tooltip_text].
     * @param icon_pos the icon position
     * @param tooltip the contents of the tooltip for the icon
    */
    public void setIconTooltipMarkup(int icon_pos, @Nullable ch.bailu.gtk.type.Str tooltip)  {
        JnaEntry.INST().gtk_entry_set_icon_tooltip_markup(asCPointer(), icon_pos, asCPointer(tooltip));
    }

    /**
     * Sets &#64;tooltip as the contents of the tooltip for the icon at
     * <br>the specified position.
     * <br>
     * <br>&#64;tooltip is assumed to be marked up with Pango Markup.
     * <br>
     * <br>Use %NULL for &#64;tooltip to remove an existing tooltip.
     * <br>
     * <br>See also [method&#64;Gtk.Widget.set_tooltip_markup] and
     * <br>[method&#64;Gtk.Entry.set_icon_tooltip_text].
     * @param icon_pos the icon position
     * @param tooltip the contents of the tooltip for the icon
    */
    public void setIconTooltipMarkup(int icon_pos, String tooltip)  {
        JnaEntry.INST().gtk_entry_set_icon_tooltip_markup(asCPointer(), icon_pos, tooltip);
    }

    /**
     * Sets &#64;tooltip as the contents of the tooltip for the icon
     * <br>at the specified position.
     * <br>
     * <br>Use %NULL for &#64;tooltip to remove an existing tooltip.
     * <br>
     * <br>See also [method&#64;Gtk.Widget.set_tooltip_text] and
     * <br>[method&#64;Gtk.Entry.set_icon_tooltip_markup].
     * <br>
     * <br>If you unset the widget tooltip via
     * <br>[method&#64;Gtk.Widget.set_tooltip_text] or
     * <br>[method&#64;Gtk.Widget.set_tooltip_markup], this sets
     * <br>[property&#64;Gtk.Widget:has-tooltip] to %FALSE, which suppresses
     * <br>icon tooltips too. You can resolve this by then calling
     * <br>[method&#64;Gtk.Widget.set_has_tooltip] to set
     * <br>[property&#64;Gtk.Widget:has-tooltip] back to %TRUE, or
     * <br>setting at least one non-empty tooltip on any icon
     * <br>achieves the same result.
     * @param icon_pos the icon position
     * @param tooltip the contents of the tooltip for the icon
    */
    public void setIconTooltipText(int icon_pos, @Nullable ch.bailu.gtk.type.Str tooltip)  {
        JnaEntry.INST().gtk_entry_set_icon_tooltip_text(asCPointer(), icon_pos, asCPointer(tooltip));
    }

    /**
     * Sets &#64;tooltip as the contents of the tooltip for the icon
     * <br>at the specified position.
     * <br>
     * <br>Use %NULL for &#64;tooltip to remove an existing tooltip.
     * <br>
     * <br>See also [method&#64;Gtk.Widget.set_tooltip_text] and
     * <br>[method&#64;Gtk.Entry.set_icon_tooltip_markup].
     * <br>
     * <br>If you unset the widget tooltip via
     * <br>[method&#64;Gtk.Widget.set_tooltip_text] or
     * <br>[method&#64;Gtk.Widget.set_tooltip_markup], this sets
     * <br>[property&#64;Gtk.Widget:has-tooltip] to %FALSE, which suppresses
     * <br>icon tooltips too. You can resolve this by then calling
     * <br>[method&#64;Gtk.Widget.set_has_tooltip] to set
     * <br>[property&#64;Gtk.Widget:has-tooltip] back to %TRUE, or
     * <br>setting at least one non-empty tooltip on any icon
     * <br>achieves the same result.
     * @param icon_pos the icon position
     * @param tooltip the contents of the tooltip for the icon
    */
    public void setIconTooltipText(int icon_pos, String tooltip)  {
        JnaEntry.INST().gtk_entry_set_icon_tooltip_text(asCPointer(), icon_pos, tooltip);
    }

    /**
     * Set additional hints which allow input methods to
     * <br>fine-tune their behavior.
     * @param hints the hints
    */
    public void setInputHints(int hints)  {
        JnaEntry.INST().gtk_entry_set_input_hints(asCPointer(), hints);
    }

    /**
     * Sets the input purpose which can be used by input methods
     * <br>to adjust their behavior.
     * @param purpose the purpose
    */
    public void setInputPurpose(int purpose)  {
        JnaEntry.INST().gtk_entry_set_input_purpose(asCPointer(), purpose);
    }

    /**
     * Sets the character to use in place of the actual text
     * <br>in “password mode”.
     * <br>
     * <br>See [method&#64;Gtk.Entry.set_visibility] for how to enable
     * <br>“password mode”.
     * <br>
     * <br>By default, GTK picks the best invisible char available in
     * <br>the current font. If you set the invisible char to 0, then
     * <br>the user will get no feedback at all; there will be no text
     * <br>on the screen as they type.
     * @param ch a Unicode character
    */
    public void setInvisibleChar(byte ch)  {
        JnaEntry.INST().gtk_entry_set_invisible_char(asCPointer(), ch);
    }

    /**
     * Sets the maximum allowed length of the contents of the widget.
     * <br>
     * <br>If the current contents are longer than the given length, then
     * <br>they will be truncated to fit. The length is is in characters.
     * <br>
     * <br>This is equivalent to getting &#64;entry's `GtkEntryBuffer` and
     * <br>calling [method&#64;Gtk.EntryBuffer.set_max_length] on it.
     * @param max the maximum length of the entry, or 0 for no maximum.   (other than the maximum length of entries.) The value passed in will   be clamped to the range 0-65536.
    */
    public void setMaxLength(int max)  {
        JnaEntry.INST().gtk_entry_set_max_length(asCPointer(), max);
    }

    /**
     * Sets whether the text is overwritten when typing in the `GtkEntry`.
     * @param overwrite new value
    */
    public void setOverwriteMode(boolean overwrite)  {
        JnaEntry.INST().gtk_entry_set_overwrite_mode(asCPointer(), overwrite);
    }

    /**
     * Sets text to be displayed in &#64;entry when it is empty.
     * <br>
     * <br>This can be used to give a visual hint of the expected
     * <br>contents of the `GtkEntry`.
     * @param text a string to be displayed when &#64;entry is empty and unfocused
    */
    public void setPlaceholderText(@Nullable ch.bailu.gtk.type.Str text)  {
        JnaEntry.INST().gtk_entry_set_placeholder_text(asCPointer(), asCPointer(text));
    }

    /**
     * Sets text to be displayed in &#64;entry when it is empty.
     * <br>
     * <br>This can be used to give a visual hint of the expected
     * <br>contents of the `GtkEntry`.
     * @param text a string to be displayed when &#64;entry is empty and unfocused
    */
    public void setPlaceholderText(String text)  {
        JnaEntry.INST().gtk_entry_set_placeholder_text(asCPointer(), text);
    }

    /**
     * Causes the entry’s progress indicator to “fill in” the given
     * <br>fraction of the bar.
     * <br>
     * <br>The fraction should be between 0.0 and 1.0, inclusive.
     * @param fraction fraction of the task that’s been completed
    */
    public void setProgressFraction(double fraction)  {
        JnaEntry.INST().gtk_entry_set_progress_fraction(asCPointer(), fraction);
    }

    /**
     * Sets the fraction of total entry width to move the progress
     * <br>bouncing block for each pulse.
     * <br>
     * <br>Use [method&#64;Gtk.Entry.progress_pulse] to pulse
     * <br>the progress.
     * @param fraction fraction between 0.0 and 1.0
    */
    public void setProgressPulseStep(double fraction)  {
        JnaEntry.INST().gtk_entry_set_progress_pulse_step(asCPointer(), fraction);
    }

    /**
     * Sets a `PangoTabArray`.
     * <br>
     * <br>The tabstops in the array are applied to the entry text.
     * @param tabs a `PangoTabArray`
    */
    public void setTabs(@Nullable ch.bailu.gtk.pango.TabArray tabs)  {
        JnaEntry.INST().gtk_entry_set_tabs(asCPointer(), asCPointer(tabs));
    }

    /**
     * Sets whether the contents of the entry are visible or not.
     * <br>
     * <br>When visibility is set to %FALSE, characters are displayed
     * <br>as the invisible char, and will also appear that way when
     * <br>the text in the entry widget is copied elsewhere.
     * <br>
     * <br>By default, GTK picks the best invisible character available
     * <br>in the current font, but it can be changed with
     * <br>[method&#64;Gtk.Entry.set_invisible_char].
     * <br>
     * <br>Note that you probably want to set [property&#64;Gtk.Entry:input-purpose]
     * <br>to %GTK_INPUT_PURPOSE_PASSWORD or %GTK_INPUT_PURPOSE_PIN to
     * <br>inform input methods about the purpose of this entry,
     * <br>in addition to setting visibility to %FALSE.
     * @param visible %TRUE if the contents of the entry are displayed as plaintext
    */
    public void setVisibility(boolean visible)  {
        JnaEntry.INST().gtk_entry_set_visibility(asCPointer(), visible);
    }

    /**
     * Unsets the invisible char, so that the default invisible char
     * <br>is used again. See [method&#64;Gtk.Entry.set_invisible_char].
    */
    public void unsetInvisibleChar()  {
        JnaEntry.INST().gtk_entry_unset_invisible_char(asCPointer());
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

    public final static String SIGNAL_ON_ICON_PRESS = "icon-press";
    
    /**
     * Connect to signal "icon-press".
     * <br>See {@link OnIconPress#onIconPress} for signal description.
     * <br>Field {@link #SIGNAL_ON_ICON_PRESS} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onIconPress(OnIconPress signal) {
        return connectSignal(SIGNAL_ON_ICON_PRESS, toOnIconPress(signal));
    }

    public final static String SIGNAL_ON_ICON_RELEASE = "icon-release";
    
    /**
     * Connect to signal "icon-release".
     * <br>See {@link OnIconRelease#onIconRelease} for signal description.
     * <br>Field {@link #SIGNAL_ON_ICON_RELEASE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onIconRelease(OnIconRelease signal) {
        return connectSignal(SIGNAL_ON_ICON_RELEASE, toOnIconRelease(signal));
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
        return JnaEntry.INST().gtk_entry_get_type(); 
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
