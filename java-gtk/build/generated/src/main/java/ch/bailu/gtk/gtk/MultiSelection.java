/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkMultiSelection` is a `GtkSelectionModel` that allows selecting multiple
 * <br>elements.
 * <p><a href="https://docs.gtk.org/gtk4/class.MultiSelection.html">https://docs.gtk.org/gtk4/class.MultiSelection.html</a></p>
*/
public class MultiSelection extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MultiSelection.class.getCanonicalName());
    }

    public MultiSelection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new selection to handle &#64;model.
     * @param model the `GListModel` to manage
    */
    public MultiSelection(@Nullable ch.bailu.gtk.gio.ListModel model) {
        super(cast(JnaMultiSelection.INST().gtk_multi_selection_new(asCPointer(model))));
    }

    /**
     * Returns the underlying model of &#64;self.
     * @return the underlying model
    */
    public ch.bailu.gtk.gio.ListModel getModel()  {
        return new ch.bailu.gtk.gio.ListModel(new PointerContainer(JnaMultiSelection.INST().gtk_multi_selection_get_model(asCPointer())));
    }

    /**
     * Sets the model that &#64;self should wrap.
     * <br>
     * <br>If &#64;model is %NULL, &#64;self will be empty.
     * @param model A `GListModel` to wrap
    */
    public void setModel(@Nullable ch.bailu.gtk.gio.ListModel model)  {
        JnaMultiSelection.INST().gtk_multi_selection_set_model(asCPointer(), asCPointer(model));
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
        return JnaMultiSelection.INST().gtk_multi_selection_get_type(); 
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
