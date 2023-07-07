/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGrid` is a container which arranges its child widgets in
 * <br>rows and columns.
 * <br>
 * <br>![An example GtkGrid](grid.png)
 * <br>
 * <br>It supports arbitrary positions and horizontal/vertical spans.
 * <br>
 * <br>Children are added using [method&#64;Gtk.Grid.attach]. They can span multiple
 * <br>rows or columns. It is also possible to add a child next to an existing
 * <br>child, using [method&#64;Gtk.Grid.attach_next_to]. To remove a child from the
 * <br>grid, use [method&#64;Gtk.Grid.remove].
 * <br>
 * <br>The behaviour of `GtkGrid` when several children occupy the same grid
 * <br>cell is undefined.
 * <br>
 * <br>&#35; GtkGrid as GtkBuildable
 * <br>
 * <br>Every child in a `GtkGrid` has access to a custom [iface&#64;Gtk.Buildable]
 * <br>element, called `&lt;layout&gt;`. It can by used to specify a position in the
 * <br>grid and optionally spans. All properties that can be used in the `&lt;layout&gt;`
 * <br>element are implemented by [class&#64;Gtk.GridLayoutChild].
 * <br>
 * <br>It is implemented by `GtkWidget` using [class&#64;Gtk.LayoutManager].
 * <br>
 * <br>To showcase it, here is a simple example:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkGrid&quot; id=&quot;my_grid&quot;&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkButton&quot; id=&quot;button1&quot;&gt;
 * <br>      &lt;property name=&quot;label&quot;&gt;Button 1&lt;/property&gt;
 * <br>      &lt;layout&gt;
 * <br>        &lt;property name=&quot;column&quot;&gt;0&lt;/property&gt;
 * <br>        &lt;property name=&quot;row&quot;&gt;0&lt;/property&gt;
 * <br>      &lt;/layout&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkButton&quot; id=&quot;button2&quot;&gt;
 * <br>      &lt;property name=&quot;label&quot;&gt;Button 2&lt;/property&gt;
 * <br>      &lt;layout&gt;
 * <br>        &lt;property name=&quot;column&quot;&gt;1&lt;/property&gt;
 * <br>        &lt;property name=&quot;row&quot;&gt;0&lt;/property&gt;
 * <br>      &lt;/layout&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkButton&quot; id=&quot;button3&quot;&gt;
 * <br>      &lt;property name=&quot;label&quot;&gt;Button 3&lt;/property&gt;
 * <br>      &lt;layout&gt;
 * <br>        &lt;property name=&quot;column&quot;&gt;2&lt;/property&gt;
 * <br>        &lt;property name=&quot;row&quot;&gt;0&lt;/property&gt;
 * <br>        &lt;property name=&quot;row-span&quot;&gt;2&lt;/property&gt;
 * <br>      &lt;/layout&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkButton&quot; id=&quot;button4&quot;&gt;
 * <br>      &lt;property name=&quot;label&quot;&gt;Button 4&lt;/property&gt;
 * <br>      &lt;layout&gt;
 * <br>        &lt;property name=&quot;column&quot;&gt;0&lt;/property&gt;
 * <br>        &lt;property name=&quot;row&quot;&gt;1&lt;/property&gt;
 * <br>        &lt;property name=&quot;column-span&quot;&gt;2&lt;/property&gt;
 * <br>      &lt;/layout&gt;
 * <br>    &lt;/object&gt;
 * <br>  &lt;/child&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>It organizes the first two buttons side-by-side in one cell each.
 * <br>The third button is in the last column but spans across two rows.
 * <br>This is defined by the `row-span` property. The last button is
 * <br>located in the second row and spans across two columns, which is
 * <br>defined by the `column-span` property.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkGrid` uses a single CSS node with name `grid`.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkGrid` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 * <p><a href="https://docs.gtk.org/gtk4/class.Grid.html">https://docs.gtk.org/gtk4/class.Grid.html</a></p>
*/
public class Grid extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Grid.class.getCanonicalName());
    }

    public Grid(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new grid widget.
    */
    public Grid() {
        super(cast(JnaGrid.INST().gtk_grid_new()));
    }

    /**
     * Adds a widget to the grid.
     * <br>
     * <br>The position of &#64;child is determined by &#64;column and &#64;row.
     * <br>The number of “cells” that &#64;child will occupy is determined
     * <br>by &#64;width and &#64;height.
     * @param child the widget to add
     * @param column the column number to attach the left side of &#64;child to
     * @param row the row number to attach the top side of &#64;child to
     * @param width the number of columns that &#64;child will span
     * @param height the number of rows that &#64;child will span
    */
    public void attach(@Nonnull Widget child, int column, int row, int width, int height)  {
        JnaGrid.INST().gtk_grid_attach(asCPointer(), asCPointerNotNull(child), column, row, width, height);
    }

    /**
     * Adds a widget to the grid.
     * <br>
     * <br>The widget is placed next to &#64;sibling, on the side determined by
     * <br>&#64;side. When &#64;sibling is %NULL, the widget is placed in row (for
     * <br>left or right placement) or column 0 (for top or bottom placement),
     * <br>at the end indicated by &#64;side.
     * <br>
     * <br>Attaching widgets labeled `[1]`, `[2]`, `[3]` with `&#64;sibling == %NULL` and
     * <br>`&#64;side == %GTK_POS_LEFT` yields a layout of `[3][2][1]`.
     * @param child the widget to add
     * @param sibling the child of &#64;grid that &#64;child will be placed   next to, or %NULL to place &#64;child at the beginning or end
     * @param side the side of &#64;sibling that &#64;child is positioned next to
     * @param width the number of columns that &#64;child will span
     * @param height the number of rows that &#64;child will span
    */
    public void attachNextTo(@Nonnull Widget child, @Nullable Widget sibling, int side, int width, int height)  {
        JnaGrid.INST().gtk_grid_attach_next_to(asCPointer(), asCPointerNotNull(child), asCPointer(sibling), side, width, height);
    }

    /**
     * Returns which row defines the global baseline of &#64;grid.
     * @return the row index defining the global baseline
    */
    public int getBaselineRow()  {
        return JnaGrid.INST().gtk_grid_get_baseline_row(asCPointer());
    }

    /**
     * Gets the child of &#64;grid whose area covers the grid
     * <br>cell at &#64;column, &#64;row.
     * @param column the left edge of the cell
     * @param row the top edge of the cell
     * @return the child at the given position
    */
    public Widget getChildAt(int column, int row)  {
        return new Widget(new PointerContainer(JnaGrid.INST().gtk_grid_get_child_at(asCPointer(), column, row)));
    }

    /**
     * Returns whether all columns of &#64;grid have the same width.
     * @return whether all columns of &#64;grid have the same width.
    */
    public boolean getColumnHomogeneous()  {
        return JnaGrid.INST().gtk_grid_get_column_homogeneous(asCPointer());
    }

    /**
     * Returns the amount of space between the columns of &#64;grid.
     * @return the column spacing of &#64;grid
    */
    public int getColumnSpacing()  {
        return JnaGrid.INST().gtk_grid_get_column_spacing(asCPointer());
    }

    /**
     * Returns the baseline position of &#64;row.
     * <br>
     * <br>See [method&#64;Gtk.Grid.set_row_baseline_position].
     * @param row a row index
     * @return the baseline position of &#64;row
    */
    public int getRowBaselinePosition(int row)  {
        return JnaGrid.INST().gtk_grid_get_row_baseline_position(asCPointer(), row);
    }

    /**
     * Returns whether all rows of &#64;grid have the same height.
     * @return whether all rows of &#64;grid have the same height.
    */
    public boolean getRowHomogeneous()  {
        return JnaGrid.INST().gtk_grid_get_row_homogeneous(asCPointer());
    }

    /**
     * Returns the amount of space between the rows of &#64;grid.
     * @return the row spacing of &#64;grid
    */
    public int getRowSpacing()  {
        return JnaGrid.INST().gtk_grid_get_row_spacing(asCPointer());
    }

    /**
     * Inserts a column at the specified position.
     * <br>
     * <br>Children which are attached at or to the right of this position
     * <br>are moved one column to the right. Children which span across this
     * <br>position are grown to span the new column.
     * @param position the position to insert the column at
    */
    public void insertColumn(int position)  {
        JnaGrid.INST().gtk_grid_insert_column(asCPointer(), position);
    }

    /**
     * Inserts a row or column at the specified position.
     * <br>
     * <br>The new row or column is placed next to &#64;sibling, on the side
     * <br>determined by &#64;side. If &#64;side is %GTK_POS_TOP or %GTK_POS_BOTTOM,
     * <br>a row is inserted. If &#64;side is %GTK_POS_LEFT of %GTK_POS_RIGHT,
     * <br>a column is inserted.
     * @param sibling the child of &#64;grid that the new row or column will be   placed next to
     * @param side the side of &#64;sibling that &#64;child is positioned next to
    */
    public void insertNextTo(@Nonnull Widget sibling, int side)  {
        JnaGrid.INST().gtk_grid_insert_next_to(asCPointer(), asCPointerNotNull(sibling), side);
    }

    /**
     * Inserts a row at the specified position.
     * <br>
     * <br>Children which are attached at or below this position
     * <br>are moved one row down. Children which span across this
     * <br>position are grown to span the new row.
     * @param position the position to insert the row at
    */
    public void insertRow(int position)  {
        JnaGrid.INST().gtk_grid_insert_row(asCPointer(), position);
    }

    /**
     * Queries the attach points and spans of &#64;child inside the given `GtkGrid`.
     * @param child a `GtkWidget` child of &#64;grid
     * @param column the column used to attach the left side of &#64;child
     * @param row the row used to attach the top side of &#64;child
     * @param width the number of columns &#64;child spans
     * @param height the number of rows &#64;child spans
    */
    public void queryChild(@Nonnull Widget child, @Nullable ch.bailu.gtk.type.Int column, @Nullable ch.bailu.gtk.type.Int row, @Nullable ch.bailu.gtk.type.Int width, @Nullable ch.bailu.gtk.type.Int height)  {
        JnaGrid.INST().gtk_grid_query_child(asCPointer(), asCPointerNotNull(child), asCPointer(column), asCPointer(row), asCPointer(width), asCPointer(height));
    }

    /**
     * Removes a child from &#64;grid.
     * <br>
     * <br>The child must have been added with
     * <br>[method&#64;Gtk.Grid.attach] or [method&#64;Gtk.Grid.attach_next_to].
     * @param child the child widget to remove
    */
    public void remove(@Nonnull Widget child)  {
        JnaGrid.INST().gtk_grid_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Removes a column from the grid.
     * <br>
     * <br>Children that are placed in this column are removed,
     * <br>spanning children that overlap this column have their
     * <br>width reduced by one, and children after the column
     * <br>are moved to the left.
     * @param position the position of the column to remove
    */
    public void removeColumn(int position)  {
        JnaGrid.INST().gtk_grid_remove_column(asCPointer(), position);
    }

    /**
     * Removes a row from the grid.
     * <br>
     * <br>Children that are placed in this row are removed,
     * <br>spanning children that overlap this row have their
     * <br>height reduced by one, and children below the row
     * <br>are moved up.
     * @param position the position of the row to remove
    */
    public void removeRow(int position)  {
        JnaGrid.INST().gtk_grid_remove_row(asCPointer(), position);
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
        JnaGrid.INST().gtk_grid_set_baseline_row(asCPointer(), row);
    }

    /**
     * Sets whether all columns of &#64;grid will have the same width.
     * @param homogeneous %TRUE to make columns homogeneous
    */
    public void setColumnHomogeneous(boolean homogeneous)  {
        JnaGrid.INST().gtk_grid_set_column_homogeneous(asCPointer(), homogeneous);
    }

    /**
     * Sets the amount of space between columns of &#64;grid.
     * @param spacing the amount of space to insert between columns
    */
    public void setColumnSpacing(int spacing)  {
        JnaGrid.INST().gtk_grid_set_column_spacing(asCPointer(), spacing);
    }

    /**
     * Sets how the baseline should be positioned on &#64;row of the
     * <br>grid, in case that row is assigned more space than is requested.
     * <br>
     * <br>The default baseline position is %GTK_BASELINE_POSITION_CENTER.
     * @param row a row index
     * @param pos a `GtkBaselinePosition`
    */
    public void setRowBaselinePosition(int row, int pos)  {
        JnaGrid.INST().gtk_grid_set_row_baseline_position(asCPointer(), row, pos);
    }

    /**
     * Sets whether all rows of &#64;grid will have the same height.
     * @param homogeneous %TRUE to make rows homogeneous
    */
    public void setRowHomogeneous(boolean homogeneous)  {
        JnaGrid.INST().gtk_grid_set_row_homogeneous(asCPointer(), homogeneous);
    }

    /**
     * Sets the amount of space between rows of &#64;grid.
     * @param spacing the amount of space to insert between rows
    */
    public void setRowSpacing(int spacing)  {
        JnaGrid.INST().gtk_grid_set_row_spacing(asCPointer(), spacing);
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaGrid.INST().gtk_grid_get_type(); 
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
