/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Renders a toggle button in a cell
 * <br>
 * <br>`GtkCellRendererToggle` renders a toggle button in a cell. The
 * <br>button is drawn as a radio or a checkbutton, depending on the
 * <br>`GtkCellRendererToggle:radio` property.
 * <br>When activated, it emits the `GtkCellRendererToggle::toggled` signal.
 * <p><a href="https://docs.gtk.org/gtk4/class.CellRendererToggle.html">https://docs.gtk.org/gtk4/class.CellRendererToggle.html</a></p>
*/
public class CellRendererToggle extends CellRenderer {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellRendererToggle.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnToggled {
        /**
         * The ::toggled signal is emitted when the cell is toggled.
         * <br>
         * <br>It is the responsibility of the application to update the model
         * <br>with the correct value to store at &#64;path.  Often this is simply the
         * <br>opposite of the value currently stored at &#64;path.
         * @param path string representation of `GtkTreePath` describing the        event location
        */
        void onToggled(@Nonnull ch.bailu.gtk.type.Str path);
    }
    
    private static com.sun.jna.Callback toOnToggled(OnToggled in) {
        return (in == null) ? null: (JnaCellRendererToggle.OnToggled) (__self, _path, __data) -> in.onToggled(new ch.bailu.gtk.type.Str(new PointerContainer(_path)));
    }

    public CellRendererToggle(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkCellRendererToggle`. Adjust rendering
     * <br>parameters using object properties. Object properties can be set
     * <br>globally (with g_object_set()). Also, with `GtkTreeViewColumn`, you
     * <br>can bind a property to a value in a `GtkTreeModel`. For example, you
     * <br>can bind the “active” property on the cell renderer to a boolean value
     * <br>in the model, thus causing the check button to reflect the state of
     * <br>the model.
    */
    public CellRendererToggle() {
        super(cast(JnaCellRendererToggle.INST().gtk_cell_renderer_toggle_new()));
    }

    /**
     * Returns whether the cell renderer is activatable. See
     * <br>gtk_cell_renderer_toggle_set_activatable().
     * @return %TRUE if the cell renderer is activatable.
    */
    public boolean getActivatable()  {
        return JnaCellRendererToggle.INST().gtk_cell_renderer_toggle_get_activatable(asCPointer());
    }

    /**
     * Returns whether the cell renderer is active. See
     * <br>gtk_cell_renderer_toggle_set_active().
     * @return %TRUE if the cell renderer is active.
    */
    public boolean getActive()  {
        return JnaCellRendererToggle.INST().gtk_cell_renderer_toggle_get_active(asCPointer());
    }

    /**
     * Returns whether we’re rendering radio toggles rather than checkboxes.
     * @return %TRUE if we’re rendering radio toggles rather than checkboxes
    */
    public boolean getRadio()  {
        return JnaCellRendererToggle.INST().gtk_cell_renderer_toggle_get_radio(asCPointer());
    }

    /**
     * Makes the cell renderer activatable.
     * @param setting the value to set.
    */
    public void setActivatable(boolean setting)  {
        JnaCellRendererToggle.INST().gtk_cell_renderer_toggle_set_activatable(asCPointer(), setting);
    }

    /**
     * Activates or deactivates a cell renderer.
     * @param setting the value to set.
    */
    public void setActive(boolean setting)  {
        JnaCellRendererToggle.INST().gtk_cell_renderer_toggle_set_active(asCPointer(), setting);
    }

    /**
     * If &#64;radio is %TRUE, the cell renderer renders a radio toggle
     * <br>(i.e. a toggle in a group of mutually-exclusive toggles).
     * <br>If %FALSE, it renders a check toggle (a standalone boolean option).
     * <br>This can be set globally for the cell renderer, or changed just
     * <br>before rendering each cell in the model (for `GtkTreeView`, you set
     * <br>up a per-row setting using `GtkTreeViewColumn` to associate model
     * <br>columns with cell renderer properties).
     * @param radio %TRUE to make the toggle look like a radio button
    */
    public void setRadio(boolean radio)  {
        JnaCellRendererToggle.INST().gtk_cell_renderer_toggle_set_radio(asCPointer(), radio);
    }

    public final static String SIGNAL_ON_TOGGLED = "toggled";
    
    /**
     * Connect to signal "toggled".
     * <br>See {@link OnToggled#onToggled} for signal description.
     * <br>Field {@link #SIGNAL_ON_TOGGLED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onToggled(OnToggled signal) {
        return connectSignal(SIGNAL_ON_TOGGLED, toOnToggled(signal));
    }

    public static long getTypeID() { 
        return JnaCellRendererToggle.INST().gtk_cell_renderer_toggle_get_type(); 
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
