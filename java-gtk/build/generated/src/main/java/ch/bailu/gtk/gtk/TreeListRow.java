/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkTreeListRow` is used by `GtkTreeListModel` to represent items.
 * <br>
 * <br>It allows navigating the model as a tree and modify the state of rows.
 * <br>
 * <br>`GtkTreeListRow` instances are created by a `GtkTreeListModel` only
 * <br>when the [property&#64;Gtk.TreeListModel:passthrough] property is not set.
 * <br>
 * <br>There are various support objects that can make use of `GtkTreeListRow`
 * <br>objects, such as the [class&#64;Gtk.TreeExpander] widget that allows displaying
 * <br>an icon to expand or collapse a row or [class&#64;Gtk.TreeListRowSorter] that
 * <br>makes it possible to sort trees properly.
 * <p><a href="https://docs.gtk.org/gtk4/class.TreeListRow.html">https://docs.gtk.org/gtk4/class.TreeListRow.html</a></p>
*/
public class TreeListRow extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeListRow.class.getCanonicalName());
    }

    public TreeListRow(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * If &#64;self is not expanded or &#64;position is greater than the
     * <br>number of children, %NULL is returned.
     * @param position position of the child to get
     * @return the child in &#64;position
    */
    public TreeListRow getChildRow(int position)  {
        return new TreeListRow(new PointerContainer(JnaTreeListRow.INST().gtk_tree_list_row_get_child_row(asCPointer(), position)));
    }

    /**
     * If the row is expanded, gets the model holding the children of &#64;self.
     * <br>
     * <br>This model is the model created by the
     * <br>[callback&#64;Gtk.TreeListModelCreateModelFunc]
     * <br>and contains the original items, no matter what value
     * <br>[property&#64;Gtk.TreeListModel:passthrough] is set to.
     * @return The model containing the children
    */
    public ch.bailu.gtk.gio.ListModel getChildren()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaTreeListRow.INST().gtk_tree_list_row_get_children(asCPointer())));
    }

    /**
     * Gets the depth of this row.
     * <br>
     * <br>Rows that correspond to items in the root model have a depth
     * <br>of zero, rows corresponding to items of models of direct children
     * <br>of the root model have a depth of 1 and so on.
     * <br>
     * <br>The depth of a row never changes until the row is destroyed.
     * @return The depth of this row
    */
    public int getDepth()  {
        return JnaTreeListRow.INST().gtk_tree_list_row_get_depth(asCPointer());
    }

    /**
     * Gets if a row is currently expanded.
     * @return %TRUE if the row is expanded
    */
    public boolean getExpanded()  {
        return JnaTreeListRow.INST().gtk_tree_list_row_get_expanded(asCPointer());
    }

    /**
     * Gets the item corresponding to this row,
     * <br>
     * <br>The value returned by this function never changes until the
     * <br>row is destroyed.
     * @return The item   of this row or %NULL when the row was destroyed
    */
    public ch.bailu.gtk.type.Pointer getItem()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTreeListRow.INST().gtk_tree_list_row_get_item(asCPointer())));
    }

    /**
     * Gets the row representing the parent for &#64;self.
     * <br>
     * <br>That is the row that would need to be collapsed
     * <br>to make this row disappear.
     * <br>
     * <br>If &#64;self is a row corresponding to the root model,
     * <br>%NULL is returned.
     * <br>
     * <br>The value returned by this function never changes
     * <br>until the row is destroyed.
     * @return The parent of &#64;self
    */
    public TreeListRow getParent()  {
        return new TreeListRow(new PointerContainer(JnaTreeListRow.INST().gtk_tree_list_row_get_parent(asCPointer())));
    }

    /**
     * Returns the position in the `GtkTreeListModel` that &#64;self occupies
     * <br>at the moment.
     * @return The position in the model
    */
    public int getPosition()  {
        return JnaTreeListRow.INST().gtk_tree_list_row_get_position(asCPointer());
    }

    /**
     * Checks if a row can be expanded.
     * <br>
     * <br>This does not mean that the row is actually expanded,
     * <br>this can be checked with [method&#64;Gtk.TreeListRow.get_expanded].
     * <br>
     * <br>If a row is expandable never changes until the row is destroyed.
     * @return %TRUE if the row is expandable
    */
    public boolean isExpandable()  {
        return JnaTreeListRow.INST().gtk_tree_list_row_is_expandable(asCPointer());
    }

    /**
     * Expands or collapses a row.
     * <br>
     * <br>If a row is expanded, the model of calling the
     * <br>[callback&#64;Gtk.TreeListModelCreateModelFunc] for the row's
     * <br>item will be inserted after this row. If a row is collapsed,
     * <br>those items will be removed from the model.
     * <br>
     * <br>If the row is not expandable, this function does nothing.
     * @param expanded %TRUE if the row should be expanded
    */
    public void setExpanded(boolean expanded)  {
        JnaTreeListRow.INST().gtk_tree_list_row_set_expanded(asCPointer(), expanded);
    }

    public static long getTypeID() { 
        return JnaTreeListRow.INST().gtk_tree_list_row_get_type(); 
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
