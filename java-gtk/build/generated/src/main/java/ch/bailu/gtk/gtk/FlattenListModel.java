/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkFlattenListModel` is a list model that concatenates other list models.
 * <br>
 * <br>`GtkFlattenListModel` takes a list model containing list models,
 * <br> and flattens it into a single model.
 * <p><a href="https://docs.gtk.org/gtk4/class.FlattenListModel.html">https://docs.gtk.org/gtk4/class.FlattenListModel.html</a></p>
*/
public class FlattenListModel extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FlattenListModel.class.getCanonicalName());
    }

    public FlattenListModel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkFlattenListModel` that flattens &#64;list.
     * @param model the model to be flattened
    */
    public FlattenListModel(@Nullable ch.bailu.gtk.gio.ListModel model) {
        super(cast(JnaFlattenListModel.INST().gtk_flatten_list_model_new(asCPointer(model))));
    }

    /**
     * Gets the model set via gtk_flatten_list_model_set_model().
     * @return The model flattened by &#64;self
    */
    public ch.bailu.gtk.gio.ListModel getModel()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaFlattenListModel.INST().gtk_flatten_list_model_get_model(asCPointer())));
    }

    /**
     * Returns the model containing the item at the given position.
     * @param position a position
     * @return the model containing the item at &#64;position
    */
    public ch.bailu.gtk.gio.ListModel getModelForItem(int position)  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaFlattenListModel.INST().gtk_flatten_list_model_get_model_for_item(asCPointer(), position)));
    }

    /**
     * Sets a new model to be flattened.
     * @param model the new model
    */
    public void setModel(@Nullable ch.bailu.gtk.gio.ListModel model)  {
        JnaFlattenListModel.INST().gtk_flatten_list_model_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    public static long getTypeID() { 
        return JnaFlattenListModel.INST().gtk_flatten_list_model_get_type(); 
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
