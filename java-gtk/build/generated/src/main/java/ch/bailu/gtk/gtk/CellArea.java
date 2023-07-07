/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An abstract class for laying out `GtkCellRenderer`s
 * <br>
 * <br>The `GtkCellArea` is an abstract class for [iface&#64;Gtk.CellLayout]
 * <br>widgets (also referred to as &quot;layouting widgets&quot;) to interface with
 * <br>an arbitrary number of [class&#64;Gtk.CellRenderer]s and interact with the user
 * <br>for a given [iface&#64;Gtk.TreeModel] row.
 * <br>
 * <br>The cell area handles events, focus navigation, drawing and
 * <br>size requests and allocations for a given row of data.
 * <br>
 * <br>Usually users dont have to interact with the `GtkCellArea` directly
 * <br>unless they are implementing a cell-layouting widget themselves.
 * <br>
 * <br>&#35; Requesting area sizes
 * <br>
 * <br>As outlined in
 * <br>[GtkWidget’s geometry management section](class.Widget.html&#35;height-for-width-geometry-management),
 * <br>GTK uses a height-for-width
 * <br>geometry management system to compute the sizes of widgets and user
 * <br>interfaces. `GtkCellArea` uses the same semantics to calculate the
 * <br>size of an area for an arbitrary number of `GtkTreeModel` rows.
 * <br>
 * <br>When requesting the size of a cell area one needs to calculate
 * <br>the size for a handful of rows, and this will be done differently by
 * <br>different layouting widgets. For instance a [class&#64;Gtk.TreeViewColumn]
 * <br>always lines up the areas from top to bottom while a [class&#64;Gtk.IconView]
 * <br>on the other hand might enforce that all areas received the same
 * <br>width and wrap the areas around, requesting height for more cell
 * <br>areas when allocated less width.
 * <br>
 * <br>It’s also important for areas to maintain some cell
 * <br>alignments with areas rendered for adjacent rows (cells can
 * <br>appear “columnized” inside an area even when the size of
 * <br>cells are different in each row). For this reason the `GtkCellArea`
 * <br>uses a [class&#64;Gtk.CellAreaContext] object to store the alignments
 * <br>and sizes along the way (as well as the overall largest minimum
 * <br>and natural size for all the rows which have been calculated
 * <br>with the said context).
 * <br>
 * <br>The [class&#64;Gtk.CellAreaContext] is an opaque object specific to the
 * <br>`GtkCellArea` which created it (see [method&#64;Gtk.CellArea.create_context]).
 * <br>
 * <br>The owning cell-layouting widget can create as many contexts as
 * <br>it wishes to calculate sizes of rows which should receive the
 * <br>same size in at least one orientation (horizontally or vertically),
 * <br>However, it’s important that the same [class&#64;Gtk.CellAreaContext] which
 * <br>was used to request the sizes for a given `GtkTreeModel` row be
 * <br>used when rendering or processing events for that row.
 * <br>
 * <br>In order to request the width of all the rows at the root level
 * <br>of a `GtkTreeModel` one would do the following:
 * <br>
 * <br>```c
 * <br>GtkTreeIter iter;
 * <br>int minimum_width;
 * <br>int natural_width;
 * <br>
 * <br>valid = gtk_tree_model_get_iter_first (model, &amp;iter);
 * <br>while (valid)
 * <br>  {
 * <br>    gtk_cell_area_apply_attributes (area, model, &amp;iter, FALSE, FALSE);
 * <br>    gtk_cell_area_get_preferred_width (area, context, widget, NULL, NULL);
 * <br>
 * <br>    valid = gtk_tree_model_iter_next (model, &amp;iter);
 * <br>  }
 * <br>
 * <br>gtk_cell_area_context_get_preferred_width (context, &amp;minimum_width, &amp;natural_width);
 * <br>```
 * <br>
 * <br>Note that in this example it’s not important to observe the
 * <br>returned minimum and natural width of the area for each row
 * <br>unless the cell-layouting object is actually interested in the
 * <br>widths of individual rows. The overall width is however stored
 * <br>in the accompanying `GtkCellAreaContext` object and can be consulted
 * <br>at any time.
 * <br>
 * <br>This can be useful since `GtkCellLayout` widgets usually have to
 * <br>support requesting and rendering rows in treemodels with an
 * <br>exceedingly large amount of rows. The `GtkCellLayout` widget in
 * <br>that case would calculate the required width of the rows in an
 * <br>idle or timeout source (see [func&#64;GLib.timeout_add]) and when the widget
 * <br>is requested its actual width in [vfunc&#64;Gtk.Widget.measure]
 * <br>it can simply consult the width accumulated so far in the
 * <br>`GtkCellAreaContext` object.
 * <br>
 * <br>A simple example where rows are rendered from top to bottom and
 * <br>take up the full width of the layouting widget would look like:
 * <br>
 * <br>```c
 * <br>static void
 * <br>foo_get_preferred_width (GtkWidget *widget,
 * <br>                         int       *minimum_size,
 * <br>                         int       *natural_size)
 * <br>{
 * <br>  Foo *self = FOO (widget);
 * <br>  FooPrivate *priv = foo_get_instance_private (self);
 * <br>
 * <br>  foo_ensure_at_least_one_handfull_of_rows_have_been_requested (self);
 * <br>
 * <br>  gtk_cell_area_context_get_preferred_width (priv-&gt;context, minimum_size, natural_size);
 * <br>}
 * <br>```
 * <br>
 * <br>In the above example the `Foo` widget has to make sure that some
 * <br>row sizes have been calculated (the amount of rows that `Foo` judged
 * <br>was appropriate to request space for in a single timeout iteration)
 * <br>before simply returning the amount of space required by the area via
 * <br>the `GtkCellAreaContext`.
 * <br>
 * <br>Requesting the height for width (or width for height) of an area is
 * <br>a similar task except in this case the `GtkCellAreaContext` does not
 * <br>store the data (actually, it does not know how much space the layouting
 * <br>widget plans to allocate it for every row. It’s up to the layouting
 * <br>widget to render each row of data with the appropriate height and
 * <br>width which was requested by the `GtkCellArea`).
 * <br>
 * <br>In order to request the height for width of all the rows at the
 * <br>root level of a `GtkTreeModel` one would do the following:
 * <br>
 * <br>```c
 * <br>GtkTreeIter iter;
 * <br>int minimum_height;
 * <br>int natural_height;
 * <br>int full_minimum_height = 0;
 * <br>int full_natural_height = 0;
 * <br>
 * <br>valid = gtk_tree_model_get_iter_first (model, &amp;iter);
 * <br>while (valid)
 * <br>  {
 * <br>    gtk_cell_area_apply_attributes (area, model, &amp;iter, FALSE, FALSE);
 * <br>    gtk_cell_area_get_preferred_height_for_width (area, context, widget,
 * <br>                                                  width, &amp;minimum_height, &amp;natural_height);
 * <br>
 * <br>    if (width_is_for_allocation)
 * <br>       cache_row_height (&amp;iter, minimum_height, natural_height);
 * <br>
 * <br>    full_minimum_height += minimum_height;
 * <br>    full_natural_height += natural_height;
 * <br>
 * <br>    valid = gtk_tree_model_iter_next (model, &amp;iter);
 * <br>  }
 * <br>```
 * <br>
 * <br>Note that in the above example we would need to cache the heights
 * <br>returned for each row so that we would know what sizes to render the
 * <br>areas for each row. However we would only want to really cache the
 * <br>heights if the request is intended for the layouting widgets real
 * <br>allocation.
 * <br>
 * <br>In some cases the layouting widget is requested the height for an
 * <br>arbitrary for_width, this is a special case for layouting widgets
 * <br>who need to request size for tens of thousands  of rows. For this
 * <br>case it’s only important that the layouting widget calculate
 * <br>one reasonably sized chunk of rows and return that height
 * <br>synchronously. The reasoning here is that any layouting widget is
 * <br>at least capable of synchronously calculating enough height to fill
 * <br>the screen height (or scrolled window height) in response to a single
 * <br>call to [vfunc&#64;Gtk.Widget.measure]. Returning
 * <br>a perfect height for width that is larger than the screen area is
 * <br>inconsequential since after the layouting receives an allocation
 * <br>from a scrolled window it simply continues to drive the scrollbar
 * <br>values while more and more height is required for the row heights
 * <br>that are calculated in the background.
 * <br>
 * <br>&#35; Rendering Areas
 * <br>
 * <br>Once area sizes have been acquired at least for the rows in the
 * <br>visible area of the layouting widget they can be rendered at
 * <br>[vfunc&#64;Gtk.Widget.snapshot] time.
 * <br>
 * <br>A crude example of how to render all the rows at the root level
 * <br>runs as follows:
 * <br>
 * <br>```c
 * <br>GtkAllocation allocation;
 * <br>GdkRectangle cell_area = { 0, };
 * <br>GtkTreeIter iter;
 * <br>int minimum_width;
 * <br>int natural_width;
 * <br>
 * <br>gtk_widget_get_allocation (widget, &amp;allocation);
 * <br>cell_area.width = allocation.width;
 * <br>
 * <br>valid = gtk_tree_model_get_iter_first (model, &amp;iter);
 * <br>while (valid)
 * <br>  {
 * <br>    cell_area.height = get_cached_height_for_row (&amp;iter);
 * <br>
 * <br>    gtk_cell_area_apply_attributes (area, model, &amp;iter, FALSE, FALSE);
 * <br>    gtk_cell_area_render (area, context, widget, cr,
 * <br>                          &amp;cell_area, &amp;cell_area, state_flags, FALSE);
 * <br>
 * <br>    cell_area.y += cell_area.height;
 * <br>
 * <br>    valid = gtk_tree_model_iter_next (model, &amp;iter);
 * <br>  }
 * <br>```
 * <br>
 * <br>Note that the cached height in this example really depends on how
 * <br>the layouting widget works. The layouting widget might decide to
 * <br>give every row its minimum or natural height or, if the model content
 * <br>is expected to fit inside the layouting widget without scrolling, it
 * <br>would make sense to calculate the allocation for each row at
 * <br>the time the widget is allocated using [func&#64;Gtk.distribute_natural_allocation].
 * <br>
 * <br>&#35; Handling Events and Driving Keyboard Focus
 * <br>
 * <br>Passing events to the area is as simple as handling events on any
 * <br>normal widget and then passing them to the [method&#64;Gtk.CellArea.event]
 * <br>API as they come in. Usually `GtkCellArea` is only interested in
 * <br>button events, however some customized derived areas can be implemented
 * <br>who are interested in handling other events. Handling an event can
 * <br>trigger the [`signal&#64;Gtk.CellArea::focus-changed`] signal to fire; as well
 * <br>as [`signal&#64;GtkCellArea::add-editable`] in the case that an editable cell
 * <br>was clicked and needs to start editing. You can call
 * <br>[method&#64;Gtk.CellArea.stop_editing] at any time to cancel any cell editing
 * <br>that is currently in progress.
 * <br>
 * <br>The `GtkCellArea` drives keyboard focus from cell to cell in a way
 * <br>similar to `GtkWidget`. For layouting widgets that support giving
 * <br>focus to cells it’s important to remember to pass `GTK_CELL_RENDERER_FOCUSED`
 * <br>to the area functions for the row that has focus and to tell the
 * <br>area to paint the focus at render time.
 * <br>
 * <br>Layouting widgets that accept focus on cells should implement the
 * <br>[vfunc&#64;Gtk.Widget.focus] virtual method. The layouting widget is always
 * <br>responsible for knowing where `GtkTreeModel` rows are rendered inside
 * <br>the widget, so at [vfunc&#64;Gtk.Widget.focus] time the layouting widget
 * <br>should use the `GtkCellArea` methods to navigate focus inside the area
 * <br>and then observe the [enum&#64;Gtk.DirectionType] to pass the focus to adjacent
 * <br>rows and areas.
 * <br>
 * <br>A basic example of how the [vfunc&#64;Gtk.Widget.focus] virtual method
 * <br>should be implemented:
 * <br>
 * <br>```
 * <br>static gboolean
 * <br>foo_focus (GtkWidget       *widget,
 * <br>           GtkDirectionType direction)
 * <br>{
 * <br>  Foo *self = FOO (widget);
 * <br>  FooPrivate *priv = foo_get_instance_private (self);
 * <br>  int focus_row = priv-&gt;focus_row;
 * <br>  gboolean have_focus = FALSE;
 * <br>
 * <br>  if (!gtk_widget_has_focus (widget))
 * <br>    gtk_widget_grab_focus (widget);
 * <br>
 * <br>  valid = gtk_tree_model_iter_nth_child (priv-&gt;model, &amp;iter, NULL, priv-&gt;focus_row);
 * <br>  while (valid)
 * <br>    {
 * <br>      gtk_cell_area_apply_attributes (priv-&gt;area, priv-&gt;model, &amp;iter, FALSE, FALSE);
 * <br>
 * <br>      if (gtk_cell_area_focus (priv-&gt;area, direction))
 * <br>        {
 * <br>           priv-&gt;focus_row = focus_row;
 * <br>           have_focus = TRUE;
 * <br>           break;
 * <br>        }
 * <br>      else
 * <br>        {
 * <br>          if (direction == GTK_DIR_RIGHT ||
 * <br>              direction == GTK_DIR_LEFT)
 * <br>            break;
 * <br>          else if (direction == GTK_DIR_UP ||
 * <br>                   direction == GTK_DIR_TAB_BACKWARD)
 * <br>           {
 * <br>              if (focus_row == 0)
 * <br>                break;
 * <br>              else
 * <br>               {
 * <br>                  focus_row--;
 * <br>                  valid = gtk_tree_model_iter_nth_child (priv-&gt;model, &amp;iter, NULL, focus_row);
 * <br>               }
 * <br>            }
 * <br>          else
 * <br>            {
 * <br>              if (focus_row == last_row)
 * <br>                break;
 * <br>              else
 * <br>                {
 * <br>                  focus_row++;
 * <br>                  valid = gtk_tree_model_iter_next (priv-&gt;model, &amp;iter);
 * <br>                }
 * <br>            }
 * <br>        }
 * <br>    }
 * <br>    return have_focus;
 * <br>}
 * <br>```
 * <br>
 * <br>Note that the layouting widget is responsible for matching the
 * <br>`GtkDirectionType` values to the way it lays out its cells.
 * <br>
 * <br>&#35; Cell Properties
 * <br>
 * <br>The `GtkCellArea` introduces cell properties for `GtkCellRenderer`s.
 * <br>This provides some general interfaces for defining the relationship
 * <br>cell areas have with their cells. For instance in a [class&#64;Gtk.CellAreaBox]
 * <br>a cell might “expand” and receive extra space when the area is allocated
 * <br>more than its full natural request, or a cell might be configured to “align”
 * <br>with adjacent rows which were requested and rendered with the same
 * <br>`GtkCellAreaContext`.
 * <br>
 * <br>Use [method&#64;Gtk.CellAreaClass.install_cell_property] to install cell
 * <br>properties for a cell area class and [method&#64;Gtk.CellAreaClass.find_cell_property]
 * <br>or [method&#64;Gtk.CellAreaClass.list_cell_properties] to get information about
 * <br>existing cell properties.
 * <br>
 * <br>To set the value of a cell property, use [method&#64;Gtk.CellArea.cell_set_property],
 * <br>[method&#64;Gtk.CellArea.cell_set] or [method&#64;Gtk.CellArea.cell_set_valist]. To obtain
 * <br>the value of a cell property, use [method&#64;Gtk.CellArea.cell_get_property]
 * <br>[method&#64;Gtk.CellArea.cell_get] or [method&#64;Gtk.CellArea.cell_get_valist].
 * <p><a href="https://docs.gtk.org/gtk4/class.CellArea.html">https://docs.gtk.org/gtk4/class.CellArea.html</a></p>
*/
public class CellArea extends ch.bailu.gtk.gobject.InitiallyUnowned {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellArea.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCellCallback {
        /**
         * The type of the callback functions used for iterating over
         * <br>the cell renderers of a `GtkCellArea`, see gtk_cell_area_foreach().
         * @param renderer the cell renderer to operate on
         * @param data user-supplied data
         * @return %TRUE to stop iterating over cells.
        */
        boolean onCellCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRenderer renderer, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaCellArea.OnCellCallback toOnCellCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnCellCallback in) {
        JnaCellArea.OnCellCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_renderer, _data) -> in.onCellCallback(__callback, new CellRenderer(new PointerContainer(_renderer)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCellAllocCallback {
        /**
         * The type of the callback functions used for iterating over the
         * <br>cell renderers and their allocated areas inside a `GtkCellArea`,
         * <br>see gtk_cell_area_foreach_alloc().
         * @param renderer the cell renderer to operate on
         * @param cell_area the area allocated to &#64;renderer inside the rectangle   provided to gtk_cell_area_foreach_alloc().
         * @param cell_background the background area for &#64;renderer inside the   background area provided to gtk_cell_area_foreach_alloc().
         * @param data user-supplied data
         * @return %TRUE to stop iterating over cells.
        */
        boolean onCellAllocCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull CellRenderer renderer, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_background, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaCellArea.OnCellAllocCallback toOnCellAllocCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnCellAllocCallback in) {
        JnaCellArea.OnCellAllocCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_renderer, _cell_area, _cell_background, _data) -> in.onCellAllocCallback(__callback, new CellRenderer(new PointerContainer(_renderer)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_cell_area)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_cell_background)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAddEditable {
        /**
         * Indicates that editing has started on &#64;renderer and that &#64;editable
         * <br>should be added to the owning cell-layouting widget at &#64;cell_area.
         * @param renderer the `GtkCellRenderer` that started the edited
         * @param editable the `GtkCellEditable` widget to add
         * @param cell_area the `GtkWidget` relative `GdkRectangle` coordinates             where &#64;editable should be added
         * @param path the `GtkTreePath` string this edit was initiated for
        */
        void onAddEditable(@Nonnull CellRenderer renderer, @Nonnull CellEditable editable, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, @Nonnull ch.bailu.gtk.type.Str path);
    }
    
    private static com.sun.jna.Callback toOnAddEditable(OnAddEditable in) {
        return (in == null) ? null: (JnaCellArea.OnAddEditable) (__self, _renderer, _editable, _cell_area, _path, __data) -> in.onAddEditable(new CellRenderer(new PointerContainer(_renderer)), new CellEditable(new PointerContainer(_editable)), new ch.bailu.gtk.gdk.Rectangle(new PointerContainer(_cell_area)), new ch.bailu.gtk.type.Str(new PointerContainer(_path)));
    }

    @FunctionalInterface
    public interface OnApplyAttributes {
        /**
         * This signal is emitted whenever applying attributes to &#64;area from &#64;model
         * @param model the `GtkTreeModel` to apply the attributes from
         * @param iter the `GtkTreeIter` indicating which row to apply the attributes of
         * @param is_expander whether the view shows children for this row
         * @param is_expanded whether the view is currently showing the children of this row
        */
        void onApplyAttributes(@Nonnull TreeModel model, @Nonnull TreeIter iter, boolean is_expander, boolean is_expanded);
    }
    
    private static com.sun.jna.Callback toOnApplyAttributes(OnApplyAttributes in) {
        return (in == null) ? null: (JnaCellArea.OnApplyAttributes) (__self, _model, _iter, _is_expander, _is_expanded, __data) -> in.onApplyAttributes(new TreeModel(new PointerContainer(_model)), new TreeIter(new PointerContainer(_iter)), _is_expander, _is_expanded);
    }

    @FunctionalInterface
    public interface OnFocusChanged {
        /**
         * Indicates that focus changed on this &#64;area. This signal
         * <br>is emitted either as a result of focus handling or event
         * <br>handling.
         * <br>
         * <br>It's possible that the signal is emitted even if the
         * <br>currently focused renderer did not change, this is
         * <br>because focus may change to the same renderer in the
         * <br>same cell area for a different row of data.
         * @param renderer the `GtkCellRenderer` that has focus
         * @param path the current `GtkTreePath` string set for &#64;area
        */
        void onFocusChanged(@Nonnull CellRenderer renderer, @Nonnull ch.bailu.gtk.type.Str path);
    }
    
    private static com.sun.jna.Callback toOnFocusChanged(OnFocusChanged in) {
        return (in == null) ? null: (JnaCellArea.OnFocusChanged) (__self, _renderer, _path, __data) -> in.onFocusChanged(new CellRenderer(new PointerContainer(_renderer)), new ch.bailu.gtk.type.Str(new PointerContainer(_path)));
    }

    @FunctionalInterface
    public interface OnRemoveEditable {
        /**
         * Indicates that editing finished on &#64;renderer and that &#64;editable
         * <br>should be removed from the owning cell-layouting widget.
         * @param renderer the `GtkCellRenderer` that finished editeding
         * @param editable the `GtkCellEditable` widget to remove
        */
        void onRemoveEditable(@Nonnull CellRenderer renderer, @Nonnull CellEditable editable);
    }
    
    private static com.sun.jna.Callback toOnRemoveEditable(OnRemoveEditable in) {
        return (in == null) ? null: (JnaCellArea.OnRemoveEditable) (__self, _renderer, _editable, __data) -> in.onRemoveEditable(new CellRenderer(new PointerContainer(_renderer)), new CellEditable(new PointerContainer(_editable)));
    }

    public CellArea(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Activates &#64;area, usually by activating the currently focused
     * <br>cell, however some subclasses which embed widgets in the area
     * <br>can also activate a widget if it currently has the focus.
     * @param context the `GtkCellArea`Context in context with the current row data
     * @param widget the `GtkWidget` that &#64;area is rendering on
     * @param cell_area the size and location of &#64;area relative to &#64;widget’s allocation
     * @param flags the `GtkCellRenderer`State flags for &#64;area for this row of data.
     * @param edit_only if %TRUE then only cell renderers that are %GTK_CELL_RENDERER_MODE_EDITABLE             will be activated.
     * @return Whether &#64;area was successfully activated.
    */
    public boolean activate(@Nonnull CellAreaContext context, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags, boolean edit_only)  {
        return JnaCellArea.INST().gtk_cell_area_activate(asCPointer(), asCPointerNotNull(context), asCPointerNotNull(widget), asCPointerNotNull(cell_area), flags, edit_only);
    }

    /**
     * This is used by `GtkCellArea` subclasses when handling events
     * <br>to activate cells, the base `GtkCellArea` class activates cells
     * <br>for keyboard events for free in its own GtkCellArea-&gt;activate()
     * <br>implementation.
     * @param widget the `GtkWidget` that &#64;area is rendering onto
     * @param renderer the `GtkCellRenderer` in &#64;area to activate
     * @param event the `GdkEvent` for which cell activation should occur
     * @param cell_area the `GdkRectangle` in &#64;widget relative coordinates             of &#64;renderer for the current row.
     * @param flags the `GtkCellRenderer`State for &#64;renderer
     * @return whether cell activation was successful
    */
    public boolean activateCell(@Nonnull Widget widget, @Nonnull CellRenderer renderer, @Nonnull ch.bailu.gtk.gdk.Event event, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags)  {
        return JnaCellArea.INST().gtk_cell_area_activate_cell(asCPointer(), asCPointerNotNull(widget), asCPointerNotNull(renderer), asCPointerNotNull(event), asCPointerNotNull(cell_area), flags);
    }

    /**
     * Adds &#64;renderer to &#64;area with the default child cell properties.
     * @param renderer the `GtkCellRenderer` to add to &#64;area
    */
    public void add(@Nonnull CellRenderer renderer)  {
        JnaCellArea.INST().gtk_cell_area_add(asCPointer(), asCPointerNotNull(renderer));
    }

    /**
     * Adds &#64;sibling to &#64;renderer’s focusable area, focus will be drawn
     * <br>around &#64;renderer and all of its siblings if &#64;renderer can
     * <br>focus for a given row.
     * <br>
     * <br>Events handled by focus siblings can also activate the given
     * <br>focusable &#64;renderer.
     * @param renderer the `GtkCellRenderer` expected to have focus
     * @param sibling the `GtkCellRenderer` to add to &#64;renderer’s focus area
    */
    public void addFocusSibling(@Nonnull CellRenderer renderer, @Nonnull CellRenderer sibling)  {
        JnaCellArea.INST().gtk_cell_area_add_focus_sibling(asCPointer(), asCPointerNotNull(renderer), asCPointerNotNull(sibling));
    }

    /**
     * Adds &#64;renderer to &#64;area, setting cell properties at the same time.
     * <br>See gtk_cell_area_add() and gtk_cell_area_cell_set() for more details.
     * @param renderer a `GtkCellRenderer` to be placed inside &#64;area
     * @param first_prop_name the name of the first cell property to set
     * @param _elipse a %NULL-terminated list of property names and values, starting     with &#64;first_prop_name
    */
    public void addWithProperties(@Nonnull CellRenderer renderer, @Nonnull ch.bailu.gtk.type.Str first_prop_name, java.lang.Object... _elipse)  {
        JnaCellArea.INST().gtk_cell_area_add_with_properties(asCPointer(), asCPointerNotNull(renderer), asCPointerNotNull(first_prop_name), _elipse);
    }

    /**
     * Adds &#64;renderer to &#64;area, setting cell properties at the same time.
     * <br>See gtk_cell_area_add() and gtk_cell_area_cell_set() for more details.
     * @param renderer a `GtkCellRenderer` to be placed inside &#64;area
     * @param first_prop_name the name of the first cell property to set
     * @param _elipse a %NULL-terminated list of property names and values, starting     with &#64;first_prop_name
    */
    public void addWithProperties(@Nonnull CellRenderer renderer, String first_prop_name, java.lang.Object... _elipse)  {
        JnaCellArea.INST().gtk_cell_area_add_with_properties(asCPointer(), asCPointerNotNull(renderer), first_prop_name, _elipse);
    }

    /**
     * Applies any connected attributes to the renderers in
     * <br>&#64;area by pulling the values from &#64;tree_model.
     * @param tree_model the `GtkTreeModel` to pull values from
     * @param iter the `GtkTreeIter` in &#64;tree_model to apply values for
     * @param is_expander whether &#64;iter has children
     * @param is_expanded whether &#64;iter is expanded in the view and               children are visible
    */
    public void applyAttributes(@Nonnull TreeModel tree_model, @Nonnull TreeIter iter, boolean is_expander, boolean is_expanded)  {
        JnaCellArea.INST().gtk_cell_area_apply_attributes(asCPointer(), asCPointerNotNull(tree_model), asCPointerNotNull(iter), is_expander, is_expanded);
    }

    /**
     * Connects an &#64;attribute to apply values from &#64;column for the
     * <br>`GtkTreeModel` in use.
     * @param renderer the `GtkCellRenderer` to connect an attribute for
     * @param attribute the attribute name
     * @param column the `GtkTreeModel` column to fetch attribute values from
    */
    public void attributeConnect(@Nonnull CellRenderer renderer, @Nonnull ch.bailu.gtk.type.Str attribute, int column)  {
        JnaCellArea.INST().gtk_cell_area_attribute_connect(asCPointer(), asCPointerNotNull(renderer), asCPointerNotNull(attribute), column);
    }

    /**
     * Connects an &#64;attribute to apply values from &#64;column for the
     * <br>`GtkTreeModel` in use.
     * @param renderer the `GtkCellRenderer` to connect an attribute for
     * @param attribute the attribute name
     * @param column the `GtkTreeModel` column to fetch attribute values from
    */
    public void attributeConnect(@Nonnull CellRenderer renderer, String attribute, int column)  {
        JnaCellArea.INST().gtk_cell_area_attribute_connect(asCPointer(), asCPointerNotNull(renderer), attribute, column);
    }

    /**
     * Disconnects &#64;attribute for the &#64;renderer in &#64;area so that
     * <br>attribute will no longer be updated with values from the
     * <br>model.
     * @param renderer the `GtkCellRenderer` to disconnect an attribute for
     * @param attribute the attribute name
    */
    public void attributeDisconnect(@Nonnull CellRenderer renderer, @Nonnull ch.bailu.gtk.type.Str attribute)  {
        JnaCellArea.INST().gtk_cell_area_attribute_disconnect(asCPointer(), asCPointerNotNull(renderer), asCPointerNotNull(attribute));
    }

    /**
     * Disconnects &#64;attribute for the &#64;renderer in &#64;area so that
     * <br>attribute will no longer be updated with values from the
     * <br>model.
     * @param renderer the `GtkCellRenderer` to disconnect an attribute for
     * @param attribute the attribute name
    */
    public void attributeDisconnect(@Nonnull CellRenderer renderer, String attribute)  {
        JnaCellArea.INST().gtk_cell_area_attribute_disconnect(asCPointer(), asCPointerNotNull(renderer), attribute);
    }

    /**
     * Returns the model column that an attribute has been mapped to,
     * <br>or -1 if the attribute is not mapped.
     * @param renderer a `GtkCellRenderer`
     * @param attribute an attribute on the renderer
     * @return the model column, or -1
    */
    public int attributeGetColumn(@Nonnull CellRenderer renderer, @Nonnull ch.bailu.gtk.type.Str attribute)  {
        return JnaCellArea.INST().gtk_cell_area_attribute_get_column(asCPointer(), asCPointerNotNull(renderer), asCPointerNotNull(attribute));
    }

    /**
     * Returns the model column that an attribute has been mapped to,
     * <br>or -1 if the attribute is not mapped.
     * @param renderer a `GtkCellRenderer`
     * @param attribute an attribute on the renderer
     * @return the model column, or -1
    */
    public int attributeGetColumn(@Nonnull CellRenderer renderer, String attribute)  {
        return JnaCellArea.INST().gtk_cell_area_attribute_get_column(asCPointer(), asCPointerNotNull(renderer), attribute);
    }

    /**
     * Gets the values of one or more cell properties for &#64;renderer in &#64;area.
     * @param renderer a `GtkCellRenderer` which is inside &#64;area
     * @param first_prop_name the name of the first cell property to get
     * @param _elipse return location for the first cell property, followed     optionally by more name/return location pairs, followed by %NULL
    */
    public void cellGet(@Nonnull CellRenderer renderer, @Nonnull ch.bailu.gtk.type.Str first_prop_name, java.lang.Object... _elipse)  {
        JnaCellArea.INST().gtk_cell_area_cell_get(asCPointer(), asCPointerNotNull(renderer), asCPointerNotNull(first_prop_name), _elipse);
    }

    /**
     * Gets the values of one or more cell properties for &#64;renderer in &#64;area.
     * @param renderer a `GtkCellRenderer` which is inside &#64;area
     * @param first_prop_name the name of the first cell property to get
     * @param _elipse return location for the first cell property, followed     optionally by more name/return location pairs, followed by %NULL
    */
    public void cellGet(@Nonnull CellRenderer renderer, String first_prop_name, java.lang.Object... _elipse)  {
        JnaCellArea.INST().gtk_cell_area_cell_get(asCPointer(), asCPointerNotNull(renderer), first_prop_name, _elipse);
    }

    /**
     * Gets the value of a cell property for &#64;renderer in &#64;area.
     * @param renderer a `GtkCellRenderer` inside &#64;area
     * @param property_name the name of the property to get
     * @param value a location to return the value
    */
    public void cellGetProperty(@Nonnull CellRenderer renderer, @Nonnull ch.bailu.gtk.type.Str property_name, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        JnaCellArea.INST().gtk_cell_area_cell_get_property(asCPointer(), asCPointerNotNull(renderer), asCPointerNotNull(property_name), asCPointerNotNull(value));
    }

    /**
     * Gets the value of a cell property for &#64;renderer in &#64;area.
     * @param renderer a `GtkCellRenderer` inside &#64;area
     * @param property_name the name of the property to get
     * @param value a location to return the value
    */
    public void cellGetProperty(@Nonnull CellRenderer renderer, String property_name, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        JnaCellArea.INST().gtk_cell_area_cell_get_property(asCPointer(), asCPointerNotNull(renderer), property_name, asCPointerNotNull(value));
    }

    /**
     * Sets one or more cell properties for &#64;cell in &#64;area.
     * @param renderer a `GtkCellRenderer` which is a cell inside &#64;area
     * @param first_prop_name the name of the first cell property to set
     * @param _elipse a %NULL-terminated list of property names and values, starting           with &#64;first_prop_name
    */
    public void cellSet(@Nonnull CellRenderer renderer, @Nonnull ch.bailu.gtk.type.Str first_prop_name, java.lang.Object... _elipse)  {
        JnaCellArea.INST().gtk_cell_area_cell_set(asCPointer(), asCPointerNotNull(renderer), asCPointerNotNull(first_prop_name), _elipse);
    }

    /**
     * Sets one or more cell properties for &#64;cell in &#64;area.
     * @param renderer a `GtkCellRenderer` which is a cell inside &#64;area
     * @param first_prop_name the name of the first cell property to set
     * @param _elipse a %NULL-terminated list of property names and values, starting           with &#64;first_prop_name
    */
    public void cellSet(@Nonnull CellRenderer renderer, String first_prop_name, java.lang.Object... _elipse)  {
        JnaCellArea.INST().gtk_cell_area_cell_set(asCPointer(), asCPointerNotNull(renderer), first_prop_name, _elipse);
    }

    /**
     * Sets a cell property for &#64;renderer in &#64;area.
     * @param renderer a `GtkCellRenderer` inside &#64;area
     * @param property_name the name of the cell property to set
     * @param value the value to set the cell property to
    */
    public void cellSetProperty(@Nonnull CellRenderer renderer, @Nonnull ch.bailu.gtk.type.Str property_name, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        JnaCellArea.INST().gtk_cell_area_cell_set_property(asCPointer(), asCPointerNotNull(renderer), asCPointerNotNull(property_name), asCPointerNotNull(value));
    }

    /**
     * Sets a cell property for &#64;renderer in &#64;area.
     * @param renderer a `GtkCellRenderer` inside &#64;area
     * @param property_name the name of the cell property to set
     * @param value the value to set the cell property to
    */
    public void cellSetProperty(@Nonnull CellRenderer renderer, String property_name, @Nonnull ch.bailu.gtk.gobject.Value value)  {
        JnaCellArea.INST().gtk_cell_area_cell_set_property(asCPointer(), asCPointerNotNull(renderer), property_name, asCPointerNotNull(value));
    }

    /**
     * This is sometimes needed for cases where rows need to share
     * <br>alignments in one orientation but may be separately grouped
     * <br>in the opposing orientation.
     * <br>
     * <br>For instance, `GtkIconView` creates all icons (rows) to have
     * <br>the same width and the cells theirin to have the same
     * <br>horizontal alignments. However each row of icons may have
     * <br>a separate collective height. `GtkIconView` uses this to
     * <br>request the heights of each row based on a context which
     * <br>was already used to request all the row widths that are
     * <br>to be displayed.
     * @param context the `GtkCellArea`Context to copy
     * @return a newly created `GtkCellArea`Context copy of &#64;context.
    */
    public CellAreaContext copyContext(@Nonnull CellAreaContext context)  {
        return new CellAreaContext(new PointerContainer(JnaCellArea.INST().gtk_cell_area_copy_context(asCPointer(), asCPointerNotNull(context))));
    }

    /**
     * Creates a `GtkCellArea`Context to be used with &#64;area for
     * <br>all purposes. `GtkCellArea`Context stores geometry information
     * <br>for rows for which it was operated on, it is important to use
     * <br>the same context for the same row of data at all times (i.e.
     * <br>one should render and handle events with the same `GtkCellArea`Context
     * <br>which was used to request the size of those rows of data).
     * @return a newly created `GtkCellArea`Context which can be used with &#64;area.
    */
    public CellAreaContext createContext()  {
        return new CellAreaContext(new PointerContainer(JnaCellArea.INST().gtk_cell_area_create_context(asCPointer())));
    }

    /**
     * Delegates event handling to a `GtkCellArea`.
     * @param context the `GtkCellArea`Context for this row of data.
     * @param widget the `GtkWidget` that &#64;area is rendering to
     * @param event the `GdkEvent` to handle
     * @param cell_area the &#64;widget relative coordinates for &#64;area
     * @param flags the `GtkCellRenderer`State for &#64;area in this row.
     * @return %TRUE if the event was handled by &#64;area.
    */
    public int event(@Nonnull CellAreaContext context, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.gdk.Event event, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags)  {
        return JnaCellArea.INST().gtk_cell_area_event(asCPointer(), asCPointerNotNull(context), asCPointerNotNull(widget), asCPointerNotNull(event), asCPointerNotNull(cell_area), flags);
    }

    /**
     * This should be called by the &#64;area’s owning layout widget
     * <br>when focus is to be passed to &#64;area, or moved within &#64;area
     * <br>for a given &#64;direction and row data.
     * <br>
     * <br>Implementing `GtkCellArea` classes should implement this
     * <br>method to receive and navigate focus in its own way particular
     * <br>to how it lays out cells.
     * @param direction the `GtkDirectionType`
     * @return %TRUE if focus remains inside &#64;area as a result of this call.
    */
    public boolean focus(int direction)  {
        return JnaCellArea.INST().gtk_cell_area_focus(asCPointer(), direction);
    }

    /**
     * Calls &#64;callback for every `GtkCellRenderer` in &#64;area.
     * @param callback the `GtkCellCallback` to call
     * @param callback_data user provided data pointer
    */
    public void foreach(OnCellCallback callback, @Nullable ch.bailu.gtk.type.Pointer callback_data)  {
        JnaCellArea.INST().gtk_cell_area_foreach(asCPointer(), toOnCellCallback(this, "foreach", callback), asCPointer(callback_data));
    }

    /**
     * Calls &#64;callback for every `GtkCellRenderer` in &#64;area with the
     * <br>allocated rectangle inside &#64;cell_area.
     * @param context the `GtkCellArea`Context for this row of data.
     * @param widget the `GtkWidget` that &#64;area is rendering to
     * @param cell_area the &#64;widget relative coordinates and size for &#64;area
     * @param background_area the &#64;widget relative coordinates of the background area
     * @param callback the `GtkCellAllocCallback` to call
     * @param callback_data user provided data pointer
    */
    public void foreachAlloc(@Nonnull CellAreaContext context, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, @Nonnull ch.bailu.gtk.gdk.Rectangle background_area, OnCellAllocCallback callback, @Nullable ch.bailu.gtk.type.Pointer callback_data)  {
        JnaCellArea.INST().gtk_cell_area_foreach_alloc(asCPointer(), asCPointerNotNull(context), asCPointerNotNull(widget), asCPointerNotNull(cell_area), asCPointerNotNull(background_area), toOnCellAllocCallback(this, "foreachAlloc", callback), asCPointer(callback_data));
    }

    /**
     * Derives the allocation of &#64;renderer inside &#64;area if &#64;area
     * <br>were to be renderered in &#64;cell_area.
     * @param context the `GtkCellArea`Context used to hold sizes for &#64;area.
     * @param widget the `GtkWidget` that &#64;area is rendering on
     * @param renderer the `GtkCellRenderer` to get the allocation for
     * @param cell_area the whole allocated area for &#64;area in &#64;widget             for this row
     * @param allocation where to store the allocation for &#64;renderer
    */
    public void getCellAllocation(@Nonnull CellAreaContext context, @Nonnull Widget widget, @Nonnull CellRenderer renderer, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, @Nonnull ch.bailu.gtk.gdk.Rectangle allocation)  {
        JnaCellArea.INST().gtk_cell_area_get_cell_allocation(asCPointer(), asCPointerNotNull(context), asCPointerNotNull(widget), asCPointerNotNull(renderer), asCPointerNotNull(cell_area), asCPointerNotNull(allocation));
    }

    /**
     * Gets the `GtkCellRenderer` at &#64;x and &#64;y coordinates inside &#64;area and optionally
     * <br>returns the full cell allocation for it inside &#64;cell_area.
     * @param context the `GtkCellArea`Context used to hold sizes for &#64;area.
     * @param widget the `GtkWidget` that &#64;area is rendering on
     * @param cell_area the whole allocated area for &#64;area in &#64;widget   for this row
     * @param x the x position
     * @param y the y position
     * @param alloc_area where to store the inner allocated area of the   returned cell renderer
     * @return the `GtkCellRenderer` at &#64;x and &#64;y.
    */
    public CellRenderer getCellAtPosition(@Nonnull CellAreaContext context, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int x, int y, @Nullable ch.bailu.gtk.gdk.Rectangle alloc_area)  {
        return new CellRenderer(new PointerContainer(JnaCellArea.INST().gtk_cell_area_get_cell_at_position(asCPointer(), asCPointerNotNull(context), asCPointerNotNull(widget), asCPointerNotNull(cell_area), x, y, asCPointer(alloc_area))));
    }

    /**
     * Gets the current `GtkTreePath` string for the currently
     * <br>applied `GtkTreeIter`, this is implicitly updated when
     * <br>gtk_cell_area_apply_attributes() is called and can be
     * <br>used to interact with renderers from `GtkCellArea`
     * <br>subclasses.
     * @return The current `GtkTreePath` string for the current attributes applied to &#64;area. This string belongs to the area and should not be freed.
    */
    public ch.bailu.gtk.type.Str getCurrentPathString()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaCellArea.INST().gtk_cell_area_get_current_path_string(asCPointer())));
    }

    /**
     * Gets the `GtkCellEditable` widget currently used
     * <br>to edit the currently edited cell.
     * @return The currently active `GtkCellEditable` widget
    */
    public CellEditable getEditWidget()  {
        return new CellEditable(new PointerContainer(JnaCellArea.INST().gtk_cell_area_get_edit_widget(asCPointer())));
    }

    /**
     * Gets the `GtkCellRenderer` in &#64;area that is currently
     * <br>being edited.
     * @return The currently edited `GtkCellRenderer`
    */
    public CellRenderer getEditedCell()  {
        return new CellRenderer(new PointerContainer(JnaCellArea.INST().gtk_cell_area_get_edited_cell(asCPointer())));
    }

    /**
     * Retrieves the currently focused cell for &#64;area
     * @return the currently focused cell in &#64;area.
    */
    public CellRenderer getFocusCell()  {
        return new CellRenderer(new PointerContainer(JnaCellArea.INST().gtk_cell_area_get_focus_cell(asCPointer())));
    }

    /**
     * Gets the `GtkCellRenderer` which is expected to be focusable
     * <br>for which &#64;renderer is, or may be a sibling.
     * <br>
     * <br>This is handy for `GtkCellArea` subclasses when handling events,
     * <br>after determining the renderer at the event location it can
     * <br>then chose to activate the focus cell for which the event
     * <br>cell may have been a sibling.
     * @param renderer the `GtkCellRenderer`
     * @return the `GtkCellRenderer`   for which &#64;renderer is a sibling
    */
    public CellRenderer getFocusFromSibling(@Nonnull CellRenderer renderer)  {
        return new CellRenderer(new PointerContainer(JnaCellArea.INST().gtk_cell_area_get_focus_from_sibling(asCPointer(), asCPointerNotNull(renderer))));
    }

    /**
     * Gets the focus sibling cell renderers for &#64;renderer.
     * @param renderer the `GtkCellRenderer` expected to have focus
     * @return A `GList` of `GtkCellRenderer`s.       The returned list is internal and should not be freed.
    */
    public ch.bailu.gtk.glib.List getFocusSiblings(@Nonnull CellRenderer renderer)  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaCellArea.INST().gtk_cell_area_get_focus_siblings(asCPointer(), asCPointerNotNull(renderer))));
    }

    /**
     * Retrieves a cell area’s initial minimum and natural height.
     * <br>
     * <br>&#64;area will store some geometrical information in &#64;context along the way;
     * <br>when requesting sizes over an arbitrary number of rows, it’s not important
     * <br>to check the &#64;minimum_height and &#64;natural_height of this call but rather to
     * <br>consult gtk_cell_area_context_get_preferred_height() after a series of
     * <br>requests.
     * @param context the `GtkCellArea`Context to perform this request with
     * @param widget the `GtkWidget` where &#64;area will be rendering
     * @param minimum_height location to store the minimum height
     * @param natural_height location to store the natural height
    */
    public void getPreferredHeight(@Nonnull CellAreaContext context, @Nonnull Widget widget, @Nullable ch.bailu.gtk.type.Int minimum_height, @Nullable ch.bailu.gtk.type.Int natural_height)  {
        JnaCellArea.INST().gtk_cell_area_get_preferred_height(asCPointer(), asCPointerNotNull(context), asCPointerNotNull(widget), asCPointer(minimum_height), asCPointer(natural_height));
    }

    /**
     * Retrieves a cell area’s minimum and natural height if it would be given
     * <br>the specified &#64;width.
     * <br>
     * <br>&#64;area stores some geometrical information in &#64;context along the way
     * <br>while calling gtk_cell_area_get_preferred_width(). It’s important to
     * <br>perform a series of gtk_cell_area_get_preferred_width() requests with
     * <br>&#64;context first and then call gtk_cell_area_get_preferred_height_for_width()
     * <br>on each cell area individually to get the height for width of each
     * <br>fully requested row.
     * <br>
     * <br>If at some point, the width of a single row changes, it should be
     * <br>requested with gtk_cell_area_get_preferred_width() again and then
     * <br>the full width of the requested rows checked again with
     * <br>gtk_cell_area_context_get_preferred_width().
     * @param context the `GtkCellArea`Context which has already been requested for widths.
     * @param widget the `GtkWidget` where &#64;area will be rendering
     * @param width the width for which to check the height of this area
     * @param minimum_height location to store the minimum height
     * @param natural_height location to store the natural height
    */
    public void getPreferredHeightForWidth(@Nonnull CellAreaContext context, @Nonnull Widget widget, int width, @Nullable ch.bailu.gtk.type.Int minimum_height, @Nullable ch.bailu.gtk.type.Int natural_height)  {
        JnaCellArea.INST().gtk_cell_area_get_preferred_height_for_width(asCPointer(), asCPointerNotNull(context), asCPointerNotNull(widget), width, asCPointer(minimum_height), asCPointer(natural_height));
    }

    /**
     * Retrieves a cell area’s initial minimum and natural width.
     * <br>
     * <br>&#64;area will store some geometrical information in &#64;context along the way;
     * <br>when requesting sizes over an arbitrary number of rows, it’s not important
     * <br>to check the &#64;minimum_width and &#64;natural_width of this call but rather to
     * <br>consult gtk_cell_area_context_get_preferred_width() after a series of
     * <br>requests.
     * @param context the `GtkCellArea`Context to perform this request with
     * @param widget the `GtkWidget` where &#64;area will be rendering
     * @param minimum_width location to store the minimum width
     * @param natural_width location to store the natural width
    */
    public void getPreferredWidth(@Nonnull CellAreaContext context, @Nonnull Widget widget, @Nullable ch.bailu.gtk.type.Int minimum_width, @Nullable ch.bailu.gtk.type.Int natural_width)  {
        JnaCellArea.INST().gtk_cell_area_get_preferred_width(asCPointer(), asCPointerNotNull(context), asCPointerNotNull(widget), asCPointer(minimum_width), asCPointer(natural_width));
    }

    /**
     * Retrieves a cell area’s minimum and natural width if it would be given
     * <br>the specified &#64;height.
     * <br>
     * <br>&#64;area stores some geometrical information in &#64;context along the way
     * <br>while calling gtk_cell_area_get_preferred_height(). It’s important to
     * <br>perform a series of gtk_cell_area_get_preferred_height() requests with
     * <br>&#64;context first and then call gtk_cell_area_get_preferred_width_for_height()
     * <br>on each cell area individually to get the height for width of each
     * <br>fully requested row.
     * <br>
     * <br>If at some point, the height of a single row changes, it should be
     * <br>requested with gtk_cell_area_get_preferred_height() again and then
     * <br>the full height of the requested rows checked again with
     * <br>gtk_cell_area_context_get_preferred_height().
     * @param context the `GtkCellArea`Context which has already been requested for widths.
     * @param widget the `GtkWidget` where &#64;area will be rendering
     * @param height the height for which to check the width of this area
     * @param minimum_width location to store the minimum width
     * @param natural_width location to store the natural width
    */
    public void getPreferredWidthForHeight(@Nonnull CellAreaContext context, @Nonnull Widget widget, int height, @Nullable ch.bailu.gtk.type.Int minimum_width, @Nullable ch.bailu.gtk.type.Int natural_width)  {
        JnaCellArea.INST().gtk_cell_area_get_preferred_width_for_height(asCPointer(), asCPointerNotNull(context), asCPointerNotNull(widget), height, asCPointer(minimum_width), asCPointer(natural_width));
    }

    /**
     * Gets whether the area prefers a height-for-width layout
     * <br>or a width-for-height layout.
     * @return The `GtkSizeRequestMode` preferred by &#64;area.
    */
    public int getRequestMode()  {
        return JnaCellArea.INST().gtk_cell_area_get_request_mode(asCPointer());
    }

    /**
     * Checks if &#64;area contains &#64;renderer.
     * @param renderer the `GtkCellRenderer` to check
     * @return %TRUE if &#64;renderer is in the &#64;area.
    */
    public boolean hasRenderer(@Nonnull CellRenderer renderer)  {
        return JnaCellArea.INST().gtk_cell_area_has_renderer(asCPointer(), asCPointerNotNull(renderer));
    }

    /**
     * This is a convenience function for `GtkCellArea` implementations
     * <br>to get the inner area where a given `GtkCellRenderer` will be
     * <br>rendered. It removes any padding previously added by gtk_cell_area_request_renderer().
     * @param widget the `GtkWidget` that &#64;area is rendering onto
     * @param cell_area the &#64;widget relative coordinates where one of &#64;area’s cells             is to be placed
     * @param inner_area the return location for the inner cell area
    */
    public void innerCellArea(@Nonnull Widget widget, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, @Nonnull ch.bailu.gtk.gdk.Rectangle inner_area)  {
        JnaCellArea.INST().gtk_cell_area_inner_cell_area(asCPointer(), asCPointerNotNull(widget), asCPointerNotNull(cell_area), asCPointerNotNull(inner_area));
    }

    /**
     * Returns whether the area can do anything when activated,
     * <br>after applying new attributes to &#64;area.
     * @return whether &#64;area can do anything when activated.
    */
    public boolean isActivatable()  {
        return JnaCellArea.INST().gtk_cell_area_is_activatable(asCPointer());
    }

    /**
     * Returns whether &#64;sibling is one of &#64;renderer’s focus siblings
     * <br>(see gtk_cell_area_add_focus_sibling()).
     * @param renderer the `GtkCellRenderer` expected to have focus
     * @param sibling the `GtkCellRenderer` to check against &#64;renderer’s sibling list
     * @return %TRUE if &#64;sibling is a focus sibling of &#64;renderer
    */
    public boolean isFocusSibling(@Nonnull CellRenderer renderer, @Nonnull CellRenderer sibling)  {
        return JnaCellArea.INST().gtk_cell_area_is_focus_sibling(asCPointer(), asCPointerNotNull(renderer), asCPointerNotNull(sibling));
    }

    /**
     * Removes &#64;renderer from &#64;area.
     * @param renderer the `GtkCellRenderer` to remove from &#64;area
    */
    public void remove(@Nonnull CellRenderer renderer)  {
        JnaCellArea.INST().gtk_cell_area_remove(asCPointer(), asCPointerNotNull(renderer));
    }

    /**
     * Removes &#64;sibling from &#64;renderer’s focus sibling list
     * <br>(see gtk_cell_area_add_focus_sibling()).
     * @param renderer the `GtkCellRenderer` expected to have focus
     * @param sibling the `GtkCellRenderer` to remove from &#64;renderer’s focus area
    */
    public void removeFocusSibling(@Nonnull CellRenderer renderer, @Nonnull CellRenderer sibling)  {
        JnaCellArea.INST().gtk_cell_area_remove_focus_sibling(asCPointer(), asCPointerNotNull(renderer), asCPointerNotNull(sibling));
    }

    /**
     * This is a convenience function for `GtkCellArea` implementations
     * <br>to request size for cell renderers. It’s important to use this
     * <br>function to request size and then use gtk_cell_area_inner_cell_area()
     * <br>at render and event time since this function will add padding
     * <br>around the cell for focus painting.
     * @param renderer the `GtkCellRenderer` to request size for
     * @param orientation the `GtkOrientation` in which to request size
     * @param widget the `GtkWidget` that &#64;area is rendering onto
     * @param for_size the allocation contextual size to request for, or -1 if the base request for the orientation is to be returned.
     * @param minimum_size location to store the minimum size
     * @param natural_size location to store the natural size
    */
    public void requestRenderer(@Nonnull CellRenderer renderer, int orientation, @Nonnull Widget widget, int for_size, @Nullable ch.bailu.gtk.type.Int minimum_size, @Nullable ch.bailu.gtk.type.Int natural_size)  {
        JnaCellArea.INST().gtk_cell_area_request_renderer(asCPointer(), asCPointerNotNull(renderer), orientation, asCPointerNotNull(widget), for_size, asCPointer(minimum_size), asCPointer(natural_size));
    }

    /**
     * Explicitly sets the currently focused cell to &#64;renderer.
     * <br>
     * <br>This is generally called by implementations of
     * <br>`GtkCellAreaClass.focus()` or `GtkCellAreaClass.event()`,
     * <br>however it can also be used to implement functions such
     * <br>as gtk_tree_view_set_cursor_on_cell().
     * @param renderer the `GtkCellRenderer` to give focus to
    */
    public void setFocusCell(@Nullable CellRenderer renderer)  {
        JnaCellArea.INST().gtk_cell_area_set_focus_cell(asCPointer(), asCPointer(renderer));
    }

    /**
     * Snapshots &#64;area’s cells according to &#64;area’s layout onto at
     * <br>the given coordinates.
     * @param context the `GtkCellArea`Context for this row of data.
     * @param widget the `GtkWidget` that &#64;area is rendering to
     * @param snapshot the `GtkSnapshot` to draw to
     * @param background_area the &#64;widget relative coordinates for &#64;area’s background
     * @param cell_area the &#64;widget relative coordinates for &#64;area
     * @param flags the `GtkCellRenderer`State for &#64;area in this row.
     * @param paint_focus whether &#64;area should paint focus on focused cells for focused rows or not.
    */
    public void snapshot(@Nonnull CellAreaContext context, @Nonnull Widget widget, @Nonnull Snapshot snapshot, @Nonnull ch.bailu.gtk.gdk.Rectangle background_area, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags, boolean paint_focus)  {
        JnaCellArea.INST().gtk_cell_area_snapshot(asCPointer(), asCPointerNotNull(context), asCPointerNotNull(widget), asCPointerNotNull(snapshot), asCPointerNotNull(background_area), asCPointerNotNull(cell_area), flags, paint_focus);
    }

    /**
     * Explicitly stops the editing of the currently edited cell.
     * <br>
     * <br>If &#64;canceled is %TRUE, the currently edited cell renderer
     * <br>will emit the ::editing-canceled signal, otherwise the
     * <br>the ::editing-done signal will be emitted on the current
     * <br>edit widget.
     * <br>
     * <br>See gtk_cell_area_get_edited_cell() and gtk_cell_area_get_edit_widget().
     * @param canceled whether editing was canceled.
    */
    public void stopEditing(boolean canceled)  {
        JnaCellArea.INST().gtk_cell_area_stop_editing(asCPointer(), canceled);
    }

    public final static String SIGNAL_ON_ADD_EDITABLE = "add-editable";
    
    /**
     * Connect to signal "add-editable".
     * <br>See {@link OnAddEditable#onAddEditable} for signal description.
     * <br>Field {@link #SIGNAL_ON_ADD_EDITABLE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAddEditable(OnAddEditable signal) {
        return connectSignal(SIGNAL_ON_ADD_EDITABLE, toOnAddEditable(signal));
    }

    public final static String SIGNAL_ON_APPLY_ATTRIBUTES = "apply-attributes";
    
    /**
     * Connect to signal "apply-attributes".
     * <br>See {@link OnApplyAttributes#onApplyAttributes} for signal description.
     * <br>Field {@link #SIGNAL_ON_APPLY_ATTRIBUTES} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onApplyAttributes(OnApplyAttributes signal) {
        return connectSignal(SIGNAL_ON_APPLY_ATTRIBUTES, toOnApplyAttributes(signal));
    }

    public final static String SIGNAL_ON_FOCUS_CHANGED = "focus-changed";
    
    /**
     * Connect to signal "focus-changed".
     * <br>See {@link OnFocusChanged#onFocusChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_FOCUS_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onFocusChanged(OnFocusChanged signal) {
        return connectSignal(SIGNAL_ON_FOCUS_CHANGED, toOnFocusChanged(signal));
    }

    public final static String SIGNAL_ON_REMOVE_EDITABLE = "remove-editable";
    
    /**
     * Connect to signal "remove-editable".
     * <br>See {@link OnRemoveEditable#onRemoveEditable} for signal description.
     * <br>Field {@link #SIGNAL_ON_REMOVE_EDITABLE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRemoveEditable(OnRemoveEditable signal) {
        return connectSignal(SIGNAL_ON_REMOVE_EDITABLE, toOnRemoveEditable(signal));
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
        return JnaCellArea.INST().gtk_cell_area_get_type(); 
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

[MethodModel:java-type-not-supported:cellGetValist:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:CellRenderer:{c:GtkCellRenderer*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:java-type-not-supported:cellSetValist:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:CellRenderer:{c:GtkCellRenderer*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
*/
