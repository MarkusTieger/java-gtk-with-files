/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSliceListModel` is a list model that presents a slice of another model.
 * <br>
 * <br>This is useful when implementing paging by setting the size to the number
 * <br>of elements per page and updating the offset whenever a different page is
 * <br>opened.
 * <p><a href="https://docs.gtk.org/gtk4/class.SliceListModel.html">https://docs.gtk.org/gtk4/class.SliceListModel.html</a></p>
*/
public class SliceListModel extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SliceListModel.class.getCanonicalName());
    }

    public SliceListModel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new slice model.
     * <br>
     * <br>It presents the slice from &#64;offset to offset + &#64;size
     * <br>of the given &#64;model.
     * @param model The model to use
     * @param offset the offset of the slice
     * @param size maximum size of the slice
    */
    public SliceListModel(@Nullable ch.bailu.gtk.gio.ListModel model, int offset, int size) {
        super(cast(JnaSliceListModel.INST().gtk_slice_list_model_new(asCPointer(model), offset, size)));
    }

    /**
     * Gets the model that is currently being used or %NULL if none.
     * @return The model in use
    */
    public ch.bailu.gtk.gio.ListModel getModel()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaSliceListModel.INST().gtk_slice_list_model_get_model(asCPointer())));
    }

    /**
     * Gets the offset set via gtk_slice_list_model_set_offset().
     * @return The offset
    */
    public int getOffset()  {
        return JnaSliceListModel.INST().gtk_slice_list_model_get_offset(asCPointer());
    }

    /**
     * Gets the size set via gtk_slice_list_model_set_size().
     * @return The size
    */
    public int getSize()  {
        return JnaSliceListModel.INST().gtk_slice_list_model_get_size(asCPointer());
    }

    /**
     * Sets the model to show a slice of.
     * <br>
     * <br>The model's item type must conform to &#64;self's item type.
     * @param model The model to be sliced
    */
    public void setModel(@Nullable ch.bailu.gtk.gio.ListModel model)  {
        JnaSliceListModel.INST().gtk_slice_list_model_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Sets the offset into the original model for this slice.
     * <br>
     * <br>If the offset is too large for the sliced model,
     * <br>&#64;self will end up empty.
     * @param offset the new offset to use
    */
    public void setOffset(int offset)  {
        JnaSliceListModel.INST().gtk_slice_list_model_set_offset(asCPointer(), offset);
    }

    /**
     * Sets the maximum size. &#64;self will never have more items
     * <br>than &#64;size.
     * <br>
     * <br>It can however have fewer items if the offset is too large
     * <br>or the model sliced from doesn't have enough items.
     * @param size the maximum size
    */
    public void setSize(int size)  {
        JnaSliceListModel.INST().gtk_slice_list_model_set_size(asCPointer(), size);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    public static long getTypeID() { 
        return JnaSliceListModel.INST().gtk_slice_list_model_get_type(); 
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
