/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGridLayout` is a layout manager which arranges child widgets in
 * <br>rows and columns.
 * <br>
 * <br>Children have an &quot;attach point&quot; defined by the horizontal and vertical
 * <br>index of the cell they occupy; children can span multiple rows or columns.
 * <br>The layout properties for setting the attach points and spans are set
 * <br>using the [class&#64;Gtk.GridLayoutChild] associated to each child widget.
 * <br>
 * <br>The behaviour of `GtkGridLayout` when several children occupy the same
 * <br>grid cell is undefined.
 * <br>
 * <br>`GtkGridLayout` can be used like a `GtkBoxLayout` if all children are
 * <br>attached to the same row or column; however, if you only ever need a
 * <br>single row or column, you should consider using `GtkBoxLayout`.
 * <p><a href="https://docs.gtk.org/gtk4/class.GridLayout.html">https://docs.gtk.org/gtk4/class.GridLayout.html</a></p>
*/
public class GridLayout extends LayoutManager {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GridLayout.class.getCanonicalName());
    }

    public GridLayout(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkGridLayout`.
    */
    public GridLayout() {
        super(cast(JnaGridLayout.INST().gtk_grid_layout_new()));
    }

    /**
     * Retrieves the row set with gtk_grid_layout_set_baseline_row().
     * @return the global baseline row
    */
    public int getBaselineRow()  {
        return JnaGridLayout.INST().gtk_grid_layout_get_baseline_row(asCPointer());
    }

    /**
     * Checks whether all columns of &#64;grid should have the same width.
     * @return %TRUE if the columns are homogeneous, and %FALSE otherwise
    */
    public boolean getColumnHomogeneous()  {
        return JnaGridLayout.INST().gtk_grid_layout_get_column_homogeneous(asCPointer());
    }

    /**
     * Retrieves the spacing set with gtk_grid_layout_set_column_spacing().
     * @return the spacing between consecutive columns
    */
    public int getColumnSpacing()  {
        return JnaGridLayout.INST().gtk_grid_layout_get_column_spacing(asCPointer());
    }

    /**
     * Returns the baseline position of &#64;row.
     * <br>
     * <br>If no value has been set with
     * <br>[method&#64;Gtk.GridLayout.set_row_baseline_position],
     * <br>the default value of %GTK_BASELINE_POSITION_CENTER
     * <br>is returned.
     * @param row a row index
     * @return the baseline position of &#64;row
    */
    public int getRowBaselinePosition(int row)  {
        return JnaGridLayout.INST().gtk_grid_layout_get_row_baseline_position(asCPointer(), row);
    }

    /**
     * Checks whether all rows of &#64;grid should have the same height.
     * @return %TRUE if the rows are homogeneous, and %FALSE otherwise
    */
    public boolean getRowHomogeneous()  {
        return JnaGridLayout.INST().gtk_grid_layout_get_row_homogeneous(asCPointer());
    }

    /**
     * Retrieves the spacing set with gtk_grid_layout_set_row_spacing().
     * @return the spacing between consecutive rows
    */
    public int getRowSpacing()  {
        return JnaGridLayout.INST().gtk_grid_layout_get_row_spacing(asCPointer());
    }

    /**
     * Sets which row defines the global baseline for the entire grid.
     * <br>
     * <br>Each row in the grid can have its own local baseline, but only
     * <br>one of those is global, meaning it will be the baseline in the
     * <br>parent of the &#64;grid.
     * @param row the row index
    */
    public void setBaselineRow(int row)  {
        JnaGridLayout.INST().gtk_grid_layout_set_baseline_row(asCPointer(), row);
    }

    /**
     * Sets whether all columns of &#64;grid should have the same width.
     * @param homogeneous %TRUE to make columns homogeneous
    */
    public void setColumnHomogeneous(boolean homogeneous)  {
        JnaGridLayout.INST().gtk_grid_layout_set_column_homogeneous(asCPointer(), homogeneous);
    }

    /**
     * Sets the amount of space to insert between consecutive columns.
     * @param spacing the amount of space between columns, in pixels
    */
    public void setColumnSpacing(int spacing)  {
        JnaGridLayout.INST().gtk_grid_layout_set_column_spacing(asCPointer(), spacing);
    }

    /**
     * Sets how the baseline should be positioned on &#64;row of the
     * <br>grid, in case that row is assigned more space than is requested.
     * @param row a row index
     * @param pos a `GtkBaselinePosition`
    */
    public void setRowBaselinePosition(int row, int pos)  {
        JnaGridLayout.INST().gtk_grid_layout_set_row_baseline_position(asCPointer(), row, pos);
    }

    /**
     * Sets whether all rows of &#64;grid should have the same height.
     * @param homogeneous %TRUE to make rows homogeneous
    */
    public void setRowHomogeneous(boolean homogeneous)  {
        JnaGridLayout.INST().gtk_grid_layout_set_row_homogeneous(asCPointer(), homogeneous);
    }

    /**
     * Sets the amount of space to insert between consecutive rows.
     * @param spacing the amount of space between rows, in pixels
    */
    public void setRowSpacing(int spacing)  {
        JnaGridLayout.INST().gtk_grid_layout_set_row_spacing(asCPointer(), spacing);
    }

    public static long getTypeID() { 
        return JnaGridLayout.INST().gtk_grid_layout_get_type(); 
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
