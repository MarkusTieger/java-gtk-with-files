/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkLabel` widget displays a small amount of text.
 * <br>
 * <br>As the name implies, most labels are used to label another widget
 * <br>such as a [class&#64;Button].
 * <br>
 * <br>![An example GtkLabel](label.png)
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>label
 * <br>├── [selection]
 * <br>├── [link]
 * <br>┊
 * <br>╰── [link]
 * <br>```
 * <br>
 * <br>`GtkLabel` has a single CSS node with the name label. A wide variety
 * <br>of style classes may be applied to labels, such as .title, .subtitle,
 * <br>.dim-label, etc. In the `GtkShortcutsWindow`, labels are used with the
 * <br>.keycap style class.
 * <br>
 * <br>If the label has a selection, it gets a subnode with name selection.
 * <br>
 * <br>If the label has links, there is one subnode per link. These subnodes
 * <br>carry the link or visited state depending on whether they have been
 * <br>visited. In this case, label node also gets a .link style class.
 * <br>
 * <br>&#35; GtkLabel as GtkBuildable
 * <br>
 * <br>The GtkLabel implementation of the GtkBuildable interface supports a
 * <br>custom &lt;attributes&gt; element, which supports any number of &lt;attribute&gt;
 * <br>elements. The &lt;attribute&gt; element has attributes named “name“, “value“,
 * <br>“start“ and “end“ and allows you to specify [struct&#64;Pango.Attribute]
 * <br>values for this label.
 * <br>
 * <br>An example of a UI definition fragment specifying Pango attributes:
 * <br>```xml
 * <br>&lt;object class=&quot;GtkLabel&quot;&gt;
 * <br>  &lt;attributes&gt;
 * <br>    &lt;attribute name=&quot;weight&quot; value=&quot;PANGO_WEIGHT_BOLD&quot;/&gt;
 * <br>    &lt;attribute name=&quot;background&quot; value=&quot;red&quot; start=&quot;5&quot; end=&quot;10&quot;/&gt;
 * <br>  &lt;/attributes&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>The start and end attributes specify the range of characters to which the
 * <br>Pango attribute applies. If start and end are not specified, the attribute is
 * <br>applied to the whole text. Note that specifying ranges does not make much
 * <br>sense with translatable attributes. Use markup embedded in the translatable
 * <br>content instead.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkLabel` uses the %GTK_ACCESSIBLE_ROLE_LABEL role.
 * <br>
 * <br>&#35; Mnemonics
 * <br>
 * <br>Labels may contain “mnemonics”. Mnemonics are underlined characters in the
 * <br>label, used for keyboard navigation. Mnemonics are created by providing a
 * <br>string with an underscore before the mnemonic character, such as `&quot;_File&quot;`,
 * <br>to the functions [ctor&#64;Gtk.Label.new_with_mnemonic] or
 * <br>[method&#64;Gtk.Label.set_text_with_mnemonic].
 * <br>
 * <br>Mnemonics automatically activate any activatable widget the label is
 * <br>inside, such as a [class&#64;Gtk.Button]; if the label is not inside the
 * <br>mnemonic’s target widget, you have to tell the label about the target
 * <br>using [class&#64;Gtk.Label.set_mnemonic_widget]. Here’s a simple example where
 * <br>the label is inside a button:
 * <br>
 * <br>```c
 * <br>// Pressing Alt+H will activate this button
 * <br>GtkWidget *button = gtk_button_new ();
 * <br>GtkWidget *label = gtk_label_new_with_mnemonic (&quot;_Hello&quot;);
 * <br>gtk_button_set_child (GTK_BUTTON (button), label);
 * <br>```
 * <br>
 * <br>There’s a convenience function to create buttons with a mnemonic label
 * <br>already inside:
 * <br>
 * <br>```c
 * <br>// Pressing Alt+H will activate this button
 * <br>GtkWidget *button = gtk_button_new_with_mnemonic (&quot;_Hello&quot;);
 * <br>```
 * <br>
 * <br>To create a mnemonic for a widget alongside the label, such as a
 * <br>[class&#64;Gtk.Entry], you have to point the label at the entry with
 * <br>[method&#64;Gtk.Label.set_mnemonic_widget]:
 * <br>
 * <br>```c
 * <br>// Pressing Alt+H will focus the entry
 * <br>GtkWidget *entry = gtk_entry_new ();
 * <br>GtkWidget *label = gtk_label_new_with_mnemonic (&quot;_Hello&quot;);
 * <br>gtk_label_set_mnemonic_widget (GTK_LABEL (label), entry);
 * <br>```
 * <br>
 * <br>&#35; Markup (styled text)
 * <br>
 * <br>To make it easy to format text in a label (changing colors,
 * <br>fonts, etc.), label text can be provided in a simple
 * <br>markup format:
 * <br>
 * <br>Here’s how to create a label with a small font:
 * <br>```c
 * <br>GtkWidget *label = gtk_label_new (NULL);
 * <br>gtk_label_set_markup (GTK_LABEL (label), &quot;&lt;small&gt;Small text&lt;/small&gt;&quot;);
 * <br>```
 * <br>
 * <br>(See the Pango manual for complete documentation] of available
 * <br>tags, [func&#64;Pango.parse_markup])
 * <br>
 * <br>The markup passed to gtk_label_set_markup() must be valid; for example,
 * <br>literal &lt;, &gt; and &amp; characters must be escaped as &amp;lt;, &amp;gt;, and &amp;amp;.
 * <br>If you pass text obtained from the user, file, or a network to
 * <br>[method&#64;Gtk.Label.set_markup], you’ll want to escape it with
 * <br>g_markup_escape_text() or g_markup_printf_escaped().
 * <br>
 * <br>Markup strings are just a convenient way to set the [struct&#64;Pango.AttrList]
 * <br>on a label; [method&#64;Gtk.Label.set_attributes] may be a simpler way to set
 * <br>attributes in some cases. Be careful though; [struct&#64;Pango.AttrList] tends
 * <br>to cause internationalization problems, unless you’re applying attributes
 * <br>to the entire string (i.e. unless you set the range of each attribute
 * <br>to [0, %G_MAXINT)). The reason is that specifying the start_index and
 * <br>end_index for a [struct&#64;Pango.Attribute] requires knowledge of the exact
 * <br>string being displayed, so translations will cause problems.
 * <br>
 * <br>&#35; Selectable labels
 * <br>
 * <br>Labels can be made selectable with [method&#64;Gtk.Label.set_selectable].
 * <br>Selectable labels allow the user to copy the label contents to
 * <br>the clipboard. Only labels that contain useful-to-copy information
 * <br>— such as error messages — should be made selectable.
 * <br>
 * <br>&#35; Text layout
 * <br>
 * <br>A label can contain any number of paragraphs, but will have
 * <br>performance problems if it contains more than a small number.
 * <br>Paragraphs are separated by newlines or other paragraph separators
 * <br>understood by Pango.
 * <br>
 * <br>Labels can automatically wrap text if you call [method&#64;Gtk.Label.set_wrap].
 * <br>
 * <br>[method&#64;Gtk.Label.set_justify] sets how the lines in a label align
 * <br>with one another. If you want to set how the label as a whole aligns
 * <br>in its available space, see the [property&#64;Gtk.Widget:halign] and
 * <br>[property&#64;Gtk.Widget:valign] properties.
 * <br>
 * <br>The [property&#64;Gtk.Label:width-chars] and [property&#64;Gtk.Label:max-width-chars]
 * <br>properties can be used to control the size allocation of ellipsized or
 * <br>wrapped labels. For ellipsizing labels, if either is specified (and less
 * <br>than the actual text size), it is used as the minimum width, and the actual
 * <br>text size is used as the natural width of the label. For wrapping labels,
 * <br>width-chars is used as the minimum width, if specified, and max-width-chars
 * <br>is used as the natural width. Even if max-width-chars specified, wrapping
 * <br>labels will be rewrapped to use all of the available width.
 * <br>
 * <br>&#35; Links
 * <br>
 * <br>GTK supports markup for clickable hyperlinks in addition to regular Pango
 * <br>markup. The markup for links is borrowed from HTML, using the `&lt;a&gt;` with
 * <br>“href“, “title“ and “class“ attributes. GTK renders links similar to the
 * <br>way they appear in web browsers, with colored, underlined text. The “title“
 * <br>attribute is displayed as a tooltip on the link. The “class“ attribute is
 * <br>used as style class on the CSS node for the link.
 * <br>
 * <br>An example looks like this:
 * <br>
 * <br>```c
 * <br>const char *text =
 * <br>&quot;Go to the&quot;
 * <br>&quot;&lt;a href=&#92;&quot;http://www.gtk.org title=&#92;&quot;&amp;lt;i&amp;gt;Our&amp;lt;/i&amp;gt; website&#92;&quot;&gt;&quot;
 * <br>&quot;GTK website&lt;/a&gt; for more...&quot;;
 * <br>GtkWidget *label = gtk_label_new (NULL);
 * <br>gtk_label_set_markup (GTK_LABEL (label), text);
 * <br>```
 * <br>
 * <br>It is possible to implement custom handling for links and their tooltips
 * <br>with the [signal&#64;Gtk.Label::activate-link] signal and the
 * <br>[method&#64;Gtk.Label.get_current_uri] function.
 * <p><a href="https://docs.gtk.org/gtk4/class.Label.html">https://docs.gtk.org/gtk4/class.Label.html</a></p>
*/
public class Label extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Label.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivateCurrentLink {
        /**
         * Gets emitted when the user activates a link in the label.
         * <br>
         * <br>The ::activate-current-link is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>Applications may also emit the signal with g_signal_emit_by_name()
         * <br>if they need to control activation of URIs programmatically.
         * <br>
         * <br>The default bindings for this signal are all forms of the Enter key.
        */
        void onActivateCurrentLink();
    }
    
    private static com.sun.jna.Callback toOnActivateCurrentLink(OnActivateCurrentLink in) {
        return (in == null) ? null: (JnaLabel.OnActivateCurrentLink) (__self, __data) -> in.onActivateCurrentLink();
    }

    @FunctionalInterface
    public interface OnActivateLink {
        /**
         * Gets emitted to activate a URI.
         * <br>
         * <br>Applications may connect to it to override the default behaviour,
         * <br>which is to call gtk_show_uri().
         * @param uri the URI that is activated
         * @return %TRUE if the link has been activated
        */
        boolean onActivateLink(@Nonnull ch.bailu.gtk.type.Str uri);
    }
    
    private static com.sun.jna.Callback toOnActivateLink(OnActivateLink in) {
        return (in == null) ? null: (JnaLabel.OnActivateLink) (__self, _uri, __data) -> in.onActivateLink(new ch.bailu.gtk.type.Str(new PointerContainer(_uri)));
    }

    @FunctionalInterface
    public interface OnCopyClipboard {
        /**
         * Gets emitted to copy the slection to the clipboard.
         * <br>
         * <br>The ::copy-clipboard signal is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is Ctrl-c.
        */
        void onCopyClipboard();
    }
    
    private static com.sun.jna.Callback toOnCopyClipboard(OnCopyClipboard in) {
        return (in == null) ? null: (JnaLabel.OnCopyClipboard) (__self, __data) -> in.onCopyClipboard();
    }

    @FunctionalInterface
    public interface OnMoveCursor {
        /**
         * Gets emitted when the user initiates a cursor movement.
         * <br>
         * <br>The ::move-cursor signal is a [keybinding signal](class.SignalAction.html).
         * <br>If the cursor is not visible in &#64;entry, this signal causes the viewport to
         * <br>be moved instead.
         * <br>
         * <br>Applications should not connect to it, but may emit it with
         * <br>g_signal_emit_by_name() if they need to control the cursor
         * <br>programmatically.
         * <br>
         * <br>The default bindings for this signal come in two variants,
         * <br>the variant with the Shift modifier extends the selection,
         * <br>the variant without the Shift modifier does not.
         * <br>There are too many key combinations to list them all here.
         * <br>- Arrow keys move by individual characters/lines
         * <br>- Ctrl-arrow key combinations move by words/paragraphs
         * <br>- Home/End keys move to the ends of the buffer
         * @param step the granularity of the move, as a `GtkMovementStep`
         * @param count the number of &#64;step units to move
         * @param extend_selection %TRUE if the move should extend the selection
        */
        void onMoveCursor(int step, int count, boolean extend_selection);
    }
    
    private static com.sun.jna.Callback toOnMoveCursor(OnMoveCursor in) {
        return (in == null) ? null: (JnaLabel.OnMoveCursor) (__self, _step, _count, _extend_selection, __data) -> in.onMoveCursor(_step, _count, _extend_selection);
    }

    public Label(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkLabel`, containing the text in &#64;str.
     * <br>
     * <br>If characters in &#64;str are preceded by an underscore, they are
     * <br>underlined. If you need a literal underscore character in a label, use
     * <br>'__' (two underscores). The first underlined character represents a
     * <br>keyboard accelerator called a mnemonic. The mnemonic key can be used
     * <br>to activate another widget, chosen automatically, or explicitly using
     * <br>[method&#64;Gtk.Label.set_mnemonic_widget].
     * <br>
     * <br>If [method&#64;Gtk.Label.set_mnemonic_widget] is not called, then the first
     * <br>activatable ancestor of the `GtkLabel` will be chosen as the mnemonic
     * <br>widget. For instance, if the label is inside a button or menu item,
     * <br>the button or menu item will automatically become the mnemonic widget
     * <br>and be activated by the mnemonic.
     * @param str The text of the label, with an underscore in front of the   mnemonic character
     * @return the new `GtkLabel`
    */
    public static Label newWithMnemonicLabel(@Nullable ch.bailu.gtk.type.Str str)  {
        PointerContainer __self = cast(JnaLabel.INST().gtk_label_new_with_mnemonic(asCPointer(str)));
        if (__self.isNull()) {
            throw new NullPointerException("Label:newWithMnemonic");
        }
        return new Label(__self);
    }        
    

    /**
     * Creates a new `GtkLabel`, containing the text in &#64;str.
     * <br>
     * <br>If characters in &#64;str are preceded by an underscore, they are
     * <br>underlined. If you need a literal underscore character in a label, use
     * <br>'__' (two underscores). The first underlined character represents a
     * <br>keyboard accelerator called a mnemonic. The mnemonic key can be used
     * <br>to activate another widget, chosen automatically, or explicitly using
     * <br>[method&#64;Gtk.Label.set_mnemonic_widget].
     * <br>
     * <br>If [method&#64;Gtk.Label.set_mnemonic_widget] is not called, then the first
     * <br>activatable ancestor of the `GtkLabel` will be chosen as the mnemonic
     * <br>widget. For instance, if the label is inside a button or menu item,
     * <br>the button or menu item will automatically become the mnemonic widget
     * <br>and be activated by the mnemonic.
     * @param str The text of the label, with an underscore in front of the   mnemonic character
     * @return the new `GtkLabel`
    */
    public static Label newWithMnemonicLabel(String str)  {
        PointerContainer __self = cast(JnaLabel.INST().gtk_label_new_with_mnemonic(str));
        if (__self.isNull()) {
            throw new NullPointerException("Label:newWithMnemonic");
        }
        return new Label(__self);
    }        
    

    /**
     * Creates a new label with the given text inside it.
     * <br>
     * <br>You can pass %NULL to get an empty label widget.
     * @param str The text of the label
    */
    public Label(@Nullable ch.bailu.gtk.type.Str str) {
        super(cast(JnaLabel.INST().gtk_label_new(asCPointer(str))));
    }

    /**
     * Creates a new label with the given text inside it.
     * <br>
     * <br>You can pass %NULL to get an empty label widget.
     * @param str The text of the label
    */
    public Label(String str) {
        super(cast(JnaLabel.INST().gtk_label_new(str)));
    }

    /**
     * Gets the labels attribute list.
     * <br>
     * <br>This is the [struct&#64;Pango.AttrList] that was set on the label using
     * <br>[method&#64;Gtk.Label.set_attributes], if any. This function does not
     * <br>reflect attributes that come from the labels markup (see
     * <br>[method&#64;Gtk.Label.set_markup]). If you want to get the effective
     * <br>attributes for the label, use
     * <br>`pango_layout_get_attribute (gtk_label_get_layout (self))`.
     * @return the attribute list
    */
    public ch.bailu.gtk.pango.AttrList getAttributes()  {
        return new ch.bailu.gtk.pango.AttrList(new PointerContainer(JnaLabel.INST().gtk_label_get_attributes(asCPointer())));
    }

    /**
     * Returns the URI for the currently active link in the label.
     * <br>
     * <br>The active link is the one under the mouse pointer or, in a
     * <br>selectable label, the link in which the text cursor is currently
     * <br>positioned.
     * <br>
     * <br>This function is intended for use in a [signal&#64;Gtk.Label::activate-link]
     * <br>handler or for use in a [signal&#64;Gtk.Widget::query-tooltip] handler.
     * @return the currently active URI
    */
    public ch.bailu.gtk.type.Str getCurrentUri()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaLabel.INST().gtk_label_get_current_uri(asCPointer())));
    }

    /**
     * Returns the ellipsizing position of the label.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_ellipsize].
     * @return `PangoEllipsizeMode`
    */
    public int getEllipsize()  {
        return JnaLabel.INST().gtk_label_get_ellipsize(asCPointer());
    }

    /**
     * Gets the extra menu model of &#64;label.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_extra_menu].
     * @return the menu model
    */
    public ch.bailu.gtk.gio.MenuModel getExtraMenu()  {
        return new ch.bailu.gtk.gio.MenuModel(new PointerContainer(JnaLabel.INST().gtk_label_get_extra_menu(asCPointer())));
    }

    /**
     * Returns the justification of the label.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_justify].
     * @return `GtkJustification`
    */
    public int getJustify()  {
        return JnaLabel.INST().gtk_label_get_justify(asCPointer());
    }

    /**
     * Fetches the text from a label.
     * <br>
     * <br>The returned text includes any embedded underlines indicating
     * <br>mnemonics and Pango markup. (See [method&#64;Gtk.Label.get_text]).
     * @return the text of the label widget. This string is   owned by the widget and must not be modified or freed.
    */
    public ch.bailu.gtk.type.Str getLabel()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaLabel.INST().gtk_label_get_label(asCPointer())));
    }

    /**
     * Gets the `PangoLayout` used to display the label.
     * <br>
     * <br>The layout is useful to e.g. convert text positions to pixel
     * <br>positions, in combination with [method&#64;Gtk.Label.get_layout_offsets].
     * <br>The returned layout is owned by the &#64;label so need not be
     * <br>freed by the caller. The &#64;label is free to recreate its layout
     * <br>at any time, so it should be considered read-only.
     * @return the [class&#64;Pango.Layout] for this label
    */
    public ch.bailu.gtk.pango.Layout getLayout()  {
        return new ch.bailu.gtk.pango.Layout(new PointerContainer(JnaLabel.INST().gtk_label_get_layout(asCPointer())));
    }

    /**
     * Obtains the coordinates where the label will draw its `PangoLayout`.
     * <br>
     * <br>The coordinates are useful to convert mouse events into coordinates
     * <br>inside the [class&#64;Pango.Layout], e.g. to take some action if some part
     * <br>of the label is clicked. Remember when using the [class&#64;Pango.Layout]
     * <br>functions you need to convert to and from pixels using PANGO_PIXELS()
     * <br>or [const&#64;Pango.SCALE].
     * @param x location to store X offset of layout
     * @param y location to store Y offset of layout
    */
    public void getLayoutOffsets(@Nullable ch.bailu.gtk.type.Int x, @Nullable ch.bailu.gtk.type.Int y)  {
        JnaLabel.INST().gtk_label_get_layout_offsets(asCPointer(), asCPointer(x), asCPointer(y));
    }

    /**
     * Gets the number of lines to which an ellipsized, wrapping
     * <br>label should be limited.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_lines].
     * @return The number of lines
    */
    public int getLines()  {
        return JnaLabel.INST().gtk_label_get_lines(asCPointer());
    }

    /**
     * Retrieves the desired maximum width of &#64;label, in characters.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_width_chars].
     * @return the maximum width of the label in characters.
    */
    public int getMaxWidthChars()  {
        return JnaLabel.INST().gtk_label_get_max_width_chars(asCPointer());
    }

    /**
     * Return the mnemonic accelerator.
     * <br>
     * <br>If the label has been set so that it has a mnemonic key this function
     * <br>returns the keyval used for the mnemonic accelerator. If there is no
     * <br>mnemonic set up it returns `GDK_KEY_VoidSymbol`.
     * @return GDK keyval usable for accelerators, or `GDK_KEY_VoidSymbol`
    */
    public int getMnemonicKeyval()  {
        return JnaLabel.INST().gtk_label_get_mnemonic_keyval(asCPointer());
    }

    /**
     * Retrieves the target of the mnemonic (keyboard shortcut) of this
     * <br>label.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_mnemonic_widget].
     * @return the target of the label’s mnemonic,   or %NULL if none has been set and the default algorithm will be used.
    */
    public Widget getMnemonicWidget()  {
        return new Widget(new PointerContainer(JnaLabel.INST().gtk_label_get_mnemonic_widget(asCPointer())));
    }

    /**
     * Returns line wrap mode used by the label.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_natural_wrap_mode].
     * @return the natural line wrap mode
    */
    public int getNaturalWrapMode()  {
        return JnaLabel.INST().gtk_label_get_natural_wrap_mode(asCPointer());
    }

    /**
     * Returns whether the label is selectable.
     * @return %TRUE if the user can copy text from the label
    */
    public boolean getSelectable()  {
        return JnaLabel.INST().gtk_label_get_selectable(asCPointer());
    }

    /**
     * Gets the selected range of characters in the label.
     * @param start return location for start of selection, as a character offset
     * @param end return location for end of selection, as a character offset
     * @return %TRUE if selection is non-empty
    */
    public boolean getSelectionBounds(@Nullable ch.bailu.gtk.type.Int start, @Nullable ch.bailu.gtk.type.Int end)  {
        return JnaLabel.INST().gtk_label_get_selection_bounds(asCPointer(), asCPointer(start), asCPointer(end));
    }

    /**
     * Returns whether the label is in single line mode.
     * @return %TRUE when the label is in single line mode.
    */
    public boolean getSingleLineMode()  {
        return JnaLabel.INST().gtk_label_get_single_line_mode(asCPointer());
    }

    /**
     * Gets the tabs for &#64;self.
     * <br>
     * <br>The returned array will be %NULL if “standard” (8-space) tabs are used.
     * <br>Free the return value with [method&#64;Pango.TabArray.free].
     * @return copy of default tab array,   or %NULL if standard tabs are used; must be freed with   [method&#64;Pango.TabArray.free].
    */
    public ch.bailu.gtk.pango.TabArray getTabs()  {
        return new ch.bailu.gtk.pango.TabArray(new PointerContainer(JnaLabel.INST().gtk_label_get_tabs(asCPointer())));
    }

    /**
     * Fetches the text from a label.
     * <br>
     * <br>The returned text is as it appears on screen. This does not include
     * <br>any embedded underlines indicating mnemonics or Pango markup. (See
     * <br>[method&#64;Gtk.Label.get_label])
     * @return the text in the label widget. This is the internal   string used by the label, and must not be modified.
    */
    public ch.bailu.gtk.type.Str getText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaLabel.INST().gtk_label_get_text(asCPointer())));
    }

    /**
     * Returns whether the label’s text is interpreted as Pango markup.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_use_markup].
     * @return %TRUE if the label’s text will be parsed for markup.
    */
    public boolean getUseMarkup()  {
        return JnaLabel.INST().gtk_label_get_use_markup(asCPointer());
    }

    /**
     * Returns whether an embedded underlines in the label indicate mnemonics.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_use_underline].
     * @return %TRUE whether an embedded underline in the label indicates   the mnemonic accelerator keys.
    */
    public boolean getUseUnderline()  {
        return JnaLabel.INST().gtk_label_get_use_underline(asCPointer());
    }

    /**
     * Retrieves the desired width of &#64;label, in characters.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_width_chars].
     * @return the width of the label in characters.
    */
    public int getWidthChars()  {
        return JnaLabel.INST().gtk_label_get_width_chars(asCPointer());
    }

    /**
     * Returns whether lines in the label are automatically wrapped.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_wrap].
     * @return %TRUE if the lines of the label are automatically wrapped.
    */
    public boolean getWrap()  {
        return JnaLabel.INST().gtk_label_get_wrap(asCPointer());
    }

    /**
     * Returns line wrap mode used by the label.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_wrap_mode].
     * @return the line wrap mode
    */
    public int getWrapMode()  {
        return JnaLabel.INST().gtk_label_get_wrap_mode(asCPointer());
    }

    /**
     * Gets the `xalign` of the label.
     * <br>
     * <br>See the [property&#64;Gtk.Label:xalign] property.
     * @return the xalign property
    */
    public float getXalign()  {
        return JnaLabel.INST().gtk_label_get_xalign(asCPointer());
    }

    /**
     * Gets the `yalign` of the label.
     * <br>
     * <br>See the [property&#64;Gtk.Label:yalign] property.
     * @return the yalign property
    */
    public float getYalign()  {
        return JnaLabel.INST().gtk_label_get_yalign(asCPointer());
    }

    /**
     * Selects a range of characters in the label, if the label is selectable.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_selectable]. If the label is not selectable,
     * <br>this function has no effect. If &#64;start_offset or
     * <br>&#64;end_offset are -1, then the end of the label will be substituted.
     * @param start_offset start offset (in characters not bytes)
     * @param end_offset end offset (in characters not bytes)
    */
    public void selectRegion(int start_offset, int end_offset)  {
        JnaLabel.INST().gtk_label_select_region(asCPointer(), start_offset, end_offset);
    }

    /**
     * Apply attributes to the label text.
     * <br>
     * <br>The attributes set with this function will be applied and merged with
     * <br>any other attributes previously effected by way of the
     * <br>[property&#64;Gtk.Label:use-underline] or [property&#64;Gtk.Label:use-markup]
     * <br>properties. While it is not recommended to mix markup strings with
     * <br>manually set attributes, if you must; know that the attributes will
     * <br>be applied to the label after the markup string is parsed.
     * @param attrs a [struct&#64;Pango.AttrList]
    */
    public void setAttributes(@Nullable ch.bailu.gtk.pango.AttrList attrs)  {
        JnaLabel.INST().gtk_label_set_attributes(asCPointer(), asCPointer(attrs));
    }

    /**
     * Sets the mode used to ellipsizei the text.
     * <br>
     * <br>The text will be ellipsized if there is not enough space
     * <br>to render the entire string.
     * @param mode a `PangoEllipsizeMode`
    */
    public void setEllipsize(int mode)  {
        JnaLabel.INST().gtk_label_set_ellipsize(asCPointer(), mode);
    }

    /**
     * Sets a menu model to add when constructing
     * <br>the context menu for &#64;label.
     * @param model a `GMenuModel`
    */
    public void setExtraMenu(@Nullable ch.bailu.gtk.gio.MenuModel model)  {
        JnaLabel.INST().gtk_label_set_extra_menu(asCPointer(), asCPointer(model));
    }

    /**
     * Sets the alignment of the lines in the text of the label relative to
     * <br>each other.
     * <br>
     * <br>%GTK_JUSTIFY_LEFT is the default value when the widget is first created
     * <br>with [ctor&#64;Gtk.Label.new]. If you instead want to set the alignment of
     * <br>the label as a whole, use [method&#64;Gtk.Widget.set_halign] instead.
     * <br>[method&#64;Gtk.Label.set_justify] has no effect on labels containing
     * <br>only a single line.
     * @param jtype a `GtkJustification`
    */
    public void setJustify(int jtype)  {
        JnaLabel.INST().gtk_label_set_justify(asCPointer(), jtype);
    }

    /**
     * Sets the text of the label.
     * <br>
     * <br>The label is interpreted as including embedded underlines and/or Pango
     * <br>markup depending on the values of the [property&#64;Gtk.Label:use-underline]
     * <br>and [property&#64;Gtk.Label:use-markup] properties.
     * @param str the new text to set for the label
    */
    public void setLabel(@Nonnull ch.bailu.gtk.type.Str str)  {
        JnaLabel.INST().gtk_label_set_label(asCPointer(), asCPointerNotNull(str));
    }

    /**
     * Sets the text of the label.
     * <br>
     * <br>The label is interpreted as including embedded underlines and/or Pango
     * <br>markup depending on the values of the [property&#64;Gtk.Label:use-underline]
     * <br>and [property&#64;Gtk.Label:use-markup] properties.
     * @param str the new text to set for the label
    */
    public void setLabel(String str)  {
        JnaLabel.INST().gtk_label_set_label(asCPointer(), str);
    }

    /**
     * Sets the number of lines to which an ellipsized, wrapping label
     * <br>should be limited.
     * <br>
     * <br>This has no effect if the label is not wrapping or ellipsized.
     * <br>Set this to -1 if you don’t want to limit the number of lines.
     * @param lines the desired number of lines, or -1
    */
    public void setLines(int lines)  {
        JnaLabel.INST().gtk_label_set_lines(asCPointer(), lines);
    }

    /**
     * Sets the labels text and attributes from markup.
     * <br>
     * <br>The string must be marked up with Pango markup
     * <br>(see [func&#64;Pango.parse_markup]).
     * <br>
     * <br>If the &#64;str is external data, you may need to escape it
     * <br>with g_markup_escape_text() or g_markup_printf_escaped():
     * <br>
     * <br>```c
     * <br>GtkWidget *self = gtk_label_new (NULL);
     * <br>const char *str = &quot;...&quot;;
     * <br>const char *format = &quot;&lt;span style=&#92;&quot;italic&#92;&quot;&gt;&#92;%s&lt;/span&gt;&quot;;
     * <br>char *markup;
     * <br>
     * <br>markup = g_markup_printf_escaped (format, str);
     * <br>gtk_label_set_markup (GTK_LABEL (self), markup);
     * <br>g_free (markup);
     * <br>```
     * <br>
     * <br>This function will set the [property&#64;Gtk.Label:use-markup] property
     * <br>to %TRUE as a side effect.
     * <br>
     * <br>If you set the label contents using the [property&#64;Gtk.Label:label]
     * <br>property you should also ensure that you set the
     * <br>[property&#64;Gtk.Label:use-markup] property accordingly.
     * <br>
     * <br>See also: [method&#64;Gtk.Label.set_text]
     * @param str a markup string
    */
    public void setMarkup(@Nonnull ch.bailu.gtk.type.Str str)  {
        JnaLabel.INST().gtk_label_set_markup(asCPointer(), asCPointerNotNull(str));
    }

    /**
     * Sets the labels text and attributes from markup.
     * <br>
     * <br>The string must be marked up with Pango markup
     * <br>(see [func&#64;Pango.parse_markup]).
     * <br>
     * <br>If the &#64;str is external data, you may need to escape it
     * <br>with g_markup_escape_text() or g_markup_printf_escaped():
     * <br>
     * <br>```c
     * <br>GtkWidget *self = gtk_label_new (NULL);
     * <br>const char *str = &quot;...&quot;;
     * <br>const char *format = &quot;&lt;span style=&#92;&quot;italic&#92;&quot;&gt;&#92;%s&lt;/span&gt;&quot;;
     * <br>char *markup;
     * <br>
     * <br>markup = g_markup_printf_escaped (format, str);
     * <br>gtk_label_set_markup (GTK_LABEL (self), markup);
     * <br>g_free (markup);
     * <br>```
     * <br>
     * <br>This function will set the [property&#64;Gtk.Label:use-markup] property
     * <br>to %TRUE as a side effect.
     * <br>
     * <br>If you set the label contents using the [property&#64;Gtk.Label:label]
     * <br>property you should also ensure that you set the
     * <br>[property&#64;Gtk.Label:use-markup] property accordingly.
     * <br>
     * <br>See also: [method&#64;Gtk.Label.set_text]
     * @param str a markup string
    */
    public void setMarkup(String str)  {
        JnaLabel.INST().gtk_label_set_markup(asCPointer(), str);
    }

    /**
     * Sets the labels text, attributes and mnemonic from markup.
     * <br>
     * <br>Parses &#64;str which is marked up with Pango markup (see [func&#64;Pango.parse_markup]),
     * <br>setting the label’s text and attribute list based on the parse results.
     * <br>If characters in &#64;str are preceded by an underscore, they are underlined
     * <br>indicating that they represent a keyboard accelerator called a mnemonic.
     * <br>
     * <br>The mnemonic key can be used to activate another widget, chosen
     * <br>automatically, or explicitly using [method&#64;Gtk.Label.set_mnemonic_widget].
     * @param str a markup string
    */
    public void setMarkupWithMnemonic(@Nonnull ch.bailu.gtk.type.Str str)  {
        JnaLabel.INST().gtk_label_set_markup_with_mnemonic(asCPointer(), asCPointerNotNull(str));
    }

    /**
     * Sets the labels text, attributes and mnemonic from markup.
     * <br>
     * <br>Parses &#64;str which is marked up with Pango markup (see [func&#64;Pango.parse_markup]),
     * <br>setting the label’s text and attribute list based on the parse results.
     * <br>If characters in &#64;str are preceded by an underscore, they are underlined
     * <br>indicating that they represent a keyboard accelerator called a mnemonic.
     * <br>
     * <br>The mnemonic key can be used to activate another widget, chosen
     * <br>automatically, or explicitly using [method&#64;Gtk.Label.set_mnemonic_widget].
     * @param str a markup string
    */
    public void setMarkupWithMnemonic(String str)  {
        JnaLabel.INST().gtk_label_set_markup_with_mnemonic(asCPointer(), str);
    }

    /**
     * Sets the desired maximum width in characters of &#64;label to &#64;n_chars.
     * @param n_chars the new desired maximum width, in characters.
    */
    public void setMaxWidthChars(int n_chars)  {
        JnaLabel.INST().gtk_label_set_max_width_chars(asCPointer(), n_chars);
    }

    /**
     * Associate the label with its mnemonic target.
     * <br>
     * <br>If the label has been set so that it has a mnemonic key (using
     * <br>i.e. [method&#64;Gtk.Label.set_markup_with_mnemonic],
     * <br>[method&#64;Gtk.Label.set_text_with_mnemonic],
     * <br>[ctor&#64;Gtk.Label.new_with_mnemonic]
     * <br>or the [property&#64;Gtk.Label:use_underline] property) the label can be
     * <br>associated with a widget that is the target of the mnemonic. When the
     * <br>label is inside a widget (like a [class&#64;Gtk.Button] or a
     * <br>[class&#64;Gtk.Notebook] tab) it is automatically associated with the correct
     * <br>widget, but sometimes (i.e. when the target is a [class&#64;Gtk.Entry] next to
     * <br>the label) you need to set it explicitly using this function.
     * <br>
     * <br>The target widget will be accelerated by emitting the
     * <br>[signal&#64;GtkWidget::mnemonic-activate] signal on it. The default handler for
     * <br>this signal will activate the widget if there are no mnemonic collisions
     * <br>and toggle focus between the colliding widgets otherwise.
     * @param widget the target `GtkWidget`, or %NULL to unset
    */
    public void setMnemonicWidget(@Nullable Widget widget)  {
        JnaLabel.INST().gtk_label_set_mnemonic_widget(asCPointer(), asCPointer(widget));
    }

    /**
     * Select the line wrapping for the natural size request.
     * <br>
     * <br>This only affects the natural size requested, for the actual wrapping used,
     * <br>see the [property&#64;Gtk.Label:wrap-mode] property.
     * @param wrap_mode the line wrapping mode
    */
    public void setNaturalWrapMode(int wrap_mode)  {
        JnaLabel.INST().gtk_label_set_natural_wrap_mode(asCPointer(), wrap_mode);
    }

    /**
     * Makes text in the label selectable.
     * <br>
     * <br>Selectable labels allow the user to select text from the label,
     * <br>for copy-and-paste.
     * @param setting %TRUE to allow selecting text in the label
    */
    public void setSelectable(boolean setting)  {
        JnaLabel.INST().gtk_label_set_selectable(asCPointer(), setting);
    }

    /**
     * Sets whether the label is in single line mode.
     * @param single_line_mode %TRUE if the label should be in single line mode
    */
    public void setSingleLineMode(boolean single_line_mode)  {
        JnaLabel.INST().gtk_label_set_single_line_mode(asCPointer(), single_line_mode);
    }

    /**
     * Sets the default tab stops for paragraphs in &#64;self.
     * @param tabs tabs as a `PangoTabArray`
    */
    public void setTabs(@Nullable ch.bailu.gtk.pango.TabArray tabs)  {
        JnaLabel.INST().gtk_label_set_tabs(asCPointer(), asCPointer(tabs));
    }

    /**
     * Sets the text within the `GtkLabel` widget.
     * <br>
     * <br>It overwrites any text that was there before.
     * <br>
     * <br>This function will clear any previously set mnemonic accelerators,
     * <br>and set the [property&#64;Gtk.Label:use-underline property] to %FALSE as
     * <br>a side effect.
     * <br>
     * <br>This function will set the [property&#64;Gtk.Label:use-markup] property
     * <br>to %FALSE as a side effect.
     * <br>
     * <br>See also: [method&#64;Gtk.Label.set_markup]
     * @param str The text you want to set
    */
    public void setText(@Nonnull ch.bailu.gtk.type.Str str)  {
        JnaLabel.INST().gtk_label_set_text(asCPointer(), asCPointerNotNull(str));
    }

    /**
     * Sets the text within the `GtkLabel` widget.
     * <br>
     * <br>It overwrites any text that was there before.
     * <br>
     * <br>This function will clear any previously set mnemonic accelerators,
     * <br>and set the [property&#64;Gtk.Label:use-underline property] to %FALSE as
     * <br>a side effect.
     * <br>
     * <br>This function will set the [property&#64;Gtk.Label:use-markup] property
     * <br>to %FALSE as a side effect.
     * <br>
     * <br>See also: [method&#64;Gtk.Label.set_markup]
     * @param str The text you want to set
    */
    public void setText(String str)  {
        JnaLabel.INST().gtk_label_set_text(asCPointer(), str);
    }

    /**
     * Sets the label’s text from the string &#64;str.
     * <br>
     * <br>If characters in &#64;str are preceded by an underscore, they are underlined
     * <br>indicating that they represent a keyboard accelerator called a mnemonic.
     * <br>The mnemonic key can be used to activate another widget, chosen
     * <br>automatically, or explicitly using [method&#64;Gtk.Label.set_mnemonic_widget].
     * @param str a string
    */
    public void setTextWithMnemonic(@Nonnull ch.bailu.gtk.type.Str str)  {
        JnaLabel.INST().gtk_label_set_text_with_mnemonic(asCPointer(), asCPointerNotNull(str));
    }

    /**
     * Sets the label’s text from the string &#64;str.
     * <br>
     * <br>If characters in &#64;str are preceded by an underscore, they are underlined
     * <br>indicating that they represent a keyboard accelerator called a mnemonic.
     * <br>The mnemonic key can be used to activate another widget, chosen
     * <br>automatically, or explicitly using [method&#64;Gtk.Label.set_mnemonic_widget].
     * @param str a string
    */
    public void setTextWithMnemonic(String str)  {
        JnaLabel.INST().gtk_label_set_text_with_mnemonic(asCPointer(), str);
    }

    /**
     * Sets whether the text of the label contains markup.
     * <br>
     * <br>See [method&#64;Gtk.Label.set_markup].
     * @param setting %TRUE if the label’s text should be parsed for markup.
    */
    public void setUseMarkup(boolean setting)  {
        JnaLabel.INST().gtk_label_set_use_markup(asCPointer(), setting);
    }

    /**
     * Sets whether underlines in the text indicate mnemonics.
     * @param setting %TRUE if underlines in the text indicate mnemonics
    */
    public void setUseUnderline(boolean setting)  {
        JnaLabel.INST().gtk_label_set_use_underline(asCPointer(), setting);
    }

    /**
     * Sets the desired width in characters of &#64;label to &#64;n_chars.
     * @param n_chars the new desired width, in characters.
    */
    public void setWidthChars(int n_chars)  {
        JnaLabel.INST().gtk_label_set_width_chars(asCPointer(), n_chars);
    }

    /**
     * Toggles line wrapping within the `GtkLabel` widget.
     * <br>
     * <br>%TRUE makes it break lines if text exceeds the widget’s size.
     * <br>%FALSE lets the text get cut off by the edge of the widget if
     * <br>it exceeds the widget size.
     * <br>
     * <br>Note that setting line wrapping to %TRUE does not make the label
     * <br>wrap at its parent container’s width, because GTK widgets
     * <br>conceptually can’t make their requisition depend on the parent
     * <br>container’s size. For a label that wraps at a specific position,
     * <br>set the label’s width using [method&#64;Gtk.Widget.set_size_request].
     * @param wrap the setting
    */
    public void setWrap(boolean wrap)  {
        JnaLabel.INST().gtk_label_set_wrap(asCPointer(), wrap);
    }

    /**
     * Controls how line wrapping is done.
     * <br>
     * <br>This only affects the label if line wrapping is on. (See
     * <br>[method&#64;Gtk.Label.set_wrap]) The default is %PANGO_WRAP_WORD
     * <br>which means wrap on word boundaries.
     * <br>
     * <br>For sizing behavior, also consider the [property&#64;Gtk.Label:natural-wrap-mode]
     * <br>property.
     * @param wrap_mode the line wrapping mode
    */
    public void setWrapMode(int wrap_mode)  {
        JnaLabel.INST().gtk_label_set_wrap_mode(asCPointer(), wrap_mode);
    }

    /**
     * Sets the `xalign` of the label.
     * <br>
     * <br>See the [property&#64;Gtk.Label:xalign] property.
     * @param xalign the new xalign value, between 0 and 1
    */
    public void setXalign(float xalign)  {
        JnaLabel.INST().gtk_label_set_xalign(asCPointer(), xalign);
    }

    /**
     * Sets the `yalign` of the label.
     * <br>
     * <br>See the [property&#64;Gtk.Label:yalign] property.
     * @param yalign the new yalign value, between 0 and 1
    */
    public void setYalign(float yalign)  {
        JnaLabel.INST().gtk_label_set_yalign(asCPointer(), yalign);
    }

    public final static String SIGNAL_ON_ACTIVATE_CURRENT_LINK = "activate-current-link";
    
    /**
     * Connect to signal "activate-current-link".
     * <br>See {@link OnActivateCurrentLink#onActivateCurrentLink} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE_CURRENT_LINK} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivateCurrentLink(OnActivateCurrentLink signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE_CURRENT_LINK, toOnActivateCurrentLink(signal));
    }

    public final static String SIGNAL_ON_ACTIVATE_LINK = "activate-link";
    
    /**
     * Connect to signal "activate-link".
     * <br>See {@link OnActivateLink#onActivateLink} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE_LINK} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivateLink(OnActivateLink signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE_LINK, toOnActivateLink(signal));
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

    public static long getTypeID() { 
        return JnaLabel.INST().gtk_label_get_type(); 
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
