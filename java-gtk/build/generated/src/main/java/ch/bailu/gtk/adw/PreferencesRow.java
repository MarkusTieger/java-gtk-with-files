/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A [class&#64;Gtk.ListBoxRow] used to present preferences.
 * <br>
 * <br>The `AdwPreferencesRow` widget has a title that [class&#64;PreferencesWindow]
 * <br>will use to let the user look for a preference. It doesn't present the title
 * <br>in any way and lets you present the preference as you please.
 * <br>
 * <br>[class&#64;ActionRow] and its derivatives are convenient to use as preference
 * <br>rows as they take care of presenting the preference's title while letting you
 * <br>compose the inputs of the preference around it.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.PreferencesRow.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.PreferencesRow.html</a></p>
*/
public class PreferencesRow extends ch.bailu.gtk.gtk.ListBoxRow {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PreferencesRow.class.getCanonicalName());
    }

    public PreferencesRow(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwPreferencesRow`.
    */
    public PreferencesRow() {
        super(cast(JnaPreferencesRow.INST().adw_preferences_row_new()));
    }

    /**
     * Gets the title of the preference represented by &#64;self.
     * @return the title
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPreferencesRow.INST().adw_preferences_row_get_title(asCPointer())));
    }

    /**
     * Gets whether the user can copy the title from the label
     * @return whether the user can copy the title from the label
    */
    public boolean getTitleSelectable()  {
        return JnaPreferencesRow.INST().adw_preferences_row_get_title_selectable(asCPointer());
    }

    /**
     * Gets whether to use Pango markup for the title label.
     * @return whether to use markup
    */
    public boolean getUseMarkup()  {
        return JnaPreferencesRow.INST().adw_preferences_row_get_use_markup(asCPointer());
    }

    /**
     * Gets whether an embedded underline in the title indicates a mnemonic.
     * @return whether an embedded underline in the title indicates a mnemonic
    */
    public boolean getUseUnderline()  {
        return JnaPreferencesRow.INST().adw_preferences_row_get_use_underline(asCPointer());
    }

    /**
     * Sets the title of the preference represented by &#64;self.
     * <br>
     * <br>The title is interpreted as Pango markup unless
     * <br>[property&#64;PreferencesRow:use-markup] is set to `FALSE`.
     * @param title the title
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaPreferencesRow.INST().adw_preferences_row_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * Sets the title of the preference represented by &#64;self.
     * <br>
     * <br>The title is interpreted as Pango markup unless
     * <br>[property&#64;PreferencesRow:use-markup] is set to `FALSE`.
     * @param title the title
    */
    public void setTitle(String title)  {
        JnaPreferencesRow.INST().adw_preferences_row_set_title(asCPointer(), title);
    }

    /**
     * Sets whether the user can copy the title from the label
     * <br>
     * <br>See also [property&#64;Gtk.Label:selectable].
     * @param title_selectable `TRUE` if the user can copy the title from the label
    */
    public void setTitleSelectable(boolean title_selectable)  {
        JnaPreferencesRow.INST().adw_preferences_row_set_title_selectable(asCPointer(), title_selectable);
    }

    /**
     * Sets whether to use Pango markup for the title label.
     * <br>
     * <br>Subclasses may also use it for other labels, such as subtitle.
     * <br>
     * <br>See also [func&#64;Pango.parse_markup].
     * @param use_markup whether to use markup
    */
    public void setUseMarkup(boolean use_markup)  {
        JnaPreferencesRow.INST().adw_preferences_row_set_use_markup(asCPointer(), use_markup);
    }

    /**
     * Sets whether an embedded underline in the title indicates a mnemonic.
     * @param use_underline `TRUE` if underlines in the text indicate mnemonics
    */
    public void setUseUnderline(boolean use_underline)  {
        JnaPreferencesRow.INST().adw_preferences_row_set_use_underline(asCPointer(), use_underline);
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

    public static long getTypeID() { 
        return JnaPreferencesRow.INST().adw_preferences_row_get_type(); 
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
