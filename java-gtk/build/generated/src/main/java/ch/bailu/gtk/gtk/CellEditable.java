/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Interface for widgets that can be used for editing cells
 * <br>
 * <br>The `GtkCellEditable` interface must be implemented for widgets to be usable
 * <br>to edit the contents of a `GtkTreeView` cell. It provides a way to specify how
 * <br>temporary widgets should be configured for editing, get the new value, etc.
 * <p><a href="https://docs.gtk.org/gtk4/iface.CellEditable.html">https://docs.gtk.org/gtk4/iface.CellEditable.html</a></p>
*/
public class CellEditable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellEditable.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnEditingDone {
        /**
         * This signal is a sign for the cell renderer to update its
         * <br>value from the &#64;cell_editable.
         * <br>
         * <br>Implementations of `GtkCellEditable` are responsible for
         * <br>emitting this signal when they are done editing, e.g.
         * <br>`GtkEntry` emits this signal when the user presses Enter. Typical things to
         * <br>do in a handler for ::editing-done are to capture the edited value,
         * <br>disconnect the &#64;cell_editable from signals on the `GtkCellRenderer`, etc.
         * <br>
         * <br>gtk_cell_editable_editing_done() is a convenience method
         * <br>for emitting `GtkCellEditable::editing-done`.
        */
        void onEditingDone();
    }
    
    private static com.sun.jna.Callback toOnEditingDone(OnEditingDone in) {
        return (in == null) ? null: (JnaCellEditable.OnEditingDone) (__self, __data) -> in.onEditingDone();
    }

    @FunctionalInterface
    public interface OnRemoveWidget {
        /**
         * This signal is meant to indicate that the cell is finished
         * <br>editing, and the &#64;cell_editable widget is being removed and may
         * <br>subsequently be destroyed.
         * <br>
         * <br>Implementations of `GtkCellEditable` are responsible for
         * <br>emitting this signal when they are done editing. It must
         * <br>be emitted after the `GtkCellEditable::editing-done` signal,
         * <br>to give the cell renderer a chance to update the cell's value
         * <br>before the widget is removed.
         * <br>
         * <br>gtk_cell_editable_remove_widget() is a convenience method
         * <br>for emitting `GtkCellEditable::remove-widget`.
        */
        void onRemoveWidget();
    }
    
    private static com.sun.jna.Callback toOnRemoveWidget(OnRemoveWidget in) {
        return (in == null) ? null: (JnaCellEditable.OnRemoveWidget) (__self, __data) -> in.onRemoveWidget();
    }

    public CellEditable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Emits the `GtkCellEditable::editing-done` signal.
    */
    public void editingDone()  {
        JnaCellEditable.INST().gtk_cell_editable_editing_done(asCPointer());
    }

    /**
     * Emits the `GtkCellEditable::remove-widget` signal.
    */
    public void removeWidget()  {
        JnaCellEditable.INST().gtk_cell_editable_remove_widget(asCPointer());
    }

    /**
     * Begins editing on a &#64;cell_editable.
     * <br>
     * <br>The `GtkCellRenderer` for the cell creates and returns a `GtkCellEditable` from
     * <br>gtk_cell_renderer_start_editing(), configured for the `GtkCellRenderer` type.
     * <br>
     * <br>gtk_cell_editable_start_editing() can then set up &#64;cell_editable suitably for
     * <br>editing a cell, e.g. making the Esc key emit `GtkCellEditable::editing-done`.
     * <br>
     * <br>Note that the &#64;cell_editable is created on-demand for the current edit; its
     * <br>lifetime is temporary and does not persist across other edits and/or cells.
     * @param event The `GdkEvent` that began the editing process, or   %NULL if editing was initiated programmatically
    */
    public void startEditing(@Nullable ch.bailu.gtk.gdk.Event event)  {
        JnaCellEditable.INST().gtk_cell_editable_start_editing(asCPointer(), asCPointer(event));
    }

    public final static String SIGNAL_ON_EDITING_DONE = "editing-done";
    
    /**
     * Connect to signal "editing-done".
     * <br>See {@link OnEditingDone#onEditingDone} for signal description.
     * <br>Field {@link #SIGNAL_ON_EDITING_DONE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEditingDone(OnEditingDone signal) {
        return connectSignal(SIGNAL_ON_EDITING_DONE, toOnEditingDone(signal));
    }

    public final static String SIGNAL_ON_REMOVE_WIDGET = "remove-widget";
    
    /**
     * Connect to signal "remove-widget".
     * <br>See {@link OnRemoveWidget#onRemoveWidget} for signal description.
     * <br>Field {@link #SIGNAL_ON_REMOVE_WIDGET} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRemoveWidget(OnRemoveWidget signal) {
        return connectSignal(SIGNAL_ON_REMOVE_WIDGET, toOnRemoveWidget(signal));
    }

    public static long getTypeID() { 
        return JnaCellEditable.INST().gtk_cell_editable_get_type(); 
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
