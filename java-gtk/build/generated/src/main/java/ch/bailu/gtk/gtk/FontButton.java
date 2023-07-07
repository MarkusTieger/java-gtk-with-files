/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkFontButton` allows to open a font chooser dialog to change
 * <br>the font.
 * <br>
 * <br>![An example GtkFontButton](font-button.png)
 * <br>
 * <br>It is suitable widget for selecting a font in a preference dialog.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>fontbutton
 * <br>╰── button.font
 * <br>    ╰── [content]
 * <br>```
 * <br>
 * <br>`GtkFontButton` has a single CSS node with name fontbutton which
 * <br>contains a button node with the .font style class.
 * <p><a href="https://docs.gtk.org/gtk4/class.FontButton.html">https://docs.gtk.org/gtk4/class.FontButton.html</a></p>
*/
public class FontButton extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontButton.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnActivate {
        /**
         * Emitted to when the font button is activated.
         * <br>
         * <br>The `::activate` signal on `GtkFontButton` is an action signal and
         * <br>emitting it causes the button to present its dialog.
        */
        void onActivate();
    }
    
    private static com.sun.jna.Callback toOnActivate(OnActivate in) {
        return (in == null) ? null: (JnaFontButton.OnActivate) (__self, __data) -> in.onActivate();
    }

    @FunctionalInterface
    public interface OnFontSet {
        /**
         * Emitted when the user selects a font.
         * <br>
         * <br>When handling this signal, use [method&#64;Gtk.FontChooser.get_font]
         * <br>to find out which font was just selected.
         * <br>
         * <br>Note that this signal is only emitted when the user changes the font.
         * <br>If you need to react to programmatic font changes as well, use
         * <br>the notify::font signal.
        */
        void onFontSet();
    }
    
    private static com.sun.jna.Callback toOnFontSet(OnFontSet in) {
        return (in == null) ? null: (JnaFontButton.OnFontSet) (__self, __data) -> in.onFontSet();
    }

    public FontButton(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new font picker widget showing the given font.
     * @param fontname Name of font to display in font chooser dialog
     * @return a new font picker widget.
    */
    public static FontButton newWithFontFontButton(@Nonnull ch.bailu.gtk.type.Str fontname)  {
        PointerContainer __self = cast(JnaFontButton.INST().gtk_font_button_new_with_font(asCPointerNotNull(fontname)));
        if (__self.isNull()) {
            throw new NullPointerException("FontButton:newWithFont");
        }
        return new FontButton(__self);
    }        
    

    /**
     * Creates a new font picker widget showing the given font.
     * @param fontname Name of font to display in font chooser dialog
     * @return a new font picker widget.
    */
    public static FontButton newWithFontFontButton(String fontname)  {
        PointerContainer __self = cast(JnaFontButton.INST().gtk_font_button_new_with_font(fontname));
        if (__self.isNull()) {
            throw new NullPointerException("FontButton:newWithFont");
        }
        return new FontButton(__self);
    }        
    

    /**
     * Creates a new font picker widget.
    */
    public FontButton() {
        super(cast(JnaFontButton.INST().gtk_font_button_new()));
    }

    /**
     * Gets whether the dialog is modal.
     * @return %TRUE if the dialog is modal
    */
    public boolean getModal()  {
        return JnaFontButton.INST().gtk_font_button_get_modal(asCPointer());
    }

    /**
     * Retrieves the title of the font chooser dialog.
     * @return an internal copy of the title string   which must not be freed.
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaFontButton.INST().gtk_font_button_get_title(asCPointer())));
    }

    /**
     * Returns whether the selected font is used in the label.
     * @return whether the selected font is used in the label.
    */
    public boolean getUseFont()  {
        return JnaFontButton.INST().gtk_font_button_get_use_font(asCPointer());
    }

    /**
     * Returns whether the selected size is used in the label.
     * @return whether the selected size is used in the label.
    */
    public boolean getUseSize()  {
        return JnaFontButton.INST().gtk_font_button_get_use_size(asCPointer());
    }

    /**
     * Sets whether the dialog should be modal.
     * @param modal %TRUE to make the dialog modal
    */
    public void setModal(boolean modal)  {
        JnaFontButton.INST().gtk_font_button_set_modal(asCPointer(), modal);
    }

    /**
     * Sets the title for the font chooser dialog.
     * @param title a string containing the font chooser dialog title
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaFontButton.INST().gtk_font_button_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * Sets the title for the font chooser dialog.
     * @param title a string containing the font chooser dialog title
    */
    public void setTitle(String title)  {
        JnaFontButton.INST().gtk_font_button_set_title(asCPointer(), title);
    }

    /**
     * If &#64;use_font is %TRUE, the font name will be written
     * <br>using the selected font.
     * @param use_font If %TRUE, font name will be written using font chosen.
    */
    public void setUseFont(boolean use_font)  {
        JnaFontButton.INST().gtk_font_button_set_use_font(asCPointer(), use_font);
    }

    /**
     * If &#64;use_size is %TRUE, the font name will be written using
     * <br>the selected size.
     * @param use_size If %TRUE, font name will be written using the   selected size.
    */
    public void setUseSize(boolean use_size)  {
        JnaFontButton.INST().gtk_font_button_set_use_size(asCPointer(), use_size);
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

    public final static String SIGNAL_ON_FONT_SET = "font-set";
    
    /**
     * Connect to signal "font-set".
     * <br>See {@link OnFontSet#onFontSet} for signal description.
     * <br>Field {@link #SIGNAL_ON_FONT_SET} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onFontSet(OnFontSet signal) {
        return connectSignal(SIGNAL_ON_FONT_SET, toOnFontSet(signal));
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
     * Implements interface {@link FontChooser}. Call this to get access to interface functions.
     * @return {@link FontChooser}
    */
    public FontChooser asFontChooser() {
        return new FontChooser(cast());
    }

    public static long getTypeID() { 
        return JnaFontButton.INST().gtk_font_button_get_type(); 
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
