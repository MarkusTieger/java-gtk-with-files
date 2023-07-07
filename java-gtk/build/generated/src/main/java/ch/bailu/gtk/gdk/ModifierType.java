/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface ModifierType {

    /**
     * the Shift key.
    */
    int SHIFT_MASK = 1;

    /**
     * a Lock key (depending on the modifier mapping of the
     * <br> X server this may either be CapsLock or ShiftLock).
    */
    int LOCK_MASK = 2;

    /**
     * the Control key.
    */
    int CONTROL_MASK = 4;

    /**
     * the fourth modifier key (it depends on the modifier
     * <br> mapping of the X server which key is interpreted as this modifier, but
     * <br> normally it is the Alt key).
    */
    int ALT_MASK = 8;

    /**
     * the first mouse button.
    */
    int BUTTON1_MASK = 256;

    /**
     * the second mouse button.
    */
    int BUTTON2_MASK = 512;

    /**
     * the third mouse button.
    */
    int BUTTON3_MASK = 1024;

    /**
     * the fourth mouse button.
    */
    int BUTTON4_MASK = 2048;

    /**
     * the fifth mouse button.
    */
    int BUTTON5_MASK = 4096;

    /**
     * the Super modifier
    */
    int SUPER_MASK = 67108864;

    /**
     * the Hyper modifier
    */
    int HYPER_MASK = 134217728;

    /**
     * the Meta modifier
    */
    int META_MASK = 268435456;

}

/*
enumeration-type
*/
