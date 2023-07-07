/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkShortcutTrigger` that triggers when a specific mnemonic is pressed.
 * <br>
 * <br>Mnemonics require a *mnemonic modifier* (typically &lt;kbd&gt;Alt&lt;/kbd&gt;) to be
 * <br>pressed together with the mnemonic key.
 * <p><a href="https://docs.gtk.org/gtk4/class.MnemonicTrigger.html">https://docs.gtk.org/gtk4/class.MnemonicTrigger.html</a></p>
*/
public class MnemonicTrigger extends ShortcutTrigger {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MnemonicTrigger.class.getCanonicalName());
    }

    public MnemonicTrigger(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GtkShortcutTrigger` that will trigger whenever the key with
     * <br>the given &#64;keyval is pressed and mnemonics have been activated.
     * <br>
     * <br>Mnemonics are activated by calling code when a key event with the right
     * <br>modifiers is detected.
     * @param keyval The keyval to trigger for
    */
    public MnemonicTrigger(int keyval) {
        super(cast(JnaMnemonicTrigger.INST().gtk_mnemonic_trigger_new(keyval)));
    }

    /**
     * Gets the keyval that must be pressed to succeed triggering &#64;self.
     * @return the keyval
    */
    public int getKeyval()  {
        return JnaMnemonicTrigger.INST().gtk_mnemonic_trigger_get_keyval(asCPointer());
    }

    public static long getTypeID() { 
        return JnaMnemonicTrigger.INST().gtk_mnemonic_trigger_get_type(); 
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
