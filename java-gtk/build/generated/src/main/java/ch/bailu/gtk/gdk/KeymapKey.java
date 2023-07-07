/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkKeymapKey` is a hardware key that can be mapped to a keyval.
 * <p><a href="https://docs.gtk.org/gdk4/struct.KeymapKey.html">https://docs.gtk.org/gdk4/struct.KeymapKey.html</a></p>
*/
public class KeymapKey extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(KeymapKey.class.getCanonicalName());
    }

    public KeymapKey(PointerContainer pointer) {
        super(pointer);
    }

    public KeymapKey() {
        super(cast(JnaKeymapKey.allocateStructure()));
    }

    private JnaKeymapKey.Fields _fields;
    
    JnaKeymapKey.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaKeymapKey.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the hardware keycode. This is an identifying number for a
     * <br>  physical key.
    */
    public static final String KEYCODE = "keycode";

    /**
     * the hardware keycode. This is an identifying number for a
     * <br>  physical key.
    */
    public void setFieldKeycode(int keycode) {
        toFields().keycode = keycode;
        toFields().writeField(KEYCODE);
    }

    /**
     * the hardware keycode. This is an identifying number for a
     * <br>  physical key.
    */
    public int getFieldKeycode() {
       toFields().readField(KEYCODE);
       return toFields().keycode;
    } 

    /**
     * indicates movement in a horizontal direction. Usually groups are used
     * <br>  for two different languages. In group 0, a key might have two English
     * <br>  characters, and in group 1 it might have two Hebrew characters. The Hebrew
     * <br>  characters will be printed on the key next to the English characters.
    */
    public static final String GROUP = "group";

    /**
     * indicates movement in a horizontal direction. Usually groups are used
     * <br>  for two different languages. In group 0, a key might have two English
     * <br>  characters, and in group 1 it might have two Hebrew characters. The Hebrew
     * <br>  characters will be printed on the key next to the English characters.
    */
    public void setFieldGroup(int group) {
        toFields().group = group;
        toFields().writeField(GROUP);
    }

    /**
     * indicates movement in a horizontal direction. Usually groups are used
     * <br>  for two different languages. In group 0, a key might have two English
     * <br>  characters, and in group 1 it might have two Hebrew characters. The Hebrew
     * <br>  characters will be printed on the key next to the English characters.
    */
    public int getFieldGroup() {
       toFields().readField(GROUP);
       return toFields().group;
    } 

    /**
     * indicates which symbol on the key will be used, in a vertical direction.
     * <br>  So on a standard US keyboard, the key with the number “1” on it also has the
     * <br>  exclamation point (&quot;!&quot;) character on it. The level indicates whether to use
     * <br>  the “1” or the “!” symbol. The letter keys are considered to have a lowercase
     * <br>  letter at level 0, and an uppercase letter at level 1, though only the
     * <br>  uppercase letter is printed.
    */
    public static final String LEVEL = "level";

    /**
     * indicates which symbol on the key will be used, in a vertical direction.
     * <br>  So on a standard US keyboard, the key with the number “1” on it also has the
     * <br>  exclamation point (&quot;!&quot;) character on it. The level indicates whether to use
     * <br>  the “1” or the “!” symbol. The letter keys are considered to have a lowercase
     * <br>  letter at level 0, and an uppercase letter at level 1, though only the
     * <br>  uppercase letter is printed.
    */
    public void setFieldLevel(int level) {
        toFields().level = level;
        toFields().writeField(LEVEL);
    }

    /**
     * indicates which symbol on the key will be used, in a vertical direction.
     * <br>  So on a standard US keyboard, the key with the number “1” on it also has the
     * <br>  exclamation point (&quot;!&quot;) character on it. The level indicates whether to use
     * <br>  the “1” or the “!” symbol. The letter keys are considered to have a lowercase
     * <br>  letter at level 0, and an uppercase letter at level 1, though only the
     * <br>  uppercase letter is printed.
    */
    public int getFieldLevel() {
       toFields().readField(LEVEL);
       return toFields().level;
    } 

}

/*
record-type
all-fields-supported
*/
