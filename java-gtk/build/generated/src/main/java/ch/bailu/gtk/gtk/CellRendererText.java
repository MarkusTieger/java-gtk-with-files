/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Renders text in a cell
 * <br>
 * <br>A `GtkCellRendererText` renders a given text in its cell, using the font, color and
 * <br>style information provided by its properties. The text will be ellipsized if it is
 * <br>too long and the `GtkCellRendererText:ellipsize` property allows it.
 * <br>
 * <br>If the `GtkCellRenderer:mode` is %GTK_CELL_RENDERER_MODE_EDITABLE,
 * <br>the `GtkCellRendererText` allows to edit its text using an entry.
 * <p><a href="https://docs.gtk.org/gtk4/class.CellRendererText.html">https://docs.gtk.org/gtk4/class.CellRendererText.html</a></p>
*/
public class CellRendererText extends CellRenderer {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellRendererText.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnEdited {
        /**
         * This signal is emitted after &#64;renderer has been edited.
         * <br>
         * <br>It is the responsibility of the application to update the model
         * <br>and store &#64;new_text at the position indicated by &#64;path.
         * @param path the path identifying the edited cell
         * @param new_text the new text
        */
        void onEdited(@Nonnull ch.bailu.gtk.type.Str path, @Nonnull ch.bailu.gtk.type.Str new_text);
    }
    
    private static com.sun.jna.Callback toOnEdited(OnEdited in) {
        return (in == null) ? null: (JnaCellRendererText.OnEdited) (__self, _path, _new_text, __data) -> in.onEdited(new ch.bailu.gtk.type.Str(new PointerContainer(_path)), new ch.bailu.gtk.type.Str(new PointerContainer(_new_text)));
    }

    public CellRendererText(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkCellRendererText`. Adjust how text is drawn using
     * <br>object properties. Object properties can be
     * <br>set globally (with g_object_set()). Also, with `GtkTreeViewColumn`,
     * <br>you can bind a property to a value in a `GtkTreeModel`. For example,
     * <br>you can bind the “text” property on the cell renderer to a string
     * <br>value in the model, thus rendering a different string in each row
     * <br>of the `GtkTreeView`.
    */
    public CellRendererText() {
        super(cast(JnaCellRendererText.INST().gtk_cell_renderer_text_new()));
    }

    /**
     * Sets the height of a renderer to explicitly be determined by the “font” and
     * <br>“y_pad” property set on it.  Further changes in these properties do not
     * <br>affect the height, so they must be accompanied by a subsequent call to this
     * <br>function.  Using this function is inflexible, and should really only be used
     * <br>if calculating the size of a cell is too slow (ie, a massive number of cells
     * <br>displayed).  If &#64;number_of_rows is -1, then the fixed height is unset, and
     * <br>the height is determined by the properties again.
     * @param number_of_rows Number of rows of text each cell renderer is allocated, or -1
    */
    public void setFixedHeightFromFont(int number_of_rows)  {
        JnaCellRendererText.INST().gtk_cell_renderer_text_set_fixed_height_from_font(asCPointer(), number_of_rows);
    }

    public final static String SIGNAL_ON_EDITED = "edited";
    
    /**
     * Connect to signal "edited".
     * <br>See {@link OnEdited#onEdited} for signal description.
     * <br>Field {@link #SIGNAL_ON_EDITED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEdited(OnEdited signal) {
        return connectSignal(SIGNAL_ON_EDITED, toOnEdited(signal));
    }

    public static long getTypeID() { 
        return JnaCellRendererText.INST().gtk_cell_renderer_text_get_type(); 
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
