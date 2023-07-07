/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Renders a keyboard accelerator in a cell
 * <br>
 * <br>`GtkCellRendererAccel` displays a keyboard accelerator (i.e. a key
 * <br>combination like `Control + a`). If the cell renderer is editable,
 * <br>the accelerator can be changed by simply typing the new combination.
 * <p><a href="https://docs.gtk.org/gtk4/class.CellRendererAccel.html">https://docs.gtk.org/gtk4/class.CellRendererAccel.html</a></p>
*/
public class CellRendererAccel extends CellRendererText {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellRendererAccel.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAccelCleared {
        /**
         * Gets emitted when the user has removed the accelerator.
         * @param path_string the path identifying the row of the edited cell
        */
        void onAccelCleared(@Nonnull ch.bailu.gtk.type.Str path_string);
    }
    
    private static com.sun.jna.Callback toOnAccelCleared(OnAccelCleared in) {
        return (in == null) ? null: (JnaCellRendererAccel.OnAccelCleared) (__self, _path_string, __data) -> in.onAccelCleared(new ch.bailu.gtk.type.Str(new PointerContainer(_path_string)));
    }

    @FunctionalInterface
    public interface OnAccelEdited {
        /**
         * Gets emitted when the user has selected a new accelerator.
         * @param path_string the path identifying the row of the edited cell
         * @param accel_key the new accelerator keyval
         * @param accel_mods the new acclerator modifier mask
         * @param hardware_keycode the keycode of the new accelerator
        */
        void onAccelEdited(@Nonnull ch.bailu.gtk.type.Str path_string, int accel_key, int accel_mods, int hardware_keycode);
    }
    
    private static com.sun.jna.Callback toOnAccelEdited(OnAccelEdited in) {
        return (in == null) ? null: (JnaCellRendererAccel.OnAccelEdited) (__self, _path_string, _accel_key, _accel_mods, _hardware_keycode, __data) -> in.onAccelEdited(new ch.bailu.gtk.type.Str(new PointerContainer(_path_string)), _accel_key, _accel_mods, _hardware_keycode);
    }

    public CellRendererAccel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkCellRendererAccel`.
    */
    public CellRendererAccel() {
        super(cast(JnaCellRendererAccel.INST().gtk_cell_renderer_accel_new()));
    }

    public final static String SIGNAL_ON_ACCEL_CLEARED = "accel-cleared";
    
    /**
     * Connect to signal "accel-cleared".
     * <br>See {@link OnAccelCleared#onAccelCleared} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACCEL_CLEARED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAccelCleared(OnAccelCleared signal) {
        return connectSignal(SIGNAL_ON_ACCEL_CLEARED, toOnAccelCleared(signal));
    }

    public final static String SIGNAL_ON_ACCEL_EDITED = "accel-edited";
    
    /**
     * Connect to signal "accel-edited".
     * <br>See {@link OnAccelEdited#onAccelEdited} for signal description.
     * <br>Field {@link #SIGNAL_ON_ACCEL_EDITED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAccelEdited(OnAccelEdited signal) {
        return connectSignal(SIGNAL_ON_ACCEL_EDITED, toOnAccelEdited(signal));
    }

    public static long getTypeID() { 
        return JnaCellRendererAccel.INST().gtk_cell_renderer_accel_get_type(); 
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
