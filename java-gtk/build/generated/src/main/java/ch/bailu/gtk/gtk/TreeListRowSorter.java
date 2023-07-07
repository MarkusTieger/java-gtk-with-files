/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkTreeListRowSorter` is a special-purpose sorter that will apply a given
 * <br>sorter to the levels in a tree.
 * <br>
 * <br>Here is an example for setting up a column view with a tree model and
 * <br>a `GtkTreeListSorter`:
 * <br>
 * <br>```c
 * <br>column_sorter = gtk_column_view_get_sorter (view);
 * <br>sorter = gtk_tree_list_row_sorter_new (g_object_ref (column_sorter));
 * <br>sort_model = gtk_sort_list_model_new (tree_model, sorter);
 * <br>selection = gtk_single_selection_new (sort_model);
 * <br>gtk_column_view_set_model (view, G_LIST_MODEL (selection));
 * <br>```
 * <p><a href="https://docs.gtk.org/gtk4/class.TreeListRowSorter.html">https://docs.gtk.org/gtk4/class.TreeListRowSorter.html</a></p>
*/
public class TreeListRowSorter extends Sorter {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeListRowSorter.class.getCanonicalName());
    }

    public TreeListRowSorter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a special-purpose sorter that applies the sorting
     * <br>of &#64;sorter to the levels of a `GtkTreeListModel`.
     * <br>
     * <br>Note that this sorter relies on [property&#64;Gtk.TreeListModel:passthrough]
     * <br>being %FALSE as it can only sort [class&#64;Gtk.TreeListRow]s.
     * @param sorter a `GtkSorter`
    */
    public TreeListRowSorter(@Nullable Sorter sorter) {
        super(cast(JnaTreeListRowSorter.INST().gtk_tree_list_row_sorter_new(asCPointer(sorter))));
    }

    /**
     * Returns the sorter used by &#64;self.
     * @return the sorter used
    */
    public Sorter getSorter()  {
        return new Sorter(new PointerContainer(JnaTreeListRowSorter.INST().gtk_tree_list_row_sorter_get_sorter(asCPointer())));
    }

    /**
     * Sets the sorter to use for items with the same parent.
     * <br>
     * <br>This sorter will be passed the [property&#64;Gtk.TreeListRow:item] of
     * <br>the tree list rows passed to &#64;self.
     * @param sorter The sorter to use
    */
    public void setSorter(@Nullable Sorter sorter)  {
        JnaTreeListRowSorter.INST().gtk_tree_list_row_sorter_set_sorter(asCPointer(), asCPointer(sorter));
    }

    public static long getTypeID() { 
        return JnaTreeListRowSorter.INST().gtk_tree_list_row_sorter_get_type(); 
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
