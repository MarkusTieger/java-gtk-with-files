/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Renders a pixbuf in a cell
 * <br>
 * <br>A `GtkCellRendererPixbuf` can be used to render an image in a cell. It allows
 * <br>to render either a given `GdkPixbuf` (set via the
 * <br>`GtkCellRendererPixbuf:pixbuf` property) or a named icon (set via the
 * <br>`GtkCellRendererPixbuf:icon-name` property).
 * <br>
 * <br>To support the tree view, `GtkCellRendererPixbuf` also supports rendering two
 * <br>alternative pixbufs, when the `GtkCellRenderer:is-expander` property is %TRUE.
 * <br>If the `GtkCellRenderer:is-expanded property` is %TRUE and the
 * <br>`GtkCellRendererPixbuf:pixbuf-expander-open` property is set to a pixbuf, it
 * <br>renders that pixbuf, if the `GtkCellRenderer:is-expanded` property is %FALSE
 * <br>and the `GtkCellRendererPixbuf:pixbuf-expander-closed` property is set to a
 * <br>pixbuf, it renders that one.
 * <p><a href="https://docs.gtk.org/gtk4/class.CellRendererPixbuf.html">https://docs.gtk.org/gtk4/class.CellRendererPixbuf.html</a></p>
*/
public class CellRendererPixbuf extends CellRenderer {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellRendererPixbuf.class.getCanonicalName());
    }

    public CellRendererPixbuf(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkCellRendererPixbuf`. Adjust rendering
     * <br>parameters using object properties. Object properties can be set
     * <br>globally (with g_object_set()). Also, with `GtkTreeViewColumn`, you
     * <br>can bind a property to a value in a `GtkTreeModel`. For example, you
     * <br>can bind the “pixbuf” property on the cell renderer to a pixbuf value
     * <br>in the model, thus rendering a different image in each row of the
     * <br>`GtkTreeView`.
    */
    public CellRendererPixbuf() {
        super(cast(JnaCellRendererPixbuf.INST().gtk_cell_renderer_pixbuf_new()));
    }

    public static long getTypeID() { 
        return JnaCellRendererPixbuf.INST().gtk_cell_renderer_pixbuf_get_type(); 
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
