/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkShortcutTrigger` that never triggers.
 * <p><a href="https://docs.gtk.org/gtk4/class.NeverTrigger.html">https://docs.gtk.org/gtk4/class.NeverTrigger.html</a></p>
*/
public class NeverTrigger extends ShortcutTrigger {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(NeverTrigger.class.getCanonicalName());
    }

    public NeverTrigger(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the never trigger.
     * <br>
     * <br>This is a singleton for a trigger that never triggers.
     * <br>Use this trigger instead of %NULL because it implements
     * <br>all virtual functions.
     * @return The never trigger
    */
    public static NeverTrigger get()  {
        return new NeverTrigger(new PointerContainer(JnaNeverTrigger.INST().gtk_never_trigger_get()));
    }

    public static long getTypeID() { 
        return JnaNeverTrigger.INST().gtk_never_trigger_get_type(); 
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
