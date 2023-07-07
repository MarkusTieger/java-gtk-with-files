/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A GtkTreeRowReference tracks model changes so that it always refers to the
 * <br>same row (a `GtkTreePath` refers to a position, not a fixed row). Create a
 * <br>new GtkTreeRowReference with gtk_tree_row_reference_new().
 * <p><a href="https://docs.gtk.org/gtk4/struct.TreeRowReference.html">https://docs.gtk.org/gtk4/struct.TreeRowReference.html</a></p>
*/
public class TreeRowReference extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeRowReference.class.getCanonicalName());
    }

    public TreeRowReference(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * You do not need to use this function.
     * <br>
     * <br>Creates a row reference based on &#64;path.
     * <br>
     * <br>This reference will keep pointing to the node pointed to
     * <br>by &#64;path, so long as it exists. If &#64;path isn’t a valid
     * <br>path in &#64;model, then %NULL is returned. However, unlike
     * <br>references created with gtk_tree_row_reference_new(), it
     * <br>does not listen to the model for changes. The creator of
     * <br>the row reference must do this explicitly using
     * <br>gtk_tree_row_reference_inserted(), gtk_tree_row_reference_deleted(),
     * <br>gtk_tree_row_reference_reordered().
     * <br>
     * <br>These functions must be called exactly once per proxy when the
     * <br>corresponding signal on the model is emitted. This single call
     * <br>updates all row references for that proxy. Since built-in GTK
     * <br>objects like `GtkTreeView` already use this mechanism internally,
     * <br>using them as the proxy object will produce unpredictable results.
     * <br>Further more, passing the same object as &#64;model and &#64;proxy
     * <br>doesn’t work for reasons of internal implementation.
     * <br>
     * <br>This type of row reference is primarily meant by structures that
     * <br>need to carefully monitor exactly when a row reference updates
     * <br>itself, and is not generally needed by most applications.
     * @param proxy a proxy `GObject`
     * @param model a `GtkTreeModel`
     * @param path a valid `GtkTreePath` to monitor
     * @return a newly allocated `GtkTreeRowReference`
    */
    public static TreeRowReference newProxyTreeRowReference(@Nonnull ch.bailu.gtk.gobject.Object proxy, @Nonnull TreeModel model, @Nonnull TreePath path)  {
        PointerContainer __self = cast(JnaTreeRowReference.INST().gtk_tree_row_reference_new_proxy(asCPointerNotNull(proxy), asCPointerNotNull(model), asCPointerNotNull(path)));
        if (__self.isNull()) {
            throw new NullPointerException("TreeRowReference:newProxy");
        }
        return new TreeRowReference(__self);
    }        
    

    /**
     * Creates a row reference based on &#64;path.
     * <br>
     * <br>This reference will keep pointing to the node pointed to
     * <br>by &#64;path, so long as it exists. Any changes that occur on &#64;model are
     * <br>propagated, and the path is updated appropriately. If
     * <br>&#64;path isn’t a valid path in &#64;model, then %NULL is returned.
     * @param model a `GtkTreeModel`
     * @param path a valid `GtkTreePath` to monitor
    */
    public TreeRowReference(@Nonnull TreeModel model, @Nonnull TreePath path) {
        super(cast(JnaTreeRowReference.INST().gtk_tree_row_reference_new(asCPointerNotNull(model), asCPointerNotNull(path))));
    }

    /**
     * Copies a `GtkTreeRowReference`.
     * @return a copy of &#64;reference
    */
    public TreeRowReference copy()  {
        return new TreeRowReference(new PointerContainer(JnaTreeRowReference.INST().gtk_tree_row_reference_copy(asCPointer())));
    }

    /**
     * Free’s &#64;reference. &#64;reference may be %NULL
    */
    public void free()  {
        JnaTreeRowReference.INST().gtk_tree_row_reference_free(asCPointer());
    }

    /**
     * Returns the model that the row reference is monitoring.
     * @return the model
    */
    public TreeModel getModel()  {
        return new TreeModel(new PointerContainer(JnaTreeRowReference.INST().gtk_tree_row_reference_get_model(asCPointer())));
    }

    /**
     * Returns a path that the row reference currently points to,
     * <br>or %NULL if the path pointed to is no longer valid.
     * @return a current path
    */
    public TreePath getPath()  {
        return new TreePath(new PointerContainer(JnaTreeRowReference.INST().gtk_tree_row_reference_get_path(asCPointer())));
    }

    /**
     * Returns %TRUE if the &#64;reference is non-%NULL and refers to
     * <br>a current valid path.
     * @return %TRUE if &#64;reference points to a valid path
    */
    public boolean valid()  {
        return JnaTreeRowReference.INST().gtk_tree_row_reference_valid(asCPointer());
    }

    /**
     * Lets a set of row reference created by
     * <br>gtk_tree_row_reference_new_proxy() know that the
     * <br>model emitted the ::row-deleted signal.
     * @param proxy a `GObject`
     * @param path the path position that was deleted
    */
    public static void deleted(@Nonnull ch.bailu.gtk.gobject.Object proxy, @Nonnull TreePath path)  {
        JnaTreeRowReference.INST().gtk_tree_row_reference_deleted(asCPointerNotNull(proxy), asCPointerNotNull(path));
    }

    /**
     * Lets a set of row reference created by
     * <br>gtk_tree_row_reference_new_proxy() know that the
     * <br>model emitted the ::row-inserted signal.
     * @param proxy a `GObject`
     * @param path the row position that was inserted
    */
    public static void inserted(@Nonnull ch.bailu.gtk.gobject.Object proxy, @Nonnull TreePath path)  {
        JnaTreeRowReference.INST().gtk_tree_row_reference_inserted(asCPointerNotNull(proxy), asCPointerNotNull(path));
    }

    /**
     * Lets a set of row reference created by
     * <br>gtk_tree_row_reference_new_proxy() know that the
     * <br>model emitted the ::rows-reordered signal.
     * @param proxy a `GObject`
     * @param path the parent path of the reordered signal
     * @param iter the iter pointing to the parent of the reordered
     * @param new_order the new order of rows
    */
    public static void reordered(@Nonnull ch.bailu.gtk.gobject.Object proxy, @Nonnull TreePath path, @Nonnull TreeIter iter, @Nonnull ch.bailu.gtk.type.Int new_order)  {
        JnaTreeRowReference.INST().gtk_tree_row_reference_reordered(asCPointerNotNull(proxy), asCPointerNotNull(path), asCPointerNotNull(iter), asCPointerNotNull(new_order));
    }

    public static long getTypeID() { 
        return JnaTreeRowReference.INST().gtk_tree_row_reference_get_type(); 
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
record-type
all-fields-supported
*/
