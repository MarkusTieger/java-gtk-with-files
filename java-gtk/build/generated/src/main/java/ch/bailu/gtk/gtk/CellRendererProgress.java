/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Renders numbers as progress bars
 * <br>
 * <br>`GtkCellRendererProgress` renders a numeric value as a progress par in a cell.
 * <br>Additionally, it can display a text on top of the progress bar.
 * <p><a href="https://docs.gtk.org/gtk4/class.CellRendererProgress.html">https://docs.gtk.org/gtk4/class.CellRendererProgress.html</a></p>
*/
public class CellRendererProgress extends CellRenderer {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellRendererProgress.class.getCanonicalName());
    }

    public CellRendererProgress(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkCellRendererProgress`.
    */
    public CellRendererProgress() {
        super(cast(JnaCellRendererProgress.INST().gtk_cell_renderer_progress_new()));
    }

    /**
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaCellRendererProgress.INST().gtk_cell_renderer_progress_get_type(); 
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
