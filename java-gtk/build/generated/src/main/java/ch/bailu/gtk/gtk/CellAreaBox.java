/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A cell area that renders GtkCellRenderers into a row or a column
 * <br>
 * <br>The `GtkCellAreaBox` renders cell renderers into a row or a column
 * <br>depending on its `GtkOrientation`.
 * <br>
 * <br>GtkCellAreaBox uses a notion of packing. Packing
 * <br>refers to adding cell renderers with reference to a particular position
 * <br>in a `GtkCellAreaBox`. There are two reference positions: the
 * <br>start and the end of the box.
 * <br>When the `GtkCellAreaBox` is oriented in the %GTK_ORIENTATION_VERTICAL
 * <br>orientation, the start is defined as the top of the box and the end is
 * <br>defined as the bottom. In the %GTK_ORIENTATION_HORIZONTAL orientation
 * <br>start is defined as the left side and the end is defined as the right
 * <br>side.
 * <br>
 * <br>Alignments of `GtkCellRenderer`s rendered in adjacent rows can be
 * <br>configured by configuring the `GtkCellAreaBox` align child cell property
 * <br>with gtk_cell_area_cell_set_property() or by specifying the &quot;align&quot;
 * <br>argument to gtk_cell_area_box_pack_start() and gtk_cell_area_box_pack_end().
 * <p><a href="https://docs.gtk.org/gtk4/class.CellAreaBox.html">https://docs.gtk.org/gtk4/class.CellAreaBox.html</a></p>
*/
public class CellAreaBox extends CellArea {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellAreaBox.class.getCanonicalName());
    }

    public CellAreaBox(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkCellAreaBox`.
    */
    public CellAreaBox() {
        super(cast(JnaCellAreaBox.INST().gtk_cell_area_box_new()));
    }

    /**
     * Gets the spacing added between cell renderers.
     * @return the space added between cell renderers in &#64;box.
    */
    public int getSpacing()  {
        return JnaCellAreaBox.INST().gtk_cell_area_box_get_spacing(asCPointer());
    }

    /**
     * Adds &#64;renderer to &#64;box, packed with reference to the end of &#64;box.
     * <br>
     * <br>The &#64;renderer is packed after (away from end of) any other
     * <br>`GtkCellRenderer` packed with reference to the end of &#64;box.
     * @param renderer the `GtkCellRenderer` to add
     * @param expand whether &#64;renderer should receive extra space when the area receives more than its natural size
     * @param align whether &#64;renderer should be aligned in adjacent rows
     * @param fixed whether &#64;renderer should have the same size in all rows
    */
    public void packEnd(@Nonnull CellRenderer renderer, boolean expand, boolean align, boolean fixed)  {
        JnaCellAreaBox.INST().gtk_cell_area_box_pack_end(asCPointer(), asCPointerNotNull(renderer), expand, align, fixed);
    }

    /**
     * Adds &#64;renderer to &#64;box, packed with reference to the start of &#64;box.
     * <br>
     * <br>The &#64;renderer is packed after any other `GtkCellRenderer` packed
     * <br>with reference to the start of &#64;box.
     * @param renderer the `GtkCellRenderer` to add
     * @param expand whether &#64;renderer should receive extra space when the area receives more than its natural size
     * @param align whether &#64;renderer should be aligned in adjacent rows
     * @param fixed whether &#64;renderer should have the same size in all rows
    */
    public void packStart(@Nonnull CellRenderer renderer, boolean expand, boolean align, boolean fixed)  {
        JnaCellAreaBox.INST().gtk_cell_area_box_pack_start(asCPointer(), asCPointerNotNull(renderer), expand, align, fixed);
    }

    /**
     * Sets the spacing to add between cell renderers in &#64;box.
     * @param spacing the space to add between `GtkCellRenderer`s
    */
    public void setSpacing(int spacing)  {
        JnaCellAreaBox.INST().gtk_cell_area_box_set_spacing(asCPointer(), spacing);
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

    /**
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaCellAreaBox.INST().gtk_cell_area_box_get_type(); 
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
