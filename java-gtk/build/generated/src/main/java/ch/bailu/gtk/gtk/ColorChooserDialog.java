/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A dialog for choosing a color.
 * <br>
 * <br>![An example GtkColorChooserDialog](colorchooser.png)
 * <br>
 * <br>`GtkColorChooserDialog` implements the [iface&#64;Gtk.ColorChooser] interface
 * <br>and does not provide much API of its own.
 * <br>
 * <br>To create a `GtkColorChooserDialog`, use [ctor&#64;Gtk.ColorChooserDialog.new].
 * <br>
 * <br>To change the initially selected color, use
 * <br>[method&#64;Gtk.ColorChooser.set_rgba]. To get the selected color use
 * <br>[method&#64;Gtk.ColorChooser.get_rgba].
 * <p><a href="https://docs.gtk.org/gtk4/class.ColorChooserDialog.html">https://docs.gtk.org/gtk4/class.ColorChooserDialog.html</a></p>
*/
public class ColorChooserDialog extends Dialog {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ColorChooserDialog.class.getCanonicalName());
    }

    public ColorChooserDialog(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkColorChooserDialog`.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
    */
    public ColorChooserDialog(@Nullable ch.bailu.gtk.type.Str title, @Nullable Window parent) {
        super(cast(JnaColorChooserDialog.INST().gtk_color_chooser_dialog_new(asCPointer(title), asCPointer(parent))));
    }

    /**
     * Creates a new `GtkColorChooserDialog`.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
    */
    public ColorChooserDialog(String title, @Nullable Window parent) {
        super(cast(JnaColorChooserDialog.INST().gtk_color_chooser_dialog_new(title, asCPointer(parent))));
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
     * Implements interface {@link ColorChooser}. Call this to get access to interface functions.
     * @return {@link ColorChooser}
    */
    public ColorChooser asColorChooser() {
        return new ColorChooser(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
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
        return JnaColorChooserDialog.INST().gtk_color_chooser_dialog_get_type(); 
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
