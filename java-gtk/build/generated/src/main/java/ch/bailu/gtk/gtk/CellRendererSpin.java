/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Renders a spin button in a cell
 * <br>
 * <br>`GtkCellRendererSpin` renders text in a cell like `GtkCellRendererText` from
 * <br>which it is derived. But while `GtkCellRendererText` offers a simple entry to
 * <br>edit the text, `GtkCellRendererSpin` offers a `GtkSpinButton` widget. Of course,
 * <br>that means that the text has to be parseable as a floating point number.
 * <br>
 * <br>The range of the spinbutton is taken from the adjustment property of the
 * <br>cell renderer, which can be set explicitly or mapped to a column in the
 * <br>tree model, like all properties of cell renders. `GtkCellRendererSpin`
 * <br>also has properties for the `GtkCellRendererSpin:climb-rate` and the number
 * <br>of `GtkCellRendererSpin:digits` to display. Other `GtkSpinButton` properties
 * <br>can be set in a handler for the `GtkCellRenderer::editing-started` signal.
 * <br>
 * <br>The `GtkCellRendererSpin` cell renderer was added in GTK 2.10.
 * <p><a href="https://docs.gtk.org/gtk4/class.CellRendererSpin.html">https://docs.gtk.org/gtk4/class.CellRendererSpin.html</a></p>
*/
public class CellRendererSpin extends CellRendererText {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellRendererSpin.class.getCanonicalName());
    }

    public CellRendererSpin(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkCellRendererSpin`.
    */
    public CellRendererSpin() {
        super(cast(JnaCellRendererSpin.INST().gtk_cell_renderer_spin_new()));
    }

    public static long getTypeID() { 
        return JnaCellRendererSpin.INST().gtk_cell_renderer_spin_get_type(); 
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
