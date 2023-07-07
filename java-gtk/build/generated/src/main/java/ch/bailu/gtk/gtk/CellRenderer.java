/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An object for rendering a single cell
 * <br>
 * <br>The `GtkCellRenderer` is a base class of a set of objects used for
 * <br>rendering a cell to a `cairo_t`.  These objects are used primarily by
 * <br>the `GtkTreeView` widget, though they aren’t tied to them in any
 * <br>specific way.  It is worth noting that `GtkCellRenderer` is not a
 * <br>`GtkWidget` and cannot be treated as such.
 * <br>
 * <br>The primary use of a `GtkCellRenderer` is for drawing a certain graphical
 * <br>elements on a `cairo_t`. Typically, one cell renderer is used to
 * <br>draw many cells on the screen.  To this extent, it isn’t expected that a
 * <br>CellRenderer keep any permanent state around.  Instead, any state is set
 * <br>just prior to use using `GObject`s property system.  Then, the
 * <br>cell is measured using gtk_cell_renderer_get_preferred_size(). Finally, the cell
 * <br>is rendered in the correct location using gtk_cell_renderer_snapshot().
 * <br>
 * <br>There are a number of rules that must be followed when writing a new
 * <br>`GtkCellRenderer`.  First and foremost, it’s important that a certain set
 * <br>of properties will always yield a cell renderer of the same size,
 * <br>barring a style change. The `GtkCellRenderer` also has a number of
 * <br>generic properties that are expected to be honored by all children.
 * <br>
 * <br>Beyond merely rendering a cell, cell renderers can optionally
 * <br>provide active user interface elements. A cell renderer can be
 * <br>“activatable” like `GtkCellRenderer`Toggle,
 * <br>which toggles when it gets activated by a mouse click, or it can be
 * <br>“editable” like `GtkCellRenderer`Text, which
 * <br>allows the user to edit the text using a widget implementing the
 * <br>`GtkCellEditable` interface, e.g. `GtkEntry`.
 * <br>To make a cell renderer activatable or editable, you have to
 * <br>implement the `GtkCellRenderer`Class.activate or
 * <br>`GtkCellRenderer`Class.start_editing virtual functions, respectively.
 * <br>
 * <br>Many properties of `GtkCellRenderer` and its subclasses have a
 * <br>corresponding “set” property, e.g. “cell-background-set” corresponds
 * <br>to “cell-background”. These “set” properties reflect whether a property
 * <br>has been set or not. You should not set them independently.
 * <p><a href="https://docs.gtk.org/gtk4/class.CellRenderer.html">https://docs.gtk.org/gtk4/class.CellRenderer.html</a></p>
*/
public class CellRenderer extends ch.bailu.gtk.gobject.InitiallyUnowned {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellRenderer.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnEditingCanceled {
        /**
         * This signal gets emitted when the user cancels the process of editing a
         * <br>cell.  For example, an editable cell renderer could be written to cancel
         * <br>editing when the user presses Escape.
         * <br>
         * <br>See also: gtk_cell_renderer_stop_editing().
        */
        void onEditingCanceled();
    }
    
    private static com.sun.jna.Callback toOnEditingCanceled(OnEditingCanceled in) {
        return (in == null) ? null: (JnaCellRenderer.OnEditingCanceled) (__self, __data) -> in.onEditingCanceled();
    }

    @FunctionalInterface
    public interface OnEditingStarted {
        /**
         * This signal gets emitted when a cell starts to be edited.
         * <br>The intended use of this signal is to do special setup
         * <br>on &#64;editable, e.g. adding a `GtkEntryCompletion` or setting
         * <br>up additional columns in a `GtkComboBox`.
         * <br>
         * <br>See gtk_cell_editable_start_editing() for information on the lifecycle of
         * <br>the &#64;editable and a way to do setup that doesn’t depend on the &#64;renderer.
         * <br>
         * <br>Note that GTK doesn't guarantee that cell renderers will
         * <br>continue to use the same kind of widget for editing in future
         * <br>releases, therefore you should check the type of &#64;editable
         * <br>before doing any specific setup, as in the following example:
         * <pre>&lt;!-- language=&quot;C&quot; --&gt;
         * static void
         * text_editing_started (GtkCellRenderer *cell,
         *                       GtkCellEditable *editable,
         *                       const char      *path,
         *                       gpointer         data)
         * {
         *   if (GTK_IS_ENTRY (editable))
         *     {
         *       GtkEntry *entry = GTK_ENTRY (editable);
         *       
         *       // ... create a GtkEntryCompletion
         *       
         *       gtk_entry_set_completion (entry, completion);
         *     }
         * }
         * </pre>
         * @param editable the `GtkCellEditable`
         * @param path the path identifying the edited cell
        */
        void onEditingStarted(@Nonnull CellEditable editable, @Nonnull ch.bailu.gtk.type.Str path);
    }
    
    private static com.sun.jna.Callback toOnEditingStarted(OnEditingStarted in) {
        return (in == null) ? null: (JnaCellRenderer.OnEditingStarted) (__self, _editable, _path, __data) -> in.onEditingStarted(new CellEditable(new PointerContainer(_editable)), new ch.bailu.gtk.type.Str(new PointerContainer(_path)));
    }

    public CellRenderer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Passes an activate event to the cell renderer for possible processing.
     * <br>Some cell renderers may use events; for example, `GtkCellRendererToggle`
     * <br>toggles when it gets a mouse click.
     * @param event a `GdkEvent`
     * @param widget widget that received the event
     * @param path widget-dependent string representation of the event location;    e.g. for `GtkTreeView`, a string representation of `GtkTreePath`
     * @param background_area background area as passed to gtk_cell_renderer_render()
     * @param cell_area cell area as passed to gtk_cell_renderer_render()
     * @param flags render flags
     * @return %TRUE if the event was consumed/handled
    */
    public boolean activate(@Nonnull ch.bailu.gtk.gdk.Event event, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.type.Str path, @Nonnull ch.bailu.gtk.gdk.Rectangle background_area, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags)  {
        return JnaCellRenderer.INST().gtk_cell_renderer_activate(asCPointer(), asCPointerNotNull(event), asCPointerNotNull(widget), asCPointerNotNull(path), asCPointerNotNull(background_area), asCPointerNotNull(cell_area), flags);
    }

    /**
     * Passes an activate event to the cell renderer for possible processing.
     * <br>Some cell renderers may use events; for example, `GtkCellRendererToggle`
     * <br>toggles when it gets a mouse click.
     * @param event a `GdkEvent`
     * @param widget widget that received the event
     * @param path widget-dependent string representation of the event location;    e.g. for `GtkTreeView`, a string representation of `GtkTreePath`
     * @param background_area background area as passed to gtk_cell_renderer_render()
     * @param cell_area cell area as passed to gtk_cell_renderer_render()
     * @param flags render flags
     * @return %TRUE if the event was consumed/handled
    */
    public boolean activate(@Nonnull ch.bailu.gtk.gdk.Event event, @Nonnull Widget widget, String path, @Nonnull ch.bailu.gtk.gdk.Rectangle background_area, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags)  {
        return JnaCellRenderer.INST().gtk_cell_renderer_activate(asCPointer(), asCPointerNotNull(event), asCPointerNotNull(widget), path, asCPointerNotNull(background_area), asCPointerNotNull(cell_area), flags);
    }

    /**
     * Gets the aligned area used by &#64;cell inside &#64;cell_area. Used for finding
     * <br>the appropriate edit and focus rectangle.
     * @param widget the `GtkWidget` this cell will be rendering to
     * @param flags render flags
     * @param cell_area cell area which would be passed to gtk_cell_renderer_render()
     * @param aligned_area the return location for the space inside &#64;cell_area                that would actually be used to render.
    */
    public void getAlignedArea(@Nonnull Widget widget, int flags, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, @Nonnull ch.bailu.gtk.gdk.Rectangle aligned_area)  {
        JnaCellRenderer.INST().gtk_cell_renderer_get_aligned_area(asCPointer(), asCPointerNotNull(widget), flags, asCPointerNotNull(cell_area), asCPointerNotNull(aligned_area));
    }

    /**
     * Fills in &#64;xalign and &#64;yalign with the appropriate values of &#64;cell.
     * @param xalign location to fill in with the x alignment of the cell
     * @param yalign location to fill in with the y alignment of the cell
    */
    public void getAlignment(@Nullable ch.bailu.gtk.type.Flt xalign, @Nullable ch.bailu.gtk.type.Flt yalign)  {
        JnaCellRenderer.INST().gtk_cell_renderer_get_alignment(asCPointer(), asCPointer(xalign), asCPointer(yalign));
    }

    /**
     * Fills in &#64;width and &#64;height with the appropriate size of &#64;cell.
     * @param width location to fill in with the fixed width of the cell
     * @param height location to fill in with the fixed height of the cell
    */
    public void getFixedSize(@Nullable ch.bailu.gtk.type.Int width, @Nullable ch.bailu.gtk.type.Int height)  {
        JnaCellRenderer.INST().gtk_cell_renderer_get_fixed_size(asCPointer(), asCPointer(width), asCPointer(height));
    }

    /**
     * Checks whether the given `GtkCellRenderer` is expanded.
     * @return %TRUE if the cell renderer is expanded
    */
    public boolean getIsExpanded()  {
        return JnaCellRenderer.INST().gtk_cell_renderer_get_is_expanded(asCPointer());
    }

    /**
     * Checks whether the given `GtkCellRenderer` is an expander.
     * @return %TRUE if &#64;cell is an expander, and %FALSE otherwise
    */
    public boolean getIsExpander()  {
        return JnaCellRenderer.INST().gtk_cell_renderer_get_is_expander(asCPointer());
    }

    /**
     * Fills in &#64;xpad and &#64;ypad with the appropriate values of &#64;cell.
     * @param xpad location to fill in with the x padding of the cell
     * @param ypad location to fill in with the y padding of the cell
    */
    public void getPadding(@Nullable ch.bailu.gtk.type.Int xpad, @Nullable ch.bailu.gtk.type.Int ypad)  {
        JnaCellRenderer.INST().gtk_cell_renderer_get_padding(asCPointer(), asCPointer(xpad), asCPointer(ypad));
    }

    /**
     * Retrieves a renderer’s natural size when rendered to &#64;widget.
     * @param widget the `GtkWidget` this cell will be rendering to
     * @param minimum_size location to store the minimum size
     * @param natural_size location to store the natural size
    */
    public void getPreferredHeight(@Nonnull Widget widget, @Nullable ch.bailu.gtk.type.Int minimum_size, @Nullable ch.bailu.gtk.type.Int natural_size)  {
        JnaCellRenderer.INST().gtk_cell_renderer_get_preferred_height(asCPointer(), asCPointerNotNull(widget), asCPointer(minimum_size), asCPointer(natural_size));
    }

    /**
     * Retrieves a cell renderers’s minimum and natural height if it were rendered to
     * <br>&#64;widget with the specified &#64;width.
     * @param widget the `GtkWidget` this cell will be rendering to
     * @param width the size which is available for allocation
     * @param minimum_height location for storing the minimum size
     * @param natural_height location for storing the preferred size
    */
    public void getPreferredHeightForWidth(@Nonnull Widget widget, int width, @Nullable ch.bailu.gtk.type.Int minimum_height, @Nullable ch.bailu.gtk.type.Int natural_height)  {
        JnaCellRenderer.INST().gtk_cell_renderer_get_preferred_height_for_width(asCPointer(), asCPointerNotNull(widget), width, asCPointer(minimum_height), asCPointer(natural_height));
    }

    /**
     * Retrieves the minimum and natural size of a cell taking
     * <br>into account the widget’s preference for height-for-width management.
     * @param widget the `GtkWidget` this cell will be rendering to
     * @param minimum_size location for storing the minimum size
     * @param natural_size location for storing the natural size
    */
    public void getPreferredSize(@Nonnull Widget widget, @Nullable Requisition minimum_size, @Nullable Requisition natural_size)  {
        JnaCellRenderer.INST().gtk_cell_renderer_get_preferred_size(asCPointer(), asCPointerNotNull(widget), asCPointer(minimum_size), asCPointer(natural_size));
    }

    /**
     * Retrieves a renderer’s natural size when rendered to &#64;widget.
     * @param widget the `GtkWidget` this cell will be rendering to
     * @param minimum_size location to store the minimum size
     * @param natural_size location to store the natural size
    */
    public void getPreferredWidth(@Nonnull Widget widget, @Nullable ch.bailu.gtk.type.Int minimum_size, @Nullable ch.bailu.gtk.type.Int natural_size)  {
        JnaCellRenderer.INST().gtk_cell_renderer_get_preferred_width(asCPointer(), asCPointerNotNull(widget), asCPointer(minimum_size), asCPointer(natural_size));
    }

    /**
     * Retrieves a cell renderers’s minimum and natural width if it were rendered to
     * <br>&#64;widget with the specified &#64;height.
     * @param widget the `GtkWidget` this cell will be rendering to
     * @param height the size which is available for allocation
     * @param minimum_width location for storing the minimum size
     * @param natural_width location for storing the preferred size
    */
    public void getPreferredWidthForHeight(@Nonnull Widget widget, int height, @Nullable ch.bailu.gtk.type.Int minimum_width, @Nullable ch.bailu.gtk.type.Int natural_width)  {
        JnaCellRenderer.INST().gtk_cell_renderer_get_preferred_width_for_height(asCPointer(), asCPointerNotNull(widget), height, asCPointer(minimum_width), asCPointer(natural_width));
    }

    /**
     * Gets whether the cell renderer prefers a height-for-width layout
     * <br>or a width-for-height layout.
     * @return The `GtkSizeRequestMode` preferred by this renderer.
    */
    public int getRequestMode()  {
        return JnaCellRenderer.INST().gtk_cell_renderer_get_request_mode(asCPointer());
    }

    /**
     * Returns the cell renderer’s sensitivity.
     * @return %TRUE if the cell renderer is sensitive
    */
    public boolean getSensitive()  {
        return JnaCellRenderer.INST().gtk_cell_renderer_get_sensitive(asCPointer());
    }

    /**
     * Translates the cell renderer state to `GtkStateFlags`,
     * <br>based on the cell renderer and widget sensitivity, and
     * <br>the given `GtkCellRenderer`State.
     * @param widget a `GtkWidget`
     * @param cell_state cell renderer state
     * @return the widget state flags applying to &#64;cell
    */
    public int getState(@Nullable Widget widget, int cell_state)  {
        return JnaCellRenderer.INST().gtk_cell_renderer_get_state(asCPointer(), asCPointer(widget), cell_state);
    }

    /**
     * Returns the cell renderer’s visibility.
     * @return %TRUE if the cell renderer is visible
    */
    public boolean getVisible()  {
        return JnaCellRenderer.INST().gtk_cell_renderer_get_visible(asCPointer());
    }

    /**
     * Checks whether the cell renderer can do something when activated.
     * @return %TRUE if the cell renderer can do anything when activated
    */
    public boolean isActivatable()  {
        return JnaCellRenderer.INST().gtk_cell_renderer_is_activatable(asCPointer());
    }

    /**
     * Sets the renderer’s alignment within its available space.
     * @param xalign the x alignment of the cell renderer
     * @param yalign the y alignment of the cell renderer
    */
    public void setAlignment(float xalign, float yalign)  {
        JnaCellRenderer.INST().gtk_cell_renderer_set_alignment(asCPointer(), xalign, yalign);
    }

    /**
     * Sets the renderer size to be explicit, independent of the properties set.
     * @param width the width of the cell renderer, or -1
     * @param height the height of the cell renderer, or -1
    */
    public void setFixedSize(int width, int height)  {
        JnaCellRenderer.INST().gtk_cell_renderer_set_fixed_size(asCPointer(), width, height);
    }

    /**
     * Sets whether the given `GtkCellRenderer` is expanded.
     * @param is_expanded whether &#64;cell should be expanded
    */
    public void setIsExpanded(boolean is_expanded)  {
        JnaCellRenderer.INST().gtk_cell_renderer_set_is_expanded(asCPointer(), is_expanded);
    }

    /**
     * Sets whether the given `GtkCellRenderer` is an expander.
     * @param is_expander whether &#64;cell is an expander
    */
    public void setIsExpander(boolean is_expander)  {
        JnaCellRenderer.INST().gtk_cell_renderer_set_is_expander(asCPointer(), is_expander);
    }

    /**
     * Sets the renderer’s padding.
     * @param xpad the x padding of the cell renderer
     * @param ypad the y padding of the cell renderer
    */
    public void setPadding(int xpad, int ypad)  {
        JnaCellRenderer.INST().gtk_cell_renderer_set_padding(asCPointer(), xpad, ypad);
    }

    /**
     * Sets the cell renderer’s sensitivity.
     * @param sensitive the sensitivity of the cell
    */
    public void setSensitive(boolean sensitive)  {
        JnaCellRenderer.INST().gtk_cell_renderer_set_sensitive(asCPointer(), sensitive);
    }

    /**
     * Sets the cell renderer’s visibility.
     * @param visible the visibility of the cell
    */
    public void setVisible(boolean visible)  {
        JnaCellRenderer.INST().gtk_cell_renderer_set_visible(asCPointer(), visible);
    }

    /**
     * Invokes the virtual render function of the `GtkCellRenderer`. The three
     * <br>passed-in rectangles are areas in &#64;cr. Most renderers will draw within
     * <br>&#64;cell_area; the xalign, yalign, xpad, and ypad fields of the `GtkCellRenderer`
     * <br>should be honored with respect to &#64;cell_area. &#64;background_area includes the
     * <br>blank space around the cell, and also the area containing the tree expander;
     * <br>so the &#64;background_area rectangles for all cells tile to cover the entire
     * <br>&#64;window.
     * @param snapshot a `GtkSnapshot` to draw to
     * @param widget the widget owning &#64;window
     * @param background_area entire cell area (including tree expanders and maybe    padding on the sides)
     * @param cell_area area normally rendered by a cell renderer
     * @param flags flags that affect rendering
    */
    public void snapshot(@Nonnull Snapshot snapshot, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.gdk.Rectangle background_area, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags)  {
        JnaCellRenderer.INST().gtk_cell_renderer_snapshot(asCPointer(), asCPointerNotNull(snapshot), asCPointerNotNull(widget), asCPointerNotNull(background_area), asCPointerNotNull(cell_area), flags);
    }

    /**
     * Starts editing the contents of this &#64;cell, through a new `GtkCellEditable`
     * <br>widget created by the `GtkCellRenderer`Class.start_editing virtual function.
     * @param event a `GdkEvent`
     * @param widget widget that received the event
     * @param path widget-dependent string representation of the event location;    e.g. for `GtkTreeView`, a string representation of `GtkTreePath`
     * @param background_area background area as passed to gtk_cell_renderer_render()
     * @param cell_area cell area as passed to gtk_cell_renderer_render()
     * @param flags render flags
     * @return A new `GtkCellEditable` for editing this   &#64;cell, or %NULL if editing is not possible
    */
    public CellEditable startEditing(@Nullable ch.bailu.gtk.gdk.Event event, @Nonnull Widget widget, @Nonnull ch.bailu.gtk.type.Str path, @Nonnull ch.bailu.gtk.gdk.Rectangle background_area, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags)  {
        return new CellEditable(new PointerContainer(JnaCellRenderer.INST().gtk_cell_renderer_start_editing(asCPointer(), asCPointer(event), asCPointerNotNull(widget), asCPointerNotNull(path), asCPointerNotNull(background_area), asCPointerNotNull(cell_area), flags)));
    }

    /**
     * Starts editing the contents of this &#64;cell, through a new `GtkCellEditable`
     * <br>widget created by the `GtkCellRenderer`Class.start_editing virtual function.
     * @param event a `GdkEvent`
     * @param widget widget that received the event
     * @param path widget-dependent string representation of the event location;    e.g. for `GtkTreeView`, a string representation of `GtkTreePath`
     * @param background_area background area as passed to gtk_cell_renderer_render()
     * @param cell_area cell area as passed to gtk_cell_renderer_render()
     * @param flags render flags
     * @return A new `GtkCellEditable` for editing this   &#64;cell, or %NULL if editing is not possible
    */
    public CellEditable startEditing(@Nullable ch.bailu.gtk.gdk.Event event, @Nonnull Widget widget, String path, @Nonnull ch.bailu.gtk.gdk.Rectangle background_area, @Nonnull ch.bailu.gtk.gdk.Rectangle cell_area, int flags)  {
        return new CellEditable(new PointerContainer(JnaCellRenderer.INST().gtk_cell_renderer_start_editing(asCPointer(), asCPointer(event), asCPointerNotNull(widget), path, asCPointerNotNull(background_area), asCPointerNotNull(cell_area), flags)));
    }

    /**
     * Informs the cell renderer that the editing is stopped.
     * <br>If &#64;canceled is %TRUE, the cell renderer will emit the
     * <br>`GtkCellRenderer`::editing-canceled signal.
     * <br>
     * <br>This function should be called by cell renderer implementations
     * <br>in response to the `GtkCellEditable::editing-done` signal of
     * <br>`GtkCellEditable`.
     * @param canceled %TRUE if the editing has been canceled
    */
    public void stopEditing(boolean canceled)  {
        JnaCellRenderer.INST().gtk_cell_renderer_stop_editing(asCPointer(), canceled);
    }

    public final static String SIGNAL_ON_EDITING_CANCELED = "editing-canceled";
    
    /**
     * Connect to signal "editing-canceled".
     * <br>See {@link OnEditingCanceled#onEditingCanceled} for signal description.
     * <br>Field {@link #SIGNAL_ON_EDITING_CANCELED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEditingCanceled(OnEditingCanceled signal) {
        return connectSignal(SIGNAL_ON_EDITING_CANCELED, toOnEditingCanceled(signal));
    }

    public final static String SIGNAL_ON_EDITING_STARTED = "editing-started";
    
    /**
     * Connect to signal "editing-started".
     * <br>See {@link OnEditingStarted#onEditingStarted} for signal description.
     * <br>Field {@link #SIGNAL_ON_EDITING_STARTED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEditingStarted(OnEditingStarted signal) {
        return connectSignal(SIGNAL_ON_EDITING_STARTED, toOnEditingStarted(signal));
    }

    public static long getTypeID() { 
        return JnaCellRenderer.INST().gtk_cell_renderer_get_type(); 
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
