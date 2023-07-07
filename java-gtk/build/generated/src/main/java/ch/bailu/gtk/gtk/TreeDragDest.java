/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Interface for Drag-and-Drop destinations in `GtkTreeView`.
 * <p><a href="https://docs.gtk.org/gtk4/iface.TreeDragDest.html">https://docs.gtk.org/gtk4/iface.TreeDragDest.html</a></p>
*/
public class TreeDragDest extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeDragDest.class.getCanonicalName());
    }

    public TreeDragDest(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Asks the `GtkTreeDragDest` to insert a row before the path &#64;dest,
     * <br>deriving the contents of the row from &#64;value. If &#64;dest is
     * <br>outside the tree so that inserting before it is impossible, %FALSE
     * <br>will be returned. Also, %FALSE may be returned if the new row is
     * <br>not created for some model-specific reason.  Should robustly handle
     * <br>a &#64;dest no longer found in the model!
     * @param dest row to drop in front of
     * @param value data to drop
     * @return whether a new row was created before position &#64;dest
    */
    public boolean dragDataReceived(@Nonnull TreePath dest, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        return JnaTreeDragDest.INST().gtk_tree_drag_dest_drag_data_received(asCPointer(), asCPointerNotNull(dest), asCPointerNotNull(value));
    }

    /**
     * Determines whether a drop is possible before the given &#64;dest_path,
     * <br>at the same depth as &#64;dest_path. i.e., can we drop the data in
     * <br>&#64;value at that location. &#64;dest_path does not have to
     * <br>exist; the return value will almost certainly be %FALSE if the
     * <br>parent of &#64;dest_path doesn’t exist, though.
     * @param dest_path destination row
     * @param value the data being dropped
     * @return %TRUE if a drop is possible before &#64;dest_path
    */
    public boolean rowDropPossible(@Nonnull TreePath dest_path, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        return JnaTreeDragDest.INST().gtk_tree_drag_dest_row_drop_possible(asCPointer(), asCPointerNotNull(dest_path), asCPointerNotNull(value));
    }

    public static long getTypeID() { 
        return JnaTreeDragDest.INST().gtk_tree_drag_dest_get_type(); 
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
interface-type
*/
