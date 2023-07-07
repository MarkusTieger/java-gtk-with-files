/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkFlowBox` puts child widgets in reflowing grid.
 * <br>
 * <br>For instance, with the horizontal orientation, the widgets will be
 * <br>arranged from left to right, starting a new row under the previous
 * <br>row when necessary. Reducing the width in this case will require more
 * <br>rows, so a larger height will be requested.
 * <br>
 * <br>Likewise, with the vertical orientation, the widgets will be arranged
 * <br>from top to bottom, starting a new column to the right when necessary.
 * <br>Reducing the height will require more columns, so a larger width will
 * <br>be requested.
 * <br>
 * <br>The size request of a `GtkFlowBox` alone may not be what you expect;
 * <br>if you need to be able to shrink it along both axes and dynamically
 * <br>reflow its children, you may have to wrap it in a `GtkScrolledWindow`
 * <br>to enable that.
 * <br>
 * <br>The children of a `GtkFlowBox` can be dynamically sorted and filtered.
 * <br>
 * <br>Although a `GtkFlowBox` must have only `GtkFlowBoxChild` children, you
 * <br>can add any kind of widget to it via [method&#64;Gtk.FlowBox.insert], and a
 * <br>`GtkFlowBoxChild` widget will automatically be inserted between the box
 * <br>and the widget.
 * <br>
 * <br>Also see [class&#64;Gtk.ListBox].
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>```
 * <br>flowbox
 * <br>├── flowboxchild
 * <br>│   ╰── &lt;child&gt;
 * <br>├── flowboxchild
 * <br>│   ╰── &lt;child&gt;
 * <br>┊
 * <br>╰── [rubberband]
 * <br>```
 * <br>
 * <br>`GtkFlowBox` uses a single CSS node with name flowbox. `GtkFlowBoxChild`
 * <br>uses a single CSS node with name flowboxchild. For rubberband selection,
 * <br>a subnode with name rubberband is used.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkFlowBox` uses the %GTK_ACCESSIBLE_ROLE_GRID role, and `GtkFlowBoxChild`
 * <br>uses the %GTK_ACCESSIBLE_ROLE_GRID_CELL role.
 * <p><a href="https://docs.gtk.org/gtk4/class.FlowBox.html">https://docs.gtk.org/gtk4/class.FlowBox.html</a></p>
*/
public class FlowBox extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FlowBox.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnFlowBoxCreateWidgetFunc {
        /**
         * Called for flow boxes that are bound to a `GListModel`.
         * <br>
         * <br>This function is called for each item that gets added to the model.
         * @param item the item from the model for which to create a widget for
         * @param user_data user data from gtk_flow_box_bind_model()
         * @return a `GtkWidget` that represents &#64;item
        */
        Widget onFlowBoxCreateWidgetFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer item, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaFlowBox.OnFlowBoxCreateWidgetFunc toOnFlowBoxCreateWidgetFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnFlowBoxCreateWidgetFunc in) {
        JnaFlowBox.OnFlowBoxCreateWidgetFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_item, _user_data) -> in.onFlowBoxCreateWidgetFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_item)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
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
    
    private static JnaFlowBox.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaFlowBox.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFlowBoxForeachFunc {
        /**
         * A function used by gtk_flow_box_selected_foreach().
         * <br>
         * <br>It will be called on every selected child of the &#64;box.
         * @param box a `GtkFlowBox`
         * @param child a `GtkFlowBoxChild`
         * @param user_data user data
        */
        void onFlowBoxForeachFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FlowBox box, @Nonnull FlowBoxChild child, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaFlowBox.OnFlowBoxForeachFunc toOnFlowBoxForeachFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnFlowBoxForeachFunc in) {
        JnaFlowBox.OnFlowBoxForeachFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_box, _child, _user_data) -> in.onFlowBoxForeachFunc(__callback, new FlowBox(new PointerContainer(_box)), new FlowBoxChild(new PointerContainer(_child)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFlowBoxFilterFunc {
        /**
         * A function that will be called whenever a child changes
         * <br>or is added.
         * <br>
         * <br>It lets you control if the child should be visible or not.
         * @param child a `GtkFlowBoxChild` that may be filtered
         * @param user_data user data
         * @return %TRUE if the row should be visible, %FALSE otherwise
        */
        boolean onFlowBoxFilterFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FlowBoxChild child, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaFlowBox.OnFlowBoxFilterFunc toOnFlowBoxFilterFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnFlowBoxFilterFunc in) {
        JnaFlowBox.OnFlowBoxFilterFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_child, _user_data) -> in.onFlowBoxFilterFunc(__callback, new FlowBoxChild(new PointerContainer(_child)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnFlowBoxSortFunc {
        /**
         * A function to compare two children to determine which
         * <br>should come first.
         * @param child1 the first child
         * @param child2 the second child
         * @param user_data user data
         * @return &lt; 0 if &#64;child1 should be before &#64;child2, 0 if   the are equal, and &gt; 0 otherwise
        */
        int onFlowBoxSortFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull FlowBoxChild child1, @Nonnull FlowBoxChild child2, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaFlowBox.OnFlowBoxSortFunc toOnFlowBoxSortFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnFlowBoxSortFunc in) {
        JnaFlowBox.OnFlowBoxSortFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_child1, _child2, _user_data) -> in.onFlowBoxSortFunc(__callback, new FlowBoxChild(new PointerContainer(_child1)), new FlowBoxChild(new PointerContainer(_child2)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnActivateCursorChild {
        /**
         * Emitted when the user activates the &#64;box.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
        */
        void onActivateCursorChild();
    }
    
    private static com.sun.jna.Callback toOnActivateCursorChild(OnActivateCursorChild in) {
        return (in == null) ? null: (JnaFlowBox.OnActivateCursorChild) (__self, __data) -> in.onActivateCursorChild();
    }

    @FunctionalInterface
    public interface OnChildActivated {
        /**
         * Emitted when a child has been activated by the user.
         * @param child the child that is activated
        */
        void onChildActivated(@Nonnull FlowBoxChild child);
    }
    
    private static com.sun.jna.Callback toOnChildActivated(OnChildActivated in) {
        return (in == null) ? null: (JnaFlowBox.OnChildActivated) (__self, _child, __data) -> in.onChildActivated(new FlowBoxChild(new PointerContainer(_child)));
    }

    @FunctionalInterface
    public interface OnMoveCursor {
        /**
         * Emitted when the user initiates a cursor movement.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>Applications should not connect to it, but may emit it with
         * <br>g_signal_emit_by_name() if they need to control the cursor
         * <br>programmatically.
         * <br>
         * <br>The default bindings for this signal come in two variants,
         * <br>the variant with the Shift modifier extends the selection,
         * <br>the variant without the Shift modifier does not.
         * <br>There are too many key combinations to list them all here.
         * <br>
         * <br>- &lt;kbd&gt;←&lt;/kbd&gt;, &lt;kbd&gt;→&lt;/kbd&gt;, &lt;kbd&gt;↑&lt;/kbd&gt;, &lt;kbd&gt;↓&lt;/kbd&gt;
         * <br>  move by individual children
         * <br>- &lt;kbd&gt;Home&lt;/kbd&gt;, &lt;kbd&gt;End&lt;/kbd&gt; move to the ends of the box
         * <br>- &lt;kbd&gt;PgUp&lt;/kbd&gt;, &lt;kbd&gt;PgDn&lt;/kbd&gt; move vertically by pages
         * @param step the granularity fo the move, as a `GtkMovementStep`
         * @param count the number of &#64;step units to move
         * @param extend whether to extend the selection
         * @param modify whether to modify the selection
         * @return %TRUE to stop other handlers from being invoked for the event. %FALSE to propagate the event further.
        */
        boolean onMoveCursor(int step, int count, boolean extend, boolean modify);
    }
    
    private static com.sun.jna.Callback toOnMoveCursor(OnMoveCursor in) {
        return (in == null) ? null: (JnaFlowBox.OnMoveCursor) (__self, _step, _count, _extend, _modify, __data) -> in.onMoveCursor(_step, _count, _extend, _modify);
    }

    @FunctionalInterface
    public interface OnSelectAll {
        /**
         * Emitted to select all children of the box,
         * <br>if the selection mode permits it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
        */
        void onSelectAll();
    }
    
    private static com.sun.jna.Callback toOnSelectAll(OnSelectAll in) {
        return (in == null) ? null: (JnaFlowBox.OnSelectAll) (__self, __data) -> in.onSelectAll();
    }

    @FunctionalInterface
    public interface OnSelectedChildrenChanged {
        /**
         * Emitted when the set of selected children changes.
         * <br>
         * <br>Use [method&#64;Gtk.FlowBox.selected_foreach] or
         * <br>[method&#64;Gtk.FlowBox.get_selected_children] to obtain the
         * <br>selected children.
        */
        void onSelectedChildrenChanged();
    }
    
    private static com.sun.jna.Callback toOnSelectedChildrenChanged(OnSelectedChildrenChanged in) {
        return (in == null) ? null: (JnaFlowBox.OnSelectedChildrenChanged) (__self, __data) -> in.onSelectedChildrenChanged();
    }

    @FunctionalInterface
    public interface OnToggleCursorChild {
        /**
         * Emitted to toggle the selection of the child that has the focus.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default binding for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Space&lt;/kbd&gt;.
        */
        void onToggleCursorChild();
    }
    
    private static com.sun.jna.Callback toOnToggleCursorChild(OnToggleCursorChild in) {
        return (in == null) ? null: (JnaFlowBox.OnToggleCursorChild) (__self, __data) -> in.onToggleCursorChild();
    }

    @FunctionalInterface
    public interface OnUnselectAll {
        /**
         * Emitted to unselect all children of the box,
         * <br>if the selection mode permits it.
         * <br>
         * <br>This is a [keybinding signal](class.SignalAction.html).
         * <br>
         * <br>The default bindings for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
        */
        void onUnselectAll();
    }
    
    private static com.sun.jna.Callback toOnUnselectAll(OnUnselectAll in) {
        return (in == null) ? null: (JnaFlowBox.OnUnselectAll) (__self, __data) -> in.onUnselectAll();
    }

    public FlowBox(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkFlowBox`.
    */
    public FlowBox() {
        super(cast(JnaFlowBox.INST().gtk_flow_box_new()));
    }

    /**
     * Adds &#64;child to the end of &#64;self.
     * <br>
     * <br>If a sort function is set, the widget will
     * <br>actually be inserted at the calculated position.
     * <br>
     * <br>See also: [method&#64;Gtk.FlowBox.insert].
     * @param child the `GtkWidget` to add
    */
    public void append(@Nonnull Widget child)  {
        JnaFlowBox.INST().gtk_flow_box_append(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Binds &#64;model to &#64;box.
     * <br>
     * <br>If &#64;box was already bound to a model, that previous binding is
     * <br>destroyed.
     * <br>
     * <br>The contents of &#64;box are cleared and then filled with widgets that
     * <br>represent items from &#64;model. &#64;box is updated whenever &#64;model changes.
     * <br>If &#64;model is %NULL, &#64;box is left empty.
     * <br>
     * <br>It is undefined to add or remove widgets directly (for example, with
     * <br>[method&#64;Gtk.FlowBox.insert]) while &#64;box is bound to a model.
     * <br>
     * <br>Note that using a model is incompatible with the filtering and sorting
     * <br>functionality in `GtkFlowBox`. When using a model, filtering and sorting
     * <br>should be implemented by the model.
     * @param model the `GListModel` to be bound to &#64;box
     * @param create_widget_func a function that creates widgets for items
     * @param user_data user data passed to &#64;create_widget_func
     * @param user_data_free_func function for freeing &#64;user_data
    */
    public void bindModel(@Nullable ch.bailu.gtk.gio.ListModel model, OnFlowBoxCreateWidgetFunc create_widget_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify user_data_free_func)  {
        JnaFlowBox.INST().gtk_flow_box_bind_model(asCPointer(), asCPointer(model), toOnFlowBoxCreateWidgetFunc(this, "bindModel", create_widget_func), asCPointer(user_data), toOnDestroyNotify(this, "bindModel", user_data_free_func));
    }

    /**
     * Returns whether children activate on single clicks.
     * @return %TRUE if children are activated on single click,   %FALSE otherwise
    */
    public boolean getActivateOnSingleClick()  {
        return JnaFlowBox.INST().gtk_flow_box_get_activate_on_single_click(asCPointer());
    }

    /**
     * Gets the nth child in the &#64;box.
     * @param idx the position of the child
     * @return the child widget, which will   always be a `GtkFlowBoxChild` or %NULL in case no child widget   with the given index exists.
    */
    public FlowBoxChild getChildAtIndex(int idx)  {
        return new FlowBoxChild(new PointerContainer(JnaFlowBox.INST().gtk_flow_box_get_child_at_index(asCPointer(), idx)));
    }

    /**
     * Gets the child in the (&#64;x, &#64;y) position.
     * <br>
     * <br>Both &#64;x and &#64;y are assumed to be relative to the origin of &#64;box.
     * @param x the x coordinate of the child
     * @param y the y coordinate of the child
     * @return the child widget, which will   always be a `GtkFlowBoxChild` or %NULL in case no child widget   exists for the given x and y coordinates.
    */
    public FlowBoxChild getChildAtPos(int x, int y)  {
        return new FlowBoxChild(new PointerContainer(JnaFlowBox.INST().gtk_flow_box_get_child_at_pos(asCPointer(), x, y)));
    }

    /**
     * Gets the horizontal spacing.
     * @return the horizontal spacing
    */
    public int getColumnSpacing()  {
        return JnaFlowBox.INST().gtk_flow_box_get_column_spacing(asCPointer());
    }

    /**
     * Returns whether the box is homogeneous.
     * @return %TRUE if the box is homogeneous.
    */
    public boolean getHomogeneous()  {
        return JnaFlowBox.INST().gtk_flow_box_get_homogeneous(asCPointer());
    }

    /**
     * Gets the maximum number of children per line.
     * @return the maximum number of children per line
    */
    public int getMaxChildrenPerLine()  {
        return JnaFlowBox.INST().gtk_flow_box_get_max_children_per_line(asCPointer());
    }

    /**
     * Gets the minimum number of children per line.
     * @return the minimum number of children per line
    */
    public int getMinChildrenPerLine()  {
        return JnaFlowBox.INST().gtk_flow_box_get_min_children_per_line(asCPointer());
    }

    /**
     * Gets the vertical spacing.
     * @return the vertical spacing
    */
    public int getRowSpacing()  {
        return JnaFlowBox.INST().gtk_flow_box_get_row_spacing(asCPointer());
    }

    /**
     * Creates a list of all selected children.
     * @return    A `GList` containing the `GtkWidget` for each selected child.   Free with g_list_free() when done.
    */
    public ch.bailu.gtk.glib.List getSelectedChildren()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaFlowBox.INST().gtk_flow_box_get_selected_children(asCPointer())));
    }

    /**
     * Gets the selection mode of &#64;box.
     * @return the `GtkSelectionMode`
    */
    public int getSelectionMode()  {
        return JnaFlowBox.INST().gtk_flow_box_get_selection_mode(asCPointer());
    }

    /**
     * Inserts the &#64;widget into &#64;box at &#64;position.
     * <br>
     * <br>If a sort function is set, the widget will actually be inserted
     * <br>at the calculated position.
     * <br>
     * <br>If &#64;position is -1, or larger than the total number of children
     * <br>in the &#64;box, then the &#64;widget will be appended to the end.
     * @param widget the `GtkWidget` to add
     * @param position the position to insert &#64;child in
    */
    public void insert(@Nonnull Widget widget, int position)  {
        JnaFlowBox.INST().gtk_flow_box_insert(asCPointer(), asCPointerNotNull(widget), position);
    }

    /**
     * Updates the filtering for all children.
     * <br>
     * <br>Call this function when the result of the filter
     * <br>function on the &#64;box is changed due ot an external
     * <br>factor. For instance, this would be used if the
     * <br>filter function just looked for a specific search
     * <br>term, and the entry with the string has changed.
    */
    public void invalidateFilter()  {
        JnaFlowBox.INST().gtk_flow_box_invalidate_filter(asCPointer());
    }

    /**
     * Updates the sorting for all children.
     * <br>
     * <br>Call this when the result of the sort function on
     * <br>&#64;box is changed due to an external factor.
    */
    public void invalidateSort()  {
        JnaFlowBox.INST().gtk_flow_box_invalidate_sort(asCPointer());
    }

    /**
     * Adds &#64;child to the start of &#64;self.
     * <br>
     * <br>If a sort function is set, the widget will
     * <br>actually be inserted at the calculated position.
     * <br>
     * <br>See also: [method&#64;Gtk.FlowBox.insert].
     * @param child the `GtkWidget` to add
    */
    public void prepend(@Nonnull Widget child)  {
        JnaFlowBox.INST().gtk_flow_box_prepend(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Removes a child from &#64;box.
     * @param widget the child widget to remove
    */
    public void remove(@Nonnull Widget widget)  {
        JnaFlowBox.INST().gtk_flow_box_remove(asCPointer(), asCPointerNotNull(widget));
    }

    /**
     * Select all children of &#64;box, if the selection
     * <br>mode allows it.
    */
    public void selectAll()  {
        JnaFlowBox.INST().gtk_flow_box_select_all(asCPointer());
    }

    /**
     * Selects a single child of &#64;box, if the selection
     * <br>mode allows it.
     * @param child a child of &#64;box
    */
    public void selectChild(@Nonnull FlowBoxChild child)  {
        JnaFlowBox.INST().gtk_flow_box_select_child(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Calls a function for each selected child.
     * <br>
     * <br>Note that the selection cannot be modified from within
     * <br>this function.
     * @param func the function to call for each selected child
     * @param data user data to pass to the function
    */
    public void selectedForeach(OnFlowBoxForeachFunc func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaFlowBox.INST().gtk_flow_box_selected_foreach(asCPointer(), toOnFlowBoxForeachFunc(this, "selectedForeach", func), asCPointer(data));
    }

    /**
     * If &#64;single is %TRUE, children will be activated when you click
     * <br>on them, otherwise you need to double-click.
     * @param single %TRUE to emit child-activated on a single click
    */
    public void setActivateOnSingleClick(boolean single)  {
        JnaFlowBox.INST().gtk_flow_box_set_activate_on_single_click(asCPointer(), single);
    }

    /**
     * Sets the horizontal space to add between children.
     * @param spacing the spacing to use
    */
    public void setColumnSpacing(int spacing)  {
        JnaFlowBox.INST().gtk_flow_box_set_column_spacing(asCPointer(), spacing);
    }

    /**
     * By setting a filter function on the &#64;box one can decide dynamically
     * <br>which of the children to show.
     * <br>
     * <br>For instance, to implement a search function that only shows the
     * <br>children matching the search terms.
     * <br>
     * <br>The &#64;filter_func will be called for each child after the call, and
     * <br>it will continue to be called each time a child changes (via
     * <br>[method&#64;Gtk.FlowBoxChild.changed]) or when
     * <br>[method&#64;Gtk.FlowBox.invalidate_filter] is called.
     * <br>
     * <br>Note that using a filter function is incompatible with using a model
     * <br>(see [method&#64;Gtk.FlowBox.bind_model]).
     * @param filter_func callback that   lets you filter which children to show
     * @param user_data user data passed to &#64;filter_func
     * @param destroy destroy notifier for &#64;user_data
    */
    public void setFilterFunc(OnFlowBoxFilterFunc filter_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy)  {
        JnaFlowBox.INST().gtk_flow_box_set_filter_func(asCPointer(), toOnFlowBoxFilterFunc(this, "setFilterFunc", filter_func), asCPointer(user_data), toOnDestroyNotify(this, "setFilterFunc", destroy));
    }

    /**
     * Hooks up an adjustment to focus handling in &#64;box.
     * <br>
     * <br>The adjustment is also used for autoscrolling during
     * <br>rubberband selection. See [method&#64;Gtk.ScrolledWindow.get_hadjustment]
     * <br>for a typical way of obtaining the adjustment, and
     * <br>[method&#64;Gtk.FlowBox.set_vadjustment] for setting the vertical
     * <br>adjustment.
     * <br>
     * <br>The adjustments have to be in pixel units and in the same
     * <br>coordinate system as the allocation for immediate children
     * <br>of the box.
     * @param adjustment an adjustment which should be adjusted    when the focus is moved among the descendents of &#64;container
    */
    public void setHadjustment(@Nonnull Adjustment adjustment)  {
        JnaFlowBox.INST().gtk_flow_box_set_hadjustment(asCPointer(), asCPointerNotNull(adjustment));
    }

    /**
     * Sets whether or not all children of &#64;box are given
     * <br>equal space in the box.
     * @param homogeneous %TRUE to create equal allotments,   %FALSE for variable allotments
    */
    public void setHomogeneous(boolean homogeneous)  {
        JnaFlowBox.INST().gtk_flow_box_set_homogeneous(asCPointer(), homogeneous);
    }

    /**
     * Sets the maximum number of children to request and
     * <br>allocate space for in &#64;box’s orientation.
     * <br>
     * <br>Setting the maximum number of children per line
     * <br>limits the overall natural size request to be no more
     * <br>than &#64;n_children children long in the given orientation.
     * @param n_children the maximum number of children per line
    */
    public void setMaxChildrenPerLine(int n_children)  {
        JnaFlowBox.INST().gtk_flow_box_set_max_children_per_line(asCPointer(), n_children);
    }

    /**
     * Sets the minimum number of children to line up
     * <br>in &#64;box’s orientation before flowing.
     * @param n_children the minimum number of children per line
    */
    public void setMinChildrenPerLine(int n_children)  {
        JnaFlowBox.INST().gtk_flow_box_set_min_children_per_line(asCPointer(), n_children);
    }

    /**
     * Sets the vertical space to add between children.
     * @param spacing the spacing to use
    */
    public void setRowSpacing(int spacing)  {
        JnaFlowBox.INST().gtk_flow_box_set_row_spacing(asCPointer(), spacing);
    }

    /**
     * Sets how selection works in &#64;box.
     * @param mode the new selection mode
    */
    public void setSelectionMode(int mode)  {
        JnaFlowBox.INST().gtk_flow_box_set_selection_mode(asCPointer(), mode);
    }

    /**
     * By setting a sort function on the &#64;box, one can dynamically
     * <br>reorder the children of the box, based on the contents of
     * <br>the children.
     * <br>
     * <br>The &#64;sort_func will be called for each child after the call,
     * <br>and will continue to be called each time a child changes (via
     * <br>[method&#64;Gtk.FlowBoxChild.changed]) and when
     * <br>[method&#64;Gtk.FlowBox.invalidate_sort] is called.
     * <br>
     * <br>Note that using a sort function is incompatible with using a model
     * <br>(see [method&#64;Gtk.FlowBox.bind_model]).
     * @param sort_func the sort function
     * @param user_data user data passed to &#64;sort_func
     * @param destroy destroy notifier for &#64;user_data
    */
    public void setSortFunc(OnFlowBoxSortFunc sort_func, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify destroy)  {
        JnaFlowBox.INST().gtk_flow_box_set_sort_func(asCPointer(), toOnFlowBoxSortFunc(this, "setSortFunc", sort_func), asCPointer(user_data), toOnDestroyNotify(this, "setSortFunc", destroy));
    }

    /**
     * Hooks up an adjustment to focus handling in &#64;box.
     * <br>
     * <br>The adjustment is also used for autoscrolling during
     * <br>rubberband selection. See [method&#64;Gtk.ScrolledWindow.get_vadjustment]
     * <br>for a typical way of obtaining the adjustment, and
     * <br>[method&#64;Gtk.FlowBox.set_hadjustment] for setting the horizontal
     * <br>adjustment.
     * <br>
     * <br>The adjustments have to be in pixel units and in the same
     * <br>coordinate system as the allocation for immediate children
     * <br>of the box.
     * @param adjustment an adjustment which should be adjusted    when the focus is moved among the descendents of &#64;container
    */
    public void setVadjustment(@Nonnull Adjustment adjustment)  {
        JnaFlowBox.INST().gtk_flow_box_set_vadjustment(asCPointer(), asCPointerNotNull(adjustment));
    }

    /**
     * Unselect all children of &#64;box, if the selection
     * <br>mode allows it.
    */
    public void unselectAll()  {
        JnaFlowBox.INST().gtk_flow_box_unselect_all(asCPointer());
    }

    /**
     * Unselects a single child of &#64;box, if the selection
     * <br>mode allows it.
     * @param child a child of &#64;box
    */
    public void unselectChild(@Nonnull FlowBoxChild child)  {
        JnaFlowBox.INST().gtk_flow_box_unselect_child(asCPointer(), asCPointerNotNull(child));
    }

    public final static String SIGNAL_ON_ACTIVATE_CURSOR_CHILD = "activate-cursor-child";
    
    /**
     * Connect to signal "activate-cursor-child".
     * <br>See {@link OnActivateCursorChild#onActivateCursorChild} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACTIVATE_CURSOR_CHILD} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onActivateCursorChild(OnActivateCursorChild signal) {
        return connectSignal(SIGNAL_ON_ACTIVATE_CURSOR_CHILD, toOnActivateCursorChild(signal));
    }

    public final static String SIGNAL_ON_CHILD_ACTIVATED = "child-activated";
    
    /**
     * Connect to signal "child-activated".
     * <br>See {@link OnChildActivated#onChildActivated} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHILD_ACTIVATED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChildActivated(OnChildActivated signal) {
        return connectSignal(SIGNAL_ON_CHILD_ACTIVATED, toOnChildActivated(signal));
    }

    public final static String SIGNAL_ON_MOVE_CURSOR = "move-cursor";
    
    /**
     * Connect to signal "move-cursor".
     * <br>See {@link OnMoveCursor#onMoveCursor} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOVE_CURSOR} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMoveCursor(OnMoveCursor signal) {
        return connectSignal(SIGNAL_ON_MOVE_CURSOR, toOnMoveCursor(signal));
    }

    public final static String SIGNAL_ON_SELECT_ALL = "select-all";
    
    /**
     * Connect to signal "select-all".
     * <br>See {@link OnSelectAll#onSelectAll} for signal description.
     * <br>Field {@link #SIGNAL_ON_SELECT_ALL} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSelectAll(OnSelectAll signal) {
        return connectSignal(SIGNAL_ON_SELECT_ALL, toOnSelectAll(signal));
    }

    public final static String SIGNAL_ON_SELECTED_CHILDREN_CHANGED = "selected-children-changed";
    
    /**
     * Connect to signal "selected-children-changed".
     * <br>See {@link OnSelectedChildrenChanged#onSelectedChildrenChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_SELECTED_CHILDREN_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onSelectedChildrenChanged(OnSelectedChildrenChanged signal) {
        return connectSignal(SIGNAL_ON_SELECTED_CHILDREN_CHANGED, toOnSelectedChildrenChanged(signal));
    }

    public final static String SIGNAL_ON_TOGGLE_CURSOR_CHILD = "toggle-cursor-child";
    
    /**
     * Connect to signal "toggle-cursor-child".
     * <br>See {@link OnToggleCursorChild#onToggleCursorChild} for signal description.
     * <br>Field {@link #SIGNAL_ON_TOGGLE_CURSOR_CHILD} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onToggleCursorChild(OnToggleCursorChild signal) {
        return connectSignal(SIGNAL_ON_TOGGLE_CURSOR_CHILD, toOnToggleCursorChild(signal));
    }

    public final static String SIGNAL_ON_UNSELECT_ALL = "unselect-all";
    
    /**
     * Connect to signal "unselect-all".
     * <br>See {@link OnUnselectAll#onUnselectAll} for signal description.
     * <br>Field {@link #SIGNAL_ON_UNSELECT_ALL} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUnselectAll(OnUnselectAll signal) {
        return connectSignal(SIGNAL_ON_UNSELECT_ALL, toOnUnselectAll(signal));
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
        return JnaFlowBox.INST().gtk_flow_box_get_type(); 
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
