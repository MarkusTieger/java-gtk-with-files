/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Renders a spinning animation in a cell
 * <br>
 * <br>`GtkCellRendererSpinner` renders a spinning animation in a cell, very
 * <br>similar to `GtkSpinner`. It can often be used as an alternative
 * <br>to a `GtkCellRendererProgress` for displaying indefinite activity,
 * <br>instead of actual progress.
 * <br>
 * <br>To start the animation in a cell, set the `GtkCellRendererSpinner:active`
 * <br>property to %TRUE and increment the `GtkCellRendererSpinner:pulse` property
 * <br>at regular intervals. The usual way to set the cell renderer properties
 * <br>for each cell is to bind them to columns in your tree model using e.g.
 * <br>gtk_tree_view_column_add_attribute().
 * <p><a href="https://docs.gtk.org/gtk4/class.CellRendererSpinner.html">https://docs.gtk.org/gtk4/class.CellRendererSpinner.html</a></p>
*/
public class CellRendererSpinner extends CellRenderer {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellRendererSpinner.class.getCanonicalName());
    }

    public CellRendererSpinner(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a new cell renderer which will show a spinner to indicate
     * <br>activity.
    */
    public CellRendererSpinner() {
        super(cast(JnaCellRendererSpinner.INST().gtk_cell_renderer_spinner_new()));
    }

    public static long getTypeID() { 
        return JnaCellRendererSpinner.INST().gtk_cell_renderer_spinner_get_type(); 
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
