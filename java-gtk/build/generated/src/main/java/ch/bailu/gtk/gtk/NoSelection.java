/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkNoSelection` is a `GtkSelectionModel` that does not allow selecting
 * <br>anything.
 * <br>
 * <br>This model is meant to be used as a simple wrapper around a `GListModel`
 * <br>when a `GtkSelectionModel` is required.
 * <p><a href="https://docs.gtk.org/gtk4/class.NoSelection.html">https://docs.gtk.org/gtk4/class.NoSelection.html</a></p>
*/
public class NoSelection extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NoSelection.class.getCanonicalName());
    }

    public NoSelection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new selection to handle &#64;model.
     * @param model the `GListModel` to manage
    */
    public NoSelection(@Nullable ch.bailu.gtk.gio.ListModel model) {
        super(cast(JnaNoSelection.INST().gtk_no_selection_new(asCPointer(model))));
    }

    /**
     * Gets the model that &#64;self is wrapping.
     * @return The model being wrapped
    */
    public ch.bailu.gtk.gio.ListModel getModel()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaNoSelection.INST().gtk_no_selection_get_model(asCPointer())));
    }

    /**
     * Sets the model that &#64;self should wrap.
     * <br>
     * <br>If &#64;model is %NULL, this model will be empty.
     * @param model A `GListModel` to wrap
    */
    public void setModel(@Nullable ch.bailu.gtk.gio.ListModel model)  {
        JnaNoSelection.INST().gtk_no_selection_set_model(asCPointer(), asCPointer(model));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gio.ListModel}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gio.ListModel}
    */
    public ch.bailu.gtk.gio.ListModel asListModel() {
        return new ch.bailu.gtk.gio.ListModel(cast());
    }

    /**
     * Implements interface {@link SelectionModel}. Call this to get access to interface functions.
     * @return {@link SelectionModel}
    */
    public SelectionModel asSelectionModel() {
        return new SelectionModel(cast());
    }

    public static long getTypeID() { 
        return JnaNoSelection.INST().gtk_no_selection_get_type(); 
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
