/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkColorChooserWidget` widget lets the user select a color.
 * <br>
 * <br>By default, the chooser presents a predefined palette of colors,
 * <br>plus a small number of settable custom colors. It is also possible
 * <br>to select a different color with the single-color editor.
 * <br>
 * <br>To enter the single-color editing mode, use the context menu of any
 * <br>color of the palette, or use the '+' button to add a new custom color.
 * <br>
 * <br>The chooser automatically remembers the last selection, as well
 * <br>as custom colors.
 * <br>
 * <br>To create a `GtkColorChooserWidget`, use [ctor&#64;Gtk.ColorChooserWidget.new].
 * <br>
 * <br>To change the initially selected color, use
 * <br>[method&#64;Gtk.ColorChooser.set_rgba]. To get the selected color use
 * <br>[method&#64;Gtk.ColorChooser.get_rgba].
 * <br>
 * <br>The `GtkColorChooserWidget` is used in the [class&#64;Gtk.ColorChooserDialog]
 * <br>to provide a dialog for selecting colors.
 * <br>
 * <br>&#35; CSS names
 * <br>
 * <br>`GtkColorChooserWidget` has a single CSS node with name colorchooser.
 * <p><a href="https://docs.gtk.org/gtk4/class.ColorChooserWidget.html">https://docs.gtk.org/gtk4/class.ColorChooserWidget.html</a></p>
*/
public class ColorChooserWidget extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ColorChooserWidget.class.getCanonicalName());
    }

    public ColorChooserWidget(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkColorChooserWidget`.
    */
    public ColorChooserWidget() {
        super(cast(JnaColorChooserWidget.INST().gtk_color_chooser_widget_new()));
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

    public static long getTypeID() { 
        return JnaColorChooserWidget.INST().gtk_color_chooser_widget_get_type(); 
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
