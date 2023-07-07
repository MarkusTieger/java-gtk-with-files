/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkShortcutTrigger` that triggers when a specific keyval and modifiers are pressed.
 * <p><a href="https://docs.gtk.org/gtk4/class.KeyvalTrigger.html">https://docs.gtk.org/gtk4/class.KeyvalTrigger.html</a></p>
*/
public class KeyvalTrigger extends ShortcutTrigger {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(KeyvalTrigger.class.getCanonicalName());
    }

    public KeyvalTrigger(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkShortcutTrigger` that will trigger whenever
     * <br>the key with the given &#64;keyval and &#64;modifiers is pressed.
     * @param keyval The keyval to trigger for
     * @param modifiers the modifiers that need to be present
    */
    public KeyvalTrigger(int keyval, int modifiers) {
        super(cast(JnaKeyvalTrigger.INST().gtk_keyval_trigger_new(keyval, modifiers)));
    }

    /**
     * Gets the keyval that must be pressed to succeed
     * <br>triggering &#64;self.
     * @return the keyval
    */
    public int getKeyval()  {
        return JnaKeyvalTrigger.INST().gtk_keyval_trigger_get_keyval(asCPointer());
    }

    /**
     * Gets the modifiers that must be present to succeed
     * <br>triggering &#64;self.
     * @return the modifiers
    */
    public int getModifiers()  {
        return JnaKeyvalTrigger.INST().gtk_keyval_trigger_get_modifiers(asCPointer());
    }

    public static long getTypeID() { 
        return JnaKeyvalTrigger.INST().gtk_keyval_trigger_get_type(); 
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
