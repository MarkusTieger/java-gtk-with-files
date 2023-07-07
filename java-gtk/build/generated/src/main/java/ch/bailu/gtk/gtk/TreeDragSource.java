/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Interface for Drag-and-Drop destinations in `GtkTreeView`.
 * <p><a href="https://docs.gtk.org/gtk4/iface.TreeDragSource.html">https://docs.gtk.org/gtk4/iface.TreeDragSource.html</a></p>
*/
public class TreeDragSource extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeDragSource.class.getCanonicalName());
    }

    public TreeDragSource(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Asks the `GtkTreeDragSource` to delete the row at &#64;path, because
     * <br>it was moved somewhere else via drag-and-drop. Returns %FALSE
     * <br>if the deletion fails because &#64;path no longer exists, or for
     * <br>some model-specific reason. Should robustly handle a &#64;path no
     * <br>longer found in the model!
     * @param path row that was being dragged
     * @return %TRUE if the row was successfully deleted
    */
    public boolean dragDataDelete(@Nonnull TreePath path)  {
        return JnaTreeDragSource.INST().gtk_tree_drag_source_drag_data_delete(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Asks the `GtkTreeDragSource` to return a `GdkContentProvider` representing
     * <br>the row at &#64;path. Should robustly handle a &#64;path no
     * <br>longer found in the model!
     * @param path row that was dragged
     * @return a `GdkContentProvider` for the    given &#64;path
    */
    public ch.bailu.gtk.gdk.ContentProvider dragDataGet(@Nonnull TreePath path)  {
        return new ch.bailu.gtk.gdk.ContentProvider(new PointerContainer(JnaTreeDragSource.INST().gtk_tree_drag_source_drag_data_get(asCPointer(), asCPointerNotNull(path))));
    }

    /**
     * Asks the `GtkTreeDragSource` whether a particular row can be used as
     * <br>the source of a DND operation. If the source doesn’t implement
     * <br>this interface, the row is assumed draggable.
     * @param path row on which user is initiating a drag
     * @return %TRUE if the row can be dragged
    */
    public boolean rowDraggable(@Nonnull TreePath path)  {
        return JnaTreeDragSource.INST().gtk_tree_drag_source_row_draggable(asCPointer(), asCPointerNotNull(path));
    }

    public static long getTypeID() { 
        return JnaTreeDragSource.INST().gtk_tree_drag_source_get_type(); 
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
