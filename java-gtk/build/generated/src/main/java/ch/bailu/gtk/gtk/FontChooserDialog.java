/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkFontChooserDialog` widget is a dialog for selecting a font.
 * <br>
 * <br>![An example GtkFontChooserDialog](fontchooser.png)
 * <br>
 * <br>`GtkFontChooserDialog` implements the [iface&#64;Gtk.FontChooser] interface
 * <br>and does not provide much API of its own.
 * <br>
 * <br>To create a `GtkFontChooserDialog`, use [ctor&#64;Gtk.FontChooserDialog.new].
 * <br>
 * <br>&#35; GtkFontChooserDialog as GtkBuildable
 * <br>
 * <br>The `GtkFontChooserDialog` implementation of the `GtkBuildable`
 * <br>interface exposes the buttons with the names “select_button”
 * <br>and “cancel_button”.
 * <p><a href="https://docs.gtk.org/gtk4/class.FontChooserDialog.html">https://docs.gtk.org/gtk4/class.FontChooserDialog.html</a></p>
*/
public class FontChooserDialog extends Dialog {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontChooserDialog.class.getCanonicalName());
    }

    public FontChooserDialog(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkFontChooserDialog`.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
    */
    public FontChooserDialog(@Nullable ch.bailu.gtk.type.Str title, @Nullable Window parent) {
        super(cast(JnaFontChooserDialog.INST().gtk_font_chooser_dialog_new(asCPointer(title), asCPointer(parent))));
    }

    /**
     * Creates a new `GtkFontChooserDialog`.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
    */
    public FontChooserDialog(String title, @Nullable Window parent) {
        super(cast(JnaFontChooserDialog.INST().gtk_font_chooser_dialog_new(title, asCPointer(parent))));
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

    /**
     * Implements interface {@link Native}. Call this to get access to interface functions.
     * @return {@link Native}
    */
    public Native asNative() {
        return new Native(cast());
    }

    /**
     * Implements interface {@link Root}. Call this to get access to interface functions.
     * @return {@link Root}
    */
    public Root asRoot() {
        return new Root(cast());
    }

    /**
     * Implements interface {@link ShortcutManager}. Call this to get access to interface functions.
     * @return {@link ShortcutManager}
    */
    public ShortcutManager asShortcutManager() {
        return new ShortcutManager(cast());
    }

    public static long getTypeID() { 
        return JnaFontChooserDialog.INST().gtk_font_chooser_dialog_get_type(); 
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
