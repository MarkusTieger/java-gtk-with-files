/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Renders a combobox in a cell
 * <br>
 * <br>`GtkCellRendererCombo` renders text in a cell like `GtkCellRendererText` from
 * <br>which it is derived. But while `GtkCellRendererText` offers a simple entry to
 * <br>edit the text, `GtkCellRendererCombo` offers a `GtkComboBox`
 * <br>widget to edit the text. The values to display in the combo box are taken from
 * <br>the tree model specified in the `GtkCellRendererCombo`:model property.
 * <br>
 * <br>The combo cell renderer takes care of adding a text cell renderer to the combo
 * <br>box and sets it to display the column specified by its
 * <br>`GtkCellRendererCombo`:text-column property. Further properties of the combo box
 * <br>can be set in a handler for the `GtkCellRenderer::editing-started` signal.
 * <p><a href="https://docs.gtk.org/gtk4/class.CellRendererCombo.html">https://docs.gtk.org/gtk4/class.CellRendererCombo.html</a></p>
*/
public class CellRendererCombo extends CellRendererText {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellRendererCombo.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * This signal is emitted each time after the user selected an item in
         * <br>the combo box, either by using the mouse or the arrow keys.  Contrary
         * <br>to GtkComboBox, GtkCellRendererCombo::changed is not emitted for
         * <br>changes made to a selected item in the entry.  The argument &#64;new_iter
         * <br>corresponds to the newly selected item in the combo box and it is relative
         * <br>to the GtkTreeModel set via the model property on GtkCellRendererCombo.
         * <br>
         * <br>Note that as soon as you change the model displayed in the tree view,
         * <br>the tree view will immediately cease the editing operating.  This
         * <br>means that you most probably want to refrain from changing the model
         * <br>until the combo cell renderer emits the edited or editing_canceled signal.
         * @param path_string a string of the path identifying the edited cell               (relative to the tree view model)
         * @param new_iter the new iter selected in the combo box            (relative to the combo box model)
        */
        void onChanged(@Nonnull ch.bailu.gtk.type.Str path_string, @Nonnull TreeIter new_iter);
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaCellRendererCombo.OnChanged) (__self, _path_string, _new_iter, __data) -> in.onChanged(new ch.bailu.gtk.type.Str(new PointerContainer(_path_string)), new TreeIter(new PointerContainer(_new_iter)));
    }

    public CellRendererCombo(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkCellRendererCombo`.
     * <br>Adjust how text is drawn using object properties.
     * <br>Object properties can be set globally (with g_object_set()).
     * <br>Also, with `GtkTreeViewColumn`, you can bind a property to a value
     * <br>in a `GtkTreeModel`. For example, you can bind the “text” property
     * <br>on the cell renderer to a string value in the model, thus rendering
     * <br>a different string in each row of the `GtkTreeView`.
    */
    public CellRendererCombo() {
        super(cast(JnaCellRendererCombo.INST().gtk_cell_renderer_combo_new()));
    }

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
    }

    public static long getTypeID() { 
        return JnaCellRendererCombo.INST().gtk_cell_renderer_combo_get_type(); 
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
