/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkShortcutAction` that calls gtk_widget_mnemonic_activate().
 * <p><a href="https://docs.gtk.org/gtk4/class.MnemonicAction.html">https://docs.gtk.org/gtk4/class.MnemonicAction.html</a></p>
*/
public class MnemonicAction extends ShortcutAction {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MnemonicAction.class.getCanonicalName());
    }

    public MnemonicAction(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the mnemonic action.
     * <br>
     * <br>This is an action that calls gtk_widget_mnemonic_activate()
     * <br>on the given widget upon activation.
     * @return The mnemonic action
    */
    public static MnemonicAction get()  {
        return new MnemonicAction(new PointerContainer(JnaMnemonicAction.INST().gtk_mnemonic_action_get()));
    }

    public static long getTypeID() { 
        return JnaMnemonicAction.INST().gtk_mnemonic_action_get_type(); 
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
