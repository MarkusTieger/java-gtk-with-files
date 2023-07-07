/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSelectionFilterModel` is a list model that presents the selection from
 * <br>a `GtkSelectionModel`.
 * <p><a href="https://docs.gtk.org/gtk4/class.SelectionFilterModel.html">https://docs.gtk.org/gtk4/class.SelectionFilterModel.html</a></p>
*/
public class SelectionFilterModel extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SelectionFilterModel.class.getCanonicalName());
    }

    public SelectionFilterModel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkSelectionFilterModel` that will include the
     * <br>selected items from the underlying selection model.
     * @param model the selection model to filter
    */
    public SelectionFilterModel(@Nullable SelectionModel model) {
        super(cast(JnaSelectionFilterModel.INST().gtk_selection_filter_model_new(asCPointer(model))));
    }

    /**
     * Gets the model currently filtered or %NULL if none.
     * @return The model that gets filtered
    */
    public SelectionModel getModel()  {
        return new SelectionModel(new PointerContainer(JnaSelectionFilterModel.INST().gtk_selection_filter_model_get_model(asCPointer())));
    }

    /**
     * Sets the model to be filtered.
     * <br>
     * <br>Note that GTK makes no effort to ensure that &#64;model conforms to
     * <br>the item type of &#64;self. It assumes that the caller knows what they
     * <br>are doing and have set up an appropriate filter to ensure that item
     * <br>types match.
     * @param model The model to be filtered
    */
    public void setModel(@Nullable SelectionModel model)  {
        JnaSelectionFilterModel.INST().gtk_selection_filter_model_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    public static long getTypeID() { 
        return JnaSelectionFilterModel.INST().gtk_selection_filter_model_get_type(); 
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
