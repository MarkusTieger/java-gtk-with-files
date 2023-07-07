/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkFontChooser` is an interface that can be implemented by widgets
 * <br>for choosing fonts.
 * <br>
 * <br>In GTK, the main objects that implement this interface are
 * <br>[class&#64;Gtk.FontChooserWidget], [class&#64;Gtk.FontChooserDialog] and
 * <br>[class&#64;Gtk.FontButton].
 * <p><a href="https://docs.gtk.org/gtk4/iface.FontChooser.html">https://docs.gtk.org/gtk4/iface.FontChooser.html</a></p>
*/
public class FontChooser extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontChooser.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnFontFilterFunc {
        /**
         * The type of function that is used for deciding what fonts get
         * <br>shown in a `GtkFontChooser`.
         * <br>
         * <br>See [method&#64;Gtk.FontChooser.set_filter_func].
         * @param family a `PangoFontFamily`
         * @param face a `PangoFontFace` belonging to &#64;family
         * @param data user data passed to gtk_font_chooser_set_filter_func()
         * @return %TRUE if the font should be displayed
        */
        boolean onFontFilterFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.pango.FontFamily family, @Nonnull ch.bailu.gtk.pango.FontFace face, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaFontChooser.OnFontFilterFunc toOnFontFilterFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnFontFilterFunc in) {
        JnaFontChooser.OnFontFilterFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_family, _face, _data) -> in.onFontFilterFunc(__callback, new ch.bailu.gtk.pango.FontFamily(new PointerContainer(_family)), new ch.bailu.gtk.pango.FontFace(new PointerContainer(_face)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaFontChooser.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaFontChooser.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFontActivated {
        /**
         * Emitted when a font is activated.
         * <br>
         * <br>This usually happens when the user double clicks an item,
         * <br>or an item is selected and the user presses one of the keys
         * <br>Space, Shift+Space, Return or Enter.
         * @param fontname the font name
        */
        void onFontActivated(@Nonnull ch.bailu.gtk.type.Str fontname);
    }
    
    private static com.sun.jna.Callback toOnFontActivated(OnFontActivated in) {
        return (in == null) ? null: (JnaFontChooser.OnFontActivated) (__self, _fontname, __data) -> in.onFontActivated(new ch.bailu.gtk.type.Str(new PointerContainer(_fontname)));
    }

    public FontChooser(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the currently-selected font name.
     * <br>
     * <br>Note that this can be a different string than what you set with
     * <br>[method&#64;Gtk.FontChooser.set_font], as the font chooser widget may
     * <br>normalize font names and thus return a string with a different
     * <br>structure. For example, “Helvetica Italic Bold 12” could be
     * <br>normalized to “Helvetica Bold Italic 12”.
     * <br>
     * <br>Use [method&#64;Pango.FontDescription.equal] if you want to compare two
     * <br>font descriptions.
     * @return A string with the name   of the current font
    */
    public ch.bailu.gtk.type.Str getFont()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFontChooser.INST().gtk_font_chooser_get_font(asCPointer())));
    }

    /**
     * Gets the currently-selected font.
     * <br>
     * <br>Note that this can be a different string than what you set with
     * <br>[method&#64;Gtk.FontChooser.set_font], as the font chooser widget may
     * <br>normalize font names and thus return a string with a different
     * <br>structure. For example, “Helvetica Italic Bold 12” could be
     * <br>normalized to “Helvetica Bold Italic 12”.
     * <br>
     * <br>Use [method&#64;Pango.FontDescription.equal] if you want to compare two
     * <br>font descriptions.
     * @return A `PangoFontDescription` for the   current font
    */
    public ch.bailu.gtk.pango.FontDescription getFontDesc()  {
        return new ch.bailu.gtk.pango.FontDescription(new PointerContainer(JnaFontChooser.INST().gtk_font_chooser_get_font_desc(asCPointer())));
    }

    /**
     * Gets the `PangoFontFace` representing the selected font group
     * <br>details (i.e. family, slant, weight, width, etc).
     * <br>
     * <br>If the selected font is not installed, returns %NULL.
     * @return A `PangoFontFace` representing the   selected font group details
    */
    public ch.bailu.gtk.pango.FontFace getFontFace()  {
        return new ch.bailu.gtk.pango.FontFace(new PointerContainer(JnaFontChooser.INST().gtk_font_chooser_get_font_face(asCPointer())));
    }

    /**
     * Gets the `PangoFontFamily` representing the selected font family.
     * <br>
     * <br>Font families are a collection of font faces.
     * <br>
     * <br>If the selected font is not installed, returns %NULL.
     * @return A `PangoFontFamily` representing the   selected font family
    */
    public ch.bailu.gtk.pango.FontFamily getFontFamily()  {
        return new ch.bailu.gtk.pango.FontFamily(new PointerContainer(JnaFontChooser.INST().gtk_font_chooser_get_font_family(asCPointer())));
    }

    /**
     * Gets the currently-selected font features.
     * <br>
     * <br>The format of the returned string is compatible with the
     * <br>[CSS font-feature-settings property](https://www.w3.org/TR/css-fonts-4/&#35;font-rend-desc).
     * <br>It can be passed to [func&#64;Pango.AttrFontFeatures.new].
     * @return the currently selected font features
    */
    public ch.bailu.gtk.type.Str getFontFeatures()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFontChooser.INST().gtk_font_chooser_get_font_features(asCPointer())));
    }

    /**
     * Gets the custom font map of this font chooser widget,
     * <br>or %NULL if it does not have one.
     * @return a `PangoFontMap`
    */
    public ch.bailu.gtk.pango.FontMap getFontMap()  {
        return new ch.bailu.gtk.pango.FontMap(new PointerContainer(JnaFontChooser.INST().gtk_font_chooser_get_font_map(asCPointer())));
    }

    /**
     * The selected font size.
     * @return A n integer representing the selected font size,   or -1 if no font size is selected.
    */
    public int getFontSize()  {
        return JnaFontChooser.INST().gtk_font_chooser_get_font_size(asCPointer());
    }

    /**
     * Gets the language that is used for font features.
     * @return the currently selected language
    */
    public ch.bailu.gtk.type.Str getLanguage()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFontChooser.INST().gtk_font_chooser_get_language(asCPointer())));
    }

    /**
     * Returns the current level of granularity for selecting fonts.
     * @return the current granularity level
    */
    public int getLevel()  {
        return JnaFontChooser.INST().gtk_font_chooser_get_level(asCPointer());
    }

    /**
     * Gets the text displayed in the preview area.
     * @return the text displayed in the preview area
    */
    public ch.bailu.gtk.type.Str getPreviewText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFontChooser.INST().gtk_font_chooser_get_preview_text(asCPointer())));
    }

    /**
     * Returns whether the preview entry is shown or not.
     * @return %TRUE if the preview entry is shown or %FALSE if it is hidden.
    */
    public boolean getShowPreviewEntry()  {
        return JnaFontChooser.INST().gtk_font_chooser_get_show_preview_entry(asCPointer());
    }

    /**
     * Adds a filter function that decides which fonts to display
     * <br>in the font chooser.
     * @param filter a `GtkFontFilterFunc`
     * @param user_data data to pass to &#64;filter
     * @param destroy function to call to free &#64;data when it is no longer needed
    */
    public void setFilterFunc(OnFontFilterFunc filter, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy)  {
        JnaFontChooser.INST().gtk_font_chooser_set_filter_func(asCPointer(), toOnFontFilterFunc(this, "setFilterFunc", filter), asCPointer(user_data), toOnDestroyNotify(this, "setFilterFunc", destroy));
    }

    /**
     * Sets the currently-selected font.
     * @param fontname a font name like “Helvetica 12” or “Times Bold 18”
    */
    public void setFont(@Nonnull ch.bailu.gtk.type.Str fontname)  {
        JnaFontChooser.INST().gtk_font_chooser_set_font(asCPointer(), asCPointerNotNull(fontname));
    }

    /**
     * Sets the currently-selected font.
     * @param fontname a font name like “Helvetica 12” or “Times Bold 18”
    */
    public void setFont(String fontname)  {
        JnaFontChooser.INST().gtk_font_chooser_set_font(asCPointer(), fontname);
    }

    /**
     * Sets the currently-selected font from &#64;font_desc.
     * @param font_desc a `PangoFontDescription`
    */
    public void setFontDesc(@Nonnull ch.bailu.gtk.pango.FontDescription font_desc)  {
        JnaFontChooser.INST().gtk_font_chooser_set_font_desc(asCPointer(), asCPointerNotNull(font_desc));
    }

    /**
     * Sets a custom font map to use for this font chooser widget.
     * <br>
     * <br>A custom font map can be used to present application-specific
     * <br>fonts instead of or in addition to the normal system fonts.
     * <br>
     * <br>```c
     * <br>FcConfig *config;
     * <br>PangoFontMap *fontmap;
     * <br>
     * <br>config = FcInitLoadConfigAndFonts ();
     * <br>FcConfigAppFontAddFile (config, my_app_font_file);
     * <br>
     * <br>fontmap = pango_cairo_font_map_new_for_font_type (CAIRO_FONT_TYPE_FT);
     * <br>pango_fc_font_map_set_config (PANGO_FC_FONT_MAP (fontmap), config);
     * <br>
     * <br>gtk_font_chooser_set_font_map (font_chooser, fontmap);
     * <br>```
     * <br>
     * <br>Note that other GTK widgets will only be able to use the
     * <br>application-specific font if it is present in the font map they use:
     * <br>
     * <br>```c
     * <br>context = gtk_widget_get_pango_context (label);
     * <br>pango_context_set_font_map (context, fontmap);
     * <br>```
     * @param fontmap a `PangoFontMap`
    */
    public void setFontMap(@Nullable ch.bailu.gtk.pango.FontMap fontmap)  {
        JnaFontChooser.INST().gtk_font_chooser_set_font_map(asCPointer(), asCPointer(fontmap));
    }

    /**
     * Sets the language to use for font features.
     * @param language a language
    */
    public void setLanguage(@Nonnull ch.bailu.gtk.type.Str language)  {
        JnaFontChooser.INST().gtk_font_chooser_set_language(asCPointer(), asCPointerNotNull(language));
    }

    /**
     * Sets the language to use for font features.
     * @param language a language
    */
    public void setLanguage(String language)  {
        JnaFontChooser.INST().gtk_font_chooser_set_language(asCPointer(), language);
    }

    /**
     * Sets the desired level of granularity for selecting fonts.
     * @param level the desired level of granularity
    */
    public void setLevel(int level)  {
        JnaFontChooser.INST().gtk_font_chooser_set_level(asCPointer(), level);
    }

    /**
     * Sets the text displayed in the preview area.
     * <br>
     * <br>The &#64;text is used to show how the selected font looks.
     * @param text the text to display in the preview area
    */
    public void setPreviewText(@Nonnull ch.bailu.gtk.type.Str text)  {
        JnaFontChooser.INST().gtk_font_chooser_set_preview_text(asCPointer(), asCPointerNotNull(text));
    }

    /**
     * Sets the text displayed in the preview area.
     * <br>
     * <br>The &#64;text is used to show how the selected font looks.
     * @param text the text to display in the preview area
    */
    public void setPreviewText(String text)  {
        JnaFontChooser.INST().gtk_font_chooser_set_preview_text(asCPointer(), text);
    }

    /**
     * Shows or hides the editable preview entry.
     * @param show_preview_entry whether to show the editable preview entry or not
    */
    public void setShowPreviewEntry(boolean show_preview_entry)  {
        JnaFontChooser.INST().gtk_font_chooser_set_show_preview_entry(asCPointer(), show_preview_entry);
    }

    public final static String SIGNAL_ON_FONT_ACTIVATED = "font-activated";
    
    /**
     * Connect to signal "font-activated".
     * <br>See {@link OnFontActivated#onFontActivated} for signal description.
     * <br>Field {@link #SIGNAL_ON_FONT_ACTIVATED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onFontActivated(OnFontActivated signal) {
        return connectSignal(SIGNAL_ON_FONT_ACTIVATED, toOnFontActivated(signal));
    }

    public static long getTypeID() { 
        return JnaFontChooser.INST().gtk_font_chooser_get_type(); 
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
