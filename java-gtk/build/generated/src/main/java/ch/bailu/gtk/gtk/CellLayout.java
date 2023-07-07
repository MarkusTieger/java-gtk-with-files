/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An interface for packing cells
 * <br>
 * <br>`GtkCellLayout` is an interface to be implemented by all objects which
 * <br>want to provide a `GtkTreeViewColumn` like API for packing cells,
 * <br>setting attributes and data funcs.
 * <br>
 * <br>One of the notable features provided by implementations of
 * <br>`GtkCellLayout` are attributes. Attributes let you set the properties
 * <br>in flexible ways. They can just be set to constant values like regular
 * <br>properties. But they can also be mapped to a column of the underlying
 * <br>tree model with gtk_cell_layout_set_attributes(), which means that the value
 * <br>of the attribute can change from cell to cell as they are rendered by
 * <br>the cell renderer. Finally, it is possible to specify a function with
 * <br>gtk_cell_layout_set_cell_data_func() that is called to determine the
 * <br>value of the attribute for each cell that is rendered.
 * <br>
 * <br>&#35; GtkCellLayouts as GtkBuildable
 * <br>
 * <br>Implementations of GtkCellLayout which also implement the GtkBuildable
 * <br>interface (`GtkCellView`, `GtkIconView`, `GtkComboBox`,
 * <br>`GtkEntryCompletion`, `GtkTreeViewColumn`) accept `GtkCellRenderer` objects
 * <br>as `&lt;child&gt;` elements in UI definitions. They support a custom `&lt;attributes&gt;`
 * <br>element for their children, which can contain multiple `&lt;attribute&gt;`
 * <br>elements. Each `&lt;attribute&gt;` element has a name attribute which specifies
 * <br>a property of the cell renderer; the content of the element is the
 * <br>attribute value.
 * <br>
 * <br>This is an example of a UI definition fragment specifying attributes:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkCellView&quot;&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkCellRendererText&quot;/&gt;
 * <br>    &lt;attributes&gt;
 * <br>      &lt;attribute name=&quot;text&quot;&gt;0&lt;/attribute&gt;
 * <br>    &lt;/attributes&gt;
 * <br>  &lt;/child&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>Furthermore for implementations of `GtkCellLayout` that use a `GtkCellArea`
 * <br>to lay out cells (all `GtkCellLayout`s in GTK use a `GtkCellArea`)
 * <br>[cell properties](class.CellArea.html&#35;cell-properties) can also be defined
 * <br>in the format by specifying the custom `&lt;cell-packing&gt;` attribute which can
 * <br>contain multiple `&lt;property&gt;` elements.
 * <br>
 * <br>Here is a UI definition fragment specifying cell properties:
 * <br>
 * <br>```xml
 * <br>&lt;object class=&quot;GtkTreeViewColumn&quot;&gt;
 * <br>  &lt;child&gt;
 * <br>    &lt;object class=&quot;GtkCellRendererText&quot;/&gt;
 * <br>    &lt;cell-packing&gt;
 * <br>      &lt;property name=&quot;align&quot;&gt;True&lt;/property&gt;
 * <br>      &lt;property name=&quot;expand&quot;&gt;False&lt;/property&gt;
 * <br>    &lt;/cell-packing&gt;
 * <br>  &lt;/child&gt;
 * <br>&lt;/object&gt;
 * <br>```
 * <br>
 * <br>&#35; Subclassing GtkCellLayout implementations
 * <br>
 * <br>When subclassing a widget that implements `GtkCellLayout` like
 * <br>`GtkIconView` or `GtkComboBox`, there are some considerations related
 * <br>to the fact that these widgets internally use a `GtkCellArea`.
 * <br>The cell area is exposed as a construct-only property by these
 * <br>widgets. This means that it is possible to e.g. do
 * <br>
 * <br>```c
 * <br>GtkWIdget *combo =
 * <br>  g_object_new (GTK_TYPE_COMBO_BOX, &quot;cell-area&quot;, my_cell_area, NULL);
 * <br>```
 * <br>
 * <br>to use a custom cell area with a combo box. But construct properties
 * <br>are only initialized after instance `init()`
 * <br>functions have run, which means that using functions which rely on
 * <br>the existence of the cell area in your subclass `init()` function will
 * <br>cause the default cell area to be instantiated. In this case, a provided
 * <br>construct property value will be ignored (with a warning, to alert
 * <br>you to the problem).
 * <br>
 * <br>```c
 * <br>static void
 * <br>my_combo_box_init (MyComboBox *b)
 * <br>{
 * <br>  GtkCellRenderer *cell;
 * <br>
 * <br>  cell = gtk_cell_renderer_pixbuf_new ();
 * <br>
 * <br>  // The following call causes the default cell area for combo boxes,
 * <br>  // a GtkCellAreaBox, to be instantiated
 * <br>  gtk_cell_layout_pack_start (GTK_CELL_LAYOUT (b), cell, FALSE);
 * <br>  ...
 * <br>}
 * <br>
 * <br>GtkWidget *
 * <br>my_combo_box_new (GtkCellArea *area)
 * <br>{
 * <br>  // This call is going to cause a warning about area being ignored
 * <br>  return g_object_new (MY_TYPE_COMBO_BOX, &quot;cell-area&quot;, area, NULL);
 * <br>}
 * <br>```
 * <br>
 * <br>If supporting alternative cell areas with your derived widget is
 * <br>not important, then this does not have to concern you. If you want
 * <br>to support alternative cell areas, you can do so by moving the
 * <br>problematic calls out of `init()` and into a `constructor()`
 * <br>for your class.
 * <p><a href="https://docs.gtk.org/gtk4/iface.CellLayout.html">https://docs.gtk.org/gtk4/iface.CellLayout.html</a></p>
*/
public class CellLayout extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellLayout.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCellLayoutDataFunc {
        /**
         * A function which should set the value of &#64;cell_layout’s cell renderer(s)
         * <br>as appropriate.
         * @param cell_layout a `GtkCellLayout`
         * @param cell the cell renderer whose value is to be set
         * @param tree_model the model
         * @param iter a `GtkTreeIter` indicating the row to set the value for
         * @param data user data passed to gtk_cell_layout_set_cell_data_func()
        */
        void onCellLayoutDataFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellLayout cell_layout, @Nonnull CellRenderer cell, @Nonnull TreeModel tree_model, @Nonnull TreeIter iter, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaCellLayout.OnCellLayoutDataFunc toOnCellLayoutDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCellLayoutDataFunc in) {
        JnaCellLayout.OnCellLayoutDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_cell_layout, _cell, _tree_model, _iter, _data) -> in.onCellLayoutDataFunc(__callback, new CellLayout(new PointerContainer(_cell_layout)), new CellRenderer(new PointerContainer(_cell)), new TreeModel(new PointerContainer(_tree_model)), new TreeIter(new PointerContainer(_iter)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
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
    
    private static JnaCellLayout.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaCellLayout.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    public CellLayout(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Adds an attribute mapping to the list in &#64;cell_layout.
     * <br>
     * <br>The &#64;column is the column of the model to get a value from, and the
     * <br>&#64;attribute is the property on &#64;cell to be set from that value. So for
     * <br>example if column 2 of the model contains strings, you could have the
     * <br>“text” attribute of a `GtkCellRendererText` get its values from column 2.
     * <br>In this context &quot;attribute&quot; and &quot;property&quot; are used interchangeably.
     * @param cell a `GtkCellRenderer`
     * @param attribute a property on the renderer
     * @param column the column position on the model to get the attribute from
    */
    public void addAttribute(@Nonnull CellRenderer cell, @Nonnull ch.bailu.gtk.type.Str attribute, int column)  {
        JnaCellLayout.INST().gtk_cell_layout_add_attribute(asCPointer(), asCPointerNotNull(cell), asCPointerNotNull(attribute), column);
    }

    /**
     * Adds an attribute mapping to the list in &#64;cell_layout.
     * <br>
     * <br>The &#64;column is the column of the model to get a value from, and the
     * <br>&#64;attribute is the property on &#64;cell to be set from that value. So for
     * <br>example if column 2 of the model contains strings, you could have the
     * <br>“text” attribute of a `GtkCellRendererText` get its values from column 2.
     * <br>In this context &quot;attribute&quot; and &quot;property&quot; are used interchangeably.
     * @param cell a `GtkCellRenderer`
     * @param attribute a property on the renderer
     * @param column the column position on the model to get the attribute from
    */
    public void addAttribute(@Nonnull CellRenderer cell, String attribute, int column)  {
        JnaCellLayout.INST().gtk_cell_layout_add_attribute(asCPointer(), asCPointerNotNull(cell), attribute, column);
    }

    /**
     * Unsets all the mappings on all renderers on &#64;cell_layout and
     * <br>removes all renderers from &#64;cell_layout.
    */
    public void clear()  {
        JnaCellLayout.INST().gtk_cell_layout_clear(asCPointer());
    }

    /**
     * Clears all existing attributes previously set with
     * <br>gtk_cell_layout_set_attributes().
     * @param cell a `GtkCellRenderer` to clear the attribute mapping on
    */
    public void clearAttributes(@Nonnull CellRenderer cell)  {
        JnaCellLayout.INST().gtk_cell_layout_clear_attributes(asCPointer(), asCPointerNotNull(cell));
    }

    /**
     * Returns the underlying `GtkCellArea` which might be &#64;cell_layout
     * <br>if called on a `GtkCellArea` or might be %NULL if no `GtkCellArea`
     * <br>is used by &#64;cell_layout.
     * @return the cell area used by &#64;cell_layout
    */
    public CellArea getArea()  {
        return new CellArea(new PointerContainer(JnaCellLayout.INST().gtk_cell_layout_get_area(asCPointer())));
    }

    /**
     * Returns the cell renderers which have been added to &#64;cell_layout.
     * @return    a list of cell renderers. The list, but not the renderers has   been newly allocated and should be freed with g_list_free()   when no longer needed.
    */
    public ch.bailu.gtk.glib.List getCells()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaCellLayout.INST().gtk_cell_layout_get_cells(asCPointer())));
    }

    /**
     * Adds the &#64;cell to the end of &#64;cell_layout. If &#64;expand is %FALSE, then the
     * <br>&#64;cell is allocated no more space than it needs. Any unused space is
     * <br>divided evenly between cells for which &#64;expand is %TRUE.
     * <br>
     * <br>Note that reusing the same cell renderer is not supported.
     * @param cell a `GtkCellRenderer`
     * @param expand %TRUE if &#64;cell is to be given extra space allocated to &#64;cell_layout
    */
    public void packEnd(@Nonnull CellRenderer cell, boolean expand)  {
        JnaCellLayout.INST().gtk_cell_layout_pack_end(asCPointer(), asCPointerNotNull(cell), expand);
    }

    /**
     * Packs the &#64;cell into the beginning of &#64;cell_layout. If &#64;expand is %FALSE,
     * <br>then the &#64;cell is allocated no more space than it needs. Any unused space
     * <br>is divided evenly between cells for which &#64;expand is %TRUE.
     * <br>
     * <br>Note that reusing the same cell renderer is not supported.
     * @param cell a `GtkCellRenderer`
     * @param expand %TRUE if &#64;cell is to be given extra space allocated to &#64;cell_layout
    */
    public void packStart(@Nonnull CellRenderer cell, boolean expand)  {
        JnaCellLayout.INST().gtk_cell_layout_pack_start(asCPointer(), asCPointerNotNull(cell), expand);
    }

    /**
     * Re-inserts &#64;cell at &#64;position.
     * <br>
     * <br>Note that &#64;cell has already to be packed into &#64;cell_layout
     * <br>for this to function properly.
     * @param cell a `GtkCellRenderer` to reorder
     * @param position new position to insert &#64;cell at
    */
    public void reorder(@Nonnull CellRenderer cell, int position)  {
        JnaCellLayout.INST().gtk_cell_layout_reorder(asCPointer(), asCPointerNotNull(cell), position);
    }

    /**
     * Sets the attributes in the parameter list as the attributes
     * <br>of &#64;cell_layout.
     * <br>
     * <br>See [method&#64;Gtk.CellLayout.add_attribute] for more details.
     * <br>
     * <br>The attributes should be in attribute/column order, as in
     * <br>gtk_cell_layout_add_attribute(). All existing attributes are
     * <br>removed, and replaced with the new attributes.
     * @param cell a `GtkCellRenderer`
     * @param _elipse a %NULL-terminated list of attributes
    */
    public void setAttributes(@Nonnull CellRenderer cell, java.lang.Object... _elipse)  {
        JnaCellLayout.INST().gtk_cell_layout_set_attributes(asCPointer(), asCPointerNotNull(cell), _elipse);
    }

    /**
     * Sets the `GtkCellLayout`DataFunc to use for &#64;cell_layout.
     * <br>
     * <br>This function is used instead of the standard attributes mapping
     * <br>for setting the column value, and should set the value of &#64;cell_layout’s
     * <br>cell renderer(s) as appropriate.
     * <br>
     * <br>&#64;func may be %NULL to remove a previously set function.
     * @param cell a `GtkCellRenderer`
     * @param func the `GtkCellLayout`DataFunc to use
     * @param func_data user data for &#64;func
     * @param destroy destroy notify for &#64;func_data
    */
    public void setCellDataFunc(@Nonnull CellRenderer cell, OnCellLayoutDataFunc func, @Nullable ch.bailu.gtk.type.Pointer func_data, OnDestroyNotify destroy)  {
        JnaCellLayout.INST().gtk_cell_layout_set_cell_data_func(asCPointer(), asCPointerNotNull(cell), toOnCellLayoutDataFunc(this, "setCellDataFunc", func), asCPointer(func_data), toOnDestroyNotify(this, "setCellDataFunc", destroy));
    }

    public static long getTypeID() { 
        return JnaCellLayout.INST().gtk_cell_layout_get_type(); 
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
