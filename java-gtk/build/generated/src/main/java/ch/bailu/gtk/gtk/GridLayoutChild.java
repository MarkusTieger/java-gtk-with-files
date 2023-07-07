/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkLayoutChild` subclass for children in a `GtkGridLayout`.
 * <p><a href="https://docs.gtk.org/gtk4/class.GridLayoutChild.html">https://docs.gtk.org/gtk4/class.GridLayoutChild.html</a></p>
*/
public class GridLayoutChild extends LayoutChild {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GridLayoutChild.class.getCanonicalName());
    }

    public GridLayoutChild(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the column number to which &#64;child attaches its left side.
     * @return the column number
    */
    public int getColumn()  {
        return JnaGridLayoutChild.INST().gtk_grid_layout_child_get_column(asCPointer());
    }

    /**
     * Retrieves the number of columns that &#64;child spans to.
     * @return the number of columns
    */
    public int getColumnSpan()  {
        return JnaGridLayoutChild.INST().gtk_grid_layout_child_get_column_span(asCPointer());
    }

    /**
     * Retrieves the row number to which &#64;child attaches its top side.
     * @return the row number
    */
    public int getRow()  {
        return JnaGridLayoutChild.INST().gtk_grid_layout_child_get_row(asCPointer());
    }

    /**
     * Retrieves the number of rows that &#64;child spans to.
     * @return the number of row
    */
    public int getRowSpan()  {
        return JnaGridLayoutChild.INST().gtk_grid_layout_child_get_row_span(asCPointer());
    }

    /**
     * Sets the column number to attach the left side of &#64;child.
     * @param column the attach point for &#64;child
    */
    public void setColumn(int column)  {
        JnaGridLayoutChild.INST().gtk_grid_layout_child_set_column(asCPointer(), column);
    }

    /**
     * Sets the number of columns &#64;child spans to.
     * @param span the span of &#64;child
    */
    public void setColumnSpan(int span)  {
        JnaGridLayoutChild.INST().gtk_grid_layout_child_set_column_span(asCPointer(), span);
    }

    /**
     * Sets the row to place &#64;child in.
     * @param row the row for &#64;child
    */
    public void setRow(int row)  {
        JnaGridLayoutChild.INST().gtk_grid_layout_child_set_row(asCPointer(), row);
    }

    /**
     * Sets the number of rows &#64;child spans to.
     * @param span the span of &#64;child
    */
    public void setRowSpan(int span)  {
        JnaGridLayoutChild.INST().gtk_grid_layout_child_set_row_span(asCPointer(), span);
    }

    public static long getTypeID() { 
        return JnaGridLayoutChild.INST().gtk_grid_layout_child_get_type(); 
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
