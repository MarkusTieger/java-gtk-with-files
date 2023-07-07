/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkFontChooserWidget` widget lets the user select a font.
 * <br>
 * <br>It is used in the `GtkFontChooserDialog` widget to provide a
 * <br>dialog for selecting fonts.
 * <br>
 * <br>To set the font which is initially selected, use
 * <br>[method&#64;Gtk.FontChooser.set_font] or [method&#64;Gtk.FontChooser.set_font_desc].
 * <br>
 * <br>To get the selected font use [method&#64;Gtk.FontChooser.get_font] or
 * <br>[method&#64;Gtk.FontChooser.get_font_desc].
 * <br>
 * <br>To change the text which is shown in the preview area, use
 * <br>[method&#64;Gtk.FontChooser.set_preview_text].
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkFontChooserWidget` has a single CSS node with name fontchooser.
 * <p><a href="https://docs.gtk.org/gtk4/class.FontChooserWidget.html">https://docs.gtk.org/gtk4/class.FontChooserWidget.html</a></p>
*/
public class FontChooserWidget extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FontChooserWidget.class.getCanonicalName());
    }

    public FontChooserWidget(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkFontChooserWidget`.
    */
    public FontChooserWidget() {
        super(cast(JnaFontChooserWidget.INST().gtk_font_chooser_widget_new()));
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
        return JnaFontChooserWidget.INST().gtk_font_chooser_widget_get_type(); 
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
