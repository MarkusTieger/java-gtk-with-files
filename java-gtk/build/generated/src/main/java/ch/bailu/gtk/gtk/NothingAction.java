/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkShortcutAction` that does nothing.
 * <p><a href="https://docs.gtk.org/gtk4/class.NothingAction.html">https://docs.gtk.org/gtk4/class.NothingAction.html</a></p>
*/
public class NothingAction extends ShortcutAction {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NothingAction.class.getCanonicalName());
    }

    public NothingAction(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the nothing action.
     * <br>
     * <br>This is an action that does nothing and where
     * <br>activating it always fails.
     * @return The nothing action
    */
    public static NothingAction get()  {
        return new NothingAction(new PointerContainer(JnaNothingAction.INST().gtk_nothing_action_get()));
    }

    public static long getTypeID() { 
        return JnaNothingAction.INST().gtk_nothing_action_get_type(); 
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
