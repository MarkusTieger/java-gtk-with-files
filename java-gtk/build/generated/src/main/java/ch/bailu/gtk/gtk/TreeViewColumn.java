/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A visible column in a [class&#64;Gtk.TreeView] widget
 * <br>
 * <br>The `GtkTreeViewColumn` object represents a visible column in a `GtkTreeView` widget.
 * <br>It allows to set properties of the column header, and functions as a holding pen
 * <br>for the cell renderers which determine how the data in the column is displayed.
 * <br>
 * <br>Please refer to the [tree widget conceptual overview](section-tree-widget.html)
 * <br>for an overview of all the objects and data types related to the tree widget and
 * <br>how they work together, and to the [class&#64;Gtk.TreeView] documentation for specifics
 * <br>about the CSS node structure for treeviews and their headers.
 * <p><a href="https://docs.gtk.org/gtk4/class.TreeViewColumn.html">https://docs.gtk.org/gtk4/class.TreeViewColumn.html</a></p>
*/
public class TreeViewColumn extends ch.bailu.gtk.gobject.InitiallyUnowned {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeViewColumn.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnTreeCellDataFunc {
        /**
         * A function to set the properties of a cell instead of just using the
         * <br>straight mapping between the cell and the model.
         * <br>
         * <br>This function is useful for customizing the cell renderer. For example,
         * <br>a function might get an* integer from the &#64;tree_model, and render it to
         * <br>the “text” attribute of “cell” by converting it to its written equivalent.
         * <br>
         * <br>See also: gtk_tree_view_column_set_cell_data_func()
         * @param tree_column A `GtkTreeViewColumn`
         * @param cell The `GtkCellRenderer` that is being rendered by &#64;tree_column
         * @param tree_model The `GtkTreeModel` being rendered
         * @param iter A `GtkTreeIter` of the current row rendered
         * @param data user data
        */
        void onTreeCellDataFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeViewColumn tree_column, @Nonnull CellRenderer cell, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTreeViewColumn.OnTreeCellDataFunc toOnTreeCellDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTreeCellDataFunc in) {
        JnaTreeViewColumn.OnTreeCellDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_tree_column, _cell, _tree_model, _iter, _data) -> in.onTreeCellDataFunc(__callback, new TreeViewColumn(new PointerContainer(_tree_column)), new CellRenderer(new PointerContainer(_cell)), new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTreeViewColumn.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaTreeViewColumn.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnClicked {
        /**
         * Emitted when the column's header has been clicked.
        */
        void onClicked();
    }
    
    private static com.sun.jna.Callback toOnClicked(OnClicked in) {
        return (in == null) ? null: (JnaTreeViewColumn.OnClicked) (__self, __data) -> in.onClicked();
    }

    public TreeViewColumn(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkTreeViewColumn` using &#64;area to render its cells.
     * @param area the `GtkCellArea` that the newly created column should use to layout cells.
     * @return A newly created `GtkTreeViewColumn`.
    */
    public static TreeViewColumn newWithAreaTreeViewColumn(@Nonnull CellArea area)  {
        PointerContainer __self = cast(JnaTreeViewColumn.INST().gtk_tree_view_column_new_with_area(asCPointerNotNull(area)));
        if (__self.isNull()) {
            throw new NullPointerException("TreeViewColumn:newWithArea");
        }
        return new TreeViewColumn(__self);
    }        
    

    /**
     * Creates a new `GtkTreeViewColumn` with a number of default values.
     * <br>This is equivalent to calling gtk_tree_view_column_set_title(),
     * <br>gtk_tree_view_column_pack_start(), and
     * <br>gtk_tree_view_column_set_attributes() on the newly created `GtkTreeViewColumn`.
     * <br>
     * <br>Here’s a simple example:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  enum { TEXT_COLUMN, COLOR_COLUMN, N_COLUMNS };
     *  // ...
     *  {
     *    GtkTreeViewColumn *column;
     *    GtkCellRenderer   *renderer = gtk_cell_renderer_text_new ();
     *  
     *    column = gtk_tree_view_column_new_with_attributes (&quot;Title&quot;,
     *                                                       renderer,
     *                                                       &quot;text&quot;, TEXT_COLUMN,
     *                                                       &quot;foreground&quot;, COLOR_COLUMN,
     *                                                       NULL);
     *  }
     * </pre>
     * @param title The title to set the header to
     * @param cell The `GtkCellRenderer`
     * @param _elipse A %NULL-terminated list of attributes
     * @return A newly created `GtkTreeViewColumn`.
    */
    public static TreeViewColumn newWithAttributesTreeViewColumn(@Nonnull ch.bailu.gtk.type.Str title, @Nonnull CellRenderer cell, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaTreeViewColumn.INST().gtk_tree_view_column_new_with_attributes(asCPointerNotNull(title), asCPointerNotNull(cell), _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("TreeViewColumn:newWithAttributes");
        }
        return new TreeViewColumn(__self);
    }        
    

    /**
     * Creates a new `GtkTreeViewColumn` with a number of default values.
     * <br>This is equivalent to calling gtk_tree_view_column_set_title(),
     * <br>gtk_tree_view_column_pack_start(), and
     * <br>gtk_tree_view_column_set_attributes() on the newly created `GtkTreeViewColumn`.
     * <br>
     * <br>Here’s a simple example:
     * <pre>&lt;!-- language=&quot;C&quot; --&gt;
     *  enum { TEXT_COLUMN, COLOR_COLUMN, N_COLUMNS };
     *  // ...
     *  {
     *    GtkTreeViewColumn *column;
     *    GtkCellRenderer   *renderer = gtk_cell_renderer_text_new ();
     *  
     *    column = gtk_tree_view_column_new_with_attributes (&quot;Title&quot;,
     *                                                       renderer,
     *                                                       &quot;text&quot;, TEXT_COLUMN,
     *                                                       &quot;foreground&quot;, COLOR_COLUMN,
     *                                                       NULL);
     *  }
     * </pre>
     * @param title The title to set the header to
     * @param cell The `GtkCellRenderer`
     * @param _elipse A %NULL-terminated list of attributes
     * @return A newly created `GtkTreeViewColumn`.
    */
    public static TreeViewColumn newWithAttributesTreeViewColumn(String title, @Nonnull CellRenderer cell, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaTreeViewColumn.INST().gtk_tree_view_column_new_with_attributes(title, asCPointerNotNull(cell), _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("TreeViewColumn:newWithAttributes");
        }
        return new TreeViewColumn(__self);
    }        
    

    /**
     * Creates a new `GtkTreeViewColumn`.
    */
    public TreeViewColumn() {
        super(cast(JnaTreeViewColumn.INST().gtk_tree_view_column_new()));
    }

    /**
     * Adds an attribute mapping to the list in &#64;tree_column.
     * <br>
     * <br>The &#64;column is the
     * <br>column of the model to get a value from, and the &#64;attribute is the
     * <br>parameter on &#64;cell_renderer to be set from the value. So for example
     * <br>if column 2 of the model contains strings, you could have the
     * <br>“text” attribute of a `GtkCellRendererText` get its values from
     * <br>column 2.
     * @param cell_renderer the `GtkCellRenderer` to set attributes on
     * @param attribute An attribute on the renderer
     * @param column The column position on the model to get the attribute from.
    */
    public void addAttribute(@Nonnull CellRenderer cell_renderer, @Nonnull ch.bailu.gtk.type.Str attribute, int column)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_add_attribute(asCPointer(), asCPointerNotNull(cell_renderer), asCPointerNotNull(attribute), column);
    }

    /**
     * Adds an attribute mapping to the list in &#64;tree_column.
     * <br>
     * <br>The &#64;column is the
     * <br>column of the model to get a value from, and the &#64;attribute is the
     * <br>parameter on &#64;cell_renderer to be set from the value. So for example
     * <br>if column 2 of the model contains strings, you could have the
     * <br>“text” attribute of a `GtkCellRendererText` get its values from
     * <br>column 2.
     * @param cell_renderer the `GtkCellRenderer` to set attributes on
     * @param attribute An attribute on the renderer
     * @param column The column position on the model to get the attribute from.
    */
    public void addAttribute(@Nonnull CellRenderer cell_renderer, String attribute, int column)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_add_attribute(asCPointer(), asCPointerNotNull(cell_renderer), attribute, column);
    }

    /**
     * Obtains the horizontal position and size of a cell in a column.
     * <br>
     * <br>If the  cell is not found in the column, &#64;start_pos and &#64;width
     * <br>are not changed and %FALSE is returned.
     * @param cell_renderer a `GtkCellRenderer`
     * @param x_offset return location for the horizontal   position of &#64;cell within &#64;tree_column
     * @param width return location for the width of &#64;cell
     * @return %TRUE if &#64;cell belongs to &#64;tree_column
    */
    public boolean cellGetPosition(@Nonnull CellRenderer cell_renderer, @Nullable ch.bailu.gtk.type.Int x_offset, @Nullable ch.bailu.gtk.type.Int width)  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_cell_get_position(asCPointer(), asCPointerNotNull(cell_renderer), asCPointer(x_offset), asCPointer(width));
    }

    /**
     * Obtains the width and height needed to render the column.  This is used
     * <br>primarily by the `GtkTreeView`.
     * @param x_offset location to return x offset of a cell relative to &#64;cell_area
     * @param y_offset location to return y offset of a cell relative to &#64;cell_area
     * @param width location to return width needed to render a cell
     * @param height location to return height needed to render a cell
    */
    public void cellGetSize(@Nullable ch.bailu.gtk.type.Int x_offset, @Nullable ch.bailu.gtk.type.Int y_offset, @Nullable ch.bailu.gtk.type.Int width, @Nullable ch.bailu.gtk.type.Int height)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_cell_get_size(asCPointer(), asCPointer(x_offset), asCPointer(y_offset), asCPointer(width), asCPointer(height));
    }

    /**
     * Returns %TRUE if any of the cells packed into the &#64;tree_column are visible.
     * <br>For this to be meaningful, you must first initialize the cells with
     * <br>gtk_tree_view_column_cell_set_cell_data()
     * @return %TRUE, if any of the cells packed into the &#64;tree_column are currently visible
    */
    public boolean cellIsVisible()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_cell_is_visible(asCPointer());
    }

    /**
     * Sets the cell renderer based on the &#64;tree_model and &#64;iter.  That is, for
     * <br>every attribute mapping in &#64;tree_column, it will get a value from the set
     * <br>column on the &#64;iter, and use that value to set the attribute on the cell
     * <br>renderer.  This is used primarily by the `GtkTreeView`.
     * @param tree_model The `GtkTreeModel` to get the cell renderers attributes from.
     * @param iter The `GtkTreeIter` to get the cell renderer’s attributes from.
     * @param is_expander %TRUE, if the row has children
     * @param is_expanded %TRUE, if the row has visible children
    */
    public void cellSetCellData(@Nonnull TreeModel tree_model, @Nonnull TreeIter iter, boolean is_expander, boolean is_expanded)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_cell_set_cell_data(asCPointer(), asCPointerNotNull(tree_model), asCPointerNotNull(iter), is_expander, is_expanded);
    }

    /**
     * Unsets all the mappings on all renderers on the &#64;tree_column.
    */
    public void clear()  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_clear(asCPointer());
    }

    /**
     * Clears all existing attributes previously set with
     * <br>gtk_tree_view_column_set_attributes().
     * @param cell_renderer a `GtkCellRenderer` to clear the attribute mapping on.
    */
    public void clearAttributes(@Nonnull CellRenderer cell_renderer)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_clear_attributes(asCPointer(), asCPointerNotNull(cell_renderer));
    }

    /**
     * Emits the “clicked” signal on the column.  This function will only work if
     * <br>&#64;tree_column is clickable.
    */
    public void clicked()  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_clicked(asCPointer());
    }

    /**
     * Sets the current keyboard focus to be at &#64;cell, if the column contains
     * <br>2 or more editable and activatable cells.
     * @param cell A `GtkCellRenderer`
    */
    public void focusCell(@Nonnull CellRenderer cell)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_focus_cell(asCPointer(), asCPointerNotNull(cell));
    }

    /**
     * Returns the current x alignment of &#64;tree_column.  This value can range
     * <br>between 0.0 and 1.0.
     * @return The current alignent of &#64;tree_column.
    */
    public float getAlignment()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_alignment(asCPointer());
    }

    /**
     * Returns the button used in the treeview column header
     * @return The button for the column header.
    */
    public Widget getButton()  {
        return new Widget(new PointerContainer(JnaTreeViewColumn.INST().gtk_tree_view_column_get_button(asCPointer())));
    }

    /**
     * Returns %TRUE if the user can click on the header for the column.
     * @return %TRUE if user can click the column header.
    */
    public boolean getClickable()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_clickable(asCPointer());
    }

    /**
     * Returns %TRUE if the column expands to fill available space.
     * @return %TRUE if the column expands to fill available space.
    */
    public boolean getExpand()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_expand(asCPointer());
    }

    /**
     * Gets the fixed width of the column.  This may not be the actual displayed
     * <br>width of the column; for that, use gtk_tree_view_column_get_width().
     * @return The fixed width of the column.
    */
    public int getFixedWidth()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_fixed_width(asCPointer());
    }

    /**
     * Returns the maximum width in pixels of the &#64;tree_column, or -1 if no maximum
     * <br>width is set.
     * @return The maximum width of the &#64;tree_column.
    */
    public int getMaxWidth()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_max_width(asCPointer());
    }

    /**
     * Returns the minimum width in pixels of the &#64;tree_column, or -1 if no minimum
     * <br>width is set.
     * @return The minimum width of the &#64;tree_column.
    */
    public int getMinWidth()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_min_width(asCPointer());
    }

    /**
     * Returns %TRUE if the &#64;tree_column can be reordered by the user.
     * @return %TRUE if the &#64;tree_column can be reordered by the user.
    */
    public boolean getReorderable()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_reorderable(asCPointer());
    }

    /**
     * Returns %TRUE if the &#64;tree_column can be resized by the end user.
     * @return %TRUE, if the &#64;tree_column can be resized.
    */
    public boolean getResizable()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_resizable(asCPointer());
    }

    /**
     * Returns the current type of &#64;tree_column.
     * @return The type of &#64;tree_column.
    */
    public int getSizing()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_sizing(asCPointer());
    }

    /**
     * Gets the logical &#64;sort_column_id that the model sorts on
     * <br>when this column is selected for sorting.
     * <br>
     * <br>See [method&#64;Gtk.TreeViewColumn.set_sort_column_id].
     * @return the current &#64;sort_column_id for this column, or -1 if   this column can’t be used for sorting
    */
    public int getSortColumnId()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_sort_column_id(asCPointer());
    }

    /**
     * Gets the value set by gtk_tree_view_column_set_sort_indicator().
     * @return whether the sort indicator arrow is displayed
    */
    public boolean getSortIndicator()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_sort_indicator(asCPointer());
    }

    /**
     * Gets the value set by gtk_tree_view_column_set_sort_order().
     * @return the sort order the sort indicator is indicating
    */
    public int getSortOrder()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_sort_order(asCPointer());
    }

    /**
     * Returns the spacing of &#64;tree_column.
     * @return the spacing of &#64;tree_column.
    */
    public int getSpacing()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_spacing(asCPointer());
    }

    /**
     * Returns the title of the widget.
     * @return the title of the column. This string should not be modified or freed.
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTreeViewColumn.INST().gtk_tree_view_column_get_title(asCPointer())));
    }

    /**
     * Returns the `GtkTreeView` wherein &#64;tree_column has been inserted.
     * <br>If &#64;column is currently not inserted in any tree view, %NULL is
     * <br>returned.
     * @return The tree view wherein &#64;column   has been inserted
    */
    public Widget getTreeView()  {
        return new Widget(new PointerContainer(JnaTreeViewColumn.INST().gtk_tree_view_column_get_tree_view(asCPointer())));
    }

    /**
     * Returns %TRUE if &#64;tree_column is visible.
     * @return whether the column is visible or not.  If it is visible, then the tree will show the column.
    */
    public boolean getVisible()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_visible(asCPointer());
    }

    /**
     * Returns the `GtkWidget` in the button on the column header.
     * <br>
     * <br>If a custom widget has not been set then %NULL is returned.
     * @return The `GtkWidget` in the column header
    */
    public Widget getWidget()  {
        return new Widget(new PointerContainer(JnaTreeViewColumn.INST().gtk_tree_view_column_get_widget(asCPointer())));
    }

    /**
     * Returns the current size of &#64;tree_column in pixels.
     * @return The current width of &#64;tree_column.
    */
    public int getWidth()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_width(asCPointer());
    }

    /**
     * Returns the current X offset of &#64;tree_column in pixels.
     * @return The current X offset of &#64;tree_column.
    */
    public int getXOffset()  {
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_x_offset(asCPointer());
    }

    /**
     * Adds the &#64;cell to end of the column. If &#64;expand is %FALSE, then the &#64;cell
     * <br>is allocated no more space than it needs. Any unused space is divided
     * <br>evenly between cells for which &#64;expand is %TRUE.
     * @param cell The `GtkCellRenderer`
     * @param expand %TRUE if &#64;cell is to be given extra space allocated to &#64;tree_column.
    */
    public void packEnd(@Nonnull CellRenderer cell, boolean expand)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_pack_end(asCPointer(), asCPointerNotNull(cell), expand);
    }

    /**
     * Packs the &#64;cell into the beginning of the column. If &#64;expand is %FALSE, then
     * <br>the &#64;cell is allocated no more space than it needs. Any unused space is divided
     * <br>evenly between cells for which &#64;expand is %TRUE.
     * @param cell The `GtkCellRenderer`
     * @param expand %TRUE if &#64;cell is to be given extra space allocated to &#64;tree_column.
    */
    public void packStart(@Nonnull CellRenderer cell, boolean expand)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_pack_start(asCPointer(), asCPointerNotNull(cell), expand);
    }

    /**
     * Flags the column, and the cell renderers added to this column, to have
     * <br>their sizes renegotiated.
    */
    public void queueResize()  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_queue_resize(asCPointer());
    }

    /**
     * Sets the alignment of the title or custom widget inside the column header.
     * <br>The alignment determines its location inside the button -- 0.0 for left, 0.5
     * <br>for center, 1.0 for right.
     * @param xalign The alignment, which is between [0.0 and 1.0] inclusive.
    */
    public void setAlignment(float xalign)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_alignment(asCPointer(), xalign);
    }

    /**
     * Sets the attributes in the list as the attributes of &#64;tree_column.
     * <br>
     * <br>The attributes should be in attribute/column order, as in
     * <br>gtk_tree_view_column_add_attribute(). All existing attributes
     * <br>are removed, and replaced with the new attributes.
     * @param cell_renderer the `GtkCellRenderer` we’re setting the attributes of
     * @param _elipse A %NULL-terminated list of attributes
    */
    public void setAttributes(@Nonnull CellRenderer cell_renderer, java.lang.Object... _elipse)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_attributes(asCPointer(), asCPointerNotNull(cell_renderer), _elipse);
    }

    /**
     * Sets the `GtkTreeCellDataFunc` to use for the column.
     * <br>
     * <br>This
     * <br>function is used instead of the standard attributes mapping for
     * <br>setting the column value, and should set the value of &#64;tree_column's
     * <br>cell renderer as appropriate.  &#64;func may be %NULL to remove an
     * <br>older one.
     * @param cell_renderer A `GtkCellRenderer`
     * @param func The `GtkTreeCellDataFunc` to use.
     * @param func_data The user data for &#64;func.
     * @param destroy The destroy notification for &#64;func_data
    */
    public void setCellDataFunc(@Nonnull CellRenderer cell_renderer, OnTreeCellDataFunc func, @Nullable ch.bailu.gtk.type.Pointer func_data, OnDestroyNotify destroy)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_cell_data_func(asCPointer(), asCPointerNotNull(cell_renderer), toOnTreeCellDataFunc(this, "setCellDataFunc", func), asCPointer(func_data), toOnDestroyNotify(this, "setCellDataFunc", destroy));
    }

    /**
     * Sets the header to be active if &#64;clickable is %TRUE.  When the header is
     * <br>active, then it can take keyboard focus, and can be clicked.
     * @param clickable %TRUE if the header is active.
    */
    public void setClickable(boolean clickable)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_clickable(asCPointer(), clickable);
    }

    /**
     * Sets the column to take available extra space.  This space is shared equally
     * <br>amongst all columns that have the expand set to %TRUE.  If no column has this
     * <br>option set, then the last column gets all extra space.  By default, every
     * <br>column is created with this %FALSE.
     * <br>
     * <br>Along with “fixed-width”, the “expand” property changes when the column is
     * <br>resized by the user.
     * @param expand %TRUE if the column should expand to fill available space.
    */
    public void setExpand(boolean expand)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_expand(asCPointer(), expand);
    }

    /**
     * If &#64;fixed_width is not -1, sets the fixed width of &#64;tree_column; otherwise
     * <br>unsets it.  The effective value of &#64;fixed_width is clamped between the
     * <br>minimum and maximum width of the column; however, the value stored in the
     * <br>“fixed-width” property is not clamped.  If the column sizing is
     * <br>%GTK_TREE_VIEW_COLUMN_GROW_ONLY or %GTK_TREE_VIEW_COLUMN_AUTOSIZE, setting
     * <br>a fixed width overrides the automatically calculated width.  Note that
     * <br>&#64;fixed_width is only a hint to GTK; the width actually allocated to the
     * <br>column may be greater or less than requested.
     * <br>
     * <br>Along with “expand”, the “fixed-width” property changes when the column is
     * <br>resized by the user.
     * @param fixed_width The new fixed width, in pixels, or -1.
    */
    public void setFixedWidth(int fixed_width)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_fixed_width(asCPointer(), fixed_width);
    }

    /**
     * Sets the maximum width of the &#64;tree_column.  If &#64;max_width is -1, then the
     * <br>maximum width is unset.  Note, the column can actually be wider than max
     * <br>width if it’s the last column in a view.  In this case, the column expands to
     * <br>fill any extra space.
     * @param max_width The maximum width of the column in pixels, or -1.
    */
    public void setMaxWidth(int max_width)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_max_width(asCPointer(), max_width);
    }

    /**
     * Sets the minimum width of the &#64;tree_column.  If &#64;min_width is -1, then the
     * <br>minimum width is unset.
     * @param min_width The minimum width of the column in pixels, or -1.
    */
    public void setMinWidth(int min_width)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_min_width(asCPointer(), min_width);
    }

    /**
     * If &#64;reorderable is %TRUE, then the column can be reordered by the end user
     * <br>dragging the header.
     * @param reorderable %TRUE, if the column can be reordered.
    */
    public void setReorderable(boolean reorderable)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_reorderable(asCPointer(), reorderable);
    }

    /**
     * If &#64;resizable is %TRUE, then the user can explicitly resize the column by
     * <br>grabbing the outer edge of the column button.
     * <br>
     * <br>If resizable is %TRUE and
     * <br>sizing mode of the column is %GTK_TREE_VIEW_COLUMN_AUTOSIZE, then the sizing
     * <br>mode is changed to %GTK_TREE_VIEW_COLUMN_GROW_ONLY.
     * @param resizable %TRUE, if the column can be resized
    */
    public void setResizable(boolean resizable)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_resizable(asCPointer(), resizable);
    }

    /**
     * Sets the growth behavior of &#64;tree_column to &#64;type.
     * @param type The `GtkTreeViewColumn`Sizing.
    */
    public void setSizing(int type)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_sizing(asCPointer(), type);
    }

    /**
     * Sets the logical &#64;sort_column_id that this column sorts on when this column
     * <br>is selected for sorting.  Doing so makes the column header clickable.
     * @param sort_column_id The &#64;sort_column_id of the model to sort on.
    */
    public void setSortColumnId(int sort_column_id)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_sort_column_id(asCPointer(), sort_column_id);
    }

    /**
     * Call this function with a &#64;setting of %TRUE to display an arrow in
     * <br>the header button indicating the column is sorted. Call
     * <br>gtk_tree_view_column_set_sort_order() to change the direction of
     * <br>the arrow.
     * @param setting %TRUE to display an indicator that the column is sorted
    */
    public void setSortIndicator(boolean setting)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_sort_indicator(asCPointer(), setting);
    }

    /**
     * Changes the appearance of the sort indicator.
     * <br>
     * <br>This does not actually sort the model.  Use
     * <br>gtk_tree_view_column_set_sort_column_id() if you want automatic sorting
     * <br>support.  This function is primarily for custom sorting behavior, and should
     * <br>be used in conjunction with gtk_tree_sortable_set_sort_column_id() to do
     * <br>that. For custom models, the mechanism will vary.
     * <br>
     * <br>The sort indicator changes direction to indicate normal sort or reverse sort.
     * <br>Note that you must have the sort indicator enabled to see anything when
     * <br>calling this function; see gtk_tree_view_column_set_sort_indicator().
     * @param order sort order that the sort indicator should indicate
    */
    public void setSortOrder(int order)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_sort_order(asCPointer(), order);
    }

    /**
     * Sets the spacing field of &#64;tree_column, which is the number of pixels to
     * <br>place between cell renderers packed into it.
     * @param spacing distance between cell renderers in pixels.
    */
    public void setSpacing(int spacing)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_spacing(asCPointer(), spacing);
    }

    /**
     * Sets the title of the &#64;tree_column.  If a custom widget has been set, then
     * <br>this value is ignored.
     * @param title The title of the &#64;tree_column.
    */
    public void setTitle(@Nonnull ch.bailu.gtk.type.Str title)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_title(asCPointer(), asCPointerNotNull(title));
    }

    /**
     * Sets the title of the &#64;tree_column.  If a custom widget has been set, then
     * <br>this value is ignored.
     * @param title The title of the &#64;tree_column.
    */
    public void setTitle(String title)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_title(asCPointer(), title);
    }

    /**
     * Sets the visibility of &#64;tree_column.
     * @param visible %TRUE if the &#64;tree_column is visible.
    */
    public void setVisible(boolean visible)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_visible(asCPointer(), visible);
    }

    /**
     * Sets the widget in the header to be &#64;widget.  If widget is %NULL, then the
     * <br>header button is set with a `GtkLabel` set to the title of &#64;tree_column.
     * @param widget A child `GtkWidget`
    */
    public void setWidget(@Nullable Widget widget)  {
        JnaTreeViewColumn.INST().gtk_tree_view_column_set_widget(asCPointer(), asCPointer(widget));
    }

    public final static String SIGNAL_ON_CLICKED = "clicked";
    
    /**
     * Connect to signal "clicked".
     * <br>See {@link OnClicked#onClicked} for signal description.
     * <br>Field {@link #SIGNAL_ON_CLICKED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onClicked(OnClicked signal) {
        return connectSignal(SIGNAL_ON_CLICKED, toOnClicked(signal));
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link CellLayout}. Call this to get access to interface functions.
     * @return {@link CellLayout}
    */
    public CellLayout asCellLayout() {
        return new CellLayout(cast());
    }

    public static long getTypeID() { 
        return JnaTreeViewColumn.INST().gtk_tree_view_column_get_type(); 
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
